package je0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import he0.C59837i;
import j20.C117292a;
import k20.C9556a;
import p407zo.C53801g;
import te3.C49810i73;
import te3.C51195s3;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: je0.q0 */
public final class C46494q0 extends C86301e implements C59837i {
    public void Hq0(OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest) {
        C87412m.m108594g(openIMKefuStartConversationRequest, "request");
        C51195s3 s3Var = openIMKefuStartConversationRequest.f108520i;
        String str = null;
        String str2 = s3Var != null ? s3Var.f141289h : null;
        if (str2 == null || str2.length() == 0) {
            Log.m105920e("MicroMsg.OpenIMKefuStartConversationService", "startConversationDirectly username invalid");
            return;
        }
        vx0(openIMKefuStartConversationRequest);
        Intent intent = openIMKefuStartConversationRequest.f108528t;
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("key_start_conversation_request", openIMKefuStartConversationRequest);
        intent.putExtras(openIMKefuStartConversationRequest.f108529u);
        if (openIMKefuStartConversationRequest.f108524p) {
            intent.setClassName(openIMKefuStartConversationRequest.f108515d, "com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI");
            intent.putExtra("Contact_User", "opencustomerservicemsg");
            if (openIMKefuStartConversationRequest.f108526r) {
                intent.putExtra("key_back_to_launcher_ui_when_finish", true);
            }
        } else {
            String str3 = "";
            if (!openIMKefuStartConversationRequest.f108521j) {
                intent.putExtra("finish_direct", true);
                C51195s3 s3Var2 = openIMKefuStartConversationRequest.f108520i;
                if (s3Var2 != null) {
                    str = s3Var2.f141289h;
                }
                if (str != null) {
                    str3 = str;
                }
                intent.putExtra("Chat_User", str3);
                intent.setClassName(openIMKefuStartConversationRequest.f108515d, "com.tencent.mm.ui.conversation.OpenImKefuServiceChattingUI");
            } else {
                C53801g gVar = (C53801g) C86312j.m106911c(C53801g.class);
                C51195s3 s3Var3 = openIMKefuStartConversationRequest.f108520i;
                if (s3Var3 != null) {
                    str = s3Var3.f141289h;
                }
                if (str != null) {
                    str3 = str;
                }
                gVar.mo61947aX(str3, true, intent);
            }
        }
        if (!(openIMKefuStartConversationRequest.f108515d instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (!openIMKefuStartConversationRequest.f108521j) {
            Context context = openIMKefuStartConversationRequest.f108515d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversationWithoutConfirm", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversationWithoutConfirm", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: jT */
    public void mo71855jT(OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest) {
        C87412m.m108594g(openIMKefuStartConversationRequest, "request");
        vx0(openIMKefuStartConversationRequest);
        Log.m105925i("MicroMsg.OpenIMKefuStartConversationService", "alvinluo startConversation %s", openIMKefuStartConversationRequest);
        if (openIMKefuStartConversationRequest.f108516e == 0) {
            openIMKefuStartConversationRequest.f108516e = System.currentTimeMillis();
        }
        Intent intent = openIMKefuStartConversationRequest.f108528t;
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("key_start_conversation_request", openIMKefuStartConversationRequest);
        intent.putExtras(openIMKefuStartConversationRequest.f108529u);
        intent.setClassName(openIMKefuStartConversationRequest.f108515d, "com.tencent.mm.openim.ui.OpenIMKefuConfirmUI");
        if (!(openIMKefuStartConversationRequest.f108515d instanceof Activity)) {
            intent.addFlags(268435456);
        }
        Context context = openIMKefuStartConversationRequest.f108515d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversation", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversation", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void vx0(OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest) {
        C51195s3 s3Var = openIMKefuStartConversationRequest.f108520i;
        if (s3Var != null) {
            if (s3Var.f141288g == null) {
                s3Var.f141288g = new C49810i73();
            }
            C49810i73 i732 = s3Var.f141288g;
            if (i732 != null) {
                i732.f135154d = openIMKefuStartConversationRequest.f108517f;
                C51195s3 s3Var2 = openIMKefuStartConversationRequest.f108520i;
                C87412m.m108591d(s3Var2);
                i732.f135156f = s3Var2.f141285d;
            }
        }
    }
}
