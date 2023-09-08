package dy1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import org.json.JSONObject;
import p447aw.C103918d;
import p447aw.C54369c;
import vc3.C78382a;

/* renamed from: dy1.c */
public class C7543c extends C4770c {

    /* renamed from: dy1.c$a */
    public class C7544a implements AbsRequestFloatWindowPermissionDialog.C85613a {
        public C7544a(C7543c cVar) {
        }

        /* renamed from: a */
        public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            Log.m105928w("LiteAppJsApiBookDownloadGame", "float window permission granted");
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
        }

        /* renamed from: b */
        public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            Log.m105929w("LiteAppJsApiBookDownloadGame", "onResultCancel ok:%b", Boolean.valueOf(((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext())));
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
        }

        /* renamed from: c */
        public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            Log.m105928w("LiteAppJsApiBookDownloadGame", "float window permission refused");
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext())) {
            ((C54369c) C86312j.m106911c(C54369c.class)).mo75136wJ(MMApplicationContext.getContext(), MMApplicationContext.getContext().getString(C0966R.string.evm), new C7544a(this), true, C78382a.m94650b());
        }
    }
}
