package fy0;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18342r;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19625p0;
import com.tencent.p014mm.storage.C19631t0;
import com.tencent.p014mm.storage.C19632u0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import nr3.C89060f;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import pe3.C47465a;
import qc0.C101093a;
import qc0.C101106m;
import rb0.C48009v0;
import te3.C50129kh;
import te3.C50261lh;
import te3.me4;
import te3.ne4;
import te3.oe4;
import te3.pe4;
import te3.qe4;
import te3.re4;

/* renamed from: fy0.g */
public class C20739g {

    /* renamed from: a */
    public static Map<Long, Integer> f58625a = new HashMap();

    /* renamed from: b */
    public static LinkedList<Long> f58626b = new LinkedList<>();

    /* renamed from: fy0.g$a */
    public class C20740a implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ LinkedList f58627d;

        /* renamed from: e */
        public final /* synthetic */ C50129kh f58628e;

        public C20740a(LinkedList linkedList, C50129kh khVar) {
            this.f58627d = linkedList;
            this.f58628e = khVar;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            C50261lh lhVar;
            Log.m105925i("MicroMsg.ConversationAdapter", "[TRACE_BIZRECCARD] doUpdateRecommendCard check result errType:%d errCode:%d msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            synchronized (C20739g.f58626b) {
                C20739g.f58626b.removeAll(this.f58627d);
            }
            if (i != 0 || i2 != 0 || (lhVar = (C50261lh) cVar.f127056b.f127083a) == null) {
                return 0;
            }
            MultiProcessMMKV.getSingleMMKV("brandService").encode("BizRecommendCardRefreshIntervalSec", Math.min(300, lhVar.f137416e));
            if (lhVar.f137415d == null) {
                Log.m105924i("MicroMsg.ConversationAdapter", "response.RecCard is null");
                return 0;
            }
            LinkedList linkedList = new LinkedList();
            Iterator<me4> it = lhVar.f137415d.iterator();
            while (it.hasNext()) {
                me4 next = it.next();
                Iterator<pe4> it4 = this.f58628e.f136784d.iterator();
                while (it4.hasNext()) {
                    pe4 next2 = it4.next();
                    if (Util.isEqual(next2.f139733d, next.f64244i)) {
                        oe4 oe4 = next.f64240e;
                        if (oe4 == null) {
                            Log.m105924i("MicroMsg.ConversationAdapter", "doUpdateRecommendCard BizInfo is null");
                        } else if ((oe4.f64336f & 1) != 0) {
                            C48009v0.Jx0().mo25785Lo(next.f64244i);
                            C115669n.INSTANCE.idkeyStat(1149, 5, 1, false);
                            Log.m105929w("MicroMsg.ConversationAdapter", "doUpdateRecommendCard delete card by flag %d, msgId %d", Integer.valueOf(next.f64240e.f64336f), Long.valueOf(next.f64244i));
                        } else if (Util.isNullOrNil(oe4.f64334d)) {
                            Log.m105924i("MicroMsg.ConversationAdapter", "doUpdateRecommendCard UserName is null");
                        } else if (Util.isNullOrNil((List) next.f64242g) || next.f64242g.get(0) == null || Util.isNullOrNil(next.f64242g.get(0).f64284g)) {
                            Log.m105924i("MicroMsg.ConversationAdapter", "doUpdateRecommendCard ContentUrl is null");
                        } else if (!Util.isEqual(next.f64243h, next2.f139736g)) {
                            linkedList.add(next);
                        } else {
                            Log.m105924i("MicroMsg.ConversationAdapter", "doUpdateRecommendCard VersionInfo isEqual");
                            qe4 qe4 = next.f64245j;
                            if (qe4 != null && !Util.isEqual(qe4.f185008d, next2.f139737h)) {
                                linkedList.add(next);
                                Log.m105924i("MicroMsg.ConversationAdapter", "doUpdateRecommendCard UserVersionInfo update");
                            }
                        }
                    }
                }
            }
            Log.m105925i("MicroMsg.ConversationAdapter", "doUpdateRecommendCard updateList size %d, RecCard.size %d", Integer.valueOf(linkedList.size()), Integer.valueOf(lhVar.f137415d.size()));
            if (!Util.isNullOrNil((List) linkedList)) {
                C19625p0 Jx0 = C48009v0.Jx0();
                Jx0.getClass();
                if (!Util.isNullOrNil((List) linkedList)) {
                    LinkedList linkedList2 = new LinkedList();
                    C89060f.m111322a().mo123064p(new C19632u0(Jx0, linkedList, linkedList2)).mo123062e(new C19631t0(Jx0, linkedList2));
                }
            }
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m22689a(int i) {
        return (System.currentTimeMillis() / 1000) - ((long) i) > ((long) C20734b.f58616a);
    }

    /* renamed from: b */
    public static void m22690b(C19623o0 o0Var) {
        pe4 e;
        if (o0Var != null && o0Var.mo25758F2()) {
            re4 x2 = o0Var.mo25774x2();
            if (!C18342r.m18907a(o0Var)) {
                int decodeInt = MultiProcessMMKV.getSingleMMKV("brandService").decodeInt("BizRecommendCardRefreshIntervalSec", 300);
                LinkedList linkedList = new LinkedList();
                long currentTimeMillis = System.currentTimeMillis();
                if (!(x2 == null || x2.f64515d == null || Math.abs(currentTimeMillis - x2.f64516e) / 1000 <= ((long) decodeInt) || (e = m22693e(x2, o0Var)) == null)) {
                    linkedList.add(e);
                }
                if (!Util.isNullOrNil((List) linkedList)) {
                    m22691c(linkedList);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m22691c(LinkedList<pe4> linkedList) {
        if (!Util.isNullOrNil((List) linkedList)) {
            LinkedList linkedList2 = new LinkedList();
            synchronized (f58626b) {
                if (!Util.isNullOrNil((List) f58626b)) {
                    LinkedList linkedList3 = new LinkedList();
                    Iterator<pe4> it = linkedList.iterator();
                    while (it.hasNext()) {
                        pe4 next = it.next();
                        if (f58626b.contains(Long.valueOf(next.f139733d))) {
                            linkedList3.add(next);
                        }
                    }
                    linkedList.removeAll(linkedList3);
                    if (Util.isNullOrNil((List) linkedList)) {
                        Log.m105919d("MicroMsg.ConversationAdapter", "doUpdateRecommendCard is doing return %d", Integer.valueOf(linkedList3.size()));
                        return;
                    }
                }
                Iterator<pe4> it4 = linkedList.iterator();
                while (it4.hasNext()) {
                    linkedList2.add(Long.valueOf(it4.next().f139733d));
                }
                f58626b.addAll(linkedList2);
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127066a = new C50129kh();
                bVar.f127067b = new C50261lh();
                bVar.f127068c = "/cgi-bin/mmbiz-bin/timeline/bizrecommendcard";
                bVar.f127069d = 2787;
                C47350c a = bVar.mo72403a();
                C50129kh khVar = (C50129kh) a.f127055a.f127080a;
                khVar.f136784d = linkedList;
                C89144l0.m111429e(a, new C20740a(linkedList2, khVar), false);
            }
        }
    }

    /* renamed from: d */
    public static String m22692d() {
        C101106m b = C101093a.m132480b();
        if (b == null || b.f295960e == null || b.f295959d != 0 || !C101093a.m132481c()) {
            return null;
        }
        return b.f295960e;
    }

    /* renamed from: e */
    public static pe4 m22693e(re4 re4, C19623o0 o0Var) {
        if (re4 == null || re4.f64515d == null || o0Var == null) {
            Log.m105924i("MicroMsg.ConversationAdapter", "getTLRecCardLite invalid data");
            return null;
        }
        pe4 pe4 = new pe4();
        if (!Util.isNullOrNil((List) re4.f64515d.f64242g)) {
            Iterator<ne4> it = re4.f64515d.f64242g.iterator();
            while (it.hasNext()) {
                pe4.f139735f.add(it.next().f64284g);
            }
        }
        pe4.f139734e = o0Var.field_talker;
        pe4.f139733d = o0Var.field_msgId;
        me4 me4 = re4.f64515d;
        pe4.f139736g = me4.f64243h;
        pe4.f139738i = re4.f64521j;
        qe4 qe4 = me4.f64245j;
        if (qe4 != null) {
            pe4.f139737h = qe4.f185008d;
        }
        return pe4;
    }

    /* renamed from: f */
    public static boolean m22694f(C47465a aVar, C47465a aVar2) {
        if (aVar == null && aVar2 == null) {
            return true;
        }
        if (!(aVar == null || aVar2 == null)) {
            try {
                return Util.isEqual(aVar.toByteArray(), aVar2.toByteArray());
            } catch (IOException e) {
                Log.m105925i("MicroMsg.ConversationAdapter", "isMsgStatInfoProtoEqual exp %s", e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: g */
    public static void m22695g(List<C19623o0> list) {
        re4 x2;
        pe4 e;
        int decodeInt = MultiProcessMMKV.getSingleMMKV("brandService").decodeInt("BizRecommendCardRefreshIntervalSec", 300);
        LinkedList linkedList = new LinkedList();
        long currentTimeMillis = System.currentTimeMillis();
        for (C19623o0 next : list) {
            if (next.mo25758F2() && !C18342r.m18907a(next) && (x2 = next.mo25774x2()) != null && x2.f64515d != null && Math.abs(currentTimeMillis - x2.f64516e) / 1000 > ((long) decodeInt) && (e = m22693e(x2, next)) != null) {
                linkedList.add(e);
            }
        }
        if (!Util.isNullOrNil((List) linkedList)) {
            m22691c(linkedList);
        }
    }
}
