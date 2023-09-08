package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ik1 */
public class C49860ik1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f135429d;

    /* renamed from: e */
    public String f135430e;

    /* renamed from: f */
    public C89349b f135431f;

    /* renamed from: g */
    public int f135432g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49860ik1)) {
            return false;
        }
        C49860ik1 ik12 = (C49860ik1) aVar;
        return C46238a.m51546a(this.BaseRequest, ik12.BaseRequest) && C46238a.m51546a(this.f135429d, ik12.f135429d) && C46238a.m51546a(this.f135430e, ik12.f135430e) && C46238a.m51546a(this.f135431f, ik12.f135431f) && C46238a.m51546a(Integer.valueOf(this.f135432g), Integer.valueOf(ik12.f135432g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f135429d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f135429d.writeFields(aVar);
            }
            String str = this.f135430e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f135431f;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74318e(6, this.f135432g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f135429d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f135430e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f135431f;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(5, bVar2);
            }
            return i2 + C52418a.m58678e(6, this.f135432g);
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
            C49860ik1 ik12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    ik12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    ik12.f135429d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                ik12.f135430e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 5) {
                ik12.f135431f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 6) {
                return -1;
            } else {
                ik12.f135432g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
