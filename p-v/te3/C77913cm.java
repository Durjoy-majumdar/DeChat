package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cm */
public class C77913cm extends C49335eu3 {

    /* renamed from: d */
    public int f227132d;

    /* renamed from: e */
    public String f227133e;

    /* renamed from: f */
    public C77942hl2 f227134f;

    /* renamed from: g */
    public String f227135g;

    /* renamed from: h */
    public String f227136h;

    /* renamed from: i */
    public String f227137i;

    /* renamed from: j */
    public String f227138j;

    /* renamed from: n */
    public String f227139n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77913cm)) {
            return false;
        }
        C77913cm cmVar = (C77913cm) aVar;
        return C46238a.m51546a(this.BaseResponse, cmVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f227132d), Integer.valueOf(cmVar.f227132d)) && C46238a.m51546a(this.f227133e, cmVar.f227133e) && C46238a.m51546a(this.f227134f, cmVar.f227134f) && C46238a.m51546a(this.f227135g, cmVar.f227135g) && C46238a.m51546a(this.f227136h, cmVar.f227136h) && C46238a.m51546a(this.f227137i, cmVar.f227137i) && C46238a.m51546a(this.f227138j, cmVar.f227138j) && C46238a.m51546a(this.f227139n, cmVar.f227139n);
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
            aVar.mo74318e(2, this.f227132d);
            String str = this.f227133e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C77942hl2 hl22 = this.f227134f;
            if (hl22 != null) {
                aVar.mo74322i(4, hl22.computeSize());
                this.f227134f.writeFields(aVar);
            }
            String str2 = this.f227135g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f227136h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f227137i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f227138j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f227139n;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f227132d);
            String str7 = this.f227133e;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            C77942hl2 hl23 = this.f227134f;
            if (hl23 != null) {
                e += C52418a.m58682i(4, hl23.computeSize());
            }
            String str8 = this.f227135g;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            String str9 = this.f227136h;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f227137i;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            String str11 = this.f227138j;
            if (str11 != null) {
                e += C52418a.m58683j(8, str11);
            }
            String str12 = this.f227139n;
            return str12 != null ? e + C52418a.m58683j(9, str12) : e;
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
            C77913cm cmVar = objArr[1];
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
                        cmVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    cmVar.f227132d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    cmVar.f227133e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77942hl2 hl24 = new C77942hl2();
                        if (bArr2 != null && bArr2.length > 0) {
                            hl24.parseFrom(bArr2);
                        }
                        cmVar.f227134f = hl24;
                    }
                    return 0;
                case 5:
                    cmVar.f227135g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cmVar.f227136h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    cmVar.f227137i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    cmVar.f227138j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    cmVar.f227139n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
