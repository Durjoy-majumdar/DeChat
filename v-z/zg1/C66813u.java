package zg1;

import al1.C54130j;
import cl1.C54949c0;
import cl1.C54963d0;
import cl1.C54988m0;
import cl1.C54990n0;
import cl1.C54993o0;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58052j1;
import di3.C86312j;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import pe3.C89349b;
import sx3.C110823p;
import sx3.C64175a0;
import te3.C49765hx0;
import te3.C51887ww2;
import te3.C52013xs0;
import te3.C64375ft0;
import te3.C64756up2;
import tf0.C64918r1;
import yg1.C16006g;

/* renamed from: zg1.u */
public final class C66813u extends C16006g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66813u(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        T t;
        FinderContact finderContact;
        FinderContact finderContact2;
        FinderContact finderContact3;
        FinderContact finderContact4;
        FinderContact finderContact5;
        FinderContact finderContact6;
        C87412m.m108594g(linkedList, "msgList");
        C54963d0 d0Var = (C54963d0) this.f43066a.mo71262a(C54963d0.class);
        LinkedList linkedList2 = new LinkedList();
        ArrayList arrayList = new ArrayList();
        for (T next : linkedList) {
            if (C110823p.m151008x(d0Var.f154056J, ((C52013xs0) next).f144903e)) {
                arrayList.add(next);
            }
        }
        linkedList2.addAll(arrayList);
        Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            C52013xs0 xs02 = (C52013xs0) it.next();
            C64375ft0 ft02 = new C64375ft0();
            C89349b bVar = xs02.f144906h;
            byte[] f = bVar != null ? bVar.mo123703f() : null;
            if (f != null) {
                try {
                    ft02.parseFrom(f);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
            Log.m105924i("MMFinder.LiveLinkMicSlice", "receive apply mic msg: [sessionId:" + xs02.f144909n + ", applyUserSdkId:" + ft02.f183226g + " seatPosition: " + ft02.f183224e + ']');
            String str = xs02.f144909n;
            if (str != null) {
                if (d0Var.f154082y.get(str) != null) {
                    Log.m105924i("MMFinder.LiveLinkMicSlice", "has received mic apply, skip msg. sessionId:" + str);
                } else if (d0Var.f154078u == 5) {
                    Log.m105924i("MMFinder.LiveLinkMicSlice", "handleLinkMicMsg: in random match, skip msg. sessionId:" + str);
                } else {
                    d0Var.f154082y.put(str, 0);
                    List<C54130j> list = d0Var.f154071n;
                    C87412m.m108593f(list, "linkMicUserList");
                    C64175a0.m75512t(list, new C54988m0(ft02));
                    List<C54130j> list2 = d0Var.f154071n;
                    String str2 = ft02.f183226g;
                    C49765hx0 hx02 = xs02.f144914s;
                    C54130j jVar = r13;
                    C54130j jVar2 = new C54130j(str2, (hx02 == null || (finderContact6 = hx02.f134919d) == null) ? null : finderContact6.headUrl, (hx02 == null || (finderContact5 = hx02.f134919d) == null) ? null : finderContact5.username, (hx02 == null || (finderContact4 = hx02.f134919d) == null) ? null : finderContact4.nickname, ft02.f183223d, xs02.f144909n, (C89349b) null, false, 0, (FinderAuthInfo) null, (String) null, 0, 0, false, (String) null, false, (long) ft02.f183227h, hx02, false, (Boolean) null, (C64756up2) null, 0, ft02.f183224e, 3997632, (C8480h) null);
                    list2.add(jVar);
                    List<C54130j> list3 = d0Var.f154072o;
                    C87412m.m108593f(list3, "newLinkMicUserList");
                    C64175a0.m75512t(list3, new C54990n0(ft02));
                    List<C54130j> list4 = d0Var.f154072o;
                    String str3 = ft02.f183226g;
                    C49765hx0 hx03 = xs02.f144914s;
                    Iterator it4 = it;
                    list4.add(new C54130j(str3, (hx03 == null || (finderContact3 = hx03.f134919d) == null) ? null : finderContact3.headUrl, (hx03 == null || (finderContact2 = hx03.f134919d) == null) ? null : finderContact2.username, (hx03 == null || (finderContact = hx03.f134919d) == null) ? null : finderContact.nickname, ft02.f183223d, xs02.f144909n, (C89349b) null, false, 0, (FinderAuthInfo) null, (String) null, 0, 0, false, (String) null, false, (long) ft02.f183227h, hx03, false, (Boolean) null, (C64756up2) null, 0, ft02.f183224e, 3997632, (C8480h) null));
                    C54993o0 o0Var = C54993o0.f154398d;
                    C51887ww2 ww22 = d0Var.f154048B;
                    long j = 0;
                    if (C61926c.m72696u((int) (ww22 != null ? ww22.f144323d : 0), 2)) {
                        List<C54130j> list5 = d0Var.f154071n;
                        C87412m.m108593f(list5, "linkMicUserList");
                        C64175a0.m75512t(list5, o0Var);
                        List<C54130j> list6 = d0Var.f154072o;
                        C87412m.m108593f(list6, "newLinkMicUserList");
                        C64175a0.m75512t(list6, o0Var);
                    } else {
                        C51887ww2 ww23 = d0Var.f154048B;
                        if (C61926c.m72696u((int) (ww23 != null ? ww23.f144323d : 0), 1)) {
                            List<C54130j> list7 = d0Var.f154071n;
                            C87412m.m108593f(list7, "linkMicUserList");
                            C64175a0.m75512t(list7, o0Var);
                            List<C54130j> list8 = d0Var.f154072o;
                            C87412m.m108593f(list8, "newLinkMicUserList");
                            C64175a0.m75512t(list8, o0Var);
                        } else {
                            C51887ww2 ww24 = d0Var.f154048B;
                            if (C61926c.m72696u((int) (ww24 != null ? ww24.f144323d : 0), 4)) {
                                List<C54130j> list9 = d0Var.f154071n;
                                C87412m.m108593f(list9, "linkMicUserList");
                                C64175a0.m75512t(list9, o0Var);
                                List<C54130j> list10 = d0Var.f154072o;
                                C87412m.m108593f(list10, "newLinkMicUserList");
                                C64175a0.m75512t(list10, o0Var);
                            }
                        }
                    }
                    if (((C64918r1) C86312j.m106911c(C64918r1.class)).mo89039GD()) {
                        C51887ww2 ww25 = d0Var.f154048B;
                        if (ww25 != null) {
                            j = ww25.f144323d;
                        }
                        if (C61926c.m72696u((int) j, 16)) {
                            Log.m105924i("MMFinder.LiveLinkMicSlice", "autoAccept, sessionId:" + str + " mic_sdk_user_id: " + ft02.f183226g);
                            if (((C54949c0) d0Var.business(C54949c0.class)).mo75862c3(false)) {
                                List<C54130j> list11 = d0Var.f154071n;
                                C87412m.m108593f(list11, "linkMicUserList");
                                Iterator<T> it5 = list11.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        t = null;
                                        break;
                                    }
                                    T next2 = it5.next();
                                    if (C87412m.m108589b(((C54130j) next2).f151997a, ft02.f183226g)) {
                                        t = next2;
                                        break;
                                    }
                                }
                                C54130j jVar3 = (C54130j) t;
                                if (jVar3 != null) {
                                    jVar3.mo74949p();
                                    d0Var.mo75917Y3(jVar3);
                                    ((C58052j1) d0Var.f154083z).setValue(str);
                                }
                            } else {
                                Log.m105924i("MMFinder.LiveLinkMicSlice", "autoAccept fail, over size");
                            }
                        }
                    }
                    it = it4;
                }
            }
        }
        Log.m105924i("MMFinder.LiveLinkMicSlice", "handleLinkMicMsg applyMicMsgList:" + linkedList2);
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20003};
    }
}
