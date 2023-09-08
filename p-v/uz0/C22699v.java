package uz0;

import androidx.lifecycle.C54219z;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import jp3.C9487b;
import kz0.C10440a;
import mz0.C47143a;
import mz0.C47145c;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C22502jn;
import te3.C51638v30;
import te3.C64595ny1;
import te3.C64597o00;
import z04.C119027c;

/* renamed from: uz0.v */
public final class C22699v extends C22680h {

    /* renamed from: i */
    public final int f65258i = 10;

    /* renamed from: j */
    public final int f65259j = 5;

    /* renamed from: n */
    public int f65260n;

    /* renamed from: o */
    public C64595ny1 f65261o;

    /* renamed from: p */
    public final ArrayList<C22668a> f65262p = new ArrayList<>();

    /* renamed from: q */
    public final ArrayList<C22668a> f65263q = new ArrayList<>();

    /* renamed from: uz0.v$a */
    public static final class C22700a extends C87413o implements C32226l<C89132b.C89134c<C64595ny1>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C22699v f65264d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22700a(C22699v vVar) {
            super(1);
            this.f65264d = vVar;
        }

        public Object invoke(Object obj) {
            String str;
            C64595ny1 ny12;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar != null) {
                C22699v vVar = this.f65264d;
                Log.m105924i("MicroMsg.CouponAndGiftCardViewModel", "force get card list errType: " + cVar.f256793a + ", errCode: " + cVar.f256794b + ", errMsg: " + cVar.f256795c);
                if (cVar.f256793a == 0 && cVar.f256794b == 0 && (ny12 = (C64595ny1) cVar.f256796d) != null) {
                    Log.m105924i("MicroMsg.CouponAndGiftCardViewModel", "force get card list retcode: " + ny12.f184580d + ", retmsg: " + ny12.f184581e);
                    if (ny12.f184580d == 0) {
                        vVar.f65260n = 0;
                        if (ny12.f184582f) {
                            vVar.f65228g.postValue(C22707x.UP_TO_DATE);
                        } else {
                            vVar.f65228g.postValue(C22707x.INCOMPLETE);
                        }
                        vVar.f65261o = ny12;
                        vVar.f65225d.postValue(ny12.f184585i);
                        vVar.f65227f.postValue(vVar.mo35798i3(ny12, true));
                    } else {
                        str = ny12.f184581e;
                        C87412m.m108593f(str, "resp.ret_msg");
                    }
                } else {
                    str = "";
                }
                C22707x xVar = C22707x.FAILED;
                xVar.f65286d = str;
                vVar.f65228g.postValue(xVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: uz0.v$b */
    public static final class C22701b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C22699v f65265a;

        /* renamed from: b */
        public final /* synthetic */ C22707x f65266b;

        /* renamed from: c */
        public final /* synthetic */ C22668a f65267c;

        public C22701b(C22699v vVar, C22707x xVar, C22668a aVar) {
            this.f65265a = vVar;
            this.f65266b = xVar;
            this.f65267c = aVar;
        }

        public Object call(Object obj) {
            String str;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.CouponAndGiftCardViewModel", "do delete card errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            this.f65265a.f65229h.postValue(Boolean.FALSE);
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                T t = cVar.f256796d;
                C22699v vVar = this.f65265a;
                C22707x xVar = this.f65266b;
                C22668a aVar = this.f65267c;
                C51638v30 v302 = (C51638v30) t;
                Log.m105925i("MicroMsg.CouponAndGiftCardViewModel", "do delete card retCode: %s", Integer.valueOf(v302.f143278d));
                if (v302.f143278d == 0) {
                    vVar.f65228g.postValue(xVar);
                    C54219z<ArrayList<C22668a>> zVar = vVar.f65227f;
                    ArrayList value = zVar.getValue();
                    boolean remove = value != null ? value.remove(aVar) : false;
                    StringBuilder sb = new StringBuilder();
                    sb.append("remove card, is removed: ");
                    sb.append(remove);
                    sb.append(", data type: ");
                    sb.append(aVar.f65199a);
                    sb.append(", errMsg: ");
                    C22502jn jnVar = aVar.f65201c;
                    sb.append(jnVar != null ? jnVar.f64049d : null);
                    Log.m105924i("MicroMsg.CouponAndGiftCardViewModel", sb.toString());
                    if (remove) {
                        int i = aVar.f65199a;
                        if (i == 1) {
                            vVar.f65263q.remove(aVar);
                            if (vVar.f65263q.size() == 1) {
                                C22668a remove2 = vVar.f65263q.remove(0);
                                C87412m.m108593f(remove2, "mCouponCards.removeAt(0)");
                                C22668a aVar2 = remove2;
                                if (value != null) {
                                    value.remove(aVar2);
                                }
                            }
                        } else if (i == 2) {
                            vVar.f65262p.remove(aVar);
                            if (vVar.f65262p.size() == 1) {
                                C22668a remove3 = vVar.f65262p.remove(0);
                                C87412m.m108593f(remove3, "mGiftCards.removeAt(0)");
                                C22668a aVar3 = remove3;
                                if (value != null) {
                                    value.remove(aVar3);
                                }
                            }
                        }
                    }
                    zVar.postValue(value);
                    return C13598b0.f38549a;
                }
                str = ((C51638v30) cVar.f256796d).f143279e;
                C87412m.m108593f(str, "it.resp.ret_msg");
            } else {
                str = "";
            }
            C22707x xVar2 = C22707x.FAILED;
            xVar2.f65286d = str;
            this.f65265a.f65228g.postValue(xVar2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: uz0.v$c */
    public static final class C22702c extends C87413o implements C32226l<C89132b.C89134c<C64595ny1>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C22699v f65268d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22702c(C22699v vVar) {
            super(1);
            this.f65268d = vVar;
        }

        public Object invoke(Object obj) {
            String str;
            C64595ny1 ny12;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar != null) {
                C22699v vVar = this.f65268d;
                Log.m105924i("MicroMsg.CouponAndGiftCardViewModel", "refresh coupon and gift list errType: " + cVar.f256793a + ", errCode: " + cVar.f256794b + ", errMsg: " + cVar.f256795c);
                if (cVar.f256793a == 0 && cVar.f256794b == 0 && (ny12 = (C64595ny1) cVar.f256796d) != null) {
                    Log.m105924i("MicroMsg.CouponAndGiftCardViewModel", "refresh coupon and gift list retcode: " + ny12.f184580d + ", retmsg: " + ny12.f184581e);
                    if (ny12.f184580d == 0) {
                        vVar.f65260n = 0;
                        if (ny12.f184582f) {
                            vVar.f65228g.postValue(C22707x.UP_TO_DATE);
                        } else {
                            vVar.f65228g.postValue(C22707x.INCOMPLETE);
                        }
                        vVar.f65261o = ny12;
                        vVar.f65225d.postValue(ny12.f184585i);
                        vVar.f65227f.postValue(vVar.mo35798i3(ny12, true));
                    } else {
                        str = ny12.f184581e;
                        C87412m.m108593f(str, "resp.ret_msg");
                    }
                } else {
                    str = "";
                }
                C22707x xVar = C22707x.FAILED;
                xVar.f65286d = str;
                vVar.f65228g.postValue(xVar);
            }
            return C13598b0.f38549a;
        }
    }

    public C22699v() {
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
            int i2 = this.f65260n;
            if (i2 <= 0) {
                if (this.f65262p.size() > 0) {
                    i = 0 + this.f65262p.size();
                }
                i2 = this.f65263q.size() > 0 ? this.f65263q.size() + i : i;
            }
            int i3 = this.f65258i;
            if (i2 < i3) {
                i2 = i3;
            }
            int i4 = i2 + this.f65259j;
            this.f65262p.clear();
            this.f65263q.clear();
            C47145c cVar = new C47145c(0, (long) i4, 1);
            cVar.f256791h = true;
            C89059e i5 = cVar.mo9225i();
            C87412m.m108593f(i5, "CgiGetCouponAndGiftList(…ntCancelAfterDead().run()");
            C61926c.m72665J(i5, new C22700a(this)).mo11397F(bVar);
        }
    }

