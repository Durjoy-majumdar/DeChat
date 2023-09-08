package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ny1 */
public class C64595ny1 extends C49335eu3 {

    /* renamed from: d */
    public long f184580d;

    /* renamed from: e */
    public String f184581e;

    /* renamed from: f */
    public boolean f184582f;

    /* renamed from: g */
    public long f184583g;

    /* renamed from: h */
    public String f184584h;

    /* renamed from: i */
    public LinkedList<C22517nn> f184585i = new LinkedList<>();

    /* renamed from: j */
    public C64597o00 f184586j;

    /* renamed from: n */
    public C64597o00 f184587n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64595ny1)) {
            return false;
        }
        C64595ny1 ny12 = (C64595ny1) aVar;
        return C46238a.m51546a(this.BaseResponse, ny12.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f184580d), Long.valueOf(ny12.f184580d)) && C46238a.m51546a(this.f184581e, ny12.f184581e) && C46238a.m51546a(Boolean.valueOf(this.f184582f), Boolean.valueOf(ny12.f184582f)) && C46238a.m51546a(Long.valueOf(this.f184583g), Long.valueOf(ny12.f184583g)) && C46238a.m51546a(this.f184584h, ny12.f184584h) && C46238a.m51546a(this.f184585i, ny12.f184585i) && C46238a.m51546a(this.f184586j, ny12.f184586j) && C46238a.m51546a(this.f184587n, ny12.f184587n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74321h(2, this.f184580d);
                String str = this.f184581e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74314a(4, this.f184582f);
                aVar.mo74321h(5, this.f184583g);
                String str2 = this.f184584h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                aVar.mo74320g(7, 8, this.f184585i);
                C64597o00 o002 = this.f184586j;
                if (o002 != null) {
                    aVar.mo74322i(8, o002.computeSize());
                    this.f184586j.writeFields(aVar);
                }
                C64597o00 o003 = this.f184587n;
                if (o003 != null) {
                    aVar.mo74322i(9, o003.computeSize());
                    this.f184587n.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f184580d);
            String str3 = this.f184581e;
            if (str3 != null) {
                h += C52418a.m58683j(3, str3);
            }
            int a = h + C52418a.m58674a(4, this.f184582f) + C52418a.m58681h(5, this.f184583g);
            String str4 = this.f184584h;
            if (str4 != null) {
                a += C52418a.m58683j(6, str4);
            }
            int g = a + C52418a.m58680g(7, 8, this.f184585i);
            C64597o00 o004 = this.f184586j;
            if (o004 != null) {
                g += C52418a.m58682i(8, o004.computeSize());
            }
            C64597o00 o005 = this.f184587n;
            return o005 != null ? g + C52418a.m58682i(9, o005.computeSize()) : g;
        } else if (i == 2) {
            this.f184585i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64595ny1 ny12 = objArr[1];
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
                        ny12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ny12.f184580d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    ny12.f184581e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ny12.f184582f = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    ny12.f184583g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ny12.f184584h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C22517nn nnVar = new C22517nn();
                        if (bArr2 != null && bArr2.length > 0) {
                            nnVar.parseFrom(bArr2);
                        }
                        ny12.f184585i.add(nnVar);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64597o00 o006 = new C64597o00();
                        if (bArr3 != null && bArr3.length > 0) {
                            o006.parseFrom(bArr3);
                        }
                        ny12.f184586j = o006;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C64597o00 o007 = new C64597o00();
                        if (bArr4 != null && bArr4.length > 0) {
                            o007.parseFrom(bArr4);
                        }
                        ny12.f184587n = o007;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
