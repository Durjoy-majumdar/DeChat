package z33;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import l33.C109247e;
import p206nj.C76866m;
import p737wf.C38088a;
import v33.C111384c;
import w33.C111721d;
import w33.C111730z;

/* renamed from: z33.c */
public final class C112584c {

    /* renamed from: a */
    public int f337114a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f337115b = Integer.MIN_VALUE;

    /* renamed from: c */
    public int f337116c = Integer.MAX_VALUE;

    /* renamed from: d */
    public int f337117d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f337118e = Integer.MAX_VALUE;

    /* renamed from: f */
    public int f337119f = Integer.MIN_VALUE;

    /* renamed from: g */
    public MMHandler f337120g;

    /* renamed from: h */
    public boolean f337121h;

    /* renamed from: i */
    public C91616b f337122i;

    /* renamed from: z33.c$a */
    public static final class C112585a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112584c f337123d;

        public C112585a(C112584c cVar) {
            this.f337123d = cVar;
        }

        public final void run() {
            this.f337123d.mo164324a();
            this.f337123d.mo164325b();
        }
    }

    public C112584c() {
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        this.f337122i = new C91616b(context);
        this.f337120g = new MMHandler("batteryCounter");
    }

    /* renamed from: a */
    public final void mo164324a() {
        int a;
        Class cls = C32735h.class;
        try {
            C91616b bVar = this.f337122i;
            int i = 0;
            if (bVar != null) {
                Intent registerReceiver = bVar.f262466a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver != null) {
                    i = registerReceiver.getIntExtra("temperature", 0);
                }
                i /= 10;
            }
            int i2 = this.f337115b;
            if (i > i2 || i2 == Integer.MIN_VALUE) {
                this.f337115b = i;
            }
            int i3 = this.f337114a;
            if (i < i3 || i3 == Integer.MAX_VALUE) {
                this.f337114a = i;
            }
            C111721d dVar = C111384c.f333467f;
            if (dVar != null) {
                dVar.mo163412k(this.f337114a, this.f337115b, i);
            }
            C109247e.vx0().f333449i = i;
            C111730z zVar = C111730z.f334576a;
            int i4 = this.f337114a;
            int i5 = this.f337115b;
            C111730z.f334583h = i4;
            C111730z.f334584i = i5;
            if (C76866m.m92674c() && ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_voip_xsetting_allow_voip_report_temperate, true) && (a = (int) C38088a.m41721a()) != -1) {
                int i6 = this.f337119f;
                if (a > i6 || i6 == Integer.MIN_VALUE) {
                    this.f337119f = a;
                }
                int i7 = this.f337118e;
                if (a < i7 || i7 == Integer.MAX_VALUE) {
                    this.f337118e = a;
                }
                C111721d dVar2 = C111384c.f333467f;
                if (dVar2 != null) {
                    dVar2.mo163414m(this.f337118e, this.f337119f, a);
                }
                int i8 = this.f337118e;
                int i9 = this.f337119f;
                C111730z.f334586k = i8;
                C111730z.f334585j = i9;
            }
            if (((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_voip_xsetting_allow_voip_report_cputemperate, true)) {
                C91616b bVar2 = this.f337122i;
                int a2 = bVar2 != null ? bVar2.mo125486a() : Integer.MIN_VALUE;
                if (a2 != Integer.MIN_VALUE) {
                    int i15 = this.f337117d;
                    if (a2 > i15 || i15 == Integer.MIN_VALUE) {
                        this.f337117d = a2;
                    }
                    int i16 = this.f337116c;
                    if (a2 < i16 || i16 == Integer.MAX_VALUE) {
                        this.f337116c = a2;
                    }
                    C111721d dVar3 = C111384c.f333467f;
                    if (dVar3 != null) {
                        dVar3.mo163413l(this.f337116c, this.f337117d, a2);
                    }
                    int i17 = this.f337116c;
                    int i18 = this.f337117d;
                    C111730z.f334588m = i17;
                    C111730z.f334587l = i18;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo164325b() {
        boolean z = true;
        this.f337121h = true;
        MMHandler mMHandler = this.f337120g;
        if (mMHandler == null || !mMHandler.isQuit()) {
            z = false;
        }
        if (z || !this.f337121h) {
            mo164325b();
            return;
        }
        MMHandler mMHandler2 = this.f337120g;
        if (mMHandler2 != null) {
            mMHandler2.postDelayed(new C112585a(this), 60000);
        }
    }
}
