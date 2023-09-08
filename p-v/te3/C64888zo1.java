package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zo1 */
public class C64888zo1 extends C47465a {

    /* renamed from: A */
    public String f186756A;

    /* renamed from: B */
    public boolean f186757B;

    /* renamed from: d */
    public FinderObject f186758d;

    /* renamed from: e */
    public String f186759e;

    /* renamed from: f */
    public String f186760f;

    /* renamed from: g */
    public String f186761g;

    /* renamed from: h */
    public int f186762h;

    /* renamed from: i */
    public String f186763i;

    /* renamed from: j */
    public String f186764j;

    /* renamed from: n */
    public String f186765n;

    /* renamed from: o */
    public boolean f186766o;

    /* renamed from: p */
    public int f186767p;

    /* renamed from: q */
    public String f186768q;

    /* renamed from: r */
    public long f186769r;

    /* renamed from: s */
    public long f186770s;

    /* renamed from: t */
    public int f186771t;

    /* renamed from: u */
    public int f186772u;

    /* renamed from: v */
    public int f186773v;

    /* renamed from: w */
    public int f186774w;

    /* renamed from: x */
    public boolean f186775x;

    /* renamed from: y */
    public double f186776y;

    /* renamed from: z */
    public boolean f186777z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64888zo1)) {
            return false;
        }
        C64888zo1 zo12 = (C64888zo1) aVar;
        return C46238a.m51546a(this.f186758d, zo12.f186758d) && C46238a.m51546a(this.f186759e, zo12.f186759e) && C46238a.m51546a(this.f186760f, zo12.f186760f) && C46238a.m51546a(this.f186761g, zo12.f186761g) && C46238a.m51546a(Integer.valueOf(this.f186762h), Integer.valueOf(zo12.f186762h)) && C46238a.m51546a(this.f186763i, zo12.f186763i) && C46238a.m51546a(this.f186764j, zo12.f186764j) && C46238a.m51546a(this.f186765n, zo12.f186765n) && C46238a.m51546a(Boolean.valueOf(this.f186766o), Boolean.valueOf(zo12.f186766o)) && C46238a.m51546a(Integer.valueOf(this.f186767p), Integer.valueOf(zo12.f186767p)) && C46238a.m51546a(this.f186768q, zo12.f186768q) && C46238a.m51546a(Long.valueOf(this.f186769r), Long.valueOf(zo12.f186769r)) && C46238a.m51546a(Long.valueOf(this.f186770s), Long.valueOf(zo12.f186770s)) && C46238a.m51546a(Integer.valueOf(this.f186771t), Integer.valueOf(zo12.f186771t)) && C46238a.m51546a(Integer.valueOf(this.f186772u), Integer.valueOf(zo12.f186772u)) && C46238a.m51546a(Integer.valueOf(this.f186773v), Integer.valueOf(zo12.f186773v)) && C46238a.m51546a(Integer.valueOf(this.f186774w), Integer.valueOf(zo12.f186774w)) && C46238a.m51546a(Boolean.valueOf(this.f186775x), Boolean.valueOf(zo12.f186775x)) && C46238a.m51546a(Double.valueOf(this.f186776y), Double.valueOf(zo12.f186776y)) && C46238a.m51546a(Boolean.valueOf(this.f186777z), Boolean.valueOf(zo12.f186777z)) && C46238a.m51546a(this.f186756A, zo12.f186756A) && C46238a.m51546a(Boolean.valueOf(this.f186757B), Boolean.valueOf(zo12.f186757B));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            FinderObject finderObject = this.f186758d;
            if (finderObject != null) {
                aVar.mo74322i(1, finderObject.computeSize());
                this.f186758d.writeFields(aVar);
            }
            String str = this.f186759e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f186760f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f186761g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f186762h);
            String str4 = this.f186763i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f186764j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f186765n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            aVar.mo74314a(9, this.f186766o);
            aVar.mo74318e(10, this.f186767p);
            String str7 = this.f186768q;
            if (str7 != null) {
                aVar.mo74323j(11, str7);
            }
            aVar.mo74321h(12, this.f186769r);
            aVar.mo74321h(13, this.f186770s);
            aVar.mo74318e(14, this.f186771t);
            aVar.mo74318e(15, this.f186772u);
            aVar.mo74318e(16, this.f186773v);
            aVar.mo74318e(17, this.f186774w);
            aVar.mo74314a(18, this.f186775x);
            aVar.mo74316c(19, this.f186776y);
            aVar.mo74314a(20, this.f186777z);
            String str8 = this.f186756A;
            if (str8 != null) {
                aVar.mo74323j(21, str8);
            }
            aVar.mo74314a(22, this.f186757B);
            return 0;
        } else if (i2 == 1) {
            FinderObject finderObject2 = this.f186758d;
            if (finderObject2 != null) {
                i3 = C52418a.m58682i(1, finderObject2.computeSize()) + 0;
            }
            String str9 = this.f186759e;
            if (str9 != null) {
                i3 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f186760f;
            if (str10 != null) {
                i3 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f186761g;
            if (str11 != null) {
                i3 += C52418a.m58683j(4, str11);
            }
            int e = i3 + C52418a.m58678e(5, this.f186762h);
            String str12 = this.f186763i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            String str13 = this.f186764j;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            String str14 = this.f186765n;
            if (str14 != null) {
                e += C52418a.m58683j(8, str14);
            }
            int a = e + C52418a.m58674a(9, this.f186766o) + C52418a.m58678e(10, this.f186767p);
            String str15 = this.f186768q;
            if (str15 != null) {
                a += C52418a.m58683j(11, str15);
            }
            int h = a + C52418a.m58681h(12, this.f186769r) + C52418a.m58681h(13, this.f186770s) + C52418a.m58678e(14, this.f186771t) + C52418a.m58678e(15, this.f186772u) + C52418a.m58678e(16, this.f186773v) + C52418a.m58678e(17, this.f186774w) + C52418a.m58674a(18, this.f186775x) + C52418a.m58676c(19, this.f186776y) + C52418a.m58674a(20, this.f186777z);
            String str16 = this.f186756A;
            if (str16 != null) {
                h += C52418a.m58683j(21, str16);
            }
            return h + C52418a.m58674a(22, this.f186757B);
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
            C64888zo1 zo12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        FinderObject finderObject3 = new FinderObject();
                        if (bArr != null && bArr.length > 0) {
                            finderObject3.parseFrom(bArr);
                        }
                        zo12.f186758d = finderObject3;
                    }
                    return 0;
                case 2:
                    zo12.f186759e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    zo12.f186760f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zo12.f186761g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zo12.f186762h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    zo12.f186763i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    zo12.f186764j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    zo12.f186765n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    zo12.f186766o = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    zo12.f186767p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    zo12.f186768q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    zo12.f186769r = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    zo12.f186770s = aVar3.mo141631i(intValue);
                    return 0;
                case 14:
                    zo12.f186771t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    zo12.f186772u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    zo12.f186773v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    zo12.f186774w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    zo12.f186775x = aVar3.mo141625c(intValue);
                    return 0;
                case 19:
                    zo12.f186776y = aVar3.mo141627e(intValue);
                    return 0;
                case 20:
                    zo12.f186777z = aVar3.mo141625c(intValue);
                    return 0;
                case 21:
                    zo12.f186756A = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    zo12.f186757B = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
