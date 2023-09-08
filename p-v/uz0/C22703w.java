package uz0;

import androidx.lifecycle.C54219z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Iterator;
import jp3.C9487b;
import kz0.C10442c;
import mz0.C47144b;
import mz0.C47147e;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C22502jn;
import te3.C49463fr3;
import te3.C64539ly1;
import te3.C64597o00;
import z04.C119027c;

/* renamed from: uz0.w */
public final class C22703w extends C22680h {

    /* renamed from: i */
    public final int f65269i = 10;

    /* renamed from: j */
    public final int f65270j = 5;

    /* renamed from: n */
    public int f65271n;

    /* renamed from: o */
    public C64539ly1 f65272o;

    /* renamed from: p */
    public final ArrayList<C22668a> f65273p = new ArrayList<>();

    /* renamed from: uz0.w$a */
    public static final class C22704a extends C87413o implements C32226l<C89132b.C89134c<C64539ly1>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C22703w f65274d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22704a(C22703w wVar) {
            super(1);
            this.f65274d = wVar;
        }

        public Object invoke(Object obj) {
            String str;
            C64539ly1 ly12;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar != null) {
                C22703w wVar = this.f65274d;
                Log.m105924i("MicroMsg.HistoryCardListViewModel", "Force refresh card, errType: " + cVar.f256793a + ", errCode: " + cVar.f256794b + ", errMsg: " + cVar.f256795c);
                if (cVar.f256793a == 0 && cVar.f256794b == 0 && (ly12 = (C64539ly1) cVar.f256796d) != null) {
                    Log.m105924i("MicroMsg.HistoryCardListViewModel", "Force refresh card, retcode: " + ly12.f184174d + ", retmsg: " + ly12.f184175e);
                    if (ly12.f184174d == 0) {
                        wVar.f65271n = 0;
                        if (ly12.f184176f) {
                            wVar.f65228g.postValue(C22707x.UP_TO_DATE);
                        } else {
                            wVar.f65228g.postValue(C22707x.INCOMPLETE);
                        }
                        wVar.f65272o = ly12;
                        wVar.f65225d.postValue(ly12.f184179i);
                        C54219z<ArrayList<C22668a>> zVar = wVar.f65227f;
                        C64597o00 o002 = ly12.f184180j;
                        C87412m.m108593f(o002, "resp.items_list");
                        zVar.postValue(wVar.mo35799i3(o002, true));
                    } else {
                        str = ly12.f184175e;
                        C87412m.m108593f(str, "resp.ret_msg");
                    }
                } else {
                    str = "";
                }
                C22707x xVar = C22707x.FAILED;
                xVar.f65286d = str;
                wVar.f65228g.postValue(xVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: uz0.w$b */
    public static final class C22705b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C22703w f65275a;

        /* renamed from: b */
        public final /* synthetic */ C22707x f65276b;

        /* renamed from: c */
        public final /* synthetic */ C22668a f65277c;

        public C22705b(C22703w wVar, C22707x xVar, C22668a aVar) {
            this.f65275a = wVar;
            this.f65276b = xVar;
            this.f65277c = aVar;
        }

        public Object call(Object obj) {
            String str;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.HistoryCardListViewModel", "do delete card, errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            this.f65275a.f65229h.postValue(Boolean.FALSE);
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                T t = cVar.f256796d;
                C22703w wVar = this.f65275a;
                C22707x xVar = this.f65276b;
                C22668a aVar = this.f65277c;
                C49463fr3 fr32 = (C49463fr3) t;
                Log.m105925i("MicroMsg.HistoryCardListViewModel", "do delete card, retCode: %s", Integer.valueOf(fr32.f133645d));
                if (fr32.f133645d == 0) {
                    wVar.f65228g.postValue(xVar);
                    C54219z<ArrayList<C22668a>> zVar = wVar.f65227f;
                    ArrayList<C22668a> arrayList = wVar.f65273p;
                    String str2 = null;
                    Boolean valueOf = arrayList != null ? Boolean.valueOf(arrayList.remove(aVar)) : null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("remove card, is removed: ");
                    sb.append(valueOf);
                    sb.append(", data type: ");
                    sb.append(aVar.f65199a);
                    sb.append(", errMsg: ");
                    C22502jn jnVar = aVar.f65201c;
                    if (jnVar != null) {
                        str2 = jnVar.f64049d;
                    }
                    sb.append(str2);
                    Log.m105924i("MicroMsg.HistoryCardListViewModel", sb.toString());
                    zVar.postValue(arrayList);
                    return C13598b0.f38549a;
                }
                str = ((C49463fr3) cVar.f256796d).f133646e;
                C87412m.m108593f(str, "it.resp.ret_msg");
            } else {
                str = "";
            }
            C22707x xVar2 = C22707x.FAILED;
            xVar2.f65286d = str;
            this.f65275a.f65228g.postValue(xVar2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: uz0.w$c */
    public static final class C22706c extends C87413o implements C32226l<C89132b.C89134c<C64539ly1>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C22703w f65278d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22706c(C22703w wVar) {
            super(1);
            this.f65278d = wVar;
        }

        public Object invoke(Object obj) {
            String str;
            C64539ly1 ly12;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar != null) {
                C22703w wVar = this.f65278d;
                Log.m105924i("MicroMsg.HistoryCardListViewModel", "refresh history card, errType: " + cVar.f256793a + ", errCode: " + cVar.f256794b + ", errMsg: " + cVar.f256795c);
                if (cVar.f256793a == 0 && cVar.f256794b == 0 && (ly12 = (C64539ly1) cVar.f256796d) != null) {
                    Log.m105924i("MicroMsg.HistoryCardListViewModel", "retcode: " + ly12.f184174d + ", retmsg: " + ly12.f184175e);
                    if (ly12.f184174d == 0) {
                        wVar.f65271n = 0;
                        if (ly12.f184176f) {
                            wVar.f65228g.postValue(C22707x.UP_TO_DATE);
                        } else {
                            wVar.f65228g.postValue(C22707x.INCOMPLETE);
                        }
                        wVar.f65272o = ly12;
                        wVar.f65225d.postValue(ly12.f184179i);
                        C54219z<ArrayList<C22668a>> zVar = wVar.f65227f;
                        C64597o00 o002 = ly12.f184180j;
                        C87412m.m108593f(o002, "resp.items_list");
                        zVar.postValue(wVar.mo35799i3(o002, true));
                    } else {
                        str = ly12.f184175e;
                        C87412m.m108593f(str, "resp.ret_msg");
                    }
                } else {
                    str = "";
                }
                C22707x xVar = C22707x.FAILED;
                xVar.f65286d = str;
                wVar.f65228g.postValue(xVar);
            }
            return C13598b0.f38549a;
        }
    }

    public C22703w() {
        this.f65228g.postValue(C22707x.IDLE);
    }

    /* renamed from: c3 */
    public void mo35790c3(C9487b<?> bVar) {
        C87412m.m108594g(bVar, "keeper");
        C22707x value = this.f65228g.getValue();
        C22707x xVar = C22707x.LOADING;
        if (value != xVar && value != C22707x.DELETING) {
            this.f65228g.postValue(xVar);
            int i = 0;
            int i2 = this.f65271n;
            if (i2 > 0) {
                i = i2;
            } else if (this.f65273p.size() > 0) {
                i = 0 + this.f65273p.size();
            }
            int i3 = this.f65269i;
            if (i < i3) {
                i = i3;
            }
            int i4 = i + this.f65270j;
            this.f65273p.clear();
            C47144b bVar2 = new C47144b(0, (long) i4, 1);
            bVar2.f256791h = true;
            C89059e i5 = bVar2.mo9225i();
            C87412m.m108593f(i5, "CgiGetCouponAndGiftHisto…ntCancelAfterDead().run()");
            C61926c.m72665J(i5, new C22704a(this)).mo11397F(bVar);
        }
    }

    /* renamed from: d3 */
    public void mo35791d3() {
        Log.m105918d("MicroMsg.CardSnapshotMgr", "load coupon History card list snapshot");
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_COUPON_HISTORY_LIST_STRING_SYNC, "");
        int i = 0;
        C64539ly1 ly12 = null;
        if (!(str == null || str.length() == 0)) {
            C64539ly1 ly13 = new C64539ly1();
            byte[] bytes = str.getBytes(C119027c.f356489b);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            try {
                ly13.parseFrom(bytes);
                ly12 = ly13;
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
        }
        if (ly12 != null) {
            this.f65225d.postValue(ly12.f184179i);
            C64597o00 o002 = ly12.f184180j;
            C87412m.m108593f(o002, "items_list");
            ArrayList<C22668a> i3 = mo35799i3(o002, false);
            if (i3 != null) {
                i = i3.size();
            }
            this.f65271n = i;
            this.f65227f.postValue(i3);
        }
    }

    /* renamed from: e3 */
    public void mo35792e3(C22668a aVar) {
        C22707x xVar;
        C87412m.m108594g(aVar, "cardDataModel");
        C22502jn jnVar = aVar.f65201c;
        if (jnVar != null) {
            Log.m105925i("MicroMsg.HistoryCardListViewModel", "do delete card: %s", jnVar.f64049d);
            C22707x value = this.f65228g.getValue();
            if (value != C22707x.LOADING && value != (xVar = C22707x.DELETING)) {
                this.f65229h.postValue(Boolean.TRUE);
                this.f65228g.postValue(xVar);
                String str = jnVar.f64049d;
                C87412m.m108593f(str, "user_card_id");
                new C47147e(str).mo9225i().mo123062e(new C22705b(this, value, aVar));
            }
        }
    }

    /* renamed from: f3 */
    public void mo35793f3(C9487b<?> bVar) {
        int i;
        C87412m.m108594g(bVar, "keeper");
        C22707x value = this.f65228g.getValue();
        C22707x xVar = C22707x.LOADING;
        if (value != xVar && value != C22707x.DELETING && value != C22707x.UP_TO_DATE) {
            this.f65228g.postValue(xVar);
            int i2 = this.f65271n;
            long j = 0;
            if (i2 > 0) {
                int i3 = this.f65269i;
                if (i2 >= i3) {
                    i3 = i2;
                }
                i = i3 + i2;
            } else {
                C64539ly1 ly12 = this.f65272o;
                if (ly12 != null) {
                    j = ly12.f184177g;
                }
                i = this.f65269i;
            }
            C47144b bVar2 = new C47144b(j, (long) i, 1);
            bVar2.f256791h = true;
            C89059e i4 = bVar2.mo9225i();
            C87412m.m108593f(i4, "CgiGetCouponAndGiftHisto…ntCancelAfterDead().run()");
            C61926c.m72665J(i4, new C22706c(this)).mo11397F(bVar);
        }
    }

    /* renamed from: g3 */
    public void mo35794g3() {
        C64539ly1 ly12 = this.f65272o;
        if (ly12 != null) {
            C64597o00 o002 = new C64597o00();
            if (!this.f65273p.isEmpty()) {
                Iterator<C22668a> it = this.f65273p.iterator();
                while (it.hasNext()) {
                    C22502jn jnVar = it.next().f65201c;
                    if (jnVar != null) {
                        o002.f184600e.add(jnVar);
                    }
                }
            }
            ly12.f184180j = o002;
            Log.m105918d("MicroMsg.CardSnapshotMgr", "save coupon History card list snapshot");
            C61926c.m72656A((String) null, new C10442c(ly12));
        }
    }

    /* renamed from: i3 */
    public final ArrayList<C22668a> mo35799i3(C64597o00 o002, boolean z) {
        ArrayList<C22668a> arrayList = !z ? new ArrayList<>() : this.f65273p;
        Iterator<C22502jn> it = o002.f184600e.iterator();
        while (it.hasNext()) {
            C22502jn next = it.next();
            C22668a aVar = new C22668a();
            aVar.f65201c = next;
            if (next.f64056n == 1) {
                aVar.f65199a = 5;
            } else {
                aVar.f65199a = 3;
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
