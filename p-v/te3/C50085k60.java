package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k60 */
public class C50085k60 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C50221l60> f136579d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<String> f136580e = new LinkedList<>();

    /* renamed from: f */
    public boolean f136581f;

    /* renamed from: g */
    public String f136582g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50085k60)) {
            return false;
        }
        C50085k60 k602 = (C50085k60) aVar;
        return C46238a.m51546a(this.BaseResponse, k602.BaseResponse) && C46238a.m51546a(this.f136579d, k602.f136579d) && C46238a.m51546a(this.f136580e, k602.f136580e) && C46238a.m51546a(Boolean.valueOf(this.f136581f), Boolean.valueOf(k602.f136581f)) && C46238a.m51546a(this.f136582g, k602.f136582g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f136579d);
            aVar.mo74320g(3, 1, this.f136580e);
            aVar.mo74314a(4, this.f136581f);
            String str = this.f136582g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f136579d) + C52418a.m58680g(3, 1, this.f136580e) + C52418a.m58674a(4, this.f136581f);
            String str2 = this.f136582g;
            return str2 != null ? g + C52418a.m58683j(5, str2) : g;
        } else if (i == 2) {
            this.f136579d.clear();
            this.f136580e.clear();
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
            C50085k60 k602 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    k602.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50221l60 l602 = new C50221l60();
                    if (bArr2 != null && bArr2.length > 0) {
                        l602.parseFrom(bArr2);
                    }
                    k602.f136579d.add(l602);
                }
                return 0;
            } else if (intValue == 3) {
                k602.f136580e.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 4) {
                k602.f136581f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                k602.f136582g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
