package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qn3 */
public class C50987qn3 extends C47465a {

    /* renamed from: d */
    public int f140413d;

    /* renamed from: e */
    public int f140414e;

    /* renamed from: f */
    public int f140415f;

    /* renamed from: g */
    public LinkedList<String> f140416g = new LinkedList<>();

    /* renamed from: h */
    public int f140417h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50987qn3)) {
            return false;
        }
        C50987qn3 qn32 = (C50987qn3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140413d), Integer.valueOf(qn32.f140413d)) && C46238a.m51546a(Integer.valueOf(this.f140414e), Integer.valueOf(qn32.f140414e)) && C46238a.m51546a(Integer.valueOf(this.f140415f), Integer.valueOf(qn32.f140415f)) && C46238a.m51546a(this.f140416g, qn32.f140416g) && C46238a.m51546a(Integer.valueOf(this.f140417h), Integer.valueOf(qn32.f140417h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140413d);
            aVar.mo74318e(2, this.f140414e);
            aVar.mo74318e(3, this.f140415f);
            aVar.mo74320g(4, 1, this.f140416g);
            aVar.mo74318e(5, this.f140417h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f140413d) + 0 + C52418a.m58678e(2, this.f140414e) + C52418a.m58678e(3, this.f140415f) + C52418a.m58680g(4, 1, this.f140416g) + C52418a.m58678e(5, this.f140417h);
        } else {
            if (i == 2) {
                this.f140416g.clear();
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
                C50987qn3 qn32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    qn32.f140413d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    qn32.f140414e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    qn32.f140415f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    qn32.f140416g.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    qn32.f140417h = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f140413d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "DirectShowTs", valueOf, false);
            aVar.mo71655d(jSONObject, "ShowAndRefleshTs", Integer.valueOf(this.f140414e), false);
            aVar.mo71655d(jSONObject, "Category", Integer.valueOf(this.f140415f), false);
            aVar.mo71655d(jSONObject, "DocidList", this.f140416g, false);
            aVar.mo71655d(jSONObject, "NeedCache", Integer.valueOf(this.f140417h), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
