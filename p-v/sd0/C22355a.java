package sd0;

import be0.C16783a;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.ipcinvoker.wx_extension.IPCRunCgi;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.io.IOException;
import java.util.WeakHashMap;
import jp3.C9486a;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C49335eu3;
import u14.C52419b;

/* renamed from: sd0.a */
public final class C22355a implements C16783a.C16784a {

    /* renamed from: a */
    public static final C22355a f63371a = new C22355a();

    /* renamed from: b */
    public static final WeakHashMap<C16783a, C117747y> f63372b = new WeakHashMap<>();

    /* renamed from: sd0.a$a */
    public static final class C22356a implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C16783a.C16786c f63373a;

        /* renamed from: b */
        public final /* synthetic */ C16783a.C16785b f63374b;

        /* renamed from: c */
        public final /* synthetic */ C16783a f63375c;

        public C22356a(C16783a.C16786c cVar, C16783a.C16785b bVar, C16783a aVar) {
            this.f63373a = cVar;
            this.f63374b = bVar;
            this.f63375c = aVar;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            C22355a aVar = C22355a.f63371a;
            C47465a aVar2 = cVar.f127056b.f127083a;
            boolean z = false;
            if (aVar2 != null && (!(aVar2 instanceof C49335eu3) || ((C49335eu3) aVar2).getBaseResponse() != null)) {
                z = true;
            }
            if (z) {
                try {
                    this.f63373a.mo17814a().parseFrom(cVar.f127056b.f127083a.toByteArray());
                } catch (IOException e) {
                    Log.m105920e("MicroMsg.MMCompatNetworkDispatcher", "parseFrom mmrr uri=" + this.f63373a.getUri() + ", e=" + e);
                    C16783a.C16785b bVar = this.f63374b;
                    if (bVar != null) {
                        bVar.mo17813a(5, i2, str, this.f63375c);
                        return;
                    }
                    return;
                } catch (C52419b e2) {
                    Log.m105920e("MicroMsg.MMCompatNetworkDispatcher", "parseFrom mmrr uri=" + this.f63373a.getUri() + ", e=" + e2);
                    C16783a.C16785b bVar2 = this.f63374b;
                    if (bVar2 != null) {
                        bVar2.mo17813a(i, i2, str, this.f63375c);
                        return;
                    }
                    return;
                }
            }
            C16783a.C16785b bVar3 = this.f63374b;
            if (bVar3 != null) {
                bVar3.mo17813a(i, i2, str, this.f63375c);
            }
            WeakHashMap<C16783a, C117747y> weakHashMap = C22355a.f63372b;
            C16783a aVar3 = this.f63375c;
            synchronized (weakHashMap) {
                weakHashMap.remove(aVar3);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: a */
    public int mo17812a(C16783a.C16786c cVar, C16783a.C16785b bVar, C16783a aVar) {
        C87412m.m108594g(cVar, "rr");
        C87412m.m108594g(aVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = cVar.mo17815b();
        bVar2.f127067b = cVar.mo17814a();
        bVar2.f127068c = cVar.getUri();
        bVar2.f127069d = cVar.getType();
        C117747y b = IPCRunCgi.m98795b(bVar2.mo72403a(), (C40324j.C40325b) null, new C22356a(cVar, bVar, aVar), (C9487b<? extends C9486a>) null);
        if (b == null) {
            return 0;
        }
        WeakHashMap<C16783a, C117747y> weakHashMap = f63372b;
        synchronized (weakHashMap) {
            C117747y put = weakHashMap.put(aVar, b);
        }
        return 0;
    }
}
