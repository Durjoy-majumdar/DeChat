package dn2;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hn2.C8618h;
import j20.C117292a;
import java.util.Arrays;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: dn2.f */
public final class C7388f extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7373a f25527d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7388f(C7373a aVar) {
        super(1);
        this.f25527d = aVar;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        C8618h hVar = C8618h.f27727a;
        MMActivity mMActivity = this.f25527d.f25505a;
        hVar.getClass();
        C87412m.m108594g(mMActivity, "context");
        Uri uriForFile = FileProviderHelper.getUriForFile(mMActivity, new C86009m1(str));
        if (uriForFile == null) {
            Log.m105920e("MicroMsg.QQShareUtil", "shareToQQ() called " + str);
        } else {
            mMActivity.grantUriPermission("com.tencent.mobileqq", uriForFile, 1);
            String uri = uriForFile.toString();
            C87412m.m108593f(uri, "outputFileUri.toString()");
            String format = String.format("mqqapi://share/to_fri?file_type=news&share_id=1103188687&file_uri=%s&app_name=5b6u5L+h&req_type=NQ==&cflag=MQ==", Arrays.copyOf(new Object[]{hVar.mo9488a(uri, 2)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(format));
            intent.putExtra("pkg_name", "com.tencent.mm");
            intent.setFlags(268435456);
            if (Util.isIntentAvailable(mMActivity, intent, true)) {
                try {
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(mMActivity, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/utils/QQShareUtil", "shareToQZone", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mMActivity.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(mMActivity, "com/tencent/mm/plugin/setting/ui/utils/QQShareUtil", "shareToQZone", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (ActivityNotFoundException e) {
                    Log.printErrStackTrace("MicroMsg.QQShareUtil", e, "", new Object[0]);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
