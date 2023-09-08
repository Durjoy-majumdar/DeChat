package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pd */
public class C101827pd extends C47465a {

    /* renamed from: d */
    public C101795jm f299141d;

    /* renamed from: e */
    public C101795jm f299142e;

    /* renamed from: f */
    public C101795jm f299143f;

    /* renamed from: g */
    public C51018qv3 f299144g;

    /* renamed from: h */
    public C51018qv3 f299145h;

    /* renamed from: i */
    public C101795jm f299146i;

    /* renamed from: j */
    public int f299147j;

    /* renamed from: n */
    public C101788im f299148n;

    /* renamed from: o */
    public C101788im f299149o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101827pd)) {
            return false;
        }
        C101827pd pdVar = (C101827pd) aVar;
        return C46238a.m51546a(this.f299141d, pdVar.f299141d) && C46238a.m51546a(this.f299142e, pdVar.f299142e) && C46238a.m51546a(this.f299143f, pdVar.f299143f) && C46238a.m51546a(this.f299144g, pdVar.f299144g) && C46238a.m51546a(this.f299145h, pdVar.f299145h) && C46238a.m51546a(this.f299146i, pdVar.f299146i) && C46238a.m51546a(Integer.valueOf(this.f299147j), Integer.valueOf(pdVar.f299147j)) && C46238a.m51546a(this.f299148n, pdVar.f299148n) && C46238a.m51546a(this.f299149o, pdVar.f299149o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C101795jm jmVar = this.f299141d;
            if (jmVar != null) {
                aVar.mo74322i(1, jmVar.computeSize());
                this.f299141d.writeFields(aVar);
            }
            C101795jm jmVar2 = this.f299142e;
            if (jmVar2 != null) {
                aVar.mo74322i(2, jmVar2.computeSize());
                this.f299142e.writeFields(aVar);
            }
            C101795jm jmVar3 = this.f299143f;
            if (jmVar3 != null) {
                aVar.mo74322i(4, jmVar3.computeSize());
                this.f299143f.writeFields(aVar);
            }
            C51018qv3 qv32 = this.f299144g;
            if (qv32 != null) {
                aVar.mo74322i(5, qv32.computeSize());
                this.f299144g.writeFields(aVar);
            }
            C51018qv3 qv33 = this.f299145h;
            if (qv33 != null) {
                aVar.mo74322i(6, qv33.computeSize());
                this.f299145h.writeFields(aVar);
            }
            C101795jm jmVar4 = this.f299146i;
            if (jmVar4 != null) {
                aVar.mo74322i(7, jmVar4.computeSize());
                this.f299146i.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f299147j);
            C101788im imVar = this.f299148n;
            if (imVar != null) {
                aVar.mo74322i(9, imVar.computeSize());
                this.f299148n.writeFields(aVar);
            }
            C101788im imVar2 = this.f299149o;
            if (imVar2 != null) {
                aVar.mo74322i(10, imVar2.computeSize());
                this.f299149o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C101795jm jmVar5 = this.f299141d;
            if (jmVar5 != null) {
                i2 = 0 + C52418a.m58682i(1, jmVar5.computeSize());
            }
            C101795jm jmVar6 = this.f299142e;
            if (jmVar6 != null) {
                i2 += C52418a.m58682i(2, jmVar6.computeSize());
            }
            C101795jm jmVar7 = this.f299143f;
            if (jmVar7 != null) {
                i2 += C52418a.m58682i(4, jmVar7.computeSize());
            }
            C51018qv3 qv34 = this.f299144g;
            if (qv34 != null) {
                i2 += C52418a.m58682i(5, qv34.computeSize());
            }
            C51018qv3 qv35 = this.f299145h;
            if (qv35 != null) {
                i2 += C52418a.m58682i(6, qv35.computeSize());
            }
            C101795jm jmVar8 = this.f299146i;
            if (jmVar8 != null) {
                i2 += C52418a.m58682i(7, jmVar8.computeSize());
            }
            int e = i2 + C52418a.m58678e(8, this.f299147j);
            C101788im imVar3 = this.f299148n;
            if (imVar3 != null) {
                e += C52418a.m58682i(9, imVar3.computeSize());
            }
            C101788im imVar4 = this.f299149o;
            return imVar4 != null ? e + C52418a.m58682i(10, imVar4.computeSize()) : e;
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
            C101827pd pdVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C101795jm jmVar9 = new C101795jm();
                        if (bArr != null && bArr.length > 0) {
                            jmVar9.parseFrom(bArr);
                        }
                        pdVar.f299141d = jmVar9;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C101795jm jmVar10 = new C101795jm();
                        if (bArr2 != null && bArr2.length > 0) {
                            jmVar10.parseFrom(bArr2);
                        }
                        pdVar.f299142e = jmVar10;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C101795jm jmVar11 = new C101795jm();
                        if (bArr3 != null && bArr3.length > 0) {
                            jmVar11.parseFrom(bArr3);
                        }
                        pdVar.f299143f = jmVar11;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv36.mo73348f(bArr4);
                        }
                        pdVar.f299144g = qv36;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv37.mo73348f(bArr5);
                        }
                        pdVar.f299145h = qv37;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C101795jm jmVar12 = new C101795jm();
                        if (bArr6 != null && bArr6.length > 0) {
                            jmVar12.parseFrom(bArr6);
                        }
                        pdVar.f299146i = jmVar12;
                    }
                    return 0;
                case 8:
                    pdVar.f299147j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C101788im imVar5 = new C101788im();
                        if (bArr7 != null && bArr7.length > 0) {
                            imVar5.parseFrom(bArr7);
                        }
                        pdVar.f299148n = imVar5;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C101788im imVar6 = new C101788im();
                        if (bArr8 != null && bArr8.length > 0) {
                            imVar6.parseFrom(bArr8);
                        }
                        pdVar.f299149o = imVar6;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
