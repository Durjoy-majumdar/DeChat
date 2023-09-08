package kf1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C54492n;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C60216z4;

/* renamed from: kf1.b4 */
public final class C9633b4 extends UIComponent {

    /* renamed from: kf1.b4$a */
    public static final class C9634a implements C9622a4 {

        /* renamed from: a */
        public final /* synthetic */ C9633b4 f29954a;

        public C9634a(C9633b4 b4Var) {
            this.f29954a = b4Var;
        }

        public void onFinish() {
            this.f29954a.getActivity().finish();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9633b4(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getIntExtra("finder_jump_type", 0) == 1) {
            try {
                String stringExtra = getIntent().getStringExtra("finder_jump_data");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                String str = stringExtra;
                C60216z4.C8821a<Integer> aVar = C10064z3.f30828a;
                C10064z3.f30830c = new C9634a(this);
                boolean booleanExtra = getIntent().getBooleanExtra("is_from_app_brand", false);
                C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
                if (t1Var != null) {
                    t1Var.mo76891w7(getActivity(), str, C10064z3.f30828a, C10064z3.f30829b, booleanExtra);
                }
            } catch (Exception e) {
                Log.printErrStackTrace(C54492n.TAG, e, "reserveChannelsLive exception", new Object[0]);
                C60216z4.C8821a<Integer> aVar2 = C10064z3.f30828a;
                C10064z3.f30829b.mo6382a(-1);
            }
        }
    }

    public void onDestroy() {
        C60216z4.C8821a<Integer> aVar = C10064z3.f30828a;
        C9622a4 a4Var = C10064z3.f30830c;
        if (a4Var != null) {
            a4Var.onFinish();
        }
        C10064z3.f30830c = null;
        super.onDestroy();
    }
}
