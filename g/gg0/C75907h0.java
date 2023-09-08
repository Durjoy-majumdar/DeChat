package gg0;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.account.bind.p021ui.VerifyQQUI;
import eg0.C75611b;
import f40.C86709a0;
import nj3.C76879j;

/* renamed from: gg0.h0 */
public class C75907h0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VerifyQQUI f222579d;

    /* renamed from: gg0.h0$a */
    public class C75908a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C75611b f222580d;

        public C75908a(C75907h0 h0Var, C75611b bVar) {
            this.f222580d = bVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f222580d);
        }
    }

    public C75907h0(VerifyQQUI verifyQQUI) {
        this.f222579d = verifyQQUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        VerifyQQUI verifyQQUI = this.f222579d;
        long j = verifyQQUI.f196513f;
        String str = verifyQQUI.f196514g;
        String secImgSid = verifyQQUI.f196517j.getSecImgSid();
        String secImgCode = this.f222579d.f196517j.getSecImgCode();
        String secImgEncryptKey = this.f222579d.f196517j.getSecImgEncryptKey();
        VerifyQQUI verifyQQUI2 = this.f222579d;
        C75611b bVar = new C75611b(j, str, secImgSid, secImgCode, secImgEncryptKey, 1, verifyQQUI2.f196518n, verifyQQUI2.f196519o, true);
        C86709a0.m107524d().mo123460f(bVar);
        VerifyQQUI verifyQQUI3 = this.f222579d;
        verifyQQUI3.f196512e = C76879j.m92723Q(verifyQQUI3.getContext(), this.f222579d.getString(C0966R.string.am9), this.f222579d.getString(C0966R.string.f360174am0), true, true, new C75908a(this, bVar));
    }
}