    /* renamed from: d3 */
    public void mo35791d3() {
        Log.m105918d("MicroMsg.CardSnapshotMgr", "load coupon and gift card list snapshot");
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_COUPON_GIFT_LIST_STRING_SYNC, "");
        C64595ny1 ny12 = null;
        if (!(str == null || str.length() == 0)) {
            C64595ny1 ny13 = new C64595ny1();
            byte[] bytes = str.getBytes(C119027c.f356489b);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            try {
                ny13.parseFrom(bytes);
                ny12 = ny13;
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
        }
        if (ny12 != null) {
            this.f65225d.postValue(ny12.f184585i);
            ArrayList<C22668a> i3 = mo35798i3(ny12, false);
            this.f65260n = i3.size();
            this.f65227f.postValue(i3);
        }
    }

    /* renamed from: e3 */
    public void mo35792e3(C22668a aVar) {
        C22707x xVar;
        C87412m.m108594g(aVar, "cardDataModel");
        C22502jn jnVar = aVar.f65201c;
        if (jnVar != null) {
            Log.m105925i("MicroMsg.CouponAndGiftCardViewModel", "do delete card: %s", jnVar.f64049d);
            C22707x value = this.f65228g.getValue();
            if (value != C22707x.LOADING && value != (xVar = C22707x.DELETING)) {
                this.f65229h.postValue(Boolean.TRUE);
                this.f65228g.postValue(xVar);
                String str = jnVar.f64049d;
                C87412m.m108593f(str, "user_card_id");
                new C47143a(str).mo9225i().mo123062e(new C22701b(this, value, aVar));
            } else {
                return;
            }
        }
        C115669n.INSTANCE.mo160131h(19747, 3, 4);
    }

