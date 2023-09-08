package com.tencent.p014mm.p136ui.chatting.search.multi.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
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
import kotlin.Metadata;
import nk3.C61802h;
import ok3.C62074i;
import pk3.C62343b;
import sk3.C63971c0;
import sk3.C63979f0;
import sk3.C63994l0;
import sk3.C64004q0;
import sk3.C64028w;
import sk3.C64034y;
import sk3.C77723g0;
import sx3.C64187h0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment */
public final class FTSMultiNormalResultFragment extends UIComponentFragment {

    /* renamed from: j */
    public final int f165127j;

    /* renamed from: n */
    public View f165128n;

    /* renamed from: o */
    public RecyclerView f165129o;

    /* renamed from: p */
    public TextView f165130p;

    /* renamed from: q */
    public C61802h f165131q;

    /* renamed from: r */
    public int f165132r;

    /* renamed from: com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment$a */
    public static final class C6798a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ FTSMultiNormalResultFragment f24348d;

        public C6798a(FTSMultiNormalResultFragment fTSMultiNormalResultFragment) {
            this.f24348d = fTSMultiNormalResultFragment;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment$onCreateView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C39818r rVar = C39818r.f106831a;
            FragmentActivity activity = this.f24348d.getActivity();
            C87412m.m108591d(activity);
            ((C64004q0) rVar.mo62443b(activity).mo75002a(C64004q0.class)).mo88771c3();
            C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment$onCreateView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    public FTSMultiNormalResultFragment(int i) {
        this.f165127j = i;
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C64187h0.f181908d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r5 = r5.f181420i;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2202O() {
        /*
            r10 = this;
            java.lang.Class<sk3.m> r0 = sk3.C63995m.class
            java.lang.String r1 = "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment"
            java.lang.String r2 = "com/tencent/mm/ui/component/UIComponentFragment"
            java.lang.String r3 = "onUserVisibleFocused"
            java.lang.String r4 = "()V"
            j20.C117292a.m165355a(r1, r2, r3, r4, r10)
            super.mo2202O()
            sk3.l0 r5 = r10.mo82059S()
            if (r5 == 0) goto L_0x0021
            androidx.lifecycle.LiveData<ok3.i> r5 = r5.f181420i
            if (r5 == 0) goto L_0x0021
            java.lang.Object r5 = r5.getValue()
            ok3.i r5 = (ok3.C62074i) r5
            goto L_0x0022
        L_0x0021:
            r5 = 0
        L_0x0022:
            ok3.i r6 = ok3.C62074i.FINISH
            if (r5 != r6) goto L_0x0028
            r5 = 1
            goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "onUserVisibleFocused >> "
            r6.append(r7)
            int r7 = r10.f165127j
            r6.append(r7)
            java.lang.String r7 = ", "
            r6.append(r7)
            r6.append(r5)
            r6.append(r7)
            int r7 = r10.f165132r
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.FTSMultiNormalResultFragment"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            if (r5 == 0) goto L_0x0086
            rk3.a r5 = rk3.C63462a.f180011a
            int r6 = r10.f165132r
            bl3.r r7 = bl3.C39818r.f106831a
            androidx.fragment.app.FragmentActivity r8 = r10.getActivity()
            gy3.C87412m.m108591d(r8)
            bl3.r$a r8 = r7.mo62443b(r8)
            androidx.lifecycle.i0 r8 = r8.mo75002a(r0)
            sk3.m r8 = (sk3.C63995m) r8
            int r8 = r8.mo88764f3()
            androidx.fragment.app.FragmentActivity r9 = r10.getActivity()
            gy3.C87412m.m108591d(r9)
            bl3.r$a r7 = r7.mo62443b(r9)
            androidx.lifecycle.i0 r0 = r7.mo75002a(r0)
            sk3.m r0 = (sk3.C63995m) r0
            int r0 = r0.mo88762d3()
            r5.mo88331f(r6, r8, r0)
        L_0x0086:
            j20.C117292a.m165361g(r10, r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment.mo2202O():void");
    }

    /* renamed from: P */
    public void mo3550P() {
        C117292a.m165355a("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.mo3550P();
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: nk3.h} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82058R(java.util.ArrayList<ok3.C62070e> r14) {
        /*
            r13 = this;
            java.lang.Class<sk3.q0> r0 = sk3.C64004q0.class
            java.lang.Class<sk3.m> r1 = sk3.C63995m.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "dealResult >> "
            r2.append(r3)
            int r3 = r13.f165127j
            r2.append(r3)
            java.lang.String r3 = ", "
            r2.append(r3)
            r3 = 1
            r4 = 0
            if (r14 == 0) goto L_0x0025
            boolean r5 = r14.isEmpty()
            if (r5 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r5 = 0
            goto L_0x0026
        L_0x0025:
            r5 = 1
        L_0x0026:
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "MicroMsg.FTSMultiNormalResultFragment"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            if (r14 == 0) goto L_0x0039
            int r2 = r14.size()
            goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            r13.f165132r = r2
            bl3.r r2 = bl3.C39818r.f106831a
            androidx.fragment.app.FragmentActivity r5 = r13.getActivity()
            gy3.C87412m.m108591d(r5)
            bl3.r$a r5 = r2.mo62443b(r5)
            androidx.lifecycle.i0 r5 = r5.mo75002a(r1)
            sk3.m r5 = (sk3.C63995m) r5
            boolean r5 = r5.f181434o
            if (r5 == 0) goto L_0x0057
            int r5 = r13.f165127j
            int r5 = r5 + r3
            goto L_0x0059
        L_0x0057:
            int r5 = r13.f165127j
        L_0x0059:
            androidx.fragment.app.FragmentActivity r6 = r13.getActivity()
            gy3.C87412m.m108591d(r6)
            bl3.r$a r6 = r2.mo62443b(r6)
            java.lang.Class<sk3.r0> r7 = sk3.C64009r0.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r7)
            sk3.r0 r6 = (sk3.C64009r0) r6
            int r6 = r6.f181466p
            if (r5 != r6) goto L_0x00a1
            rk3.a r5 = rk3.C63462a.f180011a
            int r6 = r13.f165132r
            androidx.fragment.app.FragmentActivity r7 = r13.getActivity()
            gy3.C87412m.m108591d(r7)
            bl3.r$a r7 = r2.mo62443b(r7)
            androidx.lifecycle.i0 r7 = r7.mo75002a(r1)
            sk3.m r7 = (sk3.C63995m) r7
            int r7 = r7.mo88764f3()
            androidx.fragment.app.FragmentActivity r8 = r13.getActivity()
            gy3.C87412m.m108591d(r8)
            bl3.r$a r8 = r2.mo62443b(r8)
            androidx.lifecycle.i0 r1 = r8.mo75002a(r1)
            sk3.m r1 = (sk3.C63995m) r1
            int r1 = r1.mo88762d3()
            r5.mo88331f(r6, r7, r1)
        L_0x00a1:
            if (r14 == 0) goto L_0x00ab
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r3 = 0
        L_0x00ab:
            r14 = 8
            r1 = 0
            if (r3 == 0) goto L_0x00d5
            android.widget.TextView r0 = r13.f165130p
            if (r0 != 0) goto L_0x00b5
            goto L_0x00c2
        L_0x00b5:
            sk3.l0 r2 = r13.mo82059S()
            if (r2 == 0) goto L_0x00bf
            android.text.SpannableString r1 = r2.mo88749c3()
        L_0x00bf:
            r0.setText(r1)
        L_0x00c2:
            android.widget.TextView r0 = r13.f165130p
            if (r0 != 0) goto L_0x00c7
            goto L_0x00ca
        L_0x00c7:
            r0.setVisibility(r4)
        L_0x00ca:
            androidx.recyclerview.widget.RecyclerView r0 = r13.f165129o
            if (r0 != 0) goto L_0x00d0
            goto L_0x0195
        L_0x00d0:
            r0.setVisibility(r14)
            goto L_0x0195
        L_0x00d5:
            androidx.recyclerview.widget.RecyclerView r3 = r13.f165129o
            if (r3 != 0) goto L_0x00da
            goto L_0x00dd
        L_0x00da:
            r3.setVisibility(r4)
        L_0x00dd:
            android.widget.TextView r3 = r13.f165130p
            if (r3 != 0) goto L_0x00e2
            goto L_0x00e5
        L_0x00e2:
            r3.setVisibility(r14)
        L_0x00e5:
            nk3.h r14 = r13.f165131q
            if (r14 == 0) goto L_0x0156
            if (r14 == 0) goto L_0x0101
            androidx.fragment.app.FragmentActivity r3 = r13.getActivity()
            gy3.C87412m.m108591d(r3)
            bl3.r$a r2 = r2.mo62443b(r3)
            androidx.lifecycle.i0 r0 = r2.mo75002a(r0)
            sk3.q0 r0 = (sk3.C64004q0) r0
            java.lang.String r0 = r0.f181449f
            r14.mo86725F4(r0)
        L_0x0101:
            androidx.recyclerview.widget.RecyclerView r14 = r13.f165129o
            if (r14 != 0) goto L_0x0106
            goto L_0x0109
        L_0x0106:
            r14.setAdapter(r1)
        L_0x0109:
            androidx.recyclerview.widget.RecyclerView r14 = r13.f165129o
            if (r14 != 0) goto L_0x010e
            goto L_0x0113
        L_0x010e:
            nk3.h r0 = r13.f165131q
            r14.setAdapter(r0)
        L_0x0113:
            androidx.recyclerview.widget.RecyclerView r14 = r13.f165129o
            if (r14 == 0) goto L_0x0155
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.mo10233c(r1)
            java.lang.Object[] r6 = r0.mo10232b()
            java.lang.String r7 = "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment"
            java.lang.String r8 = "dealResult"
            java.lang.String r9 = "(Ljava/util/ArrayList;)V"
            java.lang.String r10 = "Undefined"
            java.lang.String r11 = "scrollToPosition"
            java.lang.String r12 = "(I)V"
            r5 = r14
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r0.mo10231a(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r14.mo17115r1(r0)
            java.lang.String r6 = "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment"
            java.lang.String r7 = "dealResult"
            java.lang.String r8 = "(Ljava/util/ArrayList;)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "scrollToPosition"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x0155:
            return
        L_0x0156:
            androidx.recyclerview.widget.RecyclerView r14 = r13.f165129o
            if (r14 != 0) goto L_0x015b
            goto L_0x0167
        L_0x015b:
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            androidx.fragment.app.FragmentActivity r4 = r13.getActivity()
            r3.<init>(r4)
            r14.setLayoutManager(r3)
        L_0x0167:
            sk3.l0 r14 = r13.mo82059S()
            if (r14 == 0) goto L_0x0171
            nk3.h r1 = r14.mo88750d3()
        L_0x0171:
            r13.f165131q = r1
            if (r1 == 0) goto L_0x018b
            androidx.fragment.app.FragmentActivity r14 = r13.getActivity()
            gy3.C87412m.m108591d(r14)
            bl3.r$a r14 = r2.mo62443b(r14)
            androidx.lifecycle.i0 r14 = r14.mo75002a(r0)
            sk3.q0 r14 = (sk3.C64004q0) r14
            java.lang.String r14 = r14.f181449f
            r1.mo86725F4(r14)
        L_0x018b:
            androidx.recyclerview.widget.RecyclerView r14 = r13.f165129o
            if (r14 != 0) goto L_0x0190
            goto L_0x0195
        L_0x0190:
            nk3.h r0 = r13.f165131q
            r14.setAdapter(r0)
        L_0x0195:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment.mo82058R(java.util.ArrayList):void");
    }

    /* renamed from: S */
    public final C63994l0 mo82059S() {
        int i = this.f165127j;
        if (i == 1) {
            C39818r rVar = C39818r.f106831a;
            FragmentActivity activity = getActivity();
            C87412m.m108591d(activity);
            return (C63994l0) rVar.mo62443b(activity).mo75002a(C64034y.class);
        } else if (i == 2) {
            C39818r rVar2 = C39818r.f106831a;
            FragmentActivity activity2 = getActivity();
            C87412m.m108591d(activity2);
            return (C63994l0) rVar2.mo62443b(activity2).mo75002a(C77723g0.class);
        } else if (i == 3) {
            C39818r rVar3 = C39818r.f106831a;
            FragmentActivity activity3 = getActivity();
            C87412m.m108591d(activity3);
            return (C63994l0) rVar3.mo62443b(activity3).mo75002a(C63971c0.class);
        } else if (i == 4) {
            C39818r rVar4 = C39818r.f106831a;
            FragmentActivity activity4 = getActivity();
            C87412m.m108591d(activity4);
            return (C63994l0) rVar4.mo62443b(activity4).mo75002a(C63979f0.class);
        } else if (i != 5) {
            return null;
        } else {
            C39818r rVar5 = C39818r.f106831a;
            FragmentActivity activity5 = getActivity();
            C87412m.m108591d(activity5);
            return (C63994l0) rVar5.mo62443b(activity5).mo75002a(C64028w.class);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cvs;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LiveData<C62074i> liveData;
        C87412m.m108594g(layoutInflater, "inflater");
        Log.m105924i("MicroMsg.FTSMultiNormalResultFragment", "onCreateView >> resultType: " + this.f165127j);
        if (this.f165128n == null) {
            Log.m105924i("MicroMsg.FTSMultiNormalResultFragment", "onCreateView >> inflate view resultType: " + this.f165127j);
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            this.f165128n = onCreateView;
            LiveData<C62074i> liveData2 = null;
            RecyclerView recyclerView = onCreateView != null ? (RecyclerView) onCreateView.findViewById(C0966R.C0970id.f358329n10) : null;
            this.f165129o = recyclerView;
            if (recyclerView != null) {
                recyclerView.setOnTouchListener(new C6798a(this));
            }
            View view = this.f165128n;
            this.f165130p = view != null ? (TextView) view.findViewById(C0966R.C0970id.hgt) : null;
            C63994l0 S = mo82059S();
            if (((S == null || (liveData = S.f181420i) == null) ? null : liveData.getValue()) == C62074i.FINISH) {
                C63994l0 S2 = mo82059S();
                mo82058R(S2 != null ? S2.f181421j : null);
            }
            C63994l0 S3 = mo82059S();
            if (S3 != null) {
                liveData2 = S3.f181420i;
            }
            if (liveData2 != null) {
                liveData2.observe(this, new C62343b(this));
            }
        }
        return this.f165128n;
    }
}
