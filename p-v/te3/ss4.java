package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ss4 extends C101820nt3 {

    /* renamed from: d */
    public String f141725d;

    /* renamed from: e */
    public et4 f141726e;

    /* renamed from: f */
    public long f141727f;

    /* renamed from: g */
    public String f141728g;

    /* renamed from: h */
    public LinkedList<us4> f141729h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<et4> f141730i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ss4)) {
            return false;
        }
        ss4 ss4 = (ss4) aVar;
        return C46238a.m51546a(this.BaseRequest, ss4.BaseRequest) && C46238a.m51546a(this.f141725d, ss4.f141725d) && C46238a.m51546a(this.f141726e, ss4.f141726e) && C46238a.m51546a(Long.valueOf(this.f141727f), Long.valueOf(ss4.f141727f)) && C46238a.m51546a(this.f141728g, ss4.f141728g) && C46238a.m51546a(this.f141729h, ss4.f141729h) && C46238a.m51546a(this.f141730i, ss4.f141730i);
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
            String str = this.f141725d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            et4 et4 = this.f141726e;
            if (et4 != null) {
                aVar.mo74322i(3, et4.computeSize());
                this.f141726e.writeFields(aVar);
            }
            aVar.mo74321h(4, this.f141727f);
            String str2 = this.f141728g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74320g(6, 8, this.f141729h);
            aVar.mo74320g(7, 8, this.f141730i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f141725d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            et4 et42 = this.f141726e;
            if (et42 != null) {
                i2 += C52418a.m58682i(3, et42.computeSize());
            }
            int h = i2 + C52418a.m58681h(4, this.f141727f);
            String str4 = this.f141728g;
            if (str4 != null) {
                h += C52418a.m58683j(5, str4);
            }
            return h + C52418a.m58680g(6, 8, this.f141729h) + C52418a.m58680g(7, 8, this.f141730i);
        } else if (i == 2) {
            this.f141729h.clear();
            this.f141730i.clear();
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
            ss4 ss4 = objArr[1];
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
                        ss4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ss4.f141725d = aVar3.mo141633k(intValue);
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
                        ss4.f141726e = et43;
                    }
                    return 0;
                case 4:
                    ss4.f141727f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ss4.f141728g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        us4 us4 = new us4();
                        if (bArr3 != null && bArr3.length > 0) {
                            us4.parseFrom(bArr3);
                        }
                        ss4.f141729h.add(us4);
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        et4 et44 = new et4();
                        if (bArr4 != null && bArr4.length > 0) {
                            et44.parseFrom(bArr4);
                        }
                        ss4.f141730i.add(et44);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
