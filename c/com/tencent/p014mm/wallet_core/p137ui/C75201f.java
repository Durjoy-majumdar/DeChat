package com.tencent.p014mm.wallet_core.p137ui;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.DatePicker;
import com.tencent.p014mm.C0966R;
import com.tenpay.android.wechat.TenpaySecureEditText;
import eb0.C75592q0;
import go3.C20836t;
import j20.C117292a;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import nj3.C76879j;

/* renamed from: com.tencent.mm.wallet_core.ui.f */
public class C75201f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EditHintView f221244d;

    /* renamed from: com.tencent.mm.wallet_core.ui.f$a */
    public class C75202a implements DatePickerDialog.OnDateSetListener {
        public C75202a() {
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            EditHintView editHintView = C75201f.this.f221244d;
            if (i >= editHintView.f221147G || i2 >= editHintView.f221148H) {
                DecimalFormat decimalFormat = new DecimalFormat("00");
                if (C75592q0.m90763K()) {
                    EditHintView editHintView2 = C75201f.this.f221244d;
                    editHintView2.f221144D = decimalFormat.format((long) (i2 + 1)) + i;
                } else {
                    EditHintView editHintView3 = C75201f.this.f221244d;
                    editHintView3.f221144D = decimalFormat.format((long) i).substring(2) + decimalFormat.format((long) (i2 + 1));
                }
                TenpaySecureEditText tenpaySecureEditText = C75201f.this.f221244d.f221154g;
                tenpaySecureEditText.setText(decimalFormat.format((long) (i2 + 1)) + decimalFormat.format((long) i).substring(2));
            } else {
                C76879j.m92748s(editHintView.getContext(), C75201f.this.f221244d.getContext().getString(C0966R.string.ksm), (String) null);
            }
            EditHintView editHintView4 = C75201f.this.f221244d;
            editHintView4.f221166v = editHintView4.mo104896a();
            C75201f.this.f221244d.getClass();
        }
    }

    public C75201f(EditHintView editHintView) {
        this.f221244d = editHintView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/wallet_core/ui/EditHintView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f221244d.f221146F == null) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(System.currentTimeMillis());
            instance.add(2, 1);
            this.f221244d.f221147G = instance.get(1);
            this.f221244d.f221148H = instance.get(2);
            EditHintView editHintView = this.f221244d;
            Context context = this.f221244d.getContext();
            C75202a aVar = new C75202a();
            EditHintView editHintView2 = this.f221244d;
            editHintView.f221146F = new C20836t(context, 3, aVar, editHintView2.f221147G, editHintView2.f221148H, instance.get(5), instance.getTimeInMillis());
        }
        this.f221244d.f221146F.show();
        C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/EditHintView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
