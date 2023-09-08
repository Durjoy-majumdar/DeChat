package com.tencent.p014mm.plugin.messenger.foundation;

import a11.C39479c;
import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.booter.CoreService;
import com.tencent.p014mm.plugin.zero.C72670r;
import com.tencent.p014mm.plugin.zero.C85597u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import eb0.C86497v5;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75694f1;
import f62.C75707s0;
import jc3.C76400h;
import kj2.C117407d;
import nr3.C35015b;
import xh3.C38726b;
import yh3.C66649b;
import z01.C53731a;

@C86522b(dependencies = {C85597u.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation */
public class PluginMessengerFoundation extends C86301e implements C75707s0 {

    /* renamed from: d */
    public C38726b f201494d;

    /* renamed from: e */
    public C66649b f201495e;

    /* renamed from: f */
    public C53731a f201496f = new C53731a();

    /* renamed from: g */
    public int f201497g = 0;

    public C86497v5 H60() {
        return C86497v5.C31522d.f84272a;
    }

    /* renamed from: P7 */
    public C66649b mo96076P7() {
        C86709a0.m107523b().mo121108c();
        if (this.f201495e == null) {
            this.f201495e = new C66649b();
        }
        return this.f201495e;
    }

    /* renamed from: Vq */
    public void mo96077Vq(int i) {
        Log.m105925i("MicroMsg.TAG", "setEnSendMsgActionFlag %s", Integer.valueOf(i));
        this.f201497g = i;
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        C72670r.f211432d = new C35015b<C76400h>() {
            public C76400h get() {
                return new C69836a0();
            }
        };
        C42569c cVar = new C42569c();
        C75694f1.C75695a.m90941a(2, cVar);
        C75694f1.C75695a.m90941a(17, cVar);
        C75694f1.C75695a.m90941a(4, cVar);
        C75694f1.C75695a.m90941a(7, new C42570f());
        C69841o oVar = new C69841o();
        C75694f1.C75695a.m90941a(5, oVar);
        C75694f1.C75695a.m90941a(8, oVar);
        C75694f1.C75695a.m90941a(9, oVar);
        C75694f1.C75695a.m90941a(1, new C69840b0());
        if (MMApplicationContext.isMainProcess()) {
            C86709a0.m107532n(C39479c.class, this.f201496f);
            CoreService.C80801f fVar = CoreService.f343882t;
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("msg_receive_number");
            long j = mmkv.getLong("recv_num", 0);
            long j2 = mmkv.getLong("send_num", 0);
            long j3 = j - j2;
            if (j3 > 0) {
                mmkv.edit().putLong("send_num", 1 + j);
                C117407d.INSTANCE.mo160131h(19779, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
                Log.m105925i("MicroMsg.CoreService", "checkSyncNum() why?????? diffValue:%s recvNum:%s sendNum:%s", Long.valueOf(j3), Long.valueOf(j), Long.valueOf(j2));
                return;
            }
            Log.m105924i("MicroMsg.CoreService", "checkSyncNum() no problem");
        }
    }

    /* renamed from: pq */
    public boolean mo96078pq(String str) {
        boolean z = this.f201497g != 0 && (!C72996z1.m85818T5(str) ? !(!C72996z1.m85820U5(str) || !Util.isEqual(this.f201497g & 2, 2)) : Util.isEqual(this.f201497g & 1, 1));
        Log.m105925i("MicroMsg.TAG", "ifAddTicketByActionFlag %s %s", str, Boolean.valueOf(z));
        return z;
    }

    public C38726b vx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f201494d == null) {
            C86709a0.m107528h();
            this.f201494d = new C38726b(C86709a0.m107535s().f251811i);
        }
        return this.f201494d;
    }
}
