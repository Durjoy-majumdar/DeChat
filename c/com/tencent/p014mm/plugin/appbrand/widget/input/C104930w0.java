package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.style.AlignmentSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104863f1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104936z0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84996v;
import com.tencent.p014mm.plugin.appbrand.widget.input.autofill.C104829b;
import com.tencent.p014mm.plugin.appbrand.widget.input.autofill.C104837c;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ct0.C86129c;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.Map;
import mt0.C88844a;
import mt0.C88846b;
import ot0.C110064b;
import p1042u.C111055b;
import p1042u.C111059i;
import p1042u.C118556h;
import p224ra.C89909e;
import p977hj.C87527b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.w0 */
public abstract class C104930w0 extends EditText implements C104863f1, C86129c {

    /* renamed from: d */
    public InputConnection f311555d;

    /* renamed from: e */
    public boolean f311556e = false;

    /* renamed from: f */
    public volatile int f311557f = -1;

    /* renamed from: g */
    public final C104829b f311558g;

    /* renamed from: h */
    public final Map<C104863f1.C104864a, Object> f311559h;

    /* renamed from: i */
    public final Map<View.OnFocusChangeListener, Object> f311560i;

    /* renamed from: j */
    public final Map<C104863f1.C104866c, Object> f311561j;

    /* renamed from: n */
    public final C104934d f311562n;

    /* renamed from: o */
    public final PasswordTransformationMethod f311563o = new C68724x();

    /* renamed from: p */
    public final C104936z0 f311564p;

    /* renamed from: q */
    public int f311565q = 0;

    /* renamed from: r */
    public boolean f311566r = false;

    /* renamed from: s */
    public boolean f311567s = false;

    /* renamed from: t */
    public C104863f1.C104865b f311568t;

    /* renamed from: u */
    public char f311569u = 0;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.w0$a */
    public class C104931a extends Editable.Factory {
        public C104931a() {
        }

