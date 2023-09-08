package p330d7;

import java.util.Stack;

/* renamed from: d7.a */
public final class C20435a implements C20438b {

    /* renamed from: a */
    public final byte[] f57349a = new byte[8];

    /* renamed from: b */
    public final Stack<C20437b> f57350b = new Stack<>();

    /* renamed from: c */
    public final C20445f f57351c = new C20445f();

    /* renamed from: d */
    public C20439c f57352d;

    /* renamed from: e */
    public int f57353e;

    /* renamed from: f */
    public int f57354f;

    /* renamed from: g */
    public long f57355g;

    /* renamed from: d7.a$b */
    public static final class C20437b {

        /* renamed from: a */
        public final int f57356a;

        /* renamed from: b */
        public final long f57357b;

        public C20437b(int i, long j, C20436a aVar) {
            this.f57356a = i;
            this.f57357b = j;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v30, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r2v36 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0553, code lost:
        if (r0 == 0) goto L_0x06e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0570, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0575, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0595, code lost:
        r5 = r0;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x061c, code lost:
        r5 = r0;
        r0 = null;
        r2 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x067a, code lost:
        r13 = r0;
        r20 = r2;
        r23 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x06d3, code lost:
        if (r0.mo32098i() == r2.getLeastSignificantBits()) goto L_0x06d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x06e0, code lost:
        if (r0 != 0) goto L_0x06e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x06e3, code lost:
        r5 = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_RAW;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x06e8, code lost:
        r5 = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_UNKNOWN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06ea, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0703, code lost:
        r2 = r0;
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0705, code lost:
        r23 = r0;
        r13 = r2;
        r20 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x070a, code lost:
        r0 = r6.f57429M | 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0710, code lost:
        if (r6.f57428L == false) goto L_0x0714;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0712, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0714, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0715, code lost:
        r0 = r0 | r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x071a, code lost:
        if (p333e8.C20536j.m22252d(r5) == false) goto L_0x0741;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x071c, code lost:
        r0 = com.google.android.exoplayer2.Format.m16641b(java.lang.Integer.toString(r34), r5, (java.lang.String) null, -1, r20, r6.f57423G, r6.f57425I, r23, r13, r6.f57441i, r0, r6.f57430N);
        r13 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0745, code lost:
        if (p333e8.C20536j.m22253e(r5) == false) goto L_0x0874;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0749, code lost:
        if (r6.f57446n != 0) goto L_0x075d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x074b, code lost:
        r0 = r6.f57444l;
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x074e, code lost:
        if (r0 != -1) goto L_0x0752;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0750, code lost:
        r0 = r6.f57442j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0752, code lost:
        r6.f57444l = r0;
        r0 = r6.f57445m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0756, code lost:
        if (r0 != -1) goto L_0x075a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0758, code lost:
        r0 = r6.f57443k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x075a, code lost:
        r6.f57445m = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x075d, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x075e, code lost:
        r0 = r6.f57444l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0762, code lost:
        if (r0 == r1) goto L_0x0776;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0764, code lost:
        r3 = r6.f57445m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0766, code lost:
        if (r3 == r1) goto L_0x0776;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0768, code lost:
        r26 = ((float) (r6.f57443k * r0)) / ((float) (r6.f57442j * r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0776, code lost:
        r26 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x077a, code lost:
        if (r6.f57449q == false) goto L_0x0847;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0780, code lost:
        if (r6.f57455w == -1.0f) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0786, code lost:
        if (r6.f57456x == -1.0f) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x078c, code lost:
        if (r6.f57457y == -1.0f) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0792, code lost:
        if (r6.f57458z == -1.0f) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0798, code lost:
        if (r6.f57417A == -1.0f) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x079e, code lost:
        if (r6.f57418B == -1.0f) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x07a4, code lost:
        if (r6.f57419C == -1.0f) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x07aa, code lost:
        if (r6.f57420D == -1.0f) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x07b0, code lost:
        if (r6.f57421E == -1.0f) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x07b6, code lost:
        if (r6.f57422F != -1.0f) goto L_0x07ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x07ba, code lost:
        r0 = new byte[25];
        r1 = java.nio.ByteBuffer.wrap(r0);
        r1.put((byte) 0);
        r1.putShort((short) ((int) ((r6.f57455w * 50000.0f) + 0.5f)));
        r1.putShort((short) ((int) ((r6.f57456x * 50000.0f) + 0.5f)));
        r1.putShort((short) ((int) ((r6.f57457y * 50000.0f) + 0.5f)));
        r1.putShort((short) ((int) ((r6.f57458z * 50000.0f) + 0.5f)));
        r1.putShort((short) ((int) ((r6.f57417A * 50000.0f) + 0.5f)));
        r1.putShort((short) ((int) ((r6.f57418B * 50000.0f) + 0.5f)));
        r1.putShort((short) ((int) ((r6.f57419C * 50000.0f) + 0.5f)));
        r1.putShort((short) ((int) ((r6.f57420D * 50000.0f) + 0.5f)));
        r1.putShort((short) ((int) (r6.f57421E + 0.5f)));
        r1.putShort((short) ((int) (r6.f57422F + 0.5f)));
        r1.putShort((short) r6.f57453u);
        r1.putShort((short) r6.f57454v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0838, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0839, code lost:
        r29 = new com.google.android.exoplayer2.video.ColorInfo(r6.f57450r, r6.f57452t, r6.f57451s, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0847, code lost:
        r29 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0849, code lost:
        r0 = com.google.android.exoplayer2.Format.m16650m(java.lang.Integer.toString(r34), r5, (java.lang.String) null, -1, r20, r6.f57442j, r6.f57443k, -1.0f, r13, -1, r26, r6.f57447o, r6.f57448p, r29, r6.f57441i);
        r13 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0878, code lost:
        if (com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_SUBRIP.equals(r5) == false) goto L_0x0887;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x087a, code lost:
        r0 = com.google.android.exoplayer2.Format.m16647h(java.lang.Integer.toString(r34), r5, r0, r6.f57430N, r6.f57441i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x088b, code lost:
        if (com.tencent.thumbplayer.tmediacodec.util.MimeTypes.TEXT_SSA.equals(r5) == false) goto L_0x08bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x088d, code lost:
        r1 = new java.util.ArrayList(2);
        r1.add(p330d7.C20440d.f57360b0);
        r1.add(r6.f57440h);
        r0 = com.google.android.exoplayer2.Format.m16648i(java.lang.Integer.toString(r34), r5, (java.lang.String) null, -1, r0, r6.f57430N, -1, r6.f57441i, com.tencent.p014mm.sdk.platformtools.MAlarmHandler.NEXT_FIRE_INTERVAL, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x08c3, code lost:
        if (com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_VOBSUB.equals(r5) != false) goto L_0x08da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x08c9, code lost:
        if (com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_PGS.equals(r5) != false) goto L_0x08da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x08cf, code lost:
        if (com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_DVBSUBS.equals(r5) == false) goto L_0x08d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x08d9, code lost:
        throw new p396x6.C23015n("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x08da, code lost:
        r0 = com.google.android.exoplayer2.Format.m16643d(java.lang.Integer.toString(r34), r5, (java.lang.String) null, -1, r13, r6.f57430N, r6.f57441i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x08e9, code lost:
        r13 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x08ea, code lost:
        r1 = r32.mo17752o(r6.f57434b, r13);
        r6.f57431O = r1;
        r1.mo17741a(r0);
        r0 = r31;
        r1 = r0.f57392c;
        r2 = r0.f57409t;
        r1.put(r2.f57434b, r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x06da  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0903  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo31974a(p294b7.C16742f r39) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            d7.c r2 = r0.f57352d
            if (r2 == 0) goto L_0x000a
            r2 = 1
            goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            p333e8.C20528a.m22240d(r2)
        L_0x000e:
            java.util.Stack<d7.a$b> r2 = r0.f57350b
            boolean r2 = r2.isEmpty()
            r5 = 374648427(0x1654ae6b, float:1.718026E-25)
            r6 = 357149030(0x1549a966, float:4.072526E-26)
            r7 = 19899(0x4dbb, float:2.7884E-41)
            r8 = 174(0xae, float:2.44E-43)
            r9 = 160(0xa0, float:2.24E-43)
            r10 = -1
            r12 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            r15 = 0
            if (r2 != 0) goto L_0x092f
            r2 = r1
            b7.b r2 = (p294b7.C16738b) r2
            long r3 = r2.f45242c
            java.util.Stack<d7.a$b> r2 = r0.f57350b
            java.lang.Object r2 = r2.peek()
            d7.a$b r2 = (p330d7.C20435a.C20437b) r2
            long r13 = r2.f57357b
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x092f
            d7.c r1 = r0.f57352d
            java.util.Stack<d7.a$b> r2 = r0.f57350b
            java.lang.Object r2 = r2.pop()
            d7.a$b r2 = (p330d7.C20435a.C20437b) r2
            int r2 = r2.f57356a
            d7.d$b r1 = (p330d7.C20440d.C20442b) r1
            d7.d r1 = p330d7.C20440d.this
            if (r2 == r9) goto L_0x0909
            if (r2 == r8) goto L_0x017f
            if (r2 == r7) goto L_0x0166
            r3 = 25152(0x6240, float:3.5245E-41)
            if (r2 == r3) goto L_0x0139
            r3 = 28032(0x6d80, float:3.9281E-41)
            if (r2 == r3) goto L_0x0125
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == r6) goto L_0x010c
            if (r2 == r5) goto L_0x00f5
            if (r2 == r12) goto L_0x0069
            r1.getClass()
            goto L_0x090f
        L_0x0069:
            boolean r2 = r1.f57410u
            if (r2 != 0) goto L_0x090f
            b7.g r2 = r1.f57389Y
            long r5 = r1.f57405p
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x00e2
            long r5 = r1.f57408s
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x00e2
            e8.h r3 = r1.f57366B
            if (r3 == 0) goto L_0x00e2
            int r3 = r3.f57786a
            if (r3 == 0) goto L_0x00e2
            e8.h r4 = r1.f57367C
            if (r4 == 0) goto L_0x00e2
            int r4 = r4.f57786a
            if (r4 == r3) goto L_0x008c
            goto L_0x00e2
        L_0x008c:
            int[] r4 = new int[r3]
            long[] r5 = new long[r3]
            long[] r6 = new long[r3]
            long[] r7 = new long[r3]
            r8 = 0
        L_0x0095:
            if (r8 >= r3) goto L_0x00ad
            e8.h r9 = r1.f57366B
            long r9 = r9.mo32080a(r8)
            r7[r8] = r9
            long r9 = r1.f57405p
            e8.h r11 = r1.f57367C
            long r11 = r11.mo32080a(r8)
            long r9 = r9 + r11
            r5[r8] = r9
            int r8 = r8 + 1
            goto L_0x0095
        L_0x00ad:
            r8 = 0
        L_0x00ae:
            r9 = -1
            int r14 = r3 + -1
            if (r8 >= r14) goto L_0x00c6
            int r9 = r8 + 1
            r10 = r5[r9]
            r12 = r5[r8]
            long r10 = r10 - r12
            int r11 = (int) r10
            r4[r8] = r11
            r10 = r7[r9]
            r12 = r7[r8]
            long r10 = r10 - r12
            r6[r8] = r10
            r8 = r9
            goto L_0x00ae
        L_0x00c6:
            long r8 = r1.f57405p
            long r10 = r1.f57404o
            long r8 = r8 + r10
            r10 = r5[r14]
            long r8 = r8 - r10
            int r3 = (int) r8
            r4[r14] = r3
            long r8 = r1.f57408s
            r10 = r7[r14]
            long r8 = r8 - r10
            r6[r14] = r8
            r1.f57366B = r15
            r1.f57367C = r15
            b7.a r3 = new b7.a
            r3.<init>(r4, r5, r6, r7)
            goto L_0x00ed
        L_0x00e2:
            r1.f57366B = r15
            r1.f57367C = r15
            b7.l$a r3 = new b7.l$a
            long r4 = r1.f57408s
            r3.<init>(r4)
        L_0x00ed:
            r2.mo17750g(r3)
            r2 = 1
            r1.f57410u = r2
            goto L_0x090f
        L_0x00f5:
            android.util.SparseArray<d7.d$c> r2 = r1.f57392c
            int r2 = r2.size()
            if (r2 == 0) goto L_0x0104
            b7.g r1 = r1.f57389Y
            r1.mo17751i()
            goto L_0x090f
        L_0x0104:
            x6.n r1 = new x6.n
            java.lang.String r2 = "No valid tracks were found"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x010c:
            long r5 = r1.f57406q
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0117
            r5 = 1000000(0xf4240, double:4.940656E-318)
            r1.f57406q = r5
        L_0x0117:
            long r5 = r1.f57407r
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x090f
            long r2 = r1.mo31979i(r5)
            r1.f57408s = r2
            goto L_0x090f
        L_0x0125:
            d7.d$c r1 = r1.f57409t
            boolean r2 = r1.f57437e
            if (r2 == 0) goto L_0x090f
            byte[] r1 = r1.f57438f
            if (r1 != 0) goto L_0x0131
            goto L_0x090f
        L_0x0131:
            x6.n r1 = new x6.n
            java.lang.String r2 = "Combining encryption and compression is not supported"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0139:
            d7.d$c r1 = r1.f57409t
            boolean r2 = r1.f57437e
            if (r2 == 0) goto L_0x090f
            b7.m$a r2 = r1.f57439g
            if (r2 == 0) goto L_0x015e
            com.google.android.exoplayer2.drm.DrmInitData r3 = new com.google.android.exoplayer2.drm.DrmInitData
            r4 = 1
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r5 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r4]
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r6 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.util.UUID r7 = p396x6.C22994b.f66071b
            byte[] r2 = r2.f45267b
            java.lang.String r8 = "video/webm"
            r6.<init>(r7, r15, r8, r2)
            r2 = 0
            r5[r2] = r6
            r3.<init>(r4, r5)
            r1.f57441i = r3
            goto L_0x090f
        L_0x015e:
            x6.n r1 = new x6.n
            java.lang.String r2 = "Encrypted Track found but ContentEncKeyID was not found"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0166:
            int r2 = r1.f57411v
            r3 = -1
            if (r2 == r3) goto L_0x0177
            long r3 = r1.f57412w
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0177
            if (r2 != r12) goto L_0x090f
            r1.f57414y = r3
            goto L_0x090f
        L_0x0177:
            x6.n r1 = new x6.n
            java.lang.String r2 = "Mandatory element SeekID or SeekPosition not found"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x017f:
            d7.d$c r2 = r1.f57409t
            java.lang.String r2 = r2.f57433a
            java.lang.String r3 = "V_VP8"
            boolean r4 = r3.equals(r2)
            java.lang.String r5 = "A_MPEG/L2"
            java.lang.String r6 = "A_AAC"
            java.lang.String r7 = "A_VORBIS"
            java.lang.String r8 = "A_OPUS"
            java.lang.String r9 = "V_THEORA"
            java.lang.String r10 = "V_MS/VFW/FOURCC"
            java.lang.String r11 = "V_MPEGH/ISO/HEVC"
            java.lang.String r12 = "V_MPEG4/ISO/AVC"
            java.lang.String r13 = "V_MPEG4/ISO/AP"
            java.lang.String r14 = "V_MPEG4/ISO/ASP"
            java.lang.String r15 = "V_MPEG4/ISO/SP"
            java.lang.String r0 = "V_MPEG2"
            r39 = r3
            java.lang.String r3 = "V_VP9"
            r16 = r1
            java.lang.String r1 = "A_EAC3"
            r17 = r1
            java.lang.String r1 = "S_TEXT/UTF8"
            r18 = r1
            java.lang.String r1 = "S_TEXT/ASS"
            r19 = r1
            java.lang.String r1 = "A_PCM/INT/LIT"
            r20 = r1
            java.lang.String r1 = "A_DTS/EXPRESS"
            r21 = r1
            java.lang.String r1 = "S_HDMV/PGS"
            r22 = r1
            java.lang.String r1 = "A_DTS"
            r23 = r1
            java.lang.String r1 = "A_AC3"
            r24 = r1
            java.lang.String r1 = "A_DTS/LOSSLESS"
            r25 = r1
            java.lang.String r1 = "S_VOBSUB"
            r26 = r1
            java.lang.String r1 = "S_DVBSUB"
            r27 = r1
            java.lang.String r1 = "A_MPEG/L3"
            r28 = r1
            java.lang.String r1 = "A_TRUEHD"
            r29 = r1
            java.lang.String r1 = "A_MS/ACM"
            r30 = r1
            java.lang.String r1 = "A_FLAC"
            if (r4 != 0) goto L_0x030e
            boolean r4 = r3.equals(r2)
            if (r4 != 0) goto L_0x030e
            boolean r4 = r0.equals(r2)
            if (r4 != 0) goto L_0x030e
            boolean r4 = r15.equals(r2)
            if (r4 != 0) goto L_0x030e
            boolean r4 = r14.equals(r2)
            if (r4 != 0) goto L_0x030e
            boolean r4 = r13.equals(r2)
            if (r4 != 0) goto L_0x030e
            boolean r4 = r12.equals(r2)
            if (r4 != 0) goto L_0x030e
            boolean r4 = r11.equals(r2)
            if (r4 != 0) goto L_0x030e
            boolean r4 = r10.equals(r2)
            if (r4 != 0) goto L_0x030e
            boolean r4 = r9.equals(r2)
            if (r4 != 0) goto L_0x030e
            boolean r4 = r8.equals(r2)
            if (r4 != 0) goto L_0x030e
            boolean r4 = r7.equals(r2)
            if (r4 != 0) goto L_0x030e
            boolean r4 = r6.equals(r2)
            if (r4 != 0) goto L_0x030e
            boolean r4 = r5.equals(r2)
            if (r4 != 0) goto L_0x030e
            r4 = r28
            boolean r28 = r4.equals(r2)
            if (r28 != 0) goto L_0x02e5
            r28 = r13
            r13 = r24
            boolean r24 = r13.equals(r2)
            if (r24 != 0) goto L_0x02e9
            r24 = r15
            r15 = r17
            boolean r17 = r15.equals(r2)
            if (r17 != 0) goto L_0x02ed
            r17 = r7
            r7 = r29
            boolean r29 = r7.equals(r2)
            if (r29 != 0) goto L_0x02e2
            r29 = r7
            r7 = r23
            boolean r23 = r7.equals(r2)
            if (r23 != 0) goto L_0x02f1
            r23 = r5
            r5 = r21
            boolean r21 = r5.equals(r2)
            if (r21 != 0) goto L_0x02f5
            r21 = r4
            r4 = r25
            boolean r25 = r4.equals(r2)
            if (r25 != 0) goto L_0x02cc
            boolean r25 = r1.equals(r2)
            if (r25 != 0) goto L_0x02cc
            r25 = r10
            r10 = r30
            boolean r30 = r10.equals(r2)
            if (r30 != 0) goto L_0x02c9
            r30 = r10
            r10 = r20
            boolean r20 = r10.equals(r2)
            if (r20 != 0) goto L_0x02d0
            r20 = r14
            r14 = r18
            boolean r18 = r14.equals(r2)
            if (r18 != 0) goto L_0x02d4
            r18 = r12
            r12 = r19
            boolean r19 = r12.equals(r2)
            if (r19 != 0) goto L_0x02d8
            r19 = r4
            r4 = r26
            boolean r26 = r4.equals(r2)
            if (r26 != 0) goto L_0x02c6
            r26 = r4
            r4 = r22
            boolean r22 = r4.equals(r2)
            if (r22 != 0) goto L_0x02dc
            r22 = r6
            r6 = r27
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x02c3
            goto L_0x0338
        L_0x02c3:
            r2 = 0
            goto L_0x0339
        L_0x02c6:
            r26 = r4
            goto L_0x02da
        L_0x02c9:
            r30 = r10
            goto L_0x02ce
        L_0x02cc:
            r25 = r10
        L_0x02ce:
            r10 = r20
        L_0x02d0:
            r20 = r14
            r14 = r18
        L_0x02d4:
            r18 = r12
            r12 = r19
        L_0x02d8:
            r19 = r4
        L_0x02da:
            r4 = r22
        L_0x02dc:
            r22 = r6
            r6 = r27
            goto L_0x0338
        L_0x02e2:
            r29 = r7
            goto L_0x02ef
        L_0x02e5:
            r28 = r13
            r13 = r24
        L_0x02e9:
            r24 = r15
            r15 = r17
        L_0x02ed:
            r17 = r7
        L_0x02ef:
            r7 = r23
        L_0x02f1:
            r23 = r5
            r5 = r21
        L_0x02f5:
            r21 = r4
            r4 = r22
            r22 = r6
            r6 = r27
            r36 = r25
            r25 = r10
            r10 = r20
            r20 = r14
            r14 = r18
            r18 = r12
            r12 = r19
            r19 = r36
            goto L_0x0338
        L_0x030e:
            r4 = r22
            r22 = r6
            r6 = r27
            r36 = r23
            r23 = r5
            r5 = r21
            r21 = r28
            r28 = r13
            r13 = r24
            r24 = r15
            r15 = r17
            r17 = r7
            r7 = r36
            r37 = r25
            r25 = r10
            r10 = r20
            r20 = r14
            r14 = r18
            r18 = r12
            r12 = r19
            r19 = r37
        L_0x0338:
            r2 = 1
        L_0x0339:
            if (r2 == 0) goto L_0x0903
            r27 = r6
            r2 = r16
            d7.d$c r6 = r2.f57409t
            r16 = r13
            b7.g r13 = r2.f57389Y
            r31 = r2
            int r2 = r6.f57434b
            r32 = r13
            java.lang.String r13 = r6.f57433a
            r13.getClass()
            int r33 = r13.hashCode()
            r34 = r2
            r35 = 20
            r2 = 15
            switch(r33) {
                case -2095576542: goto L_0x04b8;
                case -2095575984: goto L_0x04ad;
                case -1985379776: goto L_0x04a2;
                case -1784763192: goto L_0x0497;
                case -1730367663: goto L_0x048c;
                case -1482641358: goto L_0x0481;
                case -1482641357: goto L_0x0476;
                case -1373388978: goto L_0x046b;
                case -933872740: goto L_0x045d;
                case -538363189: goto L_0x044f;
                case -538363109: goto L_0x0441;
                case -425012669: goto L_0x0433;
                case -356037306: goto L_0x0425;
                case 62923557: goto L_0x0417;
                case 62923603: goto L_0x0409;
                case 62927045: goto L_0x03fd;
                case 82338133: goto L_0x03ef;
                case 82338134: goto L_0x03e3;
                case 99146302: goto L_0x03d7;
                case 444813526: goto L_0x03cb;
                case 542569478: goto L_0x03bf;
                case 725957860: goto L_0x03b3;
                case 738597099: goto L_0x03a7;
                case 855502857: goto L_0x039b;
                case 1422270023: goto L_0x038f;
                case 1809237540: goto L_0x0383;
                case 1950749482: goto L_0x0377;
                case 1950789798: goto L_0x036b;
                case 1951062397: goto L_0x035f;
                default: goto L_0x035d;
            }
        L_0x035d:
            goto L_0x04c3
        L_0x035f:
            boolean r0 = r13.equals(r8)
            if (r0 != 0) goto L_0x0367
            goto L_0x04c3
        L_0x0367:
            r0 = 28
            goto L_0x04c4
        L_0x036b:
            boolean r0 = r13.equals(r1)
            if (r0 != 0) goto L_0x0373
            goto L_0x04c3
        L_0x0373:
            r0 = 27
            goto L_0x04c4
        L_0x0377:
            boolean r0 = r13.equals(r15)
            if (r0 != 0) goto L_0x037f
            goto L_0x04c3
        L_0x037f:
            r0 = 26
            goto L_0x04c4
        L_0x0383:
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x038b
            goto L_0x04c3
        L_0x038b:
            r0 = 25
            goto L_0x04c4
        L_0x038f:
            boolean r0 = r13.equals(r14)
            if (r0 != 0) goto L_0x0397
            goto L_0x04c3
        L_0x0397:
            r0 = 24
            goto L_0x04c4
        L_0x039b:
            boolean r0 = r13.equals(r11)
            if (r0 != 0) goto L_0x03a3
            goto L_0x04c3
        L_0x03a3:
            r0 = 23
            goto L_0x04c4
        L_0x03a7:
            boolean r0 = r13.equals(r12)
            if (r0 != 0) goto L_0x03af
            goto L_0x04c3
        L_0x03af:
            r0 = 22
            goto L_0x04c4
        L_0x03b3:
            boolean r0 = r13.equals(r10)
            if (r0 != 0) goto L_0x03bb
            goto L_0x04c3
        L_0x03bb:
            r0 = 21
            goto L_0x04c4
        L_0x03bf:
            boolean r0 = r13.equals(r5)
            if (r0 != 0) goto L_0x03c7
            goto L_0x04c3
        L_0x03c7:
            r0 = 20
            goto L_0x04c4
        L_0x03cb:
            boolean r0 = r13.equals(r9)
            if (r0 != 0) goto L_0x03d3
            goto L_0x04c3
        L_0x03d3:
            r0 = 19
            goto L_0x04c4
        L_0x03d7:
            boolean r0 = r13.equals(r4)
            if (r0 != 0) goto L_0x03df
            goto L_0x04c3
        L_0x03df:
            r0 = 18
            goto L_0x04c4
        L_0x03e3:
            boolean r0 = r13.equals(r3)
            if (r0 != 0) goto L_0x03eb
            goto L_0x04c3
        L_0x03eb:
            r0 = 17
            goto L_0x04c4
        L_0x03ef:
            r0 = r39
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x03f9
            goto L_0x04c3
        L_0x03f9:
            r0 = 16
            goto L_0x04c4
        L_0x03fd:
            boolean r0 = r13.equals(r7)
            if (r0 != 0) goto L_0x0405
            goto L_0x04c3
        L_0x0405:
            r0 = 15
            goto L_0x04c4
        L_0x0409:
            r0 = r16
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0413
            goto L_0x04c3
        L_0x0413:
            r0 = 14
            goto L_0x04c4
        L_0x0417:
            r0 = r22
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0421
            goto L_0x04c3
        L_0x0421:
            r0 = 13
            goto L_0x04c4
        L_0x0425:
            r0 = r19
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x042f
            goto L_0x04c3
        L_0x042f:
            r0 = 12
            goto L_0x04c4
        L_0x0433:
            r0 = r26
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x043d
            goto L_0x04c3
        L_0x043d:
            r0 = 11
            goto L_0x04c4
        L_0x0441:
            r0 = r18
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x044b
            goto L_0x04c3
        L_0x044b:
            r0 = 10
            goto L_0x04c4
        L_0x044f:
            r0 = r20
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0459
            goto L_0x04c3
        L_0x0459:
            r0 = 9
            goto L_0x04c4
        L_0x045d:
            r0 = r27
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0467
            goto L_0x04c3
        L_0x0467:
            r0 = 8
            goto L_0x04c4
        L_0x046b:
            r0 = r25
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0474
            goto L_0x04c3
        L_0x0474:
            r0 = 7
            goto L_0x04c4
        L_0x0476:
            r0 = r21
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x047f
            goto L_0x04c3
        L_0x047f:
            r0 = 6
            goto L_0x04c4
        L_0x0481:
            r0 = r23
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x048a
            goto L_0x04c3
        L_0x048a:
            r0 = 5
            goto L_0x04c4
        L_0x048c:
            r0 = r17
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0495
            goto L_0x04c3
        L_0x0495:
            r0 = 4
            goto L_0x04c4
        L_0x0497:
            r0 = r29
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x04a0
            goto L_0x04c3
        L_0x04a0:
            r0 = 3
            goto L_0x04c4
        L_0x04a2:
            r0 = r30
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x04ab
            goto L_0x04c3
        L_0x04ab:
            r0 = 2
            goto L_0x04c4
        L_0x04ad:
            r0 = r24
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x04b6
            goto L_0x04c3
        L_0x04b6:
            r0 = 1
            goto L_0x04c4
        L_0x04b8:
            r0 = r28
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x04c1
            goto L_0x04c3
        L_0x04c1:
            r0 = 0
            goto L_0x04c4
        L_0x04c3:
            r0 = -1
        L_0x04c4:
            java.lang.String r1 = "application/vobsub"
            java.lang.String r3 = "text/x-ssa"
            java.lang.String r4 = "application/x-subrip"
            java.lang.String r5 = "video/x-unknown"
            java.lang.String r7 = "application/pgs"
            java.lang.String r8 = "application/dvbsubs"
            switch(r0) {
                case 0: goto L_0x06f4;
                case 1: goto L_0x06f4;
                case 2: goto L_0x06a2;
                case 3: goto L_0x069f;
                case 4: goto L_0x0623;
                case 5: goto L_0x061a;
                case 6: goto L_0x0617;
                case 7: goto L_0x05b9;
                case 8: goto L_0x0599;
                case 9: goto L_0x06f4;
                case 10: goto L_0x0581;
                case 11: goto L_0x0578;
                case 12: goto L_0x0573;
                case 13: goto L_0x0568;
                case 14: goto L_0x0565;
                case 15: goto L_0x0562;
                case 16: goto L_0x055e;
                case 17: goto L_0x055a;
                case 18: goto L_0x0557;
                case 19: goto L_0x06ea;
                case 20: goto L_0x0562;
                case 21: goto L_0x054d;
                case 22: goto L_0x054a;
                case 23: goto L_0x0535;
                case 24: goto L_0x0532;
                case 25: goto L_0x052e;
                case 26: goto L_0x052b;
                case 27: goto L_0x0522;
                case 28: goto L_0x04dd;
                default: goto L_0x04d5;
            }
        L_0x04d5:
            x6.n r0 = new x6.n
            java.lang.String r1 = "Unrecognized codec identifier."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04dd:
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 3
            r0.<init>(r2)
            byte[] r2 = r6.f57440h
            r0.add(r2)
            r2 = 8
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r5 = r5.order(r9)
            long r9 = r6.f57426J
            java.nio.ByteBuffer r5 = r5.putLong(r9)
            byte[] r5 = r5.array()
            r0.add(r5)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r5)
            long r9 = r6.f57427K
            java.nio.ByteBuffer r2 = r2.putLong(r9)
            byte[] r2 = r2.array()
            r0.add(r2)
            r2 = 5760(0x1680, float:8.071E-42)
            java.lang.String r5 = "audio/opus"
            goto L_0x067a
        L_0x0522:
            byte[] r0 = r6.f57440h
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.lang.String r2 = "audio/flac"
            goto L_0x0570
        L_0x052b:
            java.lang.String r0 = "audio/eac3"
            goto L_0x0575
        L_0x052e:
            java.lang.String r0 = "video/mpeg2"
            goto L_0x0575
        L_0x0532:
            r5 = r4
            goto L_0x06ea
        L_0x0535:
            e8.m r0 = new e8.m
            byte[] r2 = r6.f57440h
            r0.<init>((byte[]) r2)
            f8.b r0 = p337f8.C20680b.m22614a(r0)
            java.util.List<byte[]> r2 = r0.f58432a
            int r0 = r0.f58433b
            r6.f57432P = r0
            java.lang.String r0 = "video/hevc"
            goto L_0x0595
        L_0x054a:
            r5 = r3
            goto L_0x06ea
        L_0x054d:
            int r0 = r6.f57424H
            int r0 = p333e8.C20551y.m22317g(r0)
            if (r0 != 0) goto L_0x06e3
            goto L_0x06e8
        L_0x0557:
            r5 = r7
            goto L_0x06ea
        L_0x055a:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            goto L_0x0575
        L_0x055e:
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            goto L_0x0575
        L_0x0562:
            java.lang.String r0 = "audio/vnd.dts"
            goto L_0x0575
        L_0x0565:
            java.lang.String r0 = "audio/ac3"
            goto L_0x0575
        L_0x0568:
            byte[] r0 = r6.f57440h
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.lang.String r2 = "audio/mp4a-latm"
        L_0x0570:
            r5 = r2
            goto L_0x0703
        L_0x0573:
            java.lang.String r0 = "audio/vnd.dts.hd"
        L_0x0575:
            r5 = r0
            goto L_0x06ea
        L_0x0578:
            byte[] r0 = r6.f57440h
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r5 = r1
            goto L_0x0703
        L_0x0581:
            e8.m r0 = new e8.m
            byte[] r2 = r6.f57440h
            r0.<init>((byte[]) r2)
            f8.a r0 = p337f8.C20679a.m22613a(r0)
            java.util.List<byte[]> r2 = r0.f58427a
            int r0 = r0.f58428b
            r6.f57432P = r0
            java.lang.String r0 = "video/avc"
        L_0x0595:
            r5 = r0
            r0 = r2
            goto L_0x0703
        L_0x0599:
            r0 = 4
            byte[] r0 = new byte[r0]
            byte[] r2 = r6.f57440h
            r5 = 0
            byte r9 = r2[r5]
            r0[r5] = r9
            r5 = 1
            byte r9 = r2[r5]
            r0[r5] = r9
            r5 = 2
            byte r9 = r2[r5]
            r0[r5] = r9
            r5 = 3
            byte r2 = r2[r5]
            r0[r5] = r2
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r5 = r8
            goto L_0x0703
        L_0x05b9:
            e8.m r0 = new e8.m
            byte[] r9 = r6.f57440h
            r0.<init>((byte[]) r9)
            r9 = 16
            r0.mo32114y(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x060f }
            long r9 = r0.mo32095f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x060f }
            r11 = 826496599(0x31435657, double:4.08343576E-315)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x05d2
            r0 = 0
            goto L_0x05fd
        L_0x05d2:
            int r9 = r0.f57810b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x060f }
            int r9 = r9 + 20
            byte[] r0 = r0.f57809a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x060f }
        L_0x05d8:
            int r10 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x060f }
            int r10 = r10 + -4
            if (r9 >= r10) goto L_0x0607
            byte r10 = r0[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x060f }
            if (r10 != 0) goto L_0x0604
            int r10 = r9 + 1
            byte r10 = r0[r10]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x060f }
            if (r10 != 0) goto L_0x0604
            int r10 = r9 + 2
            byte r10 = r0[r10]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x060f }
            r11 = 1
            if (r10 != r11) goto L_0x0604
            int r10 = r9 + 3
            byte r10 = r0[r10]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x060f }
            if (r10 != r2) goto L_0x0604
            int r2 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x060f }
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r9, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x060f }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x060f }
        L_0x05fd:
            if (r0 == 0) goto L_0x0703
            java.lang.String r5 = "video/wvc1"
            goto L_0x0703
        L_0x0604:
            int r9 = r9 + 1
            goto L_0x05d8
        L_0x0607:
            x6.n r0 = new x6.n     // Catch:{ ArrayIndexOutOfBoundsException -> 0x060f }
            java.lang.String r1 = "Failed to find FourCC VC1 initialization data"
            r0.<init>((java.lang.String) r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x060f }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x060f }
        L_0x060f:
            x6.n r0 = new x6.n
            java.lang.String r1 = "Error parsing FourCC VC1 codec private"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0617:
            java.lang.String r0 = "audio/mpeg"
            goto L_0x061c
        L_0x061a:
            java.lang.String r0 = "audio/mpeg-L2"
        L_0x061c:
            r5 = r0
            r0 = 4096(0x1000, float:5.74E-42)
            r0 = 0
            r2 = 4096(0x1000, float:5.74E-42)
            goto L_0x067a
        L_0x0623:
            byte[] r0 = r6.f57440h
            java.lang.String r2 = "Error parsing vorbis codec private"
            r5 = 0
            byte r9 = r0[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            r5 = 2
            if (r9 != r5) goto L_0x0693
            r5 = 0
            r9 = 1
        L_0x062f:
            byte r10 = r0[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            r11 = -1
            if (r10 != r11) goto L_0x0639
            int r5 = r5 + 255
            int r9 = r9 + 1
            goto L_0x062f
        L_0x0639:
            r11 = 1
            int r9 = r9 + r11
            int r5 = r5 + r10
            r10 = 0
        L_0x063d:
            byte r11 = r0[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            r12 = -1
            if (r11 != r12) goto L_0x0647
            int r10 = r10 + 255
            int r9 = r9 + 1
            goto L_0x063d
        L_0x0647:
            r12 = 1
            int r9 = r9 + r12
            int r10 = r10 + r11
            byte r11 = r0[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            if (r11 != r12) goto L_0x068d
            byte[] r11 = new byte[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            r12 = 0
            java.lang.System.arraycopy(r0, r9, r11, r12, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            int r9 = r9 + r5
            byte r5 = r0[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            r12 = 3
            if (r5 != r12) goto L_0x0687
            int r9 = r9 + r10
            byte r5 = r0[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            r10 = 5
            if (r5 != r10) goto L_0x0681
            int r5 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            int r5 = r5 - r9
            byte[] r5 = new byte[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            int r10 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            int r10 = r10 - r9
            r12 = 0
            java.lang.System.arraycopy(r0, r9, r5, r12, r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            r9 = 2
            r0.<init>(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            r0.add(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            r0.add(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            r2 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r5 = "audio/vorbis"
        L_0x067a:
            r13 = r0
            r20 = r2
            r23 = -1
            goto L_0x070a
        L_0x0681:
            x6.n r0 = new x6.n     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            r0.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
        L_0x0687:
            x6.n r0 = new x6.n     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            r0.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
        L_0x068d:
            x6.n r0 = new x6.n     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            r0.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
        L_0x0693:
            x6.n r0 = new x6.n     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            r0.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0699 }
        L_0x0699:
            x6.n r0 = new x6.n
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x069f:
            java.lang.String r5 = "audio/true-hd"
            goto L_0x06ea
        L_0x06a2:
            e8.m r0 = new e8.m
            byte[] r2 = r6.f57440h
            r0.<init>((byte[]) r2)
            int r2 = r0.mo32097h()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ec }
            r5 = 1
            if (r2 != r5) goto L_0x06b1
            goto L_0x06d5
        L_0x06b1:
            r5 = 65534(0xfffe, float:9.1833E-41)
            if (r2 != r5) goto L_0x06d7
            r2 = 24
            r0.mo32113x(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ec }
            long r9 = r0.mo32098i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ec }
            java.util.UUID r2 = p330d7.C20440d.f57364f0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ec }
            long r11 = r2.getMostSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ec }
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x06d7
            long r9 = r0.mo32098i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ec }
            long r11 = r2.getLeastSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ec }
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x06d7
        L_0x06d5:
            r0 = 1
            goto L_0x06d8
        L_0x06d7:
            r0 = 0
        L_0x06d8:
            if (r0 == 0) goto L_0x06e8
            int r0 = r6.f57424H
            int r0 = p333e8.C20551y.m22317g(r0)
            if (r0 != 0) goto L_0x06e3
            goto L_0x06e8
        L_0x06e3:
            java.lang.String r2 = "audio/raw"
            r5 = r2
            r2 = 0
            goto L_0x0705
        L_0x06e8:
            java.lang.String r5 = "audio/x-unknown"
        L_0x06ea:
            r0 = 0
            goto L_0x0703
        L_0x06ec:
            x6.n r0 = new x6.n
            java.lang.String r1 = "Error parsing MS/ACM codec private"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x06f4:
            byte[] r0 = r6.f57440h
            if (r0 != 0) goto L_0x06fa
            r0 = 0
            goto L_0x06fe
        L_0x06fa:
            java.util.List r0 = java.util.Collections.singletonList(r0)
        L_0x06fe:
            java.lang.String r2 = "video/mp4v-es"
            goto L_0x0570
        L_0x0703:
            r2 = r0
            r0 = -1
        L_0x0705:
            r23 = r0
            r13 = r2
            r20 = -1
        L_0x070a:
            boolean r0 = r6.f57429M
            r2 = 0
            r0 = r0 | r2
            boolean r2 = r6.f57428L
            if (r2 == 0) goto L_0x0714
            r2 = 2
            goto L_0x0715
        L_0x0714:
            r2 = 0
        L_0x0715:
            r0 = r0 | r2
            boolean r2 = p333e8.C20536j.m22252d(r5)
            if (r2 == 0) goto L_0x0741
            java.lang.String r16 = java.lang.Integer.toString(r34)
            r18 = 0
            r19 = -1
            int r1 = r6.f57423G
            int r2 = r6.f57425I
            com.google.android.exoplayer2.drm.DrmInitData r3 = r6.f57441i
            java.lang.String r4 = r6.f57430N
            r17 = r5
            r21 = r1
            r22 = r2
            r24 = r13
            r25 = r3
            r26 = r0
            r27 = r4
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.m16641b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r13 = 1
            goto L_0x08ea
        L_0x0741:
            boolean r2 = p333e8.C20536j.m22253e(r5)
            if (r2 == 0) goto L_0x0874
            int r0 = r6.f57446n
            if (r0 != 0) goto L_0x075d
            int r0 = r6.f57444l
            r1 = -1
            if (r0 != r1) goto L_0x0752
            int r0 = r6.f57442j
        L_0x0752:
            r6.f57444l = r0
            int r0 = r6.f57445m
            if (r0 != r1) goto L_0x075a
            int r0 = r6.f57443k
        L_0x075a:
            r6.f57445m = r0
            goto L_0x075e
        L_0x075d:
            r1 = -1
        L_0x075e:
            int r0 = r6.f57444l
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == r1) goto L_0x0776
            int r3 = r6.f57445m
            if (r3 == r1) goto L_0x0776
            int r1 = r6.f57443k
            int r1 = r1 * r0
            float r0 = (float) r1
            int r1 = r6.f57442j
            int r1 = r1 * r3
            float r1 = (float) r1
            float r0 = r0 / r1
            r26 = r0
            goto L_0x0778
        L_0x0776:
            r26 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0778:
            boolean r0 = r6.f57449q
            if (r0 == 0) goto L_0x0847
            float r0 = r6.f57455w
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0838
            float r0 = r6.f57456x
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0838
            float r0 = r6.f57457y
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0838
            float r0 = r6.f57458z
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0838
            float r0 = r6.f57417A
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0838
            float r0 = r6.f57418B
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0838
            float r0 = r6.f57419C
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0838
            float r0 = r6.f57420D
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0838
            float r0 = r6.f57421E
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0838
            float r0 = r6.f57422F
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x07ba
            goto L_0x0838
        L_0x07ba:
            r0 = 25
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
            r2 = 0
            r1.put(r2)
            float r2 = r6.f57455w
            r3 = 1195593728(0x47435000, float:50000.0)
            float r2 = r2 * r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r4
            int r2 = (int) r2
            short r2 = (short) r2
            r1.putShort(r2)
            float r2 = r6.f57456x
            float r2 = r2 * r3
            float r2 = r2 + r4
            int r2 = (int) r2
            short r2 = (short) r2
            r1.putShort(r2)
            float r2 = r6.f57457y
            float r2 = r2 * r3
            float r2 = r2 + r4
            int r2 = (int) r2
            short r2 = (short) r2
            r1.putShort(r2)
            float r2 = r6.f57458z
            float r2 = r2 * r3
            float r2 = r2 + r4
            int r2 = (int) r2
            short r2 = (short) r2
            r1.putShort(r2)
            float r2 = r6.f57417A
            float r2 = r2 * r3
            float r2 = r2 + r4
            int r2 = (int) r2
            short r2 = (short) r2
            r1.putShort(r2)
            float r2 = r6.f57418B
            float r2 = r2 * r3
            float r2 = r2 + r4
            int r2 = (int) r2
            short r2 = (short) r2
            r1.putShort(r2)
            float r2 = r6.f57419C
            float r2 = r2 * r3
            float r2 = r2 + r4
            int r2 = (int) r2
            short r2 = (short) r2
            r1.putShort(r2)
            float r2 = r6.f57420D
            float r2 = r2 * r3
            float r2 = r2 + r4
            int r2 = (int) r2
            short r2 = (short) r2
            r1.putShort(r2)
            float r2 = r6.f57421E
            float r2 = r2 + r4
            int r2 = (int) r2
            short r2 = (short) r2
            r1.putShort(r2)
            float r2 = r6.f57422F
            float r2 = r2 + r4
            int r2 = (int) r2
            short r2 = (short) r2
            r1.putShort(r2)
            int r2 = r6.f57453u
            short r2 = (short) r2
            r1.putShort(r2)
            int r2 = r6.f57454v
            short r2 = (short) r2
            r1.putShort(r2)
            goto L_0x0839
        L_0x0838:
            r0 = 0
        L_0x0839:
            com.google.android.exoplayer2.video.ColorInfo r1 = new com.google.android.exoplayer2.video.ColorInfo
            int r2 = r6.f57450r
            int r3 = r6.f57452t
            int r4 = r6.f57451s
            r1.<init>(r2, r3, r4, r0)
            r29 = r1
            goto L_0x0849
        L_0x0847:
            r29 = 0
        L_0x0849:
            java.lang.String r16 = java.lang.Integer.toString(r34)
            r18 = 0
            r19 = -1
            int r0 = r6.f57442j
            int r1 = r6.f57443k
            r23 = -1082130432(0xffffffffbf800000, float:-1.0)
            r25 = -1
            byte[] r2 = r6.f57447o
            int r3 = r6.f57448p
            com.google.android.exoplayer2.drm.DrmInitData r4 = r6.f57441i
            r17 = r5
            r21 = r0
            r22 = r1
            r24 = r13
            r27 = r2
            r28 = r3
            r30 = r4
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.m16650m(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = 2
            goto L_0x08ea
        L_0x0874:
            boolean r2 = r4.equals(r5)
            if (r2 == 0) goto L_0x0887
            java.lang.String r1 = java.lang.Integer.toString(r34)
            java.lang.String r2 = r6.f57430N
            com.google.android.exoplayer2.drm.DrmInitData r3 = r6.f57441i
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.m16647h(r1, r5, r0, r2, r3)
            goto L_0x08e9
        L_0x0887:
            boolean r2 = r3.equals(r5)
            if (r2 == 0) goto L_0x08bf
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 2
            r1.<init>(r2)
            byte[] r2 = p330d7.C20440d.f57360b0
            r1.add(r2)
            byte[] r2 = r6.f57440h
            r1.add(r2)
            java.lang.String r16 = java.lang.Integer.toString(r34)
            r18 = 0
            r19 = -1
            java.lang.String r2 = r6.f57430N
            r22 = -1
            com.google.android.exoplayer2.drm.DrmInitData r3 = r6.f57441i
            r24 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r17 = r5
            r20 = r0
            r21 = r2
            r23 = r3
            r26 = r1
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.m16648i(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26)
            goto L_0x08e9
        L_0x08bf:
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L_0x08da
            boolean r0 = r7.equals(r5)
            if (r0 != 0) goto L_0x08da
            boolean r0 = r8.equals(r5)
            if (r0 == 0) goto L_0x08d2
            goto L_0x08da
        L_0x08d2:
            x6.n r0 = new x6.n
            java.lang.String r1 = "Unexpected MIME type."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x08da:
            java.lang.String r9 = java.lang.Integer.toString(r34)
            r11 = 0
            r12 = -1
            java.lang.String r14 = r6.f57430N
            com.google.android.exoplayer2.drm.DrmInitData r15 = r6.f57441i
            r10 = r5
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.m16643d(r9, r10, r11, r12, r13, r14, r15)
        L_0x08e9:
            r13 = 3
        L_0x08ea:
            int r1 = r6.f57434b
            r2 = r32
            b7.m r1 = r2.mo17752o(r1, r13)
            r6.f57431O = r1
            r1.mo17741a(r0)
            r0 = r31
            android.util.SparseArray<d7.d$c> r1 = r0.f57392c
            d7.d$c r2 = r0.f57409t
            int r3 = r2.f57434b
            r1.put(r3, r2)
            goto L_0x0905
        L_0x0903:
            r0 = r16
        L_0x0905:
            r1 = 0
            r0.f57409t = r1
            goto L_0x090f
        L_0x0909:
            r0 = r1
            int r1 = r0.f57369E
            r2 = 2
            if (r1 == r2) goto L_0x0911
        L_0x090f:
            r0 = 1
            goto L_0x092e
        L_0x0911:
            boolean r1 = r0.f57388X
            if (r1 != 0) goto L_0x091b
            int r1 = r0.f57377M
            r2 = 1
            r1 = r1 | r2
            r0.f57377M = r1
        L_0x091b:
            android.util.SparseArray<d7.d$c> r1 = r0.f57392c
            int r2 = r0.f57375K
            java.lang.Object r1 = r1.get(r2)
            d7.d$c r1 = (p330d7.C20440d.C20443c) r1
            long r2 = r0.f57370F
            r0.mo31975d(r1, r2)
            r2 = 0
            r0.f57369E = r2
            goto L_0x090f
        L_0x092e:
            return r0
        L_0x092f:
            r0 = 1
            r2 = 0
            r3 = r38
            int r4 = r3.f57353e
            r13 = 524531317(0x1f43b675, float:4.144378E-20)
            r14 = 0
            if (r4 != 0) goto L_0x09b4
            d7.f r4 = r3.f57351c
            r7 = 4
            long r17 = r4.mo31986b(r1, r0, r2, r7)
            r19 = -2
            int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x09a4
            r0 = r1
            b7.b r0 = (p294b7.C16738b) r0
            r0.f45244e = r2
        L_0x094e:
            byte[] r4 = r3.f57349a
            r0.mo17734b(r4, r2, r7, r2)
            byte[] r4 = r3.f57349a
            byte r4 = r4[r2]
            r2 = 0
        L_0x0958:
            long[] r7 = p330d7.C20445f.f57461d
            r8 = 8
            if (r2 >= r8) goto L_0x096d
            r17 = r7[r2]
            long r7 = (long) r4
            long r7 = r17 & r7
            int r17 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            int r2 = r2 + 1
            if (r17 == 0) goto L_0x096a
            goto L_0x096e
        L_0x096a:
            r8 = 174(0xae, float:2.44E-43)
            goto L_0x0958
        L_0x096d:
            r2 = -1
        L_0x096e:
            r4 = -1
            if (r2 == r4) goto L_0x0999
            r4 = 4
            if (r2 > r4) goto L_0x0999
            byte[] r4 = r3.f57349a
            r7 = 0
            long r14 = p330d7.C20445f.m22038a(r4, r2, r7)
            int r4 = (int) r14
            d7.c r7 = r3.f57352d
            d7.d$b r7 = (p330d7.C20440d.C20442b) r7
            d7.d r7 = p330d7.C20440d.this
            r7.getClass()
            if (r4 == r6) goto L_0x0990
            if (r4 == r13) goto L_0x0990
            if (r4 == r12) goto L_0x0990
            if (r4 != r5) goto L_0x098e
            goto L_0x0990
        L_0x098e:
            r7 = 0
            goto L_0x0991
        L_0x0990:
            r7 = 1
        L_0x0991:
            if (r7 == 0) goto L_0x0999
            r0.mo17738f(r2)
            long r4 = (long) r4
            r2 = 1
            goto L_0x09a7
        L_0x0999:
            r2 = 1
            r0.mo17738f(r2)
            r2 = 0
            r7 = 4
            r8 = 174(0xae, float:2.44E-43)
            r14 = 0
            goto L_0x094e
        L_0x09a4:
            r2 = 1
            r4 = r17
        L_0x09a7:
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x09ad
            r0 = 0
            return r0
        L_0x09ad:
            r0 = 0
            int r5 = (int) r4
            r3.f57354f = r5
            r3.f57353e = r2
            goto L_0x09b6
        L_0x09b4:
            r0 = 0
            r2 = 1
        L_0x09b6:
            int r4 = r3.f57353e
            if (r4 != r2) goto L_0x09c7
            d7.f r4 = r3.f57351c
            r5 = 8
            long r6 = r4.mo31986b(r1, r0, r2, r5)
            r3.f57355g = r6
            r0 = 2
            r3.f57353e = r0
        L_0x09c7:
            d7.c r0 = r3.f57352d
            int r2 = r3.f57354f
            d7.d$b r0 = (p330d7.C20440d.C20442b) r0
            d7.d r0 = p330d7.C20440d.this
            r0.getClass()
            switch(r2) {
                case 131: goto L_0x09df;
                case 134: goto L_0x09dd;
                case 136: goto L_0x09df;
                case 155: goto L_0x09df;
                case 159: goto L_0x09df;
                case 160: goto L_0x09db;
                case 161: goto L_0x09d9;
                case 163: goto L_0x09d9;
                case 174: goto L_0x09db;
                case 176: goto L_0x09df;
                case 179: goto L_0x09df;
                case 181: goto L_0x09d7;
                case 183: goto L_0x09db;
                case 186: goto L_0x09df;
                case 187: goto L_0x09db;
                case 215: goto L_0x09df;
                case 224: goto L_0x09db;
                case 225: goto L_0x09db;
                case 231: goto L_0x09df;
                case 241: goto L_0x09df;
                case 251: goto L_0x09df;
                case 16980: goto L_0x09df;
                case 16981: goto L_0x09d9;
                case 17026: goto L_0x09dd;
                case 17029: goto L_0x09df;
                case 17143: goto L_0x09df;
                case 17545: goto L_0x09d7;
                case 18401: goto L_0x09df;
                case 18402: goto L_0x09d9;
                case 18407: goto L_0x09db;
                case 18408: goto L_0x09df;
                case 19899: goto L_0x09db;
                case 20529: goto L_0x09df;
                case 20530: goto L_0x09df;
                case 20532: goto L_0x09db;
                case 20533: goto L_0x09db;
                case 21419: goto L_0x09d9;
                case 21420: goto L_0x09df;
                case 21432: goto L_0x09df;
                case 21680: goto L_0x09df;
                case 21682: goto L_0x09df;
                case 21690: goto L_0x09df;
                case 21930: goto L_0x09df;
                case 21936: goto L_0x09db;
                case 21945: goto L_0x09df;
                case 21946: goto L_0x09df;
                case 21947: goto L_0x09df;
                case 21948: goto L_0x09df;
                case 21949: goto L_0x09df;
                case 21968: goto L_0x09db;
                case 21969: goto L_0x09d7;
                case 21970: goto L_0x09d7;
                case 21971: goto L_0x09d7;
                case 21972: goto L_0x09d7;
                case 21973: goto L_0x09d7;
                case 21974: goto L_0x09d7;
                case 21975: goto L_0x09d7;
                case 21976: goto L_0x09d7;
                case 21977: goto L_0x09d7;
                case 21978: goto L_0x09d7;
                case 22186: goto L_0x09df;
                case 22203: goto L_0x09df;
                case 25152: goto L_0x09db;
                case 25188: goto L_0x09df;
                case 25506: goto L_0x09d9;
                case 28032: goto L_0x09db;
                case 30320: goto L_0x09db;
                case 30322: goto L_0x09d9;
                case 2274716: goto L_0x09dd;
                case 2352003: goto L_0x09df;
                case 2807729: goto L_0x09df;
                case 290298740: goto L_0x09db;
                case 357149030: goto L_0x09db;
                case 374648427: goto L_0x09db;
                case 408125543: goto L_0x09db;
                case 440786851: goto L_0x09db;
                case 475249515: goto L_0x09db;
                case 524531317: goto L_0x09db;
                default: goto L_0x09d5;
            }
        L_0x09d5:
            r0 = 0
            goto L_0x09e0
        L_0x09d7:
            r0 = 5
            goto L_0x09e0
        L_0x09d9:
            r0 = 4
            goto L_0x09e0
        L_0x09db:
            r0 = 1
            goto L_0x09e0
        L_0x09dd:
            r0 = 3
            goto L_0x09e0
        L_0x09df:
            r0 = 2
        L_0x09e0:
            if (r0 == 0) goto L_0x0c01
            r2 = 1
            if (r0 == r2) goto L_0x0b4f
            r4 = 8
            r2 = 2
            if (r0 == r2) goto L_0x0b04
            r2 = 3
            if (r0 == r2) goto L_0x0a7b
            r2 = 4
            if (r0 == r2) goto L_0x0a6a
            r2 = 5
            if (r0 != r2) goto L_0x0a53
            long r6 = r3.f57355g
            r8 = 4
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0a19
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0a00
            goto L_0x0a19
        L_0x0a00:
            x6.n r0 = new x6.n
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid float size: "
            r1.append(r2)
            long r4 = r3.f57355g
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0a19:
            d7.c r0 = r3.f57352d
            int r2 = r3.f57354f
            int r4 = (int) r6
            byte[] r5 = r3.f57349a
            b7.b r1 = (p294b7.C16738b) r1
            r6 = 0
            r1.mo17737e(r5, r6, r4, r6)
            r1 = 0
            r14 = 0
        L_0x0a29:
            if (r1 >= r4) goto L_0x0a3b
            r5 = 8
            long r6 = r14 << r5
            byte[] r5 = r3.f57349a
            byte r5 = r5[r1]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r8 = (long) r5
            long r14 = r6 | r8
            int r1 = r1 + 1
            goto L_0x0a29
        L_0x0a3b:
            r1 = 4
            if (r4 != r1) goto L_0x0a45
            int r1 = (int) r14
            float r1 = java.lang.Float.intBitsToFloat(r1)
            double r4 = (double) r1
            goto L_0x0a49
        L_0x0a45:
            double r4 = java.lang.Double.longBitsToDouble(r14)
        L_0x0a49:
            d7.d$b r0 = (p330d7.C20440d.C20442b) r0
            r0.mo31983b(r2, r4)
            r0 = 0
            r3.f57353e = r0
            goto L_0x0b34
        L_0x0a53:
            x6.n r1 = new x6.n
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Invalid element type "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0a6a:
            d7.c r0 = r3.f57352d
            int r2 = r3.f57354f
            long r4 = r3.f57355g
            int r5 = (int) r4
            d7.d$b r0 = (p330d7.C20440d.C20442b) r0
            r0.mo31982a(r2, r5, r1)
            r0 = 0
            r3.f57353e = r0
            goto L_0x0b34
        L_0x0a7b:
            long r4 = r3.f57355g
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0aeb
            d7.c r0 = r3.f57352d
            int r2 = r3.f57354f
            int r5 = (int) r4
            if (r5 != 0) goto L_0x0a8e
            java.lang.String r1 = ""
            goto L_0x0a9b
        L_0x0a8e:
            byte[] r4 = new byte[r5]
            b7.b r1 = (p294b7.C16738b) r1
            r6 = 0
            r1.mo17737e(r4, r6, r5, r6)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
        L_0x0a9b:
            d7.d$b r0 = (p330d7.C20440d.C20442b) r0
            d7.d r0 = p330d7.C20440d.this
            r0.getClass()
            r4 = 134(0x86, float:1.88E-43)
            if (r2 == r4) goto L_0x0ae3
            r4 = 17026(0x4282, float:2.3859E-41)
            if (r2 == r4) goto L_0x0ab5
            r4 = 2274716(0x22b59c, float:3.187556E-39)
            if (r2 == r4) goto L_0x0ab0
            goto L_0x0ae7
        L_0x0ab0:
            d7.d$c r0 = r0.f57409t
            r0.f57430N = r1
            goto L_0x0ae7
        L_0x0ab5:
            java.lang.String r0 = "webm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0ae7
            java.lang.String r0 = "matroska"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0ac7
            goto L_0x0ae7
        L_0x0ac7:
            x6.n r0 = new x6.n
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "DocType "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = " not supported"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0ae3:
            d7.d$c r0 = r0.f57409t
            r0.f57433a = r1
        L_0x0ae7:
            r0 = 0
            r3.f57353e = r0
            goto L_0x0b34
        L_0x0aeb:
            x6.n r0 = new x6.n
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "String element size: "
            r1.append(r2)
            long r4 = r3.f57355g
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0b04:
            long r6 = r3.f57355g
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0b36
            d7.c r0 = r3.f57352d
            int r2 = r3.f57354f
            int r4 = (int) r6
            byte[] r5 = r3.f57349a
            b7.b r1 = (p294b7.C16738b) r1
            r6 = 0
            r1.mo17737e(r5, r6, r4, r6)
            r1 = 0
            r14 = 0
        L_0x0b1a:
            if (r1 >= r4) goto L_0x0b2c
            r5 = 8
            long r6 = r14 << r5
            byte[] r8 = r3.f57349a
            byte r8 = r8[r1]
            r8 = r8 & 255(0xff, float:3.57E-43)
            long r8 = (long) r8
            long r14 = r6 | r8
            int r1 = r1 + 1
            goto L_0x0b1a
        L_0x0b2c:
            d7.d$b r0 = (p330d7.C20440d.C20442b) r0
            r0.mo31984c(r2, r14)
            r0 = 0
            r3.f57353e = r0
        L_0x0b34:
            r0 = 1
            return r0
        L_0x0b36:
            x6.n r0 = new x6.n
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid integer size: "
            r1.append(r2)
            long r4 = r3.f57355g
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0b4f:
            r0 = r1
            b7.b r0 = (p294b7.C16738b) r0
            long r0 = r0.f45242c
            long r4 = r3.f57355g
            long r4 = r4 + r0
            java.util.Stack<d7.a$b> r2 = r3.f57350b
            d7.a$b r6 = new d7.a$b
            int r7 = r3.f57354f
            r8 = 0
            r6.<init>(r7, r4, r8)
            r2.add(r6)
            d7.c r2 = r3.f57352d
            int r4 = r3.f57354f
            long r5 = r3.f57355g
            d7.d$b r2 = (p330d7.C20440d.C20442b) r2
            d7.d r2 = p330d7.C20440d.this
            r2.getClass()
            if (r4 == r9) goto L_0x0bfa
            r7 = 174(0xae, float:2.44E-43)
            if (r4 == r7) goto L_0x0bf1
            r7 = 187(0xbb, float:2.62E-43)
            if (r4 == r7) goto L_0x0bed
            r7 = 19899(0x4dbb, float:2.7884E-41)
            if (r4 == r7) goto L_0x0be6
            r7 = 20533(0x5035, float:2.8773E-41)
            if (r4 == r7) goto L_0x0be0
            r7 = 21968(0x55d0, float:3.0784E-41)
            if (r4 == r7) goto L_0x0bda
            r7 = 408125543(0x18538067, float:2.7335937E-24)
            if (r4 == r7) goto L_0x0bc2
            if (r4 == r12) goto L_0x0bb3
            if (r4 == r13) goto L_0x0b91
            goto L_0x0beb
        L_0x0b91:
            boolean r0 = r2.f57410u
            if (r0 != 0) goto L_0x0beb
            boolean r0 = r2.f57393d
            if (r0 == 0) goto L_0x0ba3
            long r0 = r2.f57414y
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0ba3
            r0 = 1
            r2.f57413x = r0
            goto L_0x0beb
        L_0x0ba3:
            r0 = 1
            b7.g r1 = r2.f57389Y
            b7.l$a r4 = new b7.l$a
            long r5 = r2.f57408s
            r4.<init>(r5)
            r1.mo17750g(r4)
            r2.f57410u = r0
            goto L_0x0beb
        L_0x0bb3:
            e8.h r0 = new e8.h
            r0.<init>()
            r2.f57366B = r0
            e8.h r0 = new e8.h
            r0.<init>()
            r2.f57367C = r0
            goto L_0x0beb
        L_0x0bc2:
            long r7 = r2.f57405p
            int r4 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0bd5
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0bcd
            goto L_0x0bd5
        L_0x0bcd:
            x6.n r0 = new x6.n
            java.lang.String r1 = "Multiple Segment elements not supported"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0bd5:
            r2.f57405p = r0
            r2.f57404o = r5
            goto L_0x0beb
        L_0x0bda:
            d7.d$c r0 = r2.f57409t
            r1 = 1
            r0.f57449q = r1
            goto L_0x0beb
        L_0x0be0:
            r1 = 1
            d7.d$c r0 = r2.f57409t
            r0.f57437e = r1
            goto L_0x0beb
        L_0x0be6:
            r0 = -1
            r2.f57411v = r0
            r2.f57412w = r10
        L_0x0beb:
            r0 = 0
            goto L_0x0bfd
        L_0x0bed:
            r0 = 0
            r2.f57368D = r0
            goto L_0x0bfd
        L_0x0bf1:
            r0 = 0
            d7.d$c r1 = new d7.d$c
            r1.<init>()
            r2.f57409t = r1
            goto L_0x0bfd
        L_0x0bfa:
            r0 = 0
            r2.f57388X = r0
        L_0x0bfd:
            r3.f57353e = r0
            r2 = 1
            return r2
        L_0x0c01:
            r0 = 0
            r2 = 1
            long r4 = r3.f57355g
            int r5 = (int) r4
            r4 = r1
            b7.b r4 = (p294b7.C16738b) r4
            r4.mo17738f(r5)
            r3.f57353e = r0
            r0 = r3
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: p330d7.C20435a.mo31974a(b7.f):boolean");
    }
}
