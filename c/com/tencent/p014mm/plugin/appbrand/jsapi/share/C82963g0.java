package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import nj3.C76879j;
import p008bq.C67309t0;
import p225rc.C89916g;
import p645pj.C77092c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.g0 */
public final class C82963g0 extends AppBrandProxyUIProcessTask {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.g0$a */
    public static final class C82964a extends C87413o implements C32226l<C82975k0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82963g0 f242593d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82964a(C82963g0 g0Var) {
            super(1);
            this.f242593d = g0Var;
        }

        public Object invoke(Object obj) {
            C82975k0 k0Var = (C82975k0) obj;
            C87412m.m108594g(k0Var, "shareResult");
            this.f242593d.finishProcess(new ShareToConversationResult(k0Var.f242615d));
            return C13598b0.f38549a;
        }
    }

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        IEmojiInfo iEmojiInfo;
        if (!(processRequest instanceof ShareGifToConversationRequest)) {
            Log.m105928w("MicroMsg.AppBrand.ShareGifToConversationLogic", "handleRequest, request is not ShareGifToConversationRequest");
            return;
        }
        ShareGifToConversationRequest shareGifToConversationRequest = (ShareGifToConversationRequest) processRequest;
        if (shareGifToConversationRequest.f242574d.length() == 0) {
            Log.m105928w("MicroMsg.AppBrand.ShareGifToConversationLogic", "handleRequest, fail since path is empty");
            finishProcess(new ShareToConversationResult(2));
            return;
        }
        C82961f0 f0Var = C82961f0.f242591a;
        MMActivity activityContext = getActivityContext();
        C87412m.m108593f(activityContext, "activityContext");
        String str = shareGifToConversationRequest.f242574d;
        C82964a aVar = new C82964a(this);
        f0Var.getClass();
        Class cls = C67309t0.class;
        C87412m.m108594g(str, "gifPath");
        if (!((C67309t0) C86312j.m106911c(cls)).mo91194sI()) {
            iEmojiInfo = ((C67309t0) C86312j.m106911c(cls)).mo91189Vs(C86013q1.m106456q(str));
            if (iEmojiInfo == null) {
                iEmojiInfo = ((C67309t0) C86312j.m106911c(cls)).mo91189Vs(((C67309t0) C86312j.m106911c(cls)).mo91190WE(MMApplicationContext.getContext(), str));
            }
        } else {
            iEmojiInfo = null;
        }
        boolean z = (iEmojiInfo == null ? 0 : C86013q1.m106451l(iEmojiInfo.mo62640K1())) > ((long) C77092c.m93039a());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (iEmojiInfo != null) {
            str = iEmojiInfo.mo62640K1();
        }
        boolean z2 = (BitmapUtil.decodeFile(str, options) != null && options.outHeight > C77092c.m93041c()) || options.outWidth > C77092c.m93041c();
        String str2 = "";
        if (z || z2) {
            Log.m105924i("MicroMsg.AppBrand.ShareGifToConversationLogic", "doShare, fail since gif illegal");
            C76879j.m92754y(activityContext, activityContext.getString(C0966R.string.c5n), str2, activityContext.getString(C0966R.string.fmz), new C82955c0(aVar));
            return;
        }
        C89916g.m112446a(activityContext).mo124232f(new C82957d0(new C82959e0(aVar)));
        Intent intent = new Intent();
        if (iEmojiInfo != null) {
            str2 = iEmojiInfo.getMd5();
        }
        intent.putExtra("Retr_File_Name", str2);
        intent.putExtra("Retr_Msg_Type", 5);
        intent.putExtra("Retr_MsgImgScene", 1);
        intent.putExtra("Retr_show_success_tips", false);
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 14);
        C13598b0 b0Var = C13598b0.f38549a;
        C88144b.m109802t(activityContext, ".ui.transmit.MsgRetransmitUI", intent, C82961f0.f242592b);
    }
}
