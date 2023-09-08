package eh1;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85865h1;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p206nj.C11171e;
import qo3.C101218e0;

/* renamed from: eh1.a */
public class C7652a extends C101218e0 {

    /* renamed from: L */
    public ViewGroup f25984L = ((ViewGroup) this.f296384g.findViewById(C0966R.C0970id.bxz));

    /* renamed from: M */
    public EditText f25985M = ((EditText) this.f296384g.findViewById(C0966R.C0970id.cd7));

    /* renamed from: N */
    public Button f25986N = ((Button) this.f296384g.findViewById(C0966R.C0970id.hfe));

    /* renamed from: P */
    public Button f25987P;

    /* renamed from: Q */
    public Context f25988Q;

    /* renamed from: R */
    public TextView f25989R = ((TextView) this.f296384g.findViewById(C0966R.C0970id.ckz));

    /* renamed from: S */
    public View.OnClickListener f25990S;

    /* renamed from: T */
    public KeyboardHeightProvider f25991T;

    /* renamed from: eh1.a$a */
    public class C7653a implements View.OnClickListener {
        public C7653a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/ui/NoticeCancelEditTipsDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7652a.this.mo140680z();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/ui/NoticeCancelEditTipsDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: eh1.a$b */
    public class C7654b implements View.OnClickListener {
        public C7654b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/ui/NoticeCancelEditTipsDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7652a.this.mo140680z();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/ui/NoticeCancelEditTipsDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: eh1.a$c */
    public class C7655c implements View.OnClickListener {
        public C7655c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/ui/NoticeCancelEditTipsDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View.OnClickListener onClickListener = C7652a.this.f25990S;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/ui/NoticeCancelEditTipsDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: eh1.a$d */
    public class C7656d implements TextWatcher {
        public C7656d() {
        }

        public void afterTextChanged(Editable editable) {
            C7652a.this.f25985M.removeTextChangedListener(this);
            if (editable != null) {
                String obj = editable.toString();
                if (Util.isNullOrNil(obj)) {
                    C7652a.this.f25989R.setVisibility(4);
                    C7652a.this.mo8782B();
                } else if (C45078p0.m49927f(obj) > 120) {
                    int c = C45078p0.m49924c(120, obj);
                    if (c <= 0 || c >= 120 || c >= obj.length()) {
                        C7652a.this.f25989R.setVisibility(4);
                        C7652a.this.mo8782B();
                    } else {
                        C7652a.this.f25985M.setText(obj.substring(0, c + 1));
                        EditText editText = C7652a.this.f25985M;
                        editText.setSelection(editText.getText().length());
                        C7652a.this.f25989R.setVisibility(0);
                        C7652a aVar = C7652a.this;
                        aVar.f25989R.setText(aVar.f25985M.getContext().getString(C0966R.string.n3z, new Object[]{60}));
                        C7652a aVar2 = C7652a.this;
                        aVar2.f25986N.setEnabled(false);
                        aVar2.f25986N.setTextColor(aVar2.f25988Q.getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
                        aVar2.f25986N.setBackground(aVar2.f25988Q.getDrawable(C0966R.C0969drawable.f4665jf));
                    }
                } else {
                    C7652a.this.f25989R.setVisibility(4);
                    C7652a.this.mo8782B();
                }
            } else {
                C7652a.this.f25989R.setVisibility(4);
                C7652a.this.mo8782B();
            }
            C7652a.this.f25985M.addTextChangedListener(this);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: eh1.a$e */
    public class C7657e implements C7020t0 {

        /* renamed from: d */
        public final /* synthetic */ Context f25996d;

        public C7657e(Context context) {
            this.f25996d = context;
        }

        /* renamed from: Q1 */
        public void mo531Q1(int i, boolean z) {
            Log.m105924i("NoticeCancelEditTipsDialog", "#dismiss height=" + i + " isResized=" + z);
            if (!C85865h1.m106133c(this.f25996d) && !C85875k4.m106171a0() && C11171e.m11044a(30)) {
                C7652a aVar = C7652a.this;
                aVar.getClass();
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, i});
                ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
                ofInt.addUpdateListener(new C7659b(aVar));
                ofInt.setDuration(200);
                ofInt.start();
            }
        }
    }

    /* renamed from: eh1.a$f */
    public class C7658f implements C101218e0.C77394n {
        public C7658f() {
        }

        public void dismiss() {
            Log.m105924i("NoticeCancelEditTipsDialog", "#dismiss");
            KeyboardHeightProvider keyboardHeightProvider = C7652a.this.f25991T;
            if (keyboardHeightProvider != null) {
                keyboardHeightProvider.mo104021d();
            }
        }
    }

    public C7652a(Context context, boolean z, boolean z2) {
        super(context, 0, 0, z);
        this.f25988Q = context;
        mo140662i(C0966R.C0971layout.d5d);
        TextView textView = (TextView) this.f296384g.findViewById(C0966R.C0970id.nzc);
        if (z2) {
            textView.setText(this.f25988Q.getResources().getString(C0966R.string.n29));
        }
        Button button = (Button) this.f296384g.findViewById(C0966R.C0970id.c8o);
        this.f25987P = button;
        button.setContentDescription(context.getResources().getString(C0966R.string.bfj));
        this.f25987P.setOnClickListener(new C7653a());
        View view = this.f296376G;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/ui/NoticeCancelEditTipsDialog", "<init>", "(Landroid/content/Context;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/component/ui/NoticeCancelEditTipsDialog", "<init>", "(Landroid/content/Context;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo8782B();
        this.f296376G.setOnClickListener(new C7654b());
        this.f25986N.setOnClickListener(new C7655c());
        this.f25985M.addTextChangedListener(new C7656d());
        mo140679y(48);
        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider((Activity) context);
        this.f25991T = keyboardHeightProvider;
        keyboardHeightProvider.f220015b = new C7657e(context);
        keyboardHeightProvider.mo104022e();
        mo140665l(new C7658f());
    }

    /* renamed from: B */
    public void mo8782B() {
        this.f25986N.setEnabled(true);
        this.f25986N.setTextColor(this.f25988Q.getResources().getColor(C0966R.color.f3257l0));
        this.f25986N.setBackground(this.f25988Q.getDrawable(C0966R.C0969drawable.f4653j6));
    }

    /* renamed from: c */
    public int mo8783c() {
        return C0966R.C0971layout.bcl;
    }
}
