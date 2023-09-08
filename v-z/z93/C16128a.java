package z93;

import com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6583y0;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import java.util.List;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C64197v;
import t83.C13853i;
import w83.C15053a;

/* renamed from: z93.a */
public final class C16128a {

    /* renamed from: a */
    public static final C13601g f43314a = C36568h.m40985a(C16129a.f43315d);

    /* renamed from: z93.a$a */
    public static final class C16129a extends C87413o implements C32224a<HashMap<String, C15053a>> {

        /* renamed from: d */
        public static final C16129a f43315d = new C16129a();

        public C16129a() {
            super(0);
        }

        public Object invoke() {
            int i = C13853i.f38997a;
            List<C15053a> f = C64197v.m75537f(C16131d.f43319d, C16130b.f43316d, C6583y0.f23822d);
            HashMap hashMap = new HashMap();
            for (C15053a aVar : f) {
                hashMap.put(aVar.mo7288c(), aVar);
            }
            return hashMap;
        }
    }
}
