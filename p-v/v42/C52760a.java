package v42;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d52.C45265b;
import e42.C7594e;
import java.util.HashMap;
import js0.C46574u;
import p224ra.C89909e;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: v42.a */
public final class C52760a<T extends C7594e> extends C45265b<T> {
    /* renamed from: r */
    public HashMap<String, Object> mo70802r() {
        String a = C46574u.m51897a(MMApplicationContext.getContext(), "", (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class));
        Log.m105924i("MBBrandServiceJsApiGetSystemInfoAsync", "userAgent:" + a);
        return C90364q0.m113146e(new C13604l("userAgent", a));
    }
}
