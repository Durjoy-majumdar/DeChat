package uc1;

import ak1.C54059a;
import ak1.C54095l;
import ak1.C54116w;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.widget.ImageView;
import bj1.C28329a;
import bl3.C39818r;
import cj1.C0526c3;
import cj1.C0530d3;
import cj1.C0535e3;
import cj1.C0538f3;
import cj1.C0543g3;
import cj1.C0547h3;
import cj1.C0552i3;
import cj1.C0570m2;
import cj1.C0579o2;
import cj1.C0582p2;
import cj1.C0586q2;
import cj1.C0595s2;
import cj1.C0620t2;
import cj1.C0623u2;
import cj1.C0639y1;
import cj1.C28584r2;
import cj1.C28592u1;
import cj1.C54738b1;
import cj1.C54781k2;
import cj1.C54804r0;
import cj1.C54813s1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.feed.model.C2816v;
import com.tencent.p014mm.plugin.finder.feed.model.C2818w;
import com.tencent.p014mm.plugin.finder.feed.model.C55757d0;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveAnchorAffinityUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveAnchorUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveAnchorWithoutAffinityUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorAffinityUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWithoutAffinityUI;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveConfettiView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderLivePlayView;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.ratio.RatioLayout;
import com.tencent.xweb.file.XVFSFile;
import di0.C86299o;
import di0.C86300q;
import di3.C86301e;
import di3.C86312j;
import dj1.C45366h0;
import eg1.C31577b0;
import eg1.C31598z;
import eg1.C58598w;
import ei3.C86522b;
import er1.C58708d1;
import er1.C58739j4;
import er1.C7878t0;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gg1.C32444a;
import gi1.C59463a;
import gr1.C59670o2;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import ht1.C33062n5;
import ht1.C46108j1;
import ht1.C60172g4;
import ht1.C60200t1;
import ht1.C60211v2;
import ht1.C8772i1;
import ht1.C8779k1;
import ht1.C98520u2;
import iq3.C60600b;
import it1.C60625c;
import j20.C117292a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import je1.C33558n2;
import je1.C60803l;
import je1.C9365q;
import k20.C60958c;
import k20.C9556a;
import kf1.C61046o4;
import kotlin.Result;
import nj3.C76912y0;
import np1.C11255j0;
import np1.C61857d0;
import np1.C61866i0;
import np1.C61882w;
import o40.C61926c;
import ob0.C117747y;
import ok1.C62042e;
import p1081gi.C98123f;
import p564iq.C87790d;
import p565ir.C60606n;
import p663qo.C101213l;
import p749xh.C66261f3;
import pe3.C89349b;
import pl1.C11978e0;
import pl1.C11985o;
import pl1.C11990s0;
import pt1.C35640b;
import qg1.C35848a;
import qg1.C35853z;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import te3.C48722aj0;
import te3.C48833bb1;
import te3.C49098d51;
import te3.C49255ea1;
import te3.C49396f91;
import te3.C49712hj1;
import te3.C50397mg0;
import te3.C50851pn0;
import te3.C51965xf0;
import te3.C64273c21;
import te3.C64373fs0;
import te3.C64650q60;
import te3.C64800wf1;
import tf0.C13887q1;
import tf0.C64916p1;
import u60.C65220d;
import uk1.C65409j;
import up1.C27696y;
import uq1.C65458r;
import vo1.C65770a0;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;
import z04.C112550d0;
import zt3.C119157j;

