package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ak1 */
public class C48727ak1 extends C47465a {

    /* renamed from: d */
    public String f130586d;

    /* renamed from: e */
    public int f130587e;

    /* renamed from: f */
    public String f130588f;

    /* renamed from: g */
    public String f130589g;

    /* renamed from: h */
    public C89349b f130590h;

    /* renamed from: i */
    public String f130591i;

    /* renamed from: j */
    public C52271zj0 f130592j;

    /* renamed from: n */
    public long f130593n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48727ak1)) {
            return false;
        }
        C48727ak1 ak12 = (C48727ak1) aVar;
        return C46238a.m51546a(this.f130586d, ak12.f130586d) && C46238a.m51546a(Integer.valueOf(this.f130587e), Integer.valueOf(ak12.f130587e)) && C46238a.m51546a(this.f130588f, ak12.f130588f) && C46238a.m51546a(this.f130589g, ak12.f130589g) && C46238a.m51546a(this.f130590h, ak12.f130590h) && C46238a.m51546a(this.f130591i, ak12.f130591i) && C46238a.m51546a(this.f130592j, ak12.f130592j) && C46238a.m51546a(Long.valueOf(this.f130593n), Long.valueOf(ak12.f130593n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130586d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f130587e);
            String str2 = this.f130588f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f130589g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            C89349b bVar = this.f130590h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            String str4 = this.f130591i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            C52271zj0 zj02 = this.f130592j;
            if (zj02 != null) {
                aVar.mo74322i(7, zj02.computeSize());
                this.f130592j.writeFields(aVar);
            }
            aVar.mo74321h(8, this.f130593n);
            return 0;
        } else if (i == 1) {
            String str5 = this.f130586d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int e = i2 + C52418a.m58678e(2, this.f130587e);
            String str6 = this.f130588f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f130589g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            C89349b bVar2 = this.f130590h;
            if (bVar2 != null) {
                e += C52418a.m58675b(5, bVar2);
            }
            String str8 = this.f130591i;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            C52271zj0 zj03 = this.f130592j;
            if (zj03 != null) {
                e += C52418a.m58682i(7, zj03.computeSize());
            }
            return e + C52418a.m58681h(8, this.f130593n);
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
            C48727ak1 ak12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ak12.f130586d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ak12.f130587e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ak12.f130588f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ak12.f130589g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ak12.f130590h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    ak12.f130591i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C52271zj0 zj04 = new C52271zj0();
                        if (bArr != null && bArr.length > 0) {
                            zj04.parseFrom(bArr);
                        }
                        ak12.f130592j = zj04;
                    }
                    return 0;
                case 8:
                    ak12.f130593n = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
