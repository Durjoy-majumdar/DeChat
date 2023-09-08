package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qv0 */
public class C51016qv0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f140562d;

    /* renamed from: e */
    public String f140563e;

    /* renamed from: f */
    public C89349b f140564f;

    /* renamed from: g */
    public String f140565g;

    /* renamed from: h */
    public long f140566h;

    /* renamed from: i */
    public long f140567i;

    /* renamed from: j */
    public String f140568j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51016qv0)) {
            return false;
        }
        C51016qv0 qv02 = (C51016qv0) aVar;
        return C46238a.m51546a(this.BaseRequest, qv02.BaseRequest) && C46238a.m51546a(this.f140562d, qv02.f140562d) && C46238a.m51546a(this.f140563e, qv02.f140563e) && C46238a.m51546a(this.f140564f, qv02.f140564f) && C46238a.m51546a(this.f140565g, qv02.f140565g) && C46238a.m51546a(Long.valueOf(this.f140566h), Long.valueOf(qv02.f140566h)) && C46238a.m51546a(Long.valueOf(this.f140567i), Long.valueOf(qv02.f140567i)) && C46238a.m51546a(this.f140568j, qv02.f140568j);
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
            C49842ig0 ig02 = this.f140562d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f140562d.writeFields(aVar);
            }
            String str = this.f140563e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f140564f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            String str2 = this.f140565g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74321h(6, this.f140566h);
            aVar.mo74321h(7, this.f140567i);
            String str3 = this.f140568j;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f140562d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str4 = this.f140563e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            C89349b bVar2 = this.f140564f;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(4, bVar2);
            }
            String str5 = this.f140565g;
            if (str5 != null) {
                i2 += C52418a.m58683j(5, str5);
            }
            int h = i2 + C52418a.m58681h(6, this.f140566h) + C52418a.m58681h(7, this.f140567i);
            String str6 = this.f140568j;
            return str6 != null ? h + C52418a.m58683j(8, str6) : h;
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
            C51016qv0 qv02 = objArr[1];
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
                        qv02.BaseRequest = iaVar3;
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
                        qv02.f140562d = ig04;
                    }
                    return 0;
                case 3:
                    qv02.f140563e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qv02.f140564f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    qv02.f140565g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    qv02.f140566h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    qv02.f140567i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    qv02.f140568j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
