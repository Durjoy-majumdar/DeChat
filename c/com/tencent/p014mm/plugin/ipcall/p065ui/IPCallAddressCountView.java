package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAddressCountView */
public class IPCallAddressCountView extends FrameLayout {

    /* renamed from: d */
    public View f19429d;

    /* renamed from: e */
    public TextView f19430e;

    public IPCallAddressCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo5498a();
    }

    /* renamed from: a */
    public final void mo5498a() {
        View.inflate(getContext(), C0966R.C0971layout.f359835b22, this);
        this.f19429d = findViewById(C0966R.C0970id.bmn);
        this.f19430e = (TextView) findViewById(C0966R.C0970id.bmm);
    }

    public void setAddressCount(int i) {
        this.f19430e.setText(getContext().getResources().getQuantityString(C0966R.plurals.f7221b, i, new Object[]{Integer.valueOf(i)}));
    }

    public IPCallAddressCountView(Context context, int i) {
        super(context);
        mo5498a();
        setAddressCount(i);
    }
}
