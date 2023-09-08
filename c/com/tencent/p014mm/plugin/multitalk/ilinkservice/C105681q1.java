package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.q1 */
public class C105681q1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f314232d;

    /* renamed from: e */
    public final /* synthetic */ String f314233e;

    /* renamed from: f */
    public final /* synthetic */ C105724z f314234f;

    public C105681q1(C105724z zVar, String str, String str2) {
        this.f314234f = zVar;
        this.f314232d = str;
        this.f314233e = str2;
    }

    public void run() {
        C105724z zVar = this.f314234f;
        String str = this.f314232d;
        zVar.f314366S0 = str;
        String str2 = this.f314233e;
        zVar.getClass();
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "enter joinSync. %s,%s, %d, %b", str2, str, Integer.valueOf(zVar.f314401n), Boolean.valueOf(zVar.f314371V));
        synchronized (zVar.f314415t1) {
            if (zVar.f314401n != 1) {
                if (!zVar.f314371V) {
                    zVar.f314371V = true;
                    ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(zVar.f314394i.mo66668b((int) zVar.f314364R0, str, str2), new C105721y1(zVar, str2, str));
                    return;
                }
            }
            Log.m105920e("MicroMsg.Multitalk.ILinkService", "hy: already in room!");
        }
    }
}
