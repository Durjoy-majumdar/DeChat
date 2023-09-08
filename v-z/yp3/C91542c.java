package yp3;

import android.os.Handler;
import android.os.Looper;
import fy3.C32224a;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import rx3.C13598b0;

/* renamed from: yp3.c */
public final class C91542c {
    /* renamed from: a */
    public static final String m114880a(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(byteArrayOutputStream);
            th.printStackTrace(printStream);
            String byteArrayOutputStream2 = byteArrayOutputStream.toString();
            printStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream2;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static final void m114881b(C32224a<C13598b0> aVar) {
        C87412m.m108595h(aVar, "block");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        C87412m.m108590c(mainLooper, "Looper.getMainLooper()");
        if (C87412m.m108589b(currentThread, mainLooper.getThread())) {
            aVar.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new C91541b(aVar));
        }
    }
}
