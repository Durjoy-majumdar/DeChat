package z14;

import java.util.LinkedList;
import pe3.C89349b;
import u14.C52418a;
import y14.C53486a;

/* renamed from: z14.a */
public class C53733a {

    /* renamed from: a */
    public final C53486a f150850a;

    public C53733a(byte[] bArr) {
        this.f150850a = new C53486a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void mo74314a(int i, boolean z) {
        C53486a aVar = this.f150850a;
        aVar.mo74158h(i, 0);
        if (z) {
            aVar.mo74154d(1);
        } else {
            aVar.mo74154d(0);
        }
    }

    /* renamed from: b */
    public void mo74315b(int i, C89349b bVar) {
        C53486a aVar = this.f150850a;
        if (bVar == null) {
            aVar.getClass();
            return;
        }
        aVar.mo74158h(i, 2);
        byte[] f = bVar.mo123703f();
        aVar.mo74156f(f.length);
        aVar.mo74155e(f);
    }

    /* renamed from: c */
    public void mo74316c(int i, double d) {
        C53486a aVar = this.f150850a;
        aVar.mo74158h(i, 1);
        long doubleToLongBits = Double.doubleToLongBits(d);
        aVar.mo74154d(((int) doubleToLongBits) & 255);
        aVar.mo74154d(((int) (doubleToLongBits >> 8)) & 255);
        aVar.mo74154d(((int) (doubleToLongBits >> 16)) & 255);
        aVar.mo74154d(((int) (doubleToLongBits >> 24)) & 255);
        aVar.mo74154d(((int) (doubleToLongBits >> 32)) & 255);
        aVar.mo74154d(((int) (doubleToLongBits >> 40)) & 255);
        aVar.mo74154d(((int) (doubleToLongBits >> 48)) & 255);
        aVar.mo74154d(((int) (doubleToLongBits >> 56)) & 255);
    }

    /* renamed from: d */
    public void mo74317d(int i, float f) {
        C53486a aVar = this.f150850a;
        aVar.mo74158h(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        aVar.mo74154d(floatToIntBits & 255);
        aVar.mo74154d((floatToIntBits >> 8) & 255);
        aVar.mo74154d((floatToIntBits >> 16) & 255);
        aVar.mo74154d((floatToIntBits >> 24) & 255);
    }

    /* renamed from: e */
    public void mo74318e(int i, int i2) {
        C53486a aVar = this.f150850a;
        aVar.mo74158h(i, 0);
        if (i2 >= 0) {
            aVar.mo74156f(i2);
        } else {
            aVar.mo74157g((long) i2);
        }
    }

    /* renamed from: f */
    public void mo74319f(int i, int i2) {
        mo74318e(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        mo74314a(r4, ((java.lang.Boolean) r6.get(r0)).booleanValue());
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        if (r0 >= r6.size()) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        mo74315b(r4, (pe3.C89349b) r6.get(r0));
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        if (r0 >= r6.size()) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        mo74317d(r4, ((java.lang.Float) r6.get(r0)).floatValue());
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        if (r0 >= r6.size()) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        mo74316c(r4, ((java.lang.Double) r6.get(r0)).doubleValue());
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        if (r0 >= r6.size()) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        mo74321h(r4, ((java.lang.Long) r6.get(r0)).longValue());
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a4, code lost:
        if (r0 >= r6.size()) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a6, code lost:
        mo74318e(r4, ((java.lang.Integer) r6.get(r0)).intValue());
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ba, code lost:
        if (r0 >= r6.size()) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bc, code lost:
        mo74323j(r4, (java.lang.String) r6.get(r0));
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r0 >= r6.size()) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        r5 = (pe3.C47465a) r6.get(r0);
        mo74322i(r4, r5.computeSize());
        r5.writeFields(r3);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (r0 >= r6.size()) goto L_0x00c8;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo74320g(int r4, int r5, java.util.LinkedList<?> r6) {
        /*
            r3 = this;
            if (r6 == 0) goto L_0x00c8
            r0 = 0
            switch(r5) {
                case 1: goto L_0x00b6;
                case 2: goto L_0x00a0;
                case 3: goto L_0x008a;
                case 4: goto L_0x0074;
                case 5: goto L_0x005e;
                case 6: goto L_0x004c;
                case 7: goto L_0x0036;
                case 8: goto L_0x001d;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "The data type was not found, the id used was "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x001d:
            int r5 = r6.size()
            if (r0 >= r5) goto L_0x00c8
            java.lang.Object r5 = r6.get(r0)
            pe3.a r5 = (pe3.C47465a) r5
            int r1 = r5.computeSize()
            r3.mo74322i(r4, r1)
            r5.writeFields(r3)
            int r0 = r0 + 1
            goto L_0x001d
        L_0x0036:
            int r5 = r6.size()
            if (r0 >= r5) goto L_0x00c8
            java.lang.Object r5 = r6.get(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r3.mo74314a(r4, r5)
            int r0 = r0 + 1
            goto L_0x0036
        L_0x004c:
            int r5 = r6.size()
            if (r0 >= r5) goto L_0x00c8
            java.lang.Object r5 = r6.get(r0)
            pe3.b r5 = (pe3.C89349b) r5
            r3.mo74315b(r4, r5)
            int r0 = r0 + 1
            goto L_0x004c
        L_0x005e:
            int r5 = r6.size()
            if (r0 >= r5) goto L_0x00c8
            java.lang.Object r5 = r6.get(r0)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r3.mo74317d(r4, r5)
            int r0 = r0 + 1
            goto L_0x005e
        L_0x0074:
            int r5 = r6.size()
            if (r0 >= r5) goto L_0x00c8
            java.lang.Object r5 = r6.get(r0)
            java.lang.Double r5 = (java.lang.Double) r5
            double r1 = r5.doubleValue()
            r3.mo74316c(r4, r1)
            int r0 = r0 + 1
            goto L_0x0074
        L_0x008a:
            int r5 = r6.size()
            if (r0 >= r5) goto L_0x00c8
            java.lang.Object r5 = r6.get(r0)
            java.lang.Long r5 = (java.lang.Long) r5
            long r1 = r5.longValue()
            r3.mo74321h(r4, r1)
            int r0 = r0 + 1
            goto L_0x008a
        L_0x00a0:
            int r5 = r6.size()
            if (r0 >= r5) goto L_0x00c8
            java.lang.Object r5 = r6.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.mo74318e(r4, r5)
            int r0 = r0 + 1
            goto L_0x00a0
        L_0x00b6:
            int r5 = r6.size()
            if (r0 >= r5) goto L_0x00c8
            java.lang.Object r5 = r6.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            r3.mo74323j(r4, r5)
            int r0 = r0 + 1
            goto L_0x00b6
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z14.C53733a.mo74320g(int, int, java.util.LinkedList):void");
    }

    /* renamed from: h */
    public void mo74321h(int i, long j) {
        C53486a aVar = this.f150850a;
        aVar.mo74158h(i, 0);
        aVar.mo74157g(j);
    }

    /* renamed from: i */
    public void mo74322i(int i, int i2) {
        C53486a aVar = this.f150850a;
        aVar.mo74158h(i, 2);
        aVar.mo74156f(i2);
    }

    /* renamed from: j */
    public void mo74323j(int i, String str) {
        C53486a aVar = this.f150850a;
        if (str == null) {
            aVar.getClass();
            return;
        }
        aVar.mo74158h(i, 2);
        byte[] bytes = str.getBytes("UTF-8");
        aVar.mo74156f(bytes.length);
        aVar.mo74155e(bytes);
    }

    /* renamed from: k */
    public void mo74324k(int i, int i2, LinkedList<?> linkedList) {
        if (linkedList != null) {
            int i3 = 0;
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalArgumentException("The data type was not found, the id used was " + i2);
                } else if (linkedList.size() > 0) {
                    this.f150850a.mo74158h(i, 2);
                    this.f150850a.mo74156f(C52418a.m58685l(i2, linkedList));
                    while (i3 < linkedList.size()) {
                        this.f150850a.mo74157g(((Long) linkedList.get(i3)).longValue());
                        i3++;
                    }
                }
            } else if (linkedList.size() > 0) {
                this.f150850a.mo74158h(i, 2);
                this.f150850a.mo74156f(C52418a.m58685l(i2, linkedList));
                while (i3 < linkedList.size()) {
                    this.f150850a.mo74156f(((Integer) linkedList.get(i3)).intValue());
                    i3++;
                }
            }
        }
    }
}
