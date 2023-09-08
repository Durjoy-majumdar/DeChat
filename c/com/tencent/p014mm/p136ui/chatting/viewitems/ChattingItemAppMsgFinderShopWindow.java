package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.content.Intent;
import android.text.TextPaint;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bl3.C39818r;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C75604z3;
import er1.C58712e3;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60176j;
import ht1.C60200t1;
import j20.C117292a;
import k20.C9556a;
import k60.C60979d;
import kotlin.Metadata;
import nj3.C76874e0;
import o40.C61937h;
import org.json.JSONObject;
import p1081gi.C98121d;
import p151er.C58677l;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62368t0;
import rx3.C13598b0;
import te3.C64831xk1;
import uj3.C78208e;
import up1.C27696y;
import zj3.C66869c;
import zj3.C79368l;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderShopWindow */
public final class ChattingItemAppMsgFinderShopWindow {

    /* renamed from: a */
    public static final C57733c f165237a = new C57733c((C8480h) null);

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderShopWindow$AppMsgFinderShopWindowHolder;", "Lcom/tencent/mm/ui/chatting/viewitems/i$c;", "Landroid/view/View;", "view", "", "isSend", "build", "getMainContainerView", "detailLayout", "Landroid/view/View;", "getDetailLayout", "()Landroid/view/View;", "setDetailLayout", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "avatar", "Landroid/widget/ImageView;", "getAvatar", "()Landroid/widget/ImageView;", "setAvatar", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "titleTv", "Landroid/widget/TextView;", "getTitleTv", "()Landroid/widget/TextView;", "setTitleTv", "(Landroid/widget/TextView;)V", "subTitle", "getSubTitle", "setSubTitle", "tickIV", "getTickIV", "setTickIV", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderShopWindow$AppMsgFinderShopWindowHolder */
    public static final class AppMsgFinderShopWindowHolder extends C74023i.C74026c {
        public static final int $stable = 8;
        private ImageView avatar;
        private View detailLayout;
        private TextView subTitle;
        private ImageView tickIV;
        private TextView titleTv;

        public final AppMsgFinderShopWindowHolder build(View view, boolean z) {
            C87412m.m108594g(view, "view");
            super.create(view);
            this.detailLayout = view.findViewById(C0966R.C0970id.b3p);
            View findViewById = view.findViewById(C0966R.C0970id.b9_);
            TextView textView = findViewById instanceof TextView ? (TextView) findViewById : null;
            if (textView != null) {
                this.userTV = textView;
            }
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.maskView = view.findViewById(C0966R.C0970id.b7h);
            ProgressBar progressBar = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
            this.uploadingPB = progressBar;
            if (z) {
                this.tickIV = (ImageView) view.findViewById(C0966R.C0970id.b8x);
            } else if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            this.avatar = (ImageView) view.findViewById(C0966R.C0970id.mx_);
            this.titleTv = (TextView) view.findViewById(C0966R.C0970id.mxe);
            this.subTitle = (TextView) view.findViewById(C0966R.C0970id.mxc);
            return this;
        }

        public final ImageView getAvatar() {
            return this.avatar;
        }

        public final View getDetailLayout() {
            return this.detailLayout;
        }

        public View getMainContainerView() {
            return this.detailLayout;
        }

        public final TextView getSubTitle() {
            return this.subTitle;
        }

        public final ImageView getTickIV() {
            return this.tickIV;
        }

        public final TextView getTitleTv() {
            return this.titleTv;
        }

        public final void setAvatar(ImageView imageView) {
            this.avatar = imageView;
        }

        public final void setDetailLayout(View view) {
            this.detailLayout = view;
        }

        public final void setSubTitle(TextView textView) {
            this.subTitle = textView;
        }

        public final void setTickIV(ImageView imageView) {
            this.tickIV = imageView;
        }

