package sd2;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import di3.C86312j;
import p629ny.C76979h;
import td2.C77891a;

/* renamed from: sd2.f */
public class C77660f extends Preference {

    /* renamed from: J */
    public View f226396J = null;

    /* renamed from: K */
    public String f226397K;

    /* renamed from: L */
    public int f226398L = Integer.MAX_VALUE;

    /* renamed from: M */
    public boolean f226399M;

    /* renamed from: N */
    public int f226400N = -1;

    /* renamed from: P */
    public int f226401P = -1;

    /* renamed from: Q */
    public View.OnClickListener f226402Q;

    /* renamed from: sd2.f$a */
    public class C77661a implements C77891a.C77892a {
        public C77661a() {
        }

        public void onClick(View view) {
            View.OnClickListener onClickListener = C77660f.this.f226402Q;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public C77660f(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.bai;
    }

    /* renamed from: I */
    public void mo107827I(String str) {
        this.f226397K = str;
        this.f226399M = false;
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f226396J == null) {
            this.f226396J = mo1087x(viewGroup);
        }
        mo1086w(this.f226396J);
        return this.f226396J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        Class cls = C76979h.class;
        super.mo1086w(view);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.gm5);
        ((TextView) view.findViewById(C0966R.C0970id.gm6)).setText(this.f121279i);
        int i = this.f226398L;
        if (i != Integer.MAX_VALUE) {
            textView.setTextColor(i);
        }
        if (!this.f226399M) {
            textView.setOnClickListener((View.OnClickListener) null);
            textView.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f121274d, this.f226397K, textView.getTextSize()));
        } else if (this.f226400N < 0 || this.f226401P <= 0) {
            textView.setTextColor(this.f121274d.getResources().getColor(C0966R.color.a3q));
            textView.setOnClickListener(this.f226402Q);
            textView.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f121274d, this.f226397K, textView.getTextSize()));
        } else {
            C77891a aVar = new C77891a(this.f121274d);
            SpannableString spannableString = new SpannableString(this.f226397K);
            aVar.f226941e = new C77661a();
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            spannableString.setSpan(aVar, this.f226400N, this.f226401P, 33);
            textView.setText(spannableString);
        }
    }
}
