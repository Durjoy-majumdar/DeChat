package com.tencent.p014mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.picker.base.view.WheelView;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17925e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import of0.C21794b;
import p385u2.C111105a;
import pf0.C21966a;
import qf0.C22085f;
import rf0.C22230d;
import vt0.C22784g;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePickerV2 */
public class AppBrandTimePickerV2 implements C17925e<String> {
    private Context context;
    private int currentHour;
    private int currentMinute;
    private int mMaxTimeHour = -1;
    private int mMaxTimeMinute = -1;
    private int mMinTimeHour = -1;
    private int mMinTimeMinute = -1;
    private View mView;
    private C22230d pvTime;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePickerV2$a */
    public class C2057a implements C22085f {
        public C2057a() {
        }

        /* renamed from: a */
        public void mo1989a(Date date) {
            AppBrandTimePickerV2.this.getTimeString(date);
        }
    }

    public AppBrandTimePickerV2(Context context2) {
        this.pvTime = new C22230d(context2);
        this.context = context2;
    }

    private void configPadding(List<WheelView> list) {
        if (list.size() == 1) {
            list.get(0).setPadding(0, this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
        } else if (list.size() == 2) {
            list.get(0).setPadding(0, this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
            list.get(1).setPadding(this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
        } else if (list.size() == 3) {
            list.get(0).setPadding(0, this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
            list.get(1).setPadding(this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
            list.get(2).setPadding(this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
        }
    }

    /* access modifiers changed from: private */
    public void getTimeString(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        this.currentHour = instance.get(11);
        this.currentMinute = instance.get(12);
    }

    public View getView() {
        if (this.mView == null) {
            this.mView = this.pvTime.mo35389e();
        }
        return this.mView;
    }

    public void init(int i, int i2) {
        Calendar instance = Calendar.getInstance();
        instance.set(11, i);
        instance.set(12, i2);
        Calendar instance2 = Calendar.getInstance();
        instance2.set(11, this.mMinTimeHour);
        instance2.set(12, this.mMinTimeMinute);
        Calendar instance3 = Calendar.getInstance();
        instance3.set(11, this.mMaxTimeHour);
        instance3.set(12, this.mMaxTimeMinute);
        C21794b bVar = new C21794b(this.context, new C2057a());
        C21966a aVar = bVar.f61767a;
        aVar.f62190g = new boolean[]{false, false, false, true, true, false};
        aVar.f62191h = instance;
        aVar.f62192i = instance2;
        aVar.f62193j = instance3;
        aVar.f62189f = false;
        bVar.f61767a.f62195l = C111105a.m151500b(this.context, C0966R.color.BW_0_Alpha_0_1);
        bVar.mo34202a(this.pvTime);
        this.pvTime.mo35392h((float) this.context.getResources().getDimensionPixelSize(C0966R.dimen.f4175v5));
        C22230d dVar = this.pvTime;
        this.context.getResources().getDimensionPixelSize(C0966R.dimen.aja);
        dVar.f62981p.getClass();
        this.pvTime.mo35393i(0, this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
        Iterator it = ((ArrayList) this.pvTime.mo35390f()).iterator();
        while (it.hasNext()) {
            WheelView wheelView = (WheelView) it.next();
            wheelView.mo22032e(C111105a.m151500b(this.context, C0966R.color.BW_0_Alpha_0_9));
            wheelView.f49141d = this.context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
            wheelView.invalidate();
            wheelView.setBackgroundColor(C111105a.m151500b(this.context, C0966R.color.f2932f));
        }
        configPadding(this.pvTime.mo35390f());
    }

    public boolean isNewPicker() {
        return true;
    }

    public void onAttach(C22784g gVar) {
    }

    public void onDetach(C22784g gVar) {
    }

    public void onHide(C22784g gVar) {
    }

    public void onShow(C22784g gVar) {
    }

    public void setMaxTime(int i, int i2) {
        this.mMaxTimeHour = i;
        this.mMaxTimeMinute = i2;
    }

    public void setMinTime(int i, int i2) {
        this.mMinTimeHour = i;
        this.mMinTimeMinute = i2;
    }

    public String currentValue() {
        this.pvTime.mo35391g();
        return String.format(Locale.US, "%02d:%02d", new Object[]{Integer.valueOf(this.currentHour), Integer.valueOf(this.currentMinute)});
    }
}
