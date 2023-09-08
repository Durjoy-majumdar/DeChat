package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import com.tencent.p014mm.autogen.events.AppBrandSendAppMsgEvent;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import d62.C7250m;
import eb0.C45628s0;
import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import p225rc.g$$f;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.w */
public final class C82994w implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C32226l<C82975k0, C13598b0> f242649a;

    /* renamed from: b */
    public final /* synthetic */ String f242650b;

    /* renamed from: c */
    public final /* synthetic */ String f242651c;

    public C82994w(C32226l<? super C82975k0, C13598b0> lVar, String str, String str2) {
        this.f242649a = lVar;
        this.f242650b = str;
        this.f242651c = str2;
    }

    /* renamed from: b */
    public final boolean mo1596b(int i, int i2, Intent intent) {
        C82975k0 k0Var = C82975k0.SUCCESS;
        C82975k0 k0Var2 = C82975k0.FAIL;
        StringBuilder sb = new StringBuilder();
        sb.append("doShare, requestCode: ");
        sb.append(i);
        sb.append(", resultCode: ");
        sb.append(i2);
        sb.append(", data exists: ");
        boolean z = false;
        sb.append(intent != null);
        Log.m105924i("MicroMsg.AppBrand.JsApiShareFileMessage", sb.toString());
        if (C82952a0.f242580a != i) {
            return false;
        }
        if (i2 != -1) {
            if (intent != null && true == intent.getBooleanExtra("finish_by_forward_to_wework", false)) {
                z = true;
            }
            if (z) {
                Log.m105924i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, share to wework");
                this.f242649a.invoke(k0Var);
                return true;
            }
            Log.m105924i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, cancel");
            this.f242649a.invoke(C82975k0.CANCEL);
            return true;
        } else if (intent == null) {
            Log.m105924i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, fail since data is null");
            this.f242649a.invoke(k0Var2);
            return true;
        } else {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            Log.m105918d("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, selectedUsersStr: " + stringExtra);
            if (stringExtra == null || stringExtra.length() == 0) {
                Log.m105924i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, fail since selectedUsers is empty 1");
                this.f242649a.invoke(k0Var2);
                return true;
            }
            List<String> stringToList = Util.stringToList(stringExtra, ",");
            if (stringToList == null || stringToList.isEmpty()) {
                Log.m105924i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, fail since selectedUsers is empty 2");
                this.f242649a.invoke(k0Var2);
                return true;
            }
            String stringExtra2 = intent.getStringExtra("custom_send_text");
            Log.m105918d("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, customSendText: " + stringExtra2);
            int i3 = C82952a0.f242580a;
            String str = this.f242650b;
            String str2 = this.f242651c;
            C87412m.m108593f(stringToList, "selectedUsers");
            C32226l<C82975k0, C13598b0> lVar = this.f242649a;
            C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            C87412m.m108594g(str2, DownloadInfo.FILENAME);
            WXMediaMessage wXMediaMessage = new WXMediaMessage();
            WXFileObject wXFileObject = new WXFileObject();
            wXFileObject.setFilePath(str);
            wXMediaMessage.mediaObject = wXFileObject;
            wXMediaMessage.title = str2;
            wXMediaMessage.description = str2;
            boolean z2 = !(stringExtra2 == null || stringExtra2.length() == 0);
            for (String next : stringToList) {
                AppBrandSendAppMsgEvent appBrandSendAppMsgEvent = new AppBrandSendAppMsgEvent();
                AppBrandSendAppMsgEvent.C80704a aVar = appBrandSendAppMsgEvent.f236151d;
                aVar.f236152a = wXMediaMessage;
                aVar.f236153b = next;
                appBrandSendAppMsgEvent.publish();
                if (z2) {
                    C7250m.m7431a().mo136257Tm(next, stringExtra2, C45628s0.m50810y(next), 0);
                }
            }
            lVar.invoke(k0Var);
            return true;
        }
    }
}
