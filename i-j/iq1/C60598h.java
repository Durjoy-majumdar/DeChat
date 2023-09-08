package iq1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.finder.p056ui.ShareRelPresenter;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: iq1.h */
public final class C60598h implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C60593d f172706d;

    public C60598h(C60593d dVar) {
        this.f172706d = dVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        FinderVideoCore finderVideoCore;
        ShareRelPresenter shareRelPresenter = this.f172706d.f172701q;
        if (shareRelPresenter != null && (finderVideoCore = shareRelPresenter.f29969o) != null) {
            finderVideoCore.mo79538z1().mo80076f1(MMApplicationContext.getContext());
        }
    }
}
