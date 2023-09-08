package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gz2 */
public class C49630gz2 extends C47465a {

    /* renamed from: d */
    public String f134369d;

    /* renamed from: e */
    public C50665od3 f134370e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49630gz2)) {
            return false;
        }
        C49630gz2 gz22 = (C49630gz2) aVar;
        return C46238a.m51546a(this.f134369d, gz22.f134369d) && C46238a.m51546a(this.f134370e, gz22.f134370e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134369d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: ContactUsername");
            } else if (this.f134370e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                C50665od3 od32 = this.f134370e;
                if (od32 != null) {
                    aVar.mo74322i(2, od32.computeSize());
                    this.f134370e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: PhoneNumListInfo");
            }
        } else if (i == 1) {
            String str2 = this.f134369d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C50665od3 od33 = this.f134370e;
            return od33 != null ? i2 + C52418a.m58682i(2, od33.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134369d == null) {
                throw new C52419b("Not all required fields were included: ContactUsername");
            } else if (this.f134370e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: PhoneNumListInfo");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49630gz2 gz22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                gz22.f134369d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50665od3 od34 = new C50665od3();
                    if (bArr != null && bArr.length > 0) {
                        od34.parseFrom(bArr);
                    }
                    gz22.f134370e = od34;
                }
                return 0;
            }
        }
    }
}
