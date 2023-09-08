package h20;

import android.os.Handler;
import com.tencent.p014mm.app.C114661d0;

/* renamed from: h20.c */
public class C32665c implements C114661d0 {

    /* renamed from: d */
    public static final boolean[] f86684d = {false};

    public Handler getHandler() {
        return null;
    }

    public void onAppBackground(String str) {
        boolean[] zArr = f86684d;
        synchronized (zArr) {
            zArr[0] = false;
        }
    }

    public void onAppForeground(String str) {
        boolean[] zArr = f86684d;
        synchronized (zArr) {
            zArr[0] = true;
        }
    }
}
