package com.tencent.p014mm.storage;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.storage.r0 */
public class C44664r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19625p0 f121093d;

    public C44664r0(C19625p0 p0Var) {
        this.f121093d = p0Var;
    }

    public void run() {
        String[] strArr = C19625p0.f55548p;
        if (strArr != null && strArr.length > 0) {
            Log.m105918d("MicroMsg.BizTimeLineInfoStorage", "createIndexIfNeed start");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                String[] strArr2 = C19625p0.f55548p;
                if (i < strArr2.length) {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f121093d.f55550d.execSQL("BizTimeLineInfo", strArr2[i]);
                    int currentTimeMillis2 = (int) ((System.currentTimeMillis() - currentTimeMillis) / 1000);
                    IDKey iDKey = new IDKey();
                    iDKey.SetID(1049);
                    this.f121093d.getClass();
                    iDKey.SetKey(currentTimeMillis2 <= 5 ? 0 : currentTimeMillis2 <= 10 ? 1 : currentTimeMillis2 <= 20 ? 2 : currentTimeMillis2 <= 40 ? 3 : 4);
                    iDKey.SetValue(1);
                    arrayList.add(iDKey);
                    i++;
                } else {
                    C115669n.INSTANCE.mo160124a(arrayList, false);
                    Log.m105918d("MicroMsg.BizTimeLineInfoStorage", "createIndexIfNeed end");
                    return;
                }
            }
        }
    }
}
