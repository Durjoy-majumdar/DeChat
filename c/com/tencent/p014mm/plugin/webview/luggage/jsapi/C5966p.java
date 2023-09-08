package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashMap;
import ke3.C88144b;
import org.json.JSONObject;
import p447aw.C103918d;
import p749xh.C66261f3;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.p */
public class C5966p extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.p$a */
    public class C5967a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f22203d;

        /* renamed from: e */
        public final /* synthetic */ MMActivity f22204e;

        public C5967a(C53096b.C53097a aVar, MMActivity mMActivity) {
            this.f22203d = aVar;
            this.f22204e = mMActivity;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == 45) {
                if (i2 == -1) {
                    String stringExtra = intent.getStringExtra("key_pick_local_media_local_id");
                    String stringExtra2 = intent.getStringExtra("key_pick_local_media_thumb_local_id");
                    Log.m105925i("MicroMsg.JsApiChooseVideo", "localId:%s", stringExtra);
                    Log.m105925i("MicroMsg.JsApiChooseVideo", "thumbLocalId:%s", stringExtra2);
                    if (Util.isNullOrNil(stringExtra)) {
                        this.f22203d.mo73778c("fail", (JSONObject) null);
                    } else {
                        WebViewJSSDKFileItem a = C6013c.m5889a(stringExtra);
                        if (a == null || !(a instanceof WebViewJSSDKVideoItem)) {
                            this.f22203d.mo73778c("fail", (JSONObject) null);
                        } else {
                            WebViewJSSDKVideoItem webViewJSSDKVideoItem = (WebViewJSSDKVideoItem) a;
                            HashMap hashMap = new HashMap();
                            hashMap.put(C66261f3.COL_LOCALID, stringExtra);
                            hashMap.put("duration", Integer.valueOf(webViewJSSDKVideoItem.f22269w));
                            hashMap.put("height", Integer.valueOf(webViewJSSDKVideoItem.f283031q));
                            hashMap.put("size", Integer.valueOf(webViewJSSDKVideoItem.f283029o));
                            hashMap.put("width", Integer.valueOf(webViewJSSDKVideoItem.f283030p));
                            hashMap.put("thumbLocalId", stringExtra2);
                            this.f22203d.mo73779d(hashMap);
                        }
                    }
                } else if (i2 != 0) {
                    this.f22203d.mo73778c("fail", (JSONObject) null);
                } else {
                    this.f22203d.mo73778c("cancel", (JSONObject) null);
                }
                this.f22204e.mmSetOnActivityResultCallback((MMActivity.C6739d) null);
            } else if (i == 32) {
                if (i2 == -1) {
                    String stringExtra3 = intent.getStringExtra("key_pick_local_media_local_id");
                    if (Util.isNullOrNil(stringExtra3)) {
                        this.f22203d.mo73778c("fail", (JSONObject) null);
                    } else {
                        WebViewJSSDKFileItem a2 = C6013c.m5889a(stringExtra3);
                        if (a2 == null || !(a2 instanceof WebViewJSSDKVideoItem)) {
                            this.f22203d.mo73778c("fail", (JSONObject) null);
                        } else {
                            WebViewJSSDKVideoItem webViewJSSDKVideoItem2 = (WebViewJSSDKVideoItem) a2;
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(C66261f3.COL_LOCALID, stringExtra3);
                            hashMap2.put("duration", Integer.valueOf(webViewJSSDKVideoItem2.f22269w));
                            hashMap2.put("height", Integer.valueOf(webViewJSSDKVideoItem2.f283031q));
                            hashMap2.put("size", Integer.valueOf(webViewJSSDKVideoItem2.f283029o));
                            hashMap2.put("width", Integer.valueOf(webViewJSSDKVideoItem2.f283030p));
                            this.f22203d.mo73779d(hashMap2);
                        }
                    }
                } else if (i2 != 0) {
                    this.f22203d.mo73778c("fail", (JSONObject) null);
                } else {
                    this.f22203d.mo73778c("cancel", (JSONObject) null);
                }
                this.f22204e.mmSetOnActivityResultCallback((MMActivity.C6739d) null);
            }
        }
    }

    /* renamed from: f */
    public static void m5777f(C53096b<C43658n>.a aVar, int i) {
        int i2;
        int i3;
        C53096b<C43658n>.a aVar2 = aVar;
        int i4 = i;
        Class cls = C103918d.class;
        MMActivity mMActivity = (MMActivity) ((C43658n) aVar2.f148189a).f148196d;
        if (mMActivity == null) {
            Log.m105920e("MicroMsg.JsApiChooseVideo", "activity is null");
            return;
        }
        JSONObject jSONObject = aVar2.f148190b.f129368c;
        String optString = jSONObject.optString("sourceType", "");
        String optString2 = jSONObject.optString("camera", "");
        Log.m105925i("MicroMsg.JsApiChooseVideo", "doChooseVideo sourceType = %s, camera = %s, isVideoType:%d", optString, optString2, Integer.valueOf(i));
        int optInt = jSONObject.optInt("maxDuration", 60);
        int i5 = optString.contains(FFmpegMetadataRetriever.METADATA_KEY_ALBUM) ? 4096 : 0;
        if (optString.contains("camera")) {
            if (optInt <= 0) {
                aVar2.mo73778c("fail", (JSONObject) null);
                return;
            }
            i5 = optString2.equals("front") ? i5 | 16 : i5 | 256;
        }
        if (i5 == 0) {
            i5 = 4352;
        }
        if (i5 != 16 && i5 != 256 && i5 != 4352) {
            i2 = i5;
            i3 = optInt;
        } else if (i4 == 1) {
            i2 = i5;
            i3 = optInt;
            boolean z1 = ((C103918d) C86312j.m106911c(cls)).mo125788z1(mMActivity, "android.permission.CAMERA", 117, "", "");
            Log.m105919d("MicroMsg.JsApiChooseVideo", " checkPermission checkcamera[%b]", Boolean.valueOf(z1));
            if (z1) {
                boolean z15 = ((C103918d) C86312j.m106911c(cls)).mo125788z1(mMActivity, "android.permission.RECORD_AUDIO", 118, "", "");
                Log.m105919d("MicroMsg.JsApiChooseVideo", " checkPermission checkMicroPhone[%b]", Boolean.valueOf(z15));
                if (!z15) {
                    return;
                }
            } else {
                return;
            }
        } else {
            i2 = i5;
            i3 = optInt;
            boolean z16 = ((C103918d) C86312j.m106911c(cls)).mo125788z1(mMActivity, "android.permission.CAMERA", 115, "", "");
            Log.m105919d("MicroMsg.JsApiChooseVideo", " checkPermission checkcamera[%b]", Boolean.valueOf(z16));
            if (!z16) {
                return;
            }
        }
        int optInt2 = jSONObject.optInt("quality", 1);
        if (!(optInt2 == 0 || optInt2 == 1)) {
            optInt2 = 1;
        }
        int i6 = i3 > 60 ? 60 : i3;
        Log.m105925i("MicroMsg.JsApiChooseVideo", "doChooseVideo real scene = %d, select count = %d, video quality = %d, duration = %d", Integer.valueOf(i2), 1, Integer.valueOf(optInt2), Integer.valueOf(i6));
        Intent intent = new Intent();
        int i7 = i2;
        intent.putExtra("key_pick_local_pic_capture", i7);
        intent.putExtra("key_pick_local_pic_count", 1);
        intent.putExtra("key_pick_local_pic_query_source_type", 7);
        intent.putExtra("key_pick_local_media_quality", optInt2);
        intent.putExtra("key_pick_local_media_duration", i6);
        intent.putExtra("query_media_type", 2);
        intent.putExtra("key_pick_local_media_video_type", i4);
        Log.m105925i("MicroMsg.JsApiChooseVideo", "doChooseVideo: realScene: %d, count: %d, querySourceType: %d", Integer.valueOf(i7), 1, 7);
        mMActivity.mmSetOnActivityResultCallback(new C5967a(aVar2, mMActivity));
        if (i4 == 1) {
            C88144b.m109796n(mMActivity, "webview", ".ui.tools.OpenFileChooserUI", intent, 45, false);
        } else {
            C88144b.m109796n(mMActivity, "webview", ".ui.tools.OpenFileChooserUI", intent, 32, false);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "chooseVideo";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        Log.m105924i("MicroMsg.JsApiChooseVideo", "invokeInOwn");
        m5777f(aVar, 0);
    }
}
