package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s14 */
public class C118464s14 extends C47465a {

    /* renamed from: d */
    public String f354328d = "";

    /* renamed from: e */
    public LinkedList<C118438ja3> f354329e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<yr4> f354330f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118464s14)) {
            return false;
        }
        C118464s14 s142 = (C118464s14) aVar;
        return C46238a.m51546a(this.f354328d, s142.f354328d) && C46238a.m51546a(this.f354329e, s142.f354329e) && C46238a.m51546a(this.f354330f, s142.f354330f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354328d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f354329e);
            aVar.mo74320g(3, 8, this.f354330f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f354328d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f354329e) + C52418a.m58680g(3, 8, this.f354330f);
        } else if (i == 2) {
            this.f354329e.clear();
            this.f354330f.clear();
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
            C118464s14 s142 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                s142.f354328d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C118438ja3 ja32 = new C118438ja3();
                    if (bArr != null && bArr.length > 0) {
                        ja32.parseFrom(bArr);
                    }
                    s142.f354329e.add(ja32);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    yr4 yr4 = new yr4();
                    if (bArr2 != null && bArr2.length > 0) {
                        yr4.parseFrom(bArr2);
                    }
                    s142.f354330f.add(yr4);
                }
                return 0;
            }
        }
    }
}
