package qn2;

import android.text.TextUtils;
import cc0.C92411b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.shake.p103ui.ShakeReportUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import eb0.C97625j3;
import java.util.HashMap;
import nn2.C21685l;
import nn2.C76942m;
import ob0.C11385n;
import ob0.C117747y;
import p702ts.C78085c;
import rn2.C77542a;

/* renamed from: qn2.g */
public class C22121g extends C21685l.C21687b implements C11385n {

    /* renamed from: u */
    public static int f62559u;

    /* renamed from: e */
    public C22118c f62560e;

    /* renamed from: f */
    public int f62561f;

    /* renamed from: g */
    public C22120e f62562g = new C22120e();

    /* renamed from: h */
    public long f62563h = 0;

    /* renamed from: i */
    public MMHandler f62564i = new MMHandler();

    /* renamed from: j */
    public int f62565j = 0;

    /* renamed from: n */
    public String f62566n = "";

    /* renamed from: o */
    public boolean f62567o = false;

    /* renamed from: p */
    public boolean f62568p = false;

    /* renamed from: q */
    public C92411b f62569q;

    /* renamed from: r */
    public float f62570r = -85.0f;

    /* renamed from: s */
    public float f62571s = -1000.0f;

    /* renamed from: t */
    public C92411b.C92412a f62572t = new C22122a();

