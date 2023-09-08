package ry1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42046d;
import com.tencent.p014mm.plugin.game.model.C42051e1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p763ym.C79138l;

/* renamed from: ry1.z0 */
public class C48176z0 implements View.OnClickListener {

    /* renamed from: d */
    public Context f129121d;

    /* renamed from: e */
    public C42039b f129122e;

    /* renamed from: f */
    public int f129123f = 0;

    /* renamed from: g */
    public String f129124g = null;

    /* renamed from: h */
    public int f129125h;

    public C48176z0(Context context) {
        this.f129121d = context;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameTMAssistClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof C42039b)) {
            Log.m105920e("MicroMsg.GameTMAssistClickListener", "No GameAppInfo");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameTMAssistClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f129122e = (C42039b) view.getTag();
        Log.m105924i("MicroMsg.GameTMAssistClickListener", "Clicked appid = " + this.f129122e.field_appId);
        if (((C79138l) C86312j.m106911c(C79138l.class)).Tb0(this.f129121d, this.f129122e.field_appId)) {
            Log.m105918d("MicroMsg.GameTMAssistClickListener", "launchFromWX, appId = " + this.f129122e.field_appId + ", pkg = " + this.f129122e.field_packageName + ", openId = " + this.f129122e.field_openId);
            Context context = this.f129121d;
            C42039b bVar = this.f129122e;
            C40314g.m43487f(context, bVar.f113254G1, bVar.f113255H1, bVar.f113256I1, 3, bVar.field_appId, this.f129123f, this.f129124g);
            C42046d.m45751j(this.f129121d, this.f129122e.field_appId);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameTMAssistClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C42051e1 a = C42051e1.m45759a();
        String str = this.f129122e.f149254U;
        a.getClass();
        int i = -1;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus, params is null or nil");
        } else {
            try {
                TMAssistantDownloadTaskInfo downloadTaskState = C42051e1.m45759a().mo66030b().getDownloadTaskState(new C42051e1.C42053b((C42051e1.C42052a) null).mo66031a(str));
                if (downloadTaskState != null) {
                    i = downloadTaskState.mState;
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus failed : %s", e.getMessage());
            }
        }
        this.f129125h = i;
        String str2 = this.f129122e.f149254U;
        if (!Util.isNullOrNil(str2)) {
            str2 = str2.replace("ANDROIDWX.GAMECENTER", "ANDROIDWX.YYB.GAMECENTER");
        }
        if (this.f129122e.f113270y1 == 3) {
            C42051e1 a2 = C42051e1.m45759a();
            Context context2 = this.f129121d;
            a2.getClass();
            if (Util.isNullOrNil(str2)) {
                Log.m105920e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus, params is null or nil");
            } else {
                try {
                    C42051e1.m45759a().mo66030b().startToAuthorized(context2, new C42051e1.C42053b((C42051e1.C42052a) null).mo66031a(str2), "1");
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.QQDownloaderSDKWrapper", "startToAuthorized fail, ex = %s", e2.getMessage());
                }
            }
        } else {
            C42051e1 a3 = C42051e1.m45759a();
            Context context3 = this.f129121d;
            a3.getClass();
            if (Util.isNullOrNil(str2)) {
                Log.m105920e("MicroMsg.QQDownloaderSDKWrapper", "add download task failed, params is null or nil");
            } else if (context3 == null) {
                Log.m105920e("MicroMsg.QQDownloaderSDKWrapper", "add download task failed, context is null");
            } else {
                Log.m105925i("MicroMsg.QQDownloaderSDKWrapper", "add download task to qqdownloader:[%s]", str2);
                try {
                    C42051e1.m45759a().mo66030b().startToDownloadTaskList(context3, new C42051e1.C42053b((C42051e1.C42052a) null).mo66031a(str2), true, true);
                } catch (Exception e3) {
                    Log.printErrStackTrace("MicroMsg.QQDownloaderSDKWrapper", e3, "", new Object[0]);
                }
            }
        }
        int i2 = 5;
        C42039b bVar2 = this.f129122e;
        if (bVar2.f113270y1 == 3) {
            i2 = 10;
        }
        C40314g.m43488g(this.f129121d, bVar2.f113254G1, bVar2.f113255H1, bVar2.f113256I1, this.f129125h == 4 ? 8 : i2, bVar2.field_appId, this.f129123f, bVar2.f113252E1, this.f129124g);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameTMAssistClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
