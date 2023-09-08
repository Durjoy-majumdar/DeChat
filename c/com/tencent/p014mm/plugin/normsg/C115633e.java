package com.tencent.p014mm.plugin.normsg;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.normsg.C114829e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import f40.C86709a0;
import java.net.InetAddress;
import yc2.C118978g;

/* renamed from: com.tencent.mm.plugin.normsg.e */
public class C115633e implements Runnable {
    public C115633e(C115634f fVar) {
    }

    public void run() {
        if (C86709a0.m107522a()) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String str = MMApplicationContext.getContext().getApplicationInfo().sourceDir;
                byte[] g = C114829e.C114830a.m161739g(C86709a0.m107523b().mo121110g());
                byte[] h = C114829e.C114830a.m161740h(C86709a0.m107523b().mo121110g());
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String format = String.format("<k25>%s</k25>", new Object[]{C118978g.m167741a(g, 0, g.length)});
                if (h != null) {
                    if (h.length == 8) {
                        byte b = h[0];
                        h[0] = h[3];
                        h[3] = b;
                        byte b2 = h[1];
                        h[1] = h[2];
                        h[2] = b2;
                        byte b3 = h[4];
                        h[4] = h[7];
                        h[7] = b3;
                        byte b4 = h[5];
                        h[5] = h[6];
                        h[6] = b4;
                        format = format + String.format("<k28>%s</k28><k29>%s</k29>", new Object[]{C118978g.m167741a(h, 0, 4), C118978g.m167741a(h, 4, 8)});
                    } else {
                        format = format + String.format("<k27>%s</k27>", new Object[]{C118978g.m167741a(h, 0, h.length)});
                    }
                }
                try {
                    String hostAddress = InetAddress.getByName(WeChatHosts.domainString(C0966R.string.f360885fm3)).getHostAddress();
                    format = format + String.format("<k32>%s</k32>", new Object[]{Util.nullAsNil(hostAddress)});
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.NormsgSourceImpl", "exception:%s", Util.stackTraceToString(e));
                }
                Log.m105924i("MicroMsg.NormsgSourceImpl", "checkSoftType2 [time: " + currentTimeMillis2 + ", value: " + format + "]");
                C86709a0.m107535s().mo121142i().mo119676J(79, format);
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.NormsgSourceImpl", e2, "Failed checkSoftType2.", new Object[0]);
            }
        }
    }

    public String toString() {
        return super.toString() + "|checkSoftTypeExtra";
    }
}
