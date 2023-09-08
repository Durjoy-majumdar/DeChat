package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class qd4 extends C47465a {

    /* renamed from: d */
    public LinkedList<pd4> f140251d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f140252e;

    /* renamed from: f */
    public String f140253f;

    /* renamed from: g */
    public C50883pw f140254g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof qd4)) {
            return false;
        }
        qd4 qd4 = (qd4) aVar;
        return C46238a.m51546a(this.f140251d, qd4.f140251d) && C46238a.m51546a(this.f140252e, qd4.f140252e) && C46238a.m51546a(this.f140253f, qd4.f140253f) && C46238a.m51546a(this.f140254g, qd4.f140254g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f140251d);
            C89349b bVar = this.f140252e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            String str = this.f140253f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C50883pw pwVar = this.f140254g;
            if (pwVar != null) {
                aVar.mo74322i(4, pwVar.computeSize());
                this.f140254g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f140251d) + 0;
            C89349b bVar2 = this.f140252e;
            if (bVar2 != null) {
                g += C52418a.m58675b(2, bVar2);
            }
            String str2 = this.f140253f;
            if (str2 != null) {
                g += C52418a.m58683j(3, str2);
            }
            C50883pw pwVar2 = this.f140254g;
            return pwVar2 != null ? g + C52418a.m58682i(4, pwVar2.computeSize()) : g;
        } else if (i == 2) {
            this.f140251d.clear();
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
            qd4 qd4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    pd4 pd4 = new pd4();
                    if (bArr != null && bArr.length > 0) {
                        pd4.parseFrom(bArr);
                    }
                    qd4.f140251d.add(pd4);
                }
                return 0;
            } else if (intValue == 2) {
                qd4.f140252e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                qd4.f140253f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C50883pw pwVar3 = new C50883pw();
                    if (bArr2 != null && bArr2.length > 0) {
                        pwVar3.parseFrom(bArr2);
                    }
                    qd4.f140254g = pwVar3;
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            LinkedList<pd4> linkedList = this.f140251d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Items", linkedList, false);
            aVar.mo71655d(jSONObject, "DebugInfo", this.f140252e, false);
            aVar.mo71655d(jSONObject, "ExtInfo", this.f140253f, false);
            aVar.mo71655d(jSONObject, "ClientCtrlInfo", this.f140254g, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
