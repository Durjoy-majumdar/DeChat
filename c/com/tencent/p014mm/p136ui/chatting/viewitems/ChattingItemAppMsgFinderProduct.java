package com.tencent.p014mm.p136ui.chatting.viewitems;

import a14.C0000n0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import bl3.C39818r;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.p136ui.widget.MMTextView;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C7335d;
import di3.C86312j;
import eb0.C75604z3;
import er1.C7919x;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60175i;
import ht1.C60200t1;
import ht1.C76243a5;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C9556a;
import k60.C60979d;
import k60.C99099a;
import k60.C99101e;
import kg3.C76577a;
import kotlin.Metadata;
import n60.C100075f;
import nj3.C76874e0;
import o40.C61926c;
import o40.C61937h;
import p1081gi.C98121d;
import p565ir.C60606n;
import p565ir.C60613r;
import p629ny.C76979h;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62368t0;
import rx3.C13598b0;
import te3.C50858pp0;
import te3.C64287ci1;
import te3.C64370fp1;
import te3.C64688rq1;
import te3.z44;
import uj3.C78208e;
import up1.C27696y;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import zj3.C66869c;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderProduct */
public final class ChattingItemAppMsgFinderProduct {

    /* renamed from: a */
    public static final C57727c f165221a = new C57727c((C8480h) null);

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bL\u0010MJ\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R$\u0010 \u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010\n\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR$\u0010#\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR$\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010,\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R$\u0010/\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u0010'\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R$\u00102\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u0010\n\u001a\u0004\b3\u0010\f\"\u0004\b4\u0010\u000eR$\u00105\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0011\u001a\u0004\b6\u0010\u0013\"\u0004\b7\u0010\u0015R$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010?\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b?\u0010\u0011\u001a\u0004\b@\u0010\u0013\"\u0004\bA\u0010\u0015R$\u0010C\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010I\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bI\u0010\u0011\u001a\u0004\bJ\u0010\u0013\"\u0004\bK\u0010\u0015¨\u0006N"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderProduct$AppMsgFinderProductHolder;", "Lcom/tencent/mm/ui/chatting/viewitems/i$c;", "Landroid/view/View;", "view", "", "isSend", "build", "getMainContainerView", "Landroid/widget/ImageView;", "avatar", "Landroid/widget/ImageView;", "getAvatar", "()Landroid/widget/ImageView;", "setAvatar", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "nicknameTv", "Landroid/widget/TextView;", "getNicknameTv", "()Landroid/widget/TextView;", "setNicknameTv", "(Landroid/widget/TextView;)V", "Lcom/tencent/mm/ui/widget/MMTextView;", "titleTv", "Lcom/tencent/mm/ui/widget/MMTextView;", "getTitleTv", "()Lcom/tencent/mm/ui/widget/MMTextView;", "setTitleTv", "(Lcom/tencent/mm/ui/widget/MMTextView;)V", "descTv", "getDescTv", "setDescTv", "coverIv", "getCoverIv", "setCoverIv", "tickIV", "getTickIV", "setTickIV", "detailLayout", "Landroid/view/View;", "getDetailLayout", "()Landroid/view/View;", "setDetailLayout", "(Landroid/view/View;)V", "itemMaskView", "getItemMaskView", "setItemMaskView", "storeLayout", "getStoreLayout", "setStoreLayout", "platformLogo", "getPlatformLogo", "setPlatformLogo", "recommendTv", "getRecommendTv", "setRecommendTv", "Landroid/widget/LinearLayout;", "guaranteeLayout", "Landroid/widget/LinearLayout;", "getGuaranteeLayout", "()Landroid/widget/LinearLayout;", "setGuaranteeLayout", "(Landroid/widget/LinearLayout;)V", "marketPriceTv", "getMarketPriceTv", "setMarketPriceTv", "Landroid/view/ViewGroup;", "priceLayout", "Landroid/view/ViewGroup;", "getPriceLayout", "()Landroid/view/ViewGroup;", "setPriceLayout", "(Landroid/view/ViewGroup;)V", "priceBegin", "getPriceBegin", "setPriceBegin", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderProduct$AppMsgFinderProductHolder */
    public static final class AppMsgFinderProductHolder extends C74023i.C74026c {
        public static final int $stable = 8;
        private ImageView avatar;
        private ImageView coverIv;
        private TextView descTv;
        private View detailLayout;
        private LinearLayout guaranteeLayout;
        private View itemMaskView;
        private TextView marketPriceTv;
        private TextView nicknameTv;
        private ImageView platformLogo;
        private TextView priceBegin;
        private ViewGroup priceLayout;
        private TextView recommendTv;
        private View storeLayout;
        private ImageView tickIV;
        private MMTextView titleTv;

        public final AppMsgFinderProductHolder build(View view, boolean z) {
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
            this.avatar = (ImageView) view.findViewById(C0966R.C0970id.f6097x8);
            this.nicknameTv = (TextView) view.findViewById(C0966R.C0970id.f6098x9);
            this.titleTv = (MMTextView) view.findViewById(C0966R.C0970id.f6102xc);
            this.descTv = (TextView) view.findViewById(C0966R.C0970id.f6086ww);
            this.coverIv = (ImageView) view.findViewById(C0966R.C0970id.f6085wv);
            this.storeLayout = view.findViewById(C0966R.C0970id.k2n);
            this.platformLogo = (ImageView) view.findViewById(C0966R.C0970id.o55);
            this.recommendTv = (TextView) view.findViewById(C0966R.C0970id.o54);
            this.guaranteeLayout = (LinearLayout) view.findViewById(C0966R.C0970id.f357464o53);
            this.marketPriceTv = (TextView) view.findViewById(C0966R.C0970id.f358720oh2);
            this.priceLayout = (ViewGroup) view.findViewById(C0966R.C0970id.i2g);
            this.priceBegin = (TextView) view.findViewById(C0966R.C0970id.ohl);
            return this;
        }

        public final ImageView getAvatar() {
            return this.avatar;
        }

        public final ImageView getCoverIv() {
            return this.coverIv;
        }

        public final TextView getDescTv() {
            return this.descTv;
        }

        public final View getDetailLayout() {
            return this.detailLayout;
        }

        public final LinearLayout getGuaranteeLayout() {
            return this.guaranteeLayout;
        }

        public final View getItemMaskView() {
            return this.itemMaskView;
        }

        public View getMainContainerView() {
            return this.detailLayout;
        }

        public final TextView getMarketPriceTv() {
            return this.marketPriceTv;
        }

