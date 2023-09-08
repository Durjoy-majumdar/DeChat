package v42;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d52.C45266c;
import e42.C7594e;
import java.util.HashMap;
import js0.C46574u;
import p224ra.C89909e;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: v42.b */
public final class C52761b<T extends C7594e> extends C45266c<T> {
    /* renamed from: p */
    public HashMap<String, Object> mo70803p() {
        String a = C46574u.m51897a(MMApplicationContext.getContext(), "", (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class));
        Log.m105924i("MBBrandServiceJsApiGetSystemInfo", "userAgent:" + a);
        return C90364q0.m113146e(new C13604l("userAgent", a));
    }
}
