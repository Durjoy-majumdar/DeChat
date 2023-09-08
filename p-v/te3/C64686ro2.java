package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ro2 */
public class C64686ro2 extends C47465a {

    /* renamed from: d */
    public int f185213d;

    /* renamed from: e */
    public int f185214e;

    /* renamed from: f */
    public String f185215f;

    /* renamed from: g */
    public String f185216g;

    /* renamed from: h */
    public C50168kr0 f185217h;

    /* renamed from: i */
    public FinderObject f185218i;

    /* renamed from: j */
    public C51395th0 f185219j;

    /* renamed from: n */
    public C51938x81 f185220n;

    /* renamed from: o */
    public String f185221o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64686ro2)) {
            return false;
        }
        C64686ro2 ro22 = (C64686ro2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185213d), Integer.valueOf(ro22.f185213d)) && C46238a.m51546a(Integer.valueOf(this.f185214e), Integer.valueOf(ro22.f185214e)) && C46238a.m51546a(this.f185215f, ro22.f185215f) && C46238a.m51546a(this.f185216g, ro22.f185216g) && C46238a.m51546a(this.f185217h, ro22.f185217h) && C46238a.m51546a(this.f185218i, ro22.f185218i) && C46238a.m51546a(this.f185219j, ro22.f185219j) && C46238a.m51546a(this.f185220n, ro22.f185220n) && C46238a.m51546a(this.f185221o, ro22.f185221o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185213d);
            aVar.mo74318e(2, this.f185214e);
            String str = this.f185215f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f185216g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C50168kr0 kr02 = this.f185217h;
            if (kr02 != null) {
                aVar.mo74322i(5, kr02.computeSize());
                this.f185217h.writeFields(aVar);
            }
            FinderObject finderObject = this.f185218i;
            if (finderObject != null) {
                aVar.mo74322i(6, finderObject.computeSize());
                this.f185218i.writeFields(aVar);
            }
            C51395th0 th02 = this.f185219j;
            if (th02 != null) {
                aVar.mo74322i(7, th02.computeSize());
                this.f185219j.writeFields(aVar);
            }
            C51938x81 x812 = this.f185220n;
            if (x812 != null) {
                aVar.mo74322i(8, x812.computeSize());
                this.f185220n.writeFields(aVar);
            }
            String str3 = this.f185221o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f185213d) + 0 + C52418a.m58678e(2, this.f185214e);
            String str4 = this.f185215f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f185216g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            C50168kr0 kr03 = this.f185217h;
            if (kr03 != null) {
                e += C52418a.m58682i(5, kr03.computeSize());
            }
            FinderObject finderObject2 = this.f185218i;
            if (finderObject2 != null) {
                e += C52418a.m58682i(6, finderObject2.computeSize());
            }
            C51395th0 th03 = this.f185219j;
            if (th03 != null) {
                e += C52418a.m58682i(7, th03.computeSize());
            }
            C51938x81 x813 = this.f185220n;
            if (x813 != null) {
                e += C52418a.m58682i(8, x813.computeSize());
            }
            String str6 = this.f185221o;
            return str6 != null ? e + C52418a.m58683j(9, str6) : e;
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
            C64686ro2 ro22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ro22.f185213d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ro22.f185214e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ro22.f185215f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ro22.f185216g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50168kr0 kr04 = new C50168kr0();
                        if (bArr != null && bArr.length > 0) {
                            kr04.parseFrom(bArr);
                        }
                        ro22.f185217h = kr04;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        FinderObject finderObject3 = new FinderObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderObject3.parseFrom(bArr2);
                        }
                        ro22.f185218i = finderObject3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C51395th0 th04 = new C51395th0();
                        if (bArr3 != null && bArr3.length > 0) {
                            th04.parseFrom(bArr3);
                        }
                        ro22.f185219j = th04;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C51938x81 x814 = new C51938x81();
                        if (bArr4 != null && bArr4.length > 0) {
                            x814.parseFrom(bArr4);
                        }
                        ro22.f185220n = x814;
                    }
                    return 0;
                case 9:
                    ro22.f185221o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
