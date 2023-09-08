package com.tencent.p014mm.plugin.appbrand.widget.input.autofill;

import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Filter;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104863f1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84996v;
import com.tencent.p014mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase;
import com.tencent.p014mm.plugin.appbrand.widget.input.autofill.C104846k;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import p1042u.C111059i;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.b */
public final class C104829b {

    /* renamed from: a */
    public final C104863f1 f311339a;

    /* renamed from: b */
    public final C68706f f311340b;

    /* renamed from: c */
    public final Filter.FilterListener f311341c;

    /* renamed from: d */
    public final C104837c f311342d;

    /* renamed from: e */
    public final C104836g f311343e;

    /* renamed from: f */
    public C104844i f311344f = C104844i.VIEW;

    /* renamed from: g */
    public C104826a f311345g;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.b$a */
    public class C104830a implements C104863f1.C104864a {
        public C104830a() {
        }

        public void onConfigurationChanged(Configuration configuration) {
            C104829b.this.mo148725c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.b$b */
    public class C104831b implements C104863f1.C104866c {
        public C104831b() {
        }

        /* renamed from: a */
        public void mo148728a(int i, int i2) {
            C104829b.this.mo148725c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.b$c */
    public class C104832c implements View.OnFocusChangeListener {
        public C104832c() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                C104829b.this.mo148726d();
                return;
            }
            C104829b bVar = C104829b.this;
            if (bVar.f311340b.mo94496b()) {
                bVar.f311340b.mo94495a();
                ((C104845j) bVar.f311340b.f197359d.getAdapter()).mo148716a(bVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.b$d */
    public class C104833d implements TextWatcher {

        /* renamed from: d */
        public boolean f311349d = false;

        public C104833d() {
        }

        public void afterTextChanged(Editable editable) {
            if (!this.f311349d || C104829b.this.f311340b.mo94496b()) {
                if (!C104829b.this.f311340b.mo94496b()) {
                    C104829b.this.mo148726d();
                }
                C104829b.this.mo148724b(editable);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f311349d = C104829b.this.f311340b.mo94496b();
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.b$e */
    public class C104834e implements Filter.FilterListener {
        public C104834e() {
        }

        public void onFilterComplete(int i) {
            if (i <= 0) {
                C104829b.this.f311340b.mo94495a();
            } else if (C104829b.this.f311340b.mo94496b()) {
                C104829b.this.f311340b.mo94497c();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.b$f */
    public class C104835f extends C104836g {
        public C104835f() {
            super((C104830a) null);
        }

        /* renamed from: a */
        public void mo148734a(String str, C104846k.C104847a aVar) {
            if (aVar == C104846k.C104847a.DELETE) {
                C104829b bVar = C104829b.this;
                bVar.mo148724b(bVar.f311339a.getText());
            }
            C104846k kVar = this.f311353a;
            if (kVar != null) {
                kVar.mo148734a(str, aVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.b$g */
    public static class C104836g implements C104846k {

        /* renamed from: a */
        public C104846k f311353a;

        public C104836g(C104830a aVar) {
        }
    }

    public C104829b(C104863f1 f1Var) {
        this.f311339a = f1Var;
        C68706f fVar = new C68706f(f1Var.getContext());
        this.f311340b = fVar;
        this.f311342d = new C104837c(f1Var, fVar);
        f1Var.mo148798b(new C104830a());
        f1Var.mo148814l(new C104831b());
        f1Var.mo148811h(new C104832c());
        f1Var.addTextChangedListener(new C104833d());
        this.f311341c = new C104834e();
        this.f311343e = new C104835f();
    }

    /* renamed from: a */
    public void mo148723a() {
        C104837c cVar = this.f311342d;
        C84996v b = C84996v.m104810b(cVar.f311357d);
        C84996v.C85001d dVar = cVar.f311356c;
        if (dVar == null) {
            b.getClass();
        } else {
            ((C111059i) b.f247697d).remove(dVar);
        }
        this.f311345g = null;
        this.f311340b.mo94495a();
    }

    /* renamed from: b */
    public final void mo148724b(CharSequence charSequence) {
        C104826a aVar = this.f311345g;
        if (aVar != null) {
            aVar.getFilter().filter(charSequence, this.f311341c);
        }
    }

    /* renamed from: c */
    public final void mo148725c() {
        int ordinal = this.f311344f.ordinal();
        if (ordinal == 0) {
            this.f311340b.f197361f = KeyBoardUtil.getScreenWH(this.f311339a.getContext())[0];
        } else if (ordinal == 1) {
            this.f311340b.f197361f = this.f311339a.getView().getMeasuredWidth();
        }
    }

    /* renamed from: d */
    public void mo148726d() {
        if (this.f311345g != null) {
            CharSequence text = this.f311339a.getText();
            if (!Util.isNullOrNil(text)) {
                mo148724b(text);
            }
            this.f311340b.f197368m = this.f311339a.getView();
            this.f311340b.mo94497c();
            ((C104845j) this.f311340b.f197359d.getAdapter()).mo148717b(this);
            C104837c cVar = this.f311342d;
            cVar.mo148736b(2);
            cVar.f311358e = Integer.MIN_VALUE;
            if (!Util.isNullOrNil(text)) {
                cVar.f311359f = true;
            }
            AutoFillListPopupWindowBase.C68700a aVar = cVar.f311355b.f197359d;
            if (aVar != null) {
                aVar.getAdapter().registerDataSetObserver(new C104840d(cVar));
            }
        }
    }
}
