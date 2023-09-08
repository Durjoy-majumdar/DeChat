package com.tencent.p014mm.plugin.sns.p106ui.improve.item;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.comm.C55593g;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import gc0.C20828a;
import gu2.C98214b;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import ic0.C21070h;
import iu2.C98799a;
import j20.C117292a;
import java.util.LinkedList;
import jc0.C21210b;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.ResultKt;
import os2.C100406i0;
import p823sg.C90193h;
import qc0.C101093a;
import qc0.C101106m;
import rc0.C63389c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101779g1;
import te3.C101789j00;
import te3.C101799k1;
import te3.C101804kv2;
import te3.C64719t23;
import vr2.C102236a0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C119027c;
import za2.C102984b;

/* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem */
public final class MVImproveTimelineItem extends ImproveTimelineItemNotify {

    /* renamed from: h1 */
    public static final /* synthetic */ int f164409h1 = 0;

    /* renamed from: W0 */
    public View f164410W0;

    /* renamed from: X0 */
    public final C13601g f164411X0;

    /* renamed from: Y0 */
    public final C13601g f164412Y0 = C36568h.m40985a(new C57403f(this));

    /* renamed from: Z0 */
    public final C13601g f164413Z0 = C36568h.m40985a(new C57404g(this));

    /* renamed from: a1 */
    public final C13601g f164414a1;

    /* renamed from: b1 */
    public final C13601g f164415b1;

    /* renamed from: c1 */
    public final C13601g f164416c1;

    /* renamed from: d1 */
    public final C13601g f164417d1;

    /* renamed from: e1 */
    public final C13601g f164418e1;

    /* renamed from: f1 */
    public final C13601g f164419f1;

    /* renamed from: g1 */
    public final IListener<?> f164420g1;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$a */
    public static final class C57397a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ Context f164421d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57397a(Context context) {
            super(0);
            this.f164421d = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$dip_2$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$dip_2$2");
            Integer valueOf = Integer.valueOf(C76577a.m92151b(this.f164421d, 2));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$dip_2$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$dip_2$2");
            return valueOf;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2", mo125469f = "MVImproveTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$b */
    public static final class C57398b extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public final /* synthetic */ MVImproveTimelineItem f164422d;

        /* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$b$a */
        public static final class C57399a implements C21070h {

            /* renamed from: a */
            public final /* synthetic */ TimeLineObject f164423a;

            /* renamed from: b */
            public final /* synthetic */ String f164424b;

            /* renamed from: c */
            public final /* synthetic */ MVImproveTimelineItem f164425c;

            public C57399a(TimeLineObject timeLineObject, String str, MVImproveTimelineItem mVImproveTimelineItem) {
                this.f164423a = timeLineObject;
                this.f164424b = str;
                this.f164425c = mVImproveTimelineItem;
            }

