package com.tencent.p014mm.plugin.vlog.model;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Size;
import com.tencent.p014mm.plugin.recordvideo.jumper.MediaEditReportInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import d23.C106976a;
import d23.C7165c;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i33.C98595b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jp3.C9486a;
import rx3.C13598b0;
import rx3.C13605o;
import sp3.C110801c;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64197v;
import sx3.C77813z;
import te3.C50308lt1;

/* renamed from: com.tencent.mm.plugin.vlog.model.f0 */
public final class C106195f0 implements C9486a {

    /* renamed from: A */
    public float f316423A;

    /* renamed from: B */
    public final C30518i0 f316424B;

    /* renamed from: d */
    public final LinkedList<String> f316425d = new LinkedList<>();

    /* renamed from: e */
    public final LinkedList<Integer> f316426e = new LinkedList<>();

    /* renamed from: f */
    public final LinkedList<C96549l0> f316427f = new LinkedList<>();

    /* renamed from: g */
    public final LinkedList<C106205q0> f316428g = new LinkedList<>();

    /* renamed from: h */
    public boolean f316429h;

    /* renamed from: i */
    public boolean f316430i;

    /* renamed from: j */
    public int f316431j;

    /* renamed from: n */
    public int f316432n;

    /* renamed from: o */
    public float f316433o = C98595b.f289089a.mo137985c();

    /* renamed from: p */
    public final RectF f316434p = new RectF();

    /* renamed from: q */
    public final RectF f316435q = new RectF();

    /* renamed from: r */
    public long f316436r;

    /* renamed from: s */
    public final C96554r0 f316437s = new C96554r0();

    /* renamed from: t */
    public C96552p0 f316438t;

    /* renamed from: u */
    public final LinkedList<C106205q0> f316439u;

    /* renamed from: v */
    public int f316440v;

    /* renamed from: w */
    public int f316441w;

    /* renamed from: x */
    public C106205q0 f316442x;

    /* renamed from: y */
    public long f316443y;

    /* renamed from: z */
    public long f316444z;

    /* renamed from: com.tencent.mm.plugin.vlog.model.f0$a */
    public static final class C106196a extends C87413o implements C32226l<C50308lt1, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C106195f0 f316445d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106196a(C106195f0 f0Var) {
            super(1);
            this.f316445d = f0Var;
        }

