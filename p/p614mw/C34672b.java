package p614mw;

import ad3.C67027a;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import ig2.C76351b;
import p627nw.C35034b;

@C86522b
/* renamed from: mw.b */
public class C34672b extends C86301e implements C35034b {
    /* renamed from: r */
    public C67027a mo59680r(Context context, String str) {
        Log.m105925i("MicroMsg.ReaderAppContactWidget", "create contact widget type[%s]", str);
        if ("widget_type_news".equals(str)) {
            return new C76351b(context);
        }
        return null;
    }
}
