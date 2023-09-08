package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sy0 */
public class C51314sy0 extends C47465a {

    /* renamed from: d */
    public long f141826d;

    /* renamed from: e */
    public String f141827e;

    /* renamed from: f */
    public String f141828f;

    /* renamed from: g */
    public String f141829g;

    /* renamed from: h */
    public long f141830h;

    /* renamed from: i */
    public String f141831i;

    /* renamed from: j */
    public int f141832j;

    /* renamed from: n */
    public C64513l40 f141833n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51314sy0)) {
            return false;
        }
        C51314sy0 sy02 = (C51314sy0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f141826d), Long.valueOf(sy02.f141826d)) && C46238a.m51546a(this.f141827e, sy02.f141827e) && C46238a.m51546a(this.f141828f, sy02.f141828f) && C46238a.m51546a(this.f141829g, sy02.f141829g) && C46238a.m51546a(Long.valueOf(this.f141830h), Long.valueOf(sy02.f141830h)) && C46238a.m51546a(this.f141831i, sy02.f141831i) && C46238a.m51546a(Integer.valueOf(this.f141832j), Integer.valueOf(sy02.f141832j)) && C46238a.m51546a(this.f141833n, sy02.f141833n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f141826d);
            String str = this.f141827e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f141828f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f141829g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74321h(5, this.f141830h);
            String str4 = this.f141831i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f141832j);
            C64513l40 l402 = this.f141833n;
            if (l402 != null) {
                aVar.mo74322i(8, l402.computeSize());
                this.f141833n.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f141826d) + 0;
            String str5 = this.f141827e;
            if (str5 != null) {
                h += C52418a.m58683j(2, str5);
            }
            String str6 = this.f141828f;
            if (str6 != null) {
                h += C52418a.m58683j(3, str6);
            }
            String str7 = this.f141829g;
            if (str7 != null) {
                h += C52418a.m58683j(4, str7);
            }
            int h2 = h + C52418a.m58681h(5, this.f141830h);
            String str8 = this.f141831i;
            if (str8 != null) {
                h2 += C52418a.m58683j(6, str8);
            }
            int e = h2 + C52418a.m58678e(7, this.f141832j);
            C64513l40 l403 = this.f141833n;
            return l403 != null ? e + C52418a.m58682i(8, l403.computeSize()) : e;
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
            C51314sy0 sy02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    sy02.f141826d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    sy02.f141827e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    sy02.f141828f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    sy02.f141829g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    sy02.f141830h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    sy02.f141831i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    sy02.f141832j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64513l40 l404 = new C64513l40();
                        if (bArr != null && bArr.length > 0) {
                            l404.parseFrom(bArr);
                        }
                        sy02.f141833n = l404;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
