package xi3;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kw0.C46746a;

/* renamed from: xi3.h */
public final class C15699h extends MMBaseAccessibilityConfig {

    /* renamed from: xi3.h$a */
    public static final class C15700a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C15700a f42391d = new C15700a();

        public C15700a() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.hdc);
            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.hbu);
            StringBuilder sb = new StringBuilder();
            C46746a aVar = C46746a.f125826a;
            C87412m.m108593f(textView, "titleTv");
            sb.append(aVar.mo71975h(textView));
            sb.append(", ");
            C87412m.m108593f(textView2, "banTv");
            sb.append(aVar.mo71975h(textView2));
            return sb.toString();
        }
    }

    /* renamed from: xi3.h$b */
    public static final class C15701b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C15701b f42392d = new C15701b();

        public C15701b() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return C46746a.f125826a.mo71970c(view);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15699h(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.hcp);
        ViewSetter desc = root.view(C0966R.C0970id.hcp).desc((C32226l<? super View, String>) C15700a.f42391d);
        ViewType viewType = ViewType.Button;
        desc.type(viewType);
        root.view(C0966R.C0970id.hcu).desc((int) C0966R.string.b_u).type(viewType);
        root(C0966R.C0970id.hke).view(C0966R.C0970id.hkh).desc((int) C0966R.string.b_u).type(viewType);
        root(C0966R.C0970id.hbv).view(C0966R.C0970id.hbv).desc((C32226l<? super View, String>) C15701b.f42392d).disableChildren();
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0970id.agg);
        root2.view(C0966R.C0970id.hbx).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.hbz).disableChildren().type(viewType);
        root2.view(C0966R.C0970id.f358839hc0).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.f358841hc2).disableChildren().type(viewType);
        root2.view(C0966R.C0970id.f358843hd0).descFormat(C0966R.string.juo).valueByView(C0966R.C0970id.f358846hd3).valueByView(C0966R.C0970id.f358845hd2).type(viewType);
        root(C0966R.C0970id.eub).view(C0966R.C0970id.eub).desc((int) C0966R.C0970id.b9_).type(viewType);
        root(C0966R.C0970id.eub).view(C0966R.C0970id.b3s).disable();
        root(C0966R.C0970id.h09).view(C0966R.C0970id.h09).desc((int) C0966R.string.b_u).type(viewType);
        root(C0966R.C0970id.cac).view(C0966R.C0970id.cac).desc((int) C0966R.C0970id.hbq);
        root(C0966R.C0970id.b64).view(C0966R.C0970id.c3a).desc((int) C0966R.string.f361427jt3).type(viewType);
        root(C0966R.C0970id.b8a).view(C0966R.C0970id.i4g).disable();
    }
}
