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

/* renamed from: wc1.q */
public final class C15113q extends C15641a {

    /* renamed from: wc1.q$a */
    public static final class C15114a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15113q f41248d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15114a(C15113q qVar) {
            super(1);
            this.f41248d = qVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41248d.mo14390e3(view, C0966R.C0970id.d58);
            String string = this.f41248d.getContext().getString(C0966R.string.elm, new Object[]{e3});
            C87412m.m108593f(string, "context.getString(com.te…er_qrcode_desc, nickName)");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15113q(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0970id.i_o).view(C0966R.C0970id.i_o).desc((C32226l<? super View, String>) new C15114a(this)).disableChildren();
    }
}
