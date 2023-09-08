package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w62 */
public class C51791w62 extends C49335eu3 {

    /* renamed from: d */
    public C51018qv3 f143885d;

    /* renamed from: e */
    public int f143886e;

    /* renamed from: f */
    public String f143887f;

    /* renamed from: g */
    public String f143888g;

    /* renamed from: h */
    public String f143889h;

    /* renamed from: i */
    public String f143890i;

    /* renamed from: j */
    public int f143891j;

    /* renamed from: n */
    public LinkedList<C52126yj3> f143892n = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51791w62)) {
            return false;
        }
        C51791w62 w622 = (C51791w62) aVar;
        return C46238a.m51546a(this.BaseResponse, w622.BaseResponse) && C46238a.m51546a(this.f143885d, w622.f143885d) && C46238a.m51546a(Integer.valueOf(this.f143886e), Integer.valueOf(w622.f143886e)) && C46238a.m51546a(this.f143887f, w622.f143887f) && C46238a.m51546a(this.f143888g, w622.f143888g) && C46238a.m51546a(this.f143889h, w622.f143889h) && C46238a.m51546a(this.f143890i, w622.f143890i) && C46238a.m51546a(Integer.valueOf(this.f143891j), Integer.valueOf(w622.f143891j)) && C46238a.m51546a(this.f143892n, w622.f143892n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f143885d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f143885d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f143885d.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f143886e);
                String str = this.f143887f;
                if (str != null) {
                    aVar.mo74323j(6, str);
                }
                String str2 = this.f143888g;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                String str3 = this.f143889h;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                String str4 = this.f143890i;
                if (str4 != null) {
                    aVar.mo74323j(9, str4);
                }
                aVar.mo74318e(10, this.f143891j);
                aVar.mo74320g(11, 8, this.f143892n);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: QRCode");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51018qv3 qv33 = this.f143885d;
            if (qv33 != null) {
                i2 += C52418a.m58682i(2, qv33.computeSize());
            }
            int e = i2 + C52418a.m58678e(5, this.f143886e);
            String str5 = this.f143887f;
            if (str5 != null) {
                e += C52418a.m58683j(6, str5);
            }
            String str6 = this.f143888g;
            if (str6 != null) {
                e += C52418a.m58683j(7, str6);
            }
            String str7 = this.f143889h;
            if (str7 != null) {
                e += C52418a.m58683j(8, str7);
            }
            String str8 = this.f143890i;
            if (str8 != null) {
                e += C52418a.m58683j(9, str8);
            }
            return e + C52418a.m58678e(10, this.f143891j) + C52418a.m58680g(11, 8, this.f143892n);
        } else if (i == 2) {
            this.f143892n.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f143885d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: QRCode");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51791w62 w622 = objArr[1];
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
                    w622.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                switch (intValue) {
                    case 5:
                        w622.f143886e = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        w622.f143887f = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        w622.f143888g = aVar3.mo141633k(intValue);
                        return 0;
                    case 8:
                        w622.f143889h = aVar3.mo141633k(intValue);
                        return 0;
                    case 9:
                        w622.f143890i = aVar3.mo141633k(intValue);
                        return 0;
                    case 10:
                        w622.f143891j = aVar3.mo141629g(intValue);
                        return 0;
                    case 11:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            C52126yj3 yj32 = new C52126yj3();
                            if (bArr2 != null && bArr2.length > 0) {
                                yj32.parseFrom(bArr2);
                            }
                            w622.f143892n.add(yj32);
                        }
                        return 0;
                    default:
                        return -1;
                }
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        qv34.mo73348f(bArr3);
                    }
                    w622.f143885d = qv34;
                }
                return 0;
            }
        }
    }
}
