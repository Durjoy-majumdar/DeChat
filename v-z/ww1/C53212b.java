package ww1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ww1.b */
public class C53212b extends C49335eu3 {

    /* renamed from: d */
    public int f148439d;

    /* renamed from: e */
    public String f148440e;

    /* renamed from: f */
    public String f148441f;

    /* renamed from: g */
    public String f148442g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53212b)) {
            return false;
        }
        C53212b bVar = (C53212b) aVar;
        return C46238a.m51546a(this.BaseResponse, bVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f148439d), Integer.valueOf(bVar.f148439d)) && C46238a.m51546a(this.f148440e, bVar.f148440e) && C46238a.m51546a(this.f148441f, bVar.f148441f) && C46238a.m51546a(this.f148442g, bVar.f148442g);
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
                aVar.mo74318e(2, this.f148439d);
                String str = this.f148440e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f148441f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f148442g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f148439d);
            String str4 = this.f148440e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f148441f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f148442g;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
        } else if (i == 2) {
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
            C53212b bVar = objArr[1];
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
                    bVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                bVar.f148439d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                bVar.f148440e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                bVar.f148441f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                bVar.f148442g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
