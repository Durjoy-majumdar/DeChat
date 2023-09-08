package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tencent.p014mm.plugin.appbrand.C83727p2;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83762b1;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import eb0.C86493v0;
import java.io.ByteArrayOutputStream;
import ke3.C88144b;
import kr0.C88267e;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.n */
public class C82980n extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 74;
    public static final String NAME = "shareTimeline";

    /* renamed from: g */
    public final int f242636g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONObject;
        C88267e eVar = (C88267e) fVar;
        Activity o0 = eVar.mo114344o0();
        if (o0 == null) {
            eVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        int i2 = i;
        AppBrandInitConfigWC M1 = eVar.getRuntime().mo113210l1();
        String appId = eVar.getAppId();
        String str = M1.f234839s;
        String optString = jSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        String optString2 = jSONObject2.optString("path");
        String optString3 = jSONObject2.optString("imageUrl");
        String optString4 = jSONObject2.optString("messageExtraData");
        String optString5 = jSONObject2.optString("preloadResources");
        int optInt = jSONObject2.optInt("cardSubType", 0);
        if (Util.isNullOrNil(optString)) {
            optString = eVar.mo114341l0().mo116156K0();
        }
        if (Util.isNullOrNil(optString)) {
            optString = M1.f239363e;
        }
        String str2 = optString;
        String c = C83727p2.m102773c(eVar.getAppId());
        int i3 = M1.f234802F;
        int i4 = M1.f239365g;
        String sb = C82967h0.m101762a(appId, C84072q1.m103586a(appId).f245458b.getAndIncrement()).toString();
        C82970i0 i0Var = new C82970i0();
        i0Var.f242600a = sb;
        Activity activity = o0;
        i0Var.f242601b = 1;
        i0Var.f242602c = str2;
        i0Var.f242603d = optString2;
        i0Var.f242604e = optString3;
        i0Var.f242605f = 0;
        C82970i0 i0Var2 = i0Var;
        String str3 = appId;
        Log.m105919d("MicroMsg.JsApiShareTimeline", "doTimeline, errorUrl:[%s] data:[%s]", c, jSONObject.toString());
        Intent intent = new Intent();
        intent.putExtra("Ksnsupload_link", c);
        intent.putExtra("Ksnsupload_contentattribute", 0);
        intent.putExtra("ksnsis_appbrand", true);
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("Ksnsupload_type", 1);
        intent.putExtra("need_result", true);
        intent.putExtra("KsnsUpload_BrandUsername", str);
        intent.putExtra("KsnsUpload_BrandPath", optString2);
        intent.putExtra("KsnsUpload_BrandVersion", i3);
        intent.putExtra("KsnsUpload_BrandVersionType", i4);
        intent.putExtra("KsnsUpload_BrandShareActionId", sb);
        intent.putExtra("KsnsUpload_isGame", M1.mo111300k());
        intent.putExtra("KsnsUpload_MessageExtraData", optString4);
        intent.putExtra("Ksnsupload_title", str2);
        intent.putExtra("KsnsUpload_SubType", optInt);
        intent.putExtra("KsnsUpload_PreloadResouces", optString5);
        if (optString3.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || optString3.startsWith(HttpWrapperBase.PROTOCAL_HTTPS) || Util.isNullOrNil(optString3)) {
            if (Util.isNullOrNil(optString3)) {
                optString3 = M1.f239364f;
            }
            intent.putExtra("Ksnsupload_imgurl", optString3);
        } else {
            String str4 = null;
            if (optString3.startsWith("wxfile://")) {
                C86009m1 absoluteFile = eVar.getFileSystem().getAbsoluteFile(optString3);
                if (absoluteFile == null || !absoluteFile.mo119967g()) {
                    intent.putExtra("Ksnsupload_imgurl", M1.f239364f);
                } else {
                    str4 = absoluteFile.mo119971i();
                    intent.putExtra("KsnsUpload_imgPath", str4);
                }
                Log.m105925i("MicroMsg.JsApiShareTimeline", "local imagePath:%s", str4);
            } else {
                byte[] bArr = new byte[0];
                Bitmap b = C83762b1.m102898b(eVar.getRuntime(), optString3);
                if (b == null || b.isRecycled()) {
                    Log.m105920e("MicroMsg.JsApiShareTimeline", "thumb image is null");
                } else {
                    Log.m105924i("MicroMsg.JsApiShareTimeline", "thumb image is not null ");
                    Bitmap createBitmap = Bitmap.createBitmap(b.getWidth(), b.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-1);
                    canvas.drawBitmap(b, 0.0f, 0.0f, (Paint) null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Log.m105925i("MicroMsg.JsApiShareTimeline", "bitmap recycle %s", createBitmap);
                    createBitmap.recycle();
                    b.recycle();
                    bArr = byteArray;
                }
                Log.m105919d("MicroMsg.JsApiShareTimeline", "getImageBufferForShare :%d", Integer.valueOf(bArr.length));
                if (bArr.length > 0) {
                    intent.putExtra("Ksnsupload_imgbuf", bArr);
                } else {
                    intent.putExtra("Ksnsupload_imgurl", M1.f239364f);
                }
            }
        }
        String str5 = optString3;
        Log.m105919d("MicroMsg.JsApiShareTimeline", "report, appId : %s, path: %s", str3, optString2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("wxapp_");
        String str6 = str3;
        sb4.append(str6);
        sb4.append(optString2);
        String a = C86493v0.m107223a(sb4.toString());
        C86493v0.C86495c c2 = C86493v0.m107224d().mo120947c(a, true);
        c2.mo120962i("prePublishId", "wxapp_" + str6 + optString2);
        intent.putExtra("reportSessionId", a);
        C89916g a2 = C89916g.m112446a(activity);
        Intent intent2 = intent;
        C82977m mVar = r0;
        C82977m mVar2 = new C82977m(this, activity, str6, optString2, eVar, i, M1, sb, i0Var2, str2, str5, i3, optString4);
        a2.mo124232f(mVar);
        C88144b.m109796n(activity, "sns", ".ui.SnsUploadUI", intent2, this.f242636g, false);
    }
}
