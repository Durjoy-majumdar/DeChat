package com.tencent.p014mm.plugin.textstatus.p112ui;

import a03.C39477a;
import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a22.C67001a;
import ak1.C0073g0;
import ak1.C54097l0;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
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
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivity;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTPEffectVideoLayout;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.WCWebUpdater;
import d03.C58010a;
import di3.C86312j;
import dl3.C45413b;
import eb0.C45628s0;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import go3.C59600d;
import gy3.C8480h;
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
import kz2.C76658g;
import lc3.C10485b;
import lz2.C10699j;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76912y0;
import nj3.C88989a;
import org.json.JSONObject;
import p140cw.C7138g;
import p151er.C7774m;
import p158gt.C76057w;
import p204mr.C61568m;
import p232rw.C63679m;
import p232rw.C77572l;
import p232rw.C77573p;
import p232rw.C77574q;
import p232rw.C77575r;
import p447aw.C103918d;
import p640ox.C77049b;
import p682rz.C101488s;
import p740wo.C53193b;
import p823sg.C90193h;
import p914oj.C89231c;
import pe3.C47465a;
import qn3.C77382c;
import qo3.C77407n;
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
import vo3.C90852c;
import vz2.C78501d;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import yz2.C79272t1;
import yz2.C79275u1;
import z04.C112551y;
import z04.C119027c;
import z04.C66723k;
import zf1.C66800f;
import zt3.C119157j;
import zt3.C119179t;
import zv2.C103107b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bJ\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005KL\u0006MNB\u0007¢\u0006\u0004\bI\u0010JR$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR$\u0010 \u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000bR$\u0010$\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0007\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR$\u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0007\u001a\u0004\b&\u0010\t\"\u0004\b'\u0010\u000bR$\u0010,\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0007\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR$\u00100\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0007\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR$\u00104\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0007\u001a\u0004\b2\u0010\t\"\u0004\b3\u0010\u000bR$\u00108\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0007\u001a\u0004\b6\u0010\t\"\u0004\b7\u0010\u000bR$\u0010<\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0007\u001a\u0004\b:\u0010\t\"\u0004\b;\u0010\u000bR\"\u0010@\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u0012\n\u0004\b=\u0010\u0007\u001a\u0004\b>\u0010\t\"\u0004\b?\u0010\u000bR\"\u0010D\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u0012\n\u0004\bA\u0010\u0007\u001a\u0004\bB\u0010\t\"\u0004\bC\u0010\u000bR\"\u0010H\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u0012\n\u0004\bE\u0010\u0007\u001a\u0004\bF\u0010\t\"\u0004\bG\u0010\u000b¨\u0006O"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lcom/tencent/mm/emoji/view/EmojiPanelInputComponent$c;", "Lqn3/c$a;", "Lcom/tencent/mm/ui/tools/t0;", "Landroid/view/View;", "d", "Landroid/view/View;", "getEditLayout", "()Landroid/view/View;", "setEditLayout", "(Landroid/view/View;)V", "editLayout", "n", "getVPoi", "setVPoi", "vPoi", "o", "getVVisibility", "setVVisibility", "vVisibility", "p", "getIconCamera", "setIconCamera", "iconCamera", "q", "getIconText", "setIconText", "iconText", "r", "getIconPoi", "setIconPoi", "iconPoi", "t", "getIconVisibility", "setIconVisibility", "iconVisibility", "B", "getFakePic", "setFakePic", "fakePic", "M", "getLayoutEditDesc", "setLayoutEditDesc", "layoutEditDesc", "N", "getLayoutEditToolContainer", "setLayoutEditToolContainer", "layoutEditToolContainer", "P", "getLayoutTopicEdit", "setLayoutTopicEdit", "layoutTopicEdit", "S", "getTvCancel", "setTvCancel", "tvCancel", "T", "getBtnTag", "setBtnTag", "btnTag", "U", "N7", "setBtnOk", "btnOk", "W", "getBtnBack", "setBtnBack", "btnBack", "X", "V7", "setLayoutBlurOption", "layoutBlurOption", "<init>", "()V", "b", "c", "e", "f", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity */
public final class TextStatusEditActivity extends MMSecDataActivity implements EmojiPanelInputComponent.C68041c, C77382c.C77383a, C7020t0 {

    /* renamed from: L1 */
    public static final C71390b f206867L1 = new C71390b((C8480h) null);

    /* renamed from: M1 */
    public static final C13601g<MultiProcessMMKV> f206868M1 = C36568h.m40985a(C30495a.f82172d);

    /* renamed from: N1 */
    public static final String f206869N1 = "MMKV_KEY_LAST_STATUS_ROW_ID";

    /* renamed from: O1 */
    public static Bitmap f206870O1;

    /* renamed from: A */
    public final C13601g f206871A = C36568h.m40985a(new C71397d1(this));

    /* renamed from: A1 */
    public LinkedList<String> f206872A1;

    /* renamed from: B */
    public View f206873B;

    /* renamed from: B1 */
    public int f206874B1;

    /* renamed from: C */
    public FrameLayout f206875C;

    /* renamed from: C1 */
    public boolean f206876C1;

    /* renamed from: D */
    public final C13601g f206877D = C36568h.m40985a(new C71394c0(this));

    /* renamed from: D1 */
    public boolean f206878D1;

    /* renamed from: E */
    public final C13601g f206879E = C36568h.m40985a(new C71396d0(this));

    /* renamed from: E1 */
    public C77452i f206880E1;

    /* renamed from: F */
    public C59600d f206881F;

    /* renamed from: F1 */
    public C52678e0 f206882F1;

    /* renamed from: G */
    public ImageView f206883G;

    /* renamed from: G1 */
    public C30497f f206884G1;

    /* renamed from: H */
    public ImageView f206885H;

    /* renamed from: H1 */
    public String f206886H1;

    /* renamed from: I */
    public final C13601g f206887I = C36568h.m40985a(new C71391b0(this));

    /* renamed from: I1 */
    public boolean f206888I1;

    /* renamed from: J */
    public final C13601g f206889J = C36568h.m40985a(new C71418k(this));

    /* renamed from: J1 */
    public C71398e f206890J1;

    /* renamed from: K */
    public final C13601g f206891K = C36568h.m40985a(new C71388a0(this));

    /* renamed from: K1 */
    public ProgressDialog f206892K1;

    /* renamed from: L */
    public final C13601g f206893L = C36568h.m40985a(new C71403g(this));

    /* renamed from: M */
    public View f206894M;

    /* renamed from: N */
    public View f206895N;

    /* renamed from: P */
    public View f206896P;

    /* renamed from: Q */
    public final C13601g f206897Q = C36568h.m40985a(new C71392b1(this));

    /* renamed from: Q0 */
    public final C13601g f206898Q0 = C36568h.m40985a(new C71389a1(this));

    /* renamed from: R */
    public final C13601g f206899R = C36568h.m40985a(new C71441v(this));

    /* renamed from: R0 */
    public final C13601g f206900R0 = C36568h.m40985a(new C71447y(this));

    /* renamed from: S */
    public View f206901S;

    /* renamed from: S0 */
    public final C13601g f206902S0;

    /* renamed from: T */
    public View f206903T;

    /* renamed from: T0 */
    public C77459z f206904T0;

    /* renamed from: U */
    public View f206905U;

    /* renamed from: U0 */
    public int f206906U0;

    /* renamed from: V */
    public final C13601g f206907V = C36568h.m40985a(new C71420l(this));

    /* renamed from: V0 */
    public boolean f206908V0;

    /* renamed from: W */
    public View f206909W;

    /* renamed from: W0 */
    public C52718u f206910W0;

    /* renamed from: X */
    public View f206911X;

    /* renamed from: X0 */
    public int f206912X0;

    /* renamed from: Y */
    public ImageView f206913Y;

    /* renamed from: Y0 */
    public Bitmap f206914Y0;

    /* renamed from: Z */
    public final C13601g f206915Z = C36568h.m40985a(new C71443w(this));

    /* renamed from: Z0 */
    public MMTPEffectVideoLayout f206916Z0;

    /* renamed from: a1 */
    public int f206917a1;

    /* renamed from: b1 */
    public boolean f206918b1;

    /* renamed from: c1 */
    public final C13601g f206919c1;

    /* renamed from: d */
    public View f206920d;

    /* renamed from: d1 */
    public boolean f206921d1;

    /* renamed from: e */
    public EmojiPanelInputComponent f206922e;

    /* renamed from: e1 */
    public boolean f206923e1;

    /* renamed from: f */
    public TextView f206924f;

    /* renamed from: f1 */
    public long f206925f1;

    /* renamed from: g */
    public ImageView f206926g;

    /* renamed from: g1 */
    public long f206927g1;

    /* renamed from: h */
    public final C13601g f206928h = C36568h.m40985a(new C71400e1(this));

    /* renamed from: h1 */
    public Toast f206929h1;

    /* renamed from: i */
    public final C13601g f206930i = C36568h.m40985a(new C71405g1(this));

    /* renamed from: i1 */
    public final TextStatusEditActivity$statusExptSwitchChangeEventListener$1 f206931i1;

    /* renamed from: j */
    public final C13601g f206932j = C36568h.m40985a(new C71402f1(this));

    /* renamed from: j1 */
    public boolean f206933j1;

    /* renamed from: k1 */
    public final C71422m f206934k1;

    /* renamed from: l1 */
    public final TextStatusEditActivity$configUpdateListener$1 f206935l1;

    /* renamed from: m1 */
    public C30496d f206936m1;

    /* renamed from: n */
    public View f206937n;

    /* renamed from: n1 */
    public final TextWatcher f206938n1;

    /* renamed from: o */
    public View f206939o;

    /* renamed from: o1 */
    public String f206940o1;

    /* renamed from: p */
    public View f206941p;

    /* renamed from: p0 */
    public final C13601g f206942p0 = C36568h.m40985a(new C71445x(this));

    /* renamed from: p1 */
    public C76057w.C76058a f206943p1;

    /* renamed from: q */
    public View f206944q;

    /* renamed from: q1 */
    public Integer f206945q1;

    /* renamed from: r */
    public View f206946r;

    /* renamed from: r1 */
    public int f206947r1;

    /* renamed from: s */
    public final C13601g f206948s = C36568h.m40985a(new C71449z(this));

    /* renamed from: s1 */
    public String f206949s1;

    /* renamed from: t */
    public View f206950t;

    /* renamed from: t1 */
    public String f206951t1;

    /* renamed from: u */
    public MMEditText f206952u;

    /* renamed from: u1 */
    public String f206953u1;

    /* renamed from: v */
    public final C13601g f206954v = C36568h.m40985a(new C71439t0(this));

    /* renamed from: v1 */
    public ArrayList<String> f206955v1;

    /* renamed from: w */
    public final C13601g f206956w = C36568h.m40985a(new C71395c1(this));

    /* renamed from: w1 */
    public final View.OnClickListener f206957w1;

    /* renamed from: x */
    public TextView f206958x;

    /* renamed from: x0 */
    public final C13601g f206959x0 = C36568h.m40985a(new C71448y0(this));

    /* renamed from: x1 */
    public final View.OnClickListener f206960x1;

    /* renamed from: y */
    public final C13601g f206961y = C36568h.m40985a(new C71408h1(this));

    /* renamed from: y0 */
    public final C13601g f206962y0 = C36568h.m40985a(new C71450z0(this));

    /* renamed from: y1 */
    public long f206963y1;

    /* renamed from: z */
    public final C13601g f206964z = C36568h.m40985a(new C71413i1(this));

    /* renamed from: z1 */
    public final View.OnClickListener f206965z1;

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$a */
    public static final class C30495a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C30495a f82172d = new C30495a();

