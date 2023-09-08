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
import ht1.C60200t1;
import iv1.C60637c;
import jq3.C60905o;
import o40.C61926c;
import org.json.JSONObject;
import p687sr.C36783f;
import p687sr.C64156g;
import te3.C48978cb0;
import te3.C49712hj1;

/* renamed from: ev1.k */
public final class C58847k extends C58838a implements C36783f {

    /* renamed from: h */
    public final String f168458h;

    /* renamed from: i */
    public final String f168459i;

    /* renamed from: j */
    public final String f168460j;

    /* renamed from: n */
    public final String f168461n;

    /* renamed from: o */
    public final String f168462o;

    /* renamed from: p */
    public final String f168463p;

    /* renamed from: q */
    public final String f168464q;

    /* renamed from: r */
    public final String f168465r;

    /* renamed from: s */
    public final String f168466s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58847k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        super(str, 0, 2, (C8480h) null);
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        C87412m.m108594g(str, "forcePushId");
        String str16 = str2;
        C87412m.m108594g(str2, "avatarUrl");
        C87412m.m108594g(str3, "nickname");
        String str17 = str4;
        C87412m.m108594g(str4, "wording");
        C87412m.m108594g(str13, "feedId");
        C87412m.m108594g(str14, "liveId");
        C87412m.m108594g(str15, "nonceId");
        this.f168458h = str3;
        this.f168459i = str13;
        this.f168460j = str14;
        this.f168461n = str15;
        this.f168462o = str8;
        this.f168463p = str9;
        this.f168464q = str10;
        this.f168465r = str11;
        this.f168466s = str12;
    }

    /* renamed from: c */
    public int mo75c() {
        return 1;
    }

    /* renamed from: d */
    public String mo84034d() {
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.f1g);
        C87412m.m108593f(string, "getContext().resources.g…string.force_notify_live)");
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
        String str = this.f168459i;
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
        gVar.ql0(str, i, 2, this.f168434d, false);
    }

    /* renamed from: l */
    public void mo84039l() {
        ((C64156g) C86312j.m106911c(C64156g.class)).mo58060JU(3, 2, this.f168459i, C59712c.f170575I.mo84705a().f170589q.size(), this.f168434d);
    }

    /* renamed from: m */
    public void mo84040m() {
        super.mo84040m();
        String str = this.f168459i;
        if (!(str == null || str.length() == 0)) {
            C48978cb0 cb02 = new C48978cb0();
            cb02.f131607d = C61926c.m72671P(this.f168459i);
            cb02.f131608e = this.f168465r;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedActionType", 38);
            jSONObject.put("strValue", this.f168466s);
            cb02.f131610g = jSONObject.toString();
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76900y((C49712hj1) null, 18054, cb02);
        }
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
            ((C64156g) C86312j.m106911c(C64156g.class)).mo58060JU(2, 2, this.f168459i, C59712c.f170575I.mo84705a().f170589q.size(), this.f168434d);
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
