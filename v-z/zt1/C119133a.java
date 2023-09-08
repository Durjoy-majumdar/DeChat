package zt1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.widget.TextView;
import au1.C0222b;
import au1.C113079a;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FaceFlashLogOpenStruct;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.plugin.facedetectlight.Utils.YTAGFaceReflectForWXJNIInterface;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper;
import com.tencent.youtu.ytcommon.YTCommonExInterface;
import cu1.C116537a;
import cu1.C116538d;
import cu1.C45206b;
import cu1.C45207c;
import cu1.C45208e;
import cu1.C45209f;
import cu1.C45210g;
import cu1.C45211h;
import di3.C86312j;
import eb1.C116764b;
import eb1.C116765c;
import eb1.C45640n;
import eb1.C45645r;
import eb1.C97635w;
import eb1.C97636x;
import f40.C86709a0;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import kg3.C76577a;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p447aw.C103918d;
import p663qo.C101213l;
import p702ts.C78085c;
import pe3.C89349b;
import te3.C118453od;
import zt3.C119157j;

/* renamed from: zt1.a */
public class C119133a implements C16407i, C11385n, C98124g.C98125a {

    /* renamed from: A */
    public float f356794A;

    /* renamed from: d */
    public YtSDKKitFramework.IYtSDKKitNetResponseParser f356795d;

    /* renamed from: e */
    public int f356796e;

    /* renamed from: f */
    public long f356797f;

    /* renamed from: g */
    public String f356798g;

    /* renamed from: h */
    public String f356799h;

    /* renamed from: i */
    public String f356800i;

    /* renamed from: j */
    public boolean f356801j;

    /* renamed from: n */
    public String f356802n;

    /* renamed from: o */
    public Activity f356803o;

    /* renamed from: p */
    public int f356804p = -1;

    /* renamed from: q */
    public long f356805q = -1;

    /* renamed from: r */
    public C116537a f356806r;

    /* renamed from: s */
    public boolean f356807s = C86709a0.m107523b().mo121115m();

    /* renamed from: t */
    public String f356808t = "";

    /* renamed from: u */
    public long f356809u = 0;

    /* renamed from: v */
    public long f356810v = 0;

    /* renamed from: w */
    public String f356811w = "";

    /* renamed from: x */
    public C92411b f356812x;

    /* renamed from: y */
    public C92411b.C92412a f356813y;

    /* renamed from: z */
    public float f356814z;

    /* renamed from: zt1.a$a */
    public class C119134a implements YtSDKKitFramework.IYtSDKKitNetResponseParser {

        /* renamed from: a */
        public final /* synthetic */ YtSDKKitFramework.IYtSDKKitNetResponseParser f356815a;

        public C119134a(C119133a aVar, YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
            this.f356815a = iYtSDKKitNetResponseParser;
        }

        public void onNetworkResponseEvent(HashMap<String, String> hashMap, Exception exc) {
            Log.m105925i("MicroMsg.FaceFlashManagerData", "onNetworkRequestEvent  result:%s", hashMap);
            this.f356815a.onNetworkResponseEvent(hashMap, exc);
        }
    }

    /* renamed from: zt1.a$b */
    public class C119135b implements Runnable {
        public C119135b() {
        }

        public void run() {
            YTCommonExInterface.setAppBrightness(C119133a.this.f356803o, 255);
        }
    }

    /* renamed from: zt1.a$c */
    public class C119136c implements Runnable {
        public C119136c() {
        }

        public void run() {
            C119133a aVar = C119133a.this;
            Activity activity = aVar.f356803o;
            if (activity != null) {
                YTCommonExInterface.setAppBrightness(activity, aVar.f356804p);
            }
        }
    }

