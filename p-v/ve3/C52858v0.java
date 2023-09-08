package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.v0 */
public class C52858v0 extends C101820nt3 {

    /* renamed from: d */
    public String f147636d;

    /* renamed from: e */
    public int f147637e;

    /* renamed from: f */
    public String f147638f;

    /* renamed from: g */
    public long f147639g;

    /* renamed from: h */
    public C89349b f147640h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52858v0)) {
            return false;
        }
        C52858v0 v0Var = (C52858v0) aVar;
        return C46238a.m51546a(this.BaseRequest, v0Var.BaseRequest) && C46238a.m51546a(this.f147636d, v0Var.f147636d) && C46238a.m51546a(Integer.valueOf(this.f147637e), Integer.valueOf(v0Var.f147637e)) && C46238a.m51546a(this.f147638f, v0Var.f147638f) && C46238a.m51546a(Long.valueOf(this.f147639g), Long.valueOf(v0Var.f147639g)) && C46238a.m51546a(this.f147640h, v0Var.f147640h);
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
            String str = this.f147636d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f147637e);
            String str2 = this.f147638f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74321h(5, this.f147639g);
            C89349b bVar = this.f147640h;
            if (bVar != null) {
                aVar.mo74315b(6, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f147636d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f147637e);
            String str4 = this.f147638f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            int h = e + C52418a.m58681h(5, this.f147639g);
            C89349b bVar2 = this.f147640h;
            return bVar2 != null ? h + C52418a.m58675b(6, bVar2) : h;
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
            C52858v0 v0Var = objArr[1];
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
                        v0Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    v0Var.f147636d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    v0Var.f147637e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    v0Var.f147638f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    v0Var.f147639g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    v0Var.f147640h = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
