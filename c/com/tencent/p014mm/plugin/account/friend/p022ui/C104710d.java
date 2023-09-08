package com.tencent.p014mm.plugin.account.friend.p022ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import hg0.C46060q0;
import java.util.ArrayList;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.account.friend.ui.d */
public class C104710d implements C11385n {

    /* renamed from: d */
    public Context f310953d;

    /* renamed from: e */
    public C104712b f310954e;

    /* renamed from: f */
    public ProgressDialog f310955f;

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.d$a */
    public class C104711a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C46060q0 f310956d;

        public C104711a(C46060q0 q0Var) {
            this.f310956d = q0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f310956d);
            C104710d.this.f310954e.getClass();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.d$b */
    public interface C104712b {
    }

    public C104710d(Context context, C104712b bVar) {
        this.f310953d = context;
        this.f310954e = bVar;
    }

    /* renamed from: a */
    public final void mo148364a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C46060q0 q0Var = new C46060q0(arrayList);
        C86709a0.m107524d().mo123460f(q0Var);
        Context context = this.f310953d;
        this.f310955f = C76879j.m92723Q(context, context.getString(C0966R.string.fsb), this.f310953d.getString(C0966R.string.fs_), true, true, new C104711a(q0Var));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        objArr[2] = str;
        Log.m105925i("MicroMsg.SendInviteGoogleContact", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", objArr);
        if (yVar.getType() == 489) {
            ProgressDialog progressDialog = this.f310955f;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f310955f = null;
            }
            C86709a0.m107524d().mo123470p(489, this);
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.SendInviteGoogleContact", "dealSendInviteSuccess");
                C76879j.m92742m(this.f310953d, C0966R.string.fs9, C0966R.string.a3h, new C104713e(this));
                return;
            }
            Log.m105924i("MicroMsg.SendInviteGoogleContact", "dealSendInviteFail");
            this.f310954e.getClass();
        }
    }
}
