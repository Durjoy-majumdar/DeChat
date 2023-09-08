package qg3;

import com.tencent.p014mm.plugin.expansions.C85178q;
import com.tencent.p014mm.sdk.crash.ICrashReporter;

/* renamed from: qg3.a */
public class C89645a implements ICrashReporter.ICrashExpansionDelegate {
    public C89645a(C89646b bVar) {
    }

    public String getLastObbErrorInfo() {
        return C85178q.m105039c();
    }

    public String getObbInfo() {
        byte[] bArr = C85178q.f248171a;
        return null;
    }

    public boolean isInstalled(String str) {
        byte[] bArr = C85178q.f248171a;
        return true;
    }

    public boolean needObbRes() {
        byte[] bArr = C85178q.f248171a;
        return false;
    }
}
