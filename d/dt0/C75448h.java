package dt0;

import com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopView;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68686b;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;

/* renamed from: dt0.h */
public class C75448h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f221764d;

    /* renamed from: e */
    public final /* synthetic */ C68686b f221765e;

    public C75448h(C68686b bVar, List list) {
        this.f221765e = bVar;
        this.f221764d = list;
    }

    public void run() {
        int size = this.f221765e.f197329d.f197248E1.size() - 1;
        this.f221765e.f197329d.f197248E1.remove(size);
        this.f221765e.f197329d.f197248E1.addAll(this.f221764d);
        AppBrandDesktopView appBrandDesktopView = this.f221765e.f197329d;
        appBrandDesktopView.f197260Q1 = appBrandDesktopView.f197248E1.size() - 1;
        this.f221765e.f197329d.mo94421y1();
        int size2 = this.f221764d.size();
        Log.m105925i("MicroMsg.AppBrandDesktopView", "next page get newSize:%d nowTotal:%d search:%b", Integer.valueOf(size2), Integer.valueOf(this.f221765e.f197329d.f197248E1.size()), Boolean.valueOf(this.f221765e.f197329d.f197251H1));
        if (size2 > 0) {
            this.f221765e.f197329d.f197257N1.notifyItemRemoved(size);
            this.f221765e.f197329d.f197257N1.notifyItemRangeInserted(size, size2 + 1);
        } else {
            this.f221765e.f197329d.f197257N1.notifyItemChanged(size);
        }
        this.f221765e.f197329d.f197252I1 = false;
    }
}
