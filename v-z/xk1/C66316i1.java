package xk1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import it1.C9247b;
import it1.C9253g;
import rx3.C13598b0;

/* renamed from: xk1.i1 */
public final class C66316i1 extends UIComponent {

    /* renamed from: d */
    public C32226l<? super Boolean, C13598b0> f190906d;

    /* renamed from: e */
    public Button f190907e;

    /* renamed from: f */
    public TextView f190908f;

    /* renamed from: g */
    public C9247b f190909g;

    /* renamed from: h */
    public int f190910h = 3;

    /* renamed from: i */
    public final MTimerHandler f190911i = new MTimerHandler(new C66317a(this), true);

    /* renamed from: xk1.i1$a */
    public static final class C66317a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C66316i1 f190912d;

        public C66317a(C66316i1 i1Var) {
            this.f190912d = i1Var;
        }

        public final boolean onTimerExpired() {
            C66316i1 i1Var = this.f190912d;
            int i = i1Var.f190910h;
            if (i > 0) {
                i1Var.f190910h = i - 1;
                TextView textView = i1Var.f190908f;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = i1Var.f190908f;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i1Var.f190910h));
                }
                return true;
            }
            C32226l<? super Boolean, C13598b0> lVar = i1Var.f190906d;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
            C9247b bVar = i1Var.f190909g;
            if (bVar != null) {
                bVar.begin();
            }
            TextView textView3 = i1Var.f190908f;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            Button button = i1Var.f190907e;
            if (button == null) {
                return false;
            }
            button.setVisibility(8);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66316i1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public boolean onBackPressed() {
        Button button = this.f190907e;
        if (button != null) {
            return button.performClick();
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f190907e = (Button) getActivity().findViewById(C0966R.C0970id.dii);
        this.f190908f = (TextView) getActivity().findViewById(C0966R.C0970id.dk5);
        ProgressBar progressBar = (ProgressBar) getActivity().findViewById(C0966R.C0970id.dql);
        C87412m.m108593f(progressBar, LocaleUtil.ITALIAN);
        C9247b bVar = new C9247b();
        bVar.f28992c = 1000;
        C9253g gVar = new C9253g();
        gVar.f28998b = progressBar;
        bVar.f28991b = gVar;
        this.f190909g = bVar;
        Button button = this.f190907e;
        if (button != null) {
            button.setOnClickListener(new C66314h1(this));
        }
        C9247b bVar2 = this.f190909g;
        if (bVar2 != null) {
            bVar2.mo8913b();
        }
        TextView textView = this.f190908f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f190908f;
        if (textView2 != null) {
            textView2.setText(String.valueOf(this.f190910h));
        }
        this.f190911i.startTimer(1000, 1000);
        C9247b bVar3 = this.f190909g;
        if (bVar3 != null) {
            bVar3.mo8913b();
        }
    }
}
