package p489dh;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import eg3.C107273e;
import ei3.C86522b;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedHashSet;
import java.util.Set;
import k20.C9556a;
import oa1.C117731d;
import p206nj.C11171e;
import p329d3.C86165a;
import p489dh.C107038f;
import p492dn.C107054l;
import rx3.C13598b0;
import zt3.C119157j;

@C86522b
/* renamed from: dh.b */
public final class C107033b extends C86301e implements C107054l {

    /* renamed from: d */
    public C107054l.C107055a f320435d;

    /* renamed from: e */
    public C107032a f320436e;

    /* renamed from: f */
    public final Set<C86165a<C107054l.C107055a>> f320437f;

    /* renamed from: dh.b$a */
    public static final class C107034a implements C107038f.C107039a {

        /* renamed from: a */
        public final /* synthetic */ C107033b f320438a;

        public C107034a(C107033b bVar) {
            this.f320438a = bVar;
        }

        /* renamed from: a */
        public void mo157479a(int i, String str) {
            this.f320438a.vx0(i, str);
        }

        /* renamed from: b */
        public void mo157480b(int i, String str) {
            for (C86165a accept : this.f320438a.f320437f) {
                accept.accept(new C107054l.C107055a(i, str, 2));
            }
            C107033b bVar = this.f320438a;
            C107054l.C107055a aVar = bVar.f320435d;
            boolean z = false;
            if (aVar != null && i == aVar.f320468a) {
                z = true;
            }
            if (z) {
                bVar.f320435d = null;
            }
        }

        /* renamed from: c */
        public void mo157481c(int i, String str) {
            for (C86165a accept : this.f320438a.f320437f) {
                accept.accept(new C107054l.C107055a(i, str, 3));
            }
        }
    }

    /* renamed from: dh.b$b */
    public static final class C107035b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AudioManager f320439d;

        /* renamed from: e */
        public final /* synthetic */ int f320440e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f320441f;

        public C107035b(AudioManager audioManager, int i, C32224a<C13598b0> aVar) {
            this.f320439d = audioManager;
            this.f320440e = i;
            this.f320441f = aVar;
        }

