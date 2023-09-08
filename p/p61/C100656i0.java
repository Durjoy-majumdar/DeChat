package p61;

import android.content.res.Resources;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: p61.i0 */
public final class C100656i0 extends C100668o {

    /* renamed from: g */
    public final float f294871g;

    /* renamed from: h */
    public final float f294872h;

    /* renamed from: i */
    public final float f294873i;

    public C100656i0() {
        Resources resources = MMApplicationContext.getContext().getResources();
        this.f294871g = resources.getDimension(C0966R.dimen.av6);
        this.f294872h = resources.getDimension(C0966R.dimen.f3736cp);
        this.f294873i = resources.getDimension(C0966R.dimen.f3766df);
        this.f294937f = (int) resources.getDimension(C0966R.dimen.av4);
        this.f294934c = 4;
        mo140084e();
    }

    /* renamed from: a */
    public float mo140081a() {
        return this.f294872h;
    }

    /* renamed from: b */
    public float mo140082b() {
        return this.f294871g;
    }

    /* renamed from: c */
    public float mo140083c() {
        return this.f294873i;
    }
}
