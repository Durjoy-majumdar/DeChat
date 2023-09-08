package com.tencent.p014mm.wallet_core.p137ui;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import eb0.C75576f4;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.wallet_core.ui.w */
public class C45129w implements C75576f4.C75578b {

    /* renamed from: a */
    public final /* synthetic */ String[] f122400a;

    /* renamed from: b */
    public final /* synthetic */ C75228t.C45126l f122401b;

    public C45129w(String[] strArr, C75228t.C45126l lVar) {
        this.f122400a = strArr;
        this.f122401b = lVar;
    }

    /* renamed from: a */
    public void mo57753a(C114770g gVar) {
        if (gVar != null && gVar.mo55443A3() != null) {
            String[] strArr = this.f122400a;
            if (strArr == null || strArr.length == 0) {
                Log.m105928w("MicroMsg.WalletBaseUtil ", "hy: keys is null");
                return;
            }
            HashMap hashMap = new HashMap();
            int i = 0;
            while (true) {
                try {
                    String[] strArr2 = this.f122400a;
                    if (i >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i];
                    if (!Util.isNullOrNil(str)) {
                        byte[] m3 = gVar.mo55443A3().mo55434m3(str);
                        if (m3 != null) {
                            hashMap.put(str, new ObjectInputStream(new ByteArrayInputStream(m3)).readObject());
                        }
                    } else {
                        Log.m105920e("MicroMsg.WalletBaseUtil ", "hy: key is null");
                    }
                    i++;
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.WalletBaseUtil ", "hy: deserialize failed: %s", e.toString());
                    C75228t.C45126l lVar = this.f122401b;
                    if (lVar != null) {
                        lVar.mo70511a((Map<String, Object>) null);
                        return;
                    }
                    return;
                }
            }
            C75228t.C45126l lVar2 = this.f122401b;
            if (lVar2 != null) {
                lVar2.mo70511a(hashMap);
            }
        }
    }
}
