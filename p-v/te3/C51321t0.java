package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t0 */
public class C51321t0 extends C101820nt3 {

    /* renamed from: d */
    public long f141861d;

    /* renamed from: e */
    public String f141862e;

    /* renamed from: f */
    public String f141863f;

    /* renamed from: g */
    public String f141864g;

    /* renamed from: h */
    public String f141865h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51321t0)) {
            return false;
        }
        C51321t0 t0Var = (C51321t0) aVar;
        return C46238a.m51546a(this.BaseRequest, t0Var.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f141861d), Long.valueOf(t0Var.f141861d)) && C46238a.m51546a(this.f141862e, t0Var.f141862e) && C46238a.m51546a(this.f141863f, t0Var.f141863f) && C46238a.m51546a(this.f141864g, t0Var.f141864g) && C46238a.m51546a(this.f141865h, t0Var.f141865h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74321h(2, this.f141861d);
            String str = this.f141862e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f141863f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f141864g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f141865h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f141861d);
            String str5 = this.f141862e;
            if (str5 != null) {
                h += C52418a.m58683j(3, str5);
            }
            String str6 = this.f141863f;
            if (str6 != null) {
                h += C52418a.m58683j(4, str6);
            }
            String str7 = this.f141864g;
            if (str7 != null) {
                h += C52418a.m58683j(5, str7);
            }
            String str8 = this.f141865h;
            return str8 != null ? h + C52418a.m58683j(6, str8) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51321t0 t0Var = objArr[1];
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
                        t0Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    t0Var.f141861d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    t0Var.f141862e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    t0Var.f141863f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    t0Var.f141864g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    t0Var.f141865h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
