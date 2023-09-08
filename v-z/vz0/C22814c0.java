package vz0;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import com.tencent.p014mm.sdk.platformtools.Log;
import dz0.C20483c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import wz0.C22945n;
import wz0.C53263p;

/* renamed from: vz0.c0 */
public class C22814c0 extends C22821l {

    /* renamed from: b */
    public View f65596b;

    /* renamed from: c */
    public MMActivity f65597c;

    /* renamed from: d */
    public C20483c f65598d;

    /* renamed from: c */
    public void mo35949c() {
        this.f65597c = ((CardDetailUIContoller) this.f65616a).f51797e;
    }

    /* renamed from: d */
    public void mo35950d(int i) {
        View view = this.f65596b;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardStatusView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardStatusView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e */
    public void mo35951e() {
        this.f65598d = ((CardDetailUIContoller) this.f65616a).f51776E;
        if (this.f65596b == null) {
            this.f65596b = ((ViewStub) mo35969b(C0966R.C0970id.ax9)).inflate();
        }
        if (this.f65598d.mo23271R1()) {
            View view = this.f65596b;
            MMActivity mMActivity = this.f65597c;
            view.setBackgroundDrawable(C22945n.m27013m(mMActivity, mMActivity.getResources().getColor(C0966R.color.f3201ir)));
        }
        TextView textView = (TextView) this.f65596b.findViewById(C0966R.C0970id.ax_);
        if (this.f65598d.mo23263J0() == null) {
            Log.m105920e("MicroMsg.CardStatusView", "updateState() mCardInfo.getDataInfo() == null");
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setTextColor(this.f65597c.getResources().getColor(C0966R.color.f3541x6));
        if (!TextUtils.isEmpty(this.f65598d.mo23264L0().f64124T)) {
            textView.setText(this.f65598d.mo23264L0().f64124T);
        } else {
            C53263p.m59704e(textView, this.f65598d.mo23263J0().f63942d);
        }
    }
}
