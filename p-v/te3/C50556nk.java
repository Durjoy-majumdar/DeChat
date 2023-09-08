package te3;

import org.json.JSONObject;
import pe3.C47465a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nk */
public class C50556nk extends C47465a {
    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50556nk)) {
            return false;
        }
        C50556nk nkVar = (C50556nk) aVar;
        return true;
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            return 0;
        } else if (i == 1) {
            return 0;
        } else {
            if (i == 2) {
                C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                    if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                        aVar2.mo141624b();
                    }
                }
                return 0;
            }
            if (i == 3) {
                C102122a aVar3 = objArr[0];
                C50556nk nkVar = objArr[1];
                objArr[2].intValue();
            }
            return -1;
        }
    }

    public Object toJSON() {
        return new JSONObject();
    }
}
