package com.tencent.p014mm.plugin.finder.service;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ht1.C60187m5;
import ht1.C60208v1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import sx3.C36907w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"", "Lht1/m5;", "kotlin.jvm.PlatformType", "", "result", "Lrx3/b0;", "onDone", "(Ljava/util/List;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$getFinderContactImpl$wrapCallback$1 */
public final class FinderContactService$getFinderContactImpl$wrapCallback$1 implements C60208v1.C60210b {
    public final /* synthetic */ C60208v1.C60210b $callback;
    public final /* synthetic */ List<String> $usernameList;

    public FinderContactService$getFinderContactImpl$wrapCallback$1(List<String> list, C60208v1.C60210b bVar) {
        this.$usernameList = list;
        this.$callback = bVar;
    }

    public final void onDone(List<C60187m5> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[getContact] completed! usernameList=");
        sb.append(this.$usernameList);
        sb.append(" result=");
        C87412m.m108593f(list, "result");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C60187m5 m5Var : list) {
            arrayList.add(m5Var.getUsername() + '=' + m5Var.getNickname());
        }
        sb.append(arrayList);
        Log.m105924i("Finder.ContactService", sb.toString());
        this.$callback.onDone(list);
    }
}
