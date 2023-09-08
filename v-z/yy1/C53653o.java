package yy1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: yy1.o */
public class C53653o extends C47465a {

    /* renamed from: d */
    public String f150709d;

    /* renamed from: e */
    public C53652n f150710e;

    /* renamed from: f */
    public String f150711f;

    /* renamed from: g */
    public String f150712g;

    /* renamed from: h */
    public C53639a f150713h;

    /* renamed from: i */
    public C53641c f150714i;

    /* renamed from: j */
    public int f150715j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53653o)) {
            return false;
        }
        C53653o oVar = (C53653o) aVar;
        return C46238a.m51546a(this.f150709d, oVar.f150709d) && C46238a.m51546a(this.f150710e, oVar.f150710e) && C46238a.m51546a(this.f150711f, oVar.f150711f) && C46238a.m51546a(this.f150712g, oVar.f150712g) && C46238a.m51546a(this.f150713h, oVar.f150713h) && C46238a.m51546a(this.f150714i, oVar.f150714i) && C46238a.m51546a(Integer.valueOf(this.f150715j), Integer.valueOf(oVar.f150715j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f150709d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C53652n nVar = this.f150710e;
            if (nVar != null) {
                aVar.mo74322i(2, nVar.computeSize());
                this.f150710e.writeFields(aVar);
            }
            String str2 = this.f150711f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f150712g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            C53639a aVar2 = this.f150713h;
            if (aVar2 != null) {
                aVar.mo74322i(5, aVar2.computeSize());
                this.f150713h.writeFields(aVar);
            }
            C53641c cVar = this.f150714i;
            if (cVar != null) {
                aVar.mo74322i(6, cVar.computeSize());
                this.f150714i.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f150715j);
            return 0;
        } else if (i == 1) {
            String str4 = this.f150709d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            C53652n nVar2 = this.f150710e;
            if (nVar2 != null) {
                i2 += C52418a.m58682i(2, nVar2.computeSize());
            }
            String str5 = this.f150711f;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f150712g;
            if (str6 != null) {
                i2 += C52418a.m58683j(4, str6);
            }
            C53639a aVar3 = this.f150713h;
            if (aVar3 != null) {
                i2 += C52418a.m58682i(5, aVar3.computeSize());
            }
            C53641c cVar2 = this.f150714i;
            if (cVar2 != null) {
                i2 += C52418a.m58682i(6, cVar2.computeSize());
            }
            return i2 + C52418a.m58678e(7, this.f150715j);
        } else if (i == 2) {
            C102122a aVar4 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar4); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar4)) {
                if (!super.populateBuilderWithField(aVar4, this, nextFieldNumber)) {
                    aVar4.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar5 = objArr[0];
            C53653o oVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    oVar.f150709d = aVar5.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar5.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C53652n nVar3 = new C53652n();
                        if (bArr != null && bArr.length > 0) {
                            nVar3.parseFrom(bArr);
                        }
                        oVar.f150710e = nVar3;
                    }
                    return 0;
                case 3:
                    oVar.f150711f = aVar5.mo141633k(intValue);
                    return 0;
                case 4:
                    oVar.f150712g = aVar5.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar5.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C53639a aVar6 = new C53639a();
                        if (bArr2 != null && bArr2.length > 0) {
                            aVar6.parseFrom(bArr2);
                        }
                        oVar.f150713h = aVar6;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar5.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C53641c cVar3 = new C53641c();
                        if (bArr3 != null && bArr3.length > 0) {
                            cVar3.parseFrom(bArr3);
                        }
                        oVar.f150714i = cVar3;
                    }
                    return 0;
                case 7:
                    oVar.f150715j = aVar5.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
