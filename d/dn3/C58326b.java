package dn3;

import a11.C39479c;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bi3.C0289a;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
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
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p196ln.C76706g;
import rx3.C13598b0;
import te3.C64445if3;
import te3.C64468jf3;
import tm3.C64959q;
import tm3.C64960r;
import tm3.C78065p;
import tm3.C78069w;
import yb2.C15946a;

/* renamed from: dn3.b */
public final class C58326b extends C15946a {

    /* renamed from: dn3.b$a */
    public static final class C58327a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f167007d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58327a(String str) {
            super(1);
            this.f167007d = str;
        }

        public Object invoke(Object obj) {
            String f;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            String str = this.f167007d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C64959q)) {
                C64959q qVar = (C64959q) action;
                C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
                C64468jf3 jf32 = new C64468jf3();
                Iterator it = ((ArrayList) C0289a.f857a.mo338c(qVar.f187043a)).iterator();
                while (it.hasNext()) {
                    C72996z1 z1Var = (C72996z1) it.next();
                    LinkedList<C64445if3> linkedList = jf32.f183793d;
                    C64445if3 if32 = new C64445if3();
                    if32.f183684d = z1Var.getUsername();
                    String q2 = Lo != null ? Lo.mo69789q2(z1Var.getUsername()) : null;
                    String str2 = "";
                    if (q2 == null) {
                        q2 = str2;
                    }
                    if (Util.isNullOrNil(q2) && (q2 = ((C75339i) C86312j.m106911c(C75339i.class)).mo62520pi(z1Var)) == null) {
                        q2 = str2;
                    }
                    if32.f183686f = q2;
                    C68097n Lo2 = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(z1Var.getUsername());
                    if (!(Lo2 == null || (f = Lo2.mo93597f()) == null)) {
                        str2 = f;
                    }
                    if32.f183685e = str2;
                    linkedList.add(if32);
                }
                qVar.setResult(new C64960r(jf32));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dn3.b$b */
    public static final class C58328b extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58326b f167008d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58328b(C58326b bVar) {
            super(1);
            this.f167008d = bVar;
        }

        public Object invoke(Object obj) {
            UIStateCenter e3;
            IStateActionResult result;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C58326b bVar = this.f167008d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C64959q) && (result = ((C64959q) action).getResult()) != null && (result instanceof C64960r)) {
                Intent intent = new Intent();
                intent.putExtra("KSelectUserList", ((C64960r) result).f187044a.toByteArray());
                bVar.getActivity().setResult(-1, intent);
                bVar.getActivity().finish();
            }
            C78065p pVar = (C78065p) wVar.checkAction(C78065p.class);
            if (!(pVar == null || (e3 = this.f167008d.mo14599e3()) == null)) {
                e3.dispatch(new C64959q(pVar.f228813a));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58326b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.process((C0125s) getActivity(), new C58327a(stringExtra));
        }
        UIStateCenter e35 = mo14599e3();
        if (e35 != null) {
            e35.observe((C0125s) getActivity(), new C58328b(this));
        }
    }
}
