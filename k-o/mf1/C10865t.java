package mf1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: mf1.t */
public final class C10865t {

    /* renamed from: c */
    public static final C10867b f32442c = new C10867b((C8480h) null);

    /* renamed from: d */
    public static final C13601g<C10865t> f32443d = C36568h.m40985a(C10866a.f32446d);

    /* renamed from: a */
    public final ConcurrentLinkedQueue<C10827i1> f32444a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    public final ConcurrentHashMap<C10827i1, Boolean> f32445b = new ConcurrentHashMap<>();

    /* renamed from: mf1.t$a */
    public static final class C10866a extends C87413o implements C32224a<C10865t> {

        /* renamed from: d */
        public static final C10866a f32446d = new C10866a();

        public C10866a() {
            super(0);
        }

        public Object invoke() {
            return new C10865t();
        }
    }

    /* renamed from: mf1.t$b */
    public static final class C10867b {
        public C10867b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C10865t mo11085a() {
            return (C10865t) ((C36570n) C10865t.f32443d).getValue();
        }
    }

    /* renamed from: a */
    public final void mo11084a(List<? extends FinderItem> list) {
        if (list != null) {
            for (FinderItem feedObject : list) {
                FinderObjectDesc finderObjectDesc = feedObject.getFeedObject().objectDesc;
                if (finderObjectDesc != null) {
                    String str = finderObjectDesc.description;
                }
            }
            for (C10827i1 i1Var : this.f32444a) {
                ConcurrentHashMap<C10827i1, Boolean> concurrentHashMap = this.f32445b;
                C87412m.m108593f(i1Var, "loader");
                Boolean bool = concurrentHashMap.get(i1Var);
                if (bool == null) {
                    bool = Boolean.TRUE;
                }
                if (bool.booleanValue()) {
                    i1Var.mo11050X(list);
                }
            }
        }
    }
}