        public final void setTitleTv(TextView textView) {
            this.titleTv = textView;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderShopWindow$a */
    public static final class C57731a extends C74023i implements C73774p2 {

        /* renamed from: v */
        public final C57734d f165238v = new C57734d(true);

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            return this.f165238v.mo82199b(layoutInflater, view);
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return !this.f165238v.f165240a;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            return this.f165238v.mo82200c(menuItem, bVar, f4Var);
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            return this.f165238v.mo82201d(this, e0Var, view, contextMenuInfo, f4Var);
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            this.f165238v.mo82202e(view, bVar, f4Var);
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            this.f165238v.getClass();
            ChattingItemAppMsgFinderShopWindow.f165237a.mo82197a(view, bVar, f4Var);
            return true;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            this.f165238v.mo82198a(this, cVar instanceof AppMsgFinderShopWindowHolder ? (AppMsgFinderShopWindowHolder) cVar : null, cVar, bVar, f4Var, str);
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0014 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: k0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo26238k0(int r4, boolean r5) {
            /*
                r3 = this;
                com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderShopWindow$d r0 = r3.f165238v
                boolean r0 = r0.f165240a
                r1 = 1
                r2 = 976224305(0x3a300031, float:6.713896E-4)
                if (r0 == 0) goto L_0x000f
                if (r5 != 0) goto L_0x0014
                if (r4 != r2) goto L_0x0014
                goto L_0x0015
            L_0x000f:
                if (r5 == 0) goto L_0x0014
                if (r4 != r2) goto L_0x0014
                goto L_0x0015
            L_0x0014:
                r1 = 0
            L_0x0015:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemAppMsgFinderShopWindow.C57731a.mo26238k0(int, boolean):boolean");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderShopWindow$b */
    public static final class C57732b extends C74023i implements C73774p2 {

        /* renamed from: v */
        public final C57734d f165239v = new C57734d(false);

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            return this.f165239v.mo82199b(layoutInflater, view);
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return !this.f165239v.f165240a;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            return this.f165239v.mo82200c(menuItem, bVar, f4Var);
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            return this.f165239v.mo82201d(this, e0Var, view, contextMenuInfo, f4Var);
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            this.f165239v.mo82202e(view, bVar, f4Var);
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            this.f165239v.getClass();
            ChattingItemAppMsgFinderShopWindow.f165237a.mo82197a(view, bVar, f4Var);
            return true;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            this.f165239v.mo82198a(this, cVar instanceof AppMsgFinderShopWindowHolder ? (AppMsgFinderShopWindowHolder) cVar : null, cVar, bVar, f4Var, str);
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0014 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: k0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo26238k0(int r4, boolean r5) {
            /*
                r3 = this;
                com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderShopWindow$d r0 = r3.f165239v
                boolean r0 = r0.f165240a
                r1 = 1
                r2 = 976224305(0x3a300031, float:6.713896E-4)
                if (r0 == 0) goto L_0x000f
                if (r5 != 0) goto L_0x0014
                if (r4 != r2) goto L_0x0014
                goto L_0x0015
            L_0x000f:
                if (r5 == 0) goto L_0x0014
                if (r4 != r2) goto L_0x0014
                goto L_0x0015
            L_0x0014:
                r1 = 0
            L_0x0015:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemAppMsgFinderShopWindow.C57732b.mo26238k0(int, boolean):boolean");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderShopWindow$c */
    public static final class C57733c {
        public C57733c(C8480h hVar) {
        }

        /* JADX WARNING: type inference failed for: r4v1, types: [android.app.Activity] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo82197a(android.view.View r12, ck3.C67391b r13, com.tencent.p014mm.storage.C72963f4 r14) {
            /*
                r11 = this;
                java.lang.String r0 = "msg"
                gy3.C87412m.m108594g(r14, r0)
                java.lang.String r0 = r14.getContent()
                r1 = 0
                if (r0 == 0) goto L_0x0015
                java.lang.String r2 = r14.mo108775z2()
                com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r2)
                goto L_0x0016
            L_0x0015:
                r0 = r1
            L_0x0016:
                r2 = 1
                if (r0 == 0) goto L_0x00ed
                if (r13 == 0) goto L_0x00ed
                java.lang.Class<ht1.j> r3 = ht1.C60176j.class
                com.tencent.mm.message.g r0 = r0.mo93555w(r3)
                ht1.j r0 = (ht1.C60176j) r0
                te3.xk1 r0 = r0.f171713b
                r3 = 1177(0x499, float:1.65E-42)
                java.lang.String r4 = r13.mo91577r()
                boolean r5 = com.tencent.p014mm.storage.C72996z1.m85820U5(r4)
                if (r5 == 0) goto L_0x0033
                r5 = 3
                goto L_0x0044
            L_0x0033:
                boolean r5 = com.tencent.p014mm.storage.C72996z1.m85847r5(r4)
                if (r5 == 0) goto L_0x003b
                r5 = 4
                goto L_0x0044
            L_0x003b:
                boolean r5 = com.tencent.p014mm.storage.C72996z1.m85843n5(r4)
                if (r5 == 0) goto L_0x0043
                r5 = 2
                goto L_0x0044
            L_0x0043:
                r5 = 1
            L_0x0044:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = r0.f186326d
                java.lang.String r8 = ""
                if (r7 != 0) goto L_0x0050
                r7 = r8
            L_0x0050:
                r6.append(r7)
                r7 = 58
                r6.append(r7)
                r6.append(r5)
                r6.append(r7)
                r6.append(r4)
                r6.append(r7)
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                android.app.Activity r4 = r13.mo91565f()
                java.lang.String r5 = r0.f186326d
                if (r5 != 0) goto L_0x0074
                goto L_0x0075
            L_0x0074:
                r8 = r5
            L_0x0075:
                int r5 = r8.length()
                if (r5 != 0) goto L_0x007d
                r5 = 1
                goto L_0x007e
            L_0x007d:
                r5 = 0
            L_0x007e:
                if (r5 == 0) goto L_0x0081
                goto L_0x00b9
            L_0x0081:
                te3.ca1 r5 = new te3.ca1
                r5.<init>()
                r5.f182458g = r8
                r6 = 7263(0x1c5f, float:1.0178E-41)
                java.lang.Class<ir.r> r7 = p565ir.C60613r.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                ir.r r7 = (p565ir.C60613r) r7
                te3.cq0 r9 = new te3.cq0
                r9.<init>()
                r9.f131900d = r8
                rx3.b0 r10 = rx3.C13598b0.f38549a
                java.lang.String r10 = "/cgi-bin/mmbiz-bin/findergetwindowproductprofilecardinfo"
                ob0.b r5 = r7.mo84982tT(r10, r6, r9, r5)
                nr3.e r5 = r5.mo9225i()
                com.tencent.mm.ui.chatting.viewitems.a2 r6 = new com.tencent.mm.ui.chatting.viewitems.a2
                r6.<init>(r8, r14)
                r5.mo123420E(r6)
                boolean r6 = r4 instanceof jp3.C9487b
                if (r6 == 0) goto L_0x00b4
                r1 = r4
                jp3.b r1 = (jp3.C9487b) r1
            L_0x00b4:
                if (r1 == 0) goto L_0x00b9
                r5.mo11397F(r1)
            L_0x00b9:
                java.lang.Class<er.l> r1 = p151er.C58677l.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                er.l r1 = (p151er.C58677l) r1
                android.app.Activity r4 = r13.mo91565f()
                java.lang.String r5 = "ui.context"
                gy3.C87412m.m108593f(r4, r5)
                r1.mo75412a5(r4, r0, r3)
                er1.e3 r1 = er1.C58712e3.f168068a
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                java.lang.String r0 = r0.f186326d
                java.lang.String r4 = "finderusername"
                r3.put(r4, r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                java.lang.String r0 = r3.toString()
                java.lang.String r3 = "JSONObject().apply {\n   …             }.toString()"
                gy3.C87412m.m108593f(r0, r3)
                java.lang.String r3 = "click_shopwindow_shard_card"
                r1.mo83622a(r3, r0)
                goto L_0x00f4
            L_0x00ed:
                java.lang.String r0 = "MicroMsg.ChattingItemAppMsgFinderShopWindow"
                java.lang.String r1 = "onItemClick content is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            L_0x00f4:
                if (r13 != 0) goto L_0x00f7
                goto L_0x0109
            L_0x00f7:
                if (r12 != 0) goto L_0x00fa
                goto L_0x0109
            L_0x00fa:
                java.lang.Class<zj3.c> r0 = zj3.C66869c.class
                com.tencent.mm.ui.chatting.manager.a r1 = r13.f193278b
                xi.d r0 = r1.mo102812a(r0)
                zj3.c r0 = (zj3.C66869c) r0
                if (r0 == 0) goto L_0x0109
                r0.mo26187U2(r13, r12, r14)
            L_0x0109:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemAppMsgFinderShopWindow.C57733c.mo82197a(android.view.View, ck3.b, com.tencent.mm.storage.f4):boolean");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderShopWindow$d */
    public static final class C57734d {

        /* renamed from: a */
        public final boolean f165240a;

        /* renamed from: b */
        public C67391b f165241b;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderShopWindow$d$a */
        public static final class C57735a extends C23555k.C23562d {

            /* renamed from: a */
            public final /* synthetic */ C64831xk1 f165242a;

            /* renamed from: b */
            public final /* synthetic */ C72963f4 f165243b;

            public C57735a(C64831xk1 xk12, C72963f4 f4Var) {
                this.f165242a = xk12;
                this.f165243b = f4Var;
            }

            /* renamed from: a */
            public long mo52a(View view) {
                C87412m.m108594g(view, "view");
                return this.f165243b.getMsgId() + ((long) view.hashCode());
            }

            /* renamed from: b */
            public void mo53b(View view, long j, long j2, boolean z) {
                C87412m.m108594g(view, "view");
                if (z) {
                    C58712e3 e3Var = C58712e3.f168068a;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("finderusername", this.f165242a.f186326d);
                    C13598b0 b0Var = C13598b0.f38549a;
                    String jSONObject2 = jSONObject.toString();
                    C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
                    e3Var.mo83622a("expose_shopwindow_shard_card", jSONObject2);
                }
            }
        }

        public C57734d(boolean z) {
            this.f165240a = z;
        }

        /* renamed from: a */
        public final void mo82198a(C74023i iVar, AppMsgFinderShopWindowHolder appMsgFinderShopWindowHolder, C78208e eVar, C67391b bVar, C72963f4 f4Var, String str) {
            C74023i iVar2 = iVar;
            AppMsgFinderShopWindowHolder appMsgFinderShopWindowHolder2 = appMsgFinderShopWindowHolder;
            C67391b bVar2 = bVar;
            C72963f4 f4Var2 = f4Var;
            Class cls = C79368l.class;
            Class cls2 = C11990s0.class;
            Class<C60200t1> cls3 = C60200t1.class;
            Class cls4 = C60176j.class;
            C87412m.m108594g(iVar2, "chattingItem");
            C87412m.m108594g(bVar2, "ui");
            C87412m.m108594g(f4Var2, "msg");
            this.f165241b = bVar2;
            if (appMsgFinderShopWindowHolder2 == null) {
                Log.m105924i("MicroMsg.ChattingItemAppMsgFinderShopWindow", "filling not AppMsgFinderShopWindowHolder");
                return;
            }
            View view = appMsgFinderShopWindowHolder2.convertView;
            if (view != null) {
                C66869c cVar = (C66869c) bVar2.f193278b.mo102812a(C66869c.class);
                if (cVar != null) {
                    cVar.mo26188V0(bVar2, view, f4Var2);
                }
            }
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            boolean z = false;
            if ((u != null ? (C60176j) u.mo93555w(cls4) : null) != null) {
                C64831xk1 xk12 = ((C60176j) u.mo93555w(cls4)).f171713b;
                Log.m105924i("MicroMsg.ChattingItemAppMsgFinderShopWindow", "filling position:" + eVar + ", shareObject:" + C61937h.m72709h(xk12));
                ImageView avatar = appMsgFinderShopWindowHolder.getAvatar();
                if (avatar != null) {
                    C60979d<C100810g0> i2 = ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11872i2();
                    C62368t0 t0Var = (C62368t0) C86312j.m106911c(C62368t0.class);
                    String str2 = xk12.f186327e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    i2.mo85957c(t0Var.mo87412UE(str2, C27696y.THUMB_IMAGE), avatar, ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR_WITHOUT_DEFAULT));
                }
                TextView titleTv = appMsgFinderShopWindowHolder.getTitleTv();
                if (titleTv != null) {
                    Activity f = bVar.mo91565f();
                    C87412m.m108593f(f, "ui.context");
                    TextPaint paint = titleTv.getPaint();
                    C87412m.m108593f(paint, "it.paint");
                    String string = bVar.mo91565f().getResources().getString(C0966R.string.mh9, new Object[]{Util.nullAsNil(xk12.f186328f)});
                    C87412m.m108593f(string, "ui.context.resources.get…il(shareObject.nickname))");
                    titleTv.setText(((C58677l) C86312j.m106911c(C58677l.class)).mo75413p2(f, paint, string, 10));
                }
                TextView subTitle = appMsgFinderShopWindowHolder.getSubTitle();
                if (subTitle != null) {
                    subTitle.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(bVar.mo91565f(), bVar.mo91565f().getResources().getString(C0966R.string.mh_, new Object[]{Util.nullAsNil(xk12.f186329g)})));
                }
                appMsgFinderShopWindowHolder2.clickArea.setOnClickListener(iVar2.mo103099u(bVar2));
                appMsgFinderShopWindowHolder2.clickArea.setOnLongClickListener(iVar2.mo103098p(bVar2));
                View view2 = appMsgFinderShopWindowHolder2.clickArea;
                C79368l lVar = (C79368l) bVar2.f193278b.mo102812a(cls);
                view2.setOnTouchListener(lVar != null ? lVar.mo108189Z4() : null);
                appMsgFinderShopWindowHolder2.clickArea.setTag(new C74243t8(f4Var2, bVar.mo91583x(), appMsgFinderShopWindowHolder2, (String) null));
                View view3 = appMsgFinderShopWindowHolder2.convertView;
                C87412m.m108593f(view3, "holder.convertView");
                C23564m.m28138h(view3, new C57735a(xk12, f4Var2));
            }
            if (this.f165240a || !C74023i.m87878T()) {
                if (appMsgFinderShopWindowHolder.getTickIV() != null) {
                    ImageView tickIV = appMsgFinderShopWindowHolder.getTickIV();
                    C87412m.m108591d(tickIV);
                    tickIV.setVisibility(8);
                }
                if (f4Var.getStatus() < 2) {
                    z = true;
                }
                iVar2.mo103093i0(appMsgFinderShopWindowHolder2, z, true);
                return;
            }
            ProgressBar progressBar = appMsgFinderShopWindowHolder2.uploadingPB;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            if (f4Var.getStatus() != 2 || !iVar2.mo103080N((C79368l) bVar2.f193278b.mo102812a(cls), f4Var.getMsgId())) {
                if (appMsgFinderShopWindowHolder.getTickIV() != null) {
                    ImageView tickIV2 = appMsgFinderShopWindowHolder.getTickIV();
                    C87412m.m108591d(tickIV2);
                    tickIV2.setVisibility(8);
                }
            } else if (appMsgFinderShopWindowHolder.getTickIV() != null) {
                ImageView tickIV3 = appMsgFinderShopWindowHolder.getTickIV();
                C87412m.m108591d(tickIV3);
                tickIV3.setVisibility(0);
            }
        }

        /* renamed from: b */
        public final View mo82199b(LayoutInflater layoutInflater, View view) {
            if (view == null || view.getTag() == null) {
                view = this.f165240a ? new C6807n4(layoutInflater, C0966R.C0971layout.cui) : new C6807n4(layoutInflater, C0966R.C0971layout.cuj);
                view.setTag(new AppMsgFinderShopWindowHolder().build(view, !this.f165240a));
            }
            return view;
        }

        /* renamed from: c */
        public final boolean mo82200c(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C68070l.C68072b u;
            C87412m.m108594g(f4Var, "msg");
            if (menuItem == null || bVar == null || menuItem.getItemId() != 111) {
                return false;
            }
            Activity f = bVar.mo91565f();
            C87412m.m108593f(f, "ui.context");
            if (!Util.isNullOrNil(f4Var.getContent()) && (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) != null) {
                Intent intent = new Intent(f, MsgRetransmitUI.class);
                intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
                intent.putExtra("Retr_Msg_Type", 33);
                intent.putExtra("Multi_Retr", true);
                intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
                intent.putExtra("Retr_go_to_chattingUI", false);
                intent.putExtra("Retr_show_success_tips", true);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Activity activity = f;
                C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderShopWindow$FinderShopWindowDelegate", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                f.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderShopWindow$FinderShopWindowDelegate", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            return true;
        }

        /* renamed from: d */
        public final boolean mo82201d(C74023i iVar, C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C87412m.m108594g(iVar, "chattingItem");
            if (e0Var == null || view == null) {
                return false;
            }
            C67391b bVar = this.f165241b;
            if (bVar != null) {
                if (this.f165240a) {
                    Object tag = view.getTag();
                    C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
                    int b = ((C74243t8) tag).mo103252b();
                    if (f4Var != null) {
                        e0Var.mo107136c(b, 111, 0, bVar.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                        e0Var.removeItem(116);
                    }
                } else {
                    Object tag2 = view.getTag();
                    C87412m.m108592e(tag2, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
                    int b2 = ((C74243t8) tag2).mo103252b();
                    if (f4Var != null) {
                        e0Var.mo107136c(b2, 111, 0, bVar.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                        e0Var.removeItem(116);
                        if ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && iVar.mo103083Q(f4Var, bVar) && iVar.mo103081O(f4Var.mo108768t()) && !bVar.mo91580u()) {
                            e0Var.mo107136c(b2, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
                        }
                    }
                }
            }
            return true;
        }

        /* renamed from: e */
        public final void mo82202e(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            if (!this.f165240a && f4Var.mo101020w3()) {
                C72695v.m85081w(f4Var);
                C75604z3.m90834f(f4Var.getMsgId());
                bVar.mo91541B(true);
            }
        }
    }
}
