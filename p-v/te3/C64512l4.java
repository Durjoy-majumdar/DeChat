package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l4 */
public class C64512l4 extends C47465a {

    /* renamed from: d */
    public C64545m7 f184028d;

    /* renamed from: e */
    public LinkedList<C64231ae2> f184029e = new LinkedList<>();

    /* renamed from: f */
    public String f184030f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64512l4)) {
            return false;
        }
        C64512l4 l4Var = (C64512l4) aVar;
        return C46238a.m51546a(this.f184028d, l4Var.f184028d) && C46238a.m51546a(this.f184029e, l4Var.f184029e) && C46238a.m51546a(this.f184030f, l4Var.f184030f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64545m7 m7Var = this.f184028d;
            if (m7Var != null) {
                if (m7Var != null) {
                    aVar.mo74322i(1, m7Var.computeSize());
                    this.f184028d.writeFields(aVar);
                }
                aVar.mo74320g(2, 8, this.f184029e);
                String str = this.f184030f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: ArtisAuthor");
        } else if (i == 1) {
            C64545m7 m7Var2 = this.f184028d;
            if (m7Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, m7Var2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f184029e);
            String str2 = this.f184030f;
            return str2 != null ? g + C52418a.m58683j(3, str2) : g;
        } else if (i == 2) {
            this.f184029e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f184028d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ArtisAuthor");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64512l4 l4Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64545m7 m7Var3 = new C64545m7();
                    if (bArr != null && bArr.length > 0) {
                        m7Var3.parseFrom(bArr);
                    }
                    l4Var.f184028d = m7Var3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64231ae2 ae22 = new C64231ae2();
                    if (bArr2 != null && bArr2.length > 0) {
                        ae22.parseFrom(bArr2);
                    }
                    l4Var.f184029e.add(ae22);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                l4Var.f184030f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
