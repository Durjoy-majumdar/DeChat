package wk1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C8480h;
import gy3.C87412m;
import zp3.C79406f;

/* renamed from: wk1.m */
public final class C15439m {

    /* renamed from: i */
    public static final int f41883i = C79406f.m96347a(MMApplicationContext.getContext(), 18.0f);

    /* renamed from: j */
    public static final int f41884j = C79406f.m96347a(MMApplicationContext.getContext(), 10.0f);

    /* renamed from: k */
    public static final float f41885k = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3703bv);

    /* renamed from: l */
    public static final float f41886l = -1.0f;

    /* renamed from: a */
    public CharSequence f41887a;

    /* renamed from: b */
    public final float f41888b;

    /* renamed from: c */
    public final float f41889c;

    /* renamed from: d */
    public int f41890d;

    /* renamed from: e */
    public int f41891e;

    /* renamed from: f */
    public final int f41892f;

    /* renamed from: g */
    public final int f41893g;

    /* renamed from: h */
    public final float f41894h;

    public C15439m(CharSequence charSequence, float f, float f2, int i, int i2, int i3, int i4, float f3, int i5, C8480h hVar) {
        f3 = (i5 & 128) != 0 ? f41886l : f3;
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        this.f41887a = charSequence;
        this.f41888b = f;
        this.f41889c = f2;
        this.f41890d = i;
        this.f41891e = i2;
        this.f41892f = i3;
        this.f41893g = i4;
        this.f41894h = f3;
    }

    public String toString() {
        return "text:" + this.f41887a + ",leftPading:" + this.f41888b + ",rightPading:" + this.f41889c + ",bgColor:" + this.f41890d + ",bgHeight:" + this.f41891e + ",textColor:" + this.f41892f + ",textSize:" + this.f41893g + ",radius:" + this.f41894h;
    }
}
