package hv0;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.LinkedList;

/* renamed from: hv0.b */
public class C98540b {

    /* renamed from: a */
    public LinkedList<C98541a> f288962a = new LinkedList<>();

    /* renamed from: b */
    public MMHandler f288963b = new MMHandler(Looper.getMainLooper());

    /* renamed from: hv0.b$a */
    public class C98541a {

        /* renamed from: a */
        public int f288964a;

        /* renamed from: b */
        public Object f288965b;

        public C98541a(C98540b bVar, int i, Object obj) {
            this.f288964a = i;
            this.f288965b = obj;
        }
    }
}
