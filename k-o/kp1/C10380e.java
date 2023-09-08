package kp1;

import com.tencent.p014mm.plugin.finder.search.p055ui.FinderSearchBaseUI;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;

/* renamed from: kp1.e */
public final class C10380e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f31589d;

    /* renamed from: e */
    public final /* synthetic */ FinderSearchBaseUI f31590e;

    /* renamed from: f */
    public final /* synthetic */ int f31591f;

    public C10380e(int i, FinderSearchBaseUI finderSearchBaseUI, int i2) {
        this.f31589d = i;
        this.f31590e = finderSearchBaseUI;
        this.f31591f = i2;
    }

    public final void run() {
        if (this.f31589d != 0) {
            boolean z = true;
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(1);
            cVar.f24951f = this.f31590e.mo3104N7().hasMore();
            int i = this.f31591f;
            int i2 = this.f31589d;
            if (i - i2 > 0) {
                z = false;
            }
            cVar.f24952g = z;
            cVar.f24953h = i - i2;
            this.f31590e.mo3959P7().onPreFinishLoadMoreSmooth(cVar);
            return;
        }
        this.f31590e.mo3959P7().mo82440F(this.f31591f);
    }
}
