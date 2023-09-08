package f24;

import d24.C20389c;
import e24.C20509c;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import o24.C21760d0;
import o24.C21762e0;
import o24.C21766h;
import o24.C21767i;
import o24.C21768j;

/* renamed from: f24.a */
public class C20646a implements C21760d0 {

    /* renamed from: d */
    public boolean f58123d;

    /* renamed from: e */
    public final /* synthetic */ C21768j f58124e;

    /* renamed from: f */
    public final /* synthetic */ C20648c f58125f;

    /* renamed from: g */
    public final /* synthetic */ C21767i f58126g;

    public C20646a(C20647b bVar, C21768j jVar, C20648c cVar, C21767i iVar) {
        this.f58124e = jVar;
        this.f58125f = cVar;
        this.f58126g = iVar;
    }

    /* renamed from: L0 */
    public long mo32327L0(C21766h hVar, long j) {
        try {
            long L0 = this.f58124e.mo32327L0(hVar, j);
            if (L0 == -1) {
                if (!this.f58123d) {
                    this.f58123d = true;
                    this.f58126g.close();
                }
                return -1;
            }
            hVar.mo34129b(this.f58126g.mo34147p(), hVar.f61695e - L0, L0);
            this.f58126g.mo34124U();
            return L0;
        } catch (IOException e) {
            if (!this.f58123d) {
                this.f58123d = true;
                ((C20389c.C20391b) this.f58125f).mo31894a();
            }
            throw e;
        }
    }

    public void close() {
        boolean z;
        if (!this.f58123d) {
            try {
                z = C20509c.m22211q(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.f58123d = true;
                ((C20389c.C20391b) this.f58125f).mo31894a();
            }
        }
        this.f58124e.close();
    }

    /* renamed from: f */
    public C21762e0 mo32328f() {
        return this.f58124e.mo32328f();
    }
}
