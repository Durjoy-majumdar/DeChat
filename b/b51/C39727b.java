package b51;

import android.view.View;
import c51.C39896e;
import com.tencent.p014mm.plugin.downloader.model.CloudGameAppInfoWrapper;
import com.tencent.p014mm.plugin.downloader.p796ui.GameCloudAppDownloadUI;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: b51.b */
public final class C39727b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameCloudAppDownloadUI f106591d;

    /* renamed from: e */
    public final /* synthetic */ CloudGameAppInfoWrapper f106592e;

    /* renamed from: f */
    public final /* synthetic */ C101218e0 f106593f;

    public C39727b(GameCloudAppDownloadUI gameCloudAppDownloadUI, CloudGameAppInfoWrapper cloudGameAppInfoWrapper, C101218e0 e0Var) {
        this.f106591d = gameCloudAppDownloadUI;
        this.f106592e = cloudGameAppInfoWrapper;
        this.f106593f = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        GameCloudAppDownloadUI gameCloudAppDownloadUI = this.f106591d;
        CloudGameAppInfoWrapper cloudGameAppInfoWrapper = this.f106592e;
        GameCloudAppDownloadUI.m44406I7(gameCloudAppDownloadUI, cloudGameAppInfoWrapper.f110078g, cloudGameAppInfoWrapper.f110077f, cloudGameAppInfoWrapper.f110076e, true);
        this.f106593f.mo140680z();
        C39896e eVar = C39896e.f106968a;
        CloudGameAppInfoWrapper cloudGameAppInfoWrapper2 = this.f106592e;
        eVar.mo62506d(4, cloudGameAppInfoWrapper2.f110076e, cloudGameAppInfoWrapper2.f110079h.f110063f, cloudGameAppInfoWrapper2.f110077f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
