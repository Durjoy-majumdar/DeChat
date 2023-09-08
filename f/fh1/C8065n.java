package fh1;

import a14.C0000n0;
import a14.C53921m;
import a14.C53934p0;
import ak1.C54108o;
import android.content.Context;
import android.content.DialogInterface;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54795n5;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import er1.C7813i5;
import f40.C86709a0;
import fh1.C8048h;
import fy3.C32227p;
import gy3.C8477a0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import kotlin.ResultKt;
import nk1.C11207i;
import o40.C61926c;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: fh1.n */
public final class C8065n implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ C8048h f26811a;

    /* renamed from: b */
    public final /* synthetic */ MMSwitchBtn f26812b;

    /* renamed from: c */
    public final /* synthetic */ Context f26813c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList<C8048h.C8051c> f26814d;

    /* renamed from: e */
    public final /* synthetic */ WxRecyclerView f26815e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.GestureEffectAnchorSettingController$showSettingPanel$1$5$1", mo125469f = "GestureEffectAnchorSettingController.kt", mo125470l = {204}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.n$a */
    public static final class C8066a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f26816d;

        /* renamed from: e */
        public int f26817e;

        /* renamed from: f */
        public final /* synthetic */ Context f26818f;

        /* renamed from: g */
        public final /* synthetic */ C8048h f26819g;

        /* renamed from: h */
        public final /* synthetic */ boolean f26820h;

        /* renamed from: i */
        public final /* synthetic */ MMSwitchBtn f26821i;

        /* renamed from: j */
        public final /* synthetic */ ArrayList<C8048h.C8051c> f26822j;

        /* renamed from: n */
        public final /* synthetic */ WxRecyclerView f26823n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8066a(Context context, C8048h hVar, boolean z, MMSwitchBtn mMSwitchBtn, ArrayList<C8048h.C8051c> arrayList, WxRecyclerView wxRecyclerView, C15601d<? super C8066a> dVar) {
            super(2, dVar);
            this.f26818f = context;
            this.f26819g = hVar;
            this.f26820h = z;
            this.f26821i = mMSwitchBtn;
            this.f26822j = arrayList;
            this.f26823n = wxRecyclerView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C8066a(this.f26818f, this.f26819g, this.f26820h, this.f26821i, this.f26822j, this.f26823n, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C8066a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C7813i5 i5Var;
            int i;
            int i2;
            Class cls = C8044g.class;
            Class cls2 = C54991o.class;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i3 = this.f26817e;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                C7813i5.C7814a aVar2 = C7813i5.f26336f;
                Context context = this.f26818f;
                C7813i5 a = C7813i5.C7814a.m7953a(aVar2, context, context.getResources().getString(C0966R.string.ett), 0, (DialogInterface.OnCancelListener) null, 8, (Object) null);
                a.begin();
                C8048h hVar = this.f26819g;
                boolean z = this.f26820h;
                this.f26816d = a;
                this.f26817e = 1;
                hVar.getClass();
                Class cls3 = C55001u.class;
                Log.m105924i("Finder.GestureEffectAnchorSettingController", "toggleGestureEffectSwitch " + z);
                C85801v1 i4 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SWITCH_GESTURE_EFFECT_BOOLEAN_SYNC;
                Boolean bool = Boolean.TRUE;
                i4.mo119677K(aVar3, bool);
                if (z) {
                    int i5 = ((C54991o) hVar.business(cls2)).f154354q;
                    Pattern pattern = C61926c.f176038a;
                    i2 = i5 | 131072;
                } else {
                    int i6 = ((C54991o) hVar.business(cls2)).f154354q;
                    Pattern pattern2 = C61926c.f176038a;
                    i2 = i6 & -131073;
                }
                if (!((C54991o) hVar.business(cls2)).mo75999e4()) {
                    Log.m105924i("Finder.GestureEffectAnchorSettingController", "toggleGestureEffectSwitch live is not started");
                    ((C54991o) hVar.business(cls2)).f154354q = i2;
                    obj2 = bool;
                } else {
                    C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                    mVar.mo74609p();
                    C8477a0 a0Var = new C8477a0();
                    FinderLiveService.f159376d.getClass();
                    C54795n5 n5Var = FinderLiveService.f159396y;
                    if (n5Var != null) {
                        C54795n5.C54796a.m61727e(n5Var, ((C55001u) hVar.business(cls3)).f154420q.f182392d, ((C55001u) hVar.business(cls3)).f154416j, i2, 131072, 0, new C8069o(hVar, z, a0Var, mVar), 16, (Object) null);
                    }
                    obj2 = mVar.mo74608o();
                }
                if (obj2 == aVar) {
                    return aVar;
                }
                i5Var = a;
            } else if (i3 == 1) {
                i5Var = (C7813i5) this.f26816d;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            i5Var.mo8913b();
            this.f26821i.setEnabled(true);
            int i7 = 0;
            if (booleanValue) {
                C8044g gVar = (C8044g) this.f26819g.controller(cls);
                if (gVar != null) {
                    gVar.mo9135m3(this.f26820h);
                }
                ArrayList<C8048h.C8051c> arrayList = this.f26822j;
                boolean z2 = this.f26820h;
                for (C8048h.C8051c cVar : arrayList) {
                    cVar.f26774e = z2;
                }
                RecyclerView.C16613e adapter = this.f26823n.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemRangeChanged(0, this.f26822j.size());
                }
                if (this.f26820h) {
                    C8048h.C8053d dVar = this.f26819g.f26772j;
                    if (dVar != null) {
                        dVar.mo9140b();
                    }
                } else {
                    C8048h.C8053d dVar2 = this.f26819g.f26772j;
                    if (dVar2 != null) {
                        dVar2.mo9141c();
                    }
                }
            } else {
                this.f26821i.setCheck(!this.f26820h);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C8044g gVar2 = (C8044g) this.f26819g.controller(cls);
            if (gVar2 != null) {
                i = 1;
                if (gVar2.f26761n) {
                    i7 = 1;
                }
            } else {
                i = 1;
            }
            linkedHashMap.put("switch_type", new Integer(i7));
            if (((C54991o) this.f26819g.business(cls2)).mo75999e4()) {
                i = 2;
            }
            linkedHashMap.put("switch_stage", new Integer(i));
            ((C54108o) C86312j.m106911c(C54108o.class)).Rx0("live_anchor_gesture_features_switch", "view_clk", linkedHashMap);
            return C13598b0.f38549a;
        }
    }

    public C8065n(C8048h hVar, MMSwitchBtn mMSwitchBtn, Context context, ArrayList<C8048h.C8051c> arrayList, WxRecyclerView wxRecyclerView) {
        this.f26811a = hVar;
        this.f26812b = mMSwitchBtn;
        this.f26813c = context;
        this.f26814d = arrayList;
        this.f26815e = wxRecyclerView;
    }

    public final void onStatusChange(boolean z) {
        Log.m105924i("Finder.GestureEffectAnchorSettingController", "switchBtn click, " + z);
        if (z != C8048h.f26771n.mo9138c(this.f26811a.getStore().getLiveRoomData())) {
            this.f26812b.setEnabled(false);
            C8048h hVar = this.f26811a;
            C11207i.m11066b(hVar, (C66212f) null, (C53934p0) null, new C8066a(this.f26813c, hVar, z, this.f26812b, this.f26814d, this.f26815e, (C15601d<? super C8066a>) null), 3, (Object) null);
        }
    }
}
