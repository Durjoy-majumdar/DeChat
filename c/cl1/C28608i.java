package cl1;

import android.util.Base64;
import bl1.C28333v;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import pe3.C89349b;
import rx3.C13598b0;

/* renamed from: cl1.i */
public final class C28608i extends C87413o implements C32226l<ConcurrentHashMap<String, C28333v>, C13598b0> {

    /* renamed from: d */
    public static final C28608i f78500d = new C28608i();

    public C28608i() {
        super(1);
    }

    public Object invoke(Object obj) {
        String str;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
        C87412m.m108594g(concurrentHashMap, "$this$safeSetValue");
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            ((C28333v) entry.getValue()).f77956a = false;
            StringBuilder sb = new StringBuilder();
            sb.append("dismiss reddot of ");
            sb.append((String) entry.getKey());
            sb.append(", lastBuffer:");
            C89349b bVar = ((C28333v) entry.getValue()).f77957b;
            if (bVar != null) {
                try {
                    str = Base64.encodeToString(bVar.mo123703f(), 2);
                    C87412m.m108593f(str, "encodeToString(this.toByteArray(), Base64.NO_WRAP)");
                } catch (Throwable unused) {
                    Log.m105924i("Finder", "ByteString encode failed.");
                    str = "";
                }
            } else {
                str = null;
            }
            sb.append(str);
            String sb4 = sb.toString();
            C87412m.m108594g(sb4, "str");
            Log.m105924i("Finder.LiveBoxSlice", "redDotFlowLog " + sb4);
        }
        return C13598b0.f38549a;
    }
}
