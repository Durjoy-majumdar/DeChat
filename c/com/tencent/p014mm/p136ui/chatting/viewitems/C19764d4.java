package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ex0.C45696d;
import f40.C86709a0;
import p565ir.C60606n;
import s90.C63724h;
import sj3.C63941p;
import te3.C51713vn0;
import te3.C64273c21;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.d4 */
public class C19764d4 implements C60606n.C60609c {

    /* renamed from: a */
    public final /* synthetic */ C63724h f56217a;

    /* renamed from: b */
    public final /* synthetic */ C19783t3 f56218b;

    public C19764d4(C19762b4 b4Var, C63724h hVar, C19783t3 t3Var) {
        this.f56217a = hVar;
        this.f56218b = t3Var;
    }

    public void onLiveStatusCallback(long j, int i, Object obj) {
        C64273c21 c212;
        if (j == 0) {
            Log.m105924i("MicroMsg.ChattingItemBizFrom", "query fail, liveId = 0");
        }
        if (!this.f56217a.f180629g.equals(this.f56218b.f56269k.f56257a.getTag(C0966R.C0970id.mxm))) {
            Log.m105924i("MicroMsg.ChattingItemBizFrom", "recycled");
            return;
        }
        boolean z = obj instanceof C51713vn0;
        if (z && (c212 = ((C51713vn0) obj).f143572d) != null) {
            ((C45696d) C86709a0.m107533q(C45696d.class)).Ks0(this.f56217a.f180629g, c212);
            C63941p pVar = C63941p.f181254a;
            C19784u3 u3Var = this.f56218b.f56269k;
            pVar.mo88711i(c212, u3Var.f56276j, u3Var.f56277k);
        }
        String str = "";
        if (z) {
            C51713vn0 vn02 = (C51713vn0) obj;
            if (!Util.isNullOrNil(vn02.f143575g)) {
                str = vn02.f143575g;
            }
        }
        this.f56218b.f56269k.f56275i.setText(str);
    }
}
