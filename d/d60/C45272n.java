package d60;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import i60.C46169a;
import i60.C46170d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13598b0;
import sx3.C64175a0;
import y50.C53496k;
import z04.C112550d0;
import z50.C53746s;

/* renamed from: d60.n */
public final class C45272n extends C58121a implements C11385n {

    /* renamed from: f */
    public final C58124b f122633f;

    /* renamed from: g */
    public final ViewGroup f122634g;

    /* renamed from: h */
    public final TextView f122635h;

    /* renamed from: i */
    public final RecyclerView f122636i;

    /* renamed from: j */
    public final C46170d f122637j;

    /* renamed from: n */
    public final long f122638n = 3000;

    /* renamed from: o */
    public int f122639o;

    /* renamed from: p */
    public final C32226l<String, C13598b0> f122640p;

    /* renamed from: q */
    public final C32227p<Boolean, String, C13598b0> f122641q;

    /* renamed from: d60.n$a */
    public static final class C45273a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C45272n f122642d;

        public C45273a(C45272n nVar) {
            this.f122642d = nVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveCommentPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f122642d.f122634g.setVisibility(8);
            RecyclerView recyclerView = this.f122642d.f122636i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(RoomLiveService.f157195f.size() - 1));
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/live/plugin/LiveCommentPlugin$1", "onClick", "(Landroid/view/View;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/live/plugin/LiveCommentPlugin$1", "onClick", "(Landroid/view/View;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveCommentPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.n$b */
    public static final class C45274b extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C45272n f122643d;

        public C45274b(C45272n nVar) {
            this.f122643d = nVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveCommentPlugin$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveCommentPlugin$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveCommentPlugin$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            RecyclerView.LayoutManager layoutManager = this.f122643d.f122636i.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int E = ((LinearLayoutManager) layoutManager).mo16959E();
            C45272n nVar = this.f122643d;
            int i3 = nVar.f122639o;
            if (E >= i3) {
                i3 = E;
            }
            nVar.f122639o = i3;
            boolean z = true;
            if (E != nVar.f122637j.getItemCount() - 1) {
                z = false;
            }
            if (z) {
                this.f122643d.f122634g.setVisibility(8);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveCommentPlugin$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: d60.n$c */
    public static final class C45275c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C45272n f122644d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45275c(C45272n nVar) {
            super(1);
            this.f122644d = nVar;
        }

        public Object invoke(Object obj) {
            String str;
            String str2 = (String) obj;
            C87412m.m108594g(str2, "wording");
            Log.m105924i("MicroMsg.LiveCommentPlugin", "receive BanCommenrCallback, wording:" + str2);
            if (!(str2.length() == 0)) {
                int E = C112550d0.m153769E(str2, "：", 0, false, 6, (Object) null);
                if (E > 0) {
                    str = str2.substring(0, E);
                    C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    str2 = str2.substring(E + 1, str2.length());
                    C87412m.m108593f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str = "";
                }
                C61926c.m72668M(new C45282q(this.f122644d, str, str2));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.n$d */
    public static final class C45276d extends C87413o implements C32227p<Boolean, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C45272n f122645d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45276d(C45272n nVar) {
            super(2);
            this.f122645d = nVar;
        }

        public Object invoke(Object obj, Object obj2) {
            String str;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            String str2 = (String) obj2;
            C87412m.m108594g(str2, "callingUser");
            Log.m105924i("MicroMsg.LiveCommentPlugin", "receive linkMicCallback，linked:" + booleanValue + ", callingUser:" + str2);
            if (!Util.isNullOrNil(str2)) {
                String string = this.f122645d.f122636i.getContext().getResources().getString(C0966R.string.f360962ga1);
                C87412m.m108593f(string, "commentListView.context.…live_sys_msg_system_name)");
                if (booleanValue) {
                    String string2 = this.f122645d.f122636i.getContext().getResources().getString(C0966R.string.f360961ga0);
                    C87412m.m108593f(string2, "commentListView.context.…ng.live_sys_msg_link_mic)");
                    str = String.format(string2, Arrays.copyOf(new Object[]{str2}, 1));
                    C87412m.m108593f(str, "format(format, *args)");
                } else {
                    String string3 = this.f122645d.f122636i.getContext().getResources().getString(C0966R.string.g_z);
                    C87412m.m108593f(string3, "commentListView.context.…e_sys_msg_close_link_mic)");
                    str = String.format(string3, Arrays.copyOf(new Object[]{str2}, 1));
                    C87412m.m108593f(str, "format(format, *args)");
                }
                C61926c.m72668M(new C45283r(string, str, this.f122645d));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.n$e */
    public static final class C45277e extends C87413o implements C32226l<C46169a, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C117747y f122646d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45277e(C117747y yVar) {
            super(1);
            this.f122646d = yVar;
        }

        public Object invoke(Object obj) {
            C46169a aVar = (C46169a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(Util.isEqual((Object) aVar.f124459c, (Object) ((C53746s) this.f122646d).f150879d) && Util.isEqual(aVar.f124457a, C75592q0.m90789s()));
        }
    }

    /* renamed from: d60.n$f */
    public static final class C45278f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C45272n f122647d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45278f(C45272n nVar) {
            super(0);
            this.f122647d = nVar;
        }

        public Object invoke() {
            C46170d dVar = this.f122647d.f122637j;
            ArrayList<C46169a> arrayList = RoomLiveService.f157195f;
            dVar.getClass();
            C87412m.m108594g(arrayList, "commentList");
            dVar.f124462d.clear();
            dVar.f124462d.addAll(arrayList);
            this.f122647d.f122637j.notifyDataSetChanged();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.n$g */
    public static final class C45279g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C45272n f122648d;

        public C45279g(C45272n nVar) {
            this.f122648d = nVar;
        }

        public final void run() {
            C45272n nVar = this.f122648d;
            RecyclerView recyclerView = nVar.f122636i;
            int itemCount = nVar.f122637j.getItemCount() - 1;
            if (itemCount < 0) {
                itemCount = 0;
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(itemCount));
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/live/plugin/LiveCommentPlugin$updateMessages$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/live/plugin/LiveCommentPlugin$updateMessages$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45272n(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statueMonitor");
        this.f122633f = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.fsx);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.l…e_comment_list_tip_group)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        this.f122634g = viewGroup2;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.fsy);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.live_comment_list_tip_tv)");
        this.f122635h = (TextView) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.fsw);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.live_comment_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        this.f122636i = recyclerView;
        C46170d dVar = new C46170d();
        this.f122637j = dVar;
        C45275c cVar = new C45275c(this);
        this.f122640p = cVar;
        C45276d dVar2 = new C45276d(this);
        this.f122641q = dVar2;
        recyclerView.setLayoutManager(new LinearLayoutManager(viewGroup.getContext()));
        recyclerView.setAdapter(dVar);
        C53496k kVar = C53496k.f150436a;
        C53496k.f150439d.put(mo82894j0(), cVar);
        C53496k.f150440e.put(mo82894j0(), dVar2);
        viewGroup2.setOnClickListener(new C45273a(this));
        recyclerView.mo17043c(new C45274b(this));
        if (mo82893g0()) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).width = (C75044y4.m89990b(viewGroup.getContext()).x * 35) / 100;
        }
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
        this.f122636i.setVisibility(0);
    }

    /* renamed from: h0 */
    public void mo8378h0(boolean z, int i) {
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        C86709a0.m107529k().f251779b.mo123455a(904, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if ((yVar instanceof C53746s) && i == 4 && i2 == -100048) {
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            C64175a0.m75512t(RoomLiveService.f157195f, new C45277e(yVar));
            C61926c.m72668M(new C45278f(this));
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (!(ordinal == 5 || ordinal == 6)) {
            if (ordinal == 7) {
                mo10792g(0);
                return;
            } else if (!(ordinal == 27 || ordinal == 28)) {
                if (ordinal == 33) {
                    RoomLiveService.f157175G++;
                    this.f122634g.setVisibility(8);
                    RecyclerView recyclerView = this.f122636i;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(RoomLiveService.f157195f.size() - 1));
                    RecyclerView recyclerView2 = recyclerView;
                    C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/live/plugin/LiveCommentPlugin", "onMsgPosted", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                    recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(recyclerView2, "com/tencent/mm/live/plugin/LiveCommentPlugin", "onMsgPosted", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                    return;
                }
                return;
            }
        }
        mo10792g(8);
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        C86709a0.m107529k().f251779b.mo123470p(904, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093 A[SYNTHETIC] */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70807x0() {
        /*
            r10 = this;
            android.view.ViewGroup r0 = r10.f166287d
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0115
            com.tencent.mm.live.model.RoomLiveService r0 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            java.util.ArrayList<i60.a> r0 = com.tencent.p014mm.live.model.RoomLiveService.f157195f
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            if (r0 != 0) goto L_0x0115
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "liveMessageCallback msgListCount:"
            r0.append(r3)
            java.util.ArrayList<i60.a> r3 = com.tencent.p014mm.live.model.RoomLiveService.f157195f
            int r3 = r3.size()
            r0.append(r3)
            java.lang.String r3 = " readCount:"
            r0.append(r3)
            int r3 = r10.f122639o
            r0.append(r3)
            java.lang.String r3 = " enable_comment:"
            r0.append(r3)
            te3.ep2 r3 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            boolean r3 = r3.f133060q
            r0.append(r3)
            java.lang.String r3 = " msgFilterTime:"
            r0.append(r3)
            int r3 = com.tencent.p014mm.live.model.RoomLiveService.f157200k
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "MicroMsg.LiveCommentPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f122636i
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            java.lang.String r3 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            gy3.C87412m.m108592e(r0, r3)
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.mo16959E()
            i60.d r3 = r10.f122637j
            int r3 = r3.getItemCount()
            int r3 = r3 - r2
            if (r0 != r3) goto L_0x0074
            r0 = 1
            goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            java.util.ArrayList<i60.a> r3 = com.tencent.p014mm.live.model.RoomLiveService.f157195f
            int r3 = r3.size()
            int r4 = r10.f122639o
            int r3 = r3 - r4
            int r3 = r3 - r2
            te3.ep2 r4 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            boolean r4 = r4.f133060q
            if (r4 == 0) goto L_0x0088
            java.util.ArrayList<i60.a> r4 = com.tencent.p014mm.live.model.RoomLiveService.f157195f
            goto L_0x00b8
        L_0x0088:
            java.util.ArrayList<i60.a> r4 = com.tencent.p014mm.live.model.RoomLiveService.f157195f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0093:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00b7
            java.lang.Object r6 = r4.next()
            r7 = r6
            i60.a r7 = (i60.C46169a) r7
            int r8 = r7.f124460d
            r9 = 10001(0x2711, float:1.4014E-41)
            if (r8 != r9) goto L_0x00b0
            int r7 = r7.f124461e
            com.tencent.mm.live.model.RoomLiveService r8 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            int r8 = com.tencent.p014mm.live.model.RoomLiveService.f157200k
            if (r7 < r8) goto L_0x00b0
            r7 = 1
            goto L_0x00b1
        L_0x00b0:
            r7 = 0
        L_0x00b1:
            if (r7 == 0) goto L_0x0093
            r5.add(r6)
            goto L_0x0093
        L_0x00b7:
            r4 = r5
        L_0x00b8:
            d60.t r5 = new d60.t
            r5.<init>(r10, r4)
            androidx.recyclerview.widget.l$c r5 = androidx.recyclerview.widget.C54248l.m60949a(r5, r1)
            d60.s r6 = new d60.s
            r6.<init>(r10, r4)
            r5.mo75045a(r6)
            i60.d r4 = r10.f122637j
            int r4 = r4.getItemCount()
            if (r4 <= 0) goto L_0x0115
            if (r0 == 0) goto L_0x00de
            androidx.recyclerview.widget.RecyclerView r0 = r10.f122636i
            d60.n$g r1 = new d60.n$g
            r1.<init>(r10)
            r0.post(r1)
            goto L_0x0115
        L_0x00de:
            if (r3 <= 0) goto L_0x0115
            android.view.ViewGroup r0 = r10.f122634g
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.f122635h
            android.view.ViewGroup r4 = r10.f166287d
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131832086(0x7f112d16, float:1.9297216E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "root.context.resources.g…ing.live_new_comment_tip)"
            gy3.C87412m.m108593f(r4, r5)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r1] = r3
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r2)
            java.lang.String r1 = java.lang.String.format(r4, r1)
            java.lang.String r2 = "format(format, *args)"
            gy3.C87412m.m108593f(r1, r2)
            r0.setText(r1)
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d60.C45272n.mo70807x0():void");
    }
}
