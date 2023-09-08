package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bv1 */
public class C48911bv1 extends C49335eu3 {

    /* renamed from: d */
    public String f131325d;

    /* renamed from: e */
    public LinkedList<String> f131326e = new LinkedList<>();

    /* renamed from: f */
    public String f131327f;

    /* renamed from: g */
    public String f131328g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48911bv1)) {
            return false;
        }
        C48911bv1 bv12 = (C48911bv1) aVar;
        return C46238a.m51546a(this.BaseResponse, bv12.BaseResponse) && C46238a.m51546a(this.f131325d, bv12.f131325d) && C46238a.m51546a(this.f131326e, bv12.f131326e) && C46238a.m51546a(this.f131327f, bv12.f131327f) && C46238a.m51546a(this.f131328g, bv12.f131328g);
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
            String str = this.f131325d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.f131326e);
            String str2 = this.f131327f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f131328g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str4 = this.f131325d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f131326e);
            String str5 = this.f131327f;
            if (str5 != null) {
                g += C52418a.m58683j(4, str5);
            }
            String str6 = this.f131328g;
            return str6 != null ? g + C52418a.m58683j(5, str6) : g;
        } else if (i == 2) {
            this.f131326e.clear();
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
            C48911bv1 bv12 = objArr[1];
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
                    bv12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                bv12.f131325d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                bv12.f131326e.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 4) {
                bv12.f131327f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                bv12.f131328g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
