package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yi1 */
public class C64858yi1 extends C47465a {

    /* renamed from: A */
    public FinderJumpInfo f186539A;

    /* renamed from: B */
    public int f186540B;

    /* renamed from: C */
    public int f186541C;

    /* renamed from: D */
    public C48883bn1 f186542D;

    /* renamed from: E */
    public C49258eb1 f186543E;

    /* renamed from: F */
    public int f186544F;

    /* renamed from: G */
    public int f186545G;

    /* renamed from: d */
    public String f186546d;

    /* renamed from: e */
    public String f186547e;

    /* renamed from: f */
    public int f186548f;

    /* renamed from: g */
    public long f186549g;

    /* renamed from: h */
    public int f186550h;

    /* renamed from: i */
    public int f186551i;

    /* renamed from: j */
    public long f186552j;

    /* renamed from: n */
    public C89349b f186553n;

    /* renamed from: o */
    public String f186554o;

    /* renamed from: p */
    public int f186555p;

    /* renamed from: q */
    public int f186556q;

    /* renamed from: r */
    public C89349b f186557r;

    /* renamed from: s */
    public int f186558s;

    /* renamed from: t */
    public int f186559t;

    /* renamed from: u */
    public String f186560u;

    /* renamed from: v */
    public String f186561v;

    /* renamed from: w */
    public String f186562w;

    /* renamed from: x */
    public int f186563x;

    /* renamed from: y */
    public C48896br0 f186564y;

