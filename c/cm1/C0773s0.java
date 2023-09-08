package cm1;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import p749xh.C66261f3;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49737hp2;
import te3.C51139rp2;
import te3.C64273c21;
import te3.uc4;

/* renamed from: cm1.s0 */
public final class C0773s0 {

    /* renamed from: b */
    public static final C0775b f1815b = new C0775b((C8480h) null);

    /* renamed from: c */
    public static final C13601g<C0773s0> f1816c = C36568h.m40985a(C0774a.f1818d);

    /* renamed from: a */
    public final ConcurrentHashMap<Long, String> f1817a = new ConcurrentHashMap<>();

    /* renamed from: cm1.s0$a */
    public static final class C0774a extends C87413o implements C32224a<C0773s0> {

        /* renamed from: d */
        public static final C0774a f1818d = new C0774a();

        public C0774a() {
            super(0);
        }

        public Object invoke() {
            return new C0773s0();
        }
    }

    /* renamed from: cm1.s0$b */
    public static final class C0775b {
        public C0775b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C0773s0 mo714a() {
            return (C0773s0) ((C36570n) C0773s0.f1816c).getValue();
        }
    }

    /* renamed from: a */
    public final void mo712a(FinderObject finderObject, FinderJumpInfo finderJumpInfo) {
        String str;
        T t;
        T t2;
        String str2;
        boolean z;
        boolean z2;
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        C87412m.m108594g(finderJumpInfo, "jumpInfo");
        LinkedList<uc4> linkedList = finderJumpInfo.style;
        C87412m.m108593f(linkedList, "jumpInfo.style");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((uc4) t).f142762h == 16) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        uc4 uc4 = (uc4) t;
        C49737hp2 hp22 = uc4 != null ? uc4.f142756M : null;
        LinkedList<uc4> linkedList2 = finderJumpInfo.style;
        C87412m.m108593f(linkedList2, "jumpInfo.style");
        Iterator<T> it4 = linkedList2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it4.next();
            if (((uc4) t2).f142762h == 14) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        uc4 uc42 = (uc4) t2;
        C51139rp2 rp22 = uc42 != null ? uc42.f142755L : null;
        if (hp22 != null && (str2 = hp22.f134811h) != null) {
            str = str2;
        } else if (rp22 != null) {
            str = rp22.f141073e;
        }
        if (str != null) {
            this.f1817a.put(Long.valueOf(finderObject.f164794id), str);
        }
        if (hp22 != null) {
            C64273c21 c212 = new C64273c21();
            c212.f182392d = hp22.f134810g;
            finderObject.liveInfo = c212;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0058  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo713b(long r12, java.lang.String r14) {
        /*
            r11 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.String> r0 = r11.f1817a
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = ""
        L_0x0010:
            int r1 = r0.length()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r1 == 0) goto L_0x00b3
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            long r4 = r12.longValue()
            r6 = 0
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 == 0) goto L_0x002d
            r13 = 1
            goto L_0x002e
        L_0x002d:
            r13 = 0
        L_0x002e:
            r1 = 0
            if (r13 == 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r12 = r1
        L_0x0033:
            java.lang.String r13 = "{}"
            if (r12 == 0) goto L_0x007c
            long r4 = r12.longValue()
            if (r14 == 0) goto L_0x004b
            int r12 = r14.length()
            if (r12 <= 0) goto L_0x0046
            r12 = 1
            goto L_0x0047
        L_0x0046:
            r12 = 0
        L_0x0047:
            if (r12 != r3) goto L_0x004b
            r12 = 1
            goto L_0x004c
        L_0x004b:
            r12 = 0
        L_0x004c:
            if (r12 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r14 = r1
        L_0x0050:
            if (r14 == 0) goto L_0x0058
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>(r14)
            goto L_0x005d
        L_0x0058:
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>(r13)
        L_0x005d:
            java.lang.String r14 = "from_feed_id"
            boolean r8 = r12.isNull(r14)
            if (r8 != 0) goto L_0x0071
            java.lang.String r8 = r12.optString(r14)
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.getUnsignedLong(r8, r6)
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0078
        L_0x0071:
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r12.put(r14, r4)
        L_0x0078:
            java.lang.String r14 = r12.toString()
        L_0x007c:
            int r12 = r0.length()
            if (r12 != 0) goto L_0x0084
            r12 = 1
            goto L_0x0085
        L_0x0084:
            r12 = 0
        L_0x0085:
            r12 = r12 ^ r3
            if (r12 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r0 = r1
        L_0x008a:
            if (r0 == 0) goto L_0x00b3
            if (r14 == 0) goto L_0x009a
            int r12 = r14.length()
            if (r12 <= 0) goto L_0x0096
            r12 = 1
            goto L_0x0097
        L_0x0096:
            r12 = 0
        L_0x0097:
            if (r12 != r3) goto L_0x009a
            r2 = 1
        L_0x009a:
            if (r2 == 0) goto L_0x009d
            r1 = r14
        L_0x009d:
            if (r1 == 0) goto L_0x00a5
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>(r1)
            goto L_0x00aa
        L_0x00a5:
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>(r13)
        L_0x00aa:
            java.lang.String r13 = "feed_ad_report_info"
            r12.put(r13, r0)
            java.lang.String r14 = r12.toString()
        L_0x00b3:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: cm1.C0773s0.mo713b(long, java.lang.String):java.lang.String");
    }
}
