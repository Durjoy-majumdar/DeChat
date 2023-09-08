package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class pr4 extends C47465a {

    /* renamed from: d */
    public String f139919d;

    /* renamed from: e */
    public int f139920e;

    /* renamed from: f */
    public int f139921f;

    /* renamed from: g */
    public C51754vy f139922g;

    /* renamed from: h */
    public C50978qm f139923h;

    /* renamed from: i */
    public C50350m4 f139924i;

    /* renamed from: j */
    public C48671a60 f139925j;

    /* renamed from: n */
    public int f139926n;

    /* renamed from: o */
    public int f139927o;

    /* renamed from: p */
    public int f139928p;

    /* renamed from: q */
    public yq4 f139929q;

    /* renamed from: r */
    public C50799p90 f139930r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof pr4)) {
            return false;
        }
        pr4 pr4 = (pr4) aVar;
        return C46238a.m51546a(this.f139919d, pr4.f139919d) && C46238a.m51546a(Integer.valueOf(this.f139920e), Integer.valueOf(pr4.f139920e)) && C46238a.m51546a(Integer.valueOf(this.f139921f), Integer.valueOf(pr4.f139921f)) && C46238a.m51546a(this.f139922g, pr4.f139922g) && C46238a.m51546a(this.f139923h, pr4.f139923h) && C46238a.m51546a(this.f139924i, pr4.f139924i) && C46238a.m51546a(this.f139925j, pr4.f139925j) && C46238a.m51546a(Integer.valueOf(this.f139926n), Integer.valueOf(pr4.f139926n)) && C46238a.m51546a(Integer.valueOf(this.f139927o), Integer.valueOf(pr4.f139927o)) && C46238a.m51546a(Integer.valueOf(this.f139928p), Integer.valueOf(pr4.f139928p)) && C46238a.m51546a(this.f139929q, pr4.f139929q) && C46238a.m51546a(this.f139930r, pr4.f139930r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139919d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f139920e);
            aVar.mo74318e(3, this.f139921f);
            C51754vy vyVar = this.f139922g;
            if (vyVar != null) {
                aVar.mo74322i(4, vyVar.computeSize());
                this.f139922g.writeFields(aVar);
            }
            C50978qm qmVar = this.f139923h;
            if (qmVar != null) {
                aVar.mo74322i(5, qmVar.computeSize());
                this.f139923h.writeFields(aVar);
            }
            C50350m4 m4Var = this.f139924i;
            if (m4Var != null) {
                aVar.mo74322i(6, m4Var.computeSize());
                this.f139924i.writeFields(aVar);
            }
            C48671a60 a602 = this.f139925j;
            if (a602 != null) {
                aVar.mo74322i(7, a602.computeSize());
                this.f139925j.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f139926n);
            aVar.mo74318e(9, this.f139927o);
            aVar.mo74318e(10, this.f139928p);
            yq4 yq4 = this.f139929q;
            if (yq4 != null) {
                aVar.mo74322i(11, yq4.computeSize());
                this.f139929q.writeFields(aVar);
            }
            C50799p90 p902 = this.f139930r;
            if (p902 != null) {
                aVar.mo74322i(12, p902.computeSize());
                this.f139930r.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f139919d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f139920e) + C52418a.m58678e(3, this.f139921f);
            C51754vy vyVar2 = this.f139922g;
            if (vyVar2 != null) {
                e += C52418a.m58682i(4, vyVar2.computeSize());
            }
            C50978qm qmVar2 = this.f139923h;
            if (qmVar2 != null) {
                e += C52418a.m58682i(5, qmVar2.computeSize());
            }
            C50350m4 m4Var2 = this.f139924i;
            if (m4Var2 != null) {
                e += C52418a.m58682i(6, m4Var2.computeSize());
            }
            C48671a60 a603 = this.f139925j;
            if (a603 != null) {
                e += C52418a.m58682i(7, a603.computeSize());
            }
            int e2 = e + C52418a.m58678e(8, this.f139926n) + C52418a.m58678e(9, this.f139927o) + C52418a.m58678e(10, this.f139928p);
            yq4 yq42 = this.f139929q;
            if (yq42 != null) {
                e2 += C52418a.m58682i(11, yq42.computeSize());
            }
            C50799p90 p903 = this.f139930r;
            return p903 != null ? e2 + C52418a.m58682i(12, p903.computeSize()) : e2;
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
            pr4 pr4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pr4.f139919d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    pr4.f139920e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    pr4.f139921f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51754vy vyVar3 = new C51754vy();
                        if (bArr != null && bArr.length > 0) {
                            vyVar3.parseFrom(bArr);
                        }
                        pr4.f139922g = vyVar3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50978qm qmVar3 = new C50978qm();
                        if (bArr2 != null && bArr2.length > 0) {
                            qmVar3.parseFrom(bArr2);
                        }
                        pr4.f139923h = qmVar3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50350m4 m4Var3 = new C50350m4();
                        if (bArr3 != null && bArr3.length > 0) {
                            m4Var3.parseFrom(bArr3);
                        }
                        pr4.f139924i = m4Var3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C48671a60 a604 = new C48671a60();
                        if (bArr4 != null && bArr4.length > 0) {
                            a604.parseFrom(bArr4);
                        }
                        pr4.f139925j = a604;
                    }
                    return 0;
                case 8:
                    pr4.f139926n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    pr4.f139927o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    pr4.f139928p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        yq4 yq43 = new yq4();
                        if (bArr5 != null && bArr5.length > 0) {
                            yq43.parseFrom(bArr5);
                        }
                        pr4.f139929q = yq43;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C50799p90 p904 = new C50799p90();
                        if (bArr6 != null && bArr6.length > 0) {
                            p904.parseFrom(bArr6);
                        }
                        pr4.f139930r = p904;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
