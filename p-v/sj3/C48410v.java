package sj3;

import android.app.ProgressDialog;
import com.tencent.p014mm.p136ui.bizchat.BizChatroomInfoUI;
import eb0.z3$$g;
import rb0.C48009v0;

/* renamed from: sj3.v */
public class C48410v implements z3$$g {

    /* renamed from: d */
    public final /* synthetic */ ProgressDialog f129589d;

    /* renamed from: e */
    public final /* synthetic */ BizChatroomInfoUI f129590e;

    public C48410v(BizChatroomInfoUI bizChatroomInfoUI, ProgressDialog progressDialog) {
        this.f129590e = bizChatroomInfoUI;
        this.f129589d = progressDialog;
    }

    /* renamed from: b */
    public boolean mo24603b() {
        return this.f129590e.f121447F;
    }

    /* renamed from: c */
    public void mo24604c() {
        if (this.f129589d != null) {
            C48009v0.Dx0().mo73031qq(this.f129590e.f121458p);
            C48009v0.Ax0().mo73043jo(this.f129590e.f121458p);
            this.f129589d.dismiss();
        }
    }
}
