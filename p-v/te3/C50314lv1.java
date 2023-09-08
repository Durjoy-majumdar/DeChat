package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lv1 */
public class C50314lv1 extends C49335eu3 {

    /* renamed from: d */
    public int f137657d;

    /* renamed from: e */
    public String f137658e;

    /* renamed from: f */
    public LinkedList<C77958k9> f137659f = new LinkedList<>();

    /* renamed from: g */
    public C51622v00 f137660g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50314lv1)) {
            return false;
        }
        C50314lv1 lv12 = (C50314lv1) aVar;
        return C46238a.m51546a(this.BaseResponse, lv12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f137657d), Integer.valueOf(lv12.f137657d)) && C46238a.m51546a(this.f137658e, lv12.f137658e) && C46238a.m51546a(this.f137659f, lv12.f137659f) && C46238a.m51546a(this.f137660g, lv12.f137660g);
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
                aVar.mo74318e(2, this.f137657d);
                String str = this.f137658e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74320g(4, 8, this.f137659f);
                C51622v00 v002 = this.f137660g;
                if (v002 != null) {
                    aVar.mo74322i(5, v002.computeSize());
                    this.f137660g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f137657d);
            String str2 = this.f137658e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            int g = e + C52418a.m58680g(4, 8, this.f137659f);
            C51622v00 v003 = this.f137660g;
            return v003 != null ? g + C52418a.m58682i(5, v003.computeSize()) : g;
        } else if (i == 2) {
            this.f137659f.clear();
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
            C50314lv1 lv12 = objArr[1];
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
                    lv12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                lv12.f137657d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                lv12.f137658e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C77958k9 k9Var = new C77958k9();
                    if (bArr2 != null && bArr2.length > 0) {
                        k9Var.parseFrom(bArr2);
                    }
                    lv12.f137659f.add(k9Var);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51622v00 v004 = new C51622v00();
                    if (bArr3 != null && bArr3.length > 0) {
                        v004.parseFrom(bArr3);
                    }
                    lv12.f137660g = v004;
                }
                return 0;
            }
        }
    }
}
