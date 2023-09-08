package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e81 */
public class C49246e81 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f132778d;

    /* renamed from: e */
    public String f132779e;

    /* renamed from: f */
    public C89349b f132780f;

    /* renamed from: g */
    public long f132781g;

    /* renamed from: h */
    public long f132782h;

    /* renamed from: i */
    public String f132783i;

    /* renamed from: j */
    public C89349b f132784j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49246e81)) {
            return false;
        }
        C49246e81 e812 = (C49246e81) aVar;
        return C46238a.m51546a(this.BaseRequest, e812.BaseRequest) && C46238a.m51546a(this.f132778d, e812.f132778d) && C46238a.m51546a(this.f132779e, e812.f132779e) && C46238a.m51546a(this.f132780f, e812.f132780f) && C46238a.m51546a(Long.valueOf(this.f132781g), Long.valueOf(e812.f132781g)) && C46238a.m51546a(Long.valueOf(this.f132782h), Long.valueOf(e812.f132782h)) && C46238a.m51546a(this.f132783i, e812.f132783i) && C46238a.m51546a(this.f132784j, e812.f132784j);
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
            C49842ig0 ig02 = this.f132778d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f132778d.writeFields(aVar);
            }
            String str = this.f132779e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f132780f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74321h(5, this.f132781g);
            aVar.mo74321h(6, this.f132782h);
            String str2 = this.f132783i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            C89349b bVar2 = this.f132784j;
            if (bVar2 != null) {
                aVar.mo74315b(8, bVar2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f132778d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f132779e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            C89349b bVar3 = this.f132780f;
            if (bVar3 != null) {
                i2 += C52418a.m58675b(4, bVar3);
            }
            int h = i2 + C52418a.m58681h(5, this.f132781g) + C52418a.m58681h(6, this.f132782h);
            String str4 = this.f132783i;
            if (str4 != null) {
                h += C52418a.m58683j(7, str4);
            }
            C89349b bVar4 = this.f132784j;
            return bVar4 != null ? h + C52418a.m58675b(8, bVar4) : h;
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
            C49246e81 e812 = objArr[1];
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
                        e812.BaseRequest = iaVar3;
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
                        e812.f132778d = ig04;
                    }
                    return 0;
                case 3:
                    e812.f132779e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    e812.f132780f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    e812.f132781g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    e812.f132782h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    e812.f132783i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    e812.f132784j = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
