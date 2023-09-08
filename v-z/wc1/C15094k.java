package wc1;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import xc1.C15641a;

/* renamed from: wc1.k */
public final class C15094k extends C15641a {

    /* renamed from: wc1.k$a */
    public static final class C15095a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15094k f41233d;

        /* renamed from: e */
        public final /* synthetic */ Context f41234e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15095a(C15094k kVar, Context context) {
            super(1);
            this.f41233d = kVar;
            this.f41234e = context;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41233d.mo14390e3(view, C0966R.C0970id.d4_);
            String string = this.f41234e.getString(C0966R.string.f360579do1, new Object[]{e3});
            C87412m.m108593f(string, "context.getString(com.te…_select_item_desc, title)");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15094k(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        Context context = MMApplicationContext.getContext();
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.enk);
        root.view(C0966R.C0970id.enl).desc((int) C0966R.string.dgx);
        root.view(C0966R.C0970id.dl8).desc((int) C0966R.string.e6p).disableChildren();
        ViewSetter view = root.view(C0966R.C0970id.hll);
        ViewType viewType = ViewType.Button;
        view.type(viewType);
        root.view(C0966R.C0970id.d_6).desc((C32226l<? super View, String>) new C15095a(this, context));
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0970id.f358361en2);
        root2.view(C0966R.C0970id.en5).desc((int) C0966R.string.dgx);
        root2.view(C0966R.C0970id.emz).desc((int) C0966R.string.dnq);
        root2.view(C0966R.C0970id.izz).desc((int) C0966R.string.dnp);
        root2.view(C0966R.C0970id.fwy).desc((int) C0966R.string.dnm).type(ViewType.TextView);
        root2.view(C0966R.C0970id.hzy).type(viewType);
        root2.view(C0966R.C0970id.f358360en1).disable();
        focusFirst(C0966R.C0970id.en5);
        focusOrder().next((int) C0966R.C0970id.en5).next((int) C0966R.C0970id.en4).next((int) C0966R.C0970id.emz);
    }
}
