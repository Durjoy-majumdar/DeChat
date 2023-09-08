package uf1;

import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ob0.C89132b;
import te3.C49335eu3;
import tf1.C13914m;

/* renamed from: uf1.b */
public final class C65343b extends C87413o implements C32226l<C89132b.C89134c<?>, IResponse<C13914m>> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C89132b.C89134c<C49335eu3>, IResponse<C13914m>> f188097d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65343b(C32226l<? super C89132b.C89134c<C49335eu3>, ? extends IResponse<C13914m>> lVar) {
        super(1);
        this.f188097d = lVar;
    }

    public Object invoke(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
        return this.f188097d.invoke(cVar);
    }
}
