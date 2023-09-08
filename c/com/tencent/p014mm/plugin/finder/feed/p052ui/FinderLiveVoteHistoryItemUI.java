package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import kotlin.Metadata;
import nj3.C88989a;
import vs1.C15000n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryItemUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryItemUI */
public final class FinderLiveVoteHistoryItemUI extends MMFinderUI {

    /* renamed from: o */
    public C15000n f14596o;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryItemUI$a */
    public static final class C2983a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveVoteHistoryItemUI f14597d;

        public C2983a(FinderLiveVoteHistoryItemUI finderLiveVoteHistoryItemUI) {
            this.f14597d = finderLiveVoteHistoryItemUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14597d.finish();
            this.f14597d.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2493eh);
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.czq;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            android.content.res.Resources r11 = r10.getResources()
            r0 = 2131099650(0x7f060002, float:1.781166E38)
            int r11 = r11.getColor(r0)
            r10.setNavigationbarColor(r11)
            r10.setActionbarColor(r11)
            android.view.Window r0 = r10.getWindow()
            r0.setStatusBarColor(r11)
            r10.hideActionbarLine()
            java.lang.String r11 = ""
            r10.setMMTitle((java.lang.String) r11)
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryItemUI$a r0 = new com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryItemUI$a
            r0.<init>(r10)
            r10.setBackBtn(r0)
            r0 = 2131316590(0x7f094f6e, float:1.8251666E38)
            android.view.View r0 = r10.findViewById(r0)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r0
            vs1.n r1 = new vs1.n
            r1.<init>()
            r10.f14596o = r1
            te3.sa1 r1 = new te3.sa1
            r1.<init>()
            android.content.Intent r2 = r10.getIntent()
            java.lang.String r3 = "finderlivedetailparamvotinginfo"
            byte[] r2 = r2.getByteArrayExtra(r3)
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 != 0) goto L_0x0051
        L_0x004f:
            r1 = r4
            goto L_0x0061
        L_0x0051:
            r1.parseFrom(r2)     // Catch:{ Exception -> 0x0055 }
            goto L_0x0061
        L_0x0055:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r5] = r1
            java.lang.String r1 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r11, r2)
            goto L_0x004f
        L_0x0061:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r1 == 0) goto L_0x008c
            java.util.LinkedList<te3.yv> r6 = r1.f141390f
            if (r6 == 0) goto L_0x008c
            java.util.Iterator r6 = r6.iterator()
        L_0x0070:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x008c
            java.lang.Object r7 = r6.next()
            te3.yv r7 = (te3.C52172yv) r7
            vs1.n$b r8 = new vs1.n$b
            java.lang.String r9 = r7.f145528e
            if (r9 != 0) goto L_0x0083
            r9 = r11
        L_0x0083:
            int r7 = r7.f145530g
            r8.<init>(r9, r7)
            r2.add(r8)
            goto L_0x0070
        L_0x008c:
            androidx.recyclerview.widget.LinearLayoutManager r11 = new androidx.recyclerview.widget.LinearLayoutManager
            r11.<init>(r10)
            r0.setLayoutManager(r11)
            vs1.n r11 = r10.f14596o
            r0.setAdapter(r11)
            vs1.n r11 = r10.f14596o
            if (r11 == 0) goto L_0x00aa
            java.util.ArrayList<vs1.n$b> r0 = r11.f41115d
            r0.clear()
            java.util.ArrayList<vs1.n$b> r0 = r11.f41115d
            r0.addAll(r2)
            r11.notifyDataSetChanged()
        L_0x00aa:
            r11 = 2131316596(0x7f094f74, float:1.8251678E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r1 == 0) goto L_0x00b8
            java.lang.String r0 = r1.f141400s
            goto L_0x00b9
        L_0x00b8:
            r0 = r4
        L_0x00b9:
            if (r0 == 0) goto L_0x00c4
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r0 = 0
            goto L_0x00c5
        L_0x00c4:
            r0 = 1
        L_0x00c5:
            if (r0 == 0) goto L_0x00d7
            androidx.appcompat.app.AppCompatActivity r0 = r10.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131829029(0x7f112125, float:1.9291016E38)
            java.lang.String r0 = r0.getString(r2)
            goto L_0x00f0
        L_0x00d7:
            androidx.appcompat.app.AppCompatActivity r0 = r10.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131829028(0x7f112124, float:1.9291014E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            if (r1 == 0) goto L_0x00e9
            java.lang.String r7 = r1.f141400s
            goto L_0x00ea
        L_0x00e9:
            r7 = r4
        L_0x00ea:
            r6[r5] = r7
            java.lang.String r0 = r0.getString(r2, r6)
        L_0x00f0:
            r11.setText(r0)
            r11 = 2131316592(0x7f094f70, float:1.825167E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            if (r1 == 0) goto L_0x0101
            int r0 = r1.f141394j
            goto L_0x0102
        L_0x0101:
            r0 = 0
        L_0x0102:
            r2 = 8
            if (r0 <= 0) goto L_0x012d
            if (r1 == 0) goto L_0x010b
            int r11 = r1.f141394j
            goto L_0x010c
        L_0x010b:
            r11 = 0
        L_0x010c:
            long r6 = (long) r11
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            r11 = 2131316591(0x7f094f6f, float:1.8251668E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            androidx.appcompat.app.AppCompatActivity r0 = r10.getContext()
            r8 = 2131829036(0x7f11212c, float:1.929103E38)
            java.lang.String r0 = r0.getString(r8)
            java.lang.String r0 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85114g(r0, r6)
            r11.setText(r0)
            goto L_0x0130
        L_0x012d:
            r11.setVisibility(r2)
        L_0x0130:
            r11 = 2131316601(0x7f094f79, float:1.8251688E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            if (r1 == 0) goto L_0x013e
            int r0 = r1.f141395n
            goto L_0x013f
        L_0x013e:
            r0 = 0
        L_0x013f:
            if (r0 <= 0) goto L_0x0194
            r11 = 2131316600(0x7f094f78, float:1.8251686E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r1 == 0) goto L_0x0153
            int r0 = r1.f141392h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0154
        L_0x0153:
            r0 = r4
        L_0x0154:
            r6 = 4
            if (r0 != 0) goto L_0x0158
            goto L_0x0171
        L_0x0158:
            int r0 = r0.intValue()
            if (r0 != r6) goto L_0x0171
            androidx.appcompat.app.AppCompatActivity r0 = r10.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r6 = 2131829033(0x7f112129, float:1.9291024E38)
            java.lang.String r0 = r0.getString(r6)
            r11.setText(r0)
            goto L_0x0197
        L_0x0171:
            androidx.appcompat.app.AppCompatActivity r0 = r10.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r6 = 2131829040(0x7f112130, float:1.9291038E38)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            if (r1 == 0) goto L_0x0183
            int r8 = r1.f141395n
            goto L_0x0184
        L_0x0183:
            r8 = 0
        L_0x0184:
            int r8 = r8 / 60
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7[r5] = r8
            java.lang.String r0 = r0.getString(r6, r7)
            r11.setText(r0)
            goto L_0x0197
        L_0x0194:
            r11.setVisibility(r2)
        L_0x0197:
            r11 = 2131316594(0x7f094f72, float:1.8251674E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            if (r1 == 0) goto L_0x01a5
            java.lang.String r0 = r1.f141389e
            goto L_0x01a6
        L_0x01a5:
            r0 = r4
        L_0x01a6:
            if (r0 == 0) goto L_0x01b0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01af
            goto L_0x01b0
        L_0x01af:
            r3 = 0
        L_0x01b0:
            if (r3 != 0) goto L_0x01c7
            r11 = 2131316598(0x7f094f76, float:1.8251682E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r1 == 0) goto L_0x01bf
            java.lang.String r4 = r1.f141389e
        L_0x01bf:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r11.setText(r0)
            goto L_0x01ca
        L_0x01c7:
            r11.setVisibility(r2)
        L_0x01ca:
            r11 = 2131316589(0x7f094f6d, float:1.8251664E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            if (r1 == 0) goto L_0x01dd
            java.util.LinkedList<te3.yv> r0 = r1.f141390f
            if (r0 == 0) goto L_0x01dd
            int r5 = r0.size()
        L_0x01dd:
            if (r5 > 0) goto L_0x01e2
            r11.setVisibility(r2)
        L_0x01e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVoteHistoryItemUI.onCreate(android.os.Bundle):void");
    }
}
