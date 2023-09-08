package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kv */
public class C64501kv extends C49335eu3 {

    /* renamed from: d */
    public int f183983d;

    /* renamed from: e */
    public String f183984e;

    /* renamed from: f */
    public String f183985f;

    /* renamed from: g */
    public C64607oc3 f183986g;

    /* renamed from: h */
    public String f183987h;

    /* renamed from: i */
    public ci4 f183988i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64501kv)) {
            return false;
        }
        C64501kv kvVar = (C64501kv) aVar;
        return C46238a.m51546a(this.BaseResponse, kvVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f183983d), Integer.valueOf(kvVar.f183983d)) && C46238a.m51546a(this.f183984e, kvVar.f183984e) && C46238a.m51546a(this.f183985f, kvVar.f183985f) && C46238a.m51546a(this.f183986g, kvVar.f183986g) && C46238a.m51546a(this.f183987h, kvVar.f183987h) && C46238a.m51546a(this.f183988i, kvVar.f183988i);
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
                aVar.mo74318e(2, this.f183983d);
                String str = this.f183984e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f183985f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                C64607oc3 oc32 = this.f183986g;
                if (oc32 != null) {
                    aVar.mo74322i(5, oc32.computeSize());
                    this.f183986g.writeFields(aVar);
                }
                String str3 = this.f183987h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                ci4 ci4 = this.f183988i;
                if (ci4 != null) {
                    aVar.mo74322i(7, ci4.computeSize());
                    this.f183988i.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f183983d);
            String str4 = this.f183984e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f183985f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            C64607oc3 oc33 = this.f183986g;
            if (oc33 != null) {
                e += C52418a.m58682i(5, oc33.computeSize());
            }
            String str6 = this.f183987h;
            if (str6 != null) {
                e += C52418a.m58683j(6, str6);
            }
            ci4 ci42 = this.f183988i;
            return ci42 != null ? e + C52418a.m58682i(7, ci42.computeSize()) : e;
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
            C64501kv kvVar = objArr[1];
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
                        kvVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    kvVar.f183983d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    kvVar.f183984e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    kvVar.f183985f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64607oc3 oc34 = new C64607oc3();
                        if (bArr2 != null && bArr2.length > 0) {
                            oc34.parseFrom(bArr2);
                        }
                        kvVar.f183986g = oc34;
                    }
                    return 0;
                case 6:
                    kvVar.f183987h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        ci4 ci43 = new ci4();
                        if (bArr3 != null && bArr3.length > 0) {
                            ci43.parseFrom(bArr3);
                        }
                        kvVar.f183988i = ci43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
