package p833zk;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: zk.h */
public final class C103047h extends C87413o implements C32227p<Boolean, C103044f, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EmojiInfo f304036d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f304037e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103047h(EmojiInfo emojiInfo, C32226l<? super Boolean, C13598b0> lVar) {
        super(2);
        this.f304036d = emojiInfo;
        this.f304037e = lVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C103044f fVar = (C103044f) obj2;
        if (!((Boolean) obj).booleanValue() || fVar == null) {
            Log.m105924i("MicroMsg.EmojiLoader.FetcherFactory", "fetch: get config fail " + this.f304036d.getMd5());
            C32226l<Boolean, C13598b0> lVar = this.f304037e;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
        } else {
            Log.m105924i("MicroMsg.EmojiLoader.FetcherFactory", fVar.f304029e + ' ' + fVar.f304025a.getMd5());
            (fVar.f304029e == 3 ? new C103037a() : new C103039b()).mo142747a(fVar, this.f304037e);
        }
        return C13598b0.f38549a;
    }
}
