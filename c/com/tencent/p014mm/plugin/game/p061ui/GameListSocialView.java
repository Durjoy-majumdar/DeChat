package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import p629ny.C76979h;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameListSocialView */
public class GameListSocialView extends LinearLayout implements C111847h {
    public GameListSocialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public void setData(LinkedList<String> linkedList) {
        LinkedList<String> linkedList2 = linkedList;
        Class cls = C76979h.class;
        if (linkedList2 == null || linkedList.size() == 0 || linkedList.size() % 2 != 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (getChildCount() < linkedList.size() / 2) {
            int size = (linkedList.size() / 2) - getChildCount();
            for (int i = 0; i < size; i++) {
                View.inflate(getContext(), C0966R.C0971layout.f359812ax0, this);
            }
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (i2 < linkedList.size() / 2) {
                View childAt = getChildAt(i2);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameListSocialView", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(childAt, "com/tencent/mm/plugin/game/ui/GameListSocialView", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View childAt2 = getChildAt(i2);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view = childAt2;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/GameListSocialView", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/game/ui/GameListSocialView", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        for (int i3 = 0; i3 < linkedList.size() / 2; i3++) {
            View childAt3 = getChildAt(i3);
            TextView textView = (TextView) childAt3.findViewById(C0966R.C0970id.enr);
            TextView textView2 = (TextView) childAt3.findViewById(C0966R.C0970id.ens);
            int i4 = i3 * 2;
            textView.setText(((C76979h) C86312j.m106911c(cls)).yp0(getContext(), linkedList2.get(i4), textView.getTextSize()));
            textView2.setText(((C76979h) C86312j.m106911c(cls)).yp0(getContext(), linkedList2.get(i4 + 1), textView2.getTextSize()));
        }
    }
}
