package com.tencent.p014mm.appbrand.p942v8;

import com.eclipsesource.mmv8.snapshot.CreateSnapshotResult;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import p774zg.C91694e;

/* renamed from: com.tencent.mm.appbrand.v8.IJSRuntime */
public interface IJSRuntime {

    /* renamed from: com.tencent.mm.appbrand.v8.IJSRuntime$a */
    public interface C80648a {
        /* renamed from: a */
        void mo112457a();

        /* renamed from: b */
        void mo112458b(long j, long j2);
    }

    /* renamed from: A */
    void mo112430A(int i, C83164h hVar);

    /* renamed from: B */
    C80669j mo112431B(int i, int i2);

    /* renamed from: C */
    C80669j mo112432C(int i);

    /* renamed from: D */
    void mo112433D(Runnable runnable, long j);

    /* renamed from: E */
    void mo112434E(Runnable runnable, long j, boolean z);

    /* renamed from: a */
    void mo112435a();

    /* renamed from: d */
    boolean mo112436d();

    /* renamed from: e */
    String mo112437e();

    /* renamed from: g */
    void mo112438g(boolean z);

    Config getConfig();

    /* renamed from: h */
    void mo112440h();

    /* renamed from: i */
    boolean mo112441i();

    /* renamed from: j */
    long mo112442j();

    /* renamed from: m */
    long mo112443m();

    void pause();

    void quit();

    /* renamed from: r */
    void mo112446r();

    void resume();

    /* renamed from: t */
    void mo112448t(int i);

    /* renamed from: u */
    void mo112449u(int i);

    /* renamed from: v */
    void mo112450v(Runnable runnable);

    /* renamed from: w */
    C80669j mo112451w(int i);

    /* renamed from: x */
    void mo112452x(Runnable runnable);

    /* renamed from: y */
    void mo112453y(String str);

    /* renamed from: z */
    void mo112454z(Runnable runnable, boolean z);

    /* renamed from: com.tencent.mm.appbrand.v8.IJSRuntime$Config */
    public static class Config {

        /* renamed from: a */
        public String f235973a;

        /* renamed from: b */
        public String f235974b;

        /* renamed from: c */
        public boolean f235975c;

        /* renamed from: d */
        public byte[] f235976d;

        /* renamed from: e */
        public int f235977e;

        /* renamed from: f */
        public String f235978f;

        /* renamed from: g */
        public boolean f235979g;

        /* renamed from: h */
        public boolean f235980h;

        /* renamed from: i */
        public boolean f235981i;

        /* renamed from: j */
        public boolean f235982j;

        /* renamed from: k */
        public String f235983k;

        /* renamed from: l */
        public int f235984l;

        /* renamed from: m */
        public boolean f235985m;

        /* renamed from: n */
        public WeakReference<C82510g> f235986n;

        /* renamed from: o */
        public C91694e f235987o;

        /* renamed from: p */
        public boolean f235988p;

        /* renamed from: q */
        public C80648a f235989q;

        public Config(String str, byte[] bArr) {
            this.f235974b = null;
            this.f235975c = false;
            this.f235977e = CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX;
            this.f235978f = "0";
            this.f235981i = false;
            this.f235982j = false;
            this.f235983k = "";
            this.f235984l = Integer.MIN_VALUE;
            this.f235985m = false;
            this.f235986n = null;
            this.f235988p = true;
            this.f235989q = null;
            this.f235973a = str;
            this.f235976d = bArr;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Config{codeCache='");
            sb.append(this.f235973a);
            sb.append('\'');
            sb.append(", delaySaveCodeCache=");
            sb.append(this.f235985m);
            sb.append(", snapshotPath='");
            sb.append(this.f235974b);
            sb.append('\'');
            sb.append(", isNodeSnapshot=");
            sb.append(this.f235975c);
            sb.append(", snapShot=");
            sb.append(Util.isNullOrNil(this.f235976d) ? "null" : "not null");
            sb.append(", mainContextSnapshotIndex=");
            sb.append(this.f235977e);
            sb.append(", nativeBuffer='");
            sb.append(this.f235978f);
            sb.append('\'');
            sb.append(", supportDirectEvaluation=");
            sb.append(this.f235979g);
            sb.append(", enableNativeTrans=");
            sb.append(this.f235980h);
            sb.append(", hasGlobalTimer=");
            sb.append(this.f235981i);
            sb.append(", ignoreRemainingTaskWhenLoopEnd=");
            sb.append(this.f235982j);
            sb.append(", globalAlias=");
            sb.append((String) null);
            sb.append(", jsThreadPriority=");
            sb.append(this.f235984l);
            sb.append(", hasComponent=");
            WeakReference<C82510g> weakReference = this.f235986n;
            boolean z = true;
            sb.append((weakReference == null || weakReference.get() == null) ? false : true);
            sb.append(", hasBufferStore=");
            if (this.f235987o == null) {
                z = false;
            }
            sb.append(z);
            sb.append(", enableJavaConsole=");
            sb.append(this.f235988p);
            sb.append('}');
            return sb.toString();
        }

        public boolean useNativeBufferJNI() {
            return "1".equalsIgnoreCase(this.f235978f);
        }

        public Config() {
            this.f235973a = null;
            this.f235974b = null;
            this.f235975c = false;
            this.f235976d = null;
            this.f235977e = CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX;
            this.f235978f = "0";
            this.f235981i = false;
            this.f235982j = false;
            this.f235983k = "";
            this.f235984l = Integer.MIN_VALUE;
            this.f235985m = false;
            this.f235986n = null;
            this.f235988p = true;
            this.f235989q = null;
        }
    }
}
