package de2;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import java.util.concurrent.Callable;

/* renamed from: de2.f */
public class C7302f implements Callable<Boolean> {
    public Object call() {
        return Boolean.valueOf(NetStatusUtil.isWifi(MMApplicationContext.getContext()));
    }
}
