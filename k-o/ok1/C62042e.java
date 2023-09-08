package ok1;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import al1.C54129i;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.BatteryManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import b50.C54408d;
import bd1.C39758f;
import bd1.C39759i;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import bl1.C39773a;
import bl1.C39775b;
import bl3.C39818r;
import bl3.C54492n;
import c30.C104289g;
import c50.C54655b;
import cj1.C0537f2;
import cj1.C0581o5;
import cj1.C54738b1;
import cj1.C54754f;
import cj1.C54789l6;
import cj1.C54795n5;
import cj1.C54804r0;
import cj1.C54847z3;
import cl1.C0654b;
import cl1.C0702z0;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import cm1.C0740i2;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGameLivePostUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveAnchorCommentManagerUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveAnchorCreateVoteUI;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.MiniAppInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.FilesCopy;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.StringKtKt;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.file.XVFSFile;
import d14.C45253g;
import d14.C58052j1;
import d60.C58124b;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import dj1.C45395w;
import dj1.C58278c0;
import eb0.C31543z5;
import eb0.C75592q0;
import er1.C58739j4;
import er1.C7919x;
import f14.C58901s;
import f40.C86709a0;
import f62.C75700k0;
import fe1.C58961d;
import fe1.C58969q;
import fh1.C8035f;
import fj1.C45795b;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import hp3.C87581a;
import ht1.C60172g4;
import ht1.C60200t1;
import ht1.C60204t3;
import ht1.C8777j5;
import i50.C60251a;
import ic0.C108455d;
import j20.C117292a;
import j50.C60735a;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Result;
import kotlin.ResultKt;
import kr0.C76630x0;
import kr0.C88262c1;
import kr0.C88273g1;
import kr0.C88274h0;
import ky3.C88334c;
import lc3.C10485b;
import ms3.C11091a;
import my3.C61593h;
import my3.C61594j;
import my3.C61595o;
import n50.C61619b;
import n50.C61620c;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C47269o0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76912y0;
import nk1.C61780j;
import np1.C61866i0;
import np1.C61882w;
import nr3.C89059e;
import o40.C11348f;
import o40.C61926c;
import o40.C61937h;
import ob0.C89132b;
import org.json.JSONObject;
import p185kq.C10383h;
import p185kq.C61130g;
import p185kq.C61131i;
import p40.C62192a;
import p50.C62193a;
import p50.C62197e;
import p565ir.C60606n;
import p682rz.C36594q;
import pe1.C35464c;
import pe3.C47465a;
import pe3.C89349b;
import pt1.C35640b;
import q40.C12040d;
import qj1.C62660c;
import qo3.C77407n;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C13605o;
import rx3.C36568h;
import rx3.C36570n;
import sk1.C13696v;
import sk1.C48416t;
import sk1.C63947a;
import sk1.C63956k;
import sk1.C63962r;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C90363p0;
import sx3.C90364q0;
import tc2.C118418g;
import te3.C48688ab1;
import te3.C48752ar0;
import te3.C48770aw0;
import te3.C48814b61;
import te3.C48833bb1;
import te3.C48978cb0;
import te3.C49083d21;
import te3.C49335eu3;
import te3.C49603gs0;
import te3.C49712hj1;
import te3.C49747hs1;
import te3.C49760hw0;
import te3.C49765hx0;
import te3.C49778i01;
import te3.C50019jp1;
import te3.C50124kf1;
import te3.C50626o21;
import te3.C50770p21;
import te3.C50800p91;
import te3.C51745vv0;
import te3.C51778w31;
import te3.C52013xs0;
import te3.C52047y01;
import te3.C52312zv0;
import te3.C64224a61;
import te3.C64273c21;
import te3.C64274c60;
import te3.C64338e71;
import te3.C64347eq2;
import te3.C64359f71;
import te3.C64370fp1;
import te3.C64373fs0;
import te3.C64414h71;
import te3.C64424hi3;
import te3.C64434i11;
import te3.C64513l40;
import te3.C64605o91;
import te3.C64620p2;
import te3.C64688rq1;
import te3.C64733to;
import te3.C64756up2;
import te3.C64822x51;
import te3.C64848y91;
import te3.C64857yh3;
import te3.C64859yk1;
import te3.z44;
import tf0.C13883o1;
import tf0.C13887q1;
import tf0.C64916p1;
import up1.C37521f;
import wc3.C15130a;
import wc3.C15133e0;
import wc3.C15140v;
import wd3.C78545b;
import wd3.C78574s0;
import wg1.C15257b1;
import wi0.C66117m;
import wi0.C90973a0;
import wi0.C91003z;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import y50.C53496k;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C112551y;
import z04.C119027c;
import zc1.C66785b;
import zk1.C66880s0;

/* renamed from: ok1.e */
public final class C62042e {

    /* renamed from: a */
    public static final C62042e f176370a = new C62042e();

    /* renamed from: b */
    public static final boolean f176371b = (C32444a.f86050E1.mo60266n().intValue() == 0);

    /* renamed from: c */
    public static final boolean f176372c = (C32444a.f86073K0.mo60266n().intValue() == 0);

    /* renamed from: d */
    public static final C13601g f176373d = C36568h.m40985a(C35180l.f94334d);

    /* renamed from: e */
    public static final boolean f176374e;

    /* renamed from: f */
    public static C89779i0 f176375f;

