package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import java.util.HashSet;
import ob0.C117747y;
import p158gt.C76051j;

/* renamed from: com.tencent.mm.ui.chatting.component.t0 */
public class C73599t0 implements C76051j.C76052a {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f216114d;

    /* renamed from: e */
    public final /* synthetic */ HashSet f216115e;

    /* renamed from: f */
    public final /* synthetic */ C73588r0 f216116f;

    public C73599t0(C73588r0 r0Var, C72963f4 f4Var, HashSet hashSet) {
        this.f216116f = r0Var;
        this.f216114d = f4Var;
        this.f216115e = hashSet;
    }

    /* renamed from: T2 */
    public void mo102581T2(long j, long j2, int i, int i2, Object obj, int i3, int i4, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadImgAndFav taskEnd image succed: %s, msgID:%d, errType: %s, errCode:%s", Boolean.valueOf(i3 == 0 && i4 == 0), Long.valueOf(this.f216114d.getMsgId()), Integer.valueOf(i3), Integer.valueOf(i4));
        this.f216115e.remove(Long.valueOf(this.f216114d.getMsgId()));
        this.f216116f.mo102574a(this.f216115e);
    }

    /* renamed from: f0 */
    public void mo102582f0(long j, long j2, int i, int i2, Object obj, int i3, int i4, C117747y yVar) {
    }

    /* renamed from: x4 */
    public void mo102583x4(long j, long j2, int i, int i2, Object obj) {
        Log.m105925i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadImgAndFav download image taskcancel: msgID:%d", Long.valueOf(this.f216114d.getMsgId()));
        this.f216115e.remove(Long.valueOf(this.f216114d.getMsgId()));
        this.f216116f.mo102574a(this.f216115e);
    }
}
