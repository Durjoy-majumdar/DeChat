package mo1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import dp1.C7435f2;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONObject;
import p823sg.C101614i;
import rs1.C13442s8;

/* renamed from: mo1.p0 */
public final class C11023p0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32748d;

    public C11023p0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32748d = finderProfileHeaderUIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserDesc$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderProfileHeaderUIC finderProfileHeaderUIC = this.f32748d;
        C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
        if (finderProfileHeaderUIC.mo3835o3().f17601o.getVisibility() == 0) {
            if (this.f32748d.mo3835o3().f17602p) {
                C7435f2 f2Var = C7435f2.f25626a;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f32748d.getContext());
                f2Var.mo8577a(f != null ? f.mo12861q3() : null, "description_fold", 1, (JSONObject) null);
            } else {
                C7435f2 f2Var2 = C7435f2.f25626a;
                C13442s8 f2 = C13442s8.f38060Q0.mo12873f(this.f32748d.getContext());
                f2Var2.mo8577a(f2 != null ? f2.mo12861q3() : null, "description_unfold", 1, (JSONObject) null);
            }
            this.f32748d.mo3835o3().setExpand(true ^ this.f32748d.mo3835o3().f17602p);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserDesc$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
