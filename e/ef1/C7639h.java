package ef1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;

/* renamed from: ef1.h */
public final class C7639h extends C7638e<Object> {

    /* renamed from: b */
    public long f25943b = -1;

    /* renamed from: c */
    public final Runnable f25944c = new C7640a(this);

    /* renamed from: d */
    public BaseFinderFeed f25945d;

    /* renamed from: ef1.h$a */
    public static final class C7640a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C7639h f25946d;

        public C7640a(C7639h hVar) {
            this.f25946d = hVar;
        }

        public final void run() {
            C7639h hVar = this.f25946d;
            BaseFinderFeed baseFinderFeed = hVar.f25945d;
            if (baseFinderFeed != null) {
                C7641j jVar = new C7641j(3);
                jVar.f25948c = baseFinderFeed;
                jVar.f25950e = hVar.f25943b;
                jVar.f25949d = baseFinderFeed.getItemId();
                hVar.f25943b = baseFinderFeed.getItemId();
                hVar.mo8766a(jVar);
            }
        }
    }

    public C7639h(C58553c cVar) {
        super(cVar);
    }
}
