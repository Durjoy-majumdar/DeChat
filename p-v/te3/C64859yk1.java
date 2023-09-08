package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yk1 */
public class C64859yk1 extends C47465a {

    /* renamed from: d */
    public FinderObject f186566d;

    /* renamed from: e */
    public int f186567e;

    /* renamed from: f */
    public String f186568f;

    /* renamed from: g */
    public long f186569g;

    /* renamed from: h */
    public C64370fp1 f186570h;

    /* renamed from: i */
    public C51559uk1 f186571i;

    /* renamed from: j */
    public String f186572j;

    /* renamed from: n */
    public String f186573n;

    /* renamed from: o */
    public String f186574o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64859yk1)) {
            return false;
        }
        C64859yk1 yk12 = (C64859yk1) aVar;
        return C46238a.m51546a(this.f186566d, yk12.f186566d) && C46238a.m51546a(Integer.valueOf(this.f186567e), Integer.valueOf(yk12.f186567e)) && C46238a.m51546a(this.f186568f, yk12.f186568f) && C46238a.m51546a(Long.valueOf(this.f186569g), Long.valueOf(yk12.f186569g)) && C46238a.m51546a(this.f186570h, yk12.f186570h) && C46238a.m51546a(this.f186571i, yk12.f186571i) && C46238a.m51546a(this.f186572j, yk12.f186572j) && C46238a.m51546a(this.f186573n, yk12.f186573n) && C46238a.m51546a(this.f186574o, yk12.f186574o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderObject finderObject = this.f186566d;
            if (finderObject != null) {
                aVar.mo74322i(1, finderObject.computeSize());
                this.f186566d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f186567e);
            String str = this.f186568f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f186569g);
            C64370fp1 fp12 = this.f186570h;
            if (fp12 != null) {
                aVar.mo74322i(5, fp12.computeSize());
                this.f186570h.writeFields(aVar);
            }
            C51559uk1 uk12 = this.f186571i;
            if (uk12 != null) {
                aVar.mo74322i(6, uk12.computeSize());
                this.f186571i.writeFields(aVar);
            }
            String str2 = this.f186572j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            String str3 = this.f186573n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            String str4 = this.f186574o;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            return 0;
        } else if (i == 1) {
            FinderObject finderObject2 = this.f186566d;
            if (finderObject2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderObject2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f186567e);
            String str5 = this.f186568f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int h = e + C52418a.m58681h(4, this.f186569g);
            C64370fp1 fp13 = this.f186570h;
            if (fp13 != null) {
                h += C52418a.m58682i(5, fp13.computeSize());
            }
            C51559uk1 uk13 = this.f186571i;
            if (uk13 != null) {
                h += C52418a.m58682i(6, uk13.computeSize());
            }
            String str6 = this.f186572j;
            if (str6 != null) {
                h += C52418a.m58683j(7, str6);
            }
            String str7 = this.f186573n;
            if (str7 != null) {
                h += C52418a.m58683j(8, str7);
            }
            String str8 = this.f186574o;
            return str8 != null ? h + C52418a.m58683j(9, str8) : h;
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
            C64859yk1 yk12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderObject finderObject3 = new FinderObject();
                        if (bArr != null && bArr.length > 0) {
                            finderObject3.parseFrom(bArr);
                        }
                        yk12.f186566d = finderObject3;
                    }
                    return 0;
                case 2:
                    yk12.f186567e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    yk12.f186568f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    yk12.f186569g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64370fp1 fp14 = new C64370fp1();
                        if (bArr2 != null && bArr2.length > 0) {
                            fp14.parseFrom(bArr2);
                        }
                        yk12.f186570h = fp14;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51559uk1 uk14 = new C51559uk1();
                        if (bArr3 != null && bArr3.length > 0) {
                            uk14.parseFrom(bArr3);
                        }
                        yk12.f186571i = uk14;
                    }
                    return 0;
                case 7:
                    yk12.f186572j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    yk12.f186573n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    yk12.f186574o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
