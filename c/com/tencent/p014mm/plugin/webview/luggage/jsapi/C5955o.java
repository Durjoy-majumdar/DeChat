package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.plugin.webview.model.C43702g2;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashMap;
import ke3.C88144b;
import nj3.C11184p0;
import org.json.JSONObject;
import p447aw.C103918d;
import p828wa.C53096b;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.o */
public class C5955o extends C5954n2<C43658n> {

    /* renamed from: e */
    public C53096b<C43658n>.a f22186e;

    /* renamed from: f */
    public MMActivity f22187f;

    /* renamed from: g */
    public MMActivity.C6739d f22188g = new C5959d();

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.o$a */
    public class C5956a implements View.OnCreateContextMenuListener {
        public C5956a() {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(0, 1, 0, C5955o.this.f22187f.getString(C0966R.string.f7980y8));
            contextMenu.add(0, 2, 1, C5955o.this.f22187f.getString(C0966R.string.f7989yh));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.o$b */
    public class C5957b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ String f22190d;

        /* renamed from: e */
        public final /* synthetic */ Intent f22191e;

        public C5957b(String str, Intent intent) {
            this.f22190d = str;
            this.f22191e = intent;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                C5955o.this.mo6951g(this.f22190d, this.f22191e);
            } else if (itemId == 2) {
                C5955o.this.mo6950f(this.f22191e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.o$c */
    public class C5958c implements C77407n.C47880p {
        public C5958c() {
        }

        public void onDismiss() {
            C5955o.this.mo6952h("cancel", (HashMap<String, Object>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.o$d */
    public class C5959d implements MMActivity.C6739d {
        public C5959d() {
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            int i3 = i2;
            Intent intent2 = intent;
            if (i != (C5955o.this.hashCode() & 65535)) {
                return;
            }
            if (i3 != -1) {
                if (i3 != 0) {
                    C5955o.this.mo6952h("fail", (HashMap<String, Object>) null);
                } else {
                    C5955o.this.mo6952h("cancel", (HashMap<String, Object>) null);
                }
            } else if (intent2 == null) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA bundle is null,");
                C5955o.this.mo6952h("fail", (HashMap<String, Object>) null);
            } else {
                int intExtra = intent2.getIntExtra("key_pick_local_media_callback_type", 0);
                if (intExtra == 1) {
                    String stringExtra = intent2.getStringExtra("key_pick_local_media_local_id");
                    String stringExtra2 = intent2.getStringExtra("key_pick_local_media_thumb_local_id");
                    Log.m105925i("MicroMsg.JsApiChooseMedia", "video localId:%s", stringExtra);
                    Log.m105925i("MicroMsg.JsApiChooseMedia", "video thumbLocalId:%s", stringExtra2);
                    if (Util.isNullOrNil(stringExtra)) {
                        Log.m105920e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA video localId is null");
                        C5955o.this.mo6952h("fail", (HashMap<String, Object>) null);
                        return;
                    }
                    WebViewJSSDKFileItem a = C6013c.m5889a(stringExtra);
                    if (a == null || !(a instanceof WebViewJSSDKVideoItem)) {
                        Log.m105920e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA nor the videoitem");
                        C5955o.this.mo6952h("fail", (HashMap<String, Object>) null);
                        return;
                    }
                    WebViewJSSDKVideoItem webViewJSSDKVideoItem = (WebViewJSSDKVideoItem) a;
                    String i4 = C43702g2.m47536i(stringExtra, stringExtra2, webViewJSSDKVideoItem.f22269w, webViewJSSDKVideoItem.f283031q, webViewJSSDKVideoItem.f283030p, webViewJSSDKVideoItem.f283029o);
                    Log.m105925i("MicroMsg.JsApiChooseMedia", "after parse to json data : %s", i4);
                    HashMap hashMap = new HashMap();
                    hashMap.put("type", 1);
                    hashMap.put("localIds", i4);
                    C5955o.this.mo6952h("", hashMap);
                } else if (intExtra == 2) {
                    String stringExtra3 = intent2.getStringExtra("key_pick_local_media_local_ids");
                    Log.m105925i("MicroMsg.JsApiChooseMedia", "chooseMedia localIds:%s", stringExtra3);
                    if (Util.isNullOrNil(stringExtra3)) {
                        Log.m105920e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA image localIds is null");
                        C5955o.this.mo6952h("fail", (HashMap<String, Object>) null);
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("type", 2);
                    hashMap2.put("localIds", stringExtra3);
                    C5955o.this.mo6952h("", hashMap2);
                } else {
                    Log.m105921e("MicroMsg.JsApiChooseMedia", "type:%d is error", Integer.valueOf(intExtra));
                    C5955o.this.mo6952h("fail", (HashMap<String, Object>) null);
                }
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return JsApiChooseMedia.NAME;
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
        C53096b<C43658n>.a aVar2 = aVar;
        Log.m105924i("MicroMsg.JsApiChooseMedia", "invoke");
        MMActivity mMActivity = (MMActivity) ((C43658n) aVar2.f148189a).f148196d;
        this.f22187f = mMActivity;
        this.f22186e = aVar2;
        if (mMActivity == null) {
            mo6952h("fail", (HashMap<String, Object>) null);
            return;
        }
        JSONObject jSONObject = aVar2.f148190b.f129368c;
        String nullAsNil = Util.nullAsNil(jSONObject.optString("sourceType"));
        String optString = jSONObject.optString("mediaType", "");
        int i = 10;
        int min = Math.min(jSONObject.optInt("maxDuration", 10), 10);
        String optString2 = jSONObject.optString("camera", "");
        int optInt = jSONObject.optInt("count", 1);
        String optString3 = jSONObject.optString("sizeType", "");
        Log.m105925i("MicroMsg.JsApiChooseMedia", "doChooseMedia sourceType:%s, mediaType:%s, maxDuration:%d, camera:%s, count:%d, sizeType:%s", nullAsNil, optString, Integer.valueOf(min), optString2, Integer.valueOf(optInt), optString3);
        Intent intent = new Intent();
        intent.putExtra("key_pick_local_pic_count", optInt);
        if (min > 0) {
            i = min;
        }
        intent.putExtra("key_pick_local_media_duration", i);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("key_pick_local_media_video_type", 2);
        intent.putExtra("key_pick_local_media_sight_type", optString);
        intent.putExtra("key_pick_local_pic_query_source_type", optString3.contains("original") ^ optString3.contains("compressed") ? 7 : 8);
        Boolean valueOf = Boolean.valueOf(!optString3.contains("compressed"));
        if (!optString3.contains("original") && !optString3.contains("compressed")) {
            valueOf = Boolean.FALSE;
        }
        intent.putExtra("key_pick_local_pic_send_raw", valueOf);
        if (Util.isNullOrNil(nullAsNil)) {
            nullAsNil = "album|camera";
        }
        if (nullAsNil.contains(FFmpegMetadataRetriever.METADATA_KEY_ALBUM) && nullAsNil.contains("camera")) {
            new C45082x0(this.f22187f).mo70436b((View) null, new C5956a(), new C5957b(optString2, intent), new C5958c());
        } else if (nullAsNil.contains(FFmpegMetadataRetriever.METADATA_KEY_ALBUM)) {
            mo6950f(intent);
        } else if (nullAsNil.contains("camera")) {
            mo6951g(optString2, intent);
        } else {
            mo6952h("sourceType_error", (HashMap<String, Object>) null);
        }
    }

    /* renamed from: f */
    public final void mo6950f(Intent intent) {
        Log.m105924i("MicroMsg.JsApiChooseMedia", "chooseMediaFromAlbum");
        intent.putExtra("key_pick_local_pic_capture", 4096);
        this.f22187f.mmSetOnActivityResultCallback(this.f22188g);
        C88144b.m109796n(this.f22187f, "webview", ".ui.tools.OpenFileChooserUI", intent, hashCode() & 65535, false);
    }

    /* renamed from: g */
    public final void mo6951g(String str, Intent intent) {
        Log.m105924i("MicroMsg.JsApiChooseMedia", "chooseMediaFromCamera");
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this.f22187f, "android.permission.CAMERA", 119, "", "");
        Log.m105925i("MicroMsg.JsApiChooseMedia", " checkPermission checkcamera[%b]", Boolean.valueOf(z1));
        if (!z1) {
            mo6952h("no_user_permission", (HashMap<String, Object>) null);
            return;
        }
        intent.putExtra("key_pick_local_pic_capture", str.equals("front") ? 16 : 256);
        this.f22187f.mmSetOnActivityResultCallback(this.f22188g);
        C88144b.m109796n(this.f22187f, "webview", ".ui.tools.OpenFileChooserUI", intent, hashCode() & 65535, false);
    }

    /* renamed from: h */
    public final void mo6952h(String str, HashMap<String, Object> hashMap) {
        C53096b<C43658n>.a aVar = this.f22186e;
        if (aVar != null) {
            aVar.mo73777b(str, hashMap);
        }
        this.f22186e = null;
        this.f22187f = null;
    }
}
