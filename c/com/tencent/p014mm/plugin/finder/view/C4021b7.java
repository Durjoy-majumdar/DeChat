package com.tencent.p014mm.plugin.finder.view;

import android.app.Activity;
import android.content.Context;
import android.text.method.DigitsKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.finder.view.C4226y6;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58739j4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import qo3.C12925w;
import qo3.w$$c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.b7 */
public final class C4021b7 extends w$$c {

    /* renamed from: b */
    public final C4226y6.C4227a f18076b;

    /* renamed from: c */
    public final String f18077c = "LiveChargeInputCoinValueBottomPage";

    /* renamed from: d */
    public ViewGroup f18078d;

    /* renamed from: e */
    public KeyboardHeightProvider f18079e;

    /* renamed from: f */
    public int f18080f = 4;

    /* renamed from: com.tencent.mm.plugin.finder.view.b7$a */
    public static final class C4022a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C4021b7 f18081d;

        /* renamed from: e */
        public final /* synthetic */ EditText f18082e;

        /* renamed from: f */
        public final /* synthetic */ View f18083f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4022a(C4021b7 b7Var, EditText editText, View view) {
            super(0);
            this.f18081d = b7Var;
            this.f18082e = editText;
            this.f18083f = view;
        }

        public Object invoke() {
            boolean e = C4021b7.m4274e(this.f18081d, this.f18082e.getText().toString());
            ((TextView) this.f18083f.findViewById(C0966R.C0970id.anq)).setEnabled(e);
            C62042e eVar = C62042e.f176370a;
            View findViewById = this.f18083f.findViewById(C0966R.C0970id.anq);
            C87412m.m108593f(findViewById, "rootView.findViewById<TextView>(R.id.button)");
            eVar.mo87025M1((TextView) findViewById, e, false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.b7$b */
    public static final class C4023b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f18084d;

        /* renamed from: e */
        public final /* synthetic */ C4021b7 f18085e;

        /* renamed from: f */
        public final /* synthetic */ EditText f18086f;

        public C4023b(TextView textView, C4021b7 b7Var, EditText editText) {
            this.f18084d = textView;
            this.f18085e = b7Var;
            this.f18086f = editText;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/LiveChargeInputCoinValueBottomPage$getView$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f18084d.isEnabled() && C4021b7.m4274e(this.f18085e, this.f18086f.getText().toString())) {
                this.f18085e.f18076b.mo5096a(Integer.parseInt(this.f18086f.getText().toString()));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/LiveChargeInputCoinValueBottomPage$getView$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.b7$c */
    public static final class C4024c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f18087d;

        /* renamed from: e */
        public final /* synthetic */ C4021b7 f18088e;

        /* renamed from: com.tencent.mm.plugin.finder.view.b7$c$a */
        public static final class C4025a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C4021b7 f18089d;

            public C4025a(C4021b7 b7Var) {
                this.f18089d = b7Var;
            }

            public final void run() {
                this.f18089d.mo12476d();
            }
        }

        public C4024c(View view, C4021b7 b7Var) {
            this.f18087d = view;
            this.f18088e = b7Var;
        }

        public final void onClick(View view) {
            EditText editText;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/LiveChargeInputCoinValueBottomPage$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = this.f18087d;
            if (!(view2 == null || (editText = (EditText) view2.findViewById(C0966R.C0970id.bg6)) == null)) {
                View view3 = this.f18087d;
                C58739j4.f168176a.mo83703c0(editText, true);
                editText.clearFocus();
                Context context = view3.getContext();
                MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
                if (mMActivity != null) {
                    mMActivity.hideVKB(editText);
                }
            }
            this.f18087d.postDelayed(new C4025a(this.f18088e), 300);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/LiveChargeInputCoinValueBottomPage$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.b7$d */
    public static final class C4026d implements C7020t0 {

        /* renamed from: d */
        public final /* synthetic */ C4021b7 f18090d;

        public C4026d(C4021b7 b7Var) {
            this.f18090d = b7Var;
        }

        /* renamed from: Q1 */
        public final void mo531Q1(int i, boolean z) {
            Window b;
            View decorView;
            String str = this.f18090d.f18077c;
            Log.m105924i(str, "KeyboardHeightObserver " + i + ' ' + z);
            C12925w wVar = this.f18090d.f36949a;
            if (wVar != null && (b = wVar.mo12462b()) != null && (decorView = b.getDecorView()) != null) {
                decorView.setPadding(0, 0, 0, i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.b7$e */
    public static final class C4027e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditText f18091d;

        /* renamed from: e */
        public final /* synthetic */ C4021b7 f18092e;

        public C4027e(EditText editText, C4021b7 b7Var) {
            this.f18091d = editText;
            this.f18092e = b7Var;
        }

        public final void run() {
            this.f18091d.requestFocus();
            EditText editText = this.f18091d;
            editText.setSelection(editText.getText().length());
            ViewGroup viewGroup = this.f18092e.f18078d;
            MMActivity mMActivity = null;
            Context context = viewGroup != null ? viewGroup.getContext() : null;
            if (context instanceof MMActivity) {
                mMActivity = (MMActivity) context;
            }
            if (mMActivity != null) {
                EditText editText2 = this.f18091d;
                C4021b7 b7Var = this.f18092e;
                Object systemService = mMActivity.getSystemService("input_method");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                boolean showSoftInput = ((InputMethodManager) systemService).showSoftInput(editText2, 0);
                String str = b7Var.f18077c;
                Log.m105924i(str, "showSoftInput result:" + showSoftInput);
            }
        }
    }

    public C4021b7(C4226y6.C4227a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f18076b = aVar;
    }

    /* renamed from: e */
    public static final boolean m4274e(C4021b7 b7Var, String str) {
        b7Var.getClass();
        boolean z = true;
        if (str == null || str.length() == 0) {
            return false;
        }
        if (Util.safeParseInt(str) <= 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public View mo4781a(Context context) {
        C87412m.m108594g(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        C12925w wVar = this.f36949a;
        View inflate = from.inflate(C0966R.C0971layout.afm, wVar != null ? wVar.f36922C : null, false);
        EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.bg6);
        if (editText != null) {
            editText.setInputType(2);
            editText.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
            editText.setImeOptions(6);
            C62042e eVar = C62042e.f176370a;
            int i = this.f18080f;
            C62042e.m72802O1(eVar, editText, (TextView) null, i, i, false, new C4022a(this, editText, inflate), 16, (Object) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.anq);
            textView.setEnabled(false);
            eVar.mo87025M1(textView, false, false);
            textView.setOnClickListener(new C4023b(textView, this, editText));
        }
        inflate.findViewById(C0966R.C0970id.deb).setOnClickListener(new C4024c(inflate, this));
        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider((Activity) context);
        keyboardHeightProvider.f220015b = new C4026d(this);
        this.f18079e = keyboardHeightProvider;
        this.f18078d = (ViewGroup) inflate;
        return inflate;
    }

    /* renamed from: b */
    public void mo4872b() {
        Window b;
        View decorView;
        KeyboardHeightProvider keyboardHeightProvider = this.f18079e;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        C12925w wVar = this.f36949a;
        if (wVar != null && (b = wVar.mo12462b()) != null && (decorView = b.getDecorView()) != null) {
            decorView.setPadding(0, 0, 0, 0);
        }
    }

    /* renamed from: c */
    public void mo4873c() {
        EditText editText;
        Window b;
        C12925w wVar = this.f36949a;
        if (!(wVar == null || (b = wVar.mo12462b()) == null)) {
            b.setSoftInputMode(48);
        }
        KeyboardHeightProvider keyboardHeightProvider = this.f18079e;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
        ViewGroup viewGroup = this.f18078d;
        if (viewGroup != null && (editText = (EditText) viewGroup.findViewById(C0966R.C0970id.bg6)) != null) {
            editText.postDelayed(new C4027e(editText, this), 300);
        }
    }
}
