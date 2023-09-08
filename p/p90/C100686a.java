package p90;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import p823sg.C101611g;
import q90.C101060a;
import q90.C101061b;

/* renamed from: p90.a */
public class C100686a implements C101061b<String> {

    /* renamed from: a */
    public String f294998a;

    /* renamed from: b */
    public String f294999b;

    /* renamed from: c */
    public Object f295000c;

    /* renamed from: d */
    public WeakReference<C101611g.C101612b> f295001d;

    /* renamed from: e */
    public int f295002e;

    /* renamed from: f */
    public long f295003f = 0;

    /* renamed from: g */
    public String f295004g;

    public C100686a(String str, String str2, Object obj, int i, C101611g.C101612b bVar, C101611g.C101613c cVar) {
        this.f294998a = str;
        this.f294999b = str2;
        this.f295000c = obj;
        this.f295002e = i;
        this.f295001d = new WeakReference<>(bVar);
        new WeakReference(cVar);
        this.f295003f = System.currentTimeMillis();
        this.f295004g = new SimpleDateFormat("HH:mm:ss").format(new Date(this.f295003f));
        C101060a aVar = C101060a.f295868c;
    }

    /* renamed from: a */
    public Object mo140114a() {
        return this.f294998a;
    }

    /* renamed from: b */
    public Object mo140115b() {
        return this.f294999b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r0 = ((p90.C100686a) r2).f295000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0014
            boolean r0 = r2 instanceof p90.C100686a
            if (r0 == 0) goto L_0x0014
            r0 = r2
            p90.a r0 = (p90.C100686a) r0
            java.lang.Object r0 = r0.f295000c
            if (r0 == 0) goto L_0x0014
            java.lang.Object r2 = r1.f295000c
            boolean r2 = r0.equals(r2)
            return r2
        L_0x0014:
            boolean r2 = super.equals(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C100686a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object obj = this.f295000c;
        return obj != null ? obj.hashCode() : super.hashCode();
    }

    public String toString() {
        return String.format("StructBitmap %s key:%s size %s realObj %s cacheTime %s now %s", new Object[]{Integer.valueOf(hashCode()), this.f294998a, Util.getSizeKB((long) this.f295002e), this.f295000c, this.f295004g, new SimpleDateFormat("HH:mm:ss").format(new Date(System.currentTimeMillis()))});
    }
}
