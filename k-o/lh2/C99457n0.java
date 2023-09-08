package lh2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.xlabeffect.XLabEffectSettingView;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gy3.C87412m;
import j20.C117292a;
import j90.C108667e;
import java.util.ArrayList;
import lh2.C109344g0;
import qh2.C101198e;
import th2.C110992d;

/* renamed from: lh2.n0 */
public final class C99457n0 implements C109344g0 {

    /* renamed from: d */
    public WeImageView f291601d;

    /* renamed from: e */
    public C101198e f291602e;

    /* renamed from: f */
    public final C108667e f291603f;

    /* renamed from: g */
    public boolean f291604g;

    /* renamed from: h */
    public boolean f291605h = true;

    /* renamed from: i */
    public boolean f291606i;

    /* renamed from: j */
    public boolean f291607j = true;

    /* renamed from: lh2.n0$a */
    public static final class C99458a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C99457n0 f291608d;

        public C99458a(C99457n0 n0Var) {
            this.f291608d = n0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/RecordBeautifyPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C99457n0 n0Var = this.f291608d;
            if (n0Var.f291605h) {
                boolean z = !n0Var.f291606i;
                n0Var.f291606i = z;
                n0Var.mo138899a(z);
            } else {
                boolean z2 = !n0Var.f291607j;
                n0Var.f291607j = z2;
                n0Var.mo138899a(z2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordBeautifyPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: lh2.n0$b */
    public static final class C99459b implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C99457n0 f291609d;

        public C99459b(C99457n0 n0Var) {
            this.f291609d = n0Var;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/RecordBeautifyPlugin$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C104428a aVar = new C104428a(this.f291609d.f291601d.getContext(), 0);
            Window window = aVar.getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            Context context = this.f291609d.f291601d.getContext();
            C87412m.m108593f(context, "view.context");
            XLabEffectSettingView xLabEffectSettingView = new XLabEffectSettingView(context);
            xLabEffectSettingView.setCameraView(this.f291609d.f291603f);
            aVar.setContentView((View) xLabEffectSettingView);
            aVar.show();
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/recordvideo/plugin/RecordBeautifyPlugin$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    public C99457n0(WeImageView weImageView, C101198e eVar, C108667e eVar2) {
        C87412m.m108594g(weImageView, "view");
        C87412m.m108594g(eVar, "status");
        this.f291601d = weImageView;
        this.f291602e = eVar;
        this.f291603f = eVar2;
        weImageView.setOnClickListener(new C99458a(this));
        if (WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_PURPLE) {
            this.f291601d.setOnLongClickListener(new C99459b(this));
        }
    }

    /* renamed from: a */
    public final void mo138899a(boolean z) {
        C110992d.f332425a.mo162677k("KEY_RECORD_IS_BEAUTIFY", Boolean.valueOf(z));
        WeImageView weImageView = this.f291601d;
        weImageView.setIconColor(z ? weImageView.getContext().getResources().getColor(C0966R.color.a7u) : -1);
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_BEAUTIFY_ENABLE", z);
        this.f291602e.mo14585p(C101198e.C101199b.RECORD_BEAUTIFY, bundle);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C99457n0.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
    }

    public void setVisibility(int i) {
        if (this.f291604g) {
            this.f291601d.setVisibility(i);
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
