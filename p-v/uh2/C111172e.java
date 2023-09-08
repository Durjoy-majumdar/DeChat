package uh2;

import a70.C112760b;
import com.tencent.p014mm.plugin.recordvideo.res.BaseVideoResLogic;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;

/* renamed from: uh2.e */
public final class C111172e {

    /* renamed from: a */
    public static final String[] f332950a = {"libpag", "libvlog_pag"};

    /* renamed from: b */
    public static final BaseVideoResLogic f332951b = (BuildInfo.IS_ARM64 ? C111174b.f332954d : C111173a.f332952d);

    /* renamed from: uh2.e$a */
    public static final class C111173a extends BaseVideoResLogic {

        /* renamed from: d */
        public static final C111173a f332952d = new C111173a();

        /* renamed from: e */
        public static final C111178i f332953e = new C111178i(60);

        /* renamed from: d */
        public String mo151274d() {
            return "pag_lib_32/";
        }

        /* renamed from: e */
        public String[] mo151275e() {
            return C111172e.f332950a;
        }

        /* renamed from: f */
        public C111170b mo151276f() {
            return f332953e;
        }

        /* renamed from: g */
        public String mo151277g() {
            return C112760b.m154231g() + "pag_lib_32/";
        }

        /* renamed from: i */
        public int mo151279i() {
            return 78;
        }

        /* renamed from: j */
        public String mo151280j() {
            String[] strArr = C111172e.f332950a;
            return "MicroMsg.VLogPagResLogic32";
        }
    }

    /* renamed from: uh2.e$b */
    public static final class C111174b extends BaseVideoResLogic {

        /* renamed from: d */
        public static final C111174b f332954d = new C111174b();

        /* renamed from: e */
        public static final C111178i f332955e = new C111178i(40);

        /* renamed from: d */
        public String mo151274d() {
            return "pag_lib_64/";
        }

        /* renamed from: e */
        public String[] mo151275e() {
            return C111172e.f332950a;
        }

        /* renamed from: f */
        public C111170b mo151276f() {
            return f332955e;
        }

        /* renamed from: g */
        public String mo151277g() {
            return C112760b.m154231g() + "pag_lib_64/";
        }

        /* renamed from: i */
        public int mo151279i() {
            return 77;
        }

        /* renamed from: j */
        public String mo151280j() {
            String[] strArr = C111172e.f332950a;
            return "MicroMsg.VLogPagResLogic64";
        }
    }
}
