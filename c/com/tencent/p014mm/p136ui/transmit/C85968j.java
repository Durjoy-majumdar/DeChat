package com.tencent.p014mm.p136ui.transmit;

import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ld2.C46848g;
import p763ym.C79138l;
import rn3.i0$$a;

/* renamed from: com.tencent.mm.ui.transmit.j */
public class C85968j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f250396d;

    /* renamed from: e */
    public final /* synthetic */ SendAppMessageWrapperUI.C85966h f250397e;

    /* renamed from: f */
    public final /* synthetic */ SendAppMessageWrapperUI f250398f;

    /* renamed from: com.tencent.mm.ui.transmit.j$a */
    public class C85969a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map f250399d;

        public C85969a(Map map) {
            this.f250399d = map;
        }

        public void run() {
            SendAppMessageWrapperUI.C85966h hVar = C85968j.this.f250397e;
            if (hVar != null) {
                ((i0$$a) hVar).mo124353a(this.f250399d);
            }
        }
    }

    public C85968j(SendAppMessageWrapperUI sendAppMessageWrapperUI, List list, SendAppMessageWrapperUI.C85966h hVar) {
        this.f250398f = sendAppMessageWrapperUI;
        this.f250396d = list;
        this.f250397e = hVar;
    }

    public void run() {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < this.f250396d.size(); i++) {
            SendAppMessageWrapperUI.C85964f fVar = (SendAppMessageWrapperUI.C85964f) this.f250396d.get(i);
            if (fVar != null) {
                String str = fVar.f250390a;
                String str2 = fVar.f250391b;
                if (((C79138l) C86312j.m106911c(C79138l.class)).mo73985Ae(str2) && str2.startsWith("content")) {
                    C46848g.vx0();
                    String str3 = C46848g.xx0() + "content_" + Util.nowMilliSecond();
                    long d = C86013q1.m106443d(str2, str3, false);
                    if (d <= 0) {
                        Log.m105920e("MicroMsg.SendAppMessageWrapperUI", "run: doCheckAndCopyFile copy file fail");
                    } else {
                        Log.m105925i("MicroMsg.SendAppMessageWrapperUI", "doCheckAndCopyFile:ret:%s localFilePath:%s filePath:%s ", Long.valueOf(d), str3, str2);
                        hashMap.put(str, new SendAppMessageWrapperUI.C85965g(this.f250398f, str3, str2));
                    }
                }
            }
        }
        this.f250398f.runOnUiThread(new C85969a(hashMap));
    }
}
