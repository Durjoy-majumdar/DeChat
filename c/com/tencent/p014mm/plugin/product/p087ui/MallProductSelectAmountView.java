package com.tencent.p014mm.plugin.product.p087ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.product.p087ui.MallProductSelectSkuUI;

/* renamed from: com.tencent.mm.plugin.product.ui.MallProductSelectAmountView */
public class MallProductSelectAmountView extends LinearLayout {

    /* renamed from: d */
    public TextView f202282d = null;

    /* renamed from: e */
    public ImageView f202283e = null;

    /* renamed from: f */
    public ImageView f202284f = null;

    /* renamed from: g */
    public int f202285g = Integer.MAX_VALUE;

    /* renamed from: h */
    public int f202286h = 1;

    /* renamed from: i */
    public int f202287i = 1;

    /* renamed from: j */
    public int f202288j = 1;

    /* renamed from: n */
    public C70080a f202289n = null;

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductSelectAmountView$a */
    public interface C70080a {
    }

    public MallProductSelectAmountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bo8, this, true);
        this.f202282d = (TextView) inflate.findViewById(C0966R.C0970id.gmt);
        this.f202283e = (ImageView) inflate.findViewById(C0966R.C0970id.gms);
        this.f202284f = (ImageView) inflate.findViewById(C0966R.C0970id.gmy);
        TextView textView = this.f202282d;
        textView.setText("" + this.f202288j);
        this.f202283e.setOnClickListener(new C70114l(this));
        this.f202284f.setOnClickListener(new C70115m(this));
    }

    /* renamed from: a */
    public final boolean mo96462a() {
        int i = this.f202288j;
        int i2 = this.f202285g;
        if (i > i2) {
            this.f202288j = i2;
            C70080a aVar = this.f202289n;
            if (aVar != null) {
                ((MallProductSelectSkuUI.C70083c) aVar).mo96470a(i2);
            }
            C70080a aVar2 = this.f202289n;
            if (aVar2 != null) {
                ((MallProductSelectSkuUI.C70083c) aVar2).mo96471b(this.f202288j, this.f202286h);
            }
            TextView textView = this.f202282d;
            textView.setText("" + this.f202288j);
            return false;
        }
        int i3 = this.f202287i;
        if (i > i3) {
            this.f202284f.setEnabled(true);
        } else if (i == i3) {
            this.f202284f.setEnabled(false);
        } else {
            this.f202284f.setEnabled(false);
            int i4 = this.f202287i;
            this.f202288j = i4;
            C70080a aVar3 = this.f202289n;
            if (aVar3 != null) {
                ((MallProductSelectSkuUI.C70083c) aVar3).mo96470a(i4);
            }
            C70080a aVar4 = this.f202289n;
            if (aVar4 != null) {
                ((MallProductSelectSkuUI.C70083c) aVar4).mo96471b(this.f202288j, 2);
            }
            TextView textView2 = this.f202282d;
            textView2.setText("" + this.f202288j);
            return false;
        }
        return true;
    }

    public void setAddEnable(boolean z) {
        this.f202283e.setEnabled(z);
    }

    public void setAmount(int i) {
        this.f202288j = i;
        if (mo96462a()) {
            TextView textView = this.f202282d;
            textView.setText("" + this.f202288j);
            C70080a aVar = this.f202289n;
            if (aVar != null) {
                ((MallProductSelectSkuUI.C70083c) aVar).mo96470a(this.f202288j);
            }
        }
    }

    public void setMinAmount(int i) {
        this.f202287i = i;
        mo96462a();
    }

    public void setOnAmountChangeListener(C70080a aVar) {
        this.f202289n = aVar;
    }

    public void setRemoveEnable(boolean z) {
        this.f202284f.setEnabled(z);
    }
}