        public Editable newEditable(CharSequence charSequence) {
            return C104930w0.this.mo148791z(super.newEditable(charSequence));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.w0$b */
    public class C104932b extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ InputConnection f311571a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104932b(InputConnection inputConnection, boolean z, InputConnection inputConnection2) {
            super(inputConnection, z);
            this.f311571a = inputConnection2;
        }

        public boolean commitText(CharSequence charSequence, int i) {
            if (!TextUtils.isEmpty(charSequence)) {
                C104930w0.this.mo148888C(charSequence.charAt(charSequence.length() - 1));
            }
            return super.commitText(charSequence, i);
        }

        public boolean deleteSurroundingText(int i, int i2) {
            C104930w0.this.mo148888C(8);
            return super.deleteSurroundingText(i, i2);
        }

        public boolean finishComposingText() {
            InputConnection inputConnection = this.f311571a;
            boolean e = C84975p1.m104769e(inputConnection instanceof BaseInputConnection ? ((BaseInputConnection) inputConnection).getEditable() : C104930w0.this.getEditableText());
            boolean finishComposingText = super.finishComposingText();
            if (finishComposingText) {
                C104930w0 w0Var = C104930w0.this;
                if (w0Var.f311555d == this && e) {
                    C104936z0 z0Var = w0Var.f311564p;
                    z0Var.f311581d.removeCallbacks(z0Var.f311584g);
                    if (z0Var.f311582e) {
                        ((C104936z0.C104937a) z0Var.f311584g).run();
                    }
                }
            }
            return finishComposingText;
        }

        public boolean setComposingText(CharSequence charSequence, int i) {
            if (!TextUtils.isEmpty(charSequence)) {
                C104930w0.this.mo148888C(charSequence.charAt(charSequence.length() - 1));
            }
            return super.setComposingText(charSequence, i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.w0$c */
    public static /* synthetic */ class C104933c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f311573a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f311573a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f311573a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.input.C104930w0.C104933c.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.w0$d */
    public final class C104934d implements TextWatcher {

        /* renamed from: d */
        public final Map<TextWatcher, Object> f311574d = new C111055b();

        public C104934d(C104931a aVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
            r2 = (android.text.SpannableStringBuilder) r2;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> void mo148951a(java.lang.CharSequence r2, int r3, int r4, java.lang.Class<T> r5) {
            /*
                r1 = this;
                boolean r0 = r2 instanceof android.text.SpannableStringBuilder     // Catch:{ all -> 0x001c }
                if (r0 == 0) goto L_0x001c
                android.text.SpannableStringBuilder r2 = (android.text.SpannableStringBuilder) r2     // Catch:{ all -> 0x001c }
                int r4 = r4 + r3
                java.lang.Object[] r3 = r2.getSpans(r3, r4, r5)     // Catch:{ all -> 0x001c }
                if (r3 == 0) goto L_0x001c
                int r4 = r3.length     // Catch:{ all -> 0x001c }
                if (r4 <= 0) goto L_0x001c
                int r4 = r3.length     // Catch:{ all -> 0x001c }
                r5 = 0
            L_0x0012:
                if (r5 >= r4) goto L_0x001c
                r0 = r3[r5]     // Catch:{ all -> 0x001c }
                r2.removeSpan(r0)     // Catch:{ all -> 0x001c }
                int r5 = r5 + 1
                goto L_0x0012
            L_0x001c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.input.C104930w0.C104934d.mo148951a(java.lang.CharSequence, int, int, java.lang.Class):void");
        }

        public void afterTextChanged(Editable editable) {
            String str;
            PBool pBool = new PBool();
            PInt pInt = new PInt();
            C104930w0.this.getClass();
            pInt.value = 0;
            pBool.value = false;
            boolean z = true;
            if (editable == null || editable.length() <= 0) {
                str = null;
            } else {
                str = editable.toString();
                int length = editable.length();
                for (int i = 0; i < length; i++) {
                    int codePointAt = str.codePointAt(i);
                    C88846b bVar = (C88846b) C89909e.m112436a(C88846b.class);
                    if (bVar == null) {
                        bVar = C88844a.f256275a;
                    }
                    C88846b.C88847a B = bVar.mo123235B(codePointAt);
                    if (!(B == null || B.f256276a == 0)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(Character.toChars(B.f256276a));
                        int i2 = B.f256277b;
                        sb.append(i2 != 0 ? Character.toChars(i2) : "");
                        str = str.replace(new String(Character.toChars(codePointAt)), sb.toString());
                        pBool.value = true;
                        pInt.value++;
                    }
                }
            }
            String str2 = str;
            int i3 = pInt.value;
            if (!pBool.value || Util.isNullOrNil(str2)) {
                C104930w0 w0Var = C104930w0.this;
                if (w0Var.f311565q <= 0) {
                    z = false;
                }
                if (!z) {
                    w0Var.f311565q = 0;
                    if (!((C111059i) this.f311574d).isEmpty()) {
                        for (TextWatcher afterTextChanged : (TextWatcher[]) ((C118556h.C118559c) ((C111055b) this.f311574d).keySet()).toArray(new TextWatcher[((C111059i) this.f311574d).f332583f])) {
                            afterTextChanged.afterTextChanged(editable);
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            int selectionEnd = Selection.getSelectionEnd(editable);
            C104930w0 w0Var2 = C104930w0.this;
            w0Var2.post(new C104935x0(this, w0Var2.f311565q > 0, str2, selectionEnd, i3));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!(C104930w0.this.f311565q > 0) && !((C111059i) this.f311574d).isEmpty()) {
                for (TextWatcher beforeTextChanged : (TextWatcher[]) ((C118556h.C118559c) ((C111055b) this.f311574d).keySet()).toArray(new TextWatcher[((C111059i) this.f311574d).f332583f])) {
                    beforeTextChanged.beforeTextChanged(charSequence, i, i2, i3);
                }
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!(C104930w0.this.f311565q > 0)) {
                mo148951a(charSequence, i, i3, StyleSpan.class);
                mo148951a(charSequence, i, i3, RelativeSizeSpan.class);
                mo148951a(charSequence, i, i3, AlignmentSpan.class);
                if (!((C111059i) this.f311574d).isEmpty()) {
                    for (TextWatcher onTextChanged : (TextWatcher[]) ((C118556h.C118559c) ((C111055b) this.f311574d).keySet()).toArray(new TextWatcher[((C111059i) this.f311574d).f332583f])) {
                        onTextChanged.onTextChanged(charSequence, i, i2, i3);
                    }
                }
            }
        }
    }

    public C104930w0(Context context) {
        super(context);
        C104934d dVar = new C104934d((C104931a) null);
        this.f311562n = dVar;
        this.f311559h = new C111055b();
        this.f311561j = new C111055b();
        this.f311560i = new C111055b();
        this.f311564p = new C104936z0(this);
        setBackgroundDrawable((Drawable) null);
        setIncludeFontPadding(false);
        mo148930s(3);
        setSingleLine(true);
        setTextCursorDrawable(C0966R.C0969drawable.f4481dt);
        setTextIsSelectable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setLineSpacing(0.0f, 1.0f);
        setTypeface(Typeface.SANS_SERIF);
        super.addTextChangedListener(dVar);
        super.setPadding(0, 0, 0, 0);
        super.setEditableFactory(new C104931a());
        if (mo148800d()) {
            this.f311558g = new C104829b(this);
        } else {
            this.f311558g = null;
        }
    }

    /* renamed from: A */
    public final void mo148918A() {
        this.f311565q = Math.max(0, this.f311565q - 1);
    }

    /* renamed from: B */
    public final void mo148919B(CharSequence charSequence) {
        mo148943w();
        Editable editableText = getEditableText();
        if (editableText == null) {
            setText(charSequence, TextView.BufferType.EDITABLE);
        } else {
            clearComposingText();
            if (TextUtils.isEmpty(charSequence)) {
                editableText.clear();
            } else {
                editableText.replace(0, editableText.length(), charSequence);
            }
        }
        mo148918A();
    }

    /* renamed from: C */
    public void mo148888C(char c) {
        this.f311569u = c;
    }

    /* renamed from: a */
    public boolean mo148793a() {
        return this.f311566r;
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        C104934d dVar = this.f311562n;
        if (textWatcher != null) {
            ((C111059i) dVar.f311574d).put(textWatcher, dVar);
        } else {
            dVar.getClass();
        }
    }

    /* renamed from: b */
    public void mo148798b(C104863f1.C104864a aVar) {
        if (aVar != null) {
            this.f311559h.put(aVar, this);
        }
    }

    /* renamed from: c */
    public void mo148799c(View.OnFocusChangeListener onFocusChangeListener) {
        if (onFocusChangeListener != null) {
            ((C111059i) this.f311560i).remove(onFocusChangeListener);
        }
    }

    public void clearFocus() {
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setFocusableInTouchMode(true);
            ((ViewGroup) getParent()).setDescendantFocusability(131072);
        }
        super.clearFocus();
    }

    /* renamed from: d */
    public boolean mo148800d() {
        return !(this instanceof C104858e0);
    }

    public void destroy() {
        ((C111059i) this.f311559h).clear();
        ((C111059i) this.f311561j).clear();
        ((C111059i) this.f311560i).clear();
        ((C111059i) this.f311562n.f311574d).clear();
        C104829b bVar = this.f311558g;
        if (bVar != null) {
            bVar.mo148723a();
        }
        super.setOnFocusChangeListener((View.OnFocusChangeListener) null);
    }

    /* renamed from: e */
    public void mo148802e() {
        mo148930s(1);
    }

    /* renamed from: f */
    public void mo148803f() {
        mo148930s(5);
    }

    /* renamed from: g */
    public void mo148804g(C83780d1 d1Var) {
        C104829b bVar = this.f311558g;
        if (bVar != null) {
            C104837c cVar = bVar.f311342d;
            cVar.getClass();
            C84996v b = C84996v.m104810b(d1Var);
            C84996v.C85001d dVar = cVar.f311356c;
            if (dVar == null) {
                b.getClass();
            } else {
                ((C111059i) b.f247697d).remove(dVar);
            }
        }
    }

    public C104829b getAutoFillController() {
        return this.f311558g;
    }

    public int getAutofillType() {
        return 0;
    }

    public int getInputId() {
        return this.f311557f;
    }

    public abstract /* synthetic */ View getInputPanel();

    public char getLastKeyPressed() {
        return this.f311569u;
    }

    public Drawable getTextSelectHandle() {
        try {
            return super.getTextSelectHandle();
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public final View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo148811h(View.OnFocusChangeListener onFocusChangeListener) {
        if (onFocusChangeListener != null) {
            this.f311560i.put(onFocusChangeListener, this);
        }
    }

    /* renamed from: j */
    public void mo148812j() {
        mo148930s(3);
    }

    /* renamed from: k */
    public void mo148813k(C83780d1 d1Var) {
        C104829b bVar = this.f311558g;
        if (bVar != null) {
            C104837c cVar = bVar.f311342d;
            cVar.f311357d = d1Var;
            C84996v b = C84996v.m104810b(d1Var);
            C84996v.C85001d dVar = cVar.f311356c;
            if (dVar == null) {
                b.getClass();
            } else if (!((C111059i) b.f247697d).containsKey(dVar)) {
                ((C111059i) b.f247697d).put(dVar, b);
            }
        }
    }

    /* renamed from: l */
    public void mo148814l(C104863f1.C104866c cVar) {
        if (cVar != null) {
            this.f311561j.put(cVar, this);
        }
    }

    /* renamed from: m */
    public boolean mo117831m() {
        return false;
    }

    /* renamed from: n */
    public void mo148773n(float f, float f2) {
        throw new IllegalStateException("Should implement performClick(float, float) in this class!");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!((C111059i) this.f311559h).isEmpty()) {
            for (C104863f1.C104864a onConfigurationChanged : (C104863f1.C104864a[]) ((C111055b) this.f311559h).keySet().toArray(new C104863f1.C104864a[((C111059i) this.f311559h).f332583f])) {
                onConfigurationChanged.onConfigurationChanged(configuration);
            }
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        this.f311555d = new C104932b(onCreateInputConnection, false, onCreateInputConnection);
        editorInfo.imeOptions |= 268435456;
        if (getImeOptions() != 0) {
            editorInfo.imeOptions &= -1073741825;
        }
        return this.f311555d;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            clearComposingText();
        }
        if (z) {
            mo148790v();
        }
        if (!((C111059i) this.f311560i).isEmpty()) {
            for (View.OnFocusChangeListener onFocusChange : (View.OnFocusChangeListener[]) ((C111055b) this.f311560i).keySet().toArray(new View.OnFocusChangeListener[((C111059i) this.f311560i).f332583f])) {
                onFocusChange.onFocusChange(this, z);
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 67) {
            mo148888C(8);
        }
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        if (onKeyDown && i == 66) {
            mo148888C(10);
        }
        this.f311567s = onKeyDown;
        return onKeyDown;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C104863f1.C104865b bVar;
        if (this.f311567s || (bVar = this.f311568t) == null || !bVar.mo148819a(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Log.m105926v("MicroMsg.AppBrand.WebEditText", "[scrollUp] input onLayout");
        super.onLayout(z, i, i2, i3, i4);
    }

    public final void onMeasure(int i, int i2) {
        Log.m105926v("MicroMsg.AppBrand.WebEditText", "[scrollUp] input onMeasure");
        super.onMeasure(i, i2);
        if (!((C111059i) this.f311561j).isEmpty()) {
            for (Object obj : ((C111055b) this.f311561j).keySet().toArray()) {
                ((C104863f1.C104866c) obj).mo148728a(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: q */
    public int mo148815q(int i) {
        int paddingTop = getPaddingTop() + ((int) (((float) i) * (((float) getLineHeight()) + getLineSpacingExtra())));
        Log.m105919d("MicroMsg.AppBrand.WebEditText", "calculateLinePosition, lineNumber %d, returnHeight %d, layout %s", Integer.valueOf(i), Integer.valueOf(paddingTop), getLayout());
        return paddingTop;
    }

    /* renamed from: r */
    public void mo148897r(CharSequence charSequence) {
        if (getEditableText() == null) {
            setText(charSequence, TextView.BufferType.EDITABLE);
        } else {
            getEditableText().append(charSequence);
        }
        setSelection(getEditableText().length());
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        C104934d dVar = this.f311562n;
        if (textWatcher != null) {
            ((C111059i) dVar.f311574d).remove(textWatcher);
        } else {
            dVar.getClass();
        }
    }

    public boolean requestFocus(int i, Rect rect) {
        if (130 == i && rect == null && (getParent() instanceof ViewGroup)) {
            ((ViewGroup) getParent()).setDescendantFocusability(262144);
            ((ViewGroup) getParent()).setFocusableInTouchMode(false);
        }
        try {
            return super.requestFocus(i, rect);
        } catch (RuntimeException e) {
            Log.m105921e("MicroMsg.AppBrand.WebEditText", "requestFocus e=%s", e);
            try {
                return super.requestFocus(i, rect);
            } catch (RuntimeException e2) {
                Log.m105921e("MicroMsg.AppBrand.WebEditText", "requestFocus try again e=%s", e2);
                return false;
            }
        }
    }

    /* renamed from: s */
    public final void mo148930s(int i) {
        setGravity(i | (getGravity() & -8388612 & -8388614));
        int gravity = getGravity();
        CharSequence hint = getHint();
        if (!TextUtils.isEmpty(hint)) {
            Class cls = C84975p1.f247639d;
            if (hint == null) {
                hint = "";
            }
            Spannable spannableStringBuilder = hint instanceof Spannable ? (Spannable) hint : new SpannableStringBuilder(hint);
            int i2 = gravity & 7;
            int i3 = 5;
            Layout.Alignment alignment = i2 != 1 ? i2 != 5 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(alignment), 0, getHint().length(), 18);
            super.setHint(spannableStringBuilder);
            int i4 = C104933c.f311573a[alignment.ordinal()];
            if (i4 == 1) {
                i3 = 4;
            } else if (i4 == 2) {
                i3 = 6;
            }
            super.setTextAlignment(i3);
        }
    }

    public void setFixed(boolean z) {
        this.f311566r = z;
    }

    public void setInputId(int i) {
        this.f311557f = i;
    }

    public void setInputType(int i) {
        if (getInputType() != i) {
            super.setInputType(i);
        }
    }

    public void setMaxHeight(int i) {
        if (getMaxHeight() != i) {
            super.setMaxHeight(i);
        }
    }

    public void setMinHeight(int i) {
        if (getMinHeight() != i) {
            super.setMinHeight(i);
        }
    }

    public void setOnComposingDismissedListener(C110064b bVar) {
        this.f311564p.f311583f = bVar;
    }

    @Deprecated
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.f311560i == null) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            mo148811h(onFocusChangeListener);
        }
    }

    public void setOnKeyUpPostImeListener(C104863f1.C104865b bVar) {
        this.f311568t = bVar;
    }

    public void setPasswordMode(boolean z) {
        mo148943w();
        this.f311556e = z;
        setTransformationMethod(z ? this.f311563o : null);
        mo148918A();
    }

    public void setSelection(int i) {
        if (getEditableText() != null) {
            super.setSelection(Math.min(i, getEditableText().length()));
        }
    }

    public void setSingleLine(boolean z) {
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    public final void setTextCursorDrawable(int i) {
        try {
            C87527b bVar = new C87527b(this, "mCursorDrawableRes", TextView.class.getName());
            Integer valueOf = Integer.valueOf(i);
            bVar.mo121999b();
            Field field = bVar.f253583d;
            if (field != null) {
                field.set(bVar.f253580a, valueOf);
                return;
            }
            throw new NoSuchFieldException();
        } catch (Exception e) {
            Log.m105919d("MicroMsg.AppBrand.WebEditText", "setTextCursorDrawable, exp = %s", Util.stackTraceToString(e));
        }
    }

    public final void setTextSize(float f) {
        setTextSize(0, f);
    }

    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
    }

    /* renamed from: t */
    public int mo148941t() {
        return mo148815q(getLineCount()) + getPaddingBottom();
    }

    public String toString() {
        return String.format(Locale.US, "[%s|%s]", new Object[]{getClass().getSimpleName(), Integer.valueOf(getInputId())});
    }

    /* renamed from: u */
    public void mo148901u() {
        if (this.f311555d == null) {
            dispatchKeyEvent(new KeyEvent(0, 67));
            dispatchKeyEvent(new KeyEvent(1, 67));
        } else if (!Util.isNullOrNil((CharSequence) getEditableText())) {
            ((C104932b) this.f311555d).deleteSurroundingText(getEditableText().length(), getEditableText().length() - 1);
        }
    }

    /* renamed from: v */
    public abstract void mo148790v();

    /* renamed from: w */
    public final void mo148943w() {
        this.f311565q++;
    }

    /* renamed from: x */
    public final void mo148944x() {
        super.clearFocus();
    }

    /* renamed from: y */
    public final boolean mo148945y(int i, Rect rect) {
        return super.requestFocus(i, rect);
    }

    /* renamed from: z */
    public Editable mo148791z(Editable editable) {
        this.f311564p.mo148956a(editable);
        return editable;
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
    }

    public void setTypeface(Typeface typeface, int i) {
        super.setTypeface(typeface, i);
    }

    public void setSelection(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i >= getEditableText().length()) {
            i = getEditableText().length();
        }
        if (i2 < i) {
            i2 = i;
        }
        if (i2 >= getEditableText().length()) {
            i2 = getEditableText().length();
        }
        super.setSelection(i, i2);
    }
}
