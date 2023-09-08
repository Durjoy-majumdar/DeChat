package nl2;

import android.content.Context;
import com.tencent.p014mm.plugin.scanner.model.C19021i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import pl2.C21998b;
import pl2.C35526c;
import z04.C112551y;

/* renamed from: nl2.n */
public final class C21678n {

    /* renamed from: f */
    public static final C21679a f61347f = new C21679a((C8480h) null);

    /* renamed from: a */
    public String f61348a = "";

    /* renamed from: b */
    public String f61349b = "";

    /* renamed from: c */
    public String f61350c = "";

    /* renamed from: d */
    public String f61351d = "";

    /* renamed from: e */
    public boolean f61352e;

    /* renamed from: nl2.n$a */
    public static final class C21679a {
        public C21679a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C21678n mo33946a(boolean z, boolean z2) {
            String str;
            String str2;
            String str3;
            Class cls = C35526c.class;
            boolean z3 = true;
            if (z2) {
                C19021i0 i0Var = C19021i0.f53455a;
                String str4 = C21998b.f62253a;
                String str5 = C21998b.f62254b;
                if ((str4.length() > 0) && C86013q1.m106450k(str4)) {
                    if ((str5.length() > 0) && C86013q1.m106450k(str5)) {
                        C21678n nVar = new C21678n();
                        nVar.f61352e = true;
                        nVar.f61348a = str4;
                        nVar.f61351d = str5;
                        return nVar;
                    }
                }
                Log.m105920e("MicroMsg.ScanFocusEngineInitModelParam", "getInitModelParam useXNet and model invalid, use ncnn");
                return mo33946a(z, false);
            }
            C21678n nVar2 = new C21678n();
            nVar2.f61352e = false;
            if (z) {
                C19021i0 i0Var2 = C19021i0.f53455a;
                str = ((C35526c) C86312j.m106911c(cls)).Cx0("detector_model_path");
                if (!(str == null || C112551y.m153811k(str))) {
                    Log.m105924i("MicroMsg.ScanFastFocusEngineManager", "getReidBinFilePath use download file: " + str);
                } else {
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    StringBuilder sb = new StringBuilder();
                    sb.append(context.getFilesDir().getParent() + "/scan_goods/");
                    sb.append("csc_detect_model.bin");
                    str = sb.toString();
                }
            } else {
                Context context2 = MMApplicationContext.getContext();
                C87412m.m108593f(context2, "getContext()");
                StringBuilder sb4 = new StringBuilder();
                sb4.append(context2.getFilesDir().getParent() + "/scan_goods/");
                sb4.append("center_det.bin");
                str = sb4.toString();
            }
            C87412m.m108594g(str, "<set-?>");
            nVar2.f61348a = str;
            if (z) {
                C19021i0 i0Var3 = C19021i0.f53455a;
                str2 = ((C35526c) C86312j.m106911c(cls)).Cx0("detector_param_path");
                if (!(str2 == null || C112551y.m153811k(str2))) {
                    Log.m105924i("MicroMsg.ScanFastFocusEngineManager", "getReidParamFilePath use download file: " + str2);
                } else {
                    Context context3 = MMApplicationContext.getContext();
                    C87412m.m108593f(context3, "getContext()");
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(context3.getFilesDir().getParent() + "/scan_goods/");
                    sb5.append("csc_detect_model.param");
                    str2 = sb5.toString();
                }
            } else {
                Context context4 = MMApplicationContext.getContext();
                C87412m.m108593f(context4, "getContext()");
                StringBuilder sb6 = new StringBuilder();
                sb6.append(context4.getFilesDir().getParent() + "/scan_goods/");
                sb6.append("center_det.param");
                str2 = sb6.toString();
            }
            C87412m.m108594g(str2, "<set-?>");
            nVar2.f61349b = str2;
            String str6 = "";
            if (z) {
                C19021i0 i0Var4 = C19021i0.f53455a;
                str3 = ((C35526c) C86312j.m106911c(cls)).Cx0("scancls_model_path");
                if (!(str3 == null || C112551y.m153811k(str3))) {
                    Log.m105924i("MicroMsg.ScanFastFocusEngineManager", "getScanClsModelFilePath use download file: " + str3);
                } else {
                    Context context5 = MMApplicationContext.getContext();
                    C87412m.m108593f(context5, "getContext()");
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(context5.getFilesDir().getParent() + "/scan_goods/");
                    sb7.append("csc_scancls_model.bin");
                    str3 = sb7.toString();
                }
            } else {
                str3 = str6;
            }
            C87412m.m108594g(str3, "<set-?>");
            nVar2.f61351d = str3;
            if (z) {
                C19021i0 i0Var5 = C19021i0.f53455a;
                String Cx0 = ((C35526c) C86312j.m106911c(cls)).Cx0("scancls_param_path");
                if (Cx0 != null && !C112551y.m153811k(Cx0)) {
                    z3 = false;
                }
                if (!z3) {
                    Log.m105924i("MicroMsg.ScanFastFocusEngineManager", "getScanClsParamFilePath use download file: " + Cx0);
                } else {
                    Context context6 = MMApplicationContext.getContext();
                    C87412m.m108593f(context6, "getContext()");
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(context6.getFilesDir().getParent() + "/scan_goods/");
                    sb8.append("csc_scancls_model.param");
                    Cx0 = sb8.toString();
                }
                str6 = Cx0;
            }
            C87412m.m108594g(str6, "<set-?>");
            nVar2.f61350c = str6;
            return nVar2;
        }
    }
}
