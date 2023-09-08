package com.tencent.p014mm.plugin;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import a70.C79471a;
import ak1.C0076j0;
import ak1.C54067f0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C39622i0;
import bd1.C39759i;
import bd1.C54446b;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import bl3.C39818r;
import bo1.C0344g;
import bo1.C0350i;
import bo1.C0356n;
import bo1.C0359u;
import bq1.C54534b;
import bq1.C54542g;
import c30.C104289g;
import c30.C26827e;
import cg1.C0500a;
import cm1.C0751m0;
import cm1.C55015f1;
import co1.C55041a;
import co1.C55046c;
import co1.C55048e;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C80617t0;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.FinderVideoCtrlEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderSnsPostStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderStreamTrackStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2491u;
import com.tencent.p014mm.plugin.finder.extension.reddot.C41409b;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55724w;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHorizontalVideoHalfFeedUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHorizontalVideoNewFormUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHotWordFeedUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveIncomeUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderNewStyleTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderRingtoneSearchUI;
import com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.FinderSettingsUI;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;
import com.tencent.p014mm.plugin.finder.search.data.SearchHotWordListParcelable;
import com.tencent.p014mm.plugin.finder.service.C56294r0;
import com.tencent.p014mm.plugin.finder.service.C56301v0;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.multitask.C105919k;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import d03.C58010a;
import d92.C107028a;
import di3.C7335d;
import di3.C86312j;
import do1.C31225l;
import do1.C58341h;
import dp1.C20480e0;
import dp1.C58358d0;
import dp1.C58362f0;
import dp1.C58380k1;
import dp1.C58411u;
import dp1.C58413v0;
import dp1.C58417y0;
import dp1.C7435f2;
import eb0.C31543z5;
import eb0.C75592q0;
import ei3.C86522b;
import er1.C31685u4;
import er1.C45689t4;
import er1.C45690w4;
import er1.C58681a3;
import er1.C58684b;
import er1.C58695b0;
import er1.C58697b3;
import er1.C58739j4;
import er1.C58741j5;
import er1.C58757o1;
import er1.C58759o4;
import er1.C58784w3;
import er1.C58791y;
import er1.C58793y2;
import er1.C7786c0;
import er1.C7827l3;
import er1.C7853p2;
import er1.C7868s3;
import er1.C7888v2;
import er1.C7904v4;
import er1.C7907w1;
import f14.C58901s;
import f40.C86709a0;
import f62.C31952w0;
import f81.C7998c;
import fe1.C32026j;
import fe1.C58959b;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gf1.C59418i;
import gs3.C59698c;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import ht1.C33071r2;
import ht1.C46118w5;
import ht1.C46120y4;
import ht1.C60157c5;
import ht1.C60165e4;
import ht1.C60171g1;
import ht1.C60176j;
import ht1.C60183l5;
import ht1.C60200t1;
import ht1.C60204t3;
import ht1.C60213x3;
import ht1.C60216z4;
import ht1.C87592u3;
import ht1.C8772i1;
import ht1.C8777j5;
import ht1.C8806u4;
import it1.C60625c;
import it1.C9247b;
import it1.C9252f;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import je1.C46525m1;
import je1.C46530q2;
import je1.C46533r1;
import je1.C46534r2;
import je1.C46547x1;
import je1.C60806o3;
import je1.C9309g0;
import je1.C9377s4;
import je1.C9379t3;
import jh3.C60869d;
import jm2.C117361f;
import jp3.C9486a;
import jp3.C9487b;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kd1.C9584f;
import ke3.C88144b;
import kf1.C46715z4;
import kg3.C76577a;
import kotlin.Result;
import kotlin.ResultKt;
import kr0.C76629w0;
import kt1.C61167e;
import ky2.C10432i;
import l60.C99342a;
import l60.C99344b;
import m53.C10756c;
import m53.C10761g;
import m53.C10762h;
import mr1.C25026b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import nr3.C89059e;
import ns3.C11266d;
import o40.C61926c;
import o40.C61937h;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import org.json.JSONObject;
import os1.C11739f;
import os1.C11747l;
import os1.C62159h;
import os1.C62160i;
import os1.C62161j;
import os1.C62162k;
import os1.C62163m;
import ot1.C11767a;
import p1081gi.C98121d;
import p147ea.C7606d;
import p151er.C58676k;
import p182kk.C61104a;
import p185kq.C10383h;
import p185kq.C61130g;
import p204mr.C61568m;
import p274xx.C15907f;
import p564iq.C87790d;
import p565ir.C60606n;
import p565ir.C60613r;
import p599lr.C61381b;
import p682rz.C36594q;
import p749xh.C66261f3;
import p749xh.C66274t3;
import p749xh.C66277w3;
import p871zj.C66836c;
import pe3.C47465a;
import pe3.C89349b;
import pf1.C11920q;
import pf1.C62262d0;
import pf1.C62273n;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import pl1.C11992u;
import pl1.C62344b0;
import pl1.C62351k0;
import pl1.C62367r0;
import q40.C12040d;
import qe3.C89625d;
import qn1.C12889e;
import qo3.C77407n;
import qo3.C89779i0;
import r60.C101350i;
import rs1.C13442s8;
import rs1.C13539y3;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C13605o;
import rx3.C36568h;
import rx3.C36570n;
import s43.C13620a;
import s43.C13621b;
import s43.C13624e;
import sx3.C110818d0;
import t60.C64207e;
import t91.C64208c;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C48693ac1;
import te3.C48727ak1;
import te3.C48770aw0;
import te3.C48797b21;
import te3.C48893bq0;
import te3.C48978cb0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C49946j51;
import te3.C50008jm0;
import te3.C50676og0;
import te3.C50943qc2;
import te3.C50972qk0;
import te3.C51236sf1;
import te3.C51398th3;
import te3.C51418tn0;
import te3.C51974xh1;
import te3.C51978xi1;
import te3.C64284cg;
import te3.C64287ci1;
import te3.C64414h71;
import te3.C64441i93;
import te3.C64586nn1;
import te3.C64638pv3;
import te3.C64682rk1;
import te3.C64689rq2;
import te3.C64827xe1;
import te3.C64831xk1;
import te3.C64888zo1;
import te3.C64897zv2;
import te3.db4;
import te3.fp4;
import te3.m44;
import te3.m74;
import tf0.C13882l0;
import tf0.C13883o1;
import tf0.C13887q1;
import tf0.C13889v;
import tf0.C13890w;
import tf0.C37024e0;
import tf0.C37038p;
import tf0.C37046s;
import tf0.C37048t;
import tf0.C37050u;
import tf0.C52337m0;
import tf0.C52338n0;
import tf0.C64900a0;
import tf0.C64901b0;
import tf0.C64902c0;
import tf0.C64903d0;
import tf0.C64909f0;
import tf0.C64911g0;
import tf0.C64912h0;
import tf0.C64916p1;
import tf0.C64923x;
import tf0.C64924y;
import tf0.C64926z;
import u60.C65233m;
import ue1.C37429f0;
import ue1.C52527c0;
import ue1.C65328r;
import up1.C14358p;
import up1.C14369w;
import up1.C27696y;
import up1.C37521f;
import up1.C37549f0;
import up1.C37550i0;
import up1.C37553o0;
import up1.C37557u;
import up1.C52587a;
import up1.C52593j;
import up1.C52599l0;
import up1.C65412c;
import up1.C65413c0;
import up1.C65414d0;
import up1.C65416i;
import up1.C65423q;
import up1.C65424s0;
import up1.C65426w0;
import up1.C65427x;
import up1.C78268z;
import uq1.C65430c;
import uz2.C65488a0;
import vp1.C14937o;
import vp1.C65834e;
import vp1.C65840n;
import vq1.C65854g;
import vq1.C65866w;
import wd3.C65953v0;
import wp1.C66165b;
import wp1.C66167g;
import wr1.C66184f;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import x60.C102564a;
import xx3.C15911a;
import xx3.C66447b;
import yc1.C15959b;
import yc1.C15961d;
import yc1.C66607f;
import yl1.C66663a;
import yn1.C16055a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C112551y;
import z04.C119027c;
import z51.C79305f;
import zc1.C66783a;
import zc1.C66785b;
import zh3.C91753f;
import zp3.C23564m;
import zt3.C119157j;

