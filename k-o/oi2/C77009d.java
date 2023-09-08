package oi2;

import android.content.Context;
import com.tencent.p014mm.plugin.remittance.p098ui.C70939r;
import com.tencent.p014mm.plugin.wxpaysdk.api.ResendMsgInfo;
import di3.C86301e;
import ei3.C86522b;
import qo3.C47883u;
import zb3.C16134c;

@C86522b
/* renamed from: oi2.d */
public class C77009d extends C86301e implements C16134c {
    /* renamed from: Qw */
    public void mo14710Qw(Context context, String str, String str2, String str3, String str4, String str5, C47883u uVar) {
        C70939r rVar = new C70939r(context);
        ResendMsgInfo resendMsgInfo = new ResendMsgInfo();
        resendMsgInfo.f211425d = str;
        resendMsgInfo.f211426e = str2;
        resendMsgInfo.f211427f = str3;
        resendMsgInfo.f211428g = str4;
        resendMsgInfo.f211429h = str5;
        rVar.mo97594a(resendMsgInfo, uVar);
    }

    /* renamed from: xP */
    public void mo14711xP(Context context, ResendMsgInfo resendMsgInfo, C47883u uVar) {
        new C70939r(context).mo97594a(resendMsgInfo, uVar);
    }
}
