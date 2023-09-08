package com.tencent.p014mm.plugin.recordvideo.p095ui.editor;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.InsectRelativeLayout;
import com.tencent.p014mm.p136ui.widget.MMTextView;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.view.FontSelectorView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32226l;
import gi2.C107811c;
import gi2.C107816d;
import gy3.C87412m;
import gy3.C87413o;
import hi2.C76198a;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13598b0;
import sx3.C110823p;
import ug2.C111169a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002GHB!\u0012\u0006\u0010@\u001a\u00020?\u0012\b\u0010B\u001a\u0004\u0018\u00010A\u0012\u0006\u0010C\u001a\u00020\u000f¢\u0006\u0004\bD\u0010EB\u001b\b\u0016\u0012\u0006\u0010@\u001a\u00020?\u0012\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bD\u0010FJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u001e\u0010\u000e\u001a\u00020\u00052\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\u0016J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f8\u0002@BX\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010$\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u001eR$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00104\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010:\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b;\u00105\u001a\u0004\b<\u00107\"\u0004\b=\u00109¨\u0006I"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView;", "Lcom/tencent/mm/ui/widget/InsectRelativeLayout;", "", "", "visible", "Lrx3/b0;", "setImeVisibility", "", "typeface", "setTypeFace", "show", "setShow", "Lkotlin/Function1;", "callback", "setOnVisibleChangeCallback", "", "id", "setConfirmBtnBg", "Landroid/view/View;", "o", "Landroid/view/View;", "getConfirm", "()Landroid/view/View;", "setConfirm", "(Landroid/view/View;)V", "confirm", "value", "z", "I", "setSelectedIndex", "(I)V", "selectedIndex", "E", "getMode", "()I", "setMode", "mode", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$j;", "G", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$j;", "getTextCallback", "()Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$j;", "setTextCallback", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$j;)V", "textCallback", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$k;", "H", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$k;", "getTipCallback", "()Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$k;", "setTipCallback", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$k;)V", "tipCallback", "Z", "getHasBackground", "()Z", "setHasBackground", "(Z)V", "hasBackground", "J", "getEnableClickOutsideConfirm", "setEnableClickOutsideConfirm", "enableClickOutsideConfirm", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "j", "k", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView */
public final class EditorInputView extends InsectRelativeLayout {

    /* renamed from: P */
    public static final int[] f315575P;

    /* renamed from: Q */
    public static final int f315576Q;

    /* renamed from: A */
    public int f315577A;

    /* renamed from: B */
    public int f315578B;

    /* renamed from: C */
    public int f315579C;

    /* renamed from: D */
    public String f315580D;

    /* renamed from: E */
    public int f315581E;

    /* renamed from: F */
    public C32226l<? super Boolean, C13598b0> f315582F;

    /* renamed from: G */
    public C106032j f315583G;

    /* renamed from: H */
    public C106033k f315584H;

    /* renamed from: I */
    public boolean f315585I;

    /* renamed from: J */
    public boolean f315586J;

    /* renamed from: K */
    public int f315587K;

    /* renamed from: L */
    public boolean f315588L;

    /* renamed from: M */
    public boolean f315589M;

    /* renamed from: N */
    public final Runnable f315590N;

    /* renamed from: i */
    public final int f315591i;

    /* renamed from: j */
    public final int f315592j;

    /* renamed from: n */
    public View f315593n;

    /* renamed from: o */
    public View f315594o;

    /* renamed from: p */
    public PhotoEditText f315595p;

    /* renamed from: q */
    public ViewGroup f315596q;

    /* renamed from: r */
    public View f315597r;

    /* renamed from: s */
    public final ImageView f315598s;

    /* renamed from: t */
    public final FontSelectorView f315599t;

    /* renamed from: u */
    public final C107811c f315600u;

    /* renamed from: v */
    public final View f315601v;

    /* renamed from: w */
    public final View f315602w;

    /* renamed from: x */
    public final EditText f315603x;

    /* renamed from: y */
    public final MMTextView f315604y;

