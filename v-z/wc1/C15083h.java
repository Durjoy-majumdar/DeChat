package wc1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import xc1.C15641a;

/* renamed from: wc1.h */
public final class C15083h extends C15641a {

    /* renamed from: wc1.h$a */
    public static final class C15084a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15083h f41217d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15084a(C15083h hVar) {
            super(1);
            this.f41217d = hVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f41217d.getContext().getString(C0966R.string.k3j);
            C87412m.m108593f(string, "context.getString(com.te…ing.top_item_desc_search)");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15083h(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0970id.f5421eo).view(C0966R.C0970id.f5421eo).desc((C32226l<? super View, String>) new C15084a(this));
    }
}
