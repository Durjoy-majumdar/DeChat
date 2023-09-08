package kf1;

import android.content.Intent;
import java.util.ArrayList;

/* renamed from: kf1.d7 */
public final class C9686d7 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C9669c7 f30090d;

    /* renamed from: kf1.d7$a */
    public static final class C9687a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<String> f30091d;

        /* renamed from: e */
        public final /* synthetic */ C9669c7 f30092e;

        public C9687a(ArrayList<String> arrayList, C9669c7 c7Var) {
            this.f30091d = arrayList;
            this.f30092e = c7Var;
        }

        public final void run() {
            Intent intent = new Intent();
            intent.putExtra("extra_poi_list", this.f30091d);
            this.f30092e.f30214d.setResult(-1, intent);
            this.f30092e.f30214d.finish();
        }
    }

    public C9686d7(C9669c7 c7Var) {
        this.f30090d = c7Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r2 = (r2 = r2.f145743d).f140264d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kf1.c7 r1 = r4.f30090d
            kf1.g r1 = r1.mo10348I0()
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r1 = r1.f30175e
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataListJustForAdapter()
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r1.next()
            cm1.i2 r2 = (cm1.C0740i2) r2
            boolean r3 = r2 instanceof cm1.C0800z1
            if (r3 == 0) goto L_0x0015
            cm1.z1 r2 = (cm1.C0800z1) r2
            boolean r3 = r2.f1861e
            if (r3 == 0) goto L_0x0015
            te3.sq3 r2 = r2.f1860d
            te3.z74 r2 = r2.f141694d
            if (r2 == 0) goto L_0x003c
            te3.qe3 r2 = r2.f145743d
            if (r2 == 0) goto L_0x003c
            te3.je3 r2 = r2.f140264d
            if (r2 == 0) goto L_0x003c
            java.lang.String r2 = r2.f136052d
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0015
            r0.add(r2)
            goto L_0x0015
        L_0x0043:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[handleComplete], "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.FinderPoiRelateUIContract"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            zt3.t r1 = zt3.C119157j.f356862d
            kf1.d7$a r2 = new kf1.d7$a
            kf1.c7 r3 = r4.f30090d
            r2.<init>(r0, r3)
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183895z(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9686d7.run():void");
    }
}
