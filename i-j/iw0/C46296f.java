package iw0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.plugin.biz.scheme.BizComSchIntermediateUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import he0.C46025n;
import he0.C59837i;
import java.io.IOException;
import pe3.C89349b;
import qo3.C89779i0;
import te3.C49810i73;
import te3.C50727ot;
import te3.C51195s3;

/* renamed from: iw0.f */
public final class C46296f extends C46290a {

    /* renamed from: a */
    public final String f124743a = "MicroMsg.BizSchemeWWKefu";

    /* renamed from: a */
    public boolean mo71703a(BizComSchIntermediateUI bizComSchIntermediateUI, C89349b bVar, C89349b bVar2, String str) {
        C87412m.m108594g(bizComSchIntermediateUI, "ui");
        C87412m.m108594g(bVar, "actionBuffer");
        C50727ot otVar = new C50727ot();
        try {
            otVar.parseFrom(bVar.mo123703f());
            OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new OpenIMKefuStartConversationRequest();
            openIMKefuStartConversationRequest.f108516e = System.currentTimeMillis();
            openIMKefuStartConversationRequest.f108517f = 17;
            openIMKefuStartConversationRequest.f108515d = bizComSchIntermediateUI;
            C51195s3 s3Var = new C51195s3();
            openIMKefuStartConversationRequest.f108520i = s3Var;
            String str2 = otVar.f139356d;
            s3Var.f141285d = str2;
            s3Var.f141286e = str2;
            s3Var.f141288g = new C49810i73();
            C49810i73 i732 = openIMKefuStartConversationRequest.f108520i.f141288g;
            i732.f135156f = otVar.f139356d;
            i732.f135155e = "";
            i732.f135154d = openIMKefuStartConversationRequest.f108517f;
            openIMKefuStartConversationRequest.f108522n = true;
            openIMKefuStartConversationRequest.f108523o = openIMKefuStartConversationRequest.f108515d.getString(C0966R.string.hfd);
            openIMKefuStartConversationRequest.f108519h = C46025n.m51344a(openIMKefuStartConversationRequest.f108517f);
            openIMKefuStartConversationRequest.f108524p = true;
            openIMKefuStartConversationRequest.f108526r = true;
            ((C59837i) C86312j.m106911c(C59837i.class)).mo71855jT(openIMKefuStartConversationRequest);
            C89779i0 i0Var = bizComSchIntermediateUI.f108999h;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            return true;
        } catch (IOException e) {
            String str3 = this.f124743a;
            Log.m105920e(str3, "e = " + e.getMessage());
            return false;
        }
    }
}
