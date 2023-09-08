package bi0;

import com.tencent.p014mm.wexnet.SessionKeeper;
import java.util.LinkedHashMap;
import java.util.Map;
import p224ra.C12964b;

/* renamed from: bi0.a */
public final class C79706a implements C12964b {

    /* renamed from: d */
    public int f233617d;

    /* renamed from: e */
    public Map<Integer, SessionKeeper> f233618e = new LinkedHashMap();

    /* renamed from: a */
    public final synchronized void mo109819a() {
        for (SessionKeeper close : ((LinkedHashMap) this.f233618e).values()) {
            close.close();
        }
        ((LinkedHashMap) this.f233618e).clear();
    }
}
