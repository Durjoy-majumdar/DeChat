package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jo0 */
public class C50016jo0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f136220d;

    /* renamed from: e */
    public long f136221e;

    /* renamed from: f */
    public String f136222f;

    /* renamed from: g */
    public long f136223g;

    /* renamed from: h */
    public String f136224h;

    /* renamed from: i */
    public C89349b f136225i;

    /* renamed from: j */
    public int f136226j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50016jo0)) {
            return false;
        }
        C50016jo0 jo02 = (C50016jo0) aVar;
        return C46238a.m51546a(this.BaseRequest, jo02.BaseRequest) && C46238a.m51546a(this.f136220d, jo02.f136220d) && C46238a.m51546a(Long.valueOf(this.f136221e), Long.valueOf(jo02.f136221e)) && C46238a.m51546a(this.f136222f, jo02.f136222f) && C46238a.m51546a(Long.valueOf(this.f136223g), Long.valueOf(jo02.f136223g)) && C46238a.m51546a(this.f136224h, jo02.f136224h) && C46238a.m51546a(this.f136225i, jo02.f136225i) && C46238a.m51546a(Integer.valueOf(this.f136226j), Integer.valueOf(jo02.f136226j));
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
            C49842ig0 ig02 = this.f136220d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f136220d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f136221e);
            String str = this.f136222f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74321h(5, this.f136223g);
            String str2 = this.f136224h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            C89349b bVar = this.f136225i;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            aVar.mo74318e(8, this.f136226j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f136220d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f136221e);
            String str3 = this.f136222f;
            if (str3 != null) {
                h += C52418a.m58683j(4, str3);
            }
            int h2 = h + C52418a.m58681h(5, this.f136223g);
            String str4 = this.f136224h;
            if (str4 != null) {
                h2 += C52418a.m58683j(6, str4);
            }
            C89349b bVar2 = this.f136225i;
            if (bVar2 != null) {
                h2 += C52418a.m58675b(7, bVar2);
            }
            return h2 + C52418a.m58678e(8, this.f136226j);
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
            C50016jo0 jo02 = objArr[1];
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
                        jo02.BaseRequest = iaVar3;
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
                        jo02.f136220d = ig04;
                    }
                    return 0;
                case 3:
                    jo02.f136221e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    jo02.f136222f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    jo02.f136223g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    jo02.f136224h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    jo02.f136225i = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    jo02.f136226j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