    /* renamed from: qn2.g$a */
    public class C22122a implements C92411b.C92412a {
        public C22122a() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            if (!z) {
                return true;
            }
            C22121g gVar = C22121g.this;
            if (gVar.f62570r != -85.0f || gVar.f62571s != -1000.0f) {
                return false;
            }
            gVar.f62570r = f2;
            gVar.f62571s = f;
            C76942m.xx0().f62540d = C22121g.this.f62570r;
            C22119d xx02 = C76942m.xx0();
            C22121g gVar2 = C22121g.this;
            xx02.f62541e = gVar2.f62571s;
            if (!gVar2.f62568p) {
                return false;
            }
            Log.m105924i("MicroMsg.ShakeCardService", "ShakeCardService do netscen from onGetLocation()");
            C22121g.this.mo35201f();
            return false;
        }
    }

    /* renamed from: qn2.g$b */
    public class C22123b implements Runnable {
        public C22123b() {
        }

        public void run() {
            C22121g gVar = C22121g.this;
            C22120e eVar = gVar.f62562g;
            eVar.f62543a = 3;
            gVar.f62561f = 3;
            eVar.f62555m = C76942m.xx0().f62542f;
            C22121g gVar2 = C22121g.this;
            C21685l.C21686a aVar = gVar2.f61391d;
            if (aVar != null) {
                ((ShakeReportUI) aVar).mo24634N7(1250, gVar2.f62562g, 2);
            }
        }
    }

    /* renamed from: qn2.g$c */
    public class C22124c implements Runnable {
        public C22124c() {
        }

        public void run() {
            C22121g gVar = C22121g.this;
            if (!gVar.f62567o) {
                gVar.mo35201f();
            }
        }
    }

    public C22121g(C21685l.C21686a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public void mo33950a() {
        C97625j3.m125815e().mo123470p(1250, this);
        C92411b bVar = this.f62569q;
        if (bVar != null) {
            bVar.mo126408b(this.f62572t);
        }
        mo35202g();
        this.f61391d = null;
    }

    /* renamed from: b */
    public void mo33951b() {
        f62559u = C76942m.xx0().f62538b;
        this.f62563h = C76942m.xx0().f62539c;
        this.f62570r = C76942m.xx0().f62540d;
        this.f62571s = C76942m.xx0().f62541e;
        C97625j3.m125815e().mo123455a(1250, this);
        C92411b ms = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
        this.f62569q = ms;
        ms.mo126407a(this.f62572t, true);
        C5139t.m5183e(22, 10);
    }

    /* renamed from: c */
    public void mo33952c() {
        C92411b bVar = this.f62569q;
        if (bVar != null) {
            bVar.mo126408b(this.f62572t);
        }
    }

    /* renamed from: d */
    public void mo33953d() {
        C92411b bVar = this.f62569q;
        if (bVar != null) {
            bVar.mo126407a(this.f62572t, true);
            C5139t.m5183e(22, 10);
        }
    }

    /* renamed from: e */
    public void mo33954e() {
        mo33951b();
        mo35202g();
        if (this.f62569q == null) {
            C92411b ms = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
            this.f62569q = ms;
            ms.mo126407a(this.f62572t, true);
            C5139t.m5183e(22, 10);
        }
        this.f62569q.mo126412f(this.f62572t, true);
        C5139t.m5183e(22, 10);
        C22119d xx02 = C76942m.xx0();
        xx02.getClass();
        Object obj = (!TextUtils.isEmpty("key_shake_card_item") && ((HashMap) xx02.f62537a).containsKey("key_shake_card_item")) ? ((HashMap) xx02.f62537a).get("key_shake_card_item") : null;
        long j = this.f62563h;
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - j;
        if (obj == null || !(obj instanceof C22120e)) {
            boolean z = false;
            if (j != 0 && currentTimeMillis < 0) {
                C115669n.INSTANCE.mo160131h(11666, Integer.valueOf(this.f62565j));
                this.f62564i.postDelayed(new C22123b(), 3000);
                Log.m105924i("MicroMsg.ShakeCardService", "ShakeCardService do not doNetSceneShakeCard, because time is not expire");
            } else {
                z = true;
            }
            if (!z) {
                return;
            }
            if (this.f62567o) {
                Log.m105924i("MicroMsg.ShakeCardService", "ShakeCardService is doing netscene, return");
            } else if (this.f62570r == -85.0f || this.f62571s == -1000.0f) {
                this.f62568p = true;
                Log.m105924i("MicroMsg.ShakeCardService", "ShakeCardService location is not geted, wait 4 second");
                this.f62564i.postDelayed(new C22124c(), 4000);
            } else {
                mo35201f();
            }
        } else {
            ((ShakeReportUI) this.f61391d).mo24634N7(1250, (C22120e) obj, 1);
            C22119d xx03 = C76942m.xx0();
            xx03.getClass();
            if (!TextUtils.isEmpty("key_shake_card_item")) {
                ((HashMap) xx03.f62537a).put("key_shake_card_item", (Object) null);
            }
            Log.m105924i("MicroMsg.ShakeCardService", "getlbscard return data is no empty, don't do doNetSceneShakeCard, return ok");
        }
    }

    /* renamed from: f */
    public final void mo35201f() {
        if (this.f62567o) {
            Log.m105924i("MicroMsg.ShakeCardService", "ShakeCardService is doing doNetSceneShakeCard, return");
            return;
        }
        this.f62567o = true;
        this.f62568p = false;
        Log.m105924i("MicroMsg.ShakeCardService", "ShakeCardService do doNetSceneShakeCard");
        this.f62560e = new C22118c(this.f62571s, this.f62570r, this.f62565j, this.f62566n);
        C97625j3.m125815e().mo123460f(this.f62560e);
    }

    /* renamed from: g */
    public void mo35202g() {
        if (this.f62560e != null) {
            C97625j3.m125815e().mo123458d(this.f62560e);
        }
    }

    /* renamed from: h */
    public final void mo35203h() {
        long j;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        int i = f62559u;
        int i2 = 0;
        if (i >= 0 && i <= 5) {
            Log.m105924i("MicroMsg.ShakeCardService", "ShakeCardService frequency_level is valid");
            int i3 = f62559u;
            if (i3 == 1) {
                i2 = 10;
            } else if (i3 == 2) {
                i2 = 30;
            } else if (i3 == 3) {
                i2 = 60;
            } else if (i3 == 4) {
                i2 = 120;
            } else if (i3 == 5) {
                i2 = 240;
            }
            j = (long) i2;
        } else {
            Log.m105924i("MicroMsg.ShakeCardService", "ShakeCardService frequency_level is not valid");
            j = (long) C77542a.m93504e(C77542a.m93501b());
        }
        Log.m105924i("MicroMsg.ShakeCardService", "ShakeCardService updateWaitingTime wait nextInterval is " + j);
        this.f62563h = currentTimeMillis + j;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C22118c) {
            C22120e eVar = this.f62562g;
            C22120e eVar2 = ((C22118c) yVar).f62536f;
            eVar.getClass();
            eVar.f62543a = eVar2.f62543a;
            eVar.f62544b = eVar2.f62544b;
            eVar.f62545c = eVar2.f62545c;
            eVar.f62546d = eVar2.f62546d;
            eVar.f62547e = eVar2.f62547e;
            eVar.f62548f = eVar2.f62548f;
            eVar.f62549g = eVar2.f62549g;
            eVar.f62550h = eVar2.f62550h;
            eVar.f62551i = eVar2.f62551i;
            eVar.f62552j = eVar2.f62552j;
            eVar.f62553k = eVar2.f62553k;
            eVar.f62554l = eVar2.f62554l;
            eVar.f62555m = eVar2.f62555m;
            eVar.f62556n = eVar2.f62556n;
            eVar.f62557o = eVar2.f62557o;
            eVar.f62558p = eVar2.f62558p;
            this.f62561f = this.f62562g.f62543a;
            Log.m105924i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd()  action_type:" + this.f62561f + "  frequency_level:" + f62559u + " control_flag:" + this.f62562g.f62551i);
            if (i == 0 && i2 == 0) {
                f62559u = this.f62562g.f62550h;
                Log.m105924i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd is OK ");
                C21685l.C21686a aVar = this.f61391d;
                if (aVar != null) {
                    ((ShakeReportUI) aVar).mo24634N7(1250, this.f62562g, 1);
                }
                mo35203h();
            } else if (!(i == 5 && i2 == -1) && (i != 4 || i2 == 0)) {
                Log.m105924i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd errType is " + i + " errCode is " + i2);
                C21685l.C21686a aVar2 = this.f61391d;
                if (aVar2 != null) {
                    ((ShakeReportUI) aVar2).mo24634N7(1250, this.f62562g, 2);
                }
                mo35203h();
            } else {
                Log.m105924i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd errType is " + i + " errCode is " + i2);
                C21685l.C21686a aVar3 = this.f61391d;
                if (aVar3 != null) {
                    ((ShakeReportUI) aVar3).mo24634N7(1250, this.f62562g, 2);
                }
                long e = (long) C77542a.m93504e(C77542a.m93501b());
                Log.m105924i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd wait nextInterval is " + e);
                this.f62563h = (System.currentTimeMillis() / 1000) + e;
            }
            C76942m.xx0().f62538b = f62559u;
            C76942m.xx0().f62539c = this.f62563h;
            this.f62567o = false;
        }
    }
}
