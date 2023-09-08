package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rf3 */
public class C51102rf3 extends C47465a {

    /* renamed from: d */
    public String f140883d;

    /* renamed from: e */
    public String f140884e;

    /* renamed from: f */
    public LinkedList<kg4> f140885f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51102rf3)) {
            return false;
        }
        C51102rf3 rf32 = (C51102rf3) aVar;
        return C46238a.m51546a(this.f140883d, rf32.f140883d) && C46238a.m51546a(this.f140884e, rf32.f140884e) && C46238a.m51546a(this.f140885f, rf32.f140885f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140883d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f140884e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f140885f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f140883d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f140884e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58680g(3, 8, this.f140885f);
        } else if (i == 2) {
            this.f140885f.clear();
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
            C51102rf3 rf32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                rf32.f140883d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                rf32.f140884e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    kg4 kg4 = new kg4();
                    if (bArr != null && bArr.length > 0) {
                        kg4.parseFrom(bArr);
                    }
                    rf32.f140885f.add(kg4);
                }
                return 0;
            }
        }
    }
}
