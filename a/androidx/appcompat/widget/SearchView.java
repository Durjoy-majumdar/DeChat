package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import j20.C117292a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p1117h3.C108041a;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107207u;
import p990k.C108783b;

public class SearchView extends LinearLayoutCompat implements C108783b {

    /* renamed from: d1 */
    public static final C67078k f305540d1 = new C67078k();

    /* renamed from: A */
    public final ImageView f305541A;

    /* renamed from: B */
    public final ImageView f305542B;

    /* renamed from: C */
    public final ImageView f305543C;

    /* renamed from: D */
    public final View f305544D;

    /* renamed from: E */
    public C67082o f305545E;

    /* renamed from: F */
    public Rect f305546F;

    /* renamed from: G */
    public Rect f305547G;

    /* renamed from: H */
    public int[] f305548H;

    /* renamed from: I */
    public int[] f305549I;

    /* renamed from: J */
    public final ImageView f305550J;

    /* renamed from: K */
    public final Drawable f305551K;

    /* renamed from: L */
    public final int f305552L;

    /* renamed from: M */
    public final int f305553M;

    /* renamed from: N */
    public final Intent f305554N;

    /* renamed from: P */
    public final Intent f305555P;

    /* renamed from: Q */
    public final CharSequence f305556Q;

    /* renamed from: Q0 */
    public int f305557Q0;

    /* renamed from: R */
    public View.OnFocusChangeListener f305558R;

    /* renamed from: R0 */
    public boolean f305559R0;

    /* renamed from: S */
    public View.OnClickListener f305560S;

    /* renamed from: S0 */
    public CharSequence f305561S0;

    /* renamed from: T */
    public boolean f305562T;

    /* renamed from: T0 */
    public CharSequence f305563T0;

    /* renamed from: U */
    public boolean f305564U;

    /* renamed from: U0 */
    public boolean f305565U0;

    /* renamed from: V */
    public C108041a f305566V;

    /* renamed from: V0 */
    public int f305567V0;

    /* renamed from: W */
    public boolean f305568W;

    /* renamed from: W0 */
    public SearchableInfo f305569W0;

    /* renamed from: X0 */
    public Bundle f305570X0;

    /* renamed from: Y0 */
    public final Runnable f305571Y0;

    /* renamed from: Z0 */
    public Runnable f305572Z0;

    /* renamed from: a1 */
    public final WeakHashMap<String, Drawable.ConstantState> f305573a1;

    /* renamed from: b1 */
    public View.OnKeyListener f305574b1;

    /* renamed from: c1 */
    public TextWatcher f305575c1;

    /* renamed from: p0 */
    public CharSequence f305576p0;

    /* renamed from: v */
    public final SearchAutoComplete f305577v;

    /* renamed from: w */
    public final View f305578w;

    /* renamed from: x */
    public final View f305579x;

    /* renamed from: x0 */
    public boolean f305580x0;

    /* renamed from: y */
    public final View f305581y;

    /* renamed from: y0 */
    public boolean f305582y0;

    /* renamed from: z */
    public final ImageView f305583z;

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: g */
        public int f192648g;

        /* renamed from: h */
        public SearchView f192649h;

        /* renamed from: i */
        public boolean f192650i;

