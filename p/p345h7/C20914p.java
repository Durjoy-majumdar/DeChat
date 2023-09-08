package p345h7;

import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import p294b7.C16738b;
import p294b7.C16741e;
import p294b7.C16742f;
import p294b7.C16743g;
import p294b7.C16748l;
import p333e8.C20540l;
import p333e8.C20541m;
import p333e8.C20549u;

/* renamed from: h7.p */
public final class C20914p implements C16741e {

    /* renamed from: a */
    public final C20549u f59226a = new C20549u(0);

    /* renamed from: b */
    public final SparseArray<C20915a> f59227b = new SparseArray<>();

    /* renamed from: c */
    public final C20541m f59228c = new C20541m(4096);

    /* renamed from: d */
    public boolean f59229d;

    /* renamed from: e */
    public boolean f59230e;

    /* renamed from: f */
    public boolean f59231f;

    /* renamed from: g */
    public C16743g f59232g;

    /* renamed from: h7.p$a */
    public static final class C20915a {

        /* renamed from: a */
        public final C20901h f59233a;

        /* renamed from: b */
        public final C20549u f59234b;

        /* renamed from: c */
        public final C20540l f59235c = new C20540l(new byte[64], 64);

        /* renamed from: d */
        public boolean f59236d;

        /* renamed from: e */
        public boolean f59237e;

        /* renamed from: f */
        public boolean f59238f;

        /* renamed from: g */
        public long f59239g;

