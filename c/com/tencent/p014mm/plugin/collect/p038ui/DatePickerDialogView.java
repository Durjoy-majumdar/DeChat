package com.tencent.p014mm.plugin.collect.p038ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.MMSpinnerDatePicker;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.collect.ui.DatePickerDialogView */
public class DatePickerDialogView extends LinearLayout implements View.OnClickListener {

    /* renamed from: d */
    public CollectRadioBtnView f52277d;

    /* renamed from: e */
    public CollectRadioBtnView f52278e;

    /* renamed from: f */
    public CollectRadioBtnView f52279f;

    /* renamed from: g */
    public MMSpinnerDatePicker f52280g;

    /* renamed from: h */
    public TextView f52281h;

    /* renamed from: i */
    public TextView f52282i;

    /* renamed from: j */
    public int f52283j = 0;

    public DatePickerDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo23520a(context);
    }

    /* renamed from: a */
    public final void mo23520a(Context context) {
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.f7011uv, this);
        this.f52277d = (CollectRadioBtnView) inflate.findViewById(C0966R.C0970id.lvk);
        this.f52278e = (CollectRadioBtnView) inflate.findViewById(C0966R.C0970id.gyv);
        this.f52279f = (CollectRadioBtnView) inflate.findViewById(C0966R.C0970id.bz_);
        this.f52281h = (TextView) inflate.findViewById(C0966R.C0970id.f357756bl2);
        this.f52282i = (TextView) inflate.findViewById(C0966R.C0970id.apy);
        this.f52277d.setOnClickListener(this);
        this.f52278e.setOnClickListener(this);
        this.f52279f.setOnClickListener(this);
        this.f52277d.setTitleText("年");
        this.f52278e.setTitleText("月");
        this.f52279f.setTitleText("日");
        MMSpinnerDatePicker mMSpinnerDatePicker = (MMSpinnerDatePicker) inflate.findViewById(C0966R.C0970id.bz8);
        this.f52280g = mMSpinnerDatePicker;
        mMSpinnerDatePicker.getClass();
        try {
            Field declaredField = NumberPicker.class.getDeclaredField("mSelectionDivider");
            declaredField.setAccessible(true);
            ColorDrawable colorDrawable = new ColorDrawable();
            colorDrawable.setColor(mMSpinnerDatePicker.getResources().getColor(C0966R.color.ahf));
            declaredField.set(mMSpinnerDatePicker.f56476d, colorDrawable);
            declaredField.set(mMSpinnerDatePicker.f56477e, colorDrawable);
            declaredField.set(mMSpinnerDatePicker.f56478f, colorDrawable);
            mMSpinnerDatePicker.invalidate();
        } catch (IllegalAccessException e) {
            Log.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", e, "", new Object[0]);
        } catch (NoSuchFieldException e2) {
            Log.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", e2, "", new Object[0]);
        }
        this.f52280g.setTextSize(C0966R.dimen.f3927j7);
    }

    /* renamed from: b */
    public final void mo23521b() {
        int i = this.f52283j;
        if (i == 2) {
            this.f52277d.setRadioSrc(C0966R.raw.radio_on);
            this.f52278e.setRadioSrc(C0966R.raw.radio_off);
            this.f52279f.setRadioSrc(C0966R.raw.radio_off);
        } else if (i == 1) {
            this.f52277d.setRadioSrc(C0966R.raw.radio_off);
            this.f52278e.setRadioSrc(C0966R.raw.radio_on);
            this.f52279f.setRadioSrc(C0966R.raw.radio_off);
        } else {
            this.f52277d.setRadioSrc(C0966R.raw.radio_off);
            this.f52278e.setRadioSrc(C0966R.raw.radio_off);
            this.f52279f.setRadioSrc(C0966R.raw.radio_on);
        }
        this.f52280g.setPickerMode(this.f52283j);
    }

    public int getDatePickerMode() {
        return this.f52280g.getPickerMode();
    }

    public int getDayOfMonth() {
        return this.f52280g.getDayOfMonth();
    }

    public int getMonth() {
        return this.f52280g.getMonth();
    }

    public int getYear() {
        return this.f52280g.getYear();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/collect/ui/DatePickerDialogView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id = view.getId();
        if (id == C0966R.C0970id.lvk) {
            this.f52283j = 2;
        } else if (id == C0966R.C0970id.gyv) {
            this.f52283j = 1;
        } else if (id == C0966R.C0970id.bz_) {
            this.f52283j = 0;
        } else {
            Log.m105925i("MicroMsg.DatePickerDialogView", "unhandled click view: %s", view.getClass().toString());
        }
        mo23521b();
        C117292a.m165361g(this, "com/tencent/mm/plugin/collect/ui/DatePickerDialogView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void setDatePickerMode(int i) {
        this.f52283j = i;
        mo23521b();
    }

    public void setOnCancelBtnClickListener(View.OnClickListener onClickListener) {
        this.f52282i.setOnClickListener(onClickListener);
    }

    public void setOnOkBtnClickListener(View.OnClickListener onClickListener) {
        this.f52281h.setOnClickListener(onClickListener);
    }

    public DatePickerDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo23520a(context);
    }
}
