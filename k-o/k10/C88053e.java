package k10;

import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.StandardMessageCodec;

/* renamed from: k10.e */
public class C88053e {

    /* renamed from: k10.e$a */
    public interface C88054a {
        /* renamed from: a */
        void mo121200a(String str, String str2);

        /* renamed from: b */
        void mo121201b(String str);

        /* renamed from: c */
        void mo121202c(String str, String str2, Double d, Double d2);

        /* renamed from: d */
        void mo121203d(String str);

        /* renamed from: e */
        void mo121204e(String str);

        /* renamed from: f */
        void mo121205f(String str, String str2, String str3);

        /* renamed from: g */
        void mo121206g(String str, String str2);

        /* renamed from: h */
        void mo121207h(String str, String str2, String str3, String str4, C88056c<Double> cVar);

        /* renamed from: i */
        void mo121208i(String str, String str2);

        /* renamed from: j */
        void mo121209j(String str, String str2);

        /* renamed from: k */
        void mo121210k(String str);

        /* renamed from: l */
        String mo121211l(String str, String str2, Long l);

        /* renamed from: m */
        String mo121212m(String str, String str2, String str3);

        /* renamed from: o */
        void mo121214o(String str, String str2, Double d, Double d2);
    }

    /* renamed from: k10.e$b */
    public static class C88055b extends StandardMessageCodec {

        /* renamed from: a */
        public static final C88055b f254692a = new C88055b();
    }

    /* renamed from: k10.e$c */
    public interface C88056c<T> {
        void success(T t);
    }

    /* renamed from: a */
    public static Map m109622a(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put(StateEvent.Name.MESSAGE, th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
