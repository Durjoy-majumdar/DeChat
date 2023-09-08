package p1020pa;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import gy3.C87412m;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;
import p979ia.C117147b;

/* renamed from: pa.c */
public class C89325c implements C89328e {

    /* renamed from: a */
    public final int[] f257292a = new int[2];

    /* renamed from: b */
    public final Rect f257293b = new Rect();

    /* renamed from: c */
    public boolean f257294c = false;

    /* renamed from: d */
    public int f257295d = 0;

    /* renamed from: e */
    public View f257296e;

    /* renamed from: f */
    public final LinkedHashSet<C89326a> f257297f = new LinkedHashSet<>();

    /* renamed from: pa.c$a */
    public interface C89326a {
        /* renamed from: a */
        void mo123689a(boolean z, int i);
    }

    /* renamed from: a */
    public final Context mo123686a() {
        View view = this.f257296e;
        if (view != null) {
            return view.getContext();
        }
        Context context = C117147b.f350981b;
        if (context != null) {
            return context;
        }
        C87412m.m108603p("appContext");
        throw null;
    }

    /* renamed from: b */
    public final int mo123687b() {
        View view = this.f257296e;
        if ((view == null ? null : view.getRootView()) == null) {
            return 0;
        }
        Rect rect = this.f257293b;
        View view2 = this.f257296e;
        if (view2 != null) {
            view2.getWindowVisibleDisplayFrame(rect);
            this.f257296e.getLocationInWindow(this.f257292a);
            rect.top = this.f257292a[1];
        }
        View view3 = this.f257296e;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        return (C107207u.C107211e.m145208c(view3) ? this.f257296e.getMeasuredHeight() : mo123686a().getResources().getDisplayMetrics().heightPixels) - rect.top;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if ((mo123687b() - p1020pa.C89330g.m111650b(mo123686a())) > r1) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
        if (mo123687b() > r1) goto L_0x0063;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo123688c(android.view.View r1, boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r0 = this;
            r0.f257296e = r1
            android.graphics.Rect r2 = r0.f257293b
            r3 = 1
            if (r1 == 0) goto L_0x0017
            r1.getWindowVisibleDisplayFrame(r2)
            android.view.View r1 = r0.f257296e
            int[] r4 = r0.f257292a
            r1.getLocationInWindow(r4)
            int[] r1 = r0.f257292a
            r1 = r1[r3]
            r2.top = r1
        L_0x0017:
            int r1 = r2.height()
            r2 = 0
            if (r6 <= 0) goto L_0x0020
            r4 = r6
            goto L_0x003e
        L_0x0020:
            android.content.Context r4 = r0.mo123686a()
            boolean r4 = p1020pa.C89330g.m111651c(r4)
            if (r4 != 0) goto L_0x0033
            android.content.Context r4 = r0.mo123686a()
            int r4 = p1020pa.C89330g.m111650b(r4)
            goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            int r5 = r0.mo123687b()
            int r5 = r5 - r1
            int r5 = r5 - r4
            int r4 = java.lang.Math.max(r5, r2)
        L_0x003e:
            if (r6 <= 0) goto L_0x0041
            goto L_0x0063
        L_0x0041:
            android.content.Context r5 = r0.mo123686a()
            boolean r5 = p1020pa.C89330g.m111651c(r5)
            if (r5 == 0) goto L_0x005b
            android.content.Context r5 = r0.mo123686a()
            int r5 = p1020pa.C89330g.m111650b(r5)
            int r6 = r0.mo123687b()
            int r6 = r6 - r5
            if (r6 <= r1) goto L_0x0062
            goto L_0x0063
        L_0x005b:
            int r5 = r0.mo123687b()
            if (r5 <= r1) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r3 = 0
        L_0x0063:
            boolean r1 = r0.f257294c
            if (r1 != r3) goto L_0x006b
            int r1 = r0.f257295d
            if (r1 == r4) goto L_0x0087
        L_0x006b:
            java.util.LinkedHashSet<pa.c$a> r1 = r0.f257297f
            java.lang.Object r1 = r1.clone()
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0077:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0087
            java.lang.Object r2 = r1.next()
            pa.c$a r2 = (p1020pa.C89325c.C89326a) r2
            r2.mo123689a(r3, r4)
            goto L_0x0077
        L_0x0087:
            r0.f257294c = r3
            r0.f257295d = r4
            r1 = 0
            r0.f257296e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1020pa.C89325c.mo123688c(android.view.View, boolean, int, int, int, int):void");
    }
}
