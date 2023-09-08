package cm1;

import cj1.C0531e;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ls3.C61397g;
import p565ir.C60606n;
import pe3.C89349b;
import sx3.C36907w;
import te3.C49431fj1;
import te3.C64273c21;
import tf1.C13914m;

/* renamed from: cm1.u0 */
public final class C0782u0 implements C0740i2 {

    /* renamed from: e */
    public static final C0783a f1832e = new C0783a((C8480h) null);

    /* renamed from: d */
    public final FinderObject f1833d;

    /* renamed from: cm1.u0$a */
    public static final class C0783a {
        public C0783a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C49431fj1 mo728a(List<C0782u0> list, C89349b bVar, int i, int i2) {
            String str;
            C87412m.m108594g(list, "feeds");
            C49431fj1 fj12 = new C49431fj1();
            C0531e eVar = C0531e.f1296a;
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                for (C0782u0 u0Var : list) {
                    arrayList.add(u0Var.f1833d);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(System.currentTimeMillis());
                sb.append('-');
                sb.append(arrayList.hashCode());
                str = sb.toString();
                Log.m105924i("FinderLiveActivityDataTransaction", "storeReplayFeedList " + str + ",size:" + arrayList.size() + '!');
                HashMap<String, List<byte[]>> hashMap = C0531e.f1297b;
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((FinderObject) it.next()).toByteArray());
                }
                hashMap.put(str, arrayList2);
            } else {
                Log.m105920e("FinderLiveActivityDataTransaction", "storeReplayFeedList feeds is empty!");
                str = null;
            }
            fj12.f133532d = str;
            fj12.f133534f = bVar;
            fj12.f133535g = i;
            fj12.f133536h = i2;
            return fj12;
        }
    }

    public C0782u0(FinderObject finderObject) {
        C87412m.m108594g(finderObject, "finderObj");
        this.f1833d = finderObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) sx3.C110818d0.m150916N((r0 = r0.media));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo725a() {
        /*
            r3 = this;
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r3.f1833d
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0017
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            com.tencent.mm.protocal.protobuf.FinderMedia r0 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r0
            if (r0 == 0) goto L_0x0017
            te3.rq2 r0 = vp1.C65840n.m77568d(r0)
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x0033
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.f185267e
            r1.append(r2)
            java.lang.String r0 = r0.f185288z
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            if (r0 != 0) goto L_0x0035
        L_0x0033:
            java.lang.String r0 = ""
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cm1.C0782u0.mo725a():java.lang.String");
    }

    /* renamed from: b */
    public final boolean mo726b() {
        return ((C60606n) C86312j.m106911c(C60606n.class)).Sj0(this.f1833d.liveInfo);
    }

    /* renamed from: c */
    public int mo75c() {
        return C0782u0.class.hashCode();
    }

    /* renamed from: d */
    public final boolean mo727d() {
        FinderObject finderObject = this.f1833d;
        return ((C61397g) C86312j.m106911c(C61397g.class)).ah0(finderObject.username, finderObject.liveInfo);
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        Long l = null;
        C0782u0 u0Var = mVar instanceof C0782u0 ? (C0782u0) mVar : null;
        if (u0Var == null) {
            return -1;
        }
        C64273c21 c212 = u0Var.f1833d.liveInfo;
        if ((c212 != null ? c212.f182392d : 0) <= 0) {
            return -1;
        }
        Long valueOf = c212 != null ? Long.valueOf(c212.f182392d) : null;
        C64273c21 c213 = this.f1833d.liveInfo;
        if (c213 != null) {
            l = Long.valueOf(c213.f182392d);
        }
        return C87412m.m108589b(valueOf, l) ? 0 : -1;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
