package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ij4 extends C49335eu3 {

    /* renamed from: d */
    public int f135419d;

    /* renamed from: e */
    public String f135420e;

    /* renamed from: f */
    public boolean f135421f;

    /* renamed from: g */
    public boolean f135422g;

    /* renamed from: h */
    public String f135423h;

    /* renamed from: i */
    public String f135424i;

    /* renamed from: j */
    public boolean f135425j;

    /* renamed from: n */
    public C52036xy f135426n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ij4)) {
            return false;
        }
        ij4 ij4 = (ij4) aVar;
        return C46238a.m51546a(this.BaseResponse, ij4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f135419d), Integer.valueOf(ij4.f135419d)) && C46238a.m51546a(this.f135420e, ij4.f135420e) && C46238a.m51546a(Boolean.valueOf(this.f135421f), Boolean.valueOf(ij4.f135421f)) && C46238a.m51546a(Boolean.valueOf(this.f135422g), Boolean.valueOf(ij4.f135422g)) && C46238a.m51546a(this.f135423h, ij4.f135423h) && C46238a.m51546a(this.f135424i, ij4.f135424i) && C46238a.m51546a(Boolean.valueOf(this.f135425j), Boolean.valueOf(ij4.f135425j)) && C46238a.m51546a(this.f135426n, ij4.f135426n);
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
            aVar.mo74318e(2, this.f135419d);
            String str = this.f135420e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74314a(4, this.f135421f);
            aVar.mo74314a(5, this.f135422g);
            String str2 = this.f135423h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f135424i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74314a(11, this.f135425j);
            C52036xy xyVar = this.f135426n;
            if (xyVar != null) {
                aVar.mo74322i(12, xyVar.computeSize());
                this.f135426n.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f135419d);
            String str4 = this.f135420e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            int a = e + C52418a.m58674a(4, this.f135421f) + C52418a.m58674a(5, this.f135422g);
            String str5 = this.f135423h;
            if (str5 != null) {
                a += C52418a.m58683j(6, str5);
            }
            String str6 = this.f135424i;
            if (str6 != null) {
                a += C52418a.m58683j(7, str6);
            }
            int a2 = a + C52418a.m58674a(11, this.f135425j);
            C52036xy xyVar2 = this.f135426n;
            return xyVar2 != null ? a2 + C52418a.m58682i(12, xyVar2.computeSize()) : a2;
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
            ij4 ij4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 11) {
                ij4.f135425j = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 12) {
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
                            ij4.BaseResponse = jaVar3;
                        }
                        return 0;
                    case 2:
                        ij4.f135419d = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        ij4.f135420e = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        ij4.f135421f = aVar3.mo141625c(intValue);
                        return 0;
                    case 5:
                        ij4.f135422g = aVar3.mo141625c(intValue);
                        return 0;
                    case 6:
                        ij4.f135423h = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        ij4.f135424i = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52036xy xyVar3 = new C52036xy();
                    if (bArr2 != null && bArr2.length > 0) {
                        xyVar3.parseFrom(bArr2);
                    }
                    ij4.f135426n = xyVar3;
                }
                return 0;
            }
        }
    }
}
