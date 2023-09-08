package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.aq2 */
public class C64239aq2 extends C47465a {

    /* renamed from: d */
    public C64890zp2 f182131d;

    /* renamed from: e */
    public String f182132e;

    /* renamed from: f */
    public String f182133f;

    /* renamed from: g */
    public String f182134g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64239aq2)) {
            return false;
        }
        C64239aq2 aq22 = (C64239aq2) aVar;
        return C46238a.m51546a(this.f182131d, aq22.f182131d) && C46238a.m51546a(this.f182132e, aq22.f182132e) && C46238a.m51546a(this.f182133f, aq22.f182133f) && C46238a.m51546a(this.f182134g, aq22.f182134g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64890zp2 zp22 = this.f182131d;
            if (zp22 != null) {
                aVar.mo74322i(1, zp22.computeSize());
                this.f182131d.writeFields(aVar);
            }
            String str = this.f182132e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f182133f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f182134g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            C64890zp2 zp23 = this.f182131d;
            if (zp23 != null) {
                i2 = 0 + C52418a.m58682i(1, zp23.computeSize());
            }
            String str4 = this.f182132e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f182133f;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f182134g;
            return str6 != null ? i2 + C52418a.m58683j(4, str6) : i2;
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
            C64239aq2 aq22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64890zp2 zp24 = new C64890zp2();
                    if (bArr != null && bArr.length > 0) {
                        zp24.parseFrom(bArr);
                    }
                    aq22.f182131d = zp24;
                }
                return 0;
            } else if (intValue == 2) {
                aq22.f182132e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                aq22.f182133f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                aq22.f182134g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