        public final void run() {
            Log.m105925i("MicroMsg.AudioRouteManager", "set mode from %d to %d", Integer.valueOf(this.f320439d.getMode()), Integer.valueOf(this.f320440e));
            this.f320439d.setMode(this.f320440e);
            C32224a<C13598b0> aVar = this.f320441f;
            if (aVar != null) {
                C13598b0 invoke = aVar.invoke();
            }
        }
    }

    public C107033b() {
        C107032a dVar = (!C11171e.m11046c(31) || !(C117731d.m166007c().mo182440a(new C107273e()) != 1 ? false : true)) ? new C107036d() : new C107040g();
        this.f320436e = dVar;
        dVar.mo157488f(new C107034a(this));
        this.f320437f = new LinkedHashSet();
    }

    /* renamed from: Dx */
    public boolean mo157460Dx() {
        C107032a aVar = this.f320436e;
        if (aVar != null) {
            return aVar.mo157486d();
        }
        return false;
    }

    public boolean Jv0(int i, boolean z) {
        String str;
        C107054l.C107055a aVar = this.f320435d;
        if (aVar != null && i == aVar.f320468a) {
            return false;
        }
        Log.printInfoStack("MicroMsg.AudioRouteManager", "route to Device " + i, new Object[0]);
        if (i == 1) {
            C107032a aVar2 = this.f320436e;
            if (aVar2 != null) {
                aVar2.mo157490h(z);
            }
            vx0(1, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncf));
            this.f320435d = new C107054l.C107055a(1, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncf), 0, 4, (C8480h) null);
        } else if (i == 2) {
            C107032a aVar3 = this.f320436e;
            if (aVar3 != null) {
                aVar3.mo157485c(z);
            }
            vx0(2, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncd));
            this.f320435d = new C107054l.C107055a(2, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncd), 0, 4, (C8480h) null);
        } else if (i == 3) {
            C107032a aVar4 = this.f320436e;
            if (aVar4 != null) {
                aVar4.mo157484b(z);
            }
            vx0(3, MMApplicationContext.getContext().getResources().getString(C0966R.string.nce));
            this.f320435d = new C107054l.C107055a(3, MMApplicationContext.getContext().getResources().getString(C0966R.string.nce), 0, 4, (C8480h) null);
        } else if (i == 4) {
            C107032a aVar5 = this.f320436e;
            String a = aVar5 != null ? aVar5.mo157483a(z) : null;
            if (a == null) {
                str = MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc);
                C87412m.m108593f(str, "getContext().resources.g…g.audio_device_bluetooth)");
            } else {
                str = a;
            }
            vx0(4, str);
            if (a == null) {
                a = MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc);
                C87412m.m108593f(a, "getContext().resources.g…g.audio_device_bluetooth)");
            }
            this.f320435d = new C107054l.C107055a(4, a, 0, 4, (C8480h) null);
        }
        return true;
    }

    /* renamed from: Kq */
    public void mo157462Kq(C86165a<C107054l.C107055a> aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Log.m105924i("MicroMsg.AudioRouteManager", "add listener " + aVar + " and current has " + this.f320437f.size());
        this.f320437f.add(aVar);
    }

    public boolean Nc0() {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return ((AudioManager) systemService).isSpeakerphoneOn();
    }

    public void Qs0(int i, C32224a<C13598b0> aVar) {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        ((C119157j) C119157j.f356862d).mo183876g(new C107035b((AudioManager) systemService, i, aVar), "requestAudioMode");
    }

    /* renamed from: YW */
    public boolean mo157465YW(C107054l.C107055a aVar, boolean z) {
        C87412m.m108594g(aVar, TPReportKeys.Common.COMMON_DEVICE_NAME);
        return Jv0(aVar.f320468a, z);
    }

    /* renamed from: Yj */
    public void mo157466Yj(Intent intent) {
        C87412m.m108594g(intent, "intent");
        C107032a aVar = this.f320436e;
        if (aVar != null) {
            aVar.mo157459i(intent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
        if (r2 != false) goto L_0x008a;
     */
    /* renamed from: bJ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<p492dn.C107054l.C107055a> mo157467bJ() {
        /*
            r15 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            dh.a r1 = r15.f320436e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0013
            boolean r1 = r1.mo157486d()
            if (r1 != r2) goto L_0x0013
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            if (r1 == 0) goto L_0x003a
            dh.a r1 = r15.f320436e
            if (r1 == 0) goto L_0x001e
            dn.l$a r1 = r1.f320434b
            if (r1 != 0) goto L_0x0037
        L_0x001e:
            dn.l$a r1 = new dn.l$a
            r5 = 4
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131822022(0x7f1105c6, float:1.9276804E38)
            java.lang.String r6 = r4.getString(r6)
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0037:
            r0.add(r1)
        L_0x003a:
            dh.a r1 = r15.f320436e
            if (r1 == 0) goto L_0x0046
            boolean r1 = r1.mo157487e()
            if (r1 != r2) goto L_0x0046
            r1 = 1
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            if (r1 == 0) goto L_0x006d
            dh.a r1 = r15.f320436e
            if (r1 == 0) goto L_0x0051
            dn.l$a r1 = r1.f320433a
            if (r1 != 0) goto L_0x006a
        L_0x0051:
            dn.l$a r1 = new dn.l$a
            r5 = 3
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131822024(0x7f1105c8, float:1.9276808E38)
            java.lang.String r6 = r4.getString(r6)
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x006a:
            r0.add(r1)
        L_0x006d:
            dh.a r1 = r15.f320436e
            if (r1 == 0) goto L_0x0079
            boolean r1 = r1.mo157489g()
            if (r1 != r2) goto L_0x0079
            r1 = 1
            goto L_0x007a
        L_0x0079:
            r1 = 0
        L_0x007a:
            if (r1 != 0) goto L_0x008a
            dh.a r1 = r15.f320436e
            if (r1 == 0) goto L_0x0087
            boolean r1 = r1.mo157487e()
            if (r1 != 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r2 = 0
        L_0x0088:
            if (r2 == 0) goto L_0x00a6
        L_0x008a:
            dn.l$a r1 = new dn.l$a
            r4 = 2
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131822023(0x7f1105c7, float:1.9276806E38)
            java.lang.String r5 = r2.getString(r3)
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r0.add(r1)
        L_0x00a6:
            dn.l$a r1 = new dn.l$a
            r10 = 1
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131822025(0x7f1105c9, float:1.927681E38)
            java.lang.String r11 = r2.getString(r3)
            r12 = 0
            r13 = 4
            r14 = 0
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            r0.add(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p489dh.C107033b.mo157467bJ():java.util.List");
    }

    /* renamed from: gQ */
    public void mo157468gQ(C86165a<C107054l.C107055a> aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Log.m105924i("MicroMsg.AudioRouteManager", "remove listener " + aVar + " and current has " + this.f320437f.size());
        this.f320437f.remove(aVar);
    }

    /* renamed from: jQ */
    public C107054l.C107055a mo157469jQ() {
        C107054l.C107055a aVar = this.f320435d;
        return aVar == null ? new C107054l.C107055a(1, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncf), 0, 4, (C8480h) null) : aVar;
    }

    /* renamed from: ju */
    public void mo157470ju() {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        try {
            ((AudioManager) systemService).adjustVolume(-1, 5);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AudioRouteManager", "adjustStreamVolume() Exception: %s", e.getMessage());
            wx0();
        }
    }

    /* renamed from: n */
    public boolean mo157471n() {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return ((AudioManager) systemService).getRingerMode() != 2;
    }

    public void nt0() {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        try {
            ((AudioManager) systemService).adjustVolume(1, 5);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AudioRouteManager", "adjustStreamVolume() Exception: %s", e.getMessage());
            wx0();
        }
    }

    /* renamed from: oz */
    public boolean mo157473oz(int i) {
        boolean z = true;
        if (i == 1) {
            C107032a aVar = this.f320436e;
            if (aVar != null && aVar.mo157486d()) {
                return C107054l.C107056b.m144940b(this, 4, false, 2, (Object) null);
            }
            C107032a aVar2 = this.f320436e;
            if (aVar2 == null || !aVar2.mo157487e()) {
                z = false;
            }
            return z ? C107054l.C107056b.m144940b(this, 3, false, 2, (Object) null) : C107054l.C107056b.m144940b(this, 2, false, 2, (Object) null);
        } else if (i == 2) {
            C107032a aVar3 = this.f320436e;
            if (aVar3 != null && aVar3.mo157486d()) {
                return C107054l.C107056b.m144940b(this, 4, false, 2, (Object) null);
            }
            C107032a aVar4 = this.f320436e;
            return aVar4 != null && aVar4.mo157487e() ? C107054l.C107056b.m144940b(this, 3, false, 2, (Object) null) : C107054l.C107056b.m144940b(this, 1, false, 2, (Object) null);
        } else if (i == 3) {
            return C107054l.C107056b.m144940b(this, 1, false, 2, (Object) null);
        } else {
            if (i != 4) {
                return false;
            }
            return C107054l.C107056b.m144940b(this, 4, false, 2, (Object) null);
        }
    }

    /* renamed from: qG */
    public boolean mo157474qG() {
        C107032a aVar = this.f320436e;
        if (aVar != null) {
            return aVar.mo157487e();
        }
        return false;
    }

    public void release() {
        Log.m105924i("MicroMsg.AudioRouteManager", "release audio route manager ");
        C107032a aVar = this.f320436e;
        if (aVar != null) {
            aVar.release();
        }
        this.f320435d = null;
    }

    public final void vx0(int i, String str) {
        for (C86165a accept : this.f320437f) {
            accept.accept(new C107054l.C107055a(i, str, 1));
        }
    }

    public final void wx0() {
        if (Build.VERSION.SDK_INT >= 23) {
            Object systemService = MMApplicationContext.getContext().getSystemService("notification");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            boolean isNotificationPolicyAccessGranted = ((NotificationManager) systemService).isNotificationPolicyAccessGranted();
            Log.m105925i("MicroMsg.AudioRouteManager", "requestPermission() result:%s", Boolean.valueOf(isNotificationPolicyAccessGranted));
            if (!isNotificationPolicyAccessGranted) {
                try {
                    Intent intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
                    intent.putExtra("android.provider.extra.APP_PACKAGE", MMApplicationContext.getPackageName());
                    Context context = MMApplicationContext.getContext();
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/audio/manager/AudioRouteManager", "requestPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/audio/manager/AudioRouteManager", "requestPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AudioRouteManager", "requestPermission() Exception:%s", e.getMessage());
                }
            }
        }
    }

    /* renamed from: z4 */
    public void mo157478z4(C107054l.C107055a aVar) {
        String str;
        C87412m.m108594g(aVar, "info");
        int i = aVar.f320468a;
        if (i == 1) {
            C107032a aVar2 = this.f320436e;
            if (aVar2 != null) {
                aVar2.mo157490h(false);
            }
            vx0(1, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncf));
            this.f320435d = new C107054l.C107055a(1, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncf), 0, 4, (C8480h) null);
        } else if (i == 2) {
            C107032a aVar3 = this.f320436e;
            if (aVar3 != null) {
                aVar3.mo157485c(false);
            }
            vx0(2, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncd));
            this.f320435d = new C107054l.C107055a(2, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncd), 0, 4, (C8480h) null);
        } else if (i == 3) {
            C107032a aVar4 = this.f320436e;
            if (aVar4 != null) {
                aVar4.mo157484b(false);
            }
            vx0(3, MMApplicationContext.getContext().getResources().getString(C0966R.string.nce));
            this.f320435d = new C107054l.C107055a(3, MMApplicationContext.getContext().getResources().getString(C0966R.string.nce), 0, 4, (C8480h) null);
        } else if (i == 4) {
            C107032a aVar5 = this.f320436e;
            String a = aVar5 != null ? aVar5.mo157483a(false) : null;
            if (a == null) {
                str = MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc);
                C87412m.m108593f(str, "getContext().resources.g…g.audio_device_bluetooth)");
            } else {
                str = a;
            }
            vx0(4, str);
            if (a == null) {
                a = MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc);
                C87412m.m108593f(a, "getContext().resources.g…g.audio_device_bluetooth)");
            }
            this.f320435d = new C107054l.C107055a(4, a, 0, 4, (C8480h) null);
        }
    }
}
