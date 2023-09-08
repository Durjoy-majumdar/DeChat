package com.tencent.p014mm.p136ui.widget.picker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.NumberPicker;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.YADatePicker;
import com.tencent.xweb.util.WXWebReporter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.tencent.mm.ui.widget.picker.CustomDatePicker */
public class CustomDatePicker extends YADatePicker {

    /* renamed from: p */
    public static final /* synthetic */ int f56561p = 0;

    /* renamed from: f */
    public NumberPicker f56562f;

    /* renamed from: g */
    public NumberPicker f56563g;

    /* renamed from: h */
    public NumberPicker f56564h;

    /* renamed from: i */
    public Date f56565i;

    /* renamed from: j */
    public Date f56566j;

    /* renamed from: n */
    public Calendar f56567n;

    /* renamed from: o */
    public String[] f56568o;

    /* renamed from: com.tencent.mm.ui.widget.picker.CustomDatePicker$a */
    public class C19862a implements NumberPicker.OnValueChangeListener {
        public C19862a() {
        }

        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
            CustomDatePicker customDatePicker = CustomDatePicker.this;
            int i3 = CustomDatePicker.f56561p;
            customDatePicker.mo26462c();
        }
    }

    public CustomDatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo26461b();
    }

    /* renamed from: a */
    public void mo26460a(int i, int i2, int i3) {
        int max = Math.max(i2 - 1, 0);
        YADatePicker.C19870d dVar = (YADatePicker.C19870d) this.f56604d;
        dVar.mo26521d(i, max, i3);
        dVar.mo26526i();
        dVar.mo26525h();
        dVar.getClass();
        mo26462c();
    }

    /* renamed from: b */
    public final void mo26461b() {
        this.f56568o = new String[12];
        int i = 0;
        while (true) {
            String[] strArr = this.f56568o;
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
        this.f56567n = Calendar.getInstance(Locale.US);
        setCalendarViewShown(false);
        setSpinnersShown(true);
        this.f56562f = ((YADatePicker.C19870d) getUIDelegate()).f56613f;
        this.f56563g = ((YADatePicker.C19870d) getUIDelegate()).f56612e;
        this.f56564h = ((YADatePicker.C19870d) getUIDelegate()).f56611d;
        Drawable drawable = getResources().getDrawable(C0966R.C0969drawable.alv);
        C19879s.m21608c(this.f56562f, drawable);
        C19879s.m21608c(this.f56563g, drawable);
        C19879s.m21608c(this.f56564h, drawable);
        C19879s.m21609d(this.f56562f);
        C19879s.m21609d(this.f56563g);
        C19879s.m21609d(this.f56564h);
        C19879s.m21611f(this.f56562f, getResources().getColor(C0966R.color.a7f));
        C19879s.m21611f(this.f56563g, getResources().getColor(C0966R.color.a7f));
        C19879s.m21611f(this.f56564h, getResources().getColor(C0966R.color.a7f));
        C19862a aVar = new C19862a();
        NumberPicker numberPicker = this.f56562f;
        if (numberPicker != null) {
            numberPicker.setOnValueChangedListener(aVar);
            this.f56562f.setMinValue(WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID);
        }
        NumberPicker numberPicker2 = this.f56563g;
        if (numberPicker2 != null) {
            numberPicker2.setOnValueChangedListener(aVar);
        }
        NumberPicker numberPicker3 = this.f56564h;
        if (numberPicker3 != null) {
            numberPicker3.setOnValueChangedListener(aVar);
        }
        mo26462c();
        C19879s.m21610e(this.f56562f);
        C19879s.m21610e(this.f56563g);
        C19879s.m21610e(this.f56564h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26462c() {
        /*
            r5 = this;
            android.widget.NumberPicker r0 = r5.f56562f
            if (r0 == 0) goto L_0x00de
            android.widget.NumberPicker r0 = r5.f56563g
            if (r0 == 0) goto L_0x00de
            android.widget.NumberPicker r1 = r5.f56564h
            if (r1 != 0) goto L_0x000e
            goto L_0x00de
        L_0x000e:
            r1 = 0
            r0.setDisplayedValues(r1)
            android.widget.NumberPicker r0 = r5.f56562f
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f56562f
            int r1 = r1.getMaxValue()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x004c
            java.util.Date r0 = r5.f56566j
            if (r0 == 0) goto L_0x004c
            android.widget.NumberPicker r1 = r5.f56563g
            int r0 = r0.getMonth()
            r1.setMaxValue(r0)
            android.widget.NumberPicker r0 = r5.f56563g
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f56563g
            int r1 = r1.getMaxValue()
            if (r0 != r1) goto L_0x0053
            java.util.Date r0 = r5.f56566j
            if (r0 == 0) goto L_0x0053
            android.widget.NumberPicker r1 = r5.f56564h
            int r0 = r0.getDate()
            r1.setMaxValue(r0)
            r0 = 1
            goto L_0x0054
        L_0x004c:
            android.widget.NumberPicker r0 = r5.f56563g
            r1 = 11
            r0.setMaxValue(r1)
        L_0x0053:
            r0 = 0
        L_0x0054:
            if (r0 != 0) goto L_0x0073
            android.widget.NumberPicker r0 = r5.f56562f
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f56563g
            int r1 = r1.getValue()
            java.util.Calendar r4 = r5.f56567n
            r4.set(r0, r1, r3)
            java.util.Calendar r0 = r5.f56567n
            r1 = 5
            int r0 = r0.getActualMaximum(r1)
            android.widget.NumberPicker r1 = r5.f56564h
            r1.setMaxValue(r0)
        L_0x0073:
            android.widget.NumberPicker r0 = r5.f56562f
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f56562f
            int r1 = r1.getMinValue()
            if (r0 != r1) goto L_0x00ab
            java.util.Date r0 = r5.f56565i
            if (r0 == 0) goto L_0x00ab
            android.widget.NumberPicker r1 = r5.f56563g
            int r0 = r0.getMonth()
            r1.setMinValue(r0)
            android.widget.NumberPicker r0 = r5.f56563g
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f56563g
            int r1 = r1.getMinValue()
            if (r0 != r1) goto L_0x00b0
            java.util.Date r0 = r5.f56565i
            if (r0 == 0) goto L_0x00b0
            android.widget.NumberPicker r1 = r5.f56564h
            int r0 = r0.getDate()
            r1.setMinValue(r0)
            r2 = 1
            goto L_0x00b0
        L_0x00ab:
            android.widget.NumberPicker r0 = r5.f56563g
            r0.setMinValue(r2)
        L_0x00b0:
            if (r2 != 0) goto L_0x00b7
            android.widget.NumberPicker r0 = r5.f56564h
            r0.setMinValue(r3)
        L_0x00b7:
            android.widget.NumberPicker r0 = r5.f56563g
            java.lang.String[] r1 = r5.f56568o
            int r2 = r0.getMinValue()
            android.widget.NumberPicker r4 = r5.f56563g
            int r4 = r4.getMaxValue()
            int r4 = r4 + r3
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r1, r2, r4)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.setDisplayedValues(r1)
            android.widget.NumberPicker r0 = r5.f56562f
            r0.setWrapSelectorWheel(r3)
            android.widget.NumberPicker r0 = r5.f56563g
            r0.setWrapSelectorWheel(r3)
            android.widget.NumberPicker r0 = r5.f56564h
            r0.setWrapSelectorWheel(r3)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.picker.CustomDatePicker.mo26462c():void");
    }

    public int getDayOfMonth() {
        NumberPicker numberPicker = this.f56564h;
        return numberPicker != null ? numberPicker.getValue() : super.getDayOfMonth();
    }

    public int getMonth() {
        NumberPicker numberPicker = this.f56563g;
        return Math.max(Math.min((numberPicker != null ? numberPicker.getValue() : super.getMonth()) + 1, 12), 0);
    }

    public int getYear() {
        NumberPicker numberPicker = this.f56562f;
        return numberPicker != null ? numberPicker.getValue() : super.getYear();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C19879s.m21606a(this.f56562f);
        C19879s.m21606a(this.f56563g);
        C19879s.m21606a(this.f56564h);
    }

    public void setMaxDate(long j) {
        super.setMaxDate(j);
        Date date = new Date(j);
        this.f56566j = date;
        NumberPicker numberPicker = this.f56562f;
        if (numberPicker != null) {
            numberPicker.setMaxValue(date.getYear() + WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID);
        }
        mo26462c();
    }

    public void setMinDate(long j) {
        super.setMinDate(j);
        Date date = new Date(j);
        this.f56565i = date;
        NumberPicker numberPicker = this.f56562f;
        if (numberPicker != null) {
            numberPicker.setMinValue(date.getYear() + WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID);
        }
    }

    public CustomDatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo26461b();
    }
}
