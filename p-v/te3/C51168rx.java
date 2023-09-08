package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rx */
public class C51168rx extends C47465a {

    /* renamed from: d */
    public String f141193d;

    /* renamed from: e */
    public String f141194e;

    /* renamed from: f */
    public LinkedList<C51171rx2> f141195f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51168rx)) {
            return false;
        }
        C51168rx rxVar = (C51168rx) aVar;
        return C46238a.m51546a(this.f141193d, rxVar.f141193d) && C46238a.m51546a(this.f141194e, rxVar.f141194e) && C46238a.m51546a(this.f141195f, rxVar.f141195f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141193d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f141194e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f141195f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f141193d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f141194e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58680g(3, 8, this.f141195f);
        } else if (i == 2) {
            this.f141195f.clear();
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
            C51168rx rxVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                rxVar.f141193d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                rxVar.f141194e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51171rx2 rx22 = new C51171rx2();
                    if (bArr != null && bArr.length > 0) {
                        rx22.parseFrom(bArr);
                    }
                    rxVar.f141195f.add(rx22);
                }
                return 0;
            }
        }
    }
}
