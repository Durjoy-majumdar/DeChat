package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.RecyclerView;
import by0.C16825a;
import c30.C104289g;
import c30.C79923f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AppActiveEvent;
import com.tencent.p014mm.autogen.events.AppMsgRelatedInfoUpdateEvent;
import com.tencent.p014mm.autogen.events.BizAdReplaceEvent;
import com.tencent.p014mm.autogen.events.BizFinderLineStatusChangedEvent;
import com.tencent.p014mm.autogen.events.BizTimePersonalizedRecommendUpdateEvent;
import com.tencent.p014mm.autogen.events.FollowUserEvent;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.chatting.C74355z4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.bizui.widget.StoryListView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C68777r4;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.BizTLRecCardJsEngine;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18342r;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C85103f1;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18441b;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18468r;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18470u;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18471v;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.pluginsdk.model.C19449k;
import com.tencent.p014mm.pluginsdk.model.C19458o;
import com.tencent.p014mm.pluginsdk.model.C44593h;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72924q1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19627t;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C19641z0;
import com.tencent.p014mm.storage.p0$$f;
import com.tencent.p014mm.storage.p0$$h;
import com.tencent.xweb.file.XVFSFile;
import cy0.C20372d;
import de3.C45335p;
import di3.C86312j;
import dx0.C31332a;
import eb0.C20583z;
import eb0.C86493v0;
import f40.C86709a0;
import f40.C86737h0;
import f62.C75700k0;
import fx0.C20729b;
import fx0.C20732c;
import fx0.C45823f;
import fx0.C45825h;
import fy0.C8218c;
import gx0.C8465b;
import gy3.C87412m;
import h81.C32735h;
import ht1.C60171g1;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import jw0.C9533e;
import k20.C60958c;
import k20.C9556a;
import kr0.C76630x0;
import nf3.C34826a;
import ob0.C47350c;
import ob0.C89144l0;
import ox0.C21905b;
import p629ny.C76978g;
import px0.C22058r;
import q73.C22078m;
import q73.C22079o;
import q73.C47777j;
import q73.C89562n;
import qx0.C22136a;
import qx0.C22140b;
import qx0.C22150e;
import rb0.C48009v0;
import rx0.C22260f;
import rx3.C13598b0;
import rx3.C36570n;
import te3.C118451o53;
import te3.C22525q53;
import te3.C50785p53;
import te3.C64635po3;
import wd3.C118762j;
import wd3.C53155r0;
import wx3.C15601d;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

@C86737h0
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI */
public class BizTimeLineUI extends MMActivity implements C92953s4, C89562n, ScreenShotUtil.ScreenShotCallback {

    /* renamed from: Q0 */
    public static int f50205Q0;

    /* renamed from: R0 */
    public static int f50206R0;

    /* renamed from: y0 */
    public static String f50207y0;

    /* renamed from: A */
    public int f50208A;

    /* renamed from: B */
    public int f50209B = 1;

    /* renamed from: C */
    public boolean f50210C = false;

    /* renamed from: D */
    public boolean f50211D = false;

    /* renamed from: E */
    public boolean f50212E = false;

    /* renamed from: F */
    public boolean f50213F = false;

    /* renamed from: G */
    public int f50214G = 0;

    /* renamed from: H */
    public int f50215H = -1;

    /* renamed from: I */
    public int f50216I = -1;

    /* renamed from: J */
    public int f50217J = 0;

    /* renamed from: K */
    public boolean f50218K = false;

    /* renamed from: L */
    public HashSet<String> f50219L = new HashSet<>();

    /* renamed from: M */
    public final Set<C22079o> f50220M = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: N */
    public final Set<C22078m> f50221N = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: P */
    public p0$$h f50222P = new C18182d();

    /* renamed from: Q */
    public IListener<FollowUserEvent> f50223Q;

    /* renamed from: R */
    public IListener f50224R;

    /* renamed from: S */
    public IListener f50225S;

    /* renamed from: T */
    public IListener f50226T;

    /* renamed from: U */
    public int f50227U;

    /* renamed from: V */
    public int f50228V;

    /* renamed from: W */
    public View.OnLongClickListener f50229W;

    /* renamed from: X */
    public long f50230X;

    /* renamed from: Y */
    public boolean f50231Y;

    /* renamed from: Z */
    public boolean f50232Z;

    /* renamed from: d */
    public C22260f f50233d;

    /* renamed from: e */
    public TextView f50234e;

    /* renamed from: f */
    public StoryListView f50235f;

    /* renamed from: g */
    public View f50236g;

    /* renamed from: h */
    public View f50237h;

    /* renamed from: i */
    public View f50238i;

    /* renamed from: j */
    public ImageView f50239j;

    /* renamed from: n */
    public LinearLayout f50240n;

    /* renamed from: o */
    public TextView f50241o;

    /* renamed from: p */
    public TextView f50242p;

    /* renamed from: p0 */
    public IListener f50243p0;

    /* renamed from: q */
    public View f50244q;

    /* renamed from: r */
    public BizTimeLineHotView f50245r;

    /* renamed from: s */
    public C18508z2 f50246s;

    /* renamed from: t */
    public BizTimeLineMusicImp f50247t;

    /* renamed from: u */
    public int f50248u = 0;

    /* renamed from: v */
    public C18412m3 f50249v;

    /* renamed from: w */
    public C22140b f50250w;

    /* renamed from: x */
    public long f50251x = 0;

    /* renamed from: x0 */
    public C45335p f50252x0;

    /* renamed from: y */
    public long f50253y = 0;

