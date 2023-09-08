package sk1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.LinkedList;
import o40.C61937h;
import pe3.C47465a;
import pe3.C89349b;
import te3.C51212s90;
import te3.C64370fp1;
import te3.C64513l40;
import te3.bs4;
import tf1.C13914m;

/* renamed from: sk1.x */
public final class C63965x extends C63956k {

    /* renamed from: A */
    public String f181333A;

    /* renamed from: B */
    public C64513l40 f181334B;

    /* renamed from: C */
    public C64513l40 f181335C;

    /* renamed from: D */
    public int f181336D;

    /* renamed from: E */
    public int f181337E;

    /* renamed from: F */
    public int f181338F;

    /* renamed from: G */
    public String f181339G;

    /* renamed from: H */
    public String f181340H;

    /* renamed from: I */
    public int f181341I = -1;

    /* renamed from: J */
    public C51212s90 f181342J;

    /* renamed from: K */
    public bs4 f181343K;

    /* renamed from: L */
    public LinkedList<String> f181344L;

    /* renamed from: M */
    public int f181345M;

    /* renamed from: s */
    public C64370fp1 f181346s;

    /* renamed from: t */
    public long f181347t;

    /* renamed from: u */
    public String f181348u;

    /* renamed from: v */
    public LinkedList<String> f181349v;

    /* renamed from: w */
    public int f181350w;

    /* renamed from: x */
    public int f181351x;

    /* renamed from: y */
    public int f181352y;

    /* renamed from: z */
    public int f181353z;

    public C63965x(C64370fp1 fp12) {
        C87412m.m108594g(fp12, "data");
        this.f181346s = fp12;
        this.f181347t = fp12.f183176d;
        this.f181348u = fp12.f183177e;
        this.f181349v = fp12.f183178f;
        this.f181350w = fp12.f183179g;
        this.f181351x = fp12.f183180h;
        this.f181352y = fp12.f183181i;
        this.f181353z = fp12.f183182j;
        this.f181333A = fp12.f183183n;
        this.f181334B = fp12.f183184o;
        this.f181335C = fp12.f183185p;
        this.f181336D = fp12.f183186q;
        this.f181337E = fp12.f183187r;
        this.f181338F = fp12.f183188s;
        this.f181339G = fp12.f183189t;
        this.f181340H = fp12.f183191v;
        this.f181342J = fp12.f183156A;
        this.f181343K = fp12.f183169N;
        this.f181344L = fp12.f183171Q;
        this.f181345M = fp12.f183172R;
    }

    /* renamed from: a */
    public C89349b mo13072a() {
        return this.f181292e;
    }

    /* renamed from: b */
    public C47465a mo13073b() {
        return this.f181346s;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    /* renamed from: d */
    public long mo13074d() {
        return this.f181291d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C87412m.m108589b(C63965x.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem");
        return this.f181347t == ((C63965x) obj).f181347t;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return (!(mVar instanceof C63965x) || ((C63965x) mVar).f181347t != this.f181347t) ? -1 : 0;
    }

    public long getItemId() {
        return this.f181347t;
    }

    public int hashCode() {
        long j = this.f181347t;
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: k */
    public final C51212s90 mo88747k() {
        C51212s90 s902 = this.f181342J;
        if (s902 != null) {
            Log.m105924i("MicroMsg.ShopWindowShelfProductItem", "availableExclusiveInfo " + C61937h.m72709h(s902));
        }
        boolean z = false;
        if (!((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_finder_live_disable_shopping_exclusive_price, false) && s902 != null) {
            if (s902.f141380d) {
                z = true;
            }
            if (z) {
                return s902;
            }
        }
        return null;
    }

    public String toString() {
        return "ShopWindowShelfProductItem(product_id=" + this.f181347t + ", title=" + this.f181348u + ", stock=" + this.f181350w + ", product_button_status:" + this.f181345M + ", market_price=" + this.f181351x + ", selling_price=" + this.f181352y + ", status=" + this.f181353z + ", is_promoting=" + this.f181336D + ", platform_id=" + this.f181337E + ", list_id=" + this.f181338F + ", extra_data=" + this.f181339G + ", button_wording=" + this.f181340H + ", origin_price=" + this.f181341I + ')';
    }
}
