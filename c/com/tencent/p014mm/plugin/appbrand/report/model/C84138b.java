package com.tencent.p014mm.plugin.appbrand.report.model;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import hr0.C87583a;
import hr0.C87584b;
import java.util.LinkedList;
import p1044ub.C90630c;
import p224ra.C89909e;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.b */
public final class C84138b implements C84147j {

    /* renamed from: b */
    public final String f245621b;

    /* renamed from: c */
    public final C86812g f245622c;

    /* renamed from: d */
    public Intent f245623d;

    /* renamed from: e */
    public boolean f245624e = false;

    /* renamed from: f */
    public boolean f245625f = false;

    /* renamed from: g */
    public boolean f245626g = false;

    /* renamed from: h */
    public C84164n f245627h = null;

    /* renamed from: i */
    public C84169p f245628i = null;

    /* renamed from: j */
    public C84172s f245629j = null;

    /* renamed from: k */
    public C84173t f245630k = null;

    /* renamed from: l */
    public volatile C84153l f245631l = null;

    public C84138b(C86812g gVar) {
        this.f245621b = gVar.f238147j;
        this.f245622c = gVar;
        C84173t tVar = new C84173t(false);
        tVar.f245812b = gVar.f238147j;
        tVar.f245813c = gVar;
        if (gVar.mo113051d0() == null) {
            tVar.f245815e = gVar.f238149o.f239365g + 1;
            tVar.f245814d = gVar.mo113036W().f234802F;
        } else {
            tVar.f245815e = gVar.mo113051d0().f261072r.f238585d + 1;
            tVar.f245814d = gVar.mo113051d0().f261072r.pkgVersion;
        }
        this.f245630k = tVar;
        mo115892j();
    }

    /* renamed from: a */
    public void mo115884a(C90630c cVar) {
        if (cVar != null && !this.f245624e) {
            mo115891h(cVar);
        }
    }

    /* renamed from: b */
    public void mo115885b(C90630c cVar) {
        this.f245623d = null;
        if (this.f245625f) {
            this.f245625f = false;
            return;
        }
        this.f245631l.mo115885b(cVar);
        this.f245628i.mo116842a(cVar);
    }

    /* renamed from: c */
    public void mo115886c(Intent intent) {
        this.f245623d = intent;
    }

    /* renamed from: d */
    public void mo115887d() {
        this.f245625f = true;
        this.f245626g = true;
    }

    /* renamed from: e */
    public C84173t mo115888e() {
        return this.f245630k;
    }

    /* renamed from: f */
    public void mo115889f(long j, C83817h4 h4Var) {
        long j2 = j;
        Class cls = C87583a.class;
        int ordinal = h4Var.ordinal();
        int i = 2;
        mo116799p(j2, ordinal != 0 ? (ordinal == 3 || ordinal == 4 || ordinal == 5 || ordinal == 6) ? 3 : 2 : 1);
        ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(390, 0, 1, false);
        switch (((int) j2) / 250) {
            case 0:
                i = 1;
                break;
            case 1:
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
            case 5:
                i = 5;
                break;
            case 6:
            case 7:
                i = 6;
                break;
            default:
                i = 7;
                break;
        }
        ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(390, (long) i, 1, false);
    }

    /* renamed from: g */
    public C84172s mo115890g() {
        return this.f245629j;
    }

    /* renamed from: h */
    public void mo115891h(C90630c cVar) {
        String str;
        this.f245624e = true;
        this.f245631l.mo115891h(cVar);
        cVar.f260370X0.mo116803e();
        C84164n nVar = this.f245627h;
        C86812g gVar = this.f245622c;
        nVar.getClass();
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(cVar.getContext());
        if (castActivityOrNull != null && castActivityOrNull.isFinishing()) {
            nVar.f245716c = true;
        }
        nVar.mo116836a(gVar, cVar);
        nVar.mo116837b();
        C84172s sVar = this.f245629j;
        sVar.f245799p = sVar.f245786c.peekFirst();
        sVar.f245801r = null;
        int ordinal = C83231l.m102143d(sVar.f245791h).ordinal();
        if (ordinal == 0) {
            sVar.f245800q = 3;
        } else if (ordinal == 3) {
            sVar.f245800q = 6;
        } else if (ordinal != 7) {
            Intent n = sVar.f245792i.mo113042Z().getReporter().mo115896n();
            if (n != null) {
                if (n.getComponent() == null) {
                    Log.m105921e("MicroMsg.AppBrand.Report.kv_14992", "onBackground, intent %s, get null cmp name", n);
                    str = "";
                } else {
                    str = n.getComponent().getClassName();
                }
                sVar.f245800q = 8;
                String nullAs = Util.nullAs(IntentUtil.getStringExtra(n, "appbrand_report_key_target_activity"), str);
                sVar.f245801r = nullAs;
                sVar.f245786c.pollFirst();
                sVar.f245786c.push(Util.nullAsNil(nullAs));
            } else {
                sVar.f245800q = 7;
            }
        }
        Activity castActivityOrNull2 = AndroidContextUtil.castActivityOrNull(cVar.getContext());
        if (castActivityOrNull2 != null && castActivityOrNull2.isFinishing()) {
            sVar.f245787d = true;
        }
        sVar.mo116848b(cVar);
    }

