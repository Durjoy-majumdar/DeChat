package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.util.Pair;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bp3.C67301m;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.PatMessageExpandReportStruct;
import com.tencent.p014mm.p136ui.chatting.component.C73657y2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76874e0;
import qo3.C77407n;
import te3.C64418hb3;
import te3.C77946ib3;
import ud2.C78150h;
import vd2.C78384d;
import zj3.C79382t;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.a3 */
public class C73921a3 extends C74023i {

    /* renamed from: v */
    public C73924c f216980v;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.a3$a */
    public class C73922a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C73657y2 f216981d;

        /* renamed from: e */
        public final /* synthetic */ C67391b f216982e;

        public C73922a(C73657y2 y2Var, C67391b bVar) {
            this.f216981d = y2Var;
            this.f216982e = bVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgPat$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getTag() != null && (view.getTag() instanceof Long)) {
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(((Long) view.getTag()).longValue());
                C73657y2 y2Var = this.f216981d;
                if (y2Var != null) {
                    y2Var.mo102364Q1(b002.getMsgId());
                }
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgPat$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgPat$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C64418hb3 bB = ((C78384d) C86312j.m106911c(C78384d.class)).mo108125bB(b002.getContent());
                C73921a3.this.mo103006o0(this.f216982e, b002, bB, bB.f183464e.size());
                PatMessageExpandReportStruct patMessageExpandReportStruct = new PatMessageExpandReportStruct();
                patMessageExpandReportStruct.f194321f = patMessageExpandReportStruct.mo86045b("ChatUsername", this.f216982e.mo91577r(), true);
                patMessageExpandReportStruct.f194320e = patMessageExpandReportStruct.mo86045b("Username", this.f216982e.f193285i, true);
                patMessageExpandReportStruct.f194322g = bB.f183464e.size();
                if (C72996z1.m85807K5(this.f216982e.mo91577r())) {
                    patMessageExpandReportStruct.f194319d = 2;
                } else {
                    patMessageExpandReportStruct.f194319d = 1;
                }
                patMessageExpandReportStruct.mo86054n();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgPat$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.a3$b */
    public class C73923b implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C67391b f216984d;

        public C73923b(C67391b bVar) {
            this.f216984d = bVar;
        }

        public boolean onLongClick(View view) {
            C74243t8 t8Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgPat$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            if (!(!((C78150h) C86312j.m106911c(C78150h.class)).zx0() || (t8Var = (C74243t8) view.getTag()) == null || t8Var.f212238a == null)) {
                int indexOfChild = ((ViewGroup) view.getParent()).indexOfChild(view);
                Log.m105925i("MicroMsg.ChattingItemAppMsgPat", "long click msg %d, index %d", Long.valueOf(t8Var.f212238a.getMsgId()), Integer.valueOf(indexOfChild));
                C64418hb3 d = C67301m.m79639d(t8Var.f212238a.getContent());
                if (indexOfChild < d.f183464e.size()) {
                    C77946ib3 ib32 = d.f183464e.get(indexOfChild);
                    if (C75592q0.m90789s().equals(ib32.f227607d)) {
                        long c = C31543z5.m39453c();
                        long j = ib32.f227610g;
                        if (c - j <= 120000) {
                            C73921a3 a3Var = C73921a3.this;
                            C67391b bVar = this.f216984d;
                            Pair create = Pair.create(Long.valueOf(t8Var.f212238a.getMsgId()), Long.valueOf(ib32.f227610g));
                            a3Var.getClass();
                            C77407n nVar = new C77407n((Context) bVar.mo91565f(), 1, true);
                            nVar.mo107568m(bVar.mo91565f().getString(C0966R.string.i4l), 1, C76577a.m92151b(bVar.mo91565f(), 14));
                            nVar.f225771i = new C73933b3(a3Var, bVar);
                            nVar.f225782p = new C73944c3(a3Var, create);
                            nVar.f225761d = new C73950d3(a3Var, create);
                            nVar.mo107573q();
                        } else {
                            Log.m105929w("MicroMsg.ChattingItemAppMsgPat", "expire revoke time %d", Long.valueOf(j));
                        }
                        C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgPat$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                        return true;
                    }
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgPat$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.a3$c */
    public static final class C73924c extends C74023i.C74026c {

        /* renamed from: b */
        public LinearLayout f216986b;

        /* renamed from: c */
        public TextView f216987c;

        /* renamed from: a */
        public C73924c mo103009a(View view) {
            super.create(view);
            this.f216986b = (LinearLayout) view.findViewById(C0966R.C0970id.hri);
            this.f216987c = (TextView) view.findViewById(C0966R.C0970id.ebl);
            this.maskView = view.findViewById(C0966R.C0970id.b7h);
            return this;
        }

        public View getMainContainerView() {
            return null;
        }
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6855qd);
        C73924c cVar = new C73924c();
        cVar.mo103009a(n4Var);
        n4Var.setTag(cVar);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: S */
    public boolean mo82213S() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        C67391b bVar2 = bVar;
        C72963f4 f4Var2 = f4Var;
        Class cls = C78384d.class;
        Log.m105925i("MicroMsg.ChattingItemAppMsgPat", "fill item %s, msgId %d", Integer.valueOf(cVar.getAdapterPosition()), Long.valueOf(f4Var.getMsgId()));
        this.f216980v = (C73924c) cVar;
        String content = f4Var.getContent();
        C64418hb3 bB = ((C78384d) C86312j.m106911c(cls)).mo108125bB(content);
        int size = bB.f183464e.size();
        boolean Xo0 = ((C78384d) C86312j.m106911c(cls)).Xo0(f4Var.getMsgId());
        ((C79382t) bVar2.f193278b.mo102812a(C79382t.class)).mo109368c2(f4Var2, size, Xo0);
        Log.m105925i("MicroMsg.ChattingItemAppMsgPat", "content:%s, talker:%s, recordNum:%d", Util.secPrint(content), bB.f183463d, Integer.valueOf(size));
        if (size > 0) {
            C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Ex0(str);
            if (size < 5 || Ex0.getMsgId() == f4Var.getMsgId()) {
                Xo0 = false;
            }
            C73657y2 y2Var = (C73657y2) bVar2.f193278b.mo102812a(C73657y2.class);
            boolean z = y2Var != null && y2Var.mo102367l3(f4Var.getMsgId());
            Log.m105925i("MicroMsg.ChattingItemAppMsgPat", "need fold %s, hasExpanded %s", Boolean.valueOf(Xo0), Boolean.valueOf(z));
            boolean z2 = Xo0 & (!z);
            if (z2) {
                size = 3;
            }
            mo103006o0(bVar2, f4Var2, bB, size);
            this.f216980v.f216987c.setTag(Long.valueOf(f4Var.getMsgId()));
            if (z2) {
                this.f216980v.f216987c.setVisibility(0);
                this.f216980v.f216987c.setOnClickListener(new C73922a(y2Var, bVar2));
                return;
            }
            this.f216980v.f216987c.setVisibility(8);
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == 889192497 || i == 922746929;
    }

    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0352 A[SYNTHETIC] */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103006o0(ck3.C67391b r21, com.tencent.p014mm.storage.C72963f4 r22, te3.C64418hb3 r23, int r24) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r23
            r4 = 2
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.util.LinkedList<te3.ib3> r5 = r3.f183464e
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r0[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r24)
            r7 = 1
            r0[r7] = r5
            java.lang.String r5 = "MicroMsg.ChattingItemAppMsgPat"
            java.lang.String r8 = "fll msg view contains record %d , show %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r0)
            com.tencent.mm.ui.chatting.viewitems.a3$c r0 = r1.f216980v
            android.widget.LinearLayout r0 = r0.f216986b
            r0.removeAllViews()
            android.app.Activity r8 = r21.mo91565f()
            r9 = r24
            r10 = 0
        L_0x0032:
            if (r10 >= r9) goto L_0x0388
            com.tencent.mm.ui.widget.MMNeat7extView r11 = new com.tencent.mm.ui.widget.MMNeat7extView
            r11.<init>(r8)
            android.content.res.Resources r0 = r8.getResources()
            r12 = 2131165537(0x7f070161, float:1.7945294E38)
            int r0 = r0.getDimensionPixelSize(r12)
            float r0 = (float) r0
            float r12 = kg3.C76577a.m92165p(r8)
            float r0 = r0 * r12
            r11.mo154994l(r6, r0)
            android.content.res.Resources r0 = r8.getResources()
            r12 = 2131165564(0x7f07017c, float:1.7945349E38)
            int r0 = r0.getDimensionPixelSize(r12)
            android.content.res.Resources r13 = r8.getResources()
            int r13 = r13.getDimensionPixelSize(r12)
            android.content.res.Resources r14 = r8.getResources()
            int r14 = r14.getDimensionPixelSize(r12)
            android.content.res.Resources r15 = r8.getResources()
            int r15 = r15.getDimensionPixelSize(r12)
            r11.setPadding(r0, r13, r14, r15)
            r11.setTextGravity(r7)
            r11.setClickable(r7)
            java.util.LinkedList<te3.ib3> r0 = r3.f183464e
            java.lang.Object r0 = r0.get(r10)
            r13 = r0
            te3.ib3 r13 = (te3.C77946ib3) r13
            java.lang.String r14 = ""
            java.lang.Class<ud2.h> r0 = ud2.C78150h.class
            java.lang.String r15 = eb0.C75592q0.m90789s()
            di3.d r16 = di3.C86312j.m106911c(r0)
            ud2.h r16 = (ud2.C78150h) r16
            r16.getClass()
            java.lang.Class<lc3.b> r16 = lc3.C10485b.class
            k40.a r16 = f40.C86709a0.m107533q(r16)
            lc3.b r16 = (lc3.C10485b) r16
            pj.f r12 = r16.vh0()
            java.lang.String r6 = "SendPatUserShowBitVal"
            int r6 = r12.mo107404b(r6, r4)
            r6 = r6 & r7
            if (r6 == 0) goto L_0x00ab
            r6 = 1
            goto L_0x00ac
        L_0x00ab:
            r6 = 0
        L_0x00ac:
            r12 = 3
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.String r12 = r13.f227609f
            r16 = 0
            r4[r16] = r12
            r12 = r10
            long r9 = r13.f227610g
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r4[r7] = r9
            int r9 = r13.f227611h
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 2
            r4[r10] = r9
            java.lang.String r9 = "show template:%s, createTime:%d, readStatus:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r9, r4)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ud2.h r0 = (ud2.C78150h) r0
            java.lang.String r4 = r21.mo91577r()
            vd2.h r0 = r0.Bx0(r13, r4)
            android.text.SpannableString r4 = new android.text.SpannableString
            java.lang.String r9 = r0.f229703a
            r4.<init>(r9)
            java.lang.String r9 = r13.f227608e
            boolean r9 = r9.equals(r15)
            r15 = -2
            uc0.b r7 = uc0.C52517f0.vx0()     // Catch:{ Exception -> 0x0262 }
            java.lang.String r10 = r21.mo91577r()     // Catch:{ Exception -> 0x0262 }
            uc0.a r7 = r7.mo73451jo(r10)     // Catch:{ Exception -> 0x0262 }
            eb0.c r10 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0262 }
            com.tencent.mm.storage.v1 r10 = r10.mo105906u()     // Catch:{ Exception -> 0x0262 }
            r3 = 12311(0x3017, float:1.7251E-41)
            r18 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0210 }
            java.lang.Object r3 = r10.mo119684e(r3, r12)     // Catch:{ Exception -> 0x0210 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0210 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0210 }
            android.content.res.Resources r10 = r21.mo91572m()     // Catch:{ Exception -> 0x0210 }
            r12 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r10 = r10.getColor(r12)     // Catch:{ Exception -> 0x0210 }
            if (r7 == 0) goto L_0x011f
            int r12 = r7.f146672b     // Catch:{ Exception -> 0x0210 }
            if (r12 != r15) goto L_0x0123
        L_0x011f:
            if (r7 != 0) goto L_0x0151
            if (r3 == r15) goto L_0x0151
        L_0x0123:
            android.app.Activity r3 = r21.mo91565f()     // Catch:{ Exception -> 0x0210 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ Exception -> 0x0210 }
            r7 = 2131099800(0x7f060098, float:1.7811963E38)
            int r3 = r3.getColor(r7)     // Catch:{ Exception -> 0x0210 }
            r11.setTextColor(r3)     // Catch:{ Exception -> 0x0210 }
            android.app.Activity r3 = r21.mo91565f()     // Catch:{ Exception -> 0x0210 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ Exception -> 0x0210 }
            r10 = 2131231697(0x7f0803d1, float:1.8079482E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r10)     // Catch:{ Exception -> 0x0210 }
            r11.setBackground(r3)     // Catch:{ Exception -> 0x0210 }
            android.content.res.Resources r3 = r21.mo91572m()     // Catch:{ Exception -> 0x0210 }
            int r10 = r3.getColor(r7)     // Catch:{ Exception -> 0x0210 }
            r3 = 1
            goto L_0x0176
        L_0x0151:
            android.app.Activity r3 = r21.mo91565f()     // Catch:{ Exception -> 0x0210 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ Exception -> 0x0210 }
            r7 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r3 = r3.getColor(r7)     // Catch:{ Exception -> 0x0210 }
            r11.setTextColor(r3)     // Catch:{ Exception -> 0x0210 }
            android.app.Activity r3 = r21.mo91565f()     // Catch:{ Exception -> 0x0210 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ Exception -> 0x0210 }
            r7 = 2131231696(0x7f0803d0, float:1.807948E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r7)     // Catch:{ Exception -> 0x0210 }
            r11.setBackground(r3)     // Catch:{ Exception -> 0x0210 }
            r3 = 0
        L_0x0176:
            if (r9 == 0) goto L_0x0187
            com.tencent.mm.ui.base.span.BoldForegroundColorSpan r7 = new com.tencent.mm.ui.base.span.BoldForegroundColorSpan     // Catch:{ Exception -> 0x0210 }
            r7.<init>(r10)     // Catch:{ Exception -> 0x0210 }
            int r10 = r4.length()     // Catch:{ Exception -> 0x0210 }
            r12 = 17
            r15 = 0
            r4.setSpan(r7, r15, r10, r12)     // Catch:{ Exception -> 0x0210 }
        L_0x0187:
            java.lang.Class<ny.h> r7 = p629ny.C76979h.class
            di3.d r7 = di3.C86312j.m106911c(r7)     // Catch:{ Exception -> 0x0210 }
            ny.h r7 = (p629ny.C76979h) r7     // Catch:{ Exception -> 0x0210 }
            android.app.Activity r10 = r21.mo91565f()     // Catch:{ Exception -> 0x0210 }
            float r12 = r11.getTextSize()     // Catch:{ Exception -> 0x0210 }
            android.text.SpannableString r4 = r7.Te0(r10, r4, r12)     // Catch:{ Exception -> 0x0210 }
            if (r6 == 0) goto L_0x0214
            java.util.List<android.util.Pair<java.lang.Integer, java.lang.Integer>> r6 = r0.f229704b     // Catch:{ Exception -> 0x0210 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ Exception -> 0x0210 }
            int r6 = r6.size()     // Catch:{ Exception -> 0x0210 }
            java.util.List<java.lang.String> r7 = r0.f229705c     // Catch:{ Exception -> 0x0210 }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ Exception -> 0x0210 }
            int r7 = r7.size()     // Catch:{ Exception -> 0x0210 }
            if (r6 != r7) goto L_0x0214
            java.util.List<java.lang.String> r6 = r0.f229705c     // Catch:{ Exception -> 0x0210 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ Exception -> 0x0210 }
            boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x0210 }
            if (r6 != 0) goto L_0x0214
            r6 = 0
        L_0x01ba:
            java.util.List<java.lang.String> r7 = r0.f229705c     // Catch:{ Exception -> 0x0210 }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ Exception -> 0x0210 }
            int r7 = r7.size()     // Catch:{ Exception -> 0x0210 }
            if (r6 >= r7) goto L_0x0214
            java.util.List<android.util.Pair<java.lang.Integer, java.lang.Integer>> r7 = r0.f229704b     // Catch:{ Exception -> 0x0210 }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ Exception -> 0x0210 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ Exception -> 0x0210 }
            android.util.Pair r7 = (android.util.Pair) r7     // Catch:{ Exception -> 0x0210 }
            java.lang.String r10 = "click span start %d, end %d"
            r12 = 2
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0210 }
            java.lang.Object r12 = r7.first     // Catch:{ Exception -> 0x0210 }
            r16 = 0
            r15[r16] = r12     // Catch:{ Exception -> 0x0210 }
            java.lang.Object r12 = r7.second     // Catch:{ Exception -> 0x0210 }
            r19 = r8
            r8 = 1
            r15[r8] = r12     // Catch:{ Exception -> 0x020e }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r10, r15)     // Catch:{ Exception -> 0x020e }
            com.tencent.mm.ui.chatting.viewitems.e3 r10 = new com.tencent.mm.ui.chatting.viewitems.e3     // Catch:{ Exception -> 0x020e }
            r12 = 0
            r10.<init>(r1, r8, r12, r2)     // Catch:{ Exception -> 0x020e }
            java.util.List<java.lang.String> r8 = r0.f229705c     // Catch:{ Exception -> 0x020e }
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ Exception -> 0x020e }
            java.lang.Object r8 = r8.get(r6)     // Catch:{ Exception -> 0x020e }
            r10.setTag(r8)     // Catch:{ Exception -> 0x020e }
            java.lang.Object r8 = r7.first     // Catch:{ Exception -> 0x020e }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x020e }
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x020e }
            java.lang.Object r7 = r7.second     // Catch:{ Exception -> 0x020e }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x020e }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x020e }
            r12 = 17
            r4.setSpan(r10, r8, r7, r12)     // Catch:{ Exception -> 0x020e }
            int r6 = r6 + 1
            r8 = r19
            goto L_0x01ba
        L_0x020e:
            r0 = move-exception
            goto L_0x0267
        L_0x0210:
            r0 = move-exception
            r19 = r8
            goto L_0x0267
        L_0x0214:
            r19 = r8
            java.util.List<vd2.h$a> r6 = r0.f229706d     // Catch:{ Exception -> 0x020e }
            java.util.LinkedList r6 = (java.util.LinkedList) r6     // Catch:{ Exception -> 0x020e }
            int r6 = r6.size()     // Catch:{ Exception -> 0x020e }
            if (r6 <= 0) goto L_0x026d
            java.util.List<vd2.h$a> r0 = r0.f229706d     // Catch:{ Exception -> 0x020e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x020e }
        L_0x0226:
            boolean r6 = r0.hasNext()     // Catch:{ Exception -> 0x020e }
            if (r6 == 0) goto L_0x026d
            java.lang.Object r6 = r0.next()     // Catch:{ Exception -> 0x020e }
            vd2.h$a r6 = (vd2.C78389h.C78390a) r6     // Catch:{ Exception -> 0x020e }
            java.lang.Class<yy.k> r7 = p773yy.C79168k.class
            di3.d r7 = di3.C86312j.m106911c(r7)     // Catch:{ Exception -> 0x020e }
            yy.k r7 = (p773yy.C79168k) r7     // Catch:{ Exception -> 0x020e }
            java.lang.String r8 = r6.f229709c     // Catch:{ Exception -> 0x020e }
            if (r3 == 0) goto L_0x0241
            qy2.a$c r10 = qy2.C63347a.C47892c.PATMSG_WITH_BG     // Catch:{ Exception -> 0x020e }
            goto L_0x0243
        L_0x0241:
            qy2.a$c r10 = qy2.C63347a.C47892c.PATMSG_NO_BG     // Catch:{ Exception -> 0x020e }
        L_0x0243:
            android.app.Activity r12 = r21.mo91565f()     // Catch:{ Exception -> 0x020e }
            android.content.res.Resources r12 = r12.getResources()     // Catch:{ Exception -> 0x020e }
            r15 = 2131165639(0x7f0701c7, float:1.79455E38)
            int r12 = r12.getDimensionPixelSize(r15)     // Catch:{ Exception -> 0x020e }
            float r12 = (float) r12     // Catch:{ Exception -> 0x020e }
            r15 = 0
            android.text.style.ImageSpan r7 = r7.Ig0(r15, r8, r10, r12)     // Catch:{ Exception -> 0x020e }
            int r8 = r6.f229707a     // Catch:{ Exception -> 0x020e }
            int r6 = r6.f229708b     // Catch:{ Exception -> 0x020e }
            r10 = 17
            r4.setSpan(r7, r8, r6, r10)     // Catch:{ Exception -> 0x020e }
            goto L_0x0226
        L_0x0262:
            r0 = move-exception
            r19 = r8
            r18 = r12
        L_0x0267:
            r3 = 0
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r14, r6)
        L_0x026d:
            if (r9 == 0) goto L_0x0323
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_PAT_SUFFIX_STRING_SYNC
            r0.mo119675I(r3, r14)
            int r0 = r13.f227613j
            r3 = 1
            if (r0 != r3) goto L_0x0323
            android.content.Context r0 = r11.getContext()
            r3 = 2131756125(0x7f10045d, float:1.9143149E38)
            android.content.Context r6 = r11.getContext()
            r7 = 2131101015(0x7f060557, float:1.7814428E38)
            int r6 = kg3.C76577a.m92153d(r6, r7)
            android.graphics.drawable.Drawable r0 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r0, r3, r6)
            int r3 = r0.getIntrinsicWidth()
            r6 = 2
            int r3 = r3 * 2
            r7 = 3
            int r3 = r3 / r7
            int r8 = r0.getIntrinsicHeight()
            int r8 = r8 * 2
            int r8 = r8 / r7
            r6 = 0
            r0.setBounds(r6, r6, r3, r8)
            go3.c r3 = new go3.c
            r6 = 1
            r3.<init>(r0, r6)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r4)
            android.text.SpannableString r4 = new android.text.SpannableString
            android.content.Context r6 = r11.getContext()
            r8 = 2131833891(0x7f113423, float:1.9300877E38)
            java.lang.String r6 = r6.getString(r8)
            r4.<init>(r6)
            r6 = 17
            r8 = 2
            r4.setSpan(r3, r8, r7, r6)
            r0.append(r4)
            android.content.Context r3 = r11.getContext()
            r4 = 2131833892(0x7f113424, float:1.9300879E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.String r6 = "<_wc_custom_link_ href='weixin://jump/setpat_bottom_sheet/'>"
            r7 = 0
            r4[r7] = r6
            java.lang.String r6 = "</_wc_custom_link_>"
            r9 = 1
            r4[r9] = r6
            java.lang.String r3 = java.lang.String.format(r3, r4)
            android.content.Context r4 = r11.getContext()
            float r6 = r11.getTextSize()
            int r6 = (int) r6
            java.util.LinkedList<de3.p> r9 = de3.C75370s.f221606a
            de3.d0 r9 = new de3.d0
            r9.<init>(r4)
            r9.f221555i = r7
            r9.f221551e = r7
            r9.f221552f = r7
            boolean r4 = de3.C75370s.f221607b
            r9.f221554h = r4
            r4 = 1
            r9.f221568v = r4
            r9.f221556j = r7
            r9.f221559m = r7
            boolean r10 = de3.C75370s.m90377c(r4)
            r9.f221561o = r10
            r9.f221571y = r4
            r9.f221564r = r4
            android.text.SpannableString r3 = r9.mo105696d(r3, r6, r7)
            r0.append(r3)
            android.widget.TextView$BufferType r3 = android.widget.TextView.BufferType.SPANNABLE
            r6 = 0
            r11.mo104280c(r0, r3, r6)
            goto L_0x032b
        L_0x0323:
            r6 = 0
            r7 = 0
            r8 = 2
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r11.mo104280c(r4, r0, r6)
        L_0x032b:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r0.<init>(r3, r3)
            r0.width = r3
            r0.height = r3
            boolean r3 = r21.mo91583x()
            if (r3 == 0) goto L_0x0352
            android.content.res.Resources r3 = r19.getResources()
            r4 = 2131165564(0x7f07017c, float:1.7945349E38)
            int r3 = r3.getDimensionPixelSize(r4)
            r0.topMargin = r3
            android.content.res.Resources r3 = r19.getResources()
            int r3 = r3.getDimensionPixelSize(r4)
            r0.bottomMargin = r3
        L_0x0352:
            r3 = 1
            r0.gravity = r3
            com.tencent.mm.ui.chatting.viewitems.a3$c r4 = r1.f216980v
            android.widget.LinearLayout r4 = r4.f216986b
            r4.addView(r11, r0)
            com.tencent.mm.ui.chatting.viewitems.t8 r0 = new com.tencent.mm.ui.chatting.viewitems.t8
            boolean r14 = r21.mo91583x()
            int r4 = uj3.C78208e.f229158a
            uj3.e r15 = uj3.C78208e.C78209a.f229159a
            r17 = 0
            java.lang.String r16 = ""
            r12 = r0
            r13 = r22
            r12.<init>((com.tencent.p014mm.storage.C72963f4) r13, (boolean) r14, (uj3.C78208e) r15, (java.lang.String) r16, (boolean) r17)
            r11.setTag(r0)
            com.tencent.mm.ui.chatting.viewitems.a3$b r0 = new com.tencent.mm.ui.chatting.viewitems.a3$b
            r0.<init>(r2)
            r11.setOnLongClickListener(r0)
            int r10 = r18 + 1
            r3 = r23
            r9 = r24
            r8 = r19
            r4 = 2
            r6 = 0
            r7 = 1
            goto L_0x0032
        L_0x0388:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C73921a3.mo103006o0(ck3.b, com.tencent.mm.storage.f4, te3.hb3, int):void");
    }
}
