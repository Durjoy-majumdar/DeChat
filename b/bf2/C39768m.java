package bf2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: bf2.m */
public class C39768m extends C47465a {

    /* renamed from: d */
    public String f106723d;

    /* renamed from: e */
    public String f106724e;

    /* renamed from: f */
    public LinkedList<C39765h> f106725f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39768m)) {
            return false;
        }
        C39768m mVar = (C39768m) aVar;
        return C46238a.m51546a(this.f106723d, mVar.f106723d) && C46238a.m51546a(this.f106724e, mVar.f106724e) && C46238a.m51546a(this.f106725f, mVar.f106725f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f106723d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f106724e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f106725f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f106723d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f106724e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58680g(3, 8, this.f106725f);
        } else if (i == 2) {
            this.f106725f.clear();
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
            C39768m mVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mVar.f106723d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                mVar.f106724e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C39765h hVar = new C39765h();
                    if (bArr != null && bArr.length > 0) {
                        hVar.parseFrom(bArr);
                    }
                    mVar.f106725f.add(hVar);
                }
                return 0;
            }
        }
    }
}
