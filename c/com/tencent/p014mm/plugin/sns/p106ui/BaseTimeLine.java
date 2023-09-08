package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.StrictMode;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import ao2.C79618h;
import as2.C92086h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CloseSnsCommentViewEvent;
import com.tencent.p014mm.autogen.events.SnsAdListScrollEvent;
import com.tencent.p014mm.autogen.events.SnsInputScrollEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsFeedOwnerDeleteCommentReportStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94851d1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.model.C94891k2;
import com.tencent.p014mm.plugin.sns.model.C94895m2;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial.C94753a;
import com.tencent.p014mm.plugin.sns.p106ui.C96116p8;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95944p;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95952q;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsBrowseInfoHelper;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.file.XVFSFile;
import cs2.C45199a;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import gu2.C98214b;
import gv2.C98231f;
import gv2.C98242p;
import gy3.C87412m;
import h81.C32735h;
import i40.C60247c;
import iu2.C60631e;
import iu2.C98802d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jm2.C46562a;
import jp2.C98963o;
import js2.C99020a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lo2.C99567r;
import nj3.C11184p0;
import nj3.C76879j;
import os2.C100416r;
import os2.C100417r0;
import ou2.C100511m;
import p749xh.C102654l5;
import qo3.C89779i0;
import te3.C101789j00;
import te3.C101804kv2;
import te3.C50903q2;
import te3.C51018qv3;
import te3.C52156yq3;
import te3.w64;
import uo3.C78253a;
import vr2.C102236a0;
import vr2.C102244f;
import vr2.C102259p;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.BaseTimeLine */
public class BaseTimeLine implements C43104d1 {

    /* renamed from: H */
    public static List<C96213s> f276689H = new LinkedList();

    /* renamed from: A */
    public C99020a f276690A;

    /* renamed from: B */
    public C43162z1 f276691B;

    /* renamed from: C */
    public C43155u8 f276692C;

    /* renamed from: D */
    public TimelineClickListener f276693D;

    /* renamed from: E */
    public C89779i0 f276694E;

    /* renamed from: F */
    public IListener f276695F;

    /* renamed from: G */
    public IListener f276696G;

    /* renamed from: d */
    public Context f276697d;

    /* renamed from: e */
    public ListView f276698e;

    /* renamed from: f */
    public C98963o f276699f;

    /* renamed from: g */
    public C94895m2 f276700g;

    /* renamed from: h */
    public boolean f276701h;

    /* renamed from: i */
    public boolean f276702i = false;

    /* renamed from: j */
    public C95334g f276703j = null;

    /* renamed from: n */
    public boolean f276704n = true;

    /* renamed from: o */
    public boolean f276705o = true;

    /* renamed from: p */
    public boolean f276706p;

    /* renamed from: q */
    public SnsTimeLineBaseAdapter f276707q;

    /* renamed from: r */
    public SnsCommentFooter f276708r;

    /* renamed from: s */
    public FrameLayout f276709s;

    /* renamed from: t */
    public C96116p8 f276710t;

    /* renamed from: u */
    public C96227t4 f276711u;

    /* renamed from: v */
    public boolean f276712v;

    /* renamed from: w */
    public String f276713w;

    /* renamed from: x */
    public String f276714x;

    /* renamed from: y */
    public C96104o8 f276715y;

    /* renamed from: z */
    public C95733b f276716z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.BaseTimeLine$a */
    public class C95323a extends TimelineClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.BaseTimeLine$a$a */
        public class C95324a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ SnsInfo f276720d;

            /* renamed from: e */
            public final /* synthetic */ View f276721e;

            /* renamed from: f */
            public final /* synthetic */ BaseTimeLineItem.BaseViewHolder f276722f;

            /* renamed from: com.tencent.mm.plugin.sns.ui.BaseTimeLine$a$a$a */
            public class C95325a implements Runnable {
                public C95325a() {
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1$2$1");
                    BaseTimeLine.m121426a(BaseTimeLine.this, false);
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1$2$1");
                }
            }

