package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dk */
public class C49155dk extends C101820nt3 {

    /* renamed from: d */
    public eh4 f132370d;

    /* renamed from: e */
    public C77925f4 f132371e;

    /* renamed from: f */
    public String f132372f;

    /* renamed from: g */
    public int f132373g;

    /* renamed from: h */
    public String f132374h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49155dk)) {
            return false;
        }
        C49155dk dkVar = (C49155dk) aVar;
        return C46238a.m51546a(this.BaseRequest, dkVar.BaseRequest) && C46238a.m51546a(this.f132370d, dkVar.f132370d) && C46238a.m51546a(this.f132371e, dkVar.f132371e) && C46238a.m51546a(this.f132372f, dkVar.f132372f) && C46238a.m51546a(Integer.valueOf(this.f132373g), Integer.valueOf(dkVar.f132373g)) && C46238a.m51546a(this.f132374h, dkVar.f132374h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f132370d == null) {
                throw new C52419b("Not all required fields were included: tock_mess");
            } else if (this.f132371e == null) {
                throw new C52419b("Not all required fields were included: after_placeorder_comm_req");
            } else if (this.f132374h != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                eh4 eh4 = this.f132370d;
                if (eh4 != null) {
                    aVar.mo74322i(2, eh4.computeSize());
                    this.f132370d.writeFields(aVar);
                }
                C77925f4 f4Var = this.f132371e;
                if (f4Var != null) {
                    aVar.mo74322i(3, f4Var.computeSize());
                    this.f132371e.writeFields(aVar);
                }
                String str = this.f132372f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                aVar.mo74318e(5, this.f132373g);
                String str2 = this.f132374h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: token");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            eh4 eh42 = this.f132370d;
            if (eh42 != null) {
                i2 += C52418a.m58682i(2, eh42.computeSize());
            }
            C77925f4 f4Var2 = this.f132371e;
            if (f4Var2 != null) {
                i2 += C52418a.m58682i(3, f4Var2.computeSize());
            }
            String str3 = this.f132372f;
            if (str3 != null) {
                i2 += C52418a.m58683j(4, str3);
            }
            int e = i2 + C52418a.m58678e(5, this.f132373g);
            String str4 = this.f132374h;
            return str4 != null ? e + C52418a.m58683j(6, str4) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f132370d == null) {
                throw new C52419b("Not all required fields were included: tock_mess");
            } else if (this.f132371e == null) {
                throw new C52419b("Not all required fields were included: after_placeorder_comm_req");
            } else if (this.f132374h != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: token");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49155dk dkVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        dkVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        eh4 eh43 = new eh4();
                        if (bArr2 != null && bArr2.length > 0) {
                            eh43.parseFrom(bArr2);
                        }
                        dkVar.f132370d = eh43;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C77925f4 f4Var3 = new C77925f4();
                        if (bArr3 != null && bArr3.length > 0) {
                            f4Var3.parseFrom(bArr3);
                        }
                        dkVar.f132371e = f4Var3;
                    }
                    return 0;
                case 4:
                    dkVar.f132372f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    dkVar.f132373g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    dkVar.f132374h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
