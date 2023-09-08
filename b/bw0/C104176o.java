package bw0;

import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.view.FloatMenuView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import yv0.C112505b;
import yv0.C112506c;

/* renamed from: bw0.o */
public class C104176o implements C112505b {

    /* renamed from: a */
    public final /* synthetic */ FloatMenuView f308417a;

    public C104176o(FloatMenuView floatMenuView) {
        this.f308417a = floatMenuView;
    }

    /* renamed from: a */
    public void mo145797a(BallInfo ballInfo) {
        FloatMenuView floatMenuView = this.f308417a;
        int i = FloatMenuView.f312029F;
        Iterator it = ((CopyOnWriteArraySet) floatMenuView.f312041j).iterator();
        while (it.hasNext()) {
            ((C112506c) it.next()).mo145797a(ballInfo);
        }
    }

    /* renamed from: d */
    public void mo145798d(BallInfo ballInfo, int i) {
        Iterator it = ((CopyOnWriteArraySet) this.f308417a.f312041j).iterator();
        while (it.hasNext()) {
            ((C112506c) it.next()).mo145798d(ballInfo, i);
        }
    }
}
