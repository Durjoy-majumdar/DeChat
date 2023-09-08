package com.tencent.p014mm.plugin.finder.feed.model;

import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87413o;
import te3.C49098d51;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.w */
public final class C2818w extends C87413o implements C32226l<C49098d51, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ String f14078d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2818w(String str) {
        super(1);
        this.f14078d = str;
    }

    public Object invoke(Object obj) {
        return Boolean.valueOf(Util.isEqual(((C49098d51) obj).f132122h, this.f14078d));
    }
}
