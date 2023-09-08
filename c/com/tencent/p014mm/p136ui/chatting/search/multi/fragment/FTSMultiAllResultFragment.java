package com.tencent.p014mm.p136ui.chatting.search.multi.fragment;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.component.UIComponentFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kv1.C99254i;
import nk3.C61797d;
import ok3.C62072g;
import ok3.C62074i;
import rk3.C63462a;
import sk3.C63995m;
import sk3.C64004q0;
import sk3.C64017t;
import sk3.C64024v;
import sx3.C64187h0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment */
public final class FTSMultiAllResultFragment extends UIComponentFragment {

    /* renamed from: j */
    public View f165121j;

    /* renamed from: n */
    public RecyclerView f165122n;

    /* renamed from: o */
    public TextView f165123o;

    /* renamed from: p */
    public C61797d f165124p;

    /* renamed from: q */
    public boolean f165125q = true;

    /* renamed from: com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment$a */
    public static final class C6797a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ FTSMultiAllResultFragment f24347d;

        public C6797a(FTSMultiAllResultFragment fTSMultiAllResultFragment) {
            this.f24347d = fTSMultiAllResultFragment;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment$onCreateView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C39818r rVar = C39818r.f106831a;
            FragmentActivity activity = this.f24347d.getActivity();
            C87412m.m108591d(activity);
            ((C64004q0) rVar.mo62443b(activity).mo75002a(C64004q0.class)).mo88771c3();
            C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment$onCreateView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C64187h0.f181908d;
    }

