package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.performance.C83999e;
import com.tencent.p014mm.plugin.appbrand.widget.C84921b;
import in3.C87771d;
import kg3.C76577a;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.e3 */
public class C84524e3 extends LinearLayout implements C87771d.C46280b {

    /* renamed from: d */
    public final C86812g f246666d;

    /* renamed from: e */
    public final C1985a[] f246667e = new C1985a[4];

    /* renamed from: f */
    public final SparseArray<C84525b> f246668f = new SparseArray<>();

    /* renamed from: g */
    public final SparseArray<C84525b> f246669g = new SparseArray<>();

    /* renamed from: h */
    public int f246670h;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.e3$a */
    public class C1985a extends TextView {
        public C1985a(C84524e3 e3Var, Context context) {
            super(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int b = C76577a.m92151b(getContext(), 5);
            layoutParams.setMargins(0, b, 0, b);
            setLayoutParams(layoutParams);
            setTextSize(1, 12.0f);
            setTextColor(getContext().getResources().getColor(C0966R.color.f3288ma));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.e3$b */
    public class C84525b extends TextView {

        /* renamed from: d */
        public String f246671d;

        /* renamed from: e */
        public String f246672e;

        public C84525b(C84524e3 e3Var, Context context) {
            super(context);
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            setTextSize(1, 12.0f);
            setTextColor(getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
        }

        /* renamed from: a */
        public final void mo117211a() {
            setText(String.format("%s: %s", new Object[]{this.f246671d, this.f246672e}));
        }
    }

    public C84524e3(Context context, C86812g gVar) {
        super(context);
        this.f246666d = gVar;
        setClickable(false);
        int i = getContext().getResources().getDisplayMetrics().widthPixels;
        int b = C76577a.m92151b(getContext(), 10);
        int b2 = C76577a.m92151b(getContext(), 4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((i * 3) / 5, -2);
        layoutParams.gravity = 53;
        setLayoutParams(layoutParams);
        mo117210a();
        setPadding(b, b, b, b);
        setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) b2);
        gradientDrawable.setColor(-652403418);
        setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 2);
        TextView textView = new TextView(getContext());
        View view = new View(getContext());
        textView.setTextColor(-1);
        textView.setLayoutParams(layoutParams2);
        textView.setTextSize(1, 14.0f);
        textView.setText(getContext().getString(C0966R.string.f7798rw));
        addView(textView);
        layoutParams3.setMargins(0, C76577a.m92151b(getContext(), 10), 0, 0);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(1728053247);
        addView(view);
        for (int i2 = 0; i2 < 4; i2++) {
            C1985a aVar = new C1985a(this, getContext());
            aVar.setText(getContext().getString(C83999e.f245239a[i2]));
            this.f246667e[i2] = aVar;
            addView(aVar);
        }
        C87771d.m109203b((Activity) getContext()).mo122180d(this);
    }

    /* renamed from: U3 */
    public void mo6344U3(int i) {
        this.f246670h = i;
        mo117210a();
    }

    /* renamed from: a */
    public final void mo117210a() {
        if (getLayoutParams() != null && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = C84921b.m104660a(getContext()) + this.f246670h;
            requestLayout();
        }
    }
}
