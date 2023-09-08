package com.tencent.p014mm.plugin.account.friend.p022ui;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.account.friend.ui.c */
public class C104708c implements C11385n {

    /* renamed from: d */
    public Context f310950d;

    /* renamed from: e */
    public C104709a f310951e;

    /* renamed from: f */
    public ProgressDialog f310952f;

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.c$a */
    public interface C104709a {
    }

    public C104708c(Context context, C104709a aVar) {
        this.f310950d = context;
        this.f310951e = aVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 116) {
            ProgressDialog progressDialog = this.f310952f;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f310952f = null;
            }
            C86709a0.m107524d().mo123470p(116, this);
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.SendInviteEmail", "dealSendInviteEmailSuccess");
                C76879j.m92742m(this.f310950d, C0966R.string.fs9, C0966R.string.a3h, new C104707b(this));
                return;
            }
            Log.m105924i("MicroMsg.SendInviteEmail", "dealSendInviteEmailFail");
            this.f310951e.getClass();
        }
    }
}
