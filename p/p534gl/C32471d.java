package p534gl;

import java.util.LinkedList;
import jp3.C9486a;
import jp3.C9487b;

/* renamed from: gl.d */
public final class C32471d extends C32468a {

    /* renamed from: f */
    public final C32474g f86274f = new C32474g();

    /* renamed from: g */
    public final C32476i f86275g;

    /* renamed from: h */
    public final LinkedList<C32482o> f86276h;

    public C32471d(C9487b<C9486a> bVar) {
        super(bVar);
        this.f86275g = new C32476i(bVar);
        this.f86276h = new LinkedList<>();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m39735a(p534gl.C32471d r7, java.util.List r8, java.util.List r9) {
        /*
            r7.getClass()
            int r7 = r9.size()
            r0 = 0
            r1 = 0
        L_0x0009:
            if (r1 >= r7) goto L_0x0067
            int r2 = r8.size()
            r3 = 100
            if (r2 < r3) goto L_0x0020
            r7 = 25
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r3 = (long) r7
            r1 = 1418(0x58a, double:7.006E-321)
            r5 = 1
            r0.mo175913w(r1, r3, r5)
            goto L_0x0067
        L_0x0020:
            java.lang.Object r2 = r9.get(r1)
            gl.o r2 = (p534gl.C32482o) r2
            boolean r3 = r8.isEmpty()
            r4 = 1
            if (r3 == 0) goto L_0x002e
            goto L_0x0053
        L_0x002e:
            java.util.Iterator r3 = r8.iterator()
        L_0x0032:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0053
            java.lang.Object r5 = r3.next()
            gl.o r5 = (p534gl.C32482o) r5
            com.tencent.mm.storage.emotion.EmojiInfo r5 = r5.f86293a
            java.lang.String r5 = r5.getMd5()
            com.tencent.mm.storage.emotion.EmojiInfo r6 = r2.f86293a
            java.lang.String r6 = r6.getMd5()
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            r5 = r5 ^ r4
            if (r5 != 0) goto L_0x0032
            r3 = 0
            goto L_0x0054
        L_0x0053:
            r3 = 1
        L_0x0054:
            if (r3 == 0) goto L_0x0064
            int r3 = r8.size()
            int r3 = r3 + r4
            r2.f86295c = r3
            java.lang.Object r2 = r9.get(r1)
            r8.add(r2)
        L_0x0064:
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p534gl.C32471d.m39735a(gl.d, java.util.List, java.util.List):void");
    }
}
