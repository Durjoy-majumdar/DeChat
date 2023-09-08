package com.tencent.p014mm.plugin.scanner;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.scanner.C42902i;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import lp3.C46888b;
import ob0.C47350c;
import te3.C50237lb;
import te3.C51216sa2;

/* renamed from: com.tencent.mm.plugin.scanner.h */
public class C42901h implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C46888b f116170a;

    public C42901h(C42902i.C42903a aVar, C46888b bVar) {
        this.f116170a = bVar;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        LinkedList<C51216sa2> linkedList;
        if (i == 0 && i2 == 0) {
            C50237lb lbVar = (C50237lb) cVar.f127056b.f127083a;
            if (lbVar == null || (linkedList = lbVar.f137280e) == null || linkedList.size() == 0) {
                Log.m105924i("MicroMsg.FetchQRCodeInfoService", "resp error");
                this.f116170a.mo72093c(null);
                return;
            }
            this.f116170a.mo72093c(lbVar.f137280e.getFirst());
            return;
        }
        Log.m105925i("MicroMsg.FetchQRCodeInfoService", "fetchQRCodeInfo errType:%d errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f116170a.mo72093c(null);
    }
}
