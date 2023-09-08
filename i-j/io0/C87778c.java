package io0;

import com.tencent.p014mm.sdk.platformtools.Log;
import io0.C87779d;
import java.util.HashMap;
import java.util.List;

/* renamed from: io0.c */
public class C87778c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f254138d;

    /* renamed from: e */
    public final /* synthetic */ String f254139e;

    public C87778c(String str, String str2) {
        this.f254138d = str;
        this.f254139e = str2;
    }

    public void run() {
        String str = this.f254138d;
        String str2 = this.f254139e;
        Log.m105925i("MicroMsg.AppBrandLiveFileLoadHelper", "doCallback url:%s, localPath:%s", str, str2);
        List list = (List) ((HashMap) C87779d.f254141b).get(str);
        if (list == null || list.size() == 0) {
            Log.m105924i("MicroMsg.AppBrandLiveFileLoadHelper", "doCallback callbacks nil");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            ((C87779d.C87780a) list.get(i)).mo122230a(str2);
        }
        ((HashMap) C87779d.f254141b).remove(str);
    }
}
