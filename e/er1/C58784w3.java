package er1;

import al3.C0086a;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Base64;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bd1.C39759i;
import bd1.C54446b;
import bd1.C54447c;
import bl3.C39818r;
import cm1.C0707a0;
import cm1.C0740i2;
import cm1.C28617v1;
import cm1.C55011a;
import cm1.C55033u;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.autogen.events.FinderExposeInfoChangeEvent;
import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.C2819w0;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.C4091l0;
import com.tencent.p014mm.plugin.finder.view.C4101m0;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.finder.view.C56643n0;
import com.tencent.p014mm.plugin.finder.view.C56645o0;
import com.tencent.p014mm.plugin.finder.view.C56664y5;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.tmassistantsdk.storage.table.ClientInfoTable;
import com.tencent.xweb.file.XVFSFile;
import d62.C7250m;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.z3$$g;
import ef1.C58564i;
import f40.C86709a0;
import f62.C75700k0;
import fe1.C58961d;
import fe1.C58969q;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32226l;
import gg1.C32444a;
import go3.C76003c;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import h81.C59774i;
import ht1.C60152b4;
import ht1.C60184m;
import ht1.C60191o5;
import ht1.C60200t1;
import ht1.C60216z4;
import ht1.C98522w3;
import iy3.C60641c;
import j20.C117292a;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import je1.C9342n1;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9508q;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import ky2.C10432i;
import lc3.C10485b;
import ls3.C61397g;
import nj3.C76912y0;
import o40.C11348f;
import o40.C61926c;
import org.json.JSONObject;
import os1.C11749q;
import p1081gi.C98127h;
import p185kq.C10383h;
import p500dy.C97560f;
import p565ir.C60606n;
import p682rz.C36594q;
import p749xh.C66261f3;
import p749xh.C66276va;
import pe1.C35464c;
import pe3.C89349b;
import pf1.C11911l;
import pf1.C11920q;
import pf1.C62262d0;
import pf1.C62273n;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import qe3.C89625d;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C77407n;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sq1.C64151e;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C22415w0;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C90364q0;
import te3.C49295ek0;
import te3.C49417ff1;
import te3.C50124kf1;
import te3.C50405mi0;
import te3.C50955qg0;
import te3.C51163rv3;
import te3.C51384te1;
import te3.C51691vg0;
import te3.C52192z0;
import te3.C64273c21;
import te3.C64284cg;
import te3.C64311db1;
import te3.C64628pk1;
import te3.C64682rk1;
import te3.C64689rq2;
import te3.C64709se;
import te3.C64899zy;
import te3.m74;
import te3.uc4;
import tf0.C13887q1;
import ue1.C52528f;
import uf0.C102014a;
import uf0.C102016c;
import up1.C27696y;
import up1.C37521f;
import vp1.C65834e;
import vp1.C65840n;
import wp1.C15587j;
import z04.C112550d0;
import z04.C112551y;
import zc1.C66783a;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: er1.w3 */
public final class C58784w3 {

    /* renamed from: a */
    public static final C58784w3 f168295a = new C58784w3();

    /* renamed from: b */
    public static final String f168296b = "Finder.FinderUtil";

