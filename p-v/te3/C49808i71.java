package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i71 */
public class C49808i71 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f135144d;

    /* renamed from: e */
    public String f135145e;

    /* renamed from: f */
    public C89349b f135146f;

    /* renamed from: g */
    public String f135147g;

    /* renamed from: h */
    public String f135148h;

    /* renamed from: i */
    public long f135149i;

    /* renamed from: j */
    public long f135150j;

    /* renamed from: n */
    public String f135151n;

    /* renamed from: o */
    public int f135152o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49808i71)) {
            return false;
        }
        C49808i71 i712 = (C49808i71) aVar;
        return C46238a.m51546a(this.BaseRequest, i712.BaseRequest) && C46238a.m51546a(this.f135144d, i712.f135144d) && C46238a.m51546a(this.f135145e, i712.f135145e) && C46238a.m51546a(this.f135146f, i712.f135146f) && C46238a.m51546a(this.f135147g, i712.f135147g) && C46238a.m51546a(this.f135148h, i712.f135148h) && C46238a.m51546a(Long.valueOf(this.f135149i), Long.valueOf(i712.f135149i)) && C46238a.m51546a(Long.valueOf(this.f135150j), Long.valueOf(i712.f135150j)) && C46238a.m51546a(this.f135151n, i712.f135151n) && C46238a.m51546a(Integer.valueOf(this.f135152o), Integer.valueOf(i712.f135152o));
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
            C49842ig0 ig02 = this.f135144d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f135144d.writeFields(aVar);
            }
            String str = this.f135145e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f135146f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            String str2 = this.f135147g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f135148h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74321h(7, this.f135149i);
            aVar.mo74321h(8, this.f135150j);
            String str4 = this.f135151n;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            aVar.mo74318e(10, this.f135152o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f135144d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str5 = this.f135145e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            C89349b bVar2 = this.f135146f;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(4, bVar2);
            }
            String str6 = this.f135147g;
            if (str6 != null) {
                i2 += C52418a.m58683j(5, str6);
            }
            String str7 = this.f135148h;
            if (str7 != null) {
                i2 += C52418a.m58683j(6, str7);
            }
            int h = i2 + C52418a.m58681h(7, this.f135149i) + C52418a.m58681h(8, this.f135150j);
            String str8 = this.f135151n;
            if (str8 != null) {
                h += C52418a.m58683j(9, str8);
            }
            return h + C52418a.m58678e(10, this.f135152o);
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
            C49808i71 i712 = objArr[1];
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
                        i712.BaseRequest = iaVar3;
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
                        i712.f135144d = ig04;
                    }
                    return 0;
                case 3:
                    i712.f135145e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    i712.f135146f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    i712.f135147g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    i712.f135148h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    i712.f135149i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    i712.f135150j = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    i712.f135151n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    i712.f135152o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
