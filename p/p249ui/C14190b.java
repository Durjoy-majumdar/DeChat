package p249ui;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f14.C58901s;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import he0.C76158j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import ke3.C88144b;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110818d0;
import tm3.C78056e;
import tm3.C78069w;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.chatroom.ui.uic.SelectOpenImChatRoomAddMemberHeaderUIC$onCreate$1$1$1", mo125469f = "SelectOpenImChatRoomAddMemberHeaderUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: ui.b */
public final class C14190b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C14193c f39639d;

    /* renamed from: e */
    public final /* synthetic */ C78056e f39640e;

    /* renamed from: f */
    public final /* synthetic */ C78069w f39641f;

    @C91590f(mo125468c = "com.tencent.mm.chatroom.ui.uic.SelectOpenImChatRoomAddMemberHeaderUIC$onCreate$1$1$1$1", mo125469f = "SelectOpenImChatRoomAddMemberHeaderUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ui.b$a */
    public static final class C14191a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C14193c f39642d;

        /* renamed from: e */
        public final /* synthetic */ C78056e f39643e;

        /* renamed from: f */
        public final /* synthetic */ String f39644f;

        /* renamed from: g */
        public final /* synthetic */ C78069w f39645g;

        /* renamed from: ui.b$a$a */
        public static final class C14192a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C14193c f39646d;

            /* renamed from: e */
            public final /* synthetic */ C78069w f39647e;

            public C14192a(C14193c cVar, C78069w wVar) {
                this.f39646d = cVar;
                this.f39647e = wVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/chatroom/ui/uic/SelectOpenImChatRoomAddMemberHeaderUIC$onCreate$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C14193c cVar = this.f39646d;
                C78069w wVar = this.f39647e;
                cVar.getClass();
                if (WeChatBrands.Business.Entries.ContactWeCom.checkAvailable(cVar.getActivity())) {
                    Intent intent = new Intent(cVar.getActivity().getIntent());
                    intent.removeExtra("titile");
                    intent.putExtra("openim_appid", "3552365301");
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> it = wVar.f228826n.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (C72996z1.m85843n5(next)) {
                            arrayList2.add(next);
                        }
                    }
                    intent.putExtra("already_select_contact", C110818d0.m150921S(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
                    C88144b.m109802t(cVar.getActivity(), ".ui.contact.OpenIMSelectContactUI", intent, 5);
                }
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/uic/SelectOpenImChatRoomAddMemberHeaderUIC$onCreate$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14191a(C14193c cVar, C78056e eVar, String str, C78069w wVar, C15601d<? super C14191a> dVar) {
            super(2, dVar);
            this.f39642d = cVar;
            this.f39643e = eVar;
            this.f39644f = str;
            this.f39645g = wVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C14191a(this.f39642d, this.f39643e, this.f39644f, this.f39645g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C14191a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            AppCompatActivity activity = this.f39642d.getActivity();
            View inflate = LayoutInflater.from(activity).inflate(C0966R.C0971layout.cts, this.f39643e.f228799c, false);
            ((TextView) inflate.findViewById(C0966R.C0970id.bsk)).setText(this.f39644f);
            inflate.setOnClickListener(new C14192a(this.f39642d, this.f39645g));
            C32226l<View, C13598b0> lVar = this.f39643e.f228797a;
            C87412m.m108593f(inflate, "openIMHeaderVB.inflateRootView");
            lVar.invoke(inflate);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14190b(C14193c cVar, C78056e eVar, C78069w wVar, C15601d<? super C14190b> dVar) {
        super(2, dVar);
        this.f39639d = cVar;
        this.f39640e = eVar;
        this.f39641f = wVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C14190b(this.f39639d, this.f39640e, this.f39641f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C14190b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        if (((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69722q4().size() > 0) {
            String Rn0 = ((C76158j) C86312j.m106911c(C76158j.class)).Rn0("3552365301", "openim_acct_type_title", C76158j.C8510a.TYPE_WORDING);
            LifecycleScope c3 = this.f39639d.mo14597c3();
            if (c3 != null) {
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d(c3, C58901s.f168555a, (C53934p0) null, new C14191a(this.f39639d, this.f39640e, Rn0, this.f39641f, (C15601d<? super C14191a>) null), 2, (Object) null);
            }
        }
        return C13598b0.f38549a;
    }
}
