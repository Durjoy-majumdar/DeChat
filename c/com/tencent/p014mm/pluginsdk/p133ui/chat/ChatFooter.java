package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.support.design.widget.MMBottomSheetBehavior;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LocationServerEvent;
import com.tencent.p014mm.autogen.events.NotifyChatRoomStatusChangeEvent;
import com.tencent.p014mm.autogen.events.OPPOFloatWindowModeChangedEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.AndroidChatInputStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatRoomToolPanelOperateLogStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85865h1;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.blur.BlurView;
import com.tencent.p014mm.p136ui.chatting.component.C73467e5;
import com.tencent.p014mm.p136ui.chatting.component.C73537m5;
import com.tencent.p014mm.p136ui.chatting.component.FootComponent$$i;
import com.tencent.p014mm.p136ui.chatting.component.GroupTodoComponent;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageButton;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.transvoice.model.C71561b;
import com.tencent.p014mm.plugin.transvoice.model.C71562c;
import com.tencent.p014mm.plugin.transvoice.model.CutShortSentence;
import com.tencent.p014mm.plugin.transvoice.p324ui.LanguageChoiceLayout;
import com.tencent.p014mm.plugin.transvoice.p324ui.SoundWaveView;
import com.tencent.p014mm.plugin.websearch.C96603l;
import com.tencent.p014mm.pluginsdk.model.app.C44547a2;
import com.tencent.p014mm.pluginsdk.model.app.C44551e1;
import com.tencent.p014mm.pluginsdk.model.app.C44560i1;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72791h;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72806l1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72813n1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChattingScrollLayout;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72922q;
import com.tencent.p014mm.pluginsdk.p133ui.tools.tips.TipsPopupWindow;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.vendor.OnePlus;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.MaxHeightScrollView;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.util.WXWebReporter;
import d83.C75343a;
import d83.C97448g;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75698i0;
import f62.C75700k0;
import gy3.C87412m;
import h81.C32735h;
import ht1.C60150a;
import ht1.C60151b;
import ht1.C60161e;
import ht1.C60166f;
import ht1.C60175i;
import ht1.C60176j;
import i13.C76259g;
import i13.C76282z;
import i13.C8840a;
import j13.C76381b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jo3.C76431c;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import lc3.C10485b;
import ld2.C46848g;
import md0.C99847f;
import nj3.C76879j;
import nj3.C76901s0;
import nl3.C47276a;
import p008bq.C67306k1;
import p196ln.C76705f;
import p206nj.C11171e;
import p206nj.C76865k;
import p206nj.C76866m;
import p248ug.C78160t0;
import p255vr.C65873e;
import p270xi.C78837h;
import p492dn.C75415t;
import p529fv.C75798k;
import p548hg.C98450d;
import p565ir.C60606n;
import p585kl.C33934b;
import p585kl.C76595c;
import p585kl.C76596h;
import p585kl.C99150i;
import p629ny.C76979h;
import p640ox.C77049b;
import p645pj.C47509i;
import p823sg.C101611g;
import pd0.C35457d;
import pl3.C100823c;
import qn3.C77382c;
import qo3.C77389a;
import qo3.C77398g;
import ro3.C110588j;
import sz1.C77815b;
import te3.C101810m82;
import te3.C50107kb3;
import te3.C64623p81;
import u72.C78135c;
import u73.C101980n;
import vd3.C78405p;
import w72.C78521a;
import wi3.C78603a;
import wz1.C78747b;
import xz1.C79013a;
import yd2.C79076g;
import yz1.C79206x;
import z51.C79305f;
import zj3.C79337a0;
import zj3.C79353f1;
import zj3.C79363i;
import zj3.C79365j;
import zj3.C79366k;
import zj3.C79368l;
import zj3.C79377q;
import zj3.C79382t;
import zp3.C103055g;
import zt3.C119157j;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter */
public class ChatFooter extends FrameLayout implements C72813n1.C72814a, C7020t0, C75343a {

    /* renamed from: C4 */
    public static C97448g f211728C4;

    /* renamed from: D4 */
    public static int f211729D4;

    /* renamed from: E4 */
    public static int f211730E4;

    /* renamed from: F4 */
    public static final int[] f211731F4 = {0, 15, 30, 45, 60, 75, 90, 95, 100};

    /* renamed from: G4 */
    public static final int[] f211732G4 = {C0966R.raw.amp1, C0966R.raw.amp2, C0966R.raw.amp3, C0966R.raw.amp4, C0966R.raw.amp5, C0966R.raw.amp6, C0966R.raw.amp7, C0966R.raw.amp8};

    /* renamed from: H4 */
    public static final String f211733H4 = (MMApplicationContext.getPackageName() + "chat_footer_sp");

    /* renamed from: A */
    public int f211734A;

    /* renamed from: A1 */
    public int f211735A1;

    /* renamed from: A2 */
    public CutShortSentence f211736A2;

    /* renamed from: A3 */
    public ChatFooter$$p1 f211737A3;

    /* renamed from: A4 */
    public int f211738A4;

    /* renamed from: B */
    public LinearLayout f211739B;

    /* renamed from: B1 */
    public boolean f211740B1;

    /* renamed from: B2 */
    public C99847f f211741B2;

    /* renamed from: B3 */
    public int f211742B3;

    /* renamed from: B4 */
    public IListener f211743B4;

    /* renamed from: C */
    public RelativeLayout f211744C;

    /* renamed from: C1 */
    public C72852z0 f211745C1;

    /* renamed from: C2 */
    public C76901s0 f211746C2;

    /* renamed from: C3 */
    public boolean f211747C3;

    /* renamed from: D */
    public TextView f211748D;

    /* renamed from: D1 */
    public C72830t1 f211749D1;

    /* renamed from: D2 */
    public C71562c f211750D2;

    /* renamed from: D3 */
    public int f211751D3;

    /* renamed from: E */
    public ImageView f211752E;

    /* renamed from: E1 */
    public String f211753E1;

    /* renamed from: E2 */
    public ChatFooter$$s1 f211754E2;

    /* renamed from: E3 */
    public TextWatcher f211755E3;

    /* renamed from: F */
    public ImageView f211756F;

    /* renamed from: F1 */
    public String f211757F1;

    /* renamed from: F2 */
    public ChatFooter$$q1 f211758F2;

    /* renamed from: F3 */
    public ValueAnimator f211759F3;

    /* renamed from: G */
    public FrameLayout f211760G;

    /* renamed from: G1 */
    public IListener<OPPOFloatWindowModeChangedEvent> f211761G1;

    /* renamed from: G2 */
    public ChatFooter$$r1 f211762G2;

    /* renamed from: G3 */
    public ValueAnimator f211763G3;

    /* renamed from: H */
    public WeImageView f211764H;

    /* renamed from: H1 */
    public GroupTodoComponent.C73357g f211765H1;

    /* renamed from: H2 */
    public boolean f211766H2;

    /* renamed from: H3 */
    public ValueAnimator f211767H3;

    /* renamed from: I */
    public C72826s1 f211768I;

    /* renamed from: I1 */
    public GroupTodoComponent.C73355e f211769I1;

    /* renamed from: I2 */
    public boolean f211770I2;

    /* renamed from: I3 */
    public ValueAnimator f211771I3;

    /* renamed from: J */
    public C72806l1 f211772J;

    /* renamed from: J1 */
    public C73537m5.C30825c f211773J1;

    /* renamed from: J2 */
    public boolean f211774J2;

    /* renamed from: J3 */
    public ValueAnimator f211775J3;

    /* renamed from: K */
    public C79206x f211776K;

    /* renamed from: K1 */
    public C79353f1.C79355b f211777K1;

    /* renamed from: K2 */
    public float f211778K2;

    /* renamed from: K3 */
    public ValueAnimator.AnimatorUpdateListener f211779K3;

    /* renamed from: L */
    public C72825s0 f211780L;

    /* renamed from: L1 */
    public C79206x.C79210d f211781L1;

    /* renamed from: L2 */
    public C76901s0 f211782L2;

    /* renamed from: L3 */
    public int[] f211783L3;

    /* renamed from: M */
    public ChatFooter$$n1 f211784M;

    /* renamed from: M1 */
    public AndroidChatInputStruct f211785M1;

    /* renamed from: M2 */
    public View f211786M2;

    /* renamed from: M3 */
    public final int f211787M3;

    /* renamed from: N */
    public ChatFooter$$m1 f211788N;

    /* renamed from: N1 */
    public ChatFooter$$j1 f211789N1;

    /* renamed from: N2 */
    public View f211790N2;

    /* renamed from: N3 */
    public final int f211791N3;

    /* renamed from: O1 */
    public ChatFooter$$k1 f211792O1;

    /* renamed from: O2 */
    public ViewGroup f211793O2;

    /* renamed from: O3 */
    public final int f211794O3;

    /* renamed from: P */
    public final ChatFooter$$h1 f211795P;

    /* renamed from: P1 */
    public C72806l1.C44611a f211796P1;

    /* renamed from: P2 */
    public EditText f211797P2;

    /* renamed from: P3 */
    public final int f211798P3;

    /* renamed from: Q */
    public boolean f211799Q;

    /* renamed from: Q0 */
    public View f211800Q0;

    /* renamed from: Q1 */
    public final MMHandler f211801Q1;

    /* renamed from: Q2 */
    public SoundWaveView f211802Q2;

    /* renamed from: Q3 */
    public final int f211803Q3;

    /* renamed from: R */
    public boolean f211804R;

    /* renamed from: R0 */
    public ImageView f211805R0;

    /* renamed from: R1 */
    public boolean f211806R1;

    /* renamed from: R2 */
    public ImageView f211807R2;

    /* renamed from: R3 */
    public final float f211808R3;

    /* renamed from: S */
    public boolean f211809S;

    /* renamed from: S0 */
    public TextView f211810S0;

    /* renamed from: S1 */
    public boolean f211811S1;

    /* renamed from: S2 */
    public TextView f211812S2;

    /* renamed from: S3 */
    public int f211813S3;

    /* renamed from: T */
    public boolean f211814T;

    /* renamed from: T0 */
    public View f211815T0;

    /* renamed from: T1 */
    public MMFragment f211816T1;

    /* renamed from: T2 */
    public WeImageView f211817T2;

    /* renamed from: T3 */
    public int f211818T3;

    /* renamed from: U */
    public boolean f211819U;

    /* renamed from: U0 */
    public View f211820U0;

    /* renamed from: U1 */
    public Activity f211821U1;

    /* renamed from: U2 */
    public LanguageChoiceLayout f211822U2;

    /* renamed from: U3 */
    public int f211823U3;

    /* renamed from: V */
    public String f211824V;

    /* renamed from: V0 */
    public View f211825V0;

    /* renamed from: V1 */
    public ChatFooter$$i1 f211826V1;

    /* renamed from: V2 */
    public TextView f211827V2;

    /* renamed from: V3 */
    public int f211828V3;

    /* renamed from: W */
    public ImageView f211829W;

    /* renamed from: W0 */
    public View f211830W0;

    /* renamed from: W1 */
    public Animation f211831W1;

    /* renamed from: W2 */
    public ViewGroup f211832W2;

    /* renamed from: W3 */
    public int f211833W3;

    /* renamed from: X0 */
    public InputMethodManager f211834X0;

    /* renamed from: X1 */
    public Animation f211835X1;

    /* renamed from: X2 */
    public TextView f211836X2;

    /* renamed from: X3 */
    public int f211837X3;

    /* renamed from: Y0 */
    public int f211838Y0;

    /* renamed from: Y1 */
    public boolean f211839Y1;

    /* renamed from: Y2 */
    public ViewGroup f211840Y2;

    /* renamed from: Y3 */
    public int f211841Y3;

    /* renamed from: Z0 */
    public boolean f211842Z0;

    /* renamed from: Z1 */
    public String f211843Z1;

    /* renamed from: Z2 */
    public ViewGroup f211844Z2;

    /* renamed from: Z3 */
    public int f211845Z3;

    /* renamed from: a1 */
    public boolean f211846a1;

    /* renamed from: a2 */
    public String f211847a2;

    /* renamed from: a3 */
    public View f211848a3;

    /* renamed from: a4 */
    public boolean f211849a4;

    /* renamed from: b1 */
    public boolean f211850b1;

    /* renamed from: b2 */
    public boolean f211851b2;

    /* renamed from: b3 */
    public View f211852b3;

    /* renamed from: b4 */
    public MMHandler f211853b4;

    /* renamed from: c1 */
    public boolean f211854c1;

    /* renamed from: c2 */
    public TipsPopupWindow f211855c2;

    /* renamed from: c3 */
    public WeImageView f211856c3;

    /* renamed from: c4 */
    public boolean f211857c4;

    /* renamed from: d */
    public String f211858d;

    /* renamed from: d1 */
    public boolean f211859d1;

    /* renamed from: d2 */
    public boolean f211860d2;

    /* renamed from: d3 */
    public WeImageView f211861d3;

    /* renamed from: d4 */
    public int f211862d4;

    /* renamed from: e */
    public View f211863e;

    /* renamed from: e1 */
    public boolean f211864e1;

    /* renamed from: e2 */
    public Runnable f211865e2;

    /* renamed from: e3 */
    public View f211866e3;

    /* renamed from: e4 */
    public boolean f211867e4;

    /* renamed from: f */
    public ChatFooterPanel f211868f;

    /* renamed from: f1 */
    public boolean f211869f1;

    /* renamed from: f2 */
    public boolean f211870f2;

    /* renamed from: f3 */
    public View f211871f3;

    /* renamed from: f4 */
    public int f211872f4;

    /* renamed from: g */
    public VoiceInputPanel f211873g;

    /* renamed from: g1 */
    public boolean f211874g1;

    /* renamed from: g2 */
    public ViewGroup f211875g2;

    /* renamed from: g3 */
    public ViewGroup f211876g3;

    /* renamed from: g4 */
    public int f211877g4;

    /* renamed from: h */
    public AppPanel f211878h;

    /* renamed from: h1 */
    public boolean f211879h1;

    /* renamed from: h2 */
    public View f211880h2;

    /* renamed from: h3 */
    public View f211881h3;

    /* renamed from: h4 */
    public int f211882h4;

    /* renamed from: i */
    public C78405p f211883i;

    /* renamed from: i1 */
    public int f211884i1;

    /* renamed from: i2 */
    public BlurView f211885i2;

    /* renamed from: i3 */
    public View f211886i3;

    /* renamed from: i4 */
    public int f211887i4;

    /* renamed from: j */
    public C74974a f211888j;

    /* renamed from: j1 */
    public int f211889j1;

    /* renamed from: j2 */
    public View f211890j2;

    /* renamed from: j3 */
    public View f211891j3;

    /* renamed from: j4 */
    public int f211892j4;

    /* renamed from: k1 */
    public ChattingScrollLayout f211893k1;

    /* renamed from: k2 */
    public View f211894k2;

    /* renamed from: k3 */
    public View f211895k3;

    /* renamed from: k4 */
    public Runnable f211896k4;

    /* renamed from: l1 */
    public boolean f211897l1;

    /* renamed from: l2 */
    public ImageView f211898l2;

    /* renamed from: l3 */
    public WeImageView f211899l3;

    /* renamed from: l4 */
    public Runnable f211900l4;

    /* renamed from: m1 */
    public KeyboardHeightProvider f211901m1;

    /* renamed from: m2 */
    public ImageView f211902m2;

    /* renamed from: m3 */
    public ViewGroup f211903m3;

    /* renamed from: m4 */
    public int f211904m4;

    /* renamed from: n */
    public Button f211905n;

    /* renamed from: n1 */
    public int f211906n1;

    /* renamed from: n2 */
    public View f211907n2;

    /* renamed from: n3 */
    public View f211908n3;

    /* renamed from: n4 */
    public int f211909n4;

    /* renamed from: o */
    public TextView f211910o;

    /* renamed from: o1 */
    public int f211911o1;

    /* renamed from: o2 */
    public TextView f211912o2;

    /* renamed from: o3 */
    public View f211913o3;

    /* renamed from: o4 */
    public ChatFooter$$l1 f211914o4;

    /* renamed from: p */
    public Button f211915p;

    /* renamed from: p0 */
    public List<ChatFooter$$t1> f211916p0;

    /* renamed from: p1 */
    public boolean f211917p1;

    /* renamed from: p2 */
    public ImageView f211918p2;

    /* renamed from: p3 */
    public View f211919p3;

    /* renamed from: p4 */
    public ChatFooter$$l1 f211920p4;

    /* renamed from: q */
    public WeImageButton f211921q;

    /* renamed from: q1 */
    public boolean f211922q1;

    /* renamed from: q2 */
    public View f211923q2;

    /* renamed from: q3 */
    public WeImageView f211924q3;

    /* renamed from: q4 */
    public Map<Integer, String> f211925q4;

    /* renamed from: r */
    public View f211926r;

    /* renamed from: r1 */
    public boolean f211927r1;

    /* renamed from: r2 */
    public View f211928r2;

    /* renamed from: r3 */
    public View f211929r3;

    /* renamed from: r4 */
    public boolean f211930r4;

    /* renamed from: s */
    public View f211931s;

    /* renamed from: s1 */
    public boolean f211932s1;

    /* renamed from: s2 */
    public WeImageView f211933s2;

    /* renamed from: s3 */
    public int f211934s3;

    /* renamed from: s4 */
    public C71561b f211935s4;

    /* renamed from: t */
    public ChatFooterBottom f211936t;

    /* renamed from: t1 */
    public boolean f211937t1;

    /* renamed from: t2 */
    public TextView f211938t2;

    /* renamed from: t3 */
    public int f211939t3;

    /* renamed from: t4 */
    public C35457d f211940t4;

    /* renamed from: u */
    public TextView f211941u;

    /* renamed from: u1 */
    public int f211942u1;

    /* renamed from: u2 */
    public View f211943u2;

    /* renamed from: u3 */
    public boolean f211944u3;

    /* renamed from: u4 */
    public List<String> f211945u4;

    /* renamed from: v */
    public ImageButton f211946v;

    /* renamed from: v1 */
    public boolean f211947v1;

    /* renamed from: v2 */
    public WeImageView f211948v2;

    /* renamed from: v3 */
    public C44614y0 f211949v3;

    /* renamed from: v4 */
    public String f211950v4;

    /* renamed from: w */
    public ImageView f211951w;

    /* renamed from: w1 */
    public int f211952w1;

    /* renamed from: w2 */
    public TextView f211953w2;

    /* renamed from: w3 */
    public ChatFooterPanel.C72719a f211954w3;

    /* renamed from: w4 */
    public int f211955w4;

    /* renamed from: x */
    public WeImageButton f211956x;

    /* renamed from: x0 */
    public C76901s0 f211957x0;

    /* renamed from: x1 */
    public int f211958x1;

    /* renamed from: x2 */
    public View f211959x2;

    /* renamed from: x3 */
    public AppPanel.C72753h f211960x3;

    /* renamed from: x4 */
    public MTimerHandler f211961x4;

    /* renamed from: y */
    public MaxHeightScrollView f211962y;

    /* renamed from: y0 */
    public ViewGroup f211963y0;

    /* renamed from: y1 */
    public int f211964y1;

    /* renamed from: y2 */
    public BlurView f211965y2;

    /* renamed from: y3 */
    public ChatFooter$$i1 f211966y3;

    /* renamed from: y4 */
    public MMHandler f211967y4;

    /* renamed from: z */
    public C77398g f211968z;

    /* renamed from: z1 */
    public int f211969z1;

    /* renamed from: z2 */
    public C76259g f211970z2;

    /* renamed from: z3 */
    public final MMHandler f211971z3;

    /* renamed from: z4 */
    public boolean f211972z4;

