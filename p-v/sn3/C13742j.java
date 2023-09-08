package sn3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.contact.OpenIMSelectContactUI;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import he0.C76158j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110818d0;
import tm3.C78056e;
import tm3.C78069w;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.transmit.uic.SelectTransmitUserReturnUIC$onCreate$1$2$2", mo125469f = "SelectTransmitUserReturnUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: sn3.j */
public final class C13742j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C13745k f38846d;

    /* renamed from: e */
    public final /* synthetic */ C78056e f38847e;

    /* renamed from: f */
    public final /* synthetic */ C78069w f38848f;

    @C91590f(mo125468c = "com.tencent.mm.ui.transmit.uic.SelectTransmitUserReturnUIC$onCreate$1$2$2$1", mo125469f = "SelectTransmitUserReturnUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sn3.j$a */
    public static final class C13743a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C13745k f38849d;

        /* renamed from: e */
        public final /* synthetic */ C78056e f38850e;

        /* renamed from: f */
        public final /* synthetic */ String f38851f;

        /* renamed from: g */
        public final /* synthetic */ C78069w f38852g;

        /* renamed from: sn3.j$a$a */
        public static final class C13744a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C13745k f38853d;

            /* renamed from: e */
            public final /* synthetic */ C78069w f38854e;

            public C13744a(C13745k kVar, C78069w wVar) {
                this.f38853d = kVar;
                this.f38854e = wVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/transmit/uic/SelectTransmitUserReturnUIC$onCreate$1$2$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C13745k kVar = this.f38853d;
                C78069w wVar = this.f38854e;
                kVar.getClass();
                if (WeChatBrands.Business.Entries.ContactWeCom.checkAvailable(kVar.getActivity())) {
                    Intent intent = new Intent(kVar.getActivity().getIntent());
                    intent.setClass(kVar.getActivity(), OpenIMSelectContactUI.class);
                    intent.removeExtra("titile");
                    intent.putExtra("openim_appid", "3552365301");
                    ArrayList arrayList2 = new ArrayList();
                    LinkedList<String> linkedList = wVar.f228826n;
                    C87412m.m108591d(linkedList);
                    Iterator<String> it = linkedList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (C72996z1.m85843n5(next)) {
                            arrayList2.add(next);
                        }
                    }
                    intent.putExtra("already_select_contact", C110818d0.m150921S(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
                    kVar.getActivity().startActivityForResult(intent, 5);
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/transmit/uic/SelectTransmitUserReturnUIC$onCreate$1$2$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13743a(C13745k kVar, C78056e eVar, String str, C78069w wVar, C15601d<? super C13743a> dVar) {
            super(2, dVar);
            this.f38849d = kVar;
            this.f38850e = eVar;
            this.f38851f = str;
            this.f38852g = wVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C13743a(this.f38849d, this.f38850e, this.f38851f, this.f38852g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13743a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            View inflate = C85868k2.m106137b(this.f38849d.getActivity()).inflate(C0966R.C0971layout.ayl, this.f38850e.f228799c, false);
            ((TextView) inflate.findViewById(C0966R.C0970id.bsk)).setText(this.f38851f);
            inflate.setOnClickListener(new C13744a(this.f38849d, this.f38852g));
            this.f38850e.f228797a.invoke(inflate);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13742j(C13745k kVar, C78056e eVar, C78069w wVar, C15601d<? super C13742j> dVar) {
        super(2, dVar);
        this.f38846d = kVar;
        this.f38847e = eVar;
        this.f38848f = wVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C13742j(this.f38846d, this.f38847e, this.f38848f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C13742j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        if (C97625j3.m125812b().mo105907v().mo69722q4().size() > 0) {
            String Rn0 = ((C76158j) C86312j.m106911c(C76158j.class)).Rn0("3552365301", "openim_acct_type_title", C76158j.C8510a.TYPE_WORDING);
            LifecycleScope c3 = this.f38846d.mo14597c3();
            if (c3 != null) {
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d(c3, C58901s.f168555a, (C53934p0) null, new C13743a(this.f38846d, this.f38847e, Rn0, this.f38848f, (C15601d<? super C13743a>) null), 2, (Object) null);
            }
        }
        return C13598b0.f38549a;
    }
}
