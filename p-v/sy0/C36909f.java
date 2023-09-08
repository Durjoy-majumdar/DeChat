package sy0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import nr3.C89059e;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import qy0.C36187a;
import qy0.C36193e;
import te3.C49335eu3;
import te3.C49966ja;
import te3.C51122rl;
import te3.C51163rv3;
import te3.C51260sl;
import te3.C51410tl;
import te3.C51561ul;

/* renamed from: sy0.f */
public final class C36909f extends C89132b<C51561ul> {

    /* renamed from: i */
    public final C36193e.C36194a f97936i;

    /* renamed from: j */
    public final C51410tl f97937j;

    public C36909f(List<Integer> list, C36193e.C36194a aVar) {
        C87412m.m108594g(list, "selector");
        C87412m.m108594g(aVar, FirebaseAnalytics.C113379b.SOURCE);
        this.f97936i = aVar;
        C51410tl tlVar = new C51410tl();
        this.f97937j = tlVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            int intValue = ((Number) next).intValue();
            List<Integer> list2 = C36187a.f96386a;
            if (C36187a.f96389d.contains(Integer.valueOf(intValue))) {
                arrayList.add(next);
            }
        }
        tlVar.f142271d = new LinkedList<>(arrayList);
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_BYP_KEY_BUFF_STRING_SYNC, "");
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
        byte[] decodeHexString = Util.decodeHexString((String) f);
        C51410tl tlVar2 = this.f97937j;
        C51122rl rlVar = new C51122rl();
        rlVar.parseFrom(decodeHexString);
        tlVar2.f142272e = rlVar;
        C51410tl tlVar3 = this.f97937j;
        tlVar3.f142273f = this.f97936i.f96407d;
        bVar.f127066a = tlVar3;
        C51561ul ulVar = new C51561ul();
        ulVar.setBaseResponse(new C49966ja());
        ulVar.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = ulVar;
        bVar.f127068c = "/cgi-bin/micromsg-bin/bypsync";
        bVar.f127069d = 3673;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Byp.CgiBypSync", "[CgiBypSync] selector=" + this.f97937j.f142271d + " scene=" + this.f97936i.f96407d + " size=" + decodeHexString.length);
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        boolean z;
        boolean z2;
        LinkedList<C51260sl> linkedList;
        T t;
        boolean z3;
        int i3 = i;
        int i4 = i2;
        C51561ul ulVar = (C51561ul) eu32;
        C87412m.m108594g(ulVar, "resp");
        Log.m105924i("Byp.CgiBypSync", "[onCgiBack] errType=" + i3 + " errCode=" + i4 + " errMsg=" + str + " selector=" + this.f97937j.f142271d);
        if (i3 == 0 && i4 == 0) {
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_BYP_KEY_BUFF_STRING_SYNC;
            C51122rl rlVar = ulVar.f142923e;
            C51122rl rlVar2 = this.f97937j.f142272e;
            C87412m.m108591d(rlVar2);
            boolean z4 = rlVar != null ? rlVar.f140992e : false;
            Log.m105924i("Byp.CgiBypSync", "[onSuccessfully] isReset=" + z4 + ", item size=" + ulVar.f142924f.size());
            if (z4) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[mergeSyncKey] req: ");
            sb.append(mo60892k(rlVar2));
            sb.append(" resp: ");
            sb.append(rlVar != null ? mo60892k(rlVar) : null);
            Log.m105924i("Byp.CgiBypSync", sb.toString());
            if (rlVar == null || (linkedList = rlVar.f140991d) == null) {
                z2 = false;
                z = false;
            } else {
                boolean z5 = false;
                z = false;
                for (C51260sl slVar : linkedList) {
                    LinkedList<C51260sl> linkedList2 = rlVar2.f140991d;
                    C87412m.m108593f(linkedList2, "req.sync_key_pair_list");
                    Iterator<T> it = linkedList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (((C51260sl) t).f141581d == slVar.f141581d) {
                            z3 = true;
                            continue;
                        } else {
                            z3 = false;
                            continue;
                        }
                        if (z3) {
                            break;
                        }
                    }
                    C51260sl slVar2 = (C51260sl) t;
                    if (slVar2 != null) {
                        long j = slVar2.f141582e;
                        long j2 = slVar.f141582e;
                        if (j < j2) {
                            slVar2.f141582e = j2;
                            Log.m105924i("Byp.CgiBypSync", "[mergeSyncKey] modify " + slVar.f141581d + '=' + slVar.f141582e);
                            z5 = true;
                        } else {
                            Log.m105920e("Byp.CgiBypSync", "[mergeSyncKey] value(" + slVar.f141582e + ") is invalid, client value=" + slVar2.f141582e + ' ');
                        }
                    } else {
                        Log.m105924i("Byp.CgiBypSync", "[mergeSyncKey] insert " + slVar.f141581d + '=' + slVar.f141582e);
                        rlVar2.f140991d.add(slVar);
                        z = true;
                    }
                }
                z2 = z5;
            }
            if (z2 || z) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Util.encodeHexString(rlVar2.toByteArray()));
                return;
            }
            return;
        }
        Log.m105924i("Byp.CgiBypSync", "[onFailed] " + this.f97937j.f142271d);
    }

    /* renamed from: i */
    public C89059e<C89132b.C89134c<C51561ul>> mo9225i() {
        C115669n.INSTANCE.mo175913w(1465, (long) this.f97936i.f96407d, 1);
        C89059e<C89132b.C89134c<C51561ul>> i = super.mo9225i();
        C87412m.m108593f(i, "super.run()");
        return i;
    }

    /* renamed from: k */
    public final String mo60892k(C51122rl rlVar) {
        C87412m.m108594g(rlVar, "<this>");
        StringBuilder sb = new StringBuilder();
        LinkedList<C51260sl> linkedList = rlVar.f140991d;
        C87412m.m108593f(linkedList, "sync_key_pair_list");
        for (C51260sl slVar : linkedList) {
            sb.append(slVar.f141581d);
            sb.append("=");
            sb.append(slVar.f141582e);
            sb.append(", ");
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "ss.toString()");
        return sb4;
    }
}
