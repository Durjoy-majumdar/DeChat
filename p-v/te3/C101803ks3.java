package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ks3 */
public class C101803ks3 extends C101820nt3 {

    /* renamed from: d */
    public int f298663d;

    /* renamed from: e */
    public C101770ds3 f298664e;

    /* renamed from: f */
    public C101767ct3 f298665f;

    /* renamed from: g */
    public String f298666g;

    /* renamed from: h */
    public LinkedList<String> f298667h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101803ks3)) {
            return false;
        }
        C101803ks3 ks32 = (C101803ks3) aVar;
        return C46238a.m51546a(this.BaseRequest, ks32.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f298663d), Integer.valueOf(ks32.f298663d)) && C46238a.m51546a(this.f298664e, ks32.f298664e) && C46238a.m51546a(this.f298665f, ks32.f298665f) && C46238a.m51546a(this.f298666g, ks32.f298666g) && C46238a.m51546a(this.f298667h, ks32.f298667h);
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
            aVar.mo74318e(2, this.f298663d);
            C101770ds3 ds32 = this.f298664e;
            if (ds32 != null) {
                aVar.mo74322i(3, ds32.computeSize());
                this.f298664e.writeFields(aVar);
            }
            C101767ct3 ct32 = this.f298665f;
            if (ct32 != null) {
                aVar.mo74322i(4, ct32.computeSize());
                this.f298665f.writeFields(aVar);
            }
            String str = this.f298666g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74320g(6, 1, this.f298667h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f298663d);
            C101770ds3 ds33 = this.f298664e;
            if (ds33 != null) {
                e += C52418a.m58682i(3, ds33.computeSize());
            }
            C101767ct3 ct33 = this.f298665f;
            if (ct33 != null) {
                e += C52418a.m58682i(4, ct33.computeSize());
            }
            String str2 = this.f298666g;
            if (str2 != null) {
                e += C52418a.m58683j(5, str2);
            }
            return e + C52418a.m58680g(6, 1, this.f298667h);
        } else if (i == 2) {
            this.f298667h.clear();
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
            C101803ks3 ks32 = objArr[1];
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
                        ks32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ks32.f298663d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C101770ds3 ds34 = new C101770ds3();
                        if (bArr2 != null && bArr2.length > 0) {
                            ds34.parseFrom(bArr2);
                        }
                        ks32.f298664e = ds34;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C101767ct3 ct34 = new C101767ct3();
                        if (bArr3 != null && bArr3.length > 0) {
                            ct34.parseFrom(bArr3);
                        }
                        ks32.f298665f = ct34;
                    }
                    return 0;
                case 5:
                    ks32.f298666g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ks32.f298667h.add(aVar3.mo141633k(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
