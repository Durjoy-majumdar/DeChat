package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o52 */
public class C118450o52 extends C101820nt3 {

    /* renamed from: d */
    public int f354172d;

    /* renamed from: e */
    public int f354173e;

    /* renamed from: f */
    public String f354174f;

    /* renamed from: g */
    public C51018qv3 f354175g;

    /* renamed from: h */
    public double f354176h;

    /* renamed from: i */
    public double f354177i;

    /* renamed from: j */
    public double f354178j;

    /* renamed from: n */
    public double f354179n;

    /* renamed from: o */
    public int f354180o;

    /* renamed from: p */
    public double f354181p;

    /* renamed from: q */
    public int f354182q;

    /* renamed from: r */
    public int f354183r;

    /* renamed from: s */
    public String f354184s;

    /* renamed from: t */
    public String f354185t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118450o52)) {
            return false;
        }
        C118450o52 o522 = (C118450o52) aVar;
        return C46238a.m51546a(this.BaseRequest, o522.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f354172d), Integer.valueOf(o522.f354172d)) && C46238a.m51546a(Integer.valueOf(this.f354173e), Integer.valueOf(o522.f354173e)) && C46238a.m51546a(this.f354174f, o522.f354174f) && C46238a.m51546a(this.f354175g, o522.f354175g) && C46238a.m51546a(Double.valueOf(this.f354176h), Double.valueOf(o522.f354176h)) && C46238a.m51546a(Double.valueOf(this.f354177i), Double.valueOf(o522.f354177i)) && C46238a.m51546a(Double.valueOf(this.f354178j), Double.valueOf(o522.f354178j)) && C46238a.m51546a(Double.valueOf(this.f354179n), Double.valueOf(o522.f354179n)) && C46238a.m51546a(Integer.valueOf(this.f354180o), Integer.valueOf(o522.f354180o)) && C46238a.m51546a(Double.valueOf(this.f354181p), Double.valueOf(o522.f354181p)) && C46238a.m51546a(Integer.valueOf(this.f354182q), Integer.valueOf(o522.f354182q)) && C46238a.m51546a(Integer.valueOf(this.f354183r), Integer.valueOf(o522.f354183r)) && C46238a.m51546a(this.f354184s, o522.f354184s) && C46238a.m51546a(this.f354185t, o522.f354185t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f354175g != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f354172d);
                aVar.mo74318e(3, this.f354173e);
                String str = this.f354174f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                C51018qv3 qv32 = this.f354175g;
                if (qv32 != null) {
                    aVar.mo74322i(5, qv32.computeSize());
                    this.f354175g.writeFields(aVar);
                }
                aVar.mo74316c(6, this.f354176h);
                aVar.mo74316c(7, this.f354177i);
                aVar.mo74316c(8, this.f354178j);
                aVar.mo74316c(9, this.f354179n);
                aVar.mo74318e(10, this.f354180o);
                aVar.mo74316c(11, this.f354181p);
                aVar.mo74318e(12, this.f354182q);
                aVar.mo74318e(13, this.f354183r);
                String str2 = this.f354184s;
                if (str2 != null) {
                    aVar.mo74323j(14, str2);
                }
                String str3 = this.f354185t;
                if (str3 != null) {
                    aVar.mo74323j(15, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Buff");
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f354172d) + C52418a.m58678e(3, this.f354173e);
            String str4 = this.f354174f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            C51018qv3 qv33 = this.f354175g;
            if (qv33 != null) {
                e += C52418a.m58682i(5, qv33.computeSize());
            }
            int c = e + C52418a.m58676c(6, this.f354176h) + C52418a.m58676c(7, this.f354177i) + C52418a.m58676c(8, this.f354178j) + C52418a.m58676c(9, this.f354179n) + C52418a.m58678e(10, this.f354180o) + C52418a.m58676c(11, this.f354181p) + C52418a.m58678e(12, this.f354182q) + C52418a.m58678e(13, this.f354183r);
            String str5 = this.f354184s;
            if (str5 != null) {
                c += C52418a.m58683j(14, str5);
            }
            String str6 = this.f354185t;
            return str6 != null ? c + C52418a.m58683j(15, str6) : c;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f354175g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Buff");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118450o52 o522 = objArr[1];
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
                        o522.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    o522.f354172d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    o522.f354173e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    o522.f354174f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        o522.f354175g = qv34;
                    }
                    return 0;
                case 6:
                    o522.f354176h = aVar3.mo141627e(intValue);
                    return 0;
                case 7:
                    o522.f354177i = aVar3.mo141627e(intValue);
                    return 0;
                case 8:
                    o522.f354178j = aVar3.mo141627e(intValue);
                    return 0;
                case 9:
                    o522.f354179n = aVar3.mo141627e(intValue);
                    return 0;
                case 10:
                    o522.f354180o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    o522.f354181p = aVar3.mo141627e(intValue);
                    return 0;
                case 12:
                    o522.f354182q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    o522.f354183r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    o522.f354184s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    o522.f354185t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
