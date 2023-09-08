package sf0;

import android.content.Context;
import com.tencent.p014mm.platformtools.ExportFileUtil;
import j20.C117292a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import k20.C9556a;

/* renamed from: sf0.n */
public class C101602n implements Callable<String> {

    /* renamed from: d */
    public final /* synthetic */ Context f297438d;

    /* renamed from: e */
    public final /* synthetic */ String f297439e;

    public C101602n(Context context, String str) {
        this.f297438d = context;
        this.f297439e = str;
    }

    public Object call() {
        Context context = this.f297438d;
        String str = this.f297439e;
        Executor executor = ExportFileUtil.f267555a;
        C9556a aVar = new C9556a();
        aVar.mo10233c(str);
        aVar.mo10233c(context);
        return (String) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/mm/platformtools/ExportFileUtil", "exportToPublicDownloadDir", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "com/tencent/mm/platformtools/ExportFileUtil", "exportToPublicDownloadDirImpl", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;");
    }
}
