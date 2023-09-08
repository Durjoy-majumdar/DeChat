package com.tencent.p014mm.plugin.appbrand.debugger;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import hr0.C87584b;
import p224ra.C89909e;
import te3.lw4;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.d0 */
public class C81730d0 {

    /* renamed from: a */
    public static int f239851a = -1;

    /* renamed from: a */
    public static int m100271a() {
        Context context = MMApplicationContext.getContext();
        if (!NetStatusUtil.isConnected(context)) {
            return 0;
        }
        if (NetStatusUtil.is2G(context)) {
            return 1;
        }
        if (NetStatusUtil.is3G(context)) {
            return 2;
        }
        if (NetStatusUtil.is4G(context)) {
            return 3;
        }
        return NetStatusUtil.isWifi(context) ? 4 : 5;
    }

    /* renamed from: b */
    public static void m100272b(lw4 lw4, C81742s sVar) {
        if (sVar != null) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - sVar.f239878b);
            C87584b bVar = (C87584b) C89909e.m112439d(C87584b.class, true);
            Object[] objArr = new Object[8];
            objArr[0] = Integer.valueOf(currentTimeMillis);
            objArr[1] = Integer.valueOf(sVar.f239877a);
            objArr[2] = Integer.valueOf(lw4.computeSize());
            objArr[3] = 0;
            objArr[4] = "";
            objArr[5] = "";
            int i = f239851a;
            if (i < 0) {
                i = NetStatusUtil.getISPCode(MMApplicationContext.getContext());
                f239851a = i;
            }
            objArr[6] = Integer.valueOf(i);
            objArr[7] = Integer.valueOf(m100271a());
            bVar.mo121691h(15190, objArr);
        }
    }
}
