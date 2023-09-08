package p821rk;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: rk.p */
public class C48043p extends C47465a {

    /* renamed from: d */
    public C48028a f128883d;

    /* renamed from: e */
    public C48047t f128884e;

    /* renamed from: f */
    public C48040m f128885f;

    /* renamed from: g */
    public C48031d f128886g;

    /* renamed from: h */
    public C48030c f128887h;

    /* renamed from: i */
    public C48029b f128888i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48043p)) {
            return false;
        }
        C48043p pVar = (C48043p) aVar;
        return C46238a.m51546a(this.f128883d, pVar.f128883d) && C46238a.m51546a(this.f128884e, pVar.f128884e) && C46238a.m51546a(this.f128885f, pVar.f128885f) && C46238a.m51546a(this.f128886g, pVar.f128886g) && C46238a.m51546a(this.f128887h, pVar.f128887h) && C46238a.m51546a(this.f128888i, pVar.f128888i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48028a aVar2 = this.f128883d;
            if (aVar2 != null) {
                aVar.mo74322i(1, aVar2.computeSize());
                this.f128883d.writeFields(aVar);
            }
            C48047t tVar = this.f128884e;
            if (tVar != null) {
                aVar.mo74322i(2, tVar.computeSize());
                this.f128884e.writeFields(aVar);
            }
            C48040m mVar = this.f128885f;
            if (mVar != null) {
                aVar.mo74322i(3, mVar.computeSize());
                this.f128885f.writeFields(aVar);
            }
            C48031d dVar = this.f128886g;
            if (dVar != null) {
                aVar.mo74322i(4, dVar.computeSize());
                this.f128886g.writeFields(aVar);
            }
            C48030c cVar = this.f128887h;
            if (cVar != null) {
                aVar.mo74322i(5, cVar.computeSize());
                this.f128887h.writeFields(aVar);
            }
            C48029b bVar = this.f128888i;
            if (bVar != null) {
                aVar.mo74322i(6, bVar.computeSize());
                this.f128888i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C48028a aVar3 = this.f128883d;
            if (aVar3 != null) {
                i2 = 0 + C52418a.m58682i(1, aVar3.computeSize());
            }
            C48047t tVar2 = this.f128884e;
            if (tVar2 != null) {
                i2 += C52418a.m58682i(2, tVar2.computeSize());
            }
            C48040m mVar2 = this.f128885f;
            if (mVar2 != null) {
                i2 += C52418a.m58682i(3, mVar2.computeSize());
            }
            C48031d dVar2 = this.f128886g;
            if (dVar2 != null) {
                i2 += C52418a.m58682i(4, dVar2.computeSize());
            }
            C48030c cVar2 = this.f128887h;
            if (cVar2 != null) {
                i2 += C52418a.m58682i(5, cVar2.computeSize());
            }
            C48029b bVar2 = this.f128888i;
            return bVar2 != null ? i2 + C52418a.m58682i(6, bVar2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar4 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar4); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar4)) {
                if (!super.populateBuilderWithField(aVar4, this, nextFieldNumber)) {
                    aVar4.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar5 = objArr[0];
            C48043p pVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar5.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C48028a aVar6 = new C48028a();
                        if (bArr != null && bArr.length > 0) {
                            aVar6.parseFrom(bArr);
                        }
                        pVar.f128883d = aVar6;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar5.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C48047t tVar3 = new C48047t();
                        if (bArr2 != null && bArr2.length > 0) {
                            tVar3.parseFrom(bArr2);
                        }
                        pVar.f128884e = tVar3;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar5.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C48040m mVar3 = new C48040m();
                        if (bArr3 != null && bArr3.length > 0) {
                            mVar3.parseFrom(bArr3);
                        }
                        pVar.f128885f = mVar3;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar5.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C48031d dVar3 = new C48031d();
                        if (bArr4 != null && bArr4.length > 0) {
                            dVar3.parseFrom(bArr4);
                        }
                        pVar.f128886g = dVar3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar5.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C48030c cVar3 = new C48030c();
                        if (bArr5 != null && bArr5.length > 0) {
                            cVar3.parseFrom(bArr5);
                        }
                        pVar.f128887h = cVar3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar5.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C48029b bVar3 = new C48029b();
                        if (bArr6 != null && bArr6.length > 0) {
                            bVar3.parseFrom(bArr6);
                        }
                        pVar.f128888i = bVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
