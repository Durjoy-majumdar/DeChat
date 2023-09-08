package p219pm;

import android.content.res.Configuration;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.entry.ApplicationLike;
import g40.C87133d;
import j20.C117292a;
import java.util.Locale;
import k20.C60958c;
import k20.C9556a;

/* renamed from: pm.p */
public class C77111p implements C87133d {

    /* renamed from: d */
    public static Locale f225220d;

    /* renamed from: gV */
    public void mo62227gV(ApplicationLike applicationLike, int i) {
    }

    /* renamed from: kY */
    public void mo62228kY(ApplicationLike applicationLike) {
    }

    public void qs0(ApplicationLike applicationLike, Configuration configuration) {
        if (f225220d != null) {
            Locale initLanguage = MMActivity.initLanguage(applicationLike.getApplication().getBaseContext());
            Log.m105918d("ToolsProfileAppStatusCallback", "onConfigurationChanged, locale = " + f225220d.toString() + ", n = " + initLanguage.toString());
            if (!initLanguage.equals(f225220d)) {
                Log.m105928w("ToolsProfileAppStatusCallback", "language changed, restart process");
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(-1);
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/feature/app/extension/ToolsProfileAppStatusCallback", "onConfigurationChanged", "(Lcom/tencent/tinker/entry/ApplicationLike;Landroid/content/res/Configuration;)V", "java/lang/System_EXEC_", "exit", "(I)V");
                System.exit(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(obj, "com/tencent/mm/feature/app/extension/ToolsProfileAppStatusCallback", "onConfigurationChanged", "(Lcom/tencent/tinker/entry/ApplicationLike;Landroid/content/res/Configuration;)V", "java/lang/System_EXEC_", "exit", "(I)V");
            }
        }
    }

    /* renamed from: zA */
    public void mo62230zA(ApplicationLike applicationLike) {
    }
}
