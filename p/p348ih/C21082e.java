package p348ih;

import android.media.MediaExtractor;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p213oh.C11412b;
import p213oh.C89210c;
import p335eh.C107275e;
import p335eh.C116768d;
import p339fh.C116868i;
import p339fh.C45784e;
import p346hh.C20941j;
import p356lh.C21428d;
import p366nh.C21632c;

/* renamed from: ih.e */
public class C21082e extends C21079c {

    /* renamed from: H */
    public static int f59619H;

    /* renamed from: I */
    public static int f59620I;

    /* renamed from: A */
    public long f59621A = 0;

    /* renamed from: B */
    public int f59622B = 14144;

    /* renamed from: C */
    public byte[] f59623C = new byte[14144];

    /* renamed from: D */
    public byte[] f59624D = new byte[3536];

    /* renamed from: E */
    public int f59625E = 3536;

    /* renamed from: F */
    public byte[] f59626F = new byte[3536];

    /* renamed from: G */
    public int f59627G = 0;

    /* renamed from: u */
    public MediaExtractor f59628u;

    /* renamed from: v */
    public C104619a f59629v;

    /* renamed from: w */
    public C21086i f59630w;

    /* renamed from: x */
    public String f59631x = null;

    /* renamed from: y */
    public int f59632y = 2;

    /* renamed from: z */
    public long f59633z = 0;

    public C21082e(C21428d dVar, C21632c cVar) {
        super(dVar, cVar);
    }

    /* renamed from: A */
    public void mo32836A(C116768d dVar) {
        int i = this.f59627G;
        if (i > 0) {
            if (i > 3536) {
                int i2 = i / 3536;
                int i3 = i % 3536;
                for (int i4 = 0; i4 < i2; i4++) {
                    byte[] bArr = new byte[3536];
                    System.arraycopy(this.f59623C, i4 * 3536, bArr, 0, 3536);
                    mo32842G(dVar, bArr);
                }
                System.arraycopy(this.f59623C, i2 * 3536, this.f59626F, 0, i3);
                Arrays.fill(this.f59623C, 0, this.f59622B, (byte) 0);
                System.arraycopy(this.f59626F, 0, this.f59623C, 0, i3);
                this.f59627G = i3;
            }
            int i5 = this.f59627G;
            if (i5 <= 3536) {
                byte[] bArr2 = new byte[3536];
                System.arraycopy(this.f59623C, 0, bArr2, 0, i5);
                mo32842G(dVar, bArr2);
                this.f59627G = 0;
            }
        }
    }

    /* renamed from: B */
    public void mo32837B(C116768d dVar) {
        C20941j jVar = this.f59603e;
        if (jVar != null) {
            jVar.mo32681c();
            C45784e c = C45784e.m51066c();
            String str = dVar.f350074c;
            synchronized (c) {
                int i = C11412b.f33577a;
                Log.m105925i("MicroMsg.Mix.AudioCachePathMgr", "append path:%s", str);
                String a = C89210c.m111505a("" + str.hashCode());
                if (!c.f123680a.contains(a)) {
                    c.f123680a.add(a);
                }
            }
            if (mo32814h()) {
                Log.m105925i("MicroMsg.Mix.AudioDecoderMediaCodec", "flushCache", (Object[]) null);
                this.f59603e.mo32680b();
            } else if (mo32812g()) {
                Log.m105925i("MicroMsg.Mix.AudioDecoderMediaCodec", "flushCache and readCacheAndPlay", (Object[]) null);
                this.f59603e.mo32680b();
                mo32828t();
            } else {
                Log.m105925i("MicroMsg.Mix.AudioDecoderMediaCodec", "writeCacheAndPlay", (Object[]) null);
                mo32834z(dVar);
            }
        } else {
            mo32836A(dVar);
            dVar.mo180735a();
        }
    }

    /* renamed from: C */
    public void mo32838C(C116768d dVar, ByteBuffer byteBuffer, int i) {
        if (this.f59603e != null) {
            if (i != this.f59625E) {
                this.f59625E = i;
                this.f59624D = new byte[i];
            }
            byteBuffer.get(this.f59624D);
            this.f59600b.mo32136a().getClass();
            this.f59603e.mo32679a(this.f59624D);
            return;
        }
        mo32839D(dVar, byteBuffer, i);
    }

