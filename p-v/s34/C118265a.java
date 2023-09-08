package s34;

import java.util.Arrays;
import l34.C117458j;
import m34.C117522a;
import m34.C117527b;
import m34.C117530e;
import m34.C117533h;
import m34.C88695f;
import t34.C118375m;

/* renamed from: s34.a */
public class C118265a<T> extends C117458j<T> {

    /* renamed from: h */
    public final C117458j<? super T> f353473h;

    /* renamed from: i */
    public boolean f353474i;

    public C118265a(C117458j<? super T> jVar) {
        super(jVar, true);
        this.f353473h = jVar;
    }

    /* renamed from: a */
    public void mo122780a() {
        if (!this.f353474i) {
            this.f353474i = true;
            try {
                this.f353473h.mo122780a();
                try {
                    mo182165d();
                } catch (Throwable th) {
                    C118375m.m166985a(th);
                    throw new C117533h(th.getMessage(), th);
                }
            } catch (Throwable th4) {
                try {
                    mo182165d();
                    throw th4;
                } catch (Throwable th5) {
                    C118375m.m166985a(th5);
                    throw new C117533h(th5.getMessage(), th5);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo122781b(T t) {
        try {
            if (!this.f353474i) {
                this.f353473h.mo122781b(t);
            }
        } catch (Throwable th) {
            C117527b.m165775c(th, this);
        }
    }

    public void onError(Throwable th) {
        C117527b.m165774b(th);
        if (!this.f353474i) {
            this.f353474i = true;
            C118375m.m166985a(th);
            try {
                this.f353473h.onError(th);
                try {
                    mo182165d();
                } catch (Throwable th4) {
                    C118375m.m166985a(th4);
                    throw new C117530e(th4);
                }
            } catch (C88695f e) {
                mo182165d();
                throw e;
            } catch (Throwable th5) {
                C118375m.m166985a(th5);
                throw new C88695f("Observer.onError not implemented and error while unsubscribing.", new C117522a(Arrays.asList(new Throwable[]{th, th5})));
            }
        }
    }
}
