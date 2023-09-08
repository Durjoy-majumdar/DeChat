package q53;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinEncashView;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import p53.C11828a;
import qo3.C101218e0;
import r53.C12953c;
import te3.C49335eu3;
import te3.C51209s80;
import te3.i35;

/* renamed from: q53.r0 */
public final class C12114r0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinEncashView f35210d;

    public C12114r0(WeCoinEncashView weCoinEncashView) {
        this.f35210d = weCoinEncashView;
    }

    public void onChanged(Object obj) {
        i35 i35;
        C11828a aVar = (C11828a) obj;
        WeCoinEncashView weCoinEncashView = this.f35210d;
        WeakReference<C12075h1> weakReference = WeCoinEncashView.f117264v;
        weCoinEncashView.getClass();
        if ((aVar != null ? aVar.f34586d : null) != null) {
            C49335eu3 eu32 = aVar.f34586d;
            boolean z = eu32 instanceof C51209s80;
            if (z && eu32.BaseResponse.f135955d == 10006 && (i35 = ((C51209s80) eu32).f141371e) != null) {
                C101218e0 e0Var = new C101218e0(weCoinEncashView, 1, 0);
                String string = weCoinEncashView.getString(C0966R.string.ljg);
                C87412m.m108593f(string, "getString(R.string.wecoin_disagree)");
                String string2 = weCoinEncashView.getString(C0966R.string.f361643lj3);
                C87412m.m108593f(string2, "getString(R.string.wecoin_agree_and_sign)");
                String str = i35.f135096i;
                if (str != null && str.length() > 0) {
                    string = i35.f135096i;
                    C87412m.m108593f(string, "info.cancel_button_wording");
                }
                String str2 = i35.f135095h;
                if (str2 != null && str2.length() > 0) {
                    string2 = i35.f135095h;
                    C87412m.m108593f(string2, "info.confirm_button_wording");
                }
                e0Var.mo140667n(string, string2);
                C12054c1 c1Var = new C12054c1(e0Var, weCoinEncashView, i35);
                C12059d1 d1Var = new C12059d1(e0Var, weCoinEncashView, i35);
                e0Var.f296373D = c1Var;
                e0Var.f296374E = d1Var;
                View inflate = View.inflate(weCoinEncashView, C0966R.C0971layout.chj, (ViewGroup) null);
                ((ImageView) inflate.findViewById(C0966R.C0970id.be4)).setOnClickListener(new C12064e1(e0Var));
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.knx);
                String str3 = i35.f135091d;
                if (str3 != null) {
                    textView.setText(str3);
                    C85875k4.m106191k0(textView.getPaint());
                }
                TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.f357845c22);
                String str4 = i35.f135092e;
                if (str4 != null) {
                    textView2.setText(str4);
                    C75228t.m90253j0(textView2, str4, 0, str4.length(), new C7092q((C7092q.C7093a) new C12068f1(i35, weCoinEncashView), true), weCoinEncashView);
                }
                e0Var.mo140663j(inflate);
                e0Var.mo140655A();
                return;
            } else if (z && eu32.BaseResponse.f135955d == 10008) {
                return;
            }
        }
        AppCompatActivity context = weCoinEncashView.getContext();
        C87412m.m108593f(context, "context");
        C12953c.m12395d(context, aVar, (DialogInterface.OnClickListener) null);
    }
}
