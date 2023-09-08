package cj1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import dj1.C58291w0;
import er1.C58730g5;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12360e8;
import rx3.C13598b0;
import s43.C13620a;
import s43.C13622c;

/* renamed from: cj1.b0 */
public final class C54737b0 extends C87413o implements C32226l<C13620a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54820t f153403d;

    /* renamed from: e */
    public final /* synthetic */ C12360e8.C12371d f153404e;

    /* renamed from: f */
    public final /* synthetic */ String f153405f;

    /* renamed from: g */
    public final /* synthetic */ int f153406g;

    /* renamed from: h */
    public final /* synthetic */ String f153407h;

    /* renamed from: i */
    public final /* synthetic */ C58291w0 f153408i;

    /* renamed from: cj1.b0$a */
    public /* synthetic */ class C0517a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1255a;

        static {
            int[] iArr = new int[C13622c.values().length];
            iArr[1] = 1;
            f1255a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54737b0(C54820t tVar, C12360e8.C12371d dVar, String str, int i, String str2, C58291w0 w0Var) {
        super(1);
        this.f153403d = tVar;
        this.f153404e = dVar;
        this.f153405f = str;
        this.f153406g = i;
        this.f153407h = str2;
        this.f153408i = w0Var;
    }

    public Object invoke(Object obj) {
        C13620a aVar = (C13620a) obj;
        C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
        String str = this.f153403d.f153694d;
        Log.m105924i(str, "[WeCoin] doPostGift consumeGift onFailed errorType:" + aVar.f38588a);
        int i = C0517a.f1255a[aVar.f38588a.ordinal()] == 1 ? 10003 : 10008;
        C12360e8.C12371d dVar = this.f153404e;
        if (dVar != null) {
            C12360e8.C12371d.C12372a.m11940a(dVar, false, i, C12360e8.C12371d.C12373b.WECOIN, this.f153405f, (Long) null, this.f153406g, this.f153407h, (String) null, this.f153408i, 144, (Object) null);
        }
        C58730g5 g5Var = C58730g5.f168158a;
        C115669n.INSTANCE.mo175912v(C58730g5.f168165h, 81);
        return C13598b0.f38549a;
    }
}
