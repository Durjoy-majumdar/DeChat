package com.tencent.p014mm.plugin.appbrand.report.quality;

import com.tencent.p014mm.plugin.appbrand.jsruntime.C29553m0;
import com.tencent.p014mm.plugin.appbrand.utils.C2049t;
import com.tencent.p014mm.plugin.appbrand.utils.C29680s;
import gy3.C8480h;
import org.xwalk.core.XWalkEnvironment;
import rx3.C13601g;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.n */
public enum C84207n {
    ;
    

    /* renamed from: f */
    public static final C84212e f245956f = null;

    /* renamed from: d */
    public final int f245958d;

    /* renamed from: e */
    public final C84206m f245959e;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.n$a */
    public static final class C84208a implements C84206m {

        /* renamed from: a */
        public static final C84208a f245960a = null;

        static {
            f245960a = new C84208a();
        }

        public final boolean isEnable() {
            return C29553m0.f80469a.mo56809b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.n$b */
    public static final class C84209b implements C84206m {

        /* renamed from: a */
        public static final C84209b f245961a = null;

        static {
            f245961a = new C84209b();
        }

        public final boolean isEnable() {
            return C29553m0.f80469a.mo56809b() && XWalkEnvironment.isCurrentVersionSupportConfigureV8Lite();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.n$c */
    public static final class C84210c implements C84206m {

        /* renamed from: a */
        public static final C84210c f245962a = null;

        static {
            f245962a = new C84210c();
        }

        public final boolean isEnable() {
            return 3 == C29680s.m38859d();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.n$d */
    public static final class C84211d implements C84206m {

        /* renamed from: a */
        public static final C84211d f245963a = null;

        static {
            f245963a = new C84211d();
        }

        public final boolean isEnable() {
            C13601g gVar = C2049t.f11994a;
            return ((Boolean) ((C36570n) C2049t.f11995b).getValue()).booleanValue();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.n$e */
    public static final class C84212e {
        public C84212e(C8480h hVar) {
        }
    }

    /* access modifiers changed from: public */
    static {
        f245956f = new C84212e((C8480h) null);
    }

    /* access modifiers changed from: public */
    C84207n(int i, C84206m mVar) {
        this.f245958d = i;
        this.f245959e = mVar;
    }
}
