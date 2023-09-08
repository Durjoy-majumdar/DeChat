package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o82 */
public class C50647o82 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<c54> f139025d = new LinkedList<>();

    /* renamed from: e */
    public String f139026e;

    /* renamed from: f */
    public int f139027f;

    /* renamed from: g */
    public int f139028g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50647o82)) {
            return false;
        }
        C50647o82 o822 = (C50647o82) aVar;
        return C46238a.m51546a(this.BaseResponse, o822.BaseResponse) && C46238a.m51546a(this.f139025d, o822.f139025d) && C46238a.m51546a(this.f139026e, o822.f139026e) && C46238a.m51546a(Integer.valueOf(this.f139027f), Integer.valueOf(o822.f139027f)) && C46238a.m51546a(Integer.valueOf(this.f139028g), Integer.valueOf(o822.f139028g));
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
                aVar.mo74320g(2, 8, this.f139025d);
                String str = this.f139026e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f139027f);
                aVar.mo74318e(5, this.f139028g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f139025d);
            String str2 = this.f139026e;
            if (str2 != null) {
                g += C52418a.m58683j(3, str2);
            }
            return g + C52418a.m58678e(4, this.f139027f) + C52418a.m58678e(5, this.f139028g);
        } else if (i == 2) {
            this.f139025d.clear();
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
            C50647o82 o822 = objArr[1];
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
                    o822.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    c54 c54 = new c54();
                    if (bArr2 != null && bArr2.length > 0) {
                        c54.parseFrom(bArr2);
                    }
                    o822.f139025d.add(c54);
                }
                return 0;
            } else if (intValue == 3) {
                o822.f139026e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                o822.f139027f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                o822.f139028g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
