package com.tencent.p014mm.plugin.game.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import uy1.C52645f;

/* renamed from: com.tencent.mm.plugin.game.widget.GameSmallAvatarList */
public class GameSmallAvatarList extends LinearLayout {
    public GameSmallAvatarList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setData(LinkedList<String> linkedList) {
        if (Util.isNullOrNil((List) linkedList)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        while (getChildCount() < linkedList.size()) {
            ImageView imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(C0966R.dimen.f3864h5), getResources().getDimensionPixelSize(C0966R.dimen.f3864h5));
            layoutParams.setMargins(0, 0, getResources().getDimensionPixelSize(C0966R.dimen.f3858gx), 0);
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            addView(imageView);
        }
        int i = 0;
        while (i < linkedList.size()) {
            C52645f.C52650d.C52651a aVar = new C52645f.C52650d.C52651a();
            aVar.f147022c = true;
            C52645f.m59023a().mo73595e((ImageView) getChildAt(i), linkedList.get(i), aVar.mo73598a(), (C52645f.C52652e) null);
            View childAt = getChildAt(i);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view = childAt;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/game/widget/GameSmallAvatarList", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/game/widget/GameSmallAvatarList", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i++;
        }
        while (i < getChildCount()) {
            int i2 = i + 1;
            View childAt2 = getChildAt(i);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(childAt2, aVar3.mo10232b(), "com/tencent/mm/plugin/game/widget/GameSmallAvatarList", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(childAt2, "com/tencent/mm/plugin/game/widget/GameSmallAvatarList", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i = i2;
        }
    }
}
