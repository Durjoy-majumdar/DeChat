package uw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uw1.b */
public class C52624b extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C52628f> f146932d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C52628f> f146933e = new LinkedList<>();

    /* renamed from: f */
    public C89349b f146934f;

    /* renamed from: g */
    public boolean f146935g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52624b)) {
            return false;
        }
        C52624b bVar = (C52624b) aVar;
        return C46238a.m51546a(this.BaseResponse, bVar.BaseResponse) && C46238a.m51546a(this.f146932d, bVar.f146932d) && C46238a.m51546a(this.f146933e, bVar.f146933e) && C46238a.m51546a(this.f146934f, bVar.f146934f) && C46238a.m51546a(Boolean.valueOf(this.f146935g), Boolean.valueOf(bVar.f146935g));
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
            aVar.mo74320g(2, 8, this.f146932d);
            aVar.mo74320g(3, 8, this.f146933e);
            C89349b bVar = this.f146934f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74314a(5, this.f146935g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f146932d) + C52418a.m58680g(3, 8, this.f146933e);
            C89349b bVar2 = this.f146934f;
            if (bVar2 != null) {
                g += C52418a.m58675b(4, bVar2);
            }
            return g + C52418a.m58674a(5, this.f146935g);
        } else if (i == 2) {
            this.f146932d.clear();
            this.f146933e.clear();
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
            C52624b bVar3 = objArr[1];
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
                    bVar3.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52628f fVar = new C52628f();
                    if (bArr2 != null && bArr2.length > 0) {
                        fVar.parseFrom(bArr2);
                    }
                    bVar3.f146932d.add(fVar);
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C52628f fVar2 = new C52628f();
                    if (bArr3 != null && bArr3.length > 0) {
                        fVar2.parseFrom(bArr3);
                    }
                    bVar3.f146933e.add(fVar2);
                }
                return 0;
            } else if (intValue == 4) {
                bVar3.f146934f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                bVar3.f146935g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
