package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sb */
public class C51218sb extends C47465a {

    /* renamed from: d */
    public LinkedList<C51082rb> f141411d = new LinkedList<>();

    /* renamed from: e */
    public C50937qb f141412e;

    /* renamed from: f */
    public int f141413f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51218sb)) {
            return false;
        }
        C51218sb sbVar = (C51218sb) aVar;
        return C46238a.m51546a(this.f141411d, sbVar.f141411d) && C46238a.m51546a(this.f141412e, sbVar.f141412e) && C46238a.m51546a(Integer.valueOf(this.f141413f), Integer.valueOf(sbVar.f141413f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f141411d);
            C50937qb qbVar = this.f141412e;
            if (qbVar != null) {
                aVar.mo74322i(2, qbVar.computeSize());
                this.f141412e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f141413f);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f141411d) + 0;
            C50937qb qbVar2 = this.f141412e;
            if (qbVar2 != null) {
                g += C52418a.m58682i(2, qbVar2.computeSize());
            }
            return g + C52418a.m58678e(3, this.f141413f);
        } else if (i == 2) {
            this.f141411d.clear();
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
            C51218sb sbVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51082rb rbVar = new C51082rb();
                    if (bArr != null && bArr.length > 0) {
                        rbVar.parseFrom(bArr);
                    }
                    sbVar.f141411d.add(rbVar);
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C50937qb qbVar3 = new C50937qb();
                    if (bArr2 != null && bArr2.length > 0) {
                        qbVar3.parseFrom(bArr2);
                    }
                    sbVar.f141412e = qbVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                sbVar.f141413f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
