package com.tencent.p014mm.plugin.appbrand.widget.picker;

import android.view.View;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import com.tencent.p014mm.p136ui.widget.picker.C19879s;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17925e;
import java.util.Locale;
import vt0.C15009n;
import vt0.C22784g;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePicker */
public final class AppBrandTimePicker extends TimePicker implements C17925e<String> {

    /* renamed from: j */
    public static final /* synthetic */ int f49966j = 0;

    /* renamed from: d */
    public NumberPicker f49967d;

    /* renamed from: e */
    public NumberPicker f49968e;

    /* renamed from: f */
    public int f49969f = -1;

    /* renamed from: g */
    public int f49970g = -1;

    /* renamed from: h */
    public int f49971h = -1;

    /* renamed from: i */
    public int f49972i = -1;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePicker$a */
    public class C18069a implements NumberPicker.OnValueChangeListener {
        public C18069a() {
        }

        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
            AppBrandTimePicker appBrandTimePicker = AppBrandTimePicker.this;
            int i3 = AppBrandTimePicker.f49966j;
            appBrandTimePicker.mo22632a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePicker$b */
    public class C18070b implements NumberPicker.OnValueChangeListener {
        public C18070b(AppBrandTimePicker appBrandTimePicker) {
        }

        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045 A[Catch:{ Exception -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBrandTimePicker(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "mDelegate"
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r2 = 2131887161(0x7f120439, float:1.9408921E38)
            r1.<init>(r5, r2)
            r4.<init>(r1)
            r5 = -1
            r4.f49969f = r5
            r4.f49970g = r5
            r4.f49971h = r5
            r4.f49972i = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.setIs24HourView(r5)
            java.lang.String r5 = "mHourSpinner"
            r1 = 0
            hj.b r2 = new hj.b     // Catch:{ Exception -> 0x0035 }
            r2.<init>(r4, r0, r1)     // Catch:{ Exception -> 0x0035 }
            java.lang.Object r2 = r2.mo121998a()     // Catch:{ Exception -> 0x0035 }
            if (r2 == 0) goto L_0x0035
            hj.b r3 = new hj.b     // Catch:{ Exception -> 0x0035 }
            r3.<init>(r2, r5, r1)     // Catch:{ Exception -> 0x0035 }
            java.lang.Object r5 = r3.mo121998a()     // Catch:{ Exception -> 0x0035 }
            android.widget.NumberPicker r5 = (android.widget.NumberPicker) r5     // Catch:{ Exception -> 0x0035 }
            goto L_0x0036
        L_0x0035:
            r5 = r1
        L_0x0036:
            r4.f49967d = r5
            java.lang.String r5 = "mMinuteSpinner"
            hj.b r2 = new hj.b     // Catch:{ Exception -> 0x0051 }
            r2.<init>(r4, r0, r1)     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r0 = r2.mo121998a()     // Catch:{ Exception -> 0x0051 }
            if (r0 == 0) goto L_0x0051
            hj.b r2 = new hj.b     // Catch:{ Exception -> 0x0051 }
            r2.<init>(r0, r5, r1)     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r5 = r2.mo121998a()     // Catch:{ Exception -> 0x0051 }
            android.widget.NumberPicker r5 = (android.widget.NumberPicker) r5     // Catch:{ Exception -> 0x0051 }
            r1 = r5
        L_0x0051:
            r4.f49968e = r1
            android.widget.NumberPicker r5 = r4.f49967d
            com.tencent.p014mm.p136ui.widget.picker.C19879s.m21609d(r5)
            android.widget.NumberPicker r5 = r4.f49968e
            com.tencent.p014mm.p136ui.widget.picker.C19879s.m21609d(r5)
            android.widget.NumberPicker r5 = r4.f49967d
            vt0.C22790m.m26712a(r5)
            android.widget.NumberPicker r5 = r4.f49968e
            vt0.C22790m.m26712a(r5)
            android.content.res.Resources r5 = r4.getResources()
            r0 = 2131231066(0x7f08015a, float:1.8078203E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r0)
            android.widget.NumberPicker r0 = r4.f49967d
            com.tencent.p014mm.p136ui.widget.picker.C19879s.m21608c(r0, r5)
            android.widget.NumberPicker r0 = r4.f49968e
            com.tencent.p014mm.p136ui.widget.picker.C19879s.m21608c(r0, r5)
            android.widget.NumberPicker r5 = r4.f49967d
            if (r5 == 0) goto L_0x0088
            com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePicker$a r0 = new com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePicker$a
            r0.<init>()
            r5.setOnValueChangedListener(r0)
        L_0x0088:
            android.widget.NumberPicker r5 = r4.f49968e
            if (r5 == 0) goto L_0x0094
            com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePicker$b r0 = new com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePicker$b
            r0.<init>(r4)
            r5.setOnValueChangedListener(r0)
        L_0x0094:
            android.widget.NumberPicker r5 = r4.f49967d
            com.tencent.p014mm.p136ui.widget.picker.C19879s.m21610e(r5)
            android.widget.NumberPicker r5 = r4.f49968e
            com.tencent.p014mm.p136ui.widget.picker.C19879s.m21610e(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandTimePicker.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo22632a() {
        NumberPicker numberPicker;
        NumberPicker numberPicker2;
        if (C15009n.m14189a(this.f49969f)) {
            int i = this.f49970g;
            if (!(!(i >= 0 && i <= 59) || (numberPicker2 = this.f49967d) == null || this.f49968e == null)) {
                if (numberPicker2.getValue() == this.f49969f) {
                    this.f49968e.setMinValue(this.f49970g);
                } else {
                    this.f49968e.setMinValue(0);
                }
            }
        }
        if (C15009n.m14189a(this.f49971h) && (numberPicker = this.f49967d) != null && this.f49968e != null) {
            if (numberPicker.getValue() == this.f49971h) {
                this.f49968e.setMaxValue(this.f49972i);
            } else {
                this.f49968e.setMaxValue(59);
            }
        }
    }

    public Object currentValue() {
        return String.format(Locale.US, "%02d:%02d", new Object[]{getCurrentHour(), getCurrentMinute()});
    }

    public View getView() {
        return this;
    }

    public void onAttach(C22784g gVar) {
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C19879s.m21606a(this.f49967d);
        C19879s.m21606a(this.f49968e);
    }

    public void onDetach(C22784g gVar) {
    }

    public void onHide(C22784g gVar) {
    }

    public void onShow(C22784g gVar) {
    }

    public void setCurrentHour(Integer num) {
        super.setCurrentHour(Integer.valueOf(num == null ? 0 : num.intValue()));
        mo22632a();
    }

    public void setCurrentMinute(Integer num) {
        super.setCurrentMinute(Integer.valueOf(num == null ? 0 : num.intValue()));
        mo22632a();
    }
}
