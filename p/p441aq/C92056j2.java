package p441aq;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import qz1.C101326c;
import ul3.C102053b;
import ul3.C102054c;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: aq.j2 */
public class C92056j2 extends C86301e implements C102054c {
    /* renamed from: w */
    public C102053b mo126040w(String str, String str2) {
        try {
            return C101326c.m132949d().mo140814b(str, str2);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MMAnimateService", th, "", new Object[0]);
            return null;
        }
    }
}
