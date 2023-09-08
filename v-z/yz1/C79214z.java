package yz1;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.p136ui.chatting.component.FootComponent$$i;
import com.tencent.p014mm.p136ui.chatting.component.GroupTodoComponent;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$p;
import kg3.C76577a;
import p1136n3.C109678b;
import yz1.C79206x;

/* renamed from: yz1.z */
public class C79214z implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C79206x f232549d;

    /* renamed from: yz1.z$a */
    public class C79215a implements Runnable {

        /* renamed from: yz1.z$a$a */
        public class C79216a implements ValueAnimator.AnimatorUpdateListener {
            public C79216a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C79206x xVar = C79214z.this.f232549d;
                xVar.f232520e.update(xVar.f232529n, intValue, -1, -1);
            }
        }

        public C79215a() {
        }

        public void run() {
            C79206x xVar = C79214z.this.f232549d;
            xVar.f232521f.getLocationInWindow(xVar.f232532q);
            C79206x xVar2 = C79214z.this.f232549d;
            xVar2.f232529n = (xVar2.f232521f.getWidth() - C79214z.this.f232549d.f232520e.getWidth()) - C76577a.m92151b(C79214z.this.f232549d.f232517b, 8);
            C79206x xVar3 = C79214z.this.f232549d;
            xVar3.f232530o = (xVar3.f232532q[1] - xVar3.f232520e.getHeight()) - C76577a.m92151b(C79214z.this.f232549d.f232517b, 8);
            C79206x xVar4 = C79214z.this.f232549d;
            C79206x.C79210d dVar = xVar4.f232536u;
            if (dVar != null) {
                if (!(((ChatFooter$$p) dVar).f212033a.f211884i1 == 0)) {
                    GroupTodoComponent.C73357g gVar = ((ChatFooter$$p) dVar).f212033a.f211765H1;
                    xVar4.f232530o += gVar != null ? ((FootComponent$$i) gVar).mo102204a() : 0;
                }
            }
            C79206x xVar5 = C79214z.this.f232549d;
            xVar5.f232516a = ValueAnimator.ofInt(new int[]{xVar5.f232531p, xVar5.f232530o});
            C79214z.this.f232549d.f232516a.setDuration(175);
            C79214z.this.f232549d.f232516a.setInterpolator(new C109678b());
            C79214z.this.f232549d.f232516a.addUpdateListener(new C79216a());
            C79214z.this.f232549d.f232516a.start();
            C79206x xVar6 = C79214z.this.f232549d;
            xVar6.f232531p = xVar6.f232530o;
        }
    }

    public C79214z(C79206x xVar) {
        this.f232549d = xVar;
    }

    public void onGlobalLayout() {
        this.f232549d.f232521f.postDelayed(new C79215a(), 175);
    }
}
