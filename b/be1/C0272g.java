package be1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bl3.C0317e;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment;
import com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityTabUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dp1.C7435f2;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i31.C117134d;
import java.util.LinkedList;
import jt1.C9517a;
import jt1.C9519c;
import kotlin.ResultKt;
import nd1.C11149a;
import o40.C61926c;
import ob0.C89132b;
import od1.C11403f;
import od1.C11405h;
import org.json.JSONException;
import org.json.JSONObject;
import pd1.C11887a;
import rs1.C13317l7;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C51130rn1;
import te3.C51270sn1;
import te3.C51722vp0;
import te3.bi4;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: be1.g */
public final class C0272g extends FinderActivityTabUIC {

    /* renamed from: y */
    public FinderTopicTabFragment f829y;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.activity.topic.uic.FinderTopicTabUIC$request$1", mo125469f = "FinderTopicTabUIC.kt", mo125470l = {40}, mo125471m = "invokeSuspend")
    /* renamed from: be1.g$a */
    public static final class C0273a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f830d;

        /* renamed from: e */
        public /* synthetic */ Object f831e;

        /* renamed from: f */
        public final /* synthetic */ C0272g f832f;

        /* renamed from: g */
        public final /* synthetic */ int f833g;

        /* renamed from: h */
        public final /* synthetic */ String f834h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.activity.topic.uic.FinderTopicTabUIC$request$1$1", mo125469f = "FinderTopicTabUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: be1.g$a$a */
        public static final class C0274a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C89132b.C89134c<C51722vp0> f835d;

            /* renamed from: e */
            public final /* synthetic */ C8477a0 f836e;