    /* renamed from: D */
    public void mo32839D(C116768d dVar, ByteBuffer byteBuffer, int i) {
        byte[] bArr;
        int i2;
        if (3536 == i) {
            bArr = new byte[i];
            byteBuffer.get(bArr);
        } else {
            if (i != this.f59625E) {
                this.f59625E = i;
                this.f59624D = new byte[i];
            }
            Arrays.fill(this.f59624D, 0, this.f59625E, (byte) 0);
            byteBuffer.get(this.f59624D, 0, this.f59625E);
            bArr = this.f59624D;
        }
        this.f59600b.mo32136a().getClass();
        if (bArr == null) {
            int i3 = C11412b.f33577a;
            Log.m105921e("MicroMsg.Mix.AudioDecoderMediaCodec", "pushBuffer chunk is null", (Object[]) null);
            return;
        }
        int length = bArr.length;
        if (length == 3536) {
            if (this.f59627G > 0) {
                mo32836A(dVar);
            }
            mo32842G(dVar, bArr);
        } else if (length != 3536) {
            if (length > this.f59622B) {
                while (true) {
                    i2 = this.f59622B;
                    if (i2 >= length) {
                        break;
                    }
                    this.f59622B = i2 + 3536;
                }
                byte[] bArr2 = new byte[i2];
                int i4 = this.f59627G;
                if (i4 > 0) {
                    System.arraycopy(this.f59623C, 0, bArr2, 0, i4);
                }
                this.f59623C = bArr2;
            }
            int i5 = this.f59627G;
            int i6 = i5 + length;
            System.arraycopy(bArr, 0, this.f59623C, i5, length);
            int i7 = i6 / 3536;
            int i8 = i6 % 3536;
            for (int i9 = 0; i9 < i7; i9++) {
                byte[] bArr3 = new byte[3536];
                System.arraycopy(this.f59623C, i9 * 3536, bArr3, 0, 3536);
                mo32842G(dVar, bArr3);
            }
            System.arraycopy(this.f59623C, i7 * 3536, this.f59626F, 0, i8);
            Arrays.fill(this.f59623C, 0, this.f59622B, (byte) 0);
            System.arraycopy(this.f59626F, 0, this.f59623C, 0, i8);
            this.f59627G = i8;
        }
    }

    /* renamed from: E */
    public final void mo32840E() {
        try {
            C104619a aVar = this.f59629v;
            if (aVar != null) {
                aVar.mo148223z();
                this.f59629v.mo148214p();
                this.f59629v = null;
            }
        } catch (Exception e) {
            int i = C11412b.f33577a;
            Log.printErrStackTrace("MicroMsg.Mix.AudioDecoderMediaCodec", e, "releaseMediaCodec", new Object[0]);
        }
    }

    /* renamed from: F */
    public final void mo32841F() {
        try {
            MediaExtractor mediaExtractor = this.f59628u;
            if (mediaExtractor != null) {
                mediaExtractor.release();
                this.f59628u = null;
            }
        } catch (Exception e) {
            int i = C11412b.f33577a;
            Log.printErrStackTrace("MicroMsg.Mix.AudioDecoderMediaCodec", e, "releaseMediaExtractor", new Object[0]);
        }
        try {
            C21086i iVar = this.f59630w;
            if (iVar != null) {
                iVar.close();
                this.f59630w = null;
            }
        } catch (Exception e2) {
            int i2 = C11412b.f33577a;
            Log.printErrStackTrace("MicroMsg.Mix.AudioDecoderMediaCodec", e2, "releaseDataSource", new Object[0]);
        }
    }

    /* renamed from: G */
    public void mo32842G(C116768d dVar, byte[] bArr) {
        C107275e b = C116868i.m164843a().mo180852b();
        b.f320943f = bArr;
        b.f320939b = this.f59613o;
        b.f320940c = this.f59614p;
        b.f320941d = this.f59632y;
        dVar.mo180747m(b);
        mo32833y(b);
    }

