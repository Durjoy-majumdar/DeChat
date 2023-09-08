package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class qz4 extends C47465a {

    /* renamed from: d */
    public LinkedList<C50667oe0> f140629d = new LinkedList<>();

    /* renamed from: e */
    public String f140630e;

    /* renamed from: f */
    public String f140631f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof qz4)) {
            return false;
        }
        qz4 qz4 = (qz4) aVar;
        return C46238a.m51546a(this.f140629d, qz4.f140629d) && C46238a.m51546a(this.f140630e, qz4.f140630e) && C46238a.m51546a(this.f140631f, qz4.f140631f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f140630e != null) {
                aVar.mo74320g(1, 8, this.f140629d);
                String str = this.f140630e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f140631f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Charset");
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f140629d) + 0;
            String str3 = this.f140630e;
            if (str3 != null) {
                g += C52418a.m58683j(2, str3);
            }
            String str4 = this.f140631f;
            return str4 != null ? g + C52418a.m58683j(3, str4) : g;
        } else if (i == 2) {
            this.f140629d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f140630e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Charset");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            qz4 qz4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50667oe0 oe02 = new C50667oe0();
                    if (bArr != null && bArr.length > 0) {
                        oe02.parseFrom(bArr);
                    }
                    qz4.f140629d.add(oe02);
                }
                return 0;
            } else if (intValue == 2) {
                qz4.f140630e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                qz4.f140631f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
