package zg1;

import al1.C54130j;
import cl1.C54963d0;
import cl1.C54995p0;
import cl1.C54996q0;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import pe3.C89349b;
import sx3.C110823p;
import sx3.C64175a0;
import te3.C49765hx0;
import te3.C52013xs0;
import te3.C64429ht0;
import y50.C66514h;
import y50.C66521k0;
import yg1.C16006g;

/* renamed from: zg1.v */
public final class C66814v extends C16006g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66814v(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        FinderContact finderContact;
        FinderContact finderContact2;
        FinderContact finderContact3;
        FinderContact finderContact4;
        FinderContact finderContact5;
        FinderContact finderContact6;
        FinderContact finderContact7;
        FinderContact finderContact8;
        FinderContact finderContact9;
        FinderContact finderContact10;
        C66514h hVar;
        C87412m.m108594g(linkedList, "msgList");
        C54963d0 d0Var = (C54963d0) this.f43066a.mo71262a(C54963d0.class);
        LinkedList<C52013xs0> linkedList2 = new LinkedList<>();
        ArrayList arrayList = new ArrayList();
        for (T next : linkedList) {
            if (C110823p.m151008x(d0Var.f154059M, ((C52013xs0) next).f144903e)) {
                arrayList.add(next);
            }
        }
        linkedList2.addAll(arrayList);
        for (C52013xs0 xs02 : linkedList2) {
            C64429ht0 ht02 = new C64429ht0();
            C89349b bVar = xs02.f144906h;
            byte[] f = bVar != null ? bVar.mo123703f() : null;
            int i = 0;
            if (f != null) {
                try {
                    ht02.parseFrom(f);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
            Log.m105924i("MMFinder.LiveLinkMicSlice", "receive apply mic pk msg: [sessionId:" + xs02.f144909n + ", pkUserSdkId:" + ht02.f183554g + ", pkSdkLiveId:" + ht02.f183555h + ']');
            String str = xs02.f144909n;
            if (str != null) {
                if (d0Var.f154082y.get(str) != null) {
                    Log.m105924i("MMFinder.LiveLinkMicSlice", "has received mic pk apply, skip msg. sessionId:" + str);
                } else {
                    d0Var.f154082y.put(str, 0);
                    List<C54130j> list = d0Var.f154071n;
                    C87412m.m108593f(list, "linkMicUserList");
                    C64175a0.m75512t(list, new C54995p0(ht02));
                    if (d0Var.f154078u == 5) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("handleLinkMicPkMsg: in random match, buffer size:");
                        C89349b bVar2 = ht02.f183553f;
                        sb.append(bVar2 != null ? Integer.valueOf(bVar2.f257327a.length) : null);
                        sb.append(", sessionId:");
                        sb.append(str);
                        sb.append(", pkUserSdkId:");
                        sb.append(ht02.f183554g);
                        sb.append(", pkSdkLiveId:");
                        sb.append(ht02.f183555h);
                        Log.m105924i("MMFinder.LiveLinkMicSlice", sb.toString());
                        C89349b bVar3 = ht02.f183553f;
                        if (bVar3 != null) {
                            i = bVar3.f257327a.length;
                        }
                        if (i > 0 && (hVar = C66521k0.f191361a) != null) {
                            hVar.onRandomMicAccept(xs02, ht02);
                        }
                    } else {
                        List<C54130j> list2 = d0Var.f154071n;
                        String str2 = ht02.f183554g;
                        C49765hx0 hx02 = xs02.f144914s;
                        list2.add(new C54130j(str2, (hx02 == null || (finderContact10 = hx02.f134919d) == null) ? null : finderContact10.headUrl, (hx02 == null || (finderContact9 = hx02.f134919d) == null) ? null : finderContact9.username, (hx02 == null || (finderContact8 = hx02.f134919d) == null) ? null : finderContact8.nickname, 2, xs02.f144909n, (C89349b) null, true, ht02.f183555h, (hx02 == null || (finderContact7 = hx02.f134919d) == null) ? null : finderContact7.authInfo, (hx02 == null || (finderContact6 = hx02.f134919d) == null) ? null : finderContact6.signature, 0, 0, false, ht02.f183551d, false, 0, hx02, false, (Boolean) null, ht02.f183552e, 0, 0, 7190528, (C8480h) null));
                        List<C54130j> list3 = d0Var.f154072o;
                        C87412m.m108593f(list3, "newLinkMicUserList");
                        C64175a0.m75512t(list3, new C54996q0(ht02));
                        List<C54130j> list4 = d0Var.f154072o;
                        String str3 = ht02.f183554g;
                        C49765hx0 hx03 = xs02.f144914s;
                        list4.add(new C54130j(str3, (hx03 == null || (finderContact5 = hx03.f134919d) == null) ? null : finderContact5.headUrl, (hx03 == null || (finderContact4 = hx03.f134919d) == null) ? null : finderContact4.username, (hx03 == null || (finderContact3 = hx03.f134919d) == null) ? null : finderContact3.nickname, 2, xs02.f144909n, (C89349b) null, true, ht02.f183555h, (hx03 == null || (finderContact2 = hx03.f134919d) == null) ? null : finderContact2.authInfo, (hx03 == null || (finderContact = hx03.f134919d) == null) ? null : finderContact.signature, 0, 0, false, ht02.f183551d, false, 0, hx03, false, (Boolean) null, ht02.f183552e, 0, 0, 7190528, (C8480h) null));
                    }
                }
            }
        }
        Log.m105924i("MMFinder.LiveLinkMicSlice", "handleLinkMicPkMsg applyMicPkMsgList:" + linkedList2);
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20015};
    }
}