            /* renamed from: a */
            public void mo6676a(String str, View view) {
                SnsMethodCalculate.markStartTimeMs("onImageLoadStart", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2$1");
                C87412m.m108594g(str, "url");
                C87412m.m108594g(view, "view");
                SnsMethodCalculate.markEndTimeMs("onImageLoadStart", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2$1");
            }

            /* renamed from: b */
            public void mo6677b(String str, View view, C21210b bVar) {
                SnsMethodCalculate.markStartTimeMs("onImageLoadFinish", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2$1");
                C87412m.m108594g(str, "url");
                C87412m.m108594g(view, "view");
                C87412m.m108594g(bVar, "imageData");
                Bitmap bitmap = bVar.f59988d;
                if (bitmap != null && !bitmap.isRecycled()) {
                    ((C63389c) C86312j.m106911c(C63389c.class)).mo88295UZ(this.f164423a.f283893Id, this.f164424b);
                    byte[] bytes = str.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    String f = C90193h.m112878f(bytes);
                    C55593g gVar = C55593g.f158270a;
                    Context context = this.f164425c.getContext();
                    C87412m.m108593f(context, "context");
                    View T = MVImproveTimelineItem.m66127T(this.f164425c);
                    Bitmap bitmap2 = bVar.f59988d;
                    C87412m.m108593f(bitmap2, "imageData.bitmap");
                    C87412m.m108593f(f, "md5Key");
                    gVar.mo77114b(context, T, bitmap2, f);
                }
                SnsMethodCalculate.markEndTimeMs("onImageLoadFinish", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2$1");
            }

            /* renamed from: c */
            public Bitmap mo6678c(String str, View view, C21210b bVar) {
                SnsMethodCalculate.markStartTimeMs("onProcessBitmap", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2$1");
                C87412m.m108594g(str, "url");
                C87412m.m108594g(view, "view");
                C87412m.m108594g(bVar, "imageData");
                SnsMethodCalculate.markEndTimeMs("onProcessBitmap", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2$1");
                return null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57398b(MVImproveTimelineItem mVImproveTimelineItem, C15601d<? super C57398b> dVar) {
            super(2, dVar);
            this.f164422d = mVImproveTimelineItem;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2");
            C57398b bVar = new C57398b(this.f164422d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2");
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2");
            Object invokeSuspend = ((C57398b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            C98214b b;
            String str;
            String str2;
            String str3;
            String str4;
            C101789j00 j002;
            LinkedList<C101804kv2> linkedList;
            C101799k1 k1Var;
            C101779g1 g1Var;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2");
            ResultKt.throwOnFailure(obj);
            C98799a data = this.f164422d.getData();
            if (data == null || (b = data.mo138170b()) == null) {
                Boolean bool = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2");
                return bool;
            }
            TimeLineObject G2 = b.mo137509G2();
            b.mo137503A2();
            C101789j00 j003 = G2.ContentObj;
            if (j003 != null) {
                C64719t23 t232 = j003.f298439w;
                if (t232 != null) {
                    str4 = t232.f185462g;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (!Util.isNullOrNil(str4)) {
                        this.f164422d.mo137055z("MicroMsg.Improve.ImproveMVTimelineItem", "has mvInfo:" + str4);
                        View U = MVImproveTimelineItem.m66128U(this.f164422d);
                        View findViewById = U != null ? U.findViewById(C0966R.C0970id.hqn) : null;
                        if (findViewById != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view = findViewById;
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/item/MVImproveTimelineItem$loadCustomItemInfo$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/improve/item/MVImproveTimelineItem$loadCustomItemInfo$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        TextView X = MVImproveTimelineItem.m66130X(this.f164422d);
                        ViewGroup.LayoutParams layoutParams = X != null ? X.getLayoutParams() : null;
                        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = MVImproveTimelineItem.m66123P(this.f164422d) * 3;
                        TextView W = MVImproveTimelineItem.m66129W(this.f164422d);
                        ViewGroup.LayoutParams layoutParams2 = W != null ? W.getLayoutParams() : null;
                        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = MVImproveTimelineItem.m66123P(this.f164422d);
                        TextView R = MVImproveTimelineItem.m66125R(this.f164422d);
                        if (R != null) {
                            R.setVisibility(0);
                        }
                        TextView R2 = MVImproveTimelineItem.m66125R(this.f164422d);
                        if (R2 != null) {
                            R2.setText(str4 + C76577a.m92166q(this.f164422d.getContext(), C0966R.string.h2w));
                        }
                    } else {
                        View U2 = MVImproveTimelineItem.m66128U(this.f164422d);
                        View findViewById2 = U2 != null ? U2.findViewById(C0966R.C0970id.hqn) : null;
                        if (findViewById2 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(8);
                            View view2 = findViewById2;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/item/MVImproveTimelineItem$loadCustomItemInfo$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/improve/item/MVImproveTimelineItem$loadCustomItemInfo$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        TextView X2 = MVImproveTimelineItem.m66130X(this.f164422d);
                        ViewGroup.LayoutParams layoutParams3 = X2 != null ? X2.getLayoutParams() : null;
                        C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = 0;
                        TextView W2 = MVImproveTimelineItem.m66129W(this.f164422d);
                        ViewGroup.LayoutParams layoutParams4 = W2 != null ? W2.getLayoutParams() : null;
                        C87412m.m108592e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = MVImproveTimelineItem.m66123P(this.f164422d) * 2;
                        TextView R3 = MVImproveTimelineItem.m66125R(this.f164422d);
                        if (R3 != null) {
                            R3.setText("");
                        }
                        TextView R4 = MVImproveTimelineItem.m66125R(this.f164422d);
                        if (R4 != null) {
                            R4.setVisibility(8);
                        }
                    }
                    str3 = G2.ContentObj.f298439w.f185461f;
                } else {
                    j003.f298439w = new C64719t23();
                    str4 = "";
                    str3 = str4;
                }
                str = Util.nullAs(str3, "");
                Log.m105925i("MicroMsg.Improve.ImproveMVTimelineItem", "coverInfo: coverUrl:%s, postInfo:%s", str, str4);
                MVImproveTimelineItem mVImproveTimelineItem = this.f164422d;
                C64719t23 t233 = G2.ContentObj.f298439w;
                int i = MVImproveTimelineItem.f164409h1;
                SnsMethodCalculate.markStartTimeMs("access$fillLocalShareMusicObject", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
                mVImproveTimelineItem.getClass();
                SnsMethodCalculate.markStartTimeMs("fillLocalShareMusicObject", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
                if (!(t233 == null || (j002 = G2.ContentObj) == null || (linkedList = j002.f298427h) == null || linkedList.isEmpty())) {
                    C101804kv2 kv22 = G2.ContentObj.f298427h.get(0);
                    if (Util.isNullOrNil(t233.f185473u)) {
                        t233.f185473u = kv22.f298697o;
                    }
                    if (Util.isNullOrNil(t233.f185463h)) {
                        t233.f185463h = kv22.f298691f;
                    }
                    if (Util.isNullOrNil(t233.f185474v)) {
                        t233.f185474v = kv22.f298683Q;
                    }
                    if (Util.isNullOrNil(t233.f185475w)) {
                        t233.f185475w = kv22.f298682P;
                    }
                    if (!(!Util.isNullOrNil(t233.f185465j) || (k1Var = G2.actionInfo) == null || (g1Var = k1Var.f298580j) == null)) {
                        t233.f185465j = g1Var.f298273f;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("fillLocalShareMusicObject", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
                SnsMethodCalculate.markEndTimeMs("access$fillLocalShareMusicObject", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
            } else {
                str = "";
            }
            C101789j00 j004 = G2.ContentObj;
            if (j004 != null && !j004.f298427h.isEmpty()) {
                C101804kv2 kv23 = G2.ContentObj.f298427h.get(0);
                C87412m.m108593f(kv23, "tlObj.ContentObj.MediaObjList.get(0)");
                C101804kv2 kv24 = kv23;
                if (!Util.isNullOrNil(str)) {
                    Log.m105925i("MicroMsg.Improve.ImproveMVTimelineItem", "loadMusicCover use mv, title: %s", kv24.f298697o);
                    str2 = C102984b.m136166c(str);
                    C87412m.m108593f(str2, "getMusicLogoThumbPath(coverUrl)");
                } else if (!Util.isNullOrNil(kv24.f298694i)) {
                    Log.m105925i("MicroMsg.Improve.ImproveMVTimelineItem", "loadMusicCover use media.Thumb, title: %s", kv24.f298697o);
                    str2 = C102984b.m136166c(kv24.f298694i);
                    C87412m.m108593f(str2, "getMusicLogoThumbPath(media.Thumb)");
                    str = kv24.f298694i;
                } else {
                    C100406i0 LL = C94866e1.ay0().mo139867LL((long) kv24.f298701s);
                    str = C94938q1.m120518e(C94866e1.m120262YO(), LL.mo139851e()) + C102236a0.m134733a0(LL.mo139851e());
                    Log.m105927v("MicroMsg.Improve.ImproveMVTimelineItem", "loadMusicCover use thumb path: %s, exist: %s, title: %s", str, Boolean.valueOf(C86013q1.m106450k(str)), kv24.f298697o);
                    str2 = str;
                }
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59350f = str2;
                bVar.f59346b = true;
                bVar.f59364t = true;
                bVar.f59345a = true;
                bVar.f59363s = true;
                bVar.f59365u = (float) C76577a.m92151b(this.f164422d.getContext(), 2);
                C20828a.m22825b().mo32520i(str, MVImproveTimelineItem.m66124Q(this.f164422d), bVar.mo32666a(), new C57399a(G2, str2, this.f164422d));
                G2.ContentObj.f298439w.f185472t = str2;
                WeImageView S = MVImproveTimelineItem.m66126S(this.f164422d);
                if (S != null) {
                    S.setPressed(false);
                }
                if (!Util.isNullOrNil(G2.ContentObj.f298439w.f185463h)) {
                    TextView W3 = MVImproveTimelineItem.m66129W(this.f164422d);
                    if (W3 != null) {
                        W3.setVisibility(0);
                    }
                    TextView W4 = MVImproveTimelineItem.m66129W(this.f164422d);
                    if (W4 != null) {
                        W4.setText(G2.ContentObj.f298439w.f185463h);
                    }
                } else if (!Util.isNullOrNil(kv24.f298691f)) {
                    TextView W5 = MVImproveTimelineItem.m66129W(this.f164422d);
                    if (W5 != null) {
                        W5.setVisibility(0);
                    }
                    TextView W6 = MVImproveTimelineItem.m66129W(this.f164422d);
                    if (W6 != null) {
                        W6.setText(kv24.f298691f);
                    }
                } else {
                    TextView W7 = MVImproveTimelineItem.m66129W(this.f164422d);
                    if (W7 != null) {
                        W7.setVisibility(8);
                    }
                    TextView W8 = MVImproveTimelineItem.m66129W(this.f164422d);
                    if (W8 != null) {
                        W8.setText("");
                    }
                }
                String str5 = kv24.f298697o;
                if (!Util.isNullOrNil(str5)) {
                    TextView X3 = MVImproveTimelineItem.m66130X(this.f164422d);
                    if (X3 != null) {
                        X3.setVisibility(0);
                    }
                    SpannableString spannableString = new SpannableString(str5);
                    TextView X4 = MVImproveTimelineItem.m66130X(this.f164422d);
                    if (X4 != null) {
                        X4.setText(spannableString, TextView.BufferType.SPANNABLE);
                    }
                } else {
                    Log.m105920e("MicroMsg.Improve.ImproveMVTimelineItem", "songName must make sure not empty");
                }
                MVImproveTimelineItem.m66132Z(this.f164422d);
            }
            Boolean bool2 = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$loadCustomItemInfo$2");
            return bool2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$c */
    public static final class C57400c extends C87413o implements C32224a<MMRoundCornerImageView> {

        /* renamed from: d */
        public final /* synthetic */ MVImproveTimelineItem f164426d;

        /* renamed from: e */
        public final /* synthetic */ Context f164427e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57400c(MVImproveTimelineItem mVImproveTimelineItem, Context context) {
            super(0);
            this.f164426d = mVImproveTimelineItem;
            this.f164427e = context;
        }

        public Object invoke() {
            MMRoundCornerImageView mMRoundCornerImageView;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicCover$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicCover$2");
            View U = MVImproveTimelineItem.m66128U(this.f164426d);
            if (U == null || (mMRoundCornerImageView = (MMRoundCornerImageView) U.findViewById(C0966R.C0970id.b7t)) == null) {
                mMRoundCornerImageView = null;
            } else {
                mMRoundCornerImageView.setImageDrawable(C76577a.m92158i(this.f164427e, C85875k4.m106211z() ? C0966R.C0969drawable.ait : C0966R.C0969drawable.aiu));
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicCover$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicCover$2");
            return mMRoundCornerImageView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$d */
    public static final class C57401d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ MVImproveTimelineItem f164428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57401d(MVImproveTimelineItem mVImproveTimelineItem) {
            super(0);
            this.f164428d = mVImproveTimelineItem;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMVInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMVInfo$2");
            View U = MVImproveTimelineItem.m66128U(this.f164428d);
            TextView textView = U != null ? (TextView) U.findViewById(C0966R.C0970id.b7v) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMVInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMVInfo$2");
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$e */
    public static final class C57402e extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ MVImproveTimelineItem f164429d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57402e(MVImproveTimelineItem mVImproveTimelineItem) {
            super(0);
            this.f164429d = mVImproveTimelineItem;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMediaIcon$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMediaIcon$2");
            View U = MVImproveTimelineItem.m66128U(this.f164429d);
            WeImageView weImageView = U != null ? (WeImageView) U.findViewById(C0966R.C0970id.b7u) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMediaIcon$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMediaIcon$2");
            return weImageView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$f */
    public static final class C57403f extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ MVImproveTimelineItem f164430d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57403f(MVImproveTimelineItem mVImproveTimelineItem) {
            super(0);
            this.f164430d = mVImproveTimelineItem;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMvBlurBg$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMvBlurBg$2");
            RoundCornerRelativeLayout Y = MVImproveTimelineItem.m66131Y(this.f164430d);
            View findViewById = Y != null ? Y.findViewById(C0966R.C0970id.aft) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMvBlurBg$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMvBlurBg$2");
            return findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$g */
    public static final class C57404g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ MVImproveTimelineItem f164431d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57404g(MVImproveTimelineItem mVImproveTimelineItem) {
            super(0);
            this.f164431d = mVImproveTimelineItem;
        }

        public Object invoke() {
            View view;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMvRoot$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMvRoot$2");
            RoundCornerRelativeLayout Y = MVImproveTimelineItem.m66131Y(this.f164431d);
            if (Y == null || (view = Y.findViewById(C0966R.C0970id.h5u)) == null) {
                view = null;
            } else {
                view.setBackgroundResource(C85875k4.m106211z() ? C0966R.C0969drawable.atm : C0966R.C0969drawable.atn);
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMvRoot$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicMvRoot$2");
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$h */
    public static final class C57405h extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ MVImproveTimelineItem f164432d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57405h(MVImproveTimelineItem mVImproveTimelineItem) {
            super(0);
            this.f164432d = mVImproveTimelineItem;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicSinger$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicSinger$2");
            View U = MVImproveTimelineItem.m66128U(this.f164432d);
            TextView textView = U != null ? (TextView) U.findViewById(C0966R.C0970id.b7x) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicSinger$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicSinger$2");
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$i */
    public static final class C57406i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ MVImproveTimelineItem f164433d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57406i(MVImproveTimelineItem mVImproveTimelineItem) {
            super(0);
            this.f164433d = mVImproveTimelineItem;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicSongName$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicSongName$2");
            View U = MVImproveTimelineItem.m66128U(this.f164433d);
            TextView textView = U != null ? (TextView) U.findViewById(C0966R.C0970id.b7y) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicSongName$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicSongName$2");
            return textView;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem", mo125469f = "MVImproveTimelineItem.kt", mo125470l = {138}, mo125471m = "onBindViewHolder")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$j */
    public static final class C57407j extends C66704d {

        /* renamed from: d */
        public Object f164434d;

        /* renamed from: e */
        public /* synthetic */ Object f164435e;

        /* renamed from: f */
        public final /* synthetic */ MVImproveTimelineItem f164436f;

        /* renamed from: g */
        public int f164437g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57407j(MVImproveTimelineItem mVImproveTimelineItem, C15601d<? super C57407j> dVar) {
            super(dVar);
            this.f164436f = mVImproveTimelineItem;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$onBindViewHolder$1");
            this.f164435e = obj;
            this.f164437g |= Integer.MIN_VALUE;
            Object g = this.f164436f.mo81006g((C60905o) null, (C98799a) null, 0, false, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$onBindViewHolder$1");
            return g;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$k */
    public static final class C57408k extends C87413o implements C32224a<RoundCornerRelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ MVImproveTimelineItem f164438d;

        /* renamed from: e */
        public final /* synthetic */ Context f164439e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57408k(MVImproveTimelineItem mVImproveTimelineItem, Context context) {
            super(0);
            this.f164438d = mVImproveTimelineItem;
            this.f164439e = context;
        }

        public Object invoke() {
            RoundCornerRelativeLayout roundCornerRelativeLayout;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$roundCornerRL$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$roundCornerRL$2");
            MVImproveTimelineItem mVImproveTimelineItem = this.f164438d;
            SnsMethodCalculate.markStartTimeMs("access$getConvertView$p", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
            View view = mVImproveTimelineItem.f164410W0;
            SnsMethodCalculate.markEndTimeMs("access$getConvertView$p", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
            if (view == null || (roundCornerRelativeLayout = (RoundCornerRelativeLayout) view.findViewById(C0966R.C0970id.iwu)) == null) {
                roundCornerRelativeLayout = null;
            } else {
                roundCornerRelativeLayout.setRadius((float) C76577a.m92151b(this.f164439e, 4));
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$roundCornerRL$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$roundCornerRL$2");
            return roundCornerRelativeLayout;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MVImproveTimelineItem(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f164411X0 = C36568h.m40985a(new C57408k(this, context));
        this.f164414a1 = C36568h.m40985a(new C57400c(this, context));
        this.f164415b1 = C36568h.m40985a(new C57405h(this));
        this.f164416c1 = C36568h.m40985a(new C57406i(this));
        this.f164417d1 = C36568h.m40985a(new C57401d(this));
        this.f164418e1 = C36568h.m40985a(new C57402e(this));
        this.f164419f1 = C36568h.m40985a(new C57397a(context));
        this.f164420g1 = new MVImproveTimelineItem$musicPlayerListener$1(this, getLifecycleOwner());
    }

    /* renamed from: P */
    public static final /* synthetic */ int m66123P(MVImproveTimelineItem mVImproveTimelineItem) {
        SnsMethodCalculate.markStartTimeMs("access$getDip_2", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        int dip_2 = mVImproveTimelineItem.getDip_2();
        SnsMethodCalculate.markEndTimeMs("access$getDip_2", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return dip_2;
    }

    /* renamed from: Q */
    public static final /* synthetic */ MMRoundCornerImageView m66124Q(MVImproveTimelineItem mVImproveTimelineItem) {
        SnsMethodCalculate.markStartTimeMs("access$getMusicCover", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        MMRoundCornerImageView musicCover = mVImproveTimelineItem.getMusicCover();
        SnsMethodCalculate.markEndTimeMs("access$getMusicCover", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return musicCover;
    }

    /* renamed from: R */
    public static final /* synthetic */ TextView m66125R(MVImproveTimelineItem mVImproveTimelineItem) {
        SnsMethodCalculate.markStartTimeMs("access$getMusicMVInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        TextView musicMVInfo = mVImproveTimelineItem.getMusicMVInfo();
        SnsMethodCalculate.markEndTimeMs("access$getMusicMVInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return musicMVInfo;
    }

    /* renamed from: S */
    public static final /* synthetic */ WeImageView m66126S(MVImproveTimelineItem mVImproveTimelineItem) {
        SnsMethodCalculate.markStartTimeMs("access$getMusicMediaIcon", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        WeImageView musicMediaIcon = mVImproveTimelineItem.getMusicMediaIcon();
        SnsMethodCalculate.markEndTimeMs("access$getMusicMediaIcon", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return musicMediaIcon;
    }

    /* renamed from: T */
    public static final /* synthetic */ View m66127T(MVImproveTimelineItem mVImproveTimelineItem) {
        SnsMethodCalculate.markStartTimeMs("access$getMusicMvBlurBg", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        View musicMvBlurBg = mVImproveTimelineItem.getMusicMvBlurBg();
        SnsMethodCalculate.markEndTimeMs("access$getMusicMvBlurBg", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return musicMvBlurBg;
    }

    /* renamed from: U */
    public static final /* synthetic */ View m66128U(MVImproveTimelineItem mVImproveTimelineItem) {
        SnsMethodCalculate.markStartTimeMs("access$getMusicMvRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        View musicMvRoot = mVImproveTimelineItem.getMusicMvRoot();
        SnsMethodCalculate.markEndTimeMs("access$getMusicMvRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return musicMvRoot;
    }

    /* renamed from: W */
    public static final /* synthetic */ TextView m66129W(MVImproveTimelineItem mVImproveTimelineItem) {
        SnsMethodCalculate.markStartTimeMs("access$getMusicSinger", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        TextView musicSinger = mVImproveTimelineItem.getMusicSinger();
        SnsMethodCalculate.markEndTimeMs("access$getMusicSinger", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return musicSinger;
    }

    /* renamed from: X */
    public static final /* synthetic */ TextView m66130X(MVImproveTimelineItem mVImproveTimelineItem) {
        SnsMethodCalculate.markStartTimeMs("access$getMusicSongName", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        TextView musicSongName = mVImproveTimelineItem.getMusicSongName();
        SnsMethodCalculate.markEndTimeMs("access$getMusicSongName", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return musicSongName;
    }

    /* renamed from: Y */
    public static final /* synthetic */ RoundCornerRelativeLayout m66131Y(MVImproveTimelineItem mVImproveTimelineItem) {
        SnsMethodCalculate.markStartTimeMs("access$getRoundCornerRL", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        RoundCornerRelativeLayout roundCornerRL = mVImproveTimelineItem.getRoundCornerRL();
        SnsMethodCalculate.markEndTimeMs("access$getRoundCornerRL", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return roundCornerRL;
    }

    /* renamed from: Z */
    public static final void m66132Z(MVImproveTimelineItem mVImproveTimelineItem) {
        C98214b b;
        SnsMethodCalculate.markStartTimeMs("access$updatePlayIcon", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        mVImproveTimelineItem.getClass();
        SnsMethodCalculate.markStartTimeMs("updatePlayIcon", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        C98799a data = mVImproveTimelineItem.getData();
        if (data == null || (b = data.mo138170b()) == null) {
            SnsMethodCalculate.markEndTimeMs("updatePlayIcon", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        } else {
            String str = b.mo137509G2().f283893Id;
            C87412m.m108593f(str, "tlObj.Id");
            SnsMethodCalculate.markStartTimeMs("isTheSameId", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
            boolean z = false;
            if (!C101093a.m132481c()) {
                SnsMethodCalculate.markEndTimeMs("isTheSameId", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
            } else {
                C101106m b2 = C101093a.m132480b();
                if (b2 != null && C101093a.m132482d(b2) && C87412m.m108589b(str, b2.f295960e)) {
                    z = true;
                }
                SnsMethodCalculate.markEndTimeMs("isTheSameId", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
            }
            if (z) {
                WeImageView musicMediaIcon = mVImproveTimelineItem.getMusicMediaIcon();
                if (musicMediaIcon != null) {
                    musicMediaIcon.setImageResource(C0966R.raw.icons_outlined_pause2);
                }
                WeImageView musicMediaIcon2 = mVImproveTimelineItem.getMusicMediaIcon();
                if (musicMediaIcon2 != null) {
                    musicMediaIcon2.setContentDescription(C76577a.m92166q(mVImproveTimelineItem.getContext(), C0966R.string.jhg));
                }
            } else {
                WeImageView musicMediaIcon3 = mVImproveTimelineItem.getMusicMediaIcon();
                if (musicMediaIcon3 != null) {
                    musicMediaIcon3.setImageResource(C0966R.raw.icons_outlined_play2);
                }
                WeImageView musicMediaIcon4 = mVImproveTimelineItem.getMusicMediaIcon();
                if (musicMediaIcon4 != null) {
                    musicMediaIcon4.setContentDescription(C76577a.m92166q(mVImproveTimelineItem.getContext(), C0966R.string.f361384jg1));
                }
            }
            WeImageView musicMediaIcon5 = mVImproveTimelineItem.getMusicMediaIcon();
            if (musicMediaIcon5 != null) {
                musicMediaIcon5.setIconColor(C76577a.m92153d(mVImproveTimelineItem.getContext(), C0966R.color.f3133gi));
            }
            SnsMethodCalculate.markEndTimeMs("updatePlayIcon", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        }
        SnsMethodCalculate.markEndTimeMs("access$updatePlayIcon", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
    }

    private final int getDip_2() {
        SnsMethodCalculate.markStartTimeMs("getDip_2", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        int intValue = ((Number) ((C36570n) this.f164419f1).getValue()).intValue();
        SnsMethodCalculate.markEndTimeMs("getDip_2", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return intValue;
    }

    private final MMRoundCornerImageView getMusicCover() {
        SnsMethodCalculate.markStartTimeMs("getMusicCover", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        MMRoundCornerImageView mMRoundCornerImageView = (MMRoundCornerImageView) ((C36570n) this.f164414a1).getValue();
        SnsMethodCalculate.markEndTimeMs("getMusicCover", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return mMRoundCornerImageView;
    }

    private final TextView getMusicMVInfo() {
        SnsMethodCalculate.markStartTimeMs("getMusicMVInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        TextView textView = (TextView) ((C36570n) this.f164417d1).getValue();
        SnsMethodCalculate.markEndTimeMs("getMusicMVInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return textView;
    }

    private final WeImageView getMusicMediaIcon() {
        SnsMethodCalculate.markStartTimeMs("getMusicMediaIcon", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        WeImageView weImageView = (WeImageView) ((C36570n) this.f164418e1).getValue();
        SnsMethodCalculate.markEndTimeMs("getMusicMediaIcon", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return weImageView;
    }

    private final View getMusicMvBlurBg() {
        SnsMethodCalculate.markStartTimeMs("getMusicMvBlurBg", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        View view = (View) ((C36570n) this.f164412Y0).getValue();
        SnsMethodCalculate.markEndTimeMs("getMusicMvBlurBg", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return view;
    }

    private final View getMusicMvRoot() {
        SnsMethodCalculate.markStartTimeMs("getMusicMvRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        View view = (View) ((C36570n) this.f164413Z0).getValue();
        SnsMethodCalculate.markEndTimeMs("getMusicMvRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return view;
    }

    private final TextView getMusicSinger() {
        SnsMethodCalculate.markStartTimeMs("getMusicSinger", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        TextView textView = (TextView) ((C36570n) this.f164415b1).getValue();
        SnsMethodCalculate.markEndTimeMs("getMusicSinger", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return textView;
    }

    private final TextView getMusicSongName() {
        SnsMethodCalculate.markStartTimeMs("getMusicSongName", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        TextView textView = (TextView) ((C36570n) this.f164416c1).getValue();
        SnsMethodCalculate.markEndTimeMs("getMusicSongName", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return textView;
    }

    private final RoundCornerRelativeLayout getRoundCornerRL() {
        SnsMethodCalculate.markStartTimeMs("getRoundCornerRL", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        RoundCornerRelativeLayout roundCornerRelativeLayout = (RoundCornerRelativeLayout) ((C36570n) this.f164411X0).getValue();
        SnsMethodCalculate.markEndTimeMs("getRoundCornerRL", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return roundCornerRelativeLayout;
    }

    /* renamed from: D */
    public boolean mo81004D() {
        SnsMethodCalculate.markStartTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return true;
    }

    /* renamed from: F */
    public Object mo81005F(C15601d<? super Boolean> dVar) {
        SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C57398b(this, (C15601d<? super C57398b>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo81006g(jq3.C60905o r18, iu2.C98799a r19, int r20, boolean r21, wx3.C15601d<? super rx3.C13598b0> r22) {
        /*
            r17 = this;
            r6 = r17
            r0 = r22
            java.lang.String r7 = "onBindViewHolder"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.improve.item.MVImproveTimelineItem.C57407j
            if (r1 == 0) goto L_0x001f
            r1 = r0
            com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$j r1 = (com.tencent.p014mm.plugin.sns.p106ui.improve.item.MVImproveTimelineItem.C57407j) r1
            int r2 = r1.f164437g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001f
            int r2 = r2 - r3
            r1.f164437g = r2
            goto L_0x0024
        L_0x001f:
            com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$j r1 = new com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$j
            r1.<init>(r6, r0)
        L_0x0024:
            r5 = r1
            java.lang.Object r0 = r5.f164435e
            xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f164437g
            r2 = 1
            if (r1 == 0) goto L_0x0043
            if (r1 != r2) goto L_0x0038
            java.lang.Object r1 = r5.f164434d
            com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem r1 = (com.tencent.p014mm.plugin.sns.p106ui.improve.item.MVImproveTimelineItem) r1
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x009f
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            throw r0
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.ArrayList r0 = fu2.C98041z.m126632K(r17)
            java.util.Iterator r0 = r0.iterator()
        L_0x004e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            fu2.a r1 = (fu2.C97987a) r1
            boolean r3 = r1 instanceof fu2.C98027t
            if (r3 == 0) goto L_0x004e
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            if (r1 != 0) goto L_0x0086
            fu2.t r0 = new fu2.t
            android.content.Context r1 = r17.getContext()
            java.lang.String r3 = "context"
            gy3.C87412m.m108593f(r1, r3)
            r0.<init>(r1)
            android.view.View r11 = r17.getMusicMvRoot()
            r12 = 0
            r13 = 1
            r14 = 0
            r15 = 10
            r16 = 0
            r10 = r0
            fu2.C97987a.m126564l(r10, r11, r12, r13, r14, r15, r16)
            java.util.ArrayList r1 = r17.getClickInstanceList()
            r1.add(r0)
        L_0x0086:
            r5.f164434d = r6
            r5.f164437g = r2
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.Object r0 = super.mo81006g(r1, r2, r3, r4, r5)
            if (r0 != r9) goto L_0x009e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r9
        L_0x009e:
            r1 = r6
        L_0x009f:
            com.tencent.mm.sdk.event.IListener<?> r0 = r1.f164420g1
            r0.alive()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.item.MVImproveTimelineItem.mo81006g(jq3.o, iu2.a, int, boolean, wx3.d):java.lang.Object");
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return 24;
    }

    /* renamed from: h */
    public void mo81008h() {
        SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        super.mo81008h();
        this.f164420g1.dead();
        SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
    }

    /* renamed from: k */
    public C13604l<View, ConstraintLayout.LayoutParams> mo81009k() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f360008d32, this, false);
        this.f164410W0 = inflate;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.f44464s = 0;
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(inflate, layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return lVar;
    }

    public String name() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
        return "MVImproveTimelineItem";
    }
}
