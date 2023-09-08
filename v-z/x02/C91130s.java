package x02;

import a70.C112760b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import b12.C79645d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import java.io.File;
import java.util.Map;
import k20.C9556a;
import v02.C90736c;

/* renamed from: x02.s */
public class C91130s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String[] f261351d;

    public C91130s(C91133u uVar, String[] strArr) {
        this.f261351d = strArr;
    }

    public void run() {
        int i;
        String str = C112760b.m154195C() + "/Download/2017-07-28_19-43-39.apk";
        String str2 = C112760b.m154195C() + "/Download/39-50-diff.apk";
        String str3 = C112760b.m154195C() + "/Download/new_50.apk";
        String[] strArr = this.f261351d;
        if (strArr.length >= 3 && !Util.isNullOrNil(strArr[2])) {
            str = this.f261351d[2];
        }
        String[] strArr2 = this.f261351d;
        if (strArr2.length >= 4 && !Util.isNullOrNil(strArr2[3])) {
            str2 = this.f261351d[3];
        }
        String[] strArr3 = this.f261351d;
        if (strArr3.length >= 5 && !Util.isNullOrNil(strArr3[4])) {
            str3 = this.f261351d[4];
        }
        String[] strArr4 = this.f261351d;
        String str4 = (strArr4.length < 6 || Util.isNullOrNil(strArr4[5])) ? "ab099f75f740be5d88e178d662a36779" : this.f261351d[5];
        if (!C86013q1.m106450k(str3)) {
            long currentTimeMillis = System.currentTimeMillis();
            i = C90736c.m113791a(str, str2, str3, str4);
            Log.m105925i("MicroMsg.Tinker.TinkerBootsCommand", "merge apk use :%d retCode：%d", Long.valueOf((System.currentTimeMillis() - currentTimeMillis) / 1000), Integer.valueOf(i));
        } else {
            i = 0;
        }
        if (i == 0) {
            Log.m105924i("MicroMsg.Tinker.TinkerBootsCommand", "show dialog for install");
            Log.m105925i("MicroMsg.Tinker.TinkerBootsCommand", "New Apk md5:%s", C86013q1.m106456q(str3));
            Context context = MMApplicationContext.getContext();
            Map<String, String> map = C79645d.f233530a;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setDataAndType(Uri.fromFile(new File(str3)), "application/vnd.android.package-archive");
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/hp/util/UpdateUtil", "install", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/hp/util/UpdateUtil", "install", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            Log.m105924i("MicroMsg.Tinker.TinkerBootsCommand", "md5 is equal.");
        } else {
            Log.m105924i("MicroMsg.Tinker.TinkerBootsCommand", "merge apk failed.");
        }
        C79645d.m96745u();
    }
}
