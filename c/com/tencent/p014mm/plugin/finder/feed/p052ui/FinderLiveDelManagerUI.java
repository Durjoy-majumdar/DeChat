package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Metadata;
import qk1.C63252r0;
import te3.C51934x71;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveDelManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI */
public final class FinderLiveDelManagerUI extends MMActivity {

    /* renamed from: j */
    public static final /* synthetic */ int f158985j = 0;

    /* renamed from: d */
    public final C63252r0 f158986d = new C63252r0();

    /* renamed from: e */
    public MMEditText f158987e;

    /* renamed from: f */
    public TextView f158988f;

    /* renamed from: g */
    public RecyclerView f158989g;

    /* renamed from: h */
    public FinderLiveMemebrProfileWidget f158990h;

    /* renamed from: i */
    public final LinkedList<C51934x71> f158991i = new LinkedList<>();

    /* renamed from: H7 */
    public final void mo77429H7() {
        int size = ((ArrayList) this.f158986d.mo88155F4()).size();
        if (size > 0) {
            enableOptionMenu(1, true);
            updateOptionMenuText(1, getString(C0966R.string.f360560mf2, new Object[]{Integer.valueOf(size)}));
            return;
        }
        enableOptionMenu(1, false);
        updateOptionMenuText(1, getString(C0966R.string.f360559mf1));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359715cv2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0140, code lost:
        r6 = r3.f134919d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            r13 = 2131300757(0x7f091195, float:1.8219553E38)
            android.view.View r13 = r12.findViewById(r13)
            com.tencent.mm.ui.widget.MMEditText r13 = (com.tencent.p014mm.p136ui.widget.MMEditText) r13
            r12.f158987e = r13
            r13 = 2131300758(0x7f091196, float:1.8219555E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r12.f158988f = r13
            r13 = 2131300765(0x7f09119d, float:1.8219569E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13 = 2131300763(0x7f09119b, float:1.8219565E38)
            android.view.View r13 = r12.findViewById(r13)
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            r12.f158989g = r13
            r13 = 2131827289(0x7f111a59, float:1.9287486E38)
            java.lang.String r2 = r12.getString(r13)
            vf1.i2 r3 = new vf1.i2
            r3.<init>(r12)
            com.tencent.mm.ui.MMActivityController$r r5 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.GREEN
            r1 = 1
            r9 = 0
            r4 = 0
            r0 = r12
            r0.addTextOptionMenu(r1, r2, r3, r4, r5)
            r13 = 2131827291(0x7f111a5b, float:1.928749E38)
            java.lang.String r13 = r12.getString(r13)
            r12.setMMTitle((java.lang.String) r13)
            vf1.j2 r13 = new vf1.j2
            r13.<init>(r12)
            r12.setBackBtn(r13)
            r13 = 1
            r0 = 0
            r12.enableOptionMenu(r13, r0)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget r13 = new com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget
            androidx.appcompat.app.AppCompatActivity r7 = r12.getContext()
            java.lang.String r1 = "context"
            gy3.C87412m.m108593f(r7, r1)
            r8 = 0
            r10 = 6
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r12.f158990h = r13
            androidx.recyclerview.widget.RecyclerView r13 = r12.f158989g
            if (r13 != 0) goto L_0x0072
            goto L_0x0077
        L_0x0072:
            qk1.r0 r1 = r12.f158986d
            r13.setAdapter(r1)
        L_0x0077:
            androidx.recyclerview.widget.LinearLayoutManager r13 = new androidx.recyclerview.widget.LinearLayoutManager
            r13.<init>(r12)
            androidx.recyclerview.widget.RecyclerView r1 = r12.f158989g
            if (r1 != 0) goto L_0x0081
            goto L_0x0084
        L_0x0081:
            r1.setLayoutManager(r13)
        L_0x0084:
            qk1.r0 r13 = r12.f158986d
            vf1.k2 r1 = new vf1.k2
            r1.<init>(r12)
            r13.f179491f = r1
            qk1.r0 r13 = r12.f158986d
            vf1.l2 r1 = new vf1.l2
            r1.<init>(r12)
            r13.f179492g = r1
            qk1.r0 r13 = r12.f158986d
            vf1.m2 r1 = new vf1.m2
            r1.<init>(r12)
            r13.f179493h = r1
            com.tencent.mm.ui.widget.MMEditText r13 = r12.f158987e
            if (r13 == 0) goto L_0x00ab
            vf1.n2 r1 = new vf1.n2
            r1.<init>(r12)
            r13.addTextChangedListener(r1)
        L_0x00ab:
            com.tencent.mm.ui.widget.MMEditText r13 = r12.f158987e
            if (r13 == 0) goto L_0x00b7
            vf1.o2 r1 = new vf1.o2
            r1.<init>(r12)
            r13.setOnFocusChangeListener(r1)
        L_0x00b7:
            com.tencent.mm.ui.widget.MMEditText r13 = r12.f158987e
            if (r13 == 0) goto L_0x00c3
            vf1.p2 r1 = new vf1.p2
            r1.<init>(r12)
            r13.setOnEditorActionListener(r1)
        L_0x00c3:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget r13 = r12.f158990h
            if (r13 != 0) goto L_0x00c8
            goto L_0x00cf
        L_0x00c8:
            vf1.q2 r1 = new vf1.q2
            r1.<init>(r12)
            r13.f15409n = r1
        L_0x00cf:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget r13 = r12.f158990h
            if (r13 != 0) goto L_0x00d4
            goto L_0x00d8
        L_0x00d4:
            vf1.e2 r1 = vf1.C14754e2.f40728d
            r13.f15408j = r1
        L_0x00d8:
            if (r13 != 0) goto L_0x00db
            goto L_0x00e2
        L_0x00db:
            vf1.f2 r1 = new vf1.f2
            r1.<init>(r12)
            r13.f15410o = r1
        L_0x00e2:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget r13 = r12.f158990h
            if (r13 != 0) goto L_0x00e7
            goto L_0x00eb
        L_0x00e7:
            vf1.g2 r1 = vf1.C14765g2.f40741d
            r13.f15411p = r1
        L_0x00eb:
            if (r13 != 0) goto L_0x00ee
            goto L_0x00f5
        L_0x00ee:
            vf1.h2 r1 = new vf1.h2
            r1.<init>(r12)
            r13.f15412q = r1
        L_0x00f5:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget r13 = r12.f158990h
            if (r13 == 0) goto L_0x00fc
            r13.mo3432q()
        L_0x00fc:
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r1 = "selectcontactitem"
            byte[] r13 = r13.getByteArrayExtra(r1)
            if (r13 == 0) goto L_0x0192
            te3.d71 r1 = new te3.d71
            r1.<init>()
            r1.parseFrom(r13)
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            java.util.LinkedList<te3.x71> r2 = r1.f132161d
            java.lang.String r3 = "this.room_manager_list"
            gy3.C87412m.m108593f(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0122:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0154
            java.lang.Object r3 = r2.next()
            te3.x71 r3 = (te3.C51934x71) r3
            te3.s21 r4 = new te3.s21
            r4.<init>()
            java.lang.String r5 = r3.f144501d
            r4.f185309d = r5
            int r5 = r3.f144502e
            r4.f185311f = r5
            te3.hx0 r3 = r3.f144503f
            r5 = 0
            if (r3 == 0) goto L_0x0147
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r3.f134919d
            if (r6 == 0) goto L_0x0147
            java.lang.String r6 = r6.headUrl
            goto L_0x0148
        L_0x0147:
            r6 = r5
        L_0x0148:
            r4.f185313h = r6
            if (r3 == 0) goto L_0x014e
            java.lang.String r5 = r3.f134925j
        L_0x014e:
            r4.f185310e = r5
            r13.add(r4)
            goto L_0x0122
        L_0x0154:
            java.util.LinkedList<te3.x71> r2 = r12.f158991i
            r2.clear()
            java.util.LinkedList<te3.x71> r2 = r12.f158991i
            java.util.LinkedList<te3.x71> r1 = r1.f132161d
            r2.addAll(r1)
            qk1.r0 r1 = r12.f158986d
            r1.getClass()
            java.util.ArrayList<qk1.r0$b> r2 = r1.f179490e
            r2.clear()
            java.util.Iterator r13 = r13.iterator()
        L_0x016e:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x018f
            java.lang.Object r2 = r13.next()
            te3.s21 r2 = (te3.C64693s21) r2
            java.util.ArrayList<qk1.r0$b> r3 = r1.f179490e
            qk1.r0$b r4 = new qk1.r0$b
            r4.<init>(r2, r0)
            r3.add(r4)
            java.util.ArrayList<qk1.r0$b> r3 = r1.f179489d
            qk1.r0$b r4 = new qk1.r0$b
            r4.<init>(r2, r0)
            r3.add(r4)
            goto L_0x016e
        L_0x018f:
            r1.notifyDataSetChanged()
        L_0x0192:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveDelManagerUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget = this.f158990h;
        if (finderLiveMemebrProfileWidget != null) {
            finderLiveMemebrProfileWidget.mo3433r();
        }
    }
}
