package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter */
public class WebViewSearchContentInputFooter extends LinearLayout {

    /* renamed from: d */
    public View f119841d;

    /* renamed from: e */
    public EditText f119842e;

    /* renamed from: f */
    public View f119843f;

    /* renamed from: g */
    public View f119844g;

    /* renamed from: h */
    public View f119845h;

    /* renamed from: i */
    public TextView f119846i;

    /* renamed from: j */
    public C44223g f119847j;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter$a */
    public class C44217a implements View.OnClickListener {
        public C44217a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/WebViewSearchContentInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WebViewSearchContentInputFooter.this.mo68915a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/WebViewSearchContentInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter$b */
    public class C44218b implements View.OnClickListener {
        public C44218b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/WebViewSearchContentInputFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WebViewSearchContentInputFooter webViewSearchContentInputFooter = WebViewSearchContentInputFooter.this;
            C44223g gVar = webViewSearchContentInputFooter.f119847j;
            if (gVar != null) {
                gVar.mo67986d(webViewSearchContentInputFooter);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/WebViewSearchContentInputFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter$c */
    public class C44219c implements View.OnClickListener {
        public C44219c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/WebViewSearchContentInputFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WebViewSearchContentInputFooter webViewSearchContentInputFooter = WebViewSearchContentInputFooter.this;
            C44223g gVar = webViewSearchContentInputFooter.f119847j;
            if (gVar != null) {
                gVar.mo67987e(webViewSearchContentInputFooter);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/WebViewSearchContentInputFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter$d */
    public class C44220d implements View.OnKeyListener {
        public C44220d() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/WebViewSearchContentInputFooter$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            C44223g gVar = WebViewSearchContentInputFooter.this.f119847j;
            if (gVar != null) {
                gVar.onKey(view, i, keyEvent);
            }
            if (i != 66 || WebViewSearchContentInputFooter.this.f119847j == null) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/widget/WebViewSearchContentInputFooter$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            }
            Context context = view.getContext();
            if (context instanceof MMActivity) {
                ((MMActivity) context).hideVKB(WebViewSearchContentInputFooter.this.f119842e);
            }
            WebViewSearchContentInputFooter webViewSearchContentInputFooter = WebViewSearchContentInputFooter.this;
            webViewSearchContentInputFooter.f119847j.mo67985c(webViewSearchContentInputFooter);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/webview/ui/tools/widget/WebViewSearchContentInputFooter$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter$e */
    public class C44221e implements View.OnFocusChangeListener {
        public C44221e() {
        }

        public void onFocusChange(View view, boolean z) {
            if (!z && WebViewSearchContentInputFooter.this.f119847j != null) {
                Context context = view.getContext();
                if (context instanceof MMActivity) {
                    ((MMActivity) context).hideVKB(WebViewSearchContentInputFooter.this.f119842e);
                }
            }
            WebViewSearchContentInputFooter.this.f119841d.setSelected(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter$f */
    public class C44222f implements TextWatcher {
        public C44222f() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            WebViewSearchContentInputFooter webViewSearchContentInputFooter = WebViewSearchContentInputFooter.this;
            C44223g gVar = webViewSearchContentInputFooter.f119847j;
            if (gVar != null) {
                gVar.mo67983a(webViewSearchContentInputFooter, charSequence == null ? "" : charSequence.toString());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter$g */
    public interface C44223g {
        /* renamed from: a */
        void mo67983a(WebViewSearchContentInputFooter webViewSearchContentInputFooter, String str);

        /* renamed from: b */
        void mo67984b(WebViewSearchContentInputFooter webViewSearchContentInputFooter);

        /* renamed from: c */
        void mo67985c(WebViewSearchContentInputFooter webViewSearchContentInputFooter);

        /* renamed from: d */
        void mo67986d(WebViewSearchContentInputFooter webViewSearchContentInputFooter);

        /* renamed from: e */
        void mo67987e(WebViewSearchContentInputFooter webViewSearchContentInputFooter);

        boolean onKey(View view, int i, KeyEvent keyEvent);

        void onShow();
    }

    public WebViewSearchContentInputFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo68916b();
    }

    /* renamed from: a */
    public void mo68915a() {
        Context context = this.f119842e.getContext();
        if (context instanceof MMActivity) {
            ((MMActivity) context).hideVKB(this.f119842e);
        }
        this.f119842e.clearFocus();
        setVisibility(8);
        C44223g gVar = this.f119847j;
        if (gVar != null) {
            gVar.mo67984b(this);
        }
    }

    /* renamed from: b */
    public final void mo68916b() {
        View inflate = View.inflate(getContext(), C0966R.C0971layout.ci5, this);
        this.f119842e = (EditText) inflate.findViewById(C0966R.C0970id.cd7);
        this.f119843f = inflate.findViewById(C0966R.C0970id.bec);
        this.f119844g = inflate.findViewById(C0966R.C0970id.i0s);
        this.f119845h = inflate.findViewById(C0966R.C0970id.hfk);
        this.f119846i = (TextView) inflate.findViewById(C0966R.C0970id.f6j);
        this.f119841d = inflate.findViewById(C0966R.C0970id.f7o);
        this.f119843f.setOnClickListener(new C44217a());
        this.f119844g.setOnClickListener(new C44218b());
        this.f119845h.setOnClickListener(new C44219c());
        this.f119842e.setOnKeyListener(new C44220d());
        this.f119842e.setOnFocusChangeListener(new C44221e());
        this.f119842e.addTextChangedListener(new C44222f());
        this.f119842e.setSelectAllOnFocus(true);
        mo68917c();
    }

    /* renamed from: c */
    public void mo68917c() {
        this.f119846i.setText("");
        this.f119844g.setEnabled(false);
        this.f119845h.setEnabled(false);
    }

    /* renamed from: d */
    public void mo68918d(int i, int i2, boolean z) {
        if (z) {
            TextView textView = this.f119846i;
            Object[] objArr = new Object[2];
            boolean z2 = true;
            objArr[0] = Integer.valueOf(i2 == 0 ? 0 : i + 1);
            objArr[1] = Integer.valueOf(i2);
            textView.setText(String.format("%d/%d", objArr));
            this.f119845h.setEnabled(i2 > 0);
            View view = this.f119844g;
            if (i2 <= 0) {
                z2 = false;
            }
            view.setEnabled(z2);
        }
    }

    public String getSearchContent() {
        return this.f119842e.getText().toString();
    }

    public boolean isShown() {
        return getVisibility() == 0;
    }

    public void setActionDelegate(C44223g gVar) {
        this.f119847j = gVar;
    }

    public WebViewSearchContentInputFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo68916b();
    }
}
