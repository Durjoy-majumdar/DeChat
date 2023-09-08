package com.tencent.p014mm.p136ui.chatting;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;

/* renamed from: com.tencent.mm.ui.chatting.u2 */
public class C6802u2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C73843s2 f24354d;

    public C6802u2(C73843s2 s2Var) {
        this.f24354d = s2Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C73843s2 s2Var = this.f24354d;
        s2Var.getClass();
        Log.m105924i("MicroMsg.ChattingQQMailFooterHandler", "dz[initQQMailDownloadUrlAndMD5]");
        ThreadPool.post(new C85843w2(s2Var), "QQMailDownloadUrlAndMD5");
    }
}
