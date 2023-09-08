package com.tencent.p014mm.p136ui.chatting;

import a70.C112760b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.activity.ComponentActivity;
import bp3.C104160f;
import bp3.C79758p;
import c92.C104331h;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RecordStateChangeEvent;
import com.tencent.p014mm.autogen.events.VoipCheckIsDeviceUsingEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatHbClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.HBReportNewStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.LuckyMoneyNewYearReportStruct;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.multitalk.model.C69856h;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.plugin.recordvideo.jumper.VideoCaptureReportInfo;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C85405m;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C30420b;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72825s0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$o1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import d62.C7250m;
import dd0.C75346e;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import ed0.C75610d;
import f40.C86709a0;
import fw0.C87107w;
import gy3.C87412m;
import h81.C32735h;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98426q0;
import he0.C76158j;
import ht1.C60200t1;
import ht1.C8808v4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kd0.C76546u;
import kd0.C76552z;
import ke3.C88144b;
import kg3.C76577a;
import ky2.C10432i;
import lc3.C10485b;
import ls3.C34356e;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76901s0;
import oa1.C117731d;
import ob0.C77002r;
import org.json.JSONObject;
import p1081gi.C98121d;
import p140cw.C7138g;
import p182kk.C61104a;
import p206nj.C76861g;
import p227rn.C48053v;
import p232rw.C77572l;
import p232rw.C77574q;
import p232rw.C77575r;
import p232rw.C77576s;
import p272xq.C102712e;
import p287zz.C79442f;
import p287zz.C79445i;
import p447aw.C103918d;
import p565ir.C60606n;
import p740wo.C53193b;
import p823sg.C101614i;
import p823sg.C90193h;
import p876cj.C67380a;
import p903ij.C76359b;
import p910lj.C76701a;
import pf3.C35478e;
import pw1.C62569a;
import qo3.C77407n;
import sz1.C77815b;
import t22.C77833z;
import te3.C101783gu2;
import v70.C111386a;
import wi3.C78603a;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;
import wy1.C53221c;
import wz1.C78747b;
import xz1.C79013a;
import y70.C38971a;
import yb2.C79062b;
import zj3.C79339b;
import zj3.C79340b0;
import zj3.C79344c1;
import zj3.C79348e;
import zj3.C79351f;
import zj3.C79352f0;
import zj3.C79362h1;
import zj3.C79363i;
import zj3.C79386v0;
import zj3.C79388w0;
import zj3.C79394z0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.u1 */
public class C73852u1 implements C72825s0 {

    /* renamed from: v */
    public static boolean f216731v = true;

    /* renamed from: a */
    public ChatFooter f216732a;

    /* renamed from: b */
    public C77002r f216733b;

    /* renamed from: c */
    public String f216734c;

    /* renamed from: d */
    public C72996z1 f216735d;

    /* renamed from: e */
    public String f216736e;

    /* renamed from: f */
    public Vibrator f216737f;

    /* renamed from: g */
    public boolean f216738g;

    /* renamed from: h */
    public boolean f216739h;

    /* renamed from: i */
    public boolean f216740i;

    /* renamed from: j */
    public C67391b f216741j;

    /* renamed from: k */
    public String f216742k = "";

    /* renamed from: l */
    public String f216743l = "";

    /* renamed from: m */
    public final C77002r.C77003a f216744m;

    /* renamed from: n */
    public final C77002r.C77004b f216745n;

    /* renamed from: o */
    public volatile boolean f216746o;

    /* renamed from: p */
    public volatile boolean f216747p;

    /* renamed from: q */
    public Object f216748q;

    /* renamed from: r */
    public final MTimerHandler f216749r;

    /* renamed from: s */
    public boolean f216750s;

    /* renamed from: t */
    public final MTimerHandler f216751t;

    /* renamed from: u */
    public AppPanel.C72752g f216752u;

