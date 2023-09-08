package com.tencent.p014mm.wallet_core.p137ui.formview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.wallet.WalletIconImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tenpay.android.wechat.TenpaySecureEditText;
import gr3.C76040e;
import gr3.C76043g;
import gr3.C76044h;
import gr3.C76045i;
import gr3.C76046j;
import gr3.C76047k;
import gr3.C76048l;
import hr3.C76240a;
import hr3.C76241b;
import j20.C117292a;
import java.util.ArrayList;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import ph3.C77087a;
import tb3.C77881d;
import wq3.C111847h;

/* renamed from: com.tencent.mm.wallet_core.ui.formview.WalletFormView */
public final class WalletFormView extends LinearLayout implements View.OnFocusChangeListener, C111847h {

    /* renamed from: A */
    public String f221260A;

    /* renamed from: B */
    public int f221261B;

    /* renamed from: C */
    public int f221262C;

    /* renamed from: D */
    public String f221263D;

    /* renamed from: E */
    public int f221264E;

    /* renamed from: F */
    public int f221265F;

    /* renamed from: G */
    public int f221266G;

    /* renamed from: H */
    public String f221267H;

    /* renamed from: I */
    public int f221268I;

    /* renamed from: J */
    public int f221269J;

    /* renamed from: K */
    public int f221270K;

    /* renamed from: L */
    public int f221271L;

    /* renamed from: M */
    public boolean f221272M;

    /* renamed from: N */
    public boolean f221273N;

    /* renamed from: P */
    public boolean f221274P;

    /* renamed from: Q */
    public boolean f221275Q;

    /* renamed from: R */
    public int f221276R;

    /* renamed from: S */
    public int f221277S;

    /* renamed from: T */
    public int f221278T;
    @Deprecated

    /* renamed from: U */
    public int f221279U;

    /* renamed from: V */
    public int f221280V;

    /* renamed from: W */
    public int f221281W;

    /* renamed from: d */
    public C75211e f221282d;

    /* renamed from: e */
    public TextView f221283e;

    /* renamed from: f */
    public TextView f221284f;

    /* renamed from: g */
    public TenpaySecureEditText f221285g;

    /* renamed from: h */
    public WalletIconImageView f221286h;

    /* renamed from: i */
    public TextView f221287i;

    /* renamed from: j */
    public C75209c f221288j;

    /* renamed from: n */
    public View.OnFocusChangeListener f221289n;

    /* renamed from: o */
    public View.OnClickListener f221290o;

    /* renamed from: p */
    public C76241b f221291p;

    /* renamed from: p0 */
    public int f221292p0;

    /* renamed from: q */
    public int f221293q;

    /* renamed from: r */
    public int f221294r;

    /* renamed from: s */
    public int f221295s;

    /* renamed from: t */
    public String f221296t;

    /* renamed from: u */
    public int f221297u;

    /* renamed from: v */
    public String f221298v;

    /* renamed from: w */
    public int f221299w;

    /* renamed from: x */
    public int f221300x;

    /* renamed from: y */
    public int f221301y;

    /* renamed from: z */
    public int f221302z;

    /* renamed from: com.tencent.mm.wallet_core.ui.formview.WalletFormView$a */
    public class C75207a implements View.OnClickListener {
        public C75207a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/wallet_core/ui/formview/WalletFormView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletFormView.this.mo105071c();
            C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/formview/WalletFormView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.formview.WalletFormView$b */
    public class C75208b implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ int f221304d;

        /* renamed from: e */
        public final /* synthetic */ int f221305e;

