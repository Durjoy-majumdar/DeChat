package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ns4 extends C101820nt3 {

    /* renamed from: d */
    public String f138748d;

    /* renamed from: e */
    public String f138749e;

    /* renamed from: f */
    public et4 f138750f;

    /* renamed from: g */
    public LinkedList<et4> f138751g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ns4)) {
            return false;
        }
        ns4 ns4 = (ns4) aVar;
        return C46238a.m51546a(this.BaseRequest, ns4.BaseRequest) && C46238a.m51546a(this.f138748d, ns4.f138748d) && C46238a.m51546a(this.f138749e, ns4.f138749e) && C46238a.m51546a(this.f138750f, ns4.f138750f) && C46238a.m51546a(this.f138751g, ns4.f138751g);
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
            String str = this.f138748d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f138749e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            et4 et4 = this.f138750f;
            if (et4 != null) {
                aVar.mo74322i(4, et4.computeSize());
                this.f138750f.writeFields(aVar);
            }
            aVar.mo74320g(5, 8, this.f138751g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f138748d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f138749e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            et4 et42 = this.f138750f;
            if (et42 != null) {
                i2 += C52418a.m58682i(4, et42.computeSize());
            }
            return i2 + C52418a.m58680g(5, 8, this.f138751g);
        } else if (i == 2) {
            this.f138751g.clear();
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
            ns4 ns4 = objArr[1];
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
                    ns4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ns4.f138748d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ns4.f138749e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    et4 et43 = new et4();
                    if (bArr2 != null && bArr2.length > 0) {
                        et43.parseFrom(bArr2);
                    }
                    ns4.f138750f = et43;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    et4 et44 = new et4();
                    if (bArr3 != null && bArr3.length > 0) {
                        et44.parseFrom(bArr3);
                    }
                    ns4.f138751g.add(et44);
                }
                return 0;
            }
        }
    }
}
