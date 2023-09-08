package com.tencent.p014mm.p136ui.chatting.gallery;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import androidx.viewpager.widget.ViewPager;
import aw0.C103928o;
import c00.C0405n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.uitl.IdUtil;
import com.tencent.p014mm.album.p836ui.c2c.gallery.C55068a;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ChattingUIPhotoInfoEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileFailedEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.autogen.events.ReleaseDealQBarStrEvent;
import com.tencent.p014mm.autogen.events.ScanTranslationEvent;
import com.tencent.p014mm.autogen.events.ScanTranslationResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.GalleryTranslateReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.ImageFastEntryDetectStruct;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.modelimage.C1300x;
import com.tencent.p014mm.modelimage.C92822e;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.C19706a;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.chatting.gallery.C73708v;
import com.tencent.p014mm.p136ui.chatting.gallery.C97056h;
import com.tencent.p014mm.p136ui.chatting.gallery.scan.ImageScanCodeManager;
import com.tencent.p014mm.p136ui.chatting.gallery.view.FullScreenStatusMaskView;
import com.tencent.p014mm.p136ui.chatting.gallery.view.SearchImageBubbleView;
import com.tencent.p014mm.p136ui.chatting.viewitems.C6805l4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.TouchMediaPreviewLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.C30391y;
import com.tencent.p014mm.plugin.scanner.C94466j;
import com.tencent.p014mm.plugin.scanner.C94468m;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.plugin.scanner.word.C94533d;
import com.tencent.p014mm.plugin.scanner.word.ImageWordScanDetailEngine;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44085t;
import com.tencent.p014mm.pluginsdk.p133ui.tools.RedesignVideoPlayerSeekBar;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import e20.C116637d;
import e20.C97588f;
import eb0.C45628s0;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import ex0.C45696d;
import f40.C86709a0;
import f40.C86737h0;
import f62.C75700k0;
import g62.C75875l;
import gj3.C59469a;
import gj3.C59474h;
import gk3.C75919p;
import gk3.C98134c;
import gk3.C98135d;
import gk3.C98136e;
import gk3.C98140g;
import gk3.C98152j;
import gk3.C98153k;
import gk3.C98154l;
import gk3.C98158m;
import gk3.C98160n;
import gk3.C98161o;
import gk3.C98162q;
import gq0.C107885g0;
import gy3.C87412m;
import h81.C32735h;
import hd0.C98410o0;
import hd0.C98429r0;
import hd0.C98442x0;
import hh2.C8532a;
import hi3.C87515a;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kr0.C109033l0;
import mk3.C21506a;
import nj3.C11184p0;
import nj3.C76879j;
import nj3.C88989a;
import p1083jg.C98939a;
import p158gt.C98201k;
import p182kk.C61104a;
import p200lx.C46896e0;
import p200lx.C46897s;
import p200lx.C46900z;
import p200lx.C99711g0;
import p200lx.C99716u;
import p206nj.C11171e;
import p434ig.C98672d;
import p548hg.C98450d;
import p606mm.C99933h;
import p682rz.C101488s;
import p749xh.C38543c8;
import q90.C101062d;
import qh0.C62619a;
import qo3.C77407n;
import s90.C48300n;
import sk2.C101643c;
import sk2.C101647f;
import th0.C101888l;
import tk2.C101903a;
import tk2.C101904b;
import tk2.C22543c;
import u73.C101980n;
import u73.C101983r;
import uk2.C14201c;
import vo3.C90852c;
import xl2.C102690c;
import zt3.C119157j;

@C86737h0
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI */
public class ImageGalleryUI extends BaseMvvmActivity implements View.OnClickListener, C94533d.C94534a<String, C102690c> {

    /* renamed from: S2 */
    public static final /* synthetic */ int f284337S2 = 0;

    /* renamed from: A */
    public int f284338A = 0;

    /* renamed from: A1 */
    public boolean f284339A1;

    /* renamed from: A2 */
    public boolean f284340A2;

    /* renamed from: B */
    public long f284341B = 0;

    /* renamed from: B1 */
    public int f284342B1;

    /* renamed from: B2 */
    public ViewPager.OnPageChangeListener f284343B2;

    /* renamed from: C */
    public boolean f284344C = false;

    /* renamed from: C1 */
    public int f284345C1;

    /* renamed from: C2 */
    public View f284346C2;

    /* renamed from: D */
    public int f284347D = 0;

    /* renamed from: D1 */
    public C94533d f284348D1;

    /* renamed from: D2 */
    public TextView f284349D2;

    /* renamed from: E */
    public View f284350E = null;

    /* renamed from: E1 */
    public volatile int f284351E1;

    /* renamed from: E2 */
    public TextView f284352E2;

    /* renamed from: F */
    public View f284353F;

    /* renamed from: F1 */
    public boolean f284354F1;

    /* renamed from: F2 */
    public MMNeat7extView f284355F2;

    /* renamed from: G */
    public Drawable f284356G;

    /* renamed from: G1 */
    public boolean f284357G1;

    /* renamed from: G2 */
    public View f284358G2;

    /* renamed from: H */
    public Button f284359H;

    /* renamed from: H1 */
    public int f284360H1;

    /* renamed from: H2 */
    public View f284361H2;

    /* renamed from: I */
    public Button f284362I;

    /* renamed from: I1 */
    public int f284363I1;

    /* renamed from: I2 */
    public ImageView f284364I2;

    /* renamed from: J */
    public View f284365J;

    /* renamed from: J1 */
    public Bundle f284366J1;

    /* renamed from: J2 */
    public ImageView f284367J2;

    /* renamed from: K */
    public TextView f284368K;

    /* renamed from: K1 */
    public long f284369K1;

    /* renamed from: K2 */
    public boolean f284370K2;

    /* renamed from: L */
    public FullScreenStatusMaskView f284371L;

    /* renamed from: L1 */
    public String f284372L1;

    /* renamed from: L2 */
    public MTimerHandler f284373L2;

    /* renamed from: M */
    public boolean f284374M = false;

    /* renamed from: M1 */
    public boolean f284375M1;

    /* renamed from: M2 */
    public HashMap<Long, String> f284376M2;

    /* renamed from: N */
    public View f284377N;

    /* renamed from: N1 */
    public ImageView f284378N1;

    /* renamed from: N2 */
    public boolean f284379N2;

    /* renamed from: O1 */
    public ImageView f284380O1;

    /* renamed from: O2 */
    public boolean f284381O2;

    /* renamed from: P */
    public View f284382P;

    /* renamed from: P1 */
    public ImageView f284383P1;

    /* renamed from: P2 */
    public MMHandler f284384P2;

    /* renamed from: Q */
    public View f284385Q;

    /* renamed from: Q0 */
    public View f284386Q0;

    /* renamed from: Q1 */
    public ValueAnimator f284387Q1;

    /* renamed from: Q2 */
    public HashSet<Long> f284388Q2;

    /* renamed from: R */
    public View f284389R;

    /* renamed from: R0 */
    public FrameLayout f284390R0;

    /* renamed from: R1 */
    public Long f284391R1;

    /* renamed from: R2 */
    public boolean f284392R2;

    /* renamed from: S */
    public TextView f284393S;

    /* renamed from: S0 */
    public TextView f284394S0;

    /* renamed from: S1 */
    public Long f284395S1;

    /* renamed from: T */
    public View f284396T;

    /* renamed from: T0 */
    public boolean f284397T0;

    /* renamed from: T1 */
    public Long f284398T1;

    /* renamed from: U */
    public View f284399U;

    /* renamed from: U0 */
    public RedesignVideoPlayerSeekBar f284400U0;

    /* renamed from: U1 */
    public C46900z f284401U1;

    /* renamed from: V */
    public View f284402V;

    /* renamed from: V0 */
    public View f284403V0;

    /* renamed from: V1 */
    public C98136e f284404V1;

    /* renamed from: W */
    public View f284405W;

    /* renamed from: W0 */
    public ImageView f284406W0;

    /* renamed from: W1 */
    public C98152j f284407W1;

    /* renamed from: X */
    public MultiCodeMaskView f284408X;

    /* renamed from: X0 */
    public TouchMediaPreviewLayout f284409X0;

    /* renamed from: X1 */
    public C98153k f284410X1;

    /* renamed from: Y */
    public SearchImageBubbleView f284411Y;

    /* renamed from: Y0 */
    public int f284412Y0;

    /* renamed from: Y1 */
    public C97122r1 f284413Y1;

    /* renamed from: Z */
    public View f284414Z;

    /* renamed from: Z0 */
    public int f284415Z0;

    /* renamed from: Z1 */
    public C98134c f284416Z1;

    /* renamed from: a1 */
    public int f284417a1 = 0;

    /* renamed from: a2 */
    public long f284418a2;

    /* renamed from: b1 */
    public int f284419b1 = 0;

    /* renamed from: b2 */
    public C101903a f284420b2;

    /* renamed from: c1 */
    public int f284421c1 = 0;

    /* renamed from: c2 */
    public C101904b f284422c2;

    /* renamed from: d */
    public String f284423d;

    /* renamed from: d1 */
    public int f284424d1 = 0;

    /* renamed from: d2 */
    public C22543c f284425d2;

    /* renamed from: e */
    public String f284426e;

    /* renamed from: e1 */
    public int f284427e1 = 0;

    /* renamed from: e2 */
    public ImageGalleryUI$$w0 f284428e2;

    /* renamed from: f */
    public boolean f284429f;

    /* renamed from: f1 */
    public int f284430f1 = 0;

    /* renamed from: f2 */
    public C29060q f284431f2;

    /* renamed from: g */
    public C97056h f284432g;

    /* renamed from: g1 */
    public int f284433g1 = 0;

    /* renamed from: g2 */
    public boolean f284434g2;

    /* renamed from: h */
    public long f284435h;

    /* renamed from: h1 */
    public boolean f284436h1;

    /* renamed from: h2 */
    public View f284437h2;

    /* renamed from: i */
    public C44085t f284438i;

    /* renamed from: i1 */
    public int f284439i1;

    /* renamed from: i2 */
    public CheckBox f284440i2;

    /* renamed from: j */
    public C97056h.C97067g f284441j;

    /* renamed from: j1 */
    public C45059m0 f284442j1;

    /* renamed from: j2 */
    public View f284443j2;

    /* renamed from: k1 */
    public boolean f284444k1;

    /* renamed from: k2 */
    public boolean f284445k2;

    /* renamed from: l1 */
    public boolean f284446l1;

    /* renamed from: l2 */
    public float f284447l2;

    /* renamed from: m1 */
    public C77407n f284448m1;

    /* renamed from: m2 */
    public int f284449m2;

    /* renamed from: n */
    public MMViewPager f284450n;

    /* renamed from: n1 */
    public C98162q f284451n1;

    /* renamed from: n2 */
    public int f284452n2;

    /* renamed from: o */
    public boolean f284453o = false;

    /* renamed from: o1 */
    public boolean f284454o1;

    /* renamed from: o2 */
    public View f284455o2;

    /* renamed from: p */
    public RelativeLayout f284456p;

    /* renamed from: p0 */
    public Button f284457p0;

    /* renamed from: p1 */
    public ImageScanCodeManager f284458p1;

    /* renamed from: p2 */
    public C59469a f284459p2;

    /* renamed from: q */
    public RelativeLayout f284460q;

    /* renamed from: q1 */
    public C98140g f284461q1;

    /* renamed from: q2 */
    public C59469a f284462q2;

    /* renamed from: r */
    public boolean f284463r;

    /* renamed from: r1 */
    public int f284464r1;

    /* renamed from: r2 */
    public final ImageGalleryUI$$x0 f284465r2;

    /* renamed from: s */
    public boolean f284466s;

    /* renamed from: s1 */
    public C101647f f284467s1;

    /* renamed from: s2 */
    public String f284468s2;

    /* renamed from: t */
    public boolean f284469t = false;

    /* renamed from: t1 */
    public C98154l f284470t1;

    /* renamed from: t2 */
    public AppBrandOpenMaterialCollection f284471t2;

    /* renamed from: u */
    public boolean f284472u = false;

    /* renamed from: u1 */
    public boolean f284473u1;

    /* renamed from: u2 */
    public C107885g0 f284474u2;

    /* renamed from: v */
    public boolean f284475v = true;

    /* renamed from: v1 */
    public boolean f284476v1;

    /* renamed from: v2 */
    public ImageGalleryUI$$y0 f284477v2;

    /* renamed from: w */
    public C97123s f284478w = new C97123s();

    /* renamed from: w1 */
    public boolean f284479w1;

    /* renamed from: w2 */
    public C11184p0 f284480w2;

    /* renamed from: x */
    public int f284481x = 0;

    /* renamed from: x0 */
    public Button f284482x0;

    /* renamed from: x1 */
    public boolean f284483x1;

    /* renamed from: x2 */
    public IListener<ScanTranslationResultEvent> f284484x2;

    /* renamed from: y */
    public int f284485y = 0;

    /* renamed from: y0 */
    public View f284486y0;

    /* renamed from: y1 */
    public boolean f284487y1;

    /* renamed from: y2 */
    public int f284488y2;

    /* renamed from: z */
    public int f284489z = 0;

    /* renamed from: z1 */
    public boolean f284490z1;

    /* renamed from: z2 */
    public boolean f284491z2;

    public ImageGalleryUI() {
        new ArrayList();
        this.f284444k1 = false;
        this.f284446l1 = false;
        this.f284451n1 = new C98162q();
        this.f284454o1 = false;
        this.f284461q1 = new C98140g();
        this.f284464r1 = 0;
        this.f284470t1 = new C98154l();
        this.f284476v1 = false;
        this.f284479w1 = false;
        this.f284483x1 = false;
        this.f284487y1 = false;
        this.f284339A1 = false;
        this.f284342B1 = -1;
        this.f284360H1 = 0;
        this.f284363I1 = 0;
        this.f284372L1 = null;
        this.f284391R1 = 0L;
        this.f284395S1 = 0L;
        this.f284398T1 = 0L;
        this.f284404V1 = new C98136e();
        this.f284407W1 = new ImageGalleryUI$$d(this);
        this.f284410X1 = new ImageGalleryUI$$t(this);
        this.f284413Y1 = new ImageGalleryUI$$d0(this);
        this.f284416Z1 = new ImageGalleryUI$$m0(this);
        this.f284418a2 = 0;
        this.f284420b2 = null;
        this.f284422c2 = ((C14201c) C86312j.m106911c(C14201c.class)).mo12579vD();
        this.f284425d2 = new ImageGalleryUI$$q0(this);
        this.f284431f2 = new ImageGalleryUI$$s0(this);
        this.f284434g2 = false;
        this.f284445k2 = true;
        this.f284447l2 = 1.0f;
        this.f284449m2 = 0;
        this.f284452n2 = 0;
        this.f284459p2 = new ImageGalleryUI$$r(this);
        this.f284462q2 = new ImageGalleryUI$$s(this);
        this.f284465r2 = new ImageGalleryUI$$x0(this, (ImageGalleryUI$$d) null);
        this.f284468s2 = null;
        this.f284471t2 = null;
        this.f284474u2 = null;
        this.f284477v2 = null;
        this.f284480w2 = new ImageGalleryUI$$e0(this);
        this.f284484x2 = new IListener<ScanTranslationResultEvent>(C40008f.f107254d) {
            {
                this.__eventId = -1699517927;
            }

            public boolean callback(IEvent iEvent) {
                ScanTranslationResultEvent scanTranslationResultEvent = (ScanTranslationResultEvent) iEvent;
                Log.m105925i("MicroMsg.ImageGalleryUI", "scanTranslationResult %d, %s", Integer.valueOf(scanTranslationResultEvent.f265089d.f265090a), Boolean.valueOf(scanTranslationResultEvent.f265089d.f265092c));
                MMHandlerThread.postToMainThread(new C97046e0(this, scanTranslationResultEvent));
                return true;
            }
        };
        this.f284488y2 = 0;
        this.f284491z2 = false;
        this.f284340A2 = true;
        this.f284343B2 = new ImageGalleryUI$$f0(this);
        this.f284346C2 = null;
        this.f284370K2 = false;
        this.f284373L2 = new MTimerHandler(new ImageGalleryUI$$j0(this), false);
        this.f284376M2 = new HashMap<>();
        this.f284379N2 = false;
        this.f284381O2 = false;
        this.f284384P2 = new MMHandler(Looper.getMainLooper());
        this.f284388Q2 = new HashSet<>();
        this.f284392R2 = false;
    }

