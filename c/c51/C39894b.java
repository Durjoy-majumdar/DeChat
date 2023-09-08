package c51;

import android.content.Context;
import android.content.Intent;
import c51.C39890a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import k20.C9556a;
import nd3.C88931f;
import p910lj.C76701a;
import y41.C53491a;
import y41.C53493b;
import z41.C53736a;

/* renamed from: c51.b */
public class C39894b implements C88931f {

    /* renamed from: a */
    public final /* synthetic */ Context f106961a;

    /* renamed from: b */
    public final /* synthetic */ Intent f106962b;

    /* renamed from: c */
    public final /* synthetic */ C39890a.C39893c f106963c;

    public C39894b(Context context, Intent intent, C39890a.C39893c cVar) {
        this.f106961a = context;
        this.f106962b = intent;
        this.f106963c = cVar;
    }

    /* renamed from: a */
    public void mo62503a(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.DownloadAppUtil", "onRequestPermissionsResult, resultCode = %d", Integer.valueOf(i2));
        if (i2 == -1) {
            try {
                Context context = this.f106961a;
                Intent intent2 = this.f106962b;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/downloader/util/DownloadAppUtil$2", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/downloader/util/DownloadAppUtil$2", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.DownloadAppUtil", e, "install app failed! %s", this.f106962b);
            }
            C39890a.C39893c cVar = this.f106963c;
            if (cVar != null) {
                C53736a aVar2 = ((C39890a.C39891a) cVar).f106957a;
                C53493b bVar = new C53493b();
                bVar.mo74165a(aVar2);
                C53491a.m60013c(23, bVar);
                ((C39890a.C39891a) this.f106963c).mo62502a(true);
                return;
            }
            return;
        }
        Context context2 = this.f106961a;
        Intent intent3 = this.f106962b;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(intent3);
        Context context3 = context2;
        C117292a.m165358d(context3, aVar3.mo10232b(), "com/tencent/mm/plugin/downloader/util/DownloadAppUtil$2", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((Intent) aVar3.mo10231a(0));
        C117292a.m165359e(context3, "com/tencent/mm/plugin/downloader/util/DownloadAppUtil$2", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        Log.m105920e("MicroMsg.DownloadAppUtil", "no get!!!");
        C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.h9q, 1).show();
        C39890a.C39893c cVar2 = this.f106963c;
        if (cVar2 != null) {
            C53736a aVar4 = ((C39890a.C39891a) cVar2).f106957a;
            C53493b bVar2 = new C53493b();
            bVar2.mo74165a(aVar4);
            C53491a.m60013c(22, bVar2);
            ((C39890a.C39891a) this.f106963c).mo62502a(false);
        }
    }
}
