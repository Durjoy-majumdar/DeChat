package lc1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kg3.C76577a;
import pb1.C100752x0;
import te3.C101811md0;
import te3.C101871zc0;

/* renamed from: lc1.l */
public class C99392l extends C99373c {

    /* renamed from: c */
    public static int f291434c;

    /* renamed from: lc1.l$a */
    public static class C99393a extends c$$e {

        /* renamed from: A */
        public FrameLayout[] f291435A = new FrameLayout[3];

        /* renamed from: B */
        public ImageView[] f291436B = new ImageView[3];

        /* renamed from: C */
        public ImageView[] f291437C = new ImageView[3];

        /* renamed from: k */
        public View f291438k;

        /* renamed from: l */
        public View f291439l;

        /* renamed from: m */
        public View f291440m;

        /* renamed from: n */
        public View f291441n;

        /* renamed from: o */
        public View f291442o;

        /* renamed from: p */
        public ImageView f291443p;

        /* renamed from: q */
        public ImageView f291444q;

        /* renamed from: r */
        public TextView f291445r;

        /* renamed from: s */
        public TextView f291446s;

        /* renamed from: t */
        public ImageView f291447t;

        /* renamed from: u */
        public TextView f291448u;

        /* renamed from: v */
        public TextView f291449v;

        /* renamed from: w */
        public TextView f291450w;

        /* renamed from: x */
        public TextView f291451x;

        /* renamed from: y */
        public View f291452y;

        /* renamed from: z */
        public View f291453z;
    }

