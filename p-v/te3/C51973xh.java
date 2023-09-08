package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xh */
public class C51973xh extends C47465a {

    /* renamed from: d */
    public C52116yh f144646d;

    /* renamed from: e */
    public int f144647e;

    /* renamed from: f */
    public String f144648f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51973xh)) {
            return false;
        }
        C51973xh xhVar = (C51973xh) aVar;
        return C46238a.m51546a(this.f144646d, xhVar.f144646d) && C46238a.m51546a(Integer.valueOf(this.f144647e), Integer.valueOf(xhVar.f144647e)) && C46238a.m51546a(this.f144648f, xhVar.f144648f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52116yh yhVar = this.f144646d;
            if (yhVar != null) {
                aVar.mo74322i(1, yhVar.computeSize());
                this.f144646d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f144647e);
            String str = this.f144648f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            C52116yh yhVar2 = this.f144646d;
            if (yhVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, yhVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f144647e);
            String str2 = this.f144648f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
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
            C51973xh xhVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52116yh yhVar3 = new C52116yh();
                    if (bArr != null && bArr.length > 0) {
                        yhVar3.parseFrom(bArr);
                    }
                    xhVar.f144646d = yhVar3;
                }
                return 0;
            } else if (intValue == 2) {
                xhVar.f144647e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                xhVar.f144648f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
