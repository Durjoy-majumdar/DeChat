package gm1;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import xc1.C15641a;

/* renamed from: gm1.a */
public final class C8359a extends C15641a {

    /* renamed from: gm1.a$a */
    public static final class C8360a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C8359a f27322d;

        /* renamed from: e */
        public final /* synthetic */ Context f27323e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8360a(C8359a aVar, Context context) {
            super(1);
            this.f27322d = aVar;
            this.f27323e = context;
        }

        public Object invoke(Object obj) {
            String str;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f27322d.mo14390e3(view, C0966R.C0970id.d4s);
            int d3 = this.f27322d.mo14389d3(view, C0966R.C0970id.d3i);
            CharSequence e35 = this.f27322d.mo14390e3(view, C0966R.C0970id.d58);
            CharSequence e36 = this.f27322d.mo14390e3(view, C0966R.C0970id.d4r);
            if (d3 == 1) {
                str = ',' + this.f27323e.getString(C0966R.string.d1h);
            } else if (d3 != 2) {
                str = "";
            } else {
                str = ',' + this.f27323e.getString(C0966R.string.d1e);
            }
            String string = this.f27323e.getString(C0966R.string.eee, new Object[]{e3, str, e35, e36});
            C87412m.m108593f(string, "context.getString(\n     …ckname, participantCount)");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8359a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        Context context = MMApplicationContext.getContext();
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.hag);
        root.view(C0966R.C0970id.hae).desc((C32226l<? super View, String>) new C8360a(this, context));
        root.view(C0966R.C0970id.d78).desc((int) C0966R.string.d1o);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.bkc);
        root2.view(C0966R.C0970id.j3z).desc((int) C0966R.string.e8v).disableChildren();
        root2.view(C0966R.C0970id.hag).disable();
    }
}
