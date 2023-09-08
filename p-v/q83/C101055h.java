package q83;

import android.view.ViewGroup;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSearchWebViewUI;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import java.util.LinkedList;
import q83.C101058l;

/* renamed from: q83.h */
public class C101055h extends SyncTask<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ int f295847a;

    /* renamed from: b */
    public final /* synthetic */ C101058l f295848b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101055h(C101058l lVar, long j, Boolean bool, int i) {
        super(j, bool);
        this.f295848b = lVar;
        this.f295847a = i;
    }

    public Object run() {
        boolean z;
        C101058l lVar = this.f295848b;
        int i = this.f295847a;
        C101058l.C101059a e = lVar.mo140517e(i);
        if (e != null) {
            if (i == lVar.f295858d && lVar.mo140517e(i) != null) {
                ((BaseSearchWebViewUI) lVar.f295863i).mo68475T9();
            }
            lVar.f295857c.removeAll(lVar.mo140514b(e));
            ViewGroup c = lVar.mo140515c(e.f295866c);
            if (c != null) {
                ((LinkedList) lVar.f295857c).remove(e);
                c.removeView(e.f295864a.get());
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
