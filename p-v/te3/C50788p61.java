package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p61 */
public class C50788p61 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f139599d;

    /* renamed from: e */
    public String f139600e;

    /* renamed from: f */
    public long f139601f;

    /* renamed from: g */
    public long f139602g;

    /* renamed from: h */
    public C89349b f139603h;

    /* renamed from: i */
    public String f139604i;

    /* renamed from: j */
    public int f139605j;

    /* renamed from: n */
    public String f139606n;

    /* renamed from: o */
    public boolean f139607o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50788p61)) {
            return false;
        }
        C50788p61 p612 = (C50788p61) aVar;
        return C46238a.m51546a(this.BaseRequest, p612.BaseRequest) && C46238a.m51546a(this.f139599d, p612.f139599d) && C46238a.m51546a(this.f139600e, p612.f139600e) && C46238a.m51546a(Long.valueOf(this.f139601f), Long.valueOf(p612.f139601f)) && C46238a.m51546a(Long.valueOf(this.f139602g), Long.valueOf(p612.f139602g)) && C46238a.m51546a(this.f139603h, p612.f139603h) && C46238a.m51546a(this.f139604i, p612.f139604i) && C46238a.m51546a(Integer.valueOf(this.f139605j), Integer.valueOf(p612.f139605j)) && C46238a.m51546a(this.f139606n, p612.f139606n) && C46238a.m51546a(Boolean.valueOf(this.f139607o), Boolean.valueOf(p612.f139607o));
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
            C49842ig0 ig02 = this.f139599d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f139599d.writeFields(aVar);
            }
            String str = this.f139600e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f139601f);
            aVar.mo74321h(5, this.f139602g);
            C89349b bVar = this.f139603h;
            if (bVar != null) {
                aVar.mo74315b(6, bVar);
            }
            String str2 = this.f139604i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f139605j);
            String str3 = this.f139606n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74314a(10, this.f139607o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f139599d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str4 = this.f139600e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            int h = i2 + C52418a.m58681h(4, this.f139601f) + C52418a.m58681h(5, this.f139602g);
            C89349b bVar2 = this.f139603h;
            if (bVar2 != null) {
                h += C52418a.m58675b(6, bVar2);
            }
            String str5 = this.f139604i;
            if (str5 != null) {
                h += C52418a.m58683j(7, str5);
            }
            int e = h + C52418a.m58678e(8, this.f139605j);
            String str6 = this.f139606n;
            if (str6 != null) {
                e += C52418a.m58683j(9, str6);
            }
            return e + C52418a.m58674a(10, this.f139607o);
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
            C50788p61 p612 = objArr[1];
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
                        p612.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        p612.f139599d = ig04;
                    }
                    return 0;
                case 3:
                    p612.f139600e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    p612.f139601f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    p612.f139602g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    p612.f139603h = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    p612.f139604i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    p612.f139605j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    p612.f139606n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    p612.f139607o = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
