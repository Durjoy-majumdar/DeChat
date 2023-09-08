package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ck1 */
public class C49013ck1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f131789d;

    /* renamed from: e */
    public String f131790e;

    /* renamed from: f */
    public C89349b f131791f;

    /* renamed from: g */
    public int f131792g;

    /* renamed from: h */
    public String f131793h;

    /* renamed from: i */
    public LinkedList<String> f131794i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49013ck1)) {
            return false;
        }
        C49013ck1 ck12 = (C49013ck1) aVar;
        return C46238a.m51546a(this.BaseRequest, ck12.BaseRequest) && C46238a.m51546a(this.f131789d, ck12.f131789d) && C46238a.m51546a(this.f131790e, ck12.f131790e) && C46238a.m51546a(this.f131791f, ck12.f131791f) && C46238a.m51546a(Integer.valueOf(this.f131792g), Integer.valueOf(ck12.f131792g)) && C46238a.m51546a(this.f131793h, ck12.f131793h) && C46238a.m51546a(this.f131794i, ck12.f131794i);
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
            C49842ig0 ig02 = this.f131789d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f131789d.writeFields(aVar);
            }
            String str = this.f131790e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f131791f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f131792g);
            String str2 = this.f131793h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74320g(7, 1, this.f131794i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f131789d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f131790e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            C89349b bVar2 = this.f131791f;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(4, bVar2);
            }
            int e = i2 + C52418a.m58678e(5, this.f131792g);
            String str4 = this.f131793h;
            if (str4 != null) {
                e += C52418a.m58683j(6, str4);
            }
            return e + C52418a.m58680g(7, 1, this.f131794i);
        } else if (i == 2) {
            this.f131794i.clear();
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
            C49013ck1 ck12 = objArr[1];
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
                        ck12.BaseRequest = iaVar3;
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
                        ck12.f131789d = ig04;
                    }
                    return 0;
                case 3:
                    ck12.f131790e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ck12.f131791f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    ck12.f131792g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ck12.f131793h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ck12.f131794i.add(aVar3.mo141633k(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
