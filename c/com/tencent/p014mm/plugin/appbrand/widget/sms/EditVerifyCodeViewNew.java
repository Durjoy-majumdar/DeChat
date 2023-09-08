package com.tencent.p014mm.plugin.appbrand.widget.sms;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import zt0.C79432c;
import zt0.C79433d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew */
public class EditVerifyCodeViewNew extends RelativeLayout {

    /* renamed from: h */
    public static final /* synthetic */ int f197418h = 0;

    /* renamed from: d */
    public Context f197419d;

    /* renamed from: e */
    public TextView[] f197420e = new TextView[6];

    /* renamed from: f */
    public EditText f197421f;

    /* renamed from: g */
    public C68735b f197422g;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew$a */
    public class C68734a implements Runnable {
        public C68734a() {
        }

        public void run() {
            InputMethodManager inputMethodManager = (InputMethodManager) EditVerifyCodeViewNew.this.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                EditVerifyCodeViewNew.this.f197421f.requestFocus();
                inputMethodManager.showSoftInput(EditVerifyCodeViewNew.this.f197421f, 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew$b */
    public interface C68735b {
        /* renamed from: a */
        void mo94543a(String str);
    }

    public EditVerifyCodeViewNew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo94536a(context);
    }

    /* renamed from: a */
    public final void mo94536a(Context context) {
        this.f197419d = context;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.d7o, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f357724bg0);
        TextView[] textViewArr = this.f197420e;
        textViewArr[0] = textView;
        textViewArr[1] = (TextView) inflate.findViewById(C0966R.C0970id.f357725bg1);
        textViewArr[2] = (TextView) inflate.findViewById(C0966R.C0970id.f357726bg2);
        textViewArr[3] = (TextView) inflate.findViewById(C0966R.C0970id.f357727bg3);
        textViewArr[4] = (TextView) inflate.findViewById(C0966R.C0970id.bg4);
        textViewArr[5] = (TextView) inflate.findViewById(C0966R.C0970id.bg5);
        textView.setSelected(true);
        EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.f359481l40);
        this.f197421f = editText;
        editText.addTextChangedListener(new C79432c(this));
        this.f197421f.setOnFocusChangeListener(new C79433d(this));
        addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
        this.f197421f.setFocusable(true);
        this.f197421f.setFocusableInTouchMode(true);
        mo94537b();
    }

    /* renamed from: b */
    public void mo94537b() {
        ((C119157j) C119157j.f356862d).mo183895z(new C68734a());
    }

    public EditText getEditText() {
        return this.f197421f;
    }

    public String getText() {
        return this.f197421f.getText().toString();
    }

    public void setCodeEditCompleteListener(C68735b bVar) {
        this.f197422g = bVar;
    }

    public void setText(String str) {
        this.f197421f.setText(str);
    }

    public EditVerifyCodeViewNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo94536a(context);
    }
}
