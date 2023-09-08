package com.tencent.p014mm.p136ui.conversation;

import android.app.ProgressDialog;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.conversation.InitHelper$$e */
public class InitHelper$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f219462d;

    /* renamed from: e */
    public final /* synthetic */ InitHelper f219463e;

    public InitHelper$$e(InitHelper initHelper, int i) {
        this.f219463e = initHelper;
        this.f219462d = i;
    }

    public void run() {
        ProgressDialog progressDialog = this.f219463e.f219446n;
        if (progressDialog != null) {
            progressDialog.setMessage(this.f219463e.f219447o.getString(C0966R.string.a05) + this.f219462d + "%");
        }
    }
}
