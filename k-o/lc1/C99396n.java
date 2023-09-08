package lc1;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashMap;
import kg3.C76577a;
import p434ig.C98680m;
import p548hg.C98450d;
import p629ny.C76979h;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C101871zc0;

/* renamed from: lc1.n */
public class C99396n extends C99373c {

    /* renamed from: c */
    public final int f291459c;

    /* renamed from: lc1.n$a */
    public static class C99397a extends c$$e {

        /* renamed from: k */
        public ImageView f291460k;

        /* renamed from: l */
        public TextView f291461l;

        /* renamed from: m */
        public TextView f291462m;

        /* renamed from: n */
        public TextView f291463n;

        /* renamed from: o */
        public TextView f291464o;

        /* renamed from: p */
        public FrameLayout f291465p;

        /* renamed from: q */
        public View f291466q;

        /* renamed from: r */
        public View f291467r;

        /* renamed from: s */
        public FrameLayout[] f291468s = new FrameLayout[3];

        /* renamed from: t */
        public ImageView[] f291469t = new ImageView[3];

        /* renamed from: u */
        public ImageView[] f291470u = new ImageView[3];
    }

    public C99396n(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
        new HashMap();
        this.f291459c = C76577a.m92157h(favoriteImageServer.f269877a, C0966R.dimen.f3805ey);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: lc1.n$a} */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0280, code lost:
        if (r10 != false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0282, code lost:
        r12 = r14;
        r10 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo138840b(android.view.View r30, android.view.ViewGroup r31, pb1.C100755z r32) {
        /*
            r29 = this;
            r0 = r29
            r1 = r32
            android.content.Context r2 = r31.getContext()
            te3.kd0 r3 = r1.field_favProto
            java.util.LinkedList<te3.rc0> r3 = r3.f298618f
            r4 = 3
            r5 = 2
            r6 = 8
            r7 = 1
            r8 = 0
            if (r30 != 0) goto L_0x00dd
            lc1.n$a r9 = new lc1.n$a
            r9.<init>()
            r10 = 2131494370(0x7f0c05e2, float:1.8612246E38)
            r11 = 0
            android.view.View r2 = android.view.View.inflate(r2, r10, r11)
            r0.mo138843a(r2, r9, r1)
            r10 = 2131302150(0x7f091706, float:1.8222378E38)
            android.view.View r11 = r2.findViewById(r10)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r9.f291460k = r11
            r11 = 2131302219(0x7f09174b, float:1.8222518E38)
            android.view.View r11 = r2.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r9.f291461l = r11
            r11 = 2131302133(0x7f0916f5, float:1.8222344E38)
            android.view.View r11 = r2.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r9.f291462m = r11
            r11 = 2131302220(0x7f09174c, float:1.822252E38)
            android.view.View r11 = r2.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r9.f291463n = r11
            r11 = 2131302134(0x7f0916f6, float:1.8222346E38)
            android.view.View r11 = r2.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r9.f291464o = r11
            r11 = 2131302157(0x7f09170d, float:1.8222392E38)
            android.view.View r11 = r2.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r11 = 2131302156(0x7f09170c, float:1.822239E38)
            android.view.View r11 = r2.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r11 = 2131302153(0x7f091709, float:1.8222384E38)
            android.view.View r11 = r2.findViewById(r11)
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            r9.f291465p = r11
            r11 = 2131302178(0x7f091722, float:1.8222435E38)
            android.view.View r11 = r2.findViewById(r11)
            r9.f291466q = r11
            r11 = 2131302185(0x7f091729, float:1.8222449E38)
            android.view.View r11 = r2.findViewById(r11)
            r9.f291467r = r11
            android.widget.FrameLayout[] r11 = r9.f291468s
            r12 = 2131302195(0x7f091733, float:1.822247E38)
            android.view.View r12 = r2.findViewById(r12)
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r11[r8] = r12
            android.widget.FrameLayout[] r11 = r9.f291468s
            r12 = 2131302196(0x7f091734, float:1.8222471E38)
            android.view.View r12 = r2.findViewById(r12)
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r11[r7] = r12
            android.widget.FrameLayout[] r11 = r9.f291468s
            r12 = 2131302197(0x7f091735, float:1.8222473E38)
            android.view.View r12 = r2.findViewById(r12)
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r11[r5] = r12
            r11 = 0
        L_0x00b2:
            if (r11 >= r4) goto L_0x00e6
            android.widget.ImageView[] r12 = r9.f291469t
            android.widget.FrameLayout[] r13 = r9.f291468s
            r13 = r13[r11]
            android.view.View r13 = r13.findViewById(r10)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r12[r11] = r13
            android.widget.ImageView[] r12 = r9.f291470u
            android.widget.FrameLayout[] r13 = r9.f291468s
            r13 = r13[r11]
            r14 = 2131302172(0x7f09171c, float:1.8222423E38)
            android.view.View r13 = r13.findViewById(r14)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r12[r11] = r13
            android.widget.FrameLayout[] r12 = r9.f291468s
            r12 = r12[r11]
            r12.setVisibility(r6)
            int r11 = r11 + 1
            goto L_0x00b2
        L_0x00dd:
            java.lang.Object r2 = r30.getTag()
            r9 = r2
            lc1.n$a r9 = (lc1.C99396n.C99397a) r9
            r2 = r30
        L_0x00e6:
            r0.mo138844d(r9, r1)
            r10 = 0
        L_0x00ea:
            int r11 = r3.size()
            r12 = 4
            r13 = 15
            if (r10 >= r11) goto L_0x0107
            java.lang.Object r11 = r3.get(r10)
            te3.rc0 r11 = (te3.C101834rc0) r11
            int r11 = r11.f299258I
            if (r11 == r5) goto L_0x0104
            if (r11 == r13) goto L_0x0104
            if (r11 != r12) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            r10 = 0
            goto L_0x0108
        L_0x0104:
            int r10 = r10 + 1
            goto L_0x00ea
        L_0x0107:
            r10 = 1
        L_0x0108:
            if (r10 == 0) goto L_0x01c6
            android.view.View r5 = r9.f291466q
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r7.mo10233c(r10)
            java.lang.Object[] r15 = r7.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/fav/ui/listitem/FavRecordListItem"
            java.lang.String r17 = "getView"
            java.lang.String r18 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r5
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r7 = r7.mo10231a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r15 = "com/tencent/mm/plugin/fav/ui/listitem/FavRecordListItem"
            java.lang.String r16 = "getView"
            java.lang.String r17 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.view.View r5 = r9.f291467r
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r7.mo10233c(r10)
            java.lang.Object[] r22 = r7.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/fav/ui/listitem/FavRecordListItem"
            java.lang.String r24 = "getView"
            java.lang.String r25 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r5
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r7 = r7.mo10231a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r22 = "com/tencent/mm/plugin/fav/ui/listitem/FavRecordListItem"
            java.lang.String r23 = "getView"
            java.lang.String r24 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            int r5 = r3.size()
            int r4 = java.lang.Math.min(r4, r5)
            r5 = 0
        L_0x0196:
            if (r5 >= r4) goto L_0x01c5
            java.lang.Object r7 = r3.get(r5)
            te3.rc0 r7 = (te3.C101834rc0) r7
            android.widget.FrameLayout[] r10 = r9.f291468s
            r10 = r10[r5]
            r10.setVisibility(r8)
            android.widget.ImageView[] r10 = r9.f291469t
            r10 = r10[r5]
            r0.mo138853i(r10, r7, r1)
            int r7 = r7.f299258I
            if (r7 == r13) goto L_0x01bb
            if (r7 != r12) goto L_0x01b3
            goto L_0x01bb
        L_0x01b3:
            android.widget.ImageView[] r7 = r9.f291470u
            r7 = r7[r5]
            r7.setVisibility(r6)
            goto L_0x01c2
        L_0x01bb:
            android.widget.ImageView[] r7 = r9.f291470u
            r7 = r7[r5]
            r7.setVisibility(r8)
        L_0x01c2:
            int r5 = r5 + 1
            goto L_0x0196
        L_0x01c5:
            return r2
        L_0x01c6:
            android.view.View r4 = r9.f291466q
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r10.mo10233c(r11)
            java.lang.Object[] r15 = r10.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/fav/ui/listitem/FavRecordListItem"
            java.lang.String r17 = "getView"
            java.lang.String r18 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r4
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r10 = r10.mo10231a(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r4.setVisibility(r10)
            java.lang.String r15 = "com/tencent/mm/plugin/fav/ui/listitem/FavRecordListItem"
            java.lang.String r16 = "getView"
            java.lang.String r17 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.view.View r4 = r9.f291467r
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r10.mo10233c(r11)
            java.lang.Object[] r22 = r10.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/fav/ui/listitem/FavRecordListItem"
            java.lang.String r24 = "getView"
            java.lang.String r25 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r4
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r10 = r10.mo10231a(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r4.setVisibility(r10)
            java.lang.String r22 = "com/tencent/mm/plugin/fav/ui/listitem/FavRecordListItem"
            java.lang.String r23 = "getView"
            java.lang.String r24 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            android.widget.ImageView r4 = r9.f291460k
            lc1.C99373c.m129677g(r4, r1)
            java.util.Iterator r4 = r3.iterator()
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0257:
            boolean r15 = r4.hasNext()
            if (r15 == 0) goto L_0x028d
            java.lang.Object r15 = r4.next()
            te3.rc0 r15 = (te3.C101834rc0) r15
            int r15 = r15.f299258I
            r6 = 10
            if (r15 == r6) goto L_0x0285
            r6 = 11
            if (r15 == r6) goto L_0x0285
            r6 = 22
            if (r15 == r6) goto L_0x0285
            r6 = 29
            if (r15 == r6) goto L_0x0285
            r6 = 31
            if (r15 == r6) goto L_0x0285
            switch(r15) {
                case 1: goto L_0x0285;
                case 2: goto L_0x0280;
                case 3: goto L_0x0285;
                case 4: goto L_0x0280;
                case 5: goto L_0x0285;
                case 6: goto L_0x0285;
                case 7: goto L_0x0285;
                case 8: goto L_0x0285;
                default: goto L_0x027c;
            }
        L_0x027c:
            switch(r15) {
                case 14: goto L_0x0285;
                case 15: goto L_0x0280;
                case 16: goto L_0x0285;
                case 17: goto L_0x0285;
                default: goto L_0x027f;
            }
        L_0x027f:
            goto L_0x0289
        L_0x0280:
            if (r10 != 0) goto L_0x0289
            r12 = r14
            r10 = 1
            goto L_0x0289
        L_0x0285:
            if (r13 != 0) goto L_0x0289
            r11 = r14
            r13 = 1
        L_0x0289:
            int r14 = r14 + r7
            r6 = 8
            goto L_0x0257
        L_0x028d:
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)
            r4[r8] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r4[r7] = r5
            java.lang.String r5 = "MicroMsg.FavRecordListItem"
            java.lang.String r6 = "hasThumb %s, firstRemarkIndex %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r4)
            int r4 = r3.size()
            if (r4 >= r7) goto L_0x02ae
            java.lang.String r1 = "dataList size is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r1)
            goto L_0x030b
        L_0x02ae:
            java.lang.Object r4 = r3.get(r11)
            te3.rc0 r4 = (te3.C101834rc0) r4
            android.widget.TextView r5 = r9.f291461l
            android.widget.TextView r6 = r9.f291462m
            boolean r4 = r0.mo138854j(r5, r6, r4)
            android.widget.TextView r5 = r9.f291461l
            android.widget.TextView r6 = r9.f291462m
            r0.mo138855k(r5, r6, r4)
            if (r10 == 0) goto L_0x02db
            android.widget.FrameLayout r4 = r9.f291465p
            r4.setVisibility(r8)
            android.widget.ImageView r4 = r9.f291460k
            r4.setVisibility(r8)
            android.widget.ImageView r4 = r9.f291460k
            java.lang.Object r5 = r3.get(r12)
            te3.rc0 r5 = (te3.C101834rc0) r5
            r0.mo138853i(r4, r5, r1)
            goto L_0x02e7
        L_0x02db:
            android.widget.FrameLayout r1 = r9.f291465p
            r4 = 8
            r1.setVisibility(r4)
            android.widget.ImageView r1 = r9.f291460k
            r1.setVisibility(r4)
        L_0x02e7:
            int r11 = r11 + r7
            int r1 = r3.size()
            if (r11 >= r1) goto L_0x0304
            android.widget.TextView r1 = r9.f291463n
            android.widget.TextView r4 = r9.f291464o
            java.lang.Object r3 = r3.get(r11)
            te3.rc0 r3 = (te3.C101834rc0) r3
            boolean r1 = r0.mo138854j(r1, r4, r3)
            android.widget.TextView r3 = r9.f291463n
            android.widget.TextView r4 = r9.f291464o
            r0.mo138855k(r3, r4, r1)
            goto L_0x030b
        L_0x0304:
            android.widget.TextView r1 = r9.f291463n
            android.widget.TextView r3 = r9.f291464o
            r0.mo138855k(r1, r3, r8)
        L_0x030b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lc1.C99396n.mo138840b(android.view.View, android.view.ViewGroup, pb1.z):android.view.View");
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(view.getContext(), ((C99397a) view.getTag()).f291387a, md02);
    }

    /* renamed from: h */
    public final String mo138852h(Context context, int i) {
        return "[" + context.getResources().getString(i) + "]";
    }

    /* renamed from: i */
    public final void mo138853i(ImageView imageView, C101834rc0 rc02, C100755z zVar) {
        int i = rc02.f299258I;
        if (i == 2) {
            int i2 = this.f291459c;
            FavoriteImageServer.m118077d(imageView, C0966R.raw.record_nopicture_icon, rc02, zVar, true, i2, i2);
        } else if (i == 4 || i == 15) {
            FavoriteImageServer favoriteImageServer = this.f291378a;
            int i3 = this.f291459c;
            favoriteImageServer.mo128328a(imageView, rc02, zVar, C0966R.raw.app_attach_file_icon_video, i3, i3);
        }
    }

    /* renamed from: j */
    public final boolean mo138854j(TextView textView, TextView textView2, C101834rc0 rc02) {
        Class cls = C76979h.class;
        if (!rc02.f299300e1) {
            Log.m105918d("MicroMsg.FavRecordListItem", "has no datasrcname");
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(((C76979h) C86312j.m106911c(cls)).yp0(textView.getContext(), rc02.f299298d1, textView.getTextSize()));
        }
        Log.m105919d("MicroMsg.FavRecordListItem", "field type %d", Integer.valueOf(rc02.f299258I));
        int i = rc02.f299258I;
        if (i == 10) {
            textView2.setText(mo138852h(textView2.getContext(), C0966R.string.cp8) + rc02.f299296c1.f299408g.f298511d);
        } else if (i == 19) {
            textView2.setText(mo138852h(textView2.getContext(), C0966R.string.cre) + rc02.f299297d);
        } else if (i != 22) {
            if (i != 29) {
                if (i == 31) {
                    textView2.setText(mo138852h(textView2.getContext(), C0966R.string.cp4));
                } else if (i != 35) {
                    switch (i) {
                        case 1:
                            textView2.setText(((C76979h) C86312j.m106911c(cls)).yp0(textView2.getContext(), rc02.f299301f, textView2.getTextSize()));
                            break;
                        case 2:
                            textView2.setText(mo138852h(textView2.getContext(), C0966R.string.crk));
                            break;
                        case 3:
                            textView2.setText(mo138852h(textView2.getContext(), C0966R.string.cru));
                            break;
                        case 4:
                            textView2.setText(mo138852h(textView2.getContext(), C0966R.string.crt));
                            break;
                        case 5:
                            textView2.setText(mo138852h(textView2.getContext(), C0966R.string.crs) + rc02.f299297d);
                            break;
                        case 6:
                            C101871zc0 zc02 = rc02.f299296c1.f299406e;
                            StringBuilder sb = new StringBuilder();
                            sb.append(mo138852h(textView2.getContext(), C0966R.string.crm));
                            sb.append(Util.isNullOrNil(zc02.f299958o) ? zc02.f299956j : zc02.f299958o);
                            textView2.setText(sb.toString());
                            break;
                        case 7:
                            break;
                        case 8:
                            textView2.setText(mo138852h(textView2.getContext(), C0966R.string.crg) + rc02.f299297d);
                            break;
                        default:
                            switch (i) {
                                case 15:
                                    textView2.setText(mo138852h(textView2.getContext(), C0966R.string.crc));
                                    break;
                                case 16:
                                    textView2.setText(mo138852h(textView2.getContext(), C0966R.string.f360424com));
                                    break;
                                case 17:
                                    textView2.setText(mo138852h(textView2.getContext(), C0966R.string.crq));
                                    break;
                                default:
                                    return false;
                            }
                    }
                } else {
                    String str = rc02.f299301f;
                    if (TextUtils.isEmpty(str)) {
                        try {
                            C98680m mVar = new C98680m();
                            mVar.mo141099d(rc02.f299326s1);
                            str = ((C98450d) C86312j.m106911c(C98450d.class)).m30(mVar);
                        } catch (Exception unused) {
                        }
                    }
                    textView2.setText(str);
                }
            }
            textView2.setText(mo138852h(textView2.getContext(), C0966R.string.crn) + rc02.f299297d);
        } else if (C100734q.m131837a0()) {
            textView2.setText("");
        } else {
            textView2.setText(mo138852h(textView2.getContext(), C0966R.string.crs) + Util.nullAsNil(rc02.f299297d));
        }
        return true;
    }

    /* renamed from: k */
    public final void mo138855k(TextView textView, TextView textView2, boolean z) {
        if (z) {
            textView.setVisibility(0);
            textView2.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }
}