        public C75208b(int i, int i2) {
            this.f221304d = i;
            this.f221305e = i2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r9) {
            /*
                r8 = this;
                java.lang.String r9 = r9.toString()
                java.lang.String r0 = "."
                int r1 = r9.indexOf(r0)
                int r2 = r9.length()
                if (r1 < 0) goto L_0x0020
                int r3 = r1 + 1
                int r0 = r9.indexOf(r0, r3)
                if (r0 < 0) goto L_0x0020
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView.this
                com.tenpay.android.wechat.TenpaySecureEditText r1 = r1.f221285g
                com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView.m90177f(r1, r9, r0, r2)
                return
            L_0x0020:
                int r0 = r8.f221304d
                r3 = 1
                if (r0 < 0) goto L_0x0033
                if (r1 < 0) goto L_0x0033
                int r4 = r2 - r1
                if (r4 <= r0) goto L_0x0033
                int r0 = r0 + r1
                int r0 = r0 + r3
                java.lang.String r0 = com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView.m90179h(r9, r0, r2)
                r4 = 1
                goto L_0x0036
            L_0x0033:
                r0 = 0
                r0 = r9
                r4 = 0
            L_0x0036:
                int r5 = r8.f221305e
                if (r5 < 0) goto L_0x0076
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r5 = com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView.this
                com.tenpay.android.wechat.TenpaySecureEditText r5 = r5.f221285g
                int r5 = r5.getSelectionStart()
                int r6 = r8.f221305e
                r7 = -1
                if (r1 <= r6) goto L_0x0060
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r5, (int) r7)
                if (r2 != 0) goto L_0x0076
                int r2 = r8.f221305e
                int r2 = r1 - r2
                if (r2 <= 0) goto L_0x0076
                int r2 = r5 - r2
                if (r2 < 0) goto L_0x0076
                int r1 = r1 + -7
                int r1 = r5 - r1
                java.lang.String r0 = com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView.m90179h(r0, r1, r5)
                goto L_0x0077
            L_0x0060:
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r1, (int) r7)
                if (r1 == 0) goto L_0x0076
                int r1 = r8.f221305e
                if (r2 <= r1) goto L_0x0076
                if (r5 < 0) goto L_0x0076
                int r2 = r2 - r1
                int r1 = r5 - r2
                if (r1 < 0) goto L_0x0076
                java.lang.String r0 = com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView.m90179h(r0, r1, r5)
                goto L_0x0077
            L_0x0076:
                r3 = r4
            L_0x0077:
                if (r3 == 0) goto L_0x008f
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView.this
                com.tenpay.android.wechat.TenpaySecureEditText r1 = r1.f221285g
                if (r1 != 0) goto L_0x0080
                goto L_0x008f
            L_0x0080:
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r9, (java.lang.String) r0)
                if (r9 == 0) goto L_0x0087
                goto L_0x008f
            L_0x0087:
                gr3.h r9 = new gr3.h
                r9.<init>(r1, r0)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r9)
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView.C75208b.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.formview.WalletFormView$c */
    public interface C75209c {
        void onInputValidChange(boolean z);
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.formview.WalletFormView$d */
    public interface C75210d extends C75209c {
        /* renamed from: Z5 */
        void mo105141Z5(boolean z);
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.formview.WalletFormView$e */
    public interface C75211e {
        /* renamed from: a */
        void mo93874a(CharSequence charSequence);
    }

    public WalletFormView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f221283e = null;
        this.f221284f = null;
        this.f221285g = null;
        this.f221286h = null;
        this.f221287i = null;
        this.f221288j = null;
        this.f221289n = null;
        this.f221290o = null;
        this.f221291p = null;
        this.f221293q = -1;
        this.f221294r = -1;
        this.f221295s = 100;
        this.f221296t = "";
        boolean z = false;
        this.f221297u = 0;
        this.f221298v = "";
        this.f221299w = 8;
        this.f221300x = -1;
        this.f221301y = -1;
        this.f221302z = 4;
        this.f221260A = "";
        this.f221261B = 8;
        this.f221263D = "";
        this.f221264E = -1;
        this.f221265F = 19;
        this.f221266G = C0966R.color.a7f;
        this.f221267H = "";
        this.f221268I = 0;
        this.f221269J = Integer.MAX_VALUE;
        this.f221270K = 1;
        this.f221271L = C0966R.C0969drawable.ags;
        this.f221272M = true;
        this.f221273N = false;
        this.f221274P = true;
        this.f221275Q = false;
        this.f221276R = 1;
        this.f221277S = 5;
        this.f221278T = C0966R.color.a1i;
        this.f221279U = 0;
        this.f221280V = 0;
        this.f221281W = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77881d.f226913g, i, 0);
        this.f221293q = obtainStyledAttributes.getResourceId(23, this.f221293q);
        int resourceId = obtainStyledAttributes.getResourceId(30, 0);
        if (resourceId != 0) {
            this.f221296t = context.getString(resourceId);
        }
        this.f221262C = obtainStyledAttributes.getDimensionPixelSize(32, -1);
        this.f221300x = obtainStyledAttributes.getResourceId(20, this.f221300x);
        this.f221301y = obtainStyledAttributes.getColor(19, this.f221301y);
        int resourceId2 = obtainStyledAttributes.getResourceId(28, 0);
        if (resourceId2 != 0) {
            this.f221260A = context.getString(resourceId2);
        }
        this.f221302z = obtainStyledAttributes.getInteger(21, this.f221302z);
        this.f221297u = obtainStyledAttributes.getInteger(31, this.f221297u);
        this.f221261B = obtainStyledAttributes.getInteger(29, this.f221261B);
        this.f221299w = obtainStyledAttributes.getInteger(27, this.f221299w);
        int resourceId3 = obtainStyledAttributes.getResourceId(25, 0);
        if (resourceId3 != 0) {
            this.f221298v = context.getString(resourceId3);
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(11, 0);
        if (resourceId4 != 0) {
            this.f221263D = context.getString(resourceId4);
        }
        this.f221264E = obtainStyledAttributes.getDimensionPixelSize(12, -1);
        this.f221265F = obtainStyledAttributes.getInteger(10, this.f221265F);
        this.f221266G = obtainStyledAttributes.getColor(17, this.f221266G);
        int resourceId5 = obtainStyledAttributes.getResourceId(16, 0);
        if (resourceId5 != 0) {
            this.f221267H = context.getString(resourceId5);
        }
        this.f221268I = obtainStyledAttributes.getInt(9, this.f221268I);
        this.f221269J = obtainStyledAttributes.getInteger(14, this.f221269J);
        this.f221270K = obtainStyledAttributes.getInteger(15, this.f221270K);
        this.f221271L = obtainStyledAttributes.getResourceId(5, this.f221271L);
        this.f221272M = obtainStyledAttributes.getBoolean(7, this.f221272M);
        this.f221273N = obtainStyledAttributes.getBoolean(6, this.f221273N);
        this.f221274P = obtainStyledAttributes.getBoolean(7, this.f221274P);
        this.f221276R = obtainStyledAttributes.getInteger(0, this.f221276R);
        this.f221277S = obtainStyledAttributes.getInteger(1, this.f221277S);
        this.f221295s = obtainStyledAttributes.getInteger(18, this.f221295s);
        this.f221278T = obtainStyledAttributes.getInteger(13, this.f221278T);
        this.f221294r = obtainStyledAttributes.getResourceId(24, this.f221294r);
        this.f221279U = obtainStyledAttributes.getInteger(33, 0);
        int integer = obtainStyledAttributes.getInteger(34, -1);
        this.f221280V = integer;
        if (this.f221279U == 1 && integer == -1) {
            this.f221280V = 4;
        }
        this.f221281W = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
        Assert.assertTrue(this.f221293q > 0 ? true : z);
        setOrientation(1);
        if (Util.isNullOrNil(this.f221296t) || this.f221296t.length() <= 6) {
            View.inflate(context, this.f221293q, this);
        } else {
            View.inflate(context, this.f221294r, this);
        }
        this.f221283e = (TextView) findViewById(C0966R.C0970id.ljn);
        this.f221284f = (TextView) findViewById(C0966R.C0970id.lj4);
        this.f221285g = (TenpaySecureEditText) findViewById(C0966R.C0970id.lg_);
        this.f221286h = (WalletIconImageView) findViewById(C0966R.C0970id.f359550lh1);
        this.f221287i = (TextView) findViewById(C0966R.C0970id.ljm);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.lh8);
        TextView textView = (TextView) findViewById(C0966R.C0970id.lha);
    }

    /* renamed from: e */
    public static boolean m90176e(String str, EditText editText) {
        if (!(str == null || editText == null)) {
            int i = 0;
            int i2 = -1;
            while (i < str.length() && '0' == str.charAt(i)) {
                i2 = i;
                i++;
            }
            if (i2 == 0 && str.length() > 1) {
                int i3 = i2 + 1;
                if (str.charAt(i3) != '.') {
                    m90177f(editText, str, 0, i3);
                    return true;
                }
            }
            if (i2 > 0) {
                int i4 = i2 + 1;
                if (str.length() == i4) {
                    m90177f(editText, str, 0, i2);
                } else if (str.charAt(i4) == '.') {
                    m90177f(editText, str, 0, i2);
                } else {
                    m90177f(editText, str, 0, i4);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static void m90177f(EditText editText, String str, int i, int i2) {
        if (editText != null) {
            String h = m90179h(str, i, i2);
            if (!Util.isEqual(str, h)) {
                MMHandlerThread.postToMainThread(new C76044h(editText, h));
            }
        }
    }

    /* renamed from: g */
    public static void m90178g(EditText editText, String str, int i, int i2) {
        if (editText != null) {
            String h = m90179h(str, i, i2);
            if (!Util.isEqual(str, h)) {
                int selectionStart = editText.getSelectionStart();
                int selectionEnd = editText.getSelectionEnd();
                if (Util.isNullOrNil(h)) {
                    editText.setText("");
                    return;
                }
                editText.setText(h);
                if (selectionStart > h.length()) {
                    selectionStart = h.length();
                }
                if (selectionEnd > h.length()) {
                    selectionEnd = h.length();
                }
                editText.setSelection(selectionStart, selectionEnd);
            }
        }
    }

    /* renamed from: h */
    public static String m90179h(String str, int i, int i2) {
        if (str == null) {
            return "";
        }
        if (i >= str.length() || i < 0) {
            return str;
        }
        if (i2 >= str.length()) {
            return str.substring(0, i);
        }
        String substring = str.substring(0, i);
        String substring2 = str.substring(i2, str.length());
        return Util.nullAs(substring, "") + Util.nullAs(substring2, "");
    }

    /* renamed from: a */
    public void mo105069a(TextWatcher textWatcher) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.addTextChangedListener(textWatcher);
        }
    }

    /* renamed from: b */
    public boolean mo105070b(View view) {
        if (getVisibility() != 0) {
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return true;
        } else if (Util.isNullOrNil(getText())) {
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(4);
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView = this.f221283e;
            if (textView != null) {
                textView.setEnabled(true);
            }
            return false;
        } else if (mo105094l()) {
            if (view != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(4);
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView2 = this.f221283e;
            if (textView2 != null) {
                textView2.setEnabled(true);
            }
            return true;
        } else {
            if (view != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView3 = this.f221283e;
            if (textView3 != null) {
                textView3.setEnabled(false);
            }
            return false;
        }
    }

    /* renamed from: c */
    public void mo105071c() {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.ClearInput();
        }
    }

    /* renamed from: d */
    public void mo105072d() {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.clearFocus();
        }
    }

    public EditText getContentEt() {
        return this.f221285g;
    }

    public int getEncrptType() {
        return this.f221295s;
    }

    public C76240a getEventDelegate() {
        return null;
    }

    public String getHint() {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        return tenpaySecureEditText != null ? tenpaySecureEditText.getHint().toString() : "";
    }

    public WalletIconImageView getInfoIv() {
        return this.f221286h;
    }

    public int getInputLength() {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            return tenpaySecureEditText.getInputLength();
        }
        return 0;
    }

    public C75209c getInputValidChangeListener() {
        return this.f221288j;
    }

    public KeyListener getKeyListener() {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            return tenpaySecureEditText.getKeyListener();
        }
        Log.m105928w("MicroMsg.WalletFormView", "hy: no content et");
        return null;
    }

    public C76241b getLogicDelegate() {
        return this.f221291p;
    }

    public String getMD5Value() {
        String nullAsNil = Util.nullAsNil(this.f221285g.getText().toString());
        C76241b bVar = this.f221291p;
        if (bVar != null && bVar.mo99318b()) {
            nullAsNil = this.f221291p.mo99321e(this, nullAsNil);
        }
        return MD5Util.getMD5String(nullAsNil);
    }

    public int getMaxInputLength() {
        return this.f221269J;
    }

    public int getMinInputLength() {
        return this.f221270K;
    }

    public TextView getPrefilledTv() {
        return this.f221284f;
    }

    public int getSelectionStart() {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            return tenpaySecureEditText.getSelectionStart();
        }
        return -1;
    }

