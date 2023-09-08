package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oa2 */
public class C90428oa2 extends C49335eu3 {

    /* renamed from: d */
    public int f259718d;

    /* renamed from: e */
    public String f259719e;

    /* renamed from: f */
    public int f259720f;

    /* renamed from: g */
    public String f259721g;

    /* renamed from: h */
    public int f259722h;

    /* renamed from: i */
    public LinkedList<C51163rv3> f259723i = new LinkedList<>();

    /* renamed from: j */
    public String f259724j;

    /* renamed from: n */
    public int f259725n;

    /* renamed from: o */
    public String f259726o;

    /* renamed from: p */
    public int f259727p;

    /* renamed from: q */
    public C51018qv3 f259728q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90428oa2)) {
            return false;
        }
        C90428oa2 oa22 = (C90428oa2) aVar;
        return C46238a.m51546a(this.BaseResponse, oa22.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f259718d), Integer.valueOf(oa22.f259718d)) && C46238a.m51546a(this.f259719e, oa22.f259719e) && C46238a.m51546a(Integer.valueOf(this.f259720f), Integer.valueOf(oa22.f259720f)) && C46238a.m51546a(this.f259721g, oa22.f259721g) && C46238a.m51546a(Integer.valueOf(this.f259722h), Integer.valueOf(oa22.f259722h)) && C46238a.m51546a(this.f259723i, oa22.f259723i) && C46238a.m51546a(this.f259724j, oa22.f259724j) && C46238a.m51546a(Integer.valueOf(this.f259725n), Integer.valueOf(oa22.f259725n)) && C46238a.m51546a(this.f259726o, oa22.f259726o) && C46238a.m51546a(Integer.valueOf(this.f259727p), Integer.valueOf(oa22.f259727p)) && C46238a.m51546a(this.f259728q, oa22.f259728q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f259718d);
                String str = this.f259719e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f259720f);
                String str2 = this.f259721g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74318e(6, this.f259722h);
                aVar.mo74320g(7, 8, this.f259723i);
                String str3 = this.f259724j;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                aVar.mo74318e(9, this.f259725n);
                String str4 = this.f259726o;
                if (str4 != null) {
                    aVar.mo74323j(10, str4);
                }
                aVar.mo74318e(11, this.f259727p);
                C51018qv3 qv32 = this.f259728q;
                if (qv32 == null) {
                    return 0;
                }
                aVar.mo74322i(12, qv32.computeSize());
                this.f259728q.writeFields(aVar);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = (jaVar2 != null ? 0 + C52418a.m58682i(1, jaVar2.computeSize()) : 0) + C52418a.m58678e(2, this.f259718d);
            String str5 = this.f259719e;
            if (str5 != null) {
                i3 += C52418a.m58683j(3, str5);
            }
            int e = i3 + C52418a.m58678e(4, this.f259720f);
            String str6 = this.f259721g;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            int e2 = e + C52418a.m58678e(6, this.f259722h) + C52418a.m58680g(7, 8, this.f259723i);
            String str7 = this.f259724j;
            if (str7 != null) {
                e2 += C52418a.m58683j(8, str7);
            }
            int e3 = e2 + C52418a.m58678e(9, this.f259725n);
            String str8 = this.f259726o;
            if (str8 != null) {
                e3 += C52418a.m58683j(10, str8);
            }
            int e4 = e3 + C52418a.m58678e(11, this.f259727p);
            C51018qv3 qv33 = this.f259728q;
            return qv33 != null ? e4 + C52418a.m58682i(12, qv33.computeSize()) : e4;
        } else if (i2 == 2) {
            this.f259723i.clear();
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
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C90428oa2 oa22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        oa22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    oa22.f259718d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    oa22.f259719e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    oa22.f259720f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    oa22.f259721g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    oa22.f259722h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv32.mo73356d(bArr2);
                        }
                        oa22.f259723i.add(rv32);
                    }
                    return 0;
                case 8:
                    oa22.f259724j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    oa22.f259725n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    oa22.f259726o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    oa22.f259727p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv34.mo73348f(bArr3);
                        }
                        oa22.f259728q = qv34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
