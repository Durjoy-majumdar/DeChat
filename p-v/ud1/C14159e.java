package ud1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC;
import gy3.C8479f0;
import java.util.List;
import te3.C49018cl1;

/* renamed from: ud1.e */
public final class C14159e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderMusicTopicHeaderUIC f39595d;

    /* renamed from: e */
    public final /* synthetic */ List<C49018cl1> f39596e;

    /* renamed from: f */
    public final /* synthetic */ int f39597f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<String> f39598g;

    public C14159e(FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, List<? extends C49018cl1> list, int i, C8479f0<String> f0Var) {
        this.f39595d = finderMusicTopicHeaderUIC;
        this.f39596e = list;
        this.f39597f = i;
        this.f39598g = f0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0097, code lost:
        r6 = (r6 = r6.f141636z).f144602f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r11)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initArtist$4"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r10
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC r11 = r10.f39595d
            java.util.List<te3.cl1> r0 = r10.f39596e
            com.google.android.material.bottomsheet.a r1 = r11.f12472g
            r2 = 0
            if (r1 != 0) goto L_0x010c
            android.app.Activity r1 = r11.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r3 = 2131494452(0x7f0c0634, float:1.8612413E38)
            r4 = 0
            android.view.View r1 = r1.inflate(r3, r2, r4)
            com.google.android.material.bottomsheet.a r3 = new com.google.android.material.bottomsheet.a
            android.app.Activity r5 = r11.getContext()
            r6 = 2131886332(0x7f1200fc, float:1.940724E38)
            r3.<init>(r5, r6)
            r11.f12472g = r3
            r3.setContentView((android.view.View) r1)
            com.google.android.material.bottomsheet.a r3 = r11.f12472g
            if (r3 == 0) goto L_0x0055
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L_0x0055
            r5 = 1053609165(0x3ecccccd, float:0.4)
            r3.setDimAmount(r5)
        L_0x0055:
            com.google.android.material.bottomsheet.a r3 = r11.f12472g
            if (r3 == 0) goto L_0x006b
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L_0x006b
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L_0x006b
            r5 = 2131234749(0x7f080fbd, float:1.8085673E38)
            r3.setBackgroundResource(r5)
        L_0x006b:
            com.google.android.material.bottomsheet.a r3 = r11.f12472g
            if (r3 == 0) goto L_0x0077
            ud1.q r5 = new ud1.q
            r5.<init>(r11)
            r3.setOnDismissListener(r5)
        L_0x0077:
            r3 = 2131302637(0x7f0918ed, float:1.8223366E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r5 = 1
            if (r3 == 0) goto L_0x00bb
            android.text.TextPaint r6 = r3.getPaint()
            r7 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r6, r7)
            T r6 = r11.f33564d
            te3.sn1 r6 = (te3.C51270sn1) r6
            if (r6 == 0) goto L_0x00a0
            te3.xd1 r6 = r6.f141636z
            if (r6 == 0) goto L_0x00a0
            java.util.LinkedList<te3.cl1> r6 = r6.f144602f
            if (r6 == 0) goto L_0x00a0
            int r6 = r6.size()
            goto L_0x00a1
        L_0x00a0:
            r6 = 0
        L_0x00a1:
            android.content.Context r7 = r3.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131829258(0x7f11220a, float:1.929148E38)
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9[r4] = r6
            java.lang.String r6 = r7.getString(r8, r9)
            r3.setText(r6)
        L_0x00bb:
            r3 = 2131302634(0x7f0918ea, float:1.822336E38)
            android.view.View r3 = r1.findViewById(r3)
            if (r3 == 0) goto L_0x00cc
            ud1.r r6 = new ud1.r
            r6.<init>(r11)
            r3.setOnClickListener(r6)
        L_0x00cc:
            r3 = 2131302636(0x7f0918ec, float:1.8223364E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r1
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            androidx.appcompat.app.AppCompatActivity r6 = r11.getActivity()
            r3.<init>(r6, r5, r4)
            r1.setLayoutManager(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00ea:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00ff
            java.lang.Object r5 = r0.next()
            te3.cl1 r5 = (te3.C49018cl1) r5
            qd1.a r6 = new qd1.a
            r6.<init>(r5)
            r3.add(r6)
            goto L_0x00ea
        L_0x00ff:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$buildItemCoverts$1 r5 = new com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$buildItemCoverts$1
            r5.<init>()
            r0.<init>(r5, r3, r4)
            r1.setAdapter(r0)
        L_0x010c:
            com.google.android.material.bottomsheet.a r11 = r11.f12472g
            if (r11 == 0) goto L_0x0113
            r11.show()
        L_0x0113:
            vd1.a r3 = vd1.C14429a.f40033a
            com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC r11 = r10.f39595d
            android.app.Activity r4 = r11.getContext()
            r5 = 1
            com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC r11 = r10.f39595d
            T r11 = r11.f33564d
            te3.sn1 r11 = (te3.C51270sn1) r11
            if (r11 == 0) goto L_0x0126
            te3.xd1 r2 = r11.f141636z
        L_0x0126:
            r6 = r2
            int r7 = r10.f39597f
            gy3.f0<java.lang.String> r11 = r10.f39598g
            T r11 = r11.f27484d
            r8 = r11
            java.lang.String r8 = (java.lang.String) r8
            r3.mo13714b(r4, r5, r6, r7, r8)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initArtist$4"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r10, r11, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ud1.C14159e.onClick(android.view.View):void");
    }
}