    public String getText() {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            String a = C76043g.m91346a(this.f221295s, tenpaySecureEditText, 0, "", "");
            C76241b bVar = this.f221291p;
            return (bVar == null || !bVar.mo99318b()) ? a : this.f221291p.mo99321e(this, a);
        }
        Log.m105920e("MicroMsg.WalletFormView", "hy: no content et. return nil");
        return "";
    }

    public TextView getTipsTv() {
        return this.f221287i;
    }

    public float getTitleMeasuredWidth() {
        return this.f221283e.getPaint().measureText(this.f221283e.getText(), 0, this.f221283e.getText().length());
    }

    public TextView getTitleTv() {
        return this.f221283e;
    }

    /* renamed from: i */
    public int mo105091i(CharSequence charSequence, int i, int i2) {
        if (this.f221292p0 == 0) {
            int left = (this.f221285g.getLeft() - this.f221283e.getLeft()) + this.f221285g.getPaddingLeft();
            this.f221292p0 = left;
            Log.m105919d("MicroMsg.WalletFormView", "mMaxUnitLeftOriginWidth:%s", Integer.valueOf(left));
        }
        if (Util.isEqual(charSequence.toString(), "")) {
            return 0;
        }
        return (int) ((((float) this.f221292p0) + ((i2 == 1 ? this.f221285g.getPaint().measureText("1") : this.f221285g.getPaint().measureText("2")) / 2.0f)) - ((float) (i / 2)));
    }

