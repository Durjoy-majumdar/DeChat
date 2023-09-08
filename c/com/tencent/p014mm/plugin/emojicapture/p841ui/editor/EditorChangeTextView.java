package com.tencent.p014mm.plugin.emojicapture.p841ui.editor;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.InsectRelativeLayout;
import com.tencent.p014mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.view.TextColorSelector;
import e71.C97607d;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import p206nj.C11171e;
import rx3.C13598b0;
import sx3.C110823p;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001-B!\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010)\u001a\u00020\t¢\u0006\u0004\b*\u0010+B\u001b\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b*\u0010,J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u000e\u001a\u00020\u00052\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006."}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView;", "Lcom/tencent/mm/ui/widget/InsectRelativeLayout;", "", "", "visible", "Lrx3/b0;", "setImeVisibility", "show", "setShow", "", "visibility", "setVisibility", "Lkotlin/Function1;", "callback", "setOnVisibleChangeCallback", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$h;", "r", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$h;", "getCallback", "()Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$h;", "setCallback", "(Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$h;)V", "u", "Z", "getTextChanged", "()Z", "setTextChanged", "(Z)V", "textChanged", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "v", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "getReporter", "()Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "setReporter", "(Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;)V", "reporter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "h", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView */
public final class EditorChangeTextView extends InsectRelativeLayout {

    /* renamed from: i */
    public View f312495i;

    /* renamed from: j */
    public View f312496j;

    /* renamed from: n */
    public EditText f312497n;

    /* renamed from: o */
    public ImageView f312498o;

    /* renamed from: p */
    public TextColorSelector f312499p;

    /* renamed from: q */
    public int f312500q;

    /* renamed from: r */
    public C105217h f312501r;

    /* renamed from: s */
    public int f312502s;

    /* renamed from: t */
    public boolean f312503t;

    /* renamed from: u */
    public boolean f312504u;

    /* renamed from: v */
    public EmojiCaptureReporter f312505v;

    /* renamed from: w */
    public final Runnable f312506w;

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView$a */
    public static final class C105210a implements View.OnFocusChangeListener {

        /* renamed from: d */
        public final /* synthetic */ EditorChangeTextView f312507d;

