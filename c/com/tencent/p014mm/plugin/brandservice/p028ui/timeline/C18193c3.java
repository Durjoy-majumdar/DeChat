package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C19607d1;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.p0$$f;
import com.tencent.p014mm.storage.p0$$g;
import com.tencent.p014mm.storage.p0$$h;
import di3.C86312j;
import eb0.C45628s0;
import java.util.List;
import kg3.C76577a;
import p196ln.C76705f;
import rb0.C48009v0;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.c3 */
public class C18193c3 extends BaseAdapter {

    /* renamed from: d */
    public BizTimeLineNewMsgUI f50276d;

    /* renamed from: e */
    public List<C19623o0> f50277e;

    /* renamed from: f */
    public int f50278f;

    /* renamed from: g */
    public int f50279g;

    /* renamed from: h */
    public long f50280h;

    /* renamed from: i */
    public boolean f50281i = false;

    /* renamed from: j */
    public p0$$h f50282j = new C18194a();

    /* renamed from: n */
    public boolean f50283n = false;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.c3$a */
    public class C18194a implements p0$$h {
        public C18194a() {
        }

        /* renamed from: p */
        public void mo21358p(Object obj, p0$$f p0__f) {
            C19623o0 o0Var;
            C19623o0 o0Var2;
            if (p0__f != null) {
                p0$$g p0__g = p0__f.f55562a;
                if (p0__g == p0$$g.INSERT && (o0Var2 = p0__f.f55563b) != null) {
                    C18193c3.this.f50277e.add(0, o0Var2);
                } else if (p0__g == p0$$g.DELETE) {
                    C18193c3 c3Var = C18193c3.this;
                    if (c3Var.f50277e.size() > 0) {
                        List<C19623o0> list = c3Var.f50277e;
                        o0Var = list.get(list.size() - 1);
                    } else {
                        o0Var = null;
                    }
                    if (o0Var != null) {
                        c3Var.f50277e.clear();
                        List<C19623o0> list2 = c3Var.f50277e;
                        C19607d1 Kx0 = C48009v0.Kx0();
                        long j = o0Var.field_createTime;
                        C91753f fVar = Kx0.f55477d;
                        list2.addAll(Kx0.mo25736Yt(fVar.query("BizTimeLineSingleMsgInfo", (String[]) null, "createTime>=?", new String[]{"" + j}, (String) null, (String) null, "createTime DESC")));
                    }
                }
            }
            C18193c3.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.c3$b */
    public class C18195b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f50285d;

        public C18195b(int i) {
            this.f50285d = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r20 = this;
                r0 = r20
                int r1 = r0.f50285d
                com.tencent.mm.plugin.brandservice.ui.timeline.c3 r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18193c3.this
                int r2 = r2.getCount()
                r3 = 1
                int r2 = r2 - r3
                if (r1 != r2) goto L_0x0138
                com.tencent.mm.plugin.brandservice.ui.timeline.c3 r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18193c3.this
                boolean r1 = r1.f50283n
                if (r1 != 0) goto L_0x0138
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                int r2 = r0.f50285d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4 = 0
                r1[r4] = r2
                com.tencent.mm.plugin.brandservice.ui.timeline.c3 r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18193c3.this
                int r2 = r2.getCount()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r3] = r2
                java.lang.String r2 = "MicroMsg.BizTimeLineAdapter"
                java.lang.String r5 = "loadMoreData %d/%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
                com.tencent.mm.plugin.brandservice.ui.timeline.c3 r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18193c3.this
                java.util.List<com.tencent.mm.storage.o0> r2 = r1.f50277e
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x004c
                java.util.List<com.tencent.mm.storage.o0> r2 = r1.f50277e
                int r5 = r2.size()
                int r5 = r5 + -1
                java.lang.Object r2 = r2.get(r5)
                com.tencent.mm.storage.o0 r2 = (com.tencent.p014mm.storage.C19623o0) r2
                goto L_0x004d
            L_0x004c:
                r2 = 0
            L_0x004d:
                if (r2 != 0) goto L_0x0050
                goto L_0x0090
            L_0x0050:
                com.tencent.mm.storage.d1 r5 = rb0.C48009v0.Kx0()
                long r6 = r2.field_createTime
                zh3.f r8 = r5.f55477d
                java.lang.String[] r12 = new java.lang.String[r3]
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r9 = ""
                r2.append(r9)
                r2.append(r6)
                java.lang.String r2 = r2.toString()
                r12[r4] = r2
                r10 = 0
                r13 = 0
                r14 = 0
                java.lang.String r9 = "BizTimeLineSingleMsgInfo"
                java.lang.String r11 = "createTime<?"
                java.lang.String r15 = "createTime DESC limit 20"
                android.database.Cursor r2 = r8.query(r9, r10, r11, r12, r13, r14, r15)
                java.util.List r2 = r5.mo25736Yt(r2)
                java.util.List<com.tencent.mm.storage.o0> r5 = r1.f50277e
                r5.addAll(r2)
                r1.notifyDataSetChanged()
                java.util.LinkedList r2 = (java.util.LinkedList) r2
                int r1 = r2.size()
                if (r1 <= 0) goto L_0x0090
                r1 = 1
                goto L_0x0091
            L_0x0090:
                r1 = 0
            L_0x0091:
                if (r1 != 0) goto L_0x0138
                com.tencent.mm.plugin.brandservice.ui.timeline.c3 r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18193c3.this
                r1.f50283n = r3
                com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r1 = r1.f50276d
                android.view.View r2 = r1.f50188f
                if (r2 == 0) goto L_0x0138
                android.view.View r2 = r1.f50192j
                r3 = 8
                k20.a r13 = new k20.a
                r13.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r13.mo10233c(r3)
                java.lang.Object[] r6 = r13.mo10232b()
                java.lang.String r7 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI"
                java.lang.String r8 = "noMoreData"
                java.lang.String r9 = "()V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                r5 = r2
                j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.Object r3 = r13.mo10231a(r4)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2.setVisibility(r3)
                java.lang.String r6 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI"
                java.lang.String r7 = "noMoreData"
                java.lang.String r8 = "()V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
                android.view.View r2 = r1.f50193n
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r3.mo10233c(r5)
                java.lang.Object[] r13 = r3.mo10232b()
                java.lang.String r14 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI"
                java.lang.String r15 = "noMoreData"
                java.lang.String r16 = "()V"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                r12 = r2
                j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
                java.lang.Object r3 = r3.mo10231a(r4)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2.setVisibility(r3)
                java.lang.String r13 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI"
                java.lang.String r14 = "noMoreData"
                java.lang.String r15 = "()V"
                java.lang.String r16 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r18 = "(I)V"
                j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
                android.view.View r2 = r1.f50193n
                r3 = 2131298110(0x7f09073e, float:1.8214184E38)
                android.view.View r2 = r2.findViewById(r3)
                android.widget.TextView r2 = (android.widget.TextView) r2
                if (r2 == 0) goto L_0x0138
                r3 = 2131822704(0x7f110870, float:1.9278187E38)
                java.lang.String r1 = r1.getString(r3)
                r2.setText(r1)
            L_0x0138:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18193c3.C18195b.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.c3$c */
    public static class C18196c {

        /* renamed from: a */
        public View f50287a;

        /* renamed from: b */
        public ImageView f50288b;

        /* renamed from: c */
        public TextView f50289c;

        /* renamed from: d */
        public TextView f50290d;

        /* renamed from: e */
        public TextView f50291e;

        /* renamed from: f */
        public TextView f50292f;

        /* renamed from: g */
        public View f50293g;

        /* renamed from: h */
        public ViewGroup f50294h;
    }

    public C18193c3(BizTimeLineNewMsgUI bizTimeLineNewMsgUI, List<C19623o0> list, int i, int i2, long j) {
        this.f50276d = bizTimeLineNewMsgUI;
        C19607d1 Kx0 = C48009v0.Kx0();
        Kx0.f55478e.add(this.f50282j, Looper.getMainLooper());
        this.f50277e = list;
        this.f50278f = i;
        this.f50279g = i2;
        this.f50280h = j;
    }

    /* renamed from: a */
    public C19623o0 getItem(int i) {
        if (i < this.f50277e.size()) {
            return this.f50277e.get(i);
        }
        return null;
    }

    /* renamed from: b */
    public void mo22800b(int i) {
        if ((this.f50278f != 1 || this.f50281i) && i == getCount() - 1 && !this.f50283n) {
            MMHandlerThread.postToMainThreadDelayed(new C18195b(i), 300);
        }
    }

    /* renamed from: d */
    public final void mo22801d(ImageView imageView, String str) {
        Class cls = C76705f.class;
        if (C45628s0.m50738C(str)) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = C76577a.m92151b(MMApplicationContext.getContext(), 40);
            layoutParams.height = C76577a.m92151b(MMApplicationContext.getContext(), 40);
            imageView.setLayoutParams(layoutParams);
            ((C76705f) C86312j.m106911c(cls)).mo106822J5(imageView, str);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.width = C76577a.m92151b(MMApplicationContext.getContext(), 36);
        layoutParams2.height = C76577a.m92151b(MMApplicationContext.getContext(), 36);
        imageView.setLayoutParams(layoutParams2);
        ((C76705f) C86312j.m106911c(cls)).mo106849z(imageView, str);
    }

    public int getCount() {
        return this.f50277e.size();
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x048f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r30, android.view.View r31, android.view.ViewGroup r32) {
        /*
            r29 = this;
            r0 = r29
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            com.tencent.mm.storage.o0 r2 = r29.getItem(r30)
            if (r2 != 0) goto L_0x0012
            java.lang.String r1 = "MicroMsg.BizTimeLineAdapter"
            java.lang.String r2 = "getView info is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            return r31
        L_0x0012:
            java.lang.String r3 = r2.field_talker
            r4 = 0
            if (r31 != 0) goto L_0x0084
            com.tencent.mm.plugin.brandservice.ui.timeline.c3$c r5 = new com.tencent.mm.plugin.brandservice.ui.timeline.c3$c
            r5.<init>()
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r6 = r0.f50276d
            r7 = 2131493329(0x7f0c01d1, float:1.8610135E38)
            android.view.View r6 = android.view.View.inflate(r6, r7, r4)
            r5.f50287a = r6
            r7 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r5.f50288b = r7
            r7 = 2131310269(0x7f0936bd, float:1.8238845E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f50289c = r7
            fy0.i r8 = fy0.C8219i.f27144a
            r8.mo9271b(r7)
            r7 = 2131315233(0x7f094a21, float:1.8248913E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f50290d = r7
            r7 = 2131315432(0x7f094ae8, float:1.8249317E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f50291e = r7
            r7 = 2131315433(0x7f094ae9, float:1.824932E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f50292f = r7
            r7 = 2131298225(0x7f0907b1, float:1.8214417E38)
            android.view.View r7 = r6.findViewById(r7)
            r5.f50293g = r7
            r7 = 2131298013(0x7f0906dd, float:1.8213987E38)
            android.view.View r7 = r6.findViewById(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r5.f50294h = r7
            r7 = 2131298016(0x7f0906e0, float:1.8213993E38)
            android.view.View r7 = r6.findViewById(r7)
            com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView r7 = (com.tencent.p014mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView) r7
            r6.setTag(r5)
            goto L_0x008c
        L_0x0084:
            java.lang.Object r5 = r31.getTag()
            com.tencent.mm.plugin.brandservice.ui.timeline.c3$c r5 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18193c3.C18196c) r5
            r6 = r31
        L_0x008c:
            android.view.ViewGroup r7 = r5.f50294h
            r8 = 8
            r7.setVisibility(r8)
            boolean r7 = r2.mo25757E2()
            r9 = 2131231871(0x7f08047f, float:1.8079835E38)
            r10 = 1
            if (r7 == 0) goto L_0x00e4
            java.lang.Class<f62.k0> r7 = f62.C75700k0.class
            k40.a r7 = f40.C86709a0.m107533q(r7)
            f62.k0 r7 = (f62.C75700k0) r7
            com.tencent.mm.storage.u3 r7 = r7.mo96097Ni()
            java.lang.String r11 = r2.field_talker
            com.tencent.mm.storage.z1 r7 = r7.get(r11)
            if (r7 == 0) goto L_0x00bf
            boolean r7 = r7.mo62927s3()
            if (r7 == 0) goto L_0x00bf
            android.widget.ImageView r7 = r5.f50288b
            java.lang.String r9 = r2.field_talker
            r0.mo22801d(r7, r9)
            goto L_0x012c
        L_0x00bf:
            com.tencent.mm.storage.i0 r7 = r2.mo25771u2()
            if (r7 == 0) goto L_0x012c
            hc0.c$b r7 = new hc0.c$b
            r7.<init>()
            r7.f59359o = r9
            r7.f59347c = r10
            r7.f59364t = r10
            gc0.a r9 = gc0.C20828a.m22825b()
            com.tencent.mm.storage.i0 r11 = r2.mo25771u2()
            java.lang.String r11 = r11.f55494d
            android.widget.ImageView r12 = r5.f50288b
            hc0.c r7 = r7.mo32666a()
            r9.mo32519h(r11, r12, r7)
            goto L_0x012c
        L_0x00e4:
            boolean r7 = r2.mo25755C2()
            if (r7 == 0) goto L_0x0125
            java.lang.String r7 = com.tencent.p014mm.storage.C19615i1.m21056c(r2)
            boolean r11 = android.text.TextUtils.isEmpty(r7)
            if (r11 != 0) goto L_0x010d
            hc0.c$b r11 = new hc0.c$b
            r11.<init>()
            r11.f59359o = r9
            r11.f59347c = r10
            r11.f59364t = r10
            gc0.a r9 = gc0.C20828a.m22825b()
            android.widget.ImageView r12 = r5.f50288b
            hc0.c r11 = r11.mo32666a()
            r9.mo32519h(r7, r12, r11)
            goto L_0x012c
        L_0x010d:
            java.lang.String r7 = com.tencent.p014mm.storage.C19615i1.m21063j(r2)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r9 == 0) goto L_0x011f
            android.widget.ImageView r7 = r5.f50288b
            java.lang.String r9 = r2.field_talker
            r0.mo22801d(r7, r9)
            goto L_0x012c
        L_0x011f:
            android.widget.ImageView r9 = r5.f50288b
            r0.mo22801d(r9, r7)
            goto L_0x012c
        L_0x0125:
            android.widget.ImageView r7 = r5.f50288b
            java.lang.String r9 = r2.field_talker
            r0.mo22801d(r7, r9)
        L_0x012c:
            boolean r7 = r2.mo25757E2()
            if (r7 == 0) goto L_0x0139
            com.tencent.mm.storage.i0 r7 = r2.mo25771u2()
            java.lang.String r7 = r7.f55492b
            goto L_0x0147
        L_0x0139:
            java.lang.Class<d62.i> r7 = d62.C75339i.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            d62.i r7 = (d62.C75339i) r7
            java.lang.String r9 = r2.field_talker
            java.lang.String r7 = r7.getDisplayName(r9)
        L_0x0147:
            android.widget.TextView r9 = r5.f50291e
            r11 = 2147483647(0x7fffffff, float:NaN)
            r9.setMaxLines(r11)
            android.widget.TextView r9 = r5.f50292f
            r9.setVisibility(r8)
            android.widget.TextView r8 = r5.f50289c
            di3.d r9 = di3.C86312j.m106911c(r1)
            ny.h r9 = (p629ny.C76979h) r9
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r11 = r0.f50276d
            android.widget.TextView r12 = r5.f50289c
            float r12 = r12.getTextSize()
            android.text.SpannableString r7 = r9.yp0(r11, r7, r12)
            r8.setText(r7)
            android.widget.TextView r7 = r5.f50290d
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r8 = r0.f50276d
            long r11 = r2.field_createTime
            java.lang.String r8 = fy0.C8218c.m8301a(r8, r11)
            r7.setText(r8)
            boolean r7 = r2.mo25754B2()
            r8 = 4
            r9 = 0
            if (r7 == 0) goto L_0x019c
            java.lang.String r1 = r2.field_content
            java.lang.String r1 = com.tencent.p014mm.message.C92721n.m116883k(r1)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 == 0) goto L_0x0195
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r1 = r0.f50276d
            r4 = 2131822678(0x7f110856, float:1.9278134E38)
            java.lang.String r1 = r1.getString(r4)
        L_0x0195:
            android.widget.TextView r4 = r5.f50291e
            r4.setText(r1)
            goto L_0x0441
        L_0x019c:
            boolean r7 = r2.mo25760H2()
            if (r7 != 0) goto L_0x03ea
            int r7 = r2.field_type
            r11 = 10000(0x2710, float:1.4013E-41)
            if (r7 != r11) goto L_0x01aa
            r7 = 1
            goto L_0x01ab
        L_0x01aa:
            r7 = 0
        L_0x01ab:
            if (r7 == 0) goto L_0x01af
            goto L_0x03ea
        L_0x01af:
            boolean r7 = r2.mo25757E2()
            if (r7 == 0) goto L_0x01c2
            android.widget.TextView r1 = r5.f50291e
            com.tencent.mm.storage.i0 r4 = r2.mo25771u2()
            java.lang.String r4 = r4.f55495e
            r1.setText(r4)
            goto L_0x0441
        L_0x01c2:
            boolean r7 = r2.mo25756D2()
            r11 = 2131821636(0x7f110444, float:1.927602E38)
            if (r7 == 0) goto L_0x0216
            android.text.SpannableStringBuilder r1 = com.tencent.p014mm.storage.C19615i1.m21060g(r2, r9)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r1)
            if (r4 != 0) goto L_0x0209
            android.widget.TextView r4 = r5.f50291e
            r4.setText(r1)
            android.widget.TextView r1 = r5.f50291e
            com.tencent.p014mm.storage.C19615i1.m21068o(r2, r9, r1)
            android.text.SpannableStringBuilder r1 = com.tencent.p014mm.storage.C19615i1.m21060g(r2, r10)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r1)
            if (r4 != 0) goto L_0x01f8
            android.widget.TextView r4 = r5.f50292f
            r4.setText(r1)
            android.widget.TextView r1 = r5.f50292f
            r1.setVisibility(r9)
            android.widget.TextView r1 = r5.f50292f
            com.tencent.p014mm.storage.C19615i1.m21068o(r2, r10, r1)
        L_0x01f8:
            java.lang.String r1 = com.tencent.p014mm.storage.C19615i1.m21059f(r2)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 != 0) goto L_0x0441
            android.widget.TextView r4 = r5.f50289c
            r4.setText(r1)
            goto L_0x0441
        L_0x0209:
            android.widget.TextView r1 = r5.f50291e
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r4 = r0.f50276d
            java.lang.String r4 = r4.getString(r11)
            r1.setText(r4)
            goto L_0x0441
        L_0x0216:
            int r7 = r2.field_type
            r12 = 34
            if (r7 != r12) goto L_0x021e
            r12 = 1
            goto L_0x021f
        L_0x021e:
            r12 = 0
        L_0x021f:
            if (r12 == 0) goto L_0x0231
            android.widget.TextView r1 = r5.f50291e
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r4 = r0.f50276d
            r7 = 2131821732(0x7f1104a4, float:1.9276215E38)
            java.lang.String r4 = r4.getString(r7)
            r1.setText(r4)
            goto L_0x0441
        L_0x0231:
            r12 = 43
            if (r7 != r12) goto L_0x0237
            r12 = 1
            goto L_0x0238
        L_0x0237:
            r12 = 0
        L_0x0238:
            r13 = 2131821728(0x7f1104a0, float:1.9276207E38)
            if (r12 == 0) goto L_0x024a
            android.widget.TextView r1 = r5.f50291e
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r4 = r0.f50276d
            java.lang.String r4 = r4.getString(r13)
            r1.setText(r4)
            goto L_0x0441
        L_0x024a:
            r12 = 42
            if (r7 == r12) goto L_0x0255
            r12 = 66
            if (r7 != r12) goto L_0x0253
            goto L_0x0255
        L_0x0253:
            r7 = 0
            goto L_0x0256
        L_0x0255:
            r7 = 1
        L_0x0256:
            r12 = 2131821646(0x7f11044e, float:1.9276041E38)
            if (r7 == 0) goto L_0x0268
            android.widget.TextView r1 = r5.f50291e
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r4 = r0.f50276d
            java.lang.String r4 = r4.getString(r12)
            r1.setText(r4)
            goto L_0x0441
        L_0x0268:
            boolean r7 = com.tencent.p014mm.storage.C19615i1.m21054a(r2)
            java.lang.String r14 = ""
            if (r7 == 0) goto L_0x02e0
            android.widget.TextView r1 = r5.f50291e
            android.text.SpannableStringBuilder r3 = com.tencent.p014mm.storage.C19615i1.m21058e(r2, r9)
            r1.setText(r3)
            android.widget.TextView r1 = r5.f50291e
            com.tencent.p014mm.storage.C19615i1.m21069p(r2, r9, r1)
            android.text.SpannableStringBuilder r1 = com.tencent.p014mm.storage.C19615i1.m21058e(r2, r10)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r1)
            if (r3 != 0) goto L_0x0297
            android.widget.TextView r3 = r5.f50292f
            r3.setText(r1)
            android.widget.TextView r1 = r5.f50292f
            r1.setVisibility(r9)
            android.widget.TextView r1 = r5.f50292f
            com.tencent.p014mm.storage.C19615i1.m21069p(r2, r10, r1)
        L_0x0297:
            java.util.Map r1 = com.tencent.p014mm.storage.C19615i1.m21064k(r2)
            if (r1 != 0) goto L_0x029e
            goto L_0x02c9
        L_0x029e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ".msg.appmsg.mmreader.notify_msg.title2"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x02ae
            r4 = r14
        L_0x02ae:
            r3.append(r4)
            r4 = 32
            r3.append(r4)
            java.lang.String r4 = ".msg.appmsg.mmreader.notify_msg.action"
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x02c1
            goto L_0x02c2
        L_0x02c1:
            r14 = r1
        L_0x02c2:
            r3.append(r14)
            java.lang.String r14 = r3.toString()
        L_0x02c9:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r1 != 0) goto L_0x02d4
            android.widget.TextView r1 = r5.f50289c
            r1.setText(r14)
        L_0x02d4:
            java.lang.String r3 = com.tencent.p014mm.storage.C19615i1.m21063j(r2)
            int r1 = com.tencent.p014mm.storage.C19615i1.m21062i(r2)
            r13 = r1
            r11 = r3
            goto L_0x0443
        L_0x02e0:
            int r7 = r2.field_type
            r15 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r15
            r15 = 49
            if (r7 != r15) goto L_0x02ec
            r7 = 1
            goto L_0x02ed
        L_0x02ec:
            r7 = 0
        L_0x02ed:
            r15 = 2131822692(0x7f110864, float:1.9278163E38)
            if (r7 == 0) goto L_0x03de
            java.lang.String r7 = r2.field_content
            com.tencent.mm.message.l$b r4 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r7, r4)
            if (r4 != 0) goto L_0x0307
            android.widget.TextView r1 = r5.f50291e
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r4 = r0.f50276d
            java.lang.String r4 = r4.getString(r15)
            r1.setText(r4)
            goto L_0x0441
        L_0x0307:
            int r7 = r4.f195582i
            if (r7 == r10) goto L_0x03ba
            r15 = 2
            if (r7 == r15) goto L_0x03b3
            r11 = 3
            if (r7 == r11) goto L_0x0398
            if (r7 == r8) goto L_0x0380
            r11 = 5
            if (r7 == r11) goto L_0x0363
            r11 = 16
            if (r7 == r11) goto L_0x0349
            r11 = 2001(0x7d1, float:2.804E-42)
            if (r7 == r11) goto L_0x032a
            r11 = 436207665(0x1a000031, float:2.6469934E-23)
            if (r7 == r11) goto L_0x032a
            r11 = 469762097(0x1c000031, float:4.2351895E-22)
            if (r7 == r11) goto L_0x032a
            goto L_0x03bc
        L_0x032a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "["
            r7.append(r11)
            java.lang.String r11 = r4.f195596l1
            r7.append(r11)
            java.lang.String r11 = "]"
            r7.append(r11)
            java.lang.String r11 = r4.f195580h1
            r7.append(r11)
            java.lang.String r14 = r7.toString()
            goto L_0x03bc
        L_0x0349:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r11 = r0.f50276d
            java.lang.String r11 = r11.getString(r12)
            r7.append(r11)
            java.lang.String r11 = r4.mo93550m()
            r7.append(r11)
            java.lang.String r14 = r7.toString()
            goto L_0x03bc
        L_0x0363:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r11 = r0.f50276d
            r12 = 2131821721(0x7f110499, float:1.9276193E38)
            java.lang.String r11 = r11.getString(r12)
            r7.append(r11)
            java.lang.String r11 = r4.mo93550m()
            r7.append(r11)
            java.lang.String r14 = r7.toString()
            goto L_0x03bc
        L_0x0380:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r11 = r0.f50276d
            java.lang.String r11 = r11.getString(r13)
            r7.append(r11)
            java.lang.String r11 = r4.f195570f
            r7.append(r11)
            java.lang.String r14 = r7.toString()
            goto L_0x03bc
        L_0x0398:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r11 = r0.f50276d
            r12 = 2131821602(0x7f110422, float:1.9275952E38)
            java.lang.String r11 = r11.getString(r12)
            r7.append(r11)
            java.lang.String r11 = r4.f195570f
            r7.append(r11)
            java.lang.String r14 = r7.toString()
            goto L_0x03bc
        L_0x03b3:
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r7 = r0.f50276d
            java.lang.String r14 = r7.getString(r11)
            goto L_0x03bc
        L_0x03ba:
            java.lang.String r14 = r4.f195570f
        L_0x03bc:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r7 == 0) goto L_0x03c6
            java.lang.String r14 = r4.mo93550m()
        L_0x03c6:
            android.widget.TextView r4 = r5.f50291e
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r7 = r0.f50276d
            android.widget.TextView r11 = r5.f50291e
            float r11 = r11.getTextSize()
            android.text.SpannableString r1 = r1.yp0(r7, r14, r11)
            r4.setText(r1)
            goto L_0x0441
        L_0x03de:
            android.widget.TextView r1 = r5.f50291e
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r4 = r0.f50276d
            java.lang.String r4 = r4.getString(r15)
            r1.setText(r4)
            goto L_0x0441
        L_0x03ea:
            android.text.SpannableStringBuilder r4 = com.tencent.p014mm.storage.C19615i1.m21060g(r2, r9)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r4)
            if (r7 != 0) goto L_0x0427
            android.widget.TextView r1 = r5.f50291e
            r1.setText(r4)
            android.widget.TextView r1 = r5.f50291e
            com.tencent.p014mm.storage.C19615i1.m21068o(r2, r9, r1)
            android.text.SpannableStringBuilder r1 = com.tencent.p014mm.storage.C19615i1.m21060g(r2, r10)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r1)
            if (r4 != 0) goto L_0x0441
            android.widget.TextView r4 = r5.f50292f
            r4.setText(r1)
            android.widget.TextView r1 = r5.f50292f
            r1.setVisibility(r9)
            android.widget.TextView r1 = r5.f50292f
            com.tencent.p014mm.storage.C19615i1.m21068o(r2, r10, r1)
            java.lang.String r1 = com.tencent.p014mm.storage.C19615i1.m21059f(r2)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 != 0) goto L_0x0441
            android.widget.TextView r4 = r5.f50289c
            r4.setText(r1)
            goto L_0x0441
        L_0x0427:
            android.widget.TextView r4 = r5.f50291e
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI r7 = r0.f50276d
            java.lang.String r11 = r2.field_content
            android.widget.TextView r12 = r5.f50291e
            float r12 = r12.getTextSize()
            int r12 = (int) r12
            android.text.SpannableString r1 = r1.Dv0(r7, r11, r12, r10)
            r4.setText(r1)
        L_0x0441:
            r11 = r3
            r13 = 0
        L_0x0443:
            int r1 = r29.getCount()
            int r1 = r1 - r10
            r3 = r30
            if (r3 != r1) goto L_0x048f
            android.view.View r1 = r5.f50293g
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4.mo10233c(r5)
            java.lang.Object[] r15 = r4.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgAdapter"
            java.lang.String r17 = "getView"
            java.lang.String r18 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r1
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r4 = r4.mo10231a(r9)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r15 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgAdapter"
            java.lang.String r16 = "getView"
            java.lang.String r17 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x04d2
        L_0x048f:
            android.view.View r1 = r5.f50293g
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r4.mo10233c(r5)
            java.lang.Object[] r22 = r4.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgAdapter"
            java.lang.String r24 = "getView"
            java.lang.String r25 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r1
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r4 = r4.mo10231a(r9)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r22 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgAdapter"
            java.lang.String r23 = "getView"
            java.lang.String r24 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
        L_0x04d2:
            r29.mo22800b(r30)
            r12 = 0
            long r14 = r2.field_msgId
            int r1 = r0.f50279g
            int r2 = r0.f50278f
            int r18 = r2 + -1
            long r4 = r0.f50280h
            int r2 = (int) r4
            r16 = r30
            r17 = r1
            r19 = r2
            com.tencent.p014mm.storage.C19615i1.m21067n(r11, r12, r13, r14, r16, r17, r18, r19)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18193c3.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
