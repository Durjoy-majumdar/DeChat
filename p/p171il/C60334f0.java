package p171il;

import android.content.res.Resources;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: il.f0 */
public final class C60334f0 extends C60338x {

    /* renamed from: g */
    public final float f171982g;

    /* renamed from: h */
    public final float f171983h;

    /* renamed from: i */
    public final float f171984i;

    public C60334f0() {
        Resources resources = MMApplicationContext.getContext().getResources();
        this.f171982g = resources.getDimension(C0966R.dimen.a4e);
        this.f171983h = resources.getDimension(C0966R.dimen.f3736cp);
        this.f171984i = resources.getDimension(C0966R.dimen.f3736cp) - ((float) 1);
        resources.getDimension(C0966R.dimen.f3703bv);
        this.f171991c = 8;
        mo85310e();
    }

    /* renamed from: a */
    public float mo85305a() {
        return this.f171983h;
    }

    /* renamed from: b */
    public float mo85306b() {
        return this.f171982g;
    }

    /* renamed from: c */
    public float mo85307c() {
        return this.f171984i;
    }
}
