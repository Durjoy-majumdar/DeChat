package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qj0 */
public class C50968qj0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f140344d;

    /* renamed from: e */
    public String f140345e;

    /* renamed from: f */
    public long f140346f;

    /* renamed from: g */
    public C89349b f140347g;

    /* renamed from: h */
    public long f140348h;

    /* renamed from: i */
    public long f140349i;

    /* renamed from: j */
    public int f140350j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50968qj0)) {
            return false;
        }
        C50968qj0 qj02 = (C50968qj0) aVar;
        return C46238a.m51546a(this.BaseRequest, qj02.BaseRequest) && C46238a.m51546a(this.f140344d, qj02.f140344d) && C46238a.m51546a(this.f140345e, qj02.f140345e) && C46238a.m51546a(Long.valueOf(this.f140346f), Long.valueOf(qj02.f140346f)) && C46238a.m51546a(this.f140347g, qj02.f140347g) && C46238a.m51546a(Long.valueOf(this.f140348h), Long.valueOf(qj02.f140348h)) && C46238a.m51546a(Long.valueOf(this.f140349i), Long.valueOf(qj02.f140349i)) && C46238a.m51546a(Integer.valueOf(this.f140350j), Integer.valueOf(qj02.f140350j));
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
            C49842ig0 ig02 = this.f140344d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f140344d.writeFields(aVar);
            }
            String str = this.f140345e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f140346f);
            C89349b bVar = this.f140347g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74321h(6, this.f140348h);
            aVar.mo74321h(7, this.f140349i);
            aVar.mo74318e(8, this.f140350j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f140344d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f140345e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            int h = i2 + C52418a.m58681h(4, this.f140346f);
            C89349b bVar2 = this.f140347g;
            if (bVar2 != null) {
                h += C52418a.m58675b(5, bVar2);
            }
            return h + C52418a.m58681h(6, this.f140348h) + C52418a.m58681h(7, this.f140349i) + C52418a.m58678e(8, this.f140350j);
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
            C50968qj0 qj02 = objArr[1];
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
                        qj02.BaseRequest = iaVar3;
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
                        qj02.f140344d = ig04;
                    }
                    return 0;
                case 3:
                    qj02.f140345e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qj02.f140346f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    qj02.f140347g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    qj02.f140348h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    qj02.f140349i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    qj02.f140350j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
