package com.tencent.p014mm.plugin.finder.activity.uic;

import a14.C53934p0;
import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import ao1.C0138b;
import ao1.C0141c;
import ao1.C0143d;
import ao1.C0145d1;
import bl3.C0317e;
import ce1.C0477n;
import ce1.C0478o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58408t0;
import dp1.C58417y0;
import er1.C58679a1;
import er1.C58684b;
import er1.C58741j5;
import er1.C58784w3;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import jh2.C9434j;
import kd1.C60999e;
import kd1.C9579a;
import kd1.C9584f;
import kd1.C9585g;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import od1.C11405h;
import od1.C11407i;
import org.json.JSONObject;
import p232rw.C13586n;
import pe3.C47465a;
import qo3.C77407n;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C48726ak0;
import te3.C49295ek0;
import te3.C51270sn1;
import te3.C52271zj0;
import te3.C64726td1;
import te3.qr4;
import wx3.C15601d;
import wx3.C66212f;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC */
public final class FinderActivityParticipateUIC extends C11407i<C51270sn1> {

    /* renamed from: g */
    public TextView f12489g;

    /* renamed from: h */
    public LinearLayout f12490h;

    /* renamed from: i */
    public WeImageView f12491i;

    /* renamed from: j */
    public TextView f12492j;

    /* renamed from: n */
    public FrameLayout f12493n;

    /* renamed from: o */
    public FrameLayout f12494o;

    /* renamed from: p */
    public C77407n f12495p;

    /* renamed from: q */
    public int f12496q;

    /* renamed from: r */
    public C0145d1 f12497r;

    /* renamed from: s */
    public C0141c f12498s;

    /* renamed from: t */
    public final FinderActivityParticipateUIC$removeEvent$1 f12499t = new FinderActivityParticipateUIC$removeEvent$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC$a */
    public static final class C2304a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderActivityParticipateUIC f12500d;

