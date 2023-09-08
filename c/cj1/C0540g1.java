package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: cj1.g1 */
public final class C0540g1 {

    /* renamed from: a */
    public final C13601g f1310a = C36568h.m40985a(C0541a.f1319d);

    /* renamed from: b */
    public long f1311b = MAlarmHandler.NEXT_FIRE_INTERVAL;

    /* renamed from: c */
    public int f1312c = -1;

    /* renamed from: d */
    public long f1313d = Long.MIN_VALUE;

    /* renamed from: e */
    public boolean f1314e;

    /* renamed from: f */
    public boolean f1315f = true;

    /* renamed from: g */
    public boolean f1316g;

    /* renamed from: h */
    public C32227p<? super Integer, ? super Boolean, C13598b0> f1317h;

    /* renamed from: i */
    public C32227p<? super String, ? super Integer, C13598b0> f1318i;

    /* renamed from: cj1.g1$a */
    public static final class C0541a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C0541a f1319d = new C0541a();

        public C0541a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C32444a.f86192r2.mo60266n().intValue() * 1000);
        }
    }

    /* renamed from: a */
    public final int mo590a() {
        return ((Number) ((C36570n) this.f1310a).getValue()).intValue();
    }

    /* renamed from: b */
    public final void mo591b(C0581o5 o5Var, int i) {
        C87412m.m108594g(o5Var, "msg");
        if (o5Var.getSeq() >= this.f1313d) {
            if (o5Var.getSeq() == this.f1313d) {
                Log.m105924i("Finder.FinderLiveCommentStickyHelper", "onDescShow only update pos new:" + i + " old:" + this.f1312c);
                this.f1312c = i;
                return;
            }
            if (this.f1314e) {
                Log.m105924i("Finder.FinderLiveCommentStickyHelper", "cancel current sticky desc when new comes");
                this.f1314e = false;
                C32227p<? super Integer, ? super Boolean, C13598b0> pVar = this.f1317h;
                if (pVar != null) {
                    pVar.invoke(Integer.valueOf(this.f1312c), Boolean.FALSE);
                }
            }
            this.f1312c = i;
            this.f1311b = Util.nowMilliSecond();
            this.f1313d = o5Var.getSeq();
            this.f1315f = true;
            this.f1316g = false;
            Log.m105924i("Finder.FinderLiveCommentStickyHelper", "onDescShow may sticky desc: targetStickyCommentMsgIndex:" + this.f1312c + " targetStickyCommentMsgStartShowTime:" + this.f1311b + " targetStickyCommentMsgSeq:" + this.f1313d);
        }
    }
}