    /* renamed from: j */
    public void mo115892j() {
        if (Util.isNullOrNil(this.f245621b)) {
            Log.m105921e("MicroMsg.AppBrandPageContainerReporter", "resetSession with dummy model, stack %s", Util.stackTraceToString(new Throwable()));
            this.f245631l = C84153l.f245688a;
            this.f245628i = C84169p.f245754n;
            this.f245627h = C84164n.f245711C;
            this.f245629j = C84172s.f245783A;
            return;
        }
        String str = this.f245622c.mo113036W().f234837q;
        String g = C84141e.m103711g(this.f245622c.mo113036W().f234846y);
        this.f245631l = new C84140d(g, (this.f245631l == null || this.f245631l.peek() == null) ? this.f245622c.mo113030T() : this.f245631l.peek().f245690b);
        C86812g gVar = this.f245622c;
        C84164n nVar = new C84164n(false, this.f245631l);
        nVar.f245719f = str;
        AppBrandStatObject n1 = gVar.mo121253n1();
        nVar.f245717d = n1.f245533f;
        nVar.f245718e = n1.f245534g;
        nVar.f245720g = gVar.f238147j;
        nVar.f245721h = gVar;
        nVar.f245723j = gVar.mo113036W().f239365g + 1;
        nVar.f245722i = gVar.mo113036W().f234802F;
        nVar.f245724k = n1.f245535h;
        nVar.f245734u = n1.f245531d;
        nVar.f245735v = n1.f245532e;
        this.f245627h = nVar;
        LinkedList linkedList = new LinkedList();
        linkedList.push(Util.nullAsNil(g));
        C86812g gVar2 = this.f245622c;
        C84172s sVar = new C84172s(false);
        sVar.f245790g = str;
        AppBrandStatObject n15 = gVar2.mo121253n1();
        sVar.f245788e = n15.f245533f;
        sVar.f245789f = n15.f245534g;
        sVar.f245791h = gVar2.f238147j;
        sVar.f245792i = gVar2;
        if (gVar2.mo113051d0() == null) {
            sVar.f245794k = gVar2.f238149o.f239365g + 1;
            sVar.f245793j = gVar2.mo113036W().f234802F;
        } else {
            sVar.f245794k = gVar2.mo113051d0().f261072r.f238585d + 1;
            sVar.f245793j = gVar2.mo113051d0().f261072r.pkgVersion;
        }
        sVar.f245795l = n15.f245535h;
        sVar.f245804u = n15.f245531d;
        sVar.f245805v = n15.f245532e;
        sVar.f245786c.addAll(linkedList);
        this.f245629j = sVar;
        C86812g gVar3 = this.f245622c;
        C84169p pVar = new C84169p(false, this.f245631l);
        try {
            pVar.f245758d = str;
            pVar.f245757c = gVar3.f238147j;
            AppBrandStatObject n16 = gVar3.mo121253n1();
            pVar.f245759e = n16.f245533f;
            pVar.f245760f = n16.f245534g;
            pVar.f245761g = n16.f245531d;
            pVar.f245762h = n16.f245532e;
            pVar.f245764j = n16.f245535h;
            pVar.f245765k = gVar3.mo113036W().f239365g + 1;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.Report.kv_14004", e, "Kv_14004 protect the npe", new Object[0]);
        }
        this.f245628i = pVar;
    }

    /* renamed from: k */
    public void mo115893k(long j) {
        mo116799p(j, 4);
    }

    /* renamed from: l */
    public C84153l mo115894l() {
        return this.f245631l;
    }

    /* renamed from: m */
    public void mo115895m(C90630c cVar, C90630c cVar2, C83817h4 h4Var) {
        C83817h4 h4Var2 = C83817h4.AUTO_RE_LAUNCH;
        boolean z = false;
        if (h4Var2 != h4Var || !this.f245626g) {
            this.f245626g = false;
        } else {
            this.f245626g = false;
            mo115892j();
        }
        if (h4Var2 == h4Var || cVar2 == null || Util.isNullOrNil(cVar2.mo116163R0()) || cVar2 == cVar) {
            z = true;
        }
        this.f245631l.mo115895m(cVar, z ? null : cVar2, h4Var);
        if (!z) {
            cVar2.f260370X0.mo116803e();
            mo116800q(cVar, cVar2);
            return;
        }
        mo116800q(cVar, (C90630c) null);
    }

    /* renamed from: n */
    public Intent mo115896n() {
        return this.f245623d;
    }

    /* renamed from: p */
    public final void mo116799p(long j, int i) {
        ((C87584b) C89909e.m112439d(C87584b.class, true)).mo121691h(13543, this.f245621b, Integer.valueOf(this.f245622c.mo113051d0().f261072r.pkgVersion), Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(this.f245622c.mo113036W().f234841u + 1000));
    }

    /* renamed from: q */
    public final void mo116800q(C90630c cVar, C90630c cVar2) {
        if (cVar2 != null) {
            C84164n nVar = this.f245627h;
            C86812g gVar = this.f245622c;
            cVar.mo116163R0();
            nVar.mo116836a(gVar, cVar2);
            nVar.mo116837b();
            C84172s sVar = this.f245629j;
            String R0 = cVar.mo116163R0();
            sVar.f245799p = sVar.f245786c.peekFirst();
            sVar.f245800q = 2;
            sVar.f245801r = R0;
            sVar.f245786c.push(cVar2.mo116162Q0());
            sVar.f245785b = cVar2.mo116162Q0();
            sVar.mo116848b(cVar2);
        }
        this.f245628i.mo116842a(cVar);
    }
}
