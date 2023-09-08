package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wd1 */
public class C51817wd1 extends C47465a {

    /* renamed from: d */
    public C64726td1 f143968d;

    /* renamed from: e */
    public String f143969e;

    /* renamed from: f */
    public String f143970f;

    /* renamed from: g */
    public String f143971g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51817wd1)) {
            return false;
        }
        C51817wd1 wd12 = (C51817wd1) aVar;
        return C46238a.m51546a(this.f143968d, wd12.f143968d) && C46238a.m51546a(this.f143969e, wd12.f143969e) && C46238a.m51546a(this.f143970f, wd12.f143970f) && C46238a.m51546a(this.f143971g, wd12.f143971g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64726td1 td12 = this.f143968d;
            if (td12 != null) {
                aVar.mo74322i(1, td12.computeSize());
                this.f143968d.writeFields(aVar);
            }
            String str = this.f143969e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f143970f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f143971g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            C64726td1 td13 = this.f143968d;
            if (td13 != null) {
                i2 = 0 + C52418a.m58682i(1, td13.computeSize());
            }
            String str4 = this.f143969e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f143970f;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f143971g;
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
            C51817wd1 wd12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64726td1 td14 = new C64726td1();
                    if (bArr != null && bArr.length > 0) {
                        td14.parseFrom(bArr);
                    }
                    wd12.f143968d = td14;
                }
                return 0;
            } else if (intValue == 2) {
                wd12.f143969e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                wd12.f143970f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                wd12.f143971g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
