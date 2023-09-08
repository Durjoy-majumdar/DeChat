package hi2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;

/* renamed from: hi2.u */
public final class C46075u {

    /* renamed from: a */
    public static final C46075u f124225a = new C46075u();

    /* renamed from: a */
    public final void mo71513a(Intent intent, Intent intent2) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(intent2, "editResult");
        Bundle bundleExtra = intent2.getBundleExtra("key_extra_data");
        if (bundleExtra != null) {
            String string = bundleExtra.getString("kThirdPartyVideoExtData");
            if (!(string == null || string.length() == 0)) {
                try {
                    SendMessageToWX.Req req = new SendMessageToWX.Req();
                    WXMediaMessage wXMediaMessage = new WXMediaMessage();
                    C104289g gVar = new C104289g();
                    gVar.put("miaojianExtInfo", string);
                    wXMediaMessage.messageExt = gVar.toString();
                    req.message = wXMediaMessage;
                    Bundle bundle = new Bundle();
                    req.toBundle(bundle);
                    intent.putExtra("KSnsUploadFromSkipCompress", true);
                    intent.putExtra("Ksnsupload_appid", "wxa5e0de08d96cc09d");
                    intent.putExtra("Ksnsupload_timeline", bundle);
                    intent.putExtra("KSnsAction", true);
                    intent.putExtra("need_result", true);
                    intent.putExtra("KSnsUploadShowAppName", false);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.SecondCutUtil", e, "", new Object[0]);
                }
            }
        }
    }

    /* renamed from: b */
    public final Intent mo71514b(String str, int i, String str2) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C87412m.m108594g(str2, "extInfo");
        Intent intent = new Intent();
        intent.setData(Uri.parse("miaojian://createvideo?scene=" + str + "&maxDuration=" + i + "&from=1" + str2));
        intent.setPackage("com.tencent.phoenix");
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268435456);
        return intent;
    }

    /* renamed from: c */
    public final void mo71515c(Context context, Intent intent) {
        C87412m.m108594g(context, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(intent, "intent");
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/util/SecondCutUtil", "takeSecondCutSigh", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/recordvideo/util/SecondCutUtil", "takeSecondCutSigh", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(C0966R.C0968anim.f2492eg, -1);
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SecondCutUtil", "takeSecondCutSigh: error " + e.getMessage());
        }
    }
}
