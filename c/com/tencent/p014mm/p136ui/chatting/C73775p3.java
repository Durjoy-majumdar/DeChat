package com.tencent.p014mm.p136ui.chatting;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import ob0.C117747y;
import p158gt.C76051j;
import ub1.C78142a;

/* renamed from: com.tencent.mm.ui.chatting.p3 */
public class C73775p3 implements C76051j.C76052a {

    /* renamed from: d */
    public final /* synthetic */ C78142a f216542d;

    /* renamed from: e */
    public final /* synthetic */ Object f216543e;

    /* renamed from: f */
    public final /* synthetic */ C73764n3 f216544f;

    /* renamed from: com.tencent.mm.ui.chatting.p3$a */
    public class C73776a implements Runnable {
        public C73776a() {
        }

        public void run() {
            C73775p3 p3Var = C73775p3.this;
            p3Var.f216544f.mo102816d(p3Var.f216543e, p3Var.f216542d);
        }
    }

    public C73775p3(C73764n3 n3Var, C78142a aVar, Object obj) {
        this.f216544f = n3Var;
        this.f216542d = aVar;
        this.f216543e = obj;
    }

    /* renamed from: T2 */
    public void mo102581T2(long j, long j2, int i, int i2, Object obj, int i3, int i4, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.FavMsgHandle", "oreh downloadImreportHandler.removeMessagesreportHandler.removeMessagesgAndFav taskEnd image succed: %s, msgID:%d, errType: %s, errCode:%s", Boolean.valueOf(i3 == 0 && i4 == 0), Long.valueOf(this.f216542d.f228992d.getMsgId()), Integer.valueOf(i3), Integer.valueOf(i4));
        new MMHandler(Looper.getMainLooper()).post(new C73776a());
    }

    /* renamed from: f0 */
    public void mo102582f0(long j, long j2, int i, int i2, Object obj, int i3, int i4, C117747y yVar) {
    }

    /* renamed from: x4 */
    public void mo102583x4(long j, long j2, int i, int i2, Object obj) {
        Log.m105925i("MicroMsg.FavMsgHandle", "oreh downloadImgAndFav download image taskcancel: msgID:%d", Long.valueOf(this.f216542d.f228992d.getMsgId()));
    }
}
