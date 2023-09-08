package te3;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class xh4 extends C47465a {

    /* renamed from: A */
    public int f64700A;

    /* renamed from: B */
    public String f64701B;

    /* renamed from: C */
    public String f64702C;

    /* renamed from: D */
    public LinkedList<e54> f64703D = new LinkedList<>();

    /* renamed from: E */
    public long f64704E;

    /* renamed from: F */
    public boolean f64705F;

    /* renamed from: G */
    public String f64706G;

    /* renamed from: H */
    public long f64707H;

    /* renamed from: I */
    public long f64708I;

    /* renamed from: J */
    public long f64709J;

    /* renamed from: K */
    public LinkedList<zh4> f64710K = new LinkedList<>();

    /* renamed from: L */
    public int f64711L;

    /* renamed from: M */
    public long f64712M;

    /* renamed from: N */
    public sh4 f64713N;

    /* renamed from: P */
    public int f64714P;

    /* renamed from: Q */
    public int f64715Q;

    /* renamed from: R */
    public boolean f64716R;

    /* renamed from: S */
    public String f64717S;

    /* renamed from: T */
    public vh4 f64718T;

    /* renamed from: U */
    public int f64719U;

    /* renamed from: V */
    public xh4 f64720V;

    /* renamed from: W */
    public LinkedList<C49768hy> f64721W = new LinkedList<>();

    /* renamed from: X */
    public int f64722X;

    /* renamed from: Y */
    public qh4 f64723Y;

    /* renamed from: Z */
    public String f64724Z;

    /* renamed from: d */
    public String f64725d;

    /* renamed from: e */
    public String f64726e;

    /* renamed from: f */
    public String f64727f;

    /* renamed from: g */
    public int f64728g;

    /* renamed from: h */
    public String f64729h;

    /* renamed from: i */
    public int f64730i;

    /* renamed from: j */
    public int f64731j;

    /* renamed from: n */
    public String f64732n;

    /* renamed from: o */
    public String f64733o;

    /* renamed from: p */
    public String f64734p;

    /* renamed from: p0 */
    public int f64735p0;

    /* renamed from: q */
    public String f64736q;

    /* renamed from: r */
    public String f64737r;

    /* renamed from: s */
    public String f64738s;

    /* renamed from: t */
    public String f64739t;

    /* renamed from: u */
    public String f64740u;

    /* renamed from: v */
    public long f64741v;

    /* renamed from: w */
    public String f64742w;

    /* renamed from: x */
    public String f64743x;

    /* renamed from: y */
    public String f64744y;

    /* renamed from: z */
    public String f64745z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xh4)) {
            return false;
        }
        xh4 xh4 = (xh4) aVar;
        return C46238a.m51546a(this.f64725d, xh4.f64725d) && C46238a.m51546a(this.f64726e, xh4.f64726e) && C46238a.m51546a(this.f64727f, xh4.f64727f) && C46238a.m51546a(Integer.valueOf(this.f64728g), Integer.valueOf(xh4.f64728g)) && C46238a.m51546a(this.f64729h, xh4.f64729h) && C46238a.m51546a(Integer.valueOf(this.f64730i), Integer.valueOf(xh4.f64730i)) && C46238a.m51546a(Integer.valueOf(this.f64731j), Integer.valueOf(xh4.f64731j)) && C46238a.m51546a(this.f64732n, xh4.f64732n) && C46238a.m51546a(this.f64733o, xh4.f64733o) && C46238a.m51546a(this.f64734p, xh4.f64734p) && C46238a.m51546a(this.f64736q, xh4.f64736q) && C46238a.m51546a(this.f64737r, xh4.f64737r) && C46238a.m51546a(this.f64738s, xh4.f64738s) && C46238a.m51546a(this.f64739t, xh4.f64739t) && C46238a.m51546a(this.f64740u, xh4.f64740u) && C46238a.m51546a(Long.valueOf(this.f64741v), Long.valueOf(xh4.f64741v)) && C46238a.m51546a(this.f64742w, xh4.f64742w) && C46238a.m51546a(this.f64743x, xh4.f64743x) && C46238a.m51546a(this.f64744y, xh4.f64744y) && C46238a.m51546a(this.f64745z, xh4.f64745z) && C46238a.m51546a(Integer.valueOf(this.f64700A), Integer.valueOf(xh4.f64700A)) && C46238a.m51546a(this.f64701B, xh4.f64701B) && C46238a.m51546a(this.f64702C, xh4.f64702C) && C46238a.m51546a(this.f64703D, xh4.f64703D) && C46238a.m51546a(Long.valueOf(this.f64704E), Long.valueOf(xh4.f64704E)) && C46238a.m51546a(Boolean.valueOf(this.f64705F), Boolean.valueOf(xh4.f64705F)) && C46238a.m51546a(this.f64706G, xh4.f64706G) && C46238a.m51546a(Long.valueOf(this.f64707H), Long.valueOf(xh4.f64707H)) && C46238a.m51546a(Long.valueOf(this.f64708I), Long.valueOf(xh4.f64708I)) && C46238a.m51546a(Long.valueOf(this.f64709J), Long.valueOf(xh4.f64709J)) && C46238a.m51546a(this.f64710K, xh4.f64710K) && C46238a.m51546a(Integer.valueOf(this.f64711L), Integer.valueOf(xh4.f64711L)) && C46238a.m51546a(Long.valueOf(this.f64712M), Long.valueOf(xh4.f64712M)) && C46238a.m51546a(this.f64713N, xh4.f64713N) && C46238a.m51546a(Integer.valueOf(this.f64714P), Integer.valueOf(xh4.f64714P)) && C46238a.m51546a(Integer.valueOf(this.f64715Q), Integer.valueOf(xh4.f64715Q)) && C46238a.m51546a(Boolean.valueOf(this.f64716R), Boolean.valueOf(xh4.f64716R)) && C46238a.m51546a(this.f64717S, xh4.f64717S) && C46238a.m51546a(this.f64718T, xh4.f64718T) && C46238a.m51546a(Integer.valueOf(this.f64719U), Integer.valueOf(xh4.f64719U)) && C46238a.m51546a(this.f64720V, xh4.f64720V) && C46238a.m51546a(this.f64721W, xh4.f64721W) && C46238a.m51546a(Integer.valueOf(this.f64722X), Integer.valueOf(xh4.f64722X)) && C46238a.m51546a(this.f64723Y, xh4.f64723Y) && C46238a.m51546a(this.f64724Z, xh4.f64724Z) && C46238a.m51546a(Integer.valueOf(this.f64735p0), Integer.valueOf(xh4.f64735p0));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64725d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64726e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f64727f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f64728g);
            String str4 = this.f64729h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f64730i);
            aVar.mo74318e(7, this.f64731j);
            String str5 = this.f64732n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f64733o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f64734p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            String str8 = this.f64736q;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            String str9 = this.f64737r;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            String str10 = this.f64738s;
            if (str10 != null) {
                aVar.mo74323j(13, str10);
            }
            String str11 = this.f64739t;
            if (str11 != null) {
                aVar.mo74323j(14, str11);
            }
            String str12 = this.f64740u;
            if (str12 != null) {
                aVar.mo74323j(15, str12);
            }
            aVar.mo74321h(16, this.f64741v);
            String str13 = this.f64742w;
            if (str13 != null) {
                aVar.mo74323j(17, str13);
            }
            String str14 = this.f64743x;
            if (str14 != null) {
                aVar.mo74323j(18, str14);
            }
            String str15 = this.f64744y;
            if (str15 != null) {
                aVar.mo74323j(19, str15);
            }
            String str16 = this.f64745z;
            if (str16 != null) {
                aVar.mo74323j(20, str16);
            }
            aVar.mo74318e(21, this.f64700A);
            String str17 = this.f64701B;
            if (str17 != null) {
                aVar.mo74323j(22, str17);
            }
            String str18 = this.f64702C;
            if (str18 != null) {
                aVar.mo74323j(23, str18);
            }
            aVar.mo74320g(24, 8, this.f64703D);
            aVar.mo74321h(25, this.f64704E);
            aVar.mo74314a(26, this.f64705F);
            String str19 = this.f64706G;
            if (str19 != null) {
                aVar.mo74323j(27, str19);
            }
            aVar.mo74321h(28, this.f64707H);
            aVar.mo74321h(29, this.f64708I);
            aVar.mo74321h(30, this.f64709J);
            aVar.mo74320g(31, 8, this.f64710K);
            aVar.mo74318e(32, this.f64711L);
            aVar.mo74321h(33, this.f64712M);
            sh4 sh4 = this.f64713N;
            if (sh4 != null) {
                aVar.mo74322i(34, sh4.computeSize());
                this.f64713N.writeFields(aVar);
            }
            aVar.mo74318e(35, this.f64714P);
            aVar.mo74318e(36, this.f64715Q);
            aVar.mo74314a(37, this.f64716R);
            String str20 = this.f64717S;
            if (str20 != null) {
                aVar.mo74323j(38, str20);
            }
            vh4 vh4 = this.f64718T;
            if (vh4 != null) {
                aVar.mo74322i(39, vh4.computeSize());
                this.f64718T.writeFields(aVar);
            }
            aVar.mo74318e(40, this.f64719U);
            xh4 xh4 = this.f64720V;
            if (xh4 != null) {
                aVar.mo74322i(41, xh4.computeSize());
                this.f64720V.writeFields(aVar);
            }
            aVar.mo74320g(42, 8, this.f64721W);
            aVar.mo74318e(43, this.f64722X);
            qh4 qh4 = this.f64723Y;
            if (qh4 != null) {
                aVar.mo74322i(44, qh4.computeSize());
                this.f64723Y.writeFields(aVar);
            }
            String str21 = this.f64724Z;
            if (str21 != null) {
                aVar.mo74323j(45, str21);
            }
            aVar.mo74318e(46, this.f64735p0);
            return 0;
        } else if (i2 == 1) {
            String str22 = this.f64725d;
            if (str22 != null) {
                i3 = C52418a.m58683j(1, str22) + 0;
            }
            String str23 = this.f64726e;
            if (str23 != null) {
                i3 += C52418a.m58683j(2, str23);
            }
            String str24 = this.f64727f;
            if (str24 != null) {
                i3 += C52418a.m58683j(3, str24);
            }
            int e = i3 + C52418a.m58678e(4, this.f64728g);
            String str25 = this.f64729h;
            if (str25 != null) {
                e += C52418a.m58683j(5, str25);
            }
            int e2 = e + C52418a.m58678e(6, this.f64730i) + C52418a.m58678e(7, this.f64731j);
            String str26 = this.f64732n;
            if (str26 != null) {
                e2 += C52418a.m58683j(8, str26);
            }
            String str27 = this.f64733o;
            if (str27 != null) {
                e2 += C52418a.m58683j(9, str27);
            }
            String str28 = this.f64734p;
            if (str28 != null) {
                e2 += C52418a.m58683j(10, str28);
            }
            String str29 = this.f64736q;
            if (str29 != null) {
                e2 += C52418a.m58683j(11, str29);
            }
            String str30 = this.f64737r;
            if (str30 != null) {
                e2 += C52418a.m58683j(12, str30);
            }
            String str31 = this.f64738s;
            if (str31 != null) {
                e2 += C52418a.m58683j(13, str31);
            }
            String str32 = this.f64739t;
            if (str32 != null) {
                e2 += C52418a.m58683j(14, str32);
            }
            String str33 = this.f64740u;
            if (str33 != null) {
                e2 += C52418a.m58683j(15, str33);
            }
            int h = e2 + C52418a.m58681h(16, this.f64741v);
            String str34 = this.f64742w;
            if (str34 != null) {
                h += C52418a.m58683j(17, str34);
            }
            String str35 = this.f64743x;
            if (str35 != null) {
                h += C52418a.m58683j(18, str35);
            }
            String str36 = this.f64744y;
            if (str36 != null) {
                h += C52418a.m58683j(19, str36);
            }
            String str37 = this.f64745z;
            if (str37 != null) {
                h += C52418a.m58683j(20, str37);
            }
            int e3 = h + C52418a.m58678e(21, this.f64700A);
            String str38 = this.f64701B;
            if (str38 != null) {
                e3 += C52418a.m58683j(22, str38);
            }
            String str39 = this.f64702C;
            if (str39 != null) {
                e3 += C52418a.m58683j(23, str39);
            }
            int g = e3 + C52418a.m58680g(24, 8, this.f64703D) + C52418a.m58681h(25, this.f64704E) + C52418a.m58674a(26, this.f64705F);
            String str40 = this.f64706G;
            if (str40 != null) {
                g += C52418a.m58683j(27, str40);
            }
            int h2 = g + C52418a.m58681h(28, this.f64707H) + C52418a.m58681h(29, this.f64708I) + C52418a.m58681h(30, this.f64709J) + C52418a.m58680g(31, 8, this.f64710K) + C52418a.m58678e(32, this.f64711L) + C52418a.m58681h(33, this.f64712M);
            sh4 sh42 = this.f64713N;
            if (sh42 != null) {
                h2 += C52418a.m58682i(34, sh42.computeSize());
            }
            int e4 = h2 + C52418a.m58678e(35, this.f64714P) + C52418a.m58678e(36, this.f64715Q) + C52418a.m58674a(37, this.f64716R);
            String str41 = this.f64717S;
            if (str41 != null) {
                e4 += C52418a.m58683j(38, str41);
            }
            vh4 vh42 = this.f64718T;
            if (vh42 != null) {
                e4 += C52418a.m58682i(39, vh42.computeSize());
            }
            int e5 = e4 + C52418a.m58678e(40, this.f64719U);
            xh4 xh42 = this.f64720V;
            if (xh42 != null) {
                e5 += C52418a.m58682i(41, xh42.computeSize());
            }
            int g2 = e5 + C52418a.m58680g(42, 8, this.f64721W) + C52418a.m58678e(43, this.f64722X);
            qh4 qh42 = this.f64723Y;
            if (qh42 != null) {
                g2 += C52418a.m58682i(44, qh42.computeSize());
            }
            String str42 = this.f64724Z;
            if (str42 != null) {
                g2 += C52418a.m58683j(45, str42);
            }
            return g2 + C52418a.m58678e(46, this.f64735p0);
        } else if (i2 == 2) {
            this.f64703D.clear();
            this.f64710K.clear();
            this.f64721W.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            xh4 xh43 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xh43.f64725d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    xh43.f64726e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xh43.f64727f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    xh43.f64728g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    xh43.f64729h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    xh43.f64730i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    xh43.f64731j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    xh43.f64732n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    xh43.f64733o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    xh43.f64734p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    xh43.f64736q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    xh43.f64737r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    xh43.f64738s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    xh43.f64739t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    xh43.f64740u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    xh43.f64741v = aVar3.mo141631i(intValue);
                    return 0;
                case 17:
                    xh43.f64742w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    xh43.f64743x = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    xh43.f64744y = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    xh43.f64745z = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    xh43.f64700A = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    xh43.f64701B = aVar3.mo141633k(intValue);
                    return 0;
                case 23:
                    xh43.f64702C = aVar3.mo141633k(intValue);
                    return 0;
                case 24:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        e54 e54 = new e54();
                        if (bArr != null && bArr.length > 0) {
                            e54.parseFrom(bArr);
                        }
                        xh43.f64703D.add(e54);
                    }
                    return 0;
                case 25:
                    xh43.f64704E = aVar3.mo141631i(intValue);
                    return 0;
                case 26:
                    xh43.f64705F = aVar3.mo141625c(intValue);
                    return 0;
                case 27:
                    xh43.f64706G = aVar3.mo141633k(intValue);
                    return 0;
                case 28:
                    xh43.f64707H = aVar3.mo141631i(intValue);
                    return 0;
                case 29:
                    xh43.f64708I = aVar3.mo141631i(intValue);
                    return 0;
                case 30:
                    xh43.f64709J = aVar3.mo141631i(intValue);
                    return 0;
                case 31:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        zh4 zh4 = new zh4();
                        if (bArr2 != null && bArr2.length > 0) {
                            zh4.parseFrom(bArr2);
                        }
                        xh43.f64710K.add(zh4);
                    }
                    return 0;
                case 32:
                    xh43.f64711L = aVar3.mo141629g(intValue);
                    return 0;
                case 33:
                    xh43.f64712M = aVar3.mo141631i(intValue);
                    return 0;
                case 34:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        sh4 sh43 = new sh4();
                        if (bArr3 != null && bArr3.length > 0) {
                            sh43.parseFrom(bArr3);
                        }
                        xh43.f64713N = sh43;
                    }
                    return 0;
                case 35:
                    xh43.f64714P = aVar3.mo141629g(intValue);
                    return 0;
                case 36:
                    xh43.f64715Q = aVar3.mo141629g(intValue);
                    return 0;
                case 37:
                    xh43.f64716R = aVar3.mo141625c(intValue);
                    return 0;
                case 38:
                    xh43.f64717S = aVar3.mo141633k(intValue);
                    return 0;
                case 39:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        vh4 vh43 = new vh4();
                        if (bArr4 != null && bArr4.length > 0) {
                            vh43.parseFrom(bArr4);
                        }
                        xh43.f64718T = vh43;
                    }
                    return 0;
                case 40:
                    xh43.f64719U = aVar3.mo141629g(intValue);
                    return 0;
                case 41:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        xh4 xh44 = new xh4();
                        if (bArr5 != null && bArr5.length > 0) {
                            xh44.parseFrom(bArr5);
                        }
                        xh43.f64720V = xh44;
                    }
                    return 0;
                case 42:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C49768hy hyVar = new C49768hy();
                        if (bArr6 != null && bArr6.length > 0) {
                            hyVar.parseFrom(bArr6);
                        }
                        xh43.f64721W.add(hyVar);
                    }
                    return 0;
                case 43:
                    xh43.f64722X = aVar3.mo141629g(intValue);
                    return 0;
                case 44:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        qh4 qh43 = new qh4();
                        if (bArr7 != null && bArr7.length > 0) {
                            qh43.parseFrom(bArr7);
                        }
                        xh43.f64723Y = qh43;
                    }
                    return 0;
                case 45:
                    xh43.f64724Z = aVar3.mo141633k(intValue);
                    return 0;
                case 46:
                    xh43.f64735p0 = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f64725d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, str, false);
            aVar.mo71655d(jSONObject, "videoUrl", this.f64726e, false);
            aVar.mo71655d(jSONObject, "thumbnailUrl", this.f64727f, false);
            aVar.mo71655d(jSONObject, "videoDurationSec", Integer.valueOf(this.f64728g), false);
            aVar.mo71655d(jSONObject, "videoId", this.f64729h, false);
            aVar.mo71655d(jSONObject, "thumbWidth", Integer.valueOf(this.f64730i), false);
            aVar.mo71655d(jSONObject, "thumbHeight", Integer.valueOf(this.f64731j), false);
            aVar.mo71655d(jSONObject, "shareUrl", this.f64732n, false);
            aVar.mo71655d(jSONObject, "shareTitle", this.f64733o, false);
            aVar.mo71655d(jSONObject, "shareDesc", this.f64734p, false);
            aVar.mo71655d(jSONObject, "shareImgUrl", this.f64736q, false);
            aVar.mo71655d(jSONObject, "shareString", this.f64737r, false);
            aVar.mo71655d(jSONObject, "shareStringUrl", this.f64738s, false);
            aVar.mo71655d(jSONObject, FirebaseAnalytics.C113379b.SOURCE, this.f64739t, false);
            aVar.mo71655d(jSONObject, "sourceUrl", this.f64740u, false);
            aVar.mo71655d(jSONObject, "relevantCategory", Long.valueOf(this.f64741v), false);
            aVar.mo71655d(jSONObject, "shareOpenId", this.f64742w, false);
            aVar.mo71655d(jSONObject, "expand", this.f64743x, false);
            aVar.mo71655d(jSONObject, "strPlayCount", this.f64744y, false);
            aVar.mo71655d(jSONObject, "titleUrl", this.f64745z, false);
            aVar.mo71655d(jSONObject, "itemtype", Integer.valueOf(this.f64700A), false);
            aVar.mo71655d(jSONObject, "itemExpand", this.f64701B, false);
            aVar.mo71655d(jSONObject, "bizIcon", this.f64702C, false);
            aVar.mo71655d(jSONObject, "tagList", this.f64703D, false);
            aVar.mo71655d(jSONObject, AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.f64704E), false);
            aVar.mo71655d(jSONObject, "isShow", Boolean.valueOf(this.f64705F), false);
            aVar.mo71655d(jSONObject, "docId", this.f64706G, false);
            aVar.mo71655d(jSONObject, "resultType", Long.valueOf(this.f64707H), false);
            aVar.mo71655d(jSONObject, "type", Long.valueOf(this.f64708I), false);
            aVar.mo71655d(jSONObject, "videoSize", Long.valueOf(this.f64709J), false);
            aVar.mo71655d(jSONObject, "videoUrlList", this.f64710K, false);
            aVar.mo71655d(jSONObject, "switchFlag", Integer.valueOf(this.f64711L), false);
            aVar.mo71655d(jSONObject, "shareChannelId", Long.valueOf(this.f64712M), false);
            aVar.mo71655d(jSONObject, "secondVideoInfo", this.f64713N, false);
            aVar.mo71655d(jSONObject, "cdnScene", Integer.valueOf(this.f64714P), false);
            aVar.mo71655d(jSONObject, "cdnSourceType", Integer.valueOf(this.f64715Q), false);
            aVar.mo71655d(jSONObject, "isSelfThumb", Boolean.valueOf(this.f64716R), false);
            aVar.mo71655d(jSONObject, "byPass", this.f64717S, false);
            aVar.mo71655d(jSONObject, "feedBackInfo", this.f64718T, false);
            aVar.mo71655d(jSONObject, TPReportKeys.PlayerStep.PLAYER_CDN_TYPE, Integer.valueOf(this.f64719U), false);
            aVar.mo71655d(jSONObject, "longVideoInfo", this.f64720V, false);
            aVar.mo71655d(jSONObject, "extReqParams", this.f64721W, false);
            aVar.mo71655d(jSONObject, "globalColikeCnt", Integer.valueOf(this.f64722X), false);
            aVar.mo71655d(jSONObject, "pointVideoInfo", this.f64723Y, false);
            aVar.mo71655d(jSONObject, "bizUserName", this.f64724Z, false);
            aVar.mo71655d(jSONObject, "sourceJumpType", Integer.valueOf(this.f64735p0), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