    /* renamed from: zt1.a$d */
    public class C119137d implements C92411b.C92412a {
        public C119137d() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            Log.m105925i("MicroMsg.FaceFlashManagerData", "onGetLocation isOk: %b, %s, %s", Boolean.valueOf(z), Float.valueOf(f2), Float.valueOf(f));
            if (z) {
                C119133a aVar = C119133a.this;
                aVar.f356814z = f2;
                aVar.f356794A = f;
                aVar.f356812x.mo126408b(aVar.f356813y);
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo14859a(TextView textView) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048 A[Catch:{ Exception -> 0x0066 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14863b(android.widget.TextView r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            java.lang.String r1 = "fl_act_blink"
            boolean r1 = r9.equals(r1)     // Catch:{ Exception -> 0x0066 }
            r2 = 1
            if (r1 != 0) goto L_0x0039
            java.lang.String r1 = "fl_act_open_mouth"
            boolean r1 = r9.equals(r1)     // Catch:{ Exception -> 0x0066 }
            if (r1 != 0) goto L_0x0039
            java.lang.String r1 = "fl_act_shake_head"
            boolean r1 = r9.equals(r1)     // Catch:{ Exception -> 0x0066 }
            if (r1 != 0) goto L_0x0039
            java.lang.String r1 = "fl_act_nod_head"
            boolean r1 = r9.equals(r1)     // Catch:{ Exception -> 0x0066 }
            if (r1 == 0) goto L_0x0023
            goto L_0x0039
        L_0x0023:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0066 }
            long r5 = r7.f356805q     // Catch:{ Exception -> 0x0066 }
            long r3 = r3 - r5
            r5 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0037
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0066 }
            r7.f356805q = r3     // Catch:{ Exception -> 0x0066 }
            goto L_0x0039
        L_0x0037:
            r1 = 0
            goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            java.lang.String r3 = "MicroMsg.FaceFlashManagerData"
            if (r1 != 0) goto L_0x0048
            java.lang.String r8 = "onFrameworkEvent tips: unable to change text: %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0066 }
            r1[r0] = r9     // Catch:{ Exception -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r1)     // Catch:{ Exception -> 0x0066 }
            return
        L_0x0048:
            android.content.Context r1 = r8.getContext()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r1 = bu1.C0381a.m326c(r1, r9)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r4 = "updateTipText res:%s tip:%s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0066 }
            r5[r0] = r9     // Catch:{ Exception -> 0x0066 }
            r5[r2] = r1     // Catch:{ Exception -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)     // Catch:{ Exception -> 0x0066 }
            boolean r9 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0066 }
            if (r9 != 0) goto L_0x0070
            bu1.C0381a.m332i(r8, r1)     // Catch:{ Exception -> 0x0066 }
            goto L_0x0070
        L_0x0066:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r0 = "MicroMsg.FaceFlashManagerError"
            java.lang.String r1 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r8, r1, r9)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zt1.C119133a.mo14863b(android.widget.TextView, java.lang.String):void");
    }

    /* renamed from: c */
    public void mo14864c(Intent intent, Activity activity) {
        C116537a aVar;
        this.f356803o = activity;
        this.f356796e = intent.getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f356798g = intent.getStringExtra("appId");
        this.f356799h = intent.getStringExtra("request_verify_pre_info");
        this.f356801j = intent.getBooleanExtra("needVideo", false);
        this.f356802n = intent.getStringExtra("feedbackUrl");
        this.f356804p = Settings.System.getInt(activity.getContentResolver(), "screen_brightness", 100);
        switch (this.f356796e) {
            case 0:
                aVar = new C45209f();
                break;
            case 1:
                aVar = new C45208e();
                break;
            case 2:
            case 5:
                aVar = new C45210g();
                break;
            case 3:
                aVar = new C45211h();
                break;
            case 4:
                aVar = new C45207c();
                break;
            case 6:
                aVar = new C116538d();
                break;
            default:
                aVar = new C45206b();
                break;
        }
        this.f356806r = aVar;
        String stringExtra = intent.getStringExtra("k_ticket");
        if (!Util.isNullOrNil(stringExtra)) {
            Log.m105924i("MicroMsg.FaceFlashManagerData", "has prepared ticket. force set");
            C45645r.f123433f = stringExtra;
        }
        if (this.f356807s) {
            C86709a0.m107524d().mo123455a(TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION, this);
        } else {
            C86709a0.m107524d().mo123455a(733, this);
        }
        C86709a0.m107524d().mo123455a(this.f356806r.getType(), this);
        FaceFlashLogOpenStruct b = C0222b.m163b();
        b.f9710z = b.mo86045b("AppId", this.f356798g, true);
        Log.m105925i("MicroMsg.FaceFlashManagerData", "[%s]intent data, scene:%s ,mAppId:%s verifyInfo:%s currentLight %s enterBrightness: %s isLogin:%s", getClass().getSimpleName(), Integer.valueOf(this.f356796e), this.f356798g, this.f356799h, Float.valueOf(0.0f), Integer.valueOf(this.f356804p), Boolean.valueOf(this.f356807s));
    }

