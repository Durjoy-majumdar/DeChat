package com.tencent.p014mm.p136ui.tools;

import android.app.ProgressDialog;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.ui.tools.ShareScreenImgUI$$c */
public class ShareScreenImgUI$$c extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ ShareScreenImgUI f220041a;

    public ShareScreenImgUI$$c(ShareScreenImgUI shareScreenImgUI) {
        this.f220041a = shareScreenImgUI;
    }

    public void handleMessage(Message message) {
        ShareScreenImgUI shareScreenImgUI = this.f220041a;
        ProgressDialog progressDialog = shareScreenImgUI.f220035d;
        if (progressDialog != null && progressDialog.isShowing()) {
            shareScreenImgUI.f220035d.dismiss();
        }
        if (Util.isNullOrNil(this.f220041a.f220037f)) {
            Log.m105920e("MicroMsg.ShareScreenImgUI", "launch : fail, filePath is null");
            this.f220041a.mo104033I7();
            this.f220041a.finish();
            return;
        }
        this.f220041a.mo104032H7();
    }
}
