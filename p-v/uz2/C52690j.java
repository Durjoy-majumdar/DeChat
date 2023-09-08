package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.j */
public class C52690j extends C101820nt3 {

    /* renamed from: d */
    public String f147141d;

    /* renamed from: e */
    public LinkedList<String> f147142e = new LinkedList<>();

    /* renamed from: f */
    public String f147143f;

    /* renamed from: g */
    public long f147144g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52690j)) {
            return false;
        }
        C52690j jVar = (C52690j) aVar;
        return C46238a.m51546a(this.BaseRequest, jVar.BaseRequest) && C46238a.m51546a(this.f147141d, jVar.f147141d) && C46238a.m51546a(this.f147142e, jVar.f147142e) && C46238a.m51546a(this.f147143f, jVar.f147143f) && C46238a.m51546a(Long.valueOf(this.f147144g), Long.valueOf(jVar.f147144g));
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
            String str = this.f147141d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.f147142e);
            String str2 = this.f147143f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74321h(5, this.f147144g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f147141d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f147142e);
            String str4 = this.f147143f;
            if (str4 != null) {
                g += C52418a.m58683j(4, str4);
            }
            return g + C52418a.m58681h(5, this.f147144g);
        } else if (i == 2) {
            this.f147142e.clear();
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
            C52690j jVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    jVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                jVar.f147141d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                jVar.f147142e.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 4) {
                jVar.f147143f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                jVar.f147144g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C90417ia iaVar = this.BaseRequest;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BaseRequest", iaVar, false);
            aVar.mo71655d(jSONObject, "text_status_ext_info", this.f147141d, false);
            aVar.mo71655d(jSONObject, "blacklist_usernames", this.f147142e, false);
            aVar.mo71655d(jSONObject, "text_status_id", this.f147143f, false);
            aVar.mo71655d(jSONObject, "mod_status_option", Long.valueOf(this.f147144g), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
