package fs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.record.WAGameRecordShareUI;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import qo3.C101218e0;
import sw1.C48478n;

/* renamed from: fs0.a */
public final class C97957a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WAGameRecordShareUI f287317d;

    /* renamed from: fs0.a$a */
    public static final class C97958a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WAGameRecordShareUI f287318d;

        public C97958a(WAGameRecordShareUI wAGameRecordShareUI) {
            this.f287318d = wAGameRecordShareUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$layoutButton$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WAGameRecordShareUI wAGameRecordShareUI = this.f287318d;
            String str = wAGameRecordShareUI.f267611f.f38917a;
            String format = String.format("https://game.weixin.qq.com/cgi-bin/h5/static/gamelife/localvideo.html?wechat_pkgid=gamelife_localvideo&wechat_immersive=1&immersivePageBgIsDark=1&tab_type=1&sub_tab_type=1&ssid=30&s_uia=1004&s_pid=2&s_cid=%s&game_tab_key=%s", Arrays.copyOf(new Object[]{str, str}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            WAGameRecordShareUI.m117228H7(wAGameRecordShareUI, format);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$layoutButton$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fs0.a$b */
    public static final class C97959b implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ WAGameRecordShareUI f287319a;

        /* renamed from: b */
        public final /* synthetic */ C101218e0 f287320b;

        public C97959b(WAGameRecordShareUI wAGameRecordShareUI, C101218e0 e0Var) {
            this.f287319a = wAGameRecordShareUI;
            this.f287320b = e0Var;
        }

        /* renamed from: a */
        public final void mo2001a() {
            WAGameRecordShareUI.m117230N7(this.f287319a, 601, 2, 4, 0, (String) null, 24, (Object) null);
            this.f287320b.mo140680z();
        }
    }

    /* renamed from: fs0.a$c */
    public static final class C97960c implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ WAGameRecordShareUI f287321a;

        /* renamed from: b */
        public final /* synthetic */ C101218e0 f287322b;

        public C97960c(WAGameRecordShareUI wAGameRecordShareUI, C101218e0 e0Var) {
            this.f287321a = wAGameRecordShareUI;
            this.f287322b = e0Var;
        }

        /* renamed from: a */
        public final void mo2001a() {
            WAGameRecordShareUI.m117230N7(this.f287321a, 601, 2, 2, 2, (String) null, 16, (Object) null);
            WAGameRecordShareUI wAGameRecordShareUI = this.f287321a;
            wAGameRecordShareUI.getClass();
            ((C48478n) C86312j.m106911c(C48478n.class)).W20(wAGameRecordShareUI.f267610e, 50, new C97974g(wAGameRecordShareUI));
            this.f287322b.mo140680z();
        }
    }

    public C97957a(WAGameRecordShareUI wAGameRecordShareUI) {
        this.f287317d = wAGameRecordShareUI;
    }

    public final void onClick(View view) {
        Class cls = C48478n.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$layoutButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((C48478n) C86312j.m106911c(cls)).Vk0() + 1 > 50) {
            C101218e0 e0Var = new C101218e0(this.f287317d, 1, 0);
            WAGameRecordShareUI wAGameRecordShareUI = this.f287317d;
            e0Var.mo140662i(C0966R.C0971layout.d0q);
            View inflate = LayoutInflater.from(wAGameRecordShareUI).inflate(C0966R.C0971layout.d0p, (ViewGroup) null);
            WAGameRecordShareUI.m117230N7(wAGameRecordShareUI, 601, 2, 40, 0, (String) null, 24, (Object) null);
            inflate.findViewById(C0966R.C0970id.dwd).setOnClickListener(new C97958a(wAGameRecordShareUI));
            e0Var.mo140670p(inflate);
            e0Var.mo140667n(wAGameRecordShareUI.getContext().getString(C0966R.string.f7926wf), wAGameRecordShareUI.getContext().getString(C0966R.string.mud));
            e0Var.mo140668o(0);
            e0Var.mo140666m(true, true);
            C97959b bVar = new C97959b(wAGameRecordShareUI, e0Var);
            C97960c cVar = new C97960c(wAGameRecordShareUI, e0Var);
            e0Var.f296373D = bVar;
            e0Var.f296374E = cVar;
            e0Var.mo140655A();
            WAGameRecordShareUI.m117230N7(wAGameRecordShareUI, 601, 2, 1, 1, (String) null, 16, (Object) null);
        } else {
            WAGameRecordShareUI wAGameRecordShareUI2 = this.f287317d;
            int i = WAGameRecordShareUI.f267608p;
            wAGameRecordShareUI2.getClass();
            ((C48478n) C86312j.m106911c(cls)).W20(wAGameRecordShareUI2.f267610e, 50, new C97974g(wAGameRecordShareUI2));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$layoutButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
