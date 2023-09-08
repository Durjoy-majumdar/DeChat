package com.tencent.p014mm.plugin.finder.view;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.view.GameTeamSelectCoinBottomPage;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;
import qo3.w$$c;

/* renamed from: com.tencent.mm.plugin.finder.view.m6 */
public final class C4108m6 extends w$$c {

    /* renamed from: b */
    public final GameTeamSelectCoinBottomPage.C3987a f18270b;

    /* renamed from: c */
    public ViewGroup f18271c;

    /* renamed from: d */
    public KeyboardHeightProvider f18272d;

    /* renamed from: e */
    public int f18273e;

    /* renamed from: com.tencent.mm.plugin.finder.view.m6$a */
    public static final class C4109a implements TextView.OnEditorActionListener {

        /* renamed from: d */
        public final /* synthetic */ View f18274d;

        /* renamed from: e */
        public final /* synthetic */ C4108m6 f18275e;

        /* renamed from: f */
        public final /* synthetic */ MMEditText f18276f;

        public C4109a(View view, C4108m6 m6Var, MMEditText mMEditText) {
            this.f18274d = view;
            this.f18275e = m6Var;
            this.f18276f = mMEditText;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6 || !((Button) this.f18274d.findViewById(C0966R.C0970id.anq)).isEnabled()) {
                return false;
            }
            this.f18275e.f18270b.mo4782a(Integer.parseInt(this.f18276f.getText().toString()));
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.m6$b */
    public static final class C4110b implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ View f18277d;

        /* renamed from: e */
        public final /* synthetic */ MMEditText f18278e;

        /* renamed from: f */
        public final /* synthetic */ C4108m6 f18279f;

        /* renamed from: g */
        public final /* synthetic */ Context f18280g;

        public C4110b(View view, MMEditText mMEditText, C4108m6 m6Var, Context context) {
            this.f18277d = view;
            this.f18278e = mMEditText;
            this.f18279f = m6Var;
            this.f18280g = context;
        }