        public C30495a() {
            super(0);
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            String a = C13781a.m13082a();
            C87412m.m108593f(a, "username()");
            byte[] bytes = a.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            sb.append(C90193h.m112878f(bytes));
            sb.append("LastStatusId");
            return MultiProcessMMKV.getMMKV(sb.toString(), 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$d */
    public enum C30496d {
        NORMAL,
        BIG_EMOJI
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$f */
    public static final class C30497f {

        /* renamed from: a */
        public final String f82176a;

        /* renamed from: b */
        public final List<C65488a0> f82177b;

        public C30497f(String str, List<? extends C65488a0> list) {
            this.f82176a = str;
            this.f82177b = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30497f)) {
                return false;
            }
            C30497f fVar = (C30497f) obj;
            return C87412m.m108589b(this.f82176a, fVar.f82176a) && C87412m.m108589b(this.f82177b, fVar.f82177b);
        }

        public int hashCode() {
            String str = this.f82176a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<C65488a0> list = this.f82177b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "ThirdInfo(sourceId=" + this.f82176a + ", jumpInfos=" + this.f82177b + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$r0 */
    public static final class C30498r0 implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f82178d;

        public C30498r0(TextStatusEditActivity textStatusEditActivity) {
            this.f82178d = textStatusEditActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f82178d.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$s0 */
    public static final class C30499s0 implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C30499s0 f82179d = new C30499s0();

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$u */
    public static final class C30500u extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C30500u f82180d = new C30500u();

        public C30500u() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C77448f0.m93393e());
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$a0 */
    public static final class C71388a0 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206966d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71388a0(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f206966d = textStatusEditActivity;
        }

        public Object invoke() {
            return this.f206966d.findViewById(C0966R.C0970id.fkn);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$a1 */
    public static final class C71389a1 extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206967d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71389a1(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f206967d = textStatusEditActivity;
        }

        public Object invoke() {
            return (FrameLayout) this.f206967d.findViewById(C0966R.C0970id.kjc);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$b */
    public static final class C71390b {
        public C71390b(C8480h hVar) {
        }

        /* renamed from: c */
        public static /* synthetic */ void m83965c(C71390b bVar, Context context, C77459z zVar, boolean z, boolean z2, ResultReceiver resultReceiver, boolean z3, int i, Object obj) {
            bVar.mo98499b(context, zVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : resultReceiver, (i & 32) != 0 ? false : z3);
        }

        /* renamed from: a */
        public final boolean mo98498a() {
            String str;
            C48201c kD = C39674e.f106452d.mo62255t0().mo72970kD(C13781a.m13082a());
            if (kD == null || (str = Long.valueOf(kD.systemRowid).toString()) == null) {
                str = "";
            }
            Object value = ((C36570n) TextStatusEditActivity.f206868M1).getValue();
            C87412m.m108593f(value, "<get-mmkvLastStatusRowId>(...)");
            String string = ((MultiProcessMMKV) value).getString(TextStatusEditActivity.f206869N1, "error_default_string");
            SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
            boolean z = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("StatusPermissionNoChange", 0) == 1;
            Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "isChangeDevice: lastStatusId:" + string + " systemRowId:" + str + " switch:" + z);
            return !C87412m.m108589b(string, str) && z;
        }

        /* renamed from: b */
        public final void mo98499b(Context context, C77459z zVar, boolean z, boolean z2, ResultReceiver resultReceiver, boolean z3) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(zVar, "params");
            Intent intent = new Intent(context, TextStatusEditActivity.class);
            if (z) {
                intent.addFlags(TPMediaCodecProfileLevel.HEVCHighTierLevel62);
            }
            intent.putExtra("ACTION_NEED_HANDLE_LAST_RESP", z2);
            intent.putExtra("SET_TEXT_PARAMS", zVar.toByteArray());
            intent.putExtra("CALLBACK", resultReceiver);
            intent.putExtra("KEY_IS_FROM_RECENT_STATUS", z3);
            boolean z4 = context instanceof Activity;
            if (!z4) {
                intent.addFlags(268435456);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/SetStatusParam;ZZLandroid/os/ResultReceiver;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/SetStatusParam;ZZLandroid/os/ResultReceiver;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            Activity activity = z4 ? (Activity) context : null;
            if (activity != null) {
                activity.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$b0 */
    public static final class C71391b0 extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206968d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71391b0(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f206968d = textStatusEditActivity;
        }

        public Object invoke() {
            return (LinearLayout) this.f206968d.findViewById(C0966R.C0970id.f358528fl3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$b1 */
    public static final class C71392b1 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206969d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71392b1(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f206969d = textStatusEditActivity;
        }

        public Object invoke() {
            return this.f206969d.findViewById(C0966R.C0970id.ksb);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$c */
    public interface C71393c {
        /* renamed from: b */
        void mo98500b(String str);
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$c0 */
    public static final class C71394c0 extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206970d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71394c0(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f206970d = textStatusEditActivity;
        }

        public Object invoke() {
            return (FrameLayout) this.f206970d.findViewById(C0966R.C0970id.fl_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$c1 */
    public static final class C71395c1 extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206971d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71395c1(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f206971d = textStatusEditActivity;
        }

        public Object invoke() {
            return (TextView) this.f206971d.findViewById(C0966R.C0970id.kxe);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$d0 */
    public static final class C71396d0 extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206972d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71396d0(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f206972d = textStatusEditActivity;
        }

        public Object invoke() {
            return (FrameLayout) this.f206972d.findViewById(C0966R.C0970id.fla);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$d1 */
    public static final class C71397d1 extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206973d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71397d1(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f206973d = textStatusEditActivity;
        }

        public Object invoke() {
            return (ImageView) this.f206973d.findViewById(C0966R.C0970id.m8p);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$e */
    public static final class C71398e {

        /* renamed from: a */
        public C52718u f206974a;

        /* renamed from: b */
        public String f206975b;

        /* renamed from: c */
        public String f206976c;

        /* renamed from: d */
        public int f206977d;

        /* renamed from: e */
        public boolean f206978e;

        /* renamed from: f */
        public boolean f206979f = true;

        /* renamed from: g */
        public long f206980g;

        /* renamed from: h */
        public long f206981h;

        /* renamed from: i */
        public String f206982i = "";

        /* renamed from: j */
        public long f206983j;

        public C71398e(C52718u uVar) {
            C87412m.m108594g(uVar, "curTextStatusExtInfo");
            this.f206974a = uVar;
        }

        /* renamed from: a */
        public final void mo98501a(Context context) {
            C78318v1 v1Var;
            Class cls = C78318v1.class;
            Class cls2 = C77049b.class;
            int i = this.f206977d;
            if (i == 2) {
                C78318v1 v1Var2 = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context, 8, cls);
                if (v1Var2 != null) {
                    v1Var2.f229510p = this.f206980g * 1000;
                    v1Var2.f229512q = this.f206983j;
                    v1Var2.f229481S = (int) this.f206981h;
                    v1Var2.f229483T = this.f206982i;
                }
            } else if (i == 1 && (v1Var = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context, 8, cls)) != null) {
                v1Var.f229510p = 0;
                v1Var.f229512q = this.f206983j;
                v1Var.f229481S = (int) this.f206981h;
                v1Var.f229483T = this.f206982i;
            }
        }

        /* renamed from: b */
        public final void mo98502b() {
            this.f206975b = null;
            this.f206976c = null;
            this.f206977d = 0;
            this.f206978e = false;
            this.f206979f = true;
            this.f206980g = 0;
            this.f206981h = 0;
            this.f206982i = "";
            this.f206983j = 0;
        }

        /* renamed from: c */
        public final void mo98503c(C77459z zVar, String str, Context context) {
            C87412m.m108594g(context, "context");
            mo98502b();
            if (zVar != null) {
                String str2 = zVar.f229400e;
                if (!(str2 == null || C112551y.m153811k(str2))) {
                    int i = zVar.f229399d.f147237f;
                    if (i == 1) {
                        this.f206977d = 1;
                        if (!TextUtils.isEmpty(str)) {
                            String b = C78123i.f228932a.mo108105b(str);
                            this.f206975b = b;
                            this.f206976c = b;
                        }
                        this.f206979f = false;
                    } else if (i == 2) {
                        this.f206977d = 2;
                        this.f206975b = str;
                        if (str != null) {
                            C63679m.C63680a M1 = ((C63679m) C86312j.m106911c(C63679m.class)).mo88483M1(str);
                            this.f206980g = (M1 != null ? M1.f180528d : 0) / ((long) 1000);
                        }
                        this.f206979f = false;
                        this.f206978e = true;
                    }
                }
            }
            long l = C86013q1.m106451l(this.f206975b);
            this.f206983j = l;
            this.f206981h = l;
            this.f206982i = C90193h.m112876d(this.f206975b);
            mo98501a(context);
            Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "[updateFromSetStatusParam] oriLen:" + this.f206981h + " finalLen:" + this.f206983j + " type:" + this.f206977d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$e0 */
    public static final class C71399e0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206984d;

        public C71399e0(TextStatusEditActivity textStatusEditActivity) {
            this.f206984d = textStatusEditActivity;
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
                java.lang.String r0 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$locationClickListener$1"
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
                java.lang.String r4 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$locationClickListener$1"
                r5 = 0
                java.lang.String r8 = "android.permission.ACCESS_COARSE_LOCATION"
                java.lang.String r9 = "android.permission.ACCESS_FINE_LOCATION"
                r10 = 1
                if (r0 == 0) goto L_0x00c2
                di3.d r0 = di3.C86312j.m106911c(r7)
                aw.d r0 = (p447aw.C103918d) r0
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity r11 = r6.f206984d
                androidx.appcompat.app.AppCompatActivity r11 = r11.getContext()
                boolean r0 = r0.Lb0(r11, r9)
                if (r0 == 0) goto L_0x0073
                di3.d r0 = di3.C86312j.m106911c(r7)
                aw.d r0 = (p447aw.C103918d) r0
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity r11 = r6.f206984d
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
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity r0 = r6.f206984d
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity r7 = r6.f206984d
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
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity r5 = r6.f206984d
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
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity r0 = r6.f206984d
                androidx.appcompat.app.AppCompatActivity r12 = r0.getContext()
                java.lang.String[] r13 = new java.lang.String[]{r9, r8}
                r14 = 64
                r15 = 0
                r16 = 0
                boolean r0 = r11.Uu0(r12, r13, r14, r15, r16)
                java.lang.Object[] r7 = new java.lang.Object[r10]
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
                r7[r5] = r8
                java.lang.String r5 = "MicroMsg.TextStatus.TextStatusEditActivity"
                java.lang.String r8 = "summerper checkPermission checkLocation[%b]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r7)
                if (r0 != 0) goto L_0x00f2
                j20.C117292a.m165361g(r6, r4, r3, r2, r1)
                return
            L_0x00f2:
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity r0 = r6.f206984d
                r0.mo98468n8()
                j20.C117292a.m165361g(r6, r4, r3, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity.C71399e0.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$e1 */
    public static final class C71400e1 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206985d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71400e1(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f206985d = textStatusEditActivity;
        }

        public Object invoke() {
            return this.f206985d.findViewById(C0966R.C0970id.l2v);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$f0 */
    public static final class C71401f0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206986d;

        public C71401f0(TextStatusEditActivity textStatusEditActivity) {
            this.f206986d = textStatusEditActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f206986d.f206960x1.onClick(view);
            AppCompatActivity context = this.f206986d.getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
            if (v1Var != null) {
                v1Var.f229468G++;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$f1 */
    public static final class C71402f1 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206987d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71402f1(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f206987d = textStatusEditActivity;
        }

        public Object invoke() {
            return this.f206987d.findViewById(C0966R.C0970id.l2z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$g */
    public static final class C71403g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206988d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71403g(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f206988d = textStatusEditActivity;
        }

        public Object invoke() {
            return this.f206988d.findViewById(C0966R.C0970id.ali);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$g0 */
    public static final class C71404g0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206989d;

        public C71404g0(TextStatusEditActivity textStatusEditActivity) {
            this.f206989d = textStatusEditActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f206989d.getClass();
            Editable text = this.f206989d.mo98449T7().getText();
            if (text != null) {
                text.insert(this.f206989d.mo98449T7().getSelectionStart(), this.f206989d.getContext().getString(C0966R.string.f361426jt2));
            }
            this.f206989d.mo98449T7().requestFocus();
            Object systemService = this.f206989d.getContext().getSystemService("input_method");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(this.f206989d.mo98449T7(), 0);
            AppCompatActivity context = this.f206989d.getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
            if (v1Var != null) {
                v1Var.f229465D++;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$g1 */
    public static final class C71405g1 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206990d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71405g1(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f206990d = textStatusEditActivity;
        }

        public Object invoke() {
            return this.f206990d.findViewById(C0966R.C0970id.f359474l30);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$h */
    public static final class C71406h extends C87413o implements C32224a<ResultReceiver> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206991d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71406h(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f206991d = textStatusEditActivity;
        }

        public Object invoke() {
            return (ResultReceiver) this.f206991d.getIntent().getParcelableExtra("CALLBACK");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$h0 */
    public static final class C71407h0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206992d;

        public C71407h0(TextStatusEditActivity textStatusEditActivity) {
            this.f206992d = textStatusEditActivity;
        }

        public final void onClick(View view) {
            int i;
            Class cls = C78318v1.class;
            Class cls2 = C77049b.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AppCompatActivity context = this.f206992d.getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context, 8, cls);
            if (v1Var != null) {
                v1Var.f229464C++;
            }
            if (this.f206992d.f206906U0 == 1 || IStatusIconHelperKt.m39109a().mo62278H() || IStatusIconHelperKt.m39109a().mo62275E()) {
                TextStatusEditActivity textStatusEditActivity = this.f206992d;
                textStatusEditActivity.getClass();
                String string = textStatusEditActivity.getString((IStatusIconHelperKt.m39109a().mo62275E() || IStatusIconHelperKt.m39109a().mo62278H()) ? C0966R.string.mtx : C0966R.string.iur);
                C87412m.m108593f(string, "getString(stringRes)");
                textStatusEditActivity.mo98491t8(string);
                C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (IStatusIconHelperKt.m39109a().mo62312x() || IStatusIconHelperKt.m39109a().mo62311w()) {
                C78318v1 v1Var2 = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(this.f206992d, 8, cls);
                int i2 = 0;
                if (v1Var2 != null) {
                    i2 = (int) v1Var2.f229497a1;
                    i = (int) v1Var2.f229498b1;
                } else {
                    i = 0;
                }
                TextStatusDoWhatActivityV2.C5642a aVar = TextStatusDoWhatActivityV2.f206792X0;
                TextStatusEditActivity textStatusEditActivity2 = this.f206992d;
                int i3 = textStatusEditActivity2.f206912X0;
                String str = textStatusEditActivity2.mo98445P7().f147238g.f147092i;
                String str2 = this.f206992d.mo98445P7().f147238g.f147088e;
                C87412m.m108594g(textStatusEditActivity2, "context");
                Intent intent = new Intent(textStatusEditActivity2, TextStatusDoWhatActivityV2.class);
                intent.putExtra("KEY_DEFAULT_BACKGROUND_ID", i3);
                intent.putExtra("KEY_CUSTOM_TITLE", str);
                intent.putExtra("KEY_ICON_ID", str2);
                intent.putExtra("KEY_CLK_USER_DEFINE_ICON_COUNT", i2);
                intent.putExtra("KEY_CLK_ADD_ICON_TO_CUSTOM_TITLE_COUNT", i);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(3);
                aVar2.mo10233c(intent);
                C117292a.m165364j(textStatusEditActivity2, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$Companion", "startForResultInEdit", "(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;II)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                textStatusEditActivity2.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
            } else {
                TextStatusDoWhatActivity.C5638a aVar3 = TextStatusDoWhatActivity.f206763C;
                TextStatusEditActivity textStatusEditActivity3 = this.f206992d;
                aVar3.mo6662b(textStatusEditActivity3, textStatusEditActivity3.f206912X0, textStatusEditActivity3.mo98445P7().f147238g.f147092i);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$h1 */
    public static final class C71408h1 extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206993d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71408h1(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f206993d = textStatusEditActivity;
        }

        public Object invoke() {
            return (ImageView) this.f206993d.findViewById(C0966R.C0970id.l37);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$i */
    public static final class C71409i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206994d;

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$i$a */
        public static final class C71410a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ TextStatusEditActivity f206995d;

            public C71410a(TextStatusEditActivity textStatusEditActivity) {
                this.f206995d = textStatusEditActivity;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                Class cls = C8808v4.class;
                boolean z = false;
                e0Var.mo107154n(C0966R.C0970id.gs6, this.f206995d.getString(C0966R.string.jzb), this.f206995d.getString(C0966R.string.f7985yd), 0);
                e0Var.mo107142f(C0966R.C0970id.gsa, this.f206995d.getString(C0966R.string.iqt));
                SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
                if (!((C8808v4) C86312j.m106911c(cls)).mo9635e() || ((C8808v4) C86312j.m106911c(cls)).mo9636zX()) {
                    TextStatusEditActivity textStatusEditActivity = this.f206995d;
                    textStatusEditActivity.getClass();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    Drawable drawable = textStatusEditActivity.getDrawable(C0966R.C0969drawable.bps);
                    C74933u4.m89769f(drawable, Color.parseColor("#F99234"));
                    int dimensionPixelSize = textStatusEditActivity.getResources().getDimensionPixelSize(C0966R.dimen.f3880hp);
                    C39477a aVar = new C39477a(drawable, 1);
                    drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    spannableStringBuilder.append(8199);
                    spannableStringBuilder.setSpan(aVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
                    spannableStringBuilder.append(textStatusEditActivity.getString(C0966R.string.grq));
                    e0Var.mo107142f(C0966R.C0970id.gs_, spannableStringBuilder);
                }
                C71398e O7 = this.f206995d.mo98444O7();
                if (!O7.f206979f && !TextUtils.isEmpty(O7.f206975b)) {
                    z = true;
                }
                if (z || this.f206995d.f206881F != null) {
                    e0Var.mo107140d(C0966R.C0970id.gs9, this.f206995d.getResources().getColor(C0966R.color.f2966ao), this.f206995d.getString(C0966R.string.grv));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$i$b */
        public static final class C71411b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ TextStatusEditActivity f206996d;

            public C71411b(TextStatusEditActivity textStatusEditActivity) {
                this.f206996d = textStatusEditActivity;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                String str;
                CharSequence text;
                Class cls = C78318v1.class;
                Class cls2 = C77049b.class;
                int itemId = menuItem.getItemId();
                if (itemId == C0966R.C0970id.gs6) {
                    AppCompatActivity context = this.f206996d.getContext();
                    C87412m.m108593f(context, "context");
                    C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context, 8, cls);
                    if (v1Var != null) {
                        v1Var.f229485U++;
                    }
                    TextStatusEditActivity textStatusEditActivity = this.f206996d;
                    C71390b bVar = TextStatusEditActivity.f206867L1;
                    textStatusEditActivity.mo98457b8();
                } else if (itemId == C0966R.C0970id.gsa) {
                    AppCompatActivity context2 = this.f206996d.getContext();
                    C87412m.m108593f(context2, "context");
                    C78318v1 v1Var2 = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context2, 8, cls);
                    if (v1Var2 != null) {
                        v1Var2.f229487V++;
                    }
                    TextStatusEditActivity textStatusEditActivity2 = this.f206996d;
                    C71390b bVar2 = TextStatusEditActivity.f206867L1;
                    textStatusEditActivity2.getClass();
                    Intent intent = new Intent();
                    intent.putExtra("key_edit_video_max_time_length", ((C77573p) C86312j.m106911c(C77573p.class)).uc0().mo106175b());
                    intent.putExtra("key_edit_text_color", "#0E9CE6");
                    intent.putExtra("album_is_from_text_status", true);
                    intent.putExtra("edt_video_layout_from_text_status", "com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout");
                    AppCompatActivity context3 = textStatusEditActivity2.getContext();
                    C87412m.m108592e(context3, "null cannot be cast to non-null type android.app.Activity");
                    ((C7138g) C86312j.m106911c(C7138g.class)).mo8324nq(context3, 6, 1, 22, 3, false, intent);
                } else if (itemId == C0966R.C0970id.gs_) {
                    TextStatusEditActivity textStatusEditActivity3 = this.f206996d;
                    C71390b bVar3 = TextStatusEditActivity.f206867L1;
                    Editable text2 = textStatusEditActivity3.mo98449T7().getText();
                    C65493r rVar = new C65493r();
                    rVar.f188461d = textStatusEditActivity3.mo98445P7().f147238g.f147088e;
                    Matcher matcher = C39718p.f106570b.matcher(text2.toString());
                    while (matcher.find()) {
                        rVar.f188464g.add(matcher.group(1));
                    }
                    TextView textView = textStatusEditActivity3.f206924f;
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
                    textStatusEditActivity3.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
                    ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76880tQ(textStatusEditActivity3, intent2, 8);
                } else if (itemId == C0966R.C0970id.gs9) {
                    AppCompatActivity context4 = this.f206996d.getContext();
                    C87412m.m108593f(context4, "context");
                    C78318v1 v1Var3 = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context4, 8, cls);
                    if (v1Var3 != null) {
                        v1Var3.f229496Z0++;
                    }
                    TextStatusEditActivity textStatusEditActivity4 = this.f206996d;
                    C71390b bVar4 = TextStatusEditActivity.f206867L1;
                    textStatusEditActivity4.mo98438I7();
                }
            }
        }

        public C71409i(TextStatusEditActivity textStatusEditActivity) {
            this.f206994d = textStatusEditActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$cameraClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - this.f206994d.f206963y1) < 1000) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$cameraClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            TextStatusEditActivity textStatusEditActivity = this.f206994d;
            textStatusEditActivity.f206963y1 = currentTimeMillis;
            LayoutInflater.from(textStatusEditActivity);
            C77407n nVar = new C77407n((Context) textStatusEditActivity, 1, false);
            C76874e0 e0Var = new C76874e0(textStatusEditActivity);
            new C76874e0(textStatusEditActivity);
            TextStatusEditActivity textStatusEditActivity2 = this.f206994d;
            C71410a aVar = new C71410a(textStatusEditActivity2);
            C71411b bVar = new C71411b(textStatusEditActivity2);
            e0Var.clear();
            C76874e0 e0Var2 = new C76874e0(textStatusEditActivity);
            aVar.onCreateMMMenu(e0Var2);
            if (e0Var2.mo107176v()) {
                Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                nVar.f225771i = aVar;
                nVar.f225782p = bVar;
                nVar.f225761d = null;
                nVar.f225725D = null;
                nVar.mo107573q();
            }
            AppCompatActivity context = this.f206994d.getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
            if (v1Var != null) {
                v1Var.f229466E++;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$cameraClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$i0 */
    public static final class C71412i0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206997d;

        public C71412i0(TextStatusEditActivity textStatusEditActivity) {
            this.f206997d = textStatusEditActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f206997d.f206960x1.onClick(view);
            AppCompatActivity context = this.f206997d.getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
            if (v1Var != null) {
                v1Var.f229467F++;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$i1 */
    public static final class C71413i1 extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206998d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71413i1(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f206998d = textStatusEditActivity;
        }

        public Object invoke() {
            return (ImageView) this.f206998d.findViewById(C0966R.C0970id.m8q);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$j */
    public static final class C71414j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f206999d;

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$j$a */
        public static final class C71415a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ TextStatusEditActivity f207000d;

            public C71415a(TextStatusEditActivity textStatusEditActivity) {
                this.f207000d = textStatusEditActivity;
            }

            public final void run() {
                ProgressDialog progressDialog = this.f207000d.f206892K1;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                this.f207000d.mo98441L7();
            }
        }

        public C71414j(TextStatusEditActivity textStatusEditActivity) {
            this.f206999d = textStatusEditActivity;
        }

        public final void run() {
            C71398e O7 = this.f206999d.mo98444O7();
            int i = this.f206999d.mo98444O7().f206977d;
            String str = "";
            if (i == 1) {
                C78123i iVar = C78123i.f228932a;
                String str2 = this.f206999d.mo98444O7().f206975b;
                if (str2 != null) {
                    str = str2;
                }
                str = iVar.mo108107d(str);
            } else if (i == 2) {
                TextStatusEditActivity textStatusEditActivity = this.f206999d;
                String str3 = textStatusEditActivity.mo98444O7().f206975b;
                if (str3 != null) {
                    str = str3;
                }
                str = textStatusEditActivity.mo98442M7(str);
            }
            O7.f206976c = str;
            ((C119157j) C119157j.f356862d).mo183895z(new C71415a(this.f206999d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$j0 */
    public static final class C71416j0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207001d;

        public C71416j0(TextStatusEditActivity textStatusEditActivity) {
            this.f207001d = textStatusEditActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f207001d.getClass();
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$j1 */
    public static final class C71417j1 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207002d;

        public C71417j1(TextStatusEditActivity textStatusEditActivity) {
            this.f207002d = textStatusEditActivity;
        }

        public final void onClick(View view) {
            ArrayList<String> arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(view);
            Object[] array = arrayList2.toArray();
            arrayList2.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$visibilityClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TextStatusEditActivity textStatusEditActivity = this.f207002d;
            C71390b bVar = TextStatusEditActivity.f206867L1;
            Intent className = textStatusEditActivity.mo98466l8() ? new Intent().setClassName(this.f207002d, "com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI") : new Intent().setClassName(this.f207002d, "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            C87412m.m108593f(className, "if (isDynamicLabelOpen) …ui.SnsLabelUI\")\n        }");
            if (this.f207002d.mo98466l8() && (arrayList = this.f207002d.f206955v1) != null) {
                className.putStringArrayListExtra("label_id", arrayList);
            }
            className.putExtra("KLabel_range_index", this.f207002d.f206947r1);
            className.putExtra("Klabel_name_list", this.f207002d.f206949s1);
            className.putExtra("Kother_user_name_list", this.f207002d.f206951t1);
            className.putExtra("Kchat_room_name_list", this.f207002d.f206953u1);
            className.putExtra("Kis_from_text_status", true);
            className.putExtra("k_show_private", false);
            className.putExtra("k_show_include", false);
            this.f207002d.getClass();
            className.putExtra("k_sns_label_ui_style", 0);
            this.f207002d.startActivityForResult(className, 4);
            AppCompatActivity context = this.f207002d.getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
            if (v1Var != null) {
                v1Var.f229470I++;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$visibilityClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$k */
    public static final class C71418k extends C87413o implements C32224a<EmojiStatusView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207003d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71418k(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f207003d = textStatusEditActivity;
        }

        public Object invoke() {
            return (EmojiStatusView) this.f207003d.findViewById(C0966R.C0970id.cie);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$k0 */
    public static final class C71419k0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207004d;

        public C71419k0(TextStatusEditActivity textStatusEditActivity) {
            this.f207004d = textStatusEditActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f207004d.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$l */
    public static final class C71420l extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207005d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71420l(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f207005d = textStatusEditActivity;
        }

        public Object invoke() {
            return this.f207005d.findViewById(C0966R.C0970id.cry);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$l0 */
    public static final class C71421l0 implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207006d;

        public C71421l0(TextStatusEditActivity textStatusEditActivity) {
            this.f207006d = textStatusEditActivity;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f207006d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$m */
    public static final class C71422m implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207007d;

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$m$a */
        public static final class C71423a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ TextStatusEditActivity f207008d;

            /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$m$a$a */
            public static final class C71424a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ TextStatusEditActivity f207009d;

                public C71424a(TextStatusEditActivity textStatusEditActivity) {
                    this.f207009d = textStatusEditActivity;
                }

                public final void run() {
                    Object systemService = this.f207009d.getContext().getSystemService("input_method");
                    C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).showSoftInput(this.f207009d.mo98449T7(), 0);
                }
            }

            public C71423a(TextStatusEditActivity textStatusEditActivity) {
                this.f207008d = textStatusEditActivity;
            }

            public final void run() {
                this.f207008d.mo98449T7().requestFocus();
                C119179t tVar = C119157j.f356862d;
                C71424a aVar = new C71424a(this.f207008d);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(aVar, 200, false);
            }
        }

        public C71422m(TextStatusEditActivity textStatusEditActivity) {
            this.f207007d = textStatusEditActivity;
        }

        public void onGlobalLayout() {
            this.f207007d.mo98449T7().post(new C71423a(this.f207007d));
            this.f207007d.mo98449T7().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$m0 */
    public static final class C71425m0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207010d;

        public C71425m0(TextStatusEditActivity textStatusEditActivity) {
            this.f207010d = textStatusEditActivity;
        }

        public final void run() {
            TextStatusEditActivity textStatusEditActivity = this.f207010d;
            if (textStatusEditActivity.f206883G != null) {
                textStatusEditActivity.getClass();
            } else {
                C87412m.m108603p("vBack");
                throw null;
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$goCapture$1", mo125469f = "TextStatusEditActivity.kt", mo125470l = {2114}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$n */
    public static final class C71426n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f207011d;

        /* renamed from: e */
        public final /* synthetic */ ComponentActivity f207012e;

        /* renamed from: f */
        public final /* synthetic */ RecordConfigProvider f207013f;

        /* renamed from: g */
        public final /* synthetic */ TextStatusEditActivity f207014g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71426n(ComponentActivity componentActivity, RecordConfigProvider recordConfigProvider, TextStatusEditActivity textStatusEditActivity, C15601d<? super C71426n> dVar) {
            super(2, dVar);
            this.f207012e = componentActivity;
            this.f207013f = recordConfigProvider;
            this.f207014g = textStatusEditActivity;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C71426n(this.f207012e, this.f207013f, this.f207014g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C71426n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f207011d;
            int i2 = 1;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ComponentActivity componentActivity = this.f207012e;
                RecordConfigProvider recordConfigProvider = this.f207013f;
                this.f207011d = 1;
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
                    AppCompatActivity context = this.f207014g.getContext();
                    C87412m.m108593f(context, "context");
                    C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
                    if (v1Var != null) {
                        Object b = recordMediaReportInfo.mo129811b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", new Long(0));
                        C87412m.m108593f(b, "reportInfo.getReportValu…DIA_DURATION_MS_LONG, 0L)");
                        v1Var.f229509o = ((Number) b).longValue();
                        v1Var.f229513r = (long) (((Number) recordMediaReportInfo.mo129811b("KEY_MEDIA_SOURCE_INT", new Integer(0))).intValue() + 1);
                    }
                }
                TextStatusEditActivity textStatusEditActivity = this.f207014g;
                C77574q qVar = rVar.f226149d;
                C71390b bVar = TextStatusEditActivity.f206867L1;
                textStatusEditActivity.getClass();
                if (qVar != null) {
                    String str = qVar.mo107740b() ? qVar.f226144c : qVar.f226143b;
                    String str2 = qVar.f226143b;
                    Log.m105925i("MicroMsg.TextStatus.TextStatusEditActivity", "[handleCaptureResult]isVideo:%s,thumbPath:%s,filePath:%s", Boolean.valueOf(qVar.mo107740b()), str, str2);
                    textStatusEditActivity.mo98438I7();
                    C71398e O7 = textStatusEditActivity.mo98444O7();
                    AppCompatActivity context2 = textStatusEditActivity.getContext();
                    C87412m.m108593f(context2, "context");
                    O7.mo98502b();
                    C76252b.m91659c(O7.f206974a);
                    O7.f206979f = false;
                    if (qVar.mo107740b()) {
                        O7.f206977d = 2;
                        O7.f206975b = qVar.f226143b;
                        O7.f206976c = qVar.f226144c;
                        O7.f206980g = qVar.f226145d;
                    } else {
                        O7.f206977d = 1;
                        O7.f206975b = qVar.f226143b;
                        O7.f206978e = true;
                    }
                    long l = C86013q1.m106451l(O7.f206975b);
                    O7.f206983j = l;
                    O7.f206981h = l;
                    O7.f206982i = C90193h.m112876d(O7.f206975b);
                    O7.mo98501a(context2);
                    if (qVar.mo107740b()) {
                        i2 = 2;
                    }
                    textStatusEditActivity.mo98459d8(str2, i2);
                    textStatusEditActivity.mo98493v8();
                    textStatusEditActivity.mo98497z8();
                    textStatusEditActivity.mo98494w8();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$n0 */
    public static final class C71427n0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207015d;

        public C71427n0(TextStatusEditActivity textStatusEditActivity) {
            this.f207015d = textStatusEditActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f207015d.mo98443N7().isEnabled()) {
                this.f207015d.mo4084L3((String) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            TextStatusEditActivity textStatusEditActivity = this.f207015d;
            textStatusEditActivity.mo4086P4(textStatusEditActivity.mo98449T7().getText().toString());
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
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$o */
    public static final class C71428o implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207016d;

        public C71428o(TextStatusEditActivity textStatusEditActivity) {
            this.f207016d = textStatusEditActivity;
        }

        public final void run() {
            Object value = ((C36570n) this.f207016d.f206954v).getValue();
            C87412m.m108593f(value, "<get-scrollview>(...)");
            ((NestedScrollView) value).mo144970f(130);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$o0 */
    public static final class C71429o0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207017d;

        public C71429o0(TextStatusEditActivity textStatusEditActivity) {
            this.f207017d = textStatusEditActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f207017d.mo4084L3((String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$p */
    public static final class C71430p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f207018d;

        /* renamed from: e */
        public final /* synthetic */ TextStatusEditActivity f207019e;

        public C71430p(String str, TextStatusEditActivity textStatusEditActivity) {
            this.f207018d = str;
            this.f207019e = textStatusEditActivity;
        }

        public final void run() {
            Bitmap b = C76658g.m92308b(this.f207018d);
            Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "handleFileLocal decodeImg bitmap:" + b);
            TextStatusEditActivity textStatusEditActivity = this.f207019e;
            C71390b bVar = TextStatusEditActivity.f206867L1;
            textStatusEditActivity.getClass();
            if (b != null) {
                Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "setForegroundPic vpic post start " + b + ' ' + true);
                textStatusEditActivity.mo98456a8().post(new C79272t1(b, textStatusEditActivity));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$p0 */
    public static final class C71431p0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207020d;

        public C71431p0(TextStatusEditActivity textStatusEditActivity) {
            this.f207020d = textStatusEditActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f207020d.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$q */
    public static final class C71432q implements C76057w.C76058a {

        /* renamed from: a */
        public final /* synthetic */ String f207021a;

        /* renamed from: b */
        public final /* synthetic */ TextStatusEditActivity f207022b;

        /* renamed from: c */
        public final /* synthetic */ C71393c f207023c;

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$q$a */
        public static final class C71433a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f207024d;

            /* renamed from: e */
            public final /* synthetic */ TextStatusEditActivity f207025e;

            /* renamed from: f */
            public final /* synthetic */ C71393c f207026f;

            /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$q$a$a */
            public static final class C71434a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ TextStatusEditActivity f207027d;

                /* renamed from: e */
                public final /* synthetic */ String f207028e;

                /* renamed from: f */
                public final /* synthetic */ C71393c f207029f;

                public C71434a(TextStatusEditActivity textStatusEditActivity, String str, C71393c cVar) {
                    this.f207027d = textStatusEditActivity;
                    this.f207028e = str;
                    this.f207029f = cVar;
                }

                public final void run() {
                    TextStatusEditActivity textStatusEditActivity = this.f207027d;
                    String str = this.f207028e;
                    C71390b bVar = TextStatusEditActivity.f206867L1;
                    textStatusEditActivity.mo98459d8(str, 1);
                    this.f207027d.mo98493v8();
                    C71393c cVar = this.f207029f;
                    if (cVar != null) {
                        cVar.mo98500b(this.f207028e);
                    }
                }
            }

            public C71433a(Bitmap bitmap, TextStatusEditActivity textStatusEditActivity, C71393c cVar) {
                this.f207024d = bitmap;
                this.f207025e = textStatusEditActivity;
                this.f207026f = cVar;
            }

            public final void run() {
                C39696f fVar = C39696f.f106501a;
                String a = C13781a.m13082a();
                C87412m.m108593f(a, "username()");
                String d = fVar.mo62321d("ptmptmb", a);
                C76658g.m92309c(this.f207024d, d);
                TextStatusEditActivity textStatusEditActivity = this.f207025e;
                C71390b bVar = TextStatusEditActivity.f206867L1;
                textStatusEditActivity.mo98456a8().post(new C71434a(this.f207025e, d, this.f207026f));
            }
        }

        public C71432q(String str, TextStatusEditActivity textStatusEditActivity, C71393c cVar) {
            this.f207021a = str;
            this.f207022b = textStatusEditActivity;
            this.f207023c = cVar;
        }

        /* renamed from: a */
        public final void mo25933a(String str, Bitmap bitmap, String str2) {
            boolean k = C86013q1.m106450k(str2);
            Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "trydownload imgback end:" + this.f207021a + " path:" + str2 + " bitmap:" + bitmap + " exist:" + k + " len:" + C86013q1.m106451l(str2));
            if (bitmap != null) {
                if (!k) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C71433a(bitmap, this.f207022b, this.f207023c));
                    return;
                }
                TextStatusEditActivity textStatusEditActivity = this.f207022b;
                C71390b bVar = TextStatusEditActivity.f206867L1;
                textStatusEditActivity.mo98459d8(str2, 1);
                this.f207022b.mo98493v8();
                C71393c cVar = this.f207023c;
                if (cVar != null) {
                    C87412m.m108593f(str2, "path");
                    cVar.mo98500b(str2);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$q0 */
    public static final class C71435q0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207030d;

        public C71435q0(TextStatusEditActivity textStatusEditActivity) {
            this.f207030d = textStatusEditActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TextStatusEditActivity textStatusEditActivity = this.f207030d;
            if (textStatusEditActivity.f206918b1) {
                textStatusEditActivity.hideVKB();
            } else {
                textStatusEditActivity.showVKB();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$r */
    public static final class C71436r implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207031d;

        public C71436r(TextStatusEditActivity textStatusEditActivity) {
            this.f207031d = textStatusEditActivity;
        }

        public final void run() {
            C85875k4.m106189j0(this.f207031d.mo98449T7().getPaint(), 0.8f);
            this.f207031d.mo98449T7().setHint(C0966R.string.jzn);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$s */
    public static final class C71437s implements C71393c {

        /* renamed from: a */
        public final /* synthetic */ TextStatusEditActivity f207032a;

        public C71437s(TextStatusEditActivity textStatusEditActivity) {
            this.f207032a = textStatusEditActivity;
        }

        /* renamed from: b */
        public void mo98500b(String str) {
            C87412m.m108594g(str, "path");
            C71398e O7 = this.f207032a.mo98444O7();
            TextStatusEditActivity textStatusEditActivity = this.f207032a;
            C77459z zVar = textStatusEditActivity.f206904T0;
            AppCompatActivity context = textStatusEditActivity.getContext();
            C87412m.m108593f(context, "context");
            O7.mo98503c(zVar, str, context);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$t */
    public static final class C71438t implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207033d;

        public C71438t(TextStatusEditActivity textStatusEditActivity) {
            this.f207033d = textStatusEditActivity;
        }

        public final void run() {
            TextStatusEditActivity textStatusEditActivity = this.f207033d;
            textStatusEditActivity.mo98459d8(textStatusEditActivity.mo98444O7().f206975b, this.f207033d.mo98444O7().f206977d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$t0 */
    public static final class C71439t0 extends C87413o implements C32224a<NestedScrollView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207034d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71439t0(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f207034d = textStatusEditActivity;
        }

        public Object invoke() {
            return (NestedScrollView) this.f207034d.findViewById(C0966R.C0970id.j4b);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$u0 */
    public static final class C71440u0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f207035d;

        public C71440u0(C32224a<C13598b0> aVar) {
            this.f207035d = aVar;
        }

        public final void run() {
            this.f207035d.invoke();
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$v */
    public static final class C71441v extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207036d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71441v(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f207036d = textStatusEditActivity;
        }

        public Object invoke() {
            return this.f207036d.findViewById(C0966R.C0970id.fc_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$v0 */
    public static final class C71442v0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f207037d;

        /* renamed from: e */
        public final /* synthetic */ TextStatusEditActivity f207038e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71442v0(Bitmap bitmap, TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f207037d = bitmap;
            this.f207038e = textStatusEditActivity;
        }

        public Object invoke() {
            Bitmap bitmap;
            Bitmap bitmap2 = this.f207037d;
            if (bitmap2 != null) {
                TextStatusEditActivity textStatusEditActivity = this.f207038e;
                C71390b bVar = TextStatusEditActivity.f206867L1;
                textStatusEditActivity.mo98456a8().setImageBitmap(bitmap2);
                textStatusEditActivity.mo98456a8().setVisibility(0);
                FrameLayout frameLayout = textStatusEditActivity.f206875C;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                try {
                    C111011i iVar = new C111011i(textStatusEditActivity);
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
                TextStatusEditActivity.f206870O1 = bitmap;
                textStatusEditActivity.f206914Y0 = bitmap2;
                textStatusEditActivity.mo98493v8();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$w */
    public static final class C71443w extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207039d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71443w(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f207039d = textStatusEditActivity;
        }

        public Object invoke() {
            return (ImageView) this.f207039d.findViewById(C0966R.C0970id.fci);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$w0 */
    public static final class C71444w0 extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207040d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71444w0(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f207040d = textStatusEditActivity;
        }

        public Object invoke() {
            return (FrameLayout) this.f207040d.findViewById(C0966R.C0970id.k1_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$x */
    public static final class C71445x extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207041d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71445x(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f207041d = textStatusEditActivity;
        }

        public Object invoke() {
            return (TextView) this.f207041d.findViewById(C0966R.C0970id.fcj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$x0 */
    public static final class C71446x0 implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207042d;

        public C71446x0(TextStatusEditActivity textStatusEditActivity) {
            this.f207042d = textStatusEditActivity;
        }

        public void afterTextChanged(Editable editable) {
            this.f207042d.mo98449T7().removeTextChangedListener(this);
            View N7 = this.f207042d.mo98443N7();
            this.f207042d.getClass();
            N7.setEnabled(true);
            if (this.f207042d.mo98443N7().isEnabled()) {
                View U7 = this.f207042d.mo98450U7();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = U7;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                U7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View U72 = this.f207042d.mo98450U7();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = U72;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                U72.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C78336h hVar = new C78336h(String.valueOf(editable), (int) this.f207042d.mo98449T7().getPaint().getTextSize());
            C45078p0.C45079a aVar3 = C45078p0.C45079a.MODE_CHINESE_AS_2;
            int a = hVar.mo108328a(aVar3);
            String.valueOf(editable);
            if (a > 2000) {
                this.f207042d.mo98449T7().setText(C102226d.m134696a(this.f207042d, hVar.mo108329b(2000, aVar3)));
                this.f207042d.mo98449T7().setSelection(this.f207042d.mo98449T7().getText().length());
                TextStatusEditActivity textStatusEditActivity = this.f207042d;
                String string = textStatusEditActivity.getString(C0966R.string.ius);
                C87412m.m108593f(string, "getString(com.tencent.mm…text_status_invalid_more)");
                textStatusEditActivity.mo98491t8(string);
                AppCompatActivity context = this.f207042d.getContext();
                C87412m.m108593f(context, "context");
                C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
                if (v1Var != null) {
                    v1Var.f229462A++;
                }
            }
            this.f207042d.mo98449T7().addTextChangedListener(this);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$y */
    public static final class C71447y extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207043d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71447y(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f207043d = textStatusEditActivity;
        }

        public Object invoke() {
            return (ImageView) this.f207043d.findViewById(C0966R.C0970id.fck);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$y0 */
    public static final class C71448y0 extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207044d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71448y0(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f207044d = textStatusEditActivity;
        }

        public Object invoke() {
            return (LinearLayout) this.f207044d.findViewById(C0966R.C0970id.kja);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$z */
    public static final class C71449z extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207045d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71449z(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f207045d = textStatusEditActivity;
        }

        public Object invoke() {
            return (ImageView) this.f207045d.findViewById(C0966R.C0970id.fd_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$z0 */
    public static final class C71450z0 extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f207046d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71450z0(TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f207046d = textStatusEditActivity;
        }

        public Object invoke() {
            return (TextView) this.f207046d.findViewById(C0966R.C0970id.kjb);
        }
    }

    public TextStatusEditActivity() {
        C86709a0.m107524d().mo123460f(new C10699j());
        C36568h.m40985a(new C71444w0(this));
        this.f206902S0 = C36568h.m40985a(new C71406h(this));
        this.f206912X0 = C39718p.f106569a.mo62352c();
        this.f206919c1 = C36568h.m40985a(C30500u.f82180d);
        this.f206927g1 = 2000;
        C40008f fVar = C40008f.f107254d;
        this.f206931i1 = new TextStatusEditActivity$statusExptSwitchChangeEventListener$1(this, fVar);
        this.f206934k1 = new C71422m(this);
        this.f206935l1 = new TextStatusEditActivity$configUpdateListener$1(this, fVar);
        this.f206936m1 = C30496d.NORMAL;
        this.f206938n1 = new C71446x0(this);
        this.f206945q1 = 0;
        this.f206949s1 = "";
        this.f206951t1 = "";
        this.f206953u1 = "";
        this.f206955v1 = new ArrayList<>();
        this.f206957w1 = new C71417j1(this);
        this.f206960x1 = new C71399e0(this);
        this.f206965z1 = new C71409i(this);
        this.f206872A1 = new LinkedList<>();
        this.f206886H1 = "";
    }

    /* renamed from: H7 */
    public final void mo98437H7(int i, String str, String str2) {
        mo98438I7();
        C71398e O7 = mo98444O7();
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        String str3 = this.f206886H1;
        C87412m.m108594g(str3, "oriVideoFilePath");
        O7.mo98502b();
        C76252b.m91659c(O7.f206974a);
        O7.f206979f = false;
        O7.f206977d = i;
        O7.f206976c = str2;
        if (i == 1) {
            O7.f206981h = C86013q1.m106451l(str);
            O7.f206982i = C90193h.m112876d(str);
            String b = C78123i.f228932a.mo108105b(str);
            O7.f206975b = b;
            O7.f206978e = true;
            O7.f206983j = C86013q1.m106451l(b);
        } else if (i == 2) {
            if (!C112551y.m153811k(str3)) {
                O7.f206981h = C86013q1.m106451l(str3);
                O7.f206982i = C90193h.m112876d(str3);
            } else {
                O7.f206981h = C86013q1.m106451l(str);
                O7.f206982i = C90193h.m112876d(str);
            }
            O7.f206975b = str;
            O7.f206983j = C86013q1.m106451l(str);
            String str4 = O7.f206975b;
            if (str4 != null) {
                C63679m.C63680a M1 = ((C63679m) C86312j.m106911c(C63679m.class)).mo88483M1(str4);
                O7.f206980g = (M1 != null ? M1.f180528d : 0) / ((long) 1000);
            }
        }
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "[updateFromGallery] oriLen:" + O7.f206981h + " finalLen:" + O7.f206983j + " type:" + i);
        O7.mo98501a(context);
        mo98459d8(str, i);
        mo98493v8();
        mo98497z8();
        mo98494w8();
    }

    /* renamed from: I7 */
    public final void mo98438I7() {
        this.f206908V0 = true;
        boolean z = false;
        C76252b.m91660d(mo98445P7(), false);
        mo98444O7().mo98502b();
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
        if (v1Var != null) {
            C77459z zVar = this.f206904T0;
            if (zVar != null && zVar.f229404i == 5) {
                z = true;
            }
            if (z) {
                v1Var.f229523z = 1;
            }
            int i = this.f206906U0;
            if (i == 1 || i == 2) {
                v1Var.f229523z = 1;
            }
        }
        C76252b.m91659c(mo98445P7());
        mo98440K7();
        mo98469o8();
        C52678e0 e0Var = mo98445P7().f147238g;
        C87412m.m108593f(e0Var, "curTextStatusExtInfo.topicInfo");
        mo98496y8(e0Var, (C52678e0) null);
        mo98497z8();
        mo98494w8();
        Object value = ((C36570n) this.f206964z).getValue();
        C87412m.m108593f(value, "<get-vPicBg>(...)");
        ((ImageView) value).setVisibility(8);
    }

    /* renamed from: J7 */
    public final void mo98439J7() {
        C59600d dVar;
        StringBuilder sb = new StringBuilder();
        sb.append("destroyThirdBackManual() called thirdBack:");
        sb.append(this.f206881F);
        sb.append('@');
        C59600d dVar2 = this.f206881F;
        sb.append(dVar2 != null ? Integer.valueOf(dVar2.hashCode()) : null);
        sb.append(" stack:");
        sb.append(Util.getStack());
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", sb.toString());
        AppCompatActivity context = getContext();
        if ((context instanceof MMFragmentActivity) && (dVar = this.f206881F) != null) {
            C45413b.C45414a.m50358b(dVar, (MMFragmentActivity) context);
        }
        C59600d dVar3 = this.f206881F;
        if (dVar3 != null) {
            dVar3.onDestroy();
        }
        this.f206881F = null;
        this.f206884G1 = null;
    }

    /* renamed from: K7 */
    public final void mo98440K7() {
        C60695a player;
        C60695a player2;
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f206916Z0;
        if (!(mMTPEffectVideoLayout == null || (player2 = mMTPEffectVideoLayout.getPlayer()) == null)) {
            player2.stopAsync();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.f206916Z0;
        if (!(mMTPEffectVideoLayout2 == null || (player = mMTPEffectVideoLayout2.getPlayer()) == null)) {
            player.recycle();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout3 = this.f206916Z0;
        if (mMTPEffectVideoLayout3 != null) {
            mMTPEffectVideoLayout3.mo81101g();
        }
        this.f206916Z0 = null;
        FrameLayout frameLayout = this.f206875C;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    /* renamed from: L0 */
    public void mo4083L0(String str) {
        String string = getString(C0966R.string.ius);
        C87412m.m108593f(string, "getString(com.tencent.mm…text_status_invalid_more)");
        mo98491t8(string);
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
        mo98491t8(string);
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
        if (v1Var != null) {
            v1Var.f229463B++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02b9, code lost:
        if ((r0 == null || r0.isEmpty()) == false) goto L_0x02bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0444  */
    /* renamed from: L7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98441L7() {
        /*
            r14 = this;
            r14.hideVKB()
            com.tencent.mm.ui.widget.MMEditText r0 = r14.mo98449T7()
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r1 = 1
            r2 = 0
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
            int r3 = r14.f206947r1
            r5 = 3
            r6 = 0
            if (r3 != r5) goto L_0x005c
            java.util.LinkedList<java.lang.String> r3 = r14.f206872A1
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
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$e r8 = r14.mo98444O7()
            int r8 = r8.f206977d
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$e r9 = r14.mo98444O7()
            java.lang.String r9 = r9.f206975b
            if (r9 != 0) goto L_0x0092
            r9 = r4
        L_0x0092:
            r7.f229451g = r9
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$e r9 = r14.mo98444O7()
            java.lang.String r9 = r9.f206976c
            r7.f229452h = r9
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$e r9 = r14.mo98444O7()
            boolean r9 = r9.f206979f
            r7.f229450f = r9
            uz2.u r9 = r14.mo98445P7()
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
            java.lang.String r13 = r11.group(r1)
            r12.add(r13)
            goto L_0x00b9
        L_0x00c9:
            java.lang.String r11 = r14.mo98447R7()
            r10.f147092i = r11
            b03.c r11 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            uz2.u r12 = r14.mo98445P7()
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
            r9.f147243o = r2
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
            int r8 = r14.f206912X0
            java.lang.String r0 = r0.mo62350a(r8)
            r9.f147252x = r0
            goto L_0x014c
        L_0x010d:
            int r0 = r9.f147250v
            if (r0 != 0) goto L_0x014c
            int r0 = r9.f147251w
            if (r0 != 0) goto L_0x014c
            if (r8 != r1) goto L_0x012a
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
            int r0 = r14.f206906U0
            if (r0 != r10) goto L_0x016e
            az2.e r0 = az2.C39674e.f106452d
            qy2.z r8 = r14.f206904T0
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
            com.tencent.mm.emoji.view.EmojiStatusView r0 = r14.mo98448S7()
            com.tencent.mm.api.IEmojiInfo r0 = r0.getEmojiInfo()
            if (r0 == 0) goto L_0x021b
            uz2.s r0 = new uz2.s
            r0.<init>()
            com.tencent.mm.emoji.view.EmojiStatusView r8 = r14.mo98448S7()
            com.tencent.mm.api.IEmojiInfo r8 = r8.getEmojiInfo()
            xh.y1 r8 = (p749xh.C102678y1) r8
            com.tencent.mm.emoji.view.EmojiStatusView r11 = r14.mo98448S7()
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
            uz2.u r0 = r14.mo98445P7()
            uz2.e0 r0 = r0.f147238g
            b03.c r8 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            uz2.u r11 = r14.mo98445P7()
            uz2.e0 r11 = r11.f147238g
            java.lang.String r11 = r11.f147088e
            uz2.d1 r8 = r8.mo62298j(r11)
            if (r8 == 0) goto L_0x0238
            int r8 = r8.f147084g
            goto L_0x0239
        L_0x0238:
            r8 = 0
        L_0x0239:
            r0.f147099s = r8
            boolean r0 = r14.mo98466l8()
            if (r0 == 0) goto L_0x0276
            java.util.ArrayList<java.lang.String> r0 = r14.f206955v1
            if (r0 == 0) goto L_0x024e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x024c
            goto L_0x024e
        L_0x024c:
            r0 = 0
            goto L_0x024f
        L_0x024e:
            r0 = 1
        L_0x024f:
            if (r0 != 0) goto L_0x0276
            java.util.LinkedList<java.lang.Integer> r0 = r9.f147234M
            r0.clear()
            java.util.ArrayList<java.lang.String> r0 = r14.f206955v1
            java.util.Iterator r0 = r0.iterator()
        L_0x025c:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0276
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.LinkedList<java.lang.Integer> r11 = r9.f147234M
            int r8 = java.lang.Integer.parseInt(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.add(r8)
            goto L_0x025c
        L_0x0276:
            r7.f229448d = r9
            r7.f229449e = r3
            int r0 = r14.f206906U0
            if (r0 != r1) goto L_0x029c
            boolean r0 = r14.f206876C1
            if (r0 == 0) goto L_0x0286
            r8 = 1
            r7.f229461t = r8
        L_0x0286:
            az2.e r0 = az2.C39674e.f106452d
            qy2.z r8 = r14.f206904T0
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
            java.util.ArrayList<java.lang.String> r0 = r14.f206955v1
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
            boolean r3 = r14.mo98466l8()     // Catch:{ all -> 0x031b }
            java.lang.String r8 = ","
            if (r3 == 0) goto L_0x02d3
            java.lang.String r3 = "mLabelIdListString"
            java.util.ArrayList<java.lang.String> r9 = r14.f206955v1     // Catch:{ all -> 0x031b }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r9, r8)     // Catch:{ all -> 0x031b }
            r0.put(r3, r9)     // Catch:{ all -> 0x031b }
        L_0x02d3:
            java.lang.String r3 = "mLabelRangeindex"
            int r9 = r14.f206947r1     // Catch:{ all -> 0x031b }
            r0.put(r3, r9)     // Catch:{ all -> 0x031b }
            java.lang.String r3 = "mLabelNameList"
            java.lang.String r9 = r14.f206949s1     // Catch:{ all -> 0x031b }
            r0.put(r3, r9)     // Catch:{ all -> 0x031b }
            java.lang.String r3 = "mOtherUserNameList"
            java.lang.String r9 = r14.f206951t1     // Catch:{ all -> 0x031b }
            r0.put(r3, r9)     // Catch:{ all -> 0x031b }
            java.lang.String r3 = "mChatRoomNameList"
            java.lang.String r9 = r14.f206953u1     // Catch:{ all -> 0x031b }
            r0.put(r3, r9)     // Catch:{ all -> 0x031b }
            java.lang.String r3 = "MicroMsg.TextStatus.TextStatusEditActivity"
            java.lang.String r9 = "getVisibilityInfo: mLabelIdListString:%s ,mLabelRangeindex:%s ,mLabelNameList:%s,mOtherUserNameList:%s,mChatRoomNameList:%s"
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ all -> 0x031b }
            java.util.ArrayList<java.lang.String> r12 = r14.f206955v1     // Catch:{ all -> 0x031b }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r12, r8)     // Catch:{ all -> 0x031b }
            r11[r2] = r8     // Catch:{ all -> 0x031b }
            int r8 = r14.f206947r1     // Catch:{ all -> 0x031b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x031b }
            r11[r1] = r8     // Catch:{ all -> 0x031b }
            java.lang.String r8 = r14.f206949s1     // Catch:{ all -> 0x031b }
            r11[r10] = r8     // Catch:{ all -> 0x031b }
            java.lang.String r8 = r14.f206951t1     // Catch:{ all -> 0x031b }
            r11[r5] = r8     // Catch:{ all -> 0x031b }
            r5 = 4
            java.lang.String r8 = r14.f206953u1     // Catch:{ all -> 0x031b }
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
            qy2.z r0 = r14.f206904T0
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
            int r3 = r14.f206906U0
            if (r3 != r10) goto L_0x0359
        L_0x0341:
            if (r0 == 0) goto L_0x0349
            boolean r0 = r0.f229414v
            if (r0 != r1) goto L_0x0349
            r0 = 1
            goto L_0x034a
        L_0x0349:
            r0 = 0
        L_0x034a:
            if (r0 != 0) goto L_0x0359
            r0 = 2131821686(0x7f110476, float:1.9276122E38)
            java.lang.String r0 = r14.getString(r0)
            r3 = 2131756283(0x7f1004fb, float:1.914347E38)
            nj3.C76912y0.m92769h(r14, r0, r3)
        L_0x0359:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            uz2.p r3 = new uz2.p
            r3.<init>()
            uz2.u r5 = r14.mo98445P7()
            uz2.e0 r5 = r5.f147238g
            java.lang.String r5 = r5.f147088e
            r3.f188456e = r5
            android.widget.TextView r5 = r14.f206924f
            if (r5 == 0) goto L_0x037f
            java.lang.CharSequence r5 = r5.getText()
            if (r5 == 0) goto L_0x037f
            java.lang.String r5 = r5.toString()
            if (r5 != 0) goto L_0x037e
            goto L_0x037f
        L_0x037e:
            r4 = r5
        L_0x037f:
            r3.f188455d = r4
            qy2.i r4 = r14.mo98446Q7()
            if (r4 == 0) goto L_0x038c
            qy2.o r4 = r4.mo107626r()
            goto L_0x038d
        L_0x038c:
            r4 = r6
        L_0x038d:
            if (r4 == 0) goto L_0x0393
            java.lang.String r6 = r4.mo90550g()
        L_0x0393:
            r3.f188457f = r6
            if (r4 == 0) goto L_0x039a
            r4.mo90548e(r3)
        L_0x039a:
            byte[] r3 = r3.toByteArray()
            java.lang.String r4 = "select_status_info"
            r0.putExtra(r4, r3)
            b03.c r3 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            uz2.u r4 = r14.mo98445P7()
            uz2.e0 r4 = r4.f147238g
            java.lang.String r4 = r4.f147088e
            uz2.d1 r3 = r3.mo62298j(r4)
            if (r3 == 0) goto L_0x03bd
            boolean r3 = b03.C39713l.m42496a(r3)
            if (r3 != r1) goto L_0x03bd
            r3 = 1
            goto L_0x03be
        L_0x03bd:
            r3 = 0
        L_0x03be:
            if (r3 == 0) goto L_0x0434
            b03.g r3 = b03.C39697g.f106502a
            lz2.l r4 = new lz2.l
            uz2.u r5 = r14.mo98445P7()
            uz2.e0 r5 = r5.f147238g
            java.lang.String r5 = r5.f147088e
            java.lang.String r6 = "curTextStatusExtInfo.topicInfo.iconId"
            gy3.C87412m.m108593f(r5, r6)
            b03.c r6 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            uz2.u r7 = r14.mo98445P7()
            uz2.e0 r7 = r7.f147238g
            java.lang.String r6 = r6.mo62301m(r7)
            r4.<init>(r5, r6)
            java.lang.String r5 = r4.f92747d
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x03ec
            r6 = 1
            goto L_0x03ed
        L_0x03ec:
            r6 = 0
        L_0x03ed:
            if (r6 == 0) goto L_0x0434
            uz2.n r6 = new uz2.n
            r6.<init>()
            long r7 = eb0.C31543z5.m39453c()
            r6.f147164e = r7
            java.lang.String r7 = r4.f92748e
            r6.f147165f = r7
            r6.f147163d = r5
            r3.mo62323a(r4)
            uz2.o r3 = r3.mo62324b()
            java.util.LinkedList<uz2.n> r4 = r3.f147170d
            r4.add(r2, r6)
            java.util.LinkedList<uz2.n> r4 = r3.f147170d
            int r4 = r4.size()
            r5 = 6
            if (r4 <= r5) goto L_0x041a
            java.util.LinkedList<uz2.n> r4 = r3.f147170d
            r4.subList(r2, r5)
        L_0x041a:
            rx3.g r2 = b03.C39697g.f106504c
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.String r4 = "<get-mmkv>(...)"
            gy3.C87412m.m108593f(r2, r4)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r2
            byte[] r4 = r3.toByteArray()
            java.lang.String r5 = "MMKV_KEY_RECENT_STATUS_INFO_LIST"
            r2.encode((java.lang.String) r5, (byte[]) r4)
            b03.C39697g.f106505d = r3
        L_0x0434:
            r2 = -1
            r14.setResult(r2, r0)
            rx3.g r3 = r14.f206902S0
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.os.ResultReceiver r3 = (android.os.ResultReceiver) r3
            if (r3 == 0) goto L_0x044b
            android.os.Bundle r0 = r0.getExtras()
            r3.send(r2, r0)
        L_0x044b:
            r14.f206933j1 = r1
            r14.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity.mo98441L7():void");
    }

    /* renamed from: M7 */
    public final String mo98442M7(String str) {
        String str2 = ((C99015i) C86312j.m106911c(C99015i.class)).mo61936iU() + C86013q1.m106456q(str);
        C89231c cVar = new C89231c();
        try {
            cVar.setDataSource(str);
            Bitmap frameAtTime = cVar.getFrameAtTime(0);
            if (frameAtTime == null) {
                Log.m105920e("MicroMsg.TextStatus.TextStatusEditActivity", "get bitmap error");
                try {
                    cVar.release();
                } catch (Exception unused) {
                }
                return "";
            }
            Log.m105925i("MicroMsg.TextStatus.TextStatusEditActivity", "getBitmap1 %d %d", Integer.valueOf(frameAtTime.getWidth()), Integer.valueOf(frameAtTime.getHeight()));
            BitmapUtil.saveBitmapToImage(frameAtTime, 80, Bitmap.CompressFormat.JPEG, str2, true);
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str2);
            Log.m105925i("MicroMsg.TextStatus.TextStatusEditActivity", "getBitmap2 %d %d", Integer.valueOf(imageOptions.outWidth), Integer.valueOf(imageOptions.outHeight));
            try {
                cVar.release();
            } catch (Exception unused2) {
            }
            return str2;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.TextStatus.TextStatusEditActivity", "savebitmap error %s", e.getMessage());
        } catch (Throwable th) {
            try {
                cVar.release();
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* renamed from: N7 */
    public final View mo98443N7() {
        View view = this.f206905U;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("btnOk");
        throw null;
    }

    /* renamed from: O7 */
    public final C71398e mo98444O7() {
        C71398e eVar = this.f206890J1;
        if (eVar != null) {
            return eVar;
        }
        C87412m.m108603p("curLocalMediaStruct");
        throw null;
    }

    /* renamed from: P4 */
    public void mo4086P4(String str) {
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "Set New textStatus : " + Util.secPrint(str));
        if (mo98444O7().f206978e) {
            this.f206892K1 = C76879j.m92723Q(this, getString(C0966R.string.f361143hn1), getString(C0966R.string.f361143hn1), false, false, (DialogInterface.OnCancelListener) null);
            ((C119157j) C119157j.f356862d).mo183875f(new C71414j(this));
            return;
        }
        mo98441L7();
    }

    /* renamed from: P7 */
    public final C52718u mo98445P7() {
        C52718u uVar = this.f206910W0;
        if (uVar != null) {
            return uVar;
        }
        C87412m.m108603p("curTextStatusExtInfo");
        throw null;
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        Log.m105918d("MicroMsg.TextStatus.TextStatusEditActivity", "onKeyboardHeightChanged " + i + ", " + z);
        boolean z2 = true;
        if (this.f206917a1 < 1) {
            z2 = false;
        }
        if (!z2) {
            mo98460e8(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if ((r1 != null && yz2.C79224c.m95929a(r1, r0)) == false) goto L_0x000c;
     */
    /* renamed from: Q7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final qy2.C77452i mo98446Q7() {
        /*
            r6 = this;
            uz2.u r0 = r6.mo98445P7()
            uz2.e0 r0 = r0.f147238g
            qy2.i r1 = r6.f206880E1
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x000e
        L_0x000c:
            r2 = 0
            goto L_0x001e
        L_0x000e:
            uz2.e0 r1 = r6.f206882F1
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
            qy2.i r1 = r6.f206880E1
            if (r1 == 0) goto L_0x0027
            r1.mo84148n()
        L_0x0027:
            r1 = 0
            r6.f206880E1 = r1
            r6.f206882F1 = r1
            xz2.r r2 = xz2.C79019r.f232026a     // Catch:{ all -> 0x0034 }
            xz2.o r2 = new xz2.o     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            goto L_0x003f
        L_0x0034:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "MicroMsg.TextStatus.TextStatusEditActivity"
            java.lang.String r5 = "customps err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r2, r5, r3)
            r2 = r1
        L_0x003f:
            r6.f206880E1 = r2
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
            r6.f206882F1 = r2
        L_0x0085:
            qy2.i r0 = r6.f206880E1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity.mo98446Q7():qy2.i");
    }

    /* renamed from: R7 */
    public final String mo98447R7() {
        TextView textView;
        CharSequence text;
        if (!IStatusIconHelperKt.m39109a().mo62289a(mo98445P7().f147238g.f147088e) || (textView = this.f206924f) == null || (text = textView.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    /* renamed from: S7 */
    public final EmojiStatusView mo98448S7() {
        Object value = this.f206889J.getValue();
        C87412m.m108593f(value, "<get-emojiView>(...)");
        return (EmojiStatusView) value;
    }

    /* renamed from: T7 */
    public final MMEditText mo98449T7() {
        MMEditText mMEditText = this.f206952u;
        if (mMEditText != null) {
            return mMEditText;
        }
        C87412m.m108603p("etDesc");
        throw null;
    }

    /* renamed from: U7 */
    public final View mo98450U7() {
        Object value = this.f206907V.getValue();
        C87412m.m108593f(value, "<get-fakeBtnOk>(...)");
        return (View) value;
    }

    /* renamed from: V7 */
    public final View mo98451V7() {
        View view = this.f206911X;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("layoutBlurOption");
        throw null;
    }

    /* renamed from: W7 */
    public final FrameLayout mo98452W7() {
        Object value = ((C36570n) this.f206877D).getValue();
        C87412m.m108593f(value, "<get-layoutThirdContainer>(...)");
        return (FrameLayout) value;
    }

    /* renamed from: X7 */
    public final FrameLayout mo98453X7() {
        Object value = ((C36570n) this.f206879E).getValue();
        C87412m.m108593f(value, "<get-layoutThirdThumb>(...)");
        return (FrameLayout) value;
    }

    /* renamed from: Y7 */
    public final C78318v1 mo98454Y7() {
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        return (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
    }

    /* renamed from: Z7 */
    public final FrameLayout mo98455Z7() {
        Object value = ((C36570n) this.f206898Q0).getValue();
        C87412m.m108593f(value, "<get-thirdIconContainerFl>(...)");
        return (FrameLayout) value;
    }

    /* renamed from: a8 */
    public final ImageView mo98456a8() {
        Object value = this.f206961y.getValue();
        C87412m.m108593f(value, "<get-vPic>(...)");
        return (ImageView) value;
    }

    /* renamed from: b8 */
    public final void mo98457b8() {
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
            C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C71426n(this, f, this, (C15601d<? super C71426n>) null), 3, (Object) null);
        }
    }

    /* renamed from: c8 */
    public final void mo98458c8(IEmojiInfo iEmojiInfo) {
        String str;
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "handleEmojiInfoSelect: emojiInfo:" + iEmojiInfo);
        this.f206936m1 = C30496d.BIG_EMOJI;
        Object value = ((C36570n) this.f206891K).getValue();
        C87412m.m108593f(value, "<get-layoutEmojiView>(...)");
        View view = (View) value;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity", "switchEditContent", "(Lcom/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$EditContentType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity", "switchEditContent", "(Lcom/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$EditContentType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo98494w8();
        mo98448S7().setEmojiInfo(iEmojiInfo);
        C78318v1 Y7 = mo98454Y7();
        if (Y7 != null) {
            if (iEmojiInfo == null || (str = iEmojiInfo.getMd5()) == null) {
                str = "";
            }
            Y7.f229490W0 = str;
        }
        Object value2 = ((C36570n) this.f206954v).getValue();
        C87412m.m108593f(value2, "<get-scrollview>(...)");
        ((NestedScrollView) value2).postDelayed(new C71428o(this), 100);
    }

    /* renamed from: d8 */
    public final void mo98459d8(String str, int i) {
        String str2;
        String str3 = str;
        boolean z = false;
        if (!(str3 == null || C112551y.m153811k(str))) {
            View V7 = mo98451V7();
            int i2 = ((this.f206906U0 != 2 || this.f206908V0) && !this.f206878D1 && !C76252b.m91658b(mo98445P7())) ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            C117292a.m165358d(V7, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity", "handleFileLocal", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            V7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(V7, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity", "handleFileLocal", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i == 2) {
                Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "handle video file");
                mo98456a8().setVisibility(8);
                FrameLayout frameLayout = this.f206875C;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                View view = this.f206873B;
                int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
                View view2 = this.f206873B;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(measuredWidth, view2 != null ? view2.getMeasuredHeight() : 0);
                layoutParams.gravity = 17;
                MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f206916Z0;
                if (mMTPEffectVideoLayout == null) {
                    AppCompatActivity context = getContext();
                    C87412m.m108593f(context, "context");
                    this.f206916Z0 = new MMTPEffectVideoLayout(context);
                } else if (mMTPEffectVideoLayout != null) {
                    mMTPEffectVideoLayout.mo81101g();
                }
                MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.f206916Z0;
                if (mMTPEffectVideoLayout2 != null) {
                    FrameLayout frameLayout2 = this.f206875C;
                    if (frameLayout2 != null) {
                        frameLayout2.removeAllViews();
                    }
                    FrameLayout frameLayout3 = this.f206875C;
                    if (frameLayout3 != null) {
                        frameLayout3.addView(mMTPEffectVideoLayout2, layoutParams);
                    }
                    FrameLayout frameLayout4 = this.f206875C;
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
                    C58010a aVar2 = new C58010a(str2, str3, str4, mo98445P7().f147250v, mo98445P7().f147251w);
                    if (k) {
                        C63679m.C63680a M1 = ((C63679m) C86312j.m106911c(C63679m.class)).mo88483M1(str3);
                        aVar2.f165950v = M1 != null ? M1.f180525a : 0;
                        aVar2.f165951w = M1 != null ? M1.f180526b : 0;
                        aVar2.f165935g = M1 != null ? M1.f180528d : 0;
                        aVar2.f165939k = M1 != null ? M1.f180530f : 0;
                    }
                    aVar2.f165933e = k;
                    Log.m105925i("MicroMsg.TextStatus.TextStatusEditActivity", "[play] isLocal:%s, videoWidth:%s, videoHeight:%s rotate:%s", Boolean.valueOf(k), Integer.valueOf(aVar2.f165950v), Integer.valueOf(aVar2.f165951w), Integer.valueOf(aVar2.f165939k));
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
                    this.f206916Z0 = mMTPEffectVideoLayout2;
                    try {
                        C60695a player3 = mMTPEffectVideoLayout2.getPlayer();
                        if (player3 != null) {
                            player3.mo85619m();
                        }
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.TextStatus.TextStatusEditActivity", "unable to play video! mediaInfo:" + aVar2 + " error:" + e.getLocalizedMessage());
                        FrameLayout frameLayout5 = this.f206875C;
                        if (frameLayout5 != null) {
                            frameLayout5.setVisibility(8);
                        }
                    }
                    FrameLayout frameLayout6 = this.f206875C;
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
                    mo98493v8();
                    return;
                }
                return;
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C71430p(str3, this));
        }
    }

    /* renamed from: e8 */
    public final void mo98460e8(int i) {
        Integer num = this.f206945q1;
        if (num == null || num.intValue() != i) {
            this.f206945q1 = Integer.valueOf(i);
            boolean z = true;
            if (this.f206917a1 < 1) {
                z = false;
            }
            if (z) {
                Object value = ((C36570n) this.f206932j).getValue();
                C87412m.m108593f(value, "<get-vEmojiPanelBack>(...)");
                ViewGroup.LayoutParams layoutParams = ((View) value).getLayoutParams();
                layoutParams.height = i;
                Object value2 = ((C36570n) this.f206932j).getValue();
                C87412m.m108593f(value2, "<get-vEmojiPanelBack>(...)");
                ((View) value2).setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = mo98448S7().getLayoutParams();
                int h = i > 0 ? C76577a.m92157h(this, C0966R.dimen.aqv) : C76577a.m92157h(this, C0966R.dimen.aqu);
                layoutParams2.width = h;
                layoutParams2.height = h;
                mo98448S7().setLayoutParams(layoutParams2);
            }
            if (i > 0) {
                int c = i - C74942w4.m89786c(getContext(), C0966R.dimen.f3736cp);
                View view = this.f206895N;
                if (view != null) {
                    view.setTranslationY(Math.min((float) (-c), 0.0f));
                }
                Object value3 = ((C36570n) this.f206887I).getValue();
                C87412m.m108593f(value3, "<get-layoutShow>(...)");
                LinearLayout linearLayout = (LinearLayout) value3;
                ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.bottomMargin = i;
                linearLayout.setLayoutParams(layoutParams4);
                return;
            }
            getWindow().setNavigationBarColor(getResources().getColor(C0966R.color.f2949a6));
            Object value4 = ((C36570n) this.f206887I).getValue();
            C87412m.m108593f(value4, "<get-layoutShow>(...)");
            ((LinearLayout) value4).setTranslationY(0.0f);
            View view2 = this.f206895N;
            if (view2 != null) {
                view2.setTranslationY(0.0f);
            }
            Object value5 = ((C36570n) this.f206887I).getValue();
            C87412m.m108593f(value5, "<get-layoutShow>(...)");
            LinearLayout linearLayout2 = (LinearLayout) value5;
            ViewGroup.LayoutParams layoutParams5 = linearLayout2.getLayoutParams();
            C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
            layoutParams6.bottomMargin = C74942w4.m89786c(getContext(), C0966R.dimen.avw);
            linearLayout2.setLayoutParams(layoutParams6);
        }
    }

    /* renamed from: f8 */
    public final void mo98461f8(String str, C71393c cVar) {
        mo98469o8();
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "trydownload imgback:" + str);
        this.f206943p1 = new C71432q(str, this, cVar);
        ((C76057w) C86312j.m106911c(C76057w.class)).h60(str, this.f206943p1);
        this.f206940o1 = str;
    }

    public void finish() {
        ResultReceiver resultReceiver;
        hideVKB();
        mo98492u8();
        if (!this.f206933j1 && (resultReceiver = (ResultReceiver) ((C36570n) this.f206902S0).getValue()) != null) {
            resultReceiver.send(0, (Bundle) null);
        }
        super.finish();
    }

    /* renamed from: g8 */
    public final void mo98462g8() {
        boolean z;
        String str;
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_TEXT_STATUS_EDUCATION_FLAG_INT;
        boolean z2 = true;
        boolean z3 = i.mo119689j(aVar, 1) == 1;
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_TEXT_STATUS_NEW_TIPS_SHOW_BOOLEAN, false);
        if (!z3 || g) {
            z = false;
        } else {
            View findViewById = findViewById(C0966R.C0970id.cdh);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity", "showEducationLayout", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity", "showEducationLayout", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById(C0966R.C0970id.cdh).setBackground(new BitmapDrawable(getResources(), BitmapUtil.getBitmapNative(this.f206912X0)));
            TextView textView = (TextView) findViewById(C0966R.C0970id.cdk);
            if (textView != null) {
                C85875k4.m106191k0(textView.getPaint());
            }
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this, 8, C78318v1.class);
            z2 = true;
            if (v1Var != null) {
                v1Var.f229477Q = 1;
            }
            C77448f0.m93396h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
            findViewById(C0966R.C0970id.cdg).setOnClickListener(new C79275u1(this));
            Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "show education");
            z = true;
        }
        if (!z) {
            Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "initEditText allow input text");
            mo98449T7().getViewTreeObserver().addOnGlobalLayoutListener(this.f206934k1);
            mo98449T7().post(new C71436r(this));
            C117407d.INSTANCE.idkeyStat(1629, 0, 1, false);
            C77459z zVar = this.f206904T0;
            if (zVar == null || zVar.f229404i != 11) {
                z2 = false;
            }
            if (!z2) {
                C52678e0 e0Var = mo98445P7().f147238g;
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

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c97;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        Log.m105918d("MicroMsg.TextStatus.TextStatusEditActivity", "onInputPanelChange " + z + ", " + i);
        boolean z2 = true;
        if (this.f206917a1 < 1) {
            z2 = false;
        }
        if (z2) {
            if (!z) {
                i = 0;
            }
            this.f206918b1 = z;
            mo98460e8(i);
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
    /* renamed from: i8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98463i8() {
        /*
            r15 = this;
            int r0 = r15.f206906U0
            r1 = 1
            r2 = 2
            r3 = 0
            if (r0 == 0) goto L_0x002f
            if (r0 == r1) goto L_0x001e
            if (r0 == r2) goto L_0x000d
            goto L_0x01b4
        L_0x000d:
            az2.e r0 = az2.C39674e.f106452d
            qy2.z r1 = r15.f206904T0
            if (r1 == 0) goto L_0x0015
            java.lang.String r3 = r1.f229412t
        L_0x0015:
            rz2.c r0 = r0.mo62253n0(r3)
            r15.mo98464j8(r0)
            goto L_0x01b4
        L_0x001e:
            az2.e r0 = az2.C39674e.f106452d
            qy2.z r1 = r15.f206904T0
            if (r1 == 0) goto L_0x0026
            java.lang.String r3 = r1.f229412t
        L_0x0026:
            rz2.c r0 = r0.mo62253n0(r3)
            r15.mo98464j8(r0)
            goto L_0x01b4
        L_0x002f:
            qy2.z r0 = r15.f206904T0
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
            qy2.z r0 = r15.f206904T0
            if (r0 == 0) goto L_0x006b
            uz2.u r0 = r0.f229399d
            goto L_0x006c
        L_0x006b:
            r0 = r3
        L_0x006c:
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$e r6 = r15.mo98444O7()
            androidx.appcompat.app.AppCompatActivity r7 = r15.getContext()
            gy3.C87412m.m108593f(r7, r5)
            r6.mo98502b()
            if (r0 != 0) goto L_0x007d
            goto L_0x0093
        L_0x007d:
            int r5 = r0.f147237f
            if (r5 == r1) goto L_0x008b
            if (r5 == r2) goto L_0x0084
            goto L_0x0091
        L_0x0084:
            java.lang.String r2 = r0.f147239h
            r6.f206975b = r2
            r6.f206979f = r4
            goto L_0x0091
        L_0x008b:
            java.lang.String r2 = r0.f147239h
            r6.f206975b = r2
            r6.f206979f = r4
        L_0x0091:
            r6.f206977d = r5
        L_0x0093:
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$e r2 = r15.mo98444O7()
            java.lang.String r2 = r2.f206975b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r2 = r2 ^ r1
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$e r5 = r15.mo98444O7()
            int r5 = r5.f206977d
            if (r5 == 0) goto L_0x00ab
            if (r2 != 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r2 = 0
            goto L_0x00af
        L_0x00ab:
            r15.mo98469o8()
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
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$e r0 = r15.mo98444O7()
            java.lang.String r0 = r0.f206975b
            r15.mo98461f8(r0, r3)
            goto L_0x01b4
        L_0x00c8:
            android.view.View r0 = r15.f206873B
            if (r0 == 0) goto L_0x01b4
            yz2.p1 r1 = new yz2.p1
            r1.<init>(r15)
            r0.post(r1)
            goto L_0x01b4
        L_0x00d6:
            qy2.z r0 = r15.f206904T0
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
            r15.mo98469o8()
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
            r15.mo98469o8()
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
            java.lang.String r3 = "MicroMsg.TextStatus.TextStatusEditActivity"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            if (r1 == 0) goto L_0x01ac
            r15.mo98459d8(r6, r0)
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$e r0 = r15.mo98444O7()
            qy2.z r1 = r15.f206904T0
            androidx.appcompat.app.AppCompatActivity r2 = r15.getContext()
            gy3.C87412m.m108593f(r2, r5)
            r0.mo98503c(r1, r6, r2)
            goto L_0x01b4
        L_0x01ac:
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$s r0 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$s
            r0.<init>(r15)
            r15.mo98461f8(r6, r0)
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity.mo98463i8():void");
    }

    /* renamed from: j8 */
    public final void mo98464j8(C48201c cVar) {
        View view;
        C71398e O7 = mo98444O7();
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        O7.mo98502b();
        boolean z = false;
        if (cVar != null) {
            int i = cVar.field_MediaType;
            String str = cVar.field_UserName;
            if (i == 1) {
                C39696f fVar = C39696f.f106501a;
                C87412m.m108593f(str, "userName");
                O7.f206976c = fVar.mo62321d("thumb", str);
                O7.f206975b = fVar.mo62321d("image", str);
                O7.f206979f = false;
            } else if (i == 2) {
                C39696f fVar2 = C39696f.f106501a;
                C87412m.m108593f(str, "userName");
                O7.f206976c = fVar2.mo62321d("thumb", str);
                if (!C87412m.m108589b(C13781a.m13082a(), str)) {
                    O7.f206975b = cVar.field_MediaUrl;
                } else if (C86013q1.m106450k(fVar2.mo62320c(str))) {
                    O7.f206975b = fVar2.mo62320c(str);
                } else {
                    O7.f206975b = cVar.field_MediaUrl;
                }
                O7.f206979f = false;
            }
            O7.f206977d = i;
            long l = C86013q1.m106451l(O7.f206975b);
            O7.f206983j = l;
            O7.f206981h = l;
            O7.f206982i = C90193h.m112876d(O7.f206975b);
            O7.mo98501a(context);
        }
        boolean z2 = !TextUtils.isEmpty(mo98444O7().f206975b);
        if (mo98444O7().f206977d == 0 || !z2) {
            mo98469o8();
            z = true;
        }
        if (!z && (view = this.f206873B) != null) {
            view.post(new C71438t(this));
        }
    }

    /* renamed from: k8 */
    public final void mo98465k8() {
        String str = mo98445P7().f147238g.f147088e;
        if (!(str == null || C112551y.m153811k(str))) {
            mo98473r8(IStatusIconHelperKt.m39109a().mo62301m(mo98445P7().f147238g));
        }
    }

    /* renamed from: l8 */
    public final boolean mo98466l8() {
        return ((Boolean) this.f206919c1.getValue()).booleanValue();
    }

    /* renamed from: m8 */
    public final void mo98467m8() {
        ArrayList arrayList;
        this.f206872A1.clear();
        this.f206874B1 = 0;
        if (!Util.isNullOrNil(this.f206953u1)) {
            Object[] array = new C66723k(",").mo90760e(this.f206953u1, 0).toArray(new String[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            List<String> f = C64197v.m75537f(Arrays.copyOf(strArr, strArr.length));
            LinkedList<String> linkedList = this.f206872A1;
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
            this.f206874B1 |= 1;
        }
        if (!Util.isNullOrNil(this.f206949s1)) {
            Object[] array2 = new C66723k(",").mo90760e(this.f206949s1, 0).toArray(new String[0]);
            C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr2 = (String[]) array2;
            List<String> f2 = C64197v.m75537f(Arrays.copyOf(strArr2, strArr2.length));
            LinkedList<String> linkedList3 = this.f206872A1;
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
            this.f206874B1 |= 4;
        }
        if (!Util.isNullOrNil(this.f206951t1)) {
            Object[] array3 = new C66723k(",").mo90760e(this.f206951t1, 0).toArray(new String[0]);
            C87412m.m108592e(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr3 = (String[]) array3;
            this.f206872A1.addAll(C64197v.m75537f(Arrays.copyOf(strArr3, strArr3.length)));
            this.f206874B1 |= 2;
        }
    }

    /* renamed from: n8 */
    public final void mo98468n8() {
        Intent intent = new Intent();
        String str = mo98445P7().f147247s;
        if (!(str == null || C112551y.m153811k(str))) {
            intent.putExtra("get_poi_classify_id", mo98445P7().f147247s);
        }
        intent.putExtra("get_lat", mo98445P7().f147236e);
        intent.putExtra("get_lng", mo98445P7().f147235d);
        intent.putExtra("near_life_scene", 1);
        C88144b.m109795m(getContext(), "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", intent, 10);
        C5139t.m5183e(12, 10);
    }

    /* renamed from: o8 */
    public final void mo98469o8() {
        mo98456a8().setImageResource(this.f206912X0);
        mo98456a8().setVisibility(0);
        Object value = ((C36570n) this.f206871A).getValue();
        C87412m.m108593f(value, "<get-vBackGroundIcon>(...)");
        ((ImageView) value).setVisibility(0);
        FrameLayout frameLayout = this.f206875C;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        View V7 = mo98451V7();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = V7;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity", "setDefBackGround", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity", "setDefBackGround", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "onActivityResult");
        super.onActivityResult(i, i2, intent);
        String str4 = "";
        int i5 = 0;
        if (i3 == 3) {
            if (i4 == -1) {
                if (intent2 == null || (str = intent2.getStringExtra("STATUS_TYPE_IMG")) == null) {
                    str = str4;
                }
                mo98445P7().f147238g.f147088e = str;
                mo98472q8();
                if (!(intent2 == null || (stringExtra = intent2.getStringExtra("STATUS_TYPE_CUSTOM_TITLE")) == null)) {
                    str4 = stringExtra;
                }
                if (!IStatusIconHelperKt.m39109a().mo62289a(str)) {
                    str4 = IStatusIconHelperKt.m39109a().mo62300l(str);
                }
                mo98473r8(str4);
            }
            int intExtra = intent2 != null ? intent2.getIntExtra("ClkCustomIconCount", 0) : 0;
            int intExtra2 = intent2 != null ? intent2.getIntExtra("CustomTitleTooLongCount", 0) : 0;
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context, 8, cls);
            if (v1Var != null) {
                v1Var.f229511p0 += (long) intExtra;
                v1Var.f229520x0 += (long) intExtra2;
                v1Var.f229497a1 = (long) (intent2 != null ? intent2.getIntExtra("KEY_CLK_USER_DEFINE_ICON_COUNT", 0) : 0);
                if (intent2 != null) {
                    i5 = intent2.getIntExtra("KEY_CLK_ADD_ICON_TO_CUSTOM_TITLE_COUNT", 0);
                }
                v1Var.f229498b1 = (long) i5;
            }
            mo98494w8();
        } else if (i3 != 4) {
            if (i3 == 6) {
                this.f206886H1 = str4;
                if (intent2 != null && i4 == -1) {
                    ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("key_select_video_list");
                    String stringExtra2 = intent2.getStringExtra("K_SEGMENTVIDEOPATH");
                    if ((stringArrayListExtra == null || stringArrayListExtra.size() <= 0) && Util.isNullOrNil(stringExtra2)) {
                        ArrayList<String> stringArrayListExtra2 = intent2.getStringArrayListExtra("key_select_image_list");
                        if (stringArrayListExtra2 == null || stringArrayListExtra2.size() == 0) {
                            Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "no image selected");
                        } else {
                            mo98437H7(1, stringArrayListExtra2.get(0), str4);
                        }
                    } else {
                        if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
                            str2 = str4;
                        } else {
                            String str5 = stringArrayListExtra.get(0);
                            C87412m.m108593f(str5, "{\n                videoPathList[0]\n            }");
                            str2 = str5;
                        }
                        this.f206886H1 = str2;
                        if (!(stringExtra2 == null || C112551y.m153811k(stringExtra2))) {
                            str4 = stringExtra2;
                        } else if (stringArrayListExtra != null && stringArrayListExtra.size() > 0) {
                            str4 = stringArrayListExtra.get(0);
                        }
                        String stringExtra3 = intent2.getStringExtra("KSEGMENTVIDEOTHUMBPATH");
                        if (Util.isNullOrNil(stringExtra3) || !C86013q1.m106450k(stringExtra3)) {
                            stringExtra3 = mo98442M7(str4);
                        }
                        Log.m105925i("MicroMsg.TextStatus.TextStatusEditActivity", "video path %s thumb path %s and %s %s ", str4, stringExtra3, Long.valueOf(C86013q1.m106451l(str4)), Long.valueOf(C86013q1.m106451l(stringExtra3)));
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
                        mo98437H7(2, str4, stringExtra3);
                    }
                }
            } else if (i3 != 7) {
                String str6 = null;
                if (i3 != 8) {
                    if (i3 == 10) {
                        Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "intent " + intent2);
                        if (intent2 != null) {
                            String stringExtra4 = intent2.getStringExtra("get_poi_name");
                            String stringExtra5 = intent2.getStringExtra("get_city");
                            if (!Util.isNullOrNil(stringExtra4) || !Util.isNullOrNil(stringExtra5)) {
                                str6 = Util.nullAs(stringExtra4, stringExtra5);
                            }
                            float floatExtra = intent2.getFloatExtra("get_lat", -1000.0f);
                            float floatExtra2 = intent2.getFloatExtra("get_lng", -1000.0f);
                            mo98445P7().f147247s = Util.nullAs(intent2.getStringExtra("get_poi_classify_id"), str4);
                            mo98445P7().f147248t = str6;
                            mo98445P7().f147236e = (double) floatExtra;
                            mo98445P7().f147235d = (double) floatExtra2;
                        }
                        mo98495x8();
                    }
                } else if (i4 == -1 && intent2 != null && (byteArrayExtra = intent2.getByteArrayExtra("SELECT_OBJECT")) != null) {
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
                            i5 = 1;
                        }
                        if (i5 != 0) {
                            str3 = C66800f.f191914b;
                        } else {
                            str3 = ';' + C66800f.f191914b;
                        }
                        sb.append(str3);
                        v1Var3.f229495Z = sb.toString();
                    }
                    C60187m5 s9 = ((C60208v1) C86312j.m106911c(C60208v1.class)).mo78718s9(finderObject.contact);
                    mo98438I7();
                    C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
                    String nickname = s9 != null ? s9.getNickname() : null;
                    if (s9 != null) {
                        str6 = s9.getAvatarUrl();
                    }
                    C47465a Iw0 = t1Var.Iw0(nickname, str6, finderObject.f164794id, finderObject);
                    C87412m.m108592e(Iw0, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.BaseLocalSetStatusParam");
                    C52678e0 e0Var = ((C78313a) Iw0).f229399d.f147238g;
                    C52678e0 e0Var2 = mo98445P7().f147238g;
                    C87412m.m108593f(e0Var2, "curTextStatusExtInfo.topicInfo");
                    mo98496y8(e0Var2, e0Var);
                    mo98497z8();
                    mo98494w8();
                }
            } else if (i4 == -1 && intent2 != null) {
                Parcelable parcelableExtra = intent2.getParcelableExtra("KSEGMENTMEDIAINFO");
                C87412m.m108591d(parcelableExtra);
                CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel2 = (CaptureDataManager.CaptureVideoNormalModel) parcelableExtra;
                mo98437H7(2, captureVideoNormalModel2.f272894e, captureVideoNormalModel2.f272895f);
            }
        } else if (intent2 != null) {
            this.f206947r1 = intent2.getIntExtra("Ktag_range_index", 0);
            String stringExtra6 = intent2.getStringExtra("Klabel_name_list");
            if (stringExtra6 == null) {
                stringExtra6 = str4;
            }
            this.f206949s1 = stringExtra6;
            String stringExtra7 = intent2.getStringExtra("Kother_user_name_list");
            if (stringExtra7 == null) {
                stringExtra7 = str4;
            }
            this.f206951t1 = stringExtra7;
            String stringExtra8 = intent2.getStringExtra("Kchat_room_name_list");
            if (stringExtra8 != null) {
                str4 = stringExtra8;
            }
            this.f206953u1 = str4;
            if (mo98466l8()) {
                ArrayList<String> stringArrayListExtra3 = intent2.getStringArrayListExtra("label_id");
                if (!(stringArrayListExtra3 == null || stringArrayListExtra3.isEmpty())) {
                    this.f206955v1.clear();
                    this.f206955v1.addAll(stringArrayListExtra3);
                }
            }
            mo98467m8();
            int i6 = this.f206947r1;
            if (i6 == 0) {
                this.f206874B1 = 0;
            }
            mo98474s8(i6);
            AppCompatActivity context4 = getContext();
            C87412m.m108593f(context4, "context");
            C78318v1 v1Var4 = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context4, 8, cls);
            if (v1Var4 != null) {
                v1Var4.f229471J = this.f206874B1;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "onAttachedToWindow() called");
    }

    public void onBackPressed() {
        super.onBackPressed();
        getContext().overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0544  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x059c  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x07c4  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x07c6  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x07c9  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x07d0  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x07ef  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x080e  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0818  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0840  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x08a8  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0a3b  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0a89  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0c2b  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0c33  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x03c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r34) {
        /*
            r33 = this;
            r0 = r33
            java.lang.Class<uz2.v1> r1 = uz2.C78318v1.class
            java.lang.Class<ox.b> r2 = p640ox.C77049b.class
            r3 = 109(0x6d, float:1.53E-43)
            r0.supportRequestWindowFeature(r3)
            super.onCreate(r34)
            android.view.Window r3 = r33.getWindow()
            android.content.res.Resources r4 = r33.getResources()
            r5 = 2131099794(0x7f060092, float:1.7811951E38)
            int r4 = r4.getColor(r5)
            r3.setNavigationBarColor(r4)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r0.setActionbarColor(r3)
            android.view.Window r5 = r33.getWindow()
            android.view.View r5 = r5.getDecorView()
            r6 = 1280(0x500, float:1.794E-42)
            r5.setSystemUiVisibility(r6)
            android.view.Window r5 = r33.getWindow()
            in3.C87773e.m109211d(r5)
            com.tencent.mm.ui.MMActivityController r5 = r33.getController()
            androidx.appcompat.app.ActionBar r5 = r5.f348065F
            r5.mo91092J(r3)
            java.lang.Class<q00.d> r5 = q00.C62570d.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            q00.d r5 = (q00.C62570d) r5
            r5.Up0()
            java.lang.String r5 = ""
            r0.setMMTitle((java.lang.String) r5)
            r33.hideActionbarLine()
            r33.hideActionBarOperationArea()
            androidx.appcompat.app.ActionBar r6 = r33.getSupportActionBar()
            if (r6 == 0) goto L_0x0064
            r6.mo91104o()
        L_0x0064:
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$l0 r6 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$l0
            r6.<init>(r0)
            r0.setBackBtn(r6)
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$statusExptSwitchChangeEventListener$1 r6 = r0.f206931i1
            r6.alive()
            android.content.Intent r6 = r33.getIntent()
            java.lang.String r7 = "KEY_IS_FROM_RECENT_STATUS"
            boolean r6 = r6.getBooleanExtra(r7, r3)
            r0.f206923e1 = r6
            di3.d r6 = di3.C86312j.m106911c(r2)
            ox.b r6 = (p640ox.C77049b) r6
            dm2.c r7 = new dm2.c
            r8 = 8
            r9 = 1
            r7.<init>(r1, r8, r9)
            r6.mo72352Rp(r0, r7)
            di3.d r6 = di3.C86312j.m106911c(r2)
            ox.b r6 = (p640ox.C77049b) r6
            pe3.a r6 = r6.Wi0(r0, r8, r1)
            uz2.v1 r6 = (uz2.C78318v1) r6
            if (r6 == 0) goto L_0x00ac
            long r10 = eb0.C31543z5.m39453c()
            java.lang.String r7 = java.lang.String.valueOf(r10)
            r6.f229500d = r7
            long r10 = eb0.C31543z5.m39453c()
            r6.f229504g = r10
        L_0x00ac:
            r6 = 2131306229(0x7f0926f5, float:1.8230651E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0.f206926g = r6
            r6 = 2131315847(0x7f094c87, float:1.8250159E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0.f206924f = r6
            r6 = 2131316072(0x7f094d68, float:1.8250615E38)
            android.view.View r6 = r0.findViewById(r6)
            r0.f206937n = r6
            r6 = 2131316080(0x7f094d70, float:1.8250631E38)
            android.view.View r6 = r0.findViewById(r6)
            r0.f206939o = r6
            r6 = 2131306178(0x7f0926c2, float:1.8230548E38)
            android.view.View r6 = r0.findViewById(r6)
            r0.f206941p = r6
            r6 = 2131306224(0x7f0926f0, float:1.8230641E38)
            android.view.View r6 = r0.findViewById(r6)
            r0.f206946r = r6
            r6 = 2131306234(0x7f0926fa, float:1.8230661E38)
            android.view.View r6 = r0.findViewById(r6)
            r0.f206950t = r6
            r6 = 2131301702(0x7f091546, float:1.822147E38)
            android.view.View r6 = r0.findViewById(r6)
            java.lang.String r7 = "findViewById(R.id.et_desc)"
            gy3.C87412m.m108593f(r6, r7)
            com.tencent.mm.ui.widget.MMEditText r6 = (com.tencent.p014mm.p136ui.widget.MMEditText) r6
            r0.f206952u = r6
            r6 = 2131315707(0x7f094bfb, float:1.8249875E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6 = 2131301996(0x7f09166c, float:1.8222066E38)
            android.view.View r6 = r0.findViewById(r6)
            r0.f206873B = r6
            r6 = 2131316050(0x7f094d52, float:1.825057E38)
            android.view.View r6 = r0.findViewById(r6)
            java.lang.String r7 = "findViewById(R.id.v_back)"
            gy3.C87412m.m108593f(r6, r7)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0.f206883G = r6
            r6 = 2131316066(0x7f094d62, float:1.8250603E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0.f206885H = r6
            r6 = 2131315870(0x7f094c9e, float:1.8250205E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0.f206958x = r6
            r6 = 2131307185(0x7f092ab1, float:1.823259E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r0.f206875C = r6
            r6 = 2131307177(0x7f092aa9, float:1.8232574E38)
            android.view.View r6 = r0.findViewById(r6)
            r0.f206896P = r6
            r6 = 2131307107(0x7f092a63, float:1.8232432E38)
            android.view.View r6 = r0.findViewById(r6)
            r0.f206895N = r6
            r6 = 2131298477(0x7f0908ad, float:1.8214928E38)
            android.view.View r6 = r0.findViewById(r6)
            r0.f206903T = r6
            r6 = 2131298457(0x7f090899, float:1.8214888E38)
            android.view.View r6 = r0.findViewById(r6)
            java.lang.String r7 = "findViewById(R.id.btn_ok)"
            gy3.C87412m.m108593f(r6, r7)
            r0.setBtnOk(r6)
            r6 = 2131298417(0x7f090871, float:1.8214807E38)
            android.view.View r6 = r0.findViewById(r6)
            java.lang.String r7 = "findViewById(R.id.btn_back)"
            gy3.C87412m.m108593f(r6, r7)
            r0.setBtnBack(r6)
            r6 = 2131301267(0x7f091393, float:1.8220587E38)
            android.view.View r6 = r0.findViewById(r6)
            r0.f206920d = r6
            r6 = 2131307075(0x7f092a43, float:1.8232367E38)
            android.view.View r6 = r0.findViewById(r6)
            java.lang.String r7 = "findViewById(R.id.layout_blur_option)"
            gy3.C87412m.m108593f(r6, r7)
            r0.setLayoutBlurOption(r6)
            r6 = 2131306713(0x7f0928d9, float:1.8231633E38)
            android.view.View r6 = r0.findViewById(r6)
            java.lang.String r7 = "findViewById(R.id.iv_blur)"
            gy3.C87412m.m108593f(r6, r7)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0.f206913Y = r6
            r6 = 2131306455(0x7f0927d7, float:1.823111E38)
            android.view.View r6 = r0.findViewById(r6)
            com.tencent.mm.emoji.view.EmojiPanelInputComponent r6 = (com.tencent.p014mm.emoji.view.EmojiPanelInputComponent) r6
            r0.f206922e = r6
            android.widget.ImageView r6 = r0.f206883G
            java.lang.String r7 = "vBack"
            r10 = 0
            if (r6 == 0) goto L_0x0c37
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$m0 r11 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$m0
            r11.<init>(r0)
            r6.post(r11)
            com.tencent.p014mm.p136ui.C75044y4.m89994f(r33)
            com.tencent.p014mm.p136ui.C75044y4.m89989a(r33)
            com.tencent.p014mm.p136ui.C75044y4.m89991c(r33)
            com.tencent.p014mm.p136ui.C85875k4.m106180f()
            android.content.Intent r6 = r33.getIntent()
            java.lang.String r11 = "SET_TEXT_PARAMS"
            byte[] r6 = r6.getByteArrayExtra(r11)
            if (r6 == 0) goto L_0x01e0
            qy2.z r11 = new qy2.z
            r11.<init>()
            r11.parseFrom(r6)
            r0.f206904T0 = r11
        L_0x01e0:
            qy2.z r6 = r0.f206904T0
            if (r6 == 0) goto L_0x01f5
            java.lang.String r6 = r6.f229400e
            if (r6 == 0) goto L_0x01f5
            int r6 = r6.length()
            if (r6 != 0) goto L_0x01f0
            r6 = 1
            goto L_0x01f1
        L_0x01f0:
            r6 = 0
        L_0x01f1:
            if (r6 != 0) goto L_0x01f5
            r6 = 1
            goto L_0x01f6
        L_0x01f5:
            r6 = 0
        L_0x01f6:
            if (r6 == 0) goto L_0x01ff
            b03.p r6 = b03.C39718p.f106569a
            r6 = 2131235252(0x7f0811b4, float:1.8086693E38)
            r0.f206912X0 = r6
        L_0x01ff:
            android.content.Intent r6 = r33.getIntent()
            java.lang.String r11 = "ACTION_NEED_HANDLE_LAST_RESP"
            boolean r6 = r6.getBooleanExtra(r11, r3)
            r0.f206921d1 = r6
            qy2.z r6 = r0.f206904T0
            if (r6 == 0) goto L_0x0212
            int r11 = r6.f229411s
            goto L_0x0213
        L_0x0212:
            r11 = 0
        L_0x0213:
            r0.f206906U0 = r11
            r12 = 2
            if (r11 == 0) goto L_0x03c6
            if (r11 == r9) goto L_0x034a
            if (r11 == r12) goto L_0x0223
            uz2.u r6 = new uz2.u
            r6.<init>()
            goto L_0x03c4
        L_0x0223:
            if (r6 == 0) goto L_0x0228
            java.lang.String r6 = r6.f229412t
            goto L_0x0229
        L_0x0228:
            r6 = r10
        L_0x0229:
            az2.e r11 = az2.C39674e.f106452d
            rz2.c r11 = r11.mo62253n0(r6)
            uz2.u r13 = new uz2.u
            r13.<init>()
            if (r11 == 0) goto L_0x0326
            int r14 = r11.field_MediaType
            r13.f147237f = r14
            java.lang.String r14 = r11.field_MediaUrl
            r13.f147239h = r14
            java.lang.String r14 = r11.field_MediaAESKey
            r13.f147240i = r14
            java.lang.String r14 = r11.field_MediaThumbUrl
            r13.f147241j = r14
            java.lang.String r14 = r11.field_MediaThumbAESKey
            r13.f147242n = r14
            java.lang.Long r14 = r11.field_option
            long r14 = r14.longValue()
            r16 = 1
            long r14 = r14 & r16
            r13.f147249u = r14
            int r14 = r11.field_mediaWidth
            r13.f147250v = r14
            int r14 = r11.field_mediaHeight
            r13.f147251w = r14
            uz2.e0 r14 = p773yy.C66710j.C53637a.m60171a(r11, r3, r9, r10)
            uz2.e0 r15 = new uz2.e0
            r15.<init>()
            java.lang.String r12 = "refTopicInfo"
            gy3.C87412m.m108594g(r14, r12)
            xz2.r r12 = xz2.C79019r.f232026a
            xz2.o r12 = new xz2.o
            r12.<init>()
            java.util.LinkedList r3 = hz2.C60235a.m70502b(r14)
            java.util.LinkedList<uz2.a0> r8 = r14.f147090g
            r12.mo107628t(r10, r3, r8)
            boolean r3 = r12.mo107627s()
            if (r3 != r9) goto L_0x0284
            r3 = 1
            goto L_0x0285
        L_0x0284:
            r3 = 0
        L_0x0285:
            if (r3 == 0) goto L_0x02bd
            boolean r3 = r12.mo84146j()
            if (r3 != r9) goto L_0x028f
            r3 = 1
            goto L_0x0290
        L_0x028f:
            r3 = 0
        L_0x0290:
            if (r3 == 0) goto L_0x02bd
            java.lang.String r3 = hz2.C60235a.m70504d(r14)
            hz2.C60235a.m70509i(r15, r3)
            java.lang.String r3 = hz2.C60235a.m70501a(r14)
            hz2.C60235a.m70506f(r15, r3)
            java.lang.String r3 = hz2.C60235a.m70505e(r14)
            hz2.C60235a.m70510j(r15, r3)
            java.lang.String r3 = hz2.C60235a.m70503c(r14)
            hz2.C60235a.m70508h(r15, r3)
            java.util.LinkedList<uz2.a0> r3 = r14.f147090g
            r15.f147090g = r3
            java.lang.String r3 = r14.f147091h
            r15.f147091h = r3
            java.util.LinkedList r3 = hz2.C60235a.m70502b(r14)
            hz2.C60235a.m70507g(r15, r3)
        L_0x02bd:
            boolean r3 = r12.mo107627s()
            r3 = r3 ^ r9
            if (r3 == 0) goto L_0x030a
            boolean r3 = r12.mo84146j()
            if (r3 != r9) goto L_0x02cc
            r3 = 1
            goto L_0x02cd
        L_0x02cc:
            r3 = 0
        L_0x02cd:
            if (r3 == 0) goto L_0x030a
            qy2.z r3 = r12.mo87467a()
            if (r3 == 0) goto L_0x02dc
            uz2.u r3 = r3.f229399d
            if (r3 == 0) goto L_0x02dc
            uz2.e0 r3 = r3.f147238g
            goto L_0x02dd
        L_0x02dc:
            r3 = r10
        L_0x02dd:
            if (r3 == 0) goto L_0x030a
            java.lang.String r8 = hz2.C60235a.m70504d(r3)
            hz2.C60235a.m70509i(r15, r8)
            java.lang.String r8 = hz2.C60235a.m70501a(r3)
            hz2.C60235a.m70506f(r15, r8)
            java.lang.String r8 = hz2.C60235a.m70505e(r3)
            hz2.C60235a.m70510j(r15, r8)
            java.lang.String r8 = hz2.C60235a.m70503c(r3)
            hz2.C60235a.m70508h(r15, r8)
            java.util.LinkedList<uz2.a0> r8 = r3.f147090g
            r15.f147090g = r8
            java.lang.String r8 = r3.f147091h
            r15.f147091h = r8
            java.util.LinkedList r3 = hz2.C60235a.m70502b(r3)
            hz2.C60235a.m70507g(r15, r3)
        L_0x030a:
            qy2.z r3 = r0.f206904T0
            if (r3 == 0) goto L_0x0319
            uz2.u r3 = r3.f229399d
            if (r3 == 0) goto L_0x0319
            uz2.e0 r3 = r3.f147238g
            if (r3 == 0) goto L_0x0319
            java.lang.String r3 = r3.f147088e
            goto L_0x031a
        L_0x0319:
            r3 = r10
        L_0x031a:
            r15.f147088e = r3
            java.lang.String r3 = r14.f147092i
            r15.f147092i = r3
            r13.f147238g = r15
            int r3 = r11.field_sceneType
            r13.f147226E = r3
        L_0x0326:
            di3.d r3 = di3.C86312j.m106911c(r2)
            ox.b r3 = (p640ox.C77049b) r3
            r8 = 8
            pe3.a r3 = r3.Wi0(r0, r8, r1)
            uz2.v1 r3 = (uz2.C78318v1) r3
            if (r3 == 0) goto L_0x0340
            if (r11 == 0) goto L_0x033b
            java.lang.String r8 = r11.field_StatusID
            goto L_0x033c
        L_0x033b:
            r8 = r10
        L_0x033c:
            r3.f229493Y = r8
            r3.f229491X = r6
        L_0x0340:
            int r3 = r13.f147237f
            if (r3 == 0) goto L_0x0347
            hz2.C76252b.m91660d(r13, r9)
        L_0x0347:
            r6 = r13
            goto L_0x03c4
        L_0x034a:
            if (r6 == 0) goto L_0x034f
            java.lang.String r3 = r6.f229412t
            goto L_0x0350
        L_0x034f:
            r3 = r10
        L_0x0350:
            az2.e r6 = az2.C39674e.f106452d
            rz2.c r3 = r6.mo62253n0(r3)
            if (r3 == 0) goto L_0x035d
            rz2.c r3 = r3.mo72943l2()
            goto L_0x035e
        L_0x035d:
            r3 = r10
        L_0x035e:
            uz2.u r6 = new uz2.u
            r6.<init>()
            if (r3 == 0) goto L_0x03c4
            double r11 = r3.field_Longitude
            r6.f147235d = r11
            double r11 = r3.field_Latitude
            r6.f147236e = r11
            int r8 = r3.field_MediaType
            r6.f147237f = r8
            uz2.e0 r8 = r3.mo72938f1(r9)
            r6.f147238g = r8
            java.lang.String r8 = r3.field_MediaUrl
            r6.f147239h = r8
            java.lang.String r8 = r3.field_MediaAESKey
            r6.f147240i = r8
            java.lang.String r8 = r3.field_MediaThumbUrl
            r6.f147241j = r8
            java.lang.String r8 = r3.field_MediaThumbAESKey
            r6.f147242n = r8
            int r8 = r3.field_Visibility
            r6.f147243o = r8
            java.lang.String r8 = r3.field_Description
            r6.f147231J = r8
            int r8 = r3.field_CreateTime
            r6.f147245q = r8
            int r8 = r3.field_ExpireTime
            r6.f147246r = r8
            java.lang.String r8 = r3.field_PoiID
            r6.f147247s = r8
            java.lang.String r8 = r3.field_PoiName
            r6.f147248t = r8
            java.lang.Long r8 = r3.field_option
            java.lang.String r11 = "it.field_option"
            gy3.C87412m.m108593f(r8, r11)
            long r11 = r8.longValue()
            r6.f147249u = r11
            int r8 = r3.field_mediaWidth
            r6.f147250v = r8
            int r8 = r3.field_mediaHeight
            r6.f147251w = r8
            java.lang.String r8 = r3.field_backgroundId
            r6.f147252x = r8
            int r8 = r3.field_sceneType
            r6.f147226E = r8
            uz2.s r3 = r3.mo72945n2()
            r6.f147232K = r3
            r3 = r8
            goto L_0x03f2
        L_0x03c4:
            r3 = 0
            goto L_0x03f2
        L_0x03c6:
            if (r6 == 0) goto L_0x03cb
            uz2.u r3 = r6.f229399d
            goto L_0x03cc
        L_0x03cb:
            r3 = r10
        L_0x03cc:
            if (r3 != 0) goto L_0x03d3
            uz2.u r3 = new uz2.u
            r3.<init>()
        L_0x03d3:
            r6 = r3
            int r3 = r6.f147226E
            if (r3 != 0) goto L_0x03ed
            uz2.e0 r3 = r6.f147238g
            if (r3 == 0) goto L_0x03e1
            java.lang.String r3 = hz2.C60235a.m70504d(r3)
            goto L_0x03e2
        L_0x03e1:
            r3 = r10
        L_0x03e2:
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x03ea
            r3 = 1
            goto L_0x03eb
        L_0x03ea:
            r3 = 2
        L_0x03eb:
            r6.f147226E = r3
        L_0x03ed:
            int r3 = r6.f147226E
            r8 = 0
            r6.f147245q = r8
        L_0x03f2:
            r0.f206910W0 = r6
            di3.d r6 = di3.C86312j.m106911c(r2)
            ox.b r6 = (p640ox.C77049b) r6
            androidx.appcompat.app.AppCompatActivity r8 = r33.getContext()
            java.lang.String r11 = "context"
            gy3.C87412m.m108593f(r8, r11)
            r11 = 8
            pe3.a r6 = r6.Wi0(r8, r11, r1)
            uz2.v1 r6 = (uz2.C78318v1) r6
            if (r6 == 0) goto L_0x040f
            r6.f229501d1 = r3
        L_0x040f:
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$e r3 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$e
            uz2.u r6 = r33.mo98445P7()
            r3.<init>(r6)
            r0.f206890J1 = r3
            java.lang.Object[] r3 = new java.lang.Object[r9]
            qy2.z r6 = r0.f206904T0
            r8 = 0
            r3[r8] = r6
            java.lang.String r6 = "MicroMsg.TextStatus.TextStatusEditActivity"
            java.lang.String r8 = "[onCreate] setStatusParam:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r3)
            int r3 = r0.f206906U0
            if (r3 != r9) goto L_0x0447
            uz2.u r3 = r33.mo98445P7()
            java.lang.String r3 = r3.f147252x
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x045b
            b03.p r3 = b03.C39718p.f106569a
            uz2.u r8 = r33.mo98445P7()
            java.lang.String r8 = r8.f147252x
            int r3 = r3.mo62351b(r8)
            r0.f206912X0 = r3
            goto L_0x045b
        L_0x0447:
            qy2.z r3 = r0.f206904T0
            if (r3 == 0) goto L_0x045b
            uz2.u r3 = r3.f229399d
            if (r3 == 0) goto L_0x045b
            java.lang.String r3 = r3.f147252x
            if (r3 == 0) goto L_0x045b
            b03.p r8 = b03.C39718p.f106569a
            int r3 = r8.mo62351b(r3)
            r0.f206912X0 = r3
        L_0x045b:
            b03.c r3 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            uz2.u r8 = r33.mo98445P7()
            uz2.e0 r8 = r8.f147238g
            java.lang.String r8 = r8.f147088e
            boolean r3 = r3.mo62280J(r8)
            if (r3 == 0) goto L_0x0493
            rx3.g r3 = r0.f206964z
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.String r8 = "<get-vPicBg>(...)"
            gy3.C87412m.m108593f(r3, r8)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r11 = 0
            r3.setVisibility(r11)
            rx3.g r3 = r0.f206964z
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            gy3.C87412m.m108593f(r3, r8)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r8 = 2131231877(0x7f080485, float:1.8079847E38)
            r3.setImageResource(r8)
        L_0x0493:
            qy2.z r3 = r0.f206904T0
            if (r3 == 0) goto L_0x04e6
            di3.d r8 = di3.C86312j.m106911c(r2)
            ox.b r8 = (p640ox.C77049b) r8
            r11 = 8
            pe3.a r8 = r8.Wi0(r0, r11, r1)
            uz2.v1 r8 = (uz2.C78318v1) r8
            if (r8 == 0) goto L_0x04e6
            java.lang.String r11 = r3.f229403h
            r8.f229475N = r11
            long r11 = r3.f229404i
            r8.f229476P = r11
            int r11 = r3.f229406n
            r8.f229477Q = r11
            int r11 = r3.f229407o
            r8.f229479R = r11
            long r11 = r3.f229396A
            r8.f229497a1 = r11
            long r11 = r3.f229397B
            r8.f229498b1 = r11
            int r11 = r3.f229408p
            long r11 = (long) r11
            r8.f229511p0 = r11
            int r11 = r3.f229409q
            long r11 = (long) r11
            r8.f229520x0 = r11
            java.lang.String r11 = r3.f229416x
            r8.f229492X0 = r11
            java.lang.String r11 = r3.f229417y
            r8.f229494Y0 = r11
            long r11 = r3.f229405j
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x04e0
            long r11 = eb0.C31543z5.m39453c()
            r8.f229504g = r11
            goto L_0x04e2
        L_0x04e0:
            r8.f229504g = r11
        L_0x04e2:
            int r3 = r3.f229415w
            r8.f229478Q0 = r3
        L_0x04e6:
            android.view.View r3 = r33.mo98443N7()
            r3.setEnabled(r9)
            android.view.View r3 = r33.mo98443N7()
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$n0 r8 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$n0
            r8.<init>(r0)
            r3.setOnClickListener(r8)
            android.view.View r3 = r33.mo98443N7()
            boolean r3 = r3.isEnabled()
            if (r3 != 0) goto L_0x0544
            android.view.View r3 = r33.mo98450U7()
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r8.mo10233c(r4)
            java.lang.Object[] r19 = r8.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r21 = "onCreate"
            java.lang.String r22 = "(Landroid/os/Bundle;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r11 = 0
            java.lang.Object r8 = r8.mo10231a(r11)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r3.setVisibility(r8)
            java.lang.String r19 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r20 = "onCreate"
            java.lang.String r21 = "(Landroid/os/Bundle;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x058a
        L_0x0544:
            android.view.View r3 = r33.mo98450U7()
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r11 = 8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r8.mo10233c(r12)
            java.lang.Object[] r26 = r8.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r28 = "onCreate"
            java.lang.String r29 = "(Landroid/os/Bundle;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r3
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r11 = 0
            java.lang.Object r8 = r8.mo10231a(r11)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r3.setVisibility(r8)
            java.lang.String r26 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r27 = "onCreate"
            java.lang.String r28 = "(Landroid/os/Bundle;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
        L_0x058a:
            android.view.View r3 = r33.mo98450U7()
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$o0 r8 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$o0
            r8.<init>(r0)
            r3.setOnClickListener(r8)
            android.view.View r3 = r0.f206909W
            java.lang.String r8 = "btnBack"
            if (r3 == 0) goto L_0x0c33
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$p0 r11 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$p0
            r11.<init>(r0)
            r3.setOnClickListener(r11)
            android.widget.ImageView r3 = r0.f206883G
            if (r3 == 0) goto L_0x0c2f
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$q0 r7 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$q0
            r7.<init>(r0)
            r3.setOnClickListener(r7)
            int r3 = r0.f206906U0
            java.lang.String r7 = "<get-ivArrow>(...)"
            r11 = 4
            if (r3 != r9) goto L_0x0603
            rx3.g r3 = r0.f206899R
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            gy3.C87412m.m108593f(r3, r7)
            android.view.View r3 = (android.view.View) r3
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r7.mo10233c(r12)
            java.lang.Object[] r19 = r7.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r21 = "onCreate"
            java.lang.String r22 = "(Landroid/os/Bundle;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r12 = 0
            java.lang.Object r7 = r7.mo10231a(r12)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r3.setVisibility(r7)
            java.lang.String r19 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r20 = "onCreate"
            java.lang.String r21 = "(Landroid/os/Bundle;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x064a
        L_0x0603:
            rx3.g r3 = r0.f206899R
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            gy3.C87412m.m108593f(r3, r7)
            android.view.View r3 = (android.view.View) r3
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r4)
            java.lang.Object[] r19 = r7.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r21 = "onCreate"
            java.lang.String r22 = "(Landroid/os/Bundle;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r12 = 0
            java.lang.Object r7 = r7.mo10231a(r12)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r3.setVisibility(r7)
            java.lang.String r19 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r20 = "onCreate"
            java.lang.String r21 = "(Landroid/os/Bundle;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x064a:
            r33.mo98472q8()
            qy2.z r3 = r0.f206904T0
            if (r3 == 0) goto L_0x0654
            boolean r3 = r3.f229402g
            goto L_0x0655
        L_0x0654:
            r3 = 1
        L_0x0655:
            int r7 = r0.f206906U0
            if (r7 != 0) goto L_0x067d
            qy2.i r7 = r33.mo98446Q7()
            if (r7 == 0) goto L_0x0667
            boolean r7 = r7.mo107627s()
            if (r7 != r9) goto L_0x0667
            r7 = 1
            goto L_0x0668
        L_0x0667:
            r7 = 0
        L_0x0668:
            if (r7 == 0) goto L_0x067d
            qy2.i r7 = r33.mo98446Q7()
            if (r7 == 0) goto L_0x0678
            boolean r7 = r7.mo84146j()
            if (r7 != r9) goto L_0x0678
            r7 = 1
            goto L_0x0679
        L_0x0678:
            r7 = 0
        L_0x0679:
            if (r7 == 0) goto L_0x067d
            r7 = 1
            goto L_0x067e
        L_0x067d:
            r7 = 0
        L_0x067e:
            java.lang.String r12 = "<get-vFake>(...)"
            java.lang.String r13 = "<get-vCamera>(...)"
            if (r7 != 0) goto L_0x071e
            if (r3 != 0) goto L_0x0688
            goto L_0x071e
        L_0x0688:
            rx3.g r3 = r0.f206928h
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            gy3.C87412m.m108593f(r3, r13)
            android.view.View r3 = (android.view.View) r3
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r4)
            java.lang.Object[] r19 = r7.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r21 = "initCameraIcon"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r14 = 0
            java.lang.Object r7 = r7.mo10231a(r14)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r3.setVisibility(r7)
            java.lang.String r19 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r20 = "initCameraIcon"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            rx3.g r3 = r0.f206930i
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            gy3.C87412m.m108593f(r3, r12)
            android.view.View r3 = (android.view.View) r3
            k20.a r7 = new k20.a
            r7.<init>()
            r12 = 8
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            r7.mo10233c(r14)
            java.lang.Object[] r19 = r7.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r21 = "initCameraIcon"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r12 = 0
            java.lang.Object r7 = r7.mo10231a(r12)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r3.setVisibility(r7)
            java.lang.String r19 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r20 = "initCameraIcon"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x07b2
        L_0x071e:
            rx3.g r3 = r0.f206928h
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            gy3.C87412m.m108593f(r3, r13)
            android.view.View r3 = (android.view.View) r3
            k20.a r7 = new k20.a
            r7.<init>()
            r14 = 8
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r7.mo10233c(r15)
            java.lang.Object[] r19 = r7.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r21 = "initCameraIcon"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r14 = 0
            java.lang.Object r7 = r7.mo10231a(r14)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r3.setVisibility(r7)
            java.lang.String r19 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r20 = "initCameraIcon"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            rx3.g r3 = r0.f206930i
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            gy3.C87412m.m108593f(r3, r12)
            android.view.View r3 = (android.view.View) r3
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r4)
            java.lang.Object[] r19 = r7.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r21 = "initCameraIcon"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r12 = 0
            java.lang.Object r7 = r7.mo10231a(r12)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r3.setVisibility(r7)
            java.lang.String r19 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r20 = "initCameraIcon"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x07b2:
            r33.mo98465k8()
            uz2.u r3 = r33.mo98445P7()
            java.lang.String r3 = r3.f147231J
            if (r3 == 0) goto L_0x07c6
            int r3 = r3.length()
            if (r3 != 0) goto L_0x07c4
            goto L_0x07c6
        L_0x07c4:
            r3 = 0
            goto L_0x07c7
        L_0x07c6:
            r3 = 1
        L_0x07c7:
            if (r3 != 0) goto L_0x07d0
            uz2.u r3 = r33.mo98445P7()
            java.lang.String r3 = r3.f147231J
            goto L_0x07d6
        L_0x07d0:
            uz2.u r3 = r33.mo98445P7()
            java.lang.String r3 = r3.f147244p
        L_0x07d6:
            com.tencent.mm.ui.widget.MMEditText r7 = r33.mo98449T7()
            java.lang.Class<ny.h> r12 = p629ny.C76979h.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            ny.h r12 = (p629ny.C76979h) r12
            android.text.SpannableString r12 = r12.mo107057T1(r0, r3)
            r7.setText(r12)
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 != 0) goto L_0x07fe
            com.tencent.mm.ui.widget.MMEditText r7 = r33.mo98449T7()
            com.tencent.mm.ui.widget.MMEditText r12 = r33.mo98449T7()
            int r12 = r12.length()
            r7.setSelection(r12)
        L_0x07fe:
            di3.d r2 = di3.C86312j.m106911c(r2)
            ox.b r2 = (p640ox.C77049b) r2
            r7 = 8
            pe3.a r1 = r2.Wi0(r0, r7, r1)
            uz2.v1 r1 = (uz2.C78318v1) r1
            if (r1 == 0) goto L_0x0810
            r1.f229489W = r3
        L_0x0810:
            uz2.u r1 = r33.mo98445P7()
            uz2.s r1 = r1.f147232K
            if (r1 == 0) goto L_0x0840
            java.lang.String r2 = r1.f147197d
            if (r2 == 0) goto L_0x0825
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x0823
            goto L_0x0825
        L_0x0823:
            r2 = 0
            goto L_0x0826
        L_0x0825:
            r2 = 1
        L_0x0826:
            if (r2 != 0) goto L_0x089e
            java.lang.Class<bq.p0> r2 = p008bq.C0363p0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            bq.p0 r2 = (p008bq.C0363p0) r2
            java.lang.String r3 = r1.f147197d
            com.tencent.mm.api.IEmojiInfo r2 = r2.mo403r2(r3)
            if (r2 != 0) goto L_0x083c
            com.tencent.mm.api.IEmojiInfo r2 = iz2.C46390a.m51721a(r1)
        L_0x083c:
            r0.mo98458c8(r2)
            goto L_0x089e
        L_0x0840:
            qy2.z r1 = r0.f206904T0
            if (r1 == 0) goto L_0x089e
            uz2.t r1 = r1.f229398C
            if (r1 == 0) goto L_0x089e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "initEmojiInfo: isNeedEmoji:"
            r2.append(r3)
            boolean r3 = r1.f229447h
            r2.append(r3)
            java.lang.String r3 = " isLoadedEmoji:"
            r2.append(r3)
            boolean r3 = r1.f229446g
            r2.append(r3)
            java.lang.String r3 = " emojiMd5:"
            r2.append(r3)
            java.lang.String r3 = r1.f229443d
            r2.append(r3)
            java.lang.String r3 = " emojiPath:"
            r2.append(r3)
            java.lang.String r3 = r1.f229445f
            r2.append(r3)
            java.lang.String r3 = " cdnUrl:"
            r2.append(r3)
            java.lang.String r3 = r1.f229444e
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            boolean r2 = r1.f229447h
            if (r2 == 0) goto L_0x089e
            java.lang.Class<bq.l0> r2 = p008bq.C39833l0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            bq.l0 r2 = (p008bq.C39833l0) r2
            java.lang.String r3 = r1.f229443d
            java.lang.String r7 = r1.f229444e
            yz2.o1 r12 = new yz2.o1
            r12.<init>(r1, r0)
            r2.mo62464Ms(r3, r7, r12)
        L_0x089e:
            r33.mo98497z8()
            r33.mo98495x8()
            int r1 = r0.f206906U0
            if (r1 != r9) goto L_0x0a3b
            az2.e r1 = az2.C39674e.f106452d
            qy2.z r2 = r0.f206904T0
            if (r2 == 0) goto L_0x08b1
            java.lang.String r2 = r2.f229412t
            goto L_0x08b2
        L_0x08b1:
            r2 = r10
        L_0x08b2:
            rz2.c r1 = r1.mo62253n0(r2)
            if (r1 == 0) goto L_0x08bb
            java.lang.String r1 = r1.field_visibilityInfo
            goto L_0x08bc
        L_0x08bb:
            r1 = r10
        L_0x08bc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "initVisibility: visibilityInfo:"
            r2.append(r3)
            r2.append(r1)
            r3 = 32
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0990
            if (r1 == 0) goto L_0x0990
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x094b }
            r2.<init>(r1)     // Catch:{ all -> 0x094b }
            java.lang.String r1 = "mLabelRangeindex"
            int r1 = r2.optInt(r1)     // Catch:{ all -> 0x094b }
            r0.f206947r1 = r1     // Catch:{ all -> 0x094b }
            java.lang.String r1 = "mLabelNameList"
            java.lang.String r1 = r2.optString(r1)     // Catch:{ all -> 0x094b }
            java.lang.String r3 = "jsonObject.optString(\"mLabelNameList\")"
            gy3.C87412m.m108593f(r1, r3)     // Catch:{ all -> 0x094b }
            r0.f206949s1 = r1     // Catch:{ all -> 0x094b }
            java.lang.String r1 = "mOtherUserNameList"
            java.lang.String r1 = r2.optString(r1)     // Catch:{ all -> 0x094b }
            java.lang.String r3 = "jsonObject.optString(\"mOtherUserNameList\")"
            gy3.C87412m.m108593f(r1, r3)     // Catch:{ all -> 0x094b }
            r0.f206951t1 = r1     // Catch:{ all -> 0x094b }
            java.lang.String r1 = "mChatRoomNameList"
            java.lang.String r1 = r2.optString(r1)     // Catch:{ all -> 0x094b }
            java.lang.String r3 = "jsonObject.optString(\"mChatRoomNameList\")"
            gy3.C87412m.m108593f(r1, r3)     // Catch:{ all -> 0x094b }
            r0.f206953u1 = r1     // Catch:{ all -> 0x094b }
            boolean r1 = r33.mo98466l8()     // Catch:{ all -> 0x094b }
            java.lang.String r3 = "mLabelIdListString"
            if (r1 == 0) goto L_0x0933
            boolean r1 = r2.has(r3)     // Catch:{ all -> 0x094b }
            if (r1 == 0) goto L_0x0933
            java.util.ArrayList<java.lang.String> r1 = r0.f206955v1     // Catch:{ all -> 0x094b }
            r1.clear()     // Catch:{ all -> 0x094b }
            java.util.ArrayList<java.lang.String> r1 = r0.f206955v1     // Catch:{ all -> 0x094b }
            java.lang.String r7 = r2.optString(r3)     // Catch:{ all -> 0x094b }
            java.lang.String r12 = ","
            java.util.List r7 = com.tencent.p014mm.sdk.platformtools.Util.stringToList(r7, r12)     // Catch:{ all -> 0x094b }
            r1.addAll(r7)     // Catch:{ all -> 0x094b }
        L_0x0933:
            java.lang.String r1 = "initVisibility: has:%s ,mLabelIdList :%s"
            r7 = 2
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x094b }
            boolean r2 = r2.has(r3)     // Catch:{ all -> 0x094b }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x094b }
            r3 = 0
            r12[r3] = r2     // Catch:{ all -> 0x094b }
            java.util.ArrayList<java.lang.String> r2 = r0.f206955v1     // Catch:{ all -> 0x094b }
            r12[r9] = r2     // Catch:{ all -> 0x094b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r12)     // Catch:{ all -> 0x094b }
            goto L_0x094c
        L_0x094b:
        L_0x094c:
            android.view.View r1 = r0.f206939o
            if (r1 != 0) goto L_0x0952
            goto L_0x0a7a
        L_0x0952:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r4)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r20 = "initVisibility"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r19 = "initVisibility"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0a7a
        L_0x0990:
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$b r1 = f206867L1
            boolean r1 = r1.mo98498a()
            r0.f206876C1 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "initVisibility: isChangeDevice："
            r1.append(r2)
            boolean r2 = r0.f206876C1
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            boolean r1 = r0.f206876C1
            if (r1 == 0) goto L_0x09fa
            android.view.View r1 = r0.f206939o
            if (r1 != 0) goto L_0x09b8
            goto L_0x0a82
        L_0x09b8:
            k20.a r2 = new k20.a
            r2.<init>()
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r3)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r21 = "initVisibility"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r20 = "initVisibility"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0a82
        L_0x09fa:
            android.view.View r1 = r0.f206939o
            if (r1 != 0) goto L_0x0a00
            goto L_0x0a7a
        L_0x0a00:
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r4)
            java.lang.Object[] r26 = r2.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r28 = "initVisibility"
            java.lang.String r29 = "()V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r1
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r26 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r27 = "initVisibility"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0a7a
        L_0x0a3b:
            android.view.View r1 = r0.f206939o
            if (r1 != 0) goto L_0x0a40
            goto L_0x0a7a
        L_0x0a40:
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r4)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r20 = "initVisibility"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r19 = "initVisibility"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x0a7a:
            r33.mo98467m8()
            int r1 = r0.f206947r1
            r0.mo98474s8(r1)
        L_0x0a82:
            r33.mo98463i8()
            android.view.View r1 = r0.f206909W
            if (r1 == 0) goto L_0x0c2b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            gy3.C87412m.m108592e(r1, r2)
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            androidx.appcompat.app.AppCompatActivity r2 = r33.getContext()
            int r2 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r2)
            androidx.appcompat.app.AppCompatActivity r3 = r33.getContext()
            r4 = 6
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r4)
            int r2 = r2 + r3
            r1.topMargin = r2
            android.view.View r1 = r33.mo98451V7()
            yz2.n1 r2 = new yz2.n1
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            rx3.g r1 = r0.f206956w
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.String r2 = "<get-tvPoi>(...)"
            gy3.C87412m.m108593f(r1, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$f0 r2 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$f0
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            android.view.View r1 = r0.f206903T
            if (r1 == 0) goto L_0x0ad7
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$g0 r2 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$g0
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x0ad7:
            com.tencent.mm.ui.widget.MMEditText r1 = r33.mo98449T7()
            android.text.TextWatcher r2 = r0.f206938n1
            r1.addTextChangedListener(r2)
            java.text.SimpleDateFormat r1 = qy2.C77448f0.f225876a
            r1 = 3
            r0.f206917a1 = r1
            com.tencent.mm.ui.widget.MMEditText r2 = r33.mo98449T7()
            android.text.Editable r2 = r2.getText()
            java.lang.String r3 = "etDesc.text"
            gy3.C87412m.m108593f(r2, r3)
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0afa
            r2 = 1
            goto L_0x0afb
        L_0x0afa:
            r2 = 0
        L_0x0afb:
            if (r2 == 0) goto L_0x0b05
            com.tencent.mm.emoji.view.EmojiPanelInputComponent r2 = r0.f206922e
            if (r2 == 0) goto L_0x0b0d
            r2.setSmileySendButtonEnable(r9)
            goto L_0x0b0d
        L_0x0b05:
            com.tencent.mm.emoji.view.EmojiPanelInputComponent r2 = r0.f206922e
            if (r2 == 0) goto L_0x0b0d
            r3 = 0
            r2.setSmileySendButtonEnable(r3)
        L_0x0b0d:
            com.tencent.mm.emoji.view.EmojiPanelInputComponent r2 = r0.f206922e
            if (r2 == 0) goto L_0x0b18
            com.tencent.mm.ui.widget.MMEditText r3 = r33.mo98449T7()
            r2.setMMEditText(r3)
        L_0x0b18:
            com.tencent.mm.emoji.view.EmojiPanelInputComponent r2 = r0.f206922e
            if (r2 != 0) goto L_0x0b1d
            goto L_0x0b20
        L_0x0b1d:
            r2.setVisibility(r11)
        L_0x0b20:
            com.tencent.mm.emoji.view.EmojiPanelInputComponent r2 = r0.f206922e
            if (r2 == 0) goto L_0x0b27
            r2.setInputComponentListener(r0)
        L_0x0b27:
            com.tencent.mm.emoji.view.EmojiPanelInputComponent r2 = r0.f206922e
            if (r2 == 0) goto L_0x0b42
            r3 = 2131307108(0x7f092a64, float:1.8232434E38)
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L_0x0b42
            android.content.res.Resources r3 = r33.getResources()
            r4 = 2131099720(0x7f060048, float:1.7811801E38)
            int r3 = r3.getColor(r4)
            r2.setBackgroundColor(r3)
        L_0x0b42:
            com.tencent.mm.emoji.view.EmojiPanelInputComponent r2 = r0.f206922e
            if (r2 == 0) goto L_0x0b9e
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r2 = r2.getSmileyPanel()
            if (r2 == 0) goto L_0x0b9e
            int r3 = r0.f206917a1
            if (r3 < r1) goto L_0x0b53
            r3 = 0
            r8 = 1
            goto L_0x0b55
        L_0x0b53:
            r3 = 0
            r8 = 0
        L_0x0b55:
            r2.mo100204p(r8, r3)
            int r4 = r0.f206917a1
            if (r4 < r1) goto L_0x0b5e
            r8 = 1
            goto L_0x0b5f
        L_0x0b5e:
            r8 = 0
        L_0x0b5f:
            r2.mo100203o(r8, r3)
            int r1 = r0.f206917a1
            r4 = 2
            if (r1 < r4) goto L_0x0b69
            r8 = 1
            goto L_0x0b6a
        L_0x0b69:
            r8 = 0
        L_0x0b6a:
            r2.setShowStore(r8)
            int r1 = r0.f206917a1
            if (r1 < r4) goto L_0x0b72
            r3 = 1
        L_0x0b72:
            r2.setShowSearch(r3)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            java.lang.Object r1 = r1.mo119684e(r4, r10)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r1, r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r5)
            r2.setTalkerName(r1)
            int r1 = com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel.f211589f
            r1 = 18
            r2.setEntranceScene(r1)
            yz2.q1 r1 = new yz2.q1
            r1.<init>(r0)
            r2.setCallback(r1)
        L_0x0b9e:
            rx3.g r1 = r0.f206893L
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.String r2 = "<get-btnDelEmoji>(...)"
            gy3.C87412m.m108593f(r1, r2)
            android.view.View r1 = (android.view.View) r1
            yz2.r1 r2 = new yz2.r1
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            rx3.g r1 = r0.f206891K
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.String r2 = "<get-layoutEmojiView>(...)"
            gy3.C87412m.m108593f(r1, r2)
            android.view.View r1 = (android.view.View) r1
            yz2.s1 r2 = new yz2.s1
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            r33.mo98462g8()
            rx3.g r1 = r0.f206897Q
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.String r2 = "<get-topicContainerLl>(...)"
            gy3.C87412m.m108593f(r1, r2)
            android.view.View r1 = (android.view.View) r1
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$h0 r2 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$h0
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            rx3.g r1 = r0.f206928h
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            gy3.C87412m.m108593f(r1, r13)
            android.view.View r1 = (android.view.View) r1
            android.view.View$OnClickListener r2 = r0.f206965z1
            r1.setOnClickListener(r2)
            android.view.View r1 = r0.f206937n
            if (r1 == 0) goto L_0x0c04
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$i0 r2 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$i0
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x0c04:
            android.view.View r1 = r0.f206939o
            if (r1 == 0) goto L_0x0c0d
            android.view.View$OnClickListener r2 = r0.f206957w1
            r1.setOnClickListener(r2)
        L_0x0c0d:
            android.view.View r1 = r0.f206894M
            if (r1 == 0) goto L_0x0c19
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$j0 r2 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$j0
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x0c19:
            android.view.View r1 = r0.f206901S
            if (r1 == 0) goto L_0x0c25
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$k0 r2 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$k0
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x0c25:
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$configUpdateListener$1 r1 = r0.f206935l1
            r1.alive()
            return
        L_0x0c2b:
            gy3.C87412m.m108603p(r8)
            throw r10
        L_0x0c2f:
            gy3.C87412m.m108603p(r7)
            throw r10
        L_0x0c33:
            gy3.C87412m.m108603p(r8)
            throw r10
        L_0x0c37:
            gy3.C87412m.m108603p(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        mo98492u8();
        super.onDestroy();
        this.f206931i1.dead();
        mo98440K7();
        ((C76057w) C86312j.m106911c(C76057w.class)).mo106264FL(this.f206940o1, this.f206943p1);
        f206870O1 = null;
        this.f206914Y0 = null;
        this.f206935l1.dead();
        EmojiPanelInputComponent emojiPanelInputComponent = this.f206922e;
        if (emojiPanelInputComponent != null) {
            ChatFooterPanel smileyPanel = emojiPanelInputComponent.getSmileyPanel();
        }
        if (this.f206921d1) {
            IStatusIconHelperKt.m39109a().mo62308t();
        }
    }

    public void onPause() {
        C60695a player;
        super.hideVKB();
        super.onPause();
        StringBuilder sb = new StringBuilder();
        sb.append("[onPause] ");
        sb.append(this.f206881F == null);
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", sb.toString());
        C59600d dVar = this.f206881F;
        if (dVar != null && dVar.f170310d) {
            dVar.mo79963g();
            dVar.mo79961e();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f206916Z0;
        if (!(mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null)) {
            C60695a.C60696a.m70998a(player, false, 1, (Object) null);
        }
        Toast toast = this.f206929h1;
        if (toast != null) {
            toast.cancel();
        }
        this.f206929h1 = null;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        if (!(iArr.length == 0)) {
            if (i == 64 && iArr[0] == 0) {
                mo98468n8();
            } else if (i != 18) {
            } else {
                if (iArr[0] == 0) {
                    mo98457b8();
                    super.onRequestPermissionsResult(i, strArr, iArr);
                    return;
                }
                int i2 = C87412m.m108589b("android.permission.CAMERA", strArr[0]) ? C0966R.string.hhq : C0966R.string.f361130hi2;
                if (iArr[0] != 0) {
                    C76879j.m92709C(this, getString(i2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C30498r0(this), C30499s0.f82179d);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047 A[Catch:{ Exception -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d A[Catch:{ Exception -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c A[Catch:{ Exception -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f A[Catch:{ Exception -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b A[Catch:{ Exception -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c A[Catch:{ Exception -> 0x00bf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r9 = this;
            super.onResume()
            go3.d r0 = r9.f206881F
            if (r0 == 0) goto L_0x0011
            boolean r1 = r0.f170310d
            if (r1 != 0) goto L_0x0011
            r0.mo79964h()
            r0.mo79962f()
        L_0x0011:
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r0 = r9.f206916Z0
            if (r0 == 0) goto L_0x001e
            j03.a r0 = r0.getPlayer()
            if (r0 == 0) goto L_0x001e
            r0.mo85619m()
        L_0x001e:
            r9.mo98494w8()
            java.lang.Class<ox.b> r0 = p640ox.C77049b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ox.b r0 = (p640ox.C77049b) r0
            java.lang.Class<uz2.v1> r1 = uz2.C78318v1.class
            r2 = 8
            pe3.a r0 = r0.Wi0(r9, r2, r1)
            uz2.v1 r0 = (uz2.C78318v1) r0
            if (r0 == 0) goto L_0x00ca
            r1 = 0
            java.lang.String r2 = r0.f229499c1     // Catch:{ Exception -> 0x00bf }
            r3 = 1
            if (r2 == 0) goto L_0x0044
            int r2 = r2.length()     // Catch:{ Exception -> 0x00bf }
            if (r2 != 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r2 = 0
            goto L_0x0045
        L_0x0044:
            r2 = 1
        L_0x0045:
            if (r2 == 0) goto L_0x004d
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x00bf }
            r2.<init>()     // Catch:{ Exception -> 0x00bf }
            goto L_0x0054
        L_0x004d:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = r0.f229499c1     // Catch:{ Exception -> 0x00bf }
            r2.<init>(r4)     // Catch:{ Exception -> 0x00bf }
        L_0x0054:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bf }
            r4.<init>()     // Catch:{ Exception -> 0x00bf }
            if0.a$a r5 = if0.C46238a.f124644a     // Catch:{ Exception -> 0x00bf }
            java.lang.String r6 = "iconid"
            uz2.u r7 = r9.mo98445P7()     // Catch:{ Exception -> 0x00bf }
            uz2.e0 r7 = r7.f147238g     // Catch:{ Exception -> 0x00bf }
            java.lang.String r7 = r7.f147088e     // Catch:{ Exception -> 0x00bf }
            r5.mo71655d(r4, r6, r7, r1)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r6 = "icontype"
            b03.c r7 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()     // Catch:{ Exception -> 0x00bf }
            uz2.u r8 = r9.mo98445P7()     // Catch:{ Exception -> 0x00bf }
            uz2.e0 r8 = r8.f147238g     // Catch:{ Exception -> 0x00bf }
            java.lang.String r8 = r8.f147088e     // Catch:{ Exception -> 0x00bf }
            uz2.d1 r7 = r7.mo62298j(r8)     // Catch:{ Exception -> 0x00bf }
            if (r7 == 0) goto L_0x007f
            int r7 = r7.f147084g     // Catch:{ Exception -> 0x00bf }
            goto L_0x0080
        L_0x007f:
            r7 = 0
        L_0x0080:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00bf }
            r5.mo71655d(r4, r6, r7, r1)     // Catch:{ Exception -> 0x00bf }
            boolean r6 = r9.f206923e1     // Catch:{ Exception -> 0x00bf }
            if (r6 == 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r3 = 2
        L_0x008d:
            java.lang.String r6 = "isfreq"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00bf }
            r5.mo71655d(r4, r6, r3, r1)     // Catch:{ Exception -> 0x00bf }
            r2.put(r4)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00bf }
            java.lang.String r3 = "jsonArray.toString()"
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r3 = ","
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = "compile(pattern)"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = ";"
            java.util.regex.Matcher r2 = r3.matcher(r2)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r2 = r2.replaceAll(r4)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r3 = "nativePattern.matcher(in…).replaceAll(replacement)"
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ Exception -> 0x00bf }
            r0.f229499c1 = r2     // Catch:{ Exception -> 0x00bf }
            goto L_0x00ca
        L_0x00bf:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "MicroMsg.TextStatus.TextStatusEditActivity"
            java.lang.String r3 = "updateIconSelectionsForReport , iconSelections"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity.onResume():void");
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* renamed from: p8 */
    public final void mo98471p8(Bitmap bitmap) {
        C71442v0 v0Var = new C71442v0(bitmap, this);
        if (C87412m.m108589b(Looper.getMainLooper(), Looper.myLooper())) {
            v0Var.invoke();
        } else {
            mo98456a8().post(new C71440u0(v0Var));
        }
    }

    /* renamed from: q8 */
    public final void mo98472q8() {
        if (IStatusIconHelperKt.m39109a().mo62278H()) {
            mo98445P7().f147238g.f147088e = "1080";
        }
        String str = mo98445P7().f147238g.f147088e;
        boolean z = false;
        if (!(str == null || C112551y.m153811k(str))) {
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this, 8, C78318v1.class);
            if (v1Var != null) {
                if (!v1Var.f229506i.contains(str)) {
                    v1Var.f229506i.add(str);
                }
                C77459z zVar = this.f206904T0;
                if (zVar != null && zVar.f229404i == 5) {
                    z = true;
                }
                if (z || this.f206906U0 == 2) {
                    v1Var.f229521y = v1Var.f229506i.size() > 1 ? 1 : 0;
                }
            }
            C39691c.m42340S(IStatusIconHelperKt.m39109a(), this.f206926g, str, (C63347a.C47893d) null, (C63347a.C47891b) null, (C48201c) null, false, false, 124, (Object) null);
        }
    }

    /* renamed from: r8 */
    public final void mo98473r8(String str) {
        TextView textView;
        TextView textView2 = this.f206924f;
        if (textView2 != null) {
            textView2.setText(str);
        }
        EmojiPanelInputComponent emojiPanelInputComponent = this.f206922e;
        if (emojiPanelInputComponent != null) {
            emojiPanelInputComponent.setSmileySendButtonText(str);
        }
        if ((IStatusIconHelperKt.m39109a().mo62278H() || IStatusIconHelperKt.m39109a().mo62275E()) && (textView = this.f206924f) != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: s8 */
    public final void mo98474s8(int i) {
        if (i == 3) {
            TextView textView = this.f206958x;
            if (textView != null) {
                textView.setText(getContext().getString(C0966R.string.k28));
                return;
            }
            return;
        }
        TextView textView2 = this.f206958x;
        if (textView2 != null) {
            textView2.setText(getContext().getString(C0966R.string.k26));
        }
    }

    public final void setBtnBack(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f206909W = view;
    }

    public final void setBtnOk(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f206905U = view;
    }

    public final void setBtnTag(View view) {
        this.f206903T = view;
    }

    public final void setEditLayout(View view) {
        this.f206920d = view;
    }

    public final void setFakePic(View view) {
        this.f206873B = view;
    }

    public final void setIconCamera(View view) {
        this.f206941p = view;
    }

    public final void setIconPoi(View view) {
        this.f206946r = view;
    }

    public final void setIconText(View view) {
        this.f206944q = view;
    }

    public final void setIconVisibility(View view) {
        this.f206950t = view;
    }

    public final void setLayoutBlurOption(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f206911X = view;
    }

    public final void setLayoutEditDesc(View view) {
        this.f206894M = view;
    }

    public final void setLayoutEditToolContainer(View view) {
        this.f206895N = view;
    }

    public final void setLayoutTopicEdit(View view) {
        this.f206896P = view;
    }

    public final void setTvCancel(View view) {
        this.f206901S = view;
    }

    public final void setVPoi(View view) {
        this.f206937n = view;
    }

    public final void setVVisibility(View view) {
        this.f206939o = view;
    }

    /* renamed from: t8 */
    public final void mo98491t8(String str) {
        if (System.currentTimeMillis() - this.f206925f1 > this.f206927g1) {
            this.f206925f1 = System.currentTimeMillis();
            this.f206929h1 = C76912y0.m92769h(this, str, C0966R.raw.icons_outlined_info);
        }
    }

    /* renamed from: u8 */
    public final void mo98492u8() {
        Class cls = C78318v1.class;
        Class cls2 = C77049b.class;
        if (!this.f206888I1) {
            String obj = mo98449T7().getText().toString();
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context, 8, cls);
            if (v1Var != null) {
                v1Var.f229514s = (long) C45078p0.m49926e(obj, C45078p0.C45079a.MODE_CHINESE_AS_2);
                long j = 0;
                v1Var.f229469H = Util.isNullOrNil(mo98445P7().f147248t) ? 0 : 1;
                v1Var.f229474M = C76252b.m91657a(mo98445P7()) ? 1 : 0;
                if (!Util.isEqual(v1Var.f229489W, obj)) {
                    j = 1;
                }
                v1Var.f229519x = j;
            }
            AppCompatActivity context2 = getContext();
            C87412m.m108593f(context2, "context");
            C78318v1 v1Var2 = (C78318v1) ((C77049b) C86312j.m106911c(cls2)).Wi0(context2, 8, cls);
            if (v1Var2 != null) {
                v1Var2.f229522y0 = mo98447R7();
                C78501d.f229945a.mo108459f(this.f206933j1, v1Var2);
            }
            this.f206888I1 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00a4, code lost:
        r1 = r1.getEffectManager();
     */
    /* renamed from: v8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98493v8() {
        /*
            r18 = this;
            r0 = r18
            uz2.u r1 = r18.mo98445P7()
            boolean r1 = hz2.C76252b.m91657a(r1)
            java.lang.String r2 = "<get-ivBlurText>(...)"
            java.lang.String r3 = "<get-ivBlurSelect>(...)"
            java.lang.String r4 = "ivBlur"
            r6 = 8
            r7 = 0
            if (r1 == 0) goto L_0x00d2
            android.view.View r1 = r18.mo98451V7()
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r14 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r8 = java.lang.Float.valueOf(r14)
            r15.mo10233c(r8)
            java.lang.Object[] r9 = r15.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
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
            java.lang.String r9 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r10 = "updateBlurStatus"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setAlpha"
            java.lang.String r14 = "(F)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.widget.ImageView r1 = r0.f206913Y
            if (r1 == 0) goto L_0x00cd
            r1.setVisibility(r6)
            rx3.g r1 = r0.f206915Z
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            gy3.C87412m.m108593f(r1, r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setVisibility(r7)
            rx3.g r1 = r0.f206942p0
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            gy3.C87412m.m108593f(r1, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            androidx.appcompat.app.AppCompatActivity r2 = r18.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099940(0x7f060124, float:1.7812247E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            android.widget.ImageView r1 = r0.f206885H
            if (r1 != 0) goto L_0x009d
            goto L_0x00a0
        L_0x009d:
            r1.setVisibility(r6)
        L_0x00a0:
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r1 = r0.f206916Z0
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
            android.graphics.Bitmap r1 = f206870O1
            if (r1 == 0) goto L_0x0177
            android.widget.ImageView r1 = r18.mo98456a8()
            android.graphics.Bitmap r2 = f206870O1
            r1.setImageBitmap(r2)
            goto L_0x0177
        L_0x00cd:
            gy3.C87412m.m108603p(r4)
            r1 = 0
            throw r1
        L_0x00d2:
            android.view.View r1 = r18.mo98451V7()
            r5 = 1062836634(0x3f59999a, float:0.85)
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r15.mo10233c(r5)
            java.lang.Object[] r9 = r15.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
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
            java.lang.String r9 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity"
            java.lang.String r10 = "updateBlurStatus"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setAlpha"
            java.lang.String r14 = "(F)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.widget.ImageView r1 = r0.f206913Y
            if (r1 == 0) goto L_0x0178
            r1.setVisibility(r7)
            rx3.g r1 = r0.f206915Z
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            gy3.C87412m.m108593f(r1, r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r3 = 8
            r1.setVisibility(r3)
            rx3.g r1 = r0.f206942p0
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            gy3.C87412m.m108593f(r1, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            androidx.appcompat.app.AppCompatActivity r2 = r18.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099702(0x7f060036, float:1.7811765E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            android.widget.ImageView r1 = r0.f206885H
            if (r1 != 0) goto L_0x0158
            goto L_0x015b
        L_0x0158:
            r1.setVisibility(r7)
        L_0x015b:
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r1 = r0.f206916Z0
            if (r1 == 0) goto L_0x016a
            com.tencent.mm.xeffect.effect.EffectManager r1 = r1.getEffectManager()
            if (r1 == 0) goto L_0x016a
            rr3.i r2 = rr3.C110632i.BlurEffect
            r1.mo154936p(r2)
        L_0x016a:
            android.graphics.Bitmap r1 = r0.f206914Y0
            if (r1 == 0) goto L_0x0177
            android.widget.ImageView r1 = r18.mo98456a8()
            android.graphics.Bitmap r2 = r0.f206914Y0
            r1.setImageBitmap(r2)
        L_0x0177:
            return
        L_0x0178:
            gy3.C87412m.m108603p(r4)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity.mo98493v8():void");
    }

    /* renamed from: w8 */
    public final void mo98494w8() {
        mo98443N7().setEnabled(true);
        if (mo98443N7().isEnabled()) {
            View U7 = mo98450U7();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = U7;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity", "updateFakeBtnOkVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            U7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity", "updateFakeBtnOkVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View U72 = mo98450U7();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view2 = U72;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity", "updateFakeBtnOkVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        U72.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity", "updateFakeBtnOkVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: x8 */
    public final void mo98495x8() {
        String str = mo98445P7().f147248t;
        if (!Util.isNullOrNil(str)) {
            Object value = ((C36570n) this.f206956w).getValue();
            C87412m.m108593f(value, "<get-tvPoi>(...)");
            ((TextView) value).setText(str);
            Object value2 = ((C36570n) this.f206956w).getValue();
            C87412m.m108593f(value2, "<get-tvPoi>(...)");
            ((TextView) value2).setVisibility(0);
            Object value3 = ((C36570n) this.f206948s).getValue();
            C87412m.m108593f(value3, "<get-ivPoiSelected>(...)");
            ((ImageView) value3).setVisibility(0);
            return;
        }
        Object value4 = ((C36570n) this.f206956w).getValue();
        C87412m.m108593f(value4, "<get-tvPoi>(...)");
        ((TextView) value4).setVisibility(8);
        Object value5 = ((C36570n) this.f206948s).getValue();
        C87412m.m108593f(value5, "<get-ivPoiSelected>(...)");
        ((ImageView) value5).setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if ((r0 != null && r0.mo84146j()) != false) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* renamed from: y8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98496y8(uz2.C52678e0 r5, uz2.C52678e0 r6) {
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
            qy2.i r0 = r4.mo98446Q7()
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.mo107627s()
            if (r0 != r2) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x007d
            qy2.i r0 = r4.mo98446Q7()
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity.mo98496y8(uz2.e0, uz2.e0):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0130, code lost:
        if ((r0 == null || z04.C112551y.m153811k(r0)) == false) goto L_0x0132;
     */
    /* renamed from: z8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98497z8() {
        /*
            r10 = this;
            uz2.u r0 = r10.mo98445P7()
            uz2.e0 r0 = r0.f147238g
            java.lang.String r1 = "curTextStatusExtInfo.topicInfo"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r0 = hz2.C60235a.m70504d(r0)
            android.widget.FrameLayout r2 = r10.mo98453X7()
            r2.removeAllViews()
            qy2.i r2 = r10.mo98446Q7()
            r3 = 0
            if (r2 == 0) goto L_0x0026
            android.widget.FrameLayout r4 = r10.mo98453X7()
            boolean r2 = r2.mo84150q(r4)
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            r10.f206878D1 = r2
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
            boolean r4 = r10.f206878D1
            if (r4 != r2) goto L_0x005c
            android.widget.FrameLayout r4 = r10.mo98453X7()
            r4.setVisibility(r3)
            android.widget.FrameLayout r4 = r10.mo98453X7()
            int r7 = kg3.C76577a.m92150a(r10, r5)
            float r7 = (float) r7
            b03.c0 r8 = new b03.c0
            r8.<init>(r2, r2, r7)
            r4.setOutlineProvider(r8)
            r4.setClipToOutline(r2)
            goto L_0x0063
        L_0x005c:
            android.widget.FrameLayout r4 = r10.mo98453X7()
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
            rx3.g r4 = r10.f206959x0
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            gy3.C87412m.m108593f(r4, r8)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r4.setVisibility(r3)
            rx3.g r4 = r10.f206962y0
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.String r8 = "<get-thirdDescTv>(...)"
            gy3.C87412m.m108593f(r4, r8)
            android.widget.TextView r4 = (android.widget.TextView) r4
            uz2.u r8 = r10.mo98445P7()
            uz2.e0 r8 = r8.f147238g
            gy3.C87412m.m108593f(r8, r1)
            java.lang.String r8 = hz2.C60235a.m70505e(r8)
            r4.setText(r8)
            android.widget.FrameLayout r4 = r10.mo98455Z7()
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
            uz2.u r0 = r10.mo98445P7()
            uz2.e0 r0 = r0.f147238g
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r0 = hz2.C60235a.m70501a(r0)
            r4.f229516u = r0
            uz2.u r0 = r10.mo98445P7()
            uz2.e0 r0 = r0.f147238g
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r0 = hz2.C60235a.m70505e(r0)
            r4.f229517v = r0
            uz2.u r0 = r10.mo98445P7()
            uz2.e0 r0 = r0.f147238g
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r0 = hz2.C60235a.m70503c(r0)
            r4.f229518w = r0
            uz2.u r0 = r10.mo98445P7()
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
            uz2.u r0 = r10.mo98445P7()
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
            qy2.z r0 = r10.f206904T0
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
            qy2.i r0 = r10.mo98446Q7()
            android.widget.FrameLayout r4 = r10.mo98455Z7()
            r4.removeAllViews()
            if (r0 == 0) goto L_0x014f
            android.widget.FrameLayout r4 = r10.mo98455Z7()
            boolean r0 = r0.mo84851p(r4)
            if (r0 != r2) goto L_0x014f
            r0 = 1
            goto L_0x0150
        L_0x014f:
            r0 = 0
        L_0x0150:
            java.lang.String r4 = "<get-ivBrand>(...)"
            if (r0 == 0) goto L_0x016c
            android.widget.FrameLayout r0 = r10.mo98455Z7()
            r0.setVisibility(r3)
            rx3.g r0 = r10.f206900R0
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            gy3.C87412m.m108593f(r0, r4)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setVisibility(r6)
            goto L_0x01d4
        L_0x016c:
            android.widget.FrameLayout r0 = r10.mo98455Z7()
            r0.setVisibility(r6)
            uz2.u r0 = r10.mo98445P7()
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
            rx3.g r8 = r10.f206900R0
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
            rx3.g r0 = r10.f206900R0
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            gy3.C87412m.m108593f(r0, r4)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setVisibility(r6)
            goto L_0x01d4
        L_0x01c4:
            rx3.g r0 = r10.f206959x0
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            gy3.C87412m.m108593f(r0, r8)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setVisibility(r6)
        L_0x01d4:
            uz2.u r0 = r10.mo98445P7()
            uz2.e0 r0 = r0.f147238g
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r0 = hz2.C60235a.m70504d(r0)
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$f r1 = new com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$f
            uz2.u r4 = r10.mo98445P7()
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
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$f r6 = r10.f206884G1
            if (r6 == 0) goto L_0x0203
            java.lang.String r6 = r6.f82176a
            goto L_0x0204
        L_0x0203:
            r6 = r7
        L_0x0204:
            boolean r6 = gy3.C87412m.m108589b(r0, r6)
            if (r6 != 0) goto L_0x020b
            goto L_0x021b
        L_0x020b:
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$f r6 = r10.f206884G1
            if (r6 == 0) goto L_0x021b
            java.util.List<uz2.a0> r6 = r6.f82177b
            if (r6 == 0) goto L_0x021b
            boolean r6 = hz2.C60236c.m70511a(r6, r4)
            if (r6 != r2) goto L_0x021b
            r6 = 1
            goto L_0x021c
        L_0x021b:
            r6 = 0
        L_0x021c:
            if (r6 != 0) goto L_0x0271
            r10.mo98439J7()
            android.widget.FrameLayout r6 = r10.mo98452W7()
            r6.removeAllViews()
            uz2.m r6 = new uz2.m
            r6.<init>()
            r6.f188445d = r3
            r6.f188446e = r3
            uz2.u r8 = r10.mo98445P7()
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
            android.widget.FrameLayout r7 = r10.mo98452W7()
            go3.d r7 = r8.mo84138IT(r0, r7, r4, r6)
        L_0x025e:
            androidx.appcompat.app.AppCompatActivity r0 = r10.getContext()
            boolean r4 = r0 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
            if (r4 == 0) goto L_0x026d
            if (r7 == 0) goto L_0x026d
            com.tencent.mm.ui.MMFragmentActivity r0 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r0
            dl3.C45413b.C45414a.m50357a(r7, r0)
        L_0x026d:
            r10.f206881F = r7
            r10.f206884G1 = r1
        L_0x0271:
            android.widget.FrameLayout r0 = r10.mo98452W7()
            r0.setVisibility(r3)
            android.widget.FrameLayout r0 = r10.mo98452W7()
            int r1 = kg3.C76577a.m92150a(r10, r5)
            float r1 = (float) r1
            b03.c0 r3 = new b03.c0
            r3.<init>(r2, r2, r1)
            r0.setOutlineProvider(r3)
            r0.setClipToOutline(r2)
            go3.d r0 = r10.f206881F
            if (r0 == 0) goto L_0x02ac
            boolean r1 = r0.f170310d
            if (r1 != 0) goto L_0x02ac
            r0.mo79964h()
            r0.mo79962f()
            goto L_0x02ac
        L_0x029b:
            r10.mo98439J7()
            android.widget.FrameLayout r0 = r10.mo98452W7()
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r10.mo98452W7()
            r0.setVisibility(r6)
        L_0x02ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity.mo98497z8():void");
    }
}