    /* renamed from: j */
    public final void mo105092j() {
        if (getTitleTv() != null) {
            getTitleTv().setText(this.f221296t);
            getTitleTv().setVisibility(this.f221297u);
            setTitleWidth(this.f221262C);
        }
    }

    /* renamed from: k */
    public boolean mo105093k(View view, MotionEvent motionEvent) {
        if (view != null && view.getVisibility() == 0) {
            Rect rect = new Rect();
            view.getHitRect(rect);
            if (view == this.f221286h) {
                rect.left -= 50;
                rect.right += 50;
                rect.top -= 25;
                rect.bottom += 25;
            }
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo105094l() {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            int inputLength = tenpaySecureEditText.getInputLength();
            if (inputLength > this.f221269J || inputLength < this.f221270K) {
                return false;
            }
            C76241b bVar = this.f221291p;
            if (bVar != null) {
                return bVar.mo99320d(this);
            }
            return true;
        }
        Log.m105920e("MicroMsg.WalletFormView", "hy: no content edit text. true as default");
        return true;
    }

    /* renamed from: m */
    public void mo105095m() {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setFocusable(true);
            this.f221285g.requestFocus();
            ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this.f221285g, 0);
        }
    }

    /* renamed from: n */
    public void mo105096n(WalletBaseUI walletBaseUI) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setFocusable(true);
            this.f221285g.requestFocus();
            walletBaseUI.showTenpayKB();
        }
    }

    /* renamed from: o */
    public void mo105097o(int i, int i2) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText == null) {
            return;
        }
        if (i >= 0 || i2 >= 0) {
            tenpaySecureEditText.addTextChangedListener(new C75208b(i2, i));
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        mo105092j();
        if (getPrefilledTv() != null) {
            getPrefilledTv().setText(this.f221298v);
            getPrefilledTv().setVisibility(this.f221299w);
        }
        if (getInfoIv() != null) {
            getInfoIv().setImageResource(this.f221300x);
            getInfoIv().setVisibility(this.f221302z);
            if (this.f221301y != -1) {
                getInfoIv().setmUserSetImageIconColor(this.f221301y);
            }
        }
        if (getTipsTv() != null) {
            getTipsTv().setText(this.f221260A);
            getTipsTv().setVisibility(this.f221261B);
        }
        Context context = getContext();
        if (this.f221285g != null) {
            int i = this.f221280V;
            if (i >= 0) {
                try {
                    this.f221285g.setTypeface(Typeface.createFromAsset(context.getAssets(), C75228t.m90273v(i)));
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.WalletFormView", "setTypeface() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
                }
            }
            if (this.f221264E == -1) {
                this.f221285g.setHint(this.f221263D);
            } else {
                SpannableString spannableString = new SpannableString(this.f221263D + "  ");
                spannableString.setSpan(new C77087a(this.f221264E), 0, spannableString.length() - 2, 33);
                spannableString.setSpan(new AbsoluteSizeSpan((int) this.f221285g.getTextSize(), false), spannableString.length() - 2, spannableString.length(), 33);
                this.f221285g.setHint(new SpannedString(spannableString));
            }
            this.f221285g.setGravity(this.f221265F);
            this.f221285g.setTextColor(this.f221266G);
            setText(this.f221267H);
            C76040e.m91344a(this.f221285g, this.f221268I, true);
            this.f221285g.setBackgroundResource(this.f221271L);
            this.f221285g.setEnabled(this.f221272M);
            this.f221285g.setFocusable(this.f221274P);
            this.f221285g.setClickable(this.f221273N);
            this.f221285g.setHintTextColor(this.f221278T);
            setImeOptions(this.f221277S);
            setInputType(this.f221276R);
            this.f221285g.addTextChangedListener(new C75214b(this));
            this.f221285g.setOnFocusChangeListener(this);
            try {
                if (!Util.isEqual(this.f221281W, 0)) {
                    this.f221285g.setCursorStyle(this.f221281W);
                }
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.WalletFormView", "set textCursorDrawable fail!!");
            }
        }
        mo105103p();
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            int i2 = this.f221276R;
            if (i2 == 2) {
                tenpaySecureEditText.setKeyListener(new C76045i(this));
            } else if (i2 == 4) {
                tenpaySecureEditText.setKeyListener(new C76046j(this));
            } else if (i2 == 128) {
                tenpaySecureEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f221285g.setKeyListener(new C76047k(this));
                this.f221285g.setRawInputType(18);
            } else if (i2 == 3) {
                tenpaySecureEditText.setKeyListener(new C76048l(this));
            } else {
                tenpaySecureEditText.setInputType(i2);
            }
            if (this.f221269J != -1) {
                this.f221285g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f221269J)});
            }
        }
    }

    public void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.f221289n;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z);
        }
        C75209c cVar = this.f221288j;
        if (cVar != null) {
            cVar.onInputValidChange(mo105094l());
        }
        if (!mo105094l()) {
            TextView textView = this.f221283e;
            if (textView != null) {
                textView.setEnabled(false);
            }
        } else {
            TextView textView2 = this.f221283e;
            if (textView2 != null) {
                textView2.setEnabled(true);
            }
        }
        mo105103p();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText == null || !mo105093k(tenpaySecureEditText, motionEvent) || this.f221285g.isClickable()) {
            WalletIconImageView walletIconImageView = this.f221286h;
            if (walletIconImageView == null || !walletIconImageView.isClickable() || !mo105093k(this.f221286h, motionEvent) || motionEvent.getAction() != 1) {
                return false;
            }
            Log.m105918d("MicroMsg.WalletFormView", "hy: click on info iv");
            mo105103p();
            this.f221286h.performClick();
            return true;
        }
        Log.m105918d("MicroMsg.WalletFormView", "hy: click on content but content is not clickable. whole view perform click");
        return true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* renamed from: p */
    public final void mo105103p() {
        TenpaySecureEditText tenpaySecureEditText;
        if (this.f221286h == null || Util.isNullOrNil(getText()) || (tenpaySecureEditText = this.f221285g) == null || !tenpaySecureEditText.isEnabled() || !this.f221285g.isClickable() || !this.f221285g.isFocusable() || !this.f221285g.isFocused()) {
            WalletIconImageView walletIconImageView = this.f221286h;
            if (walletIconImageView != null) {
                walletIconImageView.mo100854s();
            } else {
                Log.m105926v("MicroMsg.WalletFormView", "hy: no info iv");
            }
        } else {
            this.f221286h.setToClearState(new C75207a());
        }
    }

    public void set3DesToView(String str) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.set3DesEncrptData(str);
        }
    }

    public void set3DesValStr(String str) {
        if (this.f221285g != null) {
            C76241b bVar = this.f221291p;
            if (bVar == null || !bVar.mo99317a(this, str)) {
                this.f221285g.set3DesEncrptData(str);
                setSelection(getInputLength());
            }
        }
    }

    public void setBankcardTail(String str) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setBankcardTailNum(str);
        }
    }

    public void setContentClickable(boolean z) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setClickable(z);
        }
    }

    public void setContentEnabled(boolean z) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setEnabled(z);
        }
    }

    public void setContentFocusable(boolean z) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setFocusable(z);
        }
    }

    public void setContentTextColor(int i) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setTextColor(i);
        }
    }

    public void setContentTextColorRes(int i) {
        this.f221266G = i;
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setTextColor(getResources().getColor(this.f221266G));
        }
    }

    public void setEncryptType(int i) {
        this.f221295s = i;
    }

    public void setEventDelegate(C76240a aVar) {
    }

    public void setFilterChar(char[] cArr) {
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setFilters(inputFilterArr);
        }
    }

    public void setHint(CharSequence charSequence) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText == null) {
            return;
        }
        if (this.f221264E == -1) {
            tenpaySecureEditText.setHint(charSequence);
            return;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new AbsoluteSizeSpan(this.f221264E, false), 0, spannableString.length(), 33);
        this.f221285g.setHint(new SpannedString(spannableString));
    }

    public void setHintSize(int i) {
        this.f221264E = i;
    }

    public void setImeOptions(int i) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setImeOptions(i);
        }
    }

    public void setInputEnable(boolean z) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setEnabled(z);
        }
    }

    public void setInputType(int i) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setInputType(i);
        }
    }

    public void setIsSecretAnswer(boolean z) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setIsSecurityAnswerFormat(z);
        }
    }

    public void setKeyListener(KeyListener keyListener) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setKeyListener(keyListener);
        }
    }

    public void setLogicDelegate(C76241b bVar) {
        this.f221291p = bVar;
    }

    public void setMaxInputLength(int i) {
        this.f221269J = i;
    }

    public void setMinInputLength(int i) {
        this.f221270K = i;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        this.f221285g.setOnEditorActionListener(onEditorActionListener);
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f221289n = onFocusChangeListener;
    }

    public void setOnInfoIvClickListener(View.OnClickListener onClickListener) {
        this.f221290o = onClickListener;
        if (getInfoIv() != null) {
            getInfoIv().setOnClickListener(this.f221290o);
        }
    }

    public void setOnInputValidChangeListener(C75209c cVar) {
        this.f221288j = cVar;
    }

    public void setSelection(int i) {
        TenpaySecureEditText tenpaySecureEditText = this.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setSelection(i);
        }
    }

    public void setText(String str) {
        if (this.f221285g != null) {
            C76241b bVar = this.f221291p;
            if (bVar == null || !bVar.mo99319c(this, str)) {
                this.f221285g.setText(str);
                this.f221285g.setSelection(getInputLength());
            }
        }
    }

    public void setTitleText(String str) {
        this.f221296t = str;
        mo105092j();
    }

    public void setTitleWidth(int i) {
        ViewGroup.LayoutParams layoutParams;
        this.f221262C = i;
        if (i > 0 && (layoutParams = this.f221283e.getLayoutParams()) != null) {
            layoutParams.width = this.f221262C;
            this.f221283e.setLayoutParams(layoutParams);
        }
    }

    public void setmContentAbnormalMoneyCheck(boolean z) {
        this.f221275Q = z;
    }

    public void setmWalletFormViewListener(C75211e eVar) {
        this.f221282d = eVar;
    }

    public WalletFormView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
