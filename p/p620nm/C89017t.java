package p620nm;

import android.content.Context;
import com.tencent.mars.Mars;
import com.tencent.mars.app.AppLogic;
import com.tencent.mars.p468mm.AppCallBack;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.report.service.C57277s;
import com.tencent.p014mm.plugin.zero.C30644o;
import com.tencent.p014mm.plugin.zero.C85597u;
import com.tencent.p014mm.sdk.CommLibFileName;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import kj2.C117407d;
import lj2.C88544a;
import p206nj.C88957l;

@C86522b(dependencies = {C85597u.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: nm.t */
public class C89017t extends C86301e implements C30644o {
    /* renamed from: b */
    public void mo57522b(int i) {
        C117407d.INSTANCE.mo160125b(i);
    }

    public void onCreate(Context context) {
        Class<C89017t> cls = C89017t.class;
        super.onCreate(context);
        AppLogic.setCallBack(new AppCallBack(MMApplicationContext.getContext()));
        SmcLogic.setCallBack(new C57277s());
        C57277s.f164059a = C80610p1.f235824f;
        C88957l.m111079o(Mars.libMarsBase, cls.getClassLoader());
        C88957l.m111079o(CommLibFileName.quic, cls.getClassLoader());
        C88957l.m111079o(Mars.libMarsMM, cls.getClassLoader());
        try {
            Mars.onCreate();
            if (MMApplicationContext.isMainProcess()) {
                SmcLogic.onCreate();
            }
        } catch (Throwable unused) {
            Mars.onCreate();
            if (MMApplicationContext.isMainProcess()) {
                SmcLogic.onCreate();
            }
        }
        SmcLogic.SetDebugFlag(C88544a.f255754a);
        SmcLogic.sInitiated = true;
        Object[] objArr = new Object[2];
        int i = -1;
        objArr[0] = Integer.valueOf(cls.getClassLoader() == null ? -1 : cls.getClassLoader().hashCode());
        if (Thread.currentThread().getContextClassLoader() != null) {
            i = Thread.currentThread().getContextClassLoader().hashCode();
        }
        objArr[1] = Integer.valueOf(i);
        Log.m105925i("MicroMsg.MarsOnSplashService", "SmcLogic, class loader %s, %s", objArr);
    }
}
