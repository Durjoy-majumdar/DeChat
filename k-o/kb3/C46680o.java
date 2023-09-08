package kb3;

import android.content.SharedPreferences;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wepkg.event.C44477b;
import com.tencent.p014mm.plugin.wepkg.model.C44493e;
import com.tencent.p014mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.p014mm.plugin.wepkg.utils.C44532a;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import k00.C46633d;

/* renamed from: kb3.o */
public class C46680o implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C46677m f125671d;

    /* renamed from: kb3.o$a */
    public class C46681a implements Runnable {
        public C46681a() {
        }

        public void run() {
            try {
                Log.m105924i("MicroMsg.Wepkg.WePkgPlugin", "load url from net");
                C46677m mVar = C46680o.this.f125671d;
                if (!mVar.f125651d) {
                    mVar.f125664q = null;
                }
                boolean z = !Util.isNullOrNil(mVar.f125664q);
                C46677m mVar2 = C46680o.this.f125671d;
                mVar2.getClass();
                Log.m105924i("MicroMsg.Wepkg.WePkgPlugin", "reloadPage");
                int i = 0;
                if (mVar2.f125651d) {
                    mVar2.f125651d = false;
                    ((HashMap) C46676l.f125644a).remove(mVar2.f125650c);
                }
                C44477b bVar = mVar2.f125659l;
                if (bVar != null) {
                    bVar.mo65877c();
                }
                C46680o.this.f125671d.getClass();
                SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("we_pkg_sp", 4);
                if (sharedPreferences != null) {
                    i = sharedPreferences.getInt("white_screen_times", 0);
                }
                if (i > 1) {
                    C46677m mVar3 = C46680o.this.f125671d;
                    WepkgVersion wepkgVersion = mVar3.f125653f;
                    if (wepkgVersion != null) {
                        if (z) {
                            C44532a.m48912c("whiteScreen", mVar3.f125648a, wepkgVersion.f120651d, wepkgVersion.f120653f, 1, 0, (String) null);
                        } else {
                            C44532a.m48912c("whiteScreen", mVar3.f125648a, wepkgVersion.f120651d, wepkgVersion.f120653f, -1, 0, (String) null);
                        }
                    }
                    C115669n.INSTANCE.idkeyStat(859, 13, 1, false);
                    String str = C46680o.this.f125671d.f125648a;
                    Object obj = C44536d.f120770a;
                    String a = C46633d.m51936a(str);
                    ((HashMap) C46676l.f125644a).remove(a);
                    C44493e.m48856c().mo69277e(a, 1, 2);
                    C46680o.this.f125671d.getClass();
                    SharedPreferences sharedPreferences2 = MMApplicationContext.getContext().getSharedPreferences("we_pkg_sp", 4);
                    if (sharedPreferences2 != null) {
                        Log.m105924i("MicroMsg.Wepkg.WePkgPlugin", "disableWePkg");
                        sharedPreferences2.edit().putBoolean("disable_we_pkg", true).commit();
                    }
                    C46680o.this.f125671d.mo71923b();
                    return;
                }
                C46677m.m51984a(C46680o.this.f125671d, i + 1);
            } catch (Exception unused) {
            }
        }
    }

    public C46680o(C46677m mVar) {
        this.f125671d = mVar;
    }

    public boolean onTimerExpired() {
        C46677m mVar = this.f125671d;
        if (!mVar.f125658k || mVar.f125657j) {
            C46677m.m51984a(mVar, 0);
        } else {
            Log.m105924i("MicroMsg.Wepkg.WePkgPlugin", "white screen");
            MMHandlerThread.postToMainThread(new C46681a());
        }
        return false;
    }
}
