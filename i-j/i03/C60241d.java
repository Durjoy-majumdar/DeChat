package i03;

import d03.C58010a;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: i03.d */
public final class C60241d extends C58010a {

    /* renamed from: A */
    public int f171755A;

    /* renamed from: x */
    public float f171756x = 1.0f;

    /* renamed from: y */
    public String f171757y;

    /* renamed from: z */
    public ArrayList<Integer> f171758z = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60241d(String str, String str2, String str3, int i, int i2) {
        super(str, str2, str3, i, i2);
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "path");
        C87412m.m108594g(str3, "url");
    }

    /* renamed from: a */
    public final boolean mo85229a() {
        return this.f171758z.contains(1);
    }
}
