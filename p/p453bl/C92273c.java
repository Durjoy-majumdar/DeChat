package p453bl;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import p008bq.C92289q0;
import p1072al.C92043g;
import rx3.C13598b0;
import u60.C65220d;
import u60.C65234n;

/* renamed from: bl.c */
public abstract class C92273c extends C65220d implements Runnable {

    /* renamed from: f */
    public final IEmojiInfo f264097f;

    /* renamed from: g */
    public boolean f264098g;

    /* renamed from: h */
    public boolean f264099h;

    /* renamed from: i */
    public boolean f264100i;

    /* renamed from: j */
    public boolean f264101j;

    /* renamed from: n */
    public boolean f264102n;

    /* renamed from: o */
    public final List<C92043g<?>> f264103o = Collections.synchronizedList(new LinkedList());

    /* renamed from: bl.c$a */
    public static final class C92274a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92273c f264104d;

        /* renamed from: e */
        public final /* synthetic */ boolean f264105e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92274a(C92273c cVar, boolean z) {
            super(0);
            this.f264104d = cVar;
            this.f264105e = z;
        }

        public Object invoke() {
            LinkedList<C92043g> linkedList = new LinkedList<>();
            List<C92043g<?>> list = this.f264104d.f264103o;
            C87412m.m108593f(list, "requests");
            C92273c cVar = this.f264104d;
            synchronized (list) {
                linkedList.addAll(cVar.f264103o);
                cVar.f264103o.clear();
                C13598b0 b0Var = C13598b0.f38549a;
            }
            boolean z = this.f264105e;
            for (C92043g c : linkedList) {
                c.mo126009c(z);
            }
            return C13598b0.f38549a;
        }
    }

    public C92273c(IEmojiInfo iEmojiInfo) {
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        this.f264097f = iEmojiInfo;
    }

    /* renamed from: a */
    public void mo11852a() {
        this.f264100i = true;
        run();
    }

    /* renamed from: d */
    public String mo11854d() {
        return mo126262e();
    }

    /* renamed from: e */
    public abstract String mo126262e();

    /* renamed from: f */
    public void mo126263f(boolean z) {
        this.f264101j = z;
        this.f264102n = true;
        if (this.f264100i) {
            mo11853b(C65234n.OK);
        } else {
            ((C92289q0) C86312j.m106911c(C92289q0.class)).mo126045e1(mo126262e());
        }
        C61926c.m72656A((String) null, new C92274a(this, z));
    }

    /* renamed from: g */
    public final void mo126265g(C92043g<?> gVar) {
        C87412m.m108594g(gVar, "request");
        this.f264103o.remove(gVar);
        if (this.f264103o.size() == 0) {
            Log.m105918d("MicroMsg.IEmojiLoadTask", "cancel " + mo126262e() + ", " + this.f264099h);
            if (!this.f264099h) {
                ((C92289q0) C86312j.m106911c(C92289q0.class)).mo126045e1(mo126262e());
                mo126263f(false);
            }
        }
    }

    public void run() {
        this.f264099h = true;
    }
}
