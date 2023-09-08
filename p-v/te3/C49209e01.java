package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e01 */
public class C49209e01 extends C47465a {

    /* renamed from: d */
    public String f132604d;

    /* renamed from: e */
    public C50767p11 f132605e;

    /* renamed from: f */
    public int f132606f;

    /* renamed from: g */
    public C89349b f132607g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49209e01)) {
            return false;
        }
        C49209e01 e012 = (C49209e01) aVar;
        return C46238a.m51546a(this.f132604d, e012.f132604d) && C46238a.m51546a(this.f132605e, e012.f132605e) && C46238a.m51546a(Integer.valueOf(this.f132606f), Integer.valueOf(e012.f132606f)) && C46238a.m51546a(this.f132607g, e012.f132607g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132604d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C50767p11 p112 = this.f132605e;
            if (p112 != null) {
                aVar.mo74322i(2, p112.computeSize());
                this.f132605e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f132606f);
            C89349b bVar = this.f132607g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f132604d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C50767p11 p113 = this.f132605e;
            if (p113 != null) {
                i2 += C52418a.m58682i(2, p113.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f132606f);
            C89349b bVar2 = this.f132607g;
            return bVar2 != null ? e + C52418a.m58675b(4, bVar2) : e;
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
            C49209e01 e012 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e012.f132604d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50767p11 p114 = new C50767p11();
                    if (bArr != null && bArr.length > 0) {
                        p114.parseFrom(bArr);
                    }
                    e012.f132605e = p114;
                }
                return 0;
            } else if (intValue == 3) {
                e012.f132606f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                e012.f132607g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
