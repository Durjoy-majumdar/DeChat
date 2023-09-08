package cl1;

import al1.C39611s;
import android.os.Bundle;
import com.tencent.p014mm.live.core.core.model.UserVolumeInfo;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di1.C7333c;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13603j;
import sx3.C64175a0;
import tf0.C64918r1;
import y50.C66512f;
import y50.C66514h;
import y50.C66521k0;

/* renamed from: cl1.t0 */
public final class C39981t0 extends C39970c<C45795b> {

    /* renamed from: f */
    public List<C39611s> f107194f;

    /* renamed from: g */
    public final List<C39611s> f107195g;

    /* renamed from: h */
    public final ArrayList<C39611s> f107196h = new ArrayList<>();

    /* renamed from: i */
    public final LiveMutableData<ArrayList<C39611s>> f107197i = new LiveMutableData<>();

    /* renamed from: j */
    public final C7333c<Boolean> f107198j = new C7333c<>((C32227p) null, 1, (C8480h) null);

    /* renamed from: n */
    public final LiveMutableData<Integer> f107199n;

    /* renamed from: o */
    public final LiveMutableData<Bundle> f107200o;

    /* renamed from: p */
    public final LiveMutableData<String> f107201p;

    /* renamed from: q */
    public final LiveMutableData<C39611s> f107202q;

    /* renamed from: r */
    public boolean f107203r;

    /* renamed from: cl1.t0$a */
    public enum C39982a {
        CACHE,
        SEI,
        LIST
    }

    /* renamed from: cl1.t0$b */
    public static final class C39983b extends C87413o implements C32226l<C39611s, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C39611s f107208d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39983b(C39611s sVar) {
            super(1);
            this.f107208d = sVar;
        }

        public Object invoke(Object obj) {
            C39611s sVar = (C39611s) obj;
            C87412m.m108594g(sVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(Util.isEqual(this.f107208d.f106357a, sVar.f106357a));
        }
    }

    /* renamed from: cl1.t0$c */
    public static final class C39984c extends C87413o implements C32226l<C39611s, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C39611s f107209d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39984c(C39611s sVar) {
            super(1);
            this.f107209d = sVar;
        }

        public Object invoke(Object obj) {
            C39611s sVar = (C39611s) obj;
            C87412m.m108594g(sVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(Util.isEqual(this.f107209d.f106357a, sVar.f106357a));
        }
    }

    /* renamed from: cl1.t0$d */
    public static final class C39985d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C39981t0 f107210d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39985d(C39981t0 t0Var) {
            super(0);
            this.f107210d = t0Var;
        }

