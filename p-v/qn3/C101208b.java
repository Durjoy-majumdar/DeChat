package qn3;

/* renamed from: qn3.b */
public class C101208b extends C77381a {

    /* renamed from: a */
    public String f296345a;

    /* renamed from: b */
    public int f296346b = 104857600;

    /* renamed from: c */
    public int f296347c = 2048;

    /* renamed from: d */
    public int f296348d = 2048;

    /* renamed from: e */
    public int f296349e = 0;

    /* renamed from: f */
    public int f296350f = 0;

    /* renamed from: g */
    public int f296351g = 0;

    /* renamed from: h */
    public C101209a f296352h;

    /* renamed from: qn3.b$a */
    public interface C101209a {
        /* renamed from: a */
        void mo127704a();

        /* renamed from: b */
        void mo127705b(C101208b bVar);
    }

    public C101208b(String str) {
        this.f296345a = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo140653a(qn3.C101208b.C101209a r7) {
        /*
            r6 = this;
            r6.f296352h = r7
            java.lang.String r0 = "MicroMsg.ImageBoundaryCheck"
            if (r7 != 0) goto L_0x000d
            java.lang.String r7 = "dz[callback is null]"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r7)
            goto L_0x0093
        L_0x000d:
            java.lang.String r7 = r6.f296345a
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x001a
            java.lang.String r7 = "dz[check image but path is null or nil]"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r7)
        L_0x001a:
            java.lang.String r7 = r6.f296345a
            long r1 = com.tencent.p014mm.vfs.C86013q1.m106451l(r7)
            int r7 = (int) r1
            r6.f296349e = r7
            java.lang.String r7 = r6.f296345a
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r2 = 1
            r1.inJustDecodeBounds = r2
            com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r7, r1)
            int r7 = r1.outWidth
            r6.f296350f = r7
            int r7 = r1.outHeight
            r6.f296351g = r7
            int r7 = r6.f296349e
            int r1 = r6.f296346b
            r3 = 0
            if (r7 > r1) goto L_0x0049
            if (r7 >= 0) goto L_0x0043
            r1 = 1
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            if (r1 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r7 = 1
            goto L_0x0057
        L_0x0049:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r3] = r7
            java.lang.String r7 = "dz[over size] size = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r7, r1)
            r7 = 0
        L_0x0057:
            int r1 = r6.f296350f
            int r4 = r6.f296347c
            if (r1 > r4) goto L_0x0063
            int r4 = r6.f296351g
            int r5 = r6.f296348d
            if (r4 <= r5) goto L_0x007a
        L_0x0063:
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7[r3] = r1
            int r1 = r6.f296351g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7[r2] = r1
            java.lang.String r1 = "dz[over width or height] width = %d, height = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r7)
            r7 = 0
        L_0x007a:
            if (r7 == 0) goto L_0x0082
            java.lang.String r7 = "dz[status ok]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            goto L_0x0083
        L_0x0082:
            r3 = 1
        L_0x0083:
            if (r3 == 0) goto L_0x008e
            if (r3 == r2) goto L_0x0088
            goto L_0x0093
        L_0x0088:
            qn3.b$a r7 = r6.f296352h
            r7.mo127704a()
            goto L_0x0093
        L_0x008e:
            qn3.b$a r7 = r6.f296352h
            r7.mo127705b(r6)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qn3.C101208b.mo140653a(qn3.b$a):void");
    }
}
