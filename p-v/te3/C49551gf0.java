package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gf0 */
public class C49551gf0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f134008d;

    /* renamed from: e */
    public LinkedList<Integer> f134009e = new LinkedList<>();

    /* renamed from: f */
    public String f134010f;

    /* renamed from: g */
    public String f134011g;

    /* renamed from: h */
    public int f134012h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49551gf0)) {
            return false;
        }
        C49551gf0 gf02 = (C49551gf0) aVar;
        return C46238a.m51546a(this.BaseRequest, gf02.BaseRequest) && C46238a.m51546a(this.f134008d, gf02.f134008d) && C46238a.m51546a(this.f134009e, gf02.f134009e) && C46238a.m51546a(this.f134010f, gf02.f134010f) && C46238a.m51546a(this.f134011g, gf02.f134011g) && C46238a.m51546a(Integer.valueOf(this.f134012h), Integer.valueOf(gf02.f134012h));
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
            C49842ig0 ig02 = this.f134008d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f134008d.writeFields(aVar);
            }
            aVar.mo74320g(3, 2, this.f134009e);
            String str = this.f134010f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f134011g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f134012h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f134008d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int g = i2 + C52418a.m58680g(3, 2, this.f134009e);
            String str3 = this.f134010f;
            if (str3 != null) {
                g += C52418a.m58683j(4, str3);
            }
            String str4 = this.f134011g;
            if (str4 != null) {
                g += C52418a.m58683j(5, str4);
            }
            return g + C52418a.m58678e(6, this.f134012h);
        } else if (i == 2) {
            this.f134009e.clear();
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
            C49551gf0 gf02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        gf02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        gf02.f134008d = ig04;
                    }
                    return 0;
                case 3:
                    gf02.f134009e.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 4:
                    gf02.f134010f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    gf02.f134011g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    gf02.f134012h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
