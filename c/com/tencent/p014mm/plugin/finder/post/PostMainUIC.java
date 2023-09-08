package com.tencent.p014mm.plugin.finder.post;

import a14.C53934p0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import ao1.C0140b1;
import ao1.C0192y;
import ao1.C0196z0;
import ao1.C54262a1;
import ao1.C54263c1;
import ao1.C54264e;
import ao1.C54265f;
import ao1.C54267j0;
import ao1.C54269l0;
import ao1.C54270m1;
import ao1.C54271n0;
import ao1.C54273o0;
import ao1.C54276s0;
import ao1.C54277t;
import bd1.C54446b;
import bl3.C0317e;
import bl3.C39818r;
import bt1.C54556b;
import bt1.C54563e;
import bt1.C54564g;
import bt1.C54585t;
import bt1.C54590w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPageExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPostPageDeleteStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct;
import com.tencent.p014mm.cache.ArtistCacheManager;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.modelbiz.WXChannelShareVideo;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.C7021t1;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.utils.LocalFinderAtContactParcel;
import com.tencent.p014mm.plugin.finder.view.FinderExtendActivityView;
import com.tencent.p014mm.plugin.finder.view.FinderPostFooter;
import com.tencent.p014mm.plugin.finder.view.FinderPostOriginView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.protocal.protobuf.MiniAppInfo;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tmassistantsdk.storage.table.ClientInfoTable;
import dd3.C58256b;
import di3.C7335d;
import di3.C86312j;
import dp1.C58408t0;
import dp1.C58412u0;
import dp1.C58417y0;
import dr1.C58426v;
import dr1.C7470a;
import dr1.C7493o;
import dr1.C7505u;
import dr1.C7506y;
import dr1.C7509z;
import eb0.C31543z5;
import er1.C58684b;
import er1.C58775t;
import er1.C58784w3;
import er1.C7885u1;
import fe1.C58969q;
import fp1.C59266a;
import fp1.C59267b;
import fp1.C59268c;
import fy3.C32224a;
import gs1.C59692c;
import gs1.C8437d;
import gs1.C8448g;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import h81.C59774i;
import ht1.C60213x3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import kd1.C9579a;
import kq1.C33971k;
import kq1.C61137l;
import nj3.C76879j;
import nj3.C76912y0;
import o40.C61926c;
import org.json.JSONObject;
import os1.C62153d;
import p599lr.C61381b;
import p707tz.C64999e;
import p707tz.C65002h;
import p763ym.C79138l;
import qo3.C77407n;
import qo3.C89779i0;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C49277ef1;
import te3.C49712hj1;
import te3.C49863il0;
import te3.C64234an2;
import te3.C64589nq2;
import te3.C64636pq2;
import te3.C64726td1;
import te3.C64736tq2;
import up1.C14358p;
import up1.C65418l;
import up1.C65420m;
import uq1.C65437f;
import uq1.C65448l;
import uq1.C65462u;
import uq1.C65464w;
import vp1.C14937o;
import vp1.C14944s;
import wq1.C66171a;
import wq1.C66173b;
import wx3.C15601d;
import wx3.C66212f;
import z04.C112551y;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC */
public final class PostMainUIC extends UIComponent implements C7020t0, C65464w {

    /* renamed from: A */
    public C7506y f160247A;

    /* renamed from: B */
    public C58426v f160248B;

    /* renamed from: C */
    public final C13601g f160249C;

    /* renamed from: D */
    public final C13601g f160250D;

    /* renamed from: E */
    public final C13601g f160251E;

    /* renamed from: F */
    public final C13601g f160252F;

    /* renamed from: G */
    public final C13601g f160253G;

    /* renamed from: H */
    public final C13601g f160254H;

    /* renamed from: I */
    public KeyboardHeightProvider f160255I;

    /* renamed from: J */
    public C54563e f160256J;

    /* renamed from: K */
    public long f160257K;

    /* renamed from: L */
    public String f160258L;

    /* renamed from: M */
    public int f160259M;

    /* renamed from: N */
    public JSONObject f160260N;

    /* renamed from: P */
    public String f160261P;

    /* renamed from: Q */
    public int f160262Q;

    /* renamed from: R */
    public boolean f160263R;

    /* renamed from: S */
    public long f160264S;

    /* renamed from: T */
    public boolean f160265T;

    /* renamed from: U */
    public final View.OnLayoutChangeListener f160266U;

    /* renamed from: V */
    public final View.OnLayoutChangeListener f160267V;

    /* renamed from: W */
    public JSONObject f160268W;

    /* renamed from: X */
    public final PostMainUIC$jumpInfoEventListener$1 f160269X;

    /* renamed from: d */
    public final String f160270d = "Finder.FinderPostUI";

    /* renamed from: e */
    public final String f160271e = "Finder.FinderRecordPluginLayout.FlutterVideoEditor_DataReport";

    /* renamed from: f */
    public String f160272f = "";

    /* renamed from: g */
    public C58969q f160273g;

    /* renamed from: h */
    public ImageView f160274h;

    /* renamed from: i */
    public TextView f160275i;

    /* renamed from: j */
    public ViewGroup f160276j;

    /* renamed from: n */
    public ScrollView f160277n;

    /* renamed from: o */
    public View f160278o;

    /* renamed from: p */
    public View f160279p;

    /* renamed from: q */
    public View f160280q;

    /* renamed from: r */
    public C89779i0 f160281r;

    /* renamed from: s */
    public boolean f160282s;

    /* renamed from: t */
    public C54556b f160283t;

    /* renamed from: u */
    public C7493o f160284u;

    /* renamed from: v */
    public C7505u f160285v;

    /* renamed from: w */
    public C7509z f160286w;

    /* renamed from: x */
    public C7470a f160287x;

    /* renamed from: y */
    public FinderExtendActivityView f160288y;

