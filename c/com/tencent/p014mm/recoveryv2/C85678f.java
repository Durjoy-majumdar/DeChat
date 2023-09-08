package com.tencent.p014mm.recoveryv2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.p014mm.recoveryv2.C85662a;
import com.tencent.p014mm.recoveryv2.C85672d;
import com.tencent.p014mm.recoveryv2.C85692k;
import df3.C86272a;
import df3.C86273b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.tencent.mm.recoveryv2.f */
public interface C85678f {

    /* renamed from: com.tencent.mm.recoveryv2.f$b */
    public static class C85680b extends C85679a {

        /* renamed from: k */
        public final long f249672k = System.currentTimeMillis();

        /* renamed from: l */
        public C85682d f249673l;

        /* renamed from: m */
        public C85683e f249674m;

        public C85680b(Context context) {
            super(context);
        }

        /* renamed from: d */
        public int mo119266d() {
            C85683e eVar = this.f249674m;
            if (eVar != null) {
                return eVar.mo119266d();
            }
            C85682d dVar = this.f249673l;
            if (dVar != null) {
                return dVar.mo119266d();
            }
            return -1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
            return;
         */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo119272j() {
            /*
                r2 = this;
                long r0 = java.lang.System.currentTimeMillis()
                r2.f249667f = r0
                monitor-enter(r2)
                com.tencent.mm.recoveryv2.f$d r0 = r2.f249673l     // Catch:{ all -> 0x002f }
                if (r0 != 0) goto L_0x001b
                com.tencent.mm.recoveryv2.f$e r0 = r2.f249674m     // Catch:{ all -> 0x002f }
                if (r0 != 0) goto L_0x001b
                com.tencent.mm.recoveryv2.g r0 = new com.tencent.mm.recoveryv2.g     // Catch:{ all -> 0x002f }
                r0.<init>(r2, r2)     // Catch:{ all -> 0x002f }
                r2.f249673l = r0     // Catch:{ all -> 0x002f }
                r0.mo119274j()     // Catch:{ all -> 0x002f }
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                return
            L_0x001b:
                com.tencent.mm.recoveryv2.f$e r0 = r2.f249674m     // Catch:{ all -> 0x002f }
                if (r0 != 0) goto L_0x0025
                com.tencent.mm.recoveryv2.f$e r0 = r2.mo119273k()     // Catch:{ all -> 0x002f }
                r2.f249674m = r0     // Catch:{ all -> 0x002f }
            L_0x0025:
                com.tencent.mm.recoveryv2.f$e r0 = r2.f249674m     // Catch:{ all -> 0x002f }
                if (r0 == 0) goto L_0x002d
                r1 = 2
                r0.mo119277j(r1)     // Catch:{ all -> 0x002f }
            L_0x002d:
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                return
            L_0x002f:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.recoveryv2.C85678f.C85680b.mo119272j():void");
        }

        /* renamed from: k */
        public final C85683e mo119273k() {
            C85679a aVar = this.f249673l;
            if (aVar == null) {
                aVar = this;
            }
            C85683e eVar = new C85683e(aVar);
            Context context = this.f249662a;
            C85683e.C85684a aVar2 = new C85683e.C85684a("signal_acc");
            C85672d.C85674b bVar = new C85672d.C85674b(context, "signal_acc");
            bVar.mo119256e();
            aVar2.f249683b = bVar;
            aVar2.f249682a = bVar.getInt("acc_total", 0);
            eVar.f249679m = this.f249672k;
            eVar.f249678l = aVar2;
            return eVar;
        }
    }

    /* renamed from: com.tencent.mm.recoveryv2.f$c */
    public static class C85681c extends C85682d {
        public C85681c(C85679a aVar) {
            super(aVar);
        }

        /* renamed from: j */
        public void mo119274j() {
            this.f249667f = System.currentTimeMillis();
            int i = this.f249670i.f249629d.f250884a;
            if (i <= 0) {
                C85692k.C85693a.m105840a(4, "MicroMsg.recovery.safePointLazy", "no need check, crash count = " + i);
                this.f249675k.set(true);
                mo119276l();
                Executors.newCachedThreadPool().submit(new C85687h(this));
                return;
            }
            super.mo119274j();
        }
    }

    /* renamed from: com.tencent.mm.recoveryv2.f$d */
    public static class C85682d extends C85679a {

        /* renamed from: k */
        public final AtomicBoolean f249675k = new AtomicBoolean();

        /* renamed from: l */
        public final AtomicBoolean f249676l = new AtomicBoolean();

        public C85682d(C85679a aVar) {
            super(aVar);
        }

        /* renamed from: j */
        public void mo119274j() {
            boolean z;
            String str;
            int i;
            this.f249667f = System.currentTimeMillis();
            mo119265c();
            long j = this.f249667f - this.f249670i.f249626a;
            C85692k.C85693a.m105840a(4, "MicroMsg.recovery.safePoint", "recovery interval = " + j);
            long j2 = this.f249671j.f249650e;
            if (j2 <= 0 || j >= j2) {
                this.f249675k.set(true);
                if (!TextUtils.isEmpty(this.f249670i.f249627b) && !this.f249670i.f249627b.equals(this.f249668g)) {
                    C85692k.C85693a.m105840a(4, "MicroMsg.recovery.safePoint", "version code mismatch, skip");
                    mo119264b();
                }
                if (j >= this.f249671j.f249648c) {
                    C85692k.C85693a.m105840a(4, "MicroMsg.recovery.safePoint", "over interval, skip");
                    mo119264b();
                }
                long j3 = this.f249671j.f249652g;
                if (j3 > 0 && C85689j.m105827a(this.f249662a, j3)) {
                    C85692k.C85693a.m105840a(4, "MicroMsg.recovery.safePoint", "kill by usr or sys, skip");
                    mo119264b();
                }
                int i2 = this.f249669h.f249629d.f250884a;
                C85692k.C85693a.m105840a(4, "MicroMsg.recovery.safePoint", "recovery crashCount = " + i2);
                if (i2 >= this.f249671j.f249646a) {
                    boolean f = super.mo119268f();
                    if (f) {
                        C85672d.C85674b bVar = new C85672d.C85674b(this.f249662a, "recovery_statistic");
                        bVar.mo119256e();
                        bVar.getInt("crash_count", 0);
                        bVar.getBoolean("launch_recovery", false);
                        boolean z2 = bVar.getBoolean("launch_recovery_real", false);
                        boolean z3 = bVar.getBoolean("recover_from_crash", false);
                        int i3 = bVar.getInt("recovery_status", -1);
                        bVar.getInt("recovery_from", 0);
                        i = i2;
                        str = "MicroMsg.recovery.safePoint";
                        z = f;
                        long j4 = bVar.getLong("recover_running_time", 0);
                        bVar.getBoolean("recover_is_discard", false);
                        String string = bVar.getString("recover_app_ver", "");
                        bVar.mo119258g("crash_count", (long) this.f249669h.f249629d.f250884a);
                        bVar.putBoolean("launch_recovery", true);
                        bVar.putBoolean("launch_recovery_real", z2);
                        bVar.putBoolean("recover_from_crash", z3);
                        bVar.mo119258g("recovery_status", (long) i3);
                        bVar.mo119258g("recovery_from", (long) 1);
                        bVar.mo119258g("recover_internal_status", (long) bVar.getInt("recover_internal_status", 0));
                        bVar.mo119258g("recover_launch_mode", (long) bVar.getInt("recover_launch_mode", 0));
                        bVar.mo119258g("recover_running_time", j4);
                        bVar.putBoolean("recover_is_discard", false);
                        bVar.putString("recover_app_ver", string);
                        bVar.mo119241b();
                    } else {
                        i = i2;
                        z = f;
                        str = "MicroMsg.recovery.safePoint";
                    }
                    if (!z) {
                        C85692k.C85693a.m105840a(5, str, "launch recovery fail");
                        mo119271i(true);
                        return;
                    }
                    if (i < this.f249671j.f249647b) {
                        mo119269g(1);
                        mo119267e();
                    } else {
                        mo119269g(2);
                        mo119263a();
                    }
                    mo119271i(true);
                    mo119270h();
                    return;
                }
                mo119276l();
                mo119267e();
                mo119271i(false);
                this.f249663b.postDelayed(new C85688i(this), this.f249671j.f249651f);
                return;
            }
            C85692k.C85693a.m105840a(4, "MicroMsg.recovery.safePoint", "too fast, skip and do nothing, min = " + j2);
        }

        /* renamed from: k */
        public void mo119275k() {
            C85692k.C85693a.m105840a(4, "MicroMsg.recovery.safePoint", "#finish");
            if (this.f249675k.get()) {
                C85692k.C85693a.m105840a(4, "MicroMsg.recovery.safePoint", "clear crash point");
                mo119265c();
                mo119264b();
                mo119271i(true);
            }
        }

        /* renamed from: l */
        public void mo119276l() {
            C85692k.C85693a.m105840a(4, "MicroMsg.recovery.safePoint", "onLaunchNormal");
            RecoveryCrash recoveryCrash = this.f249669h;
            if (recoveryCrash != null && recoveryCrash.f249629d.f250884a >= 1) {
                C85672d.C85674b bVar = new C85672d.C85674b(this.f249662a, "recovery_statistic");
                bVar.mo119256e();
                bVar.getInt("crash_count", 0);
                bVar.getBoolean("launch_recovery", false);
                boolean z = bVar.getBoolean("launch_recovery_real", false);
                boolean z2 = bVar.getBoolean("recover_from_crash", false);
                int i = bVar.getInt("recovery_status", -1);
                bVar.getInt("recovery_from", 0);
                int i2 = bVar.getInt("recover_internal_status", 0);
                long j = bVar.getLong("recover_running_time", 0);
                bVar.getBoolean("recover_is_discard", false);
                bVar.mo119258g("crash_count", (long) this.f249669h.f249629d.f250884a);
                bVar.putBoolean("launch_recovery", false);
                bVar.putBoolean("launch_recovery_real", z);
                bVar.putBoolean("recover_from_crash", z2);
                bVar.putInt("recovery_status", i);
                bVar.putInt("recovery_from", 1);
                bVar.putInt("recover_internal_status", i2);
                bVar.putInt("recover_launch_mode", bVar.getInt("recover_launch_mode", 0));
                bVar.putLong("recover_running_time", j);
                bVar.putBoolean("recover_is_discard", false);
                bVar.putString("recover_app_ver", bVar.getString("recover_app_ver", ""));
                bVar.mo119241b();
            }
        }
    }

    /* renamed from: com.tencent.mm.recoveryv2.f$e */
    public static class C85683e extends C85679a {

        /* renamed from: k */
        public int f249677k = 2;

        /* renamed from: l */
        public C85684a f249678l;

        /* renamed from: m */
        public long f249679m = 0;

        /* renamed from: n */
        public long f249680n = 0;

        /* renamed from: o */
        public boolean f249681o = true;

        /* renamed from: com.tencent.mm.recoveryv2.f$e$a */
        public static class C85684a {

            /* renamed from: a */
            public int f249682a;

            /* renamed from: b */
            public C85672d f249683b;

            public C85684a(String str) {
            }
        }

        /* renamed from: com.tencent.mm.recoveryv2.f$e$b */
        public static class C85685b extends C85683e {
            public C85685b(C85683e eVar) {
                super((C85679a) eVar);
            }

            /* renamed from: j */
            public void mo119277j(int i) {
                this.f249667f = System.currentTimeMillis();
                RecoveryCrash c = RecoveryCrash.m105766c(this.f249662a);
                this.f249670i = c;
                c.mo119228a();
                RecoveryCrash recoveryCrash = this.f249670i;
                long j = recoveryCrash.f249626a;
                String str = recoveryCrash.f249627b;
                C86272a aVar = recoveryCrash.f249629d;
                this.f249669h = new RecoveryCrash(j, str, new C86272a(aVar.f250884a, aVar.f250885b), recoveryCrash.f249628c);
                C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandlerFallback", "#begin");
                this.f249677k = i;
                long j2 = this.f249679m;
                if (j2 > 0) {
                    this.f249680n = this.f249667f - j2;
                }
                long j3 = this.f249680n;
                if (j3 <= 0) {
                    j3 = this.f249667f - this.f249670i.f249626a;
                }
                C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandlerFallback", "recovery interval = " + j3);
                if (j3 < this.f249671j.f249649d) {
                    C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandlerFallback", "within interval, inc");
                } else {
                    C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandlerFallback", "over signal interval, clear point");
                    mo119264b();
                }
                mo119267e();
                int i2 = this.f249669h.f249629d.f250884a;
                C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandlerFallback", "recovery crashCount = " + i2);
                if (i2 < this.f249671j.f249646a) {
                    mo119271i(true);
                } else if (!mo119268f()) {
                    C85692k.C85693a.m105840a(5, "MicroMsg.recovery.signalHandlerFallback", "launch recovery fail");
                    mo119271i(true);
                } else {
                    if (i2 < this.f249671j.f249647b) {
                        mo119269g(1);
                    } else {
                        mo119269g(2);
                        mo119263a();
                    }
                    mo119271i(true);
                    mo119270h();
                }
            }
        }

        public C85683e(Context context) {
            super(context);
        }

        /* renamed from: f */
        public boolean mo119268f() {
            boolean f = super.mo119268f();
            if (!f) {
                return f;
            }
            C85672d.C85674b bVar = new C85672d.C85674b(this.f249662a, "recovery_statistic");
            bVar.mo119256e();
            bVar.getInt("crash_count", 0);
            bVar.getBoolean("launch_recovery", false);
            boolean z = bVar.getBoolean("launch_recovery_real", false);
            boolean z2 = bVar.getBoolean("recover_from_crash", false);
            int i = bVar.getInt("recovery_status", -1);
            bVar.getInt("recovery_from", 0);
            int i2 = bVar.getInt("recover_internal_status", 0);
            boolean z3 = f;
            int i3 = bVar.getInt("recover_launch_mode", 0);
            bVar.getLong("recover_running_time", 0);
            bVar.getBoolean("recover_is_discard", false);
            String string = bVar.getString("recover_app_ver", "");
            int i4 = this.f249669h.f249629d.f250884a;
            int i5 = this.f249677k;
            long max = Math.max(this.f249680n, 0);
            bVar.mo119258g("crash_count", (long) i4);
            bVar.putBoolean("launch_recovery", true);
            bVar.putBoolean("launch_recovery_real", z);
            bVar.putBoolean("recover_from_crash", z2);
            bVar.putInt("recovery_status", i);
            bVar.putInt("recovery_from", i5);
            bVar.putInt("recover_internal_status", i2);
            bVar.putInt("recover_launch_mode", i3);
            bVar.putLong("recover_running_time", max);
            bVar.putBoolean("recover_is_discard", false);
            bVar.putString("recover_app_ver", string);
            bVar.mo119242c();
            return z3;
        }

        /* renamed from: j */
        public void mo119277j(int i) {
            int i2;
            boolean z;
            this.f249667f = System.currentTimeMillis();
            mo119265c();
            C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandler", "#begin");
            this.f249677k = i;
            long j = this.f249679m;
            if (j > 0) {
                this.f249680n = this.f249667f - j;
            }
            long j2 = this.f249680n;
            if (j2 <= 0) {
                j2 = this.f249667f - this.f249670i.f249626a;
            }
            C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandler", "recovery interval = " + j2);
            long j3 = this.f249671j.f249650e;
            if (j3 <= 0 || j2 >= j3) {
                C85679a aVar = this.f249666e;
                if (aVar instanceof C85682d) {
                    ((C85682d) aVar).f249676l.set(true);
                }
                if (!TextUtils.isEmpty(this.f249670i.f249627b) && !this.f249670i.f249627b.equals(this.f249668g)) {
                    C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandler", "version code mismatch, skip");
                    mo119264b();
                }
                C85675e eVar = this.f249671j;
                if (j2 < eVar.f249648c) {
                    C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandler", "within interval, inc");
                    mo119267e();
                } else {
                    long j4 = eVar.f249649d;
                    int i3 = (j2 > j4 ? 1 : (j2 == j4 ? 0 : -1));
                    if (i3 >= 0 || this.f249678l == null) {
                        C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandler", "over signal interval, clear point");
                        mo119264b();
                        mo119267e();
                    } else {
                        C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandler", "within signal interval");
                        if (i3 >= 0) {
                            i2 = 0;
                        } else {
                            float f = (float) j2;
                            float f2 = (float) j4;
                            i2 = f >= 0.75f * f2 ? 25 : f >= 0.5f * f2 ? 50 : f >= f2 * 0.25f ? 75 : 100;
                        }
                        C85684a aVar2 = this.f249678l;
                        int i4 = aVar2.f249682a + i2;
                        aVar2.f249682a = i4;
                        if (i4 >= 100) {
                            aVar2.f249682a = 0;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandler", "acc meet, inc");
                            mo119267e();
                        }
                        C85684a aVar3 = this.f249678l;
                        C85672d.C85674b bVar = (C85672d.C85674b) aVar3.f249683b;
                        bVar.mo119258g("acc_total", (long) aVar3.f249682a);
                        bVar.mo119242c();
                    }
                }
                int i5 = this.f249669h.f249629d.f250884a;
                C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandler", "recovery crashCount = " + i5);
                if (i5 < this.f249671j.f249646a) {
                    mo119271i(true);
                    if (this.f249681o) {
                        C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandler", "try fallback trigger");
                        C85685b bVar2 = new C85685b(this);
                        bVar2.f249679m = this.f249679m;
                        bVar2.mo119277j(this.f249677k);
                    }
                    C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandler", "onLaunchNormal");
                    if (this.f249669h.f249629d.f250884a >= 1) {
                        C85672d.C85674b bVar3 = new C85672d.C85674b(this.f249662a, "recovery_statistic");
                        bVar3.mo119256e();
                        bVar3.getInt("crash_count", 0);
                        bVar3.getBoolean("launch_recovery", false);
                        boolean z2 = bVar3.getBoolean("launch_recovery_real", false);
                        boolean z3 = bVar3.getBoolean("recover_from_crash", false);
                        int i6 = bVar3.getInt("recovery_status", -1);
                        bVar3.getInt("recovery_from", 0);
                        int i7 = bVar3.getInt("recover_internal_status", 0);
                        int i8 = bVar3.getInt("recover_launch_mode", 0);
                        bVar3.getLong("recover_running_time", 0);
                        bVar3.getBoolean("recover_is_discard", false);
                        String string = bVar3.getString("recover_app_ver", "");
                        int i9 = this.f249669h.f249629d.f250884a;
                        int i15 = this.f249677k;
                        long max = Math.max(this.f249680n, 0);
                        bVar3.mo119258g("crash_count", (long) i9);
                        bVar3.putBoolean("launch_recovery", false);
                        bVar3.putBoolean("launch_recovery_real", z2);
                        bVar3.putBoolean("recover_from_crash", z3);
                        bVar3.mo119258g("recovery_status", (long) i6);
                        bVar3.mo119258g("recovery_from", (long) i15);
                        bVar3.mo119258g("recover_internal_status", (long) i7);
                        bVar3.mo119258g("recover_launch_mode", (long) i8);
                        bVar3.mo119258g("recover_running_time", max);
                        bVar3.putBoolean("recover_is_discard", false);
                        bVar3.putString("recover_app_ver", string);
                        bVar3.mo119242c();
                    }
                } else if (!mo119268f()) {
                    C85692k.C85693a.m105840a(5, "MicroMsg.recovery.signalHandler", "launch recovery fail");
                    mo119271i(true);
                } else {
                    if (i5 < this.f249671j.f249647b) {
                        mo119269g(1);
                    } else {
                        mo119269g(2);
                        mo119263a();
                    }
                    mo119271i(true);
                    mo119270h();
                }
            } else {
                C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandler", "too fast, skip and do nothing, min = " + j3);
                if (this.f249681o) {
                    C85692k.C85693a.m105840a(4, "MicroMsg.recovery.signalHandler", "try fallback trigger");
                    C85685b bVar4 = new C85685b(this);
                    bVar4.f249679m = this.f249679m;
                    bVar4.mo119277j(this.f249677k);
                }
            }
        }

        public C85683e(C85679a aVar) {
            super(aVar);
        }
    }

    /* renamed from: com.tencent.mm.recoveryv2.f$a */
    public static abstract class C85679a implements C85678f {

        /* renamed from: a */
        public final Context f249662a;

        /* renamed from: b */
        public final Handler f249663b;

        /* renamed from: c */
        public final AtomicReference<C85662a> f249664c;

        /* renamed from: d */
        public final SparseArray<List<C86273b>> f249665d;

        /* renamed from: e */
        public C85679a f249666e;

        /* renamed from: f */
        public long f249667f;

        /* renamed from: g */
        public final String f249668g;

        /* renamed from: h */
        public RecoveryCrash f249669h;

        /* renamed from: i */
        public RecoveryCrash f249670i;

        /* renamed from: j */
        public C85675e f249671j;

        public C85679a(Context context) {
            String str;
            this.f249662a = context;
            this.f249663b = new Handler(Looper.getMainLooper());
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    str = packageInfo.versionName;
                    this.f249668g = str;
                    this.f249671j = null;
                    C85662a.C85665c cVar = new C85662a.C85665c();
                    cVar.f249633a = null;
                    this.f249664c = new AtomicReference<>(cVar);
                    SparseArray<List<C86273b>> sparseArray = new SparseArray<>(2);
                    this.f249665d = sparseArray;
                    sparseArray.put(1, new ArrayList());
                    sparseArray.put(2, new ArrayList());
                    Context context2 = this.f249662a;
                    C85672d.C85673a aVar = new C85672d.C85673a(context2, "recovery_crash_count");
                    aVar.mo119240a();
                    C86272a aVar2 = new C86272a(aVar);
                    RecoveryCrash recoveryCrash = new RecoveryCrash(aVar2, new C85672d.C85673a(context2, "recovery_crash"));
                    aVar2.f250884a = Math.max(aVar.getInt("crash_count", 0), 0);
                    this.f249670i = recoveryCrash;
                }
            } catch (PackageManager.NameNotFoundException | RuntimeException e) {
                C85692k.m105839a("MicroMsg.recovery.utils", "get version name fail", e);
            }
            str = null;
            this.f249668g = str;
            this.f249671j = null;
            C85662a.C85665c cVar2 = new C85662a.C85665c();
            cVar2.f249633a = null;
            this.f249664c = new AtomicReference<>(cVar2);
            SparseArray<List<C86273b>> sparseArray2 = new SparseArray<>(2);
            this.f249665d = sparseArray2;
            sparseArray2.put(1, new ArrayList());
            sparseArray2.put(2, new ArrayList());
            Context context22 = this.f249662a;
            C85672d.C85673a aVar3 = new C85672d.C85673a(context22, "recovery_crash_count");
            aVar3.mo119240a();
            C86272a aVar22 = new C86272a(aVar3);
            RecoveryCrash recoveryCrash2 = new RecoveryCrash(aVar22, new C85672d.C85673a(context22, "recovery_crash"));
            aVar22.f250884a = Math.max(aVar3.getInt("crash_count", 0), 0);
            this.f249670i = recoveryCrash2;
        }