        public Object invoke() {
            C66514h hVar = C66521k0.f191361a;
            if (hVar != null) {
                hVar.onCloseLiveMic(new C66512f(((C55001u) this.f107210d.business(C55001u.class)).f154420q.f182392d, "", "", ((C54991o) this.f107210d.business(C54991o.class)).mo76015n4(), 0, 16, (C8480h) null));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39981t0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        List<C39611s> synchronizedList = Collections.synchronizedList(new ArrayList());
        C87412m.m108593f(synchronizedList, "synchronizedList(ArrayList<MicIntercomData>())");
        this.f107194f = synchronizedList;
        List<C39611s> synchronizedList2 = Collections.synchronizedList(new ArrayList());
        C87412m.m108593f(synchronizedList2, "synchronizedList(ArrayList<MicIntercomData>())");
        this.f107195g = synchronizedList2;
        new LiveMutableData();
        this.f107199n = new LiveMutableData<>();
        this.f107200o = new LiveMutableData<>();
        this.f107201p = new LiveMutableData<>();
        this.f107202q = new LiveMutableData<>();
    }

    /* renamed from: c3 */
    public final void mo62586c3(C39982a aVar, C39611s sVar) {
        C87412m.m108594g(aVar, "type");
        C87412m.m108594g(sVar, "micUser");
        List<C39611s> d3 = mo62587d3(aVar);
        C61926c.m72700y(d3, new C39983b(sVar));
        d3.add(sVar);
    }

    /* renamed from: d3 */
    public final List<C39611s> mo62587d3(C39982a aVar) {
        C87412m.m108594g(aVar, "type");
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return this.f107194f;
        }
        if (ordinal == 1) {
            return this.f107195g;
        }
        if (ordinal == 2) {
            return this.f107196h;
        }
        throw new C13603j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
        r5 = r5.f134919d;
     */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62588e3(te3.C50268li2 r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x00d5
            java.util.LinkedList<te3.ki2> r11 = r11.f137441d
            if (r11 == 0) goto L_0x00d5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "joinLiveRsp micList : "
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r2 = r11.iterator()
        L_0x0019:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x006d
            java.lang.Object r3 = r2.next()
            te3.ki2 r3 = (te3.C50135ki2) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "data = userId: "
            r4.append(r5)
            java.lang.String r5 = r3.f136808e
            r4.append(r5)
            java.lang.String r5 = " scene: "
            r4.append(r5)
            java.lang.String r5 = r3.f136808e
            r4.append(r5)
            java.lang.String r5 = " userName: "
            r4.append(r5)
            te3.hx0 r5 = r3.f136807d
            r6 = 0
            if (r5 == 0) goto L_0x004f
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.f134919d
            if (r5 == 0) goto L_0x004f
            java.lang.String r5 = r5.username
            goto L_0x0050
        L_0x004f:
            r5 = r6
        L_0x0050:
            r4.append(r5)
            java.lang.String r5 = " nickName: "
            r4.append(r5)
            te3.hx0 r3 = r3.f136807d
            if (r3 == 0) goto L_0x0062
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f134919d
            if (r3 == 0) goto L_0x0062
            java.lang.String r6 = r3.nickname
        L_0x0062:
            r4.append(r6)
            java.lang.String r3 = r4.toString()
            r1.append(r3)
            goto L_0x0019
        L_0x006d:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "sb.toString()"
            gy3.C87412m.m108593f(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LiveMicIntercomSlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.util.Iterator r11 = r11.iterator()
        L_0x0086:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = r11.next()
            te3.ki2 r0 = (te3.C50135ki2) r0
            cl1.t0$a r1 = cl1.C39981t0.C39982a.CACHE
            al1.s r9 = new al1.s
            java.lang.String r2 = r0.f136808e
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x009e
            r4 = r3
            goto L_0x009f
        L_0x009e:
            r4 = r2
        L_0x009f:
            te3.hx0 r2 = r0.f136807d
            if (r2 == 0) goto L_0x00ab
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r2.f134919d
            if (r5 == 0) goto L_0x00ab
            java.lang.String r5 = r5.headUrl
            if (r5 != 0) goto L_0x00ac
        L_0x00ab:
            r5 = r3
        L_0x00ac:
            if (r2 == 0) goto L_0x00b6
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r2.f134919d
            if (r6 == 0) goto L_0x00b6
            java.lang.String r6 = r6.username
            if (r6 != 0) goto L_0x00b7
        L_0x00b6:
            r6 = r3
        L_0x00b7:
            if (r2 == 0) goto L_0x00c4
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.f134919d
            if (r2 == 0) goto L_0x00c4
            java.lang.String r2 = r2.nickname
            if (r2 != 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r7 = r2
            goto L_0x00c5
        L_0x00c4:
            r7 = r3
        L_0x00c5:
            java.lang.String r0 = r0.f136809f
            r8 = 0
            r2 = r9
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.mo62586c3(r1, r9)
            goto L_0x0086
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C39981t0.mo62588e3(te3.li2):void");
    }

    /* renamed from: f3 */
    public final void mo62589f3() {
        synchronized (this.f107196h) {
            this.f107196h.clear();
            List<C39611s> list = this.f107195g;
            synchronized (list) {
                for (C39611s sVar : list) {
                    List<C39611s> list2 = this.f107194f;
                    synchronized (list2) {
                        for (C39611s sVar2 : list2) {
                            if (Util.isEqual(sVar.f106357a, sVar2.f106357a)) {
                                C64175a0.m75512t(this.f107196h, new C39984c(sVar));
                                ArrayList<C39611s> arrayList = this.f107196h;
                                sVar2.f106362f = sVar.f106362f;
                                arrayList.add(sVar2);
                            }
                        }
                    }
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        this.f107197i.postValue(this.f107196h);
    }

    /* renamed from: g3 */
    public final void mo62590g3(ArrayList<UserVolumeInfo> arrayList) {
        int i;
        T t;
        LiveMutableData<Integer> liveMutableData = this.f107199n;
        if (arrayList != null) {
            synchronized (arrayList) {
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Util.isEqual(((UserVolumeInfo) t).f157117d, ((C54991o) business(C54991o.class)).mo76015n4())) {
                        break;
                    }
                }
            }
            UserVolumeInfo userVolumeInfo = (UserVolumeInfo) t;
            if (userVolumeInfo != null) {
                i = userVolumeInfo.f157118e;
                liveMutableData.postValue(Integer.valueOf(i));
            }
        }
        i = 0;
        liveMutableData.postValue(Integer.valueOf(i));
    }

    /* renamed from: i3 */
    public final void mo62591i3() {
        Class cls = C64918r1.class;
        Log.m105924i("LiveMicIntercomSlice", "startTrtcExitRoom");
        ((C64918r1) C86312j.m106911c(cls)).mo89065rc();
        ((C64918r1) C86312j.m106911c(cls)).mo89069zq();
        C61926c.m72668M(new C39985d(this));
    }

    /* renamed from: j3 */
    public final void mo62592j3(LinkedList<C39611s> linkedList) {
        this.f107195g.clear();
        if (linkedList != null) {
            for (C39611s c3 : linkedList) {
                mo62586c3(C39982a.SEI, c3);
            }
        }
    }

    public void onCleared() {
        this.f107203r = false;
        this.f107194f.clear();
        this.f107195g.clear();
        this.f107196h.clear();
    }
}
