package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bq */
public class C48892bq extends C47465a {

    /* renamed from: d */
    public C48748aq f131251d;

    /* renamed from: e */
    public C48748aq f131252e;

    /* renamed from: f */
    public C48748aq f131253f;

    /* renamed from: g */
    public C48748aq f131254g;

    /* renamed from: h */
    public C48748aq f131255h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48892bq)) {
            return false;
        }
        C48892bq bqVar = (C48892bq) aVar;
        return C46238a.m51546a(this.f131251d, bqVar.f131251d) && C46238a.m51546a(this.f131252e, bqVar.f131252e) && C46238a.m51546a(this.f131253f, bqVar.f131253f) && C46238a.m51546a(this.f131254g, bqVar.f131254g) && C46238a.m51546a(this.f131255h, bqVar.f131255h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48748aq aqVar = this.f131251d;
            if (aqVar != null) {
                aVar.mo74322i(1, aqVar.computeSize());
                this.f131251d.writeFields(aVar);
            }
            C48748aq aqVar2 = this.f131252e;
            if (aqVar2 != null) {
                aVar.mo74322i(2, aqVar2.computeSize());
                this.f131252e.writeFields(aVar);
            }
            C48748aq aqVar3 = this.f131253f;
            if (aqVar3 != null) {
                aVar.mo74322i(3, aqVar3.computeSize());
                this.f131253f.writeFields(aVar);
            }
            C48748aq aqVar4 = this.f131254g;
            if (aqVar4 != null) {
                aVar.mo74322i(4, aqVar4.computeSize());
                this.f131254g.writeFields(aVar);
            }
            C48748aq aqVar5 = this.f131255h;
            if (aqVar5 != null) {
                aVar.mo74322i(5, aqVar5.computeSize());
                this.f131255h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C48748aq aqVar6 = this.f131251d;
            if (aqVar6 != null) {
                i2 = 0 + C52418a.m58682i(1, aqVar6.computeSize());
            }
            C48748aq aqVar7 = this.f131252e;
            if (aqVar7 != null) {
                i2 += C52418a.m58682i(2, aqVar7.computeSize());
            }
            C48748aq aqVar8 = this.f131253f;
            if (aqVar8 != null) {
                i2 += C52418a.m58682i(3, aqVar8.computeSize());
            }
            C48748aq aqVar9 = this.f131254g;
            if (aqVar9 != null) {
                i2 += C52418a.m58682i(4, aqVar9.computeSize());
            }
            C48748aq aqVar10 = this.f131255h;
            return aqVar10 != null ? i2 + C52418a.m58682i(5, aqVar10.computeSize()) : i2;
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
            C48892bq bqVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48748aq aqVar11 = new C48748aq();
                    if (bArr != null && bArr.length > 0) {
                        aqVar11.parseFrom(bArr);
                    }
                    bqVar.f131251d = aqVar11;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48748aq aqVar12 = new C48748aq();
                    if (bArr2 != null && bArr2.length > 0) {
                        aqVar12.parseFrom(bArr2);
                    }
                    bqVar.f131252e = aqVar12;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C48748aq aqVar13 = new C48748aq();
                    if (bArr3 != null && bArr3.length > 0) {
                        aqVar13.parseFrom(bArr3);
                    }
                    bqVar.f131253f = aqVar13;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C48748aq aqVar14 = new C48748aq();
                    if (bArr4 != null && bArr4.length > 0) {
                        aqVar14.parseFrom(bArr4);
                    }
                    bqVar.f131254g = aqVar14;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                int size5 = j5.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    byte[] bArr5 = j5.get(i7);
                    C48748aq aqVar15 = new C48748aq();
                    if (bArr5 != null && bArr5.length > 0) {
                        aqVar15.parseFrom(bArr5);
                    }
                    bqVar.f131255h = aqVar15;
                }
                return 0;
            }
        }
    }
}
