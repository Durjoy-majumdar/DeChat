package cl1;

import a14.C53973z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64197v;
import te3.C52013xs0;
import te3.C64530lp2;
import te3.C64674r41;

/* renamed from: cl1.a1 */
public final class C54943a1 extends C39970c<C45795b> {

    /* renamed from: o */
    public static int f153974o = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_SPEED_INT_SYNC, 400);

    /* renamed from: f */
    public volatile C64530lp2 f153975f;

    /* renamed from: g */
    public C32226l<? super C13604l<? extends LinkedList<C64674r41>, ? extends LinkedList<C52013xs0>>, C13598b0> f153976g;

    /* renamed from: h */
    public final List<Integer> f153977h = C64197v.m75537f(1, 20002, 20032, 20034, 20035);

    /* renamed from: i */
    public final MMHandler f153978i;

    /* renamed from: j */
    public final C54944a f153979j;

    /* renamed from: n */
    public C53973z1 f153980n;

    /* renamed from: cl1.a1$a */
    public static final class C54944a extends ConcurrentLinkedQueue<Object> {
        /* renamed from: f */
        public final void mo75856f(int i) {
            int size = super.size();
            if (i > size) {
                i = size;
            }
            int i2 = 1;
            if (1 <= i) {
                while (true) {
                    poll();
                    if (i2 != i) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: h */
        public final C13604l<LinkedList<C64674r41>, LinkedList<C52013xs0>> mo75857h(int i) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            int size = super.size();
            if (i > size) {
                i = size;
            }
            int i2 = 1;
            if (1 <= i) {
                while (true) {
                    Object poll = poll();
                    if (poll != null) {
                        if (poll instanceof C64674r41) {
                            linkedList.add(poll);
                        } else if (poll instanceof C52013xs0) {
                            linkedList2.add(poll);
                        }
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return new C13604l<>(linkedList, linkedList2);
        }

        public final /* bridge */ int size() {
            return super.size();
        }
    }

    /* renamed from: cl1.a1$b */
    public static final class C54945b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54943a1 f153981d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54945b(C54943a1 a1Var) {
            super(0);
            this.f153981d = a1Var;
        }

        public Object invoke() {
            C54943a1 a1Var = this.f153981d;
            synchronized (a1Var) {
                a1Var.f153979j.clear();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54943a1(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        C64530lp2 lp22 = new C64530lp2();
        lp22.f184130d = 100;
        lp22.f184140q = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_INT_SYNC, 400);
        lp22.f184141r = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_COUNT_INT_SYNC, 1);
        lp22.f184142s = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_SPEED_INT_SYNC, 400);
        this.f153975f = lp22;
        MMHandler mMHandler = new MMHandler("MMFinder.LiveMsgSpeedControlSlice_HANDLER");
        mMHandler.setLogging(false);
        this.f153978i = mMHandler;
        this.f153979j = new C54944a();
    }

    /* renamed from: c3 */
    public final void mo75855c3() {
        Log.m105924i("MMFinder.LiveMsgSpeedControlSlice", "[onMiniWindow]");
        C53973z1 z1Var = this.f153980n;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f153980n = null;
        this.f153978i.removeCallbacksAndMessages((Object) null);
        this.f153976g = null;
    }

    public void onCleared() {
        Log.m105924i("MMFinder.LiveMsgSpeedControlSlice", "[onCleared]");
        C53973z1 z1Var = this.f153980n;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f153980n = null;
        this.f153978i.removeCallbacksAndMessages((Object) null);
        C61926c.m72657B("MMFinder.LiveMsgSpeedControlSlice", true, new C54945b(this));
        this.f153976g = null;
    }
}