    /* renamed from: z */
    public long f50254z = 0;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI$a */
    public class C2089a implements View.OnLongClickListener {
        public C2089a() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$17", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            if (C9533e.f29713a.mo10211d()) {
                BizTimeLineUI bizTimeLineUI = BizTimeLineUI.this;
                Intent intent = new Intent(BizTimeLineUI.this, BizTestUI.class);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(bizTimeLineUI, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$17", "onLongClick", "(Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bizTimeLineUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(bizTimeLineUI, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$17", "onLongClick", "(Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$17", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI$b */
    public class C18181b implements Runnable {
        public C18181b() {
        }

        public void run() {
            BizTimeLineUI bizTimeLineUI = BizTimeLineUI.this;
            bizTimeLineUI.f50231Y = false;
            if (!bizTimeLineUI.isFinishing()) {
                BizTimeLineUI.this.mo22785M7();
            } else {
                Log.m105928w("MicroMsg.BizTimeLineUI", "Activity is finished!!!");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI$d */
    public class C18182d implements p0$$h {
        public C18182d() {
        }

        /* renamed from: p */
        public void mo21358p(Object obj, p0$$f p0__f) {
            BizTimeLineUI.this.mo22786N7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI$c */
    public class C18184c implements C45335p {
        public C18184c() {
        }

        /* renamed from: a */
        public Object mo22792a(C53155r0 r0Var) {
            return null;
        }

        /* renamed from: b */
        public Object mo22793b(C53155r0 r0Var) {
            String str;
            String str2;
            String str3;
            C86493v0.C86495c b;
            if (r0Var.f148313d == 45) {
                String str4 = new String(Base64.decode(r0Var.f148312c, 0));
                try {
                    C104289g gVar = new C104289g((String) r0Var.mo73845a(String.class));
                    str3 = gVar.optString("fullText");
                    try {
                        str2 = gVar.optString("linkText");
                    } catch (C79923f unused) {
                        str2 = "";
                        str = "";
                        Log.m105919d("MicroMsg.BizTimeLineUI", "appId:%s,path:%s", str4, str);
                        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                        appBrandStatObject.f245533f = 1082;
                        String str5 = r0Var.f148322m;
                        String str6 = b.mo120959f("preUsername", (String) null) + ":3:" + str3 + XVFSFile.PATH_SEPARATOR + str2 + XVFSFile.PATH_SEPARATOR + str;
                        appBrandStatObject.f245534g = str6;
                        Log.m105919d("MicroMsg.BizTimeLineUI", "sceneNote = %s", str6);
                        ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(BizTimeLineUI.this.getContext(), (String) null, str4, 0, 0, str, appBrandStatObject);
                        return null;
                    }
                    try {
                        str = new String(Base64.decode(Util.nullAs(gVar.optString("path"), ""), 0));
                    } catch (C79923f unused2) {
                        str = "";
                        Log.m105919d("MicroMsg.BizTimeLineUI", "appId:%s,path:%s", str4, str);
                        AppBrandStatObject appBrandStatObject2 = new AppBrandStatObject();
                        appBrandStatObject2.f245533f = 1082;
                        String str52 = r0Var.f148322m;
                        String str62 = b.mo120959f("preUsername", (String) null) + ":3:" + str3 + XVFSFile.PATH_SEPARATOR + str2 + XVFSFile.PATH_SEPARATOR + str;
                        appBrandStatObject2.f245534g = str62;
                        Log.m105919d("MicroMsg.BizTimeLineUI", "sceneNote = %s", str62);
                        ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(BizTimeLineUI.this.getContext(), (String) null, str4, 0, 0, str, appBrandStatObject2);
                        return null;
                    }
                } catch (C79923f unused3) {
                    str3 = "";
                    str2 = str3;
                    str = "";
                    Log.m105919d("MicroMsg.BizTimeLineUI", "appId:%s,path:%s", str4, str);
                    AppBrandStatObject appBrandStatObject22 = new AppBrandStatObject();
                    appBrandStatObject22.f245533f = 1082;
                    String str522 = r0Var.f148322m;
                    String str622 = b.mo120959f("preUsername", (String) null) + ":3:" + str3 + XVFSFile.PATH_SEPARATOR + str2 + XVFSFile.PATH_SEPARATOR + str;
                    appBrandStatObject22.f245534g = str622;
                    Log.m105919d("MicroMsg.BizTimeLineUI", "sceneNote = %s", str622);
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(BizTimeLineUI.this.getContext(), (String) null, str4, 0, 0, str, appBrandStatObject22);
                    return null;
                }
                Log.m105919d("MicroMsg.BizTimeLineUI", "appId:%s,path:%s", str4, str);
                AppBrandStatObject appBrandStatObject222 = new AppBrandStatObject();
                appBrandStatObject222.f245533f = 1082;
                String str5222 = r0Var.f148322m;
                if (!Util.isNullOrNil(str5222) && (b = C86493v0.m107224d().mo120946b(str5222)) != null) {
                    String str6222 = b.mo120959f("preUsername", (String) null) + ":3:" + str3 + XVFSFile.PATH_SEPARATOR + str2 + XVFSFile.PATH_SEPARATOR + str;
                    appBrandStatObject222.f245534g = str6222;
                    Log.m105919d("MicroMsg.BizTimeLineUI", "sceneNote = %s", str6222);
                }
                ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(BizTimeLineUI.this.getContext(), (String) null, str4, 0, 0, str, appBrandStatObject222);
            }
            return null;
        }
    }

    public BizTimeLineUI() {
        C40008f fVar = C40008f.f107254d;
        this.f50223Q = new IListener<FollowUserEvent>(fVar) {
            {
                this.__eventId = 398763182;
            }

            public boolean callback(IEvent iEvent) {
                Log.m105925i("MicroMsg.BizTimeLineUI", "FollowUserEvent scene %d", Integer.valueOf(((FollowUserEvent) iEvent).f154820d.f154822b));
                BizTimeLineUI bizTimeLineUI = BizTimeLineUI.this;
                if (bizTimeLineUI.f50246s != null && !bizTimeLineUI.isFinishing()) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C18417n4(this));
                }
                return false;
            }
        };
        this.f50224R = new IListener<AppMsgRelatedInfoUpdateEvent>(fVar) {
            {
                this.__eventId = -1315546616;
            }

            public boolean callback(IEvent iEvent) {
                Log.m105925i("MicroMsg.BizTimeLineUI", "AppMsgRelatedInfoUpdateEvent scene %d", Integer.valueOf(((AppMsgRelatedInfoUpdateEvent) iEvent).f107364d.f107365a));
                BizTimeLineUI bizTimeLineUI = BizTimeLineUI.this;
                if (bizTimeLineUI.f50246s != null && !bizTimeLineUI.isFinishing()) {
                    BizTimeLineUI.this.f50246s.notifyDataSetChanged();
                }
                return false;
            }
        };
        this.f50225S = new IListener<BizTimePersonalizedRecommendUpdateEvent>(fVar) {
            {
                this.__eventId = -584175787;
            }

            public boolean callback(IEvent iEvent) {
                Log.m105925i("MicroMsg.BizTimeLineUI", "bizTimePersonalizedRecommendUpdateEventListener open %b", Boolean.valueOf(((BizTimePersonalizedRecommendUpdateEvent) iEvent).f107388d.f107389a));
                BizTimeLineUI bizTimeLineUI = BizTimeLineUI.this;
                if (bizTimeLineUI.f50246s != null && !bizTimeLineUI.isFinishing()) {
                    C18508z2 z2Var = BizTimeLineUI.this.f50246s;
                    z2Var.getClass();
                    C18508z2.C18509a aVar = C18508z2.f51409I;
                    if (aVar.mo23169c()) {
                        C18508z2.C18509a.m19195b(aVar, z2Var, C20583z.C20585c.GET_RECOMMEND_FEEDS_SCENE_REPLACE, false, (C64635po3) null, 12, (Object) null);
                        z2Var.notifyDataSetChanged();
                    }
                }
                return false;
            }
        };
        this.f50226T = new IListener<BizAdReplaceEvent>(fVar) {
            {
                this.__eventId = -132167732;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
                r4 = r3.f50257d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r4) {
                /*
                    r3 = this;
                    com.tencent.mm.autogen.events.BizAdReplaceEvent r4 = (com.tencent.p014mm.autogen.events.BizAdReplaceEvent) r4
                    r0 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    com.tencent.mm.autogen.events.BizAdReplaceEvent$a r4 = r4.f48082d
                    int r4 = r4.f48083a
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r1 = 0
                    r0[r1] = r4
                    java.lang.String r4 = "MicroMsg.BizTimeLineUI"
                    java.lang.String r2 = "bizAdEventListener insertType %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r0)
                    com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI.this
                    com.tencent.mm.plugin.brandservice.ui.timeline.z2 r0 = r4.f50246s
                    if (r0 == 0) goto L_0x0036
                    boolean r4 = r4.isFinishing()
                    if (r4 != 0) goto L_0x0036
                    com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI.this
                    com.tencent.mm.plugin.bizui.widget.StoryListView r0 = r4.f50235f
                    if (r0 == 0) goto L_0x0036
                    com.tencent.mm.plugin.brandservice.ui.timeline.z2 r2 = r4.f50246s
                    if (r2 != 0) goto L_0x002e
                    goto L_0x0036
                L_0x002e:
                    com.tencent.mm.plugin.brandservice.ui.timeline.o4 r2 = new com.tencent.mm.plugin.brandservice.ui.timeline.o4
                    r2.<init>(r4)
                    r0.post(r2)
                L_0x0036:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI.C181806.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f50228V = 0;
        this.f50229W = new C2089a();
        this.f50230X = 0;
        this.f50231Y = false;
        this.f50232Z = false;
        this.f50243p0 = new IListener<AppActiveEvent>(fVar) {
            {
                this.__eventId = 2123042947;
            }

            public boolean callback(IEvent iEvent) {
                AppActiveEvent.C28702a aVar;
                AppActiveEvent appActiveEvent = (AppActiveEvent) iEvent;
                if (appActiveEvent == null || (aVar = appActiveEvent.f78710d) == null || aVar.f78711a) {
                    return false;
                }
                BizTimeLineUI.this.f50251x = 0;
                return false;
            }
        };
        this.f50252x0 = new C18184c();
    }

    /* renamed from: H7 */
    public static void m18783H7(BizTimeLineUI bizTimeLineUI) {
        C19623o0 p;
        C18508z2 z2Var = bizTimeLineUI.f50246s;
        if (z2Var != null && bizTimeLineUI.f50235f != null && z2Var.getCount() > 0) {
            C19623o0 p2 = bizTimeLineUI.f50246s.mo23159p();
            if (p2 != null) {
                C18508z2.f51425Z = Long.valueOf(p2.mo25767q2());
            }
            C18508z2.f51424Y = null;
            bizTimeLineUI.f50246s.notifyDataSetChanged();
            bizTimeLineUI.f50232Z = true;
            MMHandlerThread.postToMainThreadDelayed(new C18411l4(bizTimeLineUI), 200);
            bizTimeLineUI.f50235f.setSelection(0);
            bizTimeLineUI.f50249v.mo22985l("", 0, 0, 6, -1, 0, false, 0);
            C18508z2 z2Var2 = bizTimeLineUI.f50246s;
            if (!(z2Var2 == null || (p = z2Var2.mo23159p()) == null)) {
                C19636w0.m21174p(p.field_orderFlag);
            }
            bizTimeLineUI.mo22782J7();
        }
    }

    /* renamed from: D4 */
    public void mo22778D4() {
        C18508z2 z2Var = this.f50246s;
        if (z2Var != null) {
            z2Var.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0266 A[LOOP:1: B:49:0x008e->B:115:0x0266, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0270 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01fb  */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22781I7(int r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            if (r1 != 0) goto L_0x0015
            boolean r3 = r0.f50211D
            if (r3 != 0) goto L_0x0015
            int r3 = f50206R0
            if (r3 == r1) goto L_0x0015
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r3 = r0.f50245r
            r3.mo23033e()
        L_0x0015:
            com.tencent.mm.plugin.bizui.widget.StoryListView r3 = r0.f50235f
            java.lang.String r4 = "listView"
            gy3.C87412m.m108594g(r3, r4)
            r5 = 3
            r8 = 1
            if (r1 > r2) goto L_0x0076
            r10 = r1
            r9 = 0
        L_0x0022:
            int r11 = r9 + 1
            if (r10 == 0) goto L_0x0070
            android.view.View r9 = r3.getChildAt(r9)
            if (r9 != 0) goto L_0x002d
            goto L_0x0070
        L_0x002d:
            java.lang.Object r9 = r9.getTag()
            boolean r12 = r9 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18206a
            if (r12 == 0) goto L_0x0038
            com.tencent.mm.plugin.brandservice.ui.timeline.item.a r9 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18206a) r9
            goto L_0x0039
        L_0x0038:
            r9 = 0
        L_0x0039:
            if (r9 == 0) goto L_0x003e
            com.tencent.mm.storage.o0 r9 = r9.f50327a
            goto L_0x003f
        L_0x003e:
            r9 = 0
        L_0x003f:
            if (r9 != 0) goto L_0x0042
            goto L_0x0070
        L_0x0042:
            te3.re4 r12 = r9.mo25774x2()
            if (r12 == 0) goto L_0x0052
            te3.y23 r12 = r12.f64529u
            if (r12 == 0) goto L_0x0052
            int r12 = r12.f186438d
            if (r12 != r5) goto L_0x0052
            r12 = 1
            goto L_0x0053
        L_0x0052:
            r12 = 0
        L_0x0053:
            if (r12 == 0) goto L_0x0070
            te3.re4 r9 = r9.mo25774x2()
            if (r9 == 0) goto L_0x006b
            te3.y23 r9 = r9.f64529u
            if (r9 == 0) goto L_0x006b
            java.util.LinkedList<te3.pi1> r9 = r9.f186439e
            if (r9 == 0) goto L_0x006b
            int r9 = r9.size()
            if (r9 != 0) goto L_0x006b
            r9 = 1
            goto L_0x006c
        L_0x006b:
            r9 = 0
        L_0x006c:
            if (r9 != 0) goto L_0x0070
            r3 = 1
            goto L_0x0077
        L_0x0070:
            if (r10 == r2) goto L_0x0076
            int r10 = r10 + 1
            r9 = r11
            goto L_0x0022
        L_0x0076:
            r3 = 0
        L_0x0077:
            px0.C22058r.f62431b = r3
            qx0.b r3 = r0.f50250w
            com.tencent.mm.plugin.bizui.widget.StoryListView r15 = r0.f50235f
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r14 = r0.f50249v
            r3.getClass()
            gy3.C87412m.m108594g(r15, r4)
            java.lang.String r4 = "report"
            gy3.C87412m.m108594g(r14, r4)
            if (r1 > r2) goto L_0x0270
            r4 = 0
        L_0x008e:
            int r16 = r4 + 1
            if (r1 == 0) goto L_0x0261
            android.view.View r10 = r15.getChildAt(r4)
            if (r10 != 0) goto L_0x009a
            goto L_0x0261
        L_0x009a:
            java.lang.Object r4 = r10.getTag()
            boolean r9 = r4 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18206a
            if (r9 == 0) goto L_0x00a5
            com.tencent.mm.plugin.brandservice.ui.timeline.item.a r4 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18206a) r4
            goto L_0x00a6
        L_0x00a5:
            r4 = 0
        L_0x00a6:
            if (r4 != 0) goto L_0x00aa
            goto L_0x0261
        L_0x00aa:
            com.tencent.mm.storage.o0 r13 = r4.f50327a
            if (r13 != 0) goto L_0x00b0
            goto L_0x0261
        L_0x00b0:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = r13.mo25768r2()
            r9.append(r11)
            r11 = 45
            r9.append(r11)
            boolean r11 = r13.field_isExpand
            r9.append(r11)
            java.lang.String r12 = r9.toString()
            java.util.HashMap<java.lang.String, java.lang.Boolean> r9 = r3.f62641c
            java.lang.String r11 = r13.mo25768r2()
            boolean r9 = r9.containsKey(r11)
            if (r9 == 0) goto L_0x0261
            java.util.HashMap<java.lang.String, java.lang.Boolean> r9 = r3.f62642d
            boolean r9 = r9.containsKey(r12)
            if (r9 != 0) goto L_0x0261
            java.util.HashMap<java.lang.String, java.lang.Boolean> r9 = r3.f62643e
            boolean r9 = r9.containsKey(r12)
            if (r9 == 0) goto L_0x00e8
            goto L_0x0261
        L_0x00e8:
            int r4 = r4.f50328b
            if (r1 != r2) goto L_0x00ee
            r9 = 1
            goto L_0x00ef
        L_0x00ee:
            r9 = 0
        L_0x00ef:
            int r11 = r10.getHeight()
            java.lang.String r6 = "MicroMsg.BizTimeLineExposeHelper"
            if (r11 > 0) goto L_0x0101
            java.lang.String r4 = "realExpose item height is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r4)
            r0 = 1
            r7 = 3
            goto L_0x0221
        L_0x0101:
            boolean r5 = r3.f62647i
            if (r5 != 0) goto L_0x010a
            r3.mo35255b(r15)
            r3.f62647i = r8
        L_0x010a:
            int r5 = r10.getTop()
            if (r5 >= 0) goto L_0x0115
            int r5 = r10.getTop()
            int r11 = r11 + r5
        L_0x0115:
            int r5 = r10.getBottom()
            int r8 = r3.f62645g
            if (r5 <= r8) goto L_0x0125
            int r5 = r10.getBottom()
            int r8 = r3.f62645g
            int r5 = r5 - r8
            int r11 = r11 - r5
        L_0x0125:
            float r5 = (float) r11
            int r8 = r10.getHeight()
            float r8 = (float) r8
            float r5 = r5 / r8
            rx3.g<java.lang.Boolean> r8 = qx0.C22140b.f62638m
            rx3.g<java.lang.Boolean> r8 = qx0.C22140b.f62638m
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x01f0
            int r8 = r10.getTop()
            int r11 = r10.getHeight()
            boolean r7 = r3.f62650l
            if (r7 != 0) goto L_0x014c
            goto L_0x01f0
        L_0x014c:
            if (r9 == 0) goto L_0x0151
            r7 = 0
            r3.f62650l = r7
        L_0x0151:
            int r7 = r13.f55529n1
            r0 = 1
            if (r7 != r0) goto L_0x0158
            r0 = 1
            goto L_0x0159
        L_0x0158:
            r0 = 0
        L_0x0159:
            if (r0 == 0) goto L_0x015d
            goto L_0x01f0
        L_0x015d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "reportFirstScreenCard pos "
            r0.append(r7)
            r0.append(r4)
            java.lang.String r7 = ", exposureRatio "
            r0.append(r7)
            r0.append(r5)
            java.lang.String r7 = ", isLastVisibleItem "
            r0.append(r7)
            r0.append(r9)
            java.lang.String r7 = ", contentHeight "
            r0.append(r7)
            int r7 = r3.f62645g
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 10
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r7 = com.tencent.p014mm.storage.C19636w0.f55626c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r17 = 0
            r6[r17] = r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 1
            r6[r7] = r4
            r4 = 2
            int r7 = r3.f62645g
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r4] = r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            r7 = 3
            r6[r7] = r4
            r4 = 4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r6[r4] = r11
            r4 = 5
            r11 = 100
            float r11 = (float) r11
            float r11 = r11 * r5
            int r11 = (int) r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r6[r4] = r11
            r4 = 6
            int r11 = com.tencent.p014mm.storage.C19613h1.m21029b(r13)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r6[r4] = r11
            r4 = 7
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6[r4] = r9
            r4 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r4] = r8
            r4 = 9
            r8 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r6[r4] = r9
            r4 = 28518(0x6f66, float:3.9962E-41)
            r0.mo160131h(r4, r6)
            goto L_0x01f2
        L_0x01f0:
            r7 = 3
            r8 = 1
        L_0x01f2:
            com.tencent.mm.pluginsdk.model.u r0 = r13.f55522g1
            float r4 = r0.f54996a
            int r6 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x01fb
            goto L_0x01fc
        L_0x01fb:
            r4 = r5
        L_0x01fc:
            r0.f54996a = r4
            boolean r0 = r13.mo25753A2()
            if (r0 == 0) goto L_0x020c
            com.tencent.mm.storage.t r0 = com.tencent.p014mm.storage.C19627t.f55586a
            r0.mo25844r()
            float r0 = com.tencent.p014mm.storage.C19627t.f55581I
            goto L_0x021a
        L_0x020c:
            rx3.g r0 = r3.f62648j
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L_0x021a:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0220
            r0 = 1
            goto L_0x0221
        L_0x0220:
            r0 = 0
        L_0x0221:
            if (r0 == 0) goto L_0x025e
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r3.f62642d
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r0.put(r12, r4)
            zt3.t r0 = zt3.C119157j.f356862d
            qx0.d r4 = new qx0.d
            r9 = r4
            r11 = r13
            r5 = r12
            r12 = r3
            r6 = r13
            r13 = r5
            r5 = r14
            r9.<init>(r10, r11, r12, r13, r14)
            boolean r6 = r6.mo25753A2()
            if (r6 == 0) goto L_0x0246
            com.tencent.mm.storage.t r6 = com.tencent.p014mm.storage.C19627t.f55586a
            r6.mo25844r()
            long r9 = com.tencent.p014mm.storage.C19627t.f55582J
            goto L_0x0254
        L_0x0246:
            rx3.g r6 = r3.f62649k
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            long r9 = r6.longValue()
        L_0x0254:
            zt3.j r0 = (zt3.C119157j) r0
            r0.getClass()
            r6 = 0
            r0.mo183892w(r4, r9, r6)
            goto L_0x0264
        L_0x025e:
            r5 = r14
            r6 = 0
            goto L_0x0264
        L_0x0261:
            r5 = r14
            r6 = 0
            r7 = 3
        L_0x0264:
            if (r1 == r2) goto L_0x0270
            int r1 = r1 + 1
            r0 = r18
            r14 = r5
            r4 = r16
            r5 = 3
            goto L_0x008e
        L_0x0270:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI.mo22781I7(int, int):void");
    }

    /* renamed from: J7 */
    public void mo22782J7() {
        Log.m105918d("MicroMsg.BizTimeLineUI", "hideActionBarCustomView");
        View view = this.f50238i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI", "hideActionBarCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI", "hideActionBarCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setMMTitleVisibility(0);
    }

    /* renamed from: K7 */
    public final void mo22783K7(C19623o0 o0Var) {
        this.f50246s.f51449t = false;
        this.f50211D = false;
        int max = Math.max(0, this.f50235f.getFirstVisiblePosition() - this.f50235f.getHeaderViewsCount());
        this.f50246s.mo23136C(o0Var);
        C18508z2 z2Var = this.f50246s;
        z2Var.mo23136C(z2Var.getItem(max));
        StoryListView storyListView = this.f50235f;
        if (!(storyListView == null || this.f50246s == null)) {
            int firstVisiblePosition = storyListView.getFirstVisiblePosition();
            int lastVisiblePosition = this.f50235f.getLastVisiblePosition();
            mo22781I7(firstVisiblePosition, lastVisiblePosition);
            int i = lastVisiblePosition > 0 ? lastVisiblePosition - 1 : 0;
            for (int i2 = firstVisiblePosition > 0 ? firstVisiblePosition - 1 : 0; i2 <= i; i2++) {
                C19623o0 q = this.f50246s.getItem(i2);
                if (q != null) {
                    this.f50246s.mo23149h(q.field_talker);
                    this.f50249v.mo22993t(q);
                }
            }
        }
        Log.m105925i("MicroMsg.BizTimeLineUI", "resetKeep pos %d", Integer.valueOf(max));
    }

    /* renamed from: L7 */
    public final void mo22784L7(C19623o0 o0Var, int i) {
        if (this.f50235f != null && !isFinishing()) {
            C72924q1.m85521b(this.f50235f, i, f50205Q0, false, false);
            if (this.f50235f.getFirstVisiblePosition() == i) {
                mo22783K7(o0Var);
                Log.m105925i("MicroMsg.BizTimeLineUI", "tryToScrollToPosition success tryScrollTimes: %d", Integer.valueOf(this.f50228V));
                return;
            }
            this.f50235f.postDelayed(new C18197d4(this, o0Var, i), 10);
        }
    }

    /* renamed from: M7 */
    public void mo22785M7() {
        StoryListView storyListView;
        long currentTimeMillis = System.currentTimeMillis() - this.f50230X;
        boolean z = this.f50231Y;
        if (!z || currentTimeMillis >= 200) {
            Log.m105919d("MicroMsg.BizTimeLineUI", "try2UpdateActionBarCustomView isDoingUpdateView %s,interval %s", Boolean.valueOf(z), Long.valueOf(currentTimeMillis));
            this.f50231Y = true;
            if (currentTimeMillis < 100) {
                MMHandlerThread.postToMainThreadDelayed(new C18181b(), 100);
                return;
            }
            C18508z2 z2Var = this.f50246s;
            if (z2Var != null && !this.f50213F && ((LinkedList) z2Var.f51439g).size() > 0) {
                long j = ((C19623o0) ((LinkedList) this.f50246s.f51439g).get(0)).field_orderFlag;
                if (this.f50211D || (storyListView = this.f50235f) == null || storyListView.getFirstVisiblePosition() != 0) {
                    int TY = C48009v0.Jx0().mo25792TY(j & -4294967296L);
                    Log.m105919d("MicroMsg.BizTimeLineUI", "updateActionBarCustomView %d", Integer.valueOf(TY));
                    if (TY > 0) {
                        setMMTitleVisibility(8);
                        View view = this.f50238i;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI", "updateActionBarCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI", "updateActionBarCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f50242p.setText(getString(C0966R.string.apj, new Object[]{Integer.valueOf(TY)}));
                    } else {
                        mo22782J7();
                    }
                } else {
                    View view3 = this.f50238i;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI", "updateActionBarCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI", "updateActionBarCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    setMMTitleVisibility(0);
                }
            }
            this.f50230X = System.currentTimeMillis();
            this.f50231Y = false;
            return;
        }
        Log.m105918d("MicroMsg.BizTimeLineUI", "DoingUpdateView return");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* renamed from: N7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22786N7() {
        /*
            r8 = this;
            java.lang.Class<ln.f> r0 = p196ln.C76705f.class
            boolean r1 = r8.isFinishing()
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            com.tencent.mm.storage.d1 r1 = rb0.C48009v0.Kx0()
            int r1 = r1.mo25734SE()
            r2 = 8
            if (r1 <= 0) goto L_0x0180
            android.widget.LinearLayout r3 = r8.f50240n
            r4 = 0
            r3.setVisibility(r4)
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r3 = r8.f50245r
            r5 = 1
            if (r3 == 0) goto L_0x0051
            android.widget.LinearLayout r3 = r8.f50240n
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r6 = r8.f50245r
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b r6 = r6.f51176r
            if (r6 == 0) goto L_0x003f
            android.view.View r6 = r6.mo23054c()
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x003a
            r6 = 1
            goto L_0x003b
        L_0x003a:
            r6 = 0
        L_0x003b:
            if (r6 != r5) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x003f:
            r6 = 0
        L_0x0040:
            if (r6 == 0) goto L_0x0044
            r6 = 4
            goto L_0x0046
        L_0x0044:
            r6 = 20
        L_0x0046:
            int r6 = kg3.C76577a.m92151b(r8, r6)
            r3.topMargin = r6
            android.widget.LinearLayout r6 = r8.f50240n
            r6.setLayoutParams(r3)
        L_0x0051:
            android.widget.TextView r3 = r8.f50241o
            r6 = 2131822701(0x7f11086d, float:1.927818E38)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7[r4] = r1
            java.lang.String r1 = r8.getString(r6, r7)
            r3.setText(r1)
            com.tencent.mm.storage.d1 r1 = rb0.C48009v0.Kx0()
            com.tencent.mm.storage.o0 r1 = r1.mo25740kD()
            if (r1 == 0) goto L_0x016b
            android.widget.ImageView r2 = r8.f50239j
            r2.setVisibility(r4)
            boolean r2 = r1.mo25757E2()
            r3 = 2131231871(0x7f08047f, float:1.8079835E38)
            if (r2 == 0) goto L_0x00ca
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            java.lang.String r4 = r1.field_talker
            com.tencent.mm.storage.z1 r2 = r2.get(r4)
            if (r2 == 0) goto L_0x00a6
            boolean r2 = r2.mo62927s3()
            if (r2 == 0) goto L_0x00a6
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.f r0 = (p196ln.C76705f) r0
            android.widget.ImageView r2 = r8.f50239j
            java.lang.String r3 = r1.field_talker
            r0.mo106849z(r2, r3)
            goto L_0x0155
        L_0x00a6:
            com.tencent.mm.storage.i0 r0 = r1.mo25771u2()
            if (r0 == 0) goto L_0x0155
            hc0.c$b r0 = new hc0.c$b
            r0.<init>()
            r0.f59359o = r3
            r0.f59347c = r5
            gc0.a r2 = gc0.C20828a.m22825b()
            com.tencent.mm.storage.i0 r3 = r1.mo25771u2()
            java.lang.String r3 = r3.f55494d
            android.widget.ImageView r4 = r8.f50239j
            hc0.c r0 = r0.mo32666a()
            r2.mo32519h(r3, r4, r0)
            goto L_0x0155
        L_0x00ca:
            boolean r2 = r1.mo25755C2()
            if (r2 == 0) goto L_0x0132
            java.lang.String r2 = com.tencent.p014mm.storage.C19615i1.m21063j(r1)
            java.lang.String r6 = com.tencent.p014mm.storage.C19615i1.m21056c(r1)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x00f7
            hc0.c$b r0 = new hc0.c$b
            r0.<init>()
            r0.f59359o = r3
            r0.f59347c = r5
            r0.f59364t = r5
            gc0.a r3 = gc0.C20828a.m22825b()
            android.widget.ImageView r5 = r8.f50239j
            hc0.c r0 = r0.mo32666a()
            r3.mo32519h(r6, r5, r0)
            goto L_0x0128
        L_0x00f7:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 == 0) goto L_0x010b
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.f r0 = (p196ln.C76705f) r0
            android.widget.ImageView r3 = r8.f50239j
            java.lang.String r5 = r1.field_talker
            r0.mo106849z(r3, r5)
            goto L_0x0128
        L_0x010b:
            boolean r3 = eb0.C45628s0.m50738C(r2)
            if (r3 == 0) goto L_0x011d
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.f r0 = (p196ln.C76705f) r0
            android.widget.ImageView r3 = r8.f50239j
            r0.mo106822J5(r3, r2)
            goto L_0x0128
        L_0x011d:
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.f r0 = (p196ln.C76705f) r0
            android.widget.ImageView r3 = r8.f50239j
            r0.mo106849z(r3, r2)
        L_0x0128:
            int r0 = com.tencent.p014mm.storage.C19615i1.m21062i(r1)
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r3 = r8.f50249v
            r3.mo22991r(r0, r2, r4)
            goto L_0x0155
        L_0x0132:
            java.lang.String r2 = r1.field_talker
            boolean r2 = eb0.C45628s0.m50738C(r2)
            if (r2 == 0) goto L_0x0148
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.f r0 = (p196ln.C76705f) r0
            android.widget.ImageView r2 = r8.f50239j
            java.lang.String r3 = r1.field_talker
            r0.mo106822J5(r2, r3)
            goto L_0x0155
        L_0x0148:
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.f r0 = (p196ln.C76705f) r0
            android.widget.ImageView r2 = r8.f50239j
            java.lang.String r3 = r1.field_talker
            r0.mo106849z(r2, r3)
        L_0x0155:
            long r0 = r1.field_msgId
            com.tencent.p014mm.storage.C19636w0.f55625b = r0
            android.content.SharedPreferences r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "biz_time_line_last_notify_msg_id"
            android.content.SharedPreferences$Editor r0 = r2.putLong(r3, r0)
            r0.apply()
            goto L_0x0170
        L_0x016b:
            android.widget.ImageView r0 = r8.f50239j
            r0.setVisibility(r2)
        L_0x0170:
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r0 = r8.f50246s
            if (r0 == 0) goto L_0x0185
            int r0 = r0.getCount()
            if (r0 != 0) goto L_0x0185
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r0 = r8.f50246s
            r0.notifyDataSetChanged()
            goto L_0x0185
        L_0x0180:
            android.widget.LinearLayout r0 = r8.f50240n
            r0.setVisibility(r2)
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI.mo22786N7():void");
    }

    /* renamed from: Q6 */
    public void mo22787Q6(C22079o oVar) {
        if (!this.f50220M.contains(oVar)) {
            this.f50220M.add(oVar);
        }
    }

    public int getForceOrientation() {
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58782dM(new C34826a()) == 1;
        Log.m105925i("MicroMsg.BizTimeLineUI", "blockForceOrientation = %s", Boolean.valueOf(z));
        if (z || C85875k4.m106210y() || C85875k4.m106157N()) {
            Log.m105924i("MicroMsg.BizTimeLineUI", "keep orientation unspecified");
            return super.getForceOrientation();
        }
        Log.m105924i("MicroMsg.BizTimeLineUI", "force orientation portrait");
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6596j_;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet hashSet = new HashSet(super.importUIComponents());
        hashSet.add(C8465b.class);
        return hashSet;
    }

    /* renamed from: n5 */
    public void mo22788n5(C22078m mVar) {
        Set<C22078m> set = this.f50221N;
        if (!set.contains(set)) {
            this.f50221N.add(mVar);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (C22079o onConfigurationChanged : this.f50220M) {
            onConfigurationChanged.onConfigurationChanged(configuration);
        }
        BizTimeLineHotView bizTimeLineHotView = this.f50245r;
        if (bizTimeLineHotView != null) {
            bizTimeLineHotView.onConfigurationChanged(configuration);
        }
        C22140b bVar = this.f50250w;
        StoryListView storyListView = this.f50235f;
        bVar.getClass();
        C87412m.m108594g(storyListView, "view");
        C87412m.m108594g(configuration, "newConfig");
        C119179t tVar = C119157j.f356862d;
        C22150e eVar = new C22150e(bVar, storyListView);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(eVar, 100, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x02ab, code lost:
        if ((r0 - com.tencent.p014mm.storage.C19636w0.f55629f) < ((long) (r2 * 1000))) goto L_0x02ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r31) {
        /*
            r30 = this;
            r7 = r30
            java.lang.Class<ex0.d> r8 = ex0.C45696d.class
            com.tencent.mm.plugin.brandservice.ui.timeline.r4$a r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C68777r4.f197582a
            java.lang.String r9 = "MicroMsg.BizTimeReport"
            if (r0 != 0) goto L_0x000b
            goto L_0x001a
        L_0x000b:
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C68777r4.f197583b
            long r1 = r1 - r3
            int r2 = (int) r1
            r0.f51346a = r2
            java.lang.String r0 = "markOnCreateStart"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
        L_0x001a:
            r10 = 1
            com.tencent.p014mm.storage.C19636w0.m21176r(r10)
            fx0.C45823f.m51112a()
            super.onCreate(r31)
            r0 = 2131301625(0x7f0914f9, float:1.8221313E38)
            java.lang.Object r0 = r7.mo176895$(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f50234e = r0
            r1 = 2131822668(0x7f11084c, float:1.9278114E38)
            r0.setText(r1)
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineMusicImp r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineMusicImp
            r0.<init>(r7)
            r7.f50247t = r0
            com.tencent.mm.sdk.event.IListener r0 = r0.f267711b
            r0.alive()
            long r0 = java.lang.System.currentTimeMillis()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r11
            int r1 = (int) r0
            r7.f50208A = r1
            android.content.Intent r0 = r30.getIntent()
            java.lang.String r1 = "biz_enter_source"
            int r0 = r0.getIntExtra(r1, r10)
            r7.f50209B = r0
            long r0 = java.lang.System.currentTimeMillis()
            r7.f50251x = r0
            com.tencent.p014mm.storage.C19636w0.m21177s()
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.m3
            int r1 = r7.f50208A
            long r2 = r7.f50251x
            android.content.Intent r4 = r30.getIntent()
            r0.<init>(r1, r2, r4)
            r7.f50249v = r0
            qx0.b r0 = new qx0.b
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r1 = r7.f50249v
            r0.<init>(r7, r1)
            r7.f50250w = r0
            int r0 = r7.f50208A
            com.tencent.p014mm.storage.C19636w0.f55626c = r0
            cy0.C20372d.f57089d = r0
            com.tencent.mm.plugin.brandservice.ui.timeline.h4 r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.h4
            r0.<init>(r7)
            r7.setTitleBarDoubleClickListener(r0)
            kw0.a r0 = kw0.C46746a.f125826a
            rx3.g r0 = kw0.C46746a.f125828c
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Class<c00.n> r1 = c00.C0405n.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            c00.n r1 = (c00.C0405n) r1
            boolean r1 = r1.mo279e()
            r1 = r1 ^ r10
            r13 = 2
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r14 = 0
            r2[r14] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2[r10] = r3
            java.lang.String r15 = "MicroMsg.BizTimeLineUI"
            java.lang.String r3 = "open search entrance:%b, isNotTeenMode: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r2)
            if (r0 == 0) goto L_0x00cd
            if (r1 == 0) goto L_0x00cd
            r0 = 2131838050(0x7f114462, float:1.9309312E38)
            r1 = 2131755027(0x7f100013, float:1.9140922E38)
            com.tencent.mm.plugin.brandservice.ui.timeline.e4 r2 = new com.tencent.mm.plugin.brandservice.ui.timeline.e4
            r2.<init>(r7)
            r7.addIconOptionMenu((int) r14, (int) r0, (int) r1, (android.view.MenuItem.OnMenuItemClickListener) r2)
        L_0x00cd:
            com.tencent.mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct
            r0.<init>()
            com.tencent.mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct
            r1.<init>()
            jx0.b r2 = jx0.C33702b.f91166a
            boolean r2 = r2.mo59262a()
            if (r2 == 0) goto L_0x00ff
            r2 = 3
            r0.f107854d = r2
            r0.mo86054n()
            r2 = 1
            r3 = 2131822711(0x7f110877, float:1.9278201E38)
            r4 = 2131756344(0x7f100538, float:1.9143593E38)
            com.tencent.mm.plugin.brandservice.ui.timeline.f4 r5 = new com.tencent.mm.plugin.brandservice.ui.timeline.f4
            r5.<init>(r7, r1)
            android.view.View$OnLongClickListener r6 = r7.f50229W
            r0 = r30
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r0.addIconOptionMenu((int) r1, (int) r2, (int) r3, (android.view.MenuItem.OnMenuItemClickListener) r4, (android.view.View.OnLongClickListener) r5)
            goto L_0x011e
        L_0x00ff:
            r2 = 4
            r0.f107854d = r2
            r0.mo86054n()
            r2 = 1
            r3 = 2131822708(0x7f110874, float:1.9278195E38)
            r4 = 2131755035(0x7f10001b, float:1.9140938E38)
            com.tencent.mm.plugin.brandservice.ui.timeline.g4 r5 = new com.tencent.mm.plugin.brandservice.ui.timeline.g4
            r5.<init>(r7, r1)
            android.view.View$OnLongClickListener r6 = r7.f50229W
            r0 = r30
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r0.addIconOptionMenu((int) r1, (int) r2, (int) r3, (android.view.MenuItem.OnMenuItemClickListener) r4, (android.view.View.OnLongClickListener) r5)
        L_0x011e:
            r0 = 2131822732(0x7f11088c, float:1.9278244E38)
            r7.setMMTitle((int) r0)
            androidx.appcompat.app.AppCompatActivity r0 = r30.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131099800(0x7f060098, float:1.7811963E38)
            int r0 = r0.getColor(r1)
            r7.setMMTitleColor(r0)
            com.tencent.mm.plugin.brandservice.ui.timeline.i4 r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.i4
            r0.<init>(r7)
            r1 = 2131755023(0x7f10000f, float:1.9140914E38)
            r7.setBackBtn(r0, r1)
            android.view.LayoutInflater r0 = r30.getLayoutInflater()
            r1 = 2131493310(0x7f0c01be, float:1.8610097E38)
            r6 = 0
            android.view.View r0 = r0.inflate(r1, r6)
            r7.f50238i = r0
            r1 = 2131298133(0x7f090755, float:1.821423E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f50242p = r0
            r1 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r10, r1)
            android.view.View r0 = r7.f50238i
            r1 = 2131298132(0x7f090754, float:1.8214229E38)
            android.view.View r0 = r0.findViewById(r1)
            r7.f50244q = r0
            com.tencent.mm.ui.MMActivityController r0 = r30.getController()
            androidx.appcompat.app.ActionBar r0 = r0.f348065F
            android.view.View r0 = r0.mo91099j()
            boolean r1 = r0 instanceof android.widget.LinearLayout
            r5 = -1
            if (r1 == 0) goto L_0x0198
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.view.View r1 = r7.f50238i
            r0.addView(r1)
            android.view.View r0 = r7.f50238i
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r0.width = r5
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.weight = r1
            r1 = 16
            r0.gravity = r1
            android.view.View r1 = r7.f50238i
            r1.setLayoutParams(r0)
            goto L_0x01b7
        L_0x0198:
            boolean r1 = r0 instanceof android.widget.RelativeLayout
            if (r1 == 0) goto L_0x01b7
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            android.view.View r1 = r7.f50238i
            r0.addView(r1)
            android.view.View r0 = r7.f50238i
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            r0.width = r5
            r1 = 15
            r0.addRule(r1)
            android.view.View r1 = r7.f50238i
            r1.setLayoutParams(r0)
        L_0x01b7:
            android.view.View r0 = r7.f50244q
            com.tencent.mm.plugin.brandservice.ui.timeline.k4 r1 = new com.tencent.mm.plugin.brandservice.ui.timeline.k4
            r1.<init>(r7)
            r0.setOnClickListener(r1)
            android.view.View r0 = r7.f50238i
            r1 = 8
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo10233c(r1)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI"
            java.lang.String r19 = "initActionBarCustomView"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r1 = r2.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI"
            java.lang.String r18 = "initActionBarCustomView"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            r0 = 2131298105(0x7f090739, float:1.8214174E38)
            java.lang.Object r0 = r7.mo176895$(r0)
            com.tencent.mm.plugin.bizui.widget.StoryListView r0 = (com.tencent.p014mm.plugin.bizui.widget.StoryListView) r0
            r7.f50235f = r0
            android.view.LayoutInflater r1 = r30.getLayoutInflater()
            r2 = 2131493314(0x7f0c01c2, float:1.8610105E38)
            android.view.View r1 = r1.inflate(r2, r6)
            r7.f50236g = r1
            r0.addFooterView(r1)
            com.tencent.mm.plugin.bizui.widget.StoryListView r0 = r7.f50235f
            android.view.View r1 = r7.f50237h
            if (r1 != 0) goto L_0x023f
            android.view.LayoutInflater r1 = r30.getLayoutInflater()
            r2 = 2131493315(0x7f0c01c3, float:1.8610107E38)
            android.view.View r1 = r1.inflate(r2, r6)
            r7.f50237h = r1
            r2 = 2131298071(0x7f090717, float:1.8214105E38)
            android.view.View r1 = r1.findViewById(r2)
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotView) r1
            r7.f50245r = r1
        L_0x023f:
            android.view.View r1 = r7.f50237h
            r0.addHeaderView(r1)
            int r16 = f50206R0
            android.content.Intent r0 = r30.getIntent()
            java.lang.String r1 = "Main_UnreadCount"
            int r17 = r0.getIntExtra(r1, r14)
            boolean r4 = com.tencent.p014mm.storage.C19636w0.m21170l()
            r7.f50211D = r4
            qx0.b r0 = r7.f50250w
            r1 = r4 ^ 1
            r0.f62650l = r1
            boolean r0 = com.tencent.p014mm.storage.C19636w0.m21171m()
            if (r0 != 0) goto L_0x0264
            r0 = r4
            goto L_0x02b0
        L_0x0264:
            if (r4 == 0) goto L_0x0267
            goto L_0x02ad
        L_0x0267:
            if (r17 <= 0) goto L_0x026a
            goto L_0x02af
        L_0x026a:
            long r0 = java.lang.System.currentTimeMillis()
            eb0.z$b r2 = eb0.C20583z.f57949a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = r2.mo32230c()
            r3 = 1800(0x708, float:2.522E-42)
            java.lang.String r5 = "ProtectionTime"
            int r2 = r2.decodeInt(r5, r3)
            int r3 = com.tencent.p014mm.storage.C19636w0.m21163e()
            if (r2 >= r3) goto L_0x0283
            r2 = r3
        L_0x0283:
            r3 = 86400(0x15180, float:1.21072E-40)
            if (r2 <= r3) goto L_0x028b
            r2 = 86400(0x15180, float:1.21072E-40)
        L_0x028b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "protectionTime = "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "Micromsg.BizTLRecFeedsDataUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            int r2 = r2 * 1000
            long r18 = com.tencent.p014mm.storage.C19636w0.f55629f
            long r0 = r0 - r18
            long r2 = (long) r2
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x02af
        L_0x02ad:
            r0 = 1
            goto L_0x02b0
        L_0x02af:
            r0 = 0
        L_0x02b0:
            r7.f50212E = r0
            if (r0 == 0) goto L_0x02e3
            com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
            long r1 = com.tencent.p014mm.storage.C19636w0.f55630g
            java.util.List r0 = r0.mo25808mI(r1)
            java.util.Map<java.lang.Long, java.lang.Integer> r1 = fy0.C20739g.f58625a
            fy0.f r1 = new fy0.f
            r1.<init>(r0)
            r2 = 0
            java.lang.String r5 = "BrandServiceWorkerThread"
            dx0.C31332a.m39373a(r5, r1, r2)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r2 = r0
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r14] = r2
            java.lang.String r2 = "keep data, list.size = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r2, r1)
            r10 = r0
            goto L_0x03c8
        L_0x02e3:
            boolean r0 = com.tencent.p014mm.storage.C19636w0.m21171m()
            r1 = 10
            if (r0 == 0) goto L_0x0360
            com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
            eb0.z$b r2 = eb0.C20583z.f57949a
            int r2 = r2.mo32233g()
            int r2 = java.lang.Math.min(r2, r1)
            long r18 = r0.mo25791TO()
            r3 = 32
            long r11 = r18 << r3
            zh3.f r3 = r0.f55550d
            java.lang.String[] r5 = new java.lang.String[r10]
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r10 = ""
            r13.append(r10)
            r13.append(r11)
            java.lang.String r10 = r13.toString()
            r5[r14] = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "orderFlag DESC limit "
            r10.append(r11)
            r10.append(r2)
            java.lang.String r29 = r10.toString()
            r24 = 0
            r27 = 0
            r28 = 0
            java.lang.String r23 = "BizTimeLineInfo"
            java.lang.String r25 = "orderFlag>=?"
            r22 = r3
            r26 = r5
            android.database.Cursor r2 = r22.query(r23, r24, r25, r26, r27, r28, r29)
            java.util.List r2 = r0.mo25797bD(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)
            if (r3 == 0) goto L_0x0368
            java.lang.String r2 = "MicroMsg.BizTimeLineInfoStorage"
            java.lang.String r3 = "firstGroupMsgList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1378(0x562, double:6.81E-321)
            r25 = 3
            r27 = 1
            r29 = 0
            r22.idkeyStat(r23, r25, r27, r29)
            java.util.List r2 = r0.mo25798bF(r1)
            goto L_0x0368
        L_0x0360:
            com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
            java.util.List r2 = r0.mo25798bF(r1)
        L_0x0368:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r0.addAll(r2)
            java.util.Map<java.lang.Long, java.lang.Integer> r1 = fy0.C20739g.f58625a
            java.util.Iterator r1 = r0.iterator()
        L_0x0376:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x03bb
            java.lang.Object r3 = r1.next()
            com.tencent.mm.storage.o0 r3 = (com.tencent.p014mm.storage.C19623o0) r3
            com.tencent.mm.storage.t r5 = com.tencent.p014mm.storage.C19627t.f55586a
            boolean r10 = r5.mo25833g()
            if (r10 == 0) goto L_0x039a
            boolean r10 = r3.mo25753A2()
            if (r10 == 0) goto L_0x039a
            k40.a r1 = f40.C86709a0.m107533q(r8)
            ex0.d r1 = (ex0.C45696d) r1
            r1.mo71001l4()
            goto L_0x03bb
        L_0x039a:
            boolean r5 = r5.mo25840n()
            if (r5 == 0) goto L_0x0376
            boolean r5 = r3.mo25758F2()
            if (r5 == 0) goto L_0x0376
            te3.re4 r3 = r3.mo25774x2()
            if (r3 == 0) goto L_0x0376
            int r3 = r3.f64521j
            r5 = 1001(0x3e9, float:1.403E-42)
            if (r3 != r5) goto L_0x0376
            k40.a r1 = f40.C86709a0.m107533q(r8)
            ex0.d r1 = (ex0.C45696d) r1
            r1.mo71001l4()
        L_0x03bb:
            android.os.MessageQueue r1 = android.os.Looper.myQueue()
            fy0.e r3 = new fy0.e
            r3.<init>(r0, r6)
            r1.addIdleHandler(r3)
            r10 = r2
        L_0x03c8:
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            boolean r1 = r7.f50211D
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r14] = r1
            boolean r1 = r7.f50212E
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r2 = 2
            r0[r2] = r1
            r1 = 3
            int r2 = r10.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 4
            int r2 = r7.f50208A
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            java.lang.String r1 = "initListView keepPos %b, keepData %b, unReadCount %d, size=%d, sessionId=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r0)
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r11 = new com.tencent.mm.plugin.brandservice.ui.timeline.z2
            boolean r3 = r7.f50211D
            boolean r5 = r7.f50212E
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r12 = r7.f50249v
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r13 = r7.f50245r
            r0 = r11
            r1 = r30
            r2 = r10
            r22 = r4
            r4 = r5
            r23 = -1
            r5 = r12
            r12 = r6
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f50246s = r11
            fx0.b r0 = fx0.C20729b.f58601a
            com.tencent.mm.plugin.bizui.widget.StoryListView r0 = r7.f50235f
            java.lang.String r1 = "listView"
            gy3.C87412m.m108594g(r0, r1)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BizFinderLineStatusChangedEvent> r1 = fx0.C20729b.f58605e
            if (r1 != 0) goto L_0x043a
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r11)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r0)
            com.tencent.mm.app.f r3 = com.tencent.p014mm.app.C40008f.f107254d
            com.tencent.mm.plugin.brandservice.model.BizFinderLiveUILogic$addLiveStatusChangeListener$1 r4 = new com.tencent.mm.plugin.brandservice.model.BizFinderLiveUILogic$addLiveStatusChangeListener$1
            r4.<init>(r2, r0, r1, r3)
            fx0.C20729b.f58605e = r4
            r4.alive()
        L_0x043a:
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r0 = r7.f50249v
            int r1 = f50206R0
            if (r1 <= 0) goto L_0x0443
            int r1 = r1 + -1
            goto L_0x0444
        L_0x0443:
            r1 = 0
        L_0x0444:
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r2 = r7.f50246s
            java.util.List<com.tencent.mm.storage.o0> r2 = r2.f51439g
            r0.f51067a = r1
            r0.f51080n = r2
            com.tencent.mm.storage.t r2 = com.tencent.p014mm.storage.C19627t.f55586a
            int r2 = r2.mo25831e()
            com.tencent.mm.plugin.brandservice.ui.timeline.o3 r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18418o3.f51098a
            int r1 = java.lang.Math.max(r2, r1)
            java.util.List<com.tencent.mm.storage.o0> r2 = r0.f51080n
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$c<java.lang.String, com.tencent.mm.plugin.brandservice.ui.timeline.m3$b> r0 = r0.f51081o
            java.lang.String r3 = "sessionItemCache"
            gy3.C87412m.m108594g(r0, r3)
            rx3.g r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18418o3.f51100c
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0473
            goto L_0x04ac
        L_0x0473:
            if (r2 != 0) goto L_0x0476
            goto L_0x04ac
        L_0x0476:
            int r3 = r2.size()
            if (r3 > r1) goto L_0x047d
            goto L_0x04ac
        L_0x047d:
            java.lang.Object r3 = r2.get(r1)
            com.tencent.mm.storage.o0 r3 = (com.tencent.p014mm.storage.C19623o0) r3
            long r4 = r3.mo25767q2()
            com.tencent.mm.storage.p0 r6 = rb0.C48009v0.Jx0()
            long r23 = r6.mo25791TO()
            int r6 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r6 >= 0) goto L_0x049b
            java.lang.String r0 = "MicroMsg.BizTimeLineResortHelper"
            java.lang.String r1 = "onEnter not newest group"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x04ac
        L_0x049b:
            zt3.t r4 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.brandservice.ui.timeline.q3 r5 = new com.tencent.mm.plugin.brandservice.ui.timeline.q3
            r5.<init>(r3, r1, r2, r0)
            r0 = 800(0x320, double:3.953E-321)
            zt3.j r4 = (zt3.C119157j) r4
            r4.getClass()
            r4.mo183892w(r5, r0, r14)
        L_0x04ac:
            r0 = 2131310184(0x7f093668, float:1.8238673E38)
            java.lang.Object r0 = r7.mo176895$(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.f50240n = r0
            r0 = 2131310185(0x7f093669, float:1.8238675E38)
            java.lang.Object r0 = r7.mo176895$(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f50241o = r0
            r0 = 2131310183(0x7f093667, float:1.823867E38)
            java.lang.Object r0 = r7.mo176895$(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.f50239j = r0
            fy0.i r0 = fy0.C8219i.f27144a
            android.widget.TextView r1 = r7.f50241o
            r0.mo9271b(r1)
            r30.mo22786N7()
            android.widget.LinearLayout r0 = r7.f50240n
            com.tencent.mm.plugin.brandservice.ui.timeline.j4 r1 = new com.tencent.mm.plugin.brandservice.ui.timeline.j4
            r1.<init>(r7)
            r0.setOnClickListener(r1)
            com.tencent.mm.plugin.bizui.widget.StoryListView r0 = r7.f50235f
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r1 = r7.f50246s
            r0.setAdapter(r1)
            com.tencent.mm.plugin.bizui.widget.StoryListView r0 = r7.f50235f
            r0.setFooterDividersEnabled(r14)
            com.tencent.mm.plugin.bizui.widget.StoryListView r0 = r7.f50235f
            com.tencent.mm.plugin.brandservice.ui.timeline.p4 r1 = new com.tencent.mm.plugin.brandservice.ui.timeline.p4
            r1.<init>(r7)
            r0.setOnScrollListener(r1)
            com.tencent.p014mm.storage.C19641z0.f55649e = r14
            com.tencent.mm.plugin.bizui.widget.StoryListView r0 = r7.f50235f
            com.tencent.mm.plugin.brandservice.ui.timeline.q4 r1 = new com.tencent.mm.plugin.brandservice.ui.timeline.q4
            r1.<init>(r7)
            r0.setOnTouchListener(r1)
            com.tencent.mm.plugin.bizui.widget.StoryListView r0 = r7.f50235f
            android.widget.TextView r1 = r7.f50234e
            r0.setEmptyView(r1)
            boolean r0 = r7.f50211D
            if (r0 == 0) goto L_0x0562
            if (r16 == 0) goto L_0x0562
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r0 = r7.f50246s
            if (r0 == 0) goto L_0x0562
            com.tencent.mm.plugin.bizui.widget.StoryListView r0 = r7.f50235f
            if (r0 == 0) goto L_0x0562
            java.lang.String r0 = f50207y0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0521
            goto L_0x0562
        L_0x0521:
            r0 = 0
        L_0x0522:
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r1 = r7.f50246s
            int r1 = r1.getCount()
            if (r0 >= r1) goto L_0x055f
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r1 = r7.f50246s
            com.tencent.mm.storage.o0 r1 = r1.getItem(r0)
            if (r1 == 0) goto L_0x055b
            java.lang.String r2 = f50207y0
            java.lang.String r3 = r1.mo25768r2()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r3)
            if (r2 == 0) goto L_0x055b
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2[r14] = r3
            int r3 = f50205Q0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "tryToScrollToPosition %d top %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r2)
            int r0 = r0 + r4
            r7.mo22784L7(r1, r0)
            goto L_0x0562
        L_0x055b:
            r2 = 2
            int r0 = r0 + 1
            goto L_0x0522
        L_0x055f:
            r7.mo22783K7(r12)
        L_0x0562:
            com.tencent.mm.plugin.bizui.widget.StoryListView r6 = r7.f50235f
            com.tencent.mm.plugin.brandservice.ui.timeline.a4 r11 = new com.tencent.mm.plugin.brandservice.ui.timeline.a4
            r0 = r11
            r1 = r30
            r2 = r22
            r3 = r16
            r4 = r10
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 10
            r6.postDelayed(r11, r0)
            com.tencent.mm.plugin.bizui.widget.StoryListView r0 = r7.f50235f
            com.tencent.mm.plugin.brandservice.ui.timeline.b4 r1 = new com.tencent.mm.plugin.brandservice.ui.timeline.b4
            r1.<init>(r7)
            r0.addOnLayoutChangeListener(r1)
            com.tencent.mm.storage.d1 r0 = rb0.C48009v0.Kx0()
            com.tencent.mm.storage.p0$$h r1 = r7.f50222P
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            com.tencent.mm.sdk.storage.MStorageEvent<com.tencent.mm.storage.p0$$h, com.tencent.mm.storage.p0$$f> r0 = r0.f55478e
            r0.add(r1, (android.os.Looper) r2)
            android.os.MessageQueue r0 = android.os.Looper.myQueue()
            com.tencent.mm.plugin.brandservice.ui.timeline.c4 r1 = new com.tencent.mm.plugin.brandservice.ui.timeline.c4
            r1.<init>(r7)
            r0.addIdleHandler(r1)
            wc3.C78538u.m94868d(r30)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FollowUserEvent> r0 = r7.f50223Q
            r0.alive()
            com.tencent.mm.sdk.event.IListener r0 = r7.f50243p0
            r0.alive()
            com.tencent.mm.sdk.event.IListener r0 = r7.f50224R
            r0.alive()
            com.tencent.mm.sdk.event.IListener r0 = r7.f50225S
            r0.alive()
            com.tencent.mm.sdk.event.IListener r0 = r7.f50226T
            r0.alive()
            r0 = 90
            k40.a r1 = f40.C86709a0.m107533q(r8)
            ex0.d r1 = (ex0.C45696d) r1
            r2 = 1
            boolean r1 = r1.mo70957E5(r2)
            if (r1 == 0) goto L_0x05d1
            k40.a r1 = f40.C86709a0.m107533q(r8)
            ex0.d r1 = (ex0.C45696d) r1
            r1.mo70972RM(r0)
        L_0x05d1:
            com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
            boolean r1 = r0.f55553g
            if (r1 != 0) goto L_0x05da
            goto L_0x05ec
        L_0x05da:
            r0.f55553g = r14
            com.tencent.mm.storage.r0 r1 = new com.tencent.mm.storage.r0
            r1.<init>(r0)
            zt3.t r0 = zt3.C119157j.f356862d
            zt3.j r0 = (zt3.C119157j) r0
            java.lang.String r2 = "BizTimeLineInfoStorageThread"
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.mo183879j(r1, r3, r2)
        L_0x05ec:
            r0 = 1
            fy0.C20734b.f58619d = r0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1[r14] = r2
            java.lang.String r3 = "MicroMsg.BizTimeLineConfigUtil"
            java.lang.String r4 = "alvinluo initBizTimeLineShowDigest: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            wd3.C118762j.f355307b = r0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r14] = r2
            java.lang.String r1 = "MicroMsg.BizImageDownloadUtil"
            java.lang.String r3 = "alvinluo updateEnableImageBlankReport %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            p248ug.C102027b.f300464b = r2
            fx0.C45823f.m51113b()
            q73.s r0 = q73.C35812s.f95615a
            r0.mo60426g()
            r13 = 65
            kj2.d r10 = kj2.C117407d.INSTANCE
            r11 = 1454(0x5ae, double:7.184E-321)
            r15 = 1
            r10.mo182089r(r11, r13, r15)
            rx0.f r0 = new rx0.f
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r1 = r7.f50246s
            r0.<init>(r7, r1)
            r7.f50233d = r0
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            o31.b r1 = o31.C11345b.BizTimeLineUI
            l31.e r0 = r0.mo86178qr(r7, r1)
            o31.a r1 = o31.C76986a.BizTimeline
            r0.mo86179qs(r7, r1)
            com.tencent.mm.plugin.brandservice.ui.timeline.r4$a r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C68777r4.f197582a
            if (r0 != 0) goto L_0x063f
            goto L_0x064e
        L_0x063f:
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C68777r4.f197583b
            long r1 = r1 - r3
            int r2 = (int) r1
            r0.f51347b = r2
            java.lang.String r0 = "markOnCreateEnd"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
        L_0x064e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        BizTLRecCardJsEngine bizTLRecCardJsEngine;
        super.onDestroy();
        Log.m105925i("MicroMsg.BizTimeLineUI", "BizTimeLineUI onDestroy %d", Integer.valueOf(hashCode()));
        C19641z0.f55649e = false;
        BizTimeLineHotView bizTimeLineHotView = this.f50245r;
        if (bizTimeLineHotView != null) {
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku().remove(bizTimeLineHotView);
            bizTimeLineHotView.f51177s.dead();
            C18471v vVar = bizTimeLineHotView.f51173o;
            vVar.getClass();
            C47350c.C47352b bVar = new C47350c.C47352b();
            C118451o53 o532 = new C118451o53();
            bVar.f127066a = o532;
            bVar.f127067b = new C50785p53();
            bVar.f127068c = "/cgi-bin/micromsg-bin/often_read_bar_report";
            bVar.f127069d = 2550;
            C47350c a = bVar.mo72403a();
            o532.f354187e = C19636w0.f55626c;
            o532.f354189g = vVar.f51271b;
            LinkedList<C22525q53> linkedList = new LinkedList<>();
            if (vVar.f51270a.size() > 0) {
                for (Map.Entry<String, C22525q53> value : vVar.f51270a.entrySet()) {
                    linkedList.add((C22525q53) value.getValue());
                }
            }
            o532.f354188f = linkedList;
            o532.f354190h = 0;
            C89144l0.m111429e(a, new C18470u(vVar), false);
            C86709a0.m107524d().mo123470p(2768, bizTimeLineHotView);
            BizTimeLineHotListView bizTimeLineHotListView = bizTimeLineHotView.f51166e;
            if (bizTimeLineHotListView != null) {
                bizTimeLineHotListView.setAdapter((RecyclerView.C16613e) null);
            }
            BizTimeLineHotListView bizTimeLineHotListView2 = bizTimeLineHotView.f51166e;
            if (bizTimeLineHotListView2 != null && !bizTimeLineHotListView2.f51126M1) {
                bizTimeLineHotListView2.f51130Q1.dead();
                bizTimeLineHotListView2.f51131R1.dead();
            }
            C18441b bVar2 = bizTimeLineHotView.f51176r;
            if (bVar2 != null) {
                BizTimeLineHotListView d = bVar2.mo23055d();
                if (d != null) {
                    d.setAdapter((RecyclerView.C16613e) null);
                }
                BizTimeLineHotListView d2 = bVar2.mo23055d();
                if (d2 != null && !d2.f51126M1) {
                    d2.f51130Q1.dead();
                    d2.f51131R1.dead();
                }
            }
            if (C19428d.f54856a.mo25179n()) {
                C20729b bVar3 = C20729b.f58601a;
                if (C20729b.f58602b != null) {
                    Log.m105918d("MicroMsg.BizFinderLiveUILogic", "stopCheckOftenReadBizLivesTimer");
                    MTimerHandler mTimerHandler = C20729b.f58602b;
                    if (mTimerHandler != null) {
                        mTimerHandler.stopTimer();
                    }
                    C20729b.f58602b = null;
                }
                IListener<BizFinderLineStatusChangedEvent> iListener = BizTimeLineHotView.f51164x;
                if (iListener != null) {
                    iListener.dead();
                }
                BizTimeLineHotView.f51164x = null;
            }
        }
        this.f50247t.f267711b.dead();
        C19636w0.m21176r(false);
        C19636w0.f55629f = System.currentTimeMillis();
        C18508z2 z2Var = this.f50246s;
        if (!(z2Var == null || this.f50235f == null)) {
            C19623o0 r = z2Var.mo23161r();
            if (r != null) {
                C19636w0.f55630g = r.field_orderFlag;
                C48009v0.Jx0().c40(r.field_orderFlag);
            } else {
                C19636w0.f55630g = C48009v0.Jx0().mo25790TE() << 32;
                C48009v0.Jx0().h30();
            }
            C18508z2 z2Var2 = this.f50246s;
            int i = f50206R0;
            C19623o0 q = z2Var2.getItem(i > 0 ? i - 1 : 0);
            if (q != null) {
                f50207y0 = q.mo25768r2();
            } else {
                Object[] objArr = new Object[1];
                int i2 = f50206R0;
                objArr[0] = Integer.valueOf(i2 > 0 ? i2 - 1 : 0);
                Log.m105929w("MicroMsg.BizTimeLineUI", "FirstVisibleItem is null %d", objArr);
            }
            C18508z2 z2Var3 = this.f50246s;
            z2Var3.getClass();
            C48009v0.Jx0().f55551e.remove(z2Var3.f51431D);
            ((LinkedList) z2Var3.f51445p.f51311c).clear();
            C20583z.C20584b bVar4 = C20583z.f57949a;
            List<C19623o0> list = z2Var3.f51440h;
            C87412m.m108594g(list, "list");
            C20583z.f57953e = list;
        }
        C48009v0.Kx0().f55478e.remove(this.f50222P);
        if (this.f50251x != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f50254z += currentTimeMillis - this.f50253y;
            C115669n.INSTANCE.mo160131h(13932, Integer.valueOf(((int) (currentTimeMillis - this.f50251x)) / 1000), 1, Integer.valueOf(this.f50208A), Integer.valueOf((int) (this.f50254z / 1000)), Integer.valueOf(this.f50209B));
        }
        this.f50243p0.dead();
        this.f50224R.dead();
        this.f50225S.dead();
        this.f50223Q.dead();
        this.f50226T.dead();
        C18412m3 m3Var = this.f50249v;
        int i3 = f50206R0;
        m3Var.f51068b = i3 > 0 ? i3 - 1 : 0;
        C22140b bVar5 = m3Var.f51079m;
        if (bVar5 != null) {
            bVar5.mo35254a(false);
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C18407j3(m3Var), "BizTimeLineExpose");
        C18412m3.C18413a aVar = m3Var.f51083q;
        if (aVar != null) {
            C115669n nVar = C115669n.INSTANCE;
            C18412m3.C18413a aVar2 = m3Var.f51083q;
            nVar.mo160131h(21136, Integer.valueOf(aVar.f51084a), Integer.valueOf(m3Var.f51083q.f51085b), Integer.valueOf(m3Var.f51083q.f51086c), Integer.valueOf(m3Var.f51083q.f51087d), aVar2.f51088e, Integer.valueOf(aVar2.f51089f));
        }
        HashMap<Long, Long> hashMap = C8218c.f27142a;
        synchronized (C8218c.class) {
            C8218c.f27142a.clear();
            C8218c.f27143b.clear();
        }
        C74355z4.f218406a.clear();
        C74355z4.f218407b.clear();
        C74355z4.f218408c.clear();
        C19636w0.f55626c = 0;
        try {
            if (getContentView() instanceof ViewGroup) {
                ((ViewGroup) getContentView()).removeAllViews();
            }
        } catch (Throwable th) {
            Log.m105929w("MicroMsg.BizTimeLineUI", "onDestroy contentView removeAllViews %s", th);
        }
        C19449k.f54941c.clear();
        int i4 = C45823f.f123722a;
        C45825h hVar = C45825h.f123727a;
        for (C22078m onDestroy : this.f50221N) {
            onDestroy.onDestroy();
        }
        if (((Boolean) ((C36570n) C19627t.f55609x).getValue()).booleanValue()) {
            BizTLRecCardJsEngine.Companion companion = BizTLRecCardJsEngine.f247961Y;
            ((C119157j) C119157j.f356862d).mo183878i(C85103f1.f247983d, 1000);
        }
        this.f50220M.clear();
        this.f50221N.clear();
        C16825a aVar3 = C16825a.f45444a;
        if (aVar3.mo17865c()) {
            C16825a.m16471g(aVar3, 0, true, 1, (Object) null);
            C16825a.f45449f = null;
            C16825a.f45450g.clear();
            C16825a.f45451h = -1;
            synchronized (C21905b.f61957b) {
                for (C60171g1 next : C21905b.f61960e) {
                    C21905b bVar6 = C21905b.f61956a;
                    next.mo78608c();
                    next.mo78609d();
                }
                for (C60171g1 next2 : C21905b.f61959d) {
                    C21905b bVar7 = C21905b.f61956a;
                    next2.mo78608c();
                    next2.mo78609d();
                }
                C21905b.f61960e.clear();
                C21905b.f61959d.clear();
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        C20729b bVar8 = C20729b.f58601a;
        C19428d dVar = C19428d.f54856a;
        ((C119157j) C119157j.f356862d).mo183875f(C44593h.f120905d);
        IListener<BizFinderLineStatusChangedEvent> iListener2 = C20729b.f58605e;
        if (iListener2 != null) {
            iListener2.dead();
        }
        C20729b.f58605e = null;
        C18342r.f50789e.clear();
        if (C19627t.f55610y && (bizTLRecCardJsEngine = BizTLRecCardJsEngine.f247960R0) != null) {
            synchronized (bizTLRecCardJsEngine) {
                for (Map.Entry<String, Integer> key : bizTLRecCardJsEngine.f257697D.entrySet()) {
                    String str = (String) key.getKey();
                    bizTLRecCardJsEngine.mo60865I0("exitUI", "{target:'" + str + "'}", new C47777j(bizTLRecCardJsEngine, str));
                }
            }
        }
        C22058r.f62431b = false;
        ((LinkedHashMap) C20372d.f57086a).clear();
        ((LinkedHashMap) C20372d.f57087b).clear();
        ((LinkedHashMap) C20372d.f57088c).clear();
        C68777r4.C18492a aVar4 = C68777r4.f197582a;
        if (aVar4 != null) {
            Log.m105924i("MicroMsg.BizTimeReport", "timeToFirstInitStateStart:" + aVar4.f51346a + ", timeToFirstInitStateEnd:" + aVar4.f51347b + ", timeToOnResume:" + aVar4.f51349d + ", timeToFirstCardFrame:" + aVar4.f51348c + ",timeToFirstTouchDown:" + aVar4.f51350e + ",timeToFirstScroll:" + aVar4.f51351f);
            C115669n nVar2 = C115669n.INSTANCE;
            Boolean bool = Boolean.FALSE;
            nVar2.mo160131h(28496, 2, bool, bool, 0, 0, 0, 0, Integer.valueOf(aVar4.f51346a), Integer.valueOf(aVar4.f51347b), 0, 0, 0, Integer.valueOf(aVar4.f51348c), 0, Integer.valueOf(aVar4.f51349d), 0, Integer.valueOf(aVar4.f51350e), Integer.valueOf(aVar4.f51351f));
        }
        C68777r4.f197582a = null;
    }

    public void onPause() {
        C19623o0 o0Var;
        super.onPause();
        C18508z2 z2Var = this.f50246s;
        if (z2Var != null) {
            z2Var.f51447r = true;
            z2Var.f51445p.f51315g = true;
            o0Var = z2Var.mo23159p();
        } else {
            o0Var = null;
        }
        if (o0Var != null) {
            C48009v0.Jx0().c40(o0Var.field_orderFlag);
        } else {
            C48009v0.Jx0().h30();
        }
        C19428d.f54856a.mo25157J();
        StoryListView storyListView = this.f50235f;
        if (storyListView != null) {
            View childAt = storyListView.getChildAt(0);
            f50205Q0 = childAt != null ? childAt.getTop() : 0;
        } else {
            f50205Q0 = 0;
        }
        this.f50213F = true;
        long currentTimeMillis = System.currentTimeMillis();
        this.f50254z += currentTimeMillis - this.f50253y;
        this.f50253y = currentTimeMillis;
        C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcBizEnable(), this.f50227U);
        this.f50227U = 0;
        ((C76978g) C86312j.m106911c(C76978g.class)).bj0(this.f50252x0);
        if (C118762j.f355306a.mo183489b(1)) {
            C19449k kVar = C19449k.f54939a;
            ((C119157j) C119157j.f356862d).mo183876g(C19458o.f54986d, "biz_image_blank_report");
        }
        ScreenShotUtil.setScreenShotCallback(MMApplicationContext.getContext(), (ScreenShotUtil.ScreenShotCallback) null);
        for (C22078m onPause : this.f50221N) {
            onPause.onPause();
        }
        C16825a.f45444a.mo17869h("ONPAUSE");
        this.f50245r.getClass();
        if (C19428d.f54856a.mo25179n()) {
            C20729b bVar = C20729b.f58601a;
            if (C20729b.f58602b != null) {
                Log.m105918d("MicroMsg.BizFinderLiveUILogic", "stopCheckOftenReadBizLivesTimer");
                MTimerHandler mTimerHandler = C20729b.f58602b;
                if (mTimerHandler != null) {
                    mTimerHandler.stopTimer();
                }
                C20729b.f58602b = null;
            }
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105918d("MicroMsg.BizTimeLineUI", "BizTimeLineUI onResume");
        if (this.f50210C) {
            this.f50210C = false;
            this.f50249v.mo22985l("", 0, 0, 8, -1, 0, false, 0);
        }
        C18508z2 z2Var = this.f50246s;
        if (z2Var != null) {
            z2Var.f51447r = false;
            C18479j jVar = z2Var.f51445p;
            if (jVar.f51315g) {
                jVar.f51315g = false;
                if (jVar.f51310b <= 0) {
                    jVar.mo23111m();
                }
            }
            C18508z2.C18509a aVar = C18508z2.f51409I;
            if (C22136a.f62624g != null) {
                String str = C22136a.f62625h;
                if (!(str == null || C112551y.m153811k(str))) {
                    C20583z.C20584b bVar = C20583z.f57949a;
                    if (!C20583z.f57951c) {
                        Log.m105924i("MicroMsg.BizTimeLineAdapter", "getRecFeedsOnClickBack not open");
                    } else if (C22136a.f62626i != C22136a.C22137a.CLICK_REC_FEED) {
                        Log.m105924i("MicroMsg.BizTimeLineAdapter", "checkRefreshFirstScreenData recFeedExposed=" + C18508z2.f51410J);
                        if (!C18508z2.f51410J) {
                            if (!C20583z.f57952d) {
                                Log.m105924i("MicroMsg.BizTimeLineAdapter", "checkRefreshFirstScreenData not open");
                            } else {
                                int decodeInt = bVar.mo32230c().decodeInt("BizTLRecommendFeedsRefreshFreq", 0);
                                Log.m105924i("Micromsg.BizTLRecFeedsDataUtil", "getRefreshFreq = " + decodeInt);
                                if (decodeInt <= z2Var.f51452w) {
                                    Log.m105924i("MicroMsg.BizTimeLineAdapter", "checkRefreshFirstScreenData over refresh times refreshRecFeedTimesOnBizBack=" + z2Var.f51452w);
                                } else {
                                    C20583z.C20585c cVar = C20583z.C20585c.GET_RECOMMEND_FEEDS_SCENE_REFRESH_AFTER_CLICK;
                                    int d = bVar.mo32231d(cVar);
                                    if (Math.abs(System.currentTimeMillis() - C18508z2.f51411K) < ((long) d)) {
                                        Log.m105924i("MicroMsg.BizTimeLineAdapter", "checkRefreshFirstScreenData should not do refresh in " + d);
                                    } else {
                                        C18508z2.f51411K = System.currentTimeMillis();
                                        z2Var.f51452w++;
                                        C64635po3 po32 = new C64635po3();
                                        po32.f184868d = C22136a.f62625h;
                                        C22136a.f62625h = null;
                                        po32.f184869e = C20583z.f57956h;
                                        C20583z.f57956h = null;
                                        C18508z2.C18509a.m19195b(aVar, z2Var, cVar, false, po32, 4, (Object) null);
                                    }
                                }
                            }
                        }
                    } else {
                        C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C18506y2(new WeakReference(z2Var), new WeakReference(z2Var.f51436d), (C15601d<? super C18506y2>) null), 2, (Object) null);
                    }
                }
            }
        }
        if (this.f50213F) {
            this.f50213F = false;
            mo22785M7();
            C20729b.f58601a.mo32440a(this.f50235f, this.f50246s);
        }
        this.f50253y = System.currentTimeMillis();
        C31332a.m39373a("BrandServiceWorkerThread", new C18416m4(this), 500);
        ((C76978g) C86312j.m106911c(C76978g.class)).k30(this.f50252x0);
        try {
            ScreenShotUtil.setScreenShotCallback(MMApplicationContext.getContext(), this);
        } catch (Exception e) {
            Log.m105929w("MicroMsg.BizTimeLineUI", "setScreenShotCallback fail e:%s", e.getMessage());
        }
        for (C22078m onResume : this.f50221N) {
            onResume.onResume();
        }
        C16825a.f45444a.mo17869h("ONRESUME");
        BizTimeLineHotView bizTimeLineHotView = this.f50245r;
        bizTimeLineHotView.getClass();
        C19428d dVar = C19428d.f54856a;
        if (dVar.mo25179n()) {
            C20729b bVar2 = C20729b.f58601a;
            CopyOnWriteArrayList<C18468r> copyOnWriteArrayList = bizTimeLineHotView.f51172n;
            C87412m.m108594g(copyOnWriteArrayList, "mOftenReadList");
            if (C20729b.f58602b == null && dVar.mo25179n()) {
                Log.m105918d("MicroMsg.BizFinderLiveUILogic", "startCheckOftenReadBizLives");
                MTimerHandler mTimerHandler = new MTimerHandler("CheckOftenReadBizLives", (MTimerHandler.CallBack) new C20732c(new WeakReference(bizTimeLineHotView), copyOnWriteArrayList), true);
                C20729b.f58602b = mTimerHandler;
                mTimerHandler.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            }
        }
        dVar.mo25151D();
        C68777r4.C18492a aVar2 = C68777r4.f197582a;
        if (aVar2 != null && aVar2.f51349d == 0) {
            C87412m.m108591d(aVar2);
            aVar2.f51349d = (int) (System.currentTimeMillis() - C68777r4.f197583b);
            Log.m105924i("MicroMsg.BizTimeReport", "markOnResume");
        }
    }

    public void onScreenShot(String str, long j) {
        for (C22079o a : this.f50220M) {
            a.mo35176a();
        }
    }

    /* renamed from: t7 */
    public void mo22790t7(C22079o oVar) {
        this.f50220M.remove(oVar);
    }
}