        public C2304a(FinderActivityParticipateUIC finderActivityParticipateUIC) {
            this.f12500d = finderActivityParticipateUIC;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x009f, code lost:
            if (r1 == false) goto L_0x00a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a1, code lost:
            r12.mo2216F3(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a6, code lost:
            r1 = (te3.C51270sn1) r12.f33564d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x00aa, code lost:
            if (r1 == null) goto L_0x00af;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ac, code lost:
            r4 = r1.f141633w;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00af, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b0, code lost:
            if (r4 == null) goto L_0x00b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b4, code lost:
            if (r4.f146002H != 1) goto L_0x00b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b6, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b8, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b9, code lost:
            if (r4 == false) goto L_0x00ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bb, code lost:
            r0.f29824a = 1;
            r0.f29825b = 5;
            r12.mo2216F3(r0);
            r0 = r12.getContext();
            r12 = (te3.C51270sn1) r12.f33564d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cb, code lost:
            if (r12 == null) goto L_0x00cf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cd, code lost:
            r2 = r12.f141633w;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cf, code lost:
            gy3.C87412m.m108594g(r0, "context");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d2, code lost:
            if (r2 == null) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d4, code lost:
            r12 = r2.f146003I;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d6, code lost:
            if (r12 != null) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d8, code lost:
            r12 = r0.getResources().getString(com.tencent.p014mm.C0966R.string.fnc);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e3, code lost:
            gy3.C87412m.m108593f(r12, "event?.whitelist_block_r…ng.finder_activity_block)");
            nj3.C76912y0.m92773l(r0, r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ed, code lost:
            if (r1 == null) goto L_0x00f5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ef, code lost:
            r4 = r1.f141633w;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f1, code lost:
            if (r4 == null) goto L_0x00f5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f3, code lost:
            r3 = r4.f146017s;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f5, code lost:
            if (r1 == null) goto L_0x00fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f7, code lost:
            r1 = r1.f141633w;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f9, code lost:
            if (r1 == null) goto L_0x00fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fb, code lost:
            r4 = r1.f146018t;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fe, code lost:
            r4 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0100, code lost:
            r1 = r6.mo83868F0(r3, r4);
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("FinderActivityParticipateUIC", "participateBtn onClick isFinished : " + r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
            if (r1 == false) goto L_0x0125;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x011c, code lost:
            r0.f29824a = 1;
            r0.f29825b = 6;
            r12.mo2216F3(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0125, code lost:
            r12.mo2216F3(r0);
            r0 = r12.f12498s;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x012a, code lost:
            if (r0 == null) goto L_0x0161;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x012e, code lost:
            if (r0.f570e != false) goto L_0x0159;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0130, code lost:
            r12 = r0.f571f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0132, code lost:
            if (r12 != null) goto L_0x014a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0134, code lost:
            r0.f571f = qo3.C89779i0.m112248e(r0.getContext(), r0.getContext().getString(com.tencent.p014mm.C0966R.string.d_t), true, 2, (android.content.DialogInterface.OnCancelListener) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x014f, code lost:
            if ((!r12.isShowing()) == false) goto L_0x0164;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0151, code lost:
            r12 = r0.f571f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0153, code lost:
            if (r12 == null) goto L_0x0164;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0155, code lost:
            r12.show();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0159, code lost:
            r12 = r0.f572g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x015b, code lost:
            if (r12 == null) goto L_0x0164;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x015d, code lost:
            r12.invoke();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0161, code lost:
            r12.mo2224n3();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0164, code lost:
            j20.C117292a.m165361g(r11, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityParticipateUIC$setViewStyle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x016f, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x005d, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x009c, code lost:
            r0.f29824a = 1;
            r1 = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r12) {
            /*
                r11 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r12)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/activity/uic/FinderActivityParticipateUIC$setViewStyle$1"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r11
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC r12 = r11.f12500d
                r12.getClass()
                kd1.g$a r0 = new kd1.g$a
                r1 = 3
                r2 = 0
                r3 = 0
                r0.<init>(r3, r3, r1, r2)
                android.app.Activity r4 = r12.getContext()
                java.lang.String r5 = "context"
                gy3.C87412m.m108594g(r4, r5)
                er1.w3 r6 = er1.C58784w3.f168295a
                r7 = 1
                int r8 = er1.C58784w3.m68441q(r6, r2, r7, r2)
                r9 = 2
                switch(r8) {
                    case 1: goto L_0x0090;
                    case 2: goto L_0x005f;
                    case 3: goto L_0x005d;
                    case 4: goto L_0x0052;
                    case 5: goto L_0x0047;
                    case 6: goto L_0x0044;
                    default: goto L_0x003c;
                }
            L_0x003c:
                java.lang.String r1 = "FinderActivityUtils"
                java.lang.String r4 = "not one of six state"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r4)
                goto L_0x009c
            L_0x0044:
                r0.f29825b = r1
                goto L_0x005d
            L_0x0047:
                r1 = 2131829826(0x7f112442, float:1.9292632E38)
                android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r4, (int) r1, (int) r3)
                r1.show()
                goto L_0x009c
            L_0x0052:
                r1 = 2131826025(0x7f111569, float:1.9284923E38)
                android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r4, (int) r1, (int) r3)
                r1.show()
                goto L_0x009c
            L_0x005d:
                r1 = 0
                goto L_0x009f
            L_0x005f:
                com.tencent.mm.plugin.finder.view.v0 r1 = new com.tencent.mm.plugin.finder.view.v0
                r1.<init>(r4)
                r8 = 2131494655(0x7f0c06ff, float:1.8612825E38)
                r1.mo5070e(r8)
                android.view.View r8 = r1.f18463f
                r10 = 2131298612(0x7f090934, float:1.8215202E38)
                android.view.View r8 = r8.findViewById(r10)
                kd1.h r10 = new kd1.h
                r10.<init>(r1)
                r8.setOnClickListener(r10)
                android.view.View r8 = r1.f18463f
                r10 = 2131300560(0x7f0910d0, float:1.8219153E38)
                android.view.View r8 = r8.findViewById(r10)
                kd1.i r10 = new kd1.i
                r10.<init>(r4, r1)
                r8.setOnClickListener(r10)
                r1.mo5073h()
                goto L_0x009c
            L_0x0090:
                r0.f29825b = r9
                r1 = 2131829311(0x7f11223f, float:1.9291588E38)
                android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r4, (int) r1, (int) r3)
                r1.show()
            L_0x009c:
                r0.f29824a = r7
                r1 = 1
            L_0x009f:
                if (r1 == 0) goto L_0x00a6
                r12.mo2216F3(r0)
                goto L_0x0164
            L_0x00a6:
                T r1 = r12.f33564d
                te3.sn1 r1 = (te3.C51270sn1) r1
                if (r1 == 0) goto L_0x00af
                te3.zj0 r4 = r1.f141633w
                goto L_0x00b0
            L_0x00af:
                r4 = r2
            L_0x00b0:
                if (r4 == 0) goto L_0x00b8
                int r4 = r4.f146002H
                if (r4 != r7) goto L_0x00b8
                r4 = 1
                goto L_0x00b9
            L_0x00b8:
                r4 = 0
            L_0x00b9:
                if (r4 == 0) goto L_0x00ed
                r0.f29824a = r7
                r1 = 5
                r0.f29825b = r1
                r12.mo2216F3(r0)
                android.app.Activity r0 = r12.getContext()
                T r12 = r12.f33564d
                te3.sn1 r12 = (te3.C51270sn1) r12
                if (r12 == 0) goto L_0x00cf
                te3.zj0 r2 = r12.f141633w
            L_0x00cf:
                gy3.C87412m.m108594g(r0, r5)
                if (r2 == 0) goto L_0x00d8
                java.lang.String r12 = r2.f146003I
                if (r12 != 0) goto L_0x00e3
            L_0x00d8:
                android.content.res.Resources r12 = r0.getResources()
                r1 = 2131826050(0x7f111582, float:1.9284973E38)
                java.lang.String r12 = r12.getString(r1)
            L_0x00e3:
                java.lang.String r1 = "event?.whitelist_block_r…ng.finder_activity_block)"
                gy3.C87412m.m108593f(r12, r1)
                nj3.C76912y0.m92773l(r0, r12)
                goto L_0x0164
            L_0x00ed:
                if (r1 == 0) goto L_0x00f5
                te3.zj0 r4 = r1.f141633w
                if (r4 == 0) goto L_0x00f5
                int r3 = r4.f146017s
            L_0x00f5:
                if (r1 == 0) goto L_0x00fe
                te3.zj0 r1 = r1.f141633w
                if (r1 == 0) goto L_0x00fe
                long r4 = r1.f146018t
                goto L_0x0100
            L_0x00fe:
                r4 = 0
            L_0x0100:
                boolean r1 = r6.mo83868F0(r3, r4)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "participateBtn onClick isFinished : "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "FinderActivityParticipateUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                if (r1 == 0) goto L_0x0125
                r0.f29824a = r7
                r1 = 6
                r0.f29825b = r1
                r12.mo2216F3(r0)
                goto L_0x0164
            L_0x0125:
                r12.mo2216F3(r0)
                ao1.c r0 = r12.f12498s
                if (r0 == 0) goto L_0x0161
                boolean r12 = r0.f570e
                if (r12 != 0) goto L_0x0159
                qo3.i0 r12 = r0.f571f
                if (r12 != 0) goto L_0x014a
                android.app.Activity r12 = r0.getContext()
                android.app.Activity r1 = r0.getContext()
                r3 = 2131826680(0x7f1117f8, float:1.9286251E38)
                java.lang.String r1 = r1.getString(r3)
                qo3.i0 r12 = qo3.C89779i0.m112248e(r12, r1, r7, r9, r2)
                r0.f571f = r12
                goto L_0x0164
            L_0x014a:
                boolean r12 = r12.isShowing()
                r12 = r12 ^ r7
                if (r12 == 0) goto L_0x0164
                qo3.i0 r12 = r0.f571f
                if (r12 == 0) goto L_0x0164
                r12.show()
                goto L_0x0164
            L_0x0159:
                fy3.a<rx3.b0> r12 = r0.f572g
                if (r12 == 0) goto L_0x0164
                r12.invoke()
                goto L_0x0164
            L_0x0161:
                r12.mo2224n3()
            L_0x0164:
                java.lang.String r12 = "com/tencent/mm/plugin/finder/activity/uic/FinderActivityParticipateUIC$setViewStyle$1"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r11, r12, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.C2304a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC$b */
    public static final class C2305b implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ FinderActivityParticipateUIC f12501d;

        /* renamed from: e */
        public final /* synthetic */ C52271zj0 f12502e;

        public C2305b(FinderActivityParticipateUIC finderActivityParticipateUIC, C52271zj0 zj02) {
            this.f12501d = finderActivityParticipateUIC;
            this.f12502e = zj02;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            if (!e0Var.mo107176v()) {
                return;
            }
            if (this.f12501d.mo2222l3()) {
                C52271zj0 zj02 = this.f12502e;
                qr4 qr4 = zj02 != null ? zj02.f146001G : null;
                int i = qr4 != null ? qr4.f140512g : 0;
                Log.m105924i("FinderActivityParticipateUIC", "showParticipateBottomSheet: maas entryBit: " + i);
                if ((i & 1) > 0) {
                    Log.m105924i("FinderActivityParticipateUIC", "showParticipateBottomSheet: maas camera enable");
                    e0Var.mo107125a(1001, C0966R.string.f7980y8);
                }
                if ((i & 2) > 0) {
                    Log.m105924i("FinderActivityParticipateUIC", "showParticipateBottomSheet: maas album enable");
                    e0Var.mo107125a(1002, C0966R.string.f7989yh);
                }
                e0Var.mo107125a(1031, C0966R.string.lr5);
                return;
            }
            Log.m105924i("FinderActivityParticipateUIC", "showParticipateBottomSheet: no maas");
            e0Var.mo107125a(1001, C0966R.string.f7980y8);
            e0Var.mo107125a(1002, C0966R.string.f7989yh);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC$c */
    public static final class C2306c implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ FinderActivityParticipateUIC f12503d;

        public C2306c(FinderActivityParticipateUIC finderActivityParticipateUIC) {
            this.f12503d = finderActivityParticipateUIC;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Intent intent = new Intent();
            int itemId = menuItem.getItemId();
            if (itemId == 1001) {
                intent.putExtra("key_finder_post_router", 2);
            } else if (itemId == 1002) {
                intent.putExtra("key_finder_post_router", 3);
            } else if (itemId == 1031) {
                this.f12503d.mo2223m3();
                return;
            }
            this.f12503d.mo2225o3(intent);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC$d */
    public static final class C2307d implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ FinderActivityParticipateUIC f12504a;

        public C2307d(FinderActivityParticipateUIC finderActivityParticipateUIC) {
            this.f12504a = finderActivityParticipateUIC;
        }

        public final void onDismiss() {
            this.f12504a.f12495p = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC$e */
    public static final class C2308e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderActivityParticipateUIC f12505d;

        /* renamed from: e */
        public final /* synthetic */ C52271zj0 f12506e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2308e(FinderActivityParticipateUIC finderActivityParticipateUIC, C52271zj0 zj02) {
            super(0);
            this.f12505d = finderActivityParticipateUIC;
            this.f12506e = zj02;
        }

        public Object invoke() {
            this.f12505d.mo2220K3(this.f12506e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC$f */
    public static final class C2309f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderActivityParticipateUIC f12507d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2309f(FinderActivityParticipateUIC finderActivityParticipateUIC) {
            super(0);
            this.f12507d = finderActivityParticipateUIC;
        }

        public Object invoke() {
            this.f12507d.getClass();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderActivityParticipateUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f12497r = new C0145d1(appCompatActivity);
    }

    /* renamed from: F3 */
    public final void mo2216F3(C9585g.C9586a aVar) {
        C9584f fVar = C9584f.f29822a;
        Activity context = getContext();
        C51270sn1 sn12 = (C51270sn1) this.f33564d;
        C9584f.m9265b(fVar, context, "join_activity_publish", 0, 0, 0, sn12 != null ? sn12.f141633w : null, aVar, 28, (Object) null);
        Activity context2 = getContext();
        Intent intent = getIntent();
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(intent, "intent");
        long longExtra = intent.getLongExtra("key_feed_ref_id", 0);
        int intExtra = intent.getIntExtra("key_from_comment_scene", 0);
        intent.putExtra("key_ref_feed_id", longExtra);
        intent.putExtra("key_ref_comment_scene", intExtra);
        C58408t0.f167336a.mo83263i(context2, 60);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0051, code lost:
        if (r1 == null) goto L_0x0053;
     */
    /* renamed from: G3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2217G3(int r6) {
        /*
            r5 = this;
            T r0 = r5.f33564d
            te3.sn1 r0 = (te3.C51270sn1) r0
            r1 = 0
            if (r0 == 0) goto L_0x000a
            te3.zj0 r0 = r0.f141633w
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            er1.w3 r2 = er1.C58784w3.f168295a
            if (r0 == 0) goto L_0x0012
            te3.ek0 r3 = r0.f146023y
            goto L_0x0013
        L_0x0012:
            r3 = r1
        L_0x0013:
            boolean r2 = r2.mo83906V0(r3)
            if (r2 == 0) goto L_0x0081
            if (r0 == 0) goto L_0x0022
            te3.ek0 r2 = r0.f146023y
            if (r2 == 0) goto L_0x0022
            java.lang.String r2 = r2.f132980r
            goto L_0x0023
        L_0x0022:
            r2 = r1
        L_0x0023:
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0030
            int r2 = r2.length()
            if (r2 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r2 = 0
            goto L_0x0031
        L_0x0030:
            r2 = 1
        L_0x0031:
            if (r2 == 0) goto L_0x0068
            r1 = 2
            java.lang.String r6 = er1.C7878t0.m8034c(r1, r6)
            if (r0 == 0) goto L_0x0053
            te3.ek0 r0 = r0.f146023y
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r0.f132971f
            if (r0 == 0) goto L_0x0053
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L_0x0070
        L_0x0053:
            android.app.Activity r0 = r5.getContext()
            r1 = 2131826080(0x7f1115a0, float:1.9285034E38)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r4] = r6
            java.lang.String r1 = r0.getString(r1, r2)
            java.lang.String r6 = "context.getString(R.stri…ity_item_desc, countText)"
            gy3.C87412m.m108593f(r1, r6)
            goto L_0x0070
        L_0x0068:
            if (r0 == 0) goto L_0x0070
            te3.ek0 r6 = r0.f146023y
            if (r6 == 0) goto L_0x0070
            java.lang.String r1 = r6.f132980r
        L_0x0070:
            android.widget.TextView r6 = r5.f12489g
            if (r6 != 0) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            r6.setText(r1)
        L_0x0078:
            android.widget.TextView r6 = r5.f12489g
            if (r6 != 0) goto L_0x007d
            goto L_0x008b
        L_0x007d:
            r6.setVisibility(r4)
            goto L_0x008b
        L_0x0081:
            android.widget.TextView r6 = r5.f12489g
            if (r6 != 0) goto L_0x0086
            goto L_0x008b
        L_0x0086:
            r0 = 8
            r6.setVisibility(r0)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.mo2217G3(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        if ((r5 != null && r5.business_type == 17) != false) goto L_0x001c;
     */
    /* renamed from: I3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2218I3(te3.C51270sn1 r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0006
            te3.zj0 r5 = r5.f141633w
            goto L_0x0007
        L_0x0006:
            r5 = r0
        L_0x0007:
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L_0x001b
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r5 = r5.f146020v
            if (r5 == 0) goto L_0x0017
            int r5 = r5.business_type
            r3 = 17
            if (r5 != r3) goto L_0x0017
            r5 = 1
            goto L_0x0018
        L_0x0017:
            r5 = 0
        L_0x0018:
            if (r5 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            r5 = 8
            if (r1 == 0) goto L_0x0073
            android.widget.FrameLayout r1 = r4.f33565e
            if (r1 == 0) goto L_0x002e
            r3 = 2131296594(0x7f090152, float:1.821111E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x002f
        L_0x002e:
            r1 = r0
        L_0x002f:
            r4.f12489g = r1
            android.widget.FrameLayout r1 = r4.f33565e
            if (r1 == 0) goto L_0x003f
            r3 = 2131296591(0x7f09014f, float:1.8211103E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            goto L_0x0040
        L_0x003f:
            r1 = r0
        L_0x0040:
            r4.f12490h = r1
            android.widget.FrameLayout r1 = r4.f33565e
            if (r1 == 0) goto L_0x0050
            r3 = 2131296593(0x7f090151, float:1.8211107E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            goto L_0x0051
        L_0x0050:
            r1 = r0
        L_0x0051:
            r4.f12491i = r1
            android.widget.FrameLayout r1 = r4.f33565e
            if (r1 == 0) goto L_0x0060
            r0 = 2131296596(0x7f090154, float:1.8211113E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0060:
            r4.f12492j = r0
            android.widget.FrameLayout r0 = r4.f12494o
            if (r0 != 0) goto L_0x0067
            goto L_0x006a
        L_0x0067:
            r0.setVisibility(r2)
        L_0x006a:
            android.widget.FrameLayout r0 = r4.f12493n
            if (r0 != 0) goto L_0x006f
            goto L_0x00c5
        L_0x006f:
            r0.setVisibility(r5)
            goto L_0x00c5
        L_0x0073:
            android.widget.FrameLayout r1 = r4.f33565e
            if (r1 == 0) goto L_0x0081
            r3 = 2131296589(0x7f09014d, float:1.8211099E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x0082
        L_0x0081:
            r1 = r0
        L_0x0082:
            r4.f12489g = r1
            android.widget.FrameLayout r1 = r4.f33565e
            if (r1 == 0) goto L_0x0092
            r3 = 2131296590(0x7f09014e, float:1.82111E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            goto L_0x0093
        L_0x0092:
            r1 = r0
        L_0x0093:
            r4.f12490h = r1
            android.widget.FrameLayout r1 = r4.f33565e
            if (r1 == 0) goto L_0x00a3
            r3 = 2131296592(0x7f090150, float:1.8211105E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            goto L_0x00a4
        L_0x00a3:
            r1 = r0
        L_0x00a4:
            r4.f12491i = r1
            android.widget.FrameLayout r1 = r4.f33565e
            if (r1 == 0) goto L_0x00b3
            r0 = 2131296595(0x7f090153, float:1.8211111E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x00b3:
            r4.f12492j = r0
            android.widget.FrameLayout r0 = r4.f12494o
            if (r0 != 0) goto L_0x00ba
            goto L_0x00bd
        L_0x00ba:
            r0.setVisibility(r5)
        L_0x00bd:
            android.widget.FrameLayout r5 = r4.f12493n
            if (r5 != 0) goto L_0x00c2
            goto L_0x00c5
        L_0x00c2:
            r5.setVisibility(r2)
        L_0x00c5:
            android.widget.LinearLayout r5 = r4.f12490h
            if (r5 == 0) goto L_0x00d1
            com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC$a r0 = new com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC$a
            r0.<init>(r4)
            r5.setOnClickListener(r0)
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.mo2218I3(te3.sn1):void");
    }

    /* renamed from: J3 */
    public final void mo2219J3(Intent intent) {
        String str;
        String str2;
        String str3;
        C48726ak0 ak02;
        String str4;
        C49295ek0 ek02;
        FinderContact finderContact;
        FinderContact finderContact2;
        FinderContact finderContact3;
        qr4 qr4;
        C51270sn1 sn12 = (C51270sn1) this.f33564d;
        ArrayList arrayList = null;
        C52271zj0 zj02 = sn12 != null ? sn12.f141633w : null;
        intent.putExtra("key_finder_post_id", C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond());
        intent.putExtra("key_finder_post_from", 9);
        intent.putExtra("key_activity_camera_position", (zj02 == null || (qr4 = zj02.f146001G) == null) ? 1 : qr4.f140513h);
        intent.putExtra("saveActivity", true);
        intent.putExtra("key_activity_type", 102);
        String str5 = "";
        if (zj02 == null || (finderContact3 = zj02.f146006e) == null || (str = finderContact3.username) == null) {
            str = str5;
        }
        intent.putExtra("key_user_name", str);
        if (zj02 == null || (finderContact2 = zj02.f146006e) == null || (str2 = finderContact2.nickname) == null) {
            str2 = str5;
        }
        intent.putExtra("key_nick_name", str2);
        if (zj02 == null || (finderContact = zj02.f146006e) == null || (str3 = finderContact.headUrl) == null) {
            str3 = str5;
        }
        intent.putExtra("key_avatar_url", str3);
        intent.putExtra("key_cover_url", getCoverImgUrl());
        intent.putExtra("key_activity_display_mask", zj02 != null ? zj02.f146022x : 0);
        intent.putExtra("key_topic_id", zj02 != null ? Long.valueOf(zj02.f146005d) : null);
        intent.putExtra("key_activity_name", zj02 != null ? zj02.f146007f : null);
        intent.putExtra("key_activity_desc", zj02 != null ? zj02.f146008g : null);
        intent.putExtra("key_activity_end_time", zj02 != null ? Long.valueOf(zj02.f146018t) : null);
        intent.putExtra("key_activity_post_wording", zj02 != null ? zj02.f145998D : null);
        LinkedList<FinderJumpInfo> linkedList = zj02 != null ? zj02.f145997C : null;
        if (linkedList != null) {
            arrayList = new ArrayList();
            for (FinderJumpInfo finderJumpInfo : linkedList) {
                if (finderJumpInfo != null) {
                    arrayList.add(finderJumpInfo.toByteArray());
                }
            }
        }
        if (arrayList != null) {
            intent.putExtra("key_activity_jump_info_list", arrayList);
        }
        intent.putExtra("key_activity_src_type", "key_scene_from_profile");
        if (!(zj02 == null || (ek02 = zj02.f146023y) == null)) {
            intent.putExtra("key_wording_info", ek02.toByteArray());
        }
        if (!(zj02 == null || (ak02 = zj02.f146000F) == null)) {
            C64726td1 td12 = ak02.f130584d;
            if (td12 != null) {
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID", td12.f185534d);
                C0141c cVar = this.f12498s;
                if (!(cVar == null || (str4 = cVar.f569d) == null)) {
                    str5 = str4;
                }
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH", str5);
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO", td12.toByteArray());
                intent.putExtra("KEY_FINDER_POST_ORIGIN_BGM_URL", td12.f185544q);
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME", td12.f185536f);
            }
            String O5 = C66785b.f191882e.mo90662O5();
            boolean z = false;
            LinkedList<FinderContact> linkedList2 = ak02.f130585e;
            if (linkedList2 != null) {
                for (FinderContact finderContact4 : linkedList2) {
                    if (O5.equals(finderContact4.username)) {
                        z = true;
                    }
                }
            }
            intent.putExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", z);
        }
        C58679a1.f167972a.mo83554a(getContext(), intent, 134, 11);
    }

    /* renamed from: K3 */
    public final void mo2220K3(C52271zj0 zj02) {
        C77407n nVar;
        if (this.f12495p == null) {
            C77407n a = C0143d.f574a.mo134a(getContext());
            a.f225771i = new C2305b(this, zj02);
            a.f225782p = new C2306c(this);
            a.f225761d = new C2307d(this);
            this.f12495p = a;
        }
        C0145d1 d1Var = this.f12497r;
        boolean z = false;
        if (d1Var != null && !d1Var.mo136d3(new C2308e(this, zj02), new C2309f(this))) {
            z = true;
        }
        if (!z && (nVar = this.f12495p) != null && !nVar.mo107563h()) {
            nVar.mo107573q();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r0.f141633w;
     */
    /* renamed from: c2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo513c2() {
        /*
            r5 = this;
            T r0 = r5.f33564d
            te3.sn1 r0 = (te3.C51270sn1) r0
            er1.w3 r1 = er1.C58784w3.f168295a
            if (r0 == 0) goto L_0x000f
            te3.zj0 r2 = r0.f141633w
            if (r2 == 0) goto L_0x000f
            int r2 = r2.f146017s
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            if (r0 == 0) goto L_0x0019
            te3.zj0 r0 = r0.f141633w
            if (r0 == 0) goto L_0x0019
            long r3 = r0.f146018t
            goto L_0x001b
        L_0x0019:
            r3 = 0
        L_0x001b:
            boolean r0 = r1.mo83868F0(r2, r3)
            android.widget.TextView r1 = r5.f12489g
            if (r1 == 0) goto L_0x0035
            android.app.Activity r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099699(0x7f060033, float:1.7811759E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
        L_0x0035:
            if (r0 == 0) goto L_0x0058
            android.widget.LinearLayout r0 = r5.f12490h
            if (r0 == 0) goto L_0x0041
            r1 = 2131232300(0x7f08062c, float:1.8080705E38)
            r0.setBackgroundResource(r1)
        L_0x0041:
            android.widget.TextView r0 = r5.f12492j
            if (r0 == 0) goto L_0x0080
            android.app.Activity r1 = r5.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099697(0x7f060031, float:1.7811755E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            goto L_0x0080
        L_0x0058:
            android.widget.LinearLayout r0 = r5.f12490h
            if (r0 == 0) goto L_0x0062
            r1 = 2131232299(0x7f08062b, float:1.8080703E38)
            r0.setBackgroundResource(r1)
        L_0x0062:
            android.app.Activity r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131099940(0x7f060124, float:1.7812247E38)
            int r0 = r0.getColor(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r5.f12491i
            if (r1 != 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            r1.setIconColor(r0)
        L_0x0079:
            android.widget.TextView r1 = r5.f12492j
            if (r1 == 0) goto L_0x0080
            r1.setTextColor(r0)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.mo513c2():void");
    }

    /* renamed from: e3 */
    public void mo514e3() {
        super.mo514e3();
        this.f12499t.alive();
    }

    /* renamed from: f3 */
    public void mo314f3() {
        super.mo314f3();
        mo2218I3((C51270sn1) this.f33564d);
        this.f12493n = (FrameLayout) getContext().findViewById(C0966R.C0970id.a1o);
        this.f12494o = (FrameLayout) getContext().findViewById(C0966R.C0970id.f357449aa2);
    }

    /* renamed from: i3 */
    public void mo515i3(C47465a aVar) {
        C52271zj0 zj02;
        C48726ak0 ak02;
        C64726td1 td12;
        super.mo515i3((C51270sn1) aVar);
        mo2218I3((C51270sn1) this.f33564d);
        C51270sn1 sn12 = (C51270sn1) this.f33564d;
        this.f12496q = sn12 != null ? sn12.f141619f : 0;
        if (sn12 != null && (zj02 = sn12.f141633w) != null && (ak02 = zj02.f146000F) != null && (td12 = ak02.f130584d) != null) {
            C0141c cVar = new C0141c(getActivity());
            this.f12498s = cVar;
            C0478o oVar = new C0478o(this);
            Class cls = C13586n.class;
            C9434j d702 = ((C13586n) C86312j.m106911c(cls)).d70();
            d702.mo10147b((int) System.currentTimeMillis());
            d702.mo10148c(td12.f185539i);
            d702.mo10146a(C58741j5.f168184a.mo83729c(td12));
            String g0 = d702.mo10149g0();
            if (g0 == null) {
                g0 = "";
            }
            cVar.f569d = g0;
            cVar.f572g = oVar;
            ((C13586n) C86312j.m106911c(cls)).Bt0(cVar.getContext(), d702, new C0138b(cVar));
        }
    }

    /* renamed from: j3 */
    public void mo315j3() {
        C52271zj0 zj02;
        C52271zj0 zj03;
        C49295ek0 ek02;
        C11405h.C11406a.m11254b(this);
        C51270sn1 sn12 = (C51270sn1) this.f33564d;
        int i = 0;
        if (!(sn12 == null || (zj02 = sn12.f141633w) == null)) {
            C58784w3 w3Var = C58784w3.f168295a;
            long j = zj02.f146022x;
            w3Var.getClass();
            boolean z = (j & 8) != 8;
            LinearLayout linearLayout = this.f12490h;
            if (linearLayout != null) {
                linearLayout.setVisibility(z ? 0 : 8);
            }
            if (z) {
                if (w3Var.mo83868F0(zj02.f146017s, zj02.f146018t)) {
                    WeImageView weImageView = this.f12491i;
                    if (weImageView != null) {
                        weImageView.setVisibility(8);
                    }
                    TextView textView = this.f12492j;
                    if (textView != null) {
                        textView.setText(mo2221k3());
                    }
                } else {
                    WeImageView weImageView2 = this.f12491i;
                    if (weImageView2 != null) {
                        weImageView2.setVisibility(0);
                    }
                    TextView textView2 = this.f12492j;
                    if (textView2 != null) {
                        C51270sn1 sn13 = (C51270sn1) this.f33564d;
                        String str = (sn13 == null || (zj03 = sn13.f141633w) == null || (ek02 = zj03.f146023y) == null) ? null : ek02.f132972g;
                        if (str == null) {
                            str = getContext().getResources().getString(C0966R.string.f360460cz3);
                            C87412m.m108593f(str, "context.resources.getStr…ctivity_participate_text)");
                        }
                        textView2.setText(str);
                    }
                }
                TextView textView3 = this.f12492j;
                if (textView3 != null) {
                    C85875k4.m106189j0(textView3.getPaint(), 0.8f);
                }
            }
        }
        C51270sn1 sn14 = (C51270sn1) this.f33564d;
        if (sn14 != null) {
            i = sn14.f141619f;
        }
        mo2217G3(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = (r0 = r0.f141633w).f146023y;
     */
    /* renamed from: k3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo2221k3() {
        /*
            r2 = this;
            T r0 = r2.f33564d
            te3.sn1 r0 = (te3.C51270sn1) r0
            if (r0 == 0) goto L_0x0011
            te3.zj0 r0 = r0.f141633w
            if (r0 == 0) goto L_0x0011
            te3.ek0 r0 = r0.f146023y
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.f132976n
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 != 0) goto L_0x0028
            android.app.Activity r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131826075(0x7f11159b, float:1.9285024E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "context.resources.getStr…finder_activity_finished)"
            gy3.C87412m.m108593f(r0, r1)
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.mo2221k3():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = r1.f141633w;
     */
    /* renamed from: l3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2222l3() {
        /*
            r5 = this;
            T r0 = r5.f33564d
            r1 = r0
            te3.sn1 r1 = (te3.C51270sn1) r1
            if (r1 == 0) goto L_0x000e
            te3.zj0 r1 = r1.f141633w
            if (r1 == 0) goto L_0x000e
            te3.qr4 r1 = r1.f146001G
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            te3.sn1 r0 = (te3.C51270sn1) r0
            r2 = 0
            if (r0 == 0) goto L_0x001b
            te3.zj0 r0 = r0.f141633w
            if (r0 == 0) goto L_0x001b
            int r0 = r0.f145996B
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 <= 0) goto L_0x0053
            if (r1 == 0) goto L_0x0053
            java.lang.Class<da0.e> r0 = da0.C58247e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            da0.e r0 = (da0.C58247e) r0
            da0.b r0 = r0.yf0()
            te3.sf4 r1 = r1.f140509d
            if (r1 == 0) goto L_0x0033
            int r3 = r1.f141477f
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            if (r1 == 0) goto L_0x0039
            int r1 = r1.f141478g
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            T r4 = r5.f33564d
            te3.sn1 r4 = (te3.C51270sn1) r4
            if (r4 == 0) goto L_0x004b
            te3.zj0 r4 = r4.f141633w
            if (r4 == 0) goto L_0x004b
            te3.qr4 r4 = r4.f146001G
            if (r4 == 0) goto L_0x004b
            int r4 = r4.f140510e
            goto L_0x004c
        L_0x004b:
            r4 = -1
        L_0x004c:
            boolean r0 = r0.mo8430e(r3, r1, r4)
            if (r0 == 0) goto L_0x0053
            r2 = 1
        L_0x0053:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.mo2222l3():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.f141633w;
     */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2223m3() {
        /*
            r5 = this;
            T r0 = r5.f33564d
            te3.sn1 r0 = (te3.C51270sn1) r0
            r1 = 0
            if (r0 == 0) goto L_0x000e
            te3.zj0 r0 = r0.f141633w
            if (r0 == 0) goto L_0x000e
            te3.qr4 r0 = r0.f146001G
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            java.lang.String r2 = "FinderActivityParticipateUIC"
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "maasTemplatePost: videoTemplateProto is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            return
        L_0x0019:
            int r3 = r0.f140510e
            r4 = 1
            if (r3 == r4) goto L_0x0089
            r4 = 2
            if (r3 == r4) goto L_0x004a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "participate error for type:"
            r0.append(r3)
            T r3 = r5.f33564d
            te3.sn1 r3 = (te3.C51270sn1) r3
            if (r3 == 0) goto L_0x003f
            te3.zj0 r3 = r3.f141633w
            if (r3 == 0) goto L_0x003f
            te3.qr4 r3 = r3.f146001G
            if (r3 == 0) goto L_0x003f
            int r1 = r3.f140510e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x003f:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x009e
        L_0x004a:
            te3.ap1 r1 = new te3.ap1
            r1.<init>()
            java.lang.String r2 = r0.f140511f
            r1.f182115d = r2
            int r2 = r0.f140510e
            r1.f182116e = r2
            te3.yq4 r2 = new te3.yq4
            r2.<init>()
            te3.sf4 r0 = r0.f140509d
            r3 = 0
            if (r0 == 0) goto L_0x0064
            int r4 = r0.f141477f
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            r2.f145473f = r4
            if (r0 == 0) goto L_0x006b
            int r3 = r0.f141477f
        L_0x006b:
            r2.f145474g = r3
            r1.f182120i = r2
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r5.mo2219J3(r0)
            java.lang.Class<da0.e> r2 = da0.C58247e.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            da0.e r2 = (da0.C58247e) r2
            android.app.Activity r3 = r5.getContext()
            r4 = 11
            r2.qi0(r3, r1, r0, r4)
            goto L_0x009e
        L_0x0089:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 3
            java.lang.String r2 = "key_maas_entrance"
            r0.putExtra(r2, r1)
            r1 = 16
            java.lang.String r2 = "key_finder_post_router"
            r0.putExtra(r2, r1)
            r5.mo2225o3(r0)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.mo2223m3():void");
    }

    /* renamed from: n3 */
    public final void mo2224n3() {
        C51270sn1 sn12 = (C51270sn1) this.f33564d;
        qr4 qr4 = null;
        C52271zj0 zj02 = sn12 != null ? sn12.f141633w : null;
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        long j = zj02 != null ? zj02.f146005d : 0;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
        y0Var.Ay0(2, 1, j, f != null ? f.mo12861q3() : null);
        String str = C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond();
        if (C60999e.f173723a.mo85970a(zj02 != null ? Long.valueOf(zj02.f146005d) : null, 9)) {
            Activity context = getContext();
            ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
            C87412m.m108594g(context, "context");
        }
        C58408t0 t0Var = C58408t0.f167336a;
        int i = 0;
        t0Var.mo83266l(9, false);
        t0Var.mo83264j(str);
        if (zj02 != null) {
            qr4 = zj02.f146001G;
        }
        if (mo2222l3()) {
            if (qr4 != null) {
                i = qr4.f140512g;
            }
            if (i == 0) {
                Log.m105924i("FinderActivityParticipateUIC", "participate: template direct");
                mo2223m3();
                return;
            }
        }
        Log.m105924i("FinderActivityParticipateUIC", "participate: show bottom sheet");
        mo2220K3(zj02);
    }

    /* renamed from: o3 */
    public final void mo2225o3(Intent intent) {
        mo2219J3(intent);
        C9579a.C9580a aVar = C9579a.f29816a;
        Log.m105924i("Finder.ActivityParamStore", "save");
        if (C9579a.f29817b == null) {
            C9579a.f29817b = new Intent();
        }
        Intent intent2 = C9579a.f29817b;
        if (intent2 != null) {
            aVar.mo10259a(intent, intent2);
        }
        String stringExtra = getIntent().getStringExtra("key_udf_kv");
        if (stringExtra == null) {
            stringExtra = "";
        }
        JSONObject jSONObject = new JSONObject(stringExtra);
        String str = null;
        try {
            if (jSONObject.has("vst_id")) {
                str = jSONObject.getString("vst_id");
            }
        } catch (Exception e) {
            Log.printDebugStack("safeGetString", "", e);
        }
        intent.putExtra("vst_id", str);
        intent.putExtra("post_entry_type", 1);
        String stringExtra2 = getIntent().getStringExtra("CLIENT_KV_REPORTINFO");
        if (stringExtra2 != null) {
            intent.putExtra("CLIENT_KV_REPORTINFO", stringExtra2);
        }
        ((C58684b) C86312j.m106911c(C58684b.class)).mo83582c0(getContext(), intent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 20000) {
            mo2224n3();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f12499t.dead();
    }

    public void onResume() {
        super.onResume();
        C0317e.launchUI$default(this, (C66212f) null, (C53934p0) null, new C0477n(this, (C15601d<? super C0477n>) null), 3, (Object) null);
        C0145d1 d1Var = this.f12497r;
        if (d1Var != null) {
            d1Var.onResume();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r0.f141633w;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setNormalStyle() {
        /*
            r5 = this;
            T r0 = r5.f33564d
            te3.sn1 r0 = (te3.C51270sn1) r0
            er1.w3 r1 = er1.C58784w3.f168295a
            if (r0 == 0) goto L_0x000f
            te3.zj0 r2 = r0.f141633w
            if (r2 == 0) goto L_0x000f
            int r2 = r2.f146017s
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            if (r0 == 0) goto L_0x0019
            te3.zj0 r0 = r0.f141633w
            if (r0 == 0) goto L_0x0019
            long r3 = r0.f146018t
            goto L_0x001b
        L_0x0019:
            r3 = 0
        L_0x001b:
            boolean r0 = r1.mo83868F0(r2, r3)
            android.widget.TextView r1 = r5.f12489g
            if (r1 == 0) goto L_0x0035
            android.app.Activity r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
        L_0x0035:
            if (r0 == 0) goto L_0x0058
            android.widget.LinearLayout r0 = r5.f12490h
            if (r0 == 0) goto L_0x0041
            r1 = 2131232302(0x7f08062e, float:1.808071E38)
            r0.setBackgroundResource(r1)
        L_0x0041:
            android.widget.TextView r0 = r5.f12492j
            if (r0 == 0) goto L_0x0080
            android.app.Activity r1 = r5.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            goto L_0x0080
        L_0x0058:
            android.widget.LinearLayout r0 = r5.f12490h
            if (r0 == 0) goto L_0x0062
            r1 = 2131232988(0x7f0808dc, float:1.80821E38)
            r0.setBackgroundResource(r1)
        L_0x0062:
            android.app.Activity r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131099940(0x7f060124, float:1.7812247E38)
            int r0 = r0.getColor(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r5.f12491i
            if (r1 != 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            r1.setIconColor(r0)
        L_0x0079:
            android.widget.TextView r1 = r5.f12492j
            if (r1 == 0) goto L_0x0080
            r1.setTextColor(r0)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.setNormalStyle():void");
    }
}
