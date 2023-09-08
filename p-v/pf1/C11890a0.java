package pf1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import fe1.C58961d;

/* renamed from: pf1.a0 */
public final class C11890a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f34751d;

    /* renamed from: e */
    public final /* synthetic */ BaseFinderFeed f34752e;

    public C11890a0(String str, BaseFinderFeed baseFinderFeed) {
        this.f34751d = str;
        this.f34752e = baseFinderFeed;
    }

    public final void run() {
        FinderContact finderContact;
        C58961d.C58963b bVar = C58961d.f168673a;
        if (bVar.mo84155b(this.f34751d) == null && (finderContact = this.f34752e.mo3513o().getFeedObject().contact) != null) {
            C58961d.C58963b.m68837m(bVar, finderContact, false, 2, (Object) null);
        }
    }
}
