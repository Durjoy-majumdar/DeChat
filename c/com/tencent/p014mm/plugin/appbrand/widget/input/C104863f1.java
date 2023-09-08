package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.autofill.C104829b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.f1 */
public interface C104863f1 {

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.f1$a */
    public interface C104864a {
        void onConfigurationChanged(Configuration configuration);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.f1$b */
    public interface C104865b {
        /* renamed from: a */
        boolean mo148819a(int i, KeyEvent keyEvent);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.f1$c */
    public interface C104866c {
        /* renamed from: a */
        void mo148728a(int i, int i2);
    }

    /* renamed from: a */
    boolean mo148793a();

    void addTextChangedListener(TextWatcher textWatcher);

    /* renamed from: b */
    void mo148798b(C104864a aVar);

    /* renamed from: c */
    void mo148799c(View.OnFocusChangeListener onFocusChangeListener);

    /* renamed from: d */
    boolean mo148800d();

    void destroy();

    /* renamed from: e */
    void mo148802e();

    /* renamed from: f */
    void mo148803f();

    /* renamed from: g */
    void mo148804g(C83780d1 d1Var);

    C104829b getAutoFillController();

    Context getContext();

    int getInputId();

    View getInputPanel();

    char getLastKeyPressed();

    CharSequence getText();

    View getView();

    /* renamed from: h */
    void mo148811h(View.OnFocusChangeListener onFocusChangeListener);

    /* renamed from: j */
    void mo148812j();

    /* renamed from: k */
    void mo148813k(C83780d1 d1Var);

    /* renamed from: l */
    void mo148814l(C104866c cVar);

    /* renamed from: n */
    void mo148773n(float f, float f2);

    /* renamed from: o */
    boolean mo148774o();

    /* renamed from: q */
    int mo148815q(int i);

    void setFixed(boolean z);

    void setInputId(int i);

    void setOnKeyUpPostImeListener(C104865b bVar);
}
