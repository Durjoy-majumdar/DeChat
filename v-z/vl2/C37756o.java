package vl2;

import android.content.Context;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.FilesCopy;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32224a;
import gt3.C20839a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112551y;

/* renamed from: vl2.o */
public final class C37756o {

    /* renamed from: a */
    public static final C37756o f100004a = new C37756o();

    /* renamed from: b */
    public static boolean f100005b;

    /* renamed from: c */
    public static MultiProcessMMKV f100006c;

    /* renamed from: d */
    public static final C13601g f100007d = C36568h.m40985a(C37759d.f100024d);

    /* renamed from: e */
    public static final C13601g f100008e = C36568h.m40985a(C37760e.f100025d);

    /* renamed from: f */
    public static final C13601g f100009f = C36568h.m40985a(C37761f.f100026d);

    /* renamed from: g */
    public static final C13601g f100010g = C36568h.m40985a(C14907l.f40939d);

    /* renamed from: h */
    public static final C13601g f100011h = C36568h.m40985a(C14901c.f40933d);

    /* renamed from: i */
    public static boolean f100012i;

    /* renamed from: j */
    public static final C13601g f100013j = C36568h.m40985a(C14902g.f40934d);

    /* renamed from: k */
    public static final C13601g f100014k = C36568h.m40985a(C14903h.f40935d);

    /* renamed from: l */
    public static final C13601g f100015l = C36568h.m40985a(C14904i.f40936d);

    /* renamed from: vl2.o$c */
    public static final class C14901c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C14901c f40933d = new C14901c();

