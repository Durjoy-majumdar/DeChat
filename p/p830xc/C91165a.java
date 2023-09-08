package p830xc;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import fl0.C86918c;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: xc.a */
public interface C91165a {

    /* renamed from: xc.a$a */
    public interface C53318a {
        /* renamed from: a */
        void mo18009a(int i);

        /* renamed from: c */
        void mo18010c();

        void onDestroy();
    }

    /* renamed from: a */
    void mo62538a(C53318a aVar);

    /* renamed from: b */
    JSONObject mo62539b();

    /* renamed from: c */
    void mo62540c(C53318a aVar);

    /* renamed from: d */
    boolean mo62541d();

    /* renamed from: e */
    boolean mo62542e();

    /* renamed from: f */
    String mo62543f();

    /* renamed from: g */
    C82381f mo62544g();

    String getAppId();

    Context getContext();

    /* renamed from: h */
    String mo62547h(C86918c cVar, Map<String, ? extends Object> map);

    /* renamed from: i */
    void mo62548i();

    @Deprecated
    /* renamed from: j */
    String mo62549j(String str);

    @Deprecated
    /* renamed from: k */
    String mo62550k(String str, Map<String, ? extends Object> map);

    /* renamed from: l */
    String mo62551l(C86918c cVar);

    /* renamed from: m */
    String mo62552m(String str, C86918c cVar);
}
