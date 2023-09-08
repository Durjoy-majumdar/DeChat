package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C88989a;
import nr3.C89059e;
import ob0.C89132b;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C50621o11;
import te3.C50934qa1;
import te3.C51215sa1;
import vs1.C14997l;
import ws1.C15593c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI */
public final class FinderLiveVoteHistoryUI extends MMFinderUI {

    /* renamed from: o */
    public C14997l f14598o;

    /* renamed from: p */
    public String f14599p;

    /* renamed from: q */
    public int f14600q;

    /* renamed from: r */
    public C89349b f14601r;

    /* renamed from: s */
    public C50934qa1 f14602s;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI$a */
    public static final class C2984a extends C87413o implements C32226l<C51215sa1, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveVoteHistoryUI f14603d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2984a(FinderLiveVoteHistoryUI finderLiveVoteHistoryUI) {
            super(1);
            this.f14603d = finderLiveVoteHistoryUI;
        }

        public Object invoke(Object obj) {
            C51215sa1 sa12 = (C51215sa1) obj;
            C87412m.m108594g(sa12, "cfg");
            Intent intent = new Intent();
            intent.setClass(this.f14603d.getContext(), FinderLiveVoteHistoryItemUI.class);
            intent.putExtra("finderlivedetailparamvotinginfo", sa12.toByteArray());
            AppCompatActivity context = this.f14603d.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AppCompatActivity appCompatActivity = context;
            C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI$onCreate$1$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveVotingInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI$onCreate$1$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveVotingInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI$b */
    public static final class C2985b extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveVoteHistoryUI f14604d;

        /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI$b$a */
        public static final class C2986a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ FinderLiveVoteHistoryUI f14605a;

            public C2986a(FinderLiveVoteHistoryUI finderLiveVoteHistoryUI) {
                this.f14605a = finderLiveVoteHistoryUI;
            }

            public Object call(Object obj) {
                LinkedList<C51215sa1> linkedList;
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    FinderLiveVoteHistoryUI finderLiveVoteHistoryUI = this.f14605a;
                    C50621o11 o112 = (C50621o11) cVar.f256796d;
                    finderLiveVoteHistoryUI.f14601r = o112.f138901e;
                    finderLiveVoteHistoryUI.f14600q = o112.f138902f;
                    C14997l lVar = finderLiveVoteHistoryUI.f14598o;
                    if (!(lVar == null || (linkedList = o112.f138900d) == null)) {
                        lVar.f41109d.addAll(linkedList);
                        lVar.notifyDataSetChanged();
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C2985b(FinderLiveVoteHistoryUI finderLiveVoteHistoryUI) {
            this.f14604d = finderLiveVoteHistoryUI;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI$onCreate$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI$onCreate$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI$onCreate$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (!recyclerView.canScrollVertically(1) && this.f14604d.f14600q == 1) {
                FinderLiveVoteHistoryUI finderLiveVoteHistoryUI = this.f14604d;
                C89059e i3 = new C15593c(finderLiveVoteHistoryUI.f14599p, finderLiveVoteHistoryUI.f14601r).mo9225i();
                i3.mo123420E(new C2986a(this.f14604d));
                FinderLiveVoteHistoryUI finderLiveVoteHistoryUI2 = this.f14604d;
                C87412m.m108592e(finderLiveVoteHistoryUI2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                i3.mo11397F(finderLiveVoteHistoryUI2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI$onCreate$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI$c */
    public static final class C2987c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveVoteHistoryUI f14606d;

        public C2987c(FinderLiveVoteHistoryUI finderLiveVoteHistoryUI) {
            this.f14606d = finderLiveVoteHistoryUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14606d.finish();
            this.f14606d.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2493eh);
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.czr;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            android.content.res.Resources r8 = r7.getResources()
            r0 = 2131099650(0x7f060002, float:1.781166E38)
            int r8 = r8.getColor(r0)
            r7.setNavigationbarColor(r8)
            r7.setActionbarColor(r8)
            android.view.Window r0 = r7.getWindow()
            r0.setStatusBarColor(r8)
            android.content.res.Resources r8 = r7.getResources()
            r0 = 2131829035(0x7f11212b, float:1.9291028E38)
            java.lang.String r8 = r8.getString(r0)
            r7.setMMTitle((java.lang.String) r8)
            android.content.res.Resources r8 = r7.getResources()
            r0 = 2131099800(0x7f060098, float:1.7811963E38)
            int r8 = r8.getColor(r0)
            r7.setMMTitleColor(r8)
            r7.hideActionbarLine()
            android.content.res.Resources r8 = r7.getResources()
            r0 = 2131099648(0x7f060000, float:1.7811655E38)
            int r8 = r8.getColor(r0)
            r7.setActionbarColor(r8)
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI$c r8 = new com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI$c
            r8.<init>(r7)
            r7.setBackBtn(r8)
            r8 = 2131316603(0x7f094f7b, float:1.8251692E38)
            android.view.View r8 = r7.findViewById(r8)
            com.tencent.mm.view.recyclerview.WxRecyclerView r8 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r8
            r0 = 2131316587(0x7f094f6b, float:1.825166E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            androidx.appcompat.app.AppCompatActivity r2 = r7.getContext()
            r1.<init>(r2)
            r8.setLayoutManager(r1)
            vs1.l r1 = new vs1.l
            r1.<init>()
            r7.f14598o = r1
            r8.setAdapter(r1)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r2 = "finderlivedetailparamusername"
            java.lang.String r1 = r1.getStringExtra(r2)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0086
            r1 = r2
        L_0x0086:
            r7.f14599p = r1
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r3 = "finderlivehistoryparamvotinginfo"
            byte[] r1 = r1.getByteArrayExtra(r3)
            r3 = 8
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x0104
            te3.qa1 r6 = new te3.qa1
            r6.<init>()
            r6.parseFrom(r1)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00ae
        L_0x00a1:
            r1 = move-exception
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r5] = r1
            java.lang.String r1 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r2, r6)
            r6 = r4
        L_0x00ae:
            r7.f14602s = r6
            if (r6 == 0) goto L_0x00b5
            pe3.b r1 = r6.f140206e
            goto L_0x00b6
        L_0x00b5:
            r1 = r4
        L_0x00b6:
            r7.f14601r = r1
            if (r6 == 0) goto L_0x00bd
            int r1 = r6.f140207f
            goto L_0x00be
        L_0x00bd:
            r1 = 0
        L_0x00be:
            r7.f14600q = r1
            if (r6 == 0) goto L_0x00cb
            java.util.LinkedList<te3.sa1> r1 = r6.f140205d
            if (r1 == 0) goto L_0x00cb
            int r1 = r1.size()
            goto L_0x00cc
        L_0x00cb:
            r1 = 0
        L_0x00cc:
            if (r1 > 0) goto L_0x00d5
            r8.setVisibility(r3)
            r0.setVisibility(r5)
            goto L_0x0102
        L_0x00d5:
            vs1.l r1 = r7.f14598o
            if (r1 == 0) goto L_0x00ee
            te3.qa1 r2 = r7.f14602s
            if (r2 == 0) goto L_0x00df
            java.util.LinkedList<te3.sa1> r4 = r2.f140205d
        L_0x00df:
            java.util.ArrayList<te3.sa1> r2 = r1.f41109d
            r2.clear()
            if (r4 == 0) goto L_0x00ee
            java.util.ArrayList<te3.sa1> r2 = r1.f41109d
            r2.addAll(r4)
            r1.notifyDataSetChanged()
        L_0x00ee:
            vs1.l r1 = r7.f14598o
            if (r1 != 0) goto L_0x00f3
            goto L_0x00fa
        L_0x00f3:
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI$a r2 = new com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI$a
            r2.<init>(r7)
            r1.f41110e = r2
        L_0x00fa:
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI$b r1 = new com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI$b
            r1.<init>(r7)
            r8.mo17043c(r1)
        L_0x0102:
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0104:
            if (r4 != 0) goto L_0x010c
            r8.setVisibility(r3)
            r0.setVisibility(r5)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVoteHistoryUI.onCreate(android.os.Bundle):void");
    }
}