    /* renamed from: g */
    public static final int f176376g = MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);

    /* renamed from: ok1.e$a */
    public static final class C11429a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62660c f33613d;

        /* renamed from: e */
        public final /* synthetic */ boolean f33614e;

        public C11429a(C62660c cVar, boolean z) {
            this.f33613d = cVar;
            this.f33614e = z;
        }

        public final void run() {
            if (this.f33613d.f177935f.getLayoutParams() != null && (this.f33613d.f177935f.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && this.f33613d.mo82893g0()) {
                int d0 = this.f33613d.mo82891d0();
                C62042e eVar = C62042e.f176370a;
                Context context = this.f33613d.f177935f.getContext();
                C87412m.m108593f(context, "plugin.vg.context");
                int h0 = eVar.mo87083h0(context, eVar.mo87073d1(this.f33613d.mo87684A0()) || eVar.mo87035Q0(this.f33613d.mo87684A0()));
                if (this.f33614e) {
                    ViewGroup.LayoutParams layoutParams = this.f33613d.f177935f.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(h0);
                } else {
                    ViewGroup.LayoutParams layoutParams2 = this.f33613d.f177935f.getLayoutParams();
                    C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(h0);
                }
                this.f33613d.f177935f.requestLayout();
                if (C58739j4.f168176a.mo83692U()) {
                    Log.m105924i("FinderLiveUtil", "plugin:" + this.f33613d.mo82894j0() + ",Orientation:" + d0 + ",ifLeft:" + this.f33614e + ", padding:" + h0);
                }
                this.f33613d.f177935f.setTag(C0966R.C0970id.dvj, Integer.valueOf(d0));
            }
        }
    }

    /* renamed from: ok1.e$a0 */
    public static final class C11430a0 implements InputFilter {

        /* renamed from: d */
        public final /* synthetic */ Pattern f33615d;

        public C11430a0(Pattern pattern) {
            this.f33615d = pattern;
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (!this.f33615d.matcher(charSequence).find()) {
                return null;
            }
            return "";
        }
    }

    /* renamed from: ok1.e$b */
    public static final class C11431b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f33616d;

        /* renamed from: e */
        public final /* synthetic */ Context f33617e;

        public C11431b(String str, Context context) {
            this.f33616d = str;
            this.f33617e = context;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkGiftLegalArgeement$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            String str = this.f33616d;
            if (str == null) {
                str = "";
            }
            intent.putExtra("rawUrl", str);
            intent.putExtra("convertActivityFromTranslucent", true);
            C88144b.m109791i(this.f33617e, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkGiftLegalArgeement$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ok1.e$b0 */
    public static final class C11432b0 implements InputFilter {

        /* renamed from: d */
        public final /* synthetic */ EditText f33618d;

        public C11432b0(EditText editText) {
            this.f33618d = editText;
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            EditText editText = this.f33618d;
            if (editText != null) {
                editText.getText();
            }
            if (charSequence.toString().contentEquals("\n")) {
                return "";
            }
            return null;
        }
    }

    /* renamed from: ok1.e$c */
    public static final class C11433c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f33619d;

        /* renamed from: e */
        public final /* synthetic */ int f33620e;

        /* renamed from: f */
        public final /* synthetic */ int f33621f;

        /* renamed from: g */
        public final /* synthetic */ C72994y1.C72995a f33622g;

        /* renamed from: h */
        public final /* synthetic */ C8477a0 f33623h;

        /* renamed from: i */
        public final /* synthetic */ C77407n f33624i;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.utils.FinderLiveUtil$checkGiftLegalArgeement$2$1", mo125469f = "FinderLiveUtil.kt", mo125470l = {4592, 4636, 4642}, mo125471m = "invokeSuspend")
        /* renamed from: ok1.e$c$a */
        public static final class C11434a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f33625d;

            /* renamed from: e */
            public int f33626e;

            /* renamed from: f */
            public final /* synthetic */ Context f33627f;

            /* renamed from: g */
            public final /* synthetic */ int f33628g;

            /* renamed from: h */
            public final /* synthetic */ int f33629h;

            /* renamed from: i */
            public final /* synthetic */ C72994y1.C72995a f33630i;

            /* renamed from: j */
            public final /* synthetic */ C8477a0 f33631j;

            /* renamed from: n */
            public final /* synthetic */ C77407n f33632n;

            @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.utils.FinderLiveUtil$checkGiftLegalArgeement$2$1$invokeSuspend$$inlined$fail$1", mo125469f = "FinderLiveUtil.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: ok1.e$c$a$a */
            public static final class C11435a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ C0287e f33633d;

                /* renamed from: e */
                public final /* synthetic */ Context f33634e;

                /* renamed from: f */
                public final /* synthetic */ C77407n f33635f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C11435a(C0287e eVar, C15601d dVar, Context context, C77407n nVar) {
                    super(2, dVar);
                    this.f33633d = eVar;
                    this.f33634e = context;
                    this.f33635f = nVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C11435a(this.f33633d, dVar, this.f33634e, this.f33635f);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C11435a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    C0280a aVar = (C0280a) ((C0281b) this.f33633d).f843b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("[checkGiftLegalArgeement] cgi failed， errcode:");
                    C12040d dVar = aVar.f841a;
                    Integer num = null;
                    sb.append(dVar != null ? new Integer(dVar.f35058f) : null);
                    sb.append("， errType:");
                    C12040d dVar2 = aVar.f841a;
                    if (dVar2 != null) {
                        num = new Integer(dVar2.f35057e);
                    }
                    sb.append(num);
                    Log.m105924i("FinderLiveUtil", sb.toString());
                    if (C58739j4.f168176a.mo83692U()) {
                        C76912y0.makeText(this.f33634e, (CharSequence) "cgi failed", 0).show();
                    }
                    this.f33635f.mo107572p();
                    return C13598b0.f38549a;
                }
            }

            @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.utils.FinderLiveUtil$checkGiftLegalArgeement$2$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLiveUtil.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: ok1.e$c$a$b */
            public static final class C11436b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ C0287e f33636d;

                /* renamed from: e */
                public final /* synthetic */ C72994y1.C72995a f33637e;

                /* renamed from: f */
                public final /* synthetic */ int f33638f;

                /* renamed from: g */
                public final /* synthetic */ C8477a0 f33639g;

                /* renamed from: h */
                public final /* synthetic */ C77407n f33640h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C11436b(C0287e eVar, C15601d dVar, C72994y1.C72995a aVar, int i, C8477a0 a0Var, C77407n nVar) {
                    super(2, dVar);
                    this.f33636d = eVar;
                    this.f33637e = aVar;
                    this.f33638f = i;
                    this.f33639g = a0Var;
                    this.f33640h = nVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C11436b(this.f33636d, dVar, this.f33637e, this.f33638f, this.f33639g, this.f33640h);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C11436b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    C49335eu3 eu32 = (C49335eu3) ((C0288f) this.f33636d).f855b;
                    Log.m105924i("FinderLiveUtil", "[checkGiftLegalArgeement] cgi success");
                    C86709a0.m107535s().mo121142i().mo119677K(this.f33637e, new Integer(this.f33638f));
                    this.f33639g.f27482d = true;
                    this.f33640h.mo107572p();
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11434a(Context context, int i, int i2, C72994y1.C72995a aVar, C8477a0 a0Var, C77407n nVar, C15601d<? super C11434a> dVar) {
                super(2, dVar);
                this.f33627f = context;
                this.f33628g = i;
                this.f33629h = i2;
                this.f33630i = aVar;
                this.f33631j = a0Var;
                this.f33632n = nVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C11434a(this.f33627f, this.f33628g, this.f33629h, this.f33630i, this.f33631j, this.f33632n, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C11434a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r13.f33626e
                    r2 = 0
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L_0x002e
                    if (r1 == r5) goto L_0x002a
                    if (r1 == r4) goto L_0x0021
                    if (r1 != r3) goto L_0x0019
                    java.lang.Object r0 = r13.f33625d
                    bi1.e r0 = (bi1.C0287e) r0
                    kotlin.ResultKt.throwOnFailure(r14)
                    goto L_0x00e5
                L_0x0019:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                L_0x0021:
                    java.lang.Object r1 = r13.f33625d
                    bi1.e r1 = (bi1.C0287e) r1
                    kotlin.ResultKt.throwOnFailure(r14)
                    goto L_0x00bd
                L_0x002a:
                    kotlin.ResultKt.throwOnFailure(r14)
                    goto L_0x0091
                L_0x002e:
                    kotlin.ResultKt.throwOnFailure(r14)
                    te3.q21 r14 = new te3.q21
                    r14.<init>()
                    int r1 = r13.f33628g
                    int r6 = r13.f33629h
                    je1.h2 r7 = je1.C46523h2.f125330a
                    r8 = 8334(0x208e, float:1.1678E-41)
                    te3.ig0 r7 = r7.mo71859a(r8)
                    r14.f140100d = r7
                    r14.f140101e = r1
                    r14.f140102f = r6
                    ob0.c$b r1 = new ob0.c$b
                    r1.<init>()
                    r1.f127069d = r8
                    java.lang.String r6 = "/cgi-bin/micromsg-bin/finderlivelegalpromotreport"
                    r1.f127068c = r6
                    r1.f127066a = r14
                    te3.r21 r14 = new te3.r21
                    r14.<init>()
                    r1.f127067b = r14
                    ob0.c r14 = r1.mo72403a()
                    java.lang.Class<ht1.s1> r1 = ht1.C8802s1.class
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    ht1.s1 r1 = (ht1.C8802s1) r1
                    ob0.b r1 = r1.mo9632ui()
                    r1.mo123453j(r14)
                    boolean r14 = r1 instanceof it1.C60625c
                    if (r14 == 0) goto L_0x0076
                    it1.c r1 = (it1.C60625c) r1
                    goto L_0x0077
                L_0x0076:
                    r1 = r2
                L_0x0077:
                    if (r1 == 0) goto L_0x00e5
                    android.content.Context r7 = r13.f33627f
                    r8 = 0
                    r9 = 0
                    r11 = 6
                    r12 = 0
                    r6 = r1
                    it1.C60625c.m70894l(r6, r7, r8, r9, r11, r12)
                    a14.h0 r14 = a14.C53872d1.f151117a
                    a14.k2 r14 = f14.C58901s.f168555a
                    r13.f33626e = r5
                    java.lang.Object r14 = bi1.C0283d.m243a(r1, r14, r13)
                    if (r14 != r0) goto L_0x0091
                    return r0
                L_0x0091:
                    r1 = r14
                    bi1.e r1 = (bi1.C0287e) r1
                    if (r1 == 0) goto L_0x00e5
                    com.tencent.mm.storage.y1$a r8 = r13.f33630i
                    int r9 = r13.f33629h
                    gy3.a0 r10 = r13.f33631j
                    qo3.n r11 = r13.f33632n
                    boolean r14 = r1 instanceof bi1.C0288f
                    if (r14 == 0) goto L_0x00bd
                    wx3.f r14 = r1.f854a
                    if (r14 != 0) goto L_0x00aa
                    wx3.f r14 = r13.getContext()
                L_0x00aa:
                    ok1.e$c$a$b r12 = new ok1.e$c$a$b
                    r7 = 0
                    r5 = r12
                    r6 = r1
                    r5.<init>(r6, r7, r8, r9, r10, r11)
                    r13.f33625d = r1
                    r13.f33626e = r4
                    java.lang.Object r14 = a14.C53895h.m60469g(r14, r12, r13)
                    if (r14 != r0) goto L_0x00bd
                    return r0
                L_0x00bd:
                    if (r1 == 0) goto L_0x00e5
                    a14.h0 r14 = a14.C53872d1.f151117a
                    a14.k2 r14 = f14.C58901s.f168555a
                    android.content.Context r4 = r13.f33627f
                    qo3.n r5 = r13.f33632n
                    boolean r6 = r1 instanceof bi1.C0281b
                    if (r6 == 0) goto L_0x00e5
                    if (r14 != 0) goto L_0x00d5
                    wx3.f r14 = r1.f854a
                    if (r14 != 0) goto L_0x00d5
                    wx3.f r14 = r13.getContext()
                L_0x00d5:
                    ok1.e$c$a$a r6 = new ok1.e$c$a$a
                    r6.<init>(r1, r2, r4, r5)
                    r13.f33625d = r1
                    r13.f33626e = r3
                    java.lang.Object r14 = a14.C53895h.m60469g(r14, r6, r13)
                    if (r14 != r0) goto L_0x00e5
                    return r0
                L_0x00e5:
                    rx3.b0 r14 = rx3.C13598b0.f38549a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.C11433c.C11434a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C11433c(Context context, int i, int i2, C72994y1.C72995a aVar, C8477a0 a0Var, C77407n nVar) {
            this.f33619d = context;
            this.f33620e = i;
            this.f33621f = i2;
            this.f33622g = aVar;
            this.f33623h = a0Var;
            this.f33624i = nVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkGiftLegalArgeement$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C11434a(this.f33619d, this.f33620e, this.f33621f, this.f33622g, this.f33623h, this.f33624i, (C15601d<? super C11434a>) null), 3, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkGiftLegalArgeement$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ok1.e$c0 */
    public static final class C11437c0 extends C45078p0 {

        /* renamed from: f */
        public final /* synthetic */ int f33641f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11437c0(int i, C45078p0.C45079a aVar) {
            super(i, aVar);
            this.f33641f = i;
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            int i5;
            C45078p0.C45079a aVar = C45078p0.C45079a.MODE_CHINESE_AS_2;
            if ((spanned != null ? spanned.length() : 0) > i3) {
                i5 = C45078p0.m49926e(String.valueOf(spanned != null ? spanned.subSequence(0, i3) : null), aVar);
            } else {
                i5 = C45078p0.m49926e(String.valueOf(spanned), aVar);
            }
            int e = (spanned == null || spanned.length() <= i4) ? 0 : C45078p0.m49926e(spanned.subSequence(i4, spanned.length()).toString(), aVar);
            int e2 = C45078p0.m49926e(String.valueOf(charSequence), aVar);
            int i6 = (this.f33641f - i5) - e;
            return e2 > i6 ? C62042e.f176370a.mo86997D0(String.valueOf(charSequence), i6, false) : charSequence == null ? "" : charSequence;
        }
    }

    /* renamed from: ok1.e$d */
    public static final class C11438d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77407n f33642d;

        public C11438d(C77407n nVar) {
            this.f33642d = nVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkGiftLegalArgeement$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f33642d.mo107572p();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkGiftLegalArgeement$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ok1.e$d0 */
    public static final class C11439d0 implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ TextView f33643d;

        /* renamed from: e */
        public final /* synthetic */ int f33644e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f33645f;

        public C11439d0(TextView textView, int i, C32224a<C13598b0> aVar) {
            this.f33643d = textView;
            this.f33644e = i;
            this.f33645f = aVar;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            int f = C45078p0.m49927f(String.valueOf(editable)) / 2;
            TextView textView = this.f33643d;
            if (textView != null) {
                if (f >= 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(f);
                    sb.append(XVFSFile.SEPARATOR_CHAR);
                    sb.append(this.f33644e);
                    str = sb.toString();
                } else {
                    str = "0/" + this.f33644e;
                }
                textView.setText(str);
            }
            C32224a<C13598b0> aVar = this.f33645f;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ok1.e$e */
    public static final class C11440e implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f33646a;

        /* renamed from: b */
        public final /* synthetic */ C8477a0 f33647b;

        public C11440e(C32226l<? super Boolean, C13598b0> lVar, C8477a0 a0Var) {
            this.f33646a = lVar;
            this.f33647b = a0Var;
        }

        public final void onDismiss() {
            this.f33646a.invoke(Boolean.valueOf(this.f33647b.f27482d));
        }
    }

    /* renamed from: ok1.e$e0 */
    public static final class C11441e0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f33648d;

        /* renamed from: e */
        public final /* synthetic */ String f33649e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11441e0(Context context, String str) {
            super(0);
            this.f33648d = context;
            this.f33649e = str;
        }

        public Object invoke() {
            Context context = this.f33648d;
            C76912y0.makeText(context, (CharSequence) "Debug " + this.f33649e, 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ok1.e$f */
    public static final class C11442f implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C77407n f33650d;

        /* renamed from: e */
        public final /* synthetic */ RoundedCornerFrameLayout f33651e;

        public C11442f(C77407n nVar, RoundedCornerFrameLayout roundedCornerFrameLayout) {
            this.f33650d = nVar;
            this.f33651e = roundedCornerFrameLayout;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.clear();
            this.f33650d.mo107567l((View) null);
            this.f33650d.mo107567l(this.f33651e);
        }
    }

    /* renamed from: ok1.e$f0 */
    public static final class C11443f0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C4191v0 f33652d;

        public C11443f0(C4191v0 v0Var) {
            this.f33652d = v0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$showGamePermissionBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f33652d.mo5072g();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$showGamePermissionBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ok1.e$g0 */
    public static final class C11444g0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f33653d;

        /* renamed from: e */
        public final /* synthetic */ C4191v0 f33654e;

        /* renamed from: f */
        public final /* synthetic */ C49747hs1 f33655f;

        public C11444g0(C8477a0 a0Var, C4191v0 v0Var, C49747hs1 hs12) {
            this.f33653d = a0Var;
            this.f33654e = v0Var;
            this.f33655f = hs12;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$showGamePermissionBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f33653d.f27482d = true;
            this.f33654e.mo5072g();
            C62042e eVar = C62042e.f176370a;
            String str = this.f33655f.f134839d;
            if (str == null) {
                str = "";
            }
            eVar.getClass();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_GAME_RANK_PERMISSION_SHOW_STRING_SYNC;
            String str2 = i.mo119675I(aVar, "") + ',' + str;
            C86709a0.m107535s().mo121142i().mo119677K(aVar, str2);
            Log.m105924i(C54492n.TAG, "appendAppid result " + str2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$showGamePermissionBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ok1.e$h */
    public static final class C11445h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77407n f33656d;

        public C11445h(C77407n nVar) {
            this.f33656d = nVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkIfRoleMysterious$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f33656d.mo107572p();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkIfRoleMysterious$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ok1.e$h0 */
    public static final class C11446h0 implements C4191v0.C4192a {

        /* renamed from: a */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f33657a;

        /* renamed from: b */
        public final /* synthetic */ C8477a0 f33658b;

        public C11446h0(C32226l<? super Boolean, C13598b0> lVar, C8477a0 a0Var) {
            this.f33657a = lVar;
            this.f33658b = a0Var;
        }

        public final void onDismiss() {
            this.f33657a.invoke(Boolean.valueOf(this.f33658b.f27482d));
        }
    }

    /* renamed from: ok1.e$i */
    public static final class C11447i implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C77407n f33659d;

        /* renamed from: e */
        public final /* synthetic */ RoundedCornerFrameLayout f33660e;

        public C11447i(C77407n nVar, RoundedCornerFrameLayout roundedCornerFrameLayout) {
            this.f33659d = nVar;
            this.f33660e = roundedCornerFrameLayout;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.clear();
            this.f33659d.mo107567l((View) null);
            this.f33659d.mo107567l(this.f33660e);
        }
    }

    /* renamed from: ok1.e$i0 */
    public static final class C11448i0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f33661d;

        /* renamed from: e */
        public final /* synthetic */ Context f33662e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11448i0(boolean z, Context context) {
            super(0);
            this.f33661d = z;
            this.f33662e = context;
        }

        public Object invoke() {
            C89779i0 i0Var;
            if (this.f33661d) {
                C89779i0 i0Var2 = C62042e.f176375f;
                boolean z = false;
                if (i0Var2 == null) {
                    Context context = this.f33662e;
                    C62042e.f176375f = C89779i0.m112248e(context, C76577a.m92166q(context, C0966R.string.ett), false, 2, (DialogInterface.OnCancelListener) null);
                } else {
                    if (!i0Var2.isShowing()) {
                        z = true;
                    }
                    if (z && (i0Var = C62042e.f176375f) != null) {
                        i0Var.show();
                    }
                }
            } else {
                C89779i0 i0Var3 = C62042e.f176375f;
                if (i0Var3 != null) {
                    i0Var3.dismiss();
                }
                C62042e.f176375f = null;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ok1.e$m */
    public static final class C11449m implements C78574s0 {

        /* renamed from: a */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f33663a;

        public C11449m(C32226l<? super Boolean, C13598b0> lVar) {
            this.f33663a = lVar;
        }

        /* renamed from: a */
        public final void mo708a(int i) {
            C32226l<Boolean, C13598b0> lVar = this.f33663a;
            if (lVar != null) {
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                lVar.invoke(Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: ok1.e$p */
    public static final class C11450p implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ Context f33664d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f33665e;

        /* renamed from: f */
        public final /* synthetic */ String f33666f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<C77407n> f33667g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<C15133e0> f33668h;

        /* renamed from: ok1.e$p$a */
        public static final class C11451a extends C87413o implements C32226l<List<? extends String>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ BaseFinderFeed f33669d;

            /* renamed from: e */
            public final /* synthetic */ String f33670e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11451a(BaseFinderFeed baseFinderFeed, String str) {
                super(1);
                this.f33669d = baseFinderFeed;
                this.f33670e = str;
            }

            public Object invoke(Object obj) {
                List<String> list = (List) obj;
                JSONObject jSONObject = new JSONObject();
                String str = "";
                if (list != null) {
                    for (String str2 : list) {
                        str = str + str2 + ';';
                    }
                }
                Long l = null;
                if (C112551y.m153808h(str, ";", false, 2, (Object) null)) {
                    str = str.substring(0, str.length() - 1);
                    C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                jSONObject.put("share_username", str);
                C11091a aVar = C11091a.f32868a;
                C64273c21 liveInfo = this.f33669d.mo3513o().getLiveInfo();
                if (liveInfo != null) {
                    l = Long.valueOf(liveInfo.f182392d);
                }
                C11091a.m10992b(aVar, String.valueOf(l), String.valueOf(this.f33669d.mo3513o().getFeedObject().f164794id), this.f33669d.mo3513o().getFeedObject().username, this.f33670e, "1", "0", jSONObject, (String) null, 128, (Object) null);
                return C13598b0.f38549a;
            }
        }

        public C11450p(Context context, BaseFinderFeed baseFinderFeed, String str, C8479f0<C77407n> f0Var, C8479f0<C15133e0> f0Var2) {
            this.f33664d = context;
            this.f33665e = baseFinderFeed;
            this.f33666f = str;
            this.f33667g = f0Var;
            this.f33668h = f0Var2;
        }

        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Long] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMMMenuItemSelected(android.view.MenuItem r27, int r28) {
            /*
                r26 = this;
                r0 = r26
                java.lang.Class<tf0.o1> r1 = tf0.C13883o1.class
                r2 = 0
                if (r27 == 0) goto L_0x0010
                int r3 = r27.getItemId()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                goto L_0x0011
            L_0x0010:
                r3 = r2
            L_0x0011:
                r4 = 103(0x67, float:1.44E-43)
                java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                java.lang.String r6 = "getService(IActivityRouter::class.java)"
                if (r3 != 0) goto L_0x001a
                goto L_0x0087
            L_0x001a:
                int r7 = r3.intValue()
                if (r7 != r4) goto L_0x0087
                di3.d r1 = di3.C86312j.m106911c(r1)
                gy3.C87412m.m108593f(r1, r6)
                r7 = r1
                tf0.o1 r7 = (tf0.C13883o1) r7
                android.content.Context r1 = r0.f33664d
                gy3.C87412m.m108592e(r1, r5)
                r8 = r1
                com.tencent.mm.ui.MMActivity r8 = (com.tencent.p014mm.p136ui.MMActivity) r8
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = r0.f33665e
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 28
                r14 = 0
                tf0.C13883o1.C13884a.m13255g(r7, r8, r9, r10, r11, r12, r13, r14)
                ms3.a r15 = ms3.C11091a.f32868a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f33665e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                te3.c21 r1 = r1.getLiveInfo()
                if (r1 == 0) goto L_0x0051
                long r1 = r1.f182392d
                java.lang.Long r2 = java.lang.Long.valueOf(r1)
            L_0x0051:
                java.lang.String r16 = java.lang.String.valueOf(r2)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f33665e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                long r1 = r1.f164794id
                java.lang.String r17 = java.lang.String.valueOf(r1)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f33665e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                java.lang.String r1 = r1.username
                java.lang.String r2 = r0.f33666f
                r22 = 0
                r23 = 0
                r24 = 192(0xc0, float:2.69E-43)
                r25 = 0
                java.lang.String r20 = "2"
                java.lang.String r21 = "0"
                r18 = r1
                r19 = r2
                ms3.C11091a.m10992b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                goto L_0x00f3
            L_0x0087:
                r4 = 102(0x66, float:1.43E-43)
                if (r3 != 0) goto L_0x008c
                goto L_0x00f3
            L_0x008c:
                int r3 = r3.intValue()
                if (r3 != r4) goto L_0x00f3
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f33665e
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                android.content.Context r4 = r0.f33664d
                gy3.f0<wc3.e0> r7 = r0.f33668h
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r0.f33665e
                java.lang.String r9 = r0.f33666f
                com.tencent.mm.plugin.finder.storage.FinderItem$a r10 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                r11 = 16384(0x4000, float:2.2959E-41)
                com.tencent.mm.plugin.finder.storage.FinderItem r14 = r10.mo79056a(r3, r11)
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                java.lang.Class<cl1.o> r10 = cl1.C54991o.class
                androidx.lifecycle.i0 r3 = r3.mo77630e(r10)
                cl1.o r3 = (cl1.C54991o) r3
                if (r3 == 0) goto L_0x00ba
                java.lang.String r2 = r3.f154199F1
            L_0x00ba:
                r14.setEcSource(r2)
                android.os.Bundle r15 = new android.os.Bundle
                r15.<init>()
                T r2 = r7.f27484d
                wc3.e0 r2 = (wc3.C15133e0) r2
                if (r2 == 0) goto L_0x00cd
                int r2 = r2.getItemCount()
                goto L_0x00ce
            L_0x00cd:
                r2 = 0
            L_0x00ce:
                java.lang.String r3 = "quick_share_item_count"
                r15.putInt(r3, r2)
                di3.d r1 = di3.C86312j.m106911c(r1)
                gy3.C87412m.m108593f(r1, r6)
                r12 = r1
                tf0.o1 r12 = (tf0.C13883o1) r12
                gy3.C87412m.m108592e(r4, r5)
                r13 = r4
                com.tencent.mm.ui.MMActivity r13 = (com.tencent.p014mm.p136ui.MMActivity) r13
                r16 = 0
                ok1.e$p$a r1 = new ok1.e$p$a
                r1.<init>(r8, r9)
                r18 = 8
                r19 = 0
                r17 = r1
                tf0.C13883o1.C13884a.m13254f(r12, r13, r14, r15, r16, r17, r18, r19)
            L_0x00f3:
                gy3.f0<qo3.n> r1 = r0.f33667g
                T r1 = r1.f27484d
                qo3.n r1 = (qo3.C77407n) r1
                if (r1 == 0) goto L_0x00fe
                r1.mo107572p()
            L_0x00fe:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.C11450p.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    /* renamed from: ok1.e$q */
    public static final class C11452q implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f33671d;

        /* renamed from: e */
        public final /* synthetic */ int f33672e;

        /* renamed from: f */
        public final /* synthetic */ C49712hj1 f33673f;

        /* renamed from: g */
        public final /* synthetic */ Context f33674g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<C77407n> f33675h;

        /* renamed from: i */
        public final /* synthetic */ C32224a<C13598b0> f33676i;

        /* renamed from: ok1.e$q$a */
        public static final class C11453a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ Context f33677a;

            /* renamed from: b */
            public final /* synthetic */ C32224a<C13598b0> f33678b;

            public C11453a(Context context, C32224a<C13598b0> aVar) {
                this.f33677a = context;
                this.f33678b = aVar;
            }

            public Object call(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                Log.m105925i("FinderLiveUtil", "[CgiFinderFeedBack] errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
                if (cVar.f256794b == 0 && cVar.f256793a == 0) {
                    Context context = this.f33677a;
                    C76912y0.m92769h(context, context.getResources().getString(C0966R.string.fyg), C0966R.raw.icons_filled_done);
                    C61926c.m72668M(new C11459h(this.f33678b));
                }
                return C13598b0.f38549a;
            }
        }

        public C11452q(BaseFinderFeed baseFinderFeed, int i, C49712hj1 hj12, Context context, C8479f0<C77407n> f0Var, C32224a<C13598b0> aVar) {
            this.f33671d = baseFinderFeed;
            this.f33672e = i;
            this.f33673f = hj12;
            this.f33674g = context;
            this.f33675h = f0Var;
            this.f33676i = aVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C49083d21 d212;
            Integer num = null;
            Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
            boolean z = false;
            if (valueOf != null && valueOf.intValue() == 99) {
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5 j5Var = (C8777j5) c;
                C54067f0.C0064m mVar = C54067f0.C0064m.PANEL_UNLIKE_BUTTON;
                C13604l[] lVarArr = new C13604l[3];
                C64273c21 liveInfo = this.f33671d.mo3513o().getLiveInfo();
                lVarArr[0] = new C13604l("liveId", String.valueOf(liveInfo != null ? Long.valueOf(liveInfo.f182392d) : null));
                lVarArr[1] = new C13604l("feedId", String.valueOf(this.f33671d.mo3513o().getFeedObject().f164794id));
                lVarArr[2] = new C13604l("panel_sence", this.f33672e == 1005 ? "2" : WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
                Map g = C90364q0.m113148g(lVarArr);
                C49712hj1 hj12 = this.f33673f;
                String str = hj12 != null ? hj12.f134671e : null;
                if (hj12 != null) {
                    num = Integer.valueOf(hj12.f134675i);
                }
                C8777j5.C8778a.m8607h(j5Var, mVar, g, str, String.valueOf(num), (String) null, 16, (Object) null);
                C89059e i2 = new C58278c0(this.f33671d.mo3513o().getFeedObject().f164794id, this.f33671d.mo3513o().getObjectNonceId(), 1, 0, this.f33673f, 3).mo9225i();
                i2.mo123419C(new C11453a(this.f33674g, this.f33676i));
                Context context = this.f33674g;
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                i2.mo11397F((MMActivity) context);
            } else if (valueOf != null && valueOf.intValue() == 101) {
                FinderObject feedObject = this.f33671d.mo3513o().getFeedObject();
                if (feedObject != null) {
                    Context context2 = this.f33674g;
                    C7335d c2 = C86312j.m106911c(C64916p1.class);
                    C87412m.m108593f(c2, "getService(IFinderCommon…atureService::class.java)");
                    C64916p1 p1Var = (C64916p1) c2;
                    C64273c21 c212 = feedObject.liveInfo;
                    long j = c212 != null ? c212.f182392d : 0;
                    String str2 = feedObject.username;
                    if (str2 == null) {
                        str2 = "";
                    }
                    p1Var.mo76727xV(context2, j, str2, (Long) null, 62);
                }
            } else if (valueOf != null && valueOf.intValue() == 211) {
                C50124kf1 kf12 = this.f33671d.mo3513o().getFeedObject().object_extend;
                String str3 = (kf12 == null || (d212 = kf12.f136759u) == null) ? null : d212.f132074d;
                if (str3 == null || str3.length() == 0) {
                    z = true;
                }
                if (z) {
                    Log.m105924i("FinderLiveUtil", "clickInnerData but innerUrl is null");
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", str3);
                    intent.putExtra("convertActivityFromTranslucent", true);
                    C88144b.m109791i(this.f33674g, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
            }
            C77407n nVar = (C77407n) this.f33675h.f27484d;
            if (nVar != null) {
                nVar.mo107572p();
            }
        }
    }

    /* renamed from: ok1.e$r */
    public static final class C11454r implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C15133e0> f33679d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f33680e;

        /* renamed from: f */
        public final /* synthetic */ Context f33681f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<C77407n> f33682g;

        /* renamed from: h */
        public final /* synthetic */ String f33683h;

        /* renamed from: ok1.e$r$a */
        public static final class C11455a extends C87413o implements C32226l<String, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ BaseFinderFeed f33684d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<C15133e0> f33685e;

            /* renamed from: f */
            public final /* synthetic */ MenuItem f33686f;

            /* renamed from: g */
            public final /* synthetic */ Context f33687g;

            /* renamed from: h */
            public final /* synthetic */ C8479f0<C77407n> f33688h;

            /* renamed from: i */
            public final /* synthetic */ String f33689i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11455a(BaseFinderFeed baseFinderFeed, C8479f0<C15133e0> f0Var, MenuItem menuItem, Context context, C8479f0<C77407n> f0Var2, String str) {
                super(1);
                this.f33684d = baseFinderFeed;
                this.f33685e = f0Var;
                this.f33686f = menuItem;
                this.f33687g = context;
                this.f33688h = f0Var2;
                this.f33689i = str;
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((String) obj, "userName");
                FinderObject feedObject = this.f33684d.mo3513o().getFeedObject();
                if (feedObject != null) {
                    C8479f0<C15133e0> f0Var = this.f33685e;
                    MenuItem menuItem = this.f33686f;
                    Context context = this.f33687g;
                    C8479f0<C77407n> f0Var2 = this.f33688h;
                    BaseFinderFeed baseFinderFeed = this.f33684d;
                    String str = this.f33689i;
                    C15133e0 e0Var = (C15133e0) f0Var.f27484d;
                    if (e0Var != null) {
                        C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
                        e0Var.xc0((C76875f0) menuItem, new C11461j(context, f0Var2, f0Var, feedObject, menuItem, baseFinderFeed, str));
                    }
                    C7335d c = C86312j.m106911c(C54108o.class);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.RECENTLY_FORWARD, (Map) null, (String) null, 6, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        public C11454r(C8479f0<C15133e0> f0Var, BaseFinderFeed baseFinderFeed, Context context, C8479f0<C77407n> f0Var2, String str) {
            this.f33679d = f0Var;
            this.f33680e = baseFinderFeed;
            this.f33681f = context;
            this.f33682g = f0Var2;
            this.f33683h = str;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C15133e0 e0Var = (C15133e0) this.f33679d.f27484d;
            if (e0Var != null) {
                C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
                e0Var.xc0((C76875f0) menuItem, new C11455a(this.f33680e, this.f33679d, menuItem, this.f33681f, this.f33682g, this.f33683h));
            }
        }
    }

    /* renamed from: ok1.e$s */
    public static final class C11456s implements C47269o0 {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<C77407n> f33690a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<C15133e0> f33691b;

        public C11456s(C8479f0<C77407n> f0Var, C8479f0<C15133e0> f0Var2) {
            this.f33690a = f0Var;
            this.f33691b = f0Var2;
        }

        /* renamed from: a */
        public final void mo2584a(MenuItem menuItem, int i) {
            T t = this.f33690a.f27484d;
            C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
            FinderObject finderObject = oVar != null ? oVar.f154341n : null;
            C8479f0<C15133e0> f0Var = this.f33691b;
            if (t != null && finderObject != null) {
                C77407n nVar = (C77407n) t;
                C15133e0 e0Var = (C15133e0) f0Var.f27484d;
                if (e0Var != null) {
                    C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
                    e0Var.mo14089YM(nVar, (C76875f0) menuItem);
                }
            }
        }
    }

    /* renamed from: ok1.e$t */
    public static final class C11457t implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<C15133e0> f33692a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<C77407n> f33693b;

        public C11457t(C8479f0<C15133e0> f0Var, C8479f0<C77407n> f0Var2) {
            this.f33692a = f0Var;
            this.f33693b = f0Var2;
        }

        public final void onDismiss() {
            ((C15133e0) this.f33692a.f27484d).dead();
            this.f33693b.f27484d = null;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.utils.FinderLiveUtil$goProductReplayUI$job$1", mo125469f = "FinderLiveUtil.kt", mo125470l = {3197}, mo125471m = "invokeSuspend")
    /* renamed from: ok1.e$v */
    public static final class C11458v extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f33694d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C89779i0> f33695e;

        /* renamed from: f */
        public final /* synthetic */ Context f33696f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11458v(C8479f0<C89779i0> f0Var, Context context, C15601d<? super C11458v> dVar) {
            super(2, dVar);
            this.f33695e = f0Var;
            this.f33696f = context;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C11458v(this.f33695e, this.f33696f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11458v) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f33694d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f33694d = 1;
                if (C53965x0.m60607b(1000, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C8479f0<C89779i0> f0Var = this.f33695e;
            Context context = this.f33696f;
            f0Var.f27484d = C89779i0.m112248e(context, context.getString(C0966R.string.gas), false, 0, (DialogInterface.OnCancelListener) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ok1.e$l */
    public static final class C35180l extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C35180l f94334d = new C35180l();

        public C35180l() {
            super(0);
        }

        public Object invoke() {
            Boolean valueOf = Boolean.valueOf(((C36594q) C86312j.m106911c(C36594q.class)).mo60733UY(4));
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("FinderLiveUtil", "deviceSupportHevcForFinder:" + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: ok1.e$m0 */
    public static final class C35181m0 extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ boolean f94335d;

        /* renamed from: e */
        public final /* synthetic */ int f94336e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35181m0(boolean z, int i) {
            super(0);
            this.f94335d = z;
            this.f94336e = i;
        }

        public Object invoke() {
            return "isOutSide = " + this.f94335d + " size = " + this.f94336e;
        }
    }

    /* renamed from: ok1.e$n0 */
    public static final class C35182n0 extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ int f94337d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35182n0(int i) {
            super(0);
            this.f94337d = i;
        }

        public Object invoke() {
            return "size = " + this.f94337d;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.utils.FinderLiveUtil$preLoadLeadComponnentList$1", mo125469f = "FinderLiveUtil.kt", mo125470l = {4347, 4637, 4644}, mo125471m = "invokeSuspend")
    /* renamed from: ok1.e$y */
    public static final class C47383y extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f127135d;

        /* renamed from: e */
        public int f127136e;

        /* renamed from: f */
        public final /* synthetic */ C45795b f127137f;

        /* renamed from: g */
        public final /* synthetic */ String f127138g;

        /* renamed from: h */
        public final /* synthetic */ C32226l<C49778i01, C13598b0> f127139h;

        /* renamed from: ok1.e$y$a */
        public static final class C47384a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C49778i01 f127140d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C47384a(C49778i01 i012) {
                super(0);
                this.f127140d = i012;
            }

            public Object invoke() {
                View rootView;
                Context context;
                FinderLiveService.f159376d.getClass();
                C56032b bVar = FinderLiveService.f159379g;
                if (!(bVar == null || (rootView = bVar.getRootView()) == null || (context = rootView.getContext()) == null)) {
                    C49778i01 i012 = this.f127140d;
                    C76912y0.makeText(context, (CharSequence) "从后台拉到的留资组件数量为：" + i012.f134995d.size(), 0).show();
                }
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.utils.FinderLiveUtil$preLoadLeadComponnentList$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderLiveUtil.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: ok1.e$y$b */
        public static final class C47385b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C0287e f127141d;

            /* renamed from: e */
            public final /* synthetic */ String f127142e;

            /* renamed from: f */
            public final /* synthetic */ C32226l f127143f;

            /* renamed from: g */
            public final /* synthetic */ C45795b f127144g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C47385b(C0287e eVar, C15601d dVar, String str, C32226l lVar, C45795b bVar) {
                super(2, dVar);
                this.f127141d = eVar;
                this.f127142e = str;
                this.f127143f = lVar;
                this.f127144g = bVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C47385b(this.f127141d, dVar, this.f127142e, this.f127143f, this.f127144g);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C47385b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C0280a aVar = (C0280a) ((C0281b) this.f127141d).f843b;
                Log.m105924i("FinderLiveUtil", "preLoadLeadComponnentList [" + this.f127142e + "] failed");
                C32226l lVar = this.f127143f;
                if (lVar != null) {
                    lVar.invoke(null);
                }
                ((C58052j1) ((C54979h1) this.f127144g.mo71262a(C54979h1.class)).f154129V).setValue(Boolean.TRUE);
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.utils.FinderLiveUtil$preLoadLeadComponnentList$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLiveUtil.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: ok1.e$y$c */
        public static final class C47386c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C0287e f127145d;

            /* renamed from: e */
            public final /* synthetic */ String f127146e;

            /* renamed from: f */
            public final /* synthetic */ C45795b f127147f;

            /* renamed from: g */
            public final /* synthetic */ C32226l f127148g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C47386c(C0287e eVar, C15601d dVar, String str, C45795b bVar, C32226l lVar) {
                super(2, dVar);
                this.f127145d = eVar;
                this.f127146e = str;
                this.f127147f = bVar;
                this.f127148g = lVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C47386c(this.f127145d, dVar, this.f127146e, this.f127147f, this.f127148g);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C47386c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                Object N;
                C50770p21 p212;
                Class cls = C54979h1.class;
                ResultKt.throwOnFailure(obj);
                C49778i01 i012 = (C49778i01) ((C0288f) this.f127145d).f855b;
                Log.m105924i("FinderLiveUtil", "preLoadLeadComponnentList [" + this.f127146e + "] ok, size = " + i012.f134995d.size());
                ((C54979h1) this.f127147f.mo71262a(cls)).f154141p.f127225a.clear();
                C62192a<C0740i2> aVar = ((C54979h1) this.f127147f.mo71262a(cls)).f154141p;
                LinkedList<C50770p21> linkedList = i012.f134995d;
                C87412m.m108593f(linkedList, "it.item_list");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (C50770p21 p213 : linkedList) {
                    C87412m.m108593f(p213, "item");
                    arrayList.add(new C48416t(p213));
                }
                aVar.f127225a.addAll(arrayList);
                List<E> list = ((C54979h1) this.f127147f.mo71262a(cls)).f154141p.f127225a;
                C87412m.m108593f(list, "list");
                synchronized (list) {
                    N = C110818d0.m150916N(list);
                }
                C0740i2 i2Var = (C0740i2) N;
                if (i2Var != null) {
                    C50626o21 o212 = null;
                    C48416t tVar = i2Var instanceof C48416t ? (C48416t) i2Var : null;
                    if (!(tVar == null || (p212 = tVar.f129597d) == null)) {
                        o212 = p212.f139534d;
                    }
                    if (o212 != null) {
                        C62042e.f176370a.mo87122v(o212);
                    }
                }
                if (C58739j4.f168176a.mo83692U()) {
                    C61926c.m72668M(new C47384a(i012));
                }
                C32226l lVar = this.f127148g;
                if (lVar != null) {
                    lVar.invoke(i012);
                }
                ((C58052j1) ((C54979h1) this.f127147f.mo71262a(cls)).f154129V).setValue(Boolean.TRUE);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47383y(C45795b bVar, String str, C32226l<? super C49778i01, C13598b0> lVar, C15601d<? super C47383y> dVar) {
            super(2, dVar);
            this.f127137f = bVar;
            this.f127138g = str;
            this.f127139h = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C47383y(this.f127137f, this.f127138g, this.f127139h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C47383y) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00ee  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Class<cl1.u> r0 = cl1.C55001u.class
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r11.f127136e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0030
                if (r2 == r5) goto L_0x002b
                if (r2 == r4) goto L_0x0022
                if (r2 != r3) goto L_0x001a
                java.lang.Object r0 = r11.f127135d
                bi1.e r0 = (bi1.C0287e) r0
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x0109
            L_0x001a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0022:
                java.lang.Object r0 = r11.f127135d
                bi1.e r0 = (bi1.C0287e) r0
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x00e4
            L_0x002b:
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x00bc
            L_0x0030:
                kotlin.ResultKt.throwOnFailure(r12)
                te3.h01 r12 = new te3.h01
                r12.<init>()
                fj1.b r2 = r11.f127137f
                je1.h2 r6 = je1.C46523h2.f125330a
                r7 = 8048(0x1f70, float:1.1278E-41)
                te3.ig0 r6 = r6.mo71859a(r7)
                r12.f134379d = r6
                java.lang.Class<cl1.o> r6 = cl1.C54991o.class
                androidx.lifecycle.i0 r6 = r2.mo71262a(r6)
                cl1.o r6 = (cl1.C54991o) r6
                java.lang.String r6 = r6.f154345o
                r12.f134380e = r6
                androidx.lifecycle.i0 r6 = r2.mo71262a(r0)
                cl1.u r6 = (cl1.C55001u) r6
                long r8 = r6.f154416j
                r12.f134381f = r8
                androidx.lifecycle.i0 r6 = r2.mo71262a(r0)
                cl1.u r6 = (cl1.C55001u) r6
                te3.c21 r6 = r6.f154420q
                long r8 = r6.f182392d
                r12.f134382g = r8
                java.lang.Class<cl1.h1> r6 = cl1.C54979h1.class
                androidx.lifecycle.i0 r6 = r2.mo71262a(r6)
                cl1.h1 r6 = (cl1.C54979h1) r6
                boolean r6 = r6.f154143r
                r6 = r6 ^ r5
                r12.f134383h = r6
                androidx.lifecycle.i0 r0 = r2.mo71262a(r0)
                cl1.u r0 = (cl1.C55001u) r0
                byte[] r0 = r0.f154417n
                if (r0 == 0) goto L_0x0085
                pe3.b r2 = new pe3.b
                int r6 = r0.length
                r8 = 0
                r2.<init>(r0, r8, r6)
                goto L_0x0086
            L_0x0085:
                r2 = 0
            L_0x0086:
                r12.f134384i = r2
                ob0.c$b r0 = new ob0.c$b
                r0.<init>()
                r0.f127069d = r7
                java.lang.String r2 = "/cgi-bin/micromsg-bin/finderlivegetleadscomponentlist"
                r0.f127068c = r2
                r0.f127066a = r12
                te3.i01 r12 = new te3.i01
                r12.<init>()
                r0.f127067b = r12
                ob0.c r12 = r0.mo72403a()
                java.lang.Class<ht1.s1> r0 = ht1.C8802s1.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ht1.s1 r0 = (ht1.C8802s1) r0
                ob0.b r0 = r0.mo9632ui()
                r0.mo123453j(r12)
                a14.h0 r12 = a14.C53872d1.f151117a
                a14.k2 r12 = f14.C58901s.f168555a
                r11.f127136e = r5
                java.lang.Object r12 = bi1.C0283d.m243a(r0, r12, r11)
                if (r12 != r1) goto L_0x00bc
                return r1
            L_0x00bc:
                r0 = r12
                bi1.e r0 = (bi1.C0287e) r0
                java.lang.String r8 = r11.f127138g
                fj1.b r9 = r11.f127137f
                fy3.l<te3.i01, rx3.b0> r10 = r11.f127139h
                boolean r12 = r0 instanceof bi1.C0288f
                if (r12 == 0) goto L_0x00e4
                wx3.f r12 = r0.f854a
                if (r12 != 0) goto L_0x00d1
                wx3.f r12 = r11.getContext()
            L_0x00d1:
                ok1.e$y$c r2 = new ok1.e$y$c
                r7 = 0
                r5 = r2
                r6 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                r11.f127135d = r0
                r11.f127136e = r4
                java.lang.Object r12 = a14.C53895h.m60469g(r12, r2, r11)
                if (r12 != r1) goto L_0x00e4
                return r1
            L_0x00e4:
                java.lang.String r7 = r11.f127138g
                fy3.l<te3.i01, rx3.b0> r8 = r11.f127139h
                fj1.b r9 = r11.f127137f
                boolean r12 = r0 instanceof bi1.C0281b
                if (r12 == 0) goto L_0x0109
                wx3.f r12 = r0.f854a
                if (r12 != 0) goto L_0x00f6
                wx3.f r12 = r11.getContext()
            L_0x00f6:
                ok1.e$y$b r2 = new ok1.e$y$b
                r6 = 0
                r4 = r2
                r5 = r0
                r4.<init>(r5, r6, r7, r8, r9)
                r11.f127135d = r0
                r11.f127136e = r3
                java.lang.Object r12 = a14.C53895h.m60469g(r12, r2, r11)
                if (r12 != r1) goto L_0x0109
                return r1
            L_0x0109:
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.C47383y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: ok1.e$g */
    public static final class C62043g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C45795b f176377d;

        /* renamed from: e */
        public final /* synthetic */ C77407n f176378e;

        /* renamed from: f */
        public final /* synthetic */ Context f176379f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<C13598b0> f176380g;

        /* renamed from: ok1.e$g$a */
        public static final class C62044a implements C60200t1.C60203c {

            /* renamed from: a */
            public final /* synthetic */ C45795b f176381a;

            /* renamed from: b */
            public final /* synthetic */ C32224a<C13598b0> f176382b;

            /* renamed from: ok1.e$g$a$a */
            public static final class C62045a extends C87413o implements C32227p<Boolean, C49765hx0, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C45795b f176383d;

                /* renamed from: e */
                public final /* synthetic */ C32224a<C13598b0> f176384e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C62045a(C45795b bVar, C32224a<C13598b0> aVar) {
                    super(2);
                    this.f176383d = bVar;
                    this.f176384e = aVar;
                }

                public Object invoke(Object obj, Object obj2) {
                    C49765hx0 hx02 = (C49765hx0) obj2;
                    if (((Boolean) obj).booleanValue()) {
                        ((C54991o) this.f176383d.mo71262a(C54991o.class)).mo76018p4(hx02 != null ? hx02.f134930r : null);
                    }
                    C32224a<C13598b0> aVar = this.f176384e;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    return C13598b0.f38549a;
                }
            }

            public C62044a(C45795b bVar, C32224a<C13598b0> aVar) {
                this.f176381a = bVar;
                this.f176382b = aVar;
            }

            /* renamed from: a */
            public String mo85200a(String str, String str2) {
                return "";
            }

            /* renamed from: b */
            public boolean mo85201b(long j, String str, String str2, int i) {
                if (!C87412m.m108589b(str, "notifyHideIdentitySwitch")) {
                    return false;
                }
                FinderLiveService.f159376d.getClass();
                C54795n5 n5Var = FinderLiveService.f159396y;
                if (n5Var == null) {
                    return false;
                }
                n5Var.mo75733f(C66785b.f191882e.mo90662O5(), 2, (C89349b) null, new C62045a(this.f176381a, this.f176382b));
                return false;
            }
        }

        public C62043g(C45795b bVar, C77407n nVar, Context context, C32224a<C13598b0> aVar) {
            this.f176377d = bVar;
            this.f176378e = nVar;
            this.f176379f = context;
            this.f176380g = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkIfRoleMysterious$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderJumpInfo finderJumpInfo = ((C54991o) this.f176377d.mo71262a(C54991o.class)).f154261U;
            if (finderJumpInfo != null) {
                ((C60200t1) C86312j.m106911c(C60200t1.class)).Em0(this.f176379f, finderJumpInfo, new C62044a(this.f176377d, this.f176380g));
            }
            this.f176378e.mo107572p();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkIfRoleMysterious$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.utils.FinderLiveUtil$checkRetentionPreLoad$1", mo125469f = "FinderLiveUtil.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ok1.e$j */
    public static final class C62046j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C50626o21 f176385d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62046j(C50626o21 o212, C15601d<? super C62046j> dVar) {
            super(2, dVar);
            this.f176385d = o212;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C62046j(this.f176385d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62046j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            MiniAppInfo miniAppInfo;
            String str;
            ResultKt.throwOnFailure(obj);
            FinderJumpInfo finderJumpInfo = this.f176385d.f138912d;
            if (!(finderJumpInfo == null || (miniAppInfo = finderJumpInfo.mini_app_info) == null || (str = miniAppInfo.app_id) == null)) {
                C61882w.f175962a.getClass();
                ((C88262c1) C86312j.m106911c(C88262c1.class)).e60("", str, 4);
                ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113305TH(C88273g1.FINDER_LIVING);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ok1.e$j0 */
    public static final class C62047j0 extends C54847z3.C54849b<C50800p91> {

        /* renamed from: b */
        public final /* synthetic */ C45795b f176386b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62047j0(C45795b bVar, Class<C50800p91> cls) {
            super(cls);
            this.f176386b = bVar;
        }

        /* renamed from: a */
        public void mo9116a(C47465a aVar) {
            C64822x51 x512;
            C50800p91 p912 = (C50800p91) aVar;
            Class cls = C54979h1.class;
            C87412m.m108594g(p912, "result");
            Log.m105924i("FinderLiveUtil", "[startPollingPromoteInfo] resp = " + C61937h.m72709h(p912));
            ((C54979h1) this.f176386b.mo71262a(cls)).f154120L = p912.f139662j;
            if (p912.f139656d == 1) {
                Log.m105924i("FinderLiveUtil", "[startPollingPromoteInfo] return sync no op");
            } else if (p912.f139657e == 0) {
                C0740i2 i2Var = ((C54979h1) this.f176386b.mo71262a(cls)).f154147v;
                C89349b bVar = null;
                C63956k kVar = i2Var instanceof C63956k ? (C63956k) i2Var : null;
                if (kVar != null) {
                    C45795b bVar2 = this.f176386b;
                    Log.m105924i("FinderLiveUtil", "[startPollingPromoteInfo] notify to del, currentInfo:" + C61937h.m72709h(kVar.mo13073b()));
                    long j = p912.f139660h;
                    if (j == 0 || j != kVar.f181291d) {
                        Log.m105924i("FinderLiveUtil", "[startPollingPromoteInfo] notify to del but return, currentInfo:" + C61937h.m72709h(kVar.mo13073b()) + ",svrCurrentPromoteId:" + p912.f139660h);
                        return;
                    }
                    C54979h1 h1Var = (C54979h1) bVar2.mo71262a(cls);
                    C64822x51 x513 = p912.f139659g;
                    if (x513 != null) {
                        bVar = x513.f186260j;
                    }
                    h1Var.f154119K = bVar;
                    FinderLiveService.f159376d.getClass();
                    C56032b bVar3 = FinderLiveService.f159379g;
                    if (bVar3 != null) {
                        C58124b.C58125b bVar4 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("PARAM_FINDER_LIVE_PROMOTE_DELETE_BY_ANCHOR", true);
                        C13598b0 b0Var = C13598b0.f38549a;
                        bVar3.statusChange(bVar4, bundle);
                    }
                }
            } else if (p912.f139658f > 0 && (x512 = p912.f139659g) != null) {
                C45795b bVar5 = this.f176386b;
                long j2 = ((C54979h1) bVar5.mo71262a(cls)).f154118J;
                Log.m105924i("FinderLiveUtil", "[startPollingPromoteInfo] notify to replace, promoteIdHideByVisitor:" + j2 + ", currentInfo:" + C61937h.m72709h(p912));
                if (x512.f186258h != j2 || !C87412m.m108589b(x512.f186267t, p912.f139661i)) {
                    FinderLiveService.f159376d.getClass();
                    C56032b bVar6 = FinderLiveService.f159379g;
                    if (bVar6 != null) {
                        C58124b.C58125b bVar7 = C58124b.C58125b.FINDER_LIVE_PROMTE_REPLACE;
                        Bundle bundle2 = new Bundle();
                        bundle2.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
                        C13598b0 b0Var2 = C13598b0.f38549a;
                        bVar6.statusChange(bVar7, bundle2);
                        return;
                    }
                    return;
                }
                C62042e eVar = C62042e.f176370a;
                byte[] byteArray = x512.toByteArray();
                C87412m.m108593f(byteArray, "it.toByteArray()");
                ((C54979h1) bVar5.mo71262a(cls)).mo75948o3(eVar.mo87130y1(byteArray));
                Log.m105924i("FinderLiveUtil", "[startPollingPromoteInfo] promoteIdHideByVisitor(" + j2 + ") == new_promote_info.id:(" + x512.f186258h + "), local sub_id(it.sub_id) == resp.sub_id(" + p912.f139661i + "), only update data ");
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.utils.FinderLiveUtil", mo125469f = "FinderLiveUtil.kt", mo125470l = {3834, 3846}, mo125471m = "dealWithBgPath")
    /* renamed from: ok1.e$k */
    public static final class C62048k extends C66704d {

        /* renamed from: d */
        public Object f176387d;

        /* renamed from: e */
        public /* synthetic */ Object f176388e;

        /* renamed from: f */
        public final /* synthetic */ C62042e f176389f;

        /* renamed from: g */
        public int f176390g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62048k(C62042e eVar, C15601d<? super C62048k> dVar) {
            super(dVar);
            this.f176389f = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f176388e = obj;
            this.f176390g |= Integer.MIN_VALUE;
            return this.f176389f.mo86988A((C45795b) null, (C64756up2) null, this);
        }
    }

    /* renamed from: ok1.e$k0 */
    public static final class C62049k0 implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C53973z1 f176391d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C89779i0> f176392e;

        public C62049k0(C53973z1 z1Var, C8479f0<C89779i0> f0Var) {
            this.f176391d = z1Var;
            this.f176392e = f0Var;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C53973z1 z1Var = this.f176391d;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C89779i0 i0Var = (C89779i0) this.f176392e.f27484d;
            if (i0Var != null) {
                i0Var.dismiss();
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.utils.FinderLiveUtil$uploadAndModBg$1$uplaodAndModJob$1", mo125469f = "FinderLiveUtil.kt", mo125470l = {3950, 3955, 3961}, mo125471m = "invokeSuspend")
    /* renamed from: ok1.e$l0 */
    public static final class C62050l0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f176393d;

        /* renamed from: e */
        public /* synthetic */ Object f176394e;

        /* renamed from: f */
        public final /* synthetic */ C45795b f176395f;

        /* renamed from: g */
        public final /* synthetic */ C64756up2 f176396g;

        /* renamed from: h */
        public final /* synthetic */ Context f176397h;

        /* renamed from: i */
        public final /* synthetic */ C8479f0<C89779i0> f176398i;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.utils.FinderLiveUtil$uploadAndModBg$1$uplaodAndModJob$1$1", mo125469f = "FinderLiveUtil.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: ok1.e$l0$a */
        public static final class C62051a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ Context f176399d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62051a(Context context, C15601d<? super C62051a> dVar) {
                super(2, dVar);
                this.f176399d = context;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C62051a(this.f176399d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C62051a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Context context = this.f176399d;
                C76912y0.m92767f(context, context.getString(C0966R.string.mml));
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.utils.FinderLiveUtil$uploadAndModBg$1$uplaodAndModJob$1$2", mo125469f = "FinderLiveUtil.kt", mo125470l = {3965}, mo125471m = "invokeSuspend")
        /* renamed from: ok1.e$l0$b */
        public static final class C62052b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f176400d;

            /* renamed from: e */
            public /* synthetic */ Object f176401e;

            /* renamed from: f */
            public final /* synthetic */ boolean f176402f;

            /* renamed from: g */
            public final /* synthetic */ C64756up2 f176403g;

            /* renamed from: h */
            public final /* synthetic */ Context f176404h;

            /* renamed from: i */
            public final /* synthetic */ C8479f0<C89779i0> f176405i;

            @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.utils.FinderLiveUtil$uploadAndModBg$1$uplaodAndModJob$1$2$1", mo125469f = "FinderLiveUtil.kt", mo125470l = {3966}, mo125471m = "invokeSuspend")
            /* renamed from: ok1.e$l0$b$a */
            public static final class C62053a extends C91594j implements C32227p<C0000n0, C15601d<? super C51778w31>, Object> {

                /* renamed from: d */
                public int f176406d;

                /* renamed from: e */
                public final /* synthetic */ C64756up2 f176407e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C62053a(C64756up2 up22, C15601d<? super C62053a> dVar) {
                    super(2, dVar);
                    this.f176407e = up22;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C62053a(this.f176407e, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C62053a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                    int i = this.f176406d;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FinderLiveService.f159376d.getClass();
                        C54795n5 n5Var = FinderLiveService.f159396y;
                        if (n5Var == null) {
                            return null;
                        }
                        C64756up2 up22 = this.f176407e;
                        this.f176406d = 1;
                        obj = n5Var.mo75722Z(up22, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return (C51778w31) obj;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62052b(boolean z, C64756up2 up22, Context context, C8479f0<C89779i0> f0Var, C15601d<? super C62052b> dVar) {
                super(2, dVar);
                this.f176402f = z;
                this.f176403g = up22;
                this.f176404h = context;
                this.f176405i = f0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C62052b bVar = new C62052b(this.f176402f, this.f176403g, this.f176404h, this.f176405i, dVar);
                bVar.f176401e = obj;
                return bVar;
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C62052b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r6.f176400d
                    r2 = 0
                    r3 = 2131827054(0x7f11196e, float:1.928701E38)
                    r4 = 1
                    if (r1 == 0) goto L_0x0019
                    if (r1 != r4) goto L_0x0011
                    kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ d -> 0x0074 }
                    goto L_0x003e
                L_0x0011:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L_0x0019:
                    kotlin.ResultKt.throwOnFailure(r7)
                    java.lang.Object r7 = r6.f176401e
                    a14.n0 r7 = (a14.C0000n0) r7
                    boolean r1 = r6.f176402f
                    if (r1 == 0) goto L_0x007e
                    wx3.f r7 = r7.getCoroutineContext()     // Catch:{ d -> 0x0074 }
                    a14.h0 r1 = a14.C53872d1.f151119c     // Catch:{ d -> 0x0074 }
                    wx3.f r7 = r7.plus(r1)     // Catch:{ d -> 0x0074 }
                    ok1.e$l0$b$a r1 = new ok1.e$l0$b$a     // Catch:{ d -> 0x0074 }
                    te3.up2 r5 = r6.f176403g     // Catch:{ d -> 0x0074 }
                    r1.<init>(r5, r2)     // Catch:{ d -> 0x0074 }
                    r6.f176400d = r4     // Catch:{ d -> 0x0074 }
                    java.lang.Object r7 = a14.C53895h.m60469g(r7, r1, r6)     // Catch:{ d -> 0x0074 }
                    if (r7 != r0) goto L_0x003e
                    return r0
                L_0x003e:
                    com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d     // Catch:{ d -> 0x0074 }
                    java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                    androidx.lifecycle.i0 r0 = r7.mo77630e(r0)     // Catch:{ d -> 0x0074 }
                    cl1.o r0 = (cl1.C54991o) r0     // Catch:{ d -> 0x0074 }
                    if (r0 != 0) goto L_0x004b
                    goto L_0x004f
                L_0x004b:
                    te3.up2 r1 = r6.f176403g     // Catch:{ d -> 0x0074 }
                    r0.f154230N = r1     // Catch:{ d -> 0x0074 }
                L_0x004f:
                    r7.getClass()     // Catch:{ d -> 0x0074 }
                    com.tencent.mm.plugin.finder.live.view.b r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g     // Catch:{ d -> 0x0074 }
                    if (r7 == 0) goto L_0x0067
                    d60.b$b r0 = d60.C58124b.C58125b.FINDER_LIVE_MODE_SWITCH     // Catch:{ d -> 0x0074 }
                    android.os.Bundle r1 = new android.os.Bundle     // Catch:{ d -> 0x0074 }
                    r1.<init>()     // Catch:{ d -> 0x0074 }
                    java.lang.String r5 = "PARAM_FINDER_LIVE_AUDIO_MODE"
                    r1.putBoolean(r5, r4)     // Catch:{ d -> 0x0074 }
                    rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ d -> 0x0074 }
                    r7.statusChange(r0, r1)     // Catch:{ d -> 0x0074 }
                L_0x0067:
                    android.content.Context r7 = r6.f176404h     // Catch:{ d -> 0x0074 }
                    r0 = 2131827055(0x7f11196f, float:1.9287012E38)
                    java.lang.String r0 = r7.getString(r0)     // Catch:{ d -> 0x0074 }
                    nj3.C76912y0.m92768g(r7, r0)     // Catch:{ d -> 0x0074 }
                    goto L_0x0087
                L_0x0074:
                    android.content.Context r7 = r6.f176404h
                    java.lang.String r0 = r7.getString(r3)
                    nj3.C76912y0.m92767f(r7, r0)
                    goto L_0x0087
                L_0x007e:
                    android.content.Context r7 = r6.f176404h
                    java.lang.String r0 = r7.getString(r3)
                    nj3.C76912y0.m92767f(r7, r0)
                L_0x0087:
                    gy3.f0<qo3.i0> r7 = r6.f176405i
                    T r7 = r7.f27484d
                    qo3.i0 r7 = (qo3.C89779i0) r7
                    if (r7 == 0) goto L_0x0092
                    r7.setOnDismissListener(r2)
                L_0x0092:
                    gy3.f0<qo3.i0> r7 = r6.f176405i
                    T r7 = r7.f27484d
                    qo3.i0 r7 = (qo3.C89779i0) r7
                    if (r7 == 0) goto L_0x009d
                    r7.dismiss()
                L_0x009d:
                    rx3.b0 r7 = rx3.C13598b0.f38549a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.C62050l0.C62052b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.utils.FinderLiveUtil$uploadAndModBg$1$uplaodAndModJob$1$uploadResult$1", mo125469f = "FinderLiveUtil.kt", mo125470l = {3950}, mo125471m = "invokeSuspend")
        /* renamed from: ok1.e$l0$c */
        public static final class C62054c extends C91594j implements C32227p<C0000n0, C15601d<? super C13604l<? extends Boolean, ? extends C64756up2>>, Object> {

            /* renamed from: d */
            public int f176408d;

            /* renamed from: e */
            public final /* synthetic */ C45795b f176409e;

            /* renamed from: f */
            public final /* synthetic */ C64756up2 f176410f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62054c(C45795b bVar, C64756up2 up22, C15601d<? super C62054c> dVar) {
                super(2, dVar);
                this.f176409e = bVar;
                this.f176410f = up22;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C62054c(this.f176409e, this.f176410f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C62054c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f176408d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C62042e eVar = C62042e.f176370a;
                    C45795b bVar = this.f176409e;
                    C64756up2 up22 = this.f176410f;
                    this.f176408d = 1;
                    obj = eVar.mo86988A(bVar, up22, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62050l0(C45795b bVar, C64756up2 up22, Context context, C8479f0<C89779i0> f0Var, C15601d<? super C62050l0> dVar) {
            super(2, dVar);
            this.f176395f = bVar;
            this.f176396g = up22;
            this.f176397h = context;
            this.f176398i = f0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C62050l0 l0Var = new C62050l0(this.f176395f, this.f176396g, this.f176397h, this.f176398i, dVar);
            l0Var.f176394e = obj;
            return l0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62050l0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: a14.n0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r12.f176393d
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x0029
                if (r1 == r4) goto L_0x0021
                if (r1 == r3) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x009d
            L_0x0015:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001d:
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x0078
            L_0x0021:
                java.lang.Object r1 = r12.f176394e
                a14.n0 r1 = (a14.C0000n0) r1
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x0049
            L_0x0029:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.f176394e
                r1 = r13
                a14.n0 r1 = (a14.C0000n0) r1
                wx3.f r13 = r1.getCoroutineContext()
                ok1.e$l0$c r6 = new ok1.e$l0$c
                fj1.b r7 = r12.f176395f
                te3.up2 r8 = r12.f176396g
                r6.<init>(r7, r8, r5)
                r12.f176394e = r1
                r12.f176393d = r4
                java.lang.Object r13 = a14.C53895h.m60469g(r13, r6, r12)
                if (r13 != r0) goto L_0x0049
                return r0
            L_0x0049:
                rx3.l r13 = (rx3.C13604l) r13
                B r4 = r13.f38556e
                r8 = r4
                te3.up2 r8 = (te3.C64756up2) r8
                A r13 = r13.f38555d
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r7 = r13.booleanValue()
                if (r8 != 0) goto L_0x007b
                wx3.f r13 = r1.getCoroutineContext()
                a14.h0 r1 = a14.C53872d1.f151117a
                a14.k2 r1 = f14.C58901s.f168555a
                wx3.f r13 = r13.plus(r1)
                ok1.e$l0$a r1 = new ok1.e$l0$a
                android.content.Context r2 = r12.f176397h
                r1.<init>(r2, r5)
                r12.f176394e = r5
                r12.f176393d = r3
                java.lang.Object r13 = a14.C53895h.m60469g(r13, r1, r12)
                if (r13 != r0) goto L_0x0078
                return r0
            L_0x0078:
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            L_0x007b:
                wx3.f r13 = r1.getCoroutineContext()
                a14.h0 r1 = a14.C53872d1.f151117a
                a14.k2 r1 = f14.C58901s.f168555a
                wx3.f r13 = r13.plus(r1)
                ok1.e$l0$b r1 = new ok1.e$l0$b
                android.content.Context r9 = r12.f176397h
                gy3.f0<qo3.i0> r10 = r12.f176398i
                r11 = 0
                r6 = r1
                r6.<init>(r7, r8, r9, r10, r11)
                r12.f176394e = r5
                r12.f176393d = r2
                java.lang.Object r13 = a14.C53895h.m60469g(r13, r1, r12)
                if (r13 != r0) goto L_0x009d
                return r0
            L_0x009d:
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.C62050l0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: ok1.e$n */
    public static final class C62055n implements C108455d {

        /* renamed from: a */
        public final /* synthetic */ C15601d<byte[]> f176411a;

        /* renamed from: b */
        public final /* synthetic */ String f176412b;

        /* renamed from: c */
        public final /* synthetic */ String f176413c;

        public C62055n(C15601d<? super byte[]> dVar, String str, String str2) {
            this.f176411a = dVar;
            this.f176412b = str;
            this.f176413c = str2;
        }

        /* renamed from: a */
        public final void mo26263a(boolean z, Object[] objArr) {
            if (z) {
                C15601d<byte[]> dVar = this.f176411a;
                C118418g gVar = C118418g.INSTANCE;
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f176413c);
                ArrayList<byte[]> Zy = gVar.mo175811Zy(arrayList);
                C87412m.m108593f(Zy, "INSTANCE.getSecSdkImageI…                       })");
                dVar.resumeWith(Result.m168114constructorimpl(C110818d0.m150916N(Zy)));
                return;
            }
            Log.m105920e("FinderLiveUtil", "[genSecurityData] downloadImage error:" + this.f176412b);
            this.f176411a.resumeWith(Result.m168114constructorimpl((Object) null));
        }
    }

    /* renamed from: ok1.e$o */
    public static final class C62056o implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f176414d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C77407n> f176415e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<C15133e0> f176416f;

        /* renamed from: g */
        public final /* synthetic */ Context f176417g;

        /* renamed from: ok1.e$o$a */
        public static final class C62057a extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public static final C62057a f176418d = new C62057a();

            public C62057a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Boolean) obj).booleanValue();
                return C13598b0.f38549a;
            }
        }

        public C62056o(BaseFinderFeed baseFinderFeed, C8479f0<C77407n> f0Var, C8479f0<C15133e0> f0Var2, Context context) {
            this.f176414d = baseFinderFeed;
            this.f176415e = f0Var;
            this.f176416f = f0Var2;
            this.f176417g = context;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            C77407n nVar;
            C62042e eVar = C62042e.f176370a;
            C64273c21 liveInfo = this.f176414d.mo3513o().getLiveInfo();
            if (eVar.mo87082h(liveInfo != null ? liveInfo.f182385X0 : 0) && (nVar = (C77407n) this.f176415e.f27484d) != null) {
                C8479f0<C15133e0> f0Var = this.f176416f;
                Context context = this.f176417g;
                C87412m.m108593f(e0Var, LocaleUtil.ITALIAN);
                ((C15133e0) f0Var.f27484d).mo14095wW(context, e0Var, nVar, 2, C62057a.f176418d);
            }
        }
    }

    /* renamed from: ok1.e$u */
    public static final class C62058u extends C87413o implements C32227p<Boolean, C52047y01, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C53973z1 f176419d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C89779i0> f176420e;

        /* renamed from: f */
        public final /* synthetic */ String f176421f;

        /* renamed from: g */
        public final /* synthetic */ C64370fp1 f176422g;

        /* renamed from: h */
        public final /* synthetic */ int f176423h;

        /* renamed from: i */
        public final /* synthetic */ C45795b f176424i;

        /* renamed from: j */
        public final /* synthetic */ long f176425j;

        /* renamed from: n */
        public final /* synthetic */ String f176426n;

        /* renamed from: o */
        public final /* synthetic */ Context f176427o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62058u(C53973z1 z1Var, C8479f0<C89779i0> f0Var, String str, C64370fp1 fp12, int i, C45795b bVar, long j, String str2, Context context) {
            super(2);
            this.f176419d = z1Var;
            this.f176420e = f0Var;
            this.f176421f = str;
            this.f176422g = fp12;
            this.f176423h = i;
            this.f176424i = bVar;
            this.f176425j = j;
            this.f176426n = str2;
            this.f176427o = context;
        }

        public Object invoke(Object obj, Object obj2) {
            T t;
            C64688rq1 rq12;
            C89349b bVar;
            boolean z;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C52047y01 y012 = (C52047y01) obj2;
            Class cls = C54991o.class;
            String str = null;
            C53973z1.C53974a.m60623a(this.f176419d, (CancellationException) null, 1, (Object) null);
            C89779i0 i0Var = (C89779i0) this.f176420e.f27484d;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            if (booleanValue) {
                C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
                String str2 = this.f176421f;
                C64370fp1 fp12 = this.f176422g;
                long j = fp12.f183176d;
                int i = this.f176423h;
                boolean p = C61866i0.f175909a.mo86803p(fp12);
                C64370fp1 fp13 = this.f176422g;
                C87412m.m108594g(fp13, "data");
                LinkedList<z44> linkedList = fp13.f183165J;
                C87412m.m108593f(linkedList, "this.show_box_items");
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((z44) t).f186625d == 4) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                z44 z44 = (z44) t;
                if (z44 == null || (bVar = z44.f186626e) == null) {
                    rq12 = null;
                } else {
                    rq12 = new C64688rq1();
                    rq12.parseFrom(bVar.mo123703f());
                }
                int i2 = rq12 != null ? rq12.f185233e : 0;
                wVar.getClass();
                C87412m.m108594g(str2, "sessionId");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", 1007);
                jSONObject.put("session", str2);
                jSONObject.put("productid", j);
                jSONObject.put("seckill", p ? 1 : 0);
                if (i2 > 0) {
                    jSONObject.put("buyer", i2);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("entrance", i);
                C54116w.Ex0(wVar, C54067f0.C54076o0.Commerce, jSONObject.toString(), 0, jSONObject2.toString(), (String) null, (String) null, (String) null, (String) null, 244, (Object) null);
                C64859yk1 yk12 = new C64859yk1();
                C45795b bVar2 = this.f176424i;
                C64370fp1 fp14 = this.f176422g;
                long j2 = this.f176425j;
                String str3 = this.f176421f;
                int i3 = this.f176423h;
                String str4 = this.f176426n;
                yk12.f186566d = ((C54991o) bVar2.mo71262a(cls)).f154341n;
                yk12.f186570h = fp14;
                yk12.f186567e = 1;
                if (y012 != null) {
                    str = y012.f145063e;
                }
                yk12.f186568f = str;
                yk12.f186569g = j2;
                yk12.f186573n = str3;
                yk12.f186572j = String.valueOf(i3);
                yk12.f186574o = str4.toString();
                Intent intent = new Intent();
                C45795b bVar3 = this.f176424i;
                Context context = this.f176427o;
                ((C54991o) bVar3.mo71262a(cls)).f154350p0 = false;
                FinderLiveService finderLiveService = FinderLiveService.f159376d;
                finderLiveService.getClass();
                C60735a aVar = FinderLiveService.f159378f;
                if (aVar != null) {
                    aVar.mo85683a0();
                }
                C54804r0.f153631a.mo75762c(context, bVar3, 2);
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83773T5(intent, "shop", 0);
                intent.putExtra("KEY_PARAMS_KEY_VALUE", yk12.toByteArray());
                intent.putExtra("KEY_PARAMS_SOURCE_TYPE", 3);
                intent.putExtra("KEY_PARAMS_NEED_CLOSE_LIVE", false);
                ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13349lV(context, intent, true);
                C62197e e0 = finderLiveService.mo77631e0();
                if (e0 != null) {
                    e0.mo87273O0(true);
                }
                Log.m105924i("FinderLiveUtil", "fxxkshopreport requestId goReplay, " + this.f176422g.f183193x);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.utils.FinderLiveUtil", mo125469f = "FinderLiveUtil.kt", mo125470l = {3823}, mo125471m = "listenSecurityData")
    /* renamed from: ok1.e$w */
    public static final class C62059w extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f176428d;

        /* renamed from: e */
        public final /* synthetic */ C62042e f176429e;

        /* renamed from: f */
        public int f176430f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62059w(C62042e eVar, C15601d<? super C62059w> dVar) {
            super(dVar);
            this.f176429e = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f176428d = obj;
            this.f176430f |= Integer.MIN_VALUE;
            return this.f176429e.mo87107p1((C45795b) null, (C32226l<? super byte[], C13598b0>) null, this);
        }
    }

    /* renamed from: ok1.e$x */
    public static final class C62060x<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C32226l<byte[], C13598b0> f176431d;

        public C62060x(C32226l<? super byte[], C13598b0> lVar) {
            this.f176431d = lVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            C13604l lVar = (C13604l) obj;
            if (((Boolean) lVar.f38555d).booleanValue()) {
                this.f176431d.invoke(lVar.f38556e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ok1.e$z */
    public static final class C62061z implements C45395w.C45396a {

        /* renamed from: a */
        public final /* synthetic */ C45795b f176432a;

        /* renamed from: b */
        public final /* synthetic */ C32224a<C13598b0> f176433b;

        public C62061z(C45795b bVar, C32224a<C13598b0> aVar) {
            this.f176432a = bVar;
            this.f176433b = aVar;
        }

        /* renamed from: a */
        public void mo70900a(int i, int i2, String str, C49760hw0 hw02) {
            C87412m.m108594g(hw02, "resp");
            if (i == 0 && i2 == 0) {
                ((C54991o) this.f176432a.mo71262a(C54991o.class)).f154232N2.mo75654k(hw02);
                C32224a<C13598b0> aVar = this.f176433b;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }
    }

    static {
        C32444a aVar = C32444a.f86121a;
        boolean z = false;
        if (C32444a.f86039B2.mo60266n().intValue() == 1) {
            z = true;
        }
        f176374e = z;
    }

    /* renamed from: D */
    public static final void m72801D(Context context) {
        String str;
        ((C54116w) C86312j.m106911c(C54116w.class)).ty0(1);
        C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
        if (oVar == null || (str = oVar.f154345o) == null) {
            str = "";
        }
        Log.m105924i("FinderLiveUtil", "#enterShopCustomerService-enterChatting anchorUsername=" + str);
        ((C13883o1) C86312j.m106911c(C13883o1.class)).Ro0(context, str, 1);
    }

    /* renamed from: O1 */
    public static /* synthetic */ void m72802O1(C62042e eVar, EditText editText, TextView textView, int i, int i2, boolean z, C32224a aVar, int i3, Object obj) {
        eVar.mo87028N1(editText, textView, i, i2, (i3 & 16) != 0 ? true : z, aVar);
    }

    /* renamed from: Q1 */
    public static void m72803Q1(C62042e eVar, View view, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = f176376g;
        }
        if ((i3 & 4) != 0) {
            i2 = f176376g;
        }
        eVar.getClass();
        C87412m.m108594g(view, "view");
        view.post(new C11468r(view, i, i2));
    }

    /* renamed from: V */
    public static /* synthetic */ C48978cb0 m72804V(C62042e eVar, C45795b bVar, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            str = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        return eVar.mo87045U(bVar, i, str, i2);
    }

    /* renamed from: Z0 */
    public static boolean m72805Z0(C62042e eVar, String str, String str2, boolean z, int i, Object obj) {
        boolean z2 = false;
        if ((i & 4) != 0) {
            z = false;
        }
        eVar.getClass();
        if (z) {
            return Util.isEqual(str, str2);
        }
        if (str == null || str.length() == 0) {
            z2 = true;
        }
        return (true ^ z2) & Util.isEqual(str, str2);
    }

    /* renamed from: e0 */
    public static void m72806e0(C62042e eVar, ArrayList arrayList, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = C0966R.string.dzo;
        }
        eVar.getClass();
        C87412m.m108594g(arrayList, "result");
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < 60; i4++) {
            String C = C58739j4.f168176a.mo83675C(i4);
            arrayList2.add(MMApplicationContext.getContext().getResources().getString(i2, new Object[]{C}));
        }
        for (int i5 = 0; i5 < i; i5++) {
            arrayList.add(arrayList2);
        }
    }

    /* renamed from: k0 */
    public static /* synthetic */ int m72807k0(C62042e eVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return eVar.mo87089j0(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0096, code lost:
        if ((r0 != null && r0.f154382x) != false) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0104  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m72808l0(ok1.C62042e r4, java.lang.String r5, java.lang.String r6, boolean r7, int r8, java.lang.Object r9) {
        /*
            r8 = r8 & 4
            r9 = 0
            if (r8 == 0) goto L_0x0006
            r7 = 0
        L_0x0006:
            r4.getClass()
            java.lang.Class<cl1.o> r8 = cl1.C54991o.class
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r1 = r0.mo77630e(r8)
            cl1.o r1 = (cl1.C54991o) r1
            r2 = 1
            if (r1 == 0) goto L_0x001c
            boolean r1 = r1.f154387y
            if (r1 != r2) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            if (r1 == 0) goto L_0x0033
            if (r6 == 0) goto L_0x002e
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x0029
            r1 = 1
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            if (r1 != r2) goto L_0x002e
            r1 = 1
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            if (r1 == 0) goto L_0x0033
            goto L_0x011a
        L_0x0033:
            boolean r1 = r4.mo87084h1(r5)
            r3 = 0
            if (r1 != 0) goto L_0x0044
            java.lang.String r1 = eb0.C75592q0.m90782l()
            boolean r1 = gy3.C87412m.m108589b(r5, r1)
            if (r1 == 0) goto L_0x0076
        L_0x0044:
            androidx.lifecycle.i0 r1 = r0.mo77630e(r8)
            cl1.o r1 = (cl1.C54991o) r1
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r1.mo75977P3()
            if (r1 == 0) goto L_0x005f
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x005a
            r1 = 1
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            if (r1 != r2) goto L_0x005f
            r1 = 1
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            if (r1 == 0) goto L_0x0076
            androidx.lifecycle.i0 r4 = r0.mo77630e(r8)
            cl1.o r4 = (cl1.C54991o) r4
            if (r4 == 0) goto L_0x0070
            java.lang.String r4 = r4.mo75977P3()
            r6 = r4
            goto L_0x0071
        L_0x0070:
            r6 = r3
        L_0x0071:
            gy3.C87412m.m108591d(r6)
            goto L_0x011a
        L_0x0076:
            androidx.lifecycle.i0 r1 = r0.mo77630e(r8)
            cl1.o r1 = (cl1.C54991o) r1
            if (r1 == 0) goto L_0x0084
            boolean r1 = r1.f154356q2
            if (r1 != r2) goto L_0x0084
            r1 = 1
            goto L_0x0085
        L_0x0084:
            r1 = 0
        L_0x0085:
            if (r1 != 0) goto L_0x0098
            androidx.lifecycle.i0 r0 = r0.mo77630e(r8)
            cl1.o r0 = (cl1.C54991o) r0
            if (r0 == 0) goto L_0x0095
            boolean r0 = r0.f154382x
            if (r0 != r2) goto L_0x0095
            r0 = 1
            goto L_0x0096
        L_0x0095:
            r0 = 0
        L_0x0096:
            if (r0 == 0) goto L_0x00ac
        L_0x0098:
            if (r6 == 0) goto L_0x00a7
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x00a2
            r0 = 1
            goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            if (r0 != r2) goto L_0x00a7
            r0 = 1
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            if (r0 == 0) goto L_0x00ac
            goto L_0x011a
        L_0x00ac:
            if (r6 == 0) goto L_0x00bb
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x00b6
            r0 = 1
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            if (r0 != r2) goto L_0x00bb
            r0 = 1
            goto L_0x00bc
        L_0x00bb:
            r0 = 0
        L_0x00bc:
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r4.mo87084h1(r5)
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = eb0.C75592q0.m90782l()
            boolean r0 = gy3.C87412m.m108589b(r5, r0)
            if (r0 == 0) goto L_0x00e0
        L_0x00ce:
            fj1.b r0 = fj1.C45795b.f123698n
            if (r0 == 0) goto L_0x00dc
            ok1.e r1 = f176370a
            boolean r0 = r1.mo87087i1(r0, r3)
            if (r0 != r2) goto L_0x00dc
            r0 = 1
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            if (r0 == 0) goto L_0x00e0
            goto L_0x011a
        L_0x00e0:
            boolean r0 = r4.mo87027N0()
            if (r0 != 0) goto L_0x0109
            boolean r4 = r4.mo87084h1(r5)
            if (r4 == 0) goto L_0x0109
            fj1.b r4 = fj1.C45795b.f123698n
            if (r4 == 0) goto L_0x0102
            androidx.lifecycle.i0 r4 = r4.mo71262a(r8)
            cl1.o r4 = (cl1.C54991o) r4
            te3.fs0 r4 = r4.mo75986U3()
            if (r4 == 0) goto L_0x0102
            int r4 = r4.f183215f
            r8 = 2
            if (r4 != r8) goto L_0x0102
            r9 = 1
        L_0x0102:
            if (r9 == 0) goto L_0x0109
            if (r6 != 0) goto L_0x011a
            java.lang.String r6 = ""
            goto L_0x011a
        L_0x0109:
            er1.j4 r4 = er1.C58739j4.f168176a
            r4.getClass()
            java.lang.Class<tf0.p1> r4 = tf0.C64916p1.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            tf0.p1 r4 = (tf0.C64916p1) r4
            java.lang.String r6 = r4.mo76705lw(r5, r6, r7)
        L_0x011a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.m72808l0(ok1.e, java.lang.String, java.lang.String, boolean, int, java.lang.Object):java.lang.String");
    }

    /* renamed from: u1 */
    public static /* synthetic */ void m72809u1(C62042e eVar, long j, String str, int i, int i2, int i3, Object obj) {
        eVar.mo87119t1(j, str, i, (i3 & 8) != 0 ? 1 : i2);
    }

    /* renamed from: w0 */
    public static /* synthetic */ int m72810w0(C62042e eVar, C45795b bVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return eVar.mo87123v0(bVar, z, z2);
    }

    /* renamed from: x1 */
    public static final void m72811x1(C104289g gVar, C64848y91 y912) {
        if (y912 != null) {
            int optInt = gVar.optInt("tag_id");
            String optString = gVar.optString("tag_name");
            int optInt2 = gVar.optInt("show_primary_tag");
            int optInt3 = gVar.optInt("need_poi");
            y912.f186453d = optInt;
            y912.f186454e = optString;
            y912.f186457h = optInt2;
            y912.f186458i = optInt3;
        }
    }

    /* renamed from: y0 */
    public static final C64733to m72812y0(C64359f71 f712) {
        T t;
        boolean z;
        boolean z2;
        boolean z3;
        LinkedList<C64733to> linkedList = f712.f183085d;
        C87412m.m108593f(linkedList, "transitionVideoInfo.cdn_trans_info");
        boolean z4 = true;
        T t2 = null;
        if (!(!linkedList.isEmpty())) {
            return null;
        }
        LinkedList<C64733to> linkedList2 = f712.f183085d;
        C87412m.m108593f(linkedList2, "transitionVideoInfo.cdn_trans_info");
        for (C64733to toVar : linkedList2) {
            if (toVar.f185626i == f176370a.mo87039S()) {
                z3 = true;
                continue;
            } else {
                z3 = false;
                continue;
            }
            if (z3) {
                break;
            }
        }
        LinkedList<C64733to> linkedList3 = f712.f183085d;
        C87412m.m108593f(linkedList3, "transitionVideoInfo.cdn_trans_info");
        Iterator<T> it = linkedList3.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C64733to) t).f185626i == f176370a.mo87039S()) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C64733to toVar2 = (C64733to) t;
        if (!f176370a.mo87039S() || toVar2 != null) {
            return toVar2;
        }
        LinkedList<C64733to> linkedList4 = f712.f183085d;
        C87412m.m108593f(linkedList4, "transitionVideoInfo.cdn_trans_info");
        Iterator<T> it4 = linkedList4.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            T next = it4.next();
            if (((C64733to) next).f185626i == 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                t2 = next;
                break;
            }
        }
        C64733to toVar3 = (C64733to) t2;
        StringBuilder sb = new StringBuilder();
        sb.append("getReplayTransitionInfo findBackupCdnTransInfo firstTargetVideoTagType result is null, backupTargetVideoTagType result is null:");
        if (toVar3 != null) {
            z4 = false;
        }
        sb.append(z4);
        sb.append('!');
        Log.m105928w("FinderLiveUtil", sb.toString());
        return toVar3;
    }

    /* renamed from: z0 */
    public static final C64733to m72813z0(C64359f71 f712, int i) {
        T t;
        boolean z;
        T t2;
        boolean z2;
        boolean z3;
        LinkedList<C64733to> linkedList = f712.f183085d;
        C87412m.m108593f(linkedList, "transitionVideoInfo.cdn_trans_info");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            t = null;
            z = false;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            C64733to toVar = (C64733to) t2;
            if (toVar.f185627j == i && toVar.f185626i == f176370a.mo87039S()) {
                z3 = true;
                continue;
            } else {
                z3 = false;
                continue;
            }
            if (z3) {
                break;
            }
        }
        C64733to toVar2 = (C64733to) t2;
        if (f176370a.mo87039S() && toVar2 == null) {
            LinkedList<C64733to> linkedList2 = f712.f183085d;
            C87412m.m108593f(linkedList2, "transitionVideoInfo.cdn_trans_info");
            Iterator<T> it4 = linkedList2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                T next = it4.next();
                C64733to toVar3 = (C64733to) next;
                if (toVar3.f185627j == i && toVar3.f185626i == 0) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    t = next;
                    break;
                }
            }
            toVar2 = (C64733to) t;
            StringBuilder sb = new StringBuilder();
            sb.append("getReplayTransitionInfo findTargetCdnTransInfo firstTargetVideoTagType result is null, backupTargetVideoTagType result is null:");
            if (toVar2 == null) {
                z = true;
            }
            sb.append(z);
            sb.append('!');
            Log.m105928w("FinderLiveUtil", sb.toString());
        }
        return toVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: te3.up2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo86988A(fj1.C45795b r9, te3.C64756up2 r10, wx3.C15601d<? super rx3.C13604l<java.lang.Boolean, ? extends te3.C64756up2>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof ok1.C62042e.C62048k
            if (r0 == 0) goto L_0x0013
            r0 = r11
            ok1.e$k r0 = (ok1.C62042e.C62048k) r0
            int r1 = r0.f176390g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f176390g = r1
            goto L_0x0018
        L_0x0013:
            ok1.e$k r0 = new ok1.e$k
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f176388e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f176390g
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r5) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0114
        L_0x002c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0034:
            java.lang.Object r9 = r0.f176387d
            r10 = r9
            te3.up2 r10 = (te3.C64756up2) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0151
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r11)
            if (r9 == 0) goto L_0x0170
            int r9 = r10.f185784f
            if (r9 == 0) goto L_0x0142
            if (r9 == r5) goto L_0x0051
            rx3.l r9 = new rx3.l
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r9.<init>(r10, r4)
            return r9
        L_0x0051:
            te3.c60 r9 = r10.f185783e
            if (r9 == 0) goto L_0x0058
            java.lang.String r10 = r9.f182415d
            goto L_0x0059
        L_0x0058:
            r10 = r4
        L_0x0059:
            if (r9 == 0) goto L_0x005e
            java.lang.String r9 = r9.f182416e
            goto L_0x005f
        L_0x005e:
            r9 = r4
        L_0x005f:
            r0.f176390g = r3
            a14.m r11 = new a14.m
            wx3.d r0 = xx3.C66447b.m78392b(r0)
            r11.<init>(r0, r5)
            r11.mo74609p()
            r0 = 0
            if (r10 == 0) goto L_0x007d
            int r2 = r10.length()
            if (r2 <= 0) goto L_0x0078
            r2 = 1
            goto L_0x0079
        L_0x0078:
            r2 = 0
        L_0x0079:
            if (r2 != r5) goto L_0x007d
            r2 = 1
            goto L_0x007e
        L_0x007d:
            r2 = 0
        L_0x007e:
            java.lang.String r6 = "FinderLiveUploadUtil"
            if (r2 == 0) goto L_0x0101
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            if (r2 == 0) goto L_0x0101
            if (r9 == 0) goto L_0x0096
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0092
            r2 = 1
            goto L_0x0093
        L_0x0092:
            r2 = 0
        L_0x0093:
            if (r2 != r5) goto L_0x0096
            r0 = 1
        L_0x0096:
            if (r0 == 0) goto L_0x0101
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            if (r0 == 0) goto L_0x0101
            gi.g r0 = new gi.g
            r0.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "upload_"
            r2.append(r7)
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r10)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r0.field_mediaId = r2
            r0.field_fullpath = r10
            r0.field_thumbpath = r9
            r0.field_needStorage = r5
            r9 = 20302(0x4f4e, float:2.8449E-41)
            r0.field_fileType = r9
            r9 = 251(0xfb, float:3.52E-43)
            r0.field_appType = r9
            r9 = 8
            r0.f287655L = r9
            r0.field_bzScene = r3
            r9 = 60
            r0.f287673t = r9
            r9 = 600(0x258, float:8.41E-43)
            r0.f287674u = r9
            r0.field_priority = r3
            ok1.c r9 = new ok1.c
            r9.<init>(r11)
            r0.f287662f = r9
            java.lang.Class<qo.l> r9 = p663qo.C101213l.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            qo.l r9 = (p663qo.C101213l) r9
            boolean r9 = r9.if0(r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "[uploadVideoFile] upload start, result = "
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            goto L_0x010d
        L_0x0101:
            java.lang.String r9 = "[uploadVideoFile] upload end， videoPath = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            java.lang.Object r9 = kotlin.Result.m168114constructorimpl(r4)
            r11.resumeWith(r9)
        L_0x010d:
            java.lang.Object r11 = r11.mo74608o()
            if (r11 != r1) goto L_0x0114
            return r1
        L_0x0114:
            rx3.l r11 = (rx3.C13604l) r11
            if (r11 == 0) goto L_0x013a
            te3.up2 r9 = new te3.up2
            r9.<init>()
            r9.f185784f = r5
            te3.c60 r10 = new te3.c60
            r10.<init>()
            A r0 = r11.f38555d
            java.lang.String r0 = (java.lang.String) r0
            r10.f182415d = r0
            B r11 = r11.f38556e
            java.lang.String r11 = (java.lang.String) r11
            r10.f182416e = r11
            r9.f185783e = r10
            rx3.l r10 = new rx3.l
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10.<init>(r11, r9)
            goto L_0x0141
        L_0x013a:
            rx3.l r10 = new rx3.l
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r10.<init>(r9, r4)
        L_0x0141:
            return r10
        L_0x0142:
            ok1.b r9 = ok1.C11425b.f33607a
            java.lang.String r11 = r10.f185782d
            r0.f176387d = r10
            r0.f176390g = r5
            java.lang.Object r11 = r9.mo11425a(r11, r0)
            if (r11 != r1) goto L_0x0151
            return r1
        L_0x0151:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x0168
            te3.up2 r9 = new te3.up2
            r9.<init>()
            int r10 = r10.f185784f
            r9.f185784f = r10
            r9.f185782d = r11
            rx3.l r10 = new rx3.l
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10.<init>(r11, r9)
            goto L_0x016f
        L_0x0168:
            rx3.l r10 = new rx3.l
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r10.<init>(r9, r4)
        L_0x016f:
            return r10
        L_0x0170:
            rx3.l r9 = new rx3.l
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r9.<init>(r10, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.mo86988A(fj1.b, te3.up2, wx3.d):java.lang.Object");
    }

    /* renamed from: A0 */
    public final int mo86989A0(int i) {
        return i >= 50 ? Color.parseColor("#FFE58F") : MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2975b6);
    }

    /* renamed from: A1 */
    public final void mo86990A1(Context context) {
        Integer num;
        C87412m.m108594g(context, "context");
        C86009m1 m1Var = new C86009m1(MMApplicationContext.getContext().getApplicationContext().getFilesDir().getAbsolutePath() + "/finder_live_applaud_sound.mp3");
        if (!m1Var.mo119967g()) {
            FilesCopy.copyAssets(context, "finder_live_applaud_sound.mp3", m1Var.mo119976n());
        }
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar != null) {
            Integer num2 = -10001;
            Log.m105924i("MicroMsg.LiveCore", "stopLocalSoundEffect");
            if (num2 != null) {
                num = Integer.valueOf(num2.intValue());
            } else {
                TXAudioEffectManager.AudioMusicParam audioMusicParam = aVar.f172996H;
                num = audioMusicParam != null ? Integer.valueOf(audioMusicParam.f154608id) : null;
            }
            if (num != null) {
                int intValue = num.intValue();
                aVar.mo85679W().getAudioEffectManager().stopPlayMusic(intValue);
                aVar.mo85679W().getAudioEffectManager().setMusicObserver(intValue, (TXAudioEffectManager.TXMusicPlayObserver) null);
                aVar.f172996H = null;
            }
        }
        finderLiveService.getClass();
        C60735a aVar2 = FinderLiveService.f159378f;
        if (aVar2 != null) {
            String i = m1Var.mo119971i();
            C87412m.m108593f(i, "soundFile.absolutePath");
            aVar2.mo85690h0(-10001, i, (TXAudioEffectManager.TXMusicPlayObserver) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0051, code lost:
        r3 = r3.field_liveInfo;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo86991B(fj1.C45795b r7) {
        /*
            r6 = this;
            java.lang.String r0 = "buContext"
            gy3.C87412m.m108594g(r7, r0)
            gg1.a r0 = gg1.C32444a.f86121a
            re1.a r0 = gg1.C32444a.f86152h2
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L_0x0017
            return r1
        L_0x0017:
            pe1.c<java.lang.Integer> r0 = gg1.C32444a.f86032A
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            androidx.lifecycle.i0 r7 = r7.mo71262a(r2)
            cl1.o r7 = (cl1.C54991o) r7
            boolean r7 = r7.f154256T
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "enableAnchorMusic configValue:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", isMusicEnable = "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = ",saveFlag:"
            r2.append(r3)
            zc1.b r3 = zc1.C66785b.f191882e
            r4 = 0
            r5 = 0
            bd1.b r3 = zc1.C66783a.C66784a.m78800c(r3, r5, r1, r4)
            if (r3 == 0) goto L_0x0058
            te3.li0 r3 = r3.field_liveInfo
            if (r3 == 0) goto L_0x0058
            int r3 = r3.f137431e
            goto L_0x0059
        L_0x0058:
            r3 = 0
        L_0x0059:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderLiveUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            if (r0 != 0) goto L_0x006a
            if (r7 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.mo86991B(fj1.b):boolean");
    }

    /* renamed from: B0 */
    public final C77407n mo86992B0(Context context, BaseFinderFeed baseFinderFeed, int i, C49712hj1 hj12, C32224a<C13598b0> aVar) {
        Context context2 = context;
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        int i2 = i;
        C49712hj1 hj13 = hj12;
        Class cls = C54108o.class;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(baseFinderFeed2, "feed");
        String str = i2 == 1005 ? "2" : WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY;
        if (i2 == 1005) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5 j5Var = (C8777j5) c;
            C54067f0.C0064m mVar = C54067f0.C0064m.MAIN_PAGE_LONG_CLICK;
            C13604l[] lVarArr = new C13604l[2];
            C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
            lVarArr[0] = new C13604l("liveId", String.valueOf(liveInfo != null ? Long.valueOf(liveInfo.f182392d) : null));
            lVarArr[1] = new C13604l("feedId", String.valueOf(baseFinderFeed.mo3513o().getFeedObject().f164794id));
            C8777j5.C8778a.m8607h(j5Var, mVar, C90364q0.m113148g(lVarArr), hj13 != null ? hj13.f134671e : null, String.valueOf(hj13 != null ? Integer.valueOf(hj13.f134675i) : null), (String) null, 16, (Object) null);
        } else {
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            C8777j5 j5Var2 = (C8777j5) c2;
            C54067f0.C0064m mVar2 = C54067f0.C0064m.SQUARE_PAGE_LONG_CLICK;
            C13604l[] lVarArr2 = new C13604l[2];
            C64273c21 liveInfo2 = baseFinderFeed.mo3513o().getLiveInfo();
            lVarArr2[0] = new C13604l("liveId", String.valueOf(liveInfo2 != null ? Long.valueOf(liveInfo2.f182392d) : null));
            lVarArr2[1] = new C13604l("feedId", String.valueOf(baseFinderFeed.mo3513o().getFeedObject().f164794id));
            C8777j5.C8778a.m8607h(j5Var2, mVar2, C90364q0.m113148g(lVarArr2), hj13 != null ? hj13.f134671e : null, String.valueOf(hj13 != null ? Integer.valueOf(hj13.f134675i) : null), (String) null, 16, (Object) null);
        }
        C8479f0 f0Var = new C8479f0();
        C8479f0 f0Var2 = new C8479f0();
        T Ct0 = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0();
        f0Var2.f27484d = Ct0;
        ((C15133e0) Ct0).hw0();
        if (f0Var.f27484d == null) {
            T nVar = new C77407n(context2, 0, true);
            f0Var.f27484d = nVar;
            C77407n nVar2 = (C77407n) nVar;
            nVar.f225779n1 = false;
            C77407n nVar3 = (C77407n) nVar;
            nVar.f225775k1 = true;
        }
        T t = f0Var.f27484d;
        ((C77407n) t).f225792t1 = false;
        ((C77407n) t).mo107567l((View) null);
        T t2 = f0Var.f27484d;
        C77407n nVar4 = (C77407n) t2;
        C87412m.m108594g(nVar4, "sheet");
        ((C77407n) t2).f225771i = new C62063g(baseFinderFeed2, context2, nVar4);
        T t3 = f0Var.f27484d;
        ((C77407n) t3).f225773j = new C11462k(baseFinderFeed2, i2, context2, hj13);
        ((C77407n) t3).f225778n = new C62056o(baseFinderFeed2, f0Var, f0Var2, context2);
        ((C77407n) t3).f225782p = new C11450p(context, baseFinderFeed, str, f0Var, f0Var2);
        ((C77407n) t3).f225787r = new C11452q(baseFinderFeed, i, hj12, context, f0Var, aVar);
        ((C77407n) t3).f225789s = new C11454r(f0Var2, baseFinderFeed, context, f0Var, str);
        ((C77407n) t3).f225791t = new C11456s(f0Var, f0Var2);
        C77407n nVar5 = (C77407n) t3;
        if (nVar5 != null) {
            nVar5.f225761d = new C11457t(f0Var2, f0Var);
        }
        return (C77407n) t3;
    }

    /* renamed from: B1 */
    public final void mo86993B1(C45795b bVar, String str, C32226l<? super C49778i01, C13598b0> lVar) {
        C87412m.m108594g(bVar, "buContext");
        Log.m105924i("FinderLiveUtil", "[preLoadLeadComponnentList] tag = " + str);
        C53895h.m60466d(bVar.f123702i, C53872d1.f151119c, (C53934p0) null, new C47383y(bVar, str, lVar, (C15601d<? super C47383y>) null), 2, (Object) null);
    }

    /* renamed from: C */
    public final boolean mo86994C() {
        if (!C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_ACCOUNT_LIVE_HAS_SING_SONG_ABILITY_SETTING_BOOLEAN_SYNC, false)) {
            C32444a aVar = C32444a.f86121a;
            return C32444a.f86189r.mo60266n().intValue() == 1;
        }
    }

    /* renamed from: C0 */
    public final String mo86995C0(C64756up2 up22) {
        C87412m.m108594g(up22, "<this>");
        int i = up22.f185784f;
        if (i == 0) {
            String str = up22.f185782d;
            return str == null ? "" : str;
        } else if (i != 1) {
            return "";
        } else {
            C64274c60 c602 = up22.f185783e;
            String str2 = c602 != null ? c602.f182416e : null;
            return str2 == null ? "" : str2;
        }
    }

    /* renamed from: C1 */
    public final void mo86996C1(MMActivity mMActivity, C45795b bVar, C52312zv0 zv02, C32224a<C13598b0> aVar) {
        MMActivity mMActivity2 = mMActivity;
        C45795b bVar2 = bVar;
        C52312zv0 zv03 = zv02;
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        C87412m.m108594g(mMActivity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bVar2, "liveData");
        boolean z = true;
        if (!(mMActivity2 instanceof FinderGameLivePostUI)) {
            if (!mo87073d1(bVar2)) {
                if (!(C60251a.f171781k1 != null)) {
                    if (!(C54655b.f153178f1 != null)) {
                        return;
                    }
                }
            }
        }
        Integer num = null;
        LinkedList<Integer> linkedList = zv03 != null ? zv03.f146240d : null;
        if (!(linkedList == null || linkedList.isEmpty())) {
            LinkedList<Integer> linkedList2 = ((C54991o) bVar2.mo71262a(cls2)).f154232N2.f153468e;
            if (linkedList2 != null && !linkedList2.isEmpty()) {
                z = false;
            }
            if (z) {
                C54754f fVar = ((C54991o) bVar2.mo71262a(cls2)).f154232N2;
                LinkedList<Integer> linkedList3 = zv03 != null ? zv03.f146240d : null;
                int i = ((C54991o) bVar2.mo71262a(cls2)).f154295b1;
                fVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("initSongId liveStatus:");
                sb.append(i);
                sb.append(", size:");
                if (linkedList3 != null) {
                    num = Integer.valueOf(linkedList3.size());
                }
                sb.append(num);
                sb.append(", curPlayPos:");
                sb.append(fVar.f153467d);
                Log.m105924i("FinderLiveAnchorMusicData", sb.toString());
                if (linkedList3 != null) {
                    fVar.f153468e = linkedList3;
                }
                LinkedList<Integer> f = ((C54991o) bVar2.mo71262a(cls2)).f154232N2.mo75649f(false);
                Log.m105924i("FinderLiveUtil", "prepareAnchorMusicInfo udpateMusicList:" + f);
                if (f != null) {
                    new C45395w(((C55001u) bVar2.mo71262a(cls)).f154420q.f182392d, ((C55001u) bVar2.mo71262a(cls)).f154417n, C66785b.f191882e.mo90662O5(), ((C55001u) bVar2.mo71262a(cls)).f154416j, 1, f, new C62061z(bVar2, aVar)).mo9225i().mo11397F(mMActivity2);
                }
            }
        }
    }

    /* renamed from: D0 */
    public final String mo86997D0(String str, int i, boolean z) {
        C87412m.m108594g(str, "msg");
        String h = C45078p0.m49929h(str, i);
        if (!z || str.length() <= h.length()) {
            C87412m.m108593f(h, "{\n            subString\n        }");
            return h;
        }
        return h + "...";
    }

    /* renamed from: D1 */
    public final void mo86998D1(String str, String str2) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "msg");
        if (C58739j4.f168176a.mo83692U()) {
            Log.m105924i(str + "(Debug)", str2);
        }
    }

    /* renamed from: E */
    public final boolean mo86999E(ImageView imageView, String str, int i, int i2) {
        C87412m.m108594g(imageView, "imageView");
        C87412m.m108594g(str, "path");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = BitmapUtil.calculateInSampleSize(options.outWidth, options.outHeight, i, i2);
        options.inJustDecodeBounds = false;
        options.inMutable = true;
        Bitmap d = MMBitmapFactory.m98735d(str, options);
        imageView.setImageBitmap(d);
        return d != null;
    }

    /* renamed from: E0 */
    public final String mo87000E0(C45795b bVar, Long l) {
        String str;
        Class cls = C54991o.class;
        C87412m.m108594g(bVar, "buContext");
        String str2 = ((C54991o) bVar.mo71262a(cls)).f154357q3;
        if (str2 != null) {
            return str2;
        }
        if (l != null) {
            str = ((C54991o) bVar.mo71262a(cls)).f154361r3.get(Long.valueOf(l.longValue()));
        } else {
            str = null;
        }
        return str;
    }

    /* renamed from: E1 */
    public final void mo87001E1(String str, String str2) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "msg");
        if (C58739j4.f168176a.mo83692U()) {
            Log.printInfoStack(str, str2, new Object[0]);
        } else {
            Log.m105924i(str, str2);
        }
    }

    /* renamed from: F */
    public final void mo87002F(Context context, C45795b bVar, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "data");
        String str = ((C0654b) bVar.mo71262a(C0654b.class)).f1545g;
        if (!(str.length() > 0)) {
            str = null;
        }
        String str2 = str;
        if (str2 != null) {
            C15130a aVar = new C15130a();
            aVar.f41257b = 215;
            aVar.f41260e = 1;
            aVar.f41261f = false;
            aVar.f41258c = String.valueOf(((C55001u) bVar.mo71262a(C55001u.class)).f154420q.f182392d);
            ((C78545b) ((C15140v) C86312j.m106911c(C15140v.class)).mo14099ne(context, str2, 215, true, new C11449m(lVar), aVar)).mo108519f();
        }
    }

    /* renamed from: F0 */
    public final void mo87003F0(Context context, C45795b bVar, long j, C64370fp1 fp12, int i, String str, String str2) {
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(fp12, "productInfo");
        C87412m.m108594g(str, "session");
        C87412m.m108594g(str2, "jumpId");
        C8479f0 f0Var = new C8479f0();
        C0001s1 s1Var = C0001s1.f0d;
        C53896h0 h0Var = C53872d1.f151117a;
        C53973z1 d = C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C11458v(f0Var, context2, (C15601d<? super C11458v>) null), 2, (Object) null);
        FinderLiveService.f159376d.getClass();
        C54795n5 n5Var = FinderLiveService.f159396y;
        if (n5Var != null) {
            n5Var.mo75739i((MMActivity) context2, j, new C62058u(d, f0Var, str, fp12, i, bVar, j, str2, context));
        }
    }

    /* renamed from: F1 */
    public final String mo87004F1(String str, LinkedList<C64373fs0> linkedList, int i, long j) {
        C87412m.m108594g(str, "prefix");
        C87412m.m108594g(linkedList, "visitorRoleList");
        StringBuilder sb = new StringBuilder("[printVisitorRoleInfo]" + str + ":curVisitorRoleType:" + i + ";visitorRoleModifyTime:" + j + ';');
        synchronized (linkedList) {
            int i2 = 0;
            for (T next : linkedList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append('[');
                    sb4.append(i2);
                    sb4.append(XVFSFile.PATH_SEPARATOR_CHAR);
                    sb4.append(C61937h.m72709h((C64373fs0) next));
                    sb4.append(']');
                    sb.append(sb4.toString());
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "msg.toString()");
        return sb5;
    }

    /* renamed from: G */
    public final String mo87005G(long j) {
        if (LocaleUtil.isChineseAppLang()) {
            float f = (float) j;
            if (f < 10000.0f) {
                try {
                    return String.valueOf(j);
                } catch (Exception e) {
                    Log.m105924i("FinderLiveUtil", "[formatNumber] errMsg:" + e.getMessage());
                    return "";
                }
            } else if (f < 10000.0f || f >= 1.0E8f) {
                float floatValue = new BigDecimal(((double) j) / ((double) 1.0E8f)).setScale(2, 4).floatValue();
                if (floatValue % ((float) 1) == 0.0f) {
                    String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.efn);
                    C87412m.m108593f(string, "getContext().resources.g…mber_more_than_100000000)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf((int) floatValue)}, 1));
                    C87412m.m108593f(format, "format(format, *args)");
                    return format;
                }
                String string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.m4e);
                C87412m.m108593f(string2, "getContext().resources.g…r_more_than_100000000_v3)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{Float.valueOf(floatValue)}, 1));
                C87412m.m108593f(format2, "format(format, *args)");
                return format2;
            } else {
                float floatValue2 = new BigDecimal(((double) j) / ((double) 10000.0f)).setScale(1, 4).floatValue();
                if (floatValue2 % ((float) 1) == 0.0f) {
                    String string3 = MMApplicationContext.getContext().getResources().getString(C0966R.string.efl);
                    C87412m.m108593f(string3, "getContext().resources.g…ng.finder_number_10000_w)");
                    String format3 = String.format(string3, Arrays.copyOf(new Object[]{Integer.valueOf((int) floatValue2)}, 1));
                    C87412m.m108593f(format3, "format(format, *args)");
                    return format3;
                }
                String string4 = MMApplicationContext.getContext().getResources().getString(C0966R.string.efi);
                C87412m.m108593f(string4, "getContext().resources.g…ring.finder_number_10000)");
                String format4 = String.format(string4, Arrays.copyOf(new Object[]{Float.valueOf(floatValue2)}, 1));
                C87412m.m108593f(format4, "format(format, *args)");
                return format4;
            }
        } else {
            float f2 = (float) j;
            if (f2 < 1000.0f) {
                return String.valueOf(j);
            }
            if (f2 >= 1000.0f && f2 < 1000000.0f) {
                float floatValue3 = new BigDecimal(((double) j) / ((double) 1000.0f)).setScale(1, 4).floatValue();
                if (floatValue3 % ((float) 1) == 0.0f) {
                    String string5 = MMApplicationContext.getContext().getResources().getString(C0966R.string.jsn);
                    C87412m.m108593f(string5, "getContext().resources.g…finder_number_10000_w_en)");
                    String format5 = String.format(string5, Arrays.copyOf(new Object[]{Integer.valueOf((int) floatValue3)}, 1));
                    C87412m.m108593f(format5, "format(format, *args)");
                    return format5;
                }
                String string6 = MMApplicationContext.getContext().getResources().getString(C0966R.string.efk);
                C87412m.m108593f(string6, "getContext().resources.g…g.finder_number_10000_en)");
                String format6 = String.format(string6, Arrays.copyOf(new Object[]{Float.valueOf(floatValue3)}, 1));
                C87412m.m108593f(format6, "format(format, *args)");
                return format6;
            } else if (f2 < 1000000.0f || f2 >= 1.0E9f) {
                float floatValue4 = new BigDecimal(((double) j) / ((double) 1.0E9f)).setScale(1, 4).floatValue();
                if (floatValue4 % ((float) 1) == 0.0f) {
                    String string7 = MMApplicationContext.getContext().getResources().getString(C0966R.string.jsp);
                    C87412m.m108593f(string7, "getContext().resources.g…_more_than_billion_en_v3)");
                    String format7 = String.format(string7, Arrays.copyOf(new Object[]{Integer.valueOf((int) floatValue4)}, 1));
                    C87412m.m108593f(format7, "format(format, *args)");
                    return format7;
                }
                String string8 = MMApplicationContext.getContext().getResources().getString(C0966R.string.m4f);
                C87412m.m108593f(string8, "getContext().resources.g…_more_than_billion_en_v2)");
                String format8 = String.format(string8, Arrays.copyOf(new Object[]{Float.valueOf(floatValue4)}, 1));
                C87412m.m108593f(format8, "format(format, *args)");
                return format8;
            } else {
                float floatValue5 = new BigDecimal(((double) j) / ((double) 1000000.0f)).setScale(1, 4).floatValue();
                if (floatValue5 % ((float) 1) == 0.0f) {
                    String string9 = MMApplicationContext.getContext().getResources().getString(C0966R.string.efo);
                    C87412m.m108593f(string9, "getContext().resources.g…r_more_than_100000000_en)");
                    String format9 = String.format(string9, Arrays.copyOf(new Object[]{Integer.valueOf((int) floatValue5)}, 1));
                    C87412m.m108593f(format9, "format(format, *args)");
                    return format9;
                }
                String string10 = MMApplicationContext.getContext().getResources().getString(C0966R.string.efp);
                C87412m.m108593f(string10, "getContext().resources.g…ore_than_100000000_en_v2)");
                String format10 = String.format(string10, Arrays.copyOf(new Object[]{Float.valueOf(floatValue5)}, 1));
                C87412m.m108593f(format10, "format(format, *args)");
                return format10;
            }
        }
    }

    /* renamed from: G0 */
    public final void mo87006G0(Activity activity, int i) {
        C87412m.m108594g(activity, "mActivity");
        if (!C86709a0.m107535s().mo121147n()) {
            C76912y0.m92771j(activity, (View) null);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("key_edit_video_max_time_length", 10);
        intent.putExtra("gallery_report_tag", 34);
        intent.putExtra("key_check_third_party_video", true);
        intent.putExtra("record_video_is_sight_capture", true);
        intent.putExtra("max_select_count", 1);
        intent.putExtra("query_source_type", 34);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("show_header_view", false);
        intent.addFlags(67108864);
        intent.setClassName(activity, "com.tencent.mm.plugin.finder.feed.ui.FinderLiveAudioBgAlbumUI");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "goSelectBg", "(Landroid/app/Activity;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x04b9  */
    /* renamed from: G1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87007G1(android.view.View r29, ig1.C8916d r30) {
        /*
            r28 = this;
            r9 = r29
            r10 = r30
            java.lang.String r0 = "tagView"
            gy3.C87412m.m108594g(r9, r0)
            r0 = 2131303648(0x7f091ce0, float:1.8225416E38)
            android.view.View r0 = r9.findViewById(r0)
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 2131303650(0x7f091ce2, float:1.822542E38)
            android.view.View r12 = r9.findViewById(r0)
            r13 = 8
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r15 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            if (r11 == 0) goto L_0x06b8
            if (r12 == 0) goto L_0x06b8
            if (r10 == 0) goto L_0x06b8
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r7.mo10233c(r8)
            java.lang.Object[] r2 = r7.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "refreshGiftTagView"
            java.lang.String r5 = "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r1 = r29
            r13 = r7
            r7 = r16
            r18 = r8
            r8 = r17
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r13.mo10231a(r15)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r9.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "refreshGiftTagView"
            java.lang.String r4 = "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r29
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            int r13 = r10.field_globalUnlockLevel
            boolean r1 = r30.mo9723n2()
            r2 = 2131232652(0x7f08078c, float:1.808142E38)
            r3 = 1050253722(0x3e99999a, float:0.3)
            r4 = 2131232651(0x7f08078b, float:1.8081417E38)
            r5 = 1065353216(0x3f800000, float:1.0)
            r8 = 2131827532(0x7f111b4c, float:1.928798E38)
            if (r1 == 0) goto L_0x03a1
            ok1.e r1 = f176370a
            r1.getClass()
            int r13 = r10.field_unlockIntimacyLevel
            int r1 = r10.field_flag
            r6 = 4
            boolean r10 = o40.C61926c.m72696u(r1, r6)
            te3.mc0 r1 = cj1.C0639y1.f1523n
            if (r1 == 0) goto L_0x009d
            int r1 = r1.f137947d
            goto L_0x009e
        L_0x009d:
            r1 = 0
        L_0x009e:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r6 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.x> r7 = cl1.C0696x.class
            androidx.lifecycle.i0 r6 = r6.mo77630e(r7)
            cl1.x r6 = (cl1.C0696x) r6
            if (r6 == 0) goto L_0x00ad
            boolean r6 = r6.f1643f
            goto L_0x00ae
        L_0x00ad:
            r6 = 0
        L_0x00ae:
            r7 = 2131827530(0x7f111b4a, float:1.9287975E38)
            if (r6 == 0) goto L_0x02dd
            if (r10 == 0) goto L_0x0191
            android.content.Context r1 = r29.getContext()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r9.setBackground(r1)
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            r10.mo10233c(r1)
            java.lang.Object[] r2 = r10.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleFansTag"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r8 = "setAlpha"
            java.lang.String r13 = "(F)V"
            r1 = r29
            r7 = r8
            r8 = r13
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r10.mo10231a(r15)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r9.setAlpha(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "handleFansTag"
            java.lang.String r4 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            r1 = r29
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            android.view.View r0 = r9.findViewById(r0)
            if (r0 != 0) goto L_0x010a
            goto L_0x0145
        L_0x010a:
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r14)
            java.lang.Object[] r21 = r1.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r23 = "handleFansTag"
            java.lang.String r24 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r0
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r1 = r1.mo10231a(r15)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r21 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r22 = "handleFansTag"
            java.lang.String r23 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
        L_0x0145:
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r14)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleFansTag"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r12
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r15)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "handleFansTag"
            java.lang.String r4 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            android.content.Context r0 = r29.getContext()
            r8 = 2131827530(0x7f111b4a, float:1.9287975E38)
            java.lang.String r0 = r0.getString(r8)
            r11.setText(r0)
            r19 = r14
            goto L_0x039d
        L_0x0191:
            if (r1 < r13) goto L_0x0195
            r10 = 1
            goto L_0x0196
        L_0x0195:
            r10 = 0
        L_0x0196:
            r1 = r10 ^ 1
            if (r1 == 0) goto L_0x01e7
            android.content.Context r0 = r29.getContext()
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r4)
            r9.setBackground(r0)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            r0.mo10233c(r1)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleFansTag"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setAlpha"
            java.lang.String r17 = "(F)V"
            r1 = r29
            r8 = r17
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r15)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r9.setAlpha(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "handleFansTag"
            java.lang.String r4 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x023d
        L_0x01e7:
            android.content.Context r1 = r29.getContext()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r9.setBackground(r1)
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            r8.mo10233c(r1)
            java.lang.Object[] r2 = r8.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleFansTag"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setAlpha"
            java.lang.String r16 = "(F)V"
            r1 = r29
            r0 = r8
            r8 = r16
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r15)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r9.setAlpha(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "handleFansTag"
            java.lang.String r4 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r0 = 2131303650(0x7f091ce2, float:1.822542E38)
            android.view.View r0 = r9.findViewById(r0)
            if (r0 != 0) goto L_0x0240
        L_0x023d:
            r19 = r14
            goto L_0x0280
        L_0x0240:
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r14)
            java.lang.Object[] r2 = r8.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleFansTag"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r1 = r0
            r19 = r14
            r14 = r8
            r8 = r16
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r14.mo10231a(r15)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "handleFansTag"
            java.lang.String r4 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x0280:
            android.content.Context r0 = r29.getContext()
            r14 = 1
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1[r15] = r2
            r7 = 2131827532(0x7f111b4c, float:1.928798E38)
            java.lang.String r0 = r0.getString(r7, r1)
            r11.setText(r0)
            if (r10 == 0) goto L_0x029c
            r13 = 8
            goto L_0x029d
        L_0x029c:
            r13 = 0
        L_0x029d:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0.mo10233c(r1)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleFansTag"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r12
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r15)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "handleFansTag"
            java.lang.String r4 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x039d
        L_0x02dd:
            r19 = r14
            r7 = 2131827532(0x7f111b4c, float:1.928798E38)
            r8 = 2131827530(0x7f111b4a, float:1.9287975E38)
            r14 = 1
            android.content.Context r0 = r29.getContext()
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r4)
            r9.setBackground(r0)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            r0.mo10233c(r1)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleFansTag"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r16 = "setAlpha"
            java.lang.String r17 = "(F)V"
            r1 = r29
            r7 = r16
            r14 = 2131827530(0x7f111b4a, float:1.9287975E38)
            r8 = r17
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r15)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r9.setAlpha(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "handleFansTag"
            java.lang.String r4 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            if (r10 == 0) goto L_0x0342
            android.content.Context r0 = r29.getContext()
            java.lang.String r0 = r0.getString(r14)
            goto L_0x0356
        L_0x0342:
            android.content.Context r0 = r29.getContext()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1[r15] = r2
            r14 = 2131827532(0x7f111b4c, float:1.928798E38)
            java.lang.String r0 = r0.getString(r14, r1)
        L_0x0356:
            r11.setText(r0)
            if (r10 == 0) goto L_0x035e
            r13 = 8
            goto L_0x035f
        L_0x035e:
            r13 = 0
        L_0x035f:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0.mo10233c(r1)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleFansTag"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r12
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r15)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "handleFansTag"
            java.lang.String r4 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x039d:
            r13 = r19
            goto L_0x06b5
        L_0x03a1:
            r19 = r14
            r14 = 2131827532(0x7f111b4c, float:1.928798E38)
            if (r13 <= 0) goto L_0x04fb
            ok1.e r0 = f176370a
            r0.getClass()
            te3.x11 r0 = cj1.C0639y1.f1522m
            if (r0 == 0) goto L_0x03b4
            int r0 = r0.f144398d
            goto L_0x03b5
        L_0x03b4:
            r0 = 0
        L_0x03b5:
            if (r0 < r13) goto L_0x03b9
            r0 = 1
            goto L_0x03ba
        L_0x03b9:
            r0 = 0
        L_0x03ba:
            r1 = r0 ^ 1
            if (r1 == 0) goto L_0x040b
            android.content.Context r1 = r29.getContext()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r4)
            r9.setBackground(r1)
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            r10.mo10233c(r1)
            java.lang.Object[] r2 = r10.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleRewardTag"
            java.lang.String r5 = "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setAlpha"
            java.lang.String r8 = "(F)V"
            r1 = r29
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r10.mo10231a(r15)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r9.setAlpha(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "handleRewardTag"
            java.lang.String r4 = "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            r1 = r29
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0460
        L_0x040b:
            android.content.Context r1 = r29.getContext()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r9.setBackground(r1)
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            r10.mo10233c(r1)
            java.lang.Object[] r2 = r10.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleRewardTag"
            java.lang.String r5 = "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setAlpha"
            java.lang.String r8 = "(F)V"
            r1 = r29
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r10.mo10231a(r15)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r9.setAlpha(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "handleRewardTag"
            java.lang.String r4 = "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            r1 = r29
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r1 = 2131303650(0x7f091ce2, float:1.822542E38)
            android.view.View r2 = r9.findViewById(r1)
            if (r2 != 0) goto L_0x0463
        L_0x0460:
            r10 = r19
            goto L_0x04a0
        L_0x0463:
            k20.a r1 = new k20.a
            r1.<init>()
            r10 = r19
            r1.mo10233c(r10)
            java.lang.Object[] r21 = r1.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r23 = "handleRewardTag"
            java.lang.String r24 = "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r2
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r1 = r1.mo10231a(r15)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setVisibility(r1)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleRewardTag"
            java.lang.String r5 = "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x04a0:
            android.content.Context r1 = r29.getContext()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r2[r15] = r3
            java.lang.String r1 = r1.getString(r14, r2)
            r11.setText(r1)
            if (r0 == 0) goto L_0x04b9
            r13 = 8
            goto L_0x04ba
        L_0x04b9:
            r13 = 0
        L_0x04ba:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0.mo10233c(r1)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleRewardTag"
            java.lang.String r5 = "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r12
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r15)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "handleRewardTag"
            java.lang.String r4 = "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r13 = r10
            goto L_0x06b5
        L_0x04fb:
            r13 = r19
            java.lang.String r0 = r10.field_tagText
            if (r0 == 0) goto L_0x050a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0508
            goto L_0x050a
        L_0x0508:
            r7 = 0
            goto L_0x050b
        L_0x050a:
            r7 = 1
        L_0x050b:
            if (r7 != 0) goto L_0x05cc
            ok1.e r0 = f176370a
            r0.getClass()
            android.content.Context r0 = r29.getContext()
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r4)
            r9.setBackground(r0)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            r0.mo10233c(r1)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleGiftTag"
            java.lang.String r5 = "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/widget/TextView;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setAlpha"
            java.lang.String r8 = "(F)V"
            r1 = r29
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r15)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r9.setAlpha(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "handleGiftTag"
            java.lang.String r4 = "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/widget/TextView;Landroid/view/View;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = r10.field_tagColor     // Catch:{ Exception -> 0x0566 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x0566 }
            r9.setBackgroundColor(r0)     // Catch:{ Exception -> 0x0566 }
            goto L_0x058b
        L_0x0566:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "e.msg = "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = ", giftInfo.field_tagColor = "
            r1.append(r0)
            java.lang.String r0 = r10.field_tagColor
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "FinderLiveUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x058b:
            java.lang.String r0 = r10.field_tagText
            r11.setText(r0)
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r13)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleGiftTag"
            java.lang.String r5 = "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/widget/TextView;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r12
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r15)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "handleGiftTag"
            java.lang.String r4 = "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/widget/TextView;Landroid/view/View;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x06b5
        L_0x05cc:
            int r0 = r10.field_flag
            r1 = 64
            boolean r0 = o40.C61926c.m72696u(r0, r1)
            if (r0 == 0) goto L_0x067a
            int r0 = r10.field_needUnlock
            r1 = 1
            if (r0 != r1) goto L_0x05dd
            r7 = 1
            goto L_0x05de
        L_0x05dd:
            r7 = 0
        L_0x05de:
            if (r7 == 0) goto L_0x067a
            ok1.e r0 = f176370a
            r0.getClass()
            android.content.Context r0 = r29.getContext()
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r4)
            r9.setBackground(r0)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            r0.mo10233c(r1)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleUnLockGiftTag"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setAlpha"
            java.lang.String r8 = "(F)V"
            r1 = r29
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r15)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r9.setAlpha(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "handleUnLockGiftTag"
            java.lang.String r4 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            android.content.Context r0 = r29.getContext()
            r1 = 2131827580(0x7f111b7c, float:1.9288077E38)
            java.lang.String r0 = r0.getString(r1)
            r11.setText(r0)
            k20.a r0 = new k20.a
            r0.<init>()
            r1 = r18
            r0.mo10233c(r1)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "handleUnLockGiftTag"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r12
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r15)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "handleUnLockGiftTag"
            java.lang.String r4 = "(Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x06b5
        L_0x067a:
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r13)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "refreshGiftTagView"
            java.lang.String r5 = "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r29
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r15)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r9.setVisibility(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "refreshGiftTagView"
            java.lang.String r4 = "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x06b5:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x06ba
        L_0x06b8:
            r13 = r14
            r0 = 0
        L_0x06ba:
            if (r0 != 0) goto L_0x06f9
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r0.mo10233c(r13)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r4 = "refreshGiftTagView"
            java.lang.String r5 = "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r29
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r15)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r9.setVisibility(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil"
            java.lang.String r3 = "refreshGiftTagView"
            java.lang.String r4 = "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x06f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.mo87007G1(android.view.View, ig1.d):void");
    }

    /* renamed from: H */
    public final C64414h71 mo87008H(Context context, long j, String str) {
        String str2;
        Integer num;
        Context context2 = context;
        String str3 = str;
        Class cls = C54108o.class;
        Class cls2 = C55001u.class;
        Class cls3 = C60172g4.class;
        Class cls4 = C54116w.class;
        C87412m.m108594g(str3, "tag");
        C64414h71 h712 = new C64414h71();
        if (context2 != null) {
            C39818r rVar = C39818r.f106831a;
            h712.f183424d = ((C60172g4) rVar.mo62443b(context2).mo62447c(cls3)).mo12839E3();
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            h712.f183425e = Wb;
            h712.f183426f = ((C54116w) C86312j.m106911c(cls4)).yx0(j);
            String str4 = ((C54116w) C86312j.m106911c(cls4)).f151927X0;
            h712.f183428h = str4 != null ? C112551y.m153814n(str4, ",", ";", false) : "";
            h712.f183427g = System.currentTimeMillis();
            String z3 = ((C60172g4) rVar.mo62443b(context2).mo62447c(cls3)).mo12868z3();
            C45795b bVar = C45795b.f123698n;
            h712.f183437t = (bVar == null || (num = ((C55001u) bVar.mo71262a(cls2)).f154415i) == null) ? 0 : num.intValue();
            boolean z = true;
            h712.f183429i = z3 == null || z3.length() == 0 ? f176370a.mo87077f0(((C54116w) C86312j.m106911c(cls4)).f151907K, "exposeType") : f176370a.mo87077f0(z3, "exposeType");
            if (!(z3 == null || z3.length() == 0)) {
                z = false;
            }
            h712.f183434q = z ? StringKtKt.safeToInt(f176370a.mo87077f0(((C54116w) C86312j.m106911c(cls4)).f151907K, "main_page_position")) : StringKtKt.safeToInt(f176370a.mo87077f0(z3, "main_page_position"));
            if (!C87412m.m108589b(((C54116w) C86312j.m106911c(cls4)).f151945i, "temp_6") || !C87412m.m108589b(((C61131i) C86312j.m106911c(C61131i.class)).mo86084Y7(), "111")) {
                str2 = ((C61130g) C86312j.m106911c(C61130g.class)).mo33244gK();
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = "temp_7";
            }
            ((C54108o) C86312j.m106911c(cls)).getClass();
            C54067f0 f0Var = C54108o.f151869h;
            ((C54108o) C86312j.m106911c(cls)).getClass();
            h712.f183432o = f0Var.mo74755e(str2, (long) f0Var.f151432N.f151689d);
            h712.f183431n = f176370a.mo87077f0(((C54116w) C86312j.m106911c(cls4)).f151907K, "enter_immerse_type");
            h712.f183443z = str2;
            C45795b bVar2 = C45795b.f123698n;
            long j2 = 0;
            h712.f183433p = bVar2 != null ? ((C55001u) bVar2.mo71262a(cls2)).f154414h : 0;
            Log.m105924i(str3, "FinderLiveCommentScene get " + h712.f183443z + " when genLiveReportObj1 ad_flag: " + h712.f183437t + " main_page_position: " + h712.f183434q);
            try {
                if (C112550d0.m153769E(str2, "temp_", 0, false, 6, (Object) null) != -1) {
                    j2 = Long.parseLong(C112551y.m153814n(str2, "temp_", "", false));
                }
                h712.f183430j = j2;
            } catch (Exception e) {
                Log.m105920e(str3, "genLiveReportObj err:" + e.getMessage());
            }
            ((C66880s0) C39818r.f106831a.mo62443b(context2).mo75002a(C66880s0.class)).mo90878f3(h712);
            FinderLiveService.f159376d.getClass();
            C54129i iVar = FinderLiveService.f159398z;
            if (iVar != null) {
                C54738b1 b1Var = iVar.f151991f;
                C64347eq2 eq22 = b1Var != null ? b1Var.f153411A : null;
                if (eq22 != null) {
                    h712.f183439v = eq22.f183026q;
                }
            }
        }
        Log.m105924i(str3, "enter_icon_type :" + h712.f183432o + " chnl_enter_immerse_type: " + h712.f183431n + " chnl_expose_type: " + h712.f183429i);
        return h712;
    }

    /* renamed from: H0 */
    public final void mo87009H0(Context context, C45795b bVar) {
        Class cls = C55001u.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        Intent intent = new Intent();
        intent.setClass(context, FinderLiveAnchorCommentManagerUI.class);
        intent.putExtra("liveid", ((C55001u) bVar.mo71262a(cls)).f154420q.f182392d);
        intent.putExtra("objectid", ((C55001u) bVar.mo71262a(cls)).f154416j);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "gotoCommentManagerUI", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "gotoCommentManagerUI", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: H1 */
    public final boolean mo87010H1(View view) {
        C87412m.m108594g(view, "child");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        return viewGroup != null;
    }

    /* renamed from: I */
    public final Map<String, Object> mo87011I(C45795b bVar) {
        Class cls = C10383h.class;
        C87412m.m108594g(bVar, "liveData");
        C13604l[] lVarArr = new C13604l[5];
        lVarArr[0] = new C13604l("finder_username", ((C54991o) bVar.mo71262a(C54991o.class)).f154345o);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        String str = "";
        if (Wb == null) {
            Wb = str;
        }
        lVarArr[1] = new C13604l("behaviour_session_id", Wb);
        String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
        if (E == null) {
            E = str;
        }
        lVarArr[2] = new C13604l("finder_context_id", E);
        String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
        if (S0 != null) {
            str = S0;
        }
        lVarArr[3] = new C13604l("finder_tab_context_id", str);
        lVarArr[4] = new C13604l("live_id", Long.valueOf(((C55001u) bVar.mo71262a(C55001u.class)).f154420q.f182392d));
        return C90364q0.m113147f(lVarArr);
    }

    /* renamed from: I0 */
    public final void mo87012I0(Context context, long j, long j2, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str3, "objectNonceId");
        C87412m.m108594g(str4, "username");
        Intent intent = new Intent();
        intent.setClass(context, FinderLiveAnchorCreateVoteUI.class);
        long j3 = j;
        intent.putExtra("finderlivecreateparamliveid", j);
        long j4 = j2;
        intent.putExtra("finderlivecreateparamobjectid", j2);
        intent.putExtra("finderlivecreateparamnonceobjectid", str3);
        intent.putExtra("finderlivecreateparamusername", str4);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "gotoVoteUI", "(Landroid/content/Context;JJLjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "gotoVoteUI", "(Landroid/content/Context;JJLjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: I1 */
    public final void mo87013I1(int i) {
        C104289g gVar = new C104289g();
        gVar.mo145953n("type", i);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.GIFT_PACK_OPT, gVar.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo87014J(java.lang.String r7, java.lang.String r8, wx3.C15601d<? super byte[]> r9) {
        /*
            r6 = this;
            tc2.g r0 = tc2.C118418g.INSTANCE
            wx3.h r1 = new wx3.h
            wx3.d r9 = xx3.C66447b.m78392b(r9)
            r1.<init>(r9)
            r9 = 1
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L_0x003f
            int r4 = r8.length()
            if (r4 <= 0) goto L_0x0018
            r4 = 1
            goto L_0x0019
        L_0x0018:
            r4 = 0
        L_0x0019:
            if (r4 == 0) goto L_0x001d
            r4 = r8
            goto L_0x001e
        L_0x001d:
            r4 = r3
        L_0x001e:
            if (r4 == 0) goto L_0x003f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r8)
            java.util.ArrayList r4 = r0.mo175811Zy(r4)
            java.lang.String r5 = "INSTANCE.getSecSdkImageI…         )\n            })"
            gy3.C87412m.m108593f(r4, r5)
            java.lang.Object r4 = sx3.C110818d0.m150916N(r4)
            java.lang.Object r4 = kotlin.Result.m168114constructorimpl(r4)
            r1.resumeWith(r4)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x0040
        L_0x003f:
            r4 = r3
        L_0x0040:
            if (r4 != 0) goto L_0x00a6
            if (r7 == 0) goto L_0x009c
            int r4 = r7.length()
            if (r4 <= 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r9 = 0
        L_0x004c:
            if (r9 == 0) goto L_0x0050
            r9 = r7
            goto L_0x0051
        L_0x0050:
            r9 = r3
        L_0x0051:
            if (r9 == 0) goto L_0x009c
            pl1.f r9 = new pl1.f
            r4 = 2
            r9.<init>(r7, r3, r4, r3)
            java.lang.String r9 = r9.getPath()
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            if (r4 == 0) goto L_0x0080
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r9)
            java.util.ArrayList r7 = r0.mo175811Zy(r7)
            java.lang.String r8 = "INSTANCE.getSecSdkImageI… )\n                    })"
            gy3.C87412m.m108593f(r7, r8)
            java.lang.Object r7 = sx3.C110818d0.m150916N(r7)
            java.lang.Object r7 = kotlin.Result.m168114constructorimpl(r7)
            r1.resumeWith(r7)
            goto L_0x0099
        L_0x0080:
            gc0.a r0 = gc0.C20828a.m22825b()
            hc0.c$b r4 = new hc0.c$b
            r4.<init>()
            r4.f59350f = r9
            r4.f59346b = r2
            hc0.c r2 = r4.mo32666a()
            ok1.e$n r4 = new ok1.e$n
            r4.<init>(r1, r8, r9)
            r0.mo32515d(r7, r2, r4)
        L_0x0099:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            goto L_0x009d
        L_0x009c:
            r7 = r3
        L_0x009d:
            if (r7 != 0) goto L_0x00a6
            java.lang.Object r7 = kotlin.Result.m168114constructorimpl(r3)
            r1.resumeWith(r7)
        L_0x00a6:
            java.lang.Object r7 = r1.mo90314b()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.mo87014J(java.lang.String, java.lang.String, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87015J0(int r4, int r5, te3.C48779ay0 r6, fy3.C32224a<rx3.C13598b0> r7) {
        /*
            r3 = this;
            ot1.a r0 = ot1.C11767a.f34453a
            boolean r0 = r0.mo11665g(r4, r5, r6)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            if (r7 == 0) goto L_0x000f
            r7.invoke()
        L_0x000f:
            r1 = 1
            goto L_0x0048
        L_0x0011:
            r7 = 4
            if (r4 != r7) goto L_0x0021
            switch(r5) {
                case -200046: goto L_0x0018;
                case -200012: goto L_0x0018;
                case -200011: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0021
        L_0x0018:
            if (r6 == 0) goto L_0x0021
            int r4 = r6.f130840d
            r7 = 2
            if (r4 != r7) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            if (r4 == 0) goto L_0x0048
            if (r6 == 0) goto L_0x000f
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            byte[] r6 = r6.toByteArray()
            java.lang.String r7 = "PARAM_FINDER_LIVE_ERROR_PAGE"
            r4.putByteArray(r7, r6)
            java.lang.String r6 = "PARAM_FINDER_LIVE_ERROR_CODE"
            r4.putInt(r6, r5)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r5.getClass()
            com.tencent.mm.plugin.finder.live.view.b r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r5 == 0) goto L_0x000f
            d60.b$b r6 = d60.C58124b.C58125b.FINDER_LIVE_CREATE_ERROR_PAGE
            r5.statusChange(r6, r4)
            goto L_0x000f
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.mo87015J0(int, int, te3.ay0, fy3.a):boolean");
    }

    /* renamed from: J1 */
    public final void mo87016J1(LinkedList<C64373fs0> linkedList) {
        try {
            C49603gs0 gs02 = new C49603gs0();
            if (linkedList == null) {
                linkedList = new LinkedList<>();
            }
            gs02.f134244d = linkedList;
            byte[] byteArray = gs02.toByteArray();
            C87412m.m108593f(byteArray, "saveList.toByteArray()");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ALIAS_LIST1_STRING_SYNC, new String(byteArray, C119027c.f356489b));
            Log.m105924i("FinderLiveUtil", "saveAliasInfoList cacheListStr:" + C61937h.m72709h(gs02));
        } catch (Exception e) {
            C58739j4 j4Var = C58739j4.f168176a;
            j4Var.mo83712h0(e, "saveAliasInfoList:" + e.getMessage());
        }
    }

    /* renamed from: K */
    public final C86299o mo87017K(C64434i11 i112) {
        String str;
        String str2;
        C64434i11 i113 = i112;
        C86299o oVar = new C86299o();
        if (i113 != null) {
            C50019jp1 jp12 = i113.f183575e;
            String str3 = "";
            if (jp12 == null || (str = jp12.f136237d) == null) {
                str = str3;
            }
            oVar.f250930b = str;
            if (!(jp12 == null || (str2 = jp12.f136238e) == null)) {
                str3 = str2;
            }
            oVar.f250934f = str3;
            C54789l6 l6Var = new C54789l6();
            boolean z = true;
            l6Var.f153585f = 1;
            l6Var.f153593q = 1;
            oVar.f250937i = l6Var;
            oVar.f250939k = f176370a.mo87027N0() ? 1176 : 1177;
            oVar.f250912A = new HalfScreenConfig(true, 10, (HalfScreenConfig.C55451a) null, false, (HalfScreenConfig.BackgroundShapeConfig) null, false, (HalfScreenConfig.CloseWhenClickEmptyAreaConfig) null, (HalfScreenConfig.C55453c) null, false, false, (WeAppHalfScreenStatusChangeListener) null, (HalfScreenConfig.C55456f) null, false, false, (C66117m) null, false, (HalfScreenConfig.ShareActionConfig) null, 0, 0, 0, false, false, false, (HalfScreenConfig.C55455e) null, false, (HalfScreenConfig.CustomSubjectInfo) null, 0, false, false, 0, false, false, false, -4, 1, (C8480h) null);
            C50019jp1 jp13 = i113.f183575e;
            oVar.f250929a = jp13 != null ? jp13.f136239f : null;
            C58739j4 j4Var = C58739j4.f168176a;
            if (j4Var.mo83692U() && !Util.isNullOrNil(oVar.f250929a)) {
                String str4 = oVar.f250929a;
                if (str4 == null || C112551y.m153808h(str4, "@app", false, 2, (Object) null)) {
                    z = false;
                }
                if (z) {
                    oVar.f250929a += "@app";
                }
            }
            oVar.f250931c = j4Var.mo83673A();
        }
        return oVar;
    }

    /* renamed from: K0 */
    public final boolean mo87018K0(C45795b bVar) {
        C87412m.m108594g(bVar, "data");
        if (!((C64916p1) C86312j.m106911c(C64916p1.class)).mo76650AV(((C54991o) bVar.mo71262a(C54991o.class)).f154345o)) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(((C0654b) bVar.mo71262a(C0654b.class)).f1545g);
            return z1Var != null && z1Var.mo62927s3();
        }
    }

    /* renamed from: K1 */
    public final void mo87019K1(LinkedList<C64373fs0> linkedList, int i, long j) {
        mo87016J1(linkedList);
        C66785b bVar = C66785b.f191882e;
        C39758f fVar = new C39758f();
        fVar.f131585i = j;
        fVar.f131584h = i;
        Log.m105924i("FinderLiveUtil", "[saveVisitorRoleInfo] current_alias_role_type:" + fVar.f131584h + ", next_alias_mod_available_time:" + fVar.f131585i);
        bVar.mo90665S0(fVar, C39759i.SAVE_ROLE_CHOOSER);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        Log.m105924i("FinderLiveUtil", mo87004F1("saveVisitorRoleInfo USERINFO_FINDER_LIVE_VISITOR_ROLE_INT_SYNC", linkedList, i, j));
    }

    /* renamed from: L */
    public final String mo87020L(C0581o5 o5Var) {
        FinderContact finderContact;
        C87412m.m108594g(o5Var, "commentData");
        if (!(o5Var instanceof C0537f2) || o5Var.getType() != 20002) {
            return "";
        }
        C49765hx0 hx02 = ((C0537f2) o5Var).f1301a.f144902d;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.nickname;
    }

    /* renamed from: L0 */
    public final void mo87021L0(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            Context context = currentFocus.getContext();
            InputMethodManager inputMethodManager = (InputMethodManager) (context != null ? context.getSystemService("input_method") : null);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            }
        }
    }

    /* renamed from: L1 */
    public final void mo87022L1(AppCompatActivity appCompatActivity, int i, int i2) {
        Window window;
        Log.m105924i("FinderLiveUtil", "activity:" + appCompatActivity + " set flag:" + i + " mask:" + i2);
        if (appCompatActivity != null && (window = appCompatActivity.getWindow()) != null) {
            window.setFlags(i, i2);
        }
    }

    /* renamed from: M */
    public final int mo87023M(LinkedList<C48770aw0> linkedList) {
        T t;
        if (linkedList != null) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                boolean z = true;
                if (((C48770aw0) t).f130789d != 1) {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C48770aw0 aw02 = (C48770aw0) t;
            if (aw02 != null) {
                return aw02.f130791f;
            }
        }
        return -1;
    }

    /* renamed from: M0 */
    public final boolean mo87024M0(C45795b bVar) {
        C87412m.m108594g(bVar, "liveData");
        if (mo87073d1(bVar)) {
            return (((C55001u) bVar.mo71262a(C55001u.class)).f154420q.f182405s == 1) && ((C54991o) bVar.mo71262a(C54991o.class)).mo75999e4();
        }
    }

    /* renamed from: M1 */
    public final void mo87025M1(TextView textView, boolean z, boolean z2) {
        C87412m.m108594g(textView, "btn");
        if (z) {
            if (C85875k4.m106211z() || z2) {
                textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            } else {
                textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.f2975b6));
            }
        } else if (C85875k4.m106211z() || z2) {
            textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_2));
        } else {
            textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
        }
    }

    /* renamed from: N */
    public final String mo87026N(LinkedList<C48770aw0> linkedList) {
        T t;
        boolean z;
        String str = null;
        if (linkedList != null) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C48770aw0) t).f130789d == 3) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C48770aw0 aw02 = (C48770aw0) t;
            if (aw02 != null) {
                str = aw02.f130793h;
            }
        }
        return str == null ? "" : str;
    }

    /* renamed from: N0 */
    public final boolean mo87027N0() {
        if (C54655b.f153178f1 != null) {
            return true;
        }
        return C60251a.f171781k1 != null;
    }

    /* renamed from: N1 */
    public final void mo87028N1(EditText editText, TextView textView, int i, int i2, boolean z, C32224a<C13598b0> aVar) {
        InputFilter[] inputFilterArr = {new C11432b0(editText), new C11437c0(i, C45078p0.C45079a.MODE_CHINESE_AS_2)};
        if (!z) {
            inputFilterArr[0] = new C11430a0(Pattern.compile("[^a-zA-Z0-9一-龥_]"));
        }
        if (editText != null) {
            editText.setFilters(inputFilterArr);
        }
        C11439d0 d0Var = new C11439d0(textView, i2, aVar);
        if (editText != null) {
            editText.addTextChangedListener(d0Var);
        }
    }

    /* renamed from: O */
    public final Integer mo87029O() {
        Object systemService = MMApplicationContext.getContext().getSystemService("batterymanager");
        BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
        return Integer.valueOf(batteryManager != null ? batteryManager.getIntProperty(4) : 0);
    }

    /* renamed from: O0 */
    public final boolean mo87030O0() {
        return C54655b.f153178f1 != null;
    }

    /* renamed from: P */
    public final int mo87031P(C45795b bVar) {
        C87412m.m108594g(bVar, "buContext");
        if (mo87027N0()) {
            return 1;
        }
        return ((C54991o) bVar.mo71262a(C54991o.class)).f154190D ? 3 : 2;
    }

    /* renamed from: P0 */
    public final boolean mo87032P0(C45795b bVar) {
        C87412m.m108594g(bVar, "liveData");
        return f176370a.mo87027N0() || ((C54991o) bVar.mo71262a(C54991o.class)).f154190D;
    }

    /* renamed from: P1 */
    public final void mo87033P1(TextView textView) {
        C87412m.m108594g(textView, "tv");
        try {
            textView.setTypeface(Typeface.createFromAsset(MMApplicationContext.getContext().getAssets(), "fonts/SF-Pro-Display-BoldItalic.otf"));
        } catch (Exception e) {
            Log.m105920e("FinderLiveUtil", "setTypeface() Exception:" + e.getMessage());
        }
    }

    /* renamed from: Q */
    public final TXLivePlayConfig mo87034Q() {
        return C58739j4.m68256z(C58739j4.f168176a, false, 0, 3, (Object) null);
    }

    /* renamed from: Q0 */
    public final boolean mo87035Q0(C45795b bVar) {
        C87412m.m108594g(bVar, "liveData");
        return mo87027N0() && ((C54991o) bVar.mo71262a(C54991o.class)).f154301c3;
    }

    /* renamed from: R */
    public final int mo87036R() {
        C64373fs0 U3;
        Class cls = C54991o.class;
        if (mo87027N0()) {
            return 3;
        }
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C54991o oVar = (C54991o) finderLiveService.mo77630e(cls);
        boolean z = false;
        if (oVar != null && oVar.f154190D) {
            z = true;
        }
        if (z) {
            return 1;
        }
        C54991o oVar2 = (C54991o) finderLiveService.mo77630e(cls);
        if (oVar2 == null || (U3 = oVar2.mo75986U3()) == null) {
            return 4;
        }
        return U3.f183215f;
    }

    /* renamed from: R0 */
    public final boolean mo87037R0(C49765hx0 hx02) {
        LinkedList<C48770aw0> linkedList = hx02 != null ? hx02.f134930r : null;
        if (linkedList == null) {
            return false;
        }
        for (C48770aw0 aw02 : linkedList) {
            if (aw02.f130789d == 5) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: R1 */
    public final void mo87038R1(C54408d dVar) {
        if (C58739j4.f168176a.mo83692U() && dVar != null) {
            C37521f.f99374d.getClass();
            dVar.mo75214J(C37521f.f99442k6.mo60266n().intValue());
        }
    }

    /* renamed from: S */
    public final boolean mo87039S() {
        return ((Boolean) ((C36570n) f176373d).getValue()).booleanValue();
    }

    /* renamed from: S0 */
    public final boolean mo87040S0(C45795b bVar) {
        return !C61926c.m72696u(bVar != null ? ((C54991o) bVar.mo71262a(C54991o.class)).f154354q : 0, 8);
    }

    /* renamed from: S1 */
    public final void mo87041S1(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "msg");
        if (C58739j4.f168176a.mo83692U()) {
            C61926c.m72668M(new C11441e0(context, str));
        } else {
            Log.m105924i("FinderLiveUtil", str);
        }
    }

    /* renamed from: T */
    public final String mo87042T(Context context) {
        byte[] bArr;
        String str;
        C87412m.m108594g(context, "context");
        C89349b bVar = ((C66880s0) C39818r.f106831a.mo62443b(context).mo75002a(C66880s0.class)).f192138h;
        if (bVar != null) {
            bArr = bVar.mo123703f();
        } else {
            FinderLiveService.f159376d.getClass();
            C45795b bVar2 = FinderLiveService.f159348A;
            if (bVar2 == null || (str = ((C54991o) bVar2.mo71262a(C54991o.class)).f154357q3) == null) {
                str = "";
            }
            byte[] bytes = str.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            int length = bytes.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bytes, 0, bArr2, 0, length);
            int length2 = bArr2.length;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr2, 0, bArr3, 0, length2);
            bArr = bArr3;
        }
        String encode = URLEncoder.encode(new String(bArr, C119027c.f356488a));
        C87412m.m108593f(encode, "encode(uxInfo)");
        return encode;
    }

    /* renamed from: T0 */
    public final boolean mo87043T0(C45795b bVar) {
        C87412m.m108594g(bVar, "buContext");
        boolean u = C61926c.m72696u(((C54991o) bVar.mo71262a(C54991o.class)).f154388y0, 2097152);
        Log.m105924i("FinderLiveUtil", "[isDisableComment] isDisable = " + u);
        return u;
    }

    /* renamed from: T1 */
    public final void mo87044T1(Context context, C49747hs1 hs12, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(hs12, "switchInfo");
        C87412m.m108594g(lVar, "callback");
        C4191v0 v0Var = new C4191v0(context);
        v0Var.mo5070e(C0966R.C0971layout.ad_);
        TextView textView = (TextView) v0Var.f18463f.findViewById(C0966R.C0970id.hu_);
        View findViewById = v0Var.f18463f.findViewById(C0966R.C0970id.hg7);
        View findViewById2 = v0Var.f18463f.findViewById(C0966R.C0970id.f6116xr);
        Resources resources = context.getResources();
        Object[] objArr = new Object[1];
        String str = hs12.f134840e;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        textView.setText(resources.getString(C0966R.string.dns, objArr));
        findViewById.setOnClickListener(new C11443f0(v0Var));
        C8477a0 a0Var = new C8477a0();
        findViewById2.setOnClickListener(new C11444g0(a0Var, v0Var, hs12));
        v0Var.f18472r = new C11446h0(lVar, a0Var);
        v0Var.mo5073h();
    }

    /* renamed from: U */
    public final C48978cb0 mo87045U(C45795b bVar, int i, String str, int i2) {
        Map map;
        Class cls = C55001u.class;
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(str, "strvalue");
        C48978cb0 cb02 = new C48978cb0();
        cb02.f131608e = C66785b.f191882e.mo90662O5();
        cb02.f131607d = ((C55001u) bVar.mo71262a(cls)).f154416j;
        if (str.length() == 0) {
            map = C90363p0.m113143b(new C13604l("feedActionType", Integer.valueOf(i)));
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("feedActionType", Integer.valueOf(i));
            hashMap.put("strValue", str);
            hashMap.put("value", Integer.valueOf(i2));
            map = hashMap;
        }
        C62042e eVar = f176370a;
        eVar.mo86998D1("FinderLiveUtil", "getExtState :" + map);
        cb02.f131610g = C58739j4.f168176a.mo83702c(map);
        cb02.f131609f = ((C55001u) bVar.mo71262a(cls)).f154424u;
        return cb02;
    }

    /* renamed from: U0 */
    public final boolean mo87046U0(C45795b bVar) {
        C87412m.m108594g(bVar, "buContext");
        boolean u = C61926c.m72696u(((C54991o) bVar.mo71262a(C54991o.class)).f154388y0, TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        Log.m105924i("FinderLiveUtil", "[isDisableCommentFakeInsert] isDisable = " + u);
        return u;
    }

    /* renamed from: U1 */
    public final void mo87047U1(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        C61926c.m72668M(new C11448i0(z, context));
    }

    /* renamed from: V0 */
    public final boolean mo87048V0(C45795b bVar) {
        C87412m.m108594g(bVar, "buContext");
        boolean u = C61926c.m72696u(((C54991o) bVar.mo71262a(C54991o.class)).f154388y0, 8388608);
        Log.m105924i("FinderLiveUtil", "[isDisableLinkMic] isDisable = " + u);
        return u;
    }

    /* renamed from: V1 */
    public final void mo87049V1(C45795b bVar, C64822x51 x512, Boolean bool) {
        C89349b bVar2;
        String str;
        Class cls = C54979h1.class;
        C87412m.m108594g(bVar, "buContext");
        C89349b bVar3 = null;
        if (x512 == null) {
            C0740i2 i2Var = ((C54979h1) bVar.mo71262a(cls)).f154147v;
            x512 = i2Var != null ? f176370a.mo87132z1(i2Var) : null;
        }
        long j = ((C54979h1) bVar.mo71262a(cls)).f154118J;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C54847z3 z3Var = FinderLiveService.f159383n;
        z3Var.mo75800f(10);
        C64605o91 o912 = new C64605o91();
        o912.f184634d = x512 != null ? x512.f186258h : j;
        if (x512 == null || (bVar2 = x512.f186260j) == null) {
            bVar2 = ((C54979h1) bVar.mo71262a(cls)).f154119K;
        }
        o912.f184635e = bVar2;
        if (x512 != null) {
            bVar3 = x512.f186256f;
        }
        o912.f184636f = bVar3;
        o912.f184637g = bool != null ? bool.booleanValue() : j > 0;
        if (x512 == null || (str = x512.f186267t) == null) {
            str = "";
        }
        o912.f184638h = str;
        o912.f184639i = ((C54979h1) bVar.mo71262a(cls)).f154120L;
        Log.m105924i("FinderLiveUtil", "[startPollingPromoteInfo] req:" + C61937h.m72709h(o912));
        finderLiveService.getClass();
        z3Var.mo75799e(10, o912, new C62047j0(bVar, C50800p91.class), false);
    }

    /* renamed from: W */
    public final FinderContact mo87050W(C45795b bVar) {
        String str;
        String str2;
        String str3;
        String str4;
        Class cls = C54991o.class;
        C87412m.m108594g(bVar, "liveData");
        FinderContact finderContact = new FinderContact();
        C62042e eVar = f176370a;
        if (eVar.mo87027N0()) {
            String O5 = C66785b.f191882e.mo90662O5();
            finderContact.username = O5;
            C58969q b = C58961d.f168673a.mo84155b(O5);
            String str5 = "";
            finderContact.nickname = b != null ? b.mo84196w1() : str5;
            if (b != null) {
                str5 = b.mo84172g0();
            }
            finderContact.headUrl = str5;
        } else if (((C54991o) bVar.mo71262a(cls)).f154190D) {
            finderContact.username = C75592q0.m90789s();
            C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(cls);
            if (oVar == null || (str4 = oVar.mo75977P3()) == null) {
                str4 = C75592q0.m90783m();
            }
            finderContact.nickname = str4;
            finderContact.headUrl = ((C54991o) bVar.mo71262a(cls)).mo75986U3().f183214e;
        } else {
            C64373fs0 U3 = ((C54991o) bVar.mo71262a(cls)).mo75986U3();
            int i = U3.f183215f;
            if (i == 2) {
                finderContact.username = C75592q0.m90782l();
                C54991o oVar2 = (C54991o) FinderLiveService.f159376d.mo77630e(cls);
                if (oVar2 == null || (str = oVar2.mo75977P3()) == null) {
                    str = U3.f183213d;
                }
                finderContact.nickname = str;
                finderContact.headUrl = U3.f183214e;
            } else if (i != 3) {
                finderContact.username = C75592q0.m90789s();
                C54991o oVar3 = (C54991o) FinderLiveService.f159376d.mo77630e(cls);
                if (oVar3 == null || (str3 = oVar3.mo75977P3()) == null) {
                    str3 = C75592q0.m90783m();
                }
                finderContact.nickname = str3;
                finderContact.headUrl = U3.f183214e;
            } else {
                finderContact.username = C66785b.f191882e.mo90662O5();
                C54991o oVar4 = (C54991o) FinderLiveService.f159376d.mo77630e(cls);
                if (oVar4 == null || (str2 = oVar4.mo75977P3()) == null) {
                    str2 = U3.f183213d;
                }
                finderContact.nickname = str2;
                finderContact.headUrl = U3.f183214e;
            }
        }
        if (eVar.mo87087i1(bVar, (LinkedList<C48770aw0>) null)) {
            finderContact.nickname = "***";
        }
        return finderContact;
    }

    /* renamed from: W0 */
    public final boolean mo87051W0(C45795b bVar) {
        C87412m.m108594g(bVar, "buContext");
        boolean u = C61926c.m72696u(((C54991o) bVar.mo71262a(C54991o.class)).f154388y0, 1048576);
        Log.m105924i("FinderLiveUtil", "[isDisableMicIntercom] isDisable = " + u);
        return u;
    }

    /* renamed from: W1 */
    public final int mo87052W1(int i) {
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: X */
    public final Class<?> mo87053X(Context context) {
        Class cls = C60204t3.class;
        C87412m.m108594g(context, "context");
        if (((C60204t3) C86312j.m106911c(cls)).Kv0(context) || ((context instanceof Activity) && ((C60204t3) C86312j.m106911c(cls)).iu0((Activity) context))) {
            C35640b bVar = C35640b.f95284a;
            return (Class) ((C36570n) C35640b.f95299p).getValue();
        }
        C35640b bVar2 = C35640b.f95284a;
        return (Class) ((C36570n) C35640b.f95298o).getValue();
    }

    /* renamed from: X0 */
    public final boolean mo87054X0(int i) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_GLOBAL_FLAG_INT_SYNC;
        int j = i != 1 ? i != 2 ? C86709a0.m107535s().mo121142i().mo119689j(aVar, 0) : C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_GAME_LIVE_GLOBAL_FLAG_INT_SYNC, 0) : C86709a0.m107535s().mo121142i().mo119689j(aVar, 0);
        Log.m105924i("FinderLiveUtil", "[isDisablePrivateLive] scene = " + i + ", globalFlag = " + j);
        return C61926c.m72696u(j, 2);
    }

    /* renamed from: X1 */
    public final void mo87055X1(C45795b bVar, C58124b bVar2, boolean z) {
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(bVar2, "statusMonitor");
        C0740i2 i2Var = ((C54979h1) bVar.mo71262a(C54979h1.class)).f154147v;
        if (i2Var != null) {
            C58124b.C58125b bVar3 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
            Bundle bundle = new Bundle();
            C64822x51 z1 = f176370a.mo87132z1(i2Var);
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", z1 != null ? z1.toByteArray() : null);
            bundle.putBoolean("PARAM_FINDER_LIVE_PROMOTE_DELETE_BY_ANCHOR", !z);
            C13598b0 b0Var = C13598b0.f38549a;
            bVar2.statusChange(bVar3, bundle);
        }
    }

    /* renamed from: Y */
    public final Class<?> mo87056Y(Context context) {
        Class cls = C60204t3.class;
        C87412m.m108594g(context, "context");
        if (((C60204t3) C86312j.m106911c(cls)).Kv0(context) || ((context instanceof Activity) && ((C60204t3) C86312j.m106911c(cls)).iu0((Activity) context))) {
            C35640b bVar = C35640b.f95284a;
            return (Class) ((C36570n) C35640b.f95289f).getValue();
        }
        C35640b bVar2 = C35640b.f95284a;
        return (Class) ((C36570n) C35640b.f95288e).getValue();
    }

    /* renamed from: Y0 */
    public final boolean mo87057Y0(C45795b bVar) {
        C87412m.m108594g(bVar, "buContext");
        boolean u = C61926c.m72696u(((C54991o) bVar.mo71262a(C54991o.class)).f154388y0, 4194304);
        Log.m105924i("FinderLiveUtil", "[isDisableSendGift] isDisable = " + u);
        return u;
    }

    /* renamed from: Y1 */
    public final boolean mo87058Y1(String str, int i, boolean z, String str2) {
        C87412m.m108594g(str, "sdkUserId");
        C61620c.C61622b.f175234a.mo86557e(str2, str, i, z);
        C61619b b = C61620c.C61622b.f175234a.mo86554b(str);
        if (b != null) {
            Log.m105924i("FinderLiveUtil", "updateRemoteLinkMicUserInfo: already add, need update, sdkUserId:" + str + ", sdkLiveId:" + i + ", isAnchor:" + z + ", sessionId:" + str2);
            b.f175226i = String.valueOf(i);
            b.f175227j = z;
            return true;
        }
        Log.m105924i("FinderLiveUtil", "updateRemoteLinkMicUserInfo: user didn't online yet, sdkUserId:" + str + ", sdkLiveId:" + i + ", isAnchor:" + z + ", sessionId:" + str2);
        return false;
    }

    /* renamed from: Z */
    public final LinkedList<String> mo87059Z(List<byte[]> list) {
        LinkedList<String> linkedList = new LinkedList<>();
        if (list == null) {
            Log.m105924i("FinderLiveUtil", "getFinderLiveAndienceFileIdList list is empty!");
            return linkedList;
        }
        StringBuilder sb = new StringBuilder("AndienceFileIdList:");
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C51745vv0 vv02 = new C51745vv0();
                vv02.parseFrom((byte[]) next);
                String str = vv02.f143709d;
                if (!(str == null || str.length() == 0)) {
                    linkedList.add(str);
                    sb.append('[' + vv02.f143710e + ',' + vv02.f143709d + ']');
                } else {
                    Log.m105924i("FinderLiveUtil", "getFinderLiveAndienceFileIdList index:" + i + " item:" + vv02.f143710e + " is empty!");
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        Log.m105924i("FinderLiveUtil", "getFinderLiveAndienceFileIdList " + sb);
        return linkedList;
    }

    /* renamed from: Z1 */
    public final void mo87060Z1(Context context, C45795b bVar, C64756up2 up22) {
        C55908a aVar;
        Context context2 = context;
        C64756up2 up23 = up22;
        Class cls = C54991o.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(up23, "liveRoomImg");
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C54991o oVar = (C54991o) finderLiveService.mo77630e(cls);
        if (oVar != null) {
            Log.m105924i("FinderLiveUtil", "liveStart:" + oVar.mo75999e4() + ", liveFinish:" + oVar.mo75997d4() + ", liveRoomImg:" + C61937h.m72709h(up22));
            C54991o oVar2 = (C54991o) finderLiveService.mo77630e(cls);
            boolean z = false;
            if (oVar2 != null && oVar2.mo75960G3()) {
                C15257b1.f41498a.mo14159a(up23.f185784f == 0 ? 3 : 4);
                C54991o oVar3 = (C54991o) finderLiveService.mo77630e(cls);
                if (oVar3 != null && oVar3.mo75999e4()) {
                    z = true;
                }
                if (z) {
                    C8479f0 f0Var = new C8479f0();
                    C53973z1 z1Var = null;
                    f0Var.f27484d = C89779i0.m112248e(context, context.getString(C0966R.string.gat), true, 3, (DialogInterface.OnCancelListener) null);
                    finderLiveService.getClass();
                    C45795b bVar2 = FinderLiveService.f159348A;
                    if (!(bVar2 == null || (aVar = bVar2.f123702i) == null)) {
                        z1Var = C53895h.m60466d(aVar, C53872d1.f151119c, (C53934p0) null, new C62050l0(bVar, up22, context, f0Var, (C15601d<? super C62050l0>) null), 2, (Object) null);
                    }
                    C89779i0 i0Var = (C89779i0) f0Var.f27484d;
                    if (i0Var != null) {
                        i0Var.setCancelable(true);
                    }
                    C89779i0 i0Var2 = (C89779i0) f0Var.f27484d;
                    if (i0Var2 != null) {
                        i0Var2.setOnDismissListener(new C62049k0(z1Var, f0Var));
                    }
                    C89779i0 i0Var3 = (C89779i0) f0Var.f27484d;
                    if (i0Var3 != null) {
                        i0Var3.show();
                        return;
                    }
                    return;
                }
                C54991o oVar4 = (C54991o) finderLiveService.mo77630e(cls);
                if (oVar4 != null) {
                    oVar4.f154230N = up23;
                }
                finderLiveService.getClass();
                C56032b bVar3 = FinderLiveService.f159379g;
                if (bVar3 != null) {
                    C58124b.C58125b bVar4 = C58124b.C58125b.FINDER_LIVE_MODE_SWITCH;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", true);
                    C13598b0 b0Var = C13598b0.f38549a;
                    bVar3.statusChange(bVar4, bundle);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo87061a(String str, C45795b bVar) {
        C87412m.m108594g(bVar, "buContext");
        if (!mo87046U0(bVar) && str != null) {
            ((C54991o) bVar.mo71262a(C54991o.class)).f154220K2.add(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r1 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("FinderLiveUtil", "getTaskAffinity, get exception:" + r7);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[ExcHandler: Exception (r7v19 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:8:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b4  */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class<?> mo87062a0(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.Class<ht1.t3> r0 = ht1.C60204t3.class
            java.lang.String r1 = "context"
            gy3.C87412m.m108594g(r7, r1)
            di3.d r1 = di3.C86312j.m106911c(r0)
            ht1.t3 r1 = (ht1.C60204t3) r1
            boolean r1 = r1.Kv0(r7)
            if (r1 != 0) goto L_0x00cc
            boolean r1 = r7 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0028
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t3 r0 = (ht1.C60204t3) r0
            r2 = r7
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r0 = r0.iu0(r2)
            if (r0 == 0) goto L_0x0028
            goto L_0x00cc
        L_0x0028:
            if (r1 == 0) goto L_0x00bf
            java.lang.String r0 = "FinderLiveUtil"
            r1 = 0
            r2 = 0
            java.lang.Class<android.app.ActivityManager> r3 = android.app.ActivityManager.class
            java.lang.Object r3 = p385u2.C111105a.m151502d(r7, r3)     // Catch:{ NameNotFoundException -> 0x0089, Exception -> 0x0073 }
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3     // Catch:{ NameNotFoundException -> 0x0089, Exception -> 0x0073 }
            r4 = 1
            if (r3 == 0) goto L_0x003e
            java.util.List r3 = r3.getRunningTasks(r4)     // Catch:{ NameNotFoundException -> 0x0089, Exception -> 0x0073 }
            goto L_0x003f
        L_0x003e:
            r3 = r1
        L_0x003f:
            if (r3 == 0) goto L_0x0048
            boolean r5 = r3.isEmpty()     // Catch:{ NameNotFoundException -> 0x0089, Exception -> 0x0073 }
            if (r5 != r4) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            if (r4 == 0) goto L_0x0051
            java.lang.String r7 = "running Tasks null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)     // Catch:{ NameNotFoundException -> 0x0089, Exception -> 0x0073 }
            goto L_0x00aa
        L_0x0051:
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r3.get(r2)     // Catch:{ NameNotFoundException -> 0x0089, Exception -> 0x0073 }
            android.app.ActivityManager$RunningTaskInfo r3 = (android.app.ActivityManager.RunningTaskInfo) r3     // Catch:{ NameNotFoundException -> 0x0089, Exception -> 0x0073 }
            if (r3 == 0) goto L_0x005e
            android.content.ComponentName r3 = r3.baseActivity     // Catch:{ NameNotFoundException -> 0x0089, Exception -> 0x0073 }
            goto L_0x005f
        L_0x005e:
            r3 = r1
        L_0x005f:
            if (r3 == 0) goto L_0x0070
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x006e, Exception -> 0x0073 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r7 = r7.getActivityInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x006e, Exception -> 0x0073 }
            java.lang.String r1 = r7.taskAffinity     // Catch:{ NameNotFoundException -> 0x006e, Exception -> 0x0073 }
            goto L_0x0070
        L_0x006e:
            goto L_0x008b
        L_0x0070:
            if (r1 != 0) goto L_0x00ac
            goto L_0x00aa
        L_0x0073:
            r7 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "getTaskAffinity, get exception:"
            r1.append(r3)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)
            goto L_0x00aa
        L_0x0089:
            r3 = r1
        L_0x008b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r4 = "componentName:"
            r7.append(r4)
            if (r3 == 0) goto L_0x009b
            java.lang.String r1 = r3.toString()
        L_0x009b:
            r7.append(r1)
            java.lang.String r1 = ",trigger PackageManager.NameNotFoundException"
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
        L_0x00aa:
            java.lang.String r1 = ""
        L_0x00ac:
            java.lang.String r7 = "com.tencent.mm.topStory"
            boolean r7 = z04.C112551y.m153819s(r1, r7, r2)
            if (r7 == 0) goto L_0x00bf
            rx3.g r7 = pt1.C35640b.f95286c
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Class r7 = (java.lang.Class) r7
            goto L_0x00d8
        L_0x00bf:
            pt1.b r7 = pt1.C35640b.f95284a
            rx3.g r7 = pt1.C35640b.f95285b
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Class r7 = (java.lang.Class) r7
            goto L_0x00d8
        L_0x00cc:
            pt1.b r7 = pt1.C35640b.f95284a
            rx3.g r7 = pt1.C35640b.f95287d
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Class r7 = (java.lang.Class) r7
        L_0x00d8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.mo87062a0(android.content.Context):java.lang.Class");
    }

    /* renamed from: a1 */
    public final boolean mo87063a1(String str) {
        C87412m.m108594g(str, "username");
        return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str).mo62927s3();
    }

    /* renamed from: a2 */
    public final void mo87064a2(boolean z, boolean z2) {
        C62193a.C62194a aVar = C62193a.f176816k1;
        int size = C62193a.f176817l1.size();
        if (z) {
            if (size > 1 || (z2 && size > 0)) {
                C11348f.C11349a.m11178b(C59319a.f169618b, "liveVisitorCoreLeak", false, (C11348f.C11352b) null, false, false, new C35181m0(z2, size), 28, (Object) null);
                if (!z2) {
                    return;
                }
                if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
                    Context context = MMApplicationContext.getContext();
                    C76912y0.makeText(context, (CharSequence) "liveVisitorCoreLeak size=" + size, 0).show();
                    if (BuildInfo.DEBUG) {
                        throw new RuntimeException("liveVisitorCoreLeak size=" + size);
                    }
                }
            }
        } else if (size > 2) {
            C11348f.C11349a.m11178b(C59319a.f169618b, "liveVisitorCoreOverSize", false, (C11348f.C11352b) null, false, false, new C35182n0(size), 28, (Object) null);
        }
    }

    /* renamed from: b */
    public final C0537f2 mo87065b(C52013xs0 xs02, C45795b bVar) {
        C48770aw0 aw02;
        LinkedList<C48770aw0> linkedList;
        LinkedList<C48770aw0> linkedList2;
        LinkedList<C48770aw0> linkedList3;
        boolean z;
        C48770aw0 aw03;
        LinkedList<C48770aw0> linkedList4;
        LinkedList<C48770aw0> linkedList5;
        LinkedList<C48770aw0> linkedList6;
        boolean z2;
        Class cls = C0702z0.class;
        Class cls2 = C54991o.class;
        C87412m.m108594g(xs02, "appMsg");
        C87412m.m108594g(bVar, "liveData");
        C62042e eVar = f176370a;
        T t = null;
        if (eVar.mo87046U0(bVar)) {
            return null;
        }
        C0537f2 f2Var = new C0537f2(xs02);
        C49765hx0 hx02 = new C49765hx0();
        hx02.f134919d = eVar.mo87050W(bVar);
        hx02.f134930r = ((C54991o) bVar.mo71262a(cls2)).f154320h;
        hx02.f134926n = eVar.mo87036R();
        xs02.f144914s = hx02;
        ((C0702z0) ((C54991o) bVar.mo71262a(cls2)).business(cls)).f1672f.add(f2Var);
        C8035f fVar = C8035f.f26736a;
        String content = f2Var.getContent();
        if (content == null) {
            content = "";
        }
        if (C58739j4.f168176a.mo83692U()) {
            C13604l<Integer, Integer> b = fVar.mo9118b(content);
            int intValue = ((Number) b.f38555d).intValue();
            if (intValue == 2) {
                C49765hx0 hx03 = xs02.f144914s;
                if (hx03 != null) {
                    LinkedList<C48770aw0> linkedList7 = hx03.f134930r;
                    if (linkedList7 == null) {
                        linkedList7 = new LinkedList<>();
                    }
                    hx03.f134930r = linkedList7;
                }
                xs02.f144911p = 1;
                xs02.f144912q = 3;
                C49765hx0 hx04 = xs02.f144914s;
                if (!(hx04 == null || (linkedList3 = hx04.f134930r) == null)) {
                    Iterator<T> it = linkedList3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (((C48770aw0) next).f130789d == 2) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            t = next;
                            break;
                        }
                    }
                    C48770aw0 aw04 = (C48770aw0) t;
                    if (aw04 != null) {
                        aw02 = fVar.mo9117a(aw04);
                        aw02.f130791f = ((Number) b.f38556e).intValue();
                        aw02.f130789d = 2;
                        C49765hx0 hx05 = xs02.f144914s;
                        if (!(hx05 == null || (linkedList2 = hx05.f134930r) == null)) {
                            linkedList2.clear();
                        }
                        C49765hx0 hx06 = xs02.f144914s;
                        if (!(hx06 == null || (linkedList = hx06.f134930r) == null)) {
                            linkedList.add(aw02);
                        }
                    }
                }
                aw02 = new C48770aw0();
                aw02.f130791f = ((Number) b.f38556e).intValue();
                aw02.f130789d = 2;
                C49765hx0 hx052 = xs02.f144914s;
                linkedList2.clear();
                C49765hx0 hx062 = xs02.f144914s;
                linkedList.add(aw02);
            } else if (intValue == 4) {
                C49765hx0 hx07 = xs02.f144914s;
                if (hx07 != null) {
                    LinkedList<C48770aw0> linkedList8 = hx07.f134930r;
                    if (linkedList8 == null) {
                        linkedList8 = new LinkedList<>();
                    }
                    hx07.f134930r = linkedList8;
                }
                xs02.f144911p = 1;
                xs02.f144912q = 2;
                C49765hx0 hx08 = xs02.f144914s;
                if (!(hx08 == null || (linkedList6 = hx08.f134930r) == null)) {
                    Iterator<T> it4 = linkedList6.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        T next2 = it4.next();
                        if (((C48770aw0) next2).f130789d == 4) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            t = next2;
                            break;
                        }
                    }
                    C48770aw0 aw05 = (C48770aw0) t;
                    if (aw05 != null) {
                        aw03 = fVar.mo9117a(aw05);
                        aw03.f130791f = ((Number) b.f38556e).intValue();
                        aw03.f130789d = 4;
                        C49765hx0 hx09 = xs02.f144914s;
                        if (!(hx09 == null || (linkedList5 = hx09.f134930r) == null)) {
                            linkedList5.clear();
                        }
                        C49765hx0 hx010 = xs02.f144914s;
                        if (!(hx010 == null || (linkedList4 = hx010.f134930r) == null)) {
                            linkedList4.add(aw03);
                        }
                    }
                }
                aw03 = new C48770aw0();
                aw03.f130791f = ((Number) b.f38556e).intValue();
                aw03.f130789d = 4;
                C49765hx0 hx092 = xs02.f144914s;
                linkedList5.clear();
                C49765hx0 hx0102 = xs02.f144914s;
                linkedList4.add(aw03);
            }
        }
        ((C0702z0) bVar.mo71262a(cls)).mo669c3(f2Var);
        C53496k.f150436a.mo74169b();
        return f2Var;
    }

    /* renamed from: b0 */
    public final int mo87066b0(List<? extends C48770aw0> list) {
        T t;
        boolean z;
        C58739j4.f168176a.getClass();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C48770aw0) t).f130789d == 2) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C48770aw0 aw02 = (C48770aw0) t;
            if (aw02 != null) {
                return aw02.f130791f;
            }
        }
        return -1;
    }

    /* renamed from: b1 */
    public final boolean mo87067b1(C45795b bVar) {
        return C61926c.m72696u(bVar != null ? ((C54991o) bVar.mo71262a(C54991o.class)).f154354q : 0, 128);
    }

    /* renamed from: c */
    public final void mo87068c(ViewGroup viewGroup, boolean z) {
        C87412m.m108594g(viewGroup, "vg");
        if (viewGroup.getLayoutParams() != null && (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && z) {
            int dimensionPixelOffset = viewGroup.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelOffset;
        }
    }

    /* renamed from: c0 */
    public final int mo87069c0() {
        if (C58739j4.f168176a.mo83692U()) {
            C32444a aVar = C32444a.f86121a;
            int intValue = C32444a.f86116Y0.mo60266n().intValue();
            if (intValue != 1) {
                return intValue != 2 ? 0 : 2;
            }
            return 1;
        }
    }

    /* renamed from: c1 */
    public final boolean mo87070c1(C45795b bVar) {
        String str;
        C87412m.m108594g(bVar, "buContext");
        C0740i2 i2Var = ((C54979h1) bVar.mo71262a(C54979h1.class)).f154147v;
        Boolean bool = null;
        C63962r rVar = i2Var instanceof C63962r ? (C63962r) i2Var : null;
        if (rVar == null) {
            return false;
        }
        LinkedList<C64424hi3> linkedList = rVar.f181314s.f186059d;
        C87412m.m108593f(linkedList, "it.data.infos");
        C64424hi3 hi32 = (C64424hi3) C110818d0.m150916N(linkedList);
        if (!(hi32 == null || (str = hi32.f183501f) == null)) {
            C64224a61 a = C61780j.f175629a.mo86701a(str);
            StringBuilder sb = new StringBuilder();
            sb.append("[isGotRedPacket], full:");
            sb.append(a != null ? Integer.valueOf(a.f182036e) : null);
            sb.append(", status:");
            if (a != null) {
                bool = Boolean.valueOf(a.f182035d);
            }
            sb.append(bool);
            Log.m105924i("FinderLiveUtil", sb.toString());
            boolean z = true;
            if (!(a != null && a.f182036e == 0) || !a.f182035d) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: d */
    public final void mo87071d(C62660c cVar) {
        C87412m.m108594g(cVar, "plugin");
        mo87068c(cVar.f177935f, cVar.mo82893g0());
    }

    /* renamed from: d0 */
    public final ArrayList<List<String>> mo87072d0(int i, int i2, boolean z) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<List<String>> arrayList2 = new ArrayList<>();
        mo87115s0(arrayList, i2);
        for (String i3 : arrayList) {
            Log.m105924i("getNoticePicker", i3);
        }
        for (int i4 = 0; i4 < i; i4++) {
            arrayList2.add(arrayList);
        }
        Object clone = arrayList.clone();
        C87412m.m108592e(clone, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        ArrayList arrayList3 = (ArrayList) clone;
        Date date = new Date(f176370a.mo87112r0());
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        int i5 = instance.get(11);
        if (z) {
            if (i5 >= 0) {
                int i6 = 0;
                while (true) {
                    arrayList3.remove(0);
                    if (i6 == i5) {
                        break;
                    }
                    i6++;
                }
            }
            arrayList2.remove(0);
            if (!arrayList3.isEmpty()) {
                arrayList2.add(0, arrayList3);
            }
        } else {
            for (int i7 = 0; i7 < i5; i7++) {
                arrayList3.remove(0);
            }
            arrayList2.remove(0);
            if (date.getMinutes() >= 55) {
                arrayList3.remove(0);
            }
            if (!arrayList3.isEmpty()) {
                arrayList2.add(0, arrayList3);
            }
        }
        return arrayList2;
    }

    /* renamed from: d1 */
    public final boolean mo87073d1(C45795b bVar) {
        C87412m.m108594g(bVar, "liveData");
        FinderLiveService.f159376d.getClass();
        return !(FinderLiveService.f159379g instanceof FinderLiveVisitorPluginLayout) && ((C54991o) bVar.mo71262a(C54991o.class)).mo75979Q3() == 2;
    }

    /* renamed from: e */
    public final void mo87074e(C62660c cVar, boolean z) {
        C87412m.m108594g(cVar, "plugin");
        cVar.f177935f.post(new C11429a(cVar, z));
    }

    /* renamed from: e1 */
    public final boolean mo87075e1(int i, int i2) {
        Log.m105924i("FinderLiveUtil", "validVideoSize videoWidth:" + i + ",videoHeight:" + i2);
        boolean z = i > 0 && i2 > 0;
        Log.m105924i("FinderLiveUtil", "isLandscapeVideo validVideoSize:" + z);
        return z && i >= i2;
    }

    /* renamed from: f */
    public final boolean mo87076f() {
        C32444a aVar = C32444a.f86121a;
        return C32444a.f86060H.mo60266n().intValue() == 1;
    }

    /* renamed from: f0 */
    public final String mo87077f0(String str, String str2) {
        String obj;
        boolean z = true;
        if (str == null || str.length() == 0) {
            return "";
        }
        if (!(str2 == null || str2.length() == 0)) {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            Object opt = new JSONObject(C112551y.m153814n(str, ";", ",", false)).opt(str2);
            return (opt == null || (obj = opt.toString()) == null) ? "" : obj;
        } catch (Exception e) {
            Log.m105924i("FinderLiveUtil", String.valueOf(e.getMessage()));
            return "";
        }
    }

    /* renamed from: f1 */
    public final boolean mo87078f1(C45795b bVar) {
        return !C61926c.m72696u(bVar != null ? ((C54991o) bVar.mo71262a(C54991o.class)).f154354q : 0, 512);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r5 >= r6) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r8.offer(java.lang.Integer.valueOf(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        r8.offer(java.lang.Integer.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r7 == false) goto L_0x0023;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> mo87079g(int r5, int r6, boolean r7, java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> r8, int r9) {
        /*
            r4 = this;
            if (r8 != 0) goto L_0x0007
            java.util.concurrent.ConcurrentLinkedDeque r8 = new java.util.concurrent.ConcurrentLinkedDeque
            r8.<init>()
        L_0x0007:
            if (r5 < r6) goto L_0x0013
            if (r7 == 0) goto L_0x0012
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.offer(r5)
        L_0x0012:
            return r8
        L_0x0013:
            double r0 = (double) r6
            double r2 = (double) r5
            double r0 = r0 - r2
            double r2 = (double) r9
            double r0 = r0 / r2
            double r0 = java.lang.Math.ceil(r0)
            r9 = 1
            int r0 = (int) r0
            if (r9 >= r0) goto L_0x0021
            r9 = r0
        L_0x0021:
            if (r7 != 0) goto L_0x0024
        L_0x0023:
            int r5 = r5 + r9
        L_0x0024:
            if (r5 >= r6) goto L_0x002e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r8.offer(r7)
            goto L_0x0023
        L_0x002e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r8.offer(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.mo87079g(int, int, boolean, java.util.concurrent.ConcurrentLinkedDeque, int):java.util.concurrent.ConcurrentLinkedDeque");
    }

    /* renamed from: g0 */
    public final int mo87080g0(C62660c cVar) {
        boolean z = false;
        if (cVar == null) {
            return 0;
        }
        Context context = cVar.f177935f.getContext();
        C87412m.m108593f(context, "plugin.vg.context");
        if (mo87073d1(cVar.mo87684A0()) || mo87035Q0(cVar.mo87684A0())) {
            z = true;
        }
        return mo87083h0(context, z);
    }

    /* renamed from: g1 */
    public final boolean mo87081g1(C45795b bVar) {
        boolean z;
        C87412m.m108594g(bVar, "buContext");
        LinkedList<C48770aw0> linkedList = ((C54991o) bVar.mo71262a(C54991o.class)).f154320h;
        T t = null;
        if (linkedList != null) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C48770aw0) next).f130789d == 8) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            t = (C48770aw0) t;
        }
        return t != null;
    }

    /* renamed from: h */
    public final boolean mo87082h(int i) {
        C32444a aVar = C32444a.f86121a;
        if (C32444a.f86156i2.mo60266n().intValue() == 1) {
            return false;
        }
        return !C61926c.m72696u(i, 65536);
    }

    /* renamed from: h0 */
    public final int mo87083h0(Context context, boolean z) {
        int dimensionPixelOffset;
        C87412m.m108594g(context, "context");
        int i = 0;
        int f = C85875k4.m106205t(context, false) ? C75044y4.m89994f(context) : 0;
        if (z) {
            i = C75044y4.m89991c(context);
        }
        if (z) {
            if (f < i) {
                f = i;
            }
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
        } else if (f <= 0) {
            return context.getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv);
        } else {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
        }
        return f + dimensionPixelOffset;
    }

    /* renamed from: h1 */
    public final boolean mo87084h1(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        C58739j4 j4Var = C58739j4.f168176a;
        return j4Var.mo83694W(str) || j4Var.mo83691T(str);
    }

    /* renamed from: i */
    public final boolean mo87085i() {
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_MORE_COMMENT_SETTING_BOOLEAN_SYNC, false);
        StringBuilder sb = new StringBuilder();
        sb.append("canShowAnchorMoreCommentSettingRedDot:");
        sb.append(!g);
        Log.m105924i("FinderLiveUtil", sb.toString());
        return !g;
    }

    /* renamed from: i0 */
    public final C13604l<Integer, Integer> mo87086i0(Context context) {
        View findViewById;
        C87412m.m108594g(context, "context");
        int i = C75044y4.m89990b(context).x;
        int i2 = C75044y4.m89990b(context).y;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (findViewById = activity.findViewById(C0966R.C0970id.f358130dk2)) != null && findViewById.getWidth() > 0 && findViewById.getHeight() > 0) {
            i = findViewById.getWidth();
            i2 = findViewById.getHeight();
        }
        return new C13604l<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: i1 */
    public final boolean mo87087i1(C45795b bVar, LinkedList<C48770aw0> linkedList) {
        boolean z;
        C87412m.m108594g(bVar, "buContext");
        if (linkedList == null) {
            linkedList = ((C54991o) bVar.mo71262a(C54991o.class)).f154320h;
        }
        T t = null;
        if (linkedList != null) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C48770aw0) next).f130789d == 10) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            t = (C48770aw0) t;
        }
        return t != null;
    }

    /* renamed from: j */
    public final boolean mo87088j() {
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_MORE_FUNCTION_BOOLEAN_SYNC, false);
        StringBuilder sb = new StringBuilder();
        sb.append("canShowAnchorMoreFunctionRedDot:");
        sb.append(!g);
        Log.m105924i("FinderLiveUtil", sb.toString());
        return !g;
    }

    /* renamed from: j0 */
    public final int mo87089j0(int i, int i2) {
        return ((float) i) / ((float) i2) >= 1.7777778f ? C74942w4.m89784a(MMApplicationContext.getContext(), 212) : C74942w4.m89784a(MMApplicationContext.getContext(), 167);
    }

    /* renamed from: j1 */
    public final boolean mo87090j1(C45795b bVar) {
        C87412m.m108594g(bVar, "buContext");
        return C61926c.m72696u(((C55001u) bVar.mo71262a(C55001u.class)).f154420q.f182374S, 32768);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        r9 = ((cl1.C54991o) r9.mo71262a(cl1.C54991o.class)).f154202G;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87091k(fj1.C45795b r9) {
        /*
            r8 = this;
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC
            r2 = 0
            long r0 = r0.mo119673G(r1, r2)
            boolean r2 = r8.mo87027N0()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0033
            if (r9 == 0) goto L_0x002e
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            androidx.lifecycle.i0 r9 = r9.mo71262a(r2)
            cl1.o r9 = (cl1.C54991o) r9
            te3.b61 r9 = r9.f154202G
            if (r9 == 0) goto L_0x002e
            boolean r9 = r8.mo87101n1(r9)
            if (r9 != r3) goto L_0x002e
            r9 = 1
            goto L_0x002f
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 == 0) goto L_0x0033
            r9 = 1
            goto L_0x0034
        L_0x0033:
            r9 = 0
        L_0x0034:
            int r2 = (int) r0
            r5 = 2
            boolean r2 = o40.C61926c.m72696u(r2, r5)
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_PROMOTION_BOOLEAN_SYNC
            boolean r5 = r5.mo119686g(r6, r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "canShowAnchorPromotionRedDot: "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r7 = ", flag:"
            r6.append(r7)
            r6.append(r0)
            r0 = 44
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = ", "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "FinderLiveUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            if (r9 == 0) goto L_0x007d
            if (r2 == 0) goto L_0x007d
            if (r5 != 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r3 = 0
        L_0x007e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.mo87091k(fj1.b):boolean");
    }

    /* renamed from: k1 */
    public final boolean mo87092k1(C45795b bVar) {
        return C61926c.m72696u(bVar != null ? ((C54991o) bVar.mo71262a(C54991o.class)).f154354q : 0, 32768);
    }

    /* renamed from: l */
    public final boolean mo87093l(C45795b bVar) {
        C87412m.m108594g(bVar, "buContext");
        C32444a aVar = C32444a.f86121a;
        C35464c<Integer> cVar = C32444a.f86137e;
        return cVar.mo60266n().intValue() > 0 ? cVar.mo60266n().intValue() == 1 : ((C54991o) bVar.mo71262a(C54991o.class)).f154197E3;
    }

    /* renamed from: l1 */
    public final boolean mo87094l1(C45795b bVar) {
        C87412m.m108594g(bVar, "buContext");
        C0740i2 i2Var = ((C54979h1) bVar.mo71262a(C54979h1.class)).f154147v;
        C13696v vVar = i2Var instanceof C13696v ? (C13696v) i2Var : null;
        return vVar != null && vVar.f38761s.f142892B == 0;
    }

    /* renamed from: m */
    public final boolean mo87095m() {
        boolean U = C58739j4.f168176a.mo83692U();
        C32444a aVar = C32444a.f86121a;
        int intValue = C32444a.f86206v0.mo60266n().intValue();
        Log.m105924i("FinderLiveUtil", "canShowVisitorRoleEntrance isTest:" + U + ",configValue:" + intValue);
        if (intValue == 0) {
            return true;
        }
        if (intValue != 1) {
            return false;
        }
        return U;
    }

    /* renamed from: m0 */
    public final long mo87096m0(C64273c21 c212) {
        if (c212 != null) {
            return c212.f182377T0;
        }
        return 0;
    }

    /* renamed from: m1 */
    public final boolean mo87097m1(C64756up2 up22) {
        C64274c60 c602;
        String str;
        C87412m.m108594g(up22, "<this>");
        int i = up22.f185784f;
        if (i == 0) {
            String str2 = up22.f185782d;
            if (str2 == null) {
                return false;
            }
            return str2.length() > 0;
        } else if (i != 1 || (c602 = up22.f185783e) == null || (str = c602.f182415d) == null) {
            return false;
        } else {
            return str.length() > 0;
        }
    }

    /* renamed from: n */
    public final boolean mo87098n(Context context, String str, C32226l<? super Boolean, C13598b0> lVar) {
        Context context2 = context;
        String str2 = str;
        C32226l<? super Boolean, C13598b0> lVar2 = lVar;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_PKG_GIFT_AGREEMENT_VERSION_INT_SYNC;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str2, "configKey");
        C87412m.m108594g(lVar2, "callback");
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c(str2);
        Log.m105924i("FinderLiveUtil", "[checkGiftLegalArgeement] config:" + c);
        if (c == null) {
            return false;
        }
        try {
            C104289g gVar = new C104289g(c);
            String optString = gVar.optString("legal_title");
            String optString2 = gVar.optString("legal_url");
            int optInt = gVar.optInt("legal_type");
            int optInt2 = gVar.optInt(ProviderConstants.API_COLNAME_FEATURE_VERSION);
            if (!(1 <= optInt && optInt < 3)) {
                return false;
            }
            if (optInt != 1 && optInt == 2) {
                aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_POPULAR_GIFT_AGREEMENT_VERSION_INT_SYNC;
            }
            C72994y1.C72995a aVar2 = aVar;
            int j = C86709a0.m107535s().mo121142i().mo119689j(aVar2, -1);
            Log.m105924i("FinderLiveUtil", "[checkGiftLegalArgeement] currentVersion:" + j);
            if (C58739j4.f168176a.mo83692U()) {
                C76912y0.makeText(context2, (CharSequence) "checkGiftLegalArgeement type:" + optInt + ", version:" + optInt2 + ", currentVersion:" + j, 0).show();
            }
            if (j >= optInt2) {
                return false;
            }
            C77407n nVar = new C77407n(context2, 1, false);
            View inflate = View.inflate(context2, C0966R.C0971layout.f7168hx, (ViewGroup) null);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) inflate;
            roundedCornerFrameLayout.mo153905b((float) C74942w4.m89784a(context2, 12), (float) C74942w4.m89784a(context2, 12), 0.0f, 0.0f);
            TextView textView = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.e8e);
            TextView textView2 = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.f358060d81);
            C87412m.m108593f(textView, "titleView");
            C7919x.m8091a(textView);
            textView2.setText(optString);
            textView.setText(optInt != 1 ? optInt != 2 ? "" : context2.getString(C0966R.string.f8071dn) : context2.getString(C0966R.string.f8072do));
            Button button = (Button) roundedCornerFrameLayout.findViewById(C0966R.C0970id.hll);
            Button button2 = (Button) roundedCornerFrameLayout.findViewById(C0966R.C0970id.apy);
            C87412m.m108593f(button, "okBtn");
            C7919x.m8091a(button);
            C87412m.m108593f(button2, "cancelBtn");
            C7919x.m8091a(button2);
            textView2.setOnClickListener(new C11431b(optString2, context2));
            C8477a0 a0Var = new C8477a0();
            button.setOnClickListener(new C11433c(context, optInt, optInt2, aVar2, a0Var, nVar));
            button2.setOnClickListener(new C11438d(nVar));
            nVar.f225761d = new C11440e(lVar2, a0Var);
            nVar.f225771i = new C11442f(nVar, roundedCornerFrameLayout);
            nVar.mo107559d(true);
            nVar.mo107573q();
            return true;
        } catch (Exception e) {
            Log.m105924i("FinderLiveUtil", "[checkGiftLegalArgeement] errMsg:" + e.getMessage());
            return false;
        }
    }

    /* renamed from: n0 */
    public final int mo87099n0(int i, int i2, int i3) {
        int e = C31543z5.m39455e();
        int i4 = i2 - e;
        int i5 = i2 - i;
        int i6 = (i4 > i5 || i4 > i3) ? i3 : i4;
        if (i4 <= 0) {
            i6 = 0;
        }
        Log.m105924i("FinderLiveUtil", "getLotteryRemainTime serverTime:" + e + ",beginTime:" + i + ",endTime:" + i2 + ",remainTime:" + i3 + ",calRemainTime:" + i4 + ",duration:" + i5 + ",result:" + i6);
        return i6;
    }

    /* renamed from: n1 */
    public final boolean mo87101n1(C48814b61 b612) {
        boolean z = (b612 == null || (b612.f130979d == null && b612.f130980e == null)) ? false : true;
        Log.m105924i("FinderLiveUtil", "FinderLivePromotionEntrance.isValid " + z);
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        r0 = r0.f134919d;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87102o(cj1.C0581o5 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "commentData"
            gy3.C87412m.m108594g(r4, r0)
            boolean r0 = r4 instanceof cj1.C0537f2
            if (r0 == 0) goto L_0x005e
            int r0 = r4.getType()
            r1 = 20002(0x4e22, float:2.8029E-41)
            if (r0 != r1) goto L_0x005e
            cj1.f2 r4 = (cj1.C0537f2) r4
            te3.xs0 r0 = r4.f1301a
            te3.hx0 r0 = r0.f144902d
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r0.username
            goto L_0x0022
        L_0x0021:
            r0 = r1
        L_0x0022:
            java.lang.String r2 = eb0.C75592q0.m90789s()
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 != 0) goto L_0x005c
            te3.xs0 r0 = r4.f1301a
            te3.hx0 r0 = r0.f144902d
            if (r0 == 0) goto L_0x0039
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r0.username
            goto L_0x003a
        L_0x0039:
            r0 = r1
        L_0x003a:
            zc1.b r2 = zc1.C66785b.f191882e
            java.lang.String r2 = r2.mo90662O5()
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 != 0) goto L_0x005c
            te3.xs0 r4 = r4.f1301a
            te3.hx0 r4 = r4.f144902d
            if (r4 == 0) goto L_0x0052
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f134919d
            if (r4 == 0) goto L_0x0052
            java.lang.String r1 = r4.username
        L_0x0052:
            java.lang.String r4 = eb0.C75592q0.m90782l()
            boolean r4 = gy3.C87412m.m108589b(r1, r4)
            if (r4 == 0) goto L_0x005e
        L_0x005c:
            r4 = 1
            goto L_0x005f
        L_0x005e:
            r4 = 0
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.mo87102o(cj1.o5):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        if (r0 != null) goto L_0x0096;
     */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo87103o0(te3.C51483u21 r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            if (r7 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r1 = r7.f142565f
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001f
            int r5 = r1.length()
            if (r5 <= 0) goto L_0x0014
            r5 = 1
            goto L_0x0015
        L_0x0014:
            r5 = 0
        L_0x0015:
            if (r5 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r1 = r2
        L_0x0019:
            if (r1 == 0) goto L_0x001f
            java.lang.String r1 = r7.f142565f
            if (r1 != 0) goto L_0x009d
        L_0x001f:
            int r1 = r7.f142563d
            if (r1 == r4) goto L_0x0060
            r5 = 2
            if (r1 == r5) goto L_0x0050
            r5 = 3
            if (r1 == r5) goto L_0x0060
            r7 = 4
            if (r1 == r7) goto L_0x0040
            r7 = 5
            if (r1 == r7) goto L_0x0030
            goto L_0x0096
        L_0x0030:
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2131829106(0x7f112172, float:1.9291172E38)
            java.lang.String r0 = r7.getString(r0)
            goto L_0x0096
        L_0x0040:
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2131827791(0x7f111c4f, float:1.9288505E38)
            java.lang.String r0 = r7.getString(r0)
            goto L_0x0096
        L_0x0050:
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2131827862(0x7f111c96, float:1.9288649E38)
            java.lang.String r0 = r7.getString(r0)
            goto L_0x0096
        L_0x0060:
            java.lang.String r7 = r7.f142564e
            if (r7 == 0) goto L_0x0087
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x006c
            r0 = 1
            goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r0 == 0) goto L_0x0070
            r2 = r7
        L_0x0070:
            if (r2 == 0) goto L_0x0087
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2131827823(0x7f111c6f, float:1.928857E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r2
            java.lang.String r0 = r7.getString(r0, r1)
            if (r0 != 0) goto L_0x0096
        L_0x0087:
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2131827858(0x7f111c92, float:1.928864E38)
            java.lang.String r0 = r7.getString(r0)
        L_0x0096:
            java.lang.String r7 = "when(info.lotteryAttendT…          }\n            }"
            gy3.C87412m.m108593f(r0, r7)
            r1 = r0
        L_0x009d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.mo87103o0(te3.u21):java.lang.String");
    }

    /* renamed from: o1 */
    public final void mo87104o1(Context context, C64620p2 p2Var, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(p2Var, "adPage");
        C87412m.m108594g(str, "uxInfo");
        int i = p2Var.f184735d;
        if (i == 0) {
            C86299o oVar = new C86299o();
            oVar.f250930b = p2Var.f184736e;
            oVar.f250934f = p2Var.f184737f;
            oVar.f250931c = 0;
            oVar.f250913B = C90973a0.OPAQUE;
            oVar.f250939k = 1177;
            Log.m105924i("FinderLiveUtil", "appId: " + oVar.f250930b + ", enterPath: " + oVar.f250934f);
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
            Log.m105924i("FinderLiveUtil", "adPage enter wxa, " + p2Var.f184736e + ", " + p2Var.f184737f);
        } else if (i == 1) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", p2Var.f184737f);
            intent.putExtra("convertActivityFromTranslucent", true);
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            Log.m105924i("FinderLiveUtil", "adPage enter h5, " + p2Var.f184737f);
        } else if (i == 2) {
            String str2 = p2Var.f184738g;
            if (str2 == null) {
                str2 = "";
            }
            Intent intent2 = new Intent();
            intent2.putExtra("sns_landing_pages_pageid", Util.safeParseLong(str2));
            intent2.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
            intent2.putExtra("sns_landig_pages_from_source", 24);
            intent2.putExtra("sns_landing_pages_ad_info", "<ADInfo>" + "<uxInfo>" + str + "</uxInfo>" + "</ADInfo>");
            C88144b.m109791i(context, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent2, (Bundle) null);
            StringBuilder sb = new StringBuilder();
            sb.append("adPage enter nativePage, ");
            sb.append(str2);
            Log.m105924i("FinderLiveUtil", sb.toString());
        }
    }

    /* renamed from: p */
    public final boolean mo87105p(C39775b bVar) {
        ArrayList<C49765hx0> arrayList;
        C87412m.m108594g(bVar, "commentData");
        if (C87412m.m108589b(bVar.mo62408b(), C75592q0.m90789s()) || bVar.f106734e.f144903e != 20032 || !mo87063a1(bVar.mo62408b())) {
            if (bVar.f106734e.f144903e == 20034) {
                T t = null;
                C39773a aVar = bVar instanceof C39773a ? (C39773a) bVar : null;
                if (!(aVar == null || (arrayList = aVar.f106731j) == null)) {
                    Iterator<T> it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        FinderContact finderContact = ((C49765hx0) next).f134919d;
                        if (C87412m.m108589b(finderContact != null ? finderContact.username : null, C75592q0.m90789s())) {
                            t = next;
                            break;
                        }
                    }
                    t = (C49765hx0) t;
                }
                if (t != null) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: p0 */
    public final MultiProcessMMKV mo87106p0() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("_finder_live_mmkv" + C86709a0.m107523b().mo121110g());
        C87412m.m108593f(mmkv, "getMMKV(FINDER_LIVE_MMKV + MMKernel.account().uin)");
        return mmkv;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo87107p1(fj1.C45795b r5, fy3.C32226l<? super byte[], rx3.C13598b0> r6, wx3.C15601d<? super rx3.C13598b0> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ok1.C62042e.C62059w
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ok1.e$w r0 = (ok1.C62042e.C62059w) r0
            int r1 = r0.f176430f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f176430f = r1
            goto L_0x0018
        L_0x0013:
            ok1.e$w r0 = new ok1.e$w
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f176428d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f176430f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002b:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004e
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            androidx.lifecycle.i0 r5 = r5.mo71262a(r7)
            cl1.o r5 = (cl1.C54991o) r5
            d14.u0<rx3.l<java.lang.Boolean, byte[]>> r5 = r5.f154213I3
            if (r5 == 0) goto L_0x0054
            ok1.e$x r7 = new ok1.e$x
            r7.<init>(r6)
            r0.f176430f = r3
            d14.j1 r5 = (d14.C58052j1) r5
            java.lang.Object r5 = r5.mo31880a(r7, r0)
            if (r5 != r1) goto L_0x004e
            return r1
        L_0x004e:
            rx3.d r5 = new rx3.d
            r5.<init>()
            throw r5
        L_0x0054:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.mo87107p1(fj1.b, fy3.l, wx3.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: te3.hx0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r0 = r0.mo75986U3();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87108q(cj1.C0581o5 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "commentData"
            gy3.C87412m.m108594g(r7, r0)
            boolean r0 = r6.mo87027N0()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x00a1
            boolean r0 = r7 instanceof cj1.C0537f2
            if (r0 == 0) goto L_0x00a1
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r0.mo77630e(r3)
            cl1.o r0 = (cl1.C54991o) r0
            if (r0 == 0) goto L_0x0029
            te3.fs0 r0 = r0.mo75986U3()
            if (r0 == 0) goto L_0x0029
            int r0 = r0.f183215f
            if (r0 != r1) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 == 0) goto L_0x00a1
            r0 = r7
            cj1.f2 r0 = (cj1.C0537f2) r0
            te3.xs0 r3 = r0.f1301a
            te3.hx0 r3 = r3.f144914s
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x003f
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f134919d
            if (r3 == 0) goto L_0x003f
            java.lang.String r3 = r3.username
            if (r3 != 0) goto L_0x0040
        L_0x003f:
            r3 = r4
        L_0x0040:
            java.lang.String r5 = eb0.C75592q0.m90789s()
            boolean r3 = gy3.C87412m.m108589b(r3, r5)
            if (r3 != 0) goto L_0x0068
            int r3 = r7.getType()
            r5 = 20032(0x4e40, float:2.8071E-41)
            if (r3 != r5) goto L_0x0068
            te3.xs0 r0 = r0.f1301a
            te3.hx0 r0 = r0.f144914s
            if (r0 == 0) goto L_0x0062
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r0.username
            if (r0 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r4 = r0
        L_0x0062:
            boolean r0 = r6.mo87063a1(r4)
            if (r0 != 0) goto L_0x00a2
        L_0x0068:
            int r0 = r7.getType()
            r3 = 20034(0x4e42, float:2.8074E-41)
            if (r0 != r3) goto L_0x00a1
            java.lang.Object r7 = r7.mo563q()
            java.lang.String r0 = "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderLiveContact>"
            gy3.C87412m.m108592e(r7, r0)
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x007f:
            boolean r0 = r7.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r7.next()
            r4 = r0
            te3.hx0 r4 = (te3.C49765hx0) r4
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f134919d
            if (r4 == 0) goto L_0x0093
            java.lang.String r3 = r4.username
        L_0x0093:
            java.lang.String r4 = eb0.C75592q0.m90789s()
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x007f
            r3 = r0
        L_0x009e:
            if (r3 == 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r1 = 0
        L_0x00a2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.mo87108q(cj1.o5):boolean");
    }

    /* renamed from: q0 */
    public final C13605o<ArrayList<String>, ArrayList<List<String>>, ArrayList<List<String>>> mo87109q0() {
        Date date = new Date(f176370a.mo87112r0());
        Calendar instance = Calendar.getInstance();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 90; i++) {
            instance.setTime(date);
            instance.set(5, instance.get(5) + i);
            int i2 = instance.get(5);
            arrayList.add(MMApplicationContext.getContext().getResources().getString(C0966R.string.dzf, new Object[]{Integer.valueOf(instance.get(2) + 1), Integer.valueOf(i2)}));
        }
        for (String i3 : arrayList) {
            Log.m105924i("getNoticePicker", i3);
        }
        if (date.getHours() >= 23 && date.getMinutes() >= 55) {
            arrayList.remove(0);
        }
        ArrayList<List<String>> d0 = mo87072d0(arrayList.size(), C0966R.string.dzm, false);
        int size = arrayList.size() * d0.size();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C61593h h = C61595o.m72300h(C61595o.m72301i(0, 60), 5);
        int i4 = h.f175174d;
        int i5 = h.f175175e;
        int i6 = h.f175176f;
        if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
            while (true) {
                String C = C58739j4.f168176a.mo83675C(i4);
                arrayList2.add(MMApplicationContext.getContext().getResources().getString(C0966R.string.dzo, new Object[]{C}));
                if (i4 == i5) {
                    break;
                }
                i4 += i6;
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Log.m105924i("getNoticePicker", (String) it.next());
        }
        for (int i7 = 0; i7 < size; i7++) {
            arrayList3.add(arrayList2);
        }
        Object clone = arrayList2.clone();
        C87412m.m108592e(clone, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        ArrayList arrayList4 = (ArrayList) clone;
        Date date2 = new Date(f176370a.mo87112r0());
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(date2);
        int i8 = (instance2.get(12) / 5) + 1;
        for (int i9 = 0; i9 < i8; i9++) {
            arrayList4.remove(0);
        }
        arrayList3.remove(0);
        if (!arrayList4.isEmpty()) {
            arrayList3.add(0, arrayList4);
        }
        return new C13605o<>(arrayList, d0, arrayList3);
    }

    /* renamed from: q1 */
    public final boolean mo87110q1() {
        String Sh = ((C60606n) C86312j.m106911c(C60606n.class)).mo85033Sh();
        return !(Sh == null || Sh.length() == 0);
    }

    /* renamed from: r */
    public final void mo87111r(C45795b bVar, C64370fp1 fp12) {
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(fp12, "productInfo");
        long j = ((C55001u) bVar.mo71262a(C55001u.class)).f154420q.f182392d;
        C64857yh3 yh32 = fp12.f183160E;
        if (yh32 != null && j != yh32.f186532d) {
            fp12.f183160E = null;
        }
    }

    /* renamed from: r0 */
    public final long mo87112r0() {
        C32444a aVar = C32444a.f86121a;
        return C32444a.f86194s0.mo60266n().intValue() == 1 ? System.currentTimeMillis() : C31543z5.m39453c();
    }

    /* renamed from: r1 */
    public final void mo87113r1(C45795b bVar, Context context, boolean z) {
        C87412m.m108594g(context, "context");
        C54991o oVar = bVar != null ? (C54991o) bVar.mo71262a(C54991o.class) : null;
        if (oVar != null) {
            oVar.f154274W2 = z;
        }
        if (z) {
            if (C54655b.f153178f1 == null) {
                C54655b.f153178f1 = new C54655b();
            }
            C54655b bVar2 = C54655b.f153178f1;
            C87412m.m108591d(bVar2);
            bVar2.mo85687d0(true);
            C76912y0.m92768g(context, context.getResources().getString(C0966R.string.dg5));
            return;
        }
        if (C54655b.f153178f1 == null) {
            C54655b.f153178f1 = new C54655b();
        }
        C54655b bVar3 = C54655b.f153178f1;
        C87412m.m108591d(bVar3);
        bVar3.mo85687d0(false);
        C76912y0.m92768g(context, context.getResources().getString(C0966R.string.dff));
    }

    /* renamed from: s */
    public final boolean mo87114s(C39775b bVar) {
        C87412m.m108594g(bVar, "commentData");
        return bVar.f106734e.f144903e == 20002 && C87412m.m108589b(bVar.mo62409d(), C75592q0.m90789s());
    }

    /* renamed from: s0 */
    public final void mo87115s0(ArrayList<String> arrayList, int i) {
        C87412m.m108594g(arrayList, "result");
        for (int i2 = 0; i2 < 24; i2++) {
            String C = C58739j4.f168176a.mo83675C(i2);
            arrayList.add(MMApplicationContext.getContext().getResources().getString(i, new Object[]{C}));
        }
    }

    /* renamed from: s1 */
    public final boolean mo87116s1() {
        Class cls = C54991o.class;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C54991o oVar = (C54991o) finderLiveService.mo77630e(cls);
        if (!(oVar != null && oVar.f154303d1 == 2)) {
            C54991o oVar2 = (C54991o) finderLiveService.mo77630e(cls);
            if (oVar2 != null && oVar2.f154295b1 == 2) {
                return true;
            }
        }
        C54991o oVar3 = (C54991o) finderLiveService.mo77630e(cls);
        if (C61926c.m72696u(oVar3 != null ? oVar3.f154299c1 : 0, 787040)) {
            C54991o oVar4 = (C54991o) finderLiveService.mo77630e(cls);
            if (!C61926c.m72696u(oVar4 != null ? oVar4.f154291a1 : 0, 787040)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public final boolean mo87117t(Context context, C45795b bVar, String str, String str2, C32224a<C13598b0> aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "desc");
        boolean z = !mo87027N0() && mo87087i1(bVar, (LinkedList<C48770aw0>) null);
        if (z) {
            C77407n nVar = new C77407n(context, 1, false);
            View inflate = View.inflate(context, C0966R.C0971layout.f7185su, (ViewGroup) null);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) inflate;
            roundedCornerFrameLayout.mo153905b((float) C74942w4.m89784a(context, 12), (float) C74942w4.m89784a(context, 12), 0.0f, 0.0f);
            TextView textView = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.e8e);
            TextView textView2 = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.f358060d81);
            C87412m.m108593f(textView, "titleView");
            C7919x.m8091a(textView);
            C87412m.m108593f(textView2, "descView");
            C7919x.m8091a(textView2);
            textView.setText(str);
            textView2.setText(str2);
            ((Button) roundedCornerFrameLayout.findViewById(C0966R.C0970id.hll)).setOnClickListener(new C62043g(bVar, nVar, context, aVar));
            ((Button) roundedCornerFrameLayout.findViewById(C0966R.C0970id.apy)).setOnClickListener(new C11445h(nVar));
            nVar.f225771i = new C11447i(nVar, roundedCornerFrameLayout);
            nVar.mo107559d(true);
            nVar.mo107573q();
        }
        return z;
    }

    /* renamed from: t0 */
    public final C86299o mo87118t0(C64513l40 l402, int i) {
        C64513l40 l403 = l402;
        C87412m.m108594g(l403, "page");
        C86299o oVar = new C86299o();
        oVar.f250930b = l403.f184031d;
        oVar.f250934f = l403.f184032e;
        C54789l6 l6Var = new C54789l6();
        l6Var.f153585f = 1;
        l6Var.f153593q = i;
        oVar.f250937i = l6Var;
        oVar.f250939k = mo87027N0() ? 1176 : 1177;
        oVar.f250912A = new HalfScreenConfig(true, 10, (HalfScreenConfig.C55451a) null, false, (HalfScreenConfig.BackgroundShapeConfig) null, false, (HalfScreenConfig.CloseWhenClickEmptyAreaConfig) null, (HalfScreenConfig.C55453c) null, false, false, (WeAppHalfScreenStatusChangeListener) null, (HalfScreenConfig.C55456f) null, false, false, (C66117m) null, false, (HalfScreenConfig.ShareActionConfig) null, 0, 0, 0, false, false, false, (HalfScreenConfig.C55455e) null, false, (HalfScreenConfig.CustomSubjectInfo) null, 0, false, false, 0, false, false, false, -4, 1, (C8480h) null);
        oVar.f250929a = l403.f184035h;
        oVar.f250931c = C58739j4.f168176a.mo83673A();
        return oVar;
    }

    /* renamed from: t1 */
    public final void mo87119t1(long j, String str, int i, int i2) {
        C87412m.m108594g(str, "username");
        FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
        FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
        aVar.f9174a = j;
        aVar.f9181h = str;
        aVar.f9182i = i;
        aVar.f9177d = i2;
        aVar.f9175b = 8;
        feedUpdateEvent.publish();
        C64273c21 T70 = ((C60606n) C86312j.m106911c(C60606n.class)).T70(j);
        if (T70 != null) {
            T70.f182394f = i;
        }
        Log.m105924i("FinderLiveUtil", "notify live:" + j + " status change to:" + i + ' ');
    }

    /* renamed from: u */
    public final void mo87120u(String str) {
        C87412m.m108594g(str, OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
        throw new RuntimeException("plugin inflateError throw exception: " + str);
    }

    /* renamed from: u0 */
    public final List<C86299o> mo87121u0(C48833bb1 bb12) {
        LinkedList<C48688ab1> linkedList;
        C48833bb1 bb13 = bb12;
        ArrayList arrayList = new ArrayList();
        if (!(bb13 == null || (linkedList = bb13.f131035e) == null)) {
            for (C48688ab1 ab12 : linkedList) {
                C86299o oVar = new C86299o();
                oVar.f250930b = ab12.f130410d;
                oVar.f250934f = ab12.f130412f;
                C54789l6 l6Var = new C54789l6();
                if (ab12.f130411e) {
                    l6Var.f153593q = 1;
                } else if (ab12.f130413g) {
                    l6Var.f153593q = 2;
                } else if (ab12.f130414h) {
                    l6Var.f153593q = 3;
                }
                l6Var.f153585f = 1;
                oVar.f250937i = l6Var;
                oVar.f250939k = f176370a.mo87027N0() ? 1176 : 1177;
                oVar.f250912A = new HalfScreenConfig(true, 10, (HalfScreenConfig.C55451a) null, false, (HalfScreenConfig.BackgroundShapeConfig) null, false, (HalfScreenConfig.CloseWhenClickEmptyAreaConfig) null, (HalfScreenConfig.C55453c) null, false, ab12.f130415i == 1, (WeAppHalfScreenStatusChangeListener) null, (HalfScreenConfig.C55456f) null, false, false, (C66117m) null, false, (HalfScreenConfig.ShareActionConfig) null, 0, 0, 0, false, false, false, (HalfScreenConfig.C55455e) null, false, (HalfScreenConfig.CustomSubjectInfo) null, 0, false, false, 0, false, false, false, -516, 1, (C8480h) null);
                oVar.f250931c = C58739j4.f168176a.mo83673A();
                arrayList.add(oVar);
            }
        }
        return arrayList;
    }

    /* renamed from: v */
    public final void mo87122v(C50626o21 o212) {
        C55908a aVar;
        C87412m.m108594g(o212, "data");
        FinderJumpInfo finderJumpInfo = o212.f138912d;
        boolean z = finderJumpInfo != null ? finderJumpInfo.need_preload : false;
        Log.m105924i("FinderLiveUtil", "[checkRetentionPreLoad] needPreload =" + z);
        if (z) {
            FinderLiveService.f159376d.getClass();
            C45795b bVar = FinderLiveService.f159348A;
            if (bVar != null && (aVar = bVar.f123702i) != null) {
                C53895h.m60466d(aVar, C53872d1.f151119c, (C53934p0) null, new C62046j(o212, (C15601d<? super C62046j>) null), 2, (Object) null);
            }
        }
    }

    /* renamed from: v0 */
    public final int mo87123v0(C45795b bVar, boolean z, boolean z2) {
        Class cls = C54991o.class;
        C87412m.m108594g(bVar, "liveData");
        int i = 0;
        boolean z3 = C85875k4.m106157N() && C85875k4.m106197n0() && (C85875k4.m106156M(MMApplicationContext.getContext()) || C85875k4.m106155L(MMApplicationContext.getContext().getContentResolver()) || C85875k4.m106184h(MMApplicationContext.getContext()).x > C85875k4.m106184h(MMApplicationContext.getContext()).y);
        Log.m105924i("FinderLiveUtil", "getRenderMode isFolderOpen: " + z3 + " realX: " + C85875k4.m106184h(MMApplicationContext.getContext()).x);
        int d3 = ((C54991o) bVar.mo71262a(cls)).mo75996d3();
        if (d3 == 0) {
            i = (!z2 && !((C54991o) bVar.mo71262a(cls)).f154301c3 && (((C54991o) bVar.mo71262a(cls)).mo75993b4() || (!((C54991o) bVar.mo71262a(cls)).mo75992a4() && !z))) ? 2 : 5;
        } else if (d3 != 1) {
            Log.m105924i("FinderLiveUtil", "unknown audienceMode:" + ((C54991o) bVar.mo71262a(cls)).mo75996d3());
        } else if (z3 || z2 || ((C54991o) bVar.mo71262a(cls)).f154301c3 || (!((C54991o) bVar.mo71262a(cls)).mo75993b4() && (((C54991o) bVar.mo71262a(cls)).mo75992a4() || z))) {
            i = 1;
        }
        Log.m105924i("FinderLiveUtil", "getRenderMode audienceMode:" + ((C54991o) bVar.mo71262a(cls)).mo75996d3() + ", renderMode:" + i);
        return i;
    }

    /* renamed from: v1 */
    public final void mo87124v1(C45795b bVar, C58124b bVar2) {
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(bVar2, "statusMonitor");
        C0740i2 i2Var = ((C54979h1) bVar.mo71262a(C54979h1.class)).f154147v;
        C63956k kVar = i2Var instanceof C63956k ? (C63956k) i2Var : null;
        if (kVar != null) {
            if (!kVar.f181300p || f176370a.mo87027N0()) {
                C58124b.C58125b bVar3 = C58124b.C58125b.FINDER_LIVE_PROMTE_REPLACE;
                Bundle bundle = new Bundle();
                C64822x51 z1 = f176370a.mo87132z1(kVar);
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", z1 != null ? z1.toByteArray() : null);
                C13598b0 b0Var = C13598b0.f38549a;
                bVar2.statusChange(bVar3, bundle);
            } else {
                long g = kVar.f181299o ? (long) C61595o.m72299g(new C61594j(1, kVar.f181301q), C88334c.f255322d) : 0;
                Log.m105924i("FinderLiveUtil", "[notifyBubble] delay = " + g);
                C61926c.m72666K(g * ((long) 1000), new C62065l(bVar));
            }
        }
        mo87049V1(bVar, (C64822x51) null, (Boolean) null);
    }

    /* renamed from: w */
    public final boolean mo87125w(boolean z, C49747hs1 hs12) {
        C87412m.m108594g(hs12, "switchInfo");
        if (z) {
            C32444a aVar = C32444a.f86121a;
            if (((Boolean) C32444a.f86140e2.mo60266n()).booleanValue()) {
                return true;
            }
            String str = "";
            String I = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_FINDER_LIVE_GAME_RANK_PERMISSION_SHOW_STRING_SYNC, str);
            Log.m105924i(C54492n.TAG, "permissionAppids:" + I + ", switchInfo.game_app_id:" + hs12.f134839d);
            C87412m.m108593f(I, "permissionAppids");
            String str2 = hs12.f134839d;
            if (str2 != null) {
                str = str2;
            }
            if (!C112550d0.m153801u(I, str, false)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w1 */
    public final LinkedList<C51745vv0> mo87126w1(List<byte[]> list, LinkedList<C51745vv0> linkedList) {
        C87412m.m108594g(list, "list");
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        } else {
            linkedList.clear();
        }
        for (byte[] parseFrom : list) {
            C51745vv0 vv02 = new C51745vv0();
            vv02.parseFrom(parseFrom);
            linkedList.add(vv02);
        }
        return linkedList;
    }

    /* renamed from: x */
    public final void mo87127x(AppCompatActivity appCompatActivity, int i) {
        Window window;
        Log.m105924i("FinderLiveUtil", "activity:" + appCompatActivity + " clear flag:" + i);
        if (appCompatActivity != null && (window = appCompatActivity.getWindow()) != null) {
            window.clearFlags(i);
        }
    }

    /* renamed from: x0 */
    public final C13604l<Boolean, C64733to> mo87128x0(int i, C64273c21 c212, int i2) {
        C64359f71 f712;
        C13604l<Boolean, C64733to> lVar;
        C13604l<Boolean, C64733to> lVar2;
        C87412m.m108594g(c212, "liveInfo");
        Boolean bool = Boolean.FALSE;
        String str = null;
        C13604l<Boolean, C64733to> lVar3 = new C13604l<>(bool, null);
        C64338e71 e712 = c212.f182388Z;
        if (!(e712 == null || (f712 = e712.f182933i) == null)) {
            Log.m105924i("FinderLiveUtil", "getReplayTransitionInfo source:" + i + ",customerChooseVideoLevel:" + i2 + ",supportHevc:" + f176370a.mo87039S() + ",liveInfo:" + c212.hashCode() + ',' + C63947a.f181274a.mo88726l(c212.f182388Z) + '!');
            if (f712.f183087f == 1) {
                m72813z0(f712, f712.f183086e);
            } else if (i2 >= 0) {
                C64733to z0 = m72813z0(f712, i2);
                if (z0 == null) {
                    Log.m105928w("FinderLiveUtil", "getReplayTransitionInfo find info to match customer video level,but result is null!");
                    C64733to z05 = m72813z0(f712, f712.f183086e);
                    if (z05 != null) {
                        lVar2 = new C13604l<>(Boolean.TRUE, z05);
                    } else {
                        C64733to y0 = m72812y0(f712);
                        Log.m105928w("FinderLiveUtil", "getReplayTransitionInfo find back info!");
                        lVar2 = new C13604l<>(bool, y0);
                    }
                } else {
                    lVar2 = new C13604l<>(Boolean.TRUE, z0);
                }
                lVar3 = lVar2;
                C13598b0 b0Var = C13598b0.f38549a;
            } else {
                C64733to z06 = m72813z0(f712, f712.f183086e);
                if (z06 != null) {
                    lVar = new C13604l<>(Boolean.TRUE, z06);
                } else {
                    C64733to y05 = m72812y0(f712);
                    Log.m105928w("FinderLiveUtil", "getReplayTransitionInfo find back info!");
                    lVar = new C13604l<>(bool, y05);
                }
                lVar3 = lVar;
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getReplayTransitionInfo source:");
        sb.append(i);
        sb.append(" result:");
        sb.append(((Boolean) lVar3.f38555d).booleanValue());
        sb.append(',');
        C64733to toVar = (C64733to) lVar3.f38556e;
        if (toVar != null) {
            str = toVar.f185622e;
        }
        sb.append(str);
        sb.append('!');
        Log.m105924i("FinderLiveUtil", sb.toString());
        return lVar3;
    }

    /* renamed from: y */
    public final boolean mo87129y(LinkedList<C64373fs0> linkedList) {
        C87412m.m108594g(linkedList, "dataList");
        for (C64373fs0 fs02 : linkedList) {
            if (fs02.f183215f == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01b7, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01b8, code lost:
        if (r2 == null) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01ba, code lost:
        r2.mo88743i(r3);
     */
    /* renamed from: y1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final sk1.C63956k mo87130y1(byte[] r8) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "safeParser"
            java.lang.String r2 = "byteArray"
            gy3.C87412m.m108594g(r8, r2)
            r2 = 0
            te3.x51 r3 = new te3.x51     // Catch:{ Exception -> 0x01be }
            r3.<init>()     // Catch:{ Exception -> 0x01be }
            r4 = 0
            r5 = 1
            r3.parseFrom(r8)     // Catch:{ Exception -> 0x0015 }
            goto L_0x001d
        L_0x0015:
            r8 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01be }
            r6[r4] = r8     // Catch:{ Exception -> 0x01be }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r6)     // Catch:{ Exception -> 0x01be }
        L_0x001d:
            int r8 = r3.f186254d     // Catch:{ Exception -> 0x01be }
            switch(r8) {
                case 1: goto L_0x0194;
                case 2: goto L_0x0170;
                case 3: goto L_0x014c;
                case 4: goto L_0x0127;
                case 5: goto L_0x0102;
                case 6: goto L_0x00dd;
                case 7: goto L_0x00b8;
                case 8: goto L_0x0093;
                case 9: goto L_0x0022;
                case 10: goto L_0x0022;
                case 11: goto L_0x006e;
                case 12: goto L_0x0049;
                case 13: goto L_0x0024;
                default: goto L_0x0022;
            }     // Catch:{ Exception -> 0x01be }
        L_0x0022:
            goto L_0x01b8
        L_0x0024:
            te3.o51 r8 = new te3.o51     // Catch:{ Exception -> 0x01be }
            r8.<init>()     // Catch:{ Exception -> 0x01be }
            pe3.b r6 = r3.f186256f     // Catch:{ Exception -> 0x01be }
            if (r6 == 0) goto L_0x0032
            byte[] r6 = r6.mo123703f()     // Catch:{ Exception -> 0x01be }
            goto L_0x0033
        L_0x0032:
            r6 = r2
        L_0x0033:
            if (r6 != 0) goto L_0x0036
            goto L_0x0042
        L_0x0036:
            r8.parseFrom(r6)     // Catch:{ Exception -> 0x003a }
            goto L_0x0042
        L_0x003a:
            r6 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01be }
            r5[r4] = r6     // Catch:{ Exception -> 0x01be }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r5)     // Catch:{ Exception -> 0x01be }
        L_0x0042:
            sk1.q r0 = new sk1.q     // Catch:{ Exception -> 0x01be }
            r0.<init>(r8)     // Catch:{ Exception -> 0x01be }
            goto L_0x01b7
        L_0x0049:
            te3.o21 r8 = new te3.o21     // Catch:{ Exception -> 0x01be }
            r8.<init>()     // Catch:{ Exception -> 0x01be }
            pe3.b r6 = r3.f186256f     // Catch:{ Exception -> 0x01be }
            if (r6 == 0) goto L_0x0057
            byte[] r6 = r6.mo123703f()     // Catch:{ Exception -> 0x01be }
            goto L_0x0058
        L_0x0057:
            r6 = r2
        L_0x0058:
            if (r6 != 0) goto L_0x005b
            goto L_0x0067
        L_0x005b:
            r8.parseFrom(r6)     // Catch:{ Exception -> 0x005f }
            goto L_0x0067
        L_0x005f:
            r6 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01be }
            r5[r4] = r6     // Catch:{ Exception -> 0x01be }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r5)     // Catch:{ Exception -> 0x01be }
        L_0x0067:
            sk1.s r0 = new sk1.s     // Catch:{ Exception -> 0x01be }
            r0.<init>(r8)     // Catch:{ Exception -> 0x01be }
            goto L_0x01b7
        L_0x006e:
            te3.vr1 r8 = new te3.vr1     // Catch:{ Exception -> 0x01be }
            r8.<init>()     // Catch:{ Exception -> 0x01be }
            pe3.b r6 = r3.f186256f     // Catch:{ Exception -> 0x01be }
            if (r6 == 0) goto L_0x007c
            byte[] r6 = r6.mo123703f()     // Catch:{ Exception -> 0x01be }
            goto L_0x007d
        L_0x007c:
            r6 = r2
        L_0x007d:
            if (r6 != 0) goto L_0x0080
            goto L_0x008c
        L_0x0080:
            r8.parseFrom(r6)     // Catch:{ Exception -> 0x0084 }
            goto L_0x008c
        L_0x0084:
            r6 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01be }
            r5[r4] = r6     // Catch:{ Exception -> 0x01be }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r5)     // Catch:{ Exception -> 0x01be }
        L_0x008c:
            sk1.l r0 = new sk1.l     // Catch:{ Exception -> 0x01be }
            r0.<init>(r8)     // Catch:{ Exception -> 0x01be }
            goto L_0x01b7
        L_0x0093:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r8 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo     // Catch:{ Exception -> 0x01be }
            r8.<init>()     // Catch:{ Exception -> 0x01be }
            pe3.b r6 = r3.f186256f     // Catch:{ Exception -> 0x01be }
            if (r6 == 0) goto L_0x00a1
            byte[] r6 = r6.mo123703f()     // Catch:{ Exception -> 0x01be }
            goto L_0x00a2
        L_0x00a1:
            r6 = r2
        L_0x00a2:
            if (r6 != 0) goto L_0x00a5
            goto L_0x00b1
        L_0x00a5:
            r8.parseFrom(r6)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00b1
        L_0x00a9:
            r6 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01be }
            r5[r4] = r6     // Catch:{ Exception -> 0x01be }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r5)     // Catch:{ Exception -> 0x01be }
        L_0x00b1:
            sk1.m r0 = new sk1.m     // Catch:{ Exception -> 0x01be }
            r0.<init>(r8)     // Catch:{ Exception -> 0x01be }
            goto L_0x01b7
        L_0x00b8:
            te3.w51 r8 = new te3.w51     // Catch:{ Exception -> 0x01be }
            r8.<init>()     // Catch:{ Exception -> 0x01be }
            pe3.b r6 = r3.f186256f     // Catch:{ Exception -> 0x01be }
            if (r6 == 0) goto L_0x00c6
            byte[] r6 = r6.mo123703f()     // Catch:{ Exception -> 0x01be }
            goto L_0x00c7
        L_0x00c6:
            r6 = r2
        L_0x00c7:
            if (r6 != 0) goto L_0x00ca
            goto L_0x00d6
        L_0x00ca:
            r8.parseFrom(r6)     // Catch:{ Exception -> 0x00ce }
            goto L_0x00d6
        L_0x00ce:
            r6 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01be }
            r5[r4] = r6     // Catch:{ Exception -> 0x01be }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r5)     // Catch:{ Exception -> 0x01be }
        L_0x00d6:
            sk1.r r0 = new sk1.r     // Catch:{ Exception -> 0x01be }
            r0.<init>(r8)     // Catch:{ Exception -> 0x01be }
            goto L_0x01b7
        L_0x00dd:
            te3.uk1 r8 = new te3.uk1     // Catch:{ Exception -> 0x01be }
            r8.<init>()     // Catch:{ Exception -> 0x01be }
            pe3.b r6 = r3.f186256f     // Catch:{ Exception -> 0x01be }
            if (r6 == 0) goto L_0x00eb
            byte[] r6 = r6.mo123703f()     // Catch:{ Exception -> 0x01be }
            goto L_0x00ec
        L_0x00eb:
            r6 = r2
        L_0x00ec:
            if (r6 != 0) goto L_0x00ef
            goto L_0x00fb
        L_0x00ef:
            r8.parseFrom(r6)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00fb
        L_0x00f3:
            r6 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01be }
            r5[r4] = r6     // Catch:{ Exception -> 0x01be }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r5)     // Catch:{ Exception -> 0x01be }
        L_0x00fb:
            sk1.v r0 = new sk1.v     // Catch:{ Exception -> 0x01be }
            r0.<init>(r8)     // Catch:{ Exception -> 0x01be }
            goto L_0x01b7
        L_0x0102:
            te3.fp1 r8 = new te3.fp1     // Catch:{ Exception -> 0x01be }
            r8.<init>()     // Catch:{ Exception -> 0x01be }
            pe3.b r6 = r3.f186256f     // Catch:{ Exception -> 0x01be }
            if (r6 == 0) goto L_0x0110
            byte[] r6 = r6.mo123703f()     // Catch:{ Exception -> 0x01be }
            goto L_0x0111
        L_0x0110:
            r6 = r2
        L_0x0111:
            if (r6 != 0) goto L_0x0114
            goto L_0x0120
        L_0x0114:
            r8.parseFrom(r6)     // Catch:{ Exception -> 0x0118 }
            goto L_0x0120
        L_0x0118:
            r6 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01be }
            r5[r4] = r6     // Catch:{ Exception -> 0x01be }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r5)     // Catch:{ Exception -> 0x01be }
        L_0x0120:
            sk1.x r0 = new sk1.x     // Catch:{ Exception -> 0x01be }
            r0.<init>(r8)     // Catch:{ Exception -> 0x01be }
            goto L_0x01b7
        L_0x0127:
            te3.s81 r8 = new te3.s81     // Catch:{ Exception -> 0x01be }
            r8.<init>()     // Catch:{ Exception -> 0x01be }
            pe3.b r6 = r3.f186256f     // Catch:{ Exception -> 0x01be }
            if (r6 == 0) goto L_0x0135
            byte[] r6 = r6.mo123703f()     // Catch:{ Exception -> 0x01be }
            goto L_0x0136
        L_0x0135:
            r6 = r2
        L_0x0136:
            if (r6 != 0) goto L_0x0139
            goto L_0x0145
        L_0x0139:
            r8.parseFrom(r6)     // Catch:{ Exception -> 0x013d }
            goto L_0x0145
        L_0x013d:
            r6 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01be }
            r5[r4] = r6     // Catch:{ Exception -> 0x01be }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r5)     // Catch:{ Exception -> 0x01be }
        L_0x0145:
            sk1.u r0 = new sk1.u     // Catch:{ Exception -> 0x01be }
            r0.<init>(r8)     // Catch:{ Exception -> 0x01be }
            goto L_0x01b7
        L_0x014c:
            te3.u51 r8 = new te3.u51     // Catch:{ Exception -> 0x01be }
            r8.<init>()     // Catch:{ Exception -> 0x01be }
            pe3.b r6 = r3.f186256f     // Catch:{ Exception -> 0x01be }
            if (r6 == 0) goto L_0x015a
            byte[] r6 = r6.mo123703f()     // Catch:{ Exception -> 0x01be }
            goto L_0x015b
        L_0x015a:
            r6 = r2
        L_0x015b:
            if (r6 != 0) goto L_0x015e
            goto L_0x016a
        L_0x015e:
            r8.parseFrom(r6)     // Catch:{ Exception -> 0x0162 }
            goto L_0x016a
        L_0x0162:
            r6 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01be }
            r5[r4] = r6     // Catch:{ Exception -> 0x01be }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r5)     // Catch:{ Exception -> 0x01be }
        L_0x016a:
            sk1.p r0 = new sk1.p     // Catch:{ Exception -> 0x01be }
            r0.<init>(r8)     // Catch:{ Exception -> 0x01be }
            goto L_0x01b7
        L_0x0170:
            te3.t51 r8 = new te3.t51     // Catch:{ Exception -> 0x01be }
            r8.<init>()     // Catch:{ Exception -> 0x01be }
            pe3.b r6 = r3.f186256f     // Catch:{ Exception -> 0x01be }
            if (r6 == 0) goto L_0x017e
            byte[] r6 = r6.mo123703f()     // Catch:{ Exception -> 0x01be }
            goto L_0x017f
        L_0x017e:
            r6 = r2
        L_0x017f:
            if (r6 != 0) goto L_0x0182
            goto L_0x018e
        L_0x0182:
            r8.parseFrom(r6)     // Catch:{ Exception -> 0x0186 }
            goto L_0x018e
        L_0x0186:
            r6 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01be }
            r5[r4] = r6     // Catch:{ Exception -> 0x01be }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r5)     // Catch:{ Exception -> 0x01be }
        L_0x018e:
            sk1.n r0 = new sk1.n     // Catch:{ Exception -> 0x01be }
            r0.<init>(r8)     // Catch:{ Exception -> 0x01be }
            goto L_0x01b7
        L_0x0194:
            te3.d51 r8 = new te3.d51     // Catch:{ Exception -> 0x01be }
            r8.<init>()     // Catch:{ Exception -> 0x01be }
            pe3.b r6 = r3.f186256f     // Catch:{ Exception -> 0x01be }
            if (r6 == 0) goto L_0x01a2
            byte[] r6 = r6.mo123703f()     // Catch:{ Exception -> 0x01be }
            goto L_0x01a3
        L_0x01a2:
            r6 = r2
        L_0x01a3:
            if (r6 != 0) goto L_0x01a6
            goto L_0x01b2
        L_0x01a6:
            r8.parseFrom(r6)     // Catch:{ Exception -> 0x01aa }
            goto L_0x01b2
        L_0x01aa:
            r6 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01be }
            r5[r4] = r6     // Catch:{ Exception -> 0x01be }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r5)     // Catch:{ Exception -> 0x01be }
        L_0x01b2:
            sk1.o r0 = new sk1.o     // Catch:{ Exception -> 0x01be }
            r0.<init>(r8)     // Catch:{ Exception -> 0x01be }
        L_0x01b7:
            r2 = r0
        L_0x01b8:
            if (r2 == 0) goto L_0x01d9
            r2.mo88743i(r3)     // Catch:{ Exception -> 0x01be }
            goto L_0x01d9
        L_0x01be:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e.msg = "
            r0.append(r1)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "FinderLiveUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
        L_0x01d9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.mo87130y1(byte[]):sk1.k");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: te3.l41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: te3.k41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: te3.j41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: te3.l41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: te3.l41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: te3.l41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: te3.l41} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C50401mh0 mo87131z(int r6, java.util.LinkedList<java.lang.Long> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "idList"
            gy3.C87412m.m108594g(r7, r0)
            te3.mh0 r0 = new te3.mh0
            r0.<init>()
            r1 = 0
            switch(r6) {
                case 101: goto L_0x002f;
                case 102: goto L_0x0027;
                case 103: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            r2 = r1
            goto L_0x0036
        L_0x0010:
            te3.j41 r2 = new te3.j41
            r2.<init>()
            java.lang.Object r7 = sx3.C110818d0.m150916N(r7)
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L_0x0022
            long r3 = r7.longValue()
            goto L_0x0024
        L_0x0022:
            r3 = 0
        L_0x0024:
            r2.f135856d = r3
            goto L_0x0036
        L_0x0027:
            te3.k41 r2 = new te3.k41
            r2.<init>()
            r2.f136542d = r7
            goto L_0x0036
        L_0x002f:
            te3.l41 r2 = new te3.l41
            r2.<init>()
            r2.f137160d = r7
        L_0x0036:
            if (r2 == 0) goto L_0x0046
            r0.f138028d = r6
            if (r2 == 0) goto L_0x0040
            byte[] r1 = r2.toByteArray()
        L_0x0040:
            pe3.b r6 = pe3.C89349b.m111674a(r1)
            r0.f138029e = r6
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.mo87131z(int, java.util.LinkedList):te3.mh0");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: sk1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: sk1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: te3.x51} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: te3.x51} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: sk1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: sk1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: sk1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: te3.x51} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: te3.x51} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: te3.x51} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: te3.x51} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: te3.x51} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: te3.x51} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: te3.x51} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: te3.x51} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: te3.x51} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: te3.x51} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: te3.x51} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: te3.x51} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C64822x51 mo87132z1(cm1.C0740i2 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "data"
            gy3.C87412m.m108594g(r4, r0)
            r0 = 0
            boolean r1 = r4 instanceof sk1.C63964u     // Catch:{ Exception -> 0x00af }
            if (r1 == 0) goto L_0x0014
            te3.x51 r1 = new te3.x51     // Catch:{ Exception -> 0x00af }
            r1.<init>()     // Catch:{ Exception -> 0x00af }
            r2 = 4
            r1.f186254d = r2     // Catch:{ Exception -> 0x00af }
            goto L_0x009d
        L_0x0014:
            boolean r1 = r4 instanceof sk1.C13695o     // Catch:{ Exception -> 0x00af }
            if (r1 == 0) goto L_0x0022
            te3.x51 r1 = new te3.x51     // Catch:{ Exception -> 0x00af }
            r1.<init>()     // Catch:{ Exception -> 0x00af }
            r2 = 1
            r1.f186254d = r2     // Catch:{ Exception -> 0x00af }
            goto L_0x009d
        L_0x0022:
            boolean r1 = r4 instanceof sk1.C63959n     // Catch:{ Exception -> 0x00af }
            if (r1 == 0) goto L_0x0030
            te3.x51 r1 = new te3.x51     // Catch:{ Exception -> 0x00af }
            r1.<init>()     // Catch:{ Exception -> 0x00af }
            r2 = 2
            r1.f186254d = r2     // Catch:{ Exception -> 0x00af }
            goto L_0x009d
        L_0x0030:
            boolean r1 = r4 instanceof sk1.C63960p     // Catch:{ Exception -> 0x00af }
            if (r1 == 0) goto L_0x003d
            te3.x51 r1 = new te3.x51     // Catch:{ Exception -> 0x00af }
            r1.<init>()     // Catch:{ Exception -> 0x00af }
            r2 = 3
            r1.f186254d = r2     // Catch:{ Exception -> 0x00af }
            goto L_0x009d
        L_0x003d:
            boolean r1 = r4 instanceof sk1.C63965x     // Catch:{ Exception -> 0x00af }
            if (r1 == 0) goto L_0x004a
            te3.x51 r1 = new te3.x51     // Catch:{ Exception -> 0x00af }
            r1.<init>()     // Catch:{ Exception -> 0x00af }
            r2 = 5
            r1.f186254d = r2     // Catch:{ Exception -> 0x00af }
            goto L_0x009d
        L_0x004a:
            boolean r1 = r4 instanceof sk1.C13696v     // Catch:{ Exception -> 0x00af }
            if (r1 == 0) goto L_0x0057
            te3.x51 r1 = new te3.x51     // Catch:{ Exception -> 0x00af }
            r1.<init>()     // Catch:{ Exception -> 0x00af }
            r2 = 6
            r1.f186254d = r2     // Catch:{ Exception -> 0x00af }
            goto L_0x009d
        L_0x0057:
            boolean r1 = r4 instanceof sk1.C63962r     // Catch:{ Exception -> 0x00af }
            if (r1 == 0) goto L_0x0064
            te3.x51 r1 = new te3.x51     // Catch:{ Exception -> 0x00af }
            r1.<init>()     // Catch:{ Exception -> 0x00af }
            r2 = 7
            r1.f186254d = r2     // Catch:{ Exception -> 0x00af }
            goto L_0x009d
        L_0x0064:
            boolean r1 = r4 instanceof sk1.C63958m     // Catch:{ Exception -> 0x00af }
            if (r1 == 0) goto L_0x0072
            te3.x51 r1 = new te3.x51     // Catch:{ Exception -> 0x00af }
            r1.<init>()     // Catch:{ Exception -> 0x00af }
            r2 = 8
            r1.f186254d = r2     // Catch:{ Exception -> 0x00af }
            goto L_0x009d
        L_0x0072:
            boolean r1 = r4 instanceof sk1.C63957l     // Catch:{ Exception -> 0x00af }
            if (r1 == 0) goto L_0x0080
            te3.x51 r1 = new te3.x51     // Catch:{ Exception -> 0x00af }
            r1.<init>()     // Catch:{ Exception -> 0x00af }
            r2 = 11
            r1.f186254d = r2     // Catch:{ Exception -> 0x00af }
            goto L_0x009d
        L_0x0080:
            boolean r1 = r4 instanceof sk1.C63963s     // Catch:{ Exception -> 0x00af }
            if (r1 == 0) goto L_0x008e
            te3.x51 r1 = new te3.x51     // Catch:{ Exception -> 0x00af }
            r1.<init>()     // Catch:{ Exception -> 0x00af }
            r2 = 12
            r1.f186254d = r2     // Catch:{ Exception -> 0x00af }
            goto L_0x009d
        L_0x008e:
            boolean r1 = r4 instanceof sk1.C63961q     // Catch:{ Exception -> 0x00af }
            if (r1 == 0) goto L_0x009c
            te3.x51 r1 = new te3.x51     // Catch:{ Exception -> 0x00af }
            r1.<init>()     // Catch:{ Exception -> 0x00af }
            r2 = 13
            r1.f186254d = r2     // Catch:{ Exception -> 0x00af }
            goto L_0x009d
        L_0x009c:
            r1 = r0
        L_0x009d:
            if (r1 == 0) goto L_0x00cb
            boolean r2 = r4 instanceof sk1.C63956k     // Catch:{ Exception -> 0x00ac }
            if (r2 == 0) goto L_0x00a6
            r0 = r4
            sk1.k r0 = (sk1.C63956k) r0     // Catch:{ Exception -> 0x00ac }
        L_0x00a6:
            if (r0 == 0) goto L_0x00cb
            r0.mo88744j(r1)     // Catch:{ Exception -> 0x00ac }
            goto L_0x00cb
        L_0x00ac:
            r4 = move-exception
            r0 = r1
            goto L_0x00b0
        L_0x00af:
            r4 = move-exception
        L_0x00b0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "e.msg = "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "FinderLiveUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            r1 = r0
        L_0x00cb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62042e.mo87132z1(cm1.i2):te3.x51");
    }

    /* renamed from: n1 */
    public final void mo87100n1(C48814b61 b612, String str, Context context) {
        C13598b0 b0Var;
        C87412m.m108594g(b612, "<this>");
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(context, "context");
        FinderJumpInfo finderJumpInfo = b612.f130980e;
        String str2 = null;
        if (finderJumpInfo != null) {
            Log.m105924i("FinderLiveUtil", str + " FinderLivePromotionEntrance.jump liteapp");
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76780ML(context, finderJumpInfo, 0);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C48752ar0 ar02 = b612.f130979d;
            String str3 = ar02 != null ? ar02.f130739d : null;
            if (ar02 != null) {
                str2 = ar02.f130740e;
            }
            Log.m105924i("FinderLiveUtil", str + " FinderLivePromotionEntrance.jump appId:" + str3 + ", path:" + str2);
            if (str3 == null || str3.length() == 0) {
                C76912y0.m92767f(context, "请稍候重试");
                return;
            }
            C86299o oVar = new C86299o();
            oVar.f250930b = str3;
            oVar.f250934f = str2;
            oVar.f250932d = 0;
            oVar.f250913B = C90973a0.OPAQUE;
            oVar.f250939k = 1205;
            C91003z zVar = C91003z.POPUP;
            oVar.f250923L = zVar;
            oVar.f250924M = zVar;
            oVar.f250931c = 0;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
        }
    }
}
