package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ne2 */
public class C50530ne2 extends C101820nt3 {

    /* renamed from: d */
    public C52129yk2 f138550d;

    /* renamed from: e */
    public String f138551e;

    /* renamed from: f */
    public C51018qv3 f138552f;

    /* renamed from: g */
    public String f138553g;

    /* renamed from: h */
    public int f138554h;

    /* renamed from: i */
    public String f138555i;

    /* renamed from: j */
    public String f138556j;

    /* renamed from: n */
    public String f138557n;

    /* renamed from: o */
    public int f138558o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50530ne2)) {
            return false;
        }
        C50530ne2 ne22 = (C50530ne2) aVar;
        return C46238a.m51546a(this.BaseRequest, ne22.BaseRequest) && C46238a.m51546a(this.f138550d, ne22.f138550d) && C46238a.m51546a(this.f138551e, ne22.f138551e) && C46238a.m51546a(this.f138552f, ne22.f138552f) && C46238a.m51546a(this.f138553g, ne22.f138553g) && C46238a.m51546a(Integer.valueOf(this.f138554h), Integer.valueOf(ne22.f138554h)) && C46238a.m51546a(this.f138555i, ne22.f138555i) && C46238a.m51546a(this.f138556j, ne22.f138556j) && C46238a.m51546a(this.f138557n, ne22.f138557n) && C46238a.m51546a(Integer.valueOf(this.f138558o), Integer.valueOf(ne22.f138558o));
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
            C52129yk2 yk22 = this.f138550d;
            if (yk22 != null) {
                aVar.mo74322i(2, yk22.computeSize());
                this.f138550d.writeFields(aVar);
            }
            String str = this.f138551e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C51018qv3 qv32 = this.f138552f;
            if (qv32 != null) {
                aVar.mo74322i(4, qv32.computeSize());
                this.f138552f.writeFields(aVar);
            }
            String str2 = this.f138553g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f138554h);
            String str3 = this.f138555i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f138556j;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f138557n;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            aVar.mo74318e(10, this.f138558o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C52129yk2 yk23 = this.f138550d;
            if (yk23 != null) {
                i2 += C52418a.m58682i(2, yk23.computeSize());
            }
            String str6 = this.f138551e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            C51018qv3 qv33 = this.f138552f;
            if (qv33 != null) {
                i2 += C52418a.m58682i(4, qv33.computeSize());
            }
            String str7 = this.f138553g;
            if (str7 != null) {
                i2 += C52418a.m58683j(5, str7);
            }
            int e = i2 + C52418a.m58678e(6, this.f138554h);
            String str8 = this.f138555i;
            if (str8 != null) {
                e += C52418a.m58683j(7, str8);
            }
            String str9 = this.f138556j;
            if (str9 != null) {
                e += C52418a.m58683j(8, str9);
            }
            String str10 = this.f138557n;
            if (str10 != null) {
                e += C52418a.m58683j(9, str10);
            }
            return e + C52418a.m58678e(10, this.f138558o);
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
            C50530ne2 ne22 = objArr[1];
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
                        ne22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C52129yk2 yk24 = new C52129yk2();
                        if (bArr2 != null && bArr2.length > 0) {
                            yk24.parseFrom(bArr2);
                        }
                        ne22.f138550d = yk24;
                    }
                    return 0;
                case 3:
                    ne22.f138551e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv34.mo73348f(bArr3);
                        }
                        ne22.f138552f = qv34;
                    }
                    return 0;
                case 5:
                    ne22.f138553g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ne22.f138554h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ne22.f138555i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ne22.f138556j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ne22.f138557n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ne22.f138558o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