    public C99392l(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
        f291434c = C76577a.m92157h(favoriteImageServer.f269877a, C0966R.dimen.f3805ey);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0321: MOVE  (r12v28 int) = (r23v1 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0741  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x030d A[EDGE_INSN: B:239:0x030d->B:93:0x030d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x031c  */
    /* renamed from: b */
    public android.view.View mo138840b(android.view.View r48, android.view.ViewGroup r49, pb1.C100755z r50) {
        /*
            r47 = this;
            r1 = r47
            r10 = r50
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            android.content.Context r11 = r49.getContext()
            r12 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r13 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r5 = 0
            r14 = 3
            r15 = 2
            r6 = 1
            if (r48 != 0) goto L_0x012a
            lc1.l$a r0 = new lc1.l$a
            r0.<init>()
            r7 = 2131494374(0x7f0c05e6, float:1.8612255E38)
            android.view.View r7 = android.view.View.inflate(r11, r7, r5)
            r1.mo138843a(r7, r0, r10)
            r8 = 2131311981(0x7f093d6d, float:1.8242318E38)
            android.view.View r8 = r7.findViewById(r8)
            r0.f291438k = r8
            r8 = 2131300036(0x7f090ec4, float:1.821809E38)
            android.view.View r8 = r7.findViewById(r8)
            r0.f291439l = r8
            r8 = 2131316408(0x7f094eb8, float:1.8251297E38)
            android.view.View r8 = r7.findViewById(r8)
            r0.f291440m = r8
            r8 = 2131299466(0x7f090c8a, float:1.8216934E38)
            android.view.View r8 = r7.findViewById(r8)
            r0.f291441n = r8
            r8 = 2131302181(0x7f091725, float:1.822244E38)
            android.view.View r8 = r7.findViewById(r8)
            r0.f291442o = r8
            r8 = 2131302179(0x7f091723, float:1.8222437E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0.f291443p = r8
            r8 = 2131302157(0x7f09170d, float:1.8222392E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0.f291444q = r8
            r8 = 2131302233(0x7f091759, float:1.8222546E38)
            android.view.View r8 = r7.findViewById(r8)
            r0.f291452y = r8
            r8 = 2131302232(0x7f091758, float:1.8222544E38)
            android.view.View r8 = r7.findViewById(r8)
            r0.f291453z = r8
            android.widget.FrameLayout[] r8 = r0.f291435A
            r9 = 2131302195(0x7f091733, float:1.822247E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            r8[r13] = r9
            android.widget.FrameLayout[] r8 = r0.f291435A
            r9 = 2131302196(0x7f091734, float:1.8222471E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            r8[r6] = r9
            android.widget.FrameLayout[] r8 = r0.f291435A
            r9 = 2131302197(0x7f091735, float:1.8222473E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            r8[r15] = r9
            r8 = 0
        L_0x00a7:
            if (r8 >= r14) goto L_0x00d7
            android.widget.ImageView[] r9 = r0.f291436B
            android.widget.FrameLayout[] r5 = r0.f291435A
            r5 = r5[r8]
            r14 = 2131302150(0x7f091706, float:1.8222378E38)
            android.view.View r5 = r5.findViewById(r14)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r9[r8] = r5
            android.widget.ImageView[] r5 = r0.f291437C
            android.widget.FrameLayout[] r9 = r0.f291435A
            r9 = r9[r8]
            r14 = 2131302172(0x7f09171c, float:1.8222423E38)
            android.view.View r9 = r9.findViewById(r14)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r5[r8] = r9
            android.widget.FrameLayout[] r5 = r0.f291435A
            r5 = r5[r8]
            r5.setVisibility(r12)
            int r8 = r8 + 1
            r5 = 0
            r14 = 3
            goto L_0x00a7
        L_0x00d7:
            r5 = 2131302187(0x7f09172b, float:1.8222453E38)
            android.view.View r5 = r7.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f291445r = r5
            r5 = 2131302180(0x7f091724, float:1.8222439E38)
            android.view.View r5 = r7.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f291446s = r5
            r5 = 2131302127(0x7f0916ef, float:1.8222331E38)
            android.view.View r5 = r7.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.f291447t = r5
            r5 = 2131302119(0x7f0916e7, float:1.8222315E38)
            android.view.View r5 = r7.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f291448u = r5
            r5 = 2131302118(0x7f0916e6, float:1.8222313E38)
            android.view.View r5 = r7.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f291449v = r5
            r5 = 2131302229(0x7f091755, float:1.8222538E38)
            android.view.View r5 = r7.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f291450w = r5
            r5 = 2131302121(0x7f0916e9, float:1.822232E38)
            android.view.View r5 = r7.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f291451x = r5
            r7.setTag(r0)
            r9 = r0
            r14 = r7
            goto L_0x0133
        L_0x012a:
            java.lang.Object r0 = r48.getTag()
            lc1.l$a r0 = (lc1.C99392l.C99393a) r0
            r14 = r48
            r9 = r0
        L_0x0133:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r9.f291388b
            r5 = 2131755601(0x7f100251, float:1.9142086E38)
            r0.setImageResource(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r9.f291388b
            r5 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r5 = kg3.C76577a.m92153d(r11, r5)
            r0.setIconColor(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r9.f291388b
            r0.setVisibility(r13)
            r1.mo138844d(r9, r10)
            te3.kd0 r0 = r10.field_favProto
            java.util.LinkedList<te3.rc0> r8 = r0.f298618f
            int r0 = r8.size()
            java.lang.String r5 = "MicroMsg.Fav.FavNoteListItem"
            if (r0 >= r15) goto L_0x0162
            java.lang.String r0 = "no other item"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return r14
        L_0x0162:
            java.lang.Object r0 = r8.get(r6)
            te3.rc0 r0 = (te3.C101834rc0) r0
            int r0 = r0.f299258I
            if (r0 == r6) goto L_0x016f
            r16 = 1
            goto L_0x0171
        L_0x016f:
            r16 = 2
        L_0x0171:
            int r0 = r8.size()
            int r0 = r0 - r16
            r7 = 3
            int r13 = java.lang.Math.min(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "info.id = "
            r0.append(r7)
            r48 = r13
            long r12 = r10.field_localId
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = "cclover_test"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            java.lang.Object r0 = r8.get(r6)
            te3.rc0 r0 = (te3.C101834rc0) r0
            java.lang.String r7 = r0.f299297d
            java.lang.String r12 = r0.f299301f
            if (r7 == 0) goto L_0x01a6
            java.lang.String r7 = r7.trim()
        L_0x01a6:
            if (r12 == 0) goto L_0x01ac
            java.lang.String r12 = r12.trim()
        L_0x01ac:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "firstDataItem title = "
            r13.append(r15)
            r13.append(r7)
            java.lang.String r15 = ", firstDataItem desc = "
            r13.append(r15)
            r13.append(r12)
            java.lang.String r15 = ", data type = "
            r13.append(r15)
            int r15 = r0.f299258I
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x01e0
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r7 == 0) goto L_0x01e0
            r7 = 1
            goto L_0x01e1
        L_0x01e0:
            r7 = 0
        L_0x01e1:
            int r0 = r0.f299258I
            r12 = 4
            r13 = 15
            if (r0 != r6) goto L_0x01eb
            if (r7 != 0) goto L_0x01eb
            goto L_0x0203
        L_0x01eb:
            r0 = r16
        L_0x01ed:
            int r7 = r8.size()
            if (r0 >= r7) goto L_0x0208
            java.lang.Object r7 = r8.get(r0)
            te3.rc0 r7 = (te3.C101834rc0) r7
            int r7 = r7.f299258I
            r15 = 2
            if (r7 == r15) goto L_0x0205
            if (r7 == r12) goto L_0x0205
            if (r7 != r13) goto L_0x0203
            goto L_0x0205
        L_0x0203:
            r7 = 0
            goto L_0x0209
        L_0x0205:
            int r0 = r0 + 1
            goto L_0x01ed
        L_0x0208:
            r7 = 1
        L_0x0209:
            int r0 = r8.size()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r13 = "showCount = "
            r15.append(r13)
            r13 = r48
            r15.append(r13)
            java.lang.String r12 = ", topThreeMedia = "
            r15.append(r12)
            r15.append(r7)
            java.lang.String r12 = ", totalItemSize = "
            r15.append(r12)
            r15.append(r0)
            java.lang.String r12 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)
            r15 = 0
            r20 = 1
            r21 = 0
            r22 = -1
            r23 = -1
        L_0x023d:
            int r12 = r8.size()
            java.lang.String r6 = ""
            if (r15 >= r12) goto L_0x030d
            java.lang.Object r12 = r8.get(r15)
            te3.rc0 r12 = (te3.C101834rc0) r12
            r28 = r11
            if (r15 != 0) goto L_0x029b
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            java.lang.String r11 = pb1.C100734q.m131880w(r12)
            r6.<init>((java.lang.String) r11)
            boolean r11 = r6.mo119967g()
            if (r11 != 0) goto L_0x0279
            java.util.Map<java.lang.String, nj.g$a> r6 = com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer.f269874e
            java.lang.String r6 = pb1.C100734q.m131880w(r12)
            zt3.t r11 = zt3.C119157j.f356862d
            r30 = r13
            com.tencent.mm.plugin.fav.ui.FavoriteImageServer$$e r13 = new com.tencent.mm.plugin.fav.ui.FavoriteImageServer$$e
            r31 = r7
            r7 = 1
            r13.<init>(r7, r6, r10, r12)
            zt3.j r11 = (zt3.C119157j) r11
            java.lang.String r6 = "FavImageServer"
            r11.mo183876g(r13, r6)
            goto L_0x0302
        L_0x0279:
            r31 = r7
            r30 = r13
            java.lang.String r7 = r12.f299308i1
            if (r7 != 0) goto L_0x0302
            com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent r7 = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent
            r7.<init>()
            com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent$a r11 = r7.f264942d
            r12 = 10
            r11.f264944a = r12
            long r12 = r10.field_localId
            r11.field_localId = r12
            java.lang.String r6 = r6.mo119971i()
            r11.f264953j = r6
            r7.publish()
            goto L_0x0302
        L_0x029b:
            r31 = r7
            r30 = r13
            int r7 = r12.f299258I
            r11 = 2
            if (r7 == r11) goto L_0x02ae
            r11 = 4
            if (r7 == r11) goto L_0x02ae
            r13 = 15
            if (r7 != r13) goto L_0x02ac
            goto L_0x02ae
        L_0x02ac:
            r11 = 1
            goto L_0x02bb
        L_0x02ae:
            r11 = r22
            r13 = -1
            if (r11 != r13) goto L_0x02b6
            r22 = r15
            goto L_0x02b8
        L_0x02b6:
            r22 = r11
        L_0x02b8:
            r11 = 1
            r21 = 1
        L_0x02bb:
            if (r7 == r11) goto L_0x02ed
            r11 = 3
            if (r7 == r11) goto L_0x02ea
            r6 = 14
            if (r7 == r6) goto L_0x02ea
            r6 = 16
            if (r7 == r6) goto L_0x02ea
            r6 = 20
            if (r7 == r6) goto L_0x02ea
            r6 = 22
            if (r7 == r6) goto L_0x02ea
            r6 = 29
            if (r7 == r6) goto L_0x02ea
            r6 = 5
            if (r7 == r6) goto L_0x02ea
            r6 = 6
            if (r7 == r6) goto L_0x02ea
            r6 = 7
            if (r7 == r6) goto L_0x02ea
            r6 = 8
            if (r7 == r6) goto L_0x02ea
            r6 = 10
            if (r7 == r6) goto L_0x02ea
            r6 = 11
            if (r7 == r6) goto L_0x02ea
            goto L_0x02fd
        L_0x02ea:
            r23 = r15
            goto L_0x0302
        L_0x02ed:
            java.lang.String r7 = r12.f299301f
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r6)
            java.lang.String r6 = r6.trim()
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x0300
        L_0x02fd:
            r20 = 0
            goto L_0x0302
        L_0x0300:
            int r0 = r0 + -1
        L_0x0302:
            int r15 = r15 + 1
            r11 = r28
            r13 = r30
            r7 = r31
            r6 = 1
            goto L_0x023d
        L_0x030d:
            r31 = r7
            r28 = r11
            r30 = r13
            r11 = r22
            if (r20 == 0) goto L_0x031c
            r7 = 2
            if (r0 != r7) goto L_0x031c
            r0 = 1
            goto L_0x031d
        L_0x031c:
            r0 = 0
        L_0x031d:
            java.lang.String r7 = " "
            if (r0 == 0) goto L_0x0741
            r12 = r23
            if (r12 <= 0) goto L_0x0741
            java.lang.Object r0 = r8.get(r12)
            te3.rc0 r0 = (te3.C101834rc0) r0
            int r2 = r0.f299258I
            r8 = 3
            if (r2 != r8) goto L_0x0441
            android.view.View r2 = r9.f291438k
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r5.mo10233c(r3)
            java.lang.Object[] r29 = r5.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r31 = "getView"
            java.lang.String r32 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r2
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r29 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r30 = "getView"
            java.lang.String r31 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
            android.view.View r2 = r9.f291439l
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r3)
            java.lang.Object[] r18 = r5.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r18 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r19 = "getView"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            android.view.View r2 = r9.f291440m
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r4)
            java.lang.Object[] r25 = r5.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r27 = "getView"
            java.lang.String r28 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r2
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r4 = 0
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r4 = r5.intValue()
            r2.setVisibility(r4)
            java.lang.String r25 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r26 = "getView"
            java.lang.String r27 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.view.View r2 = r9.f291441n
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r3)
            java.lang.Object[] r18 = r4.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r3 = 0
            java.lang.Object r3 = r4.mo10231a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r18 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r19 = "getView"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            android.widget.TextView r2 = r9.f291450w
            com.tencent.mm.plugin.fav.ui.FavoriteImageServer r3 = r1.f291378a
            android.content.Context r3 = r3.f269877a
            int r0 = r0.f299338y
            long r4 = (long) r0
            float r0 = pb1.C100734q.m131827R(r4)
            int r0 = (int) r0
            java.lang.String r0 = com.tencent.p014mm.plugin.fav.p047ui.C93697s1.m118413d(r3, r0)
            r2.setText(r0)
            goto L_0x073e
        L_0x0441:
            r8 = 20
            if (r2 != r8) goto L_0x0556
            android.view.View r2 = r9.f291438k
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r5.mo10233c(r3)
            java.lang.Object[] r28 = r5.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r30 = "getView"
            java.lang.String r31 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r2
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r28 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r29 = "getView"
            java.lang.String r30 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            android.view.View r2 = r9.f291439l
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r3)
            java.lang.Object[] r18 = r5.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r18 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r19 = "getView"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            android.view.View r2 = r9.f291440m
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r3)
            java.lang.Object[] r25 = r5.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r27 = "getView"
            java.lang.String r28 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r2
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r3 = 0
            java.lang.Object r5 = r5.mo10231a(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r3 = r5.intValue()
            r2.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r26 = "getView"
            java.lang.String r27 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.view.View r2 = r9.f291441n
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r4)
            java.lang.Object[] r18 = r3.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r18 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r19 = "getView"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            android.widget.TextView r2 = r9.f291451x
            com.tencent.mm.plugin.fav.ui.FavoriteImageServer r3 = r1.f291378a
            android.content.Context r3 = r3.f269877a
            int r0 = r0.f299338y
            long r4 = (long) r0
            float r0 = pb1.C100734q.m131827R(r4)
            int r0 = (int) r0
            java.lang.String r0 = com.tencent.p014mm.plugin.fav.p047ui.C93697s1.m118413d(r3, r0)
            r2.setText(r0)
            goto L_0x073e
        L_0x0556:
            r8 = 6
            if (r2 != r8) goto L_0x05ad
            r2 = 2131232220(0x7f0805dc, float:1.8080543E38)
            te3.sc0 r7 = r0.f299296c1
            te3.zc0 r8 = r7.f299406e
            java.lang.String r7 = r7.f299410i
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            java.lang.String r11 = "getLabel but locItem is null"
            if (r10 == 0) goto L_0x058d
            java.lang.String r7 = r1.mo138851h(r8)
            boolean r7 = com.tencent.p014mm.plugin.fav.p047ui.C93697s1.m118412c(r7)
            if (r7 == 0) goto L_0x0582
            java.lang.String r7 = r1.mo138851h(r8)
            if (r8 != 0) goto L_0x057f
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
        L_0x057d:
            r5 = r6
            goto L_0x05a4
        L_0x057f:
            java.lang.String r5 = r8.f299956j
            goto L_0x05a4
        L_0x0582:
            if (r8 != 0) goto L_0x0588
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
            goto L_0x058a
        L_0x0588:
            java.lang.String r6 = r8.f299956j
        L_0x058a:
            r7 = r6
            r5 = 0
            goto L_0x05a4
        L_0x058d:
            java.lang.String r10 = r1.mo138851h(r8)
            boolean r10 = com.tencent.p014mm.plugin.fav.p047ui.C93697s1.m118412c(r10)
            if (r10 == 0) goto L_0x059c
            java.lang.String r5 = r1.mo138851h(r8)
            goto L_0x05a4
        L_0x059c:
            if (r8 != 0) goto L_0x05a2
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
            goto L_0x057d
        L_0x05a2:
            java.lang.String r5 = r8.f299956j
        L_0x05a4:
            android.widget.ImageView r6 = r9.f291447t
            int r0 = r0.f299258I
            lc1.C99373c.m129676f(r6, r0)
            goto L_0x0621
        L_0x05ad:
            r5 = 8
            if (r2 != r5) goto L_0x0603
            java.lang.String r2 = r0.f299262K
            int r2 = com.tencent.p014mm.plugin.fav.p047ui.C93693r.m118403d(r2)
            java.lang.String r5 = r0.f299297d
            java.lang.String r6 = r0.f299301f
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r8 == 0) goto L_0x05c8
            long r10 = r0.f299276R
            float r6 = (float) r10
            java.lang.String r6 = pb1.C100734q.m131818I(r6)
        L_0x05c8:
            java.lang.String r8 = "."
            int r8 = r5.lastIndexOf(r8)
            r10 = -1
            if (r8 == r10) goto L_0x05f9
            int r6 = r8 + 1
            java.lang.String r6 = r5.substring(r6)
            java.lang.String r6 = r6.toUpperCase()
            r10 = 0
            java.lang.String r5 = r5.substring(r10, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r7)
            long r6 = r0.f299276R
            float r6 = (float) r6
            java.lang.String r6 = pb1.C100734q.m131818I(r6)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
        L_0x05f9:
            r7 = r5
            r5 = r6
            android.widget.ImageView r6 = r9.f291447t
            int r0 = r0.f299258I
            lc1.C99373c.m129676f(r6, r0)
            goto L_0x0621
        L_0x0603:
            java.lang.String r2 = r0.f299262K
            int r2 = com.tencent.p014mm.plugin.fav.p047ui.C93693r.m118403d(r2)
            java.lang.String r7 = r0.f299297d
            java.lang.String r5 = r0.f299301f
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 == 0) goto L_0x061a
            long r5 = r0.f299276R
            float r5 = (float) r5
            java.lang.String r5 = pb1.C100734q.m131818I(r5)
        L_0x061a:
            android.widget.ImageView r6 = r9.f291447t
            int r0 = r0.f299258I
            lc1.C99373c.m129676f(r6, r0)
        L_0x0621:
            android.view.View r0 = r9.f291440m
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r6.mo10233c(r3)
            java.lang.Object[] r19 = r6.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r21 = "getView"
            java.lang.String r22 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r0
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r8 = 0
            java.lang.Object r6 = r6.mo10231a(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.setVisibility(r6)
            java.lang.String r19 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            android.view.View r0 = r9.f291441n
            k20.a r6 = new k20.a
            r6.<init>()
            r6.mo10233c(r3)
            java.lang.Object[] r26 = r6.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r28 = "getView"
            java.lang.String r29 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r0
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r8 = 0
            java.lang.Object r6 = r6.mo10231a(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.setVisibility(r6)
            java.lang.String r26 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r27 = "getView"
            java.lang.String r28 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            android.view.View r0 = r9.f291438k
            k20.a r6 = new k20.a
            r6.<init>()
            r6.mo10233c(r3)
            java.lang.Object[] r19 = r6.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r21 = "getView"
            java.lang.String r22 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r0
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r3 = 0
            java.lang.Object r6 = r6.mo10231a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r3 = r6.intValue()
            r0.setVisibility(r3)
            java.lang.String r19 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            android.view.View r0 = r9.f291439l
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r4)
            java.lang.Object[] r26 = r3.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r28 = "getView"
            java.lang.String r29 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r0
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r26 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r27 = "getView"
            java.lang.String r28 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            android.widget.ImageView r0 = r9.f291447t
            r0.setImageResource(r2)
            android.widget.TextView r0 = r9.f291448u
            r0.setText(r7)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r0 != 0) goto L_0x0737
            android.widget.TextView r0 = r9.f291449v
            r0.setText(r5)
            android.widget.TextView r0 = r9.f291449v
            r2 = 0
            r0.setVisibility(r2)
            goto L_0x073e
        L_0x0737:
            android.widget.TextView r0 = r9.f291449v
            r2 = 8
            r0.setVisibility(r2)
        L_0x073e:
            r10 = r1
            goto L_0x0c2a
        L_0x0741:
            android.view.View r0 = r9.f291438k
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            r12.mo10233c(r4)
            java.lang.Object[] r33 = r12.mo10232b()
            java.lang.String r34 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r35 = "getView"
            java.lang.String r36 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r37 = "android/view/View_EXEC_"
            java.lang.String r38 = "setVisibility"
            java.lang.String r39 = "(I)V"
            r32 = r0
            j20.C117292a.m165358d(r32, r33, r34, r35, r36, r37, r38, r39)
            r13 = 0
            java.lang.Object r12 = r12.mo10231a(r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r0.setVisibility(r12)
            java.lang.String r33 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r34 = "getView"
            java.lang.String r35 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            j20.C117292a.m165359e(r32, r33, r34, r35, r36, r37, r38)
            android.view.View r0 = r9.f291439l
            k20.a r12 = new k20.a
            r12.<init>()
            r12.mo10233c(r3)
            java.lang.Object[] r40 = r12.mo10232b()
            java.lang.String r41 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r42 = "getView"
            java.lang.String r43 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r44 = "android/view/View_EXEC_"
            java.lang.String r45 = "setVisibility"
            java.lang.String r46 = "(I)V"
            r39 = r0
            j20.C117292a.m165358d(r39, r40, r41, r42, r43, r44, r45, r46)
            r13 = 0
            java.lang.Object r12 = r12.mo10231a(r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r0.setVisibility(r12)
            java.lang.String r40 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r41 = "getView"
            java.lang.String r42 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r43 = "android/view/View_EXEC_"
            java.lang.String r44 = "setVisibility"
            java.lang.String r45 = "(I)V"
            j20.C117292a.m165359e(r39, r40, r41, r42, r43, r44, r45)
            android.view.View r0 = r9.f291440m
            k20.a r12 = new k20.a
            r12.<init>()
            r12.mo10233c(r3)
            java.lang.Object[] r33 = r12.mo10232b()
            java.lang.String r34 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r35 = "getView"
            java.lang.String r36 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r37 = "android/view/View_EXEC_"
            java.lang.String r38 = "setVisibility"
            java.lang.String r39 = "(I)V"
            r32 = r0
            j20.C117292a.m165358d(r32, r33, r34, r35, r36, r37, r38, r39)
            r13 = 0
            java.lang.Object r12 = r12.mo10231a(r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r0.setVisibility(r12)
            java.lang.String r33 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r34 = "getView"
            java.lang.String r35 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            j20.C117292a.m165359e(r32, r33, r34, r35, r36, r37, r38)
            android.view.View r0 = r9.f291441n
            k20.a r12 = new k20.a
            r12.<init>()
            r12.mo10233c(r3)
            java.lang.Object[] r40 = r12.mo10232b()
            java.lang.String r41 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r42 = "getView"
            java.lang.String r43 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r44 = "android/view/View_EXEC_"
            java.lang.String r45 = "setVisibility"
            java.lang.String r46 = "(I)V"
            r39 = r0
            j20.C117292a.m165358d(r39, r40, r41, r42, r43, r44, r45, r46)
            r13 = 0
            java.lang.Object r12 = r12.mo10231a(r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r0.setVisibility(r12)
            java.lang.String r40 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r41 = "getView"
            java.lang.String r42 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r43 = "android/view/View_EXEC_"
            java.lang.String r44 = "setVisibility"
            java.lang.String r45 = "(I)V"
            j20.C117292a.m165359e(r39, r40, r41, r42, r43, r44, r45)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r13 = 1
            r15 = 0
        L_0x0842:
            int r0 = r8.size()
            r48 = r6
            java.lang.String r6 = "\n"
            if (r13 >= r0) goto L_0x093e
            java.lang.Object r0 = r8.get(r13)
            te3.rc0 r0 = (te3.C101834rc0) r0
            int r10 = r0.f299258I
            r19 = r11
            r11 = 1
            if (r10 != r11) goto L_0x090b
            java.lang.String r0 = r0.f299301f
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r10 != 0) goto L_0x0892
            int r10 = r0.length()
            r11 = 1000(0x3e8, float:1.401E-42)
            if (r10 <= r11) goto L_0x086e
            r10 = 0
            java.lang.String r0 = r0.substring(r10, r11)
        L_0x086e:
            java.lang.String r10 = "&lt;"
            java.lang.String r11 = "<"
            java.lang.String r0 = r0.replaceAll(r10, r11)
            java.lang.String r10 = "&gt;"
            java.lang.String r11 = ">"
            java.lang.String r0 = r0.replaceAll(r10, r11)
            java.lang.String r10 = "&amp;"
            java.lang.String r11 = "&"
            java.lang.String r0 = r0.replaceAll(r10, r11)
            java.lang.String r10 = " "
            java.lang.String r0 = r0.replace(r10, r7)
            java.lang.String[] r0 = r0.split(r6)
            goto L_0x0893
        L_0x0892:
            r0 = 0
        L_0x0893:
            if (r0 == 0) goto L_0x0932
            int r6 = r0.length
            if (r6 <= 0) goto L_0x0932
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r10 = 0
        L_0x089e:
            int r11 = r0.length
            if (r10 >= r11) goto L_0x08b6
            r11 = r0[r10]
            java.lang.String r11 = r11.trim()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x08b3
            r11 = r0[r10]
            r6.add(r11)
            goto L_0x08b7
        L_0x08b3:
            int r10 = r10 + 1
            goto L_0x089e
        L_0x08b6:
            r10 = 0
        L_0x08b7:
            r11 = 1
            int r10 = r10 + r11
            r11 = r48
        L_0x08bb:
            int r1 = r0.length
            if (r10 >= r1) goto L_0x08d5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r11 = r0[r10]
            r1.append(r11)
            r1.append(r7)
            java.lang.String r11 = r1.toString()
            int r10 = r10 + 1
            goto L_0x08bb
        L_0x08d5:
            java.lang.String r0 = r11.trim()
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x08e2
            r6.add(r0)
        L_0x08e2:
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x08f8
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r0 == 0) goto L_0x08f8
            r1 = 0
            java.lang.Object r0 = r6.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r15 = r0
            r0 = 1
            goto L_0x08f9
        L_0x08f8:
            r0 = 0
        L_0x08f9:
            int r1 = r6.size()
            if (r0 >= r1) goto L_0x0932
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r12.add(r1)
            int r0 = r0 + 1
            goto L_0x08f9
        L_0x090b:
            android.content.Context r1 = r14.getContext()     // Catch:{ Exception -> 0x091d }
            java.lang.String r0 = com.tencent.p014mm.plugin.fav.p047ui.C93697s1.m118411b(r1, r0)     // Catch:{ Exception -> 0x091d }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x091d }
            if (r1 != 0) goto L_0x0932
            r12.add(r0)     // Catch:{ Exception -> 0x091d }
            goto L_0x0932
        L_0x091d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "getDataItemDesc exception:"
            r1.append(r6)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x0932:
            int r13 = r13 + 1
            r1 = r47
            r6 = r48
            r10 = r50
            r11 = r19
            goto L_0x0842
        L_0x093e:
            r19 = r11
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r0 != 0) goto L_0x097b
            android.widget.TextView r0 = r9.f291445r
            di3.d r1 = di3.C86312j.m106911c(r2)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r5 = r9.f291445r
            android.content.Context r5 = r5.getContext()
            android.widget.TextView r7 = r9.f291445r
            float r7 = r7.getTextSize()
            android.text.SpannableString r1 = r1.yp0(r5, r15, r7)
            r0.setText(r1)
            android.widget.TextView r0 = r9.f291445r
            r1 = 0
            r0.setVisibility(r1)
            int r0 = r12.size()
            if (r0 <= 0) goto L_0x0974
            android.widget.TextView r0 = r9.f291445r
            r1 = 1
            r0.setMaxLines(r1)
            goto L_0x0982
        L_0x0974:
            android.widget.TextView r0 = r9.f291445r
            r1 = 3
            r0.setMaxLines(r1)
            goto L_0x0982
        L_0x097b:
            android.widget.TextView r0 = r9.f291445r
            r1 = 8
            r0.setVisibility(r1)
        L_0x0982:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        L_0x0988:
            int r5 = r12.size()
            if (r1 >= r5) goto L_0x09a0
            r5 = 2
            if (r1 >= r5) goto L_0x09a0
            java.lang.Object r5 = r12.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            r0.append(r5)
            r0.append(r6)
            int r1 = r1 + 1
            goto L_0x0988
        L_0x09a0:
            int r1 = r0.length()
            if (r1 == 0) goto L_0x09d2
            int r1 = r0.length()
            r5 = 1
            int r1 = r1 - r5
            r5 = 0
            java.lang.String r0 = r0.substring(r5, r1)
            android.widget.TextView r1 = r9.f291446s
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            android.widget.TextView r6 = r9.f291446s
            android.content.Context r6 = r6.getContext()
            android.widget.TextView r7 = r9.f291446s
            float r7 = r7.getTextSize()
            android.text.SpannableString r0 = r2.yp0(r6, r0, r7)
            r1.setText(r0)
            android.widget.TextView r0 = r9.f291446s
            r0.setVisibility(r5)
            goto L_0x09d9
        L_0x09d2:
            android.widget.TextView r0 = r9.f291446s
            r1 = 8
            r0.setVisibility(r1)
        L_0x09d9:
            android.view.View r0 = r9.f291452y
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r4)
            java.lang.Object[] r33 = r1.mo10232b()
            java.lang.String r34 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r35 = "getView"
            java.lang.String r36 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r37 = "android/view/View_EXEC_"
            java.lang.String r38 = "setVisibility"
            java.lang.String r39 = "(I)V"
            r32 = r0
            j20.C117292a.m165358d(r32, r33, r34, r35, r36, r37, r38, r39)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r33 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r34 = "getView"
            java.lang.String r35 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            j20.C117292a.m165359e(r32, r33, r34, r35, r36, r37, r38)
            android.view.View r0 = r9.f291453z
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r3)
            java.lang.Object[] r40 = r1.mo10232b()
            java.lang.String r41 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r42 = "getView"
            java.lang.String r43 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r44 = "android/view/View_EXEC_"
            java.lang.String r45 = "setVisibility"
            java.lang.String r46 = "(I)V"
            r39 = r0
            j20.C117292a.m165358d(r39, r40, r41, r42, r43, r44, r45, r46)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r40 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r41 = "getView"
            java.lang.String r42 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r43 = "android/view/View_EXEC_"
            java.lang.String r44 = "setVisibility"
            java.lang.String r45 = "(I)V"
            j20.C117292a.m165359e(r39, r40, r41, r42, r43, r44, r45)
            if (r21 == 0) goto L_0x0be9
            if (r31 == 0) goto L_0x0b45
            android.view.View r0 = r9.f291452y
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r3)
            java.lang.Object[] r33 = r1.mo10232b()
            java.lang.String r34 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r35 = "getView"
            java.lang.String r36 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r37 = "android/view/View_EXEC_"
            java.lang.String r38 = "setVisibility"
            java.lang.String r39 = "(I)V"
            r32 = r0
            j20.C117292a.m165358d(r32, r33, r34, r35, r36, r37, r38, r39)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r33 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r34 = "getView"
            java.lang.String r35 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            j20.C117292a.m165359e(r32, r33, r34, r35, r36, r37, r38)
            android.view.View r0 = r9.f291453z
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r4)
            java.lang.Object[] r20 = r1.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r22 = "getView"
            java.lang.String r23 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r0
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r20 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r21 = "getView"
            java.lang.String r22 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            r0 = r16
        L_0x0ad7:
            int r13 = r16 + r30
            if (r0 >= r13) goto L_0x0b2f
            java.lang.Object r1 = r8.get(r0)
            r4 = r1
            te3.rc0 r4 = (te3.C101834rc0) r4
            android.widget.FrameLayout[] r1 = r9.f291435A
            int r2 = r0 - r16
            r1 = r1[r2]
            r3 = 0
            r1.setVisibility(r3)
            android.widget.ImageView[] r1 = r9.f291436B
            r3 = r1[r2]
            android.widget.ImageView[] r1 = r9.f291437C
            r1 = r1[r2]
            int r2 = r4.f299258I
            r5 = 2
            if (r2 != r5) goto L_0x0b12
            r5 = 2131755591(0x7f100247, float:1.9142066E38)
            r6 = 1
            int r10 = f291434c
            r2 = r3
            r3 = r5
            r5 = r50
            r7 = r10
            r11 = r8
            r8 = r10
            com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer.m118077d(r2, r3, r4, r5, r6, r7, r8)
            r2 = 8
            r1.setVisibility(r2)
            r10 = r47
            r13 = r9
            goto L_0x0b2a
        L_0x0b12:
            r10 = r47
            r11 = r8
            com.tencent.mm.plugin.fav.ui.FavoriteImageServer r2 = r10.f291378a
            java.lang.String r6 = r4.f299254G
            r7 = 2131755116(0x7f10006c, float:1.9141102E38)
            int r12 = f291434c
            r5 = r50
            r8 = r12
            r13 = r9
            r9 = r12
            r2.mo128329b(r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            r1.setVisibility(r2)
        L_0x0b2a:
            int r0 = r0 + 1
            r8 = r11
            r9 = r13
            goto L_0x0ad7
        L_0x0b2f:
            r10 = r47
            r13 = r9
            r1 = r30
            r2 = 3
            if (r1 >= r2) goto L_0x0c2a
        L_0x0b37:
            if (r1 >= r2) goto L_0x0c2a
            android.widget.FrameLayout[] r0 = r13.f291435A
            r0 = r0[r1]
            r3 = 8
            r0.setVisibility(r3)
            int r1 = r1 + 1
            goto L_0x0b37
        L_0x0b45:
            r10 = r47
            r11 = r8
            r13 = r9
            android.view.View r3 = r13.f291442o
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r4)
            java.lang.Object[] r21 = r0.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r23 = "getView"
            java.lang.String r24 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r3
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.setVisibility(r0)
            java.lang.String r4 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r5 = "getView"
            java.lang.String r6 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            r12 = r19
            java.lang.Object r0 = r11.get(r12)
            r4 = r0
            te3.rc0 r4 = (te3.C101834rc0) r4
            java.lang.Object r0 = r11.get(r12)
            te3.rc0 r0 = (te3.C101834rc0) r0
            int r0 = r0.f299258I
            r1 = 2
            if (r0 != r1) goto L_0x0bc1
            android.widget.ImageView r2 = r13.f291443p
            r3 = 2131755591(0x7f100247, float:1.9142066E38)
            r6 = 1
            int r8 = f291434c
            r5 = r50
            r7 = r8
            com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer.m118077d(r2, r3, r4, r5, r6, r7, r8)
            android.widget.ImageView r0 = r13.f291444q
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r13.f291443p
            android.content.res.Resources r1 = r28.getResources()
            r2 = 2131821637(0x7f110445, float:1.9276023E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setContentDescription(r1)
            goto L_0x0c2a
        L_0x0bc1:
            android.widget.ImageView r0 = r13.f291444q
            r1 = 0
            r0.setVisibility(r1)
            com.tencent.mm.plugin.fav.ui.FavoriteImageServer r2 = r10.f291378a
            android.widget.ImageView r3 = r13.f291443p
            java.lang.String r6 = r4.f299254G
            r7 = 2131755116(0x7f10006c, float:1.9141102E38)
            int r9 = f291434c
            r5 = r50
            r8 = r9
            r2.mo128329b(r3, r4, r5, r6, r7, r8, r9)
            android.widget.ImageView r0 = r13.f291443p
            android.content.res.Resources r1 = r28.getResources()
            r2 = 2131821728(0x7f1104a0, float:1.9276207E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setContentDescription(r1)
            goto L_0x0c2a
        L_0x0be9:
            r10 = r47
            r13 = r9
            android.view.View r0 = r13.f291442o
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r3)
            java.lang.Object[] r3 = r1.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r5 = "getView"
            java.lang.String r6 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r0
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r3 = "com/tencent/mm/plugin/fav/ui/listitem/FavNoteListItem"
            java.lang.String r4 = "getView"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/view/View;"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r0
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x0c2a:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: lc1.C99392l.mo138840b(android.view.View, android.view.ViewGroup, pb1.z):android.view.View");
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(view.getContext(), ((C99393a) view.getTag()).f291387a, md02);
    }

    /* renamed from: h */
    public final String mo138851h(C101871zc0 zc02) {
        if (zc02 != null) {
            return zc02.f299958o;
        }
        Log.m105924i("MicroMsg.Fav.FavNoteListItem", "getPoiname but locItem is null");
        return "";
    }
}
