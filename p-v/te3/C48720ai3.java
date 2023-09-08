package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ai3 */
public class C48720ai3 extends C47465a {

    /* renamed from: d */
    public String f130553d;

    /* renamed from: e */
    public String f130554e;

    /* renamed from: f */
    public String f130555f;

    /* renamed from: g */
    public String f130556g;

    /* renamed from: h */
    public int f130557h;

    /* renamed from: i */
    public q85 f130558i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48720ai3)) {
            return false;
        }
        C48720ai3 ai32 = (C48720ai3) aVar;
        return C46238a.m51546a(this.f130553d, ai32.f130553d) && C46238a.m51546a(this.f130554e, ai32.f130554e) && C46238a.m51546a(this.f130555f, ai32.f130555f) && C46238a.m51546a(this.f130556g, ai32.f130556g) && C46238a.m51546a(Integer.valueOf(this.f130557h), Integer.valueOf(ai32.f130557h)) && C46238a.m51546a(this.f130558i, ai32.f130558i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130553d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f130554e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f130555f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f130556g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f130557h);
            q85 q85 = this.f130558i;
            if (q85 != null) {
                aVar.mo74322i(6, q85.computeSize());
                this.f130558i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f130553d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f130554e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f130555f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f130556g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            int e = i2 + C52418a.m58678e(5, this.f130557h);
            q85 q852 = this.f130558i;
            return q852 != null ? e + C52418a.m58682i(6, q852.computeSize()) : e;
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
            C48720ai3 ai32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ai32.f130553d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ai32.f130554e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ai32.f130555f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ai32.f130556g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ai32.f130557h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        q85 q853 = new q85();
                        if (bArr != null && bArr.length > 0) {
                            q853.parseFrom(bArr);
                        }
                        ai32.f130558i = q853;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
