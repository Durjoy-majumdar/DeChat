package rz2;

import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import p773yy.C66710j;
import uz2.C52672c0;
import uz2.C52678e0;
import uz2.C52708q;
import z04.C112551y;

/* renamed from: rz2.b */
public final class C48200b {
    /* renamed from: a */
    public static final String m53528a(C48201c cVar) {
        C87412m.m108594g(cVar, "<this>");
        C48198a aVar = C48198a.f129173a;
        if (aVar.mo72932a() != 0) {
            String str = "";
            String str2 = null;
            if (aVar.mo72932a() == 1) {
                C52708q d = m53531d(C66710j.C53637a.m60171a(cVar, false, 1, (Object) null));
                String str3 = d != null ? d.f147179d : null;
                if (str3 != null) {
                    str = str3;
                }
            }
            if (C112551y.m153811k(str)) {
                C52708q qVar = C66710j.C53637a.m60171a(cVar, false, 1, (Object) null).f147097q;
                if (qVar != null) {
                    str2 = qVar.f147179d;
                }
                str = String.valueOf(str2);
            }
            if (!C112551y.m153811k(str)) {
                return str;
            }
        }
        return cVar.field_IconID;
    }

    /* renamed from: b */
    public static final String m53529b(C48201c cVar) {
        C87412m.m108594g(cVar, "<this>");
        if (!IStatusIconHelperKt.m39109a().mo62279I()) {
            return m53530c(C66710j.C53637a.m60171a(cVar, false, 1, (Object) null));
        }
        return String.valueOf((int) (((C31543z5.m39453c() / 1000) - ((long) cVar.field_CreateTime)) / ((long) 3600)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r5 == null) goto L_0x0041;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m53530c(uz2.C52678e0 r5) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r5, r0)
            rz2.a r0 = rz2.C48198a.f129173a
            int r0 = r0.mo72932a()
            java.lang.String r1 = ""
            r2 = 1
            if (r0 != r2) goto L_0x0048
            uz2.q r0 = m53531d(r5)
            r3 = 0
            if (r0 == 0) goto L_0x002a
            java.lang.String r4 = r0.f147182g
            if (r4 == 0) goto L_0x0024
            boolean r4 = z04.C112551y.m153811k(r4)
            if (r4 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r4 = 0
            goto L_0x0025
        L_0x0024:
            r4 = 1
        L_0x0025:
            if (r4 != 0) goto L_0x002a
            java.lang.String r5 = r0.f147182g
            goto L_0x0040
        L_0x002a:
            java.lang.String r0 = r5.f147096p
            if (r0 == 0) goto L_0x0036
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            if (r2 != 0) goto L_0x003b
            java.lang.String r5 = r5.f147096p
            goto L_0x0040
        L_0x003b:
            java.lang.String r5 = r5.f147087d
            if (r5 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r1 = r5
        L_0x0041:
            java.lang.String r5 = "{\n        val clusterPre…cId ?: \"\"\n        }\n    }"
            gy3.C87412m.m108593f(r1, r5)
            goto L_0x004e
        L_0x0048:
            java.lang.String r5 = r5.f147087d
            if (r5 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = r5
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rz2.C48200b.m53530c(uz2.e0):java.lang.String");
    }

    /* renamed from: d */
    public static final C52708q m53531d(C52678e0 e0Var) {
        C52708q qVar;
        String str;
        C87412m.m108594g(e0Var, "<this>");
        Object[] objArr = new Object[3];
        LinkedList<C52708q> linkedList = e0Var.f147100t;
        boolean z = false;
        objArr[0] = Boolean.valueOf(linkedList == null || linkedList.isEmpty());
        objArr[1] = e0Var.f147097q;
        objArr[2] = 1;
        Log.m105925i("MicroMsg.TextStatus.TextStatusClusterHelper", "getClusterPresent: clusterPresents.isNullOrEmpty():%s clusterPresentDeprecated:%s CLUSTER_PRESENT_VERSION:%s", objArr);
        LinkedList<C52708q> linkedList2 = e0Var.f147100t;
        if (linkedList2 == null || linkedList2.isEmpty()) {
            return e0Var.f147097q;
        }
        LinkedList<C52672c0> linkedList3 = IStatusIconHelperKt.m39109a().mo62303o().f147061e;
        C87412m.m108593f(linkedList3, "keyValueConfig.key_value_items");
        Iterator<T> it = linkedList3.iterator();
        while (true) {
            qVar = null;
            if (!it.hasNext()) {
                str = null;
                break;
            }
            C52672c0 c0Var = (C52672c0) it.next();
            if (c0Var.f147065d.equals("cluster_present_type")) {
                str = c0Var.f147066e;
                break;
            }
        }
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (!z) {
            LinkedList<C52708q> linkedList4 = e0Var.f147100t;
            C87412m.m108593f(linkedList4, "statusTopicInfo.clusterPresents");
            Iterator<T> it4 = linkedList4.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C52708q qVar2 = (C52708q) it4.next();
                if (qVar2.f147184i <= 1 && qVar2.f147183h.equals(str)) {
                    qVar = qVar2;
                    break;
                }
            }
        }
        if (qVar != null) {
            return qVar;
        }
        LinkedList<C52708q> linkedList5 = e0Var.f147100t;
        return linkedList5.get(linkedList5.size() - 1);
    }
}
