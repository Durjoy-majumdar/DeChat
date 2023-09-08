package com.tencent.p014mm.plugin.game.media;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc0.C20828a;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import vw1.C53008c0;

/* renamed from: com.tencent.mm.plugin.game.media.GameVideoTagContainer */
public class GameVideoTagContainer extends LinearLayout {
    public GameVideoTagContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setData(LinkedList<C53008c0> linkedList) {
        if (Util.isNullOrNil((List) linkedList)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        while (getChildCount() < linkedList.size()) {
            ImageView imageView = new ImageView(getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.height = C74942w4.m89784a(getContext(), 14);
            layoutParams.rightMargin = C74942w4.m89784a(getContext(), 4);
            imageView.setLayoutParams(layoutParams);
            addView(imageView);
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/GameVideoTagContainer", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(childAt, "com/tencent/mm/plugin/game/media/GameVideoTagContainer", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        for (int i2 = 0; i2 < linkedList.size(); i2++) {
            C53008c0 c0Var = linkedList.get(i2);
            ImageView imageView2 = (ImageView) getChildAt(i2);
            ((LinearLayout.LayoutParams) imageView2.getLayoutParams()).width = C74942w4.m89784a(getContext(), c0Var.f147924f);
            C20828a.m22825b().mo32518g(c0Var.f147923e, imageView2);
            imageView2.setVisibility(0);
        }
    }

    public GameVideoTagContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
