package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class w54 extends C47465a {

    /* renamed from: d */
    public String f186060d;

    /* renamed from: e */
    public LinkedList<C64514l50> f186061e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C64514l50> f186062f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof w54)) {
            return false;
        }
        w54 w54 = (w54) aVar;
        return C46238a.m51546a(this.f186060d, w54.f186060d) && C46238a.m51546a(this.f186061e, w54.f186061e) && C46238a.m51546a(this.f186062f, w54.f186062f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186060d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f186061e);
            aVar.mo74320g(3, 8, this.f186062f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f186060d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f186061e) + C52418a.m58680g(3, 8, this.f186062f);
        } else if (i == 2) {
            this.f186061e.clear();
            this.f186062f.clear();
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
            w54 w54 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                w54.f186060d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64514l50 l502 = new C64514l50();
                    if (bArr != null && bArr.length > 0) {
                        l502.parseFrom(bArr);
                    }
                    w54.f186061e.add(l502);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64514l50 l503 = new C64514l50();
                    if (bArr2 != null && bArr2.length > 0) {
                        l503.parseFrom(bArr2);
                    }
                    w54.f186062f.add(l503);
                }
                return 0;
            }
        }
    }
}
