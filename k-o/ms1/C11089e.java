package ms1;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import gy3.C87412m;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: ms1.e */
public final class C11089e extends Dialog implements C11090f {

    /* renamed from: n */
    public static final /* synthetic */ int f32860n = 0;

    /* renamed from: d */
    public final Activity f32861d;

    /* renamed from: e */
    public final View f32862e;

    /* renamed from: f */
    public final LinearLayout f32863f;

    /* renamed from: g */
    public final TextView f32864g;

    /* renamed from: h */
    public final Button f32865h;

    /* renamed from: i */
    public final WeImageView f32866i;

    /* renamed from: j */
    public String f32867j = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11089e(Activity activity) {
        super(activity, C0966R.style.a6a);
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f32861d = activity;
        View inflate = View.inflate(getContext(), C0966R.C0971layout.aq8, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(context, R.layou…ens_guide_btm_view, null)");
        this.f32862e = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.g17);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.ll_goto_teens)");
        this.f32863f = (LinearLayout) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.kyd);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.id.tv_teens_guide_msg)");
        this.f32864g = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.amj);
        C87412m.m108593f(findViewById3, "rootView.findViewById(R.id.btn_teens_guide_ok)");
        this.f32865h = (Button) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.lqz);
        C87412m.m108593f(findViewById4, "rootView.findViewById(R.id.wiv_close)");
        this.f32866i = (WeImageView) findViewById4;
    }

    /* renamed from: a */
    public void mo11227a() {
        if (this.f32861d.isDestroyed() || this.f32861d.isFinishing()) {
            Log.m105918d("FinderTeensGuideBtmDialog", "activity is destroyed");
            return;
        }
        show();
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        Activity activity = this.f32861d;
        y0Var.getClass();
        C87412m.m108594g(activity, "context");
        C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62443b(activity).mo75002a(C13442s8.class)).mo12861q3();
        FinderShowInWXProfileStruct finderShowInWXProfileStruct = new FinderShowInWXProfileStruct();
        finderShowInWXProfileStruct.mo1041w(q3.f134670d);
        finderShowInWXProfileStruct.mo1040v(q3.f134671e);
        finderShowInWXProfileStruct.mo1037s(String.valueOf(q3.f134675i));
        finderShowInWXProfileStruct.f9906k = finderShowInWXProfileStruct.mo86045b("clicktabcontextid", q3.f134672f, true);
        finderShowInWXProfileStruct.f9902g = 0;
        finderShowInWXProfileStruct.mo1038t("teenagemode_set");
        finderShowInWXProfileStruct.mo1039u(String.valueOf(C31543z5.m39453c()));
        finderShowInWXProfileStruct.mo86054n();
        y0Var.Ec0(finderShowInWXProfileStruct);
    }

    /* renamed from: c */
    public void mo11228c(String str) {
        C87412m.m108594g(str, "msg");
        this.f32867j = str;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(C0966R.style.f8473jt);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.width = -1;
                attributes.height = -2;
                window.setAttributes(attributes);
            }
        }
        setContentView(this.f32862e);
        setCanceledOnTouchOutside(true);
        this.f32862e.setOnClickListener(new C11085a(this));
        this.f32863f.setOnClickListener(new C11086b(this));
        this.f32865h.setOnClickListener(new C11087c(this));
        this.f32866i.setOnClickListener(new C11088d(this));
        this.f32864g.setText(this.f32867j);
    }
}
