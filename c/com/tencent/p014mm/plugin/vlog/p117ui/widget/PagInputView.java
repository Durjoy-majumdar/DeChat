package com.tencent.p014mm.plugin.vlog.p117ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.InsectRelativeLayout;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001b\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002R6\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/PagInputView;", "Lcom/tencent/mm/ui/widget/InsectRelativeLayout;", "", "visible", "Lrx3/b0;", "setImeVisibility", "", "text", "setup", "getResult", "show", "setShow", "Lkotlin/Function1;", "Lcom/tencent/mm/plugin/vlog/ui/widget/ChangeTextCallback;", "q", "Lfy3/l;", "getTextChangeCallback", "()Lfy3/l;", "setTextChangeCallback", "(Lfy3/l;)V", "textChangeCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.widget.PagInputView */
public final class PagInputView extends InsectRelativeLayout {

    /* renamed from: i */
    public final View f207442i;

    /* renamed from: j */
    public final View f207443j;

    /* renamed from: n */
    public final EditText f207444n;

    /* renamed from: o */
    public int f207445o;

    /* renamed from: p */
    public boolean f207446p;

    /* renamed from: q */
    public C32226l<? super Boolean, C13598b0> f207447q;

    /* renamed from: r */
    public final Runnable f207448r;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.widget.PagInputView$a */
    public static final class C71573a implements View.OnFocusChangeListener {

        /* renamed from: d */
        public final /* synthetic */ PagInputView f207449d;

        public C71573a(PagInputView pagInputView) {
            this.f207449d = pagInputView;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f207449d.setImeVisibility(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.widget.PagInputView$b */
    public static final class C71574b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PagInputView f207450d;

        public C71574b(PagInputView pagInputView) {
            this.f207450d = pagInputView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/widget/PagInputView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<? super Boolean, C13598b0> lVar = this.f207450d.f207447q;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/widget/PagInputView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.widget.PagInputView$c */
    public static final class C71575c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PagInputView f207451d;

        public C71575c(PagInputView pagInputView) {
            this.f207451d = pagInputView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/widget/PagInputView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<? super Boolean, C13598b0> lVar = this.f207451d.f207447q;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/widget/PagInputView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.widget.PagInputView$d */
    public static final class C71576d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PagInputView f207452d;

        public C71576d(PagInputView pagInputView) {
            this.f207452d = pagInputView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/widget/PagInputView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f207452d.f207444n.requestFocus();
            this.f207452d.setImeVisibility(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/widget/PagInputView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.widget.PagInputView$e */
    public static final class C71577e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ PagInputView f207453d;

        public C71577e(PagInputView pagInputView) {
            this.f207453d = pagInputView;
        }

        public final void run() {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f207453d.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.f207453d.f207444n, 0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.a0s, this);
        setBackgroundResource(C0966R.color.afa);
        View findViewById = findViewById(C0966R.C0970id.cay);
        C87412m.m108593f(findViewById, "findViewById(R.id.edit_input_close)");
        this.f207442i = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.caz);
        C87412m.m108593f(findViewById2, "findViewById(R.id.edit_input_done)");
        this.f207443j = findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.cbb);
        C87412m.m108593f(findViewById3, "findViewById(R.id.edit_text_input)");
        EditText editText = (EditText) findViewById3;
        this.f207444n = editText;
        editText.setOnFocusChangeListener(new C71573a(this));
        findViewById.setOnClickListener(new C71574b(this));
        findViewById2.setOnClickListener(new C71575c(this));
        setOnClickListener(new C71576d(this));
        this.f207448r = new C71577e(this);
    }

    /* access modifiers changed from: private */
    public final void setImeVisibility(boolean z) {
        if (z) {
            post(this.f207448r);
            return;
        }
        removeCallbacks(this.f207448r);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    public boolean mo70458a(int i) {
        this.f207445o = i;
        boolean z = i > C75044y4.m89991c(getContext());
        if (!this.f207446p) {
            return false;
        }
        if (!z) {
            return true;
        }
        this.f207446p = false;
        return false;
    }

    public final String getResult() {
        return this.f207444n.getText().toString();
    }

    public final C32226l<Boolean, C13598b0> getTextChangeCallback() {
        return this.f207447q;
    }

    public final void setShow(boolean z) {
        if (z) {
            setVisibility(0);
            setPadding(0, 0, 0, this.f207445o);
            this.f207444n.requestFocus();
            return;
        }
        this.f207444n.clearFocus();
        this.f207446p = true;
        setVisibility(8);
    }

    public final void setTextChangeCallback(C32226l<? super Boolean, C13598b0> lVar) {
        this.f207447q = lVar;
    }

    public final void setup(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        this.f207444n.setText(str);
        this.f207444n.setSelection(0, str.length());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PagInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
