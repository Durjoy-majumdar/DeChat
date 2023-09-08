package p577jr;

import android.os.Handler;
import cj1.C28596x5;
import cj1.C28597y5;
import com.tencent.p014mm.app.C114661d0;
import f40.C86709a0;
import zt3.C119157j;

/* renamed from: jr.f */
public final class C33638f implements C114661d0 {
    public Handler getHandler() {
        return null;
    }

    public void onAppBackground(String str) {
        if (C86709a0.m107522a()) {
            ((C119157j) C119157j.f356862d).mo183876g(C28596x5.f78484d, "Finder.LiveExceptionMonitor");
        }
    }

    public void onAppForeground(String str) {
        if (C86709a0.m107522a()) {
            ((C119157j) C119157j.f356862d).mo183876g(C28597y5.f78485d, "Finder.LiveExceptionMonitor");
        }
    }
}
