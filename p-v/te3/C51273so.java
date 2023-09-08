package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.so */
public class C51273so extends C47465a {

    /* renamed from: d */
    public LinkedList<do4> f141641d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f141642e;

    /* renamed from: f */
    public C89349b f141643f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51273so)) {
            return false;
        }
        C51273so soVar = (C51273so) aVar;
        return C46238a.m51546a(this.f141641d, soVar.f141641d) && C46238a.m51546a(this.f141642e, soVar.f141642e) && C46238a.m51546a(this.f141643f, soVar.f141643f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f141641d);
            C89349b bVar = this.f141642e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            C89349b bVar2 = this.f141643f;
            if (bVar2 != null) {
                aVar.mo74315b(3, bVar2);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f141641d) + 0;
            C89349b bVar3 = this.f141642e;
            if (bVar3 != null) {
                g += C52418a.m58675b(2, bVar3);
            }
            C89349b bVar4 = this.f141643f;
            return bVar4 != null ? g + C52418a.m58675b(3, bVar4) : g;
        } else if (i == 2) {
            this.f141641d.clear();
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
            C51273so soVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    do4 do4 = new do4();
                    if (bArr != null && bArr.length > 0) {
                        do4.parseFrom(bArr);
                    }
                    soVar.f141641d.add(do4);
                }
                return 0;
            } else if (intValue == 2) {
                soVar.f141642e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                soVar.f141643f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            LinkedList<do4> linkedList = this.f141641d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "CdnUrlInfo", linkedList, false);
            aVar.mo71655d(jSONObject, "CoverUrl", this.f141642e, false);
            aVar.mo71655d(jSONObject, "ArticleUrl", this.f141643f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
