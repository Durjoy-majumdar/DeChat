package vr2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.C5177x;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdProxyUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.qbar.C19931a;
import com.tencent.qbar.C19934c;
import com.tencent.qbar.WxQbarNative;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.List;
import k20.C9556a;
import org.json.JSONObject;
import p200lx.C46896e0;
import p200lx.C46900z;
import p200lx.C61416x;
import p200lx.C99712h0;
import p200lx.C99716u;
import qo3.C77407n;
import qs2.C101271i0;

/* renamed from: vr2.n */
public final class C102251n {

    /* renamed from: a */
    public Context f301135a;

    /* renamed from: b */
    public C77407n f301136b;

    /* renamed from: c */
    public C46900z f301137c;

    /* renamed from: d */
    public int f301138d;

    /* renamed from: e */
    public int f301139e;

    /* renamed from: f */
    public volatile String f301140f;

    /* renamed from: g */
    public int f301141g = 0;

    /* renamed from: h */
    public String f301142h;

    /* renamed from: i */
    public String f301143i;

    /* renamed from: j */
    public C101271i0 f301144j;

    /* renamed from: k */
    public int f301145k;

    /* renamed from: l */
    public String f301146l;

    /* renamed from: m */
    public int f301147m;

    /* renamed from: n */
    public String f301148n;

    /* renamed from: o */
    public WeakReference<Context> f301149o;

    /* renamed from: p */
    public Bundle f301150p;

    /* renamed from: vr2.n$a */
    public class C102252a implements C99712h0.C99713a {

        /* renamed from: a */
        public final /* synthetic */ C102257c f301151a;

        /* renamed from: b */
        public final /* synthetic */ String f301152b;

        /* renamed from: vr2.n$a$a */
        public class C102253a implements AdLandingPagesProxy.C94830p {

            /* renamed from: vr2.n$a$a$a */
            public class C102254a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ Object f301155d;

                /* renamed from: e */
                public final /* synthetic */ int f301156e;

                public C102254a(Object obj, int i) {
                    this.f301155d = obj;
                    this.f301156e = i;
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1$1");
                    try {
                        C102251n nVar = C102251n.this;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                        C46900z zVar = nVar.f301137c;
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                        ScanCodeSheetItemLogic scanCodeSheetItemLogic = (ScanCodeSheetItemLogic) zVar;
                        scanCodeSheetItemLogic.mo67084o(this.f301156e, (byte[]) this.f301155d);
                        C102251n.m134806a(C102251n.this).mo107573q();
                    } catch (Throwable unused) {
                        Log.m105920e("SnsAdQRHelper", "there is something wrong in AdLandingPagesProxy call back");
                    }
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1$1");
                }
            }

            public C102253a() {
            }

            /* renamed from: a */
            public void mo10855a(Object obj) {
                SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1");
                SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1");
            }

            /* renamed from: b */
            public void mo10856b(int i, int i2, Object obj) {
                SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1");
                StringBuilder sb = new StringBuilder();
                sb.append("fetchQRCodeInfo, errType=");
                sb.append(i);
                sb.append(", data==null?");
                sb.append(obj == null);
                Log.m105924i("SnsAdQRHelper", sb.toString());
                if (!TextUtils.isEmpty(C102251n.m134808c(C102251n.this))) {
                    MMHandlerThread.postToMainThread(new C102254a(obj, i));
                    C102252a aVar = C102252a.this;
                    C102257c cVar = aVar.f301151a;
                    if (cVar == null || i != 0) {
                        cVar.mo131644a(aVar.f301152b, false, " errType!=MM_OK", C102251n.m134810e(C102251n.this));
                    } else {
                        cVar.mo131644a(aVar.f301152b, true, "", C102251n.m134810e(C102251n.this));
                    }
                } else {
                    Log.m105920e("SnsAdQRHelper", "the qr code string is empty in AdLandingPagesProxy call back");
                    C102252a aVar2 = C102252a.this;
                    C102257c cVar2 = aVar2.f301151a;
                    if (cVar2 != null) {
                        cVar2.mo131644a(aVar2.f301152b, false, "fetchQRCodeInfo empty", C102251n.m134810e(C102251n.this));
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1");
            }
        }

        /* renamed from: vr2.n$a$b */
        public class C102255b implements Runnable {
            public C102255b() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$2");
                C102251n.m134806a(C102251n.this).mo107573q();
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$2");
            }
        }

