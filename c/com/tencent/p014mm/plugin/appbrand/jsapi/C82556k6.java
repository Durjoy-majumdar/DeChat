package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sendtowework.ImgData;
import com.tencent.p014mm.vfs.C86013q1;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.k6 */
public class C82556k6 implements C84795y.C40572a {

    /* renamed from: a */
    public final /* synthetic */ JsApiShowImageOperateSheet.BottomSheetLogicHelper f241662a;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.k6$a */
    public class C82557a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f241663d;

        public C82557a(String str) {
            this.f241663d = str;
        }

        public void run() {
            Intent intent = new Intent();
            intent.putExtra("Retr_File_Name", this.f241663d);
            intent.putExtra("Retr_Compress_Type", 0);
            intent.putExtra("Retr_Msg_Type", 0);
            intent.putExtra("from_scene_forward_to_wework", 6);
            intent.putExtra("content_type_forward_to_wework", 2);
            intent.putExtra("Select_Data_Send_To_WeWork", new ImgData(C86013q1.m106448i(this.f241663d, false)));
            C88144b.m109801s(C82556k6.this.f241662a.f240451c.getContext(), ".ui.transmit.MsgRetransmitUI", intent, (Bundle) null);
        }
    }

    public C82556k6(JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper) {
        this.f241662a = bottomSheetLogicHelper;
    }

    /* renamed from: a */
    public void mo1966a(String str) {
        Log.m105925i("MicroMsg.JsApiShowImageOperateSheet", "sendToFriend path:%s", str);
        if (!Util.isNullOrNil(str)) {
            if (ImgUtil.isGif(str)) {
                Log.m105924i("MicroMsg.JsApiShowImageOperateSheet", "sendToFriend as emoji");
                JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCSendToFriendEmojiRequest iPCSendToFriendEmojiRequest = new JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCSendToFriendEmojiRequest();
                iPCSendToFriendEmojiRequest.f240461d = str;
                C81956c.m100675c(this.f241662a.f240451c.getContext(), iPCSendToFriendEmojiRequest, (AppBrandProxyUIProcessTask.C81943b) null, (Intent) null);
                return;
            }
            MMHandlerThread.postToMainThread(new C82557a(str));
        }
    }
}
