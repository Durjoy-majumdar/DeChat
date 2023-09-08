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
import java.util.LinkedList;
import java.util.List;
import jp3.C9487b;
import kz0.C10444f;
import kz0.C46817i;
import mz0.C47146d;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C22502jn;
import te3.C51196s30;
import te3.C64696s32;
import z04.C119027c;

/* renamed from: uz0.m0 */
public final class C22689m0 extends C22680h {

    /* renamed from: i */
    public final int f65241i = 10;

    /* renamed from: j */
    public final int f65242j = 5;

    /* renamed from: n */
    public int f65243n;

    /* renamed from: o */
    public C64696s32 f65244o;

    /* renamed from: p */
    public final ArrayList<C22668a> f65245p = new ArrayList<>();

    /* renamed from: uz0.m0$a */
    public static final class C22690a extends C87413o implements C32226l<C89132b.C89134c<C64696s32>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C22689m0 f65246d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22690a(C22689m0 m0Var) {
            super(1);
            this.f65246d = m0Var;
        }

        public Object invoke(Object obj) {
            String str;
            C64696s32 s322;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar != null) {
                C22689m0 m0Var = this.f65246d;
                Log.m105924i("MicroMsg.MemberHistoryCardListViewModel", "force refresh member history card, errType: " + cVar.f256793a + ", errCode: " + cVar.f256794b + ", errMsg: " + cVar.f256795c);
                if (cVar.f256793a == 0 && cVar.f256794b == 0 && (s322 = (C64696s32) cVar.f256796d) != null) {
                    Log.m105924i("MicroMsg.MemberHistoryCardListViewModel", "retcode: " + s322.f185325d + ", retmsg: " + s322.f185326e);
                    if (s322.f185325d == 0) {
                        m0Var.f65243n = 0;
                        if (s322.f185327f) {
                            m0Var.f65228g.postValue(C22707x.UP_TO_DATE);
                        } else {
                            m0Var.f65228g.postValue(C22707x.INCOMPLETE);
                        }
                        m0Var.f65244o = s322;
                        m0Var.f65225d.postValue(s322.f185330i);
                        C54219z<ArrayList<C22668a>> zVar = m0Var.f65227f;
                        LinkedList<C22502jn> linkedList = s322.f185331j;
                        C87412m.m108593f(linkedList, "resp.items");
                        zVar.postValue(m0Var.mo35796i3(linkedList, true));
                    } else {
                        str = s322.f185326e;
                        C87412m.m108593f(str, "resp.ret_msg");
                    }
                } else {
                    str = "";
                }
                C22707x xVar = C22707x.FAILED;
                xVar.f65286d = str;
                m0Var.f65228g.postValue(xVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: uz0.m0$b */
    public static final class C22691b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C22689m0 f65247a;

        /* renamed from: b */
        public final /* synthetic */ C22707x f65248b;

        /* renamed from: c */
        public final /* synthetic */ C22668a f65249c;

        public C22691b(C22689m0 m0Var, C22707x xVar, C22668a aVar) {
            this.f65247a = m0Var;
            this.f65248b = xVar;
            this.f65249c = aVar;
        }

        public Object call(Object obj) {
            String str;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.MemberHistoryCardListViewModel", "do delete card, errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            this.f65247a.f65229h.postValue(Boolean.FALSE);
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                T t = cVar.f256796d;
                C22689m0 m0Var = this.f65247a;
                C22707x xVar = this.f65248b;
                C22668a aVar = this.f65249c;
                C51196s30 s302 = (C51196s30) t;
                Log.m105925i("MicroMsg.MemberHistoryCardListViewModel", "do delete card, retCode: %s", Integer.valueOf(s302.f141290d));
                if (s302.f141290d == 0) {
                    m0Var.f65228g.postValue(xVar);
                    C54219z<ArrayList<C22668a>> zVar = m0Var.f65227f;
                    ArrayList<C22668a> arrayList = m0Var.f65245p;
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
                    Log.m105924i("MicroMsg.MemberHistoryCardListViewModel", sb.toString());
                    zVar.postValue(arrayList);
                    return C13598b0.f38549a;
                }
                str = ((C51196s30) cVar.f256796d).f141291e;
                C87412m.m108593f(str, "it.resp.ret_msg");
            } else {
                str = "";
            }
            C22707x xVar2 = C22707x.FAILED;
            xVar2.f65286d = str;
            this.f65247a.f65228g.postValue(xVar2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: uz0.m0$c */
    public static final class C22692c extends C87413o implements C32226l<C89132b.C89134c<C64696s32>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C22689m0 f65250d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22692c(C22689m0 m0Var) {
            super(1);
            this.f65250d = m0Var;
        }

        public Object invoke(Object obj) {
            String str;
            C64696s32 s322;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar != null) {
                C22689m0 m0Var = this.f65250d;
                Log.m105924i("MicroMsg.MemberHistoryCardListViewModel", "refresh member history card, errType: " + cVar.f256793a + ", errCode: " + cVar.f256794b + ", errMsg: " + cVar.f256795c);
                if (cVar.f256793a == 0 && cVar.f256794b == 0 && (s322 = (C64696s32) cVar.f256796d) != null) {
                    Log.m105924i("MicroMsg.MemberHistoryCardListViewModel", "refresh member history card, retcode: " + s322.f185325d + ", retmsg: " + s322.f185326e);
                    if (s322.f185325d == 0) {
                        m0Var.f65243n = 0;
                        if (s322.f185327f) {
                            m0Var.f65228g.postValue(C22707x.UP_TO_DATE);
                        } else {
                            m0Var.f65228g.postValue(C22707x.INCOMPLETE);
                        }
                        m0Var.f65244o = s322;
                        m0Var.f65225d.postValue(s322.f185330i);
                        C54219z<ArrayList<C22668a>> zVar = m0Var.f65227f;
                        LinkedList<C22502jn> linkedList = s322.f185331j;
                        C87412m.m108593f(linkedList, "resp.items");
                        zVar.postValue(m0Var.mo35796i3(linkedList, true));
                    } else {
                        str = s322.f185326e;
                        C87412m.m108593f(str, "resp.ret_msg");
                    }
                } else {
                    str = "";
                }
                C22707x xVar = C22707x.FAILED;
                xVar.f65286d = str;
                m0Var.f65228g.postValue(xVar);
            }
            return C13598b0.f38549a;
        }
    }

    public C22689m0() {
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
            int i2 = this.f65243n;
            if (i2 > 0) {
                i = i2;
            } else if (this.f65245p.size() > 0) {
                i = 0 + this.f65245p.size();
            }
            int i3 = this.f65241i;
            if (i < i3) {
                i = i3;
            }
            this.f65245p.clear();
            C47146d dVar = new C47146d(0, (long) (i + this.f65242j));
            dVar.f256791h = true;
            C89059e i4 = dVar.mo9225i();
            C87412m.m108593f(i4, "CgiGetMemberCardHistoryR…ntCancelAfterDead().run()");
            C61926c.m72665J(i4, new C22690a(this)).mo11397F(bVar);
        }
    }