        public final TextView getNicknameTv() {
            return this.nicknameTv;
        }

        public final ImageView getPlatformLogo() {
            return this.platformLogo;
        }

        public final TextView getPriceBegin() {
            return this.priceBegin;
        }

        public final ViewGroup getPriceLayout() {
            return this.priceLayout;
        }

        public final TextView getRecommendTv() {
            return this.recommendTv;
        }

        public final View getStoreLayout() {
            return this.storeLayout;
        }

        public final ImageView getTickIV() {
            return this.tickIV;
        }

        public final MMTextView getTitleTv() {
            return this.titleTv;
        }

        public final void setAvatar(ImageView imageView) {
            this.avatar = imageView;
        }

        public final void setCoverIv(ImageView imageView) {
            this.coverIv = imageView;
        }

        public final void setDescTv(TextView textView) {
            this.descTv = textView;
        }

        public final void setDetailLayout(View view) {
            this.detailLayout = view;
        }

        public final void setGuaranteeLayout(LinearLayout linearLayout) {
            this.guaranteeLayout = linearLayout;
        }

        public final void setItemMaskView(View view) {
            this.itemMaskView = view;
        }

        public final void setMarketPriceTv(TextView textView) {
            this.marketPriceTv = textView;
        }

        public final void setNicknameTv(TextView textView) {
            this.nicknameTv = textView;
        }

        public final void setPlatformLogo(ImageView imageView) {
            this.platformLogo = imageView;
        }

        public final void setPriceBegin(TextView textView) {
            this.priceBegin = textView;
        }

        public final void setPriceLayout(ViewGroup viewGroup) {
            this.priceLayout = viewGroup;
        }

        public final void setRecommendTv(TextView textView) {
            this.recommendTv = textView;
        }

        public final void setStoreLayout(View view) {
            this.storeLayout = view;
        }

        public final void setTickIV(ImageView imageView) {
            this.tickIV = imageView;
        }

