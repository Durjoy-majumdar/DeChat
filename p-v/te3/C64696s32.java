package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s32 */
public class C64696s32 extends C49335eu3 {

    /* renamed from: d */
    public long f185325d;

    /* renamed from: e */
    public String f185326e;

    /* renamed from: f */
    public boolean f185327f;

    /* renamed from: g */
    public long f185328g;

    /* renamed from: h */
    public String f185329h;

    /* renamed from: i */
    public LinkedList<C22517nn> f185330i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<C22502jn> f185331j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64696s32)) {
            return false;
        }
        C64696s32 s322 = (C64696s32) aVar;
        return C46238a.m51546a(this.BaseResponse, s322.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f185325d), Long.valueOf(s322.f185325d)) && C46238a.m51546a(this.f185326e, s322.f185326e) && C46238a.m51546a(Boolean.valueOf(this.f185327f), Boolean.valueOf(s322.f185327f)) && C46238a.m51546a(Long.valueOf(this.f185328g), Long.valueOf(s322.f185328g)) && C46238a.m51546a(this.f185329h, s322.f185329h) && C46238a.m51546a(this.f185330i, s322.f185330i) && C46238a.m51546a(this.f185331j, s322.f185331j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74321h(2, this.f185325d);
                String str = this.f185326e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74314a(4, this.f185327f);
                aVar.mo74321h(5, this.f185328g);
                String str2 = this.f185329h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                aVar.mo74320g(7, 8, this.f185330i);
                aVar.mo74320g(8, 8, this.f185331j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f185325d);
            String str3 = this.f185326e;
            if (str3 != null) {
                h += C52418a.m58683j(3, str3);
            }
            int a = h + C52418a.m58674a(4, this.f185327f) + C52418a.m58681h(5, this.f185328g);
            String str4 = this.f185329h;
            if (str4 != null) {
                a += C52418a.m58683j(6, str4);
            }
            return a + C52418a.m58680g(7, 8, this.f185330i) + C52418a.m58680g(8, 8, this.f185331j);
        } else if (i == 2) {
            this.f185330i.clear();
            this.f185331j.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64696s32 s322 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        s322.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    s322.f185325d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    s322.f185326e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    s322.f185327f = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    s322.f185328g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    s322.f185329h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C22517nn nnVar = new C22517nn();
                        if (bArr2 != null && bArr2.length > 0) {
                            nnVar.parseFrom(bArr2);
                        }
                        s322.f185330i.add(nnVar);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C22502jn jnVar = new C22502jn();
                        if (bArr3 != null && bArr3.length > 0) {
                            jnVar.parseFrom(bArr3);
                        }
                        s322.f185331j.add(jnVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
