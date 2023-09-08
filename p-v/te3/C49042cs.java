package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cs */
public class C49042cs extends C47465a {

    /* renamed from: d */
    public LinkedList<C77949j3> f131925d = new LinkedList<>();

    /* renamed from: e */
    public String f131926e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49042cs)) {
            return false;
        }
        C49042cs csVar = (C49042cs) aVar;
        return C46238a.m51546a(this.f131925d, csVar.f131925d) && C46238a.m51546a(this.f131926e, csVar.f131926e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f131925d);
            String str = this.f131926e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f131925d) + 0;
            String str2 = this.f131926e;
            return str2 != null ? g + C52418a.m58683j(2, str2) : g;
        } else if (i == 2) {
            this.f131925d.clear();
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
            C49042cs csVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C77949j3 j3Var = new C77949j3();
                    if (bArr != null && bArr.length > 0) {
                        j3Var.parseFrom(bArr);
                    }
                    csVar.f131925d.add(j3Var);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                csVar.f131926e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
