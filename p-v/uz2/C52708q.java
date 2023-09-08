package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.q */
public class C52708q extends C47465a {

    /* renamed from: d */
    public String f147179d;

    /* renamed from: e */
    public LinkedList<C52725x> f147180e = new LinkedList<>();

    /* renamed from: f */
    public int f147181f;

    /* renamed from: g */
    public String f147182g;

    /* renamed from: h */
    public String f147183h;

    /* renamed from: i */
    public int f147184i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52708q)) {
            return false;
        }
        C52708q qVar = (C52708q) aVar;
        return C46238a.m51546a(this.f147179d, qVar.f147179d) && C46238a.m51546a(this.f147180e, qVar.f147180e) && C46238a.m51546a(Integer.valueOf(this.f147181f), Integer.valueOf(qVar.f147181f)) && C46238a.m51546a(this.f147182g, qVar.f147182g) && C46238a.m51546a(this.f147183h, qVar.f147183h) && C46238a.m51546a(Integer.valueOf(this.f147184i), Integer.valueOf(qVar.f147184i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147179d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f147180e);
            aVar.mo74318e(3, this.f147181f);
            String str2 = this.f147182g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f147183h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f147184i);
            return 0;
        } else if (i == 1) {
            String str4 = this.f147179d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f147180e) + C52418a.m58678e(3, this.f147181f);
            String str5 = this.f147182g;
            if (str5 != null) {
                g += C52418a.m58683j(4, str5);
            }
            String str6 = this.f147183h;
            if (str6 != null) {
                g += C52418a.m58683j(5, str6);
            }
            return g + C52418a.m58678e(6, this.f147184i);
        } else if (i == 2) {
            this.f147180e.clear();
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
            C52708q qVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qVar.f147179d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C52725x xVar = new C52725x();
                        if (bArr != null && bArr.length > 0) {
                            xVar.parseFrom(bArr);
                        }
                        qVar.f147180e.add(xVar);
                    }
                    return 0;
                case 3:
                    qVar.f147181f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    qVar.f147182g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qVar.f147183h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    qVar.f147184i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f147179d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "iconId", str, false);
            aVar.mo71655d(jSONObject, "iconActions", this.f147180e, false);
            aVar.mo71655d(jSONObject, "character_set_type", Integer.valueOf(this.f147181f), false);
            aVar.mo71655d(jSONObject, "cluster_id", this.f147182g, false);
            aVar.mo71655d(jSONObject, "cluster_present_type", this.f147183h, false);
            aVar.mo71655d(jSONObject, "cluster_present_version", Integer.valueOf(this.f147184i), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
