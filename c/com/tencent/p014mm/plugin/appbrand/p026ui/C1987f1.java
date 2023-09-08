package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C0132m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.protocal.protobuf.RelievedBuyInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gt0.C8454j0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.f1 */
public final class C1987f1 {

    /* renamed from: a */
    public final Context f11901a;

    /* renamed from: b */
    public final String f11902b;

    /* renamed from: c */
    public final C8454j0 f11903c;

    /* renamed from: d */
    public final LinearLayout f11904d;

    /* renamed from: e */
    public final ImageView f11905e;

    /* renamed from: f */
    public final TextView f11906f;

    /* renamed from: g */
    public final TextView f11907g;

    /* renamed from: h */
    public final TextView f11908h;

    /* renamed from: i */
    public final TextView f11909i;

    /* renamed from: j */
    public final C1995i1 f11910j;

    /* renamed from: k */
    public RelievedBuyInfo f11911k;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.f1$a */
    public static final class C1988a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C1987f1 f11912d;

        public C1988a(C1987f1 f1Var) {
            this.f11912d = f1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyHalfScreenComponent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f11912d.f11902b, "close");
            this.f11912d.f11903c.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyHalfScreenComponent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.f1$b */
    public static final class C1989b implements View.OnClickListener {

        /* renamed from: d */
        public static final C1989b f11913d = new C1989b();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyHalfScreenComponent$doNothingClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyHalfScreenComponent$doNothingClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C1987f1(Context context) {
        C87412m.m108594g(context, "context");
        this.f11901a = context;
        String str = "MicroMsg.AppBrand.AppBrandProfileRelievedBuyHalfScreenComponent#" + hashCode();
        this.f11902b = str;
        C8454j0 j0Var = new C8454j0(context);
        this.f11903c = j0Var;
        C1989b bVar = C1989b.f11913d;
        j0Var.setCanceledOnTouchOutside(true);
        j0Var.setContentView((int) C0966R.C0971layout.f6443f0);
        int i = context.getResources().getDisplayMetrics().heightPixels;
        int i2 = (int) ((2 == context.getResources().getConfiguration().orientation ? 1.0f : 0.75f) * ((float) i));
        Log.m105924i(str, "adjustDialogHeightConfig, screenHeight: " + i + ", peekHeight: " + i2 + ", maxHeight: " + i2);
        StringBuilder sb = new StringBuilder();
        sb.append("setPeekHeight, peekHeight: ");
        sb.append(i2);
        Log.m105924i("MicroMsg.AppBrand.HalfScreenDialog", sb.toString());
        j0Var.f27458f = i2;
        j0Var.f27462j.mo146383A(i2);
        Log.m105924i("MicroMsg.AppBrand.HalfScreenDialog", "setMaxHeight, maxHeight: " + i2);
        j0Var.f27459g = i2;
        View view = j0Var.f27460h;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
        FrameLayout frameLayout = (FrameLayout) j0Var.findViewById(C0966R.C0970id.bes);
        if (frameLayout != null) {
            frameLayout.setOnClickListener(bVar);
        }
        FrameLayout frameLayout2 = (FrameLayout) j0Var.findViewById(C0966R.C0970id.beq);
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(new C1988a(this));
            C7007c1.m7256a(frameLayout2);
        }
        this.f11904d = (LinearLayout) j0Var.findViewById(C0966R.C0970id.f359394m83);
        this.f11905e = (ImageView) j0Var.findViewById(C0966R.C0970id.m84);
        this.f11906f = (TextView) j0Var.findViewById(C0966R.C0970id.m85);
        this.f11907g = (TextView) j0Var.findViewById(C0966R.C0970id.f359397kp2);
        LinearLayout linearLayout = (LinearLayout) j0Var.findViewById(C0966R.C0970id.koz);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(bVar);
        }
        this.f11908h = (TextView) j0Var.findViewById(C0966R.C0970id.c2g);
        this.f11909i = (TextView) j0Var.findViewById(C0966R.C0970id.c2d);
        RecyclerView recyclerView = (RecyclerView) j0Var.findViewById(C0966R.C0970id.k9k);
        if (recyclerView != null) {
            recyclerView.setOnClickListener(bVar);
        }
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
        }
        Object obj = C111105a.f332697a;
        Drawable b = C111105a.C111110c.m151511b(context, C0966R.C0969drawable.f4458d4);
        if (b == null) {
            Log.m105928w(str, "<init>, dividerDrawable is null");
        } else if (recyclerView != null) {
            C0132m mVar = new C0132m(context, 1);
            mVar.mo128j(b);
            recyclerView.mo17085h0(mVar);
        }
        C1995i1 i1Var = new C1995i1(context, (LayoutInflater) null, 2, (C8480h) null);
        this.f11910j = i1Var;
        if (recyclerView != null) {
            recyclerView.setAdapter(i1Var);
        }
    }
}
