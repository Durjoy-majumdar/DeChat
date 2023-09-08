package er1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import pe3.C89349b;
import sx3.C110818d0;
import sx3.C64175a0;
import te3.C49098d51;
import te3.C49440fl2;
import te3.C51559uk1;
import te3.C51705vk1;

/* renamed from: er1.g1 */
public final class C7802g1 {
    /* renamed from: a */
    public static final C51559uk1 m7949a(C49098d51 d512) {
        T t;
        boolean z;
        C87412m.m108594g(d512, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("getFirstCouponInfoInJumpInfo jump_info,size=");
        LinkedList<C49440fl2> linkedList = d512.f132129r;
        sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
        Log.m105924i("FinderLiveNoticeInfoFuncObject", sb.toString());
        LinkedList<C49440fl2> linkedList2 = d512.f132129r;
        if (linkedList2 != null) {
            Iterator<T> it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C49440fl2) t).f133579d == 10) {
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
            C49440fl2 fl22 = (C49440fl2) t;
            if (fl22 != null) {
                try {
                    C51705vk1 vk12 = new C51705vk1();
                    C89349b bVar = fl22.f133580e;
                    vk12.parseFrom(bVar != null ? bVar.mo123703f() : null);
                    LinkedList<C51559uk1> linkedList3 = vk12.f143541d;
                    if (linkedList3 != null) {
                        return (C51559uk1) C110818d0.m150916N(linkedList3);
                    }
                    return null;
                } catch (Exception e) {
                    Log.m105920e("FinderLiveNoticeInfoFuncObject", "getFirstCouponInfoInJumpInfo " + e);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m7950b(C49098d51 d512) {
        C87412m.m108594g(d512, "<this>");
        return d512.f132119e == 0;
    }

    /* renamed from: c */
    public static final void m7951c(C49098d51 d512, C51559uk1 uk12) {
        T t;
        boolean z;
        C87412m.m108594g(d512, "<this>");
        C87412m.m108594g(uk12, "r");
        StringBuilder sb = new StringBuilder();
        sb.append("replaceFirstCouponInfoInJumpInfo jump_info,size=");
        LinkedList<C49440fl2> linkedList = d512.f132129r;
        byte[] bArr = null;
        sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
        Log.m105924i("FinderLiveNoticeInfoFuncObject", sb.toString());
        LinkedList<C49440fl2> linkedList2 = d512.f132129r;
        if (linkedList2 != null) {
            Iterator<T> it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C49440fl2) t).f133579d == 10) {
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
            C49440fl2 fl22 = (C49440fl2) t;
            if (fl22 != null) {
                try {
                    C51705vk1 vk12 = new C51705vk1();
                    C89349b bVar = fl22.f133580e;
                    if (bVar != null) {
                        bArr = bVar.mo123703f();
                    }
                    vk12.parseFrom(bArr);
                    LinkedList<C51559uk1> linkedList3 = vk12.f143541d;
                    C87412m.m108593f(linkedList3, "couponInfoList.info_list");
                    C64175a0.m75514v(linkedList3);
                    vk12.f143541d.addFirst(uk12);
                    fl22.f133580e = C58739j4.f168176a.mo83710g0(vk12);
                } catch (Exception e) {
                    Log.m105920e("FinderLiveNoticeInfoFuncObject", "replaceFirstCouponInfoInJumpInfo " + e);
                }
            }
        }
    }
}
