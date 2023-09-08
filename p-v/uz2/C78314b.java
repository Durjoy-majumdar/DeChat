package uz2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.b */
public class C78314b extends C47465a {

    /* renamed from: d */
    public String f229419d;

    /* renamed from: e */
    public C52696l f229420e;

    /* renamed from: f */
    public String f229421f;

    /* renamed from: g */
    public boolean f229422g;

    /* renamed from: h */
    public long f229423h;

    /* renamed from: i */
    public int f229424i;

    /* renamed from: j */
    public String f229425j;

    /* renamed from: n */
    public String f229426n;

    /* renamed from: o */
    public String f229427o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78314b)) {
            return false;
        }
        C78314b bVar = (C78314b) aVar;
        return C46238a.m51546a(this.f229419d, bVar.f229419d) && C46238a.m51546a(this.f229420e, bVar.f229420e) && C46238a.m51546a(this.f229421f, bVar.f229421f) && C46238a.m51546a(Boolean.valueOf(this.f229422g), Boolean.valueOf(bVar.f229422g)) && C46238a.m51546a(Long.valueOf(this.f229423h), Long.valueOf(bVar.f229423h)) && C46238a.m51546a(Integer.valueOf(this.f229424i), Integer.valueOf(bVar.f229424i)) && C46238a.m51546a(this.f229425j, bVar.f229425j) && C46238a.m51546a(this.f229426n, bVar.f229426n) && C46238a.m51546a(this.f229427o, bVar.f229427o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f229419d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C52696l lVar = this.f229420e;
            if (lVar != null) {
                aVar.mo74322i(2, lVar.computeSize());
                this.f229420e.writeFields(aVar);
            }
            String str2 = this.f229421f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74314a(4, this.f229422g);
            aVar.mo74321h(5, this.f229423h);
            aVar.mo74318e(6, this.f229424i);
            String str3 = this.f229425j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f229426n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f229427o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f229419d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            C52696l lVar2 = this.f229420e;
            if (lVar2 != null) {
                i2 += C52418a.m58682i(2, lVar2.computeSize());
            }
            String str7 = this.f229421f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            int a = i2 + C52418a.m58674a(4, this.f229422g) + C52418a.m58681h(5, this.f229423h) + C52418a.m58678e(6, this.f229424i);
            String str8 = this.f229425j;
            if (str8 != null) {
                a += C52418a.m58683j(7, str8);
            }
            String str9 = this.f229426n;
            if (str9 != null) {
                a += C52418a.m58683j(8, str9);
            }
            String str10 = this.f229427o;
            return str10 != null ? a + C52418a.m58683j(9, str10) : a;
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
            C78314b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bVar.f229419d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C52696l lVar3 = new C52696l();
                        if (bArr != null && bArr.length > 0) {
                            lVar3.parseFrom(bArr);
                        }
                        bVar.f229420e = lVar3;
                    }
                    return 0;
                case 3:
                    bVar.f229421f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bVar.f229422g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    bVar.f229423h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    bVar.f229424i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    bVar.f229425j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    bVar.f229426n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    bVar.f229427o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