    /* renamed from: f3 */
    public void mo35793f3(C9487b<?> bVar) {
        int i;
        C87412m.m108594g(bVar, "keeper");
        C22707x value = this.f65228g.getValue();
        C22707x xVar = C22707x.LOADING;
        if (value != xVar && value != C22707x.DELETING && value != C22707x.UP_TO_DATE) {
            this.f65228g.postValue(xVar);
            int i2 = this.f65260n;
            long j = 0;
            if (i2 > 0) {
                int i3 = this.f65258i;
                if (i2 >= i3) {
                    i3 = i2;
                }
                i = i3 + i2;
            } else {
                C64595ny1 ny12 = this.f65261o;
                if (ny12 != null) {
                    j = ny12.f184583g;
                }
                i = this.f65258i;
            }
            C47145c cVar = new C47145c(j, (long) i, 1);
            cVar.f256791h = true;
            C89059e i4 = cVar.mo9225i();
            C87412m.m108593f(i4, "CgiGetCouponAndGiftList(…ntCancelAfterDead().run()");
            C61926c.m72665J(i4, new C22702c(this)).mo11397F(bVar);
        }
    }

    /* renamed from: g3 */
    public void mo35794g3() {
        C64595ny1 ny12 = this.f65261o;
        if (ny12 != null) {
            C64597o00 o002 = new C64597o00();
            String str = "";
            if (!this.f65262p.isEmpty()) {
                C22668a remove = this.f65262p.remove(0);
                C87412m.m108593f(remove, "mGiftCards.removeAt(0)");
                String str2 = remove.f65200b;
                if (str2 == null) {
                    str2 = str;
                }
                o002.f184599d = str2;
                Iterator<C22668a> it = this.f65262p.iterator();
                while (it.hasNext()) {
                    C22502jn jnVar = it.next().f65201c;
                    if (jnVar != null) {
                        o002.f184600e.add(jnVar);
                    }
                }
            }
            ny12.f184586j = o002;
            C64597o00 o003 = new C64597o00();
            if (!this.f65263q.isEmpty()) {
                C22668a remove2 = this.f65263q.remove(0);
                C87412m.m108593f(remove2, "mCouponCards.removeAt(0)");
                String str3 = remove2.f65200b;
                if (str3 != null) {
                    str = str3;
                }
                o003.f184599d = str;
                Iterator<C22668a> it4 = this.f65263q.iterator();
                while (it4.hasNext()) {
                    C22502jn jnVar2 = it4.next().f65201c;
                    if (jnVar2 != null) {
                        o003.f184600e.add(jnVar2);
                    }
                }
            }
            ny12.f184587n = o003;
            Log.m105918d("MicroMsg.CardSnapshotMgr", "save coupon and gift card list snapshot");
            C61926c.m72656A((String) null, new C10440a(ny12));
        }
    }

    /* renamed from: i3 */
    public final ArrayList<C22668a> mo35798i3(C64595ny1 ny12, boolean z) {
        ArrayList<C22668a> arrayList = new ArrayList<>();
        ArrayList<C22668a> arrayList2 = !z ? new ArrayList<>() : this.f65262p;
        ArrayList<C22668a> arrayList3 = !z ? new ArrayList<>() : this.f65263q;
        C64597o00 o002 = ny12.f184586j;
        if (o002 != null) {
            LinkedList<C22502jn> linkedList = o002.f184600e;
            C87412m.m108593f(linkedList, "items");
            if (!linkedList.isEmpty()) {
                if (arrayList2.isEmpty()) {
                    C22668a aVar = new C22668a();
                    aVar.f65199a = 0;
                    aVar.f65200b = o002.f184599d;
                    arrayList2.add(aVar);
                }
                Iterator<C22502jn> it = o002.f184600e.iterator();
                while (it.hasNext()) {
                    C22668a aVar2 = new C22668a();
                    aVar2.f65201c = it.next();
                    aVar2.f65199a = 2;
                    arrayList2.add(aVar2);
                }
            }
        }
        arrayList.addAll(arrayList2);
        C64597o00 o003 = ny12.f184587n;
        if (o003 != null) {
            LinkedList<C22502jn> linkedList2 = o003.f184600e;
            C87412m.m108593f(linkedList2, "items");
            if (!linkedList2.isEmpty()) {
                if (arrayList3.isEmpty()) {
                    C22668a aVar3 = new C22668a();
                    aVar3.f65199a = 0;
                    aVar3.f65200b = o003.f184599d;
                    arrayList3.add(aVar3);
                }
                Iterator<C22502jn> it4 = o003.f184600e.iterator();
                while (it4.hasNext()) {
                    C22668a aVar4 = new C22668a();
                    aVar4.f65201c = it4.next();
                    aVar4.f65199a = 1;
                    arrayList3.add(aVar4);
                }
            }
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }
}
