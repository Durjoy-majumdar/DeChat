package l83;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import m83.C10769b;
import m83.C10770c;
import m83.C10771d;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: l83.g */
public final class C10476g extends C86301e implements C10771d {
    /* renamed from: yz */
    public void mo10782yz(C10770c cVar, C10769b bVar) {
        if (cVar != null) {
            Log.m105924i("MicroMsg.NativeDownloadAppManager", "downloadApp downloadAppId: " + cVar.f32244b);
            Intent intent = new Intent();
            intent.setClassName(cVar.f32243a, "com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI");
            intent.putExtra("download_app_id", cVar.f32244b);
            intent.putExtra("from_scene", 5);
            Context context = cVar.f32243a;
            if (context instanceof MMActivity) {
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) context).mmSetOnActivityResultCallback(new C10473d(bVar));
                Context context2 = cVar.f32243a;
                C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) context2).startActivityForResult(intent, 1000);
            } else if (context instanceof MMFragmentActivity) {
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                ((MMFragmentActivity) context).setMMOnFragmentActivityResult(new C10474e(bVar));
                Context context3 = cVar.f32243a;
                C87412m.m108592e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                ((MMFragmentActivity) context3).startActivityForResult(intent, 1000);
            } else if (context instanceof Activity) {
                Log.m105928w("MicroMsg.NativeDownloadAppManager", "downloadApp without callback, just startActivity");
                Context context4 = cVar.f32243a;
                C87412m.m108592e(context4, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) context4;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Activity activity2 = activity;
                C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/download/NativeDownloadAppManager", "downloadApp", "(Lcom/tencent/mm/plugin/webview/download/api/NativeDownloadAppRequest;Lcom/tencent/mm/plugin/webview/download/api/NativeDownloadAppListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity2, "com/tencent/mm/plugin/webview/download/NativeDownloadAppManager", "downloadApp", "(Lcom/tencent/mm/plugin/webview/download/api/NativeDownloadAppRequest;Lcom/tencent/mm/plugin/webview/download/api/NativeDownloadAppListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }
}
