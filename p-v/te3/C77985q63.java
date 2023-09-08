package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q63 */
public class C77985q63 extends C49335eu3 {

    /* renamed from: d */
    public int f228111d;

    /* renamed from: e */
    public String f228112e;

    /* renamed from: f */
    public String f228113f;

    /* renamed from: g */
    public String f228114g;

    /* renamed from: h */
    public String f228115h;

    /* renamed from: i */
    public C50396mf3 f228116i;

    /* renamed from: j */
    public C50797p83 f228117j;

    /* renamed from: n */
    public C64398gi2 f228118n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77985q63)) {
            return false;
        }
        C77985q63 q632 = (C77985q63) aVar;
        return C46238a.m51546a(this.BaseResponse, q632.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f228111d), Integer.valueOf(q632.f228111d)) && C46238a.m51546a(this.f228112e, q632.f228112e) && C46238a.m51546a(this.f228113f, q632.f228113f) && C46238a.m51546a(this.f228114g, q632.f228114g) && C46238a.m51546a(this.f228115h, q632.f228115h) && C46238a.m51546a(this.f228116i, q632.f228116i) && C46238a.m51546a(this.f228117j, q632.f228117j) && C46238a.m51546a(this.f228118n, q632.f228118n);
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
                aVar.mo74318e(2, this.f228111d);
                String str = this.f228112e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f228113f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f228114g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f228115h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                C50396mf3 mf32 = this.f228116i;
                if (mf32 != null) {
                    aVar.mo74322i(7, mf32.computeSize());
                    this.f228116i.writeFields(aVar);
                }
                C50797p83 p832 = this.f228117j;
                if (p832 != null) {
                    aVar.mo74322i(8, p832.computeSize());
                    this.f228117j.writeFields(aVar);
                }
                C64398gi2 gi22 = this.f228118n;
                if (gi22 != null) {
                    aVar.mo74322i(9, gi22.computeSize());
                    this.f228118n.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f228111d);
            String str5 = this.f228112e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f228113f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f228114g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f228115h;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            C50396mf3 mf33 = this.f228116i;
            if (mf33 != null) {
                e += C52418a.m58682i(7, mf33.computeSize());
            }
            C50797p83 p833 = this.f228117j;
            if (p833 != null) {
                e += C52418a.m58682i(8, p833.computeSize());
            }
            C64398gi2 gi23 = this.f228118n;
            return gi23 != null ? e + C52418a.m58682i(9, gi23.computeSize()) : e;
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
            C77985q63 q632 = objArr[1];
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
                        q632.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    q632.f228111d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    q632.f228112e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    q632.f228113f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    q632.f228114g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    q632.f228115h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50396mf3 mf34 = new C50396mf3();
                        if (bArr2 != null && bArr2.length > 0) {
                            mf34.parseFrom(bArr2);
                        }
                        q632.f228116i = mf34;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50797p83 p834 = new C50797p83();
                        if (bArr3 != null && bArr3.length > 0) {
                            p834.parseFrom(bArr3);
                        }
                        q632.f228117j = p834;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C64398gi2 gi24 = new C64398gi2();
                        if (bArr4 != null && bArr4.length > 0) {
                            gi24.parseFrom(bArr4);
                        }
                        q632.f228118n = gi24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
