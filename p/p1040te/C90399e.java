package p1040te;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner;
import com.tencent.p014mm.matrix.C80989h;
import com.tencent.xweb.IXWebBroadcastListener;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p1040te.C90397d;
import p1046ue.C90650d;
import p1046ue.C90652e;
import p1053ve.C90767a;
import p1053ve.C90770d;
import p723vf.C118672d;

/* renamed from: te.e */
public class C90399e extends C90397d implements C80407h {

    /* renamed from: e */
    public final long f259412e;

    /* renamed from: f */
    public Handler f259413f = new Handler(C90770d.f260665d.getLooper());

    /* renamed from: g */
    public C90402c f259414g;

    /* renamed from: h */
    public C90401b f259415h;

    /* renamed from: i */
    public List<C90650d> f259416i = new LinkedList();

    /* renamed from: j */
    public Runnable f259417j = new C90400a();

    /* renamed from: te.e$a */
    public class C90400a implements Runnable {
        public C90400a() {
        }

        public void run() {
            boolean z;
            synchronized (C90399e.this.f259416i) {
                LinkedList linkedList = new LinkedList();
                Iterator<C90650d> it = C90399e.this.f259416i.iterator();
                while (it.hasNext()) {
                    C90650d next = it.next();
                    if (next != null) {
                        if (C90399e.this.f259414g != null) {
                            C90652e eVar = C90652e.f260459f;
                            synchronized (eVar.f260461b) {
                                z = !((LinkedList) eVar.f260461b).contains(next);
                            }
                            if (!z) {
                                C90399e.this.f259414g.mo112812a(next);
                                linkedList.add(next);
                            }
                        }
                        it.remove();
                    }
                }
                C90401b bVar = C90399e.this.f259415h;
                if (bVar != null) {
                    ((C80989h.C80991b) bVar).mo112813a(linkedList);
                }
            }
        }
    }

    /* renamed from: te.e$b */
    public interface C90401b {
    }

    /* renamed from: te.e$c */
    public interface C90402c {
        /* renamed from: a */
        void mo112812a(C90650d dVar);
    }

    public C90399e(long j) {
        this.f259412e = j;
    }

    /* renamed from: a */
    public void mo124620a(Application application) {
        ProcessExplicitBackgroundOwner.INSTANCE.observeForever(this);
        application.registerActivityLifecycleCallbacks(this);
        C118672d.m167353c("matrix.LeakMonitorDefault", IXWebBroadcastListener.STAGE_START, new Object[0]);
        Activity a = C90767a.m113828a();
        if (a != null) {
            C90397d.C90398a aVar = new C90397d.C90398a(this, a.hashCode(), new C90396c());
            aVar.mo124618b();
            synchronized (this.f259409d) {
                ((LinkedList) this.f259409d).add(aVar);
            }
        }
    }

    public void off() {
        this.f259413f.removeCallbacks(this.f259417j);
    }

    /* renamed from: on */
    public void mo60742on() {
        this.f259413f.postDelayed(this.f259417j, this.f259412e);
    }
}
