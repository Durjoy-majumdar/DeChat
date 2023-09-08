package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zg0 */
public class C52258zg0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f145882d;

    /* renamed from: e */
    public C49704hh0 f145883e;

    /* renamed from: f */
    public int f145884f;

    /* renamed from: g */
    public int f145885g;

    /* renamed from: h */
    public C89349b f145886h;

    /* renamed from: i */
    public C89349b f145887i;

    /* renamed from: j */
    public int f145888j;

    /* renamed from: n */
    public String f145889n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52258zg0)) {
            return false;
        }
        C52258zg0 zg02 = (C52258zg0) aVar;
        return C46238a.m51546a(this.BaseRequest, zg02.BaseRequest) && C46238a.m51546a(this.f145882d, zg02.f145882d) && C46238a.m51546a(this.f145883e, zg02.f145883e) && C46238a.m51546a(Integer.valueOf(this.f145884f), Integer.valueOf(zg02.f145884f)) && C46238a.m51546a(Integer.valueOf(this.f145885g), Integer.valueOf(zg02.f145885g)) && C46238a.m51546a(this.f145886h, zg02.f145886h) && C46238a.m51546a(this.f145887i, zg02.f145887i) && C46238a.m51546a(Integer.valueOf(this.f145888j), Integer.valueOf(zg02.f145888j)) && C46238a.m51546a(this.f145889n, zg02.f145889n);
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
            C49842ig0 ig02 = this.f145882d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f145882d.writeFields(aVar);
            }
            C49704hh0 hh02 = this.f145883e;
            if (hh02 != null) {
                aVar.mo74322i(3, hh02.computeSize());
                this.f145883e.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f145884f);
            aVar.mo74318e(5, this.f145885g);
            C89349b bVar = this.f145886h;
            if (bVar != null) {
                aVar.mo74315b(6, bVar);
            }
            C89349b bVar2 = this.f145887i;
            if (bVar2 != null) {
                aVar.mo74315b(7, bVar2);
            }
            aVar.mo74318e(8, this.f145888j);
            String str = this.f145889n;
            if (str != null) {
                aVar.mo74323j(9, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f145882d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C49704hh0 hh03 = this.f145883e;
            if (hh03 != null) {
                i2 += C52418a.m58682i(3, hh03.computeSize());
            }
            int e = i2 + C52418a.m58678e(4, this.f145884f) + C52418a.m58678e(5, this.f145885g);
            C89349b bVar3 = this.f145886h;
            if (bVar3 != null) {
                e += C52418a.m58675b(6, bVar3);
            }
            C89349b bVar4 = this.f145887i;
            if (bVar4 != null) {
                e += C52418a.m58675b(7, bVar4);
            }
            int e2 = e + C52418a.m58678e(8, this.f145888j);
            String str2 = this.f145889n;
            return str2 != null ? e2 + C52418a.m58683j(9, str2) : e2;
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
            C52258zg0 zg02 = objArr[1];
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
                        zg02.BaseRequest = iaVar3;
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
                        zg02.f145882d = ig04;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            hh04.parseFrom(bArr3);
                        }
                        zg02.f145883e = hh04;
                    }
                    return 0;
                case 4:
                    zg02.f145884f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    zg02.f145885g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    zg02.f145886h = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    zg02.f145887i = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    zg02.f145888j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    zg02.f145889n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
