package p833zk;

import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: zk.d */
public final class C53795d extends C87413o implements C32227p<Boolean, C103044f, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f150965d;

    /* renamed from: e */
    public final /* synthetic */ C103041c f150966e;

    /* renamed from: f */
    public final /* synthetic */ EmojiInfo f150967f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53795d(C32226l<? super Boolean, C13598b0> lVar, C103041c cVar, EmojiInfo emojiInfo) {
        super(2);
        this.f150965d = lVar;
        this.f150966e = cVar;
        this.f150967f = emojiInfo;
    }

    public Object invoke(Object obj, Object obj2) {
        C103044f fVar = (C103044f) obj2;
        if (!((Boolean) obj).booleanValue() || fVar == null) {
            C32226l<Boolean, C13598b0> lVar = this.f150965d;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
        } else {
            this.f150966e.mo142749a(this.f150967f, this.f150965d);
        }
        return C13598b0.f38549a;
    }
}
