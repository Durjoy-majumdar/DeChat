package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s34 */
public class C51197s34 extends C101820nt3 {

    /* renamed from: d */
    public int f141292d;

    /* renamed from: e */
    public float f141293e;

    /* renamed from: f */
    public float f141294f;

    /* renamed from: g */
    public int f141295g;

    /* renamed from: h */
    public String f141296h;

    /* renamed from: i */
    public String f141297i;

    /* renamed from: j */
    public int f141298j;

    /* renamed from: n */
    public int f141299n;

    /* renamed from: o */
    public int f141300o;

    /* renamed from: p */
    public C51018qv3 f141301p;

    /* renamed from: q */
    public C51018qv3 f141302q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51197s34)) {
            return false;
        }
        C51197s34 s342 = (C51197s34) aVar;
        return C46238a.m51546a(this.BaseRequest, s342.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f141292d), Integer.valueOf(s342.f141292d)) && C46238a.m51546a(Float.valueOf(this.f141293e), Float.valueOf(s342.f141293e)) && C46238a.m51546a(Float.valueOf(this.f141294f), Float.valueOf(s342.f141294f)) && C46238a.m51546a(Integer.valueOf(this.f141295g), Integer.valueOf(s342.f141295g)) && C46238a.m51546a(this.f141296h, s342.f141296h) && C46238a.m51546a(this.f141297i, s342.f141297i) && C46238a.m51546a(Integer.valueOf(this.f141298j), Integer.valueOf(s342.f141298j)) && C46238a.m51546a(Integer.valueOf(this.f141299n), Integer.valueOf(s342.f141299n)) && C46238a.m51546a(Integer.valueOf(this.f141300o), Integer.valueOf(s342.f141300o)) && C46238a.m51546a(this.f141301p, s342.f141301p) && C46238a.m51546a(this.f141302q, s342.f141302q);
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
            aVar.mo74318e(2, this.f141292d);
            aVar.mo74317d(3, this.f141293e);
            aVar.mo74317d(4, this.f141294f);
            aVar.mo74318e(5, this.f141295g);
            String str = this.f141296h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            String str2 = this.f141297i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f141298j);
            aVar.mo74318e(9, this.f141299n);
            aVar.mo74318e(10, this.f141300o);
            C51018qv3 qv32 = this.f141301p;
            if (qv32 != null) {
                aVar.mo74322i(11, qv32.computeSize());
                this.f141301p.writeFields(aVar);
            }
            C51018qv3 qv33 = this.f141302q;
            if (qv33 != null) {
                aVar.mo74322i(12, qv33.computeSize());
                this.f141302q.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f141292d) + C52418a.m58677d(3, this.f141293e) + C52418a.m58677d(4, this.f141294f) + C52418a.m58678e(5, this.f141295g);
            String str3 = this.f141296h;
            if (str3 != null) {
                e += C52418a.m58683j(6, str3);
            }
            String str4 = this.f141297i;
            if (str4 != null) {
                e += C52418a.m58683j(7, str4);
            }
            int e2 = e + C52418a.m58678e(8, this.f141298j) + C52418a.m58678e(9, this.f141299n) + C52418a.m58678e(10, this.f141300o);
            C51018qv3 qv34 = this.f141301p;
            if (qv34 != null) {
                e2 += C52418a.m58682i(11, qv34.computeSize());
            }
            C51018qv3 qv35 = this.f141302q;
            return qv35 != null ? e2 + C52418a.m58682i(12, qv35.computeSize()) : e2;
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
            C51197s34 s342 = objArr[1];
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
                        s342.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    s342.f141292d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    s342.f141293e = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    s342.f141294f = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    s342.f141295g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    s342.f141296h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    s342.f141297i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    s342.f141298j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    s342.f141299n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    s342.f141300o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv36.mo73348f(bArr2);
                        }
                        s342.f141301p = qv36;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv37.mo73348f(bArr3);
                        }
                        s342.f141302q = qv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
