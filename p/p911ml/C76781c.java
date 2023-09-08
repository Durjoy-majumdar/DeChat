package p911ml;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import java.util.HashSet;
import rx3.C13598b0;

/* renamed from: ml.c */
public final class C76781c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f224589d;

    /* renamed from: e */
    public final /* synthetic */ C76777a f224590e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76781c(long j, C76777a aVar) {
        super(0);
        this.f224589d = j;
        this.f224590e = aVar;
    }

    public Object invoke() {
        HashMap<Long, HashSet<C76777a>> hashMap = C76778b.f224583b;
        HashSet hashSet = hashMap.get(Long.valueOf(this.f224589d));
        if (hashSet == null) {
            hashSet = new HashSet();
            hashMap.put(Long.valueOf(this.f224589d), hashSet);
        }
        hashSet.add(this.f224590e);
        Log.m105924i("MicroMsg.EmojiCaptureCallbackDispatcher", "registerCallback: " + hashSet.size());
        return C13598b0.f38549a;
    }
}
