package com.tencent.p014mm.p136ui.chatting;

import a70.C112760b;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import bp3.C79758p;
import c02.C92331c;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.LocalCheckResUpdateCacheFileEvent;
import com.tencent.p014mm.autogen.events.PauseAutoGetBigImgEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI;
import com.tencent.p014mm.p136ui.tools.ShowImageUI;
import com.tencent.p014mm.p136ui.widget.progress.RoundProgressBtn;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel;
import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.plugin.ball.service.FloatBallHelper;
import com.tencent.p014mm.plugin.handoff.model.AbsHandOffFile;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$PublicServiceNames;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C19568o0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C19569p0;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xwebutil.C86032n;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.util.WXWebReporter;
import d92.C45293c;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75604z3;
import eb0.C97625j3;
import ek3.C97668a;
import ek3.C97669b;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import gq0.C107879e0;
import gq0.C107885g0;
import gq0.C45944i0;
import i21.C98590g;
import ik3.C21105d;
import iq0.C98783b;
import j20.C117292a;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jd3.C76404b;
import k20.C9556a;
import k92.C108976d;
import kj2.C117407d;
import kr0.C109033l0;
import nj3.C11184p0;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import p154fy.C87121j;
import p262wm.C22921c;
import p262wm.C22923f;
import p385u2.C111105a;
import p407zo.C23546f;
import p407zo.C23547h;
import p910lj.C76701a;
import qg2.C77335p;
import qg2.p$$e;
import qo3.C77407n;
import sf0.C77702q0;
import t90.C77878b;
import te3.C51173ry;
import tf3.C110978f;
import uo3.C78253a;
import uv0.C22663i;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI */
public class AppAttachNewDownloadUI extends MMSecDataActivity implements MStorage.IOnStorageChange, C11385n, p$$e, C75875l.C75877b, C19568o0 {

    /* renamed from: e1 */
    public static final /* synthetic */ int f55984e1 = 0;

    /* renamed from: A */
    public String f55985A;

    /* renamed from: B */
    public int f55986B = 0;

    /* renamed from: C */
    public String f55987C;

    /* renamed from: D */
    public long f55988D;

    /* renamed from: E */
    public String f55989E;

    /* renamed from: F */
    public String f55990F;

    /* renamed from: G */
    public String f55991G;

    /* renamed from: H */
    public String f55992H;

    /* renamed from: I */
    public String f55993I;

    /* renamed from: J */
    public String f55994J;

    /* renamed from: K */
    public boolean f55995K = false;

    /* renamed from: L */
    public boolean f55996L = false;

    /* renamed from: M */
    public boolean f55997M = true;

    /* renamed from: N */
    public boolean f55998N = true;

    /* renamed from: P */
    public boolean f55999P = false;

    /* renamed from: Q */
    public int f56000Q;

    /* renamed from: Q0 */
    public Drawable f56001Q0;

    /* renamed from: R */
    public LinearLayout f56002R;

    /* renamed from: R0 */
    public String f56003R0 = "";

    /* renamed from: S */
    public TextView f56004S;

    /* renamed from: S0 */
    public String f56005S0 = null;

    /* renamed from: T */
    public ProgressBar f56006T;

    /* renamed from: T0 */
    public AppBrandOpenMaterialCollection f56007T0 = null;

    /* renamed from: U */
    public TextView f56008U;

    /* renamed from: U0 */
    public C107879e0 f56009U0 = null;

    /* renamed from: V */
    public Button f56010V;

    /* renamed from: V0 */
    public C107885g0 f56011V0 = null;

    /* renamed from: W */
    public boolean f56012W = false;

    /* renamed from: W0 */
    public C77407n f56013W0 = null;

    /* renamed from: X */
    public AbsHandOffFile f56014X;

    /* renamed from: X0 */
    public View.OnClickListener f56015X0 = new AppAttachNewDownloadUI$$m(this);

    /* renamed from: Y */
    public C108976d f56016Y;

    /* renamed from: Y0 */
    public C78253a f56017Y0 = null;

    /* renamed from: Z */
    public C97669b f56018Z;

    /* renamed from: Z0 */
    public int f56019Z0;

    /* renamed from: a1 */
    public int f56020a1;

    /* renamed from: b1 */
    public C11184p0 f56021b1 = new AppAttachNewDownloadUI$$n(this);

    /* renamed from: c1 */
    public View.OnTouchListener f56022c1 = new AppAttachNewDownloadUI$$o(this);

    /* renamed from: d */
    public int f56023d;

    /* renamed from: d1 */
    public View.OnLongClickListener f56024d1 = new AppAttachNewDownloadUI$$p(this);

    /* renamed from: e */
    public MMImageView f56025e;

    /* renamed from: f */
    public RoundProgressBtn f56026f;

    /* renamed from: g */
    public AppAttachNewDownloadUI$$u f56027g;

    /* renamed from: h */
    public Button f56028h;

    /* renamed from: i */
    public Button f56029i;

    /* renamed from: j */
    public TextView f56030j;

    /* renamed from: n */
    public TextView f56031n;

    /* renamed from: o */
    public TextView f56032o;

    /* renamed from: p */
    public C77335p f56033p;

    /* renamed from: p0 */
    public LinearLayout f56034p0;

    /* renamed from: q */
    public String f56035q;

    /* renamed from: r */
    public int f56036r;

    /* renamed from: s */
    public long f56037s;

    /* renamed from: t */
    public C72963f4 f56038t;

    /* renamed from: u */
    public boolean f56039u;

    /* renamed from: v */
    public C47355o f56040v;

    /* renamed from: w */
    public boolean f56041w;

    /* renamed from: x */
    public String f56042x;

    /* renamed from: x0 */
    public C19569p0 f56043x0;

    /* renamed from: y */
    public C68070l.C68072b f56044y;

    /* renamed from: y0 */
    public String f56045y0 = "";

    /* renamed from: z */
    public String f56046z;