        public C102252a(C102257c cVar, String str) {
            this.f301151a = cVar;
            this.f301152b = str;
        }

        /* renamed from: a */
        public void mo24342a(long j, C99712h0.C99715c cVar) {
            SnsMethodCalculate.markStartTimeMs("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4");
            List<WxQbarNative.QBarReportMsg> list = null;
            List<C19931a.C19932a> list2 = cVar != null ? cVar.f292251a : null;
            if (cVar != null) {
                list = cVar.f292253c;
            }
            if (list2 == null || list2.size() <= 0) {
                Log.m105920e("SnsAdQRHelper", "afterDecode, results is empty");
                C102251n.this.mo141819m("", false);
                C102257c cVar2 = this.f301151a;
                if (cVar2 != null) {
                    cVar2.mo131644a(this.f301152b, false, "QR result is empty", C102251n.m134810e(C102251n.this));
                }
                C102251n.this.mo141818l();
            } else {
                int a = C5177x.m5204a(list2.get(0).f56828e);
                String str = list2.get(0).f56829f;
                int i = -1;
                if (list != null && !list.isEmpty()) {
                    i = list.get(0).qrcodeVersion;
                }
                Log.m105924i("SnsAdQRHelper", "QRCodeStr=" + str + ", QRCodeType=" + a + ", QRCodeVer=" + i);
                if (!C102251n.this.mo141815i(a, str)) {
                    Log.m105920e("SnsAdQRHelper", "isValidQRCode=false");
                    C102251n.this.mo141819m(Util.nullAsNil(str), false);
                    C102257c cVar3 = this.f301151a;
                    if (cVar3 != null) {
                        cVar3.mo131644a(this.f301152b, false, "inValid QRCode", C102251n.m134810e(C102251n.this));
                    }
                    C102251n.this.mo141818l();
                    SnsMethodCalculate.markEndTimeMs("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4");
                    return;
                }
                C102251n nVar = C102251n.this;
                SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                nVar.f301138d = a;
                SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                C102251n nVar2 = C102251n.this;
                SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                nVar2.f301140f = str;
                SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                C102251n nVar3 = C102251n.this;
                SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                nVar3.f301139e = i;
                SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                C102251n nVar4 = C102251n.this;
                nVar4.mo141819m(C102251n.m134808c(nVar4), !TextUtils.isEmpty(C102251n.m134808c(C102251n.this)));
                AdLandingPagesProxy.getInstance().fetchQRCodeInfo(C102251n.m134809d(C102251n.this), C102251n.m134808c(C102251n.this), new C102253a());
                MMHandlerThread.postToMainThread(new C102255b());
            }
            SnsMethodCalculate.markEndTimeMs("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4");
        }
    }

    /* renamed from: vr2.n$b */
    public class C102256b implements C99712h0.C99713a {

        /* renamed from: a */
        public final /* synthetic */ C102257c f301159a;

        /* renamed from: b */
        public final /* synthetic */ String f301160b;

        public C102256b(C102257c cVar, String str) {
            this.f301159a = cVar;
            this.f301160b = str;
        }

