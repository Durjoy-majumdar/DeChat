package oc3;

import android.media.AudioManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import nc3.C34767b;
import p379r3.C101337b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: oc3.a */
public final class C21788a implements C34767b {

    /* renamed from: d */
    public static final C21788a f61747d = new C21788a();

    /* renamed from: e */
    public static AtomicLong f61748e = new AtomicLong();

    /* renamed from: f */
    public static final C13601g f61749f = C36568h.m40985a(C11391b.f33518d);

    /* renamed from: g */
    public static final C21789a f61750g = new C21789a(false, (C21792c) null);

    /* renamed from: h */
    public static final ConcurrentHashMap<C34767b.C34769b, C21792c> f61751h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public static final boolean f61752i;

    /* renamed from: j */
    public static final boolean f61753j;

    /* renamed from: n */
    public static final boolean f61754n;

    /* renamed from: o */
    public static final boolean f61755o;

    /* renamed from: oc3.a$b */
    public static final class C11391b extends C87413o implements C32224a<AudioManager> {

        /* renamed from: d */
        public static final C11391b f33518d = new C11391b();

        public C11391b() {
            super(0);
        }

        public Object invoke() {
            Object systemService = MMApplicationContext.getContext().getSystemService("audio");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return (AudioManager) systemService;
        }
    }

    /* renamed from: oc3.a$a */
    public static final class C21789a {

        /* renamed from: a */
        public volatile boolean f61756a;

        /* renamed from: b */
        public volatile C21792c f61757b;