@C86522b(dependencies = {C7998c.class, C58676k.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService */
public final class FinderCommonFeatureService extends C60869d implements C60200t1, C11385n {

    /* renamed from: A */
    public C65423q f157774A;

    /* renamed from: B */
    public C65412c f157775B;

    /* renamed from: C */
    public C37557u f157776C;

    /* renamed from: D */
    public C37553o0 f157777D;

    /* renamed from: E */
    public C37549f0 f157778E;

    /* renamed from: F */
    public C12889e f157779F;

    /* renamed from: G */
    public C14369w f157780G;

    /* renamed from: H */
    public final C58959b f157781H = new C58959b();

    /* renamed from: I */
    public final C13601g f157782I = C36568h.m40985a(C55398a.f157815d);

    /* renamed from: J */
    public FinderRedDotManager f157783J;

    /* renamed from: K */
    public final C13601g f157784K = C36568h.m40985a(C29072n.f79622d);

    /* renamed from: L */
    public final C0000n0 f157785L = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));

    /* renamed from: M */
    public final C0000n0 f157786M = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C58901s.f168555a));

    /* renamed from: N */
    public final String f157787N = MD5Util.getMD5String("FinderMM029.dbFinderMention001.db");

    /* renamed from: P */
    public final String f157788P = MD5Util.getMD5String("FinderMM029.dbFinderMention001.db");

    /* renamed from: Q */
    public final C13601g f157789Q = C36568h.m40985a(C1315d0.f10438d);

    /* renamed from: R */
    public final C13601g f157790R = C36568h.m40985a(C55411l.f157838d);

    /* renamed from: S */
    public final C64916p1 f157791S;

    /* renamed from: T */
    public final FinderCommonFeatureService$entryConfigChangeListener$1 f157792T;

    /* renamed from: U */
    public volatile boolean f157793U;

    /* renamed from: V */
    public long f157794V;

    /* renamed from: W */
    public final C55400b f157795W;

    /* renamed from: X */
    public final C55402c0 f157796X;

    /* renamed from: Y */
    public final ConcurrentHashMap<String, Boolean> f157797Y;

    /* renamed from: g */
    public final C91753f[] f157798g = {null};

    /* renamed from: h */
    public C91753f[] f157799h = {null};

    /* renamed from: i */
    public C91753f[] f157800i = {null};

    /* renamed from: j */
    public C91753f[] f157801j = {null};

    /* renamed from: n */
    public final C59418i f157802n = new C59418i();

    /* renamed from: o */
    public C65416i f157803o;

    /* renamed from: p */
    public C65414d0 f157804p;

    /* renamed from: q */
    public C65413c0 f157805q;

    /* renamed from: r */
    public C52593j f157806r;

    /* renamed from: s */
    public C52599l0 f157807s;

    /* renamed from: t */
    public C78268z f157808t;

    /* renamed from: u */
    public C37550i0 f157809u;

    /* renamed from: v */
    public C14358p f157810v;

    /* renamed from: w */
    public C66165b f157811w;

    /* renamed from: x */
    public C65427x f157812x;

    /* renamed from: y */
    public C55724w f157813y;

    /* renamed from: z */
    public C65424s0 f157814z;

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$c */
    public static final class C1314c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C1314c f10437d = new C1314c();

        public C1314c() {
            super(0);
        }

        public Object invoke() {
            Toast.makeText(MMApplicationContext.getContext(), C0966R.string.d2l, 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$d0 */
    public static final class C1315d0 extends C87413o implements C32224a<C55048e> {

        /* renamed from: d */
        public static final C1315d0 f10438d = new C1315d0();

        public C1315d0() {
            super(0);
        }

        public Object invoke() {
            C55048e eVar = new C55048e();
            eVar.mo76108e(C0344g.f929a.mo385a((C51974xh1) null), new HashMap(0));
            return eVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$e */
    public static final class C1316e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C1316e f10439d = new C1316e();

        public C1316e() {
            super(0);
        }

        public Object invoke() {
            Toast.makeText(MMApplicationContext.getContext(), C0966R.string.d2l, 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$f0 */
    public static final class C1317f0 implements Runnable {

        /* renamed from: d */
        public static final C1317f0 f10440d = new C1317f0();

        public final void run() {
            C65430c cVar = C65430c.f188287c;
            C65430c.f188287c.mo89551b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$g */
    public static final class C1318g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderCommonFeatureService f10441d;

        /* renamed from: e */
        public final /* synthetic */ long f10442e;

        /* renamed from: f */
        public final /* synthetic */ String f10443f;

        /* renamed from: g */
        public final /* synthetic */ int f10444g;

        /* renamed from: h */
        public final /* synthetic */ Intent f10445h;

        /* renamed from: i */
        public final /* synthetic */ Context f10446i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1318g(FinderCommonFeatureService finderCommonFeatureService, long j, String str, int i, Intent intent, Context context) {
            super(0);
            this.f10441d = finderCommonFeatureService;
            this.f10442e = j;
            this.f10443f = str;
            this.f10444g = i;
            this.f10445h = intent;
            this.f10446i = context;
        }

        public Object invoke() {
            C64284cg a;
            String str;
            FinderObject cb = this.f10441d.mo76838cb(this.f10442e, this.f10443f, this.f10444g, "");
            if (cb == null) {
                Log.m105920e("Finder.FinderCommonFeatureService", "enterFinderProfileUI requestFinderObject null");
                C61926c.m72668M(new C1335a(this.f10446i));
            } else {
                Intent intent = this.f10445h;
                String str2 = "";
                if (intent != null) {
                    String str3 = cb.username;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    intent.putExtra("finder_username", str3);
                }
                Intent intent2 = this.f10445h;
                if (intent2 != null) {
                    String str4 = cb.username;
                    if (str4 == null) {
                        str4 = str2;
                    }
                    intent2.putExtra("key_finder_teen_mode_user_id", str4);
                }
                Intent intent3 = this.f10445h;
                if (intent3 != null) {
                    FinderContact finderContact = cb.contact;
                    if (!(finderContact == null || (a = C58960c.m68829a(finderContact, false)) == null || (str = a.f182468d) == null)) {
                        str2 = str;
                    }
                    intent3.putExtra("key_biz_username", str2);
                }
                C61926c.m72668M(new C2058b(this.f10446i, this.f10445h));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$i */
    public static final class C1319i extends C87413o implements C32226l<FinderJumpInfo, C13598b0> {

        /* renamed from: d */
        public static final C1319i f10447d = new C1319i();

        public C1319i() {
            super(1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r13) {
            /*
                r12 = this;
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r13 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r13
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r13, r0)
                pf1.d0 r0 = pf1.C62262d0.f176978a
                r0.getClass()
                com.tencent.mm.protocal.protobuf.NativeInfo r13 = r13.native_info
                java.lang.String r0 = ""
                if (r13 == 0) goto L_0x0016
                java.lang.String r13 = r13.necessary_params
                if (r13 != 0) goto L_0x0017
            L_0x0016:
                r13 = r0
            L_0x0017:
                r1 = 0
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x001e }
                r2.<init>(r13)     // Catch:{ JSONException -> 0x001e }
                goto L_0x0029
            L_0x001e:
                r13 = move-exception
                java.lang.String r13 = r13.getMessage()
                java.lang.String r2 = "Finder.JumperUtils"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
                r2 = r1
            L_0x0029:
                if (r2 != 0) goto L_0x002c
                goto L_0x006e
            L_0x002c:
                java.lang.String r13 = "topic_id"
                r3 = 0
                r4 = 1
                boolean r5 = r2.has(r13)     // Catch:{ Exception -> 0x0041 }
                if (r5 != r4) goto L_0x0039
                r5 = 1
                goto L_0x003a
            L_0x0039:
                r5 = 0
            L_0x003a:
                if (r5 == 0) goto L_0x004c
                java.lang.String r13 = r2.getString(r13)     // Catch:{ Exception -> 0x0041 }
                goto L_0x004d
            L_0x0041:
                r13 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r4]
                r2[r3] = r13
                java.lang.String r13 = "safeGetString"
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r0, r2)
            L_0x004c:
                r13 = r1
            L_0x004d:
                r2 = 0
                if (r13 == 0) goto L_0x0056
                long r4 = o40.C61926c.m72671P(r13)
                goto L_0x0057
            L_0x0056:
                r4 = r2
            L_0x0057:
                int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r13 != 0) goto L_0x005c
                goto L_0x006e
            L_0x005c:
                a14.h0 r13 = a14.C53872d1.f151119c
                a14.n0 r6 = a14.C53930o0.m60554a(r13)
                r7 = 0
                r8 = 0
                pf1.m0 r9 = new pf1.m0
                r9.<init>(r4, r1)
                r10 = 3
                r11 = 0
                a14.C53895h.m60466d(r6, r7, r8, r9, r10, r11)
            L_0x006e:
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.C1319i.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$i0 */
    public static final class C1320i0 implements C88144b.C9614f {

        /* renamed from: a */
        public static final C1320i0 f10448a = new C1320i0();

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r1 = r16.getExtras();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo1258a(android.content.Context r14, android.app.Activity r15, android.content.Intent r16, int r17, android.os.Bundle r18) {
            /*
                r13 = this;
                r2 = r16
                r0 = 1
                r12 = 0
                if (r2 == 0) goto L_0x0016
                android.os.Bundle r1 = r16.getExtras()
                if (r1 == 0) goto L_0x0016
                java.lang.String r3 = "key_context_id"
                boolean r1 = r1.containsKey(r3)
                if (r1 != r0) goto L_0x0016
                r1 = 1
                goto L_0x0017
            L_0x0016:
                r1 = 0
            L_0x0017:
                java.lang.String r3 = " intent="
                java.lang.String r4 = "Finder.FinderCommonFeatureService"
                if (r1 == 0) goto L_0x0040
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "[onStartActivity] has set contextId, context="
                r0.append(r1)
                java.lang.Class r1 = r14.getClass()
                java.lang.String r1 = r1.getName()
                r0.append(r1)
                r0.append(r3)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                goto L_0x0093
            L_0x0040:
                if (r2 == 0) goto L_0x0057
                android.content.ComponentName r1 = r16.getComponent()
                if (r1 == 0) goto L_0x0057
                java.lang.String r1 = r1.getClassName()
                if (r1 == 0) goto L_0x0057
                java.lang.String r5 = "Finder"
                boolean r1 = z04.C112550d0.m153801u(r1, r5, r0)
                if (r1 != r0) goto L_0x0057
                goto L_0x0058
            L_0x0057:
                r0 = 0
            L_0x0058:
                if (r0 == 0) goto L_0x0093
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "[onStartActivity] auto initIntentParams. context="
                r0.append(r1)
                java.lang.Class r1 = r14.getClass()
                java.lang.String r1 = r1.getName()
                r0.append(r1)
                r0.append(r3)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                rs1.s8$a r0 = rs1.C13442s8.f38060Q0
                java.lang.String r1 = "intent"
                gy3.C87412m.m108593f(r2, r1)
                r3 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 252(0xfc, float:3.53E-43)
                r11 = 0
                r1 = r14
                r2 = r16
                rs1.C13442s8.C13443a.m12791e(r0, r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
            L_0x0093:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.C1320i0.mo1258a(android.content.Context, android.app.Activity, android.content.Intent, int, android.os.Bundle):boolean");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.FinderCommonFeatureService$generateFinderVideoPlayer$$inlined$fail$default$1", mo125469f = "FinderCommonFeatureService.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$o */
    public static final class C1321o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f10449d;

        /* renamed from: e */
        public final /* synthetic */ long f10450e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0 f10451f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1321o(C0287e eVar, C15601d dVar, long j, C8479f0 f0Var) {
            super(2, dVar);
            this.f10449d = eVar;
            this.f10450e = j;
            this.f10451f = f0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C1321o(this.f10449d, dVar, this.f10450e, this.f10451f);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C1321o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            FinderObject finderObject;
            ResultKt.throwOnFailure(obj);
            C0280a aVar = ((C0281b) this.f10449d).f843b;
            C12040d dVar = aVar.f841a;
            int i = 0;
            if (dVar != null) {
                if (C58739j4.f168176a.mo83681J(dVar != null ? dVar.f35057e : 0, dVar != null ? dVar.f35058f : 0)) {
                    C12040d dVar2 = aVar.f841a;
                    C50008jm0 jm02 = null;
                    C49335eu3 eu32 = dVar2 != null ? dVar2.f35060h : null;
                    if (eu32 instanceof C50008jm0) {
                        jm02 = (C50008jm0) eu32;
                    }
                    if (!(jm02 == null || (finderObject = jm02.f136184e) == null)) {
                        T a = FinderItem.Companion.mo79056a(finderObject, 1);
                        C65834e eVar = C65834e.f189316a;
                        C65834e.C65836b bVar = C65834e.C65836b.f189322b;
                        eVar.mo89878l(a, C65834e.C65836b.f189330j);
                        this.f10451f.f27484d = a;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("generateFinderVideoPlayer: fetch feed fail, errType=");
            C12040d dVar3 = aVar.f841a;
            sb.append(dVar3 != null ? dVar3.f35057e : 0);
            sb.append(", errCode=");
            C12040d dVar4 = aVar.f841a;
            if (dVar4 != null) {
                i = dVar4.f35058f;
            }
            sb.append(i);
            sb.append(", feedId=");
            sb.append(C61926c.m72691p(this.f10450e));
            sb.append(", feed=");
            sb.append(this.f10451f.f27484d);
            Log.m105924i("Finder.FinderCommonFeatureService", sb.toString());
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.FinderCommonFeatureService$generateFinderVideoPlayer$$inlined$success$default$1", mo125469f = "FinderCommonFeatureService.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$p */
    public static final class C1322p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f10452d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0 f10453e;

        /* renamed from: f */
        public final /* synthetic */ long f10454f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1322p(C0287e eVar, C15601d dVar, C8479f0 f0Var, long j) {
            super(2, dVar);
            this.f10452d = eVar;
            this.f10453e = f0Var;
            this.f10454f = j;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C1322p(this.f10452d, dVar, this.f10453e, this.f10454f);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C1322p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            FinderObject finderObject = ((C50008jm0) ((C0288f) this.f10452d).f855b).f136184e;
            if (finderObject != null) {
                T a = FinderItem.Companion.mo79056a(finderObject, 1);
                C65834e eVar = C65834e.f189316a;
                C65834e.C65836b bVar = C65834e.C65836b.f189322b;
                eVar.mo89878l(a, C65834e.C65836b.f189330j);
                this.f10453e.f27484d = a;
                Log.m105924i("Finder.FinderCommonFeatureService", "generateFinderVideoPlayer: fetch feed success, feedId=" + C61926c.m72691p(this.f10454f) + ", feed=" + this.f10453e.f27484d);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$s0 */
    public static final class C1323s0 implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C15601d<C13598b0> f10455d;

        public C1323s0(C15601d<? super C13598b0> dVar) {
            this.f10455d = dVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107524d().mo123470p(978, this);
            Log.m105924i("Finder.FinderCommonFeatureService", "[requestFinderMentionList] errCode = " + i2 + ", errType = " + i);
            C15601d<C13598b0> dVar = this.f10455d;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$t */
    public static final class C1324t extends C87413o implements C32226l<C89132b.C89134c<C51418tn0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f10456d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1324t(Context context) {
            super(1);
            this.f10456d = context;
        }

        public Object invoke(Object obj) {
            int i;
            C48797b21 b212;
            LinkedList<C48797b21> linkedList;
            LinkedList<C48797b21> linkedList2;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (!(cVar != null && cVar.f256793a == 0) || cVar.f256794b != 0) {
                Log.m105920e("Finder.FinderCommonFeatureService", "CgiFinderGetLiveIncomePage failed");
                Context context = this.f10456d;
                C76912y0.m92767f(context, context.getString(C0966R.string.f360472d33));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("CgiFinderGetLiveIncomePage success: ");
                Object obj2 = (C51418tn0) cVar.f256796d;
                if (obj2 == null) {
                    obj2 = "";
                }
                sb.append(C61937h.m72709h(obj2));
                Log.m105924i("Finder.FinderCommonFeatureService", sb.toString());
                C51418tn0 tn02 = (C51418tn0) cVar.f256796d;
                if (tn02 == null || (linkedList2 = tn02.f142294d) == null) {
                    i = 0;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (T next : linkedList2) {
                        if (((C48797b21) next).f130895d == 1) {
                            arrayList.add(next);
                        }
                    }
                    i = arrayList.size();
                }
                if (i <= 1) {
                    C51418tn0 tn03 = (C51418tn0) cVar.f256796d;
                    String str = null;
                    if (tn03 == null || (linkedList = tn03.f142294d) == null) {
                        b212 = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (T next2 : linkedList) {
                            if (((C48797b21) next2).f130895d == 1) {
                                arrayList2.add(next2);
                            }
                        }
                        b212 = (C48797b21) C110818d0.m150916N(arrayList2);
                    }
                    C10756c cVar2 = (C10756c) C86709a0.m107533q(C10756c.class);
                    Context context2 = this.f10456d;
                    int i2 = b212 != null ? b212.f130896e : 1;
                    C51418tn0 tn04 = (C51418tn0) cVar.f256796d;
                    boolean z = tn04 != null ? tn04.f142296f : false;
                    if (tn04 != null) {
                        str = tn04.f142295e;
                    }
                    cVar2.mo10991F3(context2, "", i2, z, str);
                } else {
                    Context context3 = this.f10456d;
                    Intent intent = new Intent(this.f10456d, FinderLiveIncomeUI.class);
                    Context context4 = this.f10456d;
                    intent.putExtra("PARAMS_DATA", ((C51418tn0) cVar.f256796d).getData());
                    if (!(context4 instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Context context5 = context3;
                    C117292a.m165358d(context5, aVar.mo10232b(), "com/tencent/mm/plugin/FinderCommonFeatureService$getIncomePageInfoAndEnterIncome$1", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context3.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context5, "com/tencent/mm/plugin/FinderCommonFeatureService$getIncomePageInfoAndEnterIncome$1", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$t0 */
    public static final class C1325t0<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ Object f10457a;

        /* renamed from: b */
        public final /* synthetic */ long f10458b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<FinderItem> f10459c;

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f10460d;

        public C1325t0(Object obj, long j, C8479f0<FinderItem> f0Var, C8477a0 a0Var) {
            this.f10457a = obj;
            this.f10458b = j;
            this.f10459c = f0Var;
            this.f10460d = a0Var;
        }

        public Object call(Object obj) {
            FinderObject finderObject;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            if (((i == 0 && cVar.f256794b == 0) || C58739j4.f168176a.mo83681J(i, cVar.f256794b)) && (finderObject = ((C50008jm0) cVar.f256796d).f136184e) != null) {
                C8479f0<FinderItem> f0Var = this.f10459c;
                T a = FinderItem.Companion.mo79056a(finderObject, 1);
                C65834e.f189316a.mo89878l(a, C65834e.C65836b.f189330j);
                f0Var.f27484d = a;
            }
            Object obj2 = this.f10457a;
            C8477a0 a0Var = this.f10460d;
            synchronized (obj2) {
                a0Var.f27482d = true;
                obj2.notify();
                C13598b0 b0Var = C13598b0.f38549a;
            }
            Log.m105924i("Finder.FinderCommonFeatureService", "requestFinderObject " + this.f10458b + ", finish");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$u0 */
    public static final class C1326u0<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<LinkedList<db4>> f10461a;

        public C1326u0(C8479f0<LinkedList<db4>> f0Var) {
            this.f10461a = f0Var;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256794b == 0 && cVar.f256793a == 0) {
                Log.m105924i("Finder.FinderCommonFeatureService", "successfully! size=" + ((LinkedList) this.f10461a.f27484d).size());
            } else {
                Log.m105928w("Finder.FinderCommonFeatureService", "fail to report! size=" + ((LinkedList) this.f10461a.f27484d).size());
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$v */
    public static final class C1327v implements C10762h<C50943qc2> {

        /* renamed from: a */
        public final /* synthetic */ C15601d<C13605o<Boolean, Long, String>> f10462a;

        public C1327v(C15601d<? super C13605o<Boolean, Long, String>> dVar) {
            this.f10462a = dVar;
        }

        /* renamed from: a */
        public void mo605a(int i, int i2, String str) {
            C15601d<C13605o<Boolean, Long, String>> dVar = this.f10462a;
            Result.Companion companion = Result.Companion;
            Boolean bool = Boolean.FALSE;
            dVar.resumeWith(Result.m168114constructorimpl(new C13605o(bool, -1L, "errorType=" + i + " errorCode=" + i2 + " msg=" + str)));
        }

        public void onSuccess(Object obj) {
            C50943qc2 qc22 = (C50943qc2) obj;
            C87412m.m108594g(qc22, "data");
            C15601d<C13605o<Boolean, Long, String>> dVar = this.f10462a;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(new C13605o(Boolean.TRUE, Long.valueOf(qc22.f140241d), "")));
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$v0 */
    public static final class C1328v0 implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ Activity f10463d;

        /* renamed from: e */
        public final /* synthetic */ String f10464e;

        public C1328v0(Activity activity, String str) {
            this.f10463d = activity;
            this.f10464e = str;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            boolean z = false;
            e0Var.mo107142f(0, this.f10463d.getString(C0966R.string.d6b));
            String str = this.f10464e;
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                e0Var.mo107142f(1, this.f10463d.getString(C0966R.string.d6c));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$w */
    public static final class C1329w extends C87413o implements C32226l<C13621b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C15601d<C13604l<Boolean, String>>> f10465d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1329w(C8479f0<C15601d<C13604l<Boolean, String>>> f0Var) {
            super(1);
            this.f10465d = f0Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C13621b) obj, LocaleUtil.ITALIAN);
            Log.m105924i("Finder.FinderCommonFeatureService", "#orderAndPay consumeData onSuccess");
            C15601d dVar = (C15601d) this.f10465d.f27484d;
            if (dVar != null) {
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(new C13604l(Boolean.TRUE, "")));
            }
            this.f10465d.f27484d = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$w0 */
    public static final class C1330w0 implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ Activity f10466d;

        /* renamed from: e */
        public final /* synthetic */ String f10467e;

        public C1330w0(Activity activity, String str) {
            this.f10466d = activity;
            this.f10467e = str;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 0) {
                int i2 = FinderSettingsUI.f161137r;
                Intent intent = new Intent(this.f10466d, FinderSettingsUI.class);
                Activity activity = this.f10466d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Activity activity2 = activity;
                C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/FinderCommonFeatureService$showFinderEntranceDebugSheet$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity2, "com/tencent/mm/plugin/FinderCommonFeatureService$showFinderEntranceDebugSheet$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (menuItem.getItemId() == 1) {
                Intent intent2 = new Intent();
                intent2.putExtra("rawUrl", this.f10467e);
                C88144b.m109791i(this.f10466d, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$x */
    public static final class C1331x extends C87413o implements C32226l<C13620a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C15601d<C13604l<Boolean, String>>> f10468d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1331x(C8479f0<C15601d<C13604l<Boolean, String>>> f0Var) {
            super(1);
            this.f10468d = f0Var;
        }

        public Object invoke(Object obj) {
            C13620a aVar = (C13620a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            Log.m105924i("Finder.FinderCommonFeatureService", "#orderAndPay consumeData onFailed errorType:" + aVar.f38588a);
            C15601d dVar = (C15601d) this.f10468d.f27484d;
            if (dVar != null) {
                Result.Companion companion = Result.Companion;
                Boolean bool = Boolean.FALSE;
                dVar.resumeWith(Result.m168114constructorimpl(new C13604l(bool, "orderAndPay consumeData onFailed errorType:" + aVar.f38588a)));
            }
            this.f10468d.f27484d = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$x0 */
    public static final class C1332x0 extends C87413o implements C32227p<C101350i<?>, Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WeakReference<C60216z4.C8821a<Integer>> f10469d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1332x0(WeakReference<C60216z4.C8821a<Integer>> weakReference) {
            super(2);
            this.f10469d = weakReference;
        }

        public Object invoke(Object obj, Object obj2) {
            C60216z4.C8821a aVar;
            Bitmap bitmap = (Bitmap) obj2;
            C87412m.m108594g((C101350i) obj, "<anonymous parameter 0>");
            WeakReference<C60216z4.C8821a<Integer>> weakReference = this.f10469d;
            if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
                aVar.mo6382a(Integer.valueOf(bitmap != null ? 0 : -1));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$y */
    public static final class C1333y extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C15601d<C13604l<Boolean, String>>> f10470d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1333y(C8479f0<C15601d<C13604l<Boolean, String>>> f0Var) {
            super(0);
            this.f10470d = f0Var;
        }

        public Object invoke() {
            Log.m105924i("Finder.FinderCommonFeatureService", "#orderAndPay consumeData onCancel");
            C15601d dVar = (C15601d) this.f10470d.f27484d;
            if (dVar != null) {
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(new C13604l(Boolean.FALSE, "orderAndPay consumeData onCancel")));
            }
            this.f10470d.f27484d = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$z0 */
    public static final class C1334z0 implements C10762h<Void> {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<C15601d<C13604l<Boolean, Integer>>> f10471a;

        public C1334z0(C8479f0<C15601d<C13604l<Boolean, Integer>>> f0Var) {
            this.f10471a = f0Var;
        }

        /* renamed from: a */
        public void mo605a(int i, int i2, String str) {
            Log.m105924i("Finder.FinderCommonFeatureService", "#weCoinChargeDialog callback onFailed errorType=" + i + " errorCode=" + i2 + " errorMsg=" + str);
            C15601d dVar = (C15601d) this.f10471a.f27484d;
            if (dVar != null) {
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(new C13604l(Boolean.FALSE, 0)));
            }
            this.f10471a.f27484d = null;
        }

        public void onSuccess(Object obj) {
            Void voidR = (Void) obj;
            Log.m105924i("Finder.FinderCommonFeatureService", "#weCoinChargeDialog callback onSuccess");
            C15601d dVar = (C15601d) this.f10471a.f27484d;
            if (dVar != null) {
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(new C13604l(Boolean.TRUE, 0)));
            }
            this.f10471a.f27484d = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$e0 */
    public static final class C29069e0 implements C31952w0 {

        /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$e0$a */
        public static final class C29070a implements C8772i1 {
            public C29070a(C31952w0.C31953a aVar) {
            }
        }

        /* renamed from: a */
        public void mo56432a(Activity activity, String str, String str2, C31952w0.C31953a aVar) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(str, "toUserName");
            C87412m.m108594g(str2, "msgContent");
            ((C13887q1) C86312j.m106911c(C13887q1.class)).Xm0(str, str2, new C29070a(aVar)).mo9225i();
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$h0 */
    public static final class C29071h0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C29071h0 f79621d = new C29071h0();

        public C29071h0() {
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
            if (up1.C37521f.f99429j1.mo60266n().intValue() != 1) goto L_0x005b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
            if (r3 == 1) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
            r1.getDeclaredMethod("setEnabled", new java.lang.Class[0]).invoke(r2, new java.lang.Object[0]);
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack("MicroMsg.UIToolCommon", "enable UIToolCommon", new java.lang.Object[0]);
            zo3.C16376b.f43775a = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r6 = this;
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r0 != 0) goto L_0x000c
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
                if (r0 != 0) goto L_0x000c
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                if (r0 == 0) goto L_0x0017
            L_0x000c:
                af1.a r0 = af1.C0035a.f42a
                java.lang.String r1 = "//fdc"
                java.lang.String[] r1 = new java.lang.String[]{r1}
                com.tencent.p014mm.pluginsdk.cmd.C30650a.m39147b(r0, r1)
            L_0x0017:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r0 != 0) goto L_0x001f
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.ENABLE_UI_TOOL
                if (r0 == 0) goto L_0x0081
            L_0x001f:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
                if (r0 == 0) goto L_0x0081
                r0 = 0
                java.lang.String r1 = "com.tencent.mm.uitool.UITool"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0077 }
                java.lang.String r2 = "INSTANCE"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ all -> 0x0077 }
                java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0077 }
                f40.o r3 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0077 }
                com.tencent.mm.storage.v1 r3 = r3.mo121142i()     // Catch:{ all -> 0x0077 }
                com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LOCAL_UITOOL_ENABLE_INT_SYNC     // Catch:{ all -> 0x0077 }
                r5 = -1
                int r3 = r3.mo119689j(r4, r5)     // Catch:{ all -> 0x0077 }
                r4 = 1
                if (r3 != r5) goto L_0x005b
                up1.f r5 = up1.C37521f.f99374d     // Catch:{ all -> 0x0077 }
                r5.getClass()     // Catch:{ all -> 0x0077 }
                pe1.c<java.lang.Integer> r5 = up1.C37521f.f99429j1     // Catch:{ all -> 0x0077 }
                java.lang.Object r5 = r5.mo60266n()     // Catch:{ all -> 0x0077 }
                java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x0077 }
                int r5 = r5.intValue()     // Catch:{ all -> 0x0077 }
                if (r5 == r4) goto L_0x005d
            L_0x005b:
                if (r3 != r4) goto L_0x0081
            L_0x005d:
                java.lang.String r3 = "setEnabled"
                java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x0077 }
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r5)     // Catch:{ all -> 0x0077 }
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x0077 }
                r1.invoke(r2, r3)     // Catch:{ all -> 0x0077 }
                java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0077 }
                java.lang.String r2 = "MicroMsg.UIToolCommon"
                java.lang.String r3 = "enable UIToolCommon"
                com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r2, r3, r1)     // Catch:{ all -> 0x0077 }
                zo3.C16376b.f43775a = r4     // Catch:{ all -> 0x0077 }
                goto L_0x0081
            L_0x0077:
                r1 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "FinderConfig"
                java.lang.String r3 = "fail to enable uitool"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r0)
            L_0x0081:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.C29071h0.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$n */
    public static final class C29072n extends C87413o implements C32224a<C65233m> {

        /* renamed from: d */
        public static final C29072n f79622d = new C29072n();

        public C29072n() {
            super(0);
        }

        public Object invoke() {
            C65233m mVar = new C65233m("FinderFollowTlSingleExecutor");
            mVar.mo89361d();
            return mVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$o0 */
    public static final class C40389o0 extends C87413o implements C32224a<C52527c0> {

        /* renamed from: d */
        public static final C40389o0 f108531d = new C40389o0();

        public C40389o0() {
            super(0);
        }

        public Object invoke() {
            return new C52527c0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$r */
    public static final class C40390r extends C87413o implements C32224a<C91753f> {

        /* renamed from: d */
        public final /* synthetic */ FinderCommonFeatureService f108532d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40390r(FinderCommonFeatureService finderCommonFeatureService) {
            super(0);
            this.f108532d = finderCommonFeatureService;
        }

        public Object invoke() {
            C91753f fVar = new C91753f();
            String str = C86709a0.m107535s().f251807e + "FinderMM029.db";
            return !fVar.mo125626p(str, FinderCommonFeatureService.vx0(this.f108532d), true, true) ? C52587a.f146882a.mo73547a(str, FinderCommonFeatureService.vx0(this.f108532d), true, true) : fVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$s */
    public static final class C40391s extends C87413o implements C32224a<C91753f> {

        /* renamed from: d */
        public final /* synthetic */ FinderCommonFeatureService f108533d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40391s(FinderCommonFeatureService finderCommonFeatureService) {
            super(0);
            this.f108533d = finderCommonFeatureService;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x008d, code lost:
            if (gy3.C87412m.m108589b(r1, "FinderIdentityMsg") != false) goto L_0x008f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a0, code lost:
            if (gy3.C87412m.m108589b(r4, "FinderLiveMentionMsg") == false) goto L_0x00a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a2, code lost:
            er1.C58784w3.f168295a.mo83958r();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r12 = this;
                zh3.f r0 = new zh3.f
                r0.<init>()
                f40.o r1 = f40.C86709a0.m107535s()
                java.lang.String r1 = r1.f251807e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r1 = "FinderMention001.db"
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                com.tencent.mm.plugin.FinderCommonFeatureService r2 = r12.f108533d
                java.util.HashMap r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.wx0(r2)
                r3 = 1
                boolean r2 = r0.mo125626p(r1, r2, r3, r3)
                if (r2 != 0) goto L_0x0035
                up1.a r0 = up1.C52587a.f146882a
                com.tencent.mm.plugin.FinderCommonFeatureService r2 = r12.f108533d
                java.util.HashMap r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.vx0(r2)
                zh3.f r0 = r0.mo73547a(r1, r2, r3, r3)
            L_0x0035:
                com.tencent.mm.plugin.FinderCommonFeatureService r1 = r12.f108533d
                r1.getClass()
                f40.o r1 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r1 = r1.mo121142i()
                com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_MSG_TABLE_NAME_STRING_SYNC
                java.lang.String r4 = ""
                java.lang.Object r1 = r1.mo119685f(r2, r4)
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
                gy3.C87412m.m108592e(r1, r5)
                java.lang.String r1 = (java.lang.String) r1
                f40.o r6 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r6 = r6.mo121142i()
                com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_WX_MSG_TABLE_NAME_STRING_SYNC
                java.lang.Object r6 = r6.mo119685f(r7, r4)
                gy3.C87412m.m108592e(r6, r5)
                java.lang.String r6 = (java.lang.String) r6
                f40.o r8 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r8 = r8.mo121142i()
                com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_LIVE_MENTION_TABLE_NAME_STRING_SYNC
                java.lang.Object r4 = r8.mo119685f(r9, r4)
                gy3.C87412m.m108592e(r4, r5)
                java.lang.String r4 = (java.lang.String) r4
                int r5 = r1.length()
                r8 = 0
                if (r5 <= 0) goto L_0x0080
                r5 = 1
                goto L_0x0081
            L_0x0080:
                r5 = 0
            L_0x0081:
                java.lang.String r10 = "FinderLiveMentionMsg"
                java.lang.String r11 = "FinderIdentityMsg"
                if (r5 == 0) goto L_0x008f
                int r5 = p749xh.C66274t3.f190671z1
                boolean r1 = gy3.C87412m.m108589b(r1, r11)
                if (r1 == 0) goto L_0x00a2
            L_0x008f:
                int r1 = r4.length()
                if (r1 <= 0) goto L_0x0097
                r1 = 1
                goto L_0x0098
            L_0x0097:
                r1 = 0
            L_0x0098:
                if (r1 == 0) goto L_0x00a7
                int r1 = p749xh.C66274t3.f190671z1
                boolean r1 = gy3.C87412m.m108589b(r4, r10)
                if (r1 != 0) goto L_0x00a7
            L_0x00a2:
                er1.w3 r1 = er1.C58784w3.f168295a
                r1.mo83958r()
            L_0x00a7:
                int r1 = r6.length()
                if (r1 <= 0) goto L_0x00ae
                goto L_0x00af
            L_0x00ae:
                r3 = 0
            L_0x00af:
                java.lang.String r1 = "WxIdentityMsg"
                if (r3 == 0) goto L_0x00c0
                int r3 = p749xh.C66274t3.f190671z1
                boolean r3 = gy3.C87412m.m108589b(r6, r1)
                if (r3 != 0) goto L_0x00c0
                er1.w3 r3 = er1.C58784w3.f168295a
                r3.mo83964t()
            L_0x00c0:
                f40.o r3 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r3 = r3.mo121142i()
                int r4 = p749xh.C66274t3.f190671z1
                r3.mo119677K(r2, r11)
                f40.o r2 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r2 = r2.mo121142i()
                r2.mo119677K(r7, r1)
                f40.o r1 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r1 = r1.mo121142i()
                r1.mo119677K(r9, r10)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.C40391s.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$a */
    public static final class C55398a extends C87413o implements C32224a<C66607f> {

        /* renamed from: d */
        public static final C55398a f157815d = new C55398a();

        public C55398a() {
            super(0);
        }

        public Object invoke() {
            return new C66607f();
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$a0 */
    public static final class C55399a0<T, R> implements C64207e {

        /* renamed from: a */
        public static final C55399a0<T, R> f157816a = new C55399a0<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$b */
    public static final class C55400b implements C114668z {

        /* renamed from: d */
        public final /* synthetic */ FinderCommonFeatureService f157817d;

        public C55400b(FinderCommonFeatureService finderCommonFeatureService) {
            this.f157817d = finderCommonFeatureService;
        }

        public void onAppBackground(String str) {
            this.f157817d.f157791S.mo76665I8();
            C20480e0 e0Var = C20480e0.f57583a;
            C61926c.m72668M(C58362f0.f167136d);
            C59698c.f170541a.mo84677a("onAppBackground");
        }

        public void onAppForeground(String str) {
            Class cls = C11266d.class;
            if (this.f157817d.f157791S.mo59665N() || ((C11266d) C86312j.m106911c(cls)).mo9194go() || ((C11266d) C86312j.m106911c(cls)).mo9197kQ()) {
                this.f157817d.f157791S.mo76691d2();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$b0 */
    public static final class C55401b0<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ View f157818a;

        public C55401b0(View view) {
            this.f157818a = view;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                C61926c.m72668M(new C55587c(this.f157818a, bitmap.copy(bitmap.getConfig(), true)));
                return;
            }
            Log.m105924i("Finder.FinderCommonFeatureService", "setBlurBitmap error, result is null!");
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$c0 */
    public static final class C55402c0 implements C80617t0.C80620c {
        /* renamed from: J0 */
        public void mo31867J0(String str) {
            C56294r0 r0Var = (C56294r0) C86312j.m106911c(C56294r0.class);
            r0Var.f160883f = true;
            Set<AppCompatActivity> set = r0Var.f160892r;
            C87412m.m108593f(set, "foregroundFinderActivity");
            C61926c.m72666K(0, new C56301v0(r0Var, (AppCompatActivity) C110818d0.m150924V(set)));
        }

        /* renamed from: h2 */
        public void mo31871h2(String str) {
            ((C56294r0) C86312j.m106911c(C56294r0.class)).xx0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$d */
    public static final class C55403d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C55403d f157819d = new C55403d();

        public C55403d() {
            super(0);
        }

        public Object invoke() {
            FinderVideoPassiveMiniViewHelper.f159083D.mo77472a().mo77454E0();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$f */
    public static final class C55404f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C55404f f157820d = new C55404f();

        public C55404f() {
            super(0);
        }

        public Object invoke() {
            FinderVideoPassiveMiniViewHelper.f159083D.mo77472a().mo77454E0();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$g0 */
    public static final class C55405g0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderCommonFeatureService f157821d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55405g0(FinderCommonFeatureService finderCommonFeatureService) {
            super(0);
            this.f157821d = finderCommonFeatureService;
        }

        public Object invoke() {
            boolean z;
            C61167e eVar = new C61167e();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LAST_WX_VERSION_STRING_SYNC;
            String str = "";
            String I = i.mo119675I(aVar, str);
            boolean z2 = false;
            if (!C87412m.m108589b(BuildInfo.CLIENT_VERSION, I)) {
                String str2 = C61167e.f174139b;
                Log.m105924i(str2, "change version " + I + " => " + BuildInfo.CLIENT_VERSION);
                C86709a0.m107535s().mo121142i().mo119677K(aVar, BuildInfo.CLIENT_VERSION);
                z = true;
            } else {
                z = false;
            }
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_LAST_WX_VERSION2_STRING_SYNC;
            String I2 = i2.mo119675I(aVar2, str);
            String format = String.format("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(C89625d.f257841g)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            if (!C87412m.m108589b(format, I2)) {
                String str3 = C61167e.f174139b;
                Log.m105924i(str3, "change wechatv " + I2 + " => " + format);
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, format);
                z = true;
            }
            C85801v1 i3 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_FINDER_LAST_WX_TAG_STRING_SYNC;
            String I3 = i3.mo119675I(aVar3, str);
            if (!C87412m.m108589b(BuildInfo.BUILD_TAG, I3)) {
                String str4 = C61167e.f174139b;
                Log.m105924i(str4, "change tag " + I3 + " => " + BuildInfo.BUILD_TAG);
                C86709a0.m107535s().mo121142i().mo119677K(aVar3, BuildInfo.BUILD_TAG);
                z = true;
            }
            if (z) {
                C87412m.m108593f(I, "lastVersion");
                C87412m.m108593f(I2, "lastVersion2");
                C87412m.m108593f(I3, "lastTag");
                eVar.f174140a.mo72288a();
                FinderStreamTrackStruct finderStreamTrackStruct = new FinderStreamTrackStruct();
                finderStreamTrackStruct.f156107d = 8;
                finderStreamTrackStruct.f156108e = 10000;
                finderStreamTrackStruct.f156109f = finderStreamTrackStruct.mo86045b("actionName", "wx_change", true);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lastVersion", I);
                jSONObject.put("lastVersion2", I2);
                jSONObject.put("lastTag", I3);
                jSONObject.put("ver", BuildInfo.CLIENT_VERSION);
                jSONObject.put("ver_init", C79471a.f233015c);
                String format2 = String.format("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(C89625d.f257841g)}, 1));
                C87412m.m108593f(format2, "format(format, *args)");
                jSONObject.put("CLIENT_VERSION", format2);
                jSONObject.put("tag", BuildInfo.BUILD_TAG);
                jSONObject.put("rev", BuildInfo.REV);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "JSONObject().also { json…\n            }.toString()");
                finderStreamTrackStruct.f156110g = finderStreamTrackStruct.mo86045b("actionExt", C112551y.m153814n(jSONObject2, ",", ";", false), true);
                finderStreamTrackStruct.f156116m = C31543z5.m39451a();
                finderStreamTrackStruct.f156111h = 0;
                JSONObject jSONObject3 = new JSONObject();
                String info = BuildInfo.info();
                String str5 = null;
                jSONObject3.put("result", info != null ? C112551y.m153814n(info, "\n", ";", false) : null);
                String jSONObject4 = jSONObject3.toString();
                C87412m.m108593f(jSONObject4, "JSONObject().also { json…\n            }.toString()");
                finderStreamTrackStruct.f156112i = finderStreamTrackStruct.mo86045b("resultExt", C112551y.m153814n(jSONObject4, ",", ";", false), true);
                finderStreamTrackStruct.f156113j = (long) 0;
                finderStreamTrackStruct.f156115l = 0;
                C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
                if (c != null) {
                    str5 = c.field_nickname;
                }
                if (str5 != null) {
                    str = str5;
                }
                finderStreamTrackStruct.f156114k = finderStreamTrackStruct.mo86045b("snn", str, true);
                String str6 = C61167e.f174139b;
                Log.m105924i(str6, "report value " + finderStreamTrackStruct.mo1006q());
                if (!BuildInfo.DEBUG) {
                    finderStreamTrackStruct.mo86054n();
                }
            }
            C58695b0 b0Var = C58695b0.f168022a;
            MultiProcessMMKV singleDefault = MultiProcessMMKV.getSingleDefault();
            for (C58695b0.C58696a aVar4 : C58695b0.f168024c) {
                C87412m.m108593f(singleDefault, "mmkv");
                aVar4.getClass();
                if (singleDefault.getLong(aVar4.f168027c, 0) != 0) {
                    singleDefault.putLong(aVar4.f168027c, 0);
                    singleDefault.commit();
                    Log.m105924i("Finder.FinderCrashChecker", "clean " + aVar4.f168027c);
                    C115669n.INSTANCE.mo175913w(aVar4.f168025a, aVar4.f168026b, 1);
                    Log.m105924i("Finder.FinderCrashChecker", "check " + aVar4.f168027c + ", hit!");
                }
            }
            boolean execSQL = this.f157821d.Cx0().f190170i.execSQL("FinderDraftItem", "DELETE FROM FinderDraftItem WHERE finderItem IS NULL");
            Log.m105924i("Finder.FinderDraftStorage", "clearInvalidData " + "DELETE FROM FinderDraftItem WHERE finderItem IS NULL" + ", succ:" + execSQL);
            if (Settings.System.getInt(MMApplicationContext.getContext().getContentResolver(), "accelerometer_rotation", 1) == 1) {
                z2 = true;
            }
            C13539y3.f38388C = z2;
            Log.m105924i("FinderVideoOrientationUIC", "checkSysAllowRotate: systemEnableLandscape = " + C13539y3.f38388C);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$h */
    public static final class C55406h implements C15907f.C15909b {

        /* renamed from: a */
        public final /* synthetic */ Context f157822a;

        /* renamed from: b */
        public final /* synthetic */ Intent f157823b;

        public C55406h(Context context, Intent intent) {
            this.f157822a = context;
            this.f157823b = intent;
        }

        /* renamed from: a */
        public void mo6380a() {
        }

        public void onSuccess() {
            ((C58684b) C86312j.m106911c(C58684b.class)).Zx0(this.f157822a, this.f157823b);
            C117361f.INSTANCE.mo182041q(540999685);
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$j */
    public static final class C55407j implements C15907f.C15909b {

        /* renamed from: a */
        public final /* synthetic */ FinderCommonFeatureService f157824a;

        /* renamed from: b */
        public final /* synthetic */ C104289g f157825b;

        /* renamed from: c */
        public final /* synthetic */ Context f157826c;

        /* renamed from: d */
        public final /* synthetic */ C60216z4.C8821a<Object> f157827d;

        public C55407j(FinderCommonFeatureService finderCommonFeatureService, C104289g gVar, Context context, C60216z4.C8821a<Object> aVar) {
            this.f157824a = finderCommonFeatureService;
            this.f157825b = gVar;
            this.f157826c = context;
            this.f157827d = aVar;
        }

        /* renamed from: a */
        public void mo6380a() {
        }

        public void onSuccess() {
            FinderCommonFeatureService finderCommonFeatureService = this.f157824a;
            C104289g gVar = this.f157825b;
            C87412m.m108593f(gVar, "extInfo");
            C60200t1.C60201a.m70371i(finderCommonFeatureService, gVar, this.f157826c, this.f157827d, (String) null, false, (C60216z4.C8821a) null, 56, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$j0 */
    public static final class C55408j0<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ Intent f157828a;

        /* renamed from: b */
        public final /* synthetic */ FinderCommonFeatureService f157829b;

        /* renamed from: c */
        public final /* synthetic */ Context f157830c;

        public C55408j0(Intent intent, FinderCommonFeatureService finderCommonFeatureService, Context context) {
            this.f157828a = intent;
            this.f157829b = finderCommonFeatureService;
            this.f157830c = context;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            if (!(i == 0 && cVar.f256794b == 0) && !C58739j4.f168176a.mo83681J(i, cVar.f256794b)) {
                FinderCommonFeatureService.xx0(this.f157829b, this.f157830c, cVar.f256794b, cVar.f256795c);
            } else {
                Intent intent = this.f157828a;
                FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
                intent.putExtra("KEY_OBJECT_ID", finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
                this.f157829b.Hm0(this.f157830c, this.f157828a);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$k */
    public static final class C55409k implements C15907f.C15909b {

        /* renamed from: a */
        public final /* synthetic */ FinderCommonFeatureService f157831a;

        /* renamed from: b */
        public final /* synthetic */ C104289g f157832b;

        /* renamed from: c */
        public final /* synthetic */ Context f157833c;

        /* renamed from: d */
        public final /* synthetic */ C60216z4.C8821a<Object> f157834d;

        /* renamed from: e */
        public final /* synthetic */ String f157835e;

        /* renamed from: f */
        public final /* synthetic */ C60216z4.C8821a<JSONObject> f157836f;

        public C55409k(FinderCommonFeatureService finderCommonFeatureService, C104289g gVar, Context context, C60216z4.C8821a<Object> aVar, String str, C60216z4.C8821a<JSONObject> aVar2) {
            this.f157831a = finderCommonFeatureService;
            this.f157832b = gVar;
            this.f157833c = context;
            this.f157834d = aVar;
            this.f157835e = str;
            this.f157836f = aVar2;
        }

        /* renamed from: a */
        public void mo6380a() {
        }

        public void onSuccess() {
            FinderCommonFeatureService finderCommonFeatureService = this.f157831a;
            C104289g gVar = this.f157832b;
            C87412m.m108593f(gVar, "extInfo");
            Context context = this.f157833c;
            C60216z4.C8821a<Object> aVar = this.f157834d;
            String str = this.f157835e;
            C87412m.m108593f(str, "appid");
            finderCommonFeatureService.mo76901yF(gVar, context, aVar, str, true, this.f157836f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$k0 */
    public static final class C55410k0 extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C55410k0 f157837d = new C55410k0();

        public C55410k0() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return "";
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$l */
    public static final class C55411l extends C87413o implements C32224a<C25026b> {

        /* renamed from: d */
        public static final C55411l f157838d = new C55411l();

        public C55411l() {
            super(0);
        }

        public Object invoke() {
            C25026b bVar = new C25026b();
            Log.m105924i("FinderNetworkFlowReport", "onAttach");
            return bVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$l0 */
    public static final class C55412l0<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ Intent f157839a;

        /* renamed from: b */
        public final /* synthetic */ FinderCommonFeatureService f157840b;

        /* renamed from: c */
        public final /* synthetic */ Context f157841c;

        public C55412l0(Intent intent, FinderCommonFeatureService finderCommonFeatureService, Context context) {
            this.f157839a = intent;
            this.f157840b = finderCommonFeatureService;
            this.f157841c = context;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            if (!(i == 0 && cVar.f256794b == 0) && !C58739j4.f168176a.mo83681J(i, cVar.f256794b)) {
                FinderCommonFeatureService.xx0(this.f157840b, this.f157841c, cVar.f256794b, cVar.f256795c);
            } else {
                Intent intent = this.f157839a;
                FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
                intent.putExtra("KEY_OBJECT_ID", finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
                this.f157840b.Hm0(this.f157841c, this.f157839a);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.FinderCommonFeatureService", mo125469f = "FinderCommonFeatureService.kt", mo125470l = {1681, 1699, 1708, 1718, 1732}, mo125471m = "finderPayFullWholeProcess")
    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$m */
    public static final class C55413m extends C66704d {

        /* renamed from: d */
        public Object f157842d;

        /* renamed from: e */
        public Object f157843e;

        /* renamed from: f */
        public Object f157844f;

        /* renamed from: g */
        public Object f157845g;

        /* renamed from: h */
        public Object f157846h;

        /* renamed from: i */
        public Object f157847i;

        /* renamed from: j */
        public Object f157848j;

        /* renamed from: n */
        public long f157849n;

        /* renamed from: o */
        public long f157850o;

        /* renamed from: p */
        public /* synthetic */ Object f157851p;

        /* renamed from: q */
        public final /* synthetic */ FinderCommonFeatureService f157852q;

        /* renamed from: r */
        public int f157853r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55413m(FinderCommonFeatureService finderCommonFeatureService, C15601d<? super C55413m> dVar) {
            super(dVar);
            this.f157852q = finderCommonFeatureService;
        }

        public final Object invokeSuspend(Object obj) {
            this.f157851p = obj;
            this.f157853r |= Integer.MIN_VALUE;
            return this.f157852q.wn0((Context) null, (C51398th3) null, 0, 0, (C89349b) null, (String) null, this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$m0 */
    public static final class C55414m0 implements C15907f.C15909b {

        /* renamed from: a */
        public final /* synthetic */ FinderCommonFeatureService f157854a;

        /* renamed from: b */
        public final /* synthetic */ int f157855b;

        /* renamed from: c */
        public final /* synthetic */ int f157856c;

        /* renamed from: d */
        public final /* synthetic */ int f157857d;

        /* renamed from: e */
        public final /* synthetic */ Context f157858e;

        /* renamed from: f */
        public final /* synthetic */ Intent f157859f;

        /* renamed from: g */
        public final /* synthetic */ View f157860g;

        /* renamed from: h */
        public final /* synthetic */ boolean f157861h;

        public C55414m0(FinderCommonFeatureService finderCommonFeatureService, int i, int i2, int i3, Context context, Intent intent, View view, boolean z) {
            this.f157854a = finderCommonFeatureService;
            this.f157855b = i;
            this.f157856c = i2;
            this.f157857d = i3;
            this.f157858e = context;
            this.f157859f = intent;
            this.f157860g = view;
            this.f157861h = z;
        }

        /* renamed from: a */
        public void mo6380a() {
        }

        public void onSuccess() {
            this.f157854a.Yx0(this.f157855b, this.f157856c, this.f157857d, this.f157858e, this.f157859f, this.f157860g, this.f157861h);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.FinderCommonFeatureService", mo125469f = "FinderCommonFeatureService.kt", mo125470l = {1788, 1800}, mo125471m = "orderAndPay")
    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$n0 */
    public static final class C55415n0 extends C66704d {

        /* renamed from: d */
        public Object f157862d;

        /* renamed from: e */
        public Object f157863e;

        /* renamed from: f */
        public Object f157864f;

        /* renamed from: g */
        public Object f157865g;

        /* renamed from: h */
        public /* synthetic */ Object f157866h;

        /* renamed from: i */
        public final /* synthetic */ FinderCommonFeatureService f157867i;

        /* renamed from: j */
        public int f157868j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55415n0(FinderCommonFeatureService finderCommonFeatureService, C15601d<? super C55415n0> dVar) {
            super(dVar);
            this.f157867i = finderCommonFeatureService;
        }

        public final Object invokeSuspend(Object obj) {
            this.f157866h = obj;
            this.f157868j |= Integer.MIN_VALUE;
            return this.f157867i.Xx0((Context) null, (C51398th3) null, 0, 0, (C89349b) null, (String) null, this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$p0 */
    public static final class C55416p0<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ Intent f157869a;

        /* renamed from: b */
        public final /* synthetic */ FinderCommonFeatureService f157870b;

        /* renamed from: c */
        public final /* synthetic */ Context f157871c;

        public C55416p0(Intent intent, FinderCommonFeatureService finderCommonFeatureService, Context context) {
            this.f157869a = intent;
            this.f157870b = finderCommonFeatureService;
            this.f157871c = context;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            if (!(i == 0 && cVar.f256794b == 0) && !C58739j4.f168176a.mo83681J(i, cVar.f256794b)) {
                FinderCommonFeatureService.xx0(this.f157870b, this.f157871c, cVar.f256794b, cVar.f256795c);
            } else {
                Intent intent = this.f157869a;
                FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
                intent.putExtra("KEY_OBJECT_ID", finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
                this.f157870b.Hm0(this.f157871c, this.f157869a);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.FinderCommonFeatureService", mo125469f = "FinderCommonFeatureService.kt", mo125470l = {4390, 4454, 4461}, mo125471m = "generateFinderVideoPlayer")
    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$q */
    public static final class C55417q extends C66704d {

        /* renamed from: d */
        public Object f157872d;

        /* renamed from: e */
        public Object f157873e;

        /* renamed from: f */
        public Object f157874f;

        /* renamed from: g */
        public Object f157875g;

        /* renamed from: h */
        public Object f157876h;

        /* renamed from: i */
        public long f157877i;

        /* renamed from: j */
        public long f157878j;

        /* renamed from: n */
        public int f157879n;

        /* renamed from: o */
        public /* synthetic */ Object f157880o;

        /* renamed from: p */
        public final /* synthetic */ FinderCommonFeatureService f157881p;

        /* renamed from: q */
        public int f157882q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55417q(FinderCommonFeatureService finderCommonFeatureService, C15601d<? super C55417q> dVar) {
            super(dVar);
            this.f157881p = finderCommonFeatureService;
        }

        public final Object invokeSuspend(Object obj) {
            this.f157880o = obj;
            this.f157882q |= Integer.MIN_VALUE;
            return this.f157881p.Jb0(0, (String) null, 0, 0, (C60171g1) null, (C60157c5) null, this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$q0 */
    public static final class C55418q0 extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C55418q0 f157883d = new C55418q0();

        public C55418q0() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return "";
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$r0 */
    public static final class C55419r0<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ Intent f157884a;

        /* renamed from: b */
        public final /* synthetic */ FinderCommonFeatureService f157885b;

        /* renamed from: c */
        public final /* synthetic */ Context f157886c;

        public C55419r0(Intent intent, FinderCommonFeatureService finderCommonFeatureService, Context context) {
            this.f157884a = intent;
            this.f157885b = finderCommonFeatureService;
            this.f157886c = context;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            if (!(i == 0 && cVar.f256794b == 0) && !C58739j4.f168176a.mo83681J(i, cVar.f256794b)) {
                FinderCommonFeatureService.xx0(this.f157885b, this.f157886c, cVar.f256794b, cVar.f256795c);
            } else {
                Intent intent = this.f157884a;
                FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
                intent.putExtra("KEY_OBJECT_ID", finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
                this.f157885b.Hm0(this.f157886c, this.f157884a);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.FinderCommonFeatureService", mo125469f = "FinderCommonFeatureService.kt", mo125470l = {1635}, mo125471m = "getProduct")
    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$u */
    public static final class C55420u extends C66704d {

        /* renamed from: d */
        public Object f157887d;

        /* renamed from: e */
        public /* synthetic */ Object f157888e;

        /* renamed from: f */
        public final /* synthetic */ FinderCommonFeatureService f157889f;

        /* renamed from: g */
        public int f157890g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55420u(FinderCommonFeatureService finderCommonFeatureService, C15601d<? super C55420u> dVar) {
            super(dVar);
            this.f157889f = finderCommonFeatureService;
        }

        public final Object invokeSuspend(Object obj) {
            this.f157888e = obj;
            this.f157890g |= Integer.MIN_VALUE;
            return this.f157889f.mo76881tZ((Context) null, (C89349b) null, false, this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$y0 */
    public static final class C55421y0<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C60200t1.C60202b f157891a;

        /* renamed from: b */
        public final /* synthetic */ long f157892b;

        public C55421y0(C60200t1.C60202b bVar, long j) {
            this.f157891a = bVar;
            this.f157892b = j;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            if (!(i == 0 && cVar.f256794b == 0) && !C58739j4.f168176a.mo83681J(i, cVar.f256794b)) {
                C60200t1.C60202b bVar = this.f157891a;
                if (bVar != null) {
                    bVar.mo75691a((Object) null, cVar.f256793a, cVar.f256794b);
                }
            } else {
                FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
                if (finderObject != null) {
                    C60200t1.C60202b bVar2 = this.f157891a;
                    C65834e.f189316a.mo89878l(FinderItem.Companion.mo79056a(finderObject, 1), C65834e.C65836b.f189330j);
                    if (bVar2 != null) {
                        bVar2.mo75691a(finderObject, cVar.f256793a, cVar.f256794b);
                    }
                }
            }
            Log.m105924i("Finder.FinderCommonFeatureService", "tryGetFinderObject " + this.f157892b + ", finish");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonFeatureService$z */
    public static final class C55422z<T, R> implements C64207e {

        /* renamed from: a */
        public static final C55422z<T, R> f157893a = new C55422z<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
        }
    }

    public FinderCommonFeatureService() {
        super("FinderUIC");
        C36568h.m40985a(C40389o0.f108531d);
        this.f157791S = (C64916p1) C86312j.m106911c(C64916p1.class);
        this.f157792T = new FinderCommonFeatureService$entryConfigChangeListener$1(this, C40008f.f107254d);
        this.f157795W = new C55400b(this);
        this.f157796X = new C55402c0();
        this.f157797Y = new ConcurrentHashMap<>();
    }

    public static final void Ax0(C8479f0<C89779i0> f0Var, Context context) {
        C89779i0 i0Var = (C89779i0) f0Var.f27484d;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        f0Var.f27484d = C89779i0.m112248e(context, context.getString(C0966R.string.a4d), false, 3, (DialogInterface.OnCancelListener) null);
    }

    public static void Sx0(FinderCommonFeatureService finderCommonFeatureService, C104289g gVar, Context context, C60216z4.C8821a aVar, C60216z4.C8821a aVar2, int i, Object obj) {
        C104289g gVar2 = gVar;
        C60216z4.C8821a aVar3 = (i & 4) != 0 ? null : aVar;
        C60216z4.C8821a aVar4 = (i & 8) != 0 ? null : aVar2;
        finderCommonFeatureService.getClass();
        String optString = gVar2.optString("username");
        String optString2 = gVar2.optString("fromUsername");
        String optString3 = gVar2.optString("nickname");
        String optString4 = gVar2.optString("headUrl");
        String optString5 = gVar2.optString("signature");
        String optString6 = gVar2.optString("liveContactExtInfo");
        C26827e l = gVar2.optJSONArray("badgeInfo");
        boolean optBoolean = gVar2.optBoolean("isDarkMode");
        int optInt = gVar2.optInt("liveIdentity", 0);
        C49765hx0 hx02 = new C49765hx0();
        FinderContact finderContact = new FinderContact();
        finderContact.username = optString;
        finderContact.headUrl = optString4;
        finderContact.signature = optString5;
        finderContact.nickname = optString3;
        hx02.f134919d = finderContact;
        hx02.f134926n = optInt;
        if ((l != null ? l.length() : 0) > 0) {
            C104289g o = l != null ? l.mo53814m(0) : null;
            if (o != null) {
                LinkedList<C48770aw0> linkedList = hx02.f134930r;
                C48770aw0 aw02 = new C48770aw0();
                aw02.f130789d = o.optInt("badgeType");
                aw02.f130791f = o.optInt("badgeLevel");
                aw02.f130793h = o.optString("badgeName");
                linkedList.add(aw02);
            }
        }
        C87412m.m108593f(optString6, "liveContactExtInfo");
        byte[] bytes = optString6.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        hx02.f134928p = C61937h.m72710i(bytes);
        C87412m.m108593f(optString2, "fromUsername");
        ((C60606n) C86312j.m106911c(C60606n.class)).mo85030SV(context, hx02, optBoolean, optString2, aVar3, aVar4);
    }

    public static void Tx0(FinderCommonFeatureService finderCommonFeatureService, C104289g gVar, Context context, C60216z4.C8821a aVar, String str, int i, Object obj) {
        C104289g gVar2 = gVar;
        C60216z4.C8821a aVar2 = aVar;
        finderCommonFeatureService.getClass();
        int optInt = gVar.optInt("requestScene");
        boolean optBoolean = gVar.optBoolean("useDarkStyle");
        int optInt2 = gVar.optInt("selectTabId");
        int optInt3 = gVar.optInt("selectSecondTabId");
        String optString = gVar.optString("byPass");
        int optInt4 = gVar.optInt("entryScene");
        String optString2 = gVar.optString("feedID");
        String optString3 = gVar.optString("nonceID");
        String optString4 = gVar.optString("pageTitle");
        C87412m.m108593f(optString, "byPass");
        C87412m.m108593f(optString2, "feedExportId");
        C87412m.m108593f(optString3, "feedNonceId");
        C87412m.m108593f(optString4, "pageTitle");
        finderCommonFeatureService.Ux0(context, optInt, optBoolean, optInt2, optInt3, optString, optInt4, optString2, optString3, optString4);
        if (aVar2 != null) {
            aVar2.mo6382a(Boolean.TRUE);
        }
    }

    public static final HashMap vx0(FinderCommonFeatureService finderCommonFeatureService) {
        finderCommonFeatureService.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(-588752298, C64923x.f186949a);
        hashMap.put(8241270, C64924y.f186950a);
        hashMap.put(-607803568, C64926z.f186951a);
        hashMap.put(941575046, C64900a0.f186916a);
        hashMap.put(1448608983, C64901b0.f186917a);
        hashMap.put(50260943, C64902c0.f186918a);
        hashMap.put(1004338348, C64903d0.f186919a);
        hashMap.put(1404586887, C37024e0.f98156a);
        hashMap.put(228327964, C64909f0.f186942a);
        String[] strArr = C37557u.f99615e;
        hashMap.put(1928952866, C37046s.f98205a);
        hashMap.put(-1390563540, C37048t.f98207a);
        hashMap.put(858417175, C37050u.f98211a);
        hashMap.put(-1660748526, C13889v.f39048a);
        hashMap.put(2115627522, C13890w.f39049a);
        hashMap.putAll(((C60606n) C86312j.m106911c(C60606n.class)).mo85045Xr());
        return hashMap;
    }

    public static final HashMap wx0(FinderCommonFeatureService finderCommonFeatureService) {
        finderCommonFeatureService.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(1369323289, C64911g0.f186944a);
        hashMap.put(643438356, C64912h0.f186945a);
        hashMap.putAll(((C60606n) C86312j.m106911c(C60606n.class)).sr0());
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void xx0(com.tencent.p014mm.plugin.FinderCommonFeatureService r0, android.content.Context r1, int r2, java.lang.String r3) {
        /*
            r0.getClass()
            r0 = -4036(0xfffffffffffff03c, float:NaN)
            if (r2 == r0) goto L_0x0038
            r0 = -4033(0xfffffffffffff03f, float:NaN)
            if (r2 == r0) goto L_0x0025
            r0 = -4011(0xfffffffffffff055, float:NaN)
            if (r2 == r0) goto L_0x0012
            java.lang.String r0 = ""
            goto L_0x004b
        L_0x0012:
            if (r3 != 0) goto L_0x004a
            android.content.res.Resources r0 = r1.getResources()
            r2 = 2131826557(0x7f11177d, float:1.9286002E38)
            java.lang.String r3 = r0.getString(r2)
            java.lang.String r0 = "context.resources.getStr….finder_feed_deleted_tip)"
            gy3.C87412m.m108593f(r3, r0)
            goto L_0x004a
        L_0x0025:
            if (r3 != 0) goto L_0x004a
            android.content.res.Resources r0 = r1.getResources()
            r2 = 2131826641(0x7f1117d1, float:1.9286172E38)
            java.lang.String r3 = r0.getString(r2)
            java.lang.String r0 = "context.resources.getStr…finder_feed_self_see_tip)"
            gy3.C87412m.m108593f(r3, r0)
            goto L_0x004a
        L_0x0038:
            if (r3 != 0) goto L_0x004a
            android.content.res.Resources r0 = r1.getResources()
            r2 = 2131829851(0x7f11245b, float:1.9292683E38)
            java.lang.String r3 = r0.getString(r2)
            java.lang.String r0 = "context.resources.getStr….finder_set_privacy_tips)"
            gy3.C87412m.m108593f(r3, r0)
        L_0x004a:
            r0 = r3
        L_0x004b:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x0061
            android.content.res.Resources r0 = r1.getResources()
            r2 = 2131826389(0x7f1116d5, float:1.928566E38)
            java.lang.String r0 = r0.getString(r2)
            java.lang.String r2 = "context.resources.getStr…reate_contact_failed_tip)"
            gy3.C87412m.m108593f(r0, r2)
        L_0x0061:
            r2 = 0
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r1, (java.lang.CharSequence) r0, (int) r2)
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.xx0(com.tencent.mm.plugin.FinderCommonFeatureService, android.content.Context, int, java.lang.String):void");
    }

    /* renamed from: AN */
    public void mo76733AN(LinkedList<C50676og0> linkedList, int i, int i2) {
        C87412m.m108594g(linkedList, "objectIds");
        ((C0359u) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C0359u.class)).getClass();
        C0350i iVar = (C0350i) ((C36570n) C0350i.f938a).getValue();
        iVar.getClass();
        C37521f.f99374d.getClass();
        int intValue = C37521f.f99506r8.mo60266n().intValue();
        Log.m105925i("FinderSearchRelPreLoader", "preload searchH5PreloadFlag %d", Integer.valueOf(intValue));
        if (intValue == 1) {
            ((C119157j) C119157j.f356862d).mo183876g(new C0356n(iVar, linkedList, i, i2), "FinderSearchRelPreLoader");
        }
    }

    /* renamed from: AX */
    public C13605o<Integer, Integer, Integer> mo76734AX(String str) {
        C87412m.m108594g(str, "contextId");
        List U = C112550d0.m153785U(str, new String[]{"-"}, false, 0, 6, (Object) null);
        if (U.size() != 4) {
            return new C13605o<>(0, 0, 0);
        }
        try {
            return new C13605o<>(Integer.valueOf(Integer.parseInt((String) U.get(0))), Integer.valueOf(Integer.parseInt((String) U.get(1))), Integer.valueOf(Integer.parseInt((String) U.get(2))));
        } catch (NumberFormatException unused) {
            Log.m105924i("Finder.FinderCommonFeatureService", "parseContextId error contextId: " + str);
            return new C13605o<>(0, 0, 0);
        }
    }

    /* renamed from: Af */
    public Object mo76735Af(int i, int i2, C15601d<? super C13598b0> dVar) {
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        C86709a0.m107524d().mo123455a(978, new C1323s0(hVar));
        C86709a0.m107524d().mo123460f(new C60806o3(i, i2, (String) null, 4, (C8480h) null));
        Object b = hVar.mo90314b();
        return b == C15911a.COROUTINE_SUSPENDED ? b : C13598b0.f38549a;
    }

    /* renamed from: BW */
    public int mo76737BW(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        C65866w.C14968a aVar = C65866w.f189406g;
        return C65866w.f189407h.mo89909h(finderObject);
    }

    /* renamed from: Bx0 */
    public C52593j mo76776L4() {
        C52593j jVar = this.f157806r;
        if (jVar == null) {
            jVar = new C52593j(Rx0(this.f157801j, new C52337m0(this)));
        }
        this.f157806r = jVar;
        return jVar;
    }

    /* renamed from: CG */
    public String mo76739CG(String str, Intent intent) {
        if (intent != null) {
            intent.putExtra("key_context_id", str);
        }
        Log.m105924i("Finder.FinderCommonFeatureService", "fillContextIdToIntent USERINFO_FINDER_CONTEXT_ID_STRING:" + str);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_CONTEXT_ID_STRING, str);
        C58411u.f167342a = str;
        return str == null ? "" : str;
    }

    public void Ch0(Context context, C48727ak1 ak12, int i, List<? extends C48727ak1> list, int i2, String str) {
        Activity ub02;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(ak12, "hotWord");
        C87412m.m108594g(str, "reportInfo");
        if (!(context instanceof Activity) && (ub02 = ((C60204t3) C86312j.m106911c(C60204t3.class)).ub0()) != null) {
            context = ub02;
        }
        Intent intent = new Intent();
        String str2 = ak12.f130586d;
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("key_search_query", str2);
        C89349b bVar = ak12.f130590h;
        intent.putExtra("key_search_session_buffer", bVar != null ? bVar.mo123703f() : null);
        intent.putExtra("key_search_hot_word_info", SearchHotWordListParcelable.CREATOR.mo3935a(ak12, i, list));
        ((C58684b) C86312j.m106911c(C58684b.class)).Hx0(context, (C50972qk0) null, intent);
    }

    /* renamed from: Cm */
    public void mo76741Cm(String str, ImageView imageView, C11978e0.C11979a aVar) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(aVar, "loaderType");
        Log.m105924i("Finder.FinderCommonFeatureService", "#loadImage url=" + str);
        if (!(str == null || str.length() == 0)) {
            C64689rq2 rq22 = new C64689rq2();
            C58784w3 w3Var = C58784w3.f168295a;
            String x1 = w3Var.mo83978x1(str == null ? "" : str, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            rq22.f185275p = MD5Util.getMD5String(x1);
            rq22.f185266d = str;
            rq22.f185267e = str;
            String z1 = w3Var.mo83984z1(x1);
            rq22.f185285x0 = z1;
            rq22.f185287y0 = z1;
            C62344b0 b0Var = new C62344b0(rq22, C27696y.THUMB_IMAGE, (String) null, (String) null, 12, (C8480h) null);
            if (imageView == null) {
                ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(b0Var, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar)).mo85953c();
            } else {
                ((C99342a) ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(b0Var, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar))).mo85954d(imageView);
            }
        }
    }

    public final C66165b Cx0() {
        C86709a0.m107523b().mo121108c();
        C66165b bVar = this.f157811w;
        if (bVar == null) {
            bVar = new C66165b(mo76790Np());
        }
        this.f157811w = bVar;
        return bVar;
    }

    /* renamed from: DB */
    public boolean mo76743DB() {
        C37521f.f99374d.getClass();
        return C37521f.f99473o3.mo60266n().intValue() == 1;
    }

    /* renamed from: Dl */
    public void mo76744Dl(String str, String str2, String str3) {
        C7853p2 p2Var = C7853p2.f26439a;
        Log.m105924i("Finder.FinderSdkShareUtil", "LogPost, dealShare, businessType:" + str + ", appid:" + str2 + ", extInfo:" + str3);
        if (str3 == null || Util.isNullOrNil(str3) || str == null || Util.isNullOrNil(str) || str2 == null || Util.isNullOrNil(str2)) {
            p2Var.mo8959b(-1, "appid or extInfo empty", str, str2);
            return;
        }
        Intent intent = new Intent();
        m44 m44 = new m44();
        m44.f184200d = 1;
        C64638pv3 pv32 = new C64638pv3();
        pv32.f184892d = str;
        pv32.f184893e = str2;
        pv32.f184894f = str3;
        m44.f184201e = pv32;
        intent.putExtra("KEY_POST_FROM_SHARE", m44.toByteArray());
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
        ((C61381b) C86312j.m106911c(C61381b.class)).Yp0().mo88191c(context, intent);
    }

    public final C14358p Dx0() {
        C86709a0.m107523b().mo121108c();
        C14358p pVar = this.f157810v;
        if (pVar == null) {
            pVar = new C14358p(mo76790Np());
        }
        this.f157810v = pVar;
        return pVar;
    }

    /* renamed from: E6 */
    public void mo76746E6(String str, C60216z4.C8821a<Integer> aVar) {
        if (str != null) {
            C13598b0 b0Var = null;
            try {
                C104289g gVar = new C104289g(str);
                String optString = gVar.optString("businessType");
                Log.m105924i("Finder.FinderCommonFeatureService", "clearFinderRedDot json: " + str + " businessType:" + optString);
                Object obj = gVar.get("redDotPath");
                C26827e eVar = obj instanceof String ? new C26827e((String) obj) : obj instanceof C26827e ? (C26827e) obj : new C26827e("");
                int length = eVar.length();
                for (int i = 0; i < length; i++) {
                    String obj2 = eVar.get(i).toString();
                    Log.m105924i("Finder.FinderCommonFeatureService", "clearFinderRedDot path:" + obj2);
                    Nt0().mo77239M5(obj2);
                }
                if (aVar != null) {
                    aVar.mo6382a(1);
                    b0Var = C13598b0.f38549a;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("Finder.FinderCommonFeatureService", e, "clearFinderRedDot exception", new Object[0]);
                if (aVar != null) {
                    aVar.mo6382a(0);
                    b0Var = C13598b0.f38549a;
                }
            }
            if (b0Var != null) {
                return;
            }
        }
        if (aVar != null) {
            aVar.mo6382a(0);
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
    }

    /* renamed from: EE */
    public final boolean mo76747EE(String str) {
        if (str == null) {
            return false;
        }
        Boolean bool = this.f157797Y.get(str);
        if (bool == null) {
            bool = Boolean.valueOf(C58784w3.f168295a.mo83875I0(str));
            this.f157797Y.put(str, bool);
        }
        return bool.booleanValue();
    }

    /* renamed from: EK */
    public C64586nn1 mo76748EK(C66277w3 w3Var, String str) {
        C87412m.m108594g(w3Var, "ctrlInfo");
        C87412m.m108594g(str, "path");
        C55718s0 s0Var = w3Var instanceof C55718s0 ? (C55718s0) w3Var : null;
        if (s0Var != null) {
            return s0Var.mo77308o2(str);
        }
        return null;
    }

    public void Em0(Context context, FinderJumpInfo finderJumpInfo, C60200t1.C60203c cVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(finderJumpInfo, "info");
        C62262d0.f176978a.mo87322m(context, new C11920q(finderJumpInfo), (C60905o) null, cVar);
    }

    public final C65412c Ex0() {
        C86709a0.m107523b().mo121108c();
        C65412c cVar = this.f157775B;
        if (cVar == null) {
            cVar = new C65412c(mo76790Np());
        }
        this.f157775B = cVar;
        return cVar;
    }

    /* renamed from: F */
    public boolean mo76751F() {
        return ((C60606n) C86312j.m106911c(C60606n.class)).mo85002F();
    }

    public void Fc0(Context context, Intent intent, boolean z) {
        boolean z2;
        Class<FinderCommonFeatureService> cls = FinderCommonFeatureService.class;
        Class cls2 = C58684b.class;
        C87412m.m108594g(context, "context");
        C20480e0.f57583a.mo32031d();
        C58358d0.f167118d = null;
        C58358d0.f167116b = 0;
        C58358d0.f167117c = 0;
        C58358d0.f167119e = false;
        C58358d0.f167121g = true;
        C58358d0.C58359a aVar = new C58358d0.C58359a();
        aVar.f167123a = SystemClock.elapsedRealtime();
        C58358d0.f167118d = aVar;
        C58358d0.f167116b = 2;
        C58358d0.f167117c = 1;
        aVar.f167124b = 0;
        aVar.f167125c = 0;
        aVar.f167126d = 0;
        aVar.f167127e = 0;
        aVar.f167128f = 0;
        if (intent != null) {
            if (intent.getBooleanExtra("key_form_sns", false)) {
                String stringExtra = intent.getStringExtra("key_context_id");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                z2 = !Util.isNullOrNil(C2483o0.f12984a.mo2454d(stringExtra, 1, 0, new C60165e4.C46105a(0, 0, 3, (C8480h) null)));
            } else {
                z2 = false;
            }
            if (z2 || (!Util.isNullOrNil(intent.getStringExtra("key_red_dot_id")))) {
                C20480e0.f57585c = true;
            }
        }
        if (z) {
            C37521f.f99374d.getClass();
            if (C37521f.f99520t4.mo60266n().intValue() == 1) {
                if (intent != null && intent.getBooleanExtra("KEY_ROUTE_TO_TOPIC", false)) {
                    C62262d0.f176978a.mo87312a(intent, C1319i.f10447d);
                }
                FinderStreamTabPreloadCore finderStreamTabPreloadCore = (FinderStreamTabPreloadCore) C39818r.f106831a.mo62446e(cls).mo75002a(FinderStreamTabPreloadCore.class);
                for (C58341h hVar : finderStreamTabPreloadCore.f160333e) {
                    int i3 = finderStreamTabPreloadCore.mo78459i3();
                    boolean f3 = ((C11739f) ((C36570n) hVar.f167026b.f160334f).getValue()).mo11603f3(hVar.f167025a);
                    String str = hVar.f167027c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("[performEnterFinderLoad] targetTab=");
                    sb.append(i3);
                    sb.append(", cache.resp is null = ");
                    sb.append(hVar.f167040p.f167044b == null);
                    sb.append(", isAutoRefresh = ");
                    sb.append(f3);
                    Log.m105924i(str, sb.toString());
                    if (hVar.f167025a == i3 && hVar.f167040p.f167044b == null && f3) {
                        hVar.mo83085p(C58341h.C58344f.EnterLoad, intent, new C31225l(hVar));
                    }
                }
            }
        }
        int intExtra = intent != null ? intent.getIntExtra("FROM_SCENE_KEY", 2) : 2;
        if (intExtra == 6) {
            C11739f.C11740a c3 = ((C11739f) C39818r.f106831a.mo62446e(cls).mo75002a(C11739f.class)).mo11600c3(4);
            c3.f34376i = C11739f.C11742c.HardRefresh;
            c3.f34375h = System.currentTimeMillis();
            C7335d c = C86312j.m106911c(cls2);
            C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
            C58684b.by0((C58684b) c, context, intent, intExtra, false, 8, (Object) null);
        } else {
            C7335d c2 = C86312j.m106911c(cls2);
            C87412m.m108593f(c2, "getService(ActivityRouter::class.java)");
            C58684b.by0((C58684b) c2, context, intent, 0, false, 12, (Object) null);
        }
        C117361f.INSTANCE.mo182041q(540999684);
    }

    public C65488a0 Fd0(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        return C7888v2.f26513a.mo9005c(finderObject);
    }

    public void Fs0() {
        for (C58341h e : ((FinderStreamTabPreloadCore) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderStreamTabPreloadCore.class)).f160333e) {
            e.mo83089e(true, "clearAllCache");
        }
    }

    public final C25026b Fx0() {
        return (C25026b) this.f157790R.getValue();
    }

    /* renamed from: Gf */
    public void mo76756Gf(String str, String str2, Activity activity) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(str2, "fromUsername");
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C7888v2.f26513a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        String format = String.format("%s#%s", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis()), str2}, 2));
        C87412m.m108593f(format, "format(format, *args)");
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        C101834rc0 rc02 = new C101834rc0();
        rd02.mo141275k(str2);
        rd02.mo141279o(C75592q0.m90789s());
        rd02.mo141277m(2);
        rd02.mo141273f(currentTimeMillis);
        rd02.mo141274j(format);
        rd02.mo141278n(format);
        rc02.mo141259o(format);
        rc02.f299284V = str;
        if (C86013q1.m106450k(str)) {
            rc02.f299286W = str;
        } else {
            doFavoriteEvent.f264674d.f264687l = C0966R.string.f360422co2;
        }
        rc02.mo141260p(2);
        kd02.f298618f.add(rc02);
        kd02.mo141219q(rd02);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264676a = kd02;
        aVar.f264684i = activity;
        aVar.f264678c = 2;
        doFavoriteEvent.publish();
    }

    public long Gj0() {
        return C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_ENTER_FINDER_TL_LONG_SYNC, 0);
    }

    public final C37550i0 Gx0() {
        C86709a0.m107523b().mo121108c();
        C37550i0 i0Var = this.f157809u;
        if (i0Var == null) {
            i0Var = new C37550i0(Rx0(this.f157801j, new C52337m0(this)));
        }
        this.f157809u = i0Var;
        return i0Var;
    }

    /* renamed from: HO */
    public C117747y mo76759HO(List<String> list) {
        C87412m.m108594g(list, "urlList");
        return new C9379t3(list);
    }

    /* renamed from: HX */
    public void mo76760HX(C64682rk1 rk12, int i, long j, String str, C49712hj1 hj12, long j2) {
        C87412m.m108594g(rk12, "shareObj");
        C87412m.m108594g(str, "receiver");
        ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83314U3(rk12, i, j, str, hj12, j2);
    }

    /* renamed from: Ha */
    public void mo76761Ha(Context context, Intent intent, String str, C60216z4.C8821a<Integer> aVar) {
        C87412m.m108594g(context, "context");
        if (!mo76873sF() || !mo76879tO() || ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            Log.m105924i("Finder.FinderCommonFeatureService", "[createAccount] no finder entry or in teen mode");
            if (aVar != null) {
                aVar.mo6382a(2);
            }
        } else if (str != null) {
            Log.m105924i("Finder.FinderCommonFeatureService", "json: " + str);
            try {
                if (str.length() == 0) {
                    str = "{}";
                }
                C7786c0.f26287d.mo8897a(context, new C104289g(str), aVar);
            } catch (Exception e) {
                Log.printErrStackTrace("Finder.FinderCommonFeatureService", e, "createAccount exception", new Object[0]);
            }
        }
    }

    public void Hm0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        Fc0(context, intent, false);
    }

    public List<C66261f3> Hw0() {
        return Dx0().Hw0();
    }

    public final C55048e Hx0() {
        return (C55048e) this.f157789Q.getValue();
    }

    /* renamed from: IQ */
    public C64682rk1 mo76765IQ(FinderObject finderObject, boolean z) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        return C7888v2.f26513a.mo9010h(FinderItem.Companion.mo79056a(finderObject, finderObject.objectType), z);
    }

    public C47465a Iw0(String str, String str2, long j, FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        return C7888v2.f26513a.mo9009g(str, str2, j, finderObject);
    }

    public final MAutoStorage<C66274t3> Ix0(int i) {
        C86709a0.m107523b().mo121108c();
        if (i == 1) {
            C65424s0 s0Var = this.f157814z;
            if (s0Var == null) {
                s0Var = new C65424s0(Rx0(this.f157800i, new C52338n0(this)));
            }
            this.f157814z = s0Var;
            return s0Var;
        }
        C65423q qVar = this.f157774A;
        if (qVar == null) {
            qVar = new C65423q(mo76895xS());
        }
        this.f157774A = qVar;
        return qVar;
    }

    /* renamed from: Iz */
    public void mo76768Iz(String str, long j) {
        C87412m.m108594g(str, "finderUser");
        C0751m0.m692c(C0751m0.f1769a, new C49712hj1(), str, 2, j, false, 0, (C64414h71) null, (Integer) null, 240, (Object) null);
    }

    /* renamed from: JB */
    public void mo76769JB(String str) {
        C87412m.m108594g(str, "commentScene");
        ((C61130g) C86312j.m106911c(C61130g.class)).mo33246ry(str);
    }

    /* renamed from: JJ */
    public void mo76770JJ(Context context, String str) {
        Activity ub02;
        Activity activity = context;
        C87412m.m108594g(activity, "context");
        C64586nn1 R5 = Nt0().mo77246R5("FinderLiveIncomeEntrance");
        C55718s0 G5 = Nt0().mo77227G5("FinderLiveIncomeEntrance");
        if (!(R5 == null || G5 == null)) {
            C58413v0 v0Var = C58413v0.f167346a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(activity);
            C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, G5, R5, 2, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
        }
        Nt0().mo77239M5("FinderLiveIncomeEntrance");
        if (!(activity instanceof Activity) && (ub02 = ((C60204t3) C86312j.m106911c(C60204t3.class)).ub0()) != null) {
            activity = ub02;
        }
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0.ey0((C58417y0) c, activity, 0, false, 2, 9, false, 0, (String) null, (String) null, 384, (Object) null);
        Pb0(activity);
    }

    /* renamed from: JP */
    public Context mo76771JP() {
        C58791y yVar = C58791y.f168321a;
        yVar.getClass();
        Context context = MMApplicationContext.getContext();
        try {
            WeakReference<Activity> weakReference = C58791y.f168322b;
            Activity activity = null;
            Context context2 = weakReference != null ? weakReference.get() : null;
            if (context2 != null) {
                String simpleName = context2.getClass().getSimpleName();
                Log.m105924i("Finder.FinderContextManager", "tryGetFinderContext finderTopActivity: " + simpleName);
                yVar.mo83986a("finderSpamGetFinderContext", simpleName);
            } else {
                WeakReference<Activity> g = AppForegroundDelegate.m161224g();
                context2 = g != null ? g.get() : null;
                if (context2 != null) {
                    String simpleName2 = context2.getClass().getSimpleName();
                    Log.m105924i("Finder.FinderContextManager", "tryGetFinderContext appTopActivity: " + simpleName2);
                    yVar.mo83986a("finderSpamGetWechatContext", simpleName2);
                } else {
                    WeakReference<Activity> f = AppForegroundDelegate.INSTANCE.mo174212f();
                    if (f != null) {
                        activity = f.get();
                    }
                    context2 = activity != null ? activity : context;
                    Log.m105924i("Finder.FinderContextManager", "tryGetFinderContext topContext: " + activity);
                }
            }
            if (C87412m.m108589b(context2, context)) {
                String simpleName3 = context.getClass().getSimpleName();
                Log.m105924i("Finder.FinderContextManager", "tryGetFinderContext fallbackContext: " + simpleName3);
                yVar.mo83986a("finderSpamGetApplicationContext", simpleName3);
            }
            C87412m.m108593f(context2, "context");
            return context2;
        } catch (Throwable th) {
            Log.m105921e("Finder.FinderContextManager", "tryGetFinderContext get activity failed", th);
            yVar.mo83986a("finderSpamGetApplicationContext", context.getClass().getSimpleName());
            return context;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object Jb0(long r35, java.lang.String r37, int r38, long r39, ht1.C60171g1 r41, ht1.C60157c5 r42, wx3.C15601d<? super ht1.C60171g1> r43) {
        /*
            r34 = this;
            r0 = r34
            r4 = r35
            r2 = r38
            r14 = r39
            r3 = r41
            r1 = r43
            boolean r6 = r1 instanceof com.tencent.p014mm.plugin.FinderCommonFeatureService.C55417q
            if (r6 == 0) goto L_0x001f
            r6 = r1
            com.tencent.mm.plugin.FinderCommonFeatureService$q r6 = (com.tencent.p014mm.plugin.FinderCommonFeatureService.C55417q) r6
            int r7 = r6.f157882q
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001f
            int r7 = r7 - r8
            r6.f157882q = r7
            goto L_0x0024
        L_0x001f:
            com.tencent.mm.plugin.FinderCommonFeatureService$q r6 = new com.tencent.mm.plugin.FinderCommonFeatureService$q
            r6.<init>(r0, r1)
        L_0x0024:
            r7 = r6
            java.lang.Object r1 = r7.f157880o
            xx3.a r13 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r7.f157882q
            java.lang.String r11 = ", feedId="
            java.lang.String r12 = "Finder.FinderCommonFeatureService"
            r10 = 3
            r9 = 2
            r43 = r13
            r13 = 1
            if (r6 == 0) goto L_0x00c3
            if (r6 == r13) goto L_0x0094
            if (r6 == r9) goto L_0x0068
            if (r6 != r10) goto L_0x0060
            long r2 = r7.f157878j
            int r4 = r7.f157879n
            long r5 = r7.f157877i
            java.lang.Object r9 = r7.f157876h
            bi1.e r9 = (bi1.C0287e) r9
            java.lang.Object r9 = r7.f157875g
            gy3.f0 r9 = (gy3.C8479f0) r9
            java.lang.Object r10 = r7.f157874f
            ht1.c5 r10 = (ht1.C60157c5) r10
            java.lang.Object r14 = r7.f157873e
            ht1.g1 r14 = (ht1.C60171g1) r14
            java.lang.Object r7 = r7.f157872d
            com.tencent.mm.plugin.FinderCommonFeatureService r7 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r7 = r5
            r25 = r11
            r26 = r12
            goto L_0x021d
        L_0x0060:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0068:
            long r2 = r7.f157878j
            int r4 = r7.f157879n
            long r5 = r7.f157877i
            java.lang.Object r9 = r7.f157876h
            bi1.e r9 = (bi1.C0287e) r9
            java.lang.Object r14 = r7.f157875g
            gy3.f0 r14 = (gy3.C8479f0) r14
            java.lang.Object r15 = r7.f157874f
            ht1.c5 r15 = (ht1.C60157c5) r15
            java.lang.Object r8 = r7.f157873e
            ht1.g1 r8 = (ht1.C60171g1) r8
            java.lang.Object r10 = r7.f157872d
            com.tencent.mm.plugin.FinderCommonFeatureService r10 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r10
            kotlin.ResultKt.throwOnFailure(r1)
            r13 = r43
            r25 = r11
            r26 = r12
            r1 = r14
            r14 = r8
            r30 = r5
            r6 = r7
            r7 = r30
            goto L_0x01d4
        L_0x0094:
            long r2 = r7.f157878j
            int r4 = r7.f157879n
            long r5 = r7.f157877i
            java.lang.Object r8 = r7.f157875g
            gy3.f0 r8 = (gy3.C8479f0) r8
            java.lang.Object r10 = r7.f157874f
            ht1.c5 r10 = (ht1.C60157c5) r10
            java.lang.Object r14 = r7.f157873e
            ht1.g1 r14 = (ht1.C60171g1) r14
            java.lang.Object r15 = r7.f157872d
            com.tencent.mm.plugin.FinderCommonFeatureService r15 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r15
            kotlin.ResultKt.throwOnFailure(r1)
            r13 = r43
            r25 = r11
            r26 = r12
            r12 = 0
            r30 = r7
            r7 = r4
            r4 = r5
            r6 = r30
            r31 = r2
            r3 = r8
            r8 = r31
            r2 = r10
            r10 = 1
            goto L_0x018e
        L_0x00c3:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "generateFinderVideoPlayer: commentScene="
            r1.append(r6)
            r1.append(r2)
            r1.append(r11)
            java.lang.String r6 = o40.C61926c.m72691p(r35)
            r1.append(r6)
            java.lang.String r6 = ", continuePlayIntervalMs="
            r1.append(r6)
            r1.append(r14)
            java.lang.String r6 = ", reuseVideoView="
            r1.append(r6)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            gy3.f0 r10 = new gy3.f0
            r10.<init>()
            vp1.e r1 = vp1.C65834e.f189316a
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo89871e(r4)
            r10.f27484d = r1
            if (r1 == 0) goto L_0x011d
            r6 = r1
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r6
            boolean r1 = r1.isUrlValid()
            if (r1 != 0) goto L_0x010d
            goto L_0x011d
        L_0x010d:
            r7 = r4
            r9 = r10
            r25 = r11
            r26 = r12
            r10 = r42
            r4 = r2
            r30 = r14
            r14 = r3
            r2 = r30
            goto L_0x021d
        L_0x011d:
            je1.x1 r8 = new je1.x1
            r1 = r8
            r6 = 2
            r18 = 1
            r23 = r8
            r8 = r18
            r16 = 0
            r9 = r16
            r24 = r10
            r10 = r16
            r16 = 0
            r25 = r11
            r26 = r12
            r11 = r16
            r16 = 0
            r27 = r43
            r13 = r16
            r16 = 0
            r14 = r16
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 122816(0x1dfc0, float:1.72102E-40)
            r22 = 0
            java.lang.String r28 = ""
            r29 = r7
            r7 = r28
            r2 = r35
            r4 = r37
            r5 = r38
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r6 = r29
            r6.f157872d = r0
            r1 = r41
            r6.f157873e = r1
            r2 = r42
            r6.f157874f = r2
            r3 = r24
            r6.f157875g = r3
            r4 = r35
            r6.f157877i = r4
            r7 = r38
            r6.f157879n = r7
            r8 = r39
            r6.f157878j = r8
            r10 = 1
            r6.f157882q = r10
            r11 = r23
            r12 = 0
            java.lang.Object r11 = bi1.C0283d.m245c(r11, r12, r6, r10, r12)
            r13 = r27
            if (r11 != r13) goto L_0x018b
            return r13
        L_0x018b:
            r15 = r0
            r14 = r1
            r1 = r11
        L_0x018e:
            bi1.e r1 = (bi1.C0287e) r1
            boolean r11 = r1 instanceof bi1.C0288f
            if (r11 == 0) goto L_0x01da
            wx3.f r11 = r1.f854a
            if (r11 != 0) goto L_0x019c
            wx3.f r11 = r6.getContext()
        L_0x019c:
            com.tencent.mm.plugin.FinderCommonFeatureService$p r10 = new com.tencent.mm.plugin.FinderCommonFeatureService$p
            r16 = 0
            r35 = r10
            r36 = r1
            r37 = r16
            r38 = r3
            r39 = r4
            r35.<init>(r36, r37, r38, r39)
            r6.f157872d = r15
            r6.f157873e = r14
            r6.f157874f = r2
            r6.f157875g = r3
            r6.f157876h = r1
            r6.f157877i = r4
            r6.f157879n = r7
            r6.f157878j = r8
            r12 = 2
            r6.f157882q = r12
            java.lang.Object r10 = a14.C53895h.m60469g(r11, r10, r6)
            if (r10 != r13) goto L_0x01c7
            return r13
        L_0x01c7:
            r10 = r15
            r15 = r2
            r30 = r8
            r9 = r1
            r1 = r3
            r2 = r30
            r32 = r4
            r4 = r7
            r7 = r32
        L_0x01d4:
            r30 = r9
            r9 = r1
            r1 = r30
            goto L_0x01e6
        L_0x01da:
            r10 = r15
            r15 = r2
            r30 = r8
            r9 = r3
            r2 = r30
            r32 = r4
            r4 = r7
            r7 = r32
        L_0x01e6:
            boolean r5 = r1 instanceof bi1.C0281b
            if (r5 == 0) goto L_0x021c
            wx3.f r5 = r1.f854a
            if (r5 != 0) goto L_0x01f2
            wx3.f r5 = r6.getContext()
        L_0x01f2:
            com.tencent.mm.plugin.FinderCommonFeatureService$o r11 = new com.tencent.mm.plugin.FinderCommonFeatureService$o
            r12 = 0
            r35 = r11
            r36 = r1
            r37 = r12
            r38 = r7
            r40 = r9
            r35.<init>(r36, r37, r38, r40)
            r6.f157872d = r10
            r6.f157873e = r14
            r6.f157874f = r15
            r6.f157875g = r9
            r6.f157876h = r1
            r6.f157877i = r7
            r6.f157879n = r4
            r6.f157878j = r2
            r1 = 3
            r6.f157882q = r1
            java.lang.Object r1 = a14.C53895h.m60469g(r5, r11, r6)
            if (r1 != r13) goto L_0x021c
            return r13
        L_0x021c:
            r10 = r15
        L_0x021d:
            T r1 = r9.f27484d
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r1
            if (r1 != 0) goto L_0x0247
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "generateFinderVideoPlayer: generate video view fail, commentScene="
            r1.append(r2)
            r1.append(r4)
            r2 = r25
            r1.append(r2)
            java.lang.String r2 = o40.C61926c.m72691p(r7)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            r1 = 0
            return r1
        L_0x0247:
            r1 = 0
            boolean r4 = r14 instanceof com.tencent.p014mm.plugin.finder.video.FinderAutoSeekTPProxy
            if (r4 == 0) goto L_0x024f
            r1 = r14
            com.tencent.mm.plugin.finder.video.FinderAutoSeekTPProxy r1 = (com.tencent.p014mm.plugin.finder.video.FinderAutoSeekTPProxy) r1
        L_0x024f:
            if (r1 != 0) goto L_0x025f
            com.tencent.mm.plugin.finder.video.FinderAutoSeekTPProxy r1 = new com.tencent.mm.plugin.finder.video.FinderAutoSeekTPProxy
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = "getContext()"
            gy3.C87412m.m108593f(r4, r5)
            r1.<init>(r4)
        L_0x025f:
            r1.setContinuePlayTimeLimitMs(r2)
            com.tencent.mm.plugin.finder.storage.FeedData$a r2 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            T r3 = r9.f27484d
            gy3.C87412m.m108591d(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r3
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r2.mo78884b(r3)
            java.util.LinkedList r3 = r2.getMediaList()
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r5 = "feedData.mediaList[0]"
            gy3.C87412m.m108593f(r3, r5)
            te3.rq2 r3 = (te3.C64689rq2) r3
            co1.a r5 = co1.C55041a.f154526a
            pl1.r0 r3 = r5.mo76098a(r7, r3, r4)
            r1.mo78639o(r3, r4, r2)
            r2 = 1
            r1.setVideoViewFocused(r2)
            if (r10 == 0) goto L_0x0291
            r1.setIMMVideoViewCallback(r10)
        L_0x0291:
            r1.setFullScreenEnjoy(r2)
            r1.setLoop(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.Jb0(long, java.lang.String, int, long, ht1.g1, ht1.c5, wx3.d):java.lang.Object");
    }

    public C65413c0 Jx0() {
        C86709a0.m107523b().mo121108c();
        C65413c0 c0Var = this.f157805q;
        if (c0Var == null) {
            c0Var = new C65413c0(mo76790Np());
        }
        this.f157805q = c0Var;
        return c0Var;
    }

    /* renamed from: K9 */
    public C117747y mo76774K9(String str, long j, String str2) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "objectNonceId");
        return new C46530q2(str, j, str2, false, 8, (C8480h) null);
    }

    public C65414d0 Kx0() {
        C86709a0.m107523b().mo121108c();
        C65414d0 d0Var = this.f157804p;
        if (d0Var == null) {
            d0Var = new C65414d0(mo76790Np());
        }
        this.f157804p = d0Var;
        return d0Var;
    }

    /* renamed from: Li */
    public FinderObject mo76777Li(long j, String str, int i, boolean z, boolean z2, String str2, C60200t1.C60202b bVar) {
        C46547x1 x1Var;
        long j2 = j;
        C87412m.m108594g(str2, "encryptedObjectId");
        Log.m105924i("Finder.FinderCommonFeatureService", "tryGetFinderObject " + j2 + ", enter");
        if (z) {
            C65834e.f189316a.mo89875i(j2);
        }
        FinderItem e = C65834e.f189316a.mo89871e(j2);
        if (e == null) {
            Log.m105924i("Finder.FinderCommonFeatureService", "tryGetFinderObject " + j2 + ", start");
            C46547x1 x1Var2 = r0;
            C46547x1 x1Var3 = new C46547x1(j, str, i, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, str2, (C49712hj1) null, 0, (C49946j51) null, false, 118720, (C8480h) null);
            if (z2) {
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                x1Var = x1Var2;
                x1Var.mo85582k(context, MMApplicationContext.getContext().getResources().getString(C0966R.string.dcf), 1000);
            } else {
                x1Var = x1Var2;
            }
            x1Var.mo9225i().mo123064p(new C55421y0(bVar, j));
        }
        if (e != null) {
            return e.getFeedObject();
        }
        return null;
    }

    public void Li0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        ((C58684b) C86312j.m106911c(C58684b.class)).Xx0(context, intent);
    }

    public final C37549f0 Lx0() {
        C86709a0.m107523b().mo121108c();
        C37549f0 f0Var = this.f157778E;
        if (f0Var == null) {
            f0Var = new C37549f0(mo76790Np());
        }
        this.f157778E = f0Var;
        return f0Var;
    }

    /* renamed from: ML */
    public void mo76780ML(Context context, FinderJumpInfo finderJumpInfo, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(finderJumpInfo, "info");
        C62262d0.m73168c(C62262d0.f176978a, context, new C11920q(finderJumpInfo), i, (C60905o) null, 8, (Object) null);
    }

    /* renamed from: MY */
    public void mo76781MY(Context context, String str, Intent intent) {
        String str2;
        Context context2 = context;
        String str3 = str;
        Class cls = C58684b.class;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str3, "json");
        try {
            C104289g gVar = new C104289g(str3);
            long P = C61926c.m72671P(gVar.optString("feedId", "0"));
            C104289g k = gVar.getJSONObject("extInfo");
            Log.m105924i("Finder.FinderCommonFeatureService", "json = " + str3);
            String string = k.getString("feedNonceId");
            int optInt = k.optInt("reportScene", 11);
            String optString = k.optString("encryptedObjectId", "");
            boolean optBoolean = k.optBoolean("getRelatedList", false);
            String optString2 = k.optString("sessionId", "");
            String optString3 = k.optString("reportExtraInfo", "");
            String optString4 = k.optString("commonExtraInfo", "");
            str2 = "Finder.FinderCommonFeatureService";
            try {
                int optInt2 = k.optInt("requestScene", 3);
                String str4 = optString3;
                String str5 = optString4;
                double optDouble = k.optDouble("currentTime", 0.0d);
                Intent intent2 = intent == null ? new Intent() : intent;
                intent2.putExtra("report_scene", optInt);
                int i = optInt;
                intent2.putExtra("from_user", C75592q0.m90789s());
                intent2.putExtra("feed_object_id", P);
                intent2.putExtra("feed_encrypted_object_id", optString);
                intent2.putExtra("feed_object_nonceId", string);
                intent2.putExtra("key_need_related_list", optBoolean);
                intent2.putExtra("key_session_id", optString2);
                intent2.putExtra("key_comment_scene", 39);
                intent2.putExtra("key_reuqest_scene", optInt2);
                if (!Util.isNullOrNil(str5)) {
                    intent2.putExtra("key_common_extra_info", str5);
                }
                long j = (long) (optDouble * ((double) 1000));
                if (j > 0) {
                    intent2.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", j);
                }
                String optString5 = gVar.optString(TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, "");
                C87412m.m108593f(optString5, "jsonObject.optString(\"extraInfo\", \"\")");
                if (!Util.isNullOrNil(str4)) {
                    intent2.putExtra("key_extra_info", str4);
                } else if (!TextUtils.isEmpty(optString5)) {
                    intent2.putExtra("key_extra_info", optString5);
                }
                if (C11767a.f34453a.mo11660b("entrance") != 0) {
                    ((C58684b) C86312j.m106911c(cls)).uy0(context2);
                    return;
                }
                try {
                    mo76842e7(C58784w3.f168295a.mo83959r0(i), 2, 39, intent2);
                    ((C58684b) C86312j.m106911c(cls)).Zx0(context2, intent2);
                    C117361f.INSTANCE.mo182041q(540999685);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                Log.printErrStackTrace(str2, th, "enterFinderProfileUI exception", new Object[0]);
            }
        } catch (Throwable th5) {
            th = th5;
            str2 = "Finder.FinderCommonFeatureService";
            Log.printErrStackTrace(str2, th, "enterFinderProfileUI exception", new Object[0]);
        }
    }

    public void Mr0(String str, C60216z4.C8821a<String> aVar) {
        C26827e eVar;
        if (str != null) {
            try {
                C104289g gVar = new C104289g(str);
                String optString = gVar.optString("businessType");
                Log.m105924i("Finder.FinderCommonFeatureService", "getFinderRedDot json: " + str + " businessType:" + optString);
                HashSet hashSet = new HashSet();
                Object opt = gVar.opt("redDotPath");
                Log.m105924i("Finder.FinderCommonFeatureService", "redDotPath :" + opt);
                if (opt instanceof String) {
                    eVar = new C26827e((String) opt);
                } else if (opt instanceof C26827e) {
                    C87412m.m108593f(opt, "{\n                      …ath\n                    }");
                    eVar = (C26827e) opt;
                } else {
                    eVar = new C26827e("");
                }
                int length = eVar.length();
                for (int i = 0; i < length; i++) {
                    String obj = eVar.get(i).toString();
                    Log.m105924i("Finder.FinderCommonFeatureService", "getFinderRedDot path:" + obj);
                    hashSet.add(obj);
                }
                String b = C2491u.f13010a.mo2471b(hashSet);
                Log.m105924i("Finder.FinderCommonFeatureService", "redDots :" + b);
                if (aVar != null) {
                    aVar.mo6382a(b);
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("Finder.FinderCommonFeatureService", e, "getFinderRedDot exception", new Object[0]);
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: Mt */
    public C117747y mo76783Mt(String str, long j, C89349b bVar, int i, C49712hj1 hj12, int i2, long j2, boolean z, Integer num, Long l) {
        C87412m.m108594g(str, "req_username");
        C9377s4 s4Var = r0;
        C9377s4 s4Var2 = new C9377s4(str, j, bVar, i, hj12, i2, j2, z, (String) null, 0, num, l, (String) null, false, false, (Long) null, 62208, (C8480h) null);
        C9377s4 s4Var3 = s4Var;
        C86709a0.m107524d().mo123460f(s4Var3);
        return s4Var3;
    }

    public final C12889e Mx0() {
        C86709a0.m107523b().mo121108c();
        C12889e eVar = this.f157779F;
        if (eVar == null) {
            eVar = new C12889e(mo76790Np());
        }
        this.f157779F = eVar;
        return eVar;
    }

    /* renamed from: N7 */
    public void mo76785N7(String str, ImageView imageView) {
        C87412m.m108594g(str, "url");
        aa0(str, imageView, (String) null);
    }

    /* renamed from: NI */
    public boolean mo76786NI(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        C65854g gVar = C65854g.f189373e;
        return C65854g.f189373e.mo89893c(finderObject);
    }

    /* renamed from: NL */
    public void mo76787NL(int i, int i2, int i3, Context context, Intent intent, View view, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        if (C58784w3.f168295a.mo83915a1()) {
            ((C15907f) C86312j.m106911c(C15907f.class)).K00(context, 34359738368L, (CheckBoxPreference) null, new C55414m0(this, i, i2, i3, context, intent, view, z), 3);
            return;
        }
        Yx0(i, i2, i3, context, intent, view, z);
    }

    /* renamed from: Nh */
    public boolean mo76788Nh(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        C65866w.C14968a aVar = C65866w.f189406g;
        return ((Boolean) C65866w.f189407h.mo89908g(finderObject).f38555d).booleanValue();
    }

    /* renamed from: Nn */
    public String mo76789Nn(C117747y yVar) {
        List<String> list;
        String str;
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C9379t3 t3Var = yVar instanceof C9379t3 ? (C9379t3) yVar : null;
        if (t3Var == null || (list = t3Var.f29295g) == null) {
            return null;
        }
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null || (str = (String) C110818d0.m150916N(list)) == null) {
            return null;
        }
        return Uri.parse(str).getQueryParameter("promoter_token");
    }

    /* renamed from: Np */
    public C91753f mo76790Np() {
        return Rx0(this.f157798g, new C40390r(this));
    }

    /* renamed from: Nx0 */
    public FinderRedDotManager Nt0() {
        if (this.f157783J == null) {
            synchronized (this) {
                if (this.f157783J == null) {
                    C86709a0.m107523b().mo121108c();
                    C55724w wVar = this.f157813y;
                    if (wVar == null) {
                        wVar = new C55724w(mo76790Np());
                    }
                    this.f157813y = wVar;
                    this.f157783J = new FinderRedDotManager(wVar);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        FinderRedDotManager finderRedDotManager = this.f157783J;
        C87412m.m108591d(finderRedDotManager);
        return finderRedDotManager;
    }

    /* renamed from: OJ */
    public void mo76793OJ(Context context, String str) {
        C87412m.m108594g(context, "context");
        er0(context, str, (C60216z4.C8821a<Integer>) null);
    }

    /* renamed from: Ox0 */
    public C52599l0 mo76736Au() {
        C86709a0.m107523b().mo121108c();
        C52599l0 l0Var = this.f157807s;
        if (l0Var == null) {
            l0Var = new C52599l0(Rx0(this.f157801j, new C52337m0(this)));
        }
        this.f157807s = l0Var;
        return l0Var;
    }

    public void Pb0(Context context) {
        C87412m.m108594g(context, "context");
        C9309g0 g0Var = new C9309g0(C66785b.f191882e.mo90662O5());
        C60625c.m70894l(g0Var, context, (String) null, 0, 6, (Object) null);
        C61926c.m72665J(g0Var.mo9225i(), new C1324t(context));
    }

    public int Pe0() {
        int O = C58784w3.f168295a.mo83890O(((C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11602e3());
        if (-1 == O) {
            return 1;
        }
        return O;
    }

    public boolean Pu0() {
        Class cls = C60606n.class;
        Log.m105924i("Finder.FinderCommonFeatureService", "dismissVideoOrLiveVisitorSmallWindow: ");
        if (((C60606n) C86312j.m106911c(cls)).mo85002F()) {
            Log.m105924i("Finder.FinderCommonFeatureService", "dismissVideoOrLiveVisitorSmallWindow: live anchor ing");
            C61926c.m72668M(C1316e.f10439d);
            return false;
        }
        ((C60606n) C86312j.m106911c(cls)).mo84992Cx();
        C61926c.m72668M(C55404f.f157820d);
        return true;
    }

    public final C37553o0 Px0() {
        C86709a0.m107523b().mo121108c();
        C37553o0 o0Var = this.f157777D;
        if (o0Var == null) {
            o0Var = new C37553o0(mo76790Np());
        }
        this.f157777D = o0Var;
        return o0Var;
    }

    public void Qw0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        int intExtra = intent.getIntExtra("key_request_scene", 0);
        boolean booleanExtra = intent.getBooleanExtra("key_use_dark_style", true);
        int intExtra2 = intent.getIntExtra("key_select_tab_id", 0);
        int intExtra3 = intent.getIntExtra("key_select_second_tab_id", 0);
        String stringExtra = intent.getStringExtra("key_by_pass");
        String str = stringExtra == null ? "" : stringExtra;
        int intExtra4 = intent.getIntExtra("key_entry_scene", 0);
        String stringExtra2 = intent.getStringExtra("key_feed_export_id");
        String str2 = stringExtra2 == null ? "" : stringExtra2;
        String stringExtra3 = intent.getStringExtra("key_feed_nonce_id");
        String str3 = stringExtra3 == null ? "" : stringExtra3;
        String stringExtra4 = intent.getStringExtra("key_page_title");
        Ux0(context, intExtra, booleanExtra, intExtra2, intExtra3, str, intExtra4, str2, str3, stringExtra4 == null ? "" : stringExtra4);
    }

    public Object Qx0(C15601d<? super C13605o<Boolean, Long, String>> dVar) {
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        ((C10756c) C86709a0.m107533q(C10756c.class)).mo11000qy(new C1327v(hVar));
        return hVar.mo90314b();
    }

    /* renamed from: Qy */
    public void mo76801Qy(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        ((C58684b) C86312j.m106911c(C58684b.class)).Vx0(context, intent);
    }

    /* renamed from: R1 */
    public String mo76802R1(int i, int i2, int i3) {
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        String n = C112551y.m153814n(uuid, "-", "", false);
        return i + '-' + i2 + '-' + i3 + '-' + n;
    }

    /* renamed from: Rc */
    public void mo76803Rc(String str, ImageView imageView, String str2, C11978e0.C11979a aVar) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(aVar, "loaderType");
        Log.m105924i("Finder.FinderCommonFeatureService", "#loadBgBlurImageRadius25 url=" + str + " md5Source=" + str2);
        if (!(str == null || str.length() == 0) && imageView != null) {
            C99344b<C100810g0, Bitmap> b = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11873j2().mo85956b(new C11992u(str, str2, "blur_25", C27696y.THUMB_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
            C55399a0<T, R> a0Var = C55399a0.f157816a;
            b.getClass();
            b.f291320d = a0Var;
            ((C99342a) b).mo85954d(imageView);
        }
    }

    /* renamed from: Rk */
    public C64888zo1 mo76804Rk(long j, int i) {
        FinderObjectDesc finderObjectDesc;
        LinkedList<FinderMedia> linkedList;
        FinderMedia first;
        Log.m105924i("Finder.FinderCommonFeatureService", "tryGetFinderVideoInfoForMp objectId:" + j);
        FinderObject cb = mo76838cb(j, "", i, "");
        C64888zo1 zo12 = new C64888zo1();
        zo12.f186758d = cb;
        if (!(cb == null || (finderObjectDesc = cb.objectDesc) == null || (linkedList = finderObjectDesc.media) == null || (first = linkedList.getFirst()) == null)) {
            C64689rq2 d = C65840n.m77568d(first);
            C62367r0 a = C55041a.f154526a.mo76098a(cb.f164794id, d, false);
            zo12.f186759e = a.mo11841b();
            zo12.f186760f = a.getUrl();
            zo12.f186761g = a.getPath();
            boolean z = true;
            zo12.f186762h = ((C36594q) C86312j.m106911c(C36594q.class)).mo60729EJ(1, a.getPath());
            zo12.f186763i = a.mo87422g();
            zo12.f186764j = a.getUrlToken();
            zo12.f186765n = a.getDecodeKey();
            if (d.f185257U != 1) {
                z = false;
            }
            zo12.f186766o = z;
            zo12.f186767p = i;
            zo12.f186771t = a.f177257i;
            zo12.f186768q = "tryGetFinderObjectFromMp";
            if (!TextUtils.isEmpty(zo12.f186759e)) {
                C66167g gVar = C66167g.f190173a;
                String str = zo12.f186759e;
                C87412m.m108591d(str);
                C55015f1 c = gVar.mo90234c(str, false);
                zo12.f186759e = c.field_mediaId;
                if (C86013q1.m106450k(c.mo76071l2())) {
                    zo12.f186769r = c.field_cacheSize;
                    zo12.f186770s = c.field_totalSize;
                    zo12.f186771t = c.field_dynamicRangeType;
                    zo12.f186772u = c.field_state;
                    zo12.f186757B = c.field_moovReady;
                }
            }
        }
        return zo12;
    }

    /* renamed from: Rl */
    public void mo76805Rl(Context context, Intent intent) {
        C64831xk1 xk12;
        Activity ub02;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intnet");
        C7888v2.f26513a.getClass();
        JSONObject jSONObject = new JSONObject(intent.getStringExtra("KEY_SHOP_WINDOW"));
        try {
            xk12 = new C64831xk1();
            JSONObject optJSONObject = jSONObject.optJSONObject("shareInfo");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("wxappInfo");
            JSONObject optJSONObject3 = jSONObject.optJSONObject("liteAppInfo");
            if (optJSONObject == null) {
                if (BuildInfo.DEBUG) {
                    optJSONObject = new JSONObject();
                    optJSONObject.put("finderUsername", C66785b.f191882e.mo90662O5());
                    optJSONObject.put("avatar", "http://wx.qlogo.cn/finderhead/ver_1/AmLxrMkXczociczgAzWj7TtFoAVVkkkartwC5ubDN31wxvDShkevBICrwhNjaicCgKfqS6GxKKDhGUib8htFuiaxR0KFVS5hBlib1HJSJcpbLlC8/0");
                    optJSONObject.put("nickname", APMidasPayAPI.ENV_TEST);
                    optJSONObject.put("commodityInStockCount", "123");
                }
            }
            xk12.f186326d = optJSONObject.optString("finderUsername");
            xk12.f186327e = optJSONObject.optString("avatar");
            xk12.f186328f = optJSONObject.optString("nickname");
            xk12.f186329g = optJSONObject.optString("commodityInStockCount");
            xk12.f186330h = optJSONObject2.optString("appid");
            xk12.f186331i = optJSONObject2.optString("path");
            xk12.f186332j = optJSONObject2.optString("appUsername");
            xk12.f186333n = optJSONObject2.optString(SearchIntents.EXTRA_QUERY);
            xk12.f186334o = optJSONObject3.optString("appid");
            xk12.f186335p = optJSONObject3.optString("path");
            xk12.f186336q = optJSONObject3.optString(SearchIntents.EXTRA_QUERY);
        } catch (Exception e) {
            Log.printErrStackTrace(C7888v2.C7889a.f26515b, e, String.valueOf(e.getMessage()), new Object[0]);
            xk12 = null;
        }
        if (xk12 == null) {
            Log.m105920e(C7888v2.C7889a.f26515b, "shareFinderShopWindowToConversation fail,share object is null!");
            return;
        }
        Log.m105924i(C7888v2.C7889a.f26515b, "shareFinderShopWindowToConversation " + xk12.f186326d + " commodityInStockCount:" + xk12.f186329g);
        C68070l.C68072b bVar = new C68070l.C68072b();
        C60176j jVar = new C60176j();
        jVar.f171713b = xk12;
        bVar.mo93545f(jVar);
        bVar.f195582i = 94;
        bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
        bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
        Intent intent2 = new Intent();
        intent2.putExtra("Retr_Msg_Type", 33);
        intent2.putExtra("Multi_Retr", true);
        intent2.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null));
        intent2.putExtra("Retr_go_to_chattingUI", false);
        intent2.putExtra("Retr_show_success_tips", true);
        if (context instanceof MMFragmentActivity) {
            C88144b.m109804v((MMFragmentActivity) context, ".ui.transmit.MsgRetransmitUI", intent2, 1015, new C58793y2(xk12));
            return;
        }
        if (!(context instanceof Activity) && (ub02 = ((C60204t3) C86312j.m106911c(C60204t3.class)).ub0()) != null) {
            context = ub02;
        }
        C88144b.m109801s(context, ".ui.transmit.MsgRetransmitUI", intent2, (Bundle) null);
    }

    public final C91753f Rx0(C91753f[] fVarArr, C32224a<? extends C91753f> aVar) {
        if (fVarArr[0] == null) {
            synchronized (fVarArr) {
                if (fVarArr[0] == null) {
                    fVarArr[0] = (C91753f) aVar.invoke();
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        C91753f fVar = fVarArr[0];
        C87412m.m108591d(fVar);
        return fVar;
    }

    public String S20(String str, String str2) {
        return C58784w3.f168295a.mo83946l0(str, str2);
    }

    /* renamed from: S7 */
    public void mo76808S7(String str, ImageView imageView, C11978e0.C11979a aVar) {
        C87412m.m108594g(aVar, "loaderType");
        C60200t1.C60201a.m70366d(this, str, imageView, str, (C11978e0.C11979a) null, 8, (Object) null);
    }

    /* renamed from: Sd */
    public void mo76809Sd(String str, ImageView imageView, WeakReference<C60216z4.C8821a<Integer>> weakReference, C11978e0.C11979a aVar) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(aVar, "loaderType");
        if (!(str == null || str.length() == 0) && imageView != null) {
            C64689rq2 rq22 = new C64689rq2();
            C58784w3 w3Var = C58784w3.f168295a;
            String x1 = w3Var.mo83978x1(str == null ? "" : str, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            rq22.f185275p = MD5Util.getMD5String(x1);
            rq22.f185266d = str;
            rq22.f185267e = str;
            String z1 = w3Var.mo83984z1(x1);
            rq22.f185285x0 = z1;
            rq22.f185287y0 = z1;
            ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85958d(new C62344b0(rq22, C27696y.THUMB_IMAGE, (String) null, (String) null, 12, (C8480h) null), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar)).mo138753h(imageView, new C1332x0(weakReference));
        }
    }

    public boolean St0() {
        C58784w3.f168295a.mo83952o();
        return C58784w3.f168309o == 1;
    }

    /* renamed from: Tc */
    public Object mo76811Tc(Context context, int i, C15601d<? super C13604l<Boolean, Integer>> dVar) {
        T hVar = new C66218h(C66447b.m78392b(dVar));
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = hVar;
        if (!(context instanceof FragmentActivity)) {
            Log.m105924i("Finder.FinderCommonFeatureService", "#weCoinChargeDialog context not FragmentActivity");
            C15601d dVar2 = (C15601d) f0Var.f27484d;
            if (dVar2 != null) {
                Result.Companion companion = Result.Companion;
                dVar2.resumeWith(Result.m168114constructorimpl(new C13604l(Boolean.FALSE, new Integer(0))));
            }
            f0Var.f27484d = null;
        } else {
            C10761g gVar = new C10761g();
            gVar.f32222a = i;
            gVar.f32225d = new C1334z0(f0Var);
            ((C10756c) C86709a0.m107533q(C10756c.class)).q10((FragmentActivity) context, gVar);
        }
        return hVar.mo90314b();
    }

    public Class<?> To0() {
        return C37429f0.class;
    }

    public void Tp0(Context context, String str, String str2, boolean z, String str3, C65953v0 v0Var, DialogInterface.OnDismissListener onDismissListener) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "subTitle");
        C87412m.m108594g(str3, "okText");
        C87412m.m108594g(v0Var, "dialogClick");
        C66184f.C66185a aVar = new C66184f.C66185a(context);
        if (onDismissListener != null) {
            aVar.f190209e = onDismissListener;
        }
        aVar.mo90282c(str);
        Context context2 = aVar.f190205a;
        C76577a.m92151b(context2, (int) (C76577a.m92165p(context2) * 14.0f));
        if (!Util.isNullOrNil(str2)) {
            aVar.f190206b.f225714b.f225661r = ((C79305f) C86312j.m106911c(C79305f.class)).mo109310M(aVar.f190205a, str2);
        }
        aVar.mo90281b(Boolean.valueOf(z));
        aVar.f190208d = str3;
        aVar.mo90280a(v0Var);
        aVar.f190207c.show();
    }

    public void Tr0(List<? extends Pair<String, String>> list, boolean z) {
        C87412m.m108594g(list, "feedIdList");
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = new LinkedList();
        for (Pair pair : list) {
            db4 db4 = new db4();
            if (z) {
                db4.f182690u = C61926c.m72671P((String) pair.first);
                db4.f182691v = (String) pair.second;
            } else {
                db4.f182676d = C61926c.m72671P((String) pair.first);
                db4.f182680h = (String) pair.second;
            }
            C64441i93 i932 = new C64441i93();
            i932.f183653h++;
            i932.f183656n = 1;
            db4.f182679g = i932;
            ((LinkedList) f0Var.f27484d).add(db4);
        }
        new C46525m1((List) f0Var.f27484d, (C49712hj1) null).mo9225i().mo123419C(new C1326u0(f0Var));
    }

    /* renamed from: U5 */
    public void mo76815U5(Context context, String str, String str2, int i, String str3) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "enterPath");
        C87412m.m108594g(str3, "sceneNote");
        ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13270U5(context, str, str2, i, str3);
    }

    /* renamed from: Uj */
    public void mo76816Uj(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        ((C58684b) C86312j.m106911c(C58684b.class)).I00(context, intent);
    }

    public void Ur0(Context context, Intent intent) {
        Class cls = C58684b.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        if (!mo76873sF()) {
            ((C58684b) C86312j.m106911c(cls)).uy0(context);
            return;
        }
        ((C58684b) C86312j.m106911c(cls)).getClass();
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderHotWordFeedUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterHotWordFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterHotWordFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Ux0(Context context, int i, boolean z, int i2, int i3, String str, int i4, String str2, String str3, String str4) {
        Intent intent = new Intent();
        intent.putExtra("key_request_scene", i);
        intent.putExtra("key_use_dark_style", z ? 1 : 0);
        intent.putExtra("key_select_tab_id", i2);
        intent.putExtra("key_select_second_tab_id", i3);
        intent.putExtra("key_by_pass", str);
        intent.putExtra("key_feed_export_id", str2);
        intent.putExtra("key_feed_nonce_id", str3);
        intent.putExtra("key_page_title", str4);
        intent.putExtra("nearby_live_target_auto_refresh_params_key", true);
        intent.putExtra("nearby_live_all_auto_refresh_params_key", true);
        int i5 = 9500002;
        if (i == 1) {
            i5 = 9500001;
        } else if (!(i == 2 || i == 3)) {
            if (i == 4) {
                i5 = 9500004;
            } else if (i == 5) {
                i5 = 9500003;
            }
        }
        String str5 = "9002";
        if (i == 1) {
            str5 = "9001";
        } else if (!(i == 2 || i == 3)) {
            if (i == 4) {
                str5 = "9004";
            } else if (i == 5) {
                str5 = "9003";
            }
        }
        intent.putExtra("key_from_comment_scene", i5);
        intent.putExtra("key_click_tab_id", str5);
        mo76842e7(i4, 2, i5, intent);
        ((C7606d) C86312j.m106911c(C7606d.class)).mo8740Yi(context, intent);
    }

    /* renamed from: V1 */
    public void mo76819V1(Context context, Intent intent) {
        String str;
        String str2;
        String stringExtra;
        C87412m.m108594g(context, "context");
        String stringExtra2 = intent != null ? intent.getStringExtra("key_extra_info") : null;
        boolean z = false;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("key_is_in_finder", false) : false;
        int intExtra = intent != null ? intent.getIntExtra("key_entry_type", 0) : 0;
        String str3 = C58411u.f167343b;
        if (booleanExtra && intExtra == 6) {
            if (str3 == null || str3.length() == 0) {
                z = true;
            }
            if (!z) {
                Log.m105924i("Finder.FinderCommonFeatureService", "keep searchH5 contextId profile");
                if (intent != null) {
                    intent.putExtra("key_context_id", str3);
                }
            }
        }
        ((C61568m) C86312j.m106911c(C61568m.class)).mo74891sS(stringExtra2 == null ? "" : stringExtra2);
        String stringExtra3 = intent != null ? intent.getStringExtra("key_biz_username") : null;
        if (Util.isNullOrNil(stringExtra3) || C87412m.m108589b("null", stringExtra3)) {
            if (intent == null || (str = intent.getStringExtra("finder_username")) == null) {
                str = "";
            }
            if (Util.isNullOrNil(str)) {
                C64208c.f181951a.mo89032g(stringExtra2, str);
                if (intent == null || (str2 = intent.getStringExtra("key_finder_object_Id")) == null) {
                    str2 = "0";
                }
                long P = C61926c.m72671P(str2);
                String str4 = (intent == null || (stringExtra = intent.getStringExtra("key_finder_object_nonce_id_key")) == null) ? "" : stringExtra;
                int intExtra2 = intent != null ? intent.getIntExtra("share_enter_scene", 25) : 25;
                if (P == 0) {
                    Log.m105920e("Finder.FinderCommonFeatureService", "enterFinderProfileUI username & objectId invalid");
                } else {
                    C61926c.m72656A((String) null, new C1318g(this, P, str4, intExtra2, intent, context));
                }
            } else {
                ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context, intent);
                C117361f.INSTANCE.mo182041q(540999686);
            }
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("Contact_User", stringExtra3);
            intent2.putExtra("Contact_Scene", 213);
            intent2.putExtra("biz_profile_enter_from_finder", true);
            intent2.putExtra("force_get_contact", true);
            intent2.putExtra("key_use_new_contact_profile", true);
            intent2.putExtra("biz_profile_tab_type", 1);
            C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
        }
    }

    public void Va0(Context context, C64287ci1 ci12, C32226l<? super List<String>, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(ci12, "shareObject");
        C7888v2.f26513a.getClass();
        String str = C7888v2.C7889a.f26515b;
        Log.m105924i(str, "share finderObject " + ci12.f182502n + " begin");
        String str2 = ci12.f182507s;
        boolean z = true;
        if (!(str2 == null || str2.length() == 0)) {
            String str3 = ci12.f182508t;
            if (!(str3 == null || str3.length() == 0)) {
                z = false;
            }
            if (!z) {
                ((C60613r) C86312j.m106911c(C60613r.class)).Se0(context, ci12, new C58697b3(context, ci12, lVar));
                return;
            }
        }
        Log.m105924i(str, "fix shareObject, before: " + ci12.f182508t + ", " + ci12.f182507s);
        C76629w0 w0Var = (C76629w0) C86312j.m106911c(C76629w0.class);
        String str4 = ci12.f182500i;
        if (str4 == null) {
            str4 = "";
        }
        w0Var.Ws0(str4, new C58681a3(ci12, context, lVar));
    }

    /* renamed from: Vb */
    public boolean mo76821Vb() {
        return ((C87790d) C86312j.m106911c(C87790d.class)).isInstalled("xlab");
    }

    /* renamed from: Vm */
    public boolean mo76822Vm() {
        boolean z;
        Class cls = C60606n.class;
        boolean z2 = false;
        if (((C60606n) C86312j.m106911c(cls)).mo85002F() || ((C60606n) C86312j.m106911c(cls)).mo85017L5()) {
            C61926c.m72668M(C1314c.f10437d);
            z = false;
        } else {
            z = true;
        }
        if (z && !C61104a.m71661q(MMApplicationContext.getContext(), true)) {
            z2 = true;
        }
        C61926c.m72668M(C55403d.f157819d);
        return z2;
    }

    public final void Vx0(C104289g gVar, Context context, C60216z4.C8821a<Object> aVar, String str) {
        String optString = gVar.optString("feedID");
        String optString2 = gVar.optString("finderUserName");
        int optInt = gVar.optInt("commentScene");
        String optString3 = gVar.optString("reportExtraInfo", "");
        Intent intent = new Intent();
        intent.putExtra("finder_username", optString2);
        intent.putExtra("finder_read_feed_id", optString);
        intent.putExtra("key_extra_info", optString3);
        intent.putExtra("report_scene", 18);
        intent.putExtra("key_from_comment_scene", 39);
        C87412m.m108593f(optString3, TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO);
        ((C61568m) C86312j.m106911c(C61568m.class)).mo74891sS(optString3);
        C64208c.f181951a.mo89032g(optString3, optString2);
        if (optInt > 0) {
            String str2 = C58411u.f167342a;
            if (36 == optInt) {
                if (!(str2 == null || str2.length() == 0)) {
                    intent.putExtra("key_context_id", str2);
                }
            }
            C58784w3.f168295a.getClass();
            String e7 = mo76842e7(optInt, C58739j4.f168176a.mo83685N(optString3) ? 4 : 2, 32, intent);
            if (!Util.isNullOrNil(str)) {
                C115669n.INSTANCE.mo160131h(21140, e7, str, optString, optString2);
            }
            ((C10383h) C86312j.m106911c(C10383h.class)).mo10697OK(e7);
        }
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context, intent);
        if (aVar != null) {
            aVar.mo6382a(0);
        }
    }

    /* renamed from: W5 */
    public C58969q mo76824W5(String str) {
        C87412m.m108594g(str, "username");
        return mo76850gW().mo89509jo(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: android.app.Activity} */
    /* JADX WARNING: type inference failed for: r3v4, types: [androidx.lifecycle.i0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Wx0(c30.C104289g r22, android.content.Context r23) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            java.lang.Class<ls3.g> r2 = ls3.C61397g.class
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            java.lang.Class<ir.n> r4 = p565ir.C60606n.class
            java.lang.Class<cl1.u> r5 = cl1.C55001u.class
            di3.d r6 = di3.C86312j.m106911c(r4)
            ir.n r6 = (p565ir.C60606n) r6
            fj1.b$a r7 = fj1.C45795b.f123697j
            fj1.b r7 = fj1.C45795b.f123698n
            if (r7 == 0) goto L_0x0021
            androidx.lifecycle.i0 r7 = r7.mo71262a(r5)
            cl1.u r7 = (cl1.C55001u) r7
            te3.c21 r7 = r7.f154420q
            goto L_0x0022
        L_0x0021:
            r7 = 0
        L_0x0022:
            boolean r6 = r6.mo85075nB(r7)
            if (r6 == 0) goto L_0x0037
            android.content.res.Resources r0 = r23.getResources()
            r2 = 2131828882(0x7f112092, float:1.9290717E38)
            java.lang.String r0 = r0.getString(r2)
            nj3.C76912y0.m92773l(r1, r0)
            return
        L_0x0037:
            boolean r6 = r1 instanceof android.app.Activity
            if (r6 == 0) goto L_0x003c
            goto L_0x004c
        L_0x003c:
            java.lang.Class<ht1.t3> r6 = ht1.C60204t3.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ht1.t3 r6 = (ht1.C60204t3) r6
            android.app.Activity r6 = r6.ub0()
            if (r6 == 0) goto L_0x004c
            r12 = r6
            goto L_0x004d
        L_0x004c:
            r12 = r1
        L_0x004d:
            java.lang.String r1 = "replayUrl"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r6 = "replayStartOffset"
            int r6 = r0.optInt(r6)
            java.lang.String r7 = "replayLiveInfo"
            c30.g r7 = r0.optJSONObject(r7)
            java.lang.String r9 = "liveId"
            if (r7 == 0) goto L_0x0069
            java.lang.String r10 = r7.optString(r9)
            if (r10 != 0) goto L_0x006d
        L_0x0069:
            java.lang.String r10 = r0.optString(r9)
        L_0x006d:
            long r13 = o40.C61926c.m72671P(r10)
            java.lang.String r9 = "replayRotationEnabled"
            boolean r9 = r0.optBoolean(r9)
            java.lang.String r10 = ""
            if (r7 == 0) goto L_0x0087
            java.lang.String r11 = "finderUsername"
            java.lang.String r11 = r7.optString(r11)
            if (r11 != 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            r17 = r11
            goto L_0x0096
        L_0x0087:
            fj1.b r11 = fj1.C45795b.f123698n
            if (r11 == 0) goto L_0x0094
            androidx.lifecycle.i0 r11 = r11.mo71262a(r3)
            cl1.o r11 = (cl1.C54991o) r11
            java.lang.String r11 = r11.f154345o
            goto L_0x0084
        L_0x0094:
            r17 = r10
        L_0x0096:
            if (r7 == 0) goto L_0x00a4
            java.lang.String r11 = "objectNonceId"
            java.lang.String r11 = r7.optString(r11)
            if (r11 != 0) goto L_0x00a1
            goto L_0x00a4
        L_0x00a1:
            r18 = r11
            goto L_0x00b3
        L_0x00a4:
            fj1.b r11 = fj1.C45795b.f123698n
            if (r11 == 0) goto L_0x00b1
            androidx.lifecycle.i0 r11 = r11.mo71262a(r5)
            cl1.u r11 = (cl1.C55001u) r11
            java.lang.String r11 = r11.f154423t
            goto L_0x00a1
        L_0x00b1:
            r18 = r10
        L_0x00b3:
            if (r7 == 0) goto L_0x00bc
            java.lang.String r11 = "objectId"
            java.lang.String r7 = r7.optString(r11)
            goto L_0x00bd
        L_0x00bc:
            r7 = 0
        L_0x00bd:
            if (r7 != 0) goto L_0x00c0
            r7 = r10
        L_0x00c0:
            int r11 = r7.length()
            r15 = 1
            if (r11 <= 0) goto L_0x00c9
            r11 = 1
            goto L_0x00ca
        L_0x00c9:
            r11 = 0
        L_0x00ca:
            if (r11 == 0) goto L_0x00d3
            long r19 = o40.C61926c.m72671P(r7)
            r23 = r9
            goto L_0x00ea
        L_0x00d3:
            fj1.b r7 = fj1.C45795b.f123698n
            if (r7 == 0) goto L_0x00e4
            androidx.lifecycle.i0 r7 = r7.mo71262a(r5)
            cl1.u r7 = (cl1.C55001u) r7
            r23 = r9
            long r8 = r7.f154416j
            r19 = r8
            goto L_0x00ea
        L_0x00e4:
            r23 = r9
            r7 = 0
            r19 = r7
        L_0x00ea:
            java.lang.String r7 = "reportInfo"
            c30.g r0 = r0.optJSONObject(r7)
            if (r0 == 0) goto L_0x00fa
            java.lang.String r7 = "songId"
            java.lang.String r7 = r0.optString(r7)
            goto L_0x00fb
        L_0x00fa:
            r7 = 0
        L_0x00fb:
            if (r7 != 0) goto L_0x00fe
            r7 = r10
        L_0x00fe:
            if (r0 == 0) goto L_0x0108
            java.lang.String r8 = "songName"
            java.lang.String r0 = r0.optString(r8)
            goto L_0x0109
        L_0x0108:
            r0 = 0
        L_0x0109:
            if (r0 != 0) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r10 = r0
        L_0x010d:
            te3.c21 r0 = new te3.c21
            r0.<init>()
            r0.f182392d = r13
            r0.f182364J = r1
            te3.e71 r1 = new te3.e71
            r1.<init>()
            r8 = r23
            r1.f182928d = r8
            r0.f182388Z = r1
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r8 = o40.C61926c.m72691p(r19)
            java.lang.String r9 = "object_id"
            r1.put(r9, r8)
            java.lang.String r8 = "page_type"
            java.lang.String r9 = "program_real"
            r1.put(r8, r9)
            java.lang.String r8 = "song_id"
            r1.put(r8, r7)
            java.lang.String r8 = "song_name"
            r1.put(r8, r10)
            di3.d r4 = di3.C86312j.m106911c(r4)
            ir.n r4 = (p565ir.C60606n) r4
            fj1.b r8 = fj1.C45795b.f123698n
            if (r8 == 0) goto L_0x0155
            androidx.lifecycle.i0 r5 = r8.mo71262a(r5)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            goto L_0x0156
        L_0x0155:
            r5 = 0
        L_0x0156:
            boolean r4 = r4.Sj0(r5)
            java.lang.String r5 = "object_type"
            if (r4 == 0) goto L_0x0162
            r1.put(r5, r15)
            goto L_0x0166
        L_0x0162:
            r4 = 2
            r1.put(r5, r4)
        L_0x0166:
            java.lang.Class<ht1.j5> r4 = ht1.C8777j5.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ht1.j5 r4 = (ht1.C8777j5) r4
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "this.toString()"
            gy3.C87412m.m108593f(r1, r5)
            java.lang.String r5 = "watch_live_record"
            r4.hg0(r5, r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r4 = "KEY_PARAMS_START_OFFSET"
            r1.putExtra(r4, r6)
            java.lang.String r4 = "KEY_PARAMS_IS_LIVING"
            r1.putExtra(r4, r15)
            java.lang.String r4 = "KEY_PAGE_TYPE"
            r1.putExtra(r4, r9)
            java.lang.String r4 = "KEY_PARAMS_REPLAY_SONG_ID"
            r1.putExtra(r4, r7)
            java.lang.String r4 = "KEY_PARAMS_REPLAY_SONG_NAME"
            r1.putExtra(r4, r10)
            java.lang.String r4 = "KEY_PARAMS_NEED_CLOSE_LIVE"
            r5 = 0
            r1.putExtra(r4, r5)
            fj1.b r4 = fj1.C45795b.f123698n
            if (r4 == 0) goto L_0x01ae
            androidx.lifecycle.i0 r3 = r4.mo71262a(r3)
            r8 = r3
            cl1.o r8 = (cl1.C54991o) r8
            goto L_0x01af
        L_0x01ae:
            r8 = 0
        L_0x01af:
            if (r8 != 0) goto L_0x01b2
            goto L_0x01b5
        L_0x01b2:
            r3 = 0
            r8.f154350p0 = r3
        L_0x01b5:
            di3.d r3 = di3.C86312j.m106911c(r2)
            r9 = r3
            ls3.g r9 = (ls3.C61397g) r9
            r3 = 0
            r10 = r0
            r11 = r1
            r0 = r13
            r13 = r19
            r15 = r0
            r19 = r3
            r9.mo83484bR(r10, r11, r12, r13, r15, r17, r18, r19)
            di3.d r0 = di3.C86312j.m106911c(r2)
            ls3.g r0 = (ls3.C61397g) r0
            r0.Bn0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.Wx0(c30.g, android.content.Context):void");
    }

    /* renamed from: X */
    public void mo76826X(ImageView imageView, FinderAuthInfo finderAuthInfo, int i, C64284cg cgVar) {
        C87412m.m108594g(imageView, "view");
        C58784w3.f168295a.mo83864D1(imageView, finderAuthInfo, i, cgVar);
    }

    public void X40(String str, ImageView imageView, String str2, C11978e0.C11979a aVar) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(aVar, "loaderType");
        Log.m105924i("Finder.FinderCommonFeatureService", "#loadBgBlurImageRadius100 url=" + str + " md5Source=" + str2);
        if (!(str == null || str.length() == 0) && imageView != null) {
            C99344b<C100810g0, Bitmap> b = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11863C().mo85956b(new C11992u(str, str2, "blur_100", C27696y.THUMB_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
            C55422z<T, R> zVar = C55422z.f157893a;
            b.getClass();
            b.f291320d = zVar;
            ((C99342a) b).mo85954d(imageView);
        }
    }

    /* renamed from: Xw */
    public void mo76828Xw(Context context, Intent intent, m74 m74) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(m74, FirebaseAnalytics.C113379b.LOCATION);
        C7335d c = C86312j.m106911c(C58684b.class);
        C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
        C13883o1.C13884a.m13253e((C13883o1) c, context, intent, m74, 0, 8, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object Xx0(android.content.Context r17, te3.C51398th3 r18, long r19, long r21, pe3.C89349b r23, java.lang.String r24, wx3.C15601d<? super rx3.C13604l<java.lang.Boolean, java.lang.String>> r25) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            r2 = r19
            r4 = r21
            r6 = r25
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.FinderCommonFeatureService.C55415n0
            if (r7 == 0) goto L_0x001d
            r7 = r6
            com.tencent.mm.plugin.FinderCommonFeatureService$n0 r7 = (com.tencent.p014mm.plugin.FinderCommonFeatureService.C55415n0) r7
            int r8 = r7.f157868j
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r8 & r9
            if (r10 == 0) goto L_0x001d
            int r8 = r8 - r9
            r7.f157868j = r8
            goto L_0x0022
        L_0x001d:
            com.tencent.mm.plugin.FinderCommonFeatureService$n0 r7 = new com.tencent.mm.plugin.FinderCommonFeatureService$n0
            r7.<init>(r1, r6)
        L_0x0022:
            java.lang.Object r6 = r7.f157866h
            xx3.a r8 = xx3.C15911a.COROUTINE_SUSPENDED
            int r9 = r7.f157868j
            r10 = 2
            java.lang.String r11 = "Finder.FinderCommonFeatureService"
            r12 = 1
            r13 = 0
            if (r9 == 0) goto L_0x005a
            if (r9 == r12) goto L_0x0040
            if (r9 != r10) goto L_0x0038
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0153
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0040:
            java.lang.Object r0 = r7.f157865g
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r7.f157864f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r7.f157863e
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r7.f157862d
            com.tencent.mm.plugin.FinderCommonFeatureService r4 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r4
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ d -> 0x0056 }
            r14 = r3
            goto L_0x0102
        L_0x0056:
            r0 = move-exception
            r14 = r3
            goto L_0x010e
        L_0x005a:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "#orderAndPay id="
            r6.append(r9)
            int r9 = r0.f142221d
            r6.append(r9)
            java.lang.String r9 = " liveId="
            r6.append(r9)
            r6.append(r2)
            java.lang.String r9 = " objectId="
            r6.append(r9)
            r6.append(r4)
            java.lang.String r9 = " price="
            r6.append(r9)
            int r9 = r0.f142222e
            r6.append(r9)
            java.lang.String r9 = " title="
            r6.append(r9)
            java.lang.String r9 = r0.f142223f
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r6)
            er1.j4 r6 = er1.C58739j4.f168176a
            java.lang.String r6 = r6.mo83718n()
            java.lang.String r9 = ""
            te3.s71 r14 = new te3.s71     // Catch:{ d -> 0x0109 }
            r14.<init>()     // Catch:{ d -> 0x0109 }
            je1.h2 r15 = je1.C46523h2.f125330a     // Catch:{ d -> 0x0109 }
            r10 = 5891(0x1703, float:8.255E-42)
            te3.ig0 r10 = r15.mo71859a(r10)     // Catch:{ d -> 0x0109 }
            r14.f185356d = r10     // Catch:{ d -> 0x0109 }
            zc1.b r10 = zc1.C66785b.f191882e     // Catch:{ d -> 0x0109 }
            java.lang.String r10 = r10.mo90662O5()     // Catch:{ d -> 0x0109 }
            r14.f185357e = r10     // Catch:{ d -> 0x0109 }
            r14.f185359g = r2     // Catch:{ d -> 0x0109 }
            r14.f185358f = r4     // Catch:{ d -> 0x0109 }
            r2 = r23
            r14.f185365p = r2     // Catch:{ d -> 0x0109 }
            r2 = r24
            r14.f185368s = r2     // Catch:{ d -> 0x0109 }
            int r2 = r0.f142221d     // Catch:{ d -> 0x0109 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ d -> 0x0109 }
            r14.f185360h = r2     // Catch:{ d -> 0x0109 }
            r14.f185363n = r6     // Catch:{ d -> 0x0109 }
            r14.f185361i = r12     // Catch:{ d -> 0x0109 }
            int r2 = r0.f142227j     // Catch:{ d -> 0x0109 }
            r14.f185369t = r2     // Catch:{ d -> 0x0109 }
            pe3.b r0 = r0.f142228n     // Catch:{ d -> 0x0109 }
            r14.f185370u = r0     // Catch:{ d -> 0x0109 }
            ob0.b r0 = r14.mo89036b()     // Catch:{ d -> 0x0109 }
            r2 = 0
            r4 = 0
            r5 = 3
            r10 = 0
            r7.f157862d = r1     // Catch:{ d -> 0x0109 }
            r14 = r17
            r7.f157863e = r14     // Catch:{ d -> 0x0107 }
            r7.f157864f = r6     // Catch:{ d -> 0x0107 }
            r7.f157865g = r9     // Catch:{ d -> 0x0107 }
            r7.f157868j = r12     // Catch:{ d -> 0x0107 }
            r18 = r0
            r19 = r2
            r21 = r4
            r22 = r7
            r23 = r5
            r24 = r10
            java.lang.Object r0 = q40.C89456b.m111831a(r18, r19, r21, r22, r23, r24)     // Catch:{ d -> 0x0107 }
            if (r0 != r8) goto L_0x00fe
            return r8
        L_0x00fe:
            r4 = r1
            r2 = r6
            r6 = r0
            r0 = r9
        L_0x0102:
            te3.t71 r6 = (te3.C51354t71) r6     // Catch:{ d -> 0x0105 }
            goto L_0x0123
        L_0x0105:
            r0 = move-exception
            goto L_0x010e
        L_0x0107:
            r0 = move-exception
            goto L_0x010c
        L_0x0109:
            r0 = move-exception
            r14 = r17
        L_0x010c:
            r4 = r1
            r2 = r6
        L_0x010e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "#orderAndPay FinderLiveRewardRequest fail. "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r6 = r13
        L_0x0123:
            if (r6 != 0) goto L_0x0132
            java.lang.String r2 = "#orderAndPay paymentResp is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            rx3.l r2 = new rx3.l
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.<init>(r3, r0)
            return r2
        L_0x0132:
            pe3.b r0 = r6.f142016e
            if (r0 == 0) goto L_0x013b
            byte[] r0 = r0.mo123703f()
            goto L_0x013c
        L_0x013b:
            r0 = r13
        L_0x013c:
            if (r0 != 0) goto L_0x0141
            r0 = 0
            byte[] r0 = new byte[r0]
        L_0x0141:
            r7.f157862d = r13
            r7.f157863e = r13
            r7.f157864f = r13
            r7.f157865g = r13
            r3 = 2
            r7.f157868j = r3
            java.lang.Object r6 = r4.mo76835bI(r14, r0, r2, r7)
            if (r6 != r8) goto L_0x0153
            return r8
        L_0x0153:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.Xx0(android.content.Context, te3.th3, long, long, pe3.b, java.lang.String, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0140, code lost:
        if (r14.mo9225i().mo123062e(new com.tencent.p014mm.plugin.FinderCommonFeatureService.C55416p0(r11, r0, r1)) == null) goto L_0x0145;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Yx0(int r40, int r41, int r42, android.content.Context r43, android.content.Intent r44, android.view.View r45, boolean r46) {
        /*
            r39 = this;
            r0 = r39
            r1 = r43
            r11 = r44
            java.lang.String r2 = "feed_object_id"
            r12 = 0
            long r36 = r11.getLongExtra(r2, r12)
            java.lang.String r2 = "feedID"
            java.lang.String r2 = r11.getStringExtra(r2)
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x001a
            r15 = r3
            goto L_0x001b
        L_0x001a:
            r15 = r2
        L_0x001b:
            java.lang.String r2 = "nonceID"
            java.lang.String r2 = r11.getStringExtra(r2)
            if (r2 != 0) goto L_0x0025
            r14 = r3
            goto L_0x0026
        L_0x0025:
            r14 = r2
        L_0x0026:
            r2 = 3
            java.lang.String r3 = "key_reuqest_scene"
            int r38 = r11.getIntExtra(r3, r2)
            java.lang.Class<ht1.n4> r2 = ht1.C60188n4.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.n4 r2 = (ht1.C60188n4) r2
            boolean r3 = r2.Gf0()
            r4 = 0
            r10 = 1
            if (r3 == 0) goto L_0x0046
            boolean r2 = r2.k90()
            if (r2 == 0) goto L_0x0046
            r16 = 1
            goto L_0x0048
        L_0x0046:
            r16 = 0
        L_0x0048:
            if (r46 == 0) goto L_0x0060
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99492q3
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != r10) goto L_0x0060
            r17 = 1
            goto L_0x0062
        L_0x0060:
            r17 = 0
        L_0x0062:
            if (r17 == 0) goto L_0x006b
            r2 = 162(0xa2, float:2.27E-43)
        L_0x0066:
            r3 = r40
            r4 = r41
            goto L_0x0076
        L_0x006b:
            if (r16 == 0) goto L_0x0070
            r2 = 20
            goto L_0x0066
        L_0x0070:
            r3 = r40
            r4 = r41
            r2 = r42
        L_0x0076:
            r0.mo76842e7(r3, r4, r2, r11)
            java.lang.String r2 = "feed_encrypted_object_id"
            r11.putExtra(r2, r15)
            java.lang.String r2 = "feed_object_nonceId"
            r11.putExtra(r2, r14)
            r2 = 11
            java.lang.String r3 = "report_scene"
            r11.putExtra(r3, r2)
            if (r45 == 0) goto L_0x00a0
            r4 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 18
            r18 = 0
            r2 = r44
            r3 = r45
            r12 = 1
            r10 = r18
            de1.C7287o.m7447c(r2, r3, r4, r6, r7, r8, r9, r10)
            goto L_0x00a1
        L_0x00a0:
            r12 = 1
        L_0x00a1:
            if (r17 == 0) goto L_0x00b0
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.t1 r2 = (ht1.C60200t1) r2
            r2.mo76844fK(r1, r11)
            goto L_0x01b6
        L_0x00b0:
            if (r16 == 0) goto L_0x01ab
            java.lang.String r2 = "KEY_FINDER_POST_FINISH_JUMP_HOT_TAB"
            r11.putExtra(r2, r12)
            java.lang.String r2 = "KEY_OBJECT_NONCE_ID"
            r11.putExtra(r2, r14)
            r2 = 6
            java.lang.String r3 = "FROM_SCENE_KEY"
            r11.putExtra(r3, r2)
            java.lang.ref.WeakReference r2 = com.tencent.p014mm.app.AppForegroundDelegate.m161224g()
            r3 = 0
            if (r2 == 0) goto L_0x00d0
            java.lang.Object r4 = r2.get()
            android.app.Activity r4 = (android.app.Activity) r4
            goto L_0x00d1
        L_0x00d0:
            r4 = r3
        L_0x00d1:
            if (r4 != 0) goto L_0x00d9
            com.tencent.mm.app.AppForegroundDelegate r2 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            java.lang.ref.WeakReference r2 = r2.mo174212f()
        L_0x00d9:
            if (r2 == 0) goto L_0x0143
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L_0x0143
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r4 == 0) goto L_0x00f0
            r4 = 0
            int r6 = (r36 > r4 ? 1 : (r36 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x00f0
            return
        L_0x00f0:
            je1.x1 r4 = new je1.x1
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            rs1.s8$a r5 = rs1.C13442s8.f38060Q0
            rs1.s8 r5 = r5.mo12873f(r1)
            if (r5 == 0) goto L_0x010f
            te3.hj1 r5 = r5.mo12861q3()
            r30 = r5
            goto L_0x0111
        L_0x010f:
            r30 = r3
        L_0x0111:
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 118720(0x1cfc0, float:1.66362E-40)
            r35 = 0
            java.lang.String r20 = ""
            r5 = r14
            r14 = r4
            r6 = r15
            r15 = r36
            r17 = r5
            r18 = r42
            r19 = r38
            r29 = r6
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r7 = 5000(0x1388, double:2.4703E-320)
            r4.mo85582k(r2, r3, r7)
            nr3.e r2 = r4.mo9225i()
            com.tencent.mm.plugin.FinderCommonFeatureService$p0 r4 = new com.tencent.mm.plugin.FinderCommonFeatureService$p0
            r4.<init>(r11, r0, r1)
            nr3.e r2 = r2.mo123062e(r4)
            if (r2 != 0) goto L_0x01b6
            goto L_0x0145
        L_0x0143:
            r5 = r14
            r6 = r15
        L_0x0145:
            ft1.a r12 = ft1.C59319a.f169618b
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            com.tencent.mm.plugin.FinderCommonFeatureService$q0 r18 = com.tencent.p014mm.plugin.FinderCommonFeatureService.C55418q0.f157883d
            r19 = 28
            r20 = 0
            java.lang.String r13 = "bizBoxActivityFail"
            o40.C11348f.C11349a.m11178b(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r2 == 0) goto L_0x0165
            r7 = 0
            int r2 = (r36 > r7 ? 1 : (r36 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0165
            return
        L_0x0165:
            je1.x1 r2 = new je1.x1
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            rs1.s8$a r4 = rs1.C13442s8.f38060Q0
            rs1.s8 r4 = r4.mo12873f(r1)
            if (r4 == 0) goto L_0x0181
            te3.hj1 r3 = r4.mo12861q3()
        L_0x0181:
            r30 = r3
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 118720(0x1cfc0, float:1.66362E-40)
            r35 = 0
            java.lang.String r20 = ""
            r14 = r2
            r15 = r36
            r17 = r5
            r18 = r42
            r19 = r38
            r29 = r6
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            nr3.e r2 = r2.mo9225i()
            com.tencent.mm.plugin.FinderCommonFeatureService$r0 r3 = new com.tencent.mm.plugin.FinderCommonFeatureService$r0
            r3.<init>(r11, r0, r1)
            r2.mo123062e(r3)
            goto L_0x01b6
        L_0x01ab:
            java.lang.Class<er1.b> r2 = er1.C58684b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            er1.b r2 = (er1.C58684b) r2
            r2.Zx0(r1, r11)
        L_0x01b6:
            jm2.f r1 = jm2.C117361f.INSTANCE
            r2 = 540999685(0x203f0005, float:1.6178336E-19)
            r1.mo182041q(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.Yx0(int, int, int, android.content.Context, android.content.Intent, android.view.View, boolean):void");
    }

    public int Ze0(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        C65854g gVar = C65854g.f189373e;
        return C65854g.f189373e.mo89892b(finderObject);
    }

    /* renamed from: aO */
    public void mo76832aO(Context context, Intent intent) {
        Class cls = C58684b.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        if (!mo76873sF()) {
            ((C58684b) C86312j.m106911c(cls)).uy0(context);
            return;
        }
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
        C58684b.ly0((C58684b) c, context, intent, false, 4, (Object) null);
    }

    public void aa0(String str, ImageView imageView, String str2) {
        C11978e0.C11979a aVar = C11978e0.C11979a.RINGTONE_LIST;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(str, "url");
        if (!(str.length() == 0)) {
            C64689rq2 rq22 = new C64689rq2();
            C58784w3 w3Var = C58784w3.f168295a;
            String x1 = w3Var.mo83978x1(str, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            if (str2 == null) {
                str2 = x1;
            }
            rq22.f185275p = MD5Util.getMD5String(str2);
            rq22.f185266d = str;
            rq22.f185267e = str;
            String z1 = w3Var.mo83984z1(x1);
            rq22.f185285x0 = z1;
            rq22.f185287y0 = z1;
            C62351k0 k0Var = new C62351k0(rq22, C27696y.THUMB_IMAGE);
            if (imageView == null) {
                ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11869T0().mo85956b(k0Var, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar)).mo85953c();
            } else {
                ((C99342a) ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11869T0().mo85956b(k0Var, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar))).mo85954d(imageView);
            }
        }
    }

    /* renamed from: ai */
    public void mo76834ai(Context context, String str, int i, C60213x3 x3Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "json");
        C87412m.m108594g(x3Var, "callback");
        ((C61381b) C86312j.m106911c(C61381b.class)).Yp0().mo88195f(context, str, i, x3Var);
    }

    /* renamed from: bI */
    public Object mo76835bI(Context context, byte[] bArr, String str, C15601d<? super C13604l<Boolean, String>> dVar) {
        T hVar = new C66218h(C66447b.m78392b(dVar));
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = hVar;
        C87412m.m108592e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C13624e eVar = new C13624e(1, (FragmentActivity) context, new C1329w(f0Var), new C1331x(f0Var), new C1333y(f0Var));
        C87412m.m108594g(str, "<set-?>");
        eVar.f38603g = bArr;
        ((C10756c) C86709a0.m107533q(C10756c.class)).mo10992Gy(eVar);
        return hVar.mo90314b();
    }

    /* renamed from: bn */
    public void mo76836bn(Context context, Intent intent, int i, int i2) {
        Class cls = C58684b.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        String stringExtra = intent.getStringExtra("key_biz_username");
        if (Util.isNullOrNil(stringExtra) || C87412m.m108589b("null", stringExtra)) {
            String O5 = C66785b.f191882e.mo90662O5();
            if (!Util.isNullOrNil(O5)) {
                intent.putExtra("finder_username", O5);
                intent.putExtra("KEY_FINDER_SELF_FLAG", true);
                mo76842e7(i, i2, 33, intent);
                ((C58684b) C86312j.m106911c(cls)).mo13272V1(context, intent);
            } else if (context instanceof Activity) {
                Intent intent2 = new Intent();
                intent2.putExtra("key_create_scene", 6);
                intent2.putExtra("key_router_to_profile", false);
                ((C58684b) C86312j.m106911c(cls)).mo13297zc(context, intent2);
            }
        } else {
            Intent intent3 = new Intent();
            intent3.putExtra("Contact_User", stringExtra);
            intent3.putExtra("Contact_Scene", 213);
            intent3.putExtra("biz_profile_enter_from_finder", true);
            intent3.putExtra("force_get_contact", true);
            intent3.putExtra("key_use_new_contact_profile", true);
            intent3.putExtra("biz_profile_tab_type", 1);
            C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent3, (Bundle) null);
        }
    }

    /* renamed from: c0 */
    public void mo76837c0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        ((C58684b) C86312j.m106911c(C58684b.class)).mo83582c0(context, intent);
    }

    /* renamed from: cb */
    public FinderObject mo76838cb(long j, String str, int i, String str2) {
        Object obj;
        C8477a0 a0Var;
        long j2 = j;
        C87412m.m108594g(str2, "encryptedObjectId");
        Log.m105924i("Finder.FinderCommonFeatureService", "requestFinderObject " + j2 + ", " + str + " enter");
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = C65834e.f189316a.mo89871e(j2);
        Object obj2 = new Object();
        C8477a0 a0Var2 = new C8477a0();
        if (f0Var.f27484d == null) {
            Log.m105924i("Finder.FinderCommonFeatureService", "requestFinderObject " + j2 + ", start");
            a0Var = a0Var2;
            obj = obj2;
            new C46547x1(j, str, i, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, str2, (C49712hj1) null, 0, (C49946j51) null, false, 118720, (C8480h) null).mo9225i().mo123064p(new C1325t0(obj, j, f0Var, a0Var));
        } else {
            a0Var = a0Var2;
            obj = obj2;
        }
        if (f0Var.f27484d == null) {
            Object obj3 = obj;
            synchronized (obj3) {
                if (!a0Var.f27482d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestFinderObject wait ");
                    long j3 = j;
                    sb.append(j3);
                    Log.m105924i("Finder.FinderCommonFeatureService", sb.toString());
                    obj3.wait(2000);
                    Log.m105924i("Finder.FinderCommonFeatureService", "requestFinderObject notify " + j3);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        FinderItem finderItem = (FinderItem) f0Var.f27484d;
        if (finderItem != null) {
            return finderItem.getFeedObject();
        }
        return null;
    }

    public void cl0(Context context, Intent intent, int i) {
        Class cls = C58684b.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        if (!mo76873sF()) {
            ((C58684b) C86312j.m106911c(cls)).uy0(context);
            return;
        }
        C9584f.f29822a.mo10262a(intent, C31543z5.m39453c(), i);
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
        ((C58684b) c).vx0(context, intent, false);
    }

    public void dk0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        Log.m105924i("Finder.FinderCommonFeatureService", "[enterRelatedTimelineUI] " + context.getClass().getName());
        ((C58684b) C86312j.m106911c(C58684b.class)).dk0(context, intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r6 > 0) goto L_0x0033;
     */
    /* renamed from: dm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo76841dm(android.app.Activity r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "activity"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "Finder.FinderCommonFeatureService"
            java.lang.String r1 = "[openChannelsPostPage]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r1 = 0
            if (r6 == 0) goto L_0x0018
            int r2 = r6.length()
            if (r2 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r2 = 0
            goto L_0x0019
        L_0x0018:
            r2 = 1
        L_0x0019:
            if (r2 != 0) goto L_0x0031
            c30.g r2 = new c30.g     // Catch:{ Exception -> 0x0029 }
            r2.<init>((java.lang.String) r6)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r6 = "enterScene"
            int r6 = r2.optInt(r6, r1)     // Catch:{ Exception -> 0x0029 }
            if (r6 <= 0) goto L_0x0031
            goto L_0x0033
        L_0x0029:
            r6 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "createAccount exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r6, r3, r2)
        L_0x0031:
            r6 = 11
        L_0x0033:
            dp1.t0 r0 = dp1.C58408t0.f167336a
            r0.mo83266l(r6, r1)
            java.lang.Class<er1.b> r6 = er1.C58684b.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            er1.b r6 = (er1.C58684b) r6
            r0 = 0
            r6.Vx0(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.mo76841dm(android.app.Activity, java.lang.String):void");
    }

    /* renamed from: e7 */
    public String mo76842e7(int i, int i2, int i3, Intent intent) {
        return mo76739CG(mo76802R1(i, i2, i3), intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0073, code lost:
        r0 = ((ht1.C60204t3) di3.C86312j.m106911c(ht1.C60204t3.class)).ub0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void er0(android.content.Context r12, java.lang.String r13, ht1.C60216z4.C8821a<java.lang.Integer> r14) {
        /*
            r11 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r12, r0)
            c30.g r0 = new c30.g
            r0.<init>((java.lang.String) r13)
            java.lang.String r13 = "extInfo"
            c30.g r13 = r0.getJSONObject(r13)
            java.lang.String r0 = "title"
            java.lang.String r4 = r13.optString(r0)
            java.lang.String r0 = "topicType"
            int r0 = r13.optInt(r0)
            java.lang.String r1 = "poiClassifyId"
            java.lang.String r1 = r13.optString(r1)
            java.lang.String r2 = "longitude"
            double r2 = r13.optDouble(r2)
            java.lang.String r5 = "latitude"
            double r5 = r13.optDouble(r5)
            java.lang.String r7 = "eventEncryptedTopicId"
            java.lang.String r7 = r13.optString(r7)
            java.lang.String r8 = "entryScene"
            int r8 = r13.optInt(r8)
            java.lang.String r9 = "extraInfo"
            java.lang.String r9 = r13.optString(r9)
            java.lang.String r10 = "clientKVReportInfo"
            java.lang.String r13 = r13.optString(r10)
            r10 = 7
            if (r0 != r10) goto L_0x0091
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x006c
            if (r14 == 0) goto L_0x006c
            er1.i r0 = er1.C7808i.f26328b
            r0.getClass()
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "randomUUID().toString()"
            gy3.C87412m.m108593f(r1, r2)
            java.util.HashMap<java.lang.String, CALLBACK> r0 = r0.f26323a
            r0.put(r1, r14)
            r14 = r1
            goto L_0x006e
        L_0x006c:
            java.lang.String r14 = ""
        L_0x006e:
            boolean r0 = r12 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0073
            goto L_0x0083
        L_0x0073:
            java.lang.Class<ht1.t3> r0 = ht1.C60204t3.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t3 r0 = (ht1.C60204t3) r0
            android.app.Activity r0 = r0.ub0()
            if (r0 == 0) goto L_0x0083
            r2 = r0
            goto L_0x0084
        L_0x0083:
            r2 = r12
        L_0x0084:
            er1.o4 r1 = er1.C58759o4.f168229a
            java.lang.String r5 = ""
            r3 = r7
            r6 = r8
            r7 = r9
            r8 = r14
            r9 = r13
            r1.mo83791i6(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00e0
        L_0x0091:
            android.content.Intent r13 = new android.content.Intent
            r13.<init>()
            java.lang.String r14 = "key_topic_title"
            r13.putExtra(r14, r4)
            java.lang.String r14 = "key_topic_type"
            r13.putExtra(r14, r0)
            te3.db1 r14 = new te3.db1
            r14.<init>()
            r14.f182666i = r1
            float r0 = (float) r2
            r14.f182661d = r0
            float r0 = (float) r5
            r14.f182662e = r0
            java.lang.String r0 = "key_topic_poi_location"
            byte[] r14 = r14.toByteArray()     // Catch:{ IOException -> 0x00b7 }
            r13.putExtra(r0, r14)     // Catch:{ IOException -> 0x00b7 }
            goto L_0x00be
        L_0x00b7:
            java.lang.String r14 = "Finder.FinderCommonFeatureService"
            java.lang.String r0 = "location toByteArray exception"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
        L_0x00be:
            r14 = 36
            if (r14 != r8) goto L_0x00dd
            java.lang.String r14 = dp1.C58411u.f167342a
            r0 = 1
            if (r14 == 0) goto L_0x00d0
            int r1 = r14.length()
            if (r1 != 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            r1 = 0
            goto L_0x00d1
        L_0x00d0:
            r1 = 1
        L_0x00d1:
            if (r1 != 0) goto L_0x00dd
            java.lang.String r1 = "key_context_id"
            r13.putExtra(r1, r14)
            java.lang.String r14 = "KEY_IGNORE_REPORT_INIT"
            r13.putExtra(r14, r0)
        L_0x00dd:
            r11.yt0(r12, r13)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.er0(android.content.Context, java.lang.String, ht1.z4$a):void");
    }

    /* renamed from: fK */
    public void mo76844fK(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        C37521f.f99374d.getClass();
        intent.setClass(context, C37521f.f99510s3.mo60266n().intValue() == 1 ? FinderHorizontalVideoNewFormUI.class : C37521f.f99519t3.mo60266n().intValue() == 1 ? FinderHorizontalVideoHalfFeedUI.class : FinderNewStyleTimelineUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLongVideoShareUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLongVideoShareUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public C87592u3 fi0() {
        return C58757o1.f168227a;
    }

    public void ft0(View view, View view2, View view3) {
        C87412m.m108594g(view, "entranceView");
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62163m.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…DotSessionVM::class.java)");
        C62163m mVar = (C62163m) a;
        C23564m.m28138h(view, new C11747l(mVar));
        if (mVar.mo87214j3()) {
            C61926c.m72694s(C2479n0.f12951H, new C62159h(mVar));
            if (view2 != null) {
                C23564m.m28138h(view2, new C62160i(mVar));
            }
        }
        if (mVar.mo87214j3()) {
            C61926c.m72694s(C2479n0.f12957c, new C62161j(mVar));
            if (view3 != null) {
                C23564m.m28138h(view3, new C62162k(mVar));
            }
        }
    }

    /* renamed from: gA */
    public long mo76847gA() {
        return C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_ENTER_FINDER_LIVE_SQUARE_LONG_SYNC, 0);
    }

    /* renamed from: gJ */
    public C33071r2 mo76848gJ() {
        return (C65328r) ((C36570n) ((C37038p) C86312j.m106911c(C37038p.class)).f98191d).getValue();
    }

    /* renamed from: gS */
    public String mo76849gS(C117747y yVar) {
        String str;
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C46118w5 w5Var = yVar instanceof C46118w5 ? (C46118w5) yVar : null;
        if (w5Var == null || (str = w5Var.f124280i) == null) {
            return null;
        }
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str != null) {
            return Uri.parse(str).getQueryParameter("promoter_token");
        }
        return null;
    }

    /* renamed from: gW */
    public C65416i mo76850gW() {
        C86709a0.m107523b().mo121108c();
        C65416i iVar = this.f157803o;
        if (iVar == null) {
            iVar = new C65416i(mo76790Np());
        }
        this.f157803o = iVar;
        return iVar;
    }

    /* renamed from: gm */
    public void mo76851gm(String str, int i, String str2, int i2, int i3, int i4, long j, long j2, long j3, int i5) {
        String str3 = str;
        int i6 = i;
        String str4 = str2;
        C87412m.m108594g(str, "sessionID");
        C87412m.m108594g(str4, "wording");
        Class cls = C58417y0.class;
        if (i6 == 2) {
            C58380k1.f167277b = str3;
        }
        FinderSnsPostStruct finderSnsPostStruct = new FinderSnsPostStruct();
        finderSnsPostStruct.f156063d = finderSnsPostStruct.mo86045b("SessinId", str, true);
        finderSnsPostStruct.f156064e = (long) i6;
        finderSnsPostStruct.f156065f = j3;
        finderSnsPostStruct.f156066g = (long) i2;
        finderSnsPostStruct.f156068i = finderSnsPostStruct.mo86045b("FinderFeedId", ((C58417y0) C86312j.m106911c(cls)).xx0(j2), true);
        finderSnsPostStruct.f156067h = finderSnsPostStruct.mo86045b("SnsFeedId", ((C58417y0) C86312j.m106911c(cls)).xx0(j), true);
        String O5 = C66785b.f191882e.mo90662O5();
        finderSnsPostStruct.f156072m = (long) i3;
        finderSnsPostStruct.f156073n = (long) i4;
        long j4 = 0;
        long j5 = Util.isNullOrNil(O5) ? 0 : 1;
        finderSnsPostStruct.f156069j = j5;
        if (j5 == 1 && (!C14937o.f40972a.mo13988j(O5, 1).isEmpty())) {
            j4 = 1;
        }
        finderSnsPostStruct.f156070k = j4;
        finderSnsPostStruct.f156071l = finderSnsPostStruct.mo86045b("Wording", str4, true);
        finderSnsPostStruct.f156074o = (long) i5;
        finderSnsPostStruct.mo86054n();
        ((C58417y0) C86312j.m106911c(cls)).Ec0(finderSnsPostStruct);
    }

    /* renamed from: gr */
    public void mo76852gr(Activity activity) {
        String str;
        C51978xi1 xi12;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C55718s0 G5 = Nt0().mo77227G5("FinderEntrance");
        if (G5 == null || (xi12 = G5.field_ctrInfo) == null || (str = xi12.f144678p) == null) {
            str = "";
        }
        C77407n nVar = new C77407n((Context) activity, 1, false);
        nVar.f225771i = new C1328v0(activity, str);
        nVar.f225782p = new C1330w0(activity, str);
        nVar.mo107573q();
    }

    /* renamed from: gy */
    public void mo76853gy(boolean z) {
        FinderVideoCtrlEvent finderVideoCtrlEvent = new FinderVideoCtrlEvent();
        finderVideoCtrlEvent.f154814d.f154815a = z;
        finderVideoCtrlEvent.publish();
        Log.m105924i("Finder.FinderCommonFeatureService", "notifyFinderVideoPlayStateToChange, shouldPlay=" + z);
    }

    /* renamed from: h5 */
    public void mo76854h5() {
        ((C61568m) C86312j.m106911c(C61568m.class)).nv0(C0076j0.RETURN_GIFT_BOARD_FROM_EXCHARGE_UI, "", 0);
    }

    /* renamed from: hR */
    public long mo76855hR() {
        return C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_EXIT_FINDER_LIVE_SQUARE_LONG_SYNC, 0);
    }

    public void hj0(long j, long j2, String str, long j3) {
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8603d((C8777j5) c, j, j2, str, j3, 0, C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM, "37", (String) null, 0, 384, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r47 == 11) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void jm0(long r40, long r42, java.lang.String r44, int r45, int r46, long r47, java.lang.String r49, int r50, int r51, java.lang.String r52, java.lang.String r53, long r54, int r56) {
        /*
            r39 = this;
            r0 = r45
            r1 = r46
            r11 = r49
            r2 = r56
            java.lang.Class<ht1.j5> r3 = ht1.C8777j5.class
            ak1.f0$q r10 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM
            ak1.f0$q r4 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_SINGLE_AVATAR
            r5 = 4
            int r7 = (r47 > r5 ? 1 : (r47 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0017
        L_0x0014:
            r21 = r4
            goto L_0x004d
        L_0x0017:
            ak1.f0$q r4 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_FEED_CARD_AVATAR_LIVING
            r5 = 5
            int r7 = (r47 > r5 ? 1 : (r47 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0020
            goto L_0x0014
        L_0x0020:
            ak1.f0$q r4 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_FEED_CARD_AVATAR
            r5 = 6
            int r7 = (r47 > r5 ? 1 : (r47 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0029
            goto L_0x0014
        L_0x0029:
            r4 = 7
            int r6 = (r47 > r4 ? 1 : (r47 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0032
        L_0x002f:
            r21 = r10
            goto L_0x004d
        L_0x0032:
            ak1.f0$q r4 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_AVATAR_LIVING
            r5 = 9
            int r7 = (r47 > r5 ? 1 : (r47 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x003b
            goto L_0x0014
        L_0x003b:
            ak1.f0$q r4 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_LIVE_FEED_AVATAR_LIVING
            r5 = 10
            int r7 = (r47 > r5 ? 1 : (r47 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0044
            goto L_0x0014
        L_0x0044:
            ak1.f0$q r4 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_FEED_AVATAR_LIVING
            r5 = 11
            int r7 = (r47 > r5 ? 1 : (r47 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x002f
            goto L_0x0014
        L_0x004d:
            ak1.f0$s0 r4 = ak1.C54067f0.C54083s0.CLICK_LIVE_CARD
            r5 = 1
            if (r2 != r5) goto L_0x0055
        L_0x0052:
            r31 = r4
            goto L_0x006b
        L_0x0055:
            ak1.f0$s0 r4 = ak1.C54067f0.C54083s0.CLICK_LIVE_CARD_AVATAR_LIVING
            r5 = 2
            if (r2 != r5) goto L_0x005b
            goto L_0x0052
        L_0x005b:
            ak1.f0$s0 r4 = ak1.C54067f0.C54083s0.CLICK_CARD_AVATAR_LIVING
            r5 = 3
            if (r2 != r5) goto L_0x0061
            goto L_0x0052
        L_0x0061:
            ak1.f0$s0 r4 = ak1.C54067f0.C54083s0.CLICK_AVATAR_LIVING
            r5 = 4
            if (r2 != r5) goto L_0x0067
            goto L_0x0052
        L_0x0067:
            ak1.f0$s0 r4 = ak1.C54067f0.C54083s0.CLICK_SNSAD_ENTER_LIVE_ROOM
            r5 = 5
            goto L_0x0052
        L_0x006b:
            java.lang.String r2 = "temp_17"
            boolean r2 = gy3.C87412m.m108589b(r2, r11)
            if (r2 == 0) goto L_0x0093
            di3.d r2 = di3.C86312j.m106911c(r3)
            java.lang.String r3 = "getService(IHellLiveReport::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            ht1.j5 r2 = (ht1.C8777j5) r2
            long r6 = (long) r0
            long r8 = (long) r1
            r12 = 0
            r13 = 0
            r14 = 384(0x180, float:5.38E-43)
            r15 = 0
            r0 = r2
            r1 = r40
            r3 = r42
            r5 = r44
            r11 = r49
            ht1.C8777j5.C8778a.m8603d(r0, r1, r3, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            goto L_0x00e5
        L_0x0093:
            di3.d r2 = di3.C86312j.m106911c(r3)
            ht1.j5 r2 = (ht1.C8777j5) r2
            ak1.b0 r3 = new ak1.b0
            java.lang.String r4 = ""
            if (r44 != 0) goto L_0x00a2
            r16 = r4
            goto L_0x00a4
        L_0x00a2:
            r16 = r44
        L_0x00a4:
            long r5 = (long) r0
            long r0 = (long) r1
            r7 = r50
            if (r11 != 0) goto L_0x00ad
            r22 = r4
            goto L_0x00af
        L_0x00ad:
            r22 = r11
        L_0x00af:
            long r7 = (long) r7
            r9 = r51
            long r9 = (long) r9
            if (r52 != 0) goto L_0x00b8
            r27 = r4
            goto L_0x00ba
        L_0x00b8:
            r27 = r52
        L_0x00ba:
            if (r53 != 0) goto L_0x00bf
            r28 = r4
            goto L_0x00c1
        L_0x00bf:
            r28 = r53
        L_0x00c1:
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 253952(0x3e000, float:3.55863E-40)
            r38 = 0
            r11 = r3
            r12 = r40
            r14 = r42
            r17 = r5
            r19 = r0
            r23 = r7
            r25 = r9
            r29 = r54
            r11.<init>(r12, r14, r16, r17, r19, r21, r22, r23, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38)
            r2.mo9597CB(r3)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.jm0(long, long, java.lang.String, int, int, long, java.lang.String, int, int, java.lang.String, java.lang.String, long, int):void");
    }

    /* renamed from: jn */
    public void mo76858jn(String str, int i, boolean z) {
        FinderObject finderObject;
        C87412m.m108594g(str, "mpPassInfo");
        try {
            C51236sf1 sf12 = new C51236sf1();
            sf12.parseFrom(Base64.decode(str, 0));
            FinderItem f = C65834e.f189316a.mo89872f(sf12.f141473e);
            if (f == null || (finderObject = f.getFeedObject()) == null) {
                String str2 = sf12.f141473e;
                String str3 = sf12.f141472d;
                if (str3 == null) {
                    str3 = "";
                }
                finderObject = mo76838cb(0, str2, i, str3);
            }
            if (finderObject != null) {
                C65866w.C14968a aVar = C65866w.f189406g;
                C65866w wVar = C65866w.f189407h;
                FinderItem a = FinderItem.Companion.mo79056a(finderObject, 0);
                C49712hj1 hj12 = new C49712hj1();
                hj12.f134675i = i;
                C13598b0 b0Var = C13598b0.f38549a;
                C65866w.m77594c(wVar, a, z, false, 2, 0, (C65866w.C14969b) null, hj12, 48, (Object) null);
            }
        } catch (Throwable th) {
            Log.m105928w("Finder.FinderCommonFeatureService", "likeFeed e:" + th);
        }
    }

    public C46120y4 kc0() {
        return C7868s3.f26472a;
    }

    /* renamed from: ku */
    public boolean mo76860ku() {
        C58784w3.f168295a.mo83952o();
        return C58784w3.f168310p == 1;
    }

    /* renamed from: l7 */
    public C60216z4 mo76861l7() {
        return C58759o4.f168229a;
    }

    public String lr0() {
        C58741j5 j5Var = C58741j5.f168184a;
        return C58741j5.f168187d;
    }

    public void np0(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "json");
        ConcurrentHashMap<String, BaseFinderFeed> concurrentHashMap = C0500a.f1223a;
        Log.m105924i("FinderJsHandler", "json = " + str);
        try {
            C104289g gVar = new C104289g(str);
            String optString = gVar.optString("businessType", "0");
            C87412m.m108593f(optString, "jsonObject.optString(\"businessType\", \"0\")");
            int parseInt = Integer.parseInt(optString);
            String optString2 = gVar.optString("finderJumpId", "");
            String optString3 = gVar.optString("commentScene", "0");
            C87412m.m108593f(optString3, "jsonObject.optString(\"commentScene\", \"0\")");
            int parseInt2 = Integer.parseInt(optString3);
            String optString4 = gVar.optString("status", "0");
            C87412m.m108593f(optString4, "jsonObject.optString(\"status\", \"0\")");
            Integer.parseInt(optString4);
            if (parseInt == 1) {
                C87412m.m108593f(optString2, "idKey");
                BaseFinderFeed remove = C0500a.f1223a.remove(optString2);
                if (remove != null) {
                    C39622i0 a = C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
                    C87412m.m108593f(a, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
                    C62273n.m73199k3((C62273n) a, remove.mo3513o().getFeedObject(), parseInt2, (C49712hj1) null, 1, 4, (Object) null);
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("FinderJsHandler", th, "callFinderJsHandler exception", new Object[0]);
        }
    }

    /* renamed from: nr */
    public void mo76864nr(Context context, Intent intent) {
        Class cls = C58684b.class;
        Class cls2 = C10432i.class;
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        if (C11767a.f34453a.mo11660b("entrance") != 0) {
            ((C58684b) C86312j.m106911c(cls)).uy0(context);
            return;
        }
        C75592q0.m90781k();
        boolean sF = mo76873sF();
        boolean z = true;
        Log.m105925i("Finder.FinderCommonFeatureService", "showFinder %s", Boolean.valueOf(sF));
        boolean z2 = ((C10432i) C86312j.m106911c(cls2)).mo10750e() && ((C10432i) C86312j.m106911c(cls2)).mo10740Mn() == 2;
        if (sF && !z2 && WeChatBrands.Business.Entries.MeSetDiscoveryChannels.checkAvailable(context)) {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("!hideEnter = ");
        sb.append(!z);
        Log.m105924i("Finder.FinderCommonFeatureService", sb.toString());
        if (!C58784w3.f168295a.mo83915a1() || z) {
            ((C58684b) C86312j.m106911c(cls)).Zx0(context, intent);
            C117361f.INSTANCE.mo182041q(540999685);
            return;
        }
        ((C15907f) C86312j.m106911c(C15907f.class)).K00(context, 34359738368L, (CheckBoxPreference) null, new C55406h(context, intent), 3);
    }

    public C64888zo1 nu0(String str, int i) {
        C87412m.m108594g(str, "mpPassInfo");
        Log.m105924i("Finder.FinderCommonFeatureService", "tryGetFinderObjectFromMp");
        try {
            C51236sf1 sf12 = new C51236sf1();
            sf12.parseFrom(Base64.decode(str, 0));
            String str2 = sf12.f141473e;
            String str3 = sf12.f141472d;
            if (str3 == null) {
                str3 = "";
            }
            FinderObject cb = mo76838cb(0, str2, i, str3);
            C64888zo1 zo12 = new C64888zo1();
            zo12.f186758d = cb;
            if (cb != null) {
                ((C58417y0) C86312j.m106911c(C58417y0.class)).j80(cb, i);
            }
            ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85145Fw(zo12);
            return zo12;
        } catch (Throwable th) {
            Log.m105928w("Finder.FinderCommonFeatureService", "tryGetFinderObjectFromMp e:" + th);
            return null;
        }
    }

    /* renamed from: oO */
    public void mo76866oO(String str, ImageView imageView, String str2, C11978e0.C11979a aVar) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(aVar, "loaderType");
        Log.m105924i("Finder.FinderCommonFeatureService", "#loadImage url=" + str + " md5Source=" + str2);
        if (!(str == null || str.length() == 0) && imageView != null) {
            ((C99342a) ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11992u(str, str2, "", C27696y.THUMB_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar))).mo85954d(imageView);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x04c0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x061c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x061f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0641  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0644  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x06cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAccountInitialized(android.content.Context r25) {
        /*
            r24 = this;
            r1 = r24
            java.lang.Class<yy.h> r2 = p773yy.C66708h.class
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_USER_VERSION_INT_SYNC
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MY_FINDER_LOCAL_COVER_IMG_STRING_SYNC
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_DB_VERSION_STRING_SYNC
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r6 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.String r0 = "context"
            r7 = r25
            gy3.C87412m.m108594g(r7, r0)
            super.onAccountInitialized(r25)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1279(0x4ff, double:6.32E-321)
            r10 = 40
            r12 = 1
            r7.mo175913w(r8, r10, r12)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.String r7 = r1.f157788P
            java.lang.Object r0 = r0.mo119685f(r5, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[onAccountInitialized] Log appendIsSync="
            r7.append(r8)
            java.lang.Boolean r8 = com.tencent.p014mm.xlog.app.XLogSetup.appendIsSync
            r7.append(r8)
            java.lang.String r8 = " false "
            r7.append(r8)
            java.lang.String r8 = r1.f157787N
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "Finder.FinderCommonFeatureService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            java.lang.String r10 = r1.f157787N
            java.lang.Object r7 = r7.mo119685f(r5, r10)
            java.lang.String r10 = r1.f157787N
            boolean r7 = gy3.C87412m.m108589b(r7, r10)
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r12 = 1
            r13 = 0
            r14 = 3
            java.lang.String r15 = ""
            if (r7 != 0) goto L_0x025a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "resetConfig oldVer:"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r0 = " CURRENT_DB_VERSION:"
            r7.append(r0)
            java.lang.String r0 = r1.f157787N
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            java.lang.String r0 = "clearAll"
            java.lang.String r7 = "Finder.FinderContactPage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)     // Catch:{ Exception -> 0x0252 }
            er1.w3 r7 = er1.C58784w3.f168295a     // Catch:{ Exception -> 0x0252 }
            java.lang.String r8 = r7.mo83907W(r12)     // Catch:{ Exception -> 0x0252 }
            boolean r16 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)     // Catch:{ Exception -> 0x0252 }
            if (r16 == 0) goto L_0x00ad
            com.tencent.p014mm.vfs.C86013q1.m106446g(r8, r12)     // Catch:{ Exception -> 0x0252 }
        L_0x00ad:
            vp1.o$a r8 = vp1.C14937o.f40972a     // Catch:{ Exception -> 0x0252 }
            r8.mo13982c()     // Catch:{ Exception -> 0x0252 }
            java.lang.String r8 = "Finder.FansContactPage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ Exception -> 0x0252 }
            java.lang.String r0 = r7.mo83907W(r14)     // Catch:{ Exception -> 0x0252 }
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ Exception -> 0x0252 }
            if (r7 == 0) goto L_0x00c4
            com.tencent.p014mm.vfs.C86013q1.m106446g(r0, r12)     // Catch:{ Exception -> 0x0252 }
        L_0x00c4:
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_SYNC_KEYBUF2_STRING_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r15)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r15)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r15)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_STRING_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r15)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_WRITE_INT_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r11)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_WRITE_INT_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r11)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_WRITE_INT_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r11)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FINDERITEM_MAXID_LONG_SYNC     // Catch:{ Exception -> 0x0252 }
            r16 = 1
            java.lang.Long r8 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r8)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MY_FINDER_USERNAME_STRING_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r15)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r4, r15)     // Catch:{ Exception -> 0x0252 }
            zc1.b r0 = zc1.C66785b.f191882e     // Catch:{ Exception -> 0x0252 }
            java.lang.String r7 = r0.mo90662O5()     // Catch:{ Exception -> 0x0252 }
            bd1.i r8 = bd1.C39759i.FINDER_CONFIG     // Catch:{ Exception -> 0x0252 }
            r0.mo90660L2(r7, r8)     // Catch:{ Exception -> 0x0252 }
            bd1.f r7 = new bd1.f     // Catch:{ Exception -> 0x0252 }
            r7.<init>()     // Catch:{ Exception -> 0x0252 }
            te3.sq2 r8 = r7.mo62398d()     // Catch:{ Exception -> 0x0252 }
            r8.f141692x = r10     // Catch:{ Exception -> 0x0252 }
            te3.qq2 r8 = r7.mo62397b()     // Catch:{ Exception -> 0x0252 }
            r8.f140463d = r13     // Catch:{ Exception -> 0x0252 }
            bd1.i r8 = bd1.C39759i.FINDER_RE_INIT     // Catch:{ Exception -> 0x0252 }
            r0.mo90665S0(r7, r8)     // Catch:{ Exception -> 0x0252 }
            f40.o r7 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()     // Catch:{ Exception -> 0x0252 }
            r7.mo119677K(r3, r11)     // Catch:{ Exception -> 0x0252 }
            r24.yx0()     // Catch:{ Exception -> 0x0252 }
            f40.o r7 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_TIMELINE_ALL_LASTBUF_STRING_SYNC     // Catch:{ Exception -> 0x0252 }
            r7.mo119677K(r8, r15)     // Catch:{ Exception -> 0x0252 }
            f40.o r7 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_TIMELINE_HEADER_WORDING_STRING_SYNC     // Catch:{ Exception -> 0x0252 }
            r7.mo119677K(r8, r15)     // Catch:{ Exception -> 0x0252 }
            f40.o r7 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_TIMELINE_FOOTER_WORDING_STRING_SYNC     // Catch:{ Exception -> 0x0252 }
            r7.mo119677K(r8, r15)     // Catch:{ Exception -> 0x0252 }
            f40.o r7 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_HOT_LIST_SEARCH_REQUEST_ID_STRING     // Catch:{ Exception -> 0x0252 }
            r7.mo119677K(r8, r15)     // Catch:{ Exception -> 0x0252 }
            bd1.c r7 = new bd1.c     // Catch:{ Exception -> 0x0252 }
            java.lang.String r8 = r0.mo90662O5()     // Catch:{ Exception -> 0x0252 }
            if (r8 != 0) goto L_0x01b6
            r8 = r15
        L_0x01b6:
            r7.<init>(r8)     // Catch:{ Exception -> 0x0252 }
            r7.field_systemMsgCount = r10     // Catch:{ Exception -> 0x0252 }
            bd1.i r8 = bd1.C39759i.SYS_MSG_COUNT     // Catch:{ Exception -> 0x0252 }
            r0.mo90672m1(r7, r8)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_MSG_SYSTEM_INT_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r11)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r11)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r11)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r11)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r11)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FOLLOW_ACCEPT_INT_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r11)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r11)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FIRST_CREATE_USER_BOOLEAN     // Catch:{ Exception -> 0x0252 }
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r8)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_NOT_INTERESTED_CONFIG_STRING     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r15)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r11)     // Catch:{ Exception -> 0x0252 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0252 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FIND_MORE_UI_RED_DOT_BOOLEAN_SYNC     // Catch:{ Exception -> 0x0252 }
            r0.mo119677K(r7, r8)     // Catch:{ Exception -> 0x0252 }
            goto L_0x025a
        L_0x0252:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r10]
            java.lang.String r8 = "resetConfig error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r8, r7)
        L_0x025a:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.String r7 = r1.f157787N
            r0.mo119677K(r5, r7)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_USER_AUTO_INCREMENT_ID_INT_SYNC
            r7 = -1
            int r0 = r0.mo119689j(r5, r7)
            java.lang.String r8 = "[onAccountInitialized] user auto increment id="
            if (r0 != r7) goto L_0x02b0
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            int r3 = r11.mo119689j(r3, r10)
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            r11.mo119677K(r5, r13)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r0)
            java.lang.String r0 = " userVersion="
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x02c2
        L_0x02b0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
        L_0x02c2:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_NEW_CGI_INT_SYNC
            int r0 = r0.mo119689j(r3, r10)
            r3 = 2
            if (r0 == r12) goto L_0x02dd
            java.lang.String r5 = "/cgi-bin/micromsg-bin"
            if (r0 == r3) goto L_0x02da
            je1.C9318i2.f29109a = r5
            goto L_0x02e1
        L_0x02da:
            je1.C9318i2.f29109a = r5
            goto L_0x02e1
        L_0x02dd:
            java.lang.String r5 = "/cgi-bin/mmfinder-bin"
            je1.C9318i2.f29109a = r5
        L_0x02e1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "config "
            r5.append(r8)
            r5.append(r0)
            r8 = 32
            r5.append(r8)
            java.lang.String r0 = je1.C9318i2.f29109a
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "Finder.FinderCgiConstants"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r24.zx0()
            java.util.HashMap<java.lang.String, fy3.l<android.content.Intent, rx3.b0>> r0 = com.tencent.p014mm.plugin.finder.shell.FinderShellInit.f81258a
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r0 == 0) goto L_0x0316
            com.tencent.mm.plugin.finder.shell.FinderShellInit$listener$1 r0 = com.tencent.p014mm.plugin.finder.shell.FinderShellInit.f81259b
            r0.alive()
            mp1.a r0 = new mp1.a
            r0.<init>()
        L_0x0316:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r0.mo119677K(r4, r15)
            java.lang.Class<f62.o0> r0 = f62.C31941o0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            f62.o0 r0 = (f62.C31941o0) r0
            r4 = 19
            com.tencent.mm.plugin.FinderCommonFeatureService$e0 r5 = new com.tencent.mm.plugin.FinderCommonFeatureService$e0
            r5.<init>()
            r0.mo57261vI(r4, r5)
            up1.c r0 = r24.Ex0()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f188252d
            java.lang.String r4 = "DELETE FROM FinderAction WHERE actionType = 1"
            java.lang.String r5 = "FinderAction"
            boolean r0 = r0.execSQL(r5, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "cleanCanRemoveFeed ret"
            r5.append(r8)
            r5.append(r0)
            r8 = 32
            r5.append(r8)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            java.lang.String r4 = "Finder.FinderActionStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            boolean r0 = r24.mo76873sF()
            if (r0 == 0) goto L_0x036e
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.FinderCommonFeatureService$f0 r4 = com.tencent.p014mm.plugin.FinderCommonFeatureService.C1317f0.f10440d
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183875f(r4)
        L_0x036e:
            fe1.d$b r0 = fe1.C58961d.f168673a
            fe1.q r4 = r0.mo84158e()
            r0.mo84165n(r4)
            vq1.w$a r0 = vq1.C65866w.f189406g
            com.tencent.mm.app.AppForegroundDelegate r0 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            com.tencent.mm.plugin.FinderCommonFeatureService$b r4 = r1.f157795W
            r0.mo174208a(r4)
            com.tencent.mm.app.t0 r0 = com.tencent.p014mm.app.C80617t0.m98255d()
            com.tencent.mm.plugin.FinderCommonFeatureService$c0 r4 = r1.f157796X
            r0.mo112357c(r4)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = cm1.C55012e1.f154471g
            r0.sendEmptyMessage(r14)
            vp1.w r4 = vp1.C14947w.f40984a
            te3.vi1 r0 = new te3.vi1
            r0.<init>()
            java.lang.String r5 = r4.mo13998a()
            byte[] r5 = com.tencent.p014mm.vfs.C86013q1.m106433O(r5, r10, r7)
            if (r5 != 0) goto L_0x03a0
            goto L_0x03af
        L_0x03a0:
            r0.parseFrom(r5)     // Catch:{ Exception -> 0x03a4 }
            goto L_0x03b0
        L_0x03a4:
            r0 = move-exception
            r5 = r0
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r10] = r5
            java.lang.String r5 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r15, r0)
        L_0x03af:
            r0 = 0
        L_0x03b0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "[setup] isExist="
            r5.append(r7)
            java.lang.String r7 = r4.mo13998a()
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            r5.append(r7)
            java.lang.String r7 = " touchFile="
            r5.append(r7)
            java.lang.String r4 = r4.mo13998a()
            r5.append(r4)
            java.lang.String r4 = " info: "
            r5.append(r4)
            if (r0 == 0) goto L_0x03df
            int r4 = r0.f143491e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x03e0
        L_0x03df:
            r4 = 0
        L_0x03e0:
            r5.append(r4)
            r4 = 32
            r5.append(r4)
            if (r0 == 0) goto L_0x03f1
            long r7 = r0.f143490d
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            goto L_0x03f2
        L_0x03f1:
            r4 = 0
        L_0x03f2:
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "Finder.PageRecovery"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            if (r0 == 0) goto L_0x0422
            int r4 = r0.f143491e
            if (r4 < r3) goto L_0x0406
            r4 = 1
            goto L_0x0407
        L_0x0406:
            r4 = 0
        L_0x0407:
            if (r4 == 0) goto L_0x040b
            r4 = r0
            goto L_0x040c
        L_0x040b:
            r4 = 0
        L_0x040c:
            if (r4 == 0) goto L_0x0422
            vp1.o$a r5 = vp1.C14937o.f40972a
            r5.mo13982c()
            vp1.w r5 = vp1.C14947w.f40984a
            java.lang.String r5 = r5.mo13998a()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
            r4.f143491e = r10
            r7 = 0
            r4.f143490d = r7
        L_0x0422:
            vp1.v r4 = new vp1.v
            r4.<init>(r0)
            com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler.addOnUncaughtExceptionListener(r4)
            com.tencent.mm.plugin.finder.utils.FinderFolderClearManager r0 = com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager.f161637a
            r0.getClass()
            er1.s0 r0 = er1.C58774s0.f168275d
            r4 = 0
            o40.C61926c.m72658C(r4, r0, r12, r4)
            com.tencent.mm.plugin.FinderCommonFeatureService$g0 r0 = new com.tencent.mm.plugin.FinderCommonFeatureService$g0
            r0.<init>(r1)
            o40.C61926c.m72656A(r4, r0)
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r4 = r0.mo62446e(r6)
            java.lang.Class<com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore> r5 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r5)
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore r4 = (com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) r4
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore$mainUiIndexChangeListener$1 r5 = r4.f160335g
            r5.alive()
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r5 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12957c
            o40.C61926c.m72694s(r5, r4)
            com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner r5 = com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE
            do1.c r7 = new do1.c
            r7.<init>(r4)
            r5.addLifecycleCallback((com.tencent.matrix.lifecycle.C80403e) r7)
            do1.d r5 = new do1.d
            r5.<init>(r4)
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12968n
            o40.C61926c.m72694s(r4, r5)
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12969o
            o40.C61926c.m72694s(r4, r5)
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12971q
            o40.C61926c.m72694s(r4, r5)
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$d r4 = com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.f159083D
            java.lang.Class<pn.e> r4 = p646pn.C110234e.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            pn.e r4 = (p646pn.C110234e) r4
            xv0.e r4 = r4.mo161399pY()
            if (r4 == 0) goto L_0x048a
            xv0.h r5 = com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.f159086G
            r7 = 32
            r4.mo149101T(r7, r5)
        L_0x048a:
            yl1.a$b r4 = yl1.C66663a.f191683x
            r4.getClass()
            java.lang.Class<wx2.d> r4 = wx2.C66204d.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            wx2.d r4 = (wx2.C66204d) r4
            yl1.a$a r5 = yl1.C66663a.f191684y
            r7 = 22
            r4.Vr0(r7, r5)
            bl3.r$a r0 = r0.mo62446e(r6)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM> r4 = com.tencent.p014mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r4)
            com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM r0 = (com.tencent.p014mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) r0
            r0.getClass()
            java.lang.String r4 = "FinderTeenModeLimitVM"
            java.lang.String r5 = "FinderTeenModeLimitVM init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r4 = r4.getApplicationContext()
            boolean r5 = r4 instanceof android.app.Application
            if (r5 == 0) goto L_0x04c3
            android.app.Application r4 = (android.app.Application) r4
            goto L_0x04c4
        L_0x04c3:
            r4 = 0
        L_0x04c4:
            if (r4 == 0) goto L_0x04cb
            com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM$a r5 = r0.f18826o
            r4.registerActivityLifecycleCallbacks(r5)
        L_0x04cb:
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AgreeAuthorizationChangeEvent> r0 = r0.f18827p
            r0.alive()
            java.lang.Class<ky2.i> r0 = ky2.C10432i.class
            di3.d r4 = di3.C86312j.m106911c(r0)
            ky2.i r4 = (ky2.C10432i) r4
            jq1.b r5 = new jq1.b
            r5.<init>()
            r7 = 4
            r4.mo10745WR(r7, r5)
            di3.d r4 = di3.C86312j.m106911c(r0)
            ky2.i r4 = (ky2.C10432i) r4
            jq1.c r5 = new jq1.c
            r5.<init>()
            r8 = 6
            r4.mo10745WR(r8, r5)
            di3.d r4 = di3.C86312j.m106911c(r0)
            ky2.i r4 = (ky2.C10432i) r4
            jq1.c r5 = new jq1.c
            r5.<init>()
            r11 = 5
            r4.mo10745WR(r11, r5)
            di3.d r4 = di3.C86312j.m106911c(r0)
            ky2.i r4 = (ky2.C10432i) r4
            ts1.a r5 = new ts1.a
            r5.<init>()
            r4.Xp0(r7, r5)
            di3.d r4 = di3.C86312j.m106911c(r0)
            ky2.i r4 = (ky2.C10432i) r4
            ts1.a r5 = new ts1.a
            r5.<init>()
            r4.Xp0(r8, r5)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ky2.i r0 = (ky2.C10432i) r0
            ts1.a r4 = new ts1.a
            r4.<init>()
            r0.Xp0(r11, r4)
            gr1.r0 r0 = gr1.C45946r0.f123945a
            java.lang.Class<rz.q> r4 = p682rz.C36594q.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            rz.q r4 = (p682rz.C36594q) r4
            boolean r4 = r4.mo60733UY(r7)
            gr1.C45946r0.f123955k = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "setup isSupportHevc:"
            r4.append(r5)
            boolean r5 = gr1.C45946r0.f123955k
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Finder.FinderNetworkStatusStatistic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            gr1.t0 r4 = gr1.C45951t0.f123959d
            r5 = 0
            o40.C61926c.m72658C(r5, r4, r12, r5)
            com.tencent.mm.app.AppForegroundDelegate r4 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            gr1.r0$a r5 = gr1.C45946r0.f123954j
            r4.mo174208a(r5)
            r0.mo71350d()
            di3.d r0 = di3.C86312j.m106911c(r2)
            yy.h r0 = (p773yy.C66708h) r0
            po1.c r4 = new po1.c
            r4.<init>()
            java.lang.String r5 = "5"
            r0.be0(r5, r4)
            di3.d r0 = di3.C86312j.m106911c(r2)
            yy.h r0 = (p773yy.C66708h) r0
            po1.e r2 = new po1.e
            r2.<init>()
            java.lang.String r4 = "14"
            r0.be0(r4, r2)
            er1.w3 r0 = er1.C58784w3.f168295a
            r0.getClass()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_OLD_SESSION_HAS_TRANS_V2_BOOLEAN_SYNC
            boolean r0 = r0.mo119686g(r2, r10)
            up1.f r4 = up1.C37521f.f99374d
            r4.getClass()
            re1.a r4 = up1.C37521f.f99449l5
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r5 = er1.C58784w3.f168296b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[checkOldSessionInfo] hasTrans:"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r8 = " , ignoreHasTrans:"
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            if (r0 == 0) goto L_0x05c8
            if (r4 == 0) goto L_0x0673
        L_0x05c8:
            java.lang.String r0 = "[checkOldSessionInfo] begin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            long r7 = android.os.SystemClock.uptimeMillis()
            gy3.a0 r0 = new gy3.a0
            r0.<init>()
            di3.d r4 = di3.C86312j.m106911c(r6)
            com.tencent.mm.plugin.FinderCommonFeatureService r4 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r4
            up1.l0 r4 = r4.mo76736Au()
            boolean r4 = r4.mo73555Js()
            r0.f27482d = r4
            gy3.a0 r4 = new gy3.a0
            r4.<init>()
            di3.d r6 = di3.C86312j.m106911c(r6)
            com.tencent.mm.plugin.FinderCommonFeatureService r6 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r6
            up1.j r6 = r6.mo76776L4()
            boolean r6 = r6.m40()
            r4.f27482d = r6
            long r13 = android.os.SystemClock.uptimeMillis()
            long r13 = r13 - r7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "[checkOldSessionInfo] end,duration = "
            r6.append(r7)
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            ft1.a r5 = ft1.C59319a.f169618b
            r6 = 10000(0x2710, double:4.9407E-320)
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x061f
            r17 = 1
            goto L_0x0621
        L_0x061f:
            r17 = 0
        L_0x0621:
            r18 = 0
            r19 = 0
            r20 = 0
            er1.h4 r6 = new er1.h4
            r6.<init>(r13)
            r22 = 28
            r23 = 0
            java.lang.String r16 = "transOldFinderMsgSessionInfo"
            r15 = r5
            r21 = r6
            o40.C11348f.C11349a.m11177a(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r6 = r0.f27482d
            if (r6 == 0) goto L_0x0644
            boolean r6 = r4.f27482d
            if (r6 == 0) goto L_0x0644
            r17 = 1
            goto L_0x0646
        L_0x0644:
            r17 = 0
        L_0x0646:
            r18 = 0
            r19 = 0
            r20 = 0
            er1.i4 r6 = new er1.i4
            r6.<init>(r0, r4)
            r22 = 28
            r23 = 0
            java.lang.String r16 = "transOldFinderMsgSessionInfo-result"
            r15 = r5
            r21 = r6
            o40.C11348f.C11349a.m11178b(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r0 = r0.f27482d
            if (r0 == 0) goto L_0x0673
            boolean r0 = r4.f27482d
            if (r0 == 0) goto L_0x0673
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r0.mo119677K(r2, r4)
        L_0x0673:
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r2 = di3.C86312j.m106911c(r0)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_finder_posting_folder_vfsstrategy_size
            r5 = 512(0x200, float:7.175E-43)
            int r2 = r2.mo58779Qe(r4, r5)
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_finder_posting_folder_vfsstrategy_time
            int r0 = r0.mo58779Qe(r4, r3)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r4 = "FINDER_FOLDER_MAX_SIZE_MB"
            r3.putInt(r4, r2)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r4 = "FINDER_FOLDER_LRU_EXPIRE_DAY"
            r3.putInt(r4, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "refreshXLabConfigToMMKV size:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ", time:"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99577z5
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r12) goto L_0x06e5
            qt1.C63329b.f179695b = r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "enableDebug "
            r0.append(r2)
            boolean r2 = qt1.C63329b.f179695b
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Finder.LiveTracker"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x06e5:
            java.lang.Class<rw.p> r0 = p232rw.C77573p.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            rw.p r0 = (p232rw.C77573p) r0
            java.lang.Class<wc1.u> r2 = wc1.C15125u.class
            r0.mo60533Ks(r2)
            ep1.c r0 = ep1.C58661c.f167935f
            r0.getClass()
            java.lang.String r0 = "FinderJumpDataManager"
            java.lang.String r2 = "register "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.FinderCommonFeatureService$h0 r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.C29071h0.f79621d
            o40.C61926c.m72668M(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService$i0 r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.C1320i0.f10448a
            java.util.List<ke3.b$f> r2 = ke3.C88144b.f254912b
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            r2.add(r0)
            com.tencent.mm.plugin.finder.extension.reddot.n0 r3 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12955a
            zc1.b r0 = zc1.C66785b.f191882e
            java.lang.String r4 = r0.mo90662O5()
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.m2357g(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.onAccountInitialized(android.content.Context):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void onAccountReleased(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.Class<yy.h> r0 = p773yy.C66708h.class
            java.lang.Class<ry0.f> r1 = ry0.C13606f.class
            java.lang.String r2 = "context"
            gy3.C87412m.m108594g(r7, r2)
            java.lang.String r2 = "Finder.FinderCommonFeatureService"
            java.lang.String r3 = "onAccountRelease"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            super.onAccountReleased(r7)
            cm1.e1 r7 = cm1.C55012e1.f154468d
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r3 = 3520(0xdc0, float:4.933E-42)
            r2.mo123470p(r3, r7)
            ob0.b0 r7 = f40.C86709a0.m107524d()
            r2 = 665(0x299, float:9.32E-43)
            r7.mo123470p(r2, r6)
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r7 = r6.f157783J
            if (r7 == 0) goto L_0x0034
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotExpiredHandler r7 = r7.f158531h
            if (r7 == 0) goto L_0x0034
            com.tencent.mm.app.AppForegroundDelegate r2 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            r2.mo174215k(r7)
        L_0x0034:
            com.tencent.mm.app.AppForegroundDelegate r7 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            com.tencent.mm.plugin.FinderCommonFeatureService$b r2 = r6.f157795W
            r7.mo174215k(r2)
            com.tencent.mm.app.t0 r2 = com.tencent.p014mm.app.C80617t0.m98255d()
            com.tencent.mm.plugin.FinderCommonFeatureService$c0 r3 = r6.f157796X
            r2.mo112358f(r3)
            di3.d r2 = di3.C86312j.m106911c(r1)
            ry0.f r2 = (ry0.C13606f) r2
            r3 = 1
            r2.wh0(r3)
            di3.d r1 = di3.C86312j.m106911c(r1)
            ry0.f r1 = (ry0.C13606f) r1
            r2 = 5
            r1.wh0(r2)
            java.lang.Class<ln.f> r1 = p196ln.C76705f.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ln.f r1 = (p196ln.C76705f) r1
            vd3.r$b r1 = r1.mo106829VT()
            boolean r2 = r1 instanceof vd3.C78394f
            if (r2 == 0) goto L_0x0087
            vd3.f r1 = (vd3.C78394f) r1
            java.lang.String r2 = "@findermsg"
            java.util.HashMap<java.lang.String, vd3.r$b> r4 = r1.f229713e
            monitor-enter(r4)
            java.util.HashMap<java.lang.String, vd3.r$b> r5 = r1.f229713e     // Catch:{ all -> 0x0084 }
            r5.remove(r2)     // Catch:{ all -> 0x0084 }
            monitor-exit(r4)     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "@finder"
            java.util.HashMap<java.lang.String, vd3.r$b> r5 = r1.f229713e
            monitor-enter(r5)
            java.util.HashMap<java.lang.String, vd3.r$b> r1 = r1.f229713e     // Catch:{ all -> 0x0081 }
            r1.remove(r2)     // Catch:{ all -> 0x0081 }
            monitor-exit(r5)     // Catch:{ all -> 0x0081 }
            goto L_0x0087
        L_0x0081:
            r7 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0081 }
            throw r7
        L_0x0084:
            r7 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0084 }
            throw r7
        L_0x0087:
            di3.d r1 = di3.C86312j.m106911c(r0)
            yy.h r1 = (p773yy.C66708h) r1
            java.lang.String r2 = "5"
            r1.M20(r2)
            di3.d r0 = di3.C86312j.m106911c(r0)
            yy.h r0 = (p773yy.C66708h) r0
            java.lang.String r1 = "14"
            r0.M20(r1)
            bl3.r r0 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r1 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r0 = r0.mo62446e(r1)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM> r1 = com.tencent.p014mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM r0 = (com.tencent.p014mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) r0
            r0.getClass()
            java.lang.String r1 = "FinderTeenModeLimitVM"
            java.lang.String r2 = "FinderTeenModeLimitVM release"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            boolean r2 = r1 instanceof android.app.Application
            r4 = 0
            if (r2 == 0) goto L_0x00c7
            android.app.Application r1 = (android.app.Application) r1
            goto L_0x00c8
        L_0x00c7:
            r1 = r4
        L_0x00c8:
            if (r1 == 0) goto L_0x00cf
            com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM$a r2 = r0.f18826o
            r1.unregisterActivityLifecycleCallbacks(r2)
        L_0x00cf:
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AgreeAuthorizationChangeEvent> r0 = r0.f18827p
            r0.dead()
            gr1.r0 r0 = gr1.C45946r0.f123945a
            java.lang.String r0 = "Finder.FinderNetworkStatusStatistic"
            java.lang.String r1 = "release"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            gr1.s0 r0 = gr1.C45950s0.f123958d
            o40.C61926c.m72658C(r4, r0, r3, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "stopRecordNetWorkStatus recordNetworkStatusRunnable:"
            r0.append(r1)
            java.lang.Runnable r1 = gr1.C45946r0.f123953i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderNetworkStatusStatistic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            gr1.C45946r0.f123953i = r4
            gr1.r0$a r0 = gr1.C45946r0.f123954j
            r7.mo174215k(r0)
            zh3.f[] r7 = r6.f157798g
            r0 = 0
            r1 = r7[r0]
            if (r1 == 0) goto L_0x011c
            monitor-enter(r7)
            r1 = r7[r0]     // Catch:{ all -> 0x0119 }
            if (r1 == 0) goto L_0x0115
            r1.mo124432b()     // Catch:{ all -> 0x0119 }
            r7[r0] = r4     // Catch:{ all -> 0x0119 }
            monitor-exit(r7)
            goto L_0x0123
        L_0x0115:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0119 }
            monitor-exit(r7)
            goto L_0x011c
        L_0x0119:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x011c:
            java.lang.String r7 = "Finder.FinderCommonFeatureService"
            java.lang.String r0 = "releaseDB: inside lock: dbHolder does not contain a db, return directly."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
        L_0x0123:
            com.tencent.mm.plugin.finder.feed.model.e r7 = com.tencent.p014mm.plugin.finder.feed.model.C55771j.f158788a
            com.tencent.mm.plugin.finder.feed.model.s0 r7 = r7.f158760a
            com.tencent.mm.plugin.finder.feed.model.v0 r7 = (com.tencent.p014mm.plugin.finder.feed.model.C55780v0) r7
            monitor-enter(r7)
            java.lang.String r0 = "Finder.LRUCacheHelper"
            java.lang.String r1 = "clearExpiredCache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x01cc }
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.Long, com.tencent.mm.plugin.finder.feed.model.u0> r0 = r7.f158816a     // Catch:{ all -> 0x01cc }
            r0.evictAll()     // Catch:{ all -> 0x01cc }
            monitor-exit(r7)
            com.tencent.mm.plugin.finder.feed.model.e r7 = com.tencent.p014mm.plugin.finder.feed.model.C55771j.f158789b
            com.tencent.mm.plugin.finder.feed.model.s0 r7 = r7.f158760a
            com.tencent.mm.plugin.finder.feed.model.v0 r7 = (com.tencent.p014mm.plugin.finder.feed.model.C55780v0) r7
            monitor-enter(r7)
            java.lang.String r0 = "Finder.LRUCacheHelper"
            java.lang.String r1 = "clearExpiredCache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x01c9 }
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.Long, com.tencent.mm.plugin.finder.feed.model.u0> r0 = r7.f158816a     // Catch:{ all -> 0x01c9 }
            r0.evictAll()     // Catch:{ all -> 0x01c9 }
            monitor-exit(r7)
            bl3.p r7 = r6.f173419f
            bl3.a0 r7 = r7.f152776f
            r7.mo62188a()
            com.tencent.mm.plugin.FinderCommonFeatureService$entryConfigChangeListener$1 r7 = r6.f157792T
            r7.dead()
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$d r7 = com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.f159083D
            java.lang.Class<pn.e> r7 = p646pn.C110234e.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            pn.e r7 = (p646pn.C110234e) r7
            xv0.e r7 = r7.mo161399pY()
            if (r7 == 0) goto L_0x016e
            r0 = 32
            xv0.h r1 = com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.f159086G
            r7.mo149089G(r0, r1)
        L_0x016e:
            yl1.a$b r7 = yl1.C66663a.f191683x
            r7.getClass()
            java.lang.Class<wx2.d> r7 = wx2.C66204d.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            wx2.d r7 = (wx2.C66204d) r7
            yl1.a$a r0 = yl1.C66663a.f191684y
            r1 = 22
            r7.v50(r1, r0)
            java.lang.Class<ht1.t3> r7 = ht1.C60204t3.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ht1.t3 r7 = (ht1.C60204t3) r7
            r7.mo78748Pm(r3)
            mr1.b r7 = r6.Fx0()
            r7.getClass()
            java.lang.String r7 = "FinderNetworkFlowReport"
            java.lang.String r0 = "onDetach"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            a14.n0 r7 = r6.f157785L
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = " onCleared."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 2
            a14.C53930o0.m60557d(r7, r0, r4, r1, r4)
            a14.n0 r7 = r6.f157786M
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r2 = " onCleared."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            a14.C53930o0.m60557d(r7, r0, r4, r1, r4)
            return
        L_0x01c9:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x01cc:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.onAccountReleased(android.content.Context):void");
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        mo58017LR();
        C54534b bVar = C54534b.f152890d;
        Log.m105924i("MicroMsg.FinderLifecycleCallback", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        Context context2 = MMApplicationContext.getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Application");
        ((Application) context2).registerActivityLifecycleCallbacks(bVar);
        C54534b.f152895i.add(new C54542g());
        C66836c.f191967a = context;
        C66836c.f191968b = false;
        C59698c cVar = C59698c.f170541a;
        Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(C59698c.f170546f);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar != null && yVar.getType() == 3512 && i == 0 && i2 == 0) {
            C114799u reqResp = yVar.getReqResp();
            C87412m.m108592e(reqResp, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
            C47465a aVar = ((C47350c) reqResp).f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetUserResponse");
            LinkedList<FinderContact> linkedList = ((C48893bq0) aVar).f131256d;
            if (linkedList != null) {
                for (FinderContact m : linkedList) {
                    C58961d.C58963b.m68837m(C58961d.f168673a, m, false, 2, (Object) null);
                }
            }
        }
    }

    /* renamed from: qD */
    public void mo76867qD(Context context, Intent intent, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        intent.setClass(context, FinderRingtoneSearchUI.class);
        if (context instanceof Activity) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            aVar.mo10233c(intent);
            C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/plugin/FinderCommonFeatureService", "enterFinderRingtoneSearchUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        Log.m105928w("Finder.FinderCommonFeatureService", "context is not activity! cannot jump to RingtoneSearchUI!");
    }

    /* renamed from: qS */
    public String mo76868qS(int i) {
        if (i <= 99990) {
            return i > 9990 ? C58784w3.m68432N1(i) : String.valueOf(i);
        }
        String string = MMApplicationContext.getContext().getString(C0966R.string.dcs);
        C87412m.m108593f(string, "getContext().getString(R…undred_thousand_ringtone)");
        return string;
    }

    /* renamed from: qi */
    public Activity mo76869qi() {
        C58791y.f168321a.getClass();
        WeakReference<Activity> weakReference = C58791y.f168323c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: qp */
    public void mo76870qp(String str, int i, boolean z) {
        FinderObject finderObject;
        C87412m.m108594g(str, "mpPassInfo");
        try {
            C51236sf1 sf12 = new C51236sf1();
            sf12.parseFrom(Base64.decode(str, 0));
            FinderItem f = C65834e.f189316a.mo89872f(sf12.f141473e);
            if (f == null || (finderObject = f.getFeedObject()) == null) {
                String str2 = sf12.f141473e;
                String str3 = sf12.f141472d;
                if (str3 == null) {
                    str3 = "";
                }
                finderObject = mo76838cb(0, str2, i, str3);
            }
            if (finderObject != null) {
                C65854g gVar = C65854g.f189373e;
                C65854g gVar2 = C65854g.f189373e;
                FinderItem a = FinderItem.Companion.mo79056a(finderObject, 0);
                C49712hj1 hj12 = new C49712hj1();
                hj12.f134675i = i;
                C13598b0 b0Var = C13598b0.f38549a;
                C65854g.m77575a(gVar2, a, z, 2, (C65866w.C14969b) null, hj12, 0, 40, (Object) null);
            }
        } catch (Throwable th) {
            Log.m105928w("Finder.FinderCommonFeatureService", "favFeed e:" + th);
        }
    }

    /* renamed from: s3 */
    public void mo76871s3(Activity activity, Intent intent) {
        C87412m.m108594g(activity, "context");
        ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13286s3(activity, intent);
    }

    public String s40(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
        C64897zv2 zv22 = new C64897zv2();
        try {
            zv22.parseFrom(multiTaskInfo.field_data);
        } catch (Throwable th) {
            Log.m105921e("Finder.FinderCommonFeatureService", "MegaVideoFloatBallInfo parse fail", th);
        }
        String str = zv22.f186892q;
        return str == null ? "" : str;
    }

    /* renamed from: sF */
    public boolean mo76873sF() {
        return C16055a.f43185a.mo14671a();
    }

    /* renamed from: sQ */
    public C117747y mo76874sQ(String str) {
        C87412m.m108594g(str, "qrUrl");
        return new C46118w5(str);
    }

    /* renamed from: sW */
    public void mo76875sW(long j, String str, String str2, String str3, String str4, long j2) {
        long j3 = j;
        String str5 = str2;
        String str6 = str3;
        String str7 = str4;
        String str8 = str;
        C87412m.m108594g(str8, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str5, "coverUrl");
        C87412m.m108594g(str6, "nickName");
        C87412m.m108594g(str7, "headUrl");
        C64897zv2 zv22 = new C64897zv2();
        if (Util.isNullOrNil(str)) {
            str8 = MMApplicationContext.getContext().getResources().getString(C0966R.string.m_1, new Object[]{str6});
        }
        C87412m.m108593f(str8, "if (Util.isNullOrNil(tit…   else\n            title");
        zv22.f186885g = 0;
        LinkedList<C48693ac1> linkedList = zv22.f186883e;
        if (linkedList != null) {
            linkedList.clear();
        }
        LinkedList<FinderObject> linkedList2 = zv22.f186888j;
        if (linkedList2 != null) {
            linkedList2.clear();
        }
        zv22.f186891p = j3;
        zv22.f186892q = str5;
        FinderItem e = C65834e.f189316a.mo89871e(j3);
        if (e != null) {
            LinkedList<FinderObject> linkedList3 = zv22.f186888j;
            if (linkedList3 != null) {
                linkedList3.add(e.getFeedObject());
            }
            C64827xe1 xe12 = e.getFeedObject().client_local_buffer;
            zv22.f186889n = xe12 != null ? xe12.f186293d : C31543z5.m39453c();
            int i = e.getFeedObject().urlValidDuration;
        }
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        C66663a aVar = new C66663a(context, (C107028a) null);
        aVar.mo35809D(22, ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83357yP());
        long c = C31543z5.m39453c();
        MultiTaskInfo multiTaskInfo = aVar.f326418a;
        if (multiTaskInfo != null) {
            multiTaskInfo.field_id = C61926c.m72691p(j);
            multiTaskInfo.mo80305m2().f183752e = str8;
            multiTaskInfo.mo80305m2().f183756i = str7;
            multiTaskInfo.field_data = zv22.toByteArray();
            multiTaskInfo.mo80305m2().f183751d = str6;
            multiTaskInfo.mo80305m2().f183754g = (int) j2;
            multiTaskInfo.field_createTime = c;
        }
        aVar.mo160090r((Bitmap) null, false);
        int us02 = ((C105919k) C86312j.m106911c(C105919k.class)).us0(C61926c.m72691p(j));
        C7435f2 f2Var = C7435f2.f25626a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("feedid", C61926c.m72691p(j));
        jSONObject.put("feed_index", us02 + 1);
        jSONObject.put("import_time", c);
        C13598b0 b0Var = C13598b0.f38549a;
        f2Var.mo8577a((C49712hj1) null, "float_feed_import", 1, jSONObject);
    }

    /* renamed from: sZ */
    public void mo76876sZ(int i, Intent intent) {
        if ((i == 2 || i == 4) && intent != null) {
            intent.putExtra("enter_finder_home_ui_type", i);
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_REPORT_SDK_SPECIAL_SOURCE_INT_SYNC, Integer.valueOf(i));
    }

    public void sv0(String str, C9487b<C9486a> bVar, C32226l<? super fp4, C13598b0> lVar, C32226l<? super Integer, C13598b0> lVar2, boolean z, int i) {
        Integer num;
        C87412m.m108594g(bVar, "lifeCycle");
        C87412m.m108594g(lVar, "onSuccess");
        C87412m.m108594g(lVar2, "onError");
        C45690w4 w4Var = C45690w4.f123497a;
        if (str == null || Util.isNullOrNil(str)) {
            lVar2.invoke(-1000);
            return;
        }
        if (C87412m.m108589b(str, C75592q0.m90789s()) || (num = C45690w4.f123499c.get(str)) == null) {
            num = 0;
        }
        int intValue = num.intValue();
        if (z) {
            intValue = 0;
        }
        if (C31543z5.m39455e() - intValue > C45690w4.f123500d) {
            C89059e i2 = new C46533r1(str, i, "", 0).mo9225i();
            i2.mo11397F(bVar);
            i2.mo123420E(new C45689t4(str, new C31685u4(lVar, lVar2), new C7904v4(lVar2)));
            return;
        }
        fp4 fp4 = C45690w4.f123498b.get(str);
        if (fp4 != null) {
            lVar.invoke(fp4);
        } else {
            lVar2.invoke(-100);
        }
    }

    /* renamed from: tN */
    public C60183l5 mo76878tN(Context context, String str, long j, DialogInterface.OnCancelListener onCancelListener) {
        C87412m.m108594g(context, "context");
        C9247b bVar = new C9247b();
        bVar.f28992c = j;
        new WeakReference(context);
        C9252f fVar = new C9252f();
        if (str != null) {
            fVar.f28996c = str;
        }
        fVar.f28997d = onCancelListener;
        fVar.f28999a = new WeakReference<>(context);
        bVar.f28991b = fVar;
        return bVar;
    }

    /* renamed from: tO */
    public boolean mo76879tO() {
        return C16055a.f43185a.mo14671a();
    }

    /* renamed from: tQ */
    public void mo76880tQ(Context context, Intent intent, int i) {
        C87412m.m108594g(context, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(intent, "intent");
        ((C58684b) C86312j.m106911c(C58684b.class)).Jx0(context, intent, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: tZ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo76881tZ(android.content.Context r12, pe3.C89349b r13, boolean r14, wx3.C15601d<? super te3.C51398th3> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.tencent.p014mm.plugin.FinderCommonFeatureService.C55420u
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.tencent.mm.plugin.FinderCommonFeatureService$u r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService.C55420u) r0
            int r1 = r0.f157890g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f157890g = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.FinderCommonFeatureService$u r0 = new com.tencent.mm.plugin.FinderCommonFeatureService$u
            r0.<init>(r11, r15)
        L_0x0018:
            r5 = r0
            java.lang.Object r15 = r5.f157888e
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f157890g
            java.lang.String r8 = "Finder.FinderCommonFeatureService"
            r2 = 1
            r9 = 0
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.lang.Object r12 = r5.f157887d
            gy3.f0 r12 = (gy3.C8479f0) r12
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ d -> 0x002f }
            goto L_0x009c
        L_0x002f:
            r13 = move-exception
            goto L_0x00a1
        L_0x0032:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "#getProduct paymentBuff="
            r15.append(r1)
            r15.append(r13)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r15)
            if (r13 != 0) goto L_0x0054
            return r9
        L_0x0054:
            gy3.f0 r15 = new gy3.f0
            r15.<init>()
            if (r14 == 0) goto L_0x0073
            T r14 = r15.f27484d
            qo3.i0 r14 = (qo3.C89779i0) r14
            if (r14 == 0) goto L_0x0064
            r14.dismiss()
        L_0x0064:
            r14 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r14 = r12.getString(r14)
            r1 = 0
            r3 = 3
            qo3.i0 r12 = qo3.C89779i0.m112248e(r12, r14, r1, r3, r9)
            r15.f27484d = r12
        L_0x0073:
            te3.r01 r12 = new te3.r01     // Catch:{ d -> 0x009f }
            r12.<init>()     // Catch:{ d -> 0x009f }
            je1.h2 r14 = je1.C46523h2.f125330a     // Catch:{ d -> 0x009f }
            r1 = 4617(0x1209, float:6.47E-42)
            te3.ig0 r14 = r14.mo71859a(r1)     // Catch:{ d -> 0x009f }
            r12.f140642d = r14     // Catch:{ d -> 0x009f }
            r12.f140643e = r13     // Catch:{ d -> 0x009f }
            ob0.b r1 = r12.mo73353b()     // Catch:{ d -> 0x009f }
            r12 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f157887d = r15     // Catch:{ d -> 0x009f }
            r5.f157890g = r2     // Catch:{ d -> 0x009f }
            r2 = r12
            java.lang.Object r12 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ d -> 0x009f }
            if (r12 != r0) goto L_0x0099
            return r0
        L_0x0099:
            r10 = r15
            r15 = r12
            r12 = r10
        L_0x009c:
            te3.s01 r15 = (te3.C51183s01) r15     // Catch:{ d -> 0x002f }
            goto L_0x00b6
        L_0x009f:
            r13 = move-exception
            r12 = r15
        L_0x00a1:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "#getProduct FinderLiveGetPaymentItemsRequest fail. "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r13)
            r15 = r9
        L_0x00b6:
            T r13 = r12.f27484d
            qo3.i0 r13 = (qo3.C89779i0) r13
            if (r13 == 0) goto L_0x00bf
            r13.dismiss()
        L_0x00bf:
            r12.f27484d = r9
            if (r15 == 0) goto L_0x00ce
            java.util.LinkedList<te3.th3> r12 = r15.f141245d
            if (r12 == 0) goto L_0x00ce
            java.lang.Object r12 = sx3.C110818d0.m150916N(r12)
            r9 = r12
            te3.th3 r9 = (te3.C51398th3) r9
        L_0x00ce:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.mo76881tZ(android.content.Context, pe3.b, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: tg */
    public void mo76882tg(String str, View view) {
        C87412m.m108594g(view, "qImageView");
        C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(str, C27696y.RAW_IMAGE));
        C55401b0 b0Var = new C55401b0(view);
        a.getClass();
        a.f291320d = b0Var;
        a.mo85951a();
    }

    public boolean u60() {
        C66785b bVar = C66785b.f191882e;
        String O5 = bVar.mo90662O5();
        if (Util.isNullOrNil(bVar.mo90662O5())) {
            return false;
        }
        return !C14937o.f40972a.mo13988j(O5, 1).isEmpty();
    }

    /* renamed from: uQ */
    public C58010a mo76884uQ(FinderMedia finderMedia, long j, boolean z) {
        FinderMedia finderMedia2 = finderMedia;
        long j2 = j;
        C87412m.m108594g(finderMedia2, "finderMedia");
        C13601g gVar = C55046c.f154530a;
        C64689rq2 d = C65840n.m77568d(finderMedia);
        C62367r0 a = z ? C55041a.f154526a.mo76098a(j2, d, false) : ((C55048e) ((C36570n) C55046c.f154530a).getValue()).mo76105b(j2, d);
        String b = a.mo11841b();
        String path = a.getPath();
        String url = a.getUrl();
        String urlToken = a.getUrlToken();
        String decodeKey = a.getDecodeKey();
        long j3 = (long) finderMedia2.videoDuration;
        String g = a.mo87422g();
        C62344b0 b0Var = new C62344b0(d, C27696y.THUMB_IMAGE, (String) null, (String) null, 12, (C8480h) null);
        String path2 = b0Var.getPath();
        String thumbUrl = b0Var.getThumbUrl();
        String str = b;
        C58010a aVar = r6;
        String str2 = url;
        String thumbUrlToken = b0Var.getThumbUrlToken();
        C58010a aVar2 = new C58010a(str, path, str2, (int) finderMedia2.width, (int) finderMedia2.height);
        aVar.f165932d = decodeKey;
        aVar.f165931c = urlToken;
        aVar.f165935g = j3;
        aVar.f165930b = g;
        aVar.f165938j = path2;
        aVar.f165936h = thumbUrl;
        aVar.f165937i = thumbUrlToken;
        return aVar;
    }

    /* renamed from: uf */
    public C8806u4 mo76885uf() {
        return C7827l3.f26365a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r26 == 11) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
        if (r2 == 8) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ui0(android.view.View r21, java.lang.Object r22, int r23, int r24, int r25, long r26, java.lang.String r28, int r29, boolean r30) {
        /*
            r20 = this;
            r1 = r21
            r0 = r23
            r2 = r29
            java.lang.Class<ht1.j5> r3 = ht1.C8777j5.class
            ak1.f0$q r4 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR
            r5 = 1
            int r7 = (r26 > r5 ? 1 : (r26 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0012
        L_0x0010:
            r11 = r4
            goto L_0x006d
        L_0x0012:
            ak1.f0$q r5 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD
            r6 = 2
            int r8 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x001c
        L_0x001a:
            r11 = r5
            goto L_0x006d
        L_0x001c:
            ak1.f0$q r5 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR
            r6 = 3
            int r8 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0025
            goto L_0x001a
        L_0x0025:
            ak1.f0$q r5 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_SINGLE_AVATAR
            r6 = 4
            int r8 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x002e
            goto L_0x001a
        L_0x002e:
            ak1.f0$q r5 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_FEED_CARD_AVATAR_LIVING
            r6 = 5
            int r8 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0037
            goto L_0x001a
        L_0x0037:
            ak1.f0$q r5 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_FEED_CARD_AVATAR
            r6 = 6
            int r8 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0040
            goto L_0x001a
        L_0x0040:
            ak1.f0$q r5 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM
            r6 = 7
            int r8 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0049
            goto L_0x001a
        L_0x0049:
            ak1.f0$q r5 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM_REAL
            r6 = 8
            int r8 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0052
            goto L_0x001a
        L_0x0052:
            ak1.f0$q r5 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_AVATAR_LIVING
            r6 = 9
            int r8 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x005b
            goto L_0x001a
        L_0x005b:
            ak1.f0$q r5 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_LIVE_FEED_AVATAR_LIVING
            r6 = 10
            int r8 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0064
            goto L_0x001a
        L_0x0064:
            ak1.f0$q r5 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_FEED_AVATAR_LIVING
            r6 = 11
            int r8 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0010
            goto L_0x001a
        L_0x006d:
            ak1.i r4 = ak1.C0075i.EVENT_ON_SCROLL
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 != r8) goto L_0x0077
        L_0x0075:
            r13 = r4
            goto L_0x0094
        L_0x0077:
            ak1.i r9 = ak1.C0075i.EVENT_ON_RESUME
            if (r2 != r7) goto L_0x007d
        L_0x007b:
            r13 = r9
            goto L_0x0094
        L_0x007d:
            ak1.i r9 = ak1.C0075i.EVENT_ON_PAUSE
            if (r2 != r6) goto L_0x0082
            goto L_0x007b
        L_0x0082:
            ak1.i r9 = ak1.C0075i.EVENT_ON_REFRESH
            if (r2 != r5) goto L_0x0087
            goto L_0x007b
        L_0x0087:
            ak1.i r9 = ak1.C0075i.EVENT_ON_SCROLL_HORIZONTAL
            r10 = 7
            if (r2 != r10) goto L_0x008d
            goto L_0x007b
        L_0x008d:
            ak1.i r9 = ak1.C0075i.EVENT_ON_DESTROY
            r10 = 8
            if (r2 != r10) goto L_0x0075
            goto L_0x007b
        L_0x0094:
            if (r1 == 0) goto L_0x00cb
            boolean r2 = r1 instanceof android.widget.AbsListView
            if (r2 != 0) goto L_0x00cb
            boolean r2 = r1 instanceof com.tencent.p014mm.pluginsdk.p133ui.tools.ChattingRecyclerView
            if (r2 != 0) goto L_0x00cb
            boolean r2 = r1 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerView
            if (r2 == 0) goto L_0x00a3
            goto L_0x00cb
        L_0x00a3:
            di3.d r0 = di3.C86312j.m106911c(r3)
            java.lang.String r2 = "getService(IHellLiveReport::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            r9 = r0
            ht1.j5 r9 = (ht1.C8777j5) r9
            boolean r0 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L_0x00b7
            r0 = r1
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            goto L_0x00b8
        L_0x00b7:
            r0 = 0
        L_0x00b8:
            r10 = r0
            gy3.C87412m.m108591d(r28)
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 112(0x70, float:1.57E-43)
            r19 = 0
            r12 = r28
            ht1.C8777j5.C8778a.m8602c(r9, r10, r11, r12, r13, r14, r15, r17, r18, r19)
            goto L_0x0100
        L_0x00cb:
            if (r0 == 0) goto L_0x00e2
            if (r0 == r8) goto L_0x00df
            if (r0 == r7) goto L_0x00dc
            if (r0 == r6) goto L_0x00d9
            if (r0 == r5) goto L_0x00d6
            return
        L_0x00d6:
            t91.c$b r0 = t91.C64208c.C64210b.EVENT_ON_DESTROY
            goto L_0x00e4
        L_0x00d9:
            t91.c$b r0 = t91.C64208c.C64210b.INVISIABLE_ON_PAUSE
            goto L_0x00e4
        L_0x00dc:
            t91.c$b r0 = t91.C64208c.C64210b.VISIABLE_ON_RESUME
            goto L_0x00e4
        L_0x00df:
            t91.c$b r0 = t91.C64208c.C64210b.INVISIABLE_ON_SCROLL
            goto L_0x00e4
        L_0x00e2:
            t91.c$b r0 = t91.C64208c.C64210b.VISIABLE_ON_SCROLL
        L_0x00e4:
            r4 = r0
            di3.d r0 = di3.C86312j.m106911c(r3)
            ht1.j5 r0 = (ht1.C8777j5) r0
            gy3.C87412m.m108591d(r28)
            r1 = r21
            r2 = r22
            r3 = r4
            r4 = r24
            r5 = r25
            r6 = r11
            r7 = r28
            r8 = r13
            r9 = r30
            r0.mo9600IK(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.ui0(android.view.View, java.lang.Object, int, int, int, long, java.lang.String, int, boolean):void");
    }

    /* renamed from: v1 */
    public void mo76887v1(Activity activity, Intent intent) {
        C87412m.m108594g(activity, "context");
        ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13290v1(activity, intent);
    }

    /* renamed from: vm */
    public void mo76888vm(Context context, String str) {
        C87412m.m108594g(context, "context");
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13295yB(context, (Intent) null, true);
    }

    /* renamed from: vp */
    public long mo76889vp() {
        return C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, 0);
    }

    /* renamed from: w4 */
    public FinderObject mo76890w4(long j, String str, int i) {
        return mo76777Li(j, str, i, true, false, "", (C60200t1.C60202b) null);
    }

    /* renamed from: w7 */
    public void mo76891w7(Activity activity, String str, C60216z4.C8821a<Integer> aVar, C60216z4.C8821a<Integer> aVar2, boolean z) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, "jsonStr");
        C87412m.m108594g(aVar, "didOpenCallback");
        C87412m.m108594g(aVar2, "failCallback");
        try {
            C46715z4.f125755a.mo71957a((MMActivity) activity, str, aVar, aVar2, z);
        } catch (Exception e) {
            Log.printErrStackTrace("Finder.FinderCommonFeatureService", e, "reserveChannelsLive exception", new Object[0]);
            aVar2.mo6382a(-1);
        }
    }

    public void wk0() {
        C66167g.f190173a.mo90233a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x03ae A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object wn0(android.content.Context r21, te3.C51398th3 r22, long r23, long r25, pe3.C89349b r27, java.lang.String r28, wx3.C15601d<? super rx3.C13605o<java.lang.Boolean, java.lang.Integer, java.lang.String>> r29) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r5 = r25
            r7 = r29
            boolean r8 = r7 instanceof com.tencent.p014mm.plugin.FinderCommonFeatureService.C55413m
            if (r8 == 0) goto L_0x001f
            r8 = r7
            com.tencent.mm.plugin.FinderCommonFeatureService$m r8 = (com.tencent.p014mm.plugin.FinderCommonFeatureService.C55413m) r8
            int r9 = r8.f157853r
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r9 & r10
            if (r11 == 0) goto L_0x001f
            int r9 = r9 - r10
            r8.f157853r = r9
            goto L_0x0024
        L_0x001f:
            com.tencent.mm.plugin.FinderCommonFeatureService$m r8 = new com.tencent.mm.plugin.FinderCommonFeatureService$m
            r8.<init>(r0, r7)
        L_0x0024:
            java.lang.Object r7 = r8.f157851p
            xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
            int r10 = r8.f157853r
            r11 = 1
            java.lang.String r12 = "Finder.FinderCommonFeatureService"
            r14 = 2
            r15 = 3
            if (r10 == 0) goto L_0x00f8
            if (r10 == r11) goto L_0x00d7
            if (r10 == r14) goto L_0x00b4
            if (r10 == r15) goto L_0x0084
            r1 = 4
            if (r10 == r1) goto L_0x0052
            r1 = 5
            if (r10 != r1) goto L_0x004a
            java.lang.Object r1 = r8.f157843e
            gy3.f0 r1 = (gy3.C8479f0) r1
            java.lang.Object r2 = r8.f157842d
            android.content.Context r2 = (android.content.Context) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x03b0
        L_0x004a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0052:
            long r1 = r8.f157850o
            long r3 = r8.f157849n
            java.lang.Object r5 = r8.f157848j
            rx3.o r5 = (rx3.C13605o) r5
            java.lang.Object r6 = r8.f157847i
            gy3.f0 r6 = (gy3.C8479f0) r6
            java.lang.Object r10 = r8.f157846h
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r8.f157845g
            pe3.b r11 = (pe3.C89349b) r11
            java.lang.Object r15 = r8.f157844f
            te3.th3 r15 = (te3.C51398th3) r15
            java.lang.Object r14 = r8.f157843e
            android.content.Context r14 = (android.content.Context) r14
            java.lang.Object r13 = r8.f157842d
            com.tencent.mm.plugin.FinderCommonFeatureService r13 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r13
            kotlin.ResultKt.throwOnFailure(r7)
            r18 = r15
            r15 = r5
            r5 = r6
            r6 = r10
            r10 = r11
            r11 = r18
        L_0x007d:
            r19 = r14
            r14 = r13
            r13 = r19
            goto L_0x0342
        L_0x0084:
            long r1 = r8.f157850o
            long r3 = r8.f157849n
            java.lang.Object r5 = r8.f157847i
            gy3.f0 r5 = (gy3.C8479f0) r5
            java.lang.Object r6 = r8.f157846h
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r10 = r8.f157845g
            pe3.b r10 = (pe3.C89349b) r10
            java.lang.Object r11 = r8.f157844f
            te3.th3 r11 = (te3.C51398th3) r11
            java.lang.Object r13 = r8.f157843e
            android.content.Context r13 = (android.content.Context) r13
            java.lang.Object r14 = r8.f157842d
            com.tencent.mm.plugin.FinderCommonFeatureService r14 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r14
            kotlin.ResultKt.throwOnFailure(r7)
            r15 = r7
            r0 = 3
            r7 = 2
        L_0x00a6:
            r18 = r6
            r6 = r5
            r5 = r11
            r11 = r10
            r10 = r18
            r19 = r14
            r14 = r13
            r13 = r19
            goto L_0x022e
        L_0x00b4:
            long r1 = r8.f157850o
            long r3 = r8.f157849n
            java.lang.Object r5 = r8.f157847i
            gy3.f0 r5 = (gy3.C8479f0) r5
            java.lang.Object r6 = r8.f157846h
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r10 = r8.f157845g
            pe3.b r10 = (pe3.C89349b) r10
            java.lang.Object r11 = r8.f157844f
            te3.th3 r11 = (te3.C51398th3) r11
            java.lang.Object r13 = r8.f157843e
            android.content.Context r13 = (android.content.Context) r13
            java.lang.Object r14 = r8.f157842d
            com.tencent.mm.plugin.FinderCommonFeatureService r14 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r14
            kotlin.ResultKt.throwOnFailure(r7)
            r0 = r7
            r7 = 2
            goto L_0x01ef
        L_0x00d7:
            long r1 = r8.f157850o
            long r3 = r8.f157849n
            java.lang.Object r5 = r8.f157847i
            gy3.f0 r5 = (gy3.C8479f0) r5
            java.lang.Object r6 = r8.f157846h
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r10 = r8.f157845g
            pe3.b r10 = (pe3.C89349b) r10
            java.lang.Object r11 = r8.f157844f
            te3.th3 r11 = (te3.C51398th3) r11
            java.lang.Object r13 = r8.f157843e
            android.content.Context r13 = (android.content.Context) r13
            java.lang.Object r14 = r8.f157842d
            com.tencent.mm.plugin.FinderCommonFeatureService r14 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r14
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0167
        L_0x00f8:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "#finderPayFullWholeProcess id="
            r7.append(r10)
            int r10 = r2.f142221d
            r7.append(r10)
            java.lang.String r10 = " liveId="
            r7.append(r10)
            r7.append(r3)
            java.lang.String r10 = " objectId="
            r7.append(r10)
            r7.append(r5)
            java.lang.String r10 = " price="
            r7.append(r10)
            int r10 = r2.f142222e
            r7.append(r10)
            java.lang.String r10 = " title="
            r7.append(r10)
            java.lang.String r10 = r2.f142223f
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)
            gy3.f0 r7 = new gy3.f0
            r7.<init>()
            Ax0(r7, r1)
            r8.f157842d = r0
            r8.f157843e = r1
            r8.f157844f = r2
            r10 = r27
            r8.f157845g = r10
            r13 = r28
            r8.f157846h = r13
            r8.f157847i = r7
            r8.f157849n = r3
            r8.f157850o = r5
            r8.f157853r = r11
            java.lang.Object r11 = r0.Qx0(r8)
            if (r11 != r9) goto L_0x015a
            return r9
        L_0x015a:
            r14 = r0
            r18 = r13
            r13 = r1
            r19 = r11
            r11 = r2
            r1 = r5
            r5 = r7
            r7 = r19
            r6 = r18
        L_0x0167:
            rx3.o r7 = (rx3.C13605o) r7
            T r15 = r5.f27484d
            qo3.i0 r15 = (qo3.C89779i0) r15
            if (r15 == 0) goto L_0x0172
            r15.dismiss()
        L_0x0172:
            r15 = 0
            r5.f27484d = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "#finderPayFullWholeProcess weCoinResult="
            r15.append(r0)
            r15.append(r7)
            java.lang.String r0 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            A r0 = r7.f38557d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01b6
            android.content.res.Resources r0 = r13.getResources()
            r1 = 2131827140(0x7f1119c4, float:1.9287184E38)
            java.lang.String r0 = r0.getString(r1)
            r1 = 0
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r13, (java.lang.CharSequence) r0, (int) r1)
            r0.show()
            rx3.o r0 = new rx3.o
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Integer r2 = new java.lang.Integer
            r3 = -1
            r2.<init>(r3)
            C r3 = r7.f38559f
            r0.<init>(r1, r2, r3)
            return r0
        L_0x01b6:
            B r0 = r7.f38558e
            java.lang.Number r0 = (java.lang.Number) r0
            long r16 = r0.longValue()
            int r0 = r11.f142222e
            r21 = r1
            long r0 = (long) r0
            int r2 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0384
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            r8.f157842d = r14
            r8.f157843e = r13
            r8.f157844f = r11
            r8.f157845g = r10
            r8.f157846h = r6
            r8.f157847i = r5
            r1 = 0
            r8.f157848j = r1
            r8.f157849n = r3
            r1 = r21
            r8.f157850o = r1
            r7 = 2
            r8.f157853r = r7
            r15 = 0
            java.lang.Object r0 = r0.mo76811Tc(r13, r15, r8)
            if (r0 != r9) goto L_0x01ef
            return r9
        L_0x01ef:
            rx3.l r0 = (rx3.C13604l) r0
            A r15 = r0.f38555d
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L_0x0211
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r15 = "#orderAndPay chargeResult="
            r7.append(r15)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x0386
        L_0x0211:
            Ax0(r5, r13)
            r8.f157842d = r14
            r8.f157843e = r13
            r8.f157844f = r11
            r8.f157845g = r10
            r8.f157846h = r6
            r8.f157847i = r5
            r8.f157849n = r3
            r8.f157850o = r1
            r0 = 3
            r8.f157853r = r0
            java.lang.Object r15 = r14.Qx0(r8)
            if (r15 != r9) goto L_0x00a6
            return r9
        L_0x022e:
            rx3.o r15 = (rx3.C13605o) r15
            T r0 = r6.f27484d
            qo3.i0 r0 = (qo3.C89779i0) r0
            if (r0 == 0) goto L_0x0239
            r0.dismiss()
        L_0x0239:
            r0 = 0
            r6.f27484d = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "#finderPayFullWholeProcess inner weCoinResult="
            r0.append(r7)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            A r0 = r15.f38557d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x026a
            rx3.o r0 = new rx3.o
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Integer r2 = new java.lang.Integer
            r7 = -1
            r2.<init>(r7)
            C r3 = r15.f38559f
            r0.<init>(r1, r2, r3)
            return r0
        L_0x026a:
            r7 = -1
            B r0 = r15.f38558e
            java.lang.Number r0 = (java.lang.Number) r0
            long r16 = r0.longValue()
            int r0 = r5.f142222e
            r21 = r8
            long r7 = (long) r0
            int r0 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0372
            r8 = r21
            r8.f157842d = r13
            r8.f157843e = r14
            r8.f157844f = r5
            r8.f157845g = r11
            r8.f157846h = r10
            r8.f157847i = r6
            r8.f157848j = r15
            r8.f157849n = r3
            r8.f157850o = r1
            r0 = 4
            r8.f157853r = r0
            r13.getClass()
            wx3.h r7 = new wx3.h
            wx3.d r0 = xx3.C66447b.m78392b(r8)
            r7.<init>(r0)
            qo3.q r0 = new qo3.q
            r0.<init>(r14)
            r16 = r1
            r1 = 0
            r0.mo107589a(r1)
            android.content.res.Resources r1 = r14.getResources()
            r2 = 2131827201(0x7f111a01, float:1.9287308E38)
            java.lang.String r1 = r1.getString(r2)
            r0.mo107595g(r1)
            android.content.res.Resources r1 = r14.getResources()
            r2 = 2131827188(0x7f1119f4, float:1.9287282E38)
            java.lang.String r1 = r1.getString(r2)
            r0.mo107602n(r1)
            android.content.res.Resources r1 = r14.getResources()
            r2 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r1 = r1.getString(r2)
            r0.mo107598j(r1)
            tf0.q0 r1 = new tf0.q0
            r1.<init>(r7)
            java.lang.String r2 = r0.f225840d
            if (r2 == 0) goto L_0x02e7
            int r2 = r2.length()
            if (r2 != 0) goto L_0x02e4
            goto L_0x02e7
        L_0x02e4:
            r21 = r3
            goto L_0x02f8
        L_0x02e7:
            android.content.Context r2 = r0.f225838b
            android.content.res.Resources r2 = r2.getResources()
            r21 = r3
            r3 = 2131822927(0x7f11094f, float:1.927864E38)
            java.lang.String r2 = r2.getString(r3)
            r0.f225840d = r2
        L_0x02f8:
            java.lang.String r2 = r0.f225841e
            if (r2 == 0) goto L_0x0302
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0311
        L_0x0302:
            android.content.Context r2 = r0.f225838b
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131822916(0x7f110944, float:1.9278617E38)
            java.lang.String r2 = r2.getString(r3)
            r0.f225841e = r2
        L_0x0311:
            qo3.g$i r2 = r0.f225837a
            java.lang.String r3 = r0.f225841e
            qo3.a r2 = r2.f225714b
            r2.f225664u = r3
            java.lang.String r3 = r0.f225840d
            r2.f225663t = r3
            qo3.r r3 = new qo3.r
            r3.<init>(r0, r1)
            r2.f225620C = r3
            qo3.s r3 = new qo3.s
            r3.<init>(r0, r1)
            r2.f225621D = r3
            r0.mo107603o()
            java.lang.Object r7 = r7.mo90314b()
            if (r7 != r9) goto L_0x0335
            return r9
        L_0x0335:
            r3 = r21
            r1 = r16
            r18 = r11
            r11 = r5
            r5 = r6
            r6 = r10
            r10 = r18
            goto L_0x007d
        L_0x0342:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r0 = r7.booleanValue()
            if (r0 != 0) goto L_0x036f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#finderPayFullWholeProcess notEnoughResult="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            rx3.o r0 = new rx3.o
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2 = -2
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            java.lang.String r2 = "user give up"
            r0.<init>(r1, r3, r2)
            return r0
        L_0x036f:
            r7 = r15
            goto L_0x01b6
        L_0x0372:
            r8 = r21
            r16 = r1
            r21 = r3
            r4 = r5
            r1 = r6
            r0 = r9
            r9 = r11
            r2 = r13
            r13 = r14
            r5 = r21
            r11 = r8
            r7 = r16
            goto L_0x0392
        L_0x0384:
            r1 = r21
        L_0x0386:
            r0 = r9
            r9 = r10
            r10 = r6
            r18 = r1
            r1 = r5
            r5 = r3
            r4 = r11
            r2 = r14
            r11 = r8
            r7 = r18
        L_0x0392:
            Ax0(r1, r13)
            r11.f157842d = r13
            r11.f157843e = r1
            r3 = 0
            r11.f157844f = r3
            r11.f157845g = r3
            r11.f157846h = r3
            r11.f157847i = r3
            r11.f157848j = r3
            r3 = 5
            r11.f157853r = r3
            r3 = r13
            java.lang.Object r7 = r2.Xx0(r3, r4, r5, r7, r9, r10, r11)
            if (r7 != r0) goto L_0x03af
            return r0
        L_0x03af:
            r2 = r13
        L_0x03b0:
            rx3.l r7 = (rx3.C13604l) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "#finderPayFullWholeProcess orderAndPayResult="
            r0.append(r3)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            T r0 = r1.f27484d
            qo3.i0 r0 = (qo3.C89779i0) r0
            if (r0 == 0) goto L_0x03cf
            r0.dismiss()
        L_0x03cf:
            r0 = 0
            r1.f27484d = r0
            A r0 = r7.f38555d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x03ff
            android.content.res.Resources r0 = r2.getResources()
            r1 = 2131827140(0x7f1119c4, float:1.9287184E38)
            java.lang.String r0 = r0.getString(r1)
            r1 = 0
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r2, (java.lang.CharSequence) r0, (int) r1)
            r0.show()
            rx3.o r0 = new rx3.o
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2 = -3
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            B r2 = r7.f38556e
            r0.<init>(r1, r3, r2)
            return r0
        L_0x03ff:
            rx3.o r0 = new rx3.o
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Integer r2 = new java.lang.Integer
            r3 = 0
            r2.<init>(r3)
            java.lang.String r3 = ""
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.wn0(android.content.Context, te3.th3, long, long, pe3.b, java.lang.String, wx3.d):java.lang.Object");
    }

    public void wp0(Context context, long j, String str, String str2, int i, JSONObject jSONObject) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(jSONObject, TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO);
        if (j == 0) {
            Log.m105924i("Finder.FinderCommonFeatureService", "enterProfileForWxPay exportId empty");
            return;
        }
        int optInt = jSONObject.optInt("playBackTime");
        boolean optBoolean = jSONObject.optBoolean("isPause");
        double optDouble = jSONObject.optDouble("playbackRate");
        jSONObject.optBoolean("showBarrage");
        String optString = jSONObject.optString("mediaId");
        int optInt2 = jSONObject.optInt("requestScene", 3);
        Log.m105924i("Finder.FinderCommonFeatureService", "enterFeedForWxPay feedId:" + j + " exportId:" + str + ", enterCommentScene:" + i);
        Intent intent = new Intent();
        intent.putExtra("feed_object_id", j);
        intent.putExtra("feed_encrypted_object_id", str);
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("feed_object_nonceId", str2);
        intent.putExtra("key_need_related_list", true);
        intent.putExtra("key_comment_scene", i);
        intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", (long) optInt);
        intent.putExtra("KEY_VIDEO_CLEAR_VIDEO_CACHE", true);
        intent.putExtra("KEY_VIDEO_PLAY_SPEED_RATIO", (float) optDouble);
        intent.putExtra("KEY_VIDEO_IS_PAUSE", optBoolean);
        intent.putExtra("KEY_VIDEO_MEDIA_ID", optString);
        intent.putExtra("key_reuqest_scene", optInt2);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(26, 33, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED, intent);
        ((C58684b) C86312j.m106911c(C58684b.class)).Zx0(context, intent);
    }

    /* renamed from: xS */
    public C91753f mo76895xS() {
        return Rx0(this.f157799h, new C40391s(this));
    }

    /* renamed from: xh */
    public void mo76896xh(Context context, String str, C60216z4.C8821a<Object> aVar, C60216z4.C8821a<Integer> aVar2, C60216z4.C8821a<JSONObject> aVar3) {
        C87412m.m108594g(context, "context");
        mo76906zn(context, false, str, aVar, aVar2, aVar3);
    }

    /* renamed from: xo */
    public boolean mo76897xo(int i) {
        return ((C11739f) C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C11739f.class)).mo11603f3(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00dd A[Catch:{ all -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd A[Catch:{ all -> 0x0194 }] */
    /* renamed from: xr */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo76898xr(android.content.Context r14, java.lang.String r15, ht1.C60216z4.C8821a<java.lang.Object> r16) {
        /*
            r13 = this;
            r10 = r13
            r0 = r14
            r1 = r15
            java.lang.String r11 = "Finder.FinderCommonFeatureService"
            java.lang.Class<ir.n> r2 = p565ir.C60606n.class
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r14, r3)
            r12 = 0
            c30.g r3 = new c30.g     // Catch:{ all -> 0x0194 }
            r3.<init>((java.lang.String) r15)     // Catch:{ all -> 0x0194 }
            java.lang.String r4 = "extInfo"
            c30.g r4 = r3.getJSONObject(r4)     // Catch:{ all -> 0x0194 }
            java.lang.String r5 = "action"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ all -> 0x0194 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0194 }
            r6.<init>()     // Catch:{ all -> 0x0194 }
            java.lang.String r7 = "json = "
            r6.append(r7)     // Catch:{ all -> 0x0194 }
            r6.append(r15)     // Catch:{ all -> 0x0194 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0194 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)     // Catch:{ all -> 0x0194 }
            java.lang.String r1 = "webUrl"
            java.lang.String r1 = r3.optString(r1)     // Catch:{ all -> 0x0194 }
            java.lang.String r3 = ""
            if (r1 != 0) goto L_0x003f
            r6 = r3
            goto L_0x0040
        L_0x003f:
            r6 = r1
        L_0x0040:
            if (r5 == 0) goto L_0x017e
            int r1 = r5.hashCode()     // Catch:{ all -> 0x0194 }
            r7 = 0
            switch(r1) {
                case -1852273586: goto L_0x0162;
                case -1160307446: goto L_0x0149;
                case -505354664: goto L_0x010f;
                case -412058418: goto L_0x00b5;
                case 50881657: goto L_0x00a6;
                case 685848668: goto L_0x008b;
                case 819909547: goto L_0x0070;
                case 1456424243: goto L_0x005b;
                case 1620495011: goto L_0x004c;
                default: goto L_0x004a;
            }     // Catch:{ all -> 0x0194 }
        L_0x004a:
            goto L_0x017e
        L_0x004c:
            java.lang.String r1 = "openFinderReplayInLiveRoom"
            boolean r1 = r5.equals(r1)     // Catch:{ all -> 0x0194 }
            if (r1 != 0) goto L_0x0056
            goto L_0x017e
        L_0x0056:
            r13.Wx0(r4, r14)     // Catch:{ all -> 0x0194 }
            goto L_0x019c
        L_0x005b:
            java.lang.String r1 = "openFinderLiveGiftPacksView"
            boolean r1 = r5.equals(r1)     // Catch:{ all -> 0x0194 }
            if (r1 != 0) goto L_0x0065
            goto L_0x017e
        L_0x0065:
            di3.d r1 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x0194 }
            ir.n r1 = (p565ir.C60606n) r1     // Catch:{ all -> 0x0194 }
            r1.mo85070k4(r14, r7)     // Catch:{ all -> 0x0194 }
            goto L_0x019c
        L_0x0070:
            java.lang.String r1 = "autoOpenFinderLive"
            boolean r1 = r5.equals(r1)     // Catch:{ all -> 0x0194 }
            if (r1 != 0) goto L_0x007a
            goto L_0x017e
        L_0x007a:
            di3.d r1 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x0194 }
            ir.n r1 = (p565ir.C60606n) r1     // Catch:{ all -> 0x0194 }
            r5 = 0
            r7 = 0
            r2 = r4
            r3 = r6
            r4 = r14
            r6 = r7
            r1.mo85023Pn(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0194 }
            goto L_0x019c
        L_0x008b:
            java.lang.String r1 = "openFinderLiveHalfOnlineUserProfile"
            boolean r1 = r5.equals(r1)     // Catch:{ all -> 0x0194 }
            if (r1 != 0) goto L_0x0095
            goto L_0x017e
        L_0x0095:
            r5 = 0
            r6 = 0
            r7 = 12
            r8 = 0
            r1 = r13
            r2 = r4
            r3 = r14
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            Sx0(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0194 }
            goto L_0x019c
        L_0x00a6:
            java.lang.String r1 = "openFinderProfile"
            boolean r1 = r5.equals(r1)     // Catch:{ all -> 0x0194 }
            if (r1 != 0) goto L_0x00b0
            goto L_0x017e
        L_0x00b0:
            r13.Vx0(r4, r14, r7, r3)     // Catch:{ all -> 0x0194 }
            goto L_0x019c
        L_0x00b5:
            java.lang.String r1 = "openFinderFeed"
            boolean r1 = r5.equals(r1)     // Catch:{ all -> 0x0194 }
            if (r1 != 0) goto L_0x00bf
            goto L_0x017e
        L_0x00bf:
            boolean r1 = r0 instanceof android.app.Activity     // Catch:{ all -> 0x0194 }
            if (r1 == 0) goto L_0x00c4
            goto L_0x00d4
        L_0x00c4:
            java.lang.Class<ht1.t3> r1 = ht1.C60204t3.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ all -> 0x0194 }
            ht1.t3 r1 = (ht1.C60204t3) r1     // Catch:{ all -> 0x0194 }
            android.app.Activity r1 = r1.ub0()     // Catch:{ all -> 0x0194 }
            if (r1 == 0) goto L_0x00d4
            r3 = r1
            goto L_0x00d5
        L_0x00d4:
            r3 = r0
        L_0x00d5:
            er1.w3 r1 = er1.C58784w3.f168295a     // Catch:{ all -> 0x0194 }
            boolean r1 = r1.mo83915a1()     // Catch:{ all -> 0x0194 }
            if (r1 == 0) goto L_0x00fd
            java.lang.Class<xx.f> r1 = p274xx.C15907f.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ all -> 0x0194 }
            xx.f r1 = (p274xx.C15907f) r1     // Catch:{ all -> 0x0194 }
            r5 = 34359738368(0x800000000, double:1.69759663277E-313)
            r7 = 0
            com.tencent.mm.plugin.FinderCommonFeatureService$j r8 = new com.tencent.mm.plugin.FinderCommonFeatureService$j     // Catch:{ all -> 0x0194 }
            r9 = r16
            r8.<init>(r13, r4, r3, r9)     // Catch:{ all -> 0x0194 }
            r9 = 3
            r2 = r14
            r3 = r5
            r5 = r7
            r6 = r8
            r7 = r9
            r1.K00(r2, r3, r5, r6, r7)     // Catch:{ all -> 0x0194 }
            goto L_0x019c
        L_0x00fd:
            r9 = r16
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 56
            r0 = 0
            r1 = r13
            r2 = r4
            r4 = r16
            r9 = r0
            ht1.C60200t1.C60201a.m70371i(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0194 }
            goto L_0x019c
        L_0x010f:
            java.lang.String r1 = "createLuckyLive"
            boolean r1 = r5.equals(r1)     // Catch:{ all -> 0x0194 }
            if (r1 != 0) goto L_0x0119
            goto L_0x017e
        L_0x0119:
            java.lang.String r1 = "groupId"
            java.lang.String r1 = r4.optString(r1)     // Catch:{ all -> 0x0194 }
            if (r1 != 0) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r3 = r1
        L_0x0123:
            di3.d r1 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x0194 }
            ir.n r1 = (p565ir.C60606n) r1     // Catch:{ all -> 0x0194 }
            r1.mo85063ie(r14, r3)     // Catch:{ all -> 0x0194 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0194 }
            r1 = 22385(0x5771, float:3.1368E-41)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0194 }
            r3 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0194 }
            r2[r12] = r3     // Catch:{ all -> 0x0194 }
            r3 = 1
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0194 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0194 }
            r2[r3] = r4     // Catch:{ all -> 0x0194 }
            r0.mo160131h(r1, r2)     // Catch:{ all -> 0x0194 }
            goto L_0x019c
        L_0x0149:
            java.lang.String r1 = "openFinderMultiMoreLive"
            boolean r1 = r5.equals(r1)     // Catch:{ all -> 0x0194 }
            if (r1 != 0) goto L_0x0152
            goto L_0x017e
        L_0x0152:
            r5 = 0
            r6 = 0
            r7 = 8
            r8 = 0
            r1 = r13
            r2 = r4
            r3 = r14
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            Tx0(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0194 }
            goto L_0x019c
        L_0x0162:
            java.lang.String r1 = "createFinderLive"
            boolean r1 = r5.equals(r1)     // Catch:{ all -> 0x0194 }
            if (r1 != 0) goto L_0x016b
            goto L_0x017e
        L_0x016b:
            di3.d r1 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x0194 }
            ir.n r1 = (p565ir.C60606n) r1     // Catch:{ all -> 0x0194 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0194 }
            java.lang.String r3 = "extInfo.toString()"
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ all -> 0x0194 }
            r1.pj0(r14, r2)     // Catch:{ all -> 0x0194 }
            goto L_0x019c
        L_0x017e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0194 }
            r0.<init>()     // Catch:{ all -> 0x0194 }
            java.lang.String r1 = "unKnow action:"
            r0.append(r1)     // Catch:{ all -> 0x0194 }
            r0.append(r5)     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0194 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ all -> 0x0194 }
            goto L_0x019c
        L_0x0194:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String r2 = "enterFinderUI exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r2, r1)
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.mo76898xr(android.content.Context, java.lang.String, ht1.z4$a):void");
    }

    /* renamed from: xw */
    public void mo76899xw(String str, String str2, String str3, int i, String str4, int i2, long j, long j2, int i3, int i4, String str5, String str6, boolean z) {
        String str7 = str;
        String str8 = str4;
        C87412m.m108594g(str7, "mediaId");
        String str9 = str2;
        C87412m.m108594g(str9, "originalMediaId");
        String str10 = str3;
        C87412m.m108594g(str10, "url");
        C87412m.m108594g(str8, "specFormat");
        StringBuilder sb = new StringBuilder();
        sb.append("storeFinderMediaCache mediaId");
        sb.append(str7);
        sb.append(" cacheSize:");
        long j3 = j;
        sb.append(j3);
        sb.append(" totalSize:");
        long j4 = j2;
        sb.append(j4);
        sb.append(" state:");
        int i5 = i3;
        sb.append(i5);
        sb.append(" specFormat:");
        sb.append(str8);
        Log.m105924i("Finder.FinderCommonFeatureService", sb.toString());
        C66167g.f190173a.mo90237g(str7, str9, str10, i, str8, i2, j3, j4, i5, i4, str5, str6, z);
    }

    /* renamed from: y */
    public void mo76900y(C49712hj1 hj12, int i, C48978cb0 cb02) {
        C87412m.m108594g(cb02, "extStats");
        C86709a0.m107524d().mo123460f(new C46534r2(hj12, i, cb02, (String) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x038b, code lost:
        if (r10.mo9225i().mo123062e(new com.tencent.p014mm.plugin.FinderCommonFeatureService.C55408j0(r6, r1, r9)) == null) goto L_0x039e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0184  */
    /* renamed from: yF */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo76901yF(c30.C104289g r40, android.content.Context r41, ht1.C60216z4.C8821a<java.lang.Object> r42, java.lang.String r43, boolean r44, ht1.C60216z4.C8821a<org.json.JSONObject> r45) {
        /*
            r39 = this;
            r1 = r39
            r0 = r40
            r4 = r41
            r9 = r42
            r2 = r43
            java.lang.Class<er1.b> r3 = er1.C58684b.class
            java.lang.String r5 = "allow_infinite_top_pull"
            java.lang.String r6 = "allow_pull_top"
            java.lang.String r7 = "Finder.FinderCommonFeatureService"
            java.lang.String r8 = "extInfo"
            gy3.C87412m.m108594g(r0, r8)
            java.lang.String r8 = "context"
            gy3.C87412m.m108594g(r4, r8)
            java.lang.String r8 = "appid"
            gy3.C87412m.m108594g(r2, r8)
            java.lang.String r8 = "feedID"
            java.lang.String r8 = r0.optString(r8)
            java.lang.String r10 = "nonceID"
            java.lang.String r15 = r0.optString(r10)
            java.lang.String r10 = "notGetReleatedList"
            int r10 = r0.optInt(r10)
            r14 = 0
            if (r10 != 0) goto L_0x0038
            r10 = 1
            goto L_0x0039
        L_0x0038:
            r10 = 0
        L_0x0039:
            java.lang.String r12 = "shareScene"
            int r12 = r0.optInt(r12, r14)
            java.lang.String r13 = ""
            java.lang.String r11 = "sessionId"
            java.lang.String r11 = r0.optString(r11, r13)
            java.lang.String r14 = "requestScene"
            r9 = 3
            int r14 = r0.optInt(r14, r9)
            java.lang.String r9 = "reportExtraInfo"
            java.lang.String r9 = r0.optString(r9, r13)
            java.lang.String r2 = "commentScene"
            r19 = r11
            r11 = 0
            int r2 = r0.optInt(r2, r11)
            r20 = r14
            java.lang.String r14 = "entryCardType"
            int r14 = r0.optInt(r14, r11)
            r21 = r10
            r10 = 0
            r32 = r8
            java.lang.String r8 = "currentTime"
            double r10 = r0.optDouble(r8, r10)
            java.lang.String r8 = "displayTitle"
            r22 = r10
            java.lang.String r10 = r0.optString(r8, r13)
            er1.w3 r11 = er1.C58784w3.f168295a
            r11.getClass()
            er1.j4 r11 = er1.C58739j4.f168176a
            boolean r11 = r11.mo83685N(r9)
            if (r11 == 0) goto L_0x008d
            r11 = 42
            r24 = 42
            goto L_0x0091
        L_0x008d:
            r11 = 39
            r24 = 39
        L_0x0091:
            java.lang.String r11 = "adJSAPIType"
            r25 = r8
            r8 = 0
            int r11 = r0.optInt(r11, r8)
            java.lang.String r8 = "userName"
            java.lang.String r8 = r0.optString(r8, r13)
            r26 = r10
            java.lang.String r10 = "isInsideFinder"
            r33 = r13
            r34 = r15
            r13 = 0
            int r15 = r0.optInt(r10, r13)
            r27 = r8
            r8 = 1
            if (r15 == r8) goto L_0x00bc
            boolean r8 = r0.optBoolean(r10, r13)
            if (r8 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r8 = 0
            goto L_0x00bd
        L_0x00bc:
            r8 = 1
        L_0x00bd:
            java.lang.String r10 = "feedFocusChangeNotify"
            boolean r10 = r0.optBoolean(r10)
            java.lang.Class<ht1.n4> r13 = ht1.C60188n4.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            ht1.n4 r13 = (ht1.C60188n4) r13
            boolean r15 = r13.Gf0()
            if (r15 == 0) goto L_0x00dd
            boolean r13 = r13.k90()
            if (r13 == 0) goto L_0x00dd
            r13 = 26
            if (r2 != r13) goto L_0x00dd
            r13 = 1
            goto L_0x00de
        L_0x00dd:
            r13 = 0
        L_0x00de:
            if (r13 == 0) goto L_0x00e3
            r15 = 20
            goto L_0x00e5
        L_0x00e3:
            r15 = r24
        L_0x00e5:
            r24 = r13
            java.lang.String r13 = "behavior"
            c30.e r0 = r0.optJSONArray(r13)     // Catch:{ Exception -> 0x0141 }
            if (r0 == 0) goto L_0x0139
            int r13 = r0.length()     // Catch:{ Exception -> 0x0141 }
            r31 = r8
            r8 = 0
            r28 = 0
            r29 = 0
            r30 = 0
        L_0x00fc:
            if (r8 >= r13) goto L_0x0136
            r40 = r13
            java.lang.String r13 = r0.getString(r8)     // Catch:{ Exception -> 0x0131 }
            r35 = r10
            java.lang.String r10 = "report_feed_read"
            boolean r10 = gy3.C87412m.m108589b(r13, r10)     // Catch:{ Exception -> 0x012f }
            if (r10 == 0) goto L_0x0110
            r28 = 1
        L_0x0110:
            java.lang.String r10 = r0.getString(r8)     // Catch:{ Exception -> 0x012f }
            boolean r10 = gy3.C87412m.m108589b(r10, r6)     // Catch:{ Exception -> 0x012f }
            if (r10 == 0) goto L_0x011c
            r29 = 1
        L_0x011c:
            java.lang.String r10 = r0.getString(r8)     // Catch:{ Exception -> 0x012f }
            boolean r10 = gy3.C87412m.m108589b(r10, r5)     // Catch:{ Exception -> 0x012f }
            if (r10 == 0) goto L_0x0128
            r30 = 1
        L_0x0128:
            int r8 = r8 + 1
            r13 = r40
            r10 = r35
            goto L_0x00fc
        L_0x012f:
            r0 = move-exception
            goto L_0x0134
        L_0x0131:
            r0 = move-exception
            r35 = r10
        L_0x0134:
            r8 = 0
            goto L_0x014d
        L_0x0136:
            r35 = r10
            goto L_0x0154
        L_0x0139:
            r31 = r8
            r35 = r10
            r0 = 0
            r8 = 0
            r13 = 0
            goto L_0x015a
        L_0x0141:
            r0 = move-exception
            r31 = r8
            r35 = r10
            r8 = 0
            r28 = 0
            r29 = 0
            r30 = 0
        L_0x014d:
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r8 = "getReportRead exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r8, r10)
        L_0x0154:
            r13 = r28
            r8 = r29
            r0 = r30
        L_0x015a:
            ot1.a r10 = ot1.C11767a.f34453a
            r28 = r0
            java.lang.String r0 = "entrance"
            int r0 = r10.mo11660b(r0)
            if (r0 == 0) goto L_0x0184
            di3.d r2 = di3.C86312j.m106911c(r3)
            er1.b r2 = (er1.C58684b) r2
            r2.uy0(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[openFinderFeed] spamAction:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            return
        L_0x0184:
            er1.w3 r0 = er1.C58784w3.f168295a
            r0.getClass()
            er1.j4 r10 = er1.C58739j4.f168176a
            boolean r10 = r10.mo83685N(r9)
            r29 = r3
            r30 = 2
            if (r10 == 0) goto L_0x0197
            r10 = 4
            goto L_0x019c
        L_0x0197:
            if (r14 == 0) goto L_0x019b
            r10 = r14
            goto L_0x019c
        L_0x019b:
            r10 = 2
        L_0x019c:
            if (r2 == 0) goto L_0x01a0
            r0 = r2
            goto L_0x01ad
        L_0x01a0:
            int r3 = r0.mo83959r0(r12)
            r4 = -1
            if (r3 == r4) goto L_0x01ac
            int r0 = r0.mo83959r0(r12)
            goto L_0x01ad
        L_0x01ac:
            r0 = 0
        L_0x01ad:
            r3 = 36
            if (r3 != r2) goto L_0x01b3
            r3 = 1
            goto L_0x01b4
        L_0x01b3:
            r3 = 0
        L_0x01b4:
            java.lang.String r4 = dp1.C58411u.f167342a
            r36 = r5
            java.lang.String r5 = "key_context_id"
            r37 = r6
            r6 = 1
            if (r11 != r6) goto L_0x01f9
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            if (r3 == 0) goto L_0x01d8
            if (r4 == 0) goto L_0x01d1
            int r2 = r4.length()
            if (r2 != 0) goto L_0x01cf
            goto L_0x01d1
        L_0x01cf:
            r11 = 0
            goto L_0x01d2
        L_0x01d1:
            r11 = 1
        L_0x01d2:
            if (r11 != 0) goto L_0x01d8
            r6.putExtra(r5, r4)
            goto L_0x01db
        L_0x01d8:
            r1.mo76842e7(r0, r10, r15, r6)
        L_0x01db:
            java.lang.Class<hy.p0> r0 = p166hy.C60226p0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r2 = r0
            hy.p0 r2 = (p166hy.C60226p0) r2
            r3 = r6
            r4 = r41
            r5 = r27
            r6 = r34
            r7 = r32
            r8 = r9
            r2.mo84728zF(r3, r4, r5, r6, r7, r8)
            r3 = r33
            r34 = 0
            r33 = r13
            goto L_0x0413
        L_0x01f9:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r11 = eb0.C75592q0.m90789s()
            r27 = r8
            java.lang.String r8 = "from_user"
            r6.putExtra(r8, r11)
            java.lang.String r8 = "feed_encrypted_object_id"
            r11 = r32
            r6.putExtra(r8, r11)
            java.lang.String r8 = "feed_object_nonceId"
            r32 = r13
            r13 = r34
            r6.putExtra(r8, r13)
            java.lang.String r8 = "key_need_related_list"
            r13 = r21
            r6.putExtra(r8, r13)
            java.lang.String r8 = "key_comment_scene"
            r6.putExtra(r8, r15)
            java.lang.String r8 = "key_entry_card_type"
            r6.putExtra(r8, r14)
            java.lang.String r8 = "key_reuqest_scene"
            r14 = r20
            r6.putExtra(r8, r14)
            java.lang.String r8 = "key_session_id"
            r13 = r19
            r6.putExtra(r8, r13)
            java.lang.String r8 = "key_search_h5_feed_focus_change"
            r13 = r35
            r6.putExtra(r8, r13)
            java.lang.String r8 = "key_extra_info"
            r6.putExtra(r8, r9)
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            r16 = 0
            r9[r16] = r13
            java.lang.String r13 = "open feed requestScene %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r13, r9)
            if (r44 == 0) goto L_0x0266
            java.lang.String r9 = "KEY_FROM_SOURCE"
            java.lang.String r13 = "WeApp"
            r6.putExtra(r9, r13)
            if (r45 == 0) goto L_0x0266
            java.lang.String r9 = "KEY_NAVIGATE_BACK"
            r6.putExtra(r9, r8)
            com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI.f17125e1 = r45
        L_0x0266:
            java.lang.String r8 = dp1.C58411u.f167343b
            r9 = 6
            if (r31 == 0) goto L_0x0285
            if (r2 != r9) goto L_0x0285
            if (r8 == 0) goto L_0x0278
            int r2 = r8.length()
            if (r2 != 0) goto L_0x0276
            goto L_0x0278
        L_0x0276:
            r2 = 0
            goto L_0x0279
        L_0x0278:
            r2 = 1
        L_0x0279:
            if (r2 != 0) goto L_0x0285
            java.lang.String r0 = "keep searchH5 contextId"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r6.putExtra(r5, r8)
            r4 = r8
            goto L_0x029d
        L_0x0285:
            if (r3 == 0) goto L_0x0299
            if (r4 == 0) goto L_0x0292
            int r2 = r4.length()
            if (r2 != 0) goto L_0x0290
            goto L_0x0292
        L_0x0290:
            r2 = 0
            goto L_0x0293
        L_0x0292:
            r2 = 1
        L_0x0293:
            if (r2 != 0) goto L_0x0299
            r6.putExtra(r5, r4)
            goto L_0x029d
        L_0x0299:
            java.lang.String r4 = r1.mo76842e7(r0, r10, r15, r6)
        L_0x029d:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r43)
            if (r0 != 0) goto L_0x02b9
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 21140(0x5294, float:2.9623E-41)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r5 = 0
            r3[r5] = r4
            r4 = 1
            r3[r4] = r43
            r3[r30] = r11
            r4 = 3
            r3[r4] = r33
            r0.mo160131h(r2, r3)
            goto L_0x02ba
        L_0x02b9:
            r5 = 0
        L_0x02ba:
            java.lang.String r0 = "report_scene"
            r6.putExtra(r0, r12)
            r0 = 9
            java.lang.String r2 = "tab_type"
            r6.putExtra(r2, r0)
            java.lang.String r0 = "is_report_feed"
            r2 = r32
            r6.putExtra(r0, r2)
            r0 = r27
            r3 = r37
            r6.putExtra(r3, r0)
            r0 = r28
            r3 = r36
            r6.putExtra(r3, r0)
            r3 = r25
            r4 = r26
            r6.putExtra(r3, r4)
            r0 = 1000(0x3e8, float:1.401E-42)
            double r3 = (double) r0
            double r3 = r3 * r22
            long r3 = (long) r3
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x02f4
            java.lang.String r0 = "KEY_VIDEO_START_PLAY_TIME_MS"
            r6.putExtra(r0, r3)
        L_0x02f4:
            if (r24 == 0) goto L_0x03fa
            java.lang.String r0 = "KEY_FINDER_POST_FINISH_JUMP_HOT_TAB"
            r3 = 1
            r6.putExtra(r0, r3)
            java.lang.String r0 = "KEY_OBJECT_NONCE_ID"
            r3 = r34
            r6.putExtra(r0, r3)
            java.lang.String r0 = "FROM_SCENE_KEY"
            r6.putExtra(r0, r9)
            java.lang.ref.WeakReference r0 = com.tencent.p014mm.app.AppForegroundDelegate.m161224g()
            r4 = 0
            if (r0 == 0) goto L_0x0316
            java.lang.Object r7 = r0.get()
            android.app.Activity r7 = (android.app.Activity) r7
            goto L_0x0317
        L_0x0316:
            r7 = r4
        L_0x0317:
            if (r7 != 0) goto L_0x031f
            com.tencent.mm.app.AppForegroundDelegate r0 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            java.lang.ref.WeakReference r0 = r0.mo174212f()
        L_0x031f:
            java.lang.String r7 = "feedId"
            if (r0 == 0) goto L_0x038e
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L_0x038e
            je1.x1 r8 = new je1.x1
            r12 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            gy3.C87412m.m108593f(r11, r7)
            rs1.s8$a r9 = rs1.C13442s8.f38060Q0
            r10 = r41
            rs1.s8 r9 = r9.mo12873f(r10)
            if (r9 == 0) goto L_0x0351
            te3.hj1 r9 = r9.mo12861q3()
            r26 = r9
            goto L_0x0353
        L_0x0351:
            r26 = r4
        L_0x0353:
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 118720(0x1cfc0, float:1.66362E-40)
            r31 = 0
            java.lang.String r16 = ""
            r9 = r10
            r10 = r8
            r32 = r11
            r11 = r12
            r38 = r33
            r33 = r2
            r2 = r3
            r3 = r38
            r13 = r2
            r5 = r14
            r34 = 0
            r14 = r15
            r35 = r15
            r15 = r5
            r25 = r32
            r10.<init>(r11, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r10 = 5000(0x1388, double:2.4703E-320)
            r8.mo85582k(r0, r4, r10)
            nr3.e r0 = r8.mo9225i()
            com.tencent.mm.plugin.FinderCommonFeatureService$j0 r8 = new com.tencent.mm.plugin.FinderCommonFeatureService$j0
            r8.<init>(r6, r1, r9)
            nr3.e r0 = r0.mo123062e(r8)
            if (r0 != 0) goto L_0x040b
            goto L_0x039e
        L_0x038e:
            r9 = r41
            r32 = r11
            r5 = r14
            r35 = r15
            r34 = 0
            r38 = r33
            r33 = r2
            r2 = r3
            r3 = r38
        L_0x039e:
            ft1.a r10 = ft1.C59319a.f169618b
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            com.tencent.mm.plugin.FinderCommonFeatureService$k0 r16 = com.tencent.p014mm.plugin.FinderCommonFeatureService.C55410k0.f157837d
            r17 = 28
            r0 = 0
            r18 = 0
            java.lang.String r11 = "bizBoxActivityFail"
            o40.C11348f.C11349a.m11178b(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            je1.x1 r8 = new je1.x1
            r11 = 0
            r17 = 1
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r15 = r32
            gy3.C87412m.m108593f(r15, r7)
            rs1.s8$a r7 = rs1.C13442s8.f38060Q0
            rs1.s8 r7 = r7.mo12873f(r9)
            if (r7 == 0) goto L_0x03d1
            te3.hj1 r4 = r7.mo12861q3()
        L_0x03d1:
            r26 = r4
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 118720(0x1cfc0, float:1.66362E-40)
            r31 = 0
            java.lang.String r16 = ""
            r10 = r8
            r13 = r2
            r14 = r35
            r2 = r15
            r15 = r5
            r18 = r0
            r25 = r2
            r10.<init>(r11, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            nr3.e r0 = r8.mo9225i()
            com.tencent.mm.plugin.FinderCommonFeatureService$l0 r2 = new com.tencent.mm.plugin.FinderCommonFeatureService$l0
            r2.<init>(r6, r1, r9)
            r0.mo123062e(r2)
            goto L_0x040b
        L_0x03fa:
            r9 = r41
            r3 = r33
            r34 = 0
            r33 = r2
            di3.d r0 = di3.C86312j.m106911c(r29)
            er1.b r0 = (er1.C58684b) r0
            r0.Zx0(r9, r6)
        L_0x040b:
            jm2.f r0 = jm2.C117361f.INSTANCE
            r2 = 540999685(0x203f0005, float:1.6178336E-19)
            r0.mo182041q(r2)
        L_0x0413:
            if (r33 == 0) goto L_0x041a
            r2 = r42
            er1.C7924y0.f26608d = r2
            goto L_0x042c
        L_0x041a:
            r2 = r42
            if (r2 == 0) goto L_0x042c
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r4 = java.lang.Integer.valueOf(r34)
            r0.<init>(r4, r3)
            r2.mo6382a(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x042c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.mo76901yF(c30.g, android.content.Context, ht1.z4$a, java.lang.String, boolean, ht1.z4$a):void");
    }

    public void yj0(String str, ImageView imageView, C11978e0.C11979a aVar) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(aVar, "loaderType");
        if (!(str == null || str.length() == 0) && imageView != null) {
            ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11870V().mo85957c(new C11984n0(str, C27696y.THUMB_IMAGE), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
        }
    }

    public void yt0(Context context, Intent intent) {
        Class cls = C58684b.class;
        C87412m.m108594g(context, "context");
        if (!mo76873sF()) {
            ((C58684b) C86312j.m106911c(cls)).uy0(context);
        } else {
            ((C58684b) C86312j.m106911c(cls)).F50(context, intent);
        }
    }

    public final void yx0() {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_REINIT_USER_VERSION_INT_SYNC, 0);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MY_FINDER_REINIT_USERNAME_STRING_SYNC, "");
    }

    /* renamed from: z2 */
    public C32026j mo76905z2() {
        return this.f157802n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: zn */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo76906zn(android.content.Context r17, boolean r18, java.lang.String r19, ht1.C60216z4.C8821a<java.lang.Object> r20, ht1.C60216z4.C8821a<java.lang.Integer> r21, ht1.C60216z4.C8821a<org.json.JSONObject> r22) {
        /*
            r16 = this;
            r0 = r17
            r1 = r19
            r5 = r20
            r8 = r21
            java.lang.Class<ir.n> r2 = p565ir.C60606n.class
            java.lang.String r3 = "openFinderLive"
            java.lang.String r9 = "Finder.FinderCommonFeatureService"
            java.lang.String r4 = "context"
            gy3.C87412m.m108594g(r0, r4)
            c30.g r4 = new c30.g     // Catch:{ all -> 0x0175 }
            r4.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0175 }
            java.lang.String r6 = "extInfo"
            c30.g r4 = r4.getJSONObject(r6)     // Catch:{ all -> 0x0175 }
            java.lang.String r6 = "action"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ all -> 0x0175 }
            java.lang.String r7 = "sourceId"
            java.lang.String r10 = ""
            java.lang.String r7 = r4.optString(r7, r10)     // Catch:{ all -> 0x0175 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r10.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r11 = "enterFinderUIFromMiniApp json = "
            r10.append(r11)     // Catch:{ all -> 0x0175 }
            r10.append(r1)     // Catch:{ all -> 0x0175 }
            java.lang.String r1 = ", appid:"
            r10.append(r1)     // Catch:{ all -> 0x0175 }
            r10.append(r7)     // Catch:{ all -> 0x0175 }
            java.lang.String r1 = r10.toString()     // Catch:{ all -> 0x0175 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)     // Catch:{ all -> 0x0175 }
            boolean r1 = gy3.C87412m.m108589b(r6, r3)     // Catch:{ all -> 0x0175 }
            java.lang.String r10 = "autoOpenFinderLive"
            if (r1 != 0) goto L_0x0071
            boolean r1 = gy3.C87412m.m108589b(r6, r10)     // Catch:{ all -> 0x0175 }
            if (r1 != 0) goto L_0x0071
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ all -> 0x0175 }
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch:{ all -> 0x0175 }
            int r1 = r1.orientation     // Catch:{ all -> 0x0175 }
            r11 = 1
            if (r1 == r11) goto L_0x0071
            java.lang.Class<ir.m> r1 = p565ir.C60605m.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ all -> 0x0175 }
            ir.m r1 = (p565ir.C60605m) r1     // Catch:{ all -> 0x0175 }
            if (r1 == 0) goto L_0x0071
            r1.J50()     // Catch:{ all -> 0x0175 }
        L_0x0071:
            if (r6 == 0) goto L_0x0150
            int r1 = r6.hashCode()     // Catch:{ all -> 0x0175 }
            java.lang.String r11 = "appid"
            switch(r1) {
                case -1167465866: goto L_0x013f;
                case -1160307446: goto L_0x0122;
                case -412058418: goto L_0x00d0;
                case -411875300: goto L_0x00b0;
                case 50881657: goto L_0x009c;
                case 819909547: goto L_0x007e;
                default: goto L_0x007c;
            }
        L_0x007c:
            goto L_0x0150
        L_0x007e:
            boolean r1 = r6.equals(r10)     // Catch:{ all -> 0x0175 }
            if (r1 != 0) goto L_0x0086
            goto L_0x0150
        L_0x0086:
            di3.d r1 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x0175 }
            ir.n r1 = (p565ir.C60606n) r1     // Catch:{ all -> 0x0175 }
            java.lang.String r3 = ""
            r2 = r4
            r4 = r17
            r5 = r20
            r6 = r21
            r1.mo85023Pn(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0175 }
            r10 = r16
            goto L_0x018b
        L_0x009c:
            java.lang.String r1 = "openFinderProfile"
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x0175 }
            if (r1 != 0) goto L_0x00a6
            goto L_0x0150
        L_0x00a6:
            gy3.C87412m.m108593f(r7, r11)     // Catch:{ all -> 0x0175 }
            r10 = r16
            r10.Vx0(r4, r0, r5, r7)     // Catch:{ all -> 0x0173 }
            goto L_0x018b
        L_0x00b0:
            r10 = r16
            boolean r0 = r6.equals(r3)     // Catch:{ all -> 0x0173 }
            if (r0 != 0) goto L_0x00ba
            goto L_0x0152
        L_0x00ba:
            di3.d r0 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x0173 }
            ir.n r0 = (p565ir.C60606n) r0     // Catch:{ all -> 0x0173 }
            gy3.C87412m.m108593f(r7, r11)     // Catch:{ all -> 0x0173 }
            r1 = r4
            r2 = r18
            r3 = r21
            r4 = r20
            r5 = r7
            r0.mo85081pt(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0173 }
            goto L_0x018b
        L_0x00d0:
            r10 = r16
            java.lang.String r1 = "openFinderFeed"
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x0173 }
            if (r1 != 0) goto L_0x00dc
            goto L_0x0152
        L_0x00dc:
            er1.w3 r1 = er1.C58784w3.f168295a     // Catch:{ all -> 0x0173 }
            boolean r1 = r1.mo83915a1()     // Catch:{ all -> 0x0173 }
            if (r1 == 0) goto L_0x010f
            java.lang.Class<xx.f> r1 = p274xx.C15907f.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ all -> 0x0173 }
            r11 = r1
            xx.f r11 = (p274xx.C15907f) r11     // Catch:{ all -> 0x0173 }
            r12 = 34359738368(0x800000000, double:1.69759663277E-313)
            r14 = 0
            com.tencent.mm.plugin.FinderCommonFeatureService$k r15 = new com.tencent.mm.plugin.FinderCommonFeatureService$k     // Catch:{ all -> 0x0173 }
            r1 = r15
            r2 = r16
            r3 = r4
            r4 = r17
            r5 = r20
            r6 = r7
            r7 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0173 }
            r7 = 3
            r1 = r11
            r2 = r17
            r3 = r12
            r5 = r14
            r6 = r15
            r1.K00(r2, r3, r5, r6, r7)     // Catch:{ all -> 0x0173 }
            goto L_0x018b
        L_0x010f:
            gy3.C87412m.m108593f(r7, r11)     // Catch:{ all -> 0x0173 }
            r6 = 1
            r1 = r16
            r2 = r4
            r3 = r17
            r4 = r20
            r5 = r7
            r7 = r22
            r1.mo76901yF(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0173 }
            goto L_0x018b
        L_0x0122:
            r10 = r16
            java.lang.String r1 = "openFinderMultiMoreLive"
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x0173 }
            if (r1 != 0) goto L_0x012d
            goto L_0x0152
        L_0x012d:
            r6 = 0
            r7 = 8
            r11 = 0
            r1 = r16
            r2 = r4
            r3 = r17
            r4 = r20
            r5 = r6
            r6 = r7
            r7 = r11
            Tx0(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0173 }
            goto L_0x018b
        L_0x013f:
            r10 = r16
            java.lang.String r1 = "openChannelsRewardedVideoAd"
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x0173 }
            if (r1 != 0) goto L_0x014a
            goto L_0x0152
        L_0x014a:
            er1.o4 r1 = er1.C58759o4.f168229a     // Catch:{ all -> 0x0173 }
            r1.mo83763J5(r0, r4, r5, r8)     // Catch:{ all -> 0x0173 }
            goto L_0x018b
        L_0x0150:
            r10 = r16
        L_0x0152:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0173 }
            r0.<init>()     // Catch:{ all -> 0x0173 }
            java.lang.String r1 = "unKnow action:"
            r0.append(r1)     // Catch:{ all -> 0x0173 }
            r0.append(r6)     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0173 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ all -> 0x0173 }
            if (r8 == 0) goto L_0x018b
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0173 }
            r8.mo6382a(r0)     // Catch:{ all -> 0x0173 }
            goto L_0x018b
        L_0x0173:
            r0 = move-exception
            goto L_0x0178
        L_0x0175:
            r0 = move-exception
            r10 = r16
        L_0x0178:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "enterFinderUI exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r2, r1)
            if (r8 == 0) goto L_0x018b
            r0 = -1002(0xfffffffffffffc16, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.mo6382a(r0)
        L_0x018b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonFeatureService.mo76906zn(android.content.Context, boolean, java.lang.String, ht1.z4$a, ht1.z4$a, ht1.z4$a):void");
    }

    /* renamed from: zu */
    public void mo76907zu(FinderObject finderObject, String str) {
        C87412m.m108594g(finderObject, "feed");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        Log.m105924i("Finder.FinderCommonFeatureService", "[updateFinderCache] feed=" + C61926c.m72691p(finderObject.f164794id) + " source=" + str);
        C65834e eVar = C65834e.f189316a;
        FinderItem a = FinderItem.Companion.mo79056a(finderObject, 0);
        C65834e.C65836b bVar = C65834e.C65836b.f189322b;
        eVar.mo89878l(a, C65834e.C65836b.f189330j);
    }

    public final void zx0() {
        this.f157792T.alive();
        if (!this.f157793U) {
            boolean sF = mo76873sF();
            C37521f.f99374d.getClass();
            boolean z = C37521f.f99195I3.mo60266n().intValue() == 1;
            StringBuilder sb = new StringBuilder();
            sb.append("[doSomethingImportantOnStart] ");
            C66785b bVar = C66785b.f191882e;
            sb.append(bVar.mo90662O5());
            sb.append(" isDoSomethingCompleted=");
            sb.append(this.f157793U);
            sb.append(", isShowFinderEntry=");
            sb.append(sF);
            sb.append(" FIX_REINIT_SELECTOR_ENABLE_VALUE=");
            sb.append(z);
            Log.m105924i("Finder.FinderCommonFeatureService", sb.toString());
            if (sF) {
                this.f157793U = true;
                C66607f fVar = (C66607f) ((C36570n) this.f157782I).getValue();
                fVar.getClass();
                bVar.mo75316W2().f152701f.add(fVar);
                bVar.mo75316W2().f152702g.add(fVar);
                bVar.mo75316W2().f152703h.add(new C15961d());
                bVar.mo75316W2().f152703h.add(new C15959b());
                AppForegroundDelegate.INSTANCE.mo174208a(fVar);
                C85801v1 i = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_USER_HARD_REINIT_INT_SYNC;
                int j = i.mo119689j(aVar, -1);
                C85801v1 i2 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_USER_VERSION_INT_SYNC;
                int j2 = i2.mo119689j(aVar2, 0);
                C85801v1 i3 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_FINDER_REINIT_USER_VERSION_INT_SYNC;
                int j3 = i3.mo119689j(aVar3, 0);
                Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MY_FINDER_REINIT_USERNAME_STRING_SYNC, "");
                C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
                String str = (String) f;
                if (!(j != -1 || j2 == j3 || j3 == 0)) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                    j = 1;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("[isNeedDoReInit] userVersion=");
                sb4.append(j2);
                sb4.append(", reInitUserVersion=");
                sb4.append(j3);
                sb4.append(", reInitUsername=");
                sb4.append(str);
                sb4.append(" isNeedDoReInit=");
                sb4.append(j == 1);
                Log.m105924i("Finder.FinderCommonFeatureService", sb4.toString());
                boolean z2 = j == 1;
                if (!Util.isNullOrNil(bVar.mo90662O5())) {
                    C115669n.INSTANCE.mo175913w(1279, 34, 1);
                }
                if (z2) {
                    int j4 = C86709a0.m107535s().mo121142i().mo119689j(aVar3, 0);
                    try {
                        C115669n.INSTANCE.mo175913w(1279, 21, 1);
                        Log.m105924i("Finder.FinderContactPage", "clearAll");
                        C58784w3 w3Var = C58784w3.f168295a;
                        String W = w3Var.mo83907W(1);
                        if (C86013q1.m106450k(W)) {
                            C86013q1.m106446g(W, true);
                        }
                        C14937o.f40972a.mo13982c();
                        Log.m105924i("Finder.FansContactPage", "clearAll");
                        String W2 = w3Var.mo83907W(3);
                        if (C86013q1.m106450k(W2)) {
                            C86013q1.m106446g(W2, true);
                        }
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SYNC_KEYBUF2_STRING_SYNC, "");
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, "");
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, "");
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_STRING_SYNC, "");
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_LIKE_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_COMMENT_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_FOLLOW_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
                        C39759i iVar = C39759i.FINDER_RE_INIT;
                        bVar.mo90655C2(iVar);
                        bVar.mo90656D2(iVar);
                        C86709a0.m107535s().mo121142i().mo119677K(aVar2, Integer.valueOf(j4));
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_MSG_SYSTEM_INT_SYNC, 0);
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_HOT_LIST_SEARCH_REQUEST_ID_STRING, "");
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
                        C85801v1 i4 = C86709a0.m107535s().mo121142i();
                        C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_FINDER_USER_AUTO_INCREMENT_ID_INT_SYNC;
                        int j5 = i4.mo119689j(aVar4, 0) + 1;
                        C86709a0.m107535s().mo121142i().mo119677K(aVar4, Integer.valueOf(j5));
                        yx0();
                        Log.m105924i("Finder.FinderCommonFeatureService", "[doReInit] reInit done. incrementId=" + j5);
                    } catch (Exception e) {
                        Log.printErrStackTrace("Finder.FinderCommonFeatureService", e, "do ReInit occur error!", new Object[0]);
                        C115669n.INSTANCE.mo175913w(1279, 22, 1);
                    }
                    Log.m105924i("Finder.FinderCommonFeatureService", "[doPrepareUser]... ");
                    C53895h.m60466d(this.f157785L, (C66212f) null, (C53934p0) null, new C13882l0((C15601d<? super C13882l0>) null), 3, (Object) null);
                    if (!z) {
                        this.f157802n.mo84538g(506877, 6, (C49712hj1) null);
                    }
                } else if (Util.isNullOrNil(bVar.mo90662O5())) {
                    C86709a0.m107524d().mo123455a(3930, this);
                    ((C66607f) ((C36570n) this.f157782I).getValue()).mo90653e("without any finder username.");
                    if (!z) {
                        this.f157802n.mo84538g(506365, 6, (C49712hj1) null);
                    }
                }
                if (z) {
                    this.f157802n.mo84538g(506877, 6, (C49712hj1) null);
                }
                C59418i iVar2 = this.f157802n;
                C41409b bVar2 = new C41409b();
                iVar2.getClass();
                C59418i.f169832q.add(bVar2);
                try {
                    Nt0().mo77228H();
                } catch (Exception e2) {
                    Log.printErrStackTrace("Finder.FinderCommonFeatureService", e2, "reddot prepare", new Object[0]);
                }
                C7907w1 w1Var = C7907w1.f26566d;
                w1Var.getClass();
                C86709a0.m107529k().f251779b.mo123455a(3862, w1Var);
                C86709a0.m107529k().f251779b.mo123455a(7143, w1Var);
                C86709a0.m107529k().f251779b.mo123455a(3906, w1Var);
            }
        }
    }
}
