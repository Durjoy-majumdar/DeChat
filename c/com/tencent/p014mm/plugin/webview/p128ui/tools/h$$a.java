package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.model.C43702g2;
import com.tencent.p014mm.plugin.webview.model.C6049n1;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import p232rw.C77575r;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.h$$a */
public final /* synthetic */ class h$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C6175h f22642d;

    /* renamed from: e */
    public final /* synthetic */ String f22643e;

    /* renamed from: f */
    public final /* synthetic */ Intent f22644f;

    /* renamed from: g */
    public final /* synthetic */ C77575r f22645g;

    public /* synthetic */ h$$a(C6175h hVar, String str, Intent intent, C77575r rVar) {
        this.f22642d = hVar;
        this.f22643e = str;
        this.f22644f = intent;
        this.f22645g = rVar;
    }

    public final void run() {
        C6175h hVar = this.f22642d;
        String str = this.f22643e;
        Intent intent = this.f22644f;
        C77575r rVar = this.f22645g;
        hVar.getClass();
        ArrayList arrayList = new ArrayList();
        WebViewJSSDKFileItem b = C6049n1.m5933b(str);
        b.f283034t = true;
        b.f283028n = 1;
        C6080m.Ax0().mo7009a(b);
        arrayList.add(b.f283022e);
        Log.m105925i("MicroMsg.OpenFileChooserUI", "filepath is : %s, local id is : %s", str, b.f283022e);
        String g = Util.isEqual(hVar.f22641d.f22510p, JsApiChooseImage.NAME) ? C43702g2.m47534g(arrayList) : C43702g2.m47535h(arrayList);
        Log.m105925i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", g);
        intent.putExtra("key_pick_local_media_local_ids", g);
        intent.putExtra("key_pick_local_media_callback_type", 2);
        intent.putExtra("key_pick_local_media_show_memory_warning", hVar.f22641d.f22513s);
        intent.putExtra("key_pick_local_pic_source_type", hVar.f22641d.f22511q ? "camera" : FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
        hVar.f22641d.setResult(rVar.f226147b, intent);
        hVar.f22641d.finish();
    }
}
