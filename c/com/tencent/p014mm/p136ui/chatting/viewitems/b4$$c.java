package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45696d;
import f40.C86709a0;
import p565ir.C60606n;
import s90.C63724h;
import sj3.C63941p;
import te3.C51713vn0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.b4$$c */
public class b4$$c implements C60606n.C60609c {

    /* renamed from: a */
    public final /* synthetic */ C63724h f56198a;

    /* renamed from: b */
    public final /* synthetic */ C19781r3 f56199b;

    /* renamed from: c */
    public final /* synthetic */ String f56200c;

    public b4$$c(C19762b4 b4Var, C63724h hVar, C19781r3 r3Var, String str) {
        this.f56198a = hVar;
        this.f56199b = r3Var;
        this.f56200c = str;
    }

    public void onLiveStatusCallback(long j, int i, Object obj) {
        if (j == 0) {
            Log.m105924i("MicroMsg.ChattingItemBizFrom", "query fail, liveId = 0");
        }
        if (!this.f56198a.f180629g.equals(this.f56199b.f56248d.getTag(C0966R.C0970id.mxm))) {
            Log.m105924i("MicroMsg.ChattingItemBizFrom", "recycled");
        } else if (obj instanceof C51713vn0) {
            C51713vn0 vn02 = (C51713vn0) obj;
            if (vn02.f143572d != null) {
                ((C45696d) C86709a0.m107533q(C45696d.class)).Ks0(this.f56198a.f180629g, vn02.f143572d);
                C63941p.f181254a.mo88712j(vn02.f143572d, this.f56199b.f56248d, this.f56200c);
            }
        }
    }
}
