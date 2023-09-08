package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class qr4 extends C47465a {

    /* renamed from: d */
    public sf4 f140509d;

    /* renamed from: e */
    public int f140510e;

    /* renamed from: f */
    public String f140511f;

    /* renamed from: g */
    public int f140512g;

    /* renamed from: h */
    public int f140513h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof qr4)) {
            return false;
        }
        qr4 qr4 = (qr4) aVar;
        return C46238a.m51546a(this.f140509d, qr4.f140509d) && C46238a.m51546a(Integer.valueOf(this.f140510e), Integer.valueOf(qr4.f140510e)) && C46238a.m51546a(this.f140511f, qr4.f140511f) && C46238a.m51546a(Integer.valueOf(this.f140512g), Integer.valueOf(qr4.f140512g)) && C46238a.m51546a(Integer.valueOf(this.f140513h), Integer.valueOf(qr4.f140513h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            sf4 sf4 = this.f140509d;
            if (sf4 != null) {
                aVar.mo74322i(1, sf4.computeSize());
                this.f140509d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f140510e);
            String str = this.f140511f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f140512g);
            aVar.mo74318e(5, this.f140513h);
            return 0;
        } else if (i == 1) {
            sf4 sf42 = this.f140509d;
            if (sf42 != null) {
                i2 = 0 + C52418a.m58682i(1, sf42.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f140510e);
            String str2 = this.f140511f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58678e(4, this.f140512g) + C52418a.m58678e(5, this.f140513h);
        } else if (i == 2) {
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
            qr4 qr4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    sf4 sf43 = new sf4();
                    if (bArr != null && bArr.length > 0) {
                        sf43.parseFrom(bArr);
                    }
                    qr4.f140509d = sf43;
                }
                return 0;
            } else if (intValue == 2) {
                qr4.f140510e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                qr4.f140511f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                qr4.f140512g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                qr4.f140513h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
