package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gh1 */
public class C64396gh1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f183321d;

    /* renamed from: e */
    public String f183322e;

    /* renamed from: f */
    public FinderObjectDesc f183323f;

    /* renamed from: g */
    public int f183324g;

    /* renamed from: h */
    public String f183325h;

    /* renamed from: i */
    public int f183326i;

    /* renamed from: j */
    public long f183327j;

    /* renamed from: n */
    public C51388tf0 f183328n;

    /* renamed from: o */
    public int f183329o;

    /* renamed from: p */
    public long f183330p;

    /* renamed from: q */
    public C89349b f183331q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64396gh1)) {
            return false;
        }
        C64396gh1 gh12 = (C64396gh1) aVar;
        return C46238a.m51546a(this.BaseRequest, gh12.BaseRequest) && C46238a.m51546a(this.f183321d, gh12.f183321d) && C46238a.m51546a(this.f183322e, gh12.f183322e) && C46238a.m51546a(this.f183323f, gh12.f183323f) && C46238a.m51546a(Integer.valueOf(this.f183324g), Integer.valueOf(gh12.f183324g)) && C46238a.m51546a(this.f183325h, gh12.f183325h) && C46238a.m51546a(Integer.valueOf(this.f183326i), Integer.valueOf(gh12.f183326i)) && C46238a.m51546a(Long.valueOf(this.f183327j), Long.valueOf(gh12.f183327j)) && C46238a.m51546a(this.f183328n, gh12.f183328n) && C46238a.m51546a(Integer.valueOf(this.f183329o), Integer.valueOf(gh12.f183329o)) && C46238a.m51546a(Long.valueOf(this.f183330p), Long.valueOf(gh12.f183330p)) && C46238a.m51546a(this.f183331q, gh12.f183331q);
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
            C49842ig0 ig02 = this.f183321d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f183321d.writeFields(aVar);
            }
            String str = this.f183322e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            FinderObjectDesc finderObjectDesc = this.f183323f;
            if (finderObjectDesc != null) {
                aVar.mo74322i(4, finderObjectDesc.computeSize());
                this.f183323f.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f183324g);
            String str2 = this.f183325h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f183326i);
            aVar.mo74321h(8, this.f183327j);
            C51388tf0 tf02 = this.f183328n;
            if (tf02 != null) {
                aVar.mo74322i(9, tf02.computeSize());
                this.f183328n.writeFields(aVar);
            }
            aVar.mo74318e(10, this.f183329o);
            aVar.mo74321h(11, this.f183330p);
            C89349b bVar = this.f183331q;
            if (bVar != null) {
                aVar.mo74315b(12, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f183321d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f183322e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            FinderObjectDesc finderObjectDesc2 = this.f183323f;
            if (finderObjectDesc2 != null) {
                i2 += C52418a.m58682i(4, finderObjectDesc2.computeSize());
            }
            int e = i2 + C52418a.m58678e(5, this.f183324g);
            String str4 = this.f183325h;
            if (str4 != null) {
                e += C52418a.m58683j(6, str4);
            }
            int e2 = e + C52418a.m58678e(7, this.f183326i) + C52418a.m58681h(8, this.f183327j);
            C51388tf0 tf03 = this.f183328n;
            if (tf03 != null) {
                e2 += C52418a.m58682i(9, tf03.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(10, this.f183329o) + C52418a.m58681h(11, this.f183330p);
            C89349b bVar2 = this.f183331q;
            return bVar2 != null ? e3 + C52418a.m58675b(12, bVar2) : e3;
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
            C64396gh1 gh12 = objArr[1];
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
                        gh12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        gh12.f183321d = ig04;
                    }
                    return 0;
                case 3:
                    gh12.f183322e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        FinderObjectDesc finderObjectDesc3 = new FinderObjectDesc();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderObjectDesc3.parseFrom(bArr3);
                        }
                        gh12.f183323f = finderObjectDesc3;
                    }
                    return 0;
                case 5:
                    gh12.f183324g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    gh12.f183325h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    gh12.f183326i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    gh12.f183327j = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51388tf0 tf04 = new C51388tf0();
                        if (bArr4 != null && bArr4.length > 0) {
                            tf04.parseFrom(bArr4);
                        }
                        gh12.f183328n = tf04;
                    }
                    return 0;
                case 10:
                    gh12.f183329o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    gh12.f183330p = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    gh12.f183331q = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
