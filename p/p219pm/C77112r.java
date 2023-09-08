package p219pm;

import android.content.res.Configuration;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C81039e;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.entry.ApplicationLike;
import eb0.C97625j3;
import g40.C87133d;
import j20.C117292a;
import java.util.Locale;
import k20.C60958c;
import k20.C9556a;
import ne3.C47239a;

/* renamed from: pm.r */
public class C77112r implements C87133d {

    /* renamed from: d */
    public static Locale f225221d;

    /* renamed from: gV */
    public void mo62227gV(ApplicationLike applicationLike, int i) {
    }

    /* renamed from: kY */
    public void mo62228kY(ApplicationLike applicationLike) {
    }

    public void qs0(ApplicationLike applicationLike, Configuration configuration) {
        Locale locale;
        C81039e A3;
        if ("language_default".equals(LocaleUtil.loadApplicationLanguageSettings(MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), MMApplicationContext.getContext()))) {
            Log.m105925i("WorkerProfileAppStatusCallback", "config locale %s", LocaleUtil.transLocaleToLanguage(configuration.locale));
            Locale initLanguage = MMActivity.initLanguage(applicationLike.getApplication().getBaseContext(), LocaleUtil.transLocaleToLanguage(configuration.locale));
            Log.m105925i("WorkerProfileAppStatusCallback", "onConfigurationChanged, locale = %s, n = %s", f225221d, initLanguage);
            if (initLanguage != null && (locale = f225221d) != null && !initLanguage.equals(locale)) {
                if (C97625j3.m125811a()) {
                    try {
                        C114770g gVar = C97625j3.m125815e().f256809d;
                        if (!(gVar == null || (A3 = gVar.mo55443A3()) == null)) {
                            A3.mo55422X0(new byte[0], new byte[0], new byte[0], C97625j3.m125812b().mo105881G());
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("WorkerProfileAppStatusCallback", e, "", new Object[0]);
                        Log.printErrStackTrace("WorkerProfileAppStatusCallback", e, "what the f$!k", new Object[0]);
                    }
                }
                Log.m105928w("WorkerProfileAppStatusCallback", "language changed, restart process");
                C47239a.m52540a(MMApplicationContext.getContext());
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(-1);
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/feature/app/extension/WorkerProfileAppStatusCallback", "initLanguage", "(Lcom/tencent/tinker/entry/ApplicationLike;Landroid/content/res/Configuration;)V", "java/lang/System_EXEC_", "exit", "(I)V");
                System.exit(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(obj, "com/tencent/mm/feature/app/extension/WorkerProfileAppStatusCallback", "initLanguage", "(Lcom/tencent/tinker/entry/ApplicationLike;Landroid/content/res/Configuration;)V", "java/lang/System_EXEC_", "exit", "(I)V");
            }
        }
    }

    /* renamed from: zA */
    public void mo62230zA(ApplicationLike applicationLike) {
    }
}
