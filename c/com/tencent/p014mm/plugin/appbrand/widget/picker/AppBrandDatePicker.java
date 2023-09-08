package com.tencent.p014mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.NumberPicker;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.C19879s;
import com.tencent.p014mm.p136ui.widget.picker.YADatePicker;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17925e;
import com.tencent.xweb.util.WXWebReporter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import vt0.C22784g;
import vt0.C22790m;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandDatePicker */
public final class AppBrandDatePicker extends YADatePicker implements C17925e<String> {

    /* renamed from: r */
    public static final /* synthetic */ int f49927r = 0;

    /* renamed from: f */
    public boolean f49928f = true;

    /* renamed from: g */
    public boolean f49929g = true;

    /* renamed from: h */
    public NumberPicker f49930h;

    /* renamed from: i */
    public NumberPicker f49931i;

    /* renamed from: j */
    public NumberPicker f49932j;

    /* renamed from: n */
    public Date f49933n;

    /* renamed from: o */
    public Date f49934o;

    /* renamed from: p */
    public final Calendar f49935p;

    /* renamed from: q */
    public final String[] f49936q = new String[12];

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandDatePicker$a */
    public class C18065a implements NumberPicker.OnValueChangeListener {
        public C18065a() {
        }

        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
            AppBrandDatePicker appBrandDatePicker = AppBrandDatePicker.this;
            int i3 = AppBrandDatePicker.f49927r;
            appBrandDatePicker.mo22606b();
        }
    }

    public AppBrandDatePicker(Context context) {
        super(new ContextThemeWrapper(context, C0966R.style.a1a), (AttributeSet) null);
        int i = 0;
        while (true) {
            String[] strArr = this.f49936q;
            if (i >= strArr.length) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("");
            int i2 = i + 1;
            sb.append(i2);
            strArr[i] = sb.toString();
            i = i2;
        }
        this.f49935p = Calendar.getInstance(Locale.US);
        setCalendarViewShown(false);
        setSpinnersShown(true);
        this.f49930h = ((YADatePicker.C19870d) getUIDelegate()).f56613f;
        this.f49931i = ((YADatePicker.C19870d) getUIDelegate()).f56612e;
        this.f49932j = ((YADatePicker.C19870d) getUIDelegate()).f56611d;
        Drawable drawable = getResources().getDrawable(C0966R.C0969drawable.f4488e0);
        C19879s.m21608c(this.f49930h, drawable);
        C19879s.m21608c(this.f49931i, drawable);
        C19879s.m21608c(this.f49932j, drawable);
        C19879s.m21609d(this.f49930h);
        C19879s.m21609d(this.f49931i);
        C19879s.m21609d(this.f49932j);
        C22790m.m26712a(this.f49930h);
        C22790m.m26712a(this.f49931i);
        C22790m.m26712a(this.f49932j);
        C18065a aVar = new C18065a();
        NumberPicker numberPicker = this.f49930h;
        if (numberPicker != null) {
            numberPicker.setOnValueChangedListener(aVar);
            this.f49930h.setMinValue(WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID);
        }
        NumberPicker numberPicker2 = this.f49931i;
        if (numberPicker2 != null) {
            numberPicker2.setOnValueChangedListener(aVar);
        }
        NumberPicker numberPicker3 = this.f49932j;
        if (numberPicker3 != null) {
            numberPicker3.setOnValueChangedListener(aVar);
        }
        mo22606b();
        C19879s.m21610e(this.f49930h);
        C19879s.m21610e(this.f49931i);
        C19879s.m21610e(this.f49932j);
    }

    /* renamed from: a */
    public void mo22605a(int i, int i2, int i3) {
        int max = Math.max(i2 - 1, 0);
        YADatePicker.C19870d dVar = (YADatePicker.C19870d) this.f56604d;
        dVar.mo26521d(i, max, i3);
        dVar.mo26526i();
        dVar.mo26525h();
        dVar.getClass();
        mo22606b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22606b() {
        /*
            r5 = this;
            android.widget.NumberPicker r0 = r5.f49930h
            if (r0 == 0) goto L_0x00de
            android.widget.NumberPicker r0 = r5.f49931i
            if (r0 == 0) goto L_0x00de
            android.widget.NumberPicker r1 = r5.f49932j
            if (r1 != 0) goto L_0x000e
            goto L_0x00de
        L_0x000e:
            r1 = 0
            r0.setDisplayedValues(r1)
            android.widget.NumberPicker r0 = r5.f49930h
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f49930h
            int r1 = r1.getMaxValue()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x004c
            java.util.Date r0 = r5.f49934o
            if (r0 == 0) goto L_0x004c
            android.widget.NumberPicker r1 = r5.f49931i
            int r0 = r0.getMonth()
            r1.setMaxValue(r0)
            android.widget.NumberPicker r0 = r5.f49931i
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f49931i
            int r1 = r1.getMaxValue()
            if (r0 != r1) goto L_0x0053
            java.util.Date r0 = r5.f49934o
            if (r0 == 0) goto L_0x0053
            android.widget.NumberPicker r1 = r5.f49932j
            int r0 = r0.getDate()
            r1.setMaxValue(r0)
            r0 = 1
            goto L_0x0054
        L_0x004c:
            android.widget.NumberPicker r0 = r5.f49931i
            r1 = 11
            r0.setMaxValue(r1)
        L_0x0053:
            r0 = 0
        L_0x0054:
            if (r0 != 0) goto L_0x0073
            android.widget.NumberPicker r0 = r5.f49930h
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f49931i
            int r1 = r1.getValue()
            java.util.Calendar r4 = r5.f49935p
            r4.set(r0, r1, r3)
            java.util.Calendar r0 = r5.f49935p
            r1 = 5
            int r0 = r0.getActualMaximum(r1)
            android.widget.NumberPicker r1 = r5.f49932j
            r1.setMaxValue(r0)
        L_0x0073:
            android.widget.NumberPicker r0 = r5.f49930h
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f49930h
            int r1 = r1.getMinValue()
            if (r0 != r1) goto L_0x00ab
            java.util.Date r0 = r5.f49933n
            if (r0 == 0) goto L_0x00ab
            android.widget.NumberPicker r1 = r5.f49931i
            int r0 = r0.getMonth()
            r1.setMinValue(r0)
            android.widget.NumberPicker r0 = r5.f49931i
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f49931i
            int r1 = r1.getMinValue()
            if (r0 != r1) goto L_0x00b0
            java.util.Date r0 = r5.f49933n
            if (r0 == 0) goto L_0x00b0
            android.widget.NumberPicker r1 = r5.f49932j
            int r0 = r0.getDate()
            r1.setMinValue(r0)
            r2 = 1
            goto L_0x00b0
        L_0x00ab:
            android.widget.NumberPicker r0 = r5.f49931i
            r0.setMinValue(r2)
        L_0x00b0:
            if (r2 != 0) goto L_0x00b7
            android.widget.NumberPicker r0 = r5.f49932j
            r0.setMinValue(r3)
        L_0x00b7:
            android.widget.NumberPicker r0 = r5.f49931i
            java.lang.String[] r1 = r5.f49936q
            int r2 = r0.getMinValue()
            android.widget.NumberPicker r4 = r5.f49931i
            int r4 = r4.getMaxValue()
            int r4 = r4 + r3
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r1, r2, r4)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.setDisplayedValues(r1)
            android.widget.NumberPicker r0 = r5.f49930h
            r0.setWrapSelectorWheel(r3)
            android.widget.NumberPicker r0 = r5.f49931i
            r0.setWrapSelectorWheel(r3)
            android.widget.NumberPicker r0 = r5.f49932j
            r0.setWrapSelectorWheel(r3)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandDatePicker.mo22606b():void");
    }

    public Object currentValue() {
        if (this.f49929g) {
            return String.format(Locale.US, "%04d-%02d-%02d", new Object[]{Integer.valueOf(getYear()), Integer.valueOf(getMonth()), Integer.valueOf(getDayOfMonth())});
        } else if (this.f49928f) {
            return String.format(Locale.US, "%04d-%02d", new Object[]{Integer.valueOf(getYear()), Integer.valueOf(getMonth())});
        } else {
            return String.format(Locale.US, "%04d", new Object[]{Integer.valueOf(getYear())});
        }
    }

    public int getDayOfMonth() {
        NumberPicker numberPicker = this.f49932j;
        return numberPicker != null ? numberPicker.getValue() : super.getDayOfMonth();
    }

    public int getMonth() {
        NumberPicker numberPicker = this.f49931i;
        return Math.max(Math.min((numberPicker != null ? numberPicker.getValue() : super.getMonth()) + 1, 12), 0);
    }

    public View getView() {
        return this;
    }

    public int getYear() {
        NumberPicker numberPicker = this.f49930h;
        return numberPicker != null ? numberPicker.getValue() : super.getYear();
    }

    public void onAttach(C22784g gVar) {
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C19879s.m21606a(this.f49930h);
        C19879s.m21606a(this.f49931i);
        C19879s.m21606a(this.f49932j);
    }

    public void onDetach(C22784g gVar) {
    }

    public void onHide(C22784g gVar) {
    }

    public void onShow(C22784g gVar) {
        mo22606b();
    }

    public void setMaxDate(long j) {
        super.setMaxDate(j);
        Date date = new Date(j);
        this.f49934o = date;
        NumberPicker numberPicker = this.f49930h;
        if (numberPicker != null) {
            numberPicker.setMaxValue(date.getYear() + WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID);
        }
    }

    public void setMinDate(long j) {
        super.setMinDate(j);
        Date date = new Date(j);
        this.f49933n = date;
        NumberPicker numberPicker = this.f49930h;
        if (numberPicker != null) {
            numberPicker.setMinValue(date.getYear() + WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID);
        }
    }
}
