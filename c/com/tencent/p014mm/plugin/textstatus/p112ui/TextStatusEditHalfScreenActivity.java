package com.tencent.p014mm.plugin.textstatus.p112ui;

import a03.C39477a;
import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a22.C67001a;
import ak1.C0073g0;
import ak1.C54097l0;
import android.animation.ObjectAnimator;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import az2.C39674e;
import b03.C39691c;
import b03.C39693c0;
import b03.C39696f;
import b03.C39718p;
import b22.C28250a;
import bp3.C104160f;
import bp3.C79758p;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.emoji.view.EmojiPanelInputComponent;
import com.tencent.p014mm.emoji.view.EmojiStatusView;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.C81812e1;
import com.tencent.p014mm.plugin.appbrand.C81895h2;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTPEffectVideoLayout;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.WCWebUpdater;
import d03.C58010a;
import di3.C86312j;
import dl3.C45413b;
import eb0.C31543z5;
import eb0.C45628s0;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import go3.C59600d;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hd0.C98410o0;
import hd0.C98426q0;
import ht1.C33057k5;
import ht1.C60187m5;
import ht1.C60200t1;
import ht1.C60208v1;
import ht1.C8808v4;
import hz2.C60235a;
import hz2.C76252b;
import j03.C60695a;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import jr2.C99015i;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kj2.C117407d;
import kotlin.Metadata;
import kotlin.ResultKt;
import kr0.C76628m0;
import kz2.C76658g;
import lz2.C10699j;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76879j;
import nj3.C76912y0;
import org.json.JSONObject;
import p140cw.C7138g;
import p151er.C7774m;
import p158gt.C76057w;
import p204mr.C61568m;
import p206nj.C76866m;
import p232rw.C63679m;
import p232rw.C77572l;
import p232rw.C77573p;
import p232rw.C77574q;
import p232rw.C77575r;
import p235sm.C64053t0;
import p447aw.C103918d;
import p640ox.C77049b;
import p682rz.C101488s;
import p740wo.C53193b;
import p823sg.C90193h;
import p914oj.C89231c;
import pe3.C47465a;
import qn3.C77382c;
import qo3.C77407n;
import qo3.C77426q;
import qy2.C63347a;
import qy2.C77448f0;
import qy2.C77452i;
import qy2.C77459z;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import rz2.C48201c;
import su0.C13781a;
import sx3.C36903g0;
import sx3.C64197v;
import t91.C64208c;
import tj3.C111011i;
import tz2.C78123i;
import uz2.C52678e0;
import uz2.C52718u;
import uz2.C65488a0;
import uz2.C65493r;
import uz2.C78313a;
import uz2.C78318v1;
import v51.C78336h;
import vl3.C102226d;
import vn3.C78456a;
import vo3.C90852c;
import vz2.C78501d;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import yz2.C79220a2;
import yz2.C79227c2;
import yz2.C79231d2;
import yz2.C79234e2;
import z04.C112551y;
import z04.C119027c;
import z04.C66723k;
import zf1.C66800f;
import zp3.C23564m;
import zp3.C79406f;
import zt3.C119157j;
import zt3.C119179t;
import zv2.C103107b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bF\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004HIJKB\u0007¢\u0006\u0004\bF\u0010GR$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR$\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR$\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR$\u0010!\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010\fR$\u0010%\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\b\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\fR$\u0010)\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010\b\u001a\u0004\b'\u0010\n\"\u0004\b(\u0010\fR$\u0010-\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010\b\u001a\u0004\b+\u0010\n\"\u0004\b,\u0010\fR$\u00101\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010\b\u001a\u0004\b/\u0010\n\"\u0004\b0\u0010\fR$\u00105\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u0010\b\u001a\u0004\b3\u0010\n\"\u0004\b4\u0010\fR$\u00109\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b6\u0010\b\u001a\u0004\b7\u0010\n\"\u0004\b8\u0010\fR\"\u0010=\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u0012\n\u0004\b:\u0010\b\u001a\u0004\b;\u0010\n\"\u0004\b<\u0010\fR\"\u0010A\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u0012\n\u0004\b>\u0010\b\u001a\u0004\b?\u0010\n\"\u0004\b@\u0010\fR\"\u0010E\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u0012\n\u0004\bB\u0010\b\u001a\u0004\bC\u0010\n\"\u0004\bD\u0010\f¨\u0006L"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lcom/tencent/mm/emoji/view/EmojiPanelInputComponent$c;", "Lqn3/c$a;", "Lcom/tencent/mm/ui/tools/t0;", "Lvn3/a;", "Landroid/view/View;", "p", "Landroid/view/View;", "getVPoi", "()Landroid/view/View;", "setVPoi", "(Landroid/view/View;)V", "vPoi", "q", "getVVisibility", "setVVisibility", "vVisibility", "r", "getIconCamera", "setIconCamera", "iconCamera", "s", "getIconText", "setIconText", "iconText", "t", "getIconPoi", "setIconPoi", "iconPoi", "v", "getIconVisibility", "setIconVisibility", "iconVisibility", "D", "getFakePic", "setFakePic", "fakePic", "P", "getLayoutEditDesc", "setLayoutEditDesc", "layoutEditDesc", "Q", "getLayoutEditToolContainer", "setLayoutEditToolContainer", "layoutEditToolContainer", "R", "getLayoutTopicEdit", "setLayoutTopicEdit", "layoutTopicEdit", "T", "getTvCancel", "setTvCancel", "tvCancel", "U", "getBtnTag", "setBtnTag", "btnTag", "V", "O7", "setBtnOk", "btnOk", "X", "getBtnBack", "setBtnBack", "btnBack", "x0", "Y7", "setLayoutBlurOption", "layoutBlurOption", "<init>", "()V", "a", "b", "c", "d", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity */
public final class TextStatusEditHalfScreenActivity extends MMSecDataActivity implements EmojiPanelInputComponent.C68041c, C77382c.C77383a, C7020t0, C78456a {

    /* renamed from: m2 */
    public static Bitmap f207059m2;

    /* renamed from: A */
    public final C13601g f207060A;

    /* renamed from: A1 */
    public boolean f207061A1;

    /* renamed from: B */
    public final C13601g f207062B;

    /* renamed from: B1 */
    public int f207063B1;

    /* renamed from: C */
    public final C13601g f207064C;

    /* renamed from: C1 */
    public boolean f207065C1;

    /* renamed from: D */
    public View f207066D;

    /* renamed from: D1 */
    public long f207067D1;

    /* renamed from: E */
    public FrameLayout f207068E;

    /* renamed from: E1 */
    public long f207069E1;

    /* renamed from: F */
    public final C13601g f207070F;

    /* renamed from: F1 */
    public final C13601g f207071F1;

    /* renamed from: G */
    public final C13601g f207072G;

    /* renamed from: G1 */
    public Toast f207073G1;

    /* renamed from: H */
    public C59600d f207074H;

    /* renamed from: H1 */
    public boolean f207075H1;

    /* renamed from: I */
    public ImageView f207076I;

    /* renamed from: I1 */
    public boolean f207077I1;

    /* renamed from: J */
    public ImageView f207078J;

    /* renamed from: J1 */
    public final C71489m f207079J1;

    /* renamed from: K */
    public final C13601g f207080K;

    /* renamed from: K1 */
    public final C71457a1 f207081K1;

    /* renamed from: L */
    public final C13601g f207082L;

    /* renamed from: L1 */
    public final TextStatusEditHalfScreenActivity$configUpdateListener$1 f207083L1;

    /* renamed from: M */
    public final C13601g f207084M;

    /* renamed from: M1 */
    public boolean f207085M1;

    /* renamed from: N */
    public final C13601g f207086N;

    /* renamed from: N1 */
    public final C71531xf618b501 f207087N1;

    /* renamed from: O1 */
    public C30501b f207088O1;

    /* renamed from: P */
    public View f207089P;

    /* renamed from: P1 */
    public final TextWatcher f207090P1;

    /* renamed from: Q */
    public View f207091Q;

    /* renamed from: Q0 */
    public final C13601g f207092Q0;

    /* renamed from: Q1 */
    public String f207093Q1;

    /* renamed from: R */
    public View f207094R;

    /* renamed from: R0 */
    public final C13601g f207095R0;

    /* renamed from: R1 */
    public C76057w.C76058a f207096R1;

    /* renamed from: S */
    public final C13601g f207097S;

    /* renamed from: S0 */
    public final C13601g f207098S0;

    /* renamed from: S1 */
    public int f207099S1;

    /* renamed from: T */
    public View f207100T;

    /* renamed from: T0 */
    public final C13601g f207101T0;

    /* renamed from: T1 */
    public String f207102T1;

    /* renamed from: U */
    public View f207103U;

    /* renamed from: U0 */
    public final C13601g f207104U0;

    /* renamed from: U1 */
    public String f207105U1;

    /* renamed from: V */
    public View f207106V;

    /* renamed from: V0 */
    public final C13601g f207107V0;

    /* renamed from: V1 */
    public String f207108V1;

    /* renamed from: W */
    public final C13601g f207109W;

    /* renamed from: W0 */
    public final C13601g f207110W0;

    /* renamed from: W1 */
    public ArrayList<String> f207111W1;

    /* renamed from: X */
    public View f207112X;

    /* renamed from: X0 */
    public C77459z f207113X0;

    /* renamed from: X1 */
    public final View.OnClickListener f207114X1;

    /* renamed from: Y */
    public final C13601g f207115Y;

    /* renamed from: Y0 */
    public int f207116Y0;

    /* renamed from: Y1 */
    public final View.OnClickListener f207117Y1;

    /* renamed from: Z */
    public final C13601g f207118Z;

    /* renamed from: Z0 */
    public boolean f207119Z0;

    /* renamed from: Z1 */
    public long f207120Z1;

    /* renamed from: a1 */
    public C52718u f207121a1;

    /* renamed from: a2 */
    public final View.OnClickListener f207122a2;

    /* renamed from: b1 */
    public int f207123b1;

    /* renamed from: b2 */
    public LinkedList<String> f207124b2;

    /* renamed from: c1 */
    public KeyboardHeightProvider f207125c1;

    /* renamed from: c2 */
    public int f207126c2;

    /* renamed from: d */
    public final C13601g f207127d = C36568h.m40985a(C30507x.f82190d);

    /* renamed from: d1 */
    public Bitmap f207128d1;

    /* renamed from: d2 */
    public boolean f207129d2;

    /* renamed from: e */
    public RelativeLayout f207130e;

    /* renamed from: e1 */
    public MMTPEffectVideoLayout f207131e1;

    /* renamed from: e2 */
    public boolean f207132e2;

    /* renamed from: f */
    public TextStatusEmojiPanelInputComponent f207133f;

    /* renamed from: f1 */
    public int f207134f1;

    /* renamed from: f2 */
    public C77452i f207135f2;

    /* renamed from: g */
    public TextView f207136g;

    /* renamed from: g1 */
    public Runnable f207137g1;

    /* renamed from: g2 */
    public C52678e0 f207138g2;

    /* renamed from: h */
    public ImageView f207139h;

    /* renamed from: h1 */
    public boolean f207140h1;

    /* renamed from: h2 */
    public C30504d f207141h2;

    /* renamed from: i */
    public ImageView f207142i;

    /* renamed from: i1 */
    public C32224a<C13598b0> f207143i1;

    /* renamed from: i2 */
    public String f207144i2;

    /* renamed from: j */
    public final C13601g f207145j;

    /* renamed from: j1 */
    public C32224a<C13598b0> f207146j1;

    /* renamed from: j2 */
    public boolean f207147j2;

    /* renamed from: k1 */
    public C32226l<? super Integer, C13598b0> f207148k1;

    /* renamed from: k2 */
    public C71459c f207149k2;

    /* renamed from: l1 */
    public C32226l<? super Integer, C13598b0> f207150l1;

    /* renamed from: l2 */
    public ProgressDialog f207151l2;

    /* renamed from: m1 */
    public int f207152m1;

    /* renamed from: n */
    public final C13601g f207153n;

    /* renamed from: n1 */
    public int f207154n1;

    /* renamed from: o */
    public final C13601g f207155o;

    /* renamed from: o1 */
    public int f207156o1;

    /* renamed from: p */
    public View f207157p;

    /* renamed from: p0 */
    public final C13601g f207158p0;

    /* renamed from: p1 */
    public final String f207159p1;

    /* renamed from: q */
    public View f207160q;

    /* renamed from: q1 */
    public final String f207161q1;

    /* renamed from: r */
    public View f207162r;

    /* renamed from: r1 */
    public final String f207163r1;

    /* renamed from: s */
    public View f207164s;

    /* renamed from: s1 */
    public C64053t0.C13730a f207165s1;

    /* renamed from: t */
    public View f207166t;

    /* renamed from: t1 */
    public C76628m0 f207167t1;

    /* renamed from: u */
    public final C13601g f207168u;

    /* renamed from: u1 */
    public final String f207169u1;

    /* renamed from: v */
    public View f207170v;

    /* renamed from: v1 */
    public final String f207171v1;

    /* renamed from: w */
    public MMEditText f207172w;

    /* renamed from: w1 */
    public final String f207173w1;

    /* renamed from: x */
    public final C13601g f207174x;

    /* renamed from: x0 */
    public View f207175x0;

    /* renamed from: x1 */
    public final C13601g f207176x1;

    /* renamed from: y */
    public final C13601g f207177y;

    /* renamed from: y0 */
    public ImageView f207178y0;

    /* renamed from: y1 */
    public boolean f207179y1;

    /* renamed from: z */
    public TextView f207180z;

    /* renamed from: z1 */
    public int f207181z1;

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$b */
    public enum C30501b {
        NORMAL,
        BIG_EMOJI
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$b1 */
    public static final class C30502b1 implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f82184d;

        public C30502b1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f82184d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f82184d.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$c1 */
    public static final class C30503c1 implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C30503c1 f82185d = new C30503c1();

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$d */
    public static final class C30504d {

        /* renamed from: a */
        public final String f82186a;

        /* renamed from: b */
        public final List<C65488a0> f82187b;

        public C30504d(String str, List<? extends C65488a0> list) {
            this.f82186a = str;
            this.f82187b = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30504d)) {
                return false;
            }
            C30504d dVar = (C30504d) obj;
            return C87412m.m108589b(this.f82186a, dVar.f82186a) && C87412m.m108589b(this.f82187b, dVar.f82187b);
        }

