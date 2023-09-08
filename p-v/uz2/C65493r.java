package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.r */
public class C65493r extends C47465a {

    /* renamed from: d */
    public String f188461d;

    /* renamed from: e */
    public String f188462e;

    /* renamed from: f */
    public String f188463f;

    /* renamed from: g */
    public LinkedList<String> f188464g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C65493r)) {
            return false;
        }
        C65493r rVar = (C65493r) aVar;
        return C46238a.m51546a(this.f188461d, rVar.f188461d) && C46238a.m51546a(this.f188462e, rVar.f188462e) && C46238a.m51546a(this.f188463f, rVar.f188463f) && C46238a.m51546a(this.f188464g, rVar.f188464g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f188461d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f188462e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f188463f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74320g(4, 1, this.f188464g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f188461d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f188462e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f188463f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58680g(4, 1, this.f188464g);
        } else if (i == 2) {
            this.f188464g.clear();
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
            C65493r rVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                rVar.f188461d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                rVar.f188462e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                rVar.f188463f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                rVar.f188464g.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f188461d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "status_id", str, false);
            aVar.mo71655d(jSONObject, "status_word", this.f188462e, false);
            aVar.mo71655d(jSONObject, "status_description", this.f188463f, false);
            aVar.mo71655d(jSONObject, "status_tags", this.f188464g, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
