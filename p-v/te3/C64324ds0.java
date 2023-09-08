package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ds0 */
public class C64324ds0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f182834d;

    /* renamed from: e */
    public String f182835e;

    /* renamed from: f */
    public int f182836f;

    /* renamed from: g */
    public C89349b f182837g;

    /* renamed from: h */
    public long f182838h;

    /* renamed from: i */
    public long f182839i;

    /* renamed from: j */
    public int f182840j;

    /* renamed from: n */
    public int f182841n;

    /* renamed from: o */
    public int f182842o;

    /* renamed from: p */
    public int f182843p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64324ds0)) {
            return false;
        }
        C64324ds0 ds02 = (C64324ds0) aVar;
        return C46238a.m51546a(this.BaseRequest, ds02.BaseRequest) && C46238a.m51546a(this.f182834d, ds02.f182834d) && C46238a.m51546a(this.f182835e, ds02.f182835e) && C46238a.m51546a(Integer.valueOf(this.f182836f), Integer.valueOf(ds02.f182836f)) && C46238a.m51546a(this.f182837g, ds02.f182837g) && C46238a.m51546a(Long.valueOf(this.f182838h), Long.valueOf(ds02.f182838h)) && C46238a.m51546a(Long.valueOf(this.f182839i), Long.valueOf(ds02.f182839i)) && C46238a.m51546a(Integer.valueOf(this.f182840j), Integer.valueOf(ds02.f182840j)) && C46238a.m51546a(Integer.valueOf(this.f182841n), Integer.valueOf(ds02.f182841n)) && C46238a.m51546a(Integer.valueOf(this.f182842o), Integer.valueOf(ds02.f182842o)) && C46238a.m51546a(Integer.valueOf(this.f182843p), Integer.valueOf(ds02.f182843p));
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
            C49842ig0 ig02 = this.f182834d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f182834d.writeFields(aVar);
            }
            String str = this.f182835e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f182836f);
            C89349b bVar = this.f182837g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74321h(6, this.f182838h);
            aVar.mo74321h(7, this.f182839i);
            aVar.mo74318e(8, this.f182840j);
            aVar.mo74318e(9, this.f182841n);
            aVar.mo74318e(10, this.f182842o);
            aVar.mo74318e(11, this.f182843p);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f182834d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f182835e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            int e = i2 + C52418a.m58678e(4, this.f182836f);
            C89349b bVar2 = this.f182837g;
            if (bVar2 != null) {
                e += C52418a.m58675b(5, bVar2);
            }
            return e + C52418a.m58681h(6, this.f182838h) + C52418a.m58681h(7, this.f182839i) + C52418a.m58678e(8, this.f182840j) + C52418a.m58678e(9, this.f182841n) + C52418a.m58678e(10, this.f182842o) + C52418a.m58678e(11, this.f182843p);
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
            C64324ds0 ds02 = objArr[1];
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
                        ds02.BaseRequest = iaVar3;
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
                        ds02.f182834d = ig04;
                    }
                    return 0;
                case 3:
                    ds02.f182835e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ds02.f182836f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ds02.f182837g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    ds02.f182838h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    ds02.f182839i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    ds02.f182840j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ds02.f182841n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    ds02.f182842o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    ds02.f182843p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