    /* renamed from: d */
    public final void mo183836d() {
        if (!TextUtils.isEmpty(this.f356811w)) {
            Log.m105925i("MicroMsg.FaceFlashManagerData", "cancelSendTask media id:%s", this.f356811w);
            ((C101213l) C86312j.m106911c(C101213l.class)).gn0(this.f356811w);
            this.f356811w = "";
        }
    }

    /* renamed from: e */
    public int mo14860e() {
        return 8;
    }

    /* renamed from: f */
    public JSONObject mo183837f(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("err_type", 1);
            jSONObject.put("err_code", i);
            jSONObject.put("err_feedback", this.f356802n);
            jSONObject.put("key_app_id", this.f356798g);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("err_msg", str);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: g */
    public int mo14861g() {
        return 3;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        String str2 = str;
        int i2 = i;
        C98121d dVar2 = dVar;
        int i3 = dVar2 == null ? -1 : dVar2.field_retCode;
        C0222b.m173l("rspCdn", Integer.valueOf(i3));
        C0222b.m163b().f9692h = i3;
        C0222b.m163b().f9694j = System.currentTimeMillis() - this.f356809u;
        if (i2 == -21005) {
            Log.m105925i("MicroMsg.FaceFlashManagerData", "hy: ERR_CNDCOM_MEDIA_IS_UPLOADING cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str2, Integer.valueOf(i), cVar, dVar2);
            return 0;
        } else if (dVar2 == null || dVar2.field_retCode != 0 || !this.f356811w.equals(str2)) {
            if (!(i2 == 0 && (dVar2 == null || dVar2.field_retCode == 0))) {
                Log.m105929w("MicroMsg.FaceFlashManagerData", "hy: cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str2, Integer.valueOf(i), cVar, dVar2);
                C0222b.m163b().f9686B = 5;
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 90020);
                    String q = C76577a.m92166q(this.f356803o, C0966R.string.msg_net_error);
                    jSONObject.put("err_feedback", this.f356802n);
                    jSONObject.put("err_msg", q);
                } catch (JSONException unused) {
                }
                hashMap.put("response", jSONObject.toString());
                this.f356795d.onNetworkResponseEvent(hashMap, (Exception) null);
            }
            return 0;
        } else {
            Log.m105925i("MicroMsg.FaceFlashManagerData", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str2, Integer.valueOf(i), cVar, dVar2);
            String str3 = dVar2.field_fileId;
            Bundle bundle = new Bundle();
            bundle.putString("key_pic_cdn_id", str3);
            bundle.putString("key_cdn_aes_key", dVar2.field_aesKey);
            C0222b.m172k("reqVerify");
            C0222b.m175n(9);
            C0222b.m163b().f9706v = System.currentTimeMillis();
            this.f356806r.mo70689b(this.f356796e, this.f356797f, str3, dVar2.field_aesKey, this.f356798g, this.f356799h, mo14862i(), 0.0f, this.f356801j ? 1 : 0, this);
            return 0;
        }
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: i */
    public int mo14862i() {
        return 4;
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return null;
    }

    /* renamed from: k */
    public void mo183838k() {
        Log.m105924i("MicroMsg.FaceFlashManagerData", "improveBrightness");
        if (this.f356803o != null) {
            ((C119157j) C119157j.f356862d).mo183895z(new C119135b());
        }
    }

    /* renamed from: l */
    public void mo175363l(String str) {
        Log.m105925i("MicroMsg.FaceFlashManagerData", "initPrepareTip :%s", str);
        if (str.equals("1")) {
            this.f356808t = C76577a.m92166q(this.f356803o, C0966R.string.fl_act_blink);
        } else if (str.equals("2")) {
            this.f356808t = C76577a.m92166q(this.f356803o, C0966R.string.fl_act_open_mouth);
        } else if (str.equals("3")) {
            this.f356808t = C76577a.m92166q(this.f356803o, C0966R.string.fl_act_nod_head);
        } else if (str.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL)) {
            this.f356808t = C76577a.m92166q(this.f356803o, C0966R.string.fl_act_shake_head);
        } else if (str.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY)) {
            this.f356808t = C76577a.m92166q(this.f356803o, C0966R.string.fl_act_silence);
        }
    }

