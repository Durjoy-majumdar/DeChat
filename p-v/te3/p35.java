package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class p35 extends C47465a {

    /* renamed from: d */
    public String f139561d;

    /* renamed from: e */
    public m35 f139562e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof p35)) {
            return false;
        }
        p35 p35 = (p35) aVar;
        return C46238a.m51546a(this.f139561d, p35.f139561d) && C46238a.m51546a(this.f139562e, p35.f139562e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139561d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: AppId");
            } else if (this.f139562e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                m35 m35 = this.f139562e;
                if (m35 != null) {
                    aVar.mo74322i(2, m35.computeSize());
                    this.f139562e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: PkgConfig");
            }
        } else if (i == 1) {
            String str2 = this.f139561d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            m35 m352 = this.f139562e;
            return m352 != null ? i2 + C52418a.m58682i(2, m352.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f139561d == null) {
                throw new C52419b("Not all required fields were included: AppId");
            } else if (this.f139562e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: PkgConfig");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            p35 p35 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                p35.f139561d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    m35 m353 = new m35();
                    if (bArr != null && bArr.length > 0) {
                        m353.parseFrom(bArr);
                    }
                    p35.f139562e = m353;
                }
                return 0;
            }
        }
    }
}
