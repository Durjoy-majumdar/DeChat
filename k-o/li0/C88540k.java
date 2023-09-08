package li0;

import android.os.Looper;
import android.text.TextUtils;

/* renamed from: li0.k */
public abstract class C88540k extends C88541l {

    /* renamed from: d */
    public final String[] f255744d = {"invokeEnterMethods", "invokeExitMethods", "handleMessage:", "quit"};

    /* renamed from: e */
    public boolean f255745e = false;

    public C88540k(String str, Looper looper) {
        super(str, looper);
        super.setDbg(true);
    }

    public void log(String str) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            String[] strArr = this.f255744d;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (str.startsWith(strArr[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                logi(str);
            } else {
                logv(str);
            }
            if (str.startsWith("handleMessage: E")) {
                this.f255745e = true;
            }
            if (str.startsWith("handleMessage: X")) {
                this.f255745e = false;
            }
        }
    }
}
