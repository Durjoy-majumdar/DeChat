package com.tencent.p014mm.p136ui.widget.picker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85975v4;
import com.tencent.xweb.util.WXWebReporter;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import yo3.C79142a;

/* renamed from: com.tencent.mm.ui.widget.picker.YADatePicker */
public class YADatePicker extends FrameLayout {

    /* renamed from: e */
    public static final /* synthetic */ int f56603e = 0;

    /* renamed from: d */
    public final C19869c f56604d;

    /* renamed from: com.tencent.mm.ui.widget.picker.YADatePicker$b */
    public static abstract class C19868b implements C19869c {

        /* renamed from: a */
        public YADatePicker f56608a;

        /* renamed from: b */
        public Context f56609b;

        /* renamed from: c */
        public Locale f56610c;

        public C19868b(YADatePicker yADatePicker, Context context) {
            this.f56608a = yADatePicker;
            this.f56609b = context;
            mo26518a(Locale.getDefault());
        }

        /* renamed from: a */
        public abstract void mo26518a(Locale locale);
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.YADatePicker$c */
    public interface C19869c {
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.YADatePicker$d */
    public static class C19870d extends C19868b {

        /* renamed from: d */
        public final NumberPicker f56611d;

        /* renamed from: e */
        public final NumberPicker f56612e;

        /* renamed from: f */
        public final NumberPicker f56613f;

        /* renamed from: g */
        public final LinearLayout f56614g;

        /* renamed from: h */
        public final EditText f56615h;

        /* renamed from: i */
        public final EditText f56616i;

        /* renamed from: j */
        public final EditText f56617j;

        /* renamed from: k */
        public final CalendarView f56618k;

        /* renamed from: l */
        public final DateFormat f56619l = new SimpleDateFormat("MM/dd/yyyy");

        /* renamed from: m */
        public String[] f56620m;

        /* renamed from: n */
        public int f56621n;

        /* renamed from: o */
        public Calendar f56622o;

        /* renamed from: p */
        public Calendar f56623p;

        /* renamed from: q */
        public Calendar f56624q;

        /* renamed from: r */
        public Calendar f56625r;

        /* renamed from: s */
        public boolean f56626s = true;

        /* renamed from: com.tencent.mm.ui.widget.picker.YADatePicker$d$a */
        public class C19871a implements NumberPicker.OnValueChangeListener {
            public C19871a() {
            }

            public void onValueChange(NumberPicker numberPicker, int i, int i2) {
                C19870d dVar = C19870d.this;
                InputMethodManager inputMethodManager = (InputMethodManager) dVar.f56608a.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    if (inputMethodManager.isActive(dVar.f56617j)) {
                        dVar.f56617j.clearFocus();
                        inputMethodManager.hideSoftInputFromWindow(dVar.f56608a.getWindowToken(), 0);
                    } else if (inputMethodManager.isActive(dVar.f56616i)) {
                        dVar.f56616i.clearFocus();
                        inputMethodManager.hideSoftInputFromWindow(dVar.f56608a.getWindowToken(), 0);
                    } else if (inputMethodManager.isActive(dVar.f56615h)) {
                        dVar.f56615h.clearFocus();
                        inputMethodManager.hideSoftInputFromWindow(dVar.f56608a.getWindowToken(), 0);
                    }
                }
                C19870d dVar2 = C19870d.this;
                dVar2.f56622o.setTimeInMillis(dVar2.f56625r.getTimeInMillis());
                C19870d dVar3 = C19870d.this;
                if (numberPicker == dVar3.f56611d) {
                    int actualMaximum = dVar3.f56622o.getActualMaximum(5);
                    if (i == actualMaximum && i2 == 1) {
                        C19870d.this.f56622o.add(5, 1);
                    } else if (i == 1 && i2 == actualMaximum) {
                        C19870d.this.f56622o.add(5, -1);
                    } else {
                        C19870d.this.f56622o.add(5, i2 - i);
                    }
                } else if (numberPicker == dVar3.f56612e) {
                    if (i == 11 && i2 == 0) {
                        dVar3.f56622o.add(2, 1);
                    } else if (i == 0 && i2 == 11) {
                        dVar3.f56622o.add(2, -1);
                    } else {
                        dVar3.f56622o.add(2, i2 - i);
                    }
                } else if (numberPicker == dVar3.f56613f) {
                    dVar3.f56622o.set(1, i2);
                } else {
                    throw new IllegalArgumentException();
                }
                C19870d dVar4 = C19870d.this;
                dVar4.mo26521d(dVar4.f56622o.get(1), C19870d.this.f56622o.get(2), C19870d.this.f56622o.get(5));
                C19870d.this.mo26526i();
                C19870d.this.mo26525h();
                C19870d dVar5 = C19870d.this;
                dVar5.f56608a.sendAccessibilityEvent(4);
                dVar5.getClass();
            }
        }

