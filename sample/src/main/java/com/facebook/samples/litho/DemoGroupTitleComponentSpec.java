/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.facebook.samples.litho;

import static com.facebook.yoga.YogaEdge.ALL;

import android.graphics.Color;
import android.graphics.Typeface;
import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Text;

@LayoutSpec
public class DemoGroupTitleComponentSpec {

  @OnCreateLayout
  static Component onCreateLayout(ComponentContext c, @Prop String title) {
    return Column.create(c)
        .child(
            Text.create(c)
                .paddingDip(ALL, 8)
                .text(title)
                .textSizeSp(18)
                .textStyle(Typeface.BOLD)
                .backgroundRes(R.color.colorPrimaryLightBg)
                .build())
        .child(Column.create(c).heightPx(1).backgroundColor(Color.BLACK))
        .build();
  }
}