        public C21789a(boolean z, C21792c cVar) {
            this.f61756a = z;
            this.f61757b = cVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21789a)) {
                return false;
            }
            C21789a aVar = (C21789a) obj;
            return this.f61756a == aVar.f61756a && C87412m.m108589b(this.f61757b, aVar.f61757b);
        }

        public int hashCode() {
            boolean z = this.f61756a;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + (this.f61757b == null ? 0 : this.f61757b.hashCode());
        }

        public String toString() {
            return "CurrentFocusState(hasFocus:" + this.f61756a + ",focusSession:" + this.f61757b + ')';
        }
    }

    /* renamed from: oc3.a$c */
    public static final class C21790c extends C87413o implements C32226l<C21789a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f61758d;

        /* renamed from: e */
        public final /* synthetic */ C21792c f61759e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21790c(boolean z, C21792c cVar) {
            super(1);
            this.f61758d = z;
            this.f61759e = cVar;
        }

        public Object invoke(Object obj) {
            C21789a aVar = (C21789a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            aVar.f61757b = this.f61758d ? this.f61759e : null;
            aVar.f61756a = this.f61758d;
            return C13598b0.f38549a;
        }
    }

    static {
        Class cls = C32735h.class;
        f61752i = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_audio_ignore_lock_focus, false);
        f61753j = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_audio_old_callback_logic, false);
        f61754n = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_audio_block_duck, false);
        f61755o = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_audio_use_system_request_result, false);
    }

    public synchronized boolean b20(C34767b.C34768c cVar) {
        boolean z;
        C87412m.m108594g(cVar, "session");
        z = true;
        if (C101337b.m132965a((AudioManager) ((C36570n) f61749f).getValue(), ((C21792c) cVar).f61764d) != 1) {
            z = false;
        }
        f61751h.remove(cVar.mo34199b());
        mo34193q((C21792c) cVar, false, false);
        Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "abandonSystemFocus: " + cVar + " success:" + z);
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0116  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final nc3.C34767b.C34768c mo34191d(nc3.C34767b.C34769b r18, nc3.C34767b.C21622a r19) {
        /*
            r17 = this;
            r7 = r18
            java.util.concurrent.ConcurrentHashMap<nc3.b$b, oc3.c> r8 = f61751h
            java.lang.Object r0 = r8.remove(r7)
            oc3.c r0 = (oc3.C21792c) r0
            java.lang.String r9 = "MicroMsg.AFS.AudioFocusManagerImpl"
            if (r0 == 0) goto L_0x0027
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "realRequestSystemFocus: last request not released "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            oc3.a r1 = f61747d
            r1.b20(r0)
        L_0x0027:
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r7, r0)
            int r0 = r7.f93452b
            r1 = 4
            r0 = r0 & r1
            r2 = 0
            r10 = 1
            if (r0 != r1) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r3 = 2
            if (r0 == 0) goto L_0x003c
            r12 = 2
            goto L_0x003d
        L_0x003c:
            r12 = 1
        L_0x003d:
            int r0 = p379r3.C22198a.f62835g
            r0 = 3
            if (r12 == r10) goto L_0x004a
            if (r12 == r3) goto L_0x004a
            if (r12 == r0) goto L_0x004a
            if (r12 == r1) goto L_0x004a
            r1 = 0
            goto L_0x004b
        L_0x004a:
            r1 = 1
        L_0x004b:
            if (r1 == 0) goto L_0x0119
            int r1 = r7.f93452b
            r1 = r1 & r3
            if (r1 != r3) goto L_0x0055
            r16 = 1
            goto L_0x0057
        L_0x0055:
            r16 = 0
        L_0x0057:
            int r1 = androidx.media.AudioAttributesCompat.f306545b
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r1 < r3) goto L_0x0065
            androidx.media.AudioAttributesImplApi26$a r1 = new androidx.media.AudioAttributesImplApi26$a
            r1.<init>()
            goto L_0x006a
        L_0x0065:
            androidx.media.AudioAttributesImplApi21$a r1 = new androidx.media.AudioAttributesImplApi21$a
            r1.<init>()
        L_0x006a:
            r1.mo16918a(r10)
            android.media.AudioAttributes$Builder r3 = r1.f44664a
            r3.setLegacyStreamType(r0)
            androidx.media.AudioAttributesCompat r15 = new androidx.media.AudioAttributesCompat
            androidx.media.AudioAttributesImpl r0 = r1.build()
            r15.<init>(r0)
            oc3.b r13 = new oc3.b
            r13.<init>(r7)
            android.os.Handler r14 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r14.<init>(r0)
            r3.a r5 = new r3.a
            r11 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            oc3.a$a r0 = f61750g
            oc3.c r0 = r0.f61757b
            if (r0 == 0) goto L_0x00a5
            nc3.b$b r0 = r0.f61762b
            if (r0 == 0) goto L_0x00a5
            int r0 = r0.f93452b
            r0 = r0 & r10
            if (r0 != r10) goto L_0x00a0
            r0 = 1
            goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            if (r0 != r10) goto L_0x00a5
            r0 = 1
            goto L_0x00a6
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            if (r0 == 0) goto L_0x00b2
            boolean r0 = f61752i
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "realRequestSystemFocus: current session lock focus, do not grant"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x00e3
        L_0x00b2:
            rx3.g r0 = f61749f
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            int r0 = p379r3.C101337b.m132966b(r0, r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "realRequestSystemFocus: system focus requrst result "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = ", useSystemRequestResule "
            r1.append(r3)
            boolean r3 = f61755o
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            if (r3 == 0) goto L_0x00e5
            if (r0 != r10) goto L_0x00e3
            goto L_0x00e5
        L_0x00e3:
            r11 = 0
            goto L_0x00e6
        L_0x00e5:
            r11 = 1
        L_0x00e6:
            oc3.c r12 = new oc3.c
            java.util.concurrent.atomic.AtomicLong r0 = f61748e
            long r1 = r0.getAndIncrement()
            r0 = r12
            r3 = r18
            r4 = r11
            r6 = r19
            r0.<init>(r1, r3, r4, r5, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "realRequestSystemFocus: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            if (r11 == 0) goto L_0x0116
            r8.put(r7, r12)
            r0 = r17
            r0.mo34193q(r12, r11, r10)
            goto L_0x0118
        L_0x0116:
            r0 = r17
        L_0x0118:
            return r12
        L_0x0119:
            r0 = r17
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Illegal audio focus gain type "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oc3.C21788a.mo34191d(nc3.b$b, nc3.b$a):nc3.b$c");
    }

    /* renamed from: el */
    public synchronized C34767b.C34768c mo34192el(C34767b.C34769b bVar, C34767b.C21622a aVar) {
        C34767b.C34768c cVar;
        C87412m.m108594g(bVar, "requestScene");
        Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "requestFocus: " + bVar + ", " + aVar);
        C21789a aVar2 = f61750g;
        C21792c cVar2 = aVar2.f61757b;
        if (cVar2 != null) {
            C34767b.C34768c cVar3 = aVar2.f61756a && cVar2.f61763c && C87412m.m108589b(cVar2.f61762b, bVar) ? cVar2 : null;
            if (cVar3 != null) {
                Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "requestFocus: already has focus " + cVar3);
                cVar = cVar3;
            }
        }
        cVar = mo34191d(bVar, aVar);
        return cVar;
    }

    /* renamed from: q */
    public final void mo34193q(C21792c cVar, boolean z, boolean z2) {
        C21789a aVar = f61750g;
        if (C87412m.m108589b(aVar.f61757b, cVar) || z2) {
            if (z2) {
                Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "updateFocusState: force update, current focus state " + aVar);
            }
            C21790c cVar2 = new C21790c(z, cVar);
            aVar.getClass();
            synchronized (aVar) {
                cVar2.invoke(aVar);
                C13598b0 b0Var = C13598b0.f38549a;
            }
            Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "updateFocusState: " + aVar);
            return;
        }
        Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "updateFocusState: not current focus session, no need to update");
    }
}
