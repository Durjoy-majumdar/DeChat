package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a11 */
public class C48648a11 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C51280sp2> f130203d = new LinkedList<>();

    /* renamed from: e */
    public long f130204e;

    /* renamed from: f */
    public long f130205f;

    /* renamed from: g */
    public boolean f130206g;

    /* renamed from: h */
    public boolean f130207h;

    /* renamed from: i */
    public String f130208i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48648a11)) {
            return false;
        }
        C48648a11 a112 = (C48648a11) aVar;
        return C46238a.m51546a(this.BaseResponse, a112.BaseResponse) && C46238a.m51546a(this.f130203d, a112.f130203d) && C46238a.m51546a(Long.valueOf(this.f130204e), Long.valueOf(a112.f130204e)) && C46238a.m51546a(Long.valueOf(this.f130205f), Long.valueOf(a112.f130205f)) && C46238a.m51546a(Boolean.valueOf(this.f130206g), Boolean.valueOf(a112.f130206g)) && C46238a.m51546a(Boolean.valueOf(this.f130207h), Boolean.valueOf(a112.f130207h)) && C46238a.m51546a(this.f130208i, a112.f130208i);
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
            aVar.mo74320g(2, 8, this.f130203d);
            aVar.mo74321h(3, this.f130204e);
            aVar.mo74321h(4, this.f130205f);
            aVar.mo74314a(5, this.f130206g);
            aVar.mo74314a(6, this.f130207h);
            String str = this.f130208i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f130203d) + C52418a.m58681h(3, this.f130204e) + C52418a.m58681h(4, this.f130205f) + C52418a.m58674a(5, this.f130206g) + C52418a.m58674a(6, this.f130207h);
            String str2 = this.f130208i;
            return str2 != null ? g + C52418a.m58683j(7, str2) : g;
        } else if (i == 2) {
            this.f130203d.clear();
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
            C48648a11 a112 = objArr[1];
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
                        a112.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51280sp2 sp22 = new C51280sp2();
                        if (bArr2 != null && bArr2.length > 0) {
                            sp22.parseFrom(bArr2);
                        }
                        a112.f130203d.add(sp22);
                    }
                    return 0;
                case 3:
                    a112.f130204e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    a112.f130205f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    a112.f130206g = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    a112.f130207h = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    a112.f130208i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
