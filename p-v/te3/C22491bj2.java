package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bj2 */
public class C22491bj2 extends C47465a {

    /* renamed from: d */
    public String f63727d;

    /* renamed from: e */
    public String f63728e;

    /* renamed from: f */
    public String f63729f;

    /* renamed from: g */
    public String f63730g;

    /* renamed from: h */
    public String f63731h;

    /* renamed from: i */
    public String f63732i;

    /* renamed from: j */
    public int f63733j;

    /* renamed from: n */
    public int f63734n;

    /* renamed from: o */
    public mr4 f63735o;

    /* renamed from: p */
    public kt4 f63736p;

    /* renamed from: q */
    public C51381td3 f63737q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22491bj2)) {
            return false;
        }
        C22491bj2 bj22 = (C22491bj2) aVar;
        return C46238a.m51546a(this.f63727d, bj22.f63727d) && C46238a.m51546a(this.f63728e, bj22.f63728e) && C46238a.m51546a(this.f63729f, bj22.f63729f) && C46238a.m51546a(this.f63730g, bj22.f63730g) && C46238a.m51546a(this.f63731h, bj22.f63731h) && C46238a.m51546a(this.f63732i, bj22.f63732i) && C46238a.m51546a(Integer.valueOf(this.f63733j), Integer.valueOf(bj22.f63733j)) && C46238a.m51546a(Integer.valueOf(this.f63734n), Integer.valueOf(bj22.f63734n)) && C46238a.m51546a(this.f63735o, bj22.f63735o) && C46238a.m51546a(this.f63736p, bj22.f63736p) && C46238a.m51546a(this.f63737q, bj22.f63737q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f63727d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f63728e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f63729f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f63730g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f63731h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f63732i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            aVar.mo74318e(7, this.f63733j);
            aVar.mo74318e(8, this.f63734n);
            mr4 mr4 = this.f63735o;
            if (mr4 != null) {
                aVar.mo74322i(9, mr4.computeSize());
                this.f63735o.writeFields(aVar);
            }
            kt4 kt4 = this.f63736p;
            if (kt4 != null) {
                aVar.mo74322i(10, kt4.computeSize());
                this.f63736p.writeFields(aVar);
            }
            C51381td3 td32 = this.f63737q;
            if (td32 != null) {
                aVar.mo74322i(11, td32.computeSize());
                this.f63737q.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f63727d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f63728e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f63729f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f63730g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f63731h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f63732i;
            if (str12 != null) {
                i2 += C52418a.m58683j(6, str12);
            }
            int e = i2 + C52418a.m58678e(7, this.f63733j) + C52418a.m58678e(8, this.f63734n);
            mr4 mr42 = this.f63735o;
            if (mr42 != null) {
                e += C52418a.m58682i(9, mr42.computeSize());
            }
            kt4 kt42 = this.f63736p;
            if (kt42 != null) {
                e += C52418a.m58682i(10, kt42.computeSize());
            }
            C51381td3 td33 = this.f63737q;
            return td33 != null ? e + C52418a.m58682i(11, td33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C22491bj2 bj22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bj22.f63727d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    bj22.f63728e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bj22.f63729f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bj22.f63730g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bj22.f63731h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bj22.f63732i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bj22.f63733j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    bj22.f63734n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        mr4 mr43 = new mr4();
                        if (bArr != null && bArr.length > 0) {
                            mr43.parseFrom(bArr);
                        }
                        bj22.f63735o = mr43;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        kt4 kt43 = new kt4();
                        if (bArr2 != null && bArr2.length > 0) {
                            kt43.parseFrom(bArr2);
                        }
                        bj22.f63736p = kt43;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51381td3 td34 = new C51381td3();
                        if (bArr3 != null && bArr3.length > 0) {
                            td34.parseFrom(bArr3);
                        }
                        bj22.f63737q = td34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
