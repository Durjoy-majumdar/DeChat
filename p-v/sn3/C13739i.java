package sn3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import bi3.C0289a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import tm3.C78056e;
import tm3.C78069w;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.transmit.uic.SelectTransmitUserReturnUIC$onCreate$1$2$1", mo125469f = "SelectTransmitUserReturnUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: sn3.i */
public final class C13739i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C13745k f38838d;

    /* renamed from: e */
    public final /* synthetic */ C78056e f38839e;

    /* renamed from: f */
    public final /* synthetic */ C78069w f38840f;

    @C91590f(mo125468c = "com.tencent.mm.ui.transmit.uic.SelectTransmitUserReturnUIC$onCreate$1$2$1$1", mo125469f = "SelectTransmitUserReturnUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sn3.i$a */
    public static final class C13740a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C13745k f38841d;

        /* renamed from: e */
        public final /* synthetic */ C78056e f38842e;

        /* renamed from: f */
        public final /* synthetic */ C78069w f38843f;

        /* renamed from: sn3.i$a$a */
        public static final class C13741a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C13745k f38844d;

            /* renamed from: e */
            public final /* synthetic */ C78069w f38845e;

            public C13741a(C13745k kVar, C78069w wVar) {
                this.f38844d = kVar;
                this.f38845e = wVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/transmit/uic/SelectTransmitUserReturnUIC$onCreate$1$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C13745k kVar = this.f38844d;
                C78069w wVar = this.f38845e;
                kVar.getClass();
                Intent intent = new Intent();
                intent.setClassName(kVar.getActivity(), "com.tencent.mm.ui.contact.GroupCardSelectUI");
                intent.putExtra("group_select_type", true);
                intent.putExtra("group_select_need_result", true);
                if (wVar.f228822g == 14) {
                    intent.putExtra("group_multi_select", true);
                    LinkedList<String> linkedList = wVar.f228826n;
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(linkedList);
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(hashSet, 10));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((String) it.next());
                    }
                    intent.putExtra("already_select_contact", C110818d0.m150921S(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
                    intent.putExtra("max_limit_num", wVar.f228823h);
                    kVar.getActivity().startActivityForResult(intent, 4);
                } else {
                    kVar.getActivity().startActivityForResult(intent, 0);
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/transmit/uic/SelectTransmitUserReturnUIC$onCreate$1$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13740a(C13745k kVar, C78056e eVar, C78069w wVar, C15601d<? super C13740a> dVar) {
            super(2, dVar);
            this.f38841d = kVar;
            this.f38842e = eVar;
            this.f38843f = wVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C13740a(this.f38841d, this.f38842e, this.f38843f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13740a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            View inflate = C85868k2.m106137b(this.f38841d.getActivity()).inflate(C0966R.C0971layout.ayl, this.f38842e.f228799c, false);
            ((TextView) inflate.findViewById(C0966R.C0970id.bsk)).setText(this.f38841d.getString(C0966R.string.f7487hl));
            inflate.setOnClickListener(new C13741a(this.f38841d, this.f38843f));
            this.f38842e.f228797a.invoke(inflate);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13739i(C13745k kVar, C78056e eVar, C78069w wVar, C15601d<? super C13739i> dVar) {
        super(2, dVar);
        this.f38838d = kVar;
        this.f38839e = eVar;
        this.f38840f = wVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C13739i(this.f38838d, this.f38839e, this.f38840f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C13739i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        LifecycleScope c3;
        ResultKt.throwOnFailure(obj);
        if (C0289a.f857a.mo336a() && (c3 = this.f38838d.mo14597c3()) != null) {
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60466d(c3, C58901s.f168555a, (C53934p0) null, new C13740a(this.f38838d, this.f38839e, this.f38840f, (C15601d<? super C13740a>) null), 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
