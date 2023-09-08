package io3;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: io3.a */
public class C9232a extends LinearLayout {

    /* renamed from: d */
    public TextView f28974d = ((TextView) findViewById(C0966R.C0970id.knx));

    public C9232a(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f6658l0, this);
    }

    public void setTitle(String str) {
        this.f28974d.setText(str);
    }
}
