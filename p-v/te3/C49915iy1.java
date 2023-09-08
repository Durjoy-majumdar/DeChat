package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iy1 */
public class C49915iy1 extends C101820nt3 {

    /* renamed from: d */
    public int f135746d;

    /* renamed from: e */
    public LinkedList<C51163rv3> f135747e = new LinkedList<>();

    /* renamed from: f */
    public int f135748f;

    /* renamed from: g */
    public LinkedList<C51163rv3> f135749g = new LinkedList<>();

    /* renamed from: h */
    public int f135750h;

    /* renamed from: i */
    public LinkedList<C51163rv3> f135751i = new LinkedList<>();

    /* renamed from: j */
    public int f135752j;

    /* renamed from: n */
    public C51163rv3 f135753n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49915iy1)) {
            return false;
        }
        C49915iy1 iy12 = (C49915iy1) aVar;
        return C46238a.m51546a(this.BaseRequest, iy12.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f135746d), Integer.valueOf(iy12.f135746d)) && C46238a.m51546a(this.f135747e, iy12.f135747e) && C46238a.m51546a(Integer.valueOf(this.f135748f), Integer.valueOf(iy12.f135748f)) && C46238a.m51546a(this.f135749g, iy12.f135749g) && C46238a.m51546a(Integer.valueOf(this.f135750h), Integer.valueOf(iy12.f135750h)) && C46238a.m51546a(this.f135751i, iy12.f135751i) && C46238a.m51546a(Integer.valueOf(this.f135752j), Integer.valueOf(iy12.f135752j)) && C46238a.m51546a(this.f135753n, iy12.f135753n);
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
            aVar.mo74318e(2, this.f135746d);
            aVar.mo74320g(3, 8, this.f135747e);
            aVar.mo74318e(4, this.f135748f);
            aVar.mo74320g(5, 8, this.f135749g);
            aVar.mo74318e(6, this.f135750h);
            aVar.mo74320g(7, 8, this.f135751i);
            aVar.mo74318e(8, this.f135752j);
            C51163rv3 rv32 = this.f135753n;
            if (rv32 != null) {
                aVar.mo74322i(9, rv32.computeSize());
                this.f135753n.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f135746d) + C52418a.m58680g(3, 8, this.f135747e) + C52418a.m58678e(4, this.f135748f) + C52418a.m58680g(5, 8, this.f135749g) + C52418a.m58678e(6, this.f135750h) + C52418a.m58680g(7, 8, this.f135751i) + C52418a.m58678e(8, this.f135752j);
            C51163rv3 rv33 = this.f135753n;
            return rv33 != null ? e + C52418a.m58682i(9, rv33.computeSize()) : e;
        } else if (i == 2) {
            this.f135747e.clear();
            this.f135749g.clear();
            this.f135751i.clear();
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
            C49915iy1 iy12 = objArr[1];
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
                        iy12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    iy12.f135746d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv34 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv34.mo73356d(bArr2);
                        }
                        iy12.f135747e.add(rv34);
                    }
                    return 0;
                case 4:
                    iy12.f135748f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51163rv3 rv35 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv35.mo73356d(bArr3);
                        }
                        iy12.f135749g.add(rv35);
                    }
                    return 0;
                case 6:
                    iy12.f135750h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51163rv3 rv36 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv36.mo73356d(bArr4);
                        }
                        iy12.f135751i.add(rv36);
                    }
                    return 0;
                case 8:
                    iy12.f135752j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C51163rv3 rv37 = new C51163rv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            rv37.mo73356d(bArr5);
                        }
                        iy12.f135753n = rv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
