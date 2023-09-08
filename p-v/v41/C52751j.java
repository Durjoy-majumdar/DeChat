package v41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: v41.j */
public class C52751j extends C47465a {

    /* renamed from: d */
    public String f147394d;

    /* renamed from: e */
    public long f147395e;

    /* renamed from: f */
    public C52754m f147396f;

    /* renamed from: g */
    public String f147397g;

    /* renamed from: h */
    public String f147398h;

    /* renamed from: i */
    public String f147399i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52751j)) {
            return false;
        }
        C52751j jVar = (C52751j) aVar;
        return C46238a.m51546a(this.f147394d, jVar.f147394d) && C46238a.m51546a(Long.valueOf(this.f147395e), Long.valueOf(jVar.f147395e)) && C46238a.m51546a(this.f147396f, jVar.f147396f) && C46238a.m51546a(this.f147397g, jVar.f147397g) && C46238a.m51546a(this.f147398h, jVar.f147398h) && C46238a.m51546a(this.f147399i, jVar.f147399i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147394d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f147395e);
                C52754m mVar = this.f147396f;
                if (mVar != null) {
                    aVar.mo74322i(3, mVar.computeSize());
                    this.f147396f.writeFields(aVar);
                }
                String str2 = this.f147397g;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f147398h;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f147399i;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: download_url");
        } else if (i == 1) {
            String str5 = this.f147394d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int h = i2 + C52418a.m58681h(2, this.f147395e);
            C52754m mVar2 = this.f147396f;
            if (mVar2 != null) {
                h += C52418a.m58682i(3, mVar2.computeSize());
            }
            String str6 = this.f147397g;
            if (str6 != null) {
                h += C52418a.m58683j(4, str6);
            }
            String str7 = this.f147398h;
            if (str7 != null) {
                h += C52418a.m58683j(5, str7);
            }
            String str8 = this.f147399i;
            return str8 != null ? h + C52418a.m58683j(6, str8) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f147394d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: download_url");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52751j jVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jVar.f147394d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    jVar.f147395e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C52754m mVar3 = new C52754m();
                        if (bArr != null && bArr.length > 0) {
                            mVar3.parseFrom(bArr);
                        }
                        jVar.f147396f = mVar3;
                    }
                    return 0;
                case 4:
                    jVar.f147397g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    jVar.f147398h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    jVar.f147399i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
