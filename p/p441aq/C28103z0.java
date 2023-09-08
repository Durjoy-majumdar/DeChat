package p441aq;

import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import p008bq.C67309t0;
import p008bq.C92280g1;
import p1072al.C92042f;
import p260wk.C102457e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import wh3.C38145t;
import wh3.C38146u;
import z04.C112550d0;
import z04.C119027c;

@C86522b
/* renamed from: aq.z0 */
public final class C28103z0 extends C86301e implements C92280g1 {

    /* renamed from: d */
    public final C13601g f77495d = C36568h.m40985a(new C28105b(this));

    /* renamed from: aq.z0$a */
    public static final class C28104a implements C92042f {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f77496a;

        public C28104a(CountDownLatch countDownLatch) {
            this.f77496a = countDownLatch;
        }

        /* renamed from: a */
        public void mo55799a(boolean z) {
            this.f77496a.countDown();
        }
    }

    /* renamed from: aq.z0$b */
    public static final class C28105b extends C87413o implements C32224a<LinkedList<String>> {

        /* renamed from: d */
        public final /* synthetic */ C28103z0 f77497d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28105b(C28103z0 z0Var) {
            super(0);
            this.f77497d = z0Var;
        }

        public Object invoke() {
            this.f77497d.getClass();
            LinkedList linkedList = new LinkedList();
            byte[] Lo = C30790w2.m39221h().mo57720g().mo61543Lo("cache_type_send_list");
            if (Lo != null) {
                linkedList.addAll(C112550d0.m153785U(new String(Lo, C119027c.f356488a), new String[]{"_"}, false, 0, 6, (Object) null));
            }
            return linkedList;
        }
    }

    /* renamed from: F0 */
    public void mo55791F0(String str) {
        C87412m.m108594g(str, "md5");
        synchronized (vx0()) {
            vx0().remove(str);
            vx0().addFirst(str);
            while (vx0().size() >= 12) {
                vx0().removeLast();
            }
            wx0(vx0());
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: QQ */
    public String mo55792QQ(String str) {
        C87412m.m108594g(str, "md5");
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(str);
        if (TO == null) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C102457e.f301712a.mo142073e(TO, new C28104a(countDownLatch));
        countDownLatch.await();
        String str2 = TO.mo62640K1() + "_gif";
        if (C86013q1.m106451l(str2) > 0) {
            return str2;
        }
        C86013q1.m106437S(str2, ((C67309t0) C86312j.m106911c(C67309t0.class)).mo91191ZT(TO));
        return str2;
    }

    public boolean contains(String str) {
        C87412m.m108594g(str, "md5");
        return getAll().contains(str);
    }

    public List<String> getAll() {
        LinkedList<String> vx02;
        synchronized (vx0()) {
            vx02 = vx0();
        }
        return vx02;
    }

    public void remove(String str) {
        C87412m.m108594g(str, "md5");
        synchronized (vx0()) {
            vx0().remove(str);
            wx0(vx0());
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public void removeAll() {
        synchronized (vx0()) {
            vx0().clear();
            C30790w2.m39221h().mo57720g().mo61546jo("cache_type_send_list");
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public final LinkedList<String> vx0() {
        return (LinkedList) ((C36570n) this.f77495d).getValue();
    }

    public final void wx0(List<String> list) {
        C38146u g = C30790w2.m39221h().mo57720g();
        byte[] bytes = C110818d0.m150921S(list, "_", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null).getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        g.getClass();
        g.replace(new C38145t("cache_type_send_list", bytes));
    }
}
