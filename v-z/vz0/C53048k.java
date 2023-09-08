package vz0;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import dz0.C20483c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import te3.C22498fy;
import wz0.C22945n;
import wz0.C53247c;
import wz0.C53263p;

/* renamed from: vz0.k */
public abstract class C53048k implements C22818f0 {

    /* renamed from: a */
    public C22819h f148087a;

    /* renamed from: b */
    public MMActivity f148088b;

    public C53048k(C22819h hVar, MMActivity mMActivity) {
        this.f148087a = hVar;
        this.f148088b = mMActivity;
    }

    /* renamed from: a */
    public void mo35954a(ViewGroup viewGroup, C20483c cVar) {
        if (mo73749f()) {
            TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.bfz);
            String str = this.f148087a.f65612i;
            if (cVar.mo23278d0() || (!Util.isNullOrNil(str) && str.length() <= 40)) {
                textView.setText(C53263p.m59700a(4, str, true));
                if (cVar.mo23275W0()) {
                    textView.setVisibility(0);
                    textView.setOnLongClickListener(new C53046i(this, cVar));
                    this.f148087a.mo35966l(C53247c.CARDCODEREFRESHACTION_ENTERCHANGE);
                } else {
                    textView.setVisibility(8);
                }
            } else {
                textView.setVisibility(8);
            }
        }
        if (mo73750g()) {
            LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.bfm);
            if (cVar == null || cVar.mo23264L0() == null || cVar.mo23264L0().f64135Z == null || Util.isNullOrNil(cVar.mo23264L0().f64135Z.f63884d)) {
                linearLayout.setVisibility(8);
                return;
            }
            View findViewById = viewGroup.findViewById(C0966R.C0970id.bfe);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController", "updateJumpLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController", "updateJumpLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout.setVisibility(0);
            C22498fy fyVar = cVar.mo23264L0().f64135Z;
            TextView textView2 = (TextView) viewGroup.findViewById(C0966R.C0970id.bfo);
            textView2.setText(fyVar.f63884d);
            String str2 = cVar.mo23264L0().f64145p;
            if (!Util.isNullOrNil(str2)) {
                textView2.setTextColor(C22945n.m27004d(str2));
            }
            TextView textView3 = (TextView) viewGroup.findViewById(C0966R.C0970id.bfn);
            String str3 = fyVar.f63886f;
            if (!TextUtils.isEmpty(str3)) {
                if (textView3 != null) {
                    textView3.setText(str3);
                    textView3.setVisibility(0);
                }
            } else if (textView3 != null) {
                textView3.setVisibility(8);
            }
            linearLayout.setOnClickListener(new C53047j(this, cVar));
        }
    }

    /* renamed from: b */
    public boolean mo35955b(C20483c cVar) {
        return true;
    }

    /* renamed from: e */
    public void mo35958e(ViewGroup viewGroup, C20483c cVar) {
    }

    /* renamed from: f */
    public abstract boolean mo73749f();

    /* renamed from: g */
    public abstract boolean mo73750g();
}
