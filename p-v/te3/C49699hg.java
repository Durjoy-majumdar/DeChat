package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hg */
public class C49699hg extends C47465a {

    /* renamed from: d */
    public C49913iy f134602d;

    /* renamed from: e */
    public C49287ei f134603e;

    /* renamed from: f */
    public C48706ag f134604f;

    /* renamed from: g */
    public C50685oi f134605g;

    /* renamed from: h */
    public C50546ni f134606h;

    /* renamed from: i */
    public C50387me f134607i;

    /* renamed from: j */
    public boolean f134608j;

    /* renamed from: n */
    public int f134609n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49699hg)) {
            return false;
        }
        C49699hg hgVar = (C49699hg) aVar;
        return C46238a.m51546a(this.f134602d, hgVar.f134602d) && C46238a.m51546a(this.f134603e, hgVar.f134603e) && C46238a.m51546a(this.f134604f, hgVar.f134604f) && C46238a.m51546a(this.f134605g, hgVar.f134605g) && C46238a.m51546a(this.f134606h, hgVar.f134606h) && C46238a.m51546a(this.f134607i, hgVar.f134607i) && C46238a.m51546a(Boolean.valueOf(this.f134608j), Boolean.valueOf(hgVar.f134608j)) && C46238a.m51546a(Integer.valueOf(this.f134609n), Integer.valueOf(hgVar.f134609n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49913iy iyVar = this.f134602d;
            if (iyVar != null) {
                aVar.mo74322i(1, iyVar.computeSize());
                this.f134602d.writeFields(aVar);
            }
            C49287ei eiVar = this.f134603e;
            if (eiVar != null) {
                aVar.mo74322i(2, eiVar.computeSize());
                this.f134603e.writeFields(aVar);
            }
            C48706ag agVar = this.f134604f;
            if (agVar != null) {
                aVar.mo74322i(3, agVar.computeSize());
                this.f134604f.writeFields(aVar);
            }
            C50685oi oiVar = this.f134605g;
            if (oiVar != null) {
                aVar.mo74322i(4, oiVar.computeSize());
                this.f134605g.writeFields(aVar);
            }
            C50546ni niVar = this.f134606h;
            if (niVar != null) {
                aVar.mo74322i(5, niVar.computeSize());
                this.f134606h.writeFields(aVar);
            }
            C50387me meVar = this.f134607i;
            if (meVar != null) {
                aVar.mo74322i(6, meVar.computeSize());
                this.f134607i.writeFields(aVar);
            }
            aVar.mo74314a(900, this.f134608j);
            aVar.mo74318e(901, this.f134609n);
            return 0;
        } else if (i == 1) {
            C49913iy iyVar2 = this.f134602d;
            if (iyVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iyVar2.computeSize());
            }
            C49287ei eiVar2 = this.f134603e;
            if (eiVar2 != null) {
                i2 += C52418a.m58682i(2, eiVar2.computeSize());
            }
            C48706ag agVar2 = this.f134604f;
            if (agVar2 != null) {
                i2 += C52418a.m58682i(3, agVar2.computeSize());
            }
            C50685oi oiVar2 = this.f134605g;
            if (oiVar2 != null) {
                i2 += C52418a.m58682i(4, oiVar2.computeSize());
            }
            C50546ni niVar2 = this.f134606h;
            if (niVar2 != null) {
                i2 += C52418a.m58682i(5, niVar2.computeSize());
            }
            C50387me meVar2 = this.f134607i;
            if (meVar2 != null) {
                i2 += C52418a.m58682i(6, meVar2.computeSize());
            }
            return i2 + C52418a.m58674a(900, this.f134608j) + C52418a.m58678e(901, this.f134609n);
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
            C49699hg hgVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 900) {
                hgVar.f134608j = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 901) {
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            byte[] bArr = j.get(i3);
                            C49913iy iyVar3 = new C49913iy();
                            if (bArr != null && bArr.length > 0) {
                                iyVar3.parseFrom(bArr);
                            }
                            hgVar.f134602d = iyVar3;
                        }
                        return 0;
                    case 2:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            C49287ei eiVar3 = new C49287ei();
                            if (bArr2 != null && bArr2.length > 0) {
                                eiVar3.parseFrom(bArr2);
                            }
                            hgVar.f134603e = eiVar3;
                        }
                        return 0;
                    case 3:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            byte[] bArr3 = j3.get(i5);
                            C48706ag agVar3 = new C48706ag();
                            if (bArr3 != null && bArr3.length > 0) {
                                agVar3.parseFrom(bArr3);
                            }
                            hgVar.f134604f = agVar3;
                        }
                        return 0;
                    case 4:
                        LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                        int size4 = j4.size();
                        for (int i6 = 0; i6 < size4; i6++) {
                            byte[] bArr4 = j4.get(i6);
                            C50685oi oiVar3 = new C50685oi();
                            if (bArr4 != null && bArr4.length > 0) {
                                oiVar3.parseFrom(bArr4);
                            }
                            hgVar.f134605g = oiVar3;
                        }
                        return 0;
                    case 5:
                        LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                        int size5 = j5.size();
                        for (int i7 = 0; i7 < size5; i7++) {
                            byte[] bArr5 = j5.get(i7);
                            C50546ni niVar3 = new C50546ni();
                            if (bArr5 != null && bArr5.length > 0) {
                                niVar3.parseFrom(bArr5);
                            }
                            hgVar.f134606h = niVar3;
                        }
                        return 0;
                    case 6:
                        LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                        int size6 = j6.size();
                        for (int i8 = 0; i8 < size6; i8++) {
                            byte[] bArr6 = j6.get(i8);
                            C50387me meVar3 = new C50387me();
                            if (bArr6 != null && bArr6.length > 0) {
                                meVar3.parseFrom(bArr6);
                            }
                            hgVar.f134607i = meVar3;
                        }
                        return 0;
                    default:
                        return -1;
                }
            } else {
                hgVar.f134609n = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
