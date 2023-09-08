package com.tencent.p014mm.plugin;

import ak1.C54067f0;
import ak1.C79586g;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.C67092e0;
import androidx.recyclerview.widget.RecyclerView;
import bd1.C0264h;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C0751m0;
import cm1.C28617v1;
import co1.C55048e;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DestroyPreloadedWebViewEvent;
import com.tencent.p014mm.autogen.events.JSApiOpenSpecificViewEvent;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAffinityUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager;
import com.tencent.p014mm.plugin.finder.view.C4011a;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.plugin.finder.view.C56660w0;
import com.tencent.p014mm.plugin.finder.view.FinderBottomCustomDialogHelper;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.MiniAppInfo;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.file.XVFSFile;
import df1.C7322a;
import di0.C86299o;
import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import do1.C31226m;
import do1.C58329a;
import do1.C58341h;
import dp1.C45435i2;
import dp1.C58411u;
import dp1.C58417y0;
import dp1.C7435f2;
import eb0.C31543z5;
import ei3.C86522b;
import er1.C31673h3;
import er1.C58684b;
import er1.C58723f3;
import er1.C58739j4;
import er1.C58741j5;
import er1.C58744l;
import er1.C58749n1;
import er1.C58759o4;
import er1.C58771q3;
import er1.C58775t;
import er1.C58784w3;
import er1.C7840n;
import er1.C7887v;
import er1.C7888v2;
import f40.C86709a0;
import fe1.C32026j;
import fe1.C58959b;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import gg1.C32444a;
import gr1.C45946r0;
import gs3.C59698c;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import he1.C59868u;
import hp1.C8703w0;
import hp3.C87581a;
import ht1.C60151b;
import ht1.C60152b4;
import ht1.C60166f;
import ht1.C60172g4;
import ht1.C60192p2;
import ht1.C60200t1;
import ht1.C60204t3;
import ht1.C60206u1;
import ht1.C60216z4;
import ht1.C8777j5;
import it1.C60625c;
import it1.C60628i;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je1.C46520g3;
import je1.C46534r2;
import je1.C46547x1;
import je1.C9320i4;
import je1.C9369r0;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import ke3.C88144b;
import kf1.C61039l5;
import kf1.C61054p8;
import kf1.C9781h9;
import kf1.C9818k2;
import kg3.C76577a;
import kr0.C76630x0;
import kt1.C61166a;
import nj3.C76875f0;
import nj3.C76912y0;
import ns3.C11266d;
import o40.C61926c;
import ob0.C89132b;
import od3.C62001a;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import os1.C35279a;
import os1.C35283c;
import p204mr.C34645j;
import p244tt.C14088e;
import p464ck.C28601c;
import p464ck.C28602d;
import p599lr.C61381b;
import p629ny.C76979h;
import p749xh.C66261f3;
import p823sg.C101614i;
import pe3.C89349b;
import pf1.C11920q;
import pf1.C62262d0;
import pl1.C11977d0;
import rs1.C101459n1;
import rs1.C13442s8;
import rs1.C13539y3;
import rs1.C63567m1;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C13605o;
import rx3.C36570n;
import sf1.C13671a;
import sx3.C26236u;
import te3.C48978cb0;
import te3.C49098d51;
import te3.C49236e51;
import te3.C49316ep1;
import te3.C49704hh0;
import te3.C49712hj1;
import te3.C49946j51;
import te3.C50008jm0;
import te3.C50019jp1;
import te3.C50428mo1;
import te3.C50717oq2;
import te3.C51583uq0;
import te3.C51691vg0;
import te3.C51810wb1;
import te3.C51833wh0;
import te3.C51869ws0;
import te3.C51978xi1;
import te3.C52271zj0;
import te3.C64284cg;
import te3.C64414h71;
import te3.C64426ho2;
import te3.C64586nn1;
import te3.C64623p81;
import te3.C64728tj0;
import te3.C64777vl1;
import te3.C64831xk1;
import te3.C64837xq2;
import tf0.C13887q1;
import tf0.C52339p0;
import tf0.C64915o0;
import tf0.C64916p1;
import tr1.C78080i;
import up1.C37521f;
import up1.C65416i;
import up1.C65426w0;
import ve1.C14590p;
import ve1.C65604i;
import vp1.C14947w;
import vq1.C65861r;
import wi0.C91003z;
import wl1.C66138a;
import wp1.C15585f;
import wp1.C66167g;
import wr1.C66184f;
import yc1.C66606e;
import yc1.C66607f;
import yn1.C16055a;
import zc1.C66785b;
import zn1.C16309a;
import zp3.C79406f;
import zt3.C119157j;

@C86522b
/* renamed from: com.tencent.mm.plugin.FinderCommonBaseFeatureService */
public final class FinderCommonBaseFeatureService extends C86301e implements C64916p1, C34645j {

    /* renamed from: d */
    public final IListener<DestroyPreloadedWebViewEvent> f157769d;

    /* renamed from: e */
    public final IListener<JSApiOpenSpecificViewEvent> f157770e;

    /* renamed from: f */
    public final Set<MMFinderUI> f157771f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g */
    public final Set<MMFinderUI> f157772g = Collections.synchronizedSet(new HashSet());

    /* renamed from: com.tencent.mm.plugin.FinderCommonBaseFeatureService$a */
    public static final class C29068a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32226l<C89132b.C89134c<C50008jm0>, C13598b0> f79619a;

