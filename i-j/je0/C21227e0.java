package je0;

import android.content.Intent;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import he0.C46020f;
import he0.C59837i;
import he0.C76161o;
import se0.C22361f;
import te3.C51195s3;

/* renamed from: je0.e0 */
public final class C21227e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C21216d0 f60023d;

    public C21227e0(C21216d0 d0Var) {
        this.f60023d = d0Var;
    }

    public final void run() {
        C21216d0 d0Var = this.f60023d;
        C46020f fVar = d0Var.f60000e;
        d0Var.getClass();
        if (fVar == null || !fVar.isValid()) {
            Log.m105920e("MicroMsg.OpenIMKefuConfirmController", "alvinluo startKefuChatting contact invalid");
            d0Var.mo33209h(2, "get contact failed");
        } else if (d0Var.f59999d == null) {
            Log.m105920e("MicroMsg.OpenIMKefuConfirmController", "alvinluo startKefuChatting request invalid");
            d0Var.mo33209h(5, "request invalid");
        } else {
            Log.m105924i("MicroMsg.OpenIMKefuConfirmController", "alvinluo startKefuChatting username: " + fVar.getUsername());
            OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = d0Var.f59999d;
            if (openIMKefuStartConversationRequest != null) {
                Intent intent = new Intent();
                intent.putExtra("key_is_confirm_page_shown", C76161o.m91464a(d0Var.f60001f));
                openIMKefuStartConversationRequest.f108528t = intent;
                openIMKefuStartConversationRequest.f108515d = d0Var.f59996a;
                if (openIMKefuStartConversationRequest.f108520i == null) {
                    openIMKefuStartConversationRequest.f108520i = new C51195s3();
                }
                openIMKefuStartConversationRequest.f108520i.f141289h = fVar.getUsername();
            }
            OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest2 = d0Var.f59999d;
            C87412m.m108591d(openIMKefuStartConversationRequest2);
            ((C59837i) C86312j.m106911c(C59837i.class)).Hq0(openIMKefuStartConversationRequest2);
            if (C87412m.m108589b(fVar.mo71447r1(), Boolean.TRUE)) {
                C46477j0 j0Var = C46477j0.f125215a;
                String username = fVar.getUsername();
                C87412m.m108593f(username, "contact.username");
                String U = fVar.mo71443U();
                C87412m.m108593f(U, "contact.locationType");
                C46477j0.m51766c(j0Var, username, U, 1, (C32226l) null, 8, (Object) null);
            }
        }
        C22361f fVar2 = this.f60023d.f59997b;
        if (fVar2 != null) {
            fVar2.mo35495d();
        }
        C21231p0.m23720b(this.f60023d.mo33211j(), this.f60023d.mo33212k(), true, 0, "");
    }
}
