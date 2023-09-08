package com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription;

import android.text.TextUtils;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.List;
import zd0.C23466p;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.c */
public final class C17915c extends C87413o implements C32226l<SubscribeMsgTmpItem, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ List<C23466p.C23474i> f49418d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17915c(List<C23466p.C23474i> list) {
        super(1);
        this.f49418d = list;
    }

    public Object invoke(Object obj) {
        T t;
        SubscribeMsgTmpItem subscribeMsgTmpItem = (SubscribeMsgTmpItem) obj;
        C87412m.m108594g(subscribeMsgTmpItem, "item");
        Iterator<T> it = this.f49418d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (TextUtils.equals(subscribeMsgTmpItem.f49021f, ((C23466p.C23474i) t).f67356d)) {
                break;
            }
        }
        C23466p.C23474i iVar = (C23466p.C23474i) t;
        return Boolean.valueOf(iVar != null ? iVar.f67353a : false);
    }
}
