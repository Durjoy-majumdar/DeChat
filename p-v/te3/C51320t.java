package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t */
public class C51320t extends C101820nt3 {

    /* renamed from: d */
    public String f141855d;

    /* renamed from: e */
    public long f141856e;

    /* renamed from: f */
    public int f141857f;

    /* renamed from: g */
    public String f141858g;

    /* renamed from: h */
    public String f141859h;

    /* renamed from: i */
    public String f141860i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51320t)) {
            return false;
        }
        C51320t tVar = (C51320t) aVar;
        return C46238a.m51546a(this.BaseRequest, tVar.BaseRequest) && C46238a.m51546a(this.f141855d, tVar.f141855d) && C46238a.m51546a(Long.valueOf(this.f141856e), Long.valueOf(tVar.f141856e)) && C46238a.m51546a(Integer.valueOf(this.f141857f), Integer.valueOf(tVar.f141857f)) && C46238a.m51546a(this.f141858g, tVar.f141858g) && C46238a.m51546a(this.f141859h, tVar.f141859h) && C46238a.m51546a(this.f141860i, tVar.f141860i);
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
            String str = this.f141855d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f141856e);
            aVar.mo74318e(4, this.f141857f);
            String str2 = this.f141858g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f141859h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f141860i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f141855d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int h = i2 + C52418a.m58681h(3, this.f141856e) + C52418a.m58678e(4, this.f141857f);
            String str6 = this.f141858g;
            if (str6 != null) {
                h += C52418a.m58683j(5, str6);
            }
            String str7 = this.f141859h;
            if (str7 != null) {
                h += C52418a.m58683j(6, str7);
            }
            String str8 = this.f141860i;
            return str8 != null ? h + C52418a.m58683j(7, str8) : h;
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
            C51320t tVar = objArr[1];
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
                        tVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    tVar.f141855d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    tVar.f141856e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    tVar.f141857f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    tVar.f141858g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    tVar.f141859h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    tVar.f141860i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
