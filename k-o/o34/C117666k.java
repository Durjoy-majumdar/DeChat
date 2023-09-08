package o34;

import java.util.Arrays;
import l34.C117458j;
import m34.C117522a;
import m34.C117527b;

/* renamed from: o34.k */
public class C117666k extends C117458j<Object> {

    /* renamed from: h */
    public boolean f351944h;

    /* renamed from: i */
    public final /* synthetic */ C117458j f351945i;

    /* renamed from: j */
    public final /* synthetic */ C89114l f351946j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117666k(C89114l lVar, C117458j jVar, C117458j jVar2) {
        super(jVar, true);
        this.f351946j = lVar;
        this.f351945i = jVar2;
    }

    /* renamed from: a */
    public void mo122780a() {
        if (!this.f351944h) {
            try {
                this.f351946j.f256766a.mo122780a();
                this.f351944h = true;
                this.f351945i.mo122780a();
            } catch (Throwable th) {
                C117527b.m165775c(th, this);
            }
        }
    }

    /* renamed from: b */
    public void mo122781b(Object obj) {
        if (!this.f351944h) {
            try {
                this.f351946j.f256766a.mo122781b(obj);
                this.f351945i.mo122781b(obj);
            } catch (Throwable th) {
                C117527b.m165776d(th, this, obj);
            }
        }
    }

    public void onError(Throwable th) {
        C117527b.m165774b(th);
        if (!this.f351944h) {
            this.f351944h = true;
            try {
                this.f351946j.f256766a.onError(th);
                this.f351945i.onError(th);
            } catch (Throwable th4) {
                C117527b.m165774b(th4);
                this.f351945i.onError(new C117522a(Arrays.asList(new Throwable[]{th, th4})));
            }
        }
    }
}
