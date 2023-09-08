package p341g7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p294b7.C16742f;
import p294b7.C16748l;
import p333e8.C20533g;
import p333e8.C20541m;
import p333e8.C20551y;
import p341g7.C20800h;

/* renamed from: g7.b */
public final class C20793b extends C20800h {

    /* renamed from: n */
    public C20533g f58750n;

    /* renamed from: o */
    public C20794a f58751o;

    /* renamed from: g7.b$a */
    public class C20794a implements C20798f, C16748l {

        /* renamed from: a */
        public long[] f58752a;

        /* renamed from: b */
        public long[] f58753b;

        /* renamed from: c */
        public long f58754c = -1;

        /* renamed from: d */
        public long f58755d = -1;

        public C20794a() {
        }

        /* renamed from: a */
        public C16748l mo32490a() {
            return this;
        }

        /* renamed from: b */
        public long mo32491b(C16742f fVar) {
            long j = this.f58755d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.f58755d = -1;
            return j2;
        }

        /* renamed from: c */
        public long mo32492c(long j) {
            long j2 = (((long) C20793b.this.f58784i) * j) / TimeUtil.SECOND_TO_US;
            this.f58755d = this.f58752a[C20551y.m22313c(this.f58752a, j2, true, true)];
            return j2;
        }

        /* renamed from: f */
        public boolean mo17730f() {
            return true;
        }

        /* renamed from: g */
        public long mo17731g(long j) {
            return this.f58754c + this.f58753b[C20551y.m22313c(this.f58752a, (((long) C20793b.this.f58784i) * j) / TimeUtil.SECOND_TO_US, true, true)];
        }

        /* renamed from: h */
        public long mo17732h() {
            C20533g gVar = C20793b.this.f58750n;
            return (gVar.f57785d * TimeUtil.SECOND_TO_US) / ((long) gVar.f57782a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r5 = 0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo32494b(p333e8.C20541m r15) {
        /*
            r14 = this;
            byte[] r0 = r15.f57809a
            r1 = 0
            byte r2 = r0[r1]
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x000b
            r2 = 1
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            if (r2 != 0) goto L_0x0011
            r0 = -1
            return r0
        L_0x0011:
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r5 = 4
            int r0 = r0 >> r5
            switch(r0) {
                case 1: goto L_0x00af;
                case 2: goto L_0x00a9;
                case 3: goto L_0x00a9;
                case 4: goto L_0x00a9;
                case 5: goto L_0x00a9;
                case 6: goto L_0x0023;
                case 7: goto L_0x0023;
                case 8: goto L_0x001d;
                case 9: goto L_0x001d;
                case 10: goto L_0x001d;
                case 11: goto L_0x001d;
                case 12: goto L_0x001d;
                case 13: goto L_0x001d;
                case 14: goto L_0x001d;
                case 15: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x00b1
        L_0x001d:
            r15 = 256(0x100, float:3.59E-43)
            int r0 = r0 + -8
            goto L_0x00ac
        L_0x0023:
            r15.mo32114y(r5)
            byte[] r2 = r15.f57809a
            int r3 = r15.f57810b
            byte r2 = r2[r3]
            long r2 = (long) r2
            r5 = 7
            r6 = 7
        L_0x002f:
            r7 = 6
            if (r6 < 0) goto L_0x004a
            int r8 = r4 << r6
            long r9 = (long) r8
            long r9 = r9 & r2
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0047
            if (r6 >= r7) goto L_0x0043
            int r8 = r8 - r4
            long r8 = (long) r8
            long r2 = r2 & r8
            int r5 = r5 - r6
            goto L_0x004b
        L_0x0043:
            if (r6 != r5) goto L_0x004a
            r5 = 1
            goto L_0x004b
        L_0x0047:
            int r6 = r6 + -1
            goto L_0x002f
        L_0x004a:
            r5 = 0
        L_0x004b:
            if (r5 == 0) goto L_0x0092
            r6 = 1
        L_0x004e:
            if (r6 >= r5) goto L_0x007c
            byte[] r8 = r15.f57809a
            int r9 = r15.f57810b
            int r9 = r9 + r6
            byte r8 = r8[r9]
            r9 = r8 & 192(0xc0, float:2.69E-43)
            r10 = 128(0x80, float:1.794E-43)
            if (r9 != r10) goto L_0x0065
            long r2 = r2 << r7
            r8 = r8 & 63
            long r8 = (long) r8
            long r2 = r2 | r8
            int r6 = r6 + 1
            goto L_0x004e
        L_0x0065:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid UTF-8 sequence continuation byte: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x007c:
            int r2 = r15.f57810b
            int r2 = r2 + r5
            r15.f57810b = r2
            if (r0 != r7) goto L_0x0088
            int r0 = r15.mo32103n()
            goto L_0x008c
        L_0x0088:
            int r0 = r15.mo32108s()
        L_0x008c:
            r15.mo32113x(r1)
            int r3 = r0 + 1
            goto L_0x00b1
        L_0x0092:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid UTF-8 sequence first byte: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x00a9:
            r15 = 576(0x240, float:8.07E-43)
            int r0 = r0 - r2
        L_0x00ac:
            int r3 = r15 << r0
            goto L_0x00b1
        L_0x00af:
            r3 = 192(0xc0, float:2.69E-43)
        L_0x00b1:
            long r0 = (long) r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341g7.C20793b.mo32494b(e8.m):long");
    }

    /* renamed from: c */
    public boolean mo32495c(C20541m mVar, long j, C20800h.C20802b bVar) {
        C20541m mVar2 = mVar;
        C20800h.C20802b bVar2 = bVar;
        byte[] bArr = mVar2.f57809a;
        if (this.f58750n == null) {
            this.f58750n = new C20533g(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, mVar2.f57811c);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            C20533g gVar = this.f58750n;
            int i = gVar.f57784c;
            int i2 = gVar.f57782a;
            bVar2.f58789a = Format.m16642c((String) null, MimeTypes.AUDIO_FLAC, (String) null, -1, i * i2, gVar.f57783b, i2, singletonList, (DrmInitData) null, 0, (String) null);
        } else {
            byte b = bArr[0];
            if ((b & Byte.MAX_VALUE) == 3) {
                C20794a aVar = new C20794a();
                this.f58751o = aVar;
                mVar2.mo32114y(1);
                int p = mVar.mo32105p() / 18;
                aVar.f58752a = new long[p];
                aVar.f58753b = new long[p];
                for (int i3 = 0; i3 < p; i3++) {
                    aVar.f58752a[i3] = mVar.mo32098i();
                    aVar.f58753b[i3] = mVar.mo32098i();
                    mVar2.mo32114y(2);
                }
            } else {
                if (b == -1) {
                    C20794a aVar2 = this.f58751o;
                    if (aVar2 != null) {
                        aVar2.f58754c = j;
                        bVar2.f58790b = aVar2;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    public void mo32496d(boolean z) {
        super.mo32496d(z);
        if (z) {
            this.f58750n = null;
            this.f58751o = null;
        }
    }
}
