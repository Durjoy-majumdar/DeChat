package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qo */
public class C50988qo extends C47465a {

    /* renamed from: d */
    public String f140420d;

    /* renamed from: e */
    public String f140421e;

    /* renamed from: f */
    public LinkedList<pr4> f140422f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50988qo)) {
            return false;
        }
        C50988qo qoVar = (C50988qo) aVar;
        return C46238a.m51546a(this.f140420d, qoVar.f140420d) && C46238a.m51546a(this.f140421e, qoVar.f140421e) && C46238a.m51546a(this.f140422f, qoVar.f140422f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140420d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f140421e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f140422f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f140420d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f140421e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58680g(3, 8, this.f140422f);
        } else if (i == 2) {
            this.f140422f.clear();
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
            C50988qo qoVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qoVar.f140420d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                qoVar.f140421e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    pr4 pr4 = new pr4();
                    if (bArr != null && bArr.length > 0) {
                        pr4.parseFrom(bArr);
                    }
                    qoVar.f140422f.add(pr4);
                }
                return 0;
            }
        }
    }
}
