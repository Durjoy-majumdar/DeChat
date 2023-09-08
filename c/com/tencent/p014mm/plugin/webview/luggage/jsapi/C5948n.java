package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashMap;
import ke3.C88144b;
import org.json.JSONArray;
import org.json.JSONObject;
import p447aw.C103918d;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.n */
public class C5948n extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.n$a */
    public class C5949a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f22181d;

        public C5949a(C53096b.C53097a aVar) {
            this.f22181d = aVar;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == (C5948n.this.hashCode() & 65535)) {
                boolean booleanExtra = intent == null ? false : intent.getBooleanExtra("key_pick_local_media_show_memory_warning", false);
                Log.m105925i("MicroMsg.JsApiChooseImage", "request to open file chooser, result code = %d, hasShowMemoryWarning = %b", Integer.valueOf(i2), Boolean.valueOf(booleanExtra));
                HashMap hashMap = new HashMap();
                if (booleanExtra) {
                    hashMap.put("memoryWarning", Boolean.TRUE);
                }
                if (i2 == -1) {
                    String stringExtra = intent != null ? intent.getStringExtra("key_pick_local_pic_callback_local_ids") : null;
                    if (Util.isNullOrNil(stringExtra)) {
                        this.f22181d.mo73777b("fail", hashMap);
                    } else {
                        Log.m105925i("MicroMsg.JsApiChooseImage", "localIds = %s", stringExtra);
                        hashMap.put("localIds", stringExtra);
                        String stringExtra2 = intent.getStringExtra("key_pick_local_pic_source_type");
                        if (stringExtra2 != null) {
                            hashMap.put("sourceType", stringExtra2);
                        }
                        this.f22181d.mo73779d(hashMap);
                    }
                } else if (i2 != 0) {
                    this.f22181d.mo73777b("fail", hashMap);
                } else {
                    this.f22181d.mo73777b("cancel", hashMap);
                }
                ((MMActivity) ((C43658n) this.f22181d.f148189a).f148196d).mmSetOnActivityResultCallback((MMActivity.C6739d) null);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return JsApiChooseImage.NAME;
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
        int i;
        Boolean bool;
        C53096b<C43658n>.a aVar2 = aVar;
        Log.m105924i("MicroMsg.JsApiChooseImage", "invoke");
        JSONObject jSONObject = aVar2.f148190b.f129368c;
        JSONArray optJSONArray = jSONObject.optJSONArray("sourceType");
        if (optJSONArray != null) {
            Log.m105924i("MicroMsg.JsApiChooseImage", "sourceType = " + optJSONArray.toString());
            i = 0;
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                if (optJSONArray.optString(i2).equals(FFmpegMetadataRetriever.METADATA_KEY_ALBUM)) {
                    i |= 1;
                } else if (optJSONArray.optString(i2).equals("camera")) {
                    i |= 2;
                }
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            i = 3;
        }
        Log.m105925i("MicroMsg.JsApiChooseImage", "real scene = %d", Integer.valueOf(i));
        if (i == 2) {
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1((Activity) ((C43658n) aVar2.f148189a).f148196d, "android.permission.CAMERA", 113, "", "");
            Log.m105919d("MicroMsg.JsApiChooseImage", " checkPermission checkcamera[%b]", Boolean.valueOf(z1));
            if (!z1) {
                aVar2.mo73778c("android_permission_denied", (JSONObject) null);
                return;
            }
        }
        int optInt = jSONObject.optInt("count", 0);
        Boolean bool2 = Boolean.FALSE;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("sizeType");
        Boolean bool3 = bool2;
        if (optJSONArray2 != null) {
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                if (optJSONArray2.optString(i3).equals("original")) {
                    bool2 = Boolean.TRUE;
                } else if (optJSONArray2.optString(i3).equals("compressed")) {
                    bool3 = Boolean.TRUE;
                }
            }
        }
        int i4 = 7;
        if (bool2.booleanValue() && !bool3.booleanValue()) {
            bool = Boolean.TRUE;
        } else if (bool2.booleanValue() || !bool3.booleanValue()) {
            i4 = 8;
            bool = Boolean.FALSE;
        } else {
            bool = Boolean.FALSE;
        }
        Intent intent = new Intent();
        intent.putExtra("key_pick_local_pic_capture", i);
        intent.putExtra("key_pick_local_pic_count", optInt);
        intent.putExtra("key_pick_local_pic_query_source_type", i4);
        intent.putExtra("key_pick_local_pic_send_raw", bool);
        intent.putExtra("query_media_type", 1);
        Log.m105925i("MicroMsg.JsApiChooseImage", "doChooseImage: realScene: %d, count: %d, querySourceType: %d, sendRaw: %b", Integer.valueOf(i), Integer.valueOf(optInt), Integer.valueOf(i4), bool);
        ((MMActivity) ((C43658n) aVar2.f148189a).f148196d).mmSetOnActivityResultCallback(new C5949a(aVar2));
        C88144b.m109796n(((C43658n) aVar2.f148189a).f148196d, "webview", ".ui.tools.OpenFileChooserUI", intent, hashCode() & 65535, false);
    }
}