    /* renamed from: Q7 */
    public static C72683d m21357Q7(int i, long j, String str, String str2) {
        C72683d Yt = C72709y1.vx0().mo100150Yt(j);
        if (Yt != null) {
            int i2 = C77702q0.f226484a;
            Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "summerapp getAppAttachInfo by msgId [%d] stack[%s]", Long.valueOf(j), new C77702q0.C77703a());
            return Yt;
        } else if (i == 74) {
            return null;
        } else {
            C72683d g = C72695v.m85065g(str);
            if (g == null) {
                int i3 = C77702q0.f226484a;
                Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "summerapp getAppAttachInfo by msgId and mediaId is null stack[%s]", new C77702q0.C77703a());
                return g;
            }
            if (g.field_msgInfoId != j && !C86013q1.m106450k(g.field_fileFullPath)) {
                C72695v.m85072n(j, str2, (String) null);
                C72683d Yt2 = C72709y1.vx0().mo100150Yt(j);
                if (Yt2 == null) {
                    int i4 = C77702q0.f226484a;
                    Log.m105929w("MicroMsg.AppAttachNewDownloadUI", "summerapp getAppAttachInfo create new info from local but failed stack[%s]", new C77702q0.C77703a());
                    return g;
                }
                ((C119157j) C119157j.f356862d).mo183876g(new AppAttachNewDownloadUI$$q(g, Yt2), "copyAttachFromLocal");
            }
            return g;
        }
    }

    /* renamed from: V7 */
    public static boolean m21358V7(C72683d dVar) {
        if (dVar == null) {
            return false;
        }
        C86009m1 m1Var = new C86009m1(dVar.field_fileFullPath);
        return m1Var.mo119967g() && m1Var.mo119980r() == dVar.field_totalLen;
    }

    /* renamed from: D0 */
    public void mo26085D0(C77335p pVar) {
        ((C119157j) C119157j.f356862d).mo183895z(new AppAttachNewDownloadUI$$d(this));
    }

    /* renamed from: H7 */
    public final void mo26116H7(List<String> list, List<Integer> list2) {
        if (C79758p.f233760a.mo109883f(new C110978f()) == 1) {
            if (this.f55985A.startsWith("fts_template") && (this.f55985A.endsWith(".zip") || this.f55985A.endsWith(".7z"))) {
                list.add(getString(C0966R.string.c0l));
                list2.add(25);
            } else if (this.f55985A.startsWith("was_template") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.c0w));
                list2.add(26);
            }
            if (this.f55985A.startsWith("fts_feature") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.c0k));
                list2.add(27);
            }
            if (this.f55985A.startsWith("wrd_template") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.c0j));
                list2.add(28);
            }
            if (this.f55985A.startsWith("pardus") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.c0s));
                list2.add(212);
            }
            if (this.f55985A.startsWith("box_template") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.c0h));
                list2.add(210);
            }
            if (this.f55985A.startsWith("box_flight_number") && this.f55985A.endsWith(".txt")) {
                list.add(getString(C0966R.string.c0i));
                list2.add(211);
            }
            if (this.f55985A.startsWith("popup_scan") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.c0t));
                list2.add(213);
            }
            if ((this.f55985A.startsWith("fs_kw_main") && this.f55985A.endsWith(".zip")) || this.f55985A.startsWith("73.1.data")) {
                list.add(getString(C0966R.string.c0n));
                list2.add(215);
            }
            if (this.f55985A.startsWith("tsc") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.c0u));
                list2.add(216);
            }
            if (this.f55985A.startsWith("ocr") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.c0o));
                list2.add(218);
            }
            if (this.f55985A.startsWith("mv_default_video") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.c0p));
                list2.add(219);
            }
            if (this.f55985A.startsWith("mv_transition") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.c0r));
                list2.add(221);
            }
            if (this.f55985A.startsWith("mv_app_icon") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.c0q));
                list2.add(Integer.valueOf(WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS));
            }
            if (this.f55985A.startsWith("TextState") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.c0v));
                list2.add(220);
            }
            if (this.f55985A.startsWith("ftshotsearch") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.c0m));
                list2.add(Integer.valueOf(WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB));
            }
            if (this.f55985A.startsWith("webtimeline") && this.f55985A.endsWith(".wspkg")) {
                list.add(getString(C0966R.string.c0f));
                list2.add(Integer.valueOf(WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL));
            }
            if (this.f55985A.startsWith(FirebaseAnalytics.C113379b.INDEX) && this.f55985A.endsWith(".wspkg")) {
                list.add(getString(C0966R.string.c0g));
                list2.add(225);
            }
            if (this.f55985A.startsWith("basic") && this.f55985A.endsWith(".wspkg")) {
                list.add(getString(C0966R.string.c0f));
                list2.add(226);
            }
            if (this.f55985A.startsWith("wx9e221f7828fa7482") && this.f55985A.endsWith(".wspkg")) {
                list.add(getString(C0966R.string.c0g));
                list2.add(Integer.valueOf(WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC));
            }
            if (this.f55985A.startsWith("wx2f3fb5db9f226462") && this.f55985A.endsWith(".wspkg")) {
                list.add(getString(C0966R.string.c0f));
                list2.add(231);
            }
            if (this.f55985A.startsWith("wxe208ce76dfa39515") && this.f55985A.endsWith(".wspkg")) {
                list.add(getString(C0966R.string.c0g));
                list2.add(232);
            }
            if (this.f55985A.startsWith("wxf337cbaa27790mb2") && this.f55985A.endsWith(".wspkg")) {
                list.add(getString(C0966R.string.cto));
                list2.add(235);
            }
            String str = this.f55985A;
            Locale locale = Locale.ROOT;
            if (str.toLowerCase(locale).startsWith(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE.toLowerCase(locale)) && this.f55985A.endsWith(".wspkg")) {
                list.add(getString(C0966R.string.c0g));
                list2.add(237);
            }
            if (this.f55985A.toLowerCase(locale).startsWith(MagicBrushConstants$PublicServiceNames.BIZ_AD_PUBLIC_SERVICE.toLowerCase(locale)) && this.f55985A.endsWith(".wspkg")) {
                list.add(getString(C0966R.string.ctn));
                list2.add(236);
            }
            if (this.f55985A.toLowerCase(locale).startsWith(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE.toLowerCase(locale)) && this.f55985A.endsWith(".wspkg")) {
                list.add(getString(C0966R.string.c0g));
                list2.add(Integer.valueOf(WXWebReporter.WXXWEB_PRE_DOWN_ARM32_SUC));
            }
            if (this.f55985A.startsWith("webcompt") && this.f55985A.endsWith(".wcpkg")) {
                list.add(getString(C0966R.string.m3b));
                list2.add(230);
            }
            if (this.f55985A.startsWith("esc") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.da7));
                list2.add(228);
            }
            if (this.f55985A.startsWith("biztestcase") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.muv));
                list2.add(233);
            }
            if (this.f55985A.startsWith("selecttext") && this.f55985A.endsWith(".zip")) {
                list.add(getString(C0966R.string.n6j));
                list2.add(234);
            }
        }
    }

    /* renamed from: I7 */
    public final void mo26117I7(boolean z) {
        if (mo26124P7() != null) {
            String str = mo26124P7().field_fileFullPath;
            String str2 = C112760b.m154195C() + "jsengine/pkg/";
            if (!C86013q1.m106450k(str2)) {
                C86013q1.m106461v(str2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(z ? "webtimeline.wspkg" : "index.wspkg");
            String sb4 = sb.toString();
            C86013q1.m106447h(sb4);
            long d = C86013q1.m106443d(str, sb4, false);
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "Done, ret=" + d, 1).show();
        }
    }

    /* renamed from: J7 */
    public final void mo26118J7(int i, int i2) {
        if (mo26124P7() != null) {
            LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent = new LocalCheckResUpdateCacheFileEvent();
            LocalCheckResUpdateCacheFileEvent.C28773a aVar = localCheckResUpdateCacheFileEvent.f78859d;
            aVar.f78860a = i;
            aVar.f78861b = i2;
            if (mo26124P7() != null) {
                localCheckResUpdateCacheFileEvent.f78859d.f78862c = mo26124P7().field_fileFullPath;
            }
            localCheckResUpdateCacheFileEvent.publish();
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply to mv", new Object[0]), 1).show();
        }
    }

    /* renamed from: K7 */
    public final void mo26119K7(boolean z, String str) {
        if (mo26124P7() != null) {
            String str2 = mo26124P7().field_fileFullPath;
            String str3 = C112760b.m154195C() + "surface/";
            if (!C86013q1.m106450k(str3)) {
                Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "mkdir %s ret:%b", str3, Boolean.valueOf(C86013q1.m106461v(str3)));
            }
            C86013q1.m106460u(str3);
            String str4 = str3 + "app/";
            if (!C86013q1.m106450k(str4)) {
                Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "mkdir %s ret:%b", str3 + "app/", Boolean.valueOf(C86013q1.m106461v(str4)));
            }
            C86013q1.m106460u(str4);
            String str5 = "";
            if (z) {
                if (str != str5) {
                    str5 = str + ".wspkg";
                } else {
                    str5 = "basic.wspkg";
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            if (!z) {
                str5 = "app/" + str + ".wspkg";
            }
            sb.append(str5);
            String sb4 = sb.toString();
            C86013q1.m106447h(sb4);
            long d = C86013q1.m106443d(str2, sb4, false);
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "Done, ret=" + d, 1).show();
        }
    }

    /* renamed from: L7 */
    public final void mo26120L7() {
        Class cls = C22921c.class;
        Class cls2 = C22923f.class;
        if (!this.f55995K) {
            this.f56028h.setVisibility(8);
            this.f56029i.setVisibility(8);
            return;
        }
        String Xa0 = ((C22921c) C86312j.m106911c(cls)).Xa0(((C22921c) C86312j.m106911c(cls)).mo35892nR(this.f55987C), 0);
        boolean BJ = ((C22921c) C86312j.m106911c(cls)).mo35875BJ(mo26126S7(), 0);
        if (this.f55997M || !this.f55999P || !((C22923f) C86312j.m106911c(cls2)).Rf0(this.f55987C, mo26126S7()) || !Xa0.isEmpty()) {
            if (this.f55997M && ((C22923f) C86312j.m106911c(cls2)).Rf0(this.f55987C, mo26126S7())) {
                this.f56029i.setVisibility(8);
                this.f56028h.setText(C0966R.string.mqf);
                this.f56028h.setOnClickListener(this.f56015X0);
            }
            if (this.f55997M && ((C22923f) C86312j.m106911c(cls2)).mo35905dQ(mo26126S7(), this.f55987C)) {
                this.f56029i.setVisibility(8);
                this.f56028h.setText(C0966R.string.mqf);
                if (!((C22923f) C86312j.m106911c(cls2)).Rf0(this.f55987C, mo26126S7())) {
                    this.f56028h.setText(C0966R.string.c0c);
                }
                this.f56028h.setOnClickListener(this.f56015X0);
            }
            if (this.f55997M && ((C22923f) C86312j.m106911c(cls2)).mo35905dQ(mo26126S7(), this.f55987C) && !((C22923f) C86312j.m106911c(cls2)).Rf0(this.f55987C, mo26126S7())) {
                this.f56029i.setText(C0966R.string.c0c);
                this.f56029i.setVisibility(0);
                this.f56029i.setOnClickListener(this.f56015X0);
                mo26133a8();
                this.f56028h.setText(C0966R.string.c1d);
                this.f56028h.setOnClickListener(new AppAttachNewDownloadUI$$k(this));
            }
            if (Xa0.isEmpty() && BJ) {
                this.f56029i.setVisibility(8);
                return;
            }
            return;
        }
        this.f56029i.setVisibility(0);
        this.f56029i.setText(C0966R.string.mqf);
        mo26133a8();
        this.f56029i.setOnClickListener(new AppAttachNewDownloadUI$$i(this));
        this.f56028h.setText(C0966R.string.c1d);
        this.f56028h.setOnClickListener(new AppAttachNewDownloadUI$$j(this));
    }

    /* renamed from: M7 */
    public final void mo26121M7() {
        C72683d k;
        if (!this.f55995K && this.f56038t.mo101020w3()) {
            C68070l.C68072b u = C68070l.C68072b.m80422u(this.f56038t.getContent(), (String) null);
            if (u.f195582i == 6 && !Util.isNullOrNil(u.f195650z) && (k = C72695v.m85069k(this.f56038t, u.f195606o)) != null && (!C86013q1.m106450k(k.field_fileFullPath) || C86013q1.m106451l(k.field_fileFullPath) != k.field_totalLen)) {
                this.f56012W = true;
                k.field_status = 101;
                k.field_lastModifyTime = C31543z5.m39453c();
                C72709y1.vx0().update(k, new String[0]);
                mo26142k8();
                return;
            }
        }
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        C96787m0.m124256j(doFavoriteEvent, this.f56038t);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264684i = this;
        aVar.f264688m = 39;
        doFavoriteEvent.publish();
    }

    /* renamed from: N7 */
    public final void mo26122N7(C77407n nVar) {
        Log.m105918d("MicroMsg.AppAttachNewDownloadUI", "enhanceBottomSheet");
        if (this.f56007T0 == null) {
            Log.m105918d("MicroMsg.AppAttachNewDownloadUI", "enhanceBottomSheet, openMaterialCollection is null");
            return;
        }
        C109033l0 l0Var = (C109033l0) C86312j.m106911c(C109033l0.class);
        if (l0Var == null) {
            Log.m105928w("MicroMsg.AppAttachNewDownloadUI", "enhanceBottomSheet, openMaterialService is null");
            return;
        }
        C98783b bVar = C98783b.ATTACH;
        if (!l0Var.mo158321RB(bVar)) {
            Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "tryEnhanceBottomSheet, openMaterialService is not enabled");
        } else if (!l0Var.mo158325ic(nVar, this.f56007T0)) {
            Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "tryEnhanceBottomSheet, not need enhance");
        } else {
            C107885g0 g0Var = this.f56011V0;
            if (g0Var != null) {
                g0Var.dead();
            }
            this.f56011V0 = l0Var.mo158322RD(bVar, this, nVar, this.f56007T0, (C107879e0) null, (C45944i0) null);
        }
    }

    /* renamed from: O7 */
    public final void mo26123O7() {
        Class cls = C22921c.class;
        String Xa0 = ((C22921c) C86312j.m106911c(cls)).Xa0(((C22921c) C86312j.m106911c(cls)).mo35892nR(this.f55987C), 0);
        this.f56045y0 = Xa0;
        if (!Xa0.isEmpty()) {
            try {
                ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(this.f56045y0, 0);
                this.f56001Q0 = applicationInfo.loadIcon(getPackageManager());
                this.f56003R0 = applicationInfo.loadLabel(getPackageManager()).toString();
            } catch (PackageManager.NameNotFoundException e) {
                Log.printErrStackTrace("MicroMsg.AppAttachNewDownloadUI", e, "fetchDefaultInfo:%s", this.f56045y0);
                ((C22921c) C86312j.m106911c(cls)).mo35891mQ(mo26126S7(), 0);
            }
        } else {
            this.f56003R0 = "";
        }
    }

    /* renamed from: P6 */
    public C23547h.C23548a mo25335P6() {
        return new C23547h.C23548a(false, this.f56029i.getText().toString(), this.f56028h.getText().toString(), ((C22921c) C86312j.m106911c(C22921c.class)).mo35875BJ(mo26126S7(), 0) ? this.f56003R0 : "", this.f56029i.getVisibility() == 0, this.f56028h.getVisibility() == 0);
    }

    /* renamed from: P7 */
    public final C72683d mo26124P7() {
        return m21357Q7(this.f56023d, this.f56037s, this.f56035q, this.f56042x);
    }

    /* renamed from: R7 */
    public MMActivity getContext() {
        return (MMActivity) super.getContext();
    }

    /* renamed from: S7 */
    public final String mo26126S7() {
        String str = null;
        C68070l.C68072b u = C68070l.C68072b.m80422u(this.f56042x, (String) null);
        String str2 = u.f195602n;
        if (str2 != null && str2.length() > 0) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(u.f195602n);
        }
        if (str != null && str.length() != 0) {
            return str;
        }
        Log.m105928w("MicroMsg.AppAttachNewDownloadUI", "getMimeType fail, not a built-in mimetype, use \"*/{fileext}\" instead");
        return "*/" + u.f195602n;
    }

    /* renamed from: T7 */
    public final void mo26127T7() {
        C108976d dVar = (C108976d) ((C23546f) C86312j.m106911c(C23546f.class)).U40(new C45293c(getContext()));
        this.f56016Y = dVar;
        ((C21105d) dVar).mo32878l(this.f56046z, this.f55987C, this.f55986B, true);
        ((C21105d) this.f56016Y).mo32879q(this.f55987C, this.f55985A);
        this.f56014X.saveToMultiTaskInfo(this.f56016Y.f326418a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x037e  */
    /* renamed from: U7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo26128U7() {
        /*
            r38 = this;
            r0 = r38
            java.lang.Class<wm.f> r1 = p262wm.C22923f.class
            java.lang.Class<wm.c> r2 = p262wm.C22921c.class
            android.content.Intent r3 = r38.getIntent()
            java.lang.String r4 = "scene"
            r5 = 0
            int r3 = r3.getIntExtra(r4, r5)
            r0.f56036r = r3
            android.content.Intent r3 = r38.getIntent()
            java.lang.String r4 = "app_msg_id"
            r6 = -1
            long r3 = r3.getLongExtra(r4, r6)
            r0.f56037s = r3
            android.content.Intent r3 = r38.getIntent()
            java.lang.String r4 = "choose_way"
            boolean r3 = r3.getBooleanExtra(r4, r5)
            r0.f55999P = r3
            android.content.Intent r3 = r38.getIntent()
            java.lang.String r4 = "msg_type"
            int r3 = r3.getIntExtra(r4, r5)
            r0.f56000Q = r3
            long r3 = r0.f56037s
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0041
            return r5
        L_0x0041:
            android.content.Intent r3 = r38.getIntent()
            java.lang.String r4 = "app_show_share"
            r6 = 1
            boolean r3 = r3.getBooleanExtra(r4, r6)
            r0.f56039u = r3
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.l r3 = r3.mo105911z()
            long r7 = r0.f56037s
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            com.tencent.mm.storage.f4 r3 = r3.b00(r7)
            r0.f56038t = r3
            long r3 = r3.getMsgId()
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0072
            com.tencent.mm.storage.f4 r3 = r0.f56038t
            java.lang.String r3 = r3.getContent()
            if (r3 != 0) goto L_0x00c3
        L_0x0072:
            int r3 = r0.f56000Q
            if (r3 != r6) goto L_0x0078
            r3 = 1
            goto L_0x0079
        L_0x0078:
            r3 = 0
        L_0x0079:
            if (r3 == 0) goto L_0x0434
            android.content.Intent r3 = r38.getIntent()
            java.lang.String r4 = "key_quoted_msg"
            android.os.Parcelable r3 = r3.getParcelableExtra(r4)
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r3 = (com.tencent.p014mm.plugin.msgquote.model.MsgQuoteItem) r3
            if (r3 != 0) goto L_0x008a
            return r5
        L_0x008a:
            com.tencent.mm.storage.f4 r4 = new com.tencent.mm.storage.f4
            r4.<init>()
            r0.f56038t = r4
            int r9 = r3.f201543d
            r4.setType(r9)
            com.tencent.mm.storage.f4 r4 = r0.f56038t
            long r9 = r3.f201544e
            r4.mo108745Y2(r9)
            com.tencent.mm.storage.f4 r4 = r0.f56038t
            java.lang.String r9 = r3.f201545f
            r4.mo108749c3(r9)
            com.tencent.mm.storage.f4 r4 = r0.f56038t
            java.lang.String r9 = r3.f201548i
            r4.mo101012p4(r9)
            com.tencent.mm.storage.f4 r4 = r0.f56038t
            java.lang.String r9 = r3.f201549j
            r4.mo108732L2(r9)
            java.lang.String r3 = r3.f201546g
            java.lang.String r4 = eb0.C75592q0.m90789s()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r4)
            if (r3 == 0) goto L_0x00c3
            com.tencent.mm.storage.f4 r3 = r0.f56038t
            r3.mo108740T2(r6)
        L_0x00c3:
            com.tencent.mm.storage.f4 r3 = r0.f56038t
            java.lang.String r3 = r3.mo108768t()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
            r0.f56041w = r3
            com.tencent.mm.storage.f4 r3 = r0.f56038t
            java.lang.String r3 = r3.getContent()
            r0.f56042x = r3
            boolean r3 = r0.f56041w
            if (r3 == 0) goto L_0x00f5
            com.tencent.mm.storage.f4 r3 = r0.f56038t
            int r3 = r3.mo108769t2()
            if (r3 != 0) goto L_0x00f5
            com.tencent.mm.storage.f4 r3 = r0.f56038t
            java.lang.String r3 = r3.getContent()
            boolean r4 = r0.f56041w
            if (r4 == 0) goto L_0x00f3
            if (r3 == 0) goto L_0x00f3
            java.lang.String r3 = eb0.C75604z3.m90849u(r3)
        L_0x00f3:
            r0.f56042x = r3
        L_0x00f5:
            java.lang.String r3 = r0.f56042x
            r4 = 0
            com.tencent.mm.message.l$b r3 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r3, r4)
            r0.f56044y = r3
            java.lang.String r9 = "MicroMsg.AppAttachNewDownloadUI"
            if (r3 != 0) goto L_0x010f
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r2 = r0.f56042x
            r1[r5] = r2
            java.lang.String r2 = "summerapp parse msgContent error, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r2, r1)
            return r5
        L_0x010f:
            java.lang.String r3 = r3.f195606o
            boolean r3 = sf0.C77702q0.m93719b(r3)
            java.lang.String r10 = ""
            if (r3 == 0) goto L_0x014a
            com.tencent.mm.message.l$b r3 = r0.f56044y
            java.lang.String r3 = r3.f195500J
            boolean r3 = sf0.C77702q0.m93719b(r3)
            if (r3 != 0) goto L_0x014a
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r11 = r0.f56042x
            r3[r5] = r11
            java.lang.String r11 = "summerapp msgContent format error, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r11, r3)
            com.tencent.mm.message.l$b r3 = r0.f56044y
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            com.tencent.mm.message.l$b r12 = r0.f56044y
            java.lang.String r12 = r12.f195500J
            int r12 = r12.hashCode()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r3.f195606o = r11
        L_0x014a:
            com.tencent.mm.message.l$b r3 = r0.f56044y
            int r11 = r3.f195582i
            r0.f56023d = r11
            java.lang.String r11 = r3.f195606o
            r0.f56035q = r11
            java.lang.String r11 = r3.f195570f
            if (r11 != 0) goto L_0x0159
            r11 = r10
        L_0x0159:
            r0.f55985A = r11
            java.lang.String r3 = r3.f195602n
            if (r3 != 0) goto L_0x0160
            r3 = r10
        L_0x0160:
            java.lang.String r3 = r3.toLowerCase()
            r0.f55987C = r3
            com.tencent.mm.message.l$b r11 = r0.f56044y
            int r12 = r11.f195594l
            long r12 = (long) r12
            r0.f55988D = r12
            java.lang.String r12 = r11.f195622s
            if (r12 != 0) goto L_0x0172
            r12 = r10
        L_0x0172:
            r0.f55989E = r12
            java.lang.String r12 = r11.f195488G
            if (r12 != 0) goto L_0x0179
            r12 = r10
        L_0x0179:
            r0.f55990F = r12
            java.lang.String r12 = r11.f195500J
            if (r12 != 0) goto L_0x0180
            r12 = r10
        L_0x0180:
            r0.f55991G = r12
            java.lang.String r12 = r11.f195650z
            if (r12 != 0) goto L_0x0187
            r12 = r10
        L_0x0187:
            r0.f55992H = r12
            java.lang.String r12 = r11.f195524R
            if (r12 != 0) goto L_0x018e
            r12 = r10
        L_0x018e:
            r0.f55993I = r12
            java.lang.String r11 = r11.f195472C
            if (r11 != 0) goto L_0x0195
            r11 = r10
        L_0x0195:
            r0.f55994J = r11
            boolean r3 = sf0.C77702q0.m93719b(r3)
            if (r3 == 0) goto L_0x01a5
            java.lang.String r3 = r0.f55985A
            java.lang.String r3 = com.tencent.p014mm.vfs.C86013q1.m106454o(r3)
            r0.f55987C = r3
        L_0x01a5:
            r3 = 6
            java.lang.Object[] r11 = new java.lang.Object[r3]
            long r12 = r0.f56037s
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11[r5] = r12
            com.tencent.mm.storage.f4 r12 = r0.f56038t
            int r12 = r12.mo108769t2()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r6] = r12
            java.lang.String r12 = r0.f56042x
            r13 = 2
            r11[r13] = r12
            int r12 = r0.f56023d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r14 = 3
            r11[r14] = r12
            java.lang.String r12 = r0.f56035q
            r15 = 4
            r11[r15] = r12
            r12 = 5
            java.lang.String r4 = r0.f55985A
            r11[r12] = r4
            java.lang.String r4 = "summerapp initParams msgId[%d], sender[%d], msgContent[%s], appType[%d], mediaId[%s], fileName[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r4, r11)
            com.tencent.mm.pluginsdk.model.app.d r4 = r38.mo26124P7()
            if (r4 != 0) goto L_0x01ea
            java.lang.String r7 = "summerapp initParams attInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            r0.f55996L = r5
            r11 = 2
            goto L_0x021b
        L_0x01ea:
            java.lang.String r11 = r4.field_fileFullPath
            r0.f56046z = r11
            long r13 = r4.field_offset
            int r16 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r16 <= 0) goto L_0x01f7
            r0.f55996L = r6
            goto L_0x01f9
        L_0x01f7:
            r0.f55996L = r5
        L_0x01f9:
            java.lang.Object[] r7 = new java.lang.Object[r15]
            r7[r5] = r11
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            r7[r6] = r8
            boolean r8 = r0.f55996L
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r11 = 2
            r7[r11] = r8
            long r12 = r4.field_status
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            r12 = 3
            r7[r12] = r8
            java.lang.String r8 = "summerapp initParams attInfo field_fileFullPath[%s], field_offset[%d], isDownloadStarted[%b], status[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r7)
        L_0x021b:
            com.tencent.mm.message.l$b r7 = r0.f56044y
            int r7 = r7.f195582i
            if (r7 != r3) goto L_0x023e
            java.lang.Class<i21.h> r3 = i21.C98591h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            i21.h r3 = (i21.C98591h) r3
            com.tencent.mm.storage.f4 r7 = r0.f56038t
            long r7 = r7.getMsgId()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            com.tencent.mm.storage.f4 r8 = r0.f56038t
            long r8 = r8.mo108774y2()
            boolean r12 = r0.f55996L
            r3.Fn0(r7, r8, r12)
        L_0x023e:
            r0.mo26136d8(r15, r5)
            java.lang.Class<c02.c> r3 = c02.C92331c.class
            java.lang.String r7 = eb0.C75592q0.m90789s()
            if (r7 != 0) goto L_0x024a
            r7 = r10
        L_0x024a:
            com.tencent.mm.storage.f4 r8 = r0.f56038t
            java.lang.String r8 = r8.mo108768t()
            if (r8 != 0) goto L_0x0253
            r8 = r10
        L_0x0253:
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85820U5(r8)
            if (r9 == 0) goto L_0x0260
            com.tencent.mm.message.l$b r8 = r0.f56044y
            java.lang.String r8 = r8.f195488G
            if (r8 != 0) goto L_0x0260
            r8 = r10
        L_0x0260:
            com.tencent.mm.storage.f4 r9 = r0.f56038t
            int r9 = r9.mo108769t2()
            if (r9 != r6) goto L_0x026b
            r36 = r7
            goto L_0x026d
        L_0x026b:
            r36 = r8
        L_0x026d:
            com.tencent.mm.storage.f4 r9 = r0.f56038t
            int r9 = r9.mo108769t2()
            if (r9 != r6) goto L_0x0278
            r37 = r8
            goto L_0x027a
        L_0x0278:
            r37 = r7
        L_0x027a:
            java.lang.Class<at.b> r7 = p444at.C92087b.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            r16 = r7
            at.b r16 = (p444at.C92087b) r16
            java.lang.String r7 = r0.f56046z
            if (r7 != 0) goto L_0x028b
            r17 = r10
            goto L_0x028d
        L_0x028b:
            r17 = r7
        L_0x028d:
            java.lang.String r7 = r0.f55987C
            java.lang.String r8 = r0.f55985A
            java.lang.String r9 = r0.f55989E
            long r12 = r0.f55988D
            r23 = 1
            com.tencent.mm.storage.f4 r10 = r0.f56038t
            long r14 = r10.mo108774y2()
            java.lang.String r24 = java.lang.Long.toString(r14)
            java.lang.String r10 = r0.f55991G
            boolean r10 = sf0.C77702q0.m93719b(r10)
            if (r10 != 0) goto L_0x02ac
            java.lang.String r10 = r0.f55991G
            goto L_0x02ae
        L_0x02ac:
            java.lang.String r10 = r0.f55992H
        L_0x02ae:
            r26 = r10
            java.lang.String r10 = r0.f55993I
            r27 = r10
            java.lang.String r10 = r0.f55994J
            r28 = r10
            r29 = 1
            r31 = 0
            r33 = 0
            r35 = 1
            java.lang.String r25 = ""
            java.lang.String r30 = ""
            java.lang.String r32 = ""
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r12
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r7 = r16.a40(r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37)
            r0.f56014X = r7
            com.tencent.mm.pluginsdk.model.app.d r7 = r38.mo26124P7()
            boolean r7 = m21358V7(r7)
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r8 = r0.f56014X
            if (r7 == 0) goto L_0x02e2
            r13 = 1
            goto L_0x02e3
        L_0x02e2:
            r13 = 2
        L_0x02e3:
            r8.setFileStatus(r13)
            di3.d r7 = di3.C86312j.m106911c(r3)
            c02.c r7 = (c02.C92331c) r7
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r8 = r0.f56014X
            r7.mo58375rt(r8)
            di3.d r3 = di3.C86312j.m106911c(r3)
            c02.c r3 = (c02.C92331c) r3
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r7 = r0.f56014X
            r3.mo58377tt(r7)
            if (r4 == 0) goto L_0x0352
            java.lang.String r3 = r4.field_fileFullPath
            android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r3)
            java.lang.String r7 = r3.getPath()
            if (r7 == 0) goto L_0x0324
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r5, r5)
            java.lang.String r8 = r3.getPath()
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0324
            android.net.Uri$Builder r3 = r3.buildUpon()
            android.net.Uri$Builder r3 = r3.path(r7)
            android.net.Uri r3 = r3.build()
        L_0x0324:
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r8 = 0
            com.tencent.mm.vfs.f0$h r3 = r7.mo177799l(r3, r8)
            boolean r7 = r3.mo177810a()
            if (r7 != 0) goto L_0x0333
            r3 = 0
            goto L_0x033b
        L_0x0333:
            com.tencent.mm.vfs.FileSystem$c r7 = r3.f348991a
            java.lang.String r3 = r3.f348992b
            boolean r3 = r7.mo119948x(r3)
        L_0x033b:
            if (r3 != 0) goto L_0x033e
            goto L_0x0352
        L_0x033e:
            boolean r3 = r4.mo100146l2()
            if (r3 != 0) goto L_0x0350
            com.tencent.mm.storage.f4 r3 = r0.f56038t
            int r3 = r3.mo108769t2()
            if (r3 != r6) goto L_0x0352
            boolean r3 = r4.field_isUpload
            if (r3 == 0) goto L_0x0352
        L_0x0350:
            r3 = 1
            goto L_0x0353
        L_0x0352:
            r3 = 0
        L_0x0353:
            r0.f55995K = r3
            if (r3 != 0) goto L_0x0375
            di3.d r3 = di3.C86312j.m106911c(r2)
            wm.c r3 = (p262wm.C22921c) r3
            di3.d r7 = di3.C86312j.m106911c(r2)
            wm.c r7 = (p262wm.C22921c) r7
            java.lang.String r8 = r0.f55987C
            java.lang.String r7 = r7.mo35892nR(r8)
            java.lang.String r3 = r3.Xa0(r7, r5)
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0375
            r3 = 1
            goto L_0x0376
        L_0x0375:
            r3 = 0
        L_0x0376:
            r0.f55997M = r3
            boolean r3 = m21358V7(r4)
            if (r3 == 0) goto L_0x0433
            int r3 = r0.f56036r
            r7 = 3
            if (r3 != r7) goto L_0x03a5
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = r0.f56046z
            java.lang.String r3 = "filePath"
            r1.putExtra(r3, r2)
            java.lang.String r2 = r0.f55985A
            java.lang.String r3 = "fileName"
            r1.putExtra(r3, r2)
            java.lang.String r2 = r0.f55987C
            java.lang.String r3 = "fileExt"
            r1.putExtra(r3, r2)
            r2 = -1
            r0.setResult(r2, r1)
            r38.finish()
            return r6
        L_0x03a5:
            if (r3 != r6) goto L_0x03c4
            r1 = 7
            r0.f55986B = r1
            boolean r1 = r0.f55999P
            if (r1 == 0) goto L_0x03bf
            di3.d r1 = di3.C86312j.m106911c(r2)
            wm.c r1 = (p262wm.C22921c) r1
            java.lang.String r2 = r4.field_fileFullPath
            java.lang.String r3 = r0.f55987C
            int r4 = r0.f55986B
            boolean r1 = r1.Om0(r0, r2, r3, r4)
            return r1
        L_0x03bf:
            boolean r1 = r0.mo26134b8(r6)
            return r1
        L_0x03c4:
            int r3 = r0.f55986B
            r7 = 9
            if (r3 == r7) goto L_0x03cc
            r0.f55986B = r6
        L_0x03cc:
            boolean r3 = r0.f55999P
            if (r3 == 0) goto L_0x03e1
            di3.d r1 = di3.C86312j.m106911c(r2)
            wm.c r1 = (p262wm.C22921c) r1
            java.lang.String r2 = r4.field_fileFullPath
            java.lang.String r3 = r0.f55987C
            int r4 = r0.f55986B
            boolean r1 = r1.Om0(r0, r2, r3, r4)
            return r1
        L_0x03e1:
            di3.d r3 = di3.C86312j.m106911c(r2)
            wm.c r3 = (p262wm.C22921c) r3
            java.lang.String r4 = r4.field_fileFullPath
            java.lang.String r7 = r0.f55987C
            boolean r3 = r3.Av0(r4, r7)
            if (r3 != 0) goto L_0x0433
            di3.d r3 = di3.C86312j.m106911c(r2)
            wm.c r3 = (p262wm.C22921c) r3
            di3.d r2 = di3.C86312j.m106911c(r2)
            wm.c r2 = (p262wm.C22921c) r2
            java.lang.String r4 = r0.f55987C
            java.lang.String r2 = r2.mo35892nR(r4)
            java.lang.String r2 = r3.Xa0(r2, r5)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0433
            di3.d r2 = di3.C86312j.m106911c(r1)
            wm.f r2 = (p262wm.C22923f) r2
            java.lang.String r3 = r0.f55987C
            boolean r2 = r2.Ot0(r3)
            if (r2 == 0) goto L_0x0420
            boolean r1 = r0.mo26134b8(r5)
            return r1
        L_0x0420:
            di3.d r1 = di3.C86312j.m106911c(r1)
            wm.f r1 = (p262wm.C22923f) r1
            java.lang.String r2 = r38.mo26126S7()
            boolean r1 = r1.mo35899LV(r2)
            if (r1 == 0) goto L_0x0433
            r38.mo26135c8()
        L_0x0433:
            return r6
        L_0x0434:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.AppAttachNewDownloadUI.mo26128U7():boolean");
    }

    /* renamed from: W7 */
    public final boolean mo26129W7() {
        C72683d P7 = mo26124P7();
        if (P7 == null) {
            return true;
        }
        if (C86013q1.m106450k(P7.field_fileFullPath)) {
            mo26137e8(8);
            this.f56027g.mo26155a(8);
            return true;
        }
        mo26137e8(8);
        mo26130X7();
        if (this.f56036r != 3) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("resLoadFailed", true);
        setResult(-1, intent);
        finish();
        return false;
    }

    /* renamed from: X7 */
    public final void mo26130X7() {
        this.f56002R.setVisibility(0);
        this.f56027g.mo26156b(false);
        this.f56004S.setVisibility(8);
    }

    /* renamed from: Y7 */
    public final void mo26131Y7(int i) {
        if (i != 215) {
            if (i != 216) {
                switch (i) {
                    case 25:
                        if (mo26124P7() != null) {
                            LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent = new LocalCheckResUpdateCacheFileEvent();
                            LocalCheckResUpdateCacheFileEvent.C28773a aVar = localCheckResUpdateCacheFileEvent.f78859d;
                            aVar.f78860a = 27;
                            aVar.f78861b = 1;
                            if (mo26124P7() != null) {
                                localCheckResUpdateCacheFileEvent.f78859d.f78862c = mo26124P7().field_fileFullPath;
                            }
                            localCheckResUpdateCacheFileEvent.publish();
                            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("current template is %d", new Object[]{Integer.valueOf(C43471q.m46977a(0))}), 1).show();
                            C86032n.m106476b("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
                            return;
                        }
                        return;
                    case 26:
                        LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent2 = new LocalCheckResUpdateCacheFileEvent();
                        LocalCheckResUpdateCacheFileEvent.C28773a aVar2 = localCheckResUpdateCacheFileEvent2.f78859d;
                        aVar2.f78860a = 40;
                        aVar2.f78861b = 1;
                        if (mo26124P7() != null) {
                            localCheckResUpdateCacheFileEvent2.f78859d.f78862c = mo26124P7().field_fileFullPath;
                            localCheckResUpdateCacheFileEvent2.f78859d.f78862c = mo26124P7().field_fileFullPath;
                        }
                        localCheckResUpdateCacheFileEvent2.publish();
                        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("current wxa template is %d", new Object[]{Integer.valueOf(C43471q.m46977a(3))}), 1).show();
                        return;
                    case 27:
                        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = new CheckResUpdateCacheFileEvent();
                        CheckResUpdateCacheFileEvent.C28720a aVar3 = checkResUpdateCacheFileEvent.f78743d;
                        aVar3.f78744a = 35;
                        aVar3.f78745b = 1;
                        if (mo26124P7() != null) {
                            checkResUpdateCacheFileEvent.f78743d.f78746c = mo26124P7().field_fileFullPath;
                        }
                        checkResUpdateCacheFileEvent.publish();
                        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
                        return;
                    case 28:
                        LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent3 = new LocalCheckResUpdateCacheFileEvent();
                        LocalCheckResUpdateCacheFileEvent.C28773a aVar4 = localCheckResUpdateCacheFileEvent3.f78859d;
                        aVar4.f78860a = 27;
                        aVar4.f78861b = 2;
                        if (mo26124P7() != null) {
                            localCheckResUpdateCacheFileEvent3.f78859d.f78862c = mo26124P7().field_fileFullPath;
                        }
                        localCheckResUpdateCacheFileEvent3.publish();
                        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("current browse template is %d", new Object[]{Integer.valueOf(C43471q.m46977a(1))}), 1).show();
                        return;
                    default:
                        switch (i) {
                            case 210:
                                CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent2 = new CheckResUpdateCacheFileEvent();
                                CheckResUpdateCacheFileEvent.C28720a aVar5 = checkResUpdateCacheFileEvent2.f78743d;
                                aVar5.f78744a = 62;
                                aVar5.f78745b = 1;
                                if (mo26124P7() != null) {
                                    checkResUpdateCacheFileEvent2.f78743d.f78746c = mo26124P7().field_fileFullPath;
                                }
                                checkResUpdateCacheFileEvent2.publish();
                                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
                                return;
                            case 211:
                                CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent3 = new CheckResUpdateCacheFileEvent();
                                CheckResUpdateCacheFileEvent.C28720a aVar6 = checkResUpdateCacheFileEvent3.f78743d;
                                aVar6.f78744a = 62;
                                aVar6.f78745b = 2;
                                if (mo26124P7() != null) {
                                    checkResUpdateCacheFileEvent3.f78743d.f78746c = mo26124P7().field_fileFullPath;
                                }
                                checkResUpdateCacheFileEvent3.publish();
                                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
                                return;
                            case 212:
                                LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent4 = new LocalCheckResUpdateCacheFileEvent();
                                LocalCheckResUpdateCacheFileEvent.C28773a aVar7 = localCheckResUpdateCacheFileEvent4.f78859d;
                                aVar7.f78860a = 66;
                                aVar7.f78861b = 1;
                                if (mo26124P7() != null) {
                                    localCheckResUpdateCacheFileEvent4.f78859d.f78862c = mo26124P7().field_fileFullPath;
                                }
                                localCheckResUpdateCacheFileEvent4.publish();
                                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("current pardus template is %d", new Object[]{Integer.valueOf(C43471q.m46977a(5))}), 1).show();
                                return;
                            case 213:
                                Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "alvinluo applyToScanGoods");
                                CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent4 = new CheckResUpdateCacheFileEvent();
                                CheckResUpdateCacheFileEvent.C28720a aVar8 = checkResUpdateCacheFileEvent4.f78743d;
                                aVar8.f78744a = 64;
                                aVar8.f78745b = 1;
                                if (mo26124P7() != null) {
                                    checkResUpdateCacheFileEvent4.f78743d.f78746c = mo26124P7().field_fileFullPath;
                                }
                                checkResUpdateCacheFileEvent4.publish();
                                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
                                return;
                            default:
                                switch (i) {
                                    case 218:
                                        Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "alvinluo applyToImageOcr");
                                        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent5 = new CheckResUpdateCacheFileEvent();
                                        CheckResUpdateCacheFileEvent.C28720a aVar9 = checkResUpdateCacheFileEvent5.f78743d;
                                        aVar9.f78744a = 84;
                                        aVar9.f78745b = 1;
                                        if (mo26124P7() != null) {
                                            checkResUpdateCacheFileEvent5.f78743d.f78746c = mo26124P7().field_fileFullPath;
                                        }
                                        checkResUpdateCacheFileEvent5.publish();
                                        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
                                        return;
                                    case 219:
                                        mo26118J7(87, 1);
                                        return;
                                    case 220:
                                        if (mo26124P7() != null) {
                                            LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent5 = new LocalCheckResUpdateCacheFileEvent();
                                            LocalCheckResUpdateCacheFileEvent.C28773a aVar10 = localCheckResUpdateCacheFileEvent5.f78859d;
                                            aVar10.f78860a = 86;
                                            aVar10.f78861b = 2;
                                            if (mo26124P7() != null) {
                                                localCheckResUpdateCacheFileEvent5.f78859d.f78862c = mo26124P7().field_fileFullPath;
                                            }
                                            localCheckResUpdateCacheFileEvent5.publish();
                                            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply to TextStatus", new Object[0]), 1).show();
                                            return;
                                        }
                                        return;
                                    case 221:
                                        mo26118J7(92, 1);
                                        return;
                                    case WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS /*222*/:
                                        mo26118J7(92, 2);
                                        return;
                                    case WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB /*223*/:
                                        LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent6 = new LocalCheckResUpdateCacheFileEvent();
                                        LocalCheckResUpdateCacheFileEvent.C28773a aVar11 = localCheckResUpdateCacheFileEvent6.f78859d;
                                        aVar11.f78860a = 95;
                                        aVar11.f78861b = 1;
                                        if (mo26124P7() != null) {
                                            localCheckResUpdateCacheFileEvent6.f78859d.f78862c = mo26124P7().field_fileFullPath;
                                        }
                                        localCheckResUpdateCacheFileEvent6.publish();
                                        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("current ftshotsearch template is %d", new Object[]{Integer.valueOf(C43471q.m46977a(9))}), 1).show();
                                        return;
                                    case WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL /*224*/:
                                        mo26117I7(true);
                                        return;
                                    case 225:
                                        mo26117I7(false);
                                        return;
                                    case 226:
                                        mo26119K7(true, "");
                                        return;
                                    case WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC /*227*/:
                                        mo26119K7(false, "wx9e221f7828fa7482");
                                        return;
                                    case 228:
                                        LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent7 = new LocalCheckResUpdateCacheFileEvent();
                                        LocalCheckResUpdateCacheFileEvent.C28773a aVar12 = localCheckResUpdateCacheFileEvent7.f78859d;
                                        aVar12.f78860a = 79;
                                        aVar12.f78861b = 2;
                                        if (mo26124P7() != null) {
                                            localCheckResUpdateCacheFileEvent7.f78859d.f78862c = mo26124P7().field_fileFullPath;
                                        }
                                        localCheckResUpdateCacheFileEvent7.publish();
                                        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("current emojisearch template is %d", new Object[]{Integer.valueOf(C43471q.m46977a(10))}), 1).show();
                                        return;
                                    default:
                                        switch (i) {
                                            case 230:
                                                if (mo26124P7() != null) {
                                                    String str = mo26124P7().field_fileFullPath;
                                                    String str2 = C112760b.m154195C() + "webcompt_debug/jsapi/";
                                                    if (!C86013q1.m106450k(str2)) {
                                                        C86013q1.m106461v(str2);
                                                    }
                                                    String str3 = str2 + "webcompt.wcpkg";
                                                    C86013q1.m106447h(str3);
                                                    long d = C86013q1.m106443d(str, str3, false);
                                                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "Done, ret=" + d, 1).show();
                                                    return;
                                                }
                                                return;
                                            case 231:
                                                mo26119K7(true, "wx2f3fb5db9f226462");
                                                return;
                                            case 232:
                                                mo26119K7(false, "wxe208ce76dfa39515");
                                                return;
                                            case 233:
                                                break;
                                            case 234:
                                                Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "applyToSelectText");
                                                CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent6 = new CheckResUpdateCacheFileEvent();
                                                CheckResUpdateCacheFileEvent.C28720a aVar13 = checkResUpdateCacheFileEvent6.f78743d;
                                                aVar13.f78744a = 84;
                                                aVar13.f78745b = 2;
                                                if (mo26124P7() != null) {
                                                    checkResUpdateCacheFileEvent6.f78743d.f78746c = mo26124P7().field_fileFullPath;
                                                }
                                                checkResUpdateCacheFileEvent6.publish();
                                                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
                                                return;
                                            case 235:
                                                mo26119K7(false, "wxf337cbaa27790mb2");
                                                return;
                                            case 236:
                                                mo26119K7(true, MagicBrushConstants$PublicServiceNames.BIZ_AD_PUBLIC_SERVICE);
                                                return;
                                            case 237:
                                                mo26119K7(false, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE);
                                                return;
                                            case WXWebReporter.WXXWEB_PRE_DOWN_ARM32_SUC /*238*/:
                                                mo26119K7(false, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE);
                                                return;
                                            default:
                                                return;
                                        }
                                }
                        }
                }
            } else {
                LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent8 = new LocalCheckResUpdateCacheFileEvent();
                LocalCheckResUpdateCacheFileEvent.C28773a aVar14 = localCheckResUpdateCacheFileEvent8.f78859d;
                aVar14.f78860a = 79;
                aVar14.f78861b = 1;
                if (mo26124P7() != null) {
                    localCheckResUpdateCacheFileEvent8.f78859d.f78862c = mo26124P7().field_fileFullPath;
                }
                localCheckResUpdateCacheFileEvent8.publish();
                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
            }
            if (mo26124P7() != null) {
                String str4 = mo26124P7().field_fileFullPath;
                String str5 = C112760b.m154195C() + "biztest/";
                if (C86013q1.m106450k(str5)) {
                    C86013q1.m106445f(str5);
                }
                C86013q1.m106461v(str5);
                long R = (long) C86013q1.m106436R(str4, str5);
                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "Done, ret=" + R, 1).show();
                return;
            }
            return;
        }
        LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent9 = new LocalCheckResUpdateCacheFileEvent();
        LocalCheckResUpdateCacheFileEvent.C28773a aVar15 = localCheckResUpdateCacheFileEvent9.f78859d;
        aVar15.f78860a = 73;
        aVar15.f78861b = 1;
        if (mo26124P7() != null) {
            localCheckResUpdateCacheFileEvent9.f78859d.f78862c = mo26124P7().field_fileFullPath;
        }
        localCheckResUpdateCacheFileEvent9.publish();
        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
    }

    /* renamed from: Z7 */
    public final void mo26132Z7() {
        Class cls = C92331c.class;
        int i = this.f56023d;
        if (i != 0) {
            if (i != 2) {
                if (i == 74 || i == 6) {
                    if (mo26129W7()) {
                        if (Util.isImageExt(this.f55987C)) {
                            mo26138f8();
                        } else {
                            Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "onDownLoadImpl");
                            mo26139g8(false);
                        }
                    }
                } else if (i != 7) {
                    this.f56028h.setVisibility(0);
                    mo26141j8();
                    mo26137e8(8);
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("App_MsgId", this.f56037s);
                    setResult(-1, intent);
                    finish();
                }
            } else if (mo26129W7()) {
                Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "[ImageGalleryUI] showImage");
                Intent intent2 = new Intent(this, ImageGalleryUI.class);
                intent2.putExtra("img_gallery_msg_id", this.f56038t.getMsgId());
                intent2.putExtra("img_gallery_talker", this.f56038t.mo108768t());
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "showImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "showImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
                overridePendingTransition(0, 0);
            }
        } else if (mo26129W7()) {
            if (Util.isImageExt(this.f55987C)) {
                mo26138f8();
            } else {
                mo26137e8(8);
                this.f56027g.mo26155a(8);
                if (C77702q0.m93719b(mo26126S7())) {
                    this.f56029i.setVisibility(8);
                    this.f56028h.setVisibility(8);
                } else {
                    this.f56028h.setVisibility(0);
                    mo26141j8();
                }
                mo26140i8();
            }
        }
        if (this.f56014X.getFileStatus() != 1) {
            this.f56014X.setFileStatus(1);
            C72683d P7 = mo26124P7();
            if (P7 != null) {
                AbsHandOffFile absHandOffFile = this.f56014X;
                String str = P7.field_fileFullPath;
                int i2 = C77702q0.f226484a;
                if (str == null) {
                    str = "";
                }
                absHandOffFile.setFullPath(str);
            }
            ((C92331c) C86312j.m106911c(cls)).mo58375rt(this.f56014X);
            ((C92331c) C86312j.m106911c(cls)).Gg0(this.f56014X);
        }
        Log.m105918d("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials");
        if (C77702q0.m93719b(this.f56046z)) {
            Log.m105928w("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials, filePath is empty");
        } else if (!this.f56046z.equals(this.f56005S0) || this.f56007T0 == null) {
            MaterialModel b = MaterialModel.m117225b(this.f56046z, this.f55987C);
            C109033l0 l0Var = (C109033l0) C86312j.m106911c(C109033l0.class);
            if (l0Var == null) {
                Log.m105928w("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials, openMaterialService is null");
            } else if (!l0Var.mo158321RB(C98783b.ATTACH)) {
                Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials, openMaterialService is not enabled");
            } else {
                l0Var.mo158324aj(b, new AppAttachNewDownloadUI$$v(this, b, l0Var));
            }
        } else {
            Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials, already load");
        }
    }

    /* renamed from: a8 */
    public final void mo26133a8() {
        this.f56028h.setBackgroundResource(C0966R.C0969drawable.f4665jf);
        this.f56028h.setTextColor(C111105a.m151501c(getContext(), C0966R.color.al7));
    }

    /* renamed from: b8 */
    public final boolean mo26134b8(boolean z) {
        C51173ry ryVar = new C51173ry();
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_multi_task_common_info");
        if (byteArrayExtra != null) {
            try {
                ryVar.parseFrom(byteArrayExtra);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppAttachNewDownloadUI", e, "", new Object[0]);
            }
        }
        return ((C22921c) C86312j.m106911c(C22921c.class)).mo35874Az(this.f56037s, this.f56046z, this.f55987C, "", this.f55986B, ryVar, z);
    }

    /* renamed from: c8 */
    public final void mo26135c8() {
        Class cls = C22921c.class;
        C72683d P7 = mo26124P7();
        if (P7 == null) {
            Log.m105920e("MicroMsg.AppAttachNewDownloadUI", "open fail, info is null");
            return;
        }
        String str = P7.field_fileFullPath;
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AppAttachNewDownloadUI", "open fail, field fileFullPath is null");
            return;
        }
        String str2 = P7.field_fileFullPath;
        if (this.f56036r == 1) {
            ((C22921c) C86312j.m106911c(cls)).hr0(this, this.f56037s, str2, this.f55987C, this.f55985A, 7);
        } else {
            ((C22921c) C86312j.m106911c(cls)).hr0(this, this.f56037s, str2, this.f55987C, this.f55985A, 1);
        }
        Button button = this.f56028h;
        if (button != null) {
            button.setEnabled(false);
        }
        Button button2 = this.f56029i;
        if (button2 != null) {
            button2.setEnabled(false);
        }
    }

    /* renamed from: d8 */
    public final void mo26136d8(int i, int i2) {
        C77878b bVar;
        int i3 = this.f56023d;
        if (6 == i3 || 74 == i3) {
            if (i2 != -1) {
                C117407d.INSTANCE.idkeyStat(1203, (long) i2, 1, false);
            }
            long y2 = this.f56038t.mo108774y2();
            C68070l.C68072b bVar2 = this.f56044y;
            if (!(bVar2 == null || (bVar = (C77878b) bVar2.mo93555w(C77878b.class)) == null)) {
                long j = bVar.f226901b;
                if (j != 0) {
                    y2 = j;
                }
            }
            Object[] objArr = new Object[13];
            C68070l.C68072b bVar3 = this.f56044y;
            objArr[0] = bVar3.f195500J;
            objArr[1] = Integer.valueOf(bVar3.f195626t == 1 ? 7 : 5);
            objArr[2] = Integer.valueOf(this.f56044y.f195594l);
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Long.valueOf((C31543z5.m39453c() - this.f56038t.getCreateTime()) / 1000);
            objArr[5] = this.f55987C;
            objArr[6] = this.f56038t.mo108768t();
            objArr[7] = 1;
            objArr[8] = "";
            objArr[9] = Long.valueOf(y2);
            objArr[10] = Long.valueOf(this.f56038t.getCreateTime());
            objArr[11] = Long.valueOf(C31543z5.m39451a());
            objArr[12] = 1;
            String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", objArr);
            Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "reportKVStat 14665 %s", format);
            C115669n.INSTANCE.kvStat(14665, format);
        }
    }

    /* renamed from: e8 */
    public final void mo26137e8(int i) {
        if (i != this.f56026f.getVisibility()) {
            int i2 = C77702q0.f226484a;
            Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "setRoundProgressBar %s %s", Integer.valueOf(i), new C77702q0.C77703a());
            this.f56026f.setVisibility(i);
            if (i == 0) {
                mo26144m8();
            }
        }
    }

    /* renamed from: f8 */
    public final void mo26138f8() {
        C72683d P7 = mo26124P7();
        if (P7 == null) {
            Log.m105920e("MicroMsg.AppAttachNewDownloadUI", "info == null");
            return;
        }
        Intent intent = new Intent(this, ShowImageUI.class);
        intent.putExtra("key_message_id", this.f56038t.getMsgId());
        intent.putExtra("key_image_path", P7.field_fileFullPath);
        intent.putExtra("key_favorite", true);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "showFileImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "showFileImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public void finish() {
        C97669b bVar = this.f56018Z;
        if (bVar != null) {
            ((FloatBallHelper) bVar).mo149068c0();
        }
        super.finish();
    }

    /* renamed from: g8 */
    public final void mo26139g8(boolean z) {
        int i = this.f56023d;
        if (i == 74 || i == 6) {
            Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "showFileReceiveStateView appType:%s isFileSender:%s fileStatus:%s startDownload:%s isDownloadStarted:%s isDownloadFinished:%s", Integer.valueOf(i), Integer.valueOf(this.f56038t.f230741Y), Integer.valueOf(this.f56038t.f230742Z), Boolean.valueOf(z), Boolean.valueOf(this.f55996L), Boolean.valueOf(this.f55995K));
            if (this.f56023d == 74 && !this.f55995K) {
                int i2 = this.f56038t.f230742Z;
                if (i2 == 0) {
                    this.f56027g.mo26155a(8);
                    this.f56010V.setVisibility(0);
                    this.f56004S.setVisibility(8);
                    this.f56006T.setVisibility(8);
                    this.f56008U.setVisibility(8);
                    this.f56029i.setVisibility(8);
                    this.f56028h.setVisibility(8);
                    mo26137e8(8);
                } else if (i2 == 1) {
                    this.f56027g.mo26155a(8);
                    this.f56010V.setVisibility(8);
                    this.f56004S.setVisibility(0);
                    if (this.f56038t.mo108769t2() == 1) {
                        this.f56004S.setText(C0966R.string.cvl);
                    } else {
                        this.f56004S.setText(C0966R.string.cvk);
                    }
                    this.f56006T.setVisibility(0);
                    this.f56008U.setVisibility(0);
                    this.f56029i.setVisibility(8);
                    this.f56028h.setVisibility(8);
                    mo26137e8(8);
                } else if (i2 == 2) {
                    this.f56027g.mo26156b(true);
                    this.f56010V.setVisibility(8);
                    this.f56004S.setVisibility(8);
                    this.f56006T.setVisibility(8);
                    this.f56008U.setVisibility(8);
                    this.f56029i.setVisibility(8);
                    this.f56028h.setVisibility(8);
                    mo26137e8(8);
                }
            }
            if (this.f56023d == 6 || this.f55995K) {
                C72683d P7 = mo26124P7();
                if (this.f56038t.f230741Y == 1 && P7 != null) {
                    long j = P7.field_status;
                    if (((int) j) == 102 || ((int) j) == 198 || ((int) j) == 101) {
                        Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "showFileReceiveStateView appAttachInfo is %s", Long.valueOf(j));
                        long j2 = P7.field_status;
                        if (((int) j2) == 102) {
                            this.f56027g.mo26155a(0);
                            this.f56010V.setVisibility(8);
                            this.f56004S.setVisibility(8);
                            this.f56006T.setVisibility(8);
                            this.f56008U.setVisibility(8);
                            this.f56029i.setVisibility(8);
                            this.f56028h.setVisibility(8);
                            mo26137e8(8);
                        } else if (((int) j2) == 198) {
                            if (this.f56038t.f230742Z != 3) {
                                this.f56027g.mo26156b(false);
                                this.f56010V.setVisibility(8);
                                this.f56004S.setVisibility(8);
                                this.f56006T.setVisibility(8);
                                this.f56008U.setVisibility(8);
                                this.f56029i.setVisibility(8);
                                this.f56028h.setVisibility(8);
                                mo26137e8(8);
                            } else {
                                this.f56027g.mo26155a(0);
                                this.f56010V.setVisibility(8);
                                this.f56004S.setVisibility(8);
                                this.f56006T.setVisibility(8);
                                this.f56008U.setVisibility(8);
                                this.f56029i.setVisibility(8);
                                this.f56028h.setVisibility(8);
                                mo26137e8(8);
                            }
                        } else if (((int) j2) == 101) {
                            this.f56027g.mo26155a(8);
                            this.f56010V.setVisibility(8);
                            this.f56006T.setVisibility(8);
                            this.f56004S.setVisibility(0);
                            this.f56004S.setText(C0966R.string.cv7);
                            this.f56008U.setVisibility(8);
                            this.f56029i.setVisibility(8);
                            this.f56028h.setVisibility(8);
                            mo26137e8(0);
                        }
                    }
                }
                if (z) {
                    this.f56027g.mo26155a(8);
                    this.f56010V.setVisibility(8);
                    this.f56006T.setVisibility(8);
                    this.f56004S.setVisibility(0);
                    this.f56004S.setText(C0966R.string.cv7);
                    this.f56008U.setVisibility(8);
                    this.f56029i.setVisibility(8);
                    this.f56028h.setVisibility(8);
                    mo26137e8(0);
                } else if (this.f55995K) {
                    this.f56027g.mo26155a(8);
                    this.f56010V.setVisibility(8);
                    this.f56006T.setVisibility(8);
                    this.f56004S.setVisibility(8);
                    this.f56008U.setVisibility(8);
                    if (mo26126S7().equals("")) {
                        this.f56029i.setVisibility(8);
                        this.f56028h.setVisibility(8);
                    } else {
                        this.f56028h.setVisibility(0);
                        mo26120L7();
                        mo26141j8();
                    }
                    mo26137e8(8);
                } else {
                    if (this.f55996L) {
                        this.f56027g.mo26155a(8);
                        this.f56010V.setVisibility(8);
                        mo26137e8(0);
                        this.f56004S.setVisibility(0);
                        this.f56004S.setText(C0966R.string.cv7);
                        mo26144m8();
                    } else {
                        this.f56027g.mo26155a(8);
                        this.f56010V.setVisibility(0);
                        mo26137e8(8);
                        this.f56004S.setVisibility(8);
                    }
                    this.f56006T.setVisibility(8);
                    this.f56008U.setVisibility(8);
                    this.f56029i.setVisibility(8);
                    this.f56028h.setVisibility(8);
                }
            }
            mo26140i8();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7152zw;
    }

    /* renamed from: i8 */
    public final void mo26140i8() {
        this.f56031n.setVisibility(0);
        if (this.f55985A.equals("")) {
            this.f56031n.setText(getString(C0966R.string.hfk));
        } else {
            this.f56031n.setText(this.f55985A);
        }
    }

    public final void init() {
        Class cls = C75700k0.class;
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        if (!mo26128U7()) {
            finish();
            return;
        }
        if (this.f56038t.getType() == 1090519089) {
            C72963f4 f4Var = this.f56038t;
            if (f4Var.f230741Y == 0 && !this.f55995K) {
                f4Var.f230741Y = 1;
                f4Var.f230755r = true;
                f4Var.mo108734N2(0);
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(this.f56037s, this.f56038t);
                Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "checkFileStatus msgId:%s reset file sender", Long.valueOf(this.f56037s));
            }
            C72683d P7 = mo26124P7();
            if (P7 != null && P7.field_status == 199 && !C86013q1.m106450k(P7.field_fileFullPath)) {
                P7.field_status = 102;
                P7.field_offset = 0;
                C72709y1.vx0().update(P7, new String[0]);
                C76404b.f223715a.mo106627a(this.f56038t);
            }
        }
        Uri n = C116299g2.m163858n(C112760b.m154247s());
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        C72709y1.vx0().add(this);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101137qq(this, Looper.getMainLooper());
        Class cls2 = C22921c.class;
        Class cls3 = C22923f.class;
        String S7 = mo26126S7();
        String Xa0 = ((C22921c) C86312j.m106911c(cls2)).Xa0(S7, 0);
        Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "set default app: QB. mimeType=%s, fileExt=%s, isSupportOpenFile=%s, isSupportOfficeMimeTye=%s, fileCanOpenByXWeb=%s, isQQBroswerInstalled=%s, hasSetDefault=%s", S7, this.f55987C, Boolean.valueOf(((C22923f) C86312j.m106911c(cls3)).mo35905dQ(S7, this.f55987C)), Boolean.valueOf(((C22923f) C86312j.m106911c(cls3)).g20(S7)), Boolean.valueOf(((C22923f) C86312j.m106911c(cls3)).Ot0(this.f55987C)), Boolean.valueOf(((C22923f) C86312j.m106911c(cls3)).mo35898Db(this)), Boolean.valueOf(((C22921c) C86312j.m106911c(cls2)).mo35875BJ(S7, 0)));
        if (((C22923f) C86312j.m106911c(cls3)).mo35905dQ(S7, this.f55987C) && !((C22923f) C86312j.m106911c(cls3)).g20(S7) && !((C22923f) C86312j.m106911c(cls3)).Ot0(this.f55987C) && ((C22923f) C86312j.m106911c(cls3)).mo35898Db(this) && !((C22921c) C86312j.m106911c(cls2)).mo35875BJ(S7, 0) && Xa0.isEmpty()) {
            C86709a0.m107535s().mo121142i().mo119676J(((C22921c) C86312j.m106911c(cls2)).mo35877HU(S7, 0), ((C22923f) C86312j.m106911c(cls3)).mo35904Ro());
        }
        mo26123O7();
        initView();
        mo26120L7();
        mo26127T7();
        C97669b KF = ((C23546f) C86312j.m106911c(C23546f.class)).mo36793KF(new C22663i(getContext()));
        this.f56018Z = KF;
        ((C97668a) KF).mo136917C0(this.f56046z, this.f55987C, this.f55986B, true);
        ((C97668a) this.f56018Z).mo136918D0(this.f55987C, this.f55985A);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0201  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r14 = this;
            java.lang.Class<wm.f> r0 = p262wm.C22923f.class
            r1 = 2131301192(0x7f091348, float:1.8220435E38)
            android.view.View r1 = r14.findViewById(r1)
            com.tencent.mm.ui.MMImageView r1 = (com.tencent.p014mm.p136ui.MMImageView) r1
            r14.f56025e = r1
            r1 = 2131312655(0x7f09400f, float:1.8243685E38)
            android.view.View r1 = r14.findViewById(r1)
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r1 = (com.tencent.p014mm.p136ui.widget.progress.RoundProgressBtn) r1
            r14.f56026f = r1
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$u r1 = new com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$u
            r2 = 2131301159(0x7f091327, float:1.8220368E38)
            android.view.View r2 = r14.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r3 = 2131301160(0x7f091328, float:1.822037E38)
            android.view.View r3 = r14.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.<init>(r14, r2, r3)
            r14.f56027g = r1
            r1 = 2131301177(0x7f091339, float:1.8220405E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r14.f56028h = r1
            r1 = 2131301178(0x7f09133a, float:1.8220407E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r14.f56029i = r1
            r1 = 2131310545(0x7f0937d1, float:1.8239405E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r14.f56030j = r1
            r1 = 2131301167(0x7f09132f, float:1.8220384E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r14.f56031n = r1
            r1 = 2131301168(0x7f091330, float:1.8220386E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r14.f56032o = r1
            r1 = 2131301171(0x7f091333, float:1.8220392E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r14.f56002R = r1
            r1 = 2131311862(0x7f093cf6, float:1.8242076E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r14.f56004S = r1
            r1 = 2131311863(0x7f093cf7, float:1.8242078E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r14.f56006T = r1
            r1 = 2131298622(0x7f09093e, float:1.8215222E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r14.f56008U = r1
            r1 = 2131301156(0x7f091324, float:1.8220362E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r14.f56010V = r1
            r1 = 2131301173(0x7f091335, float:1.8220396E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r14.f56034p0 = r1
            r1 = 2131301172(0x7f091334, float:1.8220394E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.content.res.Resources r2 = r14.getResources()
            r3 = 2131100216(0x7f060238, float:1.7812807E38)
            int r2 = r2.getColor(r3)
            r3 = 2131756087(0x7f100437, float:1.9143072E38)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r14, r3, r2)
            r1.setImageDrawable(r2)
            android.widget.LinearLayout r1 = r14.f56034p0
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$l r2 = new com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$l
            r2.<init>(r14)
            r1.setOnClickListener(r2)
            android.widget.TextView r1 = r14.f56031n
            android.view.View$OnTouchListener r2 = r14.f56022c1
            r1.setOnTouchListener(r2)
            android.widget.TextView r1 = r14.f56031n
            android.view.View$OnLongClickListener r2 = r14.f56024d1
            r1.setOnLongClickListener(r2)
            android.widget.TextView r1 = r14.f56031n
            r2 = 1
            if (r1 == 0) goto L_0x00ee
            android.text.TextPaint r1 = r1.getPaint()
            if (r1 == 0) goto L_0x00ee
            r1.setFakeBoldText(r2)
        L_0x00ee:
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r1 = r14.f56026f
            com.tencent.mm.ui.chatting.m r3 = new com.tencent.mm.ui.chatting.m
            r3.<init>(r14)
            r1.setOnClickListener(r3)
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$u r1 = r14.f56027g
            com.tencent.mm.ui.chatting.n r3 = new com.tencent.mm.ui.chatting.n
            r3.<init>(r14)
            android.widget.Button r1 = r1.f56063a
            r1.setOnClickListener(r3)
            android.widget.Button r1 = r14.f56010V
            com.tencent.mm.ui.chatting.o r3 = new com.tencent.mm.ui.chatting.o
            r3.<init>(r14)
            r1.setOnClickListener(r3)
            android.widget.TextView r1 = r14.f56008U
            com.tencent.mm.ui.chatting.p r3 = new com.tencent.mm.ui.chatting.p
            r3.<init>(r14)
            r1.setOnClickListener(r3)
            di3.d r1 = di3.C86312j.m106911c(r0)
            wm.f r1 = (p262wm.C22923f) r1
            java.lang.String r3 = r14.mo26126S7()
            java.lang.String r4 = r14.f55987C
            boolean r1 = r1.mo35905dQ(r3, r4)
            r3 = 8
            if (r1 != 0) goto L_0x0131
            android.widget.Button r1 = r14.f56029i
            r1.setVisibility(r3)
        L_0x0131:
            android.widget.Button r1 = r14.f56028h
            com.tencent.mm.ui.chatting.s r4 = new com.tencent.mm.ui.chatting.s
            r4.<init>(r14)
            r1.setOnClickListener(r4)
            int r1 = r14.f56023d
            r4 = 2131230947(0x7f0800e3, float:1.8077961E38)
            r5 = 2131755112(0x7f100068, float:1.9141094E38)
            r6 = 7
            r7 = 6
            r8 = 4
            r9 = 2
            if (r1 == 0) goto L_0x0178
            if (r1 == r9) goto L_0x0172
            if (r1 == r8) goto L_0x0169
            if (r1 == r7) goto L_0x0157
            if (r1 == r6) goto L_0x0178
            com.tencent.mm.ui.MMImageView r0 = r14.f56025e
            r0.setImageResource(r5)
            goto L_0x018b
        L_0x0157:
            com.tencent.mm.ui.MMImageView r1 = r14.f56025e
            di3.d r0 = di3.C86312j.m106911c(r0)
            wm.f r0 = (p262wm.C22923f) r0
            java.lang.String r4 = r14.f55987C
            int r0 = r0.mo35908u8(r4)
            r1.setImageResource(r0)
            goto L_0x018b
        L_0x0169:
            com.tencent.mm.ui.MMImageView r0 = r14.f56025e
            r1 = 2131755116(0x7f10006c, float:1.9141102E38)
            r0.setImageResource(r1)
            goto L_0x018b
        L_0x0172:
            com.tencent.mm.ui.MMImageView r0 = r14.f56025e
            r0.setImageResource(r4)
            goto L_0x018b
        L_0x0178:
            java.lang.String r0 = r14.f55987C
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isImageExt(r0)
            if (r0 == 0) goto L_0x0186
            com.tencent.mm.ui.MMImageView r0 = r14.f56025e
            r0.setImageResource(r4)
            goto L_0x018b
        L_0x0186:
            com.tencent.mm.ui.MMImageView r0 = r14.f56025e
            r0.setImageResource(r5)
        L_0x018b:
            com.tencent.mm.ui.chatting.l r0 = new com.tencent.mm.ui.chatting.l
            r0.<init>(r14)
            r14.f56040v = r0
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$s r0 = new com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$s
            r0.<init>(r14)
            r14.setBackBtn(r0)
            boolean r0 = r14.f56039u
            r1 = 0
            if (r0 == 0) goto L_0x01aa
            r0 = 2131755026(0x7f100012, float:1.914092E38)
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$t r4 = new com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$t
            r4.<init>(r14)
            r14.addIconOptionMenu(r1, r0, r4)
        L_0x01aa:
            int r0 = r14.f56000Q
            if (r0 != r2) goto L_0x01b0
            r0 = 1
            goto L_0x01b1
        L_0x01b0:
            r0 = 0
        L_0x01b1:
            r4 = 3
            r10 = 0
            if (r0 == 0) goto L_0x0201
            com.tencent.mm.storage.f4 r0 = r14.f56038t
            long r12 = r0.getMsgId()
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0201
            android.widget.TextView r0 = r14.f56032o
            r0.setVisibility(r3)
            android.widget.TextView r0 = r14.f56031n
            r0.setVisibility(r1)
            java.lang.String r0 = r14.f55985A
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01e1
            android.widget.TextView r0 = r14.f56031n
            r1 = 2131833854(0x7f1133fe, float:1.9300802E38)
            java.lang.String r1 = r14.getString(r1)
            r0.setText(r1)
            goto L_0x01e8
        L_0x01e1:
            android.widget.TextView r0 = r14.f56031n
            java.lang.String r1 = r14.f55985A
            r0.setText(r1)
        L_0x01e8:
            r14.mo26130X7()
            int r0 = r14.f56036r
            if (r0 != r4) goto L_0x0200
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "resLoadFailed"
            r0.putExtra(r1, r2)
            r1 = -1
            r14.setResult(r1, r0)
            r14.finish()
        L_0x0200:
            return
        L_0x0201:
            long r12 = r14.f55988D
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0227
            android.widget.TextView r0 = r14.f56032o
            r0.setVisibility(r1)
            android.widget.TextView r0 = r14.f56032o
            android.content.res.Resources r5 = r14.getResources()
            r10 = 2131825939(0x7f111513, float:1.9284748E38)
            java.lang.Object[] r11 = new java.lang.Object[r2]
            long r12 = r14.f55988D
            java.lang.String r12 = sf0.C77702q0.m93718a(r12)
            r11[r1] = r12
            java.lang.String r5 = r5.getString(r10, r11)
            r0.setText(r5)
            goto L_0x022c
        L_0x0227:
            android.widget.TextView r0 = r14.f56032o
            r0.setVisibility(r3)
        L_0x022c:
            boolean r0 = r14.f55995K
            java.lang.String r5 = "MicroMsg.AppAttachNewDownloadUI"
            if (r0 == 0) goto L_0x023c
            java.lang.String r0 = "summerapp isCanOpenFile"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r14.mo26132Z7()
            return
        L_0x023c:
            int r0 = r14.f56023d
            java.lang.String r10 = "hide moreOpenWaysArea"
            r11 = 74
            if (r0 == 0) goto L_0x02ab
            if (r0 == r9) goto L_0x0281
            if (r0 == r11) goto L_0x0278
            if (r0 == r7) goto L_0x0278
            if (r0 == r6) goto L_0x024e
            goto L_0x02d7
        L_0x024e:
            boolean r0 = r14.f55996L
            if (r0 == 0) goto L_0x0258
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$u r0 = r14.f56027g
            r0.mo26155a(r1)
            goto L_0x025d
        L_0x0258:
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$u r0 = r14.f56027g
            r0.mo26155a(r3)
        L_0x025d:
            r14.mo26137e8(r3)
            android.widget.Button r0 = r14.f56029i
            r0.setVisibility(r3)
            android.widget.Button r0 = r14.f56028h
            r0.setVisibility(r3)
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r10)
            android.widget.LinearLayout r0 = r14.f56034p0
            r0.setVisibility(r8)
            android.widget.TextView r0 = r14.f56031n
            r0.setVisibility(r3)
            goto L_0x02d7
        L_0x0278:
            android.widget.LinearLayout r0 = r14.f56034p0
            r0.setVisibility(r8)
            r14.mo26139g8(r1)
            goto L_0x02d7
        L_0x0281:
            r14.mo26137e8(r3)
            boolean r0 = r14.f55996L
            if (r0 == 0) goto L_0x028e
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$u r0 = r14.f56027g
            r0.mo26155a(r1)
            goto L_0x0293
        L_0x028e:
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$u r0 = r14.f56027g
            r0.mo26155a(r3)
        L_0x0293:
            android.widget.Button r0 = r14.f56029i
            r0.setVisibility(r3)
            android.widget.Button r0 = r14.f56028h
            r0.setVisibility(r3)
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r10)
            android.widget.LinearLayout r0 = r14.f56034p0
            r0.setVisibility(r8)
            android.widget.TextView r0 = r14.f56031n
            r0.setVisibility(r3)
            goto L_0x02d7
        L_0x02ab:
            android.widget.Button r0 = r14.f56010V
            r0.setVisibility(r3)
            boolean r0 = r14.f55996L
            if (r0 == 0) goto L_0x02ba
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$u r0 = r14.f56027g
            r0.mo26155a(r1)
            goto L_0x02bf
        L_0x02ba:
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$u r0 = r14.f56027g
            r0.mo26155a(r3)
        L_0x02bf:
            r14.mo26137e8(r3)
            android.widget.Button r0 = r14.f56029i
            r0.setVisibility(r3)
            android.widget.Button r0 = r14.f56028h
            r0.setVisibility(r3)
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r10)
            android.widget.LinearLayout r0 = r14.f56034p0
            r0.setVisibility(r8)
            r14.mo26140i8()
        L_0x02d7:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            ob0.o r3 = r14.f56040v
            r0[r1] = r3
            boolean r1 = r14.f55995K
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r2] = r1
            boolean r1 = r14.f55996L
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r9] = r1
            java.lang.String r1 = "summerapp progressCallBack[%s], isDownloadFinished[%b], isDownloadStarted[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            int r0 = r14.f56023d
            if (r0 == r9) goto L_0x0301
            boolean r1 = r14.f55995K
            if (r1 != 0) goto L_0x0304
            boolean r1 = r14.f55996L
            if (r1 != 0) goto L_0x0304
            if (r0 == r11) goto L_0x0304
        L_0x0301:
            r14.mo26142k8()
        L_0x0304:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.AppAttachNewDownloadUI.initView():void");
    }

    /* renamed from: j8 */
    public final void mo26141j8() {
        Class cls = C22921c.class;
        Class cls2 = C22923f.class;
        if (this.f55995K) {
            if (this.f55997M && !((C22921c) C86312j.m106911c(cls)).Xa0(((C22921c) C86312j.m106911c(cls)).mo35892nR(this.f55987C), 0).isEmpty()) {
                this.f55997M = false;
            }
            if (!this.f55997M) {
                String Xa0 = ((C22921c) C86312j.m106911c(cls)).Xa0(((C22921c) C86312j.m106911c(cls)).mo35892nR(this.f55987C), 0);
                boolean BJ = ((C22921c) C86312j.m106911c(cls)).mo35875BJ(mo26126S7(), 0);
                String S7 = mo26126S7();
                if (((C22923f) C86312j.m106911c(cls2)).mo35905dQ(S7, this.f55987C) || !this.f56045y0.isEmpty()) {
                    this.f56029i.setVisibility(0);
                    Button button = this.f56029i;
                    String string = getString(C0966R.string.mqe);
                    Object[] objArr = new Object[1];
                    objArr[0] = this.f56003R0.isEmpty() ? getString(C0966R.string.fnk) : this.f56003R0;
                    button.setText(String.format(string, objArr));
                    this.f56029i.setOnClickListener(new AppAttachNewDownloadUI$$b(this));
                    mo26133a8();
                    if (!((C22923f) C86312j.m106911c(cls2)).Rf0(this.f55987C, S7)) {
                        this.f56030j.setVisibility(0);
                        if (this.f56045y0.isEmpty() || this.f56045y0.equals(((C22923f) C86312j.m106911c(cls2)).mo35904Ro())) {
                            this.f56030j.setText(C0966R.string.cai);
                        } else {
                            this.f56030j.setText(C0966R.string.f360350c41);
                        }
                    }
                } else {
                    String S72 = mo26126S7();
                    if (!((C22923f) C86312j.m106911c(cls2)).Rf0(this.f55987C, S72) && !((C22923f) C86312j.m106911c(cls2)).mo35905dQ(S72, this.f55987C)) {
                        this.f56030j.setVisibility(0);
                        this.f56030j.setText(C0966R.string.f360350c41);
                    }
                }
                if (Xa0.isEmpty() && BJ) {
                    this.f56029i.setVisibility(8);
                    this.f56028h.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                    this.f56028h.setTextColor(C111105a.m151501c(getContext(), C0966R.color.f3257l0));
                    if (!((C22923f) C86312j.m106911c(cls2)).Ot0(this.f55987C)) {
                        this.f56030j.setText(C0966R.string.f360350c41);
                    }
                }
                if (this.f55999P) {
                    mo26120L7();
                }
            } else if (!((C22923f) C86312j.m106911c(cls2)).Rf0(this.f55987C, mo26126S7())) {
                String Xa02 = ((C22921c) C86312j.m106911c(cls)).Xa0(((C22921c) C86312j.m106911c(cls)).mo35892nR(this.f55987C), 0);
                boolean BJ2 = ((C22921c) C86312j.m106911c(cls)).mo35875BJ(mo26126S7(), 0);
                if (!((C22923f) C86312j.m106911c(cls2)).mo35905dQ(mo26126S7(), this.f55987C) || (Xa02.isEmpty() && BJ2)) {
                    this.f56030j.setVisibility(0);
                    this.f56030j.setText(C0966R.string.f360350c41);
                } else if (((C22923f) C86312j.m106911c(cls2)).mo35905dQ(mo26126S7(), this.f55987C)) {
                    this.f56030j.setVisibility(0);
                    this.f56030j.setText(C0966R.string.cai);
                }
            }
        }
    }

    /* renamed from: k8 */
    public final void mo26142k8() {
        mo26139g8(true);
        if (mo26143l8()) {
            Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "startToDownloadFile");
            if (this.f56033p != null) {
                C97625j3.m125815e().mo123458d(this.f56033p);
            }
            ((C98590g) C86312j.m106911c(C98590g.class)).mo137959Bl(this.f56038t.mo108774y2(), this.f56038t.mo101010p2(), false, this.f56038t.getCreateTime());
            this.f56033p = new C77335p(this.f56037s, this.f56035q, this.f56040v);
            C97625j3.m125815e().mo123460f(this.f56033p);
            ((C87121j) C86312j.m106911c(C87121j.class)).j90(this.f56038t);
            mo26136d8(7, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0167, code lost:
        if (r2.f195594l <= 26214400) goto L_0x016a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0187  */
    /* renamed from: l8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo26143l8() {
        /*
            r20 = this;
            r0 = r20
            com.tencent.mm.pluginsdk.model.app.d r1 = r20.mo26124P7()
            r4 = 8
            r5 = 7
            r6 = 6
            r7 = 5
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 0
            java.lang.String r12 = "MicroMsg.AppAttachNewDownloadUI"
            r13 = 1
            r14 = 0
            if (r1 != 0) goto L_0x007f
            long r2 = r0.f56037s
            java.lang.String r1 = r0.f56042x
            com.tencent.p014mm.pluginsdk.model.app.C72695v.m85072n(r2, r1, r11)
            com.tencent.mm.pluginsdk.model.app.d r1 = r20.mo26124P7()
            if (r1 == 0) goto L_0x014b
            java.lang.Object[] r2 = new java.lang.Object[r4]
            long r3 = r1.systemRowid
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r14] = r3
            long r3 = r1.field_totalLen
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r13] = r3
            java.lang.String r3 = r1.field_fileFullPath
            r2[r10] = r3
            long r3 = r1.field_type
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r9] = r3
            java.lang.String r3 = r1.field_mediaId
            r2[r8] = r3
            long r3 = r1.field_msgInfoId
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r7] = r3
            boolean r3 = r1.field_isUpload
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r6] = r3
            java.lang.String r3 = r1.field_signature
            if (r3 != 0) goto L_0x005a
            r3 = -1
            goto L_0x005e
        L_0x005a:
            int r3 = r3.length()
        L_0x005e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r5] = r3
            java.lang.String r3 = "summerapp tryInitAttachInfo newInfo systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], signature len[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r2)
            com.tencent.mm.message.l$b r2 = r0.f56044y
            int r3 = r2.f195626t
            if (r3 != 0) goto L_0x0076
            int r2 = r2.f195594l
            r3 = 26214400(0x1900000, float:5.2897246E-38)
            if (r2 <= r3) goto L_0x014b
        L_0x0076:
            java.lang.String r2 = r1.field_signature
            boolean r2 = sf0.C77702q0.m93719b(r2)
            r13 = r13 ^ r2
            goto L_0x014b
        L_0x007f:
            java.lang.String r2 = r1.field_fileFullPath
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)
            java.lang.String r3 = r2.getPath()
            if (r3 == 0) goto L_0x00a5
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r14, r14)
            java.lang.String r15 = r2.getPath()
            boolean r15 = r15.equals(r3)
            if (r15 != 0) goto L_0x00a5
            android.net.Uri$Builder r2 = r2.buildUpon()
            android.net.Uri$Builder r2 = r2.path(r3)
            android.net.Uri r2 = r2.build()
        L_0x00a5:
            long r4 = r1.field_status
            r17 = 199(0xc7, double:9.83E-322)
            int r19 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r19 != 0) goto L_0x00d3
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r4 = r4.mo177799l(r2, r11)
            boolean r5 = r4.mo177810a()
            if (r5 != 0) goto L_0x00bb
            r3 = 0
            goto L_0x00c3
        L_0x00bb:
            com.tencent.mm.vfs.FileSystem$c r5 = r4.f348991a
            java.lang.String r3 = r4.f348992b
            boolean r3 = r5.mo119948x(r3)
        L_0x00c3:
            if (r3 != 0) goto L_0x00d2
            java.lang.String r3 = "summerapp tryInitAttachInfo info exist but file not!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            long r6 = r0.f56037s
            java.lang.String r3 = r0.f56042x
            com.tencent.p014mm.pluginsdk.model.app.C72695v.m85072n(r6, r3, r11)
        L_0x00d2:
            r11 = r4
        L_0x00d3:
            r3 = 10
            java.lang.Object[] r3 = new java.lang.Object[r3]
            long r6 = r1.systemRowid
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r3[r14] = r4
            long r6 = r1.field_totalLen
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r3[r13] = r4
            java.lang.String r4 = r1.field_fileFullPath
            r3[r10] = r4
            long r6 = r1.field_type
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r3[r9] = r4
            java.lang.String r4 = r1.field_mediaId
            r3[r8] = r4
            long r6 = r1.field_msgInfoId
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r6 = 5
            r3[r6] = r4
            boolean r4 = r1.field_isUpload
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 6
            r3[r5] = r4
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r2 = r4.mo177799l(r2, r11)
            boolean r4 = r2.mo177810a()
            if (r4 != 0) goto L_0x0117
            r2 = 0
            goto L_0x011f
        L_0x0117:
            com.tencent.mm.vfs.FileSystem$c r4 = r2.f348991a
            java.lang.String r2 = r2.f348992b
            boolean r2 = r4.mo119948x(r2)
        L_0x011f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4 = 7
            r3[r4] = r2
            long r4 = r1.field_status
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r4 = 8
            r3[r4] = r2
            r2 = 9
            java.lang.String r4 = r1.field_signature
            if (r4 != 0) goto L_0x0139
            r16 = -1
            goto L_0x013f
        L_0x0139:
            int r4 = r4.length()
            r16 = r4
        L_0x013f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r3[r2] = r4
            java.lang.String r2 = "summerapp tryInitAttachInfo info exist systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], file.exists[%b], status[%d], signature len[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r3)
        L_0x014b:
            com.tencent.mm.message.l$b r2 = r0.f56044y
            if (r2 == 0) goto L_0x016a
            if (r1 == 0) goto L_0x015f
            long r3 = r1.field_status
            int r4 = (int) r3
            r3 = 102(0x66, float:1.43E-43)
            if (r4 != r3) goto L_0x015f
            java.lang.String r2 = "tryInitAttachInfo file is pause!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            goto L_0x016a
        L_0x015f:
            int r3 = r2.f195626t
            if (r3 != 0) goto L_0x016b
            int r2 = r2.f195594l
            r3 = 26214400(0x1900000, float:5.2897246E-38)
            if (r2 <= r3) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r14 = r13
        L_0x016b:
            if (r14 != 0) goto L_0x0185
            ob0.b0 r2 = eb0.C97625j3.m125815e()
            qg2.n r3 = new qg2.n
            java.lang.String r6 = r0.f55993I
            java.lang.String r7 = r0.f55989E
            java.lang.String r8 = r0.f55985A
            java.lang.String r9 = r0.f55987C
            java.lang.String r10 = r0.f55990F
            r4 = r3
            r5 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r2.mo123460f(r3)
        L_0x0185:
            if (r1 == 0) goto L_0x018e
            java.lang.String r1 = r1.field_fileFullPath
            r0.f56046z = r1
            r20.mo26127T7()
        L_0x018e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.AppAttachNewDownloadUI.mo26143l8():boolean");
    }

    /* renamed from: m8 */
    public final void mo26144m8() {
        Class cls = C22923f.class;
        Class cls2 = C22921c.class;
        C72683d P7 = mo26124P7();
        if (P7 != null) {
            long j = P7.field_totalLen;
            long j2 = P7.field_offset;
            this.f55988D = j;
            int i = j == 0 ? 0 : (int) ((100 * j2) / j);
            Log.m105926v("MicroMsg.AppAttachNewDownloadUI", "summerapp attach progress:" + i + " offset:" + j2 + " totallen:" + j + " status " + P7.field_status);
            this.f56026f.setProgress(i);
            if (P7.field_status == 199 && i >= 100 && !this.f55995K) {
                C108976d dVar = this.f56016Y;
                if (dVar != null) {
                    ((C21105d) dVar).mo32877k(this.f55988D);
                }
                this.f55995K = true;
                if (this.f56012W) {
                    this.f56012W = false;
                    DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                    C96787m0.m124256j(doFavoriteEvent, this.f56038t);
                    DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                    aVar.f264684i = this;
                    aVar.f264688m = 39;
                    doFavoriteEvent.publish();
                }
                if (this.f56036r == 3) {
                    Intent intent = new Intent();
                    intent.putExtra(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.f56046z);
                    intent.putExtra(DownloadInfo.FILENAME, this.f55985A);
                    intent.putExtra("fileExt", this.f55987C);
                    setResult(-1, intent);
                    finish();
                    return;
                }
                if (!((C22923f) C86312j.m106911c(cls)).mo35905dQ(mo26126S7(), this.f55987C)) {
                    ((C22921c) C86312j.m106911c(cls2)).hr0(this, this.f56037s, P7.field_fileFullPath, this.f55987C, this.f55985A, 1);
                } else if (((C22923f) C86312j.m106911c(cls)).Rf0(this.f55987C, mo26126S7()) && ((C22921c) C86312j.m106911c(cls2)).Xa0(((C22921c) C86312j.m106911c(cls2)).mo35892nR(this.f55987C), 0).isEmpty()) {
                    mo26135c8();
                }
                MMHandlerThread.postToMainThreadDelayed(new AppAttachNewDownloadUI$$r(this), 200);
            }
            if (this.f56026f.getVisibility() != 0 && i < 100 && !P7.field_isUpload && P7.field_status == 101) {
                Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "summerapp still downloading updateProgress progress[%d]", Integer.valueOf(i));
                mo26139g8(false);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((C22921c) C86312j.m106911c(C22921c.class)).mo35885Yc(this, i, i2, intent, this.f55998N, C0966R.string.c1b, C0966R.string.c1c, 1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 0, 0, getString(C0966R.string.f7936wt));
    }

    public void onDestroy() {
        C77335p pVar = this.f56033p;
        if (pVar != null) {
            pVar.f225465f = null;
        }
        C72709y1.vx0().remove(this);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).sy0(this);
        super.onDestroy();
        C108976d dVar = this.f56016Y;
        if (dVar != null) {
            dVar.mo74191V();
        }
        C97669b bVar = this.f56018Z;
        if (bVar != null) {
            ((C105052s) bVar).mo67996A0();
        }
        if (this.f56014X != null) {
            ((C92331c) C86312j.m106911c(C92331c.class)).A70(this.f56014X);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C108976d dVar;
        Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "onKeyDown keyCode %d", Integer.valueOf(i));
        if (i != 4 || (dVar = this.f56016Y) == null || !dVar.mo67896U(2, false)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        C108976d dVar = this.f56016Y;
        if (dVar != null) {
            dVar.mo74189F();
            this.f56016Y.mo74191V();
        }
        init();
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        mo26144m8();
    }

    public void onPause() {
        C97625j3.m125815e().mo123470p(221, this);
        C97625j3.m125815e().mo123470p(728, this);
        super.onPause();
        C108976d dVar = this.f56016Y;
        if (dVar != null) {
            dVar.mo74189F();
        }
        C97669b bVar = this.f56018Z;
        if (bVar != null) {
            ((C105052s) bVar).mo64001C();
        }
        PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new PauseAutoGetBigImgEvent();
        PauseAutoGetBigImgEvent.C92540a aVar = pauseAutoGetBigImgEvent.f264980d;
        aVar.f264981a = false;
        C72963f4 f4Var = this.f56038t;
        aVar.f264982b = f4Var == null ? "" : f4Var.mo108768t();
        pauseAutoGetBigImgEvent.asyncPublish(getMainLooper());
        Log.m105918d("MicroMsg.AppAttachNewDownloadUI", "AppAttachDownloadUI cancel pause auto download logic");
    }

    public void onResume() {
        super.onResume();
        C97625j3.m125815e().mo123455a(221, this);
        C97625j3.m125815e().mo123455a(728, this);
        PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new PauseAutoGetBigImgEvent();
        PauseAutoGetBigImgEvent.C92540a aVar = pauseAutoGetBigImgEvent.f264980d;
        aVar.f264981a = true;
        aVar.f264982b = this.f56038t.mo108768t();
        pauseAutoGetBigImgEvent.asyncPublish(getMainLooper());
        Log.m105918d("MicroMsg.AppAttachNewDownloadUI", "AppAttachDownloadUI req pause auto download logic");
        this.f56028h.setEnabled(true);
        this.f56029i.setEnabled(true);
        C108976d dVar = this.f56016Y;
        if (dVar != null) {
            dVar.mo74188E();
        }
        C97669b bVar = this.f56018Z;
        if (bVar != null) {
            ((C105052s) bVar).mo64003o();
        }
        mo26123O7();
        mo26141j8();
        ((C23547h) C86312j.m106911c(C23547h.class)).mo36799xH(Integer.toString(hashCode()), this.f55987C, MD5Util.getMD5String(this.f55985A), 9, mo26126S7(), mo25335P6());
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C75700k0.class;
        Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "summerapp onSceneEnd type[%d], [%d, %d, %s]", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar.getType() == 221 || yVar.getType() == 728) {
            int i3 = -1;
            if (yVar.getType() == 728 && i == 0 && i2 == 0) {
                C72683d P7 = mo26124P7();
                if (P7 == null) {
                    Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "summerapp onSceneEnd getAppAttachInfo is null");
                } else {
                    Object[] objArr = new Object[1];
                    String str2 = P7.field_signature;
                    if (str2 != null) {
                        i3 = str2.length();
                    }
                    objArr[0] = Integer.valueOf(i3);
                    Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "summerapp onSceneEnd CheckBigFileDownload ok signature len[%d] start NetSceneDownloadAppAttach", objArr);
                }
                if (P7 != null) {
                    P7.field_status = 101;
                    P7.field_lastModifyTime = Util.nowSecond();
                    C72709y1.vx0().update(P7, new String[0]);
                }
                if (this.f56033p != null) {
                    C97625j3.m125815e().mo123458d(this.f56033p);
                }
                this.f56033p = new C77335p(this.f56037s, this.f56035q, this.f56040v);
                C97625j3.m125815e().mo123460f(this.f56033p);
                return;
            }
            if (this.f56033p == null && (yVar instanceof C77335p)) {
                C77335p pVar = (C77335p) yVar;
                C72683d P72 = mo26124P7();
                if (P72 != null && !C77702q0.m93719b(P72.field_mediaSvrId) && P72.field_mediaSvrId.equals(pVar.mo107462n1())) {
                    this.f56033p = pVar;
                    Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "summerapp onSceneEnd reset downloadAppAttachScene[%s] by mediaSvrId[%s]", pVar, P72.field_mediaSvrId);
                }
            }
            if (i != 0 || i2 != 0) {
                if (i2 != 0 && CrashReportFactory.hasDebuger()) {
                    C76701a.makeText((Context) this, (CharSequence) "errCode[" + i2 + "]", 0).show();
                }
                if (i2 == -5103087 || i2 == -5103017 || i2 == -5103059) {
                    C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(this.f56037s);
                    b002.mo108734N2(4);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(b002.getMsgId(), b002);
                    Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "msgId:%s fail, errCode:%s", Long.valueOf(this.f56037s), Integer.valueOf(i2));
                }
                if (i2 == -5103059) {
                    mo26130X7();
                    mo26137e8(8);
                    mo26136d8(1, 3);
                    if (this.f56036r == 3) {
                        Intent intent = new Intent();
                        intent.putExtra("resLoadFailed", true);
                        setResult(-1, intent);
                        finish();
                        return;
                    }
                    return;
                }
                mo26139g8(false);
                Log.m105920e("MicroMsg.AppAttachNewDownloadUI", "summerapp onSceneEnd, download fail, type = " + yVar.getType() + " errType = " + i + ", errCode = " + i2);
            } else if (this.f56044y.f195582i == 6) {
                mo26136d8(0, 2);
                C72683d P73 = mo26124P7();
                if (P73 != null) {
                    C117407d.INSTANCE.idkeyStat(1203, 5, P73.field_totalLen, false);
                }
            }
        }
    }

    /* renamed from: w5 */
    public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
        if (lVar != null && eVar != null && this.f56023d == 74) {
            Iterator<C72963f4> it = eVar.f123846c.iterator();
            while (it.hasNext()) {
                C72963f4 next = it.next();
                if (this.f56037s == next.getMsgId()) {
                    String content = next.getContent();
                    if (this.f56041w && next.mo108769t2() == 0) {
                        content = next.getContent();
                        if (this.f56041w && content != null) {
                            content = C75604z3.m90849u(content);
                        }
                    }
                    C68070l.C68072b u = C68070l.C68072b.m80422u(content, (String) null);
                    if (u != null) {
                        Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "update msgId:%s newType:%s newFileStatus:%s", Long.valueOf(this.f56037s), Integer.valueOf(u.f195582i), Integer.valueOf(next.f230742Z));
                        int i = u.f195582i;
                        if (i == 6 && this.f56038t.f230742Z == 1) {
                            if (!mo26128U7()) {
                                finish();
                                return;
                            } else {
                                mo26139g8(true);
                                return;
                            }
                        } else if (i == 6 && !mo26128U7()) {
                            finish();
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
