package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class at4 extends C101820nt3 {

    /* renamed from: d */
    public String f130765d;

    /* renamed from: e */
    public et4 f130766e;

    /* renamed from: f */
    public long f130767f;

    /* renamed from: g */
    public String f130768g;

    /* renamed from: h */
    public String f130769h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof at4)) {
            return false;
        }
        at4 at4 = (at4) aVar;
        return C46238a.m51546a(this.BaseRequest, at4.BaseRequest) && C46238a.m51546a(this.f130765d, at4.f130765d) && C46238a.m51546a(this.f130766e, at4.f130766e) && C46238a.m51546a(Long.valueOf(this.f130767f), Long.valueOf(at4.f130767f)) && C46238a.m51546a(this.f130768g, at4.f130768g) && C46238a.m51546a(this.f130769h, at4.f130769h);
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
            String str = this.f130765d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            et4 et4 = this.f130766e;
            if (et4 != null) {
                aVar.mo74322i(3, et4.computeSize());
                this.f130766e.writeFields(aVar);
            }
            aVar.mo74321h(4, this.f130767f);
            String str2 = this.f130768g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f130769h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f130765d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            et4 et42 = this.f130766e;
            if (et42 != null) {
                i2 += C52418a.m58682i(3, et42.computeSize());
            }
            int h = i2 + C52418a.m58681h(4, this.f130767f);
            String str5 = this.f130768g;
            if (str5 != null) {
                h += C52418a.m58683j(5, str5);
            }
            String str6 = this.f130769h;
            return str6 != null ? h + C52418a.m58683j(6, str6) : h;
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
            at4 at4 = objArr[1];
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
                        at4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    at4.f130765d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        et4 et43 = new et4();
                        if (bArr2 != null && bArr2.length > 0) {
                            et43.parseFrom(bArr2);
                        }
                        at4.f130766e = et43;
                    }
                    return 0;
                case 4:
                    at4.f130767f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    at4.f130768g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    at4.f130769h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
