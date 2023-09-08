package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

public class o64 extends C101820nt3 {

    /* renamed from: d */
    public String f298959d;

    /* renamed from: e */
    public long f298960e;

    /* renamed from: f */
    public long f298961f;

    /* renamed from: g */
    public int f298962g;

    /* renamed from: h */
    public long f298963h;

    /* renamed from: i */
    public C51018qv3 f298964i;

    /* renamed from: j */
    public int f298965j;

    /* renamed from: n */
    public int f298966n;

    /* renamed from: o */
    public LinkedList<Long> f298967o = new LinkedList<>();

    /* renamed from: p */
    public int f298968p;

    /* renamed from: q */
    public int f298969q;

    /* renamed from: r */
    public long f298970r;

    /* renamed from: s */
    public long f298971s;

    /* renamed from: t */
    public long f298972t;

    /* renamed from: u */
    public int f298973u;

    /* renamed from: v */
    public long f298974v;

    /* renamed from: w */
    public C51018qv3 f298975w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof o64)) {
            return false;
        }
        o64 o64 = (o64) aVar;
        return C46238a.m51546a(this.BaseRequest, o64.BaseRequest) && C46238a.m51546a(this.f298959d, o64.f298959d) && C46238a.m51546a(Long.valueOf(this.f298960e), Long.valueOf(o64.f298960e)) && C46238a.m51546a(Long.valueOf(this.f298961f), Long.valueOf(o64.f298961f)) && C46238a.m51546a(Integer.valueOf(this.f298962g), Integer.valueOf(o64.f298962g)) && C46238a.m51546a(Long.valueOf(this.f298963h), Long.valueOf(o64.f298963h)) && C46238a.m51546a(this.f298964i, o64.f298964i) && C46238a.m51546a(Integer.valueOf(this.f298965j), Integer.valueOf(o64.f298965j)) && C46238a.m51546a(Integer.valueOf(this.f298966n), Integer.valueOf(o64.f298966n)) && C46238a.m51546a(this.f298967o, o64.f298967o) && C46238a.m51546a(Integer.valueOf(this.f298968p), Integer.valueOf(o64.f298968p)) && C46238a.m51546a(Integer.valueOf(this.f298969q), Integer.valueOf(o64.f298969q)) && C46238a.m51546a(Long.valueOf(this.f298970r), Long.valueOf(o64.f298970r)) && C46238a.m51546a(Long.valueOf(this.f298971s), Long.valueOf(o64.f298971s)) && C46238a.m51546a(Long.valueOf(this.f298972t), Long.valueOf(o64.f298972t)) && C46238a.m51546a(Integer.valueOf(this.f298973u), Integer.valueOf(o64.f298973u)) && C46238a.m51546a(Long.valueOf(this.f298974v), Long.valueOf(o64.f298974v)) && C46238a.m51546a(this.f298975w, o64.f298975w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f298959d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f298960e);
            aVar.mo74321h(4, this.f298961f);
            aVar.mo74318e(5, this.f298962g);
            aVar.mo74321h(6, this.f298963h);
            C51018qv3 qv32 = this.f298964i;
            if (qv32 != null) {
                aVar.mo74322i(7, qv32.computeSize());
                this.f298964i.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f298965j);
            aVar.mo74318e(11, this.f298966n);
            aVar.mo74324k(12, 3, this.f298967o);
            aVar.mo74318e(13, this.f298968p);
            aVar.mo74318e(14, this.f298969q);
            aVar.mo74321h(15, this.f298970r);
            aVar.mo74321h(16, this.f298971s);
            aVar.mo74321h(17, this.f298972t);
            aVar.mo74318e(18, this.f298973u);
            aVar.mo74321h(19, this.f298974v);
            C51018qv3 qv33 = this.f298975w;
            if (qv33 == null) {
                return 0;
            }
            aVar.mo74322i(20, qv33.computeSize());
            this.f298975w.writeFields(aVar);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0;
            String str2 = this.f298959d;
            if (str2 != null) {
                i3 += C52418a.m58683j(2, str2);
            }
            int h = i3 + C52418a.m58681h(3, this.f298960e) + C52418a.m58681h(4, this.f298961f) + C52418a.m58678e(5, this.f298962g) + C52418a.m58681h(6, this.f298963h);
            C51018qv3 qv34 = this.f298964i;
            if (qv34 != null) {
                h += C52418a.m58682i(7, qv34.computeSize());
            }
            int e = h + C52418a.m58678e(8, this.f298965j) + C52418a.m58678e(11, this.f298966n) + C52418a.m58684k(12, 3, this.f298967o) + C52418a.m58678e(13, this.f298968p) + C52418a.m58678e(14, this.f298969q) + C52418a.m58681h(15, this.f298970r) + C52418a.m58681h(16, this.f298971s) + C52418a.m58681h(17, this.f298972t) + C52418a.m58678e(18, this.f298973u) + C52418a.m58681h(19, this.f298974v);
            C51018qv3 qv35 = this.f298975w;
            return qv35 != null ? e + C52418a.m58682i(20, qv35.computeSize()) : e;
        } else if (i2 == 2) {
            this.f298967o.clear();
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
            o64 o64 = objArr[1];
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
                        o64.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    o64.f298959d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    o64.f298960e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    o64.f298961f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    o64.f298962g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    o64.f298963h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv36.mo73348f(bArr2);
                        }
                        o64.f298964i = qv36;
                    }
                    return 0;
                case 8:
                    o64.f298965j = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    o64.f298966n = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    byte[] bArr3 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar4 = new C102536a(bArr3, 0, bArr3.length);
                    LinkedList<Long> linkedList = new LinkedList<>();
                    while (aVar4.f301908c < aVar4.f301907b) {
                        linkedList.add(Long.valueOf(aVar4.mo142154g()));
                    }
                    o64.f298967o = linkedList;
                    return 0;
                case 13:
                    o64.f298968p = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    o64.f298969q = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    o64.f298970r = aVar3.mo141631i(intValue);
                    return 0;
                case 16:
                    o64.f298971s = aVar3.mo141631i(intValue);
                    return 0;
                case 17:
                    o64.f298972t = aVar3.mo141631i(intValue);
                    return 0;
                case 18:
                    o64.f298973u = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    o64.f298974v = aVar3.mo141631i(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr4 = j3.get(i6);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv37.mo73348f(bArr4);
                        }
                        o64.f298975w = qv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
