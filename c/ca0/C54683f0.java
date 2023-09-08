package ca0;

import com.tencent.maas.model.MJMusicInfo;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p175j0.C60667k2;
import rx3.C13598b0;

/* renamed from: ca0.f0 */
public final class C54683f0 {

    /* renamed from: a */
    public final C60667k2<List<MJMusicInfo>> f153249a;

    /* renamed from: b */
    public final C60667k2<MJMusicInfo> f153250b;

    /* renamed from: c */
    public final C32226l<String, C13598b0> f153251c;

    /* renamed from: d */
    public final C60667k2<Boolean> f153252d;

    /* renamed from: e */
    public final C60667k2<Boolean> f153253e;

    /* renamed from: f */
    public final C32224a<List<String>> f153254f;

    /* renamed from: g */
    public final C32227p<Boolean, Boolean, C13598b0> f153255g;

    /* renamed from: h */
    public final C32227p<Boolean, Boolean, C13598b0> f153256h;

    /* renamed from: i */
    public final boolean f153257i;

    /* renamed from: j */
    public final C54679b f153258j;

    /* renamed from: k */
    public final Map<String, Long> f153259k;

    /* renamed from: l */
    public C32226l<Object, C13598b0> f153260l;

    public C54683f0(C60667k2 k2Var, C60667k2 k2Var2, C32226l lVar, C60667k2 k2Var3, C60667k2 k2Var4, C32224a aVar, C32227p pVar, C32227p pVar2, boolean z, C54679b bVar, int i, C8480h hVar) {
        z = (i & 256) != 0 ? true : z;
        bVar = (i & 512) != 0 ? null : bVar;
        C87412m.m108594g(k2Var, "musicInfoListState");
        C87412m.m108594g(k2Var2, "musicInfoState");
        C87412m.m108594g(lVar, "selectMusic");
        C87412m.m108594g(k2Var3, "musicMutedState");
        C87412m.m108594g(k2Var4, "originMutedState");
        C87412m.m108594g(aVar, "currentLyricInfoGetter");
        C87412m.m108594g(pVar, "setMovieOption");
        C87412m.m108594g(pVar2, "switchMovieOption");
        this.f153249a = k2Var;
        this.f153250b = k2Var2;
        this.f153251c = lVar;
        this.f153252d = k2Var3;
        this.f153253e = k2Var4;
        this.f153254f = aVar;
        this.f153255g = pVar;
        this.f153256h = pVar2;
        this.f153257i = z;
        this.f153258j = bVar;
        this.f153259k = new LinkedHashMap();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54683f0)) {
            return false;
        }
        C54683f0 f0Var = (C54683f0) obj;
        return C87412m.m108589b(this.f153249a, f0Var.f153249a) && C87412m.m108589b(this.f153250b, f0Var.f153250b) && C87412m.m108589b(this.f153251c, f0Var.f153251c) && C87412m.m108589b(this.f153252d, f0Var.f153252d) && C87412m.m108589b(this.f153253e, f0Var.f153253e) && C87412m.m108589b(this.f153254f, f0Var.f153254f) && C87412m.m108589b(this.f153255g, f0Var.f153255g) && C87412m.m108589b(this.f153256h, f0Var.f153256h) && this.f153257i == f0Var.f153257i && C87412m.m108589b(this.f153258j, f0Var.f153258j);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f153249a.hashCode() * 31) + this.f153250b.hashCode()) * 31) + this.f153251c.hashCode()) * 31) + this.f153252d.hashCode()) * 31) + this.f153253e.hashCode()) * 31) + this.f153254f.hashCode()) * 31) + this.f153255g.hashCode()) * 31) + this.f153256h.hashCode()) * 31;
        boolean z = this.f153257i;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        C54679b bVar = this.f153258j;
        return i + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "MusicState(musicInfoListState=" + this.f153249a + ", musicInfoState=" + this.f153250b + ", selectMusic=" + this.f153251c + ", musicMutedState=" + this.f153252d + ", originMutedState=" + this.f153253e + ", currentLyricInfoGetter=" + this.f153254f + ", setMovieOption=" + this.f153255g + ", switchMovieOption=" + this.f153256h + ", showOrigin=" + this.f153257i + ", reporter=" + this.f153258j + ')';
    }
}
