package com.tencent.p014mm.plugin.appbrand.widget.input;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashSet;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.y$$c */
public class y$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C85004y f247728d;

    public y$$c(C85004y yVar) {
        this.f247728d = yVar;
    }

    public void run() {
        Log.m105925i("MicroMsg.AppBrandUIdRootFrameLayout", "callOnPanelChanged, size %d", Integer.valueOf(((HashSet) this.f247728d.f247726q).size()));
        if (((HashSet) this.f247728d.f247726q).size() > 0) {
            int size = ((HashSet) this.f247728d.f247726q).size();
            y$$d[] y__dArr = new y$$d[size];
            this.f247728d.f247726q.toArray(y__dArr);
            for (int i = 0; i < size; i++) {
                y__dArr[i].mo117942a();
            }
        }
    }
}
