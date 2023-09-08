package yh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C57600p4;
import com.tencent.p014mm.storage.C57601q4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112551y;

/* renamed from: yh3.b */
public final class C66649b {

    /* renamed from: b */
    public static final C66651b f191649b = new C66651b((C8480h) null);

    /* renamed from: c */
    public static final C13601g<MultiProcessMMKV> f191650c = C36568h.m40985a(C66650a.f191652d);

    /* renamed from: a */
    public C57601q4 f191651a;

    /* renamed from: yh3.b$a */
    public static final class C66650a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C66650a f191652d = new C66650a();

        public C66650a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("MicroMsg.RecentForwardInfoStorage", 2);
        }
    }

    /* renamed from: yh3.b$b */
    public static final class C66651b {
        public C66651b(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo90705a(String str) {
            C87412m.m108594g(str, "username");
            if (C72996z1.m85820U5(str)) {
                return 2;
            }
            if (C72996z1.m85816S4(str)) {
                return 3;
            }
            return C75592q0.m90764L(str) ? 4 : 1;
        }
    }

    public C66649b() {
        if (!C66653d.f191653a) {
            PriorityQueue priorityQueue = new PriorityQueue(10, new C66652c());
            LinkedList linkedList = new LinkedList();
            C66653d.m78635a(C72994y1.C72995a.USERINFO_RECENT_FORWARD_CONVERSATION_STRING_SYNC, priorityQueue);
            C66653d.m78635a(C72994y1.C72995a.USERINFO_RECENT_FORWARD_CONVERSATION_GROUP_STRING_SYNC, priorityQueue);
            while (priorityQueue.peek() != null) {
                linkedList.add((C57600p4) priorityQueue.poll());
            }
            mo90700c(linkedList);
            C66653d.f191653a = true;
            Log.m105924i("RecentForwardStorage", "dataTransfer: infoList.size:" + linkedList.size());
        }
    }

    /* renamed from: a */
    public final boolean mo90698a(String str) {
        C87412m.m108594g(str, "userName");
        C57601q4 b = mo90699b();
        LinkedList<C57600p4> linkedList = b.f164923d;
        C87412m.m108593f(linkedList, "list.info_list");
        for (C57600p4 p4Var : linkedList) {
            if (C87412m.m108589b(p4Var.f164920d, str)) {
                b.f164923d.remove(p4Var);
                mo90703f(b);
                Log.m105924i("MicroMsg.RecentForwardInfoStorage", "deleteShareInfo: " + str + ' ');
                return true;
            }
        }
        Log.m105920e("MicroMsg.RecentForwardInfoStorage", "deleteShareInfo: " + str + " is fail");
        return false;
    }

    /* renamed from: b */
    public final C57601q4 mo90699b() {
        C57601q4 q4Var = this.f191651a;
        if (q4Var != null) {
            return q4Var;
        }
        C57601q4 q4Var2 = new C57601q4();
        Object value = ((C36570n) f191650c).getValue();
        C87412m.m108593f(value, "<get-mmkv>(...)");
        byte[] decodeBytes = ((MultiProcessMMKV) value).decodeBytes("MMKV_KEY_RECENT_FORWARD_INFO_LIST");
        if (decodeBytes != null) {
            q4Var2.parseFrom(decodeBytes);
        }
        this.f191651a = q4Var2;
        return q4Var2;
    }

    /* renamed from: c */
    public final void mo90700c(List<? extends C57600p4> list) {
        C87412m.m108594g(list, "infoList");
        C57601q4 b = mo90699b();
        b.f164923d.addAll(0, list);
        if (b.f164923d.size() > 20) {
            b.f164923d.subList(0, 20);
        }
        mo90703f(b);
    }

    /* renamed from: d */
    public final List<String> mo90701d(int i, int i2) {
        C57601q4 b = mo90699b();
        LinkedList<C57600p4> linkedList = b.f164923d;
        LinkedList linkedList2 = new LinkedList();
        Iterator<C57600p4> it = linkedList.iterator();
        C87412m.m108593f(it, "infoList.iterator()");
        while (it.hasNext() && linkedList2.size() < i) {
            C57600p4 next = it.next();
            String str = next.f164920d;
            boolean z = false;
            if (C31543z5.m39453c() - next.f164921e < 31536000000L) {
                C87412m.m108593f(str, "userName");
                Class cls = C75700k0.class;
                C72996z1 N2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69664N2(str);
                C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(str);
                if (!(N2 != null && !N2.mo62920o3() && j != null && !C112551y.m153809i("hidden_conv_parent", j.mo108782C2(), true))) {
                    it.remove();
                    mo90703f(b);
                } else if (i2 == -1) {
                    linkedList2.add(str);
                } else {
                    if (1 <= i2 && i2 < 5) {
                        z = true;
                    }
                    if (z) {
                        if (i2 != 1) {
                            if (i2 == 2 && next.f164922f == 2) {
                                linkedList2.add(str);
                            }
                        } else if (next.f164922f != 2) {
                            linkedList2.add(str);
                        }
                    }
                }
            }
        }
        Log.m105924i("MicroMsg.RecentForwardInfoStorage", "[queryLimit] userNameList size=" + linkedList2.size());
        return linkedList2;
    }

    /* renamed from: e */
    public final List<String> mo90702e() {
        List<String> d = mo90701d(5, -1);
        Log.m105924i("MicroMsg.RecentForwardInfoStorage", "[query] list size=" + ((LinkedList) d).size());
        return d;
    }

    /* renamed from: f */
    public final void mo90703f(C57601q4 q4Var) {
        Object value = ((C36570n) f191650c).getValue();
        C87412m.m108593f(value, "<get-mmkv>(...)");
        ((MultiProcessMMKV) value).encode("MMKV_KEY_RECENT_FORWARD_INFO_LIST", q4Var.toByteArray());
        this.f191651a = q4Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if ((r5.length() > 0) == true) goto L_0x0011;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90704g(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0010
            int r2 = r5.length()
            if (r2 <= 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            if (r2 != r0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == 0) goto L_0x0046
            com.tencent.mm.storage.p4 r0 = new com.tencent.mm.storage.p4
            r0.<init>()
            long r2 = eb0.C31543z5.m39453c()
            r0.f164921e = r2
            r0.f164920d = r5
            yh3.b$b r2 = f191649b
            int r2 = r2.mo90705a(r5)
            r0.f164922f = r2
            r4.mo90698a(r5)
            com.tencent.mm.storage.q4 r5 = r4.mo90699b()
            java.util.LinkedList<com.tencent.mm.storage.p4> r2 = r5.f164923d
            r2.add(r1, r0)
            java.util.LinkedList<com.tencent.mm.storage.p4> r0 = r5.f164923d
            int r0 = r0.size()
            r2 = 20
            if (r0 <= r2) goto L_0x0043
            java.util.LinkedList<com.tencent.mm.storage.p4> r0 = r5.f164923d
            r0.subList(r1, r2)
        L_0x0043:
            r4.mo90703f(r5)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yh3.C66649b.mo90704g(java.lang.String):void");
    }
}
