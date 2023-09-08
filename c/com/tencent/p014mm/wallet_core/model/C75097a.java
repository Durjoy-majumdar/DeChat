package com.tencent.p014mm.wallet_core.model;

import androidx.lifecycle.C54219z;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import ob0.C89132b;
import te3.C49335eu3;
import zt3.C119157j;

/* renamed from: com.tencent.mm.wallet_core.model.a */
public abstract class C75097a<K extends C49335eu3, P extends C89132b<K>> {

    /* renamed from: a */
    public List<C75099b<K>> f221002a = new ArrayList();

    /* renamed from: b */
    public boolean f221003b = false;

    /* renamed from: c */
    public P f221004c;

    /* renamed from: d */
    public C54219z<K> f221005d = new C54219z<>();

    /* renamed from: e */
    public C54219z<K> f221006e = new C54219z<>();

    /* renamed from: com.tencent.mm.wallet_core.model.a$a */
    public class C75098a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C75099b f221007d;

        /* renamed from: e */
        public final /* synthetic */ boolean f221008e;

        public C75098a(C75099b bVar, boolean z) {
            this.f221007d = bVar;
            this.f221008e = z;
        }

        public void run() {
            C75097a.this.mo104794e(this.f221007d, this.f221008e);
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.model.a$b */
    public interface C75099b<K> {
        /* renamed from: a */
        void mo67542a(K k);

        /* renamed from: b */
        void mo67543b(K k, int i, int i2);
    }

    /* renamed from: a */
    public abstract K mo66604a();

    /* renamed from: b */
    public abstract void mo66605b(C89132b.C89134c<K> cVar);

    /* renamed from: c */
    public void mo104792c(C75099b<K> bVar, boolean z) {
        mo104793d(bVar, z, 0);
    }

    /* renamed from: d */
    public void mo104793d(C75099b<K> bVar, boolean z, long j) {
        Log.m105925i("MicroMsg.AsyncCgiLoader", "try do cgi: %s, %s", Boolean.valueOf(z), Long.valueOf(j));
        if (j <= 0) {
            mo104794e(bVar, z);
            return;
        }
        ((C119157j) C119157j.f356862d).mo183878i(new C75098a(bVar, z), j);
    }

    /* renamed from: e */
    public final void mo104794e(C75099b<K> bVar, boolean z) {
        C49335eu3 a = mo66604a();
        boolean z2 = a != null;
        if (z2) {
            if (bVar != null) {
                bVar.mo67542a(a);
            }
            this.f221005d.postValue(a);
        }
        if (!z2 || z) {
            if (bVar != null && !((ArrayList) this.f221002a).contains(bVar)) {
                ((ArrayList) this.f221002a).add(bVar);
            }
            Log.m105925i("MicroMsg.AsyncCgiLoader", "trigger cgi: %s", Boolean.valueOf(this.f221003b));
            if (!this.f221003b) {
                this.f221003b = true;
                P p = this.f221004c;
                Assert.assertNotNull("cgi must not be null", p);
                p.mo9225i().mo123064p(new C75104c(this)).mo123062e(new C75101b(this));
            }
        }
    }
}
