package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.p136ui.chatting.C73309a2;
import com.tencent.p014mm.p136ui.chatting.C73745l4;
import com.tencent.p014mm.p136ui.chatting.C74343y0;
import com.tencent.p014mm.p136ui.chatting.C74351z1;
import com.tencent.p014mm.p136ui.chatting.manager.C6789c;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.SemiXml;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C45629t0;
import eb0.C86493v0;
import ex0.C45696d;
import f40.C86709a0;
import fx0.C45821d;
import fy0.C8219i;
import gc0.C20828a;
import gw0.C76073b;
import hc0.C20937c;
import ht1.C60193p4;
import ic0.C98661k;
import j20.C117292a;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kb0.C9576e;
import ke3.C88144b;
import kg3.C76577a;
import kw0.C46746a;
import nj3.C76874e0;
import p243tn.C14050a;
import p248ug.C102027b;
import p823sg.C101611g;
import s90.C63724h;
import s90.C77627f;
import s90.C77629i;
import s90.C77630j;
import sj3.C63941p;
import te3.C64273c21;
import uj3.C78208e;
import wd3.C22898h;
import wd3.C22906q;
import wd3.C22908r;
import zj3.C79348e;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.b4 */
public class C19762b4 extends C74023i {

    /* renamed from: A */
    public static int f56184A;

    /* renamed from: B */
    public static int f56185B;

    /* renamed from: C */
    public static int f56186C;

    /* renamed from: D */
    public static int f56187D;

    /* renamed from: E */
    public static int f56188E;

    /* renamed from: F */
    public static int f56189F;

    /* renamed from: G */
    public static int f56190G;

    /* renamed from: H */
    public static int f56191H;

    /* renamed from: v */
    public C67391b f56192v;

    /* renamed from: w */
    public boolean f56193w = false;

    /* renamed from: x */
    public int f56194x = 0;

    /* renamed from: y */
    public long f56195y = 0;

    /* renamed from: z */
    public boolean f56196z = false;

    /* renamed from: s0 */
    public static String m21449s0(C72963f4 f4Var, Context context, int i) {
        if (context == null) {
            Log.m105928w("MicroMsg.ChattingItemBizFrom", "getReaderAppMsgContent: context is null");
            return null;
        } else if (f4Var == null) {
            Log.m105928w("MicroMsg.ChattingItemBizFrom", "getReaderAppMsgContent: msg is null");
            return null;
        } else {
            return C92721n.m116881i(context, i, f4Var.getContent(), f4Var.mo108768t(), f4Var.getMsgId());
        }
    }

