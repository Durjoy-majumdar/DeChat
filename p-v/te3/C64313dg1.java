package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dg1 */
public class C64313dg1 extends C101820nt3 {

    /* renamed from: d */
    public String f182703d;

    /* renamed from: e */
    public LinkedList<C50401mh0> f182704e = new LinkedList<>();

    /* renamed from: f */
    public C49842ig0 f182705f;

    /* renamed from: g */
    public String f182706g;

    /* renamed from: h */
    public int f182707h;

    /* renamed from: i */
    public String f182708i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64313dg1)) {
            return false;
        }
        C64313dg1 dg12 = (C64313dg1) aVar;
        return C46238a.m51546a(this.BaseRequest, dg12.BaseRequest) && C46238a.m51546a(this.f182703d, dg12.f182703d) && C46238a.m51546a(this.f182704e, dg12.f182704e) && C46238a.m51546a(this.f182705f, dg12.f182705f) && C46238a.m51546a(this.f182706g, dg12.f182706g) && C46238a.m51546a(Integer.valueOf(this.f182707h), Integer.valueOf(dg12.f182707h)) && C46238a.m51546a(this.f182708i, dg12.f182708i);
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
            String str = this.f182703d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 8, this.f182704e);
            C49842ig0 ig02 = this.f182705f;
            if (ig02 != null) {
                aVar.mo74322i(4, ig02.computeSize());
                this.f182705f.writeFields(aVar);
            }
            String str2 = this.f182706g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f182707h);
            String str3 = this.f182708i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f182703d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f182704e);
            C49842ig0 ig03 = this.f182705f;
            if (ig03 != null) {
                g += C52418a.m58682i(4, ig03.computeSize());
            }
            String str5 = this.f182706g;
            if (str5 != null) {
                g += C52418a.m58683j(5, str5);
            }
            int e = g + C52418a.m58678e(6, this.f182707h);
            String str6 = this.f182708i;
            return str6 != null ? e + C52418a.m58683j(7, str6) : e;
        } else if (i == 2) {
            this.f182704e.clear();
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
            C64313dg1 dg12 = objArr[1];
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
                        dg12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    dg12.f182703d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50401mh0 mh02 = new C50401mh0();
                        if (bArr2 != null && bArr2.length > 0) {
                            mh02.parseFrom(bArr2);
                        }
                        dg12.f182704e.add(mh02);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr3 != null && bArr3.length > 0) {
                            ig04.parseFrom(bArr3);
                        }
                        dg12.f182705f = ig04;
                    }
                    return 0;
                case 5:
                    dg12.f182706g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dg12.f182707h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    dg12.f182708i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
