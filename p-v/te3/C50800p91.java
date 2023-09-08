package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p91 */
public class C50800p91 extends C47465a {

    /* renamed from: d */
    public int f139656d;

    /* renamed from: e */
    public int f139657e;

    /* renamed from: f */
    public int f139658f;

    /* renamed from: g */
    public C64822x51 f139659g;

    /* renamed from: h */
    public long f139660h;

    /* renamed from: i */
    public String f139661i;

    /* renamed from: j */
    public C89349b f139662j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50800p91)) {
            return false;
        }
        C50800p91 p912 = (C50800p91) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139656d), Integer.valueOf(p912.f139656d)) && C46238a.m51546a(Integer.valueOf(this.f139657e), Integer.valueOf(p912.f139657e)) && C46238a.m51546a(Integer.valueOf(this.f139658f), Integer.valueOf(p912.f139658f)) && C46238a.m51546a(this.f139659g, p912.f139659g) && C46238a.m51546a(Long.valueOf(this.f139660h), Long.valueOf(p912.f139660h)) && C46238a.m51546a(this.f139661i, p912.f139661i) && C46238a.m51546a(this.f139662j, p912.f139662j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139656d);
            aVar.mo74318e(2, this.f139657e);
            aVar.mo74318e(3, this.f139658f);
            C64822x51 x512 = this.f139659g;
            if (x512 != null) {
                aVar.mo74322i(4, x512.computeSize());
                this.f139659g.writeFields(aVar);
            }
            aVar.mo74321h(5, this.f139660h);
            String str = this.f139661i;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            C89349b bVar = this.f139662j;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139656d) + 0 + C52418a.m58678e(2, this.f139657e) + C52418a.m58678e(3, this.f139658f);
            C64822x51 x513 = this.f139659g;
            if (x513 != null) {
                e += C52418a.m58682i(4, x513.computeSize());
            }
            int h = e + C52418a.m58681h(5, this.f139660h);
            String str2 = this.f139661i;
            if (str2 != null) {
                h += C52418a.m58683j(6, str2);
            }
            C89349b bVar2 = this.f139662j;
            return bVar2 != null ? h + C52418a.m58675b(7, bVar2) : h;
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
            C50800p91 p912 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    p912.f139656d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    p912.f139657e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    p912.f139658f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64822x51 x514 = new C64822x51();
                        if (bArr != null && bArr.length > 0) {
                            x514.parseFrom(bArr);
                        }
                        p912.f139659g = x514;
                    }
                    return 0;
                case 5:
                    p912.f139660h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    p912.f139661i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    p912.f139662j = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
