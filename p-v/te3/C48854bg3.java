package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bg3 */
public class C48854bg3 extends C101820nt3 {

    /* renamed from: d */
    public C89349b f131102d;

    /* renamed from: e */
    public int f131103e;

    /* renamed from: f */
    public String f131104f;

    /* renamed from: g */
    public long f131105g;

    /* renamed from: h */
    public String f131106h;

    /* renamed from: i */
    public String f131107i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48854bg3)) {
            return false;
        }
        C48854bg3 bg32 = (C48854bg3) aVar;
        return C46238a.m51546a(this.BaseRequest, bg32.BaseRequest) && C46238a.m51546a(this.f131102d, bg32.f131102d) && C46238a.m51546a(Integer.valueOf(this.f131103e), Integer.valueOf(bg32.f131103e)) && C46238a.m51546a(this.f131104f, bg32.f131104f) && C46238a.m51546a(Long.valueOf(this.f131105g), Long.valueOf(bg32.f131105g)) && C46238a.m51546a(this.f131106h, bg32.f131106h) && C46238a.m51546a(this.f131107i, bg32.f131107i);
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
            C89349b bVar = this.f131102d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(3, this.f131103e);
            String str = this.f131104f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74321h(5, this.f131105g);
            String str2 = this.f131106h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f131107i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C89349b bVar2 = this.f131102d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            int e = i2 + C52418a.m58678e(3, this.f131103e);
            String str4 = this.f131104f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            int h = e + C52418a.m58681h(5, this.f131105g);
            String str5 = this.f131106h;
            if (str5 != null) {
                h += C52418a.m58683j(6, str5);
            }
            String str6 = this.f131107i;
            return str6 != null ? h + C52418a.m58683j(7, str6) : h;
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
            C48854bg3 bg32 = objArr[1];
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
                        bg32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    bg32.f131102d = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    bg32.f131103e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    bg32.f131104f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bg32.f131105g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    bg32.f131106h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bg32.f131107i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
