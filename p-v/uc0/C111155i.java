package uc0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uc0.i */
public class C111155i extends C47465a {

    /* renamed from: d */
    public String f332896d;

    /* renamed from: e */
    public C111157v f332897e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C111155i)) {
            return false;
        }
        C111155i iVar = (C111155i) aVar;
        return C46238a.m51546a(this.f332896d, iVar.f332896d) && C46238a.m51546a(this.f332897e, iVar.f332897e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f332896d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C111157v vVar = this.f332897e;
            if (vVar != null) {
                aVar.mo74322i(2, vVar.computeSize());
                this.f332897e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f332896d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C111157v vVar2 = this.f332897e;
            return vVar2 != null ? i2 + C52418a.m58682i(2, vVar2.computeSize()) : i2;
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
            C111155i iVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                iVar.f332896d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C111157v vVar3 = new C111157v();
                    if (bArr != null && bArr.length > 0) {
                        vVar3.parseFrom(bArr);
                    }
                    iVar.f332897e = vVar3;
                }
                return 0;
            }
        }
    }
}
