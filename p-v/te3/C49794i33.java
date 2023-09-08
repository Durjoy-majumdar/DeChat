package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i33 */
public class C49794i33 extends C47465a {

    /* renamed from: d */
    public zf4 f135084d;

    /* renamed from: e */
    public LinkedList<zf4> f135085e = new LinkedList<>();

    /* renamed from: f */
    public String f135086f;

    /* renamed from: g */
    public String f135087g;

    /* renamed from: h */
    public C50456mv3 f135088h;

    /* renamed from: i */
    public C51975xh2 f135089i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49794i33)) {
            return false;
        }
        C49794i33 i332 = (C49794i33) aVar;
        return C46238a.m51546a(this.f135084d, i332.f135084d) && C46238a.m51546a(this.f135085e, i332.f135085e) && C46238a.m51546a(this.f135086f, i332.f135086f) && C46238a.m51546a(this.f135087g, i332.f135087g) && C46238a.m51546a(this.f135088h, i332.f135088h) && C46238a.m51546a(this.f135089i, i332.f135089i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            zf4 zf4 = this.f135084d;
            if (zf4 != null) {
                aVar.mo74322i(1, zf4.computeSize());
                this.f135084d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f135085e);
            String str = this.f135086f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f135087g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C50456mv3 mv32 = this.f135088h;
            if (mv32 != null) {
                aVar.mo74322i(5, mv32.computeSize());
                this.f135088h.writeFields(aVar);
            }
            C51975xh2 xh22 = this.f135089i;
            if (xh22 != null) {
                aVar.mo74322i(6, xh22.computeSize());
                this.f135089i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            zf4 zf42 = this.f135084d;
            if (zf42 != null) {
                i2 = 0 + C52418a.m58682i(1, zf42.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f135085e);
            String str3 = this.f135086f;
            if (str3 != null) {
                g += C52418a.m58683j(3, str3);
            }
            String str4 = this.f135087g;
            if (str4 != null) {
                g += C52418a.m58683j(4, str4);
            }
            C50456mv3 mv33 = this.f135088h;
            if (mv33 != null) {
                g += C52418a.m58682i(5, mv33.computeSize());
            }
            C51975xh2 xh23 = this.f135089i;
            return xh23 != null ? g + C52418a.m58682i(6, xh23.computeSize()) : g;
        } else if (i == 2) {
            this.f135085e.clear();
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
            C49794i33 i332 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        zf4 zf43 = new zf4();
                        if (bArr != null && bArr.length > 0) {
                            zf43.parseFrom(bArr);
                        }
                        i332.f135084d = zf43;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        zf4 zf44 = new zf4();
                        if (bArr2 != null && bArr2.length > 0) {
                            zf44.parseFrom(bArr2);
                        }
                        i332.f135085e.add(zf44);
                    }
                    return 0;
                case 3:
                    i332.f135086f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    i332.f135087g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50456mv3 mv34 = new C50456mv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            mv34.parseFrom(bArr3);
                        }
                        i332.f135088h = mv34;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51975xh2 xh24 = new C51975xh2();
                        if (bArr4 != null && bArr4.length > 0) {
                            xh24.parseFrom(bArr4);
                        }
                        i332.f135089i = xh24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
