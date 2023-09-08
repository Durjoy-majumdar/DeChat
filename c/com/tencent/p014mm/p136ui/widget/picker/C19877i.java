package com.tencent.p014mm.p136ui.widget.picker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.picker.base.view.WheelView;
import com.tencent.wxmm.v2helper;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import of0.C21794b;
import p385u2.C111105a;
import pf0.C21966a;
import rf0.C22230d;
import rf0.C22236j;

/* renamed from: com.tencent.mm.ui.widget.picker.i */
public class C19877i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public C104428a f56630d = new C104428a(this.f56632f, 0);

    /* renamed from: e */
    public View f56631e;

    /* renamed from: f */
    public Context f56632f;

    /* renamed from: g */
    public int f56633g;

    /* renamed from: h */
    public BottomSheetBehavior f56634h;

    /* renamed from: i */
    public LinearLayout f56635i;

    /* renamed from: j */
    public LinearLayout f56636j;

    /* renamed from: n */
    public CustomDatePickerNew f56637n;

    /* renamed from: o */
    public C19878a f56638o;

    /* renamed from: com.tencent.mm.ui.widget.picker.i$a */
    public interface C19878a<T> {
        void onResult(boolean z, int i, int i2, int i3);
    }

    public C19877i(Context context) {
        this.f56632f = context;
        View inflate = View.inflate(this.f56632f, C0966R.C0971layout.f7117yt, (ViewGroup) null);
        this.f56631e = inflate;
        this.f56635i = (LinearLayout) inflate.findViewById(C0966R.C0970id.f357831bz3);
        this.f56636j = (LinearLayout) this.f56631e.findViewById(C0966R.C0970id.bz5);
        this.f56637n = new CustomDatePickerNew(this.f56632f);
        this.f56635i.removeAllViews();
        this.f56635i.setGravity(17);
        this.f56635i.addView(this.f56637n.getView(), new LinearLayout.LayoutParams(-1, -1));
        ((Button) this.f56631e.findViewById(C0966R.C0970id.hll)).setOnClickListener(new C74997d(this));
        ((Button) this.f56631e.findViewById(C0966R.C0970id.apy)).setOnClickListener(new C74998e(this));
        ((Button) this.f56631e.findViewById(C0966R.C0970id.amg)).setOnClickListener(new C74999f(this));
        this.f56630d.setContentView(this.f56631e);
        this.f56630d.setOnCancelListener(new C75000g(this));
        this.f56633g = C74942w4.m89784a(this.f56632f, v2helper.EMethodSetPlayerPreCorrectCofOn);
        BottomSheetBehavior y = BottomSheetBehavior.m139527y((View) this.f56631e.getParent());
        this.f56634h = y;
        if (y != null) {
            y.mo146383A(this.f56633g);
            this.f56634h.f309230p = false;
        }
        this.f56630d.setOnDismissListener(new C75001h(this));
    }

    /* renamed from: a */
    public String mo26531a() {
        CustomDatePickerNew customDatePickerNew = this.f56637n;
        if (customDatePickerNew == null) {
            return null;
        }
        customDatePickerNew.f56572e.mo35391g();
        if (customDatePickerNew.f56579o) {
            return String.format(Locale.US, "%04d-%02d-%02d", new Object[]{Integer.valueOf(customDatePickerNew.f56576i), Integer.valueOf(customDatePickerNew.f56577j), Integer.valueOf(customDatePickerNew.f56578n)});
        } else if (customDatePickerNew.f56580p) {
            return String.format(Locale.US, "%04d-%02d", new Object[]{Integer.valueOf(customDatePickerNew.f56576i), Integer.valueOf(customDatePickerNew.f56577j)});
        } else {
            return String.format(Locale.US, "%04d", new Object[]{Integer.valueOf(customDatePickerNew.f56576i)});
        }
    }

    /* renamed from: b */
    public void mo26532b() {
        C104428a aVar = this.f56630d;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: c */
    public void mo26533c(int i, int i2, int i3) {
        CustomDatePickerNew customDatePickerNew;
        if (i >= 0 && i2 >= 0 && i3 >= 0 && (customDatePickerNew = this.f56637n) != null) {
            customDatePickerNew.f56582r = i;
            customDatePickerNew.f56583s = i2;
            customDatePickerNew.f56584t = i3;
            if (customDatePickerNew.f56571d == null) {
                customDatePickerNew.f56571d = customDatePickerNew.f56572e.mo35389e();
            }
        }
    }

    /* renamed from: d */
    public void mo26534d(int i, int i2, int i3) {
        if (i >= 0 && i2 >= 0 && i3 >= 0) {
            Calendar instance = Calendar.getInstance(Locale.US);
            instance.set(i, i2 - 1, i3);
            CustomDatePickerNew customDatePickerNew = this.f56637n;
            if (customDatePickerNew != null) {
                customDatePickerNew.setMaxDate(Long.valueOf(instance.getTimeInMillis()));
            }
        }
    }

    /* renamed from: e */
    public void mo26535e(int i, int i2, int i3) {
        if (i >= 0 && i2 >= 0 && i3 >= 0) {
            Calendar instance = Calendar.getInstance(Locale.US);
            instance.set(i, i2 - 1, i3);
            CustomDatePickerNew customDatePickerNew = this.f56637n;
            if (customDatePickerNew != null) {
                customDatePickerNew.setMinDate(Long.valueOf(instance.getTimeInMillis()));
            }
        }
    }

    /* renamed from: f */
    public void mo26536f() {
        if (this.f56630d != null) {
            CustomDatePickerNew customDatePickerNew = this.f56637n;
            if (customDatePickerNew != null) {
                if (customDatePickerNew.f56585u) {
                    customDatePickerNew.f56582r++;
                }
                Calendar instance = Calendar.getInstance();
                instance.set(customDatePickerNew.f56582r, customDatePickerNew.f56583s - 1, customDatePickerNew.f56584t);
                Calendar instance2 = Calendar.getInstance();
                if (customDatePickerNew.f56574g == null) {
                    customDatePickerNew.f56574g = new Date(instance.getTimeInMillis());
                }
                instance2.setTime(customDatePickerNew.f56574g);
                Calendar instance3 = Calendar.getInstance();
                if (customDatePickerNew.f56575h == null) {
                    Calendar instance4 = Calendar.getInstance();
                    instance4.set(customDatePickerNew.f56582r + 100, customDatePickerNew.f56583s - 1, customDatePickerNew.f56584t);
                    customDatePickerNew.f56575h = new Date(instance4.getTimeInMillis());
                }
                instance3.setTime(customDatePickerNew.f56575h);
                C22230d dVar = customDatePickerNew.f56572e;
                boolean z = customDatePickerNew.f56585u;
                dVar.f62984s = z;
                C22236j jVar = dVar.f62981p;
                if (jVar != null) {
                    jVar.f63019w = z;
                }
                C21794b bVar = new C21794b(customDatePickerNew.f56573f, new C19876b(customDatePickerNew));
                C19875a aVar = new C19875a(customDatePickerNew);
                C21966a aVar2 = bVar.f61767a;
                aVar2.f62186c = aVar;
                aVar2.f62189f = false;
                aVar2.f62190g = new boolean[]{customDatePickerNew.f56581q, customDatePickerNew.f56580p, customDatePickerNew.f56579o, false, false, false};
                aVar2.f62191h = instance;
                aVar2.f62192i = instance2;
                aVar2.f62193j = instance3;
                bVar.f61767a.f62198o = customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
                bVar.mo34202a(customDatePickerNew.f56572e);
                customDatePickerNew.f56572e.mo35392h((float) customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f4175v5));
                C22230d dVar2 = customDatePickerNew.f56572e;
                customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
                dVar2.f62981p.getClass();
                C22230d dVar3 = customDatePickerNew.f56572e;
                boolean z2 = customDatePickerNew.f56585u;
                C22236j jVar2 = dVar3.f62981p;
                if (jVar2 != null) {
                    jVar2.f63019w = z2;
                    jVar2.f63005i.f60037g = z2;
                    jVar2.f62998b.setLongTermYear(z2);
                    jVar2.f62999c.setLongTermMonthDay(z2);
                    jVar2.f63000d.setLongTermMonthDay(z2);
                }
                customDatePickerNew.f56572e.f62981p.mo35399f(C111105a.m151500b(customDatePickerNew.f56573f, C0966R.color.BW_0_Alpha_0_1));
                customDatePickerNew.f56572e.mo35393i(0, customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                Iterator it = ((ArrayList) customDatePickerNew.f56572e.mo35390f()).iterator();
                int i = 0;
                while (it.hasNext()) {
                    WheelView wheelView = (WheelView) it.next();
                    if (!customDatePickerNew.f56585u || customDatePickerNew.f56582r != 2 || i <= 0) {
                        wheelView.mo22032e(C111105a.m151500b(customDatePickerNew.f56573f, C0966R.color.BW_0_Alpha_0_9));
                        wheelView.f49141d = customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
                        wheelView.invalidate();
                        wheelView.setBackgroundColor(C111105a.m151500b(customDatePickerNew.f56573f, C0966R.color.f2932f));
                    } else {
                        wheelView.mo22032e(0);
                        wheelView.f49141d = customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
                        wheelView.invalidate();
                        wheelView.setBackgroundColor(C111105a.m151500b(customDatePickerNew.f56573f, C0966R.color.f2932f));
                    }
                    i++;
                }
                ArrayList arrayList = (ArrayList) customDatePickerNew.f56572e.mo35390f();
                if (arrayList.size() == 1) {
                    ((WheelView) arrayList.get(0)).setPadding(0, customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                } else if (arrayList.size() == 2) {
                    ((WheelView) arrayList.get(0)).setPadding(0, customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                    ((WheelView) arrayList.get(1)).setPadding(customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                } else if (arrayList.size() == 3) {
                    ((WheelView) arrayList.get(0)).setPadding(0, customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                    ((WheelView) arrayList.get(1)).setPadding(customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                    ((WheelView) arrayList.get(2)).setPadding(customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, customDatePickerNew.f56573f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                }
            }
            this.f56630d.show();
        }
    }

    public void onGlobalLayout() {
    }
}