        /* renamed from: com.tencent.mm.ui.widget.picker.YADatePicker$d$b */
        public class C19872b implements CalendarView.OnDateChangeListener {
            public C19872b() {
            }

            public void onSelectedDayChange(CalendarView calendarView, int i, int i2, int i3) {
                C19870d.this.mo26521d(i, i2, i3);
                C19870d.this.mo26526i();
                C19870d dVar = C19870d.this;
                dVar.f56608a.sendAccessibilityEvent(4);
                dVar.getClass();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19870d(YADatePicker yADatePicker, Context context, AttributeSet attributeSet, int i, int i2) {
            super(yADatePicker, context);
            Context context2 = context;
            this.f56608a = yADatePicker;
            this.f56609b = context2;
            mo26518a(Locale.getDefault());
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C79142a.f232403b, i, i2);
            boolean z = obtainStyledAttributes.getBoolean(16, true);
            boolean z2 = obtainStyledAttributes.getBoolean(1, true);
            int i3 = obtainStyledAttributes.getInt(17, WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID);
            int i4 = obtainStyledAttributes.getInt(5, 2100);
            String string = obtainStyledAttributes.getString(15);
            String string2 = obtainStyledAttributes.getString(14);
            int resourceId = obtainStyledAttributes.getResourceId(13, C0966R.C0971layout.f7116ys);
            obtainStyledAttributes.recycle();
            ((LayoutInflater) context2.getSystemService("layout_inflater")).inflate(resourceId, this.f56608a, true);
            C19871a aVar = new C19871a();
            LinearLayout linearLayout = (LinearLayout) this.f56608a.findViewById(C0966R.C0970id.hwj);
            this.f56614g = linearLayout;
            CalendarView calendarView = (CalendarView) this.f56608a.findViewById(C0966R.C0970id.apl);
            this.f56618k = calendarView;
            calendarView.setOnDateChangeListener(new C19872b());
            NumberPicker numberPicker = (NumberPicker) this.f56608a.findViewById(C0966R.C0970id.bz9);
            this.f56611d = numberPicker;
            numberPicker.setFormatter(new C57867t());
            numberPicker.setOnLongPressUpdateInterval(100);
            numberPicker.setOnValueChangedListener(aVar);
            this.f56615h = C19879s.m21607b(numberPicker);
            NumberPicker numberPicker2 = (NumberPicker) this.f56608a.findViewById(C0966R.C0970id.gyu);
            this.f56612e = numberPicker2;
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(this.f56621n - 1);
            numberPicker2.setDisplayedValues(this.f56620m);
            numberPicker2.setOnLongPressUpdateInterval(200);
            numberPicker2.setOnValueChangedListener(aVar);
            this.f56616i = C19879s.m21607b(numberPicker2);
            NumberPicker numberPicker3 = (NumberPicker) this.f56608a.findViewById(C0966R.C0970id.lvj);
            this.f56613f = numberPicker3;
            numberPicker3.setOnLongPressUpdateInterval(100);
            numberPicker3.setOnValueChangedListener(aVar);
            this.f56617j = C19879s.m21607b(numberPicker3);
            if (z || z2) {
                int i5 = 8;
                linearLayout.setVisibility(z ? 0 : 8);
                calendarView.setVisibility(z2 ? 0 : i5);
            } else {
                linearLayout.setVisibility(0);
            }
            this.f56622o.clear();
            if (TextUtils.isEmpty(string)) {
                this.f56622o.set(i3, 0, 1);
            } else if (!mo26520c(string, this.f56622o)) {
                this.f56622o.set(i3, 0, 1);
            }
            mo26524g(this.f56622o.getTimeInMillis());
            this.f56622o.clear();
            if (TextUtils.isEmpty(string2)) {
                this.f56622o.set(i4, 11, 31);
            } else if (!mo26520c(string2, this.f56622o)) {
                this.f56622o.set(i4, 11, 31);
            }
            mo26523f(this.f56622o.getTimeInMillis());
            this.f56625r.setTimeInMillis(System.currentTimeMillis());
            mo26521d(this.f56625r.get(1), this.f56625r.get(2), this.f56625r.get(5));
            mo26526i();
            mo26525h();
            linearLayout.removeAllViews();
            char[] dateFormatOrder = this.f56608a.getLayoutDirection() == 0 ? new char[]{'y', 'M', 'd'} : android.text.format.DateFormat.getDateFormatOrder(this.f56608a.getContext());
            int length = dateFormatOrder.length;
            for (int i6 = 0; i6 < length; i6++) {
                char c = dateFormatOrder[i6];
                if (c == 'M') {
                    this.f56614g.addView(this.f56612e);
                    mo26522e(this.f56612e, length, i6);
                } else if (c == 'd') {
                    this.f56614g.addView(this.f56611d);
                    mo26522e(this.f56611d, length, i6);
                } else if (c == 'y') {
                    this.f56614g.addView(this.f56613f);
                    mo26522e(this.f56613f, length, i6);
                } else {
                    throw new IllegalArgumentException(Arrays.toString(dateFormatOrder));
                }
            }
            if (this.f56608a.getImportantForAccessibility() == 0) {
                this.f56608a.setImportantForAccessibility(1);
            }
        }

