package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j */
public class C77948j extends C49335eu3 {

    /* renamed from: d */
    public int f227621d = 268513600;

    /* renamed from: e */
    public String f227622e = "请求不成功，请稍候再试";

    /* renamed from: f */
    public String f227623f;

    /* renamed from: g */
    public String f227624g;

    /* renamed from: h */
    public C77910c0 f227625h;

    /* renamed from: i */
    public C77903a f227626i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77948j)) {
            return false;
        }
        C77948j jVar = (C77948j) aVar;
        return C46238a.m51546a(this.BaseResponse, jVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f227621d), Integer.valueOf(jVar.f227621d)) && C46238a.m51546a(this.f227622e, jVar.f227622e) && C46238a.m51546a(this.f227623f, jVar.f227623f) && C46238a.m51546a(this.f227624g, jVar.f227624g) && C46238a.m51546a(this.f227625h, jVar.f227625h) && C46238a.m51546a(this.f227626i, jVar.f227626i);
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
                aVar.mo74318e(2, this.f227621d);
                String str = this.f227622e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f227623f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f227624g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                C77910c0 c0Var = this.f227625h;
                if (c0Var != null) {
                    aVar.mo74322i(6, c0Var.computeSize());
                    this.f227625h.writeFields(aVar);
                }
                C77903a aVar2 = this.f227626i;
                if (aVar2 != null) {
                    aVar.mo74322i(7, aVar2.computeSize());
                    this.f227626i.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f227621d);
            String str4 = this.f227622e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f227623f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f227624g;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            C77910c0 c0Var2 = this.f227625h;
            if (c0Var2 != null) {
                e += C52418a.m58682i(6, c0Var2.computeSize());
            }
            C77903a aVar3 = this.f227626i;
            return aVar3 != null ? e + C52418a.m58682i(7, aVar3.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar4 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar4); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar4)) {
                if (!super.populateBuilderWithField(aVar4, this, nextFieldNumber)) {
                    aVar4.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar5 = objArr[0];
            C77948j jVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar5.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        jVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    jVar.f227621d = aVar5.mo141629g(intValue);
                    return 0;
                case 3:
                    jVar.f227622e = aVar5.mo141633k(intValue);
                    return 0;
                case 4:
                    jVar.f227623f = aVar5.mo141633k(intValue);
                    return 0;
                case 5:
                    jVar.f227624g = aVar5.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar5.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77910c0 c0Var3 = new C77910c0();
                        if (bArr2 != null && bArr2.length > 0) {
                            c0Var3.parseFrom(bArr2);
                        }
                        jVar.f227625h = c0Var3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar5.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C77903a aVar6 = new C77903a();
                        if (bArr3 != null && bArr3.length > 0) {
                            aVar6.parseFrom(bArr3);
                        }
                        jVar.f227626i = aVar6;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
