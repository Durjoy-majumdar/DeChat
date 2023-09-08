package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t31 */
public class C51338t31 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f141916d;

    /* renamed from: e */
    public String f141917e;

    /* renamed from: f */
    public C52312zv0 f141918f;

    /* renamed from: g */
    public C89349b f141919g;

    /* renamed from: h */
    public long f141920h;

    /* renamed from: i */
    public long f141921i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51338t31)) {
            return false;
        }
        C51338t31 t312 = (C51338t31) aVar;
        return C46238a.m51546a(this.BaseRequest, t312.BaseRequest) && C46238a.m51546a(this.f141916d, t312.f141916d) && C46238a.m51546a(this.f141917e, t312.f141917e) && C46238a.m51546a(this.f141918f, t312.f141918f) && C46238a.m51546a(this.f141919g, t312.f141919g) && C46238a.m51546a(Long.valueOf(this.f141920h), Long.valueOf(t312.f141920h)) && C46238a.m51546a(Long.valueOf(this.f141921i), Long.valueOf(t312.f141921i));
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
            C49842ig0 ig02 = this.f141916d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f141916d.writeFields(aVar);
            }
            String str = this.f141917e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C52312zv0 zv02 = this.f141918f;
            if (zv02 != null) {
                aVar.mo74322i(4, zv02.computeSize());
                this.f141918f.writeFields(aVar);
            }
            C89349b bVar = this.f141919g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74321h(6, this.f141920h);
            aVar.mo74321h(7, this.f141921i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f141916d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f141917e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            C52312zv0 zv03 = this.f141918f;
            if (zv03 != null) {
                i2 += C52418a.m58682i(4, zv03.computeSize());
            }
            C89349b bVar2 = this.f141919g;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(5, bVar2);
            }
            return i2 + C52418a.m58681h(6, this.f141920h) + C52418a.m58681h(7, this.f141921i);
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
            C51338t31 t312 = objArr[1];
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
                        t312.BaseRequest = iaVar3;
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
                        t312.f141916d = ig04;
                    }
                    return 0;
                case 3:
                    t312.f141917e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C52312zv0 zv04 = new C52312zv0();
                        if (bArr3 != null && bArr3.length > 0) {
                            zv04.parseFrom(bArr3);
                        }
                        t312.f141918f = zv04;
                    }
                    return 0;
                case 5:
                    t312.f141919g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    t312.f141920h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    t312.f141921i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
