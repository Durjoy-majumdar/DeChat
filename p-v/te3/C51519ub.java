package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ub */
public class C51519ub extends C47465a {

    /* renamed from: d */
    public int f142711d;

    /* renamed from: e */
    public String f142712e;

    /* renamed from: f */
    public C50052jy2 f142713f;

    /* renamed from: g */
    public String f142714g;

    /* renamed from: h */
    public String f142715h;

    /* renamed from: i */
    public C49697hf2 f142716i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51519ub)) {
            return false;
        }
        C51519ub ubVar = (C51519ub) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142711d), Integer.valueOf(ubVar.f142711d)) && C46238a.m51546a(this.f142712e, ubVar.f142712e) && C46238a.m51546a(this.f142713f, ubVar.f142713f) && C46238a.m51546a(this.f142714g, ubVar.f142714g) && C46238a.m51546a(this.f142715h, ubVar.f142715h) && C46238a.m51546a(this.f142716i, ubVar.f142716i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142711d);
            String str = this.f142712e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C50052jy2 jy22 = this.f142713f;
            if (jy22 != null) {
                aVar.mo74322i(3, jy22.computeSize());
                this.f142713f.writeFields(aVar);
            }
            String str2 = this.f142714g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f142715h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            C49697hf2 hf22 = this.f142716i;
            if (hf22 != null) {
                aVar.mo74322i(6, hf22.computeSize());
                this.f142716i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142711d) + 0;
            String str4 = this.f142712e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            C50052jy2 jy23 = this.f142713f;
            if (jy23 != null) {
                e += C52418a.m58682i(3, jy23.computeSize());
            }
            String str5 = this.f142714g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f142715h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            C49697hf2 hf23 = this.f142716i;
            return hf23 != null ? e + C52418a.m58682i(6, hf23.computeSize()) : e;
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
            C51519ub ubVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ubVar.f142711d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ubVar.f142712e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50052jy2 jy24 = new C50052jy2();
                        if (bArr != null && bArr.length > 0) {
                            jy24.parseFrom(bArr);
                        }
                        ubVar.f142713f = jy24;
                    }
                    return 0;
                case 4:
                    ubVar.f142714g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ubVar.f142715h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C49697hf2 hf24 = new C49697hf2();
                        if (bArr2 != null && bArr2.length > 0) {
                            hf24.parseFrom(bArr2);
                        }
                        ubVar.f142716i = hf24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