    public ChatFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public static void m85249c(ChatFooter chatFooter) {
        String str = (String) ((HashMap) chatFooter.f211925q4).get(Integer.valueOf(chatFooter.f211738A4));
        if (!Util.isNullOrNil(str)) {
            String trim = str.trim();
            String substring = trim.substring(trim.length() - 1);
            Log.m105919d("MicroMsg.ChatFooter", "delPunctuation, msg = %s, msg.length() = %s, punctuation = %s.", Util.secPrint(trim), Integer.valueOf(trim.length()), substring);
            if (substring.equals("。") || substring.equals(".")) {
                trim = trim.substring(0, trim.length() - 1);
                chatFooter.f211797P2.setText(trim);
            } else {
                chatFooter.f211797P2.setText(trim);
            }
            chatFooter.f211891j3.setEnabled(true);
            chatFooter.f211899l3.setVisibility(0);
            chatFooter.f211899l3.setImageDrawable(C74933u4.m89768e(chatFooter.getContext(), C0966R.raw.icons_filled_done, chatFooter.getContext().getResources().getColor(C0966R.color.f2939n)));
            View view = chatFooter.f211895k3;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "delPunctuation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "delPunctuation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            chatFooter.f211797P2.setSelection(trim.length());
        } else if (NetStatusUtil.isConnected(chatFooter.getContext())) {
            chatFooter.f211750D2.mo98691b(3);
            chatFooter.f211817T2.setVisibility(8);
            chatFooter.f211891j3.setEnabled(false);
            chatFooter.f211797P2.setText("");
            Drawable e = C74933u4.m89768e(chatFooter.getContext(), C0966R.raw.icons_filled_error, -1);
            int a = C74942w4.m89784a(chatFooter.getContext(), 24);
            e.setBounds(0, 0, a, a);
            chatFooter.f211827V2.setCompoundDrawables(e, (Drawable) null, (Drawable) null, (Drawable) null);
            chatFooter.f211827V2.setText(chatFooter.getContext().getResources().getString(C0966R.string.h8d));
            chatFooter.f211827V2.setVisibility(0);
            chatFooter.f211793O2.setActivated(false);
            chatFooter.f211807R2.setImageDrawable(C74933u4.m89768e(chatFooter.getContext(), C0966R.raw.icons_filled_voice2txt_cursor, chatFooter.getContext().getResources().getColor(C0966R.color.f2966ao)));
            chatFooter.f211899l3.setVisibility(0);
            chatFooter.f211899l3.setImageResource(C0966R.raw.icons_filled_done);
            chatFooter.f211899l3.setIconColor(chatFooter.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_1));
            View view3 = chatFooter.f211895k3;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNoContentTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNoContentTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            chatFooter.f211802Q2.setVisibility(8);
            chatFooter.f211797P2.setVisibility(8);
        } else {
            chatFooter.f211750D2.mo98691b(3);
            chatFooter.f211817T2.setVisibility(8);
            chatFooter.f211891j3.setEnabled(false);
            chatFooter.f211797P2.setText("");
            chatFooter.f211827V2.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            chatFooter.f211827V2.setText(chatFooter.getContext().getResources().getString(C0966R.string.h8c));
            chatFooter.f211827V2.setVisibility(0);
            chatFooter.f211793O2.setActivated(false);
            chatFooter.f211807R2.setImageDrawable(C74933u4.m89768e(chatFooter.getContext(), C0966R.raw.icons_filled_voice2txt_cursor, chatFooter.getContext().getResources().getColor(C0966R.color.f2966ao)));
            chatFooter.f211899l3.setVisibility(0);
            chatFooter.f211899l3.setImageResource(C0966R.raw.icons_filled_done);
            chatFooter.f211899l3.setIconColor(chatFooter.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_1));
            View view5 = chatFooter.f211895k3;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNetworkTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "showNetworkTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            chatFooter.f211802Q2.setVisibility(8);
            chatFooter.f211797P2.setVisibility(8);
        }
    }

    /* renamed from: e */
    public static boolean m85251e(ChatFooter chatFooter, String str) {
        SharedPreferences.Editor putLong;
        if (chatFooter.f211744C.getTag() == null || !(chatFooter.f211744C.getTag() instanceof C72963f4) || !chatFooter.f211739B.isShown() || !chatFooter.f211744C.isShown() || Util.isNullOrNil(str)) {
            return false;
        }
        C72963f4 f4Var = (C72963f4) chatFooter.f211744C.getTag();
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(f4Var.getMsgId());
        if ((b002.f230723F & 4) == 4 || b002.getType() == 10000) {
            Log.m105920e("MicroMsg.ChatFooter", "msg is revoked!");
            return false;
        }
        String b = chatFooter.f211826V1.mo100532b();
        String filterString = Util.getFilterString(str);
        if (f4Var.f212669H1 == 1 && !Util.isNullOrNil(f4Var.f212668G1)) {
            String str2 = f4Var.f212668G1;
            MultiProcessMMKV multiProcessMMKV = C72922q.f212537a;
            C87412m.m108594g(str2, "key");
            try {
                long c = C31543z5.m39453c();
                MultiProcessMMKV multiProcessMMKV2 = C72922q.f212537a;
                if (!(multiProcessMMKV2 == null || (putLong = multiProcessMMKV2.putLong(str2, c)) == null)) {
                    putLong.apply();
                }
                Log.m105924i("MicroMsg.BizHalfScreenChattingUtil", "markSendBizArticleWithQuote  k:" + str2 + "  v:" + c);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.BizHalfScreenChattingUtil", e, "markSendBizArticleWithQuote", new Object[0]);
            }
        }
        ((C78135c) C86312j.m106911c(C78135c.class)).Ea0(f4Var, C72695v.m85061c(f4Var.getType()), b, C78521a.m94853e(f4Var), filterString, chatFooter.mo100396e0(b, 0), chatFooter.mo100393c0(b, filterString));
        chatFooter.mo100340A0();
        return true;
    }

    /* renamed from: f */
    public static boolean m85252f(ChatFooter chatFooter, String str, boolean z) {
        Object obj;
        Class cls = C77815b.class;
        if (!chatFooter.mo100446q0()) {
            ChatFooter$$i1 chatFooter$$i1 = chatFooter.f211826V1;
            if (chatFooter$$i1 == null || Util.isNullOrNil(chatFooter$$i1.mo100532b())) {
                Log.m105924i("MicroMsg.ChatFooter", "ifInterceptGroupSolitatireMsg username == null");
            } else {
                try {
                    String b = chatFooter.f211826V1.mo100532b();
                    if (((C75698i0) C86312j.m106911c(C75698i0.class)).Mq0(b) && z) {
                        chatFooter.f211776K.mo109223a();
                        try {
                            str = ((C79305f) C86312j.m106911c(C79305f.class)).mo109308IF(str);
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.ChatFooter", "ifInterceptGroupSolitatireMsg() emojiSoftBank2Unicode %s %s", e.getClass().getSimpleName(), e.getMessage());
                        }
                        Pair<Integer, C79013a> j = ((C77815b) C86312j.m106911c(cls)).vx0().mo108672j(str, 1, b);
                        if (((Integer) j.first).intValue() > 0 && (obj = j.second) != null) {
                            C79013a aVar = (C79013a) obj;
                            String s = C75592q0.m90789s();
                            C101611g<Integer, C79013a> gVar = C78747b.f230457a;
                            C78747b.m95106f(b, s, aVar, (long) C31543z5.m39455e(), true);
                            C79013a A = C78747b.m95089A(aVar, ((C77815b) C86312j.m106911c(cls)).xx0().mo108980Ow(b, aVar.field_key, true), C75592q0.m90789s(), 1);
                            if (A == null) {
                                Log.m105924i("MicroMsg.ChatFooter", "ifInterceptGroupSolitatireMsg storageGroupSolitatire == null");
                            } else {
                                C78747b.m95108h(A);
                                C79013a J = C78747b.m95098J(aVar, chatFooter.f211776K.f232533r, A);
                                if (J.f232008P) {
                                    C78747b.m95126z(J);
                                }
                                J.field_lastActiveTime = (long) C31543z5.m39455e();
                                C78747b.m95099K(J, true, true);
                                ((C77815b) C86312j.m106911c(cls)).yx0(str, b, aVar, J, A, A.field_active == 0);
                                C72825s0 s0Var = chatFooter.f211780L;
                                if (s0Var != null) {
                                    s0Var.mo100657s(str);
                                }
                                C79206x xVar = chatFooter.f211776K;
                                xVar.f232525j = "";
                                xVar.f232533r = null;
                                xVar.f232527l = null;
                                chatFooter.mo100340A0();
                                return true;
                            }
                        }
                    }
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.ChatFooter", "ifInterceptGroupSolitatireMsg() Exception:%s %s", e2.getClass().getSimpleName(), e2.getMessage());
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public static void m85253g(ChatFooter chatFooter, String str) {
        chatFooter.getClass();
        if (((C101980n) C86312j.m106911c(C101980n.class)).n30()) {
            String str2 = chatFooter.f211753E1;
            long e = (long) C31543z5.m39455e();
            ((C119157j) C119157j.f356862d).mo183876g(new C72851z(chatFooter, str, str2, e), "WebSearchReportLogic.TagSearchReport");
            chatFooter.f211753E1 = ((C65873e) C86312j.m106911c(C65873e.class)).ep0(73);
        }
    }

    private int getDefaultLangType() {
        String currentLanguage = LocaleUtil.getCurrentLanguage(getContext());
        if (currentLanguage.equals("zh_CN") || currentLanguage.equals("zh_HK") || currentLanguage.equals("zh_TW")) {
            return 1;
        }
        return currentLanguage.equals("en") ? 4 : 0;
    }

    private int getTransLangTypeByTalker() {
        boolean z = false;
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("voice2txt_sp", 0);
        int i = sharedPreferences.getInt(this.f211858d, 0);
        LanguageChoiceLayout languageChoiceLayout = this.f211822U2;
        if (languageChoiceLayout != null) {
            Iterator it = ((ArrayList) languageChoiceLayout.f207393i.f223662d).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C76381b.C76382a) it.next()).f223666b == i) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z && (i = getDefaultLangType()) != 0) {
                sharedPreferences.edit().putInt(this.f211858d, i).apply();
            }
            return i;
        }
        int defaultLangType = getDefaultLangType();
        if (defaultLangType != 0) {
            sharedPreferences.edit().putInt(this.f211858d, defaultLangType).apply();
        }
        return defaultLangType;
    }

    /* renamed from: h */
    public static boolean m85254h(ChatFooter chatFooter) {
        chatFooter.getClass();
        if (!C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_CHATFOOT_TRANS_IN_WRITE_TIP_HAS_SHOW_BOOLEAN_SYNC, false)) {
            return false;
        }
        ChatFooter$$i1 chatFooter$$i1 = chatFooter.f211826V1;
        if (!(chatFooter$$i1 == null || chatFooter$$i1.mo100531a() == null)) {
            if (((C79365j) chatFooter.f211826V1.mo100531a().f193278b.mo102812a(C79365j.class)).mo70105e4()) {
                return false;
            }
            if (((C79377q) chatFooter.f211826V1.mo100531a().f193278b.mo102812a(C79377q.class)).mo70131k2()) {
                return false;
            }
            return !((C79366k) chatFooter.f211826V1.mo100531a().f193278b.mo102812a(C79366k.class)).mo70129g1();
        }
    }

    /* renamed from: i */
    public static boolean m85255i(ChatFooter chatFooter, Editable editable) {
        chatFooter.getClass();
        return editable != null && editable.length() > 0 && editable.toString().trim().length() > 0;
    }

    /* renamed from: j */
    public static boolean m85256j(ChatFooter chatFooter, boolean z) {
        boolean z2 = true;
        if (!z) {
            if (chatFooter.f211888j.getTag(C0966R.C0970id.b7p) == null) {
                z2 = false;
            }
            return z2;
        }
        chatFooter.setDelaySendAnim(false);
        return false;
    }

    /* renamed from: k */
    public static void m85257k(ChatFooter chatFooter) {
        ChatFooter chatFooter2 = chatFooter;
        SoundWaveView.C19411i iVar = SoundWaveView.C19411i.MINI;
        Log.m105919d("MicroMsg.ChatFooter", "triggerModeChange, lastMode: %s, nowMode: %s.", chatFooter2.f211920p4, chatFooter2.f211914o4);
        ChatFooter$$l1 chatFooter$$l1 = chatFooter2.f211920p4;
        if (chatFooter$$l1 != chatFooter2.f211914o4) {
            int ordinal = chatFooter$$l1.ordinal();
            if (ordinal == 0) {
                chatFooter2.f211908n3.animate().translationY((float) chatFooter2.f211904m4).alpha(0.0f).setDuration(100).withStartAction(new C30696q0(chatFooter2)).withEndAction(new C72818p0(chatFooter2)).start();
                chatFooter2.f211913o3.animate().translationY((float) chatFooter2.f211904m4).alpha(0.0f).setDuration(100).start();
                chatFooter2.f211919p3.animate().translationY((float) chatFooter2.f211904m4).setDuration(100).start();
            } else if (ordinal == 1) {
                chatFooter.mo100431j0();
            } else if (ordinal == 2) {
                chatFooter.mo100432k0();
            }
            int ordinal2 = chatFooter2.f211914o4.ordinal();
            if (ordinal2 == 0) {
                chatFooter.mo100436o();
            } else if (ordinal2 == 1) {
                View view = chatFooter2.f211866e3;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "activeNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "activeNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                chatFooter2.f211856c3.mo104517q(chatFooter.getResources().getColor(C0966R.color.f3131gg), 0.9f);
                chatFooter2.f211848a3.setBackgroundDrawable(chatFooter.getResources().getDrawable(C0966R.C0969drawable.akg));
                chatFooter2.f211848a3.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).start();
                chatFooter.mo100379U0();
                chatFooter2.f211836X2.setVisibility(8);
                chatFooter2.f211802Q2.mo25107h(iVar);
                chatFooter2.f211827V2.setVisibility(8);
                chatFooter2.f211812S2.setVisibility(8);
                chatFooter2.f211797P2.setVisibility(8);
                chatFooter2.f211807R2.setImageDrawable(C74933u4.m89768e(chatFooter.getContext(), C0966R.raw.icons_filled_voice2txt_cursor, chatFooter.getContext().getResources().getColor(C0966R.color.f2966ao)));
                chatFooter2.f211807R2.animate().translationX(-((((float) C75044y4.m89990b(chatFooter.getContext()).x) / 2.0f) - ((float) C74942w4.m89784a(chatFooter.getContext(), 75)))).setDuration(150).start();
                chatFooter2.f211793O2.setActivated(false);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) chatFooter2.f211832W2.getLayoutParams();
                layoutParams.removeRule(21);
                layoutParams.removeRule(12);
                layoutParams.addRule(13);
                chatFooter2.f211832W2.requestLayout();
                chatFooter.mo100498v();
                chatFooter.mo100500w();
            } else if (ordinal2 == 2) {
                C71562c cVar = chatFooter2.f211750D2;
                int i = chatFooter2.f211738A4;
                cVar.f207377l = i;
                chatFooter2.mo100382W0(i, true, chatFooter2.f211741B2, false);
                View view3 = chatFooter2.f211871f3;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "activeNewVoice2txtTrans", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "activeNewVoice2txtTrans", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                chatFooter2.f211861d3.mo104517q(chatFooter.getResources().getColor(C0966R.color.f3131gg), 0.9f);
                chatFooter2.f211852b3.setBackgroundDrawable(chatFooter.getResources().getDrawable(C0966R.C0969drawable.akg));
                chatFooter2.f211852b3.animate().scaleX(1.2f).scaleY(1.2f).setDuration(150).start();
                chatFooter2.f211836X2.setVisibility(8);
                chatFooter2.f211827V2.setVisibility(8);
                chatFooter2.f211797P2.setVisibility(0);
                chatFooter2.f211807R2.setImageDrawable(C74933u4.m89768e(chatFooter.getContext(), C0966R.raw.icons_filled_voice2txt_cursor, chatFooter.getContext().getResources().getColor(C0966R.color.f2957ad)));
                chatFooter2.f211807R2.animate().translationX((((float) C75044y4.m89990b(chatFooter.getContext()).x) / 2.0f) - ((float) C74942w4.m89784a(chatFooter.getContext(), 75))).setDuration(150).start();
                chatFooter2.f211793O2.setActivated(true);
                if (chatFooter2.f211841Y3 < 10) {
                    chatFooter.mo100367O0();
                } else {
                    chatFooter2.f211802Q2.setVisibility(0);
                    chatFooter2.f211812S2.setVisibility(8);
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) chatFooter2.f211832W2.getLayoutParams();
                    layoutParams2.addRule(21);
                    layoutParams2.addRule(12);
                    layoutParams2.removeRule(13);
                    chatFooter2.f211832W2.requestLayout();
                    ((RelativeLayout.LayoutParams) chatFooter2.f211802Q2.getLayoutParams()).bottomMargin = C74942w4.m89784a(chatFooter.getContext(), 8);
                    chatFooter2.f211802Q2.requestLayout();
                    chatFooter2.f211802Q2.mo25107h(iVar);
                }
                chatFooter.mo100498v();
                chatFooter.mo100500w();
            }
        }
    }

    /* renamed from: l */
    public static void m85258l(ChatFooter chatFooter) {
        chatFooter.getClass();
        Log.m105918d("MicroMsg.ChatFooter", "newVoice2txt, dismissThenResetNewVoice2txt.");
        C76901s0 s0Var = chatFooter.f211782L2;
        if (s0Var != null && s0Var.isShowing()) {
            if (chatFooter.f211917p1) {
                chatFooter.f211834X0.hideSoftInputFromWindow(chatFooter.f211797P2.getWindowToken(), 0);
            }
            chatFooter.f211782L2.dismiss();
        }
    }

    /* renamed from: m */
    public static void m85259m(ChatFooter chatFooter) {
        chatFooter.f211948v2.setIconColor(chatFooter.getResources().getColor(C0966R.color.f2975b6));
        chatFooter.f211953w2.setTextColor(chatFooter.getResources().getColor(C0966R.color.al_));
        chatFooter.f211943u2.setBackgroundDrawable(chatFooter.getResources().getDrawable(C0966R.C0969drawable.azw));
        chatFooter.f211943u2.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).start();
    }

    /* renamed from: n */
    public static void m85260n(ChatFooter chatFooter) {
        chatFooter.f211933s2.setIconColor(chatFooter.getResources().getColor(C0966R.color.f2975b6));
        chatFooter.f211938t2.setTextColor(chatFooter.getResources().getColor(C0966R.color.al_));
        chatFooter.f211928r2.setBackgroundDrawable(chatFooter.getResources().getDrawable(C0966R.C0969drawable.azt));
        chatFooter.f211928r2.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).start();
    }

    /* access modifiers changed from: private */
    public void setDelaySendAnim(boolean z) {
        this.f211888j.setTag(C0966R.C0970id.b7p, z ? Boolean.TRUE : null);
    }

    private void setNewVoice2TxtCountDown(int i) {
        if (i > 60 || i < 0) {
            Log.m105929w("MicroMsg.ChatFooter", "skip by invalid quantity:%s", Integer.valueOf(i));
            return;
        }
        int ordinal = this.f211914o4.ordinal();
        if (ordinal == 0) {
            int i2 = 60 - i;
            int i3 = (int) (this.f211808R3 * ((float) i2));
            int min = Math.min(this.f211803Q3 + i3, this.f211798P3);
            this.f211837X3 = min;
            Log.m105919d("MicroMsg.ChatFooter", "voiceWidth:%s, duration:%s, offset:%s", Integer.valueOf(min), Integer.valueOf(i2), Integer.valueOf(i3));
            ValueAnimator duration = ValueAnimator.ofInt(new int[]{this.f211793O2.getWidth(), this.f211837X3}).setDuration(200);
            duration.addUpdateListener(new C72815o0(this));
            duration.start();
            if (i < 10) {
                mo100365N0();
            }
        } else if (ordinal == 2 && i < 10) {
            mo100367O0();
        }
        this.f211841Y3 = i;
    }

    /* renamed from: A */
    public final void mo100339A(int i, boolean z) {
        mo100341B(i, z, -1);
    }

    /* renamed from: A0 */
    public void mo100340A0() {
        if (!Util.isNullOrNil(this.f211748D.getText())) {
            this.f211748D.setText("");
        }
        this.f211752E.setImageBitmap((Bitmap) null);
        this.f211756F.setImageDrawable((Drawable) null);
        if (this.f211744C.getTag() != null) {
            this.f211744C.setTag((Object) null);
        }
        this.f211752E.setVisibility(8);
        this.f211756F.setVisibility(8);
        this.f211744C.setVisibility(8);
    }

    /* renamed from: B */
    public final void mo100341B(int i, boolean z, int i2) {
        boolean z2 = false;
        Log.m105925i("MicroMsg.ChatFooter", "configPanel: %s, %s, %s, %s, %s", Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(this.f211917p1), Boolean.valueOf(this.f211922q1), Boolean.valueOf(this.f211874g1));
        boolean z3 = this.f211922q1 || !this.f211874g1;
        boolean z4 = i == 1 && !this.f211917p1;
        boolean z5 = i != 1 && this.f211917p1;
        if (z3 || (!z4 && !z5)) {
            mo100384X0(i, z, i2);
        } else {
            this.f211889j1 = i;
        }
        if (z4) {
            this.f211942u1 = 0;
            post(new ChatFooter$$i0(this));
        }
        if (z5) {
            mo100429h0();
        }
        if (z3) {
            if (i == 1) {
                z2 = true;
            }
            this.f211917p1 = z2;
        }
    }

    /* renamed from: B0 */
    public void mo100342B0() {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_NEW_VOICE2TXT_NEED_GUIDE_OPERATION_BOOLEAN_SYNC;
        this.f211915p.setBackgroundResource(C0966R.C0969drawable.a_z);
        this.f211915p.setText(C0966R.string.b5r);
        if (!this.f211774J2) {
            this.f211846a1 = false;
            C72825s0 s0Var = this.f211780L;
            if (s0Var != null) {
                this.f211750D2.f207375j = s0Var.mo100653b();
                if (!this.f211842Z0) {
                    View view = this.f211815T0;
                    if (view == null || view.getVisibility() != 0) {
                        this.f211780L.mo100648C();
                        return;
                    }
                    this.f211750D2.mo98691b(2);
                    this.f211780L.mo100646A();
                } else if (ChatFooter$$r1.MODE_INVALID != this.f211762G2) {
                    this.f211857c4 = true;
                    C76901s0 s0Var2 = this.f211957x0;
                    if (s0Var2 != null && s0Var2.isShowing()) {
                        if (ChatFooter$$r1.MODE_CANCEL == this.f211762G2) {
                            Log.m105924i("MicroMsg.ChatFooter", "do not send voice.");
                            this.f211750D2.mo98691b(2);
                            this.f211780L.mo100646A();
                            return;
                        }
                        Log.m105924i("MicroMsg.ChatFooter", "trans voice to txt.");
                        this.f211780L.mo100647B();
                        String a = this.f211780L.mo100652a();
                        long b = this.f211780L.mo100653b();
                        Log.m105925i("transvoice", "fileName: %s, voiceLen: %d.", a, Long.valueOf(b));
                        if (NetStatusUtil.isConnected(getContext())) {
                            LinkedHashMap<String, C99847f.C99848a> linkedHashMap = this.f211741B2.f292573b;
                            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                                C76259g gVar = this.f211970z2;
                                gVar.getClass();
                                if (!Util.isNullOrNil(a)) {
                                    gVar.f223399D = a;
                                    C87412m.m108591d(a);
                                    C78603a.f230231a = a;
                                }
                                C76259g gVar2 = this.f211970z2;
                                gVar2.f223398C = b;
                                gVar2.f223408M = this.f211858d;
                                gVar2.show();
                                C76259g gVar3 = this.f211970z2;
                                C99847f fVar = this.f211741B2;
                                gVar3.getClass();
                                C87412m.m108594g(fVar, "container");
                                Window window = gVar3.getWindow();
                                if (window != null) {
                                    window.setDimAmount(0.5f);
                                }
                                MMBottomSheetBehavior<View> mMBottomSheetBehavior = gVar3.f223412R;
                                if (mMBottomSheetBehavior != null) {
                                    mMBottomSheetBehavior.mo143309A(3);
                                }
                                gVar3.f223423h = false;
                                gVar3.f223410P = false;
                                int i = gVar3.f223409N.getInt(gVar3.f223408M, 0);
                                C8840a aVar2 = gVar3.f223405J;
                                C87412m.m108591d(aVar2);
                                ArrayList<Integer> arrayList = aVar2.f28063j;
                                C87412m.m108591d(arrayList);
                                if (arrayList.contains(Integer.valueOf(i))) {
                                    gVar3.f223437x = i;
                                } else {
                                    C8840a aVar3 = gVar3.f223405J;
                                    C87412m.m108591d(aVar3);
                                    ArrayList<Integer> arrayList2 = aVar3.f28063j;
                                    C87412m.m108591d(arrayList2);
                                    if (arrayList2.size() > 0) {
                                        C8840a aVar4 = gVar3.f223405J;
                                        C87412m.m108591d(aVar4);
                                        ArrayList<Integer> arrayList3 = aVar4.f28063j;
                                        C87412m.m108591d(arrayList3);
                                        Integer num = arrayList3.get(0);
                                        C87412m.m108593f(num, "languageChoiceDialog!!.langTypeArr!![0]");
                                        gVar3.f223437x = num.intValue();
                                    } else {
                                        String currentLanguage = LocaleUtil.getCurrentLanguage(gVar3.getContext());
                                        if (currentLanguage != null) {
                                            int hashCode = currentLanguage.hashCode();
                                            if (hashCode != 3241) {
                                                if (hashCode == 115861276 ? currentLanguage.equals("zh_CN") : !(hashCode == 115861428 ? !currentLanguage.equals("zh_HK") : hashCode != 115861812 || !currentLanguage.equals("zh_TW"))) {
                                                    gVar3.f223437x = 1;
                                                }
                                            } else if (currentLanguage.equals("en")) {
                                                gVar3.f223437x = 4;
                                            }
                                        }
                                    }
                                }
                                gVar3.f223421f.f207377l = gVar3.f223437x;
                                gVar3.mo106511L();
                                MMHandler mMHandler = gVar3.f223407L;
                                if (mMHandler != null) {
                                    mMHandler.sendEmptyMessageDelayed(5000, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                                }
                                MTimerHandler mTimerHandler = gVar3.f223403H;
                                if (mTimerHandler != null) {
                                    mTimerHandler.startTimer(500);
                                }
                                gVar3.f223439y = fVar;
                                C71561b bVar = new C71561b(fVar, gVar3.f223437x, new C76282z(gVar3));
                                gVar3.f223436w = bVar;
                                bVar.mo98689c();
                                this.f211932s1 = false;
                                return;
                            }
                            this.f211750D2.mo98691b(3);
                            Context context = getContext();
                            C77389a aVar5 = new C77389a();
                            aVar5.f225660q = getResources().getString(C0966R.string.kcx);
                            aVar5.f225663t = getResources().getString(C0966R.string.kcy);
                            aVar5.f225638U = getResources().getColor(C0966R.color.Link_100);
                            aVar5.f225620C = new ChatFooter$$r0(this, a);
                            aVar5.f225668y = false;
                            C77398g gVar4 = new C77398g(context, C0966R.style.a66);
                            gVar4.mo107525e(aVar5);
                            gVar4.show();
                            return;
                        }
                        this.f211750D2.mo98691b(4);
                        Context context2 = getContext();
                        C77389a aVar6 = new C77389a();
                        aVar6.f225660q = getResources().getString(C0966R.string.h7j);
                        aVar6.f225663t = getResources().getString(C0966R.string.h7l);
                        aVar6.f225638U = getResources().getColor(C0966R.color.Link_100);
                        aVar6.f225664u = getResources().getString(C0966R.string.h7k);
                        aVar6.f225620C = new ChatFooter$$s0(this, a, b);
                        aVar6.f225621D = new ChatFooter$$u0(this, a);
                        C77398g gVar5 = new C77398g(context2, C0966R.style.a66);
                        gVar5.mo107525e(aVar6);
                        gVar5.show();
                    }
                } else {
                    this.f211780L.mo100648C();
                }
            }
        } else if (!this.f211867e4) {
            this.f211867e4 = true;
            C72825s0 s0Var3 = this.f211780L;
            if (s0Var3 != null) {
                this.f211750D2.f207375j = s0Var3.mo100653b();
                C76901s0 s0Var4 = this.f211782L2;
                if (s0Var4 != null && s0Var4.isShowing()) {
                    ChatFooter$$l1 chatFooter$$l1 = ChatFooter$$l1.MODE_CANCEL;
                    ChatFooter$$l1 chatFooter$$l12 = this.f211914o4;
                    if (chatFooter$$l1 == chatFooter$$l12) {
                        this.f211944u3 = false;
                        this.f211780L.mo100646A();
                        this.f211750D2.mo98691b(2);
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.FALSE);
                    } else if (ChatFooter$$l1.MODE_TRANS == chatFooter$$l12) {
                        if (this.f211862d4 <= 0) {
                            this.f211862d4 = (int) this.f211780L.mo100653b();
                        }
                        if (!Util.isNullOrNil(this.f211780L.mo100652a())) {
                            String a2 = this.f211780L.mo100652a();
                            C87412m.m108594g(a2, "<set-?>");
                            C78603a.f230233c = a2;
                        }
                        this.f211780L.mo100647B();
                        int a3 = C74942w4.m89784a(getContext(), 20);
                        this.f211797P2.setSelection((this.f211797P2.getText() == null || this.f211797P2.getText().length() <= 0) ? 0 : this.f211797P2.getText().length());
                        this.f211797P2.setPadding(a3, a3, a3, a3);
                        this.f211844Z2.setVisibility(8);
                        this.f211836X2.setVisibility(8);
                        this.f211903m3.setVisibility(4);
                        this.f211876g3.setVisibility(0);
                        this.f211817T2.setVisibility(0);
                        C78603a.f230234d = true;
                        this.f211812S2.setVisibility(8);
                        this.f211802Q2.setVisibility(8);
                        this.f211967y4.sendEmptyMessageDelayed(5000, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.FALSE);
                    } else if (ChatFooter$$l1.MODE_VOICE == chatFooter$$l12) {
                        this.f211944u3 = false;
                        this.f211780L.mo100648C();
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEW_VOICE2TXT_NEED_GUIDE_VOICE_BOOLEAN_SYNC, Boolean.FALSE);
                    }
                }
            }
        }
    }

    /* renamed from: C */
    public boolean mo100343C(C72963f4 f4Var) {
        C72825s0 s0Var = this.f211780L;
        if (s0Var != null) {
            s0Var.mo100650E();
        }
        this.f211744C.setTag(f4Var);
        this.f211838Y0 = 1;
        mo100375S0(true);
        this.f211915p.setVisibility(8);
        mo100394c1(C0966R.C0969drawable.f4804nd);
        VoiceInputPanel voiceInputPanel = this.f211873g;
        if (voiceInputPanel != null) {
            voiceInputPanel.setVisibility(8);
            this.f211864e1 = false;
            this.f211873g.mo25282l();
        }
        mo100377T0();
        mo100501w0(true);
        mo100504y("");
        return true;
    }

    /* renamed from: C0 */
    public void mo100344C0(ChatFooter$$o1 chatFooter$$o1) {
        post(new ChatFooter$$d0(this, chatFooter$$o1));
    }

    /* renamed from: D */
    public void mo100345D() {
        if (this.f211868f != null) {
            Log.m105924i("MicroMsg.ChatFooter", "jacks chat footer destroy smiley panel");
            this.f211868f.mo100200l();
            this.f211868f.mo100189b();
            this.f211868f.animate().cancel();
            this.f211868f = null;
        }
        VoiceInputPanel voiceInputPanel = this.f211873g;
        if (voiceInputPanel != null) {
            voiceInputPanel.mo25276f();
            this.f211873g = null;
            this.f211864e1 = false;
        }
        C72825s0 s0Var = this.f211780L;
        if (s0Var != null) {
            s0Var.release();
        }
        C72806l1 l1Var = this.f211772J;
        if (l1Var != null) {
            ((C72843y1) l1Var).f212284h = null;
            ((C72843y1) l1Var).f212283g = null;
            ((C72843y1) l1Var).mo100683b();
        }
        if (this.f211957x0 != null) {
            BlurView blurView = this.f211885i2;
            if (blurView != null) {
                blurView.getBlurController().destroy();
            }
            BlurView blurView2 = this.f211965y2;
            if (blurView2 != null) {
                blurView2.getBlurController().destroy();
            }
        }
        Log.m105924i("MicroMsg.ChatFooter", "jacks destroy chat footer.");
        this.f211888j.destroy();
    }

    /* renamed from: D0 */
    public final void mo100346D0() {
        AndroidChatInputStruct androidChatInputStruct = this.f211785M1;
        if (androidChatInputStruct != null) {
            androidChatInputStruct.f194126h = 0;
            androidChatInputStruct.f194124f = 0;
            androidChatInputStruct.f194125g = 0;
            androidChatInputStruct.f194127i = 0;
            androidChatInputStruct.f194122d = 0;
            androidChatInputStruct.mo86048e("FirstInputTimeStampMs", 0);
            androidChatInputStruct.f194123e = 0;
            androidChatInputStruct.mo86048e("LastInputTimeStampMs", 0);
        }
    }

    /* renamed from: E */
    public void mo100347E() {
        AppPanel appPanel = this.f211878h;
        appPanel.f211695I = true;
        appPanel.f211687A.f212179w.f212183a = false;
        appPanel.mo100316o();
    }

    /* renamed from: E0 */
    public void mo100348E0(boolean z, long j) {
        if (this.f211744C.getTag() != null && (this.f211744C.getTag() instanceof C72963f4) && Util.isEqual(j, ((C72963f4) this.f211744C.getTag()).getMsgId())) {
            MMHandlerThread.postToMainThread(new ChatFooter$$c1(this, z));
        }
    }

    /* renamed from: F */
    public void mo100349F() {
        AppPanel appPanel = this.f211878h;
        appPanel.f211687A.f212157a.f212183a = false;
        appPanel.mo100316o();
    }

    /* renamed from: F0 */
    public void mo100350F0(int i, boolean z, int i2, int i3) {
        mo100391b0();
        ChattingScrollLayout chattingScrollLayout = this.f211893k1;
        if (chattingScrollLayout == null) {
            int i4 = this.f211884i1;
            if (i4 == 0 || i4 == 1) {
                this.f211936t.setVisibility(8);
            }
            Log.m105920e("MicroMsg.ChatFooter", "scrollParent: scrollParent is not ChattingScrollLayout");
        } else if (!this.f211947v1 || this.f211884i1 != 1) {
            chattingScrollLayout.mo100586a(i, z, i2, i3);
        } else {
            chattingScrollLayout.mo100586a(0, false, i2, i3);
        }
    }

    /* renamed from: G */
    public void mo100351G() {
        AppPanel appPanel = this.f211878h;
        appPanel.f211687A.f212174r.f212183a = false;
        appPanel.mo100316o();
    }

    /* renamed from: G0 */
    public void mo100352G0(String str, int i, boolean z) {
        boolean z2;
        C79206x xVar = this.f211776K;
        if (xVar != null) {
            z2 = xVar.f232524i;
            xVar.f232524i = false;
        } else {
            z2 = false;
        }
        if (z2) {
            Log.m105924i("MicroMsg.ChatFooter", "setLastText() isBackFromGroupSolitatire");
        } else if (!z || !(str == null || str.length() == 0 || this.f211888j == null)) {
            this.f211799Q = true;
            this.f211888j.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), str, this.f211888j.getTextSize()));
            this.f211799Q = false;
            if (i < 0 || i > this.f211888j.getText().length()) {
                C74974a aVar = this.f211888j;
                aVar.setSelection(aVar.getText().length());
                return;
            }
            this.f211888j.setSelection(i);
        } else {
            this.f211888j.setText("");
            mo100346D0();
        }
    }

    /* renamed from: H */
    public void mo100353H() {
        AppPanel appPanel = this.f211878h;
        appPanel.f211687A.f212161e.f212183a = false;
        appPanel.mo100316o();
    }

    /* renamed from: H0 */
    public void mo100354H0(int i, boolean z) {
        mo100503x0(i);
        Class cls = C79353f1.class;
        ChatFooter$$i1 chatFooter$$i1 = this.f211826V1;
        boolean z2 = false;
        if (!(chatFooter$$i1 == null || chatFooter$$i1.mo100531a() == null)) {
            if (i == 1) {
                ((C79353f1) this.f211826V1.mo100531a().f193278b.mo102812a(cls)).mo102518P4();
            } else if (i != 2) {
                setVisibility(0);
            } else {
                ((C79353f1) this.f211826V1.mo100531a().f193278b.mo102812a(cls)).mo102536q5();
            }
        }
        if (i != 1) {
            if (i != 2) {
                setVisibility(0);
                return;
            }
            mo100339A(0, true);
            mo100502x(false);
        } else if (z) {
            mo100501w0(true);
            mo100377T0();
            if (this.f211888j.length() > 0) {
                z2 = true;
            }
            mo100502x(z2);
        } else {
            if (this.f211888j.length() > 0) {
                z2 = true;
            }
            mo100502x(z2);
        }
    }

    /* renamed from: I */
    public void mo100355I() {
        AppPanel appPanel = this.f211878h;
        appPanel.f211687A.f212180x.f212183a = false;
        appPanel.mo100316o();
    }

    /* renamed from: I0 */
    public void mo100356I0() {
        this.f211750D2.mo98691b(1);
        this.f211915p.setEnabled(false);
        this.f211915p.setBackgroundResource(C0966R.C0969drawable.ao_);
        if (this.f211774J2) {
            this.f211782L2.update();
            this.f211971z3.sendEmptyMessageDelayed(0, 500);
            return;
        }
        if (this.f211957x0 != null) {
            View view = this.f211825V0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f211963y0.setVisibility(8);
            View view2 = this.f211820U0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f211957x0.update();
            this.f211746C2.dismiss();
        }
        this.f211971z3.sendEmptyMessageDelayed(0, 500);
    }

    /* renamed from: J */
    public void mo100357J(boolean z) {
        AppPanel appPanel = this.f211878h;
        boolean z2 = !z;
        appPanel.f211687A.f212177u.f212183a = z2;
        appPanel.mo100316o();
        Log.m105918d("MicroMsg.AppPanel", "enable " + appPanel.f211687A.f212177u.f212183a + " isMultiTalkEnable " + z2);
    }

    /* renamed from: J0 */
    public void mo100358J0(String str, Boolean bool, CharSequence charSequence) {
        Class cls = C76705f.class;
        if (bool.booleanValue()) {
            ((C76705f) C86312j.m106911c(cls)).mo106822J5(this.f211829W, str);
        } else {
            ((C76705f) C86312j.m106911c(cls)).mo106849z(this.f211829W, str);
        }
        setHint(charSequence);
        this.f211829W.setVisibility(0);
    }

    /* renamed from: K */
    public void mo100359K() {
        AppPanel appPanel = this.f211878h;
        appPanel.f211687A.f212154C.f212183a = false;
        appPanel.mo100316o();
        Log.m105918d("MicroMsg.AppPanel", "enable false isMusicChatPluginEnable " + appPanel.f211687A.f212155D.f212183a);
    }

    /* renamed from: K0 */
    public void mo100360K0(String str, String str2) {
        this.f211843Z1 = str;
        this.f211847a2 = str2;
        if (this.f211888j != null) {
            this.f211888j.getInputExtras(true).putInt("wechat_scene", C72996z1.m85820U5(str2) ? 2 : 1);
            this.f211888j.getInputExtras(true).putBoolean("if_support_new_wxkb", true);
            this.f211888j.getInputExtras(true).putLong("wechat_support_ability", 64424509471L);
        }
    }

    /* renamed from: L */
    public void mo100361L() {
        AppPanel appPanel = this.f211878h;
        appPanel.f211687A.f212152A.f212183a = false;
        appPanel.mo100316o();
    }

    /* renamed from: L0 */
    public void mo100362L0() {
        if (this.f211774J2) {
            this.f211802Q2.setVisibility(0);
            View view = this.f211929r3;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoiceRcdHintReady", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoiceRcdHintReady", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f211820U0;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoiceRcdHintReady", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoiceRcdHintReady", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f211963y0.setVisibility(0);
    }

    /* renamed from: M0 */
    public final void mo100363M0(boolean z) {
        boolean z2;
        if (this.f211946v == null) {
            Log.m105920e("MicroMsg.ChatFooter", "mAttachButton is null");
        } else if (this.f211951w != null) {
            if (z && getAppPanelUnCertainEnterArrayList() != null && getAppPanelUnCertainEnterArrayList().size() > 0) {
                Iterator<C72791h.C44607a> it = getAppPanelUnCertainEnterArrayList().iterator();
                while (true) {
                    z2 = true;
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    C72791h.C44607a next = it.next();
                    if (next.f120962z1 == 1) {
                        if (!MultiProcessMMKV.getMMKV("plus_uncertain_enter").getBoolean(next.f120961y1, false)) {
                            break;
                        }
                    }
                }
                if (z2) {
                    this.f211951w.setVisibility(0);
                    return;
                }
            }
            this.f211951w.setVisibility(8);
        }
    }

    /* renamed from: N */
    public void mo100364N() {
        AppPanel appPanel = this.f211878h;
        appPanel.f211687A.f212166j.f212183a = false;
        appPanel.mo100316o();
    }

    /* renamed from: N0 */
    public final void mo100365N0() {
        this.f211802Q2.setVisibility(8);
        this.f211812S2.setVisibility(0);
        this.f211812S2.setTextColor(getContext().getResources().getColor(C0966R.color.f3131gg));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f211832W2.getLayoutParams();
        layoutParams.addRule(13);
        layoutParams.removeRule(21);
        layoutParams.removeRule(12);
        this.f211812S2.setText(String.format(getContext().getResources().getString(C0966R.string.h8b), new Object[]{Integer.valueOf(this.f211841Y3)}));
        this.f211832W2.requestLayout();
    }

    /* renamed from: O */
    public void mo100366O() {
        AppPanel appPanel = this.f211878h;
        appPanel.f211687A.f212160d.f212183a = false;
        appPanel.mo100316o();
    }

    /* renamed from: O0 */
    public final void mo100367O0() {
        this.f211802Q2.setVisibility(8);
        this.f211812S2.setVisibility(0);
        this.f211812S2.setTextColor(getContext().getResources().getColor(C0966R.color.f3552xi));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f211832W2.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.addRule(21);
        layoutParams.addRule(12);
        this.f211812S2.setText(String.format(getContext().getResources().getString(C0966R.string.h8b), new Object[]{Integer.valueOf(this.f211841Y3)}));
        this.f211832W2.requestLayout();
    }

    /* renamed from: P */
    public void mo100368P() {
        AppPanel appPanel = this.f211878h;
        appPanel.f211687A.f212172p.f212183a = false;
        appPanel.mo100316o();
    }

    /* renamed from: P0 */
    public final void mo100369P0(boolean z, boolean z2) {
        int t;
        long j;
        C64623p81 p812;
        C64623p81 p813;
        Class cls = C76979h.class;
        String str = "";
        if (!z) {
            if (z2) {
                this.f211744C.setTag((Object) null);
                this.f211748D.setText(str);
                this.f211752E.setImageBitmap((Bitmap) null);
                this.f211756F.setImageDrawable((Drawable) null);
            }
            this.f211752E.setVisibility(8);
            this.f211756F.setVisibility(8);
            this.f211744C.setVisibility(8);
        } else if (this.f211744C.getTag() == null || !(this.f211744C.getTag() instanceof C72963f4)) {
            this.f211744C.setVisibility(8);
            this.f211752E.setVisibility(8);
            this.f211756F.setVisibility(8);
        } else {
            this.f211744C.setVisibility(0);
            C72963f4 f4Var = (C72963f4) this.f211744C.getTag();
            TextView textView = this.f211748D;
            C76979h hVar = (C76979h) C86312j.m106911c(cls);
            Context context = getContext();
            Context context2 = getContext();
            float textSize = this.f211748D.getTextSize();
            int i = C78521a.f230007a;
            StringBuilder sb = new StringBuilder();
            String e = C78521a.m94853e(f4Var);
            C76979h hVar2 = (C76979h) C86312j.m106911c(cls);
            if (e == null || e.length() <= 0) {
                e = "null";
            }
            sb.append(hVar2.yp0(context2, e, textSize));
            sb.append("：");
            boolean U5 = C72996z1.m85820U5(f4Var.mo108768t());
            Class cls2 = C60606n.class;
            Class cls3 = C75700k0.class;
            Class cls4 = C98450d.class;
            Context context3 = context2 == null ? MMApplicationContext.getContext() : context2;
            TextView textView2 = textView;
            switch (f4Var.getType()) {
                case 1:
                case 11:
                case 21:
                case 31:
                case 36:
                case 301989937:
                case 1107296305:
                    String content = f4Var.getContent();
                    if (U5) {
                        if (!(f4Var.mo108769t2() == 1) && (t = C75604z3.m90848t(content)) != -1) {
                            content = content.substring(t + 1);
                        }
                    }
                    if (str != null) {
                        str = str.trim();
                        break;
                    }
                    break;
                case 3:
                case 13:
                case 23:
                case 33:
                case 39:
                case 268435505:
                    str = context3.getString(C0966R.string.gx6);
                    break;
                case 34:
                    str = context3.getString(C0966R.string.gxd);
                    String content2 = f4Var.getContent();
                    try {
                        if (content2.endsWith("\n")) {
                            content2 = content2.substring(0, content2.length() - 1);
                        }
                        String[] split = content2.split(XVFSFile.PATH_SEPARATOR);
                        int i2 = (split.length != 4 || !C72996z1.m85811N4(split[0])) ? 0 : 1;
                        if (split.length > i2) {
                            String str2 = split[i2];
                        }
                        int i3 = i2 + 1;
                        j = split.length > i3 ? Util.getLong(split[i3], 0) : 0;
                        int i4 = i2 + 2;
                        if (split.length > i4) {
                            split[i4].equals("1");
                        }
                    } catch (Exception unused) {
                        Log.m105920e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
                        j = 0;
                    }
                    float F30 = ((C75415t) C86312j.m106911c(C75415t.class)).F30(j);
                    if (j > 0) {
                        str = str + context3.getResources().getString(C0966R.string.gxc, new Object[]{Integer.valueOf((int) F30)});
                        break;
                    }
                    break;
                case 42:
                    if (!f4Var.mo100975N3()) {
                        str = context3.getString(C0966R.string.gx9, new Object[]{str});
                        break;
                    } else {
                        C86709a0.m107528h();
                        str = context3.getString(C0966R.string.gx9, new Object[]{((C72972g4) ((C75700k0) C86709a0.m107533q(cls3)).mo96095LE()).Rv0(f4Var.getContent()).f212676b});
                        break;
                    }
                case 43:
                case 44:
                case 62:
                    str = context3.getString(C0966R.string.gxb);
                    break;
                case 47:
                    str = context3.getString(C0966R.string.gws);
                    break;
                case 48:
                    String string = context3.getString(C0966R.string.gwx);
                    C88144b.m109788f(FirebaseAnalytics.C113379b.LOCATION);
                    LocationServerEvent locationServerEvent = new LocationServerEvent();
                    LocationServerEvent.C67729a aVar = locationServerEvent.f193728d;
                    aVar.f193730a = 1;
                    aVar.f193733d = f4Var;
                    locationServerEvent.publish();
                    LocationServerEvent.C67730b bVar = locationServerEvent.f193729e;
                    String str3 = bVar.f193735b;
                    String str4 = bVar.f193734a;
                    if (!C78521a.m94857i(str3, context3)) {
                        String str5 = locationServerEvent.f193729e.f193734a;
                        if (!(str5 != null && !str5.equals(str) && !str5.equals("err_not_started"))) {
                            str = string;
                            break;
                        } else {
                            str = string + str4;
                            break;
                        }
                    } else {
                        str = string + str3;
                        break;
                    }
                    break;
                case 49:
                case 1048625:
                case 419430449:
                case 436207665:
                case 754974769:
                case 771751985:
                case 805306417:
                case 822083633:
                case 855638065:
                case 939524145:
                case 973078577:
                case 974127153:
                case 975175729:
                case 976224305:
                case 1090519089:
                case 1140850737:
                    C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
                    if (u != null) {
                        int i5 = u.f195582i;
                        if (i5 != 3) {
                            if (i5 == 4) {
                                str = context3.getString(C0966R.string.gxb);
                                break;
                            } else {
                                if (i5 != 5) {
                                    if (i5 != 6) {
                                        if (i5 != 50) {
                                            if (i5 != 51) {
                                                if (i5 == 87) {
                                                    str = context3.getString(C0966R.string.m8x);
                                                    break;
                                                } else {
                                                    if (i5 != 88) {
                                                        if (i5 != 2000) {
                                                            if (i5 == 2001) {
                                                                str = "1001".equals(u.f195604n1) ? context3.getString(C0966R.string.gwn) : context3.getString(C0966R.string.f361051gx0);
                                                                String str6 = f4Var.mo108769t2() == 1 ? u.f195584i1 : u.f195580h1;
                                                                if (str6 != null && str6.length() > 0) {
                                                                    str = str + str6;
                                                                    break;
                                                                }
                                                            } else {
                                                                switch (i5) {
                                                                    case 1:
                                                                    case 53:
                                                                    case 57:
                                                                        String str7 = u.f195570f;
                                                                        if (str7 != null && str7.length() > 0) {
                                                                            str = u.f195570f;
                                                                            break;
                                                                        }
                                                                    case 8:
                                                                        break;
                                                                    case 19:
                                                                        str = context3.getString(C0966R.string.gx7);
                                                                        String str8 = u.f195570f;
                                                                        if (str8 != null && str8.length() > 0) {
                                                                            str = str + u.f195570f;
                                                                            break;
                                                                        }
                                                                    case 24:
                                                                        str = context3.getString(C0966R.string.f361054gx3, new Object[]{C78521a.m94854f(u)});
                                                                        break;
                                                                    case 33:
                                                                    case 36:
                                                                    case 44:
                                                                    case 48:
                                                                        String str9 = u.f195570f;
                                                                        if (str9 != null && str9.length() > 0) {
                                                                            str = context3.getString(C0966R.string.gwp, new Object[]{u.f195570f});
                                                                            break;
                                                                        } else {
                                                                            str = context3.getString(C0966R.string.gwp, new Object[]{str});
                                                                            break;
                                                                        }
                                                                    case 60:
                                                                        str = context3.getString(C0966R.string.f361052gx1);
                                                                        String str10 = u.f195570f;
                                                                        if (str10 != null && str10.length() > 0) {
                                                                            str = str + u.f195570f;
                                                                            break;
                                                                        }
                                                                    case 63:
                                                                        break;
                                                                    case 65:
                                                                        str = context3.getResources().getString(C0966R.string.gwu);
                                                                        C60150a aVar2 = (C60150a) u.mo93555w(C60150a.class);
                                                                        if (!(aVar2 == null || (p813 = aVar2.f171697b) == null || (Util.isNullOrNil(p813.f184781g) && Util.isNullOrNil(aVar2.f171697b.f184782h)))) {
                                                                            if (!Util.isNullOrNil(aVar2.f171697b.f184781g)) {
                                                                                str = str + aVar2.f171697b.f184781g;
                                                                            }
                                                                            if (!Util.isNullOrNil(aVar2.f171697b.f184782h)) {
                                                                                str = (str + "·") + aVar2.f171697b.f184782h;
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 69:
                                                                        String str11 = u.f195574g;
                                                                        if (str11 != null && str11.length() > 0) {
                                                                            str = context3.getString(C0966R.string.gww, new Object[]{u.f195574g});
                                                                            break;
                                                                        } else {
                                                                            str = context3.getString(C0966R.string.gww, new Object[]{str});
                                                                            break;
                                                                        }
                                                                    case 74:
                                                                        break;
                                                                    case 76:
                                                                        break;
                                                                    case 82:
                                                                        str = context3.getString(C0966R.string.gxa, new Object[]{str});
                                                                        C60175i iVar = (C60175i) u.mo93555w(C60175i.class);
                                                                        if (iVar != null && !Util.isNullOrNil(iVar.f171712b.f182504p)) {
                                                                            str = str + iVar.f171712b.f182504p;
                                                                            break;
                                                                        }
                                                                    case 94:
                                                                        str = context3.getString(C0966R.string.gxa, new Object[]{str});
                                                                        C60176j jVar = (C60176j) u.mo93555w(C60176j.class);
                                                                        if (jVar != null && !Util.isNullOrNil(jVar.f171713b.f186328f)) {
                                                                            str = context3.getString(C0966R.string.bo9) + context3.getString(C0966R.string.d_i, new Object[]{Util.nullAsNil(jVar.f171713b.f186328f)});
                                                                            break;
                                                                        }
                                                                    case 98:
                                                                        str = ((C98450d) C86312j.m106911c(cls4)).mo137797al(context3, f4Var.getContent());
                                                                        break;
                                                                    case 101:
                                                                        break;
                                                                    case 2011:
                                                                        break;
                                                                    default:
                                                                        str = context3.getString(C0966R.string.gwr);
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        str = context3.getString(C0966R.string.gx5);
                                                        String str12 = u.f195532T1;
                                                        if (str12 != null && str12.length() > 0) {
                                                            str = str + u.f195532T1;
                                                            break;
                                                        }
                                                    }
                                                    str = context3.getResources().getString(C0966R.string.gwu);
                                                    C60151b bVar2 = (C60151b) u.mo93555w(C60151b.class);
                                                    if (!(bVar2 == null || (p812 = bVar2.f171698b) == null || (Util.isNullOrNil(p812.f184781g) && Util.isNullOrNil(bVar2.f171698b.f184782h)))) {
                                                        if (!Util.isNullOrNil(bVar2.f171698b.f184781g)) {
                                                            str = str + bVar2.f171698b.f184781g;
                                                        }
                                                        long j2 = Util.getLong(bVar2.f171698b.f184778d, 0);
                                                        if (!((C60606n) C86312j.m106911c(cls2)).mo85005G0(bVar2.f171698b) && !((C60606n) C86312j.m106911c(cls2)).mo85079pT(bVar2.f171698b.f184779e, (View) null, (View) null, j2)) {
                                                            str = context3.getString(C0966R.string.lv4, new Object[]{str});
                                                            break;
                                                        } else {
                                                            str = context3.getString(C0966R.string.m6t, new Object[]{str});
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                str = context3.getResources().getString(C0966R.string.gwu);
                                                C60166f fVar = (C60166f) u.mo93555w(C60166f.class);
                                                if (!(fVar == null || fVar.f171710b == null || ((Util.isNullOrNil(fVar.mo85179g()) && Util.isNullOrNil(fVar.f171710b.f185187h)) || Util.isNullOrNil(fVar.mo85179g())))) {
                                                    str = str + context3.getResources().getString(C0966R.string.mpd, new Object[]{fVar.mo85179g()});
                                                    break;
                                                }
                                            }
                                        } else {
                                            C60161e eVar = (C60161e) u.mo93555w(C60161e.class);
                                            if (eVar != null && !Util.isNullOrNil(eVar.f171704e)) {
                                                str = context3.getString(C0966R.string.gwv, new Object[]{eVar.f171704e});
                                                break;
                                            } else {
                                                str = context3.getString(C0966R.string.gwv, new Object[]{str});
                                                break;
                                            }
                                        }
                                    }
                                    String str13 = u.f195570f;
                                    if (str13 != null && str13.length() > 0) {
                                        str = context3.getString(C0966R.string.gwt, new Object[]{u.f195570f});
                                        break;
                                    } else {
                                        str = context3.getString(C0966R.string.gwt, new Object[]{str});
                                        break;
                                    }
                                }
                                String str14 = u.f195570f;
                                if (str14 != null && str14.length() > 0) {
                                    str = context3.getString(C0966R.string.gxa, new Object[]{u.f195570f});
                                    break;
                                } else {
                                    str = context3.getString(C0966R.string.gxa, new Object[]{str});
                                    break;
                                }
                            }
                        }
                        String str15 = u.f195570f;
                        if (str15 != null && str15.length() > 0) {
                            str = context3.getString(C0966R.string.f361053gx2, new Object[]{u.f195570f});
                            break;
                        } else {
                            str = context3.getString(C0966R.string.f361053gx2, new Object[]{str});
                            break;
                        }
                    }
                    break;
                case 66:
                    if (!f4Var.mo100975N3()) {
                        str = context3.getString(C0966R.string.gwq, new Object[]{str});
                        break;
                    } else {
                        C86709a0.m107528h();
                        str = context3.getString(C0966R.string.gwq, new Object[]{((C72972g4) ((C75700k0) C86709a0.m107533q(cls3)).mo96095LE()).Rv0(f4Var.getContent()).f212676b});
                        break;
                    }
                case 1040187441:
                    C68070l.C68072b u2 = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
                    String str16 = u2.f195570f;
                    if (str16 != null && str16.length() > 0) {
                        str = context3.getString(C0966R.string.f361053gx2, new Object[]{u2.f195570f});
                        break;
                    } else {
                        str = context3.getString(C0966R.string.f361053gx2, new Object[]{str});
                        break;
                    }
                case 1124073521:
                    str = ((C98450d) C86312j.m106911c(cls4)).mo137797al(context3, f4Var.getContent());
                    break;
                default:
                    str = context3.getString(C0966R.string.gwr);
                    break;
            }
            if (!Util.isNullOrNil(str)) {
                str = str.replace(10, ' ');
            }
            if (!Util.isNullOrNil(str)) {
                sb.append(((C76979h) C86312j.m106911c(cls)).yp0(context2, str, textSize));
            }
            textView2.setText(hVar.mo107057T1(context, sb));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f211748D.getLayoutParams();
            layoutParams.rightMargin = C74942w4.m89786c(getContext(), C0966R.dimen.f3749d0);
            layoutParams.topMargin = C74942w4.m89786c(getContext(), C0966R.dimen.f3700bt);
            layoutParams.removeRule(10);
            layoutParams.addRule(15);
            this.f211748D.setGravity(19);
            this.f211748D.setLayoutParams(layoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f211760G.getLayoutParams();
            marginLayoutParams.topMargin = C74942w4.m89786c(getContext(), C0966R.dimen.f3700bt);
            this.f211760G.setLayoutParams(marginLayoutParams);
            this.f211760G.setVisibility(8);
            this.f211752E.setVisibility(8);
            this.f211756F.setVisibility(8);
        }
    }

    /* renamed from: Q */
    public void mo100370Q(int i) {
        AppPanel appPanel = this.f211878h;
        appPanel.f211693G = true;
        appPanel.f211687A.f212176t.f212183a = false;
        appPanel.mo100316o();
        Log.m105925i("MicroMsg.AppPanel", "disableServiceLuckyMoney, scene %s, stack：%s", Integer.valueOf(i), Util.getStack().toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0aa6, code lost:
        if (r4 != 2) goto L_0x0b1d;
     */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo100371Q0(int r25) {
        /*
            r24 = this;
            r0 = r24
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q1 r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$q1.MODE_BLUR
            java.lang.Class<zj3.i> r2 = zj3.C79363i.class
            boolean r3 = r0.f211774J2
            r4 = 0
            java.lang.Float r5 = java.lang.Float.valueOf(r4)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r10 = -1
            java.lang.String r12 = "MicroMsg.ChatFooter"
            r13 = 14
            r14 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r9 = 1
            if (r3 == 0) goto L_0x07d4
            nj3.s0 r1 = r0.f211782L2
            if (r1 != 0) goto L_0x036f
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r1 = r0.f211826V1
            if (r1 == 0) goto L_0x0060
            ck3.b r1 = r1.mo100531a()
            if (r1 == 0) goto L_0x0060
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r1 = r0.f211826V1
            ck3.b r1 = r1.mo100531a()
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r2)
            if (r1 == 0) goto L_0x0060
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r1 = r0.f211826V1
            ck3.b r1 = r1.mo100531a()
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r2)
            zj3.i r1 = (zj3.C79363i) r1
            boolean r1 = r1.mo102362t0()
            if (r1 == 0) goto L_0x0060
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r1 = r0.f211826V1
            ck3.b r1 = r1.mo100531a()
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r2)
            zj3.i r1 = (zj3.C79363i) r1
            int r1 = r1.mo102349F3()
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            if (r1 != 0) goto L_0x0064
            r1 = -1
        L_0x0064:
            nj3.s0 r3 = new nj3.s0
            android.content.Context r8 = r24.getContext()
            r11 = 2131496884(0x7f0c0fb4, float:1.8617345E38)
            android.view.View r8 = android.view.View.inflate(r8, r11, r14)
            r3.<init>(r8, r10, r1, r9)
            r0.f211782L2 = r3
            r1 = 16
            r3.setSoftInputMode(r1)
            nj3.s0 r1 = r0.f211782L2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$m r3 = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$m
            r3.<init>(r0)
            r1.setOnDismissListener(r3)
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310211(0x7f093683, float:1.8238728E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f211786M2 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310233(0x7f093699, float:1.8238772E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f211790N2 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310207(0x7f09367f, float:1.823872E38)
            android.view.View r1 = r1.findViewById(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.f211793O2 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310213(0x7f093685, float:1.8238732E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.plugin.transvoice.ui.SoundWaveView r1 = (com.tencent.p014mm.plugin.transvoice.p324ui.SoundWaveView) r1
            r0.f211802Q2 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310203(0x7f09367b, float:1.8238711E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.f211797P2 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310202(0x7f09367a, float:1.823871E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f211807R2 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310212(0x7f093684, float:1.823873E38)
            android.view.View r1 = r1.findViewById(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310201(0x7f093679, float:1.8238707E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f211812S2 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310208(0x7f093680, float:1.8238722E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            r0.f211817T2 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310225(0x7f093691, float:1.8238756E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout r1 = (com.tencent.p014mm.plugin.transvoice.p324ui.LanguageChoiceLayout) r1
            r0.f211822U2 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310209(0x7f093681, float:1.8238724E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f211827V2 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310214(0x7f093686, float:1.8238734E38)
            android.view.View r1 = r1.findViewById(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.f211832W2 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310206(0x7f09367e, float:1.8238718E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f211836X2 = r1
            com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout r1 = r0.f211822U2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$n r3 = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$n
            r3.<init>(r0)
            r1.setSelectLanguageListener(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r0.f211817T2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$o r3 = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$o
            r3.<init>(r0)
            r1.setOnClickListener(r3)
            android.widget.EditText r1 = r0.f211797P2
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1.setMaxLines(r3)
            android.widget.EditText r1 = r0.f211797P2
            r1.setHorizontallyScrolling(r6)
            android.widget.EditText r1 = r0.f211797P2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q r3 = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q
            r3.<init>(r0)
            r1.setOnEditorActionListener(r3)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$r r1 = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$r
            r1.<init>(r0)
            r0.post(r1)
            android.widget.EditText r1 = r0.f211797P2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$s r3 = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$s
            r3.<init>(r0)
            r1.setOnTouchListener(r3)
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310210(0x7f093682, float:1.8238726E38)
            android.view.View r1 = r1.findViewById(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.f211840Y2 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310236(0x7f09369c, float:1.8238778E38)
            android.view.View r1 = r1.findViewById(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.f211844Z2 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310198(0x7f093676, float:1.8238701E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f211848a3 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310234(0x7f09369a, float:1.8238774E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f211852b3 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310199(0x7f093677, float:1.8238703E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            r0.f211856c3 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310235(0x7f09369b, float:1.8238776E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            r0.f211861d3 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310200(0x7f093678, float:1.8238705E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f211866e3 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310238(0x7f09369e, float:1.8238782E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f211871f3 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310237(0x7f09369d, float:1.823878E38)
            android.view.View r1 = r1.findViewById(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.f211876g3 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310216(0x7f093688, float:1.8238738E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f211881h3 = r1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$t r3 = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$t
            r3.<init>(r0)
            r1.setOnClickListener(r3)
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310231(0x7f093697, float:1.8238768E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f211886i3 = r1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$u r3 = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$u
            r3.<init>(r0)
            r1.setOnClickListener(r3)
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310228(0x7f093694, float:1.8238762E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f211891j3 = r1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$v r3 = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$v
            r3.<init>(r0)
            r1.setOnClickListener(r3)
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310217(0x7f093689, float:1.823874E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310232(0x7f093698, float:1.823877E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310230(0x7f093696, float:1.8238766E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f211895k3 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310229(0x7f093695, float:1.8238764E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            r0.f211899l3 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310239(0x7f09369f, float:1.8238784E38)
            android.view.View r1 = r1.findViewById(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.f211903m3 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310241(0x7f0936a1, float:1.8238788E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f211908n3 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310243(0x7f0936a3, float:1.8238793E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f211913o3 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310242(0x7f0936a2, float:1.823879E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f211919p3 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310240(0x7f0936a0, float:1.8238786E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            r0.f211924q3 = r1
            android.view.ViewGroup r1 = r0.f211903m3
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            android.content.Context r3 = r24.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r8 = 2131167370(0x7f07088a, float:1.7949012E38)
            int r3 = r3.getDimensionPixelSize(r8)
            android.content.Context r8 = r24.getContext()
            int r8 = com.tencent.p014mm.p136ui.C75054z4.m90004b(r8)
            int r3 = r3 + r8
            r1.height = r3
            android.view.ViewGroup r3 = r0.f211903m3
            r3.setLayoutParams(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r0.f211924q3
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            android.content.Context r3 = r24.getContext()
            int r3 = com.tencent.p014mm.p136ui.C75054z4.m90004b(r3)
            android.content.Context r8 = r24.getContext()
            int r8 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r8, r13)
            int r3 = r3 + r8
            r1.bottomMargin = r3
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r0.f211924q3
            r3.setLayoutParams(r1)
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$w r3 = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$w
            r3.<init>(r0)
            r1.<init>(r3, r9)
            r0.f211961x4 = r1
            com.tencent.mm.sdk.platformtools.MMHandler r1 = new com.tencent.mm.sdk.platformtools.MMHandler
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$x r3 = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$x
            r3.<init>(r0)
            r1.<init>((com.tencent.p014mm.sdk.platformtools.MMHandler.Callback) r3)
            r0.f211967y4 = r1
            nj3.s0 r1 = r0.f211782L2
            android.view.View r1 = r1.getContentView()
            r3 = 2131310215(0x7f093687, float:1.8238736E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f211929r3 = r1
            nj3.s0 r1 = r0.f211782L2
            r1.setClippingEnabled(r6)
        L_0x036f:
            int r1 = r24.getTransLangTypeByTalker()
            if (r1 != 0) goto L_0x0378
            r0.f211738A4 = r9
            goto L_0x037a
        L_0x0378:
            r0.f211738A4 = r1
        L_0x037a:
            com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout r1 = r0.f211822U2
            if (r1 == 0) goto L_0x0383
            int r3 = r0.f211738A4
            r1.setSelectedLang(r3)
        L_0x0383:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.util.Map<java.lang.Integer, java.lang.String> r3 = r0.f211925q4
            java.util.HashMap r3 = (java.util.HashMap) r3
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r6] = r3
            java.lang.String r3 = "curTxt:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r3, r1)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NEW_VOICE2TXT_NEED_GUIDE_VOICE_BOOLEAN_SYNC
            boolean r1 = r1.mo119686g(r3, r9)
            r10 = 0
            r3 = 2131833550(0x7f1132ce, float:1.9300185E38)
            r8 = 30
            r12 = 200(0xc8, double:9.9E-322)
            if (r1 == 0) goto L_0x03f5
            android.widget.TextView r1 = r0.f211836X2
            android.content.Context r14 = r24.getContext()
            int r8 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r14, r8)
            float r8 = (float) r8
            r1.setTranslationY(r8)
            android.widget.TextView r1 = r0.f211836X2
            r1.setVisibility(r6)
            android.widget.TextView r1 = r0.f211836X2
            r1.setAlpha(r4)
            android.widget.TextView r1 = r0.f211836X2
            android.content.Context r8 = r24.getContext()
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r3 = r8.getString(r3)
            r1.setText(r3)
            android.widget.TextView r1 = r0.f211836X2
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.view.ViewPropertyAnimator r1 = r1.alpha(r15)
            android.view.ViewPropertyAnimator r1 = r1.translationY(r4)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r12)
            android.view.ViewPropertyAnimator r1 = r1.setStartDelay(r10)
            r1.start()
            goto L_0x0493
        L_0x03f5:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NEW_VOICE2TXT_NEED_GUIDE_OPERATION_BOOLEAN_SYNC
            boolean r1 = r1.mo119686g(r14, r9)
            if (r1 == 0) goto L_0x0451
            android.widget.TextView r1 = r0.f211836X2
            android.content.Context r3 = r24.getContext()
            r8 = 12
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r8)
            float r3 = (float) r3
            r1.setTranslationY(r3)
            android.widget.TextView r1 = r0.f211836X2
            r1.setVisibility(r6)
            android.widget.TextView r1 = r0.f211836X2
            r1.setAlpha(r4)
            android.widget.TextView r1 = r0.f211836X2
            android.content.Context r3 = r24.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r8 = 2131833546(0x7f1132ca, float:1.9300177E38)
            java.lang.String r3 = r3.getString(r8)
            r1.setText(r3)
            android.widget.TextView r1 = r0.f211836X2
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.view.ViewPropertyAnimator r1 = r1.alpha(r15)
            android.view.ViewPropertyAnimator r1 = r1.translationY(r4)
            r10 = 1000(0x3e8, double:4.94E-321)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r10)
            r10 = 500(0x1f4, double:2.47E-321)
            android.view.ViewPropertyAnimator r1 = r1.setStartDelay(r10)
            r1.start()
            goto L_0x0493
        L_0x0451:
            android.widget.TextView r1 = r0.f211836X2
            android.content.Context r14 = r24.getContext()
            int r8 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r14, r8)
            float r8 = (float) r8
            r1.setTranslationY(r8)
            android.widget.TextView r1 = r0.f211836X2
            r1.setVisibility(r6)
            android.widget.TextView r1 = r0.f211836X2
            r1.setAlpha(r4)
            android.widget.TextView r1 = r0.f211836X2
            android.content.Context r8 = r24.getContext()
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r3 = r8.getString(r3)
            r1.setText(r3)
            android.widget.TextView r1 = r0.f211836X2
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.view.ViewPropertyAnimator r1 = r1.alpha(r15)
            android.view.ViewPropertyAnimator r1 = r1.translationY(r4)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r12)
            android.view.ViewPropertyAnimator r1 = r1.setStartDelay(r10)
            r1.start()
        L_0x0493:
            android.view.ViewGroup r1 = r0.f211793O2
            r1.setTranslationY(r4)
            android.widget.ImageView r1 = r0.f211807R2
            r1.setTranslationY(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r0.f211817T2
            r1.setTranslationY(r4)
            android.view.ViewGroup r1 = r0.f211840Y2
            r1.setTranslationY(r4)
            android.content.Context r1 = r24.getContext()
            r3 = 20
            int r1 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r1, r3)
            android.widget.EditText r3 = r0.f211797P2
            r3.setPadding(r1, r1, r1, r6)
            android.widget.EditText r1 = r0.f211797P2
            android.text.TextWatcher r3 = r0.f211755E3
            r1.addTextChangedListener(r3)
            android.widget.EditText r1 = r0.f211797P2
            r3 = 8
            r1.setVisibility(r3)
            android.widget.EditText r1 = r0.f211797P2
            r1.setCursorVisible(r6)
            com.tencent.mm.plugin.transvoice.ui.SoundWaveView r1 = r0.f211802Q2
            r1.setVisibility(r6)
            android.widget.TextView r1 = r0.f211827V2
            r1.setVisibility(r3)
            android.view.View r1 = r0.f211891j3
            r1.setEnabled(r9)
            android.view.ViewGroup r1 = r0.f211793O2
            r1.setActivated(r9)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r0.f211899l3
            android.content.Context r3 = r24.getContext()
            r8 = 2131756010(0x7f1003ea, float:1.9142915E38)
            android.content.Context r10 = r24.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131099756(0x7f06006c, float:1.7811874E38)
            int r10 = r10.getColor(r11)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r3, r8, r10)
            r1.setImageDrawable(r3)
            android.widget.ImageView r1 = r0.f211807R2
            android.content.Context r3 = r24.getContext()
            r8 = 2131756188(0x7f10049c, float:1.9143276E38)
            android.content.Context r10 = r24.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131099837(0x7f0600bd, float:1.7812038E38)
            int r10 = r10.getColor(r11)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r3, r8, r10)
            r1.setImageDrawable(r3)
            android.view.View r1 = r0.f211908n3
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            android.content.Context r3 = r24.getContext()
            r8 = 250(0xfa, float:3.5E-43)
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r8)
            r1.width = r3
            android.content.Context r3 = r24.getContext()
            r10 = 40
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r10)
            r1.height = r3
            android.content.Context r3 = r24.getContext()
            r11 = 72
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r11)
            r1.topMargin = r3
            android.content.Context r3 = r24.getContext()
            r14 = 22
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r14)
            r1.rightMargin = r3
            android.content.Context r3 = r24.getContext()
            r9 = 8
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r9)
            r1.bottomMargin = r3
            android.view.View r3 = r0.f211908n3
            r3.setLayoutParams(r1)
            android.view.View r1 = r0.f211908n3
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r3.mo10233c(r5)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter"
            java.lang.String r19 = "showPopupWindow"
            java.lang.String r20 = "(I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setAlpha"
            java.lang.String r23 = "(F)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r1.setAlpha(r3)
            java.lang.String r17 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter"
            java.lang.String r18 = "showPopupWindow"
            java.lang.String r19 = "(I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r1 = r0.f211913o3
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            android.content.Context r3 = r24.getContext()
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r8)
            r1.width = r3
            android.content.Context r3 = r24.getContext()
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r10)
            r1.height = r3
            android.content.Context r3 = r24.getContext()
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r11)
            r1.topMargin = r3
            android.content.Context r3 = r24.getContext()
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r14)
            r1.rightMargin = r3
            android.content.Context r3 = r24.getContext()
            r8 = 8
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r8)
            r1.bottomMargin = r3
            android.view.View r3 = r0.f211913o3
            r3.setLayoutParams(r1)
            android.view.View r1 = r0.f211913o3
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r5)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter"
            java.lang.String r19 = "showPopupWindow"
            java.lang.String r20 = "(I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setAlpha"
            java.lang.String r23 = "(F)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r1.setAlpha(r3)
            java.lang.String r17 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter"
            java.lang.String r18 = "showPopupWindow"
            java.lang.String r19 = "(I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.ViewGroup r1 = r0.f211844Z2
            int r3 = r0.f211909n4
            float r3 = (float) r3
            r1.setTranslationY(r3)
            android.view.ViewGroup r1 = r0.f211844Z2
            r1.setAlpha(r4)
            com.tencent.mm.plugin.transvoice.ui.SoundWaveView r1 = r0.f211802Q2
            r3 = 8
            r1.setVisibility(r3)
            android.view.View r1 = r0.f211929r3
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r7)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter"
            java.lang.String r19 = "showPopupWindow"
            java.lang.String r20 = "(I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter"
            java.lang.String r18 = "showPopupWindow"
            java.lang.String r19 = "(I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r1 == 0) goto L_0x0693
            android.view.View r1 = r0.f211790N2
            android.content.Context r3 = r24.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131234258(0x7f080dd2, float:1.8084677E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r5)
            r1.setBackground(r3)
            goto L_0x06a7
        L_0x0693:
            android.view.View r1 = r0.f211790N2
            android.content.Context r3 = r24.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131234259(0x7f080dd3, float:1.8084679E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r5)
            r1.setBackground(r3)
        L_0x06a7:
            r0.f211867e4 = r6
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r1 = r0.f211826V1
            if (r1 == 0) goto L_0x06e9
            ck3.b r1 = r1.mo100531a()
            if (r1 == 0) goto L_0x06e9
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r1 = r0.f211826V1
            ck3.b r1 = r1.mo100531a()
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r2)
            if (r1 == 0) goto L_0x06e9
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r1 = r0.f211826V1
            ck3.b r1 = r1.mo100531a()
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r2)
            zj3.i r1 = (zj3.C79363i) r1
            boolean r1 = r1.mo102362t0()
            if (r1 == 0) goto L_0x06e9
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r1 = r0.f211826V1
            ck3.b r1 = r1.mo100531a()
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r2)
            zj3.i r1 = (zj3.C79363i) r1
            int r1 = r1.mo102353K2()
            int r1 = -r1
            goto L_0x06ea
        L_0x06e9:
            r1 = 0
        L_0x06ea:
            nj3.s0 r2 = r0.f211782L2
            r3 = 49
            r2.showAtLocation(r0, r3, r6, r1)
            android.animation.ValueAnimator r1 = r0.f211759F3
            r1.start()
            android.animation.ValueAnimator r1 = r0.f211763G3
            r1.start()
            android.animation.ValueAnimator r1 = r0.f211767H3
            r1.start()
            android.animation.ValueAnimator r1 = r0.f211771I3
            r1.start()
            android.animation.ValueAnimator r1 = r0.f211775J3
            r1.start()
            android.view.View r1 = r0.f211908n3
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.view.ViewPropertyAnimator r1 = r1.alpha(r15)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r12)
            r1.start()
            android.view.View r1 = r0.f211913o3
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.view.ViewPropertyAnimator r1 = r1.alpha(r15)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r12)
            r1.start()
            android.view.ViewGroup r1 = r0.f211844Z2
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.view.ViewPropertyAnimator r1 = r1.alpha(r15)
            android.view.ViewPropertyAnimator r1 = r1.translationY(r4)
            r2 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            r1.start()
            android.view.ViewGroup r1 = r0.f211793O2
            r1.setAlpha(r4)
            android.view.ViewGroup r1 = r0.f211793O2
            android.content.Context r2 = r24.getContext()
            r3 = 56
            int r2 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r2, r3)
            float r2 = (float) r2
            r1.setTranslationY(r2)
            android.widget.ImageView r1 = r0.f211807R2
            r1.setAlpha(r6)
            android.widget.ImageView r1 = r0.f211807R2
            android.content.Context r2 = r24.getContext()
            int r2 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r2, r3)
            float r2 = (float) r2
            r1.setTranslationY(r2)
            android.view.ViewGroup r1 = r0.f211793O2
            r2 = 2
            float[] r3 = new float[r2]
            float r5 = r1.getTranslationY()
            r3[r6] = r5
            r5 = 1
            r3[r5] = r4
            java.lang.String r5 = "translationY"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r5, r3)
            android.view.ViewGroup r3 = r0.f211793O2
            float[] r7 = new float[r2]
            r7 = {0, 1065353216} // fill-array
            java.lang.String r8 = "alpha"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r8, r7)
            android.widget.ImageView r7 = r0.f211807R2
            float[] r9 = new float[r2]
            float r10 = r7.getTranslationY()
            r9[r6] = r10
            r10 = 1
            r9[r10] = r4
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r7, r5, r9)
            android.widget.ImageView r5 = r0.f211807R2
            int[] r7 = new int[r2]
            r7 = {0, 255} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofInt(r5, r8, r7)
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            r7.setDuration(r12)
            r8 = 4
            android.animation.Animator[] r8 = new android.animation.Animator[r8]
            r8[r6] = r1
            r1 = 1
            r8[r1] = r3
            r8[r2] = r4
            r1 = 3
            r8[r1] = r5
            r7.playTogether(r8)
            r7.start()
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r0.f211817T2
            r2 = 8
            r1.setVisibility(r2)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$y r1 = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$y
            r1.<init>(r0)
            r0.post(r1)
            return
        L_0x07d4:
            r0.f211742B3 = r6
            boolean r2 = r0.f211842Z0
            if (r2 == 0) goto L_0x07e5
            android.content.Context r2 = r24.getContext()
            r3 = 280(0x118, float:3.92E-43)
            int r2 = kg3.C76577a.m92151b(r2, r3)
            goto L_0x07ef
        L_0x07e5:
            android.content.Context r2 = r24.getContext()
            r3 = 180(0xb4, float:2.52E-43)
            int r2 = kg3.C76577a.m92151b(r2, r3)
        L_0x07ef:
            android.content.Context r3 = r24.getContext()
            r4 = 1112014848(0x42480000, float:50.0)
            int r3 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r3, r4)
            int r4 = r25 + r3
            if (r4 >= r2) goto L_0x0800
            r0.f211742B3 = r10
            goto L_0x0807
        L_0x0800:
            int r2 = r25 - r2
            r4 = 2
            int r2 = r2 / r4
            int r2 = r2 + r3
            r0.f211742B3 = r2
        L_0x0807:
            nj3.s0 r2 = r0.f211957x0
            r3 = 2131101716(0x7f060814, float:1.781585E38)
            if (r2 != 0) goto L_0x0b98
            nj3.s0 r2 = new nj3.s0
            android.content.Context r8 = r24.getContext()
            r9 = 2131498147(0x7f0c14a3, float:1.8619907E38)
            android.view.View r8 = android.view.View.inflate(r8, r9, r14)
            r9 = -2
            r2.<init>(r8, r10, r9)
            r0.f211957x0 = r2
            android.view.View r2 = r2.getContentView()
            r8 = 2131316453(0x7f094ee5, float:1.8251388E38)
            android.view.View r2 = r2.findViewById(r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f211963y0 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316447(0x7f094edf, float:1.8251376E38)
            android.view.View r2 = r2.findViewById(r8)
            r0.f211800Q0 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316545(0x7f094f41, float:1.8251575E38)
            android.view.View r2 = r2.findViewById(r8)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f211805R0 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316456(0x7f094ee8, float:1.8251394E38)
            android.view.View r2 = r2.findViewById(r8)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f211810S0 = r2
            android.content.Context r8 = r24.getContext()
            r9 = 2131167072(0x7f070760, float:1.7948407E38)
            int r8 = kg3.C76577a.m92155f(r8, r9)
            float r8 = (float) r8
            android.content.Context r11 = r24.getContext()
            float r11 = kg3.C76577a.m92161l(r11)
            float r8 = r8 * r11
            r2.setTextSize(r6, r8)
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316449(0x7f094ee1, float:1.825138E38)
            android.view.View r2 = r2.findViewById(r8)
            r0.f211815T0 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316451(0x7f094ee3, float:1.8251384E38)
            android.view.View r2 = r2.findViewById(r8)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r8 = r24.getContext()
            int r8 = kg3.C76577a.m92155f(r8, r9)
            float r8 = (float) r8
            android.content.Context r9 = r24.getContext()
            float r9 = kg3.C76577a.m92161l(r9)
            float r8 = r8 * r9
            r2.setTextSize(r6, r8)
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316450(0x7f094ee2, float:1.8251382E38)
            android.view.View r2 = r2.findViewById(r8)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316452(0x7f094ee4, float:1.8251386E38)
            android.view.View r2 = r2.findViewById(r8)
            r0.f211820U0 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316454(0x7f094ee6, float:1.825139E38)
            android.view.View r2 = r2.findViewById(r8)
            r0.f211825V0 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316389(0x7f094ea5, float:1.8251258E38)
            android.view.View r2 = r2.findViewById(r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f211875g2 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316382(0x7f094e9e, float:1.8251244E38)
            android.view.View r2 = r2.findViewById(r8)
            r0.f211880h2 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316393(0x7f094ea9, float:1.8251266E38)
            android.view.View r2 = r2.findViewById(r8)
            r0.f211894k2 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316394(0x7f094eaa, float:1.8251268E38)
            android.view.View r2 = r2.findViewById(r8)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f211898l2 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316381(0x7f094e9d, float:1.8251242E38)
            android.view.View r2 = r2.findViewById(r8)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f211902m2 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316383(0x7f094e9f, float:1.8251246E38)
            android.view.View r2 = r2.findViewById(r8)
            r0.f211907n2 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316386(0x7f094ea2, float:1.8251252E38)
            android.view.View r2 = r2.findViewById(r8)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f211912o2 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316384(0x7f094ea0, float:1.8251248E38)
            android.view.View r2 = r2.findViewById(r8)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f211918p2 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316388(0x7f094ea4, float:1.8251256E38)
            android.view.View r2 = r2.findViewById(r8)
            r0.f211923q2 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316378(0x7f094e9a, float:1.8251236E38)
            android.view.View r2 = r2.findViewById(r8)
            r0.f211928r2 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316379(0x7f094e9b, float:1.8251238E38)
            android.view.View r2 = r2.findViewById(r8)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            r0.f211933s2 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316380(0x7f094e9c, float:1.825124E38)
            android.view.View r2 = r2.findViewById(r8)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f211938t2 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316390(0x7f094ea6, float:1.825126E38)
            android.view.View r2 = r2.findViewById(r8)
            r0.f211943u2 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316391(0x7f094ea7, float:1.8251262E38)
            android.view.View r2 = r2.findViewById(r8)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            r0.f211948v2 = r2
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r8 = 2131316392(0x7f094ea8, float:1.8251264E38)
            android.view.View r2 = r2.findViewById(r8)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f211953w2 = r2
            android.content.Context r2 = r24.getContext()
            r8 = 2131495925(0x7f0c0bf5, float:1.86154E38)
            android.view.View r2 = android.view.View.inflate(r2, r8, r14)
            r0.f211959x2 = r2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q1 r2 = r0.f211758F2     // Catch:{ all -> 0x0a88 }
            if (r1 != r2) goto L_0x0a86
            android.app.Activity r2 = r0.f211821U1     // Catch:{ all -> 0x0a88 }
            android.view.Window r2 = r2.getWindow()     // Catch:{ all -> 0x0a88 }
            android.view.View r2 = r2.getDecorView()     // Catch:{ all -> 0x0a88 }
            android.graphics.drawable.Drawable r8 = r2.getBackground()     // Catch:{ all -> 0x0a88 }
            com.tencent.mm.ui.blur.BlurView r9 = new com.tencent.mm.ui.blur.BlurView     // Catch:{ all -> 0x0a88 }
            android.content.Context r11 = r24.getContext()     // Catch:{ all -> 0x0a88 }
            r9.<init>(r11)     // Catch:{ all -> 0x0a88 }
            r0.f211885i2 = r9     // Catch:{ all -> 0x0a88 }
            android.content.Context r9 = r24.getContext()     // Catch:{ all -> 0x0a88 }
            int r9 = kg3.C76577a.m92151b(r9, r13)     // Catch:{ all -> 0x0a88 }
            com.tencent.mm.ui.blur.BlurView r11 = r0.f211885i2     // Catch:{ all -> 0x0a88 }
            r14 = r2
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14     // Catch:{ all -> 0x0a88 }
            r11.mo101978c(r14)     // Catch:{ all -> 0x0a88 }
            android.content.res.Resources r14 = r24.getResources()     // Catch:{ all -> 0x0a88 }
            int r14 = r14.getColor(r3)     // Catch:{ all -> 0x0a88 }
            r11.mo101977b(r14)     // Catch:{ all -> 0x0a88 }
            tj3.d r14 = r11.f215140d     // Catch:{ all -> 0x0a88 }
            r14.mo89125j(r8)     // Catch:{ all -> 0x0a88 }
            tj3.i r14 = new tj3.i     // Catch:{ all -> 0x0a88 }
            android.content.Context r4 = r24.getContext()     // Catch:{ all -> 0x0a88 }
            r14.<init>(r4)     // Catch:{ all -> 0x0a88 }
            tj3.d r4 = r11.f215140d     // Catch:{ all -> 0x0a88 }
            r4.mo89124i(r14)     // Catch:{ all -> 0x0a88 }
            tj3.d r4 = r11.f215140d     // Catch:{ all -> 0x0a88 }
            r14 = 1097859072(0x41700000, float:15.0)
            r4.mo89123h(r14)     // Catch:{ all -> 0x0a88 }
            tj3.d r4 = r11.f215140d     // Catch:{ all -> 0x0a88 }
            r10 = 1
            r4.mo89126k(r10)     // Catch:{ all -> 0x0a88 }
            float r4 = (float) r9     // Catch:{ all -> 0x0a88 }
            float r4 = r4 * r15
            r11.f215142f = r4     // Catch:{ all -> 0x0a88 }
            r11.f215146j = r10     // Catch:{ all -> 0x0a88 }
            int r4 = r0.f211742B3     // Catch:{ all -> 0x0a88 }
            tj3.d r9 = r11.f215140d     // Catch:{ all -> 0x0a88 }
            r9.mo89121f(r4)     // Catch:{ all -> 0x0a88 }
            tj3.d r4 = r11.f215140d     // Catch:{ all -> 0x0a88 }
            r4.mo89120e(r6)     // Catch:{ all -> 0x0a88 }
            com.tencent.mm.ui.blur.BlurView r4 = new com.tencent.mm.ui.blur.BlurView     // Catch:{ all -> 0x0a88 }
            android.content.Context r9 = r24.getContext()     // Catch:{ all -> 0x0a88 }
            r4.<init>(r9)     // Catch:{ all -> 0x0a88 }
            r0.f211965y2 = r4     // Catch:{ all -> 0x0a88 }
            android.content.res.Resources r9 = r24.getResources()     // Catch:{ all -> 0x0a88 }
            int r9 = r9.getColor(r3)     // Catch:{ all -> 0x0a88 }
            r4.mo101977b(r9)     // Catch:{ all -> 0x0a88 }
            com.tencent.mm.ui.blur.BlurView r4 = r0.f211965y2     // Catch:{ all -> 0x0a88 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x0a88 }
            r4.mo101978c(r2)     // Catch:{ all -> 0x0a88 }
            tj3.d r2 = r4.f215140d     // Catch:{ all -> 0x0a88 }
            r2.mo89125j(r8)     // Catch:{ all -> 0x0a88 }
            tj3.i r2 = new tj3.i     // Catch:{ all -> 0x0a88 }
            android.content.Context r8 = r24.getContext()     // Catch:{ all -> 0x0a88 }
            r2.<init>(r8)     // Catch:{ all -> 0x0a88 }
            tj3.d r8 = r4.f215140d     // Catch:{ all -> 0x0a88 }
            r8.mo89124i(r2)     // Catch:{ all -> 0x0a88 }
            tj3.d r2 = r4.f215140d     // Catch:{ all -> 0x0a88 }
            r2.mo89123h(r14)     // Catch:{ all -> 0x0a88 }
            tj3.d r2 = r4.f215140d     // Catch:{ all -> 0x0a88 }
            r8 = 1
            r2.mo89126k(r8)     // Catch:{ all -> 0x0a88 }
            tj3.d r2 = r4.f215140d     // Catch:{ all -> 0x0a88 }
            r2.mo89120e(r6)     // Catch:{ all -> 0x0a88 }
        L_0x0a86:
            r2 = 1
            goto L_0x0a8f
        L_0x0a88:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q1 r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$q1.MODE_NORMAL
            r0.f211758F2 = r2
            r2 = 1
            r0.f211747C3 = r2
        L_0x0a8f:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q1 r8 = r0.f211758F2
            r4[r6] = r8
            java.lang.String r8 = "transVoiceBlurMode: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r8, r4)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q1 r4 = r0.f211758F2
            int r4 = r4.ordinal()
            if (r4 == 0) goto L_0x0af9
            if (r4 == r2) goto L_0x0aa9
            r2 = 2
            if (r4 == r2) goto L_0x0af9
            goto L_0x0b1d
        L_0x0aa9:
            android.view.ViewGroup r2 = r0.f211875g2
            android.view.View r4 = r0.f211880h2
            r2.removeView(r4)
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            android.content.res.Resources r4 = r24.getResources()
            r8 = 2131167358(0x7f07087e, float:1.7948987E38)
            int r4 = r4.getDimensionPixelSize(r8)
            android.content.res.Resources r9 = r24.getResources()
            int r8 = r9.getDimensionPixelSize(r8)
            r2.<init>(r4, r8)
            r2.addRule(r13)
            r4 = 10
            r2.addRule(r4)
            com.tencent.mm.ui.blur.BlurView r4 = r0.f211885i2
            android.view.View r8 = r0.f211880h2
            r4.addView(r8, r2)
            android.view.ViewGroup r4 = r0.f211875g2
            com.tencent.mm.ui.blur.BlurView r8 = r0.f211885i2
            r4.addView(r8, r2)
            com.tencent.mm.ui.blur.BlurView r2 = r0.f211885i2
            r0.f211890j2 = r2
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r2.<init>(r4, r4)
            com.tencent.mm.ui.blur.BlurView r8 = r0.f211965y2
            android.view.View r9 = r0.f211959x2
            r8.addView(r9, r2)
            nj3.s0 r2 = new nj3.s0
            com.tencent.mm.ui.blur.BlurView r8 = r0.f211965y2
            r2.<init>(r8, r4, r4)
            r0.f211746C2 = r2
            goto L_0x0b1d
        L_0x0af9:
            android.view.View r2 = r0.f211880h2
            r0.f211890j2 = r2
            r4 = 2131235426(0x7f081262, float:1.8087046E38)
            r2.setBackgroundResource(r4)
            android.view.View r2 = r0.f211959x2
            android.content.res.Resources r4 = r24.getResources()
            r8 = 2131101718(0x7f060816, float:1.7815854E38)
            int r4 = r4.getColor(r8)
            r2.setBackgroundColor(r4)
            nj3.s0 r2 = new nj3.s0
            android.view.View r4 = r0.f211959x2
            r8 = -1
            r2.<init>(r4, r8, r8)
            r0.f211746C2 = r2
        L_0x0b1d:
            nj3.s0 r2 = r0.f211746C2
            r2.setClippingEnabled(r6)
            nj3.s0 r2 = r0.f211746C2
            android.view.View r2 = r2.getContentView()
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r4.mo10233c(r5)
            java.lang.Object[] r9 = r4.mo10232b()
            java.lang.String r10 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter"
            java.lang.String r11 = "showPopupWindow"
            java.lang.String r12 = "(I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setAlpha"
            java.lang.String r15 = "(F)V"
            r8 = r2
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2.setAlpha(r4)
            java.lang.String r9 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter"
            java.lang.String r10 = "showPopupWindow"
            java.lang.String r11 = "(I)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setAlpha"
            java.lang.String r14 = "(F)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            nj3.s0 r2 = r0.f211746C2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$z r4 = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$z
            r4.<init>(r0)
            r2.setOnDismissListener(r4)
            nj3.s0 r2 = r0.f211957x0
            android.view.View r2 = r2.getContentView()
            r4 = 2131316385(0x7f094ea1, float:1.825125E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r4 = r24.getContext()
            r5 = 2131167362(0x7f070882, float:1.7948995E38)
            int r4 = kg3.C76577a.m92155f(r4, r5)
            float r4 = (float) r4
            android.content.Context r5 = r24.getContext()
            float r5 = kg3.C76577a.m92161l(r5)
            float r4 = r4 * r5
            r2.setTextSize(r6, r4)
        L_0x0b98:
            r24.mo100507z0()
            int r2 = r0.f211742B3
            r4 = -1
            if (r2 == r4) goto L_0x0cdc
            android.view.View r2 = r0.f211825V0
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r5 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r8)
            java.lang.Object[] r9 = r4.mo10232b()
            java.lang.String r10 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter"
            java.lang.String r11 = "showPopupWindow"
            java.lang.String r12 = "(I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r2
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r9 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter"
            java.lang.String r10 = "showPopupWindow"
            java.lang.String r11 = "(I)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.view.ViewGroup r2 = r0.f211963y0
            r4 = 8
            r2.setVisibility(r4)
            android.view.View r2 = r0.f211820U0
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r7)
            java.lang.Object[] r9 = r4.mo10232b()
            java.lang.String r10 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter"
            java.lang.String r11 = "showPopupWindow"
            java.lang.String r12 = "(I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r2
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r9 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter"
            java.lang.String r10 = "showPopupWindow"
            java.lang.String r11 = "(I)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            com.tencent.mm.sdk.platformtools.MMHandler r2 = new com.tencent.mm.sdk.platformtools.MMHandler
            r2.<init>()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$b0 r4 = new com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$b0
            r4.<init>(r0)
            r2.post(r4)
            boolean r2 = r0.f211842Z0
            if (r2 == 0) goto L_0x0cd3
            android.content.Context r2 = r24.getContext()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r2)
            java.lang.String r4 = "zh_CN"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x0c79
            java.lang.String r4 = "zh_HK"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x0c79
            java.lang.String r4 = "zh_TW"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0c60
            goto L_0x0c79
        L_0x0c60:
            java.lang.String r4 = "en"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0c89
            android.widget.ImageView r2 = r0.f211918p2
            r4 = 2131757112(0x7f100838, float:1.914515E38)
            r2.setImageResource(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f211948v2
            r4 = 2131757114(0x7f10083a, float:1.9145155E38)
            r2.setImageResource(r4)
            goto L_0x0c89
        L_0x0c79:
            android.widget.ImageView r2 = r0.f211918p2
            r4 = 2131757111(0x7f100837, float:1.9145149E38)
            r2.setImageResource(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f211948v2
            r4 = 2131757113(0x7f100839, float:1.9145153E38)
            r2.setImageResource(r4)
        L_0x0c89:
            r0.f211770I2 = r6
            r24.mo100435n0()
            nj3.s0 r2 = r0.f211746C2
            r4 = 49
            r2.showAtLocation(r0, r4, r6, r6)
            r0.f211766H2 = r6
            boolean r2 = r0.f211857c4
            if (r2 == 0) goto L_0x0cd3
            r0.f211857c4 = r6
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q1 r2 = r0.f211758F2
            if (r1 != r2) goto L_0x0ccb
            com.tencent.mm.ui.blur.BlurView r1 = r0.f211885i2
            android.content.res.Resources r2 = r24.getResources()
            int r2 = r2.getColor(r3)
            r1.mo101977b(r2)
            android.app.Activity r2 = r0.f211821U1
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            tj3.d r3 = r1.f215140d
            r3.mo89125j(r2)
            tj3.e r2 = new tj3.e
            r3 = 1
            r2.<init>(r1, r3)
            r1.post(r2)
            goto L_0x0cd3
        L_0x0ccb:
            android.view.View r1 = r0.f211890j2
            r2 = 2131235426(0x7f081262, float:1.8087046E38)
            r1.setBackgroundResource(r2)
        L_0x0cd3:
            nj3.s0 r1 = r0.f211957x0
            int r2 = r0.f211742B3
            r3 = 49
            r1.showAtLocation(r0, r3, r6, r2)
        L_0x0cdc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.mo100371Q0(int):void");
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        ChatFooter$$i1 chatFooter$$i1;
        C72963f4 h0;
        boolean z2;
        C76901s0 s0Var;
        Class cls = C79363i.class;
        Class cls2 = C79353f1.class;
        int i2 = 0;
        Log.m105925i("MicroMsg.ChatFooter", "onKeyboardHeightChanged: %s, %s, %s", Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(this.f211906n1));
        if (this.f211932s1) {
            for (ChatFooter$$t1 r : this.f211916p0) {
                r.mo96023r(i);
            }
            ChatFooter$$i1 chatFooter$$i12 = this.f211826V1;
            if (!(chatFooter$$i12 == null || chatFooter$$i12.mo100531a() == null)) {
                ((C79353f1) this.f211826V1.mo100531a().f193278b.mo102812a(cls2)).mo102537r(i);
            }
            this.f211888j.mo104245f(i > 0);
            if (this.f211937t1 || ((C50107kb3) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(getContext(), 4, C50107kb3.class)).f136647d == 1) {
                if (i <= 0) {
                    this.f211917p1 = false;
                    if (this.f211884i1 == 1) {
                        Log.m105924i("MicroMsg.ChatFooter", "keyboard not open");
                        mo100384X0(0, true, -1);
                        return;
                    }
                    return;
                }
                this.f211917p1 = true;
            } else if (!C47276a.m52573I()) {
                ChatFooter$$i1 chatFooter$$i13 = this.f211826V1;
                if (chatFooter$$i13 == null || chatFooter$$i13.mo100531a() == null || !((C79353f1) this.f211826V1.mo100531a().f193278b.mo102812a(cls2)).mo102528e3()) {
                    if (!this.f211774J2 || (s0Var = this.f211782L2) == null || !s0Var.isShowing()) {
                        if (!this.f211922q1 && this.f211874g1) {
                            boolean z3 = this.f211947v1 != z;
                            this.f211947v1 = z;
                            if (i > 0) {
                                if (this.f211952w1 != i) {
                                    this.f211952w1 = i;
                                    C76865k.m92671b(getContext(), i);
                                    mo100505y0(i);
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!this.f211917p1) {
                                    mo100384X0(1, true, -1);
                                    this.f211889j1 = -1;
                                } else if (z2 || z3) {
                                    int i3 = this.f211952w1;
                                    this.f211911o1 = i3;
                                    GroupTodoComponent.C73357g gVar = this.f211765H1;
                                    if (gVar != null) {
                                        i2 = ((FootComponent$$i) gVar).mo102204a();
                                    }
                                    mo100350F0(i3, true, 1, i2);
                                }
                                this.f211917p1 = true;
                            } else {
                                if (this.f211917p1) {
                                    int i4 = this.f211889j1;
                                    if (i4 != -1) {
                                        mo100384X0(i4, true, -1);
                                        this.f211889j1 = -1;
                                    } else {
                                        mo100384X0(0, true, -1);
                                    }
                                }
                                if (this.f211884i1 == 1) {
                                    Log.m105924i("MicroMsg.ChatFooter", "keyboard not open");
                                    mo100384X0(0, true, -1);
                                }
                                this.f211917p1 = false;
                            }
                        }
                        C72825s0 s0Var2 = this.f211780L;
                        if (s0Var2 != null) {
                            s0Var2.mo100649D(this.f211917p1);
                        }
                        if (this.f211917p1 && (chatFooter$$i1 = this.f211826V1) != null && chatFooter$$i1.mo100531a() != null && this.f211826V1.mo100531a().f193278b.mo102812a(cls) != null && (h0 = ((C79363i) this.f211826V1.mo100531a().f193278b.mo102812a(cls)).mo102361h0()) != null) {
                            Log.m105924i("MicroMsg.ChatFooter", "key board show, add biz article fake referMsgInfo");
                            mo100343C(h0);
                        }
                    } else if (i <= 0 || C85865h1.m106133c(getContext())) {
                        this.f211917p1 = false;
                        this.f211797P2.setCursorVisible(false);
                        this.f211840Y2.animate().translationY(0.0f).setDuration(200).start();
                        this.f211793O2.animate().translationY(0.0f).setDuration(200).start();
                        this.f211807R2.animate().translationY(0.0f).setDuration(200).start();
                        this.f211817T2.animate().translationY(0.0f).setDuration(200).start();
                        if (this.f211793O2.getHeight() < this.f211828V3) {
                            ValueAnimator duration = ValueAnimator.ofInt(new int[]{this.f211793O2.getHeight(), this.f211828V3}).setDuration(200);
                            duration.addUpdateListener(new ChatFooter$$n0(this));
                            duration.start();
                        }
                    } else {
                        this.f211917p1 = true;
                        this.f211797P2.setCursorVisible(true);
                        Log.m105919d("MicroMsg.ChatFooter", "height:%s, WeUIToolHelper.getDisplayRealSize(getContext()).y - newVoice2txtOpeArea.getBottom():%s", Integer.valueOf(i), Integer.valueOf(C75044y4.m89990b(getContext()).y - this.f211840Y2.getBottom()));
                        int i5 = C75044y4.m89990b(getContext()).y;
                        int[] iArr = new int[2];
                        this.f211840Y2.getLocationOnScreen(iArr);
                        this.f211840Y2.animate().translationY((float) (-((i - (i5 - (iArr[1] + this.f211840Y2.getHeight()))) + C75044y4.m89991c(getContext())))).setDuration(200).start();
                        int height = (i5 - (i + this.f211840Y2.getHeight())) - C74942w4.m89784a(getContext(), 24);
                        int height2 = this.f211793O2.getHeight() + this.f211807R2.getHeight() + C74942w4.m89784a(getContext(), 48);
                        Log.m105919d("MicroMsg.ChatFooter", "leftSpcaeDown:%s, editDown:%s", Integer.valueOf(height), Integer.valueOf(height2));
                        int a = height - C74942w4.m89784a(getContext(), 52);
                        this.f211823U3 = a;
                        if (a < this.f211787M3) {
                            Log.m105925i("MicroMsg.ChatFooter", "invalid maxHeightWhenKeyboard, value:%s", Integer.valueOf(a));
                            this.f211823U3 = this.f211787M3;
                        }
                        this.f211828V3 = this.f211793O2.getHeight();
                        int[] iArr2 = new int[2];
                        this.f211807R2.getLocationOnScreen(iArr2);
                        int height3 = iArr2[1] + this.f211807R2.getHeight();
                        if (height3 > height) {
                            int i6 = height3 - height;
                            if (height2 > height) {
                                int i7 = height2 - height;
                                int i8 = this.f211793O2.getLayoutParams().height;
                                ValueAnimator duration2 = ValueAnimator.ofInt(new int[]{i8, i8 - i7}).setDuration(200);
                                duration2.addUpdateListener(new ChatFooter$$o0(this));
                                duration2.start();
                            }
                            float f = (float) (-i6);
                            this.f211793O2.animate().translationY(f).setDuration(200).start();
                            this.f211807R2.animate().translationY(f).setDuration(200).start();
                            this.f211817T2.animate().translationY(f).setDuration(200).start();
                        }
                    }
                } else if (i <= 0) {
                    this.f211917p1 = false;
                } else {
                    this.f211917p1 = true;
                }
            } else if (i <= 0) {
                this.f211917p1 = false;
            } else {
                this.f211917p1 = true;
            }
        }
    }

    /* renamed from: R */
    public void mo100372R(int i) {
        AppPanel appPanel = this.f211878h;
        appPanel.f211694H = true;
        appPanel.f211687A.f212165i.f212183a = false;
        appPanel.mo100316o();
        Log.m105925i("MicroMsg.AppPanel", "disableServiceRemittance ，scene：%s， stack：%s", Integer.valueOf(i), Util.getStack().toString());
    }

    /* renamed from: R0 */
    public void mo100373R0() {
        this.f211838Y0 = 1;
        mo100375S0(true);
        mo100502x(this.f211888j.length() > 0);
        this.f211915p.setVisibility(8);
        mo100394c1(C0966R.C0969drawable.f4804nd);
        VoiceInputPanel voiceInputPanel = this.f211873g;
        if (voiceInputPanel != null) {
            voiceInputPanel.setVisibility(8);
            this.f211864e1 = false;
            this.f211873g.mo25282l();
        }
        mo100341B(2, true, -1);
    }

    /* renamed from: S */
    public void mo100374S() {
        AppPanel appPanel = this.f211878h;
        appPanel.f211687A.f212175s.f212183a = false;
        appPanel.mo100316o();
    }

    /* renamed from: S0 */
    public final void mo100375S0(boolean z) {
        if (z) {
            this.f211739B.setVisibility(0);
            this.f211962y.setVisibility(0);
            mo100369P0(true, false);
            return;
        }
        this.f211739B.setVisibility(8);
        this.f211962y.setVisibility(8);
        this.f211745C1.mo100695h(0);
        mo100369P0(false, false);
    }

    /* renamed from: T */
    public void mo100376T(boolean z) {
        AppPanel appPanel = this.f211878h;
        boolean z2 = !z;
        appPanel.f211687A.f212167k.f212183a = z2;
        appPanel.mo100316o();
        Log.m105918d("MicroMsg.AppPanel", "disableTalkroom enable " + z2);
    }

    /* renamed from: T0 */
    public void mo100377T0() {
        MMFragment mMFragment = this.f211816T1;
        if (!(mMFragment == null || !mMFragment.isSupportNavigationSwipeBack() || this.f211816T1.getSwipeBackLayout() == null)) {
            this.f211816T1.getSwipeBackLayout().setOnceDisEnableGesture(true);
        }
        if (!mo100448r0()) {
            mo100341B(1, true, -1);
        } else {
            Log.m105924i("MicroMsg.ChatFooter", "isScrolling!! pass this event!");
        }
    }

    /* renamed from: U */
    public void mo100378U() {
        AppPanel appPanel = this.f211878h;
        appPanel.f211687A.f212158b.f212183a = false;
        appPanel.mo100316o();
    }

    /* renamed from: U0 */
    public final void mo100379U0() {
        this.f211802Q2.setVisibility(0);
        this.f211812S2.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f211832W2.getLayoutParams();
        layoutParams.removeRule(21);
        layoutParams.removeRule(12);
        layoutParams.addRule(13);
        this.f211832W2.requestLayout();
        ((RelativeLayout.LayoutParams) this.f211802Q2.getLayoutParams()).bottomMargin = 0;
        this.f211802Q2.requestLayout();
    }

    /* renamed from: V0 */
    public final void mo100380V0(boolean z) {
        ChattingScrollLayout chattingScrollLayout;
        if (this.f211956x != null) {
            boolean z2 = this.f211849a4;
            if (z2 && z) {
                return;
            }
            if (z2 || z) {
                this.f211849a4 = z;
                Log.m105918d("MicroMsg.ChatFooter", "smileyBtnActive() activitySmileyBtn = [" + z + "]");
                if (z) {
                    this.f211956x.setImageResource(C0966R.C0969drawable.f4803nc);
                    this.f211956x.setContentDescription(getContext().getResources().getString(C0966R.string.b5e));
                } else {
                    this.f211956x.setImageResource(C0966R.raw.icons_outlined_emoji);
                    this.f211956x.setContentDescription(getContext().getResources().getString(C0966R.string.b5c));
                }
                this.f211956x.setIconColor(getContext().getResources().getColor(C0966R.color.FG_0));
                C72852z0 z0Var = this.f211745C1;
                if (z0Var.mo100696i()) {
                    z0Var.mo100693f().post(new C72803k1(z0Var));
                }
                if (!z && this.f211883i != null && (chattingScrollLayout = this.f211893k1) != null) {
                    ChatFooter$$p0 chatFooter$$p0 = new ChatFooter$$p0(this);
                    if (!((LinkedList) chattingScrollLayout.f212087q).contains(chatFooter$$p0)) {
                        ((LinkedList) chattingScrollLayout.f212087q).add(chatFooter$$p0);
                    }
                } else if (z) {
                    mo100505y0(getKeyBordHeightPX());
                }
            }
        }
    }

    /* renamed from: W */
    public void mo100381W() {
        mo100375S0(true);
        this.f211921q.setVisibility(8);
        this.f211915p.setVisibility(8);
    }

    /* renamed from: W0 */
    public void mo100382W0(int i, boolean z, C99847f fVar, boolean z2) {
        Log.m105919d("MicroMsg.ChatFooter", "startTrans, hasStartTrans: %s, isForce: %s.", Boolean.valueOf(this.f211930r4), Boolean.valueOf(z2));
        this.f211797P2.setImportantForAccessibility(2);
        if (z2) {
            if (this.f211930r4) {
                C71561b bVar = this.f211935s4;
                if (bVar != null) {
                    bVar.mo98687a(false, true);
                }
                this.f211967y4.removeMessages(5000);
                this.f211961x4.stopTimer();
            }
        } else if (this.f211930r4) {
            return;
        }
        this.f211930r4 = true;
        C71561b bVar2 = new C71561b(fVar, i, new ChatFooter$$g1(this));
        this.f211935s4 = bVar2;
        bVar2.f207363h = z;
        bVar2.mo98689c();
        this.f211961x4.startTimer(500);
    }

    /* renamed from: X */
    public void mo100383X(boolean z) {
        AppPanel appPanel = this.f211878h;
        appPanel.f211687A.f212170n.f212183a = !z;
        appPanel.mo100316o();
    }

    /* renamed from: X0 */
    public final void mo100384X0(int i, boolean z, int i2) {
        GroupTodoComponent.C73357g gVar;
        ChatFooter$$j1 chatFooter$$j1;
        int i3 = i;
        Class cls = C78837h.class;
        int i4 = 0;
        Log.m105925i("MicroMsg.ChatFooter", "switchPanel: %s, %s", Integer.valueOf(i), Boolean.valueOf(z));
        if (!this.f211740B1) {
            if (!(i3 == 0 || !C75592q0.m90762J().booleanValue() || (chatFooter$$j1 = this.f211789N1) == null)) {
                Boolean bool = Boolean.TRUE;
                Boolean bool2 = Boolean.FALSE;
                ((C73467e5.C73469b) chatFooter$$j1).mo102423a(bool, bool2);
                ((C73467e5.C73469b) this.f211789N1).mo102424b(bool, bool2);
            }
            if (i3 != this.f211884i1) {
                if (this.f211905n.getVisibility() == 8) {
                    mo100400g0();
                }
                if (i3 == 0 && this.f211962y.getVisibility() == 8) {
                    mo100400g0();
                } else if (i3 == 3 || (i3 == 0 && this.f211962y.getVisibility() == 8)) {
                    mo100400g0();
                }
            }
            View view = this.f211926r;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "switchPanel", "(IZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "switchPanel", "(IZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (i3 == 0) {
                this.f211911o1 = 0;
                mo100388Z0(false, (Runnable) null);
                mo100386Y0(false, (Runnable) null, -1);
                mo100430i0();
                C72806l1 l1Var = this.f211772J;
                if (l1Var != null) {
                    C72843y1 y1Var = (C72843y1) l1Var;
                    y1Var.f212286j = false;
                    y1Var.mo100683b();
                }
            } else if (i3 == 1) {
                if (!this.f211874g1 || this.f211922q1) {
                    this.f211911o1 = 0;
                } else {
                    this.f211911o1 = this.f211952w1;
                }
                mo100388Z0(false, (Runnable) null);
                mo100386Y0(false, (Runnable) null, -1);
            } else if (i3 == 2) {
                this.f211911o1 = this.f211969z1;
                this.f211936t.setVisibility(0);
                mo100386Y0(false, new ChatFooter$$k0(this), -1);
            } else if (i3 == 3) {
                this.f211911o1 = this.f211964y1;
                this.f211936t.setVisibility(0);
                mo100388Z0(false, new ChatFooter$$l0(this, i2));
                C72826s1 s1Var = this.f211768I;
                if (!((ChatFooter) s1Var.f212235l).mo100450s0()) {
                    Log.m105928w("MicroMsg.RecentImageBubble", "[checkIfShow] is not support.");
                } else {
                    C86709a0.m107525e().postToWorker(new C72820q1(s1Var, new C72819p1(s1Var, s1Var.f212224a.getMainLooper())));
                }
                mo100501w0(false);
                if (this.f211838Y0 == 2) {
                    mo100503x0(1);
                }
            } else if (i3 == 4) {
                View view3 = this.f211926r;
                if (view3 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(4);
                    View view4 = view3;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "switchPanel", "(IZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "switchPanel", "(IZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f211911o1 = this.f211735A1;
                mo100388Z0(false, (Runnable) null);
                mo100386Y0(false, (Runnable) null, -1);
            }
            int i5 = this.f211884i1;
            int i6 = ((i5 == 0 && i3 == 1) || (i5 == 1 && i3 == 0)) ? 1 : 0;
            Class cls2 = C79337a0.class;
            boolean z2 = 1 == i6;
            if ((i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4) && i3 == 0) {
                GroupTodoComponent.C73357g gVar2 = this.f211765H1;
                if (gVar2 != null) {
                    ((C79337a0) ((FootComponent$$i) gVar2).f215536a.f215752d.f193278b.mo102812a(cls2)).mo102213R0(z2);
                }
            } else if (i5 == 0 && ((i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) && (gVar = this.f211765H1) != null)) {
                ((C79337a0) ((FootComponent$$i) gVar).f215536a.f215752d.f193278b.mo102812a(cls2)).mo102215Z3(z2);
            }
            boolean z3 = this.f211884i1 != i3;
            this.f211884i1 = i3;
            if (i3 == 2) {
                mo100380V0(true);
                C33934b.f91642b = System.currentTimeMillis();
                Log.m105924i("MicroMsg.ChatEmojiBtnClickReport", "recordOpen: " + C33934b.f91642b + ", " + C33934b.f91644d);
                if (!C33934b.f91644d) {
                    C115669n nVar = C115669n.INSTANCE;
                    int i7 = 3;
                    Object[] objArr = new Object[3];
                    if (C33934b.f91643c) {
                        i7 = 1;
                    }
                    objArr[0] = Integer.valueOf(i7);
                    objArr[1] = 0;
                    objArr[2] = Long.valueOf(C33934b.f91642b);
                    nVar.mo160131h(17302, objArr);
                    C76595c a = C76595c.m92188a();
                    long j = C33934b.f91642b;
                    a.getClass();
                    Log.m105924i("EmojiClickReport", "panelShow");
                    a.f224188a = j;
                    a.f224189b = 1;
                    C99150i a2 = C99150i.m129154a();
                    long j2 = C33934b.f91642b;
                    a2.f290708a = j2;
                    a2.f290709b = 1;
                    C76596h.f224194a = j2;
                    C76596h.f224196c = 1;
                }
                C33934b.f91644d = true;
                C33934b.f91643c = false;
            } else {
                mo100380V0(false);
                C33934b.f91641a.mo59372a();
            }
            int i8 = this.f211911o1;
            GroupTodoComponent.C73357g gVar3 = this.f211765H1;
            if (gVar3 != null) {
                i4 = ((FootComponent$$i) gVar3).mo102204a();
            }
            mo100350F0(i8, z, i6, i4);
            if (z3) {
                ((C119157j) C119157j.f356862d).mo183878i(new ChatFooter$$m0(this), 300);
            }
            ChatFooter$$m1 chatFooter$$m1 = this.f211788N;
            if (chatFooter$$m1 != null) {
                chatFooter$$m1.mo100543m4(this.f211884i1, this.f211911o1);
            }
            ChatFooter$$i1 chatFooter$$i1 = this.f211826V1;
            if (chatFooter$$i1 != null && chatFooter$$i1.mo100531a() != null && this.f211826V1.mo100531a().f193278b.mo102812a(cls) != null) {
                ((C78837h) this.f211826V1.mo100531a().f193278b.mo102812a(cls)).mo102439h(this.f211884i1, this.f211864e1);
            }
        }
    }

    /* renamed from: Y */
    public void mo100385Y(boolean z, boolean z2) {
        AppPanel appPanel = this.f211878h;
        boolean z3 = !z;
        appPanel.f211687A.f212162f.f212183a = z3;
        appPanel.mo100316o();
        Log.m105918d("MicroMsg.AppPanel", "enable " + z3 + " isVoipPluginEnable " + appPanel.f211687A.f212163g.f212183a);
        AppPanel appPanel2 = this.f211878h;
        boolean z4 = z2 ^ true;
        appPanel2.f211687A.f212168l.f212183a = z4;
        appPanel2.mo100316o();
        Log.m105918d("MicroMsg.AppPanel", "enable " + appPanel2.f211687A.f212169m.f212183a + " isVoipAudioEnable " + z4);
    }

    /* renamed from: Y0 */
    public final void mo100386Y0(boolean z, Runnable runnable, int i) {
        if (z) {
            if (this.f211878h == null) {
                mo100433l0();
            }
            this.f211878h.animate().cancel();
            if (this.f211878h.getVisibility() != 0 || this.f211878h.getAlpha() != 1.0f) {
                setAppPanelVisible(0);
                this.f211878h.setAlpha(0.0f);
                this.f211878h.animate().setDuration(200).alpha(1.0f).withEndAction(runnable).setListener(new ChatFooter$$f0(this)).start();
                this.f211878h.setUncertainEnterLocation(i);
                this.f211878h.mo100321s();
            } else if (runnable != null) {
                runnable.run();
            }
        } else {
            this.f211878h.animate().cancel();
            if (this.f211878h.getVisibility() != 4 && this.f211878h.getAlpha() != 0.0f) {
                this.f211878h.animate().setDuration(200).alpha(0.0f).withEndAction(new ChatFooter$$g0(this, runnable));
            } else if (runnable != null) {
                runnable.run();
            }
        }
        this.f211888j.mo104247g();
    }

    /* renamed from: Z */
    public void mo100387Z() {
        Log.m105924i("MicroMsg.ChatFooter", "jacks chatting footer enable enter button send");
        this.f211854c1 = true;
        this.f211888j.setImeOptions(4);
        C74974a aVar = this.f211888j;
        aVar.setInputType(aVar.getInputType() & -65);
    }

    /* renamed from: Z0 */
    public final void mo100388Z0(boolean z, Runnable runnable) {
        if (z) {
            if (this.f211868f == null) {
                mo100434m0();
            }
            this.f211868f.animate().cancel();
            if (this.f211868f.getVisibility() != 0 || this.f211868f.getAlpha() != 1.0f) {
                this.f211868f.setVisibility(0);
                this.f211868f.setAlpha(0.0f);
                this.f211868f.animate().setDuration(200).alpha(1.0f).withEndAction(runnable).start();
                this.f211868f.setToSendText(this.f211888j.getText().toString());
            } else if (runnable != null) {
                runnable.run();
            }
        } else {
            ChatFooterPanel chatFooterPanel = this.f211868f;
            if (chatFooterPanel != null && chatFooterPanel.getVisibility() != 4 && this.f211868f.getAlpha() != 0.0f) {
                this.f211868f.animate().cancel();
                this.f211868f.animate().setDuration(200).alpha(0.0f).withEndAction(new ChatFooter$$h0(this, runnable)).start();
            } else if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    public void mo91487a(String str, int i) {
        if (i == 2) {
            String str2 = "#" + str + " ";
            C74974a aVar = this.f211888j;
            if (aVar != null) {
                aVar.append(str2);
                C74974a aVar2 = this.f211888j;
                aVar2.setSelection(aVar2.getText().length());
                this.f211888j.mo104256m();
                return;
            }
            return;
        }
        String str3 = str + " ";
        C74974a aVar3 = this.f211888j;
        if (aVar3 != null) {
            aVar3.append(str3);
            C74974a aVar4 = this.f211888j;
            aVar4.setSelection(aVar4.getText().length());
            this.f211888j.mo104256m();
        }
    }

    /* renamed from: a0 */
    public void mo100389a0() {
        WeImageButton weImageButton = (WeImageButton) this.f211863e.findViewById(C0966R.C0970id.b8q);
        this.f211956x = weImageButton;
        weImageButton.setVisibility(0);
        if (!C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_EMOJI_CAPTURE_OUTER_EMOJI_BUTTON_RED_DOT_BOOLEAN, true)) {
            View findViewById = this.f211863e.findViewById(C0966R.C0970id.b8r);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initSmileyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initSmileyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View findViewById2 = this.f211863e.findViewById(C0966R.C0970id.b8r);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initSmileyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initSmileyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View findViewById3 = this.f211863e.findViewById(C0966R.C0970id.b8r);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view = findViewById3;
        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initSmileyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initSmileyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f211956x.setOnClickListener(new C72772c0(this));
        C72806l1 l1Var = this.f211772J;
        if (l1Var != null) {
            ((C72843y1) l1Var).f212282f = this.f211956x;
        }
        C79206x xVar = this.f211776K;
        if (xVar != null) {
            xVar.f232521f = this.f211863e;
        }
    }

    /* renamed from: a1 */
    public void mo100390a1() {
        this.f211806R1 = getChatEnableEnterButtonSend();
        this.f211811S1 = getConfigEnableEnterButtonSend();
        C74974a aVar = this.f211888j;
        if (aVar != null) {
            aVar.setEnableSendBtn(this.f211806R1);
        }
    }

    /* renamed from: b */
    public void mo91488b(C101810m82 m822) {
    }

    /* renamed from: b0 */
    public final void mo100391b0() {
        if (this.f211893k1 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ChattingScrollLayout) {
                this.f211893k1 = (ChattingScrollLayout) parent;
                this.f211897l1 = true;
            }
        }
    }

    /* renamed from: b1 */
    public final void mo100392b1() {
        if (!this.f211879h1) {
            Log.m105925i("MicroMsg.ChatFooter", "updateKeyboardProvider: not resumed %s", Util.getStack());
        } else if (this.f211922q1 || !this.f211874g1) {
            this.f211901m1.mo104021d();
            ((Activity) getContext()).getWindow().setSoftInputMode(18);
        } else {
            ((Activity) getContext()).getWindow().setSoftInputMode(this.f211906n1);
            this.f211901m1.mo104022e();
        }
    }

    /* renamed from: c0 */
    public HashMap<String, String> mo100393c0(String str, String str2) {
        HashMap hashMap;
        int indexOf;
        int indexOf2;
        long currentTimeMillis = System.currentTimeMillis();
        if (Util.isNullOrNil(str2)) {
            if (this.f211795P.f212006e.containsKey(str)) {
                this.f211795P.f212006e.remove(str);
            }
            return null;
        }
        if (this.f211795P.f212006e.containsKey(str) && this.f211795P.f212006e.get(str).size() > 0) {
            LinkedList<String> linkedList = new LinkedList<>();
            int i = 0;
            while (i < str2.length() && (indexOf = str2.indexOf("@", i)) != -1 && (indexOf2 = str2.indexOf(8197, indexOf)) != -1 && indexOf2 - indexOf <= 40) {
                linkedList.add(str2.substring(indexOf + 1, indexOf2));
                i = indexOf2 + 1;
            }
            Log.m105925i("MicroMsg.ChatFooter", "after split @ :%s", linkedList);
            if (linkedList.size() <= 0) {
                this.f211795P.f212006e.get(str).clear();
                return null;
            }
            LinkedList linkedList2 = this.f211795P.f212006e.get(str);
            if (linkedList2 == null || linkedList2.size() <= 0) {
                Log.m105928w("MicroMsg.ChatFooter", "list is null or size 0");
            } else {
                Log.m105925i("MicroMsg.ChatFooter", "[getAtSomebodyUsernames] size:%s", Integer.valueOf(linkedList2.size()));
                LinkedList linkedList3 = new LinkedList();
                int i2 = 0;
                for (String str3 : linkedList) {
                    if (linkedList2.size() <= i2 || (hashMap = (HashMap) linkedList2.get(i2)) == null || !hashMap.containsKey(str3)) {
                        Iterator it = linkedList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            HashMap hashMap2 = (HashMap) it.next();
                            if (hashMap2.containsKey(str3)) {
                                linkedList3.add((String) hashMap2.get(str3));
                                break;
                            }
                        }
                    } else {
                        linkedList3.add((String) hashMap.get(str3));
                    }
                    i2++;
                }
                HashMap<String, String> hashMap3 = new HashMap<>(1);
                Log.m105925i("MicroMsg.ChatFooter", "[getAtSomebodyUsernames]  atList size:%s", Integer.valueOf(linkedList3.size()));
                hashMap3.put("atuserlist", "<![CDATA[" + Util.listToString(linkedList3, ",") + "]]>");
                linkedList2.clear();
                Log.m105919d("MicroMsg.ChatFooter", "[getAtSomebodyUsernames] cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                return hashMap3;
            }
        }
        return null;
    }

    /* renamed from: c1 */
    public final void mo100394c1(int i) {
        WeImageButton weImageButton = this.f211921q;
        if (weImageButton != null) {
            boolean z = i == C0966R.C0969drawable.f4804nd;
            if (weImageButton != null) {
                if (z) {
                    weImageButton.setContentDescription(getContext().getString(C0966R.string.b3m));
                } else {
                    weImageButton.setContentDescription(getContext().getString(C0966R.string.b3l));
                }
            }
            this.f211921q.setImageResource(i);
            this.f211921q.setIconColor(getContext().getResources().getColor(C0966R.color.FG_0));
            this.f211921q.setPadding(0, 0, 0, 0);
        }
    }

    /* renamed from: d1 */
    public void mo100395d1() {
        boolean z = false;
        boolean z2 = !mo100444p0() && this.f211874g1 && !this.f211922q1;
        if (!((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_custom_emoji_panel_disable_slidable, false)) {
            z = z2;
        }
        ChatFooterPanel chatFooterPanel = this.f211868f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setSmileyPanelExpandable(z);
        }
    }

    /* renamed from: e0 */
    public int mo100396e0(String str, int i) {
        if (this.f211795P.f212006e.containsKey(str) && this.f211795P.f212006e.get(str).size() > 0) {
            i |= 1;
        }
        if (this.f211809S) {
            i |= this.f211819U ? 4 : 8;
        }
        if (!this.f211814T) {
            return i;
        }
        return i | (this.f211819U ? 16 : 32);
    }

    /* renamed from: e1 */
    public void mo100397e1() {
        this.f211888j.setMaxHeight((this.f211962y.getMaxHeight() - this.f211962y.getPaddingBottom()) - this.f211962y.getPaddingTop());
    }

    /* renamed from: f0 */
    public void mo100398f0() {
        this.f211859d1 = true;
        ChatFooterPanel chatFooterPanel = this.f211868f;
        if (chatFooterPanel != null) {
            chatFooterPanel.mo100191d();
        }
    }

    /* renamed from: f1 */
    public void mo100399f1(int i) {
        C76901s0 s0Var;
        C76901s0 s0Var2;
        if (this.f211774J2) {
            SoundWaveView soundWaveView = this.f211802Q2;
            if (soundWaveView != null && soundWaveView.getVisibility() == 0) {
                this.f211802Q2.mo25108i(i);
            }
        } else if (this.f211842Z0) {
            int i2 = 0;
            while (true) {
                int[] iArr = f211732G4;
                if (i2 >= 8) {
                    break;
                }
                int[] iArr2 = f211731F4;
                if (i >= iArr2[i2] && i < iArr2[i2 + 1]) {
                    this.f211898l2.setBackgroundDrawable(C76577a.m92158i(getContext(), iArr[i2]));
                    break;
                }
                i2++;
            }
            if (i == -1 && (s0Var2 = this.f211957x0) != null) {
                s0Var2.dismiss();
                View view = this.f211820U0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f211963y0.setVisibility(8);
                View view3 = this.f211825V0;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            int i3 = 0;
            while (true) {
                int[] iArr3 = f211732G4;
                if (i3 >= 8) {
                    break;
                }
                int[] iArr4 = f211731F4;
                if (i >= iArr4[i3] && i < iArr4[i3 + 1]) {
                    this.f211805R0.setBackgroundDrawable(C76577a.m92158i(getContext(), iArr3[i3]));
                    break;
                }
                i3++;
            }
            if (i == -1 && (s0Var = this.f211957x0) != null) {
                s0Var.dismiss();
                View view5 = this.f211820U0;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f211963y0.setVisibility(8);
                View view7 = this.f211825V0;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "updateVoiceRcdHint", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: g0 */
    public void mo100400g0() {
        C79206x xVar = this.f211776K;
        if (xVar != null) {
            xVar.mo109223a();
        }
    }

    public boolean getActivitySmileyBtn() {
        return this.f211849a4;
    }

    public ArrayList<C72791h.C44607a> getAppPanelUnCertainEnterArrayList() {
        return this.f211878h.getAppPanelUnCertainEnterArrayList();
    }

    public String getAtSomebody() {
        return this.f211795P.f212003b;
    }

    public List<String> getAtSomebodyList() {
        return this.f211795P.f212004c;
    }

    public int getBarGroupHeight() {
        if (this.f211830W0 == null) {
            this.f211830W0 = findViewById(C0966R.C0970id.b4u);
        }
        View view = this.f211830W0;
        return view != null ? view.getHeight() : getResources().getDimensionPixelSize(C0966R.dimen.f3758d_);
    }

    public C44614y0 getCallback() {
        return this.f211949v3;
    }

    public char getCharAtCursor() {
        int selectionStart = getSelectionStart();
        if (selectionStart <= 0) {
            return 'x';
        }
        return getLastText().charAt(selectionStart - 1);
    }

    public boolean getChatEnableEnterButtonSend() {
        C72852z0 z0Var = this.f211745C1;
        return getConfigEnableEnterButtonSend() && !(z0Var != null && z0Var.mo100696i());
    }

    public ChatFooterPanel getChatFooterPanel() {
        return this.f211868f;
    }

    public ChatFooter$$i1 getChattingContext() {
        return this.f211826V1;
    }

    public boolean getConfigEnableEnterButtonSend() {
        return ((Boolean) C97625j3.m125812b().mo105906u().mo119684e(66832, Boolean.FALSE)).booleanValue();
    }

    public int getCurrentScrollHeight() {
        return this.f211911o1;
    }

    public GroupTodoComponent.C73355e getIOnToDoBarCallback() {
        return this.f211769I1;
    }

    public C79353f1.C79355b getIOnTranslateResCallback() {
        return this.f211777K1;
    }

    public int getInsertPos() {
        return this.f211795P.f212005d;
    }

    public boolean getIsMultiWindow() {
        if (C76866m.m92674c() || OnePlus.isOnePlus() || C76866m.m92675d()) {
            return this.f211927r1 || ((Activity) getContext()).isInMultiWindowMode();
        }
        if (C85875k4.m106199o0()) {
            return false;
        }
        return ((Activity) getContext()).isInMultiWindowMode();
    }

    public boolean getIsVoiceInputPanleShow() {
        return this.f211864e1;
    }

    public int getKeyBordHeightPX() {
        return KeyBoardUtil.getValidPanelHeight(getContext());
    }

    public String getLastContent() {
        return this.f211795P.f212002a;
    }

    public long getLastQuoteMsgId() {
        if (this.f211744C.getTag() == null || !(this.f211744C.getTag() instanceof C72963f4)) {
            return 0;
        }
        return ((C72963f4) this.f211744C.getTag()).getMsgId();
    }

    public String getLastText() {
        C74974a aVar = this.f211888j;
        return aVar == null ? "" : aVar.getText().toString();
    }

    public int getMode() {
        return this.f211838Y0;
    }

    public View getPanel() {
        return this.f211936t;
    }

    public int getPanelType() {
        return this.f211884i1;
    }

    public int getSelectionStart() {
        return this.f211888j.getSelectionStart();
    }

    public C72830t1 getSeqAutoCompleteHelper() {
        if (this.f211749D1 == null) {
            this.f211749D1 = new C72830t1(this);
        }
        return this.f211749D1;
    }

    public int getSmieyType() {
        return 0;
    }

    public int getYFromBottom() {
        int height;
        int a;
        if (this.f211884i1 == 0) {
            height = getHeight();
            a = this.f211958x1;
        } else {
            height = (getHeight() - this.f211958x1) + KeyBoardUtil.getValidPanelHeight(getContext(), getKeyBordHeightPX(), this.f211922q1);
            GroupTodoComponent.C73357g gVar = this.f211765H1;
            if (gVar == null) {
                return height;
            }
            a = ((FootComponent$$i) gVar).mo102204a();
        }
        return height - a;
    }

    /* renamed from: h0 */
    public boolean mo100429h0() {
        if (C85875k4.m106208w()) {
            boolean hideVKB = Util.hideVKB(this);
            Log.m105925i("MicroMsg.ChatFooter", "hideVKB status：%s, view:%s, stack:%s", Boolean.valueOf(hideVKB), this, Util.getStack());
            return hideVKB;
        } else if (getKeyBordHeightPX() / 2 <= getBottom()) {
            Log.m105924i("MicroMsg.ChatFooter", "hideVKB: ");
            return Util.hideVKB(this);
        } else {
            Log.m105924i("MicroMsg.ChatFooter", "hideVKB failed!!!");
            return false;
        }
    }

    /* renamed from: i0 */
    public final void mo100430i0() {
        if (this.f211864e1) {
            this.f211864e1 = false;
            if (this.f211873g != null) {
                int keyBordHeightPX = getKeyBordHeightPX() + this.f211926r.getHeight() + this.f211931s.getHeight();
                this.f211873g.animate().cancel();
                this.f211873g.animate().translationY((float) keyBordHeightPX).withEndAction(new ChatFooter$$j(this)).start();
            }
            this.f211888j.setText("");
        }
    }

    /* renamed from: j0 */
    public final void mo100431j0() {
        View view = this.f211866e3;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "inactiveNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "inactiveNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f211856c3.mo104517q(getResources().getColor(C0966R.color.f2975b6), 0.5f);
        this.f211848a3.setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.akj));
        this.f211848a3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150).start();
    }

    /* renamed from: k0 */
    public final void mo100432k0() {
        View view = this.f211871f3;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "inactiveNewVoice2txtTrans", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "inactiveNewVoice2txtTrans", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f211861d3.mo104517q(getResources().getColor(C0966R.color.f2975b6), 0.5f);
        this.f211852b3.setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.akj));
        this.f211852b3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
    }

    /* renamed from: l0 */
    public final void mo100433l0() {
        ChatFooter$$i1 chatFooter$$i1 = this.f211826V1;
        String b = chatFooter$$i1 == null ? this.f211858d : chatFooter$$i1.mo100532b();
        AppPanel appPanel = (AppPanel) findViewById(C0966R.C0970id.b1m);
        this.f211878h = appPanel;
        appPanel.setOnSwitchPanelListener(this.f211960x3);
        this.f211878h.setChattingContext(this.f211966y3);
        this.f211878h.setPortHeighPx(KeyBoardUtil.getValidPanelHeight(getContext()));
        if (C45628s0.m50812z(b) || C72996z1.m85816S4(b)) {
            this.f211878h.mo100319q(0);
        } else if (C45628s0.m50738C(b)) {
            this.f211878h.mo100319q(4);
        } else if (C72996z1.m85820U5(b)) {
            this.f211878h.mo100319q(2);
        } else {
            this.f211878h.mo100319q(1);
        }
        this.f211941u = (TextView) findViewById(C0966R.C0970id.b1n);
    }

    /* renamed from: m0 */
    public void mo100434m0() {
        boolean z = false;
        if (C30699x0.m39154a() != null && getContext() != null) {
            ChatFooterPanel chatFooterPanel = this.f211868f;
            if (chatFooterPanel != null) {
                chatFooterPanel.mo100189b();
            }
            ChatFooterPanel si02 = C30699x0.m39154a().si0(getContext());
            this.f211868f = si02;
            if (si02 != null) {
                si02.setShowSearch(true);
                ChatFooterPanel chatFooterPanel2 = this.f211868f;
                int i = ChatFooterPanel.f211589f;
                chatFooterPanel2.setEntranceScene(1);
                this.f211868f.setVisibility(8);
                this.f211868f.setFooterType(this.f211734A);
                ChatFooterBottom chatFooterBottom = this.f211936t;
                if (chatFooterBottom != null) {
                    chatFooterBottom.addView(this.f211868f, -1, -1);
                }
                this.f211868f.setOnTextOperationListener(this.f211954w3);
                ChatFooterPanel chatFooterPanel3 = this.f211868f;
                if (this.f211888j.getText().length() > 0) {
                    z = true;
                }
                chatFooterPanel3.setSendButtonEnable(z);
                ChatFooter$$i1 chatFooter$$i1 = this.f211826V1;
                if (chatFooter$$i1 != null) {
                    this.f211868f.setTalkerName(chatFooter$$i1.mo100532b());
                }
                this.f211868f.mo100197i();
                if (this.f211859d1) {
                    mo100398f0();
                }
                setSmileyPanelCallback(this.f211949v3);
                this.f211868f.setSmileyPanelExpandable(true);
                C78405p panelSlideIndicator = this.f211868f.getPanelSlideIndicator();
                this.f211883i = panelSlideIndicator;
                ((C103055g) panelSlideIndicator).f304050e = new ChatFooter$$e(this);
            }
        } else if (getContext() == null) {
            Log.m105921e("MicroMsg.ChatFooter", "[initSmiley] context always is null! %s", Util.getStack());
            this.f211868f = new C72834u0(MMApplicationContext.getContext());
        } else {
            this.f211868f = new C72834u0(getContext());
        }
    }

    /* renamed from: n0 */
    public final void mo100435n0() {
        View view = this.f211928r2;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initTransVoiceNormalBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initTransVoiceNormalBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f211943u2;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initTransVoiceNormalBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "initTransVoiceNormalBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f211928r2.setScaleX(0.5f);
        this.f211928r2.setScaleY(0.5f);
        this.f211943u2.setScaleX(0.5f);
        this.f211943u2.setScaleY(0.5f);
        this.f211928r2.setTranslationX((float) this.f211882h4);
        this.f211928r2.setTranslationY((float) (-this.f211887i4));
        this.f211943u2.setTranslationX((float) (-this.f211882h4));
        this.f211943u2.setTranslationY((float) (-this.f211887i4));
        this.f211933s2.setIconColor(getResources().getColor(C0966R.color.f3138gm));
        this.f211938t2.setTextColor(getResources().getColor(C0966R.color.ai8));
        this.f211928r2.setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.azv));
        this.f211948v2.setIconColor(getResources().getColor(C0966R.color.f3138gm));
        this.f211953w2.setTextColor(getResources().getColor(C0966R.color.ai8));
        this.f211943u2.setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.azv));
    }

    /* renamed from: o */
    public final void mo100436o() {
        this.f211908n3.animate().translationY(0.0f).alpha(1.0f).setDuration(100).withEndAction(new ChatFooter$$f1(this)).start();
        this.f211913o3.animate().translationY(0.0f).alpha(1.0f).setDuration(100).start();
        this.f211919p3.animate().translationY(0.0f).setDuration(100).start();
        if (this.f211841Y3 < 10) {
            mo100365N0();
        } else {
            mo100379U0();
            this.f211802Q2.mo25107h(SoundWaveView.C19411i.NORMAL);
        }
        this.f211836X2.setVisibility(0);
        this.f211827V2.setVisibility(8);
        this.f211797P2.setVisibility(8);
        this.f211807R2.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_voice2txt_cursor, getContext().getResources().getColor(C0966R.color.f2957ad)));
        this.f211807R2.animate().translationX(0.0f).setDuration(150).start();
        this.f211793O2.setActivated(true);
        mo100498v();
        mo100500w();
    }

    /* renamed from: o0 */
    public boolean mo100437o0() {
        return this.f211884i1 != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IListener<OPPOFloatWindowModeChangedEvent> iListener = this.f211761G1;
        if (iListener != null) {
            iListener.alive();
        }
        mo100392b1();
        mo100391b0();
        mo100505y0(getKeyBordHeightPX());
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (C11171e.m11046c(24)) {
            this.f211922q1 = getIsMultiWindow();
        }
        this.f211874g1 = configuration.orientation == 1;
        mo100395d1();
        mo100341B(0, false, -1);
        mo100392b1();
        Log.m105925i("MicroMsg.ChatFooter", "onConfigurationChanged: %s, %s, %s", configuration, Boolean.valueOf(this.f211874g1), Boolean.valueOf(this.f211922q1));
        mo100505y0(getKeyBordHeightPX());
        C79076g gVar = C79076g.f232207s;
        if (gVar != null) {
            gVar.dismiss();
        }
        if (C47276a.m52573I()) {
            C47276a.f126899p.getClass();
            C47276a.f126901r = C85875k4.m106211z();
            try {
                C47276a aVar = C47276a.f126900q;
                if (aVar != null) {
                    aVar.dismiss();
                }
            } catch (Exception unused) {
            }
            C47276a.f126900q = null;
        }
        C72852z0 z0Var = this.f211745C1;
        if (z0Var.mo100696i()) {
            z0Var.mo100688a();
        }
        z0Var.mo100695h(z0Var.f212318b.getLineCount());
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f211901m1.mo104021d();
        this.f211893k1 = null;
        this.f211897l1 = false;
        IListener<OPPOFloatWindowModeChangedEvent> iListener = this.f211761G1;
        if (iListener != null) {
            iListener.dead();
        }
    }

    public void onDismiss() {
        this.f211888j.mo104256m();
        this.f211937t1 = false;
        mo100377T0();
        f211728C4 = null;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        ChattingScrollLayout chattingScrollLayout;
        super.onSizeChanged(i, i2, i3, i4);
        Log.m105919d("MicroMsg.ChatFooter", "keybord:ChatFooter onSizeChanged  w:%d, h:%d, oldw:%d, oldh:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        mo100391b0();
        C78405p pVar = this.f211883i;
        if (pVar != null && ((C103055g) pVar).f304061p == 0 && (chattingScrollLayout = this.f211893k1) != null && this.f211739B != null) {
            ((C103055g) pVar).mo142757b(chattingScrollLayout.getHeight(), this.f211958x1, this.f211739B.getMeasuredHeight());
        }
    }

    /* renamed from: p */
    public void mo100443p(String str, String str2, String str3) {
        LinkedList linkedList;
        if (this.f211795P.f212006e.containsKey(str)) {
            linkedList = this.f211795P.f212006e.get(str);
        } else {
            LinkedList linkedList2 = new LinkedList();
            this.f211795P.f212006e.put(str, linkedList2);
            linkedList = linkedList2;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(str3, str2);
        linkedList.add(hashMap);
    }

    /* renamed from: p0 */
    public boolean mo100444p0() {
        return this.f211745C1.mo100696i();
    }

    /* renamed from: q */
    public void mo100445q() {
        Button button = this.f211905n;
        if (button != null && button.getVisibility() != 8) {
            if (this.f211872f4 == 0) {
                this.f211872f4 = this.f211905n.getWidth();
                this.f211877g4 = this.f211946v.getWidth();
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{this.f211872f4, this.f211877g4});
            valueAnimator.addUpdateListener(new ChatFooter$$v0(this));
            valueAnimator.addListener(new ChatFooter$$w0(this));
            valueAnimator.setDuration(150);
            valueAnimator.start();
        }
    }

    /* renamed from: q0 */
    public boolean mo100446q0() {
        return this.f211744C.getTag() != null && (this.f211744C.getTag() instanceof C72963f4) && this.f211739B.isShown() && this.f211744C.isShown();
    }

    /* renamed from: r */
    public void mo100447r() {
        Button button = this.f211905n;
        if (button != null) {
            if (this.f211872f4 == 0) {
                this.f211872f4 = button.getWidth();
                this.f211877g4 = this.f211946v.getWidth();
            }
            if (this.f211872f4 == 0) {
                this.f211905n.startAnimation(this.f211831W1);
                this.f211905n.setVisibility(0);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{this.f211877g4, this.f211872f4});
            valueAnimator.addUpdateListener(new ChatFooter$$x0(this));
            valueAnimator.setDuration(150);
            valueAnimator.addListener(new ChatFooter$$y0(this));
            valueAnimator.start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        r0 = r0.getRootWindowInsets().getDisplayCutout();
     */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo100448r0() {
        /*
            r4 = this;
            com.tencent.mm.ui.MMFragment r0 = r4.f211816T1
            r1 = 0
            if (r0 == 0) goto L_0x0041
            android.view.View r0 = r0.getView()
            if (r0 != 0) goto L_0x000c
            goto L_0x0041
        L_0x000c:
            com.tencent.mm.ui.MMFragment r0 = r4.f211816T1
            android.view.View r0 = r0.getView()
            r2 = 2131309315(0x7f093303, float:1.823691E38)
            android.view.View r0 = r0.findViewById(r2)
            if (r0 != 0) goto L_0x001c
            return r1
        L_0x001c:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.getGlobalVisibleRect(r2)
            r3 = 28
            boolean r3 = p206nj.C11171e.m11046c(r3)
            if (r3 == 0) goto L_0x003b
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            android.view.DisplayCutout r0 = r0.getDisplayCutout()
            if (r0 == 0) goto L_0x003b
            int r0 = r0.getSafeInsetLeft()
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            int r2 = r2.left
            if (r2 <= r0) goto L_0x0041
            r1 = 1
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.mo100448r0():boolean");
    }

    /* renamed from: s */
    public void mo100449s(View view) {
        C72825s0 s0Var = this.f211780L;
        if (s0Var != null) {
            s0Var.mo100664z(view);
        }
        int i = 2;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f211878h.getVisibility());
        ChatFooterBottom chatFooterBottom = this.f211936t;
        objArr[1] = Boolean.valueOf(chatFooterBottom.f212076d || chatFooterBottom.getVisibility() != 0);
        Log.m105925i("MicroMsg.ChatFooter", "click attach btn: %s, %s", objArr);
        int i2 = -1;
        if (this.f211884i1 != 3) {
            if (!(view == null || view.getTag() == null)) {
                i2 = ((Integer) view.getTag()).intValue();
            }
            mo100341B(3, true, i2);
            VoiceInputPanel voiceInputPanel = this.f211873g;
            if (voiceInputPanel != null && voiceInputPanel.getVisibility() == 0 && this.f211864e1) {
                Log.m105918d("MicroMsg.ChatFooter", "voiceInputPanel is VISIBLE, set appPanel VISIBLE");
                this.f211873g.setVisibility(8);
                this.f211864e1 = false;
                this.f211873g.mo25282l();
            }
            C44547a2 c = C44547a2.m48943c();
            Context context = MMApplicationContext.getContext();
            c.getClass();
            if (C86709a0.m107522a() && context != null) {
                try {
                    String c2 = C47509i.m52838a().mo107405c("ShowAPPSuggestion");
                    if (Util.isNullOrNil(c2) || Integer.valueOf(c2).intValue() != 1) {
                        Log.m105929w("MicroMsg.SuggestionAppListLogic", "cfgShowAppSuggestion %s, return", c2);
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.SuggestionAppListLogic", "exception in getSuggestionAppList, %s", e.getMessage());
                }
                if (c.f120801a) {
                    Log.m105928w("MicroMsg.SuggestionAppListLogic", "SuggestionApp is Loading");
                } else {
                    Log.m105924i("MicroMsg.SuggestionAppListLogic", "getSuggestionAppList");
                    c.f120801a = true;
                    if (System.currentTimeMillis() - c.f120805e < 43200000) {
                        Log.m105918d("MicroMsg.SuggestionAppListLogic", "not now");
                        c.f120801a = false;
                    } else {
                        C86709a0.m107528h();
                        c.f120805e = C86709a0.m107535s().mo121142i().mo119672F(352275, 0);
                        if (System.currentTimeMillis() - c.f120805e < 43200000) {
                            Log.m105928w("MicroMsg.SuggestionAppListLogic", "not now sp");
                            c.f120801a = false;
                        } else {
                            if (c.f120803c == null) {
                                c.f120803c = LocaleUtil.loadApplicationLanguage(context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), context);
                            }
                            C44560i1 i1Var = new C44560i1(3, 0, 20, c.f120803c, new LinkedList());
                            C46848g.yx0().getClass();
                            C86709a0.m107529k().f251779b.mo123460f(new C44551e1(4, i1Var));
                        }
                    }
                }
            }
            C44547a2.m48943c().mo69334d(MMApplicationContext.getContext());
            if (C72996z1.m85807K5(this.f211847a2)) {
                String str = this.f211847a2;
                if (!C45628s0.m50750O(str)) {
                    i = C45628s0.m50752Q(str) ? 1 : 0;
                }
                ChatRoomToolPanelOperateLogStruct chatRoomToolPanelOperateLogStruct = new ChatRoomToolPanelOperateLogStruct();
                chatRoomToolPanelOperateLogStruct.f194158d = chatRoomToolPanelOperateLogStruct.mo86045b("roomusrname", str, true);
                chatRoomToolPanelOperateLogStruct.f194159e = 1;
                chatRoomToolPanelOperateLogStruct.f194162h = (long) i;
                chatRoomToolPanelOperateLogStruct.mo86054n();
            }
        } else if (this.f211838Y0 == 1) {
            mo100377T0();
        } else {
            mo100341B(0, true, -1);
        }
    }

    /* renamed from: s0 */
    public boolean mo100450s0() {
        ChatFooter$$i1 chatFooter$$i1 = this.f211826V1;
        if (chatFooter$$i1 == null || chatFooter$$i1.mo100531a() == null) {
            return true;
        }
        if (!((C79365j) this.f211826V1.mo100531a().f193278b.mo102812a(C79365j.class)).mo70105e4()) {
            if (!((C79377q) this.f211826V1.mo100531a().f193278b.mo102812a(C79377q.class)).mo70131k2()) {
                if (!((C79366k) this.f211826V1.mo100531a().f193278b.mo102812a(C79366k.class)).mo70129g1()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setAppPanelListener(AppPanel.C72752g gVar) {
        this.f211878h.setAppPanelListener(gVar);
    }

    public void setAppPanelTip(CharSequence charSequence) {
        TextView textView = this.f211941u;
        if (textView != null && this.f211878h != null) {
            textView.setText(charSequence);
            if (!Util.isNullOrNil(charSequence)) {
                setAppPanelTipVisible(this.f211878h.getVisibility() == 0);
            }
        }
    }

    public void setAppPanelTipVisible(boolean z) {
        TextView textView = this.f211941u;
        if (textView != null) {
            int i = 8;
            if (TextUtils.isEmpty(textView.getText())) {
                this.f211941u.setVisibility(8);
                return;
            }
            if (z) {
                int height = (this.f211936t.getHeight() - getKeyBordHeightPX()) + C76577a.m92151b(this.f211941u.getContext(), 32);
                ViewGroup.LayoutParams layoutParams = this.f211941u.getLayoutParams();
                if (layoutParams != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = height;
                    this.f211941u.setLayoutParams(marginLayoutParams);
                }
            }
            TextView textView2 = this.f211941u;
            if (z) {
                i = 0;
            }
            textView2.setVisibility(i);
        }
    }

    public void setAppPanelUnCertainEnterArrayList(ArrayList<C72791h.C44607a> arrayList) {
        this.f211878h.setAppPanelUnCertainEnterArrayList(arrayList);
    }

    public void setAppPanelVisible(int i) {
        AppPanel appPanel = this.f211878h;
        if (appPanel != null) {
            appPanel.setVisibility(i);
        }
        setAppPanelTipVisible(i == 0);
    }

    public void setAtSomebody(String str) {
        this.f211795P.f212003b = str;
    }

    public void setBottomPanelVisibility(int i) {
        Class cls = C78837h.class;
        if (i == 0) {
            this.f211936t.setVisibility(i);
        } else {
            mo100339A(0, true);
        }
        ChatFooter$$i1 chatFooter$$i1 = this.f211826V1;
        if (chatFooter$$i1 != null && chatFooter$$i1.mo100531a() != null && this.f211826V1.mo100531a().f193278b.mo102812a(cls) != null) {
            ((C78837h) this.f211826V1.mo100531a().f193278b.mo102812a(cls)).mo102440l(i);
        }
    }

    public void setCattingRootLayoutId(int i) {
    }

    public void setDefaultSmileyByDetail(String str) {
        if (!Util.isNullOrNil(str)) {
            if (this.f211868f == null) {
                mo100434m0();
            }
            this.f211868f.setDefaultEmojiByDetail(str);
        }
    }

    public void setEditTextOnDragListener(View.OnDragListener onDragListener) {
        this.f211888j.setOnDragListener(onDragListener);
    }

    public void setExitType(int i) {
        C71562c cVar = C71562c.f207365v;
        C71562c.f207365v.mo98691b(i);
    }

    public void setFooterEventListener(C72825s0 s0Var) {
        this.f211780L = s0Var;
    }

    public void setFooterStatus(boolean z) {
    }

    public void setFooterType(int i) {
        this.f211734A = i;
        ChatFooterPanel chatFooterPanel = this.f211868f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setFooterType(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        C74974a aVar = this.f211888j;
        if (aVar != null) {
            aVar.setHint(charSequence);
        }
    }

    public void setIOnTodoViewCallback(GroupTodoComponent.C73357g gVar) {
        this.f211765H1 = gVar;
    }

    public void setIOnTranslateViewController(C73537m5.C30825c cVar) {
        this.f211773J1 = cVar;
    }

    public void setIgnoreScroll(Boolean bool) {
        this.f211740B1 = bool.booleanValue();
    }

    public void setInputBarVisibility(int i) {
        View view = this.f211926r;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setInputBarVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setInputBarVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void setInsertPos(int i) {
        this.f211795P.f212005d = i;
    }

    public void setIsMultiWindow(boolean z) {
        boolean z2 = true;
        Log.m105925i("MicroMsg.ChatFooter", "setIsMultiWindow: %s", Boolean.valueOf(z));
        if (this.f211922q1 == z) {
            z2 = false;
        }
        this.f211922q1 = z;
        mo100392b1();
        if (z2) {
            mo100505y0(getKeyBordHeightPX());
            mo100341B(0, false, -1);
        }
    }

    public void setKeyboardShow(Boolean bool) {
        this.f211917p1 = bool.booleanValue();
    }

    public void setLastContent(String str) {
        this.f211795P.f212002a = str;
    }

    public void setLastQuoteMsgId(long j) {
        if (j != 0) {
            setLastQuoteMsgInfo(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j));
        } else {
            this.f211744C.setTag((Object) null);
        }
    }

    public void setLastQuoteMsgInfo(C72963f4 f4Var) {
        String str;
        if (f4Var == null || (f4Var.f230723F & 4) == 4 || f4Var.getType() == 10000) {
            Object[] objArr = new Object[1];
            if (f4Var == null) {
                str = "null";
            } else {
                str = f4Var.getType() + "," + (f4Var.f230723F & 4);
            }
            objArr[0] = str;
            Log.m105921e("MicroMsg.ChatFooter", "msg(%s) is revoked!", objArr);
            C76879j.m92748s(getContext(), getContext().getString(C0966R.string.gwm), "");
            return;
        }
        this.f211744C.setTag(f4Var);
    }

    public void setLastText(String str) {
        mo100352G0(str, -1, true);
    }

    public void setLbsMode(boolean z) {
        this.f211804R = z;
    }

    public void setMode(int i) {
        mo100354H0(i, true);
    }

    public void setOnEditFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f211888j.setOnFocusChangeListener(onFocusChangeListener);
    }

    public void setOnFooterPanelSwitchListener(ChatFooter$$m1 chatFooter$$m1) {
        this.f211788N = chatFooter$$m1;
    }

    public void setOnFooterSwitchListener(ChatFooter$$n1 chatFooter$$n1) {
        this.f211784M = chatFooter$$n1;
        if (chatFooter$$n1 != null) {
            View findViewById = findViewById(C0966R.C0970id.b7m);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setOnFooterSwitchListener", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setOnFooterSwitchListener", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new ChatFooter$$e0(this));
        }
    }

    public void setRecordNormalWording(String str) {
        TextView textView;
        if (str != null && (textView = this.f211810S0) != null) {
            textView.setText(str);
        }
    }

    public void setSetTolastCustomPage(boolean z) {
    }

    public void setSmileyPanelCallback(C44614y0 y0Var) {
        this.f211949v3 = y0Var;
        ChatFooterPanel chatFooterPanel = this.f211868f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setCallback(y0Var);
        }
    }

    public void setSmileyPanelCallback2(C72837v1 v1Var) {
        ((C72843y1) this.f211772J).f212283g = v1Var;
    }

    public void setSwitchButtonMode(int i) {
        if (i != this.f211845Z3) {
            this.f211845Z3 = i;
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.kav);
            ImageView imageView2 = (ImageView) findViewById(C0966R.C0970id.hmu);
            if (this.f211845Z3 == 1) {
                imageView.setVisibility(8);
                imageView2.setVisibility(0);
                return;
            }
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
        }
    }

    public void setTipsShowCallback(ChatFooter$$j1 chatFooter$$j1) {
        this.f211789N1 = chatFooter$$j1;
    }

    public void setToSendTextColor(boolean z) {
        if (C11171e.m11046c(11)) {
            if (C11171e.m11046c(11)) {
                Message message = new Message();
                message.what = 1002;
                message.obj = Boolean.valueOf(z);
                this.f211801Q1.sendMessage(message);
            }
        } else if (z) {
            this.f211888j.setTextColor(getResources().getColor(C0966R.color.a4p));
        } else {
            this.f211888j.setTextColor(getResources().getColor(C0966R.color.f3552xi));
            mo100501w0(false);
        }
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.f211888j.mo104240b();
        C72852z0 z0Var = this.f211745C1;
        if (z0Var.mo100696i()) {
            z0Var.mo100702o();
        }
    }

    public void setUserName(String str) {
        this.f211858d = str;
        ChatFooterPanel chatFooterPanel = this.f211868f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setTalkerName(str);
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = Boolean.valueOf(this.f211878h != null);
        Log.m105925i("MicroMsg.ChatFooter", "setusername: %s, %s", objArr);
        if (this.f211878h == null) {
            return;
        }
        if (C45628s0.m50812z(this.f211858d) || C72996z1.m85816S4(this.f211858d)) {
            this.f211878h.setServiceShowFlag(0);
        } else if (C45628s0.m50738C(this.f211858d)) {
            this.f211878h.setServiceShowFlag(4);
        } else if (C72996z1.m85820U5(this.f211858d)) {
            this.f211878h.setServiceShowFlag(2);
        } else {
            this.f211878h.setServiceShowFlag(1);
        }
    }

    public void setVoice2txtCountDown(int i) {
        if (-1 == i) {
            View view = this.f211894k2;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoice2txtCountDown", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoice2txtCountDown", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f211902m2.setVisibility(8);
        } else if (i >= 0 && i < 10) {
            if (8 == this.f211902m2.getVisibility()) {
                View view3 = this.f211894k2;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoice2txtCountDown", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "setVoice2txtCountDown", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f211902m2.setVisibility(0);
            }
            ImageView imageView = this.f211902m2;
            if (imageView != null) {
                imageView.setImageResource(this.f211783L3[i]);
            }
        }
    }

    public void setVoiceInputShowCallback(ChatFooter$$k1 chatFooter$$k1) {
        this.f211792O1 = chatFooter$$k1;
    }

    public void setVoiceReactArea(int i) {
        if (this.f211774J2) {
            setNewVoice2TxtCountDown(i);
        } else if (i >= 10) {
        } else {
            if (this.f211842Z0) {
                setVoice2txtCountDown(i);
            } else if (-1 == i) {
                setRecordNormalWording(getResources().getString(C0966R.string.b5_));
            } else {
                setRecordNormalWording(getResources().getQuantityString(C0966R.plurals.f7222c, i, new Object[]{Integer.valueOf(i)}));
            }
        }
    }

    public void setWordCountLimit(int i) {
        this.f211910o = (TextView) this.f211863e.findViewById(C0966R.C0970id.b_2);
        this.f211888j.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    /* renamed from: t */
    public void mo100495t(ChatFooter$$i1 chatFooter$$i1) {
        this.f211826V1 = chatFooter$$i1;
        C79206x xVar = new C79206x(getContext(), this.f211826V1.mo100533c(), new C72763a0(this));
        this.f211776K = xVar;
        xVar.f232536u = this.f211781L1;
        C79368l lVar = (C79368l) this.f211826V1.mo100531a().f193278b.mo102812a(C79368l.class);
        lVar.mo108169D4(this.f211865e2);
        this.f211888j.getSizeAnimController().mo91526b(lVar);
        ChatFooter$$i1 chatFooter$$i12 = this.f211826V1;
        if (chatFooter$$i12 != null && chatFooter$$i12.mo100531a() != null) {
            ((C79353f1) this.f211826V1.mo100531a().f193278b.mo102812a(C79353f1.class)).getSizeAnimController().f193270i = lVar;
        }
    }

    /* renamed from: t0 */
    public boolean mo100496t0() {
        ChatFooter$$i1 chatFooter$$i1 = this.f211826V1;
        if (chatFooter$$i1 == null || chatFooter$$i1.mo100531a() == null) {
            return true;
        }
        if (!((C79365j) this.f211826V1.mo100531a().f193278b.mo102812a(C79365j.class)).mo70105e4()) {
            if (!((C79377q) this.f211826V1.mo100531a().f193278b.mo102812a(C79377q.class)).mo70131k2()) {
                if (!((C79366k) this.f211826V1.mo100531a().f193278b.mo102812a(C79366k.class)).mo70129g1()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: u0 */
    public void mo100497u0() {
        VoiceInputPanel voiceInputPanel;
        Log.m105924i("MicroMsg.ChatFooter", "onPause");
        this.f211879h1 = false;
        if (this.f211906n1 == 48 && this.f211884i1 == 1 && !this.f211740B1) {
            this.f211917p1 = false;
            mo100384X0(0, true, -1);
        }
        mo100429h0();
        this.f211901m1.mo104021d();
        ChatFooterPanel chatFooterPanel = this.f211868f;
        if (chatFooterPanel != null) {
            chatFooterPanel.mo100196h();
        }
        if (this.f211864e1 && (voiceInputPanel = this.f211873g) != null) {
            voiceInputPanel.mo25280j();
        }
        C72825s0 s0Var = this.f211780L;
        if (s0Var != null) {
            s0Var.onPause();
        }
        C72806l1 l1Var = this.f211772J;
        if (l1Var != null) {
            ((C72843y1) l1Var).mo100683b();
        }
        C76901s0 s0Var2 = this.f211957x0;
        if (s0Var2 != null && s0Var2.isShowing()) {
            this.f211957x0.dismiss();
        }
        mo100400g0();
        this.f211888j.onPause();
        this.f211743B4.dead();
        ((C75798k) C86312j.m106911c(C75798k.class)).eb0();
    }

    /* renamed from: v */
    public final void mo100498v() {
        int i;
        int i2;
        int width = this.f211793O2.getWidth();
        int height = this.f211793O2.getHeight();
        int ordinal = this.f211914o4.ordinal();
        if (ordinal == 0) {
            i2 = this.f211837X3;
            i = this.f211833W3;
        } else if (ordinal == 1) {
            i2 = this.f211794O3;
            i = this.f211833W3;
        } else if (ordinal != 2) {
            i2 = 0;
            i = 0;
        } else {
            i2 = this.f211791N3;
            i = this.f211813S3;
        }
        Log.m105925i("MicroMsg.ChatFooter", "beginWidth:%s, endWidth:%s, beginHeight:%s, endHeight:%s", Integer.valueOf(width), Integer.valueOf(i2), Integer.valueOf(height), Integer.valueOf(i));
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{width, i2}).setDuration(200);
        duration.addUpdateListener(new ChatFooter$$b1(this));
        ValueAnimator duration2 = ValueAnimator.ofInt(new int[]{height, i}).setDuration(200);
        duration2.addUpdateListener(new ChatFooter$$d1(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, duration2});
        animatorSet.start();
    }

    /* renamed from: v0 */
    public void mo100499v0(Context context, Activity activity) {
        ChatFooter$$i1 chatFooter$$i1;
        Log.m105925i("MicroMsg.ChatFooter", "onResume: %s, %s", Boolean.valueOf(KeyBoardUtil.isPortOrientation(context)), Integer.valueOf(getContext().getResources().getConfiguration().orientation));
        this.f211879h1 = true;
        this.f211821U1 = activity;
        if (this.f211906n1 == 48 && this.f211884i1 == 1 && !this.f211740B1) {
            this.f211917p1 = false;
            mo100384X0(0, false, -1);
        }
        this.f211874g1 = getContext().getResources().getConfiguration().orientation == 1 || KeyBoardUtil.isPortOrientation(context);
        if (C11171e.m11046c(24)) {
            this.f211922q1 = getIsMultiWindow();
        }
        mo100395d1();
        mo100392b1();
        mo100390a1();
        if (C44547a2.m48943c().f120807g) {
            C44547a2.m48943c().mo69334d(MMApplicationContext.getContext());
        }
        ChatFooterPanel chatFooterPanel = this.f211868f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setShowSend(this.f211806R1);
            ChatFooterBottom chatFooterBottom = this.f211936t;
            if (!(chatFooterBottom.f212076d || chatFooterBottom.getVisibility() != 0)) {
                this.f211868f.mo100197i();
            }
            this.f211868f.setShowSearch(true);
        }
        boolean z = this.f211806R1;
        if (!z && this.f211854c1) {
            Log.m105924i("MicroMsg.ChatFooter", "jacks chatting footer disable enter button send");
            this.f211854c1 = false;
            this.f211888j.setImeOptions(0);
            C74974a aVar = this.f211888j;
            aVar.setInputType(aVar.getInputType() | 64);
        } else if (z && !this.f211854c1) {
            mo100387Z();
        }
        mo100505y0(getKeyBordHeightPX());
        AppPanel appPanel = this.f211878h;
        if (appPanel != null) {
            appPanel.f211711n = context;
        }
        this.f211768I.f212234k = false;
        if (!this.f211864e1) {
            View findViewById = this.f211863e.findViewById(C0966R.C0970id.b8m);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "sendAreaVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "sendAreaVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo100389a0();
        C72825s0 s0Var = this.f211780L;
        if (s0Var != null) {
            s0Var.onResume();
        }
        post(new ChatFooter$$t0(this));
        ChattingScrollLayout chattingScrollLayout = this.f211893k1;
        if (!(chattingScrollLayout == null || (chatFooter$$i1 = this.f211826V1) == null)) {
            ChattingScrollLayout.C72760b bVar = (ChattingScrollLayout.C72760b) chatFooter$$i1.mo100531a().f193278b.mo102812a(C79382t.class);
            if (bVar != null && !((LinkedList) chattingScrollLayout.f212087q).contains(bVar)) {
                ((LinkedList) chattingScrollLayout.f212087q).add(bVar);
            }
        }
        this.f211743B4.alive();
    }

    /* renamed from: w */
    public final void mo100500w() {
        float translationX = this.f211793O2.getTranslationX();
        int ordinal = this.f211914o4.ordinal();
        float f = 0.0f;
        if (ordinal != 0 && ordinal == 1) {
            f = (float) (-((C75044y4.m89990b(getContext()).x / 2) - C74942w4.m89784a(getContext(), 76)));
        }
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{translationX, f}).setDuration(200);
        duration.addUpdateListener(new ChatFooter$$e1(this));
        duration.start();
    }

    /* renamed from: w0 */
    public void mo100501w0(boolean z) {
        Log.m105925i("MicroMsg.ChatFooter", "pureForcusEdtChange: %s, %s", Boolean.valueOf(z), this.f211888j);
        C74974a aVar = this.f211888j;
        if (aVar != null) {
            if (z) {
                aVar.mo104256m();
            } else {
                aVar.clearFocus();
            }
        }
    }

    /* renamed from: x */
    public final void mo100502x(boolean z) {
        ImageButton imageButton;
        this.f211839Y1 = z;
        if (this.f211831W1 == null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2456di);
            this.f211831W1 = loadAnimation;
            loadAnimation.setDuration(150);
        }
        if (this.f211835X1 == null) {
            Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2461dn);
            this.f211835X1 = loadAnimation2;
            loadAnimation2.setDuration(150);
        }
        Button button = this.f211905n;
        if (button == null || (imageButton = this.f211946v) == null) {
            Log.m105925i("MicroMsg.ChatFooter", "canSend:%B, return sendBtn == null || mAttachButton == null", Boolean.valueOf(z));
        } else if (this.f211806R1 || this.f211811S1) {
            if (imageButton.getVisibility() != 0) {
                this.f211946v.setVisibility(0);
            }
        } else if (button.getVisibility() == 0 && z) {
            Log.m105924i("MicroMsg.ChatFooter", "canSend true ! sendBtn is visible");
        } else if (this.f211946v.getVisibility() != 0 || z) {
            if (z) {
                mo100447r();
                this.f211946v.startAnimation(this.f211835X1);
                this.f211946v.setVisibility(8);
                mo100363M0(false);
            } else {
                this.f211946v.startAnimation(this.f211831W1);
                if (!this.f211804R && !this.f211869f1) {
                    this.f211946v.setVisibility(0);
                    mo100363M0(true);
                }
                mo100445q();
            }
            Log.m105924i("MicroMsg.ChatFooter", "jacks canSend:" + z);
            this.f211905n.getParent().requestLayout();
        } else {
            Log.m105924i("MicroMsg.ChatFooter", "canSend false ! AttachButton is visible");
        }
    }

    /* renamed from: x0 */
    public void mo100503x0(int i) {
        ChatFooter$$j1 chatFooter$$j1;
        this.f211838Y0 = i;
        if (i == 1) {
            mo100375S0(true);
            this.f211915p.setVisibility(8);
            mo100394c1(C0966R.C0969drawable.f4804nd);
        } else if (i == 2) {
            mo100375S0(false);
            this.f211915p.setVisibility(0);
            mo100400g0();
            mo100394c1(C0966R.C0969drawable.f4803nc);
            if (C75592q0.m90762J().booleanValue() && (chatFooter$$j1 = this.f211789N1) != null) {
                Boolean bool = Boolean.TRUE;
                ((C73467e5.C73469b) chatFooter$$j1).mo102424b(bool, bool);
            }
        }
    }

    /* renamed from: y */
    public void mo100504y(String str) {
        ChatFooter$$i1 chatFooter$$i1;
        C79206x xVar = this.f211776K;
        if (xVar != null && this.f211905n != null && (chatFooter$$i1 = this.f211826V1) != null) {
            String b = chatFooter$$i1.mo100532b();
            Button button = this.f211905n;
            xVar.getClass();
            Class cls = C75698i0.class;
            Log.m105925i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "checkIfShow supportAnalyze:%s supportShow:%s", Boolean.valueOf(((C75698i0) C86312j.m106911c(cls)).bc0(b)), Boolean.valueOf(((C75698i0) C86312j.m106911c(cls)).Mq0(b)));
            xVar.f232538w = button;
            xVar.f232537v = str;
            if (((C75698i0) C86312j.m106911c(cls)).bc0(b)) {
                if (!Util.isNullOrNil(str) && !str.equals(xVar.f232525j)) {
                    ((C119157j) C119157j.f356862d).mo183894y("GroupSolitaireCheck");
                    str = str.replaceAll(String.valueOf(8203), "");
                    try {
                        str = ((C79305f) C86312j.m106911c(C79305f.class)).mo109308IF(str);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.groupsolitaire.SuggestSolitatireTips", "checkIfShow() emojiSoftBank2Unicode %s %s", e.getClass().getSimpleName(), e.getMessage());
                    }
                    C79206x.C79208b bVar = xVar.f232534s;
                    bVar.f232545g = str;
                    bVar.f232546h = xVar.f232526k;
                    ((C119157j) C119157j.f356862d).mo183879j(bVar, 500, "GroupSolitaireCheck");
                    if (Util.isNullOrNil(xVar.f232525j)) {
                        C79206x.C79209c cVar = xVar.f232535t;
                        cVar.f232545g = str;
                        cVar.f232546h = xVar.f232526k;
                        ((C119157j) C119157j.f356862d).mo183879j(cVar, 500, "GroupSolitaireCopyCheck");
                    }
                } else if (Util.isNullOrNil(str)) {
                    xVar.mo109223a();
                }
                xVar.f232525j = str;
                xVar.f232526k = b;
            }
        }
    }

    /* renamed from: y0 */
    public final void mo100505y0(int i) {
        int i2;
        Log.m105925i("MicroMsg.ChatFooter", "[refreshBottomHeight] keyborPx:%d", Integer.valueOf(i));
        KeyBoardUtil.setFixedHeight(false);
        int validPanelHeight = (C72996z1.m85843n5(this.f211858d) || C72996z1.m85844o5(this.f211858d)) ? KeyBoardUtil.getValidPanelHeight(getContext(), i, 43) : KeyBoardUtil.getValidPanelHeight(getContext(), i, this.f211922q1);
        int a = C78160t0.m94370a(getContext());
        if (!this.f211874g1 || this.f211922q1) {
            this.f211964y1 = KeyBoardUtil.getValidPanelHeight(getContext());
        } else {
            this.f211964y1 = validPanelHeight;
        }
        int max = Math.max(a, this.f211964y1);
        this.f211969z1 = max;
        if (max != this.f211958x1) {
            this.f211958x1 = max;
        }
        if (this.f211883i != null) {
            mo100391b0();
            ChattingScrollLayout chattingScrollLayout = this.f211893k1;
            if (chattingScrollLayout != null) {
                ((C103055g) this.f211883i).mo142757b(chattingScrollLayout.getHeight(), max, this.f211739B.getMeasuredHeight());
                C103055g gVar = (C103055g) this.f211883i;
                if (gVar.f304060o || !gVar.f304055j.isFinished() || gVar.f304064s > 0) {
                    this.f211958x1 += ((C103055g) this.f211883i).f304061p;
                }
            }
        }
        Log.m105925i("MicroMsg.ChatFooter", "refreshBottomHeight: %s, %s, %s, %s, %s", Boolean.valueOf(this.f211874g1), Boolean.valueOf(this.f211922q1), Integer.valueOf(this.f211964y1), Integer.valueOf(this.f211958x1), Boolean.valueOf(KeyBoardUtil.isPortOrientation(getContext())));
        ViewGroup.LayoutParams layoutParams = this.f211936t.getLayoutParams();
        if (!(layoutParams == null || layoutParams.height == (i2 = this.f211958x1))) {
            layoutParams.height = i2;
            this.f211936t.setLayoutParams(layoutParams);
            this.f211936t.requestLayout();
        }
        if (this.f211897l1) {
            int i3 = -this.f211958x1;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            if (!(marginLayoutParams == null || marginLayoutParams.bottomMargin == i3)) {
                marginLayoutParams.bottomMargin = i3;
                setLayoutParams(marginLayoutParams);
            }
        }
        AppPanel appPanel = this.f211878h;
        if (appPanel != null) {
            appPanel.setPortHeighPx(this.f211964y1);
            AppPanel appPanel2 = this.f211878h;
            appPanel2.getClass();
            Log.m105924i("MicroMsg.AppPanel", "[forceRefreshSize]");
            appPanel2.mo100332t();
        }
        if (this.f211873g != null) {
            int height = this.f211964y1 + this.f211926r.getHeight() + this.f211931s.getHeight();
            ViewGroup.LayoutParams layoutParams2 = this.f211873g.getLayoutParams();
            if (layoutParams2 != null && layoutParams2.height != height) {
                layoutParams2.height = height;
                this.f211873g.setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: z */
    public void mo100506z() {
        C74974a aVar = this.f211888j;
        if (aVar != null) {
            aVar.setText("");
            mo100346D0();
            ChatFooterPanel chatFooterPanel = this.f211868f;
            if (chatFooterPanel != null) {
                chatFooterPanel.setToSendText("");
            }
        }
    }

    /* renamed from: z0 */
    public final void mo100507z0() {
        if (this.f211842Z0) {
            View view = this.f211800Q0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f211815T0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f211820U0;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = this.f211825V0;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f211875g2.setVisibility(0);
            View view7 = this.f211890j2;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view8 = this.f211894k2;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            View view9 = view8;
            C117292a.m165358d(view9, aVar6.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f211902m2.setVisibility(8);
            View view10 = this.f211907n2;
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(0);
            View view11 = view10;
            C117292a.m165358d(view11, aVar7.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f211912o2.setVisibility(8);
            View view12 = this.f211923q2;
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(8);
            View view13 = view12;
            C117292a.m165358d(view13, aVar8.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view13, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view14 = this.f211928r2;
            C9556a aVar9 = new C9556a();
            aVar9.mo10233c(8);
            View view15 = view14;
            C117292a.m165358d(view15, aVar9.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view15, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view16 = this.f211943u2;
            C9556a aVar10 = new C9556a();
            aVar10.mo10233c(8);
            View view17 = view16;
            C117292a.m165358d(view17, aVar10.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view16.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view17, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f211762G2 = ChatFooter$$r1.MODE_INVALID;
            this.f211754E2 = ChatFooter$$s1.MODE_HINT_INVALID;
            return;
        }
        View view18 = this.f211800Q0;
        C9556a aVar11 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar11.mo10233c(0);
        C117292a.m165358d(view18, aVar11.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view18.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
        C117292a.m165359e(view18, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view19 = this.f211815T0;
        C9556a aVar12 = new C9556a();
        aVar12.mo10233c(8);
        View view20 = view19;
        C117292a.m165358d(view20, aVar12.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view19.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
        C117292a.m165359e(view20, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view21 = this.f211820U0;
        C9556a aVar13 = new C9556a();
        aVar13.mo10233c(8);
        C117292a.m165358d(view21, aVar13.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view21.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
        C117292a.m165359e(view21, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view22 = this.f211825V0;
        C9556a aVar14 = new C9556a();
        aVar14.mo10233c(8);
        View view23 = view22;
        C117292a.m165358d(view23, aVar14.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view22.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
        C117292a.m165359e(view23, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "reset4Voice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f211875g2.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Class cls = C32735h.class;
        Class cls2 = C65873e.class;
        this.f211863e = null;
        this.f211888j = null;
        this.f211905n = null;
        this.f211910o = null;
        this.f211784M = null;
        this.f211788N = null;
        this.f211795P = new ChatFooter$$h1((C727541) null);
        this.f211799Q = false;
        this.f211804R = false;
        this.f211809S = false;
        this.f211814T = false;
        this.f211819U = false;
        this.f211824V = null;
        this.f211916p0 = new LinkedList();
        this.f211846a1 = false;
        this.f211850b1 = false;
        this.f211854c1 = false;
        this.f211859d1 = false;
        this.f211864e1 = false;
        this.f211869f1 = false;
        this.f211874g1 = true;
        this.f211879h1 = false;
        this.f211884i1 = 0;
        this.f211889j1 = -1;
        this.f211911o1 = 0;
        this.f211917p1 = false;
        this.f211922q1 = false;
        this.f211927r1 = false;
        this.f211932s1 = true;
        this.f211937t1 = false;
        this.f211942u1 = 0;
        this.f211947v1 = false;
        this.f211740B1 = false;
        this.f211753E1 = ((C65873e) C86312j.m106911c(cls2)).ep0(73);
        this.f211757F1 = ((C65873e) C86312j.m106911c(cls2)).ep0(73);
        C40008f fVar = C40008f.f107254d;
        this.f211761G1 = new IListener<OPPOFloatWindowModeChangedEvent>(fVar) {
            {
                this.__eventId = -553854139;
            }

            public boolean callback(IEvent iEvent) {
                OPPOFloatWindowModeChangedEvent oPPOFloatWindowModeChangedEvent = (OPPOFloatWindowModeChangedEvent) iEvent;
                boolean z = ChatFooter.this.f211927r1;
                boolean z2 = oPPOFloatWindowModeChangedEvent.f193773d.f193774a;
                if (z != z2) {
                    Log.m105925i("MicroMsg.ChatFooter", "MultiWindowModeChanged: %b", Boolean.valueOf(z2));
                    ChatFooter.this.f211927r1 = oPPOFloatWindowModeChangedEvent.f193773d.f193774a;
                }
                return false;
            }
        };
        this.f211765H1 = null;
        this.f211769I1 = new ChatFooter$$d(this);
        this.f211773J1 = null;
        this.f211777K1 = new ChatFooter$$h(this);
        this.f211781L1 = new ChatFooter$$p(this);
        this.f211785M1 = new AndroidChatInputStruct();
        this.f211796P1 = new ChatFooter$$a0(this);
        this.f211801Q1 = new ChatFooter$$j0(this);
        this.f211806R1 = false;
        this.f211811S1 = false;
        this.f211839Y1 = false;
        this.f211851b2 = false;
        this.f211860d2 = false;
        this.f211865e2 = new ChatFooter$$c(this);
        this.f211870f2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_is_remove_send_msg_compact_code_and, 1) == 1;
        this.f211750D2 = C71562c.f207365v;
        this.f211754E2 = ChatFooter$$s1.MODE_HINT_INVALID;
        this.f211758F2 = ChatFooter$$q1.MODE_INVALID;
        this.f211762G2 = ChatFooter$$r1.MODE_INVALID;
        this.f211766H2 = false;
        this.f211770I2 = false;
        this.f211774J2 = false;
        this.f211778K2 = 0.5f;
        this.f211944u3 = true;
        this.f211954w3 = new ChatFooter$$f(this);
        this.f211960x3 = new ChatFooter$$g(this);
        this.f211966y3 = new ChatFooter$$i(this);
        this.f211971z3 = new ChatFooter$$k(this);
        this.f211742B3 = 0;
        this.f211747C3 = false;
        this.f211751D3 = 1;
        this.f211755E3 = new ChatFooter$$l(this);
        this.f211759F3 = ValueAnimator.ofInt(new int[]{250, 960}).setDuration(200);
        this.f211763G3 = ValueAnimator.ofInt(new int[]{40, 800}).setDuration(200);
        this.f211767H3 = ValueAnimator.ofInt(new int[]{72, 0}).setDuration(200);
        this.f211771I3 = ValueAnimator.ofInt(new int[]{22, 0}).setDuration(200);
        this.f211775J3 = ValueAnimator.ofInt(new int[]{8, 0}).setDuration(200);
        this.f211779K3 = new ChatFooter$$c0(this);
        this.f211783L3 = new int[]{C0966R.raw.count_down_0, C0966R.raw.count_down_1, C0966R.raw.count_down_2, C0966R.raw.count_down_3, C0966R.raw.count_down_4, C0966R.raw.count_down_5, C0966R.raw.count_down_6, C0966R.raw.count_down_7, C0966R.raw.count_down_8, C0966R.raw.count_down_9};
        this.f211787M3 = C74942w4.m89784a(getContext(), 114);
        this.f211791N3 = C75044y4.m89990b(getContext()).x - C74942w4.m89784a(getContext(), 32);
        this.f211794O3 = C74942w4.m89784a(getContext(), 92);
        this.f211798P3 = Math.min(C74942w4.m89784a(getContext(), C0947jz.f2205e), C75044y4.m89990b(getContext()).x - C74942w4.m89784a(getContext(), 32));
        this.f211803Q3 = C74942w4.m89784a(getContext(), WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED);
        this.f211808R3 = ((float) C74942w4.m89784a(getContext(), 160)) / 50.0f;
        this.f211813S3 = C74942w4.m89784a(getContext(), 114);
        this.f211818T3 = 0;
        this.f211823U3 = 0;
        this.f211828V3 = 0;
        this.f211833W3 = 0;
        this.f211837X3 = C74942w4.m89784a(getContext(), WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED);
        this.f211841Y3 = 60;
        this.f211845Z3 = 0;
        this.f211849a4 = false;
        this.f211853b4 = new ChatFooter$$q0(this);
        this.f211857c4 = false;
        this.f211862d4 = 0;
        this.f211867e4 = false;
        this.f211872f4 = C74942w4.m89786c(getContext(), C0966R.dimen.f3659al);
        this.f211877g4 = C74942w4.m89786c(getContext(), C0966R.dimen.f3749d0);
        this.f211882h4 = C74942w4.m89784a(getContext(), 25);
        this.f211887i4 = C74942w4.m89784a(getContext(), 55);
        this.f211892j4 = C74942w4.m89784a(getContext(), 50);
        this.f211896k4 = new ChatFooter$$z0(this);
        this.f211900l4 = new ChatFooter$$a1(this);
        this.f211904m4 = C74942w4.m89784a(getContext(), 16);
        this.f211909n4 = C74942w4.m89784a(getContext(), 25);
        ChatFooter$$l1 chatFooter$$l1 = ChatFooter$$l1.MODE_VOICE;
        this.f211914o4 = chatFooter$$l1;
        this.f211920p4 = chatFooter$$l1;
        this.f211925q4 = new HashMap();
        this.f211930r4 = false;
        this.f211940t4 = new C35457d();
        this.f211945u4 = new ArrayList();
        this.f211950v4 = "";
        this.f211955w4 = 0;
        this.f211972z4 = false;
        this.f211738A4 = 1;
        this.f211743B4 = new IListener<NotifyChatRoomStatusChangeEvent>(fVar) {
            {
                this.__eventId = -692279828;
            }

            public boolean callback(IEvent iEvent) {
                NotifyChatRoomStatusChangeEvent notifyChatRoomStatusChangeEvent = (NotifyChatRoomStatusChangeEvent) iEvent;
                if ((notifyChatRoomStatusChangeEvent instanceof NotifyChatRoomStatusChangeEvent) && Util.isEqual(notifyChatRoomStatusChangeEvent.f193752d.f193753a, ChatFooter.this.f211826V1.mo100532b())) {
                    C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(notifyChatRoomStatusChangeEvent.f193752d.f193753a);
                    if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
                        Log.m105925i("MicroMsg.ChatFooter", "Get contact from db return null.(username : %s)", notifyChatRoomStatusChangeEvent.f193752d.f193753a);
                    } else {
                        MMHandlerThread.postToMainThread(new C72822r0(this, notifyChatRoomStatusChangeEvent, z1Var));
                    }
                }
                return false;
            }
        };
        long currentTimeMillis = System.currentTimeMillis();
        this.f211834X0 = (InputMethodManager) context.getSystemService("input_method");
        this.f211863e = View.inflate(context, C0966R.C0971layout.f6838px, this);
        C74974a aVar = (C74974a) findViewById(C0966R.C0970id.b4a);
        this.f211888j = aVar;
        C100823c cVar = C100823c.f295336a;
        View view = aVar.view();
        C87412m.m108594g(view, "view");
        cVar.mo140273b(view, 1);
        this.f211888j.mo104239a(((C96603l) C86312j.m106911c(C96603l.class)).Kr0());
        this.f211888j.setImeSendImageCallback(new C72796i(this));
        Activity activity = (Activity) context;
        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(activity);
        this.f211901m1 = keyboardHeightProvider;
        keyboardHeightProvider.f220015b = this;
        if (C85875k4.m106207v()) {
            this.f211888j.setImeOptions(268435456);
        }
        C76431c g = C76431c.m91853g(this.f211888j);
        int i2 = C86709a0.m107522a() ? Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InputLimitSessionTextMsg"), 8192) : 8192;
        g.f225611e = 0;
        g.f225610d = i2 * 2;
        g.mo107499d((C77382c.C77383a) null);
        this.f211888j.getInputExtras(true).putBoolean("IS_CHAT_EDITOR", true);
        this.f211888j.mo104244e(((C101980n) C86312j.m106911c(C101980n.class)).mo134685Hw(), LocaleUtil.getCurrentLanguage(context), new C72833u(this, context), (C110588j.C77559a.C77560a) null);
        this.f211888j.setKeyCodeEnterListener(new C72836v(this));
        this.f211888j.addTextChangedListener(new C72838w(this));
        C97448g gVar = f211728C4;
        if (gVar != null) {
            gVar.dismiss();
            f211728C4 = null;
        }
        this.f211888j.getSizeAnimController().mo91525a(true);
        this.f211888j.addOnLayoutChangeListener(new C72840x(this));
        C72830t1 seqAutoCompleteHelper = getSeqAutoCompleteHelper();
        C74974a aVar2 = this.f211888j;
        seqAutoCompleteHelper.getClass();
        C87412m.m108594g(aVar2, "edt");
        aVar2.setOnKeyListener(new C72835u1(seqAutoCompleteHelper, aVar2));
        this.f211888j.setOnFocusChangeListener(new C44610j(this));
        if (Build.VERSION.SDK_INT == 28) {
            this.f211888j.setBreakStrategy(1);
        }
        this.f211739B = (LinearLayout) this.f211863e.findViewById(C0966R.C0970id.ki4);
        this.f211962y = (MaxHeightScrollView) this.f211863e.findViewById(C0966R.C0970id.kii);
        mo100397e1();
        this.f211936t = (ChatFooterBottom) findViewById(C0966R.C0970id.b44);
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.b05);
        this.f211926r = findViewById(C0966R.C0970id.b4u);
        this.f211931s = findViewById(C0966R.C0970id.b5c);
        this.f211946v = (ImageButton) this.f211863e.findViewById(C0966R.C0970id.b3q);
        this.f211951w = (ImageView) this.f211863e.findViewById(C0966R.C0970id.b3r);
        this.f211905n = (Button) this.f211863e.findViewById(C0966R.C0970id.b8k);
        this.f211744C = (RelativeLayout) this.f211863e.findViewById(C0966R.C0970id.h29);
        this.f211748D = (TextView) this.f211863e.findViewById(C0966R.C0970id.h27);
        this.f211760G = (FrameLayout) this.f211863e.findViewById(C0966R.C0970id.h25);
        this.f211752E = (ImageView) this.f211863e.findViewById(C0966R.C0970id.h26);
        this.f211756F = (ImageView) this.f211863e.findViewById(C0966R.C0970id.h2_);
        this.f211764H = (WeImageView) this.f211863e.findViewById(C0966R.C0970id.h28);
        this.f211829W = (ImageView) this.f211863e.findViewById(C0966R.C0970id.f358962i33);
        this.f211905n.setTextSize(0, ((float) C76577a.m92155f(context, C0966R.dimen.f3951l_)) * C76577a.m92161l(context));
        this.f211915p = (Button) this.f211863e.findViewById(C0966R.C0970id.lbh);
        this.f211921q = (WeImageButton) findViewById(C0966R.C0970id.b7l);
        mo100502x(false);
        mo100390a1();
        C72826s1 s1Var = new C72826s1(getContext(), getRootView(), this, new C72801k(this, context));
        this.f211768I = s1Var;
        s1Var.f212235l = this;
        C72806l1 mA = ((C67306k1) C86312j.m106911c(C67306k1.class)).mo91186mA(getContext(), getRootView(), this, this.f211888j.view());
        this.f211772J = mA;
        C72843y1 y1Var = (C72843y1) mA;
        y1Var.f212284h = this.f211796P1;
        y1Var.f212295s = new ChatFooter$$a(this, context);
        Log.m105919d("MicroMsg.ChatFooter", "send edittext ime option %s", Integer.valueOf(this.f211888j.getImeOptions()));
        this.f211888j.mo104254k(new C72804l(this));
        this.f211888j.mo104242d(new C72808m(this));
        this.f211888j.setOnTouchListener(new C72811n(this));
        this.f211888j.setOnLongClickListener(new C44612o(this));
        this.f211905n.setOnClickListener(new C72817p(this));
        if (C85875k4.m106210y()) {
            this.f211774J2 = false;
        } else {
            if (MMApplicationContext.getContext().getResources().getConfiguration().orientation == 2) {
                this.f211774J2 = false;
            } else {
                String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
                if (!currentLanguage.equals("zh_CN") && !currentLanguage.equals("zh_HK") && !currentLanguage.equals("zh_TW") && !currentLanguage.equals("en")) {
                    this.f211774J2 = false;
                } else if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
                    this.f211774J2 = true;
                } else {
                    this.f211774J2 = 1 == ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_new_trans2txt, 1);
                }
            }
        }
        this.f211778K2 = ((C32735h) C86312j.m106911c(cls)).mo58785xe(C32735h.C32737c.clicfg_voice2txt_operation_area_adjust, 0.5f);
        Log.m105925i("MicroMsg.ChatFooter", "isNewTrans2Txt:%s, transOperationAreaFactor:%s", Boolean.valueOf(this.f211774J2), Float.valueOf(this.f211778K2));
        this.f211736A2 = new CutShortSentence();
        int i3 = C74783i3.m89537a(context).f24704a;
        if (this.f211774J2) {
            this.f211939t3 = (int) (((float) i3) * this.f211778K2);
            Log.m105919d("MicroMsg.ChatFooter", "newVoice2txtVoiceModeChangeLine: %s, newVoice2txtTransModeChangeLine: %s, screenWidth:%s", Integer.valueOf(this.f211934s3), Integer.valueOf(this.f211939t3), Integer.valueOf(i3));
            this.f211915p.setOnTouchListener(new C72781e0(this, context));
            this.f211759F3.addUpdateListener(this.f211779K3);
            this.f211763G3.addUpdateListener(this.f211779K3);
            this.f211767H3.addUpdateListener(this.f211779K3);
            this.f211771I3.addUpdateListener(this.f211779K3);
            this.f211775J3.addUpdateListener(this.f211779K3);
        } else {
            f211730E4 = (i3 / 2) + ((int) (((float) i3) * 0.075f));
            C76259g gVar2 = new C76259g(context);
            this.f211970z2 = gVar2;
            gVar2.f223440y0 = new C72788g0(this);
            this.f211915p.setOnTouchListener(new C72793h0(this));
            this.f211915p.setOnKeyListener(new C72797i0(this));
        }
        this.f211921q.setOnClickListener(new C72777d0(this));
        mo100433l0();
        this.f211946v.setVisibility(0);
        this.f211946v.setContentDescription(getContext().getString(C0966R.string.b3f));
        this.f211946v.setOnClickListener(new C72768b0(this));
        Log.m105925i("MicroMsg.ChatFooter", "[init] removeCompactCode:%s", Boolean.valueOf(this.f211870f2));
        this.f211926r.setOnTouchListener(new C44613q(this));
        int i4 = activity.getWindow().getAttributes().softInputMode & 240;
        this.f211906n1 = i4;
        if (!(i4 == 16 || i4 == 48)) {
            C115669n.INSTANCE.mo175911u(1062, 8);
            if (this.f211906n1 != 16) {
                this.f211906n1 = 48;
            }
        }
        this.f211964y1 = KeyBoardUtil.getValidPanelHeight(context);
        mo100505y0(getKeyBordHeightPX());
        if (C11171e.m11046c(24)) {
            this.f211922q1 = getIsMultiWindow();
        }
        mo100434m0();
        this.f211764H.setOnClickListener(new C72821r(this));
        this.f211745C1 = new C72852z0(this, this.f211888j);
        mo100395d1();
        Log.m105919d("MicroMsg.ChatFooter", "init time: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
