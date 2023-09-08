package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r61 */
public class C51064r61 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f140722d;

    /* renamed from: e */
    public long f140723e;

    /* renamed from: f */
    public long f140724f;

    /* renamed from: g */
    public LinkedList<String> f140725g = new LinkedList<>();

    /* renamed from: h */
    public String f140726h;

    /* renamed from: i */
    public C89349b f140727i;

    /* renamed from: j */
    public String f140728j;

    /* renamed from: n */
    public String f140729n;

    /* renamed from: o */
    public int f140730o;

    /* renamed from: p */
    public String f140731p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51064r61)) {
            return false;
        }
        C51064r61 r612 = (C51064r61) aVar;
        return C46238a.m51546a(this.BaseRequest, r612.BaseRequest) && C46238a.m51546a(this.f140722d, r612.f140722d) && C46238a.m51546a(Long.valueOf(this.f140723e), Long.valueOf(r612.f140723e)) && C46238a.m51546a(Long.valueOf(this.f140724f), Long.valueOf(r612.f140724f)) && C46238a.m51546a(this.f140725g, r612.f140725g) && C46238a.m51546a(this.f140726h, r612.f140726h) && C46238a.m51546a(this.f140727i, r612.f140727i) && C46238a.m51546a(this.f140728j, r612.f140728j) && C46238a.m51546a(this.f140729n, r612.f140729n) && C46238a.m51546a(Integer.valueOf(this.f140730o), Integer.valueOf(r612.f140730o)) && C46238a.m51546a(this.f140731p, r612.f140731p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f140722d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f140722d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f140723e);
            aVar.mo74321h(4, this.f140724f);
            aVar.mo74320g(5, 1, this.f140725g);
            String str = this.f140726h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            C89349b bVar = this.f140727i;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            String str2 = this.f140728j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            String str3 = this.f140729n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74318e(10, this.f140730o);
            String str4 = this.f140731p;
            if (str4 != null) {
                aVar.mo74323j(11, str4);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f140722d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i3 + C52418a.m58681h(3, this.f140723e) + C52418a.m58681h(4, this.f140724f) + C52418a.m58680g(5, 1, this.f140725g);
            String str5 = this.f140726h;
            if (str5 != null) {
                h += C52418a.m58683j(6, str5);
            }
            C89349b bVar2 = this.f140727i;
            if (bVar2 != null) {
                h += C52418a.m58675b(7, bVar2);
            }
            String str6 = this.f140728j;
            if (str6 != null) {
                h += C52418a.m58683j(8, str6);
            }
            String str7 = this.f140729n;
            if (str7 != null) {
                h += C52418a.m58683j(9, str7);
            }
            int e = h + C52418a.m58678e(10, this.f140730o);
            String str8 = this.f140731p;
            return str8 != null ? e + C52418a.m58683j(11, str8) : e;
        } else if (i2 == 2) {
            this.f140725g.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51064r61 r612 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        r612.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        r612.f140722d = ig04;
                    }
                    return 0;
                case 3:
                    r612.f140723e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    r612.f140724f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    r612.f140725g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 6:
                    r612.f140726h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    r612.f140727i = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    r612.f140728j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    r612.f140729n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    r612.f140730o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    r612.f140731p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