        public C14901c() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            int i = 7000;
            if (hVar != null) {
                i = hVar.mo58779Qe(C32735h.C32737c.clicfg_qbar_code_no_recognize_duration, 7000);
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: vl2.o$g */
    public static final class C14902g extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C14902g f40934d = new C14902g();

        public C14902g() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            boolean z = false;
            if (hVar != null && hVar.mo58779Qe(C32735h.C32737c.clicfg_qbar_engine_opt_forcedm, 1) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: vl2.o$h */
    public static final class C14903h extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C14903h f40935d = new C14903h();

        public C14903h() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar;
            boolean z = false;
            if (!BuildInfo.IS_ARM64 && (hVar = (C32735h) C86312j.m106911c(C32735h.class)) != null && hVar.mo58779Qe(C32735h.C32737c.clicfg_qbar_engine_opt_forcedm_forbin_for_arm32, 0) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: vl2.o$i */
    public static final class C14904i extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C14904i f40936d = new C14904i();

        public C14904i() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            boolean z = true;
            if (!(hVar != null && hVar.mo58779Qe(C32735h.C32737c.clicfg_qbar_engine_opt_enable_segmentation_model, 0) == 1) && !BuildInfo.DEBUG) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: vl2.o$j */
    public static final class C14905j extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C14905j f40937d = new C14905j();

        public C14905j() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            boolean z = true;
            if (hVar == null || hVar.mo58779Qe(C32735h.C32737c.clicfg_qbar_engine_opt_use_new_detect_model, 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: vl2.o$k */
    public static final class C14906k extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C14906k f40938d = new C14906k();

        public C14906k() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            boolean z = true;
            if (hVar == null || hVar.mo58779Qe(C32735h.C32737c.clicfg_qbar_engine_opt_use_new_sr_model, 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: vl2.o$l */
    public static final class C14907l extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C14907l f40939d = new C14907l();

        public C14907l() {
            super(0);
        }

        public Object invoke() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: vl2.o$a */
    public enum C37757a {
        DETECT_MODEL,
        SR_MODEL,
        SEGMENTATION_MODEL
    }

    /* renamed from: vl2.o$b */
    public static final class C37758b {

        /* renamed from: a */
        public final C37757a f100020a;

        /* renamed from: b */
        public final String f100021b;

        /* renamed from: c */
        public final String f100022c;

        /* renamed from: d */
        public final String f100023d;

        public C37758b(C37757a aVar, String str, String str2, String str3) {
            C87412m.m108594g(aVar, "modelType");
            C87412m.m108594g(str, "modelVersion");
            C87412m.m108594g(str2, "modelAssetPath");
            C87412m.m108594g(str3, "modelFileMd5");
            this.f100020a = aVar;
            this.f100021b = str;
            this.f100022c = str2;
            this.f100023d = str3;
        }
    }

    /* renamed from: vl2.o$d */
    public static final class C37759d extends C87413o implements C32224a<C37758b> {

        /* renamed from: d */
        public static final C37759d f100024d = new C37759d();

        public C37759d() {
            super(0);
        }

        public Object invoke() {
            return new C37758b(C37757a.DETECT_MODEL, "V1.1.0.26", "qbar/V1.1.0.26/qbar_detect.xnet", "71269de4750511e0d5dd7a03cac7c98c");
        }
    }

    /* renamed from: vl2.o$e */
    public static final class C37760e extends C87413o implements C32224a<C37758b> {

        /* renamed from: d */
        public static final C37760e f100025d = new C37760e();

        public C37760e() {
            super(0);
        }

        public Object invoke() {
            return new C37758b(C37757a.SR_MODEL, "V1.1.0.26", "qbar/V1.1.0.26/qbar_sr.xnet", "77eae5760b12f7cae7ebf8dfc2d75003");
        }
    }

    /* renamed from: vl2.o$f */
    public static final class C37761f extends C87413o implements C32224a<C37758b> {

        /* renamed from: d */
        public static final C37761f f100026d = new C37761f();

        public C37761f() {
            super(0);
        }

        public Object invoke() {
            return new C37758b(C37757a.SEGMENTATION_MODEL, "V1.1.0.26", "qbar/V1.1.0.26/qbar_seg.xnet", "ff8305fcb1c7dba3118555c7e53d37a2");
        }
    }

    static {
        C36568h.m40985a(C14905j.f40937d);
        C36568h.m40985a(C14906k.f40938d);
    }

    /* renamed from: a */
    public static final boolean m41529a() {
        return BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED;
    }

    /* renamed from: d */
    public static final int m41530d() {
        StringBuilder sb = new StringBuilder();
        sb.append("getNoRecognizeDuration:");
        C13601g gVar = f100011h;
        sb.append(((Number) ((C36570n) gVar).getValue()).intValue());
        Log.m105924i("MicroMsg.ScanDebugUtil", sb.toString());
        return ((Number) ((C36570n) gVar).getValue()).intValue();
    }

    /* renamed from: e */
    public static final int m41531e() {
        return ((Boolean) ((C36570n) f100010g).getValue()).booleanValue() ? 1 : 0;
    }

    /* renamed from: f */
    public static final void m41532f() {
        C37756o oVar = f100004a;
        boolean z = true;
        if (((Boolean) ((C36570n) f100010g).getValue()).booleanValue()) {
            C20839a.f58859i = 1;
            com.tencent.stubs.logger.Log.m106505i("ScanUtil", "setQbarBackend:1");
            C20839a.f58861k = true;
            com.tencent.stubs.logger.Log.m106505i("ScanUtil", "setQBarOptDet :true");
            C20839a.f58860j = true;
            com.tencent.stubs.logger.Log.m106505i("ScanUtil", "setQBarOptSr :true");
            boolean booleanValue = ((Boolean) ((C36570n) f100013j).getValue()).booleanValue();
            C20839a.f58862l = booleanValue;
            com.tencent.stubs.logger.Log.m106505i("ScanUtil", "setQBarOptForceDM :" + booleanValue);
            C20839a.f58863m = true;
            com.tencent.stubs.logger.Log.m106505i("ScanUtil", "setQbarOptLibdmtx :true");
            Context context = MMApplicationContext.getContext();
            String str = ((C37758b) ((C36570n) f100007d).getValue()).f100021b;
            C20839a.f58852b = str;
            C20839a.f58853c = "";
            com.tencent.stubs.logger.Log.m106506i("ScanUtil", "setDetectModelVersion %s", str);
            String str2 = C20839a.f58852b;
            if (str2 == null || str2.isEmpty()) {
                com.tencent.stubs.logger.Log.m106498e("ScanUtil", "setDetectModelVersion invalid version: %s", str);
            } else {
                String c = C20839a.m22867c(context);
                if (c != null && !c.isEmpty()) {
                    C20839a.f58853c = c + C20839a.f58852b.toUpperCase() + "/" + "qbar_detect.xnet";
                }
            }
            Context context2 = MMApplicationContext.getContext();
            String str3 = ((C37758b) ((C36570n) f100008e).getValue()).f100021b;
            C20839a.f58854d = str3;
            C20839a.f58855e = "";
            com.tencent.stubs.logger.Log.m106506i("ScanUtil", "setSRModelVersion %s", str3);
            String str4 = C20839a.f58854d;
            if (str4 == null || str4.isEmpty()) {
                com.tencent.stubs.logger.Log.m106498e("ScanUtil", "setSRModelVersion invalid version: %s", str3);
            } else {
                String c2 = C20839a.m22867c(context2);
                if (c2 != null && !c2.isEmpty()) {
                    C20839a.f58855e = c2 + C20839a.f58854d.toUpperCase() + "/" + "qbar_sr.xnet";
                }
            }
            boolean booleanValue2 = ((Boolean) ((C36570n) f100015l).getValue()).booleanValue();
            C20839a.f58856f = booleanValue2;
            com.tencent.stubs.logger.Log.m106505i("ScanUtil", "setEnableSeg:" + booleanValue2);
            Context context3 = MMApplicationContext.getContext();
            String str5 = ((C37758b) ((C36570n) f100009f).getValue()).f100021b;
            C20839a.f58857g = str5;
            C20839a.f58858h = "";
            com.tencent.stubs.logger.Log.m106506i("ScanUtil", "setSegmentationModelVersion %s", str5);
            String str6 = C20839a.f58857g;
            if (str6 == null || str6.isEmpty()) {
                com.tencent.stubs.logger.Log.m106498e("ScanUtil", "setSegmentationModelVersion invalid version: %s", C20839a.f58857g);
            } else {
                String c3 = C20839a.m22867c(context3);
                if (c3 != null && !c3.isEmpty()) {
                    C20839a.f58858h = c3 + C20839a.f58857g.toUpperCase() + "/" + "qbar_seg.xnet";
                }
            }
        }
        Context context4 = MMApplicationContext.getContext();
        C87412m.m108593f(context4, "getContext()");
        if (f100012i) {
            Log.m105928w("MicroMsg.ScanDebugUtil", "shouldCheckQBarAIModelFile isChecked, do not check again");
            z = false;
        } else {
            f100012i = true;
            Log.m105924i("MicroMsg.ScanDebugUtil", "shouldCheckQBarAIModelFile qBarAIModeFileIsChecked " + f100012i);
        }
        if (z) {
            try {
                String str7 = C20839a.f58853c;
                String str8 = C20839a.f58855e;
                String str9 = C20839a.f58858h;
                Log.m105924i("MicroMsg.ScanDebugUtil", "checkAndCopyAIModelFileIfNeed detectModelPath: " + str7 + ", srModelPath: " + str8 + ", segmentationModelPath: " + str9);
                oVar.mo61326b(context4, (C37758b) ((C36570n) f100007d).getValue(), str7);
                oVar.mo61326b(context4, (C37758b) ((C36570n) f100008e).getValue(), str8);
                if (((Boolean) ((C36570n) f100015l).getValue()).booleanValue()) {
                    oVar.mo61326b(context4, (C37758b) ((C36570n) f100009f).getValue(), str9);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ScanDebugUtil", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public final void mo61326b(Context context, C37758b bVar, String str) {
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            C37756o oVar = f100004a;
            String str2 = bVar.f100022c;
            String str3 = bVar.f100023d;
            try {
                if (!C86013q1.m106450k(str)) {
                    oVar.mo61327c(str);
                    FilesCopy.copyAssets(context, str2, str);
                    String q = C86013q1.m106456q(str);
                    Log.m105925i("MicroMsg.ScanDebugUtil", "ensureFileComplete file not exists, srcAssetFilePath: %s, destFilePath: %s, targetMD5: %s, fileMD5: %s", str2, str, str3, q);
                    if (!C112551y.m153809i(str3, q, true)) {
                        Log.m105920e("MicroMsg.ScanDebugUtil", "ensureFileComplete checkMd5 failed");
                    }
                } else {
                    String q2 = C86013q1.m106456q(str);
                    if (C112551y.m153809i(str3, q2, true)) {
                        Log.m105925i("MicroMsg.ScanDebugUtil", "ensureFileComplete file is complete, srcAssetFilePath: %s, destFilePath: %s, targetMD5: %s, fileMD5: %s", str2, str, str3, q2);
                    } else {
                        C86013q1.m106447h(str);
                        oVar.mo61327c(str);
                        FilesCopy.copyAssets(context, str2, str);
                        String q3 = C86013q1.m106456q(str);
                        if (C112551y.m153809i(str3, q3, true)) {
                            Log.m105929w("MicroMsg.ScanDebugUtil", "ensureFileComplete copy file is complete, srcAssetFilePath: %s, destFilePath: %s, targetMD5: %s, copyFileMD5: %s", str2, str, str3, q3);
                        } else {
                            Log.m105921e("MicroMsg.ScanDebugUtil", "ensureFileComplete copy file fail, srcAssetFilePath: %s, destFilePath: %s, targetMD5: %s, copyFileMD5: %s", str2, str, str3, q3);
                        }
                    }
                }
                z = true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ScanDebugUtil", e, "ensureFileComplete", new Object[0]);
            }
        } else {
            Log.m105920e("MicroMsg.ScanDebugUtil", "checkAndCopyAIModelFileIfNeed " + bVar.f100020a + " is empty");
        }
        if (!z) {
            Log.m105920e("MicroMsg.ScanDebugUtil", "ensureModelValid failed type: " + bVar.f100020a + ", modelPath: " + str);
            int ordinal = bVar.f100020a.ordinal();
            if (ordinal == 0) {
                C115669n.INSTANCE.mo175911u(1259, 240);
            } else if (ordinal == 1) {
                C115669n.INSTANCE.mo175911u(1259, 241);
            } else if (ordinal == 2) {
                C115669n.INSTANCE.mo175911u(1259, 243);
            }
        }
    }

    /* renamed from: c */
    public final void mo61327c(String str) {
        try {
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.ScanDebugUtil", "ensureParentDirExists  destFilePath is empty");
                return;
            }
            C86009m1 l = new C86009m1(str).mo119974l();
            if (l == null) {
                Log.m105920e("MicroMsg.ScanDebugUtil", "ensureParentDirExists  parentFile == null, destFilePath: " + str);
                return;
            }
            if (l.mo119967g()) {
                if (l.mo119977o()) {
                    Log.m105924i("MicroMsg.ScanDebugUtil", "ensureParentDirExists parentFile is exists: " + l);
                    return;
                }
            }
            Log.m105929w("MicroMsg.ScanDebugUtil", "ensureParentDirExists  do make dir , parentFile: %s, exists : %b, result: %b, isDirectory: %b", l.mo119971i(), Boolean.valueOf(l.mo119967g()), Boolean.valueOf(l.mo119977o()), Boolean.valueOf(l.mo119987x()));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanDebugUtil", e, "ensureParentDirExists", new Object[0]);
        }
    }
}
