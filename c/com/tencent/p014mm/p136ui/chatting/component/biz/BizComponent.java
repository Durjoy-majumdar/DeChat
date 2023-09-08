package com.tencent.p014mm.p136ui.chatting.component.biz;

import a11.C39479c;
import aj3.C103374a;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import bd0.C39755e;
import ck3.C67391b;
import com.google.android.gms.common.Scopes;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.plugin.exdevice.ChattingUIExDeviceLogic;
import com.tencent.p014mm.autogen.events.AppMsgRelatedInfoUpdateEvent;
import com.tencent.p014mm.autogen.events.BizFinderLineStatusChangedEvent;
import com.tencent.p014mm.autogen.events.ExDeviceOpInChattingUIEvent;
import com.tencent.p014mm.autogen.events.GetConvEvent;
import com.tencent.p014mm.chatroom.p015ui.ChatroomInfoUI;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.LiveBizSessionTipsBar;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.bizchat.BizChatroomInfoUI;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.chatting.component.C73412a;
import com.tencent.p014mm.p136ui.chatting.component.C73521l0;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1704j3;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$n1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19625p0;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72954a0;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.p0$$f;
import com.tencent.p014mm.storage.p0$$g;
import com.tencent.xweb.file.XVFSFile;
import di0.C86299o;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C97625j3;
import ex0.C45695b;
import f40.C86709a0;
import f62.C75700k0;
import gc2.C116945b;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C9556a;
import ke3.C88144b;
import kr0.C76630x0;
import nj3.C76879j;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import p154fy.C87121j;
import p196ln.C76705f;
import p227rn.C48053v;
import p248ug.C52558c;
import p270xi.C91212b;
import p740wo.C53193b;
import p910lj.C76701a;
import qo3.C77398g;
import rb0.C47961a;
import rb0.C47964c0;
import rb0.C47976j;
import rb0.C47984k;
import rb0.C47989m;
import rb0.C47996o;
import rb0.C47997p;
import rb0.C48001q;
import rb0.C48003r;
import rb0.C48009v0;
import sb0.C48334c;
import sb0.C48335d;
import sb0.C48340e;
import sb0.C48349h;
import sb0.C48352i;
import sb0.C48353j;
import sb0.C48366v;
import sb0.C48368x;
import td0.C22478a;
import te3.C48702af;
import te3.C52054y14;
import te3.C52251ze;
import tv2.C14096e;
import zj3.C79343c0;
import zj3.C79348e;
import zj3.C79361h0;
import zj3.C79368l;
import zj3.C79387w;
import zt3.C119157j;

@C91212b(exportInterface = C79348e.class)
/* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent */
public class BizComponent extends C73412a implements C79348e, C47964c0, MStorageEx.IOnStorageChange {

    /* renamed from: A */
    public final C44804m f121555A = new C44791a();

    /* renamed from: B */
    public final ChatFooter$$n1 f121556B = new C44798h();

    /* renamed from: C */
    public boolean f121557C = false;

    /* renamed from: D */
    public C48335d.C48337b f121558D = new C44799i();

    /* renamed from: E */
    public boolean f121559E = false;

    /* renamed from: F */
    public boolean f121560F = false;

    /* renamed from: G */
    public C47976j.C47978b f121561G = new C44800j();