        public int hashCode() {
            String str = this.f82186a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<C65488a0> list = this.f82187b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "ThirdInfo(sourceId=" + this.f82186a + ", jumpInfos=" + this.f82187b + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$j0 */
    public static final class C30505j0 extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C30505j0 f82188d = new C30505j0();

        public C30505j0() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV(C13781a.m13082a() + "recentlyUsedEmojiIconId", 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$k0 */
    public static final class C30506k0 extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C30506k0 f82189d = new C30506k0();

        public C30506k0() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV(C13781a.m13082a() + "recentlyPostEmojiIconTime", 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$x */
    public static final class C30507x extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C30507x f82190d = new C30507x();

        public C30507x() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C77448f0.m93393e());
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$a */
    public interface C71455a {
        /* renamed from: b */
        void mo98609b(String str);
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$a0 */
    public static final class C71456a0 extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207182d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71456a0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207182d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (TextView) this.f207182d.findViewById(C0966R.C0970id.fcj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$a1 */
    public static final class C71457a1 implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207183d;

        public C71457a1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207183d = textStatusEditHalfScreenActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x004c, code lost:
            r0 = r5.f207183d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPreDraw() {
            /*
                r5 = this;
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity r0 = r5.f207183d
                com.tencent.mm.ui.widget.MMEditText r0 = r0.mo98563V7()
                int r0 = r0.getHeight()
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity r1 = r5.f207183d
                int r2 = r1.f207152m1
                r3 = -1
                if (r2 != r3) goto L_0x0014
                r1.f207152m1 = r0
                goto L_0x001a
            L_0x0014:
                int r2 = r1.f207154n1
                int r2 = r0 - r2
                r1.f207156o1 = r2
            L_0x001a:
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                r1[r2] = r3
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity r2 = r5.f207183d
                int r2 = r2.f207156o1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                r2 = 2
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity r4 = r5.f207183d
                int r4 = r4.f207154n1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1[r2] = r4
                java.lang.String r2 = "MicroMsg.TextStatus.TextStatusEditHalfScreenActivity"
                java.lang.String r4 = "etDesc onPreDraw: etDesc.height: %s  ,etDiffHeight:%s ,etLastHeight:%s "
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r1)
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity r1 = r5.f207183d
                r1.f207154n1 = r0
                boolean r0 = r1.mo98578l8()
                r0 = r0 ^ r3
                if (r0 == 0) goto L_0x005b
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity r0 = r5.f207183d
                fy3.l<? super java.lang.Integer, rx3.b0> r1 = r0.f207150l1
                if (r1 == 0) goto L_0x005b
                int r0 = r0.f207156o1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.invoke(r0)
            L_0x005b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity.C71457a1.onPreDraw():boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$b0 */
    public static final class C71458b0 extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207184d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71458b0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207184d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (ImageView) this.f207184d.findViewById(C0966R.C0970id.fck);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$c */
    public static final class C71459c {

        /* renamed from: a */
        public C52718u f207185a;

        /* renamed from: b */
        public String f207186b;

        /* renamed from: c */
        public String f207187c;

        /* renamed from: d */
        public int f207188d;

        /* renamed from: e */
        public boolean f207189e;

        /* renamed from: f */
        public boolean f207190f = true;

        /* renamed from: g */
        public long f207191g;

        /* renamed from: h */
        public long f207192h;

        /* renamed from: i */
        public String f207193i = "";

        /* renamed from: j */
        public long f207194j;

        public C71459c(C52718u uVar) {
            C87412m.m108594g(uVar, "curTextStatusExtInfo");
            this.f207185a = uVar;
        }

        /* renamed from: a */
        public final void mo98611a(Context context) {
            C78318v1 v1Var;
            Class cls = C78318v1.class;
            Class cls2 = C77049b.class;
            int i = this.f207188d;
            if (i == 2) {
                C78318v1 v1Var2 = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context, 8, cls);
                if (v1Var2 != null) {
                    v1Var2.f229510p = this.f207191g * 1000;
                    v1Var2.f229512q = this.f207194j;
                    v1Var2.f229481S = (int) this.f207192h;
                    v1Var2.f229483T = this.f207193i;
                }
            } else if (i == 1 && (v1Var = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context, 8, cls)) != null) {
                v1Var.f229510p = 0;
                v1Var.f229512q = this.f207194j;
                v1Var.f229481S = (int) this.f207192h;
                v1Var.f229483T = this.f207193i;
            }
        }

        /* renamed from: b */
        public final void mo98612b() {
            this.f207186b = null;
            this.f207187c = null;
            this.f207188d = 0;
            this.f207189e = false;
            this.f207190f = true;
            this.f207191g = 0;
            this.f207192h = 0;
            this.f207193i = "";
            this.f207194j = 0;
        }

        /* renamed from: c */
        public final void mo98613c(C77459z zVar, String str, Context context) {
            C87412m.m108594g(context, "context");
            mo98612b();
            if (zVar != null) {
                String str2 = zVar.f229400e;
                if (!(str2 == null || C112551y.m153811k(str2))) {
                    int i = zVar.f229399d.f147237f;
                    if (i == 1) {
                        this.f207188d = 1;
                        if (!TextUtils.isEmpty(str)) {
                            String b = C78123i.f228932a.mo108105b(str);
                            this.f207186b = b;
                            this.f207187c = b;
                        }
                        this.f207190f = false;
                    } else if (i == 2) {
                        this.f207188d = 2;
                        this.f207186b = str;
                        if (str != null) {
                            C63679m.C63680a M1 = ((C63679m) C86312j.m106911c(C63679m.class)).mo88483M1(str);
                            this.f207191g = (M1 != null ? M1.f180528d : 0) / ((long) 1000);
                        }
                        this.f207190f = false;
                        this.f207189e = true;
                    }
                }
            }
            long l = C86013q1.m106451l(this.f207186b);
            this.f207194j = l;
            this.f207192h = l;
            this.f207193i = C90193h.m112876d(this.f207186b);
            mo98611a(context);
            Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "[updateFromSetStatusParam] oriLen:" + this.f207192h + " finalLen:" + this.f207194j + " type:" + this.f207188d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$c0 */
    public static final class C71460c0 extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207195d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71460c0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207195d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (WeImageView) this.f207195d.findViewById(C0966R.C0970id.nfp);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$d0 */
    public static final class C71461d0 extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207196d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71461d0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207196d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (ImageView) this.f207196d.findViewById(C0966R.C0970id.fd_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$d1 */
    public static final class C71462d1 extends C87413o implements C32224a<NestedScrollView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207197d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71462d1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207197d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (NestedScrollView) this.f207197d.findViewById(C0966R.C0970id.j4b);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$e */
    public static final class C71463e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207198d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71463e(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207198d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return this.f207198d.findViewById(C0966R.C0970id.ale);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$e0 */
    public static final class C71464e0 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207199d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71464e0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207199d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return this.f207199d.findViewById(C0966R.C0970id.fkn);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$e1 */
    public static final class C71465e1 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f207200d;

        public C71465e1(C32224a<C13598b0> aVar) {
            this.f207200d = aVar;
        }

        public final void run() {
            this.f207200d.invoke();
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$f */
    public static final class C71466f extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207201d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71466f(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207201d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return this.f207201d.findViewById(C0966R.C0970id.ali);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$f0 */
    public static final class C71467f0 extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207202d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71467f0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207202d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (ViewGroup) this.f207202d.findViewById(C0966R.C0970id.f358528fl3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$f1 */
    public static final class C71468f1 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f207203d;

        /* renamed from: e */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207204e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71468f1(Bitmap bitmap, TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207203d = bitmap;
            this.f207204e = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            Bitmap bitmap;
            Bitmap bitmap2 = this.f207203d;
            if (bitmap2 != null) {
                TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207204e;
                Bitmap bitmap3 = TextStatusEditHalfScreenActivity.f207059m2;
                textStatusEditHalfScreenActivity.mo98572e8().setImageBitmap(bitmap2);
                textStatusEditHalfScreenActivity.mo98572e8().setVisibility(0);
                FrameLayout frameLayout = textStatusEditHalfScreenActivity.f207068E;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                try {
                    C111011i iVar = new C111011i(textStatusEditHalfScreenActivity);
                    bitmap = bitmap2.copy(bitmap2.getConfig(), true);
                    if (bitmap == null) {
                        bitmap = null;
                    } else {
                        iVar.mo162692b(bitmap, 10.0f);
                        iVar.destroy();
                    }
                } catch (Throwable unused) {
                    bitmap = bitmap2;
                }
                TextStatusEditHalfScreenActivity.f207059m2 = bitmap;
                textStatusEditHalfScreenActivity.f207128d1 = bitmap2;
                textStatusEditHalfScreenActivity.mo98544G8();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$g */
    public static final class C71469g extends C87413o implements C32224a<ResultReceiver> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207205d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71469g(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207205d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (ResultReceiver) this.f207205d.getIntent().getParcelableExtra("CALLBACK");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$g0 */
    public static final class C71470g0 extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207206d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71470g0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207206d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (FrameLayout) this.f207206d.findViewById(C0966R.C0970id.fl_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$g1 */
    public static final class C71471g1 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207207d;

        public C71471g1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207207d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$showEducationLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View findViewById = this.f207207d.findViewById(C0966R.C0970id.cdh);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$showEducationLayout$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$showEducationLayout$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            RelativeLayout relativeLayout = this.f207207d.f207130e;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            this.f207207d.mo98583p8();
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this.f207207d, 8, C78318v1.class);
            if (v1Var != null) {
                v1Var.f229479R = 1;
            }
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207207d;
            textStatusEditHalfScreenActivity.f207077I1 = false;
            textStatusEditHalfScreenActivity.mo98563V7().requestFocus();
            this.f207207d.showVKB();
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$showEducationLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$h */
    public static final class C71472h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207208d;

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$h$a */
        public static final class C71473a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ TextStatusEditHalfScreenActivity f207209d;

            public C71473a(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
                this.f207209d = textStatusEditHalfScreenActivity;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                Class cls = C8808v4.class;
                e0Var.mo107154n(C0966R.C0970id.gs6, this.f207209d.getString(C0966R.string.jzb), this.f207209d.getString(C0966R.string.f7985yd), 0);
                e0Var.mo107142f(C0966R.C0970id.gsa, this.f207209d.getString(C0966R.string.iqt));
                SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
                if (!((C8808v4) C86312j.m106911c(cls)).mo9635e() || ((C8808v4) C86312j.m106911c(cls)).mo9636zX()) {
                    TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207209d;
                    textStatusEditHalfScreenActivity.getClass();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    Drawable drawable = textStatusEditHalfScreenActivity.getDrawable(C0966R.C0969drawable.bps);
                    C74933u4.m89769f(drawable, Color.parseColor("#F99234"));
                    int dimensionPixelSize = textStatusEditHalfScreenActivity.getResources().getDimensionPixelSize(C0966R.dimen.f3880hp);
                    C39477a aVar = new C39477a(drawable, 1);
                    drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    spannableStringBuilder.append(8199);
                    spannableStringBuilder.setSpan(aVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
                    spannableStringBuilder.append(textStatusEditHalfScreenActivity.getString(C0966R.string.grq));
                    e0Var.mo107142f(C0966R.C0970id.gs_, spannableStringBuilder);
                }
                if (this.f207209d.mo98578l8()) {
                    e0Var.mo107140d(C0966R.C0970id.gs9, this.f207209d.getResources().getColor(C0966R.color.f2966ao), this.f207209d.getString(C0966R.string.grv));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$h$b */
        public static final class C71474b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ TextStatusEditHalfScreenActivity f207210d;

            public C71474b(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
                this.f207210d = textStatusEditHalfScreenActivity;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                String str;
                CharSequence text;
                Class cls = C78318v1.class;
                Class cls2 = C77049b.class;
                int itemId = menuItem.getItemId();
                if (itemId == C0966R.C0970id.gs6) {
                    AppCompatActivity context = this.f207210d.getContext();
                    C87412m.m108593f(context, "context");
                    C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context, 8, cls);
                    if (v1Var != null) {
                        v1Var.f229485U++;
                    }
                    TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207210d;
                    Bitmap bitmap = TextStatusEditHalfScreenActivity.f207059m2;
                    textStatusEditHalfScreenActivity.mo98573f8();
                } else if (itemId == C0966R.C0970id.gsa) {
                    AppCompatActivity context2 = this.f207210d.getContext();
                    C87412m.m108593f(context2, "context");
                    C78318v1 v1Var2 = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context2, 8, cls);
                    if (v1Var2 != null) {
                        v1Var2.f229487V++;
                    }
                    TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity2 = this.f207210d;
                    Bitmap bitmap2 = TextStatusEditHalfScreenActivity.f207059m2;
                    textStatusEditHalfScreenActivity2.getClass();
                    Intent intent = new Intent();
                    intent.putExtra("key_edit_video_max_time_length", ((C77573p) C86312j.m106911c(C77573p.class)).uc0().mo106175b());
                    intent.putExtra("key_edit_text_color", "#0E9CE6");
                    intent.putExtra("album_is_from_text_status", true);
                    intent.putExtra("edt_video_layout_from_text_status", "com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout");
                    AppCompatActivity context3 = textStatusEditHalfScreenActivity2.getContext();
                    C87412m.m108592e(context3, "null cannot be cast to non-null type android.app.Activity");
                    ((C7138g) C86312j.m106911c(C7138g.class)).mo8324nq(context3, 6, 1, 22, 3, false, intent);
                } else if (itemId == C0966R.C0970id.gs_) {
                    TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity3 = this.f207210d;
                    Bitmap bitmap3 = TextStatusEditHalfScreenActivity.f207059m2;
                    Editable text2 = textStatusEditHalfScreenActivity3.mo98563V7().getText();
                    C65493r rVar = new C65493r();
                    rVar.f188461d = textStatusEditHalfScreenActivity3.mo98558Q7().f147238g.f147088e;
                    Matcher matcher = C39718p.f106570b.matcher(text2.toString());
                    while (matcher.find()) {
                        rVar.f188464g.add(matcher.group(1));
                    }
                    TextView textView = textStatusEditHalfScreenActivity3.f207136g;
                    if (textView == null || (text = textView.getText()) == null || (str = text.toString()) == null) {
                        str = "";
                    }
                    rVar.f188462e = str;
                    rVar.f188463f = text2.toString();
                    Intent intent2 = new Intent();
                    intent2.putExtra("BIZ_SCENE", 1);
                    intent2.putExtra("EXT_BUFF", rVar.toByteArray());
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(2);
                    arrayList.add(4);
                    arrayList.add(1);
                    arrayList.add(5);
                    arrayList.add(3);
                    C13598b0 b0Var = C13598b0.f38549a;
                    intent2.putIntegerArrayListExtra("TAB_LIST", arrayList);
                    textStatusEditHalfScreenActivity3.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
                    ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76880tQ(textStatusEditHalfScreenActivity3, intent2, 8);
                } else if (itemId == C0966R.C0970id.gs9) {
                    AppCompatActivity context4 = this.f207210d.getContext();
                    C87412m.m108593f(context4, "context");
                    C78318v1 v1Var3 = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context4, 8, cls);
                    if (v1Var3 != null) {
                        v1Var3.f229496Z0++;
                    }
                    TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity4 = this.f207210d;
                    Bitmap bitmap4 = TextStatusEditHalfScreenActivity.f207059m2;
                    textStatusEditHalfScreenActivity4.mo98548J7();
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$h$c */
        public static final class C71475c implements C77407n.C47880p {

            /* renamed from: a */
            public static final C71475c f207211a = new C71475c();

            public final void onDismiss() {
            }
        }

        public C71472h(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207208d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$cameraClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - this.f207208d.f207120Z1) < 1000) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$cameraClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207208d;
            textStatusEditHalfScreenActivity.f207120Z1 = currentTimeMillis;
            textStatusEditHalfScreenActivity.mo98581o8();
            this.f207208d.mo98580n8(true);
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity2 = this.f207208d;
            LayoutInflater.from(textStatusEditHalfScreenActivity2);
            C77407n nVar = new C77407n((Context) textStatusEditHalfScreenActivity2, 1, false);
            ArrayList arrayList2 = new ArrayList();
            new ArrayList();
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity3 = this.f207208d;
            C71473a aVar = new C71473a(textStatusEditHalfScreenActivity3);
            C71474b bVar = new C71474b(textStatusEditHalfScreenActivity3);
            nVar.f225761d = C71475c.f207211a;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C76875f0 f0Var = (C76875f0) ((MenuItem) it.next());
                f0Var.f224728w = null;
                f0Var.f224729x = null;
            }
            arrayList2.clear();
            C76874e0 e0Var = new C76874e0(textStatusEditHalfScreenActivity2);
            aVar.onCreateMMMenu(e0Var);
            if (e0Var.mo107176v()) {
                Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                nVar.f225771i = aVar;
                nVar.f225782p = bVar;
                nVar.f225761d = null;
                nVar.f225725D = null;
                nVar.mo107573q();
            }
            AppCompatActivity context = this.f207208d.getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
            if (v1Var != null) {
                v1Var.f229466E++;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$cameraClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$h0 */
    public static final class C71476h0 extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207212d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71476h0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207212d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (FrameLayout) this.f207212d.findViewById(C0966R.C0970id.fla);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$h1 */
    public static final class C71477h1 extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207213d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71477h1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207213d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (FrameLayout) this.f207213d.findViewById(C0966R.C0970id.k1_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$i */
    public static final class C71478i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207214d;

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$i$a */
        public static final class C71479a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ TextStatusEditHalfScreenActivity f207215d;

            public C71479a(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
                this.f207215d = textStatusEditHalfScreenActivity;
            }

            public final void run() {
                ProgressDialog progressDialog = this.f207215d.f207151l2;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                this.f207215d.mo98554M7();
            }
        }

        public C71478i(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207214d = textStatusEditHalfScreenActivity;
        }

        public final void run() {
            C71459c P7 = this.f207214d.mo98557P7();
            int i = this.f207214d.mo98557P7().f207188d;
            String str = "";
            if (i == 1) {
                C78123i iVar = C78123i.f228932a;
                String str2 = this.f207214d.mo98557P7().f207186b;
                if (str2 != null) {
                    str = str2;
                }
                str = iVar.mo108107d(str);
            } else if (i == 2) {
                TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207214d;
                String str3 = textStatusEditHalfScreenActivity.mo98557P7().f207186b;
                if (str3 != null) {
                    str = str3;
                }
                str = textStatusEditHalfScreenActivity.mo98555N7(str);
            }
            P7.f207187c = str;
            ((C119157j) C119157j.f356862d).mo183895z(new C71479a(this.f207214d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$i0 */
    public static final class C71480i0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207216d;

        public C71480i0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207216d = textStatusEditHalfScreenActivity;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r18) {
            /*
                r17 = this;
                r6 = r17
                java.lang.Class<aw.d> r7 = p447aw.C103918d.class
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r18
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$locationClickListener$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r17
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                r1 = 274436(0x43004, float:3.84567E-40)
                r2 = 0
                java.lang.Object r0 = r0.mo119684e(r1, r2)
                boolean r1 = r0 instanceof java.lang.String
                if (r1 == 0) goto L_0x0039
                r2 = r0
                java.lang.String r2 = (java.lang.String) r2
            L_0x0039:
                boolean r0 = nc0.C76850a.m92639k(r2)
                java.lang.String r1 = "(Landroid/view/View;)V"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "android/view/View$OnClickListener"
                java.lang.String r4 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$locationClickListener$1"
                r5 = 0
                java.lang.String r8 = "android.permission.ACCESS_COARSE_LOCATION"
                java.lang.String r9 = "android.permission.ACCESS_FINE_LOCATION"
                r10 = 1
                if (r0 == 0) goto L_0x00c2
                di3.d r0 = di3.C86312j.m106911c(r7)
                aw.d r0 = (p447aw.C103918d) r0
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity r11 = r6.f207216d
                androidx.appcompat.app.AppCompatActivity r11 = r11.getContext()
                boolean r0 = r0.Lb0(r11, r9)
                if (r0 == 0) goto L_0x0073
                di3.d r0 = di3.C86312j.m106911c(r7)
                aw.d r0 = (p447aw.C103918d) r0
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity r11 = r6.f207216d
                androidx.appcompat.app.AppCompatActivity r11 = r11.getContext()
                boolean r0 = r0.Lb0(r11, r8)
                if (r0 == 0) goto L_0x0073
                r0 = 1
                goto L_0x0074
            L_0x0073:
                r0 = 0
            L_0x0074:
                if (r0 != 0) goto L_0x00f2
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC
                java.lang.Boolean r12 = java.lang.Boolean.FALSE
                java.lang.Object r0 = r0.mo119685f(r11, r12)
                boolean r0 = gy3.C87412m.m108589b(r0, r12)
                if (r0 == 0) goto L_0x00a9
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity r0 = r6.f207216d
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity r7 = r6.f207216d
                r8 = 2131832233(0x7f112da9, float:1.9297514E38)
                java.lang.Object[] r9 = new java.lang.Object[r10]
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
                r9[r5] = r11
                java.lang.String r5 = r7.getString(r8, r9)
                r7 = 30764(0x782c, float:4.311E-41)
                qg0.C12215a.m11778c(r0, r5, r7, r10)
                goto L_0x00be
            L_0x00a9:
                di3.d r0 = di3.C86312j.m106911c(r7)
                aw.d r0 = (p447aw.C103918d) r0
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity r5 = r6.f207216d
                androidx.appcompat.app.AppCompatActivity r5 = r5.getContext()
                java.lang.String[] r7 = new java.lang.String[]{r9, r8}
                r8 = 64
                r0.b40(r5, r7, r8)
            L_0x00be:
                j20.C117292a.m165361g(r6, r4, r3, r2, r1)
                return
            L_0x00c2:
                di3.d r0 = di3.C86312j.m106911c(r7)
                r11 = r0
                aw.d r11 = (p447aw.C103918d) r11
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity r0 = r6.f207216d
                androidx.appcompat.app.AppCompatActivity r12 = r0.getContext()
                java.lang.String[] r13 = new java.lang.String[]{r9, r8}
                r14 = 64
                r15 = 0
                r16 = 0
                boolean r0 = r11.Uu0(r12, r13, r14, r15, r16)
                java.lang.Object[] r7 = new java.lang.Object[r10]
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
                r7[r5] = r8
                java.lang.String r5 = "MicroMsg.TextStatus.TextStatusEditHalfScreenActivity"
                java.lang.String r8 = "summerper checkPermission checkLocation[%b]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r7)
                if (r0 != 0) goto L_0x00f2
                j20.C117292a.m165361g(r6, r4, r3, r2, r1)
                return
            L_0x00f2:
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity r0 = r6.f207216d
                r0.mo98607y8()
                j20.C117292a.m165361g(r6, r4, r3, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity.C71480i0.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$i1 */
    public static final class C71481i1 implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207217d;

        public C71481i1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207217d = textStatusEditHalfScreenActivity;
        }

        public void afterTextChanged(Editable editable) {
            Log.m105918d("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "afterTextChanged() called with: s = " + editable);
            this.f207217d.mo98563V7().removeTextChangedListener(this);
            this.f207217d.mo98556O7().setEnabled(this.f207217d.mo98604v8());
            if (this.f207217d.mo98556O7().isEnabled()) {
                View W7 = this.f207217d.mo98564W7();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = W7;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                W7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View W72 = this.f207217d.mo98564W7();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = W72;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                W72.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C78336h hVar = new C78336h(String.valueOf(editable), (int) this.f207217d.mo98563V7().getPaint().getTextSize());
            C45078p0.C45079a aVar3 = C45078p0.C45079a.MODE_CHINESE_AS_2;
            int a = hVar.mo108328a(aVar3);
            String.valueOf(editable);
            if (a > 2000) {
                this.f207217d.mo98563V7().setText(C102226d.m134696a(this.f207217d, hVar.mo108329b(2000, aVar3)));
                this.f207217d.mo98563V7().setSelection(this.f207217d.mo98563V7().getText().length());
                TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207217d;
                String string = textStatusEditHalfScreenActivity.getString(C0966R.string.ius);
                C87412m.m108593f(string, "getString(com.tencent.mm…text_status_invalid_more)");
                textStatusEditHalfScreenActivity.mo98542E8(string);
                AppCompatActivity context = this.f207217d.getContext();
                C87412m.m108593f(context, "context");
                C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
                if (v1Var != null) {
                    v1Var.f229462A++;
                }
            }
            this.f207217d.mo98563V7().addTextChangedListener(this);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$j */
    public static final class C71482j extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207218d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71482j(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207218d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return this.f207218d.findViewById(C0966R.C0970id.ngm);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$j1 */
    public static final class C71483j1 extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207219d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71483j1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207219d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (LinearLayout) this.f207219d.findViewById(C0966R.C0970id.kja);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$k */
    public static final class C71484k extends C87413o implements C32224a<EmojiStatusView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207220d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71484k(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207220d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (EmojiStatusView) this.f207220d.findViewById(C0966R.C0970id.cie);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$k1 */
    public static final class C71485k1 extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207221d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71485k1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207221d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (TextView) this.f207221d.findViewById(C0966R.C0970id.kjb);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$l */
    public static final class C71486l extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207222d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71486l(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207222d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return this.f207222d.findViewById(C0966R.C0970id.cry);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$l0 */
    public static final class C71487l0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207223d;

        public C71487l0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207223d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f207223d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$l1 */
    public static final class C71488l1 extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207224d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71488l1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207224d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (FrameLayout) this.f207224d.findViewById(C0966R.C0970id.kjc);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$m */
    public static final class C71489m implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207225d;

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$m$a */
        public static final class C71490a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ TextStatusEditHalfScreenActivity f207226d;

            /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$m$a$a */
            public static final class C71491a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ TextStatusEditHalfScreenActivity f207227d;

                public C71491a(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
                    this.f207227d = textStatusEditHalfScreenActivity;
                }

                public final void run() {
                    Object systemService = this.f207227d.getContext().getSystemService("input_method");
                    C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).showSoftInput(this.f207227d.mo98563V7(), 0);
                    if (C76866m.m92674c()) {
                        TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207227d;
                        textStatusEditHalfScreenActivity.getClass();
                        long c = C31543z5.m39453c();
                        MotionEvent obtain = MotionEvent.obtain(c, c, 0, 0.0f, 0.0f, 0);
                        MotionEvent obtain2 = MotionEvent.obtain(c, C31543z5.m39453c(), 1, 0.0f, 0.0f, 0);
                        textStatusEditHalfScreenActivity.mo98563V7().onTouchEvent(obtain);
                        textStatusEditHalfScreenActivity.mo98563V7().onTouchEvent(obtain2);
                    }
                }
            }

            public C71490a(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
                this.f207226d = textStatusEditHalfScreenActivity;
            }

            public final void run() {
                this.f207226d.mo98563V7().requestFocus();
                C119179t tVar = C119157j.f356862d;
                C71491a aVar = new C71491a(this.f207226d);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(aVar, 200, false);
            }
        }

        public C71489m(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207225d = textStatusEditHalfScreenActivity;
        }

        public void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = this.f207225d.mo98563V7().getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            if (!this.f207225d.mo98541D8()) {
                TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207225d;
                if (!textStatusEditHalfScreenActivity.f207077I1) {
                    textStatusEditHalfScreenActivity.mo98563V7().post(new C71490a(this.f207225d));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$m0 */
    public static final class C71492m0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207228d;

        public C71492m0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207228d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207228d;
            if (textStatusEditHalfScreenActivity.f207179y1) {
                textStatusEditHalfScreenActivity.hideVKB();
            } else {
                textStatusEditHalfScreenActivity.showVKB();
            }
            if (IStatusIconHelperKt.m39109a().mo62275E()) {
                this.f207228d.mo98580n8(true);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$m1 */
    public static final class C71493m1 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207229d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71493m1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207229d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return this.f207229d.findViewById(C0966R.C0970id.ksb);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$goCapture$1", mo125469f = "TextStatusEditHalfScreenActivity.kt", mo125470l = {2464}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$n */
    public static final class C71494n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f207230d;

        /* renamed from: e */
        public final /* synthetic */ ComponentActivity f207231e;

        /* renamed from: f */
        public final /* synthetic */ RecordConfigProvider f207232f;

        /* renamed from: g */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207233g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71494n(ComponentActivity componentActivity, RecordConfigProvider recordConfigProvider, TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity, C15601d<? super C71494n> dVar) {
            super(2, dVar);
            this.f207231e = componentActivity;
            this.f207232f = recordConfigProvider;
            this.f207233g = textStatusEditHalfScreenActivity;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C71494n(this.f207231e, this.f207232f, this.f207233g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C71494n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f207230d;
            int i2 = 1;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ComponentActivity componentActivity = this.f207231e;
                RecordConfigProvider recordConfigProvider = this.f207232f;
                this.f207230d = 1;
                obj = ((C77572l) C86312j.m106911c(C77572l.class)).mo107612ZM(componentActivity, recordConfigProvider, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C77575r rVar = (C77575r) obj;
            if (rVar.f226147b == -1 && rVar.f226148c == 0) {
                RecordMediaReportInfo recordMediaReportInfo = rVar.f226151f;
                if (recordMediaReportInfo != null) {
                    AppCompatActivity context = this.f207233g.getContext();
                    C87412m.m108593f(context, "getContext()");
                    C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
                    if (v1Var != null) {
                        Object b = recordMediaReportInfo.mo129811b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", new Long(0));
                        C87412m.m108593f(b, "reportInfo.getReportValu…DIA_DURATION_MS_LONG, 0L)");
                        v1Var.f229509o = ((Number) b).longValue();
                        v1Var.f229513r = (long) (((Number) recordMediaReportInfo.mo129811b("KEY_MEDIA_SOURCE_INT", new Integer(0))).intValue() + 1);
                    }
                }
                TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207233g;
                C77574q qVar = rVar.f226149d;
                Bitmap bitmap = TextStatusEditHalfScreenActivity.f207059m2;
                textStatusEditHalfScreenActivity.getClass();
                if (qVar != null) {
                    String str = qVar.mo107740b() ? qVar.f226144c : qVar.f226143b;
                    String str2 = qVar.f226143b;
                    Log.m105925i("MicroMsg.TextStatus.TextStatusEditActivity", "[handleCaptureResult]isVideo:%s,thumbPath:%s,filePath:%s", Boolean.valueOf(qVar.mo107740b()), str, str2);
                    textStatusEditHalfScreenActivity.mo98548J7();
                    C71459c P7 = textStatusEditHalfScreenActivity.mo98557P7();
                    AppCompatActivity context2 = textStatusEditHalfScreenActivity.getContext();
                    C87412m.m108593f(context2, "context");
                    P7.mo98612b();
                    C76252b.m91659c(P7.f207185a);
                    P7.f207190f = false;
                    if (qVar.mo107740b()) {
                        P7.f207188d = 2;
                        P7.f207186b = qVar.f226143b;
                        P7.f207187c = qVar.f226144c;
                        P7.f207191g = qVar.f226145d;
                    } else {
                        P7.f207188d = 1;
                        P7.f207186b = qVar.f226143b;
                        P7.f207189e = true;
                    }
                    long l = C86013q1.m106451l(P7.f207186b);
                    P7.f207194j = l;
                    P7.f207192h = l;
                    P7.f207193i = C90193h.m112876d(P7.f207186b);
                    P7.mo98611a(context2);
                    if (qVar.mo107740b()) {
                        i2 = 2;
                    }
                    textStatusEditHalfScreenActivity.mo98575i8(str2, i2);
                    textStatusEditHalfScreenActivity.mo98544G8();
                    textStatusEditHalfScreenActivity.mo98553L8();
                    textStatusEditHalfScreenActivity.mo98545H8();
                }
                C32224a<C13598b0> aVar2 = this.f207233g.f207143i1;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                if (IStatusIconHelperKt.m39109a().mo62278H()) {
                    this.f207233g.mo98545H8();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$n0 */
    public static final class C71495n0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207234d;

        public C71495n0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207234d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f207234d.f207117Y1.onClick(view);
            AppCompatActivity context = this.f207234d.getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
            if (v1Var != null) {
                v1Var.f229468G++;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$n1 */
    public static final class C71496n1 extends C87413o implements C32224a<TransitionDrawable> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71496n1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207235d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            Drawable drawable = this.f207235d.getResources().getDrawable(C0966R.C0969drawable.ckd);
            C87412m.m108592e(drawable, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
            return (TransitionDrawable) drawable;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$o */
    public static final class C71497o implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207236d;

        public C71497o(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207236d = textStatusEditHalfScreenActivity;
        }

        public final void run() {
            Object value = ((C36570n) this.f207236d.f207174x).getValue();
            C87412m.m108593f(value, "<get-scrollview>(...)");
            ((NestedScrollView) value).mo144970f(130);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$o0 */
    public static final class C71498o0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207237d;

        public C71498o0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207237d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f207237d.getClass();
            Editable text = this.f207237d.mo98563V7().getText();
            if (text != null) {
                text.insert(this.f207237d.mo98563V7().getSelectionStart(), this.f207237d.getContext().getString(C0966R.string.f361426jt2));
            }
            this.f207237d.mo98563V7().requestFocus();
            Object systemService = this.f207237d.getContext().getSystemService("input_method");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(this.f207237d.mo98563V7(), 0);
            AppCompatActivity context = this.f207237d.getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
            if (v1Var != null) {
                v1Var.f229465D++;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$o1 */
    public static final class C71499o1 extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207238d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71499o1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207238d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (TextView) this.f207238d.findViewById(C0966R.C0970id.kxe);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$p */
    public static final class C71500p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f207239d;

        /* renamed from: e */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207240e;

        public C71500p(String str, TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207239d = str;
            this.f207240e = textStatusEditHalfScreenActivity;
        }

        public final void run() {
            Bitmap b = C76658g.m92308b(this.f207239d);
            Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "handleFileLocal decodeImg bitmap:" + b);
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207240e;
            Bitmap bitmap = TextStatusEditHalfScreenActivity.f207059m2;
            textStatusEditHalfScreenActivity.getClass();
            if (b != null) {
                Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "setForegroundPic vpic post start " + b + ' ' + true);
                textStatusEditHalfScreenActivity.mo98572e8().post(new C79227c2(b, textStatusEditHalfScreenActivity));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$p0 */
    public static final class C71501p0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207241d;

        public C71501p0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207241d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AppCompatActivity context = this.f207241d.getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
            if (v1Var != null) {
                v1Var.f229464C++;
            }
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207241d;
            if (textStatusEditHalfScreenActivity.f207116Y0 == 1) {
                TextStatusEditHalfScreenActivity.m83977H7(textStatusEditHalfScreenActivity);
                C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            TextStatusDoWhatActivity.f206763C.mo6662b(textStatusEditHalfScreenActivity, textStatusEditHalfScreenActivity.f207123b1, textStatusEditHalfScreenActivity.mo98558Q7().f147238g.f147092i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$p1 */
    public static final class C71502p1 extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207242d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71502p1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207242d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (ImageView) this.f207242d.findViewById(C0966R.C0970id.m8p);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$q */
    public static final class C71503q implements C76057w.C76058a {

        /* renamed from: a */
        public final /* synthetic */ String f207243a;

        /* renamed from: b */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207244b;

        /* renamed from: c */
        public final /* synthetic */ C71455a f207245c;

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$q$a */
        public static final class C71504a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f207246d;

            /* renamed from: e */
            public final /* synthetic */ TextStatusEditHalfScreenActivity f207247e;

            /* renamed from: f */
            public final /* synthetic */ C71455a f207248f;

            /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$q$a$a */
            public static final class C71505a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ TextStatusEditHalfScreenActivity f207249d;

                /* renamed from: e */
                public final /* synthetic */ String f207250e;

                /* renamed from: f */
                public final /* synthetic */ C71455a f207251f;

                public C71505a(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity, String str, C71455a aVar) {
                    this.f207249d = textStatusEditHalfScreenActivity;
                    this.f207250e = str;
                    this.f207251f = aVar;
                }

                public final void run() {
                    TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207249d;
                    String str = this.f207250e;
                    Bitmap bitmap = TextStatusEditHalfScreenActivity.f207059m2;
                    textStatusEditHalfScreenActivity.mo98575i8(str, 1);
                    this.f207249d.mo98544G8();
                    C71455a aVar = this.f207251f;
                    if (aVar != null) {
                        aVar.mo98609b(this.f207250e);
                    }
                }
            }

            public C71504a(Bitmap bitmap, TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity, C71455a aVar) {
                this.f207246d = bitmap;
                this.f207247e = textStatusEditHalfScreenActivity;
                this.f207248f = aVar;
            }

            public final void run() {
                C39696f fVar = C39696f.f106501a;
                String a = C13781a.m13082a();
                C87412m.m108593f(a, "username()");
                String d = fVar.mo62321d("ptmptmb", a);
                C76658g.m92309c(this.f207246d, d);
                TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207247e;
                Bitmap bitmap = TextStatusEditHalfScreenActivity.f207059m2;
                textStatusEditHalfScreenActivity.mo98572e8().post(new C71505a(this.f207247e, d, this.f207248f));
            }
        }

        public C71503q(String str, TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity, C71455a aVar) {
            this.f207243a = str;
            this.f207244b = textStatusEditHalfScreenActivity;
            this.f207245c = aVar;
        }

        /* renamed from: a */
        public final void mo25933a(String str, Bitmap bitmap, String str2) {
            boolean k = C86013q1.m106450k(str2);
            Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "trydownload imgback end:" + this.f207243a + " path:" + str2 + " bitmap:" + bitmap + " exist:" + k + " len:" + C86013q1.m106451l(str2));
            if (bitmap != null) {
                if (!k) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C71504a(bitmap, this.f207244b, this.f207245c));
                    return;
                }
                TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207244b;
                Bitmap bitmap2 = TextStatusEditHalfScreenActivity.f207059m2;
                textStatusEditHalfScreenActivity.mo98575i8(str2, 1);
                this.f207244b.mo98544G8();
                C71455a aVar = this.f207245c;
                if (aVar != null) {
                    C87412m.m108593f(str2, "path");
                    aVar.mo98609b(str2);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$q0 */
    public static final class C71506q0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207252d;

        public C71506q0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207252d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f207252d.f207117Y1.onClick(view);
            AppCompatActivity context = this.f207252d.getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
            if (v1Var != null) {
                v1Var.f229467F++;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$q1 */
    public static final class C71507q1 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207253d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71507q1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207253d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return this.f207253d.findViewById(C0966R.C0970id.l2v);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$r */
    public static final class C71508r implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207254d;

        public C71508r(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207254d = textStatusEditHalfScreenActivity;
        }

        public final void run() {
            C85875k4.m106189j0(this.f207254d.mo98563V7().getPaint(), 0.8f);
            this.f207254d.mo98563V7().setHint(C0966R.string.jzn);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$r0 */
    public static final class C71509r0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207255d;

        public C71509r0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207255d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f207255d.getClass();
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$r1 */
    public static final class C71510r1 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207256d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71510r1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207256d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return this.f207256d.findViewById(C0966R.C0970id.l2z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$s */
    public static final class C71511s implements C71455a {

        /* renamed from: a */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207257a;

        public C71511s(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207257a = textStatusEditHalfScreenActivity;
        }

        /* renamed from: b */
        public void mo98609b(String str) {
            C87412m.m108594g(str, "path");
            C71459c P7 = this.f207257a.mo98557P7();
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207257a;
            C77459z zVar = textStatusEditHalfScreenActivity.f207113X0;
            AppCompatActivity context = textStatusEditHalfScreenActivity.getContext();
            C87412m.m108593f(context, "context");
            P7.mo98613c(zVar, str, context);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$s0 */
    public static final class C71512s0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207258d;

        public C71512s0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207258d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f207258d.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$s1 */
    public static final class C71513s1 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207259d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71513s1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207259d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return this.f207259d.findViewById(C0966R.C0970id.f359474l30);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$t */
    public static final class C71514t implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207260d;

        public C71514t(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207260d = textStatusEditHalfScreenActivity;
        }

        public final void run() {
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207260d;
            textStatusEditHalfScreenActivity.mo98575i8(textStatusEditHalfScreenActivity.mo98557P7().f207186b, this.f207260d.mo98557P7().f207188d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$t0 */
    public static final class C71515t0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207261d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71515t0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207261d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            View view;
            if (IStatusIconHelperKt.m39109a().mo62275E()) {
                TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207261d;
                if (textStatusEditHalfScreenActivity.f207116Y0 == 1) {
                    TextStatusEditHalfScreenActivity.m83977H7(textStatusEditHalfScreenActivity);
                } else if (textStatusEditHalfScreenActivity.f207140h1) {
                    textStatusEditHalfScreenActivity.mo98580n8(false);
                    this.f207261d.showVKB();
                    this.f207261d.mo98563V7().requestFocus();
                } else {
                    AppCompatActivity context = this.f207261d.getContext();
                    C87412m.m108593f(context, "context");
                    C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
                    if (v1Var != null) {
                        v1Var.f229464C++;
                    }
                    TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity2 = this.f207261d;
                    Log.m105925i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "showEmojiPanel: isSelectStatusIconMode:%s stack:%s", Boolean.valueOf(textStatusEditHalfScreenActivity2.f207140h1), Util.getStack());
                    C76628m0 m0Var = textStatusEditHalfScreenActivity2.f207167t1;
                    if (!(m0Var == null || (view = ((C81895h2) m0Var).getView()) == null || textStatusEditHalfScreenActivity2.f207140h1)) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "showEmojiPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "showEmojiPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        textStatusEditHalfScreenActivity2.mo98563V7().setCursorVisible(false);
                        textStatusEditHalfScreenActivity2.f207140h1 = true;
                        textStatusEditHalfScreenActivity2.mo98547I8();
                        if (!(textStatusEditHalfScreenActivity2.mo98565X7().getRotation() == -90.0f)) {
                            ObjectAnimator.ofFloat(textStatusEditHalfScreenActivity2.mo98565X7(), "rotation", new float[]{90.0f, -90.0f}).setDuration(300).start();
                        }
                        textStatusEditHalfScreenActivity2.mo98565X7().setIconColor(view.getResources().getColor(C0966R.color.FG_4));
                        textStatusEditHalfScreenActivity2.mo98561T7().setBackground((TransitionDrawable) ((C36570n) textStatusEditHalfScreenActivity2.f207176x1).getValue());
                        ((TransitionDrawable) ((C36570n) textStatusEditHalfScreenActivity2.f207176x1).getValue()).startTransition(300);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{view.getTranslationY(), 0.0f});
                        C8477a0 a0Var = new C8477a0();
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.setDuration(150);
                        ofFloat.addUpdateListener(new C79234e2(textStatusEditHalfScreenActivity2, ofFloat, a0Var));
                        ofFloat.start();
                        TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent = textStatusEditHalfScreenActivity2.f207133f;
                        if (textStatusEmojiPanelInputComponent != null) {
                            textStatusEmojiPanelInputComponent.setExtraEmojiPanelShow(true);
                        }
                        textStatusEditHalfScreenActivity2.hideVKB();
                        TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent2 = textStatusEditHalfScreenActivity2.f207133f;
                        if (textStatusEmojiPanelInputComponent2 != null) {
                            textStatusEmojiPanelInputComponent2.setVisibility(4);
                        }
                        C76628m0 m0Var2 = textStatusEditHalfScreenActivity2.f207167t1;
                        C87412m.m108591d(m0Var2);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(AppMeasurement.Param.TIMESTAMP, C31543z5.m39453c());
                        C13598b0 b0Var = C13598b0.f38549a;
                        ((C81895h2) m0Var2).mo114295h0("onRequestStatusEmojiPanelShow", jSONObject);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$t1 */
    public static final class C71516t1 extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207262d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71516t1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207262d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (ImageView) this.f207262d.findViewById(C0966R.C0970id.l37);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$u */
    public static final class C71517u implements C72837v1 {

        /* renamed from: a */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207263a;

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$u$a */
        public static final class C71518a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ IEmojiInfo f207264d;

            /* renamed from: e */
            public final /* synthetic */ TextStatusEditHalfScreenActivity f207265e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C71518a(IEmojiInfo iEmojiInfo, TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
                super(0);
                this.f207264d = iEmojiInfo;
                this.f207265e = textStatusEditHalfScreenActivity;
            }

            public Object invoke() {
                Log.m105918d("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "onSendCustomEmoji() called with: emoji = " + this.f207264d);
                C78318v1 b8 = this.f207265e.mo98569b8();
                if (b8 != null) {
                    b8.f229480R0++;
                }
                this.f207265e.mo98574g8(this.f207264d);
                return C13598b0.f38549a;
            }
        }

        public C71517u(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207263a = textStatusEditHalfScreenActivity;
        }

        /* renamed from: X1 */
        public void mo65586X1(IEmojiInfo iEmojiInfo) {
            C23564m.m28136f(new C71518a(iEmojiInfo, this.f207263a));
        }

        /* renamed from: a */
        public void mo65587a() {
            Log.m105918d("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "onHidePanel() called");
        }

        /* renamed from: b */
        public void mo65588b(boolean z, int i) {
            Log.m105918d("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "onSearchDialogShow() called with: isShow = " + z + ", dialogHeight = " + i);
            C78318v1 b8 = this.f207263a.mo98569b8();
            if (b8 != null) {
                b8.f229484T0++;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$u0 */
    public static final class C71519u0 implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207266d;

        public C71519u0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207266d = textStatusEditHalfScreenActivity;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f207266d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$u1 */
    public static final class C71520u1 extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207267d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71520u1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207267d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (ImageView) this.f207267d.findViewById(C0966R.C0970id.m8q);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$v */
    public static final class C71521v implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207268d;

        public C71521v(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207268d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$initSmileyPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object value = ((C36570n) this.f207268d.f207084M).getValue();
            C87412m.m108593f(value, "<get-layoutEmojiView>(...)");
            View view2 = (View) value;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$initSmileyPanel$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$initSmileyPanel$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f207268d.mo98562U7().setEmojiInfo((IEmojiInfo) null);
            this.f207268d.mo98545H8();
            C78318v1 b8 = this.f207268d.mo98569b8();
            if (b8 != null) {
                b8.f229482S0++;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$initSmileyPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$v0 */
    public static final class C71522v0 implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207269d;

        public C71522v0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207269d = textStatusEditHalfScreenActivity;
        }

        public boolean onPreDraw() {
            View view;
            ViewTreeObserver viewTreeObserver;
            RelativeLayout relativeLayout = this.f207269d.f207130e;
            if (!(relativeLayout == null || (viewTreeObserver = relativeLayout.getViewTreeObserver()) == null)) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            C76628m0 m0Var = this.f207269d.f207167t1;
            if (!(m0Var == null || (view = ((C81895h2) m0Var).getView()) == null)) {
                TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207269d;
                int keyBordHeightPx = KeyBoardUtil.getKeyBordHeightPx(textStatusEditHalfScreenActivity) + C76577a.m92151b(MMApplicationContext.getContext(), 50);
                if (keyBordHeightPx <= 0) {
                    keyBordHeightPx = C79406f.m96347a(view.getContext(), 300.0f);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, keyBordHeightPx);
                layoutParams.addRule(9);
                layoutParams.addRule(12);
                view.setLayoutParams(layoutParams);
                C76628m0 m0Var2 = textStatusEditHalfScreenActivity.f207167t1;
                C87412m.m108591d(m0Var2);
                View view2 = ((C81895h2) m0Var2).getView();
                C87412m.m108591d(view2);
                view2.requestLayout();
                RelativeLayout relativeLayout2 = textStatusEditHalfScreenActivity.f207130e;
                if (relativeLayout2 != null) {
                    relativeLayout2.addView(view);
                }
                view.setTranslationY((float) keyBordHeightPx);
                Log.m105919d("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "editLayout?.viewTreeObserver?.addOnPreDrawListener:  height：%s", Integer.valueOf(keyBordHeightPx));
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$v1 */
    public static final class C71523v1 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207270d;

        public C71523v1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207270d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList<String> arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(view);
            Object[] array = arrayList2.toArray();
            arrayList2.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$visibilityClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207270d;
            Bitmap bitmap = TextStatusEditHalfScreenActivity.f207059m2;
            Intent className = textStatusEditHalfScreenActivity.mo98605w8() ? new Intent().setClassName(this.f207270d, "com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI") : new Intent().setClassName(this.f207270d, "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            C87412m.m108593f(className, "if (isDynamicLabelOpen) …ui.SnsLabelUI\")\n        }");
            if (this.f207270d.mo98605w8() && (arrayList = this.f207270d.f207111W1) != null) {
                className.putStringArrayListExtra("label_id", arrayList);
            }
            className.putExtra("KLabel_range_index", this.f207270d.f207099S1);
            className.putExtra("Klabel_name_list", this.f207270d.f207102T1);
            className.putExtra("Kother_user_name_list", this.f207270d.f207105U1);
            className.putExtra("Kchat_room_name_list", this.f207270d.f207108V1);
            className.putExtra("Kis_from_text_status", true);
            className.putExtra("k_show_private", false);
            className.putExtra("k_show_include", false);
            this.f207270d.getClass();
            className.putExtra("k_sns_label_ui_style", 0);
            this.f207270d.startActivityForResult(className, 4);
            AppCompatActivity context = this.f207270d.getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
            if (v1Var != null) {
                v1Var.f229470I++;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$visibilityClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$w */
    public static final class C71524w implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207271d;

        public C71524w(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207271d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$initSmileyPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207271d;
            if (textStatusEditHalfScreenActivity.f207088O1 == C30501b.BIG_EMOJI) {
                TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent = textStatusEditHalfScreenActivity.f207133f;
                boolean z = false;
                if (textStatusEmojiPanelInputComponent != null && textStatusEmojiPanelInputComponent.getVisibility() == 0) {
                    z = true;
                }
                if (z) {
                    this.f207271d.mo98581o8();
                } else {
                    this.f207271d.showVKB();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$initSmileyPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$w0 */
    public static final class C71525w0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207272d;

        public C71525w0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207272d = textStatusEditHalfScreenActivity;
        }

        public final void run() {
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207272d;
            if (textStatusEditHalfScreenActivity.f207076I != null) {
                textStatusEditHalfScreenActivity.getClass();
            } else {
                C87412m.m108603p("vBack");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$x0 */
    public static final class C71526x0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207273d;

        public C71526x0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207273d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f207273d.mo98556O7().isEnabled()) {
                this.f207273d.mo4084L3((String) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207273d;
            textStatusEditHalfScreenActivity.mo4086P4(textStatusEditHalfScreenActivity.mo98563V7().getText().toString());
            C64208c.C64209a aVar = C64208c.f181951a;
            if (C64208c.f181956f != null) {
                if (((C7774m) C86312j.m106911c(C7774m.class)).mo8883Y2()) {
                    C64208c.f181957g++;
                    JSONObject jSONObject = new JSONObject();
                    String str = C64208c.f181956f;
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, str);
                    ((C33057k5) C86312j.m106911c(C33057k5.class)).mo55684AI(C0073g0.LIVE_ANCHOR_ACTION_SHARE, jSONObject.toString());
                } else {
                    C64208c.f181957g++;
                    ((C61568m) C86312j.m106911c(C61568m.class)).qw0(C64208c.f181956f, C54097l0.PERSIONAL_STATE_SHARE_SUCC, C36903g0.f97931d);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$y */
    public static final class C71527y extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207274d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71527y(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207274d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return this.f207274d.findViewById(C0966R.C0970id.fc_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$y0 */
    public static final class C71528y0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207275d;

        public C71528y0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207275d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f207275d.mo4084L3((String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$z */
    public static final class C71529z extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207276d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71529z(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(0);
            this.f207276d = textStatusEditHalfScreenActivity;
        }

        public Object invoke() {
            return (ImageView) this.f207276d.findViewById(C0966R.C0970id.fci);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$z0 */
    public static final class C71530z0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f207277d;

        public C71530z0(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            this.f207277d = textStatusEditHalfScreenActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f207277d.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public TextStatusEditHalfScreenActivity() {
        C86709a0.m107524d().mo123460f(new C10699j());
        this.f207145j = C36568h.m40985a(new C71507q1(this));
        this.f207153n = C36568h.m40985a(new C71513s1(this));
        this.f207155o = C36568h.m40985a(new C71510r1(this));
        this.f207168u = C36568h.m40985a(new C71461d0(this));
        this.f207174x = C36568h.m40985a(new C71462d1(this));
        this.f207177y = C36568h.m40985a(new C71499o1(this));
        this.f207060A = C36568h.m40985a(new C71516t1(this));
        this.f207062B = C36568h.m40985a(new C71520u1(this));
        this.f207064C = C36568h.m40985a(new C71502p1(this));
        this.f207070F = C36568h.m40985a(new C71470g0(this));
        this.f207072G = C36568h.m40985a(new C71476h0(this));
        this.f207080K = C36568h.m40985a(new C71467f0(this));
        this.f207082L = C36568h.m40985a(new C71484k(this));
        this.f207084M = C36568h.m40985a(new C71464e0(this));
        this.f207086N = C36568h.m40985a(new C71466f(this));
        this.f207097S = C36568h.m40985a(new C71493m1(this));
        this.f207109W = C36568h.m40985a(new C71486l(this));
        this.f207115Y = C36568h.m40985a(new C71463e(this));
        this.f207118Z = C36568h.m40985a(new C71482j(this));
        this.f207158p0 = C36568h.m40985a(new C71460c0(this));
        this.f207092Q0 = C36568h.m40985a(new C71529z(this));
        this.f207095R0 = C36568h.m40985a(new C71456a0(this));
        this.f207098S0 = C36568h.m40985a(new C71483j1(this));
        this.f207101T0 = C36568h.m40985a(new C71485k1(this));
        this.f207104U0 = C36568h.m40985a(new C71488l1(this));
        this.f207107V0 = C36568h.m40985a(new C71458b0(this));
        C36568h.m40985a(new C71477h1(this));
        this.f207110W0 = C36568h.m40985a(new C71469g(this));
        this.f207123b1 = C39718p.f106569a.mo62352c();
        this.f207152m1 = -1;
        this.f207159p1 = "wxb1320569c2a2b6d2";
        this.f207161q1 = "pages/emoji-panel/emoji-panel.html";
        this.f207163r1 = "gh_8672f34b4389@app";
        C36568h.m40985a(C30505j0.f82188d);
        C36568h.m40985a(C30506k0.f82189d);
        this.f207169u1 = "icon_id";
        this.f207171v1 = "last_post_time";
        this.f207173w1 = "config";
        this.f207176x1 = C36568h.m40985a(new C71496n1(this));
        this.f207061A1 = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_TextStatus_ShowEducation_Int, 0) == 1;
        this.f207069E1 = 2000;
        this.f207071F1 = C36568h.m40985a(new C71527y(this));
        this.f207079J1 = new C71489m(this);
        this.f207081K1 = new C71457a1(this);
        C40008f fVar = C40008f.f107254d;
        this.f207083L1 = new TextStatusEditHalfScreenActivity$configUpdateListener$1(this, fVar);
        this.f207087N1 = new C71531xf618b501(this, fVar);
        this.f207088O1 = C30501b.NORMAL;
        this.f207090P1 = new C71481i1(this);
        this.f207102T1 = "";
        this.f207105U1 = "";
        this.f207108V1 = "";
        this.f207111W1 = new ArrayList<>();
        this.f207114X1 = new C71523v1(this);
        this.f207117Y1 = new C71480i0(this);
        this.f207122a2 = new C71472h(this);
        this.f207124b2 = new LinkedList<>();
        this.f207144i2 = "";
    }

    /* renamed from: H7 */
    public static final void m83977H7(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
        textStatusEditHalfScreenActivity.getClass();
        String string = textStatusEditHalfScreenActivity.getString((IStatusIconHelperKt.m39109a().mo62275E() || IStatusIconHelperKt.m39109a().mo62278H()) ? C0966R.string.mtx : C0966R.string.iur);
        C87412m.m108593f(string, "getString(stringRes)");
        textStatusEditHalfScreenActivity.mo98542E8(string);
    }

    /* renamed from: A8 */
    public final void mo98538A8(Bitmap bitmap) {
        C71468f1 f1Var = new C71468f1(bitmap, this);
        if (C87412m.m108589b(Looper.getMainLooper(), Looper.myLooper())) {
            f1Var.invoke();
        } else {
            mo98572e8().post(new C71465e1(f1Var));
        }
    }

    /* renamed from: B8 */
    public final void mo98539B8(ImageView imageView) {
        String str = mo98558Q7().f147238g.f147088e;
        boolean z = false;
        if (!(str == null || C112551y.m153811k(str))) {
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this, 8, C78318v1.class);
            if (v1Var != null) {
                if (!v1Var.f229506i.contains(str)) {
                    v1Var.f229506i.add(str);
                }
                C77459z zVar = this.f207113X0;
                if (zVar != null && zVar.f229404i == 5) {
                    z = true;
                }
                if (z || this.f207116Y0 == 2) {
                    v1Var.f229521y = v1Var.f229506i.size() > 1 ? 1 : 0;
                }
            }
            if (!IStatusIconHelperKt.m39109a().mo62275E() || !C87412m.m108589b(str, "userdefine")) {
                C39691c.m42340S(IStatusIconHelperKt.m39109a(), imageView, str, (C63347a.C47893d) null, (C63347a.C47891b) null, (C48201c) null, false, false, 124, (Object) null);
            } else {
                mo98547I8();
            }
        }
    }

    /* renamed from: C8 */
    public final void mo98540C8(int i) {
        if (i == 3) {
            TextView textView = this.f207180z;
            if (textView != null) {
                textView.setText(getContext().getString(C0966R.string.k28));
                return;
            }
            return;
        }
        TextView textView2 = this.f207180z;
        if (textView2 != null) {
            textView2.setText(getContext().getString(C0966R.string.k26));
        }
    }

    /* renamed from: D8 */
    public final boolean mo98541D8() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_TEXT_STATUS_EDUCATION_FLAG_INT;
        boolean z = i.mo119689j(aVar, 1) == 1;
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_TEXT_STATUS_NEW_TIPS_SHOW_BOOLEAN, false);
        if ((!z || g) && !this.f207061A1) {
            return false;
        }
        this.f207077I1 = true;
        View findViewById = findViewById(C0966R.C0970id.cdh);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(0);
        C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "showEducationLayout", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "showEducationLayout", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById(C0966R.C0970id.cdh).setBackground(new BitmapDrawable(getResources(), BitmapUtil.getBitmapNative(this.f207123b1)));
        C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this, 8, C78318v1.class);
        if (v1Var != null) {
            v1Var.f229477Q = 1;
        }
        C77448f0.m93396h();
        C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
        findViewById(C0966R.C0970id.cdg).setOnClickListener(new C71471g1(this));
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "show education");
        this.f207061A1 = false;
        return true;
    }

    /* renamed from: E8 */
    public final void mo98542E8(String str) {
        if (System.currentTimeMillis() - this.f207067D1 > this.f207069E1) {
            this.f207067D1 = System.currentTimeMillis();
            this.f207073G1 = C76912y0.m92769h(this, str, C0966R.raw.icons_outlined_info);
        }
    }

    /* renamed from: F8 */
    public final void mo98543F8() {
        Class cls = C78318v1.class;
        Class cls2 = C77049b.class;
        if (!this.f207147j2) {
            String obj = mo98563V7().getText().toString();
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context, 8, cls);
            if (v1Var != null) {
                v1Var.f229514s = (long) C45078p0.m49926e(obj, C45078p0.C45079a.MODE_CHINESE_AS_2);
                long j = 0;
                v1Var.f229469H = Util.isNullOrNil(mo98558Q7().f147248t) ? 0 : 1;
                v1Var.f229474M = C76252b.m91657a(mo98558Q7()) ? 1 : 0;
                if (!Util.isEqual(v1Var.f229489W, obj)) {
                    j = 1;
                }
                v1Var.f229519x = j;
            }
            AppCompatActivity context2 = getContext();
            C87412m.m108593f(context2, "context");
            C78318v1 v1Var2 = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context2, 8, cls);
            if (v1Var2 != null) {
                v1Var2.f229522y0 = mo98560S7();
                C78501d.f229945a.mo108459f(this.f207075H1, v1Var2);
            }
            this.f207147j2 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00a4, code lost:
        r1 = r1.getEffectManager();
     */
    /* renamed from: G8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98544G8() {
        /*
            r18 = this;
            r0 = r18
            uz2.u r1 = r18.mo98558Q7()
            boolean r1 = hz2.C76252b.m91657a(r1)
            java.lang.String r2 = "<get-ivBlurText>(...)"
            java.lang.String r3 = "<get-ivBlurSelect>(...)"
            java.lang.String r4 = "ivBlur"
            r6 = 8
            r7 = 0
            if (r1 == 0) goto L_0x00d2
            android.view.View r1 = r18.mo98566Y7()
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r14 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r8 = java.lang.Float.valueOf(r14)
            r15.mo10233c(r8)
            java.lang.Object[] r9 = r15.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r11 = "updateBlurStatus"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r16 = "setAlpha"
            java.lang.String r17 = "(F)V"
            r8 = r1
            r5 = 1065353216(0x3f800000, float:1.0)
            r14 = r16
            r5 = r15
            r15 = r17
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r5 = r5.mo10231a(r7)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r1.setAlpha(r5)
            java.lang.String r9 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r10 = "updateBlurStatus"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setAlpha"
            java.lang.String r14 = "(F)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.widget.ImageView r1 = r0.f207178y0
            if (r1 == 0) goto L_0x00cd
            r1.setVisibility(r6)
            rx3.g r1 = r0.f207092Q0
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            gy3.C87412m.m108593f(r1, r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setVisibility(r7)
            rx3.g r1 = r0.f207095R0
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            gy3.C87412m.m108593f(r1, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            androidx.appcompat.app.AppCompatActivity r2 = r18.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099940(0x7f060124, float:1.7812247E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            android.widget.ImageView r1 = r0.f207078J
            if (r1 != 0) goto L_0x009d
            goto L_0x00a0
        L_0x009d:
            r1.setVisibility(r6)
        L_0x00a0:
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r1 = r0.f207131e1
            if (r1 == 0) goto L_0x00af
            com.tencent.mm.xeffect.effect.EffectManager r1 = r1.getEffectManager()
            if (r1 == 0) goto L_0x00af
            rr3.b r5 = r1.mo154922b()
            goto L_0x00b0
        L_0x00af:
            r5 = 0
        L_0x00b0:
            if (r5 == 0) goto L_0x00b7
            r1 = 1084227584(0x40a00000, float:5.0)
            r5.mo162186d(r1)
        L_0x00b7:
            if (r5 == 0) goto L_0x00be
            r1 = 1065353216(0x3f800000, float:1.0)
            r5.mo162187e(r1)
        L_0x00be:
            android.graphics.Bitmap r1 = f207059m2
            if (r1 == 0) goto L_0x0177
            android.widget.ImageView r1 = r18.mo98572e8()
            android.graphics.Bitmap r2 = f207059m2
            r1.setImageBitmap(r2)
            goto L_0x0177
        L_0x00cd:
            gy3.C87412m.m108603p(r4)
            r1 = 0
            throw r1
        L_0x00d2:
            android.view.View r1 = r18.mo98566Y7()
            r5 = 1062836634(0x3f59999a, float:0.85)
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r15.mo10233c(r5)
            java.lang.Object[] r9 = r15.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r11 = "updateBlurStatus"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setAlpha"
            java.lang.String r5 = "(F)V"
            r8 = r1
            r6 = r15
            r15 = r5
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r5 = r6.mo10231a(r7)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r1.setAlpha(r5)
            java.lang.String r9 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r10 = "updateBlurStatus"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setAlpha"
            java.lang.String r14 = "(F)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.widget.ImageView r1 = r0.f207178y0
            if (r1 == 0) goto L_0x0178
            r1.setVisibility(r7)
            rx3.g r1 = r0.f207092Q0
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            gy3.C87412m.m108593f(r1, r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r3 = 8
            r1.setVisibility(r3)
            rx3.g r1 = r0.f207095R0
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            gy3.C87412m.m108593f(r1, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            androidx.appcompat.app.AppCompatActivity r2 = r18.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099702(0x7f060036, float:1.7811765E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            android.widget.ImageView r1 = r0.f207078J
            if (r1 != 0) goto L_0x0158
            goto L_0x015b
        L_0x0158:
            r1.setVisibility(r7)
        L_0x015b:
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r1 = r0.f207131e1
            if (r1 == 0) goto L_0x016a
            com.tencent.mm.xeffect.effect.EffectManager r1 = r1.getEffectManager()
            if (r1 == 0) goto L_0x016a
            rr3.i r2 = rr3.C110632i.BlurEffect
            r1.mo154936p(r2)
        L_0x016a:
            android.graphics.Bitmap r1 = r0.f207128d1
            if (r1 == 0) goto L_0x0177
            android.widget.ImageView r1 = r18.mo98572e8()
            android.graphics.Bitmap r2 = r0.f207128d1
            r1.setImageBitmap(r2)
        L_0x0177:
            return
        L_0x0178:
            gy3.C87412m.m108603p(r4)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity.mo98544G8():void");
    }

    /* renamed from: H8 */
    public final void mo98545H8() {
        mo98556O7().setEnabled(mo98604v8());
        if (mo98556O7().isEnabled()) {
            View W7 = mo98564W7();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = W7;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "updateFakeBtnOkVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            W7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "updateFakeBtnOkVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View W72 = mo98564W7();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view2 = W72;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "updateFakeBtnOkVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        W72.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "updateFakeBtnOkVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: I7 */
    public final void mo98546I7(int i, String str, String str2) {
        mo98548J7();
        C71459c P7 = mo98557P7();
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        String str3 = this.f207144i2;
        C87412m.m108594g(str3, "oriVideoFilePath");
        P7.mo98612b();
        C76252b.m91659c(P7.f207185a);
        P7.f207190f = false;
        P7.f207188d = i;
        P7.f207187c = str2;
        if (i == 1) {
            P7.f207192h = C86013q1.m106451l(str);
            P7.f207193i = C90193h.m112876d(str);
            String b = C78123i.f228932a.mo108105b(str);
            P7.f207186b = b;
            P7.f207189e = true;
            P7.f207194j = C86013q1.m106451l(b);
        } else if (i == 2) {
            if (!C112551y.m153811k(str3)) {
                P7.f207192h = C86013q1.m106451l(str3);
                P7.f207193i = C90193h.m112876d(str3);
            } else {
                P7.f207192h = C86013q1.m106451l(str);
                P7.f207193i = C90193h.m112876d(str);
            }
            P7.f207186b = str;
            P7.f207194j = C86013q1.m106451l(str);
            String str4 = P7.f207186b;
            if (str4 != null) {
                C63679m.C63680a M1 = ((C63679m) C86312j.m106911c(C63679m.class)).mo88483M1(str4);
                P7.f207191g = (M1 != null ? M1.f180528d : 0) / ((long) 1000);
            }
        }
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "[updateFromGallery] oriLen:" + P7.f207192h + " finalLen:" + P7.f207194j + " type:" + i);
        P7.mo98611a(context);
        mo98575i8(str, i);
        mo98544G8();
        mo98553L8();
        mo98545H8();
    }

    /* renamed from: I8 */
    public final void mo98547I8() {
        if (IStatusIconHelperKt.m39109a().mo62275E() && C87412m.m108589b(mo98558Q7().f147238g.f147088e, "userdefine")) {
            int i = this.f207140h1 ? C0966R.C0969drawable.ckk : C0966R.C0969drawable.ckl;
            ImageView imageView = this.f207142i;
            if (imageView != null) {
                imageView.setImageDrawable(getDrawable(i));
            }
        }
    }

    /* renamed from: J7 */
    public final void mo98548J7() {
        this.f207119Z0 = true;
        boolean z = false;
        C76252b.m91660d(mo98558Q7(), false);
        mo98557P7().mo98612b();
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
        if (v1Var != null) {
            C77459z zVar = this.f207113X0;
            if (zVar != null && zVar.f229404i == 5) {
                z = true;
            }
            if (z) {
                v1Var.f229523z = 1;
            }
            int i = this.f207116Y0;
            if (i == 1 || i == 2) {
                v1Var.f229523z = 1;
            }
        }
        C76252b.m91659c(mo98558Q7());
        mo98552L7();
        mo98608z8();
        C52678e0 e0Var = mo98558Q7().f147238g;
        C87412m.m108593f(e0Var, "curTextStatusExtInfo.topicInfo");
        mo98551K8(e0Var, (C52678e0) null);
        mo98553L8();
        mo98545H8();
        Object value = ((C36570n) this.f207062B).getValue();
        C87412m.m108593f(value, "<get-vPicBg>(...)");
        ((ImageView) value).setVisibility(8);
        C32224a<C13598b0> aVar = this.f207146j1;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: J8 */
    public final void mo98549J8() {
        String str = mo98558Q7().f147248t;
        if (!Util.isNullOrNil(str)) {
            mo98571d8().setText(str);
            mo98571d8().setVisibility(0);
            Object value = ((C36570n) this.f207168u).getValue();
            C87412m.m108593f(value, "<get-ivPoiSelected>(...)");
            ((ImageView) value).setVisibility(0);
            return;
        }
        mo98571d8().setVisibility(8);
        Object value2 = ((C36570n) this.f207168u).getValue();
        C87412m.m108593f(value2, "<get-ivPoiSelected>(...)");
        ((ImageView) value2).setVisibility(8);
    }

    /* renamed from: K7 */
    public final void mo98550K7() {
        C59600d dVar;
        StringBuilder sb = new StringBuilder();
        sb.append("destroyThirdBackManual() called thirdBack:");
        sb.append(this.f207074H);
        sb.append('@');
        C59600d dVar2 = this.f207074H;
        sb.append(dVar2 != null ? Integer.valueOf(dVar2.hashCode()) : null);
        sb.append(" stack:");
        sb.append(Util.getStack());
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", sb.toString());
        AppCompatActivity context = getContext();
        if ((context instanceof MMFragmentActivity) && (dVar = this.f207074H) != null) {
            C45413b.C45414a.m50358b(dVar, (MMFragmentActivity) context);
        }
        C59600d dVar3 = this.f207074H;
        if (dVar3 != null) {
            dVar3.onDestroy();
        }
        this.f207074H = null;
        this.f207141h2 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if ((r0 != null && r0.mo84146j()) != false) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* renamed from: K8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98551K8(uz2.C52678e0 r5, uz2.C52678e0 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = hz2.C60235a.m70504d(r5)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0016
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = 0
            goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            if (r0 != 0) goto L_0x003b
            qy2.i r0 = r4.mo98559R7()
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.mo107627s()
            if (r0 != r2) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x007d
            qy2.i r0 = r4.mo98559R7()
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.mo84146j()
            if (r0 != r2) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x007d
        L_0x003b:
            r0 = 0
            if (r6 == 0) goto L_0x0043
            java.lang.String r3 = hz2.C60235a.m70504d(r6)
            goto L_0x0044
        L_0x0043:
            r3 = r0
        L_0x0044:
            hz2.C60235a.m70509i(r5, r3)
            if (r6 == 0) goto L_0x004e
            java.lang.String r3 = hz2.C60235a.m70501a(r6)
            goto L_0x004f
        L_0x004e:
            r3 = r0
        L_0x004f:
            hz2.C60235a.m70506f(r5, r3)
            if (r6 == 0) goto L_0x0059
            java.lang.String r3 = hz2.C60235a.m70505e(r6)
            goto L_0x005a
        L_0x0059:
            r3 = r0
        L_0x005a:
            hz2.C60235a.m70510j(r5, r3)
            if (r6 == 0) goto L_0x0064
            java.lang.String r3 = hz2.C60235a.m70503c(r6)
            goto L_0x0065
        L_0x0064:
            r3 = r0
        L_0x0065:
            hz2.C60235a.m70508h(r5, r3)
            if (r6 == 0) goto L_0x006f
            java.util.LinkedList r3 = hz2.C60235a.m70502b(r6)
            goto L_0x0074
        L_0x006f:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
        L_0x0074:
            hz2.C60235a.m70507g(r5, r3)
            if (r6 == 0) goto L_0x007b
            java.lang.String r0 = r6.f147091h
        L_0x007b:
            r5.f147091h = r0
        L_0x007d:
            if (r6 == 0) goto L_0x0083
            java.util.LinkedList<uz2.a0> r6 = r6.f147090g
            if (r6 != 0) goto L_0x0088
        L_0x0083:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
        L_0x0088:
            r5.f147090g = r6
            java.lang.String r6 = hz2.C60235a.m70504d(r5)
            if (r6 == 0) goto L_0x0096
            boolean r6 = z04.C112551y.m153811k(r6)
            if (r6 == 0) goto L_0x0097
        L_0x0096:
            r1 = 1
        L_0x0097:
            if (r1 != 0) goto L_0x00aa
            java.util.LinkedList<uz2.a0> r6 = r5.f147090g
            int r6 = r6.size()
            if (r6 != 0) goto L_0x00aa
            java.util.LinkedList<uz2.a0> r6 = r5.f147090g
            java.util.LinkedList r5 = hz2.C60235a.m70502b(r5)
            r6.addAll(r5)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity.mo98551K8(uz2.e0, uz2.e0):void");
    }

    /* renamed from: L0 */
    public void mo4083L0(String str) {
        String string = getString(C0966R.string.ius);
        C87412m.m108593f(string, "getString(com.tencent.mm…text_status_invalid_more)");
        mo98542E8(string);
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
        if (v1Var != null) {
            v1Var.f229462A++;
        }
    }

    /* renamed from: L3 */
    public void mo4084L3(String str) {
        String string = getString(C0966R.string.iuq);
        C87412m.m108593f(string, "getString(com.tencent.mm…text_status_invalid_less)");
        mo98542E8(string);
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
        if (v1Var != null) {
            v1Var.f229463B++;
        }
    }

    /* renamed from: L7 */
    public final void mo98552L7() {
        C60695a player;
        C60695a player2;
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f207131e1;
        if (!(mMTPEffectVideoLayout == null || (player2 = mMTPEffectVideoLayout.getPlayer()) == null)) {
            player2.stopAsync();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.f207131e1;
        if (!(mMTPEffectVideoLayout2 == null || (player = mMTPEffectVideoLayout2.getPlayer()) == null)) {
            player.recycle();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout3 = this.f207131e1;
        if (mMTPEffectVideoLayout3 != null) {
            mMTPEffectVideoLayout3.mo81101g();
        }
        this.f207131e1 = null;
        FrameLayout frameLayout = this.f207068E;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0130, code lost:
        if ((r0 == null || z04.C112551y.m153811k(r0)) == false) goto L_0x0132;
     */
    /* renamed from: L8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98553L8() {
        /*
            r10 = this;
            uz2.u r0 = r10.mo98558Q7()
            uz2.e0 r0 = r0.f147238g
            java.lang.String r1 = "curTextStatusExtInfo.topicInfo"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r0 = hz2.C60235a.m70504d(r0)
            android.widget.FrameLayout r2 = r10.mo98568a8()
            r2.removeAllViews()
            qy2.i r2 = r10.mo98559R7()
            r3 = 0
            if (r2 == 0) goto L_0x0026
            android.widget.FrameLayout r4 = r10.mo98568a8()
            boolean r2 = r2.mo84150q(r4)
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            r10.f207132e2 = r2
            r2 = 1
            if (r0 == 0) goto L_0x0035
            boolean r4 = z04.C112551y.m153811k(r0)
            if (r4 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r4 = 0
            goto L_0x0036
        L_0x0035:
            r4 = 1
        L_0x0036:
            r5 = 1094713344(0x41400000, float:12.0)
            r6 = 8
            if (r4 != 0) goto L_0x005c
            boolean r4 = r10.f207132e2
            if (r4 != r2) goto L_0x005c
            android.widget.FrameLayout r4 = r10.mo98568a8()
            r4.setVisibility(r3)
            android.widget.FrameLayout r4 = r10.mo98568a8()
            int r7 = kg3.C76577a.m92150a(r10, r5)
            float r7 = (float) r7
            b03.c0 r8 = new b03.c0
            r8.<init>(r2, r2, r7)
            r4.setOutlineProvider(r8)
            r4.setClipToOutline(r2)
            goto L_0x0063
        L_0x005c:
            android.widget.FrameLayout r4 = r10.mo98568a8()
            r4.setVisibility(r6)
        L_0x0063:
            if (r0 == 0) goto L_0x006e
            boolean r4 = z04.C112551y.m153811k(r0)
            if (r4 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r4 = 0
            goto L_0x006f
        L_0x006e:
            r4 = 1
        L_0x006f:
            r7 = 0
            java.lang.String r8 = "<get-thirdContainerLl>(...)"
            if (r4 != 0) goto L_0x01c4
            rx3.g r4 = r10.f207098S0
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            gy3.C87412m.m108593f(r4, r8)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r4.setVisibility(r6)
            rx3.g r4 = r10.f207101T0
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.String r8 = "<get-thirdDescTv>(...)"
            gy3.C87412m.m108593f(r4, r8)
            android.widget.TextView r4 = (android.widget.TextView) r4
            uz2.u r8 = r10.mo98558Q7()
            uz2.e0 r8 = r8.f147238g
            gy3.C87412m.m108593f(r8, r1)
            java.lang.String r8 = hz2.C60235a.m70505e(r8)
            r4.setText(r8)
            android.widget.FrameLayout r4 = r10.mo98570c8()
            r4.setVisibility(r6)
            java.lang.Class<ox.b> r4 = p640ox.C77049b.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ox.b r4 = (p640ox.C77049b) r4
            androidx.appcompat.app.AppCompatActivity r8 = r10.getContext()
            java.lang.String r9 = "context"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.Class<uz2.v1> r9 = uz2.C78318v1.class
            pe3.a r4 = r4.Wi0(r8, r6, r9)
            uz2.v1 r4 = (uz2.C78318v1) r4
            if (r4 == 0) goto L_0x0136
            r4.f229515t = r0
            uz2.u r0 = r10.mo98558Q7()
            uz2.e0 r0 = r0.f147238g
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r0 = hz2.C60235a.m70501a(r0)
            r4.f229516u = r0
            uz2.u r0 = r10.mo98558Q7()
            uz2.e0 r0 = r0.f147238g
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r0 = hz2.C60235a.m70505e(r0)
            r4.f229517v = r0
            uz2.u r0 = r10.mo98558Q7()
            uz2.e0 r0 = r0.f147238g
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r0 = hz2.C60235a.m70503c(r0)
            r4.f229518w = r0
            uz2.u r0 = r10.mo98558Q7()
            java.lang.String r0 = r0.f147241j
            if (r0 == 0) goto L_0x0105
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            r0 = 0
            goto L_0x0106
        L_0x0105:
            r0 = 1
        L_0x0106:
            if (r0 == 0) goto L_0x0132
            uz2.u r0 = r10.mo98558Q7()
            java.lang.String r0 = r0.f147239h
            if (r0 == 0) goto L_0x0119
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x0117
            goto L_0x0119
        L_0x0117:
            r0 = 0
            goto L_0x011a
        L_0x0119:
            r0 = 1
        L_0x011a:
            if (r0 == 0) goto L_0x0132
            qy2.z r0 = r10.f207113X0
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r0.f229400e
            goto L_0x0124
        L_0x0123:
            r0 = r7
        L_0x0124:
            if (r0 == 0) goto L_0x012f
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r0 = 0
            goto L_0x0130
        L_0x012f:
            r0 = 1
        L_0x0130:
            if (r0 != 0) goto L_0x0136
        L_0x0132:
            r8 = 4
            r4.f229513r = r8
        L_0x0136:
            qy2.i r0 = r10.mo98559R7()
            android.widget.FrameLayout r4 = r10.mo98570c8()
            r4.removeAllViews()
            if (r0 == 0) goto L_0x014f
            android.widget.FrameLayout r4 = r10.mo98570c8()
            boolean r0 = r0.mo84851p(r4)
            if (r0 != r2) goto L_0x014f
            r0 = 1
            goto L_0x0150
        L_0x014f:
            r0 = 0
        L_0x0150:
            java.lang.String r4 = "<get-ivBrand>(...)"
            if (r0 == 0) goto L_0x016c
            android.widget.FrameLayout r0 = r10.mo98570c8()
            r0.setVisibility(r3)
            rx3.g r0 = r10.f207107V0
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            gy3.C87412m.m108593f(r0, r4)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setVisibility(r6)
            goto L_0x01d4
        L_0x016c:
            android.widget.FrameLayout r0 = r10.mo98570c8()
            r0.setVisibility(r6)
            uz2.u r0 = r10.mo98558Q7()
            uz2.e0 r0 = r0.f147238g
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r0 = hz2.C60235a.m70503c(r0)
            if (r0 == 0) goto L_0x018b
            boolean r8 = z04.C112551y.m153811k(r0)
            if (r8 == 0) goto L_0x0189
            goto L_0x018b
        L_0x0189:
            r8 = 0
            goto L_0x018c
        L_0x018b:
            r8 = 1
        L_0x018c:
            if (r8 != 0) goto L_0x01b3
            rx3.g r8 = r10.f207107V0
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            gy3.C87412m.m108593f(r8, r4)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8.setVisibility(r3)
            gc0.a r4 = gc0.C20828a.m22825b()
            r4.mo32518g(r0, r8)
            r0 = 1056964608(0x3f000000, float:0.5)
            b03.d0 r4 = new b03.d0
            r4.<init>(r0)
            r8.setOutlineProvider(r4)
            r8.setClipToOutline(r2)
            goto L_0x01d4
        L_0x01b3:
            rx3.g r0 = r10.f207107V0
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            gy3.C87412m.m108593f(r0, r4)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setVisibility(r6)
            goto L_0x01d4
        L_0x01c4:
            rx3.g r0 = r10.f207098S0
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            gy3.C87412m.m108593f(r0, r8)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setVisibility(r6)
        L_0x01d4:
            uz2.u r0 = r10.mo98558Q7()
            uz2.e0 r0 = r0.f147238g
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r0 = hz2.C60235a.m70504d(r0)
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$d r1 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$d
            uz2.u r4 = r10.mo98558Q7()
            uz2.e0 r4 = r4.f147238g
            java.util.LinkedList<uz2.a0> r4 = r4.f147090g
            r1.<init>(r0, r4)
            if (r0 == 0) goto L_0x01f9
            boolean r8 = z04.C112551y.m153811k(r0)
            if (r8 == 0) goto L_0x01f7
            goto L_0x01f9
        L_0x01f7:
            r8 = 0
            goto L_0x01fa
        L_0x01f9:
            r8 = 1
        L_0x01fa:
            if (r8 != 0) goto L_0x029b
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$d r6 = r10.f207141h2
            if (r6 == 0) goto L_0x0203
            java.lang.String r6 = r6.f82186a
            goto L_0x0204
        L_0x0203:
            r6 = r7
        L_0x0204:
            boolean r6 = gy3.C87412m.m108589b(r0, r6)
            if (r6 != 0) goto L_0x020b
            goto L_0x021b
        L_0x020b:
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$d r6 = r10.f207141h2
            if (r6 == 0) goto L_0x021b
            java.util.List<uz2.a0> r6 = r6.f82187b
            if (r6 == 0) goto L_0x021b
            boolean r6 = hz2.C60236c.m70511a(r6, r4)
            if (r6 != r2) goto L_0x021b
            r6 = 1
            goto L_0x021c
        L_0x021b:
            r6 = 0
        L_0x021c:
            if (r6 != 0) goto L_0x0271
            r10.mo98550K7()
            android.widget.FrameLayout r6 = r10.mo98567Z7()
            r6.removeAllViews()
            uz2.m r6 = new uz2.m
            r6.<init>()
            r6.f188445d = r3
            r6.f188446e = r3
            uz2.u r8 = r10.mo98558Q7()
            int r8 = r8.f147245q
            if (r8 == 0) goto L_0x023a
            goto L_0x023e
        L_0x023a:
            int r8 = eb0.C31543z5.m39455e()
        L_0x023e:
            r6.f188448g = r8
            if (r4 == 0) goto L_0x0247
            uz2.a0 r4 = xz2.C79020s.m95585a(r4)
            goto L_0x0248
        L_0x0247:
            r4 = r7
        L_0x0248:
            xz2.r r8 = xz2.C79019r.f232026a
            if (r4 == 0) goto L_0x024f
            java.lang.String r9 = r4.f188439d
            goto L_0x0250
        L_0x024f:
            r9 = r7
        L_0x0250:
            qy2.r r8 = r8.mo108986a(r9)
            if (r8 == 0) goto L_0x025e
            android.widget.FrameLayout r7 = r10.mo98567Z7()
            go3.d r7 = r8.mo84138IT(r0, r7, r4, r6)
        L_0x025e:
            androidx.appcompat.app.AppCompatActivity r0 = r10.getContext()
            boolean r4 = r0 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
            if (r4 == 0) goto L_0x026d
            if (r7 == 0) goto L_0x026d
            com.tencent.mm.ui.MMFragmentActivity r0 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r0
            dl3.C45413b.C45414a.m50357a(r7, r0)
        L_0x026d:
            r10.f207074H = r7
            r10.f207141h2 = r1
        L_0x0271:
            android.widget.FrameLayout r0 = r10.mo98567Z7()
            r0.setVisibility(r3)
            android.widget.FrameLayout r0 = r10.mo98567Z7()
            int r1 = kg3.C76577a.m92150a(r10, r5)
            float r1 = (float) r1
            b03.c0 r3 = new b03.c0
            r3.<init>(r2, r2, r1)
            r0.setOutlineProvider(r3)
            r0.setClipToOutline(r2)
            go3.d r0 = r10.f207074H
            if (r0 == 0) goto L_0x02ac
            boolean r1 = r0.f170310d
            if (r1 != 0) goto L_0x02ac
            r0.mo79964h()
            r0.mo79962f()
            goto L_0x02ac
        L_0x029b:
            r10.mo98550K7()
            android.widget.FrameLayout r0 = r10.mo98567Z7()
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r10.mo98567Z7()
            r0.setVisibility(r6)
        L_0x02ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity.mo98553L8():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:192:0x02b9, code lost:
        if ((r0 == null || r0.isEmpty()) == false) goto L_0x02bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x03e5  */
    /* renamed from: M7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98554M7() {
        /*
            r14 = this;
            r14.hideVKB()
            com.tencent.mm.ui.widget.MMEditText r0 = r14.mo98563V7()
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001c
            boolean r3 = z04.C112551y.m153811k(r0)
            if (r3 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r3 = 0
            goto L_0x001d
        L_0x001c:
            r3 = 1
        L_0x001d:
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0023
            r0 = r4
            goto L_0x0038
        L_0x0023:
            java.lang.String r3 = "(\r?\n(\\s*\r?\n)+)"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r0 = r3.matcher(r0)
            java.lang.String r3 = "\n\n"
            java.lang.String r0 = r0.replaceAll(r3)
            java.lang.String r3 = "m.replaceAll(\"\\n\\n\")"
            gy3.C87412m.m108593f(r0, r3)
        L_0x0038:
            boolean r3 = z04.C112551y.m153811k(r0)
            if (r3 == 0) goto L_0x0040
            r0 = r4
            goto L_0x0053
        L_0x0040:
            java.lang.String r3 = "^[\n]+|[\n]+$"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r0 = r3.matcher(r0)
            java.lang.String r0 = r0.replaceAll(r4)
            java.lang.String r3 = "m.replaceAll(\"\")"
            gy3.C87412m.m108593f(r0, r3)
        L_0x0053:
            int r3 = r14.f207099S1
            r5 = 3
            r6 = 0
            if (r3 != r5) goto L_0x005c
            java.util.LinkedList<java.lang.String> r3 = r14.f207124b2
            goto L_0x005d
        L_0x005c:
            r3 = r6
        L_0x005d:
            uz2.u1 r7 = new uz2.u1
            r7.<init>()
            java.lang.Class<ox.b> r8 = p640ox.C77049b.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ox.b r8 = (p640ox.C77049b) r8
            androidx.appcompat.app.AppCompatActivity r9 = r14.getContext()
            java.lang.String r10 = "context"
            gy3.C87412m.m108593f(r9, r10)
            r10 = 8
            java.lang.Class<uz2.v1> r11 = uz2.C78318v1.class
            pe3.a r8 = r8.Wi0(r9, r10, r11)
            uz2.v1 r8 = (uz2.C78318v1) r8
            if (r8 == 0) goto L_0x0083
            java.lang.String r8 = r8.f229500d
            r7.f229458q = r8
        L_0x0083:
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$c r8 = r14.mo98557P7()
            int r8 = r8.f207188d
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$c r9 = r14.mo98557P7()
            java.lang.String r9 = r9.f207186b
            if (r9 != 0) goto L_0x0092
            r9 = r4
        L_0x0092:
            r7.f229451g = r9
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$c r9 = r14.mo98557P7()
            java.lang.String r9 = r9.f207187c
            r7.f229452h = r9
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$c r9 = r14.mo98557P7()
            boolean r9 = r9.f207190f
            r7.f229450f = r9
            uz2.u r9 = r14.mo98558Q7()
            r9.f147237f = r8
            uz2.e0 r10 = r9.f147238g
            java.util.LinkedList<java.lang.String> r11 = r10.f147089f
            if (r11 == 0) goto L_0x00b3
            r11.clear()
        L_0x00b3:
            java.util.regex.Pattern r11 = b03.C39718p.f106570b
            java.util.regex.Matcher r11 = r11.matcher(r0)
        L_0x00b9:
            boolean r12 = r11.find()
            if (r12 == 0) goto L_0x00c9
            java.util.LinkedList<java.lang.String> r12 = r10.f147089f
            java.lang.String r13 = r11.group(r2)
            r12.add(r13)
            goto L_0x00b9
        L_0x00c9:
            java.lang.String r11 = r14.mo98560S7()
            r10.f147092i = r11
            b03.c r11 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            uz2.u r12 = r14.mo98558Q7()
            uz2.e0 r12 = r12.f147238g
            java.lang.String r12 = r12.f147088e
            uz2.d1 r11 = r11.mo62298j(r12)
            if (r11 == 0) goto L_0x00e4
            java.util.LinkedList<uz2.x> r11 = r11.f147083f
            goto L_0x00e5
        L_0x00e4:
            r11 = r6
        L_0x00e5:
            r10.f147093j = r11
            r9.f147243o = r1
            r9.f147231J = r0
            int r0 = r9.f147245q
            if (r0 != 0) goto L_0x00f5
            int r0 = eb0.C31543z5.m39455e()
            r9.f147245q = r0
        L_0x00f5:
            int r0 = r9.f147245q
            r10 = 86400(0x15180, float:1.21072E-40)
            int r0 = r0 + r10
            r9.f147246r = r0
            boolean r0 = r7.f229450f
            r10 = 2
            if (r0 == 0) goto L_0x010d
            b03.p r0 = b03.C39718p.f106569a
            int r8 = r14.f207123b1
            java.lang.String r0 = r0.mo62350a(r8)
            r9.f147252x = r0
            goto L_0x014c
        L_0x010d:
            int r0 = r9.f147250v
            if (r0 != 0) goto L_0x014c
            int r0 = r9.f147251w
            if (r0 != 0) goto L_0x014c
            if (r8 != r2) goto L_0x012a
            java.lang.String r0 = r7.f229451g
            android.graphics.BitmapFactory$Options r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r0)
            if (r0 == 0) goto L_0x0127
            int r8 = r0.outWidth
            r9.f147250v = r8
            int r0 = r0.outHeight
            r9.f147251w = r0
        L_0x0127:
            r9.f147252x = r6
            goto L_0x014c
        L_0x012a:
            if (r8 != r10) goto L_0x014c
            java.lang.Class<rw.m> r0 = p232rw.C63679m.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            rw.m r0 = (p232rw.C63679m) r0
            java.lang.String r8 = r7.f229451g
            java.lang.String r11 = "uploadFilePath"
            gy3.C87412m.m108593f(r8, r11)
            rw.m$a r0 = r0.mo88483M1(r8)
            if (r0 == 0) goto L_0x014a
            int r8 = r0.f180525a
            r9.f147250v = r8
            int r0 = r0.f180526b
            r9.f147251w = r0
        L_0x014a:
            r9.f147252x = r6
        L_0x014c:
            int r0 = r14.f207116Y0
            if (r0 != r10) goto L_0x016e
            az2.e r0 = az2.C39674e.f106452d
            qy2.z r8 = r14.f207113X0
            if (r8 == 0) goto L_0x0159
            java.lang.String r8 = r8.f229412t
            goto L_0x015a
        L_0x0159:
            r8 = r6
        L_0x015a:
            rz2.c r0 = r0.mo62253n0(r8)
            if (r0 == 0) goto L_0x0163
            java.lang.String r8 = r0.field_UserName
            goto L_0x0164
        L_0x0163:
            r8 = r6
        L_0x0164:
            r9.f147227F = r8
            if (r0 == 0) goto L_0x016b
            java.lang.String r0 = r0.field_StatusID
            goto L_0x016c
        L_0x016b:
            r0 = r6
        L_0x016c:
            r9.f147228G = r0
        L_0x016e:
            com.tencent.mm.emoji.view.EmojiStatusView r0 = r14.mo98562U7()
            com.tencent.mm.api.IEmojiInfo r0 = r0.getEmojiInfo()
            if (r0 == 0) goto L_0x021b
            uz2.s r0 = new uz2.s
            r0.<init>()
            com.tencent.mm.emoji.view.EmojiStatusView r8 = r14.mo98562U7()
            com.tencent.mm.api.IEmojiInfo r8 = r8.getEmojiInfo()
            xh.y1 r8 = (p749xh.C102678y1) r8
            com.tencent.mm.emoji.view.EmojiStatusView r11 = r14.mo98562U7()
            com.tencent.mm.api.IEmojiInfo r11 = r11.getEmojiInfo()
            if (r11 == 0) goto L_0x0197
            java.lang.String r11 = r11.getMd5()
            if (r11 != 0) goto L_0x0198
        L_0x0197:
            r11 = r4
        L_0x0198:
            r0.f147197d = r11
            if (r8 == 0) goto L_0x01a0
            java.lang.String r11 = r8.field_cdnUrl
            if (r11 != 0) goto L_0x01a1
        L_0x01a0:
            r11 = r4
        L_0x01a1:
            r0.f147198e = r11
            if (r8 == 0) goto L_0x01a9
            java.lang.String r11 = r8.field_thumbUrl
            if (r11 != 0) goto L_0x01aa
        L_0x01a9:
            r11 = r4
        L_0x01aa:
            r0.f147199f = r11
            if (r8 == 0) goto L_0x01b2
            java.lang.String r11 = r8.field_designerID
            if (r11 != 0) goto L_0x01b3
        L_0x01b2:
            r11 = r4
        L_0x01b3:
            r0.f147200g = r11
            if (r8 == 0) goto L_0x01bb
            java.lang.String r11 = r8.field_encrypturl
            if (r11 != 0) goto L_0x01bc
        L_0x01bb:
            r11 = r4
        L_0x01bc:
            r0.f147201h = r11
            if (r8 == 0) goto L_0x01c4
            java.lang.String r11 = r8.field_aeskey
            if (r11 != 0) goto L_0x01c5
        L_0x01c4:
            r11 = r4
        L_0x01c5:
            r0.f147202i = r11
            if (r8 == 0) goto L_0x01cd
            java.lang.String r11 = r8.field_groupId
            if (r11 != 0) goto L_0x01ce
        L_0x01cd:
            r11 = r4
        L_0x01ce:
            r0.f147203j = r11
            if (r8 == 0) goto L_0x01d6
            java.lang.String r11 = r8.field_externUrl
            if (r11 != 0) goto L_0x01d7
        L_0x01d6:
            r11 = r4
        L_0x01d7:
            r0.f147204n = r11
            if (r8 == 0) goto L_0x01df
            java.lang.String r11 = r8.field_externMd5
            if (r11 != 0) goto L_0x01e0
        L_0x01df:
            r11 = r4
        L_0x01e0:
            r0.f147205o = r11
            if (r8 == 0) goto L_0x01e8
            java.lang.String r11 = r8.field_activityid
            if (r11 != 0) goto L_0x01e9
        L_0x01e8:
            r11 = r4
        L_0x01e9:
            r0.f147206p = r11
            if (r8 == 0) goto L_0x01f1
            java.lang.String r11 = r8.field_attachedText
            if (r11 != 0) goto L_0x01f2
        L_0x01f1:
            r11 = r4
        L_0x01f2:
            r0.f147207q = r11
            if (r8 == 0) goto L_0x01fa
            java.lang.String r11 = r8.field_attachTextColor
            if (r11 != 0) goto L_0x01fb
        L_0x01fa:
            r11 = r4
        L_0x01fb:
            r0.f147208r = r11
            if (r8 == 0) goto L_0x0203
            java.lang.String r11 = r8.field_activityid
            if (r11 != 0) goto L_0x0204
        L_0x0203:
            r11 = r4
        L_0x0204:
            r0.f147206p = r11
            if (r8 == 0) goto L_0x020c
            java.lang.String r11 = r8.field_lensId
            if (r11 != 0) goto L_0x020d
        L_0x020c:
            r11 = r4
        L_0x020d:
            r0.f147209s = r11
            if (r8 == 0) goto L_0x0215
            java.lang.String r8 = r8.field_attr
            if (r8 != 0) goto L_0x0216
        L_0x0215:
            r8 = r4
        L_0x0216:
            r0.f147210t = r8
            r9.f147232K = r0
            goto L_0x021d
        L_0x021b:
            r9.f147232K = r6
        L_0x021d:
            boolean r0 = r14.mo98605w8()
            if (r0 == 0) goto L_0x0258
            java.util.ArrayList<java.lang.String> r0 = r14.f207111W1
            if (r0 == 0) goto L_0x0230
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x022e
            goto L_0x0230
        L_0x022e:
            r0 = 0
            goto L_0x0231
        L_0x0230:
            r0 = 1
        L_0x0231:
            if (r0 != 0) goto L_0x0258
            java.util.LinkedList<java.lang.Integer> r0 = r9.f147234M
            r0.clear()
            java.util.ArrayList<java.lang.String> r0 = r14.f207111W1
            java.util.Iterator r0 = r0.iterator()
        L_0x023e:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0258
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.LinkedList<java.lang.Integer> r11 = r9.f147234M
            int r8 = java.lang.Integer.parseInt(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.add(r8)
            goto L_0x023e
        L_0x0258:
            b03.c r0 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r0 = r0.mo62278H()
            if (r0 == 0) goto L_0x026c
            uz2.u r0 = r14.mo98558Q7()
            uz2.e0 r0 = r0.f147238g
            java.lang.String r8 = "1080"
            r0.f147088e = r8
        L_0x026c:
            uz2.u r0 = r14.mo98558Q7()
            uz2.e0 r0 = r0.f147238g
            int r8 = r14.f207181z1
            r0.f147099s = r8
            r7.f229448d = r9
            r7.f229449e = r3
            int r0 = r14.f207116Y0
            if (r0 != r2) goto L_0x029c
            boolean r0 = r14.f207129d2
            if (r0 == 0) goto L_0x0286
            r8 = 1
            r7.f229461t = r8
        L_0x0286:
            az2.e r0 = az2.C39674e.f106452d
            qy2.z r8 = r14.f207113X0
            if (r8 == 0) goto L_0x028f
            java.lang.String r8 = r8.f229412t
            goto L_0x0290
        L_0x028f:
            r8 = r6
        L_0x0290:
            rz2.c r0 = r0.mo62253n0(r8)
            if (r0 == 0) goto L_0x0299
            java.lang.String r0 = r0.field_StatusID
            goto L_0x029a
        L_0x0299:
            r0 = r6
        L_0x029a:
            r7.f229459r = r0
        L_0x029c:
            java.lang.String r0 = r7.f229459r
            if (r0 != 0) goto L_0x02a1
            r0 = r4
        L_0x02a1:
            r7.f229459r = r0
            if (r3 == 0) goto L_0x02ab
            int r0 = r3.size()
            if (r0 > 0) goto L_0x02bb
        L_0x02ab:
            java.util.ArrayList<java.lang.String> r0 = r14.f207111W1
            if (r0 == 0) goto L_0x02b8
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02b6
            goto L_0x02b8
        L_0x02b6:
            r0 = 0
            goto L_0x02b9
        L_0x02b8:
            r0 = 1
        L_0x02b9:
            if (r0 != 0) goto L_0x031b
        L_0x02bb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x031b }
            r0.<init>()     // Catch:{ all -> 0x031b }
            boolean r3 = r14.mo98605w8()     // Catch:{ all -> 0x031b }
            java.lang.String r8 = ","
            if (r3 == 0) goto L_0x02d3
            java.lang.String r3 = "mLabelIdListString"
            java.util.ArrayList<java.lang.String> r9 = r14.f207111W1     // Catch:{ all -> 0x031b }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r9, r8)     // Catch:{ all -> 0x031b }
            r0.put(r3, r9)     // Catch:{ all -> 0x031b }
        L_0x02d3:
            java.lang.String r3 = "mLabelRangeindex"
            int r9 = r14.f207099S1     // Catch:{ all -> 0x031b }
            r0.put(r3, r9)     // Catch:{ all -> 0x031b }
            java.lang.String r3 = "mLabelNameList"
            java.lang.String r9 = r14.f207102T1     // Catch:{ all -> 0x031b }
            r0.put(r3, r9)     // Catch:{ all -> 0x031b }
            java.lang.String r3 = "mOtherUserNameList"
            java.lang.String r9 = r14.f207105U1     // Catch:{ all -> 0x031b }
            r0.put(r3, r9)     // Catch:{ all -> 0x031b }
            java.lang.String r3 = "mChatRoomNameList"
            java.lang.String r9 = r14.f207108V1     // Catch:{ all -> 0x031b }
            r0.put(r3, r9)     // Catch:{ all -> 0x031b }
            java.lang.String r3 = "MicroMsg.TextStatus.TextStatusEditHalfScreenActivity"
            java.lang.String r9 = "getVisibilityInfo: mLabelIdListString:%s ,mLabelRangeindex:%s ,mLabelNameList:%s,mOtherUserNameList:%s,mChatRoomNameList:%s"
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ all -> 0x031b }
            java.util.ArrayList<java.lang.String> r12 = r14.f207111W1     // Catch:{ all -> 0x031b }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r12, r8)     // Catch:{ all -> 0x031b }
            r11[r1] = r8     // Catch:{ all -> 0x031b }
            int r8 = r14.f207099S1     // Catch:{ all -> 0x031b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x031b }
            r11[r2] = r8     // Catch:{ all -> 0x031b }
            java.lang.String r8 = r14.f207102T1     // Catch:{ all -> 0x031b }
            r11[r10] = r8     // Catch:{ all -> 0x031b }
            java.lang.String r8 = r14.f207105U1     // Catch:{ all -> 0x031b }
            r11[r5] = r8     // Catch:{ all -> 0x031b }
            r5 = 4
            java.lang.String r8 = r14.f207108V1     // Catch:{ all -> 0x031b }
            r11[r5] = r8     // Catch:{ all -> 0x031b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r11)     // Catch:{ all -> 0x031b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x031b }
            goto L_0x031c
        L_0x031b:
            r0 = r6
        L_0x031c:
            r7.f229460s = r0
            zt3.t r0 = zt3.C119157j.f356862d
            tz2.h r3 = new tz2.h
            r3.<init>(r7)
            zt3.j r0 = (zt3.C119157j) r0
            java.lang.String r5 = "MicroMsg.TextStatus.UploadPackHelper"
            r0.mo183876g(r3, r5)
            qy2.z r0 = r14.f207113X0
            if (r0 == 0) goto L_0x033a
            long r7 = r0.f229404i
            r11 = 5
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x033a
            r3 = 1
            goto L_0x033b
        L_0x033a:
            r3 = 0
        L_0x033b:
            if (r3 != 0) goto L_0x0341
            int r3 = r14.f207116Y0
            if (r3 != r10) goto L_0x0359
        L_0x0341:
            if (r0 == 0) goto L_0x0348
            boolean r0 = r0.f229414v
            if (r0 != r2) goto L_0x0348
            r1 = 1
        L_0x0348:
            if (r1 != 0) goto L_0x0359
            r0 = 2131821686(0x7f110476, float:1.9276122E38)
            java.lang.String r0 = r14.getString(r0)
            java.lang.String r1 = "getString(com.tencent.mm…R.string.app_set_success)"
            gy3.C87412m.m108593f(r0, r1)
            r14.mo98542E8(r0)
        L_0x0359:
            b03.c r0 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r0 = r0.mo62275E()
            if (r0 == 0) goto L_0x038b
            kr0.m0 r0 = r14.f207167t1
            if (r0 == 0) goto L_0x038b
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = r14.f207169u1
            uz2.u r5 = r14.mo98558Q7()
            uz2.e0 r5 = r5.f147238g
            java.lang.String r5 = r5.f147088e
            r1.put(r3, r5)
            java.lang.String r3 = r14.f207171v1
            long r7 = eb0.C31543z5.m39453c()
            r1.put(r3, r7)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            com.tencent.mm.plugin.appbrand.h2 r0 = (com.tencent.p014mm.plugin.appbrand.C81895h2) r0
            java.lang.String r3 = "onPostTextStatus"
            r0.mo114295h0(r3, r1)
        L_0x038b:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            uz2.p r1 = new uz2.p
            r1.<init>()
            uz2.u r3 = r14.mo98558Q7()
            uz2.e0 r3 = r3.f147238g
            java.lang.String r3 = r3.f147088e
            r1.f188456e = r3
            android.widget.TextView r3 = r14.f207136g
            if (r3 == 0) goto L_0x03b1
            java.lang.CharSequence r3 = r3.getText()
            if (r3 == 0) goto L_0x03b1
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x03b0
            goto L_0x03b1
        L_0x03b0:
            r4 = r3
        L_0x03b1:
            r1.f188455d = r4
            qy2.i r3 = r14.mo98559R7()
            if (r3 == 0) goto L_0x03be
            qy2.o r3 = r3.mo107626r()
            goto L_0x03bf
        L_0x03be:
            r3 = r6
        L_0x03bf:
            if (r3 == 0) goto L_0x03c5
            java.lang.String r6 = r3.mo90550g()
        L_0x03c5:
            r1.f188457f = r6
            if (r3 == 0) goto L_0x03cc
            r3.mo90548e(r1)
        L_0x03cc:
            byte[] r1 = r1.toByteArray()
            java.lang.String r3 = "select_status_info"
            r0.putExtra(r3, r1)
            r1 = -1
            r14.setResult(r1, r0)
            rx3.g r3 = r14.f207110W0
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.os.ResultReceiver r3 = (android.os.ResultReceiver) r3
            if (r3 == 0) goto L_0x03ec
            android.os.Bundle r0 = r0.getExtras()
            r3.send(r1, r0)
        L_0x03ec:
            r14.f207075H1 = r2
            r14.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity.mo98554M7():void");
    }

    /* renamed from: N7 */
    public final String mo98555N7(String str) {
        String str2 = ((C99015i) C86312j.m106911c(C99015i.class)).mo61936iU() + C86013q1.m106456q(str);
        C89231c cVar = new C89231c();
        try {
            cVar.setDataSource(str);
            Bitmap frameAtTime = cVar.getFrameAtTime(0);
            if (frameAtTime == null) {
                Log.m105920e("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "get bitmap error");
                try {
                    cVar.release();
                } catch (Exception unused) {
                }
                return "";
            }
            Log.m105925i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "getBitmap1 %d %d", Integer.valueOf(frameAtTime.getWidth()), Integer.valueOf(frameAtTime.getHeight()));
            BitmapUtil.saveBitmapToImage(frameAtTime, 80, Bitmap.CompressFormat.JPEG, str2, true);
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str2);
            Log.m105925i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "getBitmap2 %d %d", Integer.valueOf(imageOptions.outWidth), Integer.valueOf(imageOptions.outHeight));
            try {
                cVar.release();
            } catch (Exception unused2) {
            }
            return str2;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "savebitmap error %s", e.getMessage());
        } catch (Throwable th) {
            try {
                cVar.release();
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* renamed from: O7 */
    public final View mo98556O7() {
        View view = this.f207106V;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("btnOk");
        throw null;
    }

    /* renamed from: P4 */
    public void mo4086P4(String str) {
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "Set New textStatus : " + Util.secPrint(str));
        if (mo98557P7().f207189e) {
            this.f207151l2 = C76879j.m92723Q(this, getString(C0966R.string.f361143hn1), getString(C0966R.string.f361143hn1), false, false, (DialogInterface.OnCancelListener) null);
            ((C119157j) C119157j.f356862d).mo183875f(new C71478i(this));
            return;
        }
        mo98554M7();
    }

    /* renamed from: P7 */
    public final C71459c mo98557P7() {
        C71459c cVar = this.f207149k2;
        if (cVar != null) {
            return cVar;
        }
        C87412m.m108603p("curLocalMediaStruct");
        throw null;
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        Log.m105918d("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "onKeyboardHeightChanged " + i + ", " + z);
        boolean z2 = true;
        if (this.f207134f1 < 1) {
            z2 = false;
        }
        if (!z2) {
            mo98576j8(i);
        }
    }

    /* renamed from: Q7 */
    public final C52718u mo98558Q7() {
        C52718u uVar = this.f207121a1;
        if (uVar != null) {
            return uVar;
        }
        C87412m.m108603p("curTextStatusExtInfo");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if ((r1 != null && yz2.C79224c.m95929a(r1, r0)) == false) goto L_0x000c;
     */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final qy2.C77452i mo98559R7() {
        /*
            r6 = this;
            uz2.u r0 = r6.mo98558Q7()
            uz2.e0 r0 = r0.f147238g
            qy2.i r1 = r6.f207135f2
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x000e
        L_0x000c:
            r2 = 0
            goto L_0x001e
        L_0x000e:
            uz2.e0 r1 = r6.f207138g2
            if (r1 == 0) goto L_0x001a
            boolean r1 = yz2.C79224c.m95929a(r1, r0)
            if (r1 != r2) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r1 != 0) goto L_0x001e
            goto L_0x000c
        L_0x001e:
            if (r2 != 0) goto L_0x0085
            qy2.i r1 = r6.f207135f2
            if (r1 == 0) goto L_0x0027
            r1.mo84148n()
        L_0x0027:
            r1 = 0
            r6.f207135f2 = r1
            r6.f207138g2 = r1
            xz2.r r2 = xz2.C79019r.f232026a     // Catch:{ all -> 0x0034 }
            xz2.o r2 = new xz2.o     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            goto L_0x003f
        L_0x0034:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "MicroMsg.TextStatus.TextStatusEditHalfScreenActivity"
            java.lang.String r5 = "customps err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r2, r5, r3)
            r2 = r1
        L_0x003f:
            r6.f207135f2 = r2
            if (r2 == 0) goto L_0x0054
            if (r0 == 0) goto L_0x004a
            java.util.LinkedList r3 = hz2.C60235a.m70502b(r0)
            goto L_0x004b
        L_0x004a:
            r3 = r1
        L_0x004b:
            if (r0 == 0) goto L_0x0050
            java.util.LinkedList<uz2.a0> r4 = r0.f147090g
            goto L_0x0051
        L_0x0050:
            r4 = r1
        L_0x0051:
            r2.mo107628t(r1, r3, r4)
        L_0x0054:
            uz2.e0 r2 = new uz2.e0
            r2.<init>()
            if (r0 == 0) goto L_0x005f
            java.lang.String r1 = hz2.C60235a.m70504d(r0)
        L_0x005f:
            hz2.C60235a.m70509i(r2, r1)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            if (r0 == 0) goto L_0x0070
            java.util.LinkedList<uz2.a0> r3 = r0.f147090g
            if (r3 == 0) goto L_0x0070
            r1.addAll(r3)
        L_0x0070:
            r2.f147090g = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            if (r0 == 0) goto L_0x0080
            java.util.LinkedList r0 = hz2.C60235a.m70502b(r0)
            r1.addAll(r0)
        L_0x0080:
            hz2.C60235a.m70507g(r2, r1)
            r6.f207138g2 = r2
        L_0x0085:
            qy2.i r0 = r6.f207135f2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity.mo98559R7():qy2.i");
    }

    /* renamed from: S7 */
    public final String mo98560S7() {
        TextView textView;
        CharSequence text;
        if (!C87412m.m108589b(mo98558Q7().f147238g.f147088e, "userdefine") || (textView = this.f207136g) == null || (text = textView.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    /* renamed from: T7 */
    public final View mo98561T7() {
        Object value = ((C36570n) this.f207118Z).getValue();
        C87412m.m108593f(value, "<get-emojiStatusIconLayout>(...)");
        return (View) value;
    }

    /* renamed from: U7 */
    public final EmojiStatusView mo98562U7() {
        Object value = this.f207082L.getValue();
        C87412m.m108593f(value, "<get-emojiView>(...)");
        return (EmojiStatusView) value;
    }

    /* renamed from: V7 */
    public final MMEditText mo98563V7() {
        MMEditText mMEditText = this.f207172w;
        if (mMEditText != null) {
            return mMEditText;
        }
        C87412m.m108603p("etDesc");
        throw null;
    }

    /* renamed from: W7 */
    public final View mo98564W7() {
        Object value = ((C36570n) this.f207109W).getValue();
        C87412m.m108593f(value, "<get-fakeBtnOk>(...)");
        return (View) value;
    }

    /* renamed from: X7 */
    public final WeImageView mo98565X7() {
        Object value = ((C36570n) this.f207158p0).getValue();
        C87412m.m108593f(value, "<get-ivIconEditArrow>(...)");
        return (WeImageView) value;
    }

    /* renamed from: Y7 */
    public final View mo98566Y7() {
        View view = this.f207175x0;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("layoutBlurOption");
        throw null;
    }

    /* renamed from: Z7 */
    public final FrameLayout mo98567Z7() {
        Object value = ((C36570n) this.f207070F).getValue();
        C87412m.m108593f(value, "<get-layoutThirdContainer>(...)");
        return (FrameLayout) value;
    }

    /* renamed from: a8 */
    public final FrameLayout mo98568a8() {
        Object value = ((C36570n) this.f207072G).getValue();
        C87412m.m108593f(value, "<get-layoutThirdThumb>(...)");
        return (FrameLayout) value;
    }

    /* renamed from: b8 */
    public final C78318v1 mo98569b8() {
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        return (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
    }

    /* renamed from: c8 */
    public final FrameLayout mo98570c8() {
        Object value = ((C36570n) this.f207104U0).getValue();
        C87412m.m108593f(value, "<get-thirdIconContainerFl>(...)");
        return (FrameLayout) value;
    }

    /* renamed from: d8 */
    public final TextView mo98571d8() {
        Object value = this.f207177y.getValue();
        C87412m.m108593f(value, "<get-tvPoi>(...)");
        return (TextView) value;
    }

    /* renamed from: e8 */
    public final ImageView mo98572e8() {
        Object value = this.f207060A.getValue();
        C87412m.m108593f(value, "<get-vPic>(...)");
        return (ImageView) value;
    }

    /* renamed from: f8 */
    public final void mo98573f8() {
        Class cls = C101488s.class;
        if (((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.CAMERA", 18, "", "")) {
            new SightParams(1, 0);
            String a = C98426q0.m127793a(C13781a.m13082a());
            C87412m.m108593f(a, "genFileName(Account.username())");
            String q = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(a);
            String r = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137729r(a);
            C103107b bVar = C103107b.f304215b;
            RecordConfigProvider f = RecordConfigProvider.m119436f(q, r, ((C103107b.C103108a) bVar.mo138761d()).f304231p, ((C103107b.C103108a) bVar.mo138761d()).f304231p.f267170h * 1000, 15);
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_c2c_ignore_remux_without_edit, false)) {
                f.f272919d = 2;
            }
            UICustomParam uICustomParam = new UICustomParam();
            ((HashMap) uICustomParam.f266575h).put("plugin_filter", Boolean.TRUE);
            ((HashMap) uICustomParam.f266575h).put("plugin_poi", true);
            ((HashMap) uICustomParam.f266575h).put("plugin_tip", true);
            ((HashMap) uICustomParam.f266575h).put("plugin_menu", true);
            f.f272927o = uICustomParam;
            f.f272934v = Boolean.FALSE;
            f.f272910K = false;
            f.f272911L = false;
            f.f272913N = true;
            f.f272930r = Boolean.TRUE;
            f.f272929q = 4;
            f.mo129804a(2, "com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout");
            f.mo129804a(1, "com.tencent.mm.plugin.textstatus.ui.TextStatusEditPhotoPluginLayout");
            f.mo129804a(0, "com.tencent.mm.plugin.textstatus.ui.TextStatusRecordPluginLayout");
            C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C71494n(this, f, this, (C15601d<? super C71494n>) null), 3, (Object) null);
        }
    }

    public void finish() {
        boolean z;
        if (!this.f207075H1) {
            if (isFragmentMode()) {
                if (!this.f207065C1 && mo98579m8()) {
                    mo98581o8();
                    C77426q qVar = new C77426q(this);
                    qVar.mo107595g(getString(C0966R.string.f361458mu3));
                    z = true;
                    qVar.mo107589a(true);
                    qVar.mo107602n(getString(C0966R.string.mu4));
                    qVar.mo107590b(new C79231d2(this));
                    qVar.mo107603o();
                } else {
                    z = false;
                }
                if (!z) {
                    hideVKB();
                    mo98543F8();
                    super.finish();
                }
            }
            ResultReceiver resultReceiver = (ResultReceiver) ((C36570n) this.f207110W0).getValue();
            if (resultReceiver != null) {
                resultReceiver.send(0, (Bundle) null);
                return;
            }
            return;
        }
        hideVKB();
        mo98543F8();
        super.finish();
    }

    /* renamed from: g8 */
    public final void mo98574g8(IEmojiInfo iEmojiInfo) {
        String str;
        this.f207088O1 = C30501b.BIG_EMOJI;
        Object value = ((C36570n) this.f207084M).getValue();
        C87412m.m108593f(value, "<get-layoutEmojiView>(...)");
        View view = (View) value;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "switchEditContent", "(Lcom/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$EditContentType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "switchEditContent", "(Lcom/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$EditContentType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo98545H8();
        mo98562U7().setEmojiInfo(iEmojiInfo);
        if (IStatusIconHelperKt.m39109a().mo62278H()) {
            mo98545H8();
        }
        C78318v1 b8 = mo98569b8();
        if (b8 != null) {
            if (iEmojiInfo == null || (str = iEmojiInfo.getMd5()) == null) {
                str = "";
            }
            b8.f229490W0 = str;
        }
        Object value2 = ((C36570n) this.f207174x).getValue();
        C87412m.m108593f(value2, "<get-scrollview>(...)");
        ((NestedScrollView) value2).postDelayed(new C71497o(this), 100);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d0k;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        Log.m105918d("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "onInputPanelChange " + z + ", " + i);
        boolean z2 = true;
        if (this.f207134f1 < 1) {
            z2 = false;
        }
        if (z2) {
            if (!z) {
                i = 0;
            }
            this.f207179y1 = z;
            mo98576j8(i);
        }
    }

    /* renamed from: i8 */
    public final void mo98575i8(String str, int i) {
        String str2;
        String str3 = str;
        boolean z = false;
        if (!(str3 == null || C112551y.m153811k(str))) {
            View Y7 = mo98566Y7();
            int i2 = ((this.f207116Y0 != 2 || this.f207119Z0) && !this.f207132e2 && !C76252b.m91658b(mo98558Q7())) ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            C117292a.m165358d(Y7, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "handleFileLocal", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Y7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(Y7, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "handleFileLocal", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i == 2) {
                Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "handle video file");
                mo98572e8().setVisibility(8);
                FrameLayout frameLayout = this.f207068E;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                View view = this.f207066D;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view != null ? view.getMeasuredWidth() : 0, -1);
                layoutParams.gravity = 17;
                MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f207131e1;
                if (mMTPEffectVideoLayout == null) {
                    AppCompatActivity context = getContext();
                    C87412m.m108593f(context, "context");
                    this.f207131e1 = new MMTPEffectVideoLayout(context);
                } else if (mMTPEffectVideoLayout != null) {
                    mMTPEffectVideoLayout.mo81101g();
                }
                MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.f207131e1;
                if (mMTPEffectVideoLayout2 != null) {
                    FrameLayout frameLayout2 = this.f207068E;
                    if (frameLayout2 != null) {
                        frameLayout2.removeAllViews();
                    }
                    FrameLayout frameLayout3 = this.f207068E;
                    if (frameLayout3 != null) {
                        frameLayout3.addView(mMTPEffectVideoLayout2, layoutParams);
                    }
                    FrameLayout frameLayout4 = this.f207068E;
                    if (frameLayout4 != null) {
                        frameLayout4.setVisibility(0);
                    }
                    boolean k = C86013q1.m106450k(str);
                    if (!k) {
                        byte[] bytes = str3.getBytes(C119027c.f356488a);
                        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                        str2 = C90193h.m112878f(bytes);
                    } else {
                        str2 = "";
                    }
                    String str4 = !k ? str3 : "";
                    if (!k) {
                        str3 = C39696f.f106501a.mo62321d("video_online", str3);
                    }
                    C58010a aVar2 = new C58010a(str2, str3, str4, mo98558Q7().f147250v, mo98558Q7().f147251w);
                    if (k) {
                        C63679m.C63680a M1 = ((C63679m) C86312j.m106911c(C63679m.class)).mo88483M1(str3);
                        aVar2.f165950v = M1 != null ? M1.f180525a : 0;
                        aVar2.f165951w = M1 != null ? M1.f180526b : 0;
                        aVar2.f165935g = M1 != null ? M1.f180528d : 0;
                        aVar2.f165939k = M1 != null ? M1.f180530f : 0;
                    }
                    aVar2.f165933e = k;
                    Log.m105925i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "[play] isLocal:%s, videoWidth:%s, videoHeight:%s rotate:%s", Boolean.valueOf(k), Integer.valueOf(aVar2.f165950v), Integer.valueOf(aVar2.f165951w), Integer.valueOf(aVar2.f165939k));
                    mMTPEffectVideoLayout2.mo81100f();
                    mMTPEffectVideoLayout2.setMediaInfo(aVar2);
                    C60695a player = mMTPEffectVideoLayout2.getPlayer();
                    if (player != null) {
                        player.mo85614i(true);
                    }
                    C60695a player2 = mMTPEffectVideoLayout2.getPlayer();
                    if (player2 != null) {
                        player2.setLoop(true);
                    }
                    mMTPEffectVideoLayout2.getEffectManager().mo154924d();
                    this.f207131e1 = mMTPEffectVideoLayout2;
                    try {
                        C60695a player3 = mMTPEffectVideoLayout2.getPlayer();
                        if (player3 != null) {
                            player3.mo85619m();
                        }
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "unable to play video! mediaInfo:" + aVar2 + " error:" + e.getLocalizedMessage());
                        FrameLayout frameLayout5 = this.f207068E;
                        if (frameLayout5 != null) {
                            frameLayout5.setVisibility(8);
                        }
                    }
                    FrameLayout frameLayout6 = this.f207068E;
                    float a = (float) C76577a.m92150a(this, 12.0f);
                    boolean z2 = true & true;
                    if (true && true) {
                        z = true;
                    }
                    if (frameLayout6 != null) {
                        frameLayout6.setOutlineProvider(new C39693c0(z2, z, a));
                    }
                    if (frameLayout6 != null) {
                        frameLayout6.setClipToOutline(true);
                    }
                    mo98544G8();
                    return;
                }
                return;
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C71500p(str3, this));
        }
    }

    /* renamed from: j4 */
    public void mo96589j4(Runnable runnable) {
        C87412m.m108594g(runnable, "callback");
        this.f207137g1 = runnable;
    }

    /* renamed from: j8 */
    public final void mo98576j8(int i) {
        boolean z = true;
        if (this.f207134f1 < 1) {
            z = false;
        }
        if (z) {
            Object value = ((C36570n) this.f207155o).getValue();
            C87412m.m108593f(value, "<get-vEmojiPanelBack>(...)");
            ViewGroup.LayoutParams layoutParams = ((View) value).getLayoutParams();
            layoutParams.height = i;
            Object value2 = ((C36570n) this.f207155o).getValue();
            C87412m.m108593f(value2, "<get-vEmojiPanelBack>(...)");
            ((View) value2).setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = mo98562U7().getLayoutParams();
            int h = i > 0 ? C76577a.m92157h(this, C0966R.dimen.aqv) : C76577a.m92157h(this, C0966R.dimen.aqu);
            layoutParams2.width = h;
            layoutParams2.height = h;
            mo98562U7().setLayoutParams(layoutParams2);
        }
        if (i > 0) {
            int c = i - C74942w4.m89786c(getContext(), C0966R.dimen.f3736cp);
            View view = this.f207091Q;
            if (view != null) {
                view.setTranslationY(Math.min((float) (-c), 0.0f));
            }
            Object value3 = ((C36570n) this.f207080K).getValue();
            C87412m.m108593f(value3, "<get-layoutShow>(...)");
            ViewGroup viewGroup = (ViewGroup) value3;
            ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin = i;
            viewGroup.setLayoutParams(layoutParams4);
            C32226l<? super Integer, C13598b0> lVar = this.f207148k1;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(i));
                return;
            }
            return;
        }
        getWindow().setNavigationBarColor(getResources().getColor(C0966R.color.f2949a6));
        Object value4 = ((C36570n) this.f207080K).getValue();
        C87412m.m108593f(value4, "<get-layoutShow>(...)");
        ((ViewGroup) value4).setTranslationY(0.0f);
        View view2 = this.f207091Q;
        if (view2 != null) {
            view2.setTranslationY(0.0f);
        }
        Object value5 = ((C36570n) this.f207080K).getValue();
        C87412m.m108593f(value5, "<get-layoutShow>(...)");
        ViewGroup viewGroup2 = (ViewGroup) value5;
        ViewGroup.LayoutParams layoutParams5 = viewGroup2.getLayoutParams();
        C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.bottomMargin = C74942w4.m89786c(getContext(), C0966R.dimen.avw);
        viewGroup2.setLayoutParams(layoutParams6);
    }

    /* renamed from: k8 */
    public final void mo98577k8(String str, C71455a aVar) {
        mo98608z8();
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "trydownload imgback:" + str);
        this.f207096R1 = new C71503q(str, this, aVar);
        ((C76057w) C86312j.m106911c(C76057w.class)).h60(str, this.f207096R1);
        this.f207093Q1 = str;
    }

    /* renamed from: l8 */
    public final boolean mo98578l8() {
        C71459c P7 = mo98557P7();
        return (!P7.f207190f && !TextUtils.isEmpty(P7.f207186b)) || this.f207074H != null;
    }

    /* renamed from: m8 */
    public final boolean mo98579m8() {
        if (!mo98578l8()) {
            Editable text = mo98563V7().getText();
            if (text == null || C112551y.m153811k(text)) {
                CharSequence text2 = mo98571d8().getText();
                if (((text2 == null || text2.length() == 0) || mo98571d8().getVisibility() != 0) && (mo98562U7().getVisibility() != 0 || mo98562U7().getEmojiInfo() == null)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: n8 */
    public final void mo98580n8(boolean z) {
        View view;
        if (IStatusIconHelperKt.m39109a().mo62275E()) {
            Log.m105925i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "hideEmojiPanel: isSelectStatusIconMode:%s stack:%s", Boolean.valueOf(this.f207140h1), Util.getStack());
            C76628m0 m0Var = this.f207167t1;
            if (m0Var != null && (view = ((C81895h2) m0Var).getView()) != null && this.f207140h1) {
                this.f207140h1 = false;
                mo98563V7().setCursorVisible(true);
                mo98547I8();
                if (!(mo98565X7().getRotation() == 90.0f)) {
                    ObjectAnimator.ofFloat(mo98565X7(), "rotation", new float[]{-90.0f, 90.0f}).setDuration(300).start();
                }
                mo98565X7().setIconColor(view.getResources().getColor(C0966R.color.f2929c));
                mo98561T7().setBackground((TransitionDrawable) ((C36570n) this.f207176x1).getValue());
                ((TransitionDrawable) ((C36570n) this.f207176x1).getValue()).reverseTransition(300);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, (float) view.getHeight()});
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(150);
                ofFloat.start();
                TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent = this.f207133f;
                if (textStatusEmojiPanelInputComponent != null) {
                    textStatusEmojiPanelInputComponent.setExtraEmojiPanelShow(false);
                }
                if (z) {
                    mo1072i0(false, 0);
                }
                C76628m0 m0Var2 = this.f207167t1;
                C87412m.m108591d(m0Var2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AppMeasurement.Param.TIMESTAMP, C31543z5.m39453c());
                C13598b0 b0Var = C13598b0.f38549a;
                ((C81895h2) m0Var2).mo114295h0("onRequestStatusEmojiPanelDismiss", jSONObject);
            }
        }
    }

    /* renamed from: o8 */
    public final void mo98581o8() {
        hideVKB();
        TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent = this.f207133f;
        if (textStatusEmojiPanelInputComponent != null) {
            textStatusEmojiPanelInputComponent.setVisibility(4);
        }
        mo1072i0(false, 0);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String stringExtra;
        String str2;
        byte[] byteArrayExtra;
        String str3;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        Class cls = C78318v1.class;
        Class cls2 = C77049b.class;
        int i5 = 0;
        Log.m105925i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "onActivityResult requestCode:%s", Integer.valueOf(i));
        super.onActivityResult(i, i2, intent);
        this.f207063B1 = i3;
        String str4 = "";
        if (i3 == 3) {
            if (i4 == -1) {
                if (intent2 == null || (str = intent2.getStringExtra("STATUS_TYPE_IMG")) == null) {
                    str = str4;
                }
                mo98558Q7().f147238g.f147088e = str;
                mo98539B8(this.f207139h);
                if (!(intent2 == null || (stringExtra = intent2.getStringExtra("STATUS_TYPE_CUSTOM_TITLE")) == null)) {
                    str4 = stringExtra;
                }
                if (!IStatusIconHelperKt.m39109a().mo62289a(str)) {
                    str4 = IStatusIconHelperKt.m39109a().mo62300l(str);
                }
                TextView textView = this.f207136g;
                if (textView != null) {
                    textView.setText(str4);
                }
                TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent = this.f207133f;
                if (textStatusEmojiPanelInputComponent != null) {
                    textStatusEmojiPanelInputComponent.setSmileySendButtonText(str4);
                }
            }
            int intExtra = intent2 != null ? intent2.getIntExtra("ClkCustomIconCount", 0) : 0;
            if (intent2 != null) {
                i5 = intent2.getIntExtra("CustomTitleTooLongCount", 0);
            }
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context, 8, cls);
            if (v1Var != null) {
                v1Var.f229511p0 += (long) intExtra;
                v1Var.f229520x0 += (long) i5;
            }
            mo98545H8();
        } else if (i3 != 4) {
            if (i3 == 6) {
                this.f207144i2 = str4;
                if (intent2 != null && i4 == -1) {
                    ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("key_select_video_list");
                    String stringExtra2 = intent2.getStringExtra("K_SEGMENTVIDEOPATH");
                    if ((stringArrayListExtra == null || stringArrayListExtra.size() <= 0) && Util.isNullOrNil(stringExtra2)) {
                        ArrayList<String> stringArrayListExtra2 = intent2.getStringArrayListExtra("key_select_image_list");
                        if (stringArrayListExtra2 == null || stringArrayListExtra2.size() == 0) {
                            Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "no image selected");
                        } else {
                            mo98546I7(1, stringArrayListExtra2.get(0), str4);
                        }
                    } else {
                        if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
                            str2 = str4;
                        } else {
                            String str5 = stringArrayListExtra.get(0);
                            C87412m.m108593f(str5, "{\n                videoPathList[0]\n            }");
                            str2 = str5;
                        }
                        this.f207144i2 = str2;
                        if (!(stringExtra2 == null || C112551y.m153811k(stringExtra2))) {
                            str4 = stringExtra2;
                        } else if (stringArrayListExtra != null && stringArrayListExtra.size() > 0) {
                            str4 = stringArrayListExtra.get(0);
                        }
                        String stringExtra3 = intent2.getStringExtra("KSEGMENTVIDEOTHUMBPATH");
                        if (Util.isNullOrNil(stringExtra3) || !C86013q1.m106450k(stringExtra3)) {
                            stringExtra3 = mo98555N7(str4);
                        }
                        Log.m105925i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "video path %s thumb path %s and %s %s ", str4, stringExtra3, Long.valueOf(C86013q1.m106451l(str4)), Long.valueOf(C86013q1.m106451l(stringExtra3)));
                        CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = (CaptureDataManager.CaptureVideoNormalModel) intent2.getParcelableExtra("KSEGMENTMEDIAINFO");
                        if (captureVideoNormalModel != null) {
                            AppCompatActivity context2 = getContext();
                            C87412m.m108593f(context2, "getContext()");
                            C78318v1 v1Var2 = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context2, 8, cls);
                            if (v1Var2 != null) {
                                Object b = captureVideoNormalModel.mo129798a().mo129811b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", 0L);
                                C87412m.m108593f(b, "it.reportInfo.getReportV…DIA_DURATION_MS_LONG, 0L)");
                                v1Var2.f229509o = ((Number) b).longValue();
                            }
                        }
                        mo98546I7(2, str4, stringExtra3);
                    }
                }
                C32224a<C13598b0> aVar = this.f207143i1;
                if (aVar != null) {
                    aVar.invoke();
                }
                if (IStatusIconHelperKt.m39109a().mo62278H()) {
                    mo98545H8();
                }
            } else if (i3 != 7) {
                String str6 = null;
                if (i3 == 8) {
                    if (!(i4 != -1 || intent2 == null || (byteArrayExtra = intent2.getByteArrayExtra("SELECT_OBJECT")) == null)) {
                        FinderObject finderObject = new FinderObject();
                        finderObject.parseFrom(byteArrayExtra);
                        AppCompatActivity context3 = getContext();
                        C87412m.m108593f(context3, "context");
                        C78318v1 v1Var3 = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context3, 8, cls);
                        if (v1Var3 != null) {
                            v1Var3.f229468G++;
                            StringBuilder sb = new StringBuilder();
                            String str7 = v1Var3.f229495Z;
                            if (str7 != null) {
                                str4 = str7;
                            }
                            sb.append(str4);
                            String str8 = v1Var3.f229495Z;
                            if (str8 == null || C112551y.m153811k(str8)) {
                                str3 = C66800f.f191914b;
                            } else {
                                str3 = ';' + C66800f.f191914b;
                            }
                            sb.append(str3);
                            v1Var3.f229495Z = sb.toString();
                        }
                        C60187m5 s9 = ((C60208v1) C86312j.m106911c(C60208v1.class)).mo78718s9(finderObject.contact);
                        mo98548J7();
                        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
                        String nickname = s9 != null ? s9.getNickname() : null;
                        if (s9 != null) {
                            str6 = s9.getAvatarUrl();
                        }
                        C47465a Iw0 = t1Var.Iw0(nickname, str6, finderObject.f164794id, finderObject);
                        C87412m.m108592e(Iw0, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.BaseLocalSetStatusParam");
                        C52678e0 e0Var = ((C78313a) Iw0).f229399d.f147238g;
                        C52678e0 e0Var2 = mo98558Q7().f147238g;
                        C87412m.m108593f(e0Var2, "curTextStatusExtInfo.topicInfo");
                        mo98551K8(e0Var2, e0Var);
                        mo98553L8();
                        mo98545H8();
                    }
                    C32224a<C13598b0> aVar2 = this.f207143i1;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    if (IStatusIconHelperKt.m39109a().mo62278H()) {
                        mo98545H8();
                    }
                } else if (i3 == 10) {
                    Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "intent " + intent2);
                    if (intent2 != null) {
                        String stringExtra4 = intent2.getStringExtra("get_poi_name");
                        String stringExtra5 = intent2.getStringExtra("get_city");
                        if (!Util.isNullOrNil(stringExtra4) || !Util.isNullOrNil(stringExtra5)) {
                            str6 = Util.nullAs(stringExtra4, stringExtra5);
                        }
                        float floatExtra = intent2.getFloatExtra("get_lat", -1000.0f);
                        float floatExtra2 = intent2.getFloatExtra("get_lng", -1000.0f);
                        mo98558Q7().f147247s = Util.nullAs(intent2.getStringExtra("get_poi_classify_id"), str4);
                        mo98558Q7().f147248t = str6;
                        mo98558Q7().f147236e = (double) floatExtra;
                        mo98558Q7().f147235d = (double) floatExtra2;
                    }
                    mo98549J8();
                }
            } else if (i4 == -1 && intent2 != null) {
                Parcelable parcelableExtra = intent2.getParcelableExtra("KSEGMENTMEDIAINFO");
                C87412m.m108591d(parcelableExtra);
                CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel2 = (CaptureDataManager.CaptureVideoNormalModel) parcelableExtra;
                mo98546I7(2, captureVideoNormalModel2.f272894e, captureVideoNormalModel2.f272895f);
            }
        } else if (intent2 != null) {
            this.f207099S1 = intent2.getIntExtra("Ktag_range_index", 0);
            String stringExtra6 = intent2.getStringExtra("Klabel_name_list");
            if (stringExtra6 == null) {
                stringExtra6 = str4;
            }
            this.f207102T1 = stringExtra6;
            String stringExtra7 = intent2.getStringExtra("Kother_user_name_list");
            if (stringExtra7 == null) {
                stringExtra7 = str4;
            }
            this.f207105U1 = stringExtra7;
            String stringExtra8 = intent2.getStringExtra("Kchat_room_name_list");
            if (stringExtra8 != null) {
                str4 = stringExtra8;
            }
            this.f207108V1 = str4;
            if (mo98605w8()) {
                ArrayList<String> stringArrayListExtra3 = intent2.getStringArrayListExtra("label_id");
                if (!(stringArrayListExtra3 == null || stringArrayListExtra3.isEmpty())) {
                    this.f207111W1.clear();
                    this.f207111W1.addAll(stringArrayListExtra3);
                }
            }
            mo98606x8();
            int i6 = this.f207099S1;
            if (i6 == 0) {
                this.f207126c2 = 0;
            }
            mo98540C8(i6);
            AppCompatActivity context4 = getContext();
            C87412m.m108593f(context4, "context");
            C78318v1 v1Var4 = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context4, 8, cls);
            if (v1Var4 != null) {
                v1Var4.f229471J = this.f207126c2;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "onAttachedToWindow() called");
    }

    public void onBackPressed() {
        super.onBackPressed();
        getContext().overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v204, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v205, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v228, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x059c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x05f5  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x061c  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x065a  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x06ad  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0748  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x089e  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x08a0  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x08a3  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x08aa  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x08c9  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x08e8  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x08f2  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x091a  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0988  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0c06  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0c0e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x039a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r0 = r27
            java.lang.Class<uz2.v1> r1 = uz2.C78318v1.class
            java.lang.Class<ox.b> r2 = p640ox.C77049b.class
            super.onCreate(r28)
            android.view.Window r3 = r27.getWindow()
            android.content.res.Resources r4 = r27.getResources()
            r5 = 2131099794(0x7f060092, float:1.7811951E38)
            int r4 = r4.getColor(r5)
            r3.setNavigationBarColor(r4)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r0.setActionbarColor(r3)
            android.view.Window r5 = r27.getWindow()
            android.view.View r5 = r5.getDecorView()
            r6 = 1280(0x500, float:1.794E-42)
            r5.setSystemUiVisibility(r6)
            android.view.Window r5 = r27.getWindow()
            in3.C87773e.m109211d(r5)
            com.tencent.mm.ui.MMActivityController r5 = r27.getController()
            androidx.appcompat.app.ActionBar r5 = r5.f348065F
            r5.mo91092J(r3)
            java.lang.Class<q00.d> r5 = q00.C62570d.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            q00.d r5 = (q00.C62570d) r5
            r5.Up0()
            vo3.f r5 = r27.getBounceView()
            if (r5 == 0) goto L_0x0054
            r5.setBounceEnabled(r3)
        L_0x0054:
            java.lang.String r5 = ""
            r0.setMMTitle((java.lang.String) r5)
            r27.hideActionbarLine()
            r27.hideActionBarOperationArea()
            androidx.appcompat.app.ActionBar r5 = r27.getSupportActionBar()
            if (r5 == 0) goto L_0x0068
            r5.mo91104o()
        L_0x0068:
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$u0 r5 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$u0
            r5.<init>(r0)
            r0.setBackBtn(r5)
            di3.d r5 = di3.C86312j.m106911c(r2)
            ox.b r5 = (p640ox.C77049b) r5
            dm2.c r6 = new dm2.c
            r7 = 8
            r8 = 1
            r6.<init>(r1, r7, r8)
            r5.mo72352Rp(r0, r6)
            di3.d r5 = di3.C86312j.m106911c(r2)
            ox.b r5 = (p640ox.C77049b) r5
            pe3.a r5 = r5.Wi0(r0, r7, r1)
            uz2.v1 r5 = (uz2.C78318v1) r5
            if (r5 == 0) goto L_0x009f
            long r9 = eb0.C31543z5.m39453c()
            java.lang.String r6 = java.lang.String.valueOf(r9)
            r5.f229500d = r6
            long r9 = eb0.C31543z5.m39453c()
            r5.f229504g = r9
        L_0x009f:
            r5 = 2131306731(0x7f0928eb, float:1.823167E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.f207142i = r5
            r5 = 2131315847(0x7f094c87, float:1.8250159E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f207136g = r5
            r5 = 2131306229(0x7f0926f5, float:1.8230651E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.f207139h = r5
            r5 = 2131316072(0x7f094d68, float:1.8250615E38)
            android.view.View r5 = r0.findViewById(r5)
            r0.f207157p = r5
            r5 = 2131316080(0x7f094d70, float:1.8250631E38)
            android.view.View r5 = r0.findViewById(r5)
            r0.f207160q = r5
            r5 = 2131306178(0x7f0926c2, float:1.8230548E38)
            android.view.View r5 = r0.findViewById(r5)
            r0.f207162r = r5
            r5 = 2131306224(0x7f0926f0, float:1.8230641E38)
            android.view.View r5 = r0.findViewById(r5)
            r0.f207166t = r5
            r5 = 2131306234(0x7f0926fa, float:1.8230661E38)
            android.view.View r5 = r0.findViewById(r5)
            r0.f207170v = r5
            r5 = 2131301702(0x7f091546, float:1.822147E38)
            android.view.View r5 = r0.findViewById(r5)
            java.lang.String r6 = "findViewById(R.id.et_desc)"
            gy3.C87412m.m108593f(r5, r6)
            com.tencent.mm.ui.widget.MMEditText r5 = (com.tencent.p014mm.p136ui.widget.MMEditText) r5
            r0.f207172w = r5
            r5 = 2131315707(0x7f094bfb, float:1.8249875E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5 = 2131301996(0x7f09166c, float:1.8222066E38)
            android.view.View r5 = r0.findViewById(r5)
            r0.f207066D = r5
            r5 = 2131316050(0x7f094d52, float:1.825057E38)
            android.view.View r5 = r0.findViewById(r5)
            java.lang.String r6 = "findViewById(R.id.v_back)"
            gy3.C87412m.m108593f(r5, r6)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.f207076I = r5
            r5 = 2131316066(0x7f094d62, float:1.8250603E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.f207078J = r5
            r5 = 2131315870(0x7f094c9e, float:1.8250205E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f207180z = r5
            r5 = 2131307185(0x7f092ab1, float:1.823259E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r0.f207068E = r5
            r5 = 2131307177(0x7f092aa9, float:1.8232574E38)
            android.view.View r5 = r0.findViewById(r5)
            r0.f207094R = r5
            b03.c r5 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r5 = r5.mo62277G()
            if (r5 == 0) goto L_0x0194
            android.view.View r5 = r0.f207094R
            if (r5 != 0) goto L_0x0159
            goto L_0x01d8
        L_0x0159:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r6.mo10233c(r4)
            java.lang.Object[] r10 = r6.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r12 = "onCreate"
            java.lang.String r13 = "(Landroid/os/Bundle;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r5
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r6 = r6.mo10231a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r10 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r11 = "onCreate"
            java.lang.String r12 = "(Landroid/os/Bundle;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01d8
        L_0x0194:
            android.view.View r5 = r0.f207094R
            if (r5 != 0) goto L_0x0199
            goto L_0x01d8
        L_0x0199:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r6.mo10233c(r9)
            java.lang.Object[] r17 = r6.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r19 = "onCreate"
            java.lang.String r20 = "(Landroid/os/Bundle;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r5
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r6 = r6.mo10231a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r17 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r18 = "onCreate"
            java.lang.String r19 = "(Landroid/os/Bundle;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x01d8:
            r5 = 2131307107(0x7f092a63, float:1.8232432E38)
            android.view.View r5 = r0.findViewById(r5)
            r0.f207091Q = r5
            r5 = 2131298477(0x7f0908ad, float:1.8214928E38)
            android.view.View r5 = r0.findViewById(r5)
            r0.f207103U = r5
            r5 = 2131298457(0x7f090899, float:1.8214888E38)
            android.view.View r5 = r0.findViewById(r5)
            java.lang.String r6 = "findViewById(R.id.btn_ok)"
            gy3.C87412m.m108593f(r5, r6)
            r0.setBtnOk(r5)
            r5 = 2131298417(0x7f090871, float:1.8214807E38)
            android.view.View r5 = r0.findViewById(r5)
            java.lang.String r6 = "findViewById(R.id.btn_back)"
            gy3.C87412m.m108593f(r5, r6)
            r0.setBtnBack(r5)
            android.view.View r5 = r0.f207112X
            java.lang.String r6 = "btnBack"
            r15 = 0
            if (r5 == 0) goto L_0x0c17
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r14.mo10233c(r9)
            java.lang.Object[] r10 = r14.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r12 = "onCreate"
            java.lang.String r13 = "(Landroid/os/Bundle;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r9 = r5
            r7 = r14
            r14 = r16
            r15 = r17
            r16 = r18
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r7 = r7.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r10 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r11 = "onCreate"
            java.lang.String r12 = "(Landroid/os/Bundle;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            r5 = 2131301267(0x7f091393, float:1.8220587E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r0.f207130e = r5
            if (r5 == 0) goto L_0x026f
            android.view.ViewTreeObserver r5 = r5.getViewTreeObserver()
            if (r5 == 0) goto L_0x026f
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$v0 r7 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$v0
            r7.<init>(r0)
            r5.addOnPreDrawListener(r7)
        L_0x026f:
            r5 = 2131307075(0x7f092a43, float:1.8232367E38)
            android.view.View r5 = r0.findViewById(r5)
            java.lang.String r7 = "findViewById(R.id.layout_blur_option)"
            gy3.C87412m.m108593f(r5, r7)
            r0.setLayoutBlurOption(r5)
            r5 = 2131306713(0x7f0928d9, float:1.8231633E38)
            android.view.View r5 = r0.findViewById(r5)
            java.lang.String r7 = "findViewById(R.id.iv_blur)"
            gy3.C87412m.m108593f(r5, r7)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.f207178y0 = r5
            r5 = 2131306455(0x7f0927d7, float:1.823111E38)
            android.view.View r5 = r0.findViewById(r5)
            com.tencent.mm.plugin.textstatus.ui.TextStatusEmojiPanelInputComponent r5 = (com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEmojiPanelInputComponent) r5
            r0.f207133f = r5
            android.widget.ImageView r5 = r0.f207076I
            java.lang.String r7 = "vBack"
            if (r5 == 0) goto L_0x0c12
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$w0 r9 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$w0
            r9.<init>(r0)
            r5.post(r9)
            int r5 = r0.f207116Y0
            java.lang.String r9 = "<get-ivArrow>(...)"
            if (r5 != r8) goto L_0x02fb
            rx3.g r5 = r0.f207071F1
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            gy3.C87412m.m108593f(r5, r9)
            android.view.View r5 = (android.view.View) r5
            r9 = 4
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r15.mo10233c(r9)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r13 = "onCreate"
            java.lang.String r14 = "(Landroid/os/Bundle;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r5
            r8 = r15
            r15 = r9
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r8 = r8.mo10231a(r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r5.setVisibility(r8)
            java.lang.String r11 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r12 = "onCreate"
            java.lang.String r13 = "(Landroid/os/Bundle;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0340
        L_0x02fb:
            rx3.g r5 = r0.f207071F1
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            gy3.C87412m.m108593f(r5, r9)
            android.view.View r5 = (android.view.View) r5
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r4)
            java.lang.Object[] r11 = r8.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r13 = "onCreate"
            java.lang.String r14 = "(Landroid/os/Bundle;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r5
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r8 = r8.mo10231a(r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r5.setVisibility(r8)
            java.lang.String r11 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r12 = "onCreate"
            java.lang.String r13 = "(Landroid/os/Bundle;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x0340:
            com.tencent.p014mm.p136ui.C75044y4.m89994f(r27)
            com.tencent.p014mm.p136ui.C75044y4.m89989a(r27)
            com.tencent.p014mm.p136ui.C75044y4.m89991c(r27)
            com.tencent.p014mm.p136ui.C85875k4.m106180f()
            android.content.Intent r5 = r27.getIntent()
            java.lang.String r8 = "SET_TEXT_PARAMS"
            byte[] r5 = r5.getByteArrayExtra(r8)
            if (r5 == 0) goto L_0x0362
            qy2.z r8 = new qy2.z
            r8.<init>()
            r8.parseFrom(r5)
            r0.f207113X0 = r8
        L_0x0362:
            qy2.z r5 = r0.f207113X0
            if (r5 == 0) goto L_0x0377
            java.lang.String r5 = r5.f229400e
            if (r5 == 0) goto L_0x0377
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0372
            r5 = 1
            goto L_0x0373
        L_0x0372:
            r5 = 0
        L_0x0373:
            if (r5 != 0) goto L_0x0377
            r5 = 1
            goto L_0x0378
        L_0x0377:
            r5 = 0
        L_0x0378:
            if (r5 == 0) goto L_0x0381
            b03.p r5 = b03.C39718p.f106569a
            r5 = 2131235252(0x7f0811b4, float:1.8086693E38)
            r0.f207123b1 = r5
        L_0x0381:
            android.content.Intent r5 = r27.getIntent()
            java.lang.String r8 = "ACTION_NEED_HANDLE_LAST_RESP"
            boolean r5 = r5.getBooleanExtra(r8, r3)
            r0.f207085M1 = r5
            qy2.z r5 = r0.f207113X0
            if (r5 == 0) goto L_0x0394
            int r8 = r5.f229411s
            goto L_0x0395
        L_0x0394:
            r8 = 0
        L_0x0395:
            r0.f207116Y0 = r8
            r9 = 2
            if (r8 == 0) goto L_0x053d
            r10 = 1
            if (r8 == r10) goto L_0x04c2
            if (r8 == r9) goto L_0x03a7
            uz2.u r5 = new uz2.u
            r5.<init>()
            r10 = 0
            goto L_0x0562
        L_0x03a7:
            if (r5 == 0) goto L_0x03ac
            java.lang.String r15 = r5.f229412t
            goto L_0x03ad
        L_0x03ac:
            r15 = 0
        L_0x03ad:
            az2.e r5 = az2.C39674e.f106452d
            rz2.c r5 = r5.mo62253n0(r15)
            uz2.u r8 = new uz2.u
            r8.<init>()
            if (r5 == 0) goto L_0x049c
            int r9 = r5.field_MediaType
            r8.f147237f = r9
            java.lang.String r9 = r5.field_MediaUrl
            r8.f147239h = r9
            java.lang.String r9 = r5.field_MediaAESKey
            r8.f147240i = r9
            java.lang.String r9 = r5.field_MediaThumbUrl
            r8.f147241j = r9
            java.lang.String r9 = r5.field_MediaThumbAESKey
            r8.f147242n = r9
            java.lang.Long r9 = r5.field_option
            long r9 = r9.longValue()
            r11 = 1
            long r9 = r9 & r11
            r8.f147249u = r9
            int r9 = r5.field_mediaWidth
            r8.f147250v = r9
            int r9 = r5.field_mediaHeight
            r8.f147251w = r9
            r9 = 1
            r10 = 0
            uz2.e0 r11 = p773yy.C66710j.C53637a.m60171a(r5, r3, r9, r10)
            uz2.e0 r9 = new uz2.e0
            r9.<init>()
            java.lang.String r12 = "refTopicInfo"
            gy3.C87412m.m108594g(r11, r12)
            xz2.r r12 = xz2.C79019r.f232026a
            xz2.o r12 = new xz2.o
            r12.<init>()
            java.util.LinkedList r13 = hz2.C60235a.m70502b(r11)
            java.util.LinkedList<uz2.a0> r14 = r11.f147090g
            r12.mo107628t(r10, r13, r14)
            boolean r13 = r12.mo107627s()
            if (r13 == 0) goto L_0x0438
            boolean r13 = r12.mo84146j()
            if (r13 == 0) goto L_0x0438
            java.lang.String r13 = hz2.C60235a.m70504d(r11)
            hz2.C60235a.m70509i(r9, r13)
            java.lang.String r13 = hz2.C60235a.m70501a(r11)
            hz2.C60235a.m70506f(r9, r13)
            java.lang.String r13 = hz2.C60235a.m70505e(r11)
            hz2.C60235a.m70510j(r9, r13)
            java.lang.String r13 = hz2.C60235a.m70503c(r11)
            hz2.C60235a.m70508h(r9, r13)
            java.util.LinkedList<uz2.a0> r13 = r11.f147090g
            r9.f147090g = r13
            java.lang.String r13 = r11.f147091h
            r9.f147091h = r13
            java.util.LinkedList r13 = hz2.C60235a.m70502b(r11)
            hz2.C60235a.m70507g(r9, r13)
        L_0x0438:
            boolean r13 = r12.mo107627s()
            if (r13 != 0) goto L_0x047f
            boolean r13 = r12.mo84146j()
            if (r13 == 0) goto L_0x047f
            qy2.z r12 = r12.mo87467a()
            if (r12 == 0) goto L_0x0451
            uz2.u r12 = r12.f229399d
            if (r12 == 0) goto L_0x0451
            uz2.e0 r12 = r12.f147238g
            goto L_0x0452
        L_0x0451:
            r12 = r10
        L_0x0452:
            if (r12 == 0) goto L_0x047f
            java.lang.String r13 = hz2.C60235a.m70504d(r12)
            hz2.C60235a.m70509i(r9, r13)
            java.lang.String r13 = hz2.C60235a.m70501a(r12)
            hz2.C60235a.m70506f(r9, r13)
            java.lang.String r13 = hz2.C60235a.m70505e(r12)
            hz2.C60235a.m70510j(r9, r13)
            java.lang.String r13 = hz2.C60235a.m70503c(r12)
            hz2.C60235a.m70508h(r9, r13)
            java.util.LinkedList<uz2.a0> r13 = r12.f147090g
            r9.f147090g = r13
            java.lang.String r13 = r12.f147091h
            r9.f147091h = r13
            java.util.LinkedList r12 = hz2.C60235a.m70502b(r12)
            hz2.C60235a.m70507g(r9, r12)
        L_0x047f:
            qy2.z r12 = r0.f207113X0
            if (r12 == 0) goto L_0x048e
            uz2.u r12 = r12.f229399d
            if (r12 == 0) goto L_0x048e
            uz2.e0 r12 = r12.f147238g
            if (r12 == 0) goto L_0x048e
            java.lang.String r12 = r12.f147088e
            goto L_0x048f
        L_0x048e:
            r12 = r10
        L_0x048f:
            r9.f147088e = r12
            java.lang.String r11 = r11.f147092i
            r9.f147092i = r11
            r8.f147238g = r9
            int r9 = r5.field_sceneType
            r8.f147226E = r9
            goto L_0x049d
        L_0x049c:
            r10 = 0
        L_0x049d:
            di3.d r9 = di3.C86312j.m106911c(r2)
            ox.b r9 = (p640ox.C77049b) r9
            r11 = 8
            pe3.a r9 = r9.Wi0(r0, r11, r1)
            uz2.v1 r9 = (uz2.C78318v1) r9
            if (r9 == 0) goto L_0x04b7
            if (r5 == 0) goto L_0x04b2
            java.lang.String r5 = r5.field_StatusID
            goto L_0x04b3
        L_0x04b2:
            r5 = r10
        L_0x04b3:
            r9.f229493Y = r5
            r9.f229491X = r15
        L_0x04b7:
            int r5 = r8.f147237f
            if (r5 == 0) goto L_0x04bf
            r5 = 1
            hz2.C76252b.m91660d(r8, r5)
        L_0x04bf:
            r5 = r8
            goto L_0x0562
        L_0x04c2:
            r10 = 0
            if (r5 == 0) goto L_0x04c8
            java.lang.String r15 = r5.f229412t
            goto L_0x04c9
        L_0x04c8:
            r15 = r10
        L_0x04c9:
            az2.e r5 = az2.C39674e.f106452d
            rz2.c r5 = r5.mo62253n0(r15)
            if (r5 == 0) goto L_0x04d6
            rz2.c r15 = r5.mo72943l2()
            goto L_0x04d7
        L_0x04d6:
            r15 = r10
        L_0x04d7:
            uz2.u r5 = new uz2.u
            r5.<init>()
            if (r15 == 0) goto L_0x0562
            double r8 = r15.field_Longitude
            r5.f147235d = r8
            double r8 = r15.field_Latitude
            r5.f147236e = r8
            int r8 = r15.field_MediaType
            r5.f147237f = r8
            r8 = 1
            uz2.e0 r9 = r15.mo72938f1(r8)
            r5.f147238g = r9
            java.lang.String r8 = r15.field_MediaUrl
            r5.f147239h = r8
            java.lang.String r8 = r15.field_MediaAESKey
            r5.f147240i = r8
            java.lang.String r8 = r15.field_MediaThumbUrl
            r5.f147241j = r8
            java.lang.String r8 = r15.field_MediaThumbAESKey
            r5.f147242n = r8
            int r8 = r15.field_Visibility
            r5.f147243o = r8
            java.lang.String r8 = r15.field_Description
            r5.f147231J = r8
            int r8 = r15.field_CreateTime
            r5.f147245q = r8
            int r8 = r15.field_ExpireTime
            r5.f147246r = r8
            java.lang.String r8 = r15.field_PoiID
            r5.f147247s = r8
            java.lang.String r8 = r15.field_PoiName
            r5.f147248t = r8
            java.lang.Long r8 = r15.field_option
            java.lang.String r9 = "it.field_option"
            gy3.C87412m.m108593f(r8, r9)
            long r8 = r8.longValue()
            r5.f147249u = r8
            int r8 = r15.field_mediaWidth
            r5.f147250v = r8
            int r8 = r15.field_mediaHeight
            r5.f147251w = r8
            java.lang.String r8 = r15.field_backgroundId
            r5.f147252x = r8
            int r8 = r15.field_sceneType
            r5.f147226E = r8
            uz2.s r8 = r15.mo72945n2()
            r5.f147232K = r8
            goto L_0x0562
        L_0x053d:
            r10 = 0
            if (r5 == 0) goto L_0x0543
            uz2.u r15 = r5.f229399d
            goto L_0x0544
        L_0x0543:
            r15 = r10
        L_0x0544:
            if (r15 != 0) goto L_0x054c
            uz2.u r5 = new uz2.u
            r5.<init>()
            goto L_0x054d
        L_0x054c:
            r5 = r15
        L_0x054d:
            uz2.e0 r8 = r5.f147238g
            if (r8 == 0) goto L_0x0556
            java.lang.String r15 = hz2.C60235a.m70504d(r8)
            goto L_0x0557
        L_0x0556:
            r15 = r10
        L_0x0557:
            boolean r8 = android.text.TextUtils.isEmpty(r15)
            if (r8 == 0) goto L_0x055e
            r9 = 1
        L_0x055e:
            r5.f147226E = r9
            r5.f147245q = r3
        L_0x0562:
            r0.f207121a1 = r5
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$c r5 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$c
            uz2.u r8 = r27.mo98558Q7()
            r5.<init>(r8)
            r0.f207149k2 = r5
            r5 = 1
            java.lang.Object[] r8 = new java.lang.Object[r5]
            qy2.z r9 = r0.f207113X0
            r8[r3] = r9
            java.lang.String r9 = "MicroMsg.TextStatus.TextStatusEditHalfScreenActivity"
            java.lang.String r11 = "[onCreate] setStatusParam:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r8)
            int r8 = r0.f207116Y0
            if (r8 != r5) goto L_0x059c
            uz2.u r5 = r27.mo98558Q7()
            java.lang.String r5 = r5.f147252x
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x05b0
            b03.p r5 = b03.C39718p.f106569a
            uz2.u r8 = r27.mo98558Q7()
            java.lang.String r8 = r8.f147252x
            int r5 = r5.mo62351b(r8)
            r0.f207123b1 = r5
            goto L_0x05b0
        L_0x059c:
            qy2.z r5 = r0.f207113X0
            if (r5 == 0) goto L_0x05b0
            uz2.u r5 = r5.f229399d
            if (r5 == 0) goto L_0x05b0
            java.lang.String r5 = r5.f147252x
            if (r5 == 0) goto L_0x05b0
            b03.p r8 = b03.C39718p.f106569a
            int r5 = r8.mo62351b(r5)
            r0.f207123b1 = r5
        L_0x05b0:
            qy2.z r5 = r0.f207113X0
            if (r5 == 0) goto L_0x05fb
            di3.d r8 = di3.C86312j.m106911c(r2)
            ox.b r8 = (p640ox.C77049b) r8
            r11 = 8
            pe3.a r8 = r8.Wi0(r0, r11, r1)
            uz2.v1 r8 = (uz2.C78318v1) r8
            if (r8 == 0) goto L_0x05fb
            java.lang.String r11 = r5.f229403h
            r8.f229475N = r11
            long r11 = r5.f229404i
            r8.f229476P = r11
            int r11 = r5.f229406n
            r8.f229477Q = r11
            int r11 = r5.f229407o
            r8.f229479R = r11
            int r11 = r5.f229408p
            long r11 = (long) r11
            r8.f229511p0 = r11
            int r11 = r5.f229409q
            long r11 = (long) r11
            r8.f229520x0 = r11
            java.lang.String r11 = r5.f229416x
            r8.f229492X0 = r11
            java.lang.String r11 = r5.f229417y
            r8.f229494Y0 = r11
            long r11 = r5.f229405j
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x05f5
            long r11 = eb0.C31543z5.m39453c()
            r8.f229504g = r11
            goto L_0x05f7
        L_0x05f5:
            r8.f229504g = r11
        L_0x05f7:
            int r5 = r5.f229415w
            r8.f229478Q0 = r5
        L_0x05fb:
            android.view.View r5 = r27.mo98556O7()
            boolean r8 = r27.mo98604v8()
            r5.setEnabled(r8)
            android.view.View r5 = r27.mo98556O7()
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$x0 r8 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$x0
            r8.<init>(r0)
            r5.setOnClickListener(r8)
            android.view.View r5 = r27.mo98556O7()
            boolean r5 = r5.isEnabled()
            if (r5 != 0) goto L_0x065a
            android.view.View r11 = r27.mo98564W7()
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r4)
            java.lang.Object[] r20 = r5.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r22 = "onCreate"
            java.lang.String r23 = "(Landroid/os/Bundle;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r11
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r5 = r5.mo10231a(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r11.setVisibility(r5)
            java.lang.String r12 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r13 = "onCreate"
            java.lang.String r14 = "(Landroid/os/Bundle;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x069d
        L_0x065a:
            android.view.View r5 = r27.mo98564W7()
            k20.a r8 = new k20.a
            r8.<init>()
            r11 = 8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r8.mo10233c(r12)
            java.lang.Object[] r20 = r8.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r22 = "onCreate"
            java.lang.String r23 = "(Landroid/os/Bundle;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r5
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r8.mo10231a(r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r5.setVisibility(r8)
            java.lang.String r20 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r21 = "onCreate"
            java.lang.String r22 = "(Landroid/os/Bundle;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x069d:
            android.view.View r5 = r27.mo98564W7()
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$y0 r8 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$y0
            r8.<init>(r0)
            r5.setOnClickListener(r8)
            android.view.View r5 = r0.f207112X
            if (r5 == 0) goto L_0x0c0e
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$z0 r8 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$z0
            r8.<init>(r0)
            r5.setOnClickListener(r8)
            rx3.g r5 = r0.f207115Y
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.String r8 = "<get-btnClose>(...)"
            gy3.C87412m.m108593f(r5, r8)
            android.view.View r5 = (android.view.View) r5
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$l0 r8 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$l0
            r8.<init>(r0)
            r5.setOnClickListener(r8)
            android.widget.ImageView r5 = r0.f207076I
            if (r5 == 0) goto L_0x0c0a
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$m0 r7 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$m0
            r7.<init>(r0)
            r5.setOnClickListener(r7)
            b03.c r5 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r5 = r5.mo62275E()
            if (r5 == 0) goto L_0x06f8
            int r5 = r0.f207116Y0
            r7 = 1
            if (r5 == r7) goto L_0x06f2
            uz2.u r5 = r27.mo98558Q7()
            uz2.e0 r5 = r5.f147238g
            java.lang.String r7 = "userdefine"
            r5.f147088e = r7
        L_0x06f2:
            android.widget.ImageView r5 = r0.f207142i
            r0.mo98539B8(r5)
            goto L_0x0727
        L_0x06f8:
            b03.c r5 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r5 = r5.mo62277G()
            if (r5 == 0) goto L_0x0722
            uz2.u r5 = r27.mo98558Q7()
            uz2.e0 r5 = r5.f147238g
            java.lang.String r5 = r5.f147088e
            if (r5 == 0) goto L_0x0715
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0713
            goto L_0x0715
        L_0x0713:
            r5 = 0
            goto L_0x0716
        L_0x0715:
            r5 = 1
        L_0x0716:
            if (r5 == 0) goto L_0x0722
            uz2.u r5 = r27.mo98558Q7()
            uz2.e0 r5 = r5.f147238g
            java.lang.String r7 = "1024"
            r5.f147088e = r7
        L_0x0722:
            android.widget.ImageView r5 = r0.f207139h
            r0.mo98539B8(r5)
        L_0x0727:
            qy2.z r5 = r0.f207113X0
            if (r5 == 0) goto L_0x072e
            boolean r5 = r5.f229402g
            goto L_0x072f
        L_0x072e:
            r5 = 1
        L_0x072f:
            int r7 = r0.f207116Y0
            if (r7 != 0) goto L_0x075b
            qy2.i r7 = r27.mo98559R7()
            if (r7 == 0) goto L_0x0743
            boolean r7 = r7.mo107627s()
            r8 = 1
            if (r7 != r8) goto L_0x0744
            r18 = 1
            goto L_0x0746
        L_0x0743:
            r8 = 1
        L_0x0744:
            r18 = 0
        L_0x0746:
            if (r18 == 0) goto L_0x075b
            qy2.i r7 = r27.mo98559R7()
            if (r7 == 0) goto L_0x0756
            boolean r7 = r7.mo84146j()
            if (r7 != r8) goto L_0x0756
            r7 = 1
            goto L_0x0757
        L_0x0756:
            r7 = 0
        L_0x0757:
            if (r7 == 0) goto L_0x075b
            r7 = 1
            goto L_0x075c
        L_0x075b:
            r7 = 0
        L_0x075c:
            java.lang.String r8 = "<get-vFake>(...)"
            java.lang.String r11 = "<get-vCamera>(...)"
            if (r7 != 0) goto L_0x07fa
            if (r5 != 0) goto L_0x0766
            goto L_0x07fa
        L_0x0766:
            rx3.g r5 = r0.f207145j
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            gy3.C87412m.m108593f(r5, r11)
            android.view.View r5 = (android.view.View) r5
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r4)
            java.lang.Object[] r20 = r7.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r22 = "initCameraIcon"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r5
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r7 = r7.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r20 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r21 = "initCameraIcon"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            rx3.g r5 = r0.f207153n
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            gy3.C87412m.m108593f(r5, r8)
            android.view.View r5 = (android.view.View) r5
            k20.a r7 = new k20.a
            r7.<init>()
            r8 = 8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r7.mo10233c(r12)
            java.lang.Object[] r20 = r7.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r22 = "initCameraIcon"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r5
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r7 = r7.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r20 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r21 = "initCameraIcon"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x088c
        L_0x07fa:
            rx3.g r5 = r0.f207145j
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            gy3.C87412m.m108593f(r5, r11)
            android.view.View r5 = (android.view.View) r5
            k20.a r7 = new k20.a
            r7.<init>()
            r12 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r7.mo10233c(r13)
            java.lang.Object[] r20 = r7.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r22 = "initCameraIcon"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r5
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r7 = r7.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r20 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r21 = "initCameraIcon"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            rx3.g r5 = r0.f207153n
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            gy3.C87412m.m108593f(r5, r8)
            android.view.View r5 = (android.view.View) r5
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r4)
            java.lang.Object[] r20 = r7.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r22 = "initCameraIcon"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r5
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r7 = r7.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r20 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r21 = "initCameraIcon"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x088c:
            r27.mo98602t8()
            uz2.u r5 = r27.mo98558Q7()
            java.lang.String r5 = r5.f147231J
            if (r5 == 0) goto L_0x08a0
            int r5 = r5.length()
            if (r5 != 0) goto L_0x089e
            goto L_0x08a0
        L_0x089e:
            r5 = 0
            goto L_0x08a1
        L_0x08a0:
            r5 = 1
        L_0x08a1:
            if (r5 != 0) goto L_0x08aa
            uz2.u r5 = r27.mo98558Q7()
            java.lang.String r5 = r5.f147231J
            goto L_0x08b0
        L_0x08aa:
            uz2.u r5 = r27.mo98558Q7()
            java.lang.String r5 = r5.f147244p
        L_0x08b0:
            com.tencent.mm.ui.widget.MMEditText r7 = r27.mo98563V7()
            java.lang.Class<ny.h> r8 = p629ny.C76979h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ny.h r8 = (p629ny.C76979h) r8
            android.text.SpannableString r8 = r8.mo107057T1(r0, r5)
            r7.setText(r8)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L_0x08d8
            com.tencent.mm.ui.widget.MMEditText r7 = r27.mo98563V7()
            com.tencent.mm.ui.widget.MMEditText r8 = r27.mo98563V7()
            int r8 = r8.length()
            r7.setSelection(r8)
        L_0x08d8:
            di3.d r2 = di3.C86312j.m106911c(r2)
            ox.b r2 = (p640ox.C77049b) r2
            r7 = 8
            pe3.a r1 = r2.Wi0(r0, r7, r1)
            uz2.v1 r1 = (uz2.C78318v1) r1
            if (r1 == 0) goto L_0x08ea
            r1.f229489W = r5
        L_0x08ea:
            uz2.u r1 = r27.mo98558Q7()
            uz2.s r1 = r1.f147232K
            if (r1 == 0) goto L_0x091a
            java.lang.String r2 = r1.f147197d
            if (r2 == 0) goto L_0x08ff
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x08fd
            goto L_0x08ff
        L_0x08fd:
            r2 = 0
            goto L_0x0900
        L_0x08ff:
            r2 = 1
        L_0x0900:
            if (r2 != 0) goto L_0x0978
            java.lang.Class<bq.p0> r2 = p008bq.C0363p0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            bq.p0 r2 = (p008bq.C0363p0) r2
            java.lang.String r5 = r1.f147197d
            com.tencent.mm.api.IEmojiInfo r2 = r2.mo403r2(r5)
            if (r2 != 0) goto L_0x0916
            com.tencent.mm.api.IEmojiInfo r2 = iz2.C46390a.m51721a(r1)
        L_0x0916:
            r0.mo98574g8(r2)
            goto L_0x0978
        L_0x091a:
            qy2.z r1 = r0.f207113X0
            if (r1 == 0) goto L_0x0978
            uz2.t r1 = r1.f229398C
            if (r1 == 0) goto L_0x0978
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "initEmojiInfo: isNeedEmoji:"
            r2.append(r5)
            boolean r5 = r1.f229447h
            r2.append(r5)
            java.lang.String r5 = " isLoadedEmoji:"
            r2.append(r5)
            boolean r5 = r1.f229446g
            r2.append(r5)
            java.lang.String r5 = " emojiMd5:"
            r2.append(r5)
            java.lang.String r5 = r1.f229443d
            r2.append(r5)
            java.lang.String r5 = " emojiPath:"
            r2.append(r5)
            java.lang.String r5 = r1.f229445f
            r2.append(r5)
            java.lang.String r5 = " cdnUrl:"
            r2.append(r5)
            java.lang.String r5 = r1.f229444e
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            boolean r2 = r1.f229447h
            if (r2 == 0) goto L_0x0978
            java.lang.Class<bq.l0> r2 = p008bq.C39833l0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            bq.l0 r2 = (p008bq.C39833l0) r2
            java.lang.String r5 = r1.f229443d
            java.lang.String r7 = r1.f229444e
            yz2.x1 r8 = new yz2.x1
            r8.<init>(r1, r0)
            r2.mo62464Ms(r5, r7, r8)
        L_0x0978:
            r27.mo98553L8()
            r27.mo98549J8()
            r27.mo98603u8()
            r27.mo98584q8()
            android.view.View r1 = r0.f207112X
            if (r1 == 0) goto L_0x0c06
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            gy3.C87412m.m108592e(r1, r2)
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            androidx.appcompat.app.AppCompatActivity r2 = r27.getContext()
            int r2 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r2)
            androidx.appcompat.app.AppCompatActivity r5 = r27.getContext()
            r6 = 6
            int r5 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r5, r6)
            int r2 = r2 + r5
            r1.topMargin = r2
            android.view.View r1 = r27.mo98566Y7()
            yz2.w1 r2 = new yz2.w1
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            b03.c r1 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r1 = r1.mo62275E()
            if (r1 == 0) goto L_0x0a33
            di0.o r1 = new di0.o
            r1.<init>()
            java.lang.String r2 = r0.f207159p1
            r1.f250930b = r2
            java.lang.String r2 = r0.f207163r1
            r1.f250929a = r2
            java.lang.String r2 = r0.f207161q1
            r1.f250934f = r2
            b03.c r2 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            uz2.e1 r2 = r2.mo62292d()
            java.util.LinkedList<uz2.d1> r2 = r2.f147104g
            if (r2 == 0) goto L_0x09e3
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x09e1
            goto L_0x09e3
        L_0x09e1:
            r2 = 0
            goto L_0x09e4
        L_0x09e3:
            r2 = 1
        L_0x09e4:
            if (r2 == 0) goto L_0x09eb
            java.lang.String r2 = "initEmojiPanel: config.icons isNullOrEmpty "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r2)
        L_0x09eb:
            yz2.y1 r2 = new yz2.y1
            r2.<init>(r0)
            r1.f250937i = r2
            r1.f250931c = r3
            r2 = 1190(0x4a6, float:1.668E-42)
            r1.f250939k = r2
            r2 = 1
            r1.f250935g = r2
            eb0.C31543z5.m39453c()
            java.lang.Class<kr0.x0> r2 = kr0.C76630x0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            kr0.x0 r2 = (kr0.C76630x0) r2
            kr0.m0 r2 = r2.mo106891XS(r0)
            r0.f207167t1 = r2
            if (r2 == 0) goto L_0x0a13
            com.tencent.mm.plugin.appbrand.h2 r2 = (com.tencent.p014mm.plugin.appbrand.C81895h2) r2
            r2.mo114296i0(r1)
        L_0x0a13:
            yz2.z1 r1 = new yz2.z1
            r1.<init>(r0)
            r0.f207165s1 = r1
            java.lang.Class<sm.t0> r1 = p235sm.C64053t0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            sm.t0 r1 = (p235sm.C64053t0) r1
            java.lang.String r2 = r0.f207159p1
            sm.t0$a r5 = r0.f207165s1
            if (r5 == 0) goto L_0x0a2c
            r1.mo88810Bz(r2, r5)
            goto L_0x0a33
        L_0x0a2c:
            java.lang.String r1 = "weAppDataCallback"
            gy3.C87412m.m108603p(r1)
            throw r10
        L_0x0a33:
            android.widget.TextView r1 = r27.mo98571d8()
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$n0 r2 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$n0
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            android.view.View r1 = r0.f207103U
            if (r1 == 0) goto L_0x0a4b
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$o0 r2 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$o0
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x0a4b:
            com.tencent.mm.ui.widget.MMEditText r1 = r27.mo98563V7()
            android.text.TextWatcher r2 = r0.f207090P1
            r1.addTextChangedListener(r2)
            java.text.SimpleDateFormat r1 = qy2.C77448f0.f225876a
            r1 = 3
            r0.f207134f1 = r1
            r27.mo98586s8()
            r27.mo98583p8()
            b03.c r1 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r1 = r1.mo62277G()
            java.lang.String r2 = "<get-topicContainerLl>(...)"
            if (r1 == 0) goto L_0x0ac6
            rx3.g r1 = r0.f207097S
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            gy3.C87412m.m108593f(r1, r2)
            android.view.View r1 = (android.view.View) r1
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r4)
            java.lang.Object[] r13 = r5.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r15 = "onCreate"
            java.lang.String r16 = "(Landroid/os/Bundle;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r5 = r5.mo10231a(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r13 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r14 = "onCreate"
            java.lang.String r15 = "(Landroid/os/Bundle;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            rx3.g r1 = r0.f207097S
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            gy3.C87412m.m108593f(r1, r2)
            android.view.View r1 = (android.view.View) r1
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$p0 r2 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$p0
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            goto L_0x0b11
        L_0x0ac6:
            rx3.g r1 = r0.f207097S
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            gy3.C87412m.m108593f(r1, r2)
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            r5 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r2.mo10233c(r6)
            java.lang.Object[] r13 = r2.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r15 = "onCreate"
            java.lang.String r16 = "(Landroid/os/Bundle;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r13 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r14 = "onCreate"
            java.lang.String r15 = "(Landroid/os/Bundle;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
        L_0x0b11:
            rx3.g r1 = r0.f207145j
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            gy3.C87412m.m108593f(r1, r11)
            android.view.View r1 = (android.view.View) r1
            android.view.View$OnClickListener r2 = r0.f207122a2
            r1.setOnClickListener(r2)
            android.view.View r1 = r0.f207157p
            if (r1 == 0) goto L_0x0b2f
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$q0 r2 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$q0
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x0b2f:
            android.view.View r1 = r0.f207160q
            if (r1 == 0) goto L_0x0b38
            android.view.View$OnClickListener r2 = r0.f207114X1
            r1.setOnClickListener(r2)
        L_0x0b38:
            android.view.View r1 = r0.f207089P
            if (r1 == 0) goto L_0x0b44
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$r0 r2 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$r0
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x0b44:
            android.view.View r1 = r0.f207100T
            if (r1 == 0) goto L_0x0b50
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$s0 r2 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$s0
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x0b50:
            b03.c r1 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r1 = r1.mo62275E()
            if (r1 == 0) goto L_0x0bac
            android.view.View r1 = r27.mo98561T7()
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r4)
            java.lang.Object[] r6 = r2.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r8 = "onCreate"
            java.lang.String r9 = "(Landroid/os/Bundle;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r1
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r6 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r7 = "onCreate"
            java.lang.String r8 = "(Landroid/os/Bundle;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            android.view.View r12 = r27.mo98561T7()
            r13 = 0
            r15 = 0
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$t0 r1 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$t0
            r1.<init>(r0)
            r17 = 3
            r18 = 0
            r16 = r1
            b03.C39721r.m42515a(r12, r13, r15, r16, r17, r18)
            goto L_0x0bee
        L_0x0bac:
            android.view.View r2 = r27.mo98561T7()
            k20.a r1 = new k20.a
            r1.<init>()
            r4 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.mo10233c(r4)
            java.lang.Object[] r5 = r1.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r7 = "onCreate"
            java.lang.String r8 = "(Landroid/os/Bundle;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r2
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setVisibility(r1)
            java.lang.String r3 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity"
            java.lang.String r4 = "onCreate"
            java.lang.String r5 = "(Landroid/os/Bundle;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x0bee:
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$configUpdateListener$1 r1 = r0.f207083L1
            r1.alive()
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$statusExptSwitchChangeEventListener$1 r1 = r0.f207087N1
            r1.alive()
            boolean r1 = r27.mo98578l8()
            if (r1 == 0) goto L_0x0c05
            fy3.a<rx3.b0> r1 = r0.f207143i1
            if (r1 == 0) goto L_0x0c05
            r1.invoke()
        L_0x0c05:
            return
        L_0x0c06:
            gy3.C87412m.m108603p(r6)
            throw r10
        L_0x0c0a:
            gy3.C87412m.m108603p(r7)
            throw r10
        L_0x0c0e:
            gy3.C87412m.m108603p(r6)
            throw r10
        L_0x0c12:
            r10 = 0
            gy3.C87412m.m108603p(r7)
            throw r10
        L_0x0c17:
            r10 = r15
            gy3.C87412m.m108603p(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        ChatFooterPanel smileyPanel;
        mo98543F8();
        super.onDestroy();
        mo98552L7();
        ((C76057w) C86312j.m106911c(C76057w.class)).mo106264FL(this.f207093Q1, this.f207096R1);
        f207059m2 = null;
        this.f207128d1 = null;
        this.f207083L1.dead();
        this.f207087N1.dead();
        TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent = this.f207133f;
        if (!(textStatusEmojiPanelInputComponent == null || (smileyPanel = textStatusEmojiPanelInputComponent.getSmileyPanel()) == null)) {
            smileyPanel.mo100201m();
        }
        C76628m0 m0Var = this.f207167t1;
        if (m0Var != null) {
            ((C81895h2) m0Var).mo114293g0();
        }
        if (this.f207165s1 != null) {
            C64053t0 t0Var = (C64053t0) C86312j.m106911c(C64053t0.class);
            String str = this.f207159p1;
            C64053t0.C13730a aVar = this.f207165s1;
            if (aVar != null) {
                t0Var.mo88812eW(str, aVar);
            } else {
                C87412m.m108603p("weAppDataCallback");
                throw null;
            }
        }
        if (this.f207085M1) {
            IStatusIconHelperKt.m39109a().mo62308t();
        }
    }

    public void onPause() {
        C60695a player;
        super.hideVKB();
        super.onPause();
        KeyboardHeightProvider keyboardHeightProvider = this.f207125c1;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        if (IStatusIconHelperKt.m39109a().mo62275E()) {
            mo98580n8(true);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[onPause] ");
        sb.append(this.f207074H == null);
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", sb.toString());
        C59600d dVar = this.f207074H;
        if (dVar != null && dVar.f170310d) {
            dVar.mo79963g();
            dVar.mo79961e();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f207131e1;
        if (!(mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null)) {
            C60695a.C60696a.m70998a(player, false, 1, (Object) null);
        }
        C76628m0 m0Var = this.f207167t1;
        if (m0Var != null) {
            ((C81812e1) m0Var).mo114188A();
        }
        Toast toast = this.f207073G1;
        if (toast != null) {
            toast.cancel();
        }
        this.f207073G1 = null;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        if (!(iArr.length == 0)) {
            if (i == 64 && iArr[0] == 0) {
                mo98607y8();
            } else if (i != 18) {
            } else {
                if (iArr[0] == 0) {
                    mo98573f8();
                    super.onRequestPermissionsResult(i, strArr, iArr);
                    return;
                }
                int i2 = C87412m.m108589b("android.permission.CAMERA", strArr[0]) ? C0966R.string.hhq : C0966R.string.f361130hi2;
                if (iArr[0] != 0) {
                    C76879j.m92709C(this, getString(i2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C30502b1(this), C30503c1.f82185d);
                }
            }
        }
    }

    public void onResume() {
        C60695a player;
        ViewTreeObserver viewTreeObserver;
        super.onResume();
        KeyboardHeightProvider keyboardHeightProvider = this.f207125c1;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
        this.f207152m1 = -1;
        int i = this.f207063B1;
        if (!(i == 8 || i == 2 || i == 6 || (viewTreeObserver = mo98563V7().getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f207079J1);
        }
        ViewTreeObserver viewTreeObserver2 = mo98563V7().getViewTreeObserver();
        if (viewTreeObserver2 != null) {
            viewTreeObserver2.addOnPreDrawListener(this.f207081K1);
        }
        mo98563V7().setOnClickListener(new C79220a2(this));
        C59600d dVar = this.f207074H;
        if (dVar != null && !dVar.f170310d) {
            dVar.mo79964h();
            dVar.mo79962f();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f207131e1;
        if (!(mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null)) {
            player.mo85619m();
        }
        mo98545H8();
        C76628m0 m0Var = this.f207167t1;
        if (m0Var != null) {
            ((C81812e1) m0Var).mo114189C();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            KeyboardHeightProvider keyboardHeightProvider = this.f207125c1;
            if (keyboardHeightProvider != null) {
                keyboardHeightProvider.mo104022e();
                return;
            }
            return;
        }
        KeyboardHeightProvider keyboardHeightProvider2 = this.f207125c1;
        if (keyboardHeightProvider2 != null) {
            keyboardHeightProvider2.mo104021d();
        }
    }

    /* renamed from: p8 */
    public final void mo98583p8() {
        String str;
        if (!mo98541D8()) {
            Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "initEditText allow input text");
            mo98563V7().post(new C71508r(this));
            C117407d.INSTANCE.idkeyStat(1629, 0, 1, false);
            C77459z zVar = this.f207113X0;
            if (!(zVar != null && zVar.f229404i == 11)) {
                C52678e0 e0Var = mo98558Q7().f147238g;
                if (e0Var == null || (str = C60235a.m70504d(e0Var)) == null) {
                    str = "";
                }
                if (!C112551y.m153808h(str, "@weapp", false, 2, (Object) null)) {
                    return;
                }
            }
            SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
            C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_TEXT_STATUS_TOPIC_TIPS_SHOW_V1_BOOLEAN, false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: uz2.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d6  */
    /* renamed from: q8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98584q8() {
        /*
            r15 = this;
            int r0 = r15.f207116Y0
            r1 = 1
            r2 = 2
            r3 = 0
            if (r0 == 0) goto L_0x002f
            if (r0 == r1) goto L_0x001e
            if (r0 == r2) goto L_0x000d
            goto L_0x01b4
        L_0x000d:
            az2.e r0 = az2.C39674e.f106452d
            qy2.z r1 = r15.f207113X0
            if (r1 == 0) goto L_0x0015
            java.lang.String r3 = r1.f229412t
        L_0x0015:
            rz2.c r0 = r0.mo62253n0(r3)
            r15.mo98585r8(r0)
            goto L_0x01b4
        L_0x001e:
            az2.e r0 = az2.C39674e.f106452d
            qy2.z r1 = r15.f207113X0
            if (r1 == 0) goto L_0x0026
            java.lang.String r3 = r1.f229412t
        L_0x0026:
            rz2.c r0 = r0.mo62253n0(r3)
            r15.mo98585r8(r0)
            goto L_0x01b4
        L_0x002f:
            qy2.z r0 = r15.f207113X0
            r4 = 0
            if (r0 == 0) goto L_0x005f
            uz2.u r0 = r0.f229399d
            if (r0 == 0) goto L_0x005f
            java.lang.String r5 = r0.f147241j
            if (r5 == 0) goto L_0x0045
            boolean r5 = z04.C112551y.m153811k(r5)
            if (r5 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r5 = 0
            goto L_0x0046
        L_0x0045:
            r5 = 1
        L_0x0046:
            if (r5 != 0) goto L_0x005a
            java.lang.String r0 = r0.f147239h
            if (r0 == 0) goto L_0x0055
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r0 = 0
            goto L_0x0056
        L_0x0055:
            r0 = 1
        L_0x0056:
            if (r0 != 0) goto L_0x005a
            r0 = 1
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            if (r0 != r1) goto L_0x005f
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            java.lang.String r5 = "context"
            if (r0 == 0) goto L_0x00d6
            qy2.z r0 = r15.f207113X0
            if (r0 == 0) goto L_0x006b
            uz2.u r0 = r0.f229399d
            goto L_0x006c
        L_0x006b:
            r0 = r3
        L_0x006c:
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$c r6 = r15.mo98557P7()
            androidx.appcompat.app.AppCompatActivity r7 = r15.getContext()
            gy3.C87412m.m108593f(r7, r5)
            r6.mo98612b()
            if (r0 != 0) goto L_0x007d
            goto L_0x0093
        L_0x007d:
            int r5 = r0.f147237f
            if (r5 == r1) goto L_0x008b
            if (r5 == r2) goto L_0x0084
            goto L_0x0091
        L_0x0084:
            java.lang.String r2 = r0.f147239h
            r6.f207186b = r2
            r6.f207190f = r4
            goto L_0x0091
        L_0x008b:
            java.lang.String r2 = r0.f147239h
            r6.f207186b = r2
            r6.f207190f = r4
        L_0x0091:
            r6.f207188d = r5
        L_0x0093:
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$c r2 = r15.mo98557P7()
            java.lang.String r2 = r2.f207186b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r2 = r2 ^ r1
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$c r5 = r15.mo98557P7()
            int r5 = r5.f207188d
            if (r5 == 0) goto L_0x00ab
            if (r2 != 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r2 = 0
            goto L_0x00af
        L_0x00ab:
            r15.mo98608z8()
            r2 = 1
        L_0x00af:
            if (r2 == 0) goto L_0x00b3
            goto L_0x01b4
        L_0x00b3:
            if (r0 == 0) goto L_0x00ba
            int r0 = r0.f147237f
            if (r0 != r1) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r1 = 0
        L_0x00bb:
            if (r1 == 0) goto L_0x00c8
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$c r0 = r15.mo98557P7()
            java.lang.String r0 = r0.f207186b
            r15.mo98577k8(r0, r3)
            goto L_0x01b4
        L_0x00c8:
            android.view.View r0 = r15.f207066D
            if (r0 == 0) goto L_0x01b4
            yz2.b2 r1 = new yz2.b2
            r1.<init>(r15)
            r0.post(r1)
            goto L_0x01b4
        L_0x00d6:
            qy2.z r0 = r15.f207113X0
            if (r0 == 0) goto L_0x00dd
            java.lang.String r6 = r0.f229400e
            goto L_0x00de
        L_0x00dd:
            r6 = r3
        L_0x00de:
            if (r0 == 0) goto L_0x00e2
            uz2.u r3 = r0.f229399d
        L_0x00e2:
            if (r3 == 0) goto L_0x00e7
            int r0 = r3.f147237f
            goto L_0x00e8
        L_0x00e7:
            r0 = 0
        L_0x00e8:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            r3 = r3 ^ r1
            if (r0 == 0) goto L_0x00f4
            if (r3 != 0) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            r3 = 0
            goto L_0x00f8
        L_0x00f4:
            r15.mo98608z8()
            r3 = 1
        L_0x00f8:
            if (r3 == 0) goto L_0x00fb
            return
        L_0x00fb:
            if (r0 == r1) goto L_0x0174
            if (r0 == r2) goto L_0x0101
            goto L_0x01b4
        L_0x0101:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = ""
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r12 = com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider.m119433c(r6, r0, r0)
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_story_album_duration
            r5 = 15
            int r0 = r0.mo58779Qe(r3, r5)
            int r0 = r0 * 1000
            r12.f272935w = r0
            r12.f272905F = r2
            com.tencent.mm.component.api.jumper.UICustomParam r0 = new com.tencent.mm.component.api.jumper.UICustomParam
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r0.f266575h
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r6 = "plugin_filter"
            r3.put(r6, r5)
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r0.f266575h
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r6 = "plugin_poi"
            r3.put(r6, r5)
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r0.f266575h
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r6 = "plugin_tip"
            r3.put(r6, r5)
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r0.f266575h
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r6 = "plugin_menu"
            r3.put(r6, r5)
            r12.f272927o = r0
            r12.f272910K = r4
            r12.f272911L = r4
            r12.f272913N = r1
            r12.f272930r = r5
            r0 = 4
            r12.f272929q = r0
            java.lang.String r0 = "com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout"
            r12.mo129804a(r2, r0)
            hh2.a r7 = hh2.C8532a.f27585a
            androidx.appcompat.app.AppCompatActivity r8 = r15.getContext()
            r9 = 7
            r10 = 2130772171(0x7f0100cb, float:1.7147453E38)
            r11 = -1
            r13 = 2
            r14 = 0
            r7.mo9446e(r8, r9, r10, r11, r12, r13, r14)
        L_0x0170:
            r15.mo98608z8()
            goto L_0x01b4
        L_0x0174:
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "initMedia NORMAL IMG thumbExist:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = " path:"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.TextStatus.TextStatusEditHalfScreenActivity"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            if (r1 == 0) goto L_0x01ac
            r15.mo98575i8(r6, r0)
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$c r0 = r15.mo98557P7()
            qy2.z r1 = r15.f207113X0
            androidx.appcompat.app.AppCompatActivity r2 = r15.getContext()
            gy3.C87412m.m108593f(r2, r5)
            r0.mo98613c(r1, r6, r2)
            goto L_0x01b4
        L_0x01ac:
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$s r0 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity$s
            r0.<init>(r15)
            r15.mo98577k8(r6, r0)
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity.mo98584q8():void");
    }

    /* renamed from: r8 */
    public final void mo98585r8(C48201c cVar) {
        View view;
        C71459c P7 = mo98557P7();
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        P7.mo98612b();
        boolean z = false;
        if (cVar != null) {
            int i = cVar.field_MediaType;
            String str = cVar.field_UserName;
            if (i == 1) {
                C39696f fVar = C39696f.f106501a;
                C87412m.m108593f(str, "userName");
                P7.f207187c = fVar.mo62321d("thumb", str);
                P7.f207186b = fVar.mo62321d("image", str);
                P7.f207190f = false;
            } else if (i == 2) {
                C39696f fVar2 = C39696f.f106501a;
                C87412m.m108593f(str, "userName");
                P7.f207187c = fVar2.mo62321d("thumb", str);
                if (!C87412m.m108589b(C13781a.m13082a(), str)) {
                    P7.f207186b = cVar.field_MediaUrl;
                } else if (C86013q1.m106450k(fVar2.mo62320c(str))) {
                    P7.f207186b = fVar2.mo62320c(str);
                } else {
                    P7.f207186b = cVar.field_MediaUrl;
                }
                P7.f207190f = false;
            }
            P7.f207188d = i;
            long l = C86013q1.m106451l(P7.f207186b);
            P7.f207194j = l;
            P7.f207192h = l;
            P7.f207193i = C90193h.m112876d(P7.f207186b);
            P7.mo98611a(context);
        }
        boolean z2 = !TextUtils.isEmpty(mo98557P7().f207186b);
        if (mo98557P7().f207188d == 0 || !z2) {
            mo98608z8();
            z = true;
        }
        if (!z && (view = this.f207066D) != null) {
            view.post(new C71514t(this));
        }
    }

    /* renamed from: s8 */
    public final void mo98586s8() {
        ChatFooterPanel smileyPanel;
        View findViewById;
        boolean z = true;
        if (this.f207134f1 >= 1) {
            Editable text = mo98563V7().getText();
            C87412m.m108593f(text, "etDesc.text");
            if (text.length() > 0) {
                TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent = this.f207133f;
                if (textStatusEmojiPanelInputComponent != null) {
                    textStatusEmojiPanelInputComponent.setSmileySendButtonEnable(true);
                }
            } else {
                TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent2 = this.f207133f;
                if (textStatusEmojiPanelInputComponent2 != null) {
                    textStatusEmojiPanelInputComponent2.setSmileySendButtonEnable(false);
                }
            }
            TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent3 = this.f207133f;
            if (textStatusEmojiPanelInputComponent3 != null) {
                textStatusEmojiPanelInputComponent3.setMMEditText(mo98563V7());
            }
            TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent4 = this.f207133f;
            if (textStatusEmojiPanelInputComponent4 != null) {
                textStatusEmojiPanelInputComponent4.setVisibility(4);
            }
            TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent5 = this.f207133f;
            if (textStatusEmojiPanelInputComponent5 != null) {
                textStatusEmojiPanelInputComponent5.setInputComponentListener(this);
            }
            TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent6 = this.f207133f;
            if (!(textStatusEmojiPanelInputComponent6 == null || (findViewById = textStatusEmojiPanelInputComponent6.findViewById(C0966R.C0970id.fkm)) == null)) {
                findViewById.setBackgroundColor(getResources().getColor(C0966R.color.BW_93));
            }
            TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent7 = this.f207133f;
            if (!(textStatusEmojiPanelInputComponent7 == null || (smileyPanel = textStatusEmojiPanelInputComponent7.getSmileyPanel()) == null)) {
                smileyPanel.mo100204p(this.f207134f1 >= 3, false);
                smileyPanel.mo100203o(this.f207134f1 >= 3, false);
                smileyPanel.setShowStore(this.f207134f1 >= 2);
                if (this.f207134f1 < 2) {
                    z = false;
                }
                smileyPanel.setShowSearch(z);
                Object e = C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
                C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.String");
                smileyPanel.setTalkerName(Util.nullAs((String) e, ""));
                int i = ChatFooterPanel.f211589f;
                smileyPanel.setEntranceScene(18);
                smileyPanel.mo100188a();
                smileyPanel.setCallback(new C71517u(this));
            }
        } else {
            TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent8 = this.f207133f;
            if (textStatusEmojiPanelInputComponent8 != null) {
                textStatusEmojiPanelInputComponent8.setVisibility(4);
            }
            TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent9 = this.f207133f;
            if (textStatusEmojiPanelInputComponent9 != null) {
                textStatusEmojiPanelInputComponent9.setVisibility(8);
            }
            KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(this);
            this.f207125c1 = keyboardHeightProvider;
            keyboardHeightProvider.f220015b = this;
        }
        Object value = ((C36570n) this.f207086N).getValue();
        C87412m.m108593f(value, "<get-btnDelEmoji>(...)");
        ((View) value).setOnClickListener(new C71521v(this));
        Object value2 = ((C36570n) this.f207084M).getValue();
        C87412m.m108593f(value2, "<get-layoutEmojiView>(...)");
        ((View) value2).setOnClickListener(new C71524w(this));
    }

    public final void setBtnBack(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f207112X = view;
    }

    public final void setBtnOk(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f207106V = view;
    }

    public final void setBtnTag(View view) {
        this.f207103U = view;
    }

    public final void setFakePic(View view) {
        this.f207066D = view;
    }

    public final void setIconCamera(View view) {
        this.f207162r = view;
    }

    public final void setIconPoi(View view) {
        this.f207166t = view;
    }

    public final void setIconText(View view) {
        this.f207164s = view;
    }

    public final void setIconVisibility(View view) {
        this.f207170v = view;
    }

    public final void setLayoutBlurOption(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f207175x0 = view;
    }

    public final void setLayoutEditDesc(View view) {
        this.f207089P = view;
    }

    public final void setLayoutEditToolContainer(View view) {
        this.f207091Q = view;
    }

    public final void setLayoutTopicEdit(View view) {
        this.f207094R = view;
    }

    public final void setTvCancel(View view) {
        this.f207100T = view;
    }

    public final void setVPoi(View view) {
        this.f207157p = view;
    }

    public final void setVVisibility(View view) {
        this.f207160q = view;
    }

    public void showVKB() {
        Object systemService = getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (mo98563V7().getWindowToken() != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }

    /* renamed from: t8 */
    public final void mo98602t8() {
        String str = mo98558Q7().f147238g.f147088e;
        if (!(str == null || C112551y.m153811k(str))) {
            String m = IStatusIconHelperKt.m39109a().mo62301m(mo98558Q7().f147238g);
            TextView textView = this.f207136g;
            if (textView != null) {
                textView.setText(m);
            }
            TextStatusEmojiPanelInputComponent textStatusEmojiPanelInputComponent = this.f207133f;
            if (textStatusEmojiPanelInputComponent != null) {
                textStatusEmojiPanelInputComponent.setSmileySendButtonText(m);
            }
        }
    }

    /* renamed from: u8 */
    public final void mo98603u8() {
        if (this.f207116Y0 == 1) {
            C39674e eVar = C39674e.f106452d;
            C77459z zVar = this.f207113X0;
            String str = null;
            C48201c n0 = eVar.mo62253n0(zVar != null ? zVar.f229412t : null);
            if (n0 != null) {
                str = n0.field_visibilityInfo;
            }
            if (TextUtils.isEmpty(str) || str == null) {
                this.f207129d2 = TextStatusEditActivity.f206867L1.mo98498a();
                Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "initVisibility: isChangeDevice：" + this.f207129d2);
                if (this.f207129d2) {
                    View view = this.f207160q;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "initVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "initVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    return;
                }
                View view3 = this.f207160q;
                if (view3 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "initVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "initVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    this.f207099S1 = jSONObject.optInt("mLabelRangeindex");
                    String optString = jSONObject.optString("mLabelNameList");
                    C87412m.m108593f(optString, "jsonObject.optString(\"mLabelNameList\")");
                    this.f207102T1 = optString;
                    String optString2 = jSONObject.optString("mOtherUserNameList");
                    C87412m.m108593f(optString2, "jsonObject.optString(\"mOtherUserNameList\")");
                    this.f207105U1 = optString2;
                    String optString3 = jSONObject.optString("mChatRoomNameList");
                    C87412m.m108593f(optString3, "jsonObject.optString(\"mChatRoomNameList\")");
                    this.f207108V1 = optString3;
                    if (mo98605w8()) {
                        if (jSONObject.has("mLabelIdListString")) {
                            this.f207111W1.clear();
                            this.f207111W1.addAll(Util.stringToList(jSONObject.optString("mLabelIdListString"), ","));
                        }
                    }
                    Log.m105925i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "initVisibility: has:%s ,mLabelIdList :%s", Boolean.valueOf(jSONObject.has("mLabelIdListString")), this.f207111W1);
                } catch (Throwable unused) {
                }
                View view5 = this.f207160q;
                if (view5 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "initVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "initVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            View view7 = this.f207160q;
            if (view7 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(0);
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "initVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "initVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        mo98606x8();
        mo98540C8(this.f207099S1);
    }

    /* renamed from: v8 */
    public final boolean mo98604v8() {
        if (IStatusIconHelperKt.m39109a().mo62278H()) {
            return mo98579m8();
        }
        return true;
    }

    /* renamed from: w8 */
    public final boolean mo98605w8() {
        return ((Boolean) this.f207127d.getValue()).booleanValue();
    }

    /* renamed from: x8 */
    public final void mo98606x8() {
        ArrayList arrayList;
        this.f207124b2.clear();
        this.f207126c2 = 0;
        if (!Util.isNullOrNil(this.f207108V1)) {
            Object[] array = new C66723k(",").mo90760e(this.f207108V1, 0).toArray(new String[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            List<String> f = C64197v.m75537f(Arrays.copyOf(strArr, strArr.length));
            LinkedList<String> linkedList = this.f207124b2;
            LinkedList linkedList2 = new LinkedList();
            if (C86709a0.m107523b().mo121114l()) {
                for (String mX : f) {
                    List<String> mX2 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73728mX(mX);
                    if (mX2 != null) {
                        for (String next : mX2) {
                            if (!linkedList2.contains(next) && C45628s0.m50740E(next)) {
                                linkedList2.add(next);
                            }
                        }
                    }
                }
            }
            linkedList.addAll(linkedList2);
            this.f207126c2 |= 1;
        }
        if (!Util.isNullOrNil(this.f207102T1)) {
            Object[] array2 = new C66723k(",").mo90760e(this.f207102T1, 0).toArray(new String[0]);
            C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr2 = (String[]) array2;
            List<String> f2 = C64197v.m75537f(Arrays.copyOf(strArr2, strArr2.length));
            LinkedList<String> linkedList3 = this.f207124b2;
            if (f2.size() > 0) {
                HashSet hashSet = new HashSet();
                for (String f3 : f2) {
                    List<String> k = ((C67001a) C28250a.m38138a()).mo90973k(((C67001a) C28250a.m38138a()).mo90968f(f3));
                    if (k == null || k.size() == 0) {
                        break;
                    }
                    for (String add : k) {
                        hashSet.add(add);
                    }
                }
                arrayList = new ArrayList(hashSet);
            } else {
                arrayList = new ArrayList();
            }
            linkedList3.addAll(arrayList);
            this.f207126c2 |= 4;
        }
        if (!Util.isNullOrNil(this.f207105U1)) {
            Object[] array3 = new C66723k(",").mo90760e(this.f207105U1, 0).toArray(new String[0]);
            C87412m.m108592e(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr3 = (String[]) array3;
            this.f207124b2.addAll(C64197v.m75537f(Arrays.copyOf(strArr3, strArr3.length)));
            this.f207126c2 |= 2;
        }
    }

    /* renamed from: y8 */
    public final void mo98607y8() {
        Intent intent = new Intent();
        String str = mo98558Q7().f147247s;
        if (!(str == null || C112551y.m153811k(str))) {
            intent.putExtra("get_poi_classify_id", mo98558Q7().f147247s);
        }
        intent.putExtra("get_lat", mo98558Q7().f147236e);
        intent.putExtra("get_lng", mo98558Q7().f147235d);
        intent.putExtra("near_life_scene", 1);
        C88144b.m109795m(getContext(), "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", intent, 10);
        C5139t.m5183e(12, 10);
    }

    /* renamed from: z8 */
    public final void mo98608z8() {
        mo98572e8().setImageResource(this.f207123b1);
        mo98572e8().setVisibility(0);
        Object value = ((C36570n) this.f207064C).getValue();
        C87412m.m108593f(value, "<get-vBackGroundIcon>(...)");
        ((ImageView) value).setVisibility(0);
        FrameLayout frameLayout = this.f207068E;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        View Y7 = mo98566Y7();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = Y7;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "setDefBackGround", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Y7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity", "setDefBackGround", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
