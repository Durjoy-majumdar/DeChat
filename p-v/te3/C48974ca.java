package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ca */
public class C48974ca extends C47465a {

    /* renamed from: d */
    public String f131580d;

    /* renamed from: e */
    public int f131581e;

    /* renamed from: f */
    public C51284sq2 f131582f;

    /* renamed from: g */
    public C50997qq2 f131583g;

    /* renamed from: h */
    public int f131584h;

    /* renamed from: i */
    public long f131585i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48974ca)) {
            return false;
        }
        C48974ca caVar = (C48974ca) aVar;
        return C46238a.m51546a(this.f131580d, caVar.f131580d) && C46238a.m51546a(Integer.valueOf(this.f131581e), Integer.valueOf(caVar.f131581e)) && C46238a.m51546a(this.f131582f, caVar.f131582f) && C46238a.m51546a(this.f131583g, caVar.f131583g) && C46238a.m51546a(Integer.valueOf(this.f131584h), Integer.valueOf(caVar.f131584h)) && C46238a.m51546a(Long.valueOf(this.f131585i), Long.valueOf(caVar.f131585i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131580d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f131581e);
            C51284sq2 sq22 = this.f131582f;
            if (sq22 != null) {
                aVar.mo74322i(3, sq22.computeSize());
                this.f131582f.writeFields(aVar);
            }
            C50997qq2 qq22 = this.f131583g;
            if (qq22 != null) {
                aVar.mo74322i(4, qq22.computeSize());
                this.f131583g.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f131584h);
            aVar.mo74321h(6, this.f131585i);
            return 0;
        } else if (i == 1) {
            String str2 = this.f131580d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f131581e);
            C51284sq2 sq23 = this.f131582f;
            if (sq23 != null) {
                e += C52418a.m58682i(3, sq23.computeSize());
            }
            C50997qq2 qq23 = this.f131583g;
            if (qq23 != null) {
                e += C52418a.m58682i(4, qq23.computeSize());
            }
            return e + C52418a.m58678e(5, this.f131584h) + C52418a.m58681h(6, this.f131585i);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48974ca caVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    caVar.f131580d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    caVar.f131581e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51284sq2 sq24 = new C51284sq2();
                        if (bArr != null && bArr.length > 0) {
                            sq24.parseFrom(bArr);
                        }
                        caVar.f131582f = sq24;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50997qq2 qq24 = new C50997qq2();
                        if (bArr2 != null && bArr2.length > 0) {
                            qq24.parseFrom(bArr2);
                        }
                        caVar.f131583g = qq24;
                    }
                    return 0;
                case 5:
                    caVar.f131584h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    caVar.f131585i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
