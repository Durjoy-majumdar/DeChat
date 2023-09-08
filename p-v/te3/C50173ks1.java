package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ks1 */
public class C50173ks1 extends C47465a {

    /* renamed from: d */
    public jp4 f137023d;

    /* renamed from: e */
    public C50030js1 f137024e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50173ks1)) {
            return false;
        }
        C50173ks1 ks12 = (C50173ks1) aVar;
        return C46238a.m51546a(this.f137023d, ks12.f137023d) && C46238a.m51546a(this.f137024e, ks12.f137024e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            jp4 jp4 = this.f137023d;
            if (jp4 != null) {
                aVar.mo74322i(1, jp4.computeSize());
                this.f137023d.writeFields(aVar);
            }
            C50030js1 js12 = this.f137024e;
            if (js12 != null) {
                aVar.mo74322i(2, js12.computeSize());
                this.f137024e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            jp4 jp42 = this.f137023d;
            if (jp42 != null) {
                i2 = 0 + C52418a.m58682i(1, jp42.computeSize());
            }
            C50030js1 js13 = this.f137024e;
            return js13 != null ? i2 + C52418a.m58682i(2, js13.computeSize()) : i2;
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
            C50173ks1 ks12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    jp4 jp43 = new jp4();
                    if (bArr != null && bArr.length > 0) {
                        jp43.parseFrom(bArr);
                    }
                    ks12.f137023d = jp43;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50030js1 js14 = new C50030js1();
                    if (bArr2 != null && bArr2.length > 0) {
                        js14.parseFrom(bArr2);
                    }
                    ks12.f137024e = js14;
                }
                return 0;
            }
        }
    }
}