    /* renamed from: z */
    public int f315605z;

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView$a */
    public static final class C106023a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EditorInputView f315606d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106023a(EditorInputView editorInputView) {
            super(1);
            this.f315606d = editorInputView;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            this.f315606d.f315580D = str;
            if (!(str.length() > 0)) {
                this.f315606d.f315595p.setTypeface(Typeface.DEFAULT_BOLD);
            } else if (C86013q1.m106450k(str)) {
                this.f315606d.f315595p.setTypeface(Typeface.createFromFile(str));
            } else {
                this.f315606d.f315595p.setTypeface(Typeface.DEFAULT);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView$b */
    public static final class C106024b implements View.OnFocusChangeListener {

        /* renamed from: d */
        public final /* synthetic */ EditorInputView f315607d;

        public C106024b(EditorInputView editorInputView) {
            this.f315607d = editorInputView;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f315607d.setImeVisibility(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView$c */
    public static final class C106025c implements View.OnFocusChangeListener {

        /* renamed from: d */
        public final /* synthetic */ EditorInputView f315608d;

        public C106025c(EditorInputView editorInputView) {
            this.f315608d = editorInputView;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f315608d.setImeVisibility(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView$d */
    public static final class C106026d implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ EditorInputView f315609d;

        public C106026d(EditorInputView editorInputView) {
            this.f315609d = editorInputView;
        }

        public void afterTextChanged(Editable editable) {
            if (editable != null) {
                int length = editable.length();
                EditorInputView editorInputView = this.f315609d;
                int i = editorInputView.f315591i - length;
                editorInputView.getConfirm().setEnabled(i >= 0 && this.f315609d.f315603x.getLineCount() <= this.f315609d.f315592j);
                if (i < 0) {
                    this.f315609d.f315604y.setVisibility(0);
                    this.f315609d.f315604y.setText(String.valueOf(i));
                    return;
                }
                this.f315609d.f315604y.setVisibility(8);
                return;
            }
            this.f315609d.f315604y.setVisibility(8);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView$e */
    public static final class C106027e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorInputView f315610d;

        public C106027e(EditorInputView editorInputView) {
            this.f315610d = editorInputView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EditorInputView editorInputView = this.f315610d;
            C106032j jVar = editorInputView.f315583G;
            if (jVar != null) {
                jVar.onCancel();
            }
            C106033k kVar = editorInputView.f315584H;
            if (kVar != null) {
                kVar.onCancel();
            }
            editorInputView.f315595p.clearFocus();
            editorInputView.f315603x.clearFocus();
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView$f */
    public static final class C106028f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorInputView f315611d;

        public C106028f(EditorInputView editorInputView) {
            this.f315611d = editorInputView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f315611d.getMode() == 0 || this.f315611d.getMode() == 2) {
                Editable text = this.f315611d.f315595p.getText();
                C106032j textCallback = this.f315611d.getTextCallback();
                if (textCallback != null) {
                    EditorInputView editorInputView = this.f315611d;
                    textCallback.mo151459a(text, editorInputView.f315577A, editorInputView.f315578B, editorInputView.f315580D);
                }
                this.f315611d.f315595p.clearFocus();
            } else if (this.f315611d.getMode() == 1) {
                Editable text2 = this.f315611d.f315603x.getText();
                C106033k tipCallback = this.f315611d.getTipCallback();
                if (tipCallback != null) {
                    tipCallback.mo151461a(text2, -1, 0, this.f315611d.f315580D);
                }
                this.f315611d.f315603x.clearFocus();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView$g */
    public static final class C106029g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorInputView f315612d;

        public C106029g(EditorInputView editorInputView) {
            this.f315612d = editorInputView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f315612d.getConfirm().isEnabled() || !this.f315612d.getEnableClickOutsideConfirm()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (this.f315612d.getMode() == 0 || this.f315612d.getMode() == 2) {
                Editable text = this.f315612d.f315595p.getText();
                C106032j textCallback = this.f315612d.getTextCallback();
                if (textCallback != null) {
                    EditorInputView editorInputView = this.f315612d;
                    textCallback.mo151459a(text, editorInputView.f315577A, editorInputView.f315578B, editorInputView.f315580D);
                }
                this.f315612d.f315595p.clearFocus();
            } else if (this.f315612d.getMode() == 1) {
                Editable text2 = this.f315612d.f315603x.getText();
                C106033k tipCallback = this.f315612d.getTipCallback();
                if (tipCallback != null) {
                    tipCallback.mo151461a(text2, -1, 0, this.f315612d.f315580D);
                }
                this.f315612d.f315603x.clearFocus();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView$h */
    public static final class C106030h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorInputView f315613d;

        public C106030h(EditorInputView editorInputView) {
            this.f315613d = editorInputView;
        }

        public final void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ImageView imageView = this.f315613d.f315598s;
            imageView.setActivated(!imageView.isActivated());
            EditorInputView editorInputView = this.f315613d;
            editorInputView.setHasBackground(editorInputView.f315598s.isActivated());
            this.f315613d.mo151439i();
            EditorInputView editorInputView2 = this.f315613d;
            ImageView imageView2 = editorInputView2.f315598s;
            if (editorInputView2.getHasBackground()) {
                str = C76577a.m92166q(editorInputView2.getContext(), C0966R.string.f7517ih);
                C87412m.m108593f(str, "{\n            ResourceHe…lor_background)\n        }");
            } else {
                str = C76577a.m92166q(editorInputView2.getContext(), C0966R.string.f7520ik);
                C87412m.m108593f(str, "{\n            ResourceHe…lor_foreground)\n        }");
            }
            imageView2.setContentDescription(str);
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView$i */
    public static final class C106031i extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EditorInputView f315614d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106031i(EditorInputView editorInputView) {
            super(1);
            this.f315614d = editorInputView;
        }

        public Object invoke(Object obj) {
            this.f315614d.setSelectedIndex(((Number) obj).intValue());
            this.f315614d.mo151439i();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView$j */
    public interface C106032j {
        /* renamed from: a */
        void mo151459a(CharSequence charSequence, int i, int i2, String str);

        void onCancel();
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView$k */
    public interface C106033k {
        /* renamed from: a */
        void mo151461a(CharSequence charSequence, int i, int i2, String str);

        void onCancel();
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView$l */
    public static final class C106034l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorInputView f315615d;

        public C106034l(EditorInputView editorInputView) {
            this.f315615d = editorInputView;
        }

        public final void run() {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f315615d.getContext().getSystemService("input_method");
            if (this.f315615d.getMode() == 0 || this.f315615d.getMode() == 2) {
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(this.f315615d.f315595p, 0);
                }
            } else if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.f315615d.f315603x, 0);
            }
        }
    }

    static {
        int[] iArr = {-1, -16777216, -372399, -15616, -16268960, -15683841, -10197008};
        f315575P = iArr;
        f315576Q = iArr[0];
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View view;
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        this.f315591i = 108;
        this.f315592j = 7;
        this.f315580D = "";
        this.f315586J = true;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C111169a.f332949a);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…eable.InputViewIconStyle)");
        this.f315589M = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.f315579C = C75044y4.m89990b(context).y;
        View.inflate(context2, C0966R.C0971layout.a0m, this);
        setBackgroundColor(getResources().getColor(C0966R.color.afa));
        View findViewById = findViewById(C0966R.C0970id.azg);
        C87412m.m108593f(findViewById, "findViewById(R.id.change_text_input)");
        this.f315595p = (PhotoEditText) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.k6d);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_editor_input_root)");
        this.f315596q = (ViewGroup) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.k6c);
        C87412m.m108593f(findViewById3, "findViewById(R.id.story_editor_input_header)");
        this.f315597r = findViewById3;
        if (this.f315589M) {
            view = findViewById(C0966R.C0970id.aze);
            C87412m.m108593f(view, "{\n            findViewBy…text_cancel_iv)\n        }");
        } else {
            view = findViewById(C0966R.C0970id.azd);
            C87412m.m108593f(view, "{\n            findViewBy…ge_text_cancel)\n        }");
        }
        this.f315593n = view;
        if (this.f315589M) {
            view.setBackground(C74933u4.m89768e(context2, C0966R.raw.icons_filled_close2, -1));
        }
        if (view instanceof TextView) {
            Object systemService = context2.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            ((TextView) view).setTextSize(1, (displayMetrics.density * 17.0f) / context.getResources().getDisplayMetrics().density);
        }
        C76198a aVar = C76198a.f223232a;
        aVar.mo106462b(view);
        View view2 = this.f315593n;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById4 = findViewById(C0966R.C0970id.azf);
        C87412m.m108593f(findViewById4, "findViewById(R.id.change_text_confirm)");
        this.f315594o = findViewById4;
        if (findViewById4 instanceof TextView) {
            float a = aVar.mo106461a(context2, 17.0f);
            View view4 = this.f315594o;
            C87412m.m108592e(view4, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) view4).setTextSize(1, a);
        }
        aVar.mo106462b(this.f315594o);
        if (C85875k4.m106205t(context2, false)) {
            View view5 = this.f315597r;
            view5.setPadding(view5.getPaddingLeft(), C85875k4.m106198o(context) + C74942w4.m89786c(context2, C0966R.dimen.f3723cd), this.f315597r.getPaddingRight(), this.f315597r.getPaddingBottom());
        }
        View findViewById5 = findViewById(C0966R.C0970id.k6a);
        C87412m.m108593f(findViewById5, "findViewById(R.id.story_editor_input_bg_toggle)");
        ImageView imageView = (ImageView) findViewById5;
        this.f315598s = imageView;
        View findViewById6 = findViewById(C0966R.C0970id.k6b);
        C87412m.m108593f(findViewById6, "findViewById(R.id.story_editor_input_color)");
        this.f315601v = findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.cb_);
        C87412m.m108593f(findViewById7, "findViewById(R.id.edit_text_color_list)");
        C107811c cVar = new C107811c((GridView) findViewById7);
        this.f315600u = cVar;
        View findViewById8 = findViewById(C0966R.C0970id.k6g);
        C87412m.m108593f(findViewById8, "findViewById(R.id.story_editor_tip_input_root)");
        this.f315602w = findViewById8;
        View findViewById9 = findViewById(C0966R.C0970id.kmp);
        C87412m.m108593f(findViewById9, "findViewById(R.id.tip_text_input)");
        EditText editText = (EditText) findViewById9;
        this.f315603x = editText;
        View findViewById10 = findViewById(C0966R.C0970id.kmn);
        C87412m.m108593f(findViewById10, "findViewById(R.id.tip_over_size_indicator)");
        this.f315604y = (MMTextView) findViewById10;
        View findViewById11 = findViewById(C0966R.C0970id.ecw);
        C87412m.m108593f(findViewById11, "findViewById(R.id.font_selector_view)");
        this.f315599t = (FontSelectorView) findViewById11;
        this.f315595p.setOnFocusChangeListener(new C106024b(this));
        findViewById8.setTranslationY(-((float) this.f315579C));
        editText.setOnFocusChangeListener(new C106025c(this));
        editText.addTextChangedListener(new C106026d(this));
        this.f315593n.setOnClickListener(new C106027e(this));
        this.f315594o.setOnClickListener(new C106028f(this));
        setOnClickListener(new C106029g(this));
        imageView.setOnClickListener(new C106030h(this));
        cVar.f322634f = new C106031i(this);
        int[] iArr = f315575P;
        for (int i2 = 0; i2 < 7; i2++) {
            int i3 = iArr[i2];
            ArrayList<C107811c.C107814b> arrayList = cVar.f322631c;
            C107811c.C107814b bVar = new C107811c.C107814b();
            bVar.f322639a = i3;
            arrayList.add(bVar);
        }
        C107811c cVar2 = this.f315600u;
        cVar2.f322630b = 0;
        cVar2.f322631c.get(0).getClass();
        C107811c cVar3 = this.f315600u;
        cVar3.getClass();
        C107811c.C107812a aVar3 = new C107811c.C107812a(cVar3, cVar3.f322631c);
        cVar3.f322632d = aVar3;
        cVar3.f322629a.setAdapter(aVar3);
        C107811c.C107812a aVar4 = cVar3.f322632d;
        if (aVar4 != null) {
            aVar4.f322636e = new C107816d(cVar3);
        }
        cVar3.f322629a.setClickable(false);
        cVar3.f322629a.setLongClickable(false);
        PhotoEditText photoEditText = this.f315595p;
        photoEditText.setTypeface(photoEditText.getTypeface(), 1);
        this.f315599t.setFontSelectCallback(new C106023a(this));
        mo151438h(true);
        this.f315590N = new C106034l(this);
    }

    /* access modifiers changed from: private */
    public final void setImeVisibility(boolean z) {
        if (z) {
            post(this.f315590N);
            return;
        }
        removeCallbacks(this.f315590N);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: private */
    public final void setSelectedIndex(int i) {
        this.f315605z = i;
        if (i < 0) {
            this.f315605z = 0;
        }
    }

    /* renamed from: a */
    public boolean mo70458a(int i) {
        int i2 = this.f315581E;
        if (i2 == 0 || i2 == 2) {
            this.f315587K = i;
            boolean z = i > C75044y4.m89991c(getContext());
            if (this.f315588L) {
                if (!z) {
                    return true;
                }
                this.f315588L = false;
            }
            return false;
        }
        this.f315602w.setTranslationY((float) ((this.f315579C - i) - this.f315602w.getMeasuredHeight()));
        View view = this.f315602w;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView", "animationWithTipPanel", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView", "animationWithTipPanel", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    /* renamed from: f */
    public final void mo151430f(float f, float f2) {
        int i = (int) f2;
        this.f315596q.setPadding(i, 0, i, 0);
    }

    /* renamed from: g */
    public final void mo151431g(CharSequence charSequence, int i, int i2) {
        int i3 = this.f315581E;
        boolean z = true;
        if (i3 != 0) {
            if (i3 == 1) {
                this.f315603x.setText(charSequence);
                if (charSequence != null) {
                    this.f315603x.setSelection(charSequence.length());
                }
                this.f315603x.setTextColor(i);
                this.f315603x.postInvalidate();
                return;
            } else if (i3 != 2) {
                return;
            }
        }
        this.f315595p.setText(charSequence);
        if (charSequence != null) {
            this.f315595p.setSelection(charSequence.length());
        }
        if (i2 == 0) {
            z = false;
        }
        this.f315585I = z;
        if (z) {
            i = i2 | 419430400;
        }
        setSelectedIndex(C110823p.m150983I(f315575P, i));
        C107811c cVar = this.f315600u;
        int i4 = this.f315605z;
        cVar.f322630b = i4;
        cVar.f322631c.get(i4).getClass();
        this.f315598s.setActivated(this.f315585I);
        mo151439i();
    }

    public final View getConfirm() {
        return this.f315594o;
    }

    public final boolean getEnableClickOutsideConfirm() {
        return this.f315586J;
    }

    public final boolean getHasBackground() {
        return this.f315585I;
    }

    public final int getMode() {
        return this.f315581E;
    }

    public final C106032j getTextCallback() {
        return this.f315583G;
    }

    public final C106033k getTipCallback() {
        return this.f315584H;
    }

    /* renamed from: h */
    public final void mo151438h(boolean z) {
        View findViewById = findViewById(C0966R.C0970id.ccj);
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView", "showFontSelect", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView", "showFontSelect", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: i */
    public final void mo151439i() {
        if (this.f315585I) {
            int[] iArr = f315575P;
            int i = this.f315605z;
            this.f315578B = iArr[i] & -419430401;
            this.f315577A = i == 0 ? iArr[1] : iArr[0];
        } else {
            this.f315577A = f315575P[this.f315605z] & -1;
            this.f315578B = 0;
        }
        this.f315595p.setTextColor(this.f315577A);
        this.f315595p.setTextBackground(this.f315578B);
        this.f315595p.postInvalidate();
    }

    public final void setConfirm(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f315594o = view;
    }

    public final void setConfirmBtnBg(int i) {
        this.f315594o.setBackground(getContext().getResources().getDrawable(i));
    }

    public final void setEnableClickOutsideConfirm(boolean z) {
        this.f315586J = z;
    }

    public final void setHasBackground(boolean z) {
        this.f315585I = z;
    }

    public final void setMode(int i) {
        this.f315581E = i;
    }

    public void setOnVisibleChangeCallback(C32226l<? super Boolean, C13598b0> lVar) {
        this.f315582F = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r6 != 2) goto L_0x0131;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setShow(boolean r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = 1
            r2 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r24 == 0) goto L_0x014b
            fy3.l<? super java.lang.Boolean, rx3.b0> r6 = r0.f315582F
            if (r6 == 0) goto L_0x0019
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.invoke(r7)
        L_0x0019:
            int r6 = r0.f315581E
            r7 = 2
            if (r6 == 0) goto L_0x00a9
            if (r6 == r1) goto L_0x0024
            if (r6 == r7) goto L_0x00a9
            goto L_0x0131
        L_0x0024:
            android.view.ViewGroup r6 = r0.f315596q
            r6.setVisibility(r2)
            android.view.View r2 = r0.f315601v
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r6.mo10233c(r3)
            java.lang.Object[] r9 = r6.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView"
            java.lang.String r11 = "setShow"
            java.lang.String r12 = "(Z)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r2
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r3 = r6.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView"
            java.lang.String r10 = "setShow"
            java.lang.String r11 = "(Z)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.view.View r2 = r0.f315602w
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r5)
            java.lang.Object[] r16 = r3.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView"
            java.lang.String r18 = "setShow"
            java.lang.String r19 = "(Z)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r2
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r16 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView"
            java.lang.String r17 = "setShow"
            java.lang.String r18 = "(Z)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0131
        L_0x00a9:
            int r2 = r0.f315587K
            r0.setPadding(r4, r4, r4, r2)
            android.view.View r2 = r0.f315602w
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r6.mo10233c(r3)
            java.lang.Object[] r9 = r6.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView"
            java.lang.String r11 = "setShow"
            java.lang.String r12 = "(Z)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r2
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r3 = r6.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView"
            java.lang.String r10 = "setShow"
            java.lang.String r11 = "(Z)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.view.View r2 = r0.f315601v
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r5)
            java.lang.Object[] r16 = r3.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView"
            java.lang.String r18 = "setShow"
            java.lang.String r19 = "(Z)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r2
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r16 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView"
            java.lang.String r17 = "setShow"
            java.lang.String r18 = "(Z)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.view.ViewGroup r2 = r0.f315596q
            r2.setVisibility(r4)
        L_0x0131:
            r0.setVisibility(r4)
            int r2 = r0.f315581E
            if (r2 == 0) goto L_0x0144
            if (r2 != r7) goto L_0x013b
            goto L_0x0144
        L_0x013b:
            if (r2 != r1) goto L_0x01e6
            android.widget.EditText r1 = r0.f315603x
            r1.requestFocus()
            goto L_0x01e6
        L_0x0144:
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r1 = r0.f315595p
            r1.requestFocus()
            goto L_0x01e6
        L_0x014b:
            r0.f315588L = r1
            r0.setVisibility(r2)
            android.view.View r1 = r0.f315602w
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r13.mo10233c(r3)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView"
            java.lang.String r8 = "setShow"
            java.lang.String r9 = "(Z)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r1
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r13.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r6 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView"
            java.lang.String r7 = "setShow"
            java.lang.String r8 = "(Z)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r1
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            android.view.View r1 = r0.f315601v
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r3)
            java.lang.Object[] r13 = r5.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView"
            java.lang.String r15 = "setShow"
            java.lang.String r16 = "(Z)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r3 = r5.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r13 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView"
            java.lang.String r14 = "setShow"
            java.lang.String r15 = "(Z)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            android.view.ViewGroup r1 = r0.f315596q
            r1.setVisibility(r2)
            android.view.View r1 = r0.f315602w
            int r2 = r0.f315579C
            float r2 = (float) r2
            float r2 = -r2
            r1.setTranslationY(r2)
            fy3.l<? super java.lang.Boolean, rx3.b0> r1 = r0.f315582F
            if (r1 == 0) goto L_0x01e6
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.invoke(r2)
        L_0x01e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorInputView.setShow(boolean):void");
    }

    public final void setTextCallback(C106032j jVar) {
        this.f315583G = jVar;
    }

    public final void setTipCallback(C106033k kVar) {
        this.f315584H = kVar;
    }

    public final void setTypeFace(String str) {
        this.f315599t.setSelectFont(str);
        if (!TextUtils.isEmpty(str)) {
            C87412m.m108591d(str);
            this.f315580D = str;
            if (C86013q1.m106450k(str)) {
                this.f315595p.setTypeface(Typeface.createFromFile(this.f315580D));
            } else {
                this.f315595p.setTypeface(Typeface.DEFAULT);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EditorInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
