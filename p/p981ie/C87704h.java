package p981ie;

import android.os.Looper;
import android.os.Process;

/* renamed from: ie.h */
public class C87704h {
    /* renamed from: a */
    public String mo122129a(int i) {
        return i == Process.myTid() ? mo122130b() : i == Process.myPid() ? C117159b.m165222w(Looper.getMainLooper().getThread().getStackTrace(), false) : "";
    }

    /* renamed from: b */
    public String mo122130b() {
        return C117159b.m165222w(new Throwable().getStackTrace(), false);
    }
}
