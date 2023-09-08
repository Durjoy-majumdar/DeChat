package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fk1 */
public class C49435fk1 extends C101820nt3 {

    /* renamed from: d */
    public String f133557d;

    /* renamed from: e */
    public int f133558e;

    /* renamed from: f */
    public C89349b f133559f;

    /* renamed from: g */
    public int f133560g;

    /* renamed from: h */
    public String f133561h;

    /* renamed from: i */
    public C49842ig0 f133562i;

    /* renamed from: j */
    public C89349b f133563j;

    /* renamed from: n */
    public C89349b f133564n;

    /* renamed from: o */
    public C89349b f133565o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49435fk1)) {
            return false;
        }
        C49435fk1 fk12 = (C49435fk1) aVar;
        return C46238a.m51546a(this.BaseRequest, fk12.BaseRequest) && C46238a.m51546a(this.f133557d, fk12.f133557d) && C46238a.m51546a(Integer.valueOf(this.f133558e), Integer.valueOf(fk12.f133558e)) && C46238a.m51546a(this.f133559f, fk12.f133559f) && C46238a.m51546a(Integer.valueOf(this.f133560g), Integer.valueOf(fk12.f133560g)) && C46238a.m51546a(this.f133561h, fk12.f133561h) && C46238a.m51546a(this.f133562i, fk12.f133562i) && C46238a.m51546a(this.f133563j, fk12.f133563j) && C46238a.m51546a(this.f133564n, fk12.f133564n) && C46238a.m51546a(this.f133565o, fk12.f133565o);
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
            String str = this.f133557d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f133558e);
            C89349b bVar = this.f133559f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f133560g);
            String str2 = this.f133561h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            C49842ig0 ig02 = this.f133562i;
            if (ig02 != null) {
                aVar.mo74322i(7, ig02.computeSize());
                this.f133562i.writeFields(aVar);
            }
            C89349b bVar2 = this.f133563j;
            if (bVar2 != null) {
                aVar.mo74315b(8, bVar2);
            }
            C89349b bVar3 = this.f133564n;
            if (bVar3 != null) {
                aVar.mo74315b(9, bVar3);
            }
            C89349b bVar4 = this.f133565o;
            if (bVar4 != null) {
                aVar.mo74315b(10, bVar4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f133557d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f133558e);
            C89349b bVar5 = this.f133559f;
            if (bVar5 != null) {
                e += C52418a.m58675b(4, bVar5);
            }
            int e2 = e + C52418a.m58678e(5, this.f133560g);
            String str4 = this.f133561h;
            if (str4 != null) {
                e2 += C52418a.m58683j(6, str4);
            }
            C49842ig0 ig03 = this.f133562i;
            if (ig03 != null) {
                e2 += C52418a.m58682i(7, ig03.computeSize());
            }
            C89349b bVar6 = this.f133563j;
            if (bVar6 != null) {
                e2 += C52418a.m58675b(8, bVar6);
            }
            C89349b bVar7 = this.f133564n;
            if (bVar7 != null) {
                e2 += C52418a.m58675b(9, bVar7);
            }
            C89349b bVar8 = this.f133565o;
            return bVar8 != null ? e2 + C52418a.m58675b(10, bVar8) : e2;
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
            C49435fk1 fk12 = objArr[1];
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
                        fk12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    fk12.f133557d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fk12.f133558e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    fk12.f133559f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    fk12.f133560g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    fk12.f133561h = aVar3.mo141633k(intValue);
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
                        fk12.f133562i = ig04;
                    }
                    return 0;
                case 8:
                    fk12.f133563j = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    fk12.f133564n = aVar3.mo141626d(intValue);
                    return 0;
                case 10:
                    fk12.f133565o = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
