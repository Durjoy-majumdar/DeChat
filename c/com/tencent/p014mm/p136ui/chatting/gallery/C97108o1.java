package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import java.util.HashSet;
import ob0.C117747y;
import p158gt.C76051j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.o1 */
public class C97108o1 implements C76051j.C76052a {

    /* renamed from: f */
    public static C97108o1 f284913f;

    /* renamed from: d */
    public HashSet<Long> f284914d = new HashSet<>();

    /* renamed from: e */
    public C76051j.C76052a f284915e;

    /* renamed from: a */
    public static C97108o1 m125035a() {
        if (f284913f == null) {
            f284913f = new C97108o1();
        }
        return f284913f;
    }

    /* renamed from: T2 */
    public void mo102581T2(long j, long j2, int i, int i2, Object obj, int i3, int i4, String str, C117747y yVar) {
        C76051j.C76052a aVar = this.f284915e;
        if (aVar != null) {
            aVar.mo102581T2(j, j2, i, i2, obj, i3, i4, str, yVar);
            long j3 = j2;
        } else {
            C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j2);
            Log.m105925i("MicroMsg.ImageHDDownloadAndSaveMgr", "[oreh download_and_save] hdImg end at background, msgLocalId:%d", Long.valueOf(b002.getMsgId()));
            C97056h.m124957k(MMApplicationContext.getContext(), b002, false);
        }
        this.f284914d.remove(Long.valueOf(j2));
    }

    /* renamed from: f0 */
    public void mo102582f0(long j, long j2, int i, int i2, Object obj, int i3, int i4, C117747y yVar) {
        C76051j.C76052a aVar = this.f284915e;
        if (aVar != null) {
            aVar.mo102582f0(j, j2, i, i2, obj, i3, i4, yVar);
        }
    }

    /* renamed from: x4 */
    public void mo102583x4(long j, long j2, int i, int i2, Object obj) {
        C76051j.C76052a aVar = this.f284915e;
        if (aVar != null) {
            aVar.mo102583x4(j, j2, i, i2, obj);
        }
        this.f284914d.remove(Long.valueOf(j2));
    }
}
