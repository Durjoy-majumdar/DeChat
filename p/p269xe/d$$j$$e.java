package p269xe;

import android.os.Process;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.xweb.file.XVFSFile;
import p1177ce.C113287a;
import p269xe.C91179e;
import p981ie.C117159b;
import p981ie.C117178r;

/* renamed from: xe.d$$j$$e */
public final /* synthetic */ class d$$j$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C113287a f355623d;

    /* renamed from: e */
    public final /* synthetic */ C114490k0.C114491a.C114492a f355624e;

    public /* synthetic */ d$$j$$e(C113287a aVar, C114490k0.C114491a.C114492a aVar2) {
        this.f355623d = aVar;
        this.f355624e = aVar2;
    }

    public final void run() {
        String str;
        C113287a aVar = this.f355623d;
        C114490k0.C114491a.C114492a aVar2 = this.f355624e;
        ThreadLocal<byte[]> threadLocal = C117178r.f351047a;
        C117178r.C117182d c = C117178r.m165260c(Process.myPid(), Process.myTid());
        String a = C117159b.m165200a("/proc/" + Process.myPid() + "/task/" + Process.myTid() + "/stat");
        if (c == null) {
            str = "null";
        } else {
            str = c.mo181109a() + XVFSFile.PATH_SEPARATOR + a;
        }
        C91179e.C91181b.C91182a.m114440a(aVar, aVar2, str);
    }
}
