package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j01 */
public class C49924j01 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f135787d;

    /* renamed from: e */
    public String f135788e;

    /* renamed from: f */
    public int f135789f;

    /* renamed from: g */
    public long f135790g;

    /* renamed from: h */
    public long f135791h;

    /* renamed from: i */
    public String f135792i;

    /* renamed from: j */
    public C89349b f135793j;

    /* renamed from: n */
    public int f135794n;

    /* renamed from: o */
    public int f135795o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49924j01)) {
            return false;
        }
        C49924j01 j012 = (C49924j01) aVar;
        return C46238a.m51546a(this.BaseRequest, j012.BaseRequest) && C46238a.m51546a(this.f135787d, j012.f135787d) && C46238a.m51546a(this.f135788e, j012.f135788e) && C46238a.m51546a(Integer.valueOf(this.f135789f), Integer.valueOf(j012.f135789f)) && C46238a.m51546a(Long.valueOf(this.f135790g), Long.valueOf(j012.f135790g)) && C46238a.m51546a(Long.valueOf(this.f135791h), Long.valueOf(j012.f135791h)) && C46238a.m51546a(this.f135792i, j012.f135792i) && C46238a.m51546a(this.f135793j, j012.f135793j) && C46238a.m51546a(Integer.valueOf(this.f135794n), Integer.valueOf(j012.f135794n)) && C46238a.m51546a(Integer.valueOf(this.f135795o), Integer.valueOf(j012.f135795o));
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
            C49842ig0 ig02 = this.f135787d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f135787d.writeFields(aVar);
            }
            String str = this.f135788e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f135789f);
            aVar.mo74321h(5, this.f135790g);
            aVar.mo74321h(6, this.f135791h);
            String str2 = this.f135792i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            C89349b bVar = this.f135793j;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            aVar.mo74318e(9, this.f135794n);
            aVar.mo74318e(10, this.f135795o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f135787d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f135788e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            int e = i2 + C52418a.m58678e(4, this.f135789f) + C52418a.m58681h(5, this.f135790g) + C52418a.m58681h(6, this.f135791h);
            String str4 = this.f135792i;
            if (str4 != null) {
                e += C52418a.m58683j(7, str4);
            }
            C89349b bVar2 = this.f135793j;
            if (bVar2 != null) {
                e += C52418a.m58675b(8, bVar2);
            }
            return e + C52418a.m58678e(9, this.f135794n) + C52418a.m58678e(10, this.f135795o);
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
            C49924j01 j012 = objArr[1];
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
                        j012.BaseRequest = iaVar3;
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
                        j012.f135787d = ig04;
                    }
                    return 0;
                case 3:
                    j012.f135788e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    j012.f135789f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    j012.f135790g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    j012.f135791h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    j012.f135792i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    j012.f135793j = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    j012.f135794n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    j012.f135795o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
