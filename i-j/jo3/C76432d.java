package jo3;

import com.tencent.p014mm.p136ui.widget.cedit.api.MMCustomEditText;
import java.util.HashMap;
import kj2.C117407d;

/* renamed from: jo3.d */
public class C76432d implements C76429a {
    public C76432d(MMCustomEditText mMCustomEditText) {
    }

    /* renamed from: a */
    public void mo106649a(Throwable th, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("Content", str);
        hashMap.put("Exception", th.toString());
        hashMap.put("Stack", th.getStackTrace());
        C117407d.INSTANCE.mo160135k("CustomEditView", str2, hashMap);
    }
}
