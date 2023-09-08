package ym1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import os3.C62180a;
import rx3.C13598b0;

/* renamed from: ym1.b */
public final class C66668b extends C87413o implements C32226l<C62180a.C62181a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderItem f191690d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66668b(FinderItem finderItem) {
        super(1);
        this.f191690d = finderItem;
    }

    public Object invoke(Object obj) {
        C62180a.C62181a aVar = (C62180a.C62181a) obj;
        C87412m.m108594g(aVar, "$this$saveCurrentTestRedDotData");
        aVar.f176788a = this.f191690d.getId();
        FinderContact finderContact = this.f191690d.getFeedObject().contact;
        String str = null;
        aVar.f176789b = finderContact != null ? finderContact.headUrl : null;
        FinderItem finderItem = this.f191690d;
        aVar.f176792e = finderItem.field_username;
        aVar.f176793f = finderItem.getFeedObject().nickname;
        aVar.f176791d = this.f191690d.getFeedObject().objectNonceId;
        FinderContact finderContact2 = this.f191690d.getFeedObject().contact;
        if (finderContact2 != null) {
            str = finderContact2.liveCoverImgUrl;
        }
        aVar.f176794g = str;
        return C13598b0.f38549a;
    }
}