        /* renamed from: a */
        public void mo119263a() {
            mo119264b();
            Context context = this.f249662a;
            RecoveryCrash b = RecoveryCrash.m105765b(context);
            b.mo119229d();
            b.mo119230e();
            RecoveryCrash c = RecoveryCrash.m105766c(context);
            c.mo119229d();
            c.mo119230e();
        }

        /* renamed from: b */
        public void mo119264b() {
            this.f249669h.mo119229d();
        }

        /* renamed from: c */
        public void mo119265c() {
            if (this.f249671j == null) {
                this.f249671j = new C85675e(this.f249662a);
                this.f249664c.get().mo119236b(this.f249671j);
            }
            if (this.f249670i == null) {
                Context context = this.f249662a;
                C85672d.C85673a aVar = new C85672d.C85673a(context, "recovery_crash_count");
                aVar.mo119240a();
                C86272a aVar2 = new C86272a(aVar);
                RecoveryCrash recoveryCrash = new RecoveryCrash(aVar2, new C85672d.C85673a(context, "recovery_crash"));
                aVar2.f250884a = Math.max(aVar.getInt("crash_count", 0), 0);
                this.f249670i = recoveryCrash;
            }
            this.f249670i.mo119228a();
            if (this.f249669h == null) {
                RecoveryCrash recoveryCrash2 = this.f249670i;
                long j = recoveryCrash2.f249626a;
                String str = recoveryCrash2.f249627b;
                C86272a aVar3 = recoveryCrash2.f249629d;
                this.f249669h = new RecoveryCrash(j, str, new C86272a(aVar3.f250884a, aVar3.f250885b), recoveryCrash2.f249628c);
            }
        }

