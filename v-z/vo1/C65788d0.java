package vo1;

import android.os.Bundle;
import bp1.C54519d;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58115i;
import d60.C58124b;
import gy3.C87412m;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13604l;

/* renamed from: vo1.d0 */
public final class C65788d0 implements C65818s0 {

    /* renamed from: a */
    public final /* synthetic */ C65770a0 f189231a;

    public C65788d0(C65770a0 a0Var) {
        this.f189231a = a0Var;
    }

    /* renamed from: a */
    public boolean mo89823a(JSONObject jSONObject, boolean z, C13604l<Integer, Integer> lVar) {
        for (C65818s0 a : this.f189231a.f189198l) {
            a.mo89823a(jSONObject, z, lVar);
        }
        return true;
    }

    /* renamed from: b */
    public void mo89824b(boolean z) {
        C54519d dVar = (C54519d) this.f189231a.mo89804e(C54519d.class);
        if (dVar != null) {
            if (dVar.f152853p == z) {
                Log.m105924i("MMFinder.LiveReplaySlice", "set isDocCast:" + dVar.f152853p + '!');
            }
            dVar.f152853p = z;
        }
        for (C65818s0 b : this.f189231a.f189198l) {
            b.mo89824b(z);
        }
    }

    /* renamed from: c */
    public void mo89825c(JSONObject jSONObject) {
        for (C65818s0 c : this.f189231a.f189198l) {
            c.mo89825c(jSONObject);
        }
    }

    /* renamed from: d */
    public void mo89826d() {
        for (C65818s0 d : this.f189231a.f189198l) {
            d.mo89826d();
        }
    }

    /* renamed from: e */
    public void mo89827e(boolean z) {
        for (C65818s0 e : this.f189231a.f189198l) {
            e.mo89827e(z);
        }
    }

    /* renamed from: f */
    public void mo89828f() {
        C54519d dVar = (C54519d) this.f189231a.mo89804e(C54519d.class);
        if (dVar != null) {
            dVar.mo75369O3(C58115i.C58117b.AUDIO_MODE);
        }
        for (C65818s0 f : this.f189231a.f189198l) {
            f.mo89828f();
        }
    }

    /* renamed from: g */
    public void mo89829g() {
        for (C65818s0 g : this.f189231a.f189198l) {
            g.mo89829g();
        }
    }

    /* renamed from: h */
    public void mo89830h() {
        for (C65818s0 h : this.f189231a.f189198l) {
            h.mo89830h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        if ((r2.f165852a.getScaleType() == 0) == true) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if ((r2.f165852a.getScaleType() == 1) == true) goto L_0x0019;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo89831i(boolean r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0025
            vo1.a0 r2 = r3.f189231a
            cp1.m r2 = r2.f189201o
            if (r2 == 0) goto L_0x0018
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r2 = r2.f165852a
            int r2 = r2.getScaleType()
            if (r2 != r0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            if (r2 != r0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 != 0) goto L_0x0045
            vo1.a0 r0 = r3.f189231a
            cp1.m r0 = r0.f189201o
            if (r0 == 0) goto L_0x0045
            r0.mo82762h()
            goto L_0x0045
        L_0x0025:
            vo1.a0 r2 = r3.f189231a
            cp1.m r2 = r2.f189201o
            if (r2 == 0) goto L_0x0039
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r2 = r2.f165852a
            int r2 = r2.getScaleType()
            if (r2 != 0) goto L_0x0035
            r2 = 1
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            if (r2 != r0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 != 0) goto L_0x0045
            vo1.a0 r0 = r3.f189231a
            cp1.m r0 = r0.f189201o
            if (r0 == 0) goto L_0x0045
            r0.mo82761g()
        L_0x0045:
            vo1.a0 r0 = r3.f189231a
            r0.f189199m = r4
            r0.f189200n = r5
            java.util.HashSet<vo1.s0> r0 = r0.f189198l
            java.util.Iterator r0 = r0.iterator()
        L_0x0051:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0061
            java.lang.Object r1 = r0.next()
            vo1.s0 r1 = (vo1.C65818s0) r1
            r1.mo89831i(r4, r5)
            goto L_0x0051
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65788d0.mo89831i(boolean, boolean):void");
    }

    /* renamed from: j */
    public void mo89832j(JSONArray jSONArray) {
        for (C65818s0 j : this.f189231a.f189198l) {
            j.mo89832j(jSONArray);
        }
    }

    /* renamed from: k */
    public void mo89833k() {
        for (C65818s0 k : this.f189231a.f189198l) {
            k.mo89833k();
        }
    }

    /* renamed from: l */
    public void mo89834l(boolean z, C13604l<Integer, Integer> lVar) {
        for (C65818s0 l : this.f189231a.f189198l) {
            l.mo89834l(z, lVar);
        }
    }

    /* renamed from: m */
    public void mo89835m(String str) {
        for (C65818s0 m : this.f189231a.f189198l) {
            m.mo89835m(str);
        }
    }

    /* renamed from: n */
    public void mo89836n() {
        C54519d dVar = (C54519d) this.f189231a.mo89804e(C54519d.class);
        if (dVar != null) {
            dVar.mo75369O3(C58115i.C58117b.NORMAL_MODE);
        }
        Iterator<C65818s0> it = this.f189231a.f189198l.iterator();
        while (it.hasNext()) {
            it.next().mo89836n();
        }
    }

    public void statusChange(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        for (C65818s0 statusChange : this.f189231a.f189198l) {
            statusChange.statusChange(bVar, bundle);
        }
    }
}
