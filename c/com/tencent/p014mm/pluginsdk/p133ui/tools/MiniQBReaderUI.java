package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ValueCallback;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MiniQbFloatBallMenuActionEvent;
import com.tencent.p014mm.p136ui.C85811a5;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel;
import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.plugin.handoff.model.HandOffFile;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C19569p0;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.xwebutil.C19894d;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import d92.C107028a;
import di3.C86312j;
import ek3.C97668a;
import gq0.C107879e0;
import gq0.C107884f0;
import gq0.C107885g0;
import gq0.C45944i0;
import gq0.C59603h0;
import gy3.C8480h;
import ik3.C46249a;
import ik3.C98700c;
import iq0.C98783b;
import java.lang.ref.WeakReference;
import kr0.C109033l0;
import nj3.C88989a;
import p159gw.C98250h;
import p262wm.C22921c;
import p262wm.C22923f;
import p407zo.C23547h;
import p823sg.C90193h;
import qo3.C77407n;
import s00.C110692d;
import s00.C110694g;
import uv0.C22663i;
import vd3.C22753y;
import vd3.C78401j;
import w90.C111784a;
import zt3.C119157j;
import zt3.C119179t;

@C88989a(3)
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI */
public class MiniQBReaderUI extends MMSecDataActivity implements C19568o0 {

    /* renamed from: K */
    public static final /* synthetic */ int f55239K = 0;

