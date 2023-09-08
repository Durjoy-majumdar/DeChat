package p546ha;

import android.content.res.Configuration;
import com.tencent.kinda.framework.WxCrossServices;
import com.tencent.kinda.framework.boot.KindaApp;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.entry.ApplicationLike;
import f40.C86709a0;
import g40.C87133d;
import zt3.C119157j;

/* renamed from: ha.c */
public class C76147c implements C87133d {

    /* renamed from: ha.c$a */
    public class C76148a implements Runnable {
        public C76148a(C76147c cVar) {
        }

        public void run() {
            try {
                if (C86709a0.m107531m().mo58407a().mo71804b() && WxCrossServices.isKindaEnabled()) {
                    ITransmitKvData create = ITransmitKvData.create();
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(AppForegroundDelegate.INSTANCE.f343454n ? 1 : 0);
                    create.putString("foreground", sb.toString());
                    create.putString("name", "lowMemory");
                    KindaApp.appKinda().applicationReceiveMemoryWarning(create);
                }
            } catch (Exception | UnsatisfiedLinkError e) {
                Log.printErrStackTrace("MicroMsg.KindaAppStatusCallback", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: ha.c$b */
    public class C76149b implements Runnable {
        public C76149b(C76147c cVar) {
        }

        public void run() {
            try {
                if (C86709a0.m107531m().mo58407a().mo71804b() && WxCrossServices.isKindaEnabled()) {
                    ITransmitKvData create = ITransmitKvData.create();
                    create.putString("foreground", "" + AppForegroundDelegate.INSTANCE.f343454n);
                    create.putString("emulator", "1");
                    KindaApp.appKinda().applicationWillTerminate(create);
                }
            } catch (Exception | UnsatisfiedLinkError e) {
                Log.printErrStackTrace("MicroMsg.KindaAppStatusCallback", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: gV */
    public void mo62227gV(ApplicationLike applicationLike, int i) {
    }

    /* renamed from: kY */
    public void mo62228kY(ApplicationLike applicationLike) {
        ((C119157j) C119157j.f356862d).mo183875f(new C76148a(this));
    }

    public void qs0(ApplicationLike applicationLike, Configuration configuration) {
    }

    /* renamed from: zA */
    public void mo62230zA(ApplicationLike applicationLike) {
        ((C119157j) C119157j.f356862d).mo183875f(new C76149b(this));
    }
}
