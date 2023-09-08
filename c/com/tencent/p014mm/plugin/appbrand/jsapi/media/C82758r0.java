package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.r0 */
public class C82758r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f242086d;

    /* renamed from: e */
    public final /* synthetic */ JsApiChooseImage.C82653d f242087e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.r0$a */
    public class C82759a implements Runnable {
        public C82759a() {
        }

        public void run() {
            Intent intent = new Intent();
            intent.putExtra("key_send_raw_image", !C82758r0.this.f242087e.f241831d.f241815h);
            intent.putExtra("key_force_show_raw_image_button", C82758r0.this.f242087e.f241831d.f241816i);
            JsApiChooseImage.ChooseRequest chooseRequest = C82758r0.this.f242087e.f241831d;
            intent.putExtra("key_is_raw_image_button_disable", chooseRequest.f241816i && !chooseRequest.f241815h);
            intent.putExtra("max_select_count", C82758r0.this.f242087e.f241831d.f241812e);
            intent.putExtra("query_source_type", C82758r0.this.f242087e.f241833f);
            intent.putExtra("isPreviewPhoto", true);
            intent.putExtra("max_select_count", 1);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(C82758r0.this.f242086d);
            intent.putStringArrayListExtra("preview_image_list", arrayList);
            intent.putExtra("preview_image", true);
            intent.putExtra("key_force_hide_edit_image_button", true);
            intent.addFlags(67108864);
            C82758r0.this.f242087e.startActivityForResult("gallery", ".ui.GalleryEntryUI", intent, 3);
        }
    }

    public C82758r0(JsApiChooseImage.C82653d dVar, String str) {
        this.f242087e = dVar;
        this.f242086d = str;
    }

    public void run() {
        Log.m105925i("MicroMsg.JsApiChooseImage", "take photo, result[%s]", this.f242086d);
        MMHandlerThread.postToMainThread(new C82759a());
    }
}
