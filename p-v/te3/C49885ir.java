package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ir */
public class C49885ir extends C49335eu3 {

    /* renamed from: d */
    public int f135596d;

    /* renamed from: e */
    public String f135597e;

    /* renamed from: f */
    public String f135598f;

    /* renamed from: g */
    public int f135599g;

    /* renamed from: h */
    public C50298lr f135600h;

    /* renamed from: i */
    public String f135601i;

    /* renamed from: j */
    public String f135602j;

    /* renamed from: n */
    public String f135603n;

    /* renamed from: o */
    public String f135604o;

    /* renamed from: p */
    public String f135605p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49885ir)) {
            return false;
        }
        C49885ir irVar = (C49885ir) aVar;
        return C46238a.m51546a(this.BaseResponse, irVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f135596d), Integer.valueOf(irVar.f135596d)) && C46238a.m51546a(this.f135597e, irVar.f135597e) && C46238a.m51546a(this.f135598f, irVar.f135598f) && C46238a.m51546a(Integer.valueOf(this.f135599g), Integer.valueOf(irVar.f135599g)) && C46238a.m51546a(this.f135600h, irVar.f135600h) && C46238a.m51546a(this.f135601i, irVar.f135601i) && C46238a.m51546a(this.f135602j, irVar.f135602j) && C46238a.m51546a(this.f135603n, irVar.f135603n) && C46238a.m51546a(this.f135604o, irVar.f135604o) && C46238a.m51546a(this.f135605p, irVar.f135605p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f135596d);
            String str = this.f135597e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f135598f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f135599g);
            C50298lr lrVar = this.f135600h;
            if (lrVar != null) {
                aVar.mo74322i(6, lrVar.computeSize());
                this.f135600h.writeFields(aVar);
            }
            String str3 = this.f135601i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f135602j;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f135603n;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            String str6 = this.f135604o;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            String str7 = this.f135605p;
            if (str7 != null) {
                aVar.mo74323j(11, str7);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f135596d);
            String str8 = this.f135597e;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            String str9 = this.f135598f;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            int e2 = e + C52418a.m58678e(5, this.f135599g);
            C50298lr lrVar2 = this.f135600h;
            if (lrVar2 != null) {
                e2 += C52418a.m58682i(6, lrVar2.computeSize());
            }
            String str10 = this.f135601i;
            if (str10 != null) {
                e2 += C52418a.m58683j(7, str10);
            }
            String str11 = this.f135602j;
            if (str11 != null) {
                e2 += C52418a.m58683j(8, str11);
            }
            String str12 = this.f135603n;
            if (str12 != null) {
                e2 += C52418a.m58683j(9, str12);
            }
            String str13 = this.f135604o;
            if (str13 != null) {
                e2 += C52418a.m58683j(10, str13);
            }
            String str14 = this.f135605p;
            return str14 != null ? e2 + C52418a.m58683j(11, str14) : e2;
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
            C49885ir irVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        irVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    irVar.f135596d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    irVar.f135597e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    irVar.f135598f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    irVar.f135599g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50298lr lrVar3 = new C50298lr();
                        if (bArr2 != null && bArr2.length > 0) {
                            lrVar3.parseFrom(bArr2);
                        }
                        irVar.f135600h = lrVar3;
                    }
                    return 0;
                case 7:
                    irVar.f135601i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    irVar.f135602j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    irVar.f135603n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    irVar.f135604o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    irVar.f135605p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
