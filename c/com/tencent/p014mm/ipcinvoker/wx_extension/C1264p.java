package com.tencent.p014mm.ipcinvoker.wx_extension;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.p */
public class C1264p implements Runnable {
    public C1264p(C1266r rVar) {
    }

    public void run() {
        String[] strArr = {"MicroMsg.XIPC.MMProtoBufTransfer"};
        for (int i = 0; i < 1; i++) {
            String str = strArr[i];
            try {
                C86009m1 m1Var = new C86009m1(MMApplicationContext.getContext().getFilesDir().getAbsolutePath() + "/mmkv/" + str);
                if (m1Var.mo119967g()) {
                    m1Var.mo119966f();
                    C86013q1.m106447h(m1Var.mo119971i() + ".crc");
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.PluginIPC", "delete MMProtoBufTransfer dirty file[%s] e = %s", str, e);
            }
        }
    }
}
