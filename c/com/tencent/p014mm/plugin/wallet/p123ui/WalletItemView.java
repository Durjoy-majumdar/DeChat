package com.tencent.p014mm.plugin.wallet.p123ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import tb3.C77881d;

/* renamed from: com.tencent.mm.plugin.wallet.ui.WalletItemView */
public class WalletItemView extends LinearLayout {

    /* renamed from: d */
    public TextView f21832d;

    /* renamed from: e */
    public TextView f21833e;

    /* renamed from: f */
    public String f21834f;

    /* renamed from: g */
    public String f21835g;

    /* renamed from: h */
    public int f21836h;

    public WalletItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f21836h = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77881d.f226914h, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            this.f21834f = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId2 != 0) {
            this.f21835g = context.getString(resourceId2);
        }
        this.f21836h = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f360059cf3, this, true);
        this.f21832d = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
        this.f21833e = (TextView) inflate.findViewById(C0966R.C0970id.ka6);
        TextView textView = this.f21832d;
        if (textView != null) {
            textView.setText(this.f21834f);
        }
        TextView textView2 = this.f21833e;
        if (textView2 != null) {
            textView2.setText(this.f21835g);
            this.f21833e.setLines(this.f21836h);
        }
    }

    public Object getData() {
        return null;
    }

    public int getType() {
        return 0;
    }

    public void setSummary(String str) {
        this.f21835g = str;
        this.f21833e.setText(str);
    }

    public void setTitle(String str) {
        this.f21834f = str;
        this.f21832d.setText(str);
    }

    public void setSummary(Spanned spanned) {
        String obj = spanned.toString();
        this.f21835g = obj;
        this.f21833e.setText(obj);
    }

    public WalletItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
