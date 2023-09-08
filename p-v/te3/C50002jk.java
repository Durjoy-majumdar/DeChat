package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jk */
public class C50002jk extends C47465a {

    /* renamed from: d */
    public String f136162d;

    /* renamed from: e */
    public String f136163e;

    /* renamed from: f */
    public String f136164f;

    /* renamed from: g */
    public C50413mk f136165g;

    /* renamed from: h */
    public C50556nk f136166h;

    /* renamed from: i */
    public C49433fk f136167i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50002jk)) {
            return false;
        }
        C50002jk jkVar = (C50002jk) aVar;
        return C46238a.m51546a(this.f136162d, jkVar.f136162d) && C46238a.m51546a(this.f136163e, jkVar.f136163e) && C46238a.m51546a(this.f136164f, jkVar.f136164f) && C46238a.m51546a(this.f136165g, jkVar.f136165g) && C46238a.m51546a(this.f136166h, jkVar.f136166h) && C46238a.m51546a(this.f136167i, jkVar.f136167i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136162d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f136163e == null) {
                throw new C52419b("Not all required fields were included: Desc");
            } else if (this.f136164f == null) {
                throw new C52419b("Not all required fields were included: ThumbUrl");
            } else if (this.f136165g == null) {
                throw new C52419b("Not all required fields were included: DetailInfo");
            } else if (this.f136167i != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f136163e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f136164f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                C50413mk mkVar = this.f136165g;
                if (mkVar != null) {
                    aVar.mo74322i(4, mkVar.computeSize());
                    this.f136165g.writeFields(aVar);
                }
                C50556nk nkVar = this.f136166h;
                if (nkVar != null) {
                    aVar.mo74322i(5, nkVar.computeSize());
                    this.f136166h.writeFields(aVar);
                }
                C49433fk fkVar = this.f136167i;
                if (fkVar != null) {
                    aVar.mo74322i(6, fkVar.computeSize());
                    this.f136167i.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ActionInfo");
            }
        } else if (i == 1) {
            String str4 = this.f136162d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f136163e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f136164f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            C50413mk mkVar2 = this.f136165g;
            if (mkVar2 != null) {
                i2 += C52418a.m58682i(4, mkVar2.computeSize());
            }
            C50556nk nkVar2 = this.f136166h;
            if (nkVar2 != null) {
                i2 += C52418a.m58682i(5, nkVar2.computeSize());
            }
            C49433fk fkVar2 = this.f136167i;
            return fkVar2 != null ? i2 + C52418a.m58682i(6, fkVar2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f136162d == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f136163e == null) {
                throw new C52419b("Not all required fields were included: Desc");
            } else if (this.f136164f == null) {
                throw new C52419b("Not all required fields were included: ThumbUrl");
            } else if (this.f136165g == null) {
                throw new C52419b("Not all required fields were included: DetailInfo");
            } else if (this.f136167i != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ActionInfo");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50002jk jkVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jkVar.f136162d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    jkVar.f136163e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    jkVar.f136164f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50413mk mkVar3 = new C50413mk();
                        if (bArr != null && bArr.length > 0) {
                            mkVar3.parseFrom(bArr);
                        }
                        jkVar.f136165g = mkVar3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50556nk nkVar3 = new C50556nk();
                        if (bArr2 != null && bArr2.length > 0) {
                            nkVar3.parseFrom(bArr2);
                        }
                        jkVar.f136166h = nkVar3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49433fk fkVar3 = new C49433fk();
                        if (bArr3 != null && bArr3.length > 0) {
                            fkVar3.parseFrom(bArr3);
                        }
                        jkVar.f136167i = fkVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f136162d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Title", str, false);
            aVar.mo71655d(jSONObject, "Desc", this.f136163e, false);
            aVar.mo71655d(jSONObject, "ThumbUrl", this.f136164f, false);
            aVar.mo71655d(jSONObject, "DetailInfo", this.f136165g, false);
            aVar.mo71655d(jSONObject, "ExtendInfo", this.f136166h, false);
            aVar.mo71655d(jSONObject, "ActionInfo", this.f136167i, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
