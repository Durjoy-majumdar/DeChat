package ri0;

import com.tencent.p014mm.sdk.platformtools.SimpleObjectPool;
import si0.C110791a;

/* renamed from: ri0.a */
public abstract class C110570a {

    /* renamed from: a */
    public SimpleObjectPool<C110791a> f330726a = new SimpleObjectPool<>(100);

    /* renamed from: a */
    public C110791a mo162065a() {
        C110791a acquire = this.f330726a.acquire();
        return acquire == null ? mo162066b() : acquire;
    }

    /* renamed from: b */
    public abstract C110791a mo162066b();
}