    /* renamed from: z */
    public FinderPostOriginView f160289z;

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$a */
    public static final class C3368a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f15863d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3368a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f15863d = appCompatActivity;
        }

        public Object invoke() {
            return this.f15863d.findViewById(C0966R.C0970id.hzr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$b */
    public static final class C3369b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f15864d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3369b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f15864d = appCompatActivity;
        }

        public Object invoke() {
            return this.f15864d.findViewById(C0966R.C0970id.e44);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$e */
    public static final class C3370e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ PostMainUIC f15865d;

        public C3370e(PostMainUIC postMainUIC) {
            this.f15865d = postMainUIC;
        }

        public final void run() {
            this.f15865d.mo78426g3();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$f */
    public static final class C3371f extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f15866d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3371f(AppCompatActivity appCompatActivity) {
            super(0);
            this.f15866d = appCompatActivity;
        }

        public Object invoke() {
            return this.f15866d.findViewById(C0966R.C0970id.i0c);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$j */
    public static final class C3372j extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f15867d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3372j(AppCompatActivity appCompatActivity) {
            super(0);
            this.f15867d = appCompatActivity;
        }

        public Object invoke() {
            return this.f15867d.findViewById(C0966R.C0970id.e4c);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$k */
    public static final class C3373k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PostMainUIC f15870d;

        public C3373k(PostMainUIC postMainUIC) {
            this.f15870d = postMainUIC;
        }

        public final void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/post/PostMainUIC$initDelMediaBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            PostMainUIC postMainUIC = this.f15870d;
            C77407n nVar = new C77407n((Context) postMainUIC.getContext(), 1, true);
            View inflate = C85868k2.m106137b(postMainUIC.getContext()).inflate(C0966R.C0971layout.anh, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.e45);
            Integer num = postMainUIC.mo78410F3().f152963d;
            if (num != null && num.intValue() == 2) {
                str = postMainUIC.getContext().getResources().getString(C0966R.string.f360744ei2);
            } else {
                Integer num2 = postMainUIC.mo78410F3().f152963d;
                str = (num2 != null && num2.intValue() == 4) ? postMainUIC.getContext().getResources().getString(C0966R.string.f360745ei3) : postMainUIC.getContext().getResources().getString(C0966R.string.f360744ei2);
            }
            textView.setText(str);
            nVar.mo107569n(inflate, false);
            nVar.f225771i = new C0196z0(postMainUIC);
            nVar.f225782p = new C54262a1(postMainUIC);
            nVar.f225761d = new C0140b1(postMainUIC);
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/post/PostMainUIC$initDelMediaBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$p */
    public static final class C3374p extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f15871d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3374p(AppCompatActivity appCompatActivity) {
            super(0);
            this.f15871d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f15871d.findViewById(C0966R.C0970id.e4b);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$r */
    public static final class C3375r extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f15872d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3375r(AppCompatActivity appCompatActivity) {
            super(0);
            this.f15872d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f15872d.findViewById(C0966R.C0970id.n9w);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$c */
    public static final class C56173c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ PostMainUIC f160290d;

        /* renamed from: e */
        public final /* synthetic */ int f160291e;

        /* renamed from: f */
        public final /* synthetic */ int f160292f;

        public C56173c(PostMainUIC postMainUIC, int i, int i2) {
            this.f160290d = postMainUIC;
            this.f160291e = i;
            this.f160292f = i2;
        }

        public final void run() {
            ScrollView scrollView = this.f160290d.f160277n;
            if (scrollView != null) {
                scrollView.scrollBy(0, this.f160291e - this.f160292f);
            } else {
                C87412m.m108603p("scrollView");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$d */
    public static final class C56174d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ PostMainUIC f160293d;

        /* renamed from: e */
        public final /* synthetic */ C54590w f160294e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56174d(PostMainUIC postMainUIC, C54590w wVar) {
            super(0);
            this.f160293d = postMainUIC;
            this.f160294e = wVar;
        }

        public Object invoke() {
            C65418l qq;
            C54563e F3 = this.f160293d.mo78410F3();
            AppCompatActivity activity = this.f160293d.getActivity();
            String k3 = this.f160293d.mo78415L3().mo75075k3();
            C54590w wVar = this.f160294e;
            ArrayList<C64589nq2> a = this.f160293d.mo78415L3().mo75074j3().mo84676a().mo84674a();
            C7470a aVar = this.f160293d.f160287x;
            if (aVar != null) {
                C49277ef1 activityEvent = aVar.f25683a.getActivityEvent();
                LinkedList<FinderJumpInfo> o3 = this.f160293d.mo78433o3(false);
                PostMainUIC postMainUIC = this.f160293d;
                C7506y yVar = postMainUIC.f160247A;
                if (yVar != null) {
                    long j = 0;
                    long j2 = yVar.f25759a.f17908f.f220433y ? 1 : 0;
                    String str = postMainUIC.f160258L;
                    Class cls = FinderCommonFeatureService.class;
                    C87412m.m108594g(activity, "context");
                    C87412m.m108594g(k3, "desc");
                    C87412m.m108594g(wVar, "uploadData");
                    C87412m.m108594g(str, "vstId");
                    C39622i0 a2 = C39818r.f106831a.mo62443b(activity).mo75002a(C54270m1.class);
                    C87412m.m108593f(a2, "UICProvider.of(context).…(SdkShareUIC::class.java)");
                    C54270m1 m1Var = (C54270m1) a2;
                    String str2 = str;
                    C65462u b = F3.mo75454b(wVar, k3, a, m1Var, activityEvent, o3, j2);
                    if (!(F3.f152985z == 0 || (qq = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Cx0().mo90229qq(F3.f152985z)) == null)) {
                        if (qq.field_objectId != 0) {
                            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Cx0().mo90227bD(F3.f152985z);
                            j = qq.field_objectId;
                            Log.m105924i(F3.f152961b, "post svr draft");
                        } else {
                            C65420m.f188268a.mo89519a(F3.f152985z);
                        }
                    }
                    C65437f fVar = C65437f.f188296h;
                    String str3 = m1Var.f152326q;
                    int i = m1Var.f152327r;
                    fVar.getClass();
                    C87412m.m108594g(str3, ClientInfoTable.Columns.CLIENTID);
                    FinderItem i2 = C66171a.f190181a.mo90261i(b, false);
                    FinderObject finderObject = i2.field_finderObject;
                    FinderObjectDesc finderObjectDesc = finderObject != null ? finderObject.objectDesc : null;
                    if (finderObjectDesc != null) {
                        finderObjectDesc.draftObjectId = j;
                    }
                    FinderFeedReportObject finderFeedReportObject = i2.field_reportObject;
                    if (finderFeedReportObject != null) {
                        C14358p Dx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Dx0();
                        ArrayList arrayList = new ArrayList();
                        Cursor rawQuery = Dx0.f39913g.rawQuery("SELECT * FROM FinderFeedItem  WHERE " + Dx0.f39911e + " ORDER BY " + Dx0.f39910d + ".localId ASC", (String[]) null, 2);
                        while (rawQuery.moveToNext()) {
                            FinderItem finderItem = new FinderItem();
                            finderItem.convertFrom(rawQuery);
                            arrayList.add(finderItem);
                        }
                        rawQuery.close();
                        finderFeedReportObject.waitingPostCount = arrayList.size();
                    }
                    i2.field_watermarkFlag = b.f188382v;
                    if (i2.field_postinfo == null) {
                        i2.field_postinfo = new C64736tq2();
                    }
                    i2.field_postinfo.f185659u = str2;
                    if (str3.length() > 0) {
                        i2.getPostInfo().f185645d = str3;
                    }
                    i2.getPostInfo().f185658t = i;
                    String str4 = fVar.f188301d;
                    Log.m105924i(str4, "clientId: " + i2.getPostInfo().f185645d + ", waitType:" + i2.getPostInfo().f185658t);
                    if (((FinderCommonFeatureService) C86312j.m106911c(cls)).Dx0().mo13665qq() != null) {
                        Log.m105924i(fVar.f188301d, "movefile first");
                        C66173b.f190184a.mo90262a(i2);
                    }
                    C59266a.m69196d(C59266a.f169452a, C59267b.f169458f, i2, 0, 0, 12, (Object) null);
                    long Yt = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Dx0().mo13663Yt(i2);
                    String str5 = fVar.f188301d;
                    Log.m105924i(str5, "insertNewFeed " + Yt + " localId:" + Yt);
                    i2.setLocalId(Yt);
                    if (C14937o.f40976e.mo13997a(7).f40956d) {
                        LinkedList<C49863il0> linkedList = C14937o.f40976e.mo13997a(7).f40955c.f144718d;
                        C87412m.m108593f(linkedList, "cache[ConstantsFinder.Lo…INE_FOLLOW].page.infoList");
                        C49863il0 il02 = (C49863il0) C110818d0.m150917O(linkedList, 0);
                        if (il02 != null) {
                            il02.f135460d.addFirst(new C14944s(2, i2.getLocalId(), i2.getFeedObject(), 7, false, 16, (C8480h) null).f40983a);
                        }
                    }
                    C61926c.m72668M(new C65448l(fVar, Yt));
                    fVar.mo12419l();
                    boolean isLongVideo = i2.isLongVideo();
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo175913w(1253, 15, 1);
                    if (isLongVideo) {
                        nVar.mo175913w(1523, 15, 1);
                    }
                    ((C65002h) C86312j.m106911c(C65002h.class)).mo89215pm();
                    i2.trackPost("doPost");
                    Log.m105924i(this.f160293d.f160270d, "ready to post");
                    if (!this.f160293d.mo78410F3().mo75460h()) {
                        PostMainUIC postMainUIC2 = this.f160293d;
                        postMainUIC2.getClass();
                        C61926c.m72668M(new C54276s0(postMainUIC2, Yt));
                    }
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("postOriginWidget");
                throw null;
            }
            C87412m.m108603p("activityWidget");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$g */
    public static final class C56175g implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ PostMainUIC f160295d;

        public C56175g(PostMainUIC postMainUIC) {
            this.f160295d = postMainUIC;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            String str = this.f160295d.f160270d;
            Log.m105924i(str, "oldBottom " + i8 + ", bottom " + i4);
            if (i8 != i4) {
                this.f160295d.mo78424e3((View) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$h */
    public static final class C56176h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PostMainUIC f160296d;

        public C56176h(PostMainUIC postMainUIC) {
            this.f160296d = postMainUIC;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            PostMainUIC postMainUIC = this.f160296d;
            postMainUIC.getClass();
            C61137l lVar = (C61137l) C39818r.f106831a.mo62444c(postMainUIC.getActivity()).mo75002a(C61137l.class);
            C54271n0 n0Var = new C54271n0(postMainUIC);
            C54273o0 o0Var = new C54273o0(postMainUIC);
            lVar.getClass();
            Log.m105924i("Finder.PostSafePreCheckUIC", "checkBeforeSave, needWatermarkDet:" + lVar.f174052f + ", watermarkFlag:" + lVar.f174051e);
            if (!lVar.f174052f || lVar.f174051e > 0) {
                o0Var.invoke(Boolean.FALSE);
                return;
            }
            n0Var.invoke();
            C0317e.launch$default(lVar, (C66212f) null, (C53934p0) null, new C33971k(lVar, o0Var, (C15601d<? super C33971k>) null), 3, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$i */
    public static final class C56177i implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PostMainUIC f160297d;

        public C56177i(PostMainUIC postMainUIC) {
            this.f160297d = postMainUIC;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            PostMainUIC postMainUIC = this.f160297d;
            postMainUIC.mo78419P3(0);
            postMainUIC.f160263R = true;
            C54264e eVar = C54264e.f152303a;
            String str2 = "";
            eVar.mo75058a(2, str2);
            FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.exitPageId = 4;
                finderFeedReportObject.sendOrExitButtonTime = C31543z5.m39453c();
                FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
                if (finderFeedReportObject2 != null) {
                    C61926c.m72661F("Finder.FinderPostReportLogic", new C58412u0(finderFeedReportObject2, false));
                }
            }
            if (C54264e.f152304b != null) {
                eVar.mo75058a(2, str2);
                postMainUIC.getActivity().finish();
            } else {
                postMainUIC.mo78420Q3(false);
            }
            C59266a aVar = C59266a.f169452a;
            FinderFeedReportObject finderFeedReportObject3 = C58408t0.f167337b;
            if (!(finderFeedReportObject3 == null || (str = finderFeedReportObject3.flowId) == null)) {
                str2 = str;
            }
            aVar.mo84410b(str2, C59267b.f169460h);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$l */
    public static final class C56178l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ PostMainUIC f160298d;

        public C56178l(PostMainUIC postMainUIC) {
            this.f160298d = postMainUIC;
        }

        public final void run() {
            float y = this.f160298d.mo78431m3().getY();
            ViewGroup viewGroup = this.f160298d.f160276j;
            if (viewGroup == null) {
                C87412m.m108603p("mediaViewContainer");
                throw null;
            } else if (y < viewGroup.getY() && this.f160298d.f160276j == null) {
                C87412m.m108603p("mediaViewContainer");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$m */
    public static final class C56179m implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PostMainUIC f160299d;

        public C56179m(PostMainUIC postMainUIC) {
            this.f160299d = postMainUIC;
        }

        public final void onClick(View view) {
            Class cls = C58684b.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/post/PostMainUIC$initDelMediaBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C54277t L3 = this.f160299d.mo78415L3();
            L3.getIntent().putExtra("saveDesc", L3.mo75070e3().getText().toString());
            Intent intent = L3.getIntent();
            C59692c a = L3.mo75074j3().mo84676a();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry next : a.f170520a.entrySet()) {
                String str = (String) next.getKey();
                C64589nq2 nq22 = (C64589nq2) next.getValue();
                C58775t tVar = C58775t.f168276a;
                C87412m.m108594g(nq22, "contact");
                LocalFinderAtContactParcel localFinderAtContactParcel = new LocalFinderAtContactParcel();
                localFinderAtContactParcel.f161647d = nq22.f184530d;
                localFinderAtContactParcel.f161648e = nq22.f184531e;
                localFinderAtContactParcel.f161649f = nq22.f184532f;
                FinderAuthInfo finderAuthInfo = nq22.f184533g;
                localFinderAtContactParcel.f161650g = finderAuthInfo != null ? finderAuthInfo.toByteArray() : null;
                localFinderAtContactParcel.f161651h = nq22.f184534h;
                arrayList2.add(localFinderAtContactParcel);
            }
            intent.putExtra("saveDescAt", arrayList2);
            Intent intent2 = new Intent();
            intent2.putExtras(this.f160299d.getIntent());
            intent2.putExtra("album_from_finder_add_media", true);
            ((C58684b) C86312j.m106911c(cls)).wy0(intent2, this.f160299d.getIntent());
            intent2.putExtra("key_post_has_show_safe_dialog", ((C61137l) C39818r.f106831a.mo62444c(this.f160299d.getActivity()).mo75002a(C61137l.class)).f31613d > 0);
            if (this.f160299d.mo78410F3().mo75460h()) {
                intent2.putExtra("KEY_POST_WARM_GOODS_SELECT_MEDIA", true);
            }
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
            C58684b.Ux0((C58684b) c, this.f160299d.getActivity(), intent2, (Boolean) null, (Integer) null, 12, (Object) null);
            FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.videoSource = 1;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/post/PostMainUIC$initDelMediaBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$n */
    public static final class C56180n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ PostMainUIC f160300d;

        /* renamed from: e */
        public final /* synthetic */ View f160301e;

        public C56180n(PostMainUIC postMainUIC, View view) {
            this.f160300d = postMainUIC;
            this.f160301e = view;
        }

        public final void run() {
            String str = this.f160300d.f160270d;
            Log.m105924i(str, "footer.height " + this.f160301e.getHeight() + ", footer.oldHeight " + this.f160300d.mo78415L3().f152349q);
            boolean hasFocus = this.f160300d.mo78415L3().mo75070e3().hasFocus();
            boolean hasFocus2 = this.f160300d.mo78415L3().mo75073i3().hasFocus();
            boolean z = false;
            if (this.f160301e.getVisibility() == 0) {
                if (hasFocus || hasFocus2) {
                    z = true;
                }
                if (z && this.f160301e.getHeight() != this.f160300d.mo78415L3().f152349q) {
                    this.f160300d.mo78415L3().f152349q = this.f160301e.getHeight();
                    this.f160300d.mo78424e3((View) null);
                }
                if (hasFocus) {
                    PostMainUIC postMainUIC = this.f160300d;
                    View view = postMainUIC.f160279p;
                    if (view != null) {
                        view.addOnLayoutChangeListener(postMainUIC.f160266U);
                    } else {
                        C87412m.m108603p("edtContainer");
                        throw null;
                    }
                }
                if (hasFocus2) {
                    PostMainUIC postMainUIC2 = this.f160300d;
                    View view2 = postMainUIC2.f160280q;
                    if (view2 != null) {
                        view2.addOnLayoutChangeListener(postMainUIC2.f160267V);
                    } else {
                        C87412m.m108603p("shortTitleContainer");
                        throw null;
                    }
                }
            } else if (this.f160301e.getVisibility() == 8 || this.f160301e.getHeight() == 0) {
                this.f160300d.mo78415L3().f152349q = 0;
                ScrollView scrollView = this.f160300d.f160277n;
                if (scrollView != null) {
                    scrollView.scrollTo(0, 0);
                    View view3 = this.f160300d.f160278o;
                    if (view3 != null) {
                        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.height = 0;
                        layoutParams2.weight = 1.0f;
                        View view4 = this.f160300d.f160278o;
                        if (view4 != null) {
                            view4.setLayoutParams(layoutParams2);
                            View view5 = this.f160300d.f160278o;
                            if (view5 != null) {
                                view5.requestLayout();
                                PostMainUIC postMainUIC3 = this.f160300d;
                                View view6 = postMainUIC3.f160279p;
                                if (view6 != null) {
                                    view6.removeOnLayoutChangeListener(postMainUIC3.f160266U);
                                    PostMainUIC postMainUIC4 = this.f160300d;
                                    View view7 = postMainUIC4.f160280q;
                                    if (view7 != null) {
                                        view7.removeOnLayoutChangeListener(postMainUIC4.f160267V);
                                    } else {
                                        C87412m.m108603p("shortTitleContainer");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("edtContainer");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("bottomSpace");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("bottomSpace");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("bottomSpace");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("scrollView");
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$o */
    public static final class C56181o extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ PostMainUIC f160302d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56181o(PostMainUIC postMainUIC) {
            super(0);
            this.f160302d = postMainUIC;
        }

        public Object invoke() {
            boolean z;
            C54269l0 N3 = this.f160302d.mo78417N3();
            Class cls = C62153d.class;
            Class<FinderCommonFeatureService> cls2 = FinderCommonFeatureService.class;
            boolean booleanExtra = N3.getIntent().getBooleanExtra("saveLocation", false);
            C39818r rVar = C39818r.f106831a;
            boolean H = ((C62153d) rVar.mo62446e(cls2).mo75002a(cls)).mo9103H();
            C54563e eVar = (C54563e) ((C36570n) N3.f152314h).getValue();
            boolean z2 = eVar.f152985z != 0 && !eVar.f152945C;
            String stringExtra = N3.getIntent().getStringExtra("get_poi_name");
            if (z2 && N3.f152315i) {
                if (stringExtra == null || stringExtra.length() == 0) {
                    z = true;
                    Log.m105924i("PostLocationUIC", "hasSave:" + booleanExtra + " hasPermission:" + H + " fromDraft:" + z2 + " enableSpecific:" + N3.f152315i + " poiName:" + stringExtra);
                    if ((!booleanExtra || z) && H && (!z2 || N3.f152315i)) {
                        C13604l<Float, Float> X0 = ((C62153d) rVar.mo62446e(cls2).mo75002a(cls)).mo9104X0();
                        C64234an2 an22 = new C64234an2();
                        an22.f182094d = ((Number) X0.f38555d).floatValue();
                        an22.f182095e = ((Number) X0.f38556e).floatValue();
                        an22.f182099i = 0;
                        an22.f182096f = 1;
                        ((C58256b) C86312j.m106911c(C58256b.class)).L00(6, an22, false, N3);
                        C61926c.m72668M(new C54267j0(N3));
                    }
                    return C13598b0.f38549a;
                }
            }
            z = false;
            Log.m105924i("PostLocationUIC", "hasSave:" + booleanExtra + " hasPermission:" + H + " fromDraft:" + z2 + " enableSpecific:" + N3.f152315i + " poiName:" + stringExtra);
            C13604l<Float, Float> X02 = ((C62153d) rVar.mo62446e(cls2).mo75002a(cls)).mo9104X0();
            C64234an2 an222 = new C64234an2();
            an222.f182094d = ((Number) X02.f38555d).floatValue();
            an222.f182095e = ((Number) X02.f38556e).floatValue();
            an222.f182099i = 0;
            an222.f182096f = 1;
            ((C58256b) C86312j.m106911c(C58256b.class)).L00(6, an222, false, N3);
            C61926c.m72668M(new C54267j0(N3));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.post.PostMainUIC$q */
    public static final class C56182q implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ PostMainUIC f160303d;

        public C56182q(PostMainUIC postMainUIC) {
            this.f160303d = postMainUIC;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            String str = this.f160303d.f160270d;
            Log.m105924i(str, "oldBottom " + i8 + ", bottom " + i4);
            if (i8 != i4) {
                this.f160303d.mo78424e3((View) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PostMainUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f160249C = C36568h.m40985a(new C3371f(appCompatActivity));
        this.f160250D = C36568h.m40985a(new C3368a(appCompatActivity));
        this.f160251E = C36568h.m40985a(new C3369b(appCompatActivity));
        this.f160252F = C36568h.m40985a(new C3374p(appCompatActivity));
        this.f160253G = C36568h.m40985a(new C3375r(appCompatActivity));
        this.f160254H = C36568h.m40985a(new C3372j(appCompatActivity));
        this.f160258L = "";
        this.f160261P = "";
        this.f160262Q = -1;
        this.f160266U = new C56175g(this);
        this.f160267V = new C56182q(this);
        this.f160268W = new JSONObject();
        this.f160269X = new PostMainUIC$jumpInfoEventListener$1(this, appCompatActivity, C40008f.f107254d);
    }

    /* renamed from: c3 */
    public static final void m64165c3(PostMainUIC postMainUIC, int i) {
        Class cls = C58417y0.class;
        Integer num = postMainUIC.mo78410F3().f152963d;
        int i2 = -1;
        if (num == null || num.intValue() != 2) {
            Integer num2 = postMainUIC.mo78410F3().f152963d;
            if (num2 != null && num2.intValue() == 4 && (postMainUIC.f160283t instanceof C54585t)) {
                Integer num3 = postMainUIC.mo78410F3().f152963d;
                if (num3 != null) {
                    i2 = num3.intValue();
                }
                C54556b bVar = postMainUIC.f160283t;
                C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.widget.post.PostVideoWidget");
                long o = ((C54585t) bVar).mo75483o();
                FinderPostPageDeleteStruct finderPostPageDeleteStruct = new FinderPostPageDeleteStruct();
                FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
                if (finderFeedReportObject != null) {
                    finderPostPageDeleteStruct.f155811d = finderPostPageDeleteStruct.mo86045b("PostId", finderFeedReportObject.postId, true);
                    finderPostPageDeleteStruct.f155812e = finderPostPageDeleteStruct.mo86045b("EditId", finderFeedReportObject.editId, true);
                    finderPostPageDeleteStruct.f155813f = (long) finderFeedReportObject.videoSource;
                    finderPostPageDeleteStruct.f155814g = (long) i2;
                    finderPostPageDeleteStruct.f155815h = 0;
                    finderPostPageDeleteStruct.f155816i = o;
                    finderPostPageDeleteStruct.mo86054n();
                    ((C58417y0) C86312j.m106911c(cls)).Ec0(finderPostPageDeleteStruct);
                }
            }
        } else if (postMainUIC.f160283t instanceof C54564g) {
            Integer num4 = postMainUIC.mo78410F3().f152963d;
            if (num4 != null) {
                i2 = num4.intValue();
            }
            C54556b bVar2 = postMainUIC.f160283t;
            C87412m.m108592e(bVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.widget.post.PostImageWidget");
            ArrayList<String> arrayList = ((C54564g) bVar2).f152989h;
            long size = (long) (arrayList != null ? arrayList.size() : 0);
            FinderPostPageDeleteStruct finderPostPageDeleteStruct2 = new FinderPostPageDeleteStruct();
            FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
            if (finderFeedReportObject2 != null) {
                finderPostPageDeleteStruct2.f155811d = finderPostPageDeleteStruct2.mo86045b("PostId", finderFeedReportObject2.postId, true);
                finderPostPageDeleteStruct2.f155812e = finderPostPageDeleteStruct2.mo86045b("EditId", finderFeedReportObject2.editId, true);
                finderPostPageDeleteStruct2.f155813f = (long) finderFeedReportObject2.videoSource;
                finderPostPageDeleteStruct2.f155814g = (long) i2;
                finderPostPageDeleteStruct2.f155815h = size;
                finderPostPageDeleteStruct2.f155816i = 0;
                finderPostPageDeleteStruct2.mo86054n();
                ((C58417y0) C86312j.m106911c(cls)).Ec0(finderPostPageDeleteStruct2);
            }
        }
    }

    /* renamed from: F3 */
    public final C54563e mo78410F3() {
        C54563e eVar = this.f160256J;
        if (eVar != null) {
            return eVar;
        }
        C87412m.m108603p("postDataManager");
        throw null;
    }

    /* renamed from: G3 */
    public final TextView mo78411G3() {
        return (TextView) ((C36570n) this.f160252F).getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: te3.ig1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: te3.kg1} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: I3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final bt1.C54590w mo78412I3() {
        /*
            r7 = this;
            bt1.b r0 = r7.f160283t
            r1 = 0
            if (r0 == 0) goto L_0x007d
            bt1.w r0 = r0.mo75451a()
            if (r0 == 0) goto L_0x007d
            ao1.t r2 = r7.mo78415L3()
            com.tencent.mm.plugin.finder.view.FinderPostEditText r2 = r2.mo75073i3()
            android.text.Editable r2 = r2.getText()
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x0021
        L_0x001f:
            java.lang.String r2 = ""
        L_0x0021:
            r0.f153081f = r2
            dr1.y r2 = r7.f160247A
            if (r2 == 0) goto L_0x0077
            te3.lg1 r3 = r2.f25761c
            if (r3 == 0) goto L_0x0073
            te3.ig1 r4 = new te3.ig1
            r4.<init>()
            java.util.LinkedList<java.lang.Integer> r5 = r4.f183688d
            int r6 = r3.f137398d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            int r3 = r3.f137398d
            r5 = 1
            if (r3 != r5) goto L_0x0072
            dr1.v r2 = r2.f25760b
            if (r2 == 0) goto L_0x0070
            java.lang.String r3 = r2.f167386c
            r6 = 0
            if (r3 == 0) goto L_0x0052
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r3 = 0
            goto L_0x0053
        L_0x0052:
            r3 = 1
        L_0x0053:
            if (r3 != 0) goto L_0x0070
            java.lang.String r3 = r2.f167387d
            if (r3 == 0) goto L_0x0061
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r5 = 0
        L_0x0061:
            if (r5 != 0) goto L_0x0070
            te3.kg1 r1 = new te3.kg1
            r1.<init>()
            java.lang.String r3 = r2.f167386c
            r1.f183923d = r3
            java.lang.String r2 = r2.f167387d
            r1.f183924e = r2
        L_0x0070:
            r4.f183689e = r1
        L_0x0072:
            r1 = r4
        L_0x0073:
            r0.f153082g = r1
            r1 = r0
            goto L_0x007d
        L_0x0077:
            java.lang.String r0 = "postOriginWidget"
            gy3.C87412m.m108603p(r0)
            throw r1
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.post.PostMainUIC.mo78412I3():bt1.w");
    }

    /* renamed from: J3 */
    public final void mo78413J3() {
        C89779i0 i0Var = this.f160281r;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.f160281r = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0082  */
    /* renamed from: K3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78414K3() {
        /*
            r20 = this;
            r0 = r20
            android.view.View r9 = r20.mo78431m3()
            android.view.ViewGroup r1 = r0.f160276j
            if (r1 == 0) goto L_0x00e6
            int r1 = r1.getChildCount()
            r10 = 8
            r11 = 0
            if (r1 == 0) goto L_0x0030
            bl3.r r1 = bl3.C39818r.f106831a
            android.app.Activity r2 = r20.getContext()
            bl3.r$a r1 = r1.mo62443b(r2)
            java.lang.Class<ao1.m1> r2 = ao1.C54270m1.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            ao1.m1 r1 = (ao1.C54270m1) r1
            te3.dj1 r1 = r1.f152318f
            if (r1 != 0) goto L_0x002b
            r1 = 1
            goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            if (r1 == 0) goto L_0x0030
            r1 = 0
            goto L_0x0032
        L_0x0030:
            r1 = 8
        L_0x0032:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.mo10233c(r1)
            java.lang.Object[] r2 = r12.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/post/PostMainUIC"
            java.lang.String r4 = "initDelMediaBtn"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r9
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r12.mo10231a(r11)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r9.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/post/PostMainUIC"
            java.lang.String r3 = "initDelMediaBtn"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r9
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            android.view.View r1 = r20.mo78430l3()
            android.view.View r2 = r20.mo78431m3()
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r10 = 0
        L_0x0083:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r2.mo10233c(r3)
            java.lang.Object[] r13 = r2.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/post/PostMainUIC"
            java.lang.String r15 = "initDelMediaBtn"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r2.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/post/PostMainUIC"
            java.lang.String r14 = "initDelMediaBtn"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            android.view.View r1 = r20.mo78431m3()
            com.tencent.mm.plugin.finder.post.PostMainUIC$k r2 = new com.tencent.mm.plugin.finder.post.PostMainUIC$k
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            android.view.View r1 = r20.mo78431m3()
            com.tencent.mm.plugin.finder.post.PostMainUIC$l r2 = new com.tencent.mm.plugin.finder.post.PostMainUIC$l
            r2.<init>(r0)
            r1.post(r2)
            android.view.View r1 = r20.mo78430l3()
            com.tencent.mm.plugin.finder.post.PostMainUIC$m r2 = new com.tencent.mm.plugin.finder.post.PostMainUIC$m
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            return
        L_0x00e6:
            java.lang.String r1 = "mediaViewContainer"
            gy3.C87412m.m108603p(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.post.PostMainUIC.mo78414K3():void");
    }

    /* renamed from: L3 */
    public final C54277t mo78415L3() {
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54277t.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…(PostEditUIC::class.java)");
        return (C54277t) a;
    }

    /* renamed from: M3 */
    public final C0192y mo78416M3() {
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C0192y.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…xtendLinkUIC::class.java)");
        return (C0192y) a;
    }

    /* renamed from: N3 */
    public final C54269l0 mo78417N3() {
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54269l0.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…tLocationUIC::class.java)");
        return (C54269l0) a;
    }

    /* renamed from: O3 */
    public final void mo78418O3(int i, int i2, long j, int i3, JSONObject jSONObject, String str, C49712hj1 hj12) {
        FinderPageExposeStruct finderPageExposeStruct = new FinderPageExposeStruct();
        finderPageExposeStruct.mo1036z(((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb());
        finderPageExposeStruct.mo1030t(String.valueOf(i));
        finderPageExposeStruct.f9879g = i2;
        finderPageExposeStruct.mo1031u(String.valueOf(System.currentTimeMillis()));
        finderPageExposeStruct.mo1033w(C66785b.f191882e.mo90662O5());
        finderPageExposeStruct.f9885m = j;
        finderPageExposeStruct.mo1034x(str != null ? C112551y.m153814n(str, ",", ";", false) : "");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (i3 != -1 && i2 == 1) {
            jSONObject.put("nextstep", i3);
        }
        if (hj12 != null) {
            finderPageExposeStruct.mo1032v(hj12.f134671e);
            finderPageExposeStruct.mo1029s(hj12.f134672f);
            finderPageExposeStruct.mo1035y(String.valueOf(hj12.f134677n));
        }
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "udfJson.toString()");
        finderPageExposeStruct.mo1028A(C112551y.m153814n(jSONObject2, ",", ";", false));
        finderPageExposeStruct.mo86054n();
        String str2 = this.f160270d;
        Log.m105924i(str2, "FinderReport21874 report scene:" + i + " eventCode:" + i2);
    }

    /* renamed from: P3 */
    public final void mo78419P3(int i) {
        if (!this.f160263R) {
            long currentTimeMillis = System.currentTimeMillis() - this.f160257K;
            JSONObject jSONObject = this.f160260N;
            String str = this.f160261P;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
            mo78418O3(74, 1, currentTimeMillis, i, jSONObject, str, f != null ? f.mo12861q3() : null);
        }
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        int i2 = i;
        FinderPostFooter f3 = mo78415L3().mo75071f3();
        View g3 = mo78415L3().mo75072g3();
        boolean z2 = true;
        boolean z3 = i2 > 0;
        if (i2 > 0 && i2 != ((int) f3.f162120n)) {
            KeyBoardUtil.saveKeyBordHeightPx(f3.getContext(), i2);
            f3.f162120n = (float) i2;
            f3.getSmileyPanel().setLayoutParams(new LinearLayout.LayoutParams(-1, (int) f3.f162120n));
        }
        Object tag = f3.getSmileyBtn().getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) tag).booleanValue();
        if (z3 || booleanValue) {
            View view = f3.f162122p;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderPostFooter", "onKeyboardHeightChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderPostFooter", "onKeyboardHeightChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view3 = f3.f162122p;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderPostFooter", "onKeyboardHeightChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/FinderPostFooter", "onKeyboardHeightChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (z3 && booleanValue) {
            f3.mo79845a(false, false);
        }
        C54277t L3 = mo78415L3();
        if (L3.f152339d == null || L3.f152344i == null) {
            z2 = false;
        }
        if (z2) {
            f3.post(new C56180n(this, g3));
        }
    }

    /* renamed from: Q3 */
    public final void mo78420Q3(boolean z) {
        Class cls = C58684b.class;
        String c3 = ((C54270m1) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54270m1.class)).mo75060c3();
        if (!z) {
            int i = this.f160262Q;
            if (!(i == -1 || i == 6)) {
                Intent intent = new Intent();
                intent.putExtra("key_finder_post_router", this.f160262Q);
                ((C58684b) C86312j.m106911c(cls)).mo83582c0(getActivity(), intent);
                mo78423d3(c3);
                getActivity().overridePendingTransition(0, MMFragmentActivity$$c.f318647d);
            }
            getActivity().finish();
            return;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("key_finder_post_router", 13);
        intent2.putExtra("key_finder_post_from", this.f160262Q);
        ((C58684b) C86312j.m106911c(cls)).mo83582c0(getActivity(), intent2);
        mo78423d3(c3);
        getActivity().overridePendingTransition(0, MMFragmentActivity$$c.f318647d);
        getActivity().finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c5, code lost:
        if (r2 != null) goto L_0x02ea;
     */
    /* renamed from: R3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78421R3() {
        /*
            r21 = this;
            r0 = r21
            bt1.e r1 = r21.mo78410F3()
            byte[] r2 = r1.f152974o
            if (r2 == 0) goto L_0x0011
            android.os.Bundle r3 = r1.f152962c
            java.lang.String r4 = "MEDIA_EXTRA_MUSIC"
            r3.putByteArray(r4, r2)
        L_0x0011:
            byte[] r2 = r1.f152976q
            if (r2 == 0) goto L_0x001c
            android.os.Bundle r3 = r1.f152962c
            java.lang.String r4 = "ORIGIN_MUSIC_INFO"
            r3.putByteArray(r4, r2)
        L_0x001c:
            android.os.Bundle r2 = r1.f152962c
            java.lang.String r3 = r1.f152975p
            java.lang.String r4 = "ORIGIN_MUSIC_ID"
            r2.putString(r4, r3)
            android.os.Bundle r2 = r1.f152962c
            java.lang.String r3 = r1.f152977r
            java.lang.String r4 = "ORIGIN_MUSIC_PATH"
            r2.putString(r4, r3)
            android.os.Bundle r2 = r1.f152962c
            java.lang.String r3 = r1.f152978s
            java.lang.String r4 = "ORIGIN_BGM_URL"
            r2.putString(r4, r3)
            android.os.Bundle r2 = r1.f152962c
            boolean r3 = r1.f152981v
            java.lang.String r4 = "MEDIA_IS_MUTE"
            r2.putBoolean(r4, r3)
            android.os.Bundle r2 = r1.f152962c
            boolean r3 = r1.f152982w
            java.lang.String r4 = "MUSIC_IS_MUTE"
            r2.putBoolean(r4, r3)
            android.os.Bundle r2 = r1.f152962c
            int r3 = r1.f152983x
            java.lang.String r4 = "SOUND_TRACK_TYPE"
            r2.putInt(r4, r3)
            android.os.Bundle r2 = r1.f152962c
            java.lang.String r3 = r1.f152984y
            java.lang.String r4 = "MUSIC_FEED_ID"
            r2.putString(r4, r3)
            android.os.Bundle r2 = r1.f152962c
            long r3 = r1.f152980u
            java.lang.String r5 = "ORIGIN_POST_FLAG"
            r2.putLong(r5, r3)
            android.os.Bundle r2 = r1.f152962c
            java.lang.String r3 = r1.f152979t
            java.lang.String r4 = "ORIGIN_FILE_PATH"
            r2.putString(r4, r3)
            java.lang.Integer r2 = r1.f152963d
            java.lang.String r3 = "HALF_RECT_LIST"
            r5 = 2
            if (r2 != 0) goto L_0x0075
            goto L_0x007b
        L_0x0075:
            int r2 = r2.intValue()
            if (r2 == r5) goto L_0x038b
        L_0x007b:
            java.lang.Integer r2 = r1.f152963d
            r6 = 7
            if (r2 != 0) goto L_0x0081
            goto L_0x0089
        L_0x0081:
            int r2 = r2.intValue()
            if (r2 != r6) goto L_0x0089
            goto L_0x038b
        L_0x0089:
            java.lang.Integer r2 = r1.f152963d
            java.lang.String r7 = "VIDEO_CROP_LIST"
            if (r2 != 0) goto L_0x0091
            goto L_0x0350
        L_0x0091:
            int r2 = r2.intValue()
            r9 = 4
            if (r2 != r9) goto L_0x0350
            android.os.Bundle r2 = r1.f152962c
            java.util.ArrayList<java.lang.String> r10 = r1.f152964e
            java.lang.String r11 = "video_file_list"
            r2.putStringArrayList(r11, r10)
            byte[] r2 = r1.f152966g
            if (r2 == 0) goto L_0x00ae
            android.os.Bundle r10 = r1.f152962c
            java.lang.String r11 = "video_composition"
            r10.putByteArray(r11, r2)
        L_0x00ae:
            boolean r2 = r1.f152973n
            r10 = 0
            if (r2 == 0) goto L_0x02f2
            java.util.ArrayList<android.os.Parcelable> r2 = r1.f152967h
            r11 = 1
            if (r2 == 0) goto L_0x00c9
            int r12 = r2.size()
            if (r12 <= 0) goto L_0x00c0
            r12 = 1
            goto L_0x00c1
        L_0x00c0:
            r12 = 0
        L_0x00c1:
            if (r12 == 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r2 = 0
        L_0x00c5:
            if (r2 == 0) goto L_0x00c9
            goto L_0x02ea
        L_0x00c9:
            com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable r2 = new com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable
            r2.<init>()
            java.util.ArrayList<java.lang.String> r12 = r1.f152964e
            if (r12 == 0) goto L_0x02ea
            int r13 = r12.size()
            if (r13 <= 0) goto L_0x00da
            r13 = 1
            goto L_0x00db
        L_0x00da:
            r13 = 0
        L_0x00db:
            if (r13 == 0) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            r12 = 0
        L_0x00df:
            if (r12 == 0) goto L_0x02ea
            java.lang.Object r12 = r12.get(r10)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x00eb
            goto L_0x02ea
        L_0x00eb:
            java.lang.Class<rw.m> r13 = p232rw.C63679m.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            rw.m r13 = (p232rw.C63679m) r13
            rw.m$a r13 = r13.mo88483M1(r12)
            if (r13 != 0) goto L_0x0102
            java.lang.String r2 = r1.f152961b
            java.lang.String r5 = "initLongVideoCropInfo: video info is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r5)
            goto L_0x02ea
        L_0x0102:
            te3.jr2 r14 = new te3.jr2
            r14.<init>()
            dq1.c r15 = dq1.C31252c.f83719a
            com.tencent.mm.modelcontrol.VideoTransPara r15 = r15.mo58041a()
            int r4 = r13.f180525a
            int r8 = r13.f180526b
            java.lang.Class<com.tencent.mm.feature.sight.api.ISightJNIService> r17 = com.tencent.p014mm.feature.sight.api.ISightJNIService.class
            di3.d r17 = di3.C86312j.m106911c(r17)
            r6 = r17
            com.tencent.mm.feature.sight.api.ISightJNIService r6 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r6
            int r6 = r6.getMp4RotateVFS(r12)
            r12 = 90
            if (r6 == r12) goto L_0x0128
            r12 = 270(0x10e, float:3.78E-43)
            if (r6 == r12) goto L_0x0128
            goto L_0x012c
        L_0x0128:
            int r4 = r13.f180526b
            int r8 = r13.f180525a
        L_0x012c:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = r6.widthPixels
            float r6 = (float) r4
            float r12 = (float) r8
            float r17 = r6 / r12
            r19 = 1071877689(0x3fe38e39, float:1.7777778)
            int r20 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r20 > 0) goto L_0x014e
            r20 = 1058013184(0x3f100000, float:0.5625)
            int r20 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r20 > 0) goto L_0x014e
            r20 = 1
            goto L_0x0150
        L_0x014e:
            r20 = 0
        L_0x0150:
            r9 = 9
            r5 = 0
            if (r20 == 0) goto L_0x01c0
            te3.zr4 r6 = new te3.zr4
            r6.<init>()
            r6.f186847d = r10
            r6.f186848e = r8
            r6.f186849f = r4
            r6.f186850g = r10
            r14.f183830d = r6
            r14.f183836j = r6
            java.lang.Float[] r6 = new java.lang.Float[r9]
            r9 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r12 = java.lang.Float.valueOf(r9)
            r6[r10] = r12
            java.lang.Float r12 = java.lang.Float.valueOf(r5)
            r6[r11] = r12
            java.lang.Float r12 = java.lang.Float.valueOf(r5)
            r17 = 2
            r6[r17] = r12
            r12 = 3
            java.lang.Float r17 = java.lang.Float.valueOf(r5)
            r6[r12] = r17
            java.lang.Float r12 = java.lang.Float.valueOf(r9)
            r17 = 4
            r6[r17] = r12
            r12 = 5
            java.lang.Float r17 = java.lang.Float.valueOf(r5)
            r6[r12] = r17
            r12 = 6
            java.lang.Float r17 = java.lang.Float.valueOf(r5)
            r6[r12] = r17
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r12 = 7
            r6[r12] = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r9)
            r9 = 8
            r6[r9] = r5
            java.util.List r5 = sx3.C64197v.m75537f(r6)
            te3.bp1 r6 = new te3.bp1
            r6.<init>()
            java.util.LinkedList<java.lang.Float> r9 = r6.f131245d
            java.util.List r5 = sx3.C110818d0.m150953y0(r5)
            r9.addAll(r5)
            r14.f183831e = r6
            goto L_0x0247
        L_0x01c0:
            r16 = 1091567616(0x41100000, float:9.0)
            r18 = 1098907648(0x41800000, float:16.0)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 <= 0) goto L_0x0208
            float r12 = r12 * r18
            float r12 = r12 / r16
            int r6 = (int) r12
            te3.zr4 r12 = new te3.zr4
            r12.<init>()
            int r16 = r4 - r6
            r17 = 2
            int r11 = r16 / 2
            r12.f186847d = r11
            r12.f186848e = r8
            int r4 = r4 - r11
            r12.f186849f = r4
            r12.f186850g = r10
            r14.f183830d = r12
            r14.f183836j = r12
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            int r11 = r12.f186847d
            float r11 = (float) r11
            float r11 = -r11
            r4.postTranslate(r11, r5)
            te3.bp1 r5 = new te3.bp1
            r5.<init>()
            float[] r9 = new float[r9]
            r4.getValues(r9)
            java.util.LinkedList<java.lang.Float> r4 = r5.f131245d
            java.util.List r9 = sx3.C110823p.m150998X(r9)
            r4.addAll(r9)
            r14.f183831e = r5
            r4 = r6
            goto L_0x0247
        L_0x0208:
            float r6 = r6 * r18
            float r6 = r6 / r16
            int r6 = (int) r6
            te3.zr4 r11 = new te3.zr4
            r11.<init>()
            r11.f186847d = r10
            int r12 = r8 - r6
            r16 = 2
            int r12 = r12 / 2
            r11.f186850g = r12
            r11.f186849f = r4
            int r8 = r8 - r12
            r11.f186848e = r8
            r14.f183830d = r11
            r14.f183836j = r11
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            int r11 = r11.f186850g
            float r11 = (float) r11
            float r11 = -r11
            r8.postTranslate(r5, r11)
            te3.bp1 r5 = new te3.bp1
            r5.<init>()
            float[] r9 = new float[r9]
            r8.getValues(r9)
            java.util.LinkedList<java.lang.Float> r8 = r5.f131245d
            java.util.List r9 = sx3.C110823p.m150998X(r9)
            r8.addAll(r9)
            r14.f183831e = r5
            r8 = r6
        L_0x0247:
            r14.f183832f = r10
            int r5 = r15.f267170h
            int r5 = r5 * 1000
            long r11 = r13.f180528d
            int r6 = (int) r11
            int r5 = java.lang.Math.min(r5, r6)
            r14.f183833g = r5
            wq1.a r5 = wq1.C66171a.f190181a
            int r6 = r15.f267166d
            int r9 = r15.f267167e
            int r6 = java.lang.Math.min(r6, r9)
            r5.getClass()
            if (r4 >= r8) goto L_0x028b
            int r5 = r4 % 16
            if (r5 == 0) goto L_0x026c
            int r5 = r4 - r5
            goto L_0x026d
        L_0x026c:
            r5 = r4
        L_0x026d:
            if (r4 <= r6) goto L_0x0277
            float r5 = (float) r8
            float r8 = (float) r6
            float r4 = (float) r4
            float r8 = r8 / r4
            float r5 = r5 * r8
            int r8 = (int) r5
            goto L_0x0278
        L_0x0277:
            r6 = r5
        L_0x0278:
            int r4 = r8 % 16
            if (r4 == 0) goto L_0x027d
            int r8 = r8 - r4
        L_0x027d:
            rx3.l r4 = new rx3.l
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r4.<init>(r5, r6)
            goto L_0x02b1
        L_0x028b:
            int r5 = r8 % 16
            if (r5 == 0) goto L_0x0292
            int r5 = r8 - r5
            goto L_0x0293
        L_0x0292:
            r5 = r8
        L_0x0293:
            if (r5 <= r6) goto L_0x029d
            float r4 = (float) r4
            float r5 = (float) r6
            float r8 = (float) r8
            float r5 = r5 / r8
            float r4 = r4 * r5
            int r4 = (int) r4
            goto L_0x029e
        L_0x029d:
            r6 = r5
        L_0x029e:
            int r5 = r4 % 16
            if (r5 == 0) goto L_0x02a3
            int r4 = r4 - r5
        L_0x02a3:
            rx3.l r5 = new rx3.l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.<init>(r4, r6)
            r4 = r5
        L_0x02b1:
            A r5 = r4.f38555d
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            B r4 = r4.f38556e
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r14.f183834h = r5
            r14.f183835i = r4
            r14.f183837n = r10
            java.lang.String r4 = r1.f152952J
            r14.f183838o = r4
            r2.f161940d = r14
            java.util.ArrayList<android.os.Parcelable> r4 = r1.f152967h
            if (r4 != 0) goto L_0x02da
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.f152967h = r4
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x02da:
            java.util.ArrayList<android.os.Parcelable> r4 = r1.f152967h
            if (r4 == 0) goto L_0x02e1
            r4.add(r2)
        L_0x02e1:
            android.content.Intent r2 = r1.f152960a
            java.util.ArrayList<android.os.Parcelable> r4 = r1.f152967h
            java.lang.String r5 = "postVideoCropList"
            r2.putParcelableArrayListExtra(r5, r4)
        L_0x02ea:
            android.os.Bundle r2 = r1.f152962c
            java.lang.String r4 = "post_long_video"
            r5 = 1
            r2.putBoolean(r4, r5)
        L_0x02f2:
            android.os.Bundle r2 = r1.f152962c
            java.util.ArrayList<android.os.Parcelable> r4 = r1.f152967h
            r2.putParcelableArrayList(r7, r4)
            android.os.Bundle r2 = r1.f152962c
            java.util.ArrayList<java.lang.String> r4 = r1.f152968i
            java.lang.String r5 = "VIDEO_THUMB_LIST"
            r2.putStringArrayList(r5, r4)
            android.os.Bundle r2 = r1.f152962c
            android.content.Intent r4 = r1.f152960a
            java.lang.String r5 = "select_video_path"
            java.lang.String r4 = r4.getStringExtra(r5)
            java.lang.String r5 = "video_before_cut_path"
            r2.putString(r5, r4)
            android.os.Bundle r2 = r1.f152962c
            android.content.Intent r4 = r1.f152960a
            java.lang.String r5 = "VIDEO_COVER_URL"
            java.lang.String r4 = r4.getStringExtra(r5)
            r2.putString(r5, r4)
            android.os.Bundle r2 = r1.f152962c
            android.content.Intent r4 = r1.f152960a
            java.lang.String r5 = "VIDEO_FULL_COVER_URL"
            java.lang.String r4 = r4.getStringExtra(r5)
            r2.putString(r5, r4)
            android.os.Bundle r2 = r1.f152962c
            android.content.Intent r4 = r1.f152960a
            java.lang.String r5 = "VIDEO_COVER_QUALITY"
            int r4 = r4.getIntExtra(r5, r10)
            r2.putInt(r5, r4)
            android.os.Bundle r2 = r1.f152962c
            java.util.ArrayList<android.graphics.Rect> r4 = r1.f152950H
            r2.putParcelableArrayList(r3, r4)
            android.os.Bundle r2 = r1.f152962c
            android.content.Intent r3 = r1.f152960a
            java.lang.String r4 = "KEY_POST_VIDEO_TEMPLATE"
            byte[] r3 = r3.getByteArrayExtra(r4)
            r2.putByteArray(r4, r3)
            goto L_0x03d6
        L_0x0350:
            java.lang.Integer r2 = r1.f152963d
            if (r2 != 0) goto L_0x0356
            goto L_0x03d6
        L_0x0356:
            int r2 = r2.intValue()
            r3 = 8
            if (r2 != r3) goto L_0x03d6
            android.os.Bundle r2 = r1.f152962c
            java.util.ArrayList<java.lang.String> r3 = r1.f152964e
            java.lang.String r4 = "MEDIA_FILE_LIST"
            r2.putStringArrayList(r4, r3)
            android.os.Bundle r2 = r1.f152962c
            java.util.ArrayList<java.lang.Integer> r3 = r1.f152969j
            java.lang.String r4 = "MEDIA_TYPE_LIST"
            r2.putIntegerArrayList(r4, r3)
            android.os.Bundle r2 = r1.f152962c
            java.util.ArrayList<android.os.Parcelable> r3 = r1.f152967h
            r2.putParcelableArrayList(r7, r3)
            android.os.Bundle r2 = r1.f152962c
            java.util.ArrayList<java.lang.String> r3 = r1.f152968i
            java.lang.String r4 = "MEDIA_THUMB_LIST"
            r2.putStringArrayList(r4, r3)
            android.os.Bundle r2 = r1.f152962c
            android.graphics.Rect r3 = r1.f152972m
            java.lang.String r4 = "vlog_crop_rect"
            r2.putParcelable(r4, r3)
            goto L_0x03d6
        L_0x038b:
            android.os.Bundle r2 = r1.f152962c
            java.util.ArrayList<java.lang.String> r4 = r1.f152964e
            java.lang.String r5 = "image_file_list"
            r2.putStringArrayList(r5, r4)
            java.util.ArrayList<java.lang.Integer> r2 = r1.f152965f
            if (r2 == 0) goto L_0x03bd
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.ArrayList<java.lang.String> r4 = r1.f152964e
            if (r4 == 0) goto L_0x03ad
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x03ae
        L_0x03ad:
            r4 = 0
        L_0x03ae:
            boolean r2 = gy3.C87412m.m108589b(r2, r4)
            if (r2 == 0) goto L_0x03bd
            android.os.Bundle r2 = r1.f152962c
            java.util.ArrayList<java.lang.Integer> r4 = r1.f152965f
            java.lang.String r5 = "image_quality_list"
            r2.putIntegerArrayList(r5, r4)
        L_0x03bd:
            android.os.Bundle r2 = r1.f152962c
            java.util.ArrayList<java.lang.String> r4 = r1.f152968i
            java.lang.String r5 = "image_thumb_list"
            r2.putStringArrayList(r5, r4)
            android.os.Bundle r2 = r1.f152962c
            java.util.ArrayList<java.lang.String> r4 = r1.f152949G
            java.lang.String r5 = "half_image_file_list"
            r2.putStringArrayList(r5, r4)
            android.os.Bundle r2 = r1.f152962c
            java.util.ArrayList<android.graphics.Rect> r4 = r1.f152950H
            r2.putParcelableArrayList(r3, r4)
        L_0x03d6:
            android.os.Bundle r2 = r1.f152962c
            boolean r1 = r1.f152971l
            java.lang.String r3 = "post_from_camera"
            r2.putBoolean(r3, r1)
            bt1.b r1 = r0.f160283t
            if (r1 == 0) goto L_0x03f3
            bt1.e r2 = r21.mo78410F3()
            android.os.Bundle r2 = r2.f152962c
            java.lang.String r3 = "data"
            gy3.C87412m.m108594g(r2, r3)
            r1.f152934b = r2
            r1.mo75444h()
        L_0x03f3:
            com.tencent.mm.plugin.finder.post.PostMainUIC$o r1 = new com.tencent.mm.plugin.finder.post.PostMainUIC$o
            r1.<init>(r0)
            r2 = 0
            o40.C61926c.m72656A(r2, r1)
            r21.mo78425f3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.post.PostMainUIC.mo78421R3():void");
    }

    /* renamed from: T3 */
    public final void mo78422T3(String str) {
        C89779i0 i0Var = this.f160281r;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (str.length() == 0) {
            str = getString(C0966R.string.a2w);
        }
        C89779i0 Q = C76879j.m92723Q(getActivity(), "", str, true, false, (DialogInterface.OnCancelListener) null);
        this.f160281r = Q;
        if (Q != null) {
            Q.show();
        }
    }

    /* renamed from: d3 */
    public final void mo78423d3(String str) {
        C87412m.m108594g(str, "appId");
        C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(str);
        if (appInfo == null) {
            Log.m105924i(this.f160270d, "can not find app info");
            return;
        }
        Bundle bundle = new Bundle();
        Log.m105925i(this.f160270d, "Finder share video backToApp: %s", str);
        WXChannelShareVideo.Resp resp = new WXChannelShareVideo.Resp();
        resp.errCode = 0;
        resp.extMsg = "{}";
        resp.openId = appInfo.field_openId;
        resp.toBundle(bundle);
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.targetPkgName = appInfo.field_packageName;
        args.bundle = bundle;
        C72688j0.m85024j(args);
        C72688j0.m85021g(bundle);
        C72688j0.m85022h(bundle);
        MMessageActV2.send(MMApplicationContext.getContext(), args);
    }

    /* renamed from: e3 */
    public final void mo78424e3(View view) {
        Point point = new Point();
        getActivity().getWindowManager().getDefaultDisplay().getSize(point);
        int[] iArr = new int[2];
        if (view == null) {
            if (mo78415L3().mo75070e3().hasFocus()) {
                view = this.f160279p;
                if (view == null) {
                    C87412m.m108603p("edtContainer");
                    throw null;
                }
            } else {
                view = this.f160280q;
                if (view == null) {
                    C87412m.m108603p("shortTitleContainer");
                    throw null;
                }
            }
        }
        view.getLocationInWindow(iArr);
        View g3 = mo78415L3().mo75072g3();
        int height = (point.y - g3.getHeight()) - getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
        int i = iArr[1];
        View view2 = this.f160279p;
        if (view2 != null) {
            int height2 = i + view2.getHeight();
            String str = this.f160270d;
            Log.m105924i(str, "window.y " + point.y + " footer.height " + g3.getHeight() + " bottom " + height2 + ", maxBottom " + height + ' ');
            View view3 = this.f160278o;
            if (view3 != null) {
                ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                String str2 = this.f160270d;
                StringBuilder sb = new StringBuilder();
                sb.append("bottom height ");
                View view4 = this.f160278o;
                if (view4 != null) {
                    sb.append(view4.getHeight());
                    Log.m105924i(str2, sb.toString());
                    View view5 = this.f160278o;
                    if (view5 != null) {
                        layoutParams2.height = view5.getHeight() + (height2 - height);
                        View view6 = this.f160278o;
                        if (view6 != null) {
                            view6.setLayoutParams(layoutParams2);
                            View view7 = this.f160278o;
                            if (view7 != null) {
                                view7.requestLayout();
                                View view8 = this.f160278o;
                                if (view8 != null) {
                                    view8.post(new C56173c(this, height2, height));
                                } else {
                                    C87412m.m108603p("bottomSpace");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("bottomSpace");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("bottomSpace");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("bottomSpace");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("bottomSpace");
                    throw null;
                }
            } else {
                C87412m.m108603p("bottomSpace");
                throw null;
            }
        } else {
            C87412m.m108603p("edtContainer");
            throw null;
        }
    }

    /* renamed from: f3 */
    public final void mo78425f3() {
        if (!mo78432n3().f25730b.f17724y) {
            C54277t L3 = mo78415L3();
            if (L3.f152347o && L3.f152348p) {
                if (this.f160283t != null) {
                    mo78411G3().setEnabled(true);
                    return;
                } else {
                    mo78411G3().setEnabled(false);
                    return;
                }
            }
        }
        mo78411G3().setEnabled(false);
    }

    /* renamed from: g3 */
    public final void mo78426g3() {
        String str;
        String str2 = this.f160270d;
        Log.m105924i(str2, "check post time " + this.f160259M);
        int i = this.f160259M;
        boolean z = false;
        if (i < 10) {
            this.f160259M = i + 1;
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_finder_post_check_file_exist, true);
            String str3 = this.f160270d;
            Log.m105924i(str3, "xCheck :" + wf);
            C54556b bVar = this.f160283t;
            if ((bVar != null && bVar.mo75439c()) || !wf) {
                C54590w I3 = mo78412I3();
                if (I3 == null || !I3.f153076a) {
                    Log.m105924i(this.f160270d, "not ready to post");
                    MMHandlerThread.postToMainThreadDelayed(new C3370e(this), 500);
                    return;
                }
                C64636pq2 pq22 = I3.f153078c;
                if (pq22 != null) {
                    String str4 = pq22.f184877f;
                    if (str4 == null) {
                        C64726td1 td12 = pq22.f184876e;
                        str4 = td12 != null ? td12.f185534d : null;
                        if (str4 == null) {
                            str4 = "";
                        }
                    }
                    FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
                    if (finderFeedReportObject != null) {
                        finderFeedReportObject.followSoundTrackId = str4;
                    }
                    if (!(pq22 != null && !pq22.f184880i) || pq22.f184881j) {
                        if (!(pq22 != null && !pq22.f184880i)) {
                            if (pq22 != null && !pq22.f184881j) {
                                if (finderFeedReportObject != null) {
                                    finderFeedReportObject.musicType = 1;
                                }
                            } else if (finderFeedReportObject != null) {
                                finderFeedReportObject.musicType = 0;
                            }
                        } else if (finderFeedReportObject != null) {
                            finderFeedReportObject.musicType = 2;
                        }
                    } else if (finderFeedReportObject != null) {
                        finderFeedReportObject.musicType = 3;
                    }
                    int i2 = pq22 != null ? pq22.f184882n : 0;
                    if (finderFeedReportObject != null) {
                        finderFeedReportObject.soundTrackType = i2;
                    }
                    if (pq22 == null || (str = pq22.f184883o) == null) {
                        str = "";
                    }
                    if (finderFeedReportObject != null) {
                        finderFeedReportObject.musicFeedId = str;
                    }
                }
                ArrayList<C64589nq2> arrayList = mo78415L3().mo75074j3().mo84676a().f170521b;
                int i3 = mo78415L3().mo75074j3().mo84676a().f170523d;
                int i4 = mo78415L3().mo75074j3().mo84676a().f170524e;
                FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
                if (finderFeedReportObject2 != null) {
                    if (arrayList != null) {
                        HashSet hashSet = new HashSet();
                        Iterator<C64589nq2> it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str5 = it.next().f184530d;
                            if (str5 == null) {
                                str5 = "";
                            }
                            hashSet.add(str5);
                        }
                        finderFeedReportObject2.mentionCount = hashSet.size();
                    }
                    finderFeedReportObject2.clickMentionCount = i3;
                    finderFeedReportObject2.clickSucMentionCount = i4;
                    finderFeedReportObject2.mentionRepeatCount = arrayList != null ? arrayList.size() : 0;
                }
                Bundle bundle = mo78410F3().f152962c;
                C7509z zVar = this.f160286w;
                if (zVar != null) {
                    C58784w3.f168295a.getClass();
                    C66785b bVar2 = C66785b.f191882e;
                    C54446b a = C66783a.C66784a.m78798a(bVar2, bVar2.mo90662O5(), false, 2, (Object) null);
                    if ((((a != null ? a.field_extFlag : 0) & 8192) != 0) && zVar.f25765b.mo4423a()) {
                        z = true;
                    }
                    bundle.putBoolean("isNews", z);
                    C61926c.m72656A((String) null, new C56174d(this, I3));
                    return;
                }
                C87412m.m108603p("newsWidget");
                throw null;
            }
            C76912y0.makeText((Context) getContext(), (int) C0966R.string.eia, 0).show();
            mo78413J3();
            if (!this.f160282s) {
                VideoCompositionPerformanceStruct videoCompositionPerformanceStruct = new VideoCompositionPerformanceStruct();
                videoCompositionPerformanceStruct.f266445B = 0;
                videoCompositionPerformanceStruct.mo86054n();
                this.f160282s = true;
                return;
            }
            return;
        }
        Log.m105928w(this.f160270d, "check post data ready exceed MAX times!");
        mo78413J3();
        Toast.makeText(getActivity(), C0966R.string.eil, 0).show();
        this.f160259M = 0;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ano;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0540  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x057b  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x05d4  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x05e5  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x05ea  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x05ed  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x066b  */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78427i3() {
        /*
            r46 = this;
            r0 = r46
            java.lang.Class<er1.b> r1 = er1.C58684b.class
            java.lang.Class<pf1.n> r2 = pf1.C62273n.class
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            java.lang.Class<kq1.f> r4 = kq1.C10389f.class
            bt1.w r8 = r46.mo78412I3()
            bt1.e r5 = r46.mo78410F3()
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.f152943A
            r14 = 0
            if (r5 == 0) goto L_0x0025
            bt1.e r5 = r46.mo78410F3()
            java.util.LinkedList<te3.rq2> r5 = r5.f152958P
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r5)
            if (r5 != 0) goto L_0x0025
            r5 = 1
            goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            if (r8 == 0) goto L_0x07b4
            boolean r6 = r8.f153076a
            if (r6 != 0) goto L_0x002e
            goto L_0x07b4
        L_0x002e:
            te3.pq2 r6 = r8.f153078c
            if (r6 == 0) goto L_0x003d
            java.util.LinkedList<te3.rq2> r6 = r6.f184875d
            if (r6 == 0) goto L_0x003d
            java.lang.Object r6 = sx3.C110818d0.m150917O(r6, r14)
            te3.rq2 r6 = (te3.C64689rq2) r6
            goto L_0x003e
        L_0x003d:
            r6 = 0
        L_0x003e:
            if (r6 != 0) goto L_0x0041
            goto L_0x004b
        L_0x0041:
            java.util.UUID r9 = java.util.UUID.randomUUID()
            java.lang.String r9 = r9.toString()
            r6.f185275p = r9
        L_0x004b:
            java.lang.String r6 = "postOriginWidget"
            java.lang.String r13 = "KEY_ENABLE_SWITCH_PREVIEW_MODE"
            java.lang.String r12 = "KEY_IS_FULLSCREEN"
            java.lang.String r11 = "KEY_FINDER_SELF_FLAG"
            java.lang.String r10 = "KEY_USERNAME"
            java.lang.String r9 = "KEY_FROM_SCENE"
            java.lang.String r7 = "UICProvider.of(IFinderCo…perGlobalUIC::class.java)"
            java.lang.String r17 = "activityWidget"
            r18 = 1
            if (r5 != 0) goto L_0x069f
            bt1.e r5 = r46.mo78410F3()
            ao1.t r22 = r46.mo78415L3()
            java.lang.String r14 = r22.mo75075k3()
            ao1.t r15 = r46.mo78415L3()
            gs1.i r15 = r15.mo75074j3()
            gs1.c r15 = r15.mo84676a()
            java.util.ArrayList r15 = r15.mo84674a()
            r25 = r1
            r22 = r6
            r6 = 0
            java.util.LinkedList r1 = r0.mo78433o3(r6)
            dr1.a r6 = r0.f160287x
            if (r6 == 0) goto L_0x069a
            com.tencent.mm.plugin.finder.view.FinderExtendActivityView r6 = r6.f25683a
            te3.ef1 r6 = r6.getActivityEvent()
            r26 = r13
            dr1.y r13 = r0.f160247A
            if (r13 == 0) goto L_0x0695
            com.tencent.mm.plugin.finder.view.FinderPostOriginView r13 = r13.f25759a
            com.tencent.mm.ui.widget.MMSwitchBtn r13 = r13.f17908f
            boolean r13 = r13.f220433y
            if (r13 == 0) goto L_0x009f
            r27 = r18
            goto L_0x00a1
        L_0x009f:
            r27 = 0
        L_0x00a1:
            java.lang.String r13 = "desc"
            gy3.C87412m.m108594g(r14, r13)
            te3.db1 r13 = new te3.db1
            r13.<init>()
            te3.jk0 r0 = new te3.jk0
            r0.<init>()
            te3.xt2 r17 = new te3.xt2
            r17.<init>()
            r29 = r12
            android.os.Bundle r12 = r5.f152962c
            r30 = r11
            java.lang.String r11 = "post_location"
            byte[] r11 = r12.getByteArray(r11)
            if (r11 == 0) goto L_0x00c6
            r13.parseFrom(r11)
        L_0x00c6:
            android.os.Bundle r11 = r5.f152962c
            java.lang.String r12 = "post_extend_reading"
            byte[] r11 = r11.getByteArray(r12)
            if (r11 == 0) goto L_0x00d3
            r0.parseFrom(r11)
        L_0x00d3:
            android.os.Bundle r11 = r5.f152962c
            java.lang.String r12 = "POST_ORIGINAL_FLAG"
            r31 = r10
            r10 = 0
            int r11 = r11.getInt(r12, r10)
            android.os.Bundle r12 = r5.f152962c
            r32 = r9
            java.lang.String r9 = "post_from_camera"
            boolean r9 = r12.getBoolean(r9, r10)
            android.os.Bundle r10 = r5.f152962c
            java.lang.String r12 = "isNews"
            boolean r10 = r10.getBoolean(r12)
            uq1.f r12 = uq1.C65437f.f188296h
            r33 = r7
            int r7 = r8.f153077b
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r14)
            r34 = r2
            java.lang.String r2 = "nullAsNil(desc)"
            gy3.C87412m.m108593f(r14, r2)
            te3.pq2 r2 = r8.f153078c
            java.lang.String r8 = r8.f153079d
            boolean r5 = r5.f152973n
            r12.getClass()
            java.lang.Class<tz.f> r17 = p707tz.C65000f.class
            r35 = r3
            java.lang.String r3 = "videoPathBeforeCut"
            gy3.C87412m.m108594g(r8, r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = new com.tencent.mm.plugin.finder.storage.FinderItem
            r3.<init>()
            r36 = r4
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r4 = r3.field_reportObject
            r22 = r13
            r37 = r14
            if (r4 == 0) goto L_0x0132
            long r13 = eb0.C31543z5.m39453c()
            r4.sendOrExitButtonTime = r13
            r4.videoPostType = r7
            r4.beforeCutMediaPath = r8
            r8 = 1
            r4.postStage = r8
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0132:
            fe1.d$b r4 = fe1.C58961d.f168673a
            zc1.b r8 = zc1.C66785b.f191882e
            java.lang.String r13 = r8.mo90662O5()
            fe1.q r4 = r4.mo84155b(r13)
            com.tencent.mm.protocal.protobuf.FinderObject r13 = new com.tencent.mm.protocal.protobuf.FinderObject
            r13.<init>()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r14 = new com.tencent.mm.protocal.protobuf.FinderObjectDesc
            r14.<init>()
            r14.event = r6
            r13.objectType = r10
            r10 = r5
            r5 = 0
            r13.refObjectId = r5
            r13.refObjectFlag = r5
            r23 = r10
            r10 = 0
            r13.refObjectContact = r10
            r13.f164794id = r5
            java.lang.String r5 = r8.mo90662O5()
            r13.username = r5
            r24 = r0
            r5 = 0
            r6 = 1
            bd1.b r0 = zc1.C66783a.C66784a.m78800c(r8, r5, r6, r10)
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = r0.field_nickname
            if (r0 != 0) goto L_0x0171
        L_0x0170:
            r0 = r5
        L_0x0171:
            r13.nickname = r0
            r13.objectDesc = r14
            long r27 = r27 & r18
            int r0 = (r27 > r18 ? 1 : (r27 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x017d
            r0 = 1
            goto L_0x017e
        L_0x017d:
            r0 = 0
        L_0x017e:
            r13.showOriginal = r0
            er1.w3 r0 = er1.C58784w3.f168295a
            r0.getClass()
            long r18 = eb0.C31543z5.m39451a()
            r0 = 1000(0x3e8, float:1.401E-42)
            r10 = r7
            long r6 = (long) r0
            long r6 = r18 / r6
            int r0 = (int) r6
            r13.createtime = r0
            if (r4 == 0) goto L_0x019d
            com.tencent.mm.protocal.protobuf.FinderContact r0 = fe1.C58960c.m68835g(r4)
            r27 = r1
            r18 = r10
            goto L_0x01eb
        L_0x019d:
            com.tencent.mm.protocal.protobuf.FinderContact r0 = new com.tencent.mm.protocal.protobuf.FinderContact
            r0.<init>()
            java.lang.String r6 = r8.mo90662O5()
            r0.username = r6
            r27 = r1
            r18 = r10
            r6 = 0
            r7 = 0
            r10 = 1
            bd1.b r1 = zc1.C66783a.C66784a.m78800c(r8, r7, r10, r6)
            if (r1 == 0) goto L_0x01b9
            java.lang.String r1 = r1.field_nickname
            if (r1 != 0) goto L_0x01ba
        L_0x01b9:
            r1 = r5
        L_0x01ba:
            r0.nickname = r1
            bd1.b r1 = zc1.C66783a.C66784a.m78800c(r8, r7, r10, r6)
            if (r1 == 0) goto L_0x01c6
            java.lang.String r1 = r1.field_avatarUrl
            if (r1 != 0) goto L_0x01c7
        L_0x01c6:
            r1 = r5
        L_0x01c7:
            r0.headUrl = r1
            if (r4 == 0) goto L_0x01cf
            java.lang.String r1 = r4.field_signature
            if (r1 != 0) goto L_0x01d0
        L_0x01cf:
            r1 = r5
        L_0x01d0:
            r0.signature = r1
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MY_FINDER_LOCAL_COVER_IMG_STRING_SYNC
            java.lang.Object r1 = r1.mo119685f(r4, r5)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r1, r4)
            java.lang.String r1 = (java.lang.String) r1
            r0.coverImgUrl = r1
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x01eb:
            r13.contact = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r13.mentionedUserContact = r0
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r13.contact
            if (r0 == 0) goto L_0x0200
            int r1 = r0.one_time_flag
            r4 = 1
            r1 = r1 | r4
            r0.one_time_flag = r1
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0200:
            up1.f r0 = up1.C37521f.f99374d
            boolean r0 = r0.mo61175c()
            if (r0 == 0) goto L_0x023e
            if (r15 == 0) goto L_0x023e
            java.util.Iterator r0 = r15.iterator()
        L_0x020e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x023c
            java.lang.Object r1 = r0.next()
            te3.nq2 r1 = (te3.C64589nq2) r1
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r4 = r13.mentionedUserContact
            er1.t r6 = er1.C58775t.f168276a
            java.lang.String r6 = "atContact"
            gy3.C87412m.m108593f(r1, r6)
            com.tencent.mm.protocal.protobuf.FinderContact r6 = new com.tencent.mm.protocal.protobuf.FinderContact
            r6.<init>()
            java.lang.String r7 = r1.f184530d
            r6.username = r7
            java.lang.String r7 = r1.f184531e
            r6.headUrl = r7
            java.lang.String r7 = r1.f184532f
            r6.nickname = r7
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r1 = r1.f184533g
            r6.authInfo = r1
            r4.add(r6)
            goto L_0x020e
        L_0x023c:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x023e:
            er1.j4 r0 = er1.C58739j4.f168176a
            boolean r0 = r0.mo83687P()
            if (r0 == 0) goto L_0x024a
            r0 = 131(0x83, float:1.84E-43)
            r13.permissionFlag = r0
        L_0x024a:
            te3.ih1 r0 = new te3.ih1
            r0.<init>()
            if (r2 == 0) goto L_0x0254
            te3.td1 r1 = r2.f184876e
            goto L_0x0255
        L_0x0254:
            r1 = 0
        L_0x0255:
            r14.imgFeedBgmInfo = r1
            te3.ve1 r1 = new te3.ve1
            r1.<init>()
            if (r2 == 0) goto L_0x0261
            te3.td1 r4 = r2.f184876e
            goto L_0x0262
        L_0x0261:
            r4 = 0
        L_0x0262:
            r1.f185873d = r4
            if (r2 == 0) goto L_0x026d
            java.lang.String r6 = r2.f184877f
            if (r6 != 0) goto L_0x026b
            goto L_0x026d
        L_0x026b:
            r4 = r6
            goto L_0x0275
        L_0x026d:
            if (r4 == 0) goto L_0x0274
            java.lang.String r4 = dm1.C58324g.m67537a(r4)
            goto L_0x0275
        L_0x0274:
            r4 = 0
        L_0x0275:
            r1.f185874e = r4
            if (r2 == 0) goto L_0x027f
            boolean r4 = r2.f184880i
            if (r4 != 0) goto L_0x027f
            r4 = 1
            goto L_0x0280
        L_0x027f:
            r4 = 0
        L_0x0280:
            if (r4 != 0) goto L_0x0290
            if (r2 == 0) goto L_0x028a
            boolean r4 = r2.f184881j
            if (r4 != 0) goto L_0x028a
            r4 = 1
            goto L_0x028b
        L_0x028a:
            r4 = 0
        L_0x028b:
            if (r4 == 0) goto L_0x028e
            goto L_0x0290
        L_0x028e:
            r4 = 0
            goto L_0x0291
        L_0x0290:
            r4 = 1
        L_0x0291:
            r1.f185875f = r4
            java.lang.String r4 = r12.f188301d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "FinderObjectBGMInfo, groupId:"
            r6.append(r7)
            java.lang.String r7 = r1.f185874e
            r6.append(r7)
            java.lang.String r7 = ", mediaMute:"
            r6.append(r7)
            if (r2 == 0) goto L_0x02b2
            boolean r7 = r2.f184880i
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x02b3
        L_0x02b2:
            r7 = 0
        L_0x02b3:
            r6.append(r7)
            java.lang.String r7 = ", musicMute:"
            r6.append(r7)
            if (r2 == 0) goto L_0x02c4
            boolean r7 = r2.f184881j
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x02c5
        L_0x02c4:
            r7 = 0
        L_0x02c5:
            r6.append(r7)
            java.lang.String r7 = ", hasBgm:"
            r6.append(r7)
            int r7 = r1.f185875f
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r6)
            java.lang.String r4 = r1.f185874e
            if (r4 == 0) goto L_0x02e6
            int r4 = r4.length()
            if (r4 != 0) goto L_0x02e4
            goto L_0x02e6
        L_0x02e4:
            r4 = 0
            goto L_0x02e7
        L_0x02e6:
            r4 = 1
        L_0x02e7:
            if (r4 != 0) goto L_0x0320
            te3.td1 r4 = r1.f185873d
            if (r4 != 0) goto L_0x0320
            te3.td1 r4 = new te3.td1
            r4.<init>()
            if (r2 == 0) goto L_0x02f7
            java.lang.String r6 = r2.f184879h
            goto L_0x02f8
        L_0x02f7:
            r6 = 0
        L_0x02f8:
            if (r6 == 0) goto L_0x0303
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0301
            goto L_0x0303
        L_0x0301:
            r6 = 0
            goto L_0x0304
        L_0x0303:
            r6 = 1
        L_0x0304:
            if (r6 == 0) goto L_0x0314
            if (r2 == 0) goto L_0x030b
            java.lang.String r6 = r2.f184878g
            goto L_0x030c
        L_0x030b:
            r6 = 0
        L_0x030c:
            r7 = 1
            java.lang.String r6 = p823sg.C48380r.m53726a(r6, r7)
            r4.f185539i = r6
            goto L_0x031c
        L_0x0314:
            if (r2 == 0) goto L_0x0319
            java.lang.String r6 = r2.f184879h
            goto L_0x031a
        L_0x0319:
            r6 = 0
        L_0x031a:
            r4.f185539i = r6
        L_0x031c:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            r1.f185873d = r4
        L_0x0320:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r14.feedBgmInfo = r1
            if (r2 == 0) goto L_0x0488
            java.util.LinkedList<te3.rq2> r1 = r2.f184875d
            if (r1 == 0) goto L_0x0488
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L_0x032f:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0481
            java.lang.Object r6 = r1.next()
            int r7 = r4 + 1
            if (r4 < 0) goto L_0x047c
            te3.rq2 r6 = (te3.C64689rq2) r6
            com.tencent.mm.protocal.protobuf.FinderMedia r8 = new com.tencent.mm.protocal.protobuf.FinderMedia
            r8.<init>()
            java.lang.String r10 = r6.f185266d
            r8.url = r10
            int r10 = r6.f185268f
            r8.mediaType = r10
            java.lang.String r10 = r6.f185267e
            r8.thumbUrl = r10
            java.lang.String r10 = r6.f185239F
            r8.full_thumb_url = r10
            boolean r10 = r6.f185280t
            if (r10 != 0) goto L_0x0375
            int r10 = r6.f185269g
            if (r10 > 0) goto L_0x0375
            di3.d r10 = di3.C86312j.m106911c(r17)
            tz.f r10 = (p707tz.C65000f) r10
            r19 = r1
            java.lang.String r1 = r6.f185266d
            com.tencent.mm.plugin.sight.base.a r1 = r10.mo89183Yp(r1)
            if (r1 == 0) goto L_0x0377
            int r1 = r1.mo130041a()
            r6.f185269g = r1
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0377
        L_0x0375:
            r19 = r1
        L_0x0377:
            int r1 = r6.f185269g
            r8.videoDuration = r1
            float r1 = r6.f185270h
            r8.width = r1
            float r1 = r6.f185271i
            r8.height = r1
            java.lang.String r1 = r6.f185272j
            r8.md5sum = r1
            java.lang.String r1 = r6.f185283w
            r8.coverUrl = r1
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r1 = r14.media
            r1.add(r8)
            int r1 = r8.mediaType
            java.lang.String r8 = " option "
            java.lang.String r10 = " size:"
            r28 = r7
            java.lang.String r7 = "print mediaList "
            r38 = r2
            r2 = 2
            r39 = r15
            r15 = 32
            if (r1 != r2) goto L_0x0404
            java.lang.String r1 = r12.f188301d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r4)
            r2.append(r15)
            java.lang.String r4 = r6.f185266d
            r2.append(r4)
            r2.append(r10)
            java.lang.String r4 = r6.f185266d
            long r40 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r40)
            r2.append(r4)
            r2.append(r8)
            java.lang.String r4 = r6.f185266d
            android.graphics.BitmapFactory$Options r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "w*h:["
            r6.append(r7)
            int r7 = r4.outWidth
            r6.append(r7)
            java.lang.String r7 = " * "
            r6.append(r7)
            int r4 = r4.outHeight
            r6.append(r4)
            r4 = 93
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r2.append(r4)
            r4 = 125(0x7d, float:1.75E-43)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x0472
        L_0x0404:
            r2 = 4
            if (r1 != r2) goto L_0x0446
            java.lang.String r1 = r12.f188301d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r4)
            r2.append(r15)
            java.lang.String r4 = r6.f185266d
            r2.append(r4)
            r2.append(r10)
            java.lang.String r4 = r6.f185266d
            long r40 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r40)
            r2.append(r4)
            r2.append(r8)
            di3.d r4 = di3.C86312j.m106911c(r17)
            tz.f r4 = (p707tz.C65000f) r4
            java.lang.String r6 = r6.f185266d
            com.tencent.mm.plugin.sight.base.a r4 = r4.tg0(r6)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x0472
        L_0x0446:
            java.lang.String r1 = r12.f188301d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r4)
            r2.append(r15)
            java.lang.String r4 = r6.f185266d
            r2.append(r4)
            r2.append(r10)
            java.lang.String r4 = r6.f185266d
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r6)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
        L_0x0472:
            r1 = r19
            r4 = r28
            r2 = r38
            r15 = r39
            goto L_0x032f
        L_0x047c:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x0481:
            r38 = r2
            r39 = r15
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x048c
        L_0x0488:
            r38 = r2
            r39 = r15
        L_0x048c:
            bl3.r r1 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r1 = r1.mo62446e(r2)
            java.lang.Class<os1.d> r2 = os1.C62153d.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            os1.d r1 = (os1.C62153d) r1
            rx3.l r1 = r1.mo9104X0()
            A r2 = r1.f38555d
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r0.f183690d = r2
            B r1 = r1.f38556e
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r0.f183691e = r1
            r0.f183694h = r9
            r3.field_postExtraData = r0
            r13.displayidDiscarded = r5
            r13.recommendReason = r5
            r0 = 1
            r13.secondaryShowFlag = r0
            r13.originalFlag = r11
            wq1.a r0 = wq1.C66171a.f190181a
            r1 = r27
            r0.mo90253a(r1, r13)
            r0 = r37
            r14.description = r0
            r2 = r18
            r14.mediaType = r2
            r2 = r22
            r14.location = r2
            r2 = r24
            r14.extReading = r2
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            up1.f r6 = up1.C37521f.f99374d
            boolean r6 = r6.mo61175c()
            if (r6 == 0) goto L_0x051f
            if (r39 == 0) goto L_0x051f
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            java.util.Iterator r7 = r39.iterator()
        L_0x04f0:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x051b
            java.lang.Object r8 = r7.next()
            te3.nq2 r8 = (te3.C64589nq2) r8
            te3.jc1 r9 = new te3.jc1
            r9.<init>()
            java.lang.String r10 = r8.f184530d
            r9.f183779d = r10
            int r10 = r8.f184535i
            r9.f183780e = r10
            java.lang.String r10 = r8.f184532f
            r9.f183781f = r10
            r6.add(r9)
            java.lang.String r9 = r8.f184532f
            if (r9 != 0) goto L_0x0515
            r9 = r5
        L_0x0515:
            r4.put(r9, r8)
            rx3.b0 r8 = rx3.C13598b0.f38549a
            goto L_0x04f0
        L_0x051b:
            r14.mentionedUser = r6
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x051f:
            up1.f r5 = up1.C37521f.f99374d
            boolean r6 = r5.mo61158L()
            if (r6 != 0) goto L_0x052d
            boolean r5 = r5.mo61175c()
            if (r5 == 0) goto L_0x053c
        L_0x052d:
            te3.pn1 r5 = new te3.pn1
            r5.<init>()
            er1.f3 r6 = er1.C58723f3.f168122a
            java.lang.String r0 = r6.mo83640b(r0, r4)
            r5.f184865d = r0
            r14.topic = r5
        L_0x053c:
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r3.field_reportObject
            if (r0 == 0) goto L_0x0579
            java.lang.String r4 = r14.description
            if (r4 == 0) goto L_0x0549
            int r4 = r4.length()
            goto L_0x054a
        L_0x0549:
            r4 = 0
        L_0x054a:
            r0.descCount = r4
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r4 = r3.field_reportObject
            int r4 = r4.descCount
            if (r4 <= 0) goto L_0x0554
            r4 = 1
            goto L_0x0555
        L_0x0554:
            r4 = 0
        L_0x0555:
            r0.existDesc = r4
            te3.db1 r4 = r14.location
            r5 = 0
            if (r4 == 0) goto L_0x055f
            float r6 = r4.f182662e
            goto L_0x0560
        L_0x055f:
            r6 = 0
        L_0x0560:
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0572
            if (r4 == 0) goto L_0x0569
            float r4 = r4.f182661d
            goto L_0x056a
        L_0x0569:
            r4 = 0
        L_0x056a:
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0572
            r4 = 1
            r0.existLocation = r4
            goto L_0x0575
        L_0x0572:
            r4 = 0
            r0.existLocation = r4
        L_0x0575:
            java.lang.String r2 = r2.f183802d
            r0.link = r2
        L_0x0579:
            if (r23 == 0) goto L_0x058e
            te3.kf1 r0 = r13.object_extend
            if (r0 != 0) goto L_0x0586
            te3.kf1 r0 = new te3.kf1
            r0.<init>()
            r13.object_extend = r0
        L_0x0586:
            te3.kf1 r0 = r13.object_extend
            if (r0 != 0) goto L_0x058b
            goto L_0x058e
        L_0x058b:
            r2 = 1
            r0.f136747f = r2
        L_0x058e:
            wq1.a r0 = wq1.C66171a.f190181a
            r0.mo90254b(r13, r1)
            java.lang.String r0 = r12.f188301d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "finder send post "
            r1.append(r2)
            org.json.JSONObject r2 = o40.C61937h.m72709h(r13)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r3.updateFinderObject(r13)
            te3.tq2 r0 = new te3.tq2
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "FinderLocal_"
            r1.append(r2)
            long r4 = java.lang.System.nanoTime()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.f185645d = r1
            long r1 = eb0.C31543z5.m39451a()
            r0.f185651j = r1
            if (r39 == 0) goto L_0x05e0
            java.util.LinkedList<te3.nq2> r1 = r0.f185656r
            r1.clear()
            java.util.LinkedList<te3.nq2> r1 = r0.f185656r
            r2 = r39
            r1.addAll(r2)
        L_0x05e0:
            r3.setPostInfo(r0)
            if (r38 == 0) goto L_0x05ea
            r0 = r38
            java.util.LinkedList<te3.rq2> r7 = r0.f184875d
            goto L_0x05eb
        L_0x05ea:
            r7 = 0
        L_0x05eb:
            if (r7 != 0) goto L_0x05f2
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
        L_0x05f2:
            r3.setMediaExtList(r7)
            r3.setPostWaiting()
            long r0 = java.lang.System.currentTimeMillis()
            r3.setLocalId(r0)
            r0 = 1
            r3.setPreview(r0)
            wp1.f$a r0 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r0.mo14348k(r3)
            bl3.r r1 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r2 = r46.getActivity()
            bl3.r$a r2 = r1.mo62444c(r2)
            r4 = r36
            androidx.lifecycle.i0 r2 = r2.mo75002a(r4)
            kq1.f r2 = (kq1.C10389f) r2
            r2.mo10707c3(r3)
            r2 = r35
            bl3.r$a r1 = r1.mo62446e(r2)
            r14 = r34
            androidx.lifecycle.i0 r1 = r1.mo75002a(r14)
            r7 = r33
            gy3.C87412m.m108593f(r1, r7)
            r8 = r1
            pf1.n r8 = (pf1.C62273n) r8
            java.util.List r9 = sx3.C26236u.m33719b(r3)
            r10 = 62
            r11 = 0
            r12 = 0
            r13 = 12
            r14 = 0
            pf1.C62273n.m73200l3(r8, r9, r10, r11, r12, r13, r14)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r3 = r32
            r15 = 1
            r1.putExtra(r3, r15)
            zc1.b r2 = zc1.C66785b.f191882e
            java.lang.String r2 = r2.mo90662O5()
            r10 = r31
            r1.putExtra(r10, r2)
            r11 = r30
            r1.putExtra(r11, r15)
            r12 = r29
            r1.putExtra(r12, r15)
            er1.w3 r33 = er1.C58784w3.f168295a
            r33.mo83952o()
            int r2 = er1.C58784w3.f168309o
            if (r2 != r15) goto L_0x066b
            r14 = 1
            goto L_0x066c
        L_0x066b:
            r14 = 0
        L_0x066c:
            r2 = r14 ^ 1
            r13 = r26
            r1.putExtra(r13, r2)
            r34 = 0
            java.util.List r35 = sx3.C26236u.m33719b(r0)
            r36 = 0
            r38 = 0
            r39 = 16
            r40 = 0
            r37 = r1
            er1.C58784w3.m68427B1(r33, r34, r35, r36, r37, r38, r39, r40)
            di3.d r0 = di3.C86312j.m106911c(r25)
            er1.b r0 = (er1.C58684b) r0
            android.app.Activity r2 = r46.getContext()
            r0.py0(r2, r1)
            goto L_0x07b4
        L_0x0695:
            gy3.C87412m.m108603p(r22)
            r0 = 0
            throw r0
        L_0x069a:
            r0 = 0
            gy3.C87412m.m108603p(r17)
            throw r0
        L_0x069f:
            r25 = r1
            r14 = r2
            r2 = r3
            r0 = r5
            r22 = r6
            r3 = r9
            r5 = 0
            r15 = 1
            if (r0 == 0) goto L_0x07b4
            bt1.e r0 = r46.mo78410F3()
            androidx.appcompat.app.AppCompatActivity r1 = r46.getActivity()
            ao1.t r9 = r46.mo78415L3()
            java.lang.String r9 = r9.mo75075k3()
            ao1.t r21 = r46.mo78415L3()
            gs1.i r21 = r21.mo75074j3()
            gs1.c r21 = r21.mo84676a()
            java.util.ArrayList r21 = r21.mo84674a()
            r32 = r3
            r3 = r46
            dr1.a r5 = r3.f160287x
            if (r5 == 0) goto L_0x07af
            com.tencent.mm.plugin.finder.view.FinderExtendActivityView r5 = r5.f25683a
            te3.ef1 r26 = r5.getActivityEvent()
            dr1.a r5 = r3.f160287x
            if (r5 == 0) goto L_0x07aa
            te3.zj0 r17 = r5.mo8613i()
            r6 = 0
            java.util.LinkedList r20 = r3.mo78433o3(r6)
            dr1.y r5 = r3.f160247A
            if (r5 == 0) goto L_0x07a5
            com.tencent.mm.plugin.finder.view.FinderPostOriginView r5 = r5.f25759a
            com.tencent.mm.ui.widget.MMSwitchBtn r5 = r5.f17908f
            boolean r5 = r5.f220433y
            if (r5 == 0) goto L_0x06f4
            goto L_0x06f6
        L_0x06f4:
            r18 = 0
        L_0x06f6:
            r16 = 1
            r5 = r0
            r0 = 0
            r6 = r1
            r1 = r7
            r7 = r9
            r0 = r32
            r9 = r16
            r42 = r10
            r10 = r21
            r43 = r11
            r11 = r26
            r44 = r12
            r12 = r17
            r45 = r13
            r13 = r20
            r3 = r14
            r0 = 1
            r16 = 0
            r14 = r18
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo75455c(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r5.setPreview(r0)
            wp1.f$a r6 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r6.mo14348k(r5)
            bl3.r r7 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r8 = r46.getActivity()
            bl3.r$a r8 = r7.mo62444c(r8)
            androidx.lifecycle.i0 r4 = r8.mo75002a(r4)
            kq1.f r4 = (kq1.C10389f) r4
            r4.mo10707c3(r5)
            bl3.r$a r2 = r7.mo62446e(r2)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            gy3.C87412m.m108593f(r2, r1)
            r7 = r2
            pf1.n r7 = (pf1.C62273n) r7
            java.util.List r8 = sx3.C26236u.m33719b(r5)
            r9 = 62
            r10 = 0
            r11 = 0
            r12 = 12
            r13 = 0
            pf1.C62273n.m73200l3(r7, r8, r9, r10, r11, r12, r13)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r2 = r32
            r1.putExtra(r2, r0)
            zc1.b r2 = zc1.C66785b.f191882e
            java.lang.String r2 = r2.mo90662O5()
            r3 = r42
            r1.putExtra(r3, r2)
            r2 = r43
            r1.putExtra(r2, r0)
            r2 = r44
            r1.putExtra(r2, r0)
            er1.w3 r17 = er1.C58784w3.f168295a
            r17.mo83952o()
            int r2 = er1.C58784w3.f168309o
            if (r2 != r0) goto L_0x077d
            r14 = 1
            goto L_0x077e
        L_0x077d:
            r14 = 0
        L_0x077e:
            r0 = r0 ^ r14
            r2 = r45
            r1.putExtra(r2, r0)
            r18 = 0
            java.util.List r19 = sx3.C26236u.m33719b(r6)
            r20 = 0
            r22 = 0
            r23 = 16
            r24 = 0
            r21 = r1
            er1.C58784w3.m68427B1(r17, r18, r19, r20, r21, r22, r23, r24)
            di3.d r0 = di3.C86312j.m106911c(r25)
            er1.b r0 = (er1.C58684b) r0
            android.app.Activity r2 = r46.getContext()
            r0.py0(r2, r1)
            goto L_0x07b4
        L_0x07a5:
            gy3.C87412m.m108603p(r22)
            r0 = 0
            throw r0
        L_0x07aa:
            r0 = 0
            gy3.C87412m.m108603p(r17)
            throw r0
        L_0x07af:
            r0 = 0
            gy3.C87412m.m108603p(r17)
            throw r0
        L_0x07b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.post.PostMainUIC.mo78427i3():void");
    }

    /* renamed from: j3 */
    public final void mo78428j3() {
        String str;
        String str2;
        C64726td1 td12;
        C54590w I3 = mo78412I3();
        String str3 = "";
        int i = 0;
        if ((I3 != null ? I3.f153078c : null) != null && I3.f153076a) {
            C64636pq2 pq22 = I3.f153078c;
            if (pq22 == null || (str2 = pq22.f184877f) == null) {
                str2 = (pq22 == null || (td12 = pq22.f184876e) == null) ? null : td12.f185534d;
                if (str2 == null) {
                    str2 = str3;
                }
            }
            FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.followSoundTrackId = str2;
            }
            C64636pq2 pq23 = I3.f153078c;
            if (!(pq23 != null && !pq23.f184880i) || pq23.f184881j) {
                if (pq23 != null && !pq23.f184880i) {
                    FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
                    if (finderFeedReportObject2 != null) {
                        finderFeedReportObject2.musicType = 2;
                    }
                } else {
                    if (pq23 != null && !pq23.f184881j) {
                        FinderFeedReportObject finderFeedReportObject3 = C58408t0.f167337b;
                        if (finderFeedReportObject3 != null) {
                            finderFeedReportObject3.musicType = 1;
                        }
                    } else {
                        FinderFeedReportObject finderFeedReportObject4 = C58408t0.f167337b;
                        if (finderFeedReportObject4 != null) {
                            finderFeedReportObject4.musicType = 0;
                        }
                    }
                }
            } else {
                FinderFeedReportObject finderFeedReportObject5 = C58408t0.f167337b;
                if (finderFeedReportObject5 != null) {
                    finderFeedReportObject5.musicType = 3;
                }
            }
            int i2 = I3.f153078c.f184882n;
            FinderFeedReportObject finderFeedReportObject6 = C58408t0.f167337b;
            if (finderFeedReportObject6 != null) {
                finderFeedReportObject6.soundTrackType = i2;
            }
            String str4 = I3.f153078c.f184883o;
            if (str4 == null) {
                str4 = str3;
            }
            FinderFeedReportObject finderFeedReportObject7 = C58408t0.f167337b;
            if (finderFeedReportObject7 != null) {
                finderFeedReportObject7.musicFeedId = str4;
            }
        }
        String O5 = C66785b.f191882e.mo90662O5();
        if (!Util.isNullOrNil(O5) || this.f160262Q != 20) {
            if (!Util.isNullOrNil(O5)) {
                if (((C54270m1) C39818r.f106831a.mo62443b(getContext()).mo75002a(C54270m1.class)).f152318f == null) {
                    ArrayList<C64589nq2> arrayList = mo78415L3().mo75074j3().mo84676a().f170521b;
                    int i3 = mo78415L3().mo75074j3().mo84676a().f170523d;
                    int i4 = mo78415L3().mo75074j3().mo84676a().f170524e;
                    FinderFeedReportObject finderFeedReportObject8 = C58408t0.f167337b;
                    if (finderFeedReportObject8 != null) {
                        if (arrayList != null) {
                            HashSet hashSet = new HashSet();
                            Iterator<C64589nq2> it = arrayList.iterator();
                            while (it.hasNext()) {
                                String str5 = it.next().f184530d;
                                if (str5 == null) {
                                    str5 = str3;
                                }
                                hashSet.add(str5);
                            }
                            finderFeedReportObject8.mentionCount = hashSet.size();
                        }
                        finderFeedReportObject8.clickMentionCount = i3;
                        finderFeedReportObject8.clickSucMentionCount = i4;
                        if (arrayList != null) {
                            i = arrayList.size();
                        }
                        finderFeedReportObject8.mentionRepeatCount = i;
                    }
                    String string = getString(C0966R.string.eta);
                    if (mo78410F3().f152985z > 0) {
                        string = getString(C0966R.string.etb);
                    }
                    C76879j.m92710D(getActivity(), string, "", getString(C0966R.string.etd), getString(C0966R.string.etc), true, new C56176h(this), new C56177i(this), C0966R.color.f3040d0);
                    return;
                }
            }
            FinderFeedReportObject finderFeedReportObject9 = C58408t0.f167337b;
            if (finderFeedReportObject9 != null) {
                finderFeedReportObject9.exitPageId = 4;
                finderFeedReportObject9.sendOrExitButtonTime = C31543z5.m39453c();
                FinderFeedReportObject finderFeedReportObject10 = C58408t0.f167337b;
                if (finderFeedReportObject10 != null) {
                    C61926c.m72661F("Finder.FinderPostReportLogic", new C58412u0(finderFeedReportObject10, false));
                }
            }
            mo78419P3(0);
            this.f160263R = true;
            if (C54264e.f152304b != null) {
                Log.m105924i("Finder.PostCallbackMgr", "doCallback state:" + 1 + " errMsg:" + str3);
                C60213x3 x3Var = C54264e.f152304b;
                if (x3Var != null) {
                    x3Var.mo5408a(1, str3);
                }
                C54264e.f152304b = null;
                getActivity().finish();
            } else {
                mo78420Q3(false);
            }
            C59266a aVar = C59266a.f169452a;
            FinderFeedReportObject finderFeedReportObject11 = C58408t0.f167337b;
            if (!(finderFeedReportObject11 == null || (str = finderFeedReportObject11.flowId) == null)) {
                str3 = str;
            }
            C59268c cVar = C59267b.f169453a;
            aVar.mo84410b(str3, C59267b.f169460h);
            return;
        }
        C76879j.m92710D(getActivity(), getString(C0966R.string.f360747mt1), "", getString(C0966R.string.f360746mt0), getString(C0966R.string.msz), true, (DialogInterface.OnClickListener) null, new C54263c1(this), C0966R.color.f3040d0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0059 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7 A[SYNTHETIC] */
    /* renamed from: k3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78429k3(android.content.Intent r13) {
        /*
            r12 = this;
            java.lang.Class<ao1.y> r0 = ao1.C0192y.class
            java.lang.Class<ao1.g0> r1 = ao1.C0152g0.class
            if (r13 == 0) goto L_0x014b
            java.lang.String r2 = "key_activity_jump_info_list"
            java.io.Serializable r2 = r13.getSerializableExtra(r2)
            boolean r3 = r2 instanceof java.util.List
            r4 = 0
            if (r3 == 0) goto L_0x0014
            java.util.List r2 = (java.util.List) r2
            goto L_0x0015
        L_0x0014:
            r2 = r4
        L_0x0015:
            if (r2 == 0) goto L_0x00fa
            bl3.r r3 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r5 = r12.getActivity()
            bl3.r$a r5 = r3.mo62444c(r5)
            androidx.lifecycle.i0 r5 = r5.mo75002a(r1)
            ao1.g0 r5 = (ao1.C0152g0) r5
            boolean r6 = r5.f591e
            java.lang.String r7 = ""
            java.lang.String r8 = "safeParser"
            r9 = 1
            r10 = 0
            if (r6 == 0) goto L_0x0096
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x0096
            java.lang.String r6 = "key_activity_already_participate"
            boolean r6 = r13.getBooleanExtra(r6, r10)
            if (r6 != 0) goto L_0x0096
            androidx.appcompat.app.AppCompatActivity r6 = r12.getActivity()
            bl3.r$a r3 = r3.mo62444c(r6)
            androidx.lifecycle.i0 r0 = r3.mo75002a(r0)
            ao1.y r0 = (ao1.C0192y) r0
            r0.mo175i3()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0059:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0080
            java.lang.Object r3 = r2.next()
            byte[] r3 = (byte[]) r3
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r6 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r6.<init>()
            if (r3 != 0) goto L_0x006d
            goto L_0x0079
        L_0x006d:
            r6.parseFrom(r3)     // Catch:{ Exception -> 0x0071 }
            goto L_0x007a
        L_0x0071:
            r3 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r10] = r3
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r8, r7, r6)
        L_0x0079:
            r6 = r4
        L_0x007a:
            if (r6 == 0) goto L_0x0059
            r0.add(r6)
            goto L_0x0059
        L_0x0080:
            rx3.g r2 = r5.f594h
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            bt1.e r2 = (bt1.C54563e) r2
            java.lang.Object r3 = sx3.C110818d0.m150916N(r0)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r3
            r2.f152946D = r3
            r5.mo144e3(r0, r10)
            goto L_0x00f8
        L_0x0096:
            boolean r6 = r2.isEmpty()
            r6 = r6 ^ r9
            if (r6 == 0) goto L_0x00ae
            androidx.appcompat.app.AppCompatActivity r6 = r12.getActivity()
            bl3.r$a r3 = r3.mo62444c(r6)
            androidx.lifecycle.i0 r0 = r3.mo75002a(r0)
            ao1.y r0 = (ao1.C0192y) r0
            r0.mo175i3()
        L_0x00ae:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r2.iterator()
        L_0x00b7:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00de
            java.lang.Object r6 = r3.next()
            byte[] r6 = (byte[]) r6
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r11 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r11.<init>()
            if (r6 != 0) goto L_0x00cb
            goto L_0x00d7
        L_0x00cb:
            r11.parseFrom(r6)     // Catch:{ Exception -> 0x00cf }
            goto L_0x00d8
        L_0x00cf:
            r6 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r8, r7, r11)
        L_0x00d7:
            r11 = r4
        L_0x00d8:
            if (r11 == 0) goto L_0x00b7
            r0.add(r11)
            goto L_0x00b7
        L_0x00de:
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r9
            rx3.g r3 = r5.f594h
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            bt1.e r3 = (bt1.C54563e) r3
            java.lang.Object r4 = sx3.C110818d0.m150916N(r0)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r4
            r3.f152946D = r4
            r5.mo144e3(r0, r2)
        L_0x00f8:
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x00fa:
            if (r4 != 0) goto L_0x010f
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r2 = r12.getActivity()
            bl3.r$a r0 = r0.mo62444c(r2)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            ao1.g0 r0 = (ao1.C0152g0) r0
            r0.getClass()
        L_0x010f:
            java.lang.String r0 = "key_activity_post_wording"
            java.lang.String r1 = r13.getStringExtra(r0)
            if (r1 == 0) goto L_0x014b
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x014b
            java.lang.String r13 = r13.getStringExtra(r0)
            ao1.t r0 = r12.mo78415L3()
            com.tencent.mm.plugin.finder.view.FinderPostEditText r0 = r0.mo75070e3()
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            ao1.t r1 = r12.mo78415L3()
            com.tencent.mm.plugin.finder.view.FinderPostEditText r1 = r1.mo75070e3()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r1.setText(r13)
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.post.PostMainUIC.mo78429k3(android.content.Intent):void");
    }

    /* renamed from: l3 */
    public final View mo78430l3() {
        return (View) ((C36570n) this.f160250D).getValue();
    }

    /* renamed from: m3 */
    public final View mo78431m3() {
        return (View) ((C36570n) this.f160249C).getValue();
    }

    /* renamed from: n3 */
    public final C7493o mo78432n3() {
        C7493o oVar = this.f160284u;
        if (oVar != null) {
            return oVar;
        }
        C87412m.m108603p("extendLinkWidget");
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.tencent.mm.protocal.protobuf.FinderJumpInfo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedList<com.tencent.p014mm.protocal.protobuf.FinderJumpInfo> mo78433o3(boolean r5) {
        /*
            r4 = this;
            ao1.y r0 = r4.mo78416M3()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            ao1.g0 r2 = r0.mo174f3()
            dr1.d0 r2 = r2.f592f
            r3 = 0
            if (r2 == 0) goto L_0x0017
            java.util.List r2 = r2.mo8616b()
            goto L_0x0018
        L_0x0017:
            r2 = r3
        L_0x0018:
            if (r2 == 0) goto L_0x001d
            r1.addAll(r2)
        L_0x001d:
            dr1.l r0 = r0.f660e
            if (r0 == 0) goto L_0x002c
            java.util.List<? extends com.tencent.mm.protocal.protobuf.FinderJumpInfo> r0 = r0.f25724e
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            r3 = r0
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r3
        L_0x002c:
            if (r3 == 0) goto L_0x0033
            if (r5 != 0) goto L_0x0033
            r1.add(r3)
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.post.PostMainUIC.mo78433o3(boolean):java.util.LinkedList");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: te3.nq2} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v14, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r18, int r19, android.content.Intent r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r20
            super.onActivityResult(r18, r19, r20)
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r8 = ""
            if (r0 == r7) goto L_0x02e7
            java.lang.String r7 = "saveActivity"
            java.lang.String r9 = "activityWidget"
            java.lang.String r10 = "key_activity_type"
            java.lang.String r11 = "key_scene_from_post"
            java.lang.String r12 = "key_activity_src_type"
            r13 = 2
            r14 = 100
            r15 = -1
            switch(r0) {
                case 20000: goto L_0x0279;
                case 20001: goto L_0x00ba;
                case 20002: goto L_0x0092;
                case 20003: goto L_0x006a;
                case 20004: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x044d
        L_0x0027:
            ao1.y r0 = r17.mo78416M3()
            if (r2 != r15) goto L_0x044d
            if (r3 == 0) goto L_0x044d
            r0.mo172d3()
            dr1.l r2 = r0.f660e
            if (r2 == 0) goto L_0x044d
            ao1.d0 r7 = new ao1.d0
            r7.<init>(r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r0.<init>()
            java.lang.String r10 = "JUMP_INFO"
            byte[] r3 = r3.getByteArrayExtra(r10)
            if (r3 != 0) goto L_0x004e
            goto L_0x005e
        L_0x004e:
            r0.parseFrom(r3)     // Catch:{ Exception -> 0x0053 }
            r6 = r0
            goto L_0x005e
        L_0x0053:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r3
            java.lang.String r3 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r8, r0)
        L_0x005e:
            if (r6 == 0) goto L_0x0063
            r9.add(r6)
        L_0x0063:
            r2.mo8615a(r9)
            r2.f25725f = r7
            goto L_0x044d
        L_0x006a:
            if (r2 != r15) goto L_0x044d
            if (r3 == 0) goto L_0x044d
            dr1.a r0 = r1.f160287x
            if (r0 == 0) goto L_0x008e
            r0.mo8614j(r3)
            android.content.Intent r0 = r17.getIntent()
            r0.putExtra(r12, r11)
            int r0 = r3.getIntExtra(r10, r14)
            if (r0 != r14) goto L_0x0089
            android.content.Intent r0 = r17.getIntent()
            r0.putExtra(r7, r5)
        L_0x0089:
            r1.mo78429k3(r3)
            goto L_0x044d
        L_0x008e:
            gy3.C87412m.m108603p(r9)
            throw r6
        L_0x0092:
            if (r2 != r15) goto L_0x044d
            if (r3 == 0) goto L_0x044d
            dr1.a r0 = r1.f160287x
            if (r0 == 0) goto L_0x00b6
            r0.mo8614j(r3)
            android.content.Intent r0 = r17.getIntent()
            r0.putExtra(r12, r11)
            int r0 = r3.getIntExtra(r10, r14)
            if (r0 != r14) goto L_0x00b1
            android.content.Intent r0 = r17.getIntent()
            r0.putExtra(r7, r5)
        L_0x00b1:
            r1.mo78429k3(r3)
            goto L_0x044d
        L_0x00b6:
            gy3.C87412m.m108603p(r9)
            throw r6
        L_0x00ba:
            androidx.appcompat.app.AppCompatActivity r0 = r17.getActivity()
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r0, r7)
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            r0.showVKB()
            ao1.t r7 = r17.mo78415L3()
            if (r3 == 0) goto L_0x044d
            java.lang.String r0 = "key_scene"
            int r9 = r3.getIntExtra(r0, r4)
            r10 = 64
            java.lang.String r11 = "this as java.lang.String…ing(startIndex, endIndex)"
            if (r2 != r15) goto L_0x01fc
            java.lang.String r0 = "key_source"
            int r2 = r3.getIntExtra(r0, r13)
            java.lang.String r0 = "key_select_contact"
            byte[] r0 = r3.getByteArrayExtra(r0)
            if (r0 == 0) goto L_0x0103
            te3.nq2 r3 = new te3.nq2     // Catch:{ Exception -> 0x00f3 }
            r3.<init>()     // Catch:{ Exception -> 0x00f3 }
            r3.parseFrom(r0)     // Catch:{ Exception -> 0x00f3 }
            r6 = r3
            goto L_0x0103
        L_0x00f3:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r3[r5] = r0
            java.lang.String r0 = "Finder.FinderPostUI"
            java.lang.String r12 = "onActivityResult LocalFinderAtContact parseFrom:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r12, r3)
        L_0x0103:
            if (r6 == 0) goto L_0x044d
            java.lang.String r0 = r6.f184532f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x044d
            gs1.i r0 = r7.mo75074j3()
            gs1.c r0 = r0.mo84676a()
            java.lang.String r3 = r6.f184532f
            if (r3 != 0) goto L_0x011a
            r3 = r8
        L_0x011a:
            r0.mo84675b(r2, r3)
            gs1.i r0 = r7.mo75074j3()
            gs1.c r0 = r0.mo84676a()
            java.util.HashMap<java.lang.String, te3.nq2> r0 = r0.f170520a
            java.lang.String r2 = r6.f184532f
            if (r2 != 0) goto L_0x012c
            goto L_0x012d
        L_0x012c:
            r8 = r2
        L_0x012d:
            r0.put(r8, r6)
            com.tencent.mm.plugin.finder.view.FinderPostEditText r0 = r7.mo75070e3()
            int r0 = r0.getSelectionEnd()
            com.tencent.mm.plugin.finder.view.FinderPostEditText r2 = r7.mo75070e3()
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            if (r9 != r13) goto L_0x019a
            com.tencent.mm.plugin.finder.view.FinderPostEditText r3 = r7.mo75070e3()
            int r3 = r3.getSelectionEnd()
            if (r3 <= 0) goto L_0x019a
            int r0 = r3 + -1
            r8 = 1
        L_0x0153:
            if (r0 < 0) goto L_0x016e
            if (r8 == 0) goto L_0x016e
            com.tencent.mm.plugin.finder.view.FinderPostEditText r9 = r7.mo75070e3()
            android.text.Editable r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            char r9 = r9.charAt(r0)
            if (r9 != r10) goto L_0x016c
            int r0 = r0 + -1
            goto L_0x0153
        L_0x016c:
            r8 = 0
            goto L_0x0153
        L_0x016e:
            int r0 = r0 + r4
            int r4 = r2.length()
            if (r0 <= r4) goto L_0x0179
            int r0 = r2.length()
        L_0x0179:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = r2.substring(r5, r0)
            gy3.C87412m.m108593f(r8, r11)
            r4.append(r8)
            int r8 = r2.length()
            java.lang.String r2 = r2.substring(r3, r8)
            gy3.C87412m.m108593f(r2, r11)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L_0x019a:
            int r3 = r2.length()
            if (r0 <= r3) goto L_0x01a4
            int r0 = r2.length()
        L_0x01a4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r2.substring(r5, r0)
            gy3.C87412m.m108593f(r4, r11)
            r3.append(r4)
            r3.append(r10)
            java.lang.String r4 = r6.f184532f
            r3.append(r4)
            r4 = 32
            r3.append(r4)
            int r4 = r2.length()
            java.lang.String r2 = r2.substring(r0, r4)
            gy3.C87412m.m108593f(r2, r11)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = r6.f184532f
            if (r3 == 0) goto L_0x01da
            int r5 = r3.length()
        L_0x01da:
            int r0 = r0 + r5
            int r0 = r0 + r13
            com.tencent.mm.plugin.finder.view.FinderPostEditText r3 = r7.mo75070e3()
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            android.app.Activity r5 = r7.getContext()
            android.text.SpannableString r2 = r4.mo107057T1(r5, r2)
            r3.setText(r2)
            com.tencent.mm.plugin.finder.view.FinderPostEditText r2 = r7.mo75070e3()
            r2.setSelection(r0)
            goto L_0x044d
        L_0x01fc:
            gs1.i r0 = r7.mo75074j3()
            gs1.c r0 = r0.mo84676a()
            r0.mo84675b(r5, r8)
            if (r9 != r13) goto L_0x044d
            com.tencent.mm.plugin.finder.view.FinderPostEditText r0 = r7.mo75070e3()
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            com.tencent.mm.plugin.finder.view.FinderPostEditText r2 = r7.mo75070e3()
            int r2 = r2.getSelectionEnd()
            if (r2 <= 0) goto L_0x044d
            int r3 = r2 + -1
            r6 = 1
        L_0x0222:
            if (r3 < 0) goto L_0x023d
            if (r6 == 0) goto L_0x023d
            com.tencent.mm.plugin.finder.view.FinderPostEditText r8 = r7.mo75070e3()
            android.text.Editable r8 = r8.getText()
            java.lang.String r8 = r8.toString()
            char r8 = r8.charAt(r3)
            if (r8 != r10) goto L_0x023b
            int r3 = r3 + -1
            goto L_0x0222
        L_0x023b:
            r6 = 0
            goto L_0x0222
        L_0x023d:
            int r3 = r3 + r4
            int r4 = r0.length()
            if (r3 <= r4) goto L_0x0248
            int r3 = r0.length()
        L_0x0248:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r0.substring(r5, r3)
            gy3.C87412m.m108593f(r5, r11)
            r4.append(r5)
            int r5 = r0.length()
            java.lang.String r0 = r0.substring(r2, r5)
            gy3.C87412m.m108593f(r0, r11)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.mm.plugin.finder.view.FinderPostEditText r2 = r7.mo75070e3()
            r2.setText(r0)
            com.tencent.mm.plugin.finder.view.FinderPostEditText r0 = r7.mo75070e3()
            r0.setSelection(r3)
            goto L_0x044d
        L_0x0279:
            ao1.l0 r0 = r17.mo78417N3()
            if (r3 == 0) goto L_0x044d
            com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r0.f152311e
            if (r2 == 0) goto L_0x02e1
            r4 = 8
            r2.setVisibility(r4)
            fe1.h r2 = r0.f152310d
            java.lang.String r4 = "locationWidget"
            if (r2 == 0) goto L_0x02dd
            r2.mo83369h(r3)
            fe1.h r2 = r0.f152310d
            if (r2 == 0) goto L_0x02d9
            r2.mo83371k()
            fe1.h r0 = r0.f152310d
            if (r0 == 0) goto L_0x02d5
            te3.db1 r0 = r0.mo83363a()
            if (r0 == 0) goto L_0x044d
            java.lang.String r2 = r0.f182664g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x02c0
            java.lang.String r2 = r0.f182663f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x02b3
            goto L_0x02c0
        L_0x02b3:
            r2 = 3
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r3 = dp1.C58408t0.f167337b
            if (r3 == 0) goto L_0x044d
            r3.lbsFlag = r2
            r3.selectLocation = r0
            r3.recommend_lbs_position = r15
            goto L_0x044d
        L_0x02c0:
            java.lang.String r2 = "get_poi_is_search"
            boolean r2 = r3.getBooleanExtra(r2, r5)
            if (r2 == 0) goto L_0x02c9
            r13 = 4
        L_0x02c9:
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r2 = dp1.C58408t0.f167337b
            if (r2 == 0) goto L_0x044d
            r2.lbsFlag = r13
            r2.selectLocation = r0
            r2.recommend_lbs_position = r15
            goto L_0x044d
        L_0x02d5:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x02d9:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x02dd:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x02e1:
            java.lang.String r0 = "lbsRecyclerView"
            gy3.C87412m.m108603p(r0)
            throw r6
        L_0x02e7:
            if (r3 == 0) goto L_0x02f0
            java.lang.String r0 = "RESULT_COVER_FULL_PATH"
            java.lang.String r0 = r3.getStringExtra(r0)
            goto L_0x02f1
        L_0x02f0:
            r0 = r6
        L_0x02f1:
            if (r3 == 0) goto L_0x02fa
            java.lang.String r2 = "RESULT_COVER_PATH"
            java.lang.String r2 = r3.getStringExtra(r2)
            goto L_0x02fb
        L_0x02fa:
            r2 = r6
        L_0x02fb:
            if (r3 == 0) goto L_0x0308
            java.lang.String r7 = "RESULT_COVER_QUALITY"
            int r7 = r3.getIntExtra(r7, r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0309
        L_0x0308:
            r7 = r6
        L_0x0309:
            if (r3 == 0) goto L_0x0314
            java.lang.String r9 = "RESULT_CROP_INFO"
            android.os.Parcelable r9 = r3.getParcelableExtra(r9)
            com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable r9 = (com.tencent.p014mm.plugin.finder.video.LocalVideoCropInfoParcelable) r9
            goto L_0x0315
        L_0x0314:
            r9 = r6
        L_0x0315:
            if (r9 != 0) goto L_0x031c
            com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable r9 = new com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable
            r9.<init>()
        L_0x031c:
            if (r3 == 0) goto L_0x0325
            java.lang.String r10 = "RESULT_COVER_STYLE"
            int r10 = r3.getIntExtra(r10, r5)
            goto L_0x0326
        L_0x0325:
            r10 = 0
        L_0x0326:
            r11 = 0
            if (r3 == 0) goto L_0x0330
            java.lang.String r13 = "RESULT_COVER_TIME_MS"
            long r11 = r3.getLongExtra(r13, r11)
        L_0x0330:
            te3.wi0 r13 = new te3.wi0
            r13.<init>()
            if (r3 == 0) goto L_0x0342
            java.lang.String r14 = "RESULT_COVER_WORD_INFO_WRAP"
            byte[] r14 = r3.getByteArrayExtra(r14)
            if (r14 == 0) goto L_0x0342
            r13.parseFrom(r14)
        L_0x0342:
            te3.kj0 r14 = new te3.kj0
            r14.<init>()
            if (r3 == 0) goto L_0x0354
            java.lang.String r15 = "RESULT_COVER_CROP_MODEL"
            byte[] r3 = r3.getByteArrayExtra(r15)
            if (r3 == 0) goto L_0x0354
            r14.parseFrom(r3)
        L_0x0354:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x044d
            bt1.e r3 = r17.mo78410F3()
            if (r0 != 0) goto L_0x0361
            r0 = r8
        L_0x0361:
            if (r2 != 0) goto L_0x0364
            r2 = r8
        L_0x0364:
            if (r7 == 0) goto L_0x036b
            int r7 = r7.intValue()
            goto L_0x036c
        L_0x036b:
            r7 = 0
        L_0x036c:
            android.os.Bundle r15 = r3.f152962c
            java.lang.String r4 = "VIDEO_FULL_COVER_URL"
            r15.putString(r4, r0)
            android.content.Intent r15 = r3.f152960a
            r15.putExtra(r4, r0)
            android.os.Bundle r4 = r3.f152962c
            java.lang.String r15 = "VIDEO_COVER_URL"
            r4.putString(r15, r2)
            android.content.Intent r4 = r3.f152960a
            r4.putExtra(r15, r2)
            android.os.Bundle r4 = r3.f152962c
            java.lang.String r15 = "VIDEO_COVER_QUALITY"
            r4.putInt(r15, r7)
            android.content.Intent r4 = r3.f152960a
            r4.putExtra(r15, r7)
            android.os.Bundle r4 = r3.f152962c
            java.lang.String r15 = "VIDEO_COVER_STYLE"
            r4.putInt(r15, r10)
            android.content.Intent r4 = r3.f152960a
            r4.putExtra(r15, r10)
            android.os.Bundle r4 = r3.f152962c
            java.lang.String r15 = "VIDEO_COVER_TIME_MS"
            r4.putLong(r15, r11)
            android.os.Bundle r4 = r3.f152962c
            byte[] r14 = r14.toByteArray()
            java.lang.String r15 = "VIDEO_COVER_CROP_MODEL"
            r4.putByteArray(r15, r14)
            android.os.Bundle r4 = r3.f152962c
            byte[] r13 = r13.toByteArray()
            java.lang.String r14 = "VIDEO_COVER_INFO_WRAP"
            r4.putByteArray(r14, r13)
            te3.jr2 r4 = r9.f161940d
            if (r4 == 0) goto L_0x0407
            java.util.ArrayList<android.os.Parcelable> r9 = r3.f152967h
            if (r9 == 0) goto L_0x0407
            int r13 = r9.size()
            if (r13 <= 0) goto L_0x03d2
            java.lang.Object r13 = r9.get(r5)
            boolean r13 = r13 instanceof com.tencent.p014mm.plugin.finder.video.LocalVideoCropInfoParcelable
            if (r13 == 0) goto L_0x03d2
            r16 = 1
            goto L_0x03d4
        L_0x03d2:
            r16 = 0
        L_0x03d4:
            if (r16 == 0) goto L_0x03d7
            r6 = r9
        L_0x03d7:
            if (r6 == 0) goto L_0x0407
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable"
            gy3.C87412m.m108592e(r5, r6)
            com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable r5 = (com.tencent.p014mm.plugin.finder.video.LocalVideoCropInfoParcelable) r5
            te3.jr2 r5 = r5.f161940d
            if (r5 != 0) goto L_0x03e9
            goto L_0x0439
        L_0x03e9:
            te3.zr4 r6 = r4.f183830d
            r5.f183830d = r6
            te3.zr4 r6 = r4.f183836j
            r5.f183836j = r6
            te3.bp1 r4 = r4.f183831e
            r5.f183831e = r4
            android.content.Intent r4 = r3.f152960a
            java.util.ArrayList<android.os.Parcelable> r5 = r3.f152967h
            java.lang.String r6 = "postVideoCropList"
            r4.putParcelableArrayListExtra(r6, r5)
            android.os.Bundle r4 = r3.f152962c
            java.util.ArrayList<android.os.Parcelable> r5 = r3.f152967h
            java.lang.String r6 = "VIDEO_CROP_LIST"
            r4.putParcelableArrayList(r6, r5)
        L_0x0407:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r3.f152943A
            if (r4 == 0) goto L_0x0439
            java.util.LinkedList<te3.rq2> r4 = r3.f152958P
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r4 != 0) goto L_0x0439
            java.util.LinkedList<te3.rq2> r3 = r3.f152958P
            if (r3 == 0) goto L_0x0439
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            te3.rq2 r3 = (te3.C64689rq2) r3
            if (r3 == 0) goto L_0x0439
            r3.f185261W = r0
            r3.f185283w = r2
            te3.xb1 r0 = r3.f185236C
            if (r0 != 0) goto L_0x0428
            goto L_0x042b
        L_0x0428:
            float r2 = (float) r7
            r0.f186283e = r2
        L_0x042b:
            r3.f185237D = r8
            r3.f185259V = r8
            r3.f185256T0 = r10
            te3.nr3 r0 = r3.f185258U0
            if (r0 != 0) goto L_0x0436
            goto L_0x0439
        L_0x0436:
            int r2 = (int) r11
            r0.f184546i = r2
        L_0x0439:
            bt1.b r0 = r1.f160283t
            if (r0 == 0) goto L_0x044d
            bt1.e r2 = r17.mo78410F3()
            android.os.Bundle r2 = r2.f152962c
            java.lang.String r3 = "data"
            gy3.C87412m.m108594g(r2, r3)
            r0.f152934b = r2
            r0.mo75444h()
        L_0x044d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.post.PostMainUIC.onActivityResult(int, int, android.content.Intent):void");
    }

    public boolean onBackPressed() {
        boolean z;
        C8437d dVar = mo78432n3().f25733e;
        if (dVar.f27441o) {
            dVar.mo9366a();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        mo78428j3();
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: java.lang.Class<com.tencent.mm.plugin.finder.post.PostMainUIC>} */
    /* JADX WARNING: type inference failed for: r2v126, types: [up1.y, gy3.h] */
    /* JADX WARNING: type inference failed for: r2v135 */
    /* JADX WARNING: type inference failed for: r2v141 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x08cd  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0931  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0976  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x09b3  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x09df  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x09e1  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x09e4  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0a05  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0ac0  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0cb9  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0cbb  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0cbe  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0cc3  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0d84  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0d8b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r38) {
        /*
            r37 = this;
            r1 = r37
            java.lang.Class<com.tencent.mm.plugin.finder.post.PostMainUIC> r2 = com.tencent.p014mm.plugin.finder.post.PostMainUIC.class
            super.onCreate(r38)
            androidx.appcompat.app.AppCompatActivity r0 = r37.getActivity()
            boolean r0 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            r3 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.app.AppCompatActivity r0 = r37.getActivity()
            gy3.C87412m.m108592e(r0, r5)
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            r0.setSelfNavigationBarVisible(r3)
            androidx.appcompat.app.AppCompatActivity r0 = r37.getActivity()
            gy3.C87412m.m108592e(r0, r5)
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            com.tencent.mm.ui.MMActivityController r0 = r0.getController()
            boolean r6 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            r0.mo177049H0(r6)
        L_0x0037:
            android.app.Activity r0 = r37.getContext()
            android.view.Window r0 = r0.getWindow()
            r6 = 2097280(0x200080, float:2.938915E-39)
            r0.addFlags(r6)
            android.app.Activity r0 = r37.getContext()
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.app.Activity r6 = r37.getContext()
            android.view.Window r6 = r6.getWindow()
            android.view.View r6 = r6.getDecorView()
            int r6 = r6.getSystemUiVisibility()
            r6 = r6 | 1024(0x400, float:1.435E-42)
            r6 = r6 | 256(0x100, float:3.59E-43)
            r0.setSystemUiVisibility(r6)
            bt1.e r0 = new bt1.e
            android.content.Intent r6 = r37.getIntent()
            r0.<init>(r6)
            r1.f160256J = r0
            zc1.b r0 = zc1.C66785b.f191882e
            java.lang.String r0 = r0.mo90662O5()
            r1.f160272f = r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x008b
            fe1.d$b r0 = fe1.C58961d.f168673a
            java.lang.String r6 = r1.f160272f
            fe1.q r0 = r0.mo84155b(r6)
            r1.f160273g = r0
        L_0x008b:
            android.content.Intent r0 = r37.getIntent()
            r6 = -1
            java.lang.String r7 = "key_finder_post_from"
            int r0 = r0.getIntExtra(r7, r6)
            r1.f160262Q = r0
            pl1.e0$a r0 = pl1.C11978e0.C11979a.AVATAR
            java.lang.Class<ny.h> r6 = p629ny.C76979h.class
            java.lang.Class<pl1.s0> r7 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r8 = ht1.C60200t1.class
            androidx.appcompat.app.AppCompatActivity r9 = r37.getActivity()
            gy3.C87412m.m108592e(r9, r5)
            com.tencent.mm.ui.MMActivity r9 = (com.tencent.p014mm.p136ui.MMActivity) r9
            java.lang.String r10 = ""
            r9.setMMTitle((java.lang.String) r10)
            android.content.res.Resources r11 = r37.getResources()
            r12 = 2131099688(0x7f060028, float:1.7811736E38)
            int r11 = r11.getColor(r12)
            r9.setActionbarColor(r11)
            r11 = 2131311149(0x7f093a2d, float:1.824063E38)
            android.view.View r11 = r9.findViewById(r11)
            java.lang.String r12 = "activity.findViewById(co…t_media_widget_container)"
            gy3.C87412m.m108593f(r11, r12)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r1.f160276j = r11
            r11 = 2131311122(0x7f093a12, float:1.8240575E38)
            android.view.View r11 = r9.findViewById(r11)
            java.lang.String r12 = "activity.findViewById(co….finder.R.id.post_avatar)"
            gy3.C87412m.m108593f(r11, r12)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r1.f160274h = r11
            r11 = 2131311150(0x7f093a2e, float:1.8240632E38)
            android.view.View r11 = r9.findViewById(r11)
            java.lang.String r12 = "activity.findViewById(co…inder.R.id.post_nickname)"
            gy3.C87412m.m108593f(r11, r12)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1.f160275i = r11
            r11 = 2131312857(0x7f0940d9, float:1.8244094E38)
            android.view.View r11 = r9.findViewById(r11)
            java.lang.String r12 = "activity.findViewById(co….finder.R.id.scroll_view)"
            gy3.C87412m.m108593f(r11, r12)
            android.widget.ScrollView r11 = (android.widget.ScrollView) r11
            r1.f160277n = r11
            r11 = 2131298258(0x7f0907d2, float:1.8214484E38)
            android.view.View r11 = r9.findViewById(r11)
            java.lang.String r12 = "activity.findViewById(co…finder.R.id.bottom_space)"
            gy3.C87412m.m108593f(r11, r12)
            r1.f160278o = r11
            r11 = 2131301365(0x7f0913f5, float:1.8220786E38)
            android.view.View r11 = r9.findViewById(r11)
            java.lang.String r12 = "activity.findViewById(co…inder.R.id.edt_container)"
            gy3.C87412m.m108593f(r11, r12)
            r1.f160279p = r11
            r11 = 2131313514(0x7f09436a, float:1.8245427E38)
            android.view.View r12 = r9.findViewById(r11)
            java.lang.String r13 = "activity.findViewById(co…ort_title_edit_container)"
            gy3.C87412m.m108593f(r12, r13)
            r1.f160280q = r12
            dr1.u r12 = new dr1.u
            r14 = 2131299550(0x7f090cde, float:1.8217105E38)
            android.view.View r14 = r9.findViewById(r14)
            java.lang.String r15 = "activity.findViewById(co….id.choose_original_view)"
            gy3.C87412m.m108593f(r14, r15)
            com.tencent.mm.plugin.finder.view.FinderChooseOriginalView r14 = (com.tencent.p014mm.plugin.finder.view.FinderChooseOriginalView) r14
            r12.<init>(r9, r14)
            r1.f160285v = r12
            dr1.z r12 = new dr1.z
            r14 = 2131299548(0x7f090cdc, float:1.82171E38)
            android.view.View r14 = r9.findViewById(r14)
            java.lang.String r15 = "activity.findViewById(co…er.R.id.choose_news_view)"
            gy3.C87412m.m108593f(r14, r15)
            com.tencent.mm.plugin.finder.view.FinderChooseNewsView r14 = (com.tencent.p014mm.plugin.finder.view.FinderChooseNewsView) r14
            r12.<init>(r9, r14)
            r1.f160286w = r12
            r12 = 2131299538(0x7f090cd2, float:1.821708E38)
            android.view.View r12 = r9.findViewById(r12)
            java.lang.String r14 = "activity.findViewById(co….id.choose_activity_view)"
            gy3.C87412m.m108593f(r12, r14)
            com.tencent.mm.plugin.finder.view.FinderExtendActivityView r12 = (com.tencent.p014mm.plugin.finder.view.FinderExtendActivityView) r12
            r1.f160288y = r12
            dr1.a r14 = new dr1.a
            r14.<init>(r12)
            r1.f160287x = r14
            r12 = 2131311125(0x7f093a15, float:1.8240581E38)
            android.view.View r12 = r9.findViewById(r12)
            com.tencent.mm.plugin.finder.view.FinderJumperView r12 = (com.tencent.p014mm.plugin.finder.view.FinderJumperView) r12
            dr1.v r14 = new dr1.v
            java.lang.String r15 = "postMusicView"
            gy3.C87412m.m108593f(r12, r15)
            r14.<init>(r9, r12)
            r1.f160248B = r14
            r12 = 2131311182(0x7f093a4e, float:1.8240697E38)
            android.view.View r12 = r9.findViewById(r12)
            java.lang.String r14 = "activity.findViewById(co…er.R.id.post_origin_view)"
            gy3.C87412m.m108593f(r12, r14)
            com.tencent.mm.plugin.finder.view.FinderPostOriginView r12 = (com.tencent.p014mm.plugin.finder.view.FinderPostOriginView) r12
            r1.f160289z = r12
            dr1.y r14 = new dr1.y
            r14.<init>(r12)
            r1.f160247A = r14
            dr1.v r12 = r1.f160248B
            if (r12 == 0) goto L_0x0dba
            r14.f25760b = r12
            com.tencent.mm.ui.tools.KeyboardHeightProvider r12 = new com.tencent.mm.ui.tools.KeyboardHeightProvider
            r12.<init>(r9)
            r1.f160255I = r12
            java.lang.String r12 = r1.f160270d
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r11 = "postOriginView :"
            r14.append(r11)
            com.tencent.mm.plugin.finder.view.FinderPostOriginView r11 = r1.f160289z
            if (r11 == 0) goto L_0x0db3
            int r11 = r11.getVisibility()
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            android.app.Activity r11 = r37.getContext()
            r12 = 1099431936(0x41880000, float:17.0)
            java.lang.String r14 = "context"
            gy3.C87412m.m108594g(r11, r14)
            java.lang.String r14 = "window"
            java.lang.Object r14 = r11.getSystemService(r14)
            java.lang.String r3 = "null cannot be cast to non-null type android.view.WindowManager"
            gy3.C87412m.m108592e(r14, r3)
            android.view.WindowManager r14 = (android.view.WindowManager) r14
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics
            r3.<init>()
            android.view.Display r14 = r14.getDefaultDisplay()
            if (r14 == 0) goto L_0x01e5
            r14.getMetrics(r3)
        L_0x01e5:
            float r3 = r3.density
            android.content.res.Resources r11 = r11.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r12 = r12 * r3
            float r12 = r12 / r11
            rx3.g r3 = r1.f160251E
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            boolean r11 = r3 instanceof android.widget.TextView
            if (r11 == 0) goto L_0x0205
            android.widget.TextView r3 = (android.widget.TextView) r3
            goto L_0x0206
        L_0x0205:
            r3 = 0
        L_0x0206:
            r11 = 1
            if (r3 == 0) goto L_0x020c
            r3.setTextSize(r11, r12)
        L_0x020c:
            i33.b r3 = i33.C98595b.f289089a
            rx3.g r14 = r1.f160251E
            rx3.n r14 = (rx3.C36570n) r14
            java.lang.Object r14 = r14.getValue()
            android.view.View r14 = (android.view.View) r14
            java.lang.String r15 = "backBtn"
            gy3.C87412m.m108593f(r14, r15)
            r3.mo137988f(r14)
            android.widget.TextView r14 = r37.mo78411G3()
            if (r14 == 0) goto L_0x0229
            r14.setTextSize(r11, r12)
        L_0x0229:
            android.widget.TextView r14 = r37.mo78411G3()
            java.lang.String r15 = "sendBtn"
            gy3.C87412m.m108593f(r14, r15)
            r3.mo137988f(r14)
            bt1.e r14 = r37.mo78410F3()
            boolean r14 = r14.mo75460h()
            r15 = 0
            if (r14 == 0) goto L_0x0262
            bt1.e r14 = r37.mo78410F3()
            java.lang.String r14 = r14.f152954L
            if (r14 == 0) goto L_0x0252
            int r14 = r14.length()
            if (r14 != 0) goto L_0x0250
            goto L_0x0252
        L_0x0250:
            r14 = 0
            goto L_0x0253
        L_0x0252:
            r14 = 1
        L_0x0253:
            if (r14 != 0) goto L_0x0262
            android.widget.TextView r14 = r37.mo78411G3()
            bt1.e r11 = r37.mo78410F3()
            java.lang.String r11 = r11.f152954L
            r14.setText(r11)
        L_0x0262:
            android.content.Intent r11 = r37.getIntent()
            java.lang.String r14 = "KEY_SHOW_FINDER_ACTION_BAR_TITLE"
            boolean r11 = r11.getBooleanExtra(r14, r15)
            if (r11 == 0) goto L_0x02ac
            rx3.g r11 = r1.f160253G
            rx3.n r11 = (rx3.C36570n) r11
            java.lang.Object r11 = r11.getValue()
            android.widget.TextView r11 = (android.widget.TextView) r11
            r14 = 1
            r11.setTextSize(r14, r12)
            rx3.g r11 = r1.f160253G
            rx3.n r11 = (rx3.C36570n) r11
            java.lang.Object r11 = r11.getValue()
            android.widget.TextView r11 = (android.widget.TextView) r11
            java.lang.String r12 = "titleTv"
            gy3.C87412m.m108593f(r11, r12)
            r3.mo137988f(r11)
            rx3.g r3 = r1.f160253G
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.widget.TextView r3 = (android.widget.TextView) r3
            gy3.C87412m.m108593f(r3, r12)
            er1.C7919x.m8091a(r3)
            rx3.g r3 = r1.f160253G
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setVisibility(r15)
        L_0x02ac:
            r3 = 2131312858(0x7f0940da, float:1.8244096E38)
            android.view.View r3 = r9.findViewById(r3)
            ao1.u0 r11 = new ao1.u0
            r11.<init>(r9)
            r3.setOnClickListener(r11)
            rx3.g r3 = r1.f160254H
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r11 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r11 == 0) goto L_0x02d0
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x02d1
        L_0x02d0:
            r3 = 0
        L_0x02d1:
            if (r3 == 0) goto L_0x02dc
            int r11 = r3.topMargin
            int r12 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r9)
            int r11 = r11 + r12
            r3.topMargin = r11
        L_0x02dc:
            fe1.q r3 = r1.f160273g
            java.lang.String r11 = "nickTv"
            java.lang.String r12 = "avatarIv"
            java.lang.String r14 = "activityPostView"
            if (r3 == 0) goto L_0x0460
            r18 = r2
            r15 = 1
            te3.cg r2 = fe1.C58960c.m68830b(r3, r15)
            r15 = 2131298138(0x7f09075a, float:1.821424E38)
            if (r2 == 0) goto L_0x039e
            r27 = r13
            android.view.View r13 = r9.findViewById(r15)
            if (r13 != 0) goto L_0x02fd
            r28 = r10
            goto L_0x0343
        L_0x02fd:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r19 = k20.C60958c.f173611a
            r28 = r10
            r17 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r17)
            r15.mo10233c(r10)
            java.lang.Object[] r20 = r15.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/post/PostMainUIC"
            java.lang.String r22 = "initView"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r13
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r10 = 0
            java.lang.Object r15 = r15.mo10231a(r10)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r10 = r15.intValue()
            r13.setVisibility(r10)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/post/PostMainUIC"
            java.lang.String r21 = "initView"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x0343:
            bl3.r r10 = bl3.C39818r.f106831a
            bl3.r$a r13 = r10.mo62446e(r8)
            bl3.c r13 = r13.mo62447c(r7)
            pl1.s0 r13 = (pl1.C11990s0) r13
            k60.d r13 = r13.mo11872i2()
            pl1.f r15 = new pl1.f
            r19 = r5
            java.lang.String r5 = r2.f182470f
            r21 = r4
            r20 = r14
            r4 = 0
            r14 = 2
            r15.<init>(r5, r4, r14, r4)
            android.widget.ImageView r4 = r1.f160274h
            if (r4 == 0) goto L_0x0399
            bl3.r$a r5 = r10.mo62446e(r8)
            bl3.c r5 = r5.mo62447c(r7)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r5 = r5.mo11867O2(r0)
            r13.mo85957c(r15, r4, r5)
            android.widget.TextView r4 = r1.f160275i
            if (r4 == 0) goto L_0x0394
            di3.d r5 = di3.C86312j.m106911c(r6)
            ny.h r5 = (p629ny.C76979h) r5
            android.app.Activity r10 = r37.getContext()
            java.lang.String r2 = r2.f182469e
            android.text.SpannableString r2 = r5.mo107057T1(r10, r2)
            r4.setText(r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r16 = r2
            r2 = 0
            goto L_0x03ab
        L_0x0394:
            gy3.C87412m.m108603p(r11)
            r2 = 0
            throw r2
        L_0x0399:
            r2 = 0
            gy3.C87412m.m108603p(r12)
            throw r2
        L_0x039e:
            r21 = r4
            r19 = r5
            r28 = r10
            r27 = r13
            r20 = r14
            r2 = 0
            r16 = r2
        L_0x03ab:
            if (r16 != 0) goto L_0x044e
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r8)
            bl3.c r5 = r5.mo62447c(r7)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11872i2()
            pl1.f r10 = new pl1.f
            java.lang.String r13 = r3.field_avatarUrl
            r14 = 2
            r10.<init>(r13, r2, r14, r2)
            android.widget.ImageView r2 = r1.f160274h
            if (r2 == 0) goto L_0x0448
            bl3.r$a r4 = r4.mo62446e(r8)
            bl3.c r4 = r4.mo62447c(r7)
            pl1.s0 r4 = (pl1.C11990s0) r4
            n60.f r0 = r4.mo11867O2(r0)
            r5.mo85957c(r10, r2, r0)
            android.widget.TextView r0 = r1.f160275i
            if (r0 == 0) goto L_0x0442
            di3.d r2 = di3.C86312j.m106911c(r6)
            ny.h r2 = (p629ny.C76979h) r2
            android.app.Activity r4 = r37.getContext()
            java.lang.String r5 = r3.getNickname()
            android.text.SpannableString r2 = r2.mo107057T1(r4, r5)
            r0.setText(r2)
            r0 = 2131298138(0x7f09075a, float:1.821424E38)
            android.view.View r0 = r9.findViewById(r0)
            if (r0 != 0) goto L_0x03ff
            r4 = r21
            goto L_0x043f
        L_0x03ff:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = r21
            r2.mo10233c(r4)
            java.lang.Object[] r30 = r2.mo10232b()
            java.lang.String r31 = "com/tencent/mm/plugin/finder/post/PostMainUIC"
            java.lang.String r32 = "initView"
            java.lang.String r33 = "()V"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            r29 = r0
            j20.C117292a.m165358d(r29, r30, r31, r32, r33, r34, r35, r36)
            r5 = 0
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r30 = "com/tencent/mm/plugin/finder/post/PostMainUIC"
            java.lang.String r31 = "initView"
            java.lang.String r32 = "()V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            j20.C117292a.m165359e(r29, r30, r31, r32, r33, r34, r35)
        L_0x043f:
            r16 = 0
            goto L_0x0452
        L_0x0442:
            gy3.C87412m.m108603p(r11)
            r16 = 0
            throw r16
        L_0x0448:
            r16 = 0
            gy3.C87412m.m108603p(r12)
            throw r16
        L_0x044e:
            r16 = r2
            r4 = r21
        L_0x0452:
            com.tencent.mm.plugin.finder.view.FinderExtendActivityView r0 = r1.f160288y
            if (r0 == 0) goto L_0x045c
            r0.setContact(r3)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x046e
        L_0x045c:
            gy3.C87412m.m108603p(r20)
            throw r16
        L_0x0460:
            r18 = r2
            r19 = r5
            r28 = r10
            r27 = r13
            r20 = r14
            r16 = 0
            r0 = r16
        L_0x046e:
            if (r0 != 0) goto L_0x0489
            android.widget.ImageView r0 = r1.f160274h
            if (r0 == 0) goto L_0x0485
            r2 = 8
            r0.setVisibility(r2)
            android.widget.TextView r0 = r1.f160275i
            if (r0 == 0) goto L_0x0481
            r0.setVisibility(r2)
            goto L_0x0489
        L_0x0481:
            gy3.C87412m.m108603p(r11)
            throw r16
        L_0x0485:
            gy3.C87412m.m108603p(r12)
            throw r16
        L_0x0489:
            rx3.g r0 = r1.f160251E
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            ao1.v0 r2 = new ao1.v0
            r2.<init>(r1)
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r37.mo78411G3()
            r2 = 0
            r0.setEnabled(r2)
            r3 = 1
            boolean[] r0 = new boolean[r3]
            r0[r2] = r2
            android.widget.TextView r2 = r37.mo78411G3()
            ao1.w0 r3 = new ao1.w0
            r3.<init>(r0)
            r2.setOnTouchListener(r3)
            android.widget.TextView r2 = r37.mo78411G3()
            ao1.x0 r3 = new ao1.x0
            r3.<init>(r1, r0, r9)
            r2.setOnClickListener(r3)
            ao1.t r0 = r37.mo78415L3()
            androidx.appcompat.app.AppCompatActivity r2 = r0.getActivity()
            r3 = 2131311129(0x7f093a19, float:1.824059E38)
            android.view.View r2 = r2.findViewById(r3)
            java.lang.String r3 = "activity.findViewById(co…inder.R.id.post_desc_edt)"
            gy3.C87412m.m108593f(r2, r3)
            com.tencent.mm.plugin.finder.view.FinderPostEditText r2 = (com.tencent.p014mm.plugin.finder.view.FinderPostEditText) r2
            r0.f152339d = r2
            androidx.appcompat.app.AppCompatActivity r2 = r0.getActivity()
            r3 = 2131311186(0x7f093a52, float:1.8240705E38)
            android.view.View r2 = r2.findViewById(r3)
            java.lang.String r5 = "activity.findViewById(co….id.post_short_title_edt)"
            gy3.C87412m.m108593f(r2, r5)
            com.tencent.mm.plugin.finder.view.FinderPostEditText r2 = (com.tencent.p014mm.plugin.finder.view.FinderPostEditText) r2
            r0.f152344i = r2
            gs1.i r2 = new gs1.i
            com.tencent.mm.plugin.finder.view.FinderPostEditText r7 = r0.mo75070e3()
            androidx.appcompat.app.AppCompatActivity r8 = r0.getActivity()
            r10 = r19
            gy3.C87412m.m108592e(r8, r10)
            com.tencent.mm.ui.MMActivity r8 = (com.tencent.p014mm.p136ui.MMActivity) r8
            r2.<init>(r7, r8)
            r0.f152350r = r2
            androidx.appcompat.app.AppCompatActivity r2 = r0.getActivity()
            r7 = 2131305108(0x7f092294, float:1.8228378E38)
            android.view.View r2 = r2.findViewById(r7)
            java.lang.String r7 = "activity.findViewById(co…er.R.id.footer_container)"
            gy3.C87412m.m108593f(r2, r7)
            r0.f152342g = r2
            android.view.View r2 = r0.mo75072g3()
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r7.mo10233c(r4)
            java.lang.Object[] r30 = r7.mo10232b()
            java.lang.String r31 = "com/tencent/mm/plugin/finder/post/PostEditUIC"
            java.lang.String r32 = "initView"
            java.lang.String r33 = "()V"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            r29 = r2
            j20.C117292a.m165358d(r29, r30, r31, r32, r33, r34, r35, r36)
            r8 = 0
            java.lang.Object r7 = r7.mo10231a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r30 = "com/tencent/mm/plugin/finder/post/PostEditUIC"
            java.lang.String r31 = "initView"
            java.lang.String r32 = "()V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            j20.C117292a.m165359e(r29, r30, r31, r32, r33, r34, r35)
            androidx.appcompat.app.AppCompatActivity r2 = r0.getActivity()
            r7 = 2131302722(0x7f091942, float:1.8223538E38)
            android.view.View r2 = r2.findViewById(r7)
            java.lang.String r7 = "activity.findViewById(co…id.finder_comment_footer)"
            gy3.C87412m.m108593f(r2, r7)
            com.tencent.mm.plugin.finder.view.FinderPostFooter r2 = (com.tencent.p014mm.plugin.finder.view.FinderPostFooter) r2
            r0.f152341f = r2
            androidx.appcompat.app.AppCompatActivity r2 = r0.getActivity()
            r7 = 2131311120(0x7f093a10, float:1.8240571E38)
            android.view.View r2 = r2.findViewById(r7)
            androidx.appcompat.app.AppCompatActivity r7 = r0.getActivity()
            r8 = 2131311190(0x7f093a56, float:1.8240713E38)
            android.view.View r7 = r7.findViewById(r8)
            com.tencent.mm.plugin.finder.view.FinderPostFooter r8 = r0.mo75071f3()
            androidx.appcompat.app.AppCompatActivity r11 = r0.getActivity()
            gy3.C87412m.m108592e(r11, r10)
            com.tencent.mm.ui.MMActivity r11 = (com.tencent.p014mm.p136ui.MMActivity) r11
            android.view.View r12 = r0.mo75072g3()
            com.tencent.mm.plugin.finder.view.FinderPostEditText r13 = r0.mo75070e3()
            com.tencent.mm.plugin.finder.view.FinderPostEditText r14 = r0.mo75073i3()
            r15 = 20001(0x4e21, float:2.8027E-41)
            java.lang.String r3 = "atBtn"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r3 = "topicBtn"
            gy3.C87412m.m108593f(r7, r3)
            r8.setActivity(r11)
            r8.f162122p = r12
            r8.f162118i = r13
            r8.f162119j = r14
            r8.f162123q = r15
            r8.setITopicCallback(r0)
            r8.setAtBtn(r2)
            r8.setTopicBtn(r7)
            com.tencent.mm.plugin.finder.view.u3 r3 = new com.tencent.mm.plugin.finder.view.u3
            r3.<init>(r0)
            r7.setOnClickListener(r3)
            com.tencent.mm.plugin.finder.view.v3 r3 = new com.tencent.mm.plugin.finder.view.v3
            r3.<init>(r11, r15)
            r2.setOnClickListener(r3)
            up1.f r2 = up1.C37521f.f99374d
            boolean r3 = r2.mo61158L()
            if (r3 == 0) goto L_0x0614
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r11)
            java.lang.Object[] r30 = r3.mo10232b()
            java.lang.String r31 = "com/tencent/mm/plugin/finder/view/FinderPostFooter"
            java.lang.String r32 = "initView"
            java.lang.String r33 = "(Lcom/tencent/mm/ui/MMActivity;Landroid/view/View;Lcom/tencent/mm/ui/widget/MMEditText;Lcom/tencent/mm/ui/widget/MMEditText;ILcom/tencent/mm/plugin/finder/view/FinderPostFooter$ITopicCallback;Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            r29 = r7
            j20.C117292a.m165358d(r29, r30, r31, r32, r33, r34, r35, r36)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r7.setVisibility(r3)
            java.lang.String r30 = "com/tencent/mm/plugin/finder/view/FinderPostFooter"
            java.lang.String r31 = "initView"
            java.lang.String r32 = "(Lcom/tencent/mm/ui/MMActivity;Landroid/view/View;Lcom/tencent/mm/ui/widget/MMEditText;Lcom/tencent/mm/ui/widget/MMEditText;ILcom/tencent/mm/plugin/finder/view/FinderPostFooter$ITopicCallback;Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            j20.C117292a.m165359e(r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0650
        L_0x0614:
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r4)
            java.lang.Object[] r30 = r3.mo10232b()
            java.lang.String r31 = "com/tencent/mm/plugin/finder/view/FinderPostFooter"
            java.lang.String r32 = "initView"
            java.lang.String r33 = "(Lcom/tencent/mm/ui/MMActivity;Landroid/view/View;Lcom/tencent/mm/ui/widget/MMEditText;Lcom/tencent/mm/ui/widget/MMEditText;ILcom/tencent/mm/plugin/finder/view/FinderPostFooter$ITopicCallback;Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            r29 = r7
            j20.C117292a.m165358d(r29, r30, r31, r32, r33, r34, r35, r36)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r7.setVisibility(r3)
            java.lang.String r30 = "com/tencent/mm/plugin/finder/view/FinderPostFooter"
            java.lang.String r31 = "initView"
            java.lang.String r32 = "(Lcom/tencent/mm/ui/MMActivity;Landroid/view/View;Lcom/tencent/mm/ui/widget/MMEditText;Lcom/tencent/mm/ui/widget/MMEditText;ILcom/tencent/mm/plugin/finder/view/FinderPostFooter$ITopicCallback;Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            j20.C117292a.m165359e(r29, r30, r31, r32, r33, r34, r35)
        L_0x0650:
            com.tencent.mm.plugin.finder.view.w3 r3 = com.tencent.p014mm.plugin.finder.view.C4200w3.f18496d
            r8.setOnClickListener(r3)
            boolean r3 = r2.mo61158L()
            if (r3 != 0) goto L_0x0663
            com.tencent.mm.plugin.finder.view.FinderPostFooter r3 = r0.mo75071f3()
            r4 = 0
            r3.mo79847c(r4)
        L_0x0663:
            com.tencent.mm.plugin.finder.view.FinderPostFooter r3 = r0.mo75071f3()
            boolean r2 = r2.mo61175c()
            r3.mo79846b(r2)
            androidx.appcompat.app.AppCompatActivity r2 = r0.getActivity()
            r3 = 2131315152(0x7f0949d0, float:1.824875E38)
            android.view.View r2 = r2.findViewById(r3)
            java.lang.String r3 = "activity.findViewById(co…nder.R.id.textcount_hint)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f152340e = r2
            r3 = r28
            r2.setText(r3)
            android.widget.TextView r2 = r0.f152340e
            if (r2 == 0) goto L_0x0dab
            r4 = 8
            r2.setVisibility(r4)
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99462n1
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            ao1.q r4 = new ao1.q
            r4.<init>(r2, r0)
            com.tencent.mm.plugin.finder.view.FinderPostEditText r2 = r0.mo75070e3()
            r2.addTextChangedListener(r4)
            rx3.g r2 = r0.f152353u
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            bt1.e r2 = (bt1.C54563e) r2
            boolean r2 = r2.f152973n
            if (r2 == 0) goto L_0x06ca
            com.tencent.mm.plugin.finder.view.FinderPostEditText r2 = r0.mo75070e3()
            r4 = 1
            ao1.p[] r7 = new ao1.C0177p[r4]
            ao1.p r4 = new ao1.p
            r4.<init>()
            r8 = 0
            r7[r8] = r4
            android.text.InputFilter[] r7 = (android.text.InputFilter[]) r7
            r2.setFilters(r7)
        L_0x06ca:
            com.tencent.mm.plugin.finder.view.FinderPostEditText r2 = r0.mo75070e3()
            ao1.v r4 = new ao1.v
            r4.<init>(r2, r0)
            r2.setOnTouchListener(r4)
            androidx.appcompat.app.AppCompatActivity r2 = r0.getActivity()
            r4 = 2131313514(0x7f09436a, float:1.8245427E38)
            android.view.View r2 = r2.findViewById(r4)
            r4 = r27
            gy3.C87412m.m108593f(r2, r4)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r0.f152343h = r2
            androidx.appcompat.app.AppCompatActivity r2 = r0.getActivity()
            r4 = 2131311186(0x7f093a52, float:1.8240705E38)
            android.view.View r2 = r2.findViewById(r4)
            gy3.C87412m.m108593f(r2, r5)
            com.tencent.mm.plugin.finder.view.FinderPostEditText r2 = (com.tencent.p014mm.plugin.finder.view.FinderPostEditText) r2
            r0.f152344i = r2
            androidx.appcompat.app.AppCompatActivity r2 = r0.getActivity()
            r4 = 2131311185(0x7f093a51, float:1.8240703E38)
            android.view.View r2 = r2.findViewById(r4)
            java.lang.String r4 = "activity.findViewById(co…t_short_title_count_hint)"
            gy3.C87412m.m108593f(r2, r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f152345j = r2
            androidx.appcompat.app.AppCompatActivity r2 = r0.getActivity()
            r4 = 2131311187(0x7f093a53, float:1.8240707E38)
            android.view.View r2 = r2.findViewById(r4)
            java.lang.String r4 = "activity.findViewById(co…id.post_short_title_tips)"
            gy3.C87412m.m108593f(r2, r4)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f152346n = r2
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99471o1
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Class<lc3.b> r4 = lc3.C10485b.class
            k40.a r4 = f40.C86709a0.m107533q(r4)
            lc3.b r4 = (lc3.C10485b) r4
            pj.f r4 = r4.vh0()
            java.lang.String r5 = "FinderPostShortValidTokenList"
            java.lang.String r4 = r4.mo107405c(r5)
            if (r4 != 0) goto L_0x0745
            r4 = r3
        L_0x0745:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "FINDER_POST_SHORT_TITLE_VALID_CHARS FinderPostShortValidTokenList: dynamic config chars = "
            r5.append(r7)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "FinderConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r7, r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x0764
            java.lang.String r4 = "《_》_\"_“_”__:_：_+_?_？_%_℃_ _"
        L_0x0764:
            java.lang.String r5 = "_"
            r7 = 0
            java.lang.String r4 = z04.C112551y.m153814n(r4, r5, r3, r7)
            java.lang.String r5 = "[^a-zA-Z0-9一-龥#]"
            java.lang.String r8 = "#"
            java.lang.String r4 = z04.C112551y.m153814n(r5, r8, r4, r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "[initShortTitle] textLimit:"
            r5.append(r7)
            r5.append(r2)
            java.lang.String r7 = ", regex:{"
            r5.append(r7)
            r5.append(r4)
            r7 = 125(0x7d, float:1.75E-43)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "Finder.FinderPostUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            ao1.s r5 = new ao1.s
            r5.<init>(r0, r4, r2)
            com.tencent.mm.plugin.finder.view.FinderPostEditText r2 = r0.mo75073i3()
            r2.addTextChangedListener(r5)
            com.tencent.mm.plugin.finder.view.FinderPostEditText r2 = r0.mo75073i3()
            ao1.v r4 = new ao1.v
            r4.<init>(r2, r0)
            r2.setOnTouchListener(r4)
            android.widget.ImageView r2 = r0.f152346n
            java.lang.String r4 = "shortTitleTipsIv"
            if (r2 == 0) goto L_0x0da6
            ao1.r r5 = new ao1.r
            r5.<init>(r0)
            r2.setOnClickListener(r5)
            com.tencent.mm.plugin.finder.view.FinderPostEditText r2 = r0.mo75073i3()
            r5 = 40
            java.lang.String r7 = "short_title_input_box"
            r0.mo75077m3(r2, r7, r5)
            android.widget.ImageView r2 = r0.f152346n
            if (r2 == 0) goto L_0x0da1
            java.lang.String r4 = "understand_short_title"
            r5 = 8
            r0.mo75077m3(r2, r4, r5)
            bl3.r r2 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r4 = r0.getActivity()
            bl3.r$a r4 = r2.mo62444c(r4)
            java.lang.Class<ao1.h1> r5 = ao1.C0157h1.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r5)
            java.lang.String r5 = "UICProvider.of(activity)…PostTopicUIC::class.java)"
            gy3.C87412m.m108593f(r4, r5)
            ao1.h1 r4 = (ao1.C0157h1) r4
            ao1.u r5 = new ao1.u
            r5.<init>(r0)
            r4.f603g = r5
            ao1.l0 r4 = r37.mo78417N3()
            androidx.appcompat.app.AppCompatActivity r0 = r4.getActivity()
            r5 = 2131311138(0x7f093a22, float:1.8240608E38)
            android.view.View r0 = r0.findViewById(r5)
            java.lang.String r5 = "activity.findViewById(co…d.post_lbs_recycler_view)"
            gy3.C87412m.m108593f(r0, r5)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r0
            r4.f152311e = r0
            com.tencent.mm.plugin.finder.profile.FlowLayoutManager r5 = new com.tencent.mm.plugin.finder.profile.FlowLayoutManager
            r5.<init>()
            r7 = 2
            r5.f52493s = r7
            r0.setLayoutManager(r5)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r4.f152311e
            java.lang.String r5 = "lbsRecyclerView"
            if (r0 == 0) goto L_0x0d9c
            ao1.h0 r7 = new ao1.h0
            r7.<init>()
            r0.mo17085h0(r7)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.plugin.finder.post.PostLocationUIC$buildItemCoverts$1 r7 = new com.tencent.mm.plugin.finder.post.PostLocationUIC$buildItemCoverts$1
            r7.<init>(r4)
            java.util.ArrayList<cm1.p0> r8 = r4.f152313g
            r11 = 0
            r0.<init>(r7, r8, r11)
            ao1.i0 r7 = new ao1.i0
            r7.<init>(r0, r4)
            r0.f173488o = r7
            com.tencent.mm.view.recyclerview.WxRecyclerView r7 = r4.f152311e
            if (r7 == 0) goto L_0x0d97
            r7.setAdapter(r0)
            java.lang.Class<fe1.h> r0 = fe1.C58964h.class
            bl3.b r0 = r2.mo62442a(r0)
            fe1.h r0 = (fe1.C58964h) r0
            androidx.appcompat.app.AppCompatActivity r2 = r4.getActivity()
            gy3.C87412m.m108592e(r2, r10)
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
            androidx.appcompat.app.AppCompatActivity r7 = r4.getActivity()
            r8 = 2131311147(0x7f093a2b, float:1.8240626E38)
            android.view.View r7 = r7.findViewById(r8)
            java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.pluginsdk.location.ILocationView"
            gy3.C87412m.m108592e(r7, r8)
            com.tencent.mm.pluginsdk.location.a r7 = (com.tencent.p014mm.pluginsdk.location.C57534a) r7
            com.tencent.mm.view.recyclerview.WxRecyclerView r8 = r4.f152311e
            if (r8 == 0) goto L_0x0d92
            r5 = 20000(0x4e20, float:2.8026E-41)
            r0.mo83368g(r2, r7, r8, r5)
            r4.f152310d = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 >= r2) goto L_0x087e
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r2 = "MNC"
            boolean r0 = gy3.C87412m.m108589b(r2, r0)
            if (r0 != 0) goto L_0x087e
            goto L_0x089b
        L_0x087e:
            androidx.appcompat.app.AppCompatActivity r0 = r4.getActivity()     // Catch:{ Exception -> 0x088d }
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = p385u2.C111105a.m151499a(r0, r2)     // Catch:{ Exception -> 0x088d }
            if (r0 != 0) goto L_0x088b
            goto L_0x089b
        L_0x088b:
            r0 = 0
            goto L_0x089c
        L_0x088d:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r2 = 0
            r5[r2] = r0
            java.lang.String r0 = "PostLocationUIC"
            java.lang.String r2 = "check mpermission exception:%s."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r5)
        L_0x089b:
            r0 = 1
        L_0x089c:
            if (r0 == 0) goto L_0x08c9
            java.lang.Class<bh3.k> r0 = bh3.C113177k.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            bh3.k r0 = (bh3.C113177k) r0
            bh3.k$b r2 = bh3.C113177k.C113179b.LOCAION
            bh3.k$a r5 = bh3.C113177k.C113178a.FINDER
            ao1.k0 r7 = new ao1.k0
            r7.<init>(r4)
            boolean r0 = r0.mo165712hg(r2, r5, r7)
            if (r0 != 0) goto L_0x08c9
            bl3.r r0 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r0 = r0.mo62446e(r2)
            java.lang.Class<os1.d> r2 = os1.C62153d.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            os1.d r0 = (os1.C62153d) r0
            r2 = 0
            r0.mo9105q2(r2)
        L_0x08c9:
            com.tencent.mm.ui.tools.KeyboardHeightProvider r0 = r1.f160255I
            if (r0 == 0) goto L_0x0d8b
            r0.f220015b = r1
            dr1.o r0 = new dr1.o
            fe1.q r2 = r1.f160273g
            r4 = 2131301824(0x7f0915c0, float:1.8221717E38)
            android.view.View r4 = r9.findViewById(r4)
            java.lang.String r5 = "activity.findViewById(co…R.id.extend_reading_view)"
            gy3.C87412m.m108593f(r4, r5)
            com.tencent.mm.plugin.finder.view.FinderExtendReadingView r4 = (com.tencent.p014mm.plugin.finder.view.FinderExtendReadingView) r4
            ao1.y0 r5 = new ao1.y0
            r5.<init>(r1)
            r0.<init>(r9, r2, r4, r5)
            r1.f160284u = r0
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r2 = r37.getActivity()
            bl3.r$a r0 = r0.mo62444c(r2)
            java.lang.Class<kq1.f> r2 = kq1.C10389f.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            java.lang.String r2 = "UICProvider.of(activity)…PackCoverUIC::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            kq1.f r0 = (kq1.C10389f) r0
            dr1.o r2 = r37.mo78432n3()
            r0.f31603g = r2
            android.content.Intent r0 = r37.getIntent()
            java.lang.String r2 = "saveDesc"
            java.lang.String r0 = r0.getStringExtra(r2)
            if (r0 != 0) goto L_0x0924
            android.content.Intent r0 = kd1.C9579a.f29817b
            if (r0 == 0) goto L_0x091f
            java.lang.String r2 = "key_activity_post_wording"
            java.lang.String r0 = r0.getStringExtra(r2)
            goto L_0x0920
        L_0x091f:
            r0 = 0
        L_0x0920:
            if (r0 != 0) goto L_0x0924
            r2 = r3
            goto L_0x0925
        L_0x0924:
            r2 = r0
        L_0x0925:
            android.content.Intent r0 = r37.getIntent()
            java.lang.String r4 = "saveDescAt"
            java.util.ArrayList r0 = r0.getParcelableArrayListExtra(r4)
            if (r0 == 0) goto L_0x0976
            ao1.t r4 = r37.mo78415L3()
            gs1.i r4 = r4.mo75074j3()
            gs1.c r4 = r4.mo84676a()
            java.util.Iterator r5 = r0.iterator()
        L_0x0941:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x09ad
            java.lang.Object r0 = r5.next()
            com.tencent.mm.plugin.finder.utils.LocalFinderAtContactParcel r0 = (com.tencent.p014mm.plugin.finder.utils.LocalFinderAtContactParcel) r0
            er1.t r7 = er1.C58775t.f168276a     // Catch:{ Exception -> 0x0963 }
            java.lang.String r8 = "atContactParcel"
            gy3.C87412m.m108593f(r0, r8)     // Catch:{ Exception -> 0x0963 }
            te3.nq2 r0 = r7.mo83827h(r0)     // Catch:{ Exception -> 0x0963 }
            java.util.HashMap<java.lang.String, te3.nq2> r7 = r4.f170520a     // Catch:{ Exception -> 0x0963 }
            java.lang.String r8 = r0.f184532f     // Catch:{ Exception -> 0x0963 }
            if (r8 != 0) goto L_0x095f
            r8 = r3
        L_0x095f:
            r7.put(r8, r0)     // Catch:{ Exception -> 0x0963 }
            goto L_0x0941
        L_0x0963:
            r0 = move-exception
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r7 = 0
            r8[r7] = r0
            java.lang.String r0 = "Finder.FinderAtManager"
            java.lang.String r7 = "restoreAtContactMap transformToLocalFinderAtContact parseFrom:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r7, r8)
            goto L_0x0941
        L_0x0976:
            ao1.t r0 = r37.mo78415L3()
            gs1.i r0 = r0.mo75074j3()
            gs1.c r0 = r0.mo84676a()
            bt1.e r4 = r37.mo78410F3()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r4 = r4.f152959Q
            if (r4 == 0) goto L_0x09ad
            java.util.Iterator r4 = r4.iterator()
        L_0x098e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x09ad
            java.lang.Object r5 = r4.next()
            com.tencent.mm.protocal.protobuf.FinderContact r5 = (com.tencent.p014mm.protocal.protobuf.FinderContact) r5
            er1.t r7 = er1.C58775t.f168276a
            te3.nq2 r5 = r7.mo83828i(r5)
            if (r5 == 0) goto L_0x098e
            java.util.HashMap<java.lang.String, te3.nq2> r7 = r0.f170520a
            java.lang.String r8 = r5.f184532f
            if (r8 != 0) goto L_0x09a9
            r8 = r3
        L_0x09a9:
            r7.put(r8, r5)
            goto L_0x098e
        L_0x09ad:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 != 0) goto L_0x09cc
            ao1.t r0 = r37.mo78415L3()
            com.tencent.mm.plugin.finder.view.FinderPostEditText r0 = r0.mo75070e3()
            di3.d r4 = di3.C86312j.m106911c(r6)
            ny.h r4 = (p629ny.C76979h) r4
            android.app.Activity r5 = r37.getContext()
            android.text.SpannableString r2 = r4.mo107057T1(r5, r2)
            r0.setText(r2)
        L_0x09cc:
            android.content.Intent r0 = r37.getIntent()
            java.lang.String r2 = "saveShortTitle"
            java.lang.String r0 = r0.getStringExtra(r2)
            if (r0 == 0) goto L_0x09e1
            int r2 = r0.length()
            if (r2 != 0) goto L_0x09df
            goto L_0x09e1
        L_0x09df:
            r2 = 0
            goto L_0x09e2
        L_0x09e1:
            r2 = 1
        L_0x09e2:
            if (r2 != 0) goto L_0x09fd
            ao1.t r2 = r37.mo78415L3()
            com.tencent.mm.plugin.finder.view.FinderPostEditText r2 = r2.mo75073i3()
            di3.d r4 = di3.C86312j.m106911c(r6)
            ny.h r4 = (p629ny.C76979h) r4
            android.app.Activity r5 = r37.getContext()
            android.text.SpannableString r0 = r4.mo107057T1(r5, r0)
            r2.setText(r0)
        L_0x09fd:
            ao1.l0 r0 = r37.mo78417N3()
            fe1.h r2 = r0.f152310d
            if (r2 == 0) goto L_0x0d84
            android.content.Intent r4 = r0.getIntent()
            rx3.g r0 = r0.f152314h
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            bt1.e r0 = (bt1.C54563e) r0
            android.os.Bundle r0 = r0.f152962c
            r2.mo8612b(r4, r0)
            dr1.o r0 = r37.mo78432n3()
            android.content.Intent r2 = r37.getIntent()
            bt1.e r4 = r37.mo78410F3()
            android.os.Bundle r4 = r4.f152962c
            r0.mo8612b(r2, r4)
            ao1.y r0 = r37.mo78416M3()
            dr1.o r2 = r37.mo78432n3()
            r0.f662g = r2
            dr1.l r2 = new dr1.l
            androidx.appcompat.app.AppCompatActivity r4 = r0.getActivity()
            androidx.appcompat.app.AppCompatActivity r5 = r0.getActivity()
            r6 = 2131299541(0x7f090cd5, float:1.8217086E38)
            android.view.View r5 = r5.findViewById(r6)
            java.lang.String r6 = "activity.findViewById(co…r.R.id.choose_emoji_view)"
            gy3.C87412m.m108593f(r5, r6)
            com.tencent.mm.plugin.finder.view.FinderEmojiChooseView r5 = (com.tencent.p014mm.plugin.finder.view.FinderEmojiChooseView) r5
            r2.<init>(r4, r5)
            r0.f660e = r2
            ao1.g0 r2 = r0.mo174f3()
            ao1.f0 r4 = new ao1.f0
            r4.<init>(r0)
            r2.f593g = r4
            r2.mo145f3()
            r0.mo171c3()
            bl3.r r2 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r4 = r0.getActivity()
            bl3.r$a r4 = r2.mo62444c(r4)
            r5 = r18
            androidx.lifecycle.i0 r4 = r4.mo75002a(r5)
            java.lang.String r6 = "UICProvider.of(activity)…(PostMainUIC::class.java)"
            gy3.C87412m.m108593f(r4, r6)
            com.tencent.mm.plugin.finder.post.PostMainUIC r4 = (com.tencent.p014mm.plugin.finder.post.PostMainUIC) r4
            bt1.e r4 = r4.mo78410F3()
            boolean r7 = r4.f152957O
            if (r7 != 0) goto L_0x0a88
            boolean r4 = r4.mo75460h()
            if (r4 == 0) goto L_0x0a88
            r4 = 1
            goto L_0x0a89
        L_0x0a88:
            r4 = 0
        L_0x0a89:
            if (r4 == 0) goto L_0x0ac5
            ao1.g0 r4 = r0.mo174f3()
            dr1.d0 r4 = r4.f592f
            if (r4 == 0) goto L_0x0ac5
            boolean r7 = r4 instanceof dr1.C7483i
            if (r7 == 0) goto L_0x0ac5
            uq1.m r7 = uq1.C65449m.f188332a
            boolean r7 = r7.mo89564c()
            if (r7 != 0) goto L_0x0abd
            androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
            bl3.r$a r0 = r2.mo62444c(r0)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r5)
            gy3.C87412m.m108593f(r0, r6)
            com.tencent.mm.plugin.finder.post.PostMainUIC r0 = (com.tencent.p014mm.plugin.finder.post.PostMainUIC) r0
            bt1.e r0 = r0.mo78410F3()
            boolean r0 = r0.mo75460h()
            if (r0 == 0) goto L_0x0abb
            goto L_0x0abd
        L_0x0abb:
            r0 = 0
            goto L_0x0abe
        L_0x0abd:
            r0 = 1
        L_0x0abe:
            if (r0 == 0) goto L_0x0ac5
            dr1.i r4 = (dr1.C7483i) r4
            r4.mo8622e()
        L_0x0ac5:
            dr1.u r0 = r1.f160285v
            if (r0 == 0) goto L_0x0d7d
            android.content.Intent r4 = r37.getIntent()
            bt1.e r5 = r37.mo78410F3()
            android.os.Bundle r5 = r5.f152962c
            r0.mo8612b(r4, r5)
            dr1.z r0 = r1.f160286w
            if (r0 == 0) goto L_0x0d76
            android.content.Intent r4 = r37.getIntent()
            bt1.e r5 = r37.mo78410F3()
            android.os.Bundle r5 = r5.f152962c
            r0.mo8612b(r4, r5)
            dr1.a r0 = r1.f160287x
            if (r0 == 0) goto L_0x0d6f
            android.content.Intent r4 = r37.getIntent()
            bt1.e r5 = r37.mo78410F3()
            android.os.Bundle r5 = r5.f152962c
            r0.mo8612b(r4, r5)
            dr1.y r0 = r1.f160247A
            if (r0 == 0) goto L_0x0d68
            android.content.Intent r4 = r37.getIntent()
            bt1.e r5 = r37.mo78410F3()
            android.os.Bundle r5 = r5.f152962c
            r0.mo8612b(r4, r5)
            bt1.e r0 = r37.mo78410F3()
            java.lang.Integer r0 = r0.f152963d
            if (r0 != 0) goto L_0x0b12
            goto L_0x0b1a
        L_0x0b12:
            int r4 = r0.intValue()
            r5 = 2
            if (r4 != r5) goto L_0x0b1a
            goto L_0x0b24
        L_0x0b1a:
            r4 = 7
            if (r0 != 0) goto L_0x0b1e
            goto L_0x0b26
        L_0x0b1e:
            int r5 = r0.intValue()
            if (r5 != r4) goto L_0x0b26
        L_0x0b24:
            r4 = 1
            goto L_0x0b27
        L_0x0b26:
            r4 = 0
        L_0x0b27:
            if (r4 == 0) goto L_0x0b38
            bt1.g r0 = new bt1.g
            androidx.appcompat.app.AppCompatActivity r4 = r37.getActivity()
            r5 = 2
            r6 = 0
            r7 = 0
            r0.<init>(r4, r6, r5, r7)
            r1.f160283t = r0
            goto L_0x0b64
        L_0x0b38:
            r4 = 4
            if (r0 != 0) goto L_0x0b3c
            goto L_0x0b4e
        L_0x0b3c:
            int r5 = r0.intValue()
            if (r5 != r4) goto L_0x0b4e
            bt1.t r0 = new bt1.t
            androidx.appcompat.app.AppCompatActivity r4 = r37.getActivity()
            r0.<init>(r4)
            r1.f160283t = r0
            goto L_0x0b64
        L_0x0b4e:
            if (r0 != 0) goto L_0x0b51
            goto L_0x0b64
        L_0x0b51:
            int r0 = r0.intValue()
            r4 = 8
            if (r0 != r4) goto L_0x0b64
            bt1.i r0 = new bt1.i
            androidx.appcompat.app.AppCompatActivity r4 = r37.getActivity()
            r0.<init>(r4)
            r1.f160283t = r0
        L_0x0b64:
            bt1.b r0 = r1.f160283t
            if (r0 == 0) goto L_0x0bbb
            android.view.ViewGroup r4 = r1.f160276j
            java.lang.String r5 = "mediaViewContainer"
            if (r4 == 0) goto L_0x0bb6
            r4.removeAllViews()
            android.view.View r0 = r0.mo75452b()
            if (r0 != 0) goto L_0x0b87
            android.view.ViewGroup r0 = r1.f160276j
            if (r0 == 0) goto L_0x0b82
            r4 = 8
            r0.setVisibility(r4)
            r4 = 0
            goto L_0x0ba5
        L_0x0b82:
            gy3.C87412m.m108603p(r5)
            r4 = 0
            throw r4
        L_0x0b87:
            r4 = 0
            android.view.ViewGroup r6 = r1.f160276j
            if (r6 == 0) goto L_0x0bb2
            r6.addView(r0)
            android.view.ViewGroup r6 = r1.f160276j
            if (r6 == 0) goto L_0x0bae
            ao1.t0 r7 = new ao1.t0
            r7.<init>(r1, r0)
            r6.post(r7)
            android.view.ViewGroup r0 = r1.f160276j
            if (r0 == 0) goto L_0x0baa
            r0.setOnClickListener(r4)
            r37.mo78414K3()
        L_0x0ba5:
            rx3.b0 r16 = rx3.C13598b0.f38549a
            r4 = r16
            goto L_0x0bbc
        L_0x0baa:
            gy3.C87412m.m108603p(r5)
            throw r4
        L_0x0bae:
            gy3.C87412m.m108603p(r5)
            throw r4
        L_0x0bb2:
            gy3.C87412m.m108603p(r5)
            throw r4
        L_0x0bb6:
            r4 = 0
            gy3.C87412m.m108603p(r5)
            throw r4
        L_0x0bbb:
            r4 = 0
        L_0x0bbc:
            if (r4 != 0) goto L_0x0bc1
            r37.mo78414K3()
        L_0x0bc1:
            r37.mo78421R3()
            android.content.Intent r0 = r37.getIntent()
            java.lang.String r4 = "KEY_FINDER_POST_FORM_FLUTTER"
            r5 = 0
            boolean r0 = r0.getBooleanExtra(r4, r5)
            r4 = 0
            r6 = 3
            if (r0 == 0) goto L_0x0c15
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0 = 1565(0x61d, float:2.193E-42)
            r7.mo175911u(r0, r6)
            java.lang.String r0 = r1.f160271e
            java.lang.String r8 = "enter export activity"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            android.content.Intent r0 = r37.getIntent()
            java.lang.String r8 = "KEY_FINDER_POST_EXPORT_START_TIME"
            long r8 = r0.getLongExtra(r8, r4)
            long r10 = java.lang.System.currentTimeMillis()
            long r14 = r10 - r8
            r8 = 1565(0x61d, double:7.73E-321)
            r10 = 5
            r12 = r14
            r7.mo175913w(r8, r10, r12)
            java.lang.String r0 = r1.f160271e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "enter export activity cost "
            r7.append(r8)
            r7.append(r14)
            java.lang.String r8 = "ms"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
        L_0x0c15:
            android.content.Intent r0 = r37.getIntent()
            java.lang.String r7 = "vst_id"
            java.lang.String r0 = r0.getStringExtra(r7)
            if (r0 != 0) goto L_0x0c23
            r0 = r3
        L_0x0c23:
            r1.f160258L = r0
            androidx.appcompat.app.AppCompatActivity r0 = r37.getActivity()
            bl3.r$a r0 = r2.mo62444c(r0)
            java.lang.Class<ce1.a> r2 = ce1.C0452a.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            ce1.a r0 = (ce1.C0452a) r0
            java.lang.String r2 = r1.f160258L
            r0.getClass()
            java.lang.String r8 = "<set-?>"
            gy3.C87412m.m108594g(r2, r8)
            r0.f1082C = r2
            com.tencent.mm.plugin.finder.view.FinderExtendActivityView r0 = r1.f160288y
            if (r0 == 0) goto L_0x0d63
            java.lang.String r2 = r1.f160258L
            r0.setVstId(r2)
            long r8 = java.lang.System.currentTimeMillis()
            r1.f160257K = r8
            bt1.e r0 = r37.mo78410F3()
            te3.ap1 r0 = r0.f152953K
            if (r0 != 0) goto L_0x0c5f
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            goto L_0x0cfd
        L_0x0c5f:
            bt1.e r0 = r37.mo78410F3()
            te3.ap1 r0 = r0.f152953K
            gy3.C87412m.m108591d(r0)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            int r8 = r0.f182116e
            r9 = 2
            if (r8 != r9) goto L_0x0c7b
            java.lang.String r0 = r0.f182115d
            java.lang.String r8 = "shooting_templateid"
            r2.put(r8, r0)
            goto L_0x0cce
        L_0x0c7b:
            java.lang.String r0 = r0.f182115d
            java.lang.String r8 = "templateid"
            r2.put(r8, r0)
            bt1.e r0 = r37.mo78410F3()
            byte[] r0 = r0.f152976q
            if (r0 == 0) goto L_0x0cce
            te3.td1 r0 = new te3.td1
            r0.<init>()
            bt1.e r8 = r37.mo78410F3()
            byte[] r8 = r8.f152976q
            if (r8 != 0) goto L_0x0c99
            goto L_0x0cab
        L_0x0c99:
            r0.parseFrom(r8)     // Catch:{ Exception -> 0x0c9e }
            r15 = r0
            goto L_0x0cac
        L_0x0c9e:
            r0 = move-exception
            r8 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 0
            r0[r9] = r8
            java.lang.String r8 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r8, r3, r0)
        L_0x0cab:
            r15 = 0
        L_0x0cac:
            if (r15 == 0) goto L_0x0cc0
            java.lang.String r0 = r15.f185546s
            if (r0 == 0) goto L_0x0cc0
            int r0 = r0.length()
            r8 = 1
            if (r0 <= 0) goto L_0x0cbb
            r14 = 1
            goto L_0x0cbc
        L_0x0cbb:
            r14 = 0
        L_0x0cbc:
            if (r14 != r8) goto L_0x0cc0
            r11 = 1
            goto L_0x0cc1
        L_0x0cc0:
            r11 = 0
        L_0x0cc1:
            if (r11 == 0) goto L_0x0cce
            java.lang.String r0 = r15.f185546s
            if (r0 != 0) goto L_0x0cc8
            r0 = r3
        L_0x0cc8:
            java.lang.String r8 = "songid"
            r2.put(r8, r0)
        L_0x0cce:
            android.content.Intent r0 = r37.getIntent()
            java.lang.String r8 = "key_topic_id"
            long r4 = r0.getLongExtra(r8, r4)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r4)
            int r4 = r0.signum()
            if (r4 >= 0) goto L_0x0cee
            java.math.BigInteger r4 = java.math.BigInteger.ONE
            r5 = 64
            java.math.BigInteger r4 = r4.shiftLeft(r5)
            java.math.BigInteger r0 = r0.add(r4)
        L_0x0cee:
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "b.toString()"
            gy3.C87412m.m108593f(r0, r4)
            java.lang.String r4 = "activityid"
            r2.put(r4, r0)
            r0 = r2
        L_0x0cfd:
            r1.f160260N = r0
            java.lang.String r2 = r1.f160258L
            r0.put(r7, r2)
            org.json.JSONObject r0 = r1.f160260N
            if (r0 == 0) goto L_0x0d15
            android.content.Intent r2 = r37.getIntent()
            java.lang.String r4 = "post_entry_type"
            int r2 = r2.getIntExtra(r4, r6)
            r0.put(r4, r2)
        L_0x0d15:
            android.content.Intent r0 = r37.getIntent()
            java.lang.String r2 = "key_jump_id"
            java.lang.String r0 = r0.getStringExtra(r2)
            if (r0 == 0) goto L_0x0d2b
            java.lang.String r2 = ","
            java.lang.String r4 = ";"
            r5 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r0, r2, r4, r5)
            goto L_0x0d2c
        L_0x0d2b:
            r0 = r3
        L_0x0d2c:
            r1.f160261P = r0
            fp1.a r0 = fp1.C59266a.f169452a
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r2 = dp1.C58408t0.f167337b
            if (r2 == 0) goto L_0x0d3b
            java.lang.String r2 = r2.flowId
            if (r2 != 0) goto L_0x0d39
            goto L_0x0d3b
        L_0x0d39:
            r10 = r2
            goto L_0x0d3c
        L_0x0d3b:
            r10 = r3
        L_0x0d3c:
            fp1.c r2 = fp1.C59267b.f169457e
            r0.mo84410b(r10, r2)
            com.tencent.mm.plugin.finder.post.PostMainUIC$jumpInfoEventListener$1 r0 = r1.f160269X
            r0.alive()
            r2 = 0
            r1.f160263R = r2
            bt1.e r0 = r37.mo78410F3()
            boolean r0 = r0.mo75460h()
            if (r0 == 0) goto L_0x0d62
            java.lang.Class<lr.b> r0 = p599lr.C61381b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            lr.b r0 = (p599lr.C61381b) r0
            qo1.g r0 = r0.mo78545UQ()
            r0.mo12412e(r1)
        L_0x0d62:
            return
        L_0x0d63:
            gy3.C87412m.m108603p(r20)
            r2 = 0
            throw r2
        L_0x0d68:
            r2 = 0
            java.lang.String r0 = "postOriginWidget"
            gy3.C87412m.m108603p(r0)
            throw r2
        L_0x0d6f:
            r2 = 0
            java.lang.String r0 = "activityWidget"
            gy3.C87412m.m108603p(r0)
            throw r2
        L_0x0d76:
            r2 = 0
            java.lang.String r0 = "newsWidget"
            gy3.C87412m.m108603p(r0)
            throw r2
        L_0x0d7d:
            r2 = 0
            java.lang.String r0 = "originalWidget"
            gy3.C87412m.m108603p(r0)
            throw r2
        L_0x0d84:
            r2 = 0
            java.lang.String r0 = "locationWidget"
            gy3.C87412m.m108603p(r0)
            throw r2
        L_0x0d8b:
            r2 = 0
            java.lang.String r0 = "keyboardHeightProvider"
            gy3.C87412m.m108603p(r0)
            throw r2
        L_0x0d92:
            r2 = 0
            gy3.C87412m.m108603p(r5)
            throw r2
        L_0x0d97:
            r2 = 0
            gy3.C87412m.m108603p(r5)
            throw r2
        L_0x0d9c:
            r2 = 0
            gy3.C87412m.m108603p(r5)
            throw r2
        L_0x0da1:
            r2 = 0
            gy3.C87412m.m108603p(r4)
            throw r2
        L_0x0da6:
            r2 = 0
            gy3.C87412m.m108603p(r4)
            throw r2
        L_0x0dab:
            r2 = 0
            java.lang.String r0 = "textCountTv"
            gy3.C87412m.m108603p(r0)
            throw r2
        L_0x0db3:
            r2 = 0
            java.lang.String r0 = "postOriginView"
            gy3.C87412m.m108603p(r0)
            throw r2
        L_0x0dba:
            r2 = 0
            java.lang.String r0 = "postMusicWidget"
            gy3.C87412m.m108603p(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.post.PostMainUIC.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C54556b bVar = this.f160283t;
        if (bVar != null) {
            bVar.onDestroy();
        }
        if (this.f160287x != null) {
            Log.m105924i("Finder.ActivityParamStore", "reset");
            C9579a.f29817b = null;
            this.f160269X.dead();
            String str = this.f160270d;
            Log.m105924i(str, "onDestroy routeFrom :" + this.f160262Q);
            if (this.f160262Q != 19) {
                Log.m105924i("Finder.PostCallbackMgr", "doCallback state:" + 3 + " errMsg:" + "");
                C60213x3 x3Var = C54264e.f152304b;
                if (x3Var != null) {
                    x3Var.mo5408a(3, "");
                }
                C54264e.f152304b = null;
            }
            ArtistCacheManager.m140185a().mo148159b();
            if (mo78410F3().mo75460h()) {
                ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12417j(this);
                return;
            }
            return;
        }
        C87412m.m108603p("activityWidget");
        throw null;
    }

    public void onPostEnd(long j, boolean z) {
        mo78413J3();
        this.f160264S = j;
        C76912y0.m92767f(getContext(), getResources().getString(C0966R.string.n2w));
    }

    public void onPostNotify(long j, boolean z) {
    }

    public void onPostOk(long j, long j2) {
        MiniAppInfo miniAppInfo;
        String str;
        mo78413J3();
        this.f160264S = 0;
        C76912y0.m92768g(getContext(), getResources().getString(C0966R.string.f360752n33));
        FinderJumpInfo finderJumpInfo = mo78410F3().f152956N;
        if (!(finderJumpInfo == null || (miniAppInfo = finderJumpInfo.mini_app_info) == null)) {
            ConcurrentHashMap<Long, String> concurrentHashMap = C54265f.f152305a;
            String str2 = concurrentHashMap.get(Long.valueOf(j));
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            concurrentHashMap.remove(Long.valueOf(j));
            String str4 = miniAppInfo.app_id;
            String str5 = str4 == null ? str3 : str4;
            C7885u1 u1Var = C7885u1.f26507a;
            String str6 = miniAppInfo.path;
            if (str6 != null) {
                str3 = str6;
            }
            if (str2.length() == 0) {
                str = C7021t1.m7266a(str3, "commentScene=15", "entryCardType=35");
                C87412m.m108593f(str, "safelyUrlConcatParam(pat…CardType=$entryCardType\")");
            } else {
                str = C7021t1.m7266a(str3, "id=" + str2, "commentScene=15", "entryCardType=35");
                C87412m.m108593f(str, "safelyUrlConcatParam(pat…CardType=$entryCardType\")");
            }
            C7885u1.m8051a(u1Var, getActivity(), str5, str, 0, (ValueCallback) null, 24, (Object) null);
        }
        C61926c.m72668M(new C54276s0(this, j));
    }

    public void onPostStart(long j) {
    }

    public void onResume() {
        super.onResume();
        C75044y4.m89989a(getContext());
        C8437d dVar = mo78432n3().f25733e;
        if (dVar.f27440n) {
            dVar.f27438i.post(new C8448g(dVar));
        }
        ((C64999e) C86312j.m106911c(C64999e.class)).tj0();
    }

    public void onStart() {
        super.onStart();
        JSONObject jSONObject = this.f160260N;
        String str = this.f160261P;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
        mo78418O3(74, 0, 0, -1, jSONObject, str, f != null ? f.mo12861q3() : null);
    }

    public void onStop() {
        super.onStop();
        mo78419P3(0);
    }

    public void onUserVisibleFocused() {
        if (!this.f160265T) {
            KeyboardHeightProvider keyboardHeightProvider = this.f160255I;
            if (keyboardHeightProvider != null) {
                keyboardHeightProvider.mo104022e();
                this.f160265T = true;
                return;
            }
            C87412m.m108603p("keyboardHeightProvider");
            throw null;
        }
    }
}
