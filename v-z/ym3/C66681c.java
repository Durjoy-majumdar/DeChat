package ym3;

import a11.C39479c;
import ac2.C39534d;
import ac2.C53998c;
import ac2.C54000f;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bc2.C0262a;
import bi3.C0289a;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.IStateActionResult;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d62.C75339i;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import m02.C46940b;
import mm3.C61501c;
import om3.C77020b;
import p196ln.C76706g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C77813z;
import te3.C64445if3;
import te3.C64468jf3;
import tm3.C64959q;
import tm3.C64960r;
import tm3.C64961s;
import tm3.C78065p;
import tm3.C78069w;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: ym3.c */
public final class C66681c extends C0262a<C77020b> {

    /* renamed from: d */
    public final List<String> f191717d = new ArrayList();

    /* renamed from: e */
    public final C13601g f191718e;

    /* renamed from: ym3.c$a */
    public static final class C66682a extends C87413o implements C32224a<C61501c> {

        /* renamed from: d */
        public final /* synthetic */ C66681c f191719d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f191720e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66682a(C66681c cVar, AppCompatActivity appCompatActivity) {
            super(0);
            this.f191719d = cVar;
            this.f191720e = appCompatActivity;
        }

        public Object invoke() {
            String stringExtra = this.f191719d.getIntent().getStringExtra("chatroomName");
            if (stringExtra == null) {
                stringExtra = "";
            }
            return new C61501c(this.f191720e, stringExtra, this.f191719d.f191717d);
        }
    }

    /* renamed from: ym3.c$b */
    public static final class C66683b extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66681c f191721d;

        /* renamed from: e */
        public final /* synthetic */ String f191722e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66683b(C66681c cVar, String str) {
            super(1);
            this.f191721d = cVar;
            this.f191722e = str;
        }

        public Object invoke(Object obj) {
            C13598b0 b0Var;
            C13598b0 b0Var2;
            String f;
            List list;
            List<String> Vg0;
            C46940b bVar;
            C78069w wVar = (C78069w) obj;
            Class cls = C46940b.class;
            C87412m.m108594g(wVar, "state");
            C66681c cVar = this.f191721d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C64961s)) {
                C64961s sVar = (C64961s) action;
                if ((!wVar.f228826n.isEmpty()) && (bVar = (C46940b) C86312j.m106911c(cls)) != null) {
                    LinkedList<String> linkedList = wVar.f228826n;
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                    for (String add : linkedList) {
                        arrayList.add(add);
                    }
                    List<String> Vg02 = bVar.Vg0(arrayList, 2);
                    if (Vg02 != null) {
                        wVar.f228826n.clear();
                        for (String str : Vg02) {
                            wVar.f228826n.add(str);
                            HashMap<String, Long> hashMap = wVar.f228832t;
                            C87412m.m108593f(str, LocaleUtil.ITALIAN);
                            hashMap.put(str, Long.valueOf(C31543z5.m39453c()));
                        }
                    }
                }
                wVar.f228827o.add(C75592q0.m90789s());
                String stringExtra = cVar.getIntent().getStringExtra("chatroommemberlist");
                if (stringExtra != null) {
                    String str2 = C112551y.m153811k(stringExtra) ^ true ? stringExtra : null;
                    if (str2 != null) {
                        list = C112550d0.m153785U(str2, new String[]{","}, false, 0, 6, (Object) null);
                        C46940b bVar2 = (C46940b) C86312j.m106911c(cls);
                        if (!(bVar2 == null || (Vg0 = bVar2.Vg0(list, 2)) == null)) {
                            ((ArrayList) cVar.f191717d).addAll(Vg0);
                        }
                    }
                }
                list = C64186f0.f181907d;
                C46940b bVar22 = (C46940b) C86312j.m106911c(cls);
                ((ArrayList) cVar.f191717d).addAll(Vg0);
            }
            String str3 = this.f191722e;
            IStateAction action2 = wVar.getAction();
            if (action2 != null && (action2 instanceof C64959q)) {
                C64959q qVar = (C64959q) action2;
                C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str3);
                C64468jf3 jf32 = new C64468jf3();
                Iterator it = ((ArrayList) C0289a.f857a.mo338c(qVar.f187043a)).iterator();
                while (it.hasNext()) {
                    C72996z1 z1Var = (C72996z1) it.next();
                    LinkedList<C64445if3> linkedList2 = jf32.f183793d;
                    C64445if3 if32 = new C64445if3();
                    C46940b bVar3 = (C46940b) C86312j.m106911c(cls);
                    if32.f183684d = bVar3 != null ? bVar3.mo72126cE(z1Var.getUsername(), 2) : null;
                    C87412m.m108594g(z1Var, "memberContact");
                    String q2 = Lo != null ? Lo.mo69789q2(z1Var.getUsername()) : null;
                    String str4 = "";
                    if (q2 == null) {
                        q2 = str4;
                    }
                    if (Util.isNullOrNil(q2) && (q2 = ((C75339i) C86312j.m106911c(C75339i.class)).mo62520pi(z1Var)) == null) {
                        q2 = str4;
                    }
                    if32.f183686f = q2;
                    C68097n Lo2 = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(z1Var.getUsername());
                    if (!(Lo2 == null || (f = Lo2.mo93597f()) == null)) {
                        str4 = f;
                    }
                    if32.f183685e = str4;
                    Long l = wVar.f228832t.get(z1Var.getUsername());
                    if (l != null) {
                        if32.f183687g = l.longValue();
                        b0Var = C13598b0.f38549a;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var == null) {
                        Long l2 = wVar.f228832t.get(if32.f183684d);
                        if (l2 != null) {
                            if32.f183687g = l2.longValue();
                            b0Var2 = C13598b0.f38549a;
                        } else {
                            b0Var2 = null;
                        }
                        if (b0Var2 == null) {
                            if32.f183687g = C31543z5.m39453c();
                        }
                    }
                    linkedList2.add(if32);
                    LinkedList<C64445if3> linkedList3 = jf32.f183793d;
                    C87412m.m108593f(linkedList3, "pojoContactList.dataList");
                    if (linkedList3.size() > 1) {
                        C77813z.m93909o(linkedList3, new C66685d());
                    }
                }
                qVar.setResult(new C64960r(jf32));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ym3.c$c */
    public static final class C66684c extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66681c f191723d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66684c(C66681c cVar) {
            super(1);
            this.f191723d = cVar;
        }

        public Object invoke(Object obj) {
            UIStateCenter e3;
            IStateActionResult result;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C66681c cVar = this.f191723d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C64959q) && (result = ((C64959q) action).getResult()) != null && (result instanceof C64960r)) {
                Intent intent = new Intent();
                intent.putExtra("KSelectUserList", ((C64960r) result).f187044a.toByteArray());
                cVar.getActivity().setResult(-1, intent);
                cVar.getActivity().finish();
            }
            C78065p pVar = (C78065p) wVar.checkAction(C78065p.class);
            if (!(pVar == null || (e3 = this.f191723d.mo14599e3()) == null)) {
                e3.dispatch(new C64959q(pVar.f228813a));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66681c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f191718e = C36568h.m40985a(new C66682a(this, appCompatActivity));
    }

    /* renamed from: g3 */
    public C54000f<C77020b, C53998c<C77020b>, C39534d<C77020b>> mo302g3() {
        return (C61501c) ((C36570n) this.f191718e).getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.process((C0125s) getActivity(), new C66683b(this, stringExtra));
        }
        UIStateCenter e35 = mo14599e3();
        if (e35 != null) {
            e35.observe((C0125s) getActivity(), new C66684c(this));
        }
    }
}
