package il1;

import android.text.TextPaint;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import o40.C61937h;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.ca4;

/* renamed from: il1.d6 */
public final class C8960d6 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8966e6 f28303d;

    /* renamed from: e */
    public final /* synthetic */ int f28304e;

    /* renamed from: f */
    public final /* synthetic */ ca4 f28305f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8960d6(C8966e6 e6Var, int i, ca4 ca4) {
        super(0);
        this.f28303d = e6Var;
        this.f28304e = i;
        this.f28305f = ca4;
    }

    public Object invoke() {
        C8966e6 e6Var = this.f28303d;
        e6Var.f28323f = this.f28304e;
        ca4 ca4 = this.f28305f;
        String str = ca4.f131604d;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        e6Var.f28324g = str;
        String str3 = ca4.f131605e;
        if (str3 != null) {
            str2 = str3;
        }
        e6Var.f28325h = str2;
        TextView textView = (TextView) e6Var.f28321d.findViewById(C0966R.C0970id.knx);
        TextPaint textPaint = null;
        C85875k4.m106189j0(textView != null ? textView.getPaint() : null, 0.8f);
        Button button = (Button) e6Var.f28321d.findViewById(C0966R.C0970id.i0y);
        e6Var.f28328n = button;
        if (button != null) {
            button.setOnClickListener(e6Var);
        }
        WeImageView weImageView = (WeImageView) e6Var.f28321d.findViewById(C0966R.C0970id.kr4);
        if (weImageView != null) {
            weImageView.setOnClickListener(e6Var);
        }
        TextView textView2 = (TextView) e6Var.f28321d.findViewById(C0966R.C0970id.i17);
        e6Var.f28329o = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(e6Var);
        }
        TextView textView3 = e6Var.f28329o;
        if (textView3 != null) {
            textView3.post(new C8942c6(textView3));
        }
        TextView textView4 = e6Var.f28329o;
        C85875k4.m106189j0(textView4 != null ? textView4.getPaint() : null, 0.8f);
        WeImageView weImageView2 = (WeImageView) e6Var.f28321d.findViewById(C0966R.C0970id.i15);
        e6Var.f28330p = weImageView2;
        if (weImageView2 != null) {
            weImageView2.setOnClickListener(e6Var);
        }
        TextView textView5 = (TextView) e6Var.f28321d.findViewById(C0966R.C0970id.i0w);
        e6Var.f28331q = textView5;
        if (textView5 != null) {
            textView5.setOnClickListener(e6Var);
        }
        TextView textView6 = e6Var.f28331q;
        if (textView6 != null) {
            textView6.post(new C8942c6(textView6));
        }
        TextView textView7 = e6Var.f28331q;
        C85875k4.m106189j0(textView7 != null ? textView7.getPaint() : null, 0.8f);
        WeImageView weImageView3 = (WeImageView) e6Var.f28321d.findViewById(C0966R.C0970id.i0u);
        e6Var.f28332r = weImageView3;
        if (weImageView3 != null) {
            weImageView3.setOnClickListener(e6Var);
        }
        e6Var.f28333s = e6Var.f28321d.findViewById(C0966R.C0970id.i0z);
        e6Var.f28334t = (TextView) e6Var.f28321d.findViewById(C0966R.C0970id.f358951i13);
        TextView textView8 = (TextView) e6Var.f28321d.findViewById(C0966R.C0970id.f358950i12);
        e6Var.f28335u = textView8;
        if (textView8 != null) {
            textView8.setOnClickListener(e6Var);
        }
        TextView textView9 = e6Var.f28335u;
        if (textView9 != null) {
            textView9.post(new C8942c6(textView9));
        }
        TextView textView10 = e6Var.f28335u;
        if (textView10 != null) {
            textPaint = textView10.getPaint();
        }
        C85875k4.m106189j0(textPaint, 0.8f);
        WeImageView weImageView4 = (WeImageView) e6Var.f28321d.findViewById(C0966R.C0970id.f358948i10);
        e6Var.f28336v = weImageView4;
        if (weImageView4 != null) {
            weImageView4.setOnClickListener(e6Var);
        }
        C8966e6 e6Var2 = this.f28303d;
        e6Var2.getClass();
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_LIVE_PRECHECK_BOOLEAN_SYNC, Boolean.FALSE);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
        e6Var2.f28337w = ((Boolean) f).booleanValue();
        e6Var2.mo9770b();
        C8966e6 e6Var3 = this.f28303d;
        e6Var3.mo9774f();
        e6Var3.mo9771c();
        e6Var3.mo9773e(e6Var3.f28325h);
        e6Var3.mo9772d();
        this.f28303d.f28321d.setVisibility(0);
        C8966e6 e6Var4 = this.f28303d;
        if (!(e6Var4.f28319B == 0 || e6Var4.f28320C == 0)) {
            C8966e6 e6Var5 = this.f28303d;
            ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9599I3(6, e6Var5.f28319B, e6Var5.f28320C, C90364q0.m113147f(new C13604l("name_certification", Integer.valueOf(e6Var5.f28338x ^ true ? 1 : 0)), new C13604l("age_certification", Integer.valueOf(this.f28303d.f28340z ^ true ? 1 : 0)), new C13604l("other_certification", Integer.valueOf(this.f28303d.f28318A ^ true ? 1 : 0))));
        }
        String str4 = this.f28303d.f28322e;
        Log.m105924i(str4, "showPrecheckPage userFlag:" + this.f28304e + ", spamRisk:" + C61937h.m72709h(this.f28305f) + ", hasShowLicense:" + this.f28303d.f28337w + ", realnameCheckFail:" + this.f28303d.f28338x + ", finderRealNameCheckFail:" + this.f28303d.f28339y + ", ageCheckFail:" + this.f28303d.f28340z + ", othersCheckFail:" + this.f28303d.f28318A);
        return C13598b0.f38549a;
    }
}