        /* renamed from: a */
        public void mo24342a(long j, C99712h0.C99715c cVar) {
            C99712h0.C99715c cVar2 = cVar;
            SnsMethodCalculate.markStartTimeMs("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$5");
            List<WxQbarNative.QBarReportMsg> list = null;
            List<C19931a.C19932a> list2 = cVar2 != null ? cVar2.f292251a : null;
            if (cVar2 != null) {
                list = cVar2.f292253c;
            }
            if (list2 == null || list2.size() <= 0) {
                Log.m105920e("SnsAdQRHelper", "afterDecode, results is empty");
                C102251n.this.mo141819m("", false);
                C102257c cVar3 = this.f301159a;
                if (cVar3 != null) {
                    cVar3.mo131644a(this.f301160b, false, "QR result is empty", C102251n.m134810e(C102251n.this));
                }
            } else {
                int a = C5177x.m5204a(list2.get(0).f56828e);
                String str = list2.get(0).f56829f;
                int i = -1;
                if (list != null && !list.isEmpty()) {
                    i = list.get(0).qrcodeVersion;
                }
                Log.m105924i("SnsAdQRHelper", "QRCodeStr=" + str + ", QRCodeType=" + a + ", QRCodeVer=" + i);
                if (!C102251n.this.mo141815i(a, str)) {
                    Log.m105920e("SnsAdQRHelper", "isValidQRCode=false");
                    C102251n.this.mo141819m(Util.nullAsNil(str), false);
                    C102257c cVar4 = this.f301159a;
                    if (cVar4 != null) {
                        cVar4.mo131644a(this.f301160b, false, "inValid QRCode", C102251n.m134810e(C102251n.this));
                    }
                    C102251n.this.mo141818l();
                    SnsMethodCalculate.markEndTimeMs("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$5");
                    return;
                }
                C102251n nVar = C102251n.this;
                SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                nVar.f301138d = a;
                SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                C102251n nVar2 = C102251n.this;
                SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                nVar2.f301140f = str;
                SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                C102251n nVar3 = C102251n.this;
                SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                nVar3.f301139e = i;
                SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                C102251n nVar4 = C102251n.this;
                nVar4.mo141819m(C102251n.m134808c(nVar4), !TextUtils.isEmpty(C102251n.m134808c(C102251n.this)));
                Log.m105924i("SnsAdQRHelper", "onClickDirect createIntent");
                Intent intent = new Intent(C102251n.m134807b(C102251n.this), SnsAdProxyUI.class);
                intent.putExtra("action_type", 1);
                intent.putExtra("qrcodeStr", C102251n.m134808c(C102251n.this));
                intent.putExtra("qrcodeType", C102251n.m134809d(C102251n.this));
                C102251n nVar5 = C102251n.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                int i2 = nVar5.f301139e;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                intent.putExtra("qrcodeVer", i2);
                Context b = C102251n.m134807b(C102251n.this);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context = b;
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/data/SnsAdQRHelper$5", "afterDecode", "(JLcom/tencent/mm/feature/scanner/api/IWxFileDecodeQueue$ScanCodeForFileResult;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                b.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/sns/data/SnsAdQRHelper$5", "afterDecode", "(JLcom/tencent/mm/feature/scanner/api/IWxFileDecodeQueue$ScanCodeForFileResult;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                if (C102251n.m134807b(C102251n.this) instanceof Activity) {
                    ((Activity) C102251n.m134807b(C102251n.this)).overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
                }
                C102251n nVar6 = C102251n.this;
                nVar6.mo141821o(C102251n.m134808c(nVar6), !TextUtils.isEmpty(C102251n.m134808c(C102251n.this)));
                C102257c cVar5 = this.f301159a;
                if (cVar5 != null) {
                    cVar5.mo131644a(this.f301160b, true, "", C102251n.m134810e(C102251n.this));
                }
            }
            C102251n.this.mo141818l();
            SnsMethodCalculate.markEndTimeMs("afterDecode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$5");
        }
    }

    /* renamed from: vr2.n$c */
    public interface C102257c {
        /* renamed from: a */
        void mo131644a(String str, boolean z, String str2, Bundle bundle);
    }

    public C102251n(Context context, C101271i0 i0Var, int i, Bundle bundle) {
        this.f301135a = context;
        this.f301144j = i0Var;
        this.f301145k = i;
        SnsMethodCalculate.markStartTimeMs("initScanCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        if (this.f301137c != null) {
            SnsMethodCalculate.markEndTimeMs("initScanCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        } else {
            this.f301136b = new C77407n(this.f301135a, 1, false);
            this.f301137c = ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71992oj(this.f301135a);
            C77407n nVar = this.f301136b;
            nVar.f225779n1 = true;
            nVar.f225771i = new C102248k(this);
            nVar.f225761d = new C102249l(this);
            SnsMethodCalculate.markEndTimeMs("initScanCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        }
        this.f301150p = bundle;
        SnsMethodCalculate.markStartTimeMs("parseExtraParams", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        try {
            this.f301146l = Util.nullAs(IntentUtil.getString(bundle, "qrExtInfo"), "");
            this.f301147m = IntentUtil.getInt(bundle, "qrIsDirectJump", 0);
        } catch (Throwable unused) {
            Log.m105920e("SnsAdQRHelper", "there is something wrong in parseExtraParams");
        }
        SnsMethodCalculate.markEndTimeMs("parseExtraParams", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    /* renamed from: a */
    public static /* synthetic */ C77407n m134806a(C102251n nVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        C77407n nVar2 = nVar.f301136b;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return nVar2;
    }

    /* renamed from: b */
    public static /* synthetic */ Context m134807b(C102251n nVar) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        Context context = nVar.f301135a;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return context;
    }

    /* renamed from: c */
    public static /* synthetic */ String m134808c(C102251n nVar) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        String str = nVar.f301140f;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return str;
    }

    /* renamed from: d */
    public static /* synthetic */ int m134809d(C102251n nVar) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        int i = nVar.f301138d;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return i;
    }

    /* renamed from: e */
    public static /* synthetic */ Bundle m134810e(C102251n nVar) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        Bundle bundle = nVar.f301150p;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return bundle;
    }

    /* renamed from: g */
    public static JSONObject m134811g(int i, String str, String str2, int i2) {
        SnsMethodCalculate.markStartTimeMs("buildExtData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("qrResult", i);
            jSONObject.put("qrUrl", Util.nullAs(str2, ""));
            jSONObject.put("qrResultUrlType", i2);
            jSONObject.put("qrResultUrl", str);
        } catch (Exception e) {
            Log.m105920e("SnsAdQRHelper", "buildExtDataForSearchJsapi exp: " + e);
        }
        SnsMethodCalculate.markEndTimeMs("buildExtData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return jSONObject;
    }

    /* renamed from: p */
    public static void m134812p(int i, String str, String str2, String str3, int i2) {
        SnsMethodCalculate.markStartTimeMs("reportScanResultForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        SnsMethodCalculate.markStartTimeMs("buildCgiReportData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("extInfo", m134811g(i, str, str2, i2));
            jSONObject.put("uxinfo", Util.nullAs(str3, ""));
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        } catch (Exception e) {
            Log.m105920e("SnsAdQRHelper", "buildCgiReportDataForSearchJsapi exp: " + e);
        }
        String jSONObject2 = jSONObject.toString();
        Log.m105924i("SnsAdQRHelper", "buildCgiReportDataForSearchJsapi ret: " + jSONObject2);
        SnsMethodCalculate.markEndTimeMs("buildCgiReportData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        C102260r.m134858a("search_ad_jsapi_qr_scan_result", jSONObject2);
        SnsMethodCalculate.markEndTimeMs("reportScanResultForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    /* renamed from: f */
    public String mo141813f(int i, String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("buildCgiReportData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        JSONObject jSONObject = new JSONObject();
        try {
            C101271i0 i0Var = this.f301144j;
            JSONObject h = mo141814h(i, str, z);
            String nullAsNil = Util.nullAsNil(i0Var.mo140745l());
            String h2 = i0Var.mo140741h();
            int i2 = i0Var.mo140742i();
            long safeParseLong = Util.safeParseLong(i0Var.mo140737d());
            jSONObject.put("extInfo", h);
            jSONObject.put("uxinfo", nullAsNil);
            jSONObject.put("snsId", h2);
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i2);
            jSONObject.put("canvasId", safeParseLong);
            if (!TextUtils.isEmpty(i0Var.mo140734a())) {
                jSONObject.put("adExtInfo", i0Var.mo140734a());
            }
        } catch (Exception e) {
            Log.m105920e("SnsAdQRHelper", "buildCgiReportData exp:" + e.toString());
        }
        String jSONObject2 = jSONObject.toString();
        Log.m105918d("SnsAdQRHelper", "buildCgiReportData ret=" + jSONObject2);
        SnsMethodCalculate.markEndTimeMs("buildCgiReportData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return jSONObject2;
    }

    /* renamed from: h */
    public JSONObject mo141814h(int i, String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("buildExtData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", i);
            jSONObject.put("qrResult", z ? 0 : 1);
            jSONObject.put("qrUrl", this.f301143i);
            jSONObject.put("qrResultUrl", str);
            jSONObject.put("qrExtInfo", this.f301146l);
            jSONObject.put("directJump", this.f301147m);
            int i2 = this.f301141g;
            if (i2 != 0) {
                jSONObject.put("qrResultUrlType", i2);
            }
        } catch (Exception e) {
            Log.m105920e("SnsAdQRHelper", "buildKVData exp:" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("buildExtData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return jSONObject;
    }

    /* renamed from: i */
    public boolean mo141815i(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return false;
        }
        C61416x xVar = (C61416x) C86312j.m106911c(C61416x.class);
        if (xVar.mo71999h3(i, str)) {
            this.f301141g = 2;
            SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        } else if (xVar.mo71997TM(i, str)) {
            this.f301141g = 3;
            SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        } else if (xVar.mo72000oi(i, str)) {
            this.f301141g = 4;
            SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        } else if (xVar.mo72003sl(i, str)) {
            this.f301141g = 5;
            SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        } else if (xVar.mo71995PE(i, str)) {
            this.f301141g = 1;
            SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        } else if (xVar.mo71996Qz(i, str)) {
            this.f301141g = 6;
            SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return false;
        }
    }

    /* renamed from: j */
    public boolean mo141816j(String str, String str2, C102257c cVar) {
        SnsMethodCalculate.markStartTimeMs("onClickDirect", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        this.f301142h = str;
        this.f301143i = str2;
        Log.m105924i("SnsAdQRHelper", "onClickDirect, filePath=" + this.f301142h);
        if (TextUtils.isEmpty(this.f301142h)) {
            if (cVar != null) {
                cVar.mo131644a(str2, false, "imgPath is empty", this.f301150p);
            }
            mo141818l();
            SnsMethodCalculate.markEndTimeMs("onClickDirect", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ((C19934c) ((C99716u) C86312j.m106911c(C99716u.class)).wa0()).mo27315b(this.f301135a, currentTimeMillis, this.f301142h, new C102256b(cVar, str2));
        SnsMethodCalculate.markEndTimeMs("onClickDirect", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return true;
    }

    /* renamed from: k */
    public boolean mo141817k(String str, String str2, C102257c cVar) {
        SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        this.f301142h = str;
        this.f301143i = str2;
        Log.m105924i("SnsAdQRHelper", "onLongClick, filePath=" + this.f301142h);
        if (TextUtils.isEmpty(this.f301142h)) {
            if (cVar != null) {
                cVar.mo131644a(str2, false, "imgPath is empty", this.f301150p);
            }
            mo141818l();
            SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ((C19934c) ((C99716u) C86312j.m106911c(C99716u.class)).wa0()).mo27315b(this.f301135a, currentTimeMillis, this.f301142h, new C102252a(cVar, str2));
        SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return true;
    }

    /* renamed from: l */
    public void mo141818l() {
        SnsMethodCalculate.markStartTimeMs("reSet", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        this.f301140f = "";
        this.f301138d = -1;
        this.f301142h = "";
        this.f301143i = "";
        this.f301139e = 0;
        this.f301141g = 0;
        this.f301150p = null;
        SnsMethodCalculate.markEndTimeMs("reSet", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    /* renamed from: m */
    public void mo141819m(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("reportImgLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        int i = this.f301145k;
        int i2 = 2;
        if (i != 1) {
            i2 = i == 2 ? 6 : i == 3 ? 8 : 0;
        }
        mo141820n(mo141814h(i2, str, z).toString());
        C102260r.m134858a(String.valueOf(17539), mo141813f(i2, str, z));
        SnsMethodCalculate.markEndTimeMs("reportImgLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    /* renamed from: n */
    public void mo141820n(String str) {
        SnsMethodCalculate.markStartTimeMs("reportKV17539", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        try {
            C101271i0 i0Var = this.f301144j;
            String h = i0Var.mo140741h();
            String nullAsNil = Util.nullAsNil(i0Var.mo140745l());
            String nullAsNil2 = Util.nullAsNil(i0Var.mo140735b());
            int i = i0Var.mo140742i();
            String encode = URLEncoder.encode(str, "UTF-8");
            C115669n.INSTANCE.mo160131h(17539, h, nullAsNil2, nullAsNil, Integer.valueOf(i), encode);
            Log.m105918d("SnsAdQRHelper", "reportKV17539 snsId=" + h + ", aid=" + nullAsNil2 + ", uxInfo=" + nullAsNil + ", kvData=" + str);
        } catch (Exception e) {
            Log.m105920e("SnsAdQRHelper", "reportKV17539 exp:" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportKV17539", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    /* renamed from: o */
    public void mo141821o(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("reportMenuItemClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        int i = this.f301145k;
        int i2 = 3;
        if (i != 1) {
            i2 = i == 2 ? 7 : i == 3 ? 9 : 0;
        }
        mo141820n(mo141814h(i2, str, z).toString());
        C102260r.m134858a(String.valueOf(17539), mo141813f(i2, str, z));
        SnsMethodCalculate.markEndTimeMs("reportMenuItemClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    public C102251n(Context context, String str) {
        this.f301149o = new WeakReference<>(context);
        this.f301148n = str;
    }
}
