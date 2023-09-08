package p61;

import android.content.res.Resources;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: p61.b */
public final class C100641b extends C100668o {

    /* renamed from: g */
    public final float f294836g;

    /* renamed from: h */
    public final float f294837h;

    public C100641b() {
        Resources resources = MMApplicationContext.getContext().getResources();
        this.f294836g = resources.getDimension(C0966R.dimen.f4303zb);
        this.f294837h = resources.getDimension(C0966R.dimen.f3723cd);
        mo140084e();
    }

    /* renamed from: a */
    public float mo140081a() {
        return 0.0f;
    }

    /* renamed from: b */
    public float mo140082b() {
        return this.f294836g;
    }

    /* renamed from: c */
    public float mo140083c() {
        return this.f294837h;
    }

    /* renamed from: e */
    public void mo140084e() {
        this.f294934c = (int) ((((float) MMApplicationContext.getResources().getDisplayMetrics().widthPixels) - (((float) 2) * 0.0f)) / (this.f294836g + this.f294837h));
    }
}
