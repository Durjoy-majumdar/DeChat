package com.tencent.p014mm.plugin.soter.p322ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import rv2.C118236a;
import rv2.C118237b;
import rv2.C118238c;
import rv2.C118239d;
import rv2.C118240e;
import rv2.C118241f;
import rv2.C118242g;
import rv2.C22253h;

/* renamed from: com.tencent.mm.plugin.soter.ui.SoterTestUI */
public class SoterTestUI extends MMActivity {

    /* renamed from: d */
    public Button f347289d = null;

    /* renamed from: e */
    public Button f347290e = null;

    /* renamed from: f */
    public Button f347291f = null;

    /* renamed from: g */
    public Button f347292g = null;

    /* renamed from: h */
    public Button f347293h = null;

    /* renamed from: i */
    public Button f347294i = null;

    /* renamed from: j */
    public Button f347295j = null;

    /* renamed from: n */
    public Button f347296n = null;

    /* renamed from: o */
    public TextView f347297o = null;

    public int getLayoutId() {
        return C0966R.C0971layout.c5f;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f347289d = (Button) findViewById(C0966R.C0970id.jyi);
        this.f347290e = (Button) findViewById(C0966R.C0970id.jyd);
        this.f347291f = (Button) findViewById(C0966R.C0970id.jyh);
        this.f347292g = (Button) findViewById(C0966R.C0970id.jyf);
        this.f347293h = (Button) findViewById(C0966R.C0970id.jyc);
        this.f347294i = (Button) findViewById(C0966R.C0970id.jyg);
        this.f347295j = (Button) findViewById(C0966R.C0970id.jye);
        this.f347296n = (Button) findViewById(C0966R.C0970id.jyb);
        Button button = (Button) findViewById(C0966R.C0970id.jya);
        this.f347297o = (TextView) findViewById(C0966R.C0970id.f359089is1);
        this.f347289d.setOnClickListener(new C118236a(this));
        this.f347290e.setOnClickListener(new C118237b(this));
        this.f347291f.setOnClickListener(new C118238c(this));
        this.f347292g.setOnClickListener(new C118239d(this));
        this.f347293h.setOnClickListener(new C118240e(this));
        this.f347294i.setOnClickListener(new C118241f(this));
        this.f347295j.setOnClickListener(new C118242g(this));
        this.f347296n.setOnClickListener(new C22253h(this));
    }
}