            /* renamed from: f */
            public final /* synthetic */ C0272g f837f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0274a(C89132b.C89134c<C51722vp0> cVar, C8477a0 a0Var, C0272g gVar, C15601d<? super C0274a> dVar) {
                super(2, dVar);
                this.f835d = cVar;
                this.f836e = a0Var;
                this.f837f = gVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C0274a(this.f835d, this.f836e, this.f837f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C0274a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C51722vp0 vp02;
                T t;
                ResultKt.throwOnFailure(obj);
                C89132b.C89134c<C51722vp0> cVar = this.f835d;
                if (cVar.f256793a == 0 && cVar.f256794b == 0 && (vp02 = (C51722vp0) cVar.f256796d) != null && (t = vp02.f143613d) != null) {
                    C0272g gVar = this.f837f;
                    C8477a0 a0Var = this.f836e;
                    gVar.f33558t = t;
                    gVar.mo321j4(t);
                    a0Var.f27482d = gVar.mo325p4(t);
                }
                if (!this.f836e.f27482d) {
                    C0272g gVar2 = this.f837f;
                    C89132b.C89134c<C51722vp0> cVar2 = this.f835d;
                    gVar2.mo11415h4(cVar2.f256794b, cVar2.f256795c);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: be1.g$a$b */
        public static final class C0275b extends C87413o implements C32224a<C9519c<String, C51722vp0>> {

            /* renamed from: d */
            public final /* synthetic */ int f838d;

            /* renamed from: e */
            public final /* synthetic */ String f839e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0275b(int i, String str) {
                super(0);
                this.f838d = i;
                this.f839e = str;
            }

            public Object invoke() {
                return new C11887a(this.f838d, this.f839e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0273a(C0272g gVar, int i, String str, C15601d<? super C0273a> dVar) {
            super(2, dVar);
            this.f832f = gVar;
            this.f833g = i;
            this.f834h = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C0273a aVar = new C0273a(this.f832f, this.f833g, this.f834h, dVar);
            aVar.f831e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0273a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C8477a0 a0Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f830d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8477a0 a0Var2 = new C8477a0();
                C0275b bVar = new C0275b(this.f833g, this.f834h);
                C66212f coroutineContext = ((C0000n0) this.f831e).getCoroutineContext();
                int i2 = C53973z1.f151221b0;
                C9517a aVar2 = new C9517a(bVar, (C53973z1) coroutineContext.get(C53973z1.C0004b.f3d), (C0125s) null, 4, (C8480h) null);
                this.f831e = a0Var2;
                this.f830d = 1;
                obj = C117134d.m165173h(aVar2, false, this, 1, (Object) null);
                if (obj == aVar) {
                    return aVar;
                }
                a0Var = a0Var2;
            } else if (i == 1) {
                a0Var = (C8477a0) this.f831e;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C53895h.m60466d(this.f832f.getMainScope(), (C66212f) null, (C53934p0) null, new C0274a((C89132b.C89134c) obj, a0Var, this.f832f, (C15601d<? super C0274a>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0272g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: k4 */
    public void mo322k4(String str, int i, int i2) {
        C87412m.m108594g(str, "tabName");
        C51270sn1 sn12 = (C51270sn1) this.f33558t;
        long j = sn12 != null ? sn12.f141618e : 0;
        String stringExtra = getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("topicid", C61926c.m72691p(j));
            jSONObject.put("topictag", stringExtra);
            jSONObject.put("tabtype", i);
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(getActivity());
            f2Var.mo8577a(f != null ? f.mo12861q3() : null, "topictab", i2, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: m4 */
    public void mo323m4() {
        String stringExtra = getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C0273a(this, getIntent().getIntExtra("key_topic_type", 1), stringExtra, (C15601d<? super C0273a>) null), 3, (Object) null);
    }

    /* renamed from: n4 */
    public void mo324n4() {
        View findViewById;
        if (C11405h.C11406a.m11253a(this) && (findViewById = getActivity().findViewById(C0966R.C0970id.mwg)) != null) {
            findViewById.setBackgroundResource(C0966R.color.al6);
        }
        setNormalStyle();
    }

    /* renamed from: p4 */
    public boolean mo325p4(C51270sn1 sn12) {
        C51270sn1 sn13 = sn12;
        C87412m.m108594g(sn13, "topicInfo");
        C51130rn1 rn12 = sn13.f141614A;
        if (rn12 == null) {
            return false;
        }
        mo324n4();
        LinkedList<bi4> linkedList = rn12.f141044d;
        C87412m.m108593f(linkedList, "it.list");
        for (bi4 bi4 : linkedList) {
            FinderTopicTabFragment finderTopicTabFragment = new FinderTopicTabFragment();
            int i = bi4.f131136e;
            finderTopicTabFragment.f17334o = i - 1;
            String str = bi4.f131135d;
            finderTopicTabFragment.f12469q = bi4.f131137f;
            finderTopicTabFragment.f12470r = str == null ? "" : str;
            if (this.f829y == null) {
                this.f829y = finderTopicTabFragment;
            }
            bi4 bi42 = bi4;
            FinderTabUIC.m65395f3(this, new C11149a(-1, str == null ? "" : str, false, i, 1), finderTopicTabFragment, false, 4, (Object) null);
            String str2 = bi42.f131135d;
            C11403f.m11231l4(this, str2 == null ? "" : str2, bi42.f131136e, 0, 4, (Object) null);
        }
        mo80049Y3();
        return true;
    }

    /* renamed from: q4 */
    public void mo321j4(C51270sn1 sn12) {
        String str;
        Intent intent = getIntent();
        C51270sn1 sn13 = (C51270sn1) this.f33558t;
        intent.putExtra("KEY_TOPIC_ID", sn13 != null ? sn13.f141618e : 0);
        super.mo321j4(sn12);
        long longExtra = getIntent().getLongExtra("key_ref_object_id", 0);
        long longExtra2 = getIntent().getLongExtra("KEY_TOPIC_ID", 0);
        String stringExtra = getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        AppCompatActivity activity = getActivity();
        T t = this.f33558t;
        C51270sn1 sn14 = (C51270sn1) t;
        if (sn14 != null) {
            longExtra2 = sn14.f141618e;
        }
        C51270sn1 sn15 = (C51270sn1) t;
        if (!(sn15 == null || (str = sn15.f141617d) == null)) {
            stringExtra = str;
        }
        C87412m.m108594g(activity, "context");
        C13317l7 l7Var = (C13317l7) C39818r.f106831a.mo62443b(activity).mo75002a(C13317l7.class);
        l7Var.mo12758c3("feedid", C61926c.m72691p(longExtra));
        l7Var.mo12758c3("topicid", C61926c.m72691p(longExtra2));
        l7Var.mo12758c3("topicname", stringExtra);
    }
}