    /* renamed from: com.tencent.mm.ui.chatting.u1$a */
    public class C73853a implements DialogInterface.OnClickListener {
        public C73853a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Class cls = C69856h.class;
            if (!((C69856h) C86312j.m106911c(cls)).mo96150sV(C73852u1.this.mo102898p())) {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.f361067h11), 0).show();
            } else if (!((C69856h) C86312j.m106911c(cls)).mo96144kJ(C73852u1.this.mo102898p())) {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.gz4), 0).show();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.u1$b */
    public class C73854b implements C15601d<C77575r> {
        public C73854b() {
        }

        public C66212f getContext() {
            return C66217g.f190253d;
        }

        public void resumeWith(Object obj) {
            Log.m105924i("MicroMsg.ChattingFooterEventImpl", "optRecord finish");
            C73852u1.this.mo102899r(obj);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.u1$c */
    public class C73855c implements C77002r.C77003a {
        public C73855c() {
        }

        /* renamed from: a */
        public void mo95814a() {
            C73852u1.this.f216733b.reset();
            C73852u1.this.f216749r.stopTimer();
            C73852u1.this.f216751t.stopTimer();
            MMEntryLock.unlock("keep_app_silent");
            C73852u1.this.f216732a.mo100344C0(ChatFooter$$o1.Error);
            C79362h1 h1Var = (C79362h1) C73852u1.this.f216741j.f193278b.mo102812a(C79362h1.class);
            if (!(h1Var == null || h1Var.mo102325W() == null)) {
                AutoPlay W = h1Var.mo102325W();
                W.f215193f = false;
                W.mo102009l();
            }
            Log.m105926v("MicroMsg.ChattingFooterEventImpl", "record stop on error");
            C73852u1.this.f216741j.f193286j.enableOptionMenu(true);
            C73852u1.this.f216741j.f193286j.enableBackMenu(true);
            C76701a.makeText((Context) C73852u1.this.f216741j.mo91565f(), (CharSequence) C73852u1.this.f216741j.mo91565f().getString(C0966R.string.bat), 0).show();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.u1$d */
    public class C73856d implements C77002r.C77004b {
        public C73856d() {
        }

        /* renamed from: a */
        public void mo102901a() {
            C73852u1.this.f216732a.mo100362L0();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.u1$e */
    public class C73857e implements DialogInterface.OnClickListener {
        public C73857e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C76359b.m91788e(C73852u1.this.f216741j.mo91565f());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.u1$f */
    public class C73858f implements MTimerHandler.CallBack {
        public C73858f() {
        }

        public boolean onTimerExpired() {
            C73852u1 u1Var = C73852u1.this;
            u1Var.f216732a.mo100399f1(u1Var.f216733b.mo107319d());
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.u1$g */
    public class C73859g implements MTimerHandler.CallBack {
        public C73859g() {
        }

        public boolean onTimerExpired() {
            long b = C73852u1.this.f216733b.mo107316b();
            Log.m105918d("MicroMsg.ChattingFooterEventImpl", "ms " + b);
            int i = (int) ((60000 - b) / 1000);
            boolean z = true;
            if (b >= 50000 && b <= 60000) {
                C73852u1 u1Var = C73852u1.this;
                if (!u1Var.f216750s) {
                    Util.lightShake(u1Var.f216741j.mo91565f());
                    C73852u1.this.f216750s = true;
                }
            }
            C73852u1.this.f216732a.setVoiceReactArea(i);
            if (b < 60000) {
                return true;
            }
            Log.m105926v("MicroMsg.ChattingFooterEventImpl", "record stop on countdown");
            C76901s0 s0Var = C73852u1.this.f216732a.f211782L2;
            if (s0Var == null || !s0Var.isShowing()) {
                z = false;
            }
            if (!z) {
                C73852u1.this.mo102888J();
                C73852u1.this.f216732a.mo100344C0(ChatFooter$$o1.SendVoice);
            } else {
                C73852u1.this.f216732a.mo100342B0();
            }
            PlaySound.play(C73852u1.this.f216741j.mo91565f(), C0966R.string.k2r);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.u1$h */
    public class C73860h implements Runnable {
        public C73860h() {
        }

        public void run() {
            C73852u1.this.f216741j.mo91543D(true);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.u1$i */
    public class C73861i implements AppPanel.C72752g {

        /* renamed from: com.tencent.mm.ui.chatting.u1$i$a */
        public class C73862a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ boolean f216762d;

            /* renamed from: e */
            public final /* synthetic */ boolean f216763e;

            /* renamed from: f */
            public final /* synthetic */ C73868l f216764f;

            public C73862a(boolean z, boolean z2, C73868l lVar) {
                this.f216762d = z;
                this.f216763e = z2;
                this.f216764f = lVar;
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                C73867k q;
                e0Var.mo107142f(0, C73852u1.this.f216741j.mo91572m().getString(C0966R.string.b_s));
                if (this.f216762d) {
                    e0Var.mo107154n(1, C73852u1.this.f216741j.mo91572m().getString(C0966R.string.b_q), C73852u1.this.f216741j.mo91572m().getString(C0966R.string.b_p), 0);
                    C115669n.INSTANCE.mo160131h(22385, 1, Long.valueOf(System.currentTimeMillis()));
                }
                if (this.f216763e && (q = C73852u1.m87505q(this.f216764f)) != null) {
                    e0Var.mo107154n(2, q.f216775a, q.f216776b, 0);
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.u1$i$b */
        public class C73863b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ String f216766d;

            public C73863b(String str) {
                this.f216766d = str;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    C73852u1.m87500c(C73852u1.this, this.f216766d);
                    C115669n.INSTANCE.mo160131h(18890, 5, 0, this.f216766d);
                    C73852u1.m87499I(4, 0, C73852u1.this.f216743l);
                } else if (itemId == 1) {
                    ((C60606n) C86312j.m106911c(C60606n.class)).mo85063ie(C73852u1.this.f216741j.mo91565f(), C73852u1.this.mo102898p());
                    C115669n.INSTANCE.mo160131h(22385, 2, Long.valueOf(System.currentTimeMillis()));
                } else if (itemId == 2) {
                    C73852u1.m87501d(C73852u1.this);
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.u1$i$c */
        public class C73864c implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ String f216768d;

            /* renamed from: e */
            public final /* synthetic */ C73868l f216769e;

            /* renamed from: f */
            public final /* synthetic */ int f216770f;

            public C73864c(String str, C73868l lVar, int i) {
                this.f216768d = str;
                this.f216769e = lVar;
                this.f216770f = i;
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                C73867k q;
                e0Var.mo107142f(0, C73852u1.this.f216741j.mo91572m().getString(C0966R.string.b_s));
                if (!C73852u1.m87498G(this.f216768d)) {
                    HBReportNewStruct hBReportNewStruct = new HBReportNewStruct();
                    hBReportNewStruct.f194229d = 13;
                    hBReportNewStruct.mo86054n();
                    String string = C73852u1.this.f216741j.mo91572m().getString(C0966R.string.b_r);
                    if (((C79445i) C86312j.m106911c(C79445i.class)).mo109188ae()) {
                        e0Var.mo107142f(1, (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_HK_NEWYEAR_NAME_STRING_SYNC, string));
                    } else {
                        e0Var.mo107142f(1, string);
                    }
                }
                C73868l lVar = this.f216769e;
                if (lVar.f216777a && this.f216770f == 1 && (q = C73852u1.m87505q(lVar)) != null) {
                    e0Var.mo107154n(2, q.f216775a, q.f216776b, 0);
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.u1$i$d */
        public class C73865d implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ String f216772d;

            public C73865d(String str) {
                this.f216772d = str;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                Intent intent = new Intent();
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    C73852u1.m87503f(C73852u1.this, this.f216772d);
                    C115669n.INSTANCE.mo160131h(18890, 5, 0, this.f216772d);
                    C73852u1.m87499I(4, 0, C73852u1.this.f216743l);
                } else if (itemId == 1) {
                    C115669n.INSTANCE.mo160131h(11701, 1, 0, 0, 1, 3);
                    intent.putExtra("key_username", C73852u1.this.mo102898p());
                    intent.putExtra("key_way", 0);
                    intent.putExtra("pay_channel", 11);
                    if (((C79445i) C86312j.m106911c(C79445i.class)).mo109188ae()) {
                        C88144b.m109791i(C73852u1.this.f216741j.mo91565f(), "luckymoney", ".ui.LuckyMoneyNewYearSendUI", intent, (Bundle) null);
                    } else {
                        C88144b.m109791i(C73852u1.this.f216741j.mo91565f(), "luckymoney", ".ui.LuckyMoneyNewYearSendUIV2", intent, (Bundle) null);
                        LuckyMoneyNewYearReportStruct luckyMoneyNewYearReportStruct = new LuckyMoneyNewYearReportStruct();
                        luckyMoneyNewYearReportStruct.f194255e = 1;
                        luckyMoneyNewYearReportStruct.f194254d = 17;
                        luckyMoneyNewYearReportStruct.mo86054n();
                    }
                    HBReportNewStruct hBReportNewStruct = new HBReportNewStruct();
                    hBReportNewStruct.f194229d = 1;
                    hBReportNewStruct.mo86054n();
                    C73852u1.m87499I(5, 0, C73852u1.this.f216743l);
                } else if (itemId == 2) {
                    C73852u1.m87501d(C73852u1.this);
                }
            }
        }

        public C73861i() {
        }

        /* renamed from: I */
        public void mo96040I() {
            C97625j3.m125812b().mo105906u().mo119676J(81, Boolean.FALSE);
            if (!NetStatusUtil.isNetworkConnected(C73852u1.this.f216741j.mo91565f())) {
                C75346e.m90356b(C73852u1.this.f216741j.mo91565f(), C0966R.string.f360087a11, (Runnable) null);
            } else {
                C73852u1.this.mo102891h();
            }
        }

        /* renamed from: a */
        public void mo96041a() {
            ((C79351f) C73852u1.this.f216741j.f193278b.mo102812a(C79351f.class)).mo102463B();
        }

        /* renamed from: b */
        public void mo96042b() {
            if (!C61104a.m71665u(C73852u1.this.f216741j.mo91565f()) && !C61104a.m71663s(C73852u1.this.f216741j.mo91565f(), (DialogInterface.OnClickListener) null) && !C61104a.m71656l(C73852u1.this.f216741j.mo91565f(), true) && !C61104a.m71661q(C73852u1.this.f216741j.mo91565f(), true) && !C61104a.m71649e(C73852u1.this.f216741j.mo91565f())) {
                VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new VoipCheckIsDeviceUsingEvent();
                voipCheckIsDeviceUsingEvent.publish();
                if (C73852u1.this.mo102898p() != null && !C73852u1.this.mo102898p().equals(voipCheckIsDeviceUsingEvent.f194014d.f194018d)) {
                    VoipCheckIsDeviceUsingEvent.C67817a aVar = voipCheckIsDeviceUsingEvent.f194014d;
                    if (aVar.f194016b || aVar.f194017c) {
                        C76701a.makeText((Context) C73852u1.this.f216741j.mo91565f(), aVar.f194015a ? C0966R.string.auy : C0966R.string.auz, 0).show();
                        Log.m105924i("MicroMsg.ChattingFooterEventImpl", "voip is running, can't do this");
                        return;
                    }
                }
                if (1 == ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("EnableVoiceVoipFromPlugin", 1)) {
                    boolean z = (C72996z1.m85843n5(C73852u1.this.f216741j.mo91574o().getUsername()) || C72996z1.m85847r5(C73852u1.this.f216741j.mo91574o().getUsername())) && (((C76158j) C86312j.m106911c(C76158j.class)).b10(C73852u1.this.f216741j.mo91574o().mo73980x2(), 0) & 8192) == 0;
                    C77407n nVar = new C77407n((Context) C73852u1.this.f216741j.mo91565f(), 1, false);
                    nVar.f225771i = new C73873v1(this, z);
                    nVar.f225792t1 = true;
                    nVar.f225781o1 = true;
                    nVar.f225782p = new C74333w1(this);
                    nVar.mo107573q();
                } else {
                    C73852u1.this.mo102893j();
                }
                C115669n.INSTANCE.mo160131h(11033, 4, 1, 0);
            }
        }

        /* renamed from: c */
        public void mo96043c(int i) {
            int i2;
            Class cls = C32735h.class;
            Class cls2 = C7138g.class;
            if (i == 0) {
                boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(C73852u1.this.f216741j.mo91565f(), "android.permission.CAMERA", 20, "", "");
                Log.m105925i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkcamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), C73852u1.this.f216741j.mo91565f());
                if (z1) {
                    C73852u1.this.mo102890g();
                }
            } else if (i == 1) {
                String string = C73852u1.this.f216741j.mo91565f().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getString("gallery", "1");
                C85405m.m105411a(19);
                if (string.equalsIgnoreCase("0")) {
                    ((C7138g) C86312j.m106911c(cls2)).mo8313NO(C73852u1.this.f216741j.f193286j, 200);
                } else {
                    String n = C73852u1.this.f216741j.mo91573n();
                    String r = C73852u1.this.f216741j.mo91577r();
                    Intent intent = new Intent();
                    if (C73852u1.this.f216741j.mo91583x()) {
                        intent.putExtra("gallery_report_tag", 20);
                    } else {
                        intent.putExtra("gallery_report_tag", 21);
                    }
                    if (C72996z1.m85832c5(r)) {
                        intent.putExtra("album_business_tag", "album_business_byp");
                    }
                    if (!((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_c2c_img_use_start_activity_for_result, false)) {
                        String valueOf = String.valueOf(Util.nowMilliSecond());
                        intent.putExtra("album_query_session_id", valueOf);
                        ((C79386v0) C73852u1.this.f216741j.f193278b.mo102812a(C79386v0.class)).mo102586J2(valueOf);
                        i2 = -1;
                    } else {
                        i2 = 217;
                    }
                    if (!C73852u1.this.f216740i || !C73852u1.f216731v) {
                        if (C72996z1.m85804J4(r)) {
                            ((C7138g) C86312j.m106911c(cls2)).mo8320gi(C73852u1.this.f216741j.f193286j, i2, 12, n, r, intent);
                        } else {
                            ((C7138g) C86312j.m106911c(cls2)).mo8320gi(C73852u1.this.f216741j.f193286j, i2, 3, n, r, intent);
                        }
                    } else if (C72996z1.m85809L5(r) || C72996z1.m85807K5(r) || C72996z1.m85843n5(r)) {
                        if (C117731d.m166007c().mo182440a(new C35478e()) == 1) {
                            C79062b.m95631b(intent, C62569a.class);
                        }
                        ((C7138g) C86312j.m106911c(cls2)).mo8309GS(C73852u1.this.f216741j.f193286j, i2, ((C32735h) C86312j.m106911c(cls)).dl0(C32735h.C32737c.clicfg_c2c_video_gallery_select_limit, C104160f.RepairerConfig_Media_C2CGallerySelectLimit_Int, 9), 3, 3, n, r, intent);
                    } else {
                        ((C7138g) C86312j.m106911c(cls2)).mo8326sK(C73852u1.this.f216741j.f193286j, i2, 3, 3, n, r, intent);
                    }
                }
                C115669n.INSTANCE.mo160131h(13822, 2, 1);
            }
        }

        /* renamed from: d */
        public void mo96044d() {
            C115669n.INSTANCE.mo160131h(14523, 0);
            C73852u1.this.mo102894k();
        }

        /* renamed from: e */
        public void mo96045e(int i) {
            if (!C61104a.m71651g(C73852u1.this.f216741j.mo91565f()) && !C61104a.m71669y(C73852u1.this.f216741j.mo91565f()) && !C61104a.m71665u(C73852u1.this.f216741j.mo91565f()) && !C61104a.m71649e(C73852u1.this.f216741j.mo91565f())) {
                C73852u1.this.mo102895l(i);
            }
        }

        /* renamed from: f */
        public void mo96046f() {
            int i;
            Class cls = C60200t1.class;
            Class cls2 = C79445i.class;
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(12097, 11, 0, Long.valueOf(System.currentTimeMillis()));
            nVar.mo160131h(11850, 4, 1);
            C73852u1 u1Var = C73852u1.this;
            u1Var.f216743l = C73852u1.this.f216742k + "_" + System.currentTimeMillis();
            String uuid = UUID.randomUUID().toString();
            C73852u1.m87499I(2, 0, C73852u1.this.f216743l);
            C73868l lVar = new C73868l();
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_weishi_hb_config, "");
            if (!Util.isNullOrNil(Y60)) {
                try {
                    JSONObject jSONObject = new JSONObject(Y60);
                    int i2 = jSONObject.getInt("weishi_hb_sw");
                    Log.m105925i("MicroMsg.ChattingFooterEventImpl", "getWeiShiHbConfig() weishi_hb_sw: %s", Integer.valueOf(i2));
                    if (i2 == 0) {
                        lVar.f216777a = false;
                    } else {
                        lVar.f216777a = true;
                    }
                    lVar.f216778b = C73852u1.m87504o(jSONObject, "simple_chinese");
                    lVar.f216779c = C73852u1.m87504o(jSONObject, "xg_traditional_chinese");
                    lVar.f216780d = C73852u1.m87504o(jSONObject, "tw_traditional_chinese");
                    lVar.f216781e = C73852u1.m87504o(jSONObject, "english");
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.ChattingFooterEventImpl", "getWeiShiHbConfig() Exception:%s", e.getMessage());
                }
            }
            String p = C73852u1.this.mo102898p();
            if (((C79445i) C86312j.m106911c(cls2)).Cp0(p)) {
                C86709a0.m107528h();
                i = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_LUCKY_MONEY_WEISHI_UNION_SWITCH_INT_SYNC, 0);
            } else {
                C86709a0.m107528h();
                i = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_LUCKY_MONEY_WEISHI_SWITCH_INT_SYNC, 0);
            }
            boolean z = i == 1 && lVar.f216777a;
            if (C73852u1.this.f216738g) {
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.mo160131h(11701, 1, 0, 0, 2, 2);
                C86709a0.m107528h();
                boolean z2 = ((C60200t1) C86312j.m106911c(cls)).mo76873sF() && ((C60200t1) C86312j.m106911c(cls)).mo76879tO() && !((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e() && ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_LIVE_SWITCH_INT_SYNC, 0)).intValue() == 1;
                if (z || z2) {
                    C77407n nVar3 = new C77407n((Context) C73852u1.this.f216741j.mo91565f(), 1, false);
                    nVar3.f225771i = new C73862a(z2, z, lVar);
                    nVar3.f225782p = new C73863b(uuid);
                    nVar3.mo107573q();
                    C73852u1.m87502e(C73852u1.this);
                    C73852u1.m87499I(3, 0, C73852u1.this.f216743l);
                    return;
                }
                C73852u1.m87500c(C73852u1.this, uuid);
                nVar2.mo160131h(18890, 4, 0, uuid);
            } else if ((i != 1 || !lVar.f216777a) && C73852u1.m87498G(p)) {
                C73852u1.m87503f(C73852u1.this, uuid);
                if (((C79445i) C86312j.m106911c(cls2)).mo109188ae()) {
                    C73852u1.m87502e(C73852u1.this);
                }
                C115669n.INSTANCE.mo160131h(18890, 4, 0, uuid);
            } else {
                C77407n nVar4 = new C77407n((Context) C73852u1.this.f216741j.mo91565f(), 1, false);
                nVar4.f225771i = new C73864c(p, lVar, i);
                nVar4.f225782p = new C73865d(uuid);
                nVar4.mo107573q();
                C73852u1.m87502e(C73852u1.this);
                C73852u1.m87499I(3, 0, C73852u1.this.f216743l);
            }
        }

        /* renamed from: g */
        public void mo96047g() {
            Intent intent = new Intent();
            intent.putExtra("service_app_talker_user", C73852u1.this.mo102898p());
            C88144b.m109797o(C73852u1.this.f216741j.f193286j, "subapp", ".ui.openapi.ServiceAppUI", intent, WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS);
        }

        /* renamed from: h */
        public void mo96048h() {
            C88144b.m109791i(C73852u1.this.f216741j.mo91565f(), "subapp", ".ui.openapi.AddAppUI", new Intent(), (Bundle) null);
        }

        /* renamed from: i */
        public void mo96049i() {
            ((C79340b0) C73852u1.this.f216741j.f193278b.mo102812a(C79340b0.class)).mo102226L1();
        }

        /* renamed from: j */
        public void mo96050j(C44561j jVar) {
            ((C79339b) C73852u1.this.f216741j.f193278b.mo102812a(C79339b.class)).mo102384b2(jVar);
        }

        /* renamed from: k */
        public void mo96051k() {
            ((C79352f0) C73852u1.this.f216741j.f193278b.mo102812a(C79352f0.class)).mo102432U4();
        }

        /* renamed from: l */
        public void mo96052l() {
            Intent intent = new Intent();
            intent.putExtra("enterprise_scene", 4);
            intent.putExtra("enterprise_biz_name", C73852u1.this.mo102898p());
            intent.putExtra("biz_chat_chat_id", ((C79348e) C73852u1.this.f216741j.f193278b.mo102812a(C79348e.class)).mo70068i4());
            C88144b.m109791i(C73852u1.this.f216741j.mo91565f(), "brandservice", ".ui.EnterpriseBizContactPlainListUI", intent, (Bundle) null);
        }

        /* renamed from: m */
        public void mo96053m(int i, long j) {
            Class cls = C10432i.class;
            if (((C10432i) C86312j.m106911c(cls)).mo10750e()) {
                Log.m105924i("MicroMsg.ChattingFooterEventImpl", "exit in teen mode");
                ((C10432i) C86312j.m106911c(cls)).mo10755m4(C73852u1.this.f216741j.mo91565f());
                return;
            }
            Log.m105924i("MicroMsg.ChattingFooterEventImpl", "gotoRoomLiveEntrance");
            ((C34356e) C86312j.m106911c(C34356e.class)).mo58237ij(C73852u1.this.f216741j.mo91565f(), C73852u1.this.f216741j.mo91577r(), i, j);
        }

        /* renamed from: n */
        public void mo96054n() {
            Intent intent = new Intent();
            ArrayList arrayList = new ArrayList();
            arrayList.add(String.valueOf(3));
            if (((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(C73852u1.this.f216735d.getUsername())) {
                arrayList.add(String.valueOf(4));
                arrayList.add(String.valueOf(7));
                arrayList.add(String.valueOf(21));
                arrayList.add(String.valueOf(9));
                arrayList.add(String.valueOf(10));
                arrayList.add(String.valueOf(11));
                arrayList.add(String.valueOf(12));
                arrayList.add(String.valueOf(13));
                arrayList.add(String.valueOf(15));
                arrayList.add(String.valueOf(16));
                arrayList.add(String.valueOf(17));
                arrayList.add(String.valueOf(18));
            } else if (C72996z1.m85846q5(C73852u1.this.f216735d.getUsername())) {
                arrayList.add(String.valueOf(5));
                arrayList.add(String.valueOf(7));
                arrayList.add(String.valueOf(14));
                arrayList.add(String.valueOf(18));
                arrayList.add(String.valueOf(4));
                arrayList.add(String.valueOf(9));
                arrayList.add(String.valueOf(10));
                arrayList.add(String.valueOf(11));
                arrayList.add(String.valueOf(12));
                arrayList.add(String.valueOf(15));
                arrayList.add(String.valueOf(13));
                arrayList.add(String.valueOf(16));
                arrayList.add(String.valueOf(17));
                arrayList.add(String.valueOf(19));
                arrayList.add(String.valueOf(20));
            }
            intent.putExtra("key_to_user", C73852u1.this.f216735d.getUsername());
            intent.putExtra("key_fav_item_id", TextUtils.join(",", arrayList));
            ((C102712e) C86312j.m106911c(C102712e.class)).F20(C73852u1.this.f216741j.mo91565f(), ".ui.FavSelectUI", intent);
            C115669n.INSTANCE.mo160131h(14103, 1);
        }

        /* renamed from: o */
        public void mo96055o() {
            Intent intent = new Intent();
            intent.putExtra("download_entrance_scene", 17);
            intent.putExtra("preceding_scence", 13);
            C88144b.m109791i(C73852u1.this.f216741j.mo91565f(), "emoji", ".ui.v2.EmojiStoreV2UI", intent, (Bundle) null);
            C115669n.INSTANCE.mo160131h(12065, 4);
        }

        /* renamed from: p */
        public void mo96056p() {
            if (C73852u1.this.f216738g) {
                Intent intent = new Intent();
                intent.putExtra("enter_scene", 1);
                intent.putExtra("chatroom_name", C73852u1.this.mo102898p());
                C88144b.m109791i(C73852u1.this.f216741j.mo91565f(), "aa", ".ui.LaunchAAUI", intent, (Bundle) null);
            }
        }

        /* renamed from: q */
        public void mo96057q() {
            if (!C61104a.m71665u(C73852u1.this.f216741j.mo91565f()) && !C61104a.m71663s(C73852u1.this.f216741j.mo91565f(), (DialogInterface.OnClickListener) null) && !C61104a.m71649e(C73852u1.this.f216741j.mo91565f())) {
                VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new VoipCheckIsDeviceUsingEvent();
                voipCheckIsDeviceUsingEvent.publish();
                if (!C73852u1.this.mo102898p().equals(voipCheckIsDeviceUsingEvent.f194014d.f194018d)) {
                    VoipCheckIsDeviceUsingEvent.C67817a aVar = voipCheckIsDeviceUsingEvent.f194014d;
                    if (aVar.f194016b || aVar.f194017c) {
                        C76701a.makeText((Context) C73852u1.this.f216741j.mo91565f(), aVar.f194015a ? C0966R.string.auy : C0966R.string.auz, 0).show();
                        Log.m105924i("MicroMsg.ChattingFooterEventImpl", "voip is running, can't do this");
                        return;
                    }
                }
                C73852u1.this.mo102892i();
            }
        }

        /* renamed from: r */
        public void mo96058r() {
            ((C53221c) C86312j.m106911c(C53221c.class)).mo73897me(C73852u1.this.f216741j.mo91565f(), C73852u1.this.mo102898p());
        }

        /* renamed from: s */
        public void mo96059s() {
            if (!C61104a.m71669y(C73852u1.this.f216741j.mo91565f()) && !C61104a.m71665u(C73852u1.this.f216741j.mo91565f()) && !C61104a.m71649e(C73852u1.this.f216741j.mo91565f())) {
                boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(C73852u1.this.f216741j.mo91565f(), "android.permission.RECORD_AUDIO", 81, "", "");
                Log.m105925i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), C73852u1.this.f216741j.mo91565f());
                if (z1) {
                    C73852u1 u1Var = C73852u1.this;
                    ((C79344c1) u1Var.f216741j.f193278b.mo102812a(C79344c1.class)).mo102263K(false);
                    u1Var.f216732a.setBottomPanelVisibility(8);
                }
            }
        }

        /* renamed from: t */
        public void mo96060t() {
            Log.m105925i("MicroMsg.ChattingFooterEventImpl", "onEnterGroupSolitaire() chatroom:%s", C73852u1.this.f216741j.mo91577r());
            Intent intent = new Intent();
            intent.putExtra("key_group_solitatire_create", true);
            intent.putExtra("key_group_solitatire_scene", 5);
            C79013a aVar = new C79013a();
            aVar.f232001H = C73852u1.this.f216741j.mo91565f().getString(C0966R.string.ffa) + "\n";
            String o = C78747b.m95115o(aVar);
            aVar.field_key = o;
            aVar.f232004K = ".";
            aVar.f232009Q = 1;
            intent.putExtra("key_group_solitatire_key", o);
            intent.putExtra("key_group_solitatire_chatroom_username", C73852u1.this.f216741j.mo91577r());
            C78747b.m95105e(C73852u1.this.f216741j.mo91577r(), aVar);
            ((C77815b) C86312j.m106911c(C77815b.class)).vx0().mo108673k(C73852u1.this.f216741j.mo91577r(), aVar);
            C88144b.m109791i(C73852u1.this.f216741j.mo91565f(), "groupsolitaire", ".ui.GroupSolitatireEditUI", intent, (Bundle) null);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.u1$j */
    public class C73866j implements C88144b.C76564c {
        public C73866j() {
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            String str;
            String str2;
            ArrayList<String> arrayList;
            long j;
            C67380a aVar;
            C86001b0 q;
            int i3 = i2;
            Intent intent2 = intent;
            if (i == 227) {
                C73852u1 u1Var = C73852u1.this;
                C67391b bVar = u1Var.f216741j;
                u1Var.getClass();
                if (i3 == -1 && intent2 != null) {
                    ((C79386v0) bVar.f193278b.mo102812a(C79386v0.class)).mo102591a1(217, i3, intent2);
                    ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("selected_file_lst");
                    ArrayList<String> stringArrayListExtra2 = intent2.getStringArrayListExtra("selected_file_title_lst");
                    int p1 = bVar.mo91583x() ? ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(u1Var.f216734c) : 0;
                    if (stringArrayListExtra != null) {
                        int size = stringArrayListExtra.size();
                        int i4 = 0;
                        while (i4 < size) {
                            String str3 = stringArrayListExtra.get(i4);
                            String str4 = "";
                            if (!Util.isNullOrNil(str3)) {
                                try {
                                    int lastIndexOf = str3.lastIndexOf(47) + 1;
                                    if (lastIndexOf < 0 || lastIndexOf == str3.length()) {
                                        lastIndexOf = 0;
                                    }
                                    str2 = str3.substring(lastIndexOf, str3.length());
                                    if (stringArrayListExtra2 != null && i4 < stringArrayListExtra2.size() && !Util.isNullOrNil(stringArrayListExtra2.get(i4))) {
                                        str = stringArrayListExtra2.get(i4);
                                    }
                                } catch (Exception e) {
                                    Log.m105920e("MicroMsg.ChattingFooterEventImpl", "get file name error " + e.getMessage());
                                    str2 = " ";
                                }
                                str = str4;
                            } else {
                                str = str4;
                                str2 = str3;
                            }
                            ArrayList<String> stringsToList = Util.stringsToList(u1Var.f216734c.split(","));
                            HashMap hashMap = new HashMap(stringsToList.size());
                            Iterator<String> it = stringsToList.iterator();
                            while (it.hasNext()) {
                                String next = it.next();
                                C72963f4 f4Var = new C72963f4();
                                Iterator<String> it4 = it;
                                C68070l.C68072b bVar2 = new C68070l.C68072b();
                                bVar2.f195562d = str4;
                                bVar2.f195484F = str4;
                                String str5 = str4;
                                bVar2.f195618r = 4;
                                WXFileObject wXFileObject = new WXFileObject();
                                wXFileObject.setFilePath(str3);
                                int i5 = i4;
                                WXMediaMessage wXMediaMessage = new WXMediaMessage();
                                wXMediaMessage.mediaObject = wXFileObject;
                                Uri n = C116299g2.m163858n(str3);
                                int i6 = size;
                                String path = n.getPath();
                                ArrayList<String> arrayList2 = stringArrayListExtra;
                                if (path != null) {
                                    String k = C116299g2.m163855k(path, false, false);
                                    if (!n.getPath().equals(k)) {
                                        n = n.buildUpon().path(k).build();
                                    }
                                }
                                String path2 = n.getPath();
                                int lastIndexOf2 = path2.lastIndexOf("/");
                                if (lastIndexOf2 >= 0) {
                                    path2 = path2.substring(lastIndexOf2 + 1);
                                }
                                wXMediaMessage.title = path2;
                                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                                if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
                                    arrayList = stringArrayListExtra2;
                                    j = q.f250473c;
                                } else {
                                    arrayList = stringArrayListExtra2;
                                    j = 0;
                                }
                                wXMediaMessage.description = Util.getSizeKB(j);
                                Log.m105918d("MicroMsg.ChattingFooterEventImpl", C76861g.m92660c() + "mediaMessageToContent sdkver:" + wXMediaMessage.sdkVer + " title:" + wXMediaMessage.title + " desc:" + wXMediaMessage.description + " type:" + wXMediaMessage.mediaObject.type());
                                bVar2.f195566e = wXMediaMessage.sdkVer;
                                bVar2.f195570f = wXMediaMessage.title;
                                bVar2.f195574g = wXMediaMessage.description;
                                bVar2.f195536V = wXMediaMessage.mediaTagName;
                                bVar2.f195539W = wXMediaMessage.messageAction;
                                bVar2.f195542X = wXMediaMessage.messageExt;
                                WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
                                int type = iMediaObject.type();
                                bVar2.f195582i = type;
                                if (type == 6) {
                                    WXFileObject wXFileObject2 = (WXFileObject) iMediaObject;
                                    if (!Util.isNullOrNil(wXFileObject2.fileData)) {
                                        Log.m105918d("MicroMsg.ChattingFooterEventImpl", C76861g.m92660c() + " fileData:" + wXFileObject2.fileData.length);
                                        bVar2.f195594l = wXFileObject2.fileData.length;
                                    } else {
                                        bVar2.f195594l = (int) C86013q1.m106451l(wXFileObject2.filePath);
                                        Log.m105918d("MicroMsg.ChattingFooterEventImpl", C76861g.m92660c() + " read file:" + wXFileObject2.filePath + " len:" + bVar2.f195594l);
                                        if (bVar2.f195594l > 0) {
                                            bVar2.f195602n = C86013q1.m106454o(wXFileObject2.filePath);
                                        }
                                    }
                                }
                                f4Var.mo108732L2(C68070l.C68072b.m80420s(bVar2, (String) null, (C98121d) null));
                                f4Var.mo100991d(1);
                                f4Var.mo108740T2(1);
                                f4Var.setType(1090519089);
                                f4Var.mo108749c3(next);
                                f4Var.mo108733M2(C75604z3.m90843o(next));
                                if (((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(f4Var.mo108768t()) && (aVar = C67380a.C67381a.f193260a) != null) {
                                    ((C87107w.C75813c) aVar).mo106108c(f4Var);
                                }
                                hashMap.put(next, Long.valueOf(((C72972g4) C97625j3.m125812b().mo105911z()).my0(f4Var)));
                                it = it4;
                                str4 = str5;
                                i4 = i5;
                                size = i6;
                                stringArrayListExtra = arrayList2;
                                stringArrayListExtra2 = arrayList;
                            }
                            ((C119157j) C119157j.f356862d).mo183875f(new C73848t1(u1Var, str2, str3, str, hashMap, bVar.mo91583x(), p1));
                            i4++;
                            size = size;
                            stringArrayListExtra = stringArrayListExtra;
                            stringArrayListExtra2 = stringArrayListExtra2;
                        }
                    }
                    String stringExtra = intent2.getStringExtra("with_text_content");
                    if (!Util.isNullOrNil(stringExtra)) {
                        C7250m.m7431a().mo136252Ar(stringExtra, u1Var.f216734c);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.u1$k */
    public static class C73867k {

        /* renamed from: a */
        public String f216775a;

        /* renamed from: b */
        public String f216776b;
    }

    /* renamed from: com.tencent.mm.ui.chatting.u1$l */
    public static class C73868l {

        /* renamed from: a */
        public boolean f216777a = false;

        /* renamed from: b */
        public C73867k f216778b;

        /* renamed from: c */
        public C73867k f216779c;

        /* renamed from: d */
        public C73867k f216780d;

        /* renamed from: e */
        public C73867k f216781e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C73852u1(ck3.C67391b r8, com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter r9, java.lang.String r10) {
        /*
            r7 = this;
            r7.<init>()
            java.lang.String r0 = ""
            r7.f216742k = r0
            r7.f216743l = r0
            com.tencent.mm.ui.chatting.u1$c r0 = new com.tencent.mm.ui.chatting.u1$c
            r0.<init>()
            r7.f216744m = r0
            com.tencent.mm.ui.chatting.u1$d r1 = new com.tencent.mm.ui.chatting.u1$d
            r1.<init>()
            r7.f216745n = r1
            r2 = 0
            r7.f216746o = r2
            r7.f216747p = r2
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r7.f216748q = r3
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            com.tencent.mm.ui.chatting.u1$f r4 = new com.tencent.mm.ui.chatting.u1$f
            r4.<init>()
            r5 = 1
            r3.<init>(r4, r5)
            r7.f216749r = r3
            r7.f216750s = r2
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            com.tencent.mm.ui.chatting.u1$g r4 = new com.tencent.mm.ui.chatting.u1$g
            r4.<init>()
            r3.<init>(r4, r5)
            r7.f216751t = r3
            com.tencent.mm.ui.chatting.u1$i r3 = new com.tencent.mm.ui.chatting.u1$i
            r3.<init>()
            r7.f216752u = r3
            r7.f216741j = r8
            r7.f216732a = r9
            r7.f216734c = r10
            eb0.c r8 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r8 = r8.mo105907v()
            com.tencent.mm.storage.z1 r8 = r8.get(r10)
            r7.f216735d = r8
            ck3.b r8 = r7.f216741j
            java.lang.String r8 = r8.mo91577r()
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85820U5(r8)
            r7.f216738g = r8
            r7.f216739h = r8
            ck3.b r8 = r7.f216741j
            android.app.Activity r8 = r8.mo91565f()
            java.lang.String r10 = "vibrator"
            java.lang.Object r8 = r8.getSystemService(r10)
            android.os.Vibrator r8 = (android.os.Vibrator) r8
            r7.f216737f = r8
            java.lang.String r8 = r7.f216734c
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85803I5(r8)
            java.lang.String r10 = "MicroMsg.ChattingFooterEventImpl"
            if (r8 == 0) goto L_0x0090
            uw2.k r8 = new uw2.k
            r8.<init>()
            r7.f216733b = r8
            java.lang.String r8 = "initRecorder new VoiceRemindRecorder()."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
            goto L_0x0120
        L_0x0090:
            java.lang.String r8 = r7.f216734c
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85842m5(r8)
            if (r3 == 0) goto L_0x0099
            goto L_0x00f6
        L_0x0099:
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r8 = r3.get(r8)
            if (r8 == 0) goto L_0x00f8
            boolean r3 = r8.mo62916m3()
            if (r3 == 0) goto L_0x00f8
            java.lang.String r3 = r8.getUsername()
            ug.c r3 = rb0.C47984k.m53328b(r3)
            if (r3 == 0) goto L_0x00f8
            ug.c$b r3 = r3.mo73500r2(r2)
            if (r3 == 0) goto L_0x00f8
            org.json.JSONObject r4 = r3.f146795a
            if (r4 == 0) goto L_0x00d3
            java.lang.String r6 = "CanReceiveSpeexVoice"
            java.lang.String r4 = r4.optString(r6)
            java.lang.String r6 = "1"
            boolean r4 = r6.equals(r4)
            r3.f146798d = r4
        L_0x00d3:
            boolean r3 = r3.f146798d
            if (r3 == 0) goto L_0x00f8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "bizinfo name="
            r3.append(r4)
            java.lang.String r8 = r8.getUsername()
            r3.append(r8)
            java.lang.String r8 = " canReceiveSpeexVoice"
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.String r3 = "MicroMsg.BizInfoStorageLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
        L_0x00f6:
            r8 = 1
            goto L_0x00f9
        L_0x00f8:
            r8 = 0
        L_0x00f9:
            if (r8 == 0) goto L_0x010e
            qh.l r8 = new qh.l
            ck3.b r2 = r7.f216741j
            android.app.Activity r2 = r2.mo91565f()
            r8.<init>(r2, r5)
            r7.f216733b = r8
            java.lang.String r8 = "initRecorder new SceneVoiceRecorder, use Speex"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
            goto L_0x0120
        L_0x010e:
            qh.l r8 = new qh.l
            ck3.b r3 = r7.f216741j
            android.app.Activity r3 = r3.mo91565f()
            r8.<init>(r3, r2)
            r7.f216733b = r8
            java.lang.String r8 = "initRecorder new SceneVoiceRecorder, not use Speex"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
        L_0x0120:
            ob0.r r8 = r7.f216733b
            r8.mo107325j(r1)
            ob0.r r8 = r7.f216733b
            r8.mo107317c(r0)
            com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r8 = r7.f216752u
            r9.setAppPanelListener(r8)
            java.lang.Class<h81.h> r8 = h81.C32735h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            h81.h r8 = (h81.C32735h) r8
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_jump_to_record_media
            r8.mo58784wf(r9, r5)
            eb0.c r8 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r8 = r8.mo105906u()
            r9 = 2
            r10 = 0
            java.lang.Object r8 = r8.mo119684e(r9, r10)
            java.lang.String r8 = (java.lang.String) r8
            r7.f216742k = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73852u1.<init>(ck3.b, com.tencent.mm.pluginsdk.ui.chat.ChatFooter, java.lang.String):void");
    }

    /* renamed from: G */
    public static boolean m87498G(String str) {
        Class cls = C79445i.class;
        return !((((C79445i) C86312j.m106911c(cls)).Cp0(str) ? (Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_NEWYEAR_UNION_SWITCH_INT_SYNC, 0) : ((C79445i) C86312j.m106911c(cls)).mo109188ae() ? (Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_HK_NEWYEAR_SWITCH_INT_SYNC, 0) : (Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_NEWYEAR_SWITCH_INT_SYNC, 0)).intValue() == 1 || ((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_NEWYEAR_LOCAL_SWITCH_INT, 0)).intValue() == 1) || !((C75592q0.m90784n() == 0) || ((C79445i) C86312j.m106911c(cls)).mo109188ae());
    }

    /* renamed from: I */
    public static void m87499I(int i, int i2, String str) {
        ChatHbClickStruct chatHbClickStruct = new ChatHbClickStruct();
        chatHbClickStruct.f194154d = (long) i;
        chatHbClickStruct.f194157g = System.currentTimeMillis();
        chatHbClickStruct.f194155e = chatHbClickStruct.mo86045b("SessionId", str, true);
        chatHbClickStruct.f194156f = (long) i2;
        chatHbClickStruct.mo86054n();
    }

    /* renamed from: c */
    public static void m87500c(C73852u1 u1Var, String str) {
        u1Var.getClass();
        Intent intent = new Intent();
        int p1 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(u1Var.mo102898p());
        intent.putExtra("key_way", 1);
        intent.putExtra("key_chatroom_num", p1);
        intent.putExtra("key_type", 1);
        intent.putExtra("key_from", 1);
        intent.putExtra("key_username", u1Var.mo102898p());
        intent.putExtra("key_session_id", str);
        intent.putExtra("pay_channel", 14);
        C115669n.INSTANCE.mo160131h(25925, 2, 3, Float.valueOf(C76577a.m92165p(u1Var.f216741j.mo91565f())), 0, 0);
        C88144b.m109791i(u1Var.f216741j.mo91565f(), "luckymoney", ".ui.LuckyMoneyPrepareUI", intent, (Bundle) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bb A[SYNTHETIC, Splitter:B:25:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011c A[ADDED_TO_REGION] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m87501d(com.tencent.p014mm.p136ui.chatting.C73852u1 r25) {
        /*
            r8 = r25
            java.lang.String r0 = "share"
            java.lang.String r1 = "url"
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WX_WEISHI_HONGBAO_DOWNLOAD_COUNT_JSON_STRING_SYNC
            hi2.x r3 = hi2.C46076x.f124226a
            ck3.b r4 = r8.f216741j
            android.app.Activity r4 = r4.mo91565f()
            boolean r9 = r3.mo71517b(r4)
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_weishi_hb_config
            java.lang.String r5 = ""
            java.lang.String r3 = r3.Y60(r4, r5)
            java.lang.String r4 = com.tencent.p014mm.p136ui.C7035v.f24803a
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.String r7 = "MicroMsg.ChattingFooterEventImpl"
            r10 = 1
            java.lang.String r11 = "weishi://webview?jump_url=https%3A%2F%2Fisee.weishi.qq.com%2F21red.html%3Fshowloading%3D0%26offlineMode%3D1%26u%3D1&navstyle=5&needlogin=1&_wv=4096&activity_id=WxRpAct2021&logsour=2230000003"
            java.lang.String r12 = "https://isee.weishi.qq.com/ws/wact/app-download/index.html?chid=205000003&attach=cp_reserves3_2230000003"
            java.lang.String r15 = "wcpay.weishi.redenvelop.countForH5"
            if (r6 != 0) goto L_0x0095
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x007a }
            r6.<init>(r3)     // Catch:{ Exception -> 0x007a }
            java.lang.String r3 = "weishi_download"
            org.json.JSONObject r3 = r6.getJSONObject(r3)     // Catch:{ Exception -> 0x007a }
            java.lang.String r13 = "wx_weishi_download"
            org.json.JSONObject r13 = r6.getJSONObject(r13)     // Catch:{ Exception -> 0x007a }
            java.lang.String r14 = "weishi_jump"
            java.lang.String r11 = r6.getString(r14)     // Catch:{ Exception -> 0x007a }
            java.lang.String r12 = r3.getString(r1)     // Catch:{ Exception -> 0x007a }
            boolean r3 = r3.getBoolean(r0)     // Catch:{ Exception -> 0x007a }
            java.lang.String r4 = r13.getString(r1)     // Catch:{ Exception -> 0x0077 }
            boolean r1 = r13.getBoolean(r0)     // Catch:{ Exception -> 0x0077 }
            java.lang.String r0 = "wx_weishi_download_click_limit"
            int r13 = r6.getInt(r0)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = "limit_key"
            java.lang.String r15 = r6.getString(r0)     // Catch:{ Exception -> 0x0073 }
            r6 = r12
            r16 = 0
            goto L_0x008e
        L_0x0073:
            r0 = move-exception
            goto L_0x007e
        L_0x0075:
            r0 = move-exception
            goto L_0x007d
        L_0x0077:
            r0 = move-exception
            r1 = 0
            goto L_0x007d
        L_0x007a:
            r0 = move-exception
            r1 = 0
            r3 = 0
        L_0x007d:
            r13 = 3
        L_0x007e:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.String r0 = r0.getMessage()
            r16 = 0
            r6[r16] = r0
            java.lang.String r0 = "gotoWeishiHb Exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r6)
            r6 = r12
        L_0x008e:
            r24 = r11
            r11 = r3
            r3 = r4
            r4 = r24
            goto L_0x009d
        L_0x0095:
            r16 = 0
            r3 = r4
            r4 = r11
            r6 = r12
            r1 = 0
            r11 = 0
            r13 = 3
        L_0x009d:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r16] = r4
            r0[r10] = r15
            java.lang.String r12 = "get weishi hongbao config expt, weishiJump: %s, clickLimitKey: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r12, r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            java.lang.String r0 = r0.mo119675I(r2, r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 != 0) goto L_0x00d8
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00c7 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00c7 }
            int r0 = r5.getInt(r15)     // Catch:{ Exception -> 0x00c7 }
            r16 = 0
            goto L_0x00db
        L_0x00c7:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.String r0 = r0.getMessage()
            r16 = 0
            r5[r16] = r0
            java.lang.String r0 = "get max count store key for weishi url Exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r5)
            goto L_0x00da
        L_0x00d8:
            r16 = 0
        L_0x00da:
            r0 = 0
        L_0x00db:
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r5[r16] = r12
            java.lang.String r12 = "get enter count in storage: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r12, r5)
            r5 = 6
            java.lang.String r12 = r8.f216743l
            m87499I(r5, r0, r12)
            if (r9 == 0) goto L_0x0105
            r5 = 10
            java.lang.String r12 = r8.f216743l
            m87499I(r5, r0, r12)
            ck3.b r5 = r8.f216741j
            android.app.Activity r5 = r5.mo91565f()
            r12 = 2131821526(0x7f1103d6, float:1.9275798E38)
            java.lang.String r5 = r5.getString(r12)
            goto L_0x0118
        L_0x0105:
            r5 = 7
            java.lang.String r12 = r8.f216743l
            m87499I(r5, r0, r12)
            ck3.b r5 = r8.f216741j
            android.app.Activity r5 = r5.mo91565f()
            r12 = 2131821524(0x7f1103d4, float:1.9275794E38)
            java.lang.String r5 = r5.getString(r12)
        L_0x0118:
            r18 = r5
            if (r9 != 0) goto L_0x0187
            if (r0 >= r13) goto L_0x0187
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = "&sessionId="
            r5.append(r3)
            java.lang.String r3 = r8.f216743l
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r6 = 0
            r5[r6] = r3
            java.lang.String r6 = "wxWeishiUrl: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r6, r5)
            com.tencent.mm.plugin.recordvideo.background.provider.WeSeeProvider$a r5 = com.tencent.p014mm.plugin.recordvideo.background.provider.WeSeeProvider.f115880g
            long r11 = java.lang.System.currentTimeMillis()
            r5.mo57309b(r4, r11)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            if (r1 != 0) goto L_0x0154
            java.lang.String r1 = "KRightBtn"
            r4.putExtra(r1, r10)
        L_0x0154:
            java.lang.String r1 = "rawUrl"
            r4.putExtra(r1, r3)
            ck3.b r1 = r8.f216741j
            android.app.Activity r1 = r1.mo91565f()
            r3 = 0
            java.lang.String r5 = "webview"
            java.lang.String r6 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r1, r5, r6, r4, r3)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            int r0 = r0 + r10
            r1.put(r15, r0)     // Catch:{ Exception -> 0x0172 }
            goto L_0x0177
        L_0x0172:
            java.lang.String r0 = "set max count json for weishi url store key error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
        L_0x0177:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            java.lang.String r1 = r1.toString()
            r0.mo119677K(r2, r1)
            goto L_0x01bf
        L_0x0187:
            ck3.b r1 = r8.f216741j
            android.app.Activity r17 = r1.mo91565f()
            ck3.b r1 = r8.f216741j
            android.app.Activity r1 = r1.mo91565f()
            r2 = 2131821617(0x7f110431, float:1.9275982E38)
            java.lang.String r20 = r1.getString(r2)
            ck3.b r1 = r8.f216741j
            android.app.Activity r1 = r1.mo91565f()
            r2 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r21 = r1.getString(r2)
            com.tencent.mm.ui.chatting.r1 r22 = new com.tencent.mm.ui.chatting.r1
            r1 = r22
            r2 = r25
            r3 = r9
            r5 = r0
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.tencent.mm.ui.chatting.s1 r1 = new com.tencent.mm.ui.chatting.s1
            r1.<init>(r8, r9, r0)
            java.lang.String r19 = ""
            r23 = r1
            nj3.C76879j.m92707A(r17, r18, r19, r20, r21, r22, r23)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73852u1.m87501d(com.tencent.mm.ui.chatting.u1):void");
    }

    /* renamed from: e */
    public static void m87502e(C73852u1 u1Var) {
        u1Var.getClass();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC;
        Class cls = C79445i.class;
        Class cls2 = C79442f.class;
        Log.m105924i("MicroMsg.ChattingFooterEventImpl", "do get config");
        String p = u1Var.mo102898p();
        int i = 0;
        if (((C79445i) C86312j.m106911c(cls)).Cp0(u1Var.mo102898p())) {
            ((C79442f) C86312j.m106911c(cls2)).mo109153DP(((Integer) C86709a0.m107535s().mo121142i().mo119685f(aVar, 0)).intValue(), p);
        } else if (((C79445i) C86312j.m106911c(cls)).mo109188ae()) {
            ((C79442f) C86312j.m106911c(cls2)).ji0(p);
        } else {
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(aVar, 0)).intValue();
            if (C72996z1.m85820U5(p)) {
                C115669n.INSTANCE.mo160131h(25925, 2, 3, Float.valueOf(C76577a.m92165p(u1Var.f216741j.mo91565f())), 0, 0);
            } else {
                C115669n.INSTANCE.mo160131h(25925, 1, 1, Float.valueOf(C76577a.m92165p(u1Var.f216741j.mo91565f())), 0, 0);
                i = 25;
            }
            ((C79442f) C86312j.m106911c(cls2)).mo109166fE(i, intValue, p);
        }
    }

    /* renamed from: f */
    public static void m87503f(C73852u1 u1Var, String str) {
        u1Var.getClass();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(11701, 1, 0, 0, 1, 1);
        Intent intent = new Intent();
        intent.putExtra("key_way", 0);
        intent.putExtra("key_type", 0);
        intent.putExtra("key_from", 1);
        intent.putExtra("key_username", u1Var.mo102898p());
        intent.putExtra("key_session_id", str);
        intent.putExtra("pay_channel", 11);
        nVar.mo160131h(25925, 1, 1, Float.valueOf(C76577a.m92165p(u1Var.f216741j.mo91565f())), 0, 0);
        C88144b.m109791i(u1Var.f216741j.mo91565f(), "luckymoney", ".ui.LuckyMoneyPrepareUI", intent, (Bundle) null);
    }

    /* renamed from: o */
    public static C73867k m87504o(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has("wording")) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("wording");
        if (!optJSONObject.has(str)) {
            return null;
        }
        C73867k kVar = new C73867k();
        JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
        kVar.f216775a = optJSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        kVar.f216776b = optJSONObject2.optString("desc");
        return kVar;
    }

    /* renamed from: q */
    public static C73867k m87505q(C73868l lVar) {
        if (lVar == null) {
            return null;
        }
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        return "zh_CN".equals(applicationLanguage) ? lVar.f216778b : "zh_TW".equals(applicationLanguage) ? lVar.f216780d : "zh_HK".equals(applicationLanguage) ? lVar.f216779c : lVar.f216781e;
    }

    /* renamed from: A */
    public boolean mo100646A() {
        Class cls = C79388w0.class;
        Class cls2 = C79362h1.class;
        Log.m105926v("MicroMsg.ChattingFooterEventImpl", "record cancel on cancel request");
        synchronized (this.f216748q) {
            this.f216746o = true;
        }
        if (!this.f216747p) {
            Log.m105924i("MicroMsg.ChattingFooterEventImpl", "jacks in voice rcd stop but not begin.");
            return false;
        }
        this.f216747p = false;
        this.f216741j.mo91546G(false);
        mo100662x();
        this.f216732a.mo100344C0(ChatFooter$$o1.Cancel);
        AutoPlay W = ((C79362h1) this.f216741j.f193278b.mo102812a(cls2)).mo102325W();
        W.f215193f = false;
        W.mo102009l();
        ((C79388w0) this.f216741j.f193278b.mo102812a(cls)).mo102672a4(4);
        ((C79388w0) this.f216741j.f193278b.mo102812a(cls)).mo102673q();
        mo102887H(1);
        ((C79362h1) this.f216741j.f193278b.mo102812a(cls2)).mo102337j5(this.f216741j.f193286j, false);
        return true;
    }

    /* renamed from: B */
    public boolean mo100647B() {
        Class cls = C79388w0.class;
        Class cls2 = C79362h1.class;
        Log.m105926v("MicroMsg.ChattingFooterEventImpl", "only stop recording.");
        synchronized (this.f216748q) {
            this.f216746o = true;
        }
        if (!this.f216747p) {
            Log.m105924i("MicroMsg.ChattingFooterEventImpl", "ever never begin.");
            return false;
        }
        this.f216747p = false;
        this.f216741j.mo91546G(false);
        this.f216741j.f193286j.enableOptionMenu(true);
        this.f216741j.f193286j.enableBackMenu(true);
        C77002r rVar = this.f216733b;
        if (rVar != null) {
            rVar.mo107321f();
            this.f216749r.stopTimer();
            this.f216751t.stopTimer();
        }
        this.f216732a.mo100344C0(ChatFooter$$o1.StopRecord);
        AutoPlay W = ((C79362h1) this.f216741j.f193278b.mo102812a(cls2)).mo102325W();
        W.f215193f = false;
        W.mo102009l();
        ((C79388w0) this.f216741j.f193278b.mo102812a(cls)).mo102672a4(4);
        ((C79388w0) this.f216741j.f193278b.mo102812a(cls)).mo102673q();
        mo102887H(1);
        ((C79362h1) this.f216741j.f193278b.mo102812a(cls2)).mo102337j5(this.f216741j.f193286j, false);
        return true;
    }

    /* renamed from: C */
    public boolean mo100648C() {
        Class cls = C79388w0.class;
        Class cls2 = C79362h1.class;
        synchronized (this.f216748q) {
            this.f216746o = true;
        }
        if (!this.f216747p) {
            Log.m105924i("MicroMsg.ChattingFooterEventImpl", "jacks in voice rcd stop but not begin.");
            return false;
        }
        this.f216747p = false;
        this.f216741j.mo91546G(false);
        if (!mo102888J()) {
            this.f216732a.mo100356I0();
            Log.m105924i("MicroMsg.ChattingFooterEventImpl", "record stop on stop request setRcdTooShort");
        } else {
            this.f216732a.setExitType(0);
            ChatFooter chatFooter = this.f216732a;
            if (!chatFooter.f211774J2) {
                if (1 == ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_trans_txt_edu_user_switch, 1)) {
                    SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences(ChatFooter.f211733H4, 0);
                    if (sharedPreferences.getInt("trans2txt_edu_key", 0) == 0) {
                        sharedPreferences.edit().putInt("trans2txt_edu_key", 1).apply();
                        C72963f4 f4Var = new C72963f4();
                        String b = chatFooter.f211826V1.mo100532b();
                        f4Var.mo108733M2(C75604z3.m90843o(b));
                        f4Var.mo108749c3(b);
                        f4Var.mo108732L2(MMApplicationContext.getContext().getString(C0966R.string.kcd));
                        f4Var.setType(10000);
                        f4Var.mo100991d(6);
                        f4Var.mo108740T2(0);
                        ((C72972g4) C97625j3.m125812b().mo105911z()).my0(f4Var);
                    }
                }
            }
            this.f216732a.mo100344C0(ChatFooter$$o1.SendVoice);
            ((C79363i) this.f216741j.f193278b.mo102812a(C79363i.class)).mo102352K0();
            Log.m105924i("MicroMsg.ChattingFooterEventImpl", "record stop on stop request resetRcdStatus");
        }
        AutoPlay W = ((C79362h1) this.f216741j.f193278b.mo102812a(cls2)).mo102325W();
        W.f215193f = false;
        W.mo102009l();
        ((C79388w0) this.f216741j.f193278b.mo102812a(cls)).mo102672a4(4);
        ((C79388w0) this.f216741j.f193278b.mo102812a(cls)).mo102673q();
        mo102887H(1);
        ((C79362h1) this.f216741j.f193278b.mo102812a(cls2)).mo102337j5(this.f216741j.f193286j, false);
        return true;
    }

    /* renamed from: D */
    public void mo100649D(boolean z) {
        Class cls = C79388w0.class;
        if (z) {
            ((C79388w0) this.f216741j.f193278b.mo102812a(cls)).mo102671Q();
        } else {
            ((C79388w0) this.f216741j.f193278b.mo102812a(cls)).mo102673q();
        }
    }

    /* renamed from: E */
    public void mo100650E() {
        this.f216741j.mo91570k().postDelayed(new C73860h(), 100);
        mo102889K();
    }

    /* renamed from: F */
    public boolean mo100651F(String str, int i) {
        if (Util.isNullOrNil(str) || i <= 0 || C76552z.m92077o(str) == null) {
            return false;
        }
        C76552z.m92085w(str, i, 0);
        C76546u.xx0().mo107480e();
        return true;
    }

    /* renamed from: H */
    public final void mo102887H(int i) {
        RecordStateChangeEvent recordStateChangeEvent = new RecordStateChangeEvent();
        recordStateChangeEvent.f193878d.f193879a = i;
        recordStateChangeEvent.publish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo102888J() {
        /*
            r9 = this;
            ck3.b r0 = r9.f216741j
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f193286j
            r1 = 1
            r0.enableOptionMenu(r1)
            ck3.b r0 = r9.f216741j
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f193286j
            r0.enableBackMenu(r1)
            ob0.r r0 = r9.f216733b
            java.lang.String r2 = "MicroMsg.ChattingFooterEventImpl"
            r3 = 0
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r0.mo107324i()
            java.lang.String r4 = "medianote"
            if (r0 == 0) goto L_0x0039
            com.tencent.mm.storage.z1 r0 = r9.f216735d
            java.lang.String r0 = r0.getUsername()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0034
            int r0 = eb0.C75592q0.m90787q()
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 != 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 == 0) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            ob0.r r5 = r9.f216733b
            boolean r5 = r5.stop()
            com.tencent.mm.sdk.platformtools.MTimerHandler r6 = r9.f216749r
            r6.stopTimer()
            com.tencent.mm.sdk.platformtools.MTimerHandler r6 = r9.f216751t
            r6.stopTimer()
            if (r0 == 0) goto L_0x00b9
            com.tencent.mm.storage.f4 r0 = new com.tencent.mm.storage.f4
            r0.<init>()
            r0.mo108749c3(r4)
            r6 = 34
            r0.setType(r6)
            r0.mo108740T2(r1)
            java.lang.String r1 = r9.f216736e
            r0.mo108739S2(r1)
            r1 = 2
            r0.mo100991d(r1)
            java.lang.String r6 = eb0.C75592q0.m90789s()
            ob0.r r7 = r9.f216733b
            int r7 = r7.mo107323h()
            long r7 = (long) r7
            java.lang.String r3 = kd0.C76549w.m92049c(r6, r7, r3)
            r0.mo108732L2(r3)
            long r3 = eb0.C75604z3.m90843o(r4)
            r0.mo108733M2(r3)
            ob0.r r3 = r9.f216733b
            int r3 = r3.mo107320e()
            if (r3 != r1) goto L_0x008b
            java.lang.String r1 = "SOURCE_SILK_FILE"
            r0.mo101012p4(r1)
        L_0x008b:
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            long r0 = r1.my0(r0)
            r3 = 0
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x00a5
            java.lang.String r0 = "insertLocalMsg fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x00b9
        L_0x00a5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "insertLocalMsg success, msgId = "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x00b9:
            java.lang.String r0 = "keep_app_silent"
            com.tencent.p014mm.sdk.platformtools.MMEntryLock.unlock(r0)
            r3 = r5
            goto L_0x00c6
        L_0x00c0:
            java.lang.String r0 = "stopRecording recorder == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x00c6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73852u1.mo102888J():boolean");
    }

    /* renamed from: K */
    public final void mo102889K() {
        if (Log.getLogLevel() <= 1) {
            Log.m105918d("MicroMsg.ChattingFooterEventImpl", "trickyStopFling() called");
        }
        C67391b bVar = this.f216741j;
        bVar.getClass();
        Log.m105925i("MicroMsg.ChattingContext", "[smoothScrollBy] dis:%s duration:%s", 0, 0);
        ChattingUIFragment chattingUIFragment = (ChattingUIFragment) bVar.f193287k;
        chattingUIFragment.getClass();
        Log.m105925i("MicroMsg.ChattingUIFragment", "[smoothScrollBy] dis:%d duration:%d", 0, 0);
        chattingUIFragment.f215304v.smoothScrollBy(0, 0);
    }

    /* renamed from: a */
    public String mo100652a() {
        C77002r rVar = this.f216733b;
        return rVar != null ? rVar.mo107315a() : "";
    }

    /* renamed from: b */
    public long mo100653b() {
        C77002r rVar = this.f216733b;
        if (rVar != null) {
            return rVar.mo107316b();
        }
        return 0;
    }

    /* renamed from: g */
    public void mo102890g() {
        BaseChattingUIFragment baseChattingUIFragment = this.f216741j.f193286j;
        String b = C112760b.m154221b();
        if (!((C7138g) C86312j.m106911c(C7138g.class)).hh0(baseChattingUIFragment, b, "microMsg." + System.currentTimeMillis() + ".jpg", 201)) {
            C76701a.makeText((Context) this.f216741j.mo91565f(), (CharSequence) this.f216741j.mo91572m().getString(C0966R.string.ik5), 1).show();
        }
    }

    /* renamed from: h */
    public void mo102891h() {
        boolean z;
        Class cls = C103918d.class;
        Class cls2 = C69856h.class;
        boolean z1 = ((C103918d) C86312j.m106911c(cls)).mo125788z1(this.f216741j.mo91565f(), "android.permission.CAMERA", 22, "", "");
        Log.m105925i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), this.f216741j.mo91565f());
        if (z1) {
            boolean z15 = ((C103918d) C86312j.m106911c(cls)).mo125788z1(this.f216741j.mo91565f(), "android.permission.RECORD_AUDIO", 22, "", "");
            Log.m105925i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", Boolean.valueOf(z15), Util.getStack(), this.f216741j.mo91565f());
            if (z15) {
                Log.m105924i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk");
                Intent intent = new Intent();
                if (((C77833z) C75610d.m90859a()).mo107954g(mo102898p())) {
                    Log.m105924i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but now is in share location!");
                    C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.f360897fr3, 0).show();
                    return;
                }
                if (mo102898p() != null) {
                    List<String> G10 = ((C69856h) C86312j.m106911c(cls2)).G10(mo102898p());
                    String str = (String) C97625j3.m125812b().mo105906u().mo119684e(2, (Object) null);
                    boolean sV = ((C69856h) C86312j.m106911c(cls2)).mo96150sV(mo102898p());
                    Iterator<String> it = G10.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        String next = it.next();
                        if (str != null && str.equals(next)) {
                            z = true;
                            break;
                        }
                    }
                    if (G10.size() < C104331h.m139313e() || z) {
                        if (z) {
                            if (((C69856h) C86312j.m106911c(cls2)).mo96149qn()) {
                                Log.m105924i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but already in it!");
                                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.gza), 0).show();
                                return;
                            }
                            Log.m105924i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, already inlist, but in fact not multitalking now!");
                        }
                        if (((C69856h) C86312j.m106911c(cls2)).mo96133ED()) {
                            Log.m105924i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but already in VoIP or multitalk!");
                            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.gza), 0).show();
                            return;
                        } else if (C61104a.m71649e(this.f216741j.mo91565f())) {
                            Log.m105924i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but already in appbrand voice!");
                            return;
                        } else if (C61104a.m71663s(this.f216741j.mo91565f(), (DialogInterface.OnClickListener) null) || C61104a.m71656l(this.f216741j.mo91565f(), true) || C61104a.m71661q(this.f216741j.mo91565f(), true)) {
                            return;
                        } else {
                            if (sV) {
                                Log.m105924i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but this group already in multitalk, alter take in or not tips!");
                                C76879j.m92707A(this.f216741j.mo91565f(), this.f216741j.mo91572m().getString(C0966R.string.h18), "", this.f216741j.mo91572m().getString(C0966R.string.gyu), this.f216741j.mo91572m().getString(C0966R.string.gyp), new C73853a(), (DialogInterface.OnClickListener) null);
                                return;
                            }
                        }
                    } else {
                        Log.m105924i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but > max 9 members!");
                        Context context = MMApplicationContext.getContext();
                        Context context2 = MMApplicationContext.getContext();
                        C76701a.makeText(context, (CharSequence) context2.getString(C0966R.string.gzw, new Object[]{C104331h.m139313e() + ""}), 0).show();
                        return;
                    }
                }
                intent.putExtra("chatroomName", mo102898p());
                intent.putExtra("key_need_gallery", true);
                intent.putExtra("titile", this.f216741j.mo91572m().getString(C0966R.string.h0q));
                C88144b.m109791i(this.f216741j.mo91565f(), "multitalk", ".ui.MultiTalkSelectContactUI", intent, (Bundle) null);
                if (this.f216732a.mo100437o0()) {
                    this.f216732a.setBottomPanelVisibility(8);
                }
            }
        }
    }

    /* renamed from: i */
    public void mo102892i() {
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this.f216741j.mo91565f(), "android.permission.RECORD_AUDIO", 83, "", "");
        Log.m105925i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), this.f216741j.mo91565f());
        if (z1) {
            if (this.f216732a.mo100437o0()) {
                this.f216732a.setBottomPanelVisibility(8);
            }
            VoipEvent voipEvent = new VoipEvent();
            VoipEvent.C67818a aVar = voipEvent.f194019d;
            aVar.f194022b = 5;
            aVar.f194025e = mo102898p();
            voipEvent.f194019d.f194024d = this.f216741j.mo91565f();
            voipEvent.f194019d.f194026f = 3;
            voipEvent.publish();
            C115669n.INSTANCE.mo160131h(11033, 4, 2, 0);
        }
    }

    /* renamed from: j */
    public void mo102893j() {
        Class cls = C103918d.class;
        boolean z1 = ((C103918d) C86312j.m106911c(cls)).mo125788z1(this.f216741j.mo91565f(), "android.permission.CAMERA", 21, "", "");
        Log.m105925i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), this.f216741j.mo91565f());
        if (z1) {
            boolean z15 = ((C103918d) C86312j.m106911c(cls)).mo125788z1(this.f216741j.mo91565f(), "android.permission.RECORD_AUDIO", 21, "", "");
            Log.m105925i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", Boolean.valueOf(z15), Util.getStack(), this.f216741j.mo91565f());
            if (z15) {
                if (this.f216732a.mo100437o0()) {
                    this.f216732a.setBottomPanelVisibility(8);
                }
                VoipEvent voipEvent = new VoipEvent();
                VoipEvent.C67818a aVar = voipEvent.f194019d;
                aVar.f194022b = 5;
                aVar.f194025e = mo102898p();
                voipEvent.f194019d.f194024d = this.f216741j.mo91565f();
                voipEvent.f194019d.f194026f = 2;
                voipEvent.publish();
            }
        }
    }

    /* renamed from: k */
    public void mo102894k() {
        Intent intent = new Intent();
        intent.setClass(this.f216741j.mo91565f(), FileSelectorUI.class);
        intent.putExtra("TO_USER", this.f216734c);
        this.f216741j.mo91557R(intent, WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC, new C73866j());
    }

    /* renamed from: l */
    public void mo102895l(int i) {
        boolean z;
        Class cls = C32735h.class;
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this.f216741j.mo91565f(), "android.permission.CAMERA", 18, "", "");
        Log.m105925i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), this.f216741j.mo91565f());
        if (z1) {
            C115669n.INSTANCE.mo160131h(13822, 1, 1);
            VideoTransPara videoTransPara = new SightParams(1, i).f248452f;
            RecordConfigProvider e = RecordConfigProvider.m119435e(videoTransPara, videoTransPara.f267170h * 1000, 1);
            C30420b bVar = C30420b.f82051a;
            SnsMethodCalculate.markStartTimeMs("getC2CVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            C79758p pVar = C79758p.f233760a;
            int e2 = pVar.mo109882e(C104160f.RepairerConfig_Media_C2CRecordUseVideoComposition_Int, 0);
            Log.m105924i("MicroMsg.EditorVideoCompositionConfig", "C2CVideoCompositionSwitch repairConfig: " + e2);
            if (e2 == 0) {
                e.mo129804a(2, "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout");
            } else if (e2 == 1) {
                e.mo129804a(2, "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout");
            }
            Bundle bundle = new Bundle();
            bundle.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 1);
            e.f272912M = bundle;
            SnsMethodCalculate.markEndTimeMs("getC2CVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            SnsMethodCalculate.markStartTimeMs("c2cUseCameraKitRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            Object a = pVar.mo109878a(C104160f.RepairerConfig_Camera_Component_Int, 0);
            if (C87412m.m108589b(a, 0)) {
                boolean z2 = C85875k4.m106157N() || C85875k4.m106210y();
                Log.m105924i("MicroMsg.EditorVideoCompositionConfig", "c2c UIUtils.isFoldableDevice:" + C85875k4.m106157N() + " UIUtils.inTabletEnv:" + C85875k4.m106210y());
                if (z2) {
                    z = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_camerakit_pad_record_c2c, true);
                    SnsMethodCalculate.markEndTimeMs("c2cUseCameraKitRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
                } else {
                    z = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_camerakit_record_c2c_new, true);
                    SnsMethodCalculate.markEndTimeMs("c2cUseCameraKitRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
                }
            } else {
                z = !C87412m.m108589b(a, 1);
                SnsMethodCalculate.markEndTimeMs("c2cUseCameraKitRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            }
            if (z) {
                Log.m105924i("MicroMsg.ChattingFooterEventImpl", "useCameraKitRecord");
                int f = bVar.mo57382f();
                Log.m105925i("MicroMsg.ChattingFooterEventImpl", "useCameraKitImproveLayout >> %d", Integer.valueOf(f));
                if (f > 0) {
                    if (f == 1) {
                        e.mo129804a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout");
                    } else if (f == 2) {
                        e.mo129804a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveShieldCameraKitPluginLayout");
                    }
                    int c = bVar.mo57379c();
                    Log.m105924i("MicroMsg.Camera.CameraKitConfig", "setCameraInstance >> " + c);
                    if (!C111386a.f333469a.mo163052a() && c != -1) {
                        Log.m105924i("MicroMsg.Camera.CameraKitConfig", "setCameraInstance value:CAMERA_INSTANCE_1");
                        C38971a.f104995c = 1;
                    }
                    C38971a.f104995c = c;
                    e.f272912M.putBoolean("key_record_keep_ratio", true);
                    e.mo129804a(2, "com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout");
                    e.mo129804a(1, "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveEditPhotoPluginLayout");
                } else {
                    Log.m105924i("MicroMsg.ChattingFooterEventImpl", "no useCameraKitImproveLayout");
                    e.mo129804a(0, CameraKitPluginLayout.class.getName());
                }
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_c2c_camerakit_multiple_kbps, -1);
                int i2 = MultiProcessMMKV.getDefault().getInt("key_record_without_edit", 1);
                Log.m105924i("MicroMsg.C2CRecordStrategy", "guessEditRecord time:" + i2 + " ratio:" + Qe);
                if (Qe < 1) {
                    Qe = i2 < 1 ? 5 : 1;
                }
                e.f272912M.putInt("key_record_bitrate_ratio", Qe);
                e.f272912M.putBoolean("key_edit_enable_emoji_search", true);
            }
            if (((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_c2c_ignore_remux_without_edit, false)) {
                e.f272919d = 2;
            }
            VideoCaptureReportInfo videoCaptureReportInfo = new VideoCaptureReportInfo();
            videoCaptureReportInfo.f272940d = 3;
            if (this.f216739h) {
                videoCaptureReportInfo.f272940d = 4;
            }
            e.f272908I = videoCaptureReportInfo;
            UICustomParam uICustomParam = new UICustomParam();
            ((HashMap) uICustomParam.f266575h).put("plugin_filter", Boolean.TRUE);
            ((HashMap) uICustomParam.f266575h).put("plugin_poi", true);
            ((HashMap) uICustomParam.f266575h).put("plugin_tip", true);
            ((HashMap) uICustomParam.f266575h).put("plugin_menu", true);
            e.f272927o = uICustomParam;
            ((C77572l) C86312j.m106911c(C77572l.class)).mo107612ZM((ComponentActivity) this.f216741j.mo91565f(), e, new C73854b());
        }
    }

    /* renamed from: m */
    public void mo102896m() {
        VoipEvent voipEvent = new VoipEvent();
        VoipEvent.C67818a aVar = voipEvent.f194019d;
        aVar.f194022b = 5;
        aVar.f194025e = mo102898p();
        voipEvent.f194019d.f194024d = this.f216741j.mo91565f();
        voipEvent.f194019d.f194026f = 4;
        if (this.f216732a.mo100437o0()) {
            this.f216732a.setBottomPanelVisibility(8);
        }
        voipEvent.publish();
    }

    /* renamed from: n */
    public void mo102897n() {
        VoipEvent voipEvent = new VoipEvent();
        VoipEvent.C67818a aVar = voipEvent.f194019d;
        aVar.f194022b = 5;
        aVar.f194025e = mo102898p();
        voipEvent.f194019d.f194024d = this.f216741j.mo91565f();
        voipEvent.f194019d.f194026f = 2;
        if (this.f216732a.mo100437o0()) {
            this.f216732a.setBottomPanelVisibility(8);
        }
        voipEvent.publish();
    }

    public void onPause() {
        boolean z = false;
        if (!(C78603a.f230232b && C87412m.m108589b(C78603a.f230231a, this.f216733b.mo107315a()))) {
            String a = this.f216733b.mo107315a();
            if (C78603a.f230234d && C87412m.m108589b(C78603a.f230233c, a)) {
                z = true;
            }
            if (!z) {
                mo102888J();
            }
        }
        this.f216749r.stopTimer();
        this.f216751t.stopTimer();
    }

    public void onResume() {
    }

    /* renamed from: p */
    public String mo102898p() {
        C72996z1 z1Var = this.f216735d;
        if (z1Var != null && C72996z1.m85811N4(z1Var.getUsername())) {
            return this.f216734c;
        }
        C72996z1 z1Var2 = this.f216735d;
        if (z1Var2 == null) {
            return null;
        }
        return z1Var2.getUsername();
    }

    /* renamed from: r */
    public void mo102899r(Object obj) {
        SightCaptureResult sightCaptureResult;
        if (obj instanceof C77575r) {
            C77575r rVar = (C77575r) obj;
            int i = rVar.f226147b;
            if (i == -1 && rVar.f226148c == 0) {
                C101783gu2 gu22 = new C101783gu2();
                gu22.f298309e = true;
                gu22.f298308d = false;
                C77574q qVar = rVar.f226149d;
                if (qVar.f226142a == C77576s.Photo) {
                    sightCaptureResult = new SightCaptureResult(true, qVar.f226143b);
                } else {
                    String r = C86013q1.m106457r(qVar.f226143b);
                    String str = qVar.f226143b;
                    sightCaptureResult = new SightCaptureResult(true, str, qVar.f226144c, r, C90193h.m112876d(str), Math.round((((float) qVar.f226145d) * 1.0f) / 1000.0f), gu22);
                }
                RecordMediaReportInfo recordMediaReportInfo = rVar.f226151f;
                if (recordMediaReportInfo != null) {
                    boolean z = ((Integer) recordMediaReportInfo.mo129811b("KEY_ADD_EMOJI_COUNT_INT", 0)).intValue() != 0;
                    boolean z2 = ((Integer) rVar.f226151f.mo129811b("KEY_ADD_TEXT_COUNT_INT", 0)).intValue() != 0;
                    boolean z3 = ((Integer) rVar.f226151f.mo129811b("KEY_SELECT_MUSIC_INT", 0)).intValue() != 0;
                    boolean z4 = z || z2;
                    Log.m105924i("MicroMsg.C2CRecordStrategy", "updateCurrentRecord stickerEdit:" + z4 + " musicEdit:" + z3);
                    if (z4 || z3) {
                        MultiProcessMMKV.getDefault().putInt("key_record_without_edit", 0);
                    } else {
                        MultiProcessMMKV.getDefault().putInt("key_record_without_edit", MultiProcessMMKV.getDefault().getInt("key_record_without_edit", 1) + 1);
                    }
                }
                Intent intent = new Intent();
                String p = mo102898p();
                C101614i<String, ArrayList<C98408n0>> iVar = C98410o0.f288586c;
                sightCaptureResult.f201519i = C98426q0.m127793a(p);
                intent.putExtra("key_req_result", sightCaptureResult);
                this.f216741j.f193286j.onActivityResult(226, rVar.f226147b, intent);
                return;
            }
            this.f216741j.f193286j.onActivityResult(226, i, new Intent());
        }
    }

    public void release() {
    }

    /* renamed from: s */
    public void mo100657s(String str) {
        ((C79394z0) this.f216741j.f193278b.mo102812a(C79394z0.class)).mo102661s(str);
    }

    /* renamed from: t */
    public boolean mo100658t(String str) {
        if (Log.getLogLevel() <= 1) {
            Log.m105918d("MicroMsg.ChattingFooterEventImpl", "onSendTextRequest");
        }
        this.f216741j.mo91542C(true, false, false);
        mo102889K();
        return ((C79394z0) this.f216741j.f193278b.mo102812a(C79394z0.class)).mo102660r0(str);
    }

    /* renamed from: u */
    public void mo100659u(View view, MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() == 1) {
            this.f216741j.mo91542C(true, false, false);
            mo102889K();
        }
    }

    /* renamed from: v */
    public boolean mo100660v(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C76552z.m92081s(str);
        C76546u.xx0().mo107480e();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0100, code lost:
        if (r14.f216741j.mo91565f().isFinishing() == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0102, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010d, code lost:
        if (r14.f216741j.mo91565f().isDestroyed() == false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0110, code lost:
        r14.f216747p = true;
        com.tencent.p014mm.plugin.transvoice.model.C71562c.f207365v.f207366a = true;
        r14.f216749r.startTimer(100);
        r14.f216750s = false;
        r14.f216751t.startTimer(200);
        r14.f216732a.mo100371Q0(r14.f216741j.mo91570k().getHeight());
        r2 = ((zj3.C79362h1) r14.f216741j.f193278b.mo102812a(r1)).mo102325W();
        r2.f215193f = true;
        r2.mo102016s(true);
        r2.mo102005h();
        r14.f216741j.f193286j.enableOptionMenu(false);
        r14.f216741j.f193286j.enableBackMenu(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015b, code lost:
        if (r14.f216733b == null) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015d, code lost:
        com.tencent.p014mm.sdk.platformtools.MMEntryLock.lock("keep_app_silent");
        r14.f216732a.setVoiceReactArea(-1);
        r14.f216733b.mo107322g(mo102898p());
        r14.f216736e = r14.f216733b.mo107315a();
        r14.f216733b.mo107325j(r14.f216745n);
        r14.f216737f.vibrate(50);
        r14.f216741j.mo91540A();
        r14.f216741j.mo91542C(true, false, false);
        r14.f216733b.mo107317c(r14.f216744m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0199, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ChattingFooterEventImpl", "startRecording recorder is null and stop recod");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a1, code lost:
        r14.f216741j.mo91546G(true);
        ((zj3.C79388w0) r14.f216741j.f193278b.mo102812a(r0)).mo102672a4(3);
        ((zj3.C79388w0) r14.f216741j.f193278b.mo102812a(r0)).mo102671Q();
        mo102887H(0);
        ((zj3.C79362h1) r14.f216741j.f193278b.mo102812a(r1)).mo102337j5(r14.f216741j.f193286j, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01d5, code lost:
        return true;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo100661w() {
        /*
            r14 = this;
            java.lang.Class<zj3.w0> r0 = zj3.C79388w0.class
            java.lang.Class<zj3.h1> r1 = zj3.C79362h1.class
            ck3.b r2 = r14.f216741j
            android.app.Activity r2 = r2.mo91565f()
            boolean r2 = p182kk.C61104a.m71669y(r2)
            r3 = 0
            if (r2 != 0) goto L_0x01dc
            ck3.b r2 = r14.f216741j
            android.app.Activity r2 = r2.mo91565f()
            boolean r2 = p182kk.C61104a.m71665u(r2)
            if (r2 != 0) goto L_0x01dc
            ck3.b r2 = r14.f216741j
            android.app.Activity r2 = r2.mo91565f()
            boolean r2 = p182kk.C61104a.m71649e(r2)
            if (r2 == 0) goto L_0x002b
            goto L_0x01dc
        L_0x002b:
            ck3.b r2 = r14.f216741j
            android.app.Activity r2 = r2.mo91565f()
            java.lang.String r4 = "phone"
            java.lang.Object r4 = r2.getSystemService(r4)
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4
            int r5 = r4.getCallState()
            r6 = 2
            r7 = 1
            if (r6 == r5) goto L_0x004a
            int r4 = r4.getCallState()
            if (r7 != r4) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r2 = 0
            goto L_0x0059
        L_0x004a:
            r4 = 2131822959(0x7f11096f, float:1.9278704E38)
            java.lang.String r4 = r2.getString(r4)
            android.widget.Toast r2 = p910lj.C76701a.makeText((android.content.Context) r2, (java.lang.CharSequence) r4, (int) r3)
            r2.show()
            r2 = 1
        L_0x0059:
            if (r2 == 0) goto L_0x0064
            java.lang.String r0 = "MicroMsg.ChattingFooterEventImpl"
            java.lang.String r1 = "system has calling , can't record voice"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            return r3
        L_0x0064:
            ck3.b r2 = r14.f216741j
            android.app.Activity r2 = r2.mo91565f()
            r4 = 0
            boolean r2 = p182kk.C61104a.m71663s(r2, r4)
            if (r2 == 0) goto L_0x0072
            return r3
        L_0x0072:
            eb0.c r2 = eb0.C97625j3.m125812b()
            boolean r2 = r2.mo105883I()
            if (r2 != 0) goto L_0x0095
            ck3.b r0 = r14.f216741j
            android.app.Activity r0 = r0.mo91565f()
            ck3.b r1 = r14.f216741j
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r1.f193286j
            android.view.View r1 = r1.getContentView()
            nj3.C76912y0.m92771j(r0, r1)
            java.lang.String r0 = "MicroMsg.ChattingFooterEventImpl"
            java.lang.String r1 = "onVoiceRcdStartRequest isSDCardAvailable() failed and return."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return r3
        L_0x0095:
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "meizu"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 != 0) goto L_0x00a1
            r2 = 1
            goto L_0x00a7
        L_0x00a1:
            r2 = 27
            boolean r2 = p903ij.C76359b.m91784a(r2)
        L_0x00a7:
            if (r2 != 0) goto L_0x00df
            ck3.b r2 = r14.f216741j
            android.app.Activity r8 = r2.mo91565f()
            ck3.b r2 = r14.f216741j
            android.content.res.Resources r2 = r2.mo91572m()
            r4 = 2131821698(0x7f110482, float:1.9276147E38)
            java.lang.String r9 = r2.getString(r4)
            ck3.b r2 = r14.f216741j
            android.content.res.Resources r2 = r2.mo91572m()
            r4 = 2131821606(0x7f110426, float:1.927596E38)
            java.lang.String r10 = r2.getString(r4)
            ck3.b r2 = r14.f216741j
            android.content.res.Resources r2 = r2.mo91572m()
            r4 = 2131821608(0x7f110428, float:1.9275964E38)
            java.lang.String r11 = r2.getString(r4)
            r12 = 1
            com.tencent.mm.ui.chatting.u1$e r13 = new com.tencent.mm.ui.chatting.u1$e
            r13.<init>()
            nj3.C76879j.m92711E(r8, r9, r10, r11, r12, r13)
        L_0x00df:
            java.lang.Object r2 = r14.f216748q
            monitor-enter(r2)
            r14.f216746o = r3     // Catch:{ all -> 0x01d9 }
            monitor-exit(r2)     // Catch:{ all -> 0x01d9 }
            java.lang.Object r4 = r14.f216748q
            monitor-enter(r4)
            boolean r2 = r14.f216746o     // Catch:{ all -> 0x01d6 }
            if (r2 == 0) goto L_0x00f5
            java.lang.String r0 = "MicroMsg.ChattingFooterEventImpl"
            java.lang.String r1 = "jacks already stop before begin!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r4)     // Catch:{ all -> 0x01d6 }
            return r3
        L_0x00f5:
            monitor-exit(r4)     // Catch:{ all -> 0x01d6 }
            ck3.b r2 = r14.f216741j
            android.app.Activity r2 = r2.mo91565f()
            boolean r2 = r2.isFinishing()
            if (r2 == 0) goto L_0x0103
            return r3
        L_0x0103:
            ck3.b r2 = r14.f216741j
            android.app.Activity r2 = r2.mo91565f()
            boolean r2 = r2.isDestroyed()
            if (r2 == 0) goto L_0x0110
            return r3
        L_0x0110:
            r14.f216747p = r7
            com.tencent.mm.plugin.transvoice.model.c r2 = com.tencent.p014mm.plugin.transvoice.model.C71562c.f207365v
            r2.f207366a = r7
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = r14.f216749r
            r4 = 100
            r2.startTimer(r4)
            r14.f216750s = r3
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = r14.f216751t
            r4 = 200(0xc8, double:9.9E-322)
            r2.startTimer(r4)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r14.f216732a
            ck3.b r4 = r14.f216741j
            com.tencent.mm.pluginsdk.ui.tools.n0 r4 = r4.mo91570k()
            int r4 = r4.getHeight()
            r2.mo100371Q0(r4)
            ck3.b r2 = r14.f216741j
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r1)
            zj3.h1 r2 = (zj3.C79362h1) r2
            com.tencent.mm.ui.chatting.AutoPlay r2 = r2.mo102325W()
            r2.f215193f = r7
            r2.mo102016s(r7)
            r2.mo102005h()
            ck3.b r2 = r14.f216741j
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r2 = r2.f193286j
            r2.enableOptionMenu(r3)
            ck3.b r2 = r14.f216741j
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r2 = r2.f193286j
            r2.enableBackMenu(r3)
            ob0.r r2 = r14.f216733b
            if (r2 == 0) goto L_0x0199
            java.lang.String r2 = "keep_app_silent"
            com.tencent.p014mm.sdk.platformtools.MMEntryLock.lock(r2)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r14.f216732a
            r4 = -1
            r2.setVoiceReactArea(r4)
            ob0.r r2 = r14.f216733b
            java.lang.String r4 = r14.mo102898p()
            r2.mo107322g(r4)
            ob0.r r2 = r14.f216733b
            java.lang.String r2 = r2.mo107315a()
            r14.f216736e = r2
            ob0.r r2 = r14.f216733b
            ob0.r$b r4 = r14.f216745n
            r2.mo107325j(r4)
            android.os.Vibrator r2 = r14.f216737f
            r4 = 50
            r2.vibrate(r4)
            ck3.b r2 = r14.f216741j
            r2.mo91540A()
            ck3.b r2 = r14.f216741j
            r2.mo91542C(r7, r3, r3)
            ob0.r r2 = r14.f216733b
            ob0.r$a r4 = r14.f216744m
            r2.mo107317c(r4)
            goto L_0x01a1
        L_0x0199:
            java.lang.String r2 = "MicroMsg.ChattingFooterEventImpl"
            java.lang.String r4 = "startRecording recorder is null and stop recod"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)
        L_0x01a1:
            ck3.b r2 = r14.f216741j
            r2.mo91546G(r7)
            ck3.b r2 = r14.f216741j
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r0)
            zj3.w0 r2 = (zj3.C79388w0) r2
            r4 = 3
            r2.mo102672a4(r4)
            ck3.b r2 = r14.f216741j
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r0 = r2.mo102812a(r0)
            zj3.w0 r0 = (zj3.C79388w0) r0
            r0.mo102671Q()
            r14.mo102887H(r3)
            ck3.b r0 = r14.f216741j
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r1)
            zj3.h1 r0 = (zj3.C79362h1) r0
            ck3.b r1 = r14.f216741j
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r1.f193286j
            r0.mo102337j5(r1, r7)
            return r7
        L_0x01d6:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01d6 }
            throw r0
        L_0x01d9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01d9 }
            throw r0
        L_0x01dc:
            java.lang.String r0 = "MicroMsg.ChattingFooterEventImpl"
            java.lang.String r1 = "voip is running, can't record voice"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73852u1.mo100661w():boolean");
    }

    /* renamed from: x */
    public void mo100662x() {
        this.f216741j.f193286j.enableOptionMenu(true);
        this.f216741j.f193286j.enableBackMenu(true);
        C77002r rVar = this.f216733b;
        if (rVar != null) {
            rVar.cancel();
            this.f216749r.stopTimer();
            this.f216751t.stopTimer();
        }
        this.f216732a.mo100344C0(ChatFooter$$o1.Cancel);
    }

    /* renamed from: y */
    public void mo100663y(View view) {
        this.f216741j.mo91542C(true, false, false);
        mo102889K();
    }

    /* renamed from: z */
    public void mo100664z(View view) {
        this.f216741j.mo91542C(true, false, false);
        mo102889K();
    }
}
