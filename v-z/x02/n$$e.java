package x02;

import android.widget.Toast;
import b12.C79645d;
import com.tencent.p014mm.plugin.p064hp.mmdiff.MMDiffPatchResultService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import h81.C32735h;
import v02.C90734a;
import w02.C90878b;
import w02.C90884g;

public class n$$e implements C90884g {

    /* renamed from: a */
    public final /* synthetic */ C91124n f261338a;

    public n$$e(C91124n nVar) {
        this.f261338a = nVar;
    }

    /* renamed from: a */
    public void mo123270a(C90878b bVar) {
        MMDiffPatchResultService.f248324f = null;
        if (bVar != null) {
            Log.m105925i("Tinker.SyncResponseProcessor", "HdiffApk, onPatchResult, result.isSuccess = %s, result = %s", Boolean.valueOf(bVar.f260855d), bVar);
        } else {
            Log.m105924i("Tinker.SyncResponseProcessor", "HdiffApk, onPatchResult, result.isnull.");
        }
        C79645d.m96728d(this.f261338a.f261324d, bVar.f260856e);
        C79645d.m96745u();
        C79645d.m96729e();
        Log.m105924i("Tinker.SyncResponseProcessor", "HdiffApk merge finish. auto");
        if (bVar.f260855d) {
            boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_upgrade_force_show_notifyupdate_ready, 0) == 1;
            Log.m105925i("Tinker.SyncResponseProcessor", "HdiffApk merge finish. notifyExptKeyChange, isForceAutoMergeNotify = %s.", Boolean.valueOf(z));
            if (z) {
                C90734a.m113788e("mmdiff_apk_has_ready", 0, 4);
            }
            if (this.f261338a.f261326f) {
                Toast.makeText(MMApplicationContext.getContext(), "merge patch success, Switch wechat from background to foreground.", 1).show();
            }
        } else if (this.f261338a.f261326f) {
            Toast.makeText(MMApplicationContext.getContext(), "merge patch fail", 1).show();
        }
    }
}
