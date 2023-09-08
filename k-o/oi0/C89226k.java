package oi0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import f40.C86709a0;
import java.util.LinkedList;
import ob0.C117747y;
import te3.C49335eu3;
import te3.C51441ts3;
import te3.C64716sw;

/* renamed from: oi0.k */
public class C89226k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257095d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList f257096e;

    /* renamed from: f */
    public final /* synthetic */ LinkedList f257097f;

    /* renamed from: g */
    public final /* synthetic */ int f257098g;

    /* renamed from: h */
    public final /* synthetic */ int f257099h;

    /* renamed from: i */
    public final /* synthetic */ int f257100i;

    /* renamed from: oi0.k$a */
    public class C89227a extends C89228p {
        public C89227a(C89226k kVar, long j, LinkedList linkedList, LinkedList linkedList2, int i, int i2, int i3, C64716sw swVar) {
            super(j, linkedList, linkedList2, i, i2, i3, swVar);
        }

        /* renamed from: h */
        public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
            C51441ts3 ts32 = (C51441ts3) eu32;
            if (!C86709a0.m107522a()) {
                Log.m105920e("MicroMsg.Recommend.AppBrandReportRecommendLogic", "account nor ready");
                return;
            }
            Log.m105925i("MicroMsg.Recommend.AppBrandReportRecommendLogic", "CgiReportRecommendWxa errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i != 0 || i2 != 0) {
                Log.m105920e("MicroMsg.Recommend.AppBrandReportRecommendLogic", "report fail");
            }
        }
    }

    public C89226k(long j, LinkedList linkedList, LinkedList linkedList2, int i, int i2, int i3) {
        this.f257095d = j;
        this.f257096e = linkedList;
        this.f257097f = linkedList2;
        this.f257098g = i;
        this.f257099h = i2;
        this.f257100i = i3;
    }

    public void run() {
        C64716sw swVar = new C64716sw();
        swVar.f185450d = NetStatusUtil.getNetTypeString(MMApplicationContext.getContext());
        swVar.f185452f = (double) C89215e.f257067d;
        swVar.f185451e = (double) C89215e.f257066c;
        new C89227a(this, this.f257095d, this.f257096e, this.f257097f, this.f257098g, this.f257099h, this.f257100i, swVar).mo9225i();
    }
}
