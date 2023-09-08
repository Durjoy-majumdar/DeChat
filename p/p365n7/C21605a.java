package p365n7;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p333e8.C20541m;
import p333e8.C20551y;
import p355l7.C21392a;
import p355l7.C21395c;

/* renamed from: n7.a */
public final class C21605a implements C21392a {

    /* renamed from: a */
    public static final int f61178a = C20551y.m22316f("ID3");

    /* renamed from: n7.a$a */
    public interface C21606a {
    }

    /* renamed from: n7.a$b */
    public static final class C21607b {

        /* renamed from: a */
        public final int f61179a;

        /* renamed from: b */
        public final boolean f61180b;

        /* renamed from: c */
        public final int f61181c;

        public C21607b(int i, boolean z, int i2) {
            this.f61179a = i;
            this.f61180b = z;
            this.f61181c = i2;
        }
    }

    public C21605a(C21606a aVar) {
    }

    /* renamed from: c */
    public static ApicFrame m24515c(C20541m mVar, int i, int i2) {
        int i3;
        String str;
        int n = mVar.mo32103n();
        String o = m24527o(n);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        mVar.mo32091b(bArr, 0, i4);
        if (i2 == 2) {
            String str2 = "image/" + C20551y.m22322l(new String(bArr, 0, 3, KindaConfigCacheStg.SAVE_CHARSET));
            if (str2.equals("image/jpg")) {
                str2 = "image/jpeg";
            }
            str = str2;
            i3 = 2;
        } else {
            i3 = m24530r(bArr, 0);
            String l = C20551y.m22322l(new String(bArr, 0, i3, KindaConfigCacheStg.SAVE_CHARSET));
            if (l.indexOf(47) == -1) {
                str = "image/" + l;
            } else {
                str = l;
            }
        }
        byte b = bArr[i3 + 1] & ExifInterface.MARKER;
        int i5 = i3 + 2;
        int q = m24529q(bArr, i5, n);
        String str3 = new String(bArr, i5, q - i5, o);
        int n2 = q + m24526n(n);
        return new ApicFrame(str, str3, b, i4 <= n2 ? new byte[0] : Arrays.copyOfRange(bArr, n2, i4));
    }