        public void afterTextChanged(Editable editable) {
            boolean z = true;
            if ((editable != null ? editable.length() : -1) > 8 && editable != null) {
                editable.delete(editable.length() - 1, editable.length());
            }
            TextView textView = (TextView) this.f18277d.findViewById(C0966R.C0970id.gpr);
            if (textView != null) {
                MMEditText mMEditText = this.f18278e;
                C4108m6 m6Var = this.f18279f;
                Context context = this.f18280g;
                View view = this.f18277d;
                int parseInt = mMEditText.getText().toString().length() == 0 ? -1 : Integer.parseInt(mMEditText.getText().toString());
                if (parseInt == -1 || (parseInt <= m6Var.f18273e && parseInt >= 1)) {
                    textView.setTextColor(context.getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
                    textView.setText(context.getString(C0966R.string.f360511db0, new Object[]{Integer.valueOf(m6Var.f18273e)}));
                    Button button = (Button) view.findViewById(C0966R.C0970id.anq);
                    if (parseInt == -1) {
                        z = false;
                    }
                    button.setEnabled(z);
                    return;
                }
                textView.setTextColor(context.getResources().getColor(C0966R.color.Red_100));
                textView.setText(context.getString(parseInt < 1 ? C0966R.string.f360512db1 : C0966R.string.daz, new Object[]{Integer.valueOf(m6Var.f18273e)}));
                ((Button) view.findViewById(C0966R.C0970id.anq)).setEnabled(false);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.m6$c */
    public static final class C4111c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MMEditText f18281d;

        /* renamed from: e */
        public final /* synthetic */ C4108m6 f18282e;

        public C4111c(MMEditText mMEditText, C4108m6 m6Var) {
            this.f18281d = mMEditText;
            this.f18282e = m6Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/GameTeamInputCoinValueBottomPage$getView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.isEnabled()) {
                if (this.f18281d.getText().toString().length() > 0) {
                    this.f18282e.f18270b.mo4782a(Integer.parseInt(this.f18281d.getText().toString()));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/GameTeamInputCoinValueBottomPage$getView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.m6$d */
    public static final class C4112d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f18283d;

        /* renamed from: e */
        public final /* synthetic */ C4108m6 f18284e;

        /* renamed from: com.tencent.mm.plugin.finder.view.m6$d$a */
        public static final class C4113a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C4108m6 f18285d;

            public C4113a(C4108m6 m6Var) {
                this.f18285d = m6Var;
            }

            public final void run() {
                this.f18285d.mo12476d();
            }
        }

        public C4112d(View view, C4108m6 m6Var) {
            this.f18283d = view;
            this.f18284e = m6Var;
        }

        public final void onClick(View view) {
            MMEditText mMEditText;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/GameTeamInputCoinValueBottomPage$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = this.f18283d;
            if (!(view2 == null || (mMEditText = (MMEditText) view2.findViewById(C0966R.C0970id.bg6)) == null)) {
                View view3 = this.f18283d;
                mMEditText.clearFocus();
                Context context = view3.getContext();
                MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
                if (mMActivity != null) {
                    mMActivity.hideVKB(mMEditText);
                }
            }
            this.f18283d.postDelayed(new C4113a(this.f18284e), 300);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/GameTeamInputCoinValueBottomPage$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.m6$e */
    public static final class C4114e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f18286d;

        /* renamed from: e */
        public final /* synthetic */ C4108m6 f18287e;

        /* renamed from: com.tencent.mm.plugin.finder.view.m6$e$a */
        public static final class C4115a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C4108m6 f18288d;

            public C4115a(C4108m6 m6Var) {
                this.f18288d = m6Var;
            }

            public final void run() {
                this.f18288d.f18270b.mo4784c();
            }
        }

        public C4114e(View view, C4108m6 m6Var) {
            this.f18286d = view;
            this.f18287e = m6Var;
        }

        public final void onClick(View view) {
            MMEditText mMEditText;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/GameTeamInputCoinValueBottomPage$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = this.f18286d;
            if (!(view2 == null || (mMEditText = (MMEditText) view2.findViewById(C0966R.C0970id.bg6)) == null)) {
                View view3 = this.f18286d;
                mMEditText.clearFocus();
                Context context = view3.getContext();
                MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
                if (mMActivity != null) {
                    mMActivity.hideVKB(mMEditText);
                }
            }
            this.f18286d.postDelayed(new C4115a(this.f18287e), 300);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/GameTeamInputCoinValueBottomPage$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.m6$f */
    public static final class C4116f implements C7020t0 {

        /* renamed from: d */
        public final /* synthetic */ C4108m6 f18289d;

        public C4116f(C4108m6 m6Var) {
            this.f18289d = m6Var;
        }

        /* renamed from: Q1 */
        public final void mo531Q1(int i, boolean z) {
            Window b;
            View decorView;
            Log.m105924i("MicroMsg.GameTeamInputCoinValueBottomPage", "KeyboardHeightObserver " + i + ' ' + z);
            C12925w wVar = this.f18289d.f36949a;
            if (wVar != null && (b = wVar.mo12462b()) != null && (decorView = b.getDecorView()) != null) {
                decorView.setPadding(0, 0, 0, i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.m6$g */
    public static final class C4117g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MMEditText f18290d;

        /* renamed from: e */
        public final /* synthetic */ C4108m6 f18291e;

        public C4117g(MMEditText mMEditText, C4108m6 m6Var) {
            this.f18290d = mMEditText;
            this.f18291e = m6Var;
        }

        public final void run() {
            this.f18290d.requestFocus();
            MMEditText mMEditText = this.f18290d;
            mMEditText.setSelection(mMEditText.getText().length());
            ViewGroup viewGroup = this.f18291e.f18271c;
            MMActivity mMActivity = null;
            Context context = viewGroup != null ? viewGroup.getContext() : null;
            if (context instanceof MMActivity) {
                mMActivity = (MMActivity) context;
            }
            if (mMActivity != null) {
                MMEditText mMEditText2 = this.f18290d;
                Object systemService = mMActivity.getSystemService("input_method");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(mMEditText2, 0);
            }
        }
    }

    public C4108m6(GameTeamSelectCoinBottomPage.C3987a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f18270b = aVar;
    }

    /* renamed from: a */
    public View mo4781a(Context context) {
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.act, (ViewGroup) null, false);
        MMEditText mMEditText = (MMEditText) inflate.findViewById(C0966R.C0970id.bg6);
        if (mMEditText != null) {
            mMEditText.setInputType(2);
            mMEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
            mMEditText.setImeOptions(6);
            mMEditText.setOnEditorActionListener(new C4109a(inflate, this, mMEditText));
            mMEditText.addTextChangedListener(new C4110b(inflate, mMEditText, this, context));
            Button button = (Button) inflate.findViewById(C0966R.C0970id.anq);
            button.setEnabled(false);
            button.setOnClickListener(new C4111c(mMEditText, this));
        }
        inflate.findViewById(C0966R.C0970id.deb).setOnClickListener(new C4112d(inflate, this));
        ((WeImageView) inflate.findViewById(C0966R.C0970id.dnr)).setOnClickListener(new C4114e(inflate, this));
        ((TextView) inflate.findViewById(C0966R.C0970id.gpr)).setText(context.getString(C0966R.string.f360511db0, new Object[]{Integer.valueOf(this.f18273e)}));
        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider((Activity) context);
        keyboardHeightProvider.f220015b = new C4116f(this);
        this.f18272d = keyboardHeightProvider;
        this.f18271c = (ViewGroup) inflate;
        return inflate;
    }

    /* renamed from: b */
    public void mo4872b() {
        Window b;
        View decorView;
        KeyboardHeightProvider keyboardHeightProvider = this.f18272d;
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
        MMEditText mMEditText;
        Window b;
        C12925w wVar = this.f36949a;
        if (!(wVar == null || (b = wVar.mo12462b()) == null)) {
            b.setSoftInputMode(48);
        }
        KeyboardHeightProvider keyboardHeightProvider = this.f18272d;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
        ViewGroup viewGroup = this.f18271c;
        if (viewGroup != null && (mMEditText = (MMEditText) viewGroup.findViewById(C0966R.C0970id.bg6)) != null) {
            mMEditText.postDelayed(new C4117g(mMEditText, this), 300);
        }
    }
}