    /* renamed from: H7 */
    public static void m124726H7(ImageGalleryUI imageGalleryUI) {
        imageGalleryUI.getClass();
        int c = C75044y4.m89991c(imageGalleryUI);
        Log.m105925i("MicroMsg.ImageGalleryUI", "%d handleVerticalUI image gallery ui isNavigationBarTint %b navBarHeight %d", Integer.valueOf(imageGalleryUI.hashCode()), Boolean.valueOf(imageGalleryUI.f284463r), Integer.valueOf(c));
        View view = imageGalleryUI.f284346C2;
        if (view != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, 0, 0);
            imageGalleryUI.f284346C2.setLayoutParams(layoutParams);
        }
        int f = C76577a.m92155f(imageGalleryUI, C0966R.dimen.f3766df);
        int f2 = C76577a.m92155f(imageGalleryUI, C0966R.dimen.f3738cr);
        int f3 = C76577a.m92155f(imageGalleryUI, C0966R.dimen.f3723cd);
        int f4 = C76577a.m92155f(imageGalleryUI, C0966R.dimen.f3743cv);
        int i = f * 2;
        int i2 = i + c;
        imageGalleryUI.f284456p.setPadding(0, i, 0, i2);
        imageGalleryUI.f284489z = f3;
        imageGalleryUI.f284338A = f2;
        imageGalleryUI.mo135781o8();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageGalleryUI.f284400U0.getLayoutParams();
        layoutParams2.removeRule(1);
        layoutParams2.removeRule(0);
        layoutParams2.setMargins(f2, f4, f2, 0);
        imageGalleryUI.mo135781o8();
        imageGalleryUI.f284400U0.setLayoutParams(layoutParams2);
        imageGalleryUI.mo135781o8();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) imageGalleryUI.f284403V0.getLayoutParams();
        layoutParams3.height = C76577a.m92157h(imageGalleryUI, C0966R.dimen.f3720ca);
        layoutParams3.bottomMargin = c;
        imageGalleryUI.mo135781o8();
        imageGalleryUI.f284403V0.setLayoutParams(layoutParams3);
        ((RelativeLayout.LayoutParams) imageGalleryUI.f284368K.getLayoutParams()).setMargins(0, i, f2, 0);
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) imageGalleryUI.f284353F.getLayoutParams();
        layoutParams4.addRule(3, C0966R.C0970id.l6x);
        layoutParams4.setMargins(f2, f4, 0, 0);
        layoutParams4.removeRule(15);
        imageGalleryUI.f284353F.setLayoutParams(layoutParams4);
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) imageGalleryUI.f284359H.getLayoutParams();
        layoutParams5.addRule(3, C0966R.C0970id.l6x);
        layoutParams5.setMargins(f3, f4, 0, 0);
        layoutParams5.removeRule(15);
        imageGalleryUI.f284359H.setLayoutParams(layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) imageGalleryUI.f284362I.getLayoutParams();
        layoutParams6.addRule(3, C0966R.C0970id.l6x);
        layoutParams6.setMargins(f3, f4, 0, 0);
        layoutParams6.removeRule(15);
        imageGalleryUI.f284362I.setLayoutParams(layoutParams6);
        RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) imageGalleryUI.f284365J.getLayoutParams();
        layoutParams7.addRule(3, C0966R.C0970id.l6x);
        layoutParams7.setMargins(f3, f4, 0, 0);
        layoutParams7.removeRule(15);
        imageGalleryUI.f284365J.setLayoutParams(layoutParams7);
        RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) imageGalleryUI.f284382P.getLayoutParams();
        layoutParams8.addRule(3, C0966R.C0970id.l6x);
        layoutParams8.setMargins(0, f4, f2, 0);
        layoutParams8.removeRule(15);
        imageGalleryUI.f284382P.setLayoutParams(layoutParams8);
        imageGalleryUI.mo135779m8();
        RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) imageGalleryUI.f284377N.getLayoutParams();
        layoutParams9.addRule(3, C0966R.C0970id.l6x);
        layoutParams9.setMargins(0, f4, f3, 0);
        layoutParams9.removeRule(15);
        imageGalleryUI.mo135779m8();
        imageGalleryUI.f284377N.setLayoutParams(layoutParams9);
        imageGalleryUI.mo135777k8();
        RelativeLayout.LayoutParams layoutParams10 = (RelativeLayout.LayoutParams) imageGalleryUI.f284385Q.getLayoutParams();
        layoutParams10.addRule(3, C0966R.C0970id.l6x);
        layoutParams10.setMargins(0, f4, f3, 0);
        layoutParams10.removeRule(15);
        imageGalleryUI.mo135777k8();
        imageGalleryUI.f284385Q.setLayoutParams(layoutParams10);
        RelativeLayout.LayoutParams layoutParams11 = (RelativeLayout.LayoutParams) imageGalleryUI.f284389R.getLayoutParams();
        layoutParams11.addRule(3, C0966R.C0970id.l6x);
        layoutParams11.setMargins(0, f4, f3, 0);
        layoutParams11.removeRule(15);
        imageGalleryUI.f284389R.setLayoutParams(layoutParams11);
        RelativeLayout.LayoutParams layoutParams12 = (RelativeLayout.LayoutParams) imageGalleryUI.f284393S.getLayoutParams();
        layoutParams12.setMargins(i, 0, 0, f * 3);
        imageGalleryUI.f284393S.setLayoutParams(layoutParams12);
        imageGalleryUI.mo135783p8();
        RelativeLayout.LayoutParams layoutParams13 = (RelativeLayout.LayoutParams) imageGalleryUI.f284396T.getLayoutParams();
        layoutParams13.addRule(3, C0966R.C0970id.l6x);
        layoutParams13.setMargins(0, f4, f3, 0);
        layoutParams13.removeRule(15);
        imageGalleryUI.mo135783p8();
        imageGalleryUI.f284396T.setLayoutParams(layoutParams13);
        imageGalleryUI.mo135784q8();
        RelativeLayout.LayoutParams layoutParams14 = (RelativeLayout.LayoutParams) imageGalleryUI.f284402V.getLayoutParams();
        layoutParams14.addRule(3, C0966R.C0970id.l6x);
        layoutParams14.setMargins(0, f4, f3, 0);
        layoutParams14.removeRule(15);
        imageGalleryUI.mo135784q8();
        imageGalleryUI.f284402V.setLayoutParams(layoutParams14);
        imageGalleryUI.mo135778l8();
        RelativeLayout.LayoutParams layoutParams15 = (RelativeLayout.LayoutParams) imageGalleryUI.f284405W.getLayoutParams();
        layoutParams15.addRule(3, C0966R.C0970id.l6x);
        layoutParams15.setMargins(0, f4, f3, 0);
        layoutParams15.removeRule(15);
        imageGalleryUI.mo135778l8();
        imageGalleryUI.f284405W.setLayoutParams(layoutParams15);
        imageGalleryUI.mo135780n8();
        RelativeLayout.LayoutParams layoutParams16 = (RelativeLayout.LayoutParams) imageGalleryUI.f284414Z.getLayoutParams();
        layoutParams16.setMargins(f2, f4, 0, 0);
        layoutParams16.removeRule(15);
        layoutParams16.addRule(9);
        imageGalleryUI.mo135780n8();
        imageGalleryUI.f284414Z.setLayoutParams(layoutParams16);
        imageGalleryUI.mo135785r8();
        RelativeLayout.LayoutParams layoutParams17 = (RelativeLayout.LayoutParams) imageGalleryUI.f284411Y.getLayoutParams();
        layoutParams17.setMargins(0, 0, f2, i2 + imageGalleryUI.f284485y + f);
        imageGalleryUI.mo135785r8();
        imageGalleryUI.f284411Y.setLayoutParams(layoutParams17);
        if (imageGalleryUI.f284344C) {
            imageGalleryUI.f284344C = false;
            imageGalleryUI.mo135771g9();
            imageGalleryUI.mo135785r8();
            if (imageGalleryUI.f284411Y.getVisibility() == 0) {
                imageGalleryUI.mo135759a9(true);
            }
        }
    }

    /* renamed from: I7 */
    public static void m124727I7(ImageGalleryUI imageGalleryUI, long j) {
        imageGalleryUI.getClass();
        Log.m105927v("MicroMsg.ImageGalleryUI", "doSearchImagePreview msgId: %s", Long.valueOf(j));
        if (C98135d.f287727c) {
            imageGalleryUI.f284461q1.mo137429i(4, 2);
            imageGalleryUI.f284461q1.mo137427g(4, new C97049f0(imageGalleryUI));
        }
        if (C98135d.f287728d) {
            C98154l lVar = imageGalleryUI.f284470t1;
            C98134c cVar = imageGalleryUI.f284416Z1;
            lVar.getClass();
            C98161o oVar = new C98161o(cVar, j, System.currentTimeMillis(), lVar);
            ((C119157j) C119157j.f356862d).mo183871b(new C98158m(j, oVar), "search_preview_compute_phash");
            return;
        }
        C98154l lVar2 = imageGalleryUI.f284470t1;
        C98134c cVar2 = imageGalleryUI.f284416Z1;
        lVar2.getClass();
        C98160n nVar = new C98160n(cVar2, j);
        ((C119157j) C119157j.f356862d).mo183871b(new C98158m(j, nVar), "search_preview_compute_phash");
    }

    /* renamed from: J7 */
    public static int m124728J7(ImageGalleryUI imageGalleryUI) {
        boolean z = false;
        if (Util.isNullOrNil(imageGalleryUI.f284423d)) {
            return 0;
        }
        if (!Util.isNullOrNil(imageGalleryUI.f284426e) || C72996z1.m85820U5(imageGalleryUI.f284423d)) {
            z = true;
        }
        if (z) {
            return 2;
        }
        return C72996z1.m85846q5(imageGalleryUI.f284423d) ? 9 : 1;
    }

    /* renamed from: K7 */
    public static void m124729K7(ImageGalleryUI imageGalleryUI) {
        C97056h hVar;
        C92836k p;
        C101903a aVar = imageGalleryUI.f284420b2;
        if ((aVar == null || !aVar.mo33392i()) && (hVar = imageGalleryUI.f284432g) != null) {
            Boolean A = hVar.mo135914A(hVar.mo135935w());
            if (imageGalleryUI.f284363I1 != 1 && !Boolean.TRUE.equals(A)) {
                imageGalleryUI.f284472u = true;
                int i = imageGalleryUI.f284363I1;
                if (i == 0 || i == 2) {
                    GalleryTranslateReportStruct galleryTranslateReportStruct = new GalleryTranslateReportStruct();
                    galleryTranslateReportStruct.f265618d = imageGalleryUI.f284363I1 == 2 ? 1 : 0;
                    galleryTranslateReportStruct.f265619e = 1;
                    galleryTranslateReportStruct.f265620f = 4;
                    C97056h hVar2 = imageGalleryUI.f284432g;
                    if (!(hVar2 == null || (p = C97100o.m125011p(hVar2.mo135935w())) == null)) {
                        galleryTranslateReportStruct.mo126621t(p.mo127136g());
                        galleryTranslateReportStruct.mo126620s(p.mo127133d());
                    }
                    galleryTranslateReportStruct.mo86054n();
                }
                String u5 = imageGalleryUI.mo135788u5();
                imageGalleryUI.mo135748V7((View) null, C86013q1.m106448i(u5, false), (Bitmap) null, 2, imageGalleryUI.f284407W1);
                imageGalleryUI.mo135746U7(u5, true);
                imageGalleryUI.mo135751W8();
            }
        }
    }

    /* renamed from: L7 */
    public static View m124730L7(ImageGalleryUI imageGalleryUI, C97056h hVar, MMViewPager mMViewPager) {
        imageGalleryUI.getClass();
        if (hVar == null || mMViewPager == null || hVar.mo135935w() == null) {
            return null;
        }
        if (hVar.mo135935w().mo100979R3() || hVar.mo135935w().mo100961A3()) {
            return hVar.mo129061f(mMViewPager.getCurrentItem(), false);
        }
        return null;
    }

    /* renamed from: A8 */
    public final void mo135718A8(View view, boolean z) {
        Log.m105919d("MicroMsg.ImageGalleryUI", "alvinluo hideButton view: %s, withAnimation: %b", view, Boolean.valueOf(z));
        if (view != null) {
            if (mo135724G8() && view == this.f284389R) {
                return;
            }
            if (!z) {
                mo135743S8(view, 8);
                C75919p pVar = C75919p.f222593a;
                Log.m105919d("MicroMsg.QuickButtonAnimationHelper", "alvinluo cancelAnimation view: %s", view);
                C75919p.f222594b.remove(Integer.valueOf(view.hashCode()));
                ValueAnimator valueAnimator = C75919p.f222596d.get(Integer.valueOf(view.hashCode()));
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                C75919p pVar2 = C75919p.f222593a;
                ValueAnimator valueAnimator2 = C75919p.f222596d.get(Integer.valueOf(view.hashCode()));
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    valueAnimator2.removeAllListeners();
                }
            } else if (view.getVisibility() == 0) {
                C75919p.f222593a.mo106176a(view, false);
            }
        }
    }

    /* renamed from: B8 */
    public void mo135719B8() {
        boolean z = true;
        if (BuildInfo.IS_FLAVOR_RED) {
            Log.m105919d("MicroMsg.ImageGalleryUI", "hideOpLayer isShowOpToolbar: %b, %s", Boolean.valueOf(this.f284370K2), Util.getStack());
        }
        if (this.f284370K2) {
            this.f284370K2 = false;
            Object[] objArr = new Object[1];
            if (this.f284460q.getVisibility() != 0) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105919d("MicroMsg.ImageGalleryUI", "fadeOutOpLayout: %b", objArr);
            Animation a8 = mo135758a8(150);
            a8.setFillAfter(false);
            a8.setAnimationListener(new C97069h0(this));
            this.f284460q.clearAnimation();
            this.f284460q.startAnimation(a8);
        }
    }

    /* renamed from: C8 */
    public void mo135720C8() {
        mo135767e9();
        View view = this.f284382P;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hideOpLayerAfterAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hideOpLayerAfterAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f284368K.setTextColor(C76577a.m92153d(this, C0966R.color.BW_100_Alpha_0_6_5));
        mo135779m8();
        this.f284377N.clearAnimation();
        mo135779m8();
        mo135743S8(this.f284377N, 8);
        mo135777k8();
        mo135743S8(this.f284385Q, 8);
        View view2 = this.f284389R;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hideOpLayerAfterAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hideOpLayerAfterAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo135783p8();
        mo135743S8(this.f284396T, 8);
        mo135784q8();
        mo135743S8(this.f284402V, 8);
        mo135778l8();
        mo135743S8(this.f284405W, 8);
        mo135785r8();
        mo135743S8(this.f284411Y, 8);
        mo135722E8();
        mo135737P8(false);
        mo135739Q8(false);
        this.f284460q.setVisibility(8);
    }

    /* renamed from: D8 */
    public final void mo135721D8(int i, boolean z) {
        if (!mo135726I8() && !mo135725H8()) {
            Log.m105925i("MicroMsg.ImageGalleryUI", "alvinluo hideQuickButton showType: %d, withAnimation: %b", Integer.valueOf(i), Boolean.valueOf(z));
            if (i != 2) {
                mo135783p8();
                mo135718A8(this.f284396T, z);
            }
            if (i != 3) {
                mo135785r8();
                mo135718A8(this.f284411Y, z);
            }
            if (i != 1) {
                mo135718A8(this.f284389R, z);
            }
            if (i != 5) {
                mo135718A8(this.f284389R, z);
            }
            if (i != 4) {
                mo135784q8();
                mo135718A8(this.f284402V, z);
            }
            if (i != 6) {
                mo135778l8();
                mo135718A8(this.f284405W, z);
            }
            if (i == 0) {
                this.f284347D = 0;
                this.f284350E = null;
            }
        }
    }

    /* renamed from: E8 */
    public void mo135722E8() {
        Log.m105924i("MicroMsg.ImageGalleryUI", "hide video tool bar");
        Log.m105919d("MicroMsg.ImageGalleryUI", "switch tool bar bg %b", Boolean.FALSE);
        mo135781o8();
        mo135743S8(this.f284400U0, 8);
        mo135781o8();
        mo135743S8(this.f284403V0, 8);
        mo135743S8(this.f284353F, 8);
        mo135743S8(this.f284346C2, 8);
        mo135743S8(this.f284359H, 8);
    }

    /* renamed from: F8 */
    public final boolean mo135723F8() {
        return this.f284479w1 || this.f284476v1;
    }

    /* renamed from: G8 */
    public final boolean mo135724G8() {
        C97056h hVar = this.f284432g;
        if (hVar == null) {
            return this.f284392R2;
        }
        if (hVar.mo135914A(hVar.mo135935w()) != null) {
            C97056h hVar2 = this.f284432g;
            if (hVar2.mo135914A(hVar2.mo135935w()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H8 */
    public final boolean mo135725H8() {
        int intExtra = getIntent().getIntExtra("msg_type", 0);
        this.f284439i1 = intExtra;
        return intExtra == 2;
    }

    /* renamed from: I8 */
    public final boolean mo135726I8() {
        return this.f284439i1 == 1;
    }

    /* renamed from: J8 */
    public final boolean mo135727J8() {
        int i = this.f284465r2.f284555a;
        Log.m105924i("MicroMsg.ImageGalleryUI", "get#ScanState, state: " + i);
        if (2 != i) {
            Log.m105924i("MicroMsg.ImageGalleryUI", "isNeedHideAppBrandEntrance, not scanned");
            return true;
        } else if (!mo135792x8(2)) {
            Log.m105924i("MicroMsg.ImageGalleryUI", "isNeedHideAppBrandEntrance, code not found");
            return false;
        } else {
            C109033l0 l0Var = (C109033l0) C86312j.m106911c(C109033l0.class);
            if (l0Var == null) {
                Log.m105920e("MicroMsg.ImageGalleryUI", "isNeedHideAppBrandEntrance, openMaterialService is null");
                return true;
            }
            boolean Qh = l0Var.mo158320Qh(this.f284451n1.f287785a);
            Log.m105924i("MicroMsg.ImageGalleryUI", "isNeedHideAppBrandEntrance, canShowOnImageScene: " + Qh);
            return !Qh;
        }
    }

    /* renamed from: K8 */
    public boolean mo135728K8(Activity activity) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int i = width < height ? 1 : 0;
        Log.m105919d("MicroMsg.ImageGalleryUI", "%d is vertical screen orient %d [%d, %d]", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(width), Integer.valueOf(height));
        return i != 0;
    }

    /* renamed from: L8 */
    public final void mo135729L8() {
        this.f284475v = true;
        MMViewPager mMViewPager = this.f284450n;
        if (mMViewPager != null) {
            mMViewPager.setEnableGalleryScale(true);
            this.f284450n.setSingleMode(false);
        }
    }

    /* renamed from: M7 */
    public final boolean mo135730M7() {
        mo135729L8();
        C101903a aVar = this.f284420b2;
        if (aVar == null || !aVar.mo33387d(this.f284418a2)) {
            return false;
        }
        this.f284418a2 = 0;
        return true;
    }

    /* renamed from: M8 */
    public final void mo135731M8() {
        boolean x8 = mo135792x8(1);
        boolean x84 = mo135792x8(2);
        int i = (!x8 || !x84) ? x8 ? 3 : x84 ? 2 : 1 : 4;
        C98136e eVar = this.f284404V1;
        eVar.getClass();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        ImageFastEntryDetectStruct imageFastEntryDetectStruct = eVar.f287729a;
        objArr[1] = imageFastEntryDetectStruct != null ? imageFastEntryDetectStruct.f265640f : null;
        Log.m105927v("MicroMsg.ImageScanButtonReporter", "reportFastDetectEntry pictureConcluding: %d, sessionId: %s", objArr);
        ImageFastEntryDetectStruct imageFastEntryDetectStruct2 = eVar.f287729a;
        if (imageFastEntryDetectStruct2 != null) {
            imageFastEntryDetectStruct2.f265642h = (long) i;
        }
        if (imageFastEntryDetectStruct2 != null) {
            imageFastEntryDetectStruct2.mo86054n();
        }
    }

    /* renamed from: N7 */
    public final void mo135732N7(C72963f4 f4Var, boolean z) {
        C72963f4 f4Var2 = f4Var;
        boolean z2 = z;
        StringBuilder sb = new StringBuilder();
        sb.append("changeTranslateStatus() called with: msg = [");
        sb.append(f4Var2 == null ? "null" : Long.valueOf(f4Var.getMsgId()));
        sb.append("], enableTrans = [");
        sb.append(z2);
        sb.append("]");
        Log.m105924i("MicroMsg.ImageGalleryUI", sb.toString());
        Log.m105924i("MicroMsg.ImageGalleryUI", "hasTranslated:" + ((HashMap) this.f284432g.f284728x).containsKey(f4Var2) + "");
        this.f284392R2 = z2;
        if (z2) {
            mo135739Q8(false);
            View view = this.f284382P;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo135779m8();
            View view3 = this.f284377N;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(4);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo135777k8();
            View view5 = this.f284385Q;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f284461q1.mo137429i(5, 1);
            this.f284461q1.mo137427g(5, new ImageGalleryUI$$n0(this, f4Var2));
            View view7 = this.f284389R;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f284393S.setVisibility(0);
        } else {
            mo135739Q8(true);
            if (!this.f284397T0 || C101888l.f300029a.mo141352a(this.f284423d)) {
                View view9 = this.f284382P;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo135779m8();
                View view11 = this.f284377N;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(0);
                View view12 = view11;
                C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view13 = this.f284382P;
                C9556a aVar7 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar7.mo10233c(4);
                C117292a.m165358d(view13, aVar7.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view13, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo135779m8();
                View view14 = this.f284377N;
                C9556a aVar8 = new C9556a();
                aVar8.mo10233c(4);
                View view15 = view14;
                C117292a.m165358d(view15, aVar8.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view15, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mo135734O7();
            if (((HashMap) this.f284432g.f284728x).containsKey(f4Var2)) {
                this.f284354F1 = true;
                this.f284461q1.mo137429i(5, 1);
                this.f284461q1.mo137427g(5, new ImageGalleryUI$$o0(this, f4Var2));
            } else {
                this.f284461q1.mo137429i(5, 5);
                this.f284461q1.mo137427g(5, new ImageGalleryUI$$p0(this, f4Var2));
            }
            this.f284393S.setVisibility(8);
        }
        ((WeImageView) this.f284389R.findViewById(C0966R.C0970id.jed)).setIconColor(MMApplicationContext.getColor(z2 ? C0966R.color.f2946a3 : C0966R.color.f2975b6));
        this.f284389R.setSelected(z2);
    }

    /* renamed from: N8 */
    public void mo135733N8(long j) {
        if (!Util.isNullOrNil(this.f284372L1) && j != 0) {
            if (this.f284375M1) {
                String e = C98429r0.m127814e(j, 3);
                this.f284372L1 = e;
                Log.m105919d("MicroMsg.ImageGalleryUI", "reset enter video op code %s", e);
            } else if (C98429r0.m127833x(j, this.f284372L1, -1) == -1) {
                this.f284372L1 = null;
                Log.m105919d("MicroMsg.ImageGalleryUI", "reset enter video op code %s", null);
            }
        }
    }

    /* renamed from: O7 */
    public final void mo135734O7() {
        if (mo135726I8() || mo135725H8()) {
            View view = this.f284382P;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkQuoteAndFadeStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkQuoteAndFadeStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo135779m8();
            mo135743S8(this.f284377N, 8);
            mo135777k8();
            mo135743S8(this.f284385Q, 8);
            mo135743S8(this.f284389R, 8);
            mo135783p8();
            mo135743S8(this.f284396T, 8);
            mo135784q8();
            mo135743S8(this.f284402V, 8);
            mo135778l8();
            mo135743S8(this.f284405W, 8);
            mo135785r8();
            mo135743S8(this.f284411Y, 8);
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: O8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135735O8() {
        /*
            r14 = this;
            boolean r0 = r14.f284469t
            java.lang.String r1 = "MicroMsg.ImageGalleryUI"
            if (r0 != 0) goto L_0x023a
            com.tencent.mm.ui.chatting.gallery.h r0 = r14.f284432g
            if (r0 != 0) goto L_0x000c
            goto L_0x023a
        L_0x000c:
            r0 = 1
            r14.mo135756Z7(r0)
            r14.mo135730M7()
            boolean r2 = r14.f284397T0
            r3 = 0
            if (r2 == 0) goto L_0x001f
            r14.finishAfterTransition()
            r14.overridePendingTransition(r3, r3)
            return
        L_0x001f:
            boolean r2 = r14.f284466s
            if (r2 == 0) goto L_0x002e
            r14.finish()
            androidx.appcompat.app.AppCompatActivity r0 = r14.getContext()
            nj3.C88990b.m111199h(r0)
            return
        L_0x002e:
            java.lang.String r2 = "runExitAnimation"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.ui.base.MMViewPager r1 = r14.f284450n
            int r1 = r1.getWidth()
            int r1 = r1 / 2
            com.tencent.mm.ui.base.MMViewPager r2 = r14.f284450n
            int r2 = r2.getHeight()
            int r2 = r2 / 2
            com.tencent.mm.ui.chatting.gallery.h r4 = r14.f284432g
            com.tencent.mm.ui.chatting.gallery.h$f r4 = r4.f284715h
            r4.f284748g = r3
            boolean r4 = r14.mo135726I8()
            if (r4 != 0) goto L_0x00e8
            boolean r4 = r14.f284476v1
            if (r4 == 0) goto L_0x007c
            com.tencent.mm.autogen.events.GalleryPhotoInfoEvent r1 = new com.tencent.mm.autogen.events.GalleryPhotoInfoEvent
            r1.<init>()
            com.tencent.mm.autogen.events.GalleryPhotoInfoEvent$a r2 = r1.f264882d
            com.tencent.mm.ui.chatting.gallery.h r4 = r14.f284432g
            com.tencent.mm.ui.base.MMViewPager r5 = r14.f284450n
            int r5 = r5.getCurrentItem()
            com.tencent.mm.storage.f4 r4 = r4.mo135937y(r5)
            long r4 = r4.getMsgId()
            r2.f264886c = r4
            r1.publish()
            com.tencent.mm.autogen.events.GalleryPhotoInfoEvent$b r1 = r1.f264883e
            int r2 = r1.f264890c
            int r4 = r1.f264891d
            int r5 = r1.f264888a
            int r1 = r1.f264889b
            goto L_0x00f0
        L_0x007c:
            com.tencent.mm.ui.chatting.gallery.h r4 = r14.f284432g
            com.tencent.mm.ui.base.MMViewPager r5 = r14.f284450n
            int r5 = r5.getCurrentItem()
            com.tencent.mm.storage.f4 r4 = r4.mo135937y(r5)
            if (r4 == 0) goto L_0x00a6
            com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent r1 = new com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent
            r1.<init>()
            com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent$a r2 = r1.f193516d
            r2.f193518a = r4
            r1.publish()
            com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent$b r1 = r1.f193517e
            int r2 = r1.f193521c
            int r5 = r1.f193522d
            int r6 = r1.f193519a
            int r1 = r1.f193520b
            r13 = r2
            r2 = r1
            r1 = r6
            r6 = r5
            r5 = r13
            goto L_0x00a8
        L_0x00a6:
            r5 = 0
            r6 = 0
        L_0x00a8:
            if (r1 != 0) goto L_0x00bd
            if (r2 != 0) goto L_0x00bd
            com.tencent.mm.ui.base.MMViewPager r1 = r14.f284450n
            int r1 = r1.getWidth()
            int r1 = r1 / 2
            com.tencent.mm.ui.base.MMViewPager r2 = r14.f284450n
            int r2 = r2.getHeight()
            int r2 = r2 / 2
            goto L_0x00e0
        L_0x00bd:
            if (r4 == 0) goto L_0x00e0
            int r7 = r4.mo108769t2()
            r8 = 5
            if (r7 != 0) goto L_0x00d0
            androidx.appcompat.app.AppCompatActivity r7 = r14.getContext()
            int r7 = kg3.C76577a.m92151b(r7, r8)
            r14.f284419b1 = r7
        L_0x00d0:
            int r4 = r4.mo108769t2()
            if (r4 != r0) goto L_0x00e0
            androidx.appcompat.app.AppCompatActivity r4 = r14.getContext()
            int r4 = kg3.C76577a.m92151b(r4, r8)
            r14.f284421c1 = r4
        L_0x00e0:
            r13 = r2
            r2 = r1
            r1 = r13
            r4 = r6
            r13 = r5
            r5 = r2
            r2 = r13
            goto L_0x00f0
        L_0x00e8:
            int r2 = r14.f284430f1
            int r4 = r14.f284433g1
            int r5 = r14.f284427e1
            int r1 = r14.f284424d1
        L_0x00f0:
            com.tencent.mm.ui.base.MMViewPager r6 = r14.f284450n
            int r6 = r6.getWidth()
            r14.f284412Y0 = r6
            com.tencent.mm.ui.base.MMViewPager r6 = r14.f284450n
            int r6 = r6.getHeight()
            r14.f284415Z0 = r6
            com.tencent.mm.ui.chatting.gallery.h r6 = r14.f284432g
            com.tencent.mm.storage.f4 r6 = r6.mo135935w()
            if (r6 == 0) goto L_0x01b5
            com.tencent.mm.ui.chatting.gallery.h r6 = r14.f284432g
            com.tencent.mm.storage.f4 r6 = r6.mo135935w()
            boolean r6 = r6.mo100989b4()
            if (r6 != 0) goto L_0x012c
            com.tencent.mm.ui.chatting.gallery.h r6 = r14.f284432g
            com.tencent.mm.storage.f4 r6 = r6.mo135935w()
            boolean r6 = r6.mo100994f4()
            if (r6 != 0) goto L_0x012c
            com.tencent.mm.ui.chatting.gallery.h r6 = r14.f284432g
            com.tencent.mm.storage.f4 r6 = r6.mo135935w()
            boolean r6 = r6.mo100983V3()
            if (r6 == 0) goto L_0x0137
        L_0x012c:
            int r6 = r14.f284412Y0
            float r6 = (float) r6
            float r7 = (float) r2
            float r6 = r6 / r7
            float r7 = (float) r4
            float r6 = r6 * r7
            int r6 = (int) r6
            r14.f284415Z0 = r6
        L_0x0137:
            com.tencent.mm.ui.chatting.gallery.h r6 = r14.f284432g
            com.tencent.mm.storage.f4 r6 = r6.mo135935w()
            boolean r6 = r6.mo100979R3()
            if (r6 != 0) goto L_0x014f
            com.tencent.mm.ui.chatting.gallery.h r6 = r14.f284432g
            com.tencent.mm.storage.f4 r6 = r6.mo135935w()
            boolean r6 = r6.mo100961A3()
            if (r6 == 0) goto L_0x01b5
        L_0x014f:
            com.tencent.mm.ui.chatting.gallery.h r6 = r14.f284432g
            com.tencent.mm.ui.base.MMViewPager r7 = r14.f284450n
            android.view.View r6 = r14.mo135770g8(r6, r7)
            com.tencent.mm.ui.base.a r6 = (com.tencent.p014mm.p136ui.base.C19706a) r6
            if (r6 == 0) goto L_0x01b5
            int r7 = r14.f284412Y0
            float r7 = (float) r7
            int r8 = r6.getImageWidth()
            float r8 = (float) r8
            float r7 = r7 / r8
            int r8 = r6.getImageHeight()
            float r8 = (float) r8
            float r7 = r7 * r8
            int r7 = (int) r7
            r14.f284415Z0 = r7
            com.tencent.mm.ui.base.MMViewPager r8 = r14.f284450n
            int r8 = r8.getHeight()
            if (r7 <= r8) goto L_0x01ac
            int r7 = r14.f284415Z0
            double r7 = (double) r7
            com.tencent.mm.ui.base.MMViewPager r9 = r14.f284450n
            int r9 = r9.getHeight()
            double r9 = (double) r9
            r11 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r9 = r9 * r11
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x01a4
            boolean r7 = r14.f284476v1
            if (r7 == 0) goto L_0x0198
            int r7 = r14.f284415Z0
            com.tencent.mm.ui.base.MMViewPager r8 = r14.f284450n
            int r8 = r8.getHeight()
            int r7 = r7 - r8
            r14.f284417a1 = r7
            goto L_0x01a4
        L_0x0198:
            com.tencent.mm.ui.base.MMViewPager r7 = r14.f284450n
            int r7 = r7.getHeight()
            int r7 = r7 * r4
            int r4 = r14.f284415Z0
            int r4 = r7 / r4
        L_0x01a4:
            com.tencent.mm.ui.base.MMViewPager r7 = r14.f284450n
            int r7 = r7.getHeight()
            r14.f284415Z0 = r7
        L_0x01ac:
            boolean r7 = r6 instanceof com.tencent.p014mm.p136ui.base.WxImageView
            if (r7 == 0) goto L_0x01b5
            com.tencent.mm.ui.base.WxImageView r6 = (com.tencent.p014mm.p136ui.base.WxImageView) r6
            r6.setDrawFullSampleSizeBitmap(r0)
        L_0x01b5:
            com.tencent.mm.ui.tools.m0 r0 = r14.f284442j1
            int r6 = r14.f284419b1
            int r7 = r14.f284421c1
            r0.f122239s = r6
            r0.f122240t = r7
            r0.f122241u = r3
            r0.f122242v = r3
            int r3 = r14.f284417a1
            r0.f122238r = r3
            int r3 = r14.f284412Y0
            int r6 = r14.f284415Z0
            r0.f122226f = r3
            r0.f122227g = r6
            r0.mo70410e(r5, r1, r2, r4)
            com.tencent.mm.ui.base.MMViewPager r0 = r14.f284450n
            com.tencent.mm.ui.chatting.gallery.h r1 = r14.f284432g
            android.view.View r1 = r14.mo135770g8(r1, r0)
            if (r1 == 0) goto L_0x0225
            float r0 = r14.f284447l2
            double r2 = (double) r0
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0224
            com.tencent.mm.ui.tools.m0 r2 = r14.f284442j1
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r3 / r0
            r2.f122234n = r0
            int r0 = r14.f284449m2
            if (r0 != 0) goto L_0x01f5
            int r0 = r14.f284452n2
            if (r0 == 0) goto L_0x0224
        L_0x01f5:
            com.tencent.mm.ui.base.MMViewPager r0 = r14.f284450n
            int r0 = r0.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r2 = r14.f284447l2
            float r3 = r3 - r2
            float r0 = r0 * r3
            int r0 = (int) r0
            int r2 = r14.f284449m2
            int r0 = r0 + r2
            com.tencent.mm.ui.base.MMViewPager r2 = r14.f284450n
            int r2 = r2.getHeight()
            int r2 = r2 / 2
            int r3 = r14.f284452n2
            int r2 = r2 + r3
            float r2 = (float) r2
            int r3 = r14.f284415Z0
            int r3 = r3 / 2
            float r3 = (float) r3
            float r4 = r14.f284447l2
            float r3 = r3 * r4
            float r2 = r2 - r3
            int r2 = (int) r2
            com.tencent.mm.ui.tools.m0 r3 = r14.f284442j1
            r3.f122235o = r0
            r3.f122236p = r2
        L_0x0224:
            r0 = r1
        L_0x0225:
            boolean r1 = r14.f284370K2
            if (r1 == 0) goto L_0x022c
            r14.mo135720C8()
        L_0x022c:
            com.tencent.mm.ui.tools.m0 r1 = r14.f284442j1
            android.widget.ImageView r2 = r14.f284406W0
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$u r3 = new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$u
            r3.<init>(r14)
            r4 = 0
            r1.mo70409d(r0, r2, r3, r4)
            return
        L_0x023a:
            java.lang.String r0 = "isRunningExitAnimation"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI.mo135735O8():void");
    }

    /* renamed from: P7 */
    public final void mo135736P7(int i) {
        String e8 = mo135766e8();
        if (!Util.isNullOrNil(e8)) {
            C21506a.m24351Y5(i, this.f284429f, e8);
        }
    }

    /* renamed from: P8 */
    public void mo135737P8(boolean z) {
        RelativeLayout relativeLayout = this.f284456p;
        if (relativeLayout != null) {
            if (!z || relativeLayout.getVisibility() != 0) {
                int i = 8;
                if (z || this.f284456p.getVisibility() != 8) {
                    RelativeLayout relativeLayout2 = this.f284456p;
                    if (z) {
                        i = 0;
                    }
                    relativeLayout2.setVisibility(i);
                    this.f284456p.startAnimation(AnimationUtils.loadAnimation(getContext(), z ? C0966R.C0968anim.f2328p : C0966R.C0968anim.f2329q));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c9  */
    /* renamed from: Q7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135738Q7(int r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r16.mo135726I8()
            if (r2 != 0) goto L_0x0291
            boolean r2 = r16.mo135725H8()
            if (r2 == 0) goto L_0x0012
            goto L_0x0291
        L_0x0012:
            com.tencent.mm.ui.chatting.gallery.h r2 = r0.f284432g
            if (r2 == 0) goto L_0x0033
            int r3 = r0.f284488y2
            com.tencent.mm.storage.f4 r2 = r2.mo135937y(r3)
            if (r2 == 0) goto L_0x0033
            boolean r2 = r16.isFinishing()
            if (r2 != 0) goto L_0x0033
            com.tencent.mm.ui.chatting.gallery.h r2 = r0.f284432g
            int r3 = r0.f284488y2
            com.tencent.mm.storage.f4 r2 = r2.mo135937y(r3)
            boolean r2 = eb0.C75569c4.m90671d(r2)
            if (r2 == 0) goto L_0x0033
            return
        L_0x0033:
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            r5 = 0
            r3[r5] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r18)
            r6 = 1
            r3[r6] = r4
            java.lang.String r4 = "MicroMsg.ImageGalleryUI"
            java.lang.String r7 = "alvinluo checkShowQuickButton fromType: %d, needHide: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r7, r3)
            boolean r3 = r0.mo135757Z8(r6, r1)
            r7 = 6
            r8 = 3
            r9 = 4
            r10 = 5
            r11 = 0
            if (r3 == 0) goto L_0x005b
            android.view.View r1 = r0.f284389R
            r7 = 5
            goto L_0x01cb
        L_0x005b:
            boolean r3 = r0.f284454o1
            r12 = 8
            if (r3 != 0) goto L_0x0062
            goto L_0x00b9
        L_0x0062:
            boolean r3 = r16.mo135726I8()
            gk3.g r13 = r0.f284461q1
            boolean r13 = r13.mo137421a(r2)
            if (r13 == 0) goto L_0x0078
            if (r3 != 0) goto L_0x0078
            boolean r14 = r16.mo135725H8()
            if (r14 != 0) goto L_0x0078
            r14 = 1
            goto L_0x0079
        L_0x0078:
            r14 = 0
        L_0x0079:
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r15[r5] = r13
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r15[r6] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r14)
            r15[r2] = r3
            java.lang.String r3 = "showScanCodeButton showQRCodeResult: %b, isFromQuoteMsg: %b, show: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r3, r15)
            if (r14 == 0) goto L_0x00af
            gk3.e r3 = r0.f284404V1
            r3.mo137418d(r2)
            r16.mo135783p8()
            android.view.View r3 = r0.f284396T
            int r3 = r3.getVisibility()
            if (r3 == 0) goto L_0x00ad
            r16.mo135783p8()
            android.view.View r3 = r0.f284396T
            r0.mo135743S8(r3, r5)
        L_0x00ad:
            r3 = 1
            goto L_0x00ba
        L_0x00af:
            if (r1 == 0) goto L_0x00b9
            r16.mo135783p8()
            android.view.View r3 = r0.f284396T
            r0.mo135743S8(r3, r12)
        L_0x00b9:
            r3 = 0
        L_0x00ba:
            if (r3 == 0) goto L_0x00c4
            r16.mo135783p8()
            android.view.View r1 = r0.f284396T
            r7 = 2
            goto L_0x01cb
        L_0x00c4:
            boolean r3 = r16.mo135726I8()
            if (r3 != 0) goto L_0x00da
            boolean r3 = r16.mo135725H8()
            if (r3 != 0) goto L_0x00da
            gk3.g r3 = r0.f284461q1
            boolean r3 = r3.mo137426f(r7)
            if (r3 == 0) goto L_0x00da
            r3 = 1
            goto L_0x00db
        L_0x00da:
            r3 = 0
        L_0x00db:
            java.lang.Object[] r13 = new java.lang.Object[r6]
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            r13[r5] = r14
            java.lang.String r14 = "checkShowReadSourceTextButton isValid: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r14, r13)
            if (r3 == 0) goto L_0x00fc
            gk3.g r3 = r0.f284461q1
            boolean r3 = r3.mo137421a(r7)
            if (r3 == 0) goto L_0x0106
            r16.mo135778l8()
            android.view.View r3 = r0.f284405W
            r0.mo135743S8(r3, r5)
            r3 = 1
            goto L_0x0107
        L_0x00fc:
            if (r1 == 0) goto L_0x0106
            r16.mo135778l8()
            android.view.View r3 = r0.f284405W
            r0.mo135743S8(r3, r12)
        L_0x0106:
            r3 = 0
        L_0x0107:
            if (r3 == 0) goto L_0x0110
            r16.mo135778l8()
            android.view.View r1 = r0.f284405W
            goto L_0x01cb
        L_0x0110:
            boolean r3 = r0.mo135759a9(r1)
            if (r3 == 0) goto L_0x011e
            r16.mo135785r8()
            com.tencent.mm.ui.chatting.gallery.view.SearchImageBubbleView r1 = r0.f284411Y
            r7 = 3
            goto L_0x01cb
        L_0x011e:
            boolean r3 = r0.mo135757Z8(r5, r1)
            if (r3 == 0) goto L_0x0129
            android.view.View r1 = r0.f284389R
            r7 = 1
            goto L_0x01cb
        L_0x0129:
            boolean r3 = r16.mo135723F8()
            if (r3 == 0) goto L_0x01bf
            boolean r3 = gk3.C98135d.f287727c
            if (r3 != 0) goto L_0x0135
            goto L_0x01bf
        L_0x0135:
            gk3.g r3 = r0.f284461q1
            r3.mo137429i(r9, r2)
            gk3.g r3 = r0.f284461q1
            boolean r3 = r3.mo137426f(r9)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)
            r7[r5] = r13
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
            r7[r6] = r13
            java.lang.String r13 = "alvinluo checkShowSearchImageButton fromType: %s, isSearchButtonValid: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r13, r7)
            if (r3 == 0) goto L_0x01bf
            gk3.g r3 = r0.f284461q1
            r3.mo137429i(r9, r6)
            gk3.g r3 = r0.f284461q1
            boolean r3 = r3.mo137421a(r9)
            if (r3 == 0) goto L_0x01bf
            gk3.g r3 = r0.f284461q1
            r3.mo137422b(r9)
            boolean r3 = r16.mo135723F8()
            if (r3 == 0) goto L_0x01bf
            boolean r3 = gk3.C98135d.f287727c
            if (r3 != 0) goto L_0x0172
            goto L_0x01bf
        L_0x0172:
            java.lang.Class<c00.n> r3 = c00.C0405n.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            c00.n r3 = (c00.C0405n) r3
            boolean r3 = r3.mo279e()
            boolean r7 = r16.mo135726I8()
            if (r7 != 0) goto L_0x0196
            boolean r7 = r16.mo135725H8()
            if (r7 != 0) goto L_0x0196
            gk3.g r7 = r0.f284461q1
            boolean r7 = r7.mo137421a(r9)
            if (r7 == 0) goto L_0x0196
            if (r3 != 0) goto L_0x0196
            r3 = 1
            goto L_0x0197
        L_0x0196:
            r3 = 0
        L_0x0197:
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
            r7[r5] = r13
            java.lang.String r13 = "alvinluo showSearchImageButton showButton: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r13, r7)
            if (r3 == 0) goto L_0x01b5
            r16.mo135784q8()
            android.view.View r1 = r0.f284402V
            r0.mo135743S8(r1, r5)
            gk3.e r1 = r0.f284404V1
            r1.mo137417c(r6, r8)
            r1 = 1
            goto L_0x01c0
        L_0x01b5:
            if (r1 == 0) goto L_0x01bf
            r16.mo135784q8()
            android.view.View r1 = r0.f284402V
            r0.mo135743S8(r1, r12)
        L_0x01bf:
            r1 = 0
        L_0x01c0:
            if (r1 == 0) goto L_0x01c9
            r16.mo135784q8()
            android.view.View r1 = r0.f284402V
            r7 = 4
            goto L_0x01cb
        L_0x01c9:
            r1 = r11
            r7 = 0
        L_0x01cb:
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r3[r5] = r10
            int r10 = r0.f284347D
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r3[r6] = r10
            r3[r2] = r1
            java.lang.String r2 = "null"
            if (r1 == 0) goto L_0x01eb
            float r10 = r1.getAlpha()
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            goto L_0x01ec
        L_0x01eb:
            r10 = r2
        L_0x01ec:
            r3[r8] = r10
            if (r1 == 0) goto L_0x01f8
            int r2 = r1.getVisibility()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x01f8:
            r3[r9] = r2
            java.lang.String r2 = "alvinluo checkShowQuickButton showType: %d, currentQuickButtonType: %d, targetView: %s, targetView.alpha: %s, targetView.visibility: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r3)
            if (r7 == 0) goto L_0x0257
            int r2 = r0.f284347D
            if (r7 == r2) goto L_0x023e
            if (r2 == 0) goto L_0x0214
            if (r7 != r8) goto L_0x0212
            if (r1 == 0) goto L_0x0212
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x0212
            goto L_0x0214
        L_0x0212:
            r3 = 0
            goto L_0x0215
        L_0x0214:
            r3 = 1
        L_0x0215:
            r0.f284464r1 = r5
            r0.mo135721D8(r7, r5)
            r0.mo135749V8(r1, r3)
            r16.mo135785r8()
            com.tencent.mm.ui.chatting.gallery.view.SearchImageBubbleView r3 = r0.f284411Y
            int r3 = r3.getVisibility()
            int r4 = r0.f284347D
            if (r4 != r8) goto L_0x023a
            r16.mo135785r8()
            com.tencent.mm.ui.chatting.gallery.view.SearchImageBubbleView r4 = r0.f284411Y
            r0.mo135743S8(r4, r3)
            r16.mo135785r8()
            com.tencent.mm.ui.chatting.gallery.view.SearchImageBubbleView r3 = r0.f284411Y
            r0.mo135718A8(r3, r6)
        L_0x023a:
            r0.f284347D = r7
            r0.f284350E = r1
        L_0x023e:
            if (r7 != r8) goto L_0x0291
            r16.mo135784q8()
            android.view.View r1 = r0.f284402V
            if (r2 != 0) goto L_0x0253
            r16.mo135780n8()
            android.view.View r2 = r0.f284402V
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0253
            r5 = 1
        L_0x0253:
            r0.mo135749V8(r1, r5)
            goto L_0x0291
        L_0x0257:
            gk3.g r1 = r0.f284461q1
            int r2 = r1.f287756e
            boolean r1 = r1.mo137426f(r2)
            if (r1 == 0) goto L_0x0291
            java.lang.String r1 = "alvinluo checkShowQuickButton isAllValid and hideQuickButton"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            android.view.View r1 = r0.f284350E
            int r2 = r0.f284347D
            if (r2 == 0) goto L_0x0270
            if (r1 == 0) goto L_0x0270
            r2 = 1
            goto L_0x0271
        L_0x0270:
            r2 = 0
        L_0x0271:
            r0.mo135718A8(r1, r2)
            int r1 = r0.f284347D
            if (r1 != r8) goto L_0x028d
            r16.mo135784q8()
            android.view.View r1 = r0.f284402V
            r16.mo135780n8()
            android.view.View r2 = r0.f284402V
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0289
            goto L_0x028a
        L_0x0289:
            r6 = 0
        L_0x028a:
            r0.mo135718A8(r1, r6)
        L_0x028d:
            r0.f284347D = r5
            r0.f284350E = r11
        L_0x0291:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI.mo135738Q7(int, boolean):void");
    }

    /* renamed from: Q8 */
    public final void mo135739Q8(boolean z) {
        int i;
        if (this.f284441j != C97056h.C97067g.image || mo135725H8() || mo135724G8()) {
            mo135743S8(this.f284414Z, 4);
            return;
        }
        C97056h hVar = this.f284432g;
        C72963f4 w = hVar != null ? hVar.mo135935w() : null;
        if (w == null || C75569c4.m90663I(w)) {
            mo135743S8(this.f284414Z, 4);
            return;
        }
        C92836k x = this.f284432g.mo135936x(w, false);
        if (!z || !mo135793y8(this.f284450n.getCurrentItem(), w, x) || w.mo100972K3() || !x.mo127146q()) {
            mo135743S8(this.f284414Z, 4);
            return;
        }
        mo135780n8();
        this.f284457p0.setVisibility(0);
        mo135780n8();
        this.f284482x0.setVisibility(8);
        mo135780n8();
        View view = this.f284486y0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setImageHdImgBtnVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setImageHdImgBtnVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        String str = this.f284376M2.get(Long.valueOf(x.f267374a));
        if (str == null) {
            Map<String, String> parseXml = XmlParser.parseXml(x.f267393t, "msg", (String) null);
            if (parseXml == null) {
                Log.m105921e("MicroMsg.ImageGalleryUI", "parse cdnInfo failed. [%s]", x.f267393t);
                i = -1;
            } else {
                int i2 = Util.getInt(parseXml.get(".msg.img.$hdlength"), 0);
                i = i2 == 0 ? Util.getInt(parseXml.get(".msg.img.$tphdlength"), 0) : i2;
            }
            long j = (long) i;
            if (j < 0) {
                str = "";
            } else {
                BigDecimal bigDecimal = new BigDecimal(j);
                float floatValue = bigDecimal.divide(new BigDecimal(1048576), 2, 0).floatValue();
                if (floatValue > 1.0f) {
                    str = ((int) floatValue) + "M";
                } else {
                    float floatValue2 = bigDecimal.divide(new BigDecimal(1024), 2, 0).floatValue();
                    str = ((int) floatValue2) + "K";
                }
            }
            this.f284376M2.put(Long.valueOf(x.f267374a), str);
        }
        mo135780n8();
        this.f284457p0.setText(getString(C0966R.string.bwg, new Object[]{str}));
        mo135743S8(this.f284414Z, 0);
    }

    /* renamed from: R7 */
    public final void mo135740R7(int i) {
        String e8 = mo135766e8();
        int intExtra = getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
        C1300x.m1390a(this, C92721n.m116873a(e8, 260, intExtra, (int) (System.currentTimeMillis() / 1000)), new ImageGalleryUI$$l0(this, intExtra));
        C21506a.m24351Y5(i, this.f284429f, e8);
    }

    /* renamed from: R8 */
    public void mo135741R8(boolean z) {
        try {
            mo135781o8();
            this.f284400U0.setIsPlay(!z);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.ImageGalleryUI", "set video state iv error : " + e.toString());
        }
    }

    /* renamed from: S7 */
    public final void mo135742S7(boolean z) {
        String str;
        Map<String, String> parseXml;
        if (this.f284458p1 != null) {
            C98162q qVar = this.f284451n1;
            qVar.f287788d = z;
            qVar.f287791g = getIntent().getBundleExtra("_stat_obj");
            Bundle bundle = this.f284451n1.f287791g;
            if (bundle == null) {
                Log.m105924i("MicroMsg.ImageGalleryUI", "addStatInfo4AppBrand, statObj is null");
                bundle = new Bundle();
                this.f284451n1.f287791g = bundle;
            }
            if (1 == this.f284345C1) {
                Log.m105924i("MicroMsg.ImageGalleryUI", "addStatInfo4AppBrand, from app brand");
                bundle.putInt("LaunchCodeScene_ScanScene", 5);
            } else if (mo135723F8()) {
                String d8 = mo135764d8();
                Log.m105924i("MicroMsg.ImageGalleryUI", "addStatInfo4AppBrand, from chat, username: " + d8);
                bundle.putInt("LaunchCodeScene_ScanScene", 1);
                bundle.putString("LaunchCodeScene_Username", d8);
            } else {
                Log.m105924i("MicroMsg.ImageGalleryUI", "addStatInfo4AppBrand, others");
            }
            int i = 2;
            if (!Util.isNullOrNil(this.f284426e) || C72996z1.m85820U5(this.f284423d)) {
                bundle.putInt("pay_qrcode_session_type", 2);
                bundle.putString("pay_qrcode_session_name", Util.isNullOrNil(this.f284426e) ? this.f284423d : this.f284426e);
            } else {
                bundle.putInt("pay_qrcode_session_type", 1);
                bundle.putString("pay_qrcode_session_name", this.f284423d);
            }
            bundle.putString("pay_qrcode_sender_username", this.f284423d);
            bundle.putString("stat_chat_talker_username", mo135764d8());
            C72963f4 y = this.f284432g.mo135937y(this.f284488y2);
            bundle.putString("stat_send_msg_user", y != null ? mo135789u8(y, C72996z1.m85820U5(y.mo108768t())) : null);
            C98162q qVar2 = this.f284451n1;
            Log.m105925i("MicroMsg.ImageGalleryUI", "talker: %s, chatroom: %s", this.f284423d, this.f284426e);
            if (!Util.isNullOrNil(this.f284426e) && C72996z1.m85820U5(this.f284426e)) {
                Log.m105919d("MicroMsg.ImageGalleryUI", "is chatroom: %s", this.f284426e);
                str = this.f284426e;
            } else if (!Util.isNullOrNil(this.f284423d)) {
                if (C45628s0.m50738C(this.f284423d)) {
                    Log.m105919d("MicroMsg.ImageGalleryUI", "is biz: %s", this.f284423d);
                    Bundle bundle2 = qVar2.f287791g;
                    if (bundle2 != null) {
                        bundle2.putString("img_gallery_talker", this.f284423d);
                    }
                    i = 4;
                } else if (C72996z1.m85820U5(this.f284423d)) {
                    Log.m105919d("MicroMsg.ImageGalleryUI", "taler is chatroom: %s", this.f284423d);
                } else {
                    Log.m105919d("MicroMsg.ImageGalleryUI", "is single chat: %s", this.f284423d);
                    i = 1;
                }
                str = this.f284423d;
            } else {
                Log.m105920e("MicroMsg.ImageGalleryUI", "unknow source");
                i = -1;
                str = "";
            }
            qVar2.f287790f = i;
            C87412m.m108594g(str, "<set-?>");
            qVar2.f287789e = str;
            C98162q qVar3 = this.f284451n1;
            C97056h hVar = this.f284432g;
            if (!(hVar == null || hVar.mo135935w() == null)) {
                C97056h hVar2 = this.f284432g;
                C92836k x = hVar2.mo135936x(hVar2.mo135935w(), true);
                if (!(x == null || Util.isNullOrNil(x.f267393t) || (parseXml = XmlParser.parseXml(x.f267393t, "msg", (String) null)) == null)) {
                    qVar3.f287792h = parseXml.get(".msg.img.$aeskey");
                    qVar3.f287793i = parseXml.get(".msg.img.$cdnmidimgurl");
                }
            }
            ImageScanCodeManager imageScanCodeManager = this.f284458p1;
            View g8 = mo135770g8(this.f284432g, this.f284450n);
            C98162q qVar4 = this.f284451n1;
            ImageGalleryUI$$c0 imageGalleryUI$$c0 = new ImageGalleryUI$$c0(this, z);
            imageScanCodeManager.getClass();
            C87412m.m108594g(qVar4, "codeResult");
            if (imageScanCodeManager.f284970b) {
                Log.m105924i("MicroMsg.ImageScanCodeManager", "handleCode  qBarDataList:" + qVar4.f287785a.size());
                C94468m.m119494b(imageScanCodeManager.f284969a, g8, qVar4.f287785a, 0, imageGalleryUI$$c0);
            }
        }
    }

    /* renamed from: S8 */
    public final void mo135743S8(View view, int i) {
        if (view != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisiblity() called with: view = [");
            sb.append(IdUtil.INSTANCE.getName(view.getId()));
            sb.append("], visibility = [");
            sb.append(i == 0);
            sb.append("]");
            Log.m105918d("MicroMsg.ImageGalleryUI", sb.toString());
            mo135784q8();
            if (view != this.f284402V || !((C0405n) C86312j.m106911c(C0405n.class)).mo279e()) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setVisiblity", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setVisiblity", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setVisiblity", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setVisiblity", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: T7 */
    public final void mo135744T7(long j, int i) {
        Log.m105925i("MicroMsg.ImageGalleryUI", "dealWithSearchImage sessionId: %s, fromSource: %s", Long.valueOf(j), Integer.valueOf(i));
        C72963f4 w = this.f284432g.mo135935w();
        C101983r rVar = new C101983r();
        rVar.f300282a = j;
        rVar.f300283b = this;
        rVar.f300284c = w;
        rVar.f300285d = i;
        ((C101980n) C86312j.m106911c(C101980n.class)).mo134683D6(rVar);
    }

    /* renamed from: T8 */
    public final boolean mo135745T8() {
        return !this.f284490z1 && this.f284345C1 != 1 && !this.f284339A1 && !this.f284444k1 && !this.f284446l1 && !C73708v.C73710b.f216437a.f216435b;
    }

    /* renamed from: U7 */
    public final void mo135746U7(String str, boolean z) {
        boolean z2 = false;
        Log.m105925i("MicroMsg.ImageGalleryUI", "dealWithWordDetectImage imagePath: %s, fromLongClick: %s", str, Boolean.valueOf(z));
        if (Util.isNullOrNil(str) || !C86013q1.m106450k(str)) {
            Log.m105920e("MicroMsg.ImageGalleryUI", "dealWithWordDetectImage imagePath not valid or not exist");
        } else if (!C30391y.m39060e()) {
            Log.m105920e("MicroMsg.ImageGalleryUI", "dealWithWordDetectImage wordDetect not enable");
        } else if (!C30391y.m39059d()) {
            mo135750W7(str);
        } else {
            Integer e = this.f284461q1.mo137425e(1);
            if (!(e == null || e.intValue() == 6 || e.intValue() == 4)) {
                z2 = true;
            }
            if (!z2) {
                this.f284461q1.mo137429i(1, 6);
                if (z) {
                    mo135750W7(str);
                }
            }
        }
    }

    /* renamed from: U8 */
    public final boolean mo135747U8(ArrayList<ImageQBarDataBean> arrayList) {
        C98162q qVar;
        String[] split;
        if (this.f284345C1 == 1 || (qVar = this.f284451n1) == null || Util.isNullOrNil((List) qVar.f287785a) || arrayList.size() <= 0) {
            return false;
        }
        if (arrayList.size() > 1) {
            return true;
        }
        String str = arrayList.get(0).f273113d;
        if (this.f284490z1 && (split = ((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.APPBRAND_BLOCK_QRCODE_PREFIX_STRING_SYNC, "")).split("\\|")) != null && split.length > 0) {
            int length = split.length;
            int i = 0;
            while (i < length) {
                String str2 = split[i];
                if (Util.isNullOrNil(str2) || !str.startsWith(str2)) {
                    i++;
                } else {
                    Log.m105925i("MicroMsg.ImageGalleryUI", "curDealQBarStr:%s, blockQrcodeStr:%s", str, str2);
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: V7 */
    public final void mo135748V7(View view, String str, Bitmap bitmap, int i, C98152j jVar) {
        ImageScanCodeManager.C97127b bVar;
        RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent;
        RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent;
        C97056h hVar = this.f284432g;
        if (hVar == null || !C75569c4.m90671d(hVar.mo135937y(this.f284488y2))) {
            Log.m105918d("MicroMsg.ImageGalleryUI", "doScanImageQRCode  recognizeType:" + i);
            if (this.f284458p1 != null) {
                this.f284398T1 = Long.valueOf(System.currentTimeMillis());
                ImageGalleryUI$$x0 imageGalleryUI$$x0 = this.f284465r2;
                imageGalleryUI$$x0.getClass();
                Log.m105924i("MicroMsg.ImageGalleryUI", "onScanStart#ScanState, realScanImgPath: " + str);
                if (!Util.isEqual(C86013q1.m106448i(imageGalleryUI$$x0.f284556b.mo135788u5(), false), str)) {
                    Log.m105924i("MicroMsg.ImageGalleryUI", "onScanStart#ScanState, not match");
                } else {
                    imageGalleryUI$$x0.f284555a = 1;
                }
                ImageScanCodeManager imageScanCodeManager = this.f284458p1;
                if (imageScanCodeManager.f284970b) {
                    if (!(str == null || str.length() == 0)) {
                        ImageScanCodeManager.C97126a aVar = new ImageScanCodeManager.C97126a();
                        aVar.f284979a = System.currentTimeMillis();
                        C87412m.m108594g(str, "<set-?>");
                        aVar.f284980b = str;
                        aVar.f284981c = bitmap;
                        aVar.f284982d = i;
                        Log.m105925i("MicroMsg.ImageScanCodeManager", "alvinluo scanCode session: %d, imagePath: %s, bitmap: %s, getCodePosition: %b", Long.valueOf(aVar.f284979a), str, bitmap, Boolean.TRUE);
                        if (view instanceof C19706a) {
                            C19706a aVar2 = (C19706a) view;
                            Log.m105919d("MicroMsg.ImageScanCodeManager", "alvinluo scanCode imageSize: %d, %d, screen: %d, %d, current: %s", Integer.valueOf(aVar2.getImageWidth()), Integer.valueOf(aVar2.getImageHeight()), Integer.valueOf(C76577a.m92145A(imageScanCodeManager.f284969a)), Integer.valueOf(C76577a.m92159j(imageScanCodeManager.f284969a)), view);
                        }
                        aVar.f284981c = null;
                        if ((aVar.f284982d == 1) && (bVar = imageScanCodeManager.f284973e.get(aVar.f284980b)) != null) {
                            Log.m105925i("MicroMsg.ImageScanCodeManager", "alvinluo scanCode get result from cache %s", aVar.f284980b);
                            boolean z = bVar.f284985c;
                            if (!z || (recogQBarOfImageFileResultEvent = bVar.f284983a) == null) {
                                if (z || (recogQBarOfImageFileFailedEvent = bVar.f284984b) == null) {
                                    imageScanCodeManager.f284973e.remove(aVar.f284980b);
                                } else if (jVar != null) {
                                    jVar.mo135799b(recogQBarOfImageFileFailedEvent);
                                    return;
                                } else {
                                    return;
                                }
                            } else if (jVar != null) {
                                jVar.mo135798a(recogQBarOfImageFileResultEvent);
                                return;
                            } else {
                                return;
                            }
                        }
                        Log.m105924i("MicroMsg.ImageScanCodeManager", "doScanCode from decoder  recognizeType:" + aVar.f284982d + "   path:" + aVar.f284980b);
                        if (!Util.isNullOrNil(aVar.f284980b)) {
                            String str2 = aVar.f284980b;
                            if (!imageScanCodeManager.f284972d.containsKey(str2)) {
                                imageScanCodeManager.f284972d.put(str2, new ArrayList());
                            }
                            ArrayList<C98152j> arrayList = imageScanCodeManager.f284972d.get(str2);
                            C87412m.m108591d(arrayList);
                            if (!arrayList.contains(jVar)) {
                                ArrayList<C98152j> arrayList2 = imageScanCodeManager.f284972d.get(str2);
                                C87412m.m108591d(arrayList2);
                                arrayList2.add(jVar);
                            }
                            if (imageScanCodeManager.f284971c.containsKey(str2)) {
                                Log.m105929w("MicroMsg.ImageScanCodeManager", "alvinluo scanCode image %s is already decoding and ignore", aVar.f284980b);
                                return;
                            }
                            imageScanCodeManager.f284971c.put(str2, aVar);
                            RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
                            RecogQBarOfImageFileEvent.C40158a aVar3 = recogQBarOfImageFileEvent.f107731d;
                            aVar3.f107732a = aVar.f284979a;
                            aVar3.f107733b = aVar.f284980b;
                            aVar3.f107734c = aVar.f284981c;
                            aVar3.f107736e = true;
                            aVar3.f107737f = aVar.f284982d;
                            recogQBarOfImageFileEvent.publish();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: V8 */
    public final void mo135749V8(View view, boolean z) {
        if (view != null) {
            Log.m105919d("MicroMsg.ImageGalleryUI", "alvinluo showButton view: %s, withAnimation: %b", view, Boolean.valueOf(z));
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showButton", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showButton", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (z) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(Float.valueOf(0.0f));
                View view3 = view;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showButton", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showButton", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                C75919p pVar = C75919p.f222593a;
                C75919p.f222593a.mo106176a(view, true);
                return;
            }
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showButton", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showButton", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: W7 */
    public final void mo135750W7(String str) {
        if (this.f284348D1 == null) {
            this.f284348D1 = ((C99716u) C86312j.m106911c(C99716u.class)).zj0(this, false);
        }
        if (!Util.isNullOrNil(str)) {
            Point point = null;
            if (!(str == null || str.length() == 0) && C86013q1.m106450k(str)) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                MMBitmapFactory.m98735d(str, options);
                point = new Point(options.outWidth, options.outHeight);
            }
            if (point == null || !((C99711g0) C86312j.m106911c(C99711g0.class)).cq0(point.x, point.y)) {
                ((ImageWordScanDetailEngine) this.f284348D1).mo130013b(str, this);
                return;
            }
            Log.m105925i("MicroMsg.ImageGalleryUI", "doScanWordDetectImage image overRatioLimit: %s", point);
            boolean Ak0 = ((C101643c) C86312j.m106911c(C101643c.class)).Ak0();
            this.f284357G1 = Ak0;
            this.f284360H1 = 1;
            mo135776j9(0, false, Ak0);
            return;
        }
        this.f284461q1.mo137429i(1, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* renamed from: W8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo135751W8() {
        /*
            r17 = this;
            r7 = r17
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r2 = r7.f284488y2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            com.tencent.mm.ui.chatting.gallery.h r2 = r7.f284432g
            r4 = 1
            if (r2 != 0) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1[r4] = r2
            java.lang.String r8 = "MicroMsg.ImageGalleryUI"
            java.lang.String r2 = "showMenu mSelectedPos %d, %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r2, r1)
            com.tencent.mm.ui.chatting.gallery.h r1 = r7.f284432g
            if (r1 != 0) goto L_0x0029
            return
        L_0x0029:
            int r2 = r7.f284488y2
            if (r2 >= 0) goto L_0x002e
            return
        L_0x002e:
            com.tencent.mm.storage.f4 r1 = r1.mo135937y(r2)
            if (r1 != 0) goto L_0x003b
            com.tencent.mm.ui.chatting.gallery.h r1 = r7.f284432g
            com.tencent.mm.storage.f4 r1 = r1.mo135935w()
            goto L_0x0043
        L_0x003b:
            com.tencent.mm.ui.chatting.gallery.h r1 = r7.f284432g
            int r2 = r7.f284488y2
            com.tencent.mm.storage.f4 r1 = r1.mo135937y(r2)
        L_0x0043:
            r6 = r1
            if (r6 != 0) goto L_0x004d
            java.lang.String r0 = "showMenu msg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            return
        L_0x004d:
            boolean r1 = eb0.C75569c4.m90663I(r6)
            if (r1 == 0) goto L_0x0067
            qo3.n r0 = new qo3.n
            r0.<init>((android.content.Context) r7, (int) r4, (boolean) r3)
            com.tencent.mm.ui.chatting.gallery.c0 r1 = new com.tencent.mm.ui.chatting.gallery.c0
            r1.<init>(r7)
            r0.f225771i = r1
            nj3.p0 r1 = r7.f284480w2
            r0.f225782p = r1
            r0.mo107573q()
            return
        L_0x0067:
            com.tencent.mm.ui.chatting.gallery.h r1 = r7.f284432g
            com.tencent.mm.ui.chatting.gallery.o r1 = r1.f284719o
            int r1 = r1.mo136004z(r6)
            r2 = 5
            if (r1 == r2) goto L_0x033b
            r5 = 6
            if (r1 != r5) goto L_0x0077
            goto L_0x033b
        L_0x0077:
            com.tencent.mm.ui.chatting.gallery.h r1 = r7.f284432g
            com.tencent.mm.modelimage.k r2 = r1.mo135936x(r6, r3)
            r9 = 3
            if (r2 == 0) goto L_0x00a5
            java.lang.Class<gt.k> r10 = p158gt.C98201k.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            gt.k r10 = (p158gt.C98201k) r10
            gt.j r10 = r10.Jp0()
            long r12 = r2.f267374a
            long r14 = r6.getMsgId()
            r16 = 0
            r11 = r10
            com.tencent.mm.modelimage.e r11 = (com.tencent.p014mm.modelimage.C92822e) r11
            boolean r10 = r11.mo127105g(r12, r14, r16)
            if (r10 != 0) goto L_0x00a3
            boolean r1 = r1.mo135916G(r6, r2)
            if (r1 == 0) goto L_0x00dd
        L_0x00a3:
            r10 = 1
            goto L_0x00de
        L_0x00a5:
            hd0.n0 r1 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124927o(r6)
            if (r1 == 0) goto L_0x00dd
            int r2 = r1.f288562i
            int r1 = hd0.C98429r0.m127817h(r1)
            r10 = 112(0x70, float:1.57E-43)
            if (r2 == r10) goto L_0x00b9
            r10 = 122(0x7a, float:1.71E-43)
            if (r2 != r10) goto L_0x00bf
        L_0x00b9:
            r10 = 100
            if (r1 >= r10) goto L_0x00bf
            r10 = 1
            goto L_0x00c0
        L_0x00bf:
            r10 = 0
        L_0x00c0:
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r10)
            r11[r3] = r12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11[r4] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11[r0] = r1
            java.lang.String r1 = "MicroMsg.ImageGalleryAdapter"
            java.lang.String r2 = "it is video downloading %b, status %d, download progress %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r11)
            goto L_0x00de
        L_0x00dd:
            r10 = 0
        L_0x00de:
            if (r10 == 0) goto L_0x00e7
            java.lang.String r0 = "jacks downloading, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            return
        L_0x00e7:
            boolean r1 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124955K(r6)
            if (r1 == 0) goto L_0x012d
            hd0.n0 r1 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124927o(r6)
            if (r1 != 0) goto L_0x0100
            boolean r1 = r6.mo100983V3()
            if (r1 != 0) goto L_0x0100
            java.lang.String r0 = "video info is null, return now."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            return
        L_0x0100:
            boolean r1 = r6.mo100983V3()
            if (r1 == 0) goto L_0x012d
            int r1 = r17.mo135787t8()
            int r2 = r17.mo135786s8()
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r11 = new java.lang.Object[r0]
            if (r1 == r4) goto L_0x011a
            if (r1 == r9) goto L_0x0118
            r1 = 6
            goto L_0x011c
        L_0x0118:
            r1 = 2
            goto L_0x011c
        L_0x011a:
            r1 = 10
        L_0x011c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11[r3] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r11[r4] = r1
            r1 = 18589(0x489d, float:2.6049E-41)
            r10.mo160131h(r1, r11)
        L_0x012d:
            boolean r1 = r6.mo101016t3()
            if (r1 == 0) goto L_0x0153
            r13 = 0
            r14 = 0
            r10 = 52
            r16 = 0
            r15 = 0
            java.lang.Class<mm.h> r1 = p606mm.C99933h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            mm.h r1 = (p606mm.C99933h) r1
            java.lang.Class<qh0.a> r2 = qh0.C62619a.class
            jg.a r12 = new jg.a
            r9 = r12
            r5 = r12
            r12 = r6
            r9.<init>(r10, r12, r13, r14, r15, r16)
            r9 = 18
            java.lang.String r10 = "album_enter_from_scene"
            r1.mo84406lr(r9, r10, r2, r5)
        L_0x0153:
            qo3.n r1 = r7.f284448m1
            if (r1 != 0) goto L_0x0162
            qo3.n r1 = new qo3.n
            androidx.appcompat.app.AppCompatActivity r2 = r17.getContext()
            r1.<init>((android.content.Context) r2, (int) r3, (boolean) r4)
            r7.f284448m1 = r1
        L_0x0162:
            boolean r1 = r6.mo100980S3()
            if (r1 == 0) goto L_0x016a
            r1 = 1
            goto L_0x016e
        L_0x016a:
            boolean r1 = eb0.C75569c4.m90691x(r6)
        L_0x016e:
            r9 = 0
            if (r1 == 0) goto L_0x0189
            boolean r1 = r17.mo135726I8()
            if (r1 != 0) goto L_0x0189
            boolean r0 = r17.mo135745T8()
            if (r0 == 0) goto L_0x0186
            qo3.n r0 = r7.f284448m1
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$v r1 = new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$v
            r1.<init>(r7)
            r0.f225773j = r1
        L_0x0186:
            r13 = 6
            goto L_0x02f9
        L_0x0189:
            boolean r1 = eb0.C75569c4.m90689v(r6)
            if (r1 == 0) goto L_0x0190
            return
        L_0x0190:
            iq0.b r10 = iq0.C98783b.IMAGE
            java.lang.String r1 = "tryEnhanceBottomSheet"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r1)
            qo3.n r1 = r7.f284448m1
            if (r1 != 0) goto L_0x01a4
            java.lang.String r0 = "tryEnhanceBottomSheet, bottomSheet is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            goto L_0x02e0
        L_0x01a4:
            com.tencent.mm.ui.chatting.gallery.h r1 = r7.f284432g
            int r2 = r7.f284488y2
            com.tencent.mm.storage.f4 r1 = r1.mo135937y(r2)
            boolean r1 = eb0.C75569c4.m90692y(r1)
            if (r1 != 0) goto L_0x02e0
            com.tencent.mm.ui.chatting.gallery.h r1 = r7.f284432g
            int r2 = r7.f284488y2
            com.tencent.mm.storage.f4 r1 = r1.mo135937y(r2)
            boolean r1 = eb0.C75569c4.m90671d(r1)
            if (r1 == 0) goto L_0x01c2
            goto L_0x02e0
        L_0x01c2:
            java.lang.String r1 = r17.mo135788u5()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x01fc
            com.tencent.mm.ui.chatting.gallery.h r1 = r7.f284432g
            if (r1 == 0) goto L_0x01f3
            int r2 = r7.f284488y2
            com.tencent.mm.storage.f4 r1 = r1.mo135937y(r2)
            boolean r2 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124955K(r1)
            if (r2 == 0) goto L_0x01f3
            java.lang.Class<rz.s> r2 = p682rz.C101488s.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            rz.s r2 = (p682rz.C101488s) r2
            rz.t r2 = r2.Kj0()
            java.lang.String r1 = r1.mo108765s2()
            hd0.o0 r2 = (hd0.C98410o0) r2
            java.lang.String r1 = r2.mo137728q(r1)
            goto L_0x01f4
        L_0x01f3:
            r1 = r9
        L_0x01f4:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            iq0.b r2 = iq0.C98783b.VIDEO
            r11 = r2
            goto L_0x01fd
        L_0x01fc:
            r11 = r10
        L_0x01fd:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x020b
            java.lang.String r0 = "tryEnhanceBottomSheet, curMaterialPath is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            goto L_0x02e0
        L_0x020b:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r3] = r1
            r2[r4] = r11
            java.lang.String r3 = "tryEnhanceBottomSheet, curMaterialPath: %s, scene: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r2)
            java.lang.Class<kr0.l0> r2 = kr0.C109033l0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            kr0.l0 r2 = (kr0.C109033l0) r2
            if (r2 != 0) goto L_0x0229
            java.lang.String r0 = "tryEnhanceBottomSheet, openMaterialService is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            goto L_0x02e0
        L_0x0229:
            boolean r3 = r2.mo158321RB(r11)
            if (r3 != 0) goto L_0x0237
            java.lang.String r0 = "tryEnhanceBottomSheet, openMaterialService is not enabled"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x02e0
        L_0x0237:
            if (r10 != r11) goto L_0x0261
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$x0 r3 = r7.f284465r2
            int r3 = r3.f284555a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "get#ScanState, state: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            if (r0 != r3) goto L_0x0261
            boolean r0 = r17.mo135727J8()
            if (r0 == 0) goto L_0x0261
            java.lang.String r0 = "tryEnhanceBottomSheet, can not enhance bottomSheet"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x02e0
        L_0x0261:
            java.lang.String r0 = r7.f284468s2
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02d1
            java.lang.String r0 = "tryEnhanceBottomSheet, already fetchOpenMaterials"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection r0 = r7.f284471t2
            if (r0 != 0) goto L_0x027a
            java.lang.String r0 = "tryEnhanceBottomSheet, cachedOpenMaterialCollection is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            goto L_0x02e0
        L_0x027a:
            qo3.n r1 = r7.f284448m1
            boolean r0 = r2.mo158325ic(r1, r0)
            if (r0 != 0) goto L_0x0289
            java.lang.String r0 = "tryEnhanceBottomSheet, not need enhance"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x02e0
        L_0x0289:
            com.tencent.mm.ui.chatting.gallery.h r0 = r7.f284432g
            com.tencent.mm.ui.chatting.gallery.u1 r0 = r0.mo135933u()
            if (r0 == 0) goto L_0x02e0
            com.tencent.mm.ui.chatting.gallery.u1 r1 = com.tencent.p014mm.p136ui.chatting.gallery.C97149u1.EXPIRED
            if (r1 == r0) goto L_0x02e0
            gq0.g0 r0 = r7.f284474u2
            if (r0 == 0) goto L_0x029c
            r0.dead()
        L_0x029c:
            qo3.n r3 = r7.f284448m1
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection r4 = r7.f284471t2
            r5 = 0
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$y0 r0 = r7.f284477v2
            if (r0 != 0) goto L_0x02ac
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$y0 r0 = new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$y0
            r0.<init>(r7)
            r7.f284477v2 = r0
        L_0x02ac:
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$y0 r12 = r7.f284477v2
            r0 = r2
            r1 = r11
            r2 = r17
            r13 = 6
            r14 = r6
            r6 = r12
            gq0.g0 r0 = r0.mo158322RD(r1, r2, r3, r4, r5, r6)
            r7.f284474u2 = r0
            if (r10 != r11) goto L_0x02e2
            boolean r0 = r17.mo135727J8()
            if (r0 == 0) goto L_0x02e2
            java.lang.String r0 = "tryEnhanceBottomSheet, hide enhance bottomSheet"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            gq0.g0 r0 = r7.f284474u2
            gq0.g0$b r1 = gq0.C107885g0.C45943b.HIDE
            r0.mo158311o(r1)
            goto L_0x02e2
        L_0x02d1:
            r14 = r6
            r13 = 6
            com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel r0 = com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel.m117224a(r1)
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$v0 r3 = new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$v0
            r3.<init>(r7, r1, r2, r11)
            r2.mo158324aj(r0, r3)
            goto L_0x02e2
        L_0x02e0:
            r14 = r6
            r13 = 6
        L_0x02e2:
            qo3.n r0 = r7.f284448m1
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$w r1 = new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$w
            r1.<init>(r7, r14)
            r0.f225771i = r1
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$x r1 = new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$x
            r1.<init>(r7, r14)
            r0.f225773j = r1
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$y r1 = new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$y
            r1.<init>(r7)
            r0.f225780o = r1
        L_0x02f9:
            qo3.n r0 = r7.f284448m1
            nj3.p0 r1 = r7.f284480w2
            r0.f225782p = r1
            r0.f225787r = r1
            r0.f225793u = r1
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$z r1 = new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$z
            r1.<init>(r7)
            r0.f225761d = r1
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$a0 r1 = new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$a0
            r1.<init>(r7)
            r0.f225802y = r1
            boolean r0 = r7.mo135792x8(r13)
            if (r0 == 0) goto L_0x0330
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r17)
            r1 = 2131496495(0x7f0c0e2f, float:1.8616556E38)
            android.view.View r0 = r0.inflate(r1, r9)
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$b0 r1 = new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$b0
            r1.<init>(r7)
            r0.setOnClickListener(r1)
            qo3.n r1 = r7.f284448m1
            r1.mo107567l(r0)
            goto L_0x0335
        L_0x0330:
            qo3.n r0 = r7.f284448m1
            r0.mo107567l(r9)
        L_0x0335:
            qo3.n r0 = r7.f284448m1
            r0.mo107573q()
            return
        L_0x033b:
            java.lang.String r0 = "jacks fail downloaded img, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI.mo135751W8():void");
    }

    /* renamed from: X7 */
    public final void mo135752X7(boolean z) {
        String u5 = mo135788u5();
        int i = this.f284363I1;
        if ((i == 0 || i == 2) && !Util.isNullOrNil(u5)) {
            GalleryTranslateReportStruct galleryTranslateReportStruct = new GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f265618d = this.f284363I1 == 2 ? 1 : 0;
            galleryTranslateReportStruct.f265619e = 3;
            galleryTranslateReportStruct.f265620f = z ? 10 : 4;
            C92836k p = C97100o.m125011p(this.f284432g.mo135935w());
            if (p != null) {
                galleryTranslateReportStruct.mo126621t(p.mo127136g());
                galleryTranslateReportStruct.mo126620s(p.mo127133d());
            }
            galleryTranslateReportStruct.mo86054n();
            this.f284351E1 = (int) (((long) C75592q0.m90789s().hashCode()) + System.currentTimeMillis());
            C38543c8 Gb0 = ((C94466j) C86312j.m106911c(C94466j.class)).Gb0(u5);
            int i2 = 1;
            if (Gb0 == null || !C86013q1.m106450k(Gb0.field_resultFile)) {
                if (C86709a0.m107524d().mo123467m() == 6 || C86709a0.m107524d().mo123467m() == 4) {
                    this.f284363I1 = 1;
                    mo135765d9();
                } else {
                    C76879j.m92748s(this, getString(C0966R.string.f360087a11), "");
                    mo135756Z7(false);
                }
                Log.m105925i("MicroMsg.ImageGalleryUI", "try to translate img %s, sessionId %d", u5, Integer.valueOf(this.f284351E1));
                ScanTranslationEvent scanTranslationEvent = new ScanTranslationEvent();
                ScanTranslationEvent.C92559a aVar = scanTranslationEvent.f265085d;
                if (z) {
                    i2 = 7;
                }
                aVar.f265086a = i2;
                aVar.f265088c = u5;
                aVar.f265087b = this.f284351E1;
                scanTranslationEvent.publish();
            } else if (this.f284432g.mo135937y(this.f284488y2) != null) {
                C97056h hVar = this.f284432g;
                hVar.mo135918M(hVar.mo135935w(), true, this.f284488y2);
                mo135732N7(this.f284432g.mo135935w(), true);
            }
        }
    }

    /* renamed from: X8 */
    public void mo135753X8(boolean z) {
        boolean z2;
        C55068a aVar;
        C55068a aVar2;
        int i;
        TouchMediaPreviewLayout touchMediaPreviewLayout;
        if (BuildInfo.IS_FLAVOR_RED) {
            Log.m105919d("MicroMsg.ImageGalleryUI", "showOpLayer isShowOpToolbar: %b, pageChanged: %b, %s", Boolean.valueOf(this.f284370K2), Boolean.valueOf(z), Util.getStack());
        }
        if (mo135762c8() && z && (touchMediaPreviewLayout = this.f284409X0) != null && touchMediaPreviewLayout.getAddTouchView()) {
            this.f284409X0.mo153914f();
        }
        if (!this.f284466s) {
            C72963f4 f4Var = null;
            C97056h hVar = this.f284432g;
            if (hVar != null) {
                f4Var = hVar.mo135935w();
            }
            if (f4Var != null) {
                if (C75569c4.m90689v(f4Var)) {
                    Log.m105928w("MicroMsg.ImageGalleryUI", "ignore show opLayer");
                    return;
                }
                if (!this.f284370K2) {
                    Object[] objArr = new Object[1];
                    objArr[0] = Boolean.valueOf(this.f284460q.getVisibility() == 0);
                    Log.m105919d("MicroMsg.ImageGalleryUI", "fadeInOpLayout: %b", objArr);
                    this.f284460q.clearAnimation();
                    RelativeLayout relativeLayout = this.f284460q;
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(150);
                    alphaAnimation.setFillAfter(true);
                    relativeLayout.startAnimation(alphaAnimation);
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.f284481x = 0;
                this.f284370K2 = true;
                this.f284460q.setVisibility(0);
                mo135763c9();
                if (!mo135726I8() && !mo135725H8()) {
                    mo135743S8(this.f284382P, this.f284374M ? 8 : 0);
                    int i2 = 4;
                    mo135743S8(this.f284382P, mo135724G8() ? 4 : this.f284382P.getVisibility());
                    mo135743S8(this.f284382P, (!this.f284397T0 || C101888l.f300029a.mo141352a(this.f284423d)) ? this.f284382P.getVisibility() : 4);
                    mo135779m8();
                    mo135743S8(this.f284377N, (!this.f284473u1 || this.f284374M) ? 8 : 0);
                    mo135779m8();
                    View view = this.f284377N;
                    if (mo135724G8()) {
                        i = 4;
                    } else {
                        mo135779m8();
                        i = this.f284377N.getVisibility();
                    }
                    mo135743S8(view, i);
                    mo135779m8();
                    View view2 = this.f284377N;
                    if (!this.f284397T0 || C101888l.f300029a.mo141352a(this.f284423d)) {
                        mo135779m8();
                        i2 = this.f284377N.getVisibility();
                    }
                    mo135743S8(view2, i2);
                    int i3 = this.f284481x;
                    boolean z3 = this.f284374M;
                    this.f284481x = i3 + (z3 ^ true ? 1 : 0) + (this.f284473u1 && !z3 ? 1 : 0);
                }
                C97056h.C97067g gVar = this.f284441j;
                C97056h.C97067g gVar2 = C97056h.C97067g.image;
                int i4 = gVar != gVar2 ? 0 : 1;
                if ((f4Var.mo100980S3() ? true : C75569c4.m90691x(f4Var)) || C75569c4.m90688u(f4Var) || C75569c4.m90692y(f4Var) || C75569c4.m90671d(f4Var)) {
                    i4 = 0;
                }
                if (mo135726I8() || mo135725H8()) {
                    i4 = 0;
                }
                if (f4Var.mo101016t3()) {
                    i4 = 0;
                }
                mo135777k8();
                View view3 = this.f284385Q;
                if (!z) {
                    mo135743S8(view3, i4 != 0 ? 0 : 8);
                } else if (i4 != 0) {
                    mo135749V8(view3, view3.getVisibility() != 0);
                } else {
                    mo135718A8(view3, true);
                }
                this.f284481x += i4;
                if (!z) {
                    mo135738Q7(0, true);
                } else {
                    C97056h.C97067g gVar3 = this.f284441j;
                    if (!(gVar3 == gVar2 || gVar3 == C97056h.C97067g.appimage)) {
                        mo135721D8(0, z2);
                    }
                }
                if (this.f284441j == C97056h.C97067g.video) {
                    mo135761b9();
                }
                mo135737P8(true);
                mo135739Q8(true);
                if (!this.f284397T0) {
                    C97087m1 v = this.f284432g.mo135934v();
                    if (!((v == null || (aVar2 = v.f284824G) == null) ? false : aVar2.mo76188C6())) {
                        View view4 = this.f284386Q0;
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar3.mo10233c(8);
                        View view5 = view4;
                        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkAlbumVisibility", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkAlbumVisibility", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f284390R0.setVisibility(8);
                        return;
                    }
                }
                mo135784q8();
                View view6 = this.f284402V;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view7 = view6;
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkAlbumVisibility", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkAlbumVisibility", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo135777k8();
                View view8 = this.f284385Q;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view9 = view8;
                C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkAlbumVisibility", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkAlbumVisibility", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C97087m1 v2 = this.f284432g.mo135934v();
                if ((v2 == null || (aVar = v2.f284824G) == null) ? false : aVar.mo76188C6()) {
                    View view10 = this.f284386Q0;
                    C9556a aVar6 = new C9556a();
                    aVar6.mo10233c(8);
                    View view11 = view10;
                    C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkAlbumVisibility", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view11, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkAlbumVisibility", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f284390R0.setVisibility(8);
                    mo135743S8(this.f284382P, 8);
                    mo135779m8();
                    mo135743S8(this.f284377N, 8);
                } else {
                    View view12 = this.f284386Q0;
                    C9556a aVar7 = new C9556a();
                    aVar7.mo10233c(0);
                    View view13 = view12;
                    C117292a.m165358d(view13, aVar7.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkAlbumVisibility", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view12.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view13, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkAlbumVisibility", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f284390R0.setVisibility(0);
                    if (mo135726I8() || mo135725H8() || !C101888l.f300029a.mo141352a(this.f284423d)) {
                        mo135743S8(this.f284382P, 8);
                        mo135779m8();
                        mo135743S8(this.f284377N, 8);
                    } else {
                        mo135743S8(this.f284382P, 0);
                        mo135779m8();
                        mo135743S8(this.f284377N, 0);
                    }
                }
                this.f284394S0.setText(((C98450d) C86312j.m106911c(C98450d.class)).mo137794Ml(this, f4Var.getContent()));
            }
        }
    }

    /* renamed from: Y7 */
    public final void mo135754Y7(int i) {
        Class cls = C99933h.class;
        Log.m105924i("MicroMsg.ImageGalleryUI", "enterGrid source : " + i);
        if (this.f284432g == null) {
            Log.m105928w("MicroMsg.ImageGalleryUI", "try to enterGrid, but adapter is NULL");
            return;
        }
        C115669n.INSTANCE.idkeyStat(219, 13, 1, true);
        C97056h hVar = this.f284432g;
        int i2 = hVar.f284715h.f284744c;
        C72963f4 w = hVar.mo135935w();
        if (w == null) {
            Log.m105920e("MicroMsg.ImageGalleryUI", "msgInfo is null");
            return;
        }
        int f8 = (mo135768f8() - C97056h.C97063f.f284741p) + this.f284432g.f284715h.f284747f;
        if (w.mo101016t3()) {
            ((C99933h) C86312j.m106911c(cls)).mo84406lr(18, "album_enter_from_scene", C62619a.class, new C98939a(51, w, 0, 0, (C98672d) null, 0));
            C62619a aVar = new C62619a();
            aVar.f177833h = 3;
            ((C99933h) C86312j.m106911c(cls)).mo84399BM(18, "album_enter_from_scene", aVar, new ImageGalleryUI$$a());
        }
        if (!this.f284476v1) {
            Intent intent = new Intent();
            intent.setClass(getContext(), MediaHistoryGalleryUI.class);
            intent.addFlags(67108864);
            intent.putExtra("kintent_intent_source", i);
            intent.putExtra("kintent_talker", mo135764d8());
            intent.putExtra("kintent_image_count", i2);
            intent.putExtra("kintent_image_index", f8);
            intent.putExtra("key_biz_chat_id", this.f284435h);
            intent.putExtra("key_is_biz_chat", this.f284446l1);
            intent.putExtra("key_gallery_enter_scene", 1);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "enterGrid", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "enterGrid", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f284384P2.postDelayed(new ImageGalleryUI$$k0(this), 50);
            return;
        }
        mo135735O8();
    }

    /* renamed from: Y8 */
    public void mo135755Y8(String str) {
        this.f284374M = true;
        if (!Util.isNullOrNil(str)) {
            this.f284371L.setMessage(str);
            FullScreenStatusMaskView fullScreenStatusMaskView = this.f284371L;
            fullScreenStatusMaskView.f216441g.setVisibility(8);
            fullScreenStatusMaskView.f216442h.setVisibility(0);
        }
        this.f284371L.setVisibility(0);
    }

    /* renamed from: Z7 */
    public final void mo135756Z7(boolean z) {
        this.f284363I1 = 0;
        mo135769f9(z);
    }

    /* renamed from: Z8 */
    public final boolean mo135757Z8(boolean z, boolean z2) {
        C92836k p;
        if (!mo135723F8()) {
            return false;
        }
        boolean a = this.f284461q1.mo137421a(z ? 5 : 1);
        boolean z3 = (this.f284354F1 || mo135724G8()) && a && !mo135725H8();
        Log.m105927v("MicroMsg.ImageGalleryUI", "showScanTranslateButton showQuickTrans: %b, showTranslateResult: %b, show: %b", Boolean.valueOf(this.f284354F1), Boolean.valueOf(a), Boolean.valueOf(z3));
        if (z3) {
            GalleryTranslateReportStruct galleryTranslateReportStruct = new GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f265618d = this.f284363I1 == 2 ? 1 : 0;
            galleryTranslateReportStruct.f265619e = 8;
            galleryTranslateReportStruct.f265620f = 10;
            C97056h hVar = this.f284432g;
            if (!(hVar == null || (p = C97100o.m125011p(hVar.mo135935w())) == null)) {
                galleryTranslateReportStruct.mo126621t(p.mo127136g());
                galleryTranslateReportStruct.mo126620s(p.mo127133d());
            }
            galleryTranslateReportStruct.mo86054n();
            this.f284404V1.mo137418d(3);
            if (this.f284389R.getVisibility() != 0) {
                mo135743S8(this.f284389R, 0);
            }
            return true;
        }
        if (z2) {
            mo135743S8(this.f284389R, 8);
        }
        return false;
    }

    /* renamed from: a8 */
    public final Animation mo135758a8(int i) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration((long) i);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setInterpolator(new AccelerateInterpolator(10.0f));
        return alphaAnimation;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = r11.f284467s1;
     */
    /* renamed from: a9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo135759a9(boolean r12) {
        /*
            r11 = this;
            boolean r0 = r11.mo135723F8()
            r1 = 0
            if (r0 == 0) goto L_0x0138
            boolean r0 = gk3.C98135d.f287728d
            if (r0 != 0) goto L_0x000d
            goto L_0x0138
        L_0x000d:
            boolean r0 = r11.mo135726I8()
            r2 = 3
            r3 = 1
            if (r0 != 0) goto L_0x0031
            boolean r0 = r11.mo135725H8()
            if (r0 != 0) goto L_0x0031
            sk2.f r0 = r11.f284467s1
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r0.f297557k
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0031
            gk3.g r0 = r11.f284461q1
            boolean r0 = r0.mo137421a(r2)
            if (r0 == 0) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r4[r1] = r5
            java.lang.String r5 = "MicroMsg.ImageGalleryUI"
            java.lang.String r6 = "alvinluo showSearchImageBubbleView showBubble: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
            r4 = 8
            if (r0 == 0) goto L_0x012e
            android.widget.RelativeLayout r12 = r11.f284460q
            int r12 = r12.getVisibility()
            if (r12 != 0) goto L_0x004f
            r12 = 1
            goto L_0x0050
        L_0x004f:
            r12 = 0
        L_0x0050:
            r11.mo135784q8()
            android.view.View r0 = r11.f284402V
            if (r12 == 0) goto L_0x0059
            r6 = 0
            goto L_0x005b
        L_0x0059:
            r6 = 8
        L_0x005b:
            r11.mo135743S8(r0, r6)
            r11.mo135785r8()
            com.tencent.mm.ui.chatting.gallery.view.SearchImageBubbleView r0 = r11.f284411Y
            if (r12 == 0) goto L_0x0067
            r6 = 0
            goto L_0x0069
        L_0x0067:
            r6 = 8
        L_0x0069:
            r11.mo135743S8(r0, r6)
            com.tencent.mm.ui.base.MMViewPager r0 = r11.f284450n
            int r0 = r0.getMeasuredWidth()
            int r6 = r11.f284481x
            int r7 = r6 + 1
            int r8 = r11.f284485y
            int r7 = r7 * r8
            int r7 = r0 - r7
            int r8 = r11.f284338A
            int r7 = r7 - r8
            if (r6 <= r3) goto L_0x0086
            int r8 = r11.f284489z
            int r6 = r6 * r8
            int r7 = r7 - r6
        L_0x0086:
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r12)
            r6[r1] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r6[r3] = r8
            r8 = 2
            int r9 = r11.f284481x
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6[r8] = r9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r6[r2] = r8
            int r8 = r11.f284485y
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 4
            r6[r9] = r8
            r8 = 5
            int r10 = r11.f284338A
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6[r8] = r10
            java.lang.String r8 = "alvinluo showSearchImageBubbleView visible: %b, galleryWidth: %d, showButtonCount: %d, viewPositionX: %d, bottomBtnSize: %d, bottomBtnRightExtrMargin: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r6)
            r11.mo135785r8()
            com.tencent.mm.ui.chatting.gallery.view.SearchImageBubbleView r5 = r11.f284411Y
            r5.setViewWidth(r0)
            sk2.f r0 = r11.f284467s1
            java.lang.String r0 = r0.f297557k
            r5.setBubbleText(r0)
            int r0 = r11.f284485y
            android.graphics.Point r6 = r5.f216448h
            r6.x = r0
            r6.y = r0
            android.graphics.Point r0 = r5.f216449i
            r0.x = r7
            r0.y = r1
            r5.setBubbleClickListener(r11)
            if (r12 == 0) goto L_0x0120
            android.widget.TextView r12 = r5.f216444d
            java.lang.String r0 = "bubbleTextView"
            r4 = 0
            if (r12 == 0) goto L_0x011c
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            r12.measure(r6, r7)
            android.widget.TextView r12 = r5.f216444d
            if (r12 == 0) goto L_0x0118
            int r12 = r12.getMeasuredWidth()
            r5.f216451n = r12
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0[r1] = r12
            java.lang.String r12 = "MicroMsg.SearchImageBubbleView"
            java.lang.String r1 = "alvinluo showBubbleView bubbleWidth: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r12, r1, r0)
            android.graphics.Point r12 = r5.f216449i
            int r12 = r12.x
            if (r12 <= 0) goto L_0x0112
            r5.mo102787a()
            goto L_0x0123
        L_0x0112:
            r5.setVisibility(r9)
            r5.f216447g = r3
            goto L_0x0123
        L_0x0118:
            gy3.C87412m.m108603p(r0)
            throw r4
        L_0x011c:
            gy3.C87412m.m108603p(r0)
            throw r4
        L_0x0120:
            r5.setVisibility(r4)
        L_0x0123:
            gk3.e r12 = r11.f284404V1
            r12.mo137417c(r3, r9)
            gk3.e r12 = r11.f284404V1
            r12.mo137417c(r3, r2)
            return r3
        L_0x012e:
            if (r12 == 0) goto L_0x0138
            r11.mo135785r8()
            com.tencent.mm.ui.chatting.gallery.view.SearchImageBubbleView r12 = r11.f284411Y
            r11.mo135743S8(r12, r4)
        L_0x0138:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI.mo135759a9(boolean):boolean");
    }

    /* renamed from: b8 */
    public final void mo135760b8(int i, C72963f4 f4Var) {
        if (f4Var == null || !f4Var.mo100983V3()) {
            View view = this.f284346C2;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "fillMpVideoInfoLayout", "(ILcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "fillMpVideoInfoLayout", "(ILcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        boolean z = true;
        if (this.f284346C2 == null) {
            this.f284346C2 = ((ViewStub) findViewById(C0966R.C0970id.ehq)).inflate();
            this.f284358G2 = findViewById(C0966R.C0970id.h0n);
            this.f284364I2 = (ImageView) findViewById(C0966R.C0970id.h0m);
            this.f284367J2 = (ImageView) findViewById(C0966R.C0970id.h0y);
            this.f284349D2 = (TextView) findViewById(C0966R.C0970id.h0w);
            this.f284355F2 = (MMNeat7extView) findViewById(C0966R.C0970id.f358777h11);
            this.f284352E2 = (TextView) findViewById(C0966R.C0970id.f358779h13);
            this.f284349D2.getPaint().setFakeBoldText(true);
            this.f284352E2.getPaint().setFakeBoldText(true);
            this.f284355F2.getPaint().setFakeBoldText(true);
            this.f284361H2 = findViewById(C0966R.C0970id.f358778h12);
            this.f284346C2.setOnClickListener(new ImageGalleryUI$$g0(this));
        }
        if (C75044y4.m89993e(this) <= 0) {
            z = false;
        }
        int c = C75044y4.m89991c(this);
        if (this.f284463r && z) {
            if (mo135728K8(this)) {
                View view3 = this.f284346C2;
                if (view3 != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view3.getLayoutParams();
                    layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, 0, 0);
                    this.f284346C2.setLayoutParams(layoutParams);
                }
            } else {
                View view4 = this.f284346C2;
                if (view4 != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view4.getLayoutParams();
                    layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, c, 0);
                    this.f284346C2.setLayoutParams(layoutParams2);
                }
            }
        }
        C48300n n = C97052g.m124926n(f4Var);
        if (n == null) {
            Log.m105928w("MicroMsg.ImageGalleryUI", "fillMpVideoInfoLayout mpShareVideoInfo is null");
            return;
        }
        this.f284355F2.mo104279b(n.f133369g);
        C68070l.C68072b bVar = new C68070l.C68072b();
        bVar.f195638w = n.f133376q;
        bVar.f195634v = n.f133375p;
        C6805l4.m7091a(this, bVar, this.f284364I2, this.f284349D2);
        this.f284358G2.setOnClickListener(new ImageGalleryUI$$h0(this, n));
        this.f284361H2.setOnClickListener(new ImageGalleryUI$$i0(this, n));
        C7007c1.m7256a(this.f284358G2);
        C7007c1.m7256a(this.f284361H2);
        if (n.f133366d != null) {
            ((C45696d) C86709a0.m107533q(C45696d.class)).Tn0(n.f133366d, -1, 2, new Object[0]);
            View view5 = this.f284361H2;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "fillMpVideoInfoLayout", "(ILcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "fillMpVideoInfoLayout", "(ILcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view7 = this.f284361H2;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "fillMpVideoInfoLayout", "(ILcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "fillMpVideoInfoLayout", "(ILcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f284367J2.getLayoutParams();
        int textSize = (int) (((double) this.f284352E2.getTextSize()) * 1.45d);
        layoutParams3.height = textSize;
        layoutParams3.width = textSize;
        this.f284367J2.setLayoutParams(layoutParams3);
        if (this.f284339A1) {
            mo135753X8(false);
            mo135761b9();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b3, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106451l(r9) >= ((long) r10.f288559f)) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb  */
    /* renamed from: b9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo135761b9() {
        /*
            r14 = this;
            java.lang.String r0 = "MicroMsg.ImageGalleryUI"
            java.lang.String r1 = "show video tool bar"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "switch tool bar bg %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r3, r2)
            android.view.View r0 = r14.f284414Z
            r2 = 4
            r14.mo135743S8(r0, r2)
            r14.mo135781o8()
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar r0 = r14.f284400U0
            r14.mo135743S8(r0, r4)
            r14.mo135781o8()
            android.view.View r0 = r14.f284403V0
            r14.mo135743S8(r0, r4)
            android.view.View r0 = r14.f284353F
            boolean r3 = r14.f284374M
            if (r3 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            r14.mo135743S8(r0, r2)
            com.tencent.mm.ui.chatting.gallery.h r0 = r14.f284432g
            com.tencent.mm.storage.f4 r0 = r0.mo135935w()
            java.lang.String r2 = r0.mo108765s2()
            hd0.n0 r2 = hd0.C98429r0.m127818i(r2)
            r3 = 8
            if (r2 == 0) goto L_0x0240
            android.widget.Button r5 = r14.f284362I
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L_0x0240
            hd0.x0$a r5 = hd0.C98442x0.f288734i
            java.lang.String r6 = r2.mo137705i()
            hd0.x0 r5 = r5.mo137781b(r6)
            r6 = 16
            r7 = 143(0x8f, float:2.0E-43)
            r8 = 0
            if (r5 == 0) goto L_0x01b4
            java.lang.String r9 = r5.f288740d
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x01b4
            int r9 = r0.mo108769t2()
            if (r9 != r1) goto L_0x0071
            goto L_0x00b6
        L_0x0071:
            java.lang.String r9 = r2.f288546N
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 == 0) goto L_0x007a
            goto L_0x00b8
        L_0x007a:
            hd0.n0 r10 = hd0.C98429r0.m127818i(r9)
            if (r10 != 0) goto L_0x0081
            goto L_0x00b8
        L_0x0081:
            com.tencent.mm.ui.chatting.gallery.d r11 = com.tencent.p014mm.p136ui.chatting.gallery.C73703d.f216412a
            long r12 = r0.getMsgId()
            com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader r11 = r11.mo102767a(r12)
            if (r11 == 0) goto L_0x0092
            boolean r11 = r11.f282440e
            if (r11 != 0) goto L_0x0092
            goto L_0x00b6
        L_0x0092:
            int r11 = r10.f288562i
            if (r11 != r7) goto L_0x0097
            goto L_0x00b6
        L_0x0097:
            r12 = 199(0xc7, float:2.79E-43)
            if (r11 == r12) goto L_0x009c
            goto L_0x00b8
        L_0x009c:
            hd0.o0 r11 = hd0.C98398h0.Bx0()
            java.lang.String r9 = r11.mo137728q(r9)
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            if (r11 == 0) goto L_0x00b8
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
            int r9 = r10.f288559f
            long r9 = (long) r9
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            r9 = 0
            goto L_0x00b9
        L_0x00b8:
            r9 = 1
        L_0x00b9:
            if (r9 == 0) goto L_0x01b4
            long r9 = eb0.C31543z5.m39451a()
            long r11 = r0.getCreateTime()
            long r9 = r9 - r11
            r11 = 432000000(0x19bfcc00, double:2.13436359E-315)
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x00ee
            android.widget.Button r1 = r14.f284359H
            r2 = 2131833878(0x7f113416, float:1.930085E38)
            java.lang.String r2 = r14.getString(r2)
            r1.setText(r2)
            android.widget.Button r1 = r14.f284359H
            r1.setEnabled(r4)
            android.graphics.drawable.Drawable r1 = r14.f284356G
            if (r1 == 0) goto L_0x01ad
            android.widget.Button r1 = r14.f284359H
            r1.setGravity(r6)
            android.widget.Button r1 = r14.f284359H
            android.graphics.drawable.Drawable r2 = r14.f284356G
            r1.setCompoundDrawables(r2, r8, r8, r8)
            goto L_0x01ad
        L_0x00ee:
            java.util.HashMap<java.lang.Long, java.lang.String> r6 = r14.f284376M2
            long r9 = r2.f288567n
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x018c
            int r5 = r5.f288743g
            long r5 = (long) r5
            r9 = 0
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x010c
            java.lang.String r5 = ""
        L_0x0109:
            r6 = r5
            goto L_0x0181
        L_0x010c:
            java.math.BigDecimal r7 = new java.math.BigDecimal
            r7.<init>(r5)
            java.math.BigDecimal r5 = new java.math.BigDecimal
            r6 = 1073741824(0x40000000, float:2.0)
            r5.<init>(r6)
            java.math.BigDecimal r5 = r7.divide(r5, r1, r4)
            float r5 = r5.floatValue()
            r6 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0139
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r5 = (int) r5
            r6.append(r5)
            java.lang.String r5 = "GB"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L_0x0109
        L_0x0139:
            java.math.BigDecimal r5 = new java.math.BigDecimal
            r9 = 1048576(0x100000, float:1.469368E-39)
            r5.<init>(r9)
            java.math.BigDecimal r5 = r7.divide(r5, r4, r4)
            float r5 = r5.floatValue()
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x015f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r5 = (int) r5
            r6.append(r5)
            java.lang.String r5 = "MB"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L_0x0109
        L_0x015f:
            java.math.BigDecimal r5 = new java.math.BigDecimal
            r6 = 1024(0x400, float:1.435E-42)
            r5.<init>(r6)
            java.math.BigDecimal r5 = r7.divide(r5, r4, r4)
            float r5 = r5.floatValue()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r5 = (int) r5
            r6.append(r5)
            java.lang.String r5 = "KB"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L_0x0109
        L_0x0181:
            java.util.HashMap<java.lang.Long, java.lang.String> r5 = r14.f284376M2
            long r9 = r2.f288567n
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r5.put(r2, r6)
        L_0x018c:
            android.widget.Button r2 = r14.f284359H
            r5 = 17
            r2.setGravity(r5)
            android.widget.Button r2 = r14.f284359H
            r2.setCompoundDrawables(r8, r8, r8, r8)
            android.widget.Button r2 = r14.f284359H
            r2.setEnabled(r1)
            android.widget.Button r2 = r14.f284359H
            r5 = 2131838430(0x7f1145de, float:1.9310083E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r6
            java.lang.String r1 = r14.getString(r5, r1)
            r2.setText(r1)
        L_0x01ad:
            android.widget.Button r1 = r14.f284359H
            r14.mo135743S8(r1, r4)
            goto L_0x0240
        L_0x01b4:
            java.lang.String r2 = r2.f288546N
            hd0.n0 r2 = hd0.C98429r0.m127818i(r2)
            if (r2 != 0) goto L_0x01bd
            goto L_0x01c2
        L_0x01bd:
            int r2 = r2.f288562i
            if (r2 != r7) goto L_0x01c2
            goto L_0x01c3
        L_0x01c2:
            r1 = 0
        L_0x01c3:
            if (r1 == 0) goto L_0x023b
            android.widget.Button r1 = r14.f284359H
            r2 = 2131833879(0x7f113417, float:1.9300853E38)
            java.lang.String r2 = r14.getString(r2)
            r1.setText(r2)
            android.widget.Button r1 = r14.f284359H
            r1.setEnabled(r4)
            android.graphics.drawable.Drawable r1 = r14.f284356G
            if (r1 == 0) goto L_0x01e6
            android.widget.Button r1 = r14.f284359H
            r1.setGravity(r6)
            android.widget.Button r1 = r14.f284359H
            android.graphics.drawable.Drawable r2 = r14.f284356G
            r1.setCompoundDrawables(r2, r8, r8, r8)
        L_0x01e6:
            android.widget.Button r1 = r14.f284359H
            r14.mo135743S8(r1, r4)
            android.view.View r1 = r14.f284365J
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0240
            android.view.View r1 = r14.f284365J
            r1.clearAnimation()
            android.view.View r1 = r14.f284365J
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r5)
            java.lang.Object[] r6 = r2.mo10232b()
            java.lang.String r7 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI"
            java.lang.String r8 = "checkNeedShowOriginVideoBtn"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r1
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r6 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI"
            java.lang.String r7 = "checkNeedShowOriginVideoBtn"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0240
        L_0x023b:
            android.widget.Button r1 = r14.f284359H
            r14.mo135743S8(r1, r3)
        L_0x0240:
            boolean r0 = r0.mo100972K3()
            if (r0 == 0) goto L_0x024b
            android.widget.Button r0 = r14.f284359H
            r14.mo135743S8(r0, r3)
        L_0x024b:
            boolean r0 = r14.f284466s
            if (r0 == 0) goto L_0x0252
            r14.mo135719B8()
        L_0x0252:
            com.tencent.mm.ui.chatting.gallery.h r0 = r14.f284432g
            if (r0 == 0) goto L_0x0267
            com.tencent.mm.storage.f4 r0 = r0.mo135935w()
            if (r0 == 0) goto L_0x0267
            boolean r0 = r0.mo100983V3()
            if (r0 == 0) goto L_0x0267
            android.view.View r0 = r14.f284346C2
            r14.mo135743S8(r0, r4)
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI.mo135761b9():void");
    }

    /* renamed from: c8 */
    public final boolean mo135762c8() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32738b.clicfg_chat_video_scale, false);
    }

    /* renamed from: c9 */
    public void mo135763c9() {
        if (this.f284370K2) {
            if (!(this.f284441j == C97056h.C97067g.video)) {
                this.f284373L2.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            } else if (this.f284371L.getVisibility() != 0) {
                this.f284373L2.startTimer(3000);
            }
        }
    }

    /* renamed from: d8 */
    public final String mo135764d8() {
        String str = this.f284426e;
        return (str == null || str.length() <= 0) ? this.f284423d : this.f284426e;
    }

    /* renamed from: d9 */
    public final void mo135765d9() {
        this.f284378N1.setVisibility(0);
        this.f284380O1.setVisibility(0);
        this.f284383P1.setVisibility(0);
        mo135719B8();
        this.f284387Q1.setRepeatMode(1);
        this.f284387Q1.setRepeatCount(-1);
        this.f284387Q1.start();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 82 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C77407n nVar = this.f284448m1;
        if (nVar != null) {
            nVar.mo107572p();
            this.f284448m1 = null;
        } else {
            int i = this.f284363I1;
            if (i == 0 || i == 2) {
                mo135751W8();
            } else {
                mo135751W8();
            }
        }
        return true;
    }

    /* renamed from: e8 */
    public final String mo135766e8() {
        C97056h hVar = this.f284432g;
        if (hVar == null) {
            return null;
        }
        C72963f4 y = hVar.mo135937y(this.f284488y2);
        if (y == null) {
            y = this.f284432g.mo135935w();
        }
        return C1300x.m1391b(y);
    }

    /* renamed from: e9 */
    public void mo135767e9() {
        this.f284373L2.stopTimer();
    }

    /* renamed from: f8 */
    public final int mo135768f8() {
        return this.f284450n.getCurrentItem();
    }

    /* renamed from: f9 */
    public final void mo135769f9(boolean z) {
        this.f284378N1.setVisibility(8);
        this.f284380O1.setVisibility(8);
        this.f284383P1.setVisibility(8);
        if (!z) {
            mo135763c9();
            mo135753X8(false);
        }
        this.f284387Q1.setRepeatMode(1);
        this.f284387Q1.setRepeatCount(0);
        this.f284387Q1.end();
    }

    public void finish() {
        this.f284388Q2.clear();
        super.finish();
    }

    public void finishAfterTransition() {
        if (getIntent().getBooleanExtra("img_gallery_enter_use_share_element_anim", false)) {
            super.finishAfterTransition();
        } else {
            finish();
        }
    }

    /* renamed from: g8 */
    public final View mo135770g8(C97056h hVar, MMViewPager mMViewPager) {
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(hVar == null);
        objArr[1] = Boolean.valueOf(mMViewPager == null);
        Log.m105919d("MicroMsg.ImageGalleryUI", "get current view adapter is null %b, gallery is null %b", objArr);
        if (hVar == null || mMViewPager == null) {
            Log.m105929w("MicroMsg.ImageGalleryUI", "%d get current view but adapter or gallery is null", Integer.valueOf(hashCode()));
            return null;
        } else if (hVar.mo135935w() == null) {
            return null;
        } else {
            if (hVar.mo135935w().mo100979R3() || hVar.mo135935w().mo100961A3()) {
                MultiTouchImageView c = hVar.mo129059c(mMViewPager.getCurrentItem(), true);
                return c == null ? hVar.mo129061f(mMViewPager.getCurrentItem(), true) : c;
            } else if (hVar.mo135935w().mo100994f4() || hVar.mo135935w().mo100989b4() || hVar.mo135935w().mo100983V3()) {
                int currentItem = mMViewPager.getCurrentItem();
                View e = hVar.mo139420e(currentItem);
                if (e == null) {
                    Log.m105921e("MicroMsg.ImageGalleryAdapter", "position : %s getVideoViewByPosition is null", Integer.valueOf(currentItem));
                    return null;
                }
                View findViewById = e.findViewById(C0966R.C0970id.f359487l52);
                if (findViewById == null) {
                    findViewById = e.findViewById(C0966R.C0970id.f359485l50);
                }
                if (findViewById == null || findViewById.getVisibility() == 8) {
                    return null;
                }
                return findViewById;
            } else if (hVar.mo135935w().mo101016t3()) {
                return hVar.mo139420e(mMViewPager.getCurrentItem());
            } else {
                return null;
            }
        }
    }

    /* renamed from: g9 */
    public final void mo135771g9() {
        if (this.f284432g != null) {
            int f8 = mo135768f8();
            if (this.f284397T0) {
                this.f284432g.f284719o.mo135878i(f8);
            }
            int i = f8 - 1;
            int i2 = f8 + 1;
            View e = this.f284432g.mo139420e(i);
            if (!(!(e instanceof View) || e.getTag() == null || ((C97087m1) e.getTag()).f284824G == null)) {
                this.f284432g.f284719o.mo135878i(i);
            }
            View e2 = this.f284432g.mo139420e(i2);
            if ((e2 instanceof View) && e2.getTag() != null && ((C97087m1) e2.getTag()).f284824G != null) {
                this.f284432g.f284719o.mo135878i(i2);
            }
        }
    }

    public int getForceOrientation() {
        return 2;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359830b02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0159, code lost:
        return;
     */
    /* renamed from: h9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo135772h9(int r10, com.tencent.p014mm.storage.C72963f4 r11, boolean r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            r9.mo135760b8(r10, r11)     // Catch:{ all -> 0x015a }
            com.tencent.mm.ui.chatting.gallery.h$g r10 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124949B(r11)     // Catch:{ all -> 0x015a }
            r9.f284441j = r10     // Catch:{ all -> 0x015a }
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L_0x0016
            boolean r1 = r11.mo101016t3()     // Catch:{ all -> 0x015a }
            if (r1 == 0) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r9.f284397T0 = r1     // Catch:{ all -> 0x015a }
            java.lang.String r1 = "MicroMsg.ImageGalleryUI"
            java.lang.String r2 = "updateFooterInfo currGalleryType: %s, pageChanged: %b"
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x015a }
            com.tencent.mm.ui.chatting.gallery.h$g r5 = r9.f284441j     // Catch:{ all -> 0x015a }
            r4[r0] = r5     // Catch:{ all -> 0x015a }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x015a }
            r4[r10] = r5     // Catch:{ all -> 0x015a }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)     // Catch:{ all -> 0x015a }
            com.tencent.mm.ui.chatting.gallery.v r1 = com.tencent.p014mm.p136ui.chatting.gallery.C73708v.C73710b.f216437a     // Catch:{ all -> 0x015a }
            boolean r2 = r1.f216435b     // Catch:{ all -> 0x015a }
            if (r2 == 0) goto L_0x003f
            android.widget.CheckBox r2 = r9.f284440i2     // Catch:{ all -> 0x015a }
            if (r2 == 0) goto L_0x003f
            boolean r1 = r1.mo102780d(r11)     // Catch:{ all -> 0x015a }
            r2.setChecked(r1)     // Catch:{ all -> 0x015a }
        L_0x003f:
            com.tencent.mm.ui.chatting.gallery.h$g r1 = r9.f284441j     // Catch:{ all -> 0x015a }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x015a }
            r2 = 3
            r4 = 4
            if (r1 == r10) goto L_0x00c7
            if (r1 == r3) goto L_0x0074
            if (r1 == r2) goto L_0x005c
            if (r1 == r4) goto L_0x0054
            r9.mo135753X8(r12)     // Catch:{ all -> 0x015a }
            goto L_0x0158
        L_0x0054:
            r9.mo135722E8()     // Catch:{ all -> 0x015a }
            r9.mo135753X8(r12)     // Catch:{ all -> 0x015a }
            goto L_0x0158
        L_0x005c:
            r9.mo135722E8()     // Catch:{ all -> 0x015a }
            r9.mo135753X8(r12)     // Catch:{ all -> 0x015a }
            android.view.View r10 = r9.f284414Z     // Catch:{ all -> 0x015a }
            r9.mo135743S8(r10, r4)     // Catch:{ all -> 0x015a }
            com.tencent.mm.ui.chatting.gallery.h r10 = r9.f284432g     // Catch:{ all -> 0x015a }
            com.tencent.mm.ui.base.MMViewPager r11 = r9.f284450n     // Catch:{ all -> 0x015a }
            int r11 = r11.getCurrentItem()     // Catch:{ all -> 0x015a }
            r10.mo135917L(r11)     // Catch:{ all -> 0x015a }
            goto L_0x0158
        L_0x0074:
            android.view.View r1 = r9.f284414Z     // Catch:{ all -> 0x015a }
            r9.mo135743S8(r1, r4)     // Catch:{ all -> 0x015a }
            r9.mo135741R8(r10)     // Catch:{ all -> 0x015a }
            hd0.n0 r10 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124927o(r11)     // Catch:{ all -> 0x015a }
            if (r10 != 0) goto L_0x0084
            monitor-exit(r9)
            return
        L_0x0084:
            r9.mo135781o8()     // Catch:{ all -> 0x015a }
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar r11 = r9.f284400U0     // Catch:{ all -> 0x015a }
            int r10 = r10.f288566m     // Catch:{ all -> 0x015a }
            r11.setVideoTotalTime(r10)     // Catch:{ all -> 0x015a }
            com.tencent.mm.ui.chatting.gallery.h r10 = r9.f284432g     // Catch:{ Exception -> 0x00b0 }
            com.tencent.mm.ui.chatting.gallery.m1 r10 = r10.mo135934v()     // Catch:{ Exception -> 0x00b0 }
            if (r10 == 0) goto L_0x00ba
            com.tencent.mm.ui.chatting.gallery.h r10 = r9.f284432g     // Catch:{ Exception -> 0x00b0 }
            com.tencent.mm.ui.chatting.gallery.m1 r10 = r10.mo135934v()     // Catch:{ Exception -> 0x00b0 }
            com.tencent.mm.pluginsdk.ui.tools.r0 r10 = r10.f284849p     // Catch:{ Exception -> 0x00b0 }
            if (r10 == 0) goto L_0x00ba
            com.tencent.mm.ui.chatting.gallery.h r10 = r9.f284432g     // Catch:{ Exception -> 0x00b0 }
            com.tencent.mm.ui.chatting.gallery.m1 r10 = r10.mo135934v()     // Catch:{ Exception -> 0x00b0 }
            com.tencent.mm.pluginsdk.ui.tools.r0 r10 = r10.f284849p     // Catch:{ Exception -> 0x00b0 }
            int r10 = r10.getCurrentPosition()     // Catch:{ Exception -> 0x00b0 }
            int r10 = r10 / 1000
            r0 = r10
            goto L_0x00ba
        L_0x00b0:
            r10 = move-exception
            java.lang.String r11 = "MicroMsg.ImageGalleryUI"
            java.lang.String r1 = ""
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x015a }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r10, r1, r2)     // Catch:{ all -> 0x015a }
        L_0x00ba:
            r9.mo135781o8()     // Catch:{ all -> 0x015a }
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar r10 = r9.f284400U0     // Catch:{ all -> 0x015a }
            r10.seek(r0)     // Catch:{ all -> 0x015a }
            r9.mo135753X8(r12)     // Catch:{ all -> 0x015a }
            goto L_0x0158
        L_0x00c7:
            com.tencent.mm.ui.chatting.gallery.h r1 = r9.f284432g     // Catch:{ all -> 0x015a }
            com.tencent.mm.modelimage.k r1 = r1.mo135936x(r11, r0)     // Catch:{ all -> 0x015a }
            r9.mo135722E8()     // Catch:{ all -> 0x015a }
            r9.mo135753X8(r12)     // Catch:{ all -> 0x015a }
            if (r1 != 0) goto L_0x00df
            java.lang.String r10 = "MicroMsg.ImageGalleryUI"
            java.lang.String r11 = "updateFooterInfo img info is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r11)     // Catch:{ all -> 0x015a }
            monitor-exit(r9)
            return
        L_0x00df:
            boolean r12 = r9.f284436h1     // Catch:{ all -> 0x015a }
            if (r12 == 0) goto L_0x011c
            boolean r12 = r1.mo127146q()     // Catch:{ all -> 0x015a }
            if (r12 == 0) goto L_0x011c
            com.tencent.mm.ui.chatting.gallery.h r12 = r9.f284432g     // Catch:{ all -> 0x015a }
            com.tencent.mm.storage.f4 r12 = r12.mo135935w()     // Catch:{ all -> 0x015a }
            if (r12 == 0) goto L_0x011c
            long r5 = r11.getMsgId()     // Catch:{ all -> 0x015a }
            com.tencent.mm.ui.chatting.gallery.h r12 = r9.f284432g     // Catch:{ all -> 0x015a }
            com.tencent.mm.storage.f4 r12 = r12.mo135935w()     // Catch:{ all -> 0x015a }
            long r7 = r12.getMsgId()     // Catch:{ all -> 0x015a }
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x011c
            java.lang.String r12 = "MicroMsg.ImageGalleryUI"
            java.lang.String r1 = "get image successfully! -> gotoPhotoEditUI msgId:%s"
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x015a }
            long r2 = r11.getMsgId()     // Catch:{ all -> 0x015a }
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x015a }
            r10[r0] = r11     // Catch:{ all -> 0x015a }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r10)     // Catch:{ all -> 0x015a }
            r9.mo135791w8()     // Catch:{ all -> 0x015a }
            r9.f284436h1 = r0     // Catch:{ all -> 0x015a }
            goto L_0x0158
        L_0x011c:
            com.tencent.mm.ui.chatting.gallery.h r12 = r9.f284432g     // Catch:{ all -> 0x015a }
            com.tencent.mm.storage.f4 r12 = r12.mo135935w()     // Catch:{ all -> 0x015a }
            java.lang.String r5 = "MicroMsg.ImageGalleryUI"
            java.lang.String r6 = "isSoonEnterPhotoEdit:%s msgId:%s curMsgId:%s getCompleted:%s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x015a }
            boolean r7 = r9.f284436h1     // Catch:{ all -> 0x015a }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x015a }
            r4[r0] = r7     // Catch:{ all -> 0x015a }
            long r7 = r11.getMsgId()     // Catch:{ all -> 0x015a }
            java.lang.Long r11 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x015a }
            r4[r10] = r11     // Catch:{ all -> 0x015a }
            if (r12 != 0) goto L_0x0141
            java.lang.String r10 = "null"
            goto L_0x0149
        L_0x0141:
            long r10 = r12.getMsgId()     // Catch:{ all -> 0x015a }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x015a }
        L_0x0149:
            r4[r3] = r10     // Catch:{ all -> 0x015a }
            boolean r10 = r1.mo127146q()     // Catch:{ all -> 0x015a }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x015a }
            r4[r2] = r10     // Catch:{ all -> 0x015a }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r6, r4)     // Catch:{ all -> 0x015a }
        L_0x0158:
            monitor-exit(r9)
            return
        L_0x015a:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI.mo135772h9(int, com.tencent.mm.storage.f4, boolean):void");
    }

    /* renamed from: i8 */
    public int mo135773i8(long j) {
        if (Util.isNullOrNil(this.f284372L1)) {
            return 0;
        }
        try {
            int x = C98429r0.m127833x(j, this.f284372L1, -1);
            if (x == -1) {
                this.f284372L1 = null;
                x = 0;
            }
            Log.m105919d("MicroMsg.ImageGalleryUI", "get enter video op code %d %s", Integer.valueOf(x), this.f284372L1);
            return x;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.ImageGalleryUI", "get enter video op code error : " + e.toString());
            return 0;
        }
    }

    /* renamed from: i9 */
    public final void mo135774i9(int i) {
        C72963f4 y = this.f284432g.mo135937y(i);
        if (y != null && y.mo100983V3() && !this.f284339A1) {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101123jo(new C75875l.C45886e(y.mo108768t(), "update", y, 0));
        }
    }

    public void initView() {
        C72963f4 f4Var;
        this.f284442j1 = new C45059m0(getContext());
        this.f284487y1 = false;
        this.f284423d = getIntent().getStringExtra("img_gallery_talker");
        this.f284476v1 = getIntent().getBooleanExtra("img_gallery_enter_from_grid", false);
        this.f284479w1 = getIntent().getBooleanExtra("img_gallery_enter_from_chatting_ui", false);
        this.f284490z1 = getIntent().getBooleanExtra("img_gallery_enter_from_appbrand_service_chatting_ui", false);
        this.f284444k1 = getIntent().getBooleanExtra("show_search_chat_content_result", false);
        this.f284473u1 = getIntent().getBooleanExtra("show_enter_grid", true);
        this.f284446l1 = getIntent().getBooleanExtra("key_is_biz_chat", false);
        this.f284435h = getIntent().getLongExtra("key_biz_chat_id", -1);
        this.f284466s = getIntent().getBooleanExtra("img_preview_only", false);
        this.f284345C1 = getIntent().getIntExtra("img_gallery_enter_from_scene", 0);
        getIntent().getIntExtra("album_enter_from_scene", -1);
        if (!this.f284466s && Util.isNullOrNil(this.f284423d)) {
            Log.m105920e("MicroMsg.ImageGalleryUI", " initView, talker is null. intent: " + getIntent());
        }
        this.f284426e = getIntent().getStringExtra("img_gallery_chatroom_name");
        this.f284483x1 = getIntent().getBooleanExtra("img_gallery_back_from_grid", false);
        this.f284372L1 = getIntent().getStringExtra("img_gallery_enter_video_opcode");
        boolean booleanExtra = getIntent().getBooleanExtra("img_gallery_is_restransmit_after_download", false);
        String stringExtra = getIntent().getStringExtra("img_gallery_directly_send_name");
        this.f284429f = !Util.isNullOrNil(this.f284426e) || C72996z1.m85820U5(this.f284423d);
        this.f284380O1 = (ImageView) findViewById(C0966R.C0970id.j25);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f359121j23);
        this.f284383P1 = imageView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.bottomMargin += C75044y4.m89991c(this);
        this.f284383P1.setLayoutParams(layoutParams);
        this.f284383P1.setOnClickListener(new ImageGalleryUI$$g(this));
        this.f284378N1 = (ImageView) findViewById(C0966R.C0970id.j26);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f284387Q1 = ofFloat;
        ofFloat.setDuration(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        this.f284387Q1.addListener(new C73713y(this));
        this.f284387Q1.addUpdateListener(new C73714z(this, getWindowManager().getDefaultDisplay().getHeight()));
        this.f284369K1 = getIntent().getLongExtra("img_gallery_msg_id", 0);
        this.f284339A1 = getIntent().getBooleanExtra("img_gallery_is_mp_video_without_msg", false);
        this.f284342B1 = getIntent().getIntExtra("img_gallery_mp_video_click_from", 2);
        long longExtra = getIntent().getLongExtra("img_gallery_msg_svr_id", 0);
        if (!this.f284339A1) {
            int i = (this.f284369K1 > 0 ? 1 : (this.f284369K1 == 0 ? 0 : -1));
            if (i > 0 || longExtra != 0) {
                if (i == 0) {
                    this.f284369K1 = ((C72972g4) C97625j3.m125812b().mo105911z()).h30(mo135764d8(), longExtra).getMsgId();
                }
                f4Var = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f284369K1);
                if (f4Var.getMsgId() <= 0) {
                    Log.m105920e("MicroMsg.ImageGalleryUI", " initView, msgId is invalid, msgId = " + this.f284369K1 + ", msgSvrId = " + longExtra + ", stack = " + Util.getStack());
                    finish();
                    return;
                } else if (f4Var.mo100994f4()) {
                    C98442x0 b = C98442x0.f288734i.mo137781b(f4Var.mo108775z2());
                    this.f284374M = b != null && b.f288738b;
                }
            } else {
                Log.m105920e("MicroMsg.ImageGalleryUI", " initView, msgId is invalid, msgId = " + this.f284369K1 + ", msgSvrId = " + longExtra + ", stack = " + Util.getStack());
                finish();
                return;
            }
        } else {
            f4Var = C97052g.m124925m(this.f284423d, this);
        }
        C72963f4 f4Var2 = f4Var;
        this.f284375M1 = mo135773i8(this.f284369K1) == 3;
        if (C61104a.m71668x()) {
            this.f284375M1 = true;
        }
        C97056h hVar = r0;
        String str = "MicroMsg.ImageGalleryUI";
        C97056h hVar2 = new C97056h(this, this.f284369K1, mo135764d8(), this.f284446l1, this.f284435h, booleanExtra, stringExtra, Boolean.valueOf(this.f284483x1), this.f284439i1);
        this.f284432g = hVar;
        hVar.f284717j = getIntent().getBooleanExtra("start_chatting_ui", true);
        C97056h hVar3 = this.f284432g;
        hVar3.f284722r = new ImageGalleryUI$$h(this);
        C97122r1 r1Var = this.f284413Y1;
        C97100o oVar = hVar3.f284719o;
        if (oVar != null) {
            oVar.f284886f = r1Var;
        }
        Class cls = C32735h.class;
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_chat_image_button_disable, 0);
        C98135d.f287725a = Qe == 0;
        boolean tB = ((C101980n) C86312j.m106911c(C101980n.class)).mo134693tB();
        C98135d.f287726b = tB;
        C98135d.f287727c = tB;
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_chat_image_show_search_bubble_enable, 0);
        C98135d.f287728d = C98135d.f287726b && (Qe2 == 1 || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED);
        Log.m105925i("MicroMsg.ImageScanCodeConfigManager", "ImageScanCodeConfigManager init config: %d, showScanCodeButton: %b, openImageSearch: %b, showSearchButton: %b, showSearchBubbleConfig: %d, showSearchBubble: %b", Integer.valueOf(Qe), Boolean.valueOf(C98135d.f287725a), Boolean.valueOf(C98135d.f287726b), Boolean.valueOf(C98135d.f287727c), Integer.valueOf(Qe2), Boolean.valueOf(C98135d.f287728d));
        this.f284458p1 = new ImageScanCodeManager(this, !this.f284466s);
        this.f284461q1 = new C98140g();
        this.f284454o1 = C98135d.f287725a && mo135723F8();
        String str2 = str;
        Log.m105925i(str2, "initScanCode isPreviewOnly: %b, canShowScanCodeButton: %b, isEnterFromChattingUI: %b, isEnterFromGrid: %b", Boolean.valueOf(this.f284466s), Boolean.valueOf(this.f284454o1), Boolean.valueOf(this.f284479w1), Boolean.valueOf(this.f284476v1));
        this.f284481x = 0;
        this.f284485y = getResources().getDimensionPixelSize(C0966R.dimen.f4268y4);
        this.f284489z = getResources().getDimensionPixelSize(C0966R.dimen.f4267y3);
        this.f284456p = (RelativeLayout) findViewById(C0966R.C0970id.bx4);
        this.f284460q = (RelativeLayout) findViewById(C0966R.C0970id.bx9);
        this.f284456p.setOnClickListener(new ImageGalleryUI$$i(this));
        View findViewById = this.f284460q.findViewById(C0966R.C0970id.cws);
        this.f284386Q0 = findViewById;
        findViewById.setOnClickListener(new ImageGalleryUI$$j(this));
        this.f284390R0 = (FrameLayout) this.f284460q.findViewById(C0966R.C0970id.f5772o8);
        this.f284394S0 = (TextView) this.f284460q.findViewById(C0966R.C0970id.f357453cx1);
        Button button = (Button) findViewById(C0966R.C0970id.m8t);
        this.f284359H = button;
        button.setOnClickListener(this);
        Bitmap a = C87515a.m108831a(getResources(), C0966R.raw.icons_filled_error, 0.0f);
        Rect rect = new Rect(0, 0, C76577a.m92155f(this, C0966R.dimen.f3738cr), C76577a.m92155f(this, C0966R.dimen.f3738cr));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        if (a != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), a);
            this.f284356G = bitmapDrawable;
            bitmapDrawable.setBounds(rect);
            this.f284356G.mutate().setColorFilter(porterDuffColorFilter);
        }
        Button button2 = (Button) findViewById(C0966R.C0970id.m8w);
        this.f284362I = button2;
        button2.setOnClickListener(this);
        Bitmap a2 = C87515a.m108831a(getResources(), C0966R.raw.icons_filled_close, 0.0f);
        if (a2 != null) {
            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(getResources(), a2);
            bitmapDrawable2.setBounds(rect);
            bitmapDrawable2.mutate().setColorFilter(porterDuffColorFilter);
            this.f284362I.setGravity(16);
            this.f284362I.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, bitmapDrawable2, (Drawable) null);
        }
        this.f284365J = findViewById(C0966R.C0970id.m8v);
        this.f284368K = (TextView) findViewById(C0966R.C0970id.m8x);
        ((TextView) findViewById(C0966R.C0970id.m8u)).getPaint().setFakeBoldText(true);
        this.f284359H.getPaint().setFakeBoldText(true);
        this.f284362I.getPaint().setFakeBoldText(true);
        float min = Math.min(1.125f, C76577a.m92165p(this)) * 12.0f;
        this.f284359H.setTextSize(1, min);
        this.f284362I.setTextSize(1, min);
        View findViewById2 = findViewById(C0966R.C0970id.l4y);
        this.f284353F = findViewById2;
        findViewById2.setOnClickListener(this);
        this.f284371L = (FullScreenStatusMaskView) findViewById(C0966R.C0970id.m5q);
        this.f284382P = findViewById(C0966R.C0970id.l6v);
        this.f284389R = findViewById(C0966R.C0970id.eht);
        this.f284393S = (TextView) findViewById(C0966R.C0970id.m3p);
        if (this.f284374M) {
            mo135755Y8((String) null);
            this.f284353F.addOnLayoutChangeListener(new ImageGalleryUI$$b(this));
        }
        if (mo135728K8(this)) {
            View decorView = getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new C97082l0(this, decorView));
        } else {
            View decorView2 = getWindow().getDecorView();
            decorView2.getViewTreeObserver().addOnGlobalLayoutListener(new C97086m0(this, decorView2));
        }
        this.f284409X0 = new TouchMediaPreviewLayout(getContext());
        this.f284406W0 = (ImageView) findViewById(C0966R.C0970id.ehi);
        MMViewPager mMViewPager = (MMViewPager) findViewById(C0966R.C0970id.ehh);
        this.f284450n = mMViewPager;
        mMViewPager.setVerticalFadingEdgeEnabled(false);
        this.f284450n.setHorizontalFadingEdgeEnabled(false);
        this.f284450n.setSingleClickOverListener(new ImageGalleryUI$$k(this));
        this.f284450n.setDoubleClickListener(new ImageGalleryUI$$l(this));
        if (mo135725H8()) {
            mo135720C8();
            this.f284406W0.setVisibility(8);
        } else if (!this.f284466s) {
            this.f284450n.setOnPageChangeListener(this.f284343B2);
            if (!mo135762c8()) {
                this.f284450n.setLongClickOverListener(new ImageGalleryUI$$m(this));
            }
        } else {
            mo135720C8();
        }
        this.f284450n.setOffscreenPageLimit(1);
        this.f284450n.setAdapter(this.f284432g);
        int i2 = C97056h.C97063f.f284741p;
        mo135772h9(i2, this.f284432g.mo135937y(i2), false);
        this.f284450n.setCurrentItem(C97056h.C97063f.f284741p);
        this.f284450n.postDelayed(new ImageGalleryUI$$n(this), 0);
        if (C73708v.C73710b.f216437a.f216435b) {
            View inflate = ((ViewStub) findViewById(C0966R.C0970id.ja9)).inflate();
            this.f284437h2 = inflate;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(inflate, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(inflate, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f284440i2 = (CheckBox) this.f284437h2.findViewById(C0966R.C0970id.gpy);
            this.f284443j2 = this.f284437h2.findViewById(C0966R.C0970id.gpz);
        }
        this.f284436h1 = getIntent().getBooleanExtra("img_gallery_enter_PhotoEditUI", false);
        C92836k x = this.f284432g.mo135936x(f4Var2, true);
        if (x == null) {
            Log.m105921e(str2, "[initView] imgInfo is null!!! isSoonEnterPhotoEdit:%s", Boolean.valueOf(this.f284436h1));
        }
        if (this.f284436h1 && x != null && x.mo127146q()) {
            mo135791w8();
            this.f284436h1 = false;
        } else if (this.f284436h1) {
            Log.m105928w(str2, "img not GetCompleted!");
        }
        this.f284450n.setOnTouchListener(new ImageGalleryUI$$o(this));
        if (mo135762c8()) {
            this.f284409X0.mo153909c(getContentView());
            this.f284409X0.setScaleListener(new ImageGalleryUI$$p(this));
            this.f284409X0.setDoubleTapListener(new ImageGalleryUI$$q(this));
        }
        mo135734O7();
    }

    /* renamed from: j8 */
    public final C46897s.C46898a mo135775j8(String str) {
        if (!Util.isNullOrNil(this.f284426e) || C72996z1.m85820U5(this.f284423d)) {
            String str2 = Util.isNullOrNil(this.f284426e) ? this.f284423d : this.f284426e;
            String str3 = this.f284423d;
            C46897s.C46898a aVar = new C46897s.C46898a(str);
            aVar.f126106b = 2;
            aVar.f126107c = str2;
            aVar.f126109e = str3;
            return aVar;
        }
        String str4 = this.f284423d;
        C46897s.C46898a aVar2 = new C46897s.C46898a(str);
        aVar2.f126106b = 1;
        aVar2.f126107c = str4;
        aVar2.f126109e = str4;
        return aVar2;
    }

    /* renamed from: j9 */
    public final void mo135776j9(int i, boolean z, boolean z2) {
        C77407n nVar;
        if (z) {
            boolean z3 = i >= C30391y.f81991c;
            int i2 = 3;
            if (this.f284461q1.mo137424d(1, 2) == 5) {
                this.f284461q1.mo137429i(1, 3);
                mo135738Q7(1, false);
                return;
            }
            C98140g gVar = this.f284461q1;
            if (z3) {
                i2 = 1;
            }
            gVar.mo137429i(1, i2);
            this.f284461q1.mo137427g(1, new ImageGalleryUI$$r0(this, z3));
            if (!z3) {
                mo135738Q7(1, false);
            }
        } else {
            this.f284461q1.mo137429i(1, 2);
            mo135738Q7(1, false);
        }
        if ((z2 || z) && (nVar = this.f284448m1) != null && nVar.mo107563h()) {
            mo135751W8();
        }
    }

    /* renamed from: k8 */
    public final ImageGalleryUI mo135777k8() {
        if (this.f284385Q == null) {
            this.f284385Q = findViewById(C0966R.C0970id.c9n);
        }
        return this;
    }

    /* renamed from: l8 */
    public final ImageGalleryUI mo135778l8() {
        if (this.f284405W == null) {
            this.f284405W = findViewById(C0966R.C0970id.o8d);
        }
        return this;
    }

    /* renamed from: m8 */
    public final ImageGalleryUI mo135779m8() {
        if (this.f284377N == null) {
            this.f284377N = findViewById(C0966R.C0970id.ck7);
        }
        return this;
    }

    /* renamed from: n8 */
    public final ImageGalleryUI mo135780n8() {
        if (this.f284414Z == null) {
            View findViewById = findViewById(C0966R.C0970id.f4_);
            this.f284414Z = findViewById;
            this.f284457p0 = (Button) findViewById.findViewById(C0966R.C0970id.bx5);
            this.f284482x0 = (Button) this.f284414Z.findViewById(C0966R.C0970id.bx6);
            this.f284486y0 = this.f284414Z.findViewById(C0966R.C0970id.bx7);
            this.f284457p0.getPaint().setFakeBoldText(true);
            this.f284482x0.getPaint().setFakeBoldText(true);
            ((TextView) this.f284414Z.findViewById(C0966R.C0970id.f357814bx1)).getPaint().setFakeBoldText(true);
            float min = Math.min(1.125f, C76577a.m92165p(this)) * 12.0f;
            this.f284457p0.setTextSize(1, min);
            this.f284482x0.setTextSize(1, min);
        }
        return this;
    }

    public boolean noActionBar() {
        return !mo135725H8();
    }

    /* renamed from: o8 */
    public ImageGalleryUI mo135781o8() {
        if (this.f284400U0 == null) {
            this.f284400U0 = (RedesignVideoPlayerSeekBar) findViewById(C0966R.C0970id.l6x);
            this.f284403V0 = findViewById(C0966R.C0970id.kqj);
            this.f284400U0.setPlayBtnOnClickListener(this);
        }
        return this;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C44085t tVar = this.f284438i;
        if (tVar != null) {
            tVar.mo68718a(this, i, i2, intent);
        }
    }

    public void onBackPressed() {
        Log.m105924i("MicroMsg.ImageGalleryUI", "onBackPressed");
        if (!mo135730M7()) {
            mo135790v8();
            if (this.f284408X.getVisibility() == 0) {
                mo135790v8();
                this.f284408X.mo67041d(this.f284391R1.longValue(), this.f284451n1.f287788d);
                return;
            }
            this.f284374M = false;
            this.f284371L.setVisibility(8);
            if (this.f284476v1) {
                mo135754Y7(1);
                return;
            }
            try {
                C73708v vVar = C73708v.C73710b.f216437a;
                vVar.f216436c.clear();
                vVar.mo102778b();
                vVar.f216435b = false;
                mo135735O8();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.ImageGalleryUI", e.getMessage());
                finish();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x04da, code lost:
        r0 = hd0.C98429r0.m127818i(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r24) {
        /*
            r23 = this;
            r6 = r23
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7 = r24
            r0.add(r7)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r23
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            java.lang.String r8 = "(Landroid/view/View;)V"
            java.lang.String r9 = "onClick"
            java.lang.String r10 = "android/view/View$OnClickListener"
            java.lang.String r11 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI"
            if (r0 != 0) goto L_0x0032
            j20.C117292a.m165361g(r6, r11, r10, r9, r8)
            return
        L_0x0032:
            int r0 = r24.getId()
            r1 = 2131301667(0x7f091523, float:1.8221398E38)
            r2 = 0
            if (r0 != r1) goto L_0x0042
            r6.mo135754Y7(r2)
        L_0x003f:
            r0 = r8
            goto L_0x05cb
        L_0x0042:
            int r0 = r24.getId()
            r1 = 2131316206(0x7f094dee, float:1.8250887E38)
            r3 = 1
            r4 = 0
            r5 = 2
            if (r0 != r1) goto L_0x00ce
            r6.f284472u = r2
            r23.mo135751W8()
            boolean r0 = r6.mo135792x8(r5)
            if (r0 == 0) goto L_0x003f
            gk3.q r0 = r6.f284451n1
            java.util.ArrayList<com.tencent.mm.plugin.scanner.ImageQBarDataBean> r0 = r0.f287785a
            boolean r0 = r6.mo135747U8(r0)
            if (r0 == 0) goto L_0x003f
            gk3.q r0 = r6.f284451n1
            java.util.ArrayList<com.tencent.mm.plugin.scanner.ImageQBarDataBean> r0 = r0.f287785a
            int r0 = r0.size()
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r0 != r3) goto L_0x008f
            gk3.q r0 = r6.f284451n1
            java.util.ArrayList<com.tencent.mm.plugin.scanner.ImageQBarDataBean> r0 = r0.f287785a
            java.lang.Object r0 = r0.get(r2)
            com.tencent.mm.plugin.scanner.ImageQBarDataBean r0 = (com.tencent.p014mm.plugin.scanner.ImageQBarDataBean) r0
            gk3.q r1 = r6.f284451n1
            r1.f287787c = r0
            r1.f287786b = r4
            lx.z r1 = r6.f284401U1
            int r2 = r0.f273114e
            java.lang.String r0 = r0.f273113d
            lx.s$a r0 = r6.mo135775j8(r0)
            com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic r1 = (com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic) r1
            r1.mo67079j(r2, r0, r12)
            goto L_0x003f
        L_0x008f:
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            com.tencent.mm.ui.base.MMViewPager r1 = r6.f284450n
            android.view.View r0 = r6.mo135770g8(r0, r1)
            gk3.q r1 = r6.f284451n1
            java.util.ArrayList<com.tencent.mm.plugin.scanner.ImageQBarDataBean> r1 = r1.f287785a
            rx3.l r0 = com.tencent.p014mm.plugin.scanner.C94468m.m119493a(r6, r0, r1, r2)
            A r0 = r0.f38555d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r1 != r3) goto L_0x00c6
            java.lang.Object r0 = r0.get(r2)
            com.tencent.mm.plugin.scanner.ImageQBarDataBean r0 = (com.tencent.p014mm.plugin.scanner.ImageQBarDataBean) r0
            gk3.q r1 = r6.f284451n1
            r1.f287786b = r0
            r1.f287787c = r0
            lx.z r1 = r6.f284401U1
            int r2 = r0.f273114e
            java.lang.String r0 = r0.f273113d
            lx.s$a r0 = r6.mo135775j8(r0)
            com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic r1 = (com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic) r1
            r1.mo67079j(r2, r0, r12)
            goto L_0x003f
        L_0x00c6:
            gk3.q r0 = r6.f284451n1
            r0.f287786b = r4
            r0.f287787c = r4
            goto L_0x003f
        L_0x00ce:
            int r0 = r24.getId()
            r1 = 2131301154(0x7f091322, float:1.8220358E38)
            if (r0 != r1) goto L_0x0139
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.tencent.mm.ui.base.MMViewPager r1 = r6.f284450n
            int r1 = r1.getCurrentItem()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "MicroMsg.ImageGalleryUI"
            java.lang.String r4 = "[oreh download_and_save] hdImg suc, curPos:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r0)
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            com.tencent.mm.ui.base.MMViewPager r1 = r6.f284450n
            int r1 = r1.getCurrentItem()
            com.tencent.mm.storage.f4 r0 = r0.mo135937y(r1)
            com.tencent.mm.ui.chatting.gallery.h r1 = r6.f284432g
            com.tencent.mm.modelimage.k r1 = r1.mo135936x(r0, r2)
            com.tencent.mm.ui.base.MMViewPager r2 = r6.f284450n
            int r2 = r2.getCurrentItem()
            boolean r2 = r6.mo135793y8(r2, r0, r1)
            if (r2 == 0) goto L_0x0126
            boolean r0 = r0.mo100972K3()
            if (r0 != 0) goto L_0x0126
            boolean r0 = r1.mo127146q()
            if (r0 == 0) goto L_0x0126
            boolean r0 = r23.mo135724G8()
            if (r0 != 0) goto L_0x0126
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            int r1 = r23.mo135768f8()
            r0.mo135922Q(r1, r3)
            goto L_0x0133
        L_0x0126:
            androidx.appcompat.app.AppCompatActivity r0 = r23.getContext()
            com.tencent.mm.ui.chatting.gallery.h r1 = r6.f284432g
            com.tencent.mm.storage.f4 r1 = r1.mo135935w()
            com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124958l(r0, r1, r3)
        L_0x0133:
            r0 = 7
            r6.mo135736P7(r0)
            goto L_0x003f
        L_0x0139:
            int r0 = r24.getId()
            r1 = 2131300604(0x7f0910fc, float:1.8219242E38)
            if (r0 != r1) goto L_0x0153
            r6.f284363I1 = r5
            r6.f284351E1 = r2
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            com.tencent.mm.ui.base.MMViewPager r1 = r6.f284450n
            int r1 = r1.getCurrentItem()
            r0.mo135922Q(r1, r2)
            goto L_0x003f
        L_0x0153:
            int r0 = r24.getId()
            r1 = 2131300605(0x7f0910fd, float:1.8219244E38)
            if (r0 != r1) goto L_0x0235
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            int r1 = r23.mo135768f8()
            com.tencent.mm.storage.f4 r1 = r0.mo135937y(r1)
            if (r1 == 0) goto L_0x0226
            boolean r5 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124953H(r1)
            if (r5 != 0) goto L_0x0170
            goto L_0x0226
        L_0x0170:
            com.tencent.mm.ui.chatting.gallery.o r0 = r0.f284719o
            r0.getClass()
            java.lang.Class<gt.k> r5 = p158gt.C98201k.class
            com.tencent.mm.modelimage.k r7 = com.tencent.p014mm.p136ui.chatting.gallery.C97100o.m125011p(r1)
            if (r7 == 0) goto L_0x0226
            com.tencent.mm.ui.chatting.gallery.h r12 = r0.f284638d
            if (r12 == 0) goto L_0x0186
            com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct$a r13 = com.tencent.p014mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct.C92612a.cancel
            r12.mo135920O(r1, r4, r3, r13)
        L_0x0186:
            com.tencent.mm.ui.chatting.gallery.o1 r3 = com.tencent.p014mm.p136ui.chatting.gallery.C97108o1.m125035a()
            long r12 = r1.getMsgId()
            java.util.HashSet<java.lang.Long> r3 = r3.f284914d
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x01e9
            com.tencent.mm.ui.chatting.gallery.o1 r0 = com.tencent.p014mm.p136ui.chatting.gallery.C97108o1.m125035a()
            java.util.HashSet<java.lang.Long> r3 = r0.f284914d
            long r12 = r1.getMsgId()
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            r3.remove(r4)
            di3.d r3 = di3.C86312j.m106911c(r5)
            gt.k r3 = (p158gt.C98201k) r3
            gt.j r3 = r3.Jp0()
            long r13 = r7.f267374a
            long r15 = r1.getMsgId()
            r22 = 1
            r12 = r3
            com.tencent.mm.modelimage.e r12 = (com.tencent.p014mm.modelimage.C92822e) r12
            r17 = 1
            r18 = r0
            r12.mo127104f(r13, r15, r17, r18)
            di3.d r0 = di3.C86312j.m106911c(r5)
            gt.k r0 = (p158gt.C98201k) r0
            gt.j r0 = r0.Jp0()
            long r3 = r7.f267374a
            long r20 = r1.getMsgId()
            com.tencent.mm.modelimage.e r0 = (com.tencent.p014mm.modelimage.C92822e) r0
            r0.getClass()
            com.tencent.mm.modelimage.e$a r1 = new com.tencent.mm.modelimage.e$a
            r17 = r1
            r18 = r3
            r17.<init>(r18, r20, r22)
            r0.mo127103e(r1)
            goto L_0x0226
        L_0x01e9:
            di3.d r3 = di3.C86312j.m106911c(r5)
            gt.k r3 = (p158gt.C98201k) r3
            gt.j r3 = r3.Jp0()
            long r13 = r7.f267374a
            long r15 = r1.getMsgId()
            r22 = 1
            r12 = r3
            com.tencent.mm.modelimage.e r12 = (com.tencent.p014mm.modelimage.C92822e) r12
            r17 = 1
            r18 = r0
            r12.mo127104f(r13, r15, r17, r18)
            di3.d r0 = di3.C86312j.m106911c(r5)
            gt.k r0 = (p158gt.C98201k) r0
            gt.j r0 = r0.Jp0()
            long r3 = r7.f267374a
            long r20 = r1.getMsgId()
            com.tencent.mm.modelimage.e r0 = (com.tencent.p014mm.modelimage.C92822e) r0
            r0.getClass()
            com.tencent.mm.modelimage.e$a r1 = new com.tencent.mm.modelimage.e$a
            r17 = r1
            r18 = r3
            r17.<init>(r18, r20, r22)
            r0.mo127103e(r1)
        L_0x0226:
            int r0 = r23.mo135768f8()
            com.tencent.mm.ui.chatting.gallery.h r1 = r6.f284432g
            com.tencent.mm.storage.f4 r1 = r1.mo135937y(r0)
            r6.mo135772h9(r0, r1, r2)
            goto L_0x003f
        L_0x0235:
            int r0 = r24.getId()
            r1 = 2131296530(0x7f090112, float:1.821098E38)
            if (r0 != r1) goto L_0x0243
            r23.onBackPressed()
            goto L_0x003f
        L_0x0243:
            int r0 = r24.getId()
            r1 = 2131316139(0x7f094dab, float:1.8250751E38)
            if (r0 != r1) goto L_0x0251
            r23.onBackPressed()
            goto L_0x003f
        L_0x0251:
            int r0 = r24.getId()
            r1 = 2131309063(0x7f093207, float:1.82364E38)
            if (r0 != r1) goto L_0x02b2
            android.widget.CheckBox r0 = r6.f284440i2
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x028a
            com.tencent.mm.ui.chatting.gallery.v r1 = com.tencent.p014mm.p136ui.chatting.gallery.C73708v.C73710b.f216437a
            int r1 = r1.mo102782f()
            r4 = 9
            if (r1 < r4) goto L_0x028a
            android.content.res.Resources r0 = r23.getResources()
            r1 = 2131830640(0x7f112770, float:1.9294283E38)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r2] = r4
            java.lang.String r0 = r0.getString(r1, r5)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r6, (java.lang.CharSequence) r0, (int) r3)
            r0.show()
            j20.C117292a.m165361g(r6, r11, r10, r9, r8)
            return
        L_0x028a:
            android.widget.CheckBox r1 = r6.f284440i2
            r0 = r0 ^ r3
            r1.setChecked(r0)
            android.widget.CheckBox r0 = r6.f284440i2
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x02a5
            com.tencent.mm.ui.chatting.gallery.v r0 = com.tencent.p014mm.p136ui.chatting.gallery.C73708v.C73710b.f216437a
            com.tencent.mm.ui.chatting.gallery.h r1 = r6.f284432g
            com.tencent.mm.storage.f4 r1 = r1.mo135935w()
            r0.mo102777a(r1)
            goto L_0x003f
        L_0x02a5:
            com.tencent.mm.ui.chatting.gallery.v r0 = com.tencent.p014mm.p136ui.chatting.gallery.C73708v.C73710b.f216437a
            com.tencent.mm.ui.chatting.gallery.h r1 = r6.f284432g
            com.tencent.mm.storage.f4 r1 = r1.mo135935w()
            r0.mo102781e(r1)
            goto L_0x003f
        L_0x02b2:
            int r0 = r24.getId()
            r1 = 2131310997(0x7f093995, float:1.8240322E38)
            if (r0 != r1) goto L_0x02d0
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            com.tencent.mm.ui.chatting.gallery.m1 r0 = r0.mo135934v()
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r0.f284849p
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            com.tencent.mm.ui.base.MMViewPager r1 = r6.f284450n
            int r1 = r1.getCurrentItem()
            r0.mo135921P(r1)
            goto L_0x003f
        L_0x02d0:
            int r0 = r24.getId()
            r1 = 2131305343(0x7f09237f, float:1.8228854E38)
            r12 = 3
            if (r0 != r1) goto L_0x0341
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            com.tencent.mm.storage.f4 r1 = r0.mo135935w()
            com.tencent.mm.modelimage.k r0 = r0.mo135936x(r1, r2)
            com.tencent.mm.ui.chatting.gallery.h r1 = r6.f284432g
            com.tencent.mm.storage.f4 r4 = r1.mo135935w()
            boolean r0 = r1.mo135916G(r4, r0)
            if (r0 == 0) goto L_0x02f4
            j20.C117292a.m165361g(r6, r11, r10, r9, r8)
            return
        L_0x02f4:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.ContextTranslate
            androidx.appcompat.app.AppCompatActivity r1 = r23.getContext()
            boolean r0 = r0.checkAvailable(r1)
            if (r0 == 0) goto L_0x003f
            gk3.e r0 = r6.f284404V1
            r0.mo137416b(r12)
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            com.tencent.mm.storage.f4 r1 = r0.mo135935w()
            java.util.Map<com.tencent.mm.storage.f4, java.lang.Boolean> r0 = r0.f284728x
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x033c
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            com.tencent.mm.storage.f4 r1 = r0.mo135935w()
            java.lang.Boolean r0 = r0.mo135914A(r1)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0326
            goto L_0x033c
        L_0x0326:
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            com.tencent.mm.storage.f4 r1 = r0.mo135935w()
            int r3 = r6.f284488y2
            r0.mo135918M(r1, r2, r3)
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            com.tencent.mm.storage.f4 r0 = r0.mo135935w()
            r6.mo135732N7(r0, r2)
            goto L_0x003f
        L_0x033c:
            r6.mo135752X7(r3)
            goto L_0x003f
        L_0x0341:
            int r0 = r24.getId()
            r1 = 2131305341(0x7f09237d, float:1.822885E38)
            if (r0 != r1) goto L_0x03cf
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$x0 r0 = r6.f284465r2
            int r0 = r0.f284555a
            if (r0 != r3) goto L_0x0354
            j20.C117292a.m165361g(r6, r11, r10, r9, r8)
            return
        L_0x0354:
            gk3.e r0 = r6.f284404V1
            r0.mo137416b(r5)
            gk3.q r0 = r6.f284451n1
            java.util.ArrayList<com.tencent.mm.plugin.scanner.ImageQBarDataBean> r0 = r0.f287785a
            int r0 = r0.size()
            if (r0 != r12) goto L_0x03ca
            android.view.Window r0 = r23.getWindow()
            android.view.View r0 = r0.getDecorView()
            int r0 = r0.getHeight()
            android.view.Window r1 = r23.getWindow()
            android.view.View r1 = r1.getDecorView()
            int r1 = r1.getWidth()
            eb0.v0 r4 = eb0.C86493v0.m107224d()
            java.lang.String r7 = "basescanui@datacenter"
            eb0.v0$c r3 = r4.mo120947c(r7, r3)
            com.tencent.mm.ui.chatting.gallery.h r4 = r6.f284432g
            com.tencent.mm.ui.base.MMViewPager r7 = r6.f284450n
            android.view.View r4 = r6.mo135770g8(r4, r7)
            int r1 = r1 / r5
            float r1 = (float) r1
            int r0 = r0 / r5
            float r0 = (float) r0
            android.graphics.PointF r0 = vl2.C111557w.m152067c(r4, r1, r0)
            if (r0 == 0) goto L_0x03af
            float r1 = r0.x
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r4 = "key_basescanui_touch_normalize_x"
            r3.mo120962i(r4, r1)
            float r0 = r0.y
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.String r1 = "key_basescanui_touch_normalize_y"
            r3.mo120962i(r1, r0)
        L_0x03af:
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            com.tencent.mm.ui.base.MMViewPager r1 = r6.f284450n
            android.view.View r1 = r6.mo135770g8(r0, r1)
            java.lang.String r0 = r23.mo135788u5()
            java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106448i(r0, r2)
            r3 = 0
            r4 = 3
            gk3.j r5 = r6.f284407W1
            r0 = r23
            r0.mo135748V7(r1, r2, r3, r4, r5)
            goto L_0x003f
        L_0x03ca:
            r6.mo135742S7(r3)
            goto L_0x003f
        L_0x03cf:
            int r0 = r24.getId()
            r1 = 2131305342(0x7f09237e, float:1.8228852E38)
            if (r0 != r1) goto L_0x03e9
            r23.mo135784q8()
            android.view.View r0 = r6.f284402V
            r0.setOnClickListener(r4)
            long r0 = java.lang.System.currentTimeMillis()
            r6.mo135744T7(r0, r12)
            goto L_0x003f
        L_0x03e9:
            int r0 = r24.getId()
            r1 = 2131312924(0x7f09411c, float:1.824423E38)
            r12 = 4
            if (r0 != r1) goto L_0x0404
            r23.mo135785r8()
            com.tencent.mm.ui.chatting.gallery.view.SearchImageBubbleView r0 = r6.f284411Y
            r0.setBubbleClickListener(r4)
            long r0 = java.lang.System.currentTimeMillis()
            r6.mo135744T7(r0, r12)
            goto L_0x003f
        L_0x0404:
            int r0 = r24.getId()
            java.lang.String r1 = "no video info for download origin video"
            java.lang.String r13 = "not video can't download origin"
            r14 = 0
            java.lang.String r5 = "msg is null"
            java.lang.String r4 = "MicroMsg.Imagegallery.handler.video"
            java.lang.String r2 = "viewOriginVideo, pos = "
            r12 = 2131316271(0x7f094e2f, float:1.8251019E38)
            if (r0 != r12) goto L_0x04f4
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            int r7 = r23.mo135768f8()
            com.tencent.mm.ui.chatting.gallery.g r0 = r0.f284720p
            if (r0 == 0) goto L_0x04c9
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r2)
            r12.append(r7)
            java.lang.String r2 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            com.tencent.mm.ui.chatting.gallery.h r2 = r0.f284638d
            com.tencent.mm.storage.f4 r2 = r2.mo135937y(r7)
            if (r2 == 0) goto L_0x04c6
            long r16 = r2.getMsgId()
            int r7 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x044b
            goto L_0x04c6
        L_0x044b:
            boolean r5 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124955K(r2)
            if (r5 != 0) goto L_0x0456
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r13)
            goto L_0x04c9
        L_0x0456:
            hd0.n0 r5 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124927o(r2)
            if (r5 != 0) goto L_0x0460
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            goto L_0x04c9
        L_0x0460:
            hd0.x0$a r1 = hd0.C98442x0.f288734i
            java.lang.String r7 = r5.mo137705i()
            hd0.x0 r1 = r1.mo137781b(r7)
            if (r1 == 0) goto L_0x04bf
            java.lang.String r7 = r1.f288740d
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0475
            goto L_0x04bf
        L_0x0475:
            l03.b r4 = new l03.b
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r4.<init>(r12)
            com.tencent.mm.ui.chatting.gallery.c r7 = new com.tencent.mm.ui.chatting.gallery.c
            r7.<init>(r2, r5, r4, r1)
            com.tencent.mm.ui.chatting.gallery.b r1 = new com.tencent.mm.ui.chatting.gallery.b
            java.lang.String r4 = r5.mo137700d()
            r1.<init>(r2, r4, r3)
            com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader r3 = new com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader
            r3.<init>(r7)
            r3.mo134540m(r1)
            r3.f282445j = r0
            boolean r1 = r3.start()
            if (r1 == 0) goto L_0x04c9
            com.tencent.mm.ui.chatting.gallery.d r1 = com.tencent.p014mm.p136ui.chatting.gallery.C73703d.f216412a
            long r12 = r2.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            java.util.HashMap<java.lang.Long, com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader> r4 = com.tencent.p014mm.p136ui.chatting.gallery.C73703d.f216413b
            r4.put(r1, r3)
            mk3.f r1 = new mk3.f
            java.lang.String r3 = r5.mo137700d()
            r4 = 4
            r5 = 0
            r1.<init>(r2, r3, r5, r4)
            r0.f284698f = r1
            long r2 = java.lang.System.currentTimeMillis()
            r1.f292760f = r2
            goto L_0x04c9
        L_0x04bf:
            java.lang.String r0 = "no origin video cdn url"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x04c9
        L_0x04c6:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
        L_0x04c9:
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            com.tencent.mm.storage.f4 r0 = r0.mo135935w()
            java.lang.String r0 = r0.mo108765s2()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x04da
            goto L_0x04e0
        L_0x04da:
            hd0.n0 r0 = hd0.C98429r0.m127818i(r0)
            if (r0 != 0) goto L_0x04e2
        L_0x04e0:
            r2 = 0
            goto L_0x04e6
        L_0x04e2:
            int r2 = hd0.C98429r0.m127822m(r0)
        L_0x04e6:
            com.tencent.mm.plugin.gallery.model.i r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118753m()
            com.tencent.mm.ui.chatting.gallery.i0 r1 = new com.tencent.mm.ui.chatting.gallery.i0
            r1.<init>(r6, r2)
            r0.mo128895c(r1)
            goto L_0x003f
        L_0x04f4:
            int r0 = r24.getId()
            r3 = 2131316274(0x7f094e32, float:1.8251025E38)
            if (r0 != r3) goto L_0x05bc
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284432g
            int r3 = r23.mo135768f8()
            com.tencent.mm.ui.chatting.gallery.g r0 = r0.f284720p
            if (r0 == 0) goto L_0x0587
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            r7.append(r3)
            java.lang.String r2 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            com.tencent.mm.ui.chatting.gallery.h r2 = r0.f284638d
            com.tencent.mm.storage.f4 r2 = r2.mo135937y(r3)
            if (r2 == 0) goto L_0x0582
            long r21 = r2.getMsgId()
            int r3 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x052a
            goto L_0x0582
        L_0x052a:
            boolean r3 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124955K(r2)
            if (r3 != 0) goto L_0x0534
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r13)
            goto L_0x0587
        L_0x0534:
            hd0.n0 r3 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124927o(r2)
            if (r3 != 0) goto L_0x053e
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            goto L_0x0587
        L_0x053e:
            com.tencent.mm.ui.chatting.gallery.d r1 = com.tencent.p014mm.p136ui.chatting.gallery.C73703d.f216412a
            long r4 = r2.getMsgId()
            com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader r1 = r1.mo102768b(r4)
            if (r1 != 0) goto L_0x054b
            goto L_0x0587
        L_0x054b:
            r1.stop()
            mk3.f r1 = r0.f284698f
            if (r1 == 0) goto L_0x056d
            com.tencent.mm.autogen.mmdata.rpt.VideoPlayReportStruct r4 = r1.f292761g
            long r13 = java.lang.System.currentTimeMillis()
            r15 = r8
            long r7 = r1.f292760f
            long r13 = r13 - r7
            float r1 = (float) r13
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r5
            double r7 = (double) r1
            long r7 = iy3.C60641c.m70922c(r7)
            r4.f266512l = r7
            mk3.f r1 = r0.f284698f
            r1.mo139264a()
            goto L_0x056e
        L_0x056d:
            r15 = r8
        L_0x056e:
            mk3.f r1 = new mk3.f
            java.lang.String r3 = r3.mo137700d()
            r4 = 5
            r5 = 0
            r1.<init>(r2, r3, r5, r4)
            r0.f284698f = r1
            r1.mo139264a()
            r1 = 0
            r0.f284698f = r1
            goto L_0x0588
        L_0x0582:
            r15 = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
            goto L_0x0588
        L_0x0587:
            r15 = r8
        L_0x0588:
            android.widget.Button r0 = r6.f284362I
            r1 = 8
            r6.mo135743S8(r0, r1)
            android.view.View r0 = r23.getContentView()
            android.view.Display r0 = r0.getDisplay()
            if (r0 == 0) goto L_0x05b7
            int r1 = r0.getRotation()
            if (r1 == 0) goto L_0x05b7
            int r0 = r0.getRotation()
            r1 = 2
            if (r0 == r1) goto L_0x05b7
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar r0 = r6.f284400U0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            r1 = 1
            r0.addRule(r1, r12)
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar r1 = r6.f284400U0
            r1.setLayoutParams(r0)
        L_0x05b7:
            r0 = 0
            r6.mo135753X8(r0)
            goto L_0x05ca
        L_0x05bc:
            r15 = r8
            int r0 = r24.getId()
            r1 = 2131305340(0x7f09237c, float:1.8228848E38)
            if (r0 != r1) goto L_0x05ca
            r0 = 4
            r6.mo135740R7(r0)
        L_0x05ca:
            r0 = r15
        L_0x05cb:
            j20.C117292a.m165361g(r6, r11, r10, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI.onClick(android.view.View):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C101903a aVar = this.f284420b2;
        if (aVar != null) {
            aVar.onConfigurationChanged(configuration);
        }
        int i = configuration.orientation;
        if (i == 1) {
            Log.m105919d("MicroMsg.ImageGalleryUI", "%d image gallery ui is vertical screen", Integer.valueOf(hashCode()));
            this.f284344C = true;
            View decorView = getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new C97082l0(this, decorView));
        } else if (i == 2) {
            Log.m105919d("MicroMsg.ImageGalleryUI", "%d image gallery ui is horizontal screen", Integer.valueOf(hashCode()));
            this.f284344C = true;
            View decorView2 = getWindow().getDecorView();
            decorView2.getViewTreeObserver().addOnGlobalLayoutListener(new C97086m0(this, decorView2));
        }
    }

    public void onCreate(Bundle bundle) {
        this.f284439i1 = getIntent().getIntExtra("msg_type", 0);
        if (getIntent().getBooleanExtra("img_gallery_enter_use_share_element_anim", false)) {
            ((C59474h) component(C59474h.class)).f169946d.mo84573a(this.f284462q2);
        }
        requestWindowFeature(1);
        C85875k4.m106195m0(this);
        if (mo135725H8()) {
            setTheme(C0966R.style.f8632pd);
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f284445k2 = true;
        super.onCreate(bundle);
        if (mo135725H8()) {
            setMMTitle("");
            addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new ImageGalleryUI$$u0(this));
            setBackBtn(new ImageGalleryUI$$e(this));
        } else {
            if (C11171e.m11046c(19)) {
                getWindow().setFlags(201327616, 201327616);
                this.f284463r = true;
            } else {
                getWindow().setFlags(1024, 1024);
                this.f284463r = false;
            }
            setLightNavigationbarIcon();
        }
        initView();
        C97056h hVar = this.f284432g;
        if (hVar != null) {
            this.f284404V1.mo137419e(1, C97100o.m125011p(hVar.mo135935w()));
        }
        this.f284366J1 = bundle;
        this.f284484x2.alive();
        this.f284469t = false;
        this.f284401U1 = ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71989dd(MMApplicationContext.getContext(), new ImageGalleryUI$$f(this), this);
        Log.m105919d("MicroMsg.ImageGalleryUI", "ImageGallery onCreate spent : %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
    }

    public void onDestroy() {
        Log.m105925i("MicroMsg.ImageGalleryUI", "%d image gallery ui on destroy", Integer.valueOf(hashCode()));
        try {
            if (this.f284432g != null) {
                mo135774i9(this.f284488y2);
                this.f284478w.mo136025d(this, this.f284488y2, 0);
                C97056h hVar = this.f284432g;
                C97100o oVar = hVar.f284719o;
                oVar.f284638d = null;
                oVar.f284885e.dead();
                HashMap<String, WeakReference<Bitmap>> hashMap = oVar.f284889i;
                if (hashMap != null) {
                    for (String str : hashMap.keySet()) {
                        Bitmap bitmap = (Bitmap) oVar.f284889i.get(str).get();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Log.m105925i("MicroMsg.ImageGalleryHolderImage", "recycle bitmap:%s", bitmap.toString());
                            bitmap.recycle();
                        }
                    }
                }
                C97109p pVar = oVar.f284888h;
                pVar.f284925j = null;
                pVar.f284920e.clear();
                pVar.f284923h.clear();
                pVar.f284922g.clear();
                pVar.f284921f.clear();
                pVar.f284924i.clear();
                ((C101062d) pVar.f284928p).mo122812a(new C97117q(pVar));
                ((C101062d) pVar.f284929q).mo122812a(new C97120r(pVar));
                Bitmap bitmap2 = pVar.f284934v;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    Log.m105925i("MicroMsg.ImageGalleryLazyLoader", "bitmap recycle %s", pVar.f284934v.toString());
                    pVar.f284934v.recycle();
                    pVar.f284934v = null;
                }
                ((C92822e) ((C98201k) C86312j.m106911c(C98201k.class)).Jp0()).mo127102d(oVar);
                C97108o1 a = C97108o1.m125035a();
                if (oVar.equals(a.f284915e)) {
                    a.f284915e = null;
                }
                hVar.f284720p.mo135844k();
                C97150w wVar = hVar.f284721q;
                wVar.mo136056o();
                wVar.f284638d.f284714g.getContext().getWindow().clearFlags(128);
                wVar.f285087g = true;
                wVar.f284638d = null;
                wVar.f285085e.clear();
                wVar.f285085e = null;
                ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(wVar);
                Log.m105918d("MicroMsg.ImageGallerySightHandler", "mAudioHelperTool abandonFocus");
                wVar.f285086f.mo136890b(true);
                C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct = hVar.f284727w;
                if (c2CImgWaitingTimeStruct != null) {
                    long nowMilliSecond = Util.nowMilliSecond();
                    c2CImgWaitingTimeStruct.f265351m = nowMilliSecond;
                    c2CImgWaitingTimeStruct.mo86048e("FinishDownloadTimeStampMs", nowMilliSecond);
                    c2CImgWaitingTimeStruct.f265352n = C2CImgWaitingTimeStruct.C92612a.cancel;
                    c2CImgWaitingTimeStruct.mo86054n();
                }
                ((HashMap) hVar.f284728x).clear();
                ((HashSet) C97056h.f284711A).clear();
                hVar.mo139421i();
                this.f284432g = null;
            }
            mo135767e9();
            mo135769f9(false);
            this.f284387Q1.removeAllUpdateListeners();
            this.f284484x2.dead();
            C86709a0.m107529k().mo121129d(this.f284431f2);
            ReleaseDealQBarStrEvent releaseDealQBarStrEvent = new ReleaseDealQBarStrEvent();
            releaseDealQBarStrEvent.f265057d.f265058a = this;
            releaseDealQBarStrEvent.publish();
            RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = this.f284400U0;
            if (redesignVideoPlayerSeekBar != null) {
                redesignVideoPlayerSeekBar.setPlayBtnOnClickListener((View.OnClickListener) null);
            }
            this.f284400U0 = null;
            mo135731M8();
            ImageScanCodeManager imageScanCodeManager = this.f284458p1;
            if (imageScanCodeManager != null) {
                imageScanCodeManager.mo136029b();
            }
            C98154l lVar = this.f284470t1;
            if (lVar != null) {
                lVar.mo137439b();
            }
            C101903a aVar = this.f284420b2;
            if (aVar != null) {
                aVar.release();
            }
            C75919p.m91177c();
            mo135790v8();
            this.f284408X.mo67038a();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ImageGalleryUI", e, "", new Object[0]);
        }
        C116637d dVar = C116637d.INSTANCE;
        if (dVar.f349740g) {
            dVar.mo180638b();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 82) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        C97056h hVar;
        Log.m105924i("MicroMsg.ImageGalleryUI", "on pause");
        super.onPause();
        if (!mo135725H8()) {
            getWindow().setFlags(2048, 2048);
        }
        if (!isFinishing() && (hVar = this.f284432g) != null) {
            hVar.f284720p.mo135843j();
            hVar.f284721q.mo136056o();
        }
        C103928o.m138642b();
        mo135785r8();
        this.f284411Y.setBubbleClickListener(this);
        mo135784q8();
        this.f284402V.setOnClickListener(this);
        mo135778l8();
        this.f284405W.setOnClickListener(this);
    }

    public void onResume() {
        super.onResume();
        C97056h hVar = this.f284432g;
        if (hVar != null) {
            C97056h.C97063f.f284741p = hVar.f284723s ? 0 : 100000;
        }
        if (!mo135725H8()) {
            getWindow().clearFlags(2048);
        }
        if (!this.f284445k2 && this.f284432g != null) {
            int f8 = mo135768f8();
            mo135772h9(f8, this.f284432g.mo135937y(f8), false);
        }
        this.f284445k2 = false;
        C97056h hVar2 = this.f284432g;
        if (hVar2 != null) {
            hVar2.f284720p.mo135845r();
        }
        C86709a0.m107529k().mo121126a(this.f284431f2);
        C103928o.m138641a(true, true, true);
    }

    public void onStart() {
        C72963f4 y;
        this.f284483x1 = getIntent().getBooleanExtra("img_gallery_back_from_grid", false);
        if (!this.f284466s && !mo135725H8() && !getIntent().getBooleanExtra("img_gallery_enter_use_share_element_anim", false)) {
            Bundle bundle = this.f284366J1;
            Log.m105924i("MicroMsg.ImageGalleryUI", "[handleAnimation] isAnimated:" + this.f284487y1);
            if (!this.f284487y1) {
                boolean z = true;
                this.f284487y1 = true;
                this.f284424d1 = getIntent().getIntExtra("img_gallery_top", 0);
                this.f284427e1 = getIntent().getIntExtra("img_gallery_left", 0);
                this.f284430f1 = getIntent().getIntExtra("img_gallery_width", 0);
                int intExtra = getIntent().getIntExtra("img_gallery_height", 0);
                this.f284433g1 = intExtra;
                if (this.f284424d1 == 0 && this.f284427e1 == 0 && this.f284430f1 == 0 && intExtra == 0 && (y = this.f284432g.mo135937y(this.f284450n.getCurrentItem())) != null) {
                    ChattingUIPhotoInfoEvent chattingUIPhotoInfoEvent = new ChattingUIPhotoInfoEvent();
                    chattingUIPhotoInfoEvent.f193516d.f193518a = y;
                    chattingUIPhotoInfoEvent.publish();
                    ChattingUIPhotoInfoEvent.C67669b bVar = chattingUIPhotoInfoEvent.f193517e;
                    this.f284430f1 = bVar.f193521c;
                    this.f284433g1 = bVar.f193522d;
                    this.f284427e1 = bVar.f193519a;
                    this.f284424d1 = bVar.f193520b;
                }
                this.f284442j1.mo70410e(this.f284427e1, this.f284424d1, this.f284430f1, this.f284433g1);
                Object[] objArr = new Object[1];
                if (bundle != null) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                Log.m105925i("MicroMsg.ImageGalleryUI", "[handleAnimation] savedInstanceState is null?%s", objArr);
                if (bundle == null) {
                    this.f284450n.getViewTreeObserver().addOnPreDrawListener(new C97031a0(this));
                }
            }
        }
        super.onStart();
    }

    public void onStop() {
        super.onStop();
        C97588f.INSTANCE.mo136853a();
        C116637d dVar = C116637d.INSTANCE;
        if (dVar.f349740g) {
            dVar.mo180638b();
        }
        if (this.f284399U == null) {
            this.f284399U = findViewById(C0966R.C0970id.j1z);
        }
        mo135743S8(this.f284399U, 8);
    }

    /* renamed from: p8 */
    public final ImageGalleryUI mo135783p8() {
        if (this.f284396T == null) {
            this.f284396T = findViewById(C0966R.C0970id.ehr);
        }
        return this;
    }

    /* renamed from: q8 */
    public final ImageGalleryUI mo135784q8() {
        if (this.f284402V == null) {
            this.f284402V = findViewById(C0966R.C0970id.ehs);
        }
        return this;
    }

    /* renamed from: r8 */
    public final ImageGalleryUI mo135785r8() {
        if (this.f284411Y == null) {
            this.f284411Y = (SearchImageBubbleView) findViewById(C0966R.C0970id.j5y);
        }
        return this;
    }

    /* renamed from: s8 */
    public final int mo135786s8() {
        int i = this.f284342B1;
        if (i == 0) {
            return 2;
        }
        return i == 1 ? 4 : 1;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C59474h.class);
    }

    /* renamed from: t8 */
    public final int mo135787t8() {
        return this.f284472u ? 3 : 4;
    }

    /* renamed from: u5 */
    public final String mo135788u5() {
        C97056h hVar = this.f284432g;
        String str = null;
        if (hVar != null) {
            C72963f4 y = hVar.mo135937y(this.f284488y2);
            if (C97056h.m124953H(y)) {
                C92836k x = this.f284432g.mo135936x(y, true);
                if (x != null) {
                    str = C97100o.m125012r(y, x, false);
                }
            } else if (C97056h.m124952F(y)) {
                str = C97056h.m124960s(y);
            }
        }
        return Util.nullAsNil(str);
    }

    /* renamed from: u8 */
    public final String mo135789u8(C72963f4 f4Var, boolean z) {
        return f4Var.mo108769t2() == 1 ? C75592q0.m90789s() : z ? C75604z3.m90847s(f4Var.getContent()) : f4Var.mo108768t();
    }

    /* renamed from: v8 */
    public final ImageGalleryUI mo135790v8() {
        if (this.f284408X == null) {
            MultiCodeMaskView multiCodeMaskView = (MultiCodeMaskView) findViewById(C0966R.C0970id.h2z);
            this.f284408X = multiCodeMaskView;
            multiCodeMaskView.setOnMultiCodeMaskViewListener(new ImageGalleryUI$$t0(this));
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00dd  */
    /* renamed from: w3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86628w3(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            java.lang.String r11 = (java.lang.String) r11
            xl2.c r12 = (xl2.C102690c) r12
            java.lang.String r0 = r10.mo135788u5()
            boolean r11 = r11.equals(r0)
            java.lang.String r1 = "MicroMsg.ImageGalleryUI"
            if (r11 != 0) goto L_0x0018
            java.lang.String r11 = "scanTranslate onEnd, not the same image"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            goto L_0x00e8
        L_0x0018:
            java.lang.Class<sk2.c> r11 = sk2.C101643c.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            sk2.c r11 = (sk2.C101643c) r11
            java.util.List<java.lang.Float> r2 = r12.f303305a
            boolean r11 = r11.mo140870Ax(r2)
            r2 = 1
            r3 = 0
            if (r11 == 0) goto L_0x002e
            r10.f284357G1 = r2
            r10.f284360H1 = r3
        L_0x002e:
            java.lang.Class<lc3.b> r11 = lc3.C10485b.class
            boolean r4 = com.tencent.p014mm.plugin.scanner.C30391y.m39060e()
            java.lang.String r5 = "MicroMsg.ScannerHelper"
            r6 = 3
            r7 = 2
            if (r4 != 0) goto L_0x0040
            java.lang.String r11 = "Word Detect Closed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
            goto L_0x009f
        L_0x0040:
            k40.a r4 = f40.C86709a0.m107533q(r11)
            lc3.b r4 = (lc3.C10485b) r4
            pj.f r4 = r4.vh0()
            java.lang.String r8 = "EnableSessionPicTranslation"
            int r4 = r4.mo107404b(r8, r3)
            k40.a r11 = f40.C86709a0.m107533q(r11)
            lc3.b r11 = (lc3.C10485b) r11
            pj.f r11 = r11.vh0()
            java.lang.String r8 = "PicTranslationSupportUserLanguage"
            java.lang.String r11 = r11.mo107405c(r8)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            if (r4 != r2) goto L_0x0066
            r9 = 1
            goto L_0x0067
        L_0x0066:
            r9 = 0
        L_0x0067:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8[r3] = r9
            r8[r2] = r11
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r8[r7] = r9
            java.lang.String r9 = "enable %s, support lang %s, current lang %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r8)
            if (r4 != r2) goto L_0x0099
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r4 != 0) goto L_0x0099
            java.lang.String r4 = ";"
            java.lang.String[] r11 = r11.split(r4)
            if (r11 == 0) goto L_0x0099
            java.util.List r11 = java.util.Arrays.asList(r11)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            boolean r11 = r11.contains(r4)
            if (r11 == 0) goto L_0x0099
            goto L_0x009d
        L_0x0099:
            boolean r11 = qe3.C89625d.f257846l
            if (r11 == 0) goto L_0x009f
        L_0x009d:
            r11 = 1
            goto L_0x00a0
        L_0x009f:
            r11 = 0
        L_0x00a0:
            if (r11 == 0) goto L_0x00dd
            java.util.List<java.lang.Float> r11 = r12.f303305a
            int r11 = com.tencent.p014mm.plugin.scanner.C30391y.m39057b(r11)
            boolean r4 = com.tencent.p014mm.plugin.scanner.C30391y.m39062g(r11)
            r5 = 6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r0
            java.util.List<java.lang.Float> r12 = r12.f303305a
            r5[r2] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r5[r7] = r12
            boolean r12 = r10.f284357G1
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r5[r6] = r12
            r12 = 4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r5[r12] = r0
            r12 = 5
            boolean r0 = com.tencent.p014mm.plugin.scanner.C30391y.m39059d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5[r12] = r0
            java.lang.String r12 = "scanTranslate onEnd, img %s, ratioList %s, ratio %d, showOcrMenu: %b, showTranslateMenu: %s, isPendingWordDetect: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r12, r5)
            r3 = r11
            goto L_0x00e3
        L_0x00dd:
            gk3.g r11 = r10.f284461q1
            r11.mo137429i(r2, r7)
            r4 = 0
        L_0x00e3:
            boolean r11 = r10.f284357G1
            r10.mo135776j9(r3, r4, r11)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI.mo86628w3(java.lang.Object, java.lang.Object):void");
    }

    /* renamed from: w8 */
    public final void mo135791w8() {
        C72963f4 w = this.f284432g.mo135935w();
        String r = C97100o.m125012r(w, C97100o.m125011p(w), false);
        Log.m105925i("MicroMsg.ImageGalleryUI", "edit image path:%s msgId:%s", r, Long.valueOf(w.getMsgId()));
        RecordConfigProvider b = RecordConfigProvider.m119432b(r, "");
        b.f272905F = this.f284345C1;
        Bundle bundle = b.f272912M;
        Boolean bool = Boolean.TRUE;
        bundle.putBoolean("key_edit_enable_emoji_search", true);
        UICustomParam uICustomParam = new UICustomParam();
        ((HashMap) uICustomParam.f266575h).put("plugin_filter", bool);
        ((HashMap) uICustomParam.f266575h).put("plugin_poi", bool);
        ((HashMap) uICustomParam.f266575h).put("plugin_tip", bool);
        ((HashMap) uICustomParam.f266575h).put("plugin_menu", bool);
        b.f272927o = uICustomParam;
        C8532a.f27585a.mo9446e(getContext(), 4369, C0966R.C0968anim.f2492eg, -1, b, 1, 2);
        mo135736P7(8);
    }

    /* renamed from: x8 */
    public final boolean mo135792x8(int i) {
        int d = this.f284461q1.mo137424d(i, 2);
        return d == 1 || d == 3 || d == 7;
    }

    /* renamed from: y8 */
    public final boolean mo135793y8(int i, C72963f4 f4Var, C92836k kVar) {
        if (kVar == null) {
            return false;
        }
        try {
            return this.f284432g.mo135932t(f4Var, kVar) == 0 && kVar.mo127145p() && !f4Var.mo100972K3();
        } catch (NullPointerException e) {
            Log.m105920e("MicroMsg.ImageGalleryUI", "error:" + e);
        }
    }

    /* renamed from: z8 */
    public void mo135794z8(int i) {
        mo135722E8();
        mo135753X8(false);
        mo135780n8();
        View view = this.f284414Z;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hdLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hdLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo135780n8();
        this.f284457p0.setVisibility(8);
        mo135780n8();
        this.f284482x0.setVisibility(0);
        mo135780n8();
        View view2 = this.f284486y0;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hdLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hdLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo135780n8();
        Button button = this.f284482x0;
        button.setText(i + "%");
    }
}
