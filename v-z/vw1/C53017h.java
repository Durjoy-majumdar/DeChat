package vw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.h */
public class C53017h extends C49335eu3 {

    /* renamed from: d */
    public int f147981d;

    /* renamed from: e */
    public String f147982e;

    /* renamed from: f */
    public String f147983f;

    /* renamed from: g */
    public boolean f147984g = false;

    /* renamed from: h */
    public int f147985h;

    /* renamed from: i */
    public String f147986i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53017h)) {
            return false;
        }
        C53017h hVar = (C53017h) aVar;
        return C46238a.m51546a(this.BaseResponse, hVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f147981d), Integer.valueOf(hVar.f147981d)) && C46238a.m51546a(this.f147982e, hVar.f147982e) && C46238a.m51546a(this.f147983f, hVar.f147983f) && C46238a.m51546a(Boolean.valueOf(this.f147984g), Boolean.valueOf(hVar.f147984g)) && C46238a.m51546a(Integer.valueOf(this.f147985h), Integer.valueOf(hVar.f147985h)) && C46238a.m51546a(this.f147986i, hVar.f147986i);
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
                aVar.mo74318e(2, this.f147981d);
                String str = this.f147982e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f147983f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74314a(5, this.f147984g);
                aVar.mo74318e(6, this.f147985h);
                String str3 = this.f147986i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f147981d);
            String str4 = this.f147982e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f147983f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            int a = e + C52418a.m58674a(5, this.f147984g) + C52418a.m58678e(6, this.f147985h);
            String str6 = this.f147986i;
            return str6 != null ? a + C52418a.m58683j(7, str6) : a;
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
            C53017h hVar = objArr[1];
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
                        hVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    hVar.f147981d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    hVar.f147982e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hVar.f147983f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hVar.f147984g = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    hVar.f147985h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    hVar.f147986i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
