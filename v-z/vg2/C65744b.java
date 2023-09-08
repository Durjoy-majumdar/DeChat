package vg2;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import kg3.C76577a;

/* renamed from: vg2.b */
public final class C65744b extends MMBaseAccessibilityConfig {

    /* renamed from: vg2.b$a */
    public static final class C65745a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C65744b f189134d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65745a(C65744b bVar) {
            super(1);
            this.f189134d = bVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String q = C76577a.m92166q(this.f189134d.getActivity(), C0966R.string.f7511ib);
            return view.getTag(C0966R.C0970id.f5651kx) + q;
        }
    }

    /* renamed from: vg2.b$b */
    public static final class C65746b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C65744b f189135d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65746b(C65744b bVar) {
            super(1);
            this.f189135d = bVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String q = C76577a.m92166q(this.f189135d.getActivity(), C0966R.string.f7512ic);
            return view.getTag(C0966R.C0970id.f5652ky) + q;
        }
    }

    /* renamed from: vg2.b$c */
    public static final class C65747c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C65744b f189136d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65747c(C65744b bVar) {
            super(1);
            this.f189136d = bVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String q = C76577a.m92166q(this.f189136d.getActivity(), C0966R.string.f7510ia);
            return view.getTag(C0966R.C0970id.f5650kw) + q;
        }
    }

    /* renamed from: vg2.b$d */
    public static final class C65748d extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C65744b f189137d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65748d(C65744b bVar) {
            super(1);
            this.f189137d = bVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String q = C76577a.m92166q(this.f189137d.getActivity(), C0966R.string.f7508i9);
            C87412m.m108593f(q, "getString(activity, R.st…ng.aging_add_music_group)");
            String format = String.format(q, Arrays.copyOf(new Object[]{view.getTag(C0966R.C0970id.f5653kz)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65744b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.c65);
        root.view(C0966R.C0970id.k6r).desc((int) C0966R.string.f7515if);
        root.view(C0966R.C0970id.k55).desc((C32226l<? super View, String>) new C65745a(this));
        root.view(C0966R.C0970id.k58).desc((C32226l<? super View, String>) new C65746b(this));
        root.view(C0966R.C0970id.f359306k52).desc((C32226l<? super View, String>) new C65747c(this));
        root(C0966R.C0970id.k5d).view(C0966R.C0970id.k5d).desc((int) C0966R.string.d1c);
        root(C0966R.C0971layout.cbe).view(C0966R.C0970id.cca).desc((int) C0966R.string.f7516ig);
        root(C0966R.C0970id.cc_).view(C0966R.C0970id.cbo).desc((C32226l<? super View, String>) new C65748d(this)).disableChildren();
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0970id.azh);
        root2.disable(C0966R.C0970id.k6b);
        root2.disable(C0966R.C0970id.ccj);
    }
}
