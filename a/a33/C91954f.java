package a33;

import android.graphics.Rect;
import com.tencent.p014mm.plugin.recordvideo.jumper.MediaEditReportInfo;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96531b0;
import com.tencent.p014mm.plugin.vlog.model.C96549l0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.plugin.vlog.model.C96560z0;
import com.tencent.p014mm.sdk.platformtools.Log;
import d23.C106976a;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import iy3.C60641c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import sp3.C110801c;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64197v;
import w80.C111750i;

/* renamed from: a33.f */
public final class C91954f {

    /* renamed from: a */
    public final LinkedList<String> f263256a = new LinkedList<>();

    /* renamed from: b */
    public final LinkedList<Integer> f263257b = new LinkedList<>();

    /* renamed from: c */
    public final LinkedList<C96549l0> f263258c = new LinkedList<>();

    /* renamed from: d */
    public final LinkedList<C106205q0> f263259d = new LinkedList<>();

    /* renamed from: e */
    public volatile int f263260e;

    /* renamed from: f */
    public volatile int f263261f;

    /* renamed from: g */
    public final Rect f263262g = new Rect();

    /* renamed from: h */
    public final Rect f263263h = new Rect();

    /* renamed from: i */
    public final Rect f263264i = new Rect();

    /* renamed from: j */
    public C96552p0 f263265j = new C96552p0((List<C106205q0>) C64186f0.f181907d);

    /* renamed from: k */
    public final LinkedList<C106205q0> f263266k = new LinkedList<>();

    /* renamed from: l */
    public int f263267l;

    /* renamed from: m */
    public int f263268m;

    /* renamed from: a33.f$a */
    public enum C91955a {
        FIT_CENTER
    }