    /* renamed from: d */
    public void mo32835d() {
        mo32841F();
        mo32840E();
        C20941j jVar = this.f59603e;
        if (jVar != null) {
            jVar.mo32681c();
            this.f59603e.release();
            this.f59603e = null;
        }
        this.f59604f = null;
        this.f59631x = null;
        this.f59613o = 0;
        this.f59614p = 0;
        this.f59633z = 0;
        this.f59621A = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0313 A[Catch:{ Exception -> 0x039b }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0518 A[Catch:{ Exception -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x051a A[Catch:{ Exception -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x051d A[Catch:{ Exception -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0532 A[Catch:{ Exception -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0206 A[EDGE_INSN: B:221:0x0206->B:80:0x0206 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0311 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02e6  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32817k() {
        /*
            r32 = this;
            r1 = r32
            java.lang.String r0 = "bit-width"
            java.lang.String r2 = "pcm-encoding"
            java.lang.String r3 = "getInputBuffers or getOutputBuffers"
            java.lang.String r4 = "channel-count"
            java.lang.String r5 = "sample-rate"
            int r6 = p213oh.C11412b.f33577a
            java.lang.String r6 = "MicroMsg.Mix.AudioDecoderMediaCodec"
            java.lang.String r7 = "onDecode"
            r8 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r8)
            android.media.MediaExtractor r9 = new android.media.MediaExtractor
            r9.<init>()
            r1.f59628u = r9
            r9 = 1
            r10 = 0
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x05c4 }
            r12 = 23
            if (r11 < r12) goto L_0x0061
            nb0.b r11 = r1.f59601c     // Catch:{ Exception -> 0x05c4 }
            java.lang.String r11 = r11.f256417b     // Catch:{ Exception -> 0x05c4 }
            if (r11 == 0) goto L_0x0061
            nb0.b r11 = r1.f59601c     // Catch:{ Exception -> 0x05c4 }
            java.lang.String r11 = r11.f256417b     // Catch:{ Exception -> 0x05c4 }
            java.lang.String r12 = "wxblob://"
            boolean r11 = r11.startsWith(r12)     // Catch:{ Exception -> 0x05c4 }
            if (r11 == 0) goto L_0x0061
            nb0.b r11 = r1.f59601c     // Catch:{ Exception -> 0x05c4 }
            java.nio.ByteBuffer r11 = r11.f256415B     // Catch:{ Exception -> 0x05c4 }
            if (r11 == 0) goto L_0x0061
            java.lang.String r11 = "decode AudioMediaDataSource"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r8)     // Catch:{ Exception -> 0x05c4 }
            wa2.a r11 = new wa2.a     // Catch:{ Exception -> 0x05c4 }
            nb0.b r12 = r1.f59601c     // Catch:{ Exception -> 0x05c4 }
            java.nio.ByteBuffer r12 = r12.f256415B     // Catch:{ Exception -> 0x05c4 }
            r11.<init>(r12)     // Catch:{ Exception -> 0x05c4 }
            ih.i r12 = r1.f59630w     // Catch:{ Exception -> 0x05c4 }
            if (r12 == 0) goto L_0x0054
            r12.close()     // Catch:{ Exception -> 0x05c4 }
        L_0x0054:
            ih.i r12 = new ih.i     // Catch:{ Exception -> 0x05c4 }
            r12.<init>(r11)     // Catch:{ Exception -> 0x05c4 }
            r1.f59630w = r12     // Catch:{ Exception -> 0x05c4 }
            android.media.MediaExtractor r11 = r1.f59628u     // Catch:{ Exception -> 0x05c4 }
            r11.setDataSource(r12)     // Catch:{ Exception -> 0x05c4 }
            goto L_0x0068
        L_0x0061:
            android.media.MediaExtractor r11 = r1.f59628u     // Catch:{ Exception -> 0x05c4 }
            java.lang.String r12 = r1.f59604f     // Catch:{ Exception -> 0x05c4 }
            r11.setDataSource(r12)     // Catch:{ Exception -> 0x05c4 }
        L_0x0068:
            android.media.MediaExtractor r11 = r1.f59628u     // Catch:{ Exception -> 0x05b2 }
            int r11 = r11.getTrackCount()     // Catch:{ Exception -> 0x05b2 }
            java.lang.String r12 = "tractCount is %d"
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x05b2 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x05b2 }
            r13[r10] = r14     // Catch:{ Exception -> 0x05b2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r12, r13)     // Catch:{ Exception -> 0x05b2 }
            r12 = 0
        L_0x007d:
            if (r12 >= r11) goto L_0x00a1
            android.media.MediaExtractor r13 = r1.f59628u     // Catch:{ Exception -> 0x05b2 }
            android.media.MediaFormat r13 = r13.getTrackFormat(r12)     // Catch:{ Exception -> 0x05b2 }
            java.lang.String r14 = "mime"
            java.lang.String r14 = r13.getString(r14)     // Catch:{ Exception -> 0x05b2 }
            r1.f59631x = r14     // Catch:{ Exception -> 0x05b2 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Exception -> 0x05b2 }
            if (r14 != 0) goto L_0x009e
            java.lang.String r14 = r1.f59631x     // Catch:{ Exception -> 0x05b2 }
            java.lang.String r15 = "audio/"
            boolean r14 = r14.startsWith(r15)     // Catch:{ Exception -> 0x05b2 }
            if (r14 == 0) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            int r12 = r12 + 1
            goto L_0x007d
        L_0x00a1:
            r13 = r8
        L_0x00a2:
            if (r13 != 0) goto L_0x00b2
            java.lang.String r0 = "format is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r8)     // Catch:{ Exception -> 0x05b2 }
            r0 = 703(0x2bf, float:9.85E-43)
            r1.mo32818l(r0)     // Catch:{ Exception -> 0x05b2 }
            r32.mo32841F()     // Catch:{ Exception -> 0x05b2 }
            return
        L_0x00b2:
            java.lang.String r11 = "format:%s"
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x05b2 }
            r12[r10] = r13     // Catch:{ Exception -> 0x05b2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r12)     // Catch:{ Exception -> 0x05b2 }
            int r11 = r13.getInteger(r5)     // Catch:{ Exception -> 0x05b2 }
            r1.f59613o = r11     // Catch:{ Exception -> 0x05b2 }
            int r11 = r13.getInteger(r4)     // Catch:{ Exception -> 0x05b2 }
            r1.f59614p = r11     // Catch:{ Exception -> 0x05b2 }
            java.lang.String r11 = "durationUs"
            long r11 = r13.getLong(r11)     // Catch:{ Exception -> 0x05b2 }
            r1.f59621A = r11     // Catch:{ Exception -> 0x05b2 }
            fh.e r11 = p339fh.C45784e.m51066c()
            java.lang.String r12 = r1.f59604f
            boolean r11 = r11.mo71259d(r12)
            if (r11 == 0) goto L_0x023a
            java.lang.String r11 = r1.f59604f
            java.lang.String r11 = p213oh.C89209a.m111499a(r11)
            android.net.Uri r11 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)
            java.lang.String r9 = r11.getPath()
            if (r9 == 0) goto L_0x0105
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r10, r10)
            java.lang.String r12 = r11.getPath()
            boolean r12 = r12.equals(r9)
            if (r12 != 0) goto L_0x0105
            android.net.Uri$Builder r11 = r11.buildUpon()
            android.net.Uri$Builder r9 = r11.path(r9)
            android.net.Uri r11 = r9.build()
        L_0x0105:
            nb0.b r9 = r1.f59601c
            java.lang.String r9 = r9.f256429n
            java.lang.String r12 = r1.f59604f
            java.lang.String r9 = p213oh.C89209a.m111504f(r9, r12)
            android.net.Uri r9 = com.tencent.p014mm.vfs.C116299g2.m163858n(r9)
            java.lang.String r12 = r9.getPath()
            if (r12 == 0) goto L_0x0133
            java.lang.String r12 = com.tencent.p014mm.vfs.C116299g2.m163855k(r12, r10, r10)
            java.lang.String r10 = r9.getPath()
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0133
            android.net.Uri$Builder r9 = r9.buildUpon()
            android.net.Uri$Builder r9 = r9.path(r12)
            android.net.Uri r9 = r9.build()
        L_0x0133:
            com.tencent.mm.vfs.f0 r10 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r12 = r10.mo177799l(r11, r8)
            boolean r17 = r12.mo177810a()
            if (r17 != 0) goto L_0x0141
            r14 = 0
            goto L_0x0149
        L_0x0141:
            com.tencent.mm.vfs.FileSystem$c r14 = r12.f348991a
            java.lang.String r15 = r12.f348992b
            boolean r14 = r14.mo119948x(r15)
        L_0x0149:
            if (r14 != 0) goto L_0x0173
            com.tencent.mm.vfs.f0$h r14 = r10.mo177799l(r9, r8)
            boolean r15 = r14.mo177810a()
            if (r15 != 0) goto L_0x0157
            r8 = 0
            goto L_0x015f
        L_0x0157:
            com.tencent.mm.vfs.FileSystem$c r15 = r14.f348991a
            java.lang.String r8 = r14.f348992b
            boolean r8 = r15.mo119948x(r8)
        L_0x015f:
            if (r8 == 0) goto L_0x0162
            goto L_0x0174
        L_0x0162:
            java.lang.String r8 = "cache file is not exist"
            r9 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r9)
            fh.e r8 = p339fh.C45784e.m51066c()
            java.lang.String r9 = r1.f59604f
            r8.mo71257a(r9)
            goto L_0x023a
        L_0x0173:
            r14 = 0
        L_0x0174:
            eh.d r8 = r32.mo32810e()
            r8.mo180741g()
            r15 = r2
            r19 = r3
            long r2 = r1.f59621A
            r17 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r17
            r8.f350075d = r2
            hh.b r2 = new hh.b
            java.lang.String r3 = r1.f59604f
            com.tencent.mm.vfs.f0$h r11 = r10.mo177799l(r11, r12)
            boolean r12 = r11.mo177810a()
            if (r12 != 0) goto L_0x0196
            r11 = 0
            goto L_0x019e
        L_0x0196:
            com.tencent.mm.vfs.FileSystem$c r12 = r11.f348991a
            java.lang.String r11 = r11.f348992b
            boolean r11 = r12.mo119948x(r11)
        L_0x019e:
            if (r11 != 0) goto L_0x01b8
            com.tencent.mm.vfs.f0$h r9 = r10.mo177799l(r9, r14)
            boolean r10 = r9.mo177810a()
            if (r10 != 0) goto L_0x01ac
            r9 = 0
            goto L_0x01b4
        L_0x01ac:
            com.tencent.mm.vfs.FileSystem$c r10 = r9.f348991a
            java.lang.String r9 = r9.f348992b
            boolean r9 = r10.mo119948x(r9)
        L_0x01b4:
            if (r9 == 0) goto L_0x01b8
            r9 = 1
            goto L_0x01b9
        L_0x01b8:
            r9 = 0
        L_0x01b9:
            nb0.b r10 = r1.f59601c
            java.lang.String r10 = r10.f256429n
            r2.<init>(r3, r9, r10)
            java.lang.String r3 = "read cache begin"
            r9 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r9)
        L_0x01c6:
            boolean r3 = r32.mo32814h()
            if (r3 == 0) goto L_0x01cd
            goto L_0x0206
        L_0x01cd:
            r32.mo32832x()
            r3 = 3536(0xdd0, float:4.955E-42)
            byte[] r3 = r2.mo121953a(r3)
            if (r3 == 0) goto L_0x01e5
            r9 = 44100(0xac44, float:6.1797E-41)
            r1.f59613o = r9
            r9 = 2
            r1.f59614p = r9
            r1.f59632y = r9
            r1.mo32842G(r8, r3)
        L_0x01e5:
            int r9 = r8.mo180745k()
            if (r9 <= 0) goto L_0x01f8
            if (r3 != 0) goto L_0x01f8
            r8.mo180735a()
            int r3 = f59619H
            r9 = 1
            int r3 = r3 + r9
            f59619H = r3
            r3 = 1
            goto L_0x0207
        L_0x01f8:
            int r9 = r8.mo180745k()
            if (r9 != 0) goto L_0x0204
            if (r3 != 0) goto L_0x0204
            r8.mo180742h()
            goto L_0x0206
        L_0x0204:
            if (r3 != 0) goto L_0x01c6
        L_0x0206:
            r3 = 0
        L_0x0207:
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r11 = 0
            r10[r11] = r9
            java.lang.String r9 = "read cache end，loadSuc:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r10)
            r2.mo121954b()
            if (r3 == 0) goto L_0x023d
            nh.c r0 = r1.f59600b
            nb0.b r0 = r0.mo32136a()
            boolean r0 = r0.f256441z
            r8.f350076e = r0
            r32.mo32841F()
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r2 = f59619H
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "read cache success loadCacheFromPcmCount:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
            return
        L_0x023a:
            r15 = r2
            r19 = r3
        L_0x023d:
            java.lang.String r2 = r1.f59631x     // Catch:{ Exception -> 0x059d }
            com.tencent.mm.compatible.deviceinfo.a r2 = com.tencent.p014mm.compatible.deviceinfo.C104619a.m140211c(r2)     // Catch:{ Exception -> 0x059d }
            r1.f59629v = r2     // Catch:{ Exception -> 0x059d }
            r3 = 0
            r8 = 0
            r2.mo148202a(r13, r3, r3, r8)     // Catch:{ Exception -> 0x059d }
            com.tencent.mm.compatible.deviceinfo.a r2 = r1.f59629v     // Catch:{ Exception -> 0x059d }
            r2.mo148222y()     // Catch:{ Exception -> 0x059d }
            r2 = 716(0x2cc, float:1.003E-42)
            com.tencent.mm.compatible.deviceinfo.a r3 = r1.f59629v     // Catch:{ IllegalStateException -> 0x058a, IllegalArgumentException -> 0x0577 }
            java.nio.ByteBuffer[] r3 = r3.mo148208j()     // Catch:{ IllegalStateException -> 0x058a, IllegalArgumentException -> 0x0577 }
            com.tencent.mm.compatible.deviceinfo.a r8 = r1.f59629v     // Catch:{ IllegalStateException -> 0x058a, IllegalArgumentException -> 0x0577 }
            java.nio.ByteBuffer[] r2 = r8.mo148211m()     // Catch:{ IllegalStateException -> 0x058a, IllegalArgumentException -> 0x0577 }
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r8 = 0
            r9[r8] = r13
            java.lang.String r8 = r1.f59631x
            r10 = 1
            r9[r10] = r8
            java.lang.String r8 = "Track info: extractorFormat: %s mime: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r9)
            r8 = 5
            java.lang.Object[] r9 = new java.lang.Object[r8]
            int r10 = r1.f59613o
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 0
            r9[r11] = r10
            int r10 = r1.f59614p
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 1
            r9[r11] = r10
            int r10 = r1.f59632y
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 2
            r9[r11] = r10
            long r10 = r1.f59621A
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r11 = 3
            r9[r11] = r10
            nh.c r10 = r1.f59600b
            nb0.b r10 = r10.mo32136a()
            java.lang.String r10 = r10.f256416a
            r12 = 4
            r9[r12] = r10
            java.lang.String r10 = "sampleRate:%d, channels:%d, bitDepth:%d, duration:%d, audioId:%s,"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r9)
            android.media.MediaExtractor r9 = r1.f59628u
            r10 = 0
            r9.selectTrack(r10)
            android.media.MediaCodec$BufferInfo r9 = new android.media.MediaCodec$BufferInfo
            r9.<init>()
            eh.d r10 = r32.mo32810e()
            r10.mo180741g()
            int r13 = r1.f59613o
            int r14 = r1.f59614p
            int r8 = r1.f59632y
            boolean r8 = p356lh.C109336a.m148445a(r13, r14, r8)
            if (r8 != 0) goto L_0x02e6
            java.lang.String r8 = "track param is not support config"
            r13 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r8, r13)
            hh.f r8 = new hh.f
            int r13 = r1.f59613o
            int r14 = r1.f59614p
            int r11 = r1.f59632y
            java.lang.String r12 = r1.f59604f
            r19 = r8
            r20 = r10
            r21 = r13
            r22 = r14
            r23 = r11
            r24 = r12
            r19.<init>(r20, r21, r22, r23, r24)
            r1.f59603e = r8
            goto L_0x02fb
        L_0x02e6:
            int r8 = f59620I
            r11 = 1
            int r8 = r8 + r11
            f59620I = r8
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11 = 0
            r12[r11] = r8
            java.lang.String r8 = "track support supportConfigCount:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r12)
        L_0x02fb:
            long r11 = r1.f59621A
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r13
            r10.f350075d = r11
            r8 = 0
            r11 = 0
            r12 = 0
        L_0x0305:
            r14 = 50
            if (r11 != 0) goto L_0x0507
            if (r12 >= r14) goto L_0x0507
            boolean r19 = r32.mo32814h()     // Catch:{ Exception -> 0x039b }
            if (r19 == 0) goto L_0x0313
            goto L_0x0507
        L_0x0313:
            r32.mo32832x()     // Catch:{ Exception -> 0x039b }
            int r12 = r12 + 1
            if (r8 != 0) goto L_0x03a0
            com.tencent.mm.compatible.deviceinfo.a r14 = r1.f59629v     // Catch:{ Exception -> 0x039b }
            r19 = r11
            r20 = r12
            r11 = 1000(0x3e8, double:4.94E-321)
            int r14 = r14.mo148204f(r11)     // Catch:{ Exception -> 0x039b }
            if (r14 < 0) goto L_0x037e
            r11 = r3[r14]     // Catch:{ Exception -> 0x039b }
            android.media.MediaExtractor r12 = r1.f59628u     // Catch:{ Exception -> 0x039b }
            r13 = 0
            int r11 = r12.readSampleData(r11, r13)     // Catch:{ Exception -> 0x039b }
            if (r11 >= 0) goto L_0x0344
            java.lang.String r8 = "saw input EOS. Stopping playback"
            r11 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r8, r11)     // Catch:{ Exception -> 0x039b }
            r22 = r7
            r23 = 1
            r28 = 0
            goto L_0x0360
        L_0x0341:
            r0 = move-exception
            goto L_0x0570
        L_0x0344:
            android.media.MediaExtractor r12 = r1.f59628u     // Catch:{ Exception -> 0x039b }
            long r12 = r12.getSampleTime()     // Catch:{ Exception -> 0x039b }
            r1.f59633z = r12     // Catch:{ Exception -> 0x039b }
            r22 = r7
            r23 = r8
            long r7 = r1.f59621A     // Catch:{ Exception -> 0x0398 }
            r25 = 0
            int r24 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r24 != 0) goto L_0x0359
            goto L_0x035e
        L_0x0359:
            r25 = 100
            long r12 = r12 * r25
            long r12 = r12 / r7
        L_0x035e:
            r28 = r11
        L_0x0360:
            com.tencent.mm.compatible.deviceinfo.a r7 = r1.f59629v     // Catch:{ Exception -> 0x0398 }
            r27 = 0
            long r11 = r1.f59633z     // Catch:{ Exception -> 0x0398 }
            if (r23 == 0) goto L_0x036b
            r31 = 4
            goto L_0x036d
        L_0x036b:
            r31 = 0
        L_0x036d:
            r25 = r7
            r26 = r14
            r29 = r11
            r25.mo148213o(r26, r27, r28, r29, r31)     // Catch:{ Exception -> 0x0398 }
            if (r23 != 0) goto L_0x03a8
            android.media.MediaExtractor r7 = r1.f59628u     // Catch:{ Exception -> 0x0398 }
            r7.advance()     // Catch:{ Exception -> 0x0398 }
            goto L_0x03a8
        L_0x037e:
            r22 = r7
            r23 = r8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0398 }
            r7.<init>()     // Catch:{ Exception -> 0x0398 }
            java.lang.String r8 = "inputBufIndex "
            r7.append(r8)     // Catch:{ Exception -> 0x0398 }
            r7.append(r14)     // Catch:{ Exception -> 0x0398 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0398 }
            r8 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r7, r8)     // Catch:{ Exception -> 0x0398 }
            goto L_0x03a8
        L_0x0398:
            r0 = move-exception
            goto L_0x054b
        L_0x039b:
            r0 = move-exception
            r22 = r7
            goto L_0x054b
        L_0x03a0:
            r22 = r7
            r23 = r8
            r19 = r11
            r20 = r12
        L_0x03a8:
            r8 = r23
            com.tencent.mm.compatible.deviceinfo.a r7 = r1.f59629v     // Catch:{ Exception -> 0x0398 }
            r11 = 1000(0x3e8, double:4.94E-321)
            int r7 = r7.mo148205g(r9, r11)     // Catch:{ Exception -> 0x0398 }
            if (r7 < 0) goto L_0x03dc
            int r11 = r9.size     // Catch:{ Exception -> 0x0398 }
            if (r11 <= 0) goto L_0x03ba
            r20 = 0
        L_0x03ba:
            r12 = r2[r7]     // Catch:{ Exception -> 0x0398 }
            if (r11 <= 0) goto L_0x03c1
            r1.mo32838C(r10, r12, r11)     // Catch:{ Exception -> 0x0398 }
        L_0x03c1:
            r12.clear()     // Catch:{ Exception -> 0x0398 }
            com.tencent.mm.compatible.deviceinfo.a r11 = r1.f59629v     // Catch:{ Exception -> 0x0398 }
            r12 = 0
            r11.mo148216r(r7, r12)     // Catch:{ Exception -> 0x0398 }
            int r7 = r9.flags     // Catch:{ Exception -> 0x0398 }
            r11 = 4
            r7 = r7 & r11
            if (r7 == 0) goto L_0x03eb
            java.lang.String r7 = "saw output EOS."
            r11 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r7, r11)     // Catch:{ Exception -> 0x0398 }
            r12 = r20
            r19 = 1
            goto L_0x03ed
        L_0x03dc:
            r11 = -3
            if (r7 != r11) goto L_0x03f5
            com.tencent.mm.compatible.deviceinfo.a r2 = r1.f59629v     // Catch:{ Exception -> 0x0398 }
            java.nio.ByteBuffer[] r2 = r2.mo148211m()     // Catch:{ Exception -> 0x0398 }
            java.lang.String r7 = "output buffers have changed."
            r11 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r11)     // Catch:{ Exception -> 0x0398 }
        L_0x03eb:
            r12 = r20
        L_0x03ed:
            r11 = r15
            r15 = 2
            r16 = 3
            r23 = 4
            goto L_0x0500
        L_0x03f5:
            r11 = -2
            if (r7 != r11) goto L_0x04e3
            com.tencent.mm.compatible.deviceinfo.a r7 = r1.f59629v     // Catch:{ Exception -> 0x0398 }
            android.media.MediaFormat r7 = r7.mo148212n()     // Catch:{ Exception -> 0x0398 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0398 }
            r11.<init>()     // Catch:{ Exception -> 0x0398 }
            java.lang.String r12 = "output format has changed to "
            r11.append(r12)     // Catch:{ Exception -> 0x0398 }
            r11.append(r7)     // Catch:{ Exception -> 0x0398 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0398 }
            r12 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r12)     // Catch:{ Exception -> 0x0398 }
            int r11 = r7.getInteger(r5)     // Catch:{ Exception -> 0x0398 }
            r1.f59613o = r11     // Catch:{ Exception -> 0x0398 }
            int r11 = r7.getInteger(r4)     // Catch:{ Exception -> 0x0398 }
            r1.f59614p = r11     // Catch:{ Exception -> 0x0398 }
            r11 = r15
            boolean r12 = r7.containsKey(r11)     // Catch:{ Exception -> 0x0398 }
            if (r12 == 0) goto L_0x042d
            int r7 = r7.getInteger(r11)     // Catch:{ Exception -> 0x0398 }
            r1.f59632y = r7     // Catch:{ Exception -> 0x0398 }
            goto L_0x0446
        L_0x042d:
            boolean r12 = r7.containsKey(r0)     // Catch:{ Exception -> 0x0398 }
            if (r12 == 0) goto L_0x0446
            int r7 = r7.getInteger(r0)     // Catch:{ Exception -> 0x0398 }
            r12 = 16
            if (r7 != r12) goto L_0x043f
            r12 = 2
            r1.f59632y = r12     // Catch:{ Exception -> 0x0398 }
            goto L_0x0446
        L_0x043f:
            r12 = 8
            if (r7 != r12) goto L_0x0446
            r7 = 3
            r1.f59632y = r7     // Catch:{ Exception -> 0x0398 }
        L_0x0446:
            java.lang.String r7 = "sampleRate:%d, channels:%d, bitDepth:%d, audioId:%s, sourcePath:%s"
            r12 = 5
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0398 }
            int r14 = r1.f59613o     // Catch:{ Exception -> 0x0398 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x0398 }
            r15 = 0
            r13[r15] = r14     // Catch:{ Exception -> 0x0398 }
            int r14 = r1.f59614p     // Catch:{ Exception -> 0x0398 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x0398 }
            r15 = 1
            r13[r15] = r14     // Catch:{ Exception -> 0x0398 }
            int r14 = r1.f59632y     // Catch:{ Exception -> 0x0398 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x0398 }
            r15 = 2
            r13[r15] = r14     // Catch:{ Exception -> 0x0398 }
            nh.c r14 = r1.f59600b     // Catch:{ Exception -> 0x0398 }
            nb0.b r14 = r14.mo32136a()     // Catch:{ Exception -> 0x0398 }
            java.lang.String r14 = r14.f256416a     // Catch:{ Exception -> 0x0398 }
            r16 = 3
            r13[r16] = r14     // Catch:{ Exception -> 0x0398 }
            java.lang.String r14 = r1.f59604f     // Catch:{ Exception -> 0x0398 }
            r23 = 4
            r13[r23] = r14     // Catch:{ Exception -> 0x0398 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r13)     // Catch:{ Exception -> 0x0398 }
            int r7 = r1.f59632y     // Catch:{ Exception -> 0x0398 }
            boolean r7 = p356lh.C109336a.m148446b(r7)     // Catch:{ Exception -> 0x0398 }
            if (r7 != 0) goto L_0x04a1
            java.lang.String r0 = "bitDepth:%d is not support!"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0398 }
            int r3 = r1.f59632y     // Catch:{ Exception -> 0x0398 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0398 }
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0398 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r2)     // Catch:{ Exception -> 0x0398 }
            r0 = 709(0x2c5, float:9.94E-43)
            r1.mo32818l(r0)     // Catch:{ Exception -> 0x0398 }
            r32.mo32841F()
            r32.mo32840E()
            return
        L_0x04a1:
            int r7 = r1.f59613o     // Catch:{ Exception -> 0x0398 }
            int r13 = r1.f59614p     // Catch:{ Exception -> 0x0398 }
            int r14 = r1.f59632y     // Catch:{ Exception -> 0x0398 }
            boolean r7 = p356lh.C109336a.m148445a(r7, r13, r14)     // Catch:{ Exception -> 0x0398 }
            if (r7 == 0) goto L_0x04ca
            hh.j r7 = r1.f59603e     // Catch:{ Exception -> 0x0398 }
            if (r7 == 0) goto L_0x04ca
            java.lang.String r7 = "support audio Config"
            r13 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r13)     // Catch:{ Exception -> 0x0398 }
            hh.j r7 = r1.f59603e     // Catch:{ Exception -> 0x0398 }
            hh.f r7 = (p346hh.C117085f) r7     // Catch:{ Exception -> 0x0398 }
            r7.mo32681c()     // Catch:{ Exception -> 0x0398 }
            hh.j r7 = r1.f59603e     // Catch:{ Exception -> 0x0398 }
            hh.f r7 = (p346hh.C117085f) r7     // Catch:{ Exception -> 0x0398 }
            r7.release()     // Catch:{ Exception -> 0x0398 }
            r7 = 0
            r1.f59603e = r7     // Catch:{ Exception -> 0x0398 }
            goto L_0x04fe
        L_0x04ca:
            hh.j r7 = r1.f59603e     // Catch:{ Exception -> 0x0398 }
            if (r7 == 0) goto L_0x04fe
            java.lang.String r7 = "update config param"
            r13 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r13)     // Catch:{ Exception -> 0x0398 }
            hh.j r7 = r1.f59603e     // Catch:{ Exception -> 0x0398 }
            int r13 = r1.f59613o     // Catch:{ Exception -> 0x0398 }
            int r14 = r1.f59614p     // Catch:{ Exception -> 0x0398 }
            int r12 = r1.f59632y     // Catch:{ Exception -> 0x0398 }
            hh.e r7 = (p346hh.C117084e) r7     // Catch:{ Exception -> 0x0398 }
            r7.mo181038f(r13, r14, r12)     // Catch:{ Exception -> 0x0398 }
            goto L_0x04fe
        L_0x04e3:
            r11 = r15
            r15 = 2
            r16 = 3
            r23 = 4
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0398 }
            r12.<init>()     // Catch:{ Exception -> 0x0398 }
            java.lang.String r13 = "dequeueOutputBuffer returned "
            r12.append(r13)     // Catch:{ Exception -> 0x0398 }
            r12.append(r7)     // Catch:{ Exception -> 0x0398 }
            java.lang.String r7 = r12.toString()     // Catch:{ Exception -> 0x0398 }
            r12 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r12)     // Catch:{ Exception -> 0x0398 }
        L_0x04fe:
            r12 = r20
        L_0x0500:
            r15 = r11
            r11 = r19
            r7 = r22
            goto L_0x0305
        L_0x0507:
            r22 = r7
            long r2 = r1.f59621A     // Catch:{ Exception -> 0x0398 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            long r7 = r1.f59633z     // Catch:{ Exception -> 0x0398 }
            long r7 = r7 / r4
            long r2 = r2 - r7
            r4 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x051a
            r0 = 1
            goto L_0x051b
        L_0x051a:
            r0 = 0
        L_0x051b:
            if (r12 < r14) goto L_0x0532
            java.lang.String r0 = "onError, noOutputCounter:%d"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0398 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0398 }
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0398 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r2)     // Catch:{ Exception -> 0x0398 }
            r2 = 706(0x2c2, float:9.9E-43)
            r1.mo32818l(r2)     // Catch:{ Exception -> 0x0398 }
            goto L_0x0558
        L_0x0532:
            java.lang.String r2 = "onStop, isComplete:%b"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0398 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0398 }
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x0398 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r3)     // Catch:{ Exception -> 0x0398 }
            if (r0 == 0) goto L_0x0547
            r1.mo32837B(r10)     // Catch:{ Exception -> 0x0398 }
            goto L_0x0558
        L_0x0547:
            r10.mo180741g()     // Catch:{ Exception -> 0x0398 }
            goto L_0x0558
        L_0x054b:
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0341 }
            r3 = r22
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r3, r2)     // Catch:{ all -> 0x0341 }
            r2 = 706(0x2c2, float:9.9E-43)
            r1.mo32818l(r2)     // Catch:{ all -> 0x0341 }
        L_0x0558:
            r32.mo32841F()
            r32.mo32840E()
            nh.c r0 = r1.f59600b
            nb0.b r0 = r0.mo32136a()
            boolean r0 = r0.f256441z
            r10.f350076e = r0
            java.lang.String r0 = "stopping..."
            r2 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r2)
            return
        L_0x0570:
            r32.mo32841F()
            r32.mo32840E()
            throw r0
        L_0x0577:
            r0 = move-exception
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r19
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r4, r3)
            r1.mo32818l(r2)
            r32.mo32841F()
            r32.mo32840E()
            return
        L_0x058a:
            r0 = move-exception
            r4 = r19
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r4, r3)
            r1.mo32818l(r2)
            r32.mo32841F()
            r32.mo32840E()
            return
        L_0x059d:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "createDecoderByType"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r3, r2)
            r0 = 704(0x2c0, float:9.87E-43)
            r1.mo32818l(r0)
            r32.mo32841F()
            r32.mo32840E()
            return
        L_0x05b2:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "get media format from media extractor"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r3, r2)
            r0 = 705(0x2c1, float:9.88E-43)
            r1.mo32818l(r0)
            r32.mo32841F()
            return
        L_0x05c4:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r1.f59604f
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "set extractor data source, sourcePath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r4, r3)
            r1.mo32819m(r2)
            ih.i r0 = r1.f59630w     // Catch:{ Exception -> 0x05e1 }
            if (r0 == 0) goto L_0x05ec
            r0.close()     // Catch:{ Exception -> 0x05e1 }
            r2 = 0
            r1.f59630w = r2     // Catch:{ Exception -> 0x05e1 }
            goto L_0x05ec
        L_0x05e1:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = p213oh.C11412b.f33577a
            java.lang.String r3 = "releaseDataSource"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r3, r2)
        L_0x05ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p348ih.C21082e.mo32817k():void");
    }
}
