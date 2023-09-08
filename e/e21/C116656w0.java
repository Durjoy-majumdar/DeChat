package e21;

import android.view.animation.Animation;
import com.tencent.p014mm.sdk.platformtools.Log;
import e21.C116645t;
import e21.C116648v0;
import java.util.LinkedList;

/* renamed from: e21.w0 */
public class C116656w0 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C116645t.C116647b f349793a;

    /* renamed from: b */
    public final /* synthetic */ int f349794b;

    /* renamed from: c */
    public final /* synthetic */ C116648v0.C116655g f349795c;

    public C116656w0(C116648v0.C116655g gVar, C116645t.C116647b bVar, int i) {
        this.f349795c = gVar;
        this.f349793a = bVar;
        this.f349794b = i;
    }

    public void onAnimationEnd(Animation animation) {
        this.f349795c.f349785e.f349893Q.setVisibility(8);
        Log.m105918d("MicroMsg.ToastAnimationHelper", "Animation end. TransId=" + this.f349793a.f349754e);
        int i = 0;
        while (true) {
            if (i >= ((LinkedList) this.f349795c.f349784d.f349873w).size()) {
                break;
            } else if (((C116645t.C116647b) ((LinkedList) this.f349795c.f349784d.f349873w).get(i)).f349754e.equals(this.f349793a.f349754e)) {
                ((C116645t.C116647b) ((LinkedList) this.f349795c.f349784d.f349873w).get(i)).f349772s = true;
                Log.m105918d("MicroMsg.ToastAnimationHelper", "Update msg animation status. TransId=" + this.f349793a.f349754e);
                break;
            } else {
                i++;
            }
        }
        this.f349795c.f349787g.mo175146k8(this.f349794b);
        C116648v0.C116655g gVar = this.f349795c;
        gVar.f349781a = false;
        gVar.mo180650a(this.f349794b);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
