package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.io1 */
public class C49877io1 extends C101820nt3 {

    /* renamed from: d */
    public int f135536d;

    /* renamed from: e */
    public int f135537e;

    /* renamed from: f */
    public C89349b f135538f;

    /* renamed from: g */
    public String f135539g;

    /* renamed from: h */
    public int f135540h;

    /* renamed from: i */
    public C49842ig0 f135541i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49877io1)) {
            return false;
        }
        C49877io1 io12 = (C49877io1) aVar;
        return C46238a.m51546a(this.BaseRequest, io12.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f135536d), Integer.valueOf(io12.f135536d)) && C46238a.m51546a(Integer.valueOf(this.f135537e), Integer.valueOf(io12.f135537e)) && C46238a.m51546a(this.f135538f, io12.f135538f) && C46238a.m51546a(this.f135539g, io12.f135539g) && C46238a.m51546a(Integer.valueOf(this.f135540h), Integer.valueOf(io12.f135540h)) && C46238a.m51546a(this.f135541i, io12.f135541i);
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
            aVar.mo74318e(2, this.f135536d);
            aVar.mo74318e(3, this.f135537e);
            C89349b bVar = this.f135538f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            String str = this.f135539g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f135540h);
            C49842ig0 ig02 = this.f135541i;
            if (ig02 != null) {
                aVar.mo74322i(7, ig02.computeSize());
                this.f135541i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f135536d) + C52418a.m58678e(3, this.f135537e);
            C89349b bVar2 = this.f135538f;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            String str2 = this.f135539g;
            if (str2 != null) {
                e += C52418a.m58683j(5, str2);
            }
            int e2 = e + C52418a.m58678e(6, this.f135540h);
            C49842ig0 ig03 = this.f135541i;
            return ig03 != null ? e2 + C52418a.m58682i(7, ig03.computeSize()) : e2;
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
            C49877io1 io12 = objArr[1];
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
                        io12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    io12.f135536d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    io12.f135537e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    io12.f135538f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    io12.f135539g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    io12.f135540h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        io12.f135541i = ig04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
