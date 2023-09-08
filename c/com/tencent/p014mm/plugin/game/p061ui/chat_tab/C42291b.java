package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.content.Context;
import androidx.fragment.app.C112968x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.b */
public final class C42291b extends C112968x {

    /* renamed from: i */
    public final Context f114363i;

    /* renamed from: j */
    public final List<Fragment> f114364j = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42291b(Context context, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(fragmentManager, "fm");
        this.f114363i = context;
    }

    public int getCount() {
        return ((ArrayList) this.f114364j).size();
    }

    public Fragment getItem(int i) {
        return (Fragment) ((ArrayList) this.f114364j).get(i);
    }

    public CharSequence getPageTitle(int i) {
        return this.f114363i.getResources().getString(C30114c.f81428a[i].intValue());
    }
}
