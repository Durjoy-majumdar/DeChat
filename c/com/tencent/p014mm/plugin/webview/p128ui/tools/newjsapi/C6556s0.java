package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import eb0.C75592q0;
import eb0.C86493v0;
import gy3.C87412m;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ke3.C88144b;
import kj2.C117407d;
import ks2.C10405e;
import nj3.C11184p0;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13855j;
import t83.C48590l;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.s0 */
public final class C6556s0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23753d;

    /* renamed from: e */
    public final /* synthetic */ String f23754e;

    /* renamed from: f */
    public final /* synthetic */ String f23755f;

    /* renamed from: g */
    public final /* synthetic */ WebViewUI f23756g;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.s0$a */
    public static final class C6557a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ String f23757d;

        /* renamed from: e */
        public final /* synthetic */ C13855j f23758e;

        public C6557a(String str, C13855j jVar) {
            this.f23757d = str;
            this.f23758e = jVar;
        }

        public final void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == C44108o0.f119484e) {
                HashMap hashMap = new HashMap(1);
                hashMap.put("event", i2 != -1 ? i2 != 0 ? StateEvent.ProcessResult.FAILED : "canceled" : "success");
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
                if (!(stringArrayListExtra == null || stringArrayListExtra.size() == 0)) {
                    Iterator<String> it = stringArrayListExtra.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        C87412m.m108593f(next, "name");
                        if (C112550d0.m153801u(next, "@chatroom", false)) {
                            C117407d.INSTANCE.mo160131h(28358, 2, next, this.f23757d);
                        } else {
                            C117407d.INSTANCE.mo160131h(28358, 1, next, this.f23757d);
                        }
                    }
                }
                Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "createHalfBottomMenu for sns resultCode:" + i2 + " event:" + hashMap.get("event"));
                C13849g gVar = this.f23758e.f39001d;
                C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                ((C48590l) gVar).mo8701f("onShareEmbedExcerptEvent", hashMap);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.s0$b */
    public static final class C6558b implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ String f23759d;

        /* renamed from: e */
        public final /* synthetic */ C86493v0.C86495c f23760e;

        /* renamed from: f */
        public final /* synthetic */ C13855j f23761f;

        public C6558b(String str, C86493v0.C86495c cVar, C13855j jVar) {
            this.f23759d = str;
            this.f23760e = cVar;
            this.f23761f = jVar;
        }

        public final void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == C44108o0.f119484e) {
                HashMap hashMap = new HashMap(1);
                hashMap.put("event", i2 != -1 ? i2 != 0 ? StateEvent.ProcessResult.FAILED : "canceled" : "success");
                String str = this.f23759d;
                if (str != null) {
                    C10405e eVar = C10405e.C10406a.f31628a;
                    if (eVar.f31627a != -1) {
                        C117407d.INSTANCE.mo160131h(28358, 3, Integer.valueOf(eVar.f31627a), URLEncoder.encode(str));
                    }
                    eVar.f31627a = -1;
                }
                Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "shareExcerpts resultCode:" + i2 + " event:" + this.f23760e.mo120955b("event"));
                C13849g gVar = this.f23761f.f39001d;
                C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                ((C48590l) gVar).mo8701f("onShareEmbedExcerptEvent", hashMap);
            }
        }
    }

    public C6556s0(int i, C13855j jVar, int i2, String str, String str2, WebViewUI webViewUI) {
        this.f23753d = jVar;
        this.f23754e = str;
        this.f23755f = str2;
        this.f23756g = webViewUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 2147483646) {
            Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "itemIDShareToFriend onClick");
            Context context = this.f23753d.f38998a;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            Intent intent = new Intent();
            String str = this.f23754e;
            String str2 = this.f23755f;
            intent.putExtra("Retr_File_Name", str);
            intent.putExtra("Retr_Compress_Type", 1);
            intent.putExtra("Retr_Msg_Type", 0);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("img_source_url", str2);
            C13598b0 b0Var = C13598b0.f38549a;
            C88144b.m109803u((MMActivity) context, ".ui.transmit.MsgRetransmitUI", intent, C44108o0.f119484e, new C6557a(this.f23755f, this.f23753d));
        } else if (itemId == 2147483645) {
            Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "itemIDShareToSns onClick");
            if (!Util.isNullOrNil(this.f23754e) && !Util.isNullOrNil(this.f23755f)) {
                String str3 = "biz_excerpt" + C75592q0.m90789s() + '_' + this.f23754e;
                String a = C86493v0.m107223a(str3);
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
                c.mo120962i("prePublishId", str3);
                Intent intent2 = new Intent();
                String str4 = this.f23754e;
                String str5 = this.f23755f;
                intent2.putExtra("reportSessionId", a);
                intent2.putExtra("Ksnsupload_type", 36);
                intent2.putExtra("sns_kemdia_path", str4);
                intent2.putExtra("sns_exceprt_url", str5);
                intent2.putExtra("KBlockAdd", true);
                intent2.putExtra("need_result", true);
                intent2.putExtra("need_ban_back_tips", true);
                intent2.putExtra("need_ban_pic_touch", true);
                intent2.putExtra("k_need_delete", false);
                intent2.putExtra("need_result", false);
                intent2.putExtra("sns_upload_is_show_dialog", true);
                C88144b.m109803u(this.f23756g, ".plugin.sns.ui.SnsUploadUI", intent2, C44108o0.f119484e, new C6558b(this.f23755f, c, this.f23753d));
            }
        } else {
            Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "else value");
            HashMap hashMap = new HashMap();
            CharSequence title = menuItem.getTitle();
            C87412m.m108593f(title, "menuItem.title");
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, title);
            hashMap.put("id", Integer.valueOf(menuItem.getItemId()));
            C13849g gVar = this.f23753d.f39001d;
            C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            ((C48590l) gVar).mo8701f("onShareCustomMenuItemClick", hashMap);
        }
    }
}