    /* renamed from: A0 */
    public final void mo26228A0(View view, C19782s3 s3Var, boolean z) {
        C19782s3 s3Var2 = s3Var;
        if (z) {
            if (s3Var2.f56257a == null) {
                s3Var2.mo26227a(view);
            }
            View view2 = s3Var2.f56257a;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        View view4 = s3Var2.f56257a;
        if (view4 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: B0 */
    public final void mo26229B0(C19783t3 t3Var, int i, int i2, C77630j jVar) {
        boolean z = false;
        boolean z2 = i == 5;
        mo26228A0(t3Var.f56260b, t3Var.f56264f, z2);
        boolean z3 = i == 8;
        mo26228A0(t3Var.f56260b, t3Var.f56265g, z3);
        if (z3) {
            z2 = true;
        }
        boolean z4 = i == 7;
        mo26228A0(t3Var.f56260b, t3Var.f56266h, z4);
        if (z4) {
            z2 = true;
        }
        boolean z5 = i == 6;
        mo26228A0(t3Var.f56260b, t3Var.f56267i, z5);
        if (z5) {
            z2 = true;
        }
        boolean z6 = i == 10;
        mo26228A0(t3Var.f56260b, t3Var.f56268j, z6);
        if (z6) {
            z2 = true;
        }
        boolean z7 = i == 19 && C63941p.f181254a.mo88703a(jVar.f226321M, 0);
        mo26228A0(t3Var.f56260b, t3Var.f56269k, z7);
        if (z7) {
            z2 = true;
        }
        LinearLayout linearLayout = t3Var.f56260b;
        C19787x3 x3Var = t3Var.f56261c;
        if (!z2 && i2 > 0) {
            z = true;
        }
        mo26228A0(linearLayout, x3Var, z);
    }

    /* renamed from: C0 */
    public void mo26230C0(Context context) {
        if (f56184A == 0) {
            f56184A = context.getResources().getDimensionPixelSize(C0966R.dimen.f3956le);
            f56185B = context.getResources().getDimensionPixelSize(C0966R.dimen.f3913iq);
            f56186C = context.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
            f56188E = context.getResources().getDimensionPixelSize(C0966R.dimen.f4274yb);
            f56187D = context.getResources().getDimensionPixelSize(C0966R.dimen.f4272y_);
            int f = C46746a.f125826a.mo71973f(context);
            int j = C76577a.m92159j(context);
            if (f >= j) {
                f = j;
            }
            int g = f - ((int) (C76577a.m92156g(context) * 32.0f));
            f56189F = (int) (((double) g) / 2.35d);
            int i = (int) (((float) g) / 1.7777778f);
            f56190G = i;
            f56191H = i;
        }
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view == null || view.getTag() == null) {
            view = new C6807n4(layoutInflater, C0966R.C0971layout.f6863ql);
            C19783t3 t3Var = new C19783t3();
            t3Var.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
            t3Var.historyMsgTip = view.findViewById(C0966R.C0970id.b5o);
            t3Var.f56260b = (LinearLayout) view.findViewById(C0966R.C0970id.b4d);
            t3Var.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            t3Var.maskView = view.findViewById(C0966R.C0970id.b7h);
            t3Var.f56263e = (TextView) view.findViewById(C0966R.C0970id.b2v);
            view.setTag(t3Var);
        }
        mo26230C0(layoutInflater.getContext());
        return view;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: Y */
    public boolean mo26234Y(MenuItem menuItem, C67391b bVar, C74243t8 t8Var) {
        int i;
        C72963f4 f4Var = t8Var.f212238a;
        this.f56195y = Util.nowSecond();
        try {
            i = Integer.parseInt(SemiXml.decode(f4Var.getContent()).get(".msg.appmsg.mmreader.category.item.itemshowtype"));
        } catch (Exception unused) {
            i = -1;
        }
        int itemId = menuItem.getItemId();
        if (itemId == 111) {
            C6789c.m7088a(f4Var, bVar.mo91565f(), new b4$$a(this, i, f4Var, bVar, t8Var));
        } else if (itemId == 114) {
            String s0 = m21449s0(f4Var, bVar.mo91565f(), 0);
            if (!Util.isNullOrNil(s0)) {
                C73745l4.m87341b(f4Var, s0, bVar.mo91565f(), 128);
            }
        } else if (itemId == 126) {
            if (i == 5) {
                Map<String, String> decode = SemiXml.decode(f4Var.getContent());
                if (decode != null) {
                    String str = "";
                    if (this.f56194x != 0) {
                        str = this.f56194x + str;
                    }
                    if (!((C60193p4) C86312j.m106911c(C60193p4.class)).mo78732kE((AppCompatActivity) bVar.mo91565f(), ".msg.appmsg.mmreader.category.item" + str, decode)) {
                        C73309a2.m86448a(this.f56195y, this.f56194x, bVar.mo91565f(), bVar.f193286j, (Activity) null, f4Var);
                    } else {
                        Log.m105924i("MicroMsg.ChattingItemBizFrom", "finder enter fav success!");
                    }
                } else {
                    Log.m105924i("MicroMsg.ChattingItemBizFrom", "finder:values null");
                    C73309a2.m86448a(this.f56195y, this.f56194x, bVar.mo91565f(), bVar.f193286j, (Activity) null, f4Var);
                }
            } else {
                C73309a2.m86448a(this.f56195y, this.f56194x, bVar.mo91565f(), bVar.f193286j, (Activity) null, f4Var);
            }
        }
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        C74243t8 t8Var = (C74243t8) view.getTag();
        boolean z = false;
        if (t8Var == null) {
            return false;
        }
        this.f56194x = t8Var.f217950B;
        int b = t8Var.mo103252b();
        C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(f4Var.getMsgId(), f4Var.getContent());
        if (JZ == null) {
            Log.m105928w("MicroMsg.ChattingItemBizFrom", "onCreateContextMenu reader is null");
            return false;
        }
        this.f56196z = false;
        int i = this.f56194x;
        if (i >= 0 && i < JZ.f226295i.size()) {
            String str = JZ.f226295i.get(this.f56194x).f226336r;
            C101611g<Long, C77629i> gVar = C92721n.f266840a;
            if (C9576e.m9260a(str)) {
                this.f56196z = true;
            }
        }
        if (!this.f56192v.mo91584y() && !C74343y0.m88770n(f4Var)) {
            e0Var.mo107136c(b, 111, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
        }
        if (19 == t8Var.f217955G) {
            z = true;
        }
        C88144b.m109788f("favorite");
        if (!this.f56196z && !z) {
            e0Var.mo107136c(b, 126, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
        }
        e0Var.mo107136c(b, 100, 0, this.f56192v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0d8c: MOVE  (r0v53 s90.h) = (r43v0 s90.h)
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x075e  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0baf  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0bc4  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0c25  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0c88  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0ced  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0d0e  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0d2a  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0d54  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0d7e  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0d90  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0d9d  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0dc3  */
    /* JADX WARNING: Removed duplicated region for block: B:334:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: f */
    public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r47, ck3.C67391b r48, com.tencent.p014mm.storage.C72963f4 r49, java.lang.String r50) {
        /*
            r46 = this;
            r8 = r46
            r9 = r48
            r15 = r49
            java.lang.Class<ex0.d> r24 = ex0.C45696d.class
            r8.f56192v = r9
            android.app.Activity r0 = r48.mo91565f()
            r8.mo26230C0(r0)
            r14 = r47
            com.tencent.mm.ui.chatting.viewitems.t3 r14 = (com.tencent.p014mm.p136ui.chatting.viewitems.C19783t3) r14
            java.util.List<com.tencent.mm.ui.chatting.viewitems.r3> r0 = r14.f56262d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x001d:
            boolean r1 = r0.hasNext()
            r13 = 2
            r12 = 1
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r0.next()
            com.tencent.mm.ui.chatting.viewitems.r3 r1 = (com.tencent.p014mm.p136ui.chatting.viewitems.C19781r3) r1
            java.util.List<com.tencent.mm.ui.chatting.viewitems.r3> r2 = r14.f56262d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.indexOf(r1)
            java.util.List<com.tencent.mm.ui.chatting.viewitems.r3> r3 = r14.f56262d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            int r3 = r3 - r12
            if (r2 == r3) goto L_0x0044
            android.view.View r2 = r1.f56245a
            com.tencent.p014mm.p136ui.chatting.C74355z4.m88794b(r2, r12)
            goto L_0x0049
        L_0x0044:
            android.view.View r2 = r1.f56245a
            com.tencent.p014mm.p136ui.chatting.C74355z4.m88794b(r2, r13)
        L_0x0049:
            android.widget.LinearLayout r2 = r14.f56260b
            android.view.View r1 = r1.f56245a
            r2.removeView(r1)
            goto L_0x001d
        L_0x0051:
            java.util.List<com.tencent.mm.ui.chatting.viewitems.r3> r0 = r14.f56262d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.lang.Class<gw0.b> r0 = gw0.C76073b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            gw0.b r0 = (gw0.C76073b) r0
            long r1 = r49.getMsgId()
            java.lang.String r3 = r49.getContent()
            s90.f r0 = r0.mo94597JZ(r1, r3)
            r11 = r0
            s90.i r11 = (s90.C77629i) r11
            java.lang.String r0 = r11.f226294h
            r10 = 8
            r7 = 0
            if (r0 == 0) goto L_0x008c
            int r1 = r0.length()
            if (r1 != 0) goto L_0x007d
            goto L_0x008c
        L_0x007d:
            android.widget.TextView r1 = r14.f56263e
            r1.setVisibility(r7)
            android.widget.TextView r1 = r14.f56263e
            com.tencent.mm.ui.chatting.viewitems.t8 r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8.m88488a(r0)
            r8.mo103073G(r9, r1, r0)
            goto L_0x0091
        L_0x008c:
            android.widget.TextView r0 = r14.f56263e
            r0.setVisibility(r10)
        L_0x0091:
            java.util.LinkedList<s90.j> r6 = r11.f226295i
            int r5 = r6.size()
            r4 = 0
            if (r5 != 0) goto L_0x00a4
            android.widget.LinearLayout r0 = r14.f56260b
            r0.setVisibility(r10)
            r0 = -1
            r8.mo26229B0(r14, r0, r7, r4)
            return
        L_0x00a4:
            android.widget.LinearLayout r0 = r14.f56260b
            r0.setVisibility(r7)
            java.lang.Object r0 = r6.get(r7)
            s90.j r0 = (s90.C77630j) r0
            int r0 = r0.f226333o
            java.lang.Object r1 = r6.get(r7)
            s90.j r1 = (s90.C77630j) r1
            r8.mo26229B0(r14, r0, r5, r1)
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r9.f193286j
            android.view.LayoutInflater r0 = r0.getActivityLayoutInflater()
            java.util.List<com.tencent.mm.ui.chatting.viewitems.r3> r1 = r14.f56262d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            int r1 = r1 + r13
        L_0x00c9:
            if (r1 >= r5) goto L_0x00de
            android.view.View r2 = com.tencent.p014mm.p136ui.chatting.C74355z4.m88793a(r12)
            if (r2 != 0) goto L_0x00d8
            r2 = 2131493648(0x7f0c0310, float:1.8610782E38)
            android.view.View r2 = r0.inflate(r2, r4)
        L_0x00d8:
            r14.mo26265a(r2)
            int r1 = r1 + 1
            goto L_0x00c9
        L_0x00de:
            if (r5 <= r12) goto L_0x00f3
            android.view.View r1 = com.tencent.p014mm.p136ui.chatting.C74355z4.m88793a(r13)
            if (r1 != 0) goto L_0x00ed
            r1 = 2131493649(0x7f0c0311, float:1.8610784E38)
            android.view.View r1 = r0.inflate(r1, r4)
        L_0x00ed:
            r14.mo26265a(r1)
            r8.f56193w = r12
            goto L_0x00f5
        L_0x00f3:
            r8.f56193w = r7
        L_0x00f5:
            r0 = 0
        L_0x00f6:
            java.util.List<com.tencent.mm.ui.chatting.viewitems.r3> r1 = r14.f56262d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0150
            java.util.List<com.tencent.mm.ui.chatting.viewitems.r3> r1 = r14.f56262d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r1 = r1.get(r0)
            com.tencent.mm.ui.chatting.viewitems.r3 r1 = (com.tencent.p014mm.p136ui.chatting.viewitems.C19781r3) r1
            android.view.View r1 = r1.f56245a
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r2.mo10233c(r3)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r19 = "filling"
            java.lang.String r20 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r2.mo10231a(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r18 = "filling"
            java.lang.String r19 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            int r0 = r0 + 1
            goto L_0x00f6
        L_0x0150:
            java.lang.Object r0 = r6.get(r7)
            r3 = r0
            s90.j r3 = (s90.C77630j) r3
            int r0 = r3.f226333o
            r2 = 6
            r1 = 7
            if (r0 != r2) goto L_0x015f
            r3.f226333o = r1
        L_0x015f:
            int r0 = r3.f226333o
            r1 = 2131231713(0x7f0803e1, float:1.8079515E38)
            r2 = 2131231715(0x7f0803e3, float:1.8079519E38)
            r13 = 5
            if (r0 != r13) goto L_0x026e
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.l r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.f109414a
            java.lang.String r4 = r3.f226326e
            r0.mo63636e(r4, r13)
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            android.view.View r0 = r0.f56315h
            int r4 = f56190G
            r8.mo26247w0(r0, r4)
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            android.widget.ImageView r0 = r0.f56314g
            int r4 = f56190G
            r8.mo26247w0(r0, r4)
            java.lang.String r0 = r3.f226325d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r4 = 2131101009(0x7f060551, float:1.7814416E38)
            if (r0 == 0) goto L_0x0196
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56311d
            r0.setVisibility(r10)
            goto L_0x01c6
        L_0x0196:
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56311d
            java.lang.String r13 = r3.f226325d
            r0.mo104279b(r13)
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56311d
            android.text.TextPaint r0 = r0.getPaint()
            r0.setFakeBoldText(r12)
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56311d
            r0.setVisibility(r7)
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56311d
            ck3.b r13 = r8.f56192v
            android.app.Activity r13 = r13.mo91565f()
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r4)
            r0.setTextColor(r13)
        L_0x01c6:
            if (r5 != r12) goto L_0x01d0
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            android.widget.ImageView r0 = r0.f56314g
            r0.setBackgroundResource(r1)
            goto L_0x01d7
        L_0x01d0:
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            android.widget.ImageView r0 = r0.f56314g
            r0.setBackgroundResource(r2)
        L_0x01d7:
            int r0 = r3.f226335q
            java.lang.String r0 = com.tencent.p014mm.message.C92721n.m116876d(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0207
            com.tencent.mm.ui.chatting.viewitems.z3 r1 = r14.f56264f
            android.widget.TextView r1 = r1.f56312e
            r1.setVisibility(r7)
            com.tencent.mm.ui.chatting.viewitems.z3 r1 = r14.f56264f
            android.widget.TextView r1 = r1.f56312e
            r1.setText(r0)
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            android.widget.TextView r0 = r0.f56312e
            ck3.b r1 = r8.f56192v
            android.app.Activity r1 = r1.mo91565f()
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r4)
            r0.setTextColor(r1)
            goto L_0x020e
        L_0x0207:
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            android.widget.TextView r0 = r0.f56312e
            r0.setVisibility(r10)
        L_0x020e:
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            android.view.View r13 = r0.f56257a
            r0 = r46
            r4 = 7
            r1 = r14
            r2 = r3
            r7 = r3
            r3 = r49
            r26 = 0
            r4 = r47
            r28 = r5
            r5 = r11
            r29 = r6
            r6 = r13
            r0.mo26246v0(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            android.widget.ImageView r0 = r0.f56259c
            r0.setVisibility(r10)
            java.lang.String r1 = r7.f226330i
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            android.widget.ImageView r2 = r0.f56313f
            int r3 = r49.getType()
            r13 = r28
            if (r13 <= r12) goto L_0x023e
            r4 = 1
            goto L_0x023f
        L_0x023e:
            r4 = 0
        L_0x023f:
            int r5 = f56190G
            com.tencent.mm.ui.chatting.viewitems.g4 r6 = new com.tencent.mm.ui.chatting.viewitems.g4
            r6.<init>(r8, r14, r13)
            r0 = r46
            r0.mo26245u0(r1, r2, r3, r4, r5, r6)
            ck3.b r0 = r8.f56192v
            android.app.Activity r0 = r0.mo91565f()
            float r0 = kg3.C76577a.m92165p(r0)
            r1 = 1066401792(0x3f900000, float:1.125)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0264
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56311d
            r0.setMaxLines(r12)
            goto L_0x04d5
        L_0x0264:
            com.tencent.mm.ui.chatting.viewitems.z3 r0 = r14.f56264f
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56311d
            r1 = 2
            r0.setMaxLines(r1)
            goto L_0x04d5
        L_0x026e:
            r7 = r3
            r26 = r4
            r13 = r5
            r29 = r6
            if (r0 != r10) goto L_0x03f0
            com.tencent.mm.ui.chatting.viewitems.w3 r0 = r14.f56265g
            android.view.View r0 = r0.f56295f
            int r3 = f56191H
            r8.mo26247w0(r0, r3)
            if (r13 <= r12) goto L_0x0283
            r4 = 1
            goto L_0x0284
        L_0x0283:
            r4 = 0
        L_0x0284:
            if (r4 != 0) goto L_0x028e
            com.tencent.mm.ui.chatting.viewitems.w3 r0 = r14.f56265g
            android.widget.ImageView r0 = r0.f56294e
            r0.setBackgroundResource(r1)
            goto L_0x0295
        L_0x028e:
            com.tencent.mm.ui.chatting.viewitems.w3 r0 = r14.f56265g
            android.widget.ImageView r0 = r0.f56294e
            r0.setBackgroundResource(r2)
        L_0x0295:
            int r0 = r7.f226311C
            if (r0 <= r12) goto L_0x02af
            com.tencent.mm.ui.chatting.viewitems.w3 r0 = r14.f56265g
            android.widget.TextView r0 = r0.f56296g
            r1 = 0
            r0.setVisibility(r1)
            com.tencent.mm.ui.chatting.viewitems.w3 r0 = r14.f56265g
            android.widget.TextView r0 = r0.f56296g
            int r1 = r7.f226311C
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setText(r1)
            goto L_0x02b6
        L_0x02af:
            com.tencent.mm.ui.chatting.viewitems.w3 r0 = r14.f56265g
            android.widget.TextView r0 = r0.f56296g
            r0.setVisibility(r10)
        L_0x02b6:
            int r0 = r7.f226311C
            if (r0 <= r12) goto L_0x02de
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131837643(0x7f1142cb, float:1.9308487E38)
            java.lang.String r0 = r0.getString(r1)
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r1 = r7.f226311C
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = r7.f226325d
            r2[r12] = r1
            java.lang.String r0 = java.lang.String.format(r0, r2)
            goto L_0x02fe
        L_0x02de:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131837644(0x7f1142cc, float:1.9308489E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.tencent.mm.ui.chatting.viewitems.w3 r2 = r14.f56265g
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r2.f56298i
            java.lang.CharSequence r2 = r2.mo154968a()
            r3 = 0
            r1[r3] = r2
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x02fe:
            com.tencent.mm.ui.chatting.viewitems.w3 r1 = r14.f56265g
            android.view.View r1 = r1.f56295f
            r1.setContentDescription(r0)
            java.lang.String r0 = r7.f226325d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0371
            if (r13 != r12) goto L_0x0371
            com.tencent.mm.ui.chatting.viewitems.w3 r0 = r14.f56265g
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56297h
            r0.setVisibility(r10)
            com.tencent.mm.ui.chatting.viewitems.w3 r0 = r14.f56265g
            android.view.View r0 = r0.f56299j
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r3)
            java.lang.Object[] r31 = r1.mo10232b()
            java.lang.String r32 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r33 = "fillingTopPicSlot"
            java.lang.String r34 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            r30 = r0
            j20.C117292a.m165358d(r30, r31, r32, r33, r34, r35, r36, r37)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r31 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r32 = "fillingTopPicSlot"
            java.lang.String r33 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            j20.C117292a.m165359e(r30, r31, r32, r33, r34, r35, r36)
            com.tencent.mm.ui.chatting.viewitems.w3 r0 = r14.f56265g
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56298i
            java.lang.String r1 = r7.f226325d
            r0.mo104279b(r1)
            com.tencent.mm.ui.chatting.viewitems.w3 r0 = r14.f56265g
            android.view.View r0 = r0.f56299j
            r1 = 2131231218(0x7f0801f2, float:1.807851E38)
            r0.setBackgroundResource(r1)
            goto L_0x03c8
        L_0x0371:
            com.tencent.mm.ui.chatting.viewitems.w3 r0 = r14.f56265g
            android.view.View r0 = r0.f56299j
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r1.mo10233c(r2)
            java.lang.Object[] r31 = r1.mo10232b()
            java.lang.String r32 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r33 = "fillingTopPicSlot"
            java.lang.String r34 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            r30 = r0
            j20.C117292a.m165358d(r30, r31, r32, r33, r34, r35, r36, r37)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r31 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r32 = "fillingTopPicSlot"
            java.lang.String r33 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            j20.C117292a.m165359e(r30, r31, r32, r33, r34, r35, r36)
            com.tencent.mm.ui.chatting.viewitems.w3 r0 = r14.f56265g
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56297h
            r1 = 0
            r0.setVisibility(r1)
            com.tencent.mm.ui.chatting.viewitems.w3 r0 = r14.f56265g
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56297h
            java.lang.String r1 = r7.f226325d
            r0.mo104279b(r1)
        L_0x03c8:
            java.lang.String r1 = r7.f226330i
            com.tencent.mm.ui.chatting.viewitems.w3 r0 = r14.f56265g
            android.widget.ImageView r2 = r0.f56293d
            int r3 = r49.getType()
            int r5 = f56191H
            com.tencent.mm.ui.chatting.viewitems.i4 r6 = new com.tencent.mm.ui.chatting.viewitems.i4
            r6.<init>(r8)
            r0 = r46
            r0.mo26245u0(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.ui.chatting.viewitems.w3 r0 = r14.f56265g
            android.view.View r6 = r0.f56257a
            r0 = r46
            r1 = r14
            r2 = r7
            r3 = r49
            r4 = r47
            r5 = r11
            r0.mo26246v0(r1, r2, r3, r4, r5, r6)
            goto L_0x04d5
        L_0x03f0:
            java.lang.String r6 = "_msg"
            java.lang.String r5 = "_"
            r1 = 2131231693(0x7f0803cd, float:1.8079474E38)
            r2 = 2131235723(0x7f08138b, float:1.8087648E38)
            r4 = 7
            if (r0 != r4) goto L_0x04dc
            java.lang.String r0 = r7.f226325d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x040d
            com.tencent.mm.ui.chatting.viewitems.a4 r0 = r14.f56266h
            android.widget.TextView r0 = r0.f56258b
            r0.setVisibility(r10)
            goto L_0x041e
        L_0x040d:
            com.tencent.mm.ui.chatting.viewitems.a4 r0 = r14.f56266h
            android.widget.TextView r0 = r0.f56258b
            r3 = 0
            r0.setVisibility(r3)
            com.tencent.mm.ui.chatting.viewitems.a4 r0 = r14.f56266h
            android.widget.TextView r0 = r0.f56258b
            java.lang.String r3 = r7.f226325d
            r0.setText(r3)
        L_0x041e:
            if (r13 <= r12) goto L_0x0428
            com.tencent.mm.ui.chatting.viewitems.a4 r0 = r14.f56266h
            android.view.View r0 = r0.f56257a
            r0.setBackgroundResource(r1)
            goto L_0x042f
        L_0x0428:
            com.tencent.mm.ui.chatting.viewitems.a4 r0 = r14.f56266h
            android.view.View r0 = r0.f56257a
            r0.setBackgroundResource(r2)
        L_0x042f:
            int r0 = r7.f226335q
            java.lang.String r0 = com.tencent.p014mm.message.C92721n.m116876d(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x044b
            com.tencent.mm.ui.chatting.viewitems.a4 r1 = r14.f56266h
            android.widget.TextView r1 = r1.f56183e
            r2 = 0
            r1.setVisibility(r2)
            com.tencent.mm.ui.chatting.viewitems.a4 r1 = r14.f56266h
            android.widget.TextView r1 = r1.f56183e
            r1.setText(r0)
            goto L_0x0453
        L_0x044b:
            com.tencent.mm.ui.chatting.viewitems.a4 r0 = r14.f56266h
            android.widget.TextView r0 = r0.f56183e
            r1 = 4
            r0.setVisibility(r1)
        L_0x0453:
            com.tencent.mm.ui.chatting.viewitems.a4 r0 = r14.f56266h
            android.widget.ImageView r0 = r0.f56182d
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            boolean r1 = r0 instanceof android.graphics.drawable.AnimationDrawable
            if (r1 == 0) goto L_0x046a
            android.graphics.drawable.AnimationDrawable r0 = (android.graphics.drawable.AnimationDrawable) r0
            boolean r1 = r0.isRunning()
            if (r1 == 0) goto L_0x046a
            r0.stop()
        L_0x046a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r49.getMsgId()
            r0.append(r1)
            r0.append(r5)
            r1 = 0
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r14.playingMsgId
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04b0
            com.tencent.mm.ui.chatting.viewitems.a4 r0 = r14.f56266h
            android.widget.ImageView r0 = r0.f56182d
            r1 = 2131231317(0x7f080255, float:1.8078712E38)
            r0.setImageResource(r1)
            com.tencent.mm.ui.chatting.viewitems.a4 r0 = r14.f56266h
            android.widget.ImageView r0 = r0.f56182d
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            boolean r0 = r0 instanceof android.graphics.drawable.AnimationDrawable
            if (r0 == 0) goto L_0x04ba
            com.tencent.mm.ui.chatting.viewitems.a4 r0 = r14.f56266h
            android.widget.ImageView r0 = r0.f56182d
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            android.graphics.drawable.AnimationDrawable r0 = (android.graphics.drawable.AnimationDrawable) r0
            r0.start()
            goto L_0x04ba
        L_0x04b0:
            com.tencent.mm.ui.chatting.viewitems.a4 r0 = r14.f56266h
            android.widget.ImageView r0 = r0.f56182d
            r1 = 2131231315(0x7f080253, float:1.8078708E38)
            r0.setImageResource(r1)
        L_0x04ba:
            com.tencent.mm.ui.chatting.viewitems.a4 r0 = r14.f56266h
            android.widget.ImageView r0 = r0.f56182d
            java.lang.String r1 = r7.f226330i
            r2 = 0
            r8.mo26249y0(r0, r15, r2, r1)
            com.tencent.mm.ui.chatting.viewitems.a4 r0 = r14.f56266h
            android.view.View r6 = r0.f56257a
            r0 = r46
            r1 = r14
            r2 = r7
            r3 = r49
            r5 = 7
            r4 = r47
            r5 = r11
            r0.mo26246v0(r1, r2, r3, r4, r5, r6)
        L_0x04d5:
            r12 = r7
            r39 = r29
            r21 = 2
            goto L_0x075b
        L_0x04dc:
            r4 = 6
            if (r0 != r4) goto L_0x05e3
            r3 = r29
            r4 = 0
            java.lang.Object r0 = r3.get(r4)
            s90.j r0 = (s90.C77630j) r0
            java.lang.String r2 = r0.f226325d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x04f8
            com.tencent.mm.ui.chatting.viewitems.v3 r2 = r14.f56267i
            android.widget.TextView r2 = r2.f56258b
            r2.setVisibility(r10)
            goto L_0x0508
        L_0x04f8:
            com.tencent.mm.ui.chatting.viewitems.v3 r2 = r14.f56267i
            android.widget.TextView r2 = r2.f56258b
            r2.setVisibility(r4)
            com.tencent.mm.ui.chatting.viewitems.v3 r2 = r14.f56267i
            android.widget.TextView r2 = r2.f56258b
            java.lang.String r4 = r0.f226325d
            r2.setText(r4)
        L_0x0508:
            if (r13 <= r12) goto L_0x0512
            com.tencent.mm.ui.chatting.viewitems.v3 r2 = r14.f56267i
            android.view.View r2 = r2.f56257a
            r2.setBackgroundResource(r1)
            goto L_0x051c
        L_0x0512:
            com.tencent.mm.ui.chatting.viewitems.v3 r1 = r14.f56267i
            android.view.View r1 = r1.f56257a
            r2 = 2131235723(0x7f08138b, float:1.8087648E38)
            r1.setBackgroundResource(r2)
        L_0x051c:
            java.lang.String r1 = r0.f226309A
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0536
            com.tencent.mm.ui.chatting.viewitems.v3 r1 = r14.f56267i
            android.widget.TextView r1 = r1.f56289d
            r2 = 0
            r1.setVisibility(r2)
            com.tencent.mm.ui.chatting.viewitems.v3 r1 = r14.f56267i
            android.widget.TextView r1 = r1.f56289d
            java.lang.String r2 = r0.f226309A
            r1.setText(r2)
            goto L_0x053d
        L_0x0536:
            com.tencent.mm.ui.chatting.viewitems.v3 r1 = r14.f56267i
            android.widget.TextView r1 = r1.f56289d
            r1.setVisibility(r10)
        L_0x053d:
            int r1 = r0.f226310B
            r4 = 2
            if (r1 != r4) goto L_0x054d
            com.tencent.mm.ui.chatting.viewitems.v3 r1 = r14.f56267i
            android.widget.ImageView r1 = r1.f56292g
            r2 = 2131755364(0x7f100164, float:1.9141605E38)
            r1.setImageResource(r2)
            goto L_0x0557
        L_0x054d:
            com.tencent.mm.ui.chatting.viewitems.v3 r1 = r14.f56267i
            android.widget.ImageView r1 = r1.f56292g
            r2 = 2131755373(0x7f10016d, float:1.9141623E38)
            r1.setImageResource(r2)
        L_0x0557:
            com.tencent.mm.ui.chatting.viewitems.v3 r1 = r14.f56267i
            android.widget.ImageView r1 = r1.f56291f
            java.lang.String r2 = r0.f226330i
            r4 = 0
            r8.mo26249y0(r1, r15, r4, r2)
            com.tencent.mm.ui.chatting.viewitems.v3 r1 = r14.f56267i
            android.view.View r4 = r1.f56257a
            r1 = r0
            r0 = r46
            r16 = r1
            r1 = r14
            r2 = r16
            r39 = r3
            r3 = r49
            r17 = r4
            r21 = 2
            r4 = r47
            r12 = r5
            r5 = r11
            r10 = r6
            r6 = r17
            r0.mo26246v0(r1, r2, r3, r4, r5, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r49.getMsgId()
            r0.append(r1)
            r0.append(r12)
            r12 = 0
            r0.append(r12)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r14.playingMsgId
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x05ac
            com.tencent.mm.ui.chatting.viewitems.v3 r0 = r14.f56267i
            android.widget.ImageView r0 = r0.f56291f
            r1 = 2131755367(0x7f100167, float:1.9141611E38)
            r0.setImageResource(r1)
            goto L_0x05b6
        L_0x05ac:
            com.tencent.mm.ui.chatting.viewitems.v3 r0 = r14.f56267i
            android.widget.ImageView r0 = r0.f56291f
            r1 = 2131755370(0x7f10016a, float:1.9141617E38)
            r0.setImageResource(r1)
        L_0x05b6:
            com.tencent.mm.ui.chatting.viewitems.v3 r0 = r14.f56267i
            android.widget.ImageView r0 = r0.f56259c
            r1 = 8
            r0.setVisibility(r1)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r14)
            r1 = r16
            java.lang.String r1 = r1.f226330i
            com.tencent.mm.ui.chatting.viewitems.v3 r2 = r14.f56267i
            android.widget.ImageView r2 = r2.f56290e
            int r3 = r49.getType()
            int r5 = f56188E
            com.tencent.mm.ui.chatting.viewitems.h4 r10 = new com.tencent.mm.ui.chatting.viewitems.h4
            r10.<init>(r8, r0, r15)
            java.lang.String r6 = "@S"
            r0 = r46
            r4 = r5
            r12 = r7
            r7 = r10
            r0.mo26244t0(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x075b
        L_0x05e3:
            r12 = r7
            r39 = r29
            r21 = 2
            r2 = 10
            if (r0 != r2) goto L_0x0731
            java.lang.String r0 = r12.f226325d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x05ff
            com.tencent.mm.ui.chatting.viewitems.y3 r0 = r14.f56268j
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56308d
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x070b
        L_0x05ff:
            com.tencent.mm.ui.chatting.viewitems.y3 r0 = r14.f56268j
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56308d
            de3.o r2 = new de3.o
            de3.a0 r3 = new de3.a0
            ck3.b r4 = r8.f56192v
            android.app.Activity r4 = r4.mo91565f()
            r3.<init>(r4)
            r2.<init>(r0, r3)
            r0.setOnTouchListener(r2)
            com.tencent.mm.ui.chatting.viewitems.y3 r0 = r14.f56268j
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56308d
            r2 = 0
            r0.setVisibility(r2)
            com.tencent.mm.ui.chatting.viewitems.y3 r0 = r14.f56268j
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56308d
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            ck3.b r3 = r8.f56192v
            android.app.Activity r3 = r3.mo91565f()
            java.lang.String r4 = r12.f226325d
            com.tencent.mm.ui.chatting.viewitems.y3 r5 = r14.f56268j
            com.tencent.mm.ui.widget.MMNeat7extView r5 = r5.f56308d
            float r5 = r5.getTextSize()
            int r5 = (int) r5
            android.text.SpannableString r2 = r2.mo107081qu(r3, r4, r5)
            r0.mo104279b(r2)
            kw0.a r0 = kw0.C46746a.f125826a
            ck3.b r2 = r8.f56192v
            android.app.Activity r2 = r2.mo91565f()
            int r0 = r0.mo71973f(r2)
            ck3.b r2 = r8.f56192v
            android.app.Activity r2 = r2.mo91565f()
            float r2 = kg3.C76577a.m92156g(r2)
            r3 = 1117782016(0x42a00000, float:80.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            int r0 = r0 - r2
            com.tencent.mm.ui.chatting.viewitems.y3 r2 = r14.f56268j
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r2.f56308d
            r3 = 2147483647(0x7fffffff, float:NaN)
            yr3.a r0 = r2.mo154990i(r0, r3)
            if (r0 == 0) goto L_0x0670
            com.tencent.neattextview.textview.layout.NeatLayout r0 = (com.tencent.neattextview.textview.layout.NeatLayout) r0
            int r7 = r0.f319992L
            goto L_0x0671
        L_0x0670:
            r7 = 0
        L_0x0671:
            com.tencent.mm.ui.chatting.viewitems.y3 r0 = r14.f56268j
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.f56308d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            com.tencent.mm.ui.chatting.viewitems.y3 r2 = r14.f56268j
            android.widget.LinearLayout r2 = r2.f56310f
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r4 = 3
            if (r7 > r4) goto L_0x06a4
            com.tencent.mm.ui.chatting.viewitems.y3 r3 = r14.f56268j
            android.widget.TextView r3 = r3.f56309e
            r4 = 8
            r3.setVisibility(r4)
            r3 = 16
            r2.gravity = r3
            com.tencent.mm.ui.chatting.viewitems.y3 r3 = r14.f56268j
            android.widget.LinearLayout r3 = r3.f56310f
            r3.setLayoutParams(r2)
            r4 = 0
            r0.topMargin = r4
            r2 = 17
            r0.gravity = r2
            goto L_0x0704
        L_0x06a4:
            r4 = 0
            int r5 = r12.f226318J
            r6 = 1
            if (r5 != r6) goto L_0x06ac
            r7 = 1
            goto L_0x06ad
        L_0x06ac:
            r7 = 0
        L_0x06ad:
            com.tencent.mm.ui.chatting.viewitems.y3 r5 = r14.f56268j
            android.widget.TextView r5 = r5.f56309e
            r5.setVisibility(r4)
            r4 = 48
            r2.gravity = r4
            com.tencent.mm.ui.chatting.viewitems.y3 r4 = r14.f56268j
            android.widget.LinearLayout r4 = r4.f56310f
            r4.setLayoutParams(r2)
            ck3.b r2 = r8.f56192v
            android.app.Activity r2 = r2.mo91565f()
            r4 = 38
            int r2 = kg3.C76577a.m92151b(r2, r4)
            r0.topMargin = r2
            r2 = 8388627(0x800013, float:1.175497E-38)
            r0.gravity = r2
            if (r7 == 0) goto L_0x06e6
            com.tencent.mm.ui.chatting.viewitems.y3 r2 = r14.f56268j
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r2.f56308d
            r2.setMaxLines(r3)
            com.tencent.mm.ui.chatting.viewitems.y3 r2 = r14.f56268j
            android.widget.TextView r2 = r2.f56309e
            r3 = 2131822689(0x7f110861, float:1.9278157E38)
            r2.setText(r3)
            goto L_0x06f8
        L_0x06e6:
            com.tencent.mm.ui.chatting.viewitems.y3 r2 = r14.f56268j
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r2.f56308d
            r3 = 3
            r2.setMaxLines(r3)
            com.tencent.mm.ui.chatting.viewitems.y3 r2 = r14.f56268j
            android.widget.TextView r2 = r2.f56309e
            r3 = 2131822690(0x7f110862, float:1.9278159E38)
            r2.setText(r3)
        L_0x06f8:
            com.tencent.mm.ui.chatting.viewitems.y3 r2 = r14.f56268j
            android.widget.TextView r2 = r2.f56309e
            com.tencent.mm.ui.chatting.viewitems.j4 r3 = new com.tencent.mm.ui.chatting.viewitems.j4
            r3.<init>(r8, r12, r14)
            r2.setOnClickListener(r3)
        L_0x0704:
            com.tencent.mm.ui.chatting.viewitems.y3 r2 = r14.f56268j
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r2.f56308d
            r2.setLayoutParams(r0)
        L_0x070b:
            r0 = 1
            if (r13 <= r0) goto L_0x0716
            com.tencent.mm.ui.chatting.viewitems.y3 r0 = r14.f56268j
            android.view.View r0 = r0.f56257a
            r0.setBackgroundResource(r1)
            goto L_0x0720
        L_0x0716:
            com.tencent.mm.ui.chatting.viewitems.y3 r0 = r14.f56268j
            android.view.View r0 = r0.f56257a
            r1 = 2131235723(0x7f08138b, float:1.8087648E38)
            r0.setBackgroundResource(r1)
        L_0x0720:
            com.tencent.mm.ui.chatting.viewitems.y3 r0 = r14.f56268j
            android.view.View r6 = r0.f56257a
            r0 = r46
            r1 = r14
            r2 = r12
            r3 = r49
            r4 = r47
            r5 = r11
            r0.mo26246v0(r1, r2, r3, r4, r5, r6)
            goto L_0x075b
        L_0x0731:
            r1 = 19
            if (r0 != r1) goto L_0x074e
            sj3.p r0 = sj3.C63941p.f181254a
            java.lang.String r1 = r12.f226321M
            r2 = 0
            boolean r0 = r0.mo88703a(r1, r2)
            if (r0 == 0) goto L_0x074e
            r0 = r46
            r1 = r14
            r2 = r13
            r3 = r12
            r4 = r49
            r5 = r47
            r6 = r11
            r0.mo26242q0(r1, r2, r3, r4, r5, r6)
            goto L_0x075b
        L_0x074e:
            r0 = r46
            r1 = r14
            r2 = r13
            r3 = r12
            r4 = r49
            r5 = r47
            r6 = r11
            r0.mo26243r0(r1, r2, r3, r4, r5, r6)
        L_0x075b:
            r10 = 1
        L_0x075c:
            if (r10 >= r13) goto L_0x0db1
            r7 = r39
            java.lang.Object r0 = r7.get(r10)
            r6 = r0
            s90.j r6 = (s90.C77630j) r6
            int r0 = r6.f226333o
            r5 = 6
            r4 = 7
            if (r0 != r5) goto L_0x076f
            r6.f226333o = r4
        L_0x076f:
            java.util.List<com.tencent.mm.ui.chatting.viewitems.r3> r0 = r14.f56262d
            int r1 = r10 + -1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r1)
            r3 = r0
            com.tencent.mm.ui.chatting.viewitems.r3 r3 = (com.tencent.p014mm.p136ui.chatting.viewitems.C19781r3) r3
            int r0 = r12.f226333o
            r2 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4 = 1
            if (r10 != r4) goto L_0x0836
            r4 = 5
            if (r0 == r4) goto L_0x078f
            r4 = 8
            if (r0 == r4) goto L_0x078f
            if (r0 != 0) goto L_0x0836
        L_0x078f:
            if (r0 != 0) goto L_0x07e9
            java.lang.Object r0 = r7.get(r2)
            s90.j r0 = (s90.C77630j) r0
            java.lang.String r0 = r0.f226330i
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x07e9
            android.view.View r0 = r3.f56246b
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r1.mo10233c(r5)
            java.lang.Object[] r29 = r1.mo10232b()
            java.lang.String r30 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r31 = "setItemLineAndPadding"
            java.lang.String r32 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r0
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r29 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r30 = "setItemLineAndPadding"
            java.lang.String r31 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
            android.view.View r0 = r3.f56246b
            int r1 = f56186C
            r8.mo26250z0(r0, r1)
            goto L_0x0831
        L_0x07e9:
            android.view.View r0 = r3.f56246b
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r4)
            java.lang.Object[] r29 = r1.mo10232b()
            java.lang.String r30 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r31 = "setItemLineAndPadding"
            java.lang.String r32 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r0
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r29 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r30 = "setItemLineAndPadding"
            java.lang.String r31 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
        L_0x0831:
            r0 = 1
            r4 = 7
            r5 = 6
            goto L_0x08cc
        L_0x0836:
            android.view.View r0 = r3.f56246b
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r2.mo10233c(r5)
            java.lang.Object[] r36 = r2.mo10232b()
            java.lang.String r37 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r38 = "setItemLineAndPadding"
            java.lang.String r39 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V"
            java.lang.String r40 = "android/view/View_EXEC_"
            java.lang.String r41 = "setVisibility"
            java.lang.String r42 = "(I)V"
            r35 = r0
            j20.C117292a.m165358d(r35, r36, r37, r38, r39, r40, r41, r42)
            r4 = 0
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r36 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r37 = "setItemLineAndPadding"
            java.lang.String r38 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V"
            java.lang.String r39 = "android/view/View_EXEC_"
            java.lang.String r40 = "setVisibility"
            java.lang.String r41 = "(I)V"
            j20.C117292a.m165359e(r35, r36, r37, r38, r39, r40, r41)
            r0 = 1
            if (r10 <= r0) goto L_0x08c2
            java.lang.Object r0 = r7.get(r1)
            s90.j r0 = (s90.C77630j) r0
            java.lang.Object r1 = r7.get(r10)
            s90.j r1 = (s90.C77630j) r1
            int r2 = r0.f226333o
            r4 = 7
            if (r2 == r4) goto L_0x089e
            r4 = 5
            if (r2 == r4) goto L_0x089e
            r4 = 6
            if (r2 == r4) goto L_0x089e
            java.lang.String r0 = r0.f226330i
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x089b
            goto L_0x089e
        L_0x089b:
            r4 = 7
            r5 = 6
            goto L_0x08b1
        L_0x089e:
            int r0 = r1.f226333o
            r4 = 7
            if (r0 == r4) goto L_0x08b9
            r2 = 5
            if (r0 == r2) goto L_0x08b9
            r5 = 6
            if (r0 == r5) goto L_0x08ba
            java.lang.String r0 = r1.f226330i
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x08ba
        L_0x08b1:
            android.view.View r0 = r3.f56246b
            int r1 = f56186C
            r8.mo26250z0(r0, r1)
            goto L_0x08cb
        L_0x08b9:
            r5 = 6
        L_0x08ba:
            android.view.View r0 = r3.f56246b
            int r1 = f56187D
            r8.mo26250z0(r0, r1)
            goto L_0x08cb
        L_0x08c2:
            r4 = 7
            r5 = 6
            android.view.View r0 = r3.f56246b
            int r1 = f56186C
            r8.mo26250z0(r0, r1)
        L_0x08cb:
            r0 = 1
        L_0x08cc:
            if (r10 != r0) goto L_0x08e6
            int r0 = r13 + -1
            if (r10 != r0) goto L_0x08db
            android.view.View r0 = r3.f56247c
            int r1 = f56186C
            r2 = 0
            r0.setPadding(r2, r1, r2, r1)
            goto L_0x08fc
        L_0x08db:
            r2 = 0
            android.view.View r0 = r3.f56247c
            int r1 = f56186C
            int r4 = f56184A
            r0.setPadding(r2, r1, r2, r4)
            goto L_0x08fc
        L_0x08e6:
            r2 = 0
            int r0 = r13 + -1
            if (r10 != r0) goto L_0x08f5
            android.view.View r0 = r3.f56247c
            int r1 = f56184A
            int r4 = f56186C
            r0.setPadding(r2, r1, r2, r4)
            goto L_0x08fc
        L_0x08f5:
            android.view.View r0 = r3.f56247c
            int r1 = f56184A
            r0.setPadding(r2, r1, r2, r1)
        L_0x08fc:
            r16 = 0
            r0 = r46
            r1 = r14
            r2 = r3
            r4 = r3
            r3 = r6
            r17 = r12
            r12 = r4
            r4 = r49
            r15 = 6
            r5 = r10
            r15 = r6
            r6 = r16
            r0.mo26248x0(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r12.f56248d
            android.content.res.Resources r1 = r48.mo91572m()
            r2 = 2131101252(0x7f060644, float:1.7814908E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            java.lang.String r0 = r15.f226325d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0974
            fx0.d r0 = fx0.C45821d.f123719a
            int r1 = r15.f226333o
            ck3.b r2 = r8.f56192v
            android.app.Activity r2 = r2.mo91565f()
            r3 = 5
            if (r1 == r3) goto L_0x0961
            r6 = 7
            if (r1 == r6) goto L_0x0955
            r3 = 8
            if (r1 == r3) goto L_0x0949
            android.content.res.Resources r1 = r2.getResources()
            r2 = 2131823431(0x7f110b47, float:1.9279661E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x096d
        L_0x0949:
            android.content.res.Resources r1 = r2.getResources()
            r2 = 2131823432(0x7f110b48, float:1.9279663E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x096d
        L_0x0955:
            android.content.res.Resources r1 = r2.getResources()
            r2 = 2131823441(0x7f110b51, float:1.9279682E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x096d
        L_0x0961:
            r6 = 7
            android.content.res.Resources r1 = r2.getResources()
            r2 = 2131823440(0x7f110b50, float:1.927968E38)
            java.lang.String r1 = r1.getString(r2)
        L_0x096d:
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r12.f56248d
            r3 = 3
            r0.mo71289g(r1, r2, r15, r3)
            goto L_0x097f
        L_0x0974:
            r3 = 3
            r6 = 7
            fx0.d r0 = fx0.C45821d.f123719a
            java.lang.String r1 = r15.f226325d
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r12.f56248d
            r0.mo71289g(r1, r2, r15, r3)
        L_0x097f:
            int r0 = r15.f226333o
            r5 = 19
            if (r0 != r5) goto L_0x0992
            sj3.p r0 = sj3.C63941p.f181254a
            java.lang.String r1 = r15.f226321M
            boolean r0 = r0.mo88703a(r1, r10)
            if (r0 == 0) goto L_0x0992
            r27 = 1
            goto L_0x0994
        L_0x0992:
            r27 = 0
        L_0x0994:
            java.lang.String r0 = r15.f226312D
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x09a6
            java.lang.String r0 = r15.f226322N
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x09a6
            r0 = 1
            goto L_0x09a7
        L_0x09a6:
            r0 = 0
        L_0x09a7:
            if (r27 == 0) goto L_0x09e1
            sj3.p r1 = sj3.C63941p.f181254a
            java.lang.String r2 = r15.f226321M
            s90.h r4 = r1.mo88706d(r2, r10)
            k40.a r2 = f40.C86709a0.m107533q(r24)
            ex0.d r2 = (ex0.C45696d) r2
            java.lang.String r3 = r4.f180629g
            te3.c21 r2 = r2.Pr0(r3)
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r12.f56248d
            r5 = 2131299367(0x7f090c27, float:1.8216733E38)
            java.lang.String r6 = r4.f180629g
            r3.setTag(r5, r6)
            if (r0 == 0) goto L_0x09cc
            java.lang.String r3 = r15.f226325d
            goto L_0x09ce
        L_0x09cc:
            java.lang.String r3 = r4.f180632j
        L_0x09ce:
            com.tencent.mm.ui.widget.MMNeat7extView r5 = r12.f56248d
            r1.mo88712j(r2, r5, r3)
            java.lang.String r2 = r4.f180628f
            java.lang.String r5 = r4.f180629g
            com.tencent.mm.ui.chatting.viewitems.b4$$c r6 = new com.tencent.mm.ui.chatting.viewitems.b4$$c
            r6.<init>(r8, r4, r12, r3)
            r1.mo88707e(r2, r5, r6)
            r6 = r4
            goto L_0x09e3
        L_0x09e1:
            r6 = r26
        L_0x09e3:
            int r1 = r15.f226334p
            if (r1 == 0) goto L_0x0a45
            r2 = 1
            if (r1 != r2) goto L_0x09eb
            goto L_0x0a45
        L_0x09eb:
            android.view.View r0 = r12.f56250f
            k20.a r1 = new k20.a
            r1.<init>()
            r2 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r3)
            java.lang.Object[] r29 = r1.mo10232b()
            java.lang.String r30 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r31 = "filling"
            java.lang.String r32 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r0
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r29 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r30 = "filling"
            java.lang.String r31 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r12.f56248d
            android.app.Activity r1 = r48.mo91565f()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            r5 = 7
            goto L_0x0aa8
        L_0x0a45:
            android.view.View r1 = r12.f56250f
            k20.a r2 = new k20.a
            r2.<init>()
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r29 = r2.mo10232b()
            java.lang.String r30 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r31 = "filling"
            java.lang.String r32 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r1
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r29 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r30 = "filling"
            java.lang.String r31 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r12.f56248d
            android.app.Activity r2 = r48.mo91565f()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099800(0x7f060098, float:1.7811963E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            int r1 = r15.f226333o
            r5 = 7
            if (r1 != r5) goto L_0x0ab4
            android.widget.ImageView r0 = r12.f56251g
            r1 = 8
            r0.setVisibility(r1)
        L_0x0aa8:
            r43 = r6
            r29 = r7
            r1 = 5
            r2 = 6
            r19 = 19
            r32 = 7
            goto L_0x0b71
        L_0x0ab4:
            java.lang.String r1 = r15.f226330i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0b1c
            android.widget.ImageView r1 = r12.f56251g
            r2 = 0
            r1.setVisibility(r2)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r14)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r12)
            if (r27 == 0) goto L_0x0ad8
            if (r6 == 0) goto L_0x0ad8
            if (r0 == 0) goto L_0x0ad5
            java.lang.String r0 = r15.f226312D
            goto L_0x0ae5
        L_0x0ad5:
            java.lang.String r0 = r6.f180638s
            goto L_0x0ae5
        L_0x0ad8:
            java.lang.String r0 = r15.f226312D
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0ae3
            java.lang.String r0 = r15.f226330i
            goto L_0x0ae5
        L_0x0ae3:
            java.lang.String r0 = r15.f226312D
        L_0x0ae5:
            r16 = r0
            android.widget.ImageView r4 = r12.f56251g
            int r28 = r49.getType()
            int r29 = f56188E
            com.tencent.mm.ui.chatting.viewitems.b4$$d r30 = new com.tencent.mm.ui.chatting.viewitems.b4$$d
            r0 = r30
            r1 = r46
            r31 = r4
            r4 = r15
            r19 = 19
            r32 = 7
            r5 = r49
            r43 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r6 = "@S"
            r0 = r46
            r1 = r16
            r2 = r31
            r3 = r28
            r4 = r29
            r5 = r29
            r29 = r7
            r7 = r30
            r0.mo26244t0(r1, r2, r3, r4, r5, r6, r7)
            r1 = 5
            r2 = 6
            goto L_0x0b71
        L_0x0b1c:
            r43 = r6
            r29 = r7
            r19 = 19
            r32 = 7
            int r0 = r15.f226333o
            r1 = 5
            r2 = 6
            if (r0 == r1) goto L_0x0b73
            if (r0 != r2) goto L_0x0b2d
            goto L_0x0b73
        L_0x0b2d:
            android.view.View r0 = r12.f56250f
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r5)
            java.lang.Object[] r34 = r3.mo10232b()
            java.lang.String r35 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r36 = "filling"
            java.lang.String r37 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r38 = "android/view/View_EXEC_"
            java.lang.String r39 = "setVisibility"
            java.lang.String r40 = "(I)V"
            r33 = r0
            j20.C117292a.m165358d(r33, r34, r35, r36, r37, r38, r39, r40)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r34 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r35 = "filling"
            java.lang.String r36 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r37 = "android/view/View_EXEC_"
            java.lang.String r38 = "setVisibility"
            java.lang.String r39 = "(I)V"
            j20.C117292a.m165359e(r33, r34, r35, r36, r37, r38, r39)
        L_0x0b71:
            r3 = 4
            goto L_0x0ba7
        L_0x0b73:
            android.widget.ImageView r0 = r12.f56251g
            r3 = 0
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r12.f56251g
            int r3 = f56188E
            gc0.a r33 = gc0.C20828a.m22825b()
            hc0.c$b r4 = new hc0.c$b
            r4.<init>()
            r5 = 1
            r4.f59345a = r5
            r5 = 2131100307(0x7f060293, float:1.7812992E38)
            r4.f59359o = r5
            r4.f59354j = r3
            r4.f59355k = r3
            r3 = 4
            r4.f59353i = r3
            hc0.c r36 = r4.mo32666a()
            r37 = 0
            wd3.q r38 = new wd3.q
            r38.<init>()
            java.lang.String r34 = "2131231667"
            r35 = r0
            r33.mo32522k(r34, r35, r36, r37, r38)
        L_0x0ba7:
            java.lang.String r0 = r15.f226332n
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0bc4
            int r0 = r15.f226333o
            r4 = 3
            if (r0 != r4) goto L_0x0bc5
            android.widget.TextView r0 = r12.f56249e
            java.lang.String r5 = r15.f226332n
            r0.setText(r5)
            android.widget.TextView r0 = r12.f56249e
            r5 = 0
            r0.setVisibility(r5)
            r6 = 8
            goto L_0x0bcd
        L_0x0bc4:
            r4 = 3
        L_0x0bc5:
            r5 = 0
            android.widget.TextView r0 = r12.f56249e
            r6 = 8
            r0.setVisibility(r6)
        L_0x0bcd:
            android.view.View r0 = r12.f56245a
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r7.mo10233c(r1)
            java.lang.Object[] r34 = r7.mo10232b()
            java.lang.String r35 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r36 = "filling"
            java.lang.String r37 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r38 = "android/view/View_EXEC_"
            java.lang.String r39 = "setVisibility"
            java.lang.String r40 = "(I)V"
            r33 = r0
            j20.C117292a.m165358d(r33, r34, r35, r36, r37, r38, r39, r40)
            r1 = 0
            java.lang.Object r5 = r7.mo10231a(r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r1 = r5.intValue()
            r0.setVisibility(r1)
            java.lang.String r34 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom"
            java.lang.String r35 = "filling"
            java.lang.String r36 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r37 = "android/view/View_EXEC_"
            java.lang.String r38 = "setVisibility"
            java.lang.String r39 = "(I)V"
            j20.C117292a.m165359e(r33, r34, r35, r36, r37, r38, r39)
            java.lang.Class<zj3.e> r0 = zj3.C79348e.class
            com.tencent.mm.ui.chatting.manager.a r1 = r9.f193278b
            xi.d r0 = r1.mo102812a(r0)
            zj3.e r0 = (zj3.C79348e) r0
            java.lang.String r1 = r15.f226326e
            java.lang.String r20 = r0.mo70074s1(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto L_0x0c88
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r5 = 0
            r1[r5] = r20
            java.lang.String r7 = "MicroMsg.ChattingItemBizFrom"
            java.lang.String r0 = "productId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r0, r1)
            com.tencent.mm.ui.chatting.viewitems.t8 r0 = new com.tencent.mm.ui.chatting.viewitems.t8
            r1 = 0
            java.lang.String r7 = r15.f226326e
            boolean r2 = r8.f56193w
            java.lang.String r16 = r48.mo91576q()
            java.lang.String r3 = r11.f226292f
            java.lang.String r4 = r11.f226293g
            java.lang.String r5 = r15.f226325d
            r30 = 0
            r31 = 0
            r33 = 1
            r6 = r10
            r10 = r0
            r34 = r0
            r0 = r11
            r11 = r49
            r36 = r6
            r6 = r12
            r35 = r17
            r12 = r1
            r28 = r13
            r1 = 2
            r37 = 4
            r38 = 19
            r39 = 3
            r13 = r47
            r40 = r14
            r14 = r7
            r7 = r49
            r44 = r15
            r25 = 6
            r15 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r21 = r30
            r22 = r31
            r23 = r33
            r10.<init>((com.tencent.p014mm.storage.C72963f4) r11, (boolean) r12, (uj3.C78208e) r13, (java.lang.String) r14, (boolean) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (boolean) r22, (boolean) r23)
            android.view.View r2 = r6.f56245a
            com.tencent.mm.ui.chatting.l2 r3 = r8.mo103096n(r9)
            r2.setOnClickListener(r3)
            r2 = r34
            r4 = r44
            goto L_0x0cc8
        L_0x0c88:
            r7 = r49
            r36 = r10
            r0 = r11
            r6 = r12
            r28 = r13
            r40 = r14
            r44 = r15
            r35 = r17
            r1 = 2
            r25 = 6
            r37 = 4
            r38 = 19
            r39 = 3
            com.tencent.mm.ui.chatting.viewitems.t8 r2 = new com.tencent.mm.ui.chatting.viewitems.t8
            r12 = 0
            r4 = r44
            java.lang.String r14 = r4.f226326e
            boolean r15 = r8.f56193w
            java.lang.String r16 = r48.mo91576q()
            java.lang.String r3 = r0.f226292f
            java.lang.String r5 = r0.f226293g
            r10 = r2
            r11 = r49
            r13 = r47
            r17 = r3
            r18 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r8.mo26240o0(r2, r4, r7)
            android.view.View r3 = r6.f56245a
            com.tencent.mm.ui.chatting.r2 r5 = r8.mo103103z(r9)
            r3.setOnClickListener(r5)
        L_0x0cc8:
            long r10 = r49.mo108774y2()
            r2.f217949A = r10
            r10 = r36
            r2.f217950B = r10
            int r3 = r4.f226333o
            r2.f217955G = r3
            java.lang.String r3 = r4.f226325d
            r2.f217956H = r3
            java.lang.String r3 = com.tencent.p014mm.message.C92721n.m116882j(r4)
            r2.f217957I = r3
            android.view.View r3 = r6.f56245a
            r3.setTag(r2)
            java.lang.String r2 = r4.f226336r
            boolean r2 = kb0.C9576e.m9260a(r2)
            if (r2 == 0) goto L_0x0cff
            android.view.View r2 = r6.f56245a
            ck3.b r3 = r8.f56192v
            java.lang.String r3 = r3.mo91577r()
            if (r2 == 0) goto L_0x0cff
            com.tencent.mm.ui.chatting.z1 r5 = new com.tencent.mm.ui.chatting.z1
            r5.<init>(r4, r3)
            r2.setOnClickListener(r5)
        L_0x0cff:
            android.view.View r11 = r6.f56245a
            long r12 = r49.getMsgId()
            long r14 = r49.mo108774y2()
            int r2 = r4.f226333o
            r5 = 5
            if (r5 != r2) goto L_0x0d2a
            com.tencent.mm.ui.chatting.viewitems.f4 r3 = new com.tencent.mm.ui.chatting.viewitems.f4
            r2 = r0
            r0 = r3
            r1 = r46
            r45 = r2
            r2 = r4
            r8 = r3
            r3 = r10
            r36 = r10
            r16 = 5
            r10 = r4
            r4 = r12
            r12 = r6
            r23 = r36
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r6)
            r11.setOnClickListener(r8)
            goto L_0x0d32
        L_0x0d2a:
            r45 = r0
            r12 = r6
            r23 = r10
            r16 = 5
            r10 = r4
        L_0x0d32:
            android.view.View r0 = r12.f56245a
            r1 = r46
            com.tencent.mm.ui.chatting.viewitems.i$e r2 = r1.mo103098p(r9)
            r0.setOnLongClickListener(r2)
            android.view.View r0 = r12.f56245a
            java.lang.Class<zj3.l> r2 = zj3.C79368l.class
            xi.d r2 = r9.mo91560a(r2)
            zj3.l r2 = (zj3.C79368l) r2
            com.tencent.mm.ui.chatting.h2 r2 = r2.mo108189Z4()
            r0.setOnTouchListener(r2)
            int r0 = r10.f226333o
            r2 = 8
            if (r0 != r2) goto L_0x0d7e
            android.widget.ImageView r0 = r12.f56256l
            r3 = 2131755252(0x7f1000f4, float:1.9141378E38)
            r0.setImageResource(r3)
            android.widget.ImageView r0 = r12.f56256l
            r3 = 0
            r0.setVisibility(r3)
            int r0 = r10.f226311C
            r4 = 1
            if (r0 <= r4) goto L_0x0d78
            android.widget.TextView r0 = r12.f56255k
            r0.setVisibility(r3)
            android.widget.TextView r0 = r12.f56255k
            int r5 = r10.f226311C
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.setText(r5)
            goto L_0x0d8a
        L_0x0d78:
            android.widget.TextView r0 = r12.f56255k
            r0.setVisibility(r2)
            goto L_0x0d8a
        L_0x0d7e:
            r3 = 0
            r4 = 1
            android.widget.ImageView r0 = r12.f56256l
            r0.setVisibility(r2)
            android.widget.TextView r0 = r12.f56255k
            r0.setVisibility(r2)
        L_0x0d8a:
            if (r27 == 0) goto L_0x0d9d
            r0 = r43
            if (r0 == 0) goto L_0x0d9d
            android.view.View r5 = r12.f56245a
            com.tencent.mm.ui.chatting.viewitems.b4$$e r6 = new com.tencent.mm.ui.chatting.viewitems.b4$$e
            r7 = r45
            r6.<init>(r1, r0, r7, r9)
            r5.setOnClickListener(r6)
            goto L_0x0d9f
        L_0x0d9d:
            r7 = r45
        L_0x0d9f:
            int r10 = r23 + 1
            r15 = r49
            r8 = r1
            r11 = r7
            r13 = r28
            r39 = r29
            r12 = r35
            r14 = r40
            r21 = 2
            goto L_0x075c
        L_0x0db1:
            r1 = r8
            r29 = r39
            r3 = 0
            r4 = 1
            k40.a r0 = f40.C86709a0.m107533q(r24)
            ex0.d r0 = (ex0.C45696d) r0
            r2 = 2
            boolean r0 = r0.mo70957E5(r2)
            if (r0 == 0) goto L_0x0e21
            r7 = 0
        L_0x0dc4:
            int r0 = r29.size()
            if (r7 >= r0) goto L_0x0e21
            r0 = r29
            java.lang.Object r5 = r0.get(r7)
            s90.j r5 = (s90.C77630j) r5
            java.lang.String r6 = r5.f226326e
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0e1c
            k40.a r6 = f40.C86709a0.m107533q(r24)
            ex0.d r6 = (ex0.C45696d) r6
            java.lang.String r8 = r5.f226326e
            int r9 = r5.f226333o
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r6.Tn0(r8, r9, r3, r10)
            int r6 = r5.f226317I
            if (r6 != r4) goto L_0x0e06
            k40.a r6 = f40.C86709a0.m107533q(r24)
            ex0.d r6 = (ex0.C45696d) r6
            boolean r6 = r6.Cl0()
            if (r6 == 0) goto L_0x0e06
            k40.a r6 = f40.C86709a0.m107533q(r24)
            ex0.d r6 = (ex0.C45696d) r6
            java.lang.String r8 = r5.f226326e
            int r9 = r5.f226333o
            r6.mo71003o4(r8, r9, r3, r2)
        L_0x0e06:
            java.lang.Class<ex0.h> r6 = ex0.C45700h.class
            k40.a r6 = f40.C86709a0.m107533q(r6)
            r8 = r6
            ex0.h r8 = (ex0.C45700h) r8
            java.lang.String r9 = r5.f226326e
            r11 = 0
            java.lang.String r12 = r5.f226325d
            java.lang.String r13 = r5.f226332n
            r14 = 0
            r15 = 2
            r10 = 0
            r8.mo71036ed(r9, r10, r11, r12, r13, r14, r15)
        L_0x0e1c:
            int r7 = r7 + 1
            r29 = r0
            goto L_0x0dc4
        L_0x0e21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C19762b4.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == 285212721;
    }

    /* renamed from: m0 */
    public boolean mo26239m0() {
        return false;
    }

    /* renamed from: o0 */
    public final void mo26240o0(C74243t8 t8Var, C77630j jVar, C72963f4 f4Var) {
        Bundle bundle = new Bundle();
        int b = C45629t0.m50815b(mo103068y(this.f56192v, f4Var), this.f56192v.mo91577r());
        int i = 2;
        if (b == 1) {
            i = 3;
        } else if (b != 2) {
            i = (b == 6 || b == 7) ? 5 : 0;
        }
        bundle.putString("share_report_pre_msg_url", jVar.f226326e);
        bundle.putString("share_report_pre_msg_title", jVar.f226325d);
        bundle.putString("share_report_pre_msg_desc", jVar.f226332n);
        bundle.putString("share_report_pre_msg_icon_url", C92721n.m116882j(jVar));
        bundle.putString("share_report_pre_msg_appid", "");
        bundle.putInt("share_report_from_scene", i);
        if (i == 5) {
            bundle.putString("share_report_biz_username", this.f56192v.mo91577r());
        }
        t8Var.f217953E = bundle;
    }

    /* renamed from: p0 */
    public final void mo26241p0(C67391b bVar, C72963f4 f4Var) {
        boolean z = this.f56196z;
        if (!z) {
            String s0 = m21449s0(f4Var, bVar.mo91565f(), this.f56194x);
            if (!Util.isNullOrNil(s0)) {
                Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
                intent.putExtra("Retr_Msg_content", s0);
                intent.putExtra("Retr_Msg_Type", 2);
                intent.putExtra("Retr_Biz_Msg_Selected_Msg_Index", this.f56194x);
                intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
                intent.putExtra("Retr_MsgFromScene", 1);
                String t = f4Var.mo108768t();
                String a = C86493v0.m107223a("" + f4Var.mo108774y2());
                intent.putExtra("reportSessionId", a);
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
                c.mo120962i("prePublishId", "msg_" + f4Var.mo108774y2());
                c.mo120962i("preUsername", t);
                c.mo120962i("preChatName", t);
                c.mo120962i("preMsgIndex", Integer.valueOf(this.f56194x));
                c.mo120962i("sendAppMsgScene", 1);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(bVar, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "doRestransmit", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bVar.mo91556Q((Intent) aVar.mo10231a(0));
                C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "doRestransmit", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else if (!z) {
            Log.m105928w("MicroMsg.ChattingItemBizFrom", "transmitAppBrandMsg not AppBrandMsg!");
        } else {
            C73309a2.m86454g(this.f56194x, bVar.mo91565f(), f4Var.getContent(), f4Var.mo108768t(), f4Var.getMsgId(), f4Var.mo108774y2());
        }
    }

    /* renamed from: q0 */
    public final void mo26242q0(C19783t3 t3Var, int i, C77630j jVar, C72963f4 f4Var, C78208e eVar, C77629i iVar) {
        C19783t3 t3Var2 = t3Var;
        int i2 = i;
        C77630j jVar2 = jVar;
        C77629i iVar2 = iVar;
        Class cls = C45696d.class;
        C63941p pVar = C63941p.f181254a;
        boolean z = false;
        C63724h d = pVar.mo88706d(jVar2.f226321M, 0);
        if (!Util.isNullOrNil(jVar2.f226312D) && !Util.isNullOrNil(jVar2.f226322N)) {
            View view = t3Var2.f56269k.f56270d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = t3Var2.f56269k.f56278l;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i2 == 1) {
                View view5 = t3Var2.f56269k.f56284r;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                Object[] b = aVar3.mo10232b();
                C9556a aVar4 = aVar3;
                View view6 = view5;
                C117292a.m165358d(view6, b, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view7 = t3Var2.f56269k.f56281o;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                t3Var2.f56269k.f56285s.setText(jVar2.f226325d);
                t3Var2.f56269k.f56286t.setVisibility(8);
                C8219i.f27144a.mo9271b(t3Var2.f56269k.f56282p);
                C46746a.f125826a.mo71977j(t3Var2.f56269k.f56284r, (float) C76577a.m92151b(MMApplicationContext.getContext(), 4), false, true);
            } else {
                View view9 = t3Var2.f56269k.f56284r;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(8);
                Object[] b2 = aVar6.mo10232b();
                C9556a aVar7 = aVar6;
                View view10 = view9;
                C117292a.m165358d(view10, b2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view11 = t3Var2.f56269k.f56281o;
                C9556a aVar8 = new C9556a();
                aVar8.mo10233c(0);
                View view12 = view11;
                C117292a.m165358d(view12, aVar8.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                t3Var2.f56269k.f56282p.setText(jVar2.f226325d);
                t3Var2.f56269k.f56283q.setVisibility(8);
            }
            pVar.mo88713k(t3Var2.f56269k.f56280n, jVar2.f226322N);
            mo26247w0(t3Var2.f56269k.f56279m, f56191H);
            C46746a.f125826a.mo71977j(t3Var2.f56269k.f56257a, (float) C76577a.m92151b(MMApplicationContext.getContext(), 4), true, false);
            mo26246v0(t3Var, jVar, f4Var, eVar, iVar, t3Var2.f56269k.f56257a);
            C64273c21 Pr0 = ((C45696d) C86709a0.m107533q(cls)).Pr0(d.f180629g);
            C19784u3 u3Var = t3Var2.f56269k;
            pVar.mo88711i(Pr0, u3Var.f56287u, u3Var.f56288v);
            t3Var2.f56269k.f56257a.setTag(C0966R.C0970id.mxm, d.f180629g);
            pVar.mo88707e(d.f180628f, d.f180629g, new C19778k4(this, d, t3Var2, i2));
            t3Var2.f56269k.f56257a.setOnClickListener(new C19763c4(this, i2, d, iVar2));
            return;
        }
        View view13 = t3Var2.f56269k.f56270d;
        C9556a aVar9 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar9.mo10233c(0);
        View view14 = view13;
        C117292a.m165358d(view14, aVar9.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSpecialLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view13.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
        C117292a.m165359e(view14, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSpecialLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view15 = t3Var2.f56269k.f56278l;
        C9556a aVar10 = new C9556a();
        aVar10.mo10233c(8);
        View view16 = view15;
        C117292a.m165358d(view16, aVar10.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSpecialLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view15.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
        C117292a.m165359e(view16, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSpecialLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        t3Var2.f56269k.f56273g.setText(d.f180632j);
        C8219i.f27144a.mo9271b(t3Var2.f56269k.f56273g);
        t3Var2.f56269k.f56274h.setText(d.f180626d);
        t3Var2.f56269k.f56275i.setText("");
        C64273c21 Pr02 = ((C45696d) C86709a0.m107533q(cls)).Pr0(d.f180629g);
        C19784u3 u3Var2 = t3Var2.f56269k;
        pVar.mo88711i(Pr02, u3Var2.f56276j, u3Var2.f56277k);
        t3Var2.f56269k.f56257a.setTag(C0966R.C0970id.mxm, d.f180629g);
        pVar.mo88707e(d.f180628f, d.f180629g, new C19764d4(this, d, t3Var2));
        if (iVar2.f226295i.size() <= 1) {
            z = true;
        }
        C46746a.f125826a.mo71977j(t3Var2.f56269k.f56257a, (float) C76577a.m92151b(MMApplicationContext.getContext(), 6), true, z);
        C19784u3 u3Var3 = t3Var2.f56269k;
        pVar.mo88709g(u3Var3.f56272f, u3Var3.f56271e, d.f180638s);
        mo26246v0(t3Var, jVar, f4Var, eVar, iVar, t3Var2.f56269k.f56257a);
        t3Var2.f56269k.f56257a.setOnClickListener(new C19765e4(this, i2, d, iVar2));
    }

    /* renamed from: r0 */
    public final void mo26243r0(C19783t3 t3Var, int i, C77630j jVar, C72963f4 f4Var, C78208e eVar, C77629i iVar) {
        C19783t3 t3Var2 = t3Var;
        int i2 = i;
        C77630j jVar2 = jVar;
        int i3 = 0;
        t3Var2.f56261c.f56304h.setVisibility(i2 > 1 ? 8 : 0);
        t3Var2.f56261c.f56305i.setVisibility((i2 > 1 || Util.isNullOrNil(jVar2.f226332n)) ? 8 : 0);
        t3Var2.f56261c.f56303g.setVisibility(i2 > 1 ? 0 : 8);
        t3Var2.f56261c.f56307k.setVisibility(8);
        if (i2 == 1) {
            t3Var2.f56261c.f56306j.setBackgroundResource(C0966R.C0969drawable.f4805ne);
            View view = t3Var2.f56261c.f56302f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view3 = t3Var2.f56261c.f56302f;
            int i4 = Util.isNullOrNil(jVar2.f226330i) ? 0 : 8;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i4));
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t3Var2.f56261c.f56306j.setBackgroundResource(C0966R.C0969drawable.f4806nf);
            t3Var2.f56261c.f56303g.setTextColor(this.f56192v.mo91565f().getResources().getColor(C0966R.color.a18));
            t3Var2.f56261c.f56303g.setBackgroundResource(C0966R.C0969drawable.ags);
            t3Var2.f56261c.f56303g.getPaint().setFakeBoldText(true);
        }
        mo26247w0(t3Var2.f56261c.f56301e, f56189F);
        mo26247w0(t3Var2.f56261c.f56306j, f56189F);
        if (!Util.isNullOrNil(jVar2.f226330i)) {
            View view5 = t3Var2.f56261c.f56301e;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo26245u0(jVar2.f226330i, t3Var2.f56261c.f56300d, f4Var.getType(), true, f56189F, new b4$$f(this, i2, t3Var2));
            t3Var2.f56261c.f56302f.setBackgroundResource(C0966R.C0969drawable.f4783mt);
            View view7 = t3Var2.f56261c.f56302f;
            int i5 = f56186C;
            view7.setPadding(i5, f56185B, i5, i5);
            t3Var2.f56261c.f56306j.setVisibility(0);
            t3Var2.f56261c.f56305i.setMaxLines(30);
        } else {
            t3Var2.f56261c.f56305i.setMaxLines(100);
            View view8 = t3Var2.f56261c.f56301e;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view9 = view8;
            C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t3Var2.f56261c.f56304h.setVisibility(0);
            TextView textView = t3Var2.f56261c.f56305i;
            if (Util.isNullOrNil(jVar2.f226332n)) {
                i3 = 8;
            }
            textView.setVisibility(i3);
            if (i2 == 1) {
                t3Var2.f56261c.f56302f.setBackgroundResource(C0966R.C0969drawable.b3u);
            } else {
                t3Var2.f56261c.f56302f.setBackgroundResource(C0966R.C0969drawable.f4791n1);
            }
            View view10 = t3Var2.f56261c.f56302f;
            int i6 = f56186C;
            view10.setPadding(i6, i6, i6, i6);
            t3Var2.f56261c.f56306j.setVisibility(8);
        }
        t3Var2.f56261c.f56305i.setText(jVar2.f226332n);
        C45821d dVar = C45821d.f123719a;
        dVar.mo71289g(jVar2.f226325d, t3Var2.f56261c.f56304h, jVar2, 2);
        dVar.mo71289g(jVar2.f226325d, t3Var2.f56261c.f56303g, jVar2, 21);
        int i7 = jVar2.f226334p;
        if (!(i7 == 0 || i7 == 1)) {
            t3Var2.f56261c.f56303g.setVisibility(4);
        }
        mo26246v0(t3Var, jVar, f4Var, eVar, iVar, t3Var2.f56261c.f56257a);
    }

    /* renamed from: t0 */
    public final void mo26244t0(String str, ImageView imageView, int i, int i2, int i3, String str2, C22906q.C22907a aVar) {
        String str3 = str;
        String a = C102027b.m134386a(str, 3, true);
        C20828a b = C20828a.m22825b();
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59361q = C0966R.color.f3237k_;
        bVar.f59346b = true;
        bVar.f59354j = i2;
        bVar.f59355k = i3;
        bVar.f59369y = new C22908r(2);
        bVar.f59370z = new C22898h(2);
        bVar.f59350f = C14050a.m13405b(a);
        b.mo32522k(a, imageView, bVar.mo32666a(), (C98661k) null, new C22906q(2, 0, 0, (float[]) null, aVar));
    }

    /* renamed from: u0 */
    public final void mo26245u0(String str, ImageView imageView, int i, boolean z, int i2, C22906q.C22907a aVar) {
        String a = C102027b.m134386a(str, 3, true);
        int i3 = z ? C0966R.C0969drawable.bvk : C0966R.C0969drawable.bvj;
        boolean z2 = !z;
        int i4 = z ? C0966R.C0969drawable.f4570gb : C0966R.C0969drawable.f4569ga;
        float dimensionPixelSize = (float) this.f56192v.mo91565f().getResources().getDimensionPixelSize(C0966R.dimen.f4277ye);
        int f = C46746a.f125826a.mo71973f(imageView.getContext()) - ((int) (C76577a.m92156g(imageView.getContext()) * ((float) (((C79368l) this.f56192v.f193278b.mo102812a(C79368l.class)).mo108213v1() ? 72 : 32))));
        C20828a b = C20828a.m22825b();
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59361q = i4;
        bVar.f59346b = true;
        bVar.f59344B = i3 + "";
        bVar.f59354j = f;
        bVar.f59355k = i2;
        bVar.f59369y = new C22908r(2);
        bVar.f59370z = new C22898h(2);
        bVar.f59350f = C14050a.m13405b(a);
        b.mo32522k(a, imageView, bVar.mo32666a(), (C98661k) null, new C22906q(2, f, i2, true, z2, dimensionPixelSize, aVar));
    }

    /* renamed from: v0 */
    public final void mo26246v0(C19783t3 t3Var, C77630j jVar, C72963f4 f4Var, C78208e eVar, C77629i iVar, View view) {
        C74243t8 t8Var;
        C77630j jVar2 = jVar;
        C77629i iVar2 = iVar;
        View view2 = view;
        String s1 = ((C79348e) this.f56192v.f193278b.mo102812a(C79348e.class)).mo70074s1(jVar2.f226326e);
        if (!TextUtils.isEmpty(s1)) {
            Log.m105919d("MicroMsg.ChattingItemBizFrom", "productId:%s", s1);
            t8Var = new C74243t8(f4Var, false, eVar, jVar2.f226326e, false, this.f56192v.mo91576q(), iVar2.f226292f, iVar2.f226293g, jVar2.f226325d, s1, (String) null, false, false);
            view2.setOnClickListener(mo103096n(this.f56192v));
            C72963f4 f4Var2 = f4Var;
        } else {
            t8Var = new C74243t8(f4Var, false, eVar, jVar2.f226326e, false, this.f56192v.mo91576q(), iVar2.f226292f, iVar2.f226293g, jVar2.f226325d);
            mo26240o0(t8Var, jVar2, f4Var);
            view2.setOnClickListener(mo103103z(this.f56192v));
        }
        t8Var.f217949A = f4Var.mo108774y2();
        t8Var.f217950B = 0;
        t8Var.f217955G = jVar2.f226333o;
        t8Var.f217956H = jVar2.f226325d;
        t8Var.f217957I = C92721n.m116882j(jVar);
        view2.setTag(t8Var);
        if (C9576e.m9260a(jVar2.f226336r)) {
            view2.setOnClickListener(new C74351z1(jVar2, this.f56192v.mo91577r()));
        }
        long msgId = f4Var.getMsgId();
        long y2 = f4Var.mo108774y2();
        if (5 == jVar2.f226333o) {
            view2.setOnClickListener(new C73983f4(this, jVar, 0, msgId, y2));
        }
        view2.setOnLongClickListener(mo103098p(this.f56192v));
        view2.setOnTouchListener(((C79368l) this.f56192v.f193278b.mo102812a(C79368l.class)).mo108189Z4());
    }

    /* renamed from: w0 */
    public final void mo26247w0(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: x0 */
    public final void mo26248x0(C19783t3 t3Var, C19781r3 r3Var, C77630j jVar, C72963f4 f4Var, int i, boolean z) {
        int i2;
        C19783t3 t3Var2 = t3Var;
        C19781r3 r3Var2 = r3Var;
        C77630j jVar2 = jVar;
        C72963f4 f4Var2 = f4Var;
        int i3 = i;
        View view = r3Var2.f56254j;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            i2 = 0;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setPlayIcon", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setPlayIcon", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            i2 = 0;
        }
        int i4 = jVar2.f226333o;
        if (i4 == 5) {
            r3Var2.f56252h.setVisibility(i2);
            if (z) {
                r3Var2.f56252h.setImageResource(C0966R.C0969drawable.f4600hf);
            } else {
                r3Var2.f56252h.setImageResource(C0966R.C0969drawable.f4600hf);
            }
            r3Var2.f56252h.setOnClickListener(new b4$$b(this, r3Var2));
        } else if (i4 == 6) {
            r3Var2.f56252h.setVisibility(i2);
            if (z) {
                if ((f4Var.getMsgId() + "_" + i3 + "_msg").equals(t3Var2.playingMsgId)) {
                    r3Var2.f56252h.setImageResource(C0966R.C0969drawable.f4770mf);
                } else {
                    r3Var2.f56252h.setImageResource(C0966R.C0969drawable.f4771mg);
                }
            } else {
                if ((f4Var.getMsgId() + "_" + i3 + "_msg").equals(t3Var2.playingMsgId)) {
                    r3Var2.f56252h.setImageResource(C0966R.raw.chatting_item_biz_music_pause_loading_icon);
                } else {
                    r3Var2.f56252h.setImageResource(C0966R.raw.chatting_item_biz_music_play_loading_icon);
                }
            }
            mo26249y0(r3Var2.f56252h, f4Var, i3, jVar2.f226330i);
        } else {
            C72963f4 f4Var3 = f4Var;
            if (i4 == 7) {
                r3Var2.f56252h.setVisibility(8);
                View view2 = r3Var2.f56254j;
                if (view2 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Integer.valueOf(i2));
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setPlayIcon", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(i2)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setPlayIcon", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                Drawable drawable = r3Var2.f56253i.getDrawable();
                if (drawable instanceof AnimationDrawable) {
                    AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
                    if (animationDrawable.isRunning()) {
                        animationDrawable.stop();
                    }
                }
                if ((f4Var.getMsgId() + "_" + i3 + "_msg").equals(t3Var2.playingMsgId)) {
                    r3Var2.f56253i.setImageResource(C0966R.C0969drawable.f4603hh);
                    if (r3Var2.f56253i.getDrawable() instanceof AnimationDrawable) {
                        ((AnimationDrawable) r3Var2.f56253i.getDrawable()).start();
                    }
                } else {
                    r3Var2.f56253i.setImageResource(C0966R.C0969drawable.f4601hg);
                }
                mo26249y0(r3Var2.f56253i, f4Var3, i3, jVar2.f226330i);
            } else {
                r3Var2.f56252h.setVisibility(8);
            }
        }
        int b = C76577a.m92151b(this.f56192v.mo91565f(), 26);
        int i5 = jVar2.f226333o;
        if (i5 == 7) {
            b = C76577a.m92151b(this.f56192v.mo91565f(), 32);
        } else if (i5 == 5) {
            b = C76577a.m92151b(this.f56192v.mo91565f(), 24);
        }
        ImageView imageView = r3Var2.f56252h;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = b;
        layoutParams.height = b;
        imageView.setLayoutParams(layoutParams);
    }

    /* renamed from: y0 */
    public final void mo26249y0(ImageView imageView, C72963f4 f4Var, int i, String str) {
        C74244u.C74254i iVar = new C74244u.C74254i();
        iVar.f218013b = f4Var.getMsgId();
        iVar.f218016e = i;
        iVar.f218015d = f4Var.getContent();
        imageView.setTag(iVar);
        imageView.setOnClickListener(((C79368l) this.f56192v.f193278b.mo102812a(C79368l.class)).mo108210s2());
    }

    /* renamed from: z0 */
    public final void mo26250z0(View view, int i) {
        if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.rightMargin = i;
            view.setLayoutParams(layoutParams);
        } else if (view.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.rightMargin = i;
            view.setLayoutParams(layoutParams2);
        }
    }
}
