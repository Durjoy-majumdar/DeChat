package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t02 */
public class C51324t02 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f141879d;

    /* renamed from: e */
    public int f141880e;

    /* renamed from: f */
    public C89349b f141881f;

    /* renamed from: g */
    public String f141882g;

    /* renamed from: h */
    public float f141883h;

    /* renamed from: i */
    public float f141884i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51324t02)) {
            return false;
        }
        C51324t02 t022 = (C51324t02) aVar;
        return C46238a.m51546a(this.BaseRequest, t022.BaseRequest) && C46238a.m51546a(this.f141879d, t022.f141879d) && C46238a.m51546a(Integer.valueOf(this.f141880e), Integer.valueOf(t022.f141880e)) && C46238a.m51546a(this.f141881f, t022.f141881f) && C46238a.m51546a(this.f141882g, t022.f141882g) && C46238a.m51546a(Float.valueOf(this.f141883h), Float.valueOf(t022.f141883h)) && C46238a.m51546a(Float.valueOf(this.f141884i), Float.valueOf(t022.f141884i));
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
            C49842ig0 ig02 = this.f141879d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f141879d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f141880e);
            C89349b bVar = this.f141881f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            String str = this.f141882g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74317d(6, this.f141883h);
            aVar.mo74317d(7, this.f141884i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f141879d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f141880e);
            C89349b bVar2 = this.f141881f;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            String str2 = this.f141882g;
            if (str2 != null) {
                e += C52418a.m58683j(5, str2);
            }
            return e + C52418a.m58677d(6, this.f141883h) + C52418a.m58677d(7, this.f141884i);
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
            C51324t02 t022 = objArr[1];
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
                        t022.BaseRequest = iaVar3;
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
                        t022.f141879d = ig04;
                    }
                    return 0;
                case 3:
                    t022.f141880e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    t022.f141881f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    t022.f141882g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    t022.f141883h = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    t022.f141884i = aVar3.mo141628f(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
