package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.NewBizInfoMoreInofUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.base.preference.KeyValuePreference */
public class KeyValuePreference extends Preference {

    /* renamed from: J */
    public TextView f121238J;

    /* renamed from: K */
    public TextView f121239K;

    /* renamed from: L */
    public boolean f121240L;

    /* renamed from: M */
    public boolean f121241M;

    /* renamed from: N */
    public String f121242N;

    /* renamed from: P */
    public boolean f121243P;

    /* renamed from: Q */
    public boolean f121244Q;

    /* renamed from: R */
    public int f121245R;

    /* renamed from: S */
    public int f121246S;

    /* renamed from: T */
    public int f121247T;

    /* renamed from: U */
    public ImageView f121248U;

    /* renamed from: V */
    public Drawable f121249V;

    /* renamed from: W */
    public View f121250W;

    /* renamed from: X */
    public List<View> f121251X;

    /* renamed from: Y */
    public int f121252Y;

    /* renamed from: Z */
    public float f121253Z;

    /* renamed from: p0 */
    public int f121254p0;

    /* renamed from: com.tencent.mm.ui.base.preference.KeyValuePreference$a */
    public class C44713a implements View.OnClickListener {
        public C44713a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/preference/KeyValuePreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            KeyValuePreference keyValuePreference = KeyValuePreference.this;
            keyValuePreference.f121276f.mo24588a(keyValuePreference);
            C117292a.m165361g(this, "com/tencent/mm/ui/base/preference/KeyValuePreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.preference.KeyValuePreference$b */
    public class C44714b implements View.OnLongClickListener {
        public C44714b() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/preference/KeyValuePreference$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            KeyValuePreference keyValuePreference = KeyValuePreference.this;
            ((NewBizInfoMoreInofUI.C42647a) keyValuePreference.f121277g).mo66781a(keyValuePreference);
            C117292a.m165362h(true, this, "com/tencent/mm/ui/base/preference/KeyValuePreference$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    public KeyValuePreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: I */
    public void mo69912I(boolean z) {
        this.f121241M = z;
        if (z) {
            this.f121272H = C0966R.C0971layout.f359893bf2;
        }
    }

    /* renamed from: J */
    public void mo69913J(Drawable drawable) {
        this.f121249V = drawable;
    }

    /* renamed from: K */
    public void mo69914K(int i) {
        this.f121247T = i;
    }

    /* renamed from: L */
    public void mo69915L(boolean z) {
        this.f121240L = z;
    }

    /* renamed from: M */
    public void mo69916M(String str) {
        this.f121242N = str;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        LinearLayout linearLayout;
        super.mo1086w(view);
        View findViewById = view.findViewById(C0966R.C0970id.iwg);
        this.f121250W = findViewById;
        if (this.f121276f != null) {
            findViewById.setOnClickListener(new C44713a());
        }
        if (this.f121277g != null) {
            view.setOnLongClickListener(new C44714b());
        }
        TextView textView = (TextView) view.findViewById(16908304);
        this.f121238J = textView;
        if (textView != null) {
            textView.setSingleLine(this.f121240L);
            if (this.f121244Q) {
                this.f121238J.setGravity(this.f121246S);
            }
        }
        if (this.f121241M) {
            this.f121272H = C0966R.C0971layout.f359893bf2;
        }
        this.f121239K = (TextView) view.findViewById(16908310);
        if (!Util.isNullOrNil(this.f121242N)) {
            this.f121239K.setText(this.f121242N);
        }
        TextView textView2 = this.f121239K;
        if (textView2 != null) {
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            int i = this.f121252Y;
            if (i == 0) {
                i = C76577a.m92157h(this.f121274d, C0966R.dimen.f3815f9);
            }
            layoutParams.width = i;
            this.f121239K.setLayoutParams(layoutParams);
        }
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f4k);
        this.f121248U = imageView;
        if (this.f121249V != null) {
            imageView.setVisibility(this.f121247T);
            this.f121248U.setImageDrawable(this.f121249V);
        } else {
            imageView.setVisibility(8);
        }
        if (this.f121243P && (linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.f357785br0)) != null) {
            linearLayout.setGravity(this.f121245R);
        }
        if (((LinkedList) this.f121251X).size() > 0) {
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C0966R.C0970id.f359327ka3);
            linearLayout2.removeAllViews();
            for (View next : this.f121251X) {
                ViewGroup viewGroup = (ViewGroup) next.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(next);
                }
                linearLayout2.addView(next);
            }
        }
        float f = this.f121253Z;
        if (f != 0.0f) {
            this.f121239K.setTextSize(f);
            this.f121238J.setTextSize(this.f121253Z);
        }
        int i2 = this.f121254p0;
        if (i2 > 0) {
            this.f121238J.setMaxLines(i2);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bdm, viewGroup2);
        return x;
    }

    public KeyValuePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeyValuePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121240L = true;
        this.f121241M = false;
        this.f121242N = null;
        this.f121243P = false;
        this.f121244Q = false;
        this.f121245R = 17;
        this.f121246S = 17;
        this.f121247T = 0;
        this.f121248U = null;
        this.f121249V = null;
        this.f121251X = new LinkedList();
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