    /* renamed from: O */
    public void mo2202O() {
        Class cls = C64024v.class;
        C117292a.m165355a("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.mo2202O();
        C39818r rVar = C39818r.f106831a;
        FragmentActivity activity = getActivity();
        C87412m.m108591d(activity);
        C62074i value = ((C64024v) rVar.mo62443b(activity).mo75002a(cls)).f181518h.getValue();
        Log.m105924i("MicroMsg.FTSMultiAllResultFragment", "onUserVisibleFocused >> " + value);
        if (value == C62074i.RUNNING) {
            Log.m105924i("MicroMsg.FTSMultiAllResultFragment", "onUserVisibleFocused >> isRunning");
            FragmentActivity activity2 = getActivity();
            C87412m.m108591d(activity2);
            ((C64024v) rVar.mo62443b(activity2).mo75002a(cls)).mo88783i3();
        }
        if (value == C62074i.FINISH) {
            FragmentActivity activity3 = getActivity();
            C87412m.m108591d(activity3);
            C64024v vVar = (C64024v) rVar.mo62443b(activity3).mo75002a(cls);
            vVar.getClass();
            Class cls2 = C63995m.class;
            Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "reportExpose");
            C63462a.f180011a.mo88331f(vVar.f181521n.size(), ((C63995m) rVar.mo62444c(vVar.getActivity()).mo75002a(cls2)).mo88764f3(), ((C63995m) rVar.mo62444c(vVar.getActivity()).mo75002a(cls2)).mo88762d3());
        }
        mo82057S();
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    /* renamed from: P */
    public void mo3550P() {
        C117292a.m165355a("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.mo3550P();
        Log.m105924i("MicroMsg.FTSMultiAllResultFragment", "onUserVisibleUnFocused");
        this.f165125q = true;
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    /* renamed from: R */
    public final void mo82056R(ArrayList<C62072g> arrayList) {
        Class cls = C64024v.class;
        C39818r rVar = C39818r.f106831a;
        FragmentActivity activity = getActivity();
        C87412m.m108591d(activity);
        ((C64024v) rVar.mo62443b(activity).mo75002a(cls)).mo88779d3();
        if (arrayList.isEmpty()) {
            Log.m105924i("MicroMsg.FTSMultiAllResultFragment", "dealResult to show no data no first");
            TextView textView = this.f165123o;
            if (textView != null) {
                FragmentActivity activity2 = getActivity();
                C87412m.m108591d(activity2);
                C64024v vVar = (C64024v) rVar.mo62443b(activity2).mo75002a(cls);
                vVar.getClass();
                String str = ((C64004q0) rVar.mo62444c(vVar.getActivity()).mo75002a(C64004q0.class)).f181449f;
                Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "getEmptyResultString >> " + str);
                textView.setText(C99254i.m129316m(vVar.getString(C0966R.string.mhl), vVar.getString(C0966R.string.mhf), str));
            }
            TextView textView2 = this.f165123o;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            RecyclerView recyclerView = this.f165122n;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.f165122n;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        TextView textView3 = this.f165123o;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        if (this.f165124p != null) {
            Log.m105924i("MicroMsg.FTSMultiAllResultFragment", "dealResult to show data no first");
            RecyclerView recyclerView3 = this.f165122n;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter((RecyclerView.C16613e) null);
            }
            C61797d dVar = this.f165124p;
            if (dVar != null) {
                dVar.f175706f = arrayList;
            }
            RecyclerView recyclerView4 = this.f165122n;
            if (recyclerView4 != null) {
                recyclerView4.setAdapter(this.f165124p);
            }
            RecyclerView recyclerView5 = this.f165122n;
            if (recyclerView5 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                RecyclerView recyclerView6 = recyclerView5;
                C117292a.m165358d(recyclerView6, aVar.mo10232b(), "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment", "dealResult", "(Ljava/util/ArrayList;)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView5.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView6, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment", "dealResult", "(Ljava/util/ArrayList;)V", "Undefined", "scrollToPosition", "(I)V");
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.FTSMultiAllResultFragment", "dealResult to show data first");
        RecyclerView recyclerView7 = this.f165122n;
        if (recyclerView7 != null) {
            recyclerView7.setLayoutManager(new LinearLayoutManager(getActivity()));
        }
        FragmentActivity activity3 = getActivity();
        C87412m.m108591d(activity3);
        C64024v vVar2 = (C64024v) rVar.mo62443b(activity3).mo75002a(cls);
        if (vVar2.f181524q == null) {
            C61797d dVar2 = new C61797d(vVar2.getContext(), vVar2.f181523p);
            vVar2.f181524q = dVar2;
            dVar2.f175708h = vVar2.f181522o;
            dVar2.f175707g = new C64017t(vVar2);
        }
        C61797d dVar3 = vVar2.f181524q;
        C87412m.m108591d(dVar3);
        this.f165124p = dVar3;
        dVar3.f175706f = arrayList;
        RecyclerView recyclerView8 = this.f165122n;
        if (recyclerView8 != null) {
            recyclerView8.setAdapter(this.f165124p);
        }
    }

    /* renamed from: S */
    public final void mo82057S() {
        Class cls = C64024v.class;
        Log.m105924i("MicroMsg.FTSMultiAllResultFragment", "initFirstTimeData >> " + this.f165125q);
        if (this.f165125q) {
            C39818r rVar = C39818r.f106831a;
            FragmentActivity activity = getActivity();
            C87412m.m108591d(activity);
            C62074i value = ((C64024v) rVar.mo62443b(activity).mo75002a(cls)).f181518h.getValue();
            FragmentActivity activity2 = getActivity();
            C87412m.m108591d(activity2);
            C64024v vVar = (C64024v) rVar.mo62443b(activity2).mo75002a(cls);
            boolean z = vVar.f181527t && !vVar.f181508B;
            Log.m105924i("MicroMsg.FTSMultiAllResultFragment", "initFirstTimeData >> state: " + value + ", currentAllDone: " + z);
            if (value == C62074i.FINISH && !z) {
                Log.m105924i("MicroMsg.FTSMultiAllResultFragment", "initFirstTimeData to update data");
                FragmentActivity activity3 = getActivity();
                C87412m.m108591d(activity3);
                mo82056R(((C64024v) rVar.mo62443b(activity3).mo75002a(cls)).mo88780e3());
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cvs;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r0 = "inflater"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "MicroMsg.FTSMultiAllResultFragment"
            java.lang.String r1 = "onCreateView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            android.view.View r1 = r2.f165121j
            if (r1 != 0) goto L_0x006c
            java.lang.String r1 = "onCreateView >> inflate view"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            android.view.View r3 = super.onCreateView(r3, r4, r5)
            r2.f165121j = r3
            r4 = 0
            if (r3 == 0) goto L_0x0028
            r5 = 2131305263(0x7f09232f, float:1.8228692E38)
            android.view.View r3 = r3.findViewById(r5)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            goto L_0x0029
        L_0x0028:
            r3 = r4
        L_0x0029:
            r2.f165122n = r3
            android.view.View r3 = r2.f165121j
            if (r3 == 0) goto L_0x0039
            r4 = 2131310314(0x7f0936ea, float:1.8238937E38)
            android.view.View r3 = r3.findViewById(r4)
            r4 = r3
            android.widget.TextView r4 = (android.widget.TextView) r4
        L_0x0039:
            r2.f165123o = r4
            androidx.recyclerview.widget.RecyclerView r3 = r2.f165122n
            if (r3 == 0) goto L_0x0047
            com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment$a r4 = new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment$a
            r4.<init>(r2)
            r3.setOnTouchListener(r4)
        L_0x0047:
            r2.mo82057S()
            bl3.r r3 = bl3.C39818r.f106831a
            androidx.fragment.app.FragmentActivity r4 = r2.getActivity()
            gy3.C87412m.m108591d(r4)
            bl3.r$a r3 = r3.mo62443b(r4)
            java.lang.Class<sk3.v> r4 = sk3.C64024v.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            sk3.v r3 = (sk3.C64024v) r3
            androidx.lifecycle.LiveData<ok3.i> r3 = r3.f181518h
            pk3.a r4 = new pk3.a
            r4.<init>(r2)
            r3.observe(r2, r4)
            android.view.View r3 = r2.f165121j
            return r3
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.search.multi.fragment.FTSMultiAllResultFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDestroyView() {
        super.onDestroyView();
    }
}
