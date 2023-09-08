package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.px1 */
public class C50887px1 extends C47465a {

    /* renamed from: d */
    public C51163rv3 f140039d;

    /* renamed from: e */
    public int f140040e;

    /* renamed from: f */
    public int f140041f;

    /* renamed from: g */
    public int f140042g;

    /* renamed from: h */
    public int f140043h = 1;

    /* renamed from: i */
    public int f140044i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50887px1)) {
            return false;
        }
        C50887px1 px12 = (C50887px1) aVar;
        return C46238a.m51546a(this.f140039d, px12.f140039d) && C46238a.m51546a(Integer.valueOf(this.f140040e), Integer.valueOf(px12.f140040e)) && C46238a.m51546a(Integer.valueOf(this.f140041f), Integer.valueOf(px12.f140041f)) && C46238a.m51546a(Integer.valueOf(this.f140042g), Integer.valueOf(px12.f140042g)) && C46238a.m51546a(Integer.valueOf(this.f140043h), Integer.valueOf(px12.f140043h)) && C46238a.m51546a(Integer.valueOf(this.f140044i), Integer.valueOf(px12.f140044i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f140039d;
            if (rv32 != null) {
                if (rv32 != null) {
                    aVar.mo74322i(1, rv32.computeSize());
                    this.f140039d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f140040e);
                aVar.mo74318e(3, this.f140041f);
                aVar.mo74318e(4, this.f140042g);
                aVar.mo74318e(5, this.f140043h);
                aVar.mo74318e(6, this.f140044i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ChatroomId");
        } else if (i == 1) {
            C51163rv3 rv33 = this.f140039d;
            if (rv33 != null) {
                i2 = 0 + C52418a.m58682i(1, rv33.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f140040e) + C52418a.m58678e(3, this.f140041f) + C52418a.m58678e(4, this.f140042g) + C52418a.m58678e(5, this.f140043h) + C52418a.m58678e(6, this.f140044i);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f140039d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ChatroomId");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50887px1 px12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51163rv3 rv34 = new C51163rv3();
                        if (bArr != null && bArr.length > 0) {
                            rv34.mo73356d(bArr);
                        }
                        px12.f140039d = rv34;
                    }
                    return 0;
                case 2:
                    px12.f140040e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    px12.f140041f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    px12.f140042g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    px12.f140043h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    px12.f140044i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
