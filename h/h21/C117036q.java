package h21;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.edittext.PasterEditText;
import com.tencent.p014mm.plugin.collect.p038ui.CollectMainUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import e21.C75489r;

/* renamed from: h21.q */
public class C117036q implements C75489r.C75490a {

    /* renamed from: a */
    public final /* synthetic */ CollectMainUI f350703a;

    /* renamed from: h21.q$a */
    public class C117037a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ PasterEditText f350704d;

        public C117037a(PasterEditText pasterEditText) {
            this.f350704d = pasterEditText;
        }

        public void run() {
            this.f350704d.requestFocus();
            ((InputMethodManager) C117036q.this.f350703a.getContext().getSystemService("input_method")).showSoftInput(this.f350704d, 0);
        }
    }

    /* renamed from: h21.q$b */
    public class C117038b implements Runnable {
        public C117038b() {
        }

        public void run() {
            C117036q.this.f350703a.hideVKB();
            ((InputMethodManager) C117036q.this.f350703a.getSystemService("input_method")).hideSoftInputFromWindow(C117036q.this.f350703a.f345618l1.getWindowToken(), 0);
        }
    }

    public C117036q(CollectMainUI collectMainUI) {
        this.f350703a = collectMainUI;
    }

    /* renamed from: a */
    public void mo105819a(View view, int i) {
        View view2 = this.f350703a.f345618l1;
        if (view2 != null) {
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0966R.C0970id.bhk);
            ((LinearLayout) this.f350703a.f345618l1.findViewById(C0966R.C0970id.g58)).setVisibility(4);
            ((LinearLayout) this.f350703a.f345618l1.findViewById(C0966R.C0970id.bhk)).setContentDescription(MMApplicationContext.getContext().getString(C0966R.string.m9p, new Object[]{((TextView) this.f350703a.f345618l1.findViewById(C0966R.C0970id.gzh)).getText()}));
        }
        ((LinearLayout) view.findViewById(C0966R.C0970id.g58)).setVisibility(0);
        if (i == this.f350703a.f345621n1.f130703f.size()) {
            this.f350703a.f345640w1 = true;
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C0966R.C0970id.f357733gk3);
            linearLayout2.setVisibility(0);
            PasterEditText pasterEditText = (PasterEditText) linearLayout2.findViewById(C0966R.C0970id.g59);
            pasterEditText.postDelayed(new C117037a(pasterEditText), 50);
            this.f350703a.f345617k1.mo140656b(!Util.isNullOrNil(pasterEditText.getText().toString()));
            CollectMainUI collectMainUI = this.f350703a;
            if (!collectMainUI.f345638v1) {
                collectMainUI.f345636u1 = collectMainUI.f345617k1.f296384g.getMeasuredHeight();
            }
        } else {
            CollectMainUI collectMainUI2 = this.f350703a;
            collectMainUI2.f345640w1 = false;
            View view3 = collectMainUI2.f345618l1;
            if (view3 != null) {
                LinearLayout linearLayout3 = (LinearLayout) view3.findViewById(C0966R.C0970id.f357733gk3);
                if (linearLayout3.getVisibility() == 0) {
                    linearLayout3.setVisibility(8);
                    linearLayout3.clearFocus();
                    linearLayout3.postDelayed(new C117038b(), 200);
                }
                ((LinearLayout) view.findViewById(C0966R.C0970id.bhk)).setContentDescription(MMApplicationContext.getContext().getString(C0966R.string.m9q, new Object[]{this.f350703a.f345626p1}));
            }
            this.f350703a.f345617k1.mo140656b(true);
            CollectMainUI collectMainUI3 = this.f350703a;
            collectMainUI3.f345626p1 = collectMainUI3.f345621n1.f130703f.get(i).f134707d;
            CollectMainUI collectMainUI4 = this.f350703a;
            if (!collectMainUI4.f345638v1) {
                collectMainUI4.f345634t1 = collectMainUI4.f345617k1.f296384g.getMeasuredHeight();
            }
        }
        this.f350703a.f345618l1 = view;
    }
}