    /* renamed from: z */
    public int f186565z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64858yi1)) {
            return false;
        }
        C64858yi1 yi12 = (C64858yi1) aVar;
        return C46238a.m51546a(this.f186546d, yi12.f186546d) && C46238a.m51546a(this.f186547e, yi12.f186547e) && C46238a.m51546a(Integer.valueOf(this.f186548f), Integer.valueOf(yi12.f186548f)) && C46238a.m51546a(Long.valueOf(this.f186549g), Long.valueOf(yi12.f186549g)) && C46238a.m51546a(Integer.valueOf(this.f186550h), Integer.valueOf(yi12.f186550h)) && C46238a.m51546a(Integer.valueOf(this.f186551i), Integer.valueOf(yi12.f186551i)) && C46238a.m51546a(Long.valueOf(this.f186552j), Long.valueOf(yi12.f186552j)) && C46238a.m51546a(this.f186553n, yi12.f186553n) && C46238a.m51546a(this.f186554o, yi12.f186554o) && C46238a.m51546a(Integer.valueOf(this.f186555p), Integer.valueOf(yi12.f186555p)) && C46238a.m51546a(Integer.valueOf(this.f186556q), Integer.valueOf(yi12.f186556q)) && C46238a.m51546a(this.f186557r, yi12.f186557r) && C46238a.m51546a(Integer.valueOf(this.f186558s), Integer.valueOf(yi12.f186558s)) && C46238a.m51546a(Integer.valueOf(this.f186559t), Integer.valueOf(yi12.f186559t)) && C46238a.m51546a(this.f186560u, yi12.f186560u) && C46238a.m51546a(this.f186561v, yi12.f186561v) && C46238a.m51546a(this.f186562w, yi12.f186562w) && C46238a.m51546a(Integer.valueOf(this.f186563x), Integer.valueOf(yi12.f186563x)) && C46238a.m51546a(this.f186564y, yi12.f186564y) && C46238a.m51546a(Integer.valueOf(this.f186565z), Integer.valueOf(yi12.f186565z)) && C46238a.m51546a(this.f186539A, yi12.f186539A) && C46238a.m51546a(Integer.valueOf(this.f186540B), Integer.valueOf(yi12.f186540B)) && C46238a.m51546a(Integer.valueOf(this.f186541C), Integer.valueOf(yi12.f186541C)) && C46238a.m51546a(this.f186542D, yi12.f186542D) && C46238a.m51546a(this.f186543E, yi12.f186543E) && C46238a.m51546a(Integer.valueOf(this.f186544F), Integer.valueOf(yi12.f186544F)) && C46238a.m51546a(Integer.valueOf(this.f186545G), Integer.valueOf(yi12.f186545G));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186546d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186547e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f186548f);
            aVar.mo74321h(4, this.f186549g);
            aVar.mo74318e(5, this.f186550h);
            aVar.mo74318e(6, this.f186551i);
            aVar.mo74321h(7, this.f186552j);
            C89349b bVar = this.f186553n;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            String str3 = this.f186554o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74318e(10, this.f186555p);
            aVar.mo74318e(11, this.f186556q);
            C89349b bVar2 = this.f186557r;
            if (bVar2 != null) {
                aVar.mo74315b(12, bVar2);
            }
            aVar.mo74318e(13, this.f186558s);
            aVar.mo74318e(14, this.f186559t);
            String str4 = this.f186560u;
            if (str4 != null) {
                aVar.mo74323j(15, str4);
            }
            String str5 = this.f186561v;
            if (str5 != null) {
                aVar.mo74323j(16, str5);
            }
            String str6 = this.f186562w;
            if (str6 != null) {
                aVar.mo74323j(17, str6);
            }
            aVar.mo74318e(18, this.f186563x);
            C48896br0 br02 = this.f186564y;
            if (br02 != null) {
                aVar.mo74322i(19, br02.computeSize());
                this.f186564y.writeFields(aVar);
            }
            aVar.mo74318e(22, this.f186565z);
            FinderJumpInfo finderJumpInfo = this.f186539A;
            if (finderJumpInfo != null) {
                aVar.mo74322i(23, finderJumpInfo.computeSize());
                this.f186539A.writeFields(aVar);
            }
            aVar.mo74318e(24, this.f186540B);
            aVar.mo74318e(25, this.f186541C);
            C48883bn1 bn12 = this.f186542D;
            if (bn12 != null) {
                aVar.mo74322i(26, bn12.computeSize());
                this.f186542D.writeFields(aVar);
            }
            C49258eb1 eb12 = this.f186543E;
            if (eb12 != null) {
                aVar.mo74322i(27, eb12.computeSize());
                this.f186543E.writeFields(aVar);
            }
            aVar.mo74318e(28, this.f186544F);
            aVar.mo74318e(29, this.f186545G);
            return 0;
        } else if (i2 == 1) {
            String str7 = this.f186546d;
            if (str7 != null) {
                i3 = C52418a.m58683j(1, str7) + 0;
            }
            String str8 = this.f186547e;
            if (str8 != null) {
                i3 += C52418a.m58683j(2, str8);
            }
            int e = i3 + C52418a.m58678e(3, this.f186548f) + C52418a.m58681h(4, this.f186549g) + C52418a.m58678e(5, this.f186550h) + C52418a.m58678e(6, this.f186551i) + C52418a.m58681h(7, this.f186552j);
            C89349b bVar3 = this.f186553n;
            if (bVar3 != null) {
                e += C52418a.m58675b(8, bVar3);
            }
            String str9 = this.f186554o;
            if (str9 != null) {
                e += C52418a.m58683j(9, str9);
            }
            int e2 = e + C52418a.m58678e(10, this.f186555p) + C52418a.m58678e(11, this.f186556q);
            C89349b bVar4 = this.f186557r;
            if (bVar4 != null) {
                e2 += C52418a.m58675b(12, bVar4);
            }
            int e3 = e2 + C52418a.m58678e(13, this.f186558s) + C52418a.m58678e(14, this.f186559t);
            String str10 = this.f186560u;
            if (str10 != null) {
                e3 += C52418a.m58683j(15, str10);
            }
            String str11 = this.f186561v;
            if (str11 != null) {
                e3 += C52418a.m58683j(16, str11);
            }
            String str12 = this.f186562w;
            if (str12 != null) {
                e3 += C52418a.m58683j(17, str12);
            }
            int e4 = e3 + C52418a.m58678e(18, this.f186563x);
            C48896br0 br03 = this.f186564y;
            if (br03 != null) {
                e4 += C52418a.m58682i(19, br03.computeSize());
            }
            int e5 = e4 + C52418a.m58678e(22, this.f186565z);
            FinderJumpInfo finderJumpInfo2 = this.f186539A;
            if (finderJumpInfo2 != null) {
                e5 += C52418a.m58682i(23, finderJumpInfo2.computeSize());
            }
            int e6 = e5 + C52418a.m58678e(24, this.f186540B) + C52418a.m58678e(25, this.f186541C);
            C48883bn1 bn13 = this.f186542D;
            if (bn13 != null) {
                e6 += C52418a.m58682i(26, bn13.computeSize());
            }
            C49258eb1 eb13 = this.f186543E;
            if (eb13 != null) {
                e6 += C52418a.m58682i(27, eb13.computeSize());
            }
            return e6 + C52418a.m58678e(28, this.f186544F) + C52418a.m58678e(29, this.f186545G);
        } else if (i2 == 2) {
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
            C64858yi1 yi12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yi12.f186546d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    yi12.f186547e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    yi12.f186548f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    yi12.f186549g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    yi12.f186550h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    yi12.f186551i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    yi12.f186552j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    yi12.f186553n = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    yi12.f186554o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    yi12.f186555p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    yi12.f186556q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    yi12.f186557r = aVar3.mo141626d(intValue);
                    return 0;
                case 13:
                    yi12.f186558s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    yi12.f186559t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    yi12.f186560u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    yi12.f186561v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    yi12.f186562w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    yi12.f186563x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C48896br0 br04 = new C48896br0();
                        if (bArr != null && bArr.length > 0) {
                            br04.parseFrom(bArr);
                        }
                        yi12.f186564y = br04;
                    }
                    return 0;
                case 22:
                    yi12.f186565z = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        FinderJumpInfo finderJumpInfo3 = new FinderJumpInfo();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderJumpInfo3.parseFrom(bArr2);
                        }
                        yi12.f186539A = finderJumpInfo3;
                    }
                    return 0;
                case 24:
                    yi12.f186540B = aVar3.mo141629g(intValue);
                    return 0;
                case 25:
                    yi12.f186541C = aVar3.mo141629g(intValue);
                    return 0;
                case 26:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C48883bn1 bn14 = new C48883bn1();
                        if (bArr3 != null && bArr3.length > 0) {
                            bn14.parseFrom(bArr3);
                        }
                        yi12.f186542D = bn14;
                    }
                    return 0;
                case 27:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C49258eb1 eb14 = new C49258eb1();
                        if (bArr4 != null && bArr4.length > 0) {
                            eb14.parseFrom(bArr4);
                        }
                        yi12.f186543E = eb14;
                    }
                    return 0;
                case 28:
                    yi12.f186544F = aVar3.mo141629g(intValue);
                    return 0;
                case 29:
                    yi12.f186545G = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