    /* renamed from: a */
    public final void mo125805a() {
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_video_enable_hdr_lut, 1) == 1) {
            LinkedList<C106205q0> linkedList = this.f263266k;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C106205q0 q0Var : linkedList) {
                if (q0Var.f316491b == 2) {
                    C96552p0 p0Var = this.f263265j;
                    C111750i.C102362a a = C111750i.f334661a.mo163488a(q0Var.f316490a);
                    if (a != null) {
                        p0Var.mo134609f(a.f301462b, a.f301463c);
                    }
                }
                arrayList.add(C13598b0.f38549a);
            }
        }
    }

    /* renamed from: b */
    public final void mo125806b() {
        this.f263266k.clear();
        this.f263266k.addAll(this.f263259d);
        C96552p0 p0Var = new C96552p0((List<C106205q0>) this.f263266k);
        this.f263265j = p0Var;
        p0Var.mo134625v(0);
        C96552p0 p0Var2 = this.f263265j;
        C106976a aVar = C106976a.f320208a;
        p0Var2.mo134623t(C106976a.f320215h);
        this.f263265j.mo81184c(this.f263260e, this.f263261f);
        mo125805a();
    }

    /* renamed from: c */
    public final boolean mo125807c() {
        if (this.f263260e != 0 && this.f263261f != 0) {
            return true;
        }
        Log.m105920e("MicroMsg.MediaModel", "isNormalSizeValid maxWidth: " + this.f263260e + ", maxHeight: " + this.f263261f);
        return false;
    }

    /* renamed from: d */
    public final void mo125808d(int i, int i2) {
        Log.m105924i("MicroMsg.MediaModel", "maxWidth: " + i + ", maxHeight: " + i2);
        this.f263261f = i2;
        this.f263260e = i;
    }

    /* renamed from: e */
    public final void mo125809e(C91955a aVar) {
        C87412m.m108594g(aVar, "type");
        for (C106205q0 q0Var : this.f263259d) {
            boolean z = false;
            this.f263262g.set(0, 0, this.f263260e, this.f263261f);
            if (q0Var.f316495f > q0Var.f316496g) {
                z = true;
            }
            int ordinal = aVar.ordinal();
            float f = 1.0f;
            if (ordinal == 0) {
                Log.m105924i("MicroMsg.MediaModel", "CENTER_CROP, sourceWidth: " + q0Var.f316495f + ", sourceHeight: " + q0Var.f316496g + ", maxWidth: " + this.f263260e + ", maxHeight: " + this.f263261f);
                if (!(q0Var.f316496g == 0 || q0Var.f316495f == 0 || this.f263261f == 0 || this.f263260e == 0)) {
                    if (q0Var.f316495f * this.f263261f > this.f263260e * q0Var.f316496g) {
                        float f2 = ((float) this.f263261f) / (((float) q0Var.f316496g) * 1.0f);
                        int b = C60641c.m70921b((((float) this.f263260e) - (((float) q0Var.f316495f) * f2)) * 0.5f);
                        Rect rect = this.f263262g;
                        rect.left += b;
                        rect.right -= b;
                        Log.m105924i("MicroMsg.MediaModel", "CENTER_CROP, scale: " + f2 + ", dx: " + b);
                    } else {
                        float f3 = ((float) this.f263260e) / (((float) q0Var.f316495f) * 1.0f);
                        int b2 = C60641c.m70921b((((float) this.f263261f) - (((float) q0Var.f316496g) * f3)) * 0.5f);
                        Rect rect2 = this.f263262g;
                        rect2.top += b2;
                        rect2.bottom -= b2;
                        Log.m105924i("MicroMsg.MediaModel", "CENTER_CROP, scale: " + f3 + ", dy: " + b2);
                    }
                }
                q0Var.f316501l.f331474l.set(this.f263262g);
                q0Var.f316498i.f316484b.set(this.f263262g);
                q0Var.f316498i.f316486d.set(this.f263262g);
            } else if (ordinal == 1) {
                Log.m105924i("MicroMsg.MediaModel", "CENTER_INSIDE, sourceWidth: " + q0Var.f316495f + ", sourceHeight: " + q0Var.f316496g + ", maxWidth: " + this.f263260e + ", maxHeight: " + this.f263261f);
                if (!(q0Var.f316496g == 0 || q0Var.f316495f == 0 || this.f263261f == 0 || this.f263260e == 0)) {
                    if (q0Var.f316495f > this.f263260e || q0Var.f316496g > this.f263261f) {
                        f = Math.min(((float) this.f263260e) / (((float) q0Var.f316495f) * 1.0f), ((float) this.f263261f) / (((float) q0Var.f316496g) * 1.0f));
                    }
                    int b3 = C60641c.m70921b((((float) this.f263260e) - (((float) q0Var.f316495f) * f)) * 0.5f);
                    int b4 = C60641c.m70921b((((float) this.f263261f) - (((float) q0Var.f316496g) * f)) * 0.5f);
                    Rect rect3 = this.f263262g;
                    rect3.left += b3;
                    rect3.right -= b3;
                    rect3.top += b4;
                    rect3.bottom -= b4;
                    Log.m105924i("MicroMsg.MediaModel", "CENTER_INSIDE, scale: " + f + ", dx: " + b3 + ", dy: " + b4);
                }
                q0Var.f316501l.f331474l.set(this.f263262g);
                q0Var.f316498i.f316484b.set(this.f263262g);
                q0Var.f316498i.f316486d.set(this.f263262g);
            } else if (ordinal == 2) {
                Log.m105924i("MicroMsg.MediaModel", "FIT_CENTER, sourceWidth: " + q0Var.f316495f + ", sourceHeight: " + q0Var.f316496g + ",maxWidth: " + this.f263260e + ", maxHeight: " + this.f263261f);
                if (!(q0Var.f316496g == 0 || q0Var.f316495f == 0 || this.f263261f == 0 || this.f263260e == 0)) {
                    if (q0Var.f316495f * this.f263261f > this.f263260e * q0Var.f316496g) {
                        float f4 = ((float) this.f263260e) / (((float) q0Var.f316495f) * 1.0f);
                        int b5 = C60641c.m70921b((((float) this.f263261f) - (((float) q0Var.f316496g) * f4)) * 0.5f);
                        Rect rect4 = this.f263262g;
                        rect4.top += b5;
                        rect4.bottom -= b5;
                        Log.m105924i("MicroMsg.MediaModel", "FIT_CENTER, scale: " + f4 + ", dy: " + b5);
                    } else {
                        float f5 = ((float) this.f263261f) / (((float) q0Var.f316496g) * 1.0f);
                        int b6 = C60641c.m70921b((((float) this.f263260e) - (((float) q0Var.f316495f) * f5)) * 0.5f);
                        Rect rect5 = this.f263262g;
                        rect5.left += b6;
                        rect5.right -= b6;
                        Log.m105924i("MicroMsg.MediaModel", "FIT_CENTER, scale: " + f5 + ", dx: " + b6);
                    }
                }
                q0Var.f316501l.f331474l.set(this.f263262g);
                q0Var.f316498i.f316484b.set(this.f263262g);
                q0Var.f316498i.f316486d.set(this.f263262g);
            }
            this.f263264i.set(this.f263262g);
            Log.m105924i("MicroMsg.MediaModel", "changeRectWithLocationOffset " + z + ", " + this.f263262g);
            int i = this.f263268m;
            if (!(i == 2 || i == 0 || z)) {
                int height = this.f263262g.height();
                Rect rect6 = this.f263262g;
                int i2 = this.f263267l;
                rect6.top = i2;
                rect6.bottom = i2 + height;
            }
            q0Var.f316501l.f331474l.set(this.f263262g);
            q0Var.f316498i.f316484b.set(this.f263262g);
            q0Var.f316498i.f316486d.set(this.f263262g);
        }
    }

    /* renamed from: f */
    public final void mo125810f(List<String> list, List<Integer> list2, List<Integer> list3) {
        long j;
        C96560z0 z0Var;
        int i;
        C106205q0 q0Var;
        List<String> list4 = list;
        List<Integer> list5 = list2;
        List<Integer> list6 = list3;
        C87412m.m108594g(list4, "paths");
        C87412m.m108594g(list5, "types");
        C87412m.m108594g(list6, "sourceFrom");
        this.f263256a.clear();
        this.f263257b.clear();
        this.f263258c.clear();
        this.f263259d.clear();
        this.f263256a.addAll(list4);
        this.f263257b.addAll(list5);
        this.f263258c.addAll(C96549l0.f282563d.mo134607a(list4, list5, list6));
        LinkedList<C106205q0> linkedList = this.f263259d;
        LinkedList<C96549l0> linkedList2 = this.f263258c;
        C87412m.m108594g(linkedList2, "sources");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
        for (C96549l0 l0Var : linkedList2) {
            if (l0Var instanceof C96560z0) {
                q0Var = new C106205q0(((C96560z0) l0Var).f282624e, 2, l0Var.f282566c);
                q0Var.f316501l.mo162363a();
            } else if (l0Var instanceof C96531b0) {
                q0Var = new C106205q0(((C96531b0) l0Var).f282487e, 1, l0Var.f282566c);
                q0Var.f316501l.mo162363a();
            } else {
                q0Var = null;
            }
            arrayList.add(q0Var);
        }
        List J = C110818d0.m150912J(arrayList);
        ArrayList arrayList2 = (ArrayList) J;
        Iterator it = arrayList2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C106205q0 q0Var2 = (C106205q0) next;
                C96549l0 l0Var2 = linkedList2.get(i2);
                int i4 = q0Var2.f316491b;
                ArrayList arrayList3 = arrayList2;
                if (i4 == 1) {
                    C87412m.m108592e(l0Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.ImageSource");
                    j = 4000;
                    q0Var2.f316500k.type = 1;
                    z0Var = (C96531b0) l0Var2;
                } else if (i4 != 2) {
                    Log.m105924i("MicroMsg.MediaModel", "unknown track type:" + q0Var2.f316491b);
                    j = 0;
                    z0Var = l0Var2;
                } else {
                    C87412m.m108592e(l0Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoSource");
                    C96560z0 z0Var2 = (C96560z0) l0Var2;
                    j = z0Var2.f282625f;
                    q0Var2.f316500k.type = 2;
                    z0Var = z0Var2;
                }
                q0Var2.mo81190d(0);
                q0Var2.mo81188b(j);
                MediaEditReportInfo.EditItem editItem = q0Var2.f316500k;
                editItem.originDuration = j;
                editItem.targetDuration = j;
                this.f263263h.set(0, 0, z0Var.f282564a, z0Var.f282565b);
                int i5 = z0Var.f282564a;
                if (i5 > 1080 || (i = z0Var.f282565b) > 1280) {
                    float max = Math.max((((float) i5) * 1.0f) / ((float) 1080), (((float) z0Var.f282565b) * 1.0f) / ((float) 1280));
                    q0Var2.f316495f = (int) (((float) z0Var.f282564a) / max);
                    q0Var2.f316496g = (int) (((float) z0Var.f282565b) / max);
                    q0Var2.f316497h = max;
                } else {
                    q0Var2.f316495f = i5;
                    q0Var2.f316496g = i;
                }
                arrayList2 = arrayList3;
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        C110801c.C101691a aVar = C110801c.f331462v;
        ArrayList arrayList4 = new ArrayList(C36907w.m41090l(J, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((C106205q0) it4.next()).f316501l);
        }
        aVar.mo141145a(arrayList4);
        linkedList.addAll(J);
    }
}
