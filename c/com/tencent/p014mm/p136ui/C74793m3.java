package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.m3 */
public class C74793m3 extends LinearLayout {

    /* renamed from: d */
    public Context f219917d;

    /* renamed from: e */
    public EditText f219918e;

    /* renamed from: f */
    public ImageButton f219919f;

    /* renamed from: g */
    public String f219920g;

    /* renamed from: h */
    public C74794a f219921h;

    /* renamed from: com.tencent.mm.ui.m3$a */
    public interface C74794a {
        void onClickBackBtn(View view);
    }

    public C74793m3(Context context) {
        super(context);
        this.f219917d = context;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f6307b9, this, true);
        ((ImageView) findViewById(C0966R.C0970id.f5471g1)).setOnClickListener(new C74786j3(this));
        EditText editText = (EditText) findViewById(C0966R.C0970id.j5d);
        this.f219918e = editText;
        editText.requestFocus();
        ImageButton imageButton = (ImageButton) findViewById(C0966R.C0970id.bde);
        this.f219919f = imageButton;
        imageButton.setOnClickListener(new C74788k3(this));
        this.f219918e.addTextChangedListener(new C74791l3(this));
    }

    public EditText getSearchEditText() {
        return this.f219918e;
    }

    public void setHint(String str) {
        this.f219920g = str;
    }

    public void setSearchViewListener(C74794a aVar) {
        this.f219921h = aVar;
    }
}
