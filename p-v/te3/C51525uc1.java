package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uc1 */
public class C51525uc1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f142734d;

    /* renamed from: e */
    public long f142735e;

    /* renamed from: f */
    public int f142736f;

    /* renamed from: g */
    public long f142737g;

    /* renamed from: h */
    public String f142738h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51525uc1)) {
            return false;
        }
        C51525uc1 uc12 = (C51525uc1) aVar;
        return C46238a.m51546a(this.BaseRequest, uc12.BaseRequest) && C46238a.m51546a(this.f142734d, uc12.f142734d) && C46238a.m51546a(Long.valueOf(this.f142735e), Long.valueOf(uc12.f142735e)) && C46238a.m51546a(Integer.valueOf(this.f142736f), Integer.valueOf(uc12.f142736f)) && C46238a.m51546a(Long.valueOf(this.f142737g), Long.valueOf(uc12.f142737g)) && C46238a.m51546a(this.f142738h, uc12.f142738h);
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
            C49842ig0 ig02 = this.f142734d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f142734d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f142735e);
            aVar.mo74318e(4, this.f142736f);
            aVar.mo74321h(5, this.f142737g);
            String str = this.f142738h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f142734d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f142735e) + C52418a.m58678e(4, this.f142736f) + C52418a.m58681h(5, this.f142737g);
            String str2 = this.f142738h;
            return str2 != null ? h + C52418a.m58683j(6, str2) : h;
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
            C51525uc1 uc12 = objArr[1];
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
                        uc12.BaseRequest = iaVar3;
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
                        uc12.f142734d = ig04;
                    }
                    return 0;
                case 3:
                    uc12.f142735e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    uc12.f142736f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    uc12.f142737g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    uc12.f142738h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
