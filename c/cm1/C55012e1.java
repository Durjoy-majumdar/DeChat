package cm1;

import android.os.Message;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import dp1.C58417y0;
import ef1.C58564i;
import er1.C58741j5;
import er1.C58784w3;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import je1.C46550x4;
import lc3.C10485b;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import os1.C11749q;
import os1.C62165o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C77813z;
import te3.C49712hj1;
import te3.C51449tu2;
import te3.C51521ub1;
import up1.C37521f;
import vp1.C65834e;

/* renamed from: cm1.e1 */
public final class C55012e1 implements C11385n {

    /* renamed from: d */
    public static final C55012e1 f154468d;

    /* renamed from: e */
    public static LinkedList<C51449tu2> f154469e = new LinkedList<>();

    /* renamed from: f */
    public static final C13601g f154470f = C36568h.m40985a(C28616a.f78521d);

    /* renamed from: g */
    public static final MMHandler f154471g = new MMHandler("Finder.FinderMarkReadLogic", (MMHandler.Callback) C55013b.f154474d);

    /* renamed from: h */
    public static AtomicInteger f154472h = new AtomicInteger(0);

    /* renamed from: i */
    public static HashMap<Integer, HashMap<Long, C55030s2>> f154473i = new HashMap<>();

    /* renamed from: cm1.e1$a */
    public static final class C28616a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C28616a f78521d = new C28616a();

