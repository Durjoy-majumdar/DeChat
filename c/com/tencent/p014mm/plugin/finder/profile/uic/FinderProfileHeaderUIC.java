package com.tencent.p014mm.plugin.finder.profile.uic;

import a14.C0000n0;
import a14.C53934p0;
import ak1.C0077k0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import bd1.C0264h;
import bd1.C39759i;
import bd1.C54446b;
import bd1.C54447c;
import bl3.C0317e;
import bl3.C39818r;
import c30.C104289g;
import cm1.C0751m0;
import com.google.android.gms.common.Scopes;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FollowUserEvent;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader;
import com.tencent.p014mm.plugin.finder.profile.FinderProfileFeedFragment;
import com.tencent.p014mm.plugin.finder.profile.FinderProfilePoiDrawer;
import com.tencent.p014mm.plugin.finder.service.C3601l1;
import com.tencent.p014mm.plugin.finder.service.C3605p1;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.plugin.finder.view.CollapsibleTextView;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderUserPageResponse;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawer;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7435f2;
import eb0.C31543z5;
import er1.C58684b;
import er1.C58739j4;
import er1.C58741j5;
import er1.C7802g1;
import f40.C86709a0;
import fe1.C45770k;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hi3.C87515a;
import ho1.C8626e;
import ht1.C60200t1;
import ht1.C8761d3;
import ht1.C8794p5;
import ht1.C8797q5;
import ht1.C8801r5;
import ht1.C8808v4;
import io1.C9228a;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C60811w;
import je1.C9377s4;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Result;
import kotlin.ResultKt;
import l31.C61212e;
import mo1.C10943a;
import mo1.C10980a1;
import mo1.C10983b1;
import mo1.C10986c1;
import mo1.C10989d1;
import mo1.C10994e1;
import mo1.C10998f1;
import mo1.C11058v0;
import mo1.C11059w;
import mo1.C11061w0;
import mo1.C11071z0;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C89137b0;
import oo1.C11587a;
import oo1.C11601b;
import oo1.C11603c;
import oo1.C11607c0;
import oo1.C11608d;
import oo1.C11614d0;
import oo1.C11625e;
import oo1.C11666l;
import oo1.C11682t;
import oo1.C11684u;
import oo1.C11692x;
import oo1.C11697z;
import org.json.JSONObject;
import p140cw.C7138g;
import p204mr.C61568m;
import p599lr.C61381b;
import p629ny.C76979h;
import p823sg.C101614i;
import p823sg.C90193h;
import pe1.C35464c;
import pe3.C47465a;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qo3.C77407n;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C64197v;
import sx3.C90364q0;
import te3.C49098d51;
import te3.C49236e51;
import te3.C49316ep1;
import te3.C49712hj1;
import te3.C49849ii0;
import te3.C50019jp1;
import te3.C50401mh0;
import te3.C50428mo1;
import te3.C50542nh0;
import te3.C50955qg0;
import te3.C51376tc1;
import te3.C51559uk1;
import te3.C51583uq0;
import te3.C51691vg0;
import te3.C51810wb1;
import te3.C51869ws0;
import te3.C52271zj0;
import te3.C64414h71;
import te3.C64553md1;
import te3.z74;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;
import up1.C27696y;
import up1.C37521f;
import vp1.C14940p;
import vq1.C65861r;
import wx3.C15601d;
import wx3.C66212f;
import xk0.C91263b;
import xx3.C15911a;
import ye1.C15967a;
import ye1.C15970d0;
import ye1.C15972e0;
import ye1.C15983x;
import yx3.C91590f;
import yx3.C91594j;
import z04.C119027c;
import zc1.C66783a;
import zc1.C66785b;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC */
public final class FinderProfileHeaderUIC extends C11059w implements C11385n {

    /* renamed from: h1 */
    public static final C101614i<String, C3463b> f16192h1 = new C101614i<>(100);

    /* renamed from: A */
    public final C13601g f16193A = C36568h.m40985a(new C3490o(this));

    /* renamed from: B */
    public final C13601g f16194B = C36568h.m40985a(new C3476h(this));

    /* renamed from: C */
    public final C13601g f16195C = C36568h.m40985a(new C3478i(this));

    /* renamed from: D */
    public final C13601g f16196D = C36568h.m40985a(new C3480j(this));

    /* renamed from: E */
    public final C13601g f16197E = C36568h.m40985a(new C3474g(this));

    /* renamed from: F */
    public final C13601g f16198F = C36568h.m40985a(new C3481j0(this));

    /* renamed from: G */
    public final C13601g f16199G = C36568h.m40985a(new C3494q(this));

    /* renamed from: H */
    public final C13601g f16200H = C36568h.m40985a(new C3466c(this));

    /* renamed from: I */
    public final C13601g f16201I = C36568h.m40985a(new C3470e(this));

    /* renamed from: J */
    public final C13601g f16202J = C36568h.m40985a(new C3468d(this));

    /* renamed from: K */
    public final C13601g f16203K = C36568h.m40985a(new C3500t(this));

    /* renamed from: L */
    public final C13601g f16204L = C36568h.m40985a(new C3487m0(this));

    /* renamed from: M */
    public final C13601g f16205M = C36568h.m40985a(new C3477h0(this));

    /* renamed from: N */
    public final C13601g f16206N = C36568h.m40985a(new C3503u0(this));

    /* renamed from: P */
    public final C13601g f16207P = C36568h.m40985a(new C3479i0(this));

    /* renamed from: Q */
    public final C13601g f16208Q = C36568h.m40985a(new C3513z0(this));

    /* renamed from: Q0 */
    public C3460a f16209Q0;

    /* renamed from: R */
    public C11608d f16210R;

    /* renamed from: R0 */
    public C3460a f16211R0;

    /* renamed from: S */
    public C11684u f16212S;

    /* renamed from: S0 */
    public String f16213S0 = "";

    /* renamed from: T */
    public C11692x f16214T;

    /* renamed from: T0 */
    public long f16215T0;

    /* renamed from: U */
    public C11587a f16216U;

    /* renamed from: U0 */
    public C77407n f16217U0;

    /* renamed from: V */
    public C11625e f16218V;

    /* renamed from: V0 */
    public final C13601g f16219V0 = C36568h.m40985a(new C3484l(this));

    /* renamed from: W */
    public C11614d0 f16220W;

    /* renamed from: W0 */
    public final boolean f16221W0 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();

    /* renamed from: X */
    public C11697z f16222X;

    /* renamed from: X0 */
    public final C9228a f16223X0;

    /* renamed from: Y */
    public C11603c f16224Y;

    /* renamed from: Y0 */
    public IListener<FollowUserEvent> f16225Y0;

    /* renamed from: Z */
    public C8626e f16226Z;

    /* renamed from: Z0 */
    public final C13601g f16227Z0;

    /* renamed from: a1 */
    public boolean f16228a1;

    /* renamed from: b1 */
    public boolean f16229b1;

    /* renamed from: c1 */
    public boolean f16230c1;

    /* renamed from: d1 */
    public String f16231d1;

    /* renamed from: e */
    public final C13601g f16232e = C36568h.m40985a(new C3472f(this));

    /* renamed from: e1 */
    public final int f16233e1;

    /* renamed from: f */
    public final C13601g f16234f = C36568h.m40985a(new C3507w0(this));

    /* renamed from: f1 */
    public final C3486m f16235f1;

    /* renamed from: g */
    public final C13601g f16236g = C36568h.m40985a(new C3505v0(this));

    /* renamed from: g1 */
    public C8794p5<C51376tc1> f16237g1;

    /* renamed from: h */
    public View f16238h = C85868k2.m106137b(getActivity()).inflate(C0966R.C0971layout.aoh, (ViewGroup) null);

    /* renamed from: i */
    public final C13601g f16239i = C36568h.m40985a(new C3469d0(this));

    /* renamed from: j */
    public final C13601g f16240j = C36568h.m40985a(new C3467c0(this));

    /* renamed from: n */
    public final C13601g f16241n = C36568h.m40985a(new C3502u(this));

    /* renamed from: o */
    public final C13601g f16242o = C36568h.m40985a(new C3471e0(this));

    /* renamed from: p */
    public final C13601g f16243p = C36568h.m40985a(new C3485l0(this));

    /* renamed from: p0 */
    public final C13601g f16244p0 = C36568h.m40985a(new C3473f0(this));

    /* renamed from: q */
    public final C13601g f16245q = C36568h.m40985a(new C3483k0(this));

    /* renamed from: r */
    public final C13601g f16246r = C36568h.m40985a(new C3482k(this));

    /* renamed from: s */
    public final C13601g f16247s = C36568h.m40985a(new C3462a1(this));

    /* renamed from: t */
    public final C13601g f16248t = C36568h.m40985a(new C3465b1(this));

    /* renamed from: u */
    public final C13601g f16249u = C36568h.m40985a(new C3506w(this));

    /* renamed from: v */
    public final C13601g f16250v = C36568h.m40985a(new C3508x(this));

    /* renamed from: w */
    public final C13601g f16251w = C36568h.m40985a(new C3496r(this));

    /* renamed from: x */
    public final C13601g f16252x = C36568h.m40985a(new C3475g0(this));

    /* renamed from: x0 */
    public boolean f16253x0;

    /* renamed from: y */
    public final C13601g f16254y = C36568h.m40985a(new C3498s(this));

    /* renamed from: y0 */
    public String f16255y0 = "";

    /* renamed from: z */
    public final C13601g f16256z = C36568h.m40985a(new C3488n(this));

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$a */
    public static final class C3460a {

        /* renamed from: a */
        public final String f16257a;

        /* renamed from: b */
        public final SpannableString f16258b;

        /* renamed from: c */
        public final StringBuilder f16259c;

