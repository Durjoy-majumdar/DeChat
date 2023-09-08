package b51;

import android.view.View;
import com.tencent.p014mm.plugin.downloader.model.CloudGameAppInfoWrapper;
import com.tencent.p014mm.plugin.downloader.p796ui.GameCloudAppDownloadUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: b51.g */
public final class C39732g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameCloudAppDownloadUI f106603d;

    /* renamed from: e */
    public final /* synthetic */ CloudGameAppInfoWrapper f106604e;

    public C39732g(GameCloudAppDownloadUI gameCloudAppDownloadUI, CloudGameAppInfoWrapper cloudGameAppInfoWrapper) {
        this.f106603d = gameCloudAppDownloadUI;
        this.f106604e = cloudGameAppInfoWrapper;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        GameCloudAppDownloadUI gameCloudAppDownloadUI = this.f106603d;
        GameCloudAppDownloadUI.m44405H7(gameCloudAppDownloadUI, gameCloudAppDownloadUI, this.f106604e.f110079h.f110069o);
        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
