package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ob0 */
public class C64606ob0 extends C101820nt3 {

    /* renamed from: d */
    public String f184649d;

    /* renamed from: e */
    public String f184650e;

    /* renamed from: f */
    public String f184651f;

    /* renamed from: g */
    public String f184652g;

    /* renamed from: h */
    public String f184653h;

    /* renamed from: i */
    public long f184654i;

    /* renamed from: j */
    public double f184655j;

    /* renamed from: n */
    public double f184656n;

    /* renamed from: o */
    public C89349b f184657o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64606ob0)) {
            return false;
        }
        C64606ob0 ob02 = (C64606ob0) aVar;
        return C46238a.m51546a(this.BaseRequest, ob02.BaseRequest) && C46238a.m51546a(this.f184649d, ob02.f184649d) && C46238a.m51546a(this.f184650e, ob02.f184650e) && C46238a.m51546a(this.f184651f, ob02.f184651f) && C46238a.m51546a(this.f184652g, ob02.f184652g) && C46238a.m51546a(this.f184653h, ob02.f184653h) && C46238a.m51546a(Long.valueOf(this.f184654i), Long.valueOf(ob02.f184654i)) && C46238a.m51546a(Double.valueOf(this.f184655j), Double.valueOf(ob02.f184655j)) && C46238a.m51546a(Double.valueOf(this.f184656n), Double.valueOf(ob02.f184656n)) && C46238a.m51546a(this.f184657o, ob02.f184657o);
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
            String str = this.f184649d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f184650e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f184651f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f184652g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f184653h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74321h(7, this.f184654i);
            aVar.mo74316c(8, this.f184655j);
            aVar.mo74316c(9, this.f184656n);
            C89349b bVar = this.f184657o;
            if (bVar != null) {
                aVar.mo74315b(10, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str6 = this.f184649d;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f184650e;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f184651f;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            String str9 = this.f184652g;
            if (str9 != null) {
                i2 += C52418a.m58683j(5, str9);
            }
            String str10 = this.f184653h;
            if (str10 != null) {
                i2 += C52418a.m58683j(6, str10);
            }
            int h = i2 + C52418a.m58681h(7, this.f184654i) + C52418a.m58676c(8, this.f184655j) + C52418a.m58676c(9, this.f184656n);
            C89349b bVar2 = this.f184657o;
            return bVar2 != null ? h + C52418a.m58675b(10, bVar2) : h;
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
            C64606ob0 ob02 = objArr[1];
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
                        ob02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ob02.f184649d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ob02.f184650e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ob02.f184651f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ob02.f184652g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ob02.f184653h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ob02.f184654i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    ob02.f184655j = aVar3.mo141627e(intValue);
                    return 0;
                case 9:
                    ob02.f184656n = aVar3.mo141627e(intValue);
                    return 0;
                case 10:
                    ob02.f184657o = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
