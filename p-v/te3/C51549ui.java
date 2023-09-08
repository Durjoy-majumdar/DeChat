package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ui */
public class C51549ui extends C47465a {

    /* renamed from: d */
    public String f142862d;

    /* renamed from: e */
    public LinkedList<C118479xj3> f142863e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51549ui)) {
            return false;
        }
        C51549ui uiVar = (C51549ui) aVar;
        return C46238a.m51546a(this.f142862d, uiVar.f142862d) && C46238a.m51546a(this.f142863e, uiVar.f142863e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142862d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f142863e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f142862d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f142863e);
        } else if (i == 2) {
            this.f142863e.clear();
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
            C51549ui uiVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                uiVar.f142862d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C118479xj3 xj32 = new C118479xj3();
                    if (bArr != null && bArr.length > 0) {
                        xj32.parseFrom(bArr);
                    }
                    uiVar.f142863e.add(xj32);
                }
                return 0;
            }
        }
    }
}