        /* renamed from: a */
        public void mo26518a(Locale locale) {
            if (!locale.equals(this.f56610c)) {
                this.f56610c = locale;
            }
            this.f56622o = mo26519b(this.f56622o, locale);
            this.f56623p = mo26519b(this.f56623p, locale);
            this.f56624q = mo26519b(this.f56624q, locale);
            this.f56625r = mo26519b(this.f56625r, locale);
            this.f56621n = this.f56622o.getActualMaximum(2) + 1;
            String[] shortMonths = new DateFormatSymbols().getShortMonths();
            this.f56620m = shortMonths;
            if (Character.isDigit(shortMonths[0].charAt(0))) {
                this.f56620m = new String[this.f56621n];
                int i = 0;
                while (i < this.f56621n) {
                    int i2 = i + 1;
                    this.f56620m[i] = String.format("%d", new Object[]{Integer.valueOf(i2)});
                    i = i2;
                }
            }
        }

        /* renamed from: b */
        public final Calendar mo26519b(Calendar calendar, Locale locale) {
            if (calendar == null) {
                return Calendar.getInstance(locale);
            }
            long timeInMillis = calendar.getTimeInMillis();
            Calendar instance = Calendar.getInstance(locale);
            instance.setTimeInMillis(timeInMillis);
            return instance;
        }

        /* renamed from: c */
        public final boolean mo26520c(String str, Calendar calendar) {
            try {
                calendar.setTime(this.f56619l.parse(str));
                return true;
            } catch (ParseException unused) {
                int i = YADatePicker.f56603e;
                C85975v4.m106309f("YADatePicker", "Date: " + str + " not in format: " + "MM/dd/yyyy", new Object[0]);
                return false;
            }
        }

        /* renamed from: d */
        public final void mo26521d(int i, int i2, int i3) {
            this.f56625r.set(i, i2, i3);
            if (this.f56625r.before(this.f56623p)) {
                this.f56625r.setTimeInMillis(this.f56623p.getTimeInMillis());
            } else if (this.f56625r.after(this.f56624q)) {
                this.f56625r.setTimeInMillis(this.f56624q.getTimeInMillis());
            }
        }

        /* renamed from: e */
        public final void mo26522e(NumberPicker numberPicker, int i, int i2) {
            int i3 = i2 < i + -1 ? 5 : 6;
            EditText b = C19879s.m21607b(numberPicker);
            if (b != null) {
                b.setImeOptions(i3);
            }
        }

        /* renamed from: f */
        public void mo26523f(long j) {
            this.f56622o.setTimeInMillis(j);
            if (this.f56622o.get(1) != this.f56624q.get(1) || this.f56622o.get(6) == this.f56624q.get(6)) {
                this.f56624q.setTimeInMillis(j);
                this.f56618k.setMaxDate(j);
                if (this.f56625r.after(this.f56624q)) {
                    this.f56625r.setTimeInMillis(this.f56624q.getTimeInMillis());
                    mo26525h();
                }
                mo26526i();
            }
        }

