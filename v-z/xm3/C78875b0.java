package xm3;

import android.content.Intent;
import com.tencent.p014mm.p136ui.base.MMTagPanel;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import tm3.C52354x;
import tm3.C78069w;

/* renamed from: xm3.b0 */
public final class C78875b0 implements MMTagPanel.C73201i {

    /* renamed from: d */
    public final /* synthetic */ C78877c0 f231724d;

    public C78875b0(C78877c0 c0Var) {
        this.f231724d = c0Var;
    }

    /* renamed from: a */
    public void mo94790a(String str) {
        C87412m.m108594g(str, "tag");
    }

    /* renamed from: b */
    public void mo94791b(String str) {
        C87412m.m108594g(str, "tag");
    }

    /* renamed from: d */
    public void mo94792d(String str) {
        C87412m.m108594g(str, "tag");
    }

    /* renamed from: g */
    public void mo94794g() {
    }

    /* renamed from: h */
    public void mo94799h(String str) {
        C87412m.m108594g(str, "curText");
    }

    /* renamed from: i */
    public void mo94800i(String str) {
        C78069w wVar;
        C87412m.m108594g(str, "tag");
        C78877c0 c0Var = this.f231724d;
        c0Var.getClass();
        C115669n.INSTANCE.mo160131h(11225, 1, 0);
        UIStateCenter e3 = c0Var.mo14599e3();
        if (e3 != null && (wVar = (C78069w) e3.getState()) != null) {
            Intent intent = new Intent();
            intent.setClassName(c0Var.getActivity(), "com.tencent.mm.ui.contact.SelectLabelContactUI");
            intent.putExtra("label", str);
            HashSet hashSet = new HashSet();
            hashSet.addAll(C52354x.f146330a.mo73368a(wVar.f228826n, wVar.f228825j, CommonKt.hasAttr(wVar.f228821f, 8192)));
            intent.putExtra("always_select_contact", Util.listToString(new ArrayList(hashSet), ","));
            if (wVar.mo108033b()) {
                intent.putExtra("list_attr", C74560s1.m89278g(16384, 64, 131072));
                if (wVar.f228822g == 14) {
                    intent.putExtra("max_limit_num", c0Var.getActivity().getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE));
                }
            } else {
                intent.putExtra("list_attr", 16384);
            }
            c0Var.getActivity().startActivityForResult(intent, 3);
        }
    }

    /* renamed from: j */
    public void mo94801j(boolean z, int i) {
    }
}
