package com.tencent.p014mm.plugin.appbrand.widget.picker;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.picker.base.view.WheelView;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17925e;
import of0.C21793a;
import p385u2.C111105a;
import qf0.C22083d;
import rf0.C22228b;
import rf0.C22232f;
import vt0.C22784g;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3 */
public class AppBrandOptionsPickerV3 implements C17925e<String> {

    /* renamed from: d */
    public String[] f49960d;

    /* renamed from: e */
    public C22228b<String> f49961e;

    /* renamed from: f */
    public Context f49962f;

    /* renamed from: g */
    public int f49963g;

    /* renamed from: h */
    public int f49964h;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3$a */
    public class C18068a implements C22083d {
        public C18068a() {
        }

        /* renamed from: a */
        public void mo22631a(int i) {
            AppBrandOptionsPickerV3.this.f49963g = i;
        }
    }

    public AppBrandOptionsPickerV3(Context context) {
        this.f49962f = context;
        this.f49961e = new C22228b<>(context);
    }

    /* renamed from: a */
    public WheelView getView() {
        return this.f49961e.mo35384e();
    }

    /* renamed from: b */
    public void mo22630b() {
        C21793a aVar = new C21793a(this.f49962f, new C18068a());
        aVar.f61766a.f62188e = this.f49964h;
        aVar.f61766a.f62195l = C111105a.m151500b(this.f49962f, C0966R.color.BW_0_Alpha_0_1);
        aVar.mo34201a(this.f49961e);
        this.f49961e.f62978p.f62987b.setDividerHeight((float) this.f49962f.getResources().getDimensionPixelSize(C0966R.dimen.f4175v5));
        this.f49962f.getResources().getDimensionPixelSize(C0966R.dimen.aja);
        this.f49961e.f62978p.getClass();
        this.f49961e.f62978p.f62987b.setDividerColor(C111105a.m151500b(this.f49962f, C0966R.color.BW_0_Alpha_0_1));
        C22232f fVar = this.f49961e.f62978p;
        fVar.f62987b.setPadding(0, this.f49962f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, this.f49962f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
        WheelView wheelView = this.f49961e.f62978p.f62987b;
        wheelView.mo22032e(C111105a.m151500b(this.f49962f, C0966R.color.BW_0_Alpha_0_9));
        wheelView.f49141d = this.f49962f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
        wheelView.invalidate();
        wheelView.setBackgroundColor(C111105a.m151500b(this.f49962f, C0966R.color.f2932f));
    }

    public Object currentValue() {
        this.f49961e.mo35385f();
        return this.f49960d[this.f49963g];
    }

    public void onAttach(C22784g gVar) {
    }

    public void onDetach(C22784g gVar) {
    }

    public void onHide(C22784g gVar) {
    }

    public void onShow(C22784g gVar) {
    }
}
