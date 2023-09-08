package pu2;

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
import com.tencent.p014mm.plugin.sns.p106ui.C95787g0;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import ic0.C21070h;
import j20.C117292a;
import java.util.LinkedList;
import jc0.C21210b;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.ResultKt;
import os2.C100406i0;
import p823sg.C90193h;
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
import yx3.C91590f;
import yx3.C91594j;
import z04.C119027c;
import za2.C102984b;

/* renamed from: pu2.h */
public final class C62532h extends C100954s {

    /* renamed from: d1 */
    public static final /* synthetic */ int f177619d1 = 0;

    /* renamed from: T0 */
    public View f177620T0;

    /* renamed from: U0 */
    public final C13601g f177621U0;

    /* renamed from: V0 */
    public final C13601g f177622V0 = C36568h.m40985a(new C62539f(this));

    /* renamed from: W0 */
    public final C13601g f177623W0 = C36568h.m40985a(new C62540g(this));

    /* renamed from: X0 */
    public final C13601g f177624X0;

    /* renamed from: Y0 */
    public final C13601g f177625Y0;

    /* renamed from: Z0 */
    public final C13601g f177626Z0;

    /* renamed from: a1 */
    public final C13601g f177627a1;

    /* renamed from: b1 */
    public final C13601g f177628b1;

    /* renamed from: c1 */
    public final C13601g f177629c1;

    /* renamed from: pu2.h$a */
    public static final class C62533a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ Context f177630d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62533a(Context context) {
            super(0);
            this.f177630d = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$dip_2$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$dip_2$2");
            Integer valueOf = Integer.valueOf(C76577a.m92151b(this.f177630d, 2));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$dip_2$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$dip_2$2");
            return valueOf;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2", mo125469f = "ImproveMVTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: pu2.h$b */
    public static final class C62534b extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C62532h f177631d;

        /* renamed from: pu2.h$b$a */
        public static final class C62535a implements C21070h {

            /* renamed from: a */
            public final /* synthetic */ TimeLineObject f177632a;

            /* renamed from: b */
            public final /* synthetic */ String f177633b;

            /* renamed from: c */
            public final /* synthetic */ C62532h f177634c;

            public C62535a(TimeLineObject timeLineObject, String str, C62532h hVar) {
                this.f177632a = timeLineObject;
                this.f177633b = str;
                this.f177634c = hVar;
            }

