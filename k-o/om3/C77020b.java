package om3;

import bp3.C79758p;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import pf3.C110212f;
import pm3.C77115b;
import z04.C112551y;
import zb2.C66777a;

/* renamed from: om3.b */
public final class C77020b extends C66777a<C77020b> {

    /* renamed from: d */
    public final String f225005d;

    /* renamed from: e */
    public final int f225006e;

    /* renamed from: f */
    public final String f225007f;

    /* renamed from: g */
    public final CharSequence f225008g;

    /* renamed from: h */
    public C77115b f225009h;

    /* renamed from: i */
    public CharSequence f225010i = "";

    /* renamed from: j */
    public CharSequence f225011j = "";

    /* renamed from: n */
    public boolean f225012n;

    /* renamed from: o */
    public String f225013o = "";

    /* renamed from: p */
    public int f225014p;

    /* renamed from: q */
    public boolean f225015q = true;

    /* renamed from: r */
    public boolean f225016r;

    /* renamed from: s */
    public boolean f225017s;

    /* renamed from: t */
    public boolean f225018t;

    /* renamed from: u */
    public boolean f225019u = true;

    /* renamed from: v */
    public boolean f225020v;

    /* renamed from: w */
    public boolean f225021w;

    public C77020b(String str, int i, String str2, CharSequence charSequence, C77115b bVar) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(str2, "username");
        C87412m.m108594g(charSequence, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(bVar, "extension");
        this.f225005d = str;
        this.f225006e = i;
        this.f225007f = str2;
        this.f225008g = charSequence;
        this.f225009h = bVar;
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        return this.f225005d;
    }

    /* renamed from: b */
    public final void mo107341b(CharSequence charSequence) {
        CharSequence charSequence2 = this.f225011j;
        if ((charSequence2 == null || C112551y.m153811k(charSequence2)) && C79758p.f233760a.mo109883f(new C110212f()) == 1) {
            charSequence = this.f225005d;
        }
        this.f225011j = charSequence;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f225006e;
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C77020b bVar = (C77020b) obj;
        C87412m.m108594g(bVar, "other");
        return this.f225009h.mo105661c(this, bVar, bVar.f225009h);
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C77020b bVar = (C77020b) obj;
        C87412m.m108594g(bVar, "other");
        return C87412m.m108589b(this.f225007f, bVar.f225007f) && this.f225012n == bVar.f225012n && C87412m.m108589b(this.f225013o, bVar.f225013o) && this.f225014p == bVar.f225014p && this.f225015q == bVar.f225015q && this.f225016r == bVar.f225016r && this.f225017s == bVar.f225017s && this.f225018t == bVar.f225018t && C87412m.m108589b(this.f225008g, bVar.f225008g) && C87412m.m108589b(this.f225010i, bVar.f225010i) && C87412m.m108589b(this.f225011j, bVar.f225011j) && this.f225012n == bVar.f225012n && this.f225019u == bVar.f225019u && this.f225009h.mo105659a(bVar.f225009h);
    }
}
