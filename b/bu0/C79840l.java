package bu0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;

/* renamed from: bu0.l */
public abstract class C79840l {

    /* renamed from: a */
    public String f233988a;

    /* renamed from: b */
    public C81925i2 f233989b;

    /* renamed from: c */
    public C79839k f233990c;

    /* renamed from: d */
    public C79841a f233991d;

    /* renamed from: e */
    public int f233992e = -1;

    /* renamed from: f */
    public volatile C79842m f233993f;

    /* renamed from: bu0.l$a */
    public interface C79841a {
        /* renamed from: a */
        void mo110028a(int i);
    }

    public C79840l(String str, C79839k kVar, C81925i2 i2Var) {
        this.f233988a = str;
        this.f233989b = i2Var;
        this.f233990c = kVar;
    }

    /* renamed from: a */
    public String mo110027a() {
        String str = this.f233988a;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.f233988a;
    }

    /* renamed from: b */
    public abstract void mo110025b();

    public C79840l(String str, C79839k kVar) {
        this.f233988a = str;
        this.f233990c = kVar;
    }
}
