package com.tencent.p014mm.plugin.finder.p056ui;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import android.os.Bundle;
import bl3.C0317e;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import pe1.C35464c;
import rx3.C13598b0;
import sx3.C22415w0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/SettingFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.SettingFragment */
public abstract class SettingFragment extends FinderHomeTabFragment {

    /* renamed from: q */
    public final ArrayList<C35464c<?>> f161165q = new ArrayList<>();

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.SettingFragment$reload$1$1", mo125469f = "FinderSettingsUI.kt", mo125470l = {328}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.ui.SettingFragment$a */
    public static final class C56375a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f161166d;

        /* renamed from: e */
        public final /* synthetic */ SettingFragment f161167e;

        /* renamed from: f */
        public final /* synthetic */ ViewBindUIC f161168f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.SettingFragment$reload$1$1$1", mo125469f = "FinderSettingsUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.ui.SettingFragment$a$a */
        public static final class C56376a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ SettingFragment f161169d;

            /* renamed from: e */
            public final /* synthetic */ ArrayList<C35464c<?>> f161170e;

            /* renamed from: f */
            public final /* synthetic */ ViewBindUIC f161171f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56376a(SettingFragment settingFragment, ArrayList<C35464c<?>> arrayList, ViewBindUIC viewBindUIC, C15601d<? super C56376a> dVar) {
                super(2, dVar);
                this.f161169d = settingFragment;
                this.f161170e = arrayList;
                this.f161171f = viewBindUIC;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C56376a(this.f161169d, this.f161170e, this.f161171f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C56376a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f161169d.f161165q.clear();
                this.f161169d.f161165q.addAll(this.f161170e);
                this.f161171f.mo79129c3(this.f161170e);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56375a(SettingFragment settingFragment, ViewBindUIC viewBindUIC, C15601d<? super C56375a> dVar) {
            super(2, dVar);
            this.f161167e = settingFragment;
            this.f161168f = viewBindUIC;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C56375a(this.f161167e, this.f161168f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C56375a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f161166d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList<C35464c<?>> V = this.f161167e.mo57071V();
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C56376a aVar2 = new C56376a(this.f161167e, V, this.f161168f, (C15601d<? super C56376a>) null);
                this.f161166d = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingFragment(String str, int i) {
        super(i);
        C87412m.m108594g(str, "name");
        this.f17333n = str;
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C22415w0.m26092a(ViewBindUIC.class);
    }

    /* renamed from: V */
    public abstract ArrayList<C35464c<?>> mo57071V();

    /* renamed from: X */
    public final void mo79128X() {
        ViewBindUIC viewBindUIC = (ViewBindUIC) C39818r.f106831a.mo62445d(this).mo75002a(ViewBindUIC.class);
        C87412m.m108593f(viewBindUIC, "uic");
        C0317e.launch$default(viewBindUIC, (C66212f) null, (C53934p0) null, new C56375a(this, viewBindUIC, (C15601d<? super C56375a>) null), 3, (Object) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo79128X();
    }
}
