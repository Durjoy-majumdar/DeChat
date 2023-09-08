package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o3 */
public class C50628o3 extends C47465a {

    /* renamed from: d */
    public String f138919d;

    /* renamed from: e */
    public LinkedList<C51932x63> f138920e = new LinkedList<>();

    /* renamed from: f */
    public String f138921f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50628o3)) {
            return false;
        }
        C50628o3 o3Var = (C50628o3) aVar;
        return C46238a.m51546a(this.f138919d, o3Var.f138919d) && C46238a.m51546a(this.f138920e, o3Var.f138920e) && C46238a.m51546a(this.f138921f, o3Var.f138921f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138919d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f138920e);
            String str2 = this.f138921f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f138919d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f138920e);
            String str4 = this.f138921f;
            return str4 != null ? g + C52418a.m58683j(3, str4) : g;
        } else if (i == 2) {
            this.f138920e.clear();
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
            C50628o3 o3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                o3Var.f138919d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51932x63 x632 = new C51932x63();
                    if (bArr != null && bArr.length > 0) {
                        x632.parseFrom(bArr);
                    }
                    o3Var.f138920e.add(x632);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                o3Var.f138921f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
