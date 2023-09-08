package aw0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: aw0.n */
public class C103926n {

    /* renamed from: a */
    public static final int f307291a;

    /* renamed from: b */
    public static final int f307292b;

    /* renamed from: c */
    public static final int f307293c;

    /* renamed from: d */
    public static final int f307294d;

    /* renamed from: e */
    public static final int f307295e = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.axr);

    /* renamed from: f */
    public static final int f307296f;

    /* renamed from: g */
    public static final float f307297g;

    /* renamed from: h */
    public static final int f307298h;

    /* renamed from: i */
    public static final int f307299i;

    /* renamed from: j */
    public static int f307300j;

    /* renamed from: k */
    public static final int f307301k;

    /* renamed from: l */
    public static final int f307302l = ((int) (((float) C76577a.m92159j(MMApplicationContext.getContext())) * 0.3f));

    /* renamed from: aw0.n$a */
    public enum C103927a {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    static {
        int f = C75044y4.m89994f(MMApplicationContext.getContext());
        int dimensionPixelSize = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.axo);
        f307291a = dimensionPixelSize;
        int dimensionPixelSize2 = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.axu);
        f307292b = dimensionPixelSize2;
        int f2 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.axt);
        f307293c = f2;
        int f3 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.axq);
        f307294d = f3;
        int dimensionPixelSize3 = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.axh);
        int dimensionPixelSize4 = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.axg);
        f307296f = dimensionPixelSize4;
        f307297g = ((float) dimensionPixelSize4) / ((float) dimensionPixelSize3);
        C76577a.m92145A(MMApplicationContext.getContext());
        int i = f + dimensionPixelSize;
        f307298h = i;
        f307299i = (C76577a.m92159j(MMApplicationContext.getContext()) - dimensionPixelSize) - ((dimensionPixelSize2 + f2) + f3);
        int i2 = 0;
        try {
            i2 = C75044y4.m89991c(MMApplicationContext.getContext());
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FloatBallViewConstants", "getNavigationBarHeight exception:%s", e);
        }
        f307300j = i2;
        f307301k = i;
    }
}
