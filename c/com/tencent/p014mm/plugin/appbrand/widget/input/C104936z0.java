package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.os.Looper;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import ot0.C110064b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.z0 */
public final class C104936z0 implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final MMHandler f311581d;

    /* renamed from: e */
    public boolean f311582e = false;

    /* renamed from: f */
    public C110064b f311583f;

    /* renamed from: g */
    public final Runnable f311584g = new C104937a();

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.z0$a */
    public class C104937a implements Runnable {
        public C104937a() {
        }

        public void run() {
            C110064b bVar = C104936z0.this.f311583f;
            if (bVar != null) {
                bVar.mo121222a();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.z0$b */
    public class C104938b implements SpanWatcher {
        public C104938b() {
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (C84975p1.f247639d.isInstance(obj)) {
                Log.m105919d("MicroMsg.EditTextComposingTextDismissedObserver", "[bindInput] onSpanAdded %s, %s", spannable, obj.getClass().getSimpleName());
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            if (C84975p1.f247639d.isInstance(obj)) {
                Log.m105919d("MicroMsg.EditTextComposingTextDismissedObserver", "[bindInput] onSpanChanged %s, %s", spannable, obj.getClass().getSimpleName());
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (C84975p1.f247639d.isInstance(obj)) {
                Log.m105919d("MicroMsg.EditTextComposingTextDismissedObserver", "[bindInput] onSpanRemoved %s, %s", spannable, obj.getClass().getSimpleName());
                C104936z0 z0Var = C104936z0.this;
                z0Var.f311581d.removeCallbacks(z0Var.f311584g);
                C104936z0 z0Var2 = C104936z0.this;
                z0Var2.f311581d.postDelayed(z0Var2.f311584g, 100);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.z0$c */
    public class C104939c implements TextWatcher {
        public C104939c() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C104936z0 z0Var = C104936z0.this;
            z0Var.f311581d.removeCallbacks(z0Var.f311584g);
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public C104936z0(EditText editText) {
        this.f311582e = editText.isFocused();
        editText.setOnFocusChangeListener(this);
        this.f311581d = new MMHandler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public Editable mo148956a(Editable editable) {
        editable.setSpan(new C104938b(), 0, editable.length(), 18);
        editable.setSpan(new C104939c(), 0, editable.length(), 18);
        return editable;
    }

    public void onFocusChange(View view, boolean z) {
        this.f311582e = z;
        if (!z) {
            this.f311581d.removeCallbacks(this.f311584g);
        }
    }
}