        public Object invoke(Object obj) {
            C50308lt1 lt12 = (C50308lt1) obj;
            this.f316445d.getClass();
            this.f316445d.getClass();
            this.f316445d.getClass();
            return C13598b0.f38549a;
        }
    }

    public C106195f0() {
        new C106196a(this);
        this.f316438t = new C96552p0((List<C106205q0>) C64186f0.f181907d);
        this.f316439u = new LinkedList<>();
        this.f316440v = -1;
        this.f316441w = -1;
        this.f316423A = 1.0f;
        this.f316424B = new C30518i0(0, 0);
    }

    /* renamed from: l */
    public static /* synthetic */ void m142873l(C106195f0 f0Var, boolean z, long j, long j2, int i, int i2, boolean z2, int i3, Object obj) {
        long j3 = -1;
        long j4 = (i3 & 2) != 0 ? -1 : j;
        if ((i3 & 4) == 0) {
            j3 = j2;
        }
        int i4 = 0;
        int i5 = (i3 & 8) != 0 ? 0 : i;
        if ((i3 & 16) == 0) {
            i4 = i2;
        }
        f0Var.mo152118k(z, j4, j3, i5, i4, (i3 & 32) != 0 ? true : z2);
    }

    /* renamed from: a */
    public final void mo152110a(C96552p0 p0Var, boolean z) {
        C87412m.m108594g(p0Var, "refComposition");
        ArrayList<C106205q0> arrayList = p0Var.f282570c;
        C110801c.C101691a aVar = C110801c.f331462v;
        ArrayList<C106205q0> arrayList2 = new ArrayList<>();
        for (T next : arrayList) {
            int i = ((C106205q0) next).f316491b;
            boolean z2 = true;
            if (!(i == 2 || i == 1)) {
                z2 = false;
            }
            if (z2) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
        for (C106205q0 q0Var : arrayList2) {
            arrayList3.add(q0Var.f316501l);
        }
        aVar.mo141145a(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        C96552p0 p0Var2 = new C96552p0((List<C106205q0>) arrayList4);
        this.f316438t = p0Var2;
        if (z) {
            p0Var2.mo134625v(this.f316436r);
        }
        C96552p0 p0Var3 = this.f316438t;
        C106976a aVar2 = C106976a.f320208a;
        p0Var3.mo134623t(C106976a.f320215h);
        this.f316438t.mo81184c(this.f316431j, this.f316432n);
    }

    /* renamed from: b */
    public final void mo152111b() {
        this.f316440v = -1;
        this.f316439u.clear();
        this.f316439u.addAll(this.f316428g);
        C96552p0 p0Var = new C96552p0((List<C106205q0>) this.f316439u);
        this.f316438t = p0Var;
        p0Var.mo134625v(this.f316436r);
        C96552p0 p0Var2 = this.f316438t;
        C106976a aVar = C106976a.f320208a;
        p0Var2.mo134623t(C106976a.f320215h);
        this.f316438t.mo81184c(this.f316431j, this.f316432n);
    }

    /* renamed from: c */
    public final void mo152112c(C106976a.C31054c cVar) {
        C87412m.m108594g(cVar, "template");
        this.f316440v = -1;
        this.f316439u.clear();
        C106976a aVar = C106976a.f320208a;
        LinkedList<C106205q0> linkedList = this.f316428g;
        C87412m.m108594g(linkedList, "sourceTrackList");
        long currentTicks = Util.currentTicks();
        HashMap hashMap = new HashMap();
        for (C106205q0 q0Var : linkedList) {
            hashMap.put(q0Var.f316490a, 0L);
        }
        ArrayList arrayList = new ArrayList();
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList((Collection) null);
        if (arrayList2.size() > 1) {
            C77813z.m93909o(arrayList2, new C7165c());
        }
        Object obj = ((Pair) C110818d0.m150923U(arrayList2)).first;
        cVar.getClass();
        arrayList2.set(arrayList2.size() - 1, Pair.create(obj, 0L));
        new HashMap();
        int i = 0;
        if (arrayList2.size() > 0) {
            Long l = (Long) ((Pair) arrayList2.get(0)).first;
            Long l2 = (Long) ((Pair) arrayList2.get(0)).second;
            long longValue = l2.longValue();
            C87412m.m108593f(l, "replacementStart");
            long longValue2 = longValue - l.longValue();
            C106205q0 q0Var2 = linkedList.get(0 % linkedList.size());
            Long l3 = (Long) hashMap.get(q0Var2.f316490a);
            long longValue3 = l3 == null ? -1 : l3.longValue();
            int size = linkedList.size();
            int i2 = 0;
            while (i2 < size) {
                q0Var2 = linkedList.get((i + i2) % linkedList.size());
                Long l4 = (Long) hashMap.get(q0Var2.f316490a);
                longValue3 = l4 == null ? -1 : l4.longValue();
                C110801c cVar2 = q0Var2.f316501l;
                LinkedList<C106205q0> linkedList2 = linkedList;
                if (longValue3 + longValue2 <= cVar2.f331465c - cVar2.f331464b || q0Var2.f316491b == 1) {
                    break;
                }
                i2++;
                C106976a.C31054c cVar3 = cVar;
                linkedList = linkedList2;
                i = 0;
            }
            C106205q0 q0Var3 = new C106205q0(q0Var2.f316490a, q0Var2.f316491b, 0, 4, (C8480h) null);
            if (q0Var2.f316491b == 1) {
                q0Var3.mo81190d(0);
                q0Var3.mo81188b(longValue2);
                q0Var3.f316501l.f331470h = longValue2;
            } else {
                q0Var3.mo81190d(longValue3);
                q0Var3.mo81188b(longValue3 + longValue2);
            }
            q0Var3.mo81191e(l.longValue());
            q0Var3.mo81187a(l2.longValue());
            q0Var3.f316495f = q0Var2.f316495f;
            q0Var3.f316496g = q0Var2.f316496g;
            q0Var3.f316497h = q0Var2.f316497h;
            q0Var3.f316501l.f331476n = false;
            q0Var3.f316498i.f316486d.set(q0Var2.f316498i.f316486d);
            q0Var3.f316498i.f316485c.set(q0Var2.f316498i.f316485c);
            q0Var3.f316498i.f316484b.set(q0Var2.f316498i.f316484b);
            C106204p pVar = q0Var3.f316498i;
            C106204p pVar2 = q0Var2.f316498i;
            pVar.f316487e = pVar2.f316487e;
            pVar.f316489g = pVar2.f316489g * 5.0f;
            pVar.f316488f = pVar2.f316488f * 5.0f;
            pVar.f316483a.set(pVar2.f316483a);
            cVar.getClass();
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("finish generate template track name:");
        cVar.getClass();
        sb.append((String) null);
        sb.append(", result.size:");
        sb.append(arrayList.size());
        sb.append(", replacementInfo:");
        cVar.getClass();
        sb.append((Object) null);
        sb.append(", template.duration:");
        cVar.getClass();
        sb.append(0);
        sb.append(", cost:");
        sb.append(Util.ticksToNow(currentTicks));
        Log.m105924i("MicroMsg.LocalEffectManager", sb.toString());
        cVar.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C106205q0 q0Var4 = (C106205q0) it.next();
            C110801c cVar4 = q0Var4.f316501l;
            cVar4.f331475m.set(0, 0, cVar4.f331471i, cVar4.f331472j);
            q0Var4.f316501l.f331476n = false;
        }
        this.f316439u.addAll(arrayList);
        C96552p0 p0Var = new C96552p0((List<C106205q0>) this.f316439u);
        this.f316438t = p0Var;
        cVar.getClass();
        p0Var.mo134625v(0);
        this.f316438t.mo134623t(C106976a.f320215h);
        cVar.getClass();
        throw null;
    }

    public void dead() {
        C96554r0 r0Var = this.f316437s;
        r0Var.f282594i = null;
        C86709a0.m107524d().mo123470p(1469, r0Var);
        C86709a0.m107524d().mo123470p(2972, r0Var);
    }

    /* renamed from: f */
    public final void mo152113f(List<C106205q0> list, List<C13605o<String, Long, Long>> list2) {
        T t;
        List<C106205q0> list3 = list;
        List<C13605o<String, Long, Long>> list4 = list2;
        C87412m.m108594g(list3, "trackList");
        C110801c.C101691a aVar = C110801c.f331462v;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            int i = ((C106205q0) next).f316491b;
            boolean z = true;
            if (!(i == 2 || i == 1)) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C106205q0) it.next()).f316501l);
        }
        aVar.mo141145a(arrayList2);
        Iterator<T> it4 = list.iterator();
        ArrayList arrayList3 = null;
        if (!it4.hasNext()) {
            t = null;
        } else {
            t = it4.next();
            if (it4.hasNext()) {
                long j = ((C106205q0) t).f316501l.f331465c;
                do {
                    T next2 = it4.next();
                    long j2 = ((C106205q0) next2).f316501l.f331465c;
                    if (j < j2) {
                        t = next2;
                        j = j2;
                    }
                } while (it4.hasNext());
            }
        }
        C106205q0 q0Var = (C106205q0) t;
        long j3 = q0Var != null ? q0Var.f316501l.f331465c : MAlarmHandler.NEXT_FIRE_INTERVAL;
        if (list4 != null) {
            arrayList3 = new ArrayList(C36907w.m41090l(list4, 10));
            Iterator<T> it5 = list2.iterator();
            while (it5.hasNext()) {
                C13605o oVar = (C13605o) it5.next();
                long longValue = ((Number) oVar.f38558e).longValue();
                long longValue2 = ((Number) oVar.f38559f).longValue();
                Iterator<T> it6 = it5;
                C106205q0 q0Var2 = r8;
                C106205q0 q0Var3 = new C106205q0((String) oVar.f38557d, 3, 0, 4, (C8480h) null);
                q0Var2.mo81191e(longValue);
                q0Var2.mo81187a(Math.min(longValue2, j3));
                q0Var2.mo81190d(0);
                q0Var2.mo81188b(longValue2 - longValue);
                q0Var2.f316501l.mo162369g(3.0f);
                arrayList3.add(q0Var2);
                it5 = it6;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(list3);
        if (arrayList3 != null) {
            arrayList4.addAll(arrayList3);
        }
        C96552p0 p0Var = new C96552p0((List<C106205q0>) arrayList4);
        this.f316438t = p0Var;
        p0Var.mo134625v(this.f316436r);
        this.f316438t.mo134623t(C106976a.f320215h);
        this.f316438t.mo81184c(this.f316431j, this.f316432n);
    }

    /* renamed from: g */
    public final C96552p0 mo152114g() {
        return this.f316438t;
    }

    /* renamed from: h */
    public final C106205q0 mo152115h() {
        return this.f316442x;
    }

    /* renamed from: i */
    public final void mo152116i(int i) {
        Log.m105924i("MicroMsg.MultiMediaModel", "editTrack index:" + i);
        this.f316441w = i;
        this.f316424B.f82226a = this.f316438t.mo134615l();
        this.f316424B.f82227b = this.f316438t.mo134613j();
        int i2 = this.f316441w;
        if (i2 >= 0 && i2 < this.f316439u.size()) {
            C106205q0 q0Var = this.f316439u.get(this.f316441w);
            C87412m.m108593f(q0Var, "playingList[editIndex]");
            C106205q0 q0Var2 = q0Var;
            this.f316442x = q0Var2;
            C110801c cVar = q0Var2.f316501l;
            this.f316443y = cVar.f331466d;
            this.f316444z = cVar.f331467e;
            this.f316423A = cVar.f331468f;
            C106205q0 q0Var3 = new C106205q0(q0Var2.f316490a, q0Var2.f316491b, 0, 4, (C8480h) null);
            q0Var3.mo81188b(q0Var2.f316501l.f331470h);
            C110801c cVar2 = q0Var2.f316501l;
            q0Var3.mo81187a((long) (((float) cVar2.f331470h) / cVar2.f331468f));
            q0Var3.mo152162m(q0Var2.f316501l.f331468f);
            q0Var3.f316495f = q0Var2.f316495f;
            q0Var3.f316496g = q0Var2.f316496g;
            q0Var3.f316498i.f316484b.set(q0Var2.f316498i.f316484b);
            q0Var3.f316498i.f316486d.set(q0Var2.f316498i.f316486d);
            q0Var3.f316498i.f316485c.set(q0Var2.f316498i.f316485c);
            q0Var3.f316498i.f316483a.set(q0Var2.f316498i.f316483a);
            q0Var3.f316501l.f331474l.set(q0Var2.f316501l.f331474l);
            q0Var3.f316501l.mo162370h();
            C96552p0 p0Var = new C96552p0((List<C106205q0>) C26236u.m33719b(q0Var3));
            this.f316438t = p0Var;
            p0Var.mo81184c(this.f316431j, this.f316432n);
            this.f316438t.mo134623t(C106976a.f320215h);
            C96552p0 p0Var2 = this.f316438t;
            float f = this.f316423A;
            p0Var2.mo81182a((long) (((float) this.f316443y) / f), (long) (((float) this.f316444z) / f));
        }
    }

    /* renamed from: j */
    public final void mo152117j(int i, long j, long j2) {
        Log.m105924i("MicroMsg.MultiMediaModel", "editTrack editIndex:" + i + ", start:" + j + ", end:" + j2);
        if (i >= 0 && i < this.f316439u.size()) {
            C106205q0 q0Var = this.f316439u.get(i);
            C87412m.m108593f(q0Var, "playingList[editIndex]");
            C106205q0 q0Var2 = q0Var;
            if (j >= 0 && j2 >= 0) {
                q0Var2.mo81190d(j);
                q0Var2.mo81188b(j2);
            }
            C110801c.C101691a aVar = C110801c.f331462v;
            LinkedList<C106205q0> linkedList = this.f316439u;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C106205q0 q0Var3 : linkedList) {
                arrayList.add(q0Var3.f316501l);
            }
            aVar.mo141145a(arrayList);
        }
        C96552p0 p0Var = new C96552p0((List<C106205q0>) this.f316439u);
        this.f316438t = p0Var;
        p0Var.mo134625v(this.f316436r);
        C96552p0 p0Var2 = this.f316438t;
        C106976a aVar2 = C106976a.f320208a;
        p0Var2.mo134623t(C106976a.f320215h);
        this.f316438t.mo81184c(this.f316431j, this.f316432n);
    }

    /* renamed from: k */
    public final void mo152118k(boolean z, long j, long j2, int i, int i2, boolean z2) {
        Log.m105924i("MicroMsg.MultiMediaModel", "endEditTrack editIndex:" + this.f316441w + ", confirm:" + z + ", start:" + j + ", end:" + j2);
        int i3 = this.f316441w;
        if (i3 >= 0 && i3 < this.f316439u.size()) {
            C106205q0 q0Var = this.f316439u.get(this.f316441w);
            C87412m.m108593f(q0Var, "playingList[editIndex]");
            C106205q0 q0Var2 = q0Var;
            MediaEditReportInfo.EditItem editItem = q0Var2.f316500k;
            editItem.clickEditCount++;
            editItem.durationCutCount += i;
            editItem.durationScrollCount += i2;
            if (!z || j < 0 || j2 < 0) {
                q0Var2.mo81190d(this.f316443y);
                q0Var2.mo81188b(this.f316444z);
            } else {
                q0Var2.mo81190d((long) (((float) j) * q0Var2.f316501l.f331468f));
                q0Var2.mo81188b((long) (((float) j2) * q0Var2.f316501l.f331468f));
            }
            C110801c cVar = q0Var2.f316501l;
            q0Var2.f316500k.targetDuration = (long) (((float) (cVar.f331467e - cVar.f331466d)) / cVar.f331468f);
            if (z2) {
                this.f316442x = null;
                this.f316441w = -1;
            }
            C110801c.C101691a aVar = C110801c.f331462v;
            LinkedList<C106205q0> linkedList = this.f316439u;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C106205q0 q0Var3 : linkedList) {
                arrayList.add(q0Var3.f316501l);
            }
            aVar.mo141145a(arrayList);
        }
        C96552p0 p0Var = new C96552p0((List<C106205q0>) this.f316439u);
        this.f316438t = p0Var;
        p0Var.mo134625v(this.f316436r);
        C96552p0 p0Var2 = this.f316438t;
        C106976a aVar2 = C106976a.f320208a;
        p0Var2.mo134623t(C106976a.f320215h);
        this.f316438t.mo81184c(this.f316431j, this.f316432n);
    }

    /* renamed from: n */
    public final List<C106205q0> mo152119n() {
        return this.f316428g;
    }

    /* renamed from: q */
    public final boolean mo152120q() {
        return this.f316429h;
    }

    /* renamed from: r */
    public final boolean mo152121r() {
        return this.f316440v >= 0;
    }

    /* renamed from: s */
    public final Rect mo152122s() {
        return this.f316428g.getFirst().f316498i.f316486d;
    }

    /* renamed from: t */
    public final void mo152123t(float f) {
        C106205q0 q0Var = this.f316442x;
        if (q0Var != null) {
            q0Var.mo152162m(f);
            q0Var.f316501l.mo162370h();
        }
        C106205q0 q0Var2 = (C106205q0) C110818d0.m150916N(this.f316438t.f282570c);
        if (q0Var2 != null) {
            q0Var2.mo152162m(f);
            q0Var2.f316501l.mo162370h();
            C96552p0 p0Var = this.f316438t;
            C110801c cVar = q0Var2.f316501l;
            p0Var.mo81182a(cVar.f331464b, cVar.f331465c);
        }
    }

    /* renamed from: u */
    public final void mo152124u(C106205q0 q0Var) {
        this.f316442x = q0Var;
    }

    /* renamed from: v */
    public final void mo152125v(RectF rectF, boolean z) {
        C87412m.m108594g(rectF, "maxVisibleRect");
        this.f316435q.set(rectF);
        this.f316434p.set(rectF);
        if (z) {
            this.f316434p.inset(0.0f, (rectF.height() - (rectF.width() * this.f316433o)) / ((float) 2));
        }
    }

    /* renamed from: w */
    public final void mo152126w(int i, int i2) {
        C96554r0 r0Var = this.f316437s;
        r0Var.getClass();
        Log.m105924i("MicroMsg.VLogDataManager", "setPreviewSize, width:" + i + ", " + i2);
        r0Var.f282598p = i2;
        r0Var.f282597o = i;
    }

    /* renamed from: y */
    public final void mo152127y(boolean z, Size size) {
        int i;
        int i2;
        C87412m.m108594g(size, "screenSize");
        Rect rect = new Rect();
        int i3 = 0;
        for (T next : this.f316428g) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C106205q0 q0Var = (C106205q0) next;
                C106204p pVar = q0Var.f316498i;
                float f = ((float) q0Var.f316496g) / ((float) q0Var.f316495f);
                if (i3 == 0) {
                    i2 = size.getWidth();
                    i = size.getHeight();
                } else {
                    i2 = rect.width();
                    i = rect.height();
                }
                float f2 = (float) i;
                float f3 = (float) i2;
                float f4 = f2 / f3;
                if ((i3 != 0 || !z) && (i3 == 0 || f <= f4)) {
                    float f5 = f2 / f;
                    float f6 = (f3 - f5) / ((float) 2);
                    pVar.f316486d.set((int) f6, 0, (int) (f5 + f6), i);
                } else {
                    float f7 = f3 * f;
                    float f8 = (f2 - f7) / ((float) 2);
                    pVar.f316486d.set(0, (int) f8, i2, (int) (f7 + f8));
                }
                if (i3 == 0) {
                    Rect rect2 = pVar.f316486d;
                    if (size.getWidth() * size.getHeight() < rect2.width() * rect2.height()) {
                        rect.set(0, 0, size.getWidth(), size.getHeight());
                    } else {
                        rect.set(rect2);
                    }
                }
                C106193d0.m142870b(pVar.f316483a, new RectF(0.0f, 0.0f, (float) q0Var.f316495f, (float) q0Var.f316496g), new RectF(rect));
                float a = C106193d0.m142869a(pVar.f316483a);
                pVar.f316487e = a;
                pVar.f316488f = 5.0f * a;
                pVar.f316489g = a * 0.25f;
                q0Var.f316501l.f331476n = true;
                i3 = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* renamed from: z */
    public final void mo152128z() {
        for (C106205q0 q0Var : this.f316428g) {
            C106204p pVar = q0Var.f316498i;
            if (pVar.f316483a.isIdentity()) {
                float f = (((float) q0Var.f316496g) * 1.0f) / ((float) q0Var.f316495f);
                this.f316434p.round(pVar.f316486d);
                if (f > this.f316434p.height() / this.f316434p.width()) {
                    float width = ((((float) q0Var.f316496g) * ((this.f316434p.width() * 1.0f) / ((float) q0Var.f316495f))) - this.f316434p.height()) / ((float) 2);
                    Rect rect = pVar.f316486d;
                    RectF rectF = this.f316434p;
                    rect.top = (int) (rectF.top - width);
                    rect.bottom = (int) (rectF.bottom + width);
                } else {
                    float height = ((((float) q0Var.f316495f) * ((this.f316434p.height() * 1.0f) / ((float) q0Var.f316496g))) - this.f316434p.width()) / ((float) 2);
                    Rect rect2 = pVar.f316486d;
                    RectF rectF2 = this.f316434p;
                    rect2.left = (int) (rectF2.left - height);
                    rect2.right = (int) (rectF2.right + height);
                }
                this.f316434p.round(pVar.f316484b);
                C106193d0.m142870b(pVar.f316483a, new RectF(0.0f, 0.0f, (float) q0Var.f316495f, (float) q0Var.f316496g), new RectF(pVar.f316486d));
                Rect rect3 = pVar.f316486d;
                RectF rectF3 = this.f316435q;
                rect3.offset(-((int) rectF3.left), -((int) rectF3.top));
                q0Var.f316501l.f331474l.set(pVar.f316486d);
                float a = C106193d0.m142869a(pVar.f316483a);
                pVar.f316487e = a;
                pVar.f316488f = 5.0f * a;
                pVar.f316489g = a * 0.25f;
            }
            q0Var.f316501l.f331476n = true;
        }
    }
}
