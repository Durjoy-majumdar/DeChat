package yo1;

import al1.C54127h;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import rx3.C13604l;
import te3.C49431fj1;

/* renamed from: yo1.c */
public final class C16058c {

    /* renamed from: a */
    public C49431fj1 f43186a;

    /* renamed from: b */
    public int f43187b;

    /* renamed from: c */
    public ArrayList<C54127h> f43188c = new ArrayList<>();

    /* renamed from: d */
    public C13604l<Long, Boolean> f43189d;

    /* renamed from: e */
    public String f43190e = "";

    /* renamed from: f */
    public int f43191f;

    public C16058c() {
        C49431fj1 fj12 = new C49431fj1();
        this.f43186a = fj12;
        this.f43187b = fj12.f133536h;
    }

    /* renamed from: a */
    public final C54127h mo14672a() {
        int size = this.f43188c.size();
        int i = this.f43187b;
        boolean z = false;
        if (i >= 0 && i < size) {
            z = true;
        }
        if (z) {
            return this.f43188c.get(i);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001d, code lost:
        r0 = r0.f151978e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14673b(int r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "set curPos:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderReplayLiveData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            al1.h r0 = r2.mo14672a()
            if (r0 == 0) goto L_0x002a
            fj1.b r0 = r0.f151978e
            if (r0 == 0) goto L_0x002a
            java.lang.Class<bp1.d> r1 = bp1.C54519d.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r1)
            bp1.d r0 = (bp1.C54519d) r0
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r0 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r0.f152839A = r3
        L_0x0030:
            r2.f43187b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yo1.C16058c.mo14673b(int):void");
    }

    /* renamed from: c */
    public final void mo14674c(C13604l<Long, Boolean> lVar) {
        Log.printInfoStack("FinderReplayLiveData", "fromFloatInfo:" + this.f43189d + " -> " + lVar, new Object[0]);
        this.f43189d = lVar;
    }
}
