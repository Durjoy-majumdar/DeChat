package com.tencent.p014mm.plugin.product.p087ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.product.ui.e */
public class C70107e extends BaseAdapter {

    /* renamed from: d */
    public final Context f202377d;

    /* renamed from: e */
    public final int f202378e;

    /* renamed from: f */
    public List<String> f202379f;

    /* renamed from: g */
    public int f202380g = -1;

    public C70107e(Context context, int i) {
        this.f202377d = context;
        this.f202378e = i;
    }

    public int getCount() {
        List<String> list = this.f202379f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = View.inflate(this.f202377d, C0966R.C0971layout.be7, (ViewGroup) null);
            C70108f fVar = new C70108f();
            fVar.f202381a = (TextView) view.findViewById(C0966R.C0970id.khj);
            fVar.f202382b = (CheckBox) view.findViewById(C0966R.C0970id.b_4);
            fVar.f202383c = (RadioButton) view.findViewById(C0966R.C0970id.f359003ic1);
            view.setTag(fVar);
        }
        C70108f fVar2 = (C70108f) view.getTag();
        fVar2.f202381a.setText(this.f202379f.get(i));
        int i2 = this.f202378e;
        boolean z = true;
        if (i2 == 1) {
            fVar2.f202382b.setVisibility(8);
            fVar2.f202383c.setVisibility(0);
            RadioButton radioButton = fVar2.f202383c;
            if (i != this.f202380g) {
                z = false;
            }
            radioButton.setChecked(z);
        } else if (i2 != 2) {
            fVar2.f202382b.setVisibility(8);
            fVar2.f202383c.setVisibility(8);
        } else {
            fVar2.f202382b.setVisibility(0);
            fVar2.f202383c.setVisibility(8);
            CheckBox checkBox = fVar2.f202382b;
            if (i != this.f202380g) {
                z = false;
            }
            checkBox.setChecked(z);
        }
        return view;
    }
}
