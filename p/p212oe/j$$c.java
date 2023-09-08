package p212oe;

import com.tencent.p014mm.app.C114668z;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: oe.j$$c */
public class j$$c implements C114668z {
    public void onAppBackground(String str) {
        AtomicBoolean atomicBoolean = C117750b.f352145x;
        if (atomicBoolean != null && !atomicBoolean.get()) {
            C117762j.m166098a(false, str);
        }
    }

    public void onAppForeground(String str) {
        AtomicBoolean atomicBoolean = C117750b.f352145x;
        if (atomicBoolean != null && !atomicBoolean.get()) {
            C117762j.m166098a(true, str);
        }
    }
}
