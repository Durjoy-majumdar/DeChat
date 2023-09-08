package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bi1 */
public class C48861bi1 extends C47465a {

    /* renamed from: d */
    public String f131130d;

    /* renamed from: e */
    public LinkedList<C48770aw0> f131131e = new LinkedList<>();

    /* renamed from: f */
    public long f131132f;

    /* renamed from: g */
    public long f131133g;

    /* renamed from: h */
    public int f131134h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48861bi1)) {
            return false;
        }
        C48861bi1 bi12 = (C48861bi1) aVar;
        return C46238a.m51546a(this.f131130d, bi12.f131130d) && C46238a.m51546a(this.f131131e, bi12.f131131e) && C46238a.m51546a(Long.valueOf(this.f131132f), Long.valueOf(bi12.f131132f)) && C46238a.m51546a(Long.valueOf(this.f131133g), Long.valueOf(bi12.f131133g)) && C46238a.m51546a(Integer.valueOf(this.f131134h), Integer.valueOf(bi12.f131134h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131130d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f131131e);
            aVar.mo74321h(3, this.f131132f);
            aVar.mo74321h(4, this.f131133g);
            aVar.mo74318e(5, this.f131134h);
            return 0;
        } else if (i == 1) {
            String str2 = this.f131130d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f131131e) + C52418a.m58681h(3, this.f131132f) + C52418a.m58681h(4, this.f131133g) + C52418a.m58678e(5, this.f131134h);
        } else if (i == 2) {
            this.f131131e.clear();
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
            C48861bi1 bi12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bi12.f131130d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48770aw0 aw02 = new C48770aw0();
                    if (bArr != null && bArr.length > 0) {
                        aw02.parseFrom(bArr);
                    }
                    bi12.f131131e.add(aw02);
                }
                return 0;
            } else if (intValue == 3) {
                bi12.f131132f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                bi12.f131133g = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                bi12.f131134h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
