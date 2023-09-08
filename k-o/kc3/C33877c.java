package kc3;

import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import lc3.C117474c;
import pc0.C118002e0;

/* renamed from: kc3.c */
public class C33877c extends C114661d0.C28676a {
    public void onAppBackground(String str) {
    }

    public void onAppForeground(String str) {
        C118002e0 yn02 = ((C117474c) C86312j.m106911c(C117474c.class)).yn0();
        yn02.getClass();
        Log.m105925i("MicroMsg.SyncService", "SyncService onAppForeground %s", str);
        if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                yn02.mo182766j(3);
            }
        }
    }
}
