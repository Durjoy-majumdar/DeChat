package k12;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: k12.a */
public abstract class C60939a implements C11385n {

    /* renamed from: d */
    public C60940a f173570d;

    /* renamed from: e */
    public C108828c f173571e;

    /* renamed from: k12.a$a */
    public interface C60940a {
        /* renamed from: a */
        void mo85904a(int i, Object obj, int i2, int i3);

        /* renamed from: b */
        void mo85905b(int i, Object obj, int i2, int i3);
    }

    /* renamed from: c */
    public void mo85896c() {
        for (int p : mo85897d()) {
            C97625j3.m125815e().mo123470p(p, this);
        }
        this.f173570d = null;
        mo85900g();
    }

    /* renamed from: d */
    public abstract int[] mo85897d();

    /* renamed from: e */
    public abstract int mo85898e();

    /* renamed from: f */
    public void mo85899f() {
        for (int a : mo85897d()) {
            C97625j3.m125815e().mo123455a(a, this);
        }
        mo85901h();
    }

    /* renamed from: g */
    public abstract void mo85900g();

    /* renamed from: h */
    public abstract void mo85901h();

    /* renamed from: i */
    public abstract void mo85902i(C108828c cVar);

    /* renamed from: j */
    public void mo85903j(C108828c cVar) {
        Log.m105919d("MicroMsg.BaseIPCallService", "start service, type: %d", Integer.valueOf(mo85898e()));
        this.f173571e = cVar;
        mo85902i(cVar);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105919d("MicroMsg.BaseIPCallService", "onSceneEnd, errType: %d, errCode: %d, scene.getType: %d, serviceType: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(yVar.getType()), Integer.valueOf(mo85898e()));
        if (i == 0 && i2 == 0) {
            C60940a aVar = this.f173570d;
            if (aVar != null) {
                aVar.mo85905b(mo85898e(), yVar, i, i2);
                return;
            }
            return;
        }
        C60940a aVar2 = this.f173570d;
        if (aVar2 != null) {
            aVar2.mo85904a(mo85898e(), yVar, i, i2);
        }
    }
}