        public final void setTitleTv(MMTextView mMTextView) {
            this.titleTv = mMTextView;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderProduct$a */
    public static final class C57725a extends C74023i implements C73774p2 {

        /* renamed from: v */
        public final C57729d f165222v = new C57729d(true);

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            return this.f165222v.mo82182b(layoutInflater, view);
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return !this.f165222v.f165233a;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            return this.f165222v.mo82183c(menuItem, bVar, f4Var);
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            return this.f165222v.mo82184d(this, e0Var, view, contextMenuInfo, f4Var);
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            this.f165222v.mo82185e(view, bVar, f4Var);
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            this.f165222v.getClass();
            ChattingItemAppMsgFinderProduct.f165221a.mo82180a(view, bVar, f4Var);
            return true;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            this.f165222v.mo82181a(this, cVar instanceof AppMsgFinderProductHolder ? (AppMsgFinderProductHolder) cVar : null, cVar, bVar, f4Var, str);
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0014 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: k0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo26238k0(int r4, boolean r5) {
            /*
                r3 = this;
                com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderProduct$d r0 = r3.f165222v
                boolean r0 = r0.f165233a
                r1 = 1
                r2 = 974127153(0x3a100031, float:5.4931926E-4)
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
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemAppMsgFinderProduct.C57725a.mo26238k0(int, boolean):boolean");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderProduct$b */
    public static final class C57726b extends C74023i implements C73774p2 {

        /* renamed from: v */
        public final C57729d f165223v = new C57729d(false);

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            return this.f165223v.mo82182b(layoutInflater, view);
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return !this.f165223v.f165233a;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            return this.f165223v.mo82183c(menuItem, bVar, f4Var);
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            return this.f165223v.mo82184d(this, e0Var, view, contextMenuInfo, f4Var);
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            this.f165223v.mo82185e(view, bVar, f4Var);
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            this.f165223v.getClass();
            ChattingItemAppMsgFinderProduct.f165221a.mo82180a(view, bVar, f4Var);
            return true;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            this.f165223v.mo82181a(this, cVar instanceof AppMsgFinderProductHolder ? (AppMsgFinderProductHolder) cVar : null, cVar, bVar, f4Var, str);
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0014 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: k0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo26238k0(int r4, boolean r5) {
            /*
                r3 = this;
                com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderProduct$d r0 = r3.f165223v
                boolean r0 = r0.f165233a
                r1 = 1
                r2 = 974127153(0x3a100031, float:5.4931926E-4)
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
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemAppMsgFinderProduct.C57726b.mo26238k0(int, boolean):boolean");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderProduct$c */
    public static final class C57727c {

        @C91590f(mo125468c = "com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderProduct$Companion$onItemClick$1", mo125469f = "ChattingItemAppMsgFinderProduct.kt", mo125470l = {116, 144}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderProduct$c$a */
        public static final class C57728a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f165224d;

            /* renamed from: e */
            public Object f165225e;

            /* renamed from: f */
            public int f165226f;

            /* renamed from: g */
            public int f165227g;

            /* renamed from: h */
            public int f165228h;

            /* renamed from: i */
            public final /* synthetic */ C67391b f165229i;

            /* renamed from: j */
            public final /* synthetic */ C64287ci1 f165230j;

            /* renamed from: n */
            public final /* synthetic */ C8479f0<String> f165231n;

            /* renamed from: o */
            public final /* synthetic */ int f165232o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57728a(C67391b bVar, C64287ci1 ci12, C8479f0<String> f0Var, int i, C15601d<? super C57728a> dVar) {
                super(2, dVar);
                this.f165229i = bVar;
                this.f165230j = ci12;
                this.f165231n = f0Var;
                this.f165232o = i;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C57728a(this.f165229i, this.f165230j, this.f165231n, this.f165232o, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C57728a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:91:0x022f, code lost:
                if ((r11 == null || r11.length() == 0) != false) goto L_0x0317;
             */
            /* JADX WARNING: Removed duplicated region for block: B:109:0x02f2  */
            /* JADX WARNING: Removed duplicated region for block: B:112:0x02f8  */
            /* JADX WARNING: Removed duplicated region for block: B:115:0x0307  */
            /* JADX WARNING: Removed duplicated region for block: B:58:0x016a  */
            /* JADX WARNING: Removed duplicated region for block: B:59:0x016d  */
            /* JADX WARNING: Removed duplicated region for block: B:62:0x017f A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:63:0x0180  */
            /* JADX WARNING: Removed duplicated region for block: B:66:0x0197  */
            /* JADX WARNING: Removed duplicated region for block: B:67:0x0199  */
            /* JADX WARNING: Removed duplicated region for block: B:69:0x019c  */
            /* JADX WARNING: Removed duplicated region for block: B:70:0x019e  */
            /* JADX WARNING: Removed duplicated region for block: B:75:0x01dc  */
            /* JADX WARNING: Removed duplicated region for block: B:76:0x01df  */
            /* JADX WARNING: Removed duplicated region for block: B:79:0x0210  */
            /* JADX WARNING: Removed duplicated region for block: B:82:0x021a  */
            /* JADX WARNING: Removed duplicated region for block: B:83:0x021c  */
            /* JADX WARNING: Removed duplicated region for block: B:85:0x021f  */
            /* JADX WARNING: Removed duplicated region for block: B:98:0x0270  */
            /* JADX WARNING: Removed duplicated region for block: B:99:0x0273  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r57) {
                /*
                    r56 = this;
                    r0 = r56
                    java.lang.Class<ir.q> r1 = p565ir.C60612q.class
                    java.lang.Class<ir.r> r2 = p565ir.C60613r.class
                    xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r4 = r0.f165228h
                    java.lang.String r5 = "MicroMsg.ChattingItemAppMsgFinderProduct"
                    java.lang.String r6 = ""
                    java.lang.String r8 = "ui.context"
                    r9 = 2
                    r11 = 1
                    if (r4 == 0) goto L_0x003a
                    if (r4 == r11) goto L_0x0034
                    if (r4 != r9) goto L_0x002c
                    int r3 = r0.f165227g
                    int r4 = r0.f165226f
                    java.lang.Object r9 = r0.f165225e
                    java.lang.String r9 = (java.lang.String) r9
                    java.lang.Object r12 = r0.f165224d
                    te3.pp0 r12 = (te3.C50858pp0) r12
                    kotlin.ResultKt.throwOnFailure(r57)
                    r18 = r6
                    goto L_0x0182
                L_0x002c:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0034:
                    kotlin.ResultKt.throwOnFailure(r57)
                    r4 = r57
                    goto L_0x0057
                L_0x003a:
                    kotlin.ResultKt.throwOnFailure(r57)
                    di3.d r4 = di3.C86312j.m106911c(r1)
                    ir.q r4 = (p565ir.C60612q) r4
                    ck3.b r12 = r0.f165229i
                    android.app.Activity r12 = r12.mo91565f()
                    gy3.C87412m.m108593f(r12, r8)
                    te3.ci1 r13 = r0.f165230j
                    r0.f165228h = r11
                    java.lang.Object r4 = r4.mo84964u6(r12, r13, r0)
                    if (r4 != r3) goto L_0x0057
                    return r3
                L_0x0057:
                    r12 = r4
                    te3.pp0 r12 = (te3.C50858pp0) r12
                    gy3.f0<java.lang.String> r4 = r0.f165231n
                    java.lang.StringBuilder r13 = new java.lang.StringBuilder
                    r13.<init>()
                    gy3.f0<java.lang.String> r14 = r0.f165231n
                    T r14 = r14.f27484d
                    java.lang.String r14 = (java.lang.String) r14
                    r13.append(r14)
                    r14 = 58
                    r13.append(r14)
                    if (r12 == 0) goto L_0x0079
                    te3.fp1 r14 = r12.f139889d
                    if (r14 == 0) goto L_0x0079
                    java.lang.String r14 = r14.f183193x
                    if (r14 != 0) goto L_0x007a
                L_0x0079:
                    r14 = r6
                L_0x007a:
                    r13.append(r14)
                    java.lang.String r13 = r13.toString()
                    r4.f27484d = r13
                    if (r12 == 0) goto L_0x0090
                    te3.fp1 r4 = r12.f139889d
                    if (r4 == 0) goto L_0x0090
                    te3.l40 r4 = r4.f183185p
                    if (r4 == 0) goto L_0x0090
                    int r4 = r4.f184036i
                    goto L_0x0091
                L_0x0090:
                    r4 = 1
                L_0x0091:
                    if (r4 != r11) goto L_0x0095
                    r4 = 1
                    goto L_0x0096
                L_0x0095:
                    r4 = 0
                L_0x0096:
                    di3.d r13 = di3.C86312j.m106911c(r2)
                    ir.r r13 = (p565ir.C60613r) r13
                    te3.ci1 r14 = r0.f165230j
                    java.lang.String r13 = r13.Yh0(r14)
                    if (r12 == 0) goto L_0x00a7
                    int r14 = r12.f139890e
                    goto L_0x00a8
                L_0x00a7:
                    r14 = 0
                L_0x00a8:
                    di3.d r15 = di3.C86312j.m106911c(r2)
                    ir.r r15 = (p565ir.C60613r) r15
                    te3.ci1 r10 = r0.f165230j
                    di3.d r9 = di3.C86312j.m106911c(r2)
                    java.lang.String r7 = "getService(IFinderLiveUtilService::class.java)"
                    gy3.C87412m.m108593f(r9, r7)
                    r17 = r9
                    ir.r r17 = (p565ir.C60613r) r17
                    te3.ci1 r7 = r0.f165230j
                    r19 = 0
                    r20 = 0
                    r21 = 0
                    r22 = 14
                    r23 = 0
                    r18 = r7
                    java.lang.String r7 = p565ir.C60613r.C60614a.m70875a(r17, r18, r19, r20, r21, r22, r23)
                    java.lang.String r9 = "commodity_item"
                    r15.Vb0(r10, r9, r7)
                    di3.d r7 = di3.C86312j.m106911c(r2)
                    ir.r r7 = (p565ir.C60613r) r7
                    te3.ci1 r9 = r0.f165230j
                    di3.d r10 = di3.C86312j.m106911c(r2)
                    ir.r r10 = (p565ir.C60613r) r10
                    te3.ci1 r15 = r0.f165230j
                    ck3.b r11 = r0.f165229i
                    boolean r11 = r11.mo91583x()
                    if (r11 == 0) goto L_0x00ef
                    java.lang.String r11 = "group"
                    goto L_0x00f1
                L_0x00ef:
                    java.lang.String r11 = "chat"
                L_0x00f1:
                    r18 = r6
                    r6 = 1
                    if (r14 != r6) goto L_0x00f8
                    r6 = 1
                    goto L_0x00f9
                L_0x00f8:
                    r6 = 2
                L_0x00f9:
                    java.lang.Integer r14 = new java.lang.Integer
                    r14.<init>(r6)
                    r6 = 0
                    java.lang.String r10 = r10.ti0(r15, r6, r11, r14)
                    java.lang.String r11 = "commodity_card"
                    r7.Vb0(r9, r11, r10)
                    te3.ci1 r7 = r0.f165230j
                    int r7 = r7.f182510v
                    if (r7 <= 0) goto L_0x0158
                    if (r12 == 0) goto L_0x0123
                    te3.fp1 r7 = r12.f139889d
                    if (r7 == 0) goto L_0x0123
                    di3.d r11 = di3.C86312j.m106911c(r2)
                    ir.r r11 = (p565ir.C60613r) r11
                    te3.xn2 r7 = r11.ek0(r7)
                    if (r7 == 0) goto L_0x0123
                    long r14 = r7.f186353e
                    goto L_0x0125
                L_0x0123:
                    r14 = 0
                L_0x0125:
                    long r6 = eb0.C31543z5.m39453c()
                    java.lang.StringBuilder r11 = new java.lang.StringBuilder
                    r11.<init>()
                    te3.ci1 r9 = r0.f165230j
                    java.lang.String r9 = r9.f182504p
                    r11.append(r9)
                    java.lang.String r9 = " end_time_ms:"
                    r11.append(r9)
                    r11.append(r14)
                    java.lang.String r9 = ",serverTime:"
                    r11.append(r9)
                    r11.append(r6)
                    java.lang.String r9 = r11.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
                    r9 = 0
                    int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
                    if (r11 <= 0) goto L_0x0156
                    int r9 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
                    if (r9 >= 0) goto L_0x0158
                L_0x0156:
                    r6 = 1
                    goto L_0x0159
                L_0x0158:
                    r6 = 0
                L_0x0159:
                    di3.d r7 = di3.C86312j.m106911c(r1)
                    ir.q r7 = (p565ir.C60612q) r7
                    ck3.b r9 = r0.f165229i
                    android.app.Activity r9 = r9.mo91565f()
                    gy3.C87412m.m108593f(r9, r8)
                    if (r12 == 0) goto L_0x016d
                    te3.fp1 r10 = r12.f139889d
                    goto L_0x016e
                L_0x016d:
                    r10 = 0
                L_0x016e:
                    r0.f165224d = r12
                    r0.f165225e = r13
                    r0.f165226f = r4
                    r0.f165227g = r6
                    r11 = 2
                    r0.f165228h = r11
                    java.lang.Object r7 = r7.Yv0(r9, r10, r0)
                    if (r7 != r3) goto L_0x0180
                    return r3
                L_0x0180:
                    r3 = r6
                    r9 = r13
                L_0x0182:
                    ck3.b r6 = r0.f165229i
                    android.app.Activity r6 = r6.mo91565f()
                    gy3.C87412m.m108593f(r6, r8)
                    te3.ci1 r7 = r0.f165230j
                    int r8 = r0.f165232o
                    gy3.f0<java.lang.String> r10 = r0.f165231n
                    T r10 = r10.f27484d
                    java.lang.String r10 = (java.lang.String) r10
                    if (r3 == 0) goto L_0x0199
                    r3 = 1
                    goto L_0x019a
                L_0x0199:
                    r3 = 0
                L_0x019a:
                    if (r4 == 0) goto L_0x019e
                    r4 = 1
                    goto L_0x019f
                L_0x019e:
                    r4 = 0
                L_0x019f:
                    java.lang.String r11 = "shareObject"
                    gy3.C87412m.m108594g(r7, r11)
                    java.lang.String r11 = "sceneNote"
                    gy3.C87412m.m108594g(r10, r11)
                    java.lang.String r11 = "shareToken"
                    gy3.C87412m.m108594g(r9, r11)
                    java.lang.StringBuilder r11 = new java.lang.StringBuilder
                    r11.<init>()
                    java.lang.String r13 = "enterShoppingWeApp appId:"
                    r11.append(r13)
                    java.lang.String r13 = r7.f182500i
                    r11.append(r13)
                    java.lang.String r13 = ",enterPath:"
                    r11.append(r13)
                    java.lang.String r13 = r7.f182501j
                    r11.append(r13)
                    java.lang.String r13 = ",sceneNote:"
                    r11.append(r13)
                    r11.append(r10)
                    java.lang.String r13 = ",pathCookie:"
                    r11.append(r13)
                    if (r12 == 0) goto L_0x01df
                    te3.fp1 r13 = r12.f139889d
                    if (r13 == 0) goto L_0x01df
                    java.lang.String r13 = r13.f183163H
                    goto L_0x01e0
                L_0x01df:
                    r13 = 0
                L_0x01e0:
                    r11.append(r13)
                    java.lang.String r13 = ",showDiscountFinish:"
                    r11.append(r13)
                    r11.append(r3)
                    java.lang.String r11 = r11.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
                    java.lang.StringBuilder r11 = new java.lang.StringBuilder
                    r11.<init>()
                    java.lang.String r13 = "showNavigationBar:"
                    r11.append(r13)
                    r11.append(r4)
                    java.lang.String r11 = r11.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
                    di0.o r5 = new di0.o
                    r5.<init>()
                    java.lang.String r11 = r7.f182500i
                    if (r11 != 0) goto L_0x0212
                    r11 = r18
                L_0x0212:
                    r5.f250930b = r11
                    int r11 = r11.length()
                    if (r11 != 0) goto L_0x021c
                    r11 = 1
                    goto L_0x021d
                L_0x021c:
                    r11 = 0
                L_0x021d:
                    if (r11 == 0) goto L_0x0233
                    java.lang.String r11 = r5.f250929a
                    if (r11 == 0) goto L_0x022d
                    int r11 = r11.length()
                    if (r11 != 0) goto L_0x022a
                    goto L_0x022d
                L_0x022a:
                    r16 = 0
                    goto L_0x022f
                L_0x022d:
                    r16 = 1
                L_0x022f:
                    if (r16 == 0) goto L_0x0233
                    goto L_0x0317
                L_0x0233:
                    java.lang.String r11 = r7.f182501j
                    r5.f250934f = r11
                    r11 = 1208(0x4b8, float:1.693E-42)
                    r5.f250939k = r11
                    r5.f250921J = r8
                    r5.f250940l = r10
                    java.lang.Class<ht1.a5> r8 = ht1.C76243a5.class
                    di3.d r8 = di3.C86312j.m106911c(r8)
                    ht1.a5 r8 = (ht1.C76243a5) r8
                    int r8 = r8.mo13211J()
                    r5.f250931c = r8
                    com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CustomSubjectInfo r8 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo.f157973f
                    java.lang.String r10 = r7.f182507s
                    java.lang.String r11 = r7.f182508t
                    if (r10 == 0) goto L_0x025c
                    if (r11 == 0) goto L_0x025c
                    com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CustomSubjectInfo r8 = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CustomSubjectInfo
                    r8.<init>(r11, r10)
                L_0x025c:
                    r45 = r8
                    com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r8 = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig
                    r20 = 1
                    r21 = 0
                    r22 = 0
                    r23 = 0
                    r24 = 0
                    r25 = 0
                    r26 = 0
                    if (r4 == 0) goto L_0x0273
                    com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r10 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55453c.SINGLE_CLOSE
                    goto L_0x0275
                L_0x0273:
                    com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r10 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55453c.HIDE
                L_0x0275:
                    r27 = r10
                    r28 = 0
                    r30 = 0
                    r31 = 0
                    r32 = 0
                    r33 = 0
                    r34 = 0
                    r35 = 0
                    com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$ShareActionConfig r10 = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$ShareActionConfig
                    r36 = r10
                    r11 = 1
                    r10.<init>(r11, r9)
                    r37 = 0
                    r38 = 0
                    r39 = 0
                    r40 = 0
                    r41 = 0
                    r42 = 0
                    r43 = 0
                    r44 = 0
                    r46 = 0
                    r47 = 0
                    r48 = 0
                    r49 = 0
                    r50 = 0
                    r51 = 0
                    r52 = 0
                    r53 = -33620610(0xfffffffffdfefd7e, float:-4.2367515E37)
                    r54 = 1
                    r55 = 0
                    r19 = r8
                    r29 = r4
                    r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
                    r5.f250912A = r8
                    com.tencent.mm.ui.chatting.viewitems.y1 r4 = new com.tencent.mm.ui.chatting.viewitems.y1
                    r4.<init>(r3, r6)
                    r5.f250916E = r4
                    if (r12 == 0) goto L_0x02cc
                    te3.fp1 r3 = r12.f139889d
                    if (r3 == 0) goto L_0x02cc
                    java.lang.String r3 = r3.f183163H
                    if (r3 != 0) goto L_0x02ce
                L_0x02cc:
                    r3 = r18
                L_0x02ce:
                    com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r4 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer
                    r4.<init>()
                    org.json.JSONObject r8 = new org.json.JSONObject
                    r8.<init>()
                    java.lang.String r10 = "cookies"
                    r8.put(r10, r3)
                    r3 = 1
                    r4.f239396d = r3
                    java.lang.String r3 = r8.toString()
                    r4.f239399g = r3
                    r5.f250947s = r4
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    ir.q r1 = (p565ir.C60612q) r1
                    java.lang.String r3 = r7.f182497f
                    if (r3 != 0) goto L_0x02f4
                    r3 = r18
                L_0x02f4:
                    java.lang.String r4 = r7.f182498g
                    if (r4 != 0) goto L_0x02fa
                    r4 = r18
                L_0x02fa:
                    r1.mo84966uX(r12, r3, r4, r5)
                    di3.d r1 = di3.C86312j.m106911c(r2)
                    ir.r r1 = (p565ir.C60613r) r1
                    java.lang.String r2 = r7.f182496e
                    if (r2 != 0) goto L_0x0309
                    r2 = r18
                L_0x0309:
                    r1.mo84976Te(r2, r9, r5)
                    java.lang.Class<kr0.x0> r1 = kr0.C76630x0.class
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    kr0.x0 r1 = (kr0.C76630x0) r1
                    r1.mo106898tv(r6, r5)
                L_0x0317:
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemAppMsgFinderProduct.C57727c.C57728a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C57727c(C8480h hVar) {
        }

        /* JADX WARNING: type inference failed for: r1v13, types: [android.app.Activity] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo82180a(android.view.View r18, ck3.C67391b r19, com.tencent.p014mm.storage.C72963f4 r20) {
            /*
                r17 = this;
                r0 = r18
                r7 = r19
                r8 = r20
                java.lang.String r1 = "msg"
                gy3.C87412m.m108594g(r8, r1)
                java.lang.String r1 = r20.getContent()
                r2 = 0
                if (r1 == 0) goto L_0x001b
                java.lang.String r3 = r20.mo108775z2()
                com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r3)
                goto L_0x001c
            L_0x001b:
                r1 = r2
            L_0x001c:
                r9 = 1
                if (r1 == 0) goto L_0x00c5
                if (r7 == 0) goto L_0x00c5
                java.lang.Class<ht1.i> r3 = ht1.C60175i.class
                com.tencent.mm.message.g r1 = r1.mo93555w(r3)
                ht1.i r1 = (ht1.C60175i) r1
                te3.ci1 r3 = r1.f171712b
                java.lang.String r1 = r3.f182495d
                if (r1 == 0) goto L_0x0038
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0036
                goto L_0x0038
            L_0x0036:
                r1 = 0
                goto L_0x0039
            L_0x0038:
                r1 = 1
            L_0x0039:
                if (r1 != 0) goto L_0x003e
                r1 = 1177(0x499, float:1.65E-42)
                goto L_0x0040
            L_0x003e:
                r1 = 1195(0x4ab, float:1.675E-42)
            L_0x0040:
                java.lang.String r4 = r19.mo91577r()
                boolean r5 = com.tencent.p014mm.storage.C72996z1.m85847r5(r4)
                if (r5 != 0) goto L_0x006b
                boolean r5 = eb0.C45628s0.m50735A(r4)
                if (r5 == 0) goto L_0x0051
                goto L_0x006b
            L_0x0051:
                boolean r5 = com.tencent.p014mm.storage.C72996z1.m85807K5(r4)
                if (r5 == 0) goto L_0x0059
                r5 = 3
                goto L_0x006c
            L_0x0059:
                boolean r5 = com.tencent.p014mm.storage.C72996z1.m85843n5(r4)
                if (r5 == 0) goto L_0x0061
                r5 = 2
                goto L_0x006c
            L_0x0061:
                boolean r5 = com.tencent.p014mm.storage.C72996z1.m85846q5(r4)
                if (r5 == 0) goto L_0x0069
                r5 = 5
                goto L_0x006c
            L_0x0069:
                r5 = 1
                goto L_0x006c
            L_0x006b:
                r5 = 4
            L_0x006c:
                gy3.f0 r6 = new gy3.f0
                r6.<init>()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = r3.f182496e
                if (r11 != 0) goto L_0x007c
                java.lang.String r11 = ""
            L_0x007c:
                r10.append(r11)
                r11 = 58
                r10.append(r11)
                r10.append(r5)
                r10.append(r11)
                r10.append(r4)
                r10.append(r11)
                r10.append(r1)
                java.lang.String r1 = r10.toString()
                r6.f27484d = r1
                com.tencent.mm.sdk.coroutines.LifecycleScope r16 = new com.tencent.mm.sdk.coroutines.LifecycleScope
                android.app.Activity r1 = r19.mo91565f()
                boolean r4 = r1 instanceof androidx.lifecycle.C0125s
                if (r4 == 0) goto L_0x00a6
                r2 = r1
                androidx.lifecycle.s r2 = (androidx.lifecycle.C0125s) r2
            L_0x00a6:
                r12 = r2
                r13 = 0
                r14 = 4
                r15 = 0
                java.lang.String r11 = "MicroMsg.ChattingItemAppMsgFinderProduct"
                r10 = r16
                r10.<init>(r11, r12, r13, r14, r15)
                r11 = 0
                r12 = 0
                com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderProduct$c$a r13 = new com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderProduct$c$a
                r10 = 0
                r1 = r13
                r2 = r19
                r4 = r6
                r6 = r10
                r1.<init>(r2, r3, r4, r5, r6)
                r14 = 3
                r10 = r16
                a14.C53895h.m60466d(r10, r11, r12, r13, r14, r15)
                goto L_0x00cc
            L_0x00c5:
                java.lang.String r1 = "MicroMsg.ChattingItemAppMsgFinderProduct"
                java.lang.String r2 = "onItemClick content is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            L_0x00cc:
                if (r7 != 0) goto L_0x00cf
                goto L_0x00e1
            L_0x00cf:
                if (r0 != 0) goto L_0x00d2
                goto L_0x00e1
            L_0x00d2:
                java.lang.Class<zj3.c> r1 = zj3.C66869c.class
                com.tencent.mm.ui.chatting.manager.a r2 = r7.f193278b
                xi.d r1 = r2.mo102812a(r1)
                zj3.c r1 = (zj3.C66869c) r1
                if (r1 == 0) goto L_0x00e1
                r1.mo26187U2(r7, r0, r8)
            L_0x00e1:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemAppMsgFinderProduct.C57727c.mo82180a(android.view.View, ck3.b, com.tencent.mm.storage.f4):boolean");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderProduct$d */
    public static final class C57729d {

        /* renamed from: a */
        public final boolean f165233a;

        /* renamed from: b */
        public C67391b f165234b;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderProduct$d$a */
        public static final class C57730a extends C87413o implements C32226l<C50858pp0, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ AppMsgFinderProductHolder f165235d;

            /* renamed from: e */
            public final /* synthetic */ C67391b f165236e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57730a(AppMsgFinderProductHolder appMsgFinderProductHolder, C67391b bVar) {
                super(1);
                this.f165235d = appMsgFinderProductHolder;
                this.f165236e = bVar;
            }

            public Object invoke(Object obj) {
                z44 z44;
                C89349b bVar;
                C64370fp1 fp12;
                LinkedList<z44> linkedList;
                T t;
                boolean z;
                C50858pp0 pp02 = (C50858pp0) obj;
                String str = null;
                boolean z2 = true;
                if (pp02 == null || (fp12 = pp02.f139889d) == null || (linkedList = fp12.f183165J) == null) {
                    z44 = null;
                } else {
                    Iterator<T> it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (((z44) t).f186625d == 4) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    z44 = (z44) t;
                }
                if (!(z44 == null || (bVar = z44.f186626e) == null)) {
                    C64688rq1 rq12 = new C64688rq1();
                    rq12.parseFrom(bVar.mo123703f());
                    str = rq12.f185232d;
                }
                if (!(str == null || str.length() == 0)) {
                    z2 = false;
                }
                if (!z2) {
                    C61926c.m72668M(new C57811z1(this.f165235d, str, this.f165236e));
                }
                return C13598b0.f38549a;
            }
        }

        public C57729d(boolean z) {
            this.f165233a = z;
        }

        /* renamed from: a */
        public final void mo82181a(C74023i iVar, AppMsgFinderProductHolder appMsgFinderProductHolder, C78208e eVar, C67391b bVar, C72963f4 f4Var, String str) {
            Class cls;
            C67391b bVar2;
            C74023i iVar2;
            String str2;
            Class cls2;
            int i;
            String str3;
            String str4;
            C74023i iVar3 = iVar;
            AppMsgFinderProductHolder appMsgFinderProductHolder2 = appMsgFinderProductHolder;
            C67391b bVar3 = bVar;
            C72963f4 f4Var2 = f4Var;
            Class cls3 = C76243a5.class;
            C27696y yVar = C27696y.THUMB_IMAGE;
            Class cls4 = C79368l.class;
            Class cls5 = C62368t0.class;
            Class cls6 = C60175i.class;
            Class cls7 = C60606n.class;
            Class cls8 = C11990s0.class;
            Class<C60200t1> cls9 = C60200t1.class;
            C87412m.m108594g(iVar3, "chattingItem");
            C87412m.m108594g(bVar3, "ui");
            C87412m.m108594g(f4Var2, "msg");
            this.f165234b = bVar3;
            if (appMsgFinderProductHolder2 == null) {
                Log.m105924i("MicroMsg.ChattingItemAppMsgFinderProduct", "filling not AppMsgFinderProductHolder");
                return;
            }
            View view = appMsgFinderProductHolder2.convertView;
            if (view != null) {
                C66869c cVar = (C66869c) bVar3.f193278b.mo102812a(C66869c.class);
                if (cVar != null) {
                    cVar.mo26188V0(bVar3, view, f4Var2);
                }
            }
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if ((u != null ? (C60175i) u.mo93555w(cls6) : null) != null) {
                C64287ci1 ci12 = ((C60175i) u.mo93555w(cls6)).f171712b;
                if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
                    Log.m105924i("MicroMsg.ChattingItemAppMsgFinderProduct", "filling shareObject:" + C61937h.m72709h(ci12));
                } else {
                    Log.m105924i("MicroMsg.ChattingItemAppMsgFinderProduct", "flashPrice:" + ci12.f182510v + ",flashTime:" + ci12.f182511w + ",marketPrice:" + ci12.f182505q + ",sellingPrice:" + ci12.f182506r);
                }
                ImageView avatar = appMsgFinderProductHolder.getAvatar();
                if (avatar != null) {
                    C60979d<C100810g0> i2 = ((C11990s0) C39818r.f106831a.mo62446e(cls9).mo62447c(cls8)).mo11872i2();
                    str2 = "";
                    C62368t0 t0Var = (C62368t0) C86312j.m106911c(cls5);
                    String str5 = ci12.f182507s;
                    if (str5 == null) {
                        str5 = str2;
                    }
                    cls2 = cls4;
                    i2.mo85957c(t0Var.mo87412UE(str5, yVar), avatar, ((C11990s0) C39818r.f106831a.mo62446e(cls9).mo62447c(cls8)).mo11867O2(C11978e0.C11979a.AVATAR_WITHOUT_DEFAULT));
                    C13598b0 b0Var = C13598b0.f38549a;
                } else {
                    cls2 = cls4;
                    str2 = "";
                }
                TextView nicknameTv = appMsgFinderProductHolder.getNicknameTv();
                if (nicknameTv != null) {
                    nicknameTv.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(bVar.mo91565f(), ci12.f182508t));
                    C13598b0 b0Var2 = C13598b0.f38549a;
                }
                LinkedList<String> linkedList = new LinkedList<>();
                String str6 = ci12.f182491E;
                if (!(str6 == null || str6.length() == 0)) {
                    String str7 = ci12.f182491E;
                    if (str7 == null) {
                        str7 = str2;
                    }
                    linkedList.add(str7);
                }
                String str8 = ci12.f182492F;
                if (!(str8 == null || str8.length() == 0)) {
                    String str9 = ci12.f182492F;
                    if (str9 == null) {
                        str9 = str2;
                    }
                    linkedList.add(str9);
                }
                String str10 = ci12.f182493G;
                if (!(str10 == null || str10.length() == 0)) {
                    String str11 = ci12.f182493G;
                    if (str11 == null) {
                        str11 = str2;
                    }
                    linkedList.add(str11);
                }
                MMTextView titleTv = appMsgFinderProductHolder.getTitleTv();
                if (titleTv != null) {
                    if (linkedList.size() > 0) {
                        titleTv.setMaxLines(1);
                    } else {
                        titleTv.setMaxLines(2);
                    }
                    LinkedList linkedList2 = new LinkedList();
                    LinkedList linkedList3 = new LinkedList();
                    String str12 = ci12.f182487A;
                    if (!(str12 == null || str12.length() == 0) && (str4 = ci12.f182487A) != null) {
                        linkedList2.add(str4);
                        if (!C87412m.m108589b(Float.valueOf(ci12.f182488B), 0L)) {
                            linkedList3.add(Float.valueOf(ci12.f182488B));
                        }
                        C13598b0 b0Var3 = C13598b0.f38549a;
                    }
                    String str13 = ci12.f182489C;
                    if (!(str13 == null || str13.length() == 0) && (str3 = ci12.f182489C) != null) {
                        linkedList2.add(str3);
                        if (!C87412m.m108589b(Float.valueOf(ci12.f182490D), 0L)) {
                            linkedList3.add(Float.valueOf(ci12.f182490D));
                        }
                        C13598b0 b0Var4 = C13598b0.f38549a;
                    }
                    MMTextView titleTv2 = appMsgFinderProductHolder.getTitleTv();
                    if (titleTv2 != null) {
                        i = 2;
                        titleTv2.setTextSize(2, 14.0f);
                        C13598b0 b0Var5 = C13598b0.f38549a;
                    } else {
                        i = 2;
                    }
                    TextView nicknameTv2 = appMsgFinderProductHolder.getNicknameTv();
                    if (nicknameTv2 != null) {
                        nicknameTv2.setTextSize(i, 12.0f);
                        C13598b0 b0Var6 = C13598b0.f38549a;
                    }
                    TextView descTv = appMsgFinderProductHolder.getDescTv();
                    if (descTv != null) {
                        descTv.setTextSize(i, 17.0f);
                        C13598b0 b0Var7 = C13598b0.f38549a;
                    }
                    TextView recommendTv = appMsgFinderProductHolder.getRecommendTv();
                    if (recommendTv != null) {
                        recommendTv.setTextSize(i, 12.0f);
                        C13598b0 b0Var8 = C13598b0.f38549a;
                    }
                    TextView recommendTv2 = appMsgFinderProductHolder.getRecommendTv();
                    if (recommendTv2 != null) {
                        C7919x.m8091a(recommendTv2);
                        C13598b0 b0Var9 = C13598b0.f38549a;
                    }
                    C7335d c = C86312j.m106911c(cls7);
                    C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
                    C60606n nVar = (C60606n) c;
                    String str14 = ci12.f182504p;
                    nVar.mo85040UB(titleTv, linkedList2, linkedList3, str14 == null ? str2 : str14, C76577a.m92151b(titleTv.getContext(), 16), true);
                    C0000n0 viewHolderScope = appMsgFinderProductHolder.getViewHolderScope();
                    if (viewHolderScope != null) {
                        C7335d c2 = C86312j.m106911c(cls7);
                        C87412m.m108593f(c2, "getService(\n            …                        )");
                        C60606n nVar2 = (C60606n) c2;
                        String str15 = ci12.f182504p;
                        C60606n.C60607a.m70858b(nVar2, "product_icon", viewHolderScope, titleTv, linkedList2, str15 == null ? str2 : str15, true, false, true, true, 0, (C32224a) null, 1536, (Object) null);
                        C13598b0 b0Var10 = C13598b0.f38549a;
                    }
                }
                LinearLayout guaranteeLayout = appMsgFinderProductHolder.getGuaranteeLayout();
                if (guaranteeLayout != null) {
                    guaranteeLayout.removeAllViews();
                    for (String pu02 : linkedList) {
                        C60606n nVar3 = (C60606n) C86312j.m106911c(cls7);
                        Context context = guaranteeLayout.getContext();
                        C87412m.m108593f(context, "it.context");
                        nVar3.pu0("MicroMsg.ChattingItemAppMsgFinderProduct", context, guaranteeLayout, pu02, 12.0f, MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df) / 2, C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3702cb), false);
                        if (guaranteeLayout.getVisibility() != 0) {
                            guaranteeLayout.setVisibility(0);
                        }
                    }
                    C13598b0 b0Var11 = C13598b0.f38549a;
                }
                ImageView platformLogo = appMsgFinderProductHolder.getPlatformLogo();
                if (platformLogo != null) {
                    C100075f.C100076a aVar = new C100075f.C100076a();
                    aVar.f293176b = true;
                    aVar.f293175a = true;
                    C100075f a = aVar.mo139398a();
                    C99101e eVar2 = C99101e.f290570a;
                    C99099a aVar2 = C99101e.f290571b;
                    String nullAsNil = Util.nullAsNil(ci12.f182514z);
                    C87412m.m108593f(nullAsNil, "nullAsNil(shareObject.platformLogoURL)");
                    aVar2.mo85957c(nullAsNil, platformLogo, a);
                    C13598b0 b0Var12 = C13598b0.f38549a;
                }
                TextView descTv2 = appMsgFinderProductHolder.getDescTv();
                if (descTv2 != null) {
                    ((C76243a5) C86312j.m106911c(cls3)).mo13247y9(descTv2, false);
                    C13598b0 b0Var13 = C13598b0.f38549a;
                }
                TextView marketPriceTv = appMsgFinderProductHolder.getMarketPriceTv();
                if (marketPriceTv != null) {
                    marketPriceTv.setVisibility(8);
                    C13598b0 b0Var14 = C13598b0.f38549a;
                }
                TextView priceBegin = appMsgFinderProductHolder.getPriceBegin();
                if (priceBegin != null) {
                    C7919x.m8091a(priceBegin);
                    if (ci12.f182494H) {
                        priceBegin.setVisibility(0);
                    } else {
                        priceBegin.setVisibility(8);
                    }
                    C13598b0 b0Var15 = C13598b0.f38549a;
                }
                int i3 = ci12.f182506r;
                TextView descTv3 = appMsgFinderProductHolder.getDescTv();
                if (descTv3 != null) {
                    descTv3.setText(MMApplicationContext.getContext().getString(C0966R.string.nel, new Object[]{((C76243a5) C86312j.m106911c(cls3)).mo13234cB(i3)}));
                    ((C76243a5) C86312j.m106911c(cls3)).mo13247y9(descTv3, false);
                    if (i3 <= 0) {
                        Log.m105924i("MicroMsg.ChattingItemAppMsgFinderProduct", "selling price invalid, " + i3);
                        descTv3.setVisibility(8);
                    } else {
                        descTv3.setVisibility(0);
                    }
                }
                ImageView coverIv = appMsgFinderProductHolder.getCoverIv();
                if (coverIv != null) {
                    C60979d<C100810g0> V = ((C11990s0) C39818r.f106831a.mo62446e(cls9).mo62447c(cls8)).mo11870V();
                    C62368t0 t0Var2 = (C62368t0) C86312j.m106911c(cls5);
                    String str16 = ci12.f182503o;
                    V.mo85957c(t0Var2.mo87412UE(str16 == null ? str2 : str16, yVar), coverIv, ((C11990s0) C39818r.f106831a.mo62446e(cls9).mo62447c(cls8)).mo11867O2(C11978e0.C11979a.TIMELINE));
                    String str17 = ci12.f182503o;
                    if (str17 == null || str17.length() == 0) {
                        Log.m105924i("MicroMsg.ChattingItemAppMsgFinderProduct", "coverUrl is empty");
                    }
                    C13598b0 b0Var16 = C13598b0.f38549a;
                }
                iVar2 = iVar;
                bVar2 = bVar;
                appMsgFinderProductHolder2.clickArea.setOnClickListener(iVar2.mo103099u(bVar2));
                appMsgFinderProductHolder2.clickArea.setOnLongClickListener(iVar2.mo103098p(bVar2));
                View view2 = appMsgFinderProductHolder2.clickArea;
                cls = cls2;
                C79368l lVar = (C79368l) bVar2.f193278b.mo102812a(cls);
                view2.setOnTouchListener(lVar != null ? lVar.mo108189Z4() : null);
                appMsgFinderProductHolder2.clickArea.setTag(new C74243t8(f4Var, bVar.mo91583x(), appMsgFinderProductHolder2, (String) null));
                Activity f = bVar.mo91565f();
                C87412m.m108593f(f, "ui.context");
                ((C60613r) C86312j.m106911c(C60613r.class)).Ih0(f, ci12, new C57730a(appMsgFinderProductHolder2, bVar2));
            } else {
                cls = cls4;
                C72963f4 f4Var3 = f4Var2;
                bVar2 = bVar3;
                iVar2 = iVar3;
            }
            if (this.f165233a || !C74023i.m87878T()) {
                if (appMsgFinderProductHolder.getTickIV() != null) {
                    ImageView tickIV = appMsgFinderProductHolder.getTickIV();
                    C87412m.m108591d(tickIV);
                    tickIV.setVisibility(8);
                }
                iVar2.mo103093i0(appMsgFinderProductHolder2, f4Var.getStatus() < 2, true);
                return;
            }
            ProgressBar progressBar = appMsgFinderProductHolder2.uploadingPB;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            if (f4Var.getStatus() != 2 || !iVar2.mo103080N((C79368l) bVar2.f193278b.mo102812a(cls), f4Var.getMsgId())) {
                if (appMsgFinderProductHolder.getTickIV() != null) {
                    ImageView tickIV2 = appMsgFinderProductHolder.getTickIV();
                    C87412m.m108591d(tickIV2);
                    tickIV2.setVisibility(8);
                }
            } else if (appMsgFinderProductHolder.getTickIV() != null) {
                ImageView tickIV3 = appMsgFinderProductHolder.getTickIV();
                C87412m.m108591d(tickIV3);
                tickIV3.setVisibility(0);
            }
        }

        /* renamed from: b */
        public final View mo82182b(LayoutInflater layoutInflater, View view) {
            if (view == null || view.getTag() == null) {
                view = this.f165233a ? new C6807n4(layoutInflater, C0966R.C0971layout.d7f) : new C6807n4(layoutInflater, C0966R.C0971layout.d7h);
                view.setTag(new AppMsgFinderProductHolder().build(view, !this.f165233a));
            }
            return view;
        }

        /* renamed from: c */
        public final boolean mo82183c(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
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
                intent.putExtra("Retr_Msg_Type", 30);
                intent.putExtra("Multi_Retr", true);
                intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
                intent.putExtra("Retr_go_to_chattingUI", false);
                intent.putExtra("Retr_show_success_tips", true);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Activity activity = f;
                C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderProduct$FinderProductDelegate", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                f.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderProduct$FinderProductDelegate", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            return true;
        }

        /* renamed from: d */
        public final boolean mo82184d(C74023i iVar, C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C87412m.m108594g(iVar, "chattingItem");
            if (e0Var == null || view == null) {
                return false;
            }
            C67391b bVar = this.f165234b;
            if (bVar != null) {
                if (this.f165233a) {
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
        public final void mo82185e(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            if (!this.f165233a && f4Var.mo101020w3()) {
                C72695v.m85081w(f4Var);
                C75604z3.m90834f(f4Var.getMsgId());
                bVar.mo91541B(true);
            }
        }
    }
}
