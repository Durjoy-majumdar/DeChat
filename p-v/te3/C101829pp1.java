package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pp1 */
public class C101829pp1 extends C47465a {

    /* renamed from: d */
    public C101804kv2 f299180d;

    /* renamed from: e */
    public String f299181e;

    /* renamed from: f */
    public int f299182f;

    /* renamed from: g */
    public int f299183g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101829pp1)) {
            return false;
        }
        C101829pp1 pp12 = (C101829pp1) aVar;
        return C46238a.m51546a(this.f299180d, pp12.f299180d) && C46238a.m51546a(this.f299181e, pp12.f299181e) && C46238a.m51546a(Integer.valueOf(this.f299182f), Integer.valueOf(pp12.f299182f)) && C46238a.m51546a(Integer.valueOf(this.f299183g), Integer.valueOf(pp12.f299183g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C101804kv2 kv22 = this.f299180d;
            if (kv22 != null) {
                aVar.mo74322i(1, kv22.computeSize());
                this.f299180d.writeFields(aVar);
            }
            String str = this.f299181e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f299182f);
            aVar.mo74318e(4, this.f299183g);
            return 0;
        } else if (i == 1) {
            C101804kv2 kv23 = this.f299180d;
            if (kv23 != null) {
                i2 = 0 + C52418a.m58682i(1, kv23.computeSize());
            }
            String str2 = this.f299181e;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f299182f) + C52418a.m58678e(4, this.f299183g);
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
            C101829pp1 pp12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C101804kv2 kv24 = new C101804kv2();
                    if (bArr != null && bArr.length > 0) {
                        kv24.parseFrom(bArr);
                    }
                    pp12.f299180d = kv24;
                }
                return 0;
            } else if (intValue == 2) {
                pp12.f299181e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                pp12.f299182f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                pp12.f299183g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
