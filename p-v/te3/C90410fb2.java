package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fb2 */
public class C90410fb2 extends C49335eu3 {

    /* renamed from: d */
    public cp4 f259509d;

    /* renamed from: e */
    public String f259510e;

    /* renamed from: f */
    public String f259511f;

    /* renamed from: g */
    public C90429p4 f259512g;

    /* renamed from: h */
    public gp4 f259513h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90410fb2)) {
            return false;
        }
        C90410fb2 fb22 = (C90410fb2) aVar;
        return C46238a.m51546a(this.BaseResponse, fb22.BaseResponse) && C46238a.m51546a(this.f259509d, fb22.f259509d) && C46238a.m51546a(this.f259510e, fb22.f259510e) && C46238a.m51546a(this.f259511f, fb22.f259511f) && C46238a.m51546a(this.f259512g, fb22.f259512g) && C46238a.m51546a(this.f259513h, fb22.f259513h);
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
                cp4 cp4 = this.f259509d;
                if (cp4 != null) {
                    aVar.mo74322i(2, cp4.computeSize());
                    this.f259509d.writeFields(aVar);
                }
                String str = this.f259510e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f259511f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                C90429p4 p4Var = this.f259512g;
                if (p4Var != null) {
                    aVar.mo74322i(5, p4Var.computeSize());
                    this.f259512g.writeFields(aVar);
                }
                gp4 gp4 = this.f259513h;
                if (gp4 != null) {
                    aVar.mo74322i(6, gp4.computeSize());
                    this.f259513h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            cp4 cp42 = this.f259509d;
            if (cp42 != null) {
                i2 += C52418a.m58682i(2, cp42.computeSize());
            }
            String str3 = this.f259510e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            String str4 = this.f259511f;
            if (str4 != null) {
                i2 += C52418a.m58683j(4, str4);
            }
            C90429p4 p4Var2 = this.f259512g;
            if (p4Var2 != null) {
                i2 += C52418a.m58682i(5, p4Var2.computeSize());
            }
            gp4 gp42 = this.f259513h;
            return gp42 != null ? i2 + C52418a.m58682i(6, gp42.computeSize()) : i2;
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
            C90410fb2 fb22 = objArr[1];
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
                        fb22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        cp4 cp43 = new cp4();
                        if (bArr2 != null && bArr2.length > 0) {
                            cp43.parseFrom(bArr2);
                        }
                        fb22.f259509d = cp43;
                    }
                    return 0;
                case 3:
                    fb22.f259510e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fb22.f259511f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C90429p4 p4Var3 = new C90429p4();
                        if (bArr3 != null && bArr3.length > 0) {
                            p4Var3.parseFrom(bArr3);
                        }
                        fb22.f259512g = p4Var3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        gp4 gp43 = new gp4();
                        if (bArr4 != null && bArr4.length > 0) {
                            gp43.parseFrom(bArr4);
                        }
                        fb22.f259513h = gp43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