    /* renamed from: m */
    public void mo183839m(String str) {
        C0222b.m163b().f9695k = System.currentTimeMillis() - this.f356810v;
        C0222b.m164c().f9719l = System.currentTimeMillis() - this.f356810v;
        String o = mo183841o(str);
        if (TextUtils.isEmpty(o) || !C86013q1.m106450k(o)) {
            mo183842p(90034, C76577a.m92166q(this.f356803o, C0966R.string.cjs));
        } else {
            mo183844r(o);
        }
    }

    /* renamed from: n */
    public void mo183840n() {
        Log.m105925i("MicroMsg.FaceFlashManagerData", "restoreBrightness %d", Integer.valueOf(this.f356804p));
        if (this.f356804p > 0) {
            ((C119157j) C119157j.f356862d).mo183895z(new C119136c());
        }
    }

    /* renamed from: o */
    public String mo183841o(String str) {
        String valueOf = String.valueOf(this.f356797f);
        String str2 = this.f356798g;
        int g = mo14861g();
        try {
            JSONObject jSONObject = new JSONObject(str);
            C118453od odVar = new C118453od();
            String jSONObject2 = C119139h.m168006c(valueOf, str2, "", "", g, jSONObject).toString();
            byte[] encrypt = YTAGFaceReflectForWXJNIInterface.encrypt(valueOf, jSONObject2, (long) jSONObject2.getBytes().length);
            odVar.f354209e = C89349b.m111674a(encrypt);
            odVar.f354208d = C89349b.m111674a(C119139h.m168004a(valueOf, encrypt));
            String j = C85191v.m105071j();
            C85191v.m105075n(odVar.toByteArray(), j);
            Log.m105925i("MicroMsg.FaceFlashDataUtil", "save verify result to bioId:%s file:%s  fileSize:%s  fileMd5:%s", valueOf, j, Long.valueOf(C86013q1.m106451l(j)), C86013q1.m106455p(j));
            return j;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e, "reflect get yt result data error", new Object[0]);
            return "";
        }
    }

    public void onNetworkRequestEvent(String str, String str2, HashMap<String, String> hashMap, YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        Log.m105925i("MicroMsg.FaceFlashManagerData", "onNetworkRequestEvent  url:%s requestContent:%s requestHeaders:%s", str, str2, hashMap);
        this.f356795d = iYtSDKKitNetResponseParser;
        if (str.contains("wechat_face_config")) {
            C0222b.m163b().f9702r = System.currentTimeMillis();
            C0222b.m172k("reqCfg");
            mo183838k();
            Log.m105924i("MicroMsg.FaceFlashManagerData", "requestConfig");
            C0222b.m175n(2);
            try {
                String string = new JSONObject(str2).getString("select_data");
                this.f356800i = string;
                Log.m105925i("MicroMsg.FaceFlashManagerData", "getConfig selectData:%s", string);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e, "reflect get yt config data error", new Object[0]);
            }
            if (this.f356807s) {
                C86709a0.m107524d().mo123460f(new C97635w(this.f356796e, mo14860e(), this.f356798g, this.f356799h, this.f356800i.getBytes()));
            } else {
                C86709a0.m107524d().mo123460f(new C97636x(this.f356796e, mo14860e(), this.f356798g, this.f356799h, this.f356800i.getBytes()));
            }
            C113079a.m154758d(mo14860e());
        } else if (str.contains("wechat_face_verify")) {
            C0222b.m163b().f9705u = System.currentTimeMillis();
            mo183840n();
            mo183839m(str2);
            C113079a.m154759e(mo14860e());
        } else {
            YtSDKKitNetHelper.getInstance().sendNetworkRequest(str, str2, hashMap, new C119134a(this, iYtSDKKitNetResponseParser));
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        char c;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        C117747y yVar2 = yVar;
        if ((yVar2 instanceof C97635w) || (yVar2 instanceof C97636x)) {
            Object obj = "response";
            Log.m105925i("MicroMsg.FaceFlashManagerData", "[cgi-ret]NetSceneGetBioConfig errType:%s errCode:%s errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str2);
            C0222b.m163b().f9703s = System.currentTimeMillis();
            C0222b.m173l("rspCfg", Integer.valueOf(i2));
            C0222b.m163b().f9691g = i4;
            this.f356810v = System.currentTimeMillis();
            if (i3 == 0 && i4 == 0) {
                C116764b bVar = (C116764b) yVar2;
                this.f356797f = bVar.mo136899r0();
                String decrypt = YTAGFaceReflectForWXJNIInterface.decrypt(this.f356797f + "", bVar.mo136898l(), (long) bVar.mo136898l().length);
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 0);
                    jSONObject.put("err_msg", "OK");
                    jSONObject.put("type", 1);
                    jSONObject.put("smallface_ratio_threshold", (double) bVar.mo136897h0());
                    JSONObject jSONObject2 = new JSONObject();
                    Log.m105925i("MicroMsg.FaceFlashManagerData", "update smallface_ratio_threshold:%f", Float.valueOf(bVar.mo136897h0()));
                    jSONObject2.put("smallface_ratio_threshold", (double) bVar.mo136897h0());
                    YtSDKKitFramework.getInstance().updateSDKSetting(jSONObject2);
                    if (bVar.mo136896G() != null) {
                        try {
                            jSONObject.put("select_data", new JSONObject(new String(bVar.mo136896G())));
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.FaceFlashManagerData", e, "parse selectJson error", new Object[0]);
                        }
                    }
                    JSONArray optJSONArray = new JSONObject(decrypt).optJSONArray("face_action_seq");
                    if (optJSONArray != null) {
                        for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i5);
                            if (optJSONObject != null) {
                                if (optJSONObject.optInt("action_id", 0) == 6) {
                                    jSONObject.put("data", optJSONObject.optString("action_data"));
                                    jSONObject.put("color_data", optJSONObject.optString("action_data"));
                                }
                                if (optJSONObject.optInt("action_id", 0) == 7) {
                                    String optString = optJSONObject.optString("action_data", "0");
                                    mo175363l(optString);
                                    jSONObject.put("action_data", optString);
                                }
                            }
                        }
                    }
                    c = 0;
                } catch (JSONException e2) {
                    c = 0;
                    Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e2, "reflect get config error", new Object[0]);
                }
                hashMap.put(obj, jSONObject.toString());
                this.f356795d.onNetworkResponseEvent(hashMap, (Exception) null);
                Object[] objArr = new Object[3];
                objArr[c] = Long.valueOf(this.f356797f);
                objArr[1] = decrypt;
                objArr[2] = hashMap;
                Log.m105925i("MicroMsg.FaceFlashManagerData", "[sdk-info] mBioId:%s decryptConfig:%s retMap:%s", objArr);
                return;
            }
            HashMap hashMap2 = new HashMap();
            JSONObject jSONObject3 = new JSONObject();
            try {
                C0222b.m163b().f9686B = 3;
                jSONObject3.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 90036);
                jSONObject3.put("err_feedback", this.f356802n);
                jSONObject3.put("err_msg", C76577a.m92166q(this.f356803o, C0966R.string.net_fetch_failed));
            } catch (JSONException unused) {
            }
            hashMap2.put(obj, jSONObject3.toString());
            this.f356795d.onNetworkResponseEvent(hashMap2, (Exception) null);
            Log.m105920e("MicroMsg.FaceFlashManagerError", "get mBioId failed");
            return;
        }
        String str3 = "err_feedback";
        if (yVar2 instanceof C116538d.C116539a) {
            String str4 = "err_code";
            Object obj2 = "response";
            C0222b.m163b().f9707w = System.currentTimeMillis();
            C0222b.m173l("rspVerify", Integer.valueOf(i2));
            C0222b.m163b().f9693i = i4;
            if (i3 == 0 && i4 == 0) {
                Bundle bundle = ((C116538d.C116539a) yVar2).f349508d;
                JSONObject jSONObject4 = new JSONObject();
                for (String next : bundle.keySet()) {
                    try {
                        jSONObject4.put(next, bundle.get(next));
                    } catch (JSONException unused2) {
                    }
                }
                try {
                    jSONObject4.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i4);
                    jSONObject4.put(StateEvent.Name.ERROR_CODE, i4);
                    jSONObject4.put("err_msg", str2);
                } catch (JSONException unused3) {
                }
                Log.m105925i("MicroMsg.FaceFlashManagerData", "[cgi-ret]retContent:%s", jSONObject4);
                HashMap hashMap3 = new HashMap();
                hashMap3.put(obj2, jSONObject4.toString());
                this.f356795d.onNetworkResponseEvent(hashMap3, (Exception) null);
                return;
            }
            JSONObject jSONObject5 = new JSONObject();
            try {
                jSONObject5.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i4);
                jSONObject5.put(StateEvent.Name.ERROR_CODE, i4);
                jSONObject5.put("err_type", 3);
                jSONObject5.put(str4, i4);
                jSONObject5.put("err_retry", true);
                jSONObject5.put("err_msg", C76577a.m92166q(this.f356803o, C0966R.string.jl5));
            } catch (JSONException unused4) {
            }
        } else {
            String str5 = "err_code";
            Object obj3 = "response";
            if (yVar2 instanceof C45640n) {
                Object obj4 = obj3;
                Log.m105925i("MicroMsg.FaceFlashManagerData", "[cgi-ret]NetSceneFacePicThirdVerifyFace errType:%s errCode:%s errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str2);
                C0222b.m173l("rspVerify", Integer.valueOf(i2));
                C0222b.m163b().f9693i = i4;
                C0222b.m163b().f9707w = System.currentTimeMillis();
                JSONObject jSONObject6 = new JSONObject();
                try {
                    jSONObject6.put("err_type", i3);
                    jSONObject6.put(str5, i4);
                    jSONObject6.put("err_tip", ((C45640n) yVar2).f123423g);
                    jSONObject6.put("verify_result", ((C45640n) yVar2).f123422f);
                    jSONObject6.put("err_retry", ((C116765c) yVar2).mo71156o0());
                    if (i3 == 0 && i4 == 0) {
                        jSONObject6.put("err_msg", str2);
                        jSONObject6.put("key_app_id", this.f356798g);
                        jSONObject6.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i4);
                        jSONObject6.put(StateEvent.Name.ERROR_CODE, i4);
                        jSONObject6.put("err_msg", str2);
                        C113079a.m154757c(mo14860e());
                    } else {
                        C0222b.m163b().f9686B = 4;
                        jSONObject6.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i4);
                        jSONObject6.put(StateEvent.Name.ERROR_CODE, i4);
                        jSONObject6.put("err_msg", C76577a.m92166q(this.f356803o, C0966R.string.fya));
                        jSONObject6.put(str3, this.f356802n);
                        jSONObject6.put("err_msg", str2);
                        C113079a.m154755a(mo14860e());
                    }
                } catch (JSONException unused5) {
                }
                Log.m105925i("MicroMsg.FaceFlashManagerData", "[cgi-ret]retContent:%s", jSONObject6);
                HashMap hashMap4 = new HashMap();
                hashMap4.put(obj4, jSONObject6.toString());
                this.f356795d.onNetworkResponseEvent(hashMap4, (Exception) null);
            } else if (yVar2 instanceof C116765c) {
                Object obj5 = obj3;
                C0222b.m163b().f9707w = System.currentTimeMillis();
                C0222b.m173l("rspVerify", Integer.valueOf(i2));
                C0222b.m163b().f9693i = i4;
                JSONObject jSONObject7 = new JSONObject();
                new Bundle().putString(this.f356806r.mo70688a(), ((C116765c) yVar2).mo71155F());
                jSONObject7.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i4);
                jSONObject7.put(StateEvent.Name.ERROR_CODE, i4);
                jSONObject7.put("err_type", 2);
                jSONObject7.put(str5, i4);
                jSONObject7.put("err_msg", str2);
                jSONObject7.put("err_retry", ((C116765c) yVar2).mo71156o0());
                Log.m105925i("MicroMsg.FaceFlashManagerData", "[cgi-ret]retContent:%s", jSONObject7);
                HashMap hashMap5 = new HashMap();
                hashMap5.put(obj5, jSONObject7.toString());
                this.f356795d.onNetworkResponseEvent(hashMap5, (Exception) null);
            }
        }
    }

    /* renamed from: p */
    public final void mo183842p(int i, String str) {
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("err_type", 4);
            jSONObject.put("err_code", i);
            jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i);
            jSONObject.put(StateEvent.Name.ERROR_CODE, i);
            jSONObject.put("err_msg", str);
            jSONObject.put("err_feedback", this.f356802n);
        } catch (JSONException unused) {
        }
        hashMap.put("response", jSONObject.toString());
        this.f356795d.onNetworkResponseEvent(hashMap, (Exception) null);
    }

    /* renamed from: q */
    public void mo183843q(Activity activity) {
        boolean Un0 = ((C103918d) C86312j.m106911c(C103918d.class)).Un0(activity, "android.permission.ACCESS_FINE_LOCATION", false);
        if (!Un0) {
            Log.m105925i("MicroMsg.FaceFlashManagerData", "startGetLocation checkLocation: %s and ignore", Boolean.valueOf(Un0));
            return;
        }
        if (this.f356812x == null) {
            this.f356812x = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
        }
        if (this.f356813y == null) {
            this.f356813y = new C119137d();
        }
        this.f356812x.mo126409c(this.f356813y, true, false);
        C5139t.m5183e(22, 10);
    }

    /* renamed from: r */
    public void mo183844r(String str) {
        C98124g gVar = new C98124g();
        gVar.f287662f = this;
        String g = C85191v.m105068g(str);
        gVar.field_mediaId = g;
        gVar.field_fullpath = str;
        gVar.field_thumbpath = "";
        gVar.field_fileType = 5;
        gVar.field_talker = "";
        gVar.field_priority = 2;
        gVar.field_needStorage = false;
        gVar.field_isStreamMedia = false;
        gVar.field_appType = 1;
        gVar.field_bzScene = 0;
        gVar.field_largesvideo = 0;
        gVar.f287663g = 5;
        this.f356811w = g;
        C0222b.m172k("reqCdn");
        this.f356809u = System.currentTimeMillis();
        C0222b.m175n(8);
        if (!((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar)) {
            Log.m105921e("MicroMsg.FaceFlashManagerData", "hy: cdntra addSendTask failed. clientid:%s", gVar.field_mediaId);
            C0222b.m163b().f9686B = 5;
            C0222b.m164c().f9724q = 5;
            C0222b.m172k("cdnFailTask");
            mo183842p(90019, "face file add to cdn failed");
        }
    }

    public void release() {
        mo183836d();
        mo183840n();
        C86709a0.m107524d().mo123470p(TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION, this);
        C86709a0.m107524d().mo123470p(this.f356806r.getType(), this);
        C86709a0.m107524d().mo123470p(733, this);
        C92411b bVar = this.f356812x;
        if (bVar != null) {
            bVar.mo126408b(this.f356813y);
        }
    }

    public void reset() {
        FaceFlashLogOpenStruct b = C0222b.m163b();
        b.f9710z = b.mo86045b("AppId", this.f356798g, true);
        mo183836d();
    }
}
