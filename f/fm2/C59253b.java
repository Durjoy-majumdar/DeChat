package fm2;

import android.content.Context;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import dm2.C58325i;
import eb0.C31543z5;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32224a;
import gm2.C32484b;
import gm2.C32485c;
import gm2.C59597a;
import gm2.C59598d;
import gy3.C87412m;
import gy3.C87413o;
import i40.C60247c;
import java.util.HashMap;
import o40.C61926c;
import p606mm.C99933h;
import p749xh.C38549d8;
import pe3.C47465a;
import rx3.C13598b0;

@C86522b
/* renamed from: fm2.b */
public final class C59253b extends C86301e implements C99933h {

    /* renamed from: d */
    public final String f169425d = "MicroMsg.SecData.SecDataService";

    /* renamed from: fm2.b$a */
    public static final class C59254a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f169426d;

        /* renamed from: e */
        public final /* synthetic */ String f169427e;

        /* renamed from: f */
        public final /* synthetic */ Class<T> f169428f;

        /* renamed from: g */
        public final /* synthetic */ C58325i<T> f169429g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59254a(int i, String str, C59253b bVar, Class<T> cls, C58325i<T> iVar) {
            super(0);
            this.f169426d = i;
            this.f169427e = str;
            this.f169428f = cls;
            this.f169429g = iVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
            if (r0 == null) goto L_0x008c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r12 = this;
                java.lang.Class<gm2.a> r0 = gm2.C59597a.class
                byte[] r1 = i40.C60247c.f171776h
                monitor-enter(r1)
                f40.e r2 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x00a0 }
                r2.mo121108c()     // Catch:{ all -> 0x00a0 }
                java.lang.Class<i40.c> r2 = i40.C60247c.class
                boolean r2 = r2.isAssignableFrom(r0)     // Catch:{ all -> 0x00a0 }
                if (r2 == 0) goto L_0x0098
                androidx.lifecycle.k0 r2 = new androidx.lifecycle.k0     // Catch:{ all -> 0x00a0 }
                f40.e r3 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x00a0 }
                f40.a r3 = r3.f251755f     // Catch:{ all -> 0x00a0 }
                i40.c$a$a r4 = new i40.c$a$a     // Catch:{ all -> 0x00a0 }
                r4.<init>()     // Catch:{ all -> 0x00a0 }
                r2.<init>((androidx.lifecycle.C0123n0) r3, (androidx.lifecycle.C54209k0.C54210b) r4)     // Catch:{ all -> 0x00a0 }
                androidx.lifecycle.i0 r0 = r2.mo75002a(r0)     // Catch:{ all -> 0x00a0 }
                monitor-exit(r1)
                gm2.a r0 = (gm2.C59597a) r0
                java.lang.Class<gm2.d> r1 = gm2.C59598d.class
                com.tencent.mm.sdk.storage.mvvm.MvvmStorage r0 = r0.mo85233d3(r1)
                r1 = r0
                gm2.d r1 = (gm2.C59598d) r1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r2 = r12.f169426d
                r0.append(r2)
                r2 = 95
                r0.append(r2)
                java.lang.String r2 = r12.f169427e
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                gm2.b r0 = r1.mo84614c3(r0)
                r7 = 0
                r8 = 3
                r9 = 0
                if (r0 == 0) goto L_0x008c
                java.lang.Class<T> r2 = r12.f169428f
                dm2.i<T> r10 = r12.f169429g
                if (r2 == 0) goto L_0x0063
                java.lang.Object r2 = r2.newInstance()
                pe3.a r2 = (pe3.C47465a) r2
                r11 = r2
                goto L_0x0064
            L_0x0063:
                r11 = r9
            L_0x0064:
                if (r11 == 0) goto L_0x006d
                byte[] r2 = r0.field_data     // Catch:{ Exception -> 0x006c }
                r11.parseFrom(r2)     // Catch:{ Exception -> 0x006c }
                goto L_0x006d
            L_0x006c:
            L_0x006d:
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r2 = r0
                int r1 = com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage.delete$default(r1, r2, r3, r4, r5, r6)
                if (r1 <= 0) goto L_0x0081
                if (r10 == 0) goto L_0x0089
                r1 = 1
                r10.mo32063a(r8, r1, r0, r11)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x008a
            L_0x0081:
                if (r10 == 0) goto L_0x0089
                r10.mo32063a(r8, r7, r0, r11)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x008a
            L_0x0089:
                r0 = r9
            L_0x008a:
                if (r0 != 0) goto L_0x0095
            L_0x008c:
                dm2.i<T> r0 = r12.f169429g
                if (r0 == 0) goto L_0x0095
                r0.mo32063a(r8, r7, r9, r9)
                rx3.b0 r0 = rx3.C13598b0.f38549a
            L_0x0095:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x0098:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00a0 }
                java.lang.String r2 = "getLiveDB modelClass must extends BaseMvvmDB"
                r0.<init>(r2)     // Catch:{ all -> 0x00a0 }
                throw r0     // Catch:{ all -> 0x00a0 }
            L_0x00a0:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: fm2.C59253b.C59254a.invoke():java.lang.Object");
        }
    }

    /* renamed from: fm2.b$b */
    public static final class C59255b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58325i<T> f169430d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59255b(C58325i<T> iVar) {
            super(0);
            this.f169430d = iVar;
        }

        public Object invoke() {
            C58325i<T> iVar = this.f169430d;
            if (iVar != null) {
                iVar.mo32063a(3, false, (C38549d8) null, null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fm2.b$c */
    public static final class C59256c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f169431d;

        /* renamed from: e */
        public final /* synthetic */ String f169432e;

        /* renamed from: f */
        public final /* synthetic */ Class<T> f169433f;

        /* renamed from: g */
        public final /* synthetic */ C58325i<T> f169434g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59256c(int i, String str, C59253b bVar, Class<T> cls, C58325i<T> iVar) {
            super(0);
            this.f169431d = i;
            this.f169432e = str;
            this.f169433f = cls;
            this.f169434g = iVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
            if (r0 == null) goto L_0x0076;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r6 = this;
                java.lang.Class<gm2.a> r0 = gm2.C59597a.class
                byte[] r1 = i40.C60247c.f171776h
                monitor-enter(r1)
                f40.e r2 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x008b }
                r2.mo121108c()     // Catch:{ all -> 0x008b }
                java.lang.Class<i40.c> r2 = i40.C60247c.class
                boolean r2 = r2.isAssignableFrom(r0)     // Catch:{ all -> 0x008b }
                if (r2 == 0) goto L_0x0083
                androidx.lifecycle.k0 r2 = new androidx.lifecycle.k0     // Catch:{ all -> 0x008b }
                f40.e r3 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x008b }
                f40.a r3 = r3.f251755f     // Catch:{ all -> 0x008b }
                i40.c$a$a r4 = new i40.c$a$a     // Catch:{ all -> 0x008b }
                r4.<init>()     // Catch:{ all -> 0x008b }
                r2.<init>((androidx.lifecycle.C0123n0) r3, (androidx.lifecycle.C54209k0.C54210b) r4)     // Catch:{ all -> 0x008b }
                androidx.lifecycle.i0 r0 = r2.mo75002a(r0)     // Catch:{ all -> 0x008b }
                monitor-exit(r1)
                gm2.a r0 = (gm2.C59597a) r0
                java.lang.Class<gm2.d> r1 = gm2.C59598d.class
                com.tencent.mm.sdk.storage.mvvm.MvvmStorage r0 = r0.mo85233d3(r1)
                gm2.d r0 = (gm2.C59598d) r0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r6.f169431d
                r1.append(r2)
                r2 = 95
                r1.append(r2)
                java.lang.String r2 = r6.f169432e
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                gm2.b r0 = r0.mo84614c3(r1)
                r1 = 3
                r2 = 0
                if (r0 == 0) goto L_0x0076
                java.lang.Class<T> r3 = r6.f169433f
                dm2.i<T> r4 = r6.f169434g
                if (r3 == 0) goto L_0x0060
                java.lang.Object r3 = r3.newInstance()
                pe3.a r3 = (pe3.C47465a) r3
                goto L_0x0061
            L_0x0060:
                r3 = r2
            L_0x0061:
                if (r3 == 0) goto L_0x006a
                byte[] r5 = r0.field_data     // Catch:{ Exception -> 0x0069 }
                r3.parseFrom(r5)     // Catch:{ Exception -> 0x0069 }
                goto L_0x006a
            L_0x0069:
            L_0x006a:
                if (r4 == 0) goto L_0x0073
                r5 = 1
                r4.mo32063a(r1, r5, r0, r3)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x0074
            L_0x0073:
                r0 = r2
            L_0x0074:
                if (r0 != 0) goto L_0x0080
            L_0x0076:
                dm2.i<T> r0 = r6.f169434g
                if (r0 == 0) goto L_0x0080
                r3 = 0
                r0.mo32063a(r1, r3, r2, r2)
                rx3.b0 r0 = rx3.C13598b0.f38549a
            L_0x0080:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x0083:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x008b }
                java.lang.String r2 = "getLiveDB modelClass must extends BaseMvvmDB"
                r0.<init>(r2)     // Catch:{ all -> 0x008b }
                throw r0     // Catch:{ all -> 0x008b }
            L_0x008b:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: fm2.C59253b.C59256c.invoke():java.lang.Object");
        }
    }

    /* renamed from: fm2.b$d */
    public static final class C59257d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58325i<T> f169435d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59257d(C58325i<T> iVar) {
            super(0);
            this.f169435d = iVar;
        }

        public Object invoke() {
            C58325i<T> iVar = this.f169435d;
            if (iVar != null) {
                iVar.mo32063a(0, false, (C38549d8) null, null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fm2.b$e */
    public static final class C59258e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59253b f169436d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59258e(C59253b bVar) {
            super(0);
            this.f169436d = bVar;
        }

        public Object invoke() {
            C39622i0 a;
            long c = C31543z5.m39453c();
            Class cls = C59597a.class;
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (C60247c.class.isAssignableFrom(cls)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            C59598d dVar = (C59598d) ((C59597a) a).mo85233d3(C59598d.class);
            boolean z = C38549d8.f102088o.delete().where(C38549d8.f102089p.smallerThan(String.valueOf(C31543z5.m39453c()))).log(dVar.f170308d).build().run(dVar.getDbProvider().getDB()) > 0;
            String str = dVar.f170308d;
            Log.m105924i(str, "cleanExpireData result:" + z);
            String str2 = this.f169436d.f169425d;
            Log.m105924i(str2, "cleanExpireData cost:" + (C31543z5.m39453c() - c));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fm2.b$f */
    public static final class C59259f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f169437d;

        /* renamed from: e */
        public final /* synthetic */ String f169438e;

        /* renamed from: f */
        public final /* synthetic */ C58325i<T> f169439f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59259f(int i, String str, C58325i<T> iVar) {
            super(0);
            this.f169437d = i;
            this.f169438e = str;
            this.f169439f = iVar;
        }

        public Object invoke() {
            C39622i0 a;
            Class cls = C59597a.class;
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (C60247c.class.isAssignableFrom(cls)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            C59598d dVar = (C59598d) ((C59597a) a).mo85233d3(C59598d.class);
            String str = this.f169437d + '_' + this.f169438e;
            C87412m.m108594g(str, "id");
            C32484b c3 = dVar.mo84614c3(str);
            boolean z = false;
            int delete$default = c3 != null ? MvvmStorage.delete$default(dVar, c3, false, false, 6, (Object) null) : 0;
            C58325i<T> iVar = this.f169439f;
            if (iVar != null) {
                if (delete$default > 0) {
                    z = true;
                }
                iVar.mo32063a(4, z, (C38549d8) null, null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fm2.b$g */
    public static final class C59260g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58325i<T> f169440d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59260g(C58325i<T> iVar) {
            super(0);
            this.f169440d = iVar;
        }

        public Object invoke() {
            C58325i<T> iVar = this.f169440d;
            if (iVar != null) {
                iVar.mo32063a(0, false, (C38549d8) null, null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: BM */
    public <T extends C47465a> void mo84399BM(int i, String str, T t, C58325i<T> iVar) {
        C13598b0 b0Var;
        requireAccountInitialized();
        if (str != null) {
            C61926c.m72661F("SecDBTag", new C59261c(i, str, this, str, t, 259200000, iVar));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C61926c.m72661F("SecDBTag", new C59262d(iVar, t));
        }
    }

    public <T extends C47465a> void D80(int i, String str, C58325i<T> iVar) {
        C13598b0 b0Var;
        requireAccountInitialized();
        if (str != null) {
            C61926c.m72661F("SecDBTag", new C59259f(i, str, iVar));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C61926c.m72661F("SecDBTag", new C59260g(iVar));
        }
    }

    /* renamed from: EA */
    public <T extends C47465a> T mo84401EA(int i, String str, Class<T> cls) {
        C39622i0 a;
        requireAccountInitialized();
        T t = null;
        if (str == null) {
            return null;
        }
        Class cls2 = C59597a.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls2)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls2);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        C32484b c3 = ((C59598d) ((C59597a) a).mo85233d3(C59598d.class)).mo84614c3(i + '_' + str);
        if (c3 != null) {
            if (cls != null) {
                t = (C47465a) cls.newInstance();
            }
            if (t != null) {
                try {
                    t.parseFrom(c3.field_data);
                } catch (Exception unused) {
                }
            }
        }
        return t;
    }

    /* renamed from: PX */
    public <T extends C47465a> T mo84402PX(int i, String str) {
        if (str == null) {
            return null;
        }
        String str2 = i + '_' + str;
        HashMap<String, C47465a> hashMap = C32485c.f86301a;
        return (C47465a) C32485c.f86301a.get(str2);
    }

    public boolean Rr0(int i, String str) {
        C39622i0 a;
        requireAccountInitialized();
        if (str == null) {
            return false;
        }
        Class cls = C59597a.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        C59598d dVar = (C59598d) ((C59597a) a).mo85233d3(C59598d.class);
        String str2 = i + '_' + str;
        C87412m.m108594g(str2, "id");
        C32484b c3 = dVar.mo84614c3(str2);
        return (c3 != null ? MvvmStorage.delete$default(dVar, c3, false, false, 6, (Object) null) : 0) > 0;
    }

    public <T extends C47465a> void at0(int i, String str, Class<T> cls, C58325i<T> iVar) {
        C13598b0 b0Var;
        requireAccountInitialized();
        if (str != null) {
            C61926c.m72661F("SecDBTag", new C59254a(i, str, this, cls, iVar));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C61926c.m72661F("SecDBTag", new C59255b(iVar));
        }
    }

    /* renamed from: cn */
    public void mo84405cn(int i, String str) {
        if (str != null) {
            String str2 = i + '_' + str;
            HashMap<String, C47465a> hashMap = C32485c.f86301a;
            C47465a remove = C32485c.f86301a.remove(str2);
        }
    }

    /* renamed from: lr */
    public <T extends C47465a> void mo84406lr(int i, String str, Class<T> cls, C58325i<T> iVar) {
        C13598b0 b0Var;
        requireAccountInitialized();
        String str2 = this.f169425d;
        Log.m105924i(str2, "getWithoutClear subType:" + i + " id:" + str);
        if (str != null) {
            C61926c.m72661F("SecDBTag", new C59256c(i, str, this, cls, iVar));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C61926c.m72661F("SecDBTag", new C59257d(iVar));
        }
    }

    public void onAccountInitialized(Context context) {
        C39622i0 a;
        C87412m.m108594g(context, "context");
        try {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SEC_DATA_DB_VERSION_INT;
            String str = C86709a0.m107535s().f251807e + "secdata/";
            String str2 = str + "SecData.db";
            if (!C87412m.m108589b(i.mo119685f(aVar, 0), 2)) {
                Log.m105924i(this.f169425d, "diff version, delete old db;");
                C86013q1.m106445f(str);
            }
            Class cls = C59597a.class;
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (C60247c.class.isAssignableFrom(cls)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            if (((C59597a) a).mo85232c3(str2)) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, 2);
            }
            C61926c.m72661F("SecDBTag", new C59258e(this));
        } catch (Exception e) {
            Log.printErrStackTrace(this.f169425d, e, "create sec data db", new Object[0]);
        }
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        HashMap<String, C47465a> hashMap = C32485c.f86301a;
        C32485c.f86301a.clear();
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        super.onCreate(context);
    }

    /* renamed from: yo */
    public <T extends C47465a> void mo84407yo(int i, String str, T t) {
        if (str != null) {
            String str2 = i + '_' + str;
            HashMap<String, C47465a> hashMap = C32485c.f86301a;
            HashMap<String, C47465a> hashMap2 = C32485c.f86301a;
            C87412m.m108592e(t, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProtoBuf");
            hashMap2.put(str2, t);
        }
    }
}
