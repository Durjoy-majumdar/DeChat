package p171il;

import android.content.res.Resources;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: il.o */
public final class C60336o extends C60338x {

    /* renamed from: g */
    public final float f171986g;

    /* renamed from: h */
    public final float f171987h;

    /* renamed from: i */
    public final float f171988i;

    public C60336o() {
        Resources resources = MMApplicationContext.getContext().getResources();
        this.f171986g = resources.getDimension(C0966R.dimen.a4c);
        this.f171987h = resources.getDimension(C0966R.dimen.f3736cp);
        this.f171988i = resources.getDimension(C0966R.dimen.f3723cd) - ((float) 1);
        resources.getDimension(C0966R.dimen.f3703bv);
        this.f171991c = 5;
        mo85310e();
    }

    /* renamed from: a */
    public float mo85305a() {
        return this.f171987h;
    }

    /* renamed from: b */
    public float mo85306b() {
        return this.f171986g;
    }

    /* renamed from: c */
    public float mo85307c() {
        return this.f171988i;
    }
}