    /* renamed from: d3 */
    public void mo35791d3() {
        Log.m105918d("MicroMsg.CardSnapshotMgr", "load coupon History card list snapshot");
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_MEMBER_CARD_HISTORY_STRING_SYNC, "");
        int i = 0;
        C64696s32 s322 = null;
        if (!(str == null || str.length() == 0)) {
            C64696s32 s323 = new C64696s32();
            byte[] bytes = str.getBytes(C119027c.f356489b);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            try {
                s323.parseFrom(bytes);
                s322 = s323;
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
        }
        if (s322 != null) {
            this.f65225d.postValue(s322.f185330i);
            LinkedList<C22502jn> linkedList = s322.f185331j;
            C87412m.m108593f(linkedList, "items");
            ArrayList<C22668a> i3 = mo35796i3(linkedList, false);
            if (i3 != null) {
                i = i3.size();
            }
            this.f65243n = i;
            this.f65227f.postValue(i3);
        }
    }

    /* renamed from: e3 */
    public void mo35792e3(C22668a aVar) {
        C22707x xVar;
        C87412m.m108594g(aVar, "cardDataModel");
        C22502jn jnVar = aVar.f65201c;
        if (jnVar != null) {
            Log.m105925i("MicroMsg.MemberHistoryCardListViewModel", "do delete card: %s", jnVar.f64049d);
            C22707x value = this.f65228g.getValue();
            if (value != C22707x.LOADING && value != (xVar = C22707x.DELETING)) {
                this.f65229h.postValue(Boolean.TRUE);
                this.f65228g.postValue(xVar);
                String str = jnVar.f64049d;
                C87412m.m108593f(str, "user_card_id");
                new C46817i(str).mo9225i().mo123062e(new C22691b(this, value, aVar));
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
            int i2 = this.f65243n;
            long j = 0;
            if (i2 > 0) {
                int i3 = this.f65241i;
                if (i2 >= i3) {
                    i3 = i2;
                }
                i = i3 + i2;
            } else {
                C64696s32 s322 = this.f65244o;
                if (s322 != null) {
                    j = s322.f185328g;
                }
                i = this.f65241i;
            }
            C47146d dVar = new C47146d(j, (long) i);
            dVar.f256791h = true;
            C89059e i4 = dVar.mo9225i();
            C87412m.m108593f(i4, "CgiGetMemberCardHistoryR…ntCancelAfterDead().run()");
            C61926c.m72665J(i4, new C22692c(this)).mo11397F(bVar);
        }
    }

    /* renamed from: g3 */
    public void mo35794g3() {
        C64696s32 s322 = this.f65244o;
        if (s322 != null) {
            LinkedList<C22502jn> linkedList = new LinkedList<>();
            if (!this.f65245p.isEmpty()) {
                Iterator<C22668a> it = this.f65245p.iterator();
                while (it.hasNext()) {
                    C22502jn jnVar = it.next().f65201c;
                    if (jnVar != null) {
                        linkedList.add(jnVar);
                    }
                }
            }
            s322.f185331j = linkedList;
            Log.m105918d("MicroMsg.CardSnapshotMgr", "save coupon History card list snapshot");
            C61926c.m72656A((String) null, new C10444f(s322));
        }
    }

    /* renamed from: i3 */
    public final ArrayList<C22668a> mo35796i3(List<? extends C22502jn> list, boolean z) {
        ArrayList<C22668a> arrayList = !z ? new ArrayList<>() : this.f65245p;
        for (C22502jn jnVar : list) {
            C22668a aVar = new C22668a();
            aVar.f65201c = jnVar;
            aVar.f65199a = 4;
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
