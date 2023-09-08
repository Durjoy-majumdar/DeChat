package dp1;

import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C31543z5;
import ef1.C58553c;
import ef1.C58564i;
import ef1.C7637b;
import ef1.C7647p;
import fe1.C58961d;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o40.C61926c;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C64284cg;
import te3.C64441i93;
import te3.C64654qd;
import te3.db4;
import te3.op4;

/* renamed from: dp1.q1 */
public class C58398q1 extends C58403t {

    /* renamed from: u */
    public HashMap<Long, C58401r1> f167309u = new HashMap<>();

    /* renamed from: v */
    public HashMap<Long, C58401r1> f167310v = new HashMap<>();

    /* renamed from: dp1.q1$a */
    public static final class C58399a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58398q1 f167311d;

        /* renamed from: e */
        public final /* synthetic */ String f167312e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58399a(C58398q1 q1Var, String str) {
            super(0);
            this.f167311d = q1Var;
            this.f167312e = str;
        }

        public Object invoke() {
            C58398q1 q1Var = this.f167311d;
            HashMap<Long, C58401r1> hashMap = q1Var.f167310v;
            String str = this.f167312e;
            for (Map.Entry next : hashMap.entrySet()) {
                if (!C87412m.m108589b(str, "onRelease")) {
                    q1Var.mo83236Q1((C58401r1) next.getValue(), false);
                } else if (q1Var.f167309u.get(next.getKey()) == null) {
                    q1Var.mo83236Q1((C58401r1) next.getValue(), false);
                }
            }
            if (C87412m.m108589b(this.f167312e, "onInvisible")) {
                C58398q1 q1Var2 = this.f167311d;
                q1Var2.f167309u.putAll(q1Var2.f167310v);
            }
            this.f167311d.f167310v = new HashMap<>();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58398q1(MMFragmentActivity mMFragmentActivity, C49712hj1 hj12) {
        super(mMFragmentActivity, hj12);
        C87412m.m108594g(mMFragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(hj12, "contextObj");
    }

    /* renamed from: B1 */
    public void mo2331B1(C7637b bVar) {
        List<C58564i> list;
        FinderItem finderItem;
        FinderItem finderItem2;
        C87412m.m108594g(bVar, "event");
        if (bVar instanceof C7647p) {
            C7647p pVar = (C7647p) bVar;
            if (pVar.f25971c != pVar.f25973e || pVar.f25974f != pVar.f25972d) {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                hashSet.addAll(this.f167310v.keySet());
                List<C58564i> list2 = pVar.f25976h;
                if (list2 != null) {
                    for (C58564i iVar : list2) {
                        hashSet.add(Long.valueOf(iVar.f167636a.getItemId()));
                        hashSet2.add(Long.valueOf(iVar.f167636a.getItemId()));
                    }
                }
                List<C58564i> list3 = pVar.f25975g;
                if (list3 != null) {
                    ArrayList<C58564i> arrayList = new ArrayList<>();
                    for (T next : list3) {
                        if (!hashSet.contains(Long.valueOf(((C58564i) next).f167636a.getItemId()))) {
                            arrayList.add(next);
                        }
                    }
                    for (C58564i iVar2 : arrayList) {
                        long itemId = iVar2.f167636a.getItemId();
                        long j = bVar.f25941a;
                        C0740i2 i2Var = iVar2.f167636a;
                        if (i2Var instanceof BaseFinderFeed) {
                            C87412m.m108592e(i2Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                            finderItem2 = ((BaseFinderFeed) i2Var).mo3513o();
                        } else {
                            finderItem2 = null;
                        }
                        C58401r1 r1Var = new C58401r1(itemId, j, finderItem2);
                        r1Var.f167316d = iVar2.f167637b;
                        r1Var.f167317e = iVar2.f167638c;
                        mo83236Q1(r1Var, true);
                    }
                }
                for (Map.Entry next2 : this.f167310v.entrySet()) {
                    if (!hashSet2.contains(next2.getKey())) {
                        mo83236Q1((C58401r1) next2.getValue(), false);
                    }
                }
                HashMap<Long, C58401r1> hashMap = new HashMap<>();
                if (this.f167332p && (list = pVar.f25976h) != null) {
                    for (C58564i iVar3 : list) {
                        C58401r1 r1Var2 = this.f167310v.get(Long.valueOf(iVar3.f167636a.getItemId()));
                        if (r1Var2 != null) {
                            hashMap.put(Long.valueOf(iVar3.f167636a.getItemId()), r1Var2);
                        } else {
                            C0740i2 i2Var2 = iVar3.f167636a;
                            long itemId2 = i2Var2.getItemId();
                            long j2 = bVar.f25941a;
                            C0740i2 i2Var3 = iVar3.f167636a;
                            if (i2Var3 instanceof BaseFinderFeed) {
                                C87412m.m108592e(i2Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                                finderItem = ((BaseFinderFeed) i2Var3).mo3513o();
                            } else {
                                finderItem = null;
                            }
                            C58401r1 r1Var3 = new C58401r1(itemId2, j2, finderItem);
                            if (i2Var2 instanceof BaseFinderFeed) {
                                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var2;
                                if (baseFinderFeed.mo3471E().length() > 0) {
                                    r1Var3.f167318f = baseFinderFeed.mo3471E();
                                }
                            }
                            r1Var3.f167316d = iVar3.f167637b;
                            r1Var3.f167317e = iVar3.f167638c;
                            hashMap.put(Long.valueOf(iVar3.f167636a.getItemId()), r1Var3);
                            C58403t.f167322q.mo83252g(this.f167327h, r1Var3, mo8591N1(r1Var3), true);
                        }
                    }
                }
                this.f167310v = hashMap;
            }
        }
    }

    /* renamed from: C1 */
    public void mo2332C1() {
        mo8582P1("onRelease");
        super.mo2332C1();
    }

    /* renamed from: J1 */
    public void mo8581J1() {
        this.f167332p = false;
        this.f167309u.putAll(this.f167310v);
        mo8582P1("onInvisible");
    }

    /* renamed from: N1 */
    public JSONObject mo8591N1(C58401r1 r1Var) {
        C87412m.m108594g(r1Var, "record");
        return r1Var.f167318f;
    }

    /* renamed from: P1 */
    public void mo8582P1(String str) {
        C87412m.m108594g(str, "invokeSource");
        C13442s8.f38060Q0.getClass();
        C61926c.m72661F(C13442s8.f38061R0, new C58399a(this, str));
    }

    /* renamed from: Q1 */
    public final db4 mo83236Q1(C58401r1 r1Var, boolean z) {
        String str;
        String str2;
        if (r1Var.f167319g == 0) {
            r1Var.f167319g = C31543z5.m39453c();
        }
        db4 db4 = new db4();
        BitSet bitSet = new BitSet(64);
        db4.f182676d = r1Var.f167313a;
        FinderItem finderItem = r1Var.f167315c;
        String str3 = "";
        if (finderItem == null || (str = finderItem.getObjectNonceId()) == null) {
            str = str3;
        }
        db4.f182680h = str;
        db4.f182677e = new C64654qd();
        db4.f182678f = new op4();
        db4.f182679g = new C64441i93();
        FinderItem finderItem2 = r1Var.f167315c;
        if (!(finderItem2 == null || (str2 = finderItem2.field_username) == null)) {
            str3 = str2;
        }
        db4.f182681i = str3;
        float f = ((float) (r1Var.f167319g - r1Var.f167314b)) / 1000.0f;
        int i = 1;
        if (f < 0.5f) {
            bitSet.set(21, true);
        } else if (f < 1.0f) {
            bitSet.set(22, true);
        } else if (f < 2.0f) {
            bitSet.set(23, true);
        } else if (f < 3.0f) {
            bitSet.set(24, true);
        } else if (f < 5.0f) {
            bitSet.set(25, true);
        } else if (f < 10.0f) {
            bitSet.set(26, true);
        } else if (f < 20.0f) {
            bitSet.set(27, true);
        } else if (f < 30.0f) {
            bitSet.set(28, true);
        } else if (f < 40.0f) {
            bitSet.set(29, true);
        } else if (f < 50.0f) {
            bitSet.set(30, true);
        } else {
            bitSet.set(31, true);
        }
        long j = bitSet.toLongArray()[0];
        C64654qd qdVar = db4.f182677e;
        if (qdVar != null) {
            qdVar.f184997d = j;
        }
        op4 op4 = db4.f182678f;
        if (op4 != null) {
            op4.f184688e = (int) f;
        }
        C64441i93 i932 = db4.f182679g;
        if (i932 != null) {
            i932.f183651f = (int) f;
        }
        if (i932 != null) {
            i932.f183662t = r1Var.f167316d;
        }
        if (i932 != null) {
            i932.f183661s = z ^ true ? 1 : 0;
        }
        FinderItem finderItem3 = r1Var.f167315c;
        if (finderItem3 != null) {
            if (i932 != null) {
                i932.f183658p = finderItem3.getLikeFlag() != 0 ? 1 : 0;
            }
            C64441i93 i933 = db4.f182679g;
            if (i933 != null) {
                C58961d.C58963b bVar = C58961d.f168673a;
                String userName = finderItem3.getUserName();
                C64284cg bizInfo = finderItem3.getBizInfo();
                i933.f183657o = C58961d.C58963b.m68836h(bVar, userName, bizInfo != null ? bizInfo.f182468d : null, false, false, 12, (Object) null) ? 1 : 0;
            }
            C64441i93 i934 = db4.f182679g;
            if (i934 != null) {
                if (finderItem3.getFavFlag() != 1) {
                    i = 0;
                }
                i934.f183660r = i;
            }
        }
        C58403t.f167322q.mo83252g(this.f167327h, r1Var, mo8591N1(r1Var), false);
        return db4;
    }

    /* renamed from: z1 */
    public boolean mo2333z1(C58553c cVar, C7637b bVar) {
        C87412m.m108594g(cVar, "dispatcher");
        C87412m.m108594g(bVar, "event");
        return bVar instanceof C7647p;
    }
}
