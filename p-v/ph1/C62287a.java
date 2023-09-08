package ph1;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

/* renamed from: ph1.a */
public final class C62287a {

    /* renamed from: a */
    public static final C62287a f177060a = new C62287a();

    /* renamed from: b */
    public static final HashMap<Long, C62297m> f177061b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<Long, C62292g> f177062c = new HashMap<>();

    /* renamed from: a */
    public final void mo87353a(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("clearFluentList feedId: ");
        sb.append(j);
        sb.append(" exitParamsSize: ");
        HashMap<Long, C62292g> hashMap = f177062c;
        sb.append(hashMap);
        sb.append(" directorSize: ");
        HashMap<Long, C62297m> hashMap2 = f177061b;
        sb.append(hashMap2);
        Log.m105924i("FinderFluentReplaySwitchManager", sb.toString());
        hashMap2.remove(Long.valueOf(j));
        hashMap.remove(Long.valueOf(j));
    }

    /* renamed from: b */
    public final C62297m mo87354b(long j) {
        return f177061b.get(Long.valueOf(j));
    }
}
