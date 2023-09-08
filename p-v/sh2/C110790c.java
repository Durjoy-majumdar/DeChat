package sh2;

import ac3.C103355g1;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.xlabeffect.XEffectConfig;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.Buffer;
import java.nio.IntBuffer;
import p80.C110193b;
import p80.C110194c;
import q00.C110264g;
import rx3.C13598b0;
import s80.C110780c;
import u80.C111139a;
import u80.C111141c;
import u80.C111143e;

/* renamed from: sh2.c */
public class C110790c extends C110780c {

    /* renamed from: t */
    public C111139a f331425t;

    /* renamed from: u */
    public C111139a f331426u;

    /* renamed from: v */
    public C103355g1 f331427v;

    /* renamed from: w */
    public C110194c f331428w;

    /* renamed from: x */
    public XEffectConfig f331429x;

    /* renamed from: y */
    public C32227p<? super Integer, ? super Integer, C13598b0> f331430y;

    public C110790c() {
        this(0, 1, (C8480h) null);
    }

    public C110790c(int i) {
        super(1, i);
        this.f331429x = new XEffectConfig();
    }

    /* renamed from: f */
    public C111139a mo157952f() {
        C111141c cVar = new C111141c(this.f331376a, this.f331377b, this.f331378c, this.f331379d, 2, this.f331381f);
        this.f331425t = cVar;
        cVar.f332759n = true;
        C111139a aVar = this.f331426u;
        if (aVar != null) {
            aVar.mo158471l();
        }
        int i = this.f331378c;
        int i2 = this.f331379d;
        this.f331426u = new C111143e(i, i2, i, i2, this.f331380e, 1);
        C103355g1 g1Var = this.f331427v;
        if (g1Var != null) {
            g1Var.destroy();
        }
        C103355g1 g1Var2 = new C103355g1(0, false, false, false, false, false, C110264g.C47730a.APP_SIGHTCAMERACAP, 63, (C8480h) null);
        this.f331427v = g1Var2;
        g1Var2.mo143252s(this.f331429x);
        C103355g1 g1Var3 = this.f331427v;
        if (g1Var3 != null) {
            g1Var3.mo143250q((String) null, 0.0f);
        }
        C103355g1 g1Var4 = this.f331427v;
        if (g1Var4 != null) {
            g1Var4.mo143233a(false);
        }
        C103355g1 g1Var5 = this.f331427v;
        if (g1Var5 != null) {
            g1Var5.mo143224C(this.f331378c, this.f331379d);
        }
        C110194c cVar2 = this.f331428w;
        if (cVar2 != null) {
            cVar2.close();
        }
        this.f331428w = C110193b.m149776b(true, 16);
        return cVar;
    }

    /* renamed from: g */
    public C110194c mo157953g() {
        return this.f331428w;
    }

    /* renamed from: h */
    public int mo162332h() {
        C111139a aVar = this.f331426u;
        if (aVar != null) {
            return aVar.f332769x;
        }
        return 0;
    }

    /* renamed from: i */
    public int mo162333i() {
        C111139a aVar = this.f331426u;
        if (aVar != null) {
            return aVar.f332768w;
        }
        return 0;
    }

    /* renamed from: n */
    public void mo157956n(boolean z) {
        super.mo157956n(z);
        C111139a aVar = this.f331426u;
        if (aVar != null) {
            aVar.mo158471l();
        }
        this.f331426u = null;
        C103355g1 g1Var = this.f331427v;
        if (g1Var != null) {
            g1Var.destroy();
        }
        this.f331427v = null;
        C110194c cVar = this.f331428w;
        if (cVar != null) {
            cVar.close();
        }
        this.f331428w = null;
    }

    /* renamed from: p */
    public void mo157957p() {
        C110194c cVar;
        super.mo157957p();
        C111139a aVar = this.f331425t;
        if (aVar != null && (cVar = aVar.f332754i) != null) {
            C103355g1 g1Var = this.f331427v;
            if (g1Var != null) {
                C103355g1.C103357b bVar = C103355g1.f304769J;
                C110264g.C110265b.m149906a(g1Var, cVar.f329652e, 0, false, 4, (Object) null);
            }
            C110194c cVar2 = this.f331428w;
            if (cVar2 != null) {
                C110194c.m149779b(cVar2, this.f331378c, this.f331379d, 0, (Buffer) null, 0, 0, 60, (Object) null);
            }
            C110194c cVar3 = this.f331428w;
            if (cVar3 != null) {
                C103355g1 g1Var2 = this.f331427v;
                Integer valueOf = g1Var2 != null ? Integer.valueOf(C103355g1.m136947F(g1Var2, cVar, cVar3, 0, 0, false, false, 60, (Object) null)) : null;
                if (valueOf != null && valueOf.intValue() == 0) {
                    cVar = cVar3;
                }
            }
            C111139a aVar2 = this.f331426u;
            if (aVar2 != null) {
                ((C111143e) aVar2).f332822G = cVar.f329652e;
            }
            if (aVar2 != null) {
                aVar2.mo162879m();
            }
        }
    }

    /* renamed from: q */
    public void mo162335q(C32226l<? super IntBuffer, C13598b0> lVar) {
        C87412m.m108594g(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C111139a aVar = this.f331426u;
        if (aVar != null) {
            aVar.f332762q = lVar;
        }
    }

    /* renamed from: s */
    public void mo162336s() {
        C111139a aVar = this.f331426u;
        if (aVar != null) {
            aVar.f332766u = true;
        }
    }

    /* renamed from: t */
    public void mo159590t(int i, int i2) {
        super.mo159590t(i, i2);
        C111139a aVar = this.f331426u;
        if (aVar != null) {
            aVar.mo143263u(this.f331378c, this.f331379d);
        }
        C111139a aVar2 = this.f331426u;
        if (aVar2 != null) {
            aVar2.mo158522s(this.f331378c, this.f331379d);
        }
        C103355g1 g1Var = this.f331427v;
        if (g1Var != null) {
            g1Var.mo143224C(this.f331378c, this.f331379d);
        }
        C32227p<? super Integer, ? super Integer, C13598b0> pVar = this.f331430y;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C110790c(int i, int i2, C8480h hVar) {
        this((i2 & 1) != 0 ? 2 : i);
    }
}
