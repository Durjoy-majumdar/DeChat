package il1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ok1.C62042e;

/* renamed from: il1.q4 */
public final class C60497q4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60491p4 f172446d;

    public C60497q4(C60491p4 p4Var) {
        this.f172446d = p4Var;
    }

    public final void run() {
        C60491p4 p4Var = this.f172446d;
        p4Var.f172427o = (ViewGroup) p4Var.f172420e.findViewById(C0966R.C0970id.elo);
        p4Var.f172428p = p4Var.f172420e.findViewById(C0966R.C0970id.eln);
        C60491p4 p4Var2 = this.f172446d;
        ViewGroup viewGroup = p4Var2.f172427o;
        Integer valueOf = viewGroup != null ? Integer.valueOf(viewGroup.indexOfChild(p4Var2)) : null;
        if (valueOf != null && valueOf.intValue() == -1) {
            C62042e.f176370a.mo87010H1(this.f172446d);
            C60491p4 p4Var3 = this.f172446d;
            ViewGroup viewGroup2 = p4Var3.f172427o;
            if (viewGroup2 != null) {
                viewGroup2.addView(p4Var3);
            }
        } else {
            Log.m105924i(this.f172446d.f172423h, "bubbleAttachToParent, have contain child!");
        }
        ViewGroup viewGroup3 = this.f172446d.f172427o;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
        View view = this.f172446d.f172428p;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget$bubbleAttachToParent$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget$bubbleAttachToParent$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C60491p4 p4Var4 = this.f172446d;
        ViewGroup viewGroup4 = p4Var4.f172427o;
        if (viewGroup4 != null) {
            viewGroup4.setTag(Integer.valueOf(p4Var4.getId()));
        }
        C60491p4 p4Var5 = this.f172446d;
        p4Var5.f172436x = 0;
        p4Var5.f172437y = 0;
        p4Var5.mo85451g();
    }
}
