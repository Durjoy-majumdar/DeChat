package wc1;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: wc1.l */
public final class C15096l extends C15085j {

    /* renamed from: wc1.l$a */
    public static final class C15097a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15096l f41235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15097a(C15096l lVar) {
            super(1);
            this.f41235d = lVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41235d.mo14390e3(view, C0966R.C0970id.d4a);
            CharSequence e35 = this.f41235d.mo14390e3(view, C0966R.C0970id.d4b);
            String string = this.f41235d.getContext().getString(C0966R.string.doo, new Object[]{e3, e35});
            C87412m.m108593f(string, "context.getString(com.te…l_item_desc, name, price)");
            return string;
        }
    }

    /* renamed from: wc1.l$b */
    public static final class C15098b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15096l f41236d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15098b(C15096l lVar) {
            super(1);
            this.f41236d = lVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String string = this.f41236d.getContext().getString(C0966R.string.dn4, new Object[]{((TextView) view.findViewById(C0966R.C0970id.f358569fu0)).getText().toString()});
            C87412m.m108593f(string, "context.getString(com.te…low_btn).text.toString())");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15096l(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        super.initConfig();
        disableWholeExpand();
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.e18);
        root.view(C0966R.C0970id.dld).desc((int) C0966R.string.do5);
        root.view(C0966R.C0970id.jjn).desc((int) C0966R.string.f360691e80);
        root.view(C0966R.C0970id.fou).desc((int) C0966R.string.e_m);
        root.view(C0966R.C0970id.dr4).desc((int) C0966R.string.duq);
        root.view(C0966R.C0970id.eph).desc((int) C0966R.string.dom);
        root.view(C0966R.C0970id.dp6).desc((int) C0966R.string.dq5);
        root.view(C0966R.C0970id.dp_).descFormat(C0966R.string.e_l).valueByView(C0966R.C0970id.dp_);
        root(C0966R.C0971layout.agi).view(C0966R.C0970id.ber).desc((int) C0966R.string.djb).type(ViewType.TextView);
        root(C0966R.C0970id.dlr).view(C0966R.C0970id.dlm).desc((int) C0966R.string.djb);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0970id.fup);
        root2.view(C0966R.C0970id.fur).desc((int) C0966R.string.e6w);
        root2.view(C0966R.C0970id.frp).desc((int) C0966R.string.dgm);
        root2.view(C0966R.C0970id.fuf).desc((int) C0966R.string.dp7);
        root(C0966R.C0970id.fzn).view(C0966R.C0970id.f358572fu3).disableChildren().clickAs(C0966R.C0970id.f358569fu0).desc((C32226l<? super View, String>) new C15098b(this));
        root(C0966R.C0970id.e1u).view(C0966R.C0970id.e1j).desc((int) C0966R.string.dyj);
        root(C0966R.C0970id.f358202du3).view(C0966R.C0970id.dtq).desc((int) C0966R.string.djd);
        root(C0966R.C0970id.e1e).view(C0966R.C0970id.e0z).clickAs(C0966R.C0970id.l6k).desc((int) C0966R.string.e9t);
        root(C0966R.C0970id.dst).view(C0966R.C0970id.dsw).desc((int) C0966R.string.dyo);
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0970id.dmr);
        root3.view(C0966R.C0970id.dmm).desc((int) C0966R.string.djb).disableChildren().clickAs(C0966R.C0970id.dml);
        root3.view(C0966R.C0970id.dmu).descFormat(C0966R.string.eaa).valueByView(C0966R.C0970id.dmx).disExpand();
        root3.view(C0966R.C0970id.dme).desc((C32226l<? super View, String>) new C15097a(this));
    }
}
