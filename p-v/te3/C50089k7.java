package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k7 */
public class C50089k7 extends C47465a {

    /* renamed from: d */
    public String f136591d;

    /* renamed from: e */
    public C51932x63 f136592e;

    /* renamed from: f */
    public LinkedList<C51932x63> f136593f = new LinkedList<>();

    /* renamed from: g */
    public String f136594g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50089k7)) {
            return false;
        }
        C50089k7 k7Var = (C50089k7) aVar;
        return C46238a.m51546a(this.f136591d, k7Var.f136591d) && C46238a.m51546a(this.f136592e, k7Var.f136592e) && C46238a.m51546a(this.f136593f, k7Var.f136593f) && C46238a.m51546a(this.f136594g, k7Var.f136594g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136591d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C51932x63 x632 = this.f136592e;
            if (x632 != null) {
                aVar.mo74322i(2, x632.computeSize());
                this.f136592e.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f136593f);
            String str2 = this.f136594g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f136591d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            C51932x63 x633 = this.f136592e;
            if (x633 != null) {
                i2 += C52418a.m58682i(2, x633.computeSize());
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f136593f);
            String str4 = this.f136594g;
            return str4 != null ? g + C52418a.m58683j(4, str4) : g;
        } else if (i == 2) {
            this.f136593f.clear();
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
            C50089k7 k7Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                k7Var.f136591d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51932x63 x634 = new C51932x63();
                    if (bArr != null && bArr.length > 0) {
                        x634.parseFrom(bArr);
                    }
                    k7Var.f136592e = x634;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51932x63 x635 = new C51932x63();
                    if (bArr2 != null && bArr2.length > 0) {
                        x635.parseFrom(bArr2);
                    }
                    k7Var.f136593f.add(x635);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                k7Var.f136594g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
