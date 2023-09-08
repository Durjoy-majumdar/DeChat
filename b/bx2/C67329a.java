package bx2;

import com.tencent.p014mm.plugin.subapp.p109ui.voicereminder.RemindDialog;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import qo3.C77398g;

/* renamed from: bx2.a */
public class C67329a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RemindDialog f193169d;

    public C67329a(RemindDialog remindDialog) {
        this.f193169d = remindDialog;
    }

    public void run() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = ((ArrayList) this.f193169d.f206374e).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (Util.isNullOrNil(str)) {
                stringBuffer.append("\n\n");
            } else {
                stringBuffer.append(str + "\n\n");
            }
        }
        C77398g gVar = this.f193169d.f206376g;
        if (gVar != null) {
            gVar.mo107533r(stringBuffer);
        }
    }
}
