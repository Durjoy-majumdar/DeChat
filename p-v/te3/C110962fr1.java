package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fr1 */
public class C110962fr1 extends C47465a {

    /* renamed from: d */
    public String f331972d;

    /* renamed from: e */
    public LinkedList<C118464s14> f331973e = new LinkedList<>();

    /* renamed from: f */
    public C118464s14 f331974f;

    /* renamed from: g */
    public LinkedList<C118429er1> f331975g = new LinkedList<>();

    /* renamed from: h */
    public boolean f331976h = false;

    /* renamed from: i */
    public boolean f331977i = false;

    /* renamed from: j */
    public String f331978j;

    /* renamed from: n */
    public long f331979n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C110962fr1)) {
            return false;
        }
        C110962fr1 fr12 = (C110962fr1) aVar;
        return C46238a.m51546a(this.f331972d, fr12.f331972d) && C46238a.m51546a(this.f331973e, fr12.f331973e) && C46238a.m51546a(this.f331974f, fr12.f331974f) && C46238a.m51546a(this.f331975g, fr12.f331975g) && C46238a.m51546a(Boolean.valueOf(this.f331976h), Boolean.valueOf(fr12.f331976h)) && C46238a.m51546a(Boolean.valueOf(this.f331977i), Boolean.valueOf(fr12.f331977i)) && C46238a.m51546a(this.f331978j, fr12.f331978j) && C46238a.m51546a(Long.valueOf(this.f331979n), Long.valueOf(fr12.f331979n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f331972d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f331973e);
            C118464s14 s142 = this.f331974f;
            if (s142 != null) {
                aVar.mo74322i(3, s142.computeSize());
                this.f331974f.writeFields(aVar);
            }
            aVar.mo74320g(4, 8, this.f331975g);
            aVar.mo74314a(5, this.f331976h);
            aVar.mo74314a(6, this.f331977i);
            String str2 = this.f331978j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74321h(8, this.f331979n);
            return 0;
        } else if (i == 1) {
            String str3 = this.f331972d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f331973e);
            C118464s14 s143 = this.f331974f;
            if (s143 != null) {
                g += C52418a.m58682i(3, s143.computeSize());
            }
            int g2 = g + C52418a.m58680g(4, 8, this.f331975g) + C52418a.m58674a(5, this.f331976h) + C52418a.m58674a(6, this.f331977i);
            String str4 = this.f331978j;
            if (str4 != null) {
                g2 += C52418a.m58683j(7, str4);
            }
            return g2 + C52418a.m58681h(8, this.f331979n);
        } else if (i == 2) {
            this.f331973e.clear();
            this.f331975g.clear();
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
            C110962fr1 fr12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    fr12.f331972d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C118464s14 s144 = new C118464s14();
                        if (bArr != null && bArr.length > 0) {
                            s144.parseFrom(bArr);
                        }
                        fr12.f331973e.add(s144);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C118464s14 s145 = new C118464s14();
                        if (bArr2 != null && bArr2.length > 0) {
                            s145.parseFrom(bArr2);
                        }
                        fr12.f331974f = s145;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C118429er1 er12 = new C118429er1();
                        if (bArr3 != null && bArr3.length > 0) {
                            er12.parseFrom(bArr3);
                        }
                        fr12.f331975g.add(er12);
                    }
                    return 0;
                case 5:
                    fr12.f331976h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    fr12.f331977i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    fr12.f331978j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    fr12.f331979n = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
