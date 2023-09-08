package ca0;

import com.tencent.maas.model.MJMusicInfo;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: ca0.d0 */
public final class C54681d0 extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MJMusicInfo f153245d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f153246e;

    /* renamed from: f */
    public final /* synthetic */ int f153247f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54681d0(MJMusicInfo mJMusicInfo, C32224a<C13598b0> aVar, int i) {
        super(2);
        this.f153245d = mJMusicInfo;
        this.f153246e = aVar;
        this.f153247f = i;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C104353p.m139331j(this.f153245d, this.f153246e, (C108504h) obj, this.f153247f | 1);
        return C13598b0.f38549a;
    }
}
