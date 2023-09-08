package ve1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import fe1.C58961d;

/* renamed from: ve1.k1 */
public final class C14555k1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f40332d;

    /* renamed from: e */
    public final /* synthetic */ BaseFinderFeed f40333e;

    public C14555k1(String str, BaseFinderFeed baseFinderFeed) {
        this.f40332d = str;
        this.f40333e = baseFinderFeed;
    }

    public final void run() {
        FinderContact finderContact;
        C58961d.C58963b bVar = C58961d.f168673a;
        if (bVar.mo84155b(this.f40332d) == null && (finderContact = this.f40333e.mo3513o().getFeedObject().contact) != null) {
            C58961d.C58963b.m68837m(bVar, finderContact, false, 2, (Object) null);
        }
    }
}