    /* renamed from: c */
    public static final int f168297c = ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.ajl));

    /* renamed from: d */
    public static final Set<Integer> f168298d = C22415w0.m26092a(2013);

    /* renamed from: e */
    public static final Set<Integer> f168299e = C22415w0.m26092a(2003);

    /* renamed from: f */
    public static final Rect f168300f = new Rect();

    /* renamed from: g */
    public static long f168301g = -1;

    /* renamed from: h */
    public static final C13601g f168302h = C36568h.m40985a(C7917h.f26599d);

    /* renamed from: i */
    public static final C13601g f168303i = C36568h.m40985a(C7918i.f26600d);

    /* renamed from: j */
    public static final C13601g f168304j = C36568h.m40985a(C7914c.f26595d);

    /* renamed from: k */
    public static final C13601g f168305k = C36568h.m40985a(C7916f.f26598d);

    /* renamed from: l */
    public static final int f168306l = MMApplicationContext.getContext().getResources().getDisplayMetrics().heightPixels;

    /* renamed from: m */
    public static JSONObject f168307m;

    /* renamed from: n */
    public static boolean f168308n = true;

    /* renamed from: o */
    public static int f168309o = C37521f.f99405g4.mo60266n().intValue();

    /* renamed from: p */
    public static int f168310p = C37521f.f99414h4.mo60266n().intValue();

    /* renamed from: q */
    public static HashSet<Integer> f168311q = new HashSet<>();

    /* renamed from: r */
    public static String f168312r;

    /* renamed from: er1.w3$a */
    public static final class C7912a {

        /* renamed from: a */
        public final boolean f26579a;

        /* renamed from: b */
        public final boolean f26580b;

        /* renamed from: c */
        public final boolean f26581c;

        /* renamed from: d */
        public final boolean f26582d;

        /* renamed from: e */
        public final String f26583e;

        /* renamed from: f */
        public final String f26584f;

        /* renamed from: g */
        public final String f26585g;

        /* renamed from: h */
        public final String f26586h;

        /* renamed from: i */
        public final boolean f26587i;

        /* renamed from: j */
        public final boolean f26588j;

        /* renamed from: k */
        public final boolean f26589k;

        /* renamed from: l */
        public boolean f26590l;

        /* renamed from: m */
        public final boolean f26591m;

        public C7912a(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
            C87412m.m108594g(str, "forwardTip");
            C87412m.m108594g(str2, "snsTip");
            C87412m.m108594g(str3, "favTip");
            C87412m.m108594g(str4, "forwardWeWorkTip");
            this.f26579a = z;
            this.f26580b = z2;
            this.f26581c = z3;
            this.f26582d = z4;
            this.f26583e = str;
            this.f26584f = str2;
            this.f26585g = str3;
            this.f26586h = str4;
            this.f26587i = z5;
            this.f26588j = z6;
            this.f26589k = z7;
            this.f26590l = z8;
            this.f26591m = z9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7912a)) {
                return false;
            }
            C7912a aVar = (C7912a) obj;
            return this.f26579a == aVar.f26579a && this.f26580b == aVar.f26580b && this.f26581c == aVar.f26581c && this.f26582d == aVar.f26582d && C87412m.m108589b(this.f26583e, aVar.f26583e) && C87412m.m108589b(this.f26584f, aVar.f26584f) && C87412m.m108589b(this.f26585g, aVar.f26585g) && C87412m.m108589b(this.f26586h, aVar.f26586h) && this.f26587i == aVar.f26587i && this.f26588j == aVar.f26588j && this.f26589k == aVar.f26589k && this.f26590l == aVar.f26590l && this.f26591m == aVar.f26591m;
        }

        public int hashCode() {
            boolean z = this.f26579a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f26580b;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f26581c;
            if (z4) {
                z4 = true;
            }
            int i3 = (i2 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f26582d;
            if (z5) {
                z5 = true;
            }
            int hashCode = (((((((((i3 + (z5 ? 1 : 0)) * 31) + this.f26583e.hashCode()) * 31) + this.f26584f.hashCode()) * 31) + this.f26585g.hashCode()) * 31) + this.f26586h.hashCode()) * 31;
            boolean z6 = this.f26587i;
            if (z6) {
                z6 = true;
            }
            int i4 = (hashCode + (z6 ? 1 : 0)) * 31;
            boolean z7 = this.f26588j;
            if (z7) {
                z7 = true;
            }
            int i5 = (i4 + (z7 ? 1 : 0)) * 31;
            boolean z8 = this.f26589k;
            if (z8) {
                z8 = true;
            }
            int i6 = (i5 + (z8 ? 1 : 0)) * 31;
            boolean z9 = this.f26590l;
            if (z9) {
                z9 = true;
            }
            int i7 = (i6 + (z9 ? 1 : 0)) * 31;
            boolean z15 = this.f26591m;
            if (!z15) {
                z2 = z15;
            }
            return i7 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "ActionMenuInfo(forwardDisable=" + this.f26579a + ", snsDisable=" + this.f26580b + ", favDisable=" + this.f26581c + ", forwardWeWorkDisable=" + this.f26582d + ", forwardTip=" + this.f26583e + ", snsTip=" + this.f26584f + ", favTip=" + this.f26585g + ", forwardWeWorkTip=" + this.f26586h + ", hideForward=" + this.f26587i + ", hideSns=" + this.f26588j + ", hideGlobalFav=" + this.f26589k + ", hideForwardWeWork=" + this.f26590l + ", disableGlobalFav=" + this.f26591m + ')';
        }
    }

    /* renamed from: er1.w3$c */
    public static final class C7914c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7914c f26595d = new C7914c();

        public C7914c() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3705bx));
        }
    }

    /* renamed from: er1.w3$d */
    public static final class C7915d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ String f26596d;

        /* renamed from: e */
        public final /* synthetic */ long f26597e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7915d(String str, long j) {
            super(0);
            this.f26596d = str;
            this.f26597e = j;
        }

        public Object invoke() {
            return "tag=" + this.f26596d + " feedId=" + C61926c.m72691p(this.f26597e);
        }
    }

    /* renamed from: er1.w3$f */
    public static final class C7916f extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C7916f f26598d = new C7916f();

        public C7916f() {
            super(0);
        }

        public Object invoke() {
            long nanoTime = System.nanoTime();
            boolean z = C85875k4.m106208w() || C85875k4.m106157N();
            if (BuildInfo.DEBUG) {
                Log.m105924i("FinderUIToolHelper", "[isFoldableDeviceOrInMagicWindowMode] cost=" + (System.nanoTime() - nanoTime) + "ns");
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: er1.w3$h */
    public static final class C7917h extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7917h f26599d = new C7917h();

        public C7917h() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C75044y4.m89994f(MMApplicationContext.getContext()));
        }
    }

    /* renamed from: er1.w3$i */
    public static final class C7918i extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7918i f26600d = new C7918i();

        public C7918i() {
            super(0);
        }

        public Object invoke() {
            C58784w3.f168295a.getClass();
            return Integer.valueOf(((Number) ((C36570n) C58784w3.f168302h).getValue()).intValue() + C75044y4.m89989a(MMApplicationContext.getContext()));
        }
    }

    /* renamed from: er1.w3$e */
    public static final class C58785e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C28617v1 f168313d;

        /* renamed from: e */
        public final /* synthetic */ String f168314e;

        /* renamed from: er1.w3$e$a */
        public static final class C58786a implements z3$$g {

            /* renamed from: d */
            public final /* synthetic */ C52528f f168315d;

            public C58786a(C52528f fVar) {
                this.f168315d = fVar;
            }

            /* renamed from: b */
            public boolean mo24603b() {
                return false;
            }

            /* renamed from: c */
            public void mo24604c() {
                String str = C58784w3.f168296b;
                Log.m105924i(str, "delete msg end... " + this.f168315d.f146722a1 + ' ' + this.f168315d.field_sessionId);
            }
        }

        /* renamed from: er1.w3$e$b */
        public static final class C58787b extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public final /* synthetic */ Exception f168316d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58787b(Exception exc) {
                super(0);
                this.f168316d = exc;
            }

            public Object invoke() {
                String message = this.f168316d.getMessage();
                return message == null ? "" : message;
            }
        }

        public C58785e(C28617v1 v1Var, String str) {
            this.f168313d = v1Var;
            this.f168314e = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0020 A[Catch:{ Exception -> 0x003c }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0057 A[Catch:{ Exception -> 0x003c }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x005c A[Catch:{ Exception -> 0x003c }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0073 A[Catch:{ Exception -> 0x003c }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0075 A[Catch:{ Exception -> 0x003c }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0078 A[Catch:{ Exception -> 0x003c }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0094 A[Catch:{ Exception -> 0x003c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r16 = this;
                r1 = r16
                com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MY_FINDER_ALIAS_MSG_USERNAME_STRING_SYNC
                java.lang.String r2 = ""
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r3 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                r4 = 0
                cm1.v1 r5 = r1.f168313d     // Catch:{ Exception -> 0x003c }
                java.lang.String r6 = "[delAliasInfo] source:"
                r7 = 1
                if (r5 == 0) goto L_0x003f
                java.lang.String r5 = r5.field_username     // Catch:{ Exception -> 0x003c }
                if (r5 == 0) goto L_0x001d
                int r5 = r5.length()     // Catch:{ Exception -> 0x003c }
                if (r5 != 0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r5 = 0
                goto L_0x001e
            L_0x001d:
                r5 = 1
            L_0x001e:
                if (r5 == 0) goto L_0x003f
                java.lang.String r0 = er1.C58784w3.f168296b     // Catch:{ Exception -> 0x003c }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c }
                r3.<init>()     // Catch:{ Exception -> 0x003c }
                r3.append(r6)     // Catch:{ Exception -> 0x003c }
                java.lang.String r5 = r1.f168314e     // Catch:{ Exception -> 0x003c }
                r3.append(r5)     // Catch:{ Exception -> 0x003c }
                java.lang.String r5 = " , deletingInfo empty"
                r3.append(r5)     // Catch:{ Exception -> 0x003c }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x003c }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ Exception -> 0x003c }
                return
            L_0x003c:
                r0 = move-exception
                goto L_0x0203
            L_0x003f:
                cm1.v1 r5 = r1.f168313d     // Catch:{ Exception -> 0x003c }
                if (r5 == 0) goto L_0x0054
                java.lang.String r5 = r5.field_username     // Catch:{ Exception -> 0x003c }
                if (r5 == 0) goto L_0x0054
                int r5 = r5.length()     // Catch:{ Exception -> 0x003c }
                if (r5 <= 0) goto L_0x004f
                r5 = 1
                goto L_0x0050
            L_0x004f:
                r5 = 0
            L_0x0050:
                if (r5 != r7) goto L_0x0054
                r5 = 1
                goto L_0x0055
            L_0x0054:
                r5 = 0
            L_0x0055:
                if (r5 == 0) goto L_0x005c
                cm1.v1 r5 = r1.f168313d     // Catch:{ Exception -> 0x003c }
                java.lang.String r5 = r5.field_username     // Catch:{ Exception -> 0x003c }
                goto L_0x0068
            L_0x005c:
                f40.o r5 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x003c }
                com.tencent.mm.storage.v1 r5 = r5.mo121142i()     // Catch:{ Exception -> 0x003c }
                java.lang.String r5 = r5.mo119675I(r0, r2)     // Catch:{ Exception -> 0x003c }
            L_0x0068:
                java.lang.String r8 = "aliasUserName"
                gy3.C87412m.m108593f(r5, r8)     // Catch:{ Exception -> 0x003c }
                int r8 = r5.length()     // Catch:{ Exception -> 0x003c }
                if (r8 != 0) goto L_0x0075
                r8 = 1
                goto L_0x0076
            L_0x0075:
                r8 = 0
            L_0x0076:
                if (r8 == 0) goto L_0x0094
                java.lang.String r0 = er1.C58784w3.f168296b     // Catch:{ Exception -> 0x003c }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c }
                r3.<init>()     // Catch:{ Exception -> 0x003c }
                r3.append(r6)     // Catch:{ Exception -> 0x003c }
                java.lang.String r5 = r1.f168314e     // Catch:{ Exception -> 0x003c }
                r3.append(r5)     // Catch:{ Exception -> 0x003c }
                java.lang.String r5 = " ,aliasUserName empty return "
                r3.append(r5)     // Catch:{ Exception -> 0x003c }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x003c }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ Exception -> 0x003c }
                return
            L_0x0094:
                cm1.v1 r8 = r1.f168313d     // Catch:{ Exception -> 0x003c }
                if (r8 != 0) goto L_0x00c6
                cm1.v1 r8 = new cm1.v1     // Catch:{ Exception -> 0x003c }
                r8.<init>()     // Catch:{ Exception -> 0x003c }
                r8.field_username = r5     // Catch:{ Exception -> 0x003c }
                r9 = 2
                r8.field_type = r9     // Catch:{ Exception -> 0x003c }
                di3.d r9 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x003c }
                com.tencent.mm.plugin.FinderCommonFeatureService r9 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r9     // Catch:{ Exception -> 0x003c }
                up1.i0 r9 = r9.Gx0()     // Catch:{ Exception -> 0x003c }
                boolean r9 = r9.insert(r8)     // Catch:{ Exception -> 0x003c }
                java.lang.String r10 = er1.C58784w3.f168296b     // Catch:{ Exception -> 0x003c }
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c }
                r11.<init>()     // Catch:{ Exception -> 0x003c }
                java.lang.String r12 = "[delAliasInfo] insert DeletingInfo Result : "
                r11.append(r12)     // Catch:{ Exception -> 0x003c }
                r11.append(r9)     // Catch:{ Exception -> 0x003c }
                java.lang.String r9 = r11.toString()     // Catch:{ Exception -> 0x003c }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)     // Catch:{ Exception -> 0x003c }
            L_0x00c6:
                java.lang.String r9 = er1.C58784w3.f168296b     // Catch:{ Exception -> 0x003c }
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c }
                r10.<init>()     // Catch:{ Exception -> 0x003c }
                r10.append(r6)     // Catch:{ Exception -> 0x003c }
                java.lang.String r6 = r1.f168314e     // Catch:{ Exception -> 0x003c }
                r10.append(r6)     // Catch:{ Exception -> 0x003c }
                java.lang.String r6 = " ,aliasUserName:"
                r10.append(r6)     // Catch:{ Exception -> 0x003c }
                r10.append(r5)     // Catch:{ Exception -> 0x003c }
                java.lang.String r6 = r10.toString()     // Catch:{ Exception -> 0x003c }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)     // Catch:{ Exception -> 0x003c }
                di3.d r6 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x003c }
                com.tencent.mm.plugin.FinderCommonFeatureService r6 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r6     // Catch:{ Exception -> 0x003c }
                up1.l0 r6 = r6.mo76736Au()     // Catch:{ Exception -> 0x003c }
                di3.d r9 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x003c }
                com.tencent.mm.plugin.FinderCommonFeatureService r9 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r9     // Catch:{ Exception -> 0x003c }
                up1.j r9 = r9.mo76776L4()     // Catch:{ Exception -> 0x003c }
                java.util.LinkedList r10 = r6.mo73560qq(r5)     // Catch:{ Exception -> 0x003c }
                if (r10 == 0) goto L_0x0195
                java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x003c }
                r12 = 0
            L_0x0103:
                boolean r13 = r10.hasNext()     // Catch:{ Exception -> 0x003c }
                if (r13 == 0) goto L_0x0195
                java.lang.Object r13 = r10.next()     // Catch:{ Exception -> 0x003c }
                int r14 = r12 + 1
                if (r12 < 0) goto L_0x0190
                ue1.f0 r13 = (ue1.C37429f0) r13     // Catch:{ Exception -> 0x003c }
                java.lang.String r12 = r13.field_sessionId     // Catch:{ Exception -> 0x003c }
                java.lang.String r13 = "it.field_sessionId"
                gy3.C87412m.m108593f(r12, r13)     // Catch:{ Exception -> 0x003c }
                ue1.f r12 = r9.get(r12)     // Catch:{ Exception -> 0x003c }
                r15 = r8
                long r7 = r12.systemRowid     // Catch:{ Exception -> 0x003c }
                boolean r7 = r9.deleteNotify(r7, r4)     // Catch:{ Exception -> 0x003c }
                java.lang.String r8 = er1.C58784w3.f168296b     // Catch:{ Exception -> 0x003c }
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c }
                r13.<init>()     // Catch:{ Exception -> 0x003c }
                java.lang.String r11 = "delete conv begin["
                r13.append(r11)     // Catch:{ Exception -> 0x003c }
                r13.append(r7)     // Catch:{ Exception -> 0x003c }
                java.lang.String r11 = "]... "
                r13.append(r11)     // Catch:{ Exception -> 0x003c }
                java.lang.String r11 = r12.f146722a1     // Catch:{ Exception -> 0x003c }
                r13.append(r11)     // Catch:{ Exception -> 0x003c }
                r11 = 32
                r13.append(r11)     // Catch:{ Exception -> 0x003c }
                java.lang.String r11 = r12.field_sessionId     // Catch:{ Exception -> 0x003c }
                r13.append(r11)     // Catch:{ Exception -> 0x003c }
                java.lang.String r11 = r13.toString()     // Catch:{ Exception -> 0x003c }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r11)     // Catch:{ Exception -> 0x003c }
                if (r7 == 0) goto L_0x015b
                java.lang.String r7 = r12.field_sessionId     // Catch:{ Exception -> 0x003c }
                er1.w3$e$a r11 = new er1.w3$e$a     // Catch:{ Exception -> 0x003c }
                r11.<init>(r12)     // Catch:{ Exception -> 0x003c }
                eb0.C75604z3.m90836h(r7, r11)     // Catch:{ Exception -> 0x003c }
            L_0x015b:
                java.lang.String r7 = r12.field_sessionId     // Catch:{ Exception -> 0x003c }
                java.lang.String r11 = "conv.field_sessionId"
                gy3.C87412m.m108593f(r7, r11)     // Catch:{ Exception -> 0x003c }
                r6.mo73559jo(r7, r4)     // Catch:{ Exception -> 0x003c }
                java.lang.String r7 = r12.field_sessionId     // Catch:{ Exception -> 0x003c }
                r11 = 6
                r9.doNotify(r7, r11, r12)     // Catch:{ Exception -> 0x003c }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c }
                r7.<init>()     // Catch:{ Exception -> 0x003c }
                java.lang.String r11 = "delete conv end... "
                r7.append(r11)     // Catch:{ Exception -> 0x003c }
                java.lang.String r11 = r12.f146722a1     // Catch:{ Exception -> 0x003c }
                r7.append(r11)     // Catch:{ Exception -> 0x003c }
                r11 = 32
                r7.append(r11)     // Catch:{ Exception -> 0x003c }
                java.lang.String r11 = r12.field_sessionId     // Catch:{ Exception -> 0x003c }
                r7.append(r11)     // Catch:{ Exception -> 0x003c }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x003c }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)     // Catch:{ Exception -> 0x003c }
                r12 = r14
                r8 = r15
                r7 = 1
                goto L_0x0103
            L_0x0190:
                sx3.C64197v.m75542k()     // Catch:{ Exception -> 0x003c }
                r6 = 0
                throw r6     // Catch:{ Exception -> 0x003c }
            L_0x0195:
                r15 = r8
                r6 = 0
                di3.d r7 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x003c }
                com.tencent.mm.plugin.FinderCommonFeatureService r7 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r7     // Catch:{ Exception -> 0x003c }
                up1.c0 r7 = r7.Jx0()     // Catch:{ Exception -> 0x003c }
                fe1.q r5 = r7.mo89497jo(r5)     // Catch:{ Exception -> 0x003c }
                if (r5 == 0) goto L_0x01c8
                long r7 = r5.systemRowid     // Catch:{ Exception -> 0x003c }
                r9 = -1
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 == 0) goto L_0x01b1
                r7 = 1
                goto L_0x01b2
            L_0x01b1:
                r7 = 0
            L_0x01b2:
                if (r7 == 0) goto L_0x01b6
                r11 = r5
                goto L_0x01b7
            L_0x01b6:
                r11 = r6
            L_0x01b7:
                if (r11 == 0) goto L_0x01c8
                di3.d r5 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x003c }
                com.tencent.mm.plugin.FinderCommonFeatureService r5 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r5     // Catch:{ Exception -> 0x003c }
                up1.c0 r5 = r5.Jx0()     // Catch:{ Exception -> 0x003c }
                long r6 = r11.systemRowid     // Catch:{ Exception -> 0x003c }
                r5.delete(r6)     // Catch:{ Exception -> 0x003c }
            L_0x01c8:
                f40.o r5 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x003c }
                com.tencent.mm.storage.v1 r5 = r5.mo121142i()     // Catch:{ Exception -> 0x003c }
                com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MY_FINDER_ALIAS_NICKNAME_STRING_SYNC     // Catch:{ Exception -> 0x003c }
                r5.mo119677K(r6, r2)     // Catch:{ Exception -> 0x003c }
                f40.o r5 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x003c }
                com.tencent.mm.storage.v1 r5 = r5.mo121142i()     // Catch:{ Exception -> 0x003c }
                com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MY_FINDER_ALIAS_AVATAR_URL_STRING_SYNC     // Catch:{ Exception -> 0x003c }
                r5.mo119677K(r6, r2)     // Catch:{ Exception -> 0x003c }
                f40.o r5 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x003c }
                com.tencent.mm.storage.v1 r5 = r5.mo121142i()     // Catch:{ Exception -> 0x003c }
                r5.mo119677K(r0, r2)     // Catch:{ Exception -> 0x003c }
                di3.d r0 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x003c }
                com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0     // Catch:{ Exception -> 0x003c }
                up1.i0 r0 = r0.Gx0()     // Catch:{ Exception -> 0x003c }
                java.lang.String r3 = "username"
                java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ Exception -> 0x003c }
                r8 = r15
                r0.delete(r8, r3)     // Catch:{ Exception -> 0x003c }
                return
            L_0x0203:
                java.lang.String r3 = er1.C58784w3.f168296b
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "[delAliasInfo]  exception:"
                r5.append(r6)
                java.lang.String r6 = r0.getMessage()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                java.lang.Object[] r4 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r4)
                ft1.a r5 = ft1.C59319a.f169618b
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                er1.w3$e$b r11 = new er1.w3$e$b
                r11.<init>(r0)
                r12 = 28
                r13 = 0
                java.lang.String r6 = "delAliasInfo"
                o40.C11348f.C11349a.m11178b(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: er1.C58784w3.C58785e.run():void");
        }
    }

    /* renamed from: er1.w3$g */
    public static final class C58788g implements C76912y0.C61776j {

        /* renamed from: a */
        public static final C58788g f168317a = new C58788g();

        /* renamed from: a */
        public final void mo596a(View view) {
            TextView textView;
            if (view != null && (textView = (TextView) view.findViewById(C0966R.C0970id.kpy)) != null) {
                textView.setTextSize(1, 14.0f);
            }
        }
    }

    static {
        MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3723cd);
        boolean z = BuildInfo.DEBUG;
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        fVar.getClass();
        MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
    }

    /* renamed from: B1 */
    public static /* synthetic */ void m68427B1(C58784w3 w3Var, int i, List list, C89349b bVar, Intent intent, C2780c cVar, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            cVar = null;
        }
        w3Var.mo83856A1(i, list, bVar, intent, cVar);
    }

    /* renamed from: E1 */
    public static void m68428E1(C58784w3 w3Var, ImageView imageView, int i, String str, int i2, int i3, Object obj) {
        int i4 = (i3 & 8) != 0 ? 1 : i2;
        w3Var.getClass();
        C87412m.m108594g(imageView, "view");
        if (i > 0) {
            FinderAuthInfo finderAuthInfo = new FinderAuthInfo();
            finderAuthInfo.authIconType = i;
            finderAuthInfo.authIconUrl = str;
            C13598b0 b0Var = C13598b0.f38549a;
            m68429F1(w3Var, imageView, finderAuthInfo, i4, (C64284cg) null, 8, (Object) null);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: F1 */
    public static /* synthetic */ void m68429F1(C58784w3 w3Var, ImageView imageView, FinderAuthInfo finderAuthInfo, int i, C64284cg cgVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        if ((i2 & 8) != 0) {
            cgVar = null;
        }
        w3Var.mo83864D1(imageView, finderAuthInfo, i, cgVar);
    }

    /* renamed from: G */
    public static String m68430G(C58784w3 w3Var, int i, boolean z, boolean z2, int i2, Object obj) {
        w3Var.getClass();
        return ((C13887q1) C86312j.m106911c(C13887q1.class)).Gc0((long) i);
    }

    /* renamed from: K */
    public static C7912a m68431K(C58784w3 w3Var, Context context, BaseFinderFeed baseFinderFeed, int i, C32226l lVar, C32226l lVar2, int i2, Object obj) {
        String str;
        String str2;
        String str3;
        C58784w3 w3Var2 = w3Var;
        Context context2 = context;
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        C32226l lVar3 = null;
        C32226l lVar4 = (i2 & 8) != 0 ? null : lVar;
        if ((i2 & 16) == 0) {
            lVar3 = lVar2;
        }
        w3Var.getClass();
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(baseFinderFeed2, "feed");
        String string = context2.getString(C0966R.string.f360098a33);
        C87412m.m108593f(string, "context.getString(com.te…ring.app_share_to_weixin)");
        String string2 = context2.getString(C0966R.string.epb);
        C87412m.m108593f(string2, "context.getString(com.te…ng.finder_share_timeline)");
        String string3 = context2.getString(C0966R.string.cmx);
        C87412m.m108593f(string3, "context.getString(com.te…ibmmui.R.string.favorite)");
        String string4 = context2.getString(C0966R.string.n4j);
        C87412m.m108593f(string4, "context.getString(com.te…sation_forward_to_wework)");
        String str4 = f168296b;
        Log.m105924i(str4, "getActionMenuInfo lxl object Status: " + baseFinderFeed.mo3513o().getFeedObject().objectStatus + " isOnlySelfSee=" + baseFinderFeed.mo3513o().isOnlySelfSee() + " isSelf=" + w3Var2.mo83897Q0(baseFinderFeed2) + " objectStatus:" + baseFinderFeed.mo3513o().getFeedObject().objectDesc);
        if (lVar4 != null && baseFinderFeed.mo3513o().isOnlySelfSee() && w3Var2.mo83897Q0(baseFinderFeed2)) {
            C58749n1.f168219a.mo83749b(context2, baseFinderFeed2, 2, lVar4);
        }
        boolean isNotShareSns = baseFinderFeed.mo3513o().isNotShareSns();
        boolean isNotShareConversation = baseFinderFeed.mo3513o().isNotShareConversation();
        boolean z = !w3Var2.mo83924e(baseFinderFeed.mo3513o().getFeedObject()) || baseFinderFeed.mo3513o().isOnlySelfSee();
        String obj2 = C112550d0.m153799i0(baseFinderFeed.mo3513o().getNotShareMsg()).toString();
        C87412m.m108594g(obj2, "tips");
        List U = C112550d0.m153785U(obj2, new String[]{"#"}, false, 0, 6, (Object) null);
        String str5 = "";
        if (U.size() >= 3) {
            String str6 = (String) C110818d0.m150917O(U, 0);
            if (str6 == null) {
                str6 = str5;
            }
            str = (String) C110818d0.m150917O(U, 1);
            if (str == null) {
                str = str5;
            }
            String str7 = (String) C110818d0.m150917O(U, 2);
            if (str7 != null) {
                str5 = str7;
            }
            str2 = str5;
            str5 = str6;
        } else {
            str2 = str5;
            str = str2;
        }
        if (Util.isNullOrNil(str5)) {
            str5 = f168295a.mo83911Y("FinderSafeSelfSeeForward", C0966R.string.eo6);
        }
        if (Util.isNullOrNil(str)) {
            str = f168295a.mo83911Y("FinderSafeSelfSeeShare", C0966R.string.eo7);
        }
        if (Util.isNullOrNil(str2) && (str2 = C15587j.f42215a.mo14350b("FinderObjectDynamicItemKey_FinderSelfSeeTipsFav")) == null) {
            str2 = f168295a.mo83911Y("FinderSafeSelfSeeCollect", C0966R.string.eo5);
        }
        if (isNotShareConversation) {
            str3 = str5;
        } else {
            str5 = string;
            str3 = string4;
        }
        if (isNotShareSns) {
            string2 = str;
        }
        String str8 = z ? str2 : string3;
        boolean z2 = baseFinderFeed.mo3513o().getMediaType() == 9;
        FinderObject feedObject = baseFinderFeed.mo3513o().getFeedObject();
        C87412m.m108594g(feedObject, C66261f3.COL_FINDEROBJECT);
        boolean z3 = ((feedObject.permissionFlag & 131072) > 0) || z2;
        FinderObject feedObject2 = baseFinderFeed.mo3513o().getFeedObject();
        C87412m.m108594g(feedObject2, C66261f3.COL_FINDEROBJECT);
        boolean z4 = ((feedObject2.permissionFlag & 262144) > 0) || z2;
        boolean A0 = w3Var2.mo83855A0(baseFinderFeed.mo3513o().getFeedObject());
        FinderObject feedObject3 = baseFinderFeed.mo3513o().getFeedObject();
        C87412m.m108594g(feedObject3, C66261f3.COL_FINDEROBJECT);
        boolean z5 = (feedObject3.permissionFlag & 16384) > 0;
        C64273c21 c212 = feedObject3.liveInfo;
        C7912a aVar = new C7912a(isNotShareConversation, isNotShareSns, z, isNotShareConversation, str5, string2, str8, str3, A0, z5 || (c212 != null ? w3Var2.mo83930g(c212.f182385X0) ^ true : false), z3, w3Var2.mo83858B0(context2, baseFinderFeed.mo3513o()), z4);
        if (lVar3 != null && !w3Var2.mo83858B0(context2, baseFinderFeed.mo3513o())) {
            C7250m.m7431a().mo136258Vg(context2, new C7785b4(aVar, lVar3));
        }
        return aVar;
    }

    /* renamed from: N1 */
    public static final String m68432N1(int i) {
        int hashCode;
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        decimalFormat.setRoundingMode(RoundingMode.FLOOR);
        String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        if (currentLanguage == null || ((hashCode = currentLanguage.hashCode()) == 115861276 ? !currentLanguage.equals("zh_CN") : hashCode == 115861428 ? !currentLanguage.equals("zh_HK") : !(hashCode == 115861812 && currentLanguage.equals("zh_TW")))) {
            return decimalFormat.format(Float.valueOf(((float) i) / ((float) 1000))) + MMApplicationContext.getContext().getString(C0966R.string.erw);
        }
        return decimalFormat.format(Float.valueOf(((float) i) / ((float) 10000))) + MMApplicationContext.getContext().getString(C0966R.string.erv);
    }

    /* renamed from: S */
    public static /* synthetic */ String m68433S(C58784w3 w3Var, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return w3Var.mo83898R(str, str2, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: cm1.i2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: cm1.i2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: cm1.i2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: cm1.i2} */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0141, code lost:
        if ((r9 != null && r9.mo3477K()) != false) goto L_0x0146;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x00ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0149  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List m68434Z(er1.C58784w3 r5, int r6, te3.C49712hj1 r7, int r8, boolean r9, boolean r10, boolean r11, int r12, java.lang.Object r13) {
        /*
            r13 = r12 & 2
            r0 = 0
            if (r13 == 0) goto L_0x0006
            r7 = r0
        L_0x0006:
            r13 = r12 & 4
            r1 = 0
            if (r13 == 0) goto L_0x000c
            r8 = 0
        L_0x000c:
            r13 = r12 & 8
            if (r13 == 0) goto L_0x0011
            r9 = 0
        L_0x0011:
            r13 = r12 & 16
            if (r13 == 0) goto L_0x0016
            r10 = 0
        L_0x0016:
            r12 = r12 & 32
            if (r12 == 0) goto L_0x001b
            r11 = 0
        L_0x001b:
            r5.getClass()
            java.lang.Class<dp1.y0> r5 = dp1.C58417y0.class
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            bl3.r r13 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r13 = r13.mo62446e(r2)
            java.lang.Class<os1.f> r2 = os1.C11739f.class
            androidx.lifecycle.i0 r13 = r13.mo75002a(r2)
            os1.f r13 = (os1.C11739f) r13
            os1.f$a r6 = r13.mo11600c3(r6)
            java.util.ArrayList<cm1.i2> r13 = r6.f34369b
            boolean r13 = r13.isEmpty()
            r2 = 1
            if (r13 == 0) goto L_0x00f4
            if (r9 != 0) goto L_0x00f4
            vp1.o$a r9 = vp1.C14937o.f40972a
            r10 = 2
            java.util.List r8 = vp1.C14937o.C14938a.m14143i(r9, r8, r0, r10, r0)
            java.util.Iterator r9 = r8.iterator()
        L_0x004f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00a5
            java.lang.Object r10 = r9.next()
            cm1.i2 r10 = (cm1.C0740i2) r10
            boolean r13 = r10 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r13 == 0) goto L_0x004f
            if (r7 == 0) goto L_0x0077
            di3.d r13 = di3.C86312j.m106911c(r5)
            dp1.y0 r13 = (dp1.C58417y0) r13
            r3 = r10
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r3
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            int r4 = r7.f134675i
            r13.j80(r3, r4)
        L_0x0077:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r10
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r10.mo3513o()
            java.util.List r10 = r10.getFoldedFeedList()
            java.util.Iterator r10 = r10.iterator()
        L_0x0085:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x004f
            java.lang.Object r13 = r10.next()
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r13 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r13
            di3.d r3 = di3.C86312j.m106911c(r5)
            dp1.y0 r3 = (dp1.C58417y0) r3
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r13.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.getFeedObject()
            r4 = 14
            r3.j80(r13, r4)
            goto L_0x0085
        L_0x00a5:
            if (r7 == 0) goto L_0x00f0
            vp1.e r5 = vp1.C65834e.f189316a
            int r7 = r7.f134675i
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r8.iterator()
        L_0x00b4:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x00c6
            java.lang.Object r13 = r10.next()
            boolean r3 = r13 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r3 == 0) goto L_0x00b4
            r9.add(r13)
            goto L_0x00b4
        L_0x00c6:
            java.util.ArrayList r10 = new java.util.ArrayList
            r13 = 10
            int r13 = sx3.C36907w.m41090l(r9, r13)
            r10.<init>(r13)
            java.util.Iterator r9 = r9.iterator()
        L_0x00d5:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x00ed
            java.lang.Object r13 = r9.next()
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r13 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r13
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r13.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.getFeedObject()
            r10.add(r13)
            goto L_0x00d5
        L_0x00ed:
            r5.mo89867a(r7, r10)
        L_0x00f0:
            r12.addAll(r8)
            goto L_0x0150
        L_0x00f4:
            java.util.ArrayList<cm1.i2> r5 = r6.f34369b
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00ff:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x014d
            java.lang.Object r8 = r5.next()
            r9 = r8
            cm1.i2 r9 = (cm1.C0740i2) r9
            int r13 = r9.mo75c()
            r3 = 2011(0x7db, float:2.818E-42)
            if (r13 == r3) goto L_0x0146
            int r13 = r9.mo75c()
            r3 = 2010(0x7da, float:2.817E-42)
            if (r13 == r3) goto L_0x0146
            int r13 = r9.mo75c()
            r3 = 2013(0x7dd, float:2.821E-42)
            if (r13 == r3) goto L_0x0146
            int r13 = r9.mo75c()
            r3 = 2014(0x7de, float:2.822E-42)
            if (r13 == r3) goto L_0x0146
            if (r10 == 0) goto L_0x0144
            boolean r13 = r9 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r13 == 0) goto L_0x0135
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r9
            goto L_0x0136
        L_0x0135:
            r9 = r0
        L_0x0136:
            if (r9 == 0) goto L_0x0140
            boolean r9 = r9.mo3477K()
            if (r9 != r2) goto L_0x0140
            r9 = 1
            goto L_0x0141
        L_0x0140:
            r9 = 0
        L_0x0141:
            if (r9 == 0) goto L_0x0144
            goto L_0x0146
        L_0x0144:
            r9 = 0
            goto L_0x0147
        L_0x0146:
            r9 = 1
        L_0x0147:
            if (r9 != 0) goto L_0x00ff
            r7.add(r8)
            goto L_0x00ff
        L_0x014d:
            r12.addAll(r7)
        L_0x0150:
            if (r11 == 0) goto L_0x0185
            long r7 = r6.f34373f
            r9 = 0
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0185
            java.util.Iterator r5 = r12.iterator()
        L_0x015e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x017b
            java.lang.Object r7 = r5.next()
            r8 = r7
            cm1.i2 r8 = (cm1.C0740i2) r8
            long r8 = r8.getItemId()
            long r10 = r6.f34373f
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x0177
            r8 = 1
            goto L_0x0178
        L_0x0177:
            r8 = 0
        L_0x0178:
            if (r8 == 0) goto L_0x015e
            r0 = r7
        L_0x017b:
            cm1.i2 r0 = (cm1.C0740i2) r0
            if (r0 == 0) goto L_0x0185
            r12.remove(r0)
            r12.addFirst(r0)
        L_0x0185:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r12.iterator()
        L_0x018e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x01b7
            java.lang.Object r7 = r6.next()
            r8 = r7
            cm1.i2 r8 = (cm1.C0740i2) r8
            boolean r9 = r8 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r9 == 0) goto L_0x01b0
            er1.w3 r9 = f168295a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r8
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.getFeedObject()
            boolean r8 = r9.mo83866E0(r8)
            goto L_0x01b1
        L_0x01b0:
            r8 = 1
        L_0x01b1:
            if (r8 == 0) goto L_0x018e
            r5.add(r7)
            goto L_0x018e
        L_0x01b7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58784w3.m68434Z(er1.w3, int, te3.hj1, int, boolean, boolean, boolean, int, java.lang.Object):java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(1:2)|3|(1:5)|6|(1:8)|9|(1:13)|14|15|16|(1:18)|(2:20|(2:22|(2:24|(2:26|(2:28|(3:30|31|32))(1:33))(1:34))(1:35))(1:36))|37|38|39|40|41|45) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m68435a(er1.C58784w3 r6, android.content.Intent r7, int r8, java.lang.String r9, int r10, java.lang.Object r11) {
        /*
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto L_0x0006
            r8 = 0
        L_0x0006:
            r10 = r10 & 4
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x000d
            r9 = r11
        L_0x000d:
            r6.getClass()
            java.lang.String r6 = "url"
            java.lang.String r10 = "bizuin"
            java.lang.String r1 = "intent"
            gy3.C87412m.m108594g(r7, r1)
            java.lang.String r1 = "enterExtraInfo"
            gy3.C87412m.m108594g(r9, r1)
            if (r8 <= 0) goto L_0x0022
            goto L_0x0028
        L_0x0022:
            java.lang.String r8 = "report_scene"
            int r8 = r7.getIntExtra(r8, r0)
        L_0x0028:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r1 != 0) goto L_0x002f
            goto L_0x0038
        L_0x002f:
            java.lang.String r9 = "key_extra_info"
            java.lang.String r9 = r7.getStringExtra(r9)
            if (r9 != 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r11 = r9
        L_0x0039:
            java.lang.String r9 = "KEY_SEARCH_WRORD"
            java.lang.String r9 = r7.getStringExtra(r9)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00f8 }
            r1.<init>()     // Catch:{ Exception -> 0x00f8 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00f8 }
            r2.<init>()     // Catch:{ Exception -> 0x00f8 }
            if (r9 == 0) goto L_0x0050
            java.lang.String r3 = "search_word"
            r2.put(r3, r9)     // Catch:{ Exception -> 0x00f8 }
        L_0x0050:
            if (r8 <= 0) goto L_0x00ca
            r9 = 1
            java.lang.String r3 = "key_from_user_name"
            java.lang.String r4 = "wx_chat_id"
            java.lang.String r5 = "from_user"
            if (r8 == r9) goto L_0x00bc
            r9 = 2
            if (r8 == r9) goto L_0x00a2
            r9 = 3
            if (r8 == r9) goto L_0x009a
            r9 = 11
            if (r8 == r9) goto L_0x0086
            r6 = 2000(0x7d0, float:2.803E-42)
            if (r8 == r6) goto L_0x006b
            goto L_0x00ca
        L_0x006b:
            java.lang.String r6 = "export_url"
            java.lang.String r8 = "KEY_SCAN_EXPORT_URL"
            java.lang.String r8 = r7.getStringExtra(r8)     // Catch:{ Exception -> 0x00f8 }
            r2.put(r6, r8)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r6 = "scan_type"
            java.lang.String r8 = "KEY_SCAN_TYPE"
            int r8 = r7.getIntExtra(r8, r0)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00f8 }
            r2.put(r6, r8)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x00ca
        L_0x0086:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x00f8 }
            r8.<init>(r11)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r9 = r8.optString(r10)     // Catch:{ Exception -> 0x00f8 }
            r2.put(r10, r9)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r8 = r8.optString(r6)     // Catch:{ Exception -> 0x00f8 }
            r2.put(r6, r8)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x00ca
        L_0x009a:
            java.lang.String r6 = r7.getStringExtra(r5)     // Catch:{ Exception -> 0x00f8 }
            r2.put(r5, r6)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x00ca
        L_0x00a2:
            java.lang.String r6 = r7.getStringExtra(r5)     // Catch:{ Exception -> 0x00f8 }
            r2.put(r5, r6)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r6 = "roomid"
            java.lang.String r8 = "key_to_user_name"
            java.lang.String r8 = r7.getStringExtra(r8)     // Catch:{ Exception -> 0x00f8 }
            r2.put(r6, r8)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r6 = r7.getStringExtra(r3)     // Catch:{ Exception -> 0x00f8 }
            r2.put(r4, r6)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x00ca
        L_0x00bc:
            java.lang.String r6 = r7.getStringExtra(r5)     // Catch:{ Exception -> 0x00f8 }
            r2.put(r5, r6)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r6 = r7.getStringExtra(r3)     // Catch:{ Exception -> 0x00f8 }
            r2.put(r4, r6)     // Catch:{ Exception -> 0x00f8 }
        L_0x00ca:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e2 }
            r6.<init>(r11)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r8 = "mini_prog_id"
            java.lang.String r9 = "weapp_info"
            org.json.JSONObject r6 = r6.optJSONObject(r9)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r9 = "appid"
            java.lang.String r6 = r6.optString(r9)     // Catch:{ Exception -> 0x00e2 }
            r2.put(r8, r6)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x00e9
        L_0x00e2:
            java.lang.String r6 = f168296b     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r8 = "[addClientReportBuffInfo], mini_prog_id null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)     // Catch:{ Exception -> 0x00f8 }
        L_0x00e9:
            java.lang.String r6 = "clientReportInfo"
            r1.put(r6, r2)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r6 = "key_common_extra_info"
            java.lang.String r8 = r1.toString()     // Catch:{ Exception -> 0x00f8 }
            r7.putExtra(r6, r8)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x0102
        L_0x00f8:
            r6 = move-exception
            java.lang.String r7 = f168296b
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r9 = "addClientReportBuffInfo"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r6, r9, r8)
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58784w3.m68435a(er1.w3, android.content.Intent, int, java.lang.String, int, java.lang.Object):void");
    }

    /* renamed from: c0 */
    public static /* synthetic */ Integer m68436c0(C58784w3 w3Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return w3Var.mo83917b0(i, z);
    }

    /* renamed from: l1 */
    public static /* synthetic */ C4191v0 m68437l1(C58784w3 w3Var, Context context, String str, Intent intent, int i, C32226l lVar, int i2, Object obj) {
        return w3Var.mo83938i1(context, str, (i2 & 4) != 0 ? null : intent, i, (i2 & 16) != 0 ? null : lVar);
    }

    /* renamed from: n */
    public static boolean m68438n(C58784w3 w3Var, Activity activity, String str, String str2, C60216z4.C8821a aVar, int i, Object obj) {
        Activity activity2 = activity;
        String str3 = (i & 4) != 0 ? null : str2;
        C60216z4.C8821a aVar2 = (i & 8) != 0 ? null : aVar;
        w3Var.getClass();
        C87412m.m108594g(activity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        int i2 = C66785b.f191882e.mo90673n0().mo62398d().f141692x;
        Log.m105925i(f168296b, "check has realname userFlag %d", Integer.valueOf(i2));
        if ((i2 & 1) == 0) {
            return true;
        }
        C115669n.INSTANCE.mo175913w(1279, 35, 1);
        String string = activity2.getString(C0966R.string.enu);
        C87412m.m108593f(string, "activity.getString(R.str…lf_contact_need_realname)");
        if (!Util.isNullOrNil(str)) {
            string = String.valueOf(str);
        }
        String string2 = activity2.getString(C0966R.string.d39);
        C87412m.m108593f(string2, "activity.getString(R.str…er_check_real_name_title)");
        if (!Util.isNullOrNil(str3)) {
            string2 = String.valueOf(str3);
        }
        String string3 = activity2.getString(C0966R.string.env);
        String string4 = activity2.getString(C0966R.string.f7926wf);
        C7923x3 x3Var = new C7923x3(activity2, aVar2);
        C7926y3 y3Var = new C7926y3(aVar2);
        C77407n nVar = new C77407n((Context) activity2, 1, false);
        View inflate = View.inflate(activity2, C0966R.C0971layout.a9a, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) inflate;
        ((TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.e3g)).setText(Util.nullAsNil(string));
        TextView textView = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.e8e);
        if (!Util.isNullOrNil(string2)) {
            textView.setText(string2);
        }
        Button button = (Button) roundedCornerFrameLayout.findViewById(C0966R.C0970id.hll);
        if (!Util.isNullOrNil(string3)) {
            button.setText(string3);
        }
        Button button2 = (Button) roundedCornerFrameLayout.findViewById(C0966R.C0970id.apy);
        if (!Util.isNullOrNil(string4)) {
            button2.setText(string4);
        }
        roundedCornerFrameLayout.mo153905b((float) C74942w4.m89784a(activity2, 12), (float) C74942w4.m89784a(activity2, 12), 0.0f, 0.0f);
        button.setOnClickListener(new C4091l0(nVar, x3Var));
        button2.setOnClickListener(new C4101m0(nVar, y3Var));
        nVar.f225761d = new C56643n0((DialogInterface.OnDismissListener) null);
        nVar.f225771i = new C56645o0(nVar, roundedCornerFrameLayout);
        nVar.mo107559d(true);
        nVar.mo107573q();
        return false;
    }

    /* renamed from: o1 */
    public static /* synthetic */ C2819w0 m68439o1(C58784w3 w3Var, Intent intent, RecyclerView recyclerView, BaseFeedLoader baseFeedLoader, boolean z, C32226l lVar, int i, Object obj) {
        boolean z2 = (i & 8) != 0 ? true : z;
        if ((i & 16) != 0) {
            lVar = null;
        }
        return w3Var.mo83951n1(intent, recyclerView, baseFeedLoader, z2, lVar);
    }

    /* renamed from: p1 */
    public static C2819w0 m68440p1(C58784w3 w3Var, Intent intent, RecyclerView recyclerView, BaseFeedLoader baseFeedLoader, boolean z, C32226l lVar, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            lVar = null;
        }
        w3Var.getClass();
        C87412m.m108594g(intent, "data");
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(baseFeedLoader, "feedLoader");
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        baseFeedLoader.initBackCache(intent);
        C2819w0 backCache = baseFeedLoader.getBackCache();
        if (backCache == null || Util.isNullOrNil((List) backCache.f14079a) || backCache.f14080b == null) {
            return null;
        }
        DataBuffer dataList = baseFeedLoader.getDataList();
        List<C0740i2> P = w3Var.mo83893P(dataList, 0, lVar);
        if (P.size() != backCache.f14079a.size()) {
            for (C0740i2 remove : P) {
                dataList.remove(remove);
            }
            dataList.addAll(backCache.f14079a);
            if (z) {
                baseFeedLoader.setLastBuffer(backCache.f14080b);
            }
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
        return backCache;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: int} */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: type inference failed for: r13v10 */
    /* JADX WARNING: type inference failed for: r13v12 */
    /* JADX WARNING: type inference failed for: r13v13 */
    /* JADX WARNING: type inference failed for: r13v14 */
    /* JADX WARNING: type inference failed for: r13v15 */
    /* JADX WARNING: type inference failed for: r13v16 */
    /* JADX WARNING: type inference failed for: r13v17 */
    /* JADX WARNING: type inference failed for: r13v18 */
    /* JADX WARNING: type inference failed for: r13v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m68441q(er1.C58784w3 r10, java.lang.String r11, int r12, java.lang.Object r13) {
        /*
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x0006
            java.lang.String r11 = ""
        L_0x0006:
            r10.getClass()
            java.lang.String r10 = "finderUserName"
            gy3.C87412m.m108594g(r11, r10)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            r12 = 6
            r0 = -1
            r1 = 3
            r2 = 4
            r3 = 5
            r4 = 2
            r5 = 0
            if (r10 != 0) goto L_0x00c0
            cd1.a r10 = cd1.C54714a.f153351a
            r10.getClass()
            java.lang.Class<pe1.f> r10 = pe1.C35471f.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            pe1.f r10 = (pe1.C35471f) r10
            pe1.c r10 = r10.mo57066T0()
            java.lang.Object r10 = r10.mo60266n()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            java.lang.String r6 = "Finder.AccountUtil"
            if (r10 == r0) goto L_0x0050
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "hardcode user state = "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r11)
            goto L_0x01c6
        L_0x0050:
            zc1.b r10 = zc1.C66785b.f191882e
            bd1.b r10 = r10.mo90661N1(r11, r13)
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            boolean r0 = r0.mo76879tO()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "showPostEntry :"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r8 = " finderUsername:"
            r7.append(r8)
            r7.append(r11)
            java.lang.String r11 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
            if (r0 == 0) goto L_0x00a9
            if (r10 == 0) goto L_0x00a8
            te3.dr2 r11 = r10.mo75251m2()
            int r11 = r11.f132494e
            r11 = r11 & r4
            if (r11 == 0) goto L_0x008e
            r11 = 1
            goto L_0x008f
        L_0x008e:
            r11 = 0
        L_0x008f:
            if (r11 == 0) goto L_0x0093
            r13 = 5
            goto L_0x00a9
        L_0x0093:
            int r10 = r10.field_spamStatus
            if (r10 != r13) goto L_0x0099
            r11 = 1
            goto L_0x009a
        L_0x0099:
            r11 = 0
        L_0x009a:
            if (r11 == 0) goto L_0x009e
            r13 = 4
            goto L_0x00a9
        L_0x009e:
            if (r10 != r4) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r13 = 0
        L_0x00a2:
            if (r13 == 0) goto L_0x00a6
            r13 = 6
            goto L_0x00a9
        L_0x00a6:
            r13 = 3
            goto L_0x00a9
        L_0x00a8:
            r13 = 2
        L_0x00a9:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "resultState = "
            r10.append(r11)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
        L_0x00bd:
            r10 = r13
            goto L_0x01c6
        L_0x00c0:
            up1.f r10 = up1.C37521f.f99374d
            r10.getClass()
            pe1.c<java.lang.Integer> r10 = up1.C37521f.f99325X1
            java.lang.Object r10 = r10.mo60266n()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 == r0) goto L_0x00eb
            java.lang.String r11 = f168296b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "harcode user state = "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r12)
            goto L_0x01c6
        L_0x00eb:
            zc1.b r10 = zc1.C66785b.f191882e
            java.lang.String r11 = r10.mo90662O5()
            r0 = 0
            bd1.b r11 = zc1.C66783a.C66784a.m78798a(r10, r11, r5, r4, r0)
            if (r11 == 0) goto L_0x00ff
            te3.dr2 r11 = r11.mo75251m2()
            int r11 = r11.f132494e
            goto L_0x0100
        L_0x00ff:
            r11 = 0
        L_0x0100:
            r11 = r11 & r4
            if (r11 == 0) goto L_0x0105
            r11 = 1
            goto L_0x0106
        L_0x0105:
            r11 = 0
        L_0x0106:
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            boolean r0 = r0.mo76879tO()
            java.lang.String r6 = r10.mo90662O5()
            if (r6 == 0) goto L_0x0121
            int r6 = r6.length()
            if (r6 != 0) goto L_0x011f
            goto L_0x0121
        L_0x011f:
            r6 = 0
            goto L_0x0122
        L_0x0121:
            r6 = 1
        L_0x0122:
            r6 = r6 ^ r13
            java.lang.String r7 = f168296b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[checkUserState] hasCreatedIdentity="
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = ", showPostEntry="
            r8.append(r9)
            r8.append(r0)
            java.lang.String r9 = ", isReviewing="
            r8.append(r9)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            if (r0 != 0) goto L_0x0152
            java.lang.String r10 = "resultState = USER_STATE_NO_POST_QUALITY"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            goto L_0x00bd
        L_0x0152:
            java.lang.String r0 = "resultState = USER_STATE_ACCOUNT_REVIEW_ING"
            if (r6 == 0) goto L_0x01b6
            fe1.d$b r6 = fe1.C58961d.f168673a
            java.lang.String r8 = r10.mo90662O5()
            fe1.q r8 = r6.mo84155b(r8)
            gy3.C87412m.m108591d(r8)
            boolean r8 = r8.mo84190n2()
            java.lang.String r10 = r10.mo90662O5()
            fe1.q r10 = r6.mo84155b(r10)
            gy3.C87412m.m108591d(r10)
            int r10 = r10.field_spamStatus
            if (r10 != r4) goto L_0x0177
            goto L_0x0178
        L_0x0177:
            r13 = 0
        L_0x0178:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r4 = "[checkUserState] isAccountBlocked="
            r10.append(r4)
            r10.append(r8)
            java.lang.String r4 = ", isAccountSilent="
            r10.append(r4)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            if (r8 == 0) goto L_0x019e
            java.lang.String r10 = "resultState = USER_STATE_ACCOUNT_FORBID"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            r13 = 4
            goto L_0x00bd
        L_0x019e:
            if (r13 == 0) goto L_0x01a8
            java.lang.String r10 = "resultState = USER_STATE_ACCOUNT_SILIENT"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            r13 = 6
            goto L_0x00bd
        L_0x01a8:
            if (r11 == 0) goto L_0x01ae
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x01bb
        L_0x01ae:
            java.lang.String r10 = "resultState = USER_STATE_NORMAL"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            r13 = 3
            goto L_0x00bd
        L_0x01b6:
            if (r11 == 0) goto L_0x01be
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x01bb:
            r13 = 5
            goto L_0x00bd
        L_0x01be:
            java.lang.String r10 = "resultState = USER_STATE_HAS_POST_QUALITY_NO_ACCOUNT"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            r13 = 2
            goto L_0x00bd
        L_0x01c6:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58784w3.m68441q(er1.w3, java.lang.String, int, java.lang.Object):int");
    }

    /* renamed from: A */
    public final boolean mo83854A(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        return (finderObject.permissionFlag & 32768) > 0;
    }

    /* renamed from: A0 */
    public final boolean mo83855A0(FinderObject finderObject) {
        boolean z;
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        boolean z2 = (finderObject.permissionFlag & 8192) > 0;
        C64273c21 c212 = finderObject.liveInfo;
        if (c212 != null) {
            z = !mo83930g(c212 != null ? c212.f182385X0 : 0);
        } else {
            z = false;
        }
        return z2 || z;
    }

    /* renamed from: A1 */
    public final void mo83856A1(int i, List<? extends C0740i2> list, C89349b bVar, Intent intent, C2780c cVar) {
        C87412m.m108594g(list, "feedList");
        C87412m.m108594g(intent, "intent");
        C58739j4.f168176a.mo83701b0(i, list, bVar, intent, cVar);
    }

    /* renamed from: B */
    public final boolean mo83857B(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        return (finderObject.permissionFlag & 4194304) > 0;
    }

    /* renamed from: B0 */
    public final boolean mo83858B0(Context context, FinderItem finderItem) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(finderItem, "feedObject");
        C37521f.f99374d.getClass();
        if (C37521f.f99346Z4.mo60266n().intValue() == 1) {
            return finderItem.getMediaType() == 9 && (((C60606n) C86312j.m106911c(C60606n.class)).mo85008I1(finderItem.getLiveInfo()) || ((C61397g) C86312j.m106911c(C61397g.class)).Da0(finderItem.getLiveInfo()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02da A[LOOP:2: B:42:0x00e9->B:141:0x02da, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02ea A[EDGE_INSN: B:153:0x02ea->B:143:0x02ea ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0224  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final er1.C58744l mo83859C(androidx.recyclerview.widget.RecyclerView r35, int r36, int r37, java.util.Set<java.lang.Integer> r38) {
        /*
            r34 = this;
            r0 = r35
            r1 = r38
            java.lang.String r2 = "recyclerView"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "otherCareType"
            gy3.C87412m.m108594g(r1, r2)
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r35.getLayoutManager()
            java.lang.String r5 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            gy3.C87412m.m108592e(r4, r5)
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r36
            if (r6 != r5) goto L_0x0027
            int r6 = r4.mo16957C()
        L_0x0027:
            r7 = r37
            if (r7 != r5) goto L_0x0030
            int r4 = r4.mo16959E()
            goto L_0x0031
        L_0x0030:
            r4 = r7
        L_0x0031:
            if (r6 < 0) goto L_0x0335
            if (r4 < r6) goto L_0x0335
            if (r4 >= 0) goto L_0x0039
            goto L_0x0335
        L_0x0039:
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            androidx.recyclerview.widget.RecyclerView$e r7 = r35.getAdapter()
            java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>"
            gy3.C87412m.m108592e(r7, r8)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r7 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r7
            java.util.List r8 = r7.getData()
            java.util.Iterator r8 = r8.iterator()
            r10 = 0
        L_0x0052:
            boolean r11 = r8.hasNext()
            r12 = 9
            r14 = 4
            r15 = 2013(0x7dd, float:2.821E-42)
            if (r11 == 0) goto L_0x007f
            java.lang.Object r11 = r8.next()
            jq3.c r11 = (jq3.C9493c) r11
            int r13 = r11.mo75c()
            if (r13 == r14) goto L_0x0078
            int r13 = r11.mo75c()
            if (r13 == r15) goto L_0x0078
            int r11 = r11.mo75c()
            if (r11 != r12) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r11 = 0
            goto L_0x0079
        L_0x0078:
            r11 = 1
        L_0x0079:
            if (r11 == 0) goto L_0x007c
            goto L_0x0080
        L_0x007c:
            int r10 = r10 + 1
            goto L_0x0052
        L_0x007f:
            r10 = -1
        L_0x0080:
            int r8 = r7.mo85796c6()
            int r10 = r10 + r8
            java.util.List r8 = r7.getData()
            java.util.Iterator r8 = r8.iterator()
            r11 = 0
        L_0x008e:
            boolean r13 = r8.hasNext()
            r15 = 2
            if (r13 == 0) goto L_0x00ba
            java.lang.Object r13 = r8.next()
            jq3.c r13 = (jq3.C9493c) r13
            int r9 = r13.mo75c()
            if (r9 == r14) goto L_0x00b0
            int r9 = r13.mo75c()
            if (r9 == r15) goto L_0x00b0
            int r9 = r13.mo75c()
            if (r9 != r12) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r9 = 0
            goto L_0x00b1
        L_0x00b0:
            r9 = 1
        L_0x00b1:
            if (r9 == 0) goto L_0x00b5
            r13 = r11
            goto L_0x00bb
        L_0x00b5:
            int r11 = r11 + 1
            r15 = 2013(0x7dd, float:2.821E-42)
            goto L_0x008e
        L_0x00ba:
            r13 = -1
        L_0x00bb:
            int r7 = r7.mo85796c6()
            int r13 = r13 + r7
            int r7 = f168306l
            float r8 = (float) r7
            r9 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r9
            r9 = 2147483647(0x7fffffff, float:NaN)
            er1.l r11 = new er1.l
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 255(0xff, float:3.57E-43)
            r29 = 0
            r18 = r11
            r18.<init>(r19, r20, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r6 > r4) goto L_0x02e7
            r12 = 0
        L_0x00e9:
            androidx.recyclerview.widget.RecyclerView$z r15 = r0.mo17024J0(r6, r12)
            boolean r12 = r15 instanceof jq3.C60905o
            r18 = 0
            if (r12 == 0) goto L_0x00f6
            jq3.o r15 = (jq3.C60905o) r15
            goto L_0x00f8
        L_0x00f6:
            r15 = r18
        L_0x00f8:
            if (r15 != 0) goto L_0x00fb
            goto L_0x0108
        L_0x00fb:
            java.lang.Object r12 = r15.f173503E
            boolean r14 = r12 instanceof cm1.C0740i2
            if (r14 == 0) goto L_0x0104
            cm1.i2 r12 = (cm1.C0740i2) r12
            goto L_0x0106
        L_0x0104:
            r12 = r18
        L_0x0106:
            if (r12 != 0) goto L_0x0110
        L_0x0108:
            r30 = r2
        L_0x010a:
            r32 = r4
            r33 = r5
            goto L_0x01f3
        L_0x0110:
            int r14 = r12.mo75c()
            boolean r0 = r12 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            r30 = r2
            if (r0 != 0) goto L_0x0124
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L_0x010a
        L_0x0124:
            if (r0 == 0) goto L_0x0134
            com.tencent.mm.plugin.finder.storage.FeedData$a r2 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            r3 = r12
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r3
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r2.mo78883a(r3)
            r32 = r4
            r33 = r5
            goto L_0x015f
        L_0x0134:
            boolean r2 = r12 instanceof kf1.C9833k9
            if (r2 == 0) goto L_0x0159
            r2 = r12
            kf1.k9 r2 = (kf1.C9833k9) r2
            com.tencent.mm.plugin.finder.storage.FeedData r3 = new com.tencent.mm.plugin.finder.storage.FeedData
            r3.<init>()
            te3.pl1 r1 = r2.f30387d
            r32 = r4
            r33 = r5
            long r4 = r1.f184854u
            r3.setFeedId(r4)
            int r1 = r2.mo75c()
            r3.setMediaType(r1)
            java.util.LinkedList<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r1 = r2.f30389f
            r3.setRvFeedList(r1)
            r2 = r3
            goto L_0x015f
        L_0x0159:
            r32 = r4
            r33 = r5
            r2 = r18
        L_0x015f:
            r1 = 2131304482(0x7f092022, float:1.8227108E38)
            if (r0 == 0) goto L_0x0179
            boolean r0 = r12 instanceof cm1.C0729f0
            if (r0 != 0) goto L_0x0179
            android.view.View r0 = r15.mo85812D(r1)
            com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner r0 = (com.tencent.p014mm.plugin.finder.view.FinderBaseMediaBanner) r0
            if (r0 == 0) goto L_0x0171
            goto L_0x017b
        L_0x0171:
            r0 = 2131308186(0x7f092e9a, float:1.823462E38)
            android.view.View r0 = r15.mo85812D(r0)
            goto L_0x017b
        L_0x0179:
            android.view.View r0 = r15.f44854d
        L_0x017b:
            if (r0 != 0) goto L_0x01a4
            java.lang.String r0 = f168296b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "findCenterFeed: mediaView is null, index="
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = ", feedId="
            r1.append(r2)
            long r2 = r12.getItemId()
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x01f3
        L_0x01a4:
            android.graphics.Rect r3 = f168300f
            r3.setEmpty()
            boolean r4 = r0.getGlobalVisibleRect(r3)
            if (r4 != 0) goto L_0x01c6
            java.lang.String r0 = f168296b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getGlobalVisibleRect error continue "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r1)
            goto L_0x01f3
        L_0x01c6:
            int r4 = r3.top
            r5 = 0
            int r4 = p282z2.C16095a.m14980b(r4, r5, r7)
            r3.top = r4
            int r4 = r3.bottom
            int r4 = p282z2.C16095a.m14980b(r4, r5, r7)
            r3.bottom = r4
            int r4 = r3.height()
            if (r4 > 0) goto L_0x01fa
            java.lang.String r0 = f168296b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mediaRect.height() error continue "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r1)
        L_0x01f3:
            r0 = r6
            r3 = r33
            r2 = 0
            r14 = 1
            goto L_0x02d6
        L_0x01fa:
            if (r6 != r10) goto L_0x0200
            if (r13 != r10) goto L_0x0200
            r4 = 0
            goto L_0x020a
        L_0x0200:
            int r4 = r3.top
            float r4 = (float) r4
            float r4 = r8 - r4
            float r4 = java.lang.Math.abs(r4)
            int r4 = (int) r4
        L_0x020a:
            r5 = 4
            if (r14 == r5) goto L_0x0228
            r5 = 2013(0x7dd, float:2.821E-42)
            if (r14 == r5) goto L_0x0228
            r5 = 2
            if (r14 != r5) goto L_0x0226
            if (r2 == 0) goto L_0x021f
            boolean r5 = r2.getHasBgmInfo()
            r14 = 1
            if (r5 != r14) goto L_0x0220
            r5 = 1
            goto L_0x0221
        L_0x021f:
            r14 = 1
        L_0x0220:
            r5 = 0
        L_0x0221:
            if (r5 == 0) goto L_0x0224
            goto L_0x0229
        L_0x0224:
            r5 = 2
            goto L_0x0236
        L_0x0226:
            r14 = 1
            goto L_0x0236
        L_0x0228:
            r14 = 1
        L_0x0229:
            int r3 = r3.height()
            int r0 = r0.getHeight()
            r5 = 2
            int r0 = r0 / r5
            if (r3 <= r0) goto L_0x0236
            int r4 = r4 - r7
        L_0x0236:
            if (r4 >= r9) goto L_0x02d2
            int r0 = r12.mo75c()
            r11.f168207e = r0
            r11.f168208f = r6
            r11.f168209g = r15
            r0 = r6
            long r5 = r12.getItemId()
            r11.f168204b = r5
            r11.f168206d = r2
            r11.f168210h = r12
            android.view.View r1 = r15.mo85812D(r1)
            if (r2 == 0) goto L_0x0258
            java.util.LinkedList r3 = r2.getMediaList()
            goto L_0x025a
        L_0x0258:
            r3 = r18
        L_0x025a:
            er1.j4 r5 = er1.C58739j4.f168176a
            java.lang.String r5 = ""
            if (r1 == 0) goto L_0x028d
            if (r3 == 0) goto L_0x028d
            com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner r1 = (com.tencent.p014mm.plugin.finder.view.FinderBaseMediaBanner) r1
            int r6 = r1.getFocusPosition()
            if (r6 < 0) goto L_0x028a
            int r6 = r1.getFocusPosition()
            int r9 = r3.size()
            if (r6 >= r9) goto L_0x028a
            int r1 = r1.getFocusPosition()
            java.lang.Object r1 = sx3.C110818d0.m150917O(r3, r1)
            te3.rq2 r1 = (te3.C64689rq2) r1
            if (r1 == 0) goto L_0x0283
            java.lang.String r1 = r1.f185275p
            goto L_0x0285
        L_0x0283:
            r1 = r18
        L_0x0285:
            if (r1 != 0) goto L_0x0288
            r1 = r5
        L_0x0288:
            r11.f168205c = r1
        L_0x028a:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x028f
        L_0x028d:
            r1 = r18
        L_0x028f:
            if (r1 != 0) goto L_0x02b0
            if (r2 == 0) goto L_0x02a7
            java.util.LinkedList r1 = r2.getMediaList()
            if (r1 == 0) goto L_0x02a7
            r2 = 0
            java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r2)
            te3.rq2 r1 = (te3.C64689rq2) r1
            if (r1 == 0) goto L_0x02a8
            java.lang.String r1 = r1.f185275p
            r18 = r1
            goto L_0x02a8
        L_0x02a7:
            r2 = 0
        L_0x02a8:
            if (r18 != 0) goto L_0x02ab
            goto L_0x02ad
        L_0x02ab:
            r5 = r18
        L_0x02ad:
            r11.f168205c = r5
            goto L_0x02b1
        L_0x02b0:
            r2 = 0
        L_0x02b1:
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 255(0xff, float:3.57E-43)
            r29 = 0
            r18 = r11
            er1.l r1 = er1.C58744l.m68320a(r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29)
            r3 = r33
            r3.add(r1)
            r9 = r4
            goto L_0x02d6
        L_0x02d2:
            r0 = r6
            r3 = r33
            r2 = 0
        L_0x02d6:
            r4 = r32
            if (r0 == r4) goto L_0x02ea
            int r6 = r0 + 1
            r0 = r35
            r1 = r38
            r5 = r3
            r2 = r30
            r12 = 0
            r14 = 4
            goto L_0x00e9
        L_0x02e7:
            r30 = r2
            r3 = r5
        L_0x02ea:
            java.util.LinkedList<er1.l> r0 = r11.f168211i
            r0.addAll(r3)
            long r0 = f168301g
            long r2 = r11.f168204b
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0334
            java.lang.String r0 = f168296b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[findCenterFeed] cost="
            r1.append(r2)
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r30
            r1.append(r2)
            java.lang.String r2 = "ms firstFeedIndex="
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = " firstVideoFeedIndex="
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = ", centerResult=["
            r1.append(r2)
            r1.append(r11)
            r2 = 93
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            long r0 = r11.f168204b
            f168301g = r0
        L_0x0334:
            return r11
        L_0x0335:
            er1.l r0 = new er1.l
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 254(0xfe, float:3.56E-43)
            r23 = 0
            r12 = r0
            r12.<init>(r13, r14, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58784w3.mo83859C(androidx.recyclerview.widget.RecyclerView, int, int, java.util.Set):er1.l");
    }

    /* renamed from: C0 */
    public final void mo83860C0(ImageView imageView, int i, String str, int i2) {
        C11978e0.C11979a aVar = C11978e0.C11979a.COMMON;
        C27696y yVar = C27696y.RAW_IMAGE;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        boolean z = false;
        imageView.setVisibility(0);
        if (i <= 0) {
            imageView.setVisibility(8);
        } else if (i == 1) {
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(str, yVar), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
            } else if (i2 == 0) {
                imageView.setImageResource(C0966R.raw.icons_filled_star_identify_sold);
            } else {
                imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_filled_star_identify, C76577a.m92153d(imageView.getContext(), C0966R.color.a7u)));
            }
        } else if (i == 2) {
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(str, yVar), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
            } else if (i2 == 0) {
                imageView.setImageResource(C0966R.raw.icons_filled_star_identify_enterprise_sold);
            } else {
                imageView.setImageResource(C0966R.raw.icons_filled_star_identify_enterprise);
            }
        } else if (i != 100) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: C1 */
    public final void mo83861C1(C9342n1.C9346d dVar, int i, String str) {
        C87412m.m108594g(dVar, "resp");
        C87412m.m108594g(str, "tag");
        Log.m105924i(str, "saveConfigWhenEnterFinderStreamEnter: tabType=" + i + ", headWording=" + dVar.f146071f + ", endWording=" + dVar.f146072g + ", prefetch_last_feed_count=" + dVar.f146076n + ", flow_card_prefetch_last_feed_count=" + dVar.f146067E);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_HEADER_WORDING_STRING_SYNC, dVar.f146071f);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_FOOTER_WORDING_STRING_SYNC, dVar.f146072g);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_PRELOAD_NUM_INT_SYNC, Integer.valueOf(dVar.f146076n));
        if (dVar.f146067E > 0) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TWO_FLOW_PRELOAD_NUM_INT_SYNC, Integer.valueOf(dVar.f146067E));
        }
    }

    /* renamed from: D */
    public final int mo83862D(RecyclerView recyclerView, boolean z, int i, int i2) {
        if (!z) {
            return i;
        }
        Rect rect = new Rect();
        int i3 = 0;
        RecyclerView.C16631z J0 = recyclerView.mo17024J0(i, false);
        View view = J0 != null ? J0.f44854d : null;
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        }
        int height = rect.height();
        if (view != null) {
            i3 = view.getHeight();
        }
        return height >= i3 / 2 ? i : mo83862D(recyclerView, z, i + i2, i2);
    }

    /* renamed from: D0 */
    public final boolean mo83863D0(FinderObject finderObject, String str) {
        C87412m.m108594g(finderObject, "obj");
        C87412m.m108594g(str, "invokeSource");
        FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
        int i = finderObjectDesc != null ? finderObjectDesc.mediaType : 0;
        C64273c21 c212 = finderObject.liveInfo;
        Integer valueOf = c212 != null ? Integer.valueOf(c212.f182394f) : null;
        String str2 = f168296b;
        Log.m105918d(str2, str + " isAcceptLiveObj mediaType:" + i + " liveState:" + valueOf);
        if (i != 9) {
            Log.m105928w(str2, str + " isAcceptLiveObj return for invalid mediaType:" + i);
            return false;
        } else if (valueOf == null || valueOf.intValue() != 2) {
            return true;
        } else {
            Log.m105928w(str2, str + " isAcceptLiveObj return for invalid liveState:" + valueOf);
            return false;
        }
    }

    /* renamed from: D1 */
    public final void mo83864D1(ImageView imageView, FinderAuthInfo finderAuthInfo, int i, C64284cg cgVar) {
        C87412m.m108594g(imageView, "view");
        imageView.setVisibility(8);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter((ColorFilter) null);
        }
        if (cgVar != null) {
            C64709se seVar = cgVar.f182473i;
            if (seVar != null) {
                String str = f168296b;
                Log.m105924i(str, "set biz authInfo, authType = " + seVar.f185417d + ", authIconUrl = " + seVar.f185418e);
                f168295a.mo83860C0(imageView, seVar.f185417d, seVar.f185418e, i);
            }
        } else if (finderAuthInfo != null) {
            String str2 = f168296b;
            Log.m105924i(str2, "authType = " + finderAuthInfo.authIconType + ", authIconUrl = " + finderAuthInfo.authIconUrl);
            f168295a.mo83860C0(imageView, finderAuthInfo.authIconType, finderAuthInfo.authIconUrl, i);
        }
    }

    /* renamed from: E */
    public final String mo83865E(long j, Context context, int i) {
        String str;
        String str2;
        C87412m.m108594g(context, "context");
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        int i2 = instance.get(11);
        if (i2 < 10) {
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i2);
            str = sb.toString();
        } else {
            str = String.valueOf(i2);
        }
        int i3 = instance.get(12);
        if (i3 < 10) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append('0');
            sb4.append(i3);
            str2 = sb4.toString();
        } else {
            str2 = String.valueOf(i3);
        }
        String string = context.getResources().getString(i, new Object[]{Integer.valueOf(instance.get(1)), Integer.valueOf(instance.get(2) + 1), Integer.valueOf(instance.get(5)), str, str2});
        C87412m.m108593f(string, "context.resources.getStr…      minuteStr\n        )");
        return string;
    }

    /* renamed from: E0 */
    public final boolean mo83866E0(FinderObject finderObject) {
        LinkedList<FinderMedia> linkedList;
        LinkedList<FinderMedia> linkedList2;
        FinderMedia finderMedia;
        LinkedList<FinderMedia> linkedList3;
        C87412m.m108594g(finderObject, "obj");
        C58739j4 j4Var = C58739j4.f168176a;
        List<Integer> q = j4Var.mo83721q();
        FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
        if (q.contains(Integer.valueOf(finderObjectDesc != null ? finderObjectDesc.mediaType : 0))) {
            return true;
        }
        FinderObjectDesc finderObjectDesc2 = finderObject.objectDesc;
        if ((finderObjectDesc2 == null || (linkedList3 = finderObjectDesc2.media) == null || linkedList3.size() != 0) ? false : true) {
            return false;
        }
        FinderObjectDesc finderObjectDesc3 = finderObject.objectDesc;
        int i = (finderObjectDesc3 == null || (linkedList2 = finderObjectDesc3.media) == null || (finderMedia = linkedList2.get(0)) == null) ? 0 : finderMedia.mediaType;
        if (!j4Var.mo83721q().contains(Integer.valueOf(i))) {
            return false;
        }
        FinderObjectDesc finderObjectDesc4 = finderObject.objectDesc;
        if (!(finderObjectDesc4 == null || (linkedList = finderObjectDesc4.media) == null)) {
            for (FinderMedia finderMedia2 : linkedList) {
                if (finderMedia2.mediaType != i) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: F */
    public final String mo83867F(int i) {
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 % 60;
        int i5 = i3 / 60;
        if (i5 == 0) {
            return mo83871H(i4) + XVFSFile.PATH_SEPARATOR_CHAR + mo83871H(i2);
        }
        return mo83871H(i5) + XVFSFile.PATH_SEPARATOR_CHAR + mo83871H(i4) + XVFSFile.PATH_SEPARATOR_CHAR + mo83871H(i2);
    }

    /* renamed from: F0 */
    public final boolean mo83868F0(int i, long j) {
        return i > 0 || (j != 0 && j * ((long) 1000) < C31543z5.m39453c());
    }

    /* renamed from: G0 */
    public final boolean mo83869G0() {
        Class cls = C10432i.class;
        return ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF() && (((C75592q0.m90781k() & 34359738368L) > 0 ? 1 : ((C75592q0.m90781k() & 34359738368L) == 0 ? 0 : -1)) == 0) && !(((C10432i) C86312j.m106911c(cls)).mo10750e() && ((C10432i) C86312j.m106911c(cls)).mo10740Mn() == 2);
    }

    /* renamed from: G1 */
    public final void mo83870G1(ImageView imageView, TextView textView, C64682rk1 rk12, int i) {
        C87412m.m108594g(imageView, "authIconView");
        C87412m.m108594g(textView, "nickNameView");
        C87412m.m108594g(rk12, "shareObject");
        String str = rk12.f185200x;
        int i2 = str == null || str.length() == 0 ? rk12.f185196t : rk12.f185201y;
        String str2 = rk12.f185200x;
        String str3 = str2 == null || str2.length() == 0 ? rk12.f185197u : rk12.f185202z;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        m68428E1(this, imageView, i2, str3, 0, 8, (Object) null);
        if (i2 == 1 || i2 == 2) {
            marginLayoutParams.setMarginEnd(i);
        } else {
            marginLayoutParams.setMarginEnd(0);
        }
        textView.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: H */
    public final String mo83871H(int i) {
        if (i >= 10) {
            return String.valueOf(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append('0');
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: H0 */
    public final boolean mo83872H0(FinderObject finderObject) {
        C87412m.m108594g(finderObject, "feedObject");
        int i = finderObject.adFlag;
        return (i & 8) > 0 || (i & 128) > 0;
    }

    /* renamed from: H1 */
    public final void mo83873H1(Intent intent, int i, int i2) {
        C87412m.m108594g(intent, "intent");
        int i3 = 0;
        if (i == 1) {
            if (i2 == 0) {
                i3 = 37;
            } else if (i2 == 1) {
                i3 = 35;
            }
        } else if (i2 == 0) {
            i3 = 36;
        } else if (i2 == 1) {
            i3 = 34;
        }
        intent.putExtra("key_entrance_type", i3);
    }

    /* renamed from: I */
    public final String mo83874I(List<? extends C51163rv3> list) {
        String str;
        C87412m.m108594g(list, "descs");
        StringBuffer stringBuffer = new StringBuffer();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C51163rv3 rv32 = (C51163rv3) list.get(i);
            if (!(rv32 == null || (str = rv32.f141175d) == null || C87412m.m108589b(str, ""))) {
                String str2 = rv32.f141175d;
                C87412m.m108593f(str2, "skt.string");
                String lowerCase = str2.toLowerCase();
                C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
                if (!C87412m.m108589b(lowerCase, "null")) {
                    stringBuffer.append(rv32.f141175d);
                    if (i < list.size() - 1) {
                        stringBuffer.append("·");
                    }
                }
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: I0 */
    public final boolean mo83875I0(String str) {
        return str != null && !C112551y.m153808h(str, "@stranger", false, 2, (Object) null) && !C72996z1.m85817T4(str) && !C87412m.m108589b(str, C75592q0.m90789s()) && C45628s0.m50740E(str);
    }

    /* renamed from: I1 */
    public final void mo83876I1(TextView textView, Spannable spannable) {
        C87412m.m108594g(textView, "tv");
        C87412m.m108594g(spannable, MimeTypes.BASE_TYPE_TEXT);
        textView.setOnTouchListener(new C75652c4(textView));
    }

    /* renamed from: J */
    public final Map<String, Object> mo83877J() {
        Class cls = C10383h.class;
        C13604l[] lVarArr = new C13604l[3];
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        String str = "";
        if (Wb == null) {
            Wb = str;
        }
        lVarArr[0] = new C13604l("behaviour_session_id", Wb);
        String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
        if (E == null) {
            E = str;
        }
        lVarArr[1] = new C13604l("finder_context_id", E);
        String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
        if (S0 != null) {
            str = S0;
        }
        lVarArr[2] = new C13604l("finder_tab_context_id", str);
        return C90364q0.m113147f(lVarArr);
    }

    /* renamed from: J0 */
    public final boolean mo83878J0(FinderObject finderObject) {
        C87412m.m108594g(finderObject, "feedObject");
        int i = finderObject.adFlag;
        return (i & 8) > 0 || (i & 64) > 0 || (i & 128) > 0;
    }

    /* renamed from: J1 */
    public final void mo83879J1(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "wording");
        C76912y0.m92766e(context, str, C58788g.f168317a);
    }

    /* renamed from: K0 */
    public final boolean mo83880K0(C60905o oVar, BaseFinderFeed baseFinderFeed) {
        T t;
        boolean z;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(baseFinderFeed, "item");
        C39818r rVar = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        int i = ((C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3().f134675i;
        Context context2 = oVar.f173499A;
        if ((context2 instanceof MMActivity ? (MMActivity) context2 : null) == null) {
            return false;
        }
        Set<C11911l> value = ((C62273n) rVar.mo62446e(C60200t1.class).mo75002a(C62273n.class)).mo87341g3(baseFinderFeed.getItemId(), i).getValue();
        if (value == null) {
            return false;
        }
        boolean z2 = false;
        for (C11911l lVar : value) {
            for (FinderJumpInfo finderJumpInfo : lVar.f34806d) {
                LinkedList<uc4> linkedList = finderJumpInfo.style;
                C87412m.m108593f(linkedList, "it.style");
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    int i2 = ((uc4) t).f142762h;
                    if (i2 == 14 || i2 == 16) {
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
                if (((uc4) t) != null) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* renamed from: K1 */
    public final void mo83881K1(long j, boolean z, int i) {
        if (BuildInfo.IS_FLAVOR_PURPLE) {
            FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
            FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
            aVar.f9174a = j;
            aVar.f9177d = z ? 1 : 0;
            aVar.f9176c = i;
            aVar.f9175b = 7;
            feedUpdateEvent.publish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r4 = r4.f44854d;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag mo83882L(androidx.recyclerview.widget.RecyclerView.C16631z r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0011
            android.view.View r4 = r4.f44854d
            if (r4 == 0) goto L_0x0011
            r1 = 2131297745(0x7f0905d1, float:1.8213444E38)
            android.view.View r4 = r4.findViewById(r1)
            com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag r4 = (com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag) r4
            goto L_0x0012
        L_0x0011:
            r4 = r0
        L_0x0012:
            r1 = 2131304529(0x7f092051, float:1.8227203E38)
            if (r4 == 0) goto L_0x001c
            java.lang.Object r2 = r4.getTag(r1)
            goto L_0x001d
        L_0x001c:
            r2 = r0
        L_0x001d:
            if (r2 == 0) goto L_0x0032
            java.lang.Object r1 = r4.getTag(r1)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Boolean"
            gy3.C87412m.m108592e(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r0 = r4
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58784w3.mo83882L(androidx.recyclerview.widget.RecyclerView$z):com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag");
    }

    /* renamed from: L0 */
    public final boolean mo83883L0(String str) {
        C87412m.m108594g(str, "path");
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (!C86013q1.m106450k(str)) {
            return false;
        }
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = C86013q1.m106420B(str, false);
            C102014a c = C102016c.m134341c(randomAccessFile, new byte[8], C102014a.f300376f, 4194304);
            long j = (long) 8;
            long j2 = c.f300396d + j;
            long a = c.mo141508a() - j;
            String str2 = f168296b;
            Log.m105924i(str2, "[isMoovOptimize] cost=" + (System.currentTimeMillis() - currentTimeMillis) + "ms beginPos=" + j2 + " remains=" + a);
            if (j2 > 0 && j2 <= 128) {
                z = true;
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            Util.qualityClose(randomAccessFile);
            throw th;
        }
        Util.qualityClose(randomAccessFile);
        return z;
    }

    /* renamed from: L1 */
    public final int mo83884L1(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        switch (i) {
            case 4:
                return 2;
            case 128:
                return 4;
            case 256:
                return 10;
            case 512:
                return 5;
            case 1024:
                return 6;
            case 2048:
                return 7;
            case 4096:
                return 8;
            case 8192:
                return 14;
            case 33280:
                return 17;
            case 33536:
                return 21;
            case 131072:
                return 18;
            case 196608:
                return 19;
            case 1048576:
                return 23;
            default:
                return 3;
        }
    }

    /* renamed from: M */
    public final String mo83885M(Context context, C49295ek0 ek02, int i) {
        String str;
        String str2;
        C87412m.m108594g(context, "context");
        if (ek02 == null || (str = ek02.f132980r) == null) {
            str = "";
        }
        if (!(str.length() == 0)) {
            return str;
        }
        String d = C7878t0.m8035d((long) i);
        if (!(ek02 == null || (str2 = ek02.f132971f) == null)) {
            String str3 = d + str2;
            if (str3 != null) {
                return str3;
            }
        }
        String string = context.getResources().getString(C0966R.string.cyx, new Object[]{d});
        C87412m.m108593f(string, "context.resources.getStr…ity_item_desc, countText)");
        return string;
    }

    /* renamed from: M0 */
    public final boolean mo83886M0(BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(baseFinderFeed, "item");
        return baseFinderFeed.mo3513o().getFeedObject().incFriendLikeCount > 0 && baseFinderFeed.mo3513o().getFeedObject().msgEventFlag == 1;
    }

    /* renamed from: M1 */
    public final int mo83887M1(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 512;
        }
        if (i == 2) {
            return 1024;
        }
        if (i == 3) {
            return 2048;
        }
        if (i != 4) {
            return i != 1001 ? 1 : 33024;
        }
        return 4096;
    }

    /* renamed from: N */
    public final int mo83888N(float f, int i) {
        int i2 = 255;
        int i3 = (int) (f * ((float) 255));
        if (i3 <= 0) {
            i3 = 0;
        }
        if (255 > i3) {
            i2 = i3;
        }
        return (i2 << 24) + (i & 16777215);
    }

    /* renamed from: N0 */
    public final boolean mo83889N0() {
        C37521f.f99374d.getClass();
        boolean z = !((Boolean) C37521f.f99460m8.mo60266n()).booleanValue();
        C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
        boolean z2 = ((b != null ? b.field_additionalFlag : 0) & 4) == 0;
        Log.m105924i(f168296b, "getUserInteractEnableStat :" + z2 + " enable:" + z);
        return z2 && z;
    }

    /* renamed from: O */
    public final int mo83890O(int i) {
        if (i == 1) {
            return 18;
        }
        if (i == 2) {
            return 16;
        }
        if (i != 3) {
            return i != 4 ? -1 : 20;
        }
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        C35464c<Integer> cVar = C37521f.f99315W0;
        if (cVar.mo60266n().intValue() == 2) {
            return 170;
        }
        fVar.getClass();
        return cVar.mo60266n().intValue() == 1 ? 155 : 17;
    }

    /* renamed from: O0 */
    public final boolean mo83891O0(FinderObject finderObject) {
        C87412m.m108594g(finderObject, "feedObject");
        return (finderObject.adFlag & 128) > 0;
    }

    /* renamed from: O1 */
    public final int mo83892O1(int i, int i2, float f) {
        if (f <= 0.5f) {
            int alpha = Color.alpha(i);
            if (alpha == 0) {
                alpha = 255;
            }
            return Color.argb(Math.min(C60641c.m70921b((0.5f - f) * ((float) 255) * ((float) 2)), alpha), Color.red(i), Color.green(i), Color.blue(i));
        }
        int alpha2 = Color.alpha(i2);
        if (alpha2 == 0) {
            alpha2 = 255;
        }
        return Color.argb(Math.min(C60641c.m70921b((f - 0.5f) * ((float) 255) * ((float) 2)), alpha2), Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    /* renamed from: P */
    public final List<C0740i2> mo83893P(DataBuffer<C0740i2> dataBuffer, int i, C32226l<? super C0740i2, Boolean> lVar) {
        int i2 = 0;
        if (lVar == null) {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (C0740i2 next : dataBuffer) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C0740i2 i2Var = next;
                    if (i3 >= i) {
                        arrayList.add(next);
                    }
                    i3 = i4;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (C0740i2 next2 : dataBuffer) {
            int i5 = i2 + 1;
            if (i2 >= 0) {
                C0740i2 i2Var2 = next2;
                if (i2 >= i && lVar.invoke(i2Var2).booleanValue()) {
                    arrayList2.add(i2Var2);
                }
                i2 = i5;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return arrayList2;
    }

    /* renamed from: P0 */
    public final boolean mo83894P0(C64689rq2 rq22) {
        if (rq22 != null) {
            C64899zy zyVar = rq22.f185235B;
            return !(zyVar != null && zyVar.f186905j);
        }
    }

    /* renamed from: P1 */
    public final void mo83895P1(Context context, C77407n nVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(nVar, "sheet");
        if (!(context instanceof Activity)) {
            return;
        }
        if (((Activity) context).isFinishing() || !nVar.mo107563h()) {
            String str = f168296b;
            Log.m105924i(str, "context is finishing or not showing :" + nVar.mo107563h());
            return;
        }
        try {
            nVar.mo107564i();
        } catch (Exception e) {
            Log.printDebugStack(f168296b, "", e);
        }
    }

    /* renamed from: Q */
    public final String mo83896Q(int i) {
        if (i == 1) {
            return C66785b.f191882e.mo90662O5();
        }
        if (i == 2) {
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "{\n                Config…mUserInfo()\n            }");
            return s;
        } else if (i != 3) {
            String s2 = C75592q0.m90789s();
            C87412m.m108593f(s2, "{\n                Config…mUserInfo()\n            }");
            return s2;
        } else {
            String l = C75592q0.m90782l();
            C87412m.m108593f(l, "{\n                Config…sUsername()\n            }");
            return l;
        }
    }

    /* renamed from: Q0 */
    public final boolean mo83897Q0(BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(baseFinderFeed, "feed");
        return C58739j4.f168176a.mo83690S(baseFinderFeed);
    }

    /* renamed from: R */
    public final String mo83898R(String str, String str2, boolean z) {
        String str3 = "";
        if (Util.isNullOrNil(str)) {
            return str2 == null ? str3 : str2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        C58961d.C58963b bVar = C58961d.f168673a;
        bVar.getClass();
        boolean z2 = false;
        if (str != null) {
            z2 = C112551y.m153808h(str, "@finder", false, 2, (Object) null);
        }
        if (z2) {
            if (Util.isNullOrNil(str2)) {
                C87412m.m108591d(str);
                C58969q b = bVar.mo84155b(str);
                if (b != null) {
                    str3 = b.getNickname();
                }
            } else if (str2 != null) {
                str3 = str2;
            }
            stringBuffer.append("displayName is is finder contact");
        } else {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            if (((int) z1Var.f108320R1) != 0 && !Util.isNullOrNil(z1Var.mo62898f())) {
                str3 = z1Var.mo62898f();
                C87412m.m108593f(str3, "ct.displayRemark");
                stringBuffer.append("displayName is " + str3);
            } else if (Util.isNullOrNil(str2)) {
                str3 = z1Var.getUsername();
                C87412m.m108593f(str3, "ct.getUsername()");
            } else if (str2 != null) {
                str3 = str2;
            }
        }
        if (z) {
            String str4 = f168296b;
            Log.m105924i(str4, "getDisplayName username " + str + " nickname " + str2 + " buf:" + stringBuffer);
        }
        return str3;
    }

    /* renamed from: R0 */
    public final boolean mo83899R0(String str) {
        return C58739j4.f168176a.mo83691T(str);
    }

    /* renamed from: S0 */
    public final boolean mo83900S0(Context context) {
        C87412m.m108594g(context, "context");
        MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
        if (mMActivity == null) {
            return false;
        }
        return C87412m.m108589b(mMActivity.getIntent().getStringExtra("finder_username"), C66785b.f191882e.mo90662O5()) && mMActivity.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
    }

    /* renamed from: T */
    public final C0740i2 mo83901T(int i, List<? extends C0740i2> list) {
        C87412m.m108594g(list, "feedList");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return (C0740i2) list.get(i);
    }

    /* renamed from: T0 */
    public final boolean mo83902T0() {
        C66785b bVar = C66785b.f191882e;
        C54446b a = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
        return ((a != null ? a.field_extFlag : 0) & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0;
    }

    /* renamed from: U */
    public final List<C58564i> mo83903U(int i, int i2, RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        LinkedList linkedList = new LinkedList();
        if (i < 0 || i2 < 0 || i > i2) {
            return C110818d0.m150900B0(linkedList);
        }
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        if (adapter instanceof WxRecyclerAdapter) {
            WxRecyclerAdapter wxRecyclerAdapter = (WxRecyclerAdapter) adapter;
            List data = wxRecyclerAdapter.getData();
            if (i <= i2) {
                while (true) {
                    int c6 = i - wxRecyclerAdapter.mo85796c6();
                    if (c6 >= 0 && c6 < data.size()) {
                        C9493c cVar = (C9493c) data.get(c6);
                        if (cVar.getItemId() != 0 && (cVar instanceof C0740i2)) {
                            C58564i iVar = new C58564i((C0740i2) cVar, c6, (C9508q) null, 4, (C8480h) null);
                            C9508q qVar = wxRecyclerAdapter.f165744w.get(cVar.getItemId());
                            if (qVar != null) {
                                iVar.f167638c = qVar;
                            }
                            linkedList.add(iVar);
                        }
                    }
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
        } else if (adapter instanceof C60191o5) {
            C60191o5 o5Var = (C60191o5) adapter;
            List<BaseFinderFeed> data2 = o5Var.getData();
            if (i <= i2) {
                while (true) {
                    int y1 = o5Var.mo3957y1(i);
                    if (y1 >= 0 && y1 < data2.size()) {
                        BaseFinderFeed baseFinderFeed = data2.get(y1);
                        if (baseFinderFeed.getItemId() != 0) {
                            linkedList.add(new C58564i(baseFinderFeed, y1, (C9508q) null, 4, (C8480h) null));
                        }
                    }
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return C110818d0.m150900B0(linkedList);
    }

    /* renamed from: U0 */
    public final boolean mo83904U0() {
        C66785b bVar = C66785b.f191882e;
        C54446b a = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
        return ((a != null ? a.field_extFlag : 0) & 262144) != 0;
    }

    /* renamed from: V */
    public final String mo83905V(String str) {
        C37521f.f99374d.getClass();
        int intValue = C37521f.f99512s5.mo60266n().intValue();
        if (str == null) {
            str = "";
        }
        return intValue != 1 ? intValue != 2 ? str : "较长的测试名称长长长长长长长长长长长长长长长长" : "较短的测试名称";
    }

    /* renamed from: V0 */
    public final boolean mo83906V0(C49295ek0 ek02) {
        return !C87412m.m108589b(" ", ek02 != null ? ek02.f132980r : null);
    }

    /* renamed from: W */
    public final String mo83907W(int i) {
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 7 ? i != 8 ? i != 10 ? "" : "network" : "cleaner" : EnvConsts.ACTIVITY_MANAGER_SRVNAME : "preload" : "fans" : "feed" : "follow";
        if (Util.isNullOrNil(str)) {
            C58741j5 j5Var = C58741j5.f168184a;
            return C58741j5.f168185b + "page/";
        }
        StringBuilder sb = new StringBuilder();
        C58741j5 j5Var2 = C58741j5.f168184a;
        sb.append(C58741j5.f168185b + "page/");
        sb.append(str);
        sb.append(XVFSFile.SEPARATOR_CHAR);
        return sb.toString();
    }

    /* renamed from: W0 */
    public final boolean mo83908W0(long j) {
        return (j & 1) != 1;
    }

    /* renamed from: X */
    public final String mo83909X(BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(baseFinderFeed, "feed");
        String string = MMApplicationContext.getContext().getString(C0966R.string.m7k);
        C87412m.m108593f(string, "getContext().getString(R…_ringtone_original_sound)");
        return string;
    }

    /* renamed from: X0 */
    public final boolean mo83910X0() {
        return BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG || WeChatEnvironment.hasDebugger();
    }

    /* renamed from: Y */
    public final String mo83911Y(String str, int i) {
        C87412m.m108594g(str, "key");
        return C58739j4.f168176a.mo83724w(str, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x001c A[SYNTHETIC] */
    /* renamed from: Y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83912Y0(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "finderUserName"
            gy3.C87412m.m108594g(r8, r0)
            fe1.d$b r0 = fe1.C58961d.f168673a
            r0.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            zc1.b r1 = zc1.C66785b.f191882e
            r2 = 0
            r3 = 0
            r4 = 1
            java.util.List r1 = zc1.C66783a.C66784a.m78799b(r1, r3, r4, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x007b
            java.lang.Object r2 = r1.next()
            bd1.b r2 = (bd1.C54446b) r2
            java.lang.String r5 = r2.field_username
            zc1.b r6 = zc1.C66785b.f191882e
            java.lang.String r6 = r6.mo90662O5()
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 == 0) goto L_0x0062
            java.lang.String r5 = r2.field_finder_version_username_history
            if (r5 == 0) goto L_0x0043
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r5 = 0
            goto L_0x0044
        L_0x0043:
            r5 = 1
        L_0x0044:
            if (r5 == 0) goto L_0x0062
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FINDER_USERNAME_LIST_STRING_SYNC
            java.lang.String r6 = ""
            java.lang.String r2 = r2.mo119675I(r5, r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.String r6 = ","
            java.util.List r2 = com.tencent.p014mm.sdk.platformtools.Util.stringToList(r2, r6)
            r5.<init>(r2)
            goto L_0x006a
        L_0x0062:
            java.lang.String r2 = r2.field_finder_version_username_history
            java.lang.String r5 = ";"
            java.util.List r5 = com.tencent.p014mm.sdk.platformtools.Util.stringToList(r2, r5)
        L_0x006a:
            java.lang.String r2 = "users"
            gy3.C87412m.m108593f(r5, r2)
            boolean r2 = r5.isEmpty()
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x001c
            r0.addAll(r5)
            goto L_0x001c
        L_0x007b:
            boolean r8 = r0.contains(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58784w3.mo83912Y0(java.lang.String):boolean");
    }

    /* renamed from: Z0 */
    public final boolean mo83913Z0() {
        if (C66785b.f191882e.mo90673n0().mo62398d().f141683o == 0) {
            C37521f.f99374d.getClass();
            return ((Boolean) C37521f.f99301U4.mo60266n()).booleanValue();
        }
    }

    /* renamed from: a0 */
    public final C72994y1.C72995a mo83914a0(int i) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_TIMELINE_ALL_LASTBUF_STRING_SYNC;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? aVar : C72994y1.C72995a.USERINFO_FINDER_TIMELINE_MACHINE_LASTBUF_STRING_SYNC : C72994y1.C72995a.USERINFO_FINDER_TIMELINE_FOLLOW_LASTBUF_STRING_SYNC : C72994y1.C72995a.USERINFO_FINDER_TIMELINE_LBS_LASTBUF_STRING_SYNC : C72994y1.C72995a.USERINFO_FINDER_TIMELINE_FRIEND_LASTBUF_STRING_SYNC : aVar;
    }

    /* renamed from: a1 */
    public final boolean mo83915a1() {
        long k = C75592q0.m90781k();
        boolean U = C45628s0.m50756U();
        boolean z = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("ExtFunctionSwitchEntry", 0) == 1;
        boolean z2 = (k & 34359738368L) != 0;
        String str = f168296b;
        Log.m105924i(str, "isWechatFinderDisable isShowWechatUserDialog:" + z + ", isWeChatUser:" + U + ", close:" + z2);
        return U && z && z2;
    }

    /* renamed from: b */
    public final void mo83916b(String str, int i) {
        C87412m.m108594g(str, "logPrefix");
        C58739j4.f168176a.mo83700b(str, i);
    }

    /* renamed from: b0 */
    public final Integer mo83917b0(int i, boolean z) {
        switch (i) {
            case 1:
                C37521f.f99374d.getClass();
                if (C37521f.f99244N7.mo60266n().intValue() == 1) {
                    return z ? Integer.valueOf(C0966R.raw.finder_like_new_style_outlined_normal_bold) : Integer.valueOf(C0966R.raw.finder_like_new_style_outlined_normal);
                }
                return null;
            case 2:
                C37521f.f99374d.getClass();
                if (C37521f.f99244N7.mo60266n().intValue() == 1) {
                    return Integer.valueOf(C0966R.raw.finder_like_new_style_filled_normal);
                }
                return null;
            case 3:
                C37521f.f99374d.getClass();
                if (C37521f.f99244N7.mo60266n().intValue() == 1) {
                    return Integer.valueOf(C0966R.raw.finder_like_new_style_outlined_group);
                }
                return null;
            case 4:
                C37521f.f99374d.getClass();
                if (C37521f.f99244N7.mo60266n().intValue() == 1) {
                    return Integer.valueOf(C0966R.raw.finder_like_new_style_filled_group);
                }
                return null;
            case 5:
                C37521f.f99374d.getClass();
                if (C37521f.f99244N7.mo60266n().intValue() == 1) {
                    return Integer.valueOf(C0966R.raw.finder_like_new_style_outlined_lock);
                }
                return null;
            case 6:
                C37521f.f99374d.getClass();
                if (C37521f.f99244N7.mo60266n().intValue() == 1) {
                    return Integer.valueOf(C0966R.raw.finder_like_new_style_filled_lock);
                }
                return null;
            case 7:
                C37521f.f99374d.getClass();
                if (C37521f.f99244N7.mo60266n().intValue() == 1) {
                    return Integer.valueOf(C0966R.raw.finder_like_new_style_outlined_list);
                }
                return null;
            case 8:
                C37521f.f99374d.getClass();
                if (C37521f.f99244N7.mo60266n().intValue() == 1) {
                    return Integer.valueOf(C0966R.raw.finder_like_new_style_filled_list);
                }
                return null;
            default:
                return null;
        }
    }

    /* renamed from: b1 */
    public final String mo83918b1(FinderJumpInfo finderJumpInfo) {
        C87412m.m108594g(finderJumpInfo, "jumpInfo");
        StringBuilder sb = new StringBuilder();
        sb.append("jump_id=");
        sb.append(finderJumpInfo.jump_id);
        sb.append("#jump_type=");
        sb.append(finderJumpInfo.jumpinfo_type);
        sb.append("#business_type=");
        sb.append(finderJumpInfo.business_type);
        sb.append("#wording=");
        sb.append(finderJumpInfo.wording);
        sb.append("#style=");
        LinkedList<uc4> linkedList = finderJumpInfo.style;
        C87412m.m108593f(linkedList, "jumpInfo.style");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (uc4 uc4 : linkedList) {
            arrayList.add("pos=" + uc4.f142760f + "#style=" + uc4.f142762h + "#screen=" + uc4.f142758d + "#delayAppearTime=" + uc4.f142772u + "#appearTime=" + uc4.f142777z + "#disappearTime=" + uc4.f142745B + "#condition=" + uc4.f142752I);
        }
        sb.append(arrayList);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo83919c(View view, View view2, float f, int i, String str, long j, int i2) {
        int i3;
        int i4;
        int i5;
        float f2 = f;
        int i6 = i;
        String str2 = str;
        C87412m.m108594g(view2, "child");
        if (view != null) {
            Context context = view.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            Context baseContext = ((Activity) context).getBaseContext();
            boolean z = baseContext.getResources().getConfiguration().orientation == 1;
            if (!z ? (i3 = baseContext.getResources().getDisplayMetrics().widthPixels) < (i5 = baseContext.getResources().getDisplayMetrics().heightPixels) : (i3 = baseContext.getResources().getDisplayMetrics().widthPixels) > (i5 = baseContext.getResources().getDisplayMetrics().heightPixels)) {
                i3 = i5;
            }
            C58784w3 w3Var = f168295a;
            w3Var.getClass();
            int intValue = i6 - ((Number) ((C36570n) f168304j).getValue()).intValue();
            float f3 = (float) i6;
            float f4 = (float) i3;
            float f5 = (f3 * 1.0f) / f4;
            float t0 = (((float) (intValue - w3Var.mo83965t0())) * 1.0f) / f4;
            float f6 = (((float) intValue) * 1.0f) / f4;
            C13601g gVar = f168302h;
            float intValue2 = (((float) (intValue - ((Number) ((C36570n) gVar).getValue()).intValue())) * 1.0f) / f4;
            float f7 = 0.45f * f3;
            int b = C60641c.m70921b(0.05f * f3);
            boolean z2 = z;
            if (Float.isNaN(f)) {
                view2.getLayoutParams().width = i3;
                view2.getLayoutParams().height = i3;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = w3Var.mo83965t0();
                layoutParams2.bottomMargin = 0;
                layoutParams2.gravity = 48;
                C11348f.C11349a.m11178b(C59319a.f169618b, "calculateMedia_radio_error", false, (C11348f.C11352b) null, false, false, new C7915d(str2, j), 28, (Object) null);
                i4 = -2;
            } else {
                int i7 = i2 & 1;
                if (i7 != 0 || ((Boolean) ((C36570n) f168305k).getValue()).booleanValue()) {
                    if (f2 >= f5) {
                        view2.getLayoutParams().height = i6;
                        view2.getLayoutParams().width = C60641c.m70921b(f3 / f2);
                    } else {
                        view2.getLayoutParams().width = i3;
                        view2.getLayoutParams().height = C60641c.m70921b(f4 * f2);
                    }
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.topMargin = 0;
                    layoutParams4.bottomMargin = 0;
                    layoutParams4.gravity = 17;
                    i4 = i7 != 0 ? -100 : -1;
                } else if (f2 >= f5) {
                    view2.getLayoutParams().width = i3;
                    view2.getLayoutParams().height = C60641c.m70921b(f4 * f2);
                    ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                    C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                    layoutParams6.topMargin = 0;
                    layoutParams6.bottomMargin = 0;
                    layoutParams6.gravity = 17;
                    i4 = 1;
                } else if (f6 < f2) {
                    view2.getLayoutParams().width = C60641c.m70921b(f3 / f2);
                    view2.getLayoutParams().height = i6;
                    ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
                    C87412m.m108592e(layoutParams7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                    layoutParams8.topMargin = 0;
                    layoutParams8.bottomMargin = 0;
                    layoutParams8.gravity = 17;
                    i4 = 2;
                } else if (t0 < f2) {
                    view2.getLayoutParams().width = i3;
                    view2.getLayoutParams().height = intValue;
                    ViewGroup.LayoutParams layoutParams9 = view.getLayoutParams();
                    C87412m.m108592e(layoutParams9, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams9;
                    layoutParams10.topMargin = 0;
                    layoutParams10.bottomMargin = 0;
                    layoutParams10.gravity = 48;
                    i4 = 3;
                } else {
                    float f8 = f4 * f2;
                    if (f7 - (f8 / ((float) 2)) >= ((float) w3Var.mo83965t0())) {
                        view2.getLayoutParams().width = i3;
                        view2.getLayoutParams().height = C60641c.m70921b(f8);
                        ViewGroup.LayoutParams layoutParams11 = view.getLayoutParams();
                        C87412m.m108592e(layoutParams11, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) layoutParams11;
                        layoutParams12.topMargin = -b;
                        layoutParams12.bottomMargin = 0;
                        layoutParams12.gravity = 17;
                        i4 = 4;
                    } else if (t0 <= f2 || f2 < 1.7777778f) {
                        view2.getLayoutParams().width = i3;
                        view2.getLayoutParams().height = C60641c.m70921b(f8);
                        ViewGroup.LayoutParams layoutParams13 = view.getLayoutParams();
                        C87412m.m108592e(layoutParams13, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) layoutParams13;
                        layoutParams14.topMargin = w3Var.mo83965t0();
                        layoutParams14.bottomMargin = 0;
                        layoutParams14.gravity = 48;
                        i4 = 6;
                    } else {
                        view2.getLayoutParams().width = i3;
                        view2.getLayoutParams().height = C60641c.m70921b(f4 * intValue2);
                        ViewGroup.LayoutParams layoutParams15 = view.getLayoutParams();
                        C87412m.m108592e(layoutParams15, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        FrameLayout.LayoutParams layoutParams16 = (FrameLayout.LayoutParams) layoutParams15;
                        layoutParams16.topMargin = ((Number) ((C36570n) gVar).getValue()).intValue();
                        layoutParams16.bottomMargin = 0;
                        layoutParams16.gravity = 48;
                        i4 = 5;
                    }
                }
            }
            String str3 = f168296b;
            Log.m105924i(str3, "calculateMediaLayoutParams: source=" + i4 + ", tag=" + str2 + ", screenWidth=" + i3 + ", screenHeight=" + i6 + ", radio=" + f2 + ", screenRadio=" + f5 + ", avatarFromScreenTopRadio=" + f6 + ", avatarFromTopBarRadio=" + t0 + ", isPortrait=" + z2);
        }
    }

    /* renamed from: c1 */
    public final void mo83920c1(Context context, C64311db1 db12, boolean z, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(db12, FirebaseAnalytics.C113379b.LOCATION);
        if (Util.isNullOrNil(db12.f182666i)) {
            Intent intent = new Intent();
            intent.putExtra("map_view_type", 7);
            intent.putExtra("kwebmap_slat", Double.valueOf((double) db12.f182662e));
            intent.putExtra("kwebmap_lng", Double.valueOf((double) db12.f182661d));
            intent.putExtra("kwebmap_scale", i);
            String str = db12.f182664g;
            if (Util.isNullOrNil(str)) {
                str = db12.f182663f;
            }
            intent.putExtra("kPoiName", str);
            intent.putExtra("Kwebmap_locaion", db12.f182665h);
            intent.putExtra("kShowshare", z);
            C88144b.m109791i(context, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, (Bundle) null);
            return;
        }
        String str2 = C89625d.f257847m;
        C87412m.m108593f(str2, "MM_NEAR_LIFE_URI");
        String format = String.format(str2, Arrays.copyOf(new Object[]{db12.f182666i}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        Intent intent2 = new Intent();
        intent2.putExtra("rawUrl", format);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
    }

    /* renamed from: d */
    public final int mo83921d(BaseFinderFeed baseFinderFeed, C64689rq2 rq22, int i) {
        C87412m.m108594g(baseFinderFeed, "item");
        C87412m.m108594g(rq22, "mediaObj");
        if (i <= 0) {
            return 0;
        }
        Size b = C65840n.m77566b(rq22, true);
        int height = (baseFinderFeed.mo3513o().isLiveFeed() || b.getWidth() <= 0) ? (int) ((((double) i) * 3.5d) / ((double) 3)) : (b.getHeight() * i) / b.getWidth();
        float f = (float) height;
        float f2 = (float) i;
        float f3 = 1.3166667f * f2;
        if (f > f3) {
            return (int) f3;
        }
        float f4 = f2 * 0.95f;
        if (f >= f4) {
            return height;
        }
        int i2 = (int) f4;
        String str = f168296b;
        Log.m105924i(str, "calculateStaggeredLayoutParams: originWidth:" + i + " targetHeightL:" + i2);
        return i2;
    }

    /* renamed from: d0 */
    public final <T, E> List<E> mo83922d0(List<? extends T> list, Class<E> cls) {
        C87412m.m108594g(list, "dataList");
        C87412m.m108594g(cls, "clazz");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (cls.isInstance(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: d1 */
    public final void mo83923d1(Context context, m74 m74, boolean z, boolean z2, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(m74, FirebaseAnalytics.C113379b.LOCATION);
        C64311db1 db12 = new C64311db1();
        db12.f182661d = m74.f184219d;
        db12.f182662e = m74.f184220e;
        db12.f182663f = m74.f184221f;
        db12.f182664g = m74.f184222g;
        db12.f182665h = m74.f184223h;
        db12.f182666i = z ? "" : m74.f184224i;
        db12.f182667j = m74.f184225j;
        db12.f182670p = m74.f184234v;
        C13598b0 b0Var = C13598b0.f38549a;
        mo83920c1(context, db12, z2, i);
    }

    /* renamed from: e */
    public final boolean mo83924e(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        return (finderObject.permissionFlag & 2) == 0;
    }

    /* renamed from: e0 */
    public final float mo83925e0(List<? extends C64689rq2> list) {
        C87412m.m108594g(list, "list");
        C64689rq2 rq22 = (C64689rq2) C110818d0.m150916N(list);
        if (rq22 == null) {
            return 0.75f;
        }
        for (C64689rq2 rq23 : list) {
            if ((rq22.f185271i * 1.0f) / rq22.f185270h < (rq23.f185271i * 1.0f) / rq23.f185270h) {
                rq22 = rq23;
            }
        }
        return (rq22.f185271i * 1.0f) / rq22.f185270h;
    }

    /* renamed from: e1 */
    public final void mo83926e1(Context context, Intent intent, int i, m74 m74, boolean z, int i2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(m74, FirebaseAnalytics.C113379b.LOCATION);
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("map_view_type", i);
        intent.putExtra("kwebmap_slat", (double) m74.f184220e);
        intent.putExtra("kwebmap_lng", (double) m74.f184219d);
        intent.putExtra("kPoiid", m74.f184224i);
        intent.putExtra("KIsFromPoiList", m74.f184235w);
        String str = m74.f184222g;
        if (Util.isNullOrNil(str)) {
            str = m74.f184221f;
            if (Util.isNullOrNil(m74.f184223h)) {
                i2 = 9;
            }
        }
        intent.putExtra("kPoiName", str);
        intent.putExtra("Kwebmap_locaion", m74.f184223h);
        intent.putExtra("kwebmap_scale", i2);
        intent.putExtra("kShowshare", z);
        intent.putExtra("key_drawer_allow_no_poiid", true);
        intent.putExtra("key_drawer_expend", true);
        if (intent.getSerializableExtra("key_from_type") == null) {
            intent.putExtra("key_from_type", C98522w3.C8810a.FINDER_POI_FROM_TYPE_FINDER);
        }
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        intent.putExtra("key_context_id", f != null ? f.mo12861q3().f134671e : null);
        C88144b.m109791i(context, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, (Bundle) null);
    }

    /* renamed from: f */
    public final boolean mo83927f(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        return (finderObject.permissionFlag & 128) == 0;
    }

    /* renamed from: f0 */
    public final String mo83928f0(C55011a aVar) {
        C87412m.m108594g(aVar, "item");
        C66276va vaVar = aVar.f154465d;
        if (!vaVar.mo90403l2()) {
            return f168295a.mo83931g0(vaVar.field_username, vaVar.field_nickname);
        }
        StringBuilder sb = new StringBuilder();
        Iterator<FinderContact> it = vaVar.field_aggregatedContacts.f182696d.iterator();
        while (it.hasNext()) {
            FinderContact next = it.next();
            sb.append(f168295a.mo83931g0(next.username, next.nickname));
            sb.append("，");
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "nickNameList.toString()");
        if (Util.isNullOrNil(sb4)) {
            return sb4;
        }
        String substring = sb4.substring(0, sb4.length() - 1);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: f1 */
    public final boolean mo83929f1(Context context, FinderJumpInfo finderJumpInfo, Integer num) {
        C87412m.m108594g(context, "context");
        if (finderJumpInfo == null) {
            return false;
        }
        C11920q qVar = new C11920q(finderJumpInfo);
        qVar.f34841o = 8;
        qVar.f34842p = 10;
        qVar.f34833g = "timeline";
        qVar.f34852z = num;
        C62262d0.f176978a.mo87313b(context, qVar, 1, (C60905o) null);
        return true;
    }

    /* renamed from: g */
    public final boolean mo83930g(int i) {
        C32444a aVar = C32444a.f86121a;
        if (C32444a.f86156i2.mo60266n().intValue() == 1) {
            return false;
        }
        return !C61926c.m72696u(i, 65536);
    }

    /* renamed from: g0 */
    public final String mo83931g0(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            return str2 == null ? "" : str2;
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return mo83898R(str, str2, false);
    }

    /* renamed from: g1 */
    public final boolean mo83932g1(C60905o oVar, FinderObject finderObject, Integer num) {
        FinderJumpInfo h0;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(finderObject, "feedObject");
        if (!mo83891O0(finderObject) || (h0 = mo83934h0(finderObject)) == null) {
            return false;
        }
        C11920q qVar = new C11920q(h0);
        qVar.f34841o = 8;
        qVar.f34842p = 10;
        qVar.f34833g = "timeline";
        qVar.f34852z = num;
        C62262d0 d0Var = C62262d0.f176978a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        d0Var.mo87313b(context, qVar, 1, oVar);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00be, code lost:
        if (((r6 == null || (r6 = r6.media) == null) ? 0 : r6.size()) > 1) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00df A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e0  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83933h(com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r9) {
        /*
            r8 = this;
            java.lang.String r0 = "feed"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_finder_ring_tone_entrance_switch
            r2 = 1
            boolean r0 = r0.mo58784wf(r1, r2)
            r1 = 0
            if (r0 != 0) goto L_0x0018
            return r1
        L_0x0018:
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r9.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.getFinderObject()
            java.lang.String r0 = "obj"
            gy3.C87412m.m108594g(r9, r0)
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r9.objectDesc
            if (r0 == 0) goto L_0x0031
            int r0 = r0.mediaType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x0049
        L_0x0031:
            java.lang.String r0 = f168296b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "obj "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r0, r3, r4)
        L_0x0049:
            er1.j4 r0 = er1.C58739j4.f168176a
            java.util.List r3 = r0.mo83721q()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r9.objectDesc
            r5 = 0
            if (r4 == 0) goto L_0x005b
            int r4 = r4.mediaType
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x005c
        L_0x005b:
            r4 = r5
        L_0x005c:
            boolean r3 = sx3.C110818d0.m150903D(r3, r4)
            r4 = 4
            if (r3 == 0) goto L_0x006e
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r9.objectDesc
            if (r0 == 0) goto L_0x006b
            int r0 = r0.mediaType
            goto L_0x00dd
        L_0x006b:
            r0 = 0
            goto L_0x00dd
        L_0x006e:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r9.objectDesc
            if (r3 == 0) goto L_0x007e
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r3 = r3.media
            if (r3 == 0) goto L_0x007e
            int r3 = r3.size()
            if (r3 != 0) goto L_0x007e
            r3 = 1
            goto L_0x007f
        L_0x007e:
            r3 = 0
        L_0x007f:
            if (r3 == 0) goto L_0x0088
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r9.objectDesc
            if (r0 == 0) goto L_0x006b
            int r0 = r0.mediaType
            goto L_0x00dd
        L_0x0088:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r9.objectDesc
            if (r3 == 0) goto L_0x009b
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r3 = r3.media
            if (r3 == 0) goto L_0x009b
            java.lang.Object r3 = r3.get(r1)
            com.tencent.mm.protocal.protobuf.FinderMedia r3 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r3
            if (r3 == 0) goto L_0x009b
            int r3 = r3.mediaType
            goto L_0x009c
        L_0x009b:
            r3 = 0
        L_0x009c:
            java.util.List r0 = r0.mo83721q()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x00ac
        L_0x00aa:
            r0 = r3
            goto L_0x00dd
        L_0x00ac:
            r0 = 8
            if (r3 != r4) goto L_0x00c1
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r9.objectDesc
            if (r6 == 0) goto L_0x00bd
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r6 = r6.media
            if (r6 == 0) goto L_0x00bd
            int r6 = r6.size()
            goto L_0x00be
        L_0x00bd:
            r6 = 0
        L_0x00be:
            if (r6 <= r2) goto L_0x00c1
            goto L_0x00dd
        L_0x00c1:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r9.objectDesc
            if (r6 == 0) goto L_0x00aa
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r6 = r6.media
            if (r6 == 0) goto L_0x00aa
            java.util.Iterator r6 = r6.iterator()
        L_0x00cd:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00aa
            java.lang.Object r7 = r6.next()
            com.tencent.mm.protocal.protobuf.FinderMedia r7 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r7
            int r7 = r7.mediaType
            if (r7 == r3) goto L_0x00cd
        L_0x00dd:
            if (r0 == r4) goto L_0x00e0
            return r1
        L_0x00e0:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r9.objectDesc
            if (r0 == 0) goto L_0x00e6
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r5 = r0.media
        L_0x00e6:
            if (r5 == 0) goto L_0x0133
            if (r0 == 0) goto L_0x00f6
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r0.isEmpty()
            if (r0 != r2) goto L_0x00f6
            r0 = 1
            goto L_0x00f7
        L_0x00f6:
            r0 = 0
        L_0x00f7:
            if (r0 == 0) goto L_0x00fa
            goto L_0x0133
        L_0x00fa:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r9.objectDesc
            if (r0 == 0) goto L_0x0133
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r0.getFirst()
            com.tencent.mm.protocal.protobuf.FinderMedia r0 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r0
            if (r0 == 0) goto L_0x0133
            int r0 = r0.videoDuration
            java.lang.Class<lc3.b> r3 = lc3.C10485b.class
            k40.a r3 = f40.C86709a0.m107533q(r3)
            lc3.b r3 = (lc3.C10485b) r3
            pj.f r3 = r3.vh0()
            java.lang.String r4 = "FinderRingToneVideoDurationLimit"
            java.lang.String r3 = r3.mo107405c(r4)
            r4 = 300(0x12c, double:1.48E-321)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r4)
            long r5 = (long) r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x012a
            return r1
        L_0x012a:
            int r9 = r9.permissionFlag
            r9 = r9 & 64
            if (r9 != 0) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            r2 = 0
        L_0x0132:
            return r2
        L_0x0133:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58784w3.mo83933h(com.tencent.mm.plugin.finder.model.BaseFinderFeed):boolean");
    }

    /* renamed from: h0 */
    public final FinderJumpInfo mo83934h0(FinderObject finderObject) {
        C51384te1 te12;
        C87412m.m108594g(finderObject, "feedObject");
        C50124kf1 kf12 = finderObject.object_extend;
        if (kf12 == null || (te12 = kf12.f136749h) == null) {
            return null;
        }
        return te12.f142162j;
    }

    /* renamed from: h1 */
    public final void mo83935h1(Context context) {
        C87412m.m108594g(context, "context");
        Intent intent = new Intent();
        intent.putExtra("rawUrl", "https://weixin.qq.com/cgi-bin/readtemplate?t=page/agreement/finder_live_user_event");
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: i */
    public final boolean mo83936i(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        return (finderObject.permissionFlag & 1) == 0;
    }

    /* renamed from: i0 */
    public final C52192z0 mo83937i0(FinderJumpInfo finderJumpInfo) {
        LinkedList<uc4> linkedList;
        T t;
        boolean z;
        if (finderJumpInfo == null || (linkedList = finderJumpInfo.style) == null) {
            return null;
        }
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            uc4 uc4 = (uc4) t;
            if (uc4.f142760f == 8 && uc4.f142762h == 10) {
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
        uc4 uc42 = (uc4) t;
        if (uc42 != null) {
            return uc42.f142776y;
        }
        return null;
    }

    /* renamed from: i1 */
    public final C4191v0 mo83938i1(Context context, String str, Intent intent, int i, C32226l<? super String, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        Log.m105925i(f168296b, "jump to wx profile %s", str);
        Intent intent2 = new Intent();
        if (intent != null) {
            intent2.putExtras(intent);
        }
        if (!Util.isNullOrNil(str)) {
            intent2.putExtra("Username", str);
        }
        return C56664y5.f162421d.mo80021e(context, intent2, i, lVar);
    }

    /* renamed from: j */
    public final boolean mo83939j(FinderObject finderObject) {
        boolean z;
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        boolean z2 = (finderObject.permissionFlag & 16) == 0;
        C64273c21 c212 = finderObject.liveInfo;
        if (c212 != null) {
            z = mo83930g(c212 != null ? c212.f182385X0 : 0);
        } else {
            z = true;
        }
        return z2 && z;
    }

    /* renamed from: j0 */
    public final C52192z0 mo83940j0(FinderObject finderObject) {
        C87412m.m108594g(finderObject, "feedObject");
        return mo83937i0(mo83934h0(finderObject));
    }

    /* renamed from: j1 */
    public final void mo83941j1(C60905o oVar, String str, C55033u uVar) {
        int i;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(str, "feedUserName");
        C87412m.m108594g(uVar, "item");
        Intent intent = new Intent();
        if (Util.isNullOrNil(str) || !C87412m.m108589b(str, C66785b.f191882e.mo90662O5())) {
            intent.putExtra("Action", 2);
            intent.putExtra("IsPoster", false);
            i = 5;
        } else {
            intent.putExtra("IsPoster", true);
            if (uVar.f154492d.mo89529l2() == 0 && !Util.isNullOrNil(uVar.f154492d.getUsername()) && !C75592q0.m90789s().equals(uVar.f154492d.getUsername())) {
                intent.putExtra("Action", 1);
            }
            intent.putExtra("feedUser", str);
            i = 3;
        }
        intent.putExtra("Avatar", uVar.f154492d.mo89537t2());
        intent.putExtra("Nickname", uVar.f154495g);
        intent.putExtra("CommentId", uVar.f154492d.mo89531n2());
        intent.putExtra("FeedId", uVar.f154492d.field_feedId);
        intent.putExtra("FeedNonceId", uVar.f154492d.field_objectNonceId);
        intent.putExtra("V5UserName", uVar.f154492d.getUsername());
        if (uVar.f154492d.mo89532o2().msgInfo != null) {
            C50405mi0 mi02 = uVar.f154492d.mo89532o2().msgInfo;
            intent.putExtra("ContactMsgInfo", mi02 != null ? mi02.toByteArray() : null);
        }
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        m68437l1(this, context, uVar.f154492d.getUsername(), intent, i, (C32226l) null, 16, (Object) null);
        uVar.f154492d.mo89532o2();
        if (uVar.f154492d.mo89532o2().msgInfo == null) {
            String str2 = f168296b;
            Log.m105924i(str2, "msgInfo is null ,feedId:" + uVar.f154492d.field_feedId + ",comentId:" + uVar.f154492d.mo89531n2());
        }
    }

    /* renamed from: k */
    public final boolean mo83942k(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        return (finderObject.permissionFlag & 2097152) == 0;
    }

    /* renamed from: k0 */
    public final long mo83943k0() {
        return ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13315K5();
    }

    /* renamed from: k1 */
    public final void mo83944k1(C60905o oVar, String str, C64151e eVar) {
        int i;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(str, "feedUserName");
        C87412m.m108594g(eVar, "item");
        Intent intent = new Intent();
        if (Util.isNullOrNil(str) || !C87412m.m108589b(str, C66785b.f191882e.mo90662O5())) {
            intent.putExtra("Action", 2);
            intent.putExtra("IsPoster", false);
            i = 5;
        } else {
            intent.putExtra("IsPoster", true);
            if (eVar.f181868d.mo88876n2().blacklist_flag == 0 && !Util.isNullOrNil(eVar.f181868d.getUsername()) && !C75592q0.m90789s().equals(eVar.f181868d.getUsername())) {
                intent.putExtra("Action", 1);
            }
            intent.putExtra("feedUser", str);
            i = 3;
        }
        intent.putExtra("Avatar", eVar.f181868d.mo88880r2());
        intent.putExtra("Nickname", eVar.f181868d.getNickname());
        intent.putExtra("FeedNonceId", eVar.f181868d.field_objectNonceId);
        intent.putExtra("V5UserName", eVar.f181868d.getUsername());
        if (eVar.f181868d.mo88876n2().msgInfo != null) {
            C50405mi0 mi02 = eVar.f181868d.mo88876n2().msgInfo;
            intent.putExtra("ContactMsgInfo", mi02 != null ? mi02.toByteArray() : null);
        }
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        m68437l1(this, context, eVar.f181868d.getUsername(), intent, i, (C32226l) null, 16, (Object) null);
        eVar.f181868d.mo88876n2();
        if (eVar.f181868d.mo88876n2().msgInfo == null) {
            String str2 = f168296b;
            Log.m105924i(str2, "msgInfo is null ,feedId:" + eVar.f181868d.field_feedId + ",comentId:" + eVar.f181868d.mo88875m2());
        }
    }

    /* renamed from: l */
    public final void mo83945l(Window window, boolean z) {
        C87412m.m108594g(window, "window");
        C85875k4.m106175c0(window, z);
        C85875k4.m106173b0(window, z);
    }

    /* renamed from: l0 */
    public final String mo83946l0(String str, String str2) {
        if (Util.isNullOrNil(str, str2)) {
            return !Util.isNullOrNil(str) ? str : !Util.isNullOrNil(str2) ? str2 : "";
        }
        return MMApplicationContext.getResources().getString(C0966R.string.eay, new Object[]{str, str2});
    }

    /* renamed from: m */
    public final boolean mo83947m() {
        boolean u = C61926c.m72696u(C66785b.f191882e.mo90673n0().mo62398d().f141692x, 4);
        if (mo83910X0()) {
            String str = f168296b;
            Log.m105924i(str, "[checkBindPhone] " + u);
        }
        return u;
    }

    /* renamed from: m0 */
    public final int mo83948m0(C0740i2 i2Var, List<? extends C0740i2> list) {
        C87412m.m108594g(list, "feedList");
        int i = 0;
        if (i2Var != null) {
            int i2 = 0;
            for (T next : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    if (((C0740i2) next).getItemId() == i2Var.getItemId()) {
                        i = i2;
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        return i;
    }

    /* renamed from: m1 */
    public final boolean mo83949m1(RecyclerView recyclerView) {
        RecyclerView.C16613e adapter;
        C87412m.m108594g(recyclerView, "recyclerView");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            WxRecyclerAdapter wxRecyclerAdapter = null;
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            if (layoutManager != null && (adapter = recyclerView.getAdapter()) != null) {
                if (adapter instanceof WxRecyclerAdapter) {
                    wxRecyclerAdapter = adapter;
                }
                if (wxRecyclerAdapter != null) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int C = linearLayoutManager.mo16957C();
                    int E = linearLayoutManager.mo16959E();
                    List data = wxRecyclerAdapter.getData();
                    int size = data.size();
                    if (C <= E) {
                        while (true) {
                            if (!(C >= 0 && C < size) || !(data.get(C) instanceof C0707a0)) {
                                if (C == E) {
                                    break;
                                }
                                C++;
                            } else {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: n0 */
    public final String mo83950n0(String str) {
        C87412m.m108594g(str, "desc");
        if (str.length() <= 5) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 5);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append("***");
        return sb.toString();
    }

    /* renamed from: n1 */
    public final C2819w0 mo83951n1(Intent intent, RecyclerView recyclerView, BaseFeedLoader<C0740i2> baseFeedLoader, boolean z, C32226l<? super C0740i2, Boolean> lVar) {
        Intent intent2 = intent;
        BaseFeedLoader<C0740i2> baseFeedLoader2 = baseFeedLoader;
        C87412m.m108594g(intent2, "data");
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(baseFeedLoader2, "feedLoader");
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        baseFeedLoader2.initBackCache(intent2);
        C2819w0 backCache = baseFeedLoader.getBackCache();
        if (!(adapter instanceof WxRecyclerAdapter) || backCache == null || Util.isNullOrNil((List) backCache.f14079a) || backCache.f14080b == null) {
            return null;
        }
        WxRecyclerAdapter wxRecyclerAdapter = (WxRecyclerAdapter) adapter;
        int c6 = wxRecyclerAdapter.mo85796c6();
        DataBuffer<C0740i2> dataList = baseFeedLoader.getDataList();
        List<C0740i2> P = mo83893P(dataList, 0, lVar);
        if (P.size() != backCache.f14079a.size()) {
            for (C0740i2 remove : P) {
                dataList.remove(remove);
            }
            dataList.addAll(backCache.f14079a);
            if (z) {
                baseFeedLoader2.setLastBuffer(backCache.f14080b);
            }
            wxRecyclerAdapter.notifyDataSetChanged();
        }
        int i = backCache.f14081c;
        if (i >= 0) {
            int m0 = mo83948m0(mo83901T(i, backCache.f14079a), dataList);
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(Integer.valueOf(m0 + c6));
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = staggeredGridLayoutManager;
                C117292a.m165358d(staggeredGridLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/FinderUtil", "mergeBackCacheAndNotify", "(Landroid/content/Intent;Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;ZLkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/feed/model/LoaderCache;", "Undefined", "scrollToPositionWithOffset", "(II)V");
                staggeredGridLayoutManager.mo17414U(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(staggeredGridLayoutManager2, "com/tencent/mm/plugin/finder/utils/FinderUtil", "mergeBackCacheAndNotify", "(Landroid/content/Intent;Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;ZLkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/feed/model/LoaderCache;", "Undefined", "scrollToPositionWithOffset", "(II)V");
            } else if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                aVar2.mo10233c(Integer.valueOf(m0 + c6));
                LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                C117292a.m165358d(linearLayoutManager2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/utils/FinderUtil", "mergeBackCacheAndNotify", "(Landroid/content/Intent;Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;ZLkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/feed/model/LoaderCache;", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.mo16973V(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
                C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/finder/utils/FinderUtil", "mergeBackCacheAndNotify", "(Landroid/content/Intent;Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;ZLkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/feed/model/LoaderCache;", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }
        String str = f168296b;
        Log.m105924i(str, "mergeBackCacheAndNotify, pos:" + backCache.f14081c + ", headCount:" + c6);
        return backCache;
    }

    /* renamed from: o */
    public final void mo83952o() {
        if (f168308n) {
            C37521f fVar = C37521f.f99374d;
            fVar.getClass();
            f168309o = C37521f.f99405g4.mo60266n().intValue();
            fVar.getClass();
            f168310p = C37521f.f99414h4.mo60266n().intValue();
            f168308n = false;
            String str = f168296b;
            Log.m105924i(str, "[checkResetFullScreenConfig] reset config DISABLE_HALF_SCREEN=" + f168309o + " ALLOW_FILLING_FULL_SCREEN_VALUE=" + f168310p);
        }
    }

    /* renamed from: o0 */
    public final float mo83953o0(int i) {
        float p = C76577a.m92165p(MMApplicationContext.getContext());
        if (MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("screenResolution_isModifyDensity", true) && (C85875k4.m106153J(p, 1.1f) || C85875k4.m106153J(p, 0.8f))) {
            p = 1.0f;
        }
        return ((float) MMApplicationContext.getResources().getDimensionPixelSize(i)) * p;
    }

    /* renamed from: p */
    public final boolean mo83954p(Context context, int i, int i2, String str) {
        C87412m.m108594g(context, "context");
        String str2 = f168296b;
        Log.m105920e(str2, "checkShowCgiErrorAlter: errType = " + i + ", errCode = " + i2 + ", errMsg = " + str);
        if (!(i == 0 && i2 == 0)) {
            if (!(str == null || str.length() == 0)) {
                C77389a aVar = new C77389a();
                aVar.f225660q = str;
                aVar.f225668y = true;
                aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.a18);
                C77398g gVar = new C77398g(context, C0966R.style.a66);
                gVar.mo107525e(aVar);
                gVar.show();
                return true;
            }
        }
        return false;
    }

    /* renamed from: p0 */
    public final String mo83955p0(int i) {
        return C58739j4.f168176a.mo83676D(i);
    }

    /* renamed from: q0 */
    public final String mo83956q0(int i) {
        if (i != 2) {
            return C66785b.f191882e.mo90662O5();
        }
        String s = C75592q0.m90789s();
        C87412m.m108593f(s, "{\n            ConfigStor…eFromUserInfo()\n        }");
        return s;
    }

    /* renamed from: q1 */
    public final CharSequence mo83957q1(Context context, CharSequence charSequence, char c, int i, int i2, int i3, int i4) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(charSequence, "str");
        SpannableString spannableString = new SpannableString(charSequence);
        int D = C112550d0.m153768D(charSequence, c, 0, false, 6, (Object) null);
        int color = context.getResources().getColor(i2);
        if (D >= 0) {
            Drawable e = C74933u4.m89768e(context, i, color);
            e.setBounds(0, 0, i3, i4);
            spannableString.setSpan(new C76003c(e, 1), D, D + 1, 33);
        }
        return spannableString;
    }

    /* renamed from: r */
    public final void mo83958r() {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, "");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_STRING_SYNC, "");
        C66785b bVar = C66785b.f191882e;
        C54447c cVar = new C54447c(bVar.mo90662O5());
        cVar.field_messageLikeBuf = null;
        cVar.field_messageCommentBuf = null;
        cVar.field_messageFollowBuf = null;
        bVar.mo90672m1(cVar, C39759i.FINDER_CONFIG);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_LIKE_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_COMMENT_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_FOLLOW_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
    }

    /* renamed from: r0 */
    public final int mo83959r0(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 11) {
            return 5;
        }
        if (i == 18) {
            return 15;
        }
        switch (i) {
            case 14:
                return 6;
            case 15:
                return 7;
            case 16:
                return 9;
            default:
                return -1;
        }
    }

    /* renamed from: r1 */
    public final CharSequence mo83960r1(Context context, CharSequence charSequence, char c, Drawable drawable, int i, int i2, int i3) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(charSequence, "str");
        C87412m.m108594g(drawable, "drawable");
        SpannableString spannableString = new SpannableString(charSequence);
        int D = C112550d0.m153768D(charSequence, c, 0, false, 6, (Object) null);
        int color = context.getResources().getColor(i);
        if (D >= 0) {
            C74933u4.m89769f(drawable, color);
            drawable.setBounds(0, 0, i2, i2);
            spannableString.setSpan(new C76003c(drawable, 1), D, D + 1, 33);
        }
        return spannableString;
    }

    /* renamed from: s */
    public final void mo83961s() {
        Class cls = C60200t1.class;
        C60152b4 Nt0 = ((C60200t1) C86312j.m106911c(cls)).Nt0();
        if (Nt0.mo77246R5("finder_private_msg_entrance") != null) {
            C60152b4.C8759a.m8562b(((C60200t1) C86312j.m106911c(cls)).Nt0(), 1006, (String) null, 2, (Object) null);
        }
        if (Nt0.mo77246R5("AuthorProfileNotify") != null) {
            C60152b4.C8759a.m8562b(((C60200t1) C86312j.m106911c(cls)).Nt0(), 2, (String) null, 2, (Object) null);
        }
    }

    /* renamed from: s0 */
    public final String mo83962s0() {
        String b = C15587j.f42215a.mo14350b("FinderObjectDynamicItemKey_FinderFav");
        if (b != null) {
            return b;
        }
        String string = MMApplicationContext.getContext().getString(C0966R.string.eq5);
        C87412m.m108593f(string, "getContext().getString(R…ng.finder_star_icon_text)");
        return string;
    }

    /* renamed from: s1 */
    public final FinderJumpInfo mo83963s1(String str) {
        C87412m.m108594g(str, "accountJumpInfoStr");
        if (Util.isNullOrNil(str)) {
            return null;
        }
        byte[] decode = Base64.decode(str, 2);
        try {
            FinderJumpInfo create = FinderJumpInfo.create();
            create.parseFrom(decode);
            return create;
        } catch (IOException e) {
            Log.m105921e(f168296b, "parse accountJumpInfo failed: %s", e);
            return null;
        }
    }

    /* renamed from: t */
    public final void mo83964t() {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, "");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
    }

    /* renamed from: t0 */
    public final int mo83965t0() {
        return ((Number) ((C36570n) f168303i).getValue()).intValue();
    }

    /* renamed from: t1 */
    public final void mo83966t1(FinderItem finderItem) {
        C87412m.m108594g(finderItem, LocaleUtil.ITALIAN);
        FinderExposeInfoChangeEvent finderExposeInfoChangeEvent = new FinderExposeInfoChangeEvent();
        FinderExposeInfoChangeEvent.C55124a aVar = finderExposeInfoChangeEvent.f154769d;
        aVar.f154770a = finderItem.field_id;
        aVar.f154772c = finderItem.getCommentCount();
        finderExposeInfoChangeEvent.publish();
    }

    /* renamed from: u */
    public final FinderObject mo83967u(C64682rk1 rk12) {
        C87412m.m108594g(rk12, "shareObj");
        FinderObject finderObject = new FinderObject();
        finderObject.f164794id = Util.getUnsignedLong(rk12.f185183d, 0);
        finderObject.objectNonceId = rk12.f185191o;
        finderObject.username = rk12.f185184e;
        finderObject.nickname = rk12.f185185f;
        finderObject.likeCount = -1;
        finderObject.favCount = -1;
        finderObject.forwardCount = -1;
        finderObject.commentCount = -1;
        FinderObjectDesc finderObjectDesc = new FinderObjectDesc();
        finderObjectDesc.description = rk12.f185187h;
        finderObjectDesc.mediaType = rk12.f185188i;
        LinkedList<C64628pk1> linkedList = rk12.f185190n;
        C87412m.m108593f(linkedList, "shareObj.mediaList");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C64628pk1 pk12 : linkedList) {
            FinderMedia finderMedia = new FinderMedia();
            finderMedia.mediaType = pk12.f184826d;
            finderMedia.url = pk12.f184827e;
            finderMedia.coverUrl = pk12.f184834o;
            finderMedia.thumbUrl = pk12.f184828f;
            finderMedia.full_thumb_url = pk12.f184832j;
            finderMedia.width = pk12.f184829g;
            finderMedia.height = pk12.f184830h;
            finderMedia.videoDuration = pk12.f184831i;
            arrayList.add(finderMedia);
        }
        finderObjectDesc.media = new LinkedList<>(arrayList);
        finderObject.objectDesc = finderObjectDesc;
        if (!Util.isNullOrNil(rk12.f185181D)) {
            C50124kf1 kf12 = new C50124kf1();
            C51384te1 te12 = new C51384te1();
            C58784w3 w3Var = f168295a;
            String str = rk12.f185181D;
            C87412m.m108591d(str);
            te12.f142162j = w3Var.mo83963s1(str);
            kf12.f136749h = te12;
            finderObject.object_extend = kf12;
        }
        FinderContact finderContact = new FinderContact();
        finderContact.headUrl = rk12.f185186g;
        finderContact.nickname = rk12.f185185f;
        finderContact.username = rk12.f185184e;
        FinderAuthInfo finderAuthInfo = new FinderAuthInfo();
        finderAuthInfo.authIconType = rk12.f185196t;
        finderAuthInfo.authIconUrl = rk12.f185197u;
        finderContact.authInfo = finderAuthInfo;
        if (!Util.isNullOrNil(rk12.f185199w) && !Util.isNullOrNil(rk12.f185198v)) {
            LinkedList<C50955qg0> linkedList2 = new LinkedList<>();
            finderContact.bind_info = linkedList2;
            C50955qg0 qg02 = new C50955qg0();
            qg02.f140290d = 1;
            C51691vg0 vg02 = new C51691vg0();
            LinkedList<C64284cg> linkedList3 = new LinkedList<>();
            vg02.f143474d = linkedList3;
            C64284cg cgVar = new C64284cg();
            cgVar.f182469e = rk12.f185198v;
            cgVar.f182468d = rk12.f185195s;
            cgVar.f182470f = rk12.f185199w;
            C64709se seVar = new C64709se();
            seVar.f185417d = rk12.f185201y;
            seVar.f185418e = rk12.f185202z;
            cgVar.f182473i = seVar;
            linkedList3.add(cgVar);
            qg02.f140291e = vg02;
            linkedList2.add(qg02);
        }
        finderObject.contact = finderContact;
        return finderObject;
    }

    /* renamed from: u0 */
    public final List<BaseFinderFeed> mo83968u0(List<? extends BaseFinderFeed> list, int i) {
        C87412m.m108594g(list, "cacheDataList");
        ArrayList arrayList = new ArrayList();
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11749q.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…reamUnreadVM::class.java)");
        C11749q qVar = (C11749q) a;
        int i2 = 0;
        for (T next : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) next;
                if (i2 >= 2) {
                    if (C65834e.f189316a.mo89873g(i, baseFinderFeed.mo3513o().field_id)) {
                        break;
                    } else if (baseFinderFeed.mo3513o().field_id != 0 && !qVar.mo11614e3(i, baseFinderFeed.mo3513o().field_id)) {
                        arrayList.add(baseFinderFeed);
                    }
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return arrayList;
    }

    /* renamed from: u1 */
    public final void mo83969u1(LinkedList<FinderCommentInfo> linkedList, long j, long j2, String str) {
        C87412m.m108594g(linkedList, "commentList");
        C87412m.m108594g(str, ClientInfoTable.Columns.CLIENTID);
        int i = -1;
        int i2 = 0;
        if (j2 != 0) {
            Iterator<FinderCommentInfo> it = linkedList.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().commentId == j2) {
                    i = i3;
                    break;
                }
                i3++;
            }
        } else {
            Iterator<FinderCommentInfo> it4 = linkedList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                } else if (C87412m.m108589b(it4.next().client_id, str)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (i >= 0) {
            linkedList.remove(i);
            String str2 = f168296b;
            Log.m105924i(str2, "update expose commentList, remove at " + i);
            FinderExposeInfoChangeEvent finderExposeInfoChangeEvent = new FinderExposeInfoChangeEvent();
            FinderExposeInfoChangeEvent.C55124a aVar = finderExposeInfoChangeEvent.f154769d;
            aVar.f154770a = j;
            C49417ff1 ff12 = new C49417ff1();
            ff12.f133475d = linkedList;
            aVar.f154771b = ff12;
            finderExposeInfoChangeEvent.publish();
        }
    }

    /* renamed from: v */
    public final Intent mo83970v(BaseFinderFeedLoader baseFinderFeedLoader, LinearLayoutManager linearLayoutManager) {
        C87412m.m108594g(baseFinderFeedLoader, "feedLoader");
        C87412m.m108594g(linearLayoutManager, "layoutManager");
        Intent intent = new Intent();
        DataBuffer dataListJustForAdapter = baseFinderFeedLoader.getDataListJustForAdapter();
        C89349b lastBuffer = baseFinderFeedLoader.getLastBuffer();
        int initPos = baseFinderFeedLoader.getInitPos();
        int C = linearLayoutManager.mo16957C();
        int E = linearLayoutManager.mo16959E();
        String str = f168296b;
        Log.m105924i(str, "fixRVPos posStart:" + C + ", posEnd " + E + ", initPos:" + initPos);
        BaseFeedLoader.saveCacheToIntent$default(baseFinderFeedLoader, intent, dataListJustForAdapter, lastBuffer, (initPos < C || initPos > E) ? C : -1, (C2780c) null, 16, (Object) null);
        return intent;
    }

    /* renamed from: v0 */
    public final C94554a mo83971v0(String str) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C94554a e302 = ((C97560f) C86312j.m106911c(C97560f.class)).e30(str, true);
        if (e302 == null) {
            e302 = new C94554a();
        }
        if (e302.f273446d <= 0 || e302.f273445c <= 0) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(C86013q1.m106448i(str, false));
                e302.f273445c = Util.getInt(mediaMetadataRetriever.extractMetadata(18), 0);
                e302.f273446d = Util.getInt(mediaMetadataRetriever.extractMetadata(19), 0);
                e302.f273444b = Util.getInt(mediaMetadataRetriever.extractMetadata(20), 0);
                e302.f273443a = Util.getInt(mediaMetadataRetriever.extractMetadata(9), 0);
                mediaMetadataRetriever.release();
            } catch (Exception unused) {
            }
        }
        int mp4RotateVFS = ((ISightJNIService) C86312j.m106911c(ISightJNIService.class)).getMp4RotateVFS(str);
        Log.m105925i(f168296b, "width %d, height %d, rotate %d", Integer.valueOf(e302.f273445c), Integer.valueOf(e302.f273446d), Integer.valueOf(mp4RotateVFS));
        if (mp4RotateVFS == 90 || mp4RotateVFS == 270) {
            int i = e302.f273446d;
            e302.f273446d = e302.f273445c;
            e302.f273445c = i;
        }
        return e302;
    }

    /* renamed from: v1 */
    public final void mo83972v1(List<? extends FinderItem> list, String str) {
        C87412m.m108594g(list, "list");
        C87412m.m108594g(str, "tag");
        String str2 = f168296b;
        Log.m105926v(str2, "---------------------------------------------------------------------printAllItemStart " + str + " count " + list.size() + "---------------------------------------------------------------------");
        int i = 0;
        for (FinderItem finderItem : list) {
            Integer valueOf = Integer.valueOf(finderItem.getCreateTime());
            String str3 = f168296b;
            StringBuilder sb = new StringBuilder();
            sb.append('#');
            sb.append(i);
            sb.append(" print item id:");
            sb.append(finderItem.getId());
            sb.append(" rowid:");
            sb.append(finderItem.getLocalId());
            sb.append(" time: ");
            sb.append(valueOf);
            sb.append(" sourceFlag:");
            sb.append(finderItem.field_sourceFlag);
            sb.append(" username:");
            FinderObject finderObject = finderItem.getFinderObject();
            sb.append(finderObject != null ? finderObject.username : null);
            Log.m105924i(str3, sb.toString());
            i++;
        }
        String str4 = f168296b;
        Log.m105926v(str4, "---------------------------------------------------------------------printAllItemEnd " + str + "---------------------------------------------------------------------");
    }

    /* renamed from: w */
    public final C98127h mo83973w(String str, String str2, String str3, int i, String str4, String str5, String str6, boolean z, C98127h.C98128a aVar, int i2, String str7) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "url");
        C87412m.m108594g(str3, "path");
        C87412m.m108594g(str4, "fileFormat");
        C87412m.m108594g(str5, "urlToken");
        C87412m.m108594g(aVar, "videoCallback");
        C87412m.m108594g(str7, "tag");
        boolean Y = C37521f.f99374d.mo61171Y();
        C98127h hVar = new C98127h();
        hVar.f287660d = "task_FinderUtil";
        hVar.field_mediaId = str;
        hVar.f287705p0 = str2 + str5;
        hVar.f287673t = 60;
        hVar.f287674u = 60;
        hVar.f287689V = 1;
        hVar.f287655L = 8;
        hVar.f287698Z0 = 0;
        if (!Y) {
            hVar.field_requestVideoFormat = i <= 0 ? ((C36594q) C86312j.m106911c(C36594q.class)).mo60729EJ(1, str3) : i;
        } else {
            hVar.field_requestVideoFormat = i;
            hVar.f287699a1 = str4;
        }
        hVar.field_fullpath = str3;
        hVar.f287696Y0 = C60184m.C60185a.f171718a;
        hVar.f287657N = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0().f154553h;
        hVar.f287700b1 = str6;
        hVar.f287665i = z;
        hVar.f287704f1 = aVar;
        hVar.f287688U0 = String.valueOf(i2);
        Log.m105924i(str7, "[loadByCdn] finder video, isHot=" + z + " reqFormat=" + i + " fileFormat=" + str4 + ",isOpenMultiBitRateDownload=" + Y + ", decodeKey=" + str6 + ' ' + str5 + " mediaId=" + str + " url=" + hVar.f287705p0 + ' ');
        return hVar;
    }

    /* renamed from: w0 */
    public final C13604l<Integer, Integer> mo83974w0(RecyclerView recyclerView, boolean z) {
        int i;
        int i2;
        View childAt;
        C87412m.m108594g(recyclerView, "recyclerView");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            Integer Q = C110823p.m150991Q(staggeredGridLayoutManager.mo17394A((int[]) null));
            i = Q != null ? Q.intValue() : 0;
            Integer P = C110823p.m150990P(staggeredGridLayoutManager.mo17395B((int[]) null));
            i2 = P != null ? P.intValue() : 0;
        } else if (!(layoutManager instanceof LinearLayoutManager)) {
            return new C13604l<>(-1, -1);
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i = linearLayoutManager.mo16957C();
            i2 = linearLayoutManager.mo16959E();
        }
        int D = mo83862D(recyclerView, z, i, 1);
        int D2 = mo83862D(recyclerView, z, i2, -1);
        Rect rect = new Rect();
        if (i <= i2) {
            int i3 = i;
            while (true) {
                RecyclerView.C16631z I0 = recyclerView.mo17023I0(i3);
                C60905o oVar = I0 instanceof C60905o ? (C60905o) I0 : null;
                if (!(oVar == null || (childAt = layoutManager.getChildAt(i3)) == null)) {
                    boolean z2 = childAt.isShown() && childAt.getAlpha() > 0.0f && childAt.getGlobalVisibleRect(rect);
                    if (!(oVar.f173503E instanceof BaseFinderFeed) || !z2) {
                        if (i3 == i) {
                            D++;
                        } else {
                            D2--;
                        }
                    }
                }
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return new C13604l<>(Integer.valueOf(D), Integer.valueOf(D2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (gy3.C87412m.m108589b(r3, r9.f183216g) == false) goto L_0x0096;
     */
    /* renamed from: w1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83975w1(te3.C64373fs0 r9, java.lang.Boolean r10, java.lang.String r11) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "aliasInfo"
            gy3.C87412m.m108594g(r9, r1)
            java.lang.String r1 = "source"
            gy3.C87412m.m108594g(r11, r1)
            r1 = 0
            r2 = 1
            f40.o r3 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0121 }
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()     // Catch:{ Exception -> 0x0121 }
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MY_FINDER_ALIAS_MSG_USERNAME_STRING_SYNC     // Catch:{ Exception -> 0x0121 }
            java.lang.String r3 = r3.mo119675I(r4, r0)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r5 = f168296b     // Catch:{ Exception -> 0x0121 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0121 }
            r6.<init>()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r7 = "[processFinderAliasSync] source:"
            r6.append(r7)     // Catch:{ Exception -> 0x0121 }
            r6.append(r11)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r11 = ", status:"
            r6.append(r11)     // Catch:{ Exception -> 0x0121 }
            int r11 = r9.f183218i     // Catch:{ Exception -> 0x0121 }
            r6.append(r11)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r11 = " , userName:"
            r6.append(r11)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r11 = r9.f183216g     // Catch:{ Exception -> 0x0121 }
            r6.append(r11)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r11 = " , avatar:"
            r6.append(r11)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r11 = r9.f183214e     // Catch:{ Exception -> 0x0121 }
            r6.append(r11)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r11 = " , currentAliasUserName:"
            r6.append(r11)     // Catch:{ Exception -> 0x0121 }
            r6.append(r3)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r11 = r6.toString()     // Catch:{ Exception -> 0x0121 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)     // Catch:{ Exception -> 0x0121 }
            int r11 = r9.f183218i     // Catch:{ Exception -> 0x0121 }
            if (r11 == 0) goto L_0x006f
            if (r11 == r2) goto L_0x006f
            r9 = 2
            if (r11 == r9) goto L_0x0067
            r9 = 3
            if (r11 == r9) goto L_0x0067
            goto L_0x012b
        L_0x0067:
            java.lang.String r9 = "processFinderAliasSync"
            r10 = 0
            r8.mo83976x(r9, r10)     // Catch:{ Exception -> 0x0121 }
            goto L_0x012b
        L_0x006f:
            java.lang.String r11 = r9.f183216g     // Catch:{ Exception -> 0x0121 }
            if (r11 == 0) goto L_0x00b5
            int r11 = r11.length()     // Catch:{ Exception -> 0x0121 }
            if (r11 != 0) goto L_0x007b
            r11 = 1
            goto L_0x007c
        L_0x007b:
            r11 = 0
        L_0x007c:
            if (r11 != 0) goto L_0x0096
            java.lang.String r11 = "currentAliasUserName"
            gy3.C87412m.m108593f(r3, r11)     // Catch:{ Exception -> 0x0121 }
            int r11 = r3.length()     // Catch:{ Exception -> 0x0121 }
            if (r11 <= 0) goto L_0x008b
            r11 = 1
            goto L_0x008c
        L_0x008b:
            r11 = 0
        L_0x008c:
            if (r11 == 0) goto L_0x00b5
            java.lang.String r11 = r9.f183216g     // Catch:{ Exception -> 0x0121 }
            boolean r11 = gy3.C87412m.m108589b(r3, r11)     // Catch:{ Exception -> 0x0121 }
            if (r11 != 0) goto L_0x00b5
        L_0x0096:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0121 }
            r10.<init>()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r11 = "processFinderAliasSync ask to change alias info,but alias_msg_name is not legal, alias_msg_name:"
            r10.append(r11)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r9 = r9.f183216g     // Catch:{ Exception -> 0x0121 }
            r10.append(r9)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r9 = ",currentAlias:"
            r10.append(r9)     // Catch:{ Exception -> 0x0121 }
            r10.append(r3)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r9 = r10.toString()     // Catch:{ Exception -> 0x0121 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)     // Catch:{ Exception -> 0x0121 }
            return
        L_0x00b5:
            fe1.q r11 = new fe1.q     // Catch:{ Exception -> 0x0121 }
            r11.<init>()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r3 = r9.f183213d     // Catch:{ Exception -> 0x0121 }
            if (r3 != 0) goto L_0x00bf
            r3 = r0
        L_0x00bf:
            r11.field_nickname = r3     // Catch:{ Exception -> 0x0121 }
            java.lang.String r3 = r9.f183214e     // Catch:{ Exception -> 0x0121 }
            if (r3 != 0) goto L_0x00c6
            r3 = r0
        L_0x00c6:
            r11.field_avatarUrl = r3     // Catch:{ Exception -> 0x0121 }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0121 }
            boolean r5 = gy3.C87412m.m108589b(r10, r3)     // Catch:{ Exception -> 0x0121 }
            if (r5 == 0) goto L_0x00d7
            java.lang.String r5 = r9.f183216g     // Catch:{ Exception -> 0x0121 }
            if (r5 != 0) goto L_0x00d5
            r5 = r0
        L_0x00d5:
            r11.field_username = r5     // Catch:{ Exception -> 0x0121 }
        L_0x00d7:
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r5 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ Exception -> 0x0121 }
            com.tencent.mm.plugin.FinderCommonFeatureService r5 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r5     // Catch:{ Exception -> 0x0121 }
            up1.c0 r5 = r5.Jx0()     // Catch:{ Exception -> 0x0121 }
            r5.mo85198S1(r11, r2)     // Catch:{ Exception -> 0x0121 }
            f40.o r11 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0121 }
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()     // Catch:{ Exception -> 0x0121 }
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MY_FINDER_ALIAS_NICKNAME_STRING_SYNC     // Catch:{ Exception -> 0x0121 }
            java.lang.String r6 = r9.f183213d     // Catch:{ Exception -> 0x0121 }
            if (r6 != 0) goto L_0x00f5
            r6 = r0
        L_0x00f5:
            r11.mo119677K(r5, r6)     // Catch:{ Exception -> 0x0121 }
            f40.o r11 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0121 }
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()     // Catch:{ Exception -> 0x0121 }
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MY_FINDER_ALIAS_AVATAR_URL_STRING_SYNC     // Catch:{ Exception -> 0x0121 }
            java.lang.String r6 = r9.f183214e     // Catch:{ Exception -> 0x0121 }
            if (r6 != 0) goto L_0x0107
            r6 = r0
        L_0x0107:
            r11.mo119677K(r5, r6)     // Catch:{ Exception -> 0x0121 }
            boolean r10 = gy3.C87412m.m108589b(r10, r3)     // Catch:{ Exception -> 0x0121 }
            if (r10 == 0) goto L_0x012b
            f40.o r10 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0121 }
            com.tencent.mm.storage.v1 r10 = r10.mo121142i()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r9 = r9.f183216g     // Catch:{ Exception -> 0x0121 }
            if (r9 != 0) goto L_0x011d
            r9 = r0
        L_0x011d:
            r10.mo119677K(r4, r9)     // Catch:{ Exception -> 0x0121 }
            goto L_0x012b
        L_0x0121:
            r9 = move-exception
            java.lang.String r10 = f168296b
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r1] = r9
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r10, r0, r11)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58784w3.mo83975w1(te3.fs0, java.lang.Boolean, java.lang.String):void");
    }

    /* renamed from: x */
    public final void mo83976x(String str, C28617v1 v1Var) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        ((C119157j) C119157j.f356862d).mo183884o(new C58785e(v1Var, str));
    }

    /* renamed from: x0 */
    public final int mo83977x0() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_ring_tone_show_count, 0);
    }

    /* renamed from: x1 */
    public final String mo83978x1(String str, String str2) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, "name");
        String str3 = "&?" + str2 + "=[^&]*";
        C87412m.m108594g(str3, "pattern");
        Pattern compile = Pattern.compile(str3);
        C87412m.m108593f(compile, "compile(pattern)");
        String replaceAll = compile.matcher(str).replaceAll("");
        C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    /* renamed from: y */
    public final boolean mo83979y(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        return (finderObject.permissionFlag & 524288) > 0;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [te3.ve1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cb A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83980y0(com.tencent.p014mm.plugin.finder.storage.FinderItem r6) {
        /*
            r5 = this;
            java.lang.String r0 = "feed"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.Class<ht1.v4> r0 = ht1.C8808v4.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.v4 r0 = (ht1.C8808v4) r0
            boolean r0 = r0.mo9635e()
            r1 = 0
            if (r0 == 0) goto L_0x0015
            return r1
        L_0x0015:
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r6.getFinderObject()
            java.lang.String r2 = "finderObject"
            gy3.C87412m.m108594g(r0, r2)
            int r0 = r0.permissionFlag
            r0 = r0 & 8
            r2 = 1
            if (r0 != 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 != 0) goto L_0x002b
            return r1
        L_0x002b:
            boolean r0 = r6.isLongVideo()
            if (r0 == 0) goto L_0x0032
            return r2
        L_0x0032:
            zc1.b r0 = zc1.C66785b.f191882e
            bd1.e r0 = r0.mo90673n0()
            te3.qq2 r0 = r0.mo62397b()
            te3.oi1 r0 = r0.f140461E
            if (r0 == 0) goto L_0x0046
            int r0 = r0.f139196d
            if (r0 != r2) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r0 == 0) goto L_0x004a
            return r1
        L_0x004a:
            int r0 = r6.getMediaType()
            r3 = 2
            r4 = 0
            if (r0 != r3) goto L_0x00a3
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r6.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x005d
            te3.ve1 r0 = r0.feedBgmInfo
            goto L_0x005e
        L_0x005d:
            r0 = r4
        L_0x005e:
            if (r0 == 0) goto L_0x00cc
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r6.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0072
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x0072
            int r0 = r0.f185875f
            if (r0 != 0) goto L_0x0072
            r0 = 1
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            if (r0 != 0) goto L_0x00cc
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r6.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0083
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x0083
            java.lang.String r4 = r0.f185874e
        L_0x0083:
            if (r4 == 0) goto L_0x008e
            int r0 = r4.length()
            if (r0 != 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r0 = 0
            goto L_0x008f
        L_0x008e:
            r0 = 1
        L_0x008f:
            if (r0 == 0) goto L_0x0092
            goto L_0x00cc
        L_0x0092:
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
            if (r6 == 0) goto L_0x00cc
            te3.ve1 r6 = r6.feedBgmInfo
            if (r6 == 0) goto L_0x00cc
            te3.td1 r6 = r6.f185873d
            if (r6 == 0) goto L_0x00cc
            goto L_0x00cb
        L_0x00a3:
            int r0 = r6.getMediaType()
            r3 = 4
            if (r0 != r3) goto L_0x00cc
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r6.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x00b4
            te3.ve1 r4 = r0.feedBgmInfo
        L_0x00b4:
            if (r4 == 0) goto L_0x00cb
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
            if (r6 == 0) goto L_0x00c8
            te3.ve1 r6 = r6.feedBgmInfo
            if (r6 == 0) goto L_0x00c8
            int r6 = r6.f185875f
            if (r6 != r2) goto L_0x00c8
            r6 = 1
            goto L_0x00c9
        L_0x00c8:
            r6 = 0
        L_0x00c9:
            if (r6 == 0) goto L_0x00cc
        L_0x00cb:
            r1 = 1
        L_0x00cc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58784w3.mo83980y0(com.tencent.mm.plugin.finder.storage.FinderItem):boolean");
    }

    /* renamed from: y1 */
    public final int mo83981y1(int i) {
        return i % 2 != 0 ? i - 1 : i;
    }

    /* renamed from: z */
    public final boolean mo83982z(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        return (finderObject.permissionFlag & 65536) > 0;
    }

    /* renamed from: z0 */
    public final boolean mo83983z0() {
        return C58739j4.f168176a.mo83679H();
    }

    /* renamed from: z1 */
    public final String mo83984z1(String str) {
        String mD5String = str != null ? MD5Util.getMD5String(str) : null;
        return mD5String == null ? "" : mD5String;
    }

    /* renamed from: er1.w3$b */
    public static final class C7913b {

        /* renamed from: a */
        public C0740i2 f26592a;

        /* renamed from: b */
        public C60905o f26593b;

        /* renamed from: c */
        public final LinkedList<C7913b> f26594c;

        public C7913b() {
            this((C0740i2) null, (C60905o) null, 3, (C8480h) null);
        }

        public C7913b(C0740i2 i2Var, C60905o oVar) {
            this.f26592a = i2Var;
            this.f26593b = oVar;
            this.f26594c = new LinkedList<>();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7913b)) {
                return false;
            }
            C7913b bVar = (C7913b) obj;
            return C87412m.m108589b(this.f26592a, bVar.f26592a) && C87412m.m108589b(this.f26593b, bVar.f26593b);
        }

        public int hashCode() {
            C0740i2 i2Var = this.f26592a;
            int i = 0;
            int hashCode = (i2Var == null ? 0 : i2Var.hashCode()) * 31;
            C60905o oVar = this.f26593b;
            if (oVar != null) {
                i = oVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("VisibilityFeed:");
            int i = 0;
            for (T next : this.f26594c) {
                int i2 = i + 1;
                Integer num = null;
                if (i >= 0) {
                    sb.append("[index:" + i);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("type:");
                    C0740i2 i2Var = ((C7913b) next).f26592a;
                    if (i2Var != null) {
                        num = Integer.valueOf(i2Var.mo75c());
                    }
                    sb4.append(num);
                    sb4.append(']');
                    sb.append(sb4.toString());
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            String sb5 = sb.toString();
            C87412m.m108593f(sb5, "sb.toString()");
            return sb5;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C7913b(C0740i2 i2Var, C60905o oVar, int i, C8480h hVar) {
            this((i & 1) != 0 ? null : i2Var, (i & 2) != 0 ? null : oVar);
        }
    }
}
