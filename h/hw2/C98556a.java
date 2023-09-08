package hw2;

import com.tencent.p014mm.plugin.story.model.sync.ContactSyncFetcher;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import zv2.C103105a;

/* renamed from: hw2.a */
public final class C98556a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C98556a f289012d = new C98556a();

    public C98556a() {
        super(0);
    }

    public Object invoke() {
        ContactSyncFetcher contactSyncFetcher = ContactSyncFetcher.f281758d;
        C103105a aVar = C103105a.f304209b;
        C103105a.C103106a aVar2 = (C103105a.C103106a) aVar.mo138761d();
        C103105a.C103106a aVar3 = (C103105a.C103106a) aVar.mo138761d();
        ContactSyncFetcher.m123593j(contactSyncFetcher);
        Log.m105924i("MicroMsg.ContactSyncFetcher", "checkContactState: user size is " + ContactSyncFetcher.f281759e.size() + ", unread " + ContactSyncFetcher.f281762h.size());
        return C13598b0.f38549a;
    }
}
