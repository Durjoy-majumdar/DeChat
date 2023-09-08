package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ex4 extends C47465a {

    /* renamed from: d */
    public dw4 f133165d;

    /* renamed from: e */
    public String f133166e;

    /* renamed from: f */
    public String f133167f;

    /* renamed from: g */
    public String f133168g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ex4)) {
            return false;
        }
        ex4 ex4 = (ex4) aVar;
        return C46238a.m51546a(this.f133165d, ex4.f133165d) && C46238a.m51546a(this.f133166e, ex4.f133166e) && C46238a.m51546a(this.f133167f, ex4.f133167f) && C46238a.m51546a(this.f133168g, ex4.f133168g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            dw4 dw4 = this.f133165d;
            if (dw4 != null) {
                if (dw4 != null) {
                    aVar.mo74322i(1, dw4.computeSize());
                    this.f133165d.writeFields(aVar);
                }
                String str = this.f133166e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f133167f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f133168g;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_request");
        } else if (i == 1) {
            dw4 dw42 = this.f133165d;
            if (dw42 != null) {
                i2 = 0 + C52418a.m58682i(1, dw42.computeSize());
            }
            String str4 = this.f133166e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f133167f;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f133168g;
            return str6 != null ? i2 + C52418a.m58683j(4, str6) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f133165d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_request");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ex4 ex4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    dw4 dw43 = new dw4();
                    if (bArr != null && bArr.length > 0) {
                        dw43.parseFrom(bArr);
                    }
                    ex4.f133165d = dw43;
                }
                return 0;
            } else if (intValue == 2) {
                ex4.f133166e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ex4.f133167f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ex4.f133168g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
