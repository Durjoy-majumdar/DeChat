package ck3;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import java.util.WeakHashMap;

/* renamed from: ck3.h */
public class C67399h extends MMHandler {

    /* renamed from: b */
    public static final boolean f193315b = C67392c.f193302b;

    /* renamed from: a */
    public final WeakHashMap<Message, C28604a> f193316a;

    /* renamed from: ck3.h$a */
    public static final class C28604a {

        /* renamed from: a */
        public final boolean f78493a;

        /* renamed from: b */
        public final boolean f78494b;

        /* renamed from: c */
        public final long f78495c;

        /* renamed from: d */
        public final boolean f78496d;

        public C28604a(boolean z, boolean z2, long j, boolean z3) {
            this.f78493a = z;
            this.f78494b = z2;
            this.f78495c = j;
            this.f78496d = z3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C28604a)) {
                return false;
            }
            C28604a aVar = (C28604a) obj;
            return this.f78493a == aVar.f78493a && this.f78494b == aVar.f78494b && this.f78495c == aVar.f78495c && this.f78496d == aVar.f78496d;
        }

        public int hashCode() {
            boolean z = this.f78493a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f78494b;
            if (z3) {
                z3 = true;
            }
            long j = this.f78495c;
            int i2 = (((i + (z3 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            boolean z4 = this.f78496d;
            if (!z4) {
                z2 = z4;
            }
            return i2 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "MessageInfo(isIgnoreCheck=" + this.f78493a + ", isMainThreadSend=" + this.f78494b + ", delayTimes=" + this.f78495c + ", isCallValid=" + this.f78496d + ')';
        }
    }

    static {
        C67392c cVar = C67392c.f193301a;
    }

    public C67399h() {
        this(Looper.myLooper());
    }

    public void afterDispatchMessage(Message message) {
        if (f193315b) {
            ThreadLocal<Boolean> threadLocal = C67394d.f193312a;
            C67394d.f193312a.set(Boolean.FALSE);
        }
    }

    public void beforeDispatchMessage(Message message) {
        if (f193315b) {
            if (message != null) {
                C28604a aVar = this.f193316a.get(message);
                boolean z = true;
                if (aVar == null || !aVar.f78493a) {
                    z = false;
                }
                if (z) {
                    ThreadLocal<Boolean> threadLocal = C67394d.f193312a;
                    C67394d.f193312a.set(Boolean.TRUE);
                    return;
                }
            }
            Log.m105918d("ChatCheck.ChattingMMHandler", "beforeDispatchMessage msg:" + this.f193316a.get(message));
        }
    }

    public void beforeSendMessage(Message message, long j) {
        C28604a aVar;
        if (f193315b && message != null) {
            WeakHashMap<Message, C28604a> weakHashMap = this.f193316a;
            boolean b = C87412m.m108589b(Looper.getMainLooper(), Looper.myLooper());
            long uptimeMillis = SystemClock.uptimeMillis() - j;
            if (!b) {
                aVar = new C28604a(false, b, uptimeMillis, false);
            } else {
                boolean z = C67392c.f193301a.mo91588c("beforeSendMessage").f193310a;
                aVar = new C28604a(z, true, uptimeMillis, z);
            }
            weakHashMap.put(message, aVar);
        }
    }

    public void postUI(Runnable runnable) {
        post(runnable);
    }

    public void postUIDelayed(Runnable runnable, long j) {
        postDelayed(runnable, j);
    }

    public C67399h(Looper looper) {
        super(looper);
        this.f193316a = new WeakHashMap<>();
        if (!C87412m.m108589b(Looper.getMainLooper(), looper)) {
            throw new Exception("ChattingMMHandler can only be created for mainThread");
        }
    }
}
