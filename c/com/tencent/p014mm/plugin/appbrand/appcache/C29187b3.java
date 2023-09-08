package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import java.util.Set;
import sx3.C22415w0;

@C86522b(dependencies = {C81161g2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.b3 */
public final class C29187b3 extends C86301e implements C81295n0 {
    /* renamed from: An */
    public int mo56501An(String str) {
        C87412m.m108594g(str, DownloadInfo.FILENAME);
        Set<String> decodeStringSet = MultiProcessMMKV.getSingleMMKV("WxaPkgPublicStorageRefCountService").decodeStringSet(str);
        if (decodeStringSet == null) {
            Log.m105918d("MicroMsg.WxaPkgPublicStorageRefCountService", "get ref count, fileName: " + str + ", count: " + 0);
            return 0;
        }
        int size = decodeStringSet.size();
        Log.m105918d("MicroMsg.WxaPkgPublicStorageRefCountService", "get ref count, fileName: " + str + ", count: " + size);
        return size;
    }

    public String[] Ow0() {
        return MultiProcessMMKV.getSingleMMKV("WxaPkgPublicStorageRefCountService").allKeys();
    }

    /* renamed from: tJ */
    public boolean mo56503tJ(String str) {
        C87412m.m108594g(str, DownloadInfo.FILENAME);
        String i = C86709a0.m107523b().mo121111i();
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("WxaPkgPublicStorageRefCountService");
        Set<String> decodeStringSet = singleMMKV.decodeStringSet(str);
        if (decodeStringSet == null) {
            return false;
        }
        if (decodeStringSet.isEmpty()) {
            singleMMKV.remove(str);
            return true;
        } else if (!decodeStringSet.remove(i)) {
            return false;
        } else {
            if (!decodeStringSet.isEmpty()) {
                return singleMMKV.encode(str, decodeStringSet);
            }
            singleMMKV.remove(str);
            return true;
        }
    }

    /* renamed from: vC */
    public void mo56504vC(String str) {
        C87412m.m108594g(str, DownloadInfo.FILENAME);
        MultiProcessMMKV.getSingleMMKV("WxaPkgPublicStorageRefCountService").remove(str);
    }

    /* renamed from: yy */
    public boolean mo56505yy(String str) {
        C87412m.m108594g(str, DownloadInfo.FILENAME);
        String i = C86709a0.m107523b().mo121111i();
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("WxaPkgPublicStorageRefCountService");
        Set<String> decodeStringSet = singleMMKV.decodeStringSet(str);
        if (decodeStringSet == null) {
            return singleMMKV.encode(str, (Set<String>) C22415w0.m26092a(i));
        }
        if (decodeStringSet.isEmpty()) {
            Log.m105928w("MicroMsg.WxaPkgPublicStorageRefCountService", "ref count = 0!, file name: " + str);
        }
        C87412m.m108593f(i, "uin");
        if (!decodeStringSet.add(i)) {
            return false;
        }
        return singleMMKV.encode(str, decodeStringSet);
    }
}
