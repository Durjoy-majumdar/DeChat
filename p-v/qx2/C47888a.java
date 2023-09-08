package qx2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.gf4;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: qx2.a */
public class C47888a extends C47465a {

    /* renamed from: d */
    public String f128485d;

    /* renamed from: e */
    public LinkedList<gf4> f128486e = new LinkedList<>();

    /* renamed from: f */
    public int f128487f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47888a)) {
            return false;
        }
        C47888a aVar2 = (C47888a) aVar;
        return C46238a.m51546a(this.f128485d, aVar2.f128485d) && C46238a.m51546a(this.f128486e, aVar2.f128486e) && C46238a.m51546a(Integer.valueOf(this.f128487f), Integer.valueOf(aVar2.f128487f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f128485d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74320g(2, 8, this.f128486e);
                aVar.mo74318e(3, this.f128487f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: username");
        } else if (i == 1) {
            String str2 = this.f128485d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f128486e) + C52418a.m58678e(3, this.f128487f);
        } else if (i == 2) {
            this.f128486e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f128485d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: username");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47888a aVar4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                aVar4.f128485d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    gf4 gf4 = new gf4();
                    if (bArr != null && bArr.length > 0) {
                        gf4.parseFrom(bArr);
                    }
                    aVar4.f128486e.add(gf4);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                aVar4.f128487f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
