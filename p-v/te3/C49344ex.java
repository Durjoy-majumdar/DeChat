package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ex */
public class C49344ex extends C49335eu3 {

    /* renamed from: d */
    public int f133151d;

    /* renamed from: e */
    public String f133152e;

    /* renamed from: f */
    public C52159yr2 f133153f;

    /* renamed from: g */
    public String f133154g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49344ex)) {
            return false;
        }
        C49344ex exVar = (C49344ex) aVar;
        return C46238a.m51546a(this.BaseResponse, exVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f133151d), Integer.valueOf(exVar.f133151d)) && C46238a.m51546a(this.f133152e, exVar.f133152e) && C46238a.m51546a(this.f133153f, exVar.f133153f) && C46238a.m51546a(this.f133154g, exVar.f133154g);
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
                aVar.mo74318e(2, this.f133151d);
                String str = this.f133152e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C52159yr2 yr22 = this.f133153f;
                if (yr22 != null) {
                    aVar.mo74322i(99, yr22.computeSize());
                    this.f133153f.writeFields(aVar);
                }
                String str2 = this.f133154g;
                if (str2 != null) {
                    aVar.mo74323j(100, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f133151d);
            String str3 = this.f133152e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            C52159yr2 yr23 = this.f133153f;
            if (yr23 != null) {
                e += C52418a.m58682i(99, yr23.computeSize());
            }
            String str4 = this.f133154g;
            return str4 != null ? e + C52418a.m58683j(100, str4) : e;
        } else if (i == 2) {
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
            C49344ex exVar = objArr[1];
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
                    exVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                exVar.f133151d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                exVar.f133152e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 99) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52159yr2 yr24 = new C52159yr2();
                    if (bArr2 != null && bArr2.length > 0) {
                        yr24.parseFrom(bArr2);
                    }
                    exVar.f133153f = yr24;
                }
                return 0;
            } else if (intValue != 100) {
                return -1;
            } else {
                exVar.f133154g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
