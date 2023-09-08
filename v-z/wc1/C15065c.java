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

/* renamed from: wc1.c */
public final class C15065c extends C15641a {

    /* renamed from: wc1.c$a */
    public static final class C15066a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15065c f41200d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15066a(C15065c cVar) {
            super(1);
            this.f41200d = cVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41200d.mo14390e3(view, C0966R.C0970id.d58);
            CharSequence e35 = this.f41200d.mo14390e3(view, C0966R.C0970id.d3o);
            String string = this.f41200d.getContext().getString(C0966R.string.d0x, new Object[]{e3, e35});
            C87412m.m108593f(string, "context.getString(com.te…eed_desc, nickName, desc)");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15065c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0970id.d__).view(C0966R.C0970id.d__).desc((C32226l<? super View, String>) new C15066a(this));
    }
}
