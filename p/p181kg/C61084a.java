package p181kg;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;

/* renamed from: kg.a */
public final class C61084a extends C60896i<C61089d> {

    /* renamed from: kg.a$a */
    public static final class C61085a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public static final C61085a f173946a = new C61085a();

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C87412m.m108594g(compoundButton, "checkBox");
        }
    }

    /* renamed from: kg.a$b */
    public static final class C61086b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f173947d;

        /* renamed from: e */
        public final /* synthetic */ CheckBox f173948e;

        public C61086b(C60905o oVar, CheckBox checkBox) {
            this.f173947d = oVar;
            this.f173948e = checkBox;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kg.d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r11) {
            /*
                r10 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r11)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/album/ui/c2c/gallery/AlbumConvert$onCreateViewHolder$2"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r10
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                jq3.o r11 = r10.f173947d
                androidx.recyclerview.widget.RecyclerView$e r11 = r11.f173500B
                boolean r0 = r11 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
                r1 = 0
                if (r0 == 0) goto L_0x0027
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r11 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r11
                goto L_0x0028
            L_0x0027:
                r11 = r1
            L_0x0028:
                r0 = 0
                r2 = 1
                if (r11 == 0) goto L_0x007a
                java.util.List r11 = r11.getData()
                if (r11 == 0) goto L_0x007a
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r11 = r11.iterator()
            L_0x003b:
                boolean r4 = r11.hasNext()
                if (r4 == 0) goto L_0x0059
                java.lang.Object r4 = r11.next()
                r5 = r4
                kg.d r5 = (p181kg.C61089d) r5
                boolean r6 = r5.f173954g
                if (r6 == 0) goto L_0x0052
                boolean r5 = r5.f173955h
                if (r5 == 0) goto L_0x0052
                r5 = 1
                goto L_0x0053
            L_0x0052:
                r5 = 0
            L_0x0053:
                if (r5 == 0) goto L_0x003b
                r3.add(r4)
                goto L_0x003b
            L_0x0059:
                java.util.ArrayList r11 = new java.util.ArrayList
                r4 = 10
                int r4 = sx3.C36907w.m41090l(r3, r4)
                r11.<init>(r4)
                java.util.Iterator r3 = r3.iterator()
            L_0x0068:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x007b
                java.lang.Object r4 = r3.next()
                kg.d r4 = (p181kg.C61089d) r4
                ig.d r4 = r4.f173953f
                r11.add(r4)
                goto L_0x0068
            L_0x007a:
                r11 = r1
            L_0x007b:
                java.lang.String r3 = "(Landroid/view/View;)V"
                java.lang.String r4 = "onClick"
                java.lang.String r5 = "android/view/View$OnClickListener"
                java.lang.String r6 = "com/tencent/mm/album/ui/c2c/gallery/AlbumConvert$onCreateViewHolder$2"
                if (r11 == 0) goto L_0x00ab
                int r11 = r11.size()
                r7 = 9
                if (r11 < r7) goto L_0x00ab
                jq3.o r11 = r10.f173947d
                android.content.Context r11 = r11.f173499A
                android.content.res.Resources r1 = r11.getResources()
                r8 = 2131689487(0x7f0f000f, float:1.900799E38)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
                r2[r0] = r9
                java.lang.String r0 = r1.getQuantityString(r8, r7, r2)
                nj3.C76879j.m92726T(r11, r0)
                j20.C117292a.m165361g(r10, r6, r5, r4, r3)
                return
            L_0x00ab:
                jq3.o r11 = r10.f173947d
                java.lang.Object r11 = r11.f173502D
                boolean r0 = r11 instanceof p181kg.C61089d
                if (r0 == 0) goto L_0x00b6
                r1 = r11
                kg.d r1 = (p181kg.C61089d) r1
            L_0x00b6:
                if (r1 == 0) goto L_0x00c2
                android.widget.CheckBox r11 = r10.f173948e
                boolean r0 = r1.f173955h
                r0 = r0 ^ r2
                r1.f173955h = r0
                r11.setChecked(r0)
            L_0x00c2:
                j20.C117292a.m165361g(r10, r6, r5, r4, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p181kg.C61084a.C61086b.onClick(android.view.View):void");
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cbx;
    }

    /* JADX WARNING: type inference failed for: r4v17, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r23, jq3.C9493c r24, int r25, int r26, boolean r27, java.util.List r28) {
        /*
            r22 = this;
            r0 = r23
            r1 = r24
            kg.d r1 = (p181kg.C61089d) r1
            java.lang.String r2 = "holder"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "albumItem"
            gy3.C87412m.m108594g(r1, r2)
            r0.f173502D = r1
            r2 = 2131296830(0x7f09023e, float:1.8211588E38)
            android.view.View r2 = r0.mo85812D(r2)
            r7 = r2
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$e r3 = r0.f173500B
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.album.ui.c2c.gallery.AlbumGalleryAdapter"
            gy3.C87412m.m108592e(r3, r4)
            com.tencent.mm.album.ui.c2c.gallery.a r3 = (com.tencent.p014mm.album.p836ui.c2c.gallery.C55068a) r3
            int r3 = r3.f154630L
            r2.height = r3
            r7.setLayoutParams(r2)
            r3 = 2131296989(0x7f0902dd, float:1.821191E38)
            android.view.View r3 = r0.mo85812D(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$e r6 = r0.f173500B
            gy3.C87412m.m108592e(r6, r4)
            com.tencent.mm.album.ui.c2c.gallery.a r6 = (com.tencent.p014mm.album.p836ui.c2c.gallery.C55068a) r6
            int r4 = r6.f154630L
            r5.height = r4
            r3.setLayoutParams(r2)
            r2 = 2131296785(0x7f090211, float:1.8211496E38)
            android.view.View r2 = r0.mo85812D(r2)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            boolean r4 = r1.f173954g
            r11 = 8
            r12 = 0
            if (r4 == 0) goto L_0x005d
            r4 = 0
            goto L_0x005f
        L_0x005d:
            r4 = 8
        L_0x005f:
            r2.setVisibility(r4)
            r4 = 2131296786(0x7f090212, float:1.8211499E38)
            android.view.View r4 = r0.mo85812D(r4)
            boolean r5 = r1.f173954g
            if (r5 == 0) goto L_0x006f
            r5 = 0
            goto L_0x0071
        L_0x006f:
            r5 = 8
        L_0x0071:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.mo10233c(r5)
            java.lang.Object[] r14 = r6.mo10232b()
            java.lang.String r15 = "com/tencent/mm/album/ui/c2c/gallery/AlbumConvert"
            java.lang.String r16 = "onBindViewHolder"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/album/ui/c2c/gallery/AlbumItem;IIZLjava/util/List;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r4
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r5 = r6.mo10231a(r12)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r14 = "com/tencent/mm/album/ui/c2c/gallery/AlbumConvert"
            java.lang.String r15 = "onBindViewHolder"
            java.lang.String r16 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/album/ui/c2c/gallery/AlbumItem;IIZLjava/util/List;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            boolean r4 = r1.f173954g
            if (r4 != 0) goto L_0x00ba
            r2.setChecked(r12)
            r1.f173955h = r12
        L_0x00ba:
            ig.g r2 = r1.f173952e
            java.util.List r2 = r2.mo55348A()
            ig.d r4 = r1.f173953f
            int r2 = r2.indexOf(r4)
            com.tencent.mm.storage.f4 r4 = r1.f173951d
            if (r4 == 0) goto L_0x00d3
            long r4 = r4.getMsgId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x00d8
        L_0x00d3:
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x00d8:
            boolean r5 = r3 instanceof com.tencent.p014mm.p136ui.anim.transition.view.TransitionAnimImageView
            r6 = 0
            if (r5 == 0) goto L_0x00e0
            com.tencent.mm.ui.anim.transition.view.TransitionAnimImageView r3 = (com.tencent.p014mm.p136ui.anim.transition.view.TransitionAnimImageView) r3
            goto L_0x00e1
        L_0x00e0:
            r3 = r6
        L_0x00e1:
            r13 = 1
            if (r3 == 0) goto L_0x012f
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            java.lang.String r4 = com.tencent.p014mm.p136ui.C74928u.C57854a.m66842a(r2, r4)
            java.lang.String r5 = "getShareElementName(posi…, msgId as Long\n        )"
            gy3.C87412m.m108593f(r4, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            if (r2 <= r11) goto L_0x00fb
            r2 = 1
            goto L_0x00fc
        L_0x00fb:
            r2 = 0
        L_0x00fc:
            r3.f165045f = r7
            gj3.C59476i.m69399a(r3, r4, r5)
            android.content.Context r4 = r3.getContext()
            boolean r5 = r4 instanceof android.app.Activity
            if (r5 == 0) goto L_0x010c
            r6 = r4
            android.app.Activity r6 = (android.app.Activity) r6
        L_0x010c:
            if (r6 == 0) goto L_0x0123
            com.tencent.mm.ui.anim.transition.MMTransitionHelper r4 = com.tencent.p014mm.p136ui.anim.transition.MMTransitionHelper.f165034a
            com.tencent.mm.ui.anim.transition.MMTransitionHelper$a r4 = r4.mo81991b(r6)
            boolean r5 = r4.f165038b
            if (r5 == 0) goto L_0x011e
            boolean r4 = r4.f165042f
            if (r4 != 0) goto L_0x011e
            r4 = 1
            goto L_0x011f
        L_0x011e:
            r4 = 0
        L_0x011f:
            if (r4 != r13) goto L_0x0123
            r4 = 1
            goto L_0x0124
        L_0x0123:
            r4 = 0
        L_0x0124:
            if (r4 == 0) goto L_0x012c
            if (r2 != 0) goto L_0x012c
            r3.mo81999g(r12)
            goto L_0x012f
        L_0x012c:
            r3.mo81999g(r13)
        L_0x012f:
            th0.a r3 = th0.C101880a.f299976a
            r4 = 1
            ig.d r5 = r1.f173953f
            com.tencent.mm.storage.f4 r6 = r1.f173951d
            r9 = 1
            r10 = 0
            r8 = r25
            r3.mo141348e(r4, r5, r6, r7, r8, r9, r10)
            ig.d r2 = r1.f173953f
            int r2 = r2.mo55274P()
            r3 = 4
            if (r2 != r3) goto L_0x0148
            r2 = 1
            goto L_0x0149
        L_0x0148:
            r2 = 0
        L_0x0149:
            r3 = 2131296896(0x7f090280, float:1.8211722E38)
            android.view.View r3 = r0.mo85812D(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r4 = 2131296849(0x7f090251, float:1.8211626E38)
            android.view.View r0 = r0.mo85812D(r4)
            if (r2 == 0) goto L_0x023a
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r2.mo10233c(r4)
            java.lang.Object[] r15 = r2.mo10232b()
            java.lang.String r16 = "com/tencent/mm/album/ui/c2c/gallery/AlbumConvert"
            java.lang.String r17 = "checkVideoVisibility"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/album/ui/c2c/gallery/AlbumItem;Z)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r0
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r2 = r2.mo10231a(r12)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r15 = "com/tencent/mm/album/ui/c2c/gallery/AlbumConvert"
            java.lang.String r16 = "checkVideoVisibility"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/album/ui/c2c/gallery/AlbumItem;Z)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            r3.setVisibility(r12)
            r0 = 2131301222(0x7f091366, float:1.8220496E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            ig.d r1 = r1.f173953f
            long r1 = r1.mo55278R()
            java.lang.String r3 = "format(locale, format, *args)"
            r4 = 2
            r5 = 60
            r6 = 3600(0xe10, double:1.7786E-320)
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x01e5
            java.util.Locale r6 = java.util.Locale.US
            r7 = 3
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r9 = 3600(0xe10, float:5.045E-42)
            long r9 = (long) r9
            long r14 = r1 / r9
            java.lang.Long r11 = java.lang.Long.valueOf(r14)
            r8[r12] = r11
            long r9 = r1 % r9
            long r11 = (long) r5
            long r9 = r9 / r11
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r8[r13] = r5
            long r1 = r1 % r11
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r8[r4] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r7)
            java.lang.String r2 = "%d:%02d:%02d"
            java.lang.String r1 = java.lang.String.format(r6, r2, r1)
            gy3.C87412m.m108593f(r1, r3)
            goto L_0x022e
        L_0x01e5:
            r6 = 600(0x258, double:2.964E-321)
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x020d
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r7 = new java.lang.Object[r4]
            long r8 = (long) r5
            long r10 = r1 / r8
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r7[r12] = r5
            long r1 = r1 % r8
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r7[r13] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r7, r4)
            java.lang.String r2 = "%d:%02d"
            java.lang.String r1 = java.lang.String.format(r6, r2, r1)
            gy3.C87412m.m108593f(r1, r3)
            goto L_0x022e
        L_0x020d:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r7 = new java.lang.Object[r4]
            long r8 = (long) r5
            long r10 = r1 / r8
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r7[r12] = r5
            long r1 = r1 % r8
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r7[r13] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r7, r4)
            java.lang.String r2 = "%02d:%02d"
            java.lang.String r1 = java.lang.String.format(r6, r2, r1)
            gy3.C87412m.m108593f(r1, r3)
        L_0x022e:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x0236
            java.lang.String r1 = "00:00"
        L_0x0236:
            r0.setText(r1)
            goto L_0x027b
        L_0x023a:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r1.mo10233c(r2)
            java.lang.Object[] r15 = r1.mo10232b()
            java.lang.String r16 = "com/tencent/mm/album/ui/c2c/gallery/AlbumConvert"
            java.lang.String r17 = "checkVideoVisibility"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/album/ui/c2c/gallery/AlbumItem;Z)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r0
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r1 = r1.mo10231a(r12)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r15 = "com/tencent/mm/album/ui/c2c/gallery/AlbumConvert"
            java.lang.String r16 = "checkVideoVisibility"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/album/ui/c2c/gallery/AlbumItem;Z)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            r3.setVisibility(r11)
        L_0x027b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p181kg.C61084a.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        View D = oVar.mo85812D(C0966R.C0970id.cwh);
        CheckBox checkBox = (CheckBox) oVar.mo85812D(C0966R.C0970id.cvd);
        checkBox.setOnCheckedChangeListener(C61085a.f173946a);
        D.setOnClickListener(new C61086b(oVar, checkBox));
    }
}
