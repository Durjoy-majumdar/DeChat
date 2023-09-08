package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ck0.C92423c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.plugin.webview.model.C43702g2;
import com.tencent.p014mm.plugin.webview.model.C6049n1;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKImageItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wxmm.v2helper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1016ob.C89131a;
import p828wa.C53096b;
import qo3.C89779i0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.i */
public class C4478i extends C5954n2<GameWebPage> {

    /* renamed from: g */
    public static final String f19243g = (C41872f.m45392b(C41872f.C41873a.ONE_MONTH) + "haowan/");

    /* renamed from: h */
    public static final int f19244h = 62784;

    /* renamed from: e */
    public C89779i0 f19245e;

    /* renamed from: f */
    public DialogInterface.OnCancelListener f19246f;

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.i$a */
    public class C4479a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C43620m2.C5947b f19247d;

        /* renamed from: e */
        public final /* synthetic */ Context f19248e;

        /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.i$a$a */
        public class C4480a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ArrayList f19250d;

            /* renamed from: e */
            public final /* synthetic */ Intent f19251e;

            /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.i$a$a$a */
            public class C4481a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ String f19253d;

                public C4481a(String str) {
                    this.f19253d = str;
                }

                public void run() {
                    C89779i0 i0Var = C4478i.this.f19245e;
                    if (i0Var != null) {
                        i0Var.dismiss();
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("type", 1);
                        jSONObject.put("localIds", this.f19253d);
                        jSONObject.put("appId", C4480a.this.f19251e.getStringExtra("key_game_video_appid"));
                        jSONObject.put("appName", C4480a.this.f19251e.getStringExtra("key_game_video_appname"));
                    } catch (JSONException unused) {
                    }
                    C4479a.this.f19247d.mo6945a((String) null, jSONObject);
                }
            }

            public C4480a(ArrayList arrayList, Intent intent) {
                this.f19250d = arrayList;
                this.f19251e = intent;
            }

            public void run() {
                C4478i iVar = C4478i.this;
                ArrayList arrayList = this.f19250d;
                String str = C4478i.f19243g;
                iVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    long currentTimeMillis = System.currentTimeMillis();
                    StringBuilder sb = new StringBuilder();
                    String str3 = C4478i.f19243g;
                    sb.append(str3);
                    sb.append("microMsg.image.");
                    sb.append(currentTimeMillis);
                    sb.append(".");
                    sb.append(str2.hashCode() & 65535);
                    String sb4 = sb.toString();
                    String str4 = str3 + "microMsg.thumb." + currentTimeMillis + "." + (str2.hashCode() & 65535);
                    if (!Util.isNullOrNil(str2) && Exif.fromFile(str2).getOrientationInDegree() != 0) {
                        int orientationInDegree = Exif.fromFile(str2).getOrientationInDegree();
                        if (orientationInDegree != 0) {
                            int i = orientationInDegree % v2helper.VOIP_ENC_HEIGHT_LV1;
                            try {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                Bitmap d = MMBitmapFactory.m98735d(str2, options);
                                if (d == null) {
                                    Log.m105920e("MicroMsg.JsApiChooseHaowanMedia", "rotate image, get null bmp");
                                } else {
                                    Bitmap rotate = BitmapUtil.rotate(d, (float) i);
                                    Log.m105925i("MicroMsg.JsApiChooseHaowanMedia", "doRotate, dstPath : %s", sb4);
                                    try {
                                        BitmapUtil.saveBitmapToImage(rotate, 80, C89131a.m111396d(options) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, sb4, true);
                                        if (C89131a.m111396d(options)) {
                                            C92423c.m116249b(str2, sb4);
                                        }
                                    } catch (Exception e) {
                                        Log.m105921e("MicroMsg.JsApiChooseHaowanMedia", "rotate image, exception occurred when saving | %s", e);
                                        C86013q1.m106447h(sb4);
                                    }
                                }
                            } catch (NullPointerException | OutOfMemoryError unused) {
                            }
                        }
                        WebViewJSSDKFileItem c = C6049n1.m5934c(str2, str4);
                        BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str2);
                        c.f283030p = imageOptions.outWidth;
                        c.f283031q = imageOptions.outHeight;
                        ((WebViewJSSDKImageItem) c).f22268w = ImgUtil.isGif(str2);
                        String str5 = c.f283022e;
                        C6080m.Ax0().mo7009a(c);
                        Log.m105925i("MicroMsg.JsApiChooseHaowanMedia", "now filepath is : %s, local id is : %s", str2, str5);
                        arrayList2.add(str5);
                    } else if (C86013q1.m106443d(str2, sb4, false) <= 0) {
                        WebViewJSSDKFileItem c2 = C6049n1.m5934c(str2, str4);
                        BitmapFactory.Options imageOptions2 = BitmapUtil.getImageOptions(str2);
                        c2.f283030p = imageOptions2.outWidth;
                        c2.f283031q = imageOptions2.outHeight;
                        ((WebViewJSSDKImageItem) c2).f22268w = ImgUtil.isGif(str2);
                        String str52 = c2.f283022e;
                        C6080m.Ax0().mo7009a(c2);
                        Log.m105925i("MicroMsg.JsApiChooseHaowanMedia", "now filepath is : %s, local id is : %s", str2, str52);
                        arrayList2.add(str52);
                    }
                    str2 = sb4;
                    WebViewJSSDKFileItem c25 = C6049n1.m5934c(str2, str4);
                    BitmapFactory.Options imageOptions22 = BitmapUtil.getImageOptions(str2);
                    c25.f283030p = imageOptions22.outWidth;
                    c25.f283031q = imageOptions22.outHeight;
                    ((WebViewJSSDKImageItem) c25).f22268w = ImgUtil.isGif(str2);
                    String str522 = c25.f283022e;
                    C6080m.Ax0().mo7009a(c25);
                    Log.m105925i("MicroMsg.JsApiChooseHaowanMedia", "now filepath is : %s, local id is : %s", str2, str522);
                    arrayList2.add(str522);
                }
                String a = C43702g2.m47528a(arrayList2);
                Log.m105925i("MicroMsg.JsApiChooseHaowanMedia", "after parse to json data : %s", a);
                MMHandlerThread.postToMainThread(new C4481a(a));
            }
        }

        public C4479a(C43620m2.C5947b bVar, Context context) {
            this.f19247d = bVar;
            this.f19248e = context;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == C4478i.f19244h) {
                if (i2 == -1) {
                    String stringExtra = intent.getStringExtra("key_video_info");
                    if (!Util.isNullOrNil(stringExtra)) {
                        Log.m105925i("MicroMsg.JsApiChooseHaowanMedia", "video, result: %s", stringExtra);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("type", 2);
                            if (intent.getBooleanExtra("key_game_video_encode_json_array", false)) {
                                jSONObject.put("localIds", new JSONArray(stringExtra));
                            } else {
                                jSONObject.put("localIds", stringExtra);
                            }
                            jSONObject.put("appId", intent.getStringExtra("key_game_video_appid"));
                            jSONObject.put("appName", intent.getStringExtra("key_game_video_appname"));
                            jSONObject.put("transInfo", intent.getStringExtra("key_game_trans_info"));
                            jSONObject.put("pageType", intent.getIntExtra("key_game_video_page_type", 0));
                        } catch (JSONException unused) {
                        }
                        this.f19247d.mo6945a((String) null, jSONObject);
                    } else {
                        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                        if (!Util.isNullOrNil((List) stringArrayListExtra)) {
                            C4478i iVar = C4478i.this;
                            Context context = this.f19248e;
                            iVar.f19246f = new C4485j(iVar);
                            iVar.f19245e = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(C0966R.string.f360920fy1), true, false, iVar.f19246f);
                            ((C119157j) C119157j.f356862d).mo183875f(new C4480a(stringArrayListExtra, intent));
                        } else if (intent.getBooleanExtra("key_game_haowan_text", false)) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("type", 3);
                                jSONObject2.put("appId", intent.getStringExtra("key_game_video_appid"));
                                jSONObject2.put("appName", intent.getStringExtra("key_game_video_appname"));
                            } catch (JSONException unused2) {
                            }
                            this.f19247d.mo6945a((String) null, jSONObject2);
                        } else {
                            this.f19247d.mo6945a("cancel", (JSONObject) null);
                        }
                    }
                } else {
                    this.f19247d.mo6945a("cancel", (JSONObject) null);
                }
                ((MMActivity) this.f19248e).mmSetOnActivityResultCallback((MMActivity.C6739d) null);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "chooseHaowanMedia";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            bVar.mo6945a("invalid_params", (JSONObject) null);
            return;
        }
        int optInt = e.optInt("mediaType", 3);
        e.optString("mediaTag");
        int optInt2 = e.optInt("limitCount", 9);
        int optInt3 = e.optInt("galleryType");
        JSONArray optJSONArray = e.optJSONArray("albumInfos");
        boolean optBoolean = e.optBoolean("ignoreVideoPreview", true);
        int optInt4 = e.optInt("sourceSceneId");
        Intent intent = new Intent();
        intent.putExtra("key_can_select_video_and_pic", true);
        intent.putExtra("key_send_raw_image", false);
        ((MMActivity) context).mmSetOnActivityResultCallback(new C4479a(bVar, context));
        intent.putExtra("max_select_count", optInt2);
        intent.putExtra("query_source_type", 15);
        intent.putExtra("query_media_type", optInt);
        intent.putExtra("show_header_view", false);
        intent.addFlags(67108864);
        if (optJSONArray != null) {
            intent.putExtra("game_haowan_local_albums_info", optJSONArray.toString());
        }
        intent.putExtra("game_haowan_ignore_video_preview", optBoolean);
        intent.putExtra("game_haowan_source_scene_id", optInt4);
        if (optInt3 == 2) {
            C88144b.m109795m(context, "game", ".media.GameTabGalleryUI", intent, f19244h);
        } else if (optInt3 == 1) {
            C88144b.m109795m(context, "game", ".media.GamePublishGalleryUI", intent, f19244h);
        } else {
            bVar.mo6945a("galleryType is invalid", (JSONObject) null);
            return;
        }
        ((Activity) context).overridePendingTransition(MMFragmentActivity$$c.f318644a, MMFragmentActivity$$c.f318645b);
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
    }
}
