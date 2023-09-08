package l10;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: l10.i */
public class C46830i extends C47465a {

    /* renamed from: d */
    public long f125961d;

    /* renamed from: e */
    public String f125962e;

    /* renamed from: f */
    public int f125963f;

    /* renamed from: g */
    public String f125964g;

    /* renamed from: h */
    public LinkedList<C46831j> f125965h = new LinkedList<>();

    /* renamed from: i */
    public String f125966i;

    /* renamed from: j */
    public String f125967j;

    /* renamed from: n */
    public String f125968n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C46830i)) {
            return false;
        }
        C46830i iVar = (C46830i) aVar;
        return C46238a.m51546a(Long.valueOf(this.f125961d), Long.valueOf(iVar.f125961d)) && C46238a.m51546a(this.f125962e, iVar.f125962e) && C46238a.m51546a(Integer.valueOf(this.f125963f), Integer.valueOf(iVar.f125963f)) && C46238a.m51546a(this.f125964g, iVar.f125964g) && C46238a.m51546a(this.f125965h, iVar.f125965h) && C46238a.m51546a(this.f125966i, iVar.f125966i) && C46238a.m51546a(this.f125967j, iVar.f125967j) && C46238a.m51546a(this.f125968n, iVar.f125968n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f125962e == null) {
                throw new C52419b("Not all required fields were included: snsId");
            } else if (this.f125964g == null) {
                throw new C52419b("Not all required fields were included: desc");
            } else if (this.f125966i == null) {
                throw new C52419b("Not all required fields were included: localId");
            } else if (this.f125968n != null) {
                aVar.mo74321h(1, this.f125961d);
                String str = this.f125962e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f125963f);
                String str2 = this.f125964g;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74320g(5, 8, this.f125965h);
                String str3 = this.f125966i;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                String str4 = this.f125967j;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                String str5 = this.f125968n;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: publishId");
            }
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f125961d) + 0;
            String str6 = this.f125962e;
            if (str6 != null) {
                h += C52418a.m58683j(2, str6);
            }
            int e = h + C52418a.m58678e(3, this.f125963f);
            String str7 = this.f125964g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            int g = e + C52418a.m58680g(5, 8, this.f125965h);
            String str8 = this.f125966i;
            if (str8 != null) {
                g += C52418a.m58683j(6, str8);
            }
            String str9 = this.f125967j;
            if (str9 != null) {
                g += C52418a.m58683j(7, str9);
            }
            String str10 = this.f125968n;
            return str10 != null ? g + C52418a.m58683j(8, str10) : g;
        } else if (i == 2) {
            this.f125965h.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f125962e == null) {
                throw new C52419b("Not all required fields were included: snsId");
            } else if (this.f125964g == null) {
                throw new C52419b("Not all required fields were included: desc");
            } else if (this.f125966i == null) {
                throw new C52419b("Not all required fields were included: localId");
            } else if (this.f125968n != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: publishId");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C46830i iVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    iVar.f125961d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    iVar.f125962e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    iVar.f125963f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    iVar.f125964g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C46831j jVar = new C46831j();
                        if (bArr != null && bArr.length > 0) {
                            jVar.parseFrom(bArr);
                        }
                        iVar.f125965h.add(jVar);
                    }
                    return 0;
                case 6:
                    iVar.f125966i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    iVar.f125967j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    iVar.f125968n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
