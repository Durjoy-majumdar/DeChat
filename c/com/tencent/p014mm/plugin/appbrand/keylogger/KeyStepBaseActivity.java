package com.tencent.p014mm.plugin.appbrand.keylogger;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.KeyStepBaseActivity */
public abstract class KeyStepBaseActivity extends HellActivity {

    /* renamed from: d */
    public TextView f11789d;

    public abstract int getLayoutId();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0966R.C0971layout.f6322br);
        LayoutInflater.from(this).inflate(getLayoutId(), (FrameLayout) findViewById(C0966R.C0970id.br8));
        this.f11789d = (TextView) findViewById(C0966R.C0970id.f5468fy);
        findViewById(C0966R.C0970id.f5471g1).setOnClickListener(new C1917k(this));
    }
}