            public C95324a(SnsInfo snsInfo, View view, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
                this.f276720d = snsInfo;
                this.f276721e = view;
                this.f276722f = baseViewHolder;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1$2");
                try {
                    C94895m2 m2Var = BaseTimeLine.this.f276700g;
                    if (m2Var != null) {
                        SnsBrowseInfoHelper a = m2Var.mo130970a();
                        SnsInfo snsInfo = this.f276720d;
                        a.getClass();
                        SnsMethodCalculate.markStartTimeMs("onLikeEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                        if (snsInfo == null) {
                            SnsMethodCalculate.markEndTimeMs("onLikeEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                        } else {
                            a.f275394F0.add(snsInfo.getLocalid());
                            a.f275384A0 = (long) a.f275394F0.size();
                            a.mo131336w(snsInfo);
                            SnsMethodCalculate.markEndTimeMs("onLikeEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                        }
                    }
                    TextView textView = (TextView) this.f276721e.findViewById(C0966R.C0970id.f5732n4);
                    WeImageView weImageView = (WeImageView) this.f276721e.findViewById(C0966R.C0970id.f5730n2);
                    BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f276722f;
                    if (baseViewHolder.f279958h == 0) {
                        SnsObject e = C94897n1.m120367e(this.f276720d);
                        C91998s.m115550d(707);
                        C102236a0.m134728W(this.f276720d);
                        SnsInfo snsInfo2 = this.f276720d;
                        int i = snsInfo2.field_type;
                        snsInfo2.isAd();
                        this.f276720d.getUxinfo();
                        String str = this.f276720d.field_userName;
                        int i2 = e.LikeCount;
                        StrictMode.allowThreadDiskReads();
                        this.f276722f.f279958h = 1;
                        this.f276720d.setLikeFlag(1);
                        C100416r.m131411d(this.f276720d.getSnsId(), this.f276720d);
                        BaseTimeLine baseTimeLine = BaseTimeLine.this;
                        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                        boolean z = baseTimeLine.f276705o;
                        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                        if (z && !this.f276720d.isSocialAttitudeAd()) {
                            weImageView.setImageResource(C0966R.raw.icons_filled_like);
                            weImageView.setIconColor(this.f276721e.getResources().getColor(C0966R.color.f2966ao));
                        }
                        if (textView != null) {
                            textView.setImportantForAccessibility(2);
                            textView.setText(C0966R.string.jcy);
                            textView.announceForAccessibility(this.f276721e.getResources().getString(C0966R.string.f361363j93));
                            textView.setImportantForAccessibility(1);
                        }
                        if (this.f276720d.isSocialAttitudeAd() && C94753a.m119993e()) {
                            C102260r.m134853V(weImageView);
                        }
                        SnsInfo snsInfo3 = this.f276720d;
                        C5431p1.C5432a.m5340k(snsInfo3, snsInfo3.isAd() ? 7 : 1, "", 0);
                        BaseTimeLine.this.f276707q.mo132930y(true, this.f276720d.getLocalid());
                        SnsReportHelper.f275506m0.mo131382o(C102236a0.m134765q0(this.f276722f.f279952e), true);
                        BaseTimeLine.this.f276707q.mo132916d((LinearLayout) this.f276721e, new C95325a());
                        if (this.f276720d.isAd()) {
                            C99567r.f291863a.mo138938b(this.f276720d);
                        }
                        C94891k2.f274975a.mo131069b(this.f276720d, 1);
                    } else {
                        baseViewHolder.f279958h = 0;
                        this.f276720d.setLikeFlag(0);
                        C100416r.m131411d(this.f276720d.getSnsId(), this.f276720d);
                        if (!this.f276720d.isSocialAttitudeAd()) {
                            weImageView.setImageResource(C0966R.raw.icons_outlined_like);
                            weImageView.setIconColor(this.f276721e.getResources().getColor(C0966R.color.f2975b6));
                        }
                        if (textView != null) {
                            textView.setImportantForAccessibility(2);
                            textView.setText(C0966R.string.je7);
                            textView.announceForAccessibility(this.f276721e.getResources().getString(C0966R.string.j95));
                            textView.setImportantForAccessibility(1);
                        }
                        if (this.f276720d.isSocialAttitudeAd() && C94753a.m119993e()) {
                            C102260r.m134853V(weImageView);
                        }
                        C5431p1.C5432a.m5338a(this.f276720d.getSnsId());
                        BaseTimeLine.this.f276707q.mo132930y(false, this.f276720d.getLocalid());
                        SnsReportHelper.f275506m0.mo131382o(C102236a0.m134765q0(this.f276722f.f279952e), false);
                        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = BaseTimeLine.this.f276707q;
                        LinearLayout linearLayout = (LinearLayout) this.f276721e;
                        snsTimeLineBaseAdapter.getClass();
                        SnsMethodCalculate.markStartTimeMs("doWhileSendUnLiked", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        if (linearLayout != null) {
                            snsTimeLineBaseAdapter.f278568b.f276715y.mo133669b(linearLayout);
                            linearLayout.setPressed(false);
                        }
                        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1$2$2");
                        BaseTimeLine.m121426a(BaseTimeLine.this, false);
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1$2$2");
                        SnsMethodCalculate.markEndTimeMs("doWhileSendUnLiked", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        if (this.f276720d.isAd()) {
                            C99567r.f291863a.mo138939c(this.f276720d);
                        }
                    }
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.TimelineClickListener", "In BaseTimeLine, do onLikeClick and exp is " + th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1$2");
            }
        }

        public C95323a(int i, Activity activity, C94851d1 d1Var) {
            super(i, activity, d1Var);
        }

        /* renamed from: p */
        public void mo132095p(View view) {
            SnsMethodCalculate.markStartTimeMs("onAdAtBossClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            if (view.getTag() instanceof BaseTimeLineItem.BaseViewHolder) {
                BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
                if (BaseTimeLine.this.f276707q.mo132923n() == null) {
                    SnsMethodCalculate.markEndTimeMs("onAdAtBossClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
                    return;
                }
                BaseTimeLine.this.f276707q.mo132923n().mo132950a1();
                new SnsInfo();
                SnsInfo i = BaseTimeLine.this.f276707q.mo132919i(baseViewHolder.f279948c);
                if (!i.isValid()) {
                    SnsMethodCalculate.markEndTimeMs("onAdAtBossClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
                    return;
                }
                C91998s.m115550d(741);
                C94897n1.m120367e(i);
                C102236a0.m134728W(i);
                i.isAd();
                i.getUxinfo();
                i.getUserName();
                BaseTimeLine baseTimeLine = BaseTimeLine.this;
                w64 w64 = new w64();
                baseTimeLine.getClass();
                SnsMethodCalculate.markStartTimeMs("performAdAtBossClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                String str = baseViewHolder.f279950d + "@boss";
                baseTimeLine.f276713w = str;
                Log.m105924i("MicroMsg.BaseTimeLine", "[performAdAtBossClick] onCommentClick:  commentkey " + baseTimeLine.f276713w + " " + baseViewHolder.f279950d + " position:" + baseViewHolder.f279948c);
                C86709a0.m107528h();
                String f = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69664N2(i.getUserName()).mo62898f();
                if (i.isAd()) {
                    f = C98242p.m126939a(i.getAdXml(), f);
                }
                baseTimeLine.mo132081c(i);
                baseTimeLine.f276708r.setTag(i);
                baseTimeLine.mo132084f();
                baseTimeLine.f276708r.setVisibility(0);
                baseTimeLine.f276708r.setCommentFlag(baseTimeLine.mo132083e(str, 1));
                baseTimeLine.f276708r.setCommentHint(f);
                baseTimeLine.f276708r.setCommentInfo(w64);
                baseTimeLine.f276708r.setSnsInfo(i);
                baseTimeLine.f276708r.mo132679A(BaseTimeLine.f276689H, str);
                baseTimeLine.f276708r.post(new C96107p(baseTimeLine));
                baseTimeLine.mo132091m(baseViewHolder);
                if (baseTimeLine.f276708r.mo132699r()) {
                    C115669n.INSTANCE.mo175911u(150, 80);
                }
                SnsMethodCalculate.markEndTimeMs("performAdAtBossClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            }
            SnsMethodCalculate.markEndTimeMs("onAdAtBossClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        }

        /* renamed from: q */
        public void mo132096q(View view) {
            SnsMethodCalculate.markStartTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            BaseTimeLine.this.f276707q.mo132931z();
            try {
                BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
                if (BaseTimeLine.this.f276707q.mo132923n() == null) {
                    SnsMethodCalculate.markEndTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
                    return;
                }
                BaseTimeLine.this.f276707q.mo132923n().mo132950a1();
                new SnsInfo();
                SnsInfo i = BaseTimeLine.this.f276707q.mo132919i(baseViewHolder.f279948c);
                if (!i.isValid()) {
                    SnsMethodCalculate.markEndTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
                    return;
                }
                C94891k2.f274975a.mo131069b(i, 1);
                C91998s.m115550d(741);
                SnsObject e = C94897n1.m120367e(i);
                C102236a0.m134728W(i);
                i.isAd();
                i.getUxinfo();
                i.getUserName();
                if (!i.isAd() || (i.getTimeLine().ContentObj.f298428i & 8) == 0) {
                    BaseTimeLine.this.mo132090l(baseViewHolder, i, new w64());
                } else {
                    BaseTimeLine.this.mo132089k(baseViewHolder, i, new w64());
                }
                SnsMethodCalculate.markEndTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.TimelineClickListener", "In BaseTimeLine, do onCommentClick and exp is " + th.toString());
            }
        }

        /* renamed from: r */
        public void mo132097r(View view) {
            String str;
            String str2;
            int i;
            int i2;
            String str3;
            String str4;
            int i3;
            int i4;
            int i5;
            SnsMethodCalculate.markStartTimeMs("onLikeClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            BaseTimeLine.this.f276707q.mo132931z();
            BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
            SnsInfo DN = C94866e1.Yx0().mo139798DN(baseViewHolder.f279956g);
            if (DN != null && !DN.isInValid()) {
                BaseTimeLine baseTimeLine = BaseTimeLine.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                boolean z = baseTimeLine.f276702i;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                if (!z) {
                    if (DN.isAd() && DN.getTimeLine().ContentObj.f298424e == 27) {
                        BaseTimeLineItem baseTimeLineItem = baseViewHolder.f279965k0;
                        if (baseTimeLineItem instanceof C95944p) {
                            C95944p pVar = (C95944p) baseTimeLineItem;
                            C95944p.C95951g gVar = (C95944p.C95951g) baseViewHolder;
                            C95944p.C95950f fVar = gVar.f280164H0;
                            pVar.getClass();
                            SnsMethodCalculate.markStartTimeMs("switchCard", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
                            if (fVar.f280161f == null) {
                                SnsMethodCalculate.markEndTimeMs("switchCard", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
                                str = "onLikeClick";
                                str2 = "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1";
                                i2 = 0;
                            } else {
                                C95944p.C95951g gVar2 = fVar.f280159d;
                                SnsInfo snsInfo = fVar.f280160e;
                                SnsMethodCalculate.markStartTimeMs("beginTurnAnimation", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
                                TimeLineObject timeLineObject = gVar2.timeLineObject;
                                C95944p.C95950f fVar2 = gVar2.f280164H0;
                                C101789j00 j002 = timeLineObject.ContentObj;
                                String str5 = "beginTurnAnimation";
                                if (j002.f298424e != 27 || j002.f298427h.size() < 2) {
                                    str = "onLikeClick";
                                    str2 = "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1";
                                    str3 = "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem";
                                    str4 = "switchCard";
                                    SnsMethodCalculate.markEndTimeMs(str5, str3);
                                    i2 = 0;
                                } else {
                                    if (snsInfo.getLikeFlag() == 1) {
                                        i4 = 1;
                                        i3 = 0;
                                    } else {
                                        i4 = 0;
                                        i3 = 1;
                                    }
                                    C101804kv2 kv22 = timeLineObject.ContentObj.f298427h.get(i3);
                                    View view2 = gVar2.f280162F0;
                                    View C = pVar.mo133468C(view2, i4, timeLineObject.ContentObj.f298427h.get(i4).f298690e);
                                    String str6 = "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem";
                                    View C2 = pVar.mo133468C(gVar2.f280162F0, i3, 2);
                                    int[] iArr = new int[2];
                                    view2.getLocationOnScreen(iArr);
                                    String str7 = "switchCard";
                                    view2.setPivotY((float) ((pVar.f280141s / 2) - iArr[1]));
                                    view2.setCameraDistance(8000.0f);
                                    float width = ((float) view2.getWidth()) / 2.0f;
                                    float height = ((float) view2.getHeight()) / 2.0f;
                                    int i6 = 90;
                                    if (snsInfo.getLikeFlag() == 1) {
                                        i5 = -90;
                                    } else {
                                        i6 = -90;
                                        i5 = 90;
                                    }
                                    C98231f fVar3 = new C98231f(view2.getContext(), 0.0f, (float) i6, width, height, 150.0f, true);
                                    fVar3.setDuration(187);
                                    fVar3.setInterpolator(new AccelerateInterpolator());
                                    str = "onLikeClick";
                                    View view3 = view2;
                                    View view4 = C;
                                    str3 = str6;
                                    str2 = "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1";
                                    C95952q qVar = r9;
                                    C95944p.C95950f fVar4 = fVar2;
                                    str4 = str7;
                                    C95952q qVar2 = new C95952q(pVar, gVar2, C2, view4, fVar4, view3, i5, width, height);
                                    fVar3.setAnimationListener(qVar);
                                    view3.startAnimation(fVar3);
                                    i2 = ADXml.AD_TURN_CARD_ANIMATION_TIME;
                                    SnsMethodCalculate.markEndTimeMs(str5, str3);
                                }
                                SnsMethodCalculate.markEndTimeMs(str4, str3);
                            }
                            if (DN.getLikeFlag() == 0) {
                                BaseTimeLine.this.f276699f.mo138297d(baseViewHolder.f279952e);
                            }
                            if (DN.getTimeLine().ContentObj.f298427h.size() > gVar.f280164H0.f280156a && DN.getTimeLine().ContentObj.f298427h.get(gVar.f280164H0.f280156a).f298690e == 6) {
                                BaseTimeLine.this.f276699f.mo138303j(baseViewHolder.f279952e, gVar.f280164H0.f280156a > 0);
                            }
                            BaseTimeLine.m121426a(BaseTimeLine.this, true);
                            i = i2;
                            new MMHandler().postDelayed(new C95324a(DN, view, baseViewHolder), (long) i);
                            SnsMethodCalculate.markEndTimeMs(str, str2);
                            return;
                        }
                    }
                    str = "onLikeClick";
                    str2 = "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1";
                    i = 0;
                    new MMHandler().postDelayed(new C95324a(DN, view, baseViewHolder), (long) i);
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                    return;
                }
            }
            SnsMethodCalculate.markEndTimeMs("onLikeClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        }

        /* renamed from: s */
        public void mo132098s() {
            SnsMethodCalculate.markStartTimeMs("onNotifyData", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = BaseTimeLine.this.f276707q;
            if (snsTimeLineBaseAdapter != null) {
                snsTimeLineBaseAdapter.getClass();
                SnsMethodCalculate.markStartTimeMs("onNotifyChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                snsTimeLineBaseAdapter.f278567a.mo133186F0("");
                SnsMethodCalculate.markEndTimeMs("onNotifyChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            }
            SnsMethodCalculate.markEndTimeMs("onNotifyData", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        }

        /* renamed from: t */
        public void mo132099t(View view) {
            SnsMethodCalculate.markStartTimeMs("onOpenIMTagClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            BaseTimeLine.this.f276692C.mo67375b();
            BaseTimeLine.this.f276715y.mo133671d();
            BaseTimeLine.this.f276716z.mo133177c();
            C43162z1 z1Var = BaseTimeLine.this.f276691B;
            z1Var.getClass();
            SnsMethodCalculate.markStartTimeMs("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            z1Var.f116772h = true;
            SnsMethodCalculate.markEndTimeMs("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            if (BaseTimeLine.this.mo132093o() == 0) {
                BaseTimeLine.this.f276691B.mo67389b(view, false, false);
            }
            SnsMethodCalculate.markEndTimeMs("onOpenIMTagClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        }

        /* renamed from: u */
        public void mo132100u(View view) {
            SnsMethodCalculate.markStartTimeMs("onOpenIMUnlikeClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            BaseTimeLine.this.f276691B.mo67390c();
            SnsMethodCalculate.markEndTimeMs("onOpenIMUnlikeClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        }

        /* renamed from: v */
        public void mo132101v(Object obj) {
            long j;
            SnsMethodCalculate.markStartTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            View view = (View) obj;
            Object tag = view.getTag();
            if (tag instanceof C96235u4) {
                C96235u4 u4Var = (C96235u4) tag;
                C98963o oVar = BaseTimeLine.this.f276699f;
                if (oVar != null) {
                    j = oVar.mo138306m(u4Var.f281206a, 6);
                    BaseTimeLine baseTimeLine = BaseTimeLine.this;
                    C96227t4 t4Var = baseTimeLine.f276711u;
                    C94895m2 m2Var = baseTimeLine.f276700g;
                    t4Var.getClass();
                    SnsMethodCalculate.markStartTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                    t4Var.mo133893d(view, 1, 0, m2Var, j, false, 0);
                    SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                    SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
                }
            }
            j = 0;
            BaseTimeLine baseTimeLine2 = BaseTimeLine.this;
            C96227t4 t4Var2 = baseTimeLine2.f276711u;
            C94895m2 m2Var2 = baseTimeLine2.f276700g;
            t4Var2.getClass();
            SnsMethodCalculate.markStartTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            t4Var2.mo133893d(view, 1, 0, m2Var2, j, false, 0);
            SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        }

        /* renamed from: w */
        public void mo132102w(View view) {
            SnsMethodCalculate.markStartTimeMs("onUnLickClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            BaseTimeLine.this.f276716z.mo133178d();
            SnsMethodCalculate.markEndTimeMs("onUnLickClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        }

        /* renamed from: x */
        public void mo132103x(View view) {
            SnsMethodCalculate.markStartTimeMs("onUnLikeFinish", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            BaseTimeLine.this.f276716z.mo133177c();
            if (view.getTag() != null) {
                C102244f fVar = (C102244f) view.getTag();
                BaseTimeLine.this.f276699f.mo138312s(fVar.f301108b, fVar.f301109c, fVar.f301110d, 1);
                try {
                    SnsInfo DN = C94866e1.Yx0().mo139798DN(fVar.f301109c);
                    if (DN != null) {
                        if (DN.isAd()) {
                            C102259p.m134829b(2, fVar.f301110d, DN.getAdInfo(), DN.getAdXml());
                        }
                    }
                    Log.m105920e("MicroMsg.TimelineClickListener", "reportAdFeedBackDel: info is null or not ad");
                    SnsMethodCalculate.markEndTimeMs("onUnLikeFinish", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
                    return;
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.TimelineClickListener", "reportAdFeedBackDel: " + th.toString());
                }
            }
            SnsMethodCalculate.markEndTimeMs("onUnLikeFinish", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        }

        /* renamed from: y */
        public void mo132104y(View view) {
            SnsMethodCalculate.markStartTimeMs("onUnLikeFinishError", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            BaseTimeLine.this.f276716z.mo133177c();
            SnsMethodCalculate.markEndTimeMs("onUnLikeFinishError", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        }

        /* renamed from: z */
        public void mo132105z(View view) {
            SnsMethodCalculate.markStartTimeMs("onUnLikeHelperClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            C43155u8 u8Var = BaseTimeLine.this.f276692C;
            if (u8Var != null) {
                u8Var.mo67375b();
            }
            C96104o8 o8Var = BaseTimeLine.this.f276715y;
            if (o8Var != null) {
                o8Var.mo133671d();
            }
            C43162z1 z1Var = BaseTimeLine.this.f276691B;
            if (z1Var != null) {
                z1Var.mo67390c();
            }
            C95733b bVar = BaseTimeLine.this.f276716z;
            if (bVar != null) {
                bVar.getClass();
                SnsMethodCalculate.markStartTimeMs("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
                bVar.f279217j = true;
                SnsMethodCalculate.markEndTimeMs("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
                BaseTimeLine.this.f276716z.mo133176b(view);
            }
            SnsMethodCalculate.markEndTimeMs("onUnLikeHelperClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.BaseTimeLine$b */
    public class C95326b implements SnsCommentFooter.C95535f {
        public C95326b() {
        }

        /* renamed from: a */
        public void mo132108a(String str, String str2) {
            C39622i0 a;
            SnsMethodCalculate.markStartTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$4");
            SnsInfo snsInfo = (SnsInfo) BaseTimeLine.this.f276708r.getTag();
            Log.m105918d("MicroMsg.BaseTimeLine", "onCommentSend click");
            if ((str == null || str.trim().equals("")) && Util.isNullOrNil(str2)) {
                Log.m105920e("MicroMsg.BaseTimeLine", "onCommentSend tosendText is null or empty");
                SnsMethodCalculate.markEndTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$4");
                return;
            }
            w64 commentInfo = BaseTimeLine.this.f276708r.getCommentInfo();
            SnsObject e = C94897n1.m120367e(snsInfo);
            if (C91998s.m115550d((commentInfo.f299709j == 0 && commentInfo.f299714r == 0) ? 708 : 709).f263361c == 708) {
                C102236a0.m134728W(snsInfo);
                int i = snsInfo.field_type;
                snsInfo.isAd();
                snsInfo.getUxinfo();
                int i2 = e.LikeCount;
            } else {
                C102236a0.m134728W(snsInfo);
                int i3 = snsInfo.field_type;
                snsInfo.isAd();
                snsInfo.getUxinfo();
                int i4 = e.LikeCount;
            }
            C94895m2 m2Var = BaseTimeLine.this.f276700g;
            if (m2Var != null) {
                SnsBrowseInfoHelper a2 = m2Var.mo130970a();
                a2.getClass();
                SnsMethodCalculate.markStartTimeMs("onCommentSendEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                if (snsInfo == null) {
                    SnsMethodCalculate.markEndTimeMs("onCommentSendEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                } else {
                    a2.f275392E0.add(snsInfo.getLocalid());
                    a2.f275386B0 = (long) a2.f275390D0.size();
                    a2.mo131336w(snsInfo);
                    SnsMethodCalculate.markEndTimeMs("onCommentSendEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                }
            }
            int commentFlag = BaseTimeLine.this.f276708r.getCommentFlag();
            Log.m105925i("MicroMsg.BaseTimeLine", "onCommentSend click %s", Integer.valueOf(commentFlag));
            if (C98242p.m126942d(commentFlag, 8)) {
                String substring = str.substring(BaseTimeLine.this.f276708r.getCommentAtPrefix().length());
                Log.m105924i("MicroMsg.BaseTimeLine", "send atFriend ad timeline comment");
                C5431p1.C5432a.m5344o(snsInfo, 16, substring, BaseTimeLine.this.f276708r.getCommentInfo(), commentFlag, 0, str2);
            } else {
                Log.m105924i("MicroMsg.BaseTimeLine", "send timeline comment");
                C5431p1.C5432a.m5344o(snsInfo, snsInfo.isAd() ? 8 : 2, str, BaseTimeLine.this.f276708r.getCommentInfo(), commentFlag, 0, str2);
            }
            BaseTimeLine baseTimeLine = BaseTimeLine.this;
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = baseTimeLine.f276707q;
            C96116p8 p8Var = baseTimeLine.f276710t;
            Runnable runnable = p8Var != null ? p8Var.f280740k : null;
            snsTimeLineBaseAdapter.getClass();
            SnsMethodCalculate.markStartTimeMs("doWhileSendComment", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            snsTimeLineBaseAdapter.f278567a.mo133186F0("");
            if (runnable != null) {
                ((C96116p8.C96117a) runnable).run();
            }
            SnsMethodCalculate.markEndTimeMs("doWhileSendComment", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            BaseTimeLine.this.mo132087i();
            if (Util.isNullOrNil(str2)) {
                BaseTimeLine baseTimeLine2 = BaseTimeLine.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                String str3 = baseTimeLine2.f276713w;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                if (!Util.isNullOrNil(str3)) {
                    Iterator<C96213s> it = BaseTimeLine.f276689H.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C96213s next = it.next();
                        BaseTimeLine baseTimeLine3 = BaseTimeLine.this;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                        String str4 = baseTimeLine3.f276713w;
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                        if (str4.equals(next.f281156a)) {
                            Log.m105918d("MicroMsg.BaseTimeLine", "remove ct");
                            ((LinkedList) BaseTimeLine.f276689H).remove(next);
                            break;
                        }
                    }
                }
            }
            if (snsInfo.isAd()) {
                C99567r.f291863a.mo138937a(snsInfo);
                if (snsInfo.isAdIpInteractVideo() && !C102260r.m134872l()) {
                    C102260r.m134854W();
                }
                if (snsInfo.isAdIpInteractVideo()) {
                    SnsMethodCalculate.markStartTimeMs("reportAction", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                    C100511m.f294465w.mo139986c(snsInfo, 3, 1);
                    SnsMethodCalculate.markEndTimeMs("reportAction", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                }
            }
            SnsReportHelper.f275506m0.mo131381n(C102236a0.m134765q0(snsInfo.field_snsId));
            snsInfo.field_withTa = System.currentTimeMillis() + "";
            Class cls = C60631e.class;
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (C60247c.class.isAssignableFrom(cls)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            StorageEventId update = StorageEventId.Companion.getUPDATE();
            SnsMethodCalculate.markStartTimeMs("postEvent", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            C87412m.m108594g(update, "eventID");
            C98214b bVar = new C98214b();
            bVar.convertFrom(snsInfo.convertTo(), true);
            String valueOf = String.valueOf(snsInfo.getPrimaryKeyValue());
            ((C98802d) ((C60631e) a).mo85233d3(C98802d.class)).getLogTag();
            StorageObserverEvent storageObserverEvent = new StorageObserverEvent(update, valueOf, "MicroMsg.Improve.DataFlow");
            storageObserverEvent.setObj(bVar);
            C102654l5.f302594Z.notify(storageObserverEvent);
            SnsMethodCalculate.markEndTimeMs("postEvent", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            SnsMethodCalculate.markEndTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.BaseTimeLine$c */
    public class C95327c implements MMEditText.C74949b {
        public C95327c() {
        }

        /* renamed from: a */
        public void mo65425a() {
            SnsMethodCalculate.markStartTimeMs("onBack", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$5");
            if (BaseTimeLine.this.f276708r.getVisibility() == 0) {
                BaseTimeLine.this.f276708r.setVisibility(8);
            } else {
                ((Activity) BaseTimeLine.m121427b(BaseTimeLine.this)).finish();
            }
            SnsMethodCalculate.markEndTimeMs("onBack", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.BaseTimeLine$d */
    public class C95328d implements Runnable {
        public C95328d() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$8");
            BaseTimeLine.this.f276708r.setToSendTextColor(true);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$8");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.BaseTimeLine$e */
    public class C95329e implements Runnable {
        public C95329e() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$9");
            BaseTimeLine.this.f276708r.setToSendTextColor(true);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$9");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.BaseTimeLine$f */
    public class C95330f implements View.OnClickListener {

        /* renamed from: d */
        public BaseTimeLineItem.BaseViewHolder f276729d;

        /* renamed from: e */
        public String f276730e;

        /* renamed from: f */
        public CharSequence f276731f;

        /* renamed from: g */
        public w64 f276732g;

        /* renamed from: com.tencent.mm.plugin.sns.ui.BaseTimeLine$f$a */
        public class C95331a implements View.OnCreateContextMenuListener {
            public C95331a() {
            }

            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener$1");
                if (C95330f.m121459a(C95330f.this) != null && !C98242p.m126942d(C95330f.m121459a(C95330f.this).f299716t, 64) && !C98242p.m126942d(C95330f.m121459a(C95330f.this).f299716t, 16)) {
                    contextMenu.add(0, 0, 0, BaseTimeLine.m121427b(BaseTimeLine.this).getString(C0966R.string.f7936wt));
                }
                contextMenu.add(1, 1, 0, BaseTimeLine.m121427b(BaseTimeLine.this).getString(C0966R.string.f7944x1));
                SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.BaseTimeLine$f$b */
        public class C95332b implements C11184p0 {

            /* renamed from: com.tencent.mm.plugin.sns.ui.BaseTimeLine$f$b$a */
            public class C95333a implements DialogInterface.OnCancelListener {

                /* renamed from: d */
                public final /* synthetic */ C94877g0 f276736d;

                public C95333a(C95332b bVar, C94877g0 g0Var) {
                    this.f276736d = g0Var;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener$2$1");
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123458d(this.f276736d);
                    SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener$2$1");
                }
            }

            public C95332b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                String str;
                SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener$2");
                int itemId = menuItem.getItemId();
                int i2 = 4;
                if (itemId == 0) {
                    C95330f fVar = C95330f.this;
                    SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
                    CharSequence charSequence = fVar.f276731f;
                    SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
                    if (ClipboardHelper.setTextSwallowException(charSequence)) {
                        C76879j.m92726T(BaseTimeLine.m121427b(BaseTimeLine.this), BaseTimeLine.m121427b(BaseTimeLine.this).getString(C0966R.string.f7938wv));
                        if (C95330f.m121459a(C95330f.this) != null) {
                            String unsignedLongString = Util.getUnsignedLongString(C100417r0.m131425n(C95330f.m121460b(C95330f.this).f279950d));
                            C95330f fVar2 = C95330f.this;
                            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
                            CharSequence charSequence2 = fVar2.f276731f;
                            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
                            C46562a.INSTANCE.F80(4, unsignedLongString + XVFSFile.PATH_SEPARATOR + C95330f.m121459a(C95330f.this).f299709j, Util.getUTF8ByteLength(charSequence2.toString()));
                        }
                    } else {
                        C76879j.m92726T(BaseTimeLine.m121427b(BaseTimeLine.this), BaseTimeLine.m121427b(BaseTimeLine.this).getString(C0966R.string.f7937wu));
                    }
                } else if (itemId == 1) {
                    Log.m105920e("MicroMsg.BaseTimeLine", "del snsId:" + C95330f.m121460b(C95330f.this).f279950d + " commentId:" + C95330f.m121459a(C95330f.this));
                    long n = C100417r0.m131425n(C95330f.m121460b(C95330f.this).f279950d);
                    if (C100417r0.m131416e(C95330f.m121460b(C95330f.this).f279950d)) {
                        i2 = 6;
                    }
                    C94877g0 g0Var = new C94877g0(n, i2, C95330f.m121459a(C95330f.this));
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(g0Var);
                    BaseTimeLine baseTimeLine = BaseTimeLine.this;
                    baseTimeLine.f276694E = C76879j.m92723Q(BaseTimeLine.m121427b(baseTimeLine), BaseTimeLine.m121427b(BaseTimeLine.this).getString(C0966R.string.a3h), BaseTimeLine.m121427b(BaseTimeLine.this).getString(C0966R.string.jbm), true, true, new C95333a(this, g0Var));
                    int i3 = 0;
                    if (C95330f.m121459a(C95330f.this) != null) {
                        i3 = C95330f.m121459a(C95330f.this).f299709j;
                        str = C95330f.m121459a(C95330f.this).f299703d;
                    } else {
                        str = "";
                    }
                    SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
                    SnsObject snsObject = C95330f.m121460b(C95330f.this).snsobj;
                    snsReportHelper.getClass();
                    SnsMethodCalculate.markStartTimeMs("reportCommentDelete", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                    if (snsObject != null) {
                        int i4 = Util.isEqual(snsObject.Username, C75592q0.m90789s()) ? Util.isEqual(str, C75592q0.m90789s()) ? 2 : 3 : 1;
                        int i5 = snsObject.CommentCount;
                        int i6 = snsObject.LikeCount;
                        SnsFeedOwnerDeleteCommentReportStruct snsFeedOwnerDeleteCommentReportStruct = new SnsFeedOwnerDeleteCommentReportStruct();
                        snsFeedOwnerDeleteCommentReportStruct.f266036d = snsFeedOwnerDeleteCommentReportStruct.mo86045b("PublishId", C102236a0.m134763p0(snsObject.f283891Id), true);
                        snsFeedOwnerDeleteCommentReportStruct.f266038f = snsFeedOwnerDeleteCommentReportStruct.mo86045b("CommentId", String.valueOf(i3), true);
                        snsFeedOwnerDeleteCommentReportStruct.f266039g = i4;
                        snsFeedOwnerDeleteCommentReportStruct.f266037e = snsFeedOwnerDeleteCommentReportStruct.mo86045b("FriendUsername", str, true);
                        snsFeedOwnerDeleteCommentReportStruct.f266042j = 1;
                        snsFeedOwnerDeleteCommentReportStruct.f266040h = (long) i6;
                        snsFeedOwnerDeleteCommentReportStruct.f266041i = (long) i5;
                        snsFeedOwnerDeleteCommentReportStruct.mo86054n();
                    }
                    SnsMethodCalculate.markEndTimeMs("reportCommentDelete", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                }
                SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener$2");
            }
        }

        public C95330f(w64 w64, String str, CharSequence charSequence, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
            this.f276730e = str;
            this.f276732g = w64;
            this.f276729d = baseViewHolder;
            this.f276731f = charSequence;
        }

        /* renamed from: a */
        public static /* synthetic */ w64 m121459a(C95330f fVar) {
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            w64 w64 = fVar.f276732g;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            return w64;
        }

        /* renamed from: b */
        public static /* synthetic */ BaseTimeLineItem.BaseViewHolder m121460b(C95330f fVar) {
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            BaseTimeLineItem.BaseViewHolder baseViewHolder = fVar.f276729d;
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            return baseViewHolder;
        }

        public void onClick(View view) {
            String str;
            String str2;
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            if (!C100417r0.m131419h(this.f276729d.f279950d)) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            this.f276729d.f279928K = view2;
            w64 w64 = this.f276732g;
            if (w64 == null || (str2 = w64.f299703d) == null || !str2.equals(BaseTimeLine.this.f276714x)) {
                new SnsInfo();
                SnsInfo i = BaseTimeLine.this.f276707q.mo132919i(this.f276729d.f279948c);
                if (i.isInValid()) {
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                } else if (!C92086h.m115754a(i)) {
                    C45199a.m50003a(this.f276729d.f279936S.getContext(), this.f276729d.f279936S.mo132426b(0));
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                } else {
                    C91998s.m115550d(742);
                    C94897n1.m120367e(i);
                    C102236a0.m134728W(i);
                    i.isAd();
                    i.getUxinfo();
                    if (this.f276732g.f299709j == 0) {
                        long j = this.f276732g.f299714r;
                    } else {
                        int i2 = this.f276732g.f299709j;
                    }
                    String str3 = this.f276732g.f299703d;
                    BaseTimeLine baseTimeLine = BaseTimeLine.this;
                    BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f276729d;
                    String str4 = BaseTimeLine.m121427b(BaseTimeLine.this).getString(C0966R.string.jgh) + this.f276730e;
                    w64 w642 = this.f276732g;
                    baseTimeLine.getClass();
                    SnsMethodCalculate.markStartTimeMs("performCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                    String str5 = baseViewHolder.f279950d + str4;
                    baseTimeLine.f276713w = str5;
                    Log.m105924i("MicroMsg.BaseTimeLine", "[performCommentClick] onCommentClick:  commentkey " + baseTimeLine.f276713w + " " + baseViewHolder.f279950d + " position:" + baseViewHolder.f279948c);
                    baseTimeLine.f276708r.setTag(i);
                    baseTimeLine.mo132084f();
                    baseTimeLine.f276708r.setVisibility(0);
                    baseTimeLine.f276708r.mo132719x(baseTimeLine.mo132083e(str5, 0));
                    baseTimeLine.f276708r.setCommentHint(str4 + baseTimeLine.f276697d.getString(C0966R.string.jan));
                    baseTimeLine.f276708r.setSnsInfo(i);
                    if (i.isAd() && w642 != null && (str = w642.f299703d) != null && str.equals(i.getUserName())) {
                        baseTimeLine.f276708r.mo132719x(baseTimeLine.mo132083e(str5, 1));
                    }
                    baseTimeLine.mo132081c(i);
                    baseTimeLine.f276708r.setCommentInfo(w642);
                    baseTimeLine.f276708r.mo132679A(BaseTimeLine.f276689H, str5);
                    baseTimeLine.f276708r.post(new C96086o(baseTimeLine));
                    baseTimeLine.f276708r.mo132680B(false);
                    baseTimeLine.mo132091m(baseViewHolder);
                    if (baseTimeLine.f276708r.mo132699r()) {
                        C115669n.INSTANCE.mo175911u(150, 80);
                    }
                    SnsMethodCalculate.markEndTimeMs("performCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            } else {
                BaseTimeLine baseTimeLine2 = BaseTimeLine.this;
                C96116p8 p8Var = baseTimeLine2.f276710t;
                if (p8Var != null && p8Var.f280736g) {
                    baseTimeLine2.mo132087i();
                    BaseTimeLine.this.f276710t.f280736g = false;
                }
                C78253a aVar = new C78253a(BaseTimeLine.m121427b(BaseTimeLine.this));
                C95331a aVar2 = new C95331a();
                C95332b bVar = new C95332b();
                int[] iArr = new int[2];
                if (view2.getTag(C0966R.C0970id.f359414kt0) instanceof int[]) {
                    iArr = (int[]) view2.getTag(C0966R.C0970id.f359414kt0);
                }
                aVar.mo108273h(view, aVar2, bVar, iArr[0], iArr[1]);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.BaseTimeLine$g */
    public interface C95334g {
    }

    public BaseTimeLine(Context context, int i, String str, int i2, String str2) {
        Class cls = C32735h.class;
        this.f276706p = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_timeline_item_mask, true);
        this.f276712v = false;
        this.f276713w = "";
        this.f276694E = null;
        C40008f fVar = C40008f.f107254d;
        this.f276695F = new IListener<CloseSnsCommentViewEvent>(fVar) {
            {
                this.__eventId = -879166970;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$2");
                CloseSnsCommentViewEvent closeSnsCommentViewEvent = (CloseSnsCommentViewEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$2");
                C96104o8 o8Var = BaseTimeLine.this.f276715y;
                if (o8Var != null) {
                    o8Var.mo133671d();
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$2");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$2");
                return false;
            }
        };
        this.f276696G = new IListener<SnsAdListScrollEvent>(fVar) {
            {
                this.__eventId = 574649668;
            }

            public boolean callback(IEvent iEvent) {
                ListView listView;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$3");
                SnsAdListScrollEvent snsAdListScrollEvent = (SnsAdListScrollEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$3");
                if ((snsAdListScrollEvent instanceof SnsAdListScrollEvent) && (listView = BaseTimeLine.this.f276698e) != null) {
                    listView.requestDisallowInterceptTouchEvent(!snsAdListScrollEvent.f265121d.f265122a);
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$3");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$3");
                return false;
            }
        };
        SnsMethodCalculate.markStartTimeMs("useNew", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_USE_NEW_GALLERY_FOOTER_INT_SYNC, 0);
        if ((j == 0 ? ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_enhance_like_gallery, 2) : j) == 1) {
            this.f276705o = false;
        } else {
            this.f276705o = true;
        }
        SnsMethodCalculate.markEndTimeMs("useNew", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        this.f276697d = context;
        this.f276714x = C75592q0.m90789s();
        C94895m2 m2Var = new C94895m2(1);
        this.f276700g = m2Var;
        SnsBrowseInfoHelper snsBrowseInfoHelper = new SnsBrowseInfoHelper();
        snsBrowseInfoHelper.f275483s0 = i;
        snsBrowseInfoHelper.f275485t0 = str;
        snsBrowseInfoHelper.f275487u0 = i2;
        snsBrowseInfoHelper.f275489v0 = str2;
        SnsMethodCalculate.markStartTimeMs("buildBrowseInfoHelper", "com.tencent.mm.plugin.sns.model.TimelineContext");
        m2Var.f274986a = snsBrowseInfoHelper;
        SnsMethodCalculate.markEndTimeMs("buildBrowseInfoHelper", "com.tencent.mm.plugin.sns.model.TimelineContext");
        C95323a aVar = new C95323a(0, (Activity) context, this.f276700g);
        this.f276693D = aVar;
        SnsMethodCalculate.markStartTimeMs("addListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        aVar.f280381k.mo133553a();
        aVar.f280368X.alive();
        aVar.f280369Y.alive();
        SnsMethodCalculate.markEndTimeMs("addListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        this.f276695F.alive();
        this.f276696G.alive();
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m121426a(BaseTimeLine baseTimeLine, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        baseTimeLine.f276702i = z;
        SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        return z;
    }

    /* renamed from: b */
    public static /* synthetic */ Context m121427b(BaseTimeLine baseTimeLine) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        Context context = baseTimeLine.f276697d;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        return context;
    }

    /* renamed from: b7 */
    public C95733b mo67325b7() {
        SnsMethodCalculate.markStartTimeMs("getAdNotLikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        C95733b bVar = this.f276716z;
        SnsMethodCalculate.markEndTimeMs("getAdNotLikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        return bVar;
    }

    /* renamed from: c */
    public final void mo132081c(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("checkFeedCommentEmojiEnable", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        if (snsInfo == null || snsInfo.getTimeLine() == null || snsInfo.getTimeLine().ContentObj == null) {
            this.f276708r.setFeedEmojiCommentEnable(false);
        } else if ((snsInfo.getTimeLine().ContentObj.f298428i & 128) != 0) {
            this.f276708r.setFeedEmojiCommentEnable(false);
        } else {
            this.f276708r.setFeedEmojiCommentEnable(true);
        }
        SnsMethodCalculate.markEndTimeMs("checkFeedCommentEmojiEnable", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    /* renamed from: d */
    public void mo132082d() {
        SnsMethodCalculate.markStartTimeMs("clean", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        TimelineClickListener timelineClickListener = this.f276693D;
        timelineClickListener.getClass();
        SnsMethodCalculate.markStartTimeMs("removeListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        timelineClickListener.f280381k.mo133564l();
        timelineClickListener.f280368X.dead();
        timelineClickListener.f280369Y.dead();
        SnsMethodCalculate.markEndTimeMs("removeListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        SnsCommentFooter snsCommentFooter = this.f276708r;
        if (snsCommentFooter != null) {
            snsCommentFooter.mo132717v();
        }
        this.f276695F.dead();
        this.f276696G.dead();
        SnsMethodCalculate.markEndTimeMs("clean", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    /* renamed from: e */
    public final int mo132083e(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("genCommentFlag", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        Iterator<C96213s> it = f276689H.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C96213s next = it.next();
            if (Util.isEqual(next.f281156a, str)) {
                i = next.f281158c;
                break;
            }
        }
        SnsMethodCalculate.markEndTimeMs("genCommentFlag", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        return i;
    }

    /* renamed from: f */
    public final void mo132084f() {
        SnsMethodCalculate.markStartTimeMs("initComment", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        if (this.f276712v) {
            SnsMethodCalculate.markEndTimeMs("initComment", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            return;
        }
        this.f276712v = true;
        C96116p8 p8Var = this.f276710t;
        if (p8Var != null) {
            this.f276708r.setAfterEditAction(p8Var.f280740k);
        }
        this.f276708r.setOnCommentSendImp(new C95326b());
        SnsCommentFooter snsCommentFooter = this.f276708r;
        C95327c cVar = new C95327c();
        snsCommentFooter.getClass();
        SnsMethodCalculate.markStartTimeMs("setBackKeyListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        C74974a aVar = snsCommentFooter.f278052h;
        if (aVar != null) {
            aVar.setBackListener(cVar);
            SnsMethodCalculate.markEndTimeMs("setBackKeyListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        } else {
            SnsMethodCalculate.markEndTimeMs("setBackKeyListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        }
        SnsMethodCalculate.markEndTimeMs("initComment", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    /* renamed from: g */
    public final boolean mo132085g(C52156yq3 yq32) {
        SnsMethodCalculate.markStartTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        if (yq32 == null) {
            Log.m105928w("MicroMsg.BaseTimeLine", "isRemindInfoValid called with: remindInfo = [null]");
            SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            return false;
        } else if (yq32.f145465d == 0 && yq32.f145470i == 0) {
            Log.m105928w("MicroMsg.BaseTimeLine", "isRemindInfoValid called with: remindInfo.ADGroupId = [" + yq32.f145465d + "] remindInfo.ADGroupId64 = [" + yq32.f145470i + "]");
            SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            return false;
        } else {
            C51018qv3 qv32 = yq32.f145468g;
            if (qv32 == null || !qv32.f140575g) {
                Log.m105928w("MicroMsg.BaseTimeLine", "isRemindInfoValid called with: paidInfo is blank!");
                SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                return false;
            }
            C51018qv3 qv33 = yq32.f145469h;
            if (qv33 == null || !qv33.f140575g) {
                Log.m105928w("MicroMsg.BaseTimeLine", "isRemindInfoValid called with: extraInfo is blank!");
                SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                return false;
            }
            SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            return true;
        }
    }

    /* renamed from: h */
    public void mo132086h() {
        SnsMethodCalculate.markStartTimeMs("onKeyBoardUp", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        if (this.f276701h) {
            Log.m105918d("MicroMsg.BaseTimeLine", "onKeyBoardUp: ");
            this.f276701h = false;
            this.f276710t.mo133680e();
        }
        SnsMethodCalculate.markEndTimeMs("onKeyBoardUp", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    /* renamed from: h4 */
    public C96104o8 mo67326h4() {
        SnsMethodCalculate.markStartTimeMs("getTimeLineCommentHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        C96104o8 o8Var = this.f276715y;
        SnsMethodCalculate.markEndTimeMs("getTimeLineCommentHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        return o8Var;
    }

    /* renamed from: i */
    public void mo132087i() {
        SnsMethodCalculate.markStartTimeMs("onTouchIdleArea", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        if (!this.f276712v) {
            SnsMethodCalculate.markEndTimeMs("onTouchIdleArea", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            return;
        }
        if (this.f276708r.getVisibility() != 8) {
            this.f276708r.setVisibility(8);
        }
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f276707q;
        snsTimeLineBaseAdapter.getClass();
        SnsMethodCalculate.markStartTimeMs("hideContainer", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        View view = snsTimeLineBaseAdapter.f278574h;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter", "hideContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter", "hideContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        snsTimeLineBaseAdapter.f278574h = null;
        SnsMethodCalculate.markEndTimeMs("hideContainer", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        SnsMethodCalculate.markEndTimeMs("onTouchIdleArea", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x01bd  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo132088j() {
        /*
            r20 = this;
            java.lang.String r0 = "onUnreadTipClick"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.BaseTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = r20
            com.tencent.mm.plugin.sns.ui.BaseTimeLine$g r3 = r2.f276703j
            if (r3 == 0) goto L_0x02c7
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$t r3 = (com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI$$t) r3
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$39"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 1295(0x50f, float:1.815E-42)
            r7 = 2
            r5.mo175911u(r6, r7)
            com.tencent.mm.plugin.sns.model.y1 r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            r9.getClass()
            java.lang.String r5 = "doReportClick"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            boolean r8 = r9.f275347b
            if (r8 != 0) goto L_0x0033
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            goto L_0x004e
        L_0x0033:
            ms2.n r10 = r9.f275367v
            long r12 = r9.f275338B
            java.lang.String r14 = r9.f275337A
            int r15 = r9.f275356k
            ms2.m r11 = r9.f275366u
            com.tencent.mm.sdk.platformtools.MMHandler r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.my0()
            com.tencent.mm.plugin.sns.model.c2 r7 = new com.tencent.mm.plugin.sns.model.c2
            r2 = r8
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r14, r15)
            r2.post(r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
        L_0x004e:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r2 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineMissReadJumpBtnExposureStruct r2 = r2.mo131345F()
            r7 = 1
            r2.f266419l = r7
            com.tencent.mm.plugin.sns.model.y1 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            r2.getClass()
            java.lang.String r5 = "getRightIndex"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            ms2.n r7 = r2.f275367v
            boolean r7 = r2.mo131309j(r7)
            r8 = -1
            if (r7 == 0) goto L_0x009a
            java.util.Map<java.lang.Long, java.lang.Integer> r7 = r2.f275357l
            ms2.n r9 = r2.f275367v
            java.util.LinkedList<java.lang.Long> r9 = r9.f292916d
            java.lang.Object r9 = r9.peek()
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.Object r7 = r7.get(r9)
            if (r7 != 0) goto L_0x0080
            goto L_0x009a
        L_0x0080:
            java.util.Map<java.lang.Long, java.lang.Integer> r7 = r2.f275357l
            ms2.n r2 = r2.f275367v
            java.util.LinkedList<java.lang.Long> r2 = r2.f292916d
            java.lang.Object r2 = r2.peek()
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.Object r2 = r7.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            goto L_0x009e
        L_0x009a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            r2 = -1
        L_0x009e:
            com.tencent.mm.plugin.sns.model.y1 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            r5.getClass()
            java.lang.String r7 = "getTargetSize"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
            ms2.n r9 = r5.f275367v
            boolean r9 = r5.mo131309j(r9)
            r10 = 0
            if (r9 != 0) goto L_0x00b8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            r5 = 0
            goto L_0x00c3
        L_0x00b8:
            ms2.n r5 = r5.f275367v
            java.util.LinkedList<java.lang.Long> r5 = r5.f292916d
            int r5 = r5.size()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
        L_0x00c3:
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r7[r10] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r11 = 1
            r7[r11] = r9
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r9 = r3.f278782a
            ft2.c r9 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r9)
            int r9 = r9.getCount()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12 = 2
            r7[r12] = r9
            java.lang.String r9 = "MicroMsg.SnsTimeLineUI"
            java.lang.String r12 = "rightIndex:%s, targetSize:%s, adapter.count:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r7)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r7 = r3.f278782a
            java.lang.String r9 = "access$4500"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r12)
            android.view.ViewGroup r7 = r7.f278697x0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r12)
            r9 = 4
            r7.setVisibility(r9)
            java.lang.String r7 = "updateTargetState"
            if (r2 == r8) goto L_0x01bd
            int r5 = r5 + r2
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r8 = r3.f278782a
            ft2.c r8 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r8)
            int r8 = r8.getCount()
            if (r5 >= r8) goto L_0x01bd
            com.tencent.mm.plugin.sns.model.y1 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            r5.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
            ms2.n r5 = r5.f275367v
            if (r5 == 0) goto L_0x0121
            r8 = 2
            r5.f292918f = r8
        L_0x0121:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            com.tencent.mm.plugin.sns.model.y1 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            r6 = 0
            r5.f275361p = r6
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r5 = r3.f278782a
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131167221(0x7f0707f5, float:1.794871E38)
            int r5 = r5.getDimensionPixelSize(r6)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r6 = r3.f278782a
            androidx.appcompat.app.AppCompatActivity r6 = r6.getContext()
            int r6 = com.tencent.p014mm.p136ui.C75044y4.m89989a(r6)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r7 = r3.f278782a
            androidx.appcompat.app.AppCompatActivity r7 = r7.getContext()
            int r7 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r7)
            int r6 = r6 + r7
            int r6 = r6 - r5
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r5 = r3.f278782a
            com.tencent.mm.plugin.sns.ui.SnsUIAction r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122302d8(r5)
            android.widget.ListView r5 = r5.getSnsListView()
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r3 = r3.f278782a
            com.tencent.mm.plugin.sns.ui.SnsUIAction r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122302d8(r3)
            android.widget.ListView r3 = r3.getSnsListView()
            int r3 = r3.getHeaderViewsCount()
            int r2 = r2 + r3
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.mo10233c(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r2)
            java.lang.Object[] r13 = r3.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$39"
            java.lang.String r15 = "onUnreadTipClick"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "Undefined"
            java.lang.String r18 = "smoothScrollToPositionFromTop"
            java.lang.String r19 = "(II)V"
            r12 = r5
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r3.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r3 = r3.mo10231a(r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r5.smoothScrollToPositionFromTop(r2, r3)
            java.lang.String r13 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$39"
            java.lang.String r14 = "onUnreadTipClick"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "smoothScrollToPositionFromTop"
            java.lang.String r18 = "(II)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x02c4
        L_0x01bd:
            com.tencent.mm.plugin.sns.model.y1 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            boolean r2 = r2.f275364s
            if (r2 != 0) goto L_0x02c4
            com.tencent.mm.plugin.sns.model.y1 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            r2.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
            ms2.n r2 = r2.f275367v
            if (r2 == 0) goto L_0x01d6
            r5 = 2
            r2.f292918f = r5
        L_0x01d6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            com.tencent.mm.plugin.sns.model.y1 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            r2.f275364s = r11
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r2 = r3.f278782a
            ft2.c r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r2)
            ht2.b r2 = r2.mo137295j()
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r5 = r3.f278782a
            ft2.c r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r5)
            long r5 = r5.mo137294i()
            java.lang.String r5 = vr2.C102236a0.m134763p0(r5)
            r2.mo137879s(r5)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r2 = r3.f278782a
            ft2.c r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r2)
            ht2.b r2 = r2.mo137295j()
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r5 = r3.f278782a
            ft2.c r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r5)
            long r5 = r5.mo137293h(r10)
            java.lang.String r5 = vr2.C102236a0.m134763p0(r5)
            r2.mo137880t(r5)
            com.tencent.mm.plugin.sns.model.y1 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            com.tencent.mm.plugin.sns.model.y1 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            long r5 = r5.mo131306g()
            r2.f275361p = r5
            com.tencent.mm.plugin.sns.model.p1$a r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.dy0()
            com.tencent.mm.plugin.sns.model.y1 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            long r5 = r5.mo131306g()
            r2.mo6420q(r5)
            com.tencent.mm.plugin.sns.model.y1 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            r2.f275362q = r10
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r2 = r3.f278782a
            com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122302d8(r2)
            android.widget.ListView r2 = r2.getSnsListView()
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r5 = r3.f278782a
            ft2.c r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r5)
            int r5 = r5.getCount()
            int r5 = r5 - r11
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r6 = r3.f278782a
            com.tencent.mm.plugin.sns.ui.SnsUIAction r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122302d8(r6)
            android.widget.ListView r6 = r6.getSnsListView()
            int r6 = r6.getHeaderViewsCount()
            int r5 = r5 + r6
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.mo10233c(r5)
            java.lang.Object[] r13 = r6.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$39"
            java.lang.String r15 = "onUnreadTipClick"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "Undefined"
            java.lang.String r18 = "smoothScrollToPosition"
            java.lang.String r19 = "(I)V"
            r12 = r2
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r5 = r6.mo10231a(r10)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.smoothScrollToPosition(r5)
            java.lang.String r13 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$39"
            java.lang.String r14 = "onUnreadTipClick"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "smoothScrollToPosition"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r2 = r3.f278782a
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122284L7(r2)
            if (r2 == 0) goto L_0x02c4
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r2 = r3.f278782a
            android.os.Handler r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122294V7(r2)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r5 = r3.f278782a
            java.lang.Runnable r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122295W7(r5)
            r2.removeCallbacks(r5)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r2 = r3.f278782a
            android.os.Handler r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122294V7(r2)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r3 = r3.f278782a
            java.lang.Runnable r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122295W7(r3)
            r2.post(r3)
        L_0x02c4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
        L_0x02c7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine.mo132088j():void");
    }

    /* renamed from: k */
    public void mo132089k(BaseTimeLineItem.BaseViewHolder baseViewHolder, SnsInfo snsInfo, w64 w64) {
        SnsMethodCalculate.markStartTimeMs("performAdAtFriendClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        this.f276713w = null;
        Log.m105924i("MicroMsg.BaseTimeLine", "[performAdAtFriendClick] onCommentClick:  commentkey " + this.f276713w + " " + baseViewHolder.f279950d + " position:" + baseViewHolder.f279948c);
        mo132081c(snsInfo);
        this.f276708r.setTag(snsInfo);
        mo132084f();
        boolean z = false;
        this.f276708r.setVisibility(0);
        this.f276708r.mo132719x(0);
        this.f276708r.setCommentHint("");
        this.f276708r.setCommentInfo(w64);
        this.f276708r.setSnsInfo(snsInfo);
        SnsMethodCalculate.markStartTimeMs("isAtBtnVisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        if (C79618h.f233472d == 1) {
            SnsMethodCalculate.markEndTimeMs("isAtBtnVisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            z = true;
        } else if (snsInfo == null) {
            Log.m105928w("MicroMsg.BaseTimeLine", "isAtBtnVisible called with: snsInfo = [null]");
            SnsMethodCalculate.markEndTimeMs("isAtBtnVisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        } else {
            AdSnsInfo adSnsInfo = snsInfo.getAdSnsInfo();
            if (adSnsInfo == null) {
                Log.m105928w("MicroMsg.BaseTimeLine", "isAtBtnVisible called with: adSnsInfo = [null]");
                SnsMethodCalculate.markEndTimeMs("isAtBtnVisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            } else {
                C50903q2 remindInfoGroup = adSnsInfo.getRemindInfoGroup();
                if (remindInfoGroup == null) {
                    Log.m105928w("MicroMsg.BaseTimeLine", "isAtBtnVisible called with: remindInfoGroup = [null]");
                    SnsMethodCalculate.markEndTimeMs("isAtBtnVisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                } else {
                    if (mo132085g(remindInfoGroup.f140095d) || mo132085g(remindInfoGroup.f140096e)) {
                        z = true;
                    }
                    SnsMethodCalculate.markEndTimeMs("isAtBtnVisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                }
            }
        }
        this.f276708r.mo132680B(z);
        this.f276708r.mo132679A(f276689H, "");
        this.f276708r.post(new C95328d());
        mo132091m(baseViewHolder);
        if (this.f276708r.mo132699r()) {
            C115669n.INSTANCE.mo175911u(150, 80);
        }
        SnsMethodCalculate.markEndTimeMs("performAdAtFriendClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    /* renamed from: l */
    public void mo132090l(BaseTimeLineItem.BaseViewHolder baseViewHolder, SnsInfo snsInfo, w64 w64) {
        SnsMethodCalculate.markStartTimeMs("performCommentIconClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        String str = baseViewHolder.f279950d;
        this.f276713w = str;
        Log.m105924i("MicroMsg.BaseTimeLine", "[performCommentIconClick] onCommentClick:  commentkey " + this.f276713w + " " + baseViewHolder.f279950d + " position:" + baseViewHolder.f279948c);
        mo132081c(snsInfo);
        this.f276708r.setTag(snsInfo);
        mo132084f();
        this.f276708r.setVisibility(0);
        this.f276708r.mo132719x(mo132083e(str, 0));
        this.f276708r.setCommentInfo(w64);
        this.f276708r.setSnsInfo(snsInfo);
        snsInfo.getTimeLine();
        this.f276708r.setCommentHint(this.f276697d.getString(C0966R.string.jjl));
        this.f276708r.mo132679A(f276689H, str);
        this.f276708r.post(new C95329e());
        this.f276708r.mo132680B(false);
        mo132091m(baseViewHolder);
        if (this.f276708r.mo132699r()) {
            C115669n.INSTANCE.mo175911u(150, 80);
        }
        SnsMethodCalculate.markEndTimeMs("performCommentIconClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    /* renamed from: m */
    public final void mo132091m(BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        int i;
        SnsMethodCalculate.markStartTimeMs("scrollComment", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        int b = C76577a.m92151b(this.f276697d, 8);
        if (baseViewHolder.f279928K != null) {
            i = (baseViewHolder.f279933P.getHeight() - baseViewHolder.f279928K.getBottom()) + b;
            Log.m105924i("MicroMsg.BaseTimeLine", "comment item bottom = " + baseViewHolder.f279928K.getBottom());
        } else {
            i = 0;
        }
        C96116p8 p8Var = this.f276710t;
        if (p8Var != null) {
            p8Var.f280730a = baseViewHolder.f279948c;
            p8Var.f280731b = baseViewHolder.f279960i.getHeight() - i;
            baseViewHolder.f279928K = null;
            this.f276710t.f280732c = baseViewHolder.f279960i.getTop();
            this.f276710t.f280733d = this.f276698e.getBottom();
            Log.m105920e("MicroMsg.BaseTimeLine", "originalTop:" + this.f276710t.f280732c);
            SnsMethodCalculate.markStartTimeMs("scrollToKeyBoard", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            Context context = this.f276697d;
            if (!(context instanceof MMActivity)) {
                this.f276710t.mo133680e();
            } else if (((MMActivity) context).keyboardState() == 1) {
                Log.m105918d("MicroMsg.BaseTimeLine", "scrollToKeyBoard: scrollUp2");
                this.f276710t.mo133680e();
            } else {
                Log.m105918d("MicroMsg.BaseTimeLine", "scrollToKeyBoard: waitForKeyBoardUp");
                this.f276701h = true;
            }
            SnsMethodCalculate.markEndTimeMs("scrollToKeyBoard", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        } else {
            SnsInputScrollEvent snsInputScrollEvent = new SnsInputScrollEvent();
            View view = baseViewHolder.f279928K;
            if (view != null) {
                snsInputScrollEvent.f265161d.f265162a = view;
            } else {
                snsInputScrollEvent.f265161d.f265162a = baseViewHolder.f279960i;
            }
            snsInputScrollEvent.f265161d.f265163b = this.f276708r;
            snsInputScrollEvent.publish();
        }
        SnsMethodCalculate.markEndTimeMs("scrollComment", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    /* renamed from: n */
    public void mo132092n(C98963o oVar) {
        SnsMethodCalculate.markStartTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        this.f276699f = oVar;
        TimelineClickListener timelineClickListener = this.f276693D;
        if (timelineClickListener != null) {
            timelineClickListener.mo133543G(oVar);
        }
        SnsMethodCalculate.markEndTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    /* renamed from: o */
    public int mo132093o() {
        SnsMethodCalculate.markStartTimeMs("timelineScene", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        SnsMethodCalculate.markEndTimeMs("timelineScene", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        return 0;
    }

    /* renamed from: p */
    public boolean mo132094p() {
        SnsMethodCalculate.markStartTimeMs("useWrapper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        Log.m105924i("MicroMsg.BaseTimeLine", "BaseTimeLine useWrapper() = " + this.f276706p);
        boolean z = this.f276706p;
        SnsMethodCalculate.markEndTimeMs("useWrapper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        return z;
    }

    /* renamed from: w2 */
    public C43155u8 mo67327w2() {
        SnsMethodCalculate.markStartTimeMs("getTimelineEmojiInfoHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        C43155u8 u8Var = this.f276692C;
        SnsMethodCalculate.markEndTimeMs("getTimelineEmojiInfoHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        return u8Var;
    }

    /* renamed from: z6 */
    public C43162z1 mo67328z6() {
        SnsMethodCalculate.markStartTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        C43162z1 z1Var = this.f276691B;
        SnsMethodCalculate.markEndTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        return z1Var;
    }
}
