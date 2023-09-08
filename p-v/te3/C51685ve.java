package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ve */
public class C51685ve extends C47465a {

    /* renamed from: d */
    public LinkedList<C51531ue> f143447d = new LinkedList<>();

    /* renamed from: e */
    public int f143448e;

    /* renamed from: f */
    public String f143449f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51685ve)) {
            return false;
        }
        C51685ve veVar = (C51685ve) aVar;
        return C46238a.m51546a(this.f143447d, veVar.f143447d) && C46238a.m51546a(Integer.valueOf(this.f143448e), Integer.valueOf(veVar.f143448e)) && C46238a.m51546a(this.f143449f, veVar.f143449f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f143447d);
            aVar.mo74318e(2, this.f143448e);
            String str = this.f143449f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f143447d) + 0 + C52418a.m58678e(2, this.f143448e);
            String str2 = this.f143449f;
            return str2 != null ? g + C52418a.m58683j(3, str2) : g;
        } else if (i == 2) {
            this.f143447d.clear();
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
            C51685ve veVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51531ue ueVar = new C51531ue();
                    if (bArr != null && bArr.length > 0) {
                        ueVar.parseFrom(bArr);
                    }
                    veVar.f143447d.add(ueVar);
                }
                return 0;
            } else if (intValue == 2) {
                veVar.f143448e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                veVar.f143449f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
