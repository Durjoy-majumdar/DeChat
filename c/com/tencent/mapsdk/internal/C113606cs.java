package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.core.components.protocol.jce.sso.Header;
import com.tencent.mapsdk.core.components.protocol.jce.sso.Package;

/* renamed from: com.tencent.mapsdk.internal.cs */
public final class C113606cs {
    /* renamed from: a */
    private static Package m156532a(byte[] bArr) {
        Package packageR = new Package();
        C113953m mVar = new C113953m(bArr);
        mVar.mo172380a("utf-8");
        packageR.readFrom(mVar);
        C113953m mVar2 = new C113953m(packageR.head);
        Header header = new Header();
        header.readFrom(mVar2);
        if (header.stResult.iErrCode == 0) {
            return packageR;
        }
        throw new Exception(header.stResult.strErrDesc);
    }

    /* renamed from: a */
    private static Package m156531a(C114029p pVar, int i, String str) {
        pVar.display(new StringBuilder(), 0);
        Package packageR = new Package();
        packageR.shVer = 0;
        packageR.eCmd = i;
        packageR.strSubCmd = str;
        packageR.iSeqNo = 0;
        packageR.cEncodeType = 0;
        packageR.sAppId = "0";
        packageR.uin = "0";
        Header header = new Header();
        header.lCurrTime = System.currentTimeMillis();
        packageR.head = header.toByteArray();
        packageR.busiBuff = pVar.toByteArray("UTF-8");
        return packageR;
    }
}
