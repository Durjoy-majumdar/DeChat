package mo1;

import android.app.Activity;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import er1.C58739j4;
import gy3.C87412m;
import io1.C9228a;
import io1.C9231b;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;
import te3.C51583uq0;

/* renamed from: mo1.r0 */
public final class C11047r0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32795d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileHeaderUIC.C3463b f32796e;

    public C11047r0(FinderProfileHeaderUIC finderProfileHeaderUIC, FinderProfileHeaderUIC.C3463b bVar) {
        this.f32795d = finderProfileHeaderUIC;
        this.f32796e = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserTagLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!C58739j4.f168176a.mo83683L()) {
            FinderProfileHeaderUIC finderProfileHeaderUIC = this.f32795d;
            C9228a aVar = finderProfileHeaderUIC.f16223X0;
            Activity context = finderProfileHeaderUIC.getContext();
            FinderProfileHeaderUIC.C3463b bVar = this.f32796e;
            aVar.getClass();
            C87412m.m108594g(context, "context");
            C87412m.m108594g(bVar, "info");
            C12925w wVar = new C12925w(context);
            String str = null;
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f7195wi, (ViewGroup) null);
            C87412m.m108593f(inflate, "from(context).inflate(R.…tion_dialog_layout, null)");
            wVar.mo12471k(inflate);
            TextPaint paint = ((TextView) wVar.f36927f.findViewById(C0966R.C0970id.knx)).getPaint();
            Rect rect = C85875k4.f250155a;
            boolean z = true;
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
            C51583uq0 uq02 = bVar.f16275n;
            String str2 = uq02 != null ? uq02.f143030d : null;
            if (!(str2 == null || str2.length() == 0)) {
                ((TextView) wVar.f36927f.findViewById(C0966R.C0970id.opb)).setText(str2);
            }
            C51583uq0 uq03 = bVar.f16277p;
            String str3 = uq03 != null ? uq03.f143030d : null;
            if (!(str3 == null || str3.length() == 0)) {
                z = false;
            }
            if (!z) {
                TextView textView = (TextView) wVar.f36927f.findViewById(C0966R.C0970id.opc);
                C51583uq0 uq04 = bVar.f16277p;
                if (uq04 != null) {
                    str = uq04.f143030d;
                }
                textView.setText(str);
            }
            wVar.f36927f.findViewById(C0966R.C0970id.be4).setOnClickListener(new C9231b(wVar));
            wVar.mo5086o();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserTagLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