    /* renamed from: A */
    public IListener<MiniQbFloatBallMenuActionEvent> f55240A = new IListener<MiniQbFloatBallMenuActionEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1644922434;
        }

        public boolean callback(IEvent iEvent) {
            MiniQbFloatBallMenuActionEvent.C17684a aVar;
            MiniQbFloatBallMenuActionEvent miniQbFloatBallMenuActionEvent = (MiniQbFloatBallMenuActionEvent) iEvent;
            if (!(miniQbFloatBallMenuActionEvent == null || (aVar = miniQbFloatBallMenuActionEvent.f48105d) == null)) {
                MiniQBReaderUI miniQBReaderUI = MiniQBReaderUI.this;
                if (miniQBReaderUI.f55258o != null) {
                    if (Util.isEqual(aVar.f48108b, miniQBReaderUI.f55251e)) {
                        Log.m105925i("MicroMsg.MiniQBReaderUI", "MiniQbFloatBallMenuActionEvent event.data.action:%s", Integer.valueOf(miniQbFloatBallMenuActionEvent.f48105d.f48107a));
                        MiniQbFloatBallMenuActionEvent.C17684a aVar2 = miniQbFloatBallMenuActionEvent.f48105d;
                        Bitmap bitmap = null;
                        switch (aVar2.f48107a) {
                            case 1:
                            case 8:
                                MiniQBReaderUI.this.f55258o.mo124068H(true, 1);
                                break;
                            case 2:
                                MiniQBReaderUI.this.f55258o.mo124068H(false, 1);
                                MiniQBReaderUI miniQBReaderUI2 = MiniQBReaderUI.this;
                                if (!miniQBReaderUI2.f55261r) {
                                    miniQBReaderUI2.f55260q = false;
                                    C19894d.m21642a(miniQBReaderUI2, miniQBReaderUI2.f55256j, miniQBReaderUI2.f55251e);
                                    MiniQBReaderUI miniQBReaderUI3 = MiniQBReaderUI.this;
                                    boolean z = miniQBReaderUI3.f55262s;
                                    String str = miniQBReaderUI3.f55251e;
                                    String str2 = miniQBReaderUI3.f55255i;
                                    String str3 = miniQBReaderUI3.f55252f;
                                    String str4 = miniQBReaderUI3.f55256j;
                                    int i = miniQBReaderUI3.f55254h;
                                    ValueCallback<String> valueCallback = miniQBReaderUI3.f55243D;
                                    C110694g H7 = MiniQBReaderUI.m20928H7(miniQBReaderUI3, false);
                                    MiniQBReaderUI miniQBReaderUI4 = MiniQBReaderUI.this;
                                    C111784a.m152402d(false, false, z, false, miniQBReaderUI3, str, str2, str3, str4, i, valueCallback, H7, miniQBReaderUI4.f55254h, miniQBReaderUI4.f55264u);
                                    break;
                                } else {
                                    boolean z2 = miniQBReaderUI2.f55264u;
                                    C111784a.m152405g(miniQBReaderUI2.f55262s, false, false, miniQBReaderUI2, miniQBReaderUI2.f55251e, miniQBReaderUI2.f55255i, miniQBReaderUI2.f55252f, miniQBReaderUI2.f55256j, miniQBReaderUI2.f55254h, miniQBReaderUI2.f55243D, miniQBReaderUI2.f55241B, false, "", z2);
                                    break;
                                }
                            case 4:
                                MiniQBReaderUI miniQBReaderUI5 = MiniQBReaderUI.this;
                                ((C98250h) C86312j.m106911c(C98250h.class)).pk0(miniQBReaderUI5, miniQBReaderUI5.f55251e, new C19572u0(this));
                                break;
                            case 5:
                                if (MiniQBReaderUI.this.f55263t != null) {
                                    ((C92331c) C86312j.m106911c(C92331c.class)).k00(MiniQBReaderUI.this.f55263t);
                                    break;
                                }
                                break;
                            case 6:
                                Log.m105925i("MicroMsg.MiniQBReaderUI", "MiniQbFloatBallMenuActionEvent.UPDATE_READ_PROGRESS readState:%d", Integer.valueOf(aVar2.f48109c));
                                if (MiniQBReaderUI.this.f55258o == null) {
                                    Log.m105920e("MicroMsg.MiniQBReaderUI", "MiniQbFloatBallMenuActionEvent.UPDATE_READ_PROGRESS mFloatBallHelper==null");
                                }
                                int i2 = miniQbFloatBallMenuActionEvent.f48105d.f48109c;
                                if (i2 != 0) {
                                    if (i2 == 1) {
                                        MiniQBReaderUI.this.f55258o.f289438v = true;
                                        Log.m105925i("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "setEnded ended:%b", Boolean.TRUE);
                                        break;
                                    }
                                } else {
                                    C98700c cVar = MiniQBReaderUI.this.f55258o;
                                    C107028a aVar3 = cVar.f326423e;
                                    if (aVar3 != null) {
                                        bitmap = aVar3.getBitmap();
                                    }
                                    cVar.mo74195s(cVar.mo160089o(bitmap));
                                    Log.m105924i("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "setStart");
                                    break;
                                }
                                break;
                            case 7:
                                MiniQBReaderUI miniQBReaderUI6 = MiniQBReaderUI.this;
                                miniQBReaderUI6.getClass();
                                Log.m105918d("MicroMsg.MiniQBReaderUI", "tryShowOpenMaterialBottomSheet");
                                miniQBReaderUI6.mo25333I7(new C19536j((C195261) null));
                                break;
                            case 9:
                                MiniQBReaderUI miniQBReaderUI7 = MiniQBReaderUI.this;
                                miniQBReaderUI7.getClass();
                                Log.m105918d("MicroMsg.MiniQBReaderUI", "tryReportMiniQBBottomSheetShown");
                                if (miniQBReaderUI7.f55264u) {
                                    miniQBReaderUI7.mo25333I7(new C19535i((C195261) null));
                                    break;
                                }
                                break;
                            case 10:
                                MiniQBReaderUI miniQBReaderUI8 = MiniQBReaderUI.this;
                                miniQBReaderUI8.getClass();
                                Log.m105918d("MicroMsg.MiniQBReaderUI", "tryReportOpenMaterialEntranceExposure");
                                if (miniQBReaderUI8.f55264u) {
                                    miniQBReaderUI8.mo25334J7(1);
                                    break;
                                }
                                break;
                            case 11:
                                MiniQBReaderUI miniQBReaderUI9 = MiniQBReaderUI.this;
                                miniQBReaderUI9.f55265v = 2;
                                miniQBReaderUI9.f55266w = true;
                                miniQBReaderUI9.f55260q = false;
                                if (C85811a5.m106024a(C85811a5.f249921a, miniQBReaderUI9.getTaskId()) == 1) {
                                    MiniQBReaderUI.this.f55267x = true;
                                }
                                C85878m2.m106217f(MiniQBReaderUI.this.getTaskId(), 2);
                                break;
                            case 12:
                                MiniQBReaderUI miniQBReaderUI10 = MiniQBReaderUI.this;
                                miniQBReaderUI10.f55265v = 0;
                                miniQBReaderUI10.f55266w = true;
                                miniQBReaderUI10.f55260q = false;
                                C85878m2.m106217f(miniQBReaderUI10.getTaskId(), 0);
                                break;
                        }
                    } else {
                        Log.m105921e("MicroMsg.MiniQBReaderUI", "MiniQbFloatBallMenuActionEvent event.data.action:%s event.data.filePath:%s filePath:%s", Integer.valueOf(miniQbFloatBallMenuActionEvent.f48105d.f48107a), miniQbFloatBallMenuActionEvent.f48105d.f48108b, MiniQBReaderUI.this.f55251e);
                        if (miniQbFloatBallMenuActionEvent.f48105d.f48107a == 3) {
                            MiniQBReaderUI miniQBReaderUI11 = MiniQBReaderUI.this;
                            C19894d.m21642a(miniQBReaderUI11, miniQBReaderUI11.f55256j, miniQBReaderUI11.f55251e);
                            C98700c cVar2 = MiniQBReaderUI.this.f55258o;
                            if (cVar2 != null) {
                                cVar2.mo74189F();
                            }
                            C97668a aVar4 = MiniQBReaderUI.this.f55257n;
                            if (aVar4 != null) {
                                aVar4.mo64001C();
                            }
                        }
                    }
                    return false;
                }
            }
            Log.m105920e("MicroMsg.MiniQBReaderUI", "MiniQbFloatBallMenuActionEvent fail");
            return false;
        }
    };

    /* renamed from: B */
    public ValueCallback<Integer> f55241B = new C19530d(this);

    /* renamed from: C */
    public C110694g<Integer> f55242C = null;

    /* renamed from: D */
    public ValueCallback<String> f55243D = new C19531e();

    /* renamed from: E */
    public String f55244E = null;

    /* renamed from: F */
    public AppBrandOpenMaterialCollection f55245F = null;

    /* renamed from: G */
    public C107879e0 f55246G = null;

    /* renamed from: H */
    public C107885g0 f55247H = null;

    /* renamed from: I */
    public C107884f0 f55248I = null;

    /* renamed from: J */
    public boolean f55249J = false;

    /* renamed from: d */
    public long f55250d = 0;

    /* renamed from: e */
    public String f55251e = "";

    /* renamed from: f */
    public String f55252f = "";

    /* renamed from: g */
    public String f55253g = "";

    /* renamed from: h */
    public int f55254h;

    /* renamed from: i */
    public String f55255i = "";

    /* renamed from: j */
    public String f55256j = Integer.toString(hashCode());

    /* renamed from: n */
    public C97668a f55257n;

    /* renamed from: o */
    public C98700c f55258o;

    /* renamed from: p */
    public C46249a f55259p;

    /* renamed from: q */
    public boolean f55260q = true;

    /* renamed from: r */
    public boolean f55261r = false;

    /* renamed from: s */
    public boolean f55262s;

    /* renamed from: t */
    public HandOffFile f55263t;

    /* renamed from: u */
    public boolean f55264u = false;

    /* renamed from: v */
    public int f55265v = 0;

    /* renamed from: w */
    public boolean f55266w = false;

    /* renamed from: x */
    public boolean f55267x = false;

    /* renamed from: y */
    public View f55268y = null;

    /* renamed from: z */
    public QBFileMenuBottomSheetHelper f55269z = null;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI$a */
    public class C19527a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f55271d;

        public C19527a(int i) {
            this.f55271d = i;
        }

        public void run() {
            MiniQBReaderUI miniQBReaderUI = MiniQBReaderUI.this;
            int i = this.f55271d;
            int i2 = MiniQBReaderUI.f55239K;
            miniQBReaderUI.mo25334J7(i);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI$b */
    public class C19528b implements Runnable {
        public C19528b() {
        }

        public void run() {
            MiniQBReaderUI miniQBReaderUI = MiniQBReaderUI.this;
            int i = MiniQBReaderUI.f55239K;
            miniQBReaderUI.init();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI$c */
    public class C19529c implements Runnable {
        public C19529c() {
        }

        public void run() {
            if (FileReaderHelper.DOC_EXT.equalsIgnoreCase(MiniQBReaderUI.this.f55252f) || FileReaderHelper.DOCX_EXT.equalsIgnoreCase(MiniQBReaderUI.this.f55252f) || FileReaderHelper.XLS_EXT.equalsIgnoreCase(MiniQBReaderUI.this.f55252f) || FileReaderHelper.XLSX_EXT.equalsIgnoreCase(MiniQBReaderUI.this.f55252f) || FileReaderHelper.PPT_EXT.equalsIgnoreCase(MiniQBReaderUI.this.f55252f) || FileReaderHelper.PPTX_EXT.equalsIgnoreCase(MiniQBReaderUI.this.f55252f) || FileReaderHelper.PDF_EXT.equalsIgnoreCase(MiniQBReaderUI.this.f55252f)) {
                MiniQBReaderUI miniQBReaderUI = MiniQBReaderUI.this;
                MiniQBReaderUI miniQBReaderUI2 = MiniQBReaderUI.this;
                miniQBReaderUI.f55268y = new C78401j(miniQBReaderUI2, miniQBReaderUI2.f55251e, miniQBReaderUI2.f55255i, miniQBReaderUI2.f55252f, miniQBReaderUI2.f55256j, miniQBReaderUI2.f55253g);
                C19894d.f56720b = new C110692d.C22288a(MiniQBReaderUI.this.f55268y, 128, 0, 0, 0, 0);
            } else {
                C19894d.f56720b = null;
            }
            C19894d.f56719a = ((C22923f) C86312j.m106911c(C22923f.class)).mo35898Db(MiniQBReaderUI.this);
            MiniQBReaderUI miniQBReaderUI3 = MiniQBReaderUI.this;
            boolean z = miniQBReaderUI3.f55264u;
            boolean e = miniQBReaderUI3.f55258o.mo160080e();
            boolean g = MiniQBReaderUI.this.f55258o.mo160082g();
            MiniQBReaderUI miniQBReaderUI4 = MiniQBReaderUI.this;
            C111784a.m152404f(e, g, false, miniQBReaderUI4, miniQBReaderUI4.f55251e, miniQBReaderUI4.f55255i, miniQBReaderUI4.f55252f, miniQBReaderUI4.f55256j, miniQBReaderUI4.f55254h, miniQBReaderUI4.f55243D, MiniQBReaderUI.m20928H7(miniQBReaderUI4, true), false, "", true, z);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI$d */
    public class C19530d implements ValueCallback<Integer> {
        public C19530d(MiniQBReaderUI miniQBReaderUI) {
        }

        public void onReceiveValue(Object obj) {
            Log.m105925i("MicroMsg.MiniQBReaderUI", "updateRetCallback onReceiveValue ret = %d", (Integer) obj);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI$e */
    public class C19531e implements ValueCallback<String> {
        public C19531e() {
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            Class cls = C22923f.class;
            int i = 2;
            Log.m105925i("MicroMsg.MiniQBReaderUI", "openReadFile, receiveValue = %s %s", str, MiniQBReaderUI.this.toString());
            if ("query for feature_wx_float_window successfully".equals(str)) {
                MiniQBReaderUI miniQBReaderUI = MiniQBReaderUI.this;
                miniQBReaderUI.f55261r = true;
                boolean e = miniQBReaderUI.f55258o.mo160080e();
                boolean g = MiniQBReaderUI.this.f55258o.mo160082g();
                MiniQBReaderUI miniQBReaderUI2 = MiniQBReaderUI.this;
                String str2 = miniQBReaderUI2.f55251e;
                String str3 = miniQBReaderUI2.f55255i;
                String str4 = miniQBReaderUI2.f55252f;
                String str5 = miniQBReaderUI2.f55256j;
                int i2 = miniQBReaderUI2.f55254h;
                ValueCallback<String> valueCallback = miniQBReaderUI2.f55243D;
                C110694g H7 = MiniQBReaderUI.m20928H7(miniQBReaderUI2, true);
                MiniQBReaderUI miniQBReaderUI3 = MiniQBReaderUI.this;
                C111784a.m152402d(e, g, true, false, miniQBReaderUI2, str2, str3, str4, str5, i2, valueCallback, H7, miniQBReaderUI3.f55254h, miniQBReaderUI3.f55264u);
            } else if ("xwebFileReaderReachEnd".equals(str)) {
                Log.m105924i("MicroMsg.MiniQBReaderUI", "xweb file reader reach end");
                C98700c cVar = MiniQBReaderUI.this.f55258o;
                if (cVar != null) {
                    cVar.f289438v = true;
                    Log.m105925i("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "setEnded ended:%b", Boolean.TRUE);
                    return;
                }
                Log.m105920e("MicroMsg.MiniQBReaderUI", "mFloatBallHelper null");
            } else if ("xwebFileReaderUserOperated".equals(str)) {
                Log.m105924i("MicroMsg.MiniQBReaderUI", "xweb file reader user operated");
                C98700c cVar2 = MiniQBReaderUI.this.f55258o;
                if (cVar2 != null) {
                    C107028a aVar = cVar2.f326423e;
                    cVar2.mo74195s(cVar2.mo160089o(aVar != null ? aVar.getBitmap() : null));
                    Log.m105924i("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "setStart");
                    return;
                }
                Log.m105920e("MicroMsg.MiniQBReaderUI", "mFloatBallHelper null");
            } else if ("xwebFileReaderMenuEditClick".equals(str)) {
                Log.m105924i("MicroMsg.MiniQBReaderUI", "xweb file reader menu edit click");
                MiniQBReaderUI miniQBReaderUI4 = MiniQBReaderUI.this;
                new C22753y(miniQBReaderUI4, miniQBReaderUI4.f55251e, miniQBReaderUI4.f55255i, miniQBReaderUI4.f55252f, miniQBReaderUI4.f55256j, miniQBReaderUI4.f55253g).f65461g.mo140655A();
                MiniQBReaderUI miniQBReaderUI5 = MiniQBReaderUI.this;
                String str6 = miniQBReaderUI5.f55256j;
                String str7 = miniQBReaderUI5.f55253g;
                String str8 = miniQBReaderUI5.f55252f;
                if (((C22923f) C86312j.m106911c(cls)).mo35898Db(MiniQBReaderUI.this)) {
                    i = 1;
                }
                WXWebReporter.reportXFilesAction(str6, str7, str8, 6, i);
            } else if ("fileReaderClosed".equals(str)) {
                C98700c cVar3 = MiniQBReaderUI.this.f55258o;
                if (cVar3 != null && !cVar3.mo67896U(1, cVar3.f289438v)) {
                    MiniQBReaderUI miniQBReaderUI6 = MiniQBReaderUI.this;
                    boolean z = miniQBReaderUI6.f55260q;
                    if (z) {
                        miniQBReaderUI6.finish();
                        return;
                    }
                    Log.m105925i("MicroMsg.MiniQBReaderUI", "opCallback isFinishCurPage:%s", Boolean.valueOf(z));
                    MiniQBReaderUI.this.f55260q = true;
                }
            } else if ("fileReaderMenuClicked".equals(str)) {
                MiniQBReaderUI miniQBReaderUI7 = MiniQBReaderUI.this;
                if (miniQBReaderUI7.f55269z == null) {
                    C98700c cVar4 = miniQBReaderUI7.f55258o;
                    HandOffFile handOffFile = miniQBReaderUI7.f55263t;
                    String str9 = miniQBReaderUI7.f55252f;
                    C19569p0.C19570a aVar2 = new C19569p0.C19570a(cVar4, handOffFile, str9, miniQBReaderUI7.f55251e, miniQBReaderUI7.f55255i, miniQBReaderUI7.f55253g, C19556e.m20958e(str9), 0, true, MiniQBReaderUI.this.f55250d);
                    aVar2.f55387j = ((C22923f) C86312j.m106911c(cls)).mo35909zS(C19556e.m20958e(MiniQBReaderUI.this.f55252f));
                    aVar2.f55388k = !((C22923f) C86312j.m106911c(cls)).mo35898Db(MiniQBReaderUI.this.getContext());
                    MiniQBReaderUI miniQBReaderUI8 = MiniQBReaderUI.this;
                    miniQBReaderUI8.f55269z = new QBFileMenuBottomSheetHelper(miniQBReaderUI8, aVar2, miniQBReaderUI8);
                }
                MiniQBReaderUI.this.f55269z.mo25344b();
                MiniQBReaderUI miniQBReaderUI9 = MiniQBReaderUI.this;
                C77407n nVar = miniQBReaderUI9.f55269z.f55286e;
                Log.m105918d("MicroMsg.MiniQBReaderUI", "tryEnhanceBottomSheet");
                miniQBReaderUI9.mo25333I7(new C19532f(nVar));
                C77407n nVar2 = MiniQBReaderUI.this.f55269z.f55286e;
                if (nVar2 != null) {
                    nVar2.mo107573q();
                }
                MiniQBReaderUI.this.f55269z.f55286e.f225799x = new C19575w0(this);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI$f */
    public static class C19532f implements C19534h {

        /* renamed from: a */
        public final WeakReference<C77407n> f55276a;

        public C19532f(C77407n nVar) {
            this.f55276a = new WeakReference<>(nVar);
        }

        /* renamed from: a */
        public void mo25341a(MiniQBReaderUI miniQBReaderUI, C109033l0 l0Var, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
            C77407n nVar = this.f55276a.get();
            if (nVar == null) {
                Log.m105924i("MicroMsg.MiniQBReaderUI", "tryEnhanceBottomSheet#run, bottomSheet is null");
            } else if (!l0Var.mo158325ic(nVar, appBrandOpenMaterialCollection)) {
                Log.m105924i("MicroMsg.MiniQBReaderUI", "tryEnhanceBottomSheet#run, not need enhance");
            } else {
                C107885g0 g0Var = miniQBReaderUI.f55247H;
                if (g0Var != null) {
                    g0Var.dead();
                }
                miniQBReaderUI.f55247H = l0Var.mo158322RD(C98783b.ATTACH, miniQBReaderUI, nVar, appBrandOpenMaterialCollection, (C107879e0) null, (C45944i0) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI$g */
    public static class C19533g implements C59603h0 {

        /* renamed from: a */
        public final WeakReference<MiniQBReaderUI> f55277a;

        /* renamed from: b */
        public final MaterialModel f55278b;

        /* renamed from: c */
        public final C109033l0 f55279c;

        /* renamed from: d */
        public final C19534h f55280d;

        public C19533g(MiniQBReaderUI miniQBReaderUI, MaterialModel materialModel, C109033l0 l0Var, C19534h hVar) {
            this.f55277a = new WeakReference<>(miniQBReaderUI);
            this.f55278b = materialModel;
            this.f55279c = l0Var;
            this.f55280d = hVar;
        }

        /* renamed from: a */
        public void mo25342a(boolean z, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
            MiniQBReaderUI miniQBReaderUI = this.f55277a.get();
            if (miniQBReaderUI == null) {
                Log.m105924i("MicroMsg.MiniQBReaderUI", "doSomeOpenMaterialTask#onMyOpenMaterialsGo, ui is null");
            } else if (!z) {
                Log.m105924i("MicroMsg.MiniQBReaderUI", "doSomeOpenMaterialTask#onMyOpenMaterialsGot, fail");
            } else {
                miniQBReaderUI.f55244E = this.f55278b.f267606f;
                miniQBReaderUI.f55245F = appBrandOpenMaterialCollection;
                this.f55280d.mo25341a(miniQBReaderUI, this.f55279c, appBrandOpenMaterialCollection);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI$h */
    public interface C19534h {
        /* renamed from: a */
        void mo25341a(MiniQBReaderUI miniQBReaderUI, C109033l0 l0Var, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI$i */
    public static class C19535i implements C19534h {
        public C19535i(C195261 r1) {
        }

        /* renamed from: a */
        public void mo25341a(MiniQBReaderUI miniQBReaderUI, C109033l0 l0Var, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
            miniQBReaderUI.f55248I = l0Var.Dl0(C98783b.ATTACH, appBrandOpenMaterialCollection);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI$j */
    public static class C19536j implements C19534h {

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI$j$a */
        public class C19537a implements C107879e0.C107882c {

            /* renamed from: a */
            public final /* synthetic */ MiniQBReaderUI f55281a;

            public C19537a(C19536j jVar, MiniQBReaderUI miniQBReaderUI) {
                this.f55281a = miniQBReaderUI;
            }

            /* renamed from: a */
            public void mo25343a() {
                Log.m105924i("MicroMsg.MiniQBReaderUI", "onHidden, reset openMaterialReporter");
                this.f55281a.f55248I = null;
            }
        }

        public C19536j(C195261 r1) {
        }

        /* renamed from: a */
        public void mo25341a(MiniQBReaderUI miniQBReaderUI, C109033l0 l0Var, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
            C107879e0 e0Var = miniQBReaderUI.f55246G;
            if (e0Var != null) {
                e0Var.dead();
            }
            C107879e0 b = l0Var.mo158327vX().mo158295a(C98783b.ATTACH).mo158296b(miniQBReaderUI, (C77407n) null, appBrandOpenMaterialCollection, (C45944i0) null, miniQBReaderUI.f55248I);
            miniQBReaderUI.f55246G = b;
            b.mo158290G(new C19537a(this, miniQBReaderUI));
            miniQBReaderUI.f55246G.show();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI$k */
    public static class C19538k implements C19534h {
        public C19538k(C195261 r1) {
        }

        /* renamed from: a */
        public void mo25341a(MiniQBReaderUI miniQBReaderUI, C109033l0 l0Var, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
            miniQBReaderUI.f55264u = l0Var.mo158327vX().mo158297c(appBrandOpenMaterialCollection);
        }
    }

    /* renamed from: H7 */
    public static C110694g m20928H7(MiniQBReaderUI miniQBReaderUI, boolean z) {
        C110694g<Integer> gVar;
        if (!z && (gVar = miniQBReaderUI.f55242C) != null) {
            return gVar;
        }
        C110694g<Integer> gVar2 = miniQBReaderUI.f55242C;
        if (gVar2 != null) {
            gVar2.f331114a = true;
        }
        C19573v0 v0Var = new C19573v0(miniQBReaderUI);
        miniQBReaderUI.f55242C = v0Var;
        return v0Var;
    }

    /* renamed from: I7 */
    public final void mo25333I7(C19534h hVar) {
        Log.m105918d("MicroMsg.MiniQBReaderUI", "doSomeOpenMaterialTask");
        Log.m105918d("MicroMsg.MiniQBReaderUI", "prepareServiceAndMaterialModel");
        C109033l0 l0Var = (C109033l0) C86312j.m106911c(C109033l0.class);
        Pair pair = null;
        if (l0Var == null) {
            Log.m105928w("MicroMsg.MiniQBReaderUI", "prepareServiceAndMaterialModel, openMaterialService is null");
        } else if (!l0Var.mo158321RB(C98783b.ATTACH)) {
            Log.m105924i("MicroMsg.MiniQBReaderUI", "prepareServiceAndMaterialModel, openMaterialService is not enabled");
        } else if (Util.isNullOrNil(this.f55251e)) {
            Log.m105924i("MicroMsg.MiniQBReaderUI", "prepareServiceAndMaterialModel, filePath is empty");
        } else {
            pair = new Pair(l0Var, MaterialModel.m117225b(this.f55251e, this.f55252f));
        }
        if (pair == null) {
            Log.m105928w("MicroMsg.MiniQBReaderUI", "doSomeOpenMaterialTask, serviceAndMaterialModel is null");
            return;
        }
        C109033l0 l0Var2 = (C109033l0) pair.first;
        MaterialModel materialModel = (MaterialModel) pair.second;
        String str = this.f55251e;
        if (str == null || !str.equals(this.f55244E) || this.f55245F == null) {
            l0Var2.mo158324aj(materialModel, new C19533g(this, materialModel, l0Var2, hVar));
            return;
        }
        Log.m105924i("MicroMsg.MiniQBReaderUI", "doSomeOpenMaterialTask, already fetchOpenMaterials");
        hVar.mo25341a(this, l0Var2, this.f55245F);
    }

    /* renamed from: J7 */
    public final void mo25334J7(int i) {
        Log.m105918d("MicroMsg.MiniQBReaderUI", "tryReportOpenMaterialEntranceExposure, curTryTimes: " + i);
        C107884f0 f0Var = this.f55248I;
        if (f0Var != null) {
            f0Var.mo158307e();
            return;
        }
        Log.m105924i("MicroMsg.MiniQBReaderUI", "tryReportOpenMaterialEntranceExposure, openMaterialReporter is null");
        if (10 > i) {
            C119179t tVar = C119157j.f356862d;
            C19527a aVar = new C19527a(i + 1);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar, 100, false);
        }
    }

    /* renamed from: P6 */
    public C23547h.C23548a mo25335P6() {
        return new C23547h.C23548a(true, (String) null, (String) null, (String) null, false, false, 62, (C8480h) null);
    }

    public void finish() {
        C97668a aVar = this.f55257n;
        if (aVar != null) {
            aVar.mo149068c0();
        }
        super.finish();
    }

    public int getLayoutId() {
        return -1;
    }

    public final void init() {
        C46249a aVar;
        Class cls = C92331c.class;
        Log.m105924i("MicroMsg.MiniQBReaderUI", "init activity isFinishing = " + isFinishing());
        this.f55250d = getIntent().getLongExtra("msg_id", 0);
        getIntent().getBooleanExtra("open_in_device", false);
        this.f55251e = getIntent().getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH);
        this.f55252f = getIntent().getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_EXT);
        this.f55255i = getIntent().getStringExtra("file_name");
        this.f55254h = getIntent().getIntExtra("sence", 0);
        try {
            this.f55253g = C90193h.m112876d(this.f55251e);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MiniQBReaderUI", "get file md5 error " + e.getMessage());
        }
        Log.m105925i("MicroMsg.MiniQBReaderUI", "init() filePath:%s fileExt:%s fileName:%s sence:%s", this.f55251e, this.f55252f, this.f55255i, Integer.valueOf(this.f55254h));
        if (Util.isNullOrNil(this.f55255i)) {
            try {
                int lastIndexOf = this.f55251e.lastIndexOf(47) + 1;
                if (lastIndexOf < 0 || lastIndexOf == this.f55251e.length()) {
                    lastIndexOf = 0;
                }
                String str = this.f55251e;
                this.f55255i = str.substring(lastIndexOf, str.length());
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.MiniQBReaderUI", "get file name error " + e2.getMessage());
                this.f55255i = " ";
            }
        }
        C97668a aVar2 = new C97668a(new C22663i(getContext()));
        this.f55257n = aVar2;
        aVar2.mo136917C0(this.f55251e, this.f55252f, this.f55254h, false);
        this.f55257n.mo136918D0(this.f55252f, this.f55255i);
        this.f55259p = new C46249a(getContext());
        C98700c cVar = new C98700c(this.f55259p);
        this.f55258o = cVar;
        cVar.mo32878l(this.f55251e, this.f55252f, this.f55254h, false);
        this.f55258o.mo32879q(this.f55252f, this.f55255i);
        IListener<MiniQbFloatBallMenuActionEvent> iListener = this.f55240A;
        if (iListener != null) {
            iListener.alive();
        }
        if (this.f55249J) {
            this.f55258o.mo74188E();
            this.f55257n.mo64003o();
        }
        MultiTaskInfo multiTaskInfo = this.f55258o.f326418a;
        HandOff handOff = null;
        if (multiTaskInfo != null) {
            handOff = ((C92331c) C86312j.m106911c(cls)).lt0(multiTaskInfo.field_id);
        }
        if (handOff == null) {
            handOff = ((C92331c) C86312j.m106911c(cls)).mo58367jO();
        }
        if (handOff instanceof HandOffFile) {
            HandOffFile handOffFile = (HandOffFile) handOff;
            this.f55263t = handOffFile;
            handOffFile.setHandOffType(1);
            HandOffFile handOffFile2 = this.f55263t;
            handOffFile2.setKey(HandOff.generateKey(handOffFile2.getDataType(), this.f55263t.getHandOffType()));
            this.f55263t.saveToMultiTaskInfo(this.f55258o.f326418a);
            Log.m105924i("MicroMsg.MiniQBReaderUI", "[handoff] Call onFileCreate, key = " + handOff.getKey());
            ((C92331c) C86312j.m106911c(cls)).mo58377tt(handOff);
        }
        this.f55262s = ((C92331c) C86312j.m106911c(cls)).mo58357LH() && this.f55263t != null && HandOffFile.isSupportOpenFile(this.f55252f);
        MMHandlerThread.postToMainThread(new C19529c());
        FileReaderHelper.ReaderType readerType = FileReaderHelper.getReaderType(this.f55252f, true, new Intent());
        if (readerType == FileReaderHelper.ReaderType.X5) {
            C98700c cVar2 = this.f55258o;
            if (cVar2 != null) {
                cVar2.f289439w = true;
            }
            C46249a aVar3 = this.f55259p;
            if (aVar3 != null) {
                String str2 = cVar2.f326418a.field_id;
                aVar3.f124669g = true;
                aVar3.f124670h = false;
                aVar3.f124671i = str2;
            }
        } else if (readerType == FileReaderHelper.ReaderType.XWEB && (aVar = this.f55259p) != null) {
            String str3 = this.f55258o.f326418a.field_id;
            aVar.f124669g = false;
            aVar.f124670h = true;
            aVar.f124671i = str3;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((C22921c) C86312j.m106911c(C22921c.class)).mo35885Yc(this, i, i2, intent, true, C0966R.string.c1b, C0966R.string.c1c, 1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f55251e = getIntent().getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH);
        Log.m105918d("MicroMsg.MiniQBReaderUI", "updateIsFileCanOpenByAppBrand");
        mo25333I7(new C19538k((C195261) null));
        Log.m105925i("MicroMsg.MiniQBReaderUI", "onCreate filePath:%s %s", this.f55251e, toString());
        MiniQbFloatBallMenuActionEvent miniQbFloatBallMenuActionEvent = new MiniQbFloatBallMenuActionEvent();
        MiniQbFloatBallMenuActionEvent.C17684a aVar = miniQbFloatBallMenuActionEvent.f48105d;
        aVar.f48107a = 3;
        aVar.f48108b = getIntent().getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH);
        miniQbFloatBallMenuActionEvent.asyncPublish(Looper.getMainLooper());
        ((C119157j) C119157j.f356862d).mo183878i(new C19528b(), 300);
    }

    public void onDestroy() {
        Log.m105925i("MicroMsg.MiniQBReaderUI", "onDestroy %s", toString());
        C19894d.m21642a(this, this.f55256j, this.f55251e);
        if (C85861e4.m106115b(this)) {
            C85861e4.m106117d(MiniQBReaderUI.class, 0);
        }
        super.onDestroy();
        IListener<MiniQbFloatBallMenuActionEvent> iListener = this.f55240A;
        if (iListener != null) {
            iListener.dead();
        }
        C98700c cVar = this.f55258o;
        if (cVar != null) {
            cVar.getClass();
        }
        C97668a aVar = this.f55257n;
        if (aVar != null) {
            aVar.mo67996A0();
        }
        if (this.f55263t != null) {
            ((C92331c) C86312j.m106911c(C92331c.class)).A70(this.f55263t);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C98700c cVar;
        if (i != 4 || (cVar = this.f55258o) == null || !cVar.mo67896U(2, cVar.f289438v)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.m105925i("MicroMsg.MiniQBReaderUI", "onNewIntent %s", toString());
        setIntent(intent);
        String stringExtra = getIntent().getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH);
        Log.m105925i("MicroMsg.MiniQBReaderUI", "onNewIntent() newFilePath:%s filePath:%s", stringExtra, this.f55251e);
        if (!Util.isEqual(stringExtra, this.f55251e)) {
            this.f55260q = false;
            C19894d.m21642a(this, this.f55256j, this.f55251e);
            C98700c cVar = this.f55258o;
            if (cVar != null) {
                cVar.mo74189F();
                this.f55258o.getClass();
            }
            C97668a aVar = this.f55257n;
            if (aVar != null) {
                aVar.mo64001C();
                this.f55257n.mo67996A0();
            }
            init();
            Log.m105918d("MicroMsg.MiniQBReaderUI", "updateIsFileCanOpenByAppBrand");
            mo25333I7(new C19538k((C195261) null));
        }
    }

    public void onPause() {
        Log.m105925i("MicroMsg.MiniQBReaderUI", "onPause %s", toString());
        super.onPause();
        C98700c cVar = this.f55258o;
        if (cVar != null) {
            this.f55249J = false;
            cVar.mo74189F();
        }
        C97668a aVar = this.f55257n;
        if (aVar != null) {
            aVar.mo64001C();
        }
    }

    public void onResume() {
        Log.m105925i("MicroMsg.MiniQBReaderUI", "onResume %s", toString());
        super.onResume();
        C97668a aVar = this.f55257n;
        if (aVar != null) {
            aVar.mo64003o();
        }
        C98700c cVar = this.f55258o;
        if (cVar != null) {
            cVar.mo74188E();
        } else {
            this.f55249J = true;
        }
        if (this.f55266w) {
            if (this.f55267x) {
                init();
                this.f55267x = false;
            }
            C85878m2.m106217f(getTaskId(), this.f55265v);
            this.f55266w = false;
        }
    }
}