    /* renamed from: d */
    public static ChapterFrame m24516d(C20541m mVar, int i, int i2, boolean z, int i3, C21606a aVar) {
        C20541m mVar2 = mVar;
        int i4 = mVar2.f57810b;
        int r = m24530r(mVar2.f57809a, i4);
        String str = new String(mVar2.f57809a, i4, r - i4, KindaConfigCacheStg.SAVE_CHARSET);
        mVar.mo32113x(r + 1);
        int c = mVar.mo32092c();
        int c2 = mVar.mo32092c();
        long o = mVar.mo32104o();
        long j = o == Util.MAX_32BIT_VALUE ? -1 : o;
        long o2 = mVar.mo32104o();
        long j2 = o2 == Util.MAX_32BIT_VALUE ? -1 : o2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (mVar2.f57810b < i5) {
            Id3Frame g = m24519g(i2, mVar, z, i3, aVar);
            if (g != null) {
                arrayList.add(g);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, c, c2, j, j2, id3FrameArr);
    }

    /* renamed from: e */
    public static ChapterTocFrame m24517e(C20541m mVar, int i, int i2, boolean z, int i3, C21606a aVar) {
        C20541m mVar2 = mVar;
        int i4 = mVar2.f57810b;
        int r = m24530r(mVar2.f57809a, i4);
        String str = new String(mVar2.f57809a, i4, r - i4, KindaConfigCacheStg.SAVE_CHARSET);
        mVar.mo32113x(r + 1);
        int n = mVar.mo32103n();
        boolean z2 = (n & 2) != 0;
        boolean z3 = (n & 1) != 0;
        int n2 = mVar.mo32103n();
        String[] strArr = new String[n2];
        for (int i5 = 0; i5 < n2; i5++) {
            int i6 = mVar2.f57810b;
            int r2 = m24530r(mVar2.f57809a, i6);
            strArr[i5] = new String(mVar2.f57809a, i6, r2 - i6, KindaConfigCacheStg.SAVE_CHARSET);
            mVar.mo32113x(r2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (mVar2.f57810b < i7) {
            Id3Frame g = m24519g(i2, mVar, z, i3, aVar);
            if (g != null) {
                arrayList.add(g);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    /* renamed from: f */
    public static CommentFrame m24518f(C20541m mVar, int i) {
        if (i < 4) {
            return null;
        }
        int n = mVar.mo32103n();
        String o = m24527o(n);
        byte[] bArr = new byte[3];
        mVar.mo32091b(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        mVar.mo32091b(bArr2, 0, i2);
        int q = m24529q(bArr2, 0, n);
        String str2 = new String(bArr2, 0, q, o);
        int n2 = q + m24526n(n);
        return new CommentFrame(str, str2, n2 < i2 ? new String(bArr2, n2, m24529q(bArr2, n2, n) - n2, o) : "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0181, code lost:
        if (r11 == 67) goto L_0x0183;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame m24519g(int r20, p333e8.C20541m r21, boolean r22, int r23, p365n7.C21605a.C21606a r24) {
        /*
            r0 = r20
            r7 = r21
            int r8 = r21.mo32103n()
            int r9 = r21.mo32103n()
            int r10 = r21.mo32103n()
            r1 = 3
            if (r0 < r1) goto L_0x0019
            int r3 = r21.mo32103n()
            r11 = r3
            goto L_0x001a
        L_0x0019:
            r11 = 0
        L_0x001a:
            r3 = 4
            if (r0 != r3) goto L_0x003b
            int r4 = r21.mo32106q()
            if (r22 != 0) goto L_0x0046
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r4 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 7
            r5 = r5 | r6
            int r6 = r4 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 14
            r5 = r5 | r6
            int r4 = r4 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 21
            r4 = r4 | r5
            goto L_0x0046
        L_0x003b:
            if (r0 != r1) goto L_0x0042
            int r4 = r21.mo32106q()
            goto L_0x0046
        L_0x0042:
            int r4 = r21.mo32105p()
        L_0x0046:
            if (r0 < r1) goto L_0x004d
            int r5 = r21.mo32108s()
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            r12 = 0
            if (r8 != 0) goto L_0x0061
            if (r9 != 0) goto L_0x0061
            if (r10 != 0) goto L_0x0061
            if (r11 != 0) goto L_0x0061
            if (r4 != 0) goto L_0x0061
            if (r5 != 0) goto L_0x0061
            int r0 = r7.f57811c
            r7.mo32113x(r0)
            return r12
        L_0x0061:
            int r6 = r7.f57810b
            int r13 = r6 + r4
            int r6 = r7.f57811c
            if (r13 <= r6) goto L_0x006d
            r7.mo32113x(r6)
            return r12
        L_0x006d:
            r6 = 77
            r14 = 79
            r15 = 2
            r2 = 67
            r3 = 1
            if (r24 == 0) goto L_0x008c
            if (r8 != r2) goto L_0x0084
            if (r9 != r14) goto L_0x0084
            if (r10 != r6) goto L_0x0084
            if (r11 == r6) goto L_0x0081
            if (r0 != r15) goto L_0x0084
        L_0x0081:
            r16 = 1
            goto L_0x0086
        L_0x0084:
            r16 = 0
        L_0x0086:
            if (r16 != 0) goto L_0x008c
            r7.mo32113x(r13)
            return r12
        L_0x008c:
            if (r0 != r1) goto L_0x00ad
            r1 = r5 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0094
            r1 = 1
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            r16 = r5 & 64
            if (r16 == 0) goto L_0x009c
            r16 = 1
            goto L_0x009e
        L_0x009c:
            r16 = 0
        L_0x009e:
            r5 = r5 & 32
            if (r5 == 0) goto L_0x00a4
            r5 = 1
            goto L_0x00a5
        L_0x00a4:
            r5 = 0
        L_0x00a5:
            r17 = r16
            r18 = 0
            r16 = r5
            r5 = r1
            goto L_0x00e7
        L_0x00ad:
            r1 = 4
            if (r0 != r1) goto L_0x00df
            r1 = r5 & 64
            if (r1 == 0) goto L_0x00b6
            r1 = 1
            goto L_0x00b7
        L_0x00b6:
            r1 = 0
        L_0x00b7:
            r16 = r5 & 8
            if (r16 == 0) goto L_0x00be
            r16 = 1
            goto L_0x00c0
        L_0x00be:
            r16 = 0
        L_0x00c0:
            r17 = r5 & 4
            if (r17 == 0) goto L_0x00c7
            r17 = 1
            goto L_0x00c9
        L_0x00c7:
            r17 = 0
        L_0x00c9:
            r18 = r5 & 2
            if (r18 == 0) goto L_0x00d0
            r18 = 1
            goto L_0x00d2
        L_0x00d0:
            r18 = 0
        L_0x00d2:
            r5 = r5 & r3
            if (r5 == 0) goto L_0x00d7
            r5 = 1
            goto L_0x00d8
        L_0x00d7:
            r5 = 0
        L_0x00d8:
            r19 = r16
            r16 = r1
            r1 = r19
            goto L_0x00e7
        L_0x00df:
            r1 = 0
            r5 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x00e7:
            if (r1 != 0) goto L_0x01eb
            if (r17 == 0) goto L_0x00ed
            goto L_0x01eb
        L_0x00ed:
            if (r16 == 0) goto L_0x00f4
            int r4 = r4 + -1
            r7.mo32114y(r3)
        L_0x00f4:
            if (r5 == 0) goto L_0x00fc
            int r4 = r4 + -4
            r1 = 4
            r7.mo32114y(r1)
        L_0x00fc:
            if (r18 == 0) goto L_0x0103
            int r1 = m24531s(r7, r4)
            r4 = r1
        L_0x0103:
            r1 = 84
            r3 = 88
            if (r8 != r1) goto L_0x0117
            if (r9 != r3) goto L_0x0117
            if (r10 != r3) goto L_0x0117
            if (r0 == r15) goto L_0x0111
            if (r11 != r3) goto L_0x0117
        L_0x0111:
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = m24523k(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            goto L_0x01d9
        L_0x0117:
            if (r8 != r1) goto L_0x0126
            java.lang.String r1 = m24528p(r0, r8, r9, r10, r11)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = m24522j(r7, r4, r1)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            goto L_0x01d9
        L_0x0123:
            r0 = move-exception
            goto L_0x01e2
        L_0x0126:
            r5 = 87
            if (r8 != r5) goto L_0x0138
            if (r9 != r3) goto L_0x0138
            if (r10 != r3) goto L_0x0138
            if (r0 == r15) goto L_0x0132
            if (r11 != r3) goto L_0x0138
        L_0x0132:
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = m24525m(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            goto L_0x01d9
        L_0x0138:
            if (r8 != r5) goto L_0x0144
            java.lang.String r1 = m24528p(r0, r8, r9, r10, r11)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = m24524l(r7, r4, r1)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            goto L_0x01d9
        L_0x0144:
            r3 = 73
            r5 = 80
            if (r8 != r5) goto L_0x015a
            r12 = 82
            if (r9 != r12) goto L_0x015a
            if (r10 != r3) goto L_0x015a
            r12 = 86
            if (r11 != r12) goto L_0x015a
            com.google.android.exoplayer2.metadata.id3.PrivFrame r1 = m24521i(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            goto L_0x01d9
        L_0x015a:
            r12 = 71
            if (r8 != r12) goto L_0x0170
            r12 = 69
            if (r9 != r12) goto L_0x0170
            if (r10 != r14) goto L_0x0170
            r12 = 66
            if (r11 == r12) goto L_0x016a
            if (r0 != r15) goto L_0x0170
        L_0x016a:
            com.google.android.exoplayer2.metadata.id3.GeobFrame r1 = m24520h(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            goto L_0x01d9
        L_0x0170:
            r12 = 65
            if (r0 != r15) goto L_0x017b
            if (r8 != r5) goto L_0x0188
            if (r9 != r3) goto L_0x0188
            if (r10 != r2) goto L_0x0188
            goto L_0x0183
        L_0x017b:
            if (r8 != r12) goto L_0x0188
            if (r9 != r5) goto L_0x0188
            if (r10 != r3) goto L_0x0188
            if (r11 != r2) goto L_0x0188
        L_0x0183:
            com.google.android.exoplayer2.metadata.id3.ApicFrame r1 = m24515c(r7, r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            goto L_0x01d9
        L_0x0188:
            if (r8 != r2) goto L_0x0197
            if (r9 != r14) goto L_0x0197
            if (r10 != r6) goto L_0x0197
            if (r11 == r6) goto L_0x0192
            if (r0 != r15) goto L_0x0197
        L_0x0192:
            com.google.android.exoplayer2.metadata.id3.CommentFrame r1 = m24518f(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            goto L_0x01d9
        L_0x0197:
            if (r8 != r2) goto L_0x01b1
            r3 = 72
            if (r9 != r3) goto L_0x01b1
            if (r10 != r12) goto L_0x01b1
            if (r11 != r5) goto L_0x01b1
            r1 = r21
            r2 = r4
            r3 = r20
            r4 = r22
            r5 = r23
            r6 = r24
            com.google.android.exoplayer2.metadata.id3.ChapterFrame r1 = m24516d(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            goto L_0x01d9
        L_0x01b1:
            if (r8 != r2) goto L_0x01c9
            if (r9 != r1) goto L_0x01c9
            if (r10 != r14) goto L_0x01c9
            if (r11 != r2) goto L_0x01c9
            r1 = r21
            r2 = r4
            r3 = r20
            r4 = r22
            r5 = r23
            r6 = r24
            com.google.android.exoplayer2.metadata.id3.ChapterTocFrame r1 = m24517e(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            goto L_0x01d9
        L_0x01c9:
            java.lang.String r1 = m24528p(r0, r8, r9, r10, r11)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            byte[] r2 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            r3 = 0
            r7.mo32091b(r2, r3, r4)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            com.google.android.exoplayer2.metadata.id3.BinaryFrame r3 = new com.google.android.exoplayer2.metadata.id3.BinaryFrame     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            r3.<init>(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
            r1 = r3
        L_0x01d9:
            if (r1 != 0) goto L_0x01de
            m24528p(r0, r8, r9, r10, r11)     // Catch:{ UnsupportedEncodingException -> 0x01e6, all -> 0x0123 }
        L_0x01de:
            r7.mo32113x(r13)
            return r1
        L_0x01e2:
            r7.mo32113x(r13)
            throw r0
        L_0x01e6:
            r7.mo32113x(r13)
            r0 = 0
            return r0
        L_0x01eb:
            r0 = r12
            r7.mo32113x(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p365n7.C21605a.m24519g(int, e8.m, boolean, int, n7.a$a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    /* renamed from: h */
    public static GeobFrame m24520h(C20541m mVar, int i) {
        int n = mVar.mo32103n();
        String o = m24527o(n);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        mVar.mo32091b(bArr, 0, i2);
        int r = m24530r(bArr, 0);
        String str = new String(bArr, 0, r, KindaConfigCacheStg.SAVE_CHARSET);
        int i3 = r + 1;
        int q = m24529q(bArr, i3, n);
        String str2 = new String(bArr, i3, q - i3, o);
        int n2 = q + m24526n(n);
        int q2 = m24529q(bArr, n2, n);
        String str3 = new String(bArr, n2, q2 - n2, o);
        int n3 = q2 + m24526n(n);
        return new GeobFrame(str, str2, str3, i2 <= n3 ? new byte[0] : Arrays.copyOfRange(bArr, n3, i2));
    }

    /* renamed from: i */
    public static PrivFrame m24521i(C20541m mVar, int i) {
        byte[] bArr = new byte[i];
        mVar.mo32091b(bArr, 0, i);
        int r = m24530r(bArr, 0);
        String str = new String(bArr, 0, r, KindaConfigCacheStg.SAVE_CHARSET);
        int i2 = r + 1;
        return new PrivFrame(str, i <= i2 ? new byte[0] : Arrays.copyOfRange(bArr, i2, i));
    }

    /* renamed from: j */
    public static TextInformationFrame m24522j(C20541m mVar, int i, String str) {
        if (i < 1) {
            return null;
        }
        int n = mVar.mo32103n();
        String o = m24527o(n);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        mVar.mo32091b(bArr, 0, i2);
        return new TextInformationFrame(str, (String) null, new String(bArr, 0, m24529q(bArr, 0, n), o));
    }

    /* renamed from: k */
    public static TextInformationFrame m24523k(C20541m mVar, int i) {
        if (i < 1) {
            return null;
        }
        int n = mVar.mo32103n();
        String o = m24527o(n);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        mVar.mo32091b(bArr, 0, i2);
        int q = m24529q(bArr, 0, n);
        String str = new String(bArr, 0, q, o);
        int n2 = q + m24526n(n);
        return new TextInformationFrame("TXXX", str, n2 < i2 ? new String(bArr, n2, m24529q(bArr, n2, n) - n2, o) : "");
    }

    /* renamed from: l */
    public static UrlLinkFrame m24524l(C20541m mVar, int i, String str) {
        byte[] bArr = new byte[i];
        mVar.mo32091b(bArr, 0, i);
        return new UrlLinkFrame(str, (String) null, new String(bArr, 0, m24530r(bArr, 0), KindaConfigCacheStg.SAVE_CHARSET));
    }

    /* renamed from: m */
    public static UrlLinkFrame m24525m(C20541m mVar, int i) {
        if (i < 1) {
            return null;
        }
        int n = mVar.mo32103n();
        String o = m24527o(n);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        mVar.mo32091b(bArr, 0, i2);
        int q = m24529q(bArr, 0, n);
        String str = new String(bArr, 0, q, o);
        int n2 = q + m24526n(n);
        return new UrlLinkFrame("WXXX", str, n2 < i2 ? new String(bArr, n2, m24530r(bArr, n2) - n2, KindaConfigCacheStg.SAVE_CHARSET) : "");
    }

    /* renamed from: n */
    public static int m24526n(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: o */
    public static String m24527o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? KindaConfigCacheStg.SAVE_CHARSET : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: p */
    public static String m24528p(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: q */
    public static int m24529q(byte[] bArr, int i, int i2) {
        int r = m24530r(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return r;
        }
        while (r < bArr.length - 1) {
            if (r % 2 == 0 && bArr[r + 1] == 0) {
                return r;
            }
            r = m24530r(bArr, r + 1);
        }
        return bArr.length;
    }

    /* renamed from: r */
    public static int m24530r(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: s */
    public static int m24531s(C20541m mVar, int i) {
        byte[] bArr = mVar.f57809a;
        int i2 = mVar.f57810b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= i) {
                return i;
            }
            if ((bArr[i2] & ExifInterface.MARKER) == 255 && bArr[i3] == 0) {
                System.arraycopy(bArr, i2 + 2, bArr, i3, (i - i2) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        if ((r10 & 1) != 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        if ((r10 & 128) != 0) goto L_0x008a;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m24532t(p333e8.C20541m r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f57810b
        L_0x0006:
            int r3 = r1.f57811c     // Catch:{ all -> 0x00ab }
            int r4 = r1.f57810b     // Catch:{ all -> 0x00ab }
            int r3 = r3 - r4
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ad
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0021
            int r7 = r18.mo32092c()     // Catch:{ all -> 0x00ab }
            long r8 = r18.mo32104o()     // Catch:{ all -> 0x00ab }
            int r10 = r18.mo32108s()     // Catch:{ all -> 0x00ab }
            goto L_0x002b
        L_0x0021:
            int r7 = r18.mo32105p()     // Catch:{ all -> 0x00ab }
            int r8 = r18.mo32105p()     // Catch:{ all -> 0x00ab }
            long r8 = (long) r8
            r10 = 0
        L_0x002b:
            r11 = 0
            if (r7 != 0) goto L_0x0039
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0039
            if (r10 != 0) goto L_0x0039
            r1.mo32113x(r2)
            return r4
        L_0x0039:
            r7 = 4
            if (r0 != r7) goto L_0x006a
            if (r21 != 0) goto L_0x006a
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004a
            r1.mo32113x(r2)
            return r6
        L_0x004a:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006a:
            if (r0 != r7) goto L_0x007a
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0072
            r3 = 1
            goto L_0x0073
        L_0x0072:
            r3 = 0
        L_0x0073:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0078
            goto L_0x008a
        L_0x0078:
            r4 = 0
            goto L_0x008a
        L_0x007a:
            if (r0 != r3) goto L_0x0088
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0078
            goto L_0x008a
        L_0x0088:
            r3 = 0
            goto L_0x0078
        L_0x008a:
            if (r4 == 0) goto L_0x008e
            int r3 = r3 + 4
        L_0x008e:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0097
            r1.mo32113x(r2)
            return r6
        L_0x0097:
            int r3 = r1.f57811c     // Catch:{ all -> 0x00ab }
            int r4 = r1.f57810b     // Catch:{ all -> 0x00ab }
            int r3 = r3 - r4
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a5
            r1.mo32113x(r2)
            return r6
        L_0x00a5:
            int r3 = (int) r8
            r1.mo32114y(r3)     // Catch:{ all -> 0x00ab }
            goto L_0x0006
        L_0x00ab:
            r0 = move-exception
            goto L_0x00b1
        L_0x00ad:
            r1.mo32113x(r2)
            return r4
        L_0x00b1:
            r1.mo32113x(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p365n7.C21605a.m24532t(e8.m, int, int, boolean):boolean");
    }

    /* renamed from: a */
    public Metadata mo33521a(C21395c cVar) {
        ByteBuffer byteBuffer = cVar.f67260f;
        return mo33860b(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (((r7 & 64) != 0) != false) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0088  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.metadata.Metadata mo33860b(byte[] r12, int r13) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            e8.m r1 = new e8.m
            r1.<init>(r12, r13)
            int r12 = r1.f57811c
            int r13 = r1.f57810b
            int r12 = r12 - r13
            r13 = 0
            r2 = 0
            r3 = 1
            r4 = 2
            r5 = 10
            r6 = 4
            if (r12 >= r5) goto L_0x001a
            goto L_0x0084
        L_0x001a:
            int r12 = r1.mo32105p()
            int r7 = f61178a
            if (r12 == r7) goto L_0x0024
            goto L_0x0084
        L_0x0024:
            int r12 = r1.mo32103n()
            r1.mo32114y(r3)
            int r7 = r1.mo32103n()
            int r8 = r1.mo32102m()
            if (r12 != r4) goto L_0x003f
            r9 = r7 & 64
            if (r9 == 0) goto L_0x003b
            r9 = 1
            goto L_0x003c
        L_0x003b:
            r9 = 0
        L_0x003c:
            if (r9 == 0) goto L_0x0075
            goto L_0x0084
        L_0x003f:
            r9 = 3
            if (r12 != r9) goto L_0x0055
            r9 = r7 & 64
            if (r9 == 0) goto L_0x0048
            r9 = 1
            goto L_0x0049
        L_0x0048:
            r9 = 0
        L_0x0049:
            if (r9 == 0) goto L_0x0075
            int r9 = r1.mo32092c()
            r1.mo32114y(r9)
            int r9 = r9 + r6
            int r8 = r8 - r9
            goto L_0x0075
        L_0x0055:
            if (r12 != r6) goto L_0x0084
            r9 = r7 & 64
            if (r9 == 0) goto L_0x005d
            r9 = 1
            goto L_0x005e
        L_0x005d:
            r9 = 0
        L_0x005e:
            if (r9 == 0) goto L_0x006a
            int r9 = r1.mo32102m()
            int r10 = r9 + -4
            r1.mo32114y(r10)
            int r8 = r8 - r9
        L_0x006a:
            r9 = r7 & 16
            if (r9 == 0) goto L_0x0070
            r9 = 1
            goto L_0x0071
        L_0x0070:
            r9 = 0
        L_0x0071:
            if (r9 == 0) goto L_0x0075
            int r8 = r8 + -10
        L_0x0075:
            if (r12 >= r6) goto L_0x007d
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x007d
            r7 = 1
            goto L_0x007e
        L_0x007d:
            r7 = 0
        L_0x007e:
            n7.a$b r9 = new n7.a$b
            r9.<init>(r12, r7, r8)
            goto L_0x0085
        L_0x0084:
            r9 = r13
        L_0x0085:
            if (r9 != 0) goto L_0x0088
            return r13
        L_0x0088:
            int r12 = r1.f57810b
            int r7 = r9.f61179a
            if (r7 != r4) goto L_0x008f
            r5 = 6
        L_0x008f:
            int r4 = r9.f61181c
            boolean r7 = r9.f61180b
            if (r7 == 0) goto L_0x0099
            int r4 = m24531s(r1, r4)
        L_0x0099:
            int r12 = r12 + r4
            r1.mo32112w(r12)
            int r12 = r9.f61179a
            boolean r12 = m24532t(r1, r12, r5, r2)
            if (r12 != 0) goto L_0x00b2
            int r12 = r9.f61179a
            if (r12 != r6) goto L_0x00b1
            boolean r12 = m24532t(r1, r6, r5, r3)
            if (r12 == 0) goto L_0x00b1
            r2 = 1
            goto L_0x00b2
        L_0x00b1:
            return r13
        L_0x00b2:
            int r12 = r1.f57811c
            int r3 = r1.f57810b
            int r12 = r12 - r3
            if (r12 < r5) goto L_0x00c5
            int r12 = r9.f61179a
            com.google.android.exoplayer2.metadata.id3.Id3Frame r12 = m24519g(r12, r1, r2, r5, r13)
            if (r12 == 0) goto L_0x00b2
            r0.add(r12)
            goto L_0x00b2
        L_0x00c5:
            com.google.android.exoplayer2.metadata.Metadata r12 = new com.google.android.exoplayer2.metadata.Metadata
            r12.<init>((java.util.List<? extends com.google.android.exoplayer2.metadata.Metadata.Entry>) r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p365n7.C21605a.mo33860b(byte[], int):com.google.android.exoplayer2.metadata.Metadata");
    }
}
