package b51;

import android.view.View;
import c51.C39896e;
import com.tencent.p014mm.plugin.downloader.model.CloudGameAppInfoWrapper;
import com.tencent.p014mm.plugin.downloader.p796ui.GameCloudAppDownloadUI;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: b51.c */
public final class C39728c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameCloudAppDownloadUI f106594d;

    /* renamed from: e */
    public final /* synthetic */ CloudGameAppInfoWrapper f106595e;

    /* renamed from: f */
    public final /* synthetic */ C101218e0 f106596f;

    public C39728c(GameCloudAppDownloadUI gameCloudAppDownloadUI, CloudGameAppInfoWrapper cloudGameAppInfoWrapper, C101218e0 e0Var) {
        this.f106594d = gameCloudAppDownloadUI;
        this.f106595e = cloudGameAppInfoWrapper;
        this.f106596f = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        GameCloudAppDownloadUI gameCloudAppDownloadUI = this.f106594d;
        CloudGameAppInfoWrapper cloudGameAppInfoWrapper = this.f106595e;
        GameCloudAppDownloadUI.m44406I7(gameCloudAppDownloadUI, cloudGameAppInfoWrapper.f110078g, cloudGameAppInfoWrapper.f110077f, cloudGameAppInfoWrapper.f110076e, true);
        this.f106596f.mo140680z();
        C39896e eVar = C39896e.f106968a;
        CloudGameAppInfoWrapper cloudGameAppInfoWrapper2 = this.f106595e;
        eVar.mo62506d(4, cloudGameAppInfoWrapper2.f110076e, cloudGameAppInfoWrapper2.f110079h.f110063f, cloudGameAppInfoWrapper2.f110077f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
