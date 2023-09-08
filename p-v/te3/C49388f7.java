package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f7 */
public class C49388f7 extends C47465a {

    /* renamed from: d */
    public int f133322d;

    /* renamed from: e */
    public LinkedList<g54> f133323e = new LinkedList<>();

    /* renamed from: f */
    public String f133324f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49388f7)) {
            return false;
        }
        C49388f7 f7Var = (C49388f7) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133322d), Integer.valueOf(f7Var.f133322d)) && C46238a.m51546a(this.f133323e, f7Var.f133323e) && C46238a.m51546a(this.f133324f, f7Var.f133324f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133322d);
            aVar.mo74320g(2, 8, this.f133323e);
            String str = this.f133324f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f133322d) + 0 + C52418a.m58680g(2, 8, this.f133323e);
            String str2 = this.f133324f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
        } else if (i == 2) {
            this.f133323e.clear();
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
            C49388f7 f7Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                f7Var.f133322d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    g54 g54 = new g54();
                    if (bArr != null && bArr.length > 0) {
                        g54.parseFrom(bArr);
                    }
                    f7Var.f133323e.add(g54);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                f7Var.f133324f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
