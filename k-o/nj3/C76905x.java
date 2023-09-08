package nj3;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74804o4;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import qo3.C101218e0;

/* renamed from: nj3.x */
public class C76905x extends C101218e0 {

    /* renamed from: L */
    public TextView f224756L;

    /* renamed from: M */
    public EditText f224757M;

    /* renamed from: N */
    public Button f224758N;

    /* renamed from: P */
    public ImageView f224759P;

    /* renamed from: Q */
    public Context f224760Q;

    /* renamed from: R */
    public int f224761R = 36;

    /* renamed from: S */
    public TextView f224762S;

    /* renamed from: nj3.x$a */
    public class C76906a implements View.OnClickListener {
        public C76906a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMHalfBottomEditDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76905x.this.mo140680z();
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMHalfBottomEditDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: nj3.x$b */
    public class C76907b implements View.OnClickListener {
        public C76907b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMHalfBottomEditDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76905x.this.mo140680z();
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMHalfBottomEditDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: nj3.x$c */
    public class C76908c implements TextWatcher {
        public C76908c() {
        }

        public void afterTextChanged(Editable editable) {
            C76905x.this.f224757M.removeTextChangedListener(this);
            if (editable != null) {
                String obj = editable.toString();
                if (!Util.isNullOrNil(obj)) {
                    int f = C45078p0.m49927f(obj);
                    if (f > 0) {
                        C76905x xVar = C76905x.this;
                        xVar.f224758N.setEnabled(true);
                        xVar.f224758N.setTextColor(xVar.f224760Q.getResources().getColor(C0966R.color.f3257l0));
                        xVar.f224758N.setBackground(xVar.f224760Q.getDrawable(C0966R.C0969drawable.f4653j6));
                    } else {
                        C76905x.this.mo107249B();
                    }
                    C45078p0.m49925d(C76905x.this.f224761R, obj);
                    C76905x xVar2 = C76905x.this;
                    int i = xVar2.f224761R;
                    if (f > i) {
                        int c = C45078p0.m49924c(i, obj);
                        if (c <= 0 || c >= C76905x.this.f224761R || c >= obj.length()) {
                            C76905x.this.f224762S.setVisibility(4);
                        } else {
                            C76905x.this.f224757M.setText(obj.substring(0, c + 1));
                            EditText editText = C76905x.this.f224757M;
                            editText.setSelection(editText.getText().length());
                            C76905x.this.f224762S.setVisibility(0);
                            C74804o4.m89546a();
                            C76905x xVar3 = C76905x.this;
                            xVar3.f224762S.setText(xVar3.f224757M.getContext().getString(C0966R.string.g2p, new Object[]{Integer.valueOf(C76905x.this.f224761R / 2)}));
                        }
                    } else {
                        xVar2.f224762S.setVisibility(4);
                    }
                } else {
                    C76905x.this.f224762S.setVisibility(4);
                    C76905x.this.mo107249B();
                }
            } else {
                C76905x.this.f224762S.setVisibility(4);
                C76905x.this.mo107249B();
            }
            C76905x.this.f224757M.addTextChangedListener(this);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: nj3.x$d */
    public interface C76909d {
    }

    /* renamed from: nj3.x$e */
    public class C76910e implements InputFilter {

        /* renamed from: d */
        public final char[] f224766d = {10, ',', ';', 12289, 65292, 65307};

        public C76910e() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            Log.m105919d("MicroMsg.MMHalfBottomDialog", "on create tag filter, %s [%d, %d) %s [%d, %d),", charSequence, Integer.valueOf(i), Integer.valueOf(i2), spanned, Integer.valueOf(i3), Integer.valueOf(i4));
            for (int i5 = i; i5 < i2; i5++) {
                char[] cArr = new char[(i2 - i)];
                TextUtils.getChars(charSequence, i, i2, cArr, 0);
                for (char c : this.f224766d) {
                    char c2 = cArr[i5];
                    if (c2 == ' ' && i3 == 0 && i5 == 0) {
                        return "";
                    }
                    if (c2 == c) {
                        Log.m105924i("MicroMsg.MMHalfBottomDialog", "MMInputFilter, showInvaildMsg.");
                        C76905x.this.f224762S.setVisibility(0);
                        C76905x xVar = C76905x.this;
                        xVar.f224762S.setText(xVar.f224760Q.getResources().getString(C0966R.string.f7385er));
                        C74804o4.m89546a();
                        return "";
                    }
                }
            }
            return null;
        }
    }

    public C76905x(Context context, boolean z) {
        super(context, 0, 0, z);
        this.f224760Q = context;
        mo140662i(C0966R.C0971layout.ayt);
        this.f224756L = (TextView) this.f296384g.findViewById(C0966R.C0970id.knm);
        this.f224757M = (EditText) this.f296384g.findViewById(C0966R.C0970id.cd7);
        this.f224758N = (Button) this.f296384g.findViewById(C0966R.C0970id.hfe);
        this.f224762S = (TextView) this.f296384g.findViewById(C0966R.C0970id.ckz);
        ImageView imageView = (ImageView) this.f296384g.findViewById(C0966R.C0970id.c8o);
        this.f224759P = imageView;
        imageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_close, this.f224760Q.getResources().getColor(C0966R.color.f3133gi)));
        this.f224759P.setContentDescription(context.getResources().getString(C0966R.string.bfj));
        this.f224759P.setOnClickListener(new C76906a());
        View view = this.f296376G;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/MMHalfBottomEditDialog", "<init>", "(Landroid/content/Context;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/base/MMHalfBottomEditDialog", "<init>", "(Landroid/content/Context;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f224758N.setTextColor(this.f224760Q.getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
        this.f224758N.setBackground(this.f224760Q.getDrawable(C0966R.C0969drawable.f4665jf));
        this.f224758N.setEnabled(false);
        this.f296376G.setOnClickListener(new C76907b());
        this.f224757M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f224761R), new C76910e()});
        this.f224757M.addTextChangedListener(new C76908c());
        mo140679y(48);
    }

    /* renamed from: B */
    public void mo107249B() {
        this.f224758N.setEnabled(false);
        this.f224758N.setTextColor(this.f224760Q.getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
        this.f224758N.setBackground(this.f224760Q.getDrawable(C0966R.C0969drawable.f4665jf));
    }

    /* renamed from: c */
    public int mo8783c() {
        return C0966R.C0971layout.bcl;
    }
}
