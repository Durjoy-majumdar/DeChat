package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.modelimage.C68129u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import p158gt.C98205r;

/* renamed from: com.tencent.mm.ui.chatting.x0 */
public class C74338x0 implements C98205r.C98206a {

    /* renamed from: a */
    public final /* synthetic */ long f218364a;

    /* renamed from: b */
    public final /* synthetic */ long f218365b;

    public C74338x0(long j, long j2) {
        this.f218364a = j;
        this.f218365b = j2;
    }

    /* renamed from: a */
    public void mo103302a(long j, int i, int i2, int i3, String str) {
        Class cls = C75700k0.class;
        Log.m105925i("MicroMsg.ChattingEditModeLogic", "cdntra  NetSceneUploadMsgImgForCdn ret:[%d,%d]", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(this.f218365b);
            b002.mo100991d(2);
            b002.mo108745Y2(j);
            b002.mo101012p4(str);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(this.f218365b, b002);
            C68129u.m80533e((int) this.f218364a);
            return;
        }
        C68129u.m80534f((int) this.f218364a);
        C68129u.m80533e((int) this.f218364a);
    }
}