        public C29068a(C32226l<? super C89132b.C89134c<C50008jm0>, C13598b0> lVar) {
            this.f79619a = lVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C32226l<C89132b.C89134c<C50008jm0>, C13598b0> lVar = this.f79619a;
            if (lVar == null) {
                return null;
            }
            C87412m.m108593f(cVar, "result");
            lVar.invoke(cVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.FinderCommonBaseFeatureService$b */
    public static final class C55397b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C55397b f157773d = new C55397b();

        public C55397b() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (Settings.System.getInt(MMApplicationContext.getContext().getContentResolver(), "accelerometer_rotation", 1) != 1) {
                z = false;
            }
            C13539y3.f38388C = z;
            Log.m105924i("FinderVideoOrientationUIC", "checkSysAllowRotate: systemEnableLandscape = " + C13539y3.f38388C);
            C28602d dVar = C28602d.f78490a;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C59868u uVar = new C59868u(context);
            ArrayList arrayList = dVar.mo56079a().get(0);
            if (arrayList == null) {
                arrayList = new ArrayList();
                dVar.mo56079a().put(0, arrayList);
            }
            if (arrayList.size() == 0) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < 10; i++) {
                    arrayList2.add(uVar.mo14334g(0));
                }
                Log.m105924i("DanmakuHolderPool", "preloadTextDanmakuHolder: size = " + arrayList2.size());
                CommonKt.uiThread(new C28601c(arrayList2));
            }
            return C13598b0.f38549a;
        }
    }

    public FinderCommonBaseFeatureService() {
        C40008f fVar = C40008f.f107254d;
        this.f157769d = new FinderCommonBaseFeatureService$destroyPreloadedWebViewListener$1(fVar);
        this.f157770e = new FinderCommonBaseFeatureService$openSpecificViewEvent$1(fVar);
    }

    /* renamed from: AJ */
    public void mo76649AJ(long j, int i) {
        ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83275AJ(j, i);
    }

    /* renamed from: AV */
    public boolean mo76650AV(String str) {
        C65861r rVar = C65861r.f189395e;
        return C65861r.m77586b(C65861r.f189395e, str, false, false, 6, (Object) null);
    }

    public BaseFinderFeed B40(FinderItem finderItem) {
        C87412m.m108594g(finderItem, C66261f3.COL_FINDEROBJECT);
        return C15585f.f42211a.mo14348k(finderItem);
    }

    /* renamed from: BO */
    public void mo76652BO(AppCompatActivity appCompatActivity, String str, C76875f0 f0Var, FinderItem finderItem, C32226l<? super List<String>, C13598b0> lVar) {
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        String str2 = str;
        C76875f0 f0Var2 = f0Var;
        FinderItem finderItem2 = finderItem;
        C87412m.m108594g(appCompatActivity, "context");
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(f0Var, "menu");
        C87412m.m108594g(finderItem, "feedObject");
        Log.m105918d("MircoMsg.FinderRecentForwardUtils", "showForwardConfirmDialog() called with: context = " + appCompatActivity + ", userName = " + str + ", menu = " + f0Var + ", feedObject = " + finderItem);
        C7888v2.C7889a aVar = C7888v2.f26513a;
        Bundle bundle = new Bundle();
        AppCompatActivity appCompatActivity3 = appCompatActivity;
        C61054p8 p8Var = new C61054p8(appCompatActivity3, str, finderItem, f0Var, lVar);
        aVar.getClass();
        aVar.mo9015m(appCompatActivity3, finderItem, bundle, 3, true, p8Var);
    }

    public FinderItem Br0(long j) {
        return ((C58417y0) C86312j.m106911c(C58417y0.class)).Br0(j);
    }

    public C55718s0 Ck0(C51978xi1 xi12, String str, HashSet<String> hashSet, boolean z, C13604l<C55718s0, ? extends C64586nn1> lVar, C32226l<? super C55718s0, C13598b0> lVar2) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        HashSet<String> hashSet2 = hashSet;
        C87412m.m108594g(hashSet2, "changePathSet");
        return C60152b4.C8759a.m8561a(((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0(), xi12, str, hashSet2, z, lVar, lVar2, 0, false, 192, (Object) null);
    }

    /* renamed from: Cu */
    public String mo76655Cu(long j, int i) {
        return ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(j, i);
    }

    /* renamed from: D0 */
    public boolean mo76656D0() {
        return ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13303D0();
    }

    /* renamed from: EE */
    public boolean mo76657EE(String str) {
        return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76747EE(str);
    }

    /* renamed from: FS */
    public void mo76658FS(int i, C32226l<? super C60628i, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        C66785b.f191882e.mo90664S(i).mo9225i();
    }

    /* renamed from: G5 */
    public C55718s0 mo76659G5(String str) {
        C87412m.m108594g(str, "path");
        return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77227G5(str);
    }

    public void G50(MMFinderUI mMFinderUI) {
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(mMFinderUI, "finder");
        this.f157771f.remove(mMFinderUI);
        FinderCommonFeatureService finderCommonFeatureService = (FinderCommonFeatureService) C86312j.m106911c(cls);
        finderCommonFeatureService.getClass();
        Log.m105924i("Finder.FinderCommonFeatureService", "onExitFinder finder:" + mMFinderUI);
        FinderFolderClearManager.f161637a.getClass();
        int i = FinderFolderClearManager.f161641e + -1;
        FinderFolderClearManager.f161641e = i;
        if (i < 0) {
            FinderFolderClearManager.f161641e = 0;
        }
        ((C11266d) C86312j.m106911c(C11266d.class)).mo9192fp(mMFinderUI);
        if (!finderCommonFeatureService.f157791S.q90()) {
            C79586g.f233383a.mo109701a(0);
            ((C60206u1) C86312j.m106911c(C60206u1.class)).mo60952g8(false);
            finderCommonFeatureService.f157791S.mo76665I8();
            C58784w3.f168295a.getClass();
            C58784w3.f168308n = true;
            C58411u.f167342a = "";
            C58411u.f167343b = "";
            C35279a aVar = (C35279a) C39818r.f106831a.mo62446e(cls).mo75002a(C35279a.class);
            aVar.getClass();
            ((C119157j) C119157j.f356862d).mo183876g(new C35283c(aVar), "Finder.18054CacheVM");
            if (!C16055a.f43185a.mo14671a()) {
                ((C119157j) C119157j.f356862d).mo183895z(C64915o0.f186946d);
            }
            C59698c.f170541a.mo84677a("onExitFinder");
            ((C60192p2) C86312j.m106911c(C60192p2.class)).mo85192OA();
            C16309a aVar2 = C16309a.f43609a;
            Log.m105924i("Finder.FinderPlayListCache", "clearCache all");
            synchronized (aVar2) {
                ((LinkedHashMap) C16309a.f43610b).clear();
                ((LinkedHashMap) C16309a.f43611c).clear();
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C15585f.f42212b.clear();
            C15585f.f42213c.clear();
            C15585f.f42214d.clear();
        }
        C55048e Hx0 = finderCommonFeatureService.Hx0();
        if (Hx0.f154545K.size() >= 3000) {
            Hx0.f154545K.clear();
        }
        if (C86709a0.m107522a()) {
            ((C60204t3) C86312j.m106911c(C60204t3.class)).B50(mMFinderUI);
        }
    }

    /* renamed from: GH */
    public void mo76661GH(MMFinderUI mMFinderUI) {
        Class cls = FinderCommonFeatureService.class;
        Class cls2 = C60204t3.class;
        C87412m.m108594g(mMFinderUI, "finder");
        boolean remove = this.f157772g.remove(mMFinderUI);
        ((C60204t3) C86312j.m106911c(cls2)).mo78740AG(mMFinderUI);
        if (remove && this.f157772g.size() == 0) {
            FinderStreamTabPreloadCore finderStreamTabPreloadCore = (FinderStreamTabPreloadCore) C39818r.f106831a.mo62446e(cls).mo75002a(FinderStreamTabPreloadCore.class);
            finderStreamTabPreloadCore.getClass();
            for (C58341h hVar : finderStreamTabPreloadCore.f160333e) {
                hVar.getClass();
                C37521f.f99374d.getClass();
                boolean z = false;
                boolean z2 = C37521f.f99407g6.mo60266n().intValue() == 1;
                String str = hVar.f167027c;
                Log.m105924i(str, "performFinderBackground: exitPreloadOpen=" + z2 + ", tabType=" + hVar.f167025a + ", exitActivity=" + mMFinderUI.getClass().getSimpleName());
                hVar.f167028d = false;
                if (z2 && hVar.f167025a == 4 && (C87412m.m108589b(mMFinderUI.getClass(), FinderHomeAffinityUI.class) || C87412m.m108589b(mMFinderUI.getClass(), FinderHomeUI.class))) {
                    if (hVar.f167040p.f167044b != null) {
                        z = true;
                    }
                    String str2 = hVar.f167027c;
                    Log.m105924i(str2, "performFinderBackground: hasCache=" + z);
                    if (!z) {
                        C58341h.m67552q(hVar, C58341h.C58344f.ExitFinderHome, (Intent) null, new C31226m(hVar), 2, (Object) null);
                    }
                }
                if (hVar.f167031g.get() && !hVar.f167030f.get() && hVar.f167025a == hVar.f167026b.mo78459i3()) {
                    C58329a.m67539b(hVar.f167029e, hVar.f167036l, hVar.mo83090f(), "performFinderBackground", (C58329a.C58330a) null, 8, (Object) null);
                }
            }
            if (((C60204t3) C86312j.m106911c(cls2)).iu0(mMFinderUI)) {
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
                Log.m105924i("Finder.RedDotManager", "onFinderHomeTaskBackground:");
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, Long.valueOf(C31543z5.m39453c()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r0 == null) goto L_0x0040;
     */
    /* renamed from: GJ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo76662GJ(java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            er1.w3 r0 = er1.C58784w3.f168295a
            r0.getClass()
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r0.get(r4)
            if (r0 == 0) goto L_0x002b
            long r1 = r0.f108320R1
            int r2 = (int) r1
            if (r2 == 0) goto L_0x002b
            java.lang.String r1 = r0.mo62898f()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x002b
            java.lang.String r0 = r0.mo62898f()
            goto L_0x0042
        L_0x002b:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r1 != 0) goto L_0x0036
            if (r5 != 0) goto L_0x0034
            goto L_0x0040
        L_0x0034:
            r0 = r5
            goto L_0x0042
        L_0x0036:
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r0.getUsername()
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r0 != 0) goto L_0x0042
        L_0x0040:
            java.lang.String r0 = ""
        L_0x0042:
            if (r6 == 0) goto L_0x006a
            java.lang.String r6 = er1.C58784w3.f168296b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getDisplayName username "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " nickname "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = " displayName:"
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
        L_0x006a:
            java.lang.String r4 = "displayName"
            gy3.C87412m.m108593f(r0, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonBaseFeatureService.mo76662GJ(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: Gi */
    public boolean mo76663Gi(String str) {
        C87412m.m108594g(str, "mediaId");
        return C66167g.f190173a.mo90234c(str, false).mo76074o2() || FinderPlayerPreloadCore.f160325a.mo78451b(str);
    }

    /* renamed from: Hs */
    public void mo76664Hs(Context context, String str, FinderItem finderItem) {
        C87412m.m108594g(str, "nickname");
        C87412m.m108594g(finderItem, "feedObject");
        C58775t tVar = C58775t.f168276a;
        if (context != null) {
            HashMap<String, FinderContact> hashMap = C58775t.f168278c;
            C49712hj1 hj12 = null;
            if (hashMap.containsKey(str)) {
                FinderContact finderContact = hashMap.get(str);
                String str2 = finderContact != null ? finderContact.username : null;
                if (Util.isNullOrNil(str2) || str2 == null) {
                    Log.m105924i("Finder.FinderAtUtil", "username nil");
                    C76912y0.makeText(context, (int) C0966R.string.d1_, 0).show();
                } else {
                    tVar.mo83823d(str2, context, finderItem, context);
                }
            } else {
                new C9369r0(C26236u.m33719b(str)).mo9225i().mo123420E(new C7887v(str, context, finderItem));
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("nickname", str);
            } catch (JSONException unused) {
            }
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
            if (f != null) {
                hj12 = f.mo12861q3();
            }
            f2Var.mo8577a(hj12, "link_at_profile", 1, jSONObject);
        }
    }

    /* renamed from: I8 */
    public void mo76665I8() {
        Log.m105920e("FinderCommonService", "abandonAudioFocus not support!");
    }

    public boolean J30(int i) {
        C58784w3.f168295a.getClass();
        return i == 1;
    }

    /* renamed from: Js */
    public boolean mo76667Js() {
        return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76736Au().mo73555Js();
    }

    public String L60(String str, LinkedList<C51833wh0> linkedList, ArrayList<C50717oq2> arrayList) {
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(linkedList, "keyInfoList");
        C87412m.m108594g(arrayList, "parseInfoList");
        C58723f3 f3Var = C58723f3.f168122a;
        if (str.length() == 0) {
            return null;
        }
        ThreadLocal<XmlPullParser> threadLocal = C58723f3.C58724a.f168136b;
        String str2 = "<finderComment>" + str + "</finderComment>";
        C87412m.m108594g(str2, "xml");
        C58723f3.C58724a aVar = new C58723f3.C58724a();
        ThreadLocal<XmlPullParser> threadLocal2 = C58723f3.C58724a.f168136b;
        XmlPullParser xmlPullParser = threadLocal2.get();
        if (xmlPullParser == null) {
            xmlPullParser = XmlPullParserFactory.newInstance().newPullParser();
            C87412m.m108593f(xmlPullParser, "newInstance().newPullParser()");
            threadLocal2.set(xmlPullParser);
        }
        xmlPullParser.setInput(new StringReader(str2));
        int eventType = xmlPullParser.getEventType();
        StringBuilder sb = new StringBuilder();
        while (eventType != 1) {
            try {
                int next = xmlPullParser.next();
                if (next == 2) {
                    aVar.mo83643b(xmlPullParser, sb);
                } else if (next == 3) {
                    aVar.mo83642a(xmlPullParser, sb, arrayList);
                } else if (next == 4) {
                    aVar.mo83644c(xmlPullParser, sb, linkedList);
                }
                eventType = next;
            } catch (Exception e) {
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "sb.toString()");
                Log.m105921e("FinderCommentSearchParser", "parse comment xml failed currentParsed %s msg %s stack %s ", sb4, e.getMessage(), Util.stackTraceToString(e));
                if (BuildInfo.DEBUG) {
                    return "!! parse comment xml error !!";
                }
                return null;
            }
        }
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "sb.toString()");
        return sb5;
    }

    /* renamed from: M7 */
    public void mo76669M7(Context context, String str, long j, String str2, Long l, int i) {
        String str3;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "exposeUrl");
        C87412m.m108594g(str2, "username");
        Log.m105924i("FinderExposeLogic", "liveRepalyExpose liveId:" + j + ",exposeUrl:" + str + ",username:" + str2 + ",commentSeq:" + l);
        Intent intent = new Intent();
        intent.putExtra("showShare", false);
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Long.valueOf(j);
        objArr[2] = str2;
        if (l == null || (str3 = l.toString()) == null) {
            str3 = "";
        }
        objArr[3] = str3;
        String format = String.format(str, Arrays.copyOf(objArr, 4));
        C87412m.m108593f(format, "format(format, *args)");
        intent.putExtra("rawUrl", format);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: MT */
    public String mo76670MT(C11977d0 d0Var) {
        C87412m.m108594g(d0Var, "pagFile");
        C58741j5 j5Var = C58741j5.f168184a;
        return C58741j5.f168186c + d0Var.mo11841b() + ".pag";
    }

    /* renamed from: Mk */
    public void mo76671Mk(MMFinderUI mMFinderUI) {
        C87412m.m108594g(mMFinderUI, "finder");
        FinderCommonFeatureService finderCommonFeatureService = (FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class);
        finderCommonFeatureService.getClass();
        Log.m105924i("Finder.FinderCommonFeatureService", "onEnterFinder finder:" + mMFinderUI);
        C14947w wVar = C14947w.f40984a;
        C14947w.f40985b = SystemClock.uptimeMillis();
        ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12414g();
        FinderFolderClearManager.f161637a.getClass();
        boolean z = true;
        FinderFolderClearManager.f161641e++;
        FinderFolderClearManager.f161642f = true;
        if (!mMFinderUI.getIntent().getBooleanExtra("key_not_request_focus", false)) {
            if (!finderCommonFeatureService.f157791S.q90()) {
                finderCommonFeatureService.f157791S.mo76691d2();
                C79586g.f233383a.mo109701a((long) C32444a.f86145g.mo60266n().intValue());
            }
            if (!((C11266d) C86312j.m106911c(C11266d.class)).mo9180HZ(mMFinderUI)) {
                finderCommonFeatureService.f157791S.Wm0(mMFinderUI);
            }
            if (finderCommonFeatureService.f157791S.mo76690c5().size() == 1) {
                C61166a aVar = C61166a.f174128a;
                if (SystemClock.elapsedRealtime() - C61166a.f174138k <= 300000) {
                    z = false;
                }
                Log.m105924i("Finder.CgiStrategy", "tryMoreInit tryInit:" + z);
                if (z) {
                    aVar.mo86103b();
                    C61166a.f174138k = SystemClock.elapsedRealtime();
                }
                ((C66607f) ((C36570n) finderCommonFeatureService.f157782I).getValue()).getClass();
                ((C119157j) C119157j.f356862d).mo183884o(C66606e.f191526d);
                ((C119157j) C119157j.f356862d).mo183884o(new C52339p0(finderCommonFeatureService));
            }
        }
    }

    /* renamed from: N */
    public boolean mo59665N() {
        return this.f157772g.size() > 0;
    }

    public C49704hh0 Na0() {
        return C45946r0.f123945a.mo71349c();
    }

    /* renamed from: O2 */
    public void mo76673O2() {
        FinderVideoPassiveMiniViewHelper.f159083D.mo77472a().mo77450A0().getClass();
    }

    /* renamed from: OT */
    public void mo76674OT(String str, Long l, C7840n nVar) {
        Context context;
        Context context2;
        String str2 = str;
        C7840n nVar2 = nVar;
        C87412m.m108594g(str2, "topic");
        C87412m.m108594g(nVar2, "clickExtra");
        C58771q3 q3Var = C58771q3.f168268a;
        Intent intent = new Intent();
        intent.putExtra("key_topic_type", 1);
        intent.putExtra("key_topic_title", str2);
        intent.putExtra("key_ref_object_id", l);
        intent.putExtra("key_entrance_type", 2);
        WeakReference<Context> weakReference = nVar2.f26404c;
        if (!(weakReference == null || (context2 = weakReference.get()) == null)) {
            C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context2, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
        }
        Context context3 = MMApplicationContext.getContext();
        C87412m.m108593f(context3, "getContext()");
        ((C58684b) C86312j.m106911c(C58684b.class)).F50(context3, intent);
        Log.m105924i("Finder.FinderTopicUtil", "onclick topic:" + str2);
        WeakReference<Context> weakReference2 = nVar2.f26404c;
        if (weakReference2 != null && (context = weakReference2.get()) != null) {
            if (C87412m.m108589b(nVar2.f26405d, Boolean.TRUE)) {
                long j = nVar2.f26402a;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("feedid", C61926c.m72691p(j));
                    jSONObject.put("topicid", C61926c.m72691p(0));
                    jSONObject.put("topicname", str2);
                } catch (JSONException unused) {
                }
                C7435f2 f2Var = C7435f2.f25626a;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
                f2Var.mo8577a(f != null ? f.mo12861q3() : null, "link_topic_tag", 1, jSONObject);
            }
            C13442s8 f2 = C13442s8.f38060Q0.mo12873f(context);
            if (f2 != null) {
                ((C58417y0) C86312j.m106911c(C58417y0.class)).Ax0(nVar2.f26402a, str, nVar2.f26403b, 0, f2.f38096i);
                C7322a b = C60172g4.C60173a.m70190b(f2, 0, 1, (Object) null);
                if (b != null) {
                    b.mo8766a(new C7322a.C7323a(18, nVar2.f26402a));
                }
            }
        }
    }

    /* renamed from: Od */
    public void mo76675Od(Context context, FinderJumpInfo finderJumpInfo, C86299o oVar, int i, C60905o oVar2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(finderJumpInfo, "info");
        C62262d0 d0Var = C62262d0.f176978a;
        C11920q qVar = new C11920q(finderJumpInfo);
        qVar.f34837k = oVar;
        if ((oVar != null ? oVar.f250923L : null) == C91003z.POPUP) {
            qVar.f34838l = 1;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        d0Var.mo87313b(context, qVar, i, oVar2);
    }

    /* renamed from: RO */
    public C64777vl1 mo76676RO() {
        return ((FinderStreamTabPreloadCore) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderStreamTabPreloadCore.class)).mo78458g3();
    }

    /* renamed from: Ur */
    public CharSequence mo76677Ur(TextView textView, CharSequence charSequence, int i) {
        C87412m.m108594g(textView, "tv");
        C87412m.m108594g(charSequence, "spanText");
        return C65604i.f188772a.mo89679e(textView, charSequence, i);
    }

    /* renamed from: VK */
    public C60628i mo76678VK(C89349b bVar, long j, int i) {
        return new C46520g3(bVar, j, i);
    }

    public void Ve0(int i, List<? extends C0740i2> list, C89349b bVar, Intent intent, C2780c cVar) {
        C87412m.m108594g(list, "feedList");
        C87412m.m108594g(intent, "intent");
        C58784w3.f168295a.mo83856A1(i, list, bVar, intent, cVar);
    }

    public void Vm0(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C58784w3.f168295a.mo83976x(str, (C28617v1) null);
    }

    /* renamed from: W5 */
    public C58969q mo76681W5(String str) {
        C87412m.m108594g(str, "username");
        return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76850gW().mo89509jo(str);
    }

    public void Wm0(MMFinderUI mMFinderUI) {
        C87412m.m108594g(mMFinderUI, "finder");
        if (this.f157771f.size() == 0) {
            C61926c.m72658C((String) null, C55397b.f157773d, 1, (Object) null);
        }
        if (!this.f157771f.contains(mMFinderUI)) {
            this.f157771f.add(mMFinderUI);
        }
        if (C86709a0.m107522a()) {
            ((C60204t3) C86312j.m106911c(C60204t3.class)).mo78751dB(mMFinderUI);
        }
    }

    /* renamed from: X */
    public void mo76683X(ImageView imageView, FinderAuthInfo finderAuthInfo, int i, C64284cg cgVar) {
        C87412m.m108594g(imageView, "view");
        C58784w3.f168295a.mo83864D1(imageView, finderAuthInfo, i, cgVar);
    }

    public C67092e0 Xd0() {
        return new C78080i();
    }

    public List<C64728tj0> Z20() {
        C45946r0 r0Var = C45946r0.f123945a;
        return C45946r0.f123946b;
    }

    public C9818k2 Zg0(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, "context");
        return new C9781h9(mMActivity);
    }

    public C58959b Zj0() {
        return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).f157781H;
    }

    /* renamed from: a5 */
    public void mo76688a5(Context context, C64831xk1 xk12, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(xk12, "shareObject");
        C87412m.m108594g(str, "sceneNote");
        C86299o oVar = new C86299o();
        oVar.f250930b = xk12.f186330h;
        oVar.f250934f = xk12.f186331i;
        oVar.f250939k = 1176;
        oVar.f250940l = str;
        C58739j4 j4Var = C58739j4.f168176a;
        oVar.f250931c = j4Var.mo83673A();
        C91003z zVar = C91003z.POPUP;
        oVar.f250923L = zVar;
        oVar.f250924M = zVar;
        String str2 = xk12.f186334o;
        boolean z = false;
        if (!(str2 == null || str2.length() == 0) && ((C14088e) C86312j.m106911c(C14088e.class)).mo13530uu(xk12.f186334o)) {
            z = true;
        }
        if (z) {
            FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
            finderJumpInfo.jumpinfo_type = 6;
            C64426ho2 ho22 = new C64426ho2();
            ho22.f183521d = xk12.f186334o;
            ho22.f183522e = xk12.f186335p;
            ho22.f183523f = URLDecoder.decode(xk12.f186336q, "UTF-8");
            finderJumpInfo.lite_app_info = ho22;
            MiniAppInfo miniAppInfo = new MiniAppInfo();
            miniAppInfo.app_id = xk12.f186330h;
            miniAppInfo.path = xk12.f186331i;
            miniAppInfo.appusername = xk12.f186332j;
            miniAppInfo.version_type = j4Var.mo83673A();
            finderJumpInfo.mini_app_info = miniAppInfo;
            C13598b0 b0Var = C13598b0.f38549a;
            C64916p1.C64917a.m76438e(this, context, finderJumpInfo, oVar, 0, (C60905o) null, 24, (Object) null);
            return;
        }
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
    }

    /* renamed from: aP */
    public boolean mo76689aP(String str) {
        C65861r rVar = C65861r.f189395e;
        return C65861r.f189395e.mo89899c(str);
    }

    /* renamed from: c5 */
    public Set<MMFinderUI> mo76690c5() {
        Set<MMFinderUI> set = this.f157771f;
        C87412m.m108593f(set, "enterFinderActivity");
        return set;
    }

    /* renamed from: d2 */
    public void mo76691d2() {
        Log.m105920e("FinderCommonService", "requestAudioFocus not support!");
    }

    /* renamed from: dG */
    public void mo76692dG(Context context, C64837xq2 xq22, C86299o oVar, C60905o oVar2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(xq22, "jumpInfoWrapper");
        C62262d0 d0Var = C62262d0.f176978a;
        FinderJumpInfo finderJumpInfo = xq22.f186379e;
        if (finderJumpInfo == null) {
            finderJumpInfo = new FinderJumpInfo();
        }
        C11920q qVar = new C11920q(finderJumpInfo);
        qVar.f34837k = oVar;
        qVar.f34825C = xq22.f186380f;
        qVar.f34826D = xq22.f186381g;
        int i = 1;
        if (xq22.f186382h != 1) {
            i = 0;
        }
        qVar.f34838l = i;
        C13598b0 b0Var = C13598b0.f38549a;
        d0Var.mo87313b(context, qVar, xq22.f186378d, oVar2);
    }

    public String du0(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.ORIGIN);
        return C8703w0.f27927a.mo9553e(str);
    }

    /* renamed from: dv */
    public void mo76694dv(FinderObject finderObject, C49712hj1 hj12) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83329dv(finderObject, hj12);
    }

    public String e80() {
        C58741j5 j5Var = C58741j5.f168184a;
        return C58741j5.f168192i + System.nanoTime() + ".jpg";
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x01cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.text.SpannableString e90(java.lang.String r29, android.text.SpannableString r30, long r31, java.util.List<er1.C58773q5> r33, java.util.LinkedList<com.tencent.p014mm.protocal.protobuf.FinderContact> r34, java.util.LinkedList<te3.C64465jc1> r35, fy3.C32227p<? super java.lang.String, ? super er1.C7840n, rx3.C13598b0> r36, fy3.C32226l<? super java.lang.String, rx3.C13598b0> r37) {
        /*
            r28 = this;
            r3 = r33
            r4 = r36
            r0 = r37
            java.lang.String r1 = "defaultDesc"
            r2 = r30
            gy3.C87412m.m108594g(r2, r1)
            java.lang.String r1 = "topicInfoList"
            gy3.C87412m.m108594g(r3, r1)
            java.lang.String r1 = "atFinderContactList"
            r5 = r34
            gy3.C87412m.m108594g(r5, r1)
            java.lang.String r1 = "mentionedUserList"
            r6 = r35
            gy3.C87412m.m108594g(r6, r1)
            java.lang.String r1 = "onTopicClick"
            gy3.C87412m.m108594g(r4, r1)
            java.lang.String r1 = "onAtClick"
            gy3.C87412m.m108594g(r0, r1)
            er1.f3 r1 = er1.C58723f3.f168122a
            java.lang.Class<ht1.v4> r6 = ht1.C8808v4.class
            r33.clear()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r29)
            if (r7 != 0) goto L_0x0418
            up1.f r7 = up1.C37521f.f99374d
            boolean r8 = r7.mo61158L()
            if (r8 != 0) goto L_0x0048
            boolean r7 = r7.mo61175c()
            if (r7 != 0) goto L_0x0048
            goto L_0x0418
        L_0x0048:
            java.lang.String r7 = "finder"
            r8 = 0
            r9 = r29
            java.util.Map r10 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r9, r7, r8)
            if (r10 != 0) goto L_0x0064
            r0 = r1
            r1 = r29
            r2 = r30
            r3 = r33
            r4 = r36
            r5 = r31
            android.text.SpannableString r0 = r0.mo83641c(r1, r2, r3, r4, r5)
            goto L_0x042c
        L_0x0064:
            java.lang.String r11 = ".finder.valuecount"
            java.lang.Object r11 = r10.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            r12 = -1
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r12)
            if (r11 >= 0) goto L_0x0084
            r0 = r1
            r1 = r29
            r2 = r30
            r3 = r33
            r4 = r36
            r5 = r31
            android.text.SpannableString r0 = r0.mo83641c(r1, r2, r3, r4, r5)
            goto L_0x042c
        L_0x0084:
            java.lang.String r1 = ".finder.version"
            java.lang.Object r1 = r10.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r9 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r9)
            java.lang.String r12 = ".finder.style.at"
            java.lang.Object r12 = r10.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = ""
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r13)
            java.lang.String r12 = "atIndexs"
            gy3.C87412m.m108593f(r14, r12)
            java.lang.String r12 = ","
            java.lang.String[] r15 = new java.lang.String[]{r12}
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            java.util.List r12 = z04.C112550d0.m153785U(r14, r15, r16, r17, r18, r19)
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.util.Iterator r5 = r34.iterator()
        L_0x00bf:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto L_0x00dd
            java.lang.Object r15 = r5.next()
            com.tencent.mm.protocal.protobuf.FinderContact r15 = (com.tencent.p014mm.protocal.protobuf.FinderContact) r15
            java.lang.String r8 = r15.username
            boolean r8 = r14.containsKey(r8)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = r15.username
            if (r8 != 0) goto L_0x00d8
            r8 = r13
        L_0x00d8:
            r14.put(r8, r15)
        L_0x00db:
            r8 = 0
            goto L_0x00bf
        L_0x00dd:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r13)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r14 = 0
        L_0x00e8:
            java.lang.String r15 = "this as java.lang.String).substring(startIndex)"
            if (r14 >= r11) goto L_0x02a5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r2 = 46
            r9.append(r2)
            r9.append(r7)
            r9.append(r2)
            java.lang.String r2 = "value"
            r9.append(r2)
            r9.append(r14)
            r17 = r11
            r11 = 46
            r9.append(r11)
            java.lang.String r11 = "topic"
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r10.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r11 = "this as java.lang.String…ing(startIndex, endIndex)"
            java.lang.String r0 = " "
            if (r9 != 0) goto L_0x023f
            java.lang.String r9 = r5.toString()
            int r9 = r9.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r18 = r6
            r6 = 46
            r4.append(r6)
            r4.append(r7)
            r4.append(r6)
            r4.append(r2)
            r4.append(r14)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r10.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0151
            r2 = r13
        L_0x0151:
            java.lang.String r4 = java.lang.String.valueOf(r14)
            boolean r4 = r12.contains(r4)
            if (r4 == 0) goto L_0x01e8
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 != 0) goto L_0x01e8
            java.lang.String r4 = "_"
            r6 = 0
            java.lang.String r2 = z04.C112551y.m153814n(r2, r0, r4, r6)
            int r4 = r2.length()
            r6 = 2
            if (r4 <= r6) goto L_0x017f
            int r4 = r2.length()
            r6 = 1
            int r4 = r4 - r6
            java.lang.String r4 = r2.substring(r6, r4)
            gy3.C87412m.m108593f(r4, r11)
            r34 = r4
            goto L_0x0182
        L_0x017f:
            r6 = 1
            r34 = r2
        L_0x0182:
            int r4 = r2.length()
            if (r4 <= r6) goto L_0x01c6
            r4 = 8197(0x2005, float:1.1486E-41)
            r16 = r7
            r20 = r10
            r6 = 2
            r7 = 0
            r10 = 0
            boolean r4 = z04.C112550d0.m153804x(r2, r4, r10, r6, r7)
            if (r4 != 0) goto L_0x01b4
            r4 = 32
            boolean r4 = z04.C112550d0.m153804x(r2, r4, r10, r6, r7)
            if (r4 == 0) goto L_0x01a0
            goto L_0x01b4
        L_0x01a0:
            r5.append(r2)
            int r4 = r2.length()
            if (r4 <= r6) goto L_0x01b2
            r4 = 1
            java.lang.String r2 = r2.substring(r4)
            gy3.C87412m.m108593f(r2, r15)
            goto L_0x01cd
        L_0x01b2:
            r4 = 1
            goto L_0x01cd
        L_0x01b4:
            r4 = 1
            int r6 = r2.length()
            int r6 = r6 - r4
            r7 = 0
            java.lang.String r2 = r2.substring(r7, r6)
            gy3.C87412m.m108593f(r2, r11)
            r5.append(r2)
            goto L_0x01cb
        L_0x01c6:
            r16 = r7
            r20 = r10
            r4 = 1
        L_0x01cb:
            r2 = r34
        L_0x01cd:
            if (r1 >= r4) goto L_0x01d2
            r5.append(r0)
        L_0x01d2:
            er1.t$a r0 = new er1.t$a
            java.lang.String r4 = r5.toString()
            int r4 = r4.length()
            com.tencent.mm.protocal.protobuf.FinderContact r6 = new com.tencent.mm.protocal.protobuf.FinderContact
            r6.<init>()
            r0.<init>(r9, r4, r2, r6)
            r8.add(r0)
            goto L_0x023d
        L_0x01e8:
            r16 = r7
            r20 = r10
            er1.q3 r0 = er1.C58771q3.f168268a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = 0
            java.util.List r0 = r0.mo83813d(r2, r4, r6)
            java.lang.String r4 = r5.toString()
            int r4 = r4.length()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0206:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x023a
            java.lang.Object r7 = r0.next()
            er1.q5 r7 = (er1.C58773q5) r7
            int r9 = r7.f168272a
            int r9 = r9 + r4
            r10 = 1
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x021a
            r9 = 0
        L_0x021a:
            er1.q5 r11 = new er1.q5
            int r15 = r7.f168273b
            int r15 = r15 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r6 = 35
            r10.append(r6)
            java.lang.String r6 = r7.f168274c
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            r11.<init>(r9, r15, r6)
            r3.add(r11)
            r6 = 0
            goto L_0x0206
        L_0x023a:
            r5.append(r2)
        L_0x023d:
            r2 = 0
            goto L_0x0292
        L_0x023f:
            r18 = r6
            r16 = r7
            r20 = r10
            java.lang.CharSequence r2 = z04.C112550d0.m153799i0(r9)
            java.lang.String r2 = r2.toString()
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0255
            r2 = 1
            goto L_0x0256
        L_0x0255:
            r2 = 0
        L_0x0256:
            if (r2 == 0) goto L_0x028e
            r2 = 0
            java.lang.String r4 = z04.C112551y.m153814n(r9, r0, r13, r2)
            int r6 = r4.length()
            r7 = 1
            if (r6 <= r7) goto L_0x0270
            int r6 = r4.length()
            int r6 = r6 - r7
            java.lang.String r4 = r4.substring(r2, r6)
            gy3.C87412m.m108593f(r4, r11)
        L_0x0270:
            er1.q5 r6 = new er1.q5
            java.lang.String r7 = r5.toString()
            int r7 = r7.length()
            int r9 = r4.length()
            r6.<init>(r7, r9, r4)
            r3.add(r6)
            r5.append(r4)
            r4 = 1
            if (r1 >= r4) goto L_0x0292
            r5.append(r0)
            goto L_0x0292
        L_0x028e:
            r2 = 0
            r5.append(r9)
        L_0x0292:
            int r14 = r14 + 1
            r2 = r30
            r4 = r36
            r0 = r37
            r7 = r16
            r11 = r17
            r6 = r18
            r10 = r20
            r9 = 0
            goto L_0x00e8
        L_0x02a5:
            r18 = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "parseXml, version:"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", result:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderStyleUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.String r0 = r5.toString()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0415
            boolean r0 = r33.isEmpty()
            if (r0 == 0) goto L_0x02dd
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x02dd
            goto L_0x0415
        L_0x02dd:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = r5.toString()
            android.text.SpannableString r1 = r1.mo107057T1(r2, r4)
            r0.<init>(r1)
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r0)
            java.lang.String r1 = "desc"
            gy3.C87412m.m108593f(r0, r1)
            di3.d r1 = di3.C86312j.m106911c(r18)
            ht1.v4 r1 = (ht1.C8808v4) r1
            boolean r1 = r1.mo9635e()
            r2 = 2131099800(0x7f060098, float:1.7811963E38)
            if (r1 == 0) goto L_0x031b
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            goto L_0x031d
        L_0x031b:
            int r1 = er1.C58723f3.f168135n
        L_0x031d:
            di3.d r4 = di3.C86312j.m106911c(r18)
            ht1.v4 r4 = (ht1.C8808v4) r4
            boolean r4 = r4.mo9635e()
            r5 = 2131101688(0x7f0607f8, float:1.7815793E38)
            r6 = 2131099665(0x7f060011, float:1.781169E38)
            if (r4 == 0) goto L_0x033c
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r5)
            goto L_0x0348
        L_0x033c:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r6)
        L_0x0348:
            java.util.Iterator r3 = r33.iterator()
        L_0x034c:
            boolean r7 = r3.hasNext()
            r9 = 17
            if (r7 == 0) goto L_0x038f
            java.lang.Object r7 = r3.next()
            er1.q5 r7 = (er1.C58773q5) r7
            com.tencent.mm.plugin.finder.view.g5 r10 = new com.tencent.mm.plugin.finder.view.g5
            java.lang.String r11 = r7.f168274c
            r12 = 1
            java.lang.String r11 = r11.substring(r12)
            gy3.C87412m.m108593f(r11, r15)
            r23 = 0
            r24 = 1
            er1.i3 r12 = new er1.i3
            r5 = r31
            r14 = r36
            r12.<init>(r14, r5)
            r19 = r10
            r20 = r11
            r21 = r1
            r22 = r4
            r25 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25)
            int r11 = r7.f168272a
            int r7 = r7.f168273b
            int r7 = r7 + r11
            r0.setSpan(r10, r11, r7, r9)
            r5 = 2131101688(0x7f0607f8, float:1.7815793E38)
            r6 = 2131099665(0x7f060011, float:1.781169E38)
            goto L_0x034c
        L_0x038f:
            di3.d r1 = di3.C86312j.m106911c(r18)
            ht1.v4 r1 = (ht1.C8808v4) r1
            boolean r1 = r1.mo9635e()
            if (r1 == 0) goto L_0x03a8
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            goto L_0x03aa
        L_0x03a8:
            int r1 = er1.C58723f3.f168135n
        L_0x03aa:
            di3.d r2 = di3.C86312j.m106911c(r18)
            ht1.v4 r2 = (ht1.C8808v4) r2
            boolean r2 = r2.mo9635e()
            if (r2 == 0) goto L_0x03c6
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r2 = r2.getColor(r3)
            goto L_0x03d5
        L_0x03c6:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099665(0x7f060011, float:1.781169E38)
            int r2 = r2.getColor(r3)
        L_0x03d5:
            java.util.Iterator r3 = r8.iterator()
        L_0x03d9:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x042c
            java.lang.Object r4 = r3.next()
            er1.t$a r4 = (er1.C58775t.C58776a) r4
            com.tencent.mm.plugin.finder.view.g5 r5 = new com.tencent.mm.plugin.finder.view.g5
            java.lang.String r6 = r4.f168281c
            if (r6 != 0) goto L_0x03ee
            r20 = r13
            goto L_0x03f0
        L_0x03ee:
            r20 = r6
        L_0x03f0:
            r23 = 0
            r24 = 0
            er1.g3 r6 = new er1.g3
            r7 = r37
            r6.<init>(r7)
            r26 = 16
            r27 = 0
            r19 = r5
            r21 = r1
            r22 = r2
            r25 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r6 = 1
            r5.f18186n = r6
            int r8 = r4.f168279a
            int r4 = r4.f168280b
            r0.setSpan(r5, r8, r4, r9)
            goto L_0x03d9
        L_0x0415:
            r0 = r30
            goto L_0x042c
        L_0x0418:
            r9 = r29
            r5 = r31
            r14 = r4
            r0 = r1
            r1 = r29
            r2 = r30
            r3 = r33
            r4 = r36
            r5 = r31
            android.text.SpannableString r0 = r0.mo83641c(r1, r2, r3, r4, r5)
        L_0x042c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonBaseFeatureService.e90(java.lang.String, android.text.SpannableString, long, java.util.List, java.util.LinkedList, java.util.LinkedList, fy3.p, fy3.l):android.text.SpannableString");
    }

    /* renamed from: fY */
    public int mo9100fY() {
        return C66785b.f191882e.mo90673n0().f131584h;
    }

    /* renamed from: gW */
    public C65416i mo76697gW() {
        return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76850gW();
    }

    public C60172g4 gr0(Context context) {
        C87412m.m108594g(context, "context");
        return C13442s8.f38060Q0.mo12873f(context);
    }

    public C58744l gv0(RecyclerView recyclerView, int i, int i2, Set<Integer> set) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(set, "otherCareType");
        return C58784w3.f168295a.mo83859C(recyclerView, i, i2, set);
    }

    /* renamed from: hY */
    public boolean mo76700hY(Context context) {
        C87412m.m108594g(context, "context");
        return context instanceof FinderHomeUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        cy3.C58003b.m67160a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        throw r0;
     */
    /* renamed from: iy */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.finder.storage.FinderItem mo76701iy(long r4) {
        /*
            r3 = this;
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            up1.p r0 = r0.Dx0()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT * FROM FinderFeedItem  WHERE id = "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r0.f39913g
            r0 = 0
            r1 = 2
            android.database.Cursor r4 = r5.rawQuery(r4, r0, r1)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = new com.tencent.mm.plugin.finder.storage.FinderItem
            r5.<init>()
            if (r4 == 0) goto L_0x0042
            boolean r1 = r4.moveToFirst()     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0035
            r5.convertFrom(r4)     // Catch:{ all -> 0x003b }
        L_0x0035:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x003b }
            cy3.C58003b.m67160a(r4, r0)
            goto L_0x0042
        L_0x003b:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            cy3.C58003b.m67160a(r4, r5)
            throw r0
        L_0x0042:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.FinderCommonBaseFeatureService.mo76701iy(long):com.tencent.mm.plugin.finder.storage.FinderItem");
    }

    public void j80(FinderObject finderObject, int i) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        ((C58417y0) C86312j.m106911c(C58417y0.class)).j80(finderObject, i);
    }

    /* renamed from: jw */
    public int mo76703jw() {
        return ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83336jw();
    }

    public void kr0(MMFinderUI mMFinderUI) {
        Class cls = FinderCommonFeatureService.class;
        Class cls2 = C60204t3.class;
        C87412m.m108594g(mMFinderUI, "finder");
        ((C60204t3) C86312j.m106911c(cls2)).mo78747PV(mMFinderUI);
        if (!this.f157772g.contains(mMFinderUI)) {
            if (((C11266d) C86312j.m106911c(C11266d.class)).jk0(mMFinderUI)) {
                Log.m105924i("FinderCommonService", "onFinderForeground: ui is from nearby, ui = " + mMFinderUI);
                return;
            }
            if (this.f157772g.size() == 0) {
                for (C58341h hVar : ((FinderStreamTabPreloadCore) C39818r.f106831a.mo62446e(cls).mo75002a(FinderStreamTabPreloadCore.class)).f160333e) {
                    Log.m105924i(hVar.f167027c, "performEnterFinder: ");
                    hVar.f167028d = true;
                    hVar.f167029e.mo83080c("performEnterFinder");
                }
                if (((C60204t3) C86312j.m106911c(cls2)).iu0(mMFinderUI)) {
                    ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
                }
            }
            this.f157772g.add(mMFinderUI);
        }
    }

    /* renamed from: lw */
    public String mo76705lw(String str, String str2, boolean z) {
        return C58784w3.f168295a.mo83898R(str, str2, z);
    }

    public boolean m40() {
        return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76776L4().m40();
    }

    public void m90(C49712hj1 hj12, int i, C48978cb0 cb02, String str) {
        C87412m.m108594g(cb02, "extStats");
        C86709a0.m107524d().mo123460f(new C46534r2(hj12, i, cb02, str));
    }

    /* renamed from: mv */
    public C13605o<String, String, String> mo76708mv(Context context, BaseFinderFeed baseFinderFeed, int i, C32226l<? super C13605o<String, String, String>, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(lVar, "cgiBack");
        return C58749n1.f168219a.mo83749b(context, baseFinderFeed, i, lVar);
    }

    /* renamed from: nI */
    public void mo76709nI(Activity activity, int i, Intent intent, int i2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener) {
        C87412m.m108594g(activity, "context");
        FinderBottomCustomDialogHelper.Companion.showCreateFinderUserDialogOnLiveWithCallback(activity, i, intent, i2, onClickListener, onClickListener2, onDismissListener);
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        this.f157770e.alive();
        this.f157769d.alive();
        C101459n1 n1Var = (C101459n1) C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C101459n1.class);
        n1Var.getClass();
        Context context2 = MMApplicationContext.getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Application");
        ((Application) context2).registerActivityLifecycleCallbacks(new C63567m1(n1Var));
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        this.f157770e.dead();
        this.f157769d.dead();
    }

    /* renamed from: p2 */
    public CharSequence mo76710p2(Context context, TextPaint textPaint, CharSequence charSequence, int i) {
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(textPaint, "paint");
        CharSequence charSequence2 = charSequence;
        C87412m.m108594g(charSequence2, "spanText");
        int b = C76577a.m92151b(context2, (i * 15) + 1);
        int b2 = C76577a.m92151b(context2, ((i + 1) * 15) + 1);
        CharSequence charSequence3 = charSequence;
        TextPaint textPaint2 = textPaint;
        StaticLayout staticLayout = new StaticLayout(charSequence3, 0, charSequence.length(), textPaint2, b, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (new StaticLayout(charSequence3, 0, charSequence.length(), textPaint2, b2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
            return charSequence2;
        }
        int lineEnd = staticLayout.getLineEnd(0);
        StringBuilder sb = new StringBuilder();
        String substring = charSequence.toString().substring(0, lineEnd);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append("...");
        SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context2, sb.toString());
        C87412m.m108593f(T1, "{\n            val ellips…Start) + \"...\")\n        }");
        return T1;
    }

    /* renamed from: p3 */
    public void mo76711p3(Context context, Intent intent, long j, String str, int i, int i2, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context, intent, j, str, i, i2, z, 0, 128, (Object) null);
    }

    /* renamed from: p8 */
    public void mo76712p8(Context context, int i, Intent intent) {
        C87412m.m108594g(context, "context");
        FinderBottomCustomDialogHelper.Companion.showCreateFinderUserDialog(context, i, intent);
    }

    /* renamed from: pw */
    public String mo76713pw() {
        C58741j5 j5Var = C58741j5.f168184a;
        return C58741j5.f168192i;
    }

    public boolean q90() {
        return this.f157771f.size() > 0;
    }

    /* renamed from: qB */
    public C60628i mo76715qB(String str, int i, String str2, C89349b bVar, int i2, C49712hj1 hj12, C89349b bVar2, C89349b bVar3, C89349b bVar4) {
        String str3 = str;
        C87412m.m108594g(str3, SearchIntents.EXTRA_QUERY);
        String str4 = str2;
        C87412m.m108594g(str4, "requestId");
        C9320i4 i4Var = new C9320i4(str3, i, str4, bVar, i2, hj12, bVar2, bVar3, bVar4, false, 0, 1536, (C8480h) null);
        C86709a0.m107524d().mo123460f(i4Var);
        return i4Var;
    }

    public C60625c<C50008jm0> qr0(long j, String str, int i, int i2, String str2, boolean z, C89349b bVar, C65426w0 w0Var, long j2, String str3, boolean z2, boolean z3, String str4, C49712hj1 hj12, int i3) {
        long j3 = j;
        C87412m.m108594g(str2, "feedUsername");
        C87412m.m108594g(str3, "username");
        C87412m.m108594g(str4, "encryptedObjectId");
        return new C46547x1(j, str, i, i2, str2, z, bVar, w0Var, j2, str3, z2, z3, str4, hj12, i3, (C49946j51) null, false, 98304, (C8480h) null);
    }

    /* renamed from: qx */
    public int mo76717qx(String str) {
        C87412m.m108594g(str, "username");
        C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
        FinderProfileHeaderUIC.C3463b bVar = (FinderProfileHeaderUIC.C3463b) FinderProfileHeaderUIC.f16192h1.get(str);
        if (bVar != null) {
            return bVar.f16262a;
        }
        return 0;
    }

    /* renamed from: rZ */
    public String mo76718rZ(C11977d0 d0Var) {
        C87412m.m108594g(d0Var, "pagFile");
        C58741j5 j5Var = C58741j5.f168184a;
        return C58741j5.f168186c + "decoration/" + d0Var.mo11841b() + ".pag";
    }

    public void sa0(String str, C0264h hVar) {
        String str2 = str;
        C0264h hVar2 = hVar;
        C87412m.m108594g(str2, "username");
        C87412m.m108594g(hVar2, "logOutInfo");
        C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
        C101614i<String, FinderProfileHeaderUIC.C3463b> iVar2 = FinderProfileHeaderUIC.f16192h1;
        FinderProfileHeaderUIC.C3463b bVar = (FinderProfileHeaderUIC.C3463b) iVar2.get(str2);
        if (bVar != null) {
            bVar.f16269h = hVar2;
            return;
        }
        FinderProfileHeaderUIC.C3463b bVar2 = new FinderProfileHeaderUIC.C3463b(0, 0, (LinkedList) null, (C49098d51) null, (C50019jp1) null, (C51691vg0) null, (C52271zj0) null, (C0264h) null, (C50428mo1) null, (C49316ep1) null, (C49236e51) null, (List) null, (C51869ws0) null, (C51583uq0) null, (C51810wb1) null, (C51583uq0) null, 65535, (C8480h) null);
        bVar2.f16269h = hVar2;
        C13598b0 b0Var = C13598b0.f38549a;
        FinderProfileHeaderUIC.C3463b bVar3 = (FinderProfileHeaderUIC.C3463b) iVar2.put(str2, bVar2);
    }

    public Spanned t50(String str, String str2) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.ORIGIN);
        C87412m.m108594g(str2, "highLightFontColor");
        return C8703w0.f27927a.mo9552c(str, str2);
    }

    /* renamed from: tb */
    public SpannableString mo76721tb(String str, String str2, ArrayList<C50717oq2> arrayList, C32226l<? super C50717oq2, C13598b0> lVar) {
        String str3 = str;
        String str4 = str2;
        C32226l<? super C50717oq2, C13598b0> lVar2 = lVar;
        C87412m.m108594g(str3, "prefix");
        C87412m.m108594g(str4, "result");
        C87412m.m108594g(arrayList, "parseInfoList");
        C87412m.m108594g(lVar2, "onKeywordClick");
        C58723f3 f3Var = C58723f3.f168122a;
        Context context = MMApplicationContext.getContext();
        SpannableString valueOf = SpannableString.valueOf(new SpannableStringBuilder(((C76979h) C86312j.m106911c(C76979h.class)).Te0(context, str3 + str4, 0.0f)));
        int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3459zq);
        int color2 = MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2);
        for (C50717oq2 oq22 : arrayList) {
            C51833wh0 wh02 = oq22.f139316f;
            if (!(wh02 == null || wh02.f144050e == null)) {
                Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(C0966R.raw.actionbar_icon_light_search);
                C74933u4.m89769f(drawable, color);
                int a = (int) (((float) C79406f.m96347a(MMApplicationContext.getContext(), 12.0f)) * C76577a.m92165p(MMApplicationContext.getContext()));
                drawable.setBounds(0, 0, a, a);
                C4011a aVar = new C4011a(drawable);
                int length = str.length() + oq22.f139314d;
                int i = oq22.f139315e + length;
                valueOf.setSpan(aVar, i, i + 1, 18);
                String str5 = wh02.f144050e;
                C87412m.m108591d(str5);
                valueOf.setSpan(new C4059g5(str5, color, color2, false, true, new C31673h3(lVar2, oq22)), length, oq22.f139315e + length + 1, 17);
            }
        }
        C87412m.m108593f(valueOf, "ret");
        return valueOf;
    }

    public void ts0(Context context, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "finderUserName");
        FinderBottomCustomDialogHelper.Companion.showUserInfoConfirmDialog(context, str, onClickListener, onClickListener2, onDismissListener, z);
    }

    /* renamed from: ty */
    public boolean mo76723ty() {
        C13601g<C66138a> gVar = C66138a.f190116v;
        return C66138a.f190116v.getValue().mo77454E0() || FinderVideoPassiveMiniViewHelper.f159083D.mo77472a().mo77454E0();
    }

    /* renamed from: vP */
    public C45435i2 mo9101vP(long j, int i) {
        return ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83349vP(j, i);
    }

    /* renamed from: vV */
    public void mo76724vV(AppCompatActivity appCompatActivity, String str, C76875f0 f0Var, FinderItem finderItem, C32226l<? super List<String>, C13598b0> lVar) {
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        String str2 = str;
        C76875f0 f0Var2 = f0Var;
        FinderItem finderItem2 = finderItem;
        C87412m.m108594g(appCompatActivity, "context");
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(f0Var2, "menu");
        C87412m.m108594g(finderItem2, "feedObject");
        Log.m105918d("MircoMsg.FinderRecentForwardUtils", "showForwardConfirmDialog() called with: context = " + appCompatActivity + ", userName = " + str + ", menu = " + f0Var2 + ", feedObject = " + finderItem2);
        C7888v2.f26513a.getClass();
        C60151b bVar = new C60151b();
        C64623p81 finderLive = finderItem.getFinderLive();
        C87412m.m108594g(finderLive, "<set-?>");
        bVar.f171698b = finderLive;
        AppCompatActivity appCompatActivity3 = appCompatActivity;
        C56660w0 w0Var = new C56660w0(appCompatActivity3, str, 23, (C60166f) null, bVar, 8, (C8480h) null);
        w0Var.mo80010a(finderItem.getId(), new C61039l5(appCompatActivity3, f0Var, finderItem, lVar, w0Var));
        C66184f.C66185a aVar = w0Var.f162415c;
        if (aVar != null) {
            aVar.f190207c.show();
        }
        C62001a.f176265a.mo86878a(w0Var.f162413a);
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8608i((C8777j5) c, C54067f0.C0066n.SHARE_SEND_RECENT, (Map) null, 2, (Object) null);
    }

    public void ve0(MMActivity mMActivity, long j, String str, int i, int i2, String str2, boolean z, C89349b bVar, C65426w0 w0Var, long j2, String str3, boolean z2, boolean z3, String str4, C49712hj1 hj12, boolean z4, int i3, C32226l<? super C89132b.C89134c<C50008jm0>, C13598b0> lVar) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(str2, "feedUsername");
        C87412m.m108594g(str3, "username");
        C87412m.m108594g(str4, "encryptedObjectId");
        new C46547x1(j, str, i, i2, str2, z, bVar, w0Var, j2, str3, z2, z3, str4, hj12, i3, (C49946j51) null, z4, 32768, (C8480h) null).mo9225i().mo123062e(new C29068a(lVar)).mo11397F(mMActivity);
    }

    /* renamed from: wa */
    public String mo76726wa(String str, String str2) {
        C87412m.m108594g(str, "dirName");
        C87412m.m108594g(str2, "id");
        C58741j5 j5Var = C58741j5.f168184a;
        return C58741j5.f168186c + str + XVFSFile.SEPARATOR_CHAR + str2 + ".pag";
    }

    /* renamed from: xV */
    public void mo76727xV(Context context, long j, String str, Long l, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "username");
        C13671a.m12976c(C13671a.f38718a, context, j, str, l, i, (BaseFinderFeed) null, 32, (Object) null);
    }

    /* renamed from: y */
    public void mo76728y(C49712hj1 hj12, int i, C48978cb0 cb02) {
        C87412m.m108594g(cb02, "extStats");
        C86709a0.m107524d().mo123460f(new C46534r2(hj12, i, cb02, (String) null));
    }

    /* renamed from: yP */
    public String mo76729yP() {
        return ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83357yP();
    }

    public void yi0(C49712hj1 hj12, String str, int i, long j, boolean z, String str2, C64414h71 h712, Integer num, Integer num2) {
        C49712hj1 hj13 = hj12;
        C87412m.m108594g(hj12, "contextObj");
        String str3 = str;
        C87412m.m108594g(str, "finderUser");
        C87412m.m108594g(str2, "participantFinderUsername");
        C0751m0.f1769a.mo707d(hj12, str, i, j, z, str2, h712, num, num2 != null ? num2.intValue() : -1);
    }

    /* renamed from: z2 */
    public C32026j mo9108z2() {
        return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).f157802n;
    }

    /* renamed from: z7 */
    public void mo76731z7(String str, String str2, C60216z4.C8821a<Integer> aVar, String str3, long j, C60216z4.C8821a<Void> aVar2, String str4, String str5, C49946j51 j512, long j2, Intent intent, Map<String, Object> map) {
        String str6 = str4;
        C87412m.m108594g(str6, "contextId");
        String str7 = str5;
        C87412m.m108594g(str7, "reportExtraInfo");
        C58759o4.f168229a.mo83782b(str, str2, aVar, str3, j, aVar2, str6, str7, j512, j2, intent, map);
    }

    public C60896i<C9493c> zl0() {
        return new C14590p();
    }
}
