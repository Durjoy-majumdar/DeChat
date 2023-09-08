package ev1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import dv1.C58435m;
import fv1.C32183a;
import gv1.C59712c;
import gy3.C8480h;
import gy3.C87412m;
import iv1.C60637c;
import jq3.C60905o;
import p687sr.C64156g;

/* renamed from: ev1.l */
public final class C58848l extends C58838a {

    /* renamed from: h */
    public final String f168467h;

    /* renamed from: i */
    public final String f168468i;

    /* renamed from: j */
    public final String f168469j;

    /* renamed from: n */
    public final long f168470n;

    /* renamed from: o */
    public final String f168471o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58848l(String str, String str2, String str3, String str4, long j, String str5) {
        super(str, 0, 2, (C8480h) null);
        C87412m.m108594g(str, "forcePushId");
        C87412m.m108594g(str2, "username");
        C87412m.m108594g(str3, "nickname");
        C87412m.m108594g(str4, "wording");
        this.f168467h = str2;
        this.f168468i = str3;
        this.f168469j = str4;
        this.f168470n = j;
        this.f168471o = str5;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    /* renamed from: d */
    public String mo84034d() {
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.f1j);
        C87412m.m108593f(string, "getContext().resources.g….string.force_notify_msg)");
        return string;
    }

    public long getItemId() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo84036i() {
        return true;
    }

    /* renamed from: j */
    public boolean mo84037j() {
        return true;
    }

    /* renamed from: k */
    public void mo84038k() {
        int i;
        Class cls = C58435m.class;
        super.mo84038k();
        String str = this.f168467h;
        C64156g gVar = (C64156g) C86312j.m106911c(C64156g.class);
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(ForceNotifyService::class.java)");
        if (C58435m.zx0((C58435m) c, (Context) null, 1, (Object) null)) {
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(ForceNotifyService::class.java)");
            i = C58435m.Ax0((C58435m) c2, (Context) null, 1, (Object) null) ? 1 : 4;
        } else {
            C7335d c3 = C86312j.m106911c(cls);
            C87412m.m108593f(c3, "getService(ForceNotifyService::class.java)");
            i = C58435m.Ax0((C58435m) c3, (Context) null, 1, (Object) null) ? 3 : 2;
        }
        gVar.ql0(str, i, 1, this.f168434d, false);
    }

    /* renamed from: l */
    public void mo84039l() {
        ((C64156g) C86312j.m106911c(C64156g.class)).mo58060JU(3, 1, this.f168467h, C59712c.f170575I.mo84705a().f170589q.size(), this.f168434d);
    }

    /* renamed from: n */
    public void mo84041n(View view) {
        C87412m.m108594g(view, "view");
        C60637c cVar = C60637c.f172746a;
        Context context = view.getContext();
        C87412m.m108593f(context, "view.context");
        cVar.mo85591a(context, this, C58843i.f168452c.mo84050a().f168454a.size());
    }

    /* renamed from: o */
    public void mo84042o(boolean z) {
        super.mo84042o(z);
        if (z) {
            ((C64156g) C86312j.m106911c(C64156g.class)).mo58060JU(2, 1, this.f168467h, C59712c.f170575I.mo84705a().f170589q.size(), this.f168434d);
        }
    }

    /* renamed from: p */
    public void mo84043p(C60905o oVar, View view, int i) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "view");
        int size = C59712c.f170575I.mo84705a().f170589q.size();
        C60637c cVar = C60637c.f172746a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        cVar.mo85591a(context, this, size);
    }

    /* renamed from: q */
    public void mo84044q() {
        super.mo84044q();
        C58843i a = C58843i.f168452c.mo84050a();
        String str = this.f168434d;
        a.getClass();
        C87412m.m108594g(str, "forcePushId");
        a.f168455b.remove(str);
        C32183a.f85554d.mo58522c(this.f168434d);
    }
}
