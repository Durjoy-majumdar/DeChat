package com.tencent.p014mm.p136ui.widget.cedit.edit;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.BlendMode;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.BoringLayout;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.ParcelableSpan;
import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DateKeyListener;
import android.text.method.DateTimeKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TimeKeyListener;
import android.text.method.TransformationMethod;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ParagraphStyle;
import android.text.style.SuggestionSpan;
import android.text.style.URLSpan;
import android.text.style.UpdateAppearance;
import android.text.util.Linkify;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.view.textservice.TextServicesManager;
import android.widget.RemoteViews;
import android.widget.Scroller;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.p136ui.widget.cedit.api.MMCustomEditText;
import com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a;
import com.tencent.p014mm.p136ui.widget.cedit.move.ArrowKeyMovementMethod;
import com.tencent.p014mm.p136ui.widget.cedit.move.LinkMovementMethod;
import com.tencent.p014mm.p136ui.widget.cedit.util.ParcelableParcel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import jo3.C76430b;
import k20.C9556a;
import ko3.C109028a;
import ko3.C109029c;
import mo3.C109633a;
import no3.C109754a;
import no3.C109755b;
import oo3.C110057b;
import ro3.C110588j;
import xi3.C78844a;

@RemoteViews.RemoteView
/* renamed from: com.tencent.mm.ui.widget.cedit.edit.CustomTextView */
public class CustomTextView extends View implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: J1 */
    public static final float[] f319236J1 = new float[2];

    /* renamed from: K1 */
    public static final RectF f319237K1 = new RectF();

    /* renamed from: L1 */
    public static final InputFilter[] f319238L1 = new InputFilter[0];

    /* renamed from: M1 */
    public static final Spanned f319239M1 = new SpannedString("");

    /* renamed from: N1 */
    public static final int[] f319240N1 = {16843597};

    /* renamed from: O1 */
    public static final SparseIntArray f319241O1;

    /* renamed from: P1 */
    public static final BoringLayout.Metrics f319242P1 = new BoringLayout.Metrics();
    @ViewDebug.ExportedProperty(category = "text")

    /* renamed from: A */
    public CharSequence f319243A;

    /* renamed from: A1 */
    public boolean f319244A1;

    /* renamed from: B */
    public Spannable f319245B;

    /* renamed from: B1 */
    public C106778a f319246B1;

    /* renamed from: C */
    public CharSequence f319247C;

    /* renamed from: C1 */
    public TextView f319248C1;

    /* renamed from: D */
    public TextView.BufferType f319249D;

    /* renamed from: D1 */
    public TextWatcher f319250D1;

    /* renamed from: E */
    public CharSequence f319251E;

    /* renamed from: E1 */
    public int f319252E1;

    /* renamed from: F */
    public Layout f319253F;

    /* renamed from: F1 */
    public boolean f319254F1;

    /* renamed from: G */
    public C109633a f319255G;

    /* renamed from: G1 */
    public C110588j.C110590c f319256G1;

    /* renamed from: H */
    public TransformationMethod f319257H;

    /* renamed from: H1 */
    public Set<String> f319258H1;

    /* renamed from: I */
    public C106776e f319259I;

    /* renamed from: I1 */
    public Set<String> f319260I1;

    /* renamed from: J */
    public ArrayList<TextWatcher> f319261J;

    /* renamed from: K */
    public TextPaint f319262K;

    /* renamed from: L */
    public boolean f319263L;

    /* renamed from: M */
    public Layout f319264M;

    /* renamed from: N */
    public boolean f319265N;

    /* renamed from: P */
    public int f319266P;

    /* renamed from: Q */
    public boolean f319267Q;

    /* renamed from: Q0 */
    public int f319268Q0;

    /* renamed from: R */
    public boolean f319269R;

    /* renamed from: R0 */
    public int f319270R0;

    /* renamed from: S */
    public boolean f319271S;

    /* renamed from: S0 */
    public int f319272S0;
    @ViewDebug.ExportedProperty(category = "text")

    /* renamed from: T */
    public int f319273T;

    /* renamed from: T0 */
    public int f319274T0;

    /* renamed from: U */
    public boolean f319275U;

    /* renamed from: U0 */
    public int f319276U0;

    /* renamed from: V */
    public int f319277V;

    /* renamed from: V0 */
    public int f319278V0;

    /* renamed from: W */
    public boolean f319279W;

    /* renamed from: W0 */
    public int f319280W0;

    /* renamed from: X0 */
    public int f319281X0;

    /* renamed from: Y0 */
    public int f319282Y0;

    /* renamed from: Z0 */
    public boolean f319283Z0;

    /* renamed from: a1 */
    public int f319284a1;

    /* renamed from: b1 */
    public boolean f319285b1;

    /* renamed from: c1 */
    public int f319286c1;

    /* renamed from: d */
    public ColorStateList f319287d;

    /* renamed from: d1 */
    public Rect f319288d1;

    /* renamed from: e */
    public ColorStateList f319289e;

    /* renamed from: e1 */
    public long f319290e1;

    /* renamed from: f */
    public ColorStateList f319291f;

    /* renamed from: f1 */
    public Scroller f319292f1;
    @ViewDebug.ExportedProperty(category = "text")

    /* renamed from: g */
    public int f319293g;

    /* renamed from: g1 */
    public BoringLayout.Metrics f319294g1;

    /* renamed from: h */
    public int f319295h;

    /* renamed from: h1 */
    public BoringLayout.Metrics f319296h1;

    /* renamed from: i */
    public boolean f319297i;

    /* renamed from: i1 */
    public BoringLayout f319298i1;

    /* renamed from: j */
    public Editable.Factory f319299j;

    /* renamed from: j1 */
    public BoringLayout f319300j1;

    /* renamed from: k1 */
    public TextDirectionHeuristic f319301k1;

    /* renamed from: l1 */
    public InputFilter[] f319302l1;

    /* renamed from: m1 */
    public UserHandle f319303m1;

    /* renamed from: n */
    public Spannable.Factory f319304n;

    /* renamed from: n1 */
    public int f319305n1;

    /* renamed from: o */
    public float f319306o;

    /* renamed from: o1 */
    public Path f319307o1;

    /* renamed from: p */
    public float f319308p;

    /* renamed from: p0 */
    public float f319309p0;

    /* renamed from: p1 */
    public Paint f319310p1;

    /* renamed from: q */
    public float f319311q;

    /* renamed from: q1 */
    public boolean f319312q1;

    /* renamed from: r */
    public int f319313r;

    /* renamed from: r1 */
    public int f319314r1;

    /* renamed from: s */
    public boolean f319315s;

    /* renamed from: s1 */
    public Drawable f319316s1;

    /* renamed from: t */
    public boolean f319317t;

    /* renamed from: t1 */
    public int f319318t1;

    /* renamed from: u */
    public TextClassifier f319319u;

    /* renamed from: u1 */
    public Drawable f319320u1;

    /* renamed from: v */
    public TextClassifier f319321v;

    /* renamed from: v1 */
    public int f319322v1;

    /* renamed from: w */
    public TextClassificationContext f319323w;

    /* renamed from: w1 */
    public Drawable f319324w1;

    /* renamed from: x */
    public boolean f319325x;

    /* renamed from: x0 */
    public float f319326x0;

    /* renamed from: x1 */
    public int f319327x1;

    /* renamed from: y */
    public TextUtils.TruncateAt f319328y;

    /* renamed from: y0 */
    public int f319329y0;

    /* renamed from: y1 */
    public Drawable f319330y1;

    /* renamed from: z */
    public C106777f f319331z;

    /* renamed from: z1 */
    public int f319332z1;

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.CustomTextView$g */
    public interface C74978g {
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.CustomTextView$a */
    public class C106772a implements TextWatcher {
        public C106772a() {
        }

        public void afterTextChanged(Editable editable) {
            ((Editable) CustomTextView.this.getText()).insert(CustomTextView.this.getSelectionStart(), editable.toString());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.CustomTextView$b */
    public class C106773b extends SparseIntArray {
        public void put(int i, int i2) {
            try {
                super.put(i, i2);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.CustomTextView$c */
    public class C106774c implements Runnable {
        public C106774c() {
        }

        public void run() {
            CustomTextView customTextView = CustomTextView.this;
            boolean Q = customTextView.mo153982Q();
            Log.m105924i("cmEdit.CMTextView", "checkInitAdaptEdt isNeedReuseMenuItems:" + Q);
            if (Q) {
                boolean isAttachedToWindow = customTextView.isAttachedToWindow();
                Log.m105924i("cmEdit.CMTextView", "checkInitAdaptEdt isWindowAttached:" + isAttachedToWindow);
                if (isAttachedToWindow) {
                    Log.m105924i("cmEdit.CMTextView", "checkInitAdaptEdt mIsInitAdapt:" + customTextView.f319254F1);
                    if (!customTextView.f319254F1) {
                        customTextView.f319254F1 = true;
                        try {
                            AdaptEditText adaptEditText = new AdaptEditText(customTextView.getContext());
                            if (customTextView.getParent() instanceof ViewGroup) {
                                ((ViewGroup) customTextView.getParent()).addView(adaptEditText);
                                adaptEditText.setVisibility(8);
                                customTextView.setAdaptText(adaptEditText);
                            }
                        } catch (Throwable th) {
                            Log.m105921e("cmEdit.CMTextView", "initAdapt err:%s", Util.stackTraceToString(th));
                            C76430b.m91852a(7);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.CustomTextView$d */
    public static /* synthetic */ class C106775d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f319341a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f319341a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f319341a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f319341a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.C106775d.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.CustomTextView$e */
    public class C106776e implements TextWatcher, SpanWatcher {

        /* renamed from: d */
        public CharSequence f319342d;

        public C106776e(C106772a aVar) {
        }

        public void afterTextChanged(Editable editable) {
            ArrayList<TextWatcher> arrayList = CustomTextView.this.f319261J;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList.get(i).afterTextChanged(editable);
                }
            }
            if (MetaKeyKeyListener.getMetaState(editable, 2048) != 0) {
                C109755b.m149079b(CustomTextView.this, editable);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2;
            if (C78844a.C15689b.f42385a.mo108842h(true) && (charSequence2 = CustomTextView.this.f319247C) != null) {
                this.f319342d = charSequence2.toString();
            }
            CustomTextView customTextView = CustomTextView.this;
            float[] fArr = CustomTextView.f319236J1;
            customTextView.mo154125h0(charSequence, i, i2, i3);
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            CustomTextView.this.mo154160r0(spannable, obj, -1, i, -1, i2);
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            CustomTextView.this.mo154160r0(spannable, obj, i, i3, i2, i4);
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            CustomTextView.this.mo154160r0(spannable, obj, i, -1, i2, -1);
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CustomTextView customTextView = CustomTextView.this;
            customTextView.getClass();
            float[] fArr = CustomTextView.f319236J1;
            C106778a aVar = customTextView.f319246B1;
            C106778a.C106788j jVar = aVar == null ? null : aVar.f319400k;
            if (jVar == null || jVar.f319471c == 0) {
                customTextView.mo154263v0();
            }
            if (jVar != null) {
                jVar.f319474f = true;
                int i4 = jVar.f319475g;
                if (i4 < 0) {
                    jVar.f319475g = i;
                    jVar.f319476h = i + i2;
                } else {
                    jVar.f319475g = Math.min(i4, i);
                    jVar.f319476h = Math.max(jVar.f319476h, (i + i2) - jVar.f319477i);
                }
                jVar.f319477i += i3 - i2;
            }
            customTextView.mo154127i0(charSequence, i, i2, i3);
            if (!C78844a.C15689b.f42385a.mo108842h(true)) {
                return;
            }
            if (CustomTextView.this.isFocused() || (CustomTextView.this.isSelected() && CustomTextView.this.isShown())) {
                CharSequence charSequence2 = this.f319342d;
                AccessibilityEvent obtain = AccessibilityEvent.obtain(16);
                obtain.setFromIndex(i);
                obtain.setRemovedCount(i2);
                obtain.setAddedCount(i3);
                obtain.setBeforeText(charSequence2);
                CustomTextView.this.sendAccessibilityEventUnchecked(obtain);
                this.f319342d = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.CustomTextView$f */
    public static class C106777f {

        /* renamed from: a */
        public final Rect f319344a = new Rect();

        /* renamed from: b */
        public final Drawable[] f319345b = new Drawable[4];

        /* renamed from: c */
        public ColorStateList f319346c;

        /* renamed from: d */
        public BlendMode f319347d;

        /* renamed from: e */
        public boolean f319348e;

        /* renamed from: f */
        public boolean f319349f;

        /* renamed from: g */
        public Drawable f319350g;

        /* renamed from: h */
        public Drawable f319351h;

        /* renamed from: i */
        public Drawable f319352i;

        /* renamed from: j */
        public Drawable f319353j;

        /* renamed from: k */
        public int f319354k;

        /* renamed from: l */
        public int f319355l;

        /* renamed from: m */
        public int f319356m;

        /* renamed from: n */
        public int f319357n;

        /* renamed from: o */
        public int f319358o;

        /* renamed from: p */
        public int f319359p;

        /* renamed from: q */
        public int f319360q;

        /* renamed from: r */
        public int f319361r;

        /* renamed from: s */
        public int f319362s;

        public C106777f(Context context) {
            int i = context.getApplicationInfo().targetSdkVersion;
        }
    }

    static {
        C106773b bVar = new C106773b();
        f319241O1 = bVar;
        bVar.put(5, 5);
        bVar.put(4, 4);
        bVar.put(6, 6);
        bVar.put(7, 7);
        bVar.put(1, 1);
        try {
            bVar.put(89, 89);
        } catch (Throwable unused) {
        }
        SparseIntArray sparseIntArray = f319241O1;
        sparseIntArray.put(2, 2);
        sparseIntArray.put(68, 68);
        sparseIntArray.put(3, 3);
        sparseIntArray.put(88, 88);
        sparseIntArray.put(65, 65);
        sparseIntArray.put(34, 34);
        sparseIntArray.put(35, 35);
        sparseIntArray.put(36, 36);
        sparseIntArray.put(37, 37);
        sparseIntArray.put(69, 69);
        sparseIntArray.put(84, 84);
        sparseIntArray.put(70, 70);
        sparseIntArray.put(71, 71);
        sparseIntArray.put(83, 83);
    }

    public CustomTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.style.f8573nj);
    }

    /* renamed from: D */
    public static int m144190D(Layout layout) {
        int lineCount = layout.getLineCount();
        CharSequence text = layout.getText();
        for (int i = 0; i < lineCount - 1; i++) {
            if (text.charAt(layout.getLineEnd(i) - 1) != 10) {
                return -1;
            }
        }
        float f = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            f = Math.max(f, layout.getLineWidth(i2));
        }
        return (int) Math.ceil((double) f);
    }

    /* renamed from: R */
    public static boolean m144191R(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    private Locale getCustomLocaleForKeyListenerOrNull() {
        LocaleList imeHintLocales;
        if (this.f319269R && (imeHintLocales = getImeHintLocales()) != null && Build.VERSION.SDK_INT >= 24) {
            return imeHintLocales.get(0);
        }
        return null;
    }

    private int getDesiredHeight() {
        boolean z = true;
        int H = mo153974H(this.f319264M, true);
        Layout layout = this.f319253F;
        if (this.f319328y == null) {
            z = false;
        }
        return Math.max(H, mo153974H(layout, z));
    }

    private InputMethodManager getInputMethodManager() {
        return Build.VERSION.SDK_INT >= 23 ? (InputMethodManager) getContext().getSystemService(InputMethodManager.class) : (InputMethodManager) getContext().getSystemService("input_method");
    }

    private Layout.Alignment getLayoutAlignment() {
        switch (getTextAlignment()) {
            case 1:
                int i = this.f319273T & 8388615;
                if (i != 1) {
                    if (i != 3) {
                        if (i == 5) {
                            Log.m105924i("cmEdit.CMTextView", "getTextAlignment() Gravity.RIGHT");
                            break;
                        } else {
                            return i != 8388611 ? i != 8388613 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else {
                        Log.m105924i("cmEdit.CMTextView", "getTextAlignment() Gravity.LEFT");
                        break;
                    }
                } else {
                    return Layout.Alignment.ALIGN_CENTER;
                }
            case 2:
                return Layout.Alignment.ALIGN_NORMAL;
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 4:
                return Layout.Alignment.ALIGN_CENTER;
            case 5:
                Log.m105924i("cmEdit.CMTextView", "getTextAlignment() TEXT_ALIGNMENT_VIEW_START");
                break;
            case 6:
                Log.m105924i("cmEdit.CMTextView", "getTextAlignment() TEXT_ALIGNMENT_VIEW_END");
                break;
            default:
                return Layout.Alignment.ALIGN_NORMAL;
        }
        return null;
    }

    private Path getUpdatedHighlightPath() {
        Paint paint = this.f319310p1;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.f319255G != null && ((isFocused() || isPressed()) && selectionStart >= 0)) {
            if (selectionStart == selectionEnd) {
                C106778a aVar = this.f319246B1;
                if (aVar != null) {
                    boolean z = true;
                    if (!(aVar.f319411v && aVar.f319383U.mo153985U()) || (!aVar.f319409t && (SystemClock.uptimeMillis() - aVar.f319408s) % 1000 >= 500)) {
                        z = false;
                    }
                    if (z) {
                        if (this.f319312q1) {
                            if (this.f319307o1 == null) {
                                this.f319307o1 = new Path();
                            }
                            this.f319307o1.reset();
                            this.f319264M.getCursorPath(selectionStart, this.f319307o1, this.f319243A);
                            C106778a aVar2 = this.f319246B1;
                            if (aVar2.f319368F == null) {
                                aVar2.f319368F = aVar2.f319383U.getTextCursorDrawable();
                            }
                            if (aVar2.f319368F != null) {
                                Layout layout = aVar2.f319383U.getLayout();
                                int selectionStart2 = aVar2.f319383U.getSelectionStart();
                                int lineForOffset = layout.getLineForOffset(selectionStart2);
                                int lineTop = layout.getLineTop(lineForOffset);
                                int lineBottom = layout.getLineBottom(lineForOffset);
                                float primaryHorizontal = layout.getPrimaryHorizontal(selectionStart2);
                                if (aVar2.f319368F == null) {
                                    aVar2.f319368F = aVar2.f319383U.getTextCursorDrawable();
                                }
                                int d = aVar2.mo154299d(aVar2.f319368F, primaryHorizontal);
                                int intrinsicWidth = aVar2.f319368F.getIntrinsicWidth();
                                Drawable drawable = aVar2.f319368F;
                                Rect rect = aVar2.f319382T;
                                drawable.setBounds(d, lineTop - rect.top, intrinsicWidth + d, lineBottom + rect.bottom);
                            }
                            this.f319312q1 = false;
                        }
                        paint.setColor(this.f319293g);
                        paint.setStyle(Paint.Style.STROKE);
                        return this.f319307o1;
                    }
                }
            } else {
                if (this.f319312q1) {
                    if (this.f319307o1 == null) {
                        this.f319307o1 = new Path();
                    }
                    this.f319307o1.reset();
                    this.f319264M.getSelectionPath(selectionStart, selectionEnd, this.f319307o1);
                    this.f319312q1 = false;
                }
                paint.setColor(this.f319305n1);
                paint.setStyle(Paint.Style.FILL);
                return this.f319307o1;
            }
        }
        return null;
    }

    private void setHintInternal(CharSequence charSequence) {
        this.f319251E = TextUtils.stringOrSpannedString(charSequence);
        if (this.f319264M != null) {
            mo154270z();
        }
        if (this.f319243A.length() == 0) {
            invalidate();
        }
        if (this.f319246B1 != null) {
            this.f319243A.length();
        }
    }

    private void setInputTypeSingleLine(boolean z) {
        C106778a aVar = this.f319246B1;
        if (aVar != null) {
            int i = aVar.f319405p;
            if ((i & 15) != 1) {
                return;
            }
            if (z) {
                aVar.f319405p = -131073 & i;
            } else {
                aVar.f319405p = 131072 | i;
            }
        }
    }

    private void setKeyListenerOnly(KeyListener keyListener) {
        if (this.f319246B1 != null || keyListener != null) {
            mo153970C();
            C106778a aVar = this.f319246B1;
            if (aVar.f319404o != keyListener) {
                aVar.f319404o = keyListener;
                if (keyListener != null) {
                    CharSequence charSequence = this.f319243A;
                    if (!(charSequence instanceof Editable)) {
                        setText(charSequence);
                    }
                }
                mo154130j0((Editable) this.f319243A, this.f319302l1);
            }
        }
    }

    private void setTextInternal(CharSequence charSequence) {
        this.f319243A = charSequence;
        this.f319245B = charSequence instanceof Spannable ? (Spannable) charSequence : null;
    }

    /* renamed from: A */
    public final void mo153968A() {
        boolean z = true;
        boolean z2 = false;
        if (this.f319264M != null) {
            if (getLayoutParams().width == -2) {
                invalidate();
                z2 = true;
            }
            if (getLayoutParams().height != -2 ? getLayoutParams().height != -1 || this.f319284a1 < 0 || getDesiredHeight() == this.f319284a1 : getDesiredHeight() == getHeight()) {
                z = z2;
            }
        } else {
            z = false;
        }
        if (z) {
            requestLayout();
        }
    }

    /* renamed from: B */
    public float mo153969B(float f) {
        return Math.min((float) ((getWidth() - getTotalPaddingRight()) - 1), Math.max(0.0f, f - ((float) getTotalPaddingLeft()))) + ((float) getScrollX());
    }

    /* renamed from: C */
    public final void mo153970C() {
        if (this.f319246B1 == null) {
            this.f319246B1 = new C106778a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0196  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo153971E(int r8, android.view.KeyEvent r9, android.view.KeyEvent r10) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r9.getRepeatCount()
            if (r0 != 0) goto L_0x0016
            boolean r0 = android.view.KeyEvent.isModifierKey(r8)
            if (r0 != 0) goto L_0x0016
            r7.f319325x = r1
        L_0x0016:
            r0 = 4
            r2 = -1
            r3 = 1
            if (r8 == r0) goto L_0x0111
            r0 = 23
            if (r8 == r0) goto L_0x0104
            r0 = 61
            if (r8 == r0) goto L_0x00f7
            r0 = 66
            if (r8 == r0) goto L_0x00b5
            r0 = 112(0x70, float:1.57E-43)
            r4 = 16908320(0x1020020, float:2.387732E-38)
            if (r8 == r0) goto L_0x00a2
            r0 = 124(0x7c, float:1.74E-43)
            r5 = 16908322(0x1020022, float:2.3877324E-38)
            r6 = 16908321(0x1020021, float:2.3877321E-38)
            if (r8 == r0) goto L_0x007a
            r0 = 160(0xa0, float:2.24E-43)
            if (r8 == r0) goto L_0x00b5
            switch(r8) {
                case 277: goto L_0x0067;
                case 278: goto L_0x0054;
                case 279: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x011f
        L_0x0041:
            boolean r0 = r9.hasNoModifiers()
            if (r0 == 0) goto L_0x011f
            boolean r0 = r7.mo154267x()
            if (r0 == 0) goto L_0x011f
            boolean r0 = r7.mo97951b0(r5)
            if (r0 == 0) goto L_0x011f
            return r2
        L_0x0054:
            boolean r0 = r9.hasNoModifiers()
            if (r0 == 0) goto L_0x011f
            boolean r0 = r7.mo154262v()
            if (r0 == 0) goto L_0x011f
            boolean r0 = r7.mo97951b0(r6)
            if (r0 == 0) goto L_0x011f
            return r2
        L_0x0067:
            boolean r0 = r9.hasNoModifiers()
            if (r0 == 0) goto L_0x011f
            boolean r0 = r7.mo154265w()
            if (r0 == 0) goto L_0x011f
            boolean r0 = r7.mo97951b0(r4)
            if (r0 == 0) goto L_0x011f
            return r2
        L_0x007a:
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r0 = r9.hasModifiers(r0)
            if (r0 == 0) goto L_0x008f
            boolean r0 = r7.mo154262v()
            if (r0 == 0) goto L_0x008f
            boolean r0 = r7.mo97951b0(r6)
            if (r0 == 0) goto L_0x011f
            return r2
        L_0x008f:
            boolean r0 = r9.hasModifiers(r3)
            if (r0 == 0) goto L_0x011f
            boolean r0 = r7.mo154267x()
            if (r0 == 0) goto L_0x011f
            boolean r0 = r7.mo97951b0(r5)
            if (r0 == 0) goto L_0x011f
            return r2
        L_0x00a2:
            boolean r0 = r9.hasModifiers(r3)
            if (r0 == 0) goto L_0x011f
            boolean r0 = r7.mo154265w()
            if (r0 == 0) goto L_0x011f
            boolean r0 = r7.mo97951b0(r4)
            if (r0 == 0) goto L_0x011f
            return r2
        L_0x00b5:
            boolean r0 = r9.hasNoModifiers()
            if (r0 == 0) goto L_0x011f
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r7.f319246B1
            if (r0 == 0) goto L_0x00e1
            com.tencent.mm.ui.widget.cedit.edit.a$i r0 = r0.f319399j
            if (r0 == 0) goto L_0x00e1
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$g r0 = r0.f319466f
            if (r0 == 0) goto L_0x00e1
            com.tencent.mm.ui.widget.cedit.api.MMCustomEditText$a r0 = (com.tencent.p014mm.p136ui.widget.cedit.api.MMCustomEditText.C74973a) r0
            boolean r4 = r7 instanceof com.tencent.p014mm.p136ui.widget.cedit.api.C74974a
            if (r4 == 0) goto L_0x00d7
            com.tencent.mm.ui.widget.cedit.api.a$b r0 = r0.f220521a
            r4 = r7
            com.tencent.mm.ui.widget.cedit.api.a r4 = (com.tencent.p014mm.p136ui.widget.cedit.api.C74974a) r4
            boolean r0 = r0.mo93502a(r4, r1, r9)
            goto L_0x00d8
        L_0x00d7:
            r0 = 0
        L_0x00d8:
            if (r0 == 0) goto L_0x00e1
            com.tencent.mm.ui.widget.cedit.edit.a r8 = r7.f319246B1
            com.tencent.mm.ui.widget.cedit.edit.a$i r8 = r8.f319399j
            r8.f319467g = r3
            return r2
        L_0x00e1:
            int r0 = r9.getFlags()
            r0 = r0 & 16
            if (r0 != 0) goto L_0x00ef
            boolean r0 = r7.mo154158q0()
            if (r0 == 0) goto L_0x011f
        L_0x00ef:
            boolean r8 = r7.hasOnClickListeners()
            if (r8 == 0) goto L_0x00f6
            return r1
        L_0x00f6:
            return r2
        L_0x00f7:
            boolean r0 = r9.hasNoModifiers()
            if (r0 != 0) goto L_0x0103
            boolean r0 = r9.hasModifiers(r3)
            if (r0 == 0) goto L_0x011f
        L_0x0103:
            return r1
        L_0x0104:
            boolean r0 = r9.hasNoModifiers()
            if (r0 == 0) goto L_0x011f
            boolean r0 = r7.mo154158q0()
            if (r0 == 0) goto L_0x011f
            return r1
        L_0x0111:
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r7.f319246B1
            if (r0 == 0) goto L_0x011f
            boolean r0 = r0.mo154317v()
            if (r0 != 0) goto L_0x011f
            r7.mo154162s0()
            return r2
        L_0x011f:
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r7.f319246B1
            if (r0 == 0) goto L_0x0163
            android.text.method.KeyListener r0 = r0.f319404o
            if (r0 == 0) goto L_0x0163
            if (r10 == 0) goto L_0x014b
            r7.mo154259t()     // Catch:{ AbstractMethodError -> 0x0148, all -> 0x0143 }
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r7.f319246B1     // Catch:{ AbstractMethodError -> 0x0148, all -> 0x0143 }
            android.text.method.KeyListener r0 = r0.f319404o     // Catch:{ AbstractMethodError -> 0x0148, all -> 0x0143 }
            java.lang.CharSequence r4 = r7.f319243A     // Catch:{ AbstractMethodError -> 0x0148, all -> 0x0143 }
            android.text.Editable r4 = (android.text.Editable) r4     // Catch:{ AbstractMethodError -> 0x0148, all -> 0x0143 }
            boolean r0 = r0.onKeyOther(r7, r4, r10)     // Catch:{ AbstractMethodError -> 0x0148, all -> 0x0143 }
            if (r0 == 0) goto L_0x013e
            r7.mo153972F()
            return r2
        L_0x013e:
            r7.mo153972F()
            r0 = 0
            goto L_0x014c
        L_0x0143:
            r8 = move-exception
            r7.mo153972F()
            throw r8
        L_0x0148:
            r7.mo153972F()
        L_0x014b:
            r0 = 1
        L_0x014c:
            if (r0 == 0) goto L_0x0163
            r7.mo154259t()
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r7.f319246B1
            android.text.method.KeyListener r0 = r0.f319404o
            java.lang.CharSequence r4 = r7.f319243A
            android.text.Editable r4 = (android.text.Editable) r4
            boolean r0 = r0.onKeyDown(r7, r4, r8, r9)
            r7.mo153972F()
            if (r0 == 0) goto L_0x0163
            return r3
        L_0x0163:
            mo3.a r0 = r7.f319255G
            if (r0 == 0) goto L_0x01a5
            android.text.Layout r4 = r7.f319264M
            if (r4 == 0) goto L_0x01a5
            if (r10 == 0) goto L_0x0179
            android.text.Spannable r4 = r7.f319245B     // Catch:{ AbstractMethodError -> 0x0178 }
            boolean r10 = r0.onKeyOther(r7, r4, r10)     // Catch:{ AbstractMethodError -> 0x0178 }
            if (r10 == 0) goto L_0x0176
            return r2
        L_0x0176:
            r10 = 0
            goto L_0x017a
        L_0x0178:
        L_0x0179:
            r10 = 1
        L_0x017a:
            if (r10 == 0) goto L_0x0196
            mo3.a r10 = r7.f319255G
            android.text.Spannable r0 = r7.f319245B
            boolean r10 = r10.onKeyDown(r7, r0, r8, r9)
            if (r10 == 0) goto L_0x0196
            int r9 = r9.getRepeatCount()
            if (r9 != 0) goto L_0x0194
            boolean r8 = android.view.KeyEvent.isModifierKey(r8)
            if (r8 != 0) goto L_0x0194
            r7.f319325x = r3
        L_0x0194:
            r8 = 2
            return r8
        L_0x0196:
            int r9 = r9.getSource()
            r10 = 257(0x101, float:3.6E-43)
            if (r9 != r10) goto L_0x01a5
            switch(r8) {
                case 19: goto L_0x01a2;
                case 20: goto L_0x01a2;
                case 21: goto L_0x01a2;
                case 22: goto L_0x01a2;
                default: goto L_0x01a1;
            }
        L_0x01a1:
            r3 = 0
        L_0x01a2:
            if (r3 == 0) goto L_0x01a5
            return r2
        L_0x01a5:
            boolean r9 = r7.f319325x
            if (r9 == 0) goto L_0x01b0
            boolean r8 = android.view.KeyEvent.isModifierKey(r8)
            if (r8 != 0) goto L_0x01b0
            r1 = -1
        L_0x01b0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.mo153971E(int, android.view.KeyEvent, android.view.KeyEvent):int");
    }

    /* renamed from: F */
    public void mo153972F() {
        C106778a aVar = this.f319246B1;
        if (aVar != null) {
            aVar.f319414y = false;
            C106778a.C106788j jVar = aVar.f319400k;
            if (jVar != null) {
                int i = jVar.f319471c - 1;
                jVar.f319471c = i;
                if (i == 0) {
                    aVar.mo154304i(jVar);
                }
            }
        }
    }

    /* renamed from: G */
    public final void mo153973G() {
        C106778a aVar;
        if (this.f319255G == null && ((aVar = this.f319246B1) == null || aVar.f319404o == null)) {
            setClickable(false);
            setLongClickable(false);
            return;
        }
        setFocusable(true);
        setClickable(true);
        setLongClickable(true);
    }

    /* renamed from: H */
    public final int mo153974H(Layout layout, boolean z) {
        int i;
        if (layout == null) {
            return 0;
        }
        int height = layout.getHeight();
        C106777f fVar = this.f319331z;
        if (fVar != null) {
            height = Math.max(Math.max(height, fVar.f319360q), fVar.f319361r);
        }
        int lineCount = layout.getLineCount();
        int compoundPaddingTop = getCompoundPaddingTop() + getCompoundPaddingBottom();
        int i2 = height + compoundPaddingTop;
        if (this.f319268Q0 != 1) {
            i2 = Math.min(i2, this.f319329y0);
        } else if (z && lineCount > (i = this.f319329y0) && ((layout instanceof DynamicLayout) || (layout instanceof BoringLayout))) {
            int lineTop = layout.getLineTop(i);
            if (fVar != null) {
                lineTop = Math.max(Math.max(lineTop, fVar.f319360q), fVar.f319361r);
            }
            i2 = lineTop + compoundPaddingTop;
            lineCount = this.f319329y0;
        }
        if (this.f319272S0 != 1) {
            i2 = Math.max(i2, this.f319270R0);
        } else if (lineCount < this.f319270R0) {
            i2 += getLineHeight() * (this.f319270R0 - lineCount);
        }
        return Math.max(i2, getSuggestedMinimumHeight());
    }

    /* renamed from: I */
    public int mo153975I(float f) {
        return getLayout().getLineForVertical((int) (Math.min((float) ((getHeight() - getTotalPaddingBottom()) - 1), Math.max(0.0f, f - ((float) getTotalPaddingTop()))) + ((float) getScrollY())));
    }

    /* renamed from: J */
    public int mo153976J(float f, float f2) {
        if (getLayout() == null) {
            return -1;
        }
        return getLayout().getOffsetForHorizontal(mo153975I(f2), mo153969B(f));
    }

    /* renamed from: K */
    public int mo153977K(boolean z) {
        int i;
        int i2;
        Layout layout;
        int i3 = this.f319273T & 112;
        Layout layout2 = this.f319264M;
        if (!z && this.f319243A.length() == 0 && (layout = this.f319253F) != null) {
            layout2 = layout;
        }
        if (i3 != 48) {
            if (layout2 == this.f319253F) {
                i = getCompoundPaddingTop();
                i2 = getCompoundPaddingBottom();
            } else {
                i = getExtendedPaddingTop();
                i2 = getExtendedPaddingBottom();
            }
            int measuredHeight = getMeasuredHeight() - (i + i2);
            int height = layout2.getHeight();
            if (height < measuredHeight) {
                int i4 = measuredHeight - height;
                return i3 == 80 ? i4 : i4 >> 1;
            }
        }
        return 0;
    }

    /* renamed from: L */
    public boolean mo153978L() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        return selectionStart >= 0 && selectionEnd > 0 && selectionStart != selectionEnd;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0524, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0525, code lost:
        r8 = r51;
        r9 = 1;
        r60 = 0;
        r51 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x052d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x052e, code lost:
        r8 = r51;
        com.tencent.p014mm.sdk.platformtools.Log.m105929w("cmEdit.CMTextView", r8, r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x052d A[ExcHandler: IOException (r0v34 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:267:0x0518] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0724  */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x074e  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0761  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x077d  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x078a  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x078f  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x079e  */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x07ad  */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x07bc  */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x07dd  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0822  */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x08ec  */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x0907  */
    /* JADX WARNING: Removed duplicated region for block: B:523:0x0965  */
    /* JADX WARNING: Removed duplicated region for block: B:530:0x097c  */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x097f  */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x0982  */
    /* JADX WARNING: Removed duplicated region for block: B:539:0x0996  */
    /* JADX WARNING: Removed duplicated region for block: B:551:0x09b7  */
    /* JADX WARNING: Removed duplicated region for block: B:552:0x09b9  */
    /* JADX WARNING: Removed duplicated region for block: B:554:0x09bc  */
    /* JADX WARNING: Removed duplicated region for block: B:555:0x09be  */
    /* JADX WARNING: Removed duplicated region for block: B:557:0x09c2  */
    /* JADX WARNING: Removed duplicated region for block: B:559:0x09c9  */
    /* JADX WARNING: Removed duplicated region for block: B:561:0x09d0  */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x09d7  */
    /* JADX WARNING: Removed duplicated region for block: B:566:0x09e1  */
    /* JADX WARNING: Removed duplicated region for block: B:568:0x09ec  */
    /* JADX WARNING: Removed duplicated region for block: B:575:0x0a07  */
    /* JADX WARNING: Removed duplicated region for block: B:580:0x0a28  */
    /* JADX WARNING: Removed duplicated region for block: B:582:0x0a2f  */
    /* JADX WARNING: Removed duplicated region for block: B:584:0x0a36  */
    /* JADX WARNING: Removed duplicated region for block: B:587:0x0a3f  */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x0a72  */
    /* JADX WARNING: Removed duplicated region for block: B:605:0x0a7d  */
    /* JADX WARNING: Removed duplicated region for block: B:606:0x0a8b  */
    /* JADX WARNING: Removed duplicated region for block: B:609:0x0a9b  */
    /* JADX WARNING: Removed duplicated region for block: B:612:0x0aa1  */
    /* JADX WARNING: Removed duplicated region for block: B:615:0x0aa7  */
    /* JADX WARNING: Removed duplicated region for block: B:618:0x0ab5  */
    /* JADX WARNING: Removed duplicated region for block: B:621:0x0abe  */
    /* JADX WARNING: Removed duplicated region for block: B:624:0x0ac5  */
    /* JADX WARNING: Removed duplicated region for block: B:627:0x0acc  */
    /* JADX WARNING: Removed duplicated region for block: B:630:0x0ad3  */
    /* JADX WARNING: Removed duplicated region for block: B:649:? A[RETURN, SYNTHETIC] */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo104412M(android.content.Context r66, android.util.AttributeSet r67, int r68, int r69) {
        /*
            r65 = this;
            r7 = r65
            r1 = r66
            java.lang.String r2 = "Failure reading input extras"
            java.lang.String r3 = "cmEdit.CMTextView"
            java.lang.String r0 = "init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.lang.String r8 = ""
            r7.setTextInternal(r8)
            android.content.res.Resources r0 = r65.getResources()
            android.text.TextPaint r4 = new android.text.TextPaint
            r9 = 1
            r4.<init>(r9)
            r7.f319262K = r4
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r4.density = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r9)
            r7.f319310p1 = r0
            mo3.a r0 = r65.getDefaultMovementMethod()
            r7.f319255G = r0
            r4 = 0
            r7.f319257H = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            android.content.Context r5 = r65.getContext()
            r6 = 18
            int r5 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r5, r6)
            boolean r10 = r65.getDefaultEditable()
            int[] r11 = t40.C77853a.f226868n
            r12 = r67
            r13 = r68
            r14 = r69
            android.content.res.TypedArray r11 = r1.obtainStyledAttributes(r12, r11, r13, r14)
            r16 = 0
            r6 = -1
            if (r11 != 0) goto L_0x0089
            r4 = r0
            r15 = r5
            r17 = r8
            r0 = r10
            r5 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = -1
            r14 = 1711528645(0x6603dac5, float:1.556664E23)
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = -1
            r27 = 0
            r30 = 0
            r31 = 0
            r39 = 0
            r40 = 0
            goto L_0x021a
        L_0x0089:
            int r4 = r11.getIndexCount()
            r24 = r0
            r15 = r5
            r0 = 0
            r5 = 0
            r14 = 1711528645(0x6603dac5, float:1.556664E23)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = -1
            r37 = -1
            r38 = -1
        L_0x00c1:
            if (r0 >= r4) goto L_0x01f2
            int r12 = r11.getIndex(r0)
            android.util.SparseIntArray r13 = f319241O1
            int r13 = r13.get(r12, r6)
            if (r13 != r6) goto L_0x00d0
            goto L_0x0121
        L_0x00d0:
            r6 = 5
            if (r13 != r6) goto L_0x00d8
            int r14 = r11.getColor(r12, r14)
            goto L_0x0121
        L_0x00d8:
            r6 = 4
            if (r13 != r6) goto L_0x00e0
            android.content.res.ColorStateList r24 = r11.getColorStateList(r12)
            goto L_0x0121
        L_0x00e0:
            r6 = 6
            if (r13 != r6) goto L_0x00e8
            android.content.res.ColorStateList r25 = r11.getColorStateList(r12)
            goto L_0x0121
        L_0x00e8:
            r6 = 7
            if (r13 != r6) goto L_0x00f0
            android.content.res.ColorStateList r29 = r11.getColorStateList(r12)
            goto L_0x0121
        L_0x00f0:
            if (r13 != r9) goto L_0x0105
            int r15 = r11.getDimensionPixelSize(r12, r15)
            int r6 = android.os.Build.VERSION.SDK_INT
            r13 = 22
            if (r6 < r13) goto L_0x0121
            android.util.TypedValue r6 = r11.peekValue(r12)
            int r37 = r6.getComplexUnit()
            goto L_0x0121
        L_0x0105:
            r6 = 89
            if (r13 != r6) goto L_0x0129
            java.lang.String r6 = r11.getString(r12)
            if (r6 == 0) goto L_0x0121
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 24
            if (r12 < r13) goto L_0x0121
            android.os.LocaleList r6 = android.os.LocaleList.forLanguageTags(r6)
            boolean r12 = r6.isEmpty()
            if (r12 != 0) goto L_0x0121
            r26 = r6
        L_0x0121:
            r6 = r36
        L_0x0123:
            r9 = r38
        L_0x0125:
            r38 = r4
            goto L_0x01e6
        L_0x0129:
            r6 = 2
            if (r13 != r6) goto L_0x013c
            r6 = r36
            int r6 = r11.getInt(r12, r6)
            r12 = -1
            if (r6 == r12) goto L_0x0123
            if (r16 != 0) goto L_0x0123
            r9 = r38
            r31 = 0
            goto L_0x0125
        L_0x013c:
            r6 = r36
            r9 = 68
            if (r13 != r9) goto L_0x015f
            boolean r9 = r66.isRestricted()
            if (r9 != 0) goto L_0x0154
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ NotFoundException | UnsupportedOperationException -> 0x0153 }
            r13 = 26
            if (r9 < r13) goto L_0x0154
            android.graphics.Typeface r30 = r11.getFont(r12)     // Catch:{ NotFoundException | UnsupportedOperationException -> 0x0153 }
            goto L_0x0154
        L_0x0153:
        L_0x0154:
            if (r30 != 0) goto L_0x015a
            java.lang.String r31 = r11.getString(r12)
        L_0x015a:
            r9 = r38
            r16 = 1
            goto L_0x0125
        L_0x015f:
            r9 = 3
            if (r13 != r9) goto L_0x0167
            int r5 = r11.getInt(r12, r5)
            goto L_0x0123
        L_0x0167:
            r9 = 88
            if (r13 != r9) goto L_0x0172
            r9 = r38
            int r9 = r11.getInt(r12, r9)
            goto L_0x0125
        L_0x0172:
            r9 = r38
            r38 = r4
            r4 = 65
            if (r13 != r4) goto L_0x0182
            r4 = r19
            boolean r19 = r11.getBoolean(r12, r4)
            goto L_0x01e6
        L_0x0182:
            r4 = 34
            if (r13 != r4) goto L_0x018d
            r4 = r17
            int r17 = r11.getInt(r12, r4)
            goto L_0x01e6
        L_0x018d:
            r4 = 35
            if (r13 != r4) goto L_0x0198
            r4 = r35
            float r35 = r11.getFloat(r12, r4)
            goto L_0x01e6
        L_0x0198:
            r4 = 36
            if (r13 != r4) goto L_0x01a3
            r4 = r34
            float r34 = r11.getFloat(r12, r4)
            goto L_0x01e6
        L_0x01a3:
            r4 = 37
            if (r13 != r4) goto L_0x01ae
            r4 = r32
            float r32 = r11.getFloat(r12, r4)
            goto L_0x01e6
        L_0x01ae:
            r4 = 69
            if (r13 != r4) goto L_0x01bb
            r4 = r20
            boolean r20 = r11.getBoolean(r12, r4)
            r21 = 1
            goto L_0x01e6
        L_0x01bb:
            r4 = 84
            if (r13 != r4) goto L_0x01c8
            r4 = r18
            boolean r18 = r11.getBoolean(r12, r4)
            r22 = 1
            goto L_0x01e6
        L_0x01c8:
            r4 = 70
            if (r13 != r4) goto L_0x01d5
            r4 = r33
            float r33 = r11.getFloat(r12, r4)
            r23 = 1
            goto L_0x01e6
        L_0x01d5:
            r4 = 71
            if (r13 != r4) goto L_0x01de
            java.lang.String r27 = r11.getString(r12)
            goto L_0x01e6
        L_0x01de:
            r4 = 83
            if (r13 != r4) goto L_0x01e6
            java.lang.String r28 = r11.getString(r12)
        L_0x01e6:
            int r0 = r0 + 1
            r36 = r6
            r4 = r38
            r6 = -1
            r38 = r9
            r9 = 1
            goto L_0x00c1
        L_0x01f2:
            r6 = r36
            r9 = r38
            r0 = r10
            r19 = r18
            r4 = r24
            r10 = r25
            r39 = r27
            r40 = r28
            r12 = r29
            r25 = r32
            r18 = r33
            r24 = r34
            r27 = r35
            r13 = r37
            r63 = r26
            r26 = r6
            r6 = r9
            r9 = r63
            r64 = r17
            r17 = r8
            r8 = r64
        L_0x021a:
            if (r11 == 0) goto L_0x0227
            int r28 = r11.getIndexCount()
            r63 = r28
            r28 = r8
            r8 = r63
            goto L_0x022a
        L_0x0227:
            r28 = r8
            r8 = 0
        L_0x022a:
            r51 = r2
            r42 = r4
            r32 = r5
            r29 = r6
            r33 = r9
            r41 = r10
            r38 = r12
            r34 = r13
            r37 = r14
            r35 = r15
            r58 = r17
            r1 = -1
            r2 = 0
            r4 = -1
            r5 = 0
            r6 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r43 = -1
            r44 = -1
            r45 = -1
            r46 = -1
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r59 = 0
            r10 = r0
        L_0x0269:
            if (r6 >= r8) goto L_0x05da
            int r0 = r11.getIndex(r6)
            r61 = r8
            r8 = 44
            if (r0 != r8) goto L_0x027b
            boolean r10 = r11.getBoolean(r0, r10)
            goto L_0x031a
        L_0x027b:
            r8 = 41
            if (r0 != r8) goto L_0x0285
            java.lang.CharSequence r47 = r11.getText(r0)
            goto L_0x031a
        L_0x0285:
            r8 = 38
            if (r0 != r8) goto L_0x028f
            int r13 = r11.getInt(r0, r13)
            goto L_0x031a
        L_0x028f:
            r8 = 39
            if (r0 != r8) goto L_0x0299
            java.lang.CharSequence r48 = r11.getText(r0)
            goto L_0x031a
        L_0x0299:
            r8 = 40
            if (r0 != r8) goto L_0x02a3
            boolean r15 = r11.getBoolean(r0, r15)
            goto L_0x031a
        L_0x02a3:
            r8 = 43
            if (r0 != r8) goto L_0x02ad
            boolean r14 = r11.getBoolean(r0, r14)
            goto L_0x031a
        L_0x02ad:
            r8 = 42
            if (r0 != r8) goto L_0x02b7
            int r1 = r11.getInt(r0, r1)
            goto L_0x031a
        L_0x02b7:
            r8 = 31
            if (r0 != r8) goto L_0x02c0
            boolean r12 = r11.getBoolean(r0, r12)
            goto L_0x031a
        L_0x02c0:
            r8 = 10
            if (r0 != r8) goto L_0x02ce
            r8 = 0
            int r0 = r11.getInt(r0, r8)
            r7.f319277V = r0
        L_0x02cb:
            r8 = -1
            goto L_0x033a
        L_0x02ce:
            r8 = 11
            if (r0 != r8) goto L_0x02da
            r8 = 1
            boolean r0 = r11.getBoolean(r0, r8)
            r7.f319279W = r0
            goto L_0x02cb
        L_0x02da:
            r8 = 48
            if (r0 != r8) goto L_0x02e3
            android.graphics.drawable.Drawable r52 = r11.getDrawable(r0)
            goto L_0x031a
        L_0x02e3:
            r8 = 46
            if (r0 != r8) goto L_0x02ec
            android.graphics.drawable.Drawable r54 = r11.getDrawable(r0)
            goto L_0x031a
        L_0x02ec:
            r8 = 49
            if (r0 != r8) goto L_0x02f5
            android.graphics.drawable.Drawable r53 = r11.getDrawable(r0)
            goto L_0x031a
        L_0x02f5:
            r8 = 47
            if (r0 != r8) goto L_0x02fe
            android.graphics.drawable.Drawable r55 = r11.getDrawable(r0)
            goto L_0x031a
        L_0x02fe:
            r8 = 66
            if (r0 != r8) goto L_0x0307
            android.graphics.drawable.Drawable r56 = r11.getDrawable(r0)
            goto L_0x031a
        L_0x0307:
            r8 = 67
            if (r0 != r8) goto L_0x0310
            android.graphics.drawable.Drawable r57 = r11.getDrawable(r0)
            goto L_0x031a
        L_0x0310:
            r8 = 72
            if (r0 != r8) goto L_0x0320
            android.content.res.ColorStateList r0 = r11.getColorStateList(r0)
            r49 = r0
        L_0x031a:
            r62 = r9
        L_0x031c:
            r9 = r50
            goto L_0x04a5
        L_0x0320:
            r8 = 73
            if (r0 != r8) goto L_0x0325
            goto L_0x02cb
        L_0x0325:
            r8 = 50
            if (r0 != r8) goto L_0x032e
            int r9 = r11.getDimensionPixelSize(r0, r9)
            goto L_0x031a
        L_0x032e:
            r8 = 20
            if (r0 != r8) goto L_0x033e
            r8 = -1
            int r0 = r11.getInt(r0, r8)
            r7.setMaxLines(r0)
        L_0x033a:
            r62 = r9
            goto L_0x051f
        L_0x033e:
            r62 = r9
            r8 = -1
            r9 = 13
            if (r0 != r9) goto L_0x034e
            int r0 = r11.getDimensionPixelSize(r0, r8)
            r7.setMaxHeight(r0)
            goto L_0x051f
        L_0x034e:
            r9 = 21
            if (r0 != r9) goto L_0x035b
            int r0 = r11.getInt(r0, r8)
            r7.setLines(r0)
            goto L_0x051f
        L_0x035b:
            r9 = 22
            if (r0 != r9) goto L_0x0368
            int r0 = r11.getDimensionPixelSize(r0, r8)
            r7.setHeight(r0)
            goto L_0x051f
        L_0x0368:
            r9 = 23
            if (r0 != r9) goto L_0x0375
            int r0 = r11.getInt(r0, r8)
            r7.setMinLines(r0)
            goto L_0x051f
        L_0x0375:
            r9 = 15
            if (r0 != r9) goto L_0x0382
            int r0 = r11.getDimensionPixelSize(r0, r8)
            r7.setMinHeight(r0)
            goto L_0x051f
        L_0x0382:
            r9 = 24
            if (r0 != r9) goto L_0x038f
            int r0 = r11.getInt(r0, r8)
            r7.setMaxEms(r0)
            goto L_0x051f
        L_0x038f:
            r9 = 12
            if (r0 != r9) goto L_0x039c
            int r0 = r11.getDimensionPixelSize(r0, r8)
            r7.setMaxWidth(r0)
            goto L_0x051f
        L_0x039c:
            r9 = 25
            if (r0 != r9) goto L_0x03a9
            int r0 = r11.getInt(r0, r8)
            r7.setEms(r0)
            goto L_0x051f
        L_0x03a9:
            r9 = 26
            if (r0 != r9) goto L_0x03b6
            int r0 = r11.getDimensionPixelSize(r0, r8)
            r7.setWidth(r0)
            goto L_0x051f
        L_0x03b6:
            r9 = 27
            if (r0 != r9) goto L_0x03c3
            int r0 = r11.getInt(r0, r8)
            r7.setMinEms(r0)
            goto L_0x051f
        L_0x03c3:
            r9 = 14
            if (r0 != r9) goto L_0x03d0
            int r0 = r11.getDimensionPixelSize(r0, r8)
            r7.setMinWidth(r0)
            goto L_0x051f
        L_0x03d0:
            r9 = 9
            if (r0 != r9) goto L_0x03dd
            int r0 = r11.getInt(r0, r8)
            r7.setGravity(r0)
            goto L_0x051f
        L_0x03dd:
            r8 = 17
            if (r0 != r8) goto L_0x03e7
            java.lang.CharSequence r59 = r11.getText(r0)
            goto L_0x031c
        L_0x03e7:
            r8 = 16
            if (r0 != r8) goto L_0x03f1
            java.lang.CharSequence r58 = r11.getText(r0)
            goto L_0x031c
        L_0x03f1:
            r8 = 28
            if (r0 != r8) goto L_0x0402
            r8 = 0
            boolean r0 = r11.getBoolean(r0, r8)
            if (r0 == 0) goto L_0x051f
            r8 = 1
            r7.setHorizontallyScrolling(r8)
            goto L_0x051f
        L_0x0402:
            r8 = 30
            if (r0 != r8) goto L_0x040c
            boolean r5 = r11.getBoolean(r0, r5)
            goto L_0x031c
        L_0x040c:
            r8 = 8
            if (r0 != r8) goto L_0x0416
            int r4 = r11.getInt(r0, r4)
            goto L_0x031c
        L_0x0416:
            r8 = 53
            if (r0 != r8) goto L_0x041c
            goto L_0x051f
        L_0x041c:
            r8 = 32
            if (r0 != r8) goto L_0x042d
            r8 = 1
            boolean r0 = r11.getBoolean(r0, r8)
            if (r0 != 0) goto L_0x051f
            r9 = 0
            r7.setIncludeFontPadding(r9)
            goto L_0x051f
        L_0x042d:
            r8 = 1
            r9 = 19
            if (r0 != r9) goto L_0x043e
            boolean r0 = r11.getBoolean(r0, r8)
            if (r0 != 0) goto L_0x051f
            r8 = 0
            r7.setCursorVisible(r8)
            goto L_0x051f
        L_0x043e:
            r8 = 33
            if (r0 != r8) goto L_0x0449
            r8 = -1
            int r43 = r11.getInt(r0, r8)
            goto L_0x031c
        L_0x0449:
            r8 = 18
            if (r0 != r8) goto L_0x0458
            r8 = 1065353216(0x3f800000, float:1.0)
            float r0 = r11.getFloat(r0, r8)
            r7.setTextScaleX(r0)
            goto L_0x051f
        L_0x0458:
            r8 = 45
            if (r0 != r8) goto L_0x0465
            r8 = 0
            boolean r0 = r11.getBoolean(r0, r8)
            r7.f319297i = r0
            goto L_0x051f
        L_0x0465:
            if (r0 != 0) goto L_0x0474
            boolean r8 = r65.isEnabled()
            boolean r0 = r11.getBoolean(r0, r8)
            r7.setEnabled(r0)
            goto L_0x051f
        L_0x0474:
            r8 = 29
            if (r0 != r8) goto L_0x047e
            boolean r2 = r11.getBoolean(r0, r2)
            goto L_0x031c
        L_0x047e:
            r8 = 51
            if (r0 != r8) goto L_0x048e
            float r8 = r7.f319326x0
            int r8 = (int) r8
            int r0 = r11.getDimensionPixelSize(r0, r8)
            float r0 = (float) r0
            r7.f319326x0 = r0
            goto L_0x051f
        L_0x048e:
            r8 = 52
            if (r0 != r8) goto L_0x049c
            float r8 = r7.f319309p0
            float r0 = r11.getFloat(r0, r8)
            r7.f319309p0 = r0
            goto L_0x051f
        L_0x049c:
            r8 = 54
            if (r0 != r8) goto L_0x04ad
            r8 = 0
            int r9 = r11.getInt(r0, r8)
        L_0x04a5:
            r50 = r9
            r8 = r51
        L_0x04a9:
            r9 = r62
            goto L_0x05d2
        L_0x04ad:
            r8 = 76
            if (r0 != r8) goto L_0x04be
            r65.mo153970C()
            com.tencent.mm.ui.widget.cedit.edit.a r8 = r7.f319246B1
            r9 = 1
            r11.getBoolean(r0, r9)
            r8.getClass()
            goto L_0x051f
        L_0x04be:
            r8 = 57
            if (r0 != r8) goto L_0x04d7
            r65.mo153970C()
            com.tencent.mm.ui.widget.cedit.edit.a r8 = r7.f319246B1
            r8.mo154300e()
            com.tencent.mm.ui.widget.cedit.edit.a r8 = r7.f319246B1
            com.tencent.mm.ui.widget.cedit.edit.a$i r8 = r8.f319399j
            int r9 = r8.f319461a
            int r0 = r11.getInt(r0, r9)
            r8.f319461a = r0
            goto L_0x051f
        L_0x04d7:
            r8 = 58
            if (r0 != r8) goto L_0x04ee
            r65.mo153970C()
            com.tencent.mm.ui.widget.cedit.edit.a r8 = r7.f319246B1
            r8.mo154300e()
            com.tencent.mm.ui.widget.cedit.edit.a r8 = r7.f319246B1
            com.tencent.mm.ui.widget.cedit.edit.a$i r8 = r8.f319399j
            java.lang.CharSequence r0 = r11.getText(r0)
            r8.f319463c = r0
            goto L_0x051f
        L_0x04ee:
            r8 = 59
            if (r0 != r8) goto L_0x0507
            r65.mo153970C()
            com.tencent.mm.ui.widget.cedit.edit.a r8 = r7.f319246B1
            r8.mo154300e()
            com.tencent.mm.ui.widget.cedit.edit.a r8 = r7.f319246B1
            com.tencent.mm.ui.widget.cedit.edit.a$i r8 = r8.f319399j
            int r9 = r8.f319464d
            int r0 = r11.getInt(r0, r9)
            r8.f319464d = r0
            goto L_0x051f
        L_0x0507:
            r8 = 55
            if (r0 != r8) goto L_0x0513
            java.lang.String r0 = r11.getString(r0)
            r7.setPrivateImeOptions(r0)
            goto L_0x051f
        L_0x0513:
            r8 = 56
            if (r0 != r8) goto L_0x054f
            r8 = 0
            int r0 = r11.getResourceId(r0, r8)     // Catch:{ XmlPullParserException -> 0x053e, IOException -> 0x052d }
            r7.setInputExtras(r0)     // Catch:{ XmlPullParserException -> 0x0524, IOException -> 0x052d }
        L_0x051f:
            r8 = r51
            r60 = 0
            goto L_0x053a
        L_0x0524:
            r0 = move-exception
            r8 = r51
            r9 = 1
            r60 = 0
            r51 = r5
            goto L_0x0546
        L_0x052d:
            r0 = move-exception
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r60 = 0
            r9[r60] = r0
            r8 = r51
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r8, r9)
        L_0x053a:
            r51 = r5
            goto L_0x05ce
        L_0x053e:
            r0 = move-exception
            r8 = r51
            r60 = 0
            r51 = r5
            r9 = 1
        L_0x0546:
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r5[r60] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r8, r5)
            goto L_0x05ce
        L_0x054f:
            r8 = r51
            r51 = r5
            r5 = 64
            if (r0 != r5) goto L_0x0562
            r5 = 16843618(0x1010362, float:2.3695985E-38)
            int r0 = r11.getResourceId(r0, r5)
            r7.f319314r1 = r0
            goto L_0x05ce
        L_0x0562:
            r5 = 60
            if (r0 != r5) goto L_0x0570
            r5 = 16843461(0x10102c5, float:2.3695545E-38)
            int r0 = r11.getResourceId(r0, r5)
            r7.f319318t1 = r0
            goto L_0x05ce
        L_0x0570:
            r5 = 61
            if (r0 != r5) goto L_0x057e
            r5 = 16843462(0x10102c6, float:2.3695548E-38)
            int r0 = r11.getResourceId(r0, r5)
            r7.f319322v1 = r0
            goto L_0x05ce
        L_0x057e:
            r5 = 62
            if (r0 != r5) goto L_0x058c
            r5 = 16843463(0x10102c7, float:2.369555E-38)
            int r0 = r11.getResourceId(r0, r5)
            r7.f319327x1 = r0
            goto L_0x05ce
        L_0x058c:
            r5 = 63
            if (r0 != r5) goto L_0x0599
            r5 = 0
            boolean r0 = r11.getBoolean(r0, r5)
            r7.setTextIsSelectable(r0)
            goto L_0x05ce
        L_0x0599:
            r5 = 0
            r9 = 74
            if (r0 != r9) goto L_0x05a2
            r11.getInt(r0, r5)
            goto L_0x05ce
        L_0x05a2:
            r9 = 75
            if (r0 != r9) goto L_0x05aa
            r11.getInt(r0, r5)
            goto L_0x05ce
        L_0x05aa:
            r9 = 82
            if (r0 != r9) goto L_0x05b2
            r11.getInt(r0, r5)
            goto L_0x05ce
        L_0x05b2:
            r5 = 85
            if (r0 != r5) goto L_0x05bc
            r5 = -1
            int r44 = r11.getDimensionPixelSize(r0, r5)
            goto L_0x05ce
        L_0x05bc:
            r5 = -1
            r9 = 86
            if (r0 != r9) goto L_0x05c6
            int r45 = r11.getDimensionPixelSize(r0, r5)
            goto L_0x05ce
        L_0x05c6:
            r9 = 87
            if (r0 != r9) goto L_0x05ce
            int r46 = r11.getDimensionPixelSize(r0, r5)
        L_0x05ce:
            r5 = r51
            goto L_0x04a9
        L_0x05d2:
            int r6 = r6 + 1
            r51 = r8
            r8 = r61
            goto L_0x0269
        L_0x05da:
            r51 = r5
            r62 = r9
            if (r11 == 0) goto L_0x05e3
            r11.recycle()
        L_0x05e3:
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.EDITABLE
            r3 = r50
            r5 = r3 & 4095(0xfff, float:5.738E-42)
            r6 = 129(0x81, float:1.81E-43)
            if (r5 != r6) goto L_0x05ef
            r8 = 1
            goto L_0x05f0
        L_0x05ef:
            r8 = 0
        L_0x05f0:
            r9 = 225(0xe1, float:3.15E-43)
            if (r5 != r9) goto L_0x05f6
            r9 = 1
            goto L_0x05f7
        L_0x05f6:
            r9 = 0
        L_0x05f7:
            r11 = 18
            if (r5 != r11) goto L_0x05fd
            r5 = 1
            goto L_0x05fe
        L_0x05fd:
            r5 = 0
        L_0x05fe:
            android.content.pm.ApplicationInfo r11 = r66.getApplicationInfo()
            int r11 = r11.targetSdkVersion
            r6 = 26
            if (r11 < r6) goto L_0x060a
            r6 = 1
            goto L_0x060b
        L_0x060a:
            r6 = 0
        L_0x060b:
            r7.f319269R = r6
            r6 = 28
            if (r11 < r6) goto L_0x0613
            r6 = 1
            goto L_0x0614
        L_0x0613:
            r6 = 0
        L_0x0614:
            r7.f319271S = r6
            if (r47 == 0) goto L_0x0658
            java.lang.String r1 = r47.toString()     // Catch:{ ClassNotFoundException -> 0x0651 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0651 }
            r65.mo153970C()     // Catch:{ InstantiationException -> 0x064a, IllegalAccessException -> 0x0643 }
            com.tencent.mm.ui.widget.cedit.edit.a r6 = r7.f319246B1     // Catch:{ InstantiationException -> 0x064a, IllegalAccessException -> 0x0643 }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ InstantiationException -> 0x064a, IllegalAccessException -> 0x0643 }
            android.text.method.KeyListener r1 = (android.text.method.KeyListener) r1     // Catch:{ InstantiationException -> 0x064a, IllegalAccessException -> 0x0643 }
            r6.f319404o = r1     // Catch:{ InstantiationException -> 0x064a, IllegalAccessException -> 0x0643 }
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r7.f319246B1     // Catch:{ IncompatibleClassChangeError -> 0x063c }
            if (r3 == 0) goto L_0x0632
            goto L_0x0638
        L_0x0632:
            android.text.method.KeyListener r3 = r1.f319404o     // Catch:{ IncompatibleClassChangeError -> 0x063c }
            int r3 = r3.getInputType()     // Catch:{ IncompatibleClassChangeError -> 0x063c }
        L_0x0638:
            r1.f319405p = r3     // Catch:{ IncompatibleClassChangeError -> 0x063c }
            goto L_0x071e
        L_0x063c:
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r7.f319246B1
            r3 = 1
            r1.f319405p = r3
            goto L_0x071e
        L_0x0643:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x064a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0651:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0658:
            if (r48 == 0) goto L_0x0673
            r65.mo153970C()
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r7.f319246B1
            java.lang.String r6 = r48.toString()
            android.text.method.DigitsKeyListener r6 = android.text.method.DigitsKeyListener.getInstance(r6)
            r1.f319404o = r6
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r7.f319246B1
            if (r3 == 0) goto L_0x066e
            goto L_0x066f
        L_0x066e:
            r3 = 1
        L_0x066f:
            r1.f319405p = r3
            goto L_0x071e
        L_0x0673:
            if (r3 == 0) goto L_0x0688
            r6 = 1
            r7.mo154132k0(r3, r6)
            r1 = 131087(0x2000f, float:1.83692E-40)
            r1 = r1 & r3
            r3 = 131073(0x20001, float:1.83672E-40)
            if (r1 != r3) goto L_0x0684
            r1 = 1
            goto L_0x0685
        L_0x0684:
            r1 = 0
        L_0x0685:
            r1 = r1 ^ r6
            goto L_0x0720
        L_0x0688:
            if (r15 == 0) goto L_0x069c
            r65.mo153970C()
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r7.f319246B1
            android.text.method.DialerKeyListener r3 = android.text.method.DialerKeyListener.getInstance()
            r1.f319404o = r3
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r7.f319246B1
            r3 = 3
            r1.f319405p = r3
            goto L_0x071e
        L_0x069c:
            if (r13 == 0) goto L_0x06b7
            r65.mo153970C()
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r7.f319246B1
            android.text.method.DigitsKeyListener r3 = android.text.method.DigitsKeyListener.getInstance()
            r1.f319404o = r3
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r7.f319246B1
            android.text.method.KeyListener r1 = r1.f319404o
            int r1 = r1.getInputType()
            com.tencent.mm.ui.widget.cedit.edit.a r3 = r7.f319246B1
            r3.f319405p = r1
            goto L_0x071e
        L_0x06b7:
            if (r14 != 0) goto L_0x06f4
            r3 = -1
            if (r1 == r3) goto L_0x06bd
            goto L_0x06f4
        L_0x06bd:
            if (r10 == 0) goto L_0x06d0
            r65.mo153970C()
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r7.f319246B1
            android.text.method.TextKeyListener r3 = android.text.method.TextKeyListener.getInstance()
            r1.f319404o = r3
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r7.f319246B1
            r3 = 1
            r1.f319405p = r3
            goto L_0x071e
        L_0x06d0:
            boolean r0 = r65.mo153986V()
            if (r0 == 0) goto L_0x06ea
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r7.f319246B1
            r1 = 0
            if (r0 == 0) goto L_0x06e0
            r0.f319404o = r1
            r3 = 0
            r0.f319405p = r3
        L_0x06e0:
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            mo3.a r3 = com.tencent.p014mm.p136ui.widget.cedit.move.ArrowKeyMovementMethod.getInstance()
            r7.setMovementMethod(r3)
            goto L_0x071e
        L_0x06ea:
            r1 = 0
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r7.f319246B1
            if (r0 == 0) goto L_0x06f1
            r0.f319404o = r1
        L_0x06f1:
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.NORMAL
            goto L_0x071e
        L_0x06f4:
            r3 = 1
            if (r1 == r3) goto L_0x070b
            r3 = 2
            if (r1 == r3) goto L_0x0706
            r3 = 3
            if (r1 == r3) goto L_0x0701
            android.text.method.TextKeyListener$Capitalize r1 = android.text.method.TextKeyListener.Capitalize.NONE
            r3 = 1
            goto L_0x070f
        L_0x0701:
            android.text.method.TextKeyListener$Capitalize r1 = android.text.method.TextKeyListener.Capitalize.CHARACTERS
            r3 = 4097(0x1001, float:5.741E-42)
            goto L_0x070f
        L_0x0706:
            android.text.method.TextKeyListener$Capitalize r1 = android.text.method.TextKeyListener.Capitalize.WORDS
            r3 = 8193(0x2001, float:1.1481E-41)
            goto L_0x070f
        L_0x070b:
            android.text.method.TextKeyListener$Capitalize r1 = android.text.method.TextKeyListener.Capitalize.SENTENCES
            r3 = 16385(0x4001, float:2.296E-41)
        L_0x070f:
            r65.mo153970C()
            com.tencent.mm.ui.widget.cedit.edit.a r6 = r7.f319246B1
            android.text.method.TextKeyListener r1 = android.text.method.TextKeyListener.getInstance(r14, r1)
            r6.f319404o = r1
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r7.f319246B1
            r1.f319405p = r3
        L_0x071e:
            r1 = r51
        L_0x0720:
            com.tencent.mm.ui.widget.cedit.edit.a r3 = r7.f319246B1
            if (r3 == 0) goto L_0x074c
            int r6 = r3.f319405p
            r10 = r6 & 15
            r11 = 1
            if (r10 != r11) goto L_0x0740
            if (r2 != 0) goto L_0x072f
            if (r8 == 0) goto L_0x0735
        L_0x072f:
            r6 = r6 & -4081(0xfffffffffffff00f, float:NaN)
            r6 = r6 | 128(0x80, float:1.794E-43)
            r3.f319405p = r6
        L_0x0735:
            if (r9 == 0) goto L_0x074c
            int r6 = r3.f319405p
            r6 = r6 & -4081(0xfffffffffffff00f, float:NaN)
            r6 = r6 | 224(0xe0, float:3.14E-43)
            r3.f319405p = r6
            goto L_0x074c
        L_0x0740:
            r11 = 2
            if (r10 != r11) goto L_0x074c
            if (r5 == 0) goto L_0x074c
            r6 = r6 & -4081(0xfffffffffffff00f, float:NaN)
            r10 = 16
            r6 = r6 | r10
            r3.f319405p = r6
        L_0x074c:
            if (r12 == 0) goto L_0x075c
            r65.mo153970C()
            com.tencent.mm.ui.widget.cedit.edit.a r3 = r7.f319246B1
            r6 = 1
            r3.f319412w = r6
            android.widget.TextView$BufferType r3 = android.widget.TextView.BufferType.NORMAL
            if (r0 != r3) goto L_0x075c
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
        L_0x075c:
            if (r49 != 0) goto L_0x0761
        L_0x075e:
            r3 = r52
            goto L_0x077b
        L_0x0761:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$f r3 = r7.f319331z
            if (r3 != 0) goto L_0x0771
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$f r3 = new com.tencent.mm.ui.widget.cedit.edit.CustomTextView$f
            r6 = r66
            r10 = r49
            r3.<init>(r6)
            r7.f319331z = r3
            goto L_0x0773
        L_0x0771:
            r10 = r49
        L_0x0773:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$f r3 = r7.f319331z
            r3.f319346c = r10
            r6 = 1
            r3.f319348e = r6
            goto L_0x075e
        L_0x077b:
            if (r3 == 0) goto L_0x078a
            int r6 = r3.getIntrinsicWidth()
            int r10 = r3.getIntrinsicHeight()
            r11 = 0
            r3.setBounds(r11, r11, r6, r10)
            goto L_0x078b
        L_0x078a:
            r11 = 0
        L_0x078b:
            r6 = r53
            if (r6 == 0) goto L_0x079a
            int r10 = r6.getIntrinsicWidth()
            int r12 = r6.getIntrinsicHeight()
            r6.setBounds(r11, r11, r10, r12)
        L_0x079a:
            r10 = r54
            if (r10 == 0) goto L_0x07a9
            int r12 = r10.getIntrinsicWidth()
            int r13 = r10.getIntrinsicHeight()
            r10.setBounds(r11, r11, r12, r13)
        L_0x07a9:
            r12 = r55
            if (r12 == 0) goto L_0x07b8
            int r13 = r12.getIntrinsicWidth()
            int r14 = r12.getIntrinsicHeight()
            r12.setBounds(r11, r11, r13, r14)
        L_0x07b8:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$f r11 = r7.f319331z
            if (r11 == 0) goto L_0x07cf
            android.graphics.drawable.Drawable r13 = r11.f319350g
            r14 = 0
            if (r13 == 0) goto L_0x07c4
            r13.setCallback(r14)
        L_0x07c4:
            r11.f319350g = r14
            android.graphics.drawable.Drawable r13 = r11.f319351h
            if (r13 == 0) goto L_0x07cd
            r13.setCallback(r14)
        L_0x07cd:
            r11.f319351h = r14
        L_0x07cf:
            if (r3 != 0) goto L_0x07da
            if (r10 != 0) goto L_0x07da
            if (r6 != 0) goto L_0x07da
            if (r12 == 0) goto L_0x07d8
            goto L_0x07da
        L_0x07d8:
            r13 = 0
            goto L_0x07db
        L_0x07da:
            r13 = 1
        L_0x07db:
            if (r13 != 0) goto L_0x0822
            if (r11 == 0) goto L_0x08ea
            int r10 = r11.f319362s
            if (r10 != 0) goto L_0x07ee
            boolean r10 = r11.f319349f
            if (r10 != 0) goto L_0x07ee
            boolean r10 = r11.f319348e
            if (r10 == 0) goto L_0x07ec
            goto L_0x07ee
        L_0x07ec:
            r10 = 0
            goto L_0x07ef
        L_0x07ee:
            r10 = 1
        L_0x07ef:
            if (r10 != 0) goto L_0x07f6
            r10 = 0
            r7.f319331z = r10
            goto L_0x08ea
        L_0x07f6:
            r10 = 0
            android.graphics.drawable.Drawable[] r12 = r11.f319345b
            int r12 = r12.length
            r13 = 1
            int r12 = r12 - r13
        L_0x07fc:
            if (r12 < 0) goto L_0x080f
            android.graphics.drawable.Drawable[] r13 = r11.f319345b
            r13 = r13[r12]
            if (r13 == 0) goto L_0x0807
            r13.setCallback(r10)
        L_0x0807:
            android.graphics.drawable.Drawable[] r13 = r11.f319345b
            r13[r12] = r10
            int r12 = r12 + -1
            r10 = 0
            goto L_0x07fc
        L_0x080f:
            r10 = 0
            r11.f319360q = r10
            r11.f319356m = r10
            r11.f319361r = r10
            r11.f319357n = r10
            r11.f319358o = r10
            r11.f319354k = r10
            r11.f319359p = r10
            r11.f319355l = r10
            goto L_0x08ea
        L_0x0822:
            if (r11 != 0) goto L_0x082f
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$f r11 = new com.tencent.mm.ui.widget.cedit.edit.CustomTextView$f
            android.content.Context r13 = r65.getContext()
            r11.<init>(r13)
            r7.f319331z = r11
        L_0x082f:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$f r13 = r7.f319331z
            r13.getClass()
            android.graphics.drawable.Drawable[] r13 = r11.f319345b
            r14 = 0
            r13 = r13[r14]
            if (r13 == r3) goto L_0x0842
            if (r13 == 0) goto L_0x0842
            r15 = 0
            r13.setCallback(r15)
            goto L_0x0843
        L_0x0842:
            r15 = 0
        L_0x0843:
            android.graphics.drawable.Drawable[] r13 = r11.f319345b
            r13[r14] = r3
            r14 = 1
            r13 = r13[r14]
            if (r13 == r10) goto L_0x0851
            if (r13 == 0) goto L_0x0851
            r13.setCallback(r15)
        L_0x0851:
            android.graphics.drawable.Drawable[] r13 = r11.f319345b
            r13[r14] = r10
            r14 = 2
            r13 = r13[r14]
            if (r13 == r6) goto L_0x085f
            if (r13 == 0) goto L_0x085f
            r13.setCallback(r15)
        L_0x085f:
            android.graphics.drawable.Drawable[] r13 = r11.f319345b
            r13[r14] = r6
            r14 = 3
            r13 = r13[r14]
            if (r13 == r12) goto L_0x086d
            if (r13 == 0) goto L_0x086d
            r13.setCallback(r15)
        L_0x086d:
            android.graphics.drawable.Drawable[] r13 = r11.f319345b
            r13[r14] = r12
            android.graphics.Rect r13 = r11.f319344a
            int[] r14 = r65.getDrawableState()
            if (r3 == 0) goto L_0x0890
            r3.setState(r14)
            r3.copyBounds(r13)
            r3.setCallback(r7)
            int r15 = r13.width()
            r11.f319356m = r15
            int r15 = r13.height()
            r11.f319360q = r15
            r15 = 0
            goto L_0x0895
        L_0x0890:
            r15 = 0
            r11.f319360q = r15
            r11.f319356m = r15
        L_0x0895:
            if (r6 == 0) goto L_0x08ae
            r6.setState(r14)
            r6.copyBounds(r13)
            r6.setCallback(r7)
            int r15 = r13.width()
            r11.f319357n = r15
            int r15 = r13.height()
            r11.f319361r = r15
            r15 = 0
            goto L_0x08b2
        L_0x08ae:
            r11.f319361r = r15
            r11.f319357n = r15
        L_0x08b2:
            if (r10 == 0) goto L_0x08ca
            r10.setState(r14)
            r10.copyBounds(r13)
            r10.setCallback(r7)
            int r10 = r13.height()
            r11.f319354k = r10
            int r10 = r13.width()
            r11.f319358o = r10
            goto L_0x08ce
        L_0x08ca:
            r11.f319358o = r15
            r11.f319354k = r15
        L_0x08ce:
            if (r12 == 0) goto L_0x08e6
            r12.setState(r14)
            r12.copyBounds(r13)
            r12.setCallback(r7)
            int r10 = r13.height()
            r11.f319355l = r10
            int r10 = r13.width()
            r11.f319359p = r10
            goto L_0x08ea
        L_0x08e6:
            r11.f319359p = r15
            r11.f319355l = r15
        L_0x08ea:
            if (r11 == 0) goto L_0x08f0
            r11.f319352i = r3
            r11.f319353j = r6
        L_0x08f0:
            r65.mo154157q()
            r65.invalidate()
            r65.requestLayout()
            r3 = r56
            r6 = r57
            if (r3 != 0) goto L_0x0904
            if (r6 == 0) goto L_0x0902
            goto L_0x0904
        L_0x0902:
            r10 = 0
            goto L_0x0905
        L_0x0904:
            r10 = 1
        L_0x0905:
            if (r10 == 0) goto L_0x0965
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$f r10 = r7.f319331z
            if (r10 != 0) goto L_0x0916
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$f r10 = new com.tencent.mm.ui.widget.cedit.edit.CustomTextView$f
            android.content.Context r11 = r65.getContext()
            r10.<init>(r11)
            r7.f319331z = r10
        L_0x0916:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$f r11 = r7.f319331z
            r11.getClass()
            android.graphics.Rect r11 = r10.f319344a
            int[] r12 = r65.getDrawableState()
            if (r3 == 0) goto L_0x0940
            int r13 = r3.getIntrinsicWidth()
            int r14 = r3.getIntrinsicHeight()
            r15 = 0
            r3.setBounds(r15, r15, r13, r14)
            r3.setState(r12)
            r3.copyBounds(r11)
            r3.setCallback(r7)
            r10.f319350g = r3
            r11.width()
            r11.height()
        L_0x0940:
            if (r6 == 0) goto L_0x0960
            int r3 = r6.getIntrinsicWidth()
            int r13 = r6.getIntrinsicHeight()
            r14 = 0
            r6.setBounds(r14, r14, r3, r13)
            r6.setState(r12)
            r6.copyBounds(r11)
            r6.setCallback(r7)
            r10.f319351h = r6
            r11.width()
            r11.height()
            goto L_0x0961
        L_0x0960:
            r14 = 0
        L_0x0961:
            r65.mo154157q()
            goto L_0x0966
        L_0x0965:
            r14 = 0
        L_0x0966:
            r3 = r62
            r7.setCompoundDrawablePadding(r3)
            r7.setInputTypeSingleLine(r1)
            r7.mo154159r(r1, r1, r1)
            if (r1 == 0) goto L_0x097f
            android.text.method.KeyListener r1 = r65.getKeyListener()
            if (r1 != 0) goto L_0x097f
            r1 = -1
            if (r4 != r1) goto L_0x097f
            r1 = 1
            r4 = 3
            goto L_0x0980
        L_0x097f:
            r1 = 1
        L_0x0980:
            if (r4 == r1) goto L_0x0996
            r1 = 2
            if (r4 == r1) goto L_0x098f
            r1 = 3
            if (r4 == r1) goto L_0x0989
            goto L_0x099c
        L_0x0989:
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            r7.setEllipsize(r3)
            goto L_0x099c
        L_0x098f:
            r1 = 3
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.MIDDLE
            r7.setEllipsize(r3)
            goto L_0x099c
        L_0x0996:
            r1 = 3
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.START
            r7.setEllipsize(r3)
        L_0x099c:
            if (r2 != 0) goto L_0x09a7
            if (r8 != 0) goto L_0x09a7
            if (r9 != 0) goto L_0x09a7
            if (r5 == 0) goto L_0x09a5
            goto L_0x09a7
        L_0x09a5:
            r8 = 0
            goto L_0x09a8
        L_0x09a7:
            r8 = 1
        L_0x09a8:
            if (r8 != 0) goto L_0x09b9
            com.tencent.mm.ui.widget.cedit.edit.a r2 = r7.f319246B1
            if (r2 == 0) goto L_0x09b7
            int r2 = r2.f319405p
            r2 = r2 & 4095(0xfff, float:5.738E-42)
            r3 = 129(0x81, float:1.81E-43)
            if (r2 != r3) goto L_0x09b7
            goto L_0x09b9
        L_0x09b7:
            r2 = 0
            goto L_0x09ba
        L_0x09b9:
            r2 = 1
        L_0x09ba:
            if (r2 == 0) goto L_0x09be
            r4 = 3
            goto L_0x09c0
        L_0x09be:
            r4 = r26
        L_0x09c0:
            if (r42 == 0) goto L_0x09c7
            r1 = r42
            r7.setTextColor((android.content.res.ColorStateList) r1)
        L_0x09c7:
            if (r41 == 0) goto L_0x09ce
            r1 = r41
            r7.setHintTextColor((android.content.res.ColorStateList) r1)
        L_0x09ce:
            if (r38 == 0) goto L_0x09d5
            r1 = r38
            r7.setLinkTextColor((android.content.res.ColorStateList) r1)
        L_0x09d5:
            if (r37 == 0) goto L_0x09dc
            r1 = r37
            r7.setHighlightColor(r1)
        L_0x09dc:
            r15 = r35
            r1 = -1
            if (r15 == r1) goto L_0x09ea
            r6 = r34
            r7.f319266P = r6
            float r2 = (float) r15
            r3 = 1
            r7.mo154133l0(r2, r3)
        L_0x09ea:
            if (r33 == 0) goto L_0x09f1
            r2 = r33
            r7.setTextLocales(r2)
        L_0x09f1:
            if (r4 == r1) goto L_0x09f7
            if (r16 != 0) goto L_0x09f7
            r3 = 0
            goto L_0x09f9
        L_0x09f7:
            r3 = r31
        L_0x09f9:
            r1 = r65
            r2 = r30
            r9 = 0
            r5 = r32
            r6 = r29
            r1.mo154154p0(r2, r3, r4, r5, r6)
            if (r28 == 0) goto L_0x0a26
            android.text.TextPaint r1 = r7.f319262K
            r2 = r24
            r3 = r25
            r5 = r27
            r4 = r28
            r1.setShadowLayer(r3, r5, r2, r4)
            r7.f319306o = r3
            r7.f319308p = r5
            r7.f319311q = r2
            r7.f319313r = r4
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r7.f319246B1
            if (r1 == 0) goto L_0x0a23
            r1.mo154316u()
        L_0x0a23:
            r65.invalidate()
        L_0x0a26:
            if (r21 == 0) goto L_0x0a2d
            r4 = r20
            r7.setElegantTextHeight(r4)
        L_0x0a2d:
            if (r22 == 0) goto L_0x0a34
            r4 = r19
            r7.setFallbackLineSpacing(r4)
        L_0x0a34:
            if (r23 == 0) goto L_0x0a3b
            r1 = r18
            r7.setLetterSpacing(r1)
        L_0x0a3b:
            r1 = r39
            if (r1 == 0) goto L_0x0a42
            r7.setFontFeatureSettings(r1)
        L_0x0a42:
            r1 = r40
            if (r1 == 0) goto L_0x0a70
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L_0x0a70
            android.text.TextPaint r2 = r7.f319262K
            java.lang.String r2 = r2.getFontVariationSettings()
            if (r1 == r2) goto L_0x0a70
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0a5b
            goto L_0x0a70
        L_0x0a5b:
            android.text.TextPaint r2 = r7.f319262K
            boolean r1 = r2.setFontVariationSettings(r1)
            if (r1 == 0) goto L_0x0a70
            android.text.Layout r1 = r7.f319264M
            if (r1 == 0) goto L_0x0a70
            r65.mo153988X()
            r65.requestLayout()
            r65.invalidate()
        L_0x0a70:
            if (r8 == 0) goto L_0x0a79
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            r7.setTransformationMethod(r1)
        L_0x0a79:
            r1 = r43
            if (r1 < 0) goto L_0x0a8b
            r2 = 1
            android.text.InputFilter[] r3 = new android.text.InputFilter[r2]
            android.text.InputFilter$LengthFilter r2 = new android.text.InputFilter$LengthFilter
            r2.<init>(r1)
            r3[r9] = r2
            r7.setFilters(r3)
            goto L_0x0a90
        L_0x0a8b:
            android.text.InputFilter[] r1 = f319238L1
            r7.setFilters(r1)
        L_0x0a90:
            r1 = r58
            r7.mo153965m0(r1, r0)
            java.lang.CharSequence r0 = r7.f319243A
            r1 = r17
            if (r0 != 0) goto L_0x0a9d
            r7.f319243A = r1
        L_0x0a9d:
            java.lang.CharSequence r0 = r7.f319247C
            if (r0 != 0) goto L_0x0aa3
            r7.f319247C = r1
        L_0x0aa3:
            r1 = r59
            if (r1 == 0) goto L_0x0aaa
            r7.setHint((java.lang.CharSequence) r1)
        L_0x0aaa:
            r1 = 1
            r7.setClickable(r1)
            r7.setLongClickable(r1)
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r7.f319246B1
            if (r0 == 0) goto L_0x0ab8
            r0.mo154288C()
        L_0x0ab8:
            int r0 = r65.getImportantForAccessibility()
            if (r0 != 0) goto L_0x0ac1
            r7.setImportantForAccessibility(r1)
        L_0x0ac1:
            r1 = r44
            if (r1 < 0) goto L_0x0ac8
            r7.setFirstBaselineToTopHeight(r1)
        L_0x0ac8:
            r1 = r45
            if (r1 < 0) goto L_0x0acf
            r7.setLastBaselineToBottomHeight(r1)
        L_0x0acf:
            r1 = r46
            if (r1 < 0) goto L_0x0ad6
            r7.setLineHeight(r1)
        L_0x0ad6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.mo104412M(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* renamed from: N */
    public final void mo153979N(int i, int i2, int i3) {
        Drawable drawable;
        if (i >= 0 || i2 >= 0 || i3 >= 0) {
            int min = Math.min(Math.min(i, i2), i3);
            int max = Math.max(Math.max(i, i2), i3);
            Layout layout = this.f319264M;
            if (layout == null) {
                invalidate();
                return;
            }
            int lineForOffset = layout.getLineForOffset(min);
            int lineTop = this.f319264M.getLineTop(lineForOffset);
            if (lineForOffset > 0) {
                lineTop -= this.f319264M.getLineDescent(lineForOffset - 1);
            }
            int lineBottom = this.f319264M.getLineBottom(min == max ? lineForOffset : this.f319264M.getLineForOffset(max));
            C106778a aVar = this.f319246B1;
            if (!(aVar == null || (drawable = aVar.f319368F) == null)) {
                Rect bounds = drawable.getBounds();
                lineTop = Math.min(lineTop, bounds.top);
                lineBottom = Math.max(lineBottom, bounds.bottom);
            }
            int compoundPaddingLeft = getCompoundPaddingLeft();
            int extendedPaddingTop = getExtendedPaddingTop() + mo153977K(true);
            invalidate(getScrollX() + compoundPaddingLeft, lineTop + extendedPaddingTop, getScrollY() + (getWidth() - getCompoundPaddingRight()), extendedPaddingTop + lineBottom);
        }
    }

    /* renamed from: O */
    public void mo153980O() {
        if (this.f319312q1) {
            int selectionEnd = getSelectionEnd();
            mo153979N(selectionEnd, selectionEnd, selectionEnd);
            return;
        }
        int compoundPaddingLeft = getCompoundPaddingLeft();
        int extendedPaddingTop = getExtendedPaddingTop() + mo153977K(true);
        Drawable drawable = this.f319246B1.f319368F;
        if (drawable == null) {
            RectF rectF = f319237K1;
            synchronized (rectF) {
                float ceil = (float) Math.ceil((double) this.f319262K.getStrokeWidth());
                if (ceil < 1.0f) {
                    ceil = 1.0f;
                }
                float f = ceil / 2.0f;
                this.f319307o1.computeBounds(rectF, false);
                float f2 = (float) compoundPaddingLeft;
                float f3 = (float) extendedPaddingTop;
                invalidate((int) Math.floor((double) ((rectF.left + f2) - f)), (int) Math.floor((double) ((rectF.top + f3) - f)), (int) Math.ceil((double) (f2 + rectF.right + f)), (int) Math.ceil((double) (f3 + rectF.bottom + f)));
            }
            return;
        }
        Rect bounds = drawable.getBounds();
        invalidate(bounds.left + compoundPaddingLeft, bounds.top + extendedPaddingTop, bounds.right + compoundPaddingLeft, bounds.bottom + extendedPaddingTop);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r7 == false) goto L_0x001d;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo153981P(android.view.MotionEvent r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.f319332z1
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0010
            int r0 = r6.getPointerId(r2)
            r5.f319332z1 = r0
            r5.f319244A1 = r7
            goto L_0x001c
        L_0x0010:
            int r4 = r6.getPointerId(r2)
            if (r0 == r4) goto L_0x001c
            boolean r0 = r5.f319244A1
            if (r0 == 0) goto L_0x001d
            if (r7 == 0) goto L_0x001d
        L_0x001c:
            r2 = 1
        L_0x001d:
            int r7 = r6.getActionMasked()
            if (r7 == r3) goto L_0x002a
            int r6 = r6.getActionMasked()
            r7 = 3
            if (r6 != r7) goto L_0x002c
        L_0x002a:
            r5.f319332z1 = r1
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.mo153981P(android.view.MotionEvent, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = android.os.Build.BRAND;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo153982Q() {
        /*
            r2 = this;
            java.util.Set r0 = r2.getReuseItems()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0024
            java.lang.String r0 = android.os.Build.BRAND
            if (r0 == 0) goto L_0x0024
            java.util.Set r1 = r2.getReuseBrands()
            java.lang.String r0 = r0.toLowerCase()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0024
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.mo153982Q():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        return false;
     */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo153983S(float r6, float r7) {
        /*
            r5 = this;
            float[] r0 = f319236J1
            monitor-enter(r0)
            r1 = 0
            r0[r1] = r6     // Catch:{ all -> 0x007a }
            r6 = 1
            r0[r6] = r7     // Catch:{ all -> 0x007a }
            r7 = r5
        L_0x000a:
            if (r7 == 0) goto L_0x0078
            if (r7 == r5) goto L_0x0022
            r2 = r0[r1]     // Catch:{ all -> 0x007a }
            int r3 = r7.getScrollX()     // Catch:{ all -> 0x007a }
            float r3 = (float) r3     // Catch:{ all -> 0x007a }
            float r2 = r2 - r3
            r0[r1] = r2     // Catch:{ all -> 0x007a }
            r2 = r0[r6]     // Catch:{ all -> 0x007a }
            int r3 = r7.getScrollY()     // Catch:{ all -> 0x007a }
            float r3 = (float) r3     // Catch:{ all -> 0x007a }
            float r2 = r2 - r3
            r0[r6] = r2     // Catch:{ all -> 0x007a }
        L_0x0022:
            r2 = r0[r1]     // Catch:{ all -> 0x007a }
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 < 0) goto L_0x0076
            r4 = r0[r6]     // Catch:{ all -> 0x007a }
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0076
            int r3 = r7.getWidth()     // Catch:{ all -> 0x007a }
            float r3 = (float) r3     // Catch:{ all -> 0x007a }
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0076
            r2 = r0[r6]     // Catch:{ all -> 0x007a }
            int r3 = r7.getHeight()     // Catch:{ all -> 0x007a }
            float r3 = (float) r3     // Catch:{ all -> 0x007a }
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0044
            goto L_0x0076
        L_0x0044:
            android.graphics.Matrix r2 = r7.getMatrix()     // Catch:{ all -> 0x007a }
            boolean r2 = r2.isIdentity()     // Catch:{ all -> 0x007a }
            if (r2 != 0) goto L_0x0055
            android.graphics.Matrix r2 = r7.getMatrix()     // Catch:{ all -> 0x007a }
            r2.mapPoints(r0)     // Catch:{ all -> 0x007a }
        L_0x0055:
            r2 = r0[r1]     // Catch:{ all -> 0x007a }
            int r3 = r7.getLeft()     // Catch:{ all -> 0x007a }
            float r3 = (float) r3     // Catch:{ all -> 0x007a }
            float r2 = r2 + r3
            r0[r1] = r2     // Catch:{ all -> 0x007a }
            r2 = r0[r6]     // Catch:{ all -> 0x007a }
            int r3 = r7.getTop()     // Catch:{ all -> 0x007a }
            float r3 = (float) r3     // Catch:{ all -> 0x007a }
            float r2 = r2 + r3
            r0[r6] = r2     // Catch:{ all -> 0x007a }
            android.view.ViewParent r7 = r7.getParent()     // Catch:{ all -> 0x007a }
            boolean r2 = r7 instanceof android.view.View     // Catch:{ all -> 0x007a }
            if (r2 == 0) goto L_0x0074
            android.view.View r7 = (android.view.View) r7     // Catch:{ all -> 0x007a }
            goto L_0x000a
        L_0x0074:
            r7 = 0
            goto L_0x000a
        L_0x0076:
            monitor-exit(r0)     // Catch:{ all -> 0x007a }
            return r1
        L_0x0078:
            monitor-exit(r0)     // Catch:{ all -> 0x007a }
            return r6
        L_0x007a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.mo153983S(float, float):boolean");
    }

    /* renamed from: T */
    public boolean mo153984T() {
        C106778a aVar = this.f319246B1;
        if (aVar == null) {
            return false;
        }
        int i = aVar.f319405p;
        if ((i & 15) != 1 || (524288 & i) > 0) {
            return false;
        }
        int i2 = i & 4080;
        return i2 == 0 || i2 == 48 || i2 == 80 || i2 == 64 || i2 == 160;
    }

    /* renamed from: U */
    public boolean mo153985U() {
        return (this.f319243A instanceof Editable) && onCheckIsTextEditor() && isEnabled();
    }

    /* renamed from: V */
    public boolean mo153986V() {
        C106778a aVar = this.f319246B1;
        if (aVar == null) {
            return false;
        }
        return aVar.f319413x;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.text.BoringLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: android.text.DynamicLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: android.text.BoringLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: android.text.BoringLayout} */
    /* JADX WARNING: type inference failed for: r13v1, types: [android.text.Layout] */
    /* JADX WARNING: type inference failed for: r8v13, types: [android.text.BoringLayout] */
    /* JADX WARNING: type inference failed for: r8v14, types: [android.text.BoringLayout] */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: type inference failed for: r13v9 */
    /* JADX WARNING: type inference failed for: r13v10 */
    /* JADX WARNING: type inference failed for: r13v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo153987W(int r34, int r35, android.text.BoringLayout.Metrics r36, android.text.BoringLayout.Metrics r37, int r38, boolean r39) {
        /*
            r33 = this;
            r0 = r33
            r12 = r38
            int r1 = r0.f319329y0
            r0.f319274T0 = r1
            int r1 = r0.f319268Q0
            r0.f319276U0 = r1
            r13 = 1
            r0.f319312q1 = r13
            r14 = 0
            if (r34 >= 0) goto L_0x0014
            r15 = 0
            goto L_0x0016
        L_0x0014:
            r15 = r34
        L_0x0016:
            if (r35 >= 0) goto L_0x001b
            r27 = 0
            goto L_0x001d
        L_0x001b:
            r27 = r35
        L_0x001d:
            android.text.Layout$Alignment r11 = r33.getLayoutAlignment()
            boolean r1 = r0.f319283Z0
            if (r1 == 0) goto L_0x0034
            android.text.Layout r1 = r0.f319264M
            if (r1 == 0) goto L_0x0034
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            if (r11 == r1) goto L_0x0031
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            if (r11 != r1) goto L_0x0034
        L_0x0031:
            r28 = 1
            goto L_0x0036
        L_0x0034:
            r28 = 0
        L_0x0036:
            if (r28 == 0) goto L_0x0040
            android.text.Layout r1 = r0.f319264M
            int r1 = r1.getParagraphDirection(r14)
            r10 = r1
            goto L_0x0041
        L_0x0040:
            r10 = 0
        L_0x0041:
            android.text.TextUtils$TruncateAt r1 = r0.f319328y
            if (r1 == 0) goto L_0x004e
            android.text.method.KeyListener r1 = r33.getKeyListener()
            if (r1 != 0) goto L_0x004e
            r16 = 1
            goto L_0x0050
        L_0x004e:
            r16 = 0
        L_0x0050:
            android.text.TextUtils$TruncateAt r9 = r0.f319328y
            android.text.TextDirectionHeuristic r1 = r0.f319301k1
            if (r1 != 0) goto L_0x005c
            android.text.TextDirectionHeuristic r1 = r33.getTextDirectionHeuristic()
            r0.f319301k1 = r1
        L_0x005c:
            android.text.TextUtils$TruncateAt r1 = r0.f319328y
            if (r9 != r1) goto L_0x0063
            r17 = 1
            goto L_0x0065
        L_0x0063:
            r17 = 0
        L_0x0065:
            boolean r1 = r33.mo153986V()
            if (r1 != 0) goto L_0x0072
            android.text.Spannable r1 = r0.f319245B
            if (r1 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r1 = 0
            goto L_0x0073
        L_0x0072:
            r1 = 1
        L_0x0073:
            r8 = 0
            if (r1 == 0) goto L_0x00ad
            android.text.DynamicLayout r17 = new android.text.DynamicLayout
            java.lang.CharSequence r2 = r0.f319243A
            java.lang.CharSequence r3 = r0.f319247C
            android.text.TextPaint r4 = r0.f319262K
            float r7 = r0.f319309p0
            float r6 = r0.f319326x0
            boolean r5 = r0.f319285b1
            android.text.method.KeyListener r1 = r33.getKeyListener()
            if (r1 != 0) goto L_0x008d
            r18 = r9
            goto L_0x008f
        L_0x008d:
            r18 = r8
        L_0x008f:
            r1 = r17
            r19 = r5
            r5 = r15
            r20 = r6
            r6 = r11
            r13 = r8
            r8 = r20
            r30 = r9
            r9 = r19
            r31 = r10
            r10 = r18
            r32 = r11
            r11 = r38
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r8 = r17
            goto L_0x013f
        L_0x00ad:
            r13 = r8
            r30 = r9
            r31 = r10
            r32 = r11
            android.text.BoringLayout$Metrics r1 = f319242P1
            r2 = r36
            if (r2 != r1) goto L_0x00ca
            java.lang.CharSequence r1 = r0.f319247C
            android.text.TextPaint r2 = r0.f319262K
            android.text.BoringLayout$Metrics r3 = r0.f319294g1
            android.text.BoringLayout$Metrics r1 = android.text.BoringLayout.isBoring(r1, r2, r3)
            if (r1 == 0) goto L_0x00c8
            r0.f319294g1 = r1
        L_0x00c8:
            r8 = r1
            goto L_0x00cb
        L_0x00ca:
            r8 = r2
        L_0x00cb:
            if (r8 == 0) goto L_0x013e
            int r1 = r8.width
            if (r1 > r15) goto L_0x0106
            if (r30 == 0) goto L_0x00d5
            if (r1 > r12) goto L_0x0106
        L_0x00d5:
            if (r17 == 0) goto L_0x00ed
            android.text.BoringLayout r1 = r0.f319298i1
            if (r1 == 0) goto L_0x00ed
            java.lang.CharSequence r2 = r0.f319247C
            android.text.TextPaint r3 = r0.f319262K
            float r6 = r0.f319309p0
            float r7 = r0.f319326x0
            boolean r9 = r0.f319285b1
            r4 = r15
            r5 = r32
            android.text.BoringLayout r1 = r1.replaceOrMake(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0100
        L_0x00ed:
            java.lang.CharSequence r1 = r0.f319247C
            android.text.TextPaint r2 = r0.f319262K
            float r5 = r0.f319309p0
            float r6 = r0.f319326x0
            boolean r9 = r0.f319285b1
            r3 = r15
            r4 = r32
            r7 = r8
            r8 = r9
            android.text.BoringLayout r1 = android.text.BoringLayout.make(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0100:
            r8 = r1
            if (r17 == 0) goto L_0x013f
            r0.f319298i1 = r8
            goto L_0x013f
        L_0x0106:
            if (r16 == 0) goto L_0x013e
            if (r1 > r15) goto L_0x013e
            if (r17 == 0) goto L_0x0126
            android.text.BoringLayout r1 = r0.f319298i1
            if (r1 == 0) goto L_0x0126
            java.lang.CharSequence r2 = r0.f319247C
            android.text.TextPaint r3 = r0.f319262K
            float r6 = r0.f319309p0
            float r7 = r0.f319326x0
            boolean r9 = r0.f319285b1
            r4 = r15
            r5 = r32
            r10 = r30
            r11 = r38
            android.text.BoringLayout r8 = r1.replaceOrMake(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x013f
        L_0x0126:
            java.lang.CharSequence r1 = r0.f319247C
            android.text.TextPaint r2 = r0.f319262K
            float r5 = r0.f319309p0
            float r6 = r0.f319326x0
            boolean r9 = r0.f319285b1
            r3 = r15
            r4 = r32
            r7 = r8
            r8 = r9
            r9 = r30
            r10 = r38
            android.text.BoringLayout r8 = android.text.BoringLayout.make(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x013f
        L_0x013e:
            r8 = r13
        L_0x013f:
            if (r8 != 0) goto L_0x0176
            android.text.StaticLayout r8 = new android.text.StaticLayout
            java.lang.CharSequence r1 = r0.f319247C
            r17 = 0
            int r18 = r1.length()
            android.text.TextPaint r2 = r0.f319262K
            float r3 = r0.f319309p0
            float r4 = r0.f319326x0
            boolean r5 = r0.f319285b1
            if (r16 == 0) goto L_0x0158
            r25 = r30
            goto L_0x015a
        L_0x0158:
            r25 = r13
        L_0x015a:
            if (r16 == 0) goto L_0x0160
            r26 = r12
            r6 = r15
            goto L_0x0163
        L_0x0160:
            r6 = r15
            r26 = 0
        L_0x0163:
            r15 = r8
            r16 = r1
            r19 = r2
            r20 = r6
            r21 = r32
            r22 = r3
            r23 = r4
            r24 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0177
        L_0x0176:
            r6 = r15
        L_0x0177:
            r0.f319264M = r8
            android.text.TextUtils$TruncateAt r1 = r0.f319328y
            if (r1 == 0) goto L_0x0180
            r29 = 1
            goto L_0x0182
        L_0x0180:
            r29 = 0
        L_0x0182:
            r0.f319253F = r13
            java.lang.CharSequence r1 = r0.f319251E
            if (r1 == 0) goto L_0x0243
            if (r29 == 0) goto L_0x018c
            r15 = r6
            goto L_0x018e
        L_0x018c:
            r15 = r27
        L_0x018e:
            android.text.BoringLayout$Metrics r2 = f319242P1
            r3 = r37
            if (r3 != r2) goto L_0x01a2
            android.text.TextPaint r2 = r0.f319262K
            android.text.BoringLayout$Metrics r3 = r0.f319296h1
            android.text.BoringLayout$Metrics r1 = android.text.BoringLayout.isBoring(r1, r2, r3)
            if (r1 == 0) goto L_0x01a0
            r0.f319296h1 = r1
        L_0x01a0:
            r8 = r1
            goto L_0x01a3
        L_0x01a2:
            r8 = r3
        L_0x01a3:
            if (r8 == 0) goto L_0x021b
            int r1 = r8.width
            if (r1 > r15) goto L_0x01e1
            if (r29 == 0) goto L_0x01ad
            if (r1 > r12) goto L_0x01e1
        L_0x01ad:
            android.text.BoringLayout r1 = r0.f319300j1
            if (r1 == 0) goto L_0x01c5
            java.lang.CharSequence r2 = r0.f319251E
            android.text.TextPaint r3 = r0.f319262K
            float r6 = r0.f319309p0
            float r7 = r0.f319326x0
            boolean r9 = r0.f319285b1
            r4 = r15
            r5 = r32
            android.text.BoringLayout r1 = r1.replaceOrMake(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f319253F = r1
            goto L_0x01da
        L_0x01c5:
            java.lang.CharSequence r1 = r0.f319251E
            android.text.TextPaint r2 = r0.f319262K
            float r5 = r0.f319309p0
            float r6 = r0.f319326x0
            boolean r9 = r0.f319285b1
            r3 = r15
            r4 = r32
            r7 = r8
            r8 = r9
            android.text.BoringLayout r1 = android.text.BoringLayout.make(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.f319253F = r1
        L_0x01da:
            android.text.Layout r1 = r0.f319253F
            android.text.BoringLayout r1 = (android.text.BoringLayout) r1
            r0.f319300j1 = r1
            goto L_0x021b
        L_0x01e1:
            if (r29 == 0) goto L_0x021b
            if (r1 > r15) goto L_0x021b
            android.text.BoringLayout r1 = r0.f319300j1
            if (r1 == 0) goto L_0x0201
            java.lang.CharSequence r2 = r0.f319251E
            android.text.TextPaint r3 = r0.f319262K
            float r6 = r0.f319309p0
            float r7 = r0.f319326x0
            boolean r9 = r0.f319285b1
            android.text.TextUtils$TruncateAt r10 = r0.f319328y
            r4 = r15
            r5 = r32
            r11 = r38
            android.text.BoringLayout r1 = r1.replaceOrMake(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.f319253F = r1
            goto L_0x021b
        L_0x0201:
            java.lang.CharSequence r1 = r0.f319251E
            android.text.TextPaint r2 = r0.f319262K
            float r5 = r0.f319309p0
            float r6 = r0.f319326x0
            boolean r9 = r0.f319285b1
            android.text.TextUtils$TruncateAt r10 = r0.f319328y
            r3 = r15
            r4 = r32
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r38
            android.text.BoringLayout r1 = android.text.BoringLayout.make(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.f319253F = r1
        L_0x021b:
            android.text.Layout r1 = r0.f319253F
            if (r1 != 0) goto L_0x0243
            android.text.StaticLayout r11 = new android.text.StaticLayout
            java.lang.CharSequence r2 = r0.f319251E
            r3 = 0
            int r4 = r2.length()
            android.text.TextPaint r5 = r0.f319262K
            float r8 = r0.f319309p0
            float r9 = r0.f319326x0
            boolean r10 = r0.f319285b1
            if (r29 == 0) goto L_0x0234
            r13 = r30
        L_0x0234:
            if (r29 == 0) goto L_0x0237
            goto L_0x0238
        L_0x0237:
            r12 = 0
        L_0x0238:
            r1 = r11
            r6 = r15
            r7 = r32
            r15 = r11
            r11 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.f319253F = r15
        L_0x0243:
            if (r39 != 0) goto L_0x0251
            if (r28 == 0) goto L_0x0254
            android.text.Layout r1 = r0.f319264M
            int r1 = r1.getParagraphDirection(r14)
            r14 = r31
            if (r14 == r1) goto L_0x0254
        L_0x0251:
            r33.mo153993c0()
        L_0x0254:
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r0.f319246B1
            if (r1 == 0) goto L_0x025b
            r1.mo154288C()
        L_0x025b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.mo153987W(int, int, android.text.BoringLayout$Metrics, android.text.BoringLayout$Metrics, int, boolean):void");
    }

    /* renamed from: X */
    public void mo153988X() {
        Layout layout = this.f319264M;
        if ((layout instanceof BoringLayout) && this.f319298i1 == null) {
            this.f319298i1 = (BoringLayout) layout;
        }
        Layout layout2 = this.f319253F;
        if ((layout2 instanceof BoringLayout) && this.f319300j1 == null) {
            this.f319300j1 = (BoringLayout) layout2;
        }
        this.f319296h1 = null;
        this.f319294g1 = null;
        C106778a aVar = this.f319246B1;
        if (aVar != null) {
            aVar.mo154288C();
        }
    }

    /* renamed from: Y */
    public void mo153989Y(int i) {
        Object obj;
        int i2 = i;
        Class<Object> cls = Object.class;
        C106778a aVar = this.f319246B1;
        C106778a.C106787i iVar = aVar == null ? null : aVar.f319399j;
        if (iVar != null) {
            C74978g gVar = iVar.f319466f;
            if (gVar != null) {
                if (this instanceof C74974a ? ((MMCustomEditText.C74973a) gVar).f220521a.mo93502a((C74974a) this, i2, (KeyEvent) null) : false) {
                    return;
                }
            }
            if (i2 == 5) {
                View focusSearch = focusSearch(2);
                if (focusSearch != null && !focusSearch.requestFocus(2)) {
                    throw new IllegalStateException("focus search returned a view that wasn't able to take focus!");
                }
                return;
            } else if (i2 == 7) {
                View focusSearch2 = focusSearch(1);
                if (focusSearch2 != null && !focusSearch2.requestFocus(1)) {
                    throw new IllegalStateException("focus search returned a view that wasn't able to take focus!");
                }
                return;
            } else if (i2 == 6) {
                InputMethodManager inputMethodManager = getInputMethodManager();
                if (inputMethodManager != null && inputMethodManager.isActive(this)) {
                    inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                    return;
                }
                return;
            }
        }
        Class[] clsArr = new Class[0];
        Method method = null;
        for (Class cls2 = getClass(); cls2 != cls; cls2 = cls2.getSuperclass()) {
            try {
                method = cls2.getDeclaredMethod("getViewRootImpl", clsArr);
            } catch (Throwable unused) {
            }
        }
        if (method == null) {
            new Throwable("MB getViewRootImpl");
        }
        Object[] objArr = new Object[0];
        try {
            method.setAccessible(true);
            obj = method.invoke(this, objArr);
        } catch (Throwable unused2) {
            obj = null;
        }
        if (obj != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Class[] clsArr2 = {KeyEvent.class};
            Method method2 = null;
            for (Class cls3 = obj.getClass(); cls3 != cls; cls3 = cls3.getSuperclass()) {
                try {
                    method2 = cls3.getDeclaredMethod("dispatchKeyFromIme", clsArr2);
                } catch (Throwable unused3) {
                }
            }
            if (method2 == null) {
                new Throwable("MB dispatchKeyFromIme");
            }
            String str = "dispatchKeyFromIme";
            Object[] objArr2 = {new KeyEvent(uptimeMillis, uptimeMillis, 0, 66, 0, 0, -1, 0, 22)};
            Method method3 = method2;
            try {
                method3.setAccessible(true);
                method3.invoke(obj, objArr2);
            } catch (Throwable unused4) {
            }
            Class[] clsArr3 = {KeyEvent.class};
            Class cls4 = obj.getClass();
            Method method4 = null;
            while (cls4 != cls) {
                String str2 = str;
                try {
                    method4 = cls4.getDeclaredMethod(str2, clsArr3);
                } catch (Throwable unused5) {
                }
                cls4 = cls4.getSuperclass();
                str = str2;
            }
            if (method4 == null) {
                new Throwable("MB dispatchKeyFromIme");
            }
            Object[] objArr3 = {new KeyEvent(SystemClock.uptimeMillis(), uptimeMillis, 1, 66, 0, 0, -1, 0, 22)};
            Method method5 = method4;
            try {
                method5.setAccessible(true);
                method5.invoke(obj, objArr3);
            } catch (Throwable unused6) {
            }
        }
    }

    /* renamed from: Z */
    public boolean mo104413Z(String str, Bundle bundle) {
        return false;
    }

    /* renamed from: a0 */
    public void mo104414a0(int i, int i2) {
        sendAccessibilityEvent(8192);
    }

    public void addExtraDataToAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        RectF characterBounds;
        float f;
        CustomTextView customTextView = this;
        String str2 = str;
        Bundle bundle2 = bundle;
        if (bundle2 != null && str2.equals("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i = bundle2.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i2 = bundle2.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i2 <= 0 || i < 0 || i >= customTextView.f319243A.length()) {
                Log.m105920e("cmEdit.CMTextView", "Invalid arguments for accessibility character locations");
                return;
            }
            RectF[] rectFArr = new RectF[i2];
            CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
            int i3 = i + i2;
            float compoundPaddingLeft = (float) (getCompoundPaddingLeft() - getScrollX());
            float x0 = (float) mo154268x0();
            int lineForOffset = customTextView.f319264M.getLineForOffset(i);
            int lineForOffset2 = customTextView.f319264M.getLineForOffset(i3 - 1);
            int i4 = lineForOffset;
            while (i4 <= lineForOffset2) {
                int lineStart = customTextView.f319264M.getLineStart(i4);
                int lineEnd = customTextView.f319264M.getLineEnd(i4);
                int max = Math.max(lineStart, i);
                int min = Math.min(lineEnd, i3);
                boolean z = customTextView.f319264M.getParagraphDirection(i4) == 1;
                float[] fArr = new float[(min - max)];
                customTextView.f319264M.getPaint().getTextWidths(customTextView.f319247C, max, min, fArr);
                float lineTop = (float) customTextView.f319264M.getLineTop(i4);
                float lineBottom = (float) customTextView.f319264M.getLineBottom(i4);
                int i5 = i3;
                int i6 = max;
                while (i6 < min) {
                    float f2 = fArr[i6 - max];
                    float[] fArr2 = fArr;
                    boolean isRtlCharAt = customTextView.f319264M.isRtlCharAt(i6);
                    int i7 = min;
                    float primaryHorizontal = customTextView.f319264M.getPrimaryHorizontal(i6);
                    int i8 = max;
                    float secondaryHorizontal = customTextView.f319264M.getSecondaryHorizontal(i6);
                    if (!z) {
                        if (!isRtlCharAt) {
                            primaryHorizontal = secondaryHorizontal + f2;
                        } else {
                            secondaryHorizontal = primaryHorizontal - f2;
                        }
                        float f3 = secondaryHorizontal;
                        secondaryHorizontal = primaryHorizontal;
                        primaryHorizontal = f3;
                    } else if (isRtlCharAt) {
                        primaryHorizontal = secondaryHorizontal - f2;
                    } else {
                        secondaryHorizontal = f2 + primaryHorizontal;
                    }
                    float f4 = primaryHorizontal + compoundPaddingLeft;
                    float f5 = secondaryHorizontal + compoundPaddingLeft;
                    int i9 = i4;
                    float f6 = lineTop + x0;
                    int i15 = lineForOffset2;
                    float f7 = lineBottom + x0;
                    boolean S = customTextView.mo153983S(f4, f6);
                    boolean S2 = customTextView.mo153983S(f5, f7);
                    int i16 = (S || S2) ? 1 : 0;
                    if (!S || !S2) {
                        i16 |= 2;
                    }
                    if (isRtlCharAt) {
                        f = lineBottom;
                        i16 |= 4;
                    } else {
                        f = lineBottom;
                    }
                    builder.addCharacterBounds(i6, f4, f6, f5, f7, i16);
                    i6++;
                    customTextView = this;
                    i4 = i9;
                    fArr = fArr2;
                    min = i7;
                    max = i8;
                    lineForOffset2 = i15;
                    lineBottom = f;
                    lineTop = lineTop;
                }
                int i17 = lineForOffset2;
                i4++;
                customTextView = this;
                i3 = i5;
            }
            CursorAnchorInfo build = builder.setMatrix((Matrix) null).build();
            for (int i18 = 0; i18 < i2; i18++) {
                int i19 = i + i18;
                if ((build.getCharacterBoundsFlags(i19) & 1) == 1 && (characterBounds = build.getCharacterBounds(i19)) != null) {
                    rectFArr[i18] = characterBounds;
                }
            }
            accessibilityNodeInfo.getExtras().putParcelableArray(str2, rectFArr);
        }
    }

    public final void append(CharSequence charSequence) {
        int length = charSequence.length();
        CharSequence charSequence2 = this.f319243A;
        if (!(charSequence2 instanceof Editable)) {
            mo153965m0(charSequence2, TextView.BufferType.EDITABLE);
        }
        ((Editable) this.f319243A).append(charSequence, 0, length);
        int i = this.f319277V;
        if (i != 0 && Linkify.addLinks(this.f319245B, i) && this.f319279W && !mo154261u0()) {
            setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public void autofill(AutofillValue autofillValue) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || (autofillValue.isText() && mo153985U())) {
            CharSequence charSequence = null;
            if (i >= 26) {
                charSequence = autofillValue.getTextValue();
            }
            mo104415n0(charSequence, this.f319249D, true, 0);
            CharSequence text = getText();
            if (text instanceof Spannable) {
                Selection.setSelection((Spannable) text, text.length());
                return;
            }
            return;
        }
        Log.m105928w("cmEdit.CMTextView", autofillValue + " could not be autofilled into " + this);
    }

    /* renamed from: b0 */
    public boolean mo97951b0(int i) {
        int i2;
        AutofillManager autofillManager;
        int length = this.f319243A.length();
        if (isFocused()) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            i2 = Math.max(0, Math.min(selectionStart, selectionEnd));
            length = Math.max(0, Math.max(selectionStart, selectionEnd));
        } else {
            i2 = 0;
        }
        if (i != 16908355) {
            switch (i) {
                case 16908319:
                    boolean L = mo153978L();
                    mo154007g0();
                    C106778a aVar = this.f319246B1;
                    if (aVar != null && L) {
                        C106800c p = aVar.mo154311p();
                        p.getClass();
                        ActionMode actionMode = p.f319534a.f319392c;
                        if (actionMode != null) {
                            actionMode.invalidate();
                        }
                    }
                    return true;
                case 16908320:
                    ClipData.newPlainText((CharSequence) null, mo154003e0(this.f319247C.subSequence(i2, length)));
                    ((Editable) this.f319243A).delete(i2, length);
                    return true;
                case 16908321:
                    int selectionStart2 = getSelectionStart();
                    int selectionEnd2 = getSelectionEnd();
                    ClipData.newPlainText((CharSequence) null, mo154003e0(this.f319247C.subSequence(Math.max(0, Math.min(selectionStart2, selectionEnd2)), Math.max(0, Math.max(selectionStart2, selectionEnd2)))));
                    mo154162s0();
                    return true;
                case 16908322:
                    break;
                default:
                    switch (i) {
                        case 16908337:
                        case 16908338:
                        case 16908339:
                            break;
                        case 16908340:
                            C106778a aVar2 = this.f319246B1;
                            if (aVar2 != null) {
                                aVar2.mo154315t();
                                Selection.setSelection((Spannable) aVar2.f319383U.getText(), (aVar2.f319383U.getSelectionStart() + aVar2.f319383U.getSelectionEnd()) / 2);
                                break;
                            }
                            break;
                        case 16908341:
                            String selectedText = getSelectedText();
                            if (selectedText != null && !selectedText.isEmpty()) {
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.removeExtra("android.intent.extra.TEXT");
                                intent.putExtra("android.intent.extra.TEXT", (String) C109754a.m149076b(selectedText));
                                Context context = getContext();
                                Intent createChooser = Intent.createChooser(intent, (CharSequence) null);
                                C9556a aVar3 = new C9556a();
                                aVar3.mo10233c(createChooser);
                                Context context2 = context;
                                C117292a.m165358d(context2, aVar3.mo10232b(), "com/tencent/mm/ui/widget/cedit/edit/CustomTextView", "shareSelectedText", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                context.startActivity((Intent) aVar3.mo10231a(0));
                                C117292a.m165359e(context2, "com/tencent/mm/ui/widget/cedit/edit/CustomTextView", "shareSelectedText", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                Selection.setSelection(this.f319245B, getSelectionEnd());
                            }
                            return true;
                        default:
                            return false;
                    }
            }
            return true;
        }
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
            autofillManager.requestAutofill(this);
        }
        mo154162s0();
        return true;
    }

    /* renamed from: c0 */
    public final void mo153993c0() {
        if (!this.f319315s) {
            getViewTreeObserver().addOnPreDrawListener(this);
            this.f319315s = true;
        }
    }

    public void cancelLongPress() {
        super.cancelLongPress();
        C106778a aVar = this.f319246B1;
        if (aVar != null) {
            aVar.f319407r = true;
        }
    }

    public void clearComposingText() {
        if (this.f319243A instanceof Spannable) {
            BaseInputConnection.removeComposingSpans(this.f319245B);
        }
    }

    public int computeHorizontalScrollRange() {
        Layout layout = this.f319264M;
        return layout != null ? (!this.f319283Z0 || (this.f319273T & 7) != 3) ? layout.getWidth() : (int) layout.getLineWidth(0) : super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        Scroller scroller = this.f319292f1;
        if (scroller != null && scroller.computeScrollOffset()) {
            postInvalidate();
        }
    }

    public int computeVerticalScrollExtent() {
        return (getHeight() - getCompoundPaddingTop()) - getCompoundPaddingBottom();
    }

    public int computeVerticalScrollRange() {
        Layout layout = this.f319264M;
        return layout != null ? layout.getHeight() : super.computeVerticalScrollRange();
    }

    /* renamed from: d0 */
    public final <T> void mo154000d0(int i, int i2, Class<T> cls) {
        CharSequence charSequence = this.f319243A;
        if (charSequence instanceof Editable) {
            Editable editable = (Editable) charSequence;
            Object[] spans = editable.getSpans(i, i2, cls);
            int length = spans.length;
            int i3 = 0;
            while (i3 < length) {
                int spanStart = editable.getSpanStart(spans[i3]);
                if (editable.getSpanEnd(spans[i3]) != i && spanStart != i2) {
                    editable.removeSpan(spans[i3]);
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        C106777f fVar = this.f319331z;
        if (fVar != null) {
            for (Drawable drawable : fVar.f319345b) {
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                }
            }
        }
    }

    public void drawableStateChanged() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super.drawableStateChanged();
        ColorStateList colorStateList3 = this.f319287d;
        if ((colorStateList3 != null && colorStateList3.isStateful()) || (((colorStateList = this.f319289e) != null && colorStateList.isStateful()) || ((colorStateList2 = this.f319291f) != null && colorStateList2.isStateful()))) {
            mo154266w0();
        }
        if (this.f319331z != null) {
            int[] drawableState = getDrawableState();
            for (Drawable drawable : this.f319331z.f319345b) {
                if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
                    invalidateDrawable(drawable);
                }
            }
        }
    }

    /* renamed from: e0 */
    public CharSequence mo154003e0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spannable newSpannable = charSequence instanceof Spannable ? (Spannable) charSequence : this.f319304n.newSpannable(charSequence);
        SuggestionSpan[] suggestionSpanArr = (SuggestionSpan[]) newSpannable.getSpans(0, charSequence.length(), SuggestionSpan.class);
        if (suggestionSpanArr.length == 0) {
            return charSequence;
        }
        for (SuggestionSpan removeSpan : suggestionSpanArr) {
            newSpannable.removeSpan(removeSpan);
        }
        return newSpannable;
    }

    /* renamed from: f0 */
    public final void mo154004f0(Typeface typeface, int i, int i2) {
        if (i2 >= 0) {
            Math.min(1000, i2);
            mo154135o0(typeface, i);
            return;
        }
        mo154135o0(typeface, i);
    }

    public void findViewsWithText(ArrayList<View> arrayList, CharSequence charSequence, int i) {
        super.findViewsWithText(arrayList, charSequence, i);
        if (!arrayList.contains(this) && (i & 1) != 0 && !TextUtils.isEmpty(charSequence) && !TextUtils.isEmpty(this.f319243A)) {
            if (this.f319243A.toString().toLowerCase().contains(charSequence.toString().toLowerCase())) {
                arrayList.add(this);
            }
        }
    }

    public View focusSearch(int i) {
        try {
            return super.focusSearch(i);
        } catch (Throwable th) {
            Log.m105921e("cmEdit.CMTextView", "focusSearch err", th);
            return null;
        }
    }

    /* renamed from: g0 */
    public boolean mo154007g0() {
        C106778a aVar = this.f319246B1;
        if (!(aVar == null || aVar == null)) {
            aVar.mo154314s(500);
        }
        int length = this.f319243A.length();
        Selection.setSelection(this.f319245B, 0, length);
        return length > 0;
    }

    public CharSequence getAccessibilityClassName() {
        return CustomTextView.class.getName();
    }

    public int getAccessibilitySelectionEnd() {
        return getSelectionEnd();
    }

    public int getAccessibilitySelectionStart() {
        return getSelectionStart();
    }

    public TextView getAdaptText() {
        return this.f319248C1;
    }

    public int getAutofillType() {
        return mo153985U() ? 1 : 0;
    }

    public AutofillValue getAutofillValue() {
        if (!mo153985U()) {
            return null;
        }
        CharSequence b = C109754a.m149076b(getText());
        if (Build.VERSION.SDK_INT >= 26) {
            return AutofillValue.forText(b);
        }
        return null;
    }

    public int getBaseline() {
        return this.f319264M == null ? super.getBaseline() : getBaselineOffset() + this.f319264M.getLineBaseline(0);
    }

    public int getBaselineOffset() {
        return getExtendedPaddingTop() + ((this.f319273T & 112) != 48 ? mo153977K(true) : 0);
    }

    public int getBottomPaddingOffset() {
        return (int) Math.max(0.0f, this.f319311q + this.f319306o);
    }

    public int getCompoundDrawablePadding() {
        C106777f fVar = this.f319331z;
        if (fVar != null) {
            return fVar.f319362s;
        }
        return 0;
    }

    public BlendMode getCompoundDrawableTintBlendMode() {
        C106777f fVar = this.f319331z;
        if (fVar != null) {
            return fVar.f319347d;
        }
        return null;
    }

    public ColorStateList getCompoundDrawableTintList() {
        C106777f fVar = this.f319331z;
        if (fVar != null) {
            return fVar.f319346c;
        }
        return null;
    }

    public PorterDuff.Mode getCompoundDrawableTintMode() {
        return null;
    }

    public Drawable[] getCompoundDrawables() {
        C106777f fVar = this.f319331z;
        if (fVar != null) {
            return (Drawable[]) fVar.f319345b.clone();
        }
        return new Drawable[]{null, null, null, null};
    }

    public Drawable[] getCompoundDrawablesRelative() {
        C106777f fVar = this.f319331z;
        if (fVar != null) {
            Drawable[] drawableArr = fVar.f319345b;
            return new Drawable[]{fVar.f319350g, drawableArr[1], fVar.f319351h, drawableArr[3]};
        }
        return new Drawable[]{null, null, null, null};
    }

    public int getCompoundPaddingBottom() {
        C106777f fVar = this.f319331z;
        return (fVar == null || fVar.f319345b[3] == null) ? getPaddingBottom() : getPaddingBottom() + fVar.f319362s + fVar.f319355l;
    }

    public int getCompoundPaddingEnd() {
        return getLayoutDirection() != 1 ? getCompoundPaddingRight() : getCompoundPaddingLeft();
    }

    public int getCompoundPaddingLeft() {
        C106777f fVar = this.f319331z;
        return (fVar == null || fVar.f319345b[0] == null) ? getPaddingLeft() : getPaddingLeft() + fVar.f319362s + fVar.f319356m;
    }

    public int getCompoundPaddingRight() {
        C106777f fVar = this.f319331z;
        return (fVar == null || fVar.f319345b[2] == null) ? getPaddingRight() : getPaddingRight() + fVar.f319362s + fVar.f319357n;
    }

    public int getCompoundPaddingStart() {
        return getLayoutDirection() != 1 ? getCompoundPaddingLeft() : getCompoundPaddingRight();
    }

    public int getCompoundPaddingTop() {
        C106777f fVar = this.f319331z;
        return (fVar == null || fVar.f319345b[1] == null) ? getPaddingTop() : getPaddingTop() + fVar.f319362s + fVar.f319354k;
    }

    public final int getCurrentHintTextColor() {
        return this.f319289e != null ? this.f319295h : this.f319293g;
    }

    public final int getCurrentTextColor() {
        return this.f319293g;
    }

    public ActionMode.Callback getCustomInsertionActionModeCallback() {
        C106778a aVar = this.f319246B1;
        if (aVar == null) {
            return null;
        }
        return aVar.f319374L;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        C106778a aVar = this.f319246B1;
        if (aVar == null) {
            return null;
        }
        return aVar.f319373K;
    }

    public boolean getDefaultEditable() {
        return false;
    }

    public C109633a getDefaultMovementMethod() {
        return null;
    }

    public Editable getEditableText() {
        CharSequence charSequence = this.f319243A;
        if (charSequence instanceof Editable) {
            return (Editable) charSequence;
        }
        return null;
    }

    public C106778a getEditor() {
        return this.f319246B1;
    }

    @ViewDebug.ExportedProperty
    public TextUtils.TruncateAt getEllipsize() {
        return this.f319328y;
    }

    public int getExtendedPaddingBottom() {
        if (this.f319268Q0 != 1) {
            return getCompoundPaddingBottom();
        }
        if (this.f319264M == null) {
            mo154161s();
        }
        if (this.f319264M.getLineCount() <= this.f319329y0) {
            return getCompoundPaddingBottom();
        }
        int compoundPaddingTop = getCompoundPaddingTop();
        int compoundPaddingBottom = getCompoundPaddingBottom();
        int height = (getHeight() - compoundPaddingTop) - compoundPaddingBottom;
        int lineTop = this.f319264M.getLineTop(this.f319329y0);
        if (lineTop >= height) {
            return compoundPaddingBottom;
        }
        int i = this.f319273T & 112;
        return i == 48 ? (compoundPaddingBottom + height) - lineTop : i == 80 ? compoundPaddingBottom : compoundPaddingBottom + ((height - lineTop) / 2);
    }

    public int getExtendedPaddingTop() {
        int i;
        if (this.f319268Q0 != 1) {
            return getCompoundPaddingTop();
        }
        if (this.f319264M == null) {
            mo154161s();
        }
        if (this.f319264M.getLineCount() <= this.f319329y0) {
            return getCompoundPaddingTop();
        }
        int compoundPaddingTop = getCompoundPaddingTop();
        int height = (getHeight() - compoundPaddingTop) - getCompoundPaddingBottom();
        int lineTop = this.f319264M.getLineTop(this.f319329y0);
        return (lineTop < height && (i = this.f319273T & 112) != 48) ? i == 80 ? (compoundPaddingTop + height) - lineTop : compoundPaddingTop + ((height - lineTop) / 2) : compoundPaddingTop;
    }

    public InputFilter[] getFilters() {
        return this.f319302l1;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f319264M == null) {
            super.getFocusedRect(rect);
            return;
        }
        int selectionEnd = getSelectionEnd();
        if (selectionEnd < 0) {
            super.getFocusedRect(rect);
            return;
        }
        int selectionStart = getSelectionStart();
        if (selectionStart < 0 || selectionStart >= selectionEnd) {
            int lineForOffset = this.f319264M.getLineForOffset(selectionEnd);
            rect.top = this.f319264M.getLineTop(lineForOffset);
            rect.bottom = this.f319264M.getLineBottom(lineForOffset);
            int primaryHorizontal = ((int) this.f319264M.getPrimaryHorizontal(selectionEnd)) - 2;
            rect.left = primaryHorizontal;
            rect.right = primaryHorizontal + 4;
        } else {
            int lineForOffset2 = this.f319264M.getLineForOffset(selectionStart);
            int lineForOffset3 = this.f319264M.getLineForOffset(selectionEnd);
            rect.top = this.f319264M.getLineTop(lineForOffset2);
            rect.bottom = this.f319264M.getLineBottom(lineForOffset3);
            if (lineForOffset2 == lineForOffset3) {
                rect.left = (int) this.f319264M.getPrimaryHorizontal(selectionStart);
                rect.right = (int) this.f319264M.getPrimaryHorizontal(selectionEnd);
            } else {
                if (this.f319312q1) {
                    if (this.f319307o1 == null) {
                        this.f319307o1 = new Path();
                    }
                    this.f319307o1.reset();
                    this.f319264M.getSelectionPath(selectionStart, selectionEnd, this.f319307o1);
                    this.f319312q1 = false;
                }
                RectF rectF = f319237K1;
                synchronized (rectF) {
                    this.f319307o1.computeBounds(rectF, true);
                    rect.left = ((int) rectF.left) - 1;
                    rect.right = ((int) rectF.right) + 1;
                }
            }
        }
        int compoundPaddingLeft = getCompoundPaddingLeft();
        int extendedPaddingTop = getExtendedPaddingTop();
        if ((this.f319273T & 112) != 48) {
            extendedPaddingTop += mo153977K(false);
        }
        rect.offset(compoundPaddingLeft, extendedPaddingTop);
        rect.bottom += getExtendedPaddingBottom();
    }

    public String getFontFeatureSettings() {
        return this.f319262K.getFontFeatureSettings();
    }

    public String getFontVariationSettings() {
        return Build.VERSION.SDK_INT >= 26 ? this.f319262K.getFontVariationSettings() : "";
    }

    public boolean getFreezesText() {
        return this.f319297i;
    }

    public int getGravity() {
        return this.f319273T;
    }

    public int getHighlightColor() {
        return this.f319305n1;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getHint() {
        return this.f319251E;
    }

    public final ColorStateList getHintTextColors() {
        return this.f319289e;
    }

    public int getHorizontalOffsetForDrawables() {
        return 0;
    }

    public boolean getHorizontallyScrolling() {
        return this.f319275U;
    }

    public int getImeActionId() {
        C106778a.C106787i iVar;
        C106778a aVar = this.f319246B1;
        if (aVar == null || (iVar = aVar.f319399j) == null) {
            return 0;
        }
        return iVar.f319464d;
    }

    public CharSequence getImeActionLabel() {
        C106778a.C106787i iVar;
        C106778a aVar = this.f319246B1;
        if (aVar == null || (iVar = aVar.f319399j) == null) {
            return null;
        }
        return iVar.f319463c;
    }

    public LocaleList getImeHintLocales() {
        C106778a.C106787i iVar;
        C106778a aVar = this.f319246B1;
        if (aVar == null || (iVar = aVar.f319399j) == null) {
            return null;
        }
        return iVar.f319468h;
    }

    public int getImeOptions() {
        C106778a.C106787i iVar;
        C106778a aVar = this.f319246B1;
        if (aVar == null || (iVar = aVar.f319399j) == null) {
            return 0;
        }
        return iVar.f319461a;
    }

    public boolean getIncludeFontPadding() {
        return this.f319285b1;
    }

    public Bundle getInputExtras(boolean z) {
        if (this.f319246B1 == null && !z) {
            return null;
        }
        mo153970C();
        C106778a aVar = this.f319246B1;
        if (aVar.f319399j == null) {
            if (!z) {
                return null;
            }
            aVar.mo154300e();
        }
        C106778a.C106787i iVar = this.f319246B1.f319399j;
        if (iVar.f319465e == null) {
            if (!z) {
                return null;
            }
            iVar.f319465e = new Bundle();
        }
        return this.f319246B1.f319399j.f319465e;
    }

    public int getInputType() {
        C106778a aVar = this.f319246B1;
        if (aVar == null) {
            return 0;
        }
        return aVar.f319405p;
    }

    public CharSequence getIterableTextForAccessibility() {
        return this.f319243A;
    }

    public final KeyListener getKeyListener() {
        C106778a aVar = this.f319246B1;
        if (aVar == null) {
            return null;
        }
        return aVar.f319404o;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public final Layout getLayout() {
        return this.f319264M;
    }

    public float getLeftFadingEdgeStrength() {
        if (getLineCount() != 1) {
            return super.getLeftFadingEdgeStrength();
        }
        float lineLeft = getLayout().getLineLeft(0);
        if (lineLeft > ((float) getScrollX())) {
            return 0.0f;
        }
        float scrollX = (float) getScrollX();
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (horizontalFadingEdgeLength == 0) {
            return 0.0f;
        }
        float abs = Math.abs(scrollX - lineLeft);
        float f = (float) horizontalFadingEdgeLength;
        if (abs > f) {
            return 1.0f;
        }
        return abs / f;
    }

    public int getLeftPaddingOffset() {
        return (getCompoundPaddingLeft() - getPaddingLeft()) + ((int) Math.min(0.0f, this.f319308p - this.f319306o));
    }

    public float getLetterSpacing() {
        return this.f319262K.getLetterSpacing();
    }

    public int getLineCount() {
        Layout layout = this.f319264M;
        if (layout != null) {
            return layout.getLineCount();
        }
        return 0;
    }

    public int getLineHeight() {
        return (int) ((((long) (((((float) this.f319262K.getFontMetricsInt((Paint.FontMetricsInt) null)) * this.f319309p0) + this.f319326x0) * 1.6777216E7f)) + 8388608) >> 24);
    }

    public float getLineSpacingExtra() {
        return this.f319326x0;
    }

    public float getLineSpacingMultiplier() {
        return this.f319309p0;
    }

    public final ColorStateList getLinkTextColors() {
        return this.f319291f;
    }

    public final boolean getLinksClickable() {
        return this.f319279W;
    }

    public int getMaxEms() {
        if (this.f319280W0 == 1) {
            return this.f319278V0;
        }
        return -1;
    }

    public int getMaxHeight() {
        if (this.f319268Q0 == 2) {
            return this.f319329y0;
        }
        return -1;
    }

    public int getMaxLines() {
        if (this.f319268Q0 == 1) {
            return this.f319329y0;
        }
        return -1;
    }

    public int getMaxWidth() {
        if (this.f319280W0 == 2) {
            return this.f319278V0;
        }
        return -1;
    }

    public C110588j.C110590c getMenuCallback() {
        return this.f319256G1;
    }

    public int getMinEms() {
        if (this.f319282Y0 == 1) {
            return this.f319281X0;
        }
        return -1;
    }

    public int getMinHeight() {
        if (this.f319272S0 == 2) {
            return this.f319270R0;
        }
        return -1;
    }

    public int getMinLines() {
        if (this.f319272S0 == 1) {
            return this.f319270R0;
        }
        return -1;
    }

    public int getMinWidth() {
        if (this.f319282Y0 == 2) {
            return this.f319281X0;
        }
        return -1;
    }

    public final C109633a getMovementMethod() {
        return this.f319255G;
    }

    public TextPaint getPaint() {
        return this.f319262K;
    }

    public int getPaintFlags() {
        return this.f319262K.getFlags();
    }

    public String getPrivateImeOptions() {
        C106778a.C106787i iVar;
        C106778a aVar = this.f319246B1;
        if (aVar == null || (iVar = aVar.f319399j) == null) {
            return null;
        }
        return iVar.f319462b;
    }

    public Set<String> getReuseBrands() {
        return this.f319260I1;
    }

    public Set<String> getReuseItems() {
        return this.f319258H1;
    }

    public float getRightFadingEdgeStrength() {
        int horizontalFadingEdgeLength;
        if (getLineCount() != 1) {
            return super.getRightFadingEdgeStrength();
        }
        float scrollX = (float) (getScrollX() + ((getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight()));
        float lineRight = getLayout().getLineRight(0);
        if (lineRight < scrollX || (horizontalFadingEdgeLength = getHorizontalFadingEdgeLength()) == 0) {
            return 0.0f;
        }
        float abs = Math.abs(scrollX - lineRight);
        float f = (float) horizontalFadingEdgeLength;
        if (abs > f) {
            return 1.0f;
        }
        return abs / f;
    }

    public int getRightPaddingOffset() {
        return (-(getCompoundPaddingRight() - getPaddingRight())) + ((int) Math.max(0.0f, this.f319308p + this.f319306o));
    }

    @ViewDebug.ExportedProperty(category = "text")
    public float getScaledTextSize() {
        return this.f319262K.getTextSize() / this.f319262K.density;
    }

    public String getSelectedText() {
        if (!mo153978L()) {
            return null;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        CharSequence charSequence = this.f319243A;
        return String.valueOf(selectionStart > selectionEnd ? charSequence.subSequence(selectionEnd, selectionStart) : charSequence.subSequence(selectionStart, selectionEnd));
    }

    @ViewDebug.ExportedProperty(category = "text")
    public int getSelectionEnd() {
        return Selection.getSelectionEnd(getText());
    }

    @ViewDebug.ExportedProperty(category = "text")
    public int getSelectionStart() {
        return Selection.getSelectionStart(getText());
    }

    public int getShadowColor() {
        return this.f319313r;
    }

    public float getShadowDx() {
        return this.f319308p;
    }

    public float getShadowDy() {
        return this.f319311q;
    }

    public float getShadowRadius() {
        return this.f319306o;
    }

    public final boolean getShowSoftInputOnFocus() {
        C106778a aVar = this.f319246B1;
        return aVar == null || aVar.f319415z;
    }

    public Locale getSpellCheckerLocale() {
        AsyncTask.execute(new C109028a(this));
        return null;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getText() {
        return this.f319243A;
    }

    public TextClassificationContext getTextClassificationContext() {
        return this.f319323w;
    }

    public final TextClassificationManager getTextClassificationManagerForUser() {
        int i = Build.VERSION.SDK_INT;
        Object obj = null;
        if (i < 26) {
            return null;
        }
        getContext().getPackageName();
        Class cls = TextClassificationManager.class;
        if (this.f319303m1 == null && i >= 23) {
            obj = getContext().getSystemService(cls);
        }
        return (TextClassificationManager) obj;
    }

    public TextClassifier getTextClassificationSession() {
        TextClassifier textClassifier;
        if (Build.VERSION.SDK_INT >= 28 && ((textClassifier = this.f319321v) == null || textClassifier.isDestroyed())) {
            TextClassificationManager textClassificationManagerForUser = getTextClassificationManagerForUser();
            if (textClassificationManagerForUser != null) {
                TextClassificationContext build = new TextClassificationContext.Builder(getContext().getPackageName(), mo153985U() ? "edittext" : mo153986V() ? "textview" : "nosel-textview").build();
                this.f319323w = build;
                if (this.f319319u == null) {
                    this.f319321v = textClassificationManagerForUser.createTextClassificationSession(build);
                }
            } else {
                this.f319321v = TextClassifier.NO_OP;
            }
        }
        return this.f319321v;
    }

    public TextClassifier getTextClassifier() {
        if (this.f319319u == null) {
            TextClassificationManager textClassificationManagerForUser = getTextClassificationManagerForUser();
            if (textClassificationManagerForUser != null && Build.VERSION.SDK_INT >= 26) {
                return textClassificationManagerForUser.getTextClassifier();
            }
            if (Build.VERSION.SDK_INT >= 26) {
                return TextClassifier.NO_OP;
            }
        }
        return this.f319319u;
    }

    public final ColorStateList getTextColors() {
        return this.f319287d;
    }

    public Drawable getTextCursorDrawable() {
        if (this.f319316s1 == null && this.f319314r1 != 0) {
            this.f319316s1 = getContext().getDrawable(this.f319314r1);
        }
        return this.f319316s1;
    }

    public TextDirectionHeuristic getTextDirectionHeuristic() {
        if (this.f319257H instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        C106778a aVar = this.f319246B1;
        boolean z = false;
        if (aVar == null || (aVar.f319405p & 15) != 3) {
            if (getLayoutDirection() == 1) {
                z = true;
            }
            switch (getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            int i = Build.VERSION.SDK_INT;
            String str = null;
            DecimalFormatSymbols instance = i >= 24 ? DecimalFormatSymbols.getInstance(getTextLocale()) : null;
            if (i >= 28) {
                str = instance.getDigitStrings()[0];
            }
            byte directionality = Character.getDirectionality(str.codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
    }

    public Locale getTextLocale() {
        return this.f319262K.getTextLocale();
    }

    public LocaleList getTextLocales() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f319262K.getTextLocales();
        }
        return null;
    }

    public float getTextScaleX() {
        return this.f319262K.getTextScaleX();
    }

    public Drawable getTextSelectHandle() {
        if (this.f319330y1 == null && this.f319327x1 != 0) {
            this.f319330y1 = getContext().getDrawable(C0966R.C0969drawable.brw);
        }
        return this.f319330y1;
    }

    public Drawable getTextSelectHandleLeft() {
        if (this.f319320u1 == null && this.f319318t1 != 0) {
            this.f319320u1 = getContext().getDrawable(C0966R.C0969drawable.brv);
        }
        return this.f319320u1;
    }

    public Drawable getTextSelectHandleRight() {
        if (this.f319324w1 == null && this.f319322v1 != 0) {
            this.f319324w1 = getContext().getDrawable(C0966R.C0969drawable.brx);
        }
        return this.f319324w1;
    }

    public Locale getTextServicesLocale() {
        AsyncTask.execute(new C109028a(this));
        return Locale.getDefault();
    }

    public final TextServicesManager getTextServicesManagerForUser() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            return (TextServicesManager) getContext().getSystemService("textservices");
        }
        return (TextServicesManager) ((this.f319303m1 != null || i < 23) ? null : getContext().getSystemService(TextServicesManager.class));
    }

    @ViewDebug.ExportedProperty(category = "text")
    public float getTextSize() {
        return this.f319262K.getTextSize();
    }

    public int getTextSizeUnit() {
        return this.f319266P;
    }

    public int getTopPaddingOffset() {
        return (int) Math.min(0.0f, this.f319311q - this.f319306o);
    }

    public int getTotalPaddingBottom() {
        int i;
        int i2;
        int i3;
        int extendedPaddingBottom = getExtendedPaddingBottom();
        int i4 = this.f319273T & 112;
        Layout layout = this.f319264M;
        if (i4 != 80) {
            if (layout == this.f319253F) {
                i3 = getCompoundPaddingTop();
                i2 = getCompoundPaddingBottom();
            } else {
                i3 = getExtendedPaddingTop();
                i2 = getExtendedPaddingBottom();
            }
            int measuredHeight = getMeasuredHeight() - (i3 + i2);
            int height = layout.getHeight();
            if (height < measuredHeight) {
                i = measuredHeight - height;
                if (i4 != 48) {
                    i >>= 1;
                }
                return extendedPaddingBottom + i;
            }
        }
        i = 0;
        return extendedPaddingBottom + i;
    }

    public int getTotalPaddingEnd() {
        return getCompoundPaddingEnd();
    }

    public int getTotalPaddingLeft() {
        return getCompoundPaddingLeft();
    }

    public int getTotalPaddingRight() {
        return getCompoundPaddingRight();
    }

    public int getTotalPaddingStart() {
        return getCompoundPaddingStart();
    }

    public int getTotalPaddingTop() {
        return getExtendedPaddingTop() + mo153977K(true);
    }

    public final TransformationMethod getTransformationMethod() {
        return this.f319257H;
    }

    public CharSequence getTransformed() {
        return this.f319247C;
    }

    public Typeface getTypeface() {
        return this.f319262K.getTypeface();
    }

    @ViewDebug.ExportedProperty(category = "text", mapping = {@ViewDebug.IntToString(from = 0, to = "NORMAL"), @ViewDebug.IntToString(from = 1, to = "BOLD"), @ViewDebug.IntToString(from = 2, to = "ITALIC"), @ViewDebug.IntToString(from = 3, to = "BOLD_ITALIC")})
    public int getTypefaceStyle() {
        Typeface typeface = this.f319262K.getTypeface();
        if (typeface != null) {
            return typeface.getStyle();
        }
        return 0;
    }

    public URLSpan[] getUrls() {
        CharSequence charSequence = this.f319243A;
        return charSequence instanceof Spanned ? (URLSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), URLSpan.class) : new URLSpan[0];
    }

    public C110057b getWordIterator() {
        C106778a aVar = this.f319246B1;
        if (aVar == null) {
            return null;
        }
        if (aVar.f319379Q == null) {
            aVar.f319379Q = new C110057b(aVar.f319383U.getTextServicesLocale());
        }
        return aVar.f319379Q;
    }

    /* renamed from: h0 */
    public final void mo154125h0(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList<TextWatcher> arrayList = this.f319261J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.get(i4).beforeTextChanged(charSequence, i, i2, i3);
            }
        }
        Class<?> cls = null;
        try {
            cls = Class.forName("android.text.style.SpellCheckSpan");
        } catch (Throwable unused) {
        }
        if (cls != null) {
            mo154000d0(i, i + i2, cls);
        }
        mo154000d0(i, i2 + i, SuggestionSpan.class);
    }

    public boolean hasOverlappingRendering() {
        return ((getBackground() == null || getBackground().getCurrent() == null) && this.f319245B == null && !mo153978L() && !isHorizontalFadingEdgeEnabled() && this.f319313r == 0) ? false : true;
    }

    /* renamed from: i0 */
    public void mo154127i0(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList<TextWatcher> arrayList = this.f319261J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.get(i4).onTextChanged(charSequence, i, i2, i3);
            }
        }
        C106778a aVar = this.f319246B1;
        if (aVar != null) {
            aVar.mo154311p().getClass();
            aVar.f319381S = true;
            aVar.mo154315t();
            C106778a.C106796p pVar = aVar.f319391b;
            if (pVar != null) {
                pVar.mo154378g();
            }
            aVar.mo154297M();
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        int bottom;
        int compoundPaddingTop;
        int bottom2;
        boolean z = false;
        if (verifyDrawable(drawable)) {
            Rect bounds = drawable.getBounds();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            C106777f fVar = this.f319331z;
            if (fVar != null) {
                Drawable[] drawableArr = fVar.f319345b;
                if (drawable == drawableArr[0]) {
                    compoundPaddingTop = getCompoundPaddingTop();
                    int compoundPaddingBottom = getCompoundPaddingBottom();
                    scrollX += getPaddingLeft();
                    bottom2 = ((((getBottom() - getTop()) - compoundPaddingBottom) - compoundPaddingTop) - fVar.f319360q) / 2;
                } else if (drawable == drawableArr[2]) {
                    compoundPaddingTop = getCompoundPaddingTop();
                    int compoundPaddingBottom2 = getCompoundPaddingBottom();
                    scrollX += ((getRight() - getLeft()) - getPaddingRight()) - fVar.f319357n;
                    bottom2 = ((((getBottom() - getTop()) - compoundPaddingBottom2) - compoundPaddingTop) - fVar.f319361r) / 2;
                } else {
                    if (drawable == drawableArr[1]) {
                        int compoundPaddingLeft = getCompoundPaddingLeft();
                        scrollX += compoundPaddingLeft + (((((getRight() - getLeft()) - getCompoundPaddingRight()) - compoundPaddingLeft) - fVar.f319358o) / 2);
                        bottom = getPaddingTop();
                    } else if (drawable == drawableArr[3]) {
                        int compoundPaddingLeft2 = getCompoundPaddingLeft();
                        scrollX += compoundPaddingLeft2 + (((((getRight() - getLeft()) - getCompoundPaddingRight()) - compoundPaddingLeft2) - fVar.f319359p) / 2);
                        bottom = ((getBottom() - getTop()) - getPaddingBottom()) - fVar.f319355l;
                    }
                    scrollY += bottom;
                    z = true;
                }
                bottom = compoundPaddingTop + bottom2;
                scrollY += bottom;
                z = true;
            }
            if (z) {
                invalidate(bounds.left + scrollX, bounds.top + scrollY, bounds.right + scrollX, bounds.bottom + scrollY);
            }
        }
        if (!z) {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isPaddingOffsetRequired() {
        return (this.f319306o == 0.0f && this.f319331z == null) ? false : true;
    }

    /* renamed from: j0 */
    public final void mo154130j0(Editable editable, InputFilter[] inputFilterArr) {
        int i;
        C106778a aVar = this.f319246B1;
        if (aVar == null || (i = aVar.f319404o instanceof InputFilter) <= 0) {
            editable.setFilters(inputFilterArr);
            return;
        }
        InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + i)];
        System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, inputFilterArr.length);
        if (i != 0) {
            inputFilterArr2[inputFilterArr.length + 0] = (InputFilter) this.f319246B1.f319404o;
        }
        editable.setFilters(inputFilterArr2);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        C106777f fVar = this.f319331z;
        if (fVar != null) {
            for (Drawable drawable : fVar.f319345b) {
                if (drawable != null) {
                    drawable.jumpToCurrentState();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0090  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo154132k0(int r8, boolean r9) {
        /*
            r7 = this;
            r0 = r8 & 15
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x002b
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r8
            if (r0 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            r0 = r8 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0015
            android.text.method.TextKeyListener$Capitalize r0 = android.text.method.TextKeyListener.Capitalize.CHARACTERS
            goto L_0x0025
        L_0x0015:
            r0 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x001c
            android.text.method.TextKeyListener$Capitalize r0 = android.text.method.TextKeyListener.Capitalize.WORDS
            goto L_0x0025
        L_0x001c:
            r0 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0023
            android.text.method.TextKeyListener$Capitalize r0 = android.text.method.TextKeyListener.Capitalize.SENTENCES
            goto L_0x0025
        L_0x0023:
            android.text.method.TextKeyListener$Capitalize r0 = android.text.method.TextKeyListener.Capitalize.NONE
        L_0x0025:
            android.text.method.TextKeyListener r0 = android.text.method.TextKeyListener.getInstance(r2, r0)
            goto L_0x00a1
        L_0x002b:
            r3 = 2
            r4 = 26
            r5 = 0
            if (r0 != r3) goto L_0x005f
            java.util.Locale r0 = r7.getCustomLocaleForKeyListenerOrNull()
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L_0x004b
            r4 = r8 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x003f
            r4 = 1
            goto L_0x0040
        L_0x003f:
            r4 = 0
        L_0x0040:
            r5 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            android.text.method.DigitsKeyListener r2 = android.text.method.DigitsKeyListener.getInstance(r0, r4, r2)
            goto L_0x004c
        L_0x004b:
            r2 = r5
        L_0x004c:
            if (r0 == 0) goto L_0x005d
            int r0 = r2.getInputType()
            r4 = r0 & 15
            if (r4 == r3) goto L_0x005d
            r8 = r8 & 16
            if (r8 == 0) goto L_0x005c
            r0 = r0 | 128(0x80, float:1.794E-43)
        L_0x005c:
            r8 = r0
        L_0x005d:
            r0 = r2
            goto L_0x00a1
        L_0x005f:
            r2 = 4
            if (r0 != r2) goto L_0x0095
            java.util.Locale r0 = r7.getCustomLocaleForKeyListenerOrNull()
            r2 = r8 & 4080(0xff0, float:5.717E-42)
            r3 = 16
            if (r2 == r3) goto L_0x0082
            r3 = 32
            if (r2 == r3) goto L_0x0079
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L_0x008b
            android.text.method.DateTimeKeyListener r0 = android.text.method.DateTimeKeyListener.getInstance(r0)
            goto L_0x008c
        L_0x0079:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L_0x008b
            android.text.method.TimeKeyListener r0 = android.text.method.TimeKeyListener.getInstance(r0)
            goto L_0x008c
        L_0x0082:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L_0x008b
            android.text.method.DateKeyListener r0 = android.text.method.DateKeyListener.getInstance(r0)
            goto L_0x008c
        L_0x008b:
            r0 = r5
        L_0x008c:
            boolean r2 = r7.f319269R
            if (r2 == 0) goto L_0x00a1
            int r8 = r0.getInputType()
            goto L_0x00a1
        L_0x0095:
            r2 = 3
            if (r0 != r2) goto L_0x009d
            android.text.method.DialerKeyListener r0 = android.text.method.DialerKeyListener.getInstance()
            goto L_0x00a1
        L_0x009d:
            android.text.method.TextKeyListener r0 = android.text.method.TextKeyListener.getInstance()
        L_0x00a1:
            r7.setRawInputType(r8)
            r7.f319267Q = r1
            if (r9 == 0) goto L_0x00b0
            r7.mo153970C()
            com.tencent.mm.ui.widget.cedit.edit.a r8 = r7.f319246B1
            r8.f319404o = r0
            goto L_0x00b3
        L_0x00b0:
            r7.setKeyListenerOnly(r0)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.mo154132k0(int, boolean):void");
    }

    /* renamed from: l0 */
    public final void mo154133l0(float f, boolean z) {
        if (f != this.f319262K.getTextSize()) {
            this.f319262K.setTextSize(f);
            if (z && this.f319264M != null) {
                mo153988X();
                requestLayout();
                invalidate();
            }
        }
    }

    public int length() {
        return this.f319243A.length();
    }

    /* renamed from: m0 */
    public void mo153965m0(CharSequence charSequence, TextView.BufferType bufferType) {
        mo104415n0(charSequence, bufferType, true, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0081, code lost:
        if (r11.f319255G != null) goto L_0x0083;
     */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo104415n0(java.lang.CharSequence r12, android.widget.TextView.BufferType r13, boolean r14, int r15) {
        /*
            r11 = this;
            java.lang.String r0 = ""
            if (r12 != 0) goto L_0x0005
            r12 = r0
        L_0x0005:
            boolean r1 = r11.mo153984T()
            if (r1 != 0) goto L_0x000f
            java.lang.CharSequence r12 = r11.mo154003e0(r12)
        L_0x000f:
            boolean r1 = r11.f319263L
            if (r1 != 0) goto L_0x001a
            android.text.TextPaint r1 = r11.f319262K
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setTextScaleX(r2)
        L_0x001a:
            android.text.InputFilter[] r1 = r11.f319302l1
            int r1 = r1.length
            r2 = 0
            r10 = 0
        L_0x001f:
            if (r10 >= r1) goto L_0x0039
            android.text.InputFilter[] r3 = r11.f319302l1
            r3 = r3[r10]
            r5 = 0
            int r6 = r12.length()
            android.text.Spanned r7 = f319239M1
            r8 = 0
            r9 = 0
            r4 = r12
            java.lang.CharSequence r3 = r3.filter(r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0036
            r12 = r3
        L_0x0036:
            int r10 = r10 + 1
            goto L_0x001f
        L_0x0039:
            if (r14 == 0) goto L_0x0054
            java.lang.CharSequence r14 = r11.f319243A
            if (r14 == 0) goto L_0x004d
            int r15 = r14.length()
            java.lang.CharSequence r14 = r11.f319243A
            int r1 = r12.length()
            r11.mo154125h0(r14, r2, r15, r1)
            goto L_0x0054
        L_0x004d:
            int r14 = r12.length()
            r11.mo154125h0(r0, r2, r2, r14)
        L_0x0054:
            java.util.ArrayList<android.text.TextWatcher> r14 = r11.f319261J
            if (r14 == 0) goto L_0x0060
            int r14 = r14.size()
            if (r14 == 0) goto L_0x0060
            r14 = 1
            goto L_0x0061
        L_0x0060:
            r14 = 0
        L_0x0061:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r1 < r3) goto L_0x006e
            boolean r1 = r12 instanceof android.text.PrecomputedText
            if (r1 == 0) goto L_0x006e
            r1 = r12
            android.text.PrecomputedText r1 = (android.text.PrecomputedText) r1
        L_0x006e:
            android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.EDITABLE
            if (r13 == r1) goto L_0x008a
            android.text.method.KeyListener r1 = r11.getKeyListener()
            if (r1 != 0) goto L_0x008a
            if (r14 == 0) goto L_0x007b
            goto L_0x008a
        L_0x007b:
            android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.SPANNABLE
            if (r13 == r1) goto L_0x0083
            mo3.a r1 = r11.f319255G
            if (r1 == 0) goto L_0x00a6
        L_0x0083:
            android.text.Spannable$Factory r1 = r11.f319304n
            android.text.Spannable r12 = r1.newSpannable(r12)
            goto L_0x00a6
        L_0x008a:
            r11.mo153970C()
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r11.f319246B1
            r1.getClass()
            android.text.Editable$Factory r1 = r11.f319299j
            android.text.Editable r12 = r1.newEditable(r12)
            android.text.InputFilter[] r1 = r11.f319302l1
            r11.mo154130j0(r12, r1)
            android.view.inputmethod.InputMethodManager r1 = r11.getInputMethodManager()
            if (r1 == 0) goto L_0x00a6
            r1.restartInput(r11)
        L_0x00a6:
            int r1 = r11.f319277V
            if (r1 == 0) goto L_0x00e2
            android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.EDITABLE
            if (r13 == r1) goto L_0x00ba
            boolean r1 = r12 instanceof android.text.Spannable
            if (r1 == 0) goto L_0x00b3
            goto L_0x00ba
        L_0x00b3:
            android.text.Spannable$Factory r1 = r11.f319304n
            android.text.Spannable r1 = r1.newSpannable(r12)
            goto L_0x00bd
        L_0x00ba:
            r1 = r12
            android.text.Spannable r1 = (android.text.Spannable) r1
        L_0x00bd:
            int r3 = r11.f319277V
            boolean r3 = android.text.util.Linkify.addLinks(r1, r3)
            if (r3 == 0) goto L_0x00e2
            android.widget.TextView$BufferType r12 = android.widget.TextView.BufferType.EDITABLE
            if (r13 != r12) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            android.widget.TextView$BufferType r12 = android.widget.TextView.BufferType.SPANNABLE
        L_0x00cc:
            r13 = r12
            r11.setTextInternal(r1)
            boolean r12 = r11.f319279W
            if (r12 == 0) goto L_0x00e1
            boolean r12 = r11.mo154261u0()
            if (r12 != 0) goto L_0x00e1
            mo3.a r12 = com.tencent.p014mm.p136ui.widget.cedit.move.LinkMovementMethod.getInstance()
            r11.setMovementMethod(r12)
        L_0x00e1:
            r12 = r1
        L_0x00e2:
            r11.f319249D = r13
            r11.setTextInternal(r12)
            android.text.method.TransformationMethod r13 = r11.f319257H
            if (r13 != 0) goto L_0x00ee
            r11.f319247C = r12
            goto L_0x00f4
        L_0x00ee:
            java.lang.CharSequence r13 = r13.getTransformation(r12, r11)
            r11.f319247C = r13
        L_0x00f4:
            java.lang.CharSequence r13 = r11.f319247C
            if (r13 != 0) goto L_0x00fa
            r11.f319247C = r0
        L_0x00fa:
            int r13 = r12.length()
            boolean r0 = r12 instanceof android.text.Spannable
            if (r0 == 0) goto L_0x0156
            r0 = r12
            android.text.Spannable r0 = (android.text.Spannable) r0
            int r1 = r0.length()
            java.lang.Class<com.tencent.mm.ui.widget.cedit.edit.CustomTextView$e> r3 = com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.C106776e.class
            java.lang.Object[] r1 = r0.getSpans(r2, r1, r3)
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$e[] r1 = (com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.C106776e[]) r1
            int r3 = r1.length
            r4 = 0
        L_0x0113:
            if (r4 >= r3) goto L_0x011d
            r5 = r1[r4]
            r0.removeSpan(r5)
            int r4 = r4 + 1
            goto L_0x0113
        L_0x011d:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$e r1 = r11.f319259I
            if (r1 != 0) goto L_0x0129
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$e r1 = new com.tencent.mm.ui.widget.cedit.edit.CustomTextView$e
            r3 = 0
            r1.<init>(r3)
            r11.f319259I = r1
        L_0x0129:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$e r1 = r11.f319259I
            r3 = 6553618(0x640012, float:9.183575E-39)
            r0.setSpan(r1, r2, r13, r3)
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r11.f319246B1
            r3 = 18
            if (r1 == 0) goto L_0x0142
            int r4 = r0.length()
            android.text.method.KeyListener r1 = r1.f319404o
            if (r1 == 0) goto L_0x0142
            r0.setSpan(r1, r2, r4, r3)
        L_0x0142:
            android.text.method.TransformationMethod r1 = r11.f319257H
            if (r1 == 0) goto L_0x0149
            r0.setSpan(r1, r2, r13, r3)
        L_0x0149:
            mo3.a r1 = r11.f319255G
            if (r1 == 0) goto L_0x0156
            r1.initialize(r11, r0)
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r11.f319246B1
            if (r0 == 0) goto L_0x0156
            r0.f319402m = r2
        L_0x0156:
            android.text.Layout r0 = r11.f319264M
            if (r0 == 0) goto L_0x015d
            r11.mo154270z()
        L_0x015d:
            r11.mo154127i0(r12, r2, r15, r13)
            if (r14 == 0) goto L_0x017a
            android.text.Editable r12 = (android.text.Editable) r12
            java.util.ArrayList<android.text.TextWatcher> r13 = r11.f319261J
            if (r13 == 0) goto L_0x017a
            int r14 = r13.size()
        L_0x016c:
            if (r2 >= r14) goto L_0x017a
            java.lang.Object r15 = r13.get(r2)
            android.text.TextWatcher r15 = (android.text.TextWatcher) r15
            r15.afterTextChanged(r12)
            int r2 = r2 + 1
            goto L_0x016c
        L_0x017a:
            com.tencent.mm.ui.widget.cedit.edit.a r12 = r11.f319246B1
            if (r12 == 0) goto L_0x0181
            r12.mo154288C()
        L_0x0181:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.mo104415n0(java.lang.CharSequence, android.widget.TextView$BufferType, boolean, int):void");
    }

    /* renamed from: o0 */
    public void mo154135o0(Typeface typeface, int i) {
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setTypeface(defaultFromStyle);
            int i2 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i;
            TextPaint textPaint = this.f319262K;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f319262K;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f319262K.setFakeBoldText(false);
        this.f319262K.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C106778a aVar = this.f319246B1;
        if (aVar != null) {
            ViewTreeObserver viewTreeObserver = aVar.f319383U.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                C106778a.C106791l lVar = aVar.f319389a;
                if (lVar != null) {
                    viewTreeObserver.addOnTouchModeChangeListener(lVar);
                }
                C106778a.C106796p pVar = aVar.f319391b;
                if (pVar != null) {
                    pVar.mo154378g();
                    viewTreeObserver.addOnTouchModeChangeListener(aVar.f319391b);
                }
                viewTreeObserver.addOnDrawListener(aVar.f319397h);
            }
            if (aVar.f319383U.mo153978L()) {
                aVar.mo154289D();
            }
            C106778a.C106782d dVar = aVar.f319410u;
            if (dVar != null) {
                dVar.f319419d = false;
                aVar.mo154321z();
            }
        }
        if (this.f319317t) {
            getViewTreeObserver().addOnPreDrawListener(this);
            this.f319317t = false;
        }
        post(new C106774c());
    }

    public boolean onCheckIsTextEditor() {
        C106778a aVar = this.f319246B1;
        return (aVar == null || aVar.f319405p == 0) ? false : true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.f319265N) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f319262K.setTextLocales(LocaleList.getDefault());
            } else {
                this.f319262K.setTextLocale(Locale.getDefault());
            }
            if (this.f319264M != null) {
                mo153988X();
                requestLayout();
                invalidate();
            }
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] iArr;
        if (this.f319283Z0) {
            iArr = super.onCreateDrawableState(i);
        } else {
            iArr = super.onCreateDrawableState(i + 1);
            View.mergeDrawableStates(iArr, f319240N1);
        }
        if (mo153986V()) {
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (iArr[i2] == 16842919) {
                    int[] iArr2 = new int[(length - 1)];
                    System.arraycopy(iArr, 0, iArr2, 0, i2);
                    System.arraycopy(iArr, i2 + 1, iArr2, i2, (length - i2) - 1);
                    return iArr2;
                }
            }
        }
        return iArr;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (onCheckIsTextEditor() && isEnabled()) {
            C106778a aVar = this.f319246B1;
            if (aVar.f319400k == null) {
                aVar.f319400k = new C106778a.C106788j();
            }
            editorInfo.inputType = getInputType();
            C106778a.C106787i iVar = this.f319246B1.f319399j;
            boolean z = false;
            if (iVar != null) {
                editorInfo.imeOptions = iVar.f319461a;
                editorInfo.privateImeOptions = iVar.f319462b;
                editorInfo.actionLabel = iVar.f319463c;
                editorInfo.actionId = iVar.f319464d;
                editorInfo.extras = iVar.f319465e;
                if (Build.VERSION.SDK_INT >= 24) {
                    editorInfo.hintLocales = iVar.f319468h;
                }
            } else {
                editorInfo.imeOptions = 0;
                if (Build.VERSION.SDK_INT >= 24) {
                    editorInfo.hintLocales = null;
                }
            }
            int i = editorInfo.imeOptions;
            if ((i & 255) == 0) {
                if ((134217728 & i) != 0) {
                    editorInfo.imeOptions = i | 5;
                } else {
                    editorInfo.imeOptions = i | 6;
                }
                if (!mo154158q0()) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
            if ((editorInfo.inputType & 131087) == 131073) {
                z = true;
            }
            if (z) {
                editorInfo.imeOptions |= 1073741824;
            }
            editorInfo.hintText = this.f319251E;
            if (this.f319243A instanceof Editable) {
                C109029c cVar = new C109029c(this);
                editorInfo.initialSelStart = getSelectionStart();
                editorInfo.initialSelEnd = getSelectionEnd();
                editorInfo.initialCapsMode = cVar.getCursorCapsMode(getInputType());
                return cVar;
            }
        }
        return null;
    }

    public void onDetachedFromWindow() {
        Runnable runnable;
        super.onDetachedFromWindow();
        if (this.f319315s) {
            getViewTreeObserver().removeOnPreDrawListener(this);
            this.f319317t = true;
        }
        C106778a aVar = this.f319246B1;
        if (aVar != null) {
            C106778a.C106782d dVar = aVar.f319410u;
            if (dVar != null && !dVar.f319419d) {
                C106778a.this.f319383U.removeCallbacks(dVar);
                dVar.f319419d = true;
            }
            C106778a.C106791l lVar = aVar.f319389a;
            if (lVar != null) {
                C106778a.this.f319383U.getViewTreeObserver().removeOnTouchModeChangeListener(lVar);
                C106778a.C106789k kVar = lVar.f319485d;
                if (!(kVar == null || (runnable = kVar.f319480Q) == null)) {
                    C106778a.this.f319383U.removeCallbacks(runnable);
                }
            }
            C106778a.C106796p pVar = aVar.f319391b;
            if (pVar != null) {
                C106778a.this.f319383U.getViewTreeObserver().removeOnTouchModeChangeListener(pVar);
            }
            Runnable runnable2 = aVar.f319378P;
            if (runnable2 != null) {
                aVar.f319383U.removeCallbacks(runnable2);
            }
            aVar.f319383U.removeCallbacks(aVar.f319384V);
            ViewTreeObserver viewTreeObserver = aVar.f319383U.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(aVar.f319397h);
            }
            aVar.mo154315t();
            aVar.mo154298N();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c A[Catch:{ all -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078 A[Catch:{ all -> 0x00e0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDragEvent(android.view.DragEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0100
            r3 = 2
            if (r0 == r3) goto L_0x00e8
            r3 = 3
            if (r0 == r3) goto L_0x0016
            r9 = 5
            if (r0 == r9) goto L_0x0012
            return r2
        L_0x0012:
            r8.requestFocus()
            return r2
        L_0x0016:
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r8.f319246B1
            if (r0 == 0) goto L_0x00e7
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r0.f319383U
            r4.mo154259t()
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r0.f319383U     // Catch:{ all -> 0x00e0 }
            float r5 = r9.getX()     // Catch:{ all -> 0x00e0 }
            float r6 = r9.getY()     // Catch:{ all -> 0x00e0 }
            int r4 = r4.mo153976J(r5, r6)     // Catch:{ all -> 0x00e0 }
            java.lang.Object r9 = r9.getLocalState()     // Catch:{ all -> 0x00e0 }
            r5 = 0
            boolean r6 = r9 instanceof com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.C106785g     // Catch:{ all -> 0x00e0 }
            if (r6 == 0) goto L_0x003e
            r5 = r9
            com.tencent.mm.ui.widget.cedit.edit.a$g r5 = (com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.C106785g) r5     // Catch:{ all -> 0x00e0 }
        L_0x003e:
            if (r5 == 0) goto L_0x0049
            r5.getClass()     // Catch:{ all -> 0x00e0 }
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r9 = r0.f319383U     // Catch:{ all -> 0x00e0 }
            if (r9 != 0) goto L_0x0049
            r9 = 1
            goto L_0x004a
        L_0x0049:
            r9 = 0
        L_0x004a:
            if (r9 == 0) goto L_0x0058
            r5.getClass()     // Catch:{ all -> 0x00e0 }
            if (r4 < 0) goto L_0x0058
            r5.getClass()     // Catch:{ all -> 0x00e0 }
            if (r4 >= 0) goto L_0x0058
            goto L_0x00da
        L_0x0058:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r0.f319383U     // Catch:{ all -> 0x00e0 }
            java.lang.CharSequence r6 = r6.getText()     // Catch:{ all -> 0x00e0 }
            int r6 = r6.length()     // Catch:{ all -> 0x00e0 }
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r7 = r0.f319383U     // Catch:{ all -> 0x00e0 }
            java.lang.CharSequence r7 = r7.getText()     // Catch:{ all -> 0x00e0 }
            android.text.Spannable r7 = (android.text.Spannable) r7     // Catch:{ all -> 0x00e0 }
            android.text.Selection.setSelection(r7, r4)     // Catch:{ all -> 0x00e0 }
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r7 = r0.f319383U     // Catch:{ all -> 0x00e0 }
            java.lang.CharSequence r7 = r7.f319243A     // Catch:{ all -> 0x00e0 }
            android.text.Editable r7 = (android.text.Editable) r7     // Catch:{ all -> 0x00e0 }
            r7.replace(r4, r4, r3)     // Catch:{ all -> 0x00e0 }
            if (r9 == 0) goto L_0x00da
            r9 = 0
            r5.getClass()     // Catch:{ all -> 0x00e0 }
            r3 = 0
            r5.getClass()     // Catch:{ all -> 0x00e0 }
            if (r4 > 0) goto L_0x008f
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r0.f319383U     // Catch:{ all -> 0x00e0 }
            java.lang.CharSequence r4 = r4.getText()     // Catch:{ all -> 0x00e0 }
            int r4 = r4.length()     // Catch:{ all -> 0x00e0 }
            int r4 = r4 - r6
            int r9 = r9 + r4
            int r3 = r3 + r4
        L_0x008f:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r0.f319383U     // Catch:{ all -> 0x00e0 }
            java.lang.CharSequence r4 = r4.f319243A     // Catch:{ all -> 0x00e0 }
            android.text.Editable r4 = (android.text.Editable) r4     // Catch:{ all -> 0x00e0 }
            r4.delete(r9, r3)     // Catch:{ all -> 0x00e0 }
            int r3 = r9 + -1
            int r3 = java.lang.Math.max(r1, r3)     // Catch:{ all -> 0x00e0 }
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r0.f319383U     // Catch:{ all -> 0x00e0 }
            java.lang.CharSequence r4 = r4.getText()     // Catch:{ all -> 0x00e0 }
            int r4 = r4.length()     // Catch:{ all -> 0x00e0 }
            int r9 = r9 + r2
            int r9 = java.lang.Math.min(r4, r9)     // Catch:{ all -> 0x00e0 }
            int r4 = r3 + 1
            if (r9 <= r4) goto L_0x00da
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r0.f319383U     // Catch:{ all -> 0x00e0 }
            java.lang.CharSequence r6 = r5.f319247C     // Catch:{ all -> 0x00e0 }
            java.lang.CharSequence r9 = r6.subSequence(r3, r9)     // Catch:{ all -> 0x00e0 }
            java.lang.CharSequence r9 = r5.mo154003e0(r9)     // Catch:{ all -> 0x00e0 }
            char r1 = r9.charAt(r1)     // Catch:{ all -> 0x00e0 }
            boolean r1 = java.lang.Character.isSpaceChar(r1)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00da
            char r9 = r9.charAt(r2)     // Catch:{ all -> 0x00e0 }
            boolean r9 = java.lang.Character.isSpaceChar(r9)     // Catch:{ all -> 0x00e0 }
            if (r9 == 0) goto L_0x00da
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r9 = r0.f319383U     // Catch:{ all -> 0x00e0 }
            java.lang.CharSequence r9 = r9.f319243A     // Catch:{ all -> 0x00e0 }
            android.text.Editable r9 = (android.text.Editable) r9     // Catch:{ all -> 0x00e0 }
            r9.delete(r3, r4)     // Catch:{ all -> 0x00e0 }
        L_0x00da:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r9 = r0.f319383U
            r9.mo153972F()
            goto L_0x00e7
        L_0x00e0:
            r9 = move-exception
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r0.f319383U
            r0.mo153972F()
            throw r9
        L_0x00e7:
            return r2
        L_0x00e8:
            java.lang.CharSequence r0 = r8.f319243A
            boolean r0 = r0 instanceof android.text.Spannable
            if (r0 == 0) goto L_0x00ff
            float r0 = r9.getX()
            float r9 = r9.getY()
            int r9 = r8.mo153976J(r0, r9)
            android.text.Spannable r0 = r8.f319245B
            android.text.Selection.setSelection(r0, r9)
        L_0x00ff:
            return r2
        L_0x0100:
            com.tencent.mm.ui.widget.cedit.edit.a r9 = r8.f319246B1
            if (r9 == 0) goto L_0x0109
            boolean r9 = r9.f319393d
            if (r9 == 0) goto L_0x0109
            r1 = 1
        L_0x0109:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.onDragEvent(android.view.DragEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x028e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            super.onDraw(r20)
            int r2 = r19.getCompoundPaddingLeft()
            int r3 = r19.getCompoundPaddingTop()
            int r4 = r19.getCompoundPaddingRight()
            int r5 = r19.getCompoundPaddingBottom()
            int r6 = r19.getScrollX()
            int r7 = r19.getScrollY()
            int r8 = r19.getRight()
            int r9 = r19.getLeft()
            int r10 = r19.getBottom()
            int r11 = r19.getTop()
            int r12 = r19.getHorizontalOffsetForDrawables()
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$f r13 = r0.f319331z
            r15 = 0
            if (r13 == 0) goto L_0x00f2
            int r16 = r10 - r11
            int r16 = r16 - r5
            int r16 = r16 - r3
            int r17 = r8 - r9
            int r17 = r17 - r4
            int r17 = r17 - r2
            android.graphics.drawable.Drawable[] r4 = r13.f319345b
            r4 = r4[r15]
            r18 = 2
            if (r4 == 0) goto L_0x006d
            r20.save()
            int r4 = r19.getPaddingLeft()
            int r4 = r4 + r6
            int r4 = r4 + r12
            float r4 = (float) r4
            int r12 = r7 + r3
            int r14 = r13.f319360q
            int r14 = r16 - r14
            int r14 = r14 / 2
            int r12 = r12 + r14
            float r12 = (float) r12
            r1.translate(r4, r12)
            android.graphics.drawable.Drawable[] r4 = r13.f319345b
            r4 = r4[r15]
            r4.draw(r1)
            r20.restore()
        L_0x006d:
            android.graphics.drawable.Drawable[] r4 = r13.f319345b
            r4 = r4[r18]
            if (r4 == 0) goto L_0x009b
            r20.save()
            int r4 = r6 + r8
            int r4 = r4 - r9
            int r12 = r19.getPaddingRight()
            int r4 = r4 - r12
            int r12 = r13.f319357n
            int r4 = r4 - r12
            int r4 = r4 - r15
            float r4 = (float) r4
            int r12 = r7 + r3
            int r14 = r13.f319361r
            int r16 = r16 - r14
            int r16 = r16 / 2
            int r12 = r12 + r16
            float r12 = (float) r12
            r1.translate(r4, r12)
            android.graphics.drawable.Drawable[] r4 = r13.f319345b
            r4 = r4[r18]
            r4.draw(r1)
            r20.restore()
        L_0x009b:
            android.graphics.drawable.Drawable[] r4 = r13.f319345b
            r12 = 1
            r4 = r4[r12]
            if (r4 == 0) goto L_0x00c3
            r20.save()
            int r4 = r6 + r2
            int r12 = r13.f319358o
            int r12 = r17 - r12
            int r12 = r12 / 2
            int r4 = r4 + r12
            float r4 = (float) r4
            int r12 = r19.getPaddingTop()
            int r12 = r12 + r7
            float r12 = (float) r12
            r1.translate(r4, r12)
            android.graphics.drawable.Drawable[] r4 = r13.f319345b
            r12 = 1
            r4 = r4[r12]
            r4.draw(r1)
            r20.restore()
        L_0x00c3:
            android.graphics.drawable.Drawable[] r4 = r13.f319345b
            r12 = 3
            r4 = r4[r12]
            if (r4 == 0) goto L_0x00f2
            r20.save()
            int r4 = r6 + r2
            int r14 = r13.f319359p
            int r17 = r17 - r14
            int r17 = r17 / 2
            int r4 = r4 + r17
            float r4 = (float) r4
            int r14 = r7 + r10
            int r14 = r14 - r11
            int r16 = r19.getPaddingBottom()
            int r14 = r14 - r16
            int r15 = r13.f319355l
            int r14 = r14 - r15
            float r14 = (float) r14
            r1.translate(r4, r14)
            android.graphics.drawable.Drawable[] r4 = r13.f319345b
            r4 = r4[r12]
            r4.draw(r1)
            r20.restore()
        L_0x00f2:
            int r4 = r0.f319293g
            android.text.Layout r12 = r0.f319264M
            if (r12 != 0) goto L_0x00fb
            r19.mo154161s()
        L_0x00fb:
            android.text.Layout r12 = r0.f319264M
            java.lang.CharSequence r13 = r0.f319251E
            if (r13 == 0) goto L_0x0111
            java.lang.CharSequence r13 = r0.f319243A
            int r13 = r13.length()
            if (r13 != 0) goto L_0x0111
            android.content.res.ColorStateList r12 = r0.f319289e
            if (r12 == 0) goto L_0x010f
            int r4 = r0.f319295h
        L_0x010f:
            android.text.Layout r12 = r0.f319253F
        L_0x0111:
            android.text.TextPaint r13 = r0.f319262K
            r13.setColor(r4)
            android.text.TextPaint r4 = r0.f319262K
            int[] r13 = r19.getDrawableState()
            r4.drawableState = r13
            r20.save()
            int r4 = r19.getExtendedPaddingTop()
            int r13 = r19.getExtendedPaddingBottom()
            int r14 = r19.getBottom()
            int r15 = r19.getTop()
            int r14 = r14 - r15
            int r14 = r14 - r5
            int r14 = r14 - r3
            android.text.Layout r3 = r0.f319264M
            int r3 = r3.getHeight()
            int r3 = r3 - r14
            int r5 = r2 + r6
            float r5 = (float) r5
            r14 = 0
            if (r7 != 0) goto L_0x0143
            r15 = 0
            goto L_0x0146
        L_0x0143:
            int r15 = r4 + r7
            float r15 = (float) r15
        L_0x0146:
            int r8 = r8 - r9
            int r9 = r19.getCompoundPaddingRight()
            int r8 = r8 - r9
            int r8 = r8 + r6
            float r6 = (float) r8
            int r10 = r10 - r11
            int r10 = r10 + r7
            if (r7 != r3) goto L_0x0153
            r13 = 0
        L_0x0153:
            int r10 = r10 - r13
            float r3 = (float) r10
            float r7 = r0.f319306o
            int r8 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0181
            float r8 = r0.f319308p
            float r8 = r8 - r7
            float r7 = java.lang.Math.min(r14, r8)
            float r5 = r5 + r7
            float r7 = r0.f319308p
            float r8 = r0.f319306o
            float r7 = r7 + r8
            float r7 = java.lang.Math.max(r14, r7)
            float r6 = r6 + r7
            float r7 = r0.f319311q
            float r8 = r0.f319306o
            float r7 = r7 - r8
            float r7 = java.lang.Math.min(r14, r7)
            float r15 = r15 + r7
            float r7 = r0.f319311q
            float r8 = r0.f319306o
            float r7 = r7 + r8
            float r7 = java.lang.Math.max(r14, r7)
            float r3 = r3 + r7
        L_0x0181:
            r1.clipRect(r5, r15, r6, r3)
            int r3 = r0.f319273T
            r3 = r3 & 112(0x70, float:1.57E-43)
            r5 = 48
            if (r3 == r5) goto L_0x0198
            r3 = 0
            int r5 = r0.mo153977K(r3)
            r3 = 1
            int r6 = r0.mo153977K(r3)
            r3 = r5
            goto L_0x019a
        L_0x0198:
            r3 = 0
            r6 = 0
        L_0x019a:
            float r2 = (float) r2
            int r4 = r4 + r3
            float r4 = (float) r4
            r1.translate(r2, r4)
            int r6 = r6 - r3
            android.graphics.Path r2 = r19.getUpdatedHighlightPath()
            com.tencent.mm.ui.widget.cedit.edit.a r3 = r0.f319246B1
            if (r3 == 0) goto L_0x0298
            android.graphics.Paint r4 = r0.f319310p1
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r3.f319383U
            int r5 = r5.getSelectionStart()
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r7 = r3.f319383U
            int r7 = r7.getSelectionEnd()
            com.tencent.mm.ui.widget.cedit.edit.a$j r8 = r3.f319400k
            if (r8 == 0) goto L_0x01d8
            int r9 = r8.f319471c
            if (r9 != 0) goto L_0x01d8
            android.view.inputmethod.InputMethodManager r9 = r3.mo154306k()
            if (r9 == 0) goto L_0x01d8
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r10 = r3.f319383U
            boolean r9 = r9.isActive(r10)
            if (r9 == 0) goto L_0x01d8
            boolean r9 = r8.f319474f
            if (r9 != 0) goto L_0x01d5
            boolean r8 = r8.f319473e
            if (r8 == 0) goto L_0x01d8
        L_0x01d5:
            r3.mo154290E()
        L_0x01d8:
            com.tencent.mm.ui.widget.cedit.edit.a$e r8 = r3.f319398i
            r9 = 0
            if (r8 == 0) goto L_0x026d
            com.tencent.mm.ui.widget.cedit.edit.a r10 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r10 = r10.f319383U
            android.text.Layout r10 = r10.getLayout()
            if (r10 != 0) goto L_0x01e9
            r10 = 0
            goto L_0x020c
        L_0x01e9:
            com.tencent.mm.ui.widget.cedit.edit.a r11 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r11 = r11.f319383U
            java.lang.CharSequence r11 = r11.getText()
            int r11 = r11.length()
            int r13 = r8.f319423c
            int r13 = java.lang.Math.min(r11, r13)
            int r15 = r8.f319424d
            int r11 = java.lang.Math.min(r11, r15)
            android.graphics.Path r15 = r8.f319421a
            r15.reset()
            android.graphics.Path r15 = r8.f319421a
            r10.getSelectionPath(r13, r11, r15)
            r10 = 1
        L_0x020c:
            if (r10 == 0) goto L_0x0263
            long r10 = android.os.SystemClock.uptimeMillis()
            long r14 = r8.f319425e
            long r10 = r10 - r14
            r14 = 400(0x190, double:1.976E-321)
            int r17 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r17 <= 0) goto L_0x021d
            r10 = 0
            goto L_0x0245
        L_0x021d:
            r14 = 1065353216(0x3f800000, float:1.0)
            float r10 = (float) r10
            r11 = 1137180672(0x43c80000, float:400.0)
            float r10 = r10 / r11
            float r14 = r14 - r10
            com.tencent.mm.ui.widget.cedit.edit.a r10 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r10 = r10.f319383U
            int r10 = r10.f319305n1
            int r10 = android.graphics.Color.alpha(r10)
            com.tencent.mm.ui.widget.cedit.edit.a r11 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r11 = r11.f319383U
            int r11 = r11.f319305n1
            r15 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r15
            float r10 = (float) r10
            float r10 = r10 * r14
            int r10 = (int) r10
            int r10 = r10 << 24
            int r11 = r11 + r10
            android.graphics.Paint r10 = r8.f319422b
            r10.setColor(r11)
            r10 = 1
        L_0x0245:
            if (r10 == 0) goto L_0x0263
            if (r6 == 0) goto L_0x024f
            float r10 = (float) r6
            r11 = 0
            r1.translate(r11, r10)
            goto L_0x0250
        L_0x024f:
            r11 = 0
        L_0x0250:
            android.graphics.Path r10 = r8.f319421a
            android.graphics.Paint r13 = r8.f319422b
            r1.drawPath(r10, r13)
            if (r6 == 0) goto L_0x025e
            int r10 = -r6
            float r10 = (float) r10
            r1.translate(r11, r10)
        L_0x025e:
            r10 = 1
            r8.mo154326a(r10)
            goto L_0x026e
        L_0x0263:
            r10 = 1
            com.tencent.mm.ui.widget.cedit.edit.a r11 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            r11.f319398i = r9
            r11 = 0
            r8.mo154326a(r11)
            goto L_0x026f
        L_0x026d:
            r10 = 1
        L_0x026e:
            r11 = 0
        L_0x026f:
            if (r2 == 0) goto L_0x0294
            if (r5 != r7) goto L_0x0294
            android.graphics.drawable.Drawable r5 = r3.f319368F
            if (r5 == 0) goto L_0x0294
            if (r6 == 0) goto L_0x027b
            r14 = 1
            goto L_0x027c
        L_0x027b:
            r14 = 0
        L_0x027c:
            if (r14 == 0) goto L_0x0284
            float r2 = (float) r6
            r5 = 0
            r1.translate(r5, r2)
            goto L_0x0285
        L_0x0284:
            r5 = 0
        L_0x0285:
            android.graphics.drawable.Drawable r2 = r3.f319368F
            if (r2 == 0) goto L_0x028c
            r2.draw(r1)
        L_0x028c:
            if (r14 == 0) goto L_0x0293
            int r2 = -r6
            float r2 = (float) r2
            r1.translate(r5, r2)
        L_0x0293:
            r2 = r9
        L_0x0294:
            r12.draw(r1, r2, r4, r6)
            goto L_0x029d
        L_0x0298:
            android.graphics.Paint r3 = r0.f319310p1
            r12.draw(r1, r2, r3, r6)
        L_0x029d:
            r20.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.onDraw(android.graphics.Canvas):void");
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        Spannable spannable;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 24 || !isTemporarilyDetached()) {
            C106778a aVar = this.f319246B1;
            if (aVar != null) {
                aVar.f319408s = SystemClock.uptimeMillis();
                C106778a.C106788j jVar = aVar.f319400k;
                boolean z2 = false;
                if (!(jVar == null || jVar.f319471c == 0)) {
                    jVar.f319471c = 0;
                    aVar.mo154304i(jVar);
                }
                if (z) {
                    int selectionStart = aVar.f319383U.getSelectionStart();
                    int selectionEnd = aVar.f319383U.getSelectionEnd();
                    aVar.f319375M = aVar.f319401l && aVar.f319383U.mo153978L() && !(aVar.f319412w && selectionStart == 0 && selectionEnd == aVar.f319383U.getText().length());
                    if (!aVar.f319401l || selectionStart < 0 || selectionEnd < 0) {
                        C106778a.C106796p pVar = aVar.f319391b;
                        if (pVar == null || (i2 = pVar.f319518f) < 0) {
                            i2 = -1;
                        } else if (i2 > aVar.f319383U.getText().length()) {
                            i2 = aVar.f319383U.getText().length();
                        }
                        if (i2 >= 0) {
                            Selection.setSelection((Spannable) aVar.f319383U.getText(), i2);
                        }
                        C109633a movementMethod = aVar.f319383U.getMovementMethod();
                        if (movementMethod != null) {
                            CustomTextView customTextView = aVar.f319383U;
                            movementMethod.onTakeFocus(customTextView, (Spannable) customTextView.getText(), i);
                        }
                        aVar.f319383U.getClass();
                        if (aVar.f319402m && selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection((Spannable) aVar.f319383U.getText(), selectionStart, selectionEnd);
                        }
                        if (aVar.f319412w) {
                            aVar.f319383U.mo154007g0();
                        }
                        aVar.f319403n = true;
                    }
                    aVar.f319401l = false;
                    aVar.f319402m = false;
                    aVar.mo154321z();
                } else {
                    aVar.f319383U.getClass();
                    aVar.f319383U.getClass();
                    aVar.mo154315t();
                    if (i3 >= 24) {
                        z2 = aVar.f319383U.isTemporarilyDetached();
                    }
                    if (z2) {
                        aVar.mo154298N();
                    } else {
                        aVar.mo154297M();
                    }
                    C106778a.C106796p pVar2 = aVar.f319391b;
                    if (pVar2 != null) {
                        pVar2.mo154378g();
                    }
                    aVar.mo154301f();
                }
            }
            if (z && (spannable = this.f319245B) != null) {
                MetaKeyKeyListener.resetMetaState(spannable);
            }
            TransformationMethod transformationMethod = this.f319257H;
            if (transformationMethod != null) {
                transformationMethod.onFocusChanged(this, this.f319243A, z, i, rect);
            }
            super.onFocusChanged(z, i, rect);
            return;
        }
        super.onFocusChanged(z, i, rect);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        C109633a aVar = this.f319255G;
        if (!(aVar == null || !(this.f319243A instanceof Spannable) || this.f319264M == null)) {
            try {
                if (aVar.onGenericMotionEvent(this, this.f319245B, motionEvent)) {
                    return true;
                }
            } catch (AbstractMethodError unused) {
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (mo153971E(i, keyEvent, (KeyEvent) null) == 0) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        KeyEvent changeAction = KeyEvent.changeAction(keyEvent, 0);
        int E = mo153971E(i, changeAction, keyEvent);
        if (E == 0) {
            return super.onKeyMultiple(i, i2, keyEvent);
        }
        if (E == -1) {
            return true;
        }
        int i3 = i2 - 1;
        KeyEvent changeAction2 = KeyEvent.changeAction(keyEvent, 1);
        if (E == 1) {
            this.f319246B1.f319404o.onKeyUp(this, (Editable) this.f319243A, i, changeAction2);
            while (true) {
                i3--;
                if (i3 <= 0) {
                    break;
                }
                this.f319246B1.f319404o.onKeyDown(this, (Editable) this.f319243A, i, changeAction);
                this.f319246B1.f319404o.onKeyUp(this, (Editable) this.f319243A, i, changeAction2);
            }
        } else if (E == 2) {
            this.f319255G.onKeyUp(this, this.f319245B, i, changeAction2);
            while (true) {
                i3--;
                if (i3 <= 0) {
                    break;
                }
                this.f319255G.onKeyDown(this, this.f319245B, i, changeAction);
                this.f319255G.onKeyUp(this, this.f319245B, i, changeAction2);
            }
        }
        return true;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            C106778a aVar = this.f319246B1;
            boolean z = false;
            if (aVar != null && !aVar.mo154317v()) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        mo154162s0();
                    }
                }
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        if (keyEvent.hasModifiers(4096)) {
            if (i != 29) {
                if (i != 31) {
                    if (i != 50) {
                        if (i == 52 && mo154265w()) {
                            return mo97951b0(16908320);
                        }
                    } else if (mo154267x()) {
                        return mo97951b0(16908322);
                    }
                } else if (mo154262v()) {
                    return mo97951b0(16908321);
                }
            } else if (mo154269y()) {
                return mo97951b0(16908319);
            }
        } else if (keyEvent.hasModifiers(4097) && i == 50 && mo154267x()) {
            return mo97951b0(16908337);
        }
        return super.onKeyShortcut(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        KeyListener keyListener;
        InputMethodManager inputMethodManager;
        C106778a.C106787i iVar;
        C74978g gVar;
        if (!isEnabled()) {
            return super.onKeyUp(i, keyEvent);
        }
        if (!KeyEvent.isModifierKey(i)) {
            this.f319325x = false;
        }
        if (i == 23) {
            if (keyEvent.hasNoModifiers() && !hasOnClickListeners() && this.f319255G != null && (this.f319243A instanceof Editable) && this.f319264M != null && onCheckIsTextEditor()) {
                InputMethodManager inputMethodManager2 = getInputMethodManager();
                if (inputMethodManager2 != null) {
                    inputMethodManager2.viewClicked(this);
                }
                if (inputMethodManager2 != null && getShowSoftInputOnFocus()) {
                    inputMethodManager2.showSoftInput(this, 0);
                }
            }
            return super.onKeyUp(i, keyEvent);
        } else if ((i == 66 || i == 160) && keyEvent.hasNoModifiers()) {
            C106778a aVar = this.f319246B1;
            if (!(aVar == null || (iVar = aVar.f319399j) == null || (gVar = iVar.f319466f) == null || !iVar.f319467g)) {
                iVar.f319467g = false;
                if (this instanceof C74974a ? ((MMCustomEditText.C74973a) gVar).f220521a.mo93502a((C74974a) this, 0, keyEvent) : false) {
                    return true;
                }
            }
            if (((keyEvent.getFlags() & 16) != 0 || mo154158q0()) && !hasOnClickListeners()) {
                View focusSearch = focusSearch(130);
                if (focusSearch != null) {
                    if (focusSearch.requestFocus(130)) {
                        super.onKeyUp(i, keyEvent);
                        return true;
                    }
                    throw new IllegalStateException("focus search returned a view that wasn't able to take focus!");
                } else if (!((keyEvent.getFlags() & 16) == 0 || (inputMethodManager = getInputMethodManager()) == null || !inputMethodManager.isActive(this))) {
                    inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                }
            }
            return super.onKeyUp(i, keyEvent);
        } else {
            C106778a aVar2 = this.f319246B1;
            if (aVar2 != null && (keyListener = aVar2.f319404o) != null && keyListener.onKeyUp(this, (Editable) this.f319243A, i, keyEvent)) {
                return true;
            }
            C109633a aVar3 = this.f319255G;
            if (aVar3 == null || this.f319264M == null || !aVar3.onKeyUp(this, this.f319245B, i, keyEvent)) {
                return super.onKeyUp(i, keyEvent);
            }
            return true;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.f319286c1;
        if (i5 >= 0) {
            this.f319286c1 = -1;
            mo154260u(Math.min(i5, this.f319243A.length()));
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        BoringLayout.Metrics metrics;
        BoringLayout.Metrics metrics2;
        int i5;
        BoringLayout.Metrics metrics3;
        int i6;
        BoringLayout.Metrics metrics4;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        BoringLayout.Metrics metrics5 = f319242P1;
        if (this.f319301k1 == null) {
            this.f319301k1 = getTextDirectionHeuristic();
        }
        if (mode == 1073741824) {
            i4 = size;
            metrics2 = metrics5;
            metrics = metrics2;
            z = false;
            i3 = -1;
        } else {
            Layout layout = this.f319264M;
            int D = (layout == null || this.f319328y != null) ? -1 : m144190D(layout);
            if (D < 0) {
                metrics3 = BoringLayout.isBoring(this.f319247C, this.f319262K, this.f319294g1);
                if (metrics3 != null) {
                    this.f319294g1 = metrics3;
                }
                z = false;
            } else {
                metrics3 = metrics5;
                z = true;
            }
            if (metrics3 == null || metrics3 == metrics5) {
                if (D < 0) {
                    CharSequence charSequence = this.f319247C;
                    D = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f319262K));
                }
                i6 = D;
            } else {
                i6 = metrics3.width;
            }
            C106777f fVar = this.f319331z;
            if (fVar != null) {
                i6 = Math.max(Math.max(i6, fVar.f319358o), fVar.f319359p);
            }
            if (this.f319251E != null) {
                Layout layout2 = this.f319253F;
                int D2 = (layout2 == null || this.f319328y != null) ? -1 : m144190D(layout2);
                if (D2 < 0) {
                    metrics4 = BoringLayout.isBoring(this.f319251E, this.f319262K, this.f319296h1);
                    if (metrics4 != null) {
                        this.f319296h1 = metrics4;
                    }
                } else {
                    metrics4 = metrics5;
                }
                if (!(metrics4 == null || metrics4 == metrics5)) {
                    D2 = metrics4.width;
                }
                metrics5 = metrics4;
                if (D2 > i6) {
                    i6 = D2;
                }
            }
            int compoundPaddingLeft = i6 + getCompoundPaddingLeft() + getCompoundPaddingRight();
            int min = this.f319280W0 == 1 ? Math.min(compoundPaddingLeft, this.f319278V0 * getLineHeight()) : Math.min(compoundPaddingLeft, this.f319278V0);
            int max = Math.max(this.f319282Y0 == 1 ? Math.max(min, this.f319281X0 * getLineHeight()) : Math.max(min, this.f319281X0), getSuggestedMinimumWidth());
            if (mode == Integer.MIN_VALUE) {
                i4 = Math.min(size, max);
                i3 = D;
                metrics2 = metrics3;
            } else {
                i3 = D;
                metrics2 = metrics3;
                i4 = max;
            }
            metrics = metrics5;
        }
        int compoundPaddingLeft2 = (i4 - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        int i7 = this.f319275U ? 1048576 : compoundPaddingLeft2;
        Layout layout3 = this.f319253F;
        int width = layout3 == null ? i7 : layout3.getWidth();
        Layout layout4 = this.f319264M;
        if (layout4 == null) {
            mo153987W(i7, i7, metrics2, metrics, (i4 - getCompoundPaddingLeft()) - getCompoundPaddingRight(), false);
        } else {
            boolean z2 = (layout4.getWidth() == i7 && width == i7 && this.f319264M.getEllipsizedWidth() == (i4 - getCompoundPaddingLeft()) - getCompoundPaddingRight()) ? false : true;
            boolean z3 = this.f319251E == null && this.f319328y == null && i7 > this.f319264M.getWidth() && ((this.f319264M instanceof BoringLayout) || (z && i3 >= 0 && i3 <= i7));
            boolean z4 = (this.f319268Q0 == this.f319276U0 && this.f319329y0 == this.f319274T0) ? false : true;
            if (z2 || z4) {
                if (z4 || !z3) {
                    mo153987W(i7, i7, metrics2, metrics, (i4 - getCompoundPaddingLeft()) - getCompoundPaddingRight(), false);
                } else {
                    this.f319264M.increaseWidthTo(i7);
                }
            }
        }
        if (mode2 == 1073741824) {
            this.f319284a1 = -1;
        } else {
            int desiredHeight = getDesiredHeight();
            this.f319284a1 = desiredHeight;
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(desiredHeight, size2) : desiredHeight;
        }
        int compoundPaddingTop = (size2 - getCompoundPaddingTop()) - getCompoundPaddingBottom();
        if (this.f319268Q0 == 1 && this.f319264M.getLineCount() > (i5 = this.f319329y0)) {
            compoundPaddingTop = Math.min(compoundPaddingTop, this.f319264M.getLineTop(i5));
        }
        if (this.f319255G != null || this.f319264M.getWidth() > compoundPaddingLeft2 || this.f319264M.getHeight() > compoundPaddingTop) {
            mo153993c0();
        } else {
            scrollTo(0, 0);
        }
        setMeasuredDimension(i4, size2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c3, code lost:
        if (r6 < 0) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreDraw() {
        /*
            r12 = this;
            android.text.Layout r0 = r12.f319264M
            if (r0 != 0) goto L_0x0007
            r12.mo154161s()
        L_0x0007:
            mo3.a r0 = r12.f319255G
            r1 = 80
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0041
            int r0 = r12.getSelectionEnd()
            com.tencent.mm.ui.widget.cedit.edit.a r4 = r12.f319246B1
            if (r4 == 0) goto L_0x002c
            com.tencent.mm.ui.widget.cedit.edit.a$p r4 = r4.f319391b
            if (r4 == 0) goto L_0x002c
            com.tencent.mm.ui.widget.cedit.edit.a$o r4 = r4.f319516d
            if (r4 == 0) goto L_0x0025
            boolean r4 = r4.f319449o
            if (r4 == 0) goto L_0x0025
            r4 = 1
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            if (r4 == 0) goto L_0x002c
            int r0 = r12.getSelectionStart()
        L_0x002c:
            if (r0 >= 0) goto L_0x003a
            int r4 = r12.f319273T
            r4 = r4 & 112(0x70, float:1.57E-43)
            if (r4 != r1) goto L_0x003a
            java.lang.CharSequence r0 = r12.f319243A
            int r0 = r0.length()
        L_0x003a:
            if (r0 < 0) goto L_0x00ed
            r12.mo154260u(r0)
            goto L_0x00ed
        L_0x0041:
            java.lang.CharSequence r0 = r12.f319243A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0053
            java.lang.CharSequence r0 = r12.f319251E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0053
            r0 = 1
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            android.text.Layout r0 = r12.f319253F
            goto L_0x005b
        L_0x0059:
            android.text.Layout r0 = r12.f319264M
        L_0x005b:
            int r4 = r12.f319273T
            r4 = r4 & 112(0x70, float:1.57E-43)
            if (r4 != r1) goto L_0x0067
            int r4 = r0.getLineCount()
            int r4 = r4 - r2
            goto L_0x0068
        L_0x0067:
            r4 = 0
        L_0x0068:
            android.text.Layout$Alignment r5 = r0.getParagraphAlignment(r4)
            int r6 = r0.getParagraphDirection(r4)
            int r7 = r12.getRight()
            int r8 = r12.getLeft()
            int r7 = r7 - r8
            int r8 = r12.getCompoundPaddingLeft()
            int r7 = r7 - r8
            int r8 = r12.getCompoundPaddingRight()
            int r7 = r7 - r8
            int r8 = r12.getBottom()
            int r9 = r12.getTop()
            int r8 = r8 - r9
            int r9 = r12.getExtendedPaddingTop()
            int r8 = r8 - r9
            int r9 = r12.getExtendedPaddingBottom()
            int r8 = r8 - r9
            int r9 = r0.getHeight()
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_NORMAL
            if (r5 != r10) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x00a1:
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_CENTER
            if (r5 != r10) goto L_0x00c8
            float r5 = r0.getLineLeft(r4)
            double r10 = (double) r5
            double r10 = java.lang.Math.floor(r10)
            int r5 = (int) r10
            float r0 = r0.getLineRight(r4)
            double r10 = (double) r0
            double r10 = java.lang.Math.ceil(r10)
            int r0 = (int) r10
            int r4 = r0 - r5
            if (r4 >= r7) goto L_0x00c3
            int r0 = r0 + r5
            int r0 = r0 / 2
            int r7 = r7 / 2
            goto L_0x00c5
        L_0x00c3:
            if (r6 >= 0) goto L_0x00d2
        L_0x00c5:
            int r5 = r0 - r7
            goto L_0x00d2
        L_0x00c8:
            float r0 = r0.getLineLeft(r4)
            double r4 = (double) r0
            double r4 = java.lang.Math.floor(r4)
            int r5 = (int) r4
        L_0x00d2:
            if (r9 >= r8) goto L_0x00d5
            goto L_0x00dd
        L_0x00d5:
            int r0 = r12.f319273T
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 != r1) goto L_0x00dd
            int r9 = r9 - r8
            goto L_0x00de
        L_0x00dd:
            r9 = 0
        L_0x00de:
            int r0 = r12.getScrollX()
            if (r5 != r0) goto L_0x00ea
            int r0 = r12.getScrollY()
            if (r9 == r0) goto L_0x00ed
        L_0x00ea:
            r12.scrollTo(r5, r9)
        L_0x00ed:
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r12.f319246B1
            if (r0 == 0) goto L_0x00fc
            boolean r1 = r0.f319375M
            if (r1 == 0) goto L_0x00fc
            r0.mo154289D()
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r12.f319246B1
            r0.f319375M = r3
        L_0x00fc:
            android.view.ViewTreeObserver r0 = r12.getViewTreeObserver()
            r0.removeOnPreDrawListener(r12)
            r12.f319315s = r3
            r12.f319317t = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.onPreDraw():boolean");
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (this.f319245B != null && this.f319279W) {
            int J = mo153976J(motionEvent.getX(i), motionEvent.getY(i));
            if (((ClickableSpan[]) this.f319245B.getSpans(J, J, ClickableSpan.class)).length > 0 && Build.VERSION.SDK_INT >= 24) {
                return PointerIcon.getSystemIcon(getContext(), 1002);
            }
        }
        return ((mo153986V() || mo153985U()) && Build.VERSION.SDK_INT >= 24) ? PointerIcon.getSystemIcon(getContext(), 1008) : super.onResolvePointerIcon(motionEvent, i);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        CharSequence charSequence = savedState.f319335f;
        if (charSequence != null) {
            setText(charSequence);
        }
        if (savedState.f319333d >= 0 && savedState.f319334e >= 0 && this.f319245B != null) {
            int length = this.f319243A.length();
            int i2 = savedState.f319333d;
            if (i2 > length || (i = savedState.f319334e) > length) {
                String str = savedState.f319335f != null ? "(restored) " : "";
                Log.m105920e("cmEdit.CMTextView", "Saved cursor position " + savedState.f319333d + "/" + savedState.f319334e + " out of range for " + str + "text " + this.f319243A);
            } else {
                Selection.setSelection(this.f319245B, i2, i);
                if (savedState.f319336g) {
                    mo153970C();
                    this.f319246B1.f319401l = true;
                }
            }
        }
        if (savedState.f319338i != null) {
            mo153970C();
            C106778a aVar = this.f319246B1;
            ParcelableParcel parcelableParcel = savedState.f319338i;
            aVar.getClass();
            parcelableParcel.f319537d.setDataPosition(0);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        TextDirectionHeuristic textDirectionHeuristic = getTextDirectionHeuristic();
        if (this.f319301k1 != textDirectionHeuristic) {
            this.f319301k1 = textDirectionHeuristic;
            if (this.f319264M != null) {
                mo154270z();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r10 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            boolean r1 = r10.getFreezesText()
            java.lang.CharSequence r2 = r10.f319243A
            r3 = -1
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x001d
            int r3 = r10.getSelectionStart()
            int r2 = r10.getSelectionEnd()
            if (r3 >= 0) goto L_0x001b
            if (r2 < 0) goto L_0x001e
        L_0x001b:
            r6 = 1
            goto L_0x001f
        L_0x001d:
            r2 = -1
        L_0x001e:
            r6 = 0
        L_0x001f:
            if (r1 != 0) goto L_0x0025
            if (r6 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            return r0
        L_0x0025:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$SavedState r7 = new com.tencent.mm.ui.widget.cedit.edit.CustomTextView$SavedState
            r7.<init>(r0)
            if (r1 == 0) goto L_0x006b
            java.lang.CharSequence r0 = r10.f319243A
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 == 0) goto L_0x0065
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r1 = r10.f319243A
            r0.<init>(r1)
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r10.f319246B1
            if (r1 == 0) goto L_0x0062
            int r1 = r0.length()
            java.lang.Class<android.text.style.SuggestionSpan> r8 = android.text.style.SuggestionSpan.class
            java.lang.Object[] r1 = r0.getSpans(r4, r1, r8)
            android.text.style.SuggestionSpan[] r1 = (android.text.style.SuggestionSpan[]) r1
        L_0x0049:
            int r8 = r1.length
            if (r4 >= r8) goto L_0x0062
            r8 = r1[r4]
            int r8 = r8.getFlags()
            r9 = r8 & 1
            if (r9 == 0) goto L_0x005f
            r8 = r8 & 2
            if (r8 == 0) goto L_0x005f
            r8 = r1[r4]
            r0.removeSpan(r8)
        L_0x005f:
            int r4 = r4 + 1
            goto L_0x0049
        L_0x0062:
            r7.f319335f = r0
            goto L_0x006b
        L_0x0065:
            java.lang.String r0 = r0.toString()
            r7.f319335f = r0
        L_0x006b:
            if (r6 == 0) goto L_0x0071
            r7.f319333d = r3
            r7.f319334e = r2
        L_0x0071:
            boolean r0 = r10.isFocused()
            if (r0 == 0) goto L_0x007d
            if (r3 < 0) goto L_0x007d
            if (r2 < 0) goto L_0x007d
            r7.f319336g = r5
        L_0x007d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.onSaveInstanceState():android.os.Parcelable");
    }

    public void onScreenStateChanged(int i) {
        C106778a.C106782d dVar;
        super.onScreenStateChanged(i);
        C106778a aVar = this.f319246B1;
        if (aVar == null) {
            return;
        }
        if (i == 0) {
            C106778a.C106782d dVar2 = aVar.f319410u;
            if (dVar2 != null && !dVar2.f319419d) {
                C106778a.this.f319383U.removeCallbacks(dVar2);
                dVar2.f319419d = true;
            }
        } else if (i == 1 && (dVar = aVar.f319410u) != null) {
            dVar.f319419d = false;
            aVar.mo154321z();
        }
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C106778a aVar = this.f319246B1;
        if (aVar != null) {
            aVar.mo154287B();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012b, code lost:
        if (r2 != 3) goto L_0x014f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0384 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 0
            boolean r3 = r0.mo153981P(r1, r2)
            r4 = 1
            if (r3 != 0) goto L_0x000d
            return r4
        L_0x000d:
            int r3 = r19.getActionMasked()
            com.tencent.mm.ui.widget.cedit.edit.a r5 = r0.f319246B1
            if (r5 == 0) goto L_0x0395
            r6 = 8194(0x2002, float:1.1482E-41)
            boolean r7 = r1.isFromSource(r6)
            r8 = 2
            if (r7 != 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r7 = r5.f319376N
            int r9 = r19.getButtonState()
            r7 = r7 ^ r9
            r7 = r7 & r4
            if (r7 == 0) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            int r9 = r19.getActionMasked()
            if (r9 == 0) goto L_0x0034
            if (r9 != r4) goto L_0x0037
        L_0x0034:
            if (r7 != 0) goto L_0x0037
            goto L_0x003f
        L_0x0037:
            if (r9 != r8) goto L_0x0041
            boolean r7 = r1.isButtonPressed(r4)
            if (r7 != 0) goto L_0x0041
        L_0x003f:
            r7 = 1
            goto L_0x0042
        L_0x0041:
            r7 = 0
        L_0x0042:
            int r9 = r19.getButtonState()
            r5.f319376N = r9
            if (r7 == 0) goto L_0x0056
            int r6 = r19.getActionMasked()
            if (r6 != r4) goto L_0x0052
            r5.f319406q = r4
        L_0x0052:
            r16 = r3
            goto L_0x0378
        L_0x0056:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r7 = r5.f319383U
            android.content.Context r7 = r7.getContext()
            android.view.ViewConfiguration r7 = android.view.ViewConfiguration.get(r7)
            ko3.d r9 = r5.f319377O
            r9.getClass()
            int r10 = r19.getActionMasked()
            r11 = 3
            if (r10 != 0) goto L_0x00cf
            boolean r10 = r1.isFromSource(r6)
            long r12 = r19.getEventTime()
            long r14 = r9.f326537d
            long r12 = r12 - r14
            r16 = r3
            long r2 = r9.f326536c
            long r14 = r14 - r2
            int r2 = android.view.ViewConfiguration.getDoubleTapTimeout()
            long r2 = (long) r2
            int r17 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r17 > 0) goto L_0x00b5
            int r2 = android.view.ViewConfiguration.getDoubleTapTimeout()
            long r2 = (long) r2
            int r12 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r12 > 0) goto L_0x00b5
            int r2 = r9.f326538e
            if (r2 == r4) goto L_0x0096
            if (r2 != r8) goto L_0x00b5
            if (r10 == 0) goto L_0x00b5
        L_0x0096:
            if (r2 != r4) goto L_0x009b
            r9.f326538e = r8
            goto L_0x009d
        L_0x009b:
            r9.f326538e = r11
        L_0x009d:
            float r2 = r9.f326534a
            float r3 = r9.f326535b
            float r10 = r19.getX()
            float r12 = r19.getY()
            int r7 = r7.getScaledDoubleTapSlop()
            boolean r2 = ko3.C109030d.m148003a(r2, r3, r10, r12, r7)
            r9.f326539f = r2
            r2 = 0
            goto L_0x00ba
        L_0x00b5:
            r9.f326538e = r4
            r2 = 0
            r9.f326539f = r2
        L_0x00ba:
            float r3 = r19.getX()
            r9.f326534a = r3
            float r3 = r19.getY()
            r9.f326535b = r3
            long r12 = r19.getEventTime()
            r9.f326536c = r12
            r9.f326540g = r2
            goto L_0x0123
        L_0x00cf:
            r16 = r3
            if (r10 != r4) goto L_0x00e2
            r19.getX()
            r19.getY()
            long r12 = r19.getEventTime()
            r9.f326537d = r12
            r9.f326540g = r2
            goto L_0x0123
        L_0x00e2:
            if (r10 != r8) goto L_0x0114
            boolean r2 = r9.f326540g
            if (r2 != 0) goto L_0x0123
            float r2 = r19.getX()
            float r3 = r9.f326534a
            float r2 = r2 - r3
            float r3 = r19.getY()
            float r10 = r9.f326535b
            float r3 = r3 - r10
            float r10 = r2 * r2
            float r12 = r3 * r3
            float r10 = r10 + r12
            int r7 = r7.getScaledTouchSlop()
            int r7 = r7 * r7
            float r7 = (float) r7
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0108
            r7 = 1
            goto L_0x0109
        L_0x0108:
            r7 = 0
        L_0x0109:
            r9.f326540g = r7
            if (r7 == 0) goto L_0x0123
            java.lang.Math.abs(r2)
            java.lang.Math.abs(r3)
            goto L_0x0123
        L_0x0114:
            if (r10 != r11) goto L_0x0123
            r2 = 0
            r9.f326536c = r2
            r9.f326537d = r2
            r2 = 0
            r9.f326538e = r2
            r9.f326539f = r2
            r9.f326540g = r2
        L_0x0123:
            int r2 = r19.getActionMasked()
            if (r2 == r4) goto L_0x0133
            if (r2 == r8) goto L_0x012e
            if (r2 == r11) goto L_0x0133
            goto L_0x014f
        L_0x012e:
            r2 = -1
            r5.mo154314s(r2)
            goto L_0x014f
        L_0x0133:
            int r2 = android.view.ViewConfiguration.getDoubleTapTimeout()
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r3 = r5.f319383U
            java.lang.Runnable r7 = r5.f319384V
            long r9 = (long) r2
            r3.postDelayed(r7, r9)
            com.tencent.mm.ui.widget.cedit.edit.c r2 = r5.mo154311p()
            r2.getClass()
            com.tencent.mm.ui.widget.cedit.edit.a r2 = r2.f319534a
            android.view.ActionMode r2 = r2.f319392c
            if (r2 == 0) goto L_0x014f
            r2.invalidate()
        L_0x014f:
            boolean r2 = r5.f319393d
            if (r2 == 0) goto L_0x0174
            com.tencent.mm.ui.widget.cedit.edit.a$l r2 = r5.mo154307l()
            com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            boolean r3 = r2.f319394e
            if (r3 == 0) goto L_0x0168
            com.tencent.mm.ui.widget.cedit.edit.a$p r2 = r2.mo154312q()
            boolean r2 = r2.mo154328d()
            if (r2 == 0) goto L_0x0168
            goto L_0x0174
        L_0x0168:
            int r2 = r19.getActionMasked()
            if (r2 == r4) goto L_0x0174
            if (r2 == r8) goto L_0x0171
            goto L_0x0174
        L_0x0171:
            r1.isFromSource(r6)
        L_0x0174:
            boolean r2 = r5.f319394e
            if (r2 == 0) goto L_0x036d
            com.tencent.mm.ui.widget.cedit.edit.a$p r2 = r5.mo154312q()
            r2.getClass()
            float r3 = r19.getX()
            float r7 = r19.getY()
            boolean r6 = r1.isFromSource(r6)
            int r9 = r19.getActionMasked()
            if (r9 == 0) goto L_0x02aa
            if (r9 == r4) goto L_0x0273
            if (r9 == r8) goto L_0x01d7
            r3 = 5
            if (r9 == r3) goto L_0x019d
            r3 = 6
            if (r9 == r3) goto L_0x019d
            goto L_0x036d
        L_0x019d:
            com.tencent.mm.ui.widget.cedit.edit.a r3 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r3 = r3.f319383U
            android.content.Context r3 = r3.getContext()
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.lang.String r6 = "android.hardware.touchscreen.multitouch.distinct"
            boolean r3 = r3.hasSystemFeature(r6)
            if (r3 == 0) goto L_0x036d
            int r3 = r19.getPointerCount()
            r6 = 0
        L_0x01b6:
            if (r6 >= r3) goto L_0x036d
            com.tencent.mm.ui.widget.cedit.edit.a r7 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r7 = r7.f319383U
            float r8 = r1.getX(r6)
            float r9 = r1.getY(r6)
            int r7 = r7.mo153976J(r8, r9)
            int r8 = r2.f319518f
            if (r7 >= r8) goto L_0x01ce
            r2.f319518f = r7
        L_0x01ce:
            int r8 = r2.f319519g
            if (r7 <= r8) goto L_0x01d4
            r2.f319519g = r7
        L_0x01d4:
            int r6 = r6 + 1
            goto L_0x01b6
        L_0x01d7:
            boolean r8 = r2.f319520h
            if (r8 == 0) goto L_0x0202
            com.tencent.mm.ui.widget.cedit.edit.a r8 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r8 = r8.f319383U
            android.content.Context r8 = r8.getContext()
            android.view.ViewConfiguration.get(r8)
            com.tencent.mm.ui.widget.cedit.edit.a r8 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r8 = r8.f319383U
            android.content.Context r8 = r8.getContext()
            r9 = 8
            int r8 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r8, r9)
            com.tencent.mm.ui.widget.cedit.edit.a r9 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            ko3.d r9 = r9.f319377O
            float r10 = r9.f326534a
            float r9 = r9.f326535b
            boolean r8 = ko3.C109030d.m148003a(r10, r9, r3, r7, r8)
            r2.f319520h = r8
        L_0x0202:
            boolean r8 = r2.f319522j
            if (r8 == 0) goto L_0x020f
            com.tencent.mm.ui.widget.cedit.edit.a r8 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            ko3.d r8 = r8.f319377O
            boolean r8 = r8.f326540g
            r8 = r8 ^ r4
            r2.f319522j = r8
        L_0x020f:
            if (r6 == 0) goto L_0x0262
            int r6 = r2.f319525p
            if (r6 == 0) goto L_0x0217
            r6 = 1
            goto L_0x0218
        L_0x0217:
            r6 = 0
        L_0x0218:
            if (r6 != 0) goto L_0x0262
            com.tencent.mm.ui.widget.cedit.edit.a r6 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r6.f319383U
            int r3 = r6.mo153976J(r3, r7)
            com.tencent.mm.ui.widget.cedit.edit.a r6 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r6.f319383U
            boolean r6 = r6.mo153978L()
            if (r6 == 0) goto L_0x024f
            boolean r6 = r2.f319522j
            if (r6 == 0) goto L_0x0234
            int r6 = r2.f319521i
            if (r6 == r3) goto L_0x024f
        L_0x0234:
            com.tencent.mm.ui.widget.cedit.edit.a r6 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r6.f319383U
            int r6 = r6.getSelectionStart()
            if (r3 < r6) goto L_0x024f
            com.tencent.mm.ui.widget.cedit.edit.a r6 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r6.f319383U
            int r6 = r6.getSelectionEnd()
            if (r3 > r6) goto L_0x024f
            com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            r2.mo154294J()
            goto L_0x036d
        L_0x024f:
            int r6 = r2.f319521i
            if (r6 == r3) goto L_0x0262
            com.tencent.mm.ui.widget.cedit.edit.a r3 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            r3.mo154297M()
            r2.mo154374b(r4)
            com.tencent.mm.ui.widget.cedit.edit.a r3 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            r3.f319406q = r4
            r3 = 0
            r2.f319522j = r3
        L_0x0262:
            com.tencent.mm.ui.widget.cedit.edit.a$o r3 = r2.f319516d
            if (r3 == 0) goto L_0x026e
            boolean r3 = r3.mo154348k()
            if (r3 == 0) goto L_0x026e
            goto L_0x036d
        L_0x026e:
            r2.mo154379h(r1)
            goto L_0x036d
        L_0x0273:
            int r3 = r2.f319525p
            if (r3 == 0) goto L_0x0279
            r3 = 1
            goto L_0x027a
        L_0x0279:
            r3 = 0
        L_0x027a:
            if (r3 != 0) goto L_0x027e
            goto L_0x036d
        L_0x027e:
            r2.mo154379h(r1)
            com.tencent.mm.ui.widget.cedit.edit.a r3 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r3 = r3.f319383U
            android.view.ViewParent r3 = r3.getParent()
            r6 = 0
            r3.requestDisallowInterceptTouchEvent(r6)
            r2.mo154377f()
            com.tencent.mm.ui.widget.cedit.edit.a r3 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r3 = r3.f319383U
            boolean r3 = r3.mo153978L()
            if (r3 == 0) goto L_0x036d
            com.tencent.mm.ui.widget.cedit.edit.a r3 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            boolean r6 = r2.f319522j
            r3.mo154296L(r6)
            com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.f319383U
            r2.invalidate()
            goto L_0x036d
        L_0x02aa:
            com.tencent.mm.ui.widget.cedit.edit.a r9 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            boolean r9 = r9.mo154303h()
            if (r9 == 0) goto L_0x02b7
            r2.mo154375c()
            goto L_0x036d
        L_0x02b7:
            com.tencent.mm.ui.widget.cedit.edit.a r9 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r9 = r9.f319383U
            int r9 = r9.mo153976J(r3, r7)
            r2.f319519g = r9
            r2.f319518f = r9
            boolean r9 = r2.f319520h
            if (r9 == 0) goto L_0x0369
            com.tencent.mm.ui.widget.cedit.edit.a r9 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            ko3.d r10 = r9.f319377O
            int r12 = r10.f326538e
            if (r12 == r8) goto L_0x02d4
            if (r12 != r11) goto L_0x02d2
            goto L_0x02d4
        L_0x02d2:
            r12 = 0
            goto L_0x02d5
        L_0x02d4:
            r12 = 1
        L_0x02d5:
            if (r12 == 0) goto L_0x02dd
            boolean r10 = r10.f326539f
            if (r10 == 0) goto L_0x02dd
            r10 = 1
            goto L_0x02de
        L_0x02dd:
            r10 = 0
        L_0x02de:
            if (r10 == 0) goto L_0x0369
            if (r6 != 0) goto L_0x02f1
            boolean r3 = r9.mo154319x(r3, r7)
            if (r3 != 0) goto L_0x02f1
            com.tencent.mm.ui.widget.cedit.edit.a r3 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            ko3.d r3 = r3.f319377O
            r3.getClass()
            goto L_0x0369
        L_0x02f1:
            com.tencent.mm.ui.widget.cedit.edit.a r3 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            ko3.d r6 = r3.f319377O
            int r6 = r6.f326538e
            if (r6 != r8) goto L_0x02fb
            r7 = 1
            goto L_0x02fc
        L_0x02fb:
            r7 = 0
        L_0x02fc:
            if (r7 == 0) goto L_0x0302
            r3.mo154291G()
            goto L_0x0365
        L_0x0302:
            if (r6 != r11) goto L_0x0306
            r6 = 1
            goto L_0x0307
        L_0x0306:
            r6 = 0
        L_0x0307:
            if (r6 == 0) goto L_0x0365
            java.lang.Runnable r6 = r3.f319378P
            if (r6 == 0) goto L_0x0312
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r3 = r3.f319383U
            r3.removeCallbacks(r6)
        L_0x0312:
            com.tencent.mm.ui.widget.cedit.edit.a r3 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            r3.mo154297M()
            com.tencent.mm.ui.widget.cedit.edit.a r3 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r3.f319383U
            boolean r6 = r6.mo154269y()
            if (r6 != 0) goto L_0x0322
            goto L_0x035e
        L_0x0322:
            boolean r6 = r3.mo154286A()
            if (r6 == 0) goto L_0x032f
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r3 = r3.f319383U
            boolean r3 = r3.mo154007g0()
            goto L_0x035f
        L_0x032f:
            com.tencent.mm.ui.widget.cedit.edit.a$p r6 = r3.mo154312q()
            int r7 = r6.f319518f
            int r6 = r6.f319519g
            long r6 = no3.C109754a.m149075a(r7, r6)
            r8 = 32
            long r9 = r6 >>> r8
            int r10 = (int) r9
            int r6 = no3.C109754a.m149077c(r6)
            long r6 = r3.mo154309n(r10, r6)
            long r8 = r6 >>> r8
            int r9 = (int) r8
            int r6 = no3.C109754a.m149077c(r6)
            if (r9 >= r6) goto L_0x035e
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r3 = r3.f319383U
            java.lang.CharSequence r3 = r3.getText()
            android.text.Spannable r3 = (android.text.Spannable) r3
            android.text.Selection.setSelection(r3, r9, r6)
            r3 = 1
            goto L_0x035f
        L_0x035e:
            r3 = 0
        L_0x035f:
            if (r3 != 0) goto L_0x0362
            goto L_0x0365
        L_0x0362:
            r2.mo154374b(r11)
        L_0x0365:
            com.tencent.mm.ui.widget.cedit.edit.a r3 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            r3.f319406q = r4
        L_0x0369:
            r2.f319520h = r4
            r2.f319522j = r4
        L_0x036d:
            int r2 = r19.getActionMasked()
            if (r2 != 0) goto L_0x0378
            r2 = 0
            r5.f319403n = r2
            r5.f319407r = r2
        L_0x0378:
            com.tencent.mm.ui.widget.cedit.edit.a r2 = r0.f319246B1
            com.tencent.mm.ui.widget.cedit.edit.a$l r2 = r2.f319389a
            if (r2 == 0) goto L_0x0385
            boolean r2 = r2.mo154328d()
            if (r2 == 0) goto L_0x0385
            return r4
        L_0x0385:
            com.tencent.mm.ui.widget.cedit.edit.a r2 = r0.f319246B1
            com.tencent.mm.ui.widget.cedit.edit.a$p r2 = r2.f319391b
            if (r2 == 0) goto L_0x0397
            int r2 = r2.f319525p
            if (r2 == 0) goto L_0x0391
            r2 = 1
            goto L_0x0392
        L_0x0391:
            r2 = 0
        L_0x0392:
            if (r2 == 0) goto L_0x0397
            return r4
        L_0x0395:
            r16 = r3
        L_0x0397:
            boolean r2 = super.onTouchEvent(r19)
            com.tencent.mm.ui.widget.cedit.edit.a r3 = r0.f319246B1
            if (r3 == 0) goto L_0x03b6
            boolean r5 = r3.f319406q
            if (r5 == 0) goto L_0x03b6
            r5 = r16
            if (r5 != r4) goto L_0x03b8
            r6 = 0
            r3.f319406q = r6
            boolean r1 = r3.f319385W
            if (r1 == 0) goto L_0x03b5
            r3.mo154295K()
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r0.f319246B1
            r1.f319385W = r6
        L_0x03b5:
            return r2
        L_0x03b6:
            r5 = r16
        L_0x03b8:
            if (r5 != r4) goto L_0x03c8
            if (r3 == 0) goto L_0x03c0
            boolean r3 = r3.f319407r
            if (r3 != 0) goto L_0x03c8
        L_0x03c0:
            boolean r3 = r18.isFocused()
            if (r3 == 0) goto L_0x03c8
            r3 = 1
            goto L_0x03c9
        L_0x03c8:
            r3 = 0
        L_0x03c9:
            mo3.a r5 = r0.f319255G
            if (r5 != 0) goto L_0x03d3
            boolean r5 = r18.onCheckIsTextEditor()
            if (r5 == 0) goto L_0x04cd
        L_0x03d3:
            boolean r5 = r18.isEnabled()
            if (r5 == 0) goto L_0x04cd
            java.lang.CharSequence r5 = r0.f319243A
            boolean r5 = r5 instanceof android.text.Spannable
            if (r5 == 0) goto L_0x04cd
            android.text.Layout r5 = r0.f319264M
            if (r5 == 0) goto L_0x04cd
            mo3.a r5 = r0.f319255G
            if (r5 == 0) goto L_0x03f0
            android.text.Spannable r6 = r0.f319245B
            boolean r5 = r5.onTouchEvent(r0, r6, r1)
            r6 = 0
            r5 = r5 | r6
            goto L_0x03f1
        L_0x03f0:
            r5 = 0
        L_0x03f1:
            boolean r6 = r18.mo153986V()
            if (r3 == 0) goto L_0x041d
            boolean r7 = r0.f319279W
            if (r7 == 0) goto L_0x041d
            int r7 = r0.f319277V
            if (r7 == 0) goto L_0x041d
            if (r6 == 0) goto L_0x041d
            android.text.Spannable r7 = r0.f319245B
            int r8 = r18.getSelectionStart()
            int r9 = r18.getSelectionEnd()
            java.lang.Class<android.text.style.ClickableSpan> r10 = android.text.style.ClickableSpan.class
            java.lang.Object[] r7 = r7.getSpans(r8, r9, r10)
            android.text.style.ClickableSpan[] r7 = (android.text.style.ClickableSpan[]) r7
            int r8 = r7.length
            if (r8 <= 0) goto L_0x041d
            r8 = 0
            r5 = r7[r8]
            r5.onClick(r0)
            r5 = 1
        L_0x041d:
            if (r3 == 0) goto L_0x04ca
            boolean r3 = r18.mo153985U()
            if (r3 != 0) goto L_0x0427
            if (r6 == 0) goto L_0x04ca
        L_0x0427:
            android.view.inputmethod.InputMethodManager r3 = r18.getInputMethodManager()
            if (r3 == 0) goto L_0x0430
            r3.viewClicked(r0)
        L_0x0430:
            boolean r5 = r18.mo153985U()
            if (r5 == 0) goto L_0x0443
            com.tencent.mm.ui.widget.cedit.edit.a r5 = r0.f319246B1
            boolean r5 = r5.f319415z
            if (r5 == 0) goto L_0x0443
            if (r3 == 0) goto L_0x0443
            r5 = 0
            r3.showSoftInput(r0, r5)
            goto L_0x0444
        L_0x0443:
            r5 = 0
        L_0x0444:
            com.tencent.mm.ui.widget.cedit.edit.a r3 = r0.f319246B1
            com.tencent.mm.ui.widget.cedit.edit.c r6 = r3.mo154311p()
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r7 = r3.f319383U
            float r8 = r19.getX()
            float r9 = r19.getY()
            r7.mo153976J(r8, r9)
            r6.getClass()
            boolean r6 = r3.f319412w
            if (r6 == 0) goto L_0x046e
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r3.f319383U
            com.tencent.mm.ui.widget.cedit.edit.a r6 = r6.f319246B1
            if (r6 == 0) goto L_0x046a
            boolean r6 = r6.f319403n
            if (r6 == 0) goto L_0x046a
            r6 = 1
            goto L_0x046b
        L_0x046a:
            r6 = 0
        L_0x046b:
            if (r6 == 0) goto L_0x046e
            r5 = 1
        L_0x046e:
            r3.mo154315t()
            r3.mo154297M()
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r3.f319383U
            java.lang.CharSequence r6 = r6.getText()
            if (r5 != 0) goto L_0x04c9
            int r5 = r6.length()
            if (r5 <= 0) goto L_0x04c9
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r3.f319383U
            float r7 = r19.getX()
            float r1 = r19.getY()
            int r1 = r5.mo153976J(r7, r1)
            boolean r5 = r3.f319365C
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x049a
            android.text.Spannable r6 = (android.text.Spannable) r6
            android.text.Selection.setSelection(r6, r1)
        L_0x049a:
            boolean r1 = r3.mo154303h()
            if (r1 != 0) goto L_0x04c9
            boolean r1 = r3.mo154318w()
            if (r1 == 0) goto L_0x04b0
            java.lang.Runnable r1 = r3.f319378P
            if (r1 == 0) goto L_0x04c9
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r3 = r3.f319383U
            r3.removeCallbacks(r1)
            goto L_0x04c9
        L_0x04b0:
            boolean r1 = r3.f319393d
            if (r1 == 0) goto L_0x04c9
            if (r5 == 0) goto L_0x04be
            com.tencent.mm.ui.widget.cedit.edit.a$l r1 = r3.mo154307l()
            r1.show()
            goto L_0x04c9
        L_0x04be:
            com.tencent.mm.ui.widget.cedit.edit.a$l r1 = r3.mo154307l()
            com.tencent.mm.ui.widget.cedit.edit.a$k r1 = r1.f319485d
            if (r1 == 0) goto L_0x04c9
            r1.mo154345i()
        L_0x04c9:
            r5 = 1
        L_0x04ca:
            if (r5 == 0) goto L_0x04cd
            return r4
        L_0x04cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        Spannable spannable;
        C109633a aVar = this.f319255G;
        if (aVar == null || (spannable = this.f319245B) == null || this.f319264M == null || !aVar.onTrackballEvent(this, spannable, motionEvent)) {
            return super.onTrackballEvent(motionEvent);
        }
        return true;
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        C106778a aVar = this.f319246B1;
        if (aVar != null && i != 0) {
            aVar.mo154315t();
            mo154162s0();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C106778a aVar = this.f319246B1;
        if (aVar == null) {
            return;
        }
        if (z) {
            C106778a.C106782d dVar = aVar.f319410u;
            if (dVar != null) {
                dVar.f319419d = false;
                aVar.mo154321z();
            }
            if (aVar.f319383U.mo153978L() && !aVar.mo154303h()) {
                aVar.mo154289D();
                return;
            }
            return;
        }
        C106778a.C106782d dVar2 = aVar.f319410u;
        if (dVar2 != null && !dVar2.f319419d) {
            C106778a.this.f319383U.removeCallbacks(dVar2);
            dVar2.f319419d = true;
        }
        C106778a.C106787i iVar = aVar.f319399j;
        if (iVar != null) {
            iVar.f319467g = false;
        }
        aVar.mo154315t();
        aVar.mo154298N();
        C106778a.C106788j jVar = aVar.f319400k;
        if (!(jVar == null || jVar.f319471c == 0)) {
            jVar.f319471c = 0;
            aVar.mo154304i(jVar);
        }
        aVar.mo154301f();
    }

    /* renamed from: p0 */
    public final void mo154154p0(Typeface typeface, String str, int i, int i2, int i3) {
        if (typeface == null && str != null) {
            mo154004f0(Typeface.create(str, 0), i2, i3);
        } else if (typeface != null) {
            mo154004f0(typeface, i2, i3);
        } else if (i == 1) {
            mo154004f0(Typeface.SANS_SERIF, i2, i3);
        } else if (i == 2) {
            mo154004f0(Typeface.SERIF, i2, i3);
        } else if (i != 3) {
            mo154004f0((Typeface) null, i2, i3);
        } else {
            mo154004f0(Typeface.MONOSPACE, i2, i3);
        }
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        boolean z;
        int length;
        boolean z2 = true;
        if (i != 16) {
            if (i != 32) {
                if (i == 256 || i == 512) {
                    CharSequence charSequence = this.f319243A;
                    if (!(charSequence instanceof Spannable)) {
                        mo153965m0(charSequence, TextView.BufferType.SPANNABLE);
                    }
                    return super.performAccessibilityAction(i, bundle);
                }
                if (i != 16384) {
                    if (i != 32768) {
                        if (i == 65536) {
                            return isFocused() && mo154265w() && mo97951b0(16908320);
                        }
                        if (i == 131072) {
                            CharSequence charSequence2 = this.f319243A;
                            if (!(charSequence2 instanceof Spannable)) {
                                mo153965m0(charSequence2, TextView.BufferType.SPANNABLE);
                            }
                            CharSequence iterableTextForAccessibility = getIterableTextForAccessibility();
                            if (iterableTextForAccessibility == null) {
                                return false;
                            }
                            int i2 = bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1;
                            int i3 = bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1;
                            if (!(getSelectionStart() == i2 && getSelectionEnd() == i3)) {
                                if (i2 == i3 && i3 == -1) {
                                    Selection.removeSelection((Spannable) iterableTextForAccessibility);
                                    return true;
                                } else if (i2 >= 0 && i2 <= i3 && i3 <= iterableTextForAccessibility.length()) {
                                    Selection.setSelection((Spannable) iterableTextForAccessibility, i2, i3);
                                    C106778a aVar = this.f319246B1;
                                    if (aVar != null) {
                                        aVar.mo154296L(false);
                                    }
                                    return true;
                                }
                            }
                            return false;
                        } else if (i == 2097152) {
                            if (!isEnabled() || this.f319249D != TextView.BufferType.EDITABLE) {
                                return false;
                            }
                            setText(bundle != null ? bundle.getCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null);
                            CharSequence charSequence3 = this.f319243A;
                            if (charSequence3 != null && (length = charSequence3.length()) > 0) {
                                Selection.setSelection(this.f319245B, length);
                            }
                            return true;
                        }
                    }
                } else if (isFocused() && mo154262v() && mo97951b0(16908321)) {
                    return true;
                }
                return isFocused() && mo154267x() && mo97951b0(16908322);
            } else if (isLongClickable()) {
                if (!isEnabled() || this.f319249D != TextView.BufferType.EDITABLE) {
                    return performLongClick();
                }
                this.f319246B1.f319367E = true;
                try {
                    return performLongClick();
                } finally {
                    this.f319246B1.f319367E = false;
                }
            }
            return super.performAccessibilityAction(i, bundle);
        } else if (!isEnabled()) {
            return false;
        } else {
            if (isClickable() || isLongClickable()) {
                if (isFocusable() && !isFocused()) {
                    requestFocus();
                }
                performClick();
                z = true;
            } else {
                z = false;
            }
            if (this.f319255G != null || onCheckIsTextEditor()) {
                CharSequence charSequence4 = this.f319243A;
                if (charSequence4 == null || !(charSequence4 instanceof Spannable)) {
                    z2 = false;
                }
                if (z2 && this.f319264M != null && ((mo153985U() || mo153986V()) && isFocused())) {
                    InputMethodManager inputMethodManager = getInputMethodManager();
                    if (inputMethodManager != null) {
                        inputMethodManager.viewClicked(this);
                    }
                    if (!mo153986V() && this.f319246B1.f319415z && inputMethodManager != null) {
                        z |= inputMethodManager.showSoftInput(this, 0);
                    }
                }
            }
            return z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean performLongClick() {
        /*
            r9 = this;
            boolean r0 = super.performLongClick()
            com.tencent.mm.ui.widget.cedit.edit.a r1 = r9.f319246B1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00c1
            boolean r4 = r1.f319367E
            if (r4 == 0) goto L_0x0020
            if (r0 != 0) goto L_0x001d
            boolean r4 = r1.mo154317v()
            if (r4 != 0) goto L_0x001a
            r1.mo154297M()
            goto L_0x001d
        L_0x001a:
            r1.mo154295K()
        L_0x001d:
            r4 = 1
            goto L_0x00a3
        L_0x0020:
            if (r0 != 0) goto L_0x0059
            ko3.d r4 = r1.f319377O
            float r5 = r4.f326534a
            float r4 = r4.f326535b
            boolean r4 = r1.mo154319x(r5, r4)
            if (r4 != 0) goto L_0x0059
            ko3.d r4 = r1.f319377O
            r4.getClass()
            boolean r4 = r1.f319393d
            if (r4 == 0) goto L_0x0059
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r1.f319383U
            ko3.d r5 = r1.f319377O
            float r6 = r5.f326534a
            float r5 = r5.f326535b
            int r4 = r4.mo153976J(r6, r5)
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r1.f319383U
            java.lang.CharSequence r5 = r5.getText()
            android.text.Spannable r5 = (android.text.Spannable) r5
            android.text.Selection.setSelection(r5, r4)
            com.tencent.mm.ui.widget.cedit.edit.a$l r4 = r1.mo154307l()
            r4.show()
            r1.f319385W = r3
            r4 = 1
            goto L_0x005a
        L_0x0059:
            r4 = r0
        L_0x005a:
            if (r4 != 0) goto L_0x009d
            boolean r5 = r1.mo154317v()
            if (r5 != 0) goto L_0x009d
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r1.f319383U
            int r4 = r4.getSelectionStart()
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r1.f319383U
            int r5 = r5.getSelectionEnd()
            if (r4 != r5) goto L_0x0071
            goto L_0x008f
        L_0x0071:
            if (r4 <= r5) goto L_0x0081
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r1.f319383U
            java.lang.CharSequence r6 = r6.getText()
            android.text.Spannable r6 = (android.text.Spannable) r6
            android.text.Selection.setSelection(r6, r5, r4)
            r8 = r5
            r5 = r4
            r4 = r8
        L_0x0081:
            com.tencent.mm.ui.widget.cedit.edit.a$p r6 = r1.mo154312q()
            int r7 = r6.f319518f
            int r6 = r6.f319519g
            if (r7 < r4) goto L_0x008f
            if (r6 >= r5) goto L_0x008f
            r4 = 1
            goto L_0x0090
        L_0x008f:
            r4 = 0
        L_0x0090:
            if (r4 == 0) goto L_0x0096
            r1.mo154294J()
            goto L_0x009c
        L_0x0096:
            r1.mo154297M()
            r1.mo154291G()
        L_0x009c:
            r4 = 1
        L_0x009d:
            if (r4 != 0) goto L_0x00a3
            boolean r4 = r1.mo154291G()
        L_0x00a3:
            r1 = r0 | r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "editor performLongClick handled ="
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "cmEdit.CMTextView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            com.tencent.mm.ui.widget.cedit.edit.a r4 = r9.f319246B1
            r4.getClass()
            goto L_0x00c2
        L_0x00c1:
            r1 = r0
        L_0x00c2:
            if (r1 == 0) goto L_0x00cf
            if (r0 != 0) goto L_0x00c9
            r9.performHapticFeedback(r2)
        L_0x00c9:
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r9.f319246B1
            if (r0 == 0) goto L_0x00cf
            r0.f319406q = r3
        L_0x00cf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.performLongClick():boolean");
    }

    /* renamed from: q */
    public final void mo154157q() {
        C106777f fVar = this.f319331z;
        if (fVar != null) {
            boolean z = fVar.f319348e;
            if (z || fVar.f319349f) {
                ColorStateList colorStateList = fVar.f319346c;
                BlendMode blendMode = fVar.f319347d;
                boolean z2 = fVar.f319349f;
                int[] drawableState = getDrawableState();
                for (Drawable drawable : this.f319331z.f319345b) {
                    if (drawable != null) {
                        this.f319331z.getClass();
                        drawable.mutate();
                        if (z) {
                            drawable.setTintList(colorStateList);
                        }
                        if (drawable.isStateful()) {
                            drawable.setState(drawableState);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r0 & 4080;
     */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo154158q0() {
        /*
            r4 = this;
            android.text.method.KeyListener r0 = r4.getKeyListener()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r4.f319283Z0
            r2 = 1
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x000e:
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r4.f319246B1
            if (r0 == 0) goto L_0x0023
            int r0 = r0.f319405p
            r3 = r0 & 15
            if (r3 != r2) goto L_0x0023
            r0 = r0 & 4080(0xff0, float:5.717E-42)
            r3 = 32
            if (r0 == r3) goto L_0x0022
            r3 = 48
            if (r0 != r3) goto L_0x0023
        L_0x0022:
            return r2
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.mo154158q0():boolean");
    }

    /* renamed from: r */
    public final void mo154159r(boolean z, boolean z2, boolean z3) {
        this.f319283Z0 = z;
        if (z) {
            setLines(1);
            setHorizontallyScrolling(true);
            if (z2) {
                setTransformationMethod(SingleLineTransformationMethod.getInstance());
                return;
            }
            return;
        }
        if (z3) {
            setMaxLines(Integer.MAX_VALUE);
        }
        setHorizontallyScrolling(false);
        if (z2) {
            setTransformationMethod((TransformationMethod) null);
        }
    }

    /* renamed from: r0 */
    public void mo154160r0(Spanned spanned, Object obj, int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        C106778a aVar = this.f319246B1;
        C106778a.C106788j jVar = aVar == null ? null : aVar.f319400k;
        int i6 = -1;
        if (obj == Selection.SELECTION_END) {
            if (i >= 0 || i2 >= 0) {
                mo153979N(Selection.getSelectionStart(spanned), i, i2);
                mo153968A();
                mo153993c0();
                C106778a aVar2 = this.f319246B1;
                if (aVar2 != null) {
                    aVar2.mo154321z();
                }
            }
            i5 = i2;
            z = true;
        } else {
            z = false;
            i5 = -1;
        }
        if (obj == Selection.SELECTION_START) {
            if (i >= 0 || i2 >= 0) {
                mo153979N(Selection.getSelectionEnd(spanned), i, i2);
            }
            i6 = i2;
            z = true;
        }
        if (z) {
            this.f319312q1 = true;
            if (this.f319246B1 != null && !isFocused()) {
                this.f319246B1.f319402m = true;
            }
            if ((spanned.getSpanFlags(obj) & 512) == 0) {
                if (i6 < 0) {
                    i6 = Selection.getSelectionStart(spanned);
                }
                if (i5 < 0) {
                    i5 = Selection.getSelectionEnd(spanned);
                }
                C106778a aVar3 = this.f319246B1;
                if (aVar3 != null) {
                    aVar3.mo154289D();
                    if (!mo153978L() && this.f319246B1.mo154317v() && hasTransientState()) {
                        setHasTransientState(false);
                    }
                }
                mo104414a0(i6, i5);
            }
        }
        if ((obj instanceof UpdateAppearance) || (obj instanceof ParagraphStyle) || (obj instanceof CharacterStyle)) {
            if (jVar == null || jVar.f319471c == 0) {
                invalidate();
                this.f319312q1 = true;
                mo153968A();
            } else {
                jVar.f319474f = true;
            }
            C106778a aVar4 = this.f319246B1;
            if (aVar4 != null) {
                aVar4.mo154316u();
            }
        }
        if (MetaKeyKeyListener.isMetaTracker(spanned, obj)) {
            this.f319312q1 = true;
            if (jVar != null && MetaKeyKeyListener.isSelectingMetaTracker(spanned, obj)) {
                jVar.f319473e = true;
            }
            if (Selection.getSelectionStart(spanned) >= 0) {
                if (jVar == null || jVar.f319471c == 0) {
                    int selectionEnd = getSelectionEnd();
                    mo153979N(selectionEnd, selectionEnd, selectionEnd);
                } else {
                    jVar.f319472d = true;
                }
            }
        }
        if ((obj instanceof ParcelableSpan) && jVar != null && jVar.f319469a != null) {
            if (jVar.f319471c != 0) {
                if (i >= 0) {
                    if (jVar.f319475g > i) {
                        jVar.f319475g = i;
                    }
                    if (jVar.f319475g > i3) {
                        jVar.f319475g = i3;
                    }
                }
                if (i2 >= 0) {
                    if (jVar.f319475g > i2) {
                        jVar.f319475g = i2;
                    }
                    if (jVar.f319475g > i4) {
                        jVar.f319475g = i4;
                        return;
                    }
                    return;
                }
                return;
            }
            jVar.f319474f = true;
        }
    }

    /* renamed from: s */
    public final void mo154161s() {
        int right = ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        int i = right < 1 ? 0 : right;
        int i2 = this.f319275U ? 1048576 : i;
        BoringLayout.Metrics metrics = f319242P1;
        mo153987W(i2, i, metrics, metrics, i, false);
    }

    /* renamed from: s0 */
    public void mo154162s0() {
        C106778a aVar = this.f319246B1;
        if (aVar != null) {
            aVar.mo154297M();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 4096) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAdaptText(TextView textView) {
        this.f319248C1 = textView;
        textView.addTextChangedListener(this.f319250D1);
    }

    public void setAllCaps(boolean z) {
        if (!z) {
            setTransformationMethod((TransformationMethod) null);
        }
    }

    public final void setAutoLinkMask(int i) {
        this.f319277V = i;
    }

    public void setBreakStrategy(int i) {
        if (this.f319264M != null) {
            mo153988X();
            requestLayout();
            invalidate();
        }
    }

    public void setCompoundDrawablePadding(int i) {
        C106777f fVar = this.f319331z;
        if (i != 0) {
            if (fVar == null) {
                fVar = new C106777f(getContext());
                this.f319331z = fVar;
            }
            fVar.f319362s = i;
        } else if (fVar != null) {
            fVar.f319362s = i;
        }
        invalidate();
        requestLayout();
    }

    public void setCompoundDrawableTintBlendMode(BlendMode blendMode) {
        if (this.f319331z == null) {
            this.f319331z = new C106777f(getContext());
        }
        C106777f fVar = this.f319331z;
        fVar.f319347d = blendMode;
        fVar.f319349f = true;
        mo154157q();
    }

    public void setCompoundDrawableTintList(ColorStateList colorStateList) {
        if (this.f319331z == null) {
            this.f319331z = new C106777f(getContext());
        }
        C106777f fVar = this.f319331z;
        fVar.f319346c = colorStateList;
        fVar.f319348e = true;
        mo154157q();
    }

    public void setCompoundDrawableTintMode(PorterDuff.Mode mode) {
    }

    public void setCursorVisible(boolean z) {
        if (!z || this.f319246B1 != null) {
            mo153970C();
            C106778a aVar = this.f319246B1;
            if (aVar.f319411v != z) {
                aVar.f319411v = z;
                invalidate();
                this.f319246B1.mo154321z();
                this.f319246B1.mo154288C();
            }
        }
    }

    public void setCustomInsertionActionModeCallback(ActionMode.Callback callback) {
        mo153970C();
        this.f319246B1.f319374L = callback;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        mo153970C();
        this.f319246B1.f319373K = callback;
    }

    public final void setEditableFactory(Editable.Factory factory) {
        this.f319299j = factory;
        setText(this.f319243A);
    }

    public void setElegantTextHeight(boolean z) {
        if (z != this.f319262K.isElegantTextHeight()) {
            this.f319262K.setElegantTextHeight(z);
            if (this.f319264M != null) {
                mo153988X();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f319328y != truncateAt) {
            this.f319328y = truncateAt;
            if (this.f319264M != null) {
                mo153988X();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setEms(int i) {
        this.f319281X0 = i;
        this.f319278V0 = i;
        this.f319282Y0 = 1;
        this.f319280W0 = 1;
        requestLayout();
        invalidate();
    }

    public void setEnabled(boolean z) {
        InputMethodManager inputMethodManager;
        InputMethodManager inputMethodManager2;
        if (z != isEnabled()) {
            if (!z && (inputMethodManager2 = getInputMethodManager()) != null && inputMethodManager2.isActive(this)) {
                inputMethodManager2.hideSoftInputFromWindow(getWindowToken(), 0);
            }
            super.setEnabled(z);
            if (z && (inputMethodManager = getInputMethodManager()) != null) {
                inputMethodManager.restartInput(this);
            }
            C106778a aVar = this.f319246B1;
            if (aVar != null) {
                aVar.mo154288C();
                this.f319246B1.mo154321z();
            }
        }
    }

    public void setError(CharSequence charSequence) {
        if (charSequence == null) {
            mo153970C();
        } else {
            mo153970C();
        }
    }

    public void setExtractedText(ExtractedText extractedText) {
        Class<?> cls;
        int i;
        Editable editableText = getEditableText();
        CharSequence charSequence = extractedText.text;
        if (charSequence != null) {
            if (editableText == null) {
                mo153965m0(charSequence, TextView.BufferType.EDITABLE);
            } else {
                int length = editableText.length();
                if (extractedText.partialStartOffset >= 0) {
                    length = editableText.length();
                    int i2 = extractedText.partialStartOffset;
                    if (i2 > length) {
                        i2 = length;
                    }
                    int i3 = extractedText.partialEndOffset;
                    i = i2;
                    if (i3 <= length) {
                        length = i3;
                    }
                } else {
                    i = 0;
                }
                Object[] spans = editableText.getSpans(i, length, ParcelableSpan.class);
                int length2 = spans.length;
                while (length2 > 0) {
                    length2--;
                    editableText.removeSpan(spans[length2]);
                }
                if (TextUtils.equals(editableText.subSequence(i, length), extractedText.text)) {
                    CharSequence charSequence2 = extractedText.text;
                    if (charSequence2 instanceof Spanned) {
                        TextUtils.copySpansFrom((Spanned) charSequence2, 0, length - i, Object.class, editableText, i);
                    }
                } else {
                    editableText.replace(i, length, extractedText.text);
                }
            }
        }
        Spannable spannable = (Spannable) getText();
        int length3 = spannable.length();
        int i4 = extractedText.selectionStart;
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 > length3) {
            i4 = length3;
        }
        int i5 = extractedText.selectionEnd;
        if (i5 < 0) {
            length3 = 0;
        } else if (i5 <= length3) {
            length3 = i5;
        }
        Selection.setSelection(spannable, i4, length3);
        if ((extractedText.flags & 2) != 0) {
            Class[] clsArr = {Spannable.class};
            try {
                cls = Class.forName(MetaKeyKeyListener.class.getName());
            } catch (Throwable unused) {
                cls = null;
            }
            Method method = null;
            while (cls != Object.class) {
                try {
                    method = cls.getDeclaredMethod("startSelecting", clsArr);
                } catch (Throwable unused2) {
                }
                cls = cls.getSuperclass();
            }
            Object[] objArr = {this, spannable};
            try {
                method.setAccessible(true);
                method.invoke((Object) null, objArr);
            } catch (Throwable unused3) {
            }
        } else {
            C109755b.m149079b(this, spannable);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            setHintInternal(extractedText.hint);
        }
    }

    public void setExtracting(ExtractedTextRequest extractedTextRequest) {
        C106778a aVar = this.f319246B1;
        C106778a.C106788j jVar = aVar.f319400k;
        if (jVar != null) {
            jVar.f319469a = extractedTextRequest;
        }
        aVar.mo154315t();
        mo154162s0();
        C106778a.C106796p pVar = this.f319246B1.f319391b;
        if (pVar != null) {
            pVar.mo154378g();
        }
    }

    public void setFallbackLineSpacing(boolean z) {
        if (this.f319271S != z) {
            this.f319271S = z;
            if (this.f319264M != null) {
                mo153988X();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        if (inputFilterArr != null) {
            this.f319302l1 = inputFilterArr;
            CharSequence charSequence = this.f319243A;
            if (charSequence instanceof Editable) {
                mo154130j0((Editable) charSequence, inputFilterArr);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (i >= 0) {
            Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
            int i2 = getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
            if (i > Math.abs(i2)) {
                setPadding(getPaddingLeft(), i - (-i2), getPaddingRight(), getPaddingBottom());
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setFontFeatureSettings(String str) {
        if (str != this.f319262K.getFontFeatureSettings()) {
            this.f319262K.setFontFeatureSettings(str);
            if (this.f319264M != null) {
                mo153988X();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setFreezesText(boolean z) {
        this.f319297i = z;
    }

    public void setGravity(int i) {
        if ((i & 8388615) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        int i2 = i & 8388615;
        int i3 = this.f319273T;
        boolean z = i2 != (8388615 & i3);
        if (i != i3) {
            invalidate();
        }
        this.f319273T = i;
        Layout layout = this.f319264M;
        if (layout != null && z) {
            int width = layout.getWidth();
            Layout layout2 = this.f319253F;
            int width2 = layout2 == null ? 0 : layout2.getWidth();
            BoringLayout.Metrics metrics = f319242P1;
            mo153987W(width, width2, metrics, metrics, ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), true);
        }
    }

    public void setHandleColorRes(int i) {
        this.f319252E1 = i;
    }

    public void setHeight(int i) {
        this.f319270R0 = i;
        this.f319329y0 = i;
        this.f319272S0 = 2;
        this.f319268Q0 = 2;
        requestLayout();
        invalidate();
    }

    public void setHighlightColor(int i) {
        if (this.f319305n1 != i) {
            this.f319305n1 = i;
            invalidate();
        }
    }

    public final void setHint(CharSequence charSequence) {
        setHintInternal(charSequence);
        if (this.f319246B1 != null) {
            InputMethodManager inputMethodManager = getInputMethodManager();
            if (inputMethodManager != null && inputMethodManager.isActive(this)) {
                this.f319246B1.mo154290E();
            }
        }
    }

    public final void setHintTextColor(int i) {
        this.f319289e = ColorStateList.valueOf(i);
        mo154266w0();
    }

    public void setHorizontallyScrolling(boolean z) {
        if (this.f319275U != z) {
            this.f319275U = z;
            if (this.f319264M != null) {
                mo153988X();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setImeHintLocales(LocaleList localeList) {
        int i;
        C106778a aVar;
        mo153970C();
        this.f319246B1.mo154300e();
        this.f319246B1.f319399j.f319468h = localeList;
        if (this.f319269R && (i = Build.VERSION.SDK_INT) >= 24) {
            Locale locale = localeList == null ? null : localeList.get(0);
            if (!this.f319267Q && (aVar = this.f319246B1) != null) {
                KeyListener keyListener = aVar.f319404o;
                if (!(keyListener instanceof DigitsKeyListener)) {
                    if (keyListener instanceof DateKeyListener) {
                        if (i >= 26) {
                            keyListener = DateKeyListener.getInstance(locale);
                        }
                    } else if (keyListener instanceof TimeKeyListener) {
                        if (i >= 26) {
                            keyListener = TimeKeyListener.getInstance(locale);
                        }
                    } else if (!(keyListener instanceof DateTimeKeyListener)) {
                        return;
                    } else {
                        if (i >= 26) {
                            keyListener = DateTimeKeyListener.getInstance(locale);
                        }
                    }
                }
                boolean R = m144191R(this.f319246B1.f319405p);
                setKeyListenerOnly(keyListener);
                try {
                    C106778a aVar2 = this.f319246B1;
                    aVar2.f319405p = aVar2.f319404o.getInputType();
                } catch (IncompatibleClassChangeError unused) {
                    this.f319246B1.f319405p = 1;
                }
                setInputTypeSingleLine(this.f319283Z0);
                if (R) {
                    C106778a aVar3 = this.f319246B1;
                    int i2 = aVar3.f319405p;
                    int i3 = i2 & 15;
                    if (i3 == 1) {
                        aVar3.f319405p = i2 | 128;
                    } else if (i3 == 2) {
                        aVar3.f319405p = i2 | 16;
                    }
                }
            }
        }
    }

    public void setImeOptions(int i) {
        mo153970C();
        this.f319246B1.mo154300e();
        this.f319246B1.f319399j.f319461a = i;
    }

    public void setIncludeFontPadding(boolean z) {
        if (this.f319285b1 != z) {
            this.f319285b1 = z;
            if (this.f319264M != null) {
                mo153988X();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setInputExtras(int i) {
        mo153970C();
        XmlResourceParser xml = getResources().getXml(i);
        this.f319246B1.mo154300e();
        this.f319246B1.f319399j.f319465e = new Bundle();
        getResources().parseBundleExtras(xml, this.f319246B1.f319399j.f319465e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setInputType(int r11) {
        /*
            r10 = this;
            int r0 = r10.getInputType()
            boolean r0 = m144191R(r0)
            int r1 = r10.getInputType()
            r1 = r1 & 4095(0xfff, float:5.738E-42)
            r2 = 145(0x91, float:2.03E-43)
            r6 = 0
            r7 = 1
            if (r1 != r2) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r10.mo154132k0(r11, r6)
            boolean r8 = m144191R(r11)
            r3 = r11 & 4095(0xfff, float:5.738E-42)
            if (r3 != r2) goto L_0x0024
            r2 = 1
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            if (r8 == 0) goto L_0x0038
            android.text.method.PasswordTransformationMethod r0 = android.text.method.PasswordTransformationMethod.getInstance()
            r10.setTransformationMethod(r0)
            r1 = 0
            r2 = 0
            r3 = 3
            r4 = 0
            r5 = -1
            r0 = r10
            r0.mo154154p0(r1, r2, r3, r4, r5)
            goto L_0x0066
        L_0x0038:
            if (r2 == 0) goto L_0x004f
            android.text.method.TransformationMethod r0 = r10.f319257H
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            if (r0 != r1) goto L_0x0044
            r9 = 1
            goto L_0x0045
        L_0x0044:
            r9 = 0
        L_0x0045:
            r1 = 0
            r2 = 0
            r3 = 3
            r4 = 0
            r5 = -1
            r0 = r10
            r0.mo154154p0(r1, r2, r3, r4, r5)
            goto L_0x0067
        L_0x004f:
            if (r0 != 0) goto L_0x0053
            if (r1 == 0) goto L_0x0066
        L_0x0053:
            r1 = 0
            r2 = 0
            r3 = -1
            r4 = 0
            r5 = -1
            r0 = r10
            r0.mo154154p0(r1, r2, r3, r4, r5)
            android.text.method.TransformationMethod r0 = r10.f319257H
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            if (r0 != r1) goto L_0x0066
            r9 = 1
            goto L_0x0067
        L_0x0066:
            r9 = 0
        L_0x0067:
            r0 = 131087(0x2000f, float:1.83692E-40)
            r0 = r0 & r11
            r1 = 131073(0x20001, float:1.83672E-40)
            if (r0 != r1) goto L_0x0071
            r6 = 1
        L_0x0071:
            r0 = r6 ^ 1
            boolean r1 = r10.f319283Z0
            if (r1 != r0) goto L_0x0079
            if (r9 == 0) goto L_0x007e
        L_0x0079:
            r1 = r8 ^ 1
            r10.mo154159r(r0, r1, r7)
        L_0x007e:
            boolean r0 = r10.mo153984T()
            if (r0 != 0) goto L_0x008d
            java.lang.CharSequence r0 = r10.f319243A
            java.lang.CharSequence r0 = r10.mo154003e0(r0)
            r10.setTextInternal(r0)
        L_0x008d:
            android.view.inputmethod.InputMethodManager r0 = r10.getInputMethodManager()
            if (r0 == 0) goto L_0x0096
            r0.restartInput(r10)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.setInputType(int):void");
    }

    public void setKeyListener(KeyListener keyListener) {
        this.f319267Q = true;
        setKeyListenerOnly(keyListener);
        mo153973G();
        if (keyListener != null) {
            mo153970C();
            try {
                C106778a aVar = this.f319246B1;
                aVar.f319405p = aVar.f319404o.getInputType();
            } catch (IncompatibleClassChangeError unused) {
                this.f319246B1.f319405p = 1;
            }
            setInputTypeSingleLine(this.f319283Z0);
        } else {
            C106778a aVar2 = this.f319246B1;
            if (aVar2 != null) {
                aVar2.f319405p = 0;
            }
        }
        InputMethodManager inputMethodManager = getInputMethodManager();
        if (inputMethodManager != null) {
            inputMethodManager.restartInput(this);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (i >= 0) {
            Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
            int i2 = getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (i > Math.abs(i2)) {
                setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i - i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setLetterSpacing(float f) {
        if (f != this.f319262K.getLetterSpacing()) {
            this.f319262K.setLetterSpacing(f);
            if (this.f319264M != null) {
                mo153988X();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setLineHeight(int i) {
        if (i >= 0) {
            int fontMetricsInt = getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
            if (i != fontMetricsInt) {
                float f = (float) (i - fontMetricsInt);
                if (this.f319326x0 != f || this.f319309p0 != 1.0f) {
                    this.f319326x0 = f;
                    this.f319309p0 = 1.0f;
                    if (this.f319264M != null) {
                        mo153988X();
                        requestLayout();
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setLines(int i) {
        this.f319270R0 = i;
        this.f319329y0 = i;
        this.f319272S0 = 1;
        this.f319268Q0 = 1;
        requestLayout();
        invalidate();
    }

    public final void setLinkTextColor(int i) {
        this.f319291f = ColorStateList.valueOf(i);
        mo154266w0();
    }

    public final void setLinksClickable(boolean z) {
        this.f319279W = z;
    }

    public void setMaxEms(int i) {
        this.f319278V0 = i;
        this.f319280W0 = 1;
        requestLayout();
        invalidate();
    }

    public void setMaxHeight(int i) {
        this.f319329y0 = i;
        this.f319268Q0 = 2;
        requestLayout();
        invalidate();
    }

    public void setMaxLines(int i) {
        this.f319329y0 = i;
        this.f319268Q0 = 1;
        requestLayout();
        invalidate();
    }

    public void setMaxWidth(int i) {
        this.f319278V0 = i;
        this.f319280W0 = 2;
        requestLayout();
        invalidate();
    }

    public void setMenuCallback(C110588j.C110590c cVar) {
        this.f319256G1 = cVar;
    }

    public void setMinEms(int i) {
        this.f319281X0 = i;
        this.f319282Y0 = 1;
        requestLayout();
        invalidate();
    }

    public void setMinHeight(int i) {
        this.f319270R0 = i;
        this.f319272S0 = 2;
        requestLayout();
        invalidate();
    }

    public void setMinLines(int i) {
        this.f319270R0 = i;
        this.f319272S0 = 1;
        requestLayout();
        invalidate();
    }

    public void setMinWidth(int i) {
        this.f319281X0 = i;
        this.f319282Y0 = 2;
        requestLayout();
        invalidate();
    }

    public final void setMovementMethod(C109633a aVar) {
        if (this.f319255G != aVar) {
            this.f319255G = aVar;
            if (aVar != null && this.f319245B == null) {
                setText(this.f319243A);
            }
            mo153973G();
            C106778a aVar2 = this.f319246B1;
            if (aVar2 != null) {
                aVar2.mo154288C();
            }
        }
    }

    public void setOnEditorActionListener(C74978g gVar) {
        mo153970C();
        this.f319246B1.mo154300e();
        this.f319246B1.f319399j.f319466f = gVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (!(i == getPaddingLeft() && i3 == getPaddingRight() && i2 == getPaddingTop() && i4 == getPaddingBottom())) {
            mo153988X();
        }
        super.setPadding(i, i2, i3, i4);
        invalidate();
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (!(i == getPaddingStart() && i3 == getPaddingEnd() && i2 == getPaddingTop() && i4 == getPaddingBottom())) {
            mo153988X();
        }
        super.setPaddingRelative(i, i2, i3, i4);
        invalidate();
    }

    public void setPaintFlags(int i) {
        if (this.f319262K.getFlags() != i) {
            this.f319262K.setFlags(i);
            if (this.f319264M != null) {
                mo153988X();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setPrivateImeOptions(String str) {
        mo153970C();
        this.f319246B1.mo154300e();
        this.f319246B1.f319399j.f319462b = str;
    }

    public void setRawInputType(int i) {
        if (i != 0 || this.f319246B1 != null) {
            mo153970C();
            this.f319246B1.f319405p = i;
        }
    }

    public void setReuseBrands(List<String> list) {
        if (list != null) {
            ((HashSet) this.f319260I1).clear();
            this.f319260I1.addAll(list);
        }
    }

    public void setReuseItems(List<String> list) {
        if (list != null) {
            ((HashSet) this.f319258H1).clear();
            this.f319258H1.addAll(list);
        }
    }

    public void setScroller(Scroller scroller) {
        this.f319292f1 = scroller;
    }

    public void setSelectAllOnFocus(boolean z) {
        mo153970C();
        this.f319246B1.f319412w = z;
        if (z) {
            CharSequence charSequence = this.f319243A;
            if (!(charSequence instanceof Spannable)) {
                mo153965m0(charSequence, TextView.BufferType.SPANNABLE);
            }
        }
    }

    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
    }

    public final void setShowSoftInputOnFocus(boolean z) {
        mo153970C();
        this.f319246B1.f319415z = z;
    }

    public void setSingleLine(boolean z) {
        setInputTypeSingleLine(z);
        mo154159r(z, true, true);
    }

    public final void setSpannableFactory(Spannable.Factory factory) {
        this.f319304n = factory;
        setText(this.f319243A);
    }

    public final void setText(CharSequence charSequence) {
        mo153965m0(charSequence, this.f319249D);
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        this.f319319u = textClassifier;
    }

    public void setTextColor(int i) {
        this.f319287d = ColorStateList.valueOf(i);
        mo154266w0();
    }

    public void setTextCursorDrawable(Drawable drawable) {
        this.f319316s1 = drawable;
        this.f319314r1 = 0;
        C106778a aVar = this.f319246B1;
        if (aVar != null && aVar.f319368F == null) {
            aVar.f319368F = aVar.f319383U.getTextCursorDrawable();
        }
    }

    public void setTextIsSelectable(boolean z) {
        if (z || this.f319246B1 != null) {
            mo153970C();
            C106778a aVar = this.f319246B1;
            if (aVar.f319413x != z) {
                aVar.f319413x = z;
                setFocusableInTouchMode(z);
                if (Build.VERSION.SDK_INT >= 26) {
                    setFocusable(16);
                } else {
                    setFocusable(z);
                }
                setClickable(z);
                setLongClickable(z);
                setMovementMethod(z ? ArrowKeyMovementMethod.getInstance() : null);
                mo153965m0(this.f319243A, z ? TextView.BufferType.SPANNABLE : TextView.BufferType.NORMAL);
                this.f319246B1.mo154288C();
            }
        }
    }

    public final void setTextKeepState(CharSequence charSequence) {
        Spannable spannable;
        TextView.BufferType bufferType = this.f319249D;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        int length = charSequence.length();
        mo153965m0(charSequence, bufferType);
        if ((selectionStart >= 0 || selectionEnd >= 0) && (spannable = this.f319245B) != null) {
            Selection.setSelection(spannable, Math.max(0, Math.min(selectionStart, length)), Math.max(0, Math.min(selectionEnd, length)));
        }
    }

    public void setTextLocale(Locale locale) {
        this.f319265N = true;
        this.f319262K.setTextLocale(locale);
        if (this.f319264M != null) {
            mo153988X();
            requestLayout();
            invalidate();
        }
    }

    public void setTextLocales(LocaleList localeList) {
        this.f319265N = true;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f319262K.setTextLocales(localeList);
        } else if (localeList != null && localeList.size() > 0) {
            this.f319262K.setTextLocale(localeList.get(0));
        }
        if (this.f319264M != null) {
            mo153988X();
            requestLayout();
            invalidate();
        }
    }

    public final void setTextOperationUser(UserHandle userHandle) {
        if (!Objects.equals(this.f319303m1, userHandle)) {
            if (userHandle != null) {
                Process.myUserHandle().equals(userHandle);
            }
            this.f319303m1 = userHandle;
        }
    }

    public void setTextScaleX(float f) {
        if (f != this.f319262K.getTextScaleX()) {
            this.f319263L = true;
            this.f319262K.setTextScaleX(f);
            if (this.f319264M != null) {
                mo153988X();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setTextSelectHandle(Drawable drawable) {
        if (drawable != null) {
            this.f319330y1 = drawable;
            this.f319327x1 = 0;
            C106778a aVar = this.f319246B1;
            if (aVar != null) {
                aVar.mo154320y(true);
                return;
            }
            return;
        }
        throw new NullPointerException("The text select handle should not be null.");
    }

    public void setTextSelectHandleLeft(Drawable drawable) {
        if (drawable != null) {
            this.f319320u1 = drawable;
            this.f319318t1 = 0;
            C106778a aVar = this.f319246B1;
            if (aVar != null) {
                aVar.mo154320y(true);
                return;
            }
            return;
        }
        throw new NullPointerException("The left text select handle should not be null.");
    }

    public void setTextSelectHandleRight(Drawable drawable) {
        if (drawable != null) {
            this.f319324w1 = drawable;
            this.f319322v1 = 0;
            C106778a aVar = this.f319246B1;
            if (aVar != null) {
                aVar.mo154320y(true);
                return;
            }
            return;
        }
        throw new NullPointerException("The right text select handle should not be null.");
    }

    public void setTextSize(float f) {
        setTextSize(2, f);
    }

    public final void setTransformationMethod(TransformationMethod transformationMethod) {
        Spannable spannable;
        TransformationMethod transformationMethod2 = this.f319257H;
        if (transformationMethod != transformationMethod2) {
            if (!(transformationMethod2 == null || (spannable = this.f319245B) == null)) {
                spannable.removeSpan(transformationMethod2);
            }
            this.f319257H = transformationMethod;
            setText(this.f319243A);
            boolean z = this.f319257H instanceof PasswordTransformationMethod;
            this.f319301k1 = getTextDirectionHeuristic();
        }
    }

    public void setTypeface(Typeface typeface) {
        if (this.f319262K.getTypeface() != typeface) {
            this.f319262K.setTypeface(typeface);
            if (this.f319264M != null) {
                mo153988X();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setWidth(int i) {
        this.f319281X0 = i;
        this.f319278V0 = i;
        this.f319282Y0 = 2;
        this.f319280W0 = 2;
        requestLayout();
        invalidate();
    }

    public boolean showContextMenu() {
        C106778a aVar = this.f319246B1;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.showContextMenu();
    }

    /* renamed from: t */
    public void mo154259t() {
        C106778a aVar = this.f319246B1;
        if (aVar != null) {
            aVar.f319414y = true;
            C106778a.C106788j jVar = aVar.f319400k;
            if (jVar != null) {
                int i = jVar.f319471c + 1;
                jVar.f319471c = i;
                if (i == 1) {
                    jVar.f319472d = false;
                    jVar.f319477i = 0;
                    if (jVar.f319474f) {
                        jVar.f319475g = 0;
                        jVar.f319476h = aVar.f319383U.getText().length();
                    } else {
                        jVar.f319475g = -1;
                        jVar.f319476h = -1;
                        jVar.f319474f = false;
                    }
                    aVar.f319383U.getClass();
                }
            }
        }
    }

    /* renamed from: t0 */
    public boolean mo153967t0() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f6, code lost:
        if ((r11 - r10) < r12) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0141  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo154260u(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r17.isLayoutRequested()
            r3 = 0
            if (r2 == 0) goto L_0x000e
            r0.f319286c1 = r1
            return r3
        L_0x000e:
            java.lang.CharSequence r2 = r0.f319243A
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r4 = 1
            if (r2 == 0) goto L_0x0021
            java.lang.CharSequence r2 = r0.f319251E
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0021
            r2 = 1
            goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 == 0) goto L_0x0027
            android.text.Layout r2 = r0.f319253F
            goto L_0x0029
        L_0x0027:
            android.text.Layout r2 = r0.f319264M
        L_0x0029:
            if (r2 != 0) goto L_0x002c
            return r3
        L_0x002c:
            int r5 = r2.getLineForOffset(r1)
            int[] r6 = com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.C106775d.f319341a
            android.text.Layout$Alignment r7 = r2.getParagraphAlignment(r5)
            int r7 = r7.ordinal()
            r6 = r6[r7]
            r7 = 2
            if (r6 == r4) goto L_0x0049
            if (r6 == r7) goto L_0x0043
            r6 = 0
            goto L_0x004d
        L_0x0043:
            int r6 = r2.getParagraphDirection(r5)
            int r6 = -r6
            goto L_0x004d
        L_0x0049:
            int r6 = r2.getParagraphDirection(r5)
        L_0x004d:
            float r1 = r2.getPrimaryHorizontal(r1)
            int r1 = (int) r1
            int r8 = r2.getLineTop(r5)
            int r9 = r5 + 1
            int r9 = r2.getLineTop(r9)
            float r10 = r2.getLineLeft(r5)
            double r10 = (double) r10
            double r10 = java.lang.Math.floor(r10)
            int r10 = (int) r10
            float r11 = r2.getLineRight(r5)
            double r11 = (double) r11
            double r11 = java.lang.Math.ceil(r11)
            int r11 = (int) r11
            int r2 = r2.getHeight()
            int r12 = r17.getRight()
            int r13 = r17.getLeft()
            int r12 = r12 - r13
            int r13 = r17.getCompoundPaddingLeft()
            int r12 = r12 - r13
            int r13 = r17.getCompoundPaddingRight()
            int r12 = r12 - r13
            int r13 = r17.getBottom()
            int r14 = r17.getTop()
            int r13 = r13 - r14
            int r14 = r17.getExtendedPaddingTop()
            int r13 = r13 - r14
            int r14 = r17.getExtendedPaddingBottom()
            int r13 = r13 - r14
            boolean r14 = r0.f319275U
            if (r14 != 0) goto L_0x00aa
            int r14 = r11 - r10
            if (r14 <= r12) goto L_0x00aa
            if (r11 <= r1) goto L_0x00aa
            int r11 = r10 + r12
            int r11 = java.lang.Math.max(r1, r11)
        L_0x00aa:
            int r14 = r9 - r8
            int r14 = r14 / r7
            int r15 = r13 / 4
            if (r14 <= r15) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r15 = r14
        L_0x00b3:
            int r3 = r12 / 4
            if (r14 <= r3) goto L_0x00b8
            r14 = r3
        L_0x00b8:
            int r3 = r17.getScrollX()
            int r16 = r17.getScrollY()
            int r4 = r8 - r16
            if (r4 >= r15) goto L_0x00c6
            int r16 = r8 - r15
        L_0x00c6:
            int r4 = r9 - r16
            int r15 = r13 - r15
            if (r4 <= r15) goto L_0x00ce
            int r16 = r9 - r15
        L_0x00ce:
            int r4 = r2 - r16
            if (r4 >= r13) goto L_0x00d4
            int r16 = r2 - r13
        L_0x00d4:
            int r2 = 0 - r16
            if (r2 <= 0) goto L_0x00da
            r2 = 0
            goto L_0x00dc
        L_0x00da:
            r2 = r16
        L_0x00dc:
            if (r6 == 0) goto L_0x00ec
            int r4 = r1 - r3
            if (r4 >= r14) goto L_0x00e4
            int r3 = r1 - r14
        L_0x00e4:
            int r4 = r1 - r3
            int r13 = r12 - r14
            if (r4 <= r13) goto L_0x00ec
            int r3 = r1 - r13
        L_0x00ec:
            if (r6 >= 0) goto L_0x00f9
            int r4 = r10 - r3
            if (r4 <= 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r10 = r3
        L_0x00f4:
            int r3 = r11 - r10
            if (r3 >= r12) goto L_0x0132
            goto L_0x0121
        L_0x00f9:
            if (r6 <= 0) goto L_0x0108
            int r4 = r11 - r3
            if (r4 >= r12) goto L_0x0101
            int r3 = r11 - r12
        L_0x0101:
            int r4 = r10 - r3
            if (r4 <= 0) goto L_0x0106
            goto L_0x0132
        L_0x0106:
            r10 = r3
            goto L_0x0132
        L_0x0108:
            int r4 = r11 - r10
            if (r4 > r12) goto L_0x0110
            int r12 = r12 - r4
            int r12 = r12 / r7
            int r10 = r10 - r12
            goto L_0x0132
        L_0x0110:
            int r4 = r11 - r14
            if (r1 <= r4) goto L_0x0115
            goto L_0x0121
        L_0x0115:
            int r4 = r10 + r14
            if (r1 >= r4) goto L_0x011a
            goto L_0x0132
        L_0x011a:
            if (r10 <= r3) goto L_0x011d
            goto L_0x0132
        L_0x011d:
            int r4 = r3 + r12
            if (r11 >= r4) goto L_0x0124
        L_0x0121:
            int r10 = r11 - r12
            goto L_0x0132
        L_0x0124:
            int r4 = r1 - r3
            if (r4 >= r14) goto L_0x012a
            int r3 = r1 - r14
        L_0x012a:
            r10 = r3
            int r3 = r1 - r10
            int r12 = r12 - r14
            if (r3 <= r12) goto L_0x0132
            int r10 = r1 - r12
        L_0x0132:
            int r3 = r17.getScrollX()
            if (r10 != r3) goto L_0x0141
            int r3 = r17.getScrollY()
            if (r2 == r3) goto L_0x013f
            goto L_0x0141
        L_0x013f:
            r3 = 0
            goto L_0x0191
        L_0x0141:
            android.widget.Scroller r3 = r0.f319292f1
            if (r3 != 0) goto L_0x0149
            r0.scrollTo(r10, r2)
            goto L_0x0190
        L_0x0149:
            long r3 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r11 = r0.f319290e1
            long r3 = r3 - r11
            int r6 = r17.getScrollX()
            int r10 = r10 - r6
            int r6 = r17.getScrollY()
            int r2 = r2 - r6
            r11 = 250(0xfa, double:1.235E-321)
            int r6 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x017a
            android.widget.Scroller r3 = r0.f319292f1
            int r4 = r17.getScrollX()
            int r6 = r17.getScrollY()
            r3.startScroll(r4, r6, r10, r2)
            android.widget.Scroller r2 = r0.f319292f1
            int r2 = r2.getDuration()
            r0.awakenScrollBars(r2)
            r17.invalidate()
            goto L_0x018a
        L_0x017a:
            android.widget.Scroller r3 = r0.f319292f1
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L_0x0187
            android.widget.Scroller r3 = r0.f319292f1
            r3.abortAnimation()
        L_0x0187:
            r0.scrollBy(r10, r2)
        L_0x018a:
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r0.f319290e1 = r2
        L_0x0190:
            r3 = 1
        L_0x0191:
            boolean r2 = r17.isFocused()
            if (r2 == 0) goto L_0x0200
            android.graphics.Rect r2 = r0.f319288d1
            if (r2 != 0) goto L_0x01a2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f319288d1 = r2
        L_0x01a2:
            android.graphics.Rect r2 = r0.f319288d1
            int r4 = r1 + -2
            int r1 = r1 + r7
            r2.set(r4, r8, r1, r9)
            android.graphics.Rect r1 = r0.f319288d1
            int r2 = r17.getCompoundPaddingLeft()
            int r4 = r17.getScrollX()
            int r2 = r2 - r4
            int r4 = r1.left
            int r4 = r4 + r2
            r1.left = r4
            int r4 = r1.right
            int r4 = r4 + r2
            r1.right = r4
            int r2 = r17.mo154268x0()
            int r4 = r1.top
            int r4 = r4 + r2
            r1.top = r4
            int r6 = r1.bottom
            int r6 = r6 + r2
            r1.bottom = r6
            if (r5 != 0) goto L_0x01d6
            int r2 = r17.getExtendedPaddingTop()
            int r4 = r4 - r2
            r1.top = r4
        L_0x01d6:
            android.text.Layout r2 = r0.f319264M
            int r2 = r2.getLineCount()
            int r2 = r2 + -1
            if (r5 != r2) goto L_0x01e9
            int r2 = r1.bottom
            int r4 = r17.getExtendedPaddingBottom()
            int r2 = r2 + r4
            r1.bottom = r2
        L_0x01e9:
            android.graphics.Rect r1 = r0.f319288d1
            int r2 = r17.getScrollX()
            int r4 = r17.getScrollY()
            r1.offset(r2, r4)
            android.graphics.Rect r1 = r0.f319288d1
            boolean r1 = r0.requestRectangleOnScreen(r1)
            if (r1 == 0) goto L_0x0200
            r4 = 1
            goto L_0x0201
        L_0x0200:
            r4 = r3
        L_0x0201:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.mo154260u(int):boolean");
    }

    /* renamed from: u0 */
    public boolean mo154261u0() {
        C109633a aVar = this.f319255G;
        if (aVar == null || !aVar.canSelectArbitrarily()) {
            return false;
        }
        return mo153985U() || (mo153986V() && (this.f319243A instanceof Spannable) && isEnabled());
    }

    /* renamed from: v */
    public boolean mo154262v() {
        return !(this.f319257H instanceof PasswordTransformationMethod) && this.f319243A.length() > 0 && mo153978L() && this.f319246B1 != null;
    }

    /* renamed from: v0 */
    public void mo154263v0() {
        invalidate();
        int selectionStart = getSelectionStart();
        if (selectionStart >= 0 || (this.f319273T & 112) == 80) {
            mo153993c0();
        }
        mo153968A();
        if (selectionStart >= 0) {
            this.f319312q1 = true;
            C106778a aVar = this.f319246B1;
            if (aVar != null) {
                aVar.mo154321z();
            }
            mo154260u(selectionStart);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        C106777f fVar;
        boolean verifyDrawable = super.verifyDrawable(drawable);
        if (!verifyDrawable && (fVar = this.f319331z) != null) {
            for (Drawable drawable2 : fVar.f319345b) {
                if (drawable == drawable2) {
                    return true;
                }
            }
        }
        return verifyDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r0 = r2.f319246B1;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo154265w() {
        /*
            r2 = this;
            android.text.method.TransformationMethod r0 = r2.f319257H
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.CharSequence r0 = r2.f319243A
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0026
            boolean r0 = r2.mo153978L()
            if (r0 == 0) goto L_0x0026
            java.lang.CharSequence r0 = r2.f319243A
            boolean r0 = r0 instanceof android.text.Editable
            if (r0 == 0) goto L_0x0026
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r2.f319246B1
            if (r0 == 0) goto L_0x0026
            android.text.method.KeyListener r0 = r0.f319404o
            if (r0 == 0) goto L_0x0026
            r0 = 1
            return r0
        L_0x0026:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.mo154265w():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r7.f319243A.length() == 0) goto L_0x003e;
     */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo154266w0() {
        /*
            r7 = this;
            int[] r0 = r7.getDrawableState()
            android.content.res.ColorStateList r1 = r7.f319287d
            r2 = 0
            int r1 = r1.getColorForState(r0, r2)
            int r3 = r7.f319293g
            r4 = 1
            if (r1 == r3) goto L_0x0014
            r7.f319293g = r1
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            android.content.res.ColorStateList r3 = r7.f319291f
            if (r3 == 0) goto L_0x0026
            int r3 = r3.getColorForState(r0, r2)
            android.text.TextPaint r5 = r7.f319262K
            int r6 = r5.linkColor
            if (r3 == r6) goto L_0x0026
            r5.linkColor = r3
            r1 = 1
        L_0x0026:
            android.content.res.ColorStateList r3 = r7.f319289e
            if (r3 == 0) goto L_0x003d
            int r0 = r3.getColorForState(r0, r2)
            int r2 = r7.f319295h
            if (r0 == r2) goto L_0x003d
            r7.f319295h = r0
            java.lang.CharSequence r0 = r7.f319243A
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r4 = r1
        L_0x003e:
            if (r4 == 0) goto L_0x0043
            r7.invalidate()
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.mo154266w0():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f319246B1;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo154267x() {
        /*
            r1 = this;
            java.lang.CharSequence r0 = r1.f319243A
            boolean r0 = r0 instanceof android.text.Editable
            if (r0 == 0) goto L_0x001c
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r1.f319246B1
            if (r0 == 0) goto L_0x001c
            android.text.method.KeyListener r0 = r0.f319404o
            if (r0 == 0) goto L_0x001c
            int r0 = r1.getSelectionStart()
            if (r0 < 0) goto L_0x001c
            int r0 = r1.getSelectionEnd()
            if (r0 < 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.mo154267x():boolean");
    }

    /* renamed from: x0 */
    public int mo154268x0() {
        int extendedPaddingTop = getExtendedPaddingTop() - getScrollY();
        return (this.f319273T & 112) != 48 ? extendedPaddingTop + mo153977K(false) : extendedPaddingTop;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r1.f319246B1;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo154269y() {
        /*
            r1 = this;
            java.lang.CharSequence r0 = r1.f319243A
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0012
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r1.f319246B1
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.f319394e
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView.mo154269y():boolean");
    }

    /* renamed from: z */
    public final void mo154270z() {
        Layout layout;
        if ((getLayoutParams().width != -2 || (this.f319280W0 == this.f319282Y0 && this.f319278V0 == this.f319281X0)) && ((this.f319251E == null || this.f319253F != null) && ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight() > 0)) {
            int height = this.f319264M.getHeight();
            int width = this.f319264M.getWidth();
            Layout layout2 = this.f319253F;
            int width2 = layout2 == null ? 0 : layout2.getWidth();
            BoringLayout.Metrics metrics = f319242P1;
            mo153987W(width, width2, metrics, metrics, ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), false);
            if (this.f319328y != TextUtils.TruncateAt.MARQUEE) {
                if (getLayoutParams().height != -2 && getLayoutParams().height != -1) {
                    invalidate();
                    return;
                } else if (this.f319264M.getHeight() == height && ((layout = this.f319253F) == null || layout.getHeight() == height)) {
                    invalidate();
                    return;
                }
            }
            requestLayout();
            invalidate();
            return;
        }
        mo153988X();
        requestLayout();
        invalidate();
    }

    public CustomTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public final void setText(int i) {
        setText(getContext().getResources().getText(i));
    }

    public void setTextSize(int i, float f) {
        Resources resources;
        boolean t0 = mo153967t0();
        Context context = getContext();
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        this.f319266P = i;
        mo154133l0(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()), true);
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.CustomTextView$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C106771a();

        /* renamed from: d */
        public int f319333d = -1;

        /* renamed from: e */
        public int f319334e = -1;

        /* renamed from: f */
        public CharSequence f319335f;

        /* renamed from: g */
        public boolean f319336g;

        /* renamed from: h */
        public CharSequence f319337h;

        /* renamed from: i */
        public ParcelableParcel f319338i;

        /* renamed from: com.tencent.mm.ui.widget.cedit.edit.CustomTextView$SavedState$a */
        public class C106771a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C106772a) null);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            String str = "TextView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " start=" + this.f319333d + " end=" + this.f319334e;
            if (this.f319335f != null) {
                str = str + " text=" + this.f319335f;
            }
            return str + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f319333d);
            parcel.writeInt(this.f319334e);
            parcel.writeInt(this.f319336g ? 1 : 0);
            TextUtils.writeToParcel(this.f319335f, parcel, i);
            if (this.f319337h == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                TextUtils.writeToParcel(this.f319337h, parcel, i);
            }
            if (this.f319338i == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            this.f319338i.writeToParcel(parcel, i);
        }

        public SavedState(Parcel parcel, C106772a aVar) {
            super(parcel);
            this.f319333d = parcel.readInt();
            this.f319334e = parcel.readInt();
            this.f319336g = parcel.readInt() != 0;
            this.f319335f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                this.f319337h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            }
            if (parcel.readInt() != 0) {
                this.f319338i = ParcelableParcel.CREATOR.createFromParcel(parcel);
            }
        }
    }

    public CustomTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f319299j = Editable.Factory.getInstance();
        this.f319304n = Spannable.Factory.getInstance();
        this.f319249D = TextView.BufferType.NORMAL;
        this.f319265N = false;
        this.f319266P = -1;
        this.f319267Q = false;
        this.f319273T = 8388659;
        this.f319279W = true;
        this.f319309p0 = 1.0f;
        this.f319326x0 = 0.0f;
        this.f319329y0 = Integer.MAX_VALUE;
        this.f319268Q0 = 1;
        this.f319270R0 = 0;
        this.f319272S0 = 1;
        this.f319274T0 = Integer.MAX_VALUE;
        this.f319276U0 = 1;
        this.f319278V0 = Integer.MAX_VALUE;
        this.f319280W0 = 2;
        this.f319281X0 = 0;
        this.f319282Y0 = 2;
        this.f319284a1 = -1;
        this.f319285b1 = true;
        this.f319286c1 = -1;
        this.f319302l1 = f319238L1;
        this.f319305n1 = 1714664933;
        this.f319312q1 = true;
        this.f319314r1 = 16843618;
        this.f319318t1 = 16843461;
        this.f319322v1 = 16843462;
        this.f319327x1 = 16843463;
        this.f319332z1 = -1;
        this.f319250D1 = new C106772a();
        this.f319252E1 = getContext().getResources().getColor(C0966R.color.f3274lt);
        this.f319254F1 = false;
        this.f319258H1 = new HashSet();
        this.f319260I1 = new HashSet();
        mo104412M(context, attributeSet, i, i2);
    }

    public final void setHintTextColor(ColorStateList colorStateList) {
        this.f319289e = colorStateList;
        mo154266w0();
    }

    public final void setLinkTextColor(ColorStateList colorStateList) {
        this.f319291f = colorStateList;
        mo154266w0();
    }

    public void setTextColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.f319287d = colorStateList;
        mo154266w0();
    }

    public boolean showContextMenu(float f, float f2) {
        C106778a aVar = this.f319246B1;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.showContextMenu(f, f2);
    }

    public final void setHint(int i) {
        setHint(getContext().getResources().getText(i));
    }

    public void setTextCursorDrawable(int i) {
        setTextCursorDrawable(i != 0 ? getContext().getDrawable(i) : null);
    }

    public void setTextSelectHandle(int i) {
        if (i != 0) {
            setTextSelectHandle(getContext().getDrawable(i));
            return;
        }
        throw new IllegalArgumentException("The text select handle should be a valid drawable resource id.");
    }

    public void setTextSelectHandleLeft(int i) {
        if (i != 0) {
            setTextSelectHandleLeft(getContext().getDrawable(i));
            return;
        }
        throw new IllegalArgumentException("The text select left handle should be a valid drawable resource id.");
    }

    public void setTextSelectHandleRight(int i) {
        if (i != 0) {
            setTextSelectHandleRight(getContext().getDrawable(i));
            return;
        }
        throw new IllegalArgumentException("The text select right handle should be a valid drawable resource id.");
    }
}
