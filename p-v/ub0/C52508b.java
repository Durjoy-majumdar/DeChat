package ub0;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import j20.C117292a;
import k20.C9556a;

/* renamed from: ub0.b */
public class C52508b {
    /* renamed from: a */
    public static void m58753a(Activity activity, SendMessageToWX.Req req, Bundle bundle, String str) {
        Intent intent = new Intent(activity, Class.forName("com.tencent.mm.ui.transmit.SelectConversationUI"));
        int i = SendAppMessageWrapperUI.f250361A;
        intent.putExtra("Select_Conv_NextStep", new Intent(activity, SendAppMessageWrapperUI.class).putExtras(bundle).putExtra("SendAppMessageWrapper_Scene", req.scene));
        intent.putExtra("Select_App_Id", str);
        intent.putExtra("Select_Open_Id", req.openId);
        intent.putExtra("Select_Conv_Type", 3);
        if (req.message.getType() == 36 || req.message.getType() == 46) {
            intent.putExtra("mutil_select_is_ret", !((WXMiniProgramObject) req.message.mediaObject).withShareTicket);
        } else {
            intent.putExtra("mutil_select_is_ret", true);
        }
        if (req.message.getType() == 45) {
            intent.putExtra("Select_Send_Card", true);
        }
        intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2506eu);
        intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2334z);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/modelbiz/ww/OpenSdkBridge", "dealSendMsgToWx", "(Landroid/app/Activity;Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;Landroid/os/Bundle;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/modelbiz/ww/OpenSdkBridge", "dealSendMsgToWx", "(Landroid/app/Activity;Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;Landroid/os/Bundle;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: b */
    public static void m58754b(Activity activity, SendMessageToWX.Req req) {
        Bundle bundle = new Bundle();
        req.toBundle(bundle);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        intent.putExtra(ConstantsAPI.APP_PACKAGE, "com.tencent.wework");
        intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
        intent.putExtra(ConstantsAPI.CONTENT, "weixin://sendreq?appid=wx4706a9fcbbca10f2");
        intent.putExtra("SendAppMessageWrapper_BlockInvalidToken", false);
        intent.putExtra("SendAppMessageWrapper_NoNeedStayInWeixin", true);
        try {
            m58753a(activity, req, intent.getExtras(), "com.tencent.wework");
            activity.overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2334z);
        } catch (Throwable unused) {
        }
    }
}
