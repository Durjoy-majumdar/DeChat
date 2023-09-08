package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xd3 */
public class C78012xd3 extends C49335eu3 {

    /* renamed from: d */
    public int f228407d;

    /* renamed from: e */
    public String f228408e;

    /* renamed from: f */
    public LinkedList<C78017yd3> f228409f = new LinkedList<>();

    /* renamed from: g */
    public long f228410g;

    /* renamed from: h */
    public String f228411h;

    /* renamed from: i */
    public C51510u9 f228412i;

    /* renamed from: j */
    public String f228413j;

    /* renamed from: n */
    public String f228414n;

    /* renamed from: o */
    public int f228415o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78012xd3)) {
            return false;
        }
        C78012xd3 xd32 = (C78012xd3) aVar;
        return C46238a.m51546a(this.BaseResponse, xd32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f228407d), Integer.valueOf(xd32.f228407d)) && C46238a.m51546a(this.f228408e, xd32.f228408e) && C46238a.m51546a(this.f228409f, xd32.f228409f) && C46238a.m51546a(Long.valueOf(this.f228410g), Long.valueOf(xd32.f228410g)) && C46238a.m51546a(this.f228411h, xd32.f228411h) && C46238a.m51546a(this.f228412i, xd32.f228412i) && C46238a.m51546a(this.f228413j, xd32.f228413j) && C46238a.m51546a(this.f228414n, xd32.f228414n) && C46238a.m51546a(Integer.valueOf(this.f228415o), Integer.valueOf(xd32.f228415o));
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
                aVar.mo74318e(2, this.f228407d);
                String str = this.f228408e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74320g(4, 8, this.f228409f);
                aVar.mo74321h(5, this.f228410g);
                String str2 = this.f228411h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                C51510u9 u9Var = this.f228412i;
                if (u9Var != null) {
                    aVar.mo74322i(7, u9Var.computeSize());
                    this.f228412i.writeFields(aVar);
                }
                String str3 = this.f228413j;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                String str4 = this.f228414n;
                if (str4 != null) {
                    aVar.mo74323j(9, str4);
                }
                aVar.mo74318e(10, this.f228415o);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f228407d);
            String str5 = this.f228408e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int g = e + C52418a.m58680g(4, 8, this.f228409f) + C52418a.m58681h(5, this.f228410g);
            String str6 = this.f228411h;
            if (str6 != null) {
                g += C52418a.m58683j(6, str6);
            }
            C51510u9 u9Var2 = this.f228412i;
            if (u9Var2 != null) {
                g += C52418a.m58682i(7, u9Var2.computeSize());
            }
            String str7 = this.f228413j;
            if (str7 != null) {
                g += C52418a.m58683j(8, str7);
            }
            String str8 = this.f228414n;
            if (str8 != null) {
                g += C52418a.m58683j(9, str8);
            }
            return g + C52418a.m58678e(10, this.f228415o);
        } else if (i == 2) {
            this.f228409f.clear();
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
            C78012xd3 xd32 = objArr[1];
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
                        xd32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    xd32.f228407d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    xd32.f228408e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C78017yd3 yd32 = new C78017yd3();
                        if (bArr2 != null && bArr2.length > 0) {
                            yd32.parseFrom(bArr2);
                        }
                        xd32.f228409f.add(yd32);
                    }
                    return 0;
                case 5:
                    xd32.f228410g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    xd32.f228411h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51510u9 u9Var3 = new C51510u9();
                        if (bArr3 != null && bArr3.length > 0) {
                            u9Var3.parseFrom(bArr3);
                        }
                        xd32.f228412i = u9Var3;
                    }
                    return 0;
                case 8:
                    xd32.f228413j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    xd32.f228414n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    xd32.f228415o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
