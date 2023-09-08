package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o60 */
public class C50638o60 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C50221l60> f138975d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<String> f138976e = new LinkedList<>();

    /* renamed from: f */
    public boolean f138977f;

    /* renamed from: g */
    public int f138978g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50638o60)) {
            return false;
        }
        C50638o60 o602 = (C50638o60) aVar;
        return C46238a.m51546a(this.BaseResponse, o602.BaseResponse) && C46238a.m51546a(this.f138975d, o602.f138975d) && C46238a.m51546a(this.f138976e, o602.f138976e) && C46238a.m51546a(Boolean.valueOf(this.f138977f), Boolean.valueOf(o602.f138977f)) && C46238a.m51546a(Integer.valueOf(this.f138978g), Integer.valueOf(o602.f138978g));
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
            aVar.mo74320g(2, 8, this.f138975d);
            aVar.mo74320g(3, 1, this.f138976e);
            aVar.mo74314a(4, this.f138977f);
            aVar.mo74318e(5, this.f138978g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f138975d) + C52418a.m58680g(3, 1, this.f138976e) + C52418a.m58674a(4, this.f138977f) + C52418a.m58678e(5, this.f138978g);
        } else if (i == 2) {
            this.f138975d.clear();
            this.f138976e.clear();
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
            C50638o60 o602 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    o602.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50221l60 l602 = new C50221l60();
                    if (bArr2 != null && bArr2.length > 0) {
                        l602.parseFrom(bArr2);
                    }
                    o602.f138975d.add(l602);
                }
                return 0;
            } else if (intValue == 3) {
                o602.f138976e.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 4) {
                o602.f138977f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                o602.f138978g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
