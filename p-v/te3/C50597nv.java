package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nv */
public class C50597nv extends C101820nt3 {

    /* renamed from: d */
    public String f138787d;

    /* renamed from: e */
    public int f138788e;

    /* renamed from: f */
    public int f138789f;

    /* renamed from: g */
    public it4 f138790g;

    /* renamed from: h */
    public long f138791h;

    /* renamed from: i */
    public int f138792i;

    /* renamed from: j */
    public String f138793j;

    /* renamed from: n */
    public String f138794n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50597nv)) {
            return false;
        }
        C50597nv nvVar = (C50597nv) aVar;
        return C46238a.m51546a(this.BaseRequest, nvVar.BaseRequest) && C46238a.m51546a(this.f138787d, nvVar.f138787d) && C46238a.m51546a(Integer.valueOf(this.f138788e), Integer.valueOf(nvVar.f138788e)) && C46238a.m51546a(Integer.valueOf(this.f138789f), Integer.valueOf(nvVar.f138789f)) && C46238a.m51546a(this.f138790g, nvVar.f138790g) && C46238a.m51546a(Long.valueOf(this.f138791h), Long.valueOf(nvVar.f138791h)) && C46238a.m51546a(Integer.valueOf(this.f138792i), Integer.valueOf(nvVar.f138792i)) && C46238a.m51546a(this.f138793j, nvVar.f138793j) && C46238a.m51546a(this.f138794n, nvVar.f138794n);
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
            String str = this.f138787d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f138788e);
            aVar.mo74318e(4, this.f138789f);
            it4 it4 = this.f138790g;
            if (it4 != null) {
                aVar.mo74322i(5, it4.computeSize());
                this.f138790g.writeFields(aVar);
            }
            aVar.mo74321h(6, this.f138791h);
            aVar.mo74318e(7, this.f138792i);
            String str2 = this.f138793j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            String str3 = this.f138794n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f138787d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f138788e) + C52418a.m58678e(4, this.f138789f);
            it4 it42 = this.f138790g;
            if (it42 != null) {
                e += C52418a.m58682i(5, it42.computeSize());
            }
            int h = e + C52418a.m58681h(6, this.f138791h) + C52418a.m58678e(7, this.f138792i);
            String str5 = this.f138793j;
            if (str5 != null) {
                h += C52418a.m58683j(8, str5);
            }
            String str6 = this.f138794n;
            return str6 != null ? h + C52418a.m58683j(9, str6) : h;
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
            C50597nv nvVar = objArr[1];
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
                        nvVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    nvVar.f138787d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    nvVar.f138788e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    nvVar.f138789f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        it4 it43 = new it4();
                        if (bArr2 != null && bArr2.length > 0) {
                            it43.parseFrom(bArr2);
                        }
                        nvVar.f138790g = it43;
                    }
                    return 0;
                case 6:
                    nvVar.f138791h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    nvVar.f138792i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    nvVar.f138793j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    nvVar.f138794n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
