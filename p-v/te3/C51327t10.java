package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.pinus.ChildProcessServiceWrapper;
import if0.C46238a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t10 */
public class C51327t10 extends C47465a {

    /* renamed from: d */
    public C49308en1 f141896d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C51327t10) && C46238a.m51546a(this.f141896d, ((C51327t10) aVar).f141896d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49308en1 en12 = this.f141896d;
            if (en12 != null) {
                aVar.mo74322i(1, en12.computeSize());
                this.f141896d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49308en1 en13 = this.f141896d;
            if (en13 != null) {
                return 0 + C52418a.m58682i(1, en13.computeSize());
            }
            return 0;
        } else if (i == 2) {
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
            C51327t10 t102 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C49308en1 en14 = new C49308en1();
                if (bArr != null && bArr.length > 0) {
                    en14.parseFrom(bArr);
                }
                t102.f141896d = en14;
            }
            return 0;
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.f124644a.mo71655d(jSONObject, ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, this.f141896d, true);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public C47465a toPb(String str) {
        if (!(str == null || "" == str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    char c = 65535;
                    if (next.hashCode() == -934592106) {
                        if (next.equals(ChildProcessServiceWrapper.PROCESS_TYPE_RENDER)) {
                            c = 0;
                        }
                    }
                    if (c == 0) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            C49308en1 en12 = new C49308en1();
                            en12.toPb(((JSONObject) opt).toString());
                            this.f141896d = en12;
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("DSLRender", e, "", new Object[0]);
            }
        }
        return this;
    }
}
