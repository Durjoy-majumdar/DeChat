package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.widget.MMDatePickerView */
public class MMDatePickerView extends LinearLayout implements View.OnClickListener {

    /* renamed from: d */
    public Button f24816d;

    /* renamed from: e */
    public Button f24817e;

    /* renamed from: f */
    public Button f24818f;

    /* renamed from: g */
    public MMSpinnerDatePicker f24819g;

    public MMDatePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo8081a(context);
    }

    /* renamed from: a */
    public final void mo8081a(Context context) {
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.bcd, this);
        this.f24816d = (Button) inflate.findViewById(C0966R.C0970id.lvk);
        this.f24817e = (Button) inflate.findViewById(C0966R.C0970id.gyv);
        this.f24818f = (Button) inflate.findViewById(C0966R.C0970id.bz_);
        this.f24819g = (MMSpinnerDatePicker) inflate.findViewById(C0966R.C0970id.f358754gv3);
        this.f24816d.setOnClickListener(this);
        this.f24817e.setOnClickListener(this);
        this.f24818f.setOnClickListener(this);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/MMDatePickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id = view.getId();
        if (id == C0966R.C0970id.lvk) {
            this.f24819g.setPickerMode(0);
        } else if (id == C0966R.C0970id.gyv) {
            this.f24819g.setPickerMode(1);
        } else {
            this.f24819g.setPickerMode(2);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/MMDatePickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public MMDatePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo8081a(context);
    }
}
