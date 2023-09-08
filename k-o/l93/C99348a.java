package l93;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: l93.a */
public final class C99348a {

    /* renamed from: a */
    public static int f291330a;

    /* renamed from: b */
    public static final int f291331b = C75044y4.m89994f(MMApplicationContext.getContext());

    /* renamed from: c */
    public static final int f291332c = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3679b9);

    /* renamed from: d */
    public static final int f291333d = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.att);

    /* renamed from: e */
    public static final int f291334e = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.ats);

    /* renamed from: f */
    public static final int f291335f;

    /* renamed from: g */
    public static final int f291336g;

    /* renamed from: h */
    public static final float f291337h;

    static {
        int c = C75044y4.m89991c(MMApplicationContext.getContext());
        Log.m105925i("MicroMsg.BagIndicatorController", "getNavigationBarHeight height:%d", Integer.valueOf(c));
        f291330a = c;
        MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.atq);
        MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.atp);
        int dimensionPixelSize = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.atm);
        f291335f = dimensionPixelSize;
        int dimensionPixelSize2 = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.atl);
        f291336g = dimensionPixelSize2;
        f291337h = ((float) dimensionPixelSize2) / ((float) dimensionPixelSize);
    }
}
