package com.tencent.p014mm.modelsimple;

import android.net.NetworkInfo;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.systemservicecache.NetworkCache;
import eb0.C97625j3;
import f40.C86709a0;
import lc3.C10485b;
import ob0.C11385n;
import ob0.C117746w;
import ob0.C117747y;
import qe3.C47822y;
import qe3.C62607x;
import qe3.C89631w;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.modelsimple.m */
public class C81013m extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f237944d;

    /* renamed from: e */
    public C114799u f237945e;

    /* renamed from: com.tencent.mm.modelsimple.m$a */
    public static class C55389a extends C117746w {

        /* renamed from: a */
        public final C62607x f157755a = new C62607x();

        /* renamed from: b */
        public final C47822y f157756b = new C47822y();

        public C89631w.C89634d getReqObjImp() {
            return this.f157755a;
        }

        public C89631w.C89636e getRespObj() {
            return this.f157756b;
        }

        public int getType() {
            return 0;
        }

        public String getUri() {
            return null;
        }
    }

    public C81013m(boolean z) {
        C55389a aVar = new C55389a();
        this.f237945e = aVar;
        C62607x xVar = (C62607x) aVar.getReqObj();
        NetworkInfo activeNetworkInfoFromCache = NetworkCache.INSTANCE.getActiveNetworkInfoFromCache(MMApplicationContext.getContext());
        int i = 0;
        int i2 = 2;
        if (activeNetworkInfoFromCache != null) {
            try {
                int subtype = activeNetworkInfoFromCache.getSubtype();
                if (activeNetworkInfoFromCache.getType() != 1) {
                    if (subtype == 13 || subtype == 15 || subtype == 14) {
                        i = 4;
                    } else if (subtype == 3 || subtype == 4 || subtype == 5 || subtype == 6 || subtype == 12) {
                        i = 3;
                    } else if (subtype == 1 || subtype == 2) {
                        i = 2;
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.BgFgBase", "getNetType: %s", Util.stackTraceToString(e));
            }
            i = 1;
        }
        xVar.f177802a = i;
        xVar.f177803b = z ? 1 : i2;
    }

    /* renamed from: j1 */
    public static void m98919j1(boolean z) {
        boolean z2 = true;
        Log.m105925i("MicroMsg.NetSceneBgFg", "summerbgfg setBgFgForMuteRoom isFg[%s], accHasReady[%s] stack[%s]", Boolean.valueOf(z), Boolean.valueOf(C97625j3.m125811a()), Util.getStack());
        if (C97625j3.m125811a()) {
            if (C97625j3.m125815e() == null || C97625j3.m125815e().f256809d == null || C97625j3.m125815e().f256809d.mo55443A3() == null) {
                Log.m105924i("MicroMsg.NetSceneBgFg", "summerbgfg setBgFgForMuteRoom push not rready");
                return;
            }
            C97625j3.m125815e().f256809d.mo55443A3().mo55424Y4(z);
            if (z) {
                C97625j3.m125815e().mo123460f(new C81013m(true));
                return;
            }
            int i = C90188n0.f258916J;
            if (i == -1) {
                try {
                    i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("MuteRoomDisable"), 0);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.NetSceneBgFg", e, "", new Object[0]);
                    i = 0;
                }
            }
            boolean z3 = CrashReportFactory.foreground;
            Log.m105925i("MicroMsg.NetSceneBgFg", "somr DynamicConfig checkBit:%d TestMuteRoomEnable:%d muteRoomDisable:%d fg:%b", 1, Integer.valueOf(C90188n0.f258916J), Integer.valueOf(i), Boolean.valueOf(z3));
            if ((1 & i) == 0) {
                z2 = z3;
            }
            C97625j3.m125815e().mo123460f(new C81013m(z2));
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f237944d = nVar;
        return dispatch(gVar, this.f237945e, this);
    }

    public int getType() {
        return 0;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneBgFg", " ret[%d]", Integer.valueOf(((C47822y) uVar.getRespObj()).f128386a.f139083d));
        this.f237944d.onSceneEnd(i2, i3, str, this);
    }
}