        public C3460a(String str, SpannableString spannableString, StringBuilder sb) {
            C87412m.m108594g(str, "signature");
            C87412m.m108594g(sb, "reportNickName");
            this.f16257a = str;
            this.f16258b = spannableString;
            this.f16259c = sb;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3460a)) {
                return false;
            }
            C3460a aVar = (C3460a) obj;
            return C87412m.m108589b(this.f16257a, aVar.f16257a) && C87412m.m108589b(this.f16258b, aVar.f16258b) && C87412m.m108589b(this.f16259c, aVar.f16259c);
        }

        public int hashCode() {
            int hashCode = this.f16257a.hashCode() * 31;
            SpannableString spannableString = this.f16258b;
            return ((hashCode + (spannableString == null ? 0 : spannableString.hashCode())) * 31) + this.f16259c.hashCode();
        }

        public String toString() {
            return "DescSpanInfo(signature=" + this.f16257a + ", signatureSpan=" + this.f16258b + ", reportNickName=" + this.f16259c + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$a0 */
    public static final class C3461a0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16260d;

        public C3461a0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            this.f16260d = finderProfileHeaderUIC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleNickname$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7435f2 f2Var = C7435f2.f25626a;
            FinderProfileHeaderUIC finderProfileHeaderUIC = this.f16260d;
            C101614i<String, C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
            f2Var.mo8577a(finderProfileHeaderUIC.getContextObj(), "link_halfscreen_profile_avatar_profile", 1, (JSONObject) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleNickname$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$a1 */
    public static final class C3462a1 extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16261d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3462a1(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16261d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16261d.mo3808J3().f42935o0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b */
    public static final class C3463b {

        /* renamed from: a */
        public int f16262a;

        /* renamed from: b */
        public int f16263b;

        /* renamed from: c */
        public LinkedList<String> f16264c;

        /* renamed from: d */
        public C49098d51 f16265d;

        /* renamed from: e */
        public C50019jp1 f16266e;

        /* renamed from: f */
        public C51691vg0 f16267f;

        /* renamed from: g */
        public C52271zj0 f16268g;

        /* renamed from: h */
        public C0264h f16269h;

        /* renamed from: i */
        public C50428mo1 f16270i;

        /* renamed from: j */
        public C49316ep1 f16271j;

        /* renamed from: k */
        public C49236e51 f16272k;

        /* renamed from: l */
        public List<? extends FinderJumpInfo> f16273l;

        /* renamed from: m */
        public C51869ws0 f16274m;

        /* renamed from: n */
        public C51583uq0 f16275n;

        /* renamed from: o */
        public C51810wb1 f16276o;

        /* renamed from: p */
        public C51583uq0 f16277p;

        public C3463b() {
            this(0, 0, (LinkedList) null, (C49098d51) null, (C50019jp1) null, (C51691vg0) null, (C52271zj0) null, (C0264h) null, (C50428mo1) null, (C49316ep1) null, (C49236e51) null, (List) null, (C51869ws0) null, (C51583uq0) null, (C51810wb1) null, (C51583uq0) null, 65535, (C8480h) null);
        }

        public C3463b(int i, int i2, LinkedList linkedList, C49098d51 d512, C50019jp1 jp12, C51691vg0 vg02, C52271zj0 zj02, C0264h hVar, C50428mo1 mo12, C49316ep1 ep12, C49236e51 e512, List list, C51869ws0 ws02, C51583uq0 uq02, C51810wb1 wb12, C51583uq0 uq03, int i3, C8480h hVar2) {
            int i4 = i3;
            int i5 = -1;
            int i6 = (i4 & 1) != 0 ? -1 : i;
            i5 = (i4 & 2) == 0 ? i2 : i5;
            LinkedList linkedList2 = (i4 & 4) != 0 ? new LinkedList() : linkedList;
            C49098d51 d513 = (i4 & 8) != 0 ? null : d512;
            C50019jp1 jp13 = (i4 & 16) != 0 ? null : jp12;
            C51691vg0 vg03 = (i4 & 32) != 0 ? null : vg02;
            C52271zj0 zj03 = (i4 & 64) != 0 ? null : zj02;
            C0264h hVar3 = (i4 & 128) != 0 ? null : hVar;
            C50428mo1 mo13 = (i4 & 256) != 0 ? null : mo12;
            C49316ep1 ep13 = (i4 & 512) != 0 ? null : ep12;
            C49236e51 e513 = (i4 & 1024) != 0 ? null : e512;
            List list2 = (i4 & 2048) != 0 ? null : list;
            C51869ws0 ws03 = (i4 & 4096) != 0 ? null : ws02;
            C51583uq0 uq04 = (i4 & 8192) != 0 ? null : uq02;
            C51810wb1 wb13 = (i4 & 16384) != 0 ? null : wb12;
            C51583uq0 uq05 = (i4 & 32768) != 0 ? null : uq03;
            C87412m.m108594g(linkedList2, "userTags");
            this.f16262a = i6;
            this.f16263b = i5;
            this.f16264c = linkedList2;
            this.f16265d = d513;
            this.f16266e = jp13;
            this.f16267f = vg03;
            this.f16268g = zj03;
            this.f16269h = hVar3;
            this.f16270i = mo13;
            this.f16271j = ep13;
            this.f16272k = e513;
            this.f16273l = list2;
            this.f16274m = ws03;
            this.f16275n = uq04;
            this.f16276o = wb13;
            this.f16277p = uq05;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3463b)) {
                return false;
            }
            C3463b bVar = (C3463b) obj;
            return this.f16262a == bVar.f16262a && this.f16263b == bVar.f16263b && C87412m.m108589b(this.f16264c, bVar.f16264c) && C87412m.m108589b(this.f16265d, bVar.f16265d) && C87412m.m108589b(this.f16266e, bVar.f16266e) && C87412m.m108589b(this.f16267f, bVar.f16267f) && C87412m.m108589b(this.f16268g, bVar.f16268g) && C87412m.m108589b(this.f16269h, bVar.f16269h) && C87412m.m108589b(this.f16270i, bVar.f16270i) && C87412m.m108589b(this.f16271j, bVar.f16271j) && C87412m.m108589b(this.f16272k, bVar.f16272k) && C87412m.m108589b(this.f16273l, bVar.f16273l) && C87412m.m108589b(this.f16274m, bVar.f16274m) && C87412m.m108589b(this.f16275n, bVar.f16275n) && C87412m.m108589b(this.f16276o, bVar.f16276o) && C87412m.m108589b(this.f16277p, bVar.f16277p);
        }

        public int hashCode() {
            int hashCode = ((((this.f16262a * 31) + this.f16263b) * 31) + this.f16264c.hashCode()) * 31;
            C49098d51 d512 = this.f16265d;
            int i = 0;
            int hashCode2 = (hashCode + (d512 == null ? 0 : d512.hashCode())) * 31;
            C50019jp1 jp12 = this.f16266e;
            int hashCode3 = (hashCode2 + (jp12 == null ? 0 : jp12.hashCode())) * 31;
            C51691vg0 vg02 = this.f16267f;
            int hashCode4 = (hashCode3 + (vg02 == null ? 0 : vg02.hashCode())) * 31;
            C52271zj0 zj02 = this.f16268g;
            int hashCode5 = (hashCode4 + (zj02 == null ? 0 : zj02.hashCode())) * 31;
            C0264h hVar = this.f16269h;
            int hashCode6 = (hashCode5 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            C50428mo1 mo12 = this.f16270i;
            int hashCode7 = (hashCode6 + (mo12 == null ? 0 : mo12.hashCode())) * 31;
            C49316ep1 ep12 = this.f16271j;
            int hashCode8 = (hashCode7 + (ep12 == null ? 0 : ep12.hashCode())) * 31;
            C49236e51 e512 = this.f16272k;
            int hashCode9 = (hashCode8 + (e512 == null ? 0 : e512.hashCode())) * 31;
            List<? extends FinderJumpInfo> list = this.f16273l;
            int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
            C51869ws0 ws02 = this.f16274m;
            int hashCode11 = (hashCode10 + (ws02 == null ? 0 : ws02.hashCode())) * 31;
            C51583uq0 uq02 = this.f16275n;
            int hashCode12 = (hashCode11 + (uq02 == null ? 0 : uq02.hashCode())) * 31;
            C51810wb1 wb12 = this.f16276o;
            int hashCode13 = (hashCode12 + (wb12 == null ? 0 : wb12.hashCode())) * 31;
            C51583uq0 uq03 = this.f16277p;
            if (uq03 != null) {
                i = uq03.hashCode();
            }
            return hashCode13 + i;
        }

        public String toString() {
            return "UserExtInfo(friendFollowCount=" + this.f16262a + ", fansCount=" + this.f16263b + ", userTags=" + this.f16264c + ", finderLiveNoticInfo=" + this.f16265d + ", shopInfo=" + this.f16266e + ", bizInfo=" + this.f16267f + ", eventInfo=" + this.f16268g + ", logOutInfo=" + this.f16269h + ", poiInfo=" + this.f16270i + ", weComInfo=" + this.f16271j + ", finderLiveNoticeListInfo=" + this.f16272k + ", jumpInfo=" + this.f16273l + ", liveAnchorStat=" + this.f16274m + ", ipRegionInfo=" + this.f16275n + ", mcnInfo=" + this.f16276o + ", attrRegionInfo=" + this.f16277p + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b0 */
    public static final class C3464b0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58969q f16278d;

        /* renamed from: e */
        public final /* synthetic */ FinderProfileHeaderUIC f16279e;

        public C3464b0(C58969q qVar, FinderProfileHeaderUIC finderProfileHeaderUIC) {
            this.f16278d = qVar;
            this.f16279e = finderProfileHeaderUIC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleNickname$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putStringArrayListExtra("key_url_list", new ArrayList(C26236u.m33719b(this.f16278d.mo84172g0())));
            intent.putExtra("key_preview_avatar", true);
            ((C58684b) C86312j.m106911c(C58684b.class)).Kx0(this.f16279e.getActivity(), intent);
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f16279e.getContext());
            f2Var.mo8577a(f != null ? f.mo12861q3() : null, "icon_avatar", 1, (JSONObject) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleNickname$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b1 */
    public static final class C3465b1 extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16280d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3465b1(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16280d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16280d.mo3808J3().f42937p0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$c */
    public static final class C3466c extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16281d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3466c(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16281d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return (LinearLayout) ((C36570n) ((C10943a) C39818r.f106831a.mo62444c(this.f16281d.getActivity()).mo75002a(C10943a.class)).f32630i).getValue();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$c0 */
    public static final class C3467c0 extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16282d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3467c0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16282d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16282d.mo3808J3().f42888I;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$d */
    public static final class C3468d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3468d(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16283d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return (TextView) ((C36570n) ((C10943a) C39818r.f106831a.mo62444c(this.f16283d.getActivity()).mo75002a(C10943a.class)).f32632n).getValue();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$d0 */
    public static final class C3469d0 extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16284d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3469d0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16284d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return ((C15970d0) ((C36570n) this.f16284d.f16234f).getValue()).f42876f;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$e */
    public static final class C3470e extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16285d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3470e(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16285d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return (WeImageView) ((C36570n) ((C10943a) C39818r.f106831a.mo62444c(this.f16285d.getActivity()).mo75002a(C10943a.class)).f32631j).getValue();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$e0 */
    public static final class C3471e0 extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16286d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3471e0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16286d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16286d.mo3808J3().f42890K;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$f */
    public static final class C3472f extends C87413o implements C32224a<C15983x> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16287d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3472f(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16287d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return C15983x.m14891a(this.f16287d.findViewById(C0966R.C0970id.h9k));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$f0 */
    public static final class C3473f0 extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16288d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3473f0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16288d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f16288d.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$g */
    public static final class C3474g extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16289d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3474g(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16289d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16289d.mo3808J3().f42930m;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$g0 */
    public static final class C3475g0 extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16290d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3475g0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16290d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16290d.mo3808J3().f42898S;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$h */
    public static final class C3476h extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16291d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3476h(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16291d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16291d.mo3808J3().f42932n;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$h0 */
    public static final class C3477h0 extends C87413o implements C32224a<C15967a> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16292d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3477h0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16292d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return ((C15970d0) ((C36570n) this.f16292d.f16234f).getValue()).f42877g;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$i */
    public static final class C3478i extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16293d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3478i(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16293d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16293d.mo3808J3().f42934o;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$i0 */
    public static final class C3479i0 extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16294d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3479i0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16294d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return ((C15983x) ((C36570n) this.f16294d.f16232e).getValue()).f43012l;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$j */
    public static final class C3480j extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16295d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3480j(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16295d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16295d.mo3808J3().f42936p;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$j0 */
    public static final class C3481j0 extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16296d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3481j0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16296d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16296d.mo3808J3().f42894O;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$k */
    public static final class C3482k extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16297d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3482k(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16297d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16297d.mo3808J3().f42940r;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$k0 */
    public static final class C3483k0 extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16298d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3483k0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16298d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16298d.mo3808J3().f42893N;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$l */
    public static final class C3484l extends C87413o implements C32224a<C49712hj1> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16299d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3484l(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16299d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return ((C13442s8) C39818r.f106831a.mo62444c(this.f16299d.getActivity()).mo75002a(C13442s8.class)).mo12861q3();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$l0 */
    public static final class C3485l0 extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16300d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3485l0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16300d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16300d.mo3808J3().f42895P;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$m */
    public static final class C3486m implements C45770k {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16301d;

        public C3486m(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            this.f16301d = finderProfileHeaderUIC;
        }

        /* renamed from: i4 */
        public void mo3121i4(C50401mh0 mh02, int i, int i2) {
            C87412m.m108594g(mh02, "cmdItem");
            if (this.f16301d.isSelf() && this.f16301d.isSelfFlag() && mh02.f138028d == 106) {
                FinderProfileHeaderUIC.m3564X3(this.f16301d, "handleCmd", (String) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$m0 */
    public static final class C3487m0 extends C87413o implements C32224a<CoordinatorLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16302d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3487m0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16302d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return ((C15970d0) ((C36570n) this.f16302d.f16234f).getValue()).f42872b;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$n */
    public static final class C3488n extends C87413o implements C32224a<CollapsibleTextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16303d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3488n(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16303d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16303d.mo3808J3().f42945w;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$n0 */
    public static final class C3489n0 implements C65231j<C65220d> {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileHeaderUIC f16304a;

        public C3489n0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            this.f16304a = finderProfileHeaderUIC;
        }

        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C87412m.m108594g(dVar, "task");
            C87412m.m108594g(nVar, "status");
            if (nVar == C65234n.Fail) {
                C76912y0.makeText((Context) this.f16304a.getActivity(), (CharSequence) this.f16304a.getString(C0966R.string.et6), 0).show();
            } else {
                C76912y0.makeText((Context) this.f16304a.getActivity(), (CharSequence) this.f16304a.getString(C0966R.string.et9), 0).show();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$o */
    public static final class C3490o extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16305d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3490o(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16305d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16305d.mo3808J3().f42944v;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$o0 */
    public static final class C3491o0 extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileHeaderUIC f16306a;

        public C3491o0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            this.f16306a = finderProfileHeaderUIC;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (z) {
                C7435f2 f2Var = C7435f2.f25626a;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f16306a.getContext());
                f2Var.mo8577a(f != null ? f.mo12861q3() : null, "icon_avatar", 0, (JSONObject) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$p */
    public static final class C3492p implements C8794p5<C51376tc1> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16307d;

        /* renamed from: e */
        public final /* synthetic */ boolean f16308e;

        public C3492p(FinderProfileHeaderUIC finderProfileHeaderUIC, boolean z) {
            this.f16307d = finderProfileHeaderUIC;
            this.f16308e = z;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C58969q profileContact;
            C51376tc1 tc12 = (C51376tc1) obj;
            C87412m.m108594g(tc12, "req");
            C87412m.m108594g(nh02, "ret");
            boolean z = false;
            if (nh02.f138603e == 0) {
                C58961d.C58963b bVar = C58961d.f168673a;
                C58969q b = bVar.mo84155b(this.f16307d.f16213S0);
                if (b != null) {
                    boolean z2 = this.f16308e;
                    FinderProfileHeaderUIC finderProfileHeaderUIC = this.f16307d;
                    if (tc12.f142118e == 1) {
                        b.field_extFlag |= 16384;
                        if (z2) {
                            C76912y0.m92769h(finderProfileHeaderUIC.getActivity(), finderProfileHeaderUIC.getString(C0966R.string.ecf), C0966R.raw.icons_filled_eyes_off);
                        }
                        if (C58961d.C58963b.m68836h(bVar, finderProfileHeaderUIC.f16213S0, (String) null, true, false, 10, (Object) null) && (profileContact = finderProfileHeaderUIC.getProfileContact()) != null) {
                            FinderProfileHeaderUIC.m3565c3(finderProfileHeaderUIC, profileContact);
                        }
                    } else {
                        b.field_extFlag &= -16385;
                        if (z2) {
                            C76912y0.m92769h(finderProfileHeaderUIC.getActivity(), finderProfileHeaderUIC.getString(C0966R.string.eci), C0966R.raw.icons_filled_done);
                        }
                    }
                    bVar.mo84166o(b);
                    if (tc12.f142118e == 1) {
                        z = true;
                    }
                    finderProfileHeaderUIC.mo3819Y3(z, "");
                    return;
                }
                return;
            }
            C76912y0.makeText((Context) this.f16307d.getActivity(), (CharSequence) this.f16307d.getString(C0966R.string.ecb), 0).show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$p0 */
    public static final class C3493p0 extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileHeaderUIC f16309a;

        public C3493p0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            this.f16309a = finderProfileHeaderUIC;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (z) {
                C7435f2 f2Var = C7435f2.f25626a;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f16309a.getContext());
                f2Var.mo8577a(f != null ? f.mo12861q3() : null, "link_halfscreen_profile_avatar_profile", 0, (JSONObject) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$q */
    public static final class C3494q extends C87413o implements C32224a<RoundCornerRelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16310d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3494q(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16310d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16310d.mo3808J3().f42946x;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$q0 */
    public static final class C3495q0 extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileHeaderUIC f16311a;

        public C3495q0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            this.f16311a = finderProfileHeaderUIC;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (z) {
                C7435f2 f2Var = C7435f2.f25626a;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f16311a.getContext());
                f2Var.mo8577a(f != null ? f.mo12861q3() : null, "channel_profile_otherfrdfollow", 0, (JSONObject) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$r */
    public static final class C3496r extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16312d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3496r(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16312d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16312d.mo3808J3().f42880A;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$r0 */
    public static final class C3497r0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16313d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3497r0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16313d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            FinderProfileHeaderUIC finderProfileHeaderUIC = this.f16313d;
            C11614d0 d0Var = finderProfileHeaderUIC.f16220W;
            if (d0Var != null) {
                C3463b bVar = (C3463b) FinderProfileHeaderUIC.f16192h1.get(finderProfileHeaderUIC.f16213S0);
                C8797q5.C8798a.m8619a(d0Var, bVar != null ? bVar.f16272k : null, (String) null, 2, (Object) null);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("moreLiveListWidget");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$s */
    public static final class C3498s extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16314d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3498s(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16314d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16314d.mo3808J3().f42881B;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$s0 */
    public static final class C3499s0 extends C87413o implements C32229r<Integer, Integer, String, C8801r5, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16315d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3499s0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(4);
            this.f16315d = finderProfileHeaderUIC;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0049, code lost:
            r1 = r1.getResponse();
         */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo162I(java.lang.Object r24, java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
            /*
                r23 = this;
                r0 = r23
                r1 = r24
                java.lang.Number r1 = (java.lang.Number) r1
                r1.intValue()
                r1 = r25
                java.lang.Number r1 = (java.lang.Number) r1
                r1.intValue()
                r1 = r26
                java.lang.String r1 = (java.lang.String) r1
                r1 = r27
                ht1.r5 r1 = (ht1.C8801r5) r1
                sg.i<java.lang.String, com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b> r2 = com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.f16192h1
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC r3 = r0.f16315d
                java.lang.String r3 = r3.f16213S0
                java.lang.Object r3 = r2.get(r3)
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r3 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r3
                if (r3 != 0) goto L_0x0046
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r3 = new com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b
                r4 = r3
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 65535(0xffff, float:9.1834E-41)
                r22 = 0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            L_0x0046:
                r4 = 0
                if (r1 == 0) goto L_0x0052
                te3.aj0 r1 = r1.getResponse()
                if (r1 == 0) goto L_0x0052
                te3.d51 r1 = r1.f130563e
                goto L_0x0053
            L_0x0052:
                r1 = r4
            L_0x0053:
                if (r1 == 0) goto L_0x0065
                te3.d51 r5 = r3.f16265d
                if (r5 == 0) goto L_0x005c
                int r5 = r5.f132118d
                goto L_0x005f
            L_0x005c:
                r5 = 2147483647(0x7fffffff, float:NaN)
            L_0x005f:
                int r6 = r1.f132118d
                if (r5 <= r6) goto L_0x0065
                r3.f16265d = r1
            L_0x0065:
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC r1 = r0.f16315d
                java.lang.String r1 = r1.f16213S0
                r2.put(r1, r3)
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC r1 = r0.f16315d
                r2 = 2
                java.lang.String r3 = "onSceneEnd:[NetSceneCreateLiveNotice]"
                com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.m3564X3(r1, r3, r4, r2, r4)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3499s0.mo162I(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$t */
    public static final class C3500t extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16316d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3500t(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16316d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16316d.mo3808J3().f42943u;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$onResume$1", mo125469f = "FinderProfileHeaderUIC.kt", mo125470l = {431}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$t0 */
    public static final class C3501t0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f16317d;

        public C3501t0(C15601d<? super C3501t0> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C3501t0(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C3501t0((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f16317d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C66785b bVar = C66785b.f191882e;
                this.f16317d = 1;
                if (bVar.mo90679u0(8, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                ((Result) obj).m168123unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$u */
    public static final class C3502u extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16318d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3502u(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16318d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16318d.mo3808J3().f42885F;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$u0 */
    public static final class C3503u0 extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16319d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3503u0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16319d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return ((C15983x) ((C36570n) this.f16319d.f16232e).getValue()).f43017q;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$v */
    public static final class C3504v extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C3504v f16320d = new C3504v();

        public C3504v() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            boolean z = true;
            if (C37521f.f99353a4.mo60266n().intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$v0 */
    public static final class C3505v0 extends C87413o implements C32224a<C15972e0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16321d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3505v0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16321d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return C15972e0.m14887a(this.f16321d.f16238h);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$w */
    public static final class C3506w extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16322d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3506w(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16322d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16322d.mo3808J3().f42886G;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$w0 */
    public static final class C3507w0 extends C87413o implements C32224a<C15970d0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16323d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3507w0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16323d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return C15970d0.m14886a(this.f16323d.findViewById(C0966R.C0970id.br_));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$x */
    public static final class C3508x extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16324d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3508x(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16324d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16324d.mo3808J3().f42887H;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$x0 */
    public static final class C3509x0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l f16325d;

        public C3509x0(C32226l lVar) {
            this.f16325d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$sam$android_view_View_OnClickListener$0", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f16325d.invoke(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$sam$android_view_View_OnClickListener$0", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$y */
    public static final class C3510y implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LinearLayout f16326d;

        /* renamed from: e */
        public final /* synthetic */ FinderProfileHeaderUIC f16327e;

        public C3510y(LinearLayout linearLayout, FinderProfileHeaderUIC finderProfileHeaderUIC) {
            this.f16326d = linearLayout;
            this.f16327e = finderProfileHeaderUIC;
        }

        public final void run() {
            C10943a aVar;
            View view = this.f16326d;
            int measuredHeight = view.getMeasuredHeight();
            while (view.getId() != C0966R.C0970id.euo) {
                measuredHeight += view.getTop();
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
                if (view == null) {
                    break;
                }
            }
            int measuredHeight2 = measuredHeight + this.f16327e.mo3808J3().f42889J.getMeasuredHeight();
            if (measuredHeight2 > 0 && (aVar = (C10943a) C39818r.f106831a.mo62443b(this.f16327e.getContext()).mo62449e(C10943a.class)) != null) {
                aVar.f32624Q = measuredHeight2;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$y0 */
    public static final class C3511y0 extends C87413o implements C32228q<Integer, Integer, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SpannableString f16328d;

        /* renamed from: e */
        public final /* synthetic */ int f16329e;

        /* renamed from: f */
        public final /* synthetic */ int f16330f;

        /* renamed from: g */
        public final /* synthetic */ StringBuilder f16331g;

        /* renamed from: h */
        public final /* synthetic */ FinderProfileHeaderUIC f16332h;

        /* renamed from: i */
        public final /* synthetic */ C58969q f16333i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3511y0(SpannableString spannableString, int i, int i2, StringBuilder sb, FinderProfileHeaderUIC finderProfileHeaderUIC, C58969q qVar) {
            super(3);
            this.f16328d = spannableString;
            this.f16329e = i;
            this.f16330f = i2;
            this.f16331g = sb;
            this.f16332h = finderProfileHeaderUIC;
            this.f16333i = qVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            String str = (String) obj3;
            C87412m.m108594g(str, "nickname");
            this.f16328d.setSpan(new C4059g5(str, this.f16329e, this.f16330f, false, false, new C3534i(this.f16332h, this.f16333i), 16, (C8480h) null), intValue, intValue2, 17);
            StringBuilder sb = this.f16331g;
            sb.append(str + '|');
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$z */
    public static final class C3512z implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16334d;

        public C3512z(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            this.f16334d = finderProfileHeaderUIC;
        }

        public final void run() {
            String stringExtra = this.f16334d.getIntent().getStringExtra("key_extra_info");
            if (stringExtra == null) {
                stringExtra = "";
            }
            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
            FrameLayout frameLayout = this.f16334d.mo3808J3().f42883D;
            C13604l[] lVarArr = new C13604l[9];
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f = aVar.mo12873f(this.f16334d.getActivity());
            Integer num = null;
            C13604l lVar = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
            int i = 0;
            lVarArr[0] = lVar;
            C13442s8 f2 = aVar.mo12873f(this.f16334d.getActivity());
            C13604l lVar2 = new C13604l("finder_context_id", f2 != null ? f2.f38098n : null);
            int i2 = 1;
            lVarArr[1] = lVar2;
            C13442s8 f3 = aVar.mo12873f(this.f16334d.getActivity());
            lVarArr[2] = new C13604l("finder_tab_context_id", f3 != null ? f3.f38100p : null);
            C65861r rVar = C65861r.f189395e;
            C65861r rVar2 = C65861r.f189395e;
            if (!C65861r.m77586b(rVar2, this.f16334d.f16213S0, true, false, 4, (Object) null)) {
                i = rVar2.mo89899c(this.f16334d.f16213S0) ? 2 : 1;
            }
            lVarArr[3] = new C13604l("follow_button_type", Integer.valueOf(i));
            C13442s8 f4 = aVar.mo12873f(this.f16334d.getActivity());
            if (f4 != null) {
                num = Integer.valueOf(f4.f38096i);
            }
            lVarArr[4] = new C13604l("comment_scene", num);
            FinderProfileHeaderUIC finderProfileHeaderUIC = this.f16334d;
            lVarArr[5] = new C13604l("finder_username", finderProfileHeaderUIC.f16213S0);
            lVarArr[6] = new C13604l("profile_state_type", Integer.valueOf(finderProfileHeaderUIC.isSelf() ? 1 : 2));
            if (this.f16334d.getFragmentMode()) {
                i2 = 2;
            }
            lVarArr[7] = new C13604l("profile_screen_type", Integer.valueOf(i2));
            lVarArr[8] = new C13604l("extrainfo", stringExtra);
            eVar.mo86184uZ(frameLayout, "finder_profile_follow", C90364q0.m113147f(lVarArr), 40, 24617);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$z0 */
    public static final class C3513z0 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f16335d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3513z0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            super(0);
            this.f16335d = finderProfileHeaderUIC;
        }

        public Object invoke() {
            return this.f16335d.mo3808J3().f42897R;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileHeaderUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        View view = this.f16238h;
        C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f16223X0 = new C9228a((ViewGroup) view);
        this.f16227Z0 = C36568h.m40985a(C3504v.f16320d);
        this.f16228a1 = true;
        this.f16230c1 = true;
        this.f16231d1 = "";
        this.f16233e1 = 1;
        this.f16235f1 = new C3486m(this);
    }

    /* renamed from: O3 */
    public static final void m3562O3(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        int i = 8;
        finderProfileHeaderUIC.mo3807I3().f42863a.setVisibility(8);
        ((CoordinatorLayout) ((C36570n) finderProfileHeaderUIC.f16204L).getValue()).setVisibility(0);
        if (!finderProfileHeaderUIC.isSelf() || !finderProfileHeaderUIC.isSelfFlag()) {
            ((LinearLayout) ((C36570n) finderProfileHeaderUIC.f16206N).getValue()).setVisibility(8);
        } else {
            ((LinearLayout) ((C36570n) finderProfileHeaderUIC.f16206N).getValue()).setVisibility(0);
        }
        C10943a aVar = (C10943a) C39818r.f106831a.mo62443b(finderProfileHeaderUIC.getContext()).mo62449e(C10943a.class);
        boolean z = aVar != null ? aVar.f32625R : false;
        FrameLayout frameLayout = (FrameLayout) ((C36570n) finderProfileHeaderUIC.f16207P).getValue();
        if (z) {
            i = 0;
        }
        frameLayout.setVisibility(i);
    }

    /* renamed from: Q3 */
    public static void m3563Q3(FinderProfileHeaderUIC finderProfileHeaderUIC, z74 z74, int i, Object obj) {
        if ((i & 1) != 0) {
            z74 = null;
        }
        if (finderProfileHeaderUIC.f16226Z == null) {
            Activity context = finderProfileHeaderUIC.getContext();
            View view = finderProfileHeaderUIC.f16238h;
            C87412m.m108593f(view, "header");
            C8626e eVar = new C8626e(context, view, (C49712hj1) null, 4, (C8480h) null);
            finderProfileHeaderUIC.f16226Z = eVar;
            String str = finderProfileHeaderUIC.f16213S0;
            C87412m.m108594g(str, "userName");
            eVar.f27749j = str;
        }
        C8626e eVar2 = finderProfileHeaderUIC.f16226Z;
        if (eVar2 != null) {
            eVar2.mo9502i(z74);
        }
    }

    /* renamed from: X3 */
    public static /* synthetic */ void m3564X3(FinderProfileHeaderUIC finderProfileHeaderUIC, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        finderProfileHeaderUIC.mo3818W3(str, str2);
    }

    /* renamed from: c3 */
    public static final void m3565c3(FinderProfileHeaderUIC finderProfileHeaderUIC, C58969q qVar) {
        finderProfileHeaderUIC.getClass();
        C39818r rVar = C39818r.f106831a;
        ((C58417y0) C86312j.m106911c(C58417y0.class)).ty0(finderProfileHeaderUIC.f16213S0, 3, C31543z5.m39455e(), C58739j4.f168176a.mo83688Q(qVar) ? 1 : 0, ((FinderProfileFeedUIC) rVar.mo62445d(((FinderProfileTabUIC) rVar.mo62444c(finderProfileHeaderUIC.getActivity()).mo75002a(FinderProfileTabUIC.class)).mo78520h4(FinderProfileFeedFragment.class)).mo75002a(FinderProfileFeedUIC.class)).getState() == FinderProfileFeedLoader.State.PRIVATE_LOCK ? 1 : 0);
        C49712hj1 contextObj = finderProfileHeaderUIC.getContextObj();
        String str = finderProfileHeaderUIC.f16213S0;
        int i = C60811w.f173196u;
        m3566f3(finderProfileHeaderUIC, contextObj, str, 2, finderProfileHeaderUIC.f16215T0, false, (String) null, (C64414h71) null, 112, (Object) null);
        finderProfileHeaderUIC.mo3813P3();
        finderProfileHeaderUIC.mo3812N3("setFollowed");
        C9228a aVar = finderProfileHeaderUIC.f16223X0;
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = finderProfileHeaderUIC.f16238h.getContext();
        C58969q profileContact = finderProfileHeaderUIC.getProfileContact();
        SpannableString T1 = hVar.mo107057T1(context, profileContact != null ? profileContact.mo84196w1() : null);
        String K3 = finderProfileHeaderUIC.mo3809K3();
        aVar.getClass();
        aVar.mo10019b(T1, K3, true);
    }

    /* renamed from: f3 */
    public static void m3566f3(FinderProfileHeaderUIC finderProfileHeaderUIC, C49712hj1 hj12, String str, int i, long j, boolean z, String str2, C64414h71 h712, int i2, Object obj) {
        long j2 = (i2 & 8) != 0 ? 0 : j;
        boolean z2 = (i2 & 16) != 0 ? false : z;
        String str3 = (i2 & 32) != 0 ? "" : str2;
        C64414h71 h713 = (i2 & 64) != 0 ? null : h712;
        int i3 = finderProfileHeaderUIC.getIntent().getIntExtra("key_enter_profile_type", -1) == 11 ? 2 : 0;
        int intExtra = finderProfileHeaderUIC.getIntent().getIntExtra("key_entrance_type", -1);
        int intExtra2 = finderProfileHeaderUIC.getIntent().getIntExtra("key_enter_profile_type", 0);
        C0751m0.f1769a.mo707d(hj12, str, i, j2, z2, str3, h713, Integer.valueOf(i3), ((intExtra < 34 || intExtra > 37) && intExtra != 14) ? -1 : intExtra2 > 0 ? intExtra2 : intExtra);
    }

    /* renamed from: F3 */
    public final RoundCornerRelativeLayout mo3805F3() {
        return (RoundCornerRelativeLayout) this.f16199G.getValue();
    }

    /* renamed from: G3 */
    public final WeImageView mo3806G3() {
        return (WeImageView) this.f16241n.getValue();
    }

    /* renamed from: I3 */
    public final C15967a mo3807I3() {
        return (C15967a) this.f16205M.getValue();
    }

    /* renamed from: J3 */
    public final C15972e0 mo3808J3() {
        return (C15972e0) this.f16236g.getValue();
    }

    /* renamed from: K3 */
    public final String mo3809K3() {
        C3463b bVar = (C3463b) f16192h1.get(this.f16213S0);
        if (bVar == null) {
            bVar = new C3463b(0, 0, (LinkedList) null, (C49098d51) null, (C50019jp1) null, (C51691vg0) null, (C52271zj0) null, (C0264h) null, (C50428mo1) null, (C49316ep1) null, (C49236e51) null, (List) null, (C51869ws0) null, (C51583uq0) null, (C51810wb1) null, (C51583uq0) null, 65535, (C8480h) null);
        }
        LinkedList<String> linkedList = bVar.f16264c;
        if (!linkedList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = linkedList.size();
            int i = this.f16233e1;
            if (size > i) {
                sb.append(linkedList.get(i));
                sb.append(" ");
            }
            int i2 = 0;
            if (linkedList.size() > 0) {
                sb.append(linkedList.get(0));
                sb.append(" ");
            }
            for (T next : linkedList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str = (String) next;
                    if (i2 > this.f16233e1) {
                        sb.append(str);
                        sb.append(" ");
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), sb.toString());
            if (T1 != null) {
                String spannableString = T1.toString();
                C87412m.m108593f(spannableString, "this.toString()");
                return spannableString;
            }
        }
        return "";
    }

    /* renamed from: L3 */
    public final void mo3810L3() {
        if (!isSelf() && !isSelfFlag()) {
            LinearLayout linearLayout = mo3808J3().f42882C;
            C87412m.m108593f(linearLayout, "profileHeaderUiBinding.finderProfileFollowArea");
            linearLayout.post(new C3510y(linearLayout, this));
        }
    }

    /* renamed from: M3 */
    public final void mo3811M3() {
        LinearLayout linearLayout = mo3808J3().f42882C;
        C87412m.m108593f(linearLayout, "profileHeaderUiBinding.finderProfileFollowArea");
        C87412m.m108593f(mo3808J3().f42889J, "profileHeaderUiBinding.finderProfileHeaderInfoArea");
        FrameLayout frameLayout = mo3808J3().f42933n0;
        C87412m.m108593f(frameLayout, "profileHeaderUiBinding.sendMsgBtn");
        FrameLayout frameLayout2 = mo3808J3().f42883D;
        C87412m.m108593f(frameLayout2, "profileHeaderUiBinding.finderProfileFollowBtn");
        if (frameLayout2.getVisibility() == 8 && frameLayout.getVisibility() == 8) {
            C11608d dVar = this.f16210R;
            if (dVar != null) {
                if (!(dVar.mo11522b().getVisibility() == 0)) {
                    linearLayout.setVisibility(8);
                    return;
                }
                return;
            }
            C87412m.m108603p("enterpriseAdd");
            throw null;
        }
    }

    /* renamed from: N3 */
    public final void mo3812N3(String str) {
        String str2 = str;
        FrameLayout frameLayout = mo3808J3().f42883D;
        C87412m.m108593f(frameLayout, "profileHeaderUiBinding.finderProfileFollowBtn");
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        if (C37521f.f99335Y2.mo60266n().intValue() == 1) {
            Log.m105924i("Finder.FinderProfileHeaderUIC", "handleFollowBtn return for FINDER_PROFILE_COVER_TEST_ENABLE");
            frameLayout.setVisibility(8);
        } else if (isSelf() || !this.f16221W0) {
            frameLayout.setVisibility(8);
            mo3811M3();
        } else {
            TextView textView = mo3808J3().f42884E;
            C87412m.m108593f(textView, "profileHeaderUiBinding.finderProfileFollowBtnTv");
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            if (!C87412m.m108589b(str2, "onCreate")) {
                frameLayout.setVisibility(0);
            }
            C65861r rVar = C65861r.f189395e;
            C65861r rVar2 = C65861r.f189395e;
            if (C65861r.m77586b(rVar2, this.f16213S0, true, false, 4, (Object) null)) {
                Class cls = FinderProfileUiStyleUIC.class;
                FrameLayout frameLayout2 = mo3808J3().f42883D;
                C87412m.m108593f(frameLayout2, "profileHeaderUiBinding.finderProfileFollowBtn");
                mo3831k3().setImageDrawable(C87515a.m108835e(getContext().getResources(), C0966R.raw.finder_filled_correct, 0.0f));
                mo3831k3().setIconColor(getResources().getColor(C0966R.color.ani));
                mo3806G3().setImageDrawable(C87515a.m108835e(getContext().getResources(), C0966R.raw.finder_filled_correct, 0.0f));
                int b = C76577a.m92151b(getContext(), 12);
                WeImageView G3 = mo3806G3();
                ViewGroup.LayoutParams layoutParams = mo3806G3().getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                layoutParams.width = b;
                layoutParams.height = b;
                G3.setLayoutParams(layoutParams);
                C39818r rVar3 = C39818r.f106831a;
                if (((FinderProfileUiStyleUIC) rVar3.mo62444c(getActivity()).mo75002a(cls)).mo3861i0()) {
                    frameLayout2.setBackgroundResource(C0966R.C0969drawable.amm);
                    mo3827i3().setBackgroundResource(C0966R.C0969drawable.amm);
                    mo3806G3().setIconColor(getResources().getColor(C0966R.color.f2975b6));
                } else {
                    frameLayout2.setBackgroundResource(C0966R.C0969drawable.a45);
                    mo3827i3().setBackgroundResource(C0966R.C0969drawable.a45);
                    mo3806G3().setIconColor(getResources().getColor(C0966R.color.ani));
                }
                TextView textView2 = mo3808J3().f42884E;
                C87412m.m108593f(textView2, "profileHeaderUiBinding.finderProfileFollowBtnTv");
                mo3806G3().setVisibility(0);
                if (((FinderProfileUiStyleUIC) rVar3.mo62444c(getActivity()).mo75002a(cls)).mo3861i0()) {
                    mo3830j3().setTextColor(getResources().getColor(C0966R.color.f2975b6));
                    textView2.setTextColor(getResources().getColor(C0966R.color.f2975b6));
                    mo3806G3().setIconColor(getResources().getColor(C0966R.color.f2975b6));
                } else {
                    mo3830j3().setTextColor(getResources().getColor(C0966R.color.ani));
                    textView2.setTextColor(getResources().getColor(C0966R.color.ani));
                    mo3806G3().setIconColor(getResources().getColor(C0966R.color.ani));
                }
                mo3830j3().setText(C0966R.string.m_v);
                textView2.setText(C0966R.string.m_v);
                mo3831k3().setVisibility(0);
                C58969q profileContact = getProfileContact();
                if (profileContact != null) {
                    C10980a1 a1Var = new C10980a1(this, profileContact);
                    frameLayout2.setOnClickListener(new C3509x0(a1Var));
                    mo3827i3().setOnClickListener(new C3509x0(a1Var));
                    frameLayout2.setTag(C0966R.C0970id.d5b, getContext().getString(C0966R.string.ejs));
                    frameLayout2.post(new C11071z0(this));
                }
            } else if (rVar2.mo89899c(this.f16213S0)) {
                FrameLayout frameLayout3 = mo3808J3().f42883D;
                C87412m.m108593f(frameLayout3, "profileHeaderUiBinding.finderProfileFollowBtn");
                mo3806G3().setVisibility(8);
                mo3831k3().setVisibility(8);
                mo3821a4();
                TextView textView3 = mo3808J3().f42884E;
                C87412m.m108593f(textView3, "profileHeaderUiBinding.finderProfileFollowBtnTv");
                mo3830j3().setText(C0966R.string.f360509da2);
                mo3830j3().setTextColor(getResources().getColor(C0966R.color.ani));
                mo3830j3().setBackgroundResource(C0966R.C0969drawable.a45);
                textView3.setText(C0966R.string.f360509da2);
                textView3.setTextColor(getResources().getColor(C0966R.color.ani));
                frameLayout3.setBackgroundResource(C0966R.C0969drawable.a45);
                C58969q profileContact2 = getProfileContact();
                if (profileContact2 != null) {
                    frameLayout3.setOnClickListener(new C3509x0(new C10998f1(this, profileContact2)));
                    mo3827i3().setOnClickListener((View.OnClickListener) null);
                    frameLayout3.setTag(C0966R.C0970id.d5b, textView3.getText());
                    frameLayout3.post(new C10994e1(this));
                }
            } else {
                C58969q profileContact3 = getProfileContact();
                if (profileContact3 != null) {
                    FrameLayout frameLayout4 = mo3808J3().f42883D;
                    C87412m.m108593f(frameLayout4, "profileHeaderUiBinding.finderProfileFollowBtn");
                    TextView textView4 = mo3808J3().f42884E;
                    C87412m.m108593f(textView4, "profileHeaderUiBinding.finderProfileFollowBtnTv");
                    mo3831k3().setVisibility(8);
                    mo3831k3().setImageDrawable(C87515a.m108835e(getContext().getResources(), C0966R.raw.icon_filled_add, 0.0f));
                    mo3806G3().setVisibility(8);
                    mo3806G3().setImageDrawable(C87515a.m108835e(getContext().getResources(), C0966R.raw.icon_filled_add, 0.0f));
                    fVar.getClass();
                    C35464c<Integer> cVar = C37521f.f99570y7;
                    if (cVar.mo60266n().intValue() == 1) {
                        mo3831k3().setIconColor(getResources().getColor(C0966R.color.f2975b6));
                        mo3806G3().setIconColor(getResources().getColor(C0966R.color.f2975b6));
                    } else {
                        mo3831k3().setIconColor(getResources().getColor(C0966R.color.FG_0_5));
                        mo3806G3().setIconColor(getResources().getColor(C0966R.color.FG_0_5));
                    }
                    int b2 = C76577a.m92151b(getContext(), 16);
                    WeImageView G32 = mo3806G3();
                    ViewGroup.LayoutParams layoutParams2 = mo3806G3().getLayoutParams();
                    C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    layoutParams2.width = b2;
                    layoutParams2.height = b2;
                    G32.setLayoutParams(layoutParams2);
                    mo3821a4();
                    boolean Q = C58739j4.f168176a.mo83688Q(profileContact3);
                    if (C87412m.m108589b(str2, "onSceneEnd")) {
                        C39818r rVar4 = C39818r.f106831a;
                        ((C58417y0) C86312j.m106911c(C58417y0.class)).ty0(this.f16213S0, 4, C31543z5.m39455e(), Q ? 1 : 0, ((FinderProfileFeedUIC) rVar4.mo62445d(((FinderProfileTabUIC) rVar4.mo62444c(getActivity()).mo75002a(FinderProfileTabUIC.class)).mo78520h4(FinderProfileFeedFragment.class)).mo75002a(FinderProfileFeedUIC.class)).getState() == FinderProfileFeedLoader.State.PRIVATE_LOCK ? 1 : 0);
                    }
                    if (Q) {
                        mo3830j3().setText(C0966R.string.d_k);
                        textView4.setText(C0966R.string.d_k);
                    } else {
                        mo3830j3().setText(C0966R.string.d_j);
                        textView4.setText(C0966R.string.d_j);
                    }
                    if (cVar.mo60266n().intValue() == 1) {
                        mo3827i3().setBackgroundResource(C0966R.C0969drawable.a44);
                        frameLayout4.setBackgroundResource(C0966R.C0969drawable.a44);
                    } else {
                        mo3827i3().setBackgroundResource(C0966R.C0969drawable.a45);
                        frameLayout4.setBackgroundResource(C0966R.C0969drawable.a45);
                    }
                    boolean[] zArr = {false};
                    frameLayout4.setOnTouchListener(new C10983b1(zArr));
                    C10989d1 d1Var = new C10989d1(zArr, this, Q);
                    frameLayout4.setOnClickListener(new C3509x0(d1Var));
                    mo3827i3().setOnClickListener(new C3509x0(d1Var));
                    frameLayout4.setTag(C0966R.C0970id.d5b, textView4.getText());
                    frameLayout4.post(new C10986c1(this));
                }
            }
            new Handler(Looper.getMainLooper()).postDelayed(new C3512z(this), 300);
            mo3811M3();
        }
    }

    /* renamed from: P3 */
    public final void mo3813P3() {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C58969q profileContact = getProfileContact();
        if (profileContact != null) {
            C85875k4.m106189j0(((TextView) ((C36570n) this.f16243p).getValue()).getPaint(), 0.8f);
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> i2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
            C62345f fVar = new C62345f(profileContact.mo84172g0(), (C27696y) null, 2, (C8480h) null);
            ImageView imageView = (ImageView) ((C36570n) this.f16246r).getValue();
            C87412m.m108593f(imageView, "avatarIv");
            i2.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            ((LinearLayout) ((C36570n) this.f16198F).getValue()).setOnClickListener(new C3461a0(this));
            ((ImageView) ((C36570n) this.f16246r).getValue()).setOnClickListener(new C3464b0(profileContact, this));
            ((WeImageView) ((C36570n) this.f16245q).getValue()).setVisibility(8);
        }
    }

    /* renamed from: R3 */
    public final boolean mo3814R3() {
        if (!isSelf() || !isSelfFlag()) {
            C37521f.f99374d.getClass();
            return ((Boolean) C37521f.f99178G4.mo60266n()).booleanValue();
        }
    }

    /* renamed from: T3 */
    public final boolean mo3815T3() {
        return ((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if ((r0.length() == 0) == false) goto L_0x0019;
     */
    /* renamed from: U3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3816U3(boolean r4, int r5) {
        /*
            r3 = this;
            fe1.q r0 = r3.getProfileContact()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r0.field_signature
            if (r0 == 0) goto L_0x0018
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r1 == 0) goto L_0x0025
            fe1.q r0 = r3.getProfileContact()
            gy3.C87412m.m108591d(r0)
            r3.mo3820Z3(r0, r5, r4)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.mo3816U3(boolean, int):void");
    }

    /* renamed from: V3 */
    public final void mo3817V3() {
        View findViewById = this.f16238h.findViewById(C0966R.C0970id.m_k);
        C11697z zVar = this.f16222X;
        if (zVar != null) {
            if ((zVar.mo11547a().getVisibility() == 0) || findViewById.getVisibility() == 0) {
                View findViewById2 = this.f16238h.findViewById(C0966R.C0970id.mud);
                View findViewById3 = this.f16238h.findViewById(C0966R.C0970id.muc);
                View findViewById4 = this.f16238h.findViewById(C0966R.C0970id.mub);
                if (findViewById2.getVisibility() == 0 || findViewById3.getVisibility() == 0 || findViewById4.getVisibility() == 0) {
                    View findViewById5 = this.f16238h.findViewById(C0966R.C0970id.co8);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view = findViewById5;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC", "refreshDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC", "refreshDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById6 = this.f16238h.findViewById(C0966R.C0970id.b6r);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    View view2 = findViewById6;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC", "refreshDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC", "refreshDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (this.f16238h.findViewById(C0966R.C0970id.hjc).getVisibility() == 8) {
                    this.f16238h.setPadding(0, 0, 0, ((View) ((C36570n) this.f16208Q).getValue()).getVisibility() == 0 ? getActivity().getResources().getDimensionPixelSize(C0966R.dimen.f3723cd) : getActivity().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv));
                    return;
                }
                return;
            }
            return;
        }
        C87412m.m108603p("redPackWidget");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b4, code lost:
        if ((r5 == null || r5.length() == 0) != false) goto L_0x01b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0702  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x071f  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0767  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x076b  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x076e  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0798  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x07bc  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x07cd  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x085a  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0890  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x089e  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x091e  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0985  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x09aa  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0a2b  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0a39  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0a7e  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0a80  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0a95  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0b1e  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0b64  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0c72  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0c82  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0c88  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0e4f  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0e5d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02ff  */
    /* renamed from: W3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3818W3(java.lang.String r47, java.lang.String r48) {
        /*
            r46 = this;
            r0 = r46
            r9 = r47
            java.lang.Class<ht1.v4> r10 = ht1.C8808v4.class
            java.lang.Class<ny.h> r11 = p629ny.C76979h.class
            long r12 = android.os.SystemClock.uptimeMillis()
            ye1.a r1 = r46.mo3807I3()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.f42863a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r1, r2)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            boolean r2 = r46.getFragmentMode()
            r14 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            if (r2 == 0) goto L_0x002b
            r1.topMargin = r14
            goto L_0x003d
        L_0x002b:
            android.app.Activity r2 = r46.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131165256(0x7f070048, float:1.7944724E38)
            float r2 = r2.getDimension(r4)
            int r2 = (int) r2
            r1.topMargin = r2
        L_0x003d:
            sg.i<java.lang.String, com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b> r1 = f16192h1
            java.lang.String r2 = r0.f16213S0
            java.lang.Object r2 = r1.get(r2)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r2 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r2
            java.lang.String r15 = "onSceneEnd:[NetSceneFinderUserPage]"
            r8 = 8
            r7 = 1
            if (r2 == 0) goto L_0x0123
            bd1.h r2 = r2.f16269h
            if (r2 == 0) goto L_0x0123
            boolean r4 = r2.f820c
            if (r4 != 0) goto L_0x00d0
            fe1.q r4 = r46.getProfileContact()
            if (r4 == 0) goto L_0x0064
            boolean r4 = r4.mo84190n2()
            if (r4 != r7) goto L_0x0064
            r4 = 1
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            if (r4 == 0) goto L_0x0068
            goto L_0x00d0
        L_0x0068:
            int r2 = r2.f818a
            if (r2 != r7) goto L_0x00ca
            boolean r2 = r46.isSelf()
            if (r2 == 0) goto L_0x0097
            boolean r2 = r46.isSelfFlag()
            if (r2 == 0) goto L_0x0097
            boolean r2 = gy3.C87412m.m108589b(r9, r15)
            if (r2 == 0) goto L_0x00ad
            androidx.appcompat.app.AppCompatActivity r2 = r46.getActivity()
            r2.finish()
            java.lang.Class<er1.b> r2 = er1.C58684b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            er1.b r2 = (er1.C58684b) r2
            androidx.appcompat.app.AppCompatActivity r4 = r46.getActivity()
            java.lang.String r5 = r0.f16213S0
            r2.Px0(r4, r5)
            goto L_0x00ad
        L_0x0097:
            ye1.a r2 = r46.mo3807I3()
            androidx.constraintlayout.widget.ConstraintLayout r2 = r2.f42863a
            r2.setVisibility(r14)
            rx3.g r2 = r0.f16204L
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            androidx.coordinatorlayout.widget.CoordinatorLayout r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r2
            r2.setVisibility(r8)
        L_0x00ad:
            rx3.g r2 = r0.f16206N
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.setVisibility(r8)
            rx3.g r2 = r0.f16207P
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.setVisibility(r8)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L_0x0128
        L_0x00ca:
            m3562O3(r46)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L_0x0128
        L_0x00d0:
            rx3.g r2 = r0.f16206N
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.setVisibility(r8)
            rx3.g r2 = r0.f16207P
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.setVisibility(r8)
            ye1.a r2 = r46.mo3807I3()
            androidx.constraintlayout.widget.ConstraintLayout r2 = r2.f42863a
            r2.setVisibility(r14)
            rx3.g r2 = r0.f16204L
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            androidx.coordinatorlayout.widget.CoordinatorLayout r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r2
            r2.setVisibility(r8)
            ye1.a r2 = r46.mo3807I3()
            androidx.constraintlayout.widget.ConstraintLayout r2 = r2.f42863a
            r4 = 2131315081(0x7f094989, float:1.8248605E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 != 0) goto L_0x0112
            goto L_0x0120
        L_0x0112:
            androidx.appcompat.app.AppCompatActivity r4 = r46.getActivity()
            r5 = 2131826032(0x7f111570, float:1.9284937E38)
            java.lang.String r4 = r4.getString(r5)
            r2.setText(r4)
        L_0x0120:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0128
        L_0x0123:
            m3562O3(r46)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L_0x0128:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[handleLogOut] logout = "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r6 = "Finder.FinderProfileHeaderUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            android.widget.LinearLayout r2 = r46.mo3833m3()
            r2.setVisibility(r8)
            fe1.q r2 = r46.getProfileContact()
            if (r2 == 0) goto L_0x014e
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r2 = r2.field_authInfo
            goto L_0x014f
        L_0x014e:
            r2 = 0
        L_0x014f:
            java.lang.String r23 = ""
            r4 = 2
            if (r2 != 0) goto L_0x0172
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "[handleAuthGenerator] profileContact="
            r2.append(r5)
            fe1.q r5 = r46.getProfileContact()
            if (r5 == 0) goto L_0x0166
            r5 = 1
            goto L_0x0167
        L_0x0166:
            r5 = 0
        L_0x0167:
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r2)
            goto L_0x019e
        L_0x0172:
            int r5 = r2.authIconType
            if (r5 > 0) goto L_0x01a2
            java.lang.String r5 = r2.unauth_profession
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x01a2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "[handleAuthGenerator] return authIconType="
            r5.append(r8)
            int r8 = r2.authIconType
            r5.append(r8)
            java.lang.String r8 = " unAuthProfession="
            r5.append(r8)
            java.lang.String r2 = r2.unauth_profession
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r2)
        L_0x019e:
            r18 = r12
            goto L_0x039f
        L_0x01a2:
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r2.authGenerator
            if (r5 == 0) goto L_0x01b6
            java.lang.String r5 = r2.realName
            if (r5 == 0) goto L_0x01b3
            int r5 = r5.length()
            if (r5 != 0) goto L_0x01b1
            goto L_0x01b3
        L_0x01b1:
            r5 = 0
            goto L_0x01b4
        L_0x01b3:
            r5 = 1
        L_0x01b4:
            if (r5 == 0) goto L_0x01de
        L_0x01b6:
            up1.f r5 = up1.C37521f.f99374d
            r5.getClass()
            re1.a r5 = up1.C37521f.f99521t5
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x01de
            com.tencent.mm.protocal.protobuf.FinderContact r5 = new com.tencent.mm.protocal.protobuf.FinderContact
            r5.<init>()
            java.lang.String r8 = "test auth"
            r5.nickname = r8
            java.lang.String r8 = "http://wx.qlogo.cn/finderhead/Q3auHgzwzM5ibPQZNRq2SprG986yC2zMUjSVXgN7CV2hbm0QUjOcAnA/0"
            r5.headUrl = r8
            java.lang.String r8 = "v2_060000231003b20faec8c5e18f1cc4d7ca00ee33b07704a3d9a508fb83cdb3ecb0f31f019ec2@finder"
            r5.username = r8
            r2.authGenerator = r5
        L_0x01de:
            android.widget.LinearLayout r5 = r46.mo3834n3()
            java.lang.String r8 = "authGenerator"
            gy3.C87412m.m108593f(r5, r8)
            mo1.b0 r8 = new mo1.b0
            r8.<init>(r0)
            zp3.C23564m.m28138h(r5, r8)
            android.widget.LinearLayout r5 = r46.mo3834n3()
            mo1.c0 r8 = new mo1.c0
            r8.<init>(r0, r2)
            r5.setOnClickListener(r8)
            android.widget.TextView r5 = r46.mo3832l3()
            mo1.d0 r8 = new mo1.d0
            r8.<init>(r2, r0)
            r5.setOnClickListener(r8)
            java.lang.Class<tf0.p1> r5 = tf0.C64916p1.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            java.lang.String r8 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r5, r8)
            r16 = r5
            tf0.p1 r16 = (tf0.C64916p1) r16
            ye1.e0 r5 = r46.mo3808J3()
            android.widget.ImageView r5 = r5.f42938q
            java.lang.String r8 = "profileHeaderUiBinding.finderProfileAuthIcon"
            gy3.C87412m.m108593f(r5, r8)
            r19 = 0
            r20 = 0
            r21 = 12
            r22 = 0
            r17 = r5
            r18 = r2
            tf0.C64916p1.C64917a.m76444k(r16, r17, r18, r19, r20, r21, r22)
            int r5 = r2.authIconType
            if (r5 == r7) goto L_0x02b0
            if (r5 == r4) goto L_0x0274
            r8 = 100
            if (r5 == r8) goto L_0x0242
            r18 = r12
            r4 = r23
            r5 = r4
            r8 = 0
            goto L_0x0346
        L_0x0242:
            android.widget.LinearLayout r5 = r46.mo3833m3()
            r5.setVisibility(r14)
            android.widget.LinearLayout r5 = r46.mo3834n3()
            r8 = 8
            r5.setVisibility(r8)
            android.widget.TextView r5 = r46.mo3832l3()
            r8 = 0
            r5.setOnClickListener(r8)
            android.widget.TextView r5 = r46.mo3832l3()
            r8 = 2131826807(0x7f111877, float:1.9286509E38)
            r5.setText(r8)
            android.app.Activity r5 = r46.getContext()
            java.lang.String r5 = r5.getString(r8)
            java.lang.String r8 = "context.getString(com.te…ing.finder_has_real_name)"
            gy3.C87412m.m108593f(r5, r8)
            r18 = r12
            goto L_0x02ac
        L_0x0274:
            android.widget.LinearLayout r5 = r46.mo3834n3()
            r4 = 8
            r5.setVisibility(r4)
            android.widget.LinearLayout r4 = r46.mo3833m3()
            r4.setVisibility(r14)
            java.lang.String r5 = r2.authProfession
            if (r5 == 0) goto L_0x02a8
            android.widget.TextView r4 = r46.mo3832l3()
            r4.setVisibility(r14)
            android.widget.TextView r4 = r46.mo3832l3()
            android.content.res.Resources r8 = r46.getResources()
            r18 = r12
            java.lang.Object[] r12 = new java.lang.Object[r7]
            r12[r14] = r5
            r13 = 2131826337(0x7f1116a1, float:1.9285556E38)
            java.lang.String r8 = r8.getString(r13, r12)
            r4.setText(r8)
            goto L_0x02ac
        L_0x02a8:
            r18 = r12
            r5 = r23
        L_0x02ac:
            r4 = r23
            goto L_0x0345
        L_0x02b0:
            r18 = r12
            java.lang.String r4 = r2.authProfession
            if (r4 == 0) goto L_0x02d5
            android.widget.TextView r5 = r46.mo3832l3()
            r5.setVisibility(r14)
            android.widget.TextView r5 = r46.mo3832l3()
            android.content.res.Resources r8 = r46.getResources()
            java.lang.Object[] r12 = new java.lang.Object[r7]
            r12[r14] = r4
            r13 = 2131826337(0x7f1116a1, float:1.9285556E38)
            java.lang.String r8 = r8.getString(r13, r12)
            r5.setText(r8)
            r5 = r4
            goto L_0x02d7
        L_0x02d5:
            r5 = r23
        L_0x02d7:
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r2.authGenerator
            if (r8 == 0) goto L_0x0330
            java.lang.String r4 = r8.username
            if (r4 == 0) goto L_0x02ec
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x02e7
            r4 = 1
            goto L_0x02e8
        L_0x02e7:
            r4 = 0
        L_0x02e8:
            if (r4 != r7) goto L_0x02ec
            r4 = 1
            goto L_0x02ed
        L_0x02ec:
            r4 = 0
        L_0x02ed:
            if (r4 != 0) goto L_0x02f8
            int r4 = r2.verify_status
            r12 = 12
            if (r4 != r12) goto L_0x02f6
            goto L_0x02f8
        L_0x02f6:
            r4 = 0
            goto L_0x02f9
        L_0x02f8:
            r4 = 1
        L_0x02f9:
            if (r4 == 0) goto L_0x02fc
            goto L_0x02fd
        L_0x02fc:
            r8 = 0
        L_0x02fd:
            if (r8 == 0) goto L_0x0330
            android.widget.LinearLayout r4 = r46.mo3834n3()
            r4.setVisibility(r14)
            di3.d r4 = di3.C86312j.m106911c(r11)
            ny.h r4 = (p629ny.C76979h) r4
            android.app.Activity r12 = r46.getContext()
            java.lang.String r8 = r8.nickname
            if (r8 != 0) goto L_0x0316
            r8 = r23
        L_0x0316:
            android.text.SpannableString r4 = r4.mo107057T1(r12, r8)
            rx3.g r8 = r0.f16196D
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setText(r4)
            java.lang.String r8 = "ss"
            gy3.C87412m.m108593f(r4, r8)
            rx3.b0 r8 = rx3.C13598b0.f38549a
            goto L_0x0333
        L_0x0330:
            r4 = r23
            r8 = 0
        L_0x0333:
            if (r8 != 0) goto L_0x033e
            android.widget.LinearLayout r8 = r46.mo3834n3()
            r12 = 8
            r8.setVisibility(r12)
        L_0x033e:
            android.widget.LinearLayout r8 = r46.mo3833m3()
            r8.setVisibility(r14)
        L_0x0345:
            r8 = 1
        L_0x0346:
            if (r8 != 0) goto L_0x0375
            java.lang.String r8 = r2.unauth_profession
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0375
            android.widget.LinearLayout r5 = r46.mo3833m3()
            r5.setVisibility(r14)
            android.widget.LinearLayout r5 = r46.mo3834n3()
            r8 = 8
            r5.setVisibility(r8)
            android.widget.TextView r5 = r46.mo3832l3()
            r5.setVisibility(r14)
            android.widget.TextView r5 = r46.mo3832l3()
            java.lang.String r8 = r2.unauth_profession
            r5.setText(r8)
            java.lang.String r5 = r2.unauth_profession
            gy3.C87412m.m108591d(r5)
        L_0x0375:
            android.widget.LinearLayout r8 = r46.mo3833m3()
            if (r8 == 0) goto L_0x0387
            r12 = 2131302511(0x7f09186f, float:1.822311E38)
            int r2 = r2.authIconType
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.setTag(r12, r2)
        L_0x0387:
            android.widget.LinearLayout r2 = r46.mo3833m3()
            if (r2 == 0) goto L_0x0393
            r8 = 2131302512(0x7f091870, float:1.8223112E38)
            r2.setTag(r8, r5)
        L_0x0393:
            android.widget.LinearLayout r2 = r46.mo3833m3()
            if (r2 == 0) goto L_0x039f
            r5 = 2131302510(0x7f09186e, float:1.8223108E38)
            r2.setTag(r5, r4)
        L_0x039f:
            java.lang.String r2 = r0.f16213S0
            java.lang.Object r2 = r1.get(r2)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r2 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r2
            if (r2 != 0) goto L_0x03d5
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r2 = new com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b
            r26 = r2
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 65535(0xffff, float:9.1834E-41)
            r44 = 0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
        L_0x03d5:
            int r4 = r2.f16263b
            if (r4 <= 0) goto L_0x0460
            boolean r4 = r46.mo3814R3()
            if (r4 == 0) goto L_0x0460
            boolean r4 = r46.isSelf()
            if (r4 == 0) goto L_0x03ed
            boolean r4 = r46.isSelfFlag()
            if (r4 == 0) goto L_0x03ed
            r4 = 1
            goto L_0x03ee
        L_0x03ed:
            r4 = 0
        L_0x03ee:
            rx3.g r5 = r0.f16251w
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r5.setVisibility(r14)
            if (r4 == 0) goto L_0x0437
            rx3.g r4 = r0.f16254y
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.app.Activity r5 = r46.getContext()
            android.content.res.Resources r5 = r5.getResources()
            java.lang.Object[] r12 = new java.lang.Object[r7]
            int r2 = r2.f16263b
            long r7 = (long) r2
            java.lang.String r2 = er1.C7878t0.m8035d(r7)
            r12[r14] = r2
            r2 = 2131826508(0x7f11174c, float:1.9285902E38)
            java.lang.String r2 = r5.getString(r2, r12)
            r4.setText(r2)
            rx3.g r2 = r0.f16251w
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            mo1.f0 r4 = new mo1.f0
            r4.<init>(r0)
            r2.setOnClickListener(r4)
            goto L_0x046f
        L_0x0437:
            rx3.g r4 = r0.f16254y
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.app.Activity r5 = r46.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r8 = 1
            java.lang.Object[] r12 = new java.lang.Object[r8]
            int r2 = r2.f16263b
            long r7 = (long) r2
            java.lang.String r2 = er1.C7878t0.m8035d(r7)
            r12[r14] = r2
            r2 = 2131826512(0x7f111750, float:1.928591E38)
            java.lang.String r2 = r5.getString(r2, r12)
            r4.setText(r2)
            goto L_0x046f
        L_0x0460:
            rx3.g r2 = r0.f16251w
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r4 = 8
            r2.setVisibility(r4)
        L_0x046f:
            ye1.e0 r2 = r46.mo3808J3()
            android.view.View r2 = r2.f42899T
            rx3.g r4 = r0.f16249u
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            int r4 = r4.getVisibility()
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.mo10233c(r4)
            java.lang.Object[] r27 = r5.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC"
            java.lang.String r29 = "handleFansLayout"
            java.lang.String r30 = "()V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r2
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r4 = r5.mo10231a(r14)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC"
            java.lang.String r28 = "handleFansLayout"
            java.lang.String r29 = "()V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
            fe1.q r2 = r46.getProfileContact()
            if (r2 != 0) goto L_0x04cc
            goto L_0x06c4
        L_0x04cc:
            android.app.Activity r4 = r46.getContext()
            r5 = 2131304643(0x7f0920c3, float:1.8227434E38)
            android.view.View r4 = r4.findViewById(r5)
            boolean r5 = r46.mo3815T3()
            if (r5 != 0) goto L_0x051b
            if (r4 != 0) goto L_0x04e0
            goto L_0x051b
        L_0x04e0:
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r3)
            java.lang.Object[] r27 = r5.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC"
            java.lang.String r29 = "handleUserDesc"
            java.lang.String r30 = "()V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r4
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r5 = r5.mo10231a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC"
            java.lang.String r28 = "handleUserDesc"
            java.lang.String r29 = "()V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
        L_0x051b:
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r5 = r46.mo3835o3()
            android.app.Activity r7 = r46.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131099800(0x7f060098, float:1.7811963E38)
            int r7 = r7.getColor(r8)
            android.app.Activity r12 = r46.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r12 = r12.getColor(r13)
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r13 = r5.f17600n
            r13.setTextColor(r7)
            android.widget.TextView r5 = r5.f17601o
            r5.setTextColor(r12)
            java.lang.String r5 = r2.field_signature
            if (r5 == 0) goto L_0x0554
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0552
            goto L_0x0554
        L_0x0552:
            r13 = 0
            goto L_0x0555
        L_0x0554:
            r13 = 1
        L_0x0555:
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            r7 = 2131165281(0x7f070061, float:1.7944775E38)
            if (r13 == 0) goto L_0x05fd
            boolean r2 = r46.isSelf()
            if (r2 == 0) goto L_0x05f2
            android.app.Activity r2 = r46.getContext()
            r8 = 2131826453(0x7f111715, float:1.928579E38)
            java.lang.String r2 = r2.getString(r8)
            java.lang.String r8 = "context.getString(R.string.finder_desc_guide)"
            gy3.C87412m.m108593f(r2, r8)
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r8 = r46.mo3835o3()
            r8.setText(r2)
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r8 = r46.mo3835o3()
            r8.getClass()
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r8 = r8.f17600n
            android.text.TextPaint r8 = r8.getPaint()
            float r2 = r8.measureText(r2)
            int r2 = (int) r2
            rx3.g r8 = r0.f16193A
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r8
            r8.setVisibility(r14)
            rx3.g r8 = r0.f16193A
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r8
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            java.lang.String r12 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            gy3.C87412m.m108592e(r8, r12)
            android.widget.FrameLayout$LayoutParams r8 = (android.widget.FrameLayout.LayoutParams) r8
            androidx.appcompat.app.AppCompatActivity r12 = r46.getActivity()
            android.content.res.Resources r12 = r12.getResources()
            float r12 = r12.getDimension(r7)
            int r12 = (int) r12
            int r2 = r2 + r12
            r8.setMarginStart(r2)
            rx3.g r2 = r0.f16193A
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            r2.setLayoutParams(r8)
            androidx.appcompat.app.AppCompatActivity r2 = r46.getActivity()
            android.content.res.Resources r2 = r2.getResources()
            float r2 = r2.getDimension(r7)
            int r2 = (int) r2
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            gy3.C87412m.m108592e(r7, r5)
            android.widget.LinearLayout$LayoutParams r7 = (android.widget.LinearLayout.LayoutParams) r7
            r7.topMargin = r2
            r7.bottomMargin = r14
            r4.setLayoutParams(r7)
            mo1.m0 r2 = new mo1.m0
            r2.<init>(r0)
            r4.setOnClickListener(r2)
            goto L_0x06c4
        L_0x05f2:
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r2 = r46.mo3835o3()
            r12 = 8
            r2.setVisibility(r12)
            goto L_0x06c4
        L_0x05fd:
            r12 = 8
            rx3.g r13 = r0.f16193A
            rx3.n r13 = (rx3.C36570n) r13
            java.lang.Object r13 = r13.getValue()
            com.tencent.mm.ui.widget.imageview.WeImageView r13 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r13
            r13.setVisibility(r12)
            boolean r12 = r46.mo3815T3()
            if (r12 == 0) goto L_0x061f
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r12 = r12.getResources()
            int r8 = r12.getColor(r8)
            goto L_0x062e
        L_0x061f:
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r12 = 2131100738(0x7f060442, float:1.7813866E38)
            int r8 = r8.getColor(r12)
        L_0x062e:
            android.view.ViewGroup$LayoutParams r12 = r4.getLayoutParams()
            gy3.C87412m.m108592e(r12, r5)
            android.widget.LinearLayout$LayoutParams r12 = (android.widget.LinearLayout.LayoutParams) r12
            androidx.appcompat.app.AppCompatActivity r5 = r46.getActivity()
            android.content.res.Resources r5 = r5.getResources()
            float r5 = r5.getDimension(r7)
            int r5 = (int) r5
            r12.topMargin = r5
            r12.bottomMargin = r14
            r4.setLayoutParams(r12)
            java.lang.StringBuilder r5 = r0.mo3820Z3(r2, r8, r14)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "reportNickname.toString()"
            gy3.C87412m.m108593f(r5, r7)
            java.lang.String r2 = r2.getUsername()
            java.lang.String r7 = r0.f16231d1
            boolean r7 = gy3.C87412m.m108589b(r5, r7)
            if (r7 == 0) goto L_0x0665
            goto L_0x0687
        L_0x0665:
            r0.f16231d1 = r5
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 21172(0x52b4, float:2.9668E-41)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "0,1,"
            r12.append(r13)
            r12.append(r5)
            java.lang.String r5 = ",0,"
            r12.append(r5)
            r12.append(r2)
            java.lang.String r2 = r12.toString()
            r7.kvStat(r8, r2)
        L_0x0687:
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r2 = r46.mo3835o3()
            r2.setVisibility(r14)
            r4.setBackgroundResource(r14)
            r4.setPadding(r14, r14, r14, r14)
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r2 = r46.mo3835o3()
            mo1.n0 r4 = new mo1.n0
            r4.<init>(r0)
            r2.setOnExpandBtnClickListener(r4)
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r2 = r46.mo3835o3()
            mo1.o0 r4 = new mo1.o0
            r4.<init>(r0)
            r2.setOnExpandStateChangeListener(r4)
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r2 = r46.mo3835o3()
            mo1.p0 r4 = new mo1.p0
            r4.<init>(r0)
            r2.setOnClickListener(r4)
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r2 = r46.mo3835o3()
            mo1.q0 r4 = new mo1.q0
            r4.<init>(r0)
            r2.setOnLongClickListener(r4)
        L_0x06c4:
            java.lang.String r2 = r0.f16213S0
            java.lang.Object r2 = r1.get(r2)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r2 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r2
            if (r2 != 0) goto L_0x06fa
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r2 = new com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b
            r26 = r2
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 65535(0xffff, float:9.1834E-41)
            r44 = 0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
        L_0x06fa:
            java.util.LinkedList<java.lang.String> r4 = r2.f16264c
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x071f
            rx3.g r4 = r0.f16247s
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 8
            r4.setVisibility(r5)
            rx3.g r4 = r0.f16248t
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r4.setVisibility(r5)
            goto L_0x0739
        L_0x071f:
            rx3.g r4 = r0.f16247s
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setVisibility(r14)
            rx3.g r4 = r0.f16248t
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r4.setVisibility(r14)
        L_0x0739:
            rx3.g r4 = r0.f16247s
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            mo1.r0 r5 = new mo1.r0
            r5.<init>(r0, r2)
            r4.setOnClickListener(r5)
            rx3.g r2 = r0.f16242o
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            rx3.g r4 = r0.f16242o
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x076b
            r8 = r4
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            goto L_0x076c
        L_0x076b:
            r8 = 0
        L_0x076c:
            if (r8 == 0) goto L_0x0798
            boolean r4 = r46.getFragmentMode()
            if (r4 == 0) goto L_0x0786
            android.app.Activity r4 = r46.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r4 = r4.getDimensionPixelOffset(r5)
            r8.rightMargin = r4
            goto L_0x0799
        L_0x0786:
            android.app.Activity r4 = r46.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131165329(0x7f070091, float:1.7944872E38)
            int r4 = r4.getDimensionPixelOffset(r5)
            r8.rightMargin = r4
            goto L_0x0799
        L_0x0798:
            r8 = 0
        L_0x0799:
            r2.setLayoutParams(r8)
            r46.mo3813P3()
            r46.mo3812N3(r47)
            rx3.g r2 = r0.f16249u
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r5 = 0
            r2.setOnClickListener(r5)
            boolean r2 = r46.isSelf()
            if (r2 == 0) goto L_0x07cd
            boolean r2 = r46.isSelfFlag()
            if (r2 == 0) goto L_0x07cd
            rx3.g r2 = r0.f16249u
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r4 = 8
            r2.setVisibility(r4)
            goto L_0x0850
        L_0x07cd:
            java.lang.String r2 = r0.f16213S0
            java.lang.Object r2 = r1.get(r2)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r2 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r2
            if (r2 != 0) goto L_0x0803
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r2 = new com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b
            r26 = r2
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 65535(0xffff, float:9.1834E-41)
            r44 = 0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
        L_0x0803:
            int r4 = r2.f16262a
            if (r4 <= 0) goto L_0x0841
            boolean r4 = r0.f16221W0
            if (r4 == 0) goto L_0x0841
            rx3.g r4 = r0.f16249u
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r4.setVisibility(r14)
            rx3.g r4 = r0.f16250v
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.app.Activity r7 = r46.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131826693(0x7f111805, float:1.9286278E38)
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r12 = r13
            int r2 = r2.f16262a
            java.lang.String r2 = er1.C7878t0.m8039h(r2)
            r12[r14] = r2
            java.lang.String r2 = r7.getString(r8, r12)
            r4.setText(r2)
            goto L_0x0850
        L_0x0841:
            rx3.g r2 = r0.f16249u
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r4 = 8
            r2.setVisibility(r4)
        L_0x0850:
            java.lang.String r2 = r0.f16213S0
            java.lang.Object r2 = r1.get(r2)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r2 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r2
            if (r2 != 0) goto L_0x0886
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r2 = new com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b
            r26 = r2
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 65535(0xffff, float:9.1834E-41)
            r44 = 0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
        L_0x0886:
            int r4 = r2.f16263b
            if (r4 <= 0) goto L_0x089e
            boolean r4 = r46.mo3814R3()
            if (r4 == 0) goto L_0x089e
            rx3.g r2 = r0.f16252x
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.setVisibility(r14)
            goto L_0x08cf
        L_0x089e:
            boolean r4 = r46.isSelf()
            if (r4 == 0) goto L_0x08aa
            boolean r4 = r46.isSelfFlag()
            if (r4 != 0) goto L_0x08c0
        L_0x08aa:
            int r2 = r2.f16262a
            if (r2 <= 0) goto L_0x08c0
            boolean r2 = r0.f16221W0
            if (r2 == 0) goto L_0x08c0
            rx3.g r2 = r0.f16252x
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.setVisibility(r14)
            goto L_0x08cf
        L_0x08c0:
            rx3.g r2 = r0.f16252x
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r4 = 8
            r2.setVisibility(r4)
        L_0x08cf:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r2 = r46.mo3805F3()
            mo1.e0 r4 = new mo1.e0
            r4.<init>(r0)
            r2.post(r4)
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r2.<init>(r4)
            mo1.i0 r4 = new mo1.i0
            r4.<init>(r0)
            r7 = 300(0x12c, double:1.48E-321)
            r2.postDelayed(r4, r7)
            boolean r2 = r46.isSelf()
            if (r2 != 0) goto L_0x0919
            boolean r2 = r46.isSelfFlag()
            if (r2 != 0) goto L_0x0919
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99376d2
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 <= 0) goto L_0x0919
            boolean r2 = r0.f16221W0
            if (r2 == 0) goto L_0x0919
            boolean r2 = r46.mo3815T3()
            if (r2 != 0) goto L_0x0919
            r2 = 1
            goto L_0x091a
        L_0x0919:
            r2 = 0
        L_0x091a:
            java.lang.String r12 = "onCreate"
            if (r2 == 0) goto L_0x0985
            ye1.e0 r2 = r46.mo3808J3()
            android.widget.TextView r2 = r2.f42896Q
            java.lang.String r4 = "profileHeaderUiBinding.finderProfileSendMsgBtnTv"
            gy3.C87412m.m108593f(r2, r4)
            android.text.TextPaint r2 = r2.getPaint()
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r2, r4)
            boolean r2 = gy3.C87412m.m108589b(r9, r12)
            if (r2 == 0) goto L_0x094d
            ye1.e0 r2 = r46.mo3808J3()
            android.widget.FrameLayout r2 = r2.f42933n0
            java.lang.String r4 = "profileHeaderUiBinding.sendMsgBtn"
            gy3.C87412m.m108593f(r2, r4)
            mo1.j0 r4 = new mo1.j0
            r4.<init>(r0)
            zp3.C23564m.m28138h(r2, r4)
            goto L_0x0976
        L_0x094d:
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99335Y2
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r4 = 1
            if (r2 != r4) goto L_0x096d
            ye1.e0 r2 = r46.mo3808J3()
            android.widget.FrameLayout r2 = r2.f42933n0
            r4 = 8
            r2.setVisibility(r4)
            goto L_0x0976
        L_0x096d:
            ye1.e0 r2 = r46.mo3808J3()
            android.widget.FrameLayout r2 = r2.f42933n0
            r2.setVisibility(r14)
        L_0x0976:
            ye1.e0 r2 = r46.mo3808J3()
            android.widget.FrameLayout r2 = r2.f42933n0
            mo1.k0 r4 = new mo1.k0
            r4.<init>(r0)
            r2.setOnClickListener(r4)
            goto L_0x0990
        L_0x0985:
            ye1.e0 r2 = r46.mo3808J3()
            android.widget.FrameLayout r2 = r2.f42933n0
            r4 = 8
            r2.setVisibility(r4)
        L_0x0990:
            java.lang.String r2 = r0.f16213S0
            java.lang.Object r1 = r1.get(r2)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r1 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r1
            if (r1 == 0) goto L_0x09a2
            te3.ep1 r1 = r1.f16271j
            if (r1 == 0) goto L_0x09a2
            java.lang.String r1 = r1.f133047d
            if (r1 != 0) goto L_0x09a4
        L_0x09a2:
            r1 = r23
        L_0x09a4:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x0a02
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r2.<init>()
            r4 = 3
            r2.jumpinfo_type = r4
            com.tencent.mm.protocal.protobuf.NativeInfo r4 = new com.tencent.mm.protocal.protobuf.NativeInfo
            r4.<init>()
            r7 = 7
            r4.native_type = r7
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r8 = "kf_url"
            r7.put(r8, r1)
            java.lang.String r1 = r7.toString()
            r4.necessary_params = r1
            r2.native_info = r4
            pf1.q r1 = new pf1.q
            r1.<init>(r2)
            fe1.q r2 = r46.getProfileContact()
            r1.f34835i = r2
            ye1.e0 r2 = r46.mo3808J3()
            android.widget.FrameLayout r2 = r2.f42933n0
            r2.setVisibility(r14)
            ye1.e0 r2 = r46.mo3808J3()
            android.widget.TextView r2 = r2.f42896Q
            android.app.Activity r4 = r46.getContext()
            r7 = 2131829682(0x7f1123b2, float:1.929234E38)
            java.lang.String r4 = r4.getString(r7)
            r2.setText(r4)
            ye1.e0 r2 = r46.mo3808J3()
            android.widget.FrameLayout r2 = r2.f42933n0
            mo1.l0 r4 = new mo1.l0
            r4.<init>(r0, r1)
            r2.setOnClickListener(r4)
        L_0x0a02:
            android.view.View r1 = r0.f16238h
            r2 = 2131311413(0x7f093b35, float:1.8241166E38)
            android.view.View r1 = r1.findViewById(r2)
            android.content.Intent r2 = r46.getIntent()
            java.lang.String r4 = "key_same_receive_link"
            java.lang.String r2 = r2.getStringExtra(r4)
            android.content.Intent r4 = r46.getIntent()
            java.lang.String r7 = "key_enter_from_story"
            boolean r4 = r4.getBooleanExtra(r7, r14)
            android.content.Intent r7 = r46.getIntent()
            java.lang.String r8 = "key_packet_id"
            java.lang.String r7 = r7.getStringExtra(r8)
            if (r7 != 0) goto L_0x0a2d
            r7 = r23
        L_0x0a2d:
            android.content.Intent r8 = r46.getIntent()
            java.lang.String r5 = "key_extra_info"
            java.lang.String r5 = r8.getStringExtra(r5)
            if (r5 != 0) goto L_0x0a3b
            r5 = r23
        L_0x0a3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r13 = "[handleLuckMoneyCoverLayout] forbid:"
            r8.append(r13)
            rx3.g r13 = r0.f16227Z0
            rx3.n r13 = (rx3.C36570n) r13
            java.lang.Object r13 = r13.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r8.append(r13)
            java.lang.String r13 = " redPackId:"
            r8.append(r13)
            r8.append(r7)
            java.lang.String r13 = " url:"
            r8.append(r13)
            r8.append(r2)
            java.lang.String r13 = " extraInfo:"
            r8.append(r13)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            if (r2 == 0) goto L_0x0a80
            int r8 = r2.length()
            if (r8 != 0) goto L_0x0a7e
            goto L_0x0a80
        L_0x0a7e:
            r8 = 0
            goto L_0x0a81
        L_0x0a80:
            r8 = 1
        L_0x0a81:
            if (r8 != 0) goto L_0x0b1e
            rx3.g r8 = r0.f16227Z0
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0a95
            goto L_0x0b1e
        L_0x0a95:
            r8 = 2131311414(0x7f093b36, float:1.8241168E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0aa7
            android.text.TextPaint r8 = r8.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r8)
        L_0x0aa7:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0aad }
            r8.<init>(r5)     // Catch:{ JSONException -> 0x0aad }
            goto L_0x0ab2
        L_0x0aad:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
        L_0x0ab2:
            java.lang.String r5 = "red_cover_id"
            r8.put(r5, r7)
            java.lang.String r5 = r0.f16213S0
            java.lang.String r7 = "finderusername"
            r8.put(r7, r5)
            java.lang.String r5 = "red_cover_type"
            r7 = 1
            r8.put(r5, r7)
            if (r4 == 0) goto L_0x0ac8
            r4 = 2
            goto L_0x0ac9
        L_0x0ac8:
            r4 = 1
        L_0x0ac9:
            java.lang.String r5 = "red_entrance_type"
            r8.put(r5, r4)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r4.mo10233c(r3)
            java.lang.Object[] r27 = r4.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC"
            java.lang.String r29 = "handleLuckMoneyCoverLayout"
            java.lang.String r30 = "()V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r1
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r3 = r4.mo10231a(r14)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC"
            java.lang.String r28 = "handleLuckMoneyCoverLayout"
            java.lang.String r29 = "()V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
            mo1.g0 r3 = new mo1.g0
            r3.<init>(r2, r0, r8)
            r1.setOnClickListener(r3)
            mo1.h0 r2 = new mo1.h0
            r2.<init>(r0, r8)
            zp3.C23564m.m28138h(r1, r2)
            r8 = 8
            goto L_0x0b60
        L_0x0b1e:
            r7 = 1
            k20.a r2 = new k20.a
            r2.<init>()
            r8 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2.mo10233c(r3)
            java.lang.Object[] r27 = r2.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC"
            java.lang.String r29 = "handleLuckMoneyCoverLayout"
            java.lang.String r30 = "()V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r1
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r2 = r2.mo10231a(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC"
            java.lang.String r28 = "handleLuckMoneyCoverLayout"
            java.lang.String r29 = "()V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
        L_0x0b60:
            oo1.e r1 = r0.f16218V
            if (r1 == 0) goto L_0x0e5d
            java.lang.String r3 = r0.f16213S0
            boolean r4 = r0.f16230c1
            boolean r5 = r46.isSelf()
            boolean r13 = r46.isSelfFlag()
            fe1.q r16 = r46.getProfileContact()
            if (r48 != 0) goto L_0x0b79
            r17 = r23
            goto L_0x0b7b
        L_0x0b79:
            r17 = r48
        L_0x0b7b:
            r2 = r47
            r45 = r6
            r6 = r13
            r13 = 1
            r7 = r16
            r8 = r17
            r1.mo11535g(r2, r3, r4, r5, r6, r7, r8)
            oo1.u r1 = r0.f16212S
            if (r1 == 0) goto L_0x0e56
            java.lang.String r2 = r0.f16213S0
            fe1.q r3 = r46.getProfileContact()
            java.lang.String r4 = "username"
            gy3.C87412m.m108594g(r2, r4)
            sg.i<java.lang.String, com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b> r5 = f16192h1
            java.lang.Object r2 = r5.get(r2)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r2 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r2
            if (r2 != 0) goto L_0x0bce
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r2 = new com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b
            r24 = r2
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 65535(0xffff, float:9.1834E-41)
            r42 = 0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
        L_0x0bce:
            di3.d r6 = di3.C86312j.m106911c(r10)
            ht1.v4 r6 = (ht1.C8808v4) r6
            boolean r6 = r6.mo9635e()
            te3.vg0 r2 = r2.f16267f
            if (r2 == 0) goto L_0x0c6f
            java.util.LinkedList<te3.cg> r2 = r2.f143474d
            if (r2 == 0) goto L_0x0c6f
            boolean r7 = r2.isEmpty()
            r7 = r7 ^ r13
            if (r7 == 0) goto L_0x0beb
            if (r6 != 0) goto L_0x0beb
            r7 = 1
            goto L_0x0bec
        L_0x0beb:
            r7 = 0
        L_0x0bec:
            if (r7 == 0) goto L_0x0bef
            goto L_0x0bf0
        L_0x0bef:
            r2 = 0
        L_0x0bf0:
            if (r2 == 0) goto L_0x0c6f
            java.lang.Object r6 = r2.get(r14)
            te3.cg r6 = (te3.C64284cg) r6
            java.lang.String r6 = r6.f182468d
            if (r6 == 0) goto L_0x0c05
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0c03
            goto L_0x0c05
        L_0x0c03:
            r7 = 0
            goto L_0x0c06
        L_0x0c05:
            r7 = 1
        L_0x0c06:
            r6 = r7 ^ 1
            if (r6 == 0) goto L_0x0c0b
            goto L_0x0c0c
        L_0x0c0b:
            r2 = 0
        L_0x0c0c:
            if (r2 == 0) goto L_0x0c6f
            java.lang.Object r2 = r2.get(r14)
            te3.cg r2 = (te3.C64284cg) r2
            if (r2 == 0) goto L_0x0c6f
            rx3.g r6 = r1.f34233c
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            java.lang.String r7 = "finderMediaEntrance"
            gy3.C87412m.m108593f(r6, r7)
            oo1.v r7 = new oo1.v
            r7.<init>(r3, r2, r1)
            zp3.C23564m.m28138h(r6, r7)
            rx3.g r6 = r1.f34233c
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r6.setVisibility(r14)
            rx3.g r6 = r1.f34234d
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            android.widget.TextView r6 = (android.widget.TextView) r6
            androidx.appcompat.app.AppCompatActivity r7 = r1.f34231a
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object[] r8 = new java.lang.Object[r13]
            java.lang.String r13 = r2.f182469e
            r8[r14] = r13
            r13 = 2131829596(0x7f11235c, float:1.9292166E38)
            java.lang.String r7 = r7.getString(r13, r8)
            r6.setText(r7)
            rx3.g r6 = r1.f34233c
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            oo1.w r7 = new oo1.w
            r7.<init>(r3, r2, r1)
            r6.setOnClickListener(r7)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0c70
        L_0x0c6f:
            r2 = 0
        L_0x0c70:
            if (r2 != 0) goto L_0x0c82
            rx3.g r1 = r1.f34233c
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r2 = 8
            r1.setVisibility(r2)
            goto L_0x0c84
        L_0x0c82:
            r2 = 8
        L_0x0c84:
            oo1.x r1 = r0.f16214T
            if (r1 == 0) goto L_0x0e4f
            java.lang.String r3 = r0.f16213S0
            fe1.q r6 = r46.getProfileContact()
            gy3.C87412m.m108594g(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "[handleMIniProgramList] source:"
            r4.append(r7)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r7 = r45
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            java.lang.Object r4 = r5.get(r3)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r4 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r4
            if (r4 == 0) goto L_0x0cb6
            te3.vg0 r4 = r4.f16267f
            if (r4 == 0) goto L_0x0cb6
            java.util.LinkedList<te3.lc1> r5 = r4.f143475e
            goto L_0x0cb7
        L_0x0cb6:
            r5 = 0
        L_0x0cb7:
            di3.d r4 = di3.C86312j.m106911c(r10)
            ht1.v4 r4 = (ht1.C8808v4) r4
            boolean r4 = r4.mo9635e()
            rx3.g r8 = r1.f34248c
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r8.setVisibility(r2)
            if (r5 == 0) goto L_0x0cd9
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L_0x0cd7
            goto L_0x0cd9
        L_0x0cd7:
            r8 = 0
            goto L_0x0cda
        L_0x0cd9:
            r8 = 1
        L_0x0cda:
            if (r8 != 0) goto L_0x0ce0
            if (r4 != 0) goto L_0x0ce0
            r4 = 1
            goto L_0x0ce1
        L_0x0ce0:
            r4 = 0
        L_0x0ce1:
            if (r4 == 0) goto L_0x0ce4
            goto L_0x0ce5
        L_0x0ce4:
            r5 = 0
        L_0x0ce5:
            if (r5 == 0) goto L_0x0d6c
            boolean r4 = gy3.C87412m.m108589b(r15, r9)
            if (r4 == 0) goto L_0x0d23
            java.lang.Class<dp1.y0> r4 = dp1.C58417y0.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            r24 = r4
            dp1.y0 r24 = (dp1.C58417y0) r24
            r25 = 5
            java.lang.Object r4 = r5.get(r14)
            te3.lc1 r4 = (te3.C50242lc1) r4
            java.lang.String r4 = r4.f137297d
            if (r4 != 0) goto L_0x0d06
            r28 = r23
            goto L_0x0d08
        L_0x0d06:
            r28 = r4
        L_0x0d08:
            bl3.r r4 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r8 = r1.f34246a
            bl3.r$a r4 = r4.mo62444c(r8)
            java.lang.Class<rs1.s8> r8 = rs1.C13442s8.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r8)
            rs1.s8 r4 = (rs1.C13442s8) r4
            te3.hj1 r29 = r4.mo12861q3()
            java.lang.String r27 = ""
            r26 = r3
            r24.xy0(r25, r26, r27, r28, r29)
        L_0x0d23:
            rx3.g r4 = r1.f34249d
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            androidx.appcompat.app.AppCompatActivity r8 = r1.f34246a
            android.content.res.Resources r8 = r8.getResources()
            r10 = 2131829645(0x7f11238d, float:1.9292265E38)
            r13 = 1
            java.lang.Object[] r15 = new java.lang.Object[r13]
            java.lang.Object r13 = r5.get(r14)
            te3.lc1 r13 = (te3.C50242lc1) r13
            java.lang.String r13 = r13.f137299f
            r15[r14] = r13
            java.lang.String r8 = r8.getString(r10, r15)
            r4.setText(r8)
            rx3.g r4 = r1.f34248c
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            oo1.y r8 = new oo1.y
            r8.<init>(r3, r5, r1, r6)
            r4.setOnClickListener(r8)
            rx3.g r3 = r1.f34248c
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r3.setVisibility(r14)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x0d6d
        L_0x0d6c:
            r5 = 0
        L_0x0d6d:
            if (r5 != 0) goto L_0x0d7c
            rx3.g r1 = r1.f34248c
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r2)
        L_0x0d7c:
            oo1.a r1 = r0.f16216U
            if (r1 == 0) goto L_0x0e48
            java.lang.String r3 = r0.f16213S0
            boolean r4 = r0.f16230c1
            boolean r5 = r46.isSelf()
            boolean r6 = r46.isSelfFlag()
            r2 = r47
            r1.mo11518c(r2, r3, r4, r5, r6)
            r1 = 0
            r2 = 1
            m3563Q3(r0, r1, r2, r1)
            oo1.d r2 = r0.f16210R
            if (r2 == 0) goto L_0x0e42
            java.lang.String r3 = r0.f16213S0
            fe1.q r4 = r46.getProfileContact()
            r2.mo11523c(r3, r4)
            oo1.c r2 = r0.f16224Y
            if (r2 == 0) goto L_0x0e3c
            java.lang.String r3 = r0.f16213S0
            r2.mo11521a(r3)
            er1.j4 r2 = er1.C58739j4.f168176a
            fe1.d$b r3 = fe1.C58961d.f168673a
            java.lang.String r4 = r0.f16213S0
            fe1.q r3 = r3.mo84155b(r4)
            boolean r2 = r2.mo83680I(r3)
            r0.mo3819Y3(r2, r9)
            bl3.r r2 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r3 = r46.getActivity()
            bl3.r$a r2 = r2.mo62444c(r3)
            java.lang.Class<mo1.s1> r3 = mo1.C61526s1.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            mo1.s1 r2 = (mo1.C61526s1) r2
            fe1.q r3 = r46.getProfileContact()
            r2.mo86480c3(r3)
            io1.a r2 = r0.f16223X0
            di3.d r3 = di3.C86312j.m106911c(r11)
            ny.h r3 = (p629ny.C76979h) r3
            android.view.View r4 = r0.f16238h
            android.content.Context r4 = r4.getContext()
            fe1.q r5 = r46.getProfileContact()
            if (r5 == 0) goto L_0x0def
            java.lang.String r5 = r5.mo84196w1()
            goto L_0x0df0
        L_0x0def:
            r5 = r1
        L_0x0df0:
            android.text.SpannableString r3 = r3.mo107057T1(r4, r5)
            java.lang.String r4 = r46.mo3809K3()
            boolean r5 = gy3.C87412m.m108589b(r12, r9)
            r2.mo10019b(r3, r4, r5)
            r46.mo3810L3()
            r46.mo3817V3()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[refreshProfile] nickname:"
            r2.append(r3)
            fe1.q r3 = r46.getProfileContact()
            if (r3 == 0) goto L_0x0e1a
            java.lang.String r5 = r3.mo84196w1()
            goto L_0x0e1b
        L_0x0e1a:
            r5 = r1
        L_0x0e1b:
            r2.append(r5)
            java.lang.String r1 = " COST="
            r2.append(r1)
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r18
            r2.append(r3)
            java.lang.String r1 = "ms source="
            r2.append(r1)
            r2.append(r9)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            return
        L_0x0e3c:
            java.lang.String r2 = "belongWidget"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0e42:
            java.lang.String r2 = "enterpriseAdd"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0e48:
            r1 = 0
            java.lang.String r2 = "activityWidget"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0e4f:
            r1 = 0
            java.lang.String r2 = "miniProgram"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0e56:
            r1 = 0
            java.lang.String r2 = "mediaEntrance"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0e5d:
            r1 = 0
            java.lang.String r2 = "liveWidget"
            gy3.C87412m.m108603p(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.mo3818W3(java.lang.String, java.lang.String):void");
    }

    /* renamed from: Y3 */
    public final void mo3819Y3(boolean z, String str) {
        if (z) {
            ((WeImageView) ((C36570n) this.f16203K).getValue()).setVisibility(0);
        } else {
            ((WeImageView) ((C36570n) this.f16203K).getValue()).setVisibility(8);
        }
        if (!C87412m.m108589b(str, "onCreate")) {
            C9228a aVar = this.f16223X0;
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Context context = this.f16238h.getContext();
            C58969q profileContact = getProfileContact();
            aVar.mo10019b(hVar.mo107057T1(context, profileContact != null ? profileContact.mo84196w1() : null), mo3809K3(), false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057  */
    /* renamed from: Z3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.StringBuilder mo3820Z3(fe1.C58969q r13, int r14, boolean r15) {
        /*
            r12 = this;
            java.lang.String r0 = r13.field_signature
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            r0 = r1
        L_0x0007:
            r2 = 0
            if (r15 == 0) goto L_0x001b
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$a r3 = r12.f16211R0
            if (r3 == 0) goto L_0x0011
            java.lang.String r3 = r3.f16257a
            goto L_0x0012
        L_0x0011:
            r3 = r2
        L_0x0012:
            boolean r3 = gy3.C87412m.m108589b(r3, r0)
            if (r3 == 0) goto L_0x001b
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$a r0 = r12.f16211R0
            goto L_0x002f
        L_0x001b:
            if (r15 != 0) goto L_0x002e
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$a r3 = r12.f16209Q0
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = r3.f16257a
            goto L_0x0025
        L_0x0024:
            r3 = r2
        L_0x0025:
            boolean r0 = gy3.C87412m.m108589b(r3, r0)
            if (r0 == 0) goto L_0x002e
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$a r0 = r12.f16209Q0
            goto L_0x002f
        L_0x002e:
            r0 = r2
        L_0x002f:
            if (r0 == 0) goto L_0x0057
            android.text.SpannableString r13 = r0.f16258b
            if (r13 == 0) goto L_0x004b
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r14 = r12.mo3835o3()
            r14.setText(r13)
            er1.w3 r14 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r15 = r12.mo3835o3()
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r15 = r15.getContentTextView()
            r14.mo83876I1(r15, r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x004b:
            if (r2 != 0) goto L_0x0054
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r13 = r12.mo3835o3()
            r13.setText(r1)
        L_0x0054:
            java.lang.StringBuilder r13 = r0.f16259c
            return r13
        L_0x0057:
            android.app.Activity r0 = r12.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131826339(0x7f1116a3, float:1.928556E38)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = r13.field_signature
            r2[r3] = r4
            java.lang.String r0 = r0.getString(r1, r2)
            java.lang.String r1 = "context.resources.getStr… contact.field_signature)"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            android.app.Activity r2 = r12.getContext()
            r3 = 0
            android.text.SpannableString r1 = r1.Te0(r2, r0, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            boolean r3 = r12.mo3815T3()
            if (r3 == 0) goto L_0x009f
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r3 = r3.getColor(r4)
            goto L_0x00ae
        L_0x009f:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131099665(0x7f060011, float:1.781169E38)
            int r3 = r3.getColor(r4)
        L_0x00ae:
            r7 = r3
            er1.t r3 = er1.C58775t.f168276a
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$y0 r11 = new com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$y0
            r4 = r11
            r5 = r1
            r6 = r14
            r8 = r2
            r9 = r12
            r10 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3.mo83826g(r0, r11)
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r14 = r12.mo3835o3()
            r14.setText(r1)
            er1.w3 r14 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r0 = r12.mo3835o3()
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r0 = r0.getContentTextView()
            java.lang.String r3 = "signatureSpan"
            gy3.C87412m.m108593f(r1, r3)
            r14.mo83876I1(r0, r1)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$a r14 = new com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$a
            java.lang.String r13 = r13.field_signature
            java.lang.String r0 = "contact.field_signature"
            gy3.C87412m.m108593f(r13, r0)
            r14.<init>(r13, r1, r2)
            if (r15 == 0) goto L_0x00ea
            r12.f16211R0 = r14
            goto L_0x00ec
        L_0x00ea:
            r12.f16209Q0 = r14
        L_0x00ec:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.mo3820Z3(fe1.q, int, boolean):java.lang.StringBuilder");
    }

    /* renamed from: a4 */
    public final void mo3821a4() {
        mo3806G3().setVisibility(8);
        mo3831k3().setVisibility(8);
        TextView textView = mo3808J3().f42884E;
        C87412m.m108593f(textView, "profileHeaderUiBinding.finderProfileFollowBtnTv");
        C37521f.f99374d.getClass();
        if (C37521f.f99570y7.mo60266n().intValue() == 1) {
            mo3830j3().setTextColor(getResources().getColor(C0966R.color.f2975b6));
            textView.setTextColor(getResources().getColor(C0966R.color.f2975b6));
            return;
        }
        mo3830j3().setTextColor(getResources().getColor(C0966R.color.FG_0_5));
        textView.setTextColor(getResources().getColor(C0966R.color.FG_0_5));
    }

    /* renamed from: d3 */
    public final C3463b mo3822d3(C9377s4 s4Var) {
        LinkedList<C50955qg0> linkedList;
        T t;
        boolean z;
        C9377s4 s4Var2 = s4Var;
        C3463b bVar = (C3463b) f16192h1.get(this.f16213S0);
        if (bVar == null) {
            bVar = new C3463b(0, 0, (LinkedList) null, (C49098d51) null, (C50019jp1) null, (C51691vg0) null, (C52271zj0) null, (C0264h) null, (C50428mo1) null, (C49316ep1) null, (C49236e51) null, (List) null, (C51869ws0) null, (C51583uq0) null, (C51810wb1) null, (C51583uq0) null, 65535, (C8480h) null);
        }
        bVar.f16263b = s4Var2.f29289v;
        bVar.f16262a = s4Var2.f29288u;
        LinkedList<String> linkedList2 = s4Var2.f29287t;
        C87412m.m108594g(linkedList2, "<set-?>");
        bVar.f16264c = linkedList2;
        C11625e eVar = this.f16218V;
        C49316ep1 ep12 = null;
        if (eVar != null) {
            C47465a aVar = s4Var2.f29282o.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
            C49098d51 d512 = ((FinderUserPageResponse) aVar).liveNoticeInfo;
            int i = eVar.f34106t;
            if (!(i == -1 || eVar.f34105s == -1)) {
                if (d512 != null && d512.f132119e == i) {
                    Log.m105924i("Finder.FinderProfileHeaderUIC", "[checkLiveNoticeInfo] notice action change before sceneEnd");
                    d512.f132119e = eVar.f34105s;
                }
            }
            bVar.f16265d = d512;
            C47465a aVar2 = s4Var2.f29282o.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
            bVar.f16266e = ((FinderUserPageResponse) aVar2).wxaShopInfo;
            C47465a aVar3 = s4Var2.f29282o.f127056b.f127083a;
            C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
            bVar.f16267f = ((FinderUserPageResponse) aVar3).biz_info;
            C47465a aVar4 = s4Var2.f29282o.f127056b.f127083a;
            C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
            LinkedList<C52271zj0> linkedList3 = ((FinderUserPageResponse) aVar4).eventInfoList;
            bVar.f16268g = linkedList3 != null ? (C52271zj0) C110818d0.m150916N(linkedList3) : null;
            bVar.f16269h = C66785b.f191882e.mo90663P2(this.f16213S0);
            C47465a aVar5 = s4Var2.f29282o.f127056b.f127083a;
            C87412m.m108592e(aVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
            bVar.f16270i = ((FinderUserPageResponse) aVar5).poi_info;
            C47465a aVar6 = s4Var2.f29282o.f127056b.f127083a;
            C87412m.m108592e(aVar6, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
            FinderContact finderContact = ((FinderUserPageResponse) aVar6).contact;
            if (!(finderContact == null || (linkedList = finderContact.bind_info) == null)) {
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C50955qg0) t).f140290d == 2) {
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
                C50955qg0 qg02 = (C50955qg0) t;
                if (qg02 != null) {
                    ep12 = qg02.f140292f;
                }
            }
            bVar.f16271j = ep12;
            C47465a aVar7 = s4Var2.f29282o.f127056b.f127083a;
            C87412m.m108592e(aVar7, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
            bVar.f16272k = ((FinderUserPageResponse) aVar7).live_notice_list_info;
            C47465a aVar8 = s4Var2.f29282o.f127056b.f127083a;
            C87412m.m108592e(aVar8, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
            LinkedList<FinderJumpInfo> linkedList4 = ((FinderUserPageResponse) aVar8).jump_info;
            C87412m.m108593f(linkedList4, "rr.responseProtoBuf as F…erPageResponse).jump_info");
            bVar.f16273l = linkedList4;
            C47465a aVar9 = s4Var2.f29282o.f127056b.f127083a;
            C87412m.m108592e(aVar9, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
            bVar.f16274m = ((FinderUserPageResponse) aVar9).anchor_stat;
            C47465a aVar10 = s4Var2.f29282o.f127056b.f127083a;
            C87412m.m108592e(aVar10, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
            bVar.f16275n = ((FinderUserPageResponse) aVar10).ip_region_info;
            C47465a aVar11 = s4Var2.f29282o.f127056b.f127083a;
            C87412m.m108592e(aVar11, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
            bVar.f16277p = ((FinderUserPageResponse) aVar11).attr_region_info;
            C47465a aVar12 = s4Var2.f29282o.f127056b.f127083a;
            C87412m.m108592e(aVar12, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
            bVar.f16276o = ((FinderUserPageResponse) aVar12).mcn_info;
            f16192h1.put(this.f16213S0, bVar);
            return bVar;
        }
        C87412m.m108603p("liveWidget");
        throw null;
    }

    /* renamed from: e3 */
    public final void mo3823e3(boolean z, boolean z2) {
        this.f16237g1 = new C3492p(this, z2);
        ((C3601l1) C86312j.m106911c(C3601l1.class)).Hu0(this.f16213S0, z, this.f16237g1);
    }

    /* renamed from: g3 */
    public final void mo3824g3(boolean z) {
        C89137b0 d = C86709a0.m107524d();
        C9377s4 s4Var = r1;
        C9377s4 s4Var2 = new C9377s4(this.f16213S0, 0, (C89349b) null, 0, getContextObj(), 0, 0, false, (String) null, 0, (Integer) null, (Long) null, (String) null, false, false, (Long) null, 65518, (C8480h) null);
        C9377s4 s4Var3 = s4Var;
        s4Var3.f29279i = z;
        d.mo123460f(s4Var3);
    }

    public final C49712hj1 getContextObj() {
        return (C49712hj1) this.f16219V0.getValue();
    }

    public final C58969q getProfileContact() {
        return C58961d.f168673a.mo84155b(this.f16213S0);
    }

    /* renamed from: i3 */
    public final LinearLayout mo3827i3() {
        return (LinearLayout) this.f16200H.getValue();
    }

    public final boolean isSelf() {
        return C66785b.f191882e.mo90677q1(this.f16213S0);
    }

    public final boolean isSelfFlag() {
        return ((Boolean) this.f16244p0.getValue()).booleanValue();
    }

    /* renamed from: j3 */
    public final TextView mo3830j3() {
        return (TextView) this.f16202J.getValue();
    }

    /* renamed from: k3 */
    public final WeImageView mo3831k3() {
        return (WeImageView) this.f16201I.getValue();
    }

    /* renamed from: l3 */
    public final TextView mo3832l3() {
        return (TextView) this.f16197E.getValue();
    }

    /* renamed from: m3 */
    public final LinearLayout mo3833m3() {
        return (LinearLayout) this.f16194B.getValue();
    }

    /* renamed from: n3 */
    public final LinearLayout mo3834n3() {
        return (LinearLayout) this.f16195C.getValue();
    }

    /* renamed from: o3 */
    public final CollapsibleTextView mo3835o3() {
        return (CollapsibleTextView) this.f16256z.getValue();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String path;
        int i3;
        String str2;
        String stringExtra;
        int i4 = i;
        Intent intent2 = intent;
        Class cls = C61381b.class;
        Class cls2 = C7138g.class;
        super.onActivityResult(i, i2, intent);
        if (intent2 != null) {
            C13598b0 b0Var = null;
            if (i4 != 100) {
                String str3 = "";
                boolean z = true;
                int i5 = 0;
                switch (i4) {
                    case 10006:
                        Log.m105918d("Finder.FinderProfileHeaderUIC", "onActivityResult CONTEXT_MENU_IMAGE_BROUND");
                        Uri data = intent.getData();
                        if (!(data == null || (path = data.getPath()) == null)) {
                            str3 = path;
                        }
                        if (str3.length() == 0) {
                            Log.m105928w("Finder.FinderProfileHeaderUIC", "filePath is null.try to getResultPhotoPath.");
                            String g6 = ((C7138g) C86312j.m106911c(cls2)).mo8319g6(getActivity().getApplicationContext(), intent2, C58741j5.f168192i);
                            C87412m.m108593f(g6, "getService(ITakePhotoSer…athRouter.FINDER_TMP_DIR)");
                            str = g6;
                        } else {
                            str = str3;
                        }
                        Log.m105924i("Finder.FinderProfileHeaderUIC", "filePath[" + str + "] " + intent2);
                        if (str.length() != 0) {
                            z = false;
                        }
                        if (z) {
                            Log.m105920e("Finder.FinderProfileHeaderUIC", "filePath is null.");
                            return;
                        }
                        AppCompatActivity activity = getActivity();
                        byte[] bytes = (str + System.currentTimeMillis()).getBytes(C119027c.f356488a);
                        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                        String f = C90193h.m112878f(bytes);
                        C87412m.m108593f(f, "getMessageDigest((filePa…eMillis()).toByteArray())");
                        ((C61381b) C86312j.m106911c(cls)).Yp0().mo88201l(activity, intent, str, f, 10008);
                        return;
                    case CdnLogic.kMediaTypeFavoriteBigFile /*10007*/:
                        Log.m105918d("Finder.FinderProfileHeaderUIC", "onActivityResult MENU_ID_SET_HEADIMG_TAKEPHOTO");
                        Context applicationContext = getActivity().getApplicationContext();
                        String str4 = C58741j5.f168192i;
                        String g64 = ((C7138g) C86312j.m106911c(cls2)).mo8319g6(applicationContext, intent2, str4);
                        if (g64 == null) {
                            Log.m105920e("Finder.FinderProfileHeaderUIC", "filePath is null.");
                            return;
                        }
                        Intent intent3 = new Intent();
                        intent3.putExtra("CropImageMode", 1);
                        intent3.putExtra("CropImage_ImgPath", g64);
                        byte[] bytes2 = (g64 + System.currentTimeMillis()).getBytes(C119027c.f356488a);
                        C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
                        String f2 = C90193h.m112878f(bytes2);
                        StringBuilder sb = new StringBuilder();
                        sb.append(str4);
                        C87412m.m108591d(f2);
                        sb.append(f2);
                        intent3.putExtra("CropImage_OutputPath", sb.toString());
                        intent3.setClassName(getActivity(), "com.tencent.mm.ui.tools.CropImageNewUI");
                        Activity context = getContext();
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(10008);
                        aVar.mo10233c(intent3);
                        C117292a.m165364j(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC", "onActivityResult", "(IILandroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                        return;
                    case 10008:
                        Log.m105918d("Finder.FinderProfileHeaderUIC", "onActivityResult REQUEST_CODE_IMAGE_BROUND_SEND_COMFIRM");
                        String stringExtra2 = intent2.getStringExtra("key_result_img_path");
                        if (stringExtra2 == null || !C86013q1.m106450k(stringExtra2)) {
                            Log.m105920e("Finder.FinderProfileHeaderUIC", "ERROR! filePath=" + stringExtra2);
                            return;
                        }
                        Log.m105918d("Finder.FinderProfileHeaderUIC", "REQUEST_CODE_IMAGE_BROUND_SEND_COMFIRM " + stringExtra2);
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MY_FINDER_LOCAL_COVER_IMG_STRING_SYNC, stringExtra2);
                        ((C61381b) C86312j.m106911c(cls)).mo78545UQ().mo12416i(stringExtra2, this.f16213S0, new C3489n0(this));
                        return;
                    case 10009:
                        C58961d.C58963b bVar = C58961d.f168673a;
                        C66785b bVar2 = C66785b.f191882e;
                        C58969q b = bVar.mo84155b(bVar2.mo90662O5());
                        String stringExtra3 = intent2.getStringExtra("Country");
                        if (stringExtra3 == null) {
                            stringExtra3 = str3;
                        }
                        String stringExtra4 = intent2.getStringExtra("Contact_Province");
                        String str5 = stringExtra4 == null ? str3 : stringExtra4;
                        String stringExtra5 = intent2.getStringExtra("Contact_City");
                        if (stringExtra5 == null) {
                            stringExtra5 = str3;
                        }
                        Log.m105924i("Finder.FinderProfileHeaderUIC", "countryCode " + stringExtra3 + " provinceCode" + str5 + " cityCode" + stringExtra5);
                        if (C87412m.m108589b(stringExtra3, "unshow")) {
                            String str6 = b != null ? b.field_username : null;
                            if (str6 == null) {
                                str6 = str3;
                            }
                            C54446b a = C66783a.C66784a.m78798a(bVar2, str6, false, 2, (Object) null);
                            if (a != null) {
                                i5 = a.field_extFlag;
                            }
                            int i6 = i5 & -5;
                            String str7 = b != null ? b.field_username : null;
                            if (str7 == null) {
                                str7 = str3;
                            }
                            C54447c cVar = new C54447c(str7);
                            cVar.field_extFlag = i6;
                            bVar2.mo90672m1(cVar, C39759i.MODIFY_USER);
                            str2 = str3;
                            i3 = 1;
                        } else {
                            str2 = stringExtra3;
                            i3 = 0;
                        }
                        if (b != null) {
                            C49849ii0 ii02 = b.field_extInfo;
                            if (ii02 != null) {
                                ii02.f135353d = str2;
                                ii02.f135354e = str5;
                                ii02.f135355f = stringExtra5;
                                b0Var = C13598b0.f38549a;
                            }
                            if (b0Var == null) {
                                C49849ii0 ii03 = new C49849ii0();
                                b.field_extInfo = ii03;
                                ii03.f135353d = str2;
                                ii03.f135354e = str5;
                                ii03.f135355f = stringExtra5;
                            }
                            bVar.mo84166o(b);
                        }
                        ((C3605p1) C86312j.m106911c(C3605p1.class)).mo3980OR(str2, str5, stringExtra5, i3, (C8794p5<C64553md1>) null);
                        return;
                    case 10010:
                        if (intent2.getBooleanExtra("NEED_REFRESH_CONTACT", false)) {
                            mo3824g3(true);
                            return;
                        }
                        return;
                    case CdnLogic.kMediaTypeBeatificFile /*10011*/:
                        if (i2 == 1000 && (stringExtra = intent2.getStringExtra("ACTIVITY_RESULT_REMOVE_NOTICE_KEY")) != null) {
                            if (stringExtra.length() <= 0) {
                                z = false;
                            }
                            if (!z) {
                                stringExtra = null;
                            }
                            if (stringExtra != null) {
                                C11614d0 d0Var = this.f16220W;
                                if (d0Var != null) {
                                    Iterator it = ((ArrayList) d0Var.f34045j).iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (C87412m.m108589b(((C11614d0.C11618c) it.next()).f34065a.f132122h, stringExtra)) {
                                                it.remove();
                                            }
                                        }
                                    }
                                    C11614d0.C11619d dVar = d0Var.f34046k;
                                    if (dVar != null) {
                                        dVar.notifyDataSetChanged();
                                    }
                                    mo3824g3(false);
                                    return;
                                }
                                C87412m.m108603p("moreLiveListWidget");
                                throw null;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                C101614i<String, C3463b> iVar = f16192h1;
                C3463b bVar3 = (C3463b) iVar.get(this.f16213S0);
                if (bVar3 == null) {
                    bVar3 = new C3463b(0, 0, (LinkedList) null, (C49098d51) null, (C50019jp1) null, (C51691vg0) null, (C52271zj0) null, (C0264h) null, (C50428mo1) null, (C49316ep1) null, (C49236e51) null, (List) null, (C51869ws0) null, (C51583uq0) null, (C51810wb1) null, (C51583uq0) null, 65535, (C8480h) null);
                }
                byte[] byteArrayExtra = intent2.getByteArrayExtra("KEY_FINDER_LIVE_NOTICE_INFO");
                if (byteArrayExtra != null) {
                    C49098d51 d512 = new C49098d51();
                    d512.parseFrom(byteArrayExtra);
                    C49098d51 d513 = bVar3.f16265d;
                    if ((d513 != null ? d513.f132118d : Integer.MAX_VALUE) > d512.f132118d) {
                        bVar3.f16265d = d512;
                    }
                }
                iVar.put(this.f16213S0, bVar3);
                m3564X3(this, "onSceneEnd:[NetSceneCreateLiveNotice]", (String) null, 2, (Object) null);
            }
        }
    }

    public boolean onBackPressed() {
        boolean z;
        C8626e eVar = this.f16226Z;
        boolean z2 = false;
        if (eVar != null) {
            FinderProfilePoiDrawer finderProfilePoiDrawer = eVar.f27746g;
            if (finderProfilePoiDrawer != null && finderProfilePoiDrawer.mo82541i()) {
                FinderProfilePoiDrawer finderProfilePoiDrawer2 = eVar.f27746g;
                if (finderProfilePoiDrawer2 != null) {
                    int i = RecyclerViewDrawer.f165670y;
                    finderProfilePoiDrawer2.mo82540h(true);
                }
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            return true;
        }
        return super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        C49098d51 d512;
        C13442s8 f;
        Class cls = C8761d3.class;
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(3736, this);
        C86709a0.m107524d().mo123455a(6653, this);
        C86709a0.m107524d().mo123455a(7289, this);
        C86709a0.m107524d().mo123455a(C91263b.CTRL_INDEX, this);
        ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).f157802n.mo84535d(106, this.f16235f1);
        String stringExtra = getActivity().getIntent().getStringExtra("finder_username");
        C87412m.m108591d(stringExtra);
        this.f16213S0 = stringExtra;
        this.f16215T0 = getIntent().getLongExtra("finder_read_feed_id", 0);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_FINDER_LIVE_NOTICE_INFO");
        if (byteArrayExtra != null) {
            C101614i<String, C3463b> iVar = f16192h1;
            C3463b bVar = (C3463b) iVar.get(this.f16213S0);
            if (bVar == null) {
                C3463b bVar2 = new C3463b(0, 0, (LinkedList) null, (C49098d51) null, (C50019jp1) null, (C51691vg0) null, (C52271zj0) null, (C0264h) null, (C50428mo1) null, (C49316ep1) null, (C49236e51) null, (List) null, (C51869ws0) null, (C51583uq0) null, (C51810wb1) null, (C51583uq0) null, 65535, (C8480h) null);
                C49098d51 d513 = new C49098d51();
                bVar2.f16265d = d513;
                d513.parseFrom(byteArrayExtra);
                iVar.put(this.f16213S0, bVar2);
            } else {
                C49098d51 d514 = new C49098d51();
                d514.parseFrom(byteArrayExtra);
                C49098d51 d515 = bVar.f16265d;
                if ((d515 != null ? d515.f132118d : Integer.MAX_VALUE) > d514.f132118d) {
                    bVar.f16265d = d514;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("use existInfo.finderLiveNoticInfo. [");
                    C49098d51 d516 = bVar.f16265d;
                    sb.append(d516 != null ? Integer.valueOf(d516.f132118d) : null);
                    sb.append(", ");
                    sb.append(d514.f132118d);
                    sb.append(']');
                    Log.m105924i("Finder.FinderProfileHeaderUIC", sb.toString());
                }
            }
        }
        if (getIntent().hasExtra("key_extra_info") && !getIntent().hasExtra("key_enter_source_info") && (f = C13442s8.f38060Q0.mo12873f(getContext())) != null) {
            f.mo12848O3(0, this.f16213S0);
        }
        boolean z = false;
        this.f16253x0 = getIntent().getBooleanExtra("KEY_FINDER_PROFILE_UI_AFTER_SHOW_NOTICE_LIST", false);
        String stringExtra2 = getIntent().getStringExtra("KEY_FINDER_PROFILE_UI_REQUEST_LIST_POSITION");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f16255y0 = stringExtra2;
        View view = this.f16238h;
        C87412m.m108593f(view, "header");
        this.f16210R = new C11608d(view, getActivity(), getContextObj());
        View view2 = this.f16238h;
        C87412m.m108593f(view2, "header");
        this.f16212S = new C11684u(view2, getActivity());
        View view3 = this.f16238h;
        C87412m.m108593f(view3, "header");
        this.f16214T = new C11692x(view3, getActivity());
        View view4 = this.f16238h;
        C87412m.m108593f(view4, "header");
        this.f16216U = new C11587a(view4, getActivity());
        C11614d0 d0Var = new C11614d0(this.f16213S0, getActivity(), isSelf(), getContextObj(), 0, 16, (C8480h) null);
        d0Var.f34052q = new C11058v0(this);
        this.f16220W = d0Var;
        View view5 = this.f16238h;
        C87412m.m108593f(view5, "header");
        C11625e eVar = new C11625e(view5, getActivity(), getContextObj());
        eVar.f34089c = new C11061w0(this);
        getFragmentMode();
        this.f16218V = eVar;
        View view6 = this.f16238h;
        C87412m.m108593f(view6, "header");
        this.f16222X = new C11697z(view6, getActivity(), getContextObj());
        View view7 = this.f16238h;
        C87412m.m108593f(view7, "header");
        this.f16224Y = new C11603c(view7, getActivity());
        C14940p.C14941a a = C14940p.f40978a.mo13992a(this.f16213S0);
        if (a != null) {
            mo3822d3(a.f40981b);
        }
        if (!getIntent().getBooleanExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", false)) {
            C11684u uVar = this.f16212S;
            if (uVar != null) {
                getProfileContact();
                String stringExtra3 = uVar.f34231a.getIntent().getStringExtra("key_biz_username");
                if (stringExtra3 != null) {
                    if ((stringExtra3.length() > 0) && !C87412m.m108589b("null", stringExtra3)) {
                        z = true;
                    }
                    if (!z) {
                        stringExtra3 = null;
                    }
                    if (stringExtra3 != null) {
                        Intent intent = new Intent();
                        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, uVar.f34231a, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                        intent.putExtra("Contact_User", stringExtra3);
                        intent.putExtra("Contact_Scene", 213);
                        intent.putExtra("force_get_contact", true);
                        intent.putExtra("key_use_new_contact_profile", true);
                        intent.putExtra("biz_profile_tab_type", 1);
                        C88144b.m109791i(uVar.f34231a, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                        C61926c.m72666K(0, new C11682t(uVar));
                    }
                }
            } else {
                C87412m.m108603p("mediaEntrance");
                throw null;
            }
        }
        ((FrameLayout) ((C36570n) this.f16239i).getValue()).addView(this.f16238h);
        ViewGroup.LayoutParams layoutParams = ((FrameLayout) ((C36570n) this.f16240j).getValue()).getLayoutParams();
        int b = !getFragmentMode() ? C60641c.m70921b(getActivity().getResources().getDimension(C0966R.dimen.f3679b9) + ((float) C76577a.m92151b(getContext(), 8)) + ((float) C75044y4.m89994f(getActivity()))) : C76577a.m92151b(getContext(), 8);
        layoutParams.height = b;
        ((FrameLayout) ((C36570n) this.f16240j).getValue()).setLayoutParams(layoutParams);
        ((FrameLayout) ((C36570n) this.f16239i).getValue()).setMinimumHeight(b);
        m3564X3(this, "onCreate", (String) null, 2, (Object) null);
        ImageView imageView = (ImageView) ((C36570n) this.f16246r).getValue();
        C87412m.m108593f(imageView, "avatarIv");
        C23564m.m28138h(imageView, new C3491o0(this));
        LinearLayout linearLayout = (LinearLayout) ((C36570n) this.f16198F).getValue();
        C87412m.m108593f(linearLayout, "nickNameContainer");
        C23564m.m28138h(linearLayout, new C3493p0(this));
        TextView textView = (TextView) ((C36570n) this.f16250v).getValue();
        C87412m.m108593f(textView, "friendFollowTv");
        C23564m.m28138h(textView, new C3495q0(this));
        FinderProfileHeaderUIC$onCreate$4 finderProfileHeaderUIC$onCreate$4 = new FinderProfileHeaderUIC$onCreate$4(this, C40008f.f107254d);
        this.f16225Y0 = finderProfileHeaderUIC$onCreate$4;
        finderProfileHeaderUIC$onCreate$4.alive();
        C11625e eVar2 = this.f16218V;
        if (eVar2 != null) {
            String str = this.f16213S0;
            C87412m.m108594g(str, "username");
            C3463b bVar3 = (C3463b) f16192h1.get(str);
            if (!(bVar3 == null || (d512 = bVar3.f16265d) == null)) {
                eVar2.f34106t = d512.f132119e;
            }
            C85875k4.m106189j0(((TextView) ((C36570n) eVar2.f34094h).getValue()).getPaint(), 0.8f);
            ConstraintLayout f2 = eVar2.mo11534f();
            C87412m.m108593f(f2, "finderLiveView");
            C23564m.m28138h(f2, new C11666l(eVar2, str));
            if (this.f16216U != null) {
                C87412m.m108594g(this.f16213S0, "username");
                mo3808J3().f42919g0.setVisibility(8);
                C39818r rVar = C39818r.f106831a;
                ((C8761d3) rVar.mo62444c(getActivity()).mo62447c(cls)).mo9590w0(new C3497r0(this));
                ((C8761d3) rVar.mo62444c(getActivity()).mo62447c(cls)).mo9587h1(new C3499s0(this));
                C11587a aVar = this.f16216U;
                if (aVar != null) {
                    String str2 = this.f16213S0;
                    C87412m.m108594g(str2, "username");
                    C85875k4.m106189j0(((TextView) ((C36570n) aVar.f33983d).getValue()).getPaint(), 0.8f);
                    aVar.mo11517b().setOnClickListener(new C11601b(str2, aVar));
                    C11697z zVar = this.f16222X;
                    if (zVar != null) {
                        C61926c.m72695t(C2479n0.f12979y, zVar.f34257a, new C11607c0(zVar, isSelf(), isSelfFlag()));
                    } else {
                        C87412m.m108603p("redPackWidget");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("activityWidget");
                    throw null;
                }
            } else {
                C87412m.m108603p("activityWidget");
                throw null;
            }
        } else {
            C87412m.m108603p("liveWidget");
            throw null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        IListener<FollowUserEvent> iListener = this.f16225Y0;
        if (iListener != null) {
            iListener.dead();
        }
        C11625e eVar = this.f16218V;
        if (eVar != null) {
            C86709a0.m107524d().mo123470p(6276, eVar.f34112z);
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).f157802n.mo84540i(106, this.f16235f1);
            C86709a0.m107524d().mo123470p(3736, this);
            C86709a0.m107524d().mo123470p(6653, this);
            C86709a0.m107524d().mo123470p(7289, this);
            C86709a0.m107524d().mo123470p(C91263b.CTRL_INDEX, this);
            return;
        }
        C87412m.m108603p("liveWidget");
        throw null;
    }

    public void onPause() {
        super.onPause();
        this.f16255y0 = "";
    }

    public void onResume() {
        C51559uk1 a;
        String str;
        String str2;
        super.onResume();
        C11625e eVar = this.f16218V;
        if (eVar != null) {
            String str3 = this.f16213S0;
            C87412m.m108594g(str3, "username");
            if (eVar.mo11534f().getVisibility() == 0) {
                C3463b bVar = (C3463b) f16192h1.get(str3);
                C49098d51 d512 = bVar != null ? bVar.f16265d : null;
                String str4 = (d512 == null || (str2 = d512.f132121g) == null) ? "" : str2;
                String str5 = (d512 == null || (str = d512.f132122h) == null) ? "" : str;
                C104289g gVar = new C104289g();
                gVar.put("coupon_id", (d512 == null || (a = C7802g1.m7949a(d512)) == null) ? null : a.f142894e);
                gVar.mo145953n("ui_position", 1);
                C7335d c = C86312j.m106911c(C61568m.class);
                C87412m.m108593f(c, "getService(IHellLiveVisitorReoprter::class.java)");
                C61568m.C61569a.m72263a((C61568m) c, C0077k0.ExposeProfile, str3, 0, 0, "temp_5", (String) null, (Long) null, (String) null, (String) null, str4, (String) null, str5, gVar.toString(), ((Number) ((C36570n) eVar.f34109w).getValue()).longValue(), ((Number) ((C36570n) eVar.f34110x).getValue()).intValue(), 1504, (Object) null);
            }
            C2479n0.m2355c(C2479n0.f12955a, "FinderProfileBanner", (String) null, 2, (Object) null);
            C11587a aVar = this.f16216U;
            if (aVar != null) {
                aVar.mo11518c("onResume", this.f16213S0, this.f16230c1, isSelf(), isSelfFlag());
                if (isSelf() && isSelfFlag() && ((C8761d3) C39818r.f106831a.mo62444c(getActivity()).mo62447c(C8761d3.class)).mo9588i1() == null) {
                    C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C3501t0((C15601d<? super C3501t0>) null), 3, (Object) null);
                    return;
                }
                return;
            }
            C87412m.m108603p("activityWidget");
            throw null;
        }
        C87412m.m108603p("liveWidget");
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: te3.ke1} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r32, int r33, java.lang.String r34, ob0.C117747y r35) {
        /*
            r31 = this;
            r1 = r31
            r0 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            java.lang.Class<com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC> r5 = com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC.class
            java.lang.Class<ao1.d1> r6 = ao1.C0145d1.class
            java.lang.String r7 = "sceneBase"
            gy3.C87412m.m108594g(r4, r7)
            androidx.fragment.app.Fragment r7 = r31.getFragment()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0024
            boolean r7 = r7.isDetached()
            if (r7 != r8) goto L_0x0024
            r7 = 1
            goto L_0x0025
        L_0x0024:
            r7 = 0
        L_0x0025:
            if (r7 != 0) goto L_0x0365
            androidx.appcompat.app.AppCompatActivity r7 = r31.getActivity()
            boolean r7 = r7.isFinishing()
            if (r7 == 0) goto L_0x0033
            goto L_0x0365
        L_0x0033:
            r7 = 7289(0x1c79, float:1.0214E-41)
            r10 = 372(0x174, float:5.21E-43)
            r11 = 0
            if (r0 != 0) goto L_0x02a5
            if (r2 != 0) goto L_0x02a5
            int r12 = r35.getType()
            if (r12 == r10) goto L_0x01fc
            r10 = 3736(0xe98, float:5.235E-42)
            if (r12 == r10) goto L_0x00a2
            if (r12 == r7) goto L_0x004a
            goto L_0x035e
        L_0x004a:
            r1.f16229b1 = r8
            com.tencent.mm.network.u r7 = r35.getReqResp()
            boolean r9 = r7 instanceof ob0.C47350c
            if (r9 == 0) goto L_0x0057
            ob0.c r7 = (ob0.C47350c) r7
            goto L_0x0058
        L_0x0057:
            r7 = r11
        L_0x0058:
            if (r7 == 0) goto L_0x005f
            ob0.c$d r7 = r7.f127056b
            pe3.a r7 = r7.f127083a
            goto L_0x0060
        L_0x005f:
            r7 = r11
        L_0x0060:
            boolean r9 = r7 instanceof te3.C50119ke1
            if (r9 == 0) goto L_0x0067
            r11 = r7
            te3.ke1 r11 = (te3.C50119ke1) r11
        L_0x0067:
            bl3.r r7 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r9 = r31.getActivity()
            bl3.r$a r9 = r7.mo62444c(r9)
            java.lang.Class<ht1.d3> r10 = ht1.C8761d3.class
            bl3.c r9 = r9.mo62447c(r10)
            ht1.d3 r9 = (ht1.C8761d3) r9
            r9.mo9584C0(r11)
            androidx.appcompat.app.AppCompatActivity r9 = r31.getActivity()
            bl3.r$a r9 = r7.mo62444c(r9)
            androidx.lifecycle.i0 r5 = r9.mo75002a(r5)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC r5 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC) r5
            java.lang.String r9 = r1.f16213S0
            r5.mo3860d3(r9, r8)
            androidx.appcompat.app.AppCompatActivity r5 = r31.getActivity()
            bl3.r$a r5 = r7.mo62444c(r5)
            androidx.lifecycle.i0 r5 = r5.mo75002a(r6)
            ao1.d1 r5 = (ao1.C0145d1) r5
            r5.onSceneEnd(r0, r2, r3, r4)
            goto L_0x035e
        L_0x00a2:
            boolean r0 = r4 instanceof je1.C9377s4
            if (r0 == 0) goto L_0x00aa
            r0 = r4
            je1.s4 r0 = (je1.C9377s4) r0
            goto L_0x00ab
        L_0x00aa:
            r0 = r11
        L_0x00ab:
            if (r0 != 0) goto L_0x00ae
            return
        L_0x00ae:
            long r2 = r0.f29278h
            r6 = 0
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x035e
            java.lang.String r2 = "Finder.FinderProfileHeaderUIC"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "username="
            r3.append(r4)
            java.lang.String r4 = r1.f16213S0
            r3.append(r4)
            java.lang.String r4 = ", scene username="
            r3.append(r4)
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r0.mo10101P0()
            if (r4 == 0) goto L_0x00d6
            java.lang.String r4 = r4.username
            goto L_0x00d7
        L_0x00d6:
            r4 = r11
        L_0x00d7:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            java.lang.String r2 = r0.f29277g
            java.lang.String r3 = r1.f16213S0
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 != 0) goto L_0x00ec
            return
        L_0x00ec:
            long r2 = r0.mo10108n1()
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x00f5
            return
        L_0x00f5:
            boolean r2 = r0.f29281n
            if (r2 == 0) goto L_0x00fa
            return
        L_0x00fa:
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r0.mo10101P0()
            if (r2 == 0) goto L_0x0106
            java.lang.String r2 = r2.username
            if (r2 == 0) goto L_0x0106
            r1.f16213S0 = r2
        L_0x0106:
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r2 = r1.mo3822d3(r0)
            java.lang.String r3 = "onSceneEnd:[NetSceneFinderUserPage]"
            te3.e51 r4 = r2.f16272k
            if (r4 == 0) goto L_0x0113
            java.lang.String r4 = r4.f132702i
            goto L_0x0114
        L_0x0113:
            r4 = r11
        L_0x0114:
            r1.mo3818W3(r3, r4)
            java.lang.Class<tf0.q1> r3 = tf0.C13887q1.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            tf0.q1 r3 = (tf0.C13887q1) r3
            ob0.c r0 = r0.f29282o
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse"
            gy3.C87412m.m108592e(r0, r4)
            com.tencent.mm.protocal.protobuf.FinderUserPageResponse r0 = (com.tencent.p014mm.protocal.protobuf.FinderUserPageResponse) r0
            te3.e51 r0 = r0.live_notice_list_info
            if (r0 == 0) goto L_0x0133
            java.util.LinkedList<te3.d51> r0 = r0.f132697d
            goto L_0x0134
        L_0x0133:
            r0 = r11
        L_0x0134:
            r3.mo13362wc(r0)
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r3 = r31.getActivity()
            bl3.r$a r0 = r0.mo62444c(r3)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r5)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC r0 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC) r0
            java.lang.String r3 = r1.f16213S0
            r0.mo3860d3(r3, r8)
            boolean r0 = r1.f16230c1
            if (r0 == 0) goto L_0x0152
            r1.f16230c1 = r9
        L_0x0152:
            java.lang.String r0 = r1.f16255y0
            if (r0 == 0) goto L_0x015f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x015d
            goto L_0x015f
        L_0x015d:
            r0 = 0
            goto L_0x0160
        L_0x015f:
            r0 = 1
        L_0x0160:
            if (r0 != 0) goto L_0x01c3
            te3.e51 r0 = r2.f16272k
            if (r0 == 0) goto L_0x0195
            java.util.LinkedList<te3.d51> r3 = r0.f132697d
            if (r3 == 0) goto L_0x0195
            monitor-enter(r3)
            java.util.Iterator r0 = r3.iterator()     // Catch:{ all -> 0x0192 }
        L_0x016f:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0192 }
            if (r4 == 0) goto L_0x018d
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0192 }
            r5 = r4
            te3.d51 r5 = (te3.C49098d51) r5     // Catch:{ all -> 0x0192 }
            java.lang.String r5 = r5.f132122h     // Catch:{ all -> 0x0192 }
            te3.e51 r6 = r2.f16272k     // Catch:{ all -> 0x0192 }
            if (r6 == 0) goto L_0x0185
            java.lang.String r6 = r6.f132702i     // Catch:{ all -> 0x0192 }
            goto L_0x0186
        L_0x0185:
            r6 = r11
        L_0x0186:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0192 }
            if (r5 == 0) goto L_0x016f
            goto L_0x018e
        L_0x018d:
            r4 = r11
        L_0x018e:
            monitor-exit(r3)
            te3.d51 r4 = (te3.C49098d51) r4
            goto L_0x0196
        L_0x0192:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0195:
            r4 = r11
        L_0x0196:
            if (r4 != 0) goto L_0x019a
            r0 = 1
            goto L_0x019b
        L_0x019a:
            r0 = 0
        L_0x019b:
            if (r0 == 0) goto L_0x01c3
            androidx.lifecycle.j r0 = r31.getLifecycle()
            androidx.lifecycle.j$c r0 = r0.getCurrentState()
            androidx.lifecycle.j$c r3 = androidx.lifecycle.C39623j.C39626c.RESUMED
            boolean r0 = r0.mo62187a(r3)
            if (r0 == 0) goto L_0x01c3
            android.app.Activity r0 = r31.getContext()
            android.app.Activity r3 = r31.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131828905(0x7f1120a9, float:1.9290764E38)
            java.lang.String r3 = r3.getString(r4)
            nj3.C76912y0.m92767f(r0, r3)
        L_0x01c3:
            boolean r0 = r1.f16253x0
            if (r0 == 0) goto L_0x035e
            r1.f16253x0 = r9
            te3.e51 r0 = r2.f16272k
            if (r0 == 0) goto L_0x01d5
            java.util.LinkedList<te3.d51> r0 = r0.f132697d
            if (r0 == 0) goto L_0x01d5
            int r9 = r0.size()
        L_0x01d5:
            if (r9 <= r8) goto L_0x035e
            oo1.d0 r0 = r1.f16220W
            if (r0 == 0) goto L_0x01f6
            sg.i<java.lang.String, com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b> r3 = f16192h1
            java.lang.String r4 = r1.f16213S0
            java.lang.Object r3 = r3.get(r4)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r3 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r3
            if (r3 == 0) goto L_0x01ea
            te3.e51 r3 = r3.f16272k
            goto L_0x01eb
        L_0x01ea:
            r3 = r11
        L_0x01eb:
            te3.e51 r2 = r2.f16272k
            if (r2 == 0) goto L_0x01f1
            java.lang.String r11 = r2.f132702i
        L_0x01f1:
            r0.mo9628a(r3, r11)
            goto L_0x035e
        L_0x01f6:
            java.lang.String r0 = "moreLiveListWidget"
            gy3.C87412m.m108603p(r0)
            throw r11
        L_0x01fc:
            boolean r0 = r4 instanceof p239sv.C13784j
            if (r0 == 0) goto L_0x0204
            r0 = r4
            sv.j r0 = (p239sv.C13784j) r0
            goto L_0x0205
        L_0x0204:
            r0 = r11
        L_0x0205:
            if (r0 != 0) goto L_0x0208
            return
        L_0x0208:
            oo1.d r2 = r1.f16210R
            if (r2 == 0) goto L_0x029f
            ob0.c r3 = r0.mo13143i0()
            boolean r4 = r3 instanceof ob0.C47350c
            if (r4 == 0) goto L_0x0215
            goto L_0x0216
        L_0x0215:
            r3 = r11
        L_0x0216:
            if (r3 == 0) goto L_0x021d
            ob0.c$c r3 = r3.f127055a
            pe3.a r3 = r3.f127080a
            goto L_0x021e
        L_0x021d:
            r3 = r11
        L_0x021e:
            boolean r4 = r3 instanceof te3.C64352ey3
            if (r4 == 0) goto L_0x0225
            te3.ey3 r3 = (te3.C64352ey3) r3
            goto L_0x0226
        L_0x0225:
            r3 = r11
        L_0x0226:
            if (r3 == 0) goto L_0x0232
            te3.d73 r3 = r3.f183055h
            if (r3 == 0) goto L_0x0232
            int r3 = r3.f182644d
            if (r3 != r8) goto L_0x0232
            r3 = 1
            goto L_0x0233
        L_0x0232:
            r3 = 0
        L_0x0233:
            if (r3 != 0) goto L_0x0237
            goto L_0x035e
        L_0x0237:
            te3.dy3 r0 = r0.mo13144t()
            if (r0 == 0) goto L_0x0294
            java.lang.String r3 = r0.f227190d
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            java.lang.String r5 = "nullAsNil(userName)"
            gy3.C87412m.m108593f(r4, r5)
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0250
            r4 = 1
            goto L_0x0251
        L_0x0250:
            r4 = 0
        L_0x0251:
            if (r4 == 0) goto L_0x0284
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            k40.a r4 = f40.C86709a0.m107533q(r4)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            com.tencent.mm.storage.z1 r3 = r4.get(r3)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            r5 = 161(0xa1, float:2.26E-43)
            p248ug.C78157d.m94368a(r4, r0, r5)
            if (r3 == 0) goto L_0x027a
            boolean r0 = r3.mo62927s3()
            if (r0 != 0) goto L_0x027a
            java.lang.String r0 = "Contact_IsLBSFriend"
            r4.putExtra(r0, r8)
        L_0x027a:
            androidx.appcompat.app.AppCompatActivity r0 = r2.f34020a
            java.lang.String r3 = "profile"
            java.lang.String r5 = ".ui.ContactInfoUI"
            ke3.C88144b.m109791i(r0, r3, r5, r4, r11)
            goto L_0x0294
        L_0x0284:
            androidx.appcompat.app.AppCompatActivity r0 = r2.f34020a
            android.content.Context r0 = r0.getApplicationContext()
            r3 = 2131829680(0x7f1123b0, float:1.9292336E38)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (int) r3, (int) r9)
            r0.show()
        L_0x0294:
            qo3.i0 r0 = r2.f34023d
            if (r0 == 0) goto L_0x029b
            r0.dismiss()
        L_0x029b:
            r2.f34026g = r9
            goto L_0x035e
        L_0x029f:
            java.lang.String r0 = "enterpriseAdd"
            gy3.C87412m.m108603p(r0)
            throw r11
        L_0x02a5:
            int r5 = r35.getType()
            if (r5 == r10) goto L_0x02c2
            if (r5 == r7) goto L_0x02ae
            goto L_0x02e9
        L_0x02ae:
            bl3.r r5 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r7 = r31.getActivity()
            bl3.r$a r5 = r5.mo62444c(r7)
            androidx.lifecycle.i0 r5 = r5.mo75002a(r6)
            ao1.d1 r5 = (ao1.C0145d1) r5
            r5.onSceneEnd(r0, r2, r3, r4)
            goto L_0x02e9
        L_0x02c2:
            oo1.d r0 = r1.f16210R
            if (r0 == 0) goto L_0x035f
            qo3.i0 r3 = r0.f34023d
            if (r3 == 0) goto L_0x02cd
            r3.dismiss()
        L_0x02cd:
            r0.f34026g = r9
            androidx.appcompat.app.AppCompatActivity r0 = r31.getActivity()
            android.content.Context r0 = r0.getApplicationContext()
            androidx.appcompat.app.AppCompatActivity r3 = r31.getActivity()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131826257(0x7f111651, float:1.9285393E38)
            java.lang.String r3 = r3.getString(r5)
            nj3.C76912y0.m92773l(r0, r3)
        L_0x02e9:
            r0 = -5900(0xffffffffffffe8f4, float:NaN)
            if (r2 != r0) goto L_0x035e
            boolean r0 = r4 instanceof je1.C9377s4
            if (r0 == 0) goto L_0x02f5
            r0 = r4
            je1.s4 r0 = (je1.C9377s4) r0
            goto L_0x02f6
        L_0x02f5:
            r0 = r11
        L_0x02f6:
            if (r0 != 0) goto L_0x02f9
            return
        L_0x02f9:
            java.lang.String r0 = r0.f29277g
            java.lang.String r2 = r1.f16213S0
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 != 0) goto L_0x0304
            return
        L_0x0304:
            sg.i<java.lang.String, com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b> r0 = f16192h1
            java.lang.String r2 = r1.f16213S0
            java.lang.Object r2 = r0.get(r2)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r2 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r2
            if (r2 != 0) goto L_0x0338
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r2 = new com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b
            r12 = r2
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 65535(0xffff, float:9.1834E-41)
            r30 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x0338:
            zc1.b r3 = zc1.C66785b.f191882e
            java.lang.String r4 = r1.f16213S0
            bd1.h r3 = r3.mo90663P2(r4)
            if (r3 != 0) goto L_0x034f
            bd1.h r3 = new bd1.h
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 7
            r17 = 0
            r12 = r3
            r12.<init>(r13, r14, r15, r16, r17)
        L_0x034f:
            r3.f820c = r8
            r2.f16269h = r3
            java.lang.String r3 = r1.f16213S0
            r0.put(r3, r2)
            java.lang.String r0 = "onSceneEnd:[NetSceneFinderUserPage]"
            r2 = 2
            m3564X3(r1, r0, r11, r2, r11)
        L_0x035e:
            return
        L_0x035f:
            java.lang.String r0 = "enterpriseAdd"
            gy3.C87412m.m108603p(r0)
            throw r11
        L_0x0365:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public void onStart() {
        super.onStart();
        if (!this.f16228a1) {
            mo3824g3(true);
        }
        this.f16228a1 = false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileHeaderUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        View view = this.f16238h;
        C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f16223X0 = new C9228a((ViewGroup) view);
        this.f16227Z0 = C36568h.m40985a(C3504v.f16320d);
        this.f16228a1 = true;
        this.f16230c1 = true;
        this.f16231d1 = "";
        this.f16233e1 = 1;
        this.f16235f1 = new C3486m(this);
    }
}
