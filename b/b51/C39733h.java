package b51;

import android.view.View;
import c51.C39890a;
import c51.C39896e;
import com.tencent.p014mm.plugin.downloader.model.CloudGameAppInfo;
import com.tencent.p014mm.plugin.downloader.model.CloudGameAppInfoWrapper;
import com.tencent.p014mm.plugin.downloader.p796ui.GameCloudAppDownloadUI;
import com.tencent.p014mm.plugin.downloader_app.model.C40979a;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import nd3.C47223a;
import p237sp.C13747c0;
import qo3.C101218e0;
import z41.C53736a;

/* renamed from: b51.h */
public final class C39733h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f106605d;

    /* renamed from: e */
    public final /* synthetic */ C53736a f106606e;

    /* renamed from: f */
    public final /* synthetic */ CloudGameAppInfoWrapper f106607f;

    /* renamed from: g */
    public final /* synthetic */ GameCloudAppDownloadUI f106608g;

    /* renamed from: h */
    public final /* synthetic */ C101218e0 f106609h;

    public C39733h(boolean z, C53736a aVar, CloudGameAppInfoWrapper cloudGameAppInfoWrapper, GameCloudAppDownloadUI gameCloudAppDownloadUI, C101218e0 e0Var) {
        this.f106605d = z;
        this.f106606e = aVar;
        this.f106607f = cloudGameAppInfoWrapper;
        this.f106608g = gameCloudAppDownloadUI;
        this.f106609h = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f106605d) {
            C53736a aVar = this.f106606e;
            if (aVar != null) {
                C39890a.m42668a(aVar.field_downloadId, false, (C47223a) null);
                C39896e eVar = C39896e.f106968a;
                CloudGameAppInfoWrapper cloudGameAppInfoWrapper = this.f106607f;
                eVar.mo62506d(44, cloudGameAppInfoWrapper.f110076e, cloudGameAppInfoWrapper.f110079h.f110063f, cloudGameAppInfoWrapper.f110077f);
            }
        } else {
            GameCloudAppDownloadUI gameCloudAppDownloadUI = this.f106608g;
            CloudGameAppInfo cloudGameAppInfo = this.f106607f.f110079h;
            int i = GameCloudAppDownloadUI.f110279f;
            gameCloudAppDownloadUI.getClass();
            C40979a aVar2 = new C40979a();
            aVar2.f110289a = cloudGameAppInfo.f110071q;
            aVar2.f110290b = cloudGameAppInfo.f110072r;
            aVar2.f110295g = cloudGameAppInfo.f110070p;
            aVar2.f110291c = cloudGameAppInfo.f110061d;
            aVar2.f110296h = cloudGameAppInfo.f110073s;
            aVar2.f110292d = cloudGameAppInfo.f110063f;
            aVar2.f110294f = cloudGameAppInfo.f110064g;
            aVar2.f110302n = 1;
            aVar2.f110303o = cloudGameAppInfo.f110074t;
            ((C13747c0) C86312j.m106911c(C13747c0.class)).mo13114ky(MMApplicationContext.getContext(), aVar2, C0246a.f784a);
            C39896e eVar2 = C39896e.f106968a;
            CloudGameAppInfoWrapper cloudGameAppInfoWrapper2 = this.f106607f;
            eVar2.mo62506d(23, cloudGameAppInfoWrapper2.f110076e, cloudGameAppInfoWrapper2.f110079h.f110063f, cloudGameAppInfoWrapper2.f110077f);
        }
        GameCloudAppDownloadUI gameCloudAppDownloadUI2 = this.f106608g;
        CloudGameAppInfoWrapper cloudGameAppInfoWrapper3 = this.f106607f;
        GameCloudAppDownloadUI.m44406I7(gameCloudAppDownloadUI2, cloudGameAppInfoWrapper3.f110078g, cloudGameAppInfoWrapper3.f110077f, cloudGameAppInfoWrapper3.f110076e, false);
        this.f106609h.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
