package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74753e;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.appbrand.widget.C84921b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;
import te3.C49527g8;
import te3.C64415h8;
import te3.y44;
import wr0.C118769a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag */
public class AppBrandIDCardShowFrag extends MMFragment {

    /* renamed from: d */
    public AppBrandIDCardUI.C115272d f345423d;

    /* renamed from: e */
    public LinearLayout f345424e;

    /* renamed from: f */
    public View f345425f;

    /* renamed from: g */
    public C74753e f345426g;

    /* renamed from: h */
    public ImageView f345427h;

    /* renamed from: i */
    public TextView f345428i;

    /* renamed from: j */
    public RecyclerView f345429j;

    /* renamed from: n */
    public TextView f345430n;

    /* renamed from: o */
    public Button f345431o;

    /* renamed from: p */
    public CheckBox f345432p;

    /* renamed from: q */
    public TextView f345433q;

    /* renamed from: r */
    public LinearLayout f345434r;

    /* renamed from: s */
    public View f345435s;

    /* renamed from: t */
    public TextView f345436t;

    /* renamed from: u */
    public TextView f345437u;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag$a */
    public static class C40545a extends RecyclerView.C16613e<C40546a> {

        /* renamed from: d */
        public List<C49527g8> f108920d;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag$a$a */
        public static class C40546a extends RecyclerView.C16631z {

            /* renamed from: A */
            public TextView f108921A;

            /* renamed from: z */
            public TextView f108922z;

            public C40546a(View view) {
                super(view);
                this.f108922z = (TextView) view.findViewById(C0966R.C0970id.f5917s9);
                this.f108921A = (TextView) view.findViewById(C0966R.C0970id.f5918s_);
            }
        }

        public C40545a(List<C49527g8> list) {
            this.f108920d = list;
        }

        public int getItemCount() {
            List<C49527g8> list = this.f108920d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C40546a aVar = (C40546a) zVar;
            C49527g8 g8Var = this.f108920d.get(i);
            if (g8Var != null) {
                aVar.f108922z.setText(g8Var.f133919d);
                aVar.f108921A.setText(g8Var.f133920e);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C40546a(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6417ea, viewGroup, false));
        }
    }

    public void dealContentView(View view) {
        AppBrandIDCardUI.C115272d dVar = this.f345423d;
        if (dVar == null || AppBrandIDCardUI.this.f345449o == null) {
            Log.m105920e("MicroMsg.AppBrandIDCardShowFrag", "idCardUILogic or idCardUILogic.getIDCardShowInfo() is null, err");
            return;
        }
        this.f345424e = (LinearLayout) view.findViewById(C0966R.C0970id.f5919sa);
        this.f345427h = (ImageView) view.findViewById(C0966R.C0970id.f5916s8);
        this.f345428i = (TextView) view.findViewById(C0966R.C0970id.f5915s7);
        this.f345429j = (RecyclerView) view.findViewById(C0966R.C0970id.f5921sc);
        this.f345430n = (TextView) view.findViewById(C0966R.C0970id.f5912s4);
        this.f345431o = (Button) view.findViewById(C0966R.C0970id.f5914s6);
        this.f345432p = (CheckBox) view.findViewById(C0966R.C0970id.f5913s5);
        this.f345433q = (TextView) view.findViewById(C0966R.C0970id.f6010us);
        this.f345434r = (LinearLayout) view.findViewById(C0966R.C0970id.f5911s3);
        this.f345435s = view.findViewById(C0966R.C0970id.f5924sf);
        this.f345436t = (TextView) view.findViewById(C0966R.C0970id.f5922sd);
        this.f345437u = (TextView) view.findViewById(C0966R.C0970id.f5923se);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f6300b2, (ViewGroup) null);
        this.f345425f = inflate;
        inflate.setBackgroundColor(getResources().getColor(C0966R.color.a7_));
        this.f345426g = new C74753e(this.f345425f);
        this.f345424e.addView(this.f345425f, 0, new LinearLayout.LayoutParams(-1, C84921b.m104660a(getActivity())));
        y44 y44 = AppBrandIDCardUI.this.f345449o;
        this.f345426g.mo103920c(y44.f354565g);
        C74753e eVar = this.f345426g;
        eVar.f219799a.setOnClickListener(new C115273a(this));
        String str = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122786b(this.f345427h, y44.f354566h, C88393a.m110230a(), C88431k.f255437d);
        TextView textView = this.f345428i;
        textView.setText(y44.f354567i + " " + y44.f354568j);
        if (y44.f354569n != null) {
            this.f345429j.setVisibility(0);
            this.f345429j.setLayoutManager(new LinearLayoutManager(getContext()));
            this.f345429j.setAdapter(new C40545a(y44.f354569n));
        } else {
            Log.m105920e("MicroMsg.AppBrandIDCardShowFrag", "idCardShowInfo.user_id_list is null");
            this.f345429j.setVisibility(8);
        }
        this.f345430n.setText(y44.f354570o);
        if (!Util.isNullOrNil(y44.f354571p)) {
            this.f345431o.setText(y44.f354571p);
        } else {
            this.f345431o.setText(getString(C0966R.string.f7715p4));
        }
        Log.m105925i("MicroMsg.AppBrandIDCardShowFrag", "idCardShowInfo.auth_checked:%b", Boolean.valueOf(y44.f354576u));
        this.f345432p.setChecked(y44.f354576u);
        this.f345431o.setEnabled(y44.f354576u);
        if (!Util.isNullOrNil(y44.f354577v)) {
            this.f345432p.setText(y44.f354577v);
        } else {
            this.f345432p.setText(getString(C0966R.string.f7716p5));
        }
        this.f345432p.setOnCheckedChangeListener(new C118769a(this));
        this.f345431o.setOnClickListener(new C115274b(this));
        C64415h8 h8Var = y44.f354572q;
        if (h8Var != null) {
            this.f345433q.setText(h8Var.f183444d);
            this.f345433q.setOnClickListener(new C115275c(this, y44));
        }
        LinkedList<C64415h8> linkedList = y44.f354573r;
        if (linkedList != null) {
            Log.m105919d("MicroMsg.AppBrandIDCardShowFrag", "idCardShowInfo.jump_list size:%d", Integer.valueOf(linkedList.size()));
            if (y44.f354573r.size() == 0) {
                this.f345434r.setVisibility(8);
            } else if (y44.f354573r.size() == 1) {
                this.f345434r.setVisibility(0);
                View view2 = this.f345435s;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f345437u.setVisibility(8);
                if (y44.f354573r.get(0) != null) {
                    this.f345436t.setText(y44.f354573r.get(0).f183444d);
                    this.f345436t.setOnClickListener(new C115276d(this, y44));
                }
            } else {
                this.f345434r.setVisibility(0);
                View view4 = this.f345435s;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f345437u.setVisibility(0);
                if (y44.f354573r.get(0) != null) {
                    this.f345436t.setText(y44.f354573r.get(0).f183444d);
                    this.f345436t.setOnClickListener(new C115277e(this, y44));
                }
                if (y44.f354573r.get(1) != null) {
                    this.f345437u.setText(y44.f354573r.get(1).f183444d);
                    this.f345437u.setOnClickListener(new C115278f(this, y44));
                }
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6418eb;
    }

    public boolean noActionBar() {
        return true;
    }

    public void onSwipeBack() {
        AppBrandIDCardUI.C115272d dVar = this.f345423d;
        if (dVar != null) {
            AppBrandIDCardUI.this.onSwipeBack();
        }
    }

    public boolean supportNavigationSwipeBack() {
        return false;
    }
}