        /* renamed from: j */
        public final Runnable f192651j;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class C67077a implements Runnable {
            public C67077a() {
            }

            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f192650i) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f192650i = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0966R.attr.f2661bt);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public boolean enoughToFilter() {
            return this.f192648g <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f192650i) {
                removeCallbacks(this.f192651j);
                post(this.f192651j);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f192649h;
            searchView.mo144144z(searchView.f305564U);
            searchView.post(searchView.f305571Y0);
            if (searchView.f305577v.hasFocus()) {
                C67078k kVar = SearchView.f305540d1;
                SearchAutoComplete searchAutoComplete = searchView.f305577v;
                Method method = kVar.f192653a;
                if (method != null) {
                    try {
                        method.invoke(searchAutoComplete, new Object[0]);
                    } catch (Exception unused) {
                    }
                }
                C67078k kVar2 = SearchView.f305540d1;
                SearchAutoComplete searchAutoComplete2 = searchView.f305577v;
                Method method2 = kVar2.f192654b;
                if (method2 != null) {
                    try {
                        method2.invoke(searchAutoComplete2, new Object[0]);
                    } catch (Exception unused2) {
                    }
                }
            }
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f192649h.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            Method method;
            super.onWindowFocusChanged(z);
            if (z && this.f192649h.hasFocus() && getVisibility() == 0) {
                this.f192650i = true;
                Context context = getContext();
                C67078k kVar = SearchView.f305540d1;
                if ((context.getResources().getConfiguration().orientation == 2) && (method = SearchView.f305540d1.f192655c) != null) {
                    try {
                        method.invoke(this, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f192650i = false;
                removeCallbacks(this.f192651j);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f192650i = false;
                removeCallbacks(this.f192651j);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f192650i = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f192649h = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f192648g = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f192651j = new C67077a();
            this.f192648g = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public static class C67078k {

        /* renamed from: a */
        public Method f192653a;

        /* renamed from: b */
        public Method f192654b;

        /* renamed from: c */
        public Method f192655c;

        public C67078k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f192653a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f192654b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f192655c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C67079l {
        /* renamed from: a */
        boolean mo91136a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C67080m {
        /* renamed from: a */
        boolean mo91137a(String str);

        /* renamed from: b */
        boolean mo91138b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface C67081n {
        /* renamed from: a */
        boolean mo91139a(int i);

        /* renamed from: b */
        boolean mo91140b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C67082o extends TouchDelegate {

        /* renamed from: a */
        public final View f192656a;

        /* renamed from: b */
        public final Rect f192657b;

        /* renamed from: c */
        public final Rect f192658c;

        /* renamed from: d */
        public final Rect f192659d;

        /* renamed from: e */
        public final int f192660e;

        /* renamed from: f */
        public boolean f192661f;

        public C67082o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f192660e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f192657b = rect3;
            Rect rect4 = new Rect();
            this.f192659d = rect4;
            Rect rect5 = new Rect();
            this.f192658c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i = -scaledTouchSlop;
            rect4.inset(i, i);
            rect5.set(rect2);
            this.f192656a = view;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f192661f
                r7.f192661f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f192661f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f192659d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f192657b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f192661f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0072
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.f192658c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.f192656a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f192656a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006c
            L_0x005f:
                android.graphics.Rect r2 = r7.f192658c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006c:
                android.view.View r0 = r7.f192656a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C67082o.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C103499a();

        /* renamed from: f */
        public boolean f305584f;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        public static class C103499a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f305584f + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f306434d, i);
            parcel.writeValue(Boolean.valueOf(this.f305584f));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f305584f = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public class C103500a implements TextWatcher {
        public C103500a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f305577v.getText();
            searchView.f305563T0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.mo144143y(z);
            boolean z2 = !z;
            int i4 = 8;
            if (searchView.f305559R0 && !searchView.f305564U && z2) {
                searchView.f305541A.setVisibility(8);
                i4 = 0;
            }
            searchView.f305543C.setVisibility(i4);
            searchView.mo144139t();
            searchView.mo144142x();
            searchView.getClass();
            searchView.f305561S0 = charSequence.toString();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public class C103501b implements Runnable {
        public C103501b() {
        }

        public void run() {
            SearchView.this.mo144140v();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public class C103502c implements Runnable {
        public C103502c() {
        }

        public void run() {
            C108041a aVar = SearchView.this.f305566V;
            if (aVar != null && (aVar instanceof C103571z)) {
                aVar.mo144461b((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public class C103503d implements View.OnFocusChangeListener {
        public C103503d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f305558R;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    public class C103504e implements View.OnLayoutChangeListener {
        public C103504e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView searchView = SearchView.this;
            if (searchView.f305544D.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f305579x.getPaddingLeft();
                Rect rect = new Rect();
                boolean a = C103553n0.m137647a(searchView);
                int dimensionPixelSize = searchView.f305562T ? resources.getDimensionPixelSize(C0966R.dimen.f4024o9) + resources.getDimensionPixelSize(C0966R.dimen.f4025o_) : 0;
                searchView.f305577v.getDropDownBackground().getPadding(rect);
                searchView.f305577v.setDropDownHorizontalOffset(a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.f305577v.setDropDownWidth((((searchView.f305544D.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    public class C103505f implements View.OnClickListener {
        public C103505f() {
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r13) {
            /*
                r12 = this;
                androidx.appcompat.widget.SearchView r0 = androidx.appcompat.widget.SearchView.this
                android.widget.ImageView r1 = r0.f305583z
                r2 = 0
                if (r13 != r1) goto L_0x001e
                r0.mo144144z(r2)
                androidx.appcompat.widget.SearchView$SearchAutoComplete r13 = r0.f305577v
                r13.requestFocus()
                androidx.appcompat.widget.SearchView$SearchAutoComplete r13 = r0.f305577v
                r1 = 1
                r13.setImeVisibility(r1)
                android.view.View$OnClickListener r13 = r0.f305560S
                if (r13 == 0) goto L_0x00f6
                r13.onClick(r0)
                goto L_0x00f6
            L_0x001e:
                android.widget.ImageView r1 = r0.f305542B
                if (r13 != r1) goto L_0x0027
                r0.mo144113o()
                goto L_0x00f6
            L_0x0027:
                android.widget.ImageView r1 = r0.f305541A
                if (r13 != r1) goto L_0x0030
                r0.mo144122s()
                goto L_0x00f6
            L_0x0030:
                android.widget.ImageView r1 = r0.f305543C
                if (r13 != r1) goto L_0x00d8
                android.app.SearchableInfo r13 = r0.f305569W0
                if (r13 != 0) goto L_0x003a
                goto L_0x00f6
            L_0x003a:
                boolean r1 = r13.getVoiceSearchLaunchWebSearch()     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                if (r1 == 0) goto L_0x0092
                android.content.Intent r1 = r0.f305554N     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                android.content.Intent r3 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                r3.<init>(r1)     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                android.content.ComponentName r13 = r13.getSearchActivity()     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                if (r13 != 0) goto L_0x004f
                r13 = 0
                goto L_0x0053
            L_0x004f:
                java.lang.String r13 = r13.flattenToShortString()     // Catch:{ ActivityNotFoundException -> 0x00f6 }
            L_0x0053:
                java.lang.String r1 = "calling_package"
                r3.putExtra(r1, r13)     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                android.content.Context r13 = r0.getContext()     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                k20.a r0 = new k20.a     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                r0.<init>()     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                r0.mo10233c(r3)     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                java.lang.Object[] r5 = r0.mo10232b()     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                java.lang.String r6 = "androidx/appcompat/widget/SearchView"
                java.lang.String r7 = "onVoiceClicked"
                java.lang.String r8 = "()V"
                java.lang.String r9 = "Undefined"
                java.lang.String r10 = "startActivity"
                java.lang.String r11 = "(Landroid/content/Intent;)V"
                r4 = r13
                j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                java.lang.Object r0 = r0.mo10231a(r2)     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                r13.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                java.lang.String r5 = "androidx/appcompat/widget/SearchView"
                java.lang.String r6 = "onVoiceClicked"
                java.lang.String r7 = "()V"
                java.lang.String r8 = "Undefined"
                java.lang.String r9 = "startActivity"
                java.lang.String r10 = "(Landroid/content/Intent;)V"
                r4 = r13
                j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                goto L_0x00f6
            L_0x0092:
                boolean r1 = r13.getVoiceSearchLaunchRecognizer()     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                if (r1 == 0) goto L_0x00f6
                android.content.Intent r1 = r0.f305555P     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                android.content.Intent r13 = r0.mo144111m(r1, r13)     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                android.content.Context r0 = r0.getContext()     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                k20.a r1 = new k20.a     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                r1.<init>()     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                r1.mo10233c(r13)     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                java.lang.Object[] r4 = r1.mo10232b()     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                java.lang.String r5 = "androidx/appcompat/widget/SearchView"
                java.lang.String r6 = "onVoiceClicked"
                java.lang.String r7 = "()V"
                java.lang.String r8 = "Undefined"
                java.lang.String r9 = "startActivity"
                java.lang.String r10 = "(Landroid/content/Intent;)V"
                r3 = r0
                j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                java.lang.Object r13 = r1.mo10231a(r2)     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                android.content.Intent r13 = (android.content.Intent) r13     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                r0.startActivity(r13)     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                java.lang.String r4 = "androidx/appcompat/widget/SearchView"
                java.lang.String r5 = "onVoiceClicked"
                java.lang.String r6 = "()V"
                java.lang.String r7 = "Undefined"
                java.lang.String r8 = "startActivity"
                java.lang.String r9 = "(Landroid/content/Intent;)V"
                r3 = r0
                j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ ActivityNotFoundException -> 0x00f6 }
                goto L_0x00f6
            L_0x00d8:
                androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r0.f305577v
                if (r13 != r1) goto L_0x00f6
                androidx.appcompat.widget.SearchView$k r13 = androidx.appcompat.widget.SearchView.f305540d1
                java.lang.reflect.Method r13 = r13.f192653a
                if (r13 == 0) goto L_0x00e9
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00e8 }
                r13.invoke(r1, r3)     // Catch:{ Exception -> 0x00e8 }
                goto L_0x00e9
            L_0x00e8:
            L_0x00e9:
                androidx.appcompat.widget.SearchView$k r13 = androidx.appcompat.widget.SearchView.f305540d1
                androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.f305577v
                java.lang.reflect.Method r13 = r13.f192654b
                if (r13 == 0) goto L_0x00f6
                java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{  }
                r13.invoke(r0, r1)     // Catch:{  }
            L_0x00f6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C103505f.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    public class C103506g implements View.OnKeyListener {
        public C103506g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f305569W0 == null) {
                return false;
            }
            if (!searchView.f305577v.isPopupShowing() || SearchView.this.f305577v.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(SearchView.this.f305577v.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.mo144112n(0, (String) null, searchView2.f305577v.getText().toString());
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.f305569W0 == null || searchView3.f305566V == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i == 66 || i == 84 || i == 61) {
                return searchView3.mo144118p(searchView3.f305577v.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                searchView3.f305577v.setSelection(i == 21 ? 0 : searchView3.f305577v.length());
                searchView3.f305577v.setListSelection(0);
                searchView3.f305577v.clearListSelection();
                C67078k kVar = SearchView.f305540d1;
                SearchAutoComplete searchAutoComplete = searchView3.f305577v;
                Method method = kVar.f192655c;
                if (method != null) {
                    try {
                        method.invoke(searchAutoComplete, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
                return true;
            } else if (i != 19) {
                return false;
            } else {
                searchView3.f305577v.getListSelection();
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    public class C103507h implements TextView.OnEditorActionListener {
        public C103507h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo144122s();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    public class C103508i implements AdapterView.OnItemClickListener {
        public C103508i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo144118p(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    public class C103509j implements AdapterView.OnItemSelectedListener {
        public C103509j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo144119q(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4034ol);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4035om);
    }

    private void setQuery(CharSequence charSequence) {
        this.f305577v.setText(charSequence);
        this.f305577v.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: a */
    public void mo144099a() {
        this.f305577v.setText("");
        SearchAutoComplete searchAutoComplete = this.f305577v;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f305563T0 = "";
        clearFocus();
        mo144144z(true);
        this.f305577v.setImeOptions(this.f305567V0);
        this.f305565U0 = false;
    }

    /* renamed from: b */
    public void mo144100b() {
        if (!this.f305565U0) {
            this.f305565U0 = true;
            int imeOptions = this.f305577v.getImeOptions();
            this.f305567V0 = imeOptions;
            this.f305577v.setImeOptions(imeOptions | TPMediaCodecProfileLevel.HEVCHighTierLevel62);
            this.f305577v.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f305582y0 = true;
        super.clearFocus();
        this.f305577v.clearFocus();
        this.f305577v.setImeVisibility(false);
        this.f305582y0 = false;
    }

    public int getImeOptions() {
        return this.f305577v.getImeOptions();
    }

    public int getInputType() {
        return this.f305577v.getInputType();
    }

    public int getMaxWidth() {
        return this.f305557Q0;
    }

    public CharSequence getQuery() {
        return this.f305577v.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f305576p0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f305569W0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f305556Q : getContext().getText(this.f305569W0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f305553M;
    }

    public int getSuggestionRowLayout() {
        return this.f305552L;
    }

    public C108041a getSuggestionsAdapter() {
        return this.f305566V;
    }

    /* renamed from: l */
    public final Intent mo144110l(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f305563T0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f305570X0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f305569W0.getSearchActivity());
        return intent;
    }

    /* renamed from: m */
    public final Intent mo144111m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f305570X0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: n */
    public void mo144112n(int i, String str, String str2) {
        Intent l = mo144110l("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str);
        Context context = getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(l);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "androidx/appcompat/widget/SearchView", "launchQuerySearch", "(ILjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "androidx/appcompat/widget/SearchView", "launchQuerySearch", "(ILjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: o */
    public void mo144113o() {
        if (!TextUtils.isEmpty(this.f305577v.getText())) {
            this.f305577v.setText("");
            this.f305577v.requestFocus();
            this.f305577v.setImeVisibility(true);
        } else if (this.f305562T) {
            clearFocus();
            mo144144z(true);
        }
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f305571Y0);
        post(this.f305572Z0);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f305577v;
            Rect rect = this.f305546F;
            searchAutoComplete.getLocationInWindow(this.f305548H);
            getLocationInWindow(this.f305549I);
            int[] iArr = this.f305548H;
            int i5 = iArr[1];
            int[] iArr2 = this.f305549I;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.f305547G;
            Rect rect3 = this.f305546F;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            C67082o oVar = this.f305545E;
            if (oVar == null) {
                C67082o oVar2 = new C67082o(this.f305547G, this.f305546F, this.f305577v);
                this.f305545E = oVar2;
                setTouchDelegate(oVar2);
                return;
            }
            Rect rect4 = this.f305547G;
            Rect rect5 = this.f305546F;
            oVar.f192657b.set(rect4);
            oVar.f192659d.set(rect4);
            Rect rect6 = oVar.f192659d;
            int i8 = -oVar.f192660e;
            rect6.inset(i8, i8);
            oVar.f192658c.set(rect5);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f305564U) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f305557Q0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f305557Q0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f305557Q0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f306434d);
        mo144144z(savedState.f305584f);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f305584f = this.f305564U;
        return savedState;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f305571Y0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r12.getPosition();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0084 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo144118p(int r10, int r11, java.lang.String r12) {
        /*
            r9 = this;
            r11 = 0
            r5 = 0
            r6 = 0
            h3.a r12 = r9.f305566V
            android.database.Cursor r12 = r12.f323543f
            if (r12 == 0) goto L_0x00c9
            boolean r10 = r12.moveToPosition(r10)
            if (r10 == 0) goto L_0x00c9
            r10 = 0
            java.lang.String r0 = "suggest_intent_action"
            int r1 = androidx.appcompat.widget.C103571z.f305864E     // Catch:{ RuntimeException -> 0x0084 }
            int r0 = r12.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x0084 }
            java.lang.String r0 = androidx.appcompat.widget.C103571z.m137689j(r12, r0)     // Catch:{ RuntimeException -> 0x0084 }
            if (r0 != 0) goto L_0x0024
            android.app.SearchableInfo r0 = r9.f305569W0     // Catch:{ RuntimeException -> 0x0084 }
            java.lang.String r0 = r0.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x0084 }
        L_0x0024:
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "android.intent.action.SEARCH"
        L_0x0028:
            r1 = r0
            java.lang.String r0 = "suggest_intent_data"
            int r0 = r12.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x0084 }
            java.lang.String r0 = androidx.appcompat.widget.C103571z.m137689j(r12, r0)     // Catch:{ RuntimeException -> 0x0084 }
            if (r0 != 0) goto L_0x003b
            android.app.SearchableInfo r0 = r9.f305569W0     // Catch:{ RuntimeException -> 0x0084 }
            java.lang.String r0 = r0.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x0084 }
        L_0x003b:
            if (r0 == 0) goto L_0x0061
            java.lang.String r2 = "suggest_intent_data_id"
            int r2 = r12.getColumnIndex(r2)     // Catch:{ RuntimeException -> 0x0084 }
            java.lang.String r2 = androidx.appcompat.widget.C103571z.m137689j(r12, r2)     // Catch:{ RuntimeException -> 0x0084 }
            if (r2 == 0) goto L_0x0061
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0084 }
            r3.<init>()     // Catch:{ RuntimeException -> 0x0084 }
            r3.append(r0)     // Catch:{ RuntimeException -> 0x0084 }
            java.lang.String r0 = "/"
            r3.append(r0)     // Catch:{ RuntimeException -> 0x0084 }
            java.lang.String r0 = android.net.Uri.encode(r2)     // Catch:{ RuntimeException -> 0x0084 }
            r3.append(r0)     // Catch:{ RuntimeException -> 0x0084 }
            java.lang.String r0 = r3.toString()     // Catch:{ RuntimeException -> 0x0084 }
        L_0x0061:
            if (r0 != 0) goto L_0x0065
            r2 = r10
            goto L_0x006a
        L_0x0065:
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ RuntimeException -> 0x0084 }
            r2 = r0
        L_0x006a:
            java.lang.String r0 = "suggest_intent_query"
            int r0 = r12.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x0084 }
            java.lang.String r4 = androidx.appcompat.widget.C103571z.m137689j(r12, r0)     // Catch:{ RuntimeException -> 0x0084 }
            java.lang.String r0 = "suggest_intent_extra_data"
            int r0 = r12.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x0084 }
            java.lang.String r3 = androidx.appcompat.widget.C103571z.m137689j(r12, r0)     // Catch:{ RuntimeException -> 0x0084 }
            r0 = r9
            android.content.Intent r10 = r0.mo144110l(r1, r2, r3, r4, r5, r6)     // Catch:{ RuntimeException -> 0x0084 }
            goto L_0x0089
        L_0x0084:
            r12.getPosition()     // Catch:{ RuntimeException -> 0x0088 }
            goto L_0x0089
        L_0x0088:
        L_0x0089:
            if (r10 != 0) goto L_0x008c
            goto L_0x00c9
        L_0x008c:
            android.content.Context r12 = r9.getContext()     // Catch:{ RuntimeException -> 0x00c6 }
            k20.a r8 = new k20.a     // Catch:{ RuntimeException -> 0x00c6 }
            r8.<init>()     // Catch:{ RuntimeException -> 0x00c6 }
            r8.mo10233c(r10)     // Catch:{ RuntimeException -> 0x00c6 }
            java.lang.Object[] r1 = r8.mo10232b()     // Catch:{ RuntimeException -> 0x00c6 }
            java.lang.String r2 = "androidx/appcompat/widget/SearchView"
            java.lang.String r3 = "launchIntent"
            java.lang.String r4 = "(Landroid/content/Intent;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r12
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ RuntimeException -> 0x00c6 }
            java.lang.Object r0 = r8.mo10231a(r11)     // Catch:{ RuntimeException -> 0x00c6 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ RuntimeException -> 0x00c6 }
            r12.startActivity(r0)     // Catch:{ RuntimeException -> 0x00c6 }
            java.lang.String r1 = "androidx/appcompat/widget/SearchView"
            java.lang.String r2 = "launchIntent"
            java.lang.String r3 = "(Landroid/content/Intent;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r12
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ RuntimeException -> 0x00c6 }
            goto L_0x00c9
        L_0x00c6:
            r10.toString()
        L_0x00c9:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r10 = r9.f305577v
            r10.setImeVisibility(r11)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r10 = r9.f305577v
            r10.dismissDropDown()
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.mo144118p(int, int, java.lang.String):boolean");
    }

    /* renamed from: q */
    public boolean mo144119q(int i) {
        Editable text = this.f305577v.getText();
        Cursor cursor = this.f305566V.f323543f;
        if (cursor == null) {
            return true;
        }
        if (cursor.moveToPosition(i)) {
            CharSequence d = this.f305566V.mo144462d(cursor);
            if (d != null) {
                setQuery(d);
                return true;
            }
            setQuery(text);
            return true;
        }
        setQuery(text);
        return true;
    }

    /* renamed from: r */
    public void mo144120r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f305582y0 || !isFocusable()) {
            return false;
        }
        if (this.f305564U) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f305577v.requestFocus(i, rect);
        if (requestFocus) {
            mo144144z(false);
        }
        return requestFocus;
    }

    /* renamed from: s */
    public void mo144122s() {
        Editable text = this.f305577v.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f305569W0 != null) {
                mo144112n(0, (String) null, text.toString());
            }
            this.f305577v.setImeVisibility(false);
            this.f305577v.dismissDropDown();
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f305570X0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo144113o();
            return;
        }
        mo144144z(false);
        this.f305577v.requestFocus();
        this.f305577v.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f305560S;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f305562T != z) {
            this.f305562T = z;
            mo144144z(z);
            mo144141w();
        }
    }

    public void setImeOptions(int i) {
        this.f305577v.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f305577v.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f305557Q0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C67079l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f305558R = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C67080m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f305560S = onClickListener;
    }

    public void setOnSuggestionListener(C67081n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f305576p0 = charSequence;
        mo144141w();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f305580x0 = z;
        C108041a aVar = this.f305566V;
        if (aVar instanceof C103571z) {
            ((C103571z) aVar).f305874w = z ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f305569W0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f305577v
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f305577v
            android.app.SearchableInfo r3 = r6.f305569W0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f305569W0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f305569W0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f305577v
            r3.setInputType(r7)
            h3.a r7 = r6.f305566V
            if (r7 == 0) goto L_0x0042
            r7.mo144461b(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.f305569W0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            androidx.appcompat.widget.z r7 = new androidx.appcompat.widget.z
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f305569W0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f305573a1
            r7.<init>(r3, r6, r4, r5)
            r6.f305566V = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f305577v
            r3.setAdapter(r7)
            h3.a r7 = r6.f305566V
            androidx.appcompat.widget.z r7 = (androidx.appcompat.widget.C103571z) r7
            boolean r3 = r6.f305580x0
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = 1
        L_0x0069:
            r7.f305874w = r3
        L_0x006b:
            r6.mo144141w()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.f305569W0
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.f305569W0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.f305554N
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.f305569W0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.f305555P
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            r6.f305559R0 = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f305577v
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.f305564U
            r6.mo144144z(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f305568W = z;
        mo144144z(this.f305564U);
    }

    public void setSuggestionsAdapter(C108041a aVar) {
        this.f305566V = aVar;
        this.f305577v.setAdapter(aVar);
    }

    /* renamed from: t */
    public final void mo144139t() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f305577v.getText());
        int i = 0;
        if (!z2 && (!this.f305562T || this.f305565U0)) {
            z = false;
        }
        ImageView imageView = this.f305542B;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f305542B.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: v */
    public void mo144140v() {
        int[] iArr = this.f305577v.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f305579x.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f305581y.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: w */
    public final void mo144141w() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f305577v;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.f305562T && this.f305551K != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.f305551K.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f305551K), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: x */
    public final void mo144142x() {
        int i = (!((this.f305568W || this.f305559R0) && !this.f305564U) || !(this.f305541A.getVisibility() == 0 || this.f305543C.getVisibility() == 0)) ? 8 : 0;
        View view = this.f305581y;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "androidx/appcompat/widget/SearchView", "updateSubmitArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "androidx/appcompat/widget/SearchView", "updateSubmitArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.f305559R0 == false) goto L_0x0023;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo144143y(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f305568W
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.f305559R0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.f305564U
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.f305559R0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.f305541A
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.mo144143y(boolean):void");
    }

    /* renamed from: z */
    public final void mo144144z(boolean z) {
        this.f305564U = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f305577v.getText());
        this.f305583z.setVisibility(i2);
        mo144143y(z2);
        View view = this.f305578w;
        int i3 = z ? 8 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i3));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "androidx/appcompat/widget/SearchView", "updateViewsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "androidx/appcompat/widget/SearchView", "updateViewsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f305550J.setVisibility((this.f305550J.getDrawable() == null || this.f305562T) ? 8 : 0);
        mo144139t();
        boolean z3 = !z2;
        if (this.f305559R0 && !this.f305564U && z3) {
            this.f305541A.setVisibility(8);
            i = 0;
        }
        this.f305543C.setVisibility(i);
        mo144142x();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.a0j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        this.f305546F = new Rect();
        this.f305547G = new Rect();
        this.f305548H = new int[2];
        this.f305549I = new int[2];
        this.f305571Y0 = new C103501b();
        this.f305572Z0 = new C103502c();
        this.f305573a1 = new WeakHashMap<>();
        C103505f fVar = new C103505f();
        this.f305574b1 = new C103506g();
        C103507h hVar = new C103507h();
        C103508i iVar = new C103508i();
        C103509j jVar = new C103509j();
        this.f305575c1 = new C103500a();
        C103533f0 f0Var = new C103533f0(context2, context2.obtainStyledAttributes(attributeSet, C107593a.f321925y, i, 0));
        LayoutInflater.from(context).inflate(f0Var.mo144340i(9, C0966R.C0971layout.f6294aw), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C0966R.C0970id.j6z);
        this.f305577v = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f305578w = findViewById(C0966R.C0970id.j5e);
        View findViewById = findViewById(C0966R.C0970id.j6o);
        this.f305579x = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.k9v);
        this.f305581y = findViewById2;
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.j4w);
        this.f305583z = imageView;
        ImageView imageView2 = (ImageView) findViewById(C0966R.C0970id.j5l);
        this.f305541A = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C0966R.C0970id.f359134j52);
        this.f305542B = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C0966R.C0970id.j76);
        this.f305543C = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C0966R.C0970id.j6b);
        this.f305550J = imageView5;
        Drawable e = f0Var.mo144336e(10);
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145189q(findViewById, e);
        C107207u.C107208b.m145189q(findViewById2, f0Var.mo144336e(14));
        imageView.setImageDrawable(f0Var.mo144336e(13));
        imageView2.setImageDrawable(f0Var.mo144336e(7));
        imageView3.setImageDrawable(f0Var.mo144336e(4));
        imageView4.setImageDrawable(f0Var.mo144336e(16));
        imageView5.setImageDrawable(f0Var.mo144336e(13));
        this.f305551K = f0Var.mo144336e(12);
        C103542j0.m137612a(imageView, getResources().getString(C0966R.string.f7342dd));
        this.f305552L = f0Var.mo144340i(15, C0966R.C0971layout.f6293av);
        this.f305553M = f0Var.mo144340i(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f305575c1);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f305574b1);
        searchAutoComplete.setOnFocusChangeListener(new C103503d());
        setIconifiedByDefault(f0Var.mo144332a(8, true));
        int d = f0Var.mo144335d(1, -1);
        if (d != -1) {
            setMaxWidth(d);
        }
        this.f305556Q = f0Var.mo144341j(6);
        this.f305576p0 = f0Var.mo144341j(11);
        int h = f0Var.mo144339h(3, -1);
        if (h != -1) {
            setImeOptions(h);
        }
        int h2 = f0Var.mo144339h(2, -1);
        if (h2 != -1) {
            setInputType(h2);
        }
        setFocusable(f0Var.mo144332a(0, true));
        f0Var.mo144343m();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f305554N = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f305555P = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f305544D = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C103504e());
        }
        mo144144z(this.f305562T);
        mo144141w();
    }
}