@C86522b
/* renamed from: uc1.n */
public final class C37407n extends C86301e implements C13887q1 {
    /* renamed from: B5 */
    public void mo13300B5(ImageView imageView, String str, int i) {
        C87412m.m108594g(imageView, "imageView");
        C87412m.m108594g(str, "url");
        C62042e.f176370a.getClass();
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Log.m105924i("FinderLiveUtil", "setBlurBitmap imageView:" + imageView.getId() + ",url:" + str);
        C39818r rVar = C39818r.f106831a;
        ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11873j2().mo85957c(new C11985o(str, C27696y.THUMB_IMAGE), imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
    }

    /* renamed from: C7 */
    public int mo13301C7() {
        float f = (float) C75044y4.m89990b(MMApplicationContext.getContext()).y;
        if (MMApplicationContext.getResources().getConfiguration().orientation == 2) {
            f = (float) C75044y4.m89990b(MMApplicationContext.getContext()).x;
        }
        return ((int) ((((float) C32444a.f86121a.mo58621b()) / 100.0f) * f)) + ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3745cw));
    }

    public void Cg0(String str) {
        C87412m.m108594g(str, "noticeId");
        C2816v vVar = C2816v.f14072a;
        List<C49098d51> list = C2816v.f14075d;
        C87412m.m108593f(list, "createNoticeList");
        C61926c.m72700y(list, new C2818w(str));
    }

    /* renamed from: D0 */
    public boolean mo13303D0() {
        C62042e.f176370a.getClass();
        return ((C87790d) C86312j.m106911c(C87790d.class)).isInstalled("xlab");
    }

    /* renamed from: EM */
    public void mo13304EM(C54095l lVar) {
        C87412m.m108594g(lVar, "liveFeed");
        new C54059a().mo74736e(lVar);
    }

    /* renamed from: EQ */
    public C60625c<C50397mg0> mo13305EQ(List<? extends C64800wf1> list, int i, int i2, int i3, String str, String str2, C64650q60 q602, int i4) {
        C87412m.m108594g(list, "units");
        C87412m.m108594g(str, "finderUserName");
        String str3 = str2;
        C87412m.m108594g(str3, "uxInfo");
        return new C60803l(list, i, i2, i3, str, str3, q602, i4);
    }

    /* renamed from: Eb */
    public String mo13306Eb() {
        C2816v vVar = C2816v.f14072a;
        StringBuffer stringBuffer = new StringBuffer();
        ConcurrentHashMap<String, ArrayList<C2816v.C2817a>> concurrentHashMap = C2816v.f14073b;
        synchronized (concurrentHashMap) {
            for (Map.Entry next : concurrentHashMap.entrySet()) {
                Iterator it = ((ArrayList) next.getValue()).iterator();
                while (it.hasNext()) {
                    stringBuffer.append("[");
                    stringBuffer.append((String) next.getKey());
                    stringBuffer.append(XVFSFile.PATH_SEPARATOR);
                    stringBuffer.append(((C2816v.C2817a) it.next()).f14076a.f132119e);
                    stringBuffer.append("]");
                }
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        C87412m.m108593f(stringBuffer2, "result.toString()");
        return stringBuffer2;
    }

    /* renamed from: Fo */
    public Object mo13307Fo(long j, long j2, int i, String str, C15601d<? super C49255ea1> dVar) {
        return C61866i0.f175909a.mo86798j(j, j2, i, str, dVar);
    }

    /* renamed from: GZ */
    public void mo13308GZ() {
        C62042e.f176370a.mo87106p0().putBoolean("LINK_RED_DOT_ENABLE_KEY", true);
        C62042e.f176370a.mo87106p0().putBoolean("LINK_LINK_MORE_ACTION_RED_DOT_KEY", true);
        C62042e.f176370a.mo87106p0().putBoolean("FRAME_SCALE_TIPS_SHOW_KEY", true);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_BOX_HINT_INT_SYNC, 0);
        C28329a.f77952b = true;
    }

    public String Gc0(long j) {
        return C62042e.f176370a.mo87005G(j);
    }

    /* renamed from: Ho */
    public void mo13310Ho(Context context, FinderObject finderObject, C49712hj1 hj12) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        C54813s1.f153664a.getClass();
        long j = C54813s1.f153673j;
        C64273c21 c212 = finderObject.liveInfo;
        if (j != (c212 != null ? c212.f182392d : 0)) {
            C54813s1.f153673j = c212 != null ? c212.f182392d : 0;
            long j2 = c212 != null ? c212.f182390a1 : 0;
            int i = 0;
            if (C61926c.m72697v(j2, 1)) {
                Log.m105924i("Finder.FinderLiveFeedFlowReporter", "[needJoinLiveOnExposure] true");
                if (C58739j4.f168176a.mo83692U()) {
                    C76912y0.makeText(context, (CharSequence) "当前直播feed曝光即上报", 0).show();
                }
            } else {
                C64273c21 c213 = finderObject.liveInfo;
                if (c213 != null) {
                    i = c213.f182376T;
                }
                i = i > 0 ? c213 != null ? c213.f182376T : C54813s1.f153666c : C54813s1.f153666c;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("startPlayLiveOnFeedFlow: validWatchTime:");
            sb.append(i);
            sb.append(", serverConfigTime:");
            C64273c21 c214 = finderObject.liveInfo;
            sb.append(c214 != null ? Integer.valueOf(c214.f182376T) : null);
            sb.append(", clientValidWatchTime:");
            sb.append(C54813s1.f153666c);
            Log.m105924i("Finder.FinderLiveFeedFlowReporter", sb.toString());
            C54813s1.f153665b = new C28592u1(i, context, finderObject, hj12);
            C54813s1.f153667d.startTimer(((long) i) * 1000, 0);
        }
    }

    public int Id0(Context context, C54738b1 b1Var, String str, String str2, Intent intent, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(b1Var, "config");
        C87412m.m108594g(str, "contextId");
        C87412m.m108594g(str2, "clickTabContextId");
        return C54781k2.f153552a.mo75688i(context, b1Var, str, str2, intent, z, aVar);
    }

    public C60211v2 Iv0(int i, RatioLayout ratioLayout, C32226l<? super Boolean, C13598b0> lVar) {
        return new C61046o4(i, ratioLayout, lVar);
    }

    /* renamed from: J */
    public int mo13313J() {
        return C58739j4.f168176a.mo83673A();
    }

    /* renamed from: J9 */
    public boolean mo13314J9() {
        C62042e.f176370a.getClass();
        return C32444a.f86171m1.mo60266n().intValue() == 0;
    }

    /* renamed from: K5 */
    public long mo13315K5() {
        return C62042e.f176370a.mo87112r0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r6.getDataListJustForAdapter();
     */
    /* renamed from: LA */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.LinkedList<cm1.C0740i2> mo13316LA(com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.C0740i2> r6, int r7, int r8) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x000e
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r6.getDataListJustForAdapter()
            if (r1 == 0) goto L_0x000e
            int r1 = r1.size()
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            if (r8 < r1) goto L_0x0014
            int r2 = r1 + -1
            goto L_0x0019
        L_0x0014:
            if (r8 >= r7) goto L_0x0018
            r2 = r7
            goto L_0x0019
        L_0x0018:
            r2 = r8
        L_0x0019:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "filterData firstItemPos:"
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = " lastItemPos:"
            r3.append(r4)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.String r3 = "Finder.filterData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
            r8 = 1
            if (r7 < 0) goto L_0x003e
            if (r7 >= r1) goto L_0x003e
            r1 = 1
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            r4 = 0
            if (r1 == 0) goto L_0x0070
            if (r6 == 0) goto L_0x0070
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r6 = r6.getDataListJustForAdapter()     // Catch:{ Exception -> 0x0068 }
            if (r6 == 0) goto L_0x0070
            int r1 = r6.size()     // Catch:{ Exception -> 0x0068 }
            if (r1 <= r2) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            if (r8 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r6 = r4
        L_0x0056:
            if (r6 == 0) goto L_0x0070
            my3.j r8 = new my3.j     // Catch:{ Exception -> 0x0068 }
            r8.<init>(r7, r2)     // Catch:{ Exception -> 0x0068 }
            java.util.List r6 = sx3.C110818d0.m150941m0(r6, r8)     // Catch:{ Exception -> 0x0068 }
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch:{ Exception -> 0x0068 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0068 }
            r4 = r7
            goto L_0x0070
        L_0x0068:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.String r8 = "filterData fail"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r6, r8, r7)
        L_0x0070:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uc1.C37407n.mo13316LA(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, int, int):java.util.LinkedList");
    }

    /* renamed from: LT */
    public C60625c<C50397mg0> mo13317LT(List<C13604l<Long, String>> list, int i, int i2, String str, String str2) {
        C87412m.m108594g(list, "objectIds");
        C87412m.m108594g(str, "finderUserName");
        C87412m.m108594g(str2, "uxInfo");
        return new C60803l(list, i, i2, str, str2);
    }

    /* renamed from: LX */
    public void mo13318LX(LinkedList<C64373fs0> linkedList) {
        C62042e.f176370a.mo87016J1(linkedList);
    }

    /* renamed from: Lr */
    public void mo13319Lr(Context context, FinderObject finderObject, C49712hj1 hj12, boolean z) {
        C87412m.m108594g(context, "context");
        C54813s1.f153664a.mo75774d(context, finderObject, hj12, z);
    }

    /* renamed from: MZ */
    public void mo13320MZ(int i, int i2, int i3) {
        ((C54116w) C86312j.m106911c(C54116w.class)).Wx0(i, i2, i3);
    }

    /* renamed from: Mx */
    public void mo13321Mx(C72963f4 f4Var) {
        C87412m.m108594g(f4Var, "newMsgInfo");
        C31577b0 b0Var = C31577b0.f84386a;
        ((C119157j) C119157j.f356862d).mo183870a(new C31598z(f4Var));
    }

    /* renamed from: Pi */
    public void mo13322Pi(C45795b bVar, C86299o oVar, boolean z) {
        C87412m.m108594g(oVar, "bundle");
        C61882w.f175962a.mo86816c(bVar, oVar, z);
    }

    /* renamed from: QM */
    public void mo13323QM(Context context, C54738b1 b1Var, String str, String str2, Intent intent) {
        C54781k2 f;
        C54781k2 d;
        C54781k2 g;
        C54781k2 e;
        C54781k2 h;
        C54781k2 a;
        C54781k2 b;
        T t;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(b1Var, "config");
        C87412m.m108594g(str, "contextId");
        C87412m.m108594g(str2, "clickTabContextId");
        C54781k2 k2Var = C54781k2.f153552a;
        k2Var.getClass();
        C65770a0.f189184r.mo89820b();
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = str;
        boolean z = false;
        if (str.length() == 0) {
            C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(context);
            if (gr02 == null || (t = gr02.mo12866v3()) == null) {
                t = "";
            }
            f0Var.f27484d = t;
            Log.m105924i("Finder.LiveJumpChecker", "goAnchorUIWithCheck locContextId:" + ((String) f0Var.f27484d));
        }
        C8479f0 f0Var2 = new C8479f0();
        T string = context.getResources().getString(C0966R.string.f8028zq);
        C87412m.m108593f(string, "context.resources.getStr…mmui.R.string.app_i_know)");
        f0Var2.f27484d = string;
        C54781k2 k2Var2 = null;
        if (!WeChatBrands.Business.Entries.SessionChannels.checkAvailable(context)) {
            k2Var = null;
        }
        if (k2Var != null) {
            C0570m2 m2Var = new C0570m2(context, f0Var2);
            C62042e.f176370a.getClass();
            if (!C62042e.f176374e && C85875k4.m106210y()) {
                z = true;
            }
            if (z) {
                m2Var.invoke();
            } else {
                k2Var2 = k2Var;
            }
            if (k2Var2 != null && (f = k2Var2.mo75685f(new C0579o2(context, f0Var2))) != null && (d = f.mo75683d(new C0582p2(context))) != null && (g = d.mo75686g(new C0586q2(context))) != null && (e = g.mo75684e(context, true, new C28584r2(b1Var, context, f0Var, intent))) != null && (h = e.mo75687h(context, new C0595s2(context))) != null && (a = h.mo75680a(new C0620t2(context))) != null && (b = a.mo75681b(true, new C0623u2(context))) != null) {
                b.mo75689j(context, b1Var, (String) f0Var.f27484d, str2, intent);
            }
        }
    }

    /* renamed from: QR */
    public LiveConfig mo13324QR(FinderObject finderObject, int i, boolean z) {
        C87412m.m108594g(finderObject, "obj");
        return C58708d1.f168058a.mo83618a(finderObject, i, z);
    }

    /* renamed from: QY */
    public void mo13325QY(String str, String str2, C49098d51 d512) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "noticeId");
        C87412m.m108594g(d512, "liveNoticeInfo");
        C2816v.f14072a.mo2912a(str, str2, d512);
    }

    /* renamed from: Qt */
    public String mo13326Qt(int i) {
        String b = C7878t0.m8033b(i);
        C87412m.m108593f(b, "formatLiveCardNumberMillion(number)");
        return b;
    }

    /* renamed from: RX */
    public void mo13327RX() {
        C28329a.f77952b = true;
    }

    public Class<? extends C59670o2> S40() {
        return FinderLivePlayView.class;
    }

    /* renamed from: Sg */
    public Object mo13329Sg(String str, String str2, C15601d<? super Boolean> dVar) {
        boolean z = true;
        C61866i0.f175909a.getClass();
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        C86009m1 m1Var = new C86009m1(str2);
        if (m1Var.mo119967g()) {
            Result.Companion companion = Result.Companion;
            hVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        } else {
            C98123f fVar = new C98123f();
            fVar.f287660d = "task_FinderCdnDownloader";
            C86013q1.m106445f(m1Var.mo119973k());
            C86013q1.m106461v(m1Var.mo119973k());
            C0639y1 y1Var = C0639y1.f1510a;
            C87412m.m108594g(str, "imageUrl");
            C87412m.m108594g(str2, "tmpFilePath");
            try {
                String host = new URL(str).getHost();
                int f = C81035d.m98965f(host, false, new ArrayList());
                int f2 = C81035d.m98965f(host, true, new ArrayList());
                fVar.field_mediaId = MD5Util.getMD5String(str);
                fVar.f287631R = str;
                fVar.f287633S = host;
                fVar.f287635U = str2;
                fVar.f287638X = f;
                fVar.f287639Y = f2;
                fVar.f287640Z = false;
                fVar.f287641p0 = "" + ConnectivityCompat.Companion.getCompatMixStrength$default(ConnectivityCompat.Companion, false, 1, (Object) null);
                fVar.f287642x0 = "";
                fVar.f287630Q0 = 150;
                fVar.f287632R0 = 20201;
                Log.m105925i("Finder.FinderLiveGiftLoader", "attachPagTaskInfo imageUrl:%s", str);
            } catch (MalformedURLException e) {
                Log.printErrStackTrace("Finder.FinderLiveGiftLoader", e, "", new Object[0]);
                Log.m105928w("Finder.FinderLiveGiftLoader", "attachPagTaskInfo fail:" + e);
                z = false;
            }
            if (z) {
                fVar.f287662f = new C11255j0(new C8477a0(), hVar);
                if (((C101213l) C86312j.m106911c(C101213l.class)).xf0(fVar)) {
                    Log.m105924i("ShoppingUtil", "fetchEcResource SubCoreCdnTransport addRecvTask " + str + ' ' + str2 + " suc");
                } else {
                    Log.m105928w("ShoppingUtil", "fetchEcResource SubCoreCdnTransport addRecvTask " + str + ' ' + str2 + " failed");
                }
            } else {
                Log.m105928w("ShoppingUtil", "fetchEcResource attachSnsImgTaskInfo " + str + " failed");
                Result.Companion companion2 = Result.Companion;
                hVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
            }
        }
        return hVar.mo90314b();
    }

    /* renamed from: Tz */
    public C60625c<C49396f91> mo13330Tz(C89349b bVar, int i, float f, float f2, C8779k1 k1Var) {
        C87412m.m108594g(k1Var, "callback");
        return new C35853z(bVar, i, f, f2, k1Var);
    }

    /* renamed from: Ut */
    public List<String> mo13331Ut(String str) {
        C87412m.m108594g(str, "str");
        return C112550d0.m153785U(str, new String[]{","}, false, 0, 6, (Object) null);
    }

    public void Ut0(boolean z) {
        C65770a0.f189184r.mo89820b();
    }

    /* renamed from: W8 */
    public C59670o2 mo13333W8(Context context) {
        C87412m.m108594g(context, "context");
        return new FinderLivePlayView(context);
    }

    /* renamed from: XI */
    public String[] mo13334XI() {
        return new String[]{FinderLiveAnchorUI.class.getName(), FinderLiveAnchorAffinityUI.class.getName(), FinderLiveAnchorWithoutAffinityUI.class.getName(), FinderLiveVisitorAffinityUI.class.getName(), FinderLiveVisitorWithoutAffinityUI.class.getName()};
    }

    public C60625c<Object> Xm0(String str, String str2, C8772i1 i1Var) {
        C87412m.m108594g(str, "toUserName");
        C87412m.m108594g(str2, "msgContent");
        return ((C13887q1) C86312j.m106911c(C13887q1.class)).Xm0(str, str2, i1Var);
    }

    /* renamed from: Y2 */
    public boolean mo13336Y2() {
        return C62042e.f176370a.mo87027N0();
    }

    /* renamed from: YF */
    public List<C86299o> mo13337YF(C48833bb1 bb12) {
        return C62042e.f176370a.mo87121u0(bb12);
    }

    public boolean Zh0(long j) {
        C62042e.f176370a.getClass();
        return C61926c.m72696u((int) j, 1);
    }

    public C60625c<C48722aj0> c90(String str, C49098d51 d512, int i, C49712hj1 hj12) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(d512, "noticeInfo");
        return new C9365q(str, d512, i, hj12);
    }

    /* renamed from: cL */
    public String mo13340cL(long j) {
        return C62042e.f176370a.mo87005G(j);
    }

    /* renamed from: cR */
    public boolean mo13341cR(int i, int i2, BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C54813s1.f153664a.getClass();
        C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
        String str = liveInfo != null ? liveInfo.f182395g : null;
        if (str == null || str.length() == 0) {
            return false;
        }
        return i == 1 || i == 3 || i == 4 || i2 == 1;
    }

    public C65220d gq0(String str, String str2) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(str2, "userName");
        return new C65458r(str, str2);
    }

    /* renamed from: h4 */
    public C49098d51 mo13343h4(String str, String str2) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "noticeId");
        return C2816v.f14072a.mo2915d(str, str2);
    }

    public void ho0(Point point) {
        C87412m.m108594g(point, "size");
        FinderLiveService.f159376d.mo77607H(point);
    }

    /* renamed from: i9 */
    public C60600b<C59463a> mo13345i9(int i) {
        return new C65409j(i);
    }

    /* renamed from: ib */
    public boolean mo13346ib() {
        return C65770a0.f189184r.mo89819a().f189189c != null;
    }

    public C60625c<C50851pn0> k60(String str, C46108j1 j1Var) {
        C87412m.m108594g(str, "username");
        return new C45366h0(str, j1Var);
    }

    /* renamed from: kt */
    public int mo13348kt() {
        C2816v vVar = C2816v.f14072a;
        return C2816v.f14075d.size();
    }

    /* renamed from: lV */
    public void mo13349lV(Context context, Intent intent, boolean z) {
        C54781k2 f;
        C54781k2 d;
        C54781k2 g;
        C54781k2 h;
        C54781k2 a;
        C87412m.m108594g(context, "context");
        C54781k2 k2Var = C54781k2.f153552a;
        k2Var.getClass();
        C8479f0 f0Var = new C8479f0();
        T string = context.getResources().getString(C0966R.string.f8028zq);
        C87412m.m108593f(string, "context.resources.getStr…mmui.R.string.app_i_know)");
        f0Var.f27484d = string;
        if (!WeChatBrands.Business.Entries.SessionChannels.checkAvailable(context)) {
            k2Var = null;
        }
        if (k2Var != null && (f = k2Var.mo75685f(new C0526c3(context, f0Var))) != null && (d = f.mo75683d(new C0530d3(context))) != null && (g = d.mo75686g(new C0535e3(context))) != null) {
            C0538f3 f3Var = new C0538f3(context);
            if (((C60606n) C86312j.m106911c(C60606n.class)).mo85002F()) {
                f3Var.invoke();
                g = null;
            }
            if (g != null && (h = g.mo75687h(context, new C0543g3(context))) != null && (a = h.mo75680a(new C0547h3(context))) != null && a.mo75681b(false, C0552i3.f1341d) != null) {
                if (intent == null) {
                    intent = new Intent();
                }
                boolean z2 = context instanceof Activity;
                Intent intent2 = !z2 ? intent : null;
                if (intent2 != null) {
                    intent2.addFlags(268435456);
                }
                intent.setClass(context, (Class) ((C36570n) C35640b.f95279J).getValue());
                if (z2) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(1010);
                    aVar.mo10233c(intent);
                    C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoFinderReplayUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                } else {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    Context context2 = context;
                    C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoFinderReplayUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoFinderReplayUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                Activity activity = z2 ? (Activity) context : null;
                if (activity != null) {
                    activity.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
                }
                boolean booleanExtra = intent.getBooleanExtra("KEY_PARAMS_NEED_CLOSE_LIVE", true);
                if (booleanExtra) {
                    FinderLiveService.m63768J(FinderLiveService.f159376d, false, (C32224a) null, 3, (Object) null);
                }
                Log.m105924i("Finder.LiveJumpChecker", "context:" + context + ",is activity:" + z2 + ",needCloseLive:" + booleanExtra + '!');
            }
        }
    }

    public C86300q m70(C45795b bVar, C33062n5 n5Var) {
        return new C61857d0(bVar, n5Var);
    }

    /* renamed from: n5 */
    public C60625c<C51965xf0> mo13351n5(String str, String str2, int i, C49712hj1 hj12, int i2) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "noticeId");
        return new C35848a(str, str2, i, hj12, Integer.valueOf(i2));
    }

    /* renamed from: oU */
    public void mo13352oU(long j) {
        C55757d0.f158739y = j;
    }

    /* renamed from: oq */
    public ArrayList<List<String>> mo13353oq(int i, int i2, boolean z) {
        return C62042e.f176370a.mo87072d0(i, i2, z);
    }

    /* renamed from: pC */
    public void mo13354pC(long j) {
        int i = C58598w.f167764h;
        C58598w.f167765i = j;
    }

    public void pm0(long j) {
        int i = C58598w.f167764h;
        C58598w.f167766j = j;
    }

    /* renamed from: qM */
    public void mo13356qM(C49098d51 d512) {
        T t;
        C2816v vVar = C2816v.f14072a;
        if (d512 != null) {
            List<C49098d51> list = C2816v.f14075d;
            C87412m.m108593f(list, "createNoticeList");
            synchronized (list) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Util.isEqual(((C49098d51) t).f132122h, d512.f132122h)) {
                        break;
                    }
                }
            }
            if (t == null) {
                C2816v.f14075d.add(d512);
            }
        }
    }

    /* renamed from: s2 */
    public C98520u2 mo13357s2(Context context) {
        C87412m.m108594g(context, "context");
        return new FinderLiveConfettiView(context);
    }

    /* renamed from: sY */
    public void mo13358sY(boolean z) {
        FinderLiveService.m63768J(FinderLiveService.f159376d, z, (C32224a) null, 2, (Object) null);
    }

    /* renamed from: tY */
    public Object mo13359tY(long j, String str, long j2, C15601d<? super Boolean> dVar) {
        return C54804r0.f153631a.mo75760a(j, str, j2, 6, 0, 0, "", "", dVar);
    }

    public C49098d51 td0(String str) {
        C87412m.m108594g(str, "userName");
        return C2816v.f14072a.mo2914c(str);
    }

    public int vl0() {
        C61882w.f175962a.getClass();
        return ((Number) ((C36570n) C61882w.f175967f).getValue()).intValue();
    }

    /* renamed from: wc */
    public void mo13362wc(LinkedList<C49098d51> linkedList) {
        C2816v vVar = C2816v.f14072a;
        List<C49098d51> list = C2816v.f14075d;
        list.clear();
        if (linkedList != null) {
            list.addAll(linkedList);
        }
    }

    public C117747y y30(String str, String str2, int i, C49712hj1 hj12, String str3, Integer num, Long l) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "noticeId");
        return new C33558n2(str, str2, i, hj12, str3, num, l);
    }

    /* renamed from: y6 */
    public void mo13364y6(boolean z, boolean z2) {
        C62042e.f176370a.mo87064a2(z, z2);
    }
}