        public C20915a(C20901h hVar, C20549u uVar) {
            this.f59233a = hVar;
            this.f59234b = uVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo17745a(p294b7.C16742f r14, p294b7.C16747k r15) {
        /*
            r13 = this;
            e8.m r15 = r13.f59228c
            byte[] r15 = r15.f57809a
            b7.b r14 = (p294b7.C16738b) r14
            r0 = 0
            r1 = 4
            r2 = 1
            boolean r15 = r14.mo17734b(r15, r0, r1, r2)
            r3 = -1
            if (r15 != 0) goto L_0x0011
            return r3
        L_0x0011:
            e8.m r15 = r13.f59228c
            r15.mo32113x(r0)
            e8.m r15 = r13.f59228c
            int r15 = r15.mo32092c()
            r4 = 441(0x1b9, float:6.18E-43)
            if (r15 != r4) goto L_0x0021
            return r3
        L_0x0021:
            r3 = 442(0x1ba, float:6.2E-43)
            if (r15 != r3) goto L_0x0043
            e8.m r15 = r13.f59228c
            byte[] r15 = r15.f57809a
            r1 = 10
            r14.mo17734b(r15, r0, r1, r0)
            e8.m r15 = r13.f59228c
            r1 = 9
            r15.mo32113x(r1)
            e8.m r15 = r13.f59228c
            int r15 = r15.mo32103n()
            r15 = r15 & 7
            int r15 = r15 + 14
            r14.mo17738f(r15)
            return r0
        L_0x0043:
            r3 = 443(0x1bb, float:6.21E-43)
            r4 = 2
            r5 = 6
            if (r15 != r3) goto L_0x0060
            e8.m r15 = r13.f59228c
            byte[] r15 = r15.f57809a
            r14.mo17734b(r15, r0, r4, r0)
            e8.m r15 = r13.f59228c
            r15.mo32113x(r0)
            e8.m r15 = r13.f59228c
            int r15 = r15.mo32108s()
            int r15 = r15 + r5
            r14.mo17738f(r15)
            return r0
        L_0x0060:
            r3 = r15 & -256(0xffffffffffffff00, float:NaN)
            r6 = 8
            int r3 = r3 >> r6
            if (r3 == r2) goto L_0x006b
            r14.mo17738f(r2)
            return r0
        L_0x006b:
            r15 = r15 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<h7.p$a> r3 = r13.f59227b
            java.lang.Object r3 = r3.get(r15)
            h7.p$a r3 = (p345h7.C20914p.C20915a) r3
            boolean r7 = r13.f59229d
            if (r7 != 0) goto L_0x00e0
            if (r3 != 0) goto L_0x00c8
            boolean r7 = r13.f59230e
            r8 = 0
            if (r7 != 0) goto L_0x008d
            r9 = 189(0xbd, float:2.65E-43)
            if (r15 != r9) goto L_0x008d
            h7.b r7 = new h7.b
            r7.<init>(r8)
            r13.f59230e = r2
        L_0x008b:
            r8 = r7
            goto L_0x00ae
        L_0x008d:
            if (r7 != 0) goto L_0x009d
            r7 = r15 & 224(0xe0, float:3.14E-43)
            r9 = 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L_0x009d
            h7.m r7 = new h7.m
            r7.<init>(r8)
            r13.f59230e = r2
            goto L_0x008b
        L_0x009d:
            boolean r7 = r13.f59231f
            if (r7 != 0) goto L_0x00ae
            r7 = r15 & 240(0xf0, float:3.36E-43)
            r9 = 224(0xe0, float:3.14E-43)
            if (r7 != r9) goto L_0x00ae
            h7.i r8 = new h7.i
            r8.<init>()
            r13.f59231f = r2
        L_0x00ae:
            if (r8 == 0) goto L_0x00c8
            h7.v$d r3 = new h7.v$d
            r7 = 256(0x100, float:3.59E-43)
            r3.<init>(r15, r7)
            b7.g r7 = r13.f59232g
            r8.mo32612d(r7, r3)
            h7.p$a r3 = new h7.p$a
            e8.u r7 = r13.f59226a
            r3.<init>(r8, r7)
            android.util.SparseArray<h7.p$a> r7 = r13.f59227b
            r7.put(r15, r3)
        L_0x00c8:
            boolean r15 = r13.f59230e
            if (r15 == 0) goto L_0x00d0
            boolean r15 = r13.f59231f
            if (r15 != 0) goto L_0x00d9
        L_0x00d0:
            long r7 = r14.f45242c
            r9 = 1048576(0x100000, double:5.180654E-318)
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 <= 0) goto L_0x00e0
        L_0x00d9:
            r13.f59229d = r2
            b7.g r15 = r13.f59232g
            r15.mo17751i()
        L_0x00e0:
            e8.m r15 = r13.f59228c
            byte[] r15 = r15.f57809a
            r14.mo17734b(r15, r0, r4, r0)
            e8.m r15 = r13.f59228c
            r15.mo32113x(r0)
            e8.m r15 = r13.f59228c
            int r15 = r15.mo32108s()
            int r15 = r15 + r5
            if (r3 != 0) goto L_0x00fa
            r14.mo17738f(r15)
            goto L_0x01dd
        L_0x00fa:
            e8.m r4 = r13.f59228c
            r4.mo32110u(r15)
            e8.m r4 = r13.f59228c
            byte[] r4 = r4.f57809a
            r14.mo17737e(r4, r0, r15, r0)
            e8.m r14 = r13.f59228c
            r14.mo32113x(r5)
            e8.m r14 = r13.f59228c
            e8.l r15 = r3.f59235c
            byte[] r15 = r15.f57805a
            r4 = 3
            r14.mo32091b(r15, r0, r4)
            e8.l r15 = r3.f59235c
            r15.mo32088e(r0)
            e8.l r15 = r3.f59235c
            r15.mo32089f(r6)
            e8.l r15 = r3.f59235c
            boolean r15 = r15.mo32086c()
            r3.f59236d = r15
            e8.l r15 = r3.f59235c
            boolean r15 = r15.mo32086c()
            r3.f59237e = r15
            e8.l r15 = r3.f59235c
            r15.mo32089f(r5)
            e8.l r15 = r3.f59235c
            int r15 = r15.mo32087d(r6)
            e8.l r5 = r3.f59235c
            byte[] r5 = r5.f57805a
            r14.mo32091b(r5, r0, r15)
            e8.l r15 = r3.f59235c
            r15.mo32088e(r0)
            r5 = 0
            r3.f59239g = r5
            boolean r15 = r3.f59236d
            if (r15 == 0) goto L_0x01c3
            e8.l r15 = r3.f59235c
            r15.mo32089f(r1)
            e8.l r15 = r3.f59235c
            int r15 = r15.mo32087d(r4)
            long r5 = (long) r15
            r15 = 30
            long r5 = r5 << r15
            e8.l r7 = r3.f59235c
            r7.mo32089f(r2)
            e8.l r7 = r3.f59235c
            r8 = 15
            int r7 = r7.mo32087d(r8)
            int r7 = r7 << r8
            long r9 = (long) r7
            long r5 = r5 | r9
            e8.l r7 = r3.f59235c
            r7.mo32089f(r2)
            e8.l r7 = r3.f59235c
            int r7 = r7.mo32087d(r8)
            long r9 = (long) r7
            long r5 = r5 | r9
            e8.l r7 = r3.f59235c
            r7.mo32089f(r2)
            boolean r7 = r3.f59238f
            if (r7 != 0) goto L_0x01bb
            boolean r7 = r3.f59237e
            if (r7 == 0) goto L_0x01bb
            e8.l r7 = r3.f59235c
            r7.mo32089f(r1)
            e8.l r1 = r3.f59235c
            int r1 = r1.mo32087d(r4)
            long r9 = (long) r1
            long r9 = r9 << r15
            e8.l r15 = r3.f59235c
            r15.mo32089f(r2)
            e8.l r15 = r3.f59235c
            int r15 = r15.mo32087d(r8)
            int r15 = r15 << r8
            long r11 = (long) r15
            long r9 = r9 | r11
            e8.l r15 = r3.f59235c
            r15.mo32089f(r2)
            e8.l r15 = r3.f59235c
            int r15 = r15.mo32087d(r8)
            long r7 = (long) r15
            long r7 = r7 | r9
            e8.l r15 = r3.f59235c
            r15.mo32089f(r2)
            e8.u r15 = r3.f59234b
            r15.mo32131b(r7)
            r3.f59238f = r2
        L_0x01bb:
            e8.u r15 = r3.f59234b
            long r4 = r15.mo32131b(r5)
            r3.f59239g = r4
        L_0x01c3:
            h7.h r15 = r3.f59233a
            long r4 = r3.f59239g
            r15.mo32613e(r4, r2)
            h7.h r15 = r3.f59233a
            r15.mo32609a(r14)
            h7.h r14 = r3.f59233a
            r14.mo32611c()
            e8.m r14 = r13.f59228c
            int r15 = r14.mo32090a()
            r14.mo32112w(r15)
        L_0x01dd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p345h7.C20914p.mo17745a(b7.f, b7.k):int");
    }

    /* renamed from: b */
    public void mo17746b(long j, long j2) {
        this.f59226a.f57834c = -9223372036854775807L;
        for (int i = 0; i < this.f59227b.size(); i++) {
            C20915a valueAt = this.f59227b.valueAt(i);
            valueAt.f59238f = false;
            valueAt.f59233a.mo32610b();
        }
    }

    /* renamed from: c */
    public boolean mo17747c(C16742f fVar) {
        byte[] bArr = new byte[14];
        ((C16738b) fVar).mo17734b(bArr, 0, 14, false);
        if (442 != (((bArr[0] & ExifInterface.MARKER) << 24) | ((bArr[1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[2] & ExifInterface.MARKER) << 8) | (bArr[3] & ExifInterface.MARKER)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        C16738b bVar = (C16738b) fVar;
        bVar.mo17733a(bArr[13] & 7, false);
        bVar.mo17734b(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[1] & ExifInterface.MARKER) << 8)) | (bArr[2] & ExifInterface.MARKER));
    }

    /* renamed from: e */
    public void mo17748e(C16743g gVar) {
        this.f59232g = gVar;
        gVar.mo17750g(new C16748l.C16749a(-9223372036854775807L));
    }

    public void release() {
    }
}
