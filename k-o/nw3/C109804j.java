package nw3;

import android.os.Handler;
import android.os.Looper;
import as3.C103900s0;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import java.util.LinkedList;
import java.util.List;

/* renamed from: nw3.j */
public class C109804j {

    /* renamed from: a */
    public List<C109807c> f328705a = new LinkedList();

    /* renamed from: b */
    public Handler f328706b = new Handler(Looper.getMainLooper());

    /* renamed from: nw3.j$a */
    public class C109805a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f328707d;

        public C109805a(List list) {
            this.f328707d = list;
        }

        public void run() {
            synchronized (C109804j.this.f328705a) {
                for (C109807c p : C109804j.this.f328705a) {
                    p.mo161059p(this.f328707d);
                }
            }
        }
    }

    /* renamed from: nw3.j$b */
    public class C109806b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f328709d;

        /* renamed from: e */
        public final /* synthetic */ Object f328710e;

        public C109806b(int i, Object obj) {
            this.f328709d = i;
            this.f328710e = obj;
        }

        public void run() {
            synchronized (C109804j.this.f328705a) {
                for (C109807c g : C109804j.this.f328705a) {
                    g.mo161050g(this.f328709d, this.f328710e);
                }
            }
        }
    }

    /* renamed from: nw3.j$c */
    public interface C109807c {
        /* renamed from: a */
        void mo161043a(int i);

        /* renamed from: b */
        void mo161044b();

        /* renamed from: c */
        void mo161045c(int i);

        /* renamed from: d */
        void mo161046d(String str, boolean z);

        /* renamed from: d0 */
        void mo161047d0();

        /* renamed from: e */
        void mo161048e();

        /* renamed from: f */
        void mo161049f(int i);

        /* renamed from: g */
        void mo161050g(int i, Object obj);

        /* renamed from: h */
        void mo161051h(MultiTalkGroup multiTalkGroup, long j);

        /* renamed from: i */
        void mo161052i(String str, int i);

        /* renamed from: j */
        void mo161053j(int i, MultiTalkGroup multiTalkGroup);

        /* renamed from: k */
        void mo161054k(int i);

        /* renamed from: l */
        void mo161055l(boolean z);

        /* renamed from: m */
        void mo161056m();

        /* renamed from: n */
        void mo161057n();

        /* renamed from: o */
        void mo161058o(MultiTalkGroup multiTalkGroup);

        /* renamed from: p */
        void mo161059p(List<MultiTalkGroup> list);

        /* renamed from: q */
        void mo161060q(String str, byte[] bArr);

        /* renamed from: r */
        void mo161061r();

        /* renamed from: s */
        void mo161062s(List<C103900s0> list);

        /* renamed from: t */
        void mo161063t(int i);

        /* renamed from: u */
        void mo161064u(String str, int i, int i2);

        /* renamed from: v */
        void mo161065v();

        /* renamed from: w */
        void mo161066w(MultiTalkGroup multiTalkGroup);

        /* renamed from: x */
        void mo161067x(MultiTalkGroup multiTalkGroup, long j);
    }

    /* renamed from: a */
    public void mo161131a(List<MultiTalkGroup> list) {
        C109805a aVar = new C109805a(list);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            aVar.run();
        } else {
            this.f328706b.post(aVar);
        }
    }

    /* renamed from: b */
    public void mo161132b(int i, Object obj) {
        C109806b bVar = new C109806b(i, obj);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            bVar.run();
        } else {
            this.f328706b.post(bVar);
        }
    }
}
