package hf1;

import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hf1.C59872b;
import java.util.List;
import te3.C51978xi1;

/* renamed from: hf1.e */
public final class C59877e implements C59872b.C59874b {

    /* renamed from: a */
    public final C51978xi1 f170940a;

    /* renamed from: b */
    public final List<C59872b> f170941b;

    /* renamed from: c */
    public final int f170942c;

    public C59877e(C51978xi1 xi12, List<? extends C59872b> list, int i, C59872b.C59873a aVar) {
        C87412m.m108594g(xi12, "ctrlInfo");
        C87412m.m108594g(list, "interceptors");
        this.f170940a = xi12;
        this.f170941b = list;
        this.f170942c = i;
    }

    /* renamed from: a */
    public C59872b.C59873a mo84826a() {
        return null;
    }

    /* renamed from: b */
    public C51978xi1 mo84827b() {
        return this.f170940a;
    }

    /* renamed from: c */
    public C55718s0 mo84828c(C51978xi1 xi12) {
        C87412m.m108594g(xi12, "ctrlInfo");
        if (this.f170942c < this.f170941b.size()) {
            return this.f170941b.get(this.f170942c).mo84825a(new C59877e(xi12, this.f170941b, this.f170942c + 1, (C59872b.C59873a) null));
        }
        Log.m105920e("Finder.RedDotChain", "index out of bounds");
        return null;
    }
}