        public C105210a(EditorChangeTextView editorChangeTextView) {
            this.f312507d = editorChangeTextView;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f312507d.setImeVisibility(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView$b */
    public static final class C105211b implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ EditorChangeTextView f312508d;

        public C105211b(EditorChangeTextView editorChangeTextView) {
            this.f312508d = editorChangeTextView;
        }

        public void afterTextChanged(Editable editable) {
            if (editable != null) {
                if (editable.length() > 0) {
                    this.f312508d.f312498o.setVisibility(0);
                    return;
                }
            }
            this.f312508d.f312498o.setVisibility(8);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f312508d.setTextChanged(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView$c */
    public static final class C105212c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorChangeTextView f312509d;

        public C105212c(EditorChangeTextView editorChangeTextView) {
            this.f312509d = editorChangeTextView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f312509d.mo149522e();
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView$d */
    public static final class C105213d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorChangeTextView f312510d;

        public C105213d(EditorChangeTextView editorChangeTextView) {
            this.f312510d = editorChangeTextView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Editable text = this.f312510d.f312497n.getText();
            C105217h callback = this.f312510d.getCallback();
            if (callback != null) {
                callback.mo128116a(text, this.f312510d.f312500q);
            }
            this.f312510d.f312497n.clearFocus();
            if (this.f312510d.getTextChanged()) {
                EmojiCaptureReporter.m117776b(16, this.f312510d.getReporter().f269128d, 0, 0, 0, 0, 0, 0, 0, this.f312510d.getReporter().f269127G);
            }
            EmojiCaptureReporter.m117776b(15, this.f312510d.getReporter().f269128d, 0, 0, 0, 0, 0, 0, 0, this.f312510d.getReporter().f269127G);
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView$e */
    public static final class C105214e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorChangeTextView f312511d;

        public C105214e(EditorChangeTextView editorChangeTextView) {
            this.f312511d = editorChangeTextView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f312511d.f312497n.setText("");
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView$f */
    public static final class C105215f extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EditorChangeTextView f312512d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105215f(EditorChangeTextView editorChangeTextView) {
            super(1);
            this.f312512d = editorChangeTextView;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            EditorChangeTextView editorChangeTextView = this.f312512d;
            int i = C97607d.f286337a[intValue];
            editorChangeTextView.f312500q = i;
            int i2 = C97607d.f286338b[intValue];
            editorChangeTextView.f312497n.setTextColor(i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView$g */
    public static final class C105216g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorChangeTextView f312513d;

        public C105216g(EditorChangeTextView editorChangeTextView) {
            this.f312513d = editorChangeTextView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f312513d.f312497n.requestFocus();
            this.f312513d.setImeVisibility(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView$h */
    public interface C105217h {
        /* renamed from: a */
        void mo128116a(CharSequence charSequence, int i);

        void onCancel();
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView$i */
    public static final class C105218i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorChangeTextView f312514d;

        public C105218i(EditorChangeTextView editorChangeTextView) {
            this.f312514d = editorChangeTextView;
        }

        public final void run() {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f312514d.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.f312514d.f312497n, 0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorChangeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        new Rect();
        View.inflate(context, C0966R.C0971layout.f359649a13, this);
        View findViewById = findViewById(C0966R.C0970id.azg);
        C87412m.m108593f(findViewById, "findViewById(R.id.change_text_input)");
        this.f312497n = (EditText) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.azd);
        C87412m.m108593f(findViewById2, "findViewById(R.id.change_text_cancel)");
        this.f312495i = findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.azf);
        C87412m.m108593f(findViewById3, "findViewById(R.id.change_text_confirm)");
        this.f312496j = findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.f359364ki2);
        C87412m.m108593f(findViewById4, "findViewById(R.id.text_color_selector)");
        this.f312499p = (TextColorSelector) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.c1l);
        C87412m.m108593f(findViewById5, "findViewById(R.id.delete_text)");
        this.f312498o = (ImageView) findViewById5;
        this.f312497n.setOnFocusChangeListener(new C105210a(this));
        this.f312497n.addTextChangedListener(new C105211b(this));
        this.f312495i.setOnClickListener(new C105212c(this));
        this.f312496j.setOnClickListener(new C105213d(this));
        this.f312498o.setOnClickListener(new C105214e(this));
        this.f312499p.setColorList(C97607d.f286337a);
        this.f312499p.setSelected(0);
        this.f312499p.setColorSelectedCallback(new C105215f(this));
        setOnClickListener(new C105216g(this));
        setLayerType(1, (Paint) null);
        this.f312506w = new C105218i(this);
    }

    /* access modifiers changed from: private */
    public final void setImeVisibility(boolean z) {
        if (z) {
            post(this.f312506w);
            return;
        }
        removeCallbacks(this.f312506w);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    public boolean mo70458a(int i) {
        this.f312502s = i;
        boolean z = i > C75044y4.m89991c(getContext());
        if (!this.f312503t) {
            return false;
        }
        if (!z) {
            return true;
        }
        this.f312503t = false;
        return false;
    }

    /* renamed from: e */
    public final void mo149522e() {
        C105217h hVar = this.f312501r;
        if (hVar != null) {
            hVar.onCancel();
        }
        this.f312497n.clearFocus();
        if (this.f312504u) {
            EmojiCaptureReporter.m117776b(16, getReporter().f269128d, 0, 0, 0, 0, 0, 0, 0, getReporter().f269127G);
        }
        EmojiCaptureReporter.m117776b(14, getReporter().f269128d, 0, 0, 0, 0, 0, 0, 0, getReporter().f269127G);
    }

    /* renamed from: f */
    public final void mo149523f(CharSequence charSequence, int i) {
        int safeInsetTop;
        this.f312497n.setText(charSequence);
        if (charSequence != null) {
            this.f312497n.setSelection(charSequence.length());
        }
        int[] iArr = C97607d.f286337a;
        int I = C110823p.m150983I(iArr, i);
        if (I == -1) {
            I = 0;
        }
        this.f312499p.setSelected(I);
        int i2 = iArr[I];
        this.f312500q = i2;
        int i3 = C97607d.f286338b[I];
        this.f312497n.setTextColor(i2);
        this.f312504u = false;
        if (C11171e.m11046c(28)) {
            WindowInsets rootWindowInsets = getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null;
            if (displayCutout != null && (safeInsetTop = displayCutout.getSafeInsetTop()) > 0 && getPaddingTop() != safeInsetTop) {
                setPadding(0, safeInsetTop, 0, 0);
            }
        }
    }

    public final C105217h getCallback() {
        return this.f312501r;
    }

    public final EmojiCaptureReporter getReporter() {
        EmojiCaptureReporter emojiCaptureReporter = this.f312505v;
        if (emojiCaptureReporter != null) {
            return emojiCaptureReporter;
        }
        C87412m.m108603p("reporter");
        throw null;
    }

    public final boolean getTextChanged() {
        return this.f312504u;
    }

    public final void setCallback(C105217h hVar) {
        this.f312501r = hVar;
    }

    public void setOnVisibleChangeCallback(C32226l<? super Boolean, C13598b0> lVar) {
    }

    public final void setReporter(EmojiCaptureReporter emojiCaptureReporter) {
        C87412m.m108594g(emojiCaptureReporter, "<set-?>");
        this.f312505v = emojiCaptureReporter;
    }

    public void setShow(boolean z) {
        if (z) {
            setVisibility(0);
            setPadding(0, 0, 0, this.f312502s);
            return;
        }
        this.f312503t = true;
        setVisibility(8);
    }

    public final void setTextChanged(boolean z) {
        this.f312504u = z;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            this.f312497n.requestFocus();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EditorChangeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
