package dp1;

import android.app.Activity;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;

/* renamed from: dp1.o */
public final class C58395o extends FinderRefreshLayout.C56568a {

    /* renamed from: a */
    public boolean f167306a;

    /* renamed from: b */
    public final /* synthetic */ Activity f167307b;

    public C58395o(Activity activity) {
        this.f167307b = activity;
    }

    /* renamed from: a */
    public void mo79874a(boolean z) {
        this.f167306a = true;
        if (z) {
            C58391n.f167292a.mo83230f(this.f167307b.hashCode());
        }
    }

    /* renamed from: b */
    public void mo79875b() {
        if (this.f167306a) {
            C58391n.f167292a.mo83229e(this.f167307b.hashCode());
            this.f167306a = false;
        }
    }
}
