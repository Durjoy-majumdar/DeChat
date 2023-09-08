package com.tencent.p014mm.plugin.appbrand.media.record;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.g */
public class C29595g implements Runnable {
    public void run() {
        boolean z;
        Log.m105924i("MicroMsg.Record.AudioRecordCacheClean", "clean audio record file");
        C86009m1 m1Var = new C86009m1(C112760b.m154195C(), "AudioRecord");
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            Log.m105924i("MicroMsg.Record.AudioRecordCacheClean", "AudioRecord is not exist or not Directory");
            return;
        }
        String[] s = m1Var.mo119981s();
        if (s == null || s.length == 0) {
            Log.m105924i("MicroMsg.Record.AudioRecordCacheClean", "none files exist");
            return;
        }
        for (String str : s) {
            Iterator it = ((ArrayList) C29596h.f80526d).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str.contains((String) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                Log.m105924i("MicroMsg.Record.AudioRecordCacheClean", "file is the block file, don't delete");
            } else {
                C86009m1 m1Var2 = new C86009m1(m1Var + "/" + str);
                if (!m1Var2.mo119967g()) {
                    Log.m105924i("MicroMsg.Record.AudioRecordCacheClean", "file not exist");
                } else if (m1Var2.mo119977o()) {
                    Log.m105924i("MicroMsg.Record.AudioRecordCacheClean", "file is directory, don't delete");
                } else if (System.currentTimeMillis() - m1Var2.mo119979q() > C29596h.f80523a.longValue()) {
                    Log.m105921e("MicroMsg.Record.AudioRecordCacheClean", "Clean 3 days file in record file name=%s, path:%s", m1Var2.getName(), m1Var2.mo119971i());
                    m1Var2.mo119966f();
                } else {
                    Log.m105924i("MicroMsg.Record.AudioRecordCacheClean", "not delete the file, file is in valid time for 3 day");
                }
            }
        }
    }
}