    /* renamed from: H */
    public IListener f121562H = new IListener<AppMsgRelatedInfoUpdateEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1315546616;
        }

        public boolean callback(IEvent iEvent) {
            Log.m105925i("MicroMsg.ChattingUI.BizComponent", "AppMsgRelatedInfoUpdateEvent scene %d", Integer.valueOf(((AppMsgRelatedInfoUpdateEvent) iEvent).f107364d.f107365a));
            BizComponent.this.f215752d.mo91540A();
            return false;
        }
    };

    /* renamed from: I */
    public boolean f121563I = false;

    /* renamed from: e */
    public ChattingUIExDeviceLogic f121564e;

    /* renamed from: f */
    public C48334c f121565f;

    /* renamed from: g */
    public C48353j f121566g;

    /* renamed from: h */
    public C52558c f121567h;

    /* renamed from: i */
    public LiveBizSessionTipsBar f121568i = null;

    /* renamed from: j */
    public C45695b f121569j = null;

    /* renamed from: n */
    public IListener f121570n = null;

    /* renamed from: o */
    public long f121571o = 0;

    /* renamed from: p */
    public C72963f4 f121572p;

    /* renamed from: q */
    public boolean f121573q = false;

    /* renamed from: r */
    public boolean f121574r = false;

    /* renamed from: s */
    public boolean f121575s = false;

    /* renamed from: t */
    public boolean f121576t = false;

    /* renamed from: u */
    public long f121577u = -1;

    /* renamed from: v */
    public RelativeLayout f121578v;

    /* renamed from: w */
    public TextView f121579w;

    /* renamed from: x */
    public C77398g f121580x = null;

    /* renamed from: y */
    public int f121581y;

    /* renamed from: z */
    public C52054y14 f121582z = null;

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$BizFinderLineStatusChangedEventListenerImpl */
    public static class BizFinderLineStatusChangedEventListenerImpl extends IListener<BizFinderLineStatusChangedEvent> {

        /* renamed from: d */
        public WeakReference<BizComponent> f121584d;

        public BizFinderLineStatusChangedEventListenerImpl(BizComponent bizComponent) {
            super(C40008f.f107254d);
            this.f121584d = new WeakReference<>(bizComponent);
            this.__eventId = -1230141771;
        }

        public boolean callback(IEvent iEvent) {
            BizFinderLineStatusChangedEvent bizFinderLineStatusChangedEvent = (BizFinderLineStatusChangedEvent) iEvent;
            WeakReference<BizComponent> weakReference = this.f121584d;
            if (weakReference == null || weakReference.get() == null) {
                return false;
            }
            Log.m105924i("MicroMsg.ChattingUI.BizComponent", "callback");
            BizFinderLineStatusChangedEvent.C40040a aVar = bizFinderLineStatusChangedEvent.f107369d;
            this.f121584d.get().mo70063c6(aVar.f107370a, !Util.isNullOrNil(aVar.f107371b));
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$a */
    public class C44791a implements C44804m {

        /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$a$a */
        public class C44792a implements Runnable {
            public C44792a() {
            }

            public void run() {
                RelativeLayout relativeLayout = BizComponent.this.f121578v;
                if (!(relativeLayout == null || relativeLayout.getVisibility() == 8)) {
                    BizComponent.this.f121578v.setVisibility(8);
                }
                C67391b bVar = BizComponent.this.f215752d;
                if (bVar == null) {
                    Log.m105920e("MicroMsg.ChattingUI.BizComponent", "[onProcecssClick] mChattingContext is null!");
                    return;
                }
                ((C79343c0) bVar.f193278b.mo102812a(C79343c0.class)).mo102611a();
                BizComponent.this.f215752d.mo91540A();
            }
        }

        public C44791a() {
        }

        /* renamed from: a */
        public boolean mo70081a() {
            BizComponent bizComponent = BizComponent.this;
            if (bizComponent.f121578v == null) {
                C73521l0.m86927d(bizComponent.f215752d.f193286j, C0966R.C0970id.l8w);
                BizComponent bizComponent2 = BizComponent.this;
                bizComponent2.f121578v = (RelativeLayout) bizComponent2.f215752d.mo91562c(C0966R.C0970id.afj);
                BizComponent bizComponent3 = BizComponent.this;
                bizComponent3.f121579w = (TextView) bizComponent3.f215752d.mo91562c(C0966R.C0970id.afk);
                BizComponent.this.f121579w.setText(C0966R.string.b5d);
            }
            BizComponent.this.f121578v.setVisibility(0);
            BizComponent.this.f215752d.mo91571l().postDelayed(new C44792a(), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$b */
    public class C44793b implements Runnable {
        public C44793b() {
        }

        public void run() {
            C67391b bVar = BizComponent.this.f215752d;
            if (bVar != null) {
                boolean v1 = ((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108213v1();
                BizComponent bizComponent = BizComponent.this;
                if (bizComponent.f121573q && !v1) {
                    C48340e.m53670k(bizComponent.f121565f);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$c */
    public class C44794c implements DialogInterface.OnClickListener {
        public C44794c(BizComponent bizComponent) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$d */
    public class C44795d implements DialogInterface.OnClickListener {
        public C44795d(BizComponent bizComponent) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$e */
    public class C44796e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ LinkedList f121588d;

        public C44796e(LinkedList linkedList) {
            this.f121588d = linkedList;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C48702af afVar = new C48702af();
            for (int i2 = 0; i2 < this.f121588d.size(); i2++) {
                C52251ze zeVar = new C52251ze();
                zeVar.f145847d = (String) this.f121588d.get(i2);
                afVar.f130476d.add(zeVar);
            }
            BizComponent bizComponent = BizComponent.this;
            bizComponent.getClass();
            Log.m105924i("MicroMsg.ChattingUI.BizComponent", "updateBizChatMemberList()");
            String string = bizComponent.f215752d.mo91572m().getString(C0966R.string.i64);
            C48349h yx02 = C48009v0.yx0();
            C48334c cVar = bizComponent.f121565f;
            String str = cVar.field_brandUserName;
            String str2 = cVar.field_bizChatServId;
            yx02.getClass();
            C48368x xVar = new C48368x(str, str2, (C48702af) null, afVar, bizComponent);
            C86709a0.m107529k().f251779b.mo123460f(xVar);
            C67391b bVar = bizComponent.f215752d;
            bVar.mo91552M(bVar.mo91565f(), bizComponent.f215752d.mo91572m().getString(C0966R.string.a3h), string, true, true, new C44806a(bizComponent, xVar));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$f */
    public class C44797f implements DialogInterface.OnClickListener {
        public C44797f(BizComponent bizComponent) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$h */
    public class C44798h implements ChatFooter$$n1 {
        public C44798h() {
        }

        /* renamed from: a */
        public boolean mo70088a(boolean z) {
            C52558c.C52560b r2;
            C52558c.C52560b.C52563c c;
            List<C47996o> list;
            C52558c cVar = BizComponent.this.f121567h;
            if (!(cVar == null || (r2 = cVar.mo73500r2(false)) == null || (c = r2.mo73510c()) == null || (list = c.f146826b) == null || list.isEmpty())) {
                try {
                    JSONObject jSONObject = new JSONObject(c.f146826b.get(0).f128725e);
                    AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                    appBrandStatObject.f245533f = C1704j3.CTRL_INDEX;
                    appBrandStatObject.f245534g = BizComponent.this.f121567h.field_username;
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).Rg0(MMApplicationContext.getContext(), jSONObject.optString("userName"), (String) null, 0, 0, jSONObject.optString("pagePath"), appBrandStatObject, BizComponent.this.f121567h.field_appId);
                    return true;
                } catch (JSONException unused) {
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$i */
    public class C44799i implements C48335d.C48337b {
        public C44799i() {
        }

        /* renamed from: a */
        public void mo69970a(C48335d.C48337b.C48339b bVar) {
            Class cls = C79343c0.class;
            BizComponent bizComponent = BizComponent.this;
            if (bizComponent.f121573q && bVar != null && bVar.f129424b == bizComponent.mo70068i4()) {
                BizComponent bizComponent2 = BizComponent.this;
                if (!bizComponent2.f215752d.f193283g) {
                    Log.m105924i("MicroMsg.ChattingUI.BizComponent", "onNotifyChange fragment not foreground, return");
                } else if (bVar.f129423a != C48335d.C48337b.C48338a.DELETE) {
                    Log.m105924i("MicroMsg.ChattingUI.BizComponent", "bizChatExtension bizChat change");
                    C48334c a0 = C48009v0.Ax0().mo73042a0(BizComponent.this.mo70068i4());
                    BizComponent bizComponent3 = BizComponent.this;
                    bizComponent3.f121565f = a0;
                    if (!bizComponent3.f121574r) {
                        C48353j jVar = C48009v0.Bx0().get(BizComponent.this.f121565f.field_bizChatServId);
                        if (jVar != null) {
                            BizComponent.this.f121566g = jVar;
                        }
                    } else {
                        bizComponent3.f121563I = C48340e.m53676q(a0);
                        ((C79343c0) BizComponent.this.f215752d.f193278b.mo102812a(cls)).mo102628n3();
                    }
                    ((C79343c0) BizComponent.this.f215752d.f193278b.mo102812a(cls)).mo102611a();
                } else if (bizComponent2.f121574r) {
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) BizComponent.this.f215752d.mo91572m().getString(C0966R.string.i6n), 1).show();
                    BizComponent.this.f215752d.mo91563d();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$j */
    public class C44800j implements C47976j.C47978b {

        /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$j$a */
        public class C44801a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C47976j.C47978b.C47980b f121593d;

            /* renamed from: e */
            public final /* synthetic */ C72996z1 f121594e;

            public C44801a(C47976j.C47978b.C47980b bVar, C72996z1 z1Var) {
                this.f121593d = bVar;
                this.f121594e = z1Var;
            }

            public void run() {
                BizComponent.this.f215752d.mo91558S();
                BizComponent bizComponent = BizComponent.this;
                if (bizComponent.f121559E && this.f121593d.f128691b.equals(bizComponent.f215752d.mo91577r())) {
                    Log.m105924i("MicroMsg.ChattingUI.BizComponent", "try to refresh footer.");
                    BizComponent.this.f121567h = C47984k.m53328b(this.f121593d.f128691b);
                    BizComponent bizComponent2 = BizComponent.this;
                    C67391b bVar = bizComponent2.f215752d;
                    if (bVar != null && bizComponent2.f121560F) {
                        ((C79387w) bVar.f193278b.mo102812a(C79387w.class)).mo102177B2(this.f121594e);
                    }
                }
            }
        }

        public C44800j() {
        }

        /* renamed from: m5 */
        public void mo70089m5(C47976j.C47978b.C47980b bVar) {
            String str;
            if (bVar != null && bVar.f128690a == C47976j.C47978b.C47979a.UPDATE && (str = bVar.f128691b) != null && str.equals(BizComponent.this.f215752d.mo91577r())) {
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(bVar.f128691b);
                if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
                    Log.m105925i("MicroMsg.ChattingUI.BizComponent", "Get contact from db return null.(username : %s)", bVar.f128691b);
                    return;
                }
                MMHandlerThread.postToMainThread(new C44801a(bVar, z1Var));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$k */
    public class C44802k implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f121596d;

        public C44802k(boolean z) {
            this.f121596d = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C52558c cVar = BizComponent.this.f121567h;
            cVar.field_hadAlert = 1;
            if (cVar != null) {
                cVar.field_brandFlag |= 4;
                C47984k.m53342p(cVar);
            }
            if (this.f121596d) {
                Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                BaseChattingUIFragment baseChattingUIFragment = BizComponent.this.f215752d.f193286j;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                BaseChattingUIFragment baseChattingUIFragment2 = baseChattingUIFragment;
                C117292a.m165358d(baseChattingUIFragment2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/biz/BizComponent$8", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                baseChattingUIFragment.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(baseChattingUIFragment2, "com/tencent/mm/ui/chatting/component/biz/BizComponent$8", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            C48009v0.Cx0().mo72791d(BizComponent.this.f215752d.mo91577r());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$l */
    public class C44803l implements DialogInterface.OnClickListener {
        public C44803l() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C52558c cVar = BizComponent.this.f121567h;
            cVar.field_hadAlert = 1;
            if (cVar != null) {
                cVar.field_brandFlag &= -5;
                C47984k.m53342p(cVar);
            }
            C48009v0.Cx0().mo72791d(BizComponent.this.f215752d.mo91577r());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$m */
    public interface C44804m {
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.BizComponent$g */
    public class C44805g implements Runnable {
        public C44805g() {
        }

        public void run() {
            BizComponent bizComponent = BizComponent.this;
            Class cls = C76705f.class;
            C52558c cVar = bizComponent.f121567h;
            if (cVar == null) {
                Log.m105924i("MicroMsg.ChattingUI.BizComponent", "bizInfo is null");
                return;
            }
            boolean z = true;
            if (!cVar.mo73506x2()) {
                Log.m105925i("MicroMsg.ChattingUI.BizComponent", "bizInfo is not serviceType: %d", Integer.valueOf(bizComponent.f121567h.field_type));
            } else if (bizComponent.f215752d.mo91574o() == null || bizComponent.f215752d.mo91574o().getUsername() == null) {
                Log.m105924i("MicroMsg.ChattingUI.BizComponent", "talker or username is null");
            } else {
                String username = bizComponent.f215752d.mo91574o().getUsername();
                if (!username.equals(bizComponent.f121567h.field_username)) {
                    Log.m105925i("MicroMsg.ChattingUI.BizComponent", "biz username is not equal chatting talker: %s", username);
                } else if (C45628s0.m50770e(username)) {
                    Log.m105925i("MicroMsg.ChattingUI.BizComponent", "in whitelist, talker: %s", username);
                } else {
                    LauncherUI instance = LauncherUI.getInstance();
                    if (instance == null) {
                        Log.m105924i("MicroMsg.ChattingUI.BizComponent", "launcherUI is null");
                        return;
                    }
                    Log.m105924i("MicroMsg.ChattingUI.BizComponent", "showBottomSheet");
                    MultiProcessMMKV.getMMKV("biz_mute_guide_config_" + C75592q0.m90789s()).putLong("biz_mute_guide_show_time", C31543z5.m39451a());
                    C73446n nVar = new C73446n(instance);
                    LayoutInflater.from(nVar.f215822f.getContext()).inflate(C0966R.C0971layout.crw, (LinearLayout) nVar.f215822f.findViewById(C0966R.C0970id.ahc), true);
                    ImageView imageView = (ImageView) nVar.f215822f.findViewById(C0966R.C0970id.mat);
                    ImageView imageView2 = (ImageView) nVar.f215822f.findViewById(C0966R.C0970id.jyy);
                    FrameLayout frameLayout = (FrameLayout) nVar.f215822f.findViewById(C0966R.C0970id.b6l);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new C44809d(bizComponent));
                    imageView.setClickable(false);
                    imageView.setLongClickable(false);
                    imageView2.setClickable(false);
                    imageView2.setLongClickable(false);
                    ((C76705f) C86312j.m106911c(cls)).mo106849z(imageView, username);
                    ((C76705f) C86312j.m106911c(cls)).mo106849z(imageView2, username);
                    C103374a.m137034a((ImageView) nVar.f215822f.findViewById(C0966R.C0970id.mas)).mo143284g(1000).mo143282e(450).mo143280c(0.625f).mo143281d(0.625f).mo143285h(new C73438e(bizComponent, (TextView) nVar.f215822f.findViewById(C0966R.C0970id.kmv))).mo143286i();
                    GetConvEvent getConvEvent = new GetConvEvent();
                    GetConvEvent.C40118a aVar = getConvEvent.f107586d;
                    aVar.f107590c = 1;
                    aVar.f107588a = new C73439f(bizComponent, username, nVar);
                    getConvEvent.publish();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(username);
                    nVar.f215822f.findViewById(C0966R.C0970id.f357516m82).setOnClickListener(new C44810i(bizComponent, instance, arrayList, nVar));
                    nVar.f215823g = nVar.mo102395a();
                    Context context = nVar.f215821e;
                    nVar.f215824h = context instanceof Activity ? ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
                    if (nVar.f215820d != null) {
                        ((ViewGroup) nVar.f215822f.getParent()).setVisibility(0);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) nVar.f215822f.getLayoutParams();
                        if (nVar.f215823g && nVar.f215825i != null) {
                            Rect rect = new Rect();
                            nVar.f215825i.getWindowVisibleDisplayFrame(rect);
                            layoutParams.width = rect.right;
                        }
                        nVar.f215822f.setLayoutParams(layoutParams);
                        nVar.f215820d.getWindow().addFlags(Integer.MIN_VALUE);
                        nVar.f215820d.getWindow().clearFlags(8);
                        nVar.f215820d.getWindow().clearFlags(131072);
                        nVar.f215820d.getWindow().clearFlags(128);
                        nVar.f215820d.getWindow().getDecorView().setSystemUiVisibility(0);
                        View view = nVar.f215825i;
                        if (view != null) {
                            if (nVar.f215826j != null) {
                                z = false;
                            }
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            nVar.f215826j = viewTreeObserver;
                            if (z) {
                                viewTreeObserver.addOnGlobalLayoutListener(nVar);
                            }
                        }
                        Context context2 = nVar.f215821e;
                        if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
                            nVar.f215820d.show();
                        }
                        BottomSheetBehavior bottomSheetBehavior = nVar.f215827n;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.f309230p = false;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: B3 */
    public List<C72963f4> mo70049B3() {
        int i = C48009v0.Dx0().mo73024Yt(mo70068i4()).field_unReadCount;
        if (i > 100) {
            i = 100;
        }
        C72954a0 l = C97625j3.m125812b().mo105897l();
        String username = this.f215752d.mo91574o().getUsername();
        long i4 = mo70068i4();
        l.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = l.mo100940c().rawQuery("SELECT * FROM " + l.mo100941e(username) + " WHERE" + l.mo100928l(username, i4) + "AND " + "isSend" + " = " + 0 + " ORDER BY " + "createTime" + " DESC LIMIT " + i, (String[]) null);
        if (rawQuery.moveToFirst()) {
            while (!rawQuery.isAfterLast()) {
                C72963f4 f4Var = new C72963f4();
                f4Var.convertFrom(rawQuery);
                rawQuery.moveToNext();
                if (f4Var.mo100993e4()) {
                    arrayList.add(f4Var);
                }
            }
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: F1 */
    public boolean mo70050F1() {
        boolean z;
        Intent intent = new Intent(this.f215752d.mo91565f(), ChatroomInfoUI.class);
        boolean z2 = this.f215752d.mo91582w() || this.f121574r;
        boolean z3 = C72996z1.m85820U5(this.f215752d.mo91577r()) && ((C39479c) C86709a0.m107533q(C39479c.class)).mo62086r1(this.f215752d.mo91577r());
        boolean z4 = C72996z1.m85820U5(this.f215752d.mo91577r()) && !((C53193b) C86312j.m106911c(C53193b.class)).i90(this.f215752d.mo91577r());
        Log.m105924i("MicroMsg.ChattingUI.BizComponent", "isChatroomDismiss = " + z3 + ", inChatRoom = " + z4);
        if ((z2 && !this.f121573q) || z3 || z4) {
            intent.putExtra("Chat_User", this.f215752d.mo91574o().getUsername());
            intent.putExtra("RoomInfo_Id", this.f215752d.mo91577r());
            intent.putExtra("Is_Chatroom", this.f215752d.mo91582w());
            intent.putExtra("fromChatting", true);
            C67391b bVar = this.f215752d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C67391b bVar2 = bVar;
            C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/biz/BizComponent", "doRightBtnClick", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            bVar.mo91556Q((Intent) aVar.mo10231a(0));
            C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/component/biz/BizComponent", "doRightBtnClick", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (this.f121573q) {
            intent.setClass(this.f215752d.mo91565f(), BizChatroomInfoUI.class);
            intent.putExtra("Chat_User", this.f215752d.mo91574o().getUsername());
            intent.putExtra("key_biz_chat_id", mo70068i4());
            if (this.f215752d.f193286j.thisActivity() instanceof ChattingUI) {
                intent.putExtra("key_biz_chat_info_from_scene", 1);
            } else {
                intent.putExtra("key_biz_chat_info_from_scene", 2);
            }
            BaseChattingUIFragment baseChattingUIFragment = this.f215752d.f193286j;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            BaseChattingUIFragment baseChattingUIFragment2 = baseChattingUIFragment;
            C117292a.m165358d(baseChattingUIFragment2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/component/biz/BizComponent", "doRightBtnClick", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            baseChattingUIFragment.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(baseChattingUIFragment2, "com/tencent/mm/ui/chatting/component/biz/BizComponent", "doRightBtnClick", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (!C72996z1.m85855z5(this.f215752d.mo91577r()) && !C72996z1.m85798E5(this.f215752d.mo91577r()) && !C72996z1.m85848s5(this.f215752d.mo91577r()) && !C72996z1.m85811N4(this.f215752d.mo91577r()) && !this.f215752d.mo91574o().mo62916m3()) {
            return false;
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("Contact_User", this.f215752d.mo91577r());
            if (this.f215752d.f193286j.getIntExtra("chat_from_scene", 0) == 2) {
                intent2.putExtra("Kdel_from", 2);
            } else {
                intent2.putExtra("Kdel_from", 0);
            }
            intent2.putExtra("chat_from_scene", this.f215752d.f193286j.getIntExtra("chat_from_scene", 0));
            intent2.putExtra("preUsername", this.f215752d.mo91577r());
            intent2.putExtra("preChatName", this.f215752d.mo91577r());
            C52558c cVar = this.f121567h;
            intent2.putExtra("preChatTYPE", this.f215752d.f193286j.getIntExtra("preChatTYPE", (cVar == null || !cVar.mo73506x2()) ? 7 : 6));
            Intent intent3 = this.f215752d.mo91565f().getIntent();
            int intExtra = intent3.getIntExtra("key_temp_session_scene", 5);
            if (intExtra == 16 || intExtra == 17 || intent3.getBooleanExtra("key_biz_profile_stay_after_follow_op", false)) {
                intent2.putExtra("Kdel_from", 1);
                z = true;
            } else {
                z = false;
            }
            intent2.putExtra("key_biz_profile_stay_after_follow_op", z);
            if (((C79361h0) this.f215752d.f193278b.mo102812a(C79361h0.class)).mo102468o1() && C73521l0.m86928e(this.f215752d.mo91577r())) {
                if (intExtra == 16) {
                    intent2.putExtra("Contact_Scene", 92);
                } else if (intExtra == 17) {
                    intent2.putExtra("Contact_Scene", 93);
                } else if (intExtra == 18) {
                    intent2.putExtra("Contact_Scene", 94);
                } else {
                    intent2.putExtra("Contact_Scene", 81);
                }
            }
            if (this.f215752d.mo91577r().equals("gh_43f2581f6fd6")) {
                C14096e.m13447a(2);
                if (C116945b.wx0().mo175755d(3)) {
                    C116945b.yx0().mo175766e(3, true);
                    intent2.putExtra("key_from_wesport_right_newtips", true);
                }
            }
            intent2.putExtra("KOpenArticleSceneFromScene", 0);
            C88144b.m109795m(this.f215752d.f193286j.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent2, 213);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        r1 = r1.mo73500r2(false);
     */
    /* renamed from: F4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26186F4() {
        /*
            r11 = this;
            r0 = 1
            r11.f121560F = r0
            ck3.b r1 = r11.f215752d
            java.lang.Class<zj3.h0> r2 = zj3.C79361h0.class
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r2)
            zj3.h0 r1 = (zj3.C79361h0) r1
            boolean r1 = r1.mo102468o1()
            java.lang.String r2 = "bizflag"
            eb0.C75569c4.m90661G(r2, r0, r1)
            com.tencent.mm.pluginsdk.model.d r1 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            rx3.g r2 = com.tencent.p014mm.pluginsdk.model.C19428d.f54866k
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.String r3 = "MicroMsg.ChattingUI.BizComponent"
            if (r2 == 0) goto L_0x0070
            com.tencent.mm.ui.LiveBizSessionTipsBar r2 = r11.f121568i
            if (r2 == 0) goto L_0x0039
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0039
            r1.mo25151D()
        L_0x0039:
            ck3.b r1 = r11.f215752d
            java.lang.String r1 = r1.mo91577r()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x004b
            java.lang.String r1 = "startCheck fail bizUserName is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            goto L_0x0070
        L_0x004b:
            ck3.b r2 = r11.f215752d
            com.tencent.mm.storage.z1 r2 = r2.mo91574o()
            boolean r2 = r2.mo62916m3()
            if (r2 != 0) goto L_0x0058
            goto L_0x0070
        L_0x0058:
            ex0.b r2 = r11.f121569j
            if (r2 != 0) goto L_0x006b
            java.lang.Class<ex0.d> r2 = ex0.C45696d.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            ex0.d r2 = (ex0.C45696d) r2
            r4 = 4
            ex0.b r2 = r2.F60(r4)
            r11.f121569j = r2
        L_0x006b:
            ex0.b r2 = r11.f121569j
            r2.mo69386a(r1)
        L_0x0070:
            ug.c r1 = r11.f121567h
            r2 = 0
            if (r1 == 0) goto L_0x007c
            boolean r1 = com.tencent.p014mm.app.plugin.exdevice.ChattingUIExDeviceLogic.m43121a(r1)
            if (r1 != 0) goto L_0x007c
            goto L_0x0092
        L_0x007c:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r4 = r11.mo70056V3()
            r1[r2] = r4
            java.lang.String r4 = "hardevice brand account, onresume: %s, notify switch view enter chattingui"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic r1 = r11.f121564e
            if (r1 == 0) goto L_0x0092
            ug.c r3 = r11.f121567h
            r1.mo62721b(r0, r3)
        L_0x0092:
            ug.c r1 = r11.f121567h
            if (r1 != 0) goto L_0x0097
            goto L_0x00a5
        L_0x0097:
            ug.c$b r1 = r1.mo73500r2(r2)
            if (r1 == 0) goto L_0x00a5
            boolean r1 = r1.mo73524q()
            if (r1 == 0) goto L_0x00a5
            r1 = 1
            goto L_0x00a6
        L_0x00a5:
            r1 = 0
        L_0x00a6:
            if (r1 == 0) goto L_0x00b4
            com.tencent.mm.sdk.platformtools.MMHandlerThread r1 = f40.C86709a0.m107525e()
            com.tencent.mm.ui.chatting.component.biz.j r3 = new com.tencent.mm.ui.chatting.component.biz.j
            r3.<init>(r11)
            r1.postToWorker(r3)
        L_0x00b4:
            ck3.b r1 = r11.f215752d
            com.tencent.mm.storage.z1 r1 = r1.mo91574o()
            boolean r1 = r1.mo62927s3()
            if (r1 == 0) goto L_0x0219
            ck3.b r1 = r11.f215752d
            com.tencent.mm.storage.z1 r1 = r1.mo91574o()
            boolean r1 = r1.mo62916m3()
            if (r1 == 0) goto L_0x0219
            ug.c r1 = r11.f121567h
            if (r1 == 0) goto L_0x0219
            ug.c$b r1 = r1.mo73500r2(r2)
            if (r1 == 0) goto L_0x01c5
            boolean r1 = r1.mo73525r()
            if (r1 == 0) goto L_0x01c5
            ug.c r1 = r11.f121567h
            int r1 = r1.field_hadAlert
            if (r1 != 0) goto L_0x01b8
            ck3.b r1 = r11.f215752d
            android.app.Activity r1 = r1.mo91565f()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.Object[] r3 = new java.lang.Object[r0]
            ck3.b r4 = r11.f215752d
            com.tencent.mm.storage.z1 r4 = r4.mo91574o()
            java.lang.String r4 = r4.mo62898f()
            r3[r2] = r4
            r4 = 2131823438(0x7f110b4e, float:1.9279676E38)
            java.lang.String r1 = r1.getString(r4, r3)
            ck3.b r3 = r11.f215752d
            android.app.Activity r3 = r3.mo91565f()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131823439(0x7f110b4f, float:1.9279678E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.String r5 = "<sysmsg type=\""
            r4.append(r5)
            java.lang.String r5 = "reportbizlocation"
            r4.append(r5)
            java.lang.String r6 = "\">"
            r4.append(r6)
            java.lang.String r6 = "<"
            r4.append(r6)
            r4.append(r5)
            java.lang.String r6 = ">"
            r4.append(r6)
            java.lang.String r7 = "<text>"
            r4.append(r7)
            java.lang.String r8 = "<![CDATA["
            r4.append(r8)
            r4.append(r1)
            java.lang.String r1 = "]]>"
            r4.append(r1)
            java.lang.String r9 = "</text>"
            r4.append(r9)
            java.lang.String r10 = "<link>"
            r4.append(r10)
            java.lang.String r10 = "<scene>"
            r4.append(r10)
            r4.append(r5)
            java.lang.String r10 = "</scene>"
            r4.append(r10)
            r4.append(r7)
            r4.append(r8)
            r4.append(r3)
            r4.append(r1)
            r4.append(r9)
            java.lang.String r1 = "</link>"
            r4.append(r1)
            java.lang.String r1 = "</"
            r4.append(r1)
            r4.append(r5)
            r4.append(r6)
            java.lang.String r1 = "</sysmsg>"
            r4.append(r1)
            com.tencent.mm.storage.f4 r1 = new com.tencent.mm.storage.f4
            r1.<init>()
            ck3.b r3 = r11.f215752d
            java.lang.String r3 = r3.mo91577r()
            r1.mo108749c3(r3)
            r3 = 2
            r1.mo108740T2(r3)
            r3 = 10002(0x2712, float:1.4016E-41)
            r1.setType(r3)
            long r5 = eb0.C75604z3.m90844p()
            r1.mo108733M2(r5)
            java.lang.String r3 = r4.toString()
            r1.mo108732L2(r3)
            eb0.C75604z3.m90852x(r1)
            ug.c r1 = r11.f121567h
            r1.field_hadAlert = r0
            rb0.j r1 = rb0.C48009v0.Fx0()
            ug.c r3 = r11.f121567h
            java.lang.String[] r4 = new java.lang.String[r2]
            r1.update(r3, (java.lang.String[]) r4)
            goto L_0x01c5
        L_0x01b8:
            rb0.p r1 = rb0.C48009v0.Cx0()
            ck3.b r3 = r11.f215752d
            java.lang.String r3 = r3.mo91577r()
            r1.mo72791d(r3)
        L_0x01c5:
            ug.c r1 = r11.f121567h
            boolean r1 = r1.mo72809G1()
            if (r1 == 0) goto L_0x0207
            ck3.b r1 = r11.f215752d
            com.tencent.mm.storage.z1 r1 = r1.mo91574o()
            boolean r1 = r1.mo62916m3()
            if (r1 == 0) goto L_0x01df
            boolean r1 = rb0.C47961a.m53282a()
            if (r1 != 0) goto L_0x0207
        L_0x01df:
            eb0.w2 r1 = eb0.C31519v2.m39436a()
            ck3.b r3 = r11.f215752d
            com.tencent.mm.storage.z1 r3 = r3.mo91574o()
            java.lang.String r3 = r3.getUsername()
            java.lang.String r4 = ""
            r1.mo55987c(r3, r4)
            java.lang.Class<ln.i> r1 = p196ln.C76708i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ln.i r1 = (p196ln.C76708i) r1
            ck3.b r3 = r11.f215752d
            com.tencent.mm.storage.z1 r3 = r3.mo91574o()
            java.lang.String r3 = r3.getUsername()
            r1.mo106823Jc(r3)
        L_0x0207:
            ug.c r1 = r11.f121567h
            int r3 = r1.field_status
            if (r3 != r0) goto L_0x0249
            r1.field_status = r2
            rb0.j r0 = rb0.C48009v0.Fx0()
            ug.c r1 = r11.f121567h
            r0.replace(r1)
            goto L_0x0249
        L_0x0219:
            ck3.b r0 = r11.f215752d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f193286j
            java.lang.String r1 = "key_has_add_contact"
            java.lang.Boolean r0 = r0.getBooleanExtra(r1, r2)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0249
            ck3.b r0 = r11.f215752d
            com.tencent.mm.storage.z1 r0 = r0.mo91574o()
            boolean r0 = r0.mo62927s3()
            if (r0 != 0) goto L_0x0249
            ck3.b r0 = r11.f215752d
            com.tencent.mm.storage.z1 r0 = r0.mo91574o()
            boolean r0 = r0.mo62916m3()
            if (r0 == 0) goto L_0x0249
            com.tencent.mm.ui.chatting.component.biz.k r0 = new com.tencent.mm.ui.chatting.component.biz.k
            r0.<init>(r11)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
        L_0x0249:
            r11.mo70069l1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.biz.BizComponent.mo26186F4():void");
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        this.f121560F = false;
        if (this.f215752d.mo91574o().mo62927s3() && this.f215752d.mo91574o().mo62916m3() && this.f121567h != null) {
            C48009v0.Cx0().mo72792e();
            C77398g gVar = this.f121580x;
            if (gVar != null) {
                gVar.dismiss();
            }
        }
        C22478a.C22482a aVar = C22478a.f63656d;
        Log.m105924i("MicroMsg.BaseSubscribeMsgService", "alvinluo clearNotifyCallback");
        C22478a.f63657e.clear();
        C45695b bVar = this.f121569j;
        if (bVar != null) {
            bVar.stopCheck();
        }
    }

    /* renamed from: K4 */
    public C44804m mo70051K4() {
        return this.f121555A;
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
        ChattingUIExDeviceLogic chattingUIExDeviceLogic;
        if (i == 12001 && (chattingUIExDeviceLogic = this.f121564e) != null) {
            C67391b bVar = chattingUIExDeviceLogic.f107332a;
            if (bVar == null) {
                Log.m105920e("MicroMsg.exdevice.ChattingUIExDeviceLogic", "context is null, maybe has been released");
            } else if (i2 == -1) {
                C76701a.makeText((Context) bVar.mo91565f(), (int) C0966R.string.ceh, 0).show();
                ExDeviceOpInChattingUIEvent exDeviceOpInChattingUIEvent = new ExDeviceOpInChattingUIEvent();
                ExDeviceOpInChattingUIEvent.C40076a aVar = exDeviceOpInChattingUIEvent.f107475d;
                aVar.f107476a = 0;
                aVar.f107477b = chattingUIExDeviceLogic.f107332a.mo91577r();
                exDeviceOpInChattingUIEvent.f107475d.f107478c = chattingUIExDeviceLogic.f107332a.mo91565f();
                exDeviceOpInChattingUIEvent.publish();
            } else if (i2 == 0) {
                C76701a.makeText((Context) bVar.mo91565f(), (int) C0966R.string.ceg, 0).show();
            }
        }
    }

    /* renamed from: O */
    public String mo70053O(String str) {
        C48353j m2 = this.f121565f.mo73034m2(str);
        if (m2 != null) {
            return m2.field_headImageUrl;
        }
        return null;
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        this.f121571o = System.currentTimeMillis();
        C79368l lVar = (C79368l) this.f215752d.f193278b.mo102812a(C79368l.class);
        this.f121572p = lVar.getCount() > 0 ? lVar.getItem(lVar.getCount() - 1) : null;
        C19636w0.f55624a = this.f215752d.mo91577r();
        if (this.f121573q) {
            Log.m105918d("MicroMsg.ChattingUI.BizComponent", "getBizChatInfo");
            boolean z = this.f121573q;
            boolean z2 = this.f121574r;
            C86709a0.m107525e().postToWorkerDelayed(new C44807b(this, z, this.f121565f, this.f215752d.mo91574o(), this.f215752d.mo91577r(), z2), 500);
        }
        C86709a0.m107528h();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this);
        mo70061b6();
        this.f121562H.alive();
        this.f121577u = this.f215752d.f193286j.getLongExtra("key_biz_chat_id", -1);
        if (ChattingUIExDeviceLogic.m43121a(this.f121567h) && this.f121564e == null) {
            Log.m105925i("MicroMsg.ChattingUI.BizComponent", "hardevice brand account, init event : %s", mo70056V3());
            this.f121564e = new ChattingUIExDeviceLogic(this.f215752d);
        }
        if (this.f215752d.mo91574o().mo62916m3()) {
            C39755e.f106663g = 2;
        }
        if (this.f121573q) {
            C48009v0.Ax0().f129418e.add(this.f121558D, Looper.getMainLooper());
        }
        if (this.f215752d.mo91574o() != null && this.f215752d.mo91574o().mo62916m3()) {
            C48009v0.Fx0().f128685d.add(this.f121561G, Looper.getMainLooper());
        }
    }

    /* renamed from: P3 */
    public void mo70054P3(LinkedList<String> linkedList, int i) {
        C48009v0.Ax0().mo73042a0(mo70068i4());
        LinkedList linkedList2 = new LinkedList();
        List<String> o2 = this.f121565f.mo73036o2();
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (o2 != null && o2.contains(next)) {
                linkedList2.add(next);
            }
        }
        String str = null;
        if (linkedList2.size() != 0) {
            Resources m = this.f215752d.mo91572m();
            Object[] objArr = new Object[1];
            if (linkedList2.size() > 0) {
                StringBuilder sb = new StringBuilder(this.f121565f.mo73035n2((String) linkedList2.get(0)));
                for (int i2 = 1; i2 < linkedList2.size(); i2++) {
                    sb.append(this.f215752d.mo91565f().getString(C0966R.string.b68));
                    sb.append(this.f121565f.mo73035n2((String) linkedList2.get(i2)));
                }
                str = sb.toString();
            }
            objArr[0] = str;
            C76879j.m92709C(this.f215752d.mo91565f(), m.getString(C0966R.string.i69, objArr), (String) null, this.f215752d.mo91572m().getString(C0966R.string.i6h), this.f215752d.mo91572m().getString(C0966R.string.f7926wf), true, new C44796e(linkedList2), new C44797f(this));
        } else if (linkedList.size() == 1) {
            C76879j.m92754y(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.i6f), (String) null, this.f215752d.mo91572m().getString(C0966R.string.i6g), new C44794c(this));
        } else {
            C76879j.m92754y(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.i6a), (String) null, this.f215752d.mo91572m().getString(C0966R.string.i6g), new C44795d(this));
        }
    }

    /* renamed from: U5 */
    public boolean mo70055U5(int i, KeyEvent keyEvent) {
        C52558c cVar;
        if (keyEvent.getKeyCode() == 82 && keyEvent.getAction() == 1 && ((cVar = this.f121567h) == null || cVar.mo73500r2(false) == null || this.f121567h.mo73500r2(false).mo73510c() == null || this.f121567h.mo73500r2(false).mo73510c().f146826b == null || this.f121567h.mo73500r2(false).mo73510c().f146826b.isEmpty())) {
            ((C79387w) this.f215752d.f193278b.mo102812a(C79387w.class)).mo102193k1().mo100449s((View) null);
        }
        return false;
    }

    /* renamed from: V3 */
    public String mo70056V3() {
        if (this.f121573q) {
            if (this.f121574r) {
                C48334c cVar = this.f121565f;
                if (cVar == null) {
                    return null;
                }
                return cVar.field_chatName;
            }
            C48353j jVar = this.f121566g;
            if (jVar == null) {
                return null;
            }
            return jVar.field_userName;
        } else if (this.f215752d.mo91574o() == null) {
            return null;
        } else {
            return this.f215752d.mo91574o().getNickname();
        }
    }

    /* renamed from: W1 */
    public C48353j mo70057W1() {
        return this.f121566g;
    }

    /* renamed from: Y5 */
    public final void mo70058Y5(boolean z, String str) {
        if (z) {
            C48009v0.yx0().getClass();
            C86709a0.m107529k().f251779b.mo123460f(new C48366v(str, this.f121565f.field_bizChatServId, (int) (System.currentTimeMillis() / 1000)));
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [com.tencent.mm.sdk.event.IListener, java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* renamed from: Z5 */
    public final void mo70059Z5() {
        ? r4;
        ChattingUIExDeviceLogic chattingUIExDeviceLogic;
        String str;
        String str2;
        String str3;
        C75569c4.m90661G("bizflag", 1, false);
        this.f121562H.dead();
        boolean z = this.f121573q;
        if (z) {
            mo70058Y5(z, this.f215752d.mo91577r());
            C48352i zx02 = C48009v0.zx0();
            C48334c cVar = this.f121565f;
            zx02.getClass();
            String format = String.format("%s;%s;%d", new Object[]{cVar.field_brandUserName, cVar.field_bizChatServId, Long.valueOf(System.currentTimeMillis() / 1000)});
            ((C87121j) C86312j.m106911c(C87121j.class)).oc0(cVar.field_brandUserName, 8, "EnterpriseChatStatus", format);
            Log.m105919d("MicroMsg.BizChatStatusNotifyService", "quitChat:arg:%s", format);
        }
        C86709a0.m107528h();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
        int currentTimeMillis = this.f121571o != 0 ? ((int) (System.currentTimeMillis() - this.f121571o)) / 1000 : 0;
        if (C97625j3.m125811a()) {
            if (this.f121573q) {
                C48335d Ax0 = C48009v0.Ax0();
                C48335d.C48337b bVar = this.f121558D;
                MStorageEvent<C48335d.C48337b, C48335d.C48337b.C48339b> mStorageEvent = Ax0.f129418e;
                if (mStorageEvent != null) {
                    mStorageEvent.remove(bVar);
                }
            }
            if (this.f215752d.mo91574o() != null && this.f215752d.mo91574o().mo62916m3()) {
                C47976j Fx0 = C48009v0.Fx0();
                C47976j.C47978b bVar2 = this.f121561G;
                MStorageEvent<C47976j.C47978b, C47976j.C47978b.C47980b> mStorageEvent2 = Fx0.f128685d;
                if (mStorageEvent2 != null) {
                    mStorageEvent2.remove(bVar2);
                }
            }
            if (this.f215752d.mo91574o().mo62927s3() && this.f215752d.mo91574o().mo62916m3() && !((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(this.f215752d.mo91577r())) {
                C52558c cVar2 = this.f121567h;
                if (cVar2 != null && cVar2.mo73506x2()) {
                    if (this.f121582z == null) {
                        this.f121582z = new C52054y14();
                    }
                    C52054y14 y142 = this.f121582z;
                    y142.f145075d = currentTimeMillis;
                    y142.f145079h = this.f215752d.f193286j.getIntExtra("Main_IndexInSessionList", 0);
                    this.f121582z.f145077f = this.f215752d.f193286j.getIntExtra("Main_UnreadCount", 0);
                    C72963f4 f4Var = this.f121572p;
                    if (f4Var != null) {
                        this.f121582z.f145078g = f4Var.getType();
                        C52054y14 y143 = this.f121582z;
                        if (y143.f145077f > 0) {
                            y143.f145076e = ((int) (this.f121571o - this.f121572p.getCreateTime())) / 1000;
                        }
                    }
                }
                C47997p Cx0 = C48009v0.Cx0();
                String r = this.f215752d.mo91577r();
                C52054y14 y144 = this.f121582z;
                Cx0.getClass();
                ((C119157j) C119157j.f356862d).mo183875f(new C48003r(Cx0, y144, r));
            }
        }
        if (ChattingUIExDeviceLogic.m43121a(this.f121567h) && this.f121564e != null) {
            Log.m105925i("MicroMsg.ChattingUI.BizComponent", "hardevice brand account, init event : %s, notify exit chattingui", mo70056V3());
            this.f121564e.mo62721b(2, this.f121567h);
            this.f215752d.f193286j.setMMSubTitle((String) null);
        }
        if (this.f215752d.mo91574o().mo62927s3() && this.f215752d.mo91574o().mo62916m3() && currentTimeMillis != 0) {
            Intent intent = this.f215752d.mo91565f().getIntent();
            String str4 = "";
            if (intent != null) {
                String stringExtra = intent.getStringExtra("uinserve_search_id");
                String stringExtra2 = intent.getStringExtra("uinserve_search_click_id");
                String stringExtra3 = intent.getStringExtra("uinserve_search_session_id");
                String str5 = stringExtra2;
                str2 = intent.getStringExtra("uinserve_search_time_token");
                str3 = stringExtra;
                str4 = stringExtra3;
                str = str5;
            } else {
                str3 = str4;
                str2 = str3;
                str = str2;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            int intExtra = this.f215752d.f193286j.getIntExtra("specific_chat_from_scene", 0);
            int i = C19636w0.f55626c;
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(10638, this.f215752d.mo91577r(), Integer.valueOf(currentTimeMillis), Integer.valueOf(this.f215752d.f193286j.getIntExtra("biz_click_item_unread_count", 0)), Integer.valueOf(this.f215752d.f193286j.getIntExtra("biz_click_item_position", 0)), Integer.valueOf(intExtra), Integer.valueOf(i), Long.valueOf(currentTimeMillis2), str4 + XVFSFile.PATH_SEPARATOR + str3 + XVFSFile.PATH_SEPARATOR + str2, str);
        }
        ChattingUIExDeviceLogic chattingUIExDeviceLogic2 = this.f121564e;
        if (chattingUIExDeviceLogic2 != null) {
            Log.m105918d("MicroMsg.exdevice.ChattingUIExDeviceLogic", "now release the event listener");
            ChattingUIExDeviceLogic.OpFromExDeviceEventListener opFromExDeviceEventListener = chattingUIExDeviceLogic2.f107333b;
            if (opFromExDeviceEventListener != null) {
                opFromExDeviceEventListener.dead();
                chattingUIExDeviceLogic2.f107333b = null;
                Map<String, Boolean> map = chattingUIExDeviceLogic2.f107336e;
                if (map != null) {
                    ((HashMap) map).clear();
                }
            }
            chattingUIExDeviceLogic2.f107337f = false;
            ChattingUIExDeviceLogic.ExDeviceChattingUIStateEventListener exDeviceChattingUIStateEventListener = chattingUIExDeviceLogic2.f107334c;
            if (exDeviceChattingUIStateEventListener != null) {
                exDeviceChattingUIStateEventListener.dead();
                chattingUIExDeviceLogic = null;
                chattingUIExDeviceLogic2.f107334c = null;
            } else {
                chattingUIExDeviceLogic = null;
            }
            this.f121564e = chattingUIExDeviceLogic;
            r4 = chattingUIExDeviceLogic;
        } else {
            r4 = 0;
        }
        C19636w0.f55624a = r4;
        this.f121571o = 0;
        mo70060a6();
        IListener iListener = this.f121570n;
        if (iListener != null) {
            iListener.dead();
            this.f121570n = r4;
        }
        Log.m105925i("MicroMsg.ChattingUI.BizComponent", "doDestroy %s", this.f215752d.mo91577r());
    }

    /* renamed from: a6 */
    public final void mo70060a6() {
        LiveBizSessionTipsBar liveBizSessionTipsBar = this.f121568i;
        if (liveBizSessionTipsBar != null && liveBizSessionTipsBar.getVisibility() == 0) {
            Log.m105924i("MicroMsg.ChattingUI.BizComponent", "hideLiveBizSessionTipsBar");
            this.f121568i.setVisibility(8);
            MMActivityController e = this.f215752d.mo91564e();
            if (e.mo177037B() != null) {
                e.mo177037B().mo91089G(1.0f);
            }
        }
    }

    /* renamed from: b6 */
    public final void mo70061b6() {
        this.f121557C = false;
        if (this.f215752d.mo91574o() != null && this.f215752d.mo91574o().mo62916m3()) {
            this.f121557C = true;
            C48009v0.wx0().mo72736c(this.f215752d.mo91574o().getUsername(), (C47961a.C12965b) null);
        }
    }

    /* renamed from: c1 */
    public ChatFooter$$n1 mo70062c1() {
        return this.f121556B;
    }

    /* renamed from: c6 */
    public void mo70063c6(String str, boolean z) {
        this.f215752d.mo91558S();
        if (!Util.isEqual(str, this.f215752d.mo91577r())) {
            mo70060a6();
            Log.m105925i("MicroMsg.ChattingUI.BizComponent", "hideLiveBizSessionTipsBar not current user %s, %s", str, this.f215752d.mo91577r());
        } else if (!z) {
            mo70060a6();
            Log.m105924i("MicroMsg.ChattingUI.BizComponent", "hideLiveBizSessionTipsBar not live now");
        } else {
            if (this.f121568i == null) {
                C73521l0.m86927d(this.f215752d.f193286j, C0966R.C0970id.l97);
                LiveBizSessionTipsBar liveBizSessionTipsBar = (LiveBizSessionTipsBar) this.f215752d.mo91562c(C0966R.C0970id.fs8);
                this.f121568i = liveBizSessionTipsBar;
                if (liveBizSessionTipsBar == null) {
                    Log.m105928w("MicroMsg.ChattingUI.BizComponent", "liveBizSessionTipsBar is null");
                    return;
                }
            }
            this.f121568i.setChattingContext(this.f215752d);
            this.f121568i.setVisibility(0);
            MMActivityController e = this.f215752d.mo91564e();
            if (e.mo177037B() != null) {
                e.mo177037B().mo91089G(0.0f);
            }
        }
    }

    /* renamed from: c7 */
    public void mo7311c7(int i, C117747y yVar) {
        if (yVar.getType() == 1357) {
            this.f215752d.mo91561b();
            if (i != 0) {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) this.f215752d.mo91572m().getString(C0966R.string.i5r), 0).show();
            }
        }
    }

    /* renamed from: d4 */
    public void mo70064d4() {
        Intent intent = new Intent();
        intent.putExtra("Contact_User", this.f215752d.mo91577r());
        intent.putExtra("key_start_biz_profile_setting_from_scene", 1);
        C88144b.m109791i(this.f215752d.mo91565f(), Scopes.PROFILE, ".ui.newbizinfo.NewBizInfoSettingUI", intent, (Bundle) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0092, code lost:
        if (java.lang.Math.abs(r5 - r7) <= 3600000) goto L_0x0094;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x018b  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70065e() {
        /*
            r11 = this;
            ck3.b r0 = r11.f215752d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f193286j
            java.lang.String r1 = "key_biz_chat_id"
            r2 = -1
            long r0 = r0.getLongExtra(r1, r2)
            r11.f121577u = r0
            ck3.b r0 = r11.f215752d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f193286j
            java.lang.String r1 = "key_is_biz_chat"
            r2 = 0
            java.lang.Boolean r0 = r0.getBooleanExtra(r1, r2)
            boolean r0 = r0.booleanValue()
            r11.f121573q = r0
            ck3.b r0 = r11.f215752d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f193286j
            java.lang.String r1 = "chat_from_scene"
            r0.getIntExtra(r1, r2)
            ck3.b r0 = r11.f215752d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f193286j
            java.lang.String r1 = "chat_from_scene_for_group_chats"
            int r0 = r0.getIntExtra(r1, r2)
            r1 = 1
            r3 = 3
            if (r0 != r3) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            r11.f121575s = r0
            boolean r0 = eb0.C75592q0.m90793w()
            java.lang.String r4 = "MicroMsg.ChattingUI.BizComponent"
            if (r0 != 0) goto L_0x0094
            long r5 = eb0.C31543z5.m39451a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "biz_mute_guide_config_"
            r0.append(r7)
            java.lang.String r7 = eb0.C75592q0.m90789s()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            r7 = 0
            java.lang.String r9 = "biz_mute_guide_show_time"
            long r7 = r0.getLong(r9, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "getBizMuteFirstShowTime, time: "
            r0.append(r9)
            r0.append(r7)
            java.lang.String r9 = " currentTime:"
            r0.append(r9)
            long r9 = eb0.C31543z5.m39451a()
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x009e
        L_0x0094:
            bp3.p r0 = bp3.C79758p.f233760a
            bp3.f r5 = bp3.C104160f.RepairerConfig_Global_BizServiceGuide_Int
            int r0 = r0.mo109882e(r5, r2)
            if (r0 != r1) goto L_0x00a0
        L_0x009e:
            r0 = 1
            goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            r11.f121576t = r0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            long r5 = r11.f121577u
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0[r2] = r3
            boolean r3 = r11.f121573q
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0[r1] = r3
            boolean r3 = r11.f121576t
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5 = 2
            r0[r5] = r3
            java.lang.String r3 = "rawBizUserid %s %s, openBizMute: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r0)
            boolean r0 = r11.f121573q
            java.lang.String r3 = "MicroMsg.BizChatInfoStorageLogic"
            if (r0 == 0) goto L_0x0100
            sb0.d r0 = rb0.C48009v0.Ax0()
            long r6 = r11.f121577u
            sb0.c r0 = r0.mo73042a0(r6)
            r11.f121565f = r0
            long r6 = r11.f121577u
            java.lang.String r8 = sb0.C48340e.f129426a
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r8[r2] = r6
            long r6 = r0.field_bizChatLocalId
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r8[r1] = r6
            java.lang.String r6 = "protectBizChatNotExist bizChatId:%s BizChatInfo:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r6, r8)
            r11.f121565f = r0
            sb0.b r0 = rb0.C48009v0.Dx0()
            long r6 = r11.mo70068i4()
            sb0.a r0 = r0.mo73024Yt(r6)
            int r0 = r0.field_unReadCount
            r11.f121581y = r0
        L_0x0100:
            boolean r0 = r11.f121573q
            if (r0 == 0) goto L_0x0110
            sb0.c r0 = r11.f121565f
            java.lang.String r0 = r0.field_bizChatServId
            boolean r0 = sb0.C48340e.m53675p(r0)
            if (r0 == 0) goto L_0x0110
            r0 = 1
            goto L_0x0111
        L_0x0110:
            r0 = 0
        L_0x0111:
            r11.f121574r = r0
            boolean r6 = r11.f121573q
            if (r6 == 0) goto L_0x0165
            if (r0 != 0) goto L_0x0165
            sb0.k r0 = rb0.C48009v0.Bx0()
            sb0.c r6 = r11.f121565f
            java.lang.String r6 = r6.field_bizChatServId
            sb0.j r0 = r0.get(r6)
            r11.f121566g = r0
            sb0.c r6 = r11.f121565f
            java.lang.String r6 = r6.field_bizChatServId
            java.lang.String r7 = sb0.C48340e.f129426a
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r2] = r6
            if (r0 != 0) goto L_0x0139
            r8 = -1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x013b
        L_0x0139:
            java.lang.String r8 = r0.field_userId
        L_0x013b:
            r7[r1] = r8
            java.lang.String r8 = "protectBizChatNotExist userId:%s BizChatUserInfo:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r8, r7)
            if (r0 != 0) goto L_0x0163
            sb0.j r0 = new sb0.j
            r0.<init>()
            r0.field_userId = r6
            sb0.k r7 = rb0.C48009v0.Bx0()
            r7.mo73075Lo(r0)
            sb0.k r7 = rb0.C48009v0.Bx0()
            sb0.j r6 = r7.get(r6)
            if (r6 != 0) goto L_0x0162
            java.lang.String r6 = "protectContactNotExist contact get from db is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r6)
            goto L_0x0163
        L_0x0162:
            r0 = r6
        L_0x0163:
            r11.f121566g = r0
        L_0x0165:
            boolean r0 = r11.f121574r
            if (r0 == 0) goto L_0x0171
            sb0.c r0 = r11.f121565f
            boolean r0 = sb0.C48340e.m53676q(r0)
            r11.f121563I = r0
        L_0x0171:
            ck3.b r0 = r11.f215752d
            java.lang.String r0 = r0.mo91577r()
            ug.c r0 = rb0.C47984k.m53328b(r0)
            r11.f121567h = r0
            r11.f121559E = r1
            ck3.b r0 = r11.f215752d
            com.tencent.mm.storage.z1 r0 = r0.mo91574o()
            boolean r0 = r0.mo62916m3()
            if (r0 == 0) goto L_0x01d1
            com.tencent.mm.pluginsdk.model.d r0 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            rx3.g r3 = com.tencent.p014mm.pluginsdk.model.C19428d.f54866k
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x019e
            goto L_0x01d1
        L_0x019e:
            ck3.b r3 = r11.f215752d
            java.lang.String r3 = r3.mo91577r()
            boolean r0 = r0.mo25185t(r3)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            r5[r2] = r6
            int r2 = r11.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r1] = r2
            java.lang.String r1 = "initLiveTipsBar isLiveNow=%b, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r5)
            r11.mo70063c6(r3, r0)
            com.tencent.mm.sdk.event.IListener r0 = r11.f121570n
            if (r0 != 0) goto L_0x01e5
            com.tencent.mm.ui.chatting.component.biz.BizComponent$BizFinderLineStatusChangedEventListenerImpl r0 = new com.tencent.mm.ui.chatting.component.biz.BizComponent$BizFinderLineStatusChangedEventListenerImpl
            r0.<init>(r11)
            r11.f121570n = r0
            r0.alive()
            goto L_0x01e5
        L_0x01d1:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            int r1 = r11.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "initLiveTipsBar return %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            r11.mo70060a6()
        L_0x01e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.biz.BizComponent.mo70065e():void");
    }

    /* renamed from: f5 */
    public void mo70066f5(String str, int i) {
        int i2;
        if (!Util.isNullOrNil(str) && C47984k.m53340n(str)) {
            C79368l lVar = (C79368l) this.f215752d.f193278b.mo102812a(C79368l.class);
            C72963f4 item = lVar.getCount() > 0 ? lVar.getItem(lVar.getCount() - 1) : null;
            if (item == null) {
                i2 = 1;
            } else if (item.getType() == 285212721) {
                i2 = 2;
            } else if (item.getType() == 318767153) {
                i2 = 5;
            } else {
                if (!Util.isNullOrNil(item.f230732P)) {
                    int i3 = item.f230739W;
                    if (i3 == 1) {
                        i2 = 3;
                    } else if (i3 == 2) {
                        i2 = 4;
                    }
                }
                i2 = 0;
            }
            String t = item == null ? "" : !Util.isNullOrNil(item.f230732P) ? item.f230732P : item.mo108769t2() == 0 ? item.mo108768t() : C75592q0.m90789s();
            Log.m105919d("MicroMsg.ChattingUI.BizComponent", "alvinluo onFooterSwitchInput talker: %s, switchType: %d, lastMsgType: %d, sender: %s", str, Integer.valueOf(i), Integer.valueOf(i2), t);
            C115669n.INSTANCE.mo160131h(20018, Long.valueOf(this.f121571o), str, Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i2), t, 1);
        }
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        if (this.f215752d.mo91574o().mo62927s3() && this.f215752d.mo91574o().mo62916m3() && this.f215752d.mo91574o().mo62927s3() && this.f215752d.mo91574o().mo62916m3()) {
            C48009v0.Cx0().f128735d = this.f215752d.mo91565f().getIntent().getStringExtra("uinserve_search_click_id");
            if (!((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(this.f215752d.mo91577r())) {
                int intExtra = this.f215752d.f193286j.getIntExtra("specific_chat_from_scene", 0);
                if (this.f121582z == null) {
                    this.f121582z = new C52054y14();
                }
                this.f121582z.f145079h = this.f215752d.f193286j.getIntExtra("Main_IndexInSessionList", 0);
                this.f121582z.f145077f = this.f215752d.f193286j.getIntExtra("Main_UnreadCount", 0);
                C72963f4 f4Var = this.f121572p;
                if (f4Var != null) {
                    this.f121582z.f145078g = f4Var.getType();
                    C52054y14 y142 = this.f121582z;
                    if (y142.f145077f > 0) {
                        y142.f145076e = ((int) (this.f121571o - this.f121572p.getCreateTime())) / 1000;
                    }
                }
                C47997p Cx0 = C48009v0.Cx0();
                String r = this.f215752d.mo91577r();
                C72963f4 f4Var2 = this.f121572p;
                C52054y14 y143 = this.f121582z;
                Cx0.getClass();
                ((C119157j) C119157j.f356862d).mo183875f(new C48001q(Cx0, y143, r, f4Var2, intExtra));
            }
        }
        if (C72996z1.m85840k5(this.f215752d.mo91577r())) {
            ((C119157j) C119157j.f356862d).mo183871b(new C44808c(this), "ReportEnterNotifyMessage");
        }
    }

    public C52558c getBizInfo() {
        return this.f121567h;
    }

    /* renamed from: i4 */
    public long mo70068i4() {
        C48334c cVar = this.f121565f;
        if (cVar == null) {
            return -1;
        }
        return cVar.field_bizChatLocalId;
    }

    /* renamed from: l1 */
    public void mo70069l1() {
        C86709a0.m107525e().postToWorkerDelayed(new C44793b(), 500);
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        mo70059Z5();
    }

    /* renamed from: m0 */
    public boolean mo70070m0(C72996z1 z1Var, String str) {
        C52558c cVar;
        C72976h2 M;
        int i = 0;
        if (this.f215752d == null) {
            Log.m105920e("MicroMsg.ChattingUI.BizComponent", "[writeOpLogAndMarkReadTContact] mChattingContext is null!");
            return false;
        }
        if (z1Var.mo62916m3() && (cVar = this.f121567h) != null) {
            if (this.f121573q) {
                C48009v0.Dx0().mo73019DN(mo70068i4());
                return true;
            } else if (cVar.mo73502t2()) {
                if (this.f121567h.mo73500r2(false) != null && this.f121567h.mo73500r2(false).mo73511d() != null && !Util.isNullOrNil(this.f121567h.mo73498p2()) && (M = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69742M(this.f121567h.mo73498p2())) != null && M.getUsername().equals(str) && M.mo108786G2() > 0) {
                    if (this.f215752d.f193286j.getIntExtra("chat_from_scene", 0) == 2) {
                        return false;
                    }
                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(this.f121567h.mo73498p2());
                }
            } else if (!this.f121567h.mo73506x2() && !this.f121567h.mo73503u2()) {
                C19625p0 Jx0 = C48009v0.Jx0();
                C19623o0 mL = Jx0.mo25809mL();
                if (mL != null) {
                    i = Jx0.mo25803gY(mL.field_orderFlag);
                }
                if (i > 0) {
                    C19625p0 Jx02 = C48009v0.Jx0();
                    Jx02.getClass();
                    Jx02.f55550d.execSQL("BizTimeLineInfo", "update BizTimeLineInfo set hasShow = 1 where hasShow < 1  and talker = '" + str + "' ");
                    p0$$f p0__f = new p0$$f();
                    p0__f.f55562a = p0$$g.UPDATE;
                    Jx02.mo25805jo(p0__f);
                }
            }
        }
        if (C72996z1.m85841l5(str)) {
            return true;
        }
        return ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(str);
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        C52558c cVar;
        if (this.f121575s && (cVar = this.f121567h) != null && cVar.mo73506x2() && this.f121576t) {
            this.f215752d.mo91571l().post(new C44805g());
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        Log.m105919d("MicroMsg.ChattingUI.BizComponent", "onNotifyChange obj %s talker %s hasDoUpdateBizAttrs %b", obj, this.f215752d.mo91577r(), Boolean.valueOf(this.f121557C));
        if (!this.f121557C && Util.isEqual(obj, (Object) this.f215752d.mo91577r())) {
            if (this.f215752d.mo91574o() != null && this.f215752d.mo91574o().mo62916m3()) {
                C47976j Fx0 = C48009v0.Fx0();
                Fx0.f128685d.add(this.f121561G, Looper.getMainLooper());
            }
            mo70061b6();
        }
    }

    /* renamed from: q1 */
    public boolean mo70071q1() {
        return this.f121573q;
    }

    /* renamed from: r1 */
    public boolean mo70072r1(C67391b bVar, C74243t8 t8Var) {
        boolean z;
        C86299o oVar;
        C74243t8 t8Var2 = t8Var;
        String s = C75592q0.m90789s();
        String str = t8Var2.f217968b;
        String str2 = Util.isNullOrNil(t8Var2.f217990x) ? "" : t8Var2.f217990x;
        int i = t8Var2.f217991y;
        if (C47984k.m53340n(str)) {
            Log.m105919d("MicroMsg.ChattingUI.BizComponent", "alvinluo reportBizAvatarClick brand: %s, username: %s, kfWorker: %s, kfType: %d", str, s, str2, Integer.valueOf(i));
            C115669n.INSTANCE.mo160131h(20008, Long.valueOf(this.f121571o), str, 1, str2, Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()));
        }
        if (!Util.isNullOrNil(t8Var2.f217990x) && !Util.isNullOrNil(t8Var2.f217968b) && C48009v0.Gx0() != null) {
            C47989m Gx0 = C48009v0.Gx0();
            if (t8Var2.f217991y != 2) {
                Gx0.getClass();
                z = false;
            } else {
                z = Gx0.f128705e.f128709a;
            }
            if (z) {
                C47989m Gx02 = C48009v0.Gx0();
                String str3 = t8Var2.f217968b;
                String str4 = t8Var2.f217990x;
                int i2 = t8Var2.f217991y;
                Gx02.getClass();
                Log.m105925i("MicroMsg.BizKFService", "alvinluo getKFGuideAppBrandOpenBundle username: %s, brandUsername: %s, kfOpenId: %s, kfType: %d", s, str3, str4, Integer.valueOf(i2));
                if (i2 != 2 ? false : Gx02.f128705e.f128709a) {
                    C47989m.C47991b bVar2 = Gx02.f128705e;
                    if (!Util.isNullOrNil(bVar2.f128710b) && bVar2.f128711c != null) {
                        oVar = new C86299o();
                        C47989m.C47991b bVar3 = Gx02.f128705e;
                        oVar.f250930b = bVar3.f128710b;
                        oVar.f250931c = (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) ? bVar3.f128712d : 0;
                        oVar.f250939k = 1166;
                        oVar.f250940l = str3;
                        Uri.Builder buildUpon = Uri.parse(bVar3.f128711c).buildUpon();
                        buildUpon.appendQueryParameter("username", s);
                        buildUpon.appendQueryParameter("brandUsername", str3);
                        buildUpon.appendQueryParameter("kfOpenId", str4);
                        buildUpon.appendQueryParameter("kfType", String.valueOf(i2));
                        String uri = buildUpon.build().toString();
                        oVar.f250934f = uri;
                        Log.m105927v("MicroMsg.BizKFService", "alvinluo getKFGuideAppBrandOpenBundle enterPath: %s", uri);
                        if (!(oVar == null || bVar.mo91565f() == null)) {
                            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(bVar.mo91565f(), oVar);
                            return true;
                        }
                    }
                }
                oVar = null;
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(bVar.mo91565f(), oVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: r4 */
    public int mo70073r4() {
        return this.f121581y;
    }

    /* renamed from: s1 */
    public String mo70074s1(String str) {
        C52558c cVar;
        C52558c.C52560b r2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.contains(HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmp) + "/emoticonstore/")) {
            return null;
        }
        String substring = str.substring(str.lastIndexOf("/") + 1);
        if (!this.f215752d.mo91574o().mo62927s3() || !this.f215752d.mo91574o().mo62916m3() || (cVar = this.f121567h) == null || (r2 = cVar.mo73500r2(false)) == null || TextUtils.isEmpty(r2.mo73518k()) || !substring.contains(r2.mo73518k())) {
            return null;
        }
        return substring;
    }

    /* renamed from: s4 */
    public boolean mo70075s4() {
        return this.f121574r;
    }

    /* renamed from: s5 */
    public C48334c mo70076s5() {
        return this.f121565f;
    }

    /* renamed from: t1 */
    public void mo70077t1() {
        if (this.f121567h != null) {
            boolean z = !LocationUtil.isGpsEnable() && !LocationUtil.isNetworkProviderEnable();
            this.f121580x = C76879j.m92750u(this.f215752d.mo91565f(), (this.f121567h.field_hadAlert != 0 || !z) ? z ? this.f215752d.mo91572m().getString(C0966R.string.b79) : this.f215752d.mo91572m().getString(C0966R.string.b77, new Object[]{this.f215752d.mo91574o().mo62898f()}) : this.f215752d.mo91572m().getString(C0966R.string.b78, new Object[]{this.f215752d.mo91574o().mo62898f()}), this.f215752d.mo91572m().getString(C0966R.string.a3h), new C44802k(z), new C44803l());
        }
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        this.f121559E = false;
        mo70059Z5();
    }

    /* renamed from: x1 */
    public boolean mo70078x1() {
        if (!this.f121573q) {
            return false;
        }
        if (this.f121574r) {
            int i = C48340e.m53668i(mo70068i4());
            if (!Util.isNullOrNil(this.f121565f.field_chatName)) {
                ((C79343c0) this.f215752d.f193278b.mo102812a(C79343c0.class)).mo102629o0(this.f215752d.mo91572m().getString(C0966R.string.eyf, new Object[]{this.f121565f.field_chatName, Integer.valueOf(i)}));
            } else if (i == 0) {
                C67391b bVar = this.f215752d;
                bVar.f193286j.setMMTitle(bVar.mo91572m().getString(C0966R.string.bba));
            } else {
                C67391b bVar2 = this.f215752d;
                bVar2.f193286j.setMMTitle(bVar2.mo91572m().getString(C0966R.string.eyf, new Object[]{this.f215752d.mo91572m().getString(C0966R.string.bba), Integer.valueOf(i)}));
            }
        } else {
            this.f215752d.f193286j.setMMTitle(this.f121566g.field_userName);
        }
        return true;
    }

    /* renamed from: x5 */
    public boolean mo70079x5() {
        return this.f121563I;
    }

    /* renamed from: y4 */
    public long mo70080y4() {
        return this.f121571o;
    }
}
