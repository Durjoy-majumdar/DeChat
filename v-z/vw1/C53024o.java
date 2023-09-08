package vw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.o */
public class C53024o extends C49335eu3 {

    /* renamed from: d */
    public int f148005d;

    /* renamed from: e */
    public String f148006e;

    /* renamed from: f */
    public String f148007f;

    /* renamed from: g */
    public LinkedList<C53012e0> f148008g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53024o)) {
            return false;
        }
        C53024o oVar = (C53024o) aVar;
        return C46238a.m51546a(this.BaseResponse, oVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f148005d), Integer.valueOf(oVar.f148005d)) && C46238a.m51546a(this.f148006e, oVar.f148006e) && C46238a.m51546a(this.f148007f, oVar.f148007f) && C46238a.m51546a(this.f148008g, oVar.f148008g);
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
                aVar.mo74318e(2, this.f148005d);
                String str = this.f148006e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f148007f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74320g(5, 8, this.f148008g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f148005d);
            String str3 = this.f148006e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f148007f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58680g(5, 8, this.f148008g);
        } else if (i == 2) {
            this.f148008g.clear();
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
            C53024o oVar = objArr[1];
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
                    oVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                oVar.f148005d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                oVar.f148006e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                oVar.f148007f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C53012e0 e0Var = new C53012e0();
                    if (bArr2 != null && bArr2.length > 0) {
                        e0Var.parseFrom(bArr2);
                    }
                    oVar.f148008g.add(e0Var);
                }
                return 0;
            }
        }
    }
}
