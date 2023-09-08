package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qu */
public class C64664qu extends C47465a {

    /* renamed from: d */
    public String f185072d;

    /* renamed from: e */
    public String f185073e;

    /* renamed from: f */
    public C77935gl2 f185074f;

    /* renamed from: g */
    public C77935gl2 f185075g;

    /* renamed from: h */
    public String f185076h;

    /* renamed from: i */
    public String f185077i;

    /* renamed from: j */
    public int f185078j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64664qu)) {
            return false;
        }
        C64664qu quVar = (C64664qu) aVar;
        return C46238a.m51546a(this.f185072d, quVar.f185072d) && C46238a.m51546a(this.f185073e, quVar.f185073e) && C46238a.m51546a(this.f185074f, quVar.f185074f) && C46238a.m51546a(this.f185075g, quVar.f185075g) && C46238a.m51546a(this.f185076h, quVar.f185076h) && C46238a.m51546a(this.f185077i, quVar.f185077i) && C46238a.m51546a(Integer.valueOf(this.f185078j), Integer.valueOf(quVar.f185078j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185072d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185073e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            C77935gl2 gl22 = this.f185074f;
            if (gl22 != null) {
                aVar.mo74322i(3, gl22.computeSize());
                this.f185074f.writeFields(aVar);
            }
            C77935gl2 gl23 = this.f185075g;
            if (gl23 != null) {
                aVar.mo74322i(4, gl23.computeSize());
                this.f185075g.writeFields(aVar);
            }
            String str3 = this.f185076h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f185077i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f185078j);
            return 0;
        } else if (i == 1) {
            String str5 = this.f185072d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f185073e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            C77935gl2 gl24 = this.f185074f;
            if (gl24 != null) {
                i2 += C52418a.m58682i(3, gl24.computeSize());
            }
            C77935gl2 gl25 = this.f185075g;
            if (gl25 != null) {
                i2 += C52418a.m58682i(4, gl25.computeSize());
            }
            String str7 = this.f185076h;
            if (str7 != null) {
                i2 += C52418a.m58683j(5, str7);
            }
            String str8 = this.f185077i;
            if (str8 != null) {
                i2 += C52418a.m58683j(6, str8);
            }
            return i2 + C52418a.m58678e(7, this.f185078j);
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
            C64664qu quVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    quVar.f185072d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    quVar.f185073e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C77935gl2 gl26 = new C77935gl2();
                        if (bArr != null && bArr.length > 0) {
                            gl26.parseFrom(bArr);
                        }
                        quVar.f185074f = gl26;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77935gl2 gl27 = new C77935gl2();
                        if (bArr2 != null && bArr2.length > 0) {
                            gl27.parseFrom(bArr2);
                        }
                        quVar.f185075g = gl27;
                    }
                    return 0;
                case 5:
                    quVar.f185076h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    quVar.f185077i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    quVar.f185078j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
