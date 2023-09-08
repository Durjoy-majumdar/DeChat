package v60;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import u60.C65219a;
import z60.C102976a;

/* renamed from: v60.f */
public final class C102156f implements C65551d {

    /* renamed from: a */
    public final C65550c f300815a;

    /* renamed from: b */
    public final C102157g f300816b;

    /* renamed from: c */
    public final C102157g f300817c;

    /* renamed from: d */
    public final int f300818d;

    /* renamed from: e */
    public final String f300819e;

    /* renamed from: f */
    public final String f300820f;

    public C102156f(C65550c cVar, C102157g gVar, C102157g gVar2, C102157g gVar3, int i, String str) {
        C87412m.m108594g(cVar, "retrySg");
        C87412m.m108594g(gVar, "lightWork");
        C87412m.m108594g(gVar2, "heavyWork");
        C87412m.m108594g(gVar3, "ioWork");
        C87412m.m108594g(str, "name");
        this.f300815a = cVar;
        this.f300816b = gVar;
        this.f300817c = gVar2;
        this.f300818d = i;
        this.f300819e = str;
        this.f300820f = "MicroMsg.Loader.TaskLoaderConfiguration";
    }

    /* renamed from: a */
    public C65550c mo89637a() {
        return this.f300815a;
    }

    /* renamed from: b */
    public int mo89638b() {
        return this.f300818d;
    }

    /* renamed from: c */
    public C65219a mo89639c() {
        String str = this.f300820f;
        Log.m105924i(str, "pool light poolSize " + this.f300816b.f300821a + " priority " + this.f300816b.f300821a + " name: " + this.f300819e);
        String str2 = this.f300819e;
        int i = this.f300816b.f300821a;
        return new C102154b(str2, i, i, new C102976a());
    }

    /* renamed from: d */
    public C65219a mo89640d() {
        String str = this.f300820f;
        Log.m105924i(str, "pool heavy poolSize " + this.f300817c.f300821a + " priority " + this.f300817c.f300821a + " name: " + this.f300819e);
        String str2 = this.f300819e;
        int i = this.f300817c.f300821a;
        return new C102154b(str2, i, i, new C102976a());
    }

    public String name() {
        return this.f300819e;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C102156f(C65550c cVar, C102157g gVar, int i, String str) {
        this(cVar, gVar, gVar, gVar, i, str);
        C87412m.m108594g(cVar, "retrySg");
        C87412m.m108594g(gVar, "lightWork");
        C87412m.m108594g(str, "name");
    }
}
