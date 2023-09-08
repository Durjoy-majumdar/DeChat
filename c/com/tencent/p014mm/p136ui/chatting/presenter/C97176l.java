package com.tencent.p014mm.p136ui.chatting.presenter;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.chatting.C73871v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import dk3.C97483d;
import java.util.List;
import java.util.Set;
import s90.C77632o;

/* renamed from: com.tencent.mm.ui.chatting.presenter.l */
public class C97176l implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Set f285146d;

    /* renamed from: e */
    public final /* synthetic */ List f285147e;

    /* renamed from: f */
    public final /* synthetic */ MediaHistoryGalleryPresenter f285148f;

    /* renamed from: com.tencent.mm.ui.chatting.presenter.l$a */
    public class C97177a implements C77632o {
        public C97177a() {
        }

        /* renamed from: N */
        public boolean mo22497N() {
            return false;
        }

        /* renamed from: e0 */
        public boolean mo22498e0() {
            return false;
        }

        /* renamed from: g0 */
        public void mo22499g0(Bundle bundle) {
        }

        /* renamed from: m6 */
        public void mo22500m6(C77632o.C77633a aVar) {
        }

        /* renamed from: r7 */
        public void mo22502r7(C77632o.C77633a aVar) {
            C97483d dVar;
            Log.m105925i("MicroMsg.MediaHistoryGalleryPresenter", "[requestExitSelectedMode] %s del size:%s job:%s", Thread.currentThread(), Integer.valueOf(C97176l.this.f285147e.size()), aVar);
            if (aVar == C77632o.C77633a.del && (dVar = C97176l.this.f285148f.f285110d) != null) {
                dVar.mo135868i();
            }
        }

        /* renamed from: s0 */
        public boolean mo22503s0() {
            return true;
        }

        /* renamed from: z1 */
        public void mo22504z1(C77632o.C77633a aVar) {
            if (aVar == C77632o.C77633a.del) {
                C97176l lVar = C97176l.this;
                lVar.f285148f.f285111e.removeAll(lVar.f285147e);
            }
        }
    }

    public C97176l(MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter, Set set, List list) {
        this.f285148f = mediaHistoryGalleryPresenter;
        this.f285146d = set;
        this.f285147e = list;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.MediaHistoryGalleryPresenter", "delete message");
        C73871v0.m87560a(this.f285148f.f285112f, this.f285146d, new C97177a());
    }
}