        /* renamed from: d */
        public int mo119266d() {
            return this.f249670i.f249629d.f250884a;
        }

        /* renamed from: e */
        public void mo119267e() {
            RecoveryCrash recoveryCrash = this.f249669h;
            recoveryCrash.f249629d.f250884a++;
            recoveryCrash.f249627b = this.f249668g;
            recoveryCrash.f249626a = this.f249667f;
        }

        /* renamed from: f */
        public boolean mo119268f() {
            C85692k.C85693a.m105840a(4, "MicroMsg.recovery.trigger", "onLaunchRecovery");
            try {
                this.f249664c.get().mo119235a(this.f249662a, this.f249669h);
                return true;
            } catch (Throwable th) {
                C85692k.m105839a("MicroMsg.recovery.trigger", "on launch recovery action error, mission aborted", th);
                return false;
            }
        }

        /* renamed from: g */
        public void mo119269g(int i) {
            C85692k.C85693a.m105840a(4, "MicroMsg.recovery.trigger", "recovery event, level = " + i);
            for (C86273b a : this.f249665d.get(i)) {
                try {
                    a.mo119225a(this.f249662a, this.f249669h, i);
                } catch (Throwable th) {
                    C85692k.m105839a("MicroMsg.recovery.trigger", "recovery event error", th);
                }
            }
        }

        /* renamed from: h */
        public void mo119270h() {
            C85692k.C85693a.m105840a(4, "MicroMsg.recovery.trigger", "#onTerminate");
            try {
                this.f249664c.get().mo119237c(this.f249662a, this.f249669h);
            } catch (Throwable unused) {
            }
        }

        /* renamed from: i */
        public void mo119271i(boolean z) {
            if (z) {
                this.f249669h.mo119230e();
                return;
            }
            RecoveryCrash recoveryCrash = this.f249669h;
            C86272a aVar = recoveryCrash.f249629d;
            aVar.f250885b.putInt("crash_count", aVar.f250884a).mo119241b();
            recoveryCrash.f249628c.putString("crash_version", recoveryCrash.f249627b).putLong("crash_time", recoveryCrash.f249626a).mo119241b();
        }

        public C85679a(C85679a aVar) {
            this.f249666e = aVar;
            this.f249662a = aVar.f249662a;
            this.f249663b = aVar.f249663b;
            this.f249668g = aVar.f249668g;
            this.f249670i = aVar.f249670i;
            this.f249671j = aVar.f249671j;
            this.f249664c = aVar.f249664c;
            this.f249665d = aVar.f249665d;
        }
    }
}
