package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gn */
public class C49581gn extends C47465a {

    /* renamed from: d */
    public LinkedList<C51473u00> f134128d = new LinkedList<>();

    /* renamed from: e */
    public String f134129e;

    /* renamed from: f */
    public int f134130f;

    /* renamed from: g */
    public String f134131g;

    /* renamed from: h */
    public String f134132h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49581gn)) {
            return false;
        }
        C49581gn gnVar = (C49581gn) aVar;
        return C46238a.m51546a(this.f134128d, gnVar.f134128d) && C46238a.m51546a(this.f134129e, gnVar.f134129e) && C46238a.m51546a(Integer.valueOf(this.f134130f), Integer.valueOf(gnVar.f134130f)) && C46238a.m51546a(this.f134131g, gnVar.f134131g) && C46238a.m51546a(this.f134132h, gnVar.f134132h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f134128d);
            String str = this.f134129e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f134130f);
            String str2 = this.f134131g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f134132h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f134128d) + 0;
            String str4 = this.f134129e;
            if (str4 != null) {
                g += C52418a.m58683j(2, str4);
            }
            int e = g + C52418a.m58678e(3, this.f134130f);
            String str5 = this.f134131g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f134132h;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
        } else if (i == 2) {
            this.f134128d.clear();
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
            C49581gn gnVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51473u00 u002 = new C51473u00();
                    if (bArr != null && bArr.length > 0) {
                        u002.parseFrom(bArr);
                    }
                    gnVar.f134128d.add(u002);
                }
                return 0;
            } else if (intValue == 2) {
                gnVar.f134129e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                gnVar.f134130f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                gnVar.f134131g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                gnVar.f134132h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
