package hj1;

import al1.C39611s;
import al1.C54130j;
import cl1.C39981t0;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dj1.C58276c;
import fj1.C45795b;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import n50.C61619b;
import n50.C61620c;
import sx3.C64175a0;
import te3.C48703af0;
import te3.C64781vp2;
import te3.C64785vw2;

/* renamed from: hj1.a */
public final class C59918a extends C32931b {

    /* renamed from: g */
    public static final C59919a f171024g = new C59919a((C8480h) null);

    /* renamed from: e */
    public boolean f171025e;

    /* renamed from: f */
    public String f171026f = "";

    /* renamed from: hj1.a$a */
    public static final class C59919a {

        /* renamed from: hj1.a$a$a */
        public static final class C59920a extends C87413o implements C32226l<C64785vw2, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ C61619b f171027d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59920a(C61619b bVar) {
                super(1);
                this.f171027d = bVar;
            }

            public Object invoke(Object obj) {
                C64785vw2 vw22 = (C64785vw2) obj;
                C87412m.m108594g(vw22, LocaleUtil.ITALIAN);
                return Boolean.valueOf(Util.isEqual(this.f171027d.f175221d, vw22.f185994d));
            }
        }

        /* renamed from: hj1.a$a$b */
        public static final class C59921b extends C87413o implements C32226l<C64785vw2, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ C61619b f171028d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59921b(C61619b bVar) {
                super(1);
                this.f171028d = bVar;
            }