        /* renamed from: g */
        public void mo26524g(long j) {
            this.f56622o.setTimeInMillis(j);
            if (this.f56622o.get(1) != this.f56623p.get(1) || this.f56622o.get(6) == this.f56623p.get(6)) {
                this.f56623p.setTimeInMillis(j);
                this.f56618k.setMinDate(j);
                if (this.f56625r.before(this.f56623p)) {
                    this.f56625r.setTimeInMillis(this.f56623p.getTimeInMillis());
                    mo26525h();
                }
                mo26526i();
            }
        }

        /* renamed from: h */
        public final void mo26525h() {
            this.f56618k.setDate(this.f56625r.getTimeInMillis(), false, false);
        }

        /* renamed from: i */
        public final void mo26526i() {
            if (this.f56625r.equals(this.f56623p)) {
                this.f56611d.setMinValue(this.f56625r.get(5));
                this.f56611d.setMaxValue(this.f56625r.getActualMaximum(5));
                this.f56611d.setWrapSelectorWheel(false);
                this.f56612e.setDisplayedValues((String[]) null);
                this.f56612e.setMinValue(this.f56625r.get(2));
                this.f56612e.setMaxValue(this.f56625r.getActualMaximum(2));
                this.f56612e.setWrapSelectorWheel(false);
            } else if (this.f56625r.equals(this.f56624q)) {
                this.f56611d.setMinValue(this.f56625r.getActualMinimum(5));
                this.f56611d.setMaxValue(this.f56625r.get(5));
                this.f56611d.setWrapSelectorWheel(false);
                this.f56612e.setDisplayedValues((String[]) null);
                this.f56612e.setMinValue(this.f56625r.getActualMinimum(2));
                this.f56612e.setMaxValue(this.f56625r.get(2));
                this.f56612e.setWrapSelectorWheel(false);
            } else {
                this.f56611d.setMinValue(1);
                this.f56611d.setMaxValue(this.f56625r.getActualMaximum(5));
                this.f56611d.setWrapSelectorWheel(true);
                this.f56612e.setDisplayedValues((String[]) null);
                this.f56612e.setMinValue(0);
                this.f56612e.setMaxValue(11);
                this.f56612e.setWrapSelectorWheel(true);
            }
            this.f56612e.setDisplayedValues((String[]) Arrays.copyOfRange(this.f56620m, this.f56612e.getMinValue(), this.f56612e.getMaxValue() + 1));
            this.f56613f.setMinValue(this.f56623p.get(1));
            this.f56613f.setMaxValue(this.f56624q.get(1));
            this.f56613f.setWrapSelectorWheel(false);
            this.f56613f.setValue(this.f56625r.get(1));
            this.f56612e.setValue(this.f56625r.get(2));
            this.f56611d.setValue(this.f56625r.get(5));
            if (Character.isDigit(this.f56620m[0].charAt(0))) {
                this.f56616i.setRawInputType(2);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.YADatePicker$e */
    public interface C19873e {
        /* renamed from: a */
        void mo26529a(YADatePicker yADatePicker, int i, int i2, int i3);
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.YADatePicker$f */
    public interface C19874f {
    }

    static {
        Class<YADatePicker> cls = YADatePicker.class;
    }

    public YADatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2777iu);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C19870d dVar = (C19870d) this.f56604d;
        accessibilityEvent.getText().add(DateUtils.formatDateTime(dVar.f56609b, dVar.f56625r.getTimeInMillis(), 20));
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public CharSequence getAccessibilityClassName() {
        return YADatePicker.class.getName();
    }

    public CalendarView getCalendarView() {
        return ((C19870d) this.f56604d).f56618k;
    }

    public boolean getCalendarViewShown() {
        return ((C19870d) this.f56604d).f56618k.getVisibility() == 0;
    }

    public int getDayOfMonth() {
        return ((C19870d) this.f56604d).f56625r.get(5);
    }

    public int getFirstDayOfWeek() {
        return ((C19870d) this.f56604d).f56618k.getFirstDayOfWeek();
    }

    public long getMaxDate() {
        C19870d dVar = (C19870d) this.f56604d;
        dVar.getClass();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(dVar.f56618k.getMaxDate());
        return instance.getTimeInMillis();
    }

    public long getMinDate() {
        C19870d dVar = (C19870d) this.f56604d;
        dVar.getClass();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(dVar.f56618k.getMinDate());
        return instance.getTimeInMillis();
    }

    public int getMonth() {
        return ((C19870d) this.f56604d).f56625r.get(2);
    }

    public boolean getSpinnersShown() {
        return ((C19870d) this.f56604d).f56614g.isShown();
    }

    public C19869c getUIDelegate() {
        return this.f56604d;
    }

    public int getYear() {
        return ((C19870d) this.f56604d).f56625r.get(1);
    }

    public boolean isEnabled() {
        return ((C19870d) this.f56604d).f56626s;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C19870d dVar = (C19870d) this.f56604d;
        dVar.getClass();
        dVar.mo26518a(configuration.locale);
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        C19870d dVar = (C19870d) this.f56604d;
        accessibilityEvent.getText().add(DateUtils.formatDateTime(dVar.f56609b, dVar.f56625r.getTimeInMillis(), 20));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        View.BaseSavedState baseSavedState = (View.BaseSavedState) parcelable;
        super.onRestoreInstanceState(baseSavedState.getSuperState());
        C19870d dVar = (C19870d) this.f56604d;
        dVar.getClass();
        SavedState savedState = (SavedState) baseSavedState;
        dVar.mo26521d(savedState.f56605d, savedState.f56606e, savedState.f56607f);
        dVar.mo26526i();
        dVar.mo26525h();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        C19870d dVar = (C19870d) this.f56604d;
        dVar.getClass();
        return new SavedState(onSaveInstanceState, dVar.f56625r.get(1), dVar.f56625r.get(2), dVar.f56625r.get(5), (C19867a) null);
    }

    public void setCalendarViewShown(boolean z) {
        ((C19870d) this.f56604d).f56618k.setVisibility(z ? 0 : 8);
    }

    public void setEnabled(boolean z) {
        if (((C19870d) this.f56604d).f56626s != z) {
            super.setEnabled(z);
            C19870d dVar = (C19870d) this.f56604d;
            dVar.f56611d.setEnabled(z);
            dVar.f56612e.setEnabled(z);
            dVar.f56613f.setEnabled(z);
            dVar.f56618k.setEnabled(z);
            dVar.f56626s = z;
        }
    }

    public void setFirstDayOfWeek(int i) {
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("firstDayOfWeek must be between 1 and 7");
        }
        ((C19870d) this.f56604d).f56618k.setFirstDayOfWeek(i);
    }

    public void setMaxDate(long j) {
        ((C19870d) this.f56604d).mo26523f(j);
    }

    public void setMinDate(long j) {
        ((C19870d) this.f56604d).mo26524g(j);
    }

    public void setSpinnersShown(boolean z) {
        ((C19870d) this.f56604d).f56614g.setVisibility(z ? 0 : 8);
    }

    public void setValidationCallback(C19874f fVar) {
        this.f56604d.getClass();
    }

    public YADatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f56604d = new C19870d(this, context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232403b, i, 0);
        int i2 = obtainStyledAttributes.getInt(6, 0);
        obtainStyledAttributes.recycle();
        if (i2 != 0) {
            setFirstDayOfWeek(i2);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.YADatePicker$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C19866a();

        /* renamed from: d */
        public final int f56605d;

        /* renamed from: e */
        public final int f56606e;

        /* renamed from: f */
        public final int f56607f;

        /* renamed from: com.tencent.mm.ui.widget.picker.YADatePicker$SavedState$a */
        public class C19866a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C19867a) null);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, int i, int i2, int i3, C19867a aVar) {
            super(parcelable);
            this.f56605d = i;
            this.f56606e = i2;
            this.f56607f = i3;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f56605d);
            parcel.writeInt(this.f56606e);
            parcel.writeInt(this.f56607f);
        }

        public SavedState(Parcel parcel, C19867a aVar) {
            super(parcel);
            this.f56605d = parcel.readInt();
            this.f56606e = parcel.readInt();
            this.f56607f = parcel.readInt();
        }
    }
}
