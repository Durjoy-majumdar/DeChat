package p198lt;

import android.os.Handler;
import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.ipcinvoker.wx_extension.C1265q;
import com.tencent.p014mm.ipcinvoker.wx_extension.C1266r;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import zt3.C119157j;

/* renamed from: lt.b */
public class C10651b implements C114661d0 {
    public Handler getHandler() {
        return null;
    }

    public void onAppBackground(String str) {
        int i = C1266r.f10319e;
        if (MMApplicationContext.isMainProcess()) {
            ((C119157j) C119157j.f356862d).mo183875f(new C1265q());
        }
    }

    public void onAppForeground(String str) {
    }
}