        public C28616a() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            return C37521f.f99568y5.mo60266n();
        }
    }

    /* renamed from: cm1.e1$b */
    public static final class C55013b implements MMHandler.Callback {

        /* renamed from: d */
        public static final C55013b f154474d = new C55013b();

        public final boolean handleMessage(Message message) {
            boolean z;
            C13598b0 b0Var;
            C13598b0 b0Var2;
            C55030s2 s2Var;
            Message message2 = message;
            C87412m.m108594g(message2, LocaleUtil.ITALIAN);
            int i = message2.what;
            if (i == 0) {
                Object obj = message2.obj;
                if (obj instanceof LinkedList) {
                    C87412m.m108592e(obj, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.protocal.protobuf.MarkReadStat>");
                    int i2 = 0;
                    for (C51449tu2 tu22 : (LinkedList) obj) {
                        C55012e1 e1Var = C55012e1.f154468d;
                        int i3 = tu22.f142418e;
                        long j = tu22.f142417d;
                        int i4 = tu22.f142428r;
                        Iterator<T> it = C55012e1.f154469e.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            C51449tu2 tu23 = (C51449tu2) it.next();
                            if (tu23.f142418e == i3 && tu23.f142417d == j && tu23.f142428r == i4) {
                                z = true;
                                break;
                            }
                        }
                        if (!z) {
                            i2++;
                            C55012e1.f154469e.add(tu22);
                            int i5 = tu22.f142420g;
                            if (i5 == 156 || i5 == 155 || i5 == 170 || i5 == 171) {
                                i5 = 17;
                            }
                            HashMap hashMap = C55012e1.f154473i.get(Integer.valueOf(i5));
                            if (!(hashMap == null || (s2Var = (C55030s2) hashMap.get(Long.valueOf(tu22.f142417d))) == null)) {
                                s2Var.f154487e = true;
                                s2Var.f154489g = tu22;
                            }
                            FinderItem e = C65834e.f189316a.mo89871e(tu22.f142417d);
                            if (e != null) {
                                Log.m105924i("Finder.FinderMarkReadLogic", "mark read scene:" + tu22.f142418e + ", subScene:" + tu22.f142419f + ", commScene:" + tu22.f142420g + ", " + C61926c.m72691p(tu22.f142417d) + ", nickname:" + e.getNickName() + ", desc:" + C58784w3.f168295a.mo83950n0(e.getDescription()) + ", expose:" + tu22.f142422i + ", actionType=" + tu22.f142428r);
                                b0Var2 = C13598b0.f38549a;
                            } else {
                                b0Var2 = null;
                            }
                            if (b0Var2 == null) {
                                Log.m105924i("Finder.FinderMarkReadLogic", "mark read " + C61926c.m72691p(tu22.f142417d));
                            }
                        } else {
                            FinderItem e2 = C65834e.f189316a.mo89871e(tu22.f142417d);
                            if (e2 != null) {
                                Log.m105924i("Finder.FinderMarkReadLogic", "contains read scene:" + tu22.f142418e + ", subScene:" + tu22.f142419f + ", commScene:" + tu22.f142420g + ", " + C61926c.m72691p(tu22.f142417d) + ", nickname:" + e2.getNickName() + ", desc:" + C58784w3.f168295a.mo83950n0(e2.getDescription()) + ", expose:" + tu22.f142422i + ", actionType=" + tu22.f142428r);
                                b0Var = C13598b0.f38549a;
                            } else {
                                b0Var = null;
                            }
                            if (b0Var == null) {
                                C55012e1 e1Var2 = C55012e1.f154468d;
                                Log.m105924i("Finder.FinderMarkReadLogic", "contains read " + C61926c.m72691p(tu22.f142417d));
                            }
                        }
                    }
                    int size = C55012e1.f154469e.size();
                    int i6 = 1000;
                    if (size > 1000 && 1000 <= size) {
                        while (true) {
                            C55012e1.f154469e.removeFirst();
                            if (i6 == size) {
                                break;
                            }
                            i6++;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("final add ");
                    sb.append(i2);
                    sb.append(' ');
                    sb.append(size);
                    sb.append(' ');
                    C55012e1 e1Var3 = C55012e1.f154468d;
                    sb.append(C55012e1.f154469e.size());
                    Log.m105924i("Finder.FinderMarkReadLogic", sb.toString());
                    C55012e1.m62072a(e1Var3);
                    if (i2 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("checkSend: size = ");
                        sb4.append(C55012e1.f154469e.size());
                        sb4.append(" feedCountThreshold：");
                        C13601g gVar = C55012e1.f154470f;
                        sb4.append(((Number) ((C36570n) gVar).getValue()).intValue());
                        Log.m105924i("Finder.FinderMarkReadLogic", sb4.toString());
                        if (C55012e1.f154469e.size() >= ((Number) ((C36570n) gVar).getValue()).intValue()) {
                            MMHandler mMHandler = C55012e1.f154471g;
                            mMHandler.removeMessages(1);
                            mMHandler.sendEmptyMessage(1);
                        }
                    }
                }
            } else if (i == 1) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("SEND markReadItemList size: ");
                C55012e1 e1Var4 = C55012e1.f154468d;
                sb5.append(C55012e1.f154469e.size());
                Log.m105924i("Finder.FinderMarkReadLogic", sb5.toString());
                if (C55012e1.f154469e.size() > 0) {
                    C55012e1.m62073b(e1Var4);
                    e1Var4.mo76064h();
                }
            } else if (i == 2) {
                Object obj2 = message2.obj;
                if (obj2 instanceof LinkedList) {
                    C55012e1 e1Var5 = C55012e1.f154468d;
                    LinkedList<C51449tu2> linkedList = C55012e1.f154469e;
                    C87412m.m108592e(obj2, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.protocal.protobuf.MarkReadStat>");
                    linkedList.removeAll((LinkedList) obj2);
                    C55012e1.m62072a(e1Var5);
                }
            } else if (i == 3) {
                C55012e1 e1Var6 = C55012e1.f154468d;
                String str = C58741j5.f168194k + "markread.info";
                if (C86013q1.m106450k(str)) {
                    byte[] O = C86013q1.m106433O(str, 0, -1);
                    C51521ub1 ub12 = new C51521ub1();
                    try {
                        ub12.parseFrom(O);
                        LinkedList<C51449tu2> linkedList2 = ub12.f142720e;
                        C87412m.m108593f(linkedList2, "saveObj.readStats");
                        C55012e1.f154469e = linkedList2;
                    } catch (Exception e3) {
                        Log.printErrStackTrace("Finder.FinderMarkReadLogic", e3, "read", new Object[0]);
                    }
                    Log.m105924i("Finder.FinderMarkReadLogic", "readFromFile " + str);
                }
            } else if (i == 4) {
                C55012e1.m62072a(C55012e1.f154468d);
            } else if (i == 5) {
                C55012e1.m62073b(C55012e1.f154468d);
                C55012e1.f154473i = new HashMap<>();
            }
            return false;
        }
    }

    static {
        C55012e1 e1Var = new C55012e1();
        f154468d = e1Var;
        C86709a0.m107524d().mo123455a(3520, e1Var);
    }

    /* renamed from: a */
    public static final void m62072a(C55012e1 e1Var) {
        e1Var.getClass();
        C51521ub1 ub12 = new C51521ub1();
        ub12.f142720e = f154469e;
        byte[] byteArray = ub12.toByteArray();
        StringBuilder sb = new StringBuilder();
        String str = C58741j5.f168194k;
        sb.append(str);
        sb.append("markread.info");
        String sb4 = sb.toString();
        if (C86013q1.m106450k(sb4)) {
            C86013q1.m106445f(sb4);
        }
        if (!C86013q1.m106450k(str)) {
            C86013q1.m106461v(str);
        }
        C86013q1.m106437S(sb4, byteArray);
        Log.m105924i("Finder.FinderMarkReadLogic", "saveToFile " + sb4);
    }

    /* renamed from: b */
    public static final void m62073b(C55012e1 e1Var) {
        e1Var.getClass();
        int i = 0;
        while (i < f154469e.size()) {
            LinkedList linkedList = new LinkedList();
            int i2 = i + 50;
            if (f154469e.size() > i2) {
                linkedList.addAll(f154469e.subList(i, i2));
            } else {
                LinkedList<C51449tu2> linkedList2 = f154469e;
                linkedList.addAll(linkedList2.subList(i, linkedList2.size()));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("start to send new cgi ");
            sb.append(linkedList.size());
            sb.append(' ');
            LinkedList<C51449tu2> linkedList3 = f154469e;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList3, 10));
            for (C51449tu2 tu22 : linkedList3) {
                arrayList.add(C61926c.m72691p(tu22.f142417d));
            }
            sb.append(arrayList);
            Log.m105924i("Finder.FinderMarkReadLogic", sb.toString());
            C46550x4 x4Var = new C46550x4(linkedList);
            C86709a0.m107524d().mo123455a(3520, e1Var);
            C86709a0.m107524d().mo123460f(x4Var);
            i = i2;
        }
    }

    /* renamed from: c */
    public final void mo76059c(List<C58564i> list, C49712hj1 hj12) {
        C87412m.m108594g(hj12, "contextObj");
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (C58564i iVar : list) {
                arrayList.add(iVar.f167636a);
            }
            LinkedList linkedList = new LinkedList();
            for (C58564i iVar2 : list) {
                if (iVar2.f167636a.getItemId() != 0) {
                    if (!(iVar2.f167636a instanceof BaseFinderFeed)) {
                        C58784w3.f168295a.getClass();
                        if (!C58784w3.f168298d.contains(Integer.valueOf(iVar2.f167636a.mo75c()))) {
                        }
                    }
                    C51449tu2 tu22 = new C51449tu2();
                    tu22.f142423j = iVar2.f167637b;
                    tu22.f142417d = iVar2.f167636a.getItemId();
                    f154468d.mo76062f(tu22, hj12.f134675i, hj12.f134677n);
                    tu22.f142421h = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(iVar2.f167636a.getItemId(), hj12.f134675i);
                    linkedList.add(tu22);
                }
            }
            mo76061e(linkedList, arrayList, hj12);
        }
    }

    /* renamed from: d */
    public final void mo76060d(LinkedList<C51449tu2> linkedList) {
        C87412m.m108594g(linkedList, "itemList");
        Log.m105924i("Finder.FinderMarkReadLogic", "addMarkReadItemList " + linkedList.size());
        Message obtainMessage = f154471g.obtainMessage(0);
        obtainMessage.obj = linkedList;
        obtainMessage.sendToTarget();
    }

    /* renamed from: e */
    public final void mo76061e(LinkedList<C51449tu2> linkedList, List<? extends C0740i2> list, C49712hj1 hj12) {
        Class<FinderCommonFeatureService> cls = FinderCommonFeatureService.class;
        C87412m.m108594g(linkedList, "itemList");
        C87412m.m108594g(hj12, "contextObj");
        mo76060d(linkedList);
        int i = hj12.f134675i;
        if (i == 17 || i == 18 || i == 156 || i == 155 || i == 171 || i == 170 || i == 25) {
            ((C11749q) C39818r.f106831a.mo62446e(cls).mo75002a(C11749q.class)).mo11612c3(hj12.f134675i, list);
        } else if (i == 51) {
            C62165o oVar = (C62165o) C39818r.f106831a.mo62446e(cls).mo75002a(C62165o.class);
            oVar.getClass();
            synchronized (oVar.f176743g) {
                for (C51449tu2 tu22 : linkedList) {
                    Iterator<C51449tu2> it = oVar.f176743g.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (it.next().f142417d == tu22.f142417d) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 < 0 && !oVar.f176744h.contains(Long.valueOf(tu22.f142417d))) {
                        oVar.f176743g.add(tu22);
                        oVar.f176744h.add(Long.valueOf(tu22.f142417d));
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r9 != 34) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        r7.f142418e = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        r7.f142418e = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76062f(te3.C51449tu2 r7, int r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "markReadStat"
            gy3.C87412m.m108594g(r7, r0)
            r7.f142420g = r8
            r0 = 3
            r1 = 1
            if (r8 == r1) goto L_0x0073
            r2 = 20
            r3 = 4
            if (r8 == r2) goto L_0x006d
            r2 = 22
            r4 = 34
            r5 = 8
            if (r8 == r2) goto L_0x0068
            r2 = 43
            if (r8 == r2) goto L_0x0062
            r2 = 76
            if (r8 == r2) goto L_0x005d
            r2 = 80
            if (r8 == r2) goto L_0x0058
            r2 = 156(0x9c, float:2.19E-43)
            if (r8 == r2) goto L_0x0053
            r2 = 171(0xab, float:2.4E-43)
            if (r8 == r2) goto L_0x0053
            r2 = 2
            switch(r8) {
                case 4: goto L_0x0050;
                case 5: goto L_0x0050;
                case 6: goto L_0x004d;
                case 7: goto L_0x0050;
                case 8: goto L_0x0073;
                case 9: goto L_0x0044;
                default: goto L_0x0030;
            }
        L_0x0030:
            switch(r8) {
                case 15: goto L_0x003f;
                case 16: goto L_0x0062;
                case 17: goto L_0x0053;
                case 18: goto L_0x003a;
                default: goto L_0x0033;
            }
        L_0x0033:
            switch(r8) {
                case 26: goto L_0x0068;
                case 27: goto L_0x0044;
                case 28: goto L_0x0037;
                case 29: goto L_0x0037;
                case 30: goto L_0x0037;
                case 31: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0075
        L_0x0037:
            r7.f142418e = r5
            goto L_0x0075
        L_0x003a:
            r7.f142418e = r1
            r7.f142419f = r2
            goto L_0x0075
        L_0x003f:
            r7.f142418e = r1
            r7.f142419f = r0
            goto L_0x0075
        L_0x0044:
            if (r9 != r4) goto L_0x0049
            r7.f142418e = r5
            goto L_0x0075
        L_0x0049:
            r8 = 5
            r7.f142418e = r8
            goto L_0x0075
        L_0x004d:
            r7.f142418e = r3
            goto L_0x0075
        L_0x0050:
            r7.f142418e = r2
            goto L_0x0075
        L_0x0053:
            r7.f142418e = r1
            r7.f142419f = r1
            goto L_0x0075
        L_0x0058:
            r8 = 10
            r7.f142418e = r8
            goto L_0x0075
        L_0x005d:
            r8 = 9
            r7.f142418e = r8
            goto L_0x0075
        L_0x0062:
            r8 = 7
            r7.f142418e = r8
            r7.f142419f = r3
            goto L_0x0075
        L_0x0068:
            if (r9 != r4) goto L_0x0075
            r7.f142418e = r5
            goto L_0x0075
        L_0x006d:
            r8 = 6
            r7.f142418e = r8
            r7.f142419f = r3
            goto L_0x0075
        L_0x0073:
            r7.f142418e = r0
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cm1.C55012e1.mo76062f(te3.tu2, int, int):void");
    }

    /* renamed from: g */
    public final LinkedList<C51449tu2> mo76063g(int i) {
        C51449tu2 tu22;
        LinkedList<C51449tu2> linkedList = new LinkedList<>();
        int i2 = 0;
        HashMap hashMap = f154473i.get(Integer.valueOf(i != 1 ? i != 3 ? i != 4 ? 0 : 20 : 17 : 18));
        if (hashMap != null) {
            LinkedList linkedList2 = new LinkedList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((C55030s2) entry.getValue()).f154487e) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry value : linkedHashMap.entrySet()) {
                linkedList2.add(value.getValue());
            }
            C77813z.m93908n(linkedList2);
            for (Object next : linkedList2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C55030s2 s2Var = (C55030s2) next;
                    if (i2 < 20 && (tu22 = s2Var.f154489g) != null) {
                        linkedList.add(tu22);
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getStreamMarkReadList ");
        sb.append(i);
        sb.append(' ');
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C51449tu2 tu23 : linkedList) {
            arrayList.add(C61926c.m72691p(tu23.f142417d));
        }
        sb.append(arrayList);
        Log.m105924i("Finder.FinderMarkReadLogic", sb.toString());
        return linkedList;
    }

    /* renamed from: h */
    public final void mo76064h() {
        MMHandler mMHandler = f154471g;
        mMHandler.removeMessages(1);
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderMarkReadReportIntervalSecond", 60);
        Log.m105924i("Finder.FinderMarkReadLogic", "nextSend size: " + f154469e.size() + " delay second: " + b);
        mMHandler.sendEmptyMessageDelayed(1, ((long) b) * 1000);
    }

    /* renamed from: i */
    public final void mo76065i(int i, List<? extends FinderObject> list) {
        int i2;
        int i3 = i;
        C87412m.m108594g(list, "feedList");
        if (i3 == 1) {
            i2 = 18;
        } else if (i3 == 3) {
            i2 = 17;
        } else if (i3 == 4) {
            i2 = 20;
        } else {
            return;
        }
        HashMap hashMap = f154473i.get(Integer.valueOf(i2));
        int size = hashMap != null ? hashMap.size() : 0;
        for (FinderObject finderObject : list) {
            HashMap hashMap2 = f154473i.get(Integer.valueOf(i2));
            C13598b0 b0Var = null;
            if (hashMap2 != null) {
                C55030s2 s2Var = (C55030s2) hashMap2.get(Long.valueOf(finderObject.f164794id));
                if (s2Var != null) {
                    Log.m105924i("Finder.FinderMarkReadLogic", "already in mark read map isRead:" + s2Var.f154487e);
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    Long valueOf = Long.valueOf(finderObject.f164794id);
                    C55030s2 s2Var2 = r7;
                    C55030s2 s2Var3 = new C55030s2(finderObject.f164794id, false, 0, (C51449tu2) null, 14, (C8480h) null);
                    hashMap2.put(valueOf, s2Var2);
                }
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                HashMap<Integer, HashMap<Long, C55030s2>> hashMap3 = f154473i;
                Integer valueOf2 = Integer.valueOf(i2);
                HashMap hashMap4 = new HashMap();
                Long valueOf3 = Long.valueOf(finderObject.f164794id);
                C55030s2 s2Var4 = r8;
                C55030s2 s2Var5 = new C55030s2(finderObject.f164794id, false, 0, (C51449tu2) null, 14, (C8480h) null);
                hashMap4.put(valueOf3, s2Var4);
                hashMap3.put(valueOf2, hashMap4);
            }
        }
        HashMap hashMap5 = f154473i.get(Integer.valueOf(i2));
        if (hashMap5 != null && hashMap5.size() > 50) {
            LinkedList linkedList = new LinkedList();
            linkedList.addAll(hashMap5.values());
            C77813z.m93908n(linkedList);
            HashMap<Integer, HashMap<Long, C55030s2>> hashMap6 = f154473i;
            Integer valueOf4 = Integer.valueOf(i2);
            HashMap hashMap7 = new HashMap();
            List<C55030s2> subList = linkedList.subList(0, 50);
            C87412m.m108593f(subList, "list.subList(0, 50)");
            for (C55030s2 s2Var6 : subList) {
                hashMap7.put(Long.valueOf(s2Var6.f154486d), s2Var6);
            }
            hashMap6.put(valueOf4, hashMap7);
        }
        HashMap hashMap8 = f154473i.get(Integer.valueOf(i2));
        int size2 = hashMap8 != null ? hashMap8.size() : 0;
        Log.m105924i("Finder.FinderMarkReadLogic", "onStreamCgiBack beforeSize:" + size + " afterSize:" + size2);
    }

    /* renamed from: j */
    public final void mo76066j() {
        int incrementAndGet = f154472h.incrementAndGet();
        Log.m105924i("Finder.FinderMarkReadLogic", "start success " + incrementAndGet);
        mo76064h();
    }

    /* renamed from: k */
    public final void mo76067k() {
        int decrementAndGet = f154472h.decrementAndGet();
        if (decrementAndGet == 0) {
            Log.m105924i("Finder.FinderMarkReadLogic", "really stop");
            MMHandler mMHandler = f154471g;
            mMHandler.removeMessages(1);
            mMHandler.sendEmptyMessage(5);
            return;
        }
        Log.m105924i("Finder.FinderMarkReadLogic", "not really stop " + decrementAndGet);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("Finder.FinderMarkReadLogic", "onSceneEnd errType:" + i + " errCode:" + i2);
        if (yVar != null && (yVar instanceof C46550x4) && i == 0 && i2 == 0) {
            Message obtainMessage = f154471g.obtainMessage(2);
            obtainMessage.obj = ((C46550x4) yVar).f125436g;
            obtainMessage.sendToTarget();
        }
    }
}