            /* renamed from: a */
            public void mo6676a(String str, View view) {
                SnsMethodCalculate.markStartTimeMs("onImageLoadStart", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2$1");
                C87412m.m108594g(str, "url");
                C87412m.m108594g(view, "view");
                SnsMethodCalculate.markEndTimeMs("onImageLoadStart", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2$1");
            }

            /* renamed from: b */
            public void mo6677b(String str, View view, C21210b bVar) {
                SnsMethodCalculate.markStartTimeMs("onImageLoadFinish", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2$1");
                C87412m.m108594g(str, "url");
                C87412m.m108594g(view, "view");
                C87412m.m108594g(bVar, "imageData");
                Bitmap bitmap = bVar.f59988d;
                if (bitmap != null && !bitmap.isRecycled()) {
                    ((C63389c) C86312j.m106911c(C63389c.class)).mo88295UZ(this.f177632a.f283893Id, this.f177633b);
                    byte[] bytes = str.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    String f = C90193h.m112878f(bytes);
                    C55593g gVar = C55593g.f158270a;
                    Context context = this.f177634c.getContext();
                    C87412m.m108593f(context, "context");
                    View K = C62532h.m73503K(this.f177634c);
                    Bitmap bitmap2 = bVar.f59988d;
                    C87412m.m108593f(bitmap2, "imageData.bitmap");
                    C87412m.m108593f(f, "md5Key");
                    gVar.mo77114b(context, K, bitmap2, f);
                }
                SnsMethodCalculate.markEndTimeMs("onImageLoadFinish", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2$1");
            }

            /* renamed from: c */
            public Bitmap mo6678c(String str, View view, C21210b bVar) {
                SnsMethodCalculate.markStartTimeMs("onProcessBitmap", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2$1");
                C87412m.m108594g(str, "url");
                C87412m.m108594g(view, "view");
                C87412m.m108594g(bVar, "imageData");
                SnsMethodCalculate.markEndTimeMs("onProcessBitmap", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2$1");
                return null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62534b(C62532h hVar, C15601d<? super C62534b> dVar) {
            super(2, dVar);
            this.f177631d = hVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2");
            C62534b bVar = new C62534b(this.f177631d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2");
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2");
            Object invokeSuspend = ((C62534b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            TimeLineObject timeLine;
            String str;
            String str2;
            String str3;
            String str4;
            C101789j00 j002;
            LinkedList<C101804kv2> linkedList;
            C101799k1 k1Var;
            C101779g1 g1Var;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2");
            ResultKt.throwOnFailure(obj);
            SnsInfo snsInfo = this.f177631d.getStruct().f281367a;
            if (snsInfo == null || (timeLine = snsInfo.getTimeLine()) == null) {
                Boolean bool = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2");
                return bool;
            }
            String str5 = this.f177631d.getStruct().f281381h;
            C101789j00 j003 = timeLine.ContentObj;
            if (j003 != null) {
                C64719t23 t232 = j003.f298439w;
                if (t232 != null) {
                    str4 = t232.f185462g;
                    if (str4 == null) {
                        str4 = "";
                    }
                    ViewGroup.LayoutParams layoutParams = null;
                    if (!Util.isNullOrNil(str4)) {
                        this.f177631d.mo140441m("MicroMsg.Improve.ImproveMVTimelineItem", "has mvInfo:" + str4);
                        View L = C62532h.m73504L(this.f177631d);
                        View findViewById = L != null ? L.findViewById(C0966R.C0970id.hqn) : null;
                        if (findViewById != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view = findViewById;
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/ImproveMVTimelineItem$loadCustomItemInfo$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/item/improve/ImproveMVTimelineItem$loadCustomItemInfo$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        TextView O = C62532h.m73506O(this.f177631d);
                        ViewGroup.LayoutParams layoutParams2 = O != null ? O.getLayoutParams() : null;
                        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C62532h.m73499G(this.f177631d) * 3;
                        TextView N = C62532h.m73505N(this.f177631d);
                        if (N != null) {
                            layoutParams = N.getLayoutParams();
                        }
                        ViewGroup.LayoutParams layoutParams3 = layoutParams;
                        C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = C62532h.m73499G(this.f177631d);
                        TextView I = C62532h.m73501I(this.f177631d);
                        if (I != null) {
                            I.setVisibility(0);
                        }
                        TextView I2 = C62532h.m73501I(this.f177631d);
                        if (I2 != null) {
                            I2.setText(str4 + C76577a.m92166q(this.f177631d.getContext(), C0966R.string.h2w));
                        }
                    } else {
                        View L2 = C62532h.m73504L(this.f177631d);
                        View findViewById2 = L2 != null ? L2.findViewById(C0966R.C0970id.hqn) : null;
                        if (findViewById2 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(8);
                            View view2 = findViewById2;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/ImproveMVTimelineItem$loadCustomItemInfo$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/improve/ImproveMVTimelineItem$loadCustomItemInfo$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        TextView O2 = C62532h.m73506O(this.f177631d);
                        ViewGroup.LayoutParams layoutParams4 = O2 != null ? O2.getLayoutParams() : null;
                        C87412m.m108592e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = 0;
                        TextView N2 = C62532h.m73505N(this.f177631d);
                        if (N2 != null) {
                            layoutParams = N2.getLayoutParams();
                        }
                        ViewGroup.LayoutParams layoutParams5 = layoutParams;
                        C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = C62532h.m73499G(this.f177631d) * 2;
                        TextView I3 = C62532h.m73501I(this.f177631d);
                        if (I3 != null) {
                            I3.setText("");
                        }
                        TextView I4 = C62532h.m73501I(this.f177631d);
                        if (I4 != null) {
                            I4.setVisibility(8);
                        }
                    }
                    str3 = timeLine.ContentObj.f298439w.f185461f;
                } else {
                    j003.f298439w = new C64719t23();
                    str4 = "";
                    str3 = str4;
                }
                str = Util.nullAs(str3, "");
                Log.m105925i("MicroMsg.Improve.ImproveMVTimelineItem", "coverInfo: coverUrl:%s, postInfo:%s", str, str4);
                C62532h hVar = this.f177631d;
                C64719t23 t233 = timeLine.ContentObj.f298439w;
                int i = C62532h.f177619d1;
                SnsMethodCalculate.markStartTimeMs("access$fillLocalShareMusicObject", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
                hVar.getClass();
                SnsMethodCalculate.markStartTimeMs("fillLocalShareMusicObject", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
                if (!(t233 == null || (j002 = timeLine.ContentObj) == null || (linkedList = j002.f298427h) == null || linkedList.isEmpty())) {
                    C101804kv2 kv22 = timeLine.ContentObj.f298427h.get(0);
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
                    if (!(!Util.isNullOrNil(t233.f185465j) || (k1Var = timeLine.actionInfo) == null || (g1Var = k1Var.f298580j) == null)) {
                        t233.f185465j = g1Var.f298273f;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("fillLocalShareMusicObject", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
                SnsMethodCalculate.markEndTimeMs("access$fillLocalShareMusicObject", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
            } else {
                str = "";
            }
            C101789j00 j004 = timeLine.ContentObj;
            if (j004 != null && !j004.f298427h.isEmpty()) {
                C101804kv2 kv23 = timeLine.ContentObj.f298427h.get(0);
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
                bVar.f59365u = (float) C76577a.m92151b(this.f177631d.getContext(), 2);
                C20828a.m22825b().mo32520i(str, C62532h.m73500H(this.f177631d), bVar.mo32666a(), new C62535a(timeLine, str2, this.f177631d));
                timeLine.ContentObj.f298439w.f185472t = str2;
                WeImageView J = C62532h.m73502J(this.f177631d);
                if (J != null) {
                    J.setPressed(false);
                }
                if (!Util.isNullOrNil(timeLine.ContentObj.f298439w.f185463h)) {
                    TextView N3 = C62532h.m73505N(this.f177631d);
                    if (N3 != null) {
                        N3.setVisibility(0);
                    }
                    TextView N4 = C62532h.m73505N(this.f177631d);
                    if (N4 != null) {
                        N4.setText(timeLine.ContentObj.f298439w.f185463h);
                    }
                } else if (!Util.isNullOrNil(kv24.f298691f)) {
                    TextView N5 = C62532h.m73505N(this.f177631d);
                    if (N5 != null) {
                        N5.setVisibility(0);
                    }
                    TextView N6 = C62532h.m73505N(this.f177631d);
                    if (N6 != null) {
                        N6.setText(kv24.f298691f);
                    }
                } else {
                    TextView N7 = C62532h.m73505N(this.f177631d);
                    if (N7 != null) {
                        N7.setVisibility(8);
                    }
                    TextView N8 = C62532h.m73505N(this.f177631d);
                    if (N8 != null) {
                        N8.setText("");
                    }
                }
                String str6 = kv24.f298697o;
                if (!Util.isNullOrNil(str6)) {
                    TextView O3 = C62532h.m73506O(this.f177631d);
                    if (O3 != null) {
                        O3.setVisibility(0);
                    }
                    SpannableString spannableString = new SpannableString(str6);
                    TextView O4 = C62532h.m73506O(this.f177631d);
                    if (O4 != null) {
                        O4.setText(spannableString, TextView.BufferType.SPANNABLE);
                    }
                } else {
                    Log.m105920e("MicroMsg.Improve.ImproveMVTimelineItem", "songName must make sure not empty");
                }
                SnsTimeLineBaseAdapter adapter = this.f177631d.getAdapter();
                C87412m.m108591d(adapter);
                if (adapter.mo132924s(timeLine.f283893Id)) {
                    WeImageView J2 = C62532h.m73502J(this.f177631d);
                    if (J2 != null) {
                        J2.setImageResource(C0966R.raw.icons_outlined_pause2);
                    }
                    WeImageView J3 = C62532h.m73502J(this.f177631d);
                    if (J3 != null) {
                        J3.setContentDescription(C76577a.m92166q(this.f177631d.getContext(), C0966R.string.jhg));
                    }
                } else {
                    WeImageView J4 = C62532h.m73502J(this.f177631d);
                    if (J4 != null) {
                        J4.setImageResource(C0966R.raw.icons_outlined_play2);
                    }
                    WeImageView J5 = C62532h.m73502J(this.f177631d);
                    if (J5 != null) {
                        J5.setContentDescription(C76577a.m92166q(this.f177631d.getContext(), C0966R.string.f361384jg1));
                    }
                }
                WeImageView J6 = C62532h.m73502J(this.f177631d);
                if (J6 != null) {
                    J6.setIconColor(C76577a.m92153d(this.f177631d.getContext(), C0966R.color.f3133gi));
                }
                C95787g0 g0Var = new C95787g0(timeLine, str5);
                g0Var.f279454e = 1;
                WeImageView J7 = C62532h.m73502J(this.f177631d);
                if (J7 != null) {
                    J7.setTag(g0Var);
                }
                WeImageView J8 = C62532h.m73502J(this.f177631d);
                if (J8 != null) {
                    J8.setOnClickListener(this.f177631d.getAdapter().f278576j.f280600r);
                }
                View L3 = C62532h.m73504L(this.f177631d);
                if (L3 != null) {
                    L3.setTag(g0Var);
                }
                View L4 = C62532h.m73504L(this.f177631d);
                if (L4 != null) {
                    L4.setOnClickListener(this.f177631d.getAdapter().f278576j.f280589g);
                }
                this.f177631d.getAdapter().mo132921k().mo108275j(C62532h.m73504L(this.f177631d), this.f177631d.getAdapter().f278572f.f280396z, this.f177631d.getAdapter().f278572f.f280381k);
            }
            Boolean bool2 = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$loadCustomItemInfo$2");
            return bool2;
        }
    }

    /* renamed from: pu2.h$c */
    public static final class C62536c extends C87413o implements C32224a<MMRoundCornerImageView> {

        /* renamed from: d */
        public final /* synthetic */ C62532h f177635d;

        /* renamed from: e */
        public final /* synthetic */ Context f177636e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62536c(C62532h hVar, Context context) {
            super(0);
            this.f177635d = hVar;
            this.f177636e = context;
        }

        public Object invoke() {
            MMRoundCornerImageView mMRoundCornerImageView;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicCover$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicCover$2");
            View L = C62532h.m73504L(this.f177635d);
            if (L == null || (mMRoundCornerImageView = (MMRoundCornerImageView) L.findViewById(C0966R.C0970id.b7t)) == null) {
                mMRoundCornerImageView = null;
            } else {
                mMRoundCornerImageView.setImageDrawable(C76577a.m92158i(this.f177636e, C85875k4.m106211z() ? C0966R.C0969drawable.ait : C0966R.C0969drawable.aiu));
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicCover$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicCover$2");
            return mMRoundCornerImageView;
        }
    }

    /* renamed from: pu2.h$d */
    public static final class C62537d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62532h f177637d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62537d(C62532h hVar) {
            super(0);
            this.f177637d = hVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMVInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMVInfo$2");
            View L = C62532h.m73504L(this.f177637d);
            TextView textView = L != null ? (TextView) L.findViewById(C0966R.C0970id.b7v) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMVInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMVInfo$2");
            return textView;
        }
    }

    /* renamed from: pu2.h$e */
    public static final class C62538e extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C62532h f177638d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62538e(C62532h hVar) {
            super(0);
            this.f177638d = hVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMediaIcon$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMediaIcon$2");
            View L = C62532h.m73504L(this.f177638d);
            WeImageView weImageView = L != null ? (WeImageView) L.findViewById(C0966R.C0970id.b7u) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMediaIcon$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMediaIcon$2");
            return weImageView;
        }
    }

    /* renamed from: pu2.h$f */
    public static final class C62539f extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62532h f177639d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62539f(C62532h hVar) {
            super(0);
            this.f177639d = hVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMvBlurBg$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMvBlurBg$2");
            RoundCornerRelativeLayout P = C62532h.m73507P(this.f177639d);
            View findViewById = P != null ? P.findViewById(C0966R.C0970id.aft) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMvBlurBg$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMvBlurBg$2");
            return findViewById;
        }
    }

    /* renamed from: pu2.h$g */
    public static final class C62540g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62532h f177640d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62540g(C62532h hVar) {
            super(0);
            this.f177640d = hVar;
        }

        public Object invoke() {
            View view;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMvRoot$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMvRoot$2");
            RoundCornerRelativeLayout P = C62532h.m73507P(this.f177640d);
            if (P == null || (view = P.findViewById(C0966R.C0970id.h5u)) == null) {
                view = null;
            } else {
                view.setBackgroundResource(C85875k4.m106211z() ? C0966R.C0969drawable.atm : C0966R.C0969drawable.atn);
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMvRoot$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicMvRoot$2");
            return view;
        }
    }

    /* renamed from: pu2.h$h */
    public static final class C62541h extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62532h f177641d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62541h(C62532h hVar) {
            super(0);
            this.f177641d = hVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicSinger$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicSinger$2");
            View L = C62532h.m73504L(this.f177641d);
            TextView textView = L != null ? (TextView) L.findViewById(C0966R.C0970id.b7x) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicSinger$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicSinger$2");
            return textView;
        }
    }

    /* renamed from: pu2.h$i */
    public static final class C62542i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62532h f177642d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62542i(C62532h hVar) {
            super(0);
            this.f177642d = hVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicSongName$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicSongName$2");
            View L = C62532h.m73504L(this.f177642d);
            TextView textView = L != null ? (TextView) L.findViewById(C0966R.C0970id.b7y) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicSongName$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$musicSongName$2");
            return textView;
        }
    }

    /* renamed from: pu2.h$j */
    public static final class C62543j extends C87413o implements C32224a<RoundCornerRelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ C62532h f177643d;

        /* renamed from: e */
        public final /* synthetic */ Context f177644e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62543j(C62532h hVar, Context context) {
            super(0);
            this.f177643d = hVar;
            this.f177644e = context;
        }

        public Object invoke() {
            RoundCornerRelativeLayout roundCornerRelativeLayout;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$roundCornerRL$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$roundCornerRL$2");
            C62532h hVar = this.f177643d;
            SnsMethodCalculate.markStartTimeMs("access$getConvertView$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
            View view = hVar.f177620T0;
            SnsMethodCalculate.markEndTimeMs("access$getConvertView$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
            if (view == null || (roundCornerRelativeLayout = (RoundCornerRelativeLayout) view.findViewById(C0966R.C0970id.iwu)) == null) {
                roundCornerRelativeLayout = null;
            } else {
                roundCornerRelativeLayout.setRadius((float) C76577a.m92151b(this.f177644e, 4));
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$roundCornerRL$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem$roundCornerRL$2");
            return roundCornerRelativeLayout;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62532h(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
        this.f177621U0 = C36568h.m40985a(new C62543j(this, context));
        this.f177624X0 = C36568h.m40985a(new C62536c(this, context));
        this.f177625Y0 = C36568h.m40985a(new C62541h(this));
        this.f177626Z0 = C36568h.m40985a(new C62542i(this));
        this.f177627a1 = C36568h.m40985a(new C62537d(this));
        this.f177628b1 = C36568h.m40985a(new C62538e(this));
        this.f177629c1 = C36568h.m40985a(new C62533a(context));
    }

    /* renamed from: G */
    public static final /* synthetic */ int m73499G(C62532h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$getDip_2", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        int dip_2 = hVar.getDip_2();
        SnsMethodCalculate.markEndTimeMs("access$getDip_2", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return dip_2;
    }

    /* renamed from: H */
    public static final /* synthetic */ MMRoundCornerImageView m73500H(C62532h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$getMusicCover", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        MMRoundCornerImageView musicCover = hVar.getMusicCover();
        SnsMethodCalculate.markEndTimeMs("access$getMusicCover", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return musicCover;
    }

    /* renamed from: I */
    public static final /* synthetic */ TextView m73501I(C62532h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$getMusicMVInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        TextView musicMVInfo = hVar.getMusicMVInfo();
        SnsMethodCalculate.markEndTimeMs("access$getMusicMVInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return musicMVInfo;
    }

    /* renamed from: J */
    public static final /* synthetic */ WeImageView m73502J(C62532h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$getMusicMediaIcon", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        WeImageView musicMediaIcon = hVar.getMusicMediaIcon();
        SnsMethodCalculate.markEndTimeMs("access$getMusicMediaIcon", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return musicMediaIcon;
    }

    /* renamed from: K */
    public static final /* synthetic */ View m73503K(C62532h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$getMusicMvBlurBg", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        View musicMvBlurBg = hVar.getMusicMvBlurBg();
        SnsMethodCalculate.markEndTimeMs("access$getMusicMvBlurBg", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return musicMvBlurBg;
    }

    /* renamed from: L */
    public static final /* synthetic */ View m73504L(C62532h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$getMusicMvRoot", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        View musicMvRoot = hVar.getMusicMvRoot();
        SnsMethodCalculate.markEndTimeMs("access$getMusicMvRoot", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return musicMvRoot;
    }

    /* renamed from: N */
    public static final /* synthetic */ TextView m73505N(C62532h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$getMusicSinger", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        TextView musicSinger = hVar.getMusicSinger();
        SnsMethodCalculate.markEndTimeMs("access$getMusicSinger", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return musicSinger;
    }

    /* renamed from: O */
    public static final /* synthetic */ TextView m73506O(C62532h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$getMusicSongName", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        TextView musicSongName = hVar.getMusicSongName();
        SnsMethodCalculate.markEndTimeMs("access$getMusicSongName", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return musicSongName;
    }

    /* renamed from: P */
    public static final /* synthetic */ RoundCornerRelativeLayout m73507P(C62532h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$getRoundCornerRL", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        RoundCornerRelativeLayout roundCornerRL = hVar.getRoundCornerRL();
        SnsMethodCalculate.markEndTimeMs("access$getRoundCornerRL", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return roundCornerRL;
    }

    private final int getDip_2() {
        SnsMethodCalculate.markStartTimeMs("getDip_2", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        int intValue = ((Number) ((C36570n) this.f177629c1).getValue()).intValue();
        SnsMethodCalculate.markEndTimeMs("getDip_2", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return intValue;
    }

    private final MMRoundCornerImageView getMusicCover() {
        SnsMethodCalculate.markStartTimeMs("getMusicCover", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        MMRoundCornerImageView mMRoundCornerImageView = (MMRoundCornerImageView) ((C36570n) this.f177624X0).getValue();
        SnsMethodCalculate.markEndTimeMs("getMusicCover", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return mMRoundCornerImageView;
    }

    private final TextView getMusicMVInfo() {
        SnsMethodCalculate.markStartTimeMs("getMusicMVInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        TextView textView = (TextView) ((C36570n) this.f177627a1).getValue();
        SnsMethodCalculate.markEndTimeMs("getMusicMVInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return textView;
    }

    private final WeImageView getMusicMediaIcon() {
        SnsMethodCalculate.markStartTimeMs("getMusicMediaIcon", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        WeImageView weImageView = (WeImageView) ((C36570n) this.f177628b1).getValue();
        SnsMethodCalculate.markEndTimeMs("getMusicMediaIcon", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return weImageView;
    }

    private final View getMusicMvBlurBg() {
        SnsMethodCalculate.markStartTimeMs("getMusicMvBlurBg", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        View view = (View) ((C36570n) this.f177622V0).getValue();
        SnsMethodCalculate.markEndTimeMs("getMusicMvBlurBg", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return view;
    }

    private final View getMusicMvRoot() {
        SnsMethodCalculate.markStartTimeMs("getMusicMvRoot", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        View view = (View) ((C36570n) this.f177623W0).getValue();
        SnsMethodCalculate.markEndTimeMs("getMusicMvRoot", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return view;
    }

    private final TextView getMusicSinger() {
        SnsMethodCalculate.markStartTimeMs("getMusicSinger", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        TextView textView = (TextView) ((C36570n) this.f177625Y0).getValue();
        SnsMethodCalculate.markEndTimeMs("getMusicSinger", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return textView;
    }

    private final TextView getMusicSongName() {
        SnsMethodCalculate.markStartTimeMs("getMusicSongName", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        TextView textView = (TextView) ((C36570n) this.f177626Z0).getValue();
        SnsMethodCalculate.markEndTimeMs("getMusicSongName", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return textView;
    }

    private final RoundCornerRelativeLayout getRoundCornerRL() {
        SnsMethodCalculate.markStartTimeMs("getRoundCornerRL", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        RoundCornerRelativeLayout roundCornerRelativeLayout = (RoundCornerRelativeLayout) ((C36570n) this.f177621U0).getValue();
        SnsMethodCalculate.markEndTimeMs("getRoundCornerRL", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return roundCornerRelativeLayout;
    }

    /* renamed from: B */
    public Object mo87537B(C15601d<? super Boolean> dVar) {
        SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C62534b(this, (C15601d<? super C62534b>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return g;
    }

    /* renamed from: f */
    public C13604l<View, ConstraintLayout.LayoutParams> mo87542f() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f360008d32, this, false);
        this.f177620T0 = inflate;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.f44464s = 0;
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(inflate, layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return lVar;
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return 24;
    }

    /* renamed from: n */
    public String mo87544n() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return "ImproveMVTimelineItem";
    }

    /* renamed from: z */
    public boolean mo87552z() {
        SnsMethodCalculate.markStartTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        SnsMethodCalculate.markEndTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMVTimelineItem");
        return true;
    }
}
