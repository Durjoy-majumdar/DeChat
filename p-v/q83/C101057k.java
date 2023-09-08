package q83;

import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSearchWebViewUI;
import com.tencent.p014mm.sdk.platformtools.SyncTask;

/* renamed from: q83.k */
public class C101057k extends SyncTask<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ int f295853a;

    /* renamed from: b */
    public final /* synthetic */ C101058l f295854b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101057k(C101058l lVar, long j, Boolean bool, int i) {
        super(j, bool);
        this.f295854b = lVar;
        this.f295853a = i;
    }

    public Object run() {
        C101058l lVar = this.f295854b;
        int i = this.f295853a;
        boolean z = false;
        if (i == lVar.f295858d && lVar.mo140517e(i) != null) {
            ((BaseSearchWebViewUI) lVar.f295863i).mo68475T9();
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