            public Object invoke(Object obj) {
                C64785vw2 vw22 = (C64785vw2) obj;
                C87412m.m108594g(vw22, LocaleUtil.ITALIAN);
                return Boolean.valueOf(Util.isEqual(this.f171028d.f175221d, vw22.f185994d));
            }
        }

        /* renamed from: hj1.a$a$c */
        public static final class C59922c extends C87413o implements C32226l<C64785vw2, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ C61619b f171029d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59922c(C61619b bVar) {
                super(1);
                this.f171029d = bVar;
            }

            public Object invoke(Object obj) {
                C64785vw2 vw22 = (C64785vw2) obj;
                C87412m.m108594g(vw22, LocaleUtil.ITALIAN);
                return Boolean.valueOf(Util.isEqual(this.f171029d.f175221d, vw22.f185994d));
            }
        }

        /* renamed from: hj1.a$a$d */
        public static final class C59923d extends C87413o implements C32226l<C64785vw2, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ C61619b f171030d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59923d(C61619b bVar) {
                super(1);
                this.f171030d = bVar;
            }

            public Object invoke(Object obj) {
                C64785vw2 vw22 = (C64785vw2) obj;
                C87412m.m108594g(vw22, LocaleUtil.ITALIAN);
                return Boolean.valueOf(Util.isEqual(this.f171030d.f175221d, vw22.f185994d));
            }
        }

        /* renamed from: hj1.a$a$e */
        public static final class C59924e extends C87413o implements C32226l<C64785vw2, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ C61619b f171031d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59924e(C61619b bVar) {
                super(1);
                this.f171031d = bVar;
            }

            public Object invoke(Object obj) {
                C64785vw2 vw22 = (C64785vw2) obj;
                C87412m.m108594g(vw22, LocaleUtil.ITALIAN);
                return Boolean.valueOf(Util.isEqual(this.f171031d.f175221d, vw22.f185994d));
            }
        }

        public C59919a(C8480h hVar) {
        }

        /* renamed from: a */
        public final LinkedList<C64781vp2> mo84845a(C45795b bVar) {
            Class cls = C54963d0.class;
            C87412m.m108594g(bVar, "<this>");
            LinkedList<C64781vp2> linkedList = new LinkedList<>();
            if (((C54963d0) bVar.mo71262a(cls)).f154073p == null) {
                return linkedList;
            }
            C64781vp2 vp22 = new C64781vp2();
            LinkedList<C64785vw2> linkedList2 = new LinkedList<>();
            C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
            if (oVar != null && oVar.mo75991Z3()) {
                linkedList2.clear();
                if (C87412m.m108589b(((C39981t0) bVar.mo71262a(C39981t0.class)).f107198j.getValue(), Boolean.TRUE)) {
                    return linkedList;
                }
                if (((C54963d0) bVar.mo71262a(cls)).mo75902I3()) {
                    ArrayList<C61619b> arrayList = C61620c.C61622b.f175234a.f175229a;
                    C87412m.m108593f(arrayList, "getInstance().remoteUserConfigList");
                    synchronized (arrayList) {
                        for (C61619b bVar2 : arrayList) {
                            if (bVar2.f175227j) {
                                C64785vw2 vw22 = new C64785vw2();
                                C54130j jVar = ((C54963d0) bVar.mo71262a(cls)).f154073p;
                                String str = null;
                                vw22.f185994d = jVar != null ? jVar.f151997a : null;
                                C54130j jVar2 = ((C54963d0) bVar.mo71262a(cls)).f154073p;
                                if (jVar2 != null) {
                                    str = jVar2.f152002f;
                                }
                                vw22.f185995e = str;
                                vw22.f185996f = bVar2.f175223f;
                                vw22.f185997g = bVar2.f175224g;
                                vp22.f185966d = vw22;
                            } else {
                                List<C54130j> list = ((C54963d0) bVar.mo71262a(cls)).f154076s;
                                C87412m.m108593f(list, "business(LiveLinkMicSlic…java).linkMicUserInfoList");
                                synchronized (list) {
                                    for (C54130j jVar3 : list) {
                                        if (Util.isEqual(bVar2.f175221d, jVar3.f151997a) && C87412m.m108589b(jVar3.f152016t, Boolean.TRUE)) {
                                            C64175a0.m75512t(linkedList2, new C59920a(bVar2));
                                            C64785vw2 vw23 = new C64785vw2();
                                            vw23.f185994d = jVar3.f151997a;
                                            vw23.f185995e = jVar3.f152002f;
                                            vw23.f185996f = bVar2.f175223f;
                                            vw23.f185997g = bVar2.f175224g;
                                            linkedList2.add(vw23);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            vp22.f185967e = linkedList2;
            linkedList.add(vp22);
            return linkedList;
        }

        /* renamed from: b */
        public final LinkedList<C64785vw2> mo84846b(C45795b bVar) {
            Class cls = C54963d0.class;
            Class cls2 = C39981t0.class;
            C87412m.m108594g(bVar, "<this>");
            LinkedList<C64785vw2> linkedList = new LinkedList<>();
            C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
            if (oVar != null && oVar.mo75991Z3()) {
                linkedList.clear();
                if (C87412m.m108589b(((C39981t0) bVar.mo71262a(cls2)).f107198j.getValue(), Boolean.TRUE)) {
                    ArrayList<C61619b> arrayList = C61620c.C61622b.f175234a.f175229a;
                    C87412m.m108593f(arrayList, "getInstance().remoteUserConfigList");
                    synchronized (arrayList) {
                        for (C61619b bVar2 : arrayList) {
                            List<C39611s> d3 = ((C39981t0) bVar.mo71262a(cls2)).mo62587d3(C39981t0.C39982a.CACHE);
                            synchronized (d3) {
                                for (C39611s sVar : d3) {
                                    if (Util.isEqual(bVar2.f175221d, sVar.f106357a)) {
                                        C64175a0.m75512t(linkedList, new C59921b(bVar2));
                                        C64785vw2 vw22 = new C64785vw2();
                                        vw22.f185994d = sVar.f106357a;
                                        vw22.f185995e = sVar.f106361e;
                                        vw22.f185996f = bVar2.f175223f;
                                        vw22.f185997g = bVar2.f175224g;
                                        linkedList.add(vw22);
                                    }
                                }
                            }
                        }
                    }
                } else if (((C54963d0) bVar.mo71262a(cls)).mo75902I3()) {
                    ArrayList<C61619b> arrayList2 = C61620c.C61622b.f175234a.f175229a;
                    C87412m.m108593f(arrayList2, "getInstance().remoteUserConfigList");
                    synchronized (arrayList2) {
                        for (C61619b bVar3 : arrayList2) {
                            List<C54130j> list = ((C54963d0) bVar.mo71262a(cls)).f154076s;
                            C87412m.m108593f(list, "business(LiveLinkMicSlic…java).linkMicUserInfoList");
                            synchronized (list) {
                                for (C54130j jVar : list) {
                                    if (Util.isEqual(bVar3.f175221d, jVar.f151997a) && C87412m.m108589b(jVar.f152016t, Boolean.FALSE)) {
                                        C64175a0.m75512t(linkedList, new C59922c(bVar3));
                                        C64785vw2 vw23 = new C64785vw2();
                                        vw23.f185994d = jVar.f151997a;
                                        vw23.f185995e = jVar.f152002f;
                                        vw23.f185996f = bVar3.f175223f;
                                        vw23.f185997g = bVar3.f175224g;
                                        linkedList.add(vw23);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return linkedList;
        }

        /* renamed from: c */
        public final LinkedList<C64785vw2> mo84847c(C45795b bVar) {
            Class cls = C54963d0.class;
            Class cls2 = C39981t0.class;
            C87412m.m108594g(bVar, "<this>");
            LinkedList<C64785vw2> linkedList = new LinkedList<>();
            C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
            if (oVar != null && oVar.mo75991Z3()) {
                linkedList.clear();
                if (C87412m.m108589b(((C39981t0) bVar.mo71262a(cls2)).f107198j.getValue(), Boolean.TRUE)) {
                    ArrayList<C61619b> arrayList = C61620c.C61622b.f175234a.f175229a;
                    C87412m.m108593f(arrayList, "getInstance().remoteUserConfigList");
                    synchronized (arrayList) {
                        for (C61619b bVar2 : arrayList) {
                            List<C39611s> d3 = ((C39981t0) bVar.mo71262a(cls2)).mo62587d3(C39981t0.C39982a.CACHE);
                            synchronized (d3) {
                                for (C39611s sVar : d3) {
                                    if (Util.isEqual(bVar2.f175221d, sVar.f106357a)) {
                                        C64175a0.m75512t(linkedList, new C59923d(bVar2));
                                        C64785vw2 vw22 = new C64785vw2();
                                        vw22.f185994d = sVar.f106357a;
                                        vw22.f185995e = sVar.f106361e;
                                        vw22.f185996f = bVar2.f175223f;
                                        vw22.f185997g = bVar2.f175224g;
                                        linkedList.add(vw22);
                                    }
                                }
                            }
                        }
                    }
                } else if (((C54963d0) bVar.mo71262a(cls)).mo75902I3()) {
                    ArrayList<C61619b> arrayList2 = C61620c.C61622b.f175234a.f175229a;
                    C87412m.m108593f(arrayList2, "getInstance().remoteUserConfigList");
                    synchronized (arrayList2) {
                        for (C61619b bVar3 : arrayList2) {
                            List<C54130j> list = ((C54963d0) bVar.mo71262a(cls)).f154076s;
                            C87412m.m108593f(list, "business(LiveLinkMicSlic…java).linkMicUserInfoList");
                            synchronized (list) {
                                for (C54130j jVar : list) {
                                    if (Util.isEqual(bVar3.f175221d, jVar.f151997a)) {
                                        C64175a0.m75512t(linkedList, new C59924e(bVar3));
                                        C64785vw2 vw23 = new C64785vw2();
                                        vw23.f185994d = jVar.f151997a;
                                        vw23.f185995e = jVar.f152002f;
                                        vw23.f185996f = bVar3.f175223f;
                                        vw23.f185997g = bVar3.f175224g;
                                        linkedList.add(vw23);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return linkedList;
        }
    }

    /* renamed from: hj1.a$b */
    public static final class C59925b implements C58276c.C58277a {

        /* renamed from: a */
        public final /* synthetic */ C59918a f171032a;

        public C59925b(C59918a aVar) {
            this.f171032a = aVar;
        }

        /* renamed from: a */
        public void mo75776a(int i, int i2, String str, C48703af0 af02) {
            C87412m.m108594g(af02, "resp");
            Log.m105924i("FinderLiveMicHeartBeat", "doRefreshMicIntercom onCgiBack isNeedClose: " + this.f171032a.f171025e + " errCode:" + i2 + " heartbeat_interval: " + af02.f130478e);
            this.f171032a.f89506d.mo56065a();
            C59918a aVar = this.f171032a;
            if (!aVar.f171025e) {
                if (i2 == 0) {
                    aVar.mo58874c(af02.f130478e * ((long) 1000));
                } else {
                    aVar.mo58874c(20000);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo58872a(C45795b bVar) {
        T t;
        T t2;
        T t3;
        C45795b bVar2 = bVar;
        Class cls = C54963d0.class;
        Class cls2 = C39981t0.class;
        Class cls3 = C55001u.class;
        Class cls4 = C54991o.class;
        C87412m.m108594g(bVar2, "<this>");
        C32444a aVar = C32444a.f86121a;
        int i = 1;
        if (C32444a.f86068J.mo60266n().intValue() != 1) {
            Log.m105920e("FinderLiveMicHeartBeat", "doRefresh heart switch != 1");
            return;
        }
        int i2 = ((C54991o) bVar2.mo71262a(cls4)).f154190D ? 3 : ((C54991o) bVar2.mo71262a(cls4)).mo75991Z3() ? 1 : 2;
        boolean z = false;
        T t4 = "";
        T t5 = null;
        if (C87412m.m108589b(((C39981t0) bVar2.mo71262a(cls2)).f107198j.getValue(), Boolean.TRUE)) {
            T t6 = this.f171026f;
            if (t6 == null || t6.length() == 0) {
                z = true;
            }
            if (!(!z)) {
                t6 = null;
            }
            if (t6 == null) {
                Iterator<T> it = ((C39981t0) bVar2.mo71262a(cls2)).mo62587d3(C39981t0.C39982a.CACHE).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t3 = null;
                        break;
                    }
                    t3 = it.next();
                    if (C87412m.m108589b(((C39611s) t3).f106357a, ((C54991o) bVar2.mo71262a(cls4)).mo76015n4())) {
                        break;
                    }
                }
                C39611s sVar = (C39611s) t3;
                if (sVar != null) {
                    t5 = sVar.f106361e;
                }
                if (t5 != null) {
                    t4 = t5;
                }
            } else {
                t4 = t6;
            }
            t = t4;
        } else if (((C54963d0) bVar2.mo71262a(cls)).mo75902I3()) {
            List<C54130j> list = ((C54963d0) bVar2.mo71262a(cls)).f154076s;
            C87412m.m108593f(list, "business(LiveLinkMicSlic…java).linkMicUserInfoList");
            Iterator<T> it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                T next = it4.next();
                if (C87412m.m108589b(((C54130j) next).f151997a, ((C54991o) bVar2.mo71262a(cls4)).mo76015n4())) {
                    t5 = next;
                    break;
                }
            }
            C54130j jVar = (C54130j) t5;
            if (!(jVar == null || (t2 = jVar.f152002f) == null)) {
                t4 = t2;
            }
            t = t4;
            i = 0;
        } else {
            t = t4;
            i = 2;
        }
        if (this.f171025e) {
            i = 2;
        }
        LinkedList<C64785vw2> c = f171024g.mo84847c(bVar2);
        StringBuilder sb = new StringBuilder();
        sb.append("FinderLiveMicHeartBeatTask doRefresh isNeedClose: ");
        sb.append(this.f171025e);
        sb.append(" scene: ");
        sb.append(i2);
        sb.append(" micType: ");
        sb.append(i);
        sb.append(" sessionId: ");
        sb.append(t);
        sb.append(" micInfoList: ");
        StringBuilder sb4 = new StringBuilder();
        for (C64785vw2 vw22 : c) {
            sb4.append("MicInfo = userId: " + vw22.f185994d + " sessionId: " + vw22.f185995e + " audioEnable: " + vw22.f185997g + " videoEnable: " + vw22.f185996f + 10);
        }
        String sb5 = sb4.toString();
        C87412m.m108593f(sb5, "sb.toString()");
        sb.append(sb5);
        Log.m105924i("FinderLiveMicHeartBeat", sb.toString());
        long j = ((C55001u) bVar2.mo71262a(cls3)).f154420q.f182392d;
        long j2 = ((C55001u) bVar2.mo71262a(cls3)).f154416j;
        String str = ((C55001u) bVar2.mo71262a(cls3)).f154423t;
        byte[] bArr = ((C55001u) bVar2.mo71262a(cls3)).f154417n;
        C59919a aVar2 = f171024g;
        new C58276c(j, j2, str, bArr, i2, t, i, c, aVar2.mo84846b(bVar2), aVar2.mo84845a(bVar2), new LinkedList(), new C59925b(this)).mo9225i();
    }

    /* renamed from: b */
    public String mo58873b() {
        return "activeMicHeartBeat";
    }
}
