package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mg1 */
public class C50398mg1 extends C101820nt3 {

    /* renamed from: d */
    public String f138015d;

    /* renamed from: e */
    public long f138016e;

    /* renamed from: f */
    public String f138017f;

    /* renamed from: g */
    public C89349b f138018g;

    /* renamed from: h */
    public String f138019h;

    /* renamed from: i */
    public C49842ig0 f138020i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50398mg1)) {
            return false;
        }
        C50398mg1 mg12 = (C50398mg1) aVar;
        return C46238a.m51546a(this.BaseRequest, mg12.BaseRequest) && C46238a.m51546a(this.f138015d, mg12.f138015d) && C46238a.m51546a(Long.valueOf(this.f138016e), Long.valueOf(mg12.f138016e)) && C46238a.m51546a(this.f138017f, mg12.f138017f) && C46238a.m51546a(this.f138018g, mg12.f138018g) && C46238a.m51546a(this.f138019h, mg12.f138019h) && C46238a.m51546a(this.f138020i, mg12.f138020i);
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
            String str = this.f138015d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f138016e);
            String str2 = this.f138017f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C89349b bVar = this.f138018g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            String str3 = this.f138019h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            C49842ig0 ig02 = this.f138020i;
            if (ig02 != null) {
                aVar.mo74322i(7, ig02.computeSize());
                this.f138020i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f138015d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int h = i2 + C52418a.m58681h(3, this.f138016e);
            String str5 = this.f138017f;
            if (str5 != null) {
                h += C52418a.m58683j(4, str5);
            }
            C89349b bVar2 = this.f138018g;
            if (bVar2 != null) {
                h += C52418a.m58675b(5, bVar2);
            }
            String str6 = this.f138019h;
            if (str6 != null) {
                h += C52418a.m58683j(6, str6);
            }
            C49842ig0 ig03 = this.f138020i;
            return ig03 != null ? h + C52418a.m58682i(7, ig03.computeSize()) : h;
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
            C50398mg1 mg12 = objArr[1];
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
                        mg12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    mg12.f138015d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    mg12.f138016e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    mg12.f138017f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    mg12.f138018g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    mg12.f138019h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        mg12.f138020i = ig04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
