package rs1;

import a14.C0000n0;
import a14.C53934p0;
import ak1.C54067f0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import ao1.C0143d;
import ao1.C0145d1;
import bd1.C0264h;
import bd1.C54446b;
import bl3.C0317e;
import bl3.C39818r;
import bl3.C54492n;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C45081s1;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2469j;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.p056ui.FinderExposeUI;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.wcdb.FileUtils;
import com.tencent.xweb.WCWebUpdater;
import da0.C58247e;
import di3.C7335d;
import di3.C86312j;
import dp1.C58408t0;
import dp1.C58412u0;
import dp1.C58413v0;
import dp1.C58417y0;
import dp1.C7435f2;
import dp1.C7446m0;
import er1.C58679a1;
import er1.C58684b;
import er1.C58784w3;
import er1.C7784b2;
import er1.C7789c2;
import er1.C7853p2;
import er1.C7878t0;
import f40.C86709a0;
import fe1.C45770k;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gf1.C59418i;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60152b4;
import ht1.C60177j4;
import ht1.C60200t1;
import ht1.C8761d3;
import ht1.C8763e3;
import ht1.C8777j5;
import ht1.C8783m1;
import ht1.C8786n1;
import ht1.C8808v4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kd1.C60999e;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Result;
import kotlin.ResultKt;
import ky2.C10432i;
import m53.C10756c;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C117747y;
import org.json.JSONObject;
import ot1.C11767a;
import p140cw.C7135d;
import p140cw.C7136e;
import p599lr.C61381b;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import q40.C12040d;
import qo3.C47883u;
import qo3.C77407n;
import qo3.C77426q;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C49712hj1;
import te3.C50119ke1;
import te3.C50401mh0;
import te3.C51827wf3;
import te3.C51978xi1;
import te3.C64284cg;
import te3.C64586nn1;
import te3.hk4;
import tf0.C13887q1;
import up1.C27696y;
import up1.C37521f;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;
import zc1.C66783a;
import zc1.C66785b;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: rs1.c9 */
public final class C13146c9 extends UIComponent implements C45770k, C60177j4 {

    /* renamed from: Q */
    public static String f37394Q = "";

    /* renamed from: R */
    public static int f37395R;

    /* renamed from: A */
    public String f37396A = "";

    /* renamed from: B */
    public String f37397B = "";

    /* renamed from: C */
    public String f37398C = "";

    /* renamed from: D */
    public String f37399D = "";

    /* renamed from: E */
    public String f37400E = "";

    /* renamed from: F */
    public String f37401F = "";

    /* renamed from: G */
    public String f37402G = "";

    /* renamed from: H */
    public boolean f37403H;

    /* renamed from: I */
    public boolean f37404I;

    /* renamed from: J */
    public boolean f37405J;

    /* renamed from: K */
    public boolean f37406K;

    /* renamed from: L */
    public final boolean f37407L;

    /* renamed from: M */
    public final C13601g f37408M;

    /* renamed from: N */
    public boolean f37409N;

    /* renamed from: P */
    public String f37410P;

    /* renamed from: d */
    public String f37411d;

    /* renamed from: e */
    public C50119ke1 f37412e;

    /* renamed from: f */
    public boolean f37413f;

    /* renamed from: g */
    public ProgressBar f37414g;

    /* renamed from: h */
    public View f37415h;

    /* renamed from: i */
    public TextView f37416i;

    /* renamed from: j */
    public TextView f37417j;

    /* renamed from: n */
    public View f37418n;

    /* renamed from: o */
    public HashMap<Integer, C51827wf3> f37419o = new HashMap<>();

    /* renamed from: p */
    public View f37420p;

    /* renamed from: q */
    public ImageView f37421q;

    /* renamed from: r */
    public TextView f37422r;

    /* renamed from: s */
    public TextView f37423s;

    /* renamed from: t */
    public View f37424t;

    /* renamed from: u */
    public View f37425u;

    /* renamed from: v */
    public View f37426v;

    /* renamed from: w */
    public boolean f37427w;

    /* renamed from: x */
    public boolean f37428x;

    /* renamed from: y */
    public long f37429y;

    /* renamed from: z */
    public boolean f37430z;

    /* renamed from: rs1.c9$a */
    public static final class C13147a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37431d;

        public C13147a(C13146c9 c9Var) {
            this.f37431d = c9Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButRevingUi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
            C87412m.m108591d(b);
            if (b.mo84190n2()) {
                intent.setClass(this.f37431d.getActivity(), FinderExposeUI.class);
                AppCompatActivity activity = this.f37431d.getActivity();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppCompatActivity appCompatActivity = activity;
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButRevingUi$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButRevingUi$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this.f37431d.getActivity(), intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                ((C58684b) C86312j.m106911c(C58684b.class)).Tx0(this.f37431d.getActivity(), intent);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButRevingUi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.c9$b */
    public static final class C13148b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37432d;

        public C13148b(C13146c9 c9Var) {
            this.f37432d = c9Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r15) {
            /*
                r14 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r15)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButRevingUi$2"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r14
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                rs1.c9 r15 = r14.f37432d
                te3.ke1 r0 = r15.f37412e
                if (r0 == 0) goto L_0x0113
                er1.w3 r1 = er1.C58784w3.f168295a
                androidx.appcompat.app.AppCompatActivity r2 = r15.getActivity()
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 12
                r7 = 0
                boolean r1 = er1.C58784w3.m68438n(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0113
                r1 = 0
                java.util.LinkedList<te3.zg3> r2 = r0.f136709z
                if (r2 == 0) goto L_0x0066
                java.util.Iterator r2 = r2.iterator()
            L_0x003c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x005a
                java.lang.Object r3 = r2.next()
                r4 = r3
                te3.zg3 r4 = (te3.C52261zg3) r4
                com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f145918e
                if (r4 == 0) goto L_0x0050
                java.lang.String r4 = r4.username
                goto L_0x0051
            L_0x0050:
                r4 = r1
            L_0x0051:
                java.lang.String r5 = r15.f37411d
                boolean r4 = gy3.C87412m.m108589b(r4, r5)
                if (r4 == 0) goto L_0x003c
                goto L_0x005b
            L_0x005a:
                r3 = r1
            L_0x005b:
                te3.zg3 r3 = (te3.C52261zg3) r3
                if (r3 == 0) goto L_0x0066
                int r2 = r3.f145907A
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x0067
            L_0x0066:
                r2 = r1
            L_0x0067:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "actionType "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "SimpleUIComponent"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                r3 = 3
                if (r2 != 0) goto L_0x0081
                goto L_0x00d4
            L_0x0081:
                int r4 = r2.intValue()
                if (r4 != r3) goto L_0x00d4
                java.util.LinkedList<te3.zg3> r0 = r0.f136709z
                if (r0 == 0) goto L_0x00b4
                java.util.Iterator r0 = r0.iterator()
            L_0x008f:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x00ad
                java.lang.Object r2 = r0.next()
                r3 = r2
                te3.zg3 r3 = (te3.C52261zg3) r3
                com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f145918e
                if (r3 == 0) goto L_0x00a3
                java.lang.String r3 = r3.username
                goto L_0x00a4
            L_0x00a3:
                r3 = r1
            L_0x00a4:
                java.lang.String r4 = r15.f37411d
                boolean r3 = gy3.C87412m.m108589b(r3, r4)
                if (r3 == 0) goto L_0x008f
                goto L_0x00ae
            L_0x00ad:
                r2 = r1
            L_0x00ae:
                te3.zg3 r2 = (te3.C52261zg3) r2
                if (r2 == 0) goto L_0x00b4
                te3.le1 r1 = r2.f145917d
            L_0x00b4:
                if (r1 == 0) goto L_0x0113
                java.lang.Class<kr0.x0> r0 = kr0.C76630x0.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                r2 = r0
                kr0.x0 r2 = (kr0.C76630x0) r2
                androidx.appcompat.app.AppCompatActivity r3 = r15.getActivity()
                java.lang.String r4 = r1.f137359g
                r6 = 0
                r7 = 0
                java.lang.String r8 = r1.f137358f
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r9 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
                r9.<init>()
                java.lang.String r5 = ""
                r2.Ko0(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x0113
            L_0x00d4:
                r0 = 2
                if (r2 != 0) goto L_0x00d8
                goto L_0x0113
            L_0x00d8:
                int r1 = r2.intValue()
                if (r1 != r0) goto L_0x0113
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = r15.f37411d
                java.lang.String r2 = "finder_username"
                r0.putExtra(r2, r1)
                r1 = 1
                java.lang.String r2 = "KEY_FINDER_SELF_FLAG"
                r0.putExtra(r2, r1)
                rs1.s8$a r2 = rs1.C13442s8.f38060Q0
                androidx.appcompat.app.AppCompatActivity r3 = r15.getActivity()
                r5 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 252(0xfc, float:3.53E-43)
                r13 = 0
                r4 = r0
                rs1.C13442s8.C13443a.m12791e(r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13)
                java.lang.Class<er1.b> r1 = er1.C58684b.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                er1.b r1 = (er1.C58684b) r1
                androidx.appcompat.app.AppCompatActivity r15 = r15.getActivity()
                r1.mo13272V1(r15, r0)
            L_0x0113:
                java.lang.String r15 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButRevingUi$2"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r14, r15, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C13146c9.C13148b.onClick(android.view.View):void");
        }
    }

    /* renamed from: rs1.c9$c */
    public static final class C13149c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37433d;

        public C13149c(C13146c9 c9Var) {
            this.f37433d = c9Var;
        }

        public final void run() {
            this.f37433d.findViewById(C0966R.C0970id.d5k).performClick();
        }
    }

    /* renamed from: rs1.c9$d */
    public static final class C13150d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37434d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13150d(C13146c9 c9Var) {
            super(0);
            this.f37434d = c9Var;
        }

        public Object invoke() {
            this.f37434d.mo12649e3();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.c9$e */
    public static final class C13151e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37435d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13151e(C13146c9 c9Var) {
            super(0);
            this.f37435d = c9Var;
        }

        public Object invoke() {
            this.f37435d.f37412e = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.c9$f */
    public static final class C13152f implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37436d;

        public C13152f(C13146c9 c9Var) {
            this.f37436d = c9Var;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            Class cls = C58417y0.class;
            if (e0Var.mo107176v()) {
                e0Var.mo107125a(1001, C0966R.string.f7980y8);
                e0Var.mo107125a(1002, C0966R.string.f7989yh);
                if (((C58247e) C86312j.m106911c(C58247e.class)).yf0().mo8429d()) {
                    e0Var.mo107125a(1031, C0966R.string.lr5);
                }
                C7853p2 p2Var = C7853p2.f26439a;
                C13146c9 c9Var = this.f37436d;
                p2Var.mo8962e(1010, c9Var.f37419o, e0Var, c9Var.getContext());
            }
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f = aVar.mo12873f(this.f37436d.getContext());
            C49712hj1 hj12 = null;
            y0Var.Cx0(0, "post_acionsheet_camera", "", f != null ? f.mo12861q3() : null);
            C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
            C13442s8 f2 = aVar.mo12873f(this.f37436d.getContext());
            if (f2 != null) {
                hj12 = f2.mo12861q3();
            }
            y0Var2.Cx0(0, "post_actionsheet_album", "", hj12);
        }
    }

    /* renamed from: rs1.c9$g */
    public static final class C13153g implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37437d;

        /* renamed from: e */
        public final /* synthetic */ int f37438e;

        /* renamed from: f */
        public final /* synthetic */ String f37439f;

        /* renamed from: g */
        public final /* synthetic */ String f37440g;

        public C13153g(C13146c9 c9Var, int i, String str, String str2) {
            this.f37437d = c9Var;
            this.f37438e = i;
            this.f37439f = str;
            this.f37440g = str2;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Class cls = C58417y0.class;
            Intent intent = new Intent();
            C49712hj1 hj12 = null;
            if (menuItem.getItemId() == 1001) {
                intent.putExtra("key_finder_post_router", 2);
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f37437d.getContext());
                if (f != null) {
                    hj12 = f.mo12861q3();
                }
                y0Var.Cx0(1, "post_acionsheet_camera", "", hj12);
            } else if (menuItem.getItemId() == 1002) {
                intent.putExtra("key_finder_post_router", 3);
                intent.putExtra("key_maas_entrance", 1);
                C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
                C13442s8 f2 = C13442s8.f38060Q0.mo12873f(this.f37437d.getContext());
                if (f2 != null) {
                    hj12 = f2.mo12861q3();
                }
                y0Var2.Cx0(1, "post_actionsheet_album", "", hj12);
            } else if (menuItem.getItemId() == 1031) {
                intent.putExtra("key_finder_post_router", 16);
            } else if (this.f37437d.f37419o.containsKey(Integer.valueOf(menuItem.getItemId()))) {
                C7853p2.f26439a.mo8960c(this.f37437d.getActivity(), this.f37437d.f37419o.get(Integer.valueOf(menuItem.getItemId())));
            }
            C58408t0 t0Var = C58408t0.f167336a;
            t0Var.mo83266l(this.f37438e, false);
            t0Var.mo83264j(this.f37439f);
            intent.putExtra("key_finder_post_from", 5);
            intent.putExtra("key_finder_post_id", this.f37440g);
            C58679a1.f167972a.mo83554a(this.f37437d.getActivity(), intent, 132, 9);
            ((C58684b) C86312j.m106911c(C58684b.class)).mo83582c0(this.f37437d.getActivity(), intent);
        }
    }

    /* renamed from: rs1.c9$h */
    public static final class C13154h implements C77407n.C47880p {

        /* renamed from: a */
        public static final C13154h f37441a = new C13154h();

        public final void onDismiss() {
            FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.exitPageId = 6;
                FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
                if (finderFeedReportObject2 != null) {
                    C61926c.m72661F("Finder.FinderPostReportLogic", new C58412u0(finderFeedReportObject2, false));
                }
            }
            ((C58247e) C86312j.m106911c(C58247e.class)).M60();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderSelfUIC$doPrepareUser$1", mo125469f = "FinderSelfUIC.kt", mo125470l = {1636}, mo125471m = "invokeSuspend")
    /* renamed from: rs1.c9$i */
    public static final class C13155i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f37442d;

        /* renamed from: e */
        public final /* synthetic */ C13146c9 f37443e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13155i(C13146c9 c9Var, C15601d<? super C13155i> dVar) {
            super(2, dVar);
            this.f37443e = c9Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C13155i(this.f37443e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13155i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Class cls = C0145d1.class;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f37442d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C66785b bVar = C66785b.f191882e;
                this.f37442d = 1;
                obj2 = bVar.mo90679u0(8, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m168123unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C13146c9 c9Var = this.f37443e;
            if (Result.m168121isSuccessimpl(obj2)) {
                C50119ke1 ke12 = (C50119ke1) obj2;
                c9Var.f37406K = true;
                ProgressBar progressBar = c9Var.f37414g;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                    C39818r rVar = C39818r.f106831a;
                    ((C0145d1) rVar.mo62444c(c9Var.getActivity()).mo75002a(cls)).mo135c3(0, 0, (String) null, ke12);
                    boolean z = c9Var.f37412e == null;
                    c9Var.f37412e = ke12;
                    if (z) {
                        c9Var.mo12658o3();
                    }
                    c9Var.mo12651g3().mo9584C0(c9Var.f37412e);
                    ((C8786n1) rVar.mo62444c(c9Var.getActivity()).mo62447c(C8786n1.class)).mo9623o2(ke12);
                    ((C8763e3) rVar.mo62444c(c9Var.getActivity()).mo62447c(C8763e3.class)).mo9591w2(ke12.f136689F, false);
                    c9Var.mo12657n3();
                } else {
                    C87412m.m108603p("progressBar");
                    throw null;
                }
            }
            C13146c9 c9Var2 = this.f37443e;
            Throwable r122 = Result.m168117exceptionOrNullimpl(obj2);
            if (r122 != null) {
                c9Var2.f37406K = true;
                View view = c9Var2.f37418n;
                if (view != null) {
                    view.setEnabled(true);
                    C12040d dVar = r122 instanceof C12040d ? (C12040d) r122 : null;
                    if (dVar != null) {
                        ProgressBar progressBar2 = c9Var2.f37414g;
                        if (progressBar2 != null) {
                            progressBar2.setVisibility(8);
                            ((C0145d1) C39818r.f106831a.mo62444c(c9Var2.getActivity()).mo75002a(cls)).onSceneEnd(dVar.f35057e, dVar.f35058f, dVar.f35059g, (C117747y) null);
                            c9Var2.mo12658o3();
                            C76912y0.makeText((Context) c9Var2.getActivity(), (int) C0966R.string.f360756ej2, 1).show();
                        } else {
                            C87412m.m108603p("progressBar");
                            throw null;
                        }
                    }
                } else {
                    C87412m.m108603p("finderPosterEntrance");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.c9$j */
    public static final class C13156j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37444d;

        public C13156j(C13146c9 c9Var) {
            this.f37444d = c9Var;
        }

        public final void onClick(View view) {
            Class cls = FinderCommonFeatureService.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initLiveRewardGainCell$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("FinderLiveIncomeEntrance");
            C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderLiveIncomeEntrance");
            if (!(R5 == null || G5 == null)) {
                C58413v0 v0Var = C58413v0.f167346a;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f37444d.getActivity());
                C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, G5, R5, 2, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
            }
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("FinderLiveIncomeEntrance");
            ((C10756c) C86709a0.m107533q(C10756c.class)).xa0(this.f37444d.getActivity(), "");
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0.ey0((C58417y0) c, this.f37444d.getActivity(), this.f37444d.f37429y, false, 2, 9, false, 0, (String) null, (String) null, 384, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initLiveRewardGainCell$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.c9$k */
    public static final class C13157k<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37445d;

        public C13157k(C13146c9 c9Var) {
            this.f37445d = c9Var;
        }

        public void onChanged(Object obj) {
            C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
            Class cls = FinderCommonFeatureService.class;
            View findViewById = this.f37445d.findViewById(C0966R.C0970id.fub);
            boolean z = true;
            if (aVar == null || !aVar.f12908a) {
                z = false;
            }
            if (z) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initLiveRewardGainCell$2", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initLiveRewardGainCell$2", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("FinderLiveIncomeEntrance");
                C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderLiveIncomeEntrance");
                if (R5 != null && G5 != null) {
                    String str = G5.field_ctrInfo.f144673h;
                    if (str == null) {
                        str = "";
                    }
                    if (!C87412m.m108589b(str, this.f37445d.f37401F)) {
                        C13146c9 c9Var = this.f37445d;
                        c9Var.getClass();
                        c9Var.f37401F = str;
                        C58413v0 v0Var = C58413v0.f167346a;
                        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f37445d.getActivity());
                        C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, G5, R5, 1, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
                        return;
                    }
                    return;
                }
                return;
            }
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initLiveRewardGainCell$2", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initLiveRewardGainCell$2", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: rs1.c9$l */
    public static final class C13158l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37446d;

        /* renamed from: e */
        public final /* synthetic */ C55718s0 f37447e;

        /* renamed from: f */
        public final /* synthetic */ C64586nn1 f37448f;

        public C13158l(C13146c9 c9Var, C55718s0 s0Var, C64586nn1 nn12) {
            this.f37446d = c9Var;
            this.f37447e = s0Var;
            this.f37448f = nn12;
        }

        public final void onClick(View view) {
            Class cls = FinderCommonFeatureService.class;
            Class cls2 = C8777j5.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPostBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(cls2);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C13146c9 c9Var = this.f37446d;
            String str = C13146c9.f37394Q;
            C8777j5.C8778a.m8601b((C8777j5) c, 2, c9Var.mo12651g3().mo9589n1(), this.f37446d.mo12651g3().mo9585G(), (Map) null, 8, (Object) null);
            this.f37446d.mo12651g3().mo9583A0();
            C54067f0 config = ((C8777j5) C86312j.m106911c(cls2)).getConfig();
            C54067f0.C0063l0 l0Var = C54067f0.C0063l0.FINDER_PROFILE;
            config.getClass();
            config.f151422D = l0Var;
            C7335d c2 = C86312j.m106911c(cls2);
            C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8600a((C8777j5) c2, 2, "", (String) null, 4, (Object) null);
            TextView textView = this.f37446d.f37423s;
            if (textView != null) {
                textView.setVisibility(8);
            }
            C55718s0 s0Var = this.f37447e;
            C64586nn1 nn12 = this.f37448f;
            C13146c9 c9Var2 = this.f37446d;
            if (!(s0Var == null || nn12 == null)) {
                C58413v0 v0Var = C58413v0.f167346a;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(c9Var2.getActivity());
                C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, s0Var, nn12, 2, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("FinderSelfLiveEntrance");
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77272l("FinderEntrance", new int[]{1010});
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77272l("TLPersonalCenter", new int[]{1010});
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPostBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.c9$m */
    public static final class C13159m<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37449d;

        /* renamed from: e */
        public final /* synthetic */ C55718s0 f37450e;

        /* renamed from: f */
        public final /* synthetic */ C64586nn1 f37451f;

        public C13159m(C13146c9 c9Var, C55718s0 s0Var, C64586nn1 nn12) {
            this.f37449d = c9Var;
            this.f37450e = s0Var;
            this.f37451f = nn12;
        }

        public void onChanged(Object obj) {
            String str;
            C51978xi1 xi12;
            C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
            boolean z = true;
            if (aVar == null || !aVar.f12908a) {
                z = false;
            }
            if (z) {
                TextView textView = this.f37449d.f37423s;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                C55718s0 s0Var = this.f37450e;
                if (s0Var == null || (xi12 = s0Var.field_ctrInfo) == null || (str = xi12.f144673h) == null) {
                    str = "";
                }
                if (!C87412m.m108589b(str, this.f37449d.f37399D)) {
                    C13146c9 c9Var = this.f37449d;
                    c9Var.getClass();
                    c9Var.f37399D = str;
                    C55718s0 s0Var2 = this.f37450e;
                    C64586nn1 nn12 = this.f37451f;
                    C13146c9 c9Var2 = this.f37449d;
                    if (s0Var2 != null && nn12 != null) {
                        C58413v0 v0Var = C58413v0.f167346a;
                        C13442s8 f = C13442s8.f38060Q0.mo12873f(c9Var2.getActivity());
                        C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, s0Var2, nn12, 1, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
                        return;
                    }
                    return;
                }
                return;
            }
            TextView textView2 = this.f37449d.f37423s;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
    }

    /* renamed from: rs1.c9$n */
    public static final class C13160n implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37452d;

        public C13160n(C13146c9 c9Var) {
            this.f37452d = c9Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPostBtn$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C13146c9 c9Var = this.f37452d;
            String str = C13146c9.f37394Q;
            c9Var.mo12649e3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPostBtn$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.c9$o */
    public static final class C13161o implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37453d;

        /* renamed from: e */
        public final /* synthetic */ String f37454e;

        public C13161o(C13146c9 c9Var, String str) {
            this.f37453d = c9Var;
            this.f37454e = str;
        }

        public final void onClick(View view) {
            Class cls = FinderCommonFeatureService.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPosterEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("CreatorCenter");
            C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("CreatorCenter");
            C13146c9 c9Var = this.f37453d;
            if (!(G5 == null || R5 == null)) {
                C58413v0 v0Var = C58413v0.f167346a;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(c9Var.getActivity());
                C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, G5, R5, 2, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
            }
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0 y0Var = (C58417y0) c;
            Activity context = this.f37453d.getContext();
            C13146c9 c9Var2 = this.f37453d;
            C58417y0.ey0(y0Var, context, c9Var2.f37429y, c9Var2.f37427w, 2, 8, R5 != null, 0, (String) null, (String) null, FileUtils.S_IRWXU, (Object) null);
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("FinderPosterEntrance");
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("CreatorCenter");
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f37454e);
            C88144b.m109791i(this.f37453d.getActivity(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPosterEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.c9$p */
    public static final class C13162p extends C87413o implements C32224a<C8761d3> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f37455d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13162p(AppCompatActivity appCompatActivity) {
            super(0);
            this.f37455d = appCompatActivity;
        }

        public Object invoke() {
            return (C8761d3) C39818r.f106831a.mo62444c(this.f37455d).mo62447c(C8761d3.class);
        }
    }

    /* renamed from: rs1.c9$q */
    public static final class C13163q implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37456d;

        /* renamed from: e */
        public final /* synthetic */ TextView f37457e;

        /* renamed from: f */
        public final /* synthetic */ ImageView f37458f;

        public C13163q(C13146c9 c9Var, TextView textView, ImageView imageView) {
            this.f37456d = c9Var;
            this.f37457e = textView;
            this.f37458f = imageView;
        }

        public final void run() {
            View findViewById = this.f37456d.findViewById(C0966R.C0970id.f6206mk);
            if (findViewById != null) {
                TextView textView = this.f37457e;
                C87412m.m108593f(textView, "finderNickname");
                float measuredWidth = ((float) ((C61926c.m72690o(findViewById)[0] - C61926c.m72690o(textView)[0]) - this.f37458f.getMeasuredWidth())) - this.f37456d.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
                if (((float) this.f37457e.getMeasuredWidth()) > measuredWidth) {
                    TextView textView2 = this.f37457e;
                    ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                    layoutParams.width = (int) measuredWidth;
                    textView2.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: rs1.c9$r */
    public static final class C13164r implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37459d;

        public C13164r(C13146c9 c9Var) {
            this.f37459d = c9Var;
        }

        public final void run() {
            View view = this.f37459d.f37415h;
            if (view != null) {
                view.performClick();
            } else {
                C87412m.m108603p("finderPosBtn");
                throw null;
            }
        }
    }

    /* renamed from: rs1.c9$s */
    public static final class C13165s implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37460d;

        public C13165s(C13146c9 c9Var) {
            this.f37460d = c9Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$4$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77426q qVar = new C77426q(this.f37460d.getActivity());
            qVar.mo107606r("");
            qVar.mo107595g(this.f37460d.getActivity().getString(C0966R.string.cxw));
            qVar.mo107601m(C0966R.string.cxu);
            qVar.mo107589a(true);
            qVar.mo107600l((C47883u) null);
            qVar.mo107603o();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$4$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.c9$t */
    public static final class C13166t implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37461d;

        public C13166t(C13146c9 c9Var) {
            this.f37461d = c9Var;
        }

        /* renamed from: a */
        public static final void m12584a(Intent intent, C13146c9 c9Var) {
            intent.putExtra("finder_username", c9Var.f37411d);
            intent.putExtra("KEY_FINDER_SELF_FLAG", true);
            intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
            C13442s8.C13443a.m12791e(C13442s8.f38060Q0, c9Var.getActivity(), intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(c9Var.getActivity(), intent);
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderAccountAreaClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            C58961d.C58963b bVar = C58961d.f168673a;
            C66785b bVar2 = C66785b.f191882e;
            C58969q b = bVar.mo84155b(bVar2.mo90662O5());
            C87412m.m108591d(b);
            if (b.mo84190n2()) {
                intent.setClass(this.f37461d.getActivity(), FinderExposeUI.class);
                AppCompatActivity activity = this.f37461d.getActivity();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppCompatActivity appCompatActivity = activity;
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderAccountAreaClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderAccountAreaClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                String str = this.f37461d.f37411d;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                C0264h P2 = bVar2.mo90663P2(str);
                C13598b0 b0Var = null;
                if (P2 != null) {
                    C13146c9 c9Var = this.f37461d;
                    if (P2.f818a == 1) {
                        C58684b bVar3 = (C58684b) C86312j.m106911c(C58684b.class);
                        AppCompatActivity activity2 = c9Var.getActivity();
                        String str3 = c9Var.f37411d;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        bVar3.Px0(activity2, str2);
                        c9Var.f37412e = null;
                    } else {
                        m12584a(intent, c9Var);
                    }
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    m12584a(intent, this.f37461d);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderAccountAreaClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.c9$u */
    public static final class C13167u implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f37462d;

        /* renamed from: e */
        public final /* synthetic */ C13146c9 f37463e;

        /* renamed from: f */
        public final /* synthetic */ C55718s0 f37464f;

        /* renamed from: g */
        public final /* synthetic */ C64586nn1 f37465g;

        /* renamed from: h */
        public final /* synthetic */ int f37466h;

        /* renamed from: i */
        public final /* synthetic */ int f37467i;

        /* renamed from: j */
        public final /* synthetic */ int f37468j;

        /* renamed from: rs1.c9$u$a */
        public static final class C13168a extends C87413o implements C32226l<C55718s0, Boolean> {

            /* renamed from: d */
            public static final C13168a f37469d = new C13168a();

            public C13168a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((C55718s0) obj, LocaleUtil.ITALIAN);
                return Boolean.TRUE;
            }
        }

        public C13167u(int i, C13146c9 c9Var, C55718s0 s0Var, C64586nn1 nn12, int i2, int i3, int i4) {
            this.f37462d = i;
            this.f37463e = c9Var;
            this.f37464f = s0Var;
            this.f37465g = nn12;
            this.f37466h = i2;
            this.f37467i = i3;
            this.f37468j = i4;
        }

        public final void onClick(View view) {
            Class cls = C58417y0.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderMsgAreaClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C49712hj1 hj12 = null;
            if (this.f37462d > 0) {
                C37521f.f99374d.getClass();
                int i = C37521f.f99420i1.mo60266n().intValue() == 1 ? 0 : 2;
                if (this.f37462d > 0) {
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    C58417y0 y0Var = (C58417y0) c;
                    int i2 = this.f37462d;
                    C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f37463e.getActivity());
                    C58417y0.Nx0(y0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, 1, 2, 5, i, i2, (String) null, (String) null, 0, f != null ? f.mo12861q3() : null, 0, 0, 3520, (Object) null);
                }
            }
            C55718s0 s0Var = this.f37464f;
            C64586nn1 nn12 = this.f37465g;
            C13146c9 c9Var = this.f37463e;
            if (!(s0Var == null || nn12 == null)) {
                C58413v0 v0Var = C58413v0.f167346a;
                C13442s8 f2 = C13442s8.f38060Q0.mo12873f(c9Var.getActivity());
                if (f2 != null) {
                    hj12 = f2.mo12861q3();
                }
                C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, s0Var, nn12, 2, hj12, 0, (String) null, 0, 0, 480, (Object) null);
                C37521f.f99374d.getClass();
                C60152b4.C8759a.m8563c(((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0(), "AuthorProfileNotify", C13168a.f37469d, C37521f.f99431j3.mo60266n().intValue() == 0, (String) null, 8, (Object) null);
            }
            JSONObject jSONObject = new JSONObject();
            int i3 = this.f37466h;
            int i4 = this.f37467i;
            int i5 = this.f37468j;
            int i6 = this.f37462d;
            jSONObject.put("followCnt", i3);
            jSONObject.put("commentCnt", i4);
            jSONObject.put("likeCnt", i5);
            jSONObject.put("totalCnt", i6);
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
            C58417y0 y0Var2 = (C58417y0) c2;
            AppCompatActivity activity = this.f37463e.getActivity();
            C13146c9 c9Var2 = this.f37463e;
            long j = c9Var2.f37429y;
            boolean z = c9Var2.f37427w;
            int i7 = this.f37462d;
            boolean z2 = i7 > 0;
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "redDotCountDetail.toString()");
            C58417y0.ey0(y0Var2, activity, j, z, 2, 5, z2, (long) i7, C112551y.m153814n(jSONObject2, ",", ";", false), (String) null, 256, (Object) null);
            Intent intent = new Intent();
            C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
            C87412m.m108591d(b);
            if (b.mo84190n2()) {
                intent.setClass(this.f37463e.getActivity(), FinderExposeUI.class);
                AppCompatActivity activity2 = this.f37463e.getActivity();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppCompatActivity appCompatActivity = activity2;
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderMsgAreaClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderMsgAreaClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this.f37463e.getActivity(), intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                ((C58684b) C86312j.m106911c(C58684b.class)).Tx0(this.f37463e.getActivity(), intent);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderMsgAreaClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.c9$v */
    public static final class C13169v implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37470d;

        public C13169v(C13146c9 c9Var) {
            this.f37470d = c9Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderPostBtnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C13146c9 c9Var = this.f37470d;
            String str = C13146c9.f37394Q;
            c9Var.mo12649e3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderPostBtnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.c9$w */
    public static final class C13170w implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37471d;

        public C13170w(C13146c9 c9Var) {
            this.f37471d = c9Var;
        }

        public final void run() {
            this.f37471d.mo12649e3();
        }
    }

    /* renamed from: rs1.c9$x */
    public static final class C13171x implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f37472d;

        public C13171x(View view) {
            this.f37472d = view;
        }

        public final void run() {
            this.f37472d.performClick();
        }
    }

    /* renamed from: rs1.c9$y */
    public static final class C13172y extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C13146c9 f37473a;

        public C13172y(C13146c9 c9Var) {
            this.f37473a = c9Var;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (z) {
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f37473a.getActivity());
                C7435f2.f25626a.mo8577a(f != null ? f.mo12861q3() : null, "biz_identity_tips", 0, (JSONObject) null);
            }
        }
    }

    /* renamed from: rs1.c9$z */
    public static final class C13173z implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13146c9 f37474d;

        /* renamed from: e */
        public final /* synthetic */ C64284cg f37475e;

        public C13173z(C13146c9 c9Var, C64284cg cgVar) {
            this.f37474d = c9Var;
            this.f37475e = cgVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$refreshSelf$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f = aVar.mo12873f(this.f37474d.getActivity());
            C7435f2.f25626a.mo8577a(f != null ? f.mo12861q3() : null, "biz_identity_tips", 1, (JSONObject) null);
            C64284cg cgVar = this.f37475e;
            if (cgVar != null) {
                C13146c9 c9Var = this.f37474d;
                Intent intent = new Intent();
                C13442s8.C13443a.m12791e(aVar, c9Var.getActivity(), intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                intent.putExtra("Contact_User", cgVar.f182468d);
                intent.putExtra("Contact_Scene", 213);
                intent.putExtra("force_get_contact", true);
                intent.putExtra("key_use_new_contact_profile", true);
                intent.putExtra("biz_profile_tab_type", 1);
                C88144b.m109791i(c9Var.getActivity(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$refreshSelf$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    static {
        int i = 0;
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        if (c != null) {
            i = c.mo75251m2().f132499j;
        }
        f37395R = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13146c9(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C37521f.f99374d.getClass();
        this.f37407L = C37521f.f99376d2.mo60266n().intValue() > 0;
        this.f37408M = C36568h.m40985a(new C13162p(appCompatActivity));
        this.f37410P = "";
    }

    /* renamed from: F3 */
    public final void mo12642F3() {
        String str;
        C66785b bVar = C66785b.f191882e;
        String O5 = bVar.mo90662O5();
        C54446b c = C66783a.C66784a.m78800c(bVar, false, 1, (Object) null);
        if (c == null || (str = c.mo75251m2().f132488E) == null) {
            str = "";
        }
        TextView textView = (TextView) findViewById(C0966R.C0970id.bwh);
        View findViewById = findViewById(C0966R.C0970id.bwi);
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77246R5("CreatorCenter");
        Log.m105924i(C54492n.TAG, "setCreatorCenterHint defaultUsername:" + O5 + " hint:" + str + " showInfo:" + R5);
        if (R5 == null && !Util.isNullOrNil(str)) {
            textView.setText(str);
            textView.setVisibility(0);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setCreatorCenterHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setCreatorCenterHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: G3 */
    public final void mo12643G3(boolean z) {
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        C37521f.f99199I7.getClass();
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_FAV_TIPS_BOOLEAN_SYNC;
        boolean g = i.mo119686g(aVar, true);
        fVar.getClass();
        if (C37521f.f99190H7.mo60266n().intValue() == 1) {
            if (!z || !g) {
                ((TextView) findViewById(C0966R.C0970id.mpx)).setVisibility(8);
                View findViewById = findViewById(C0966R.C0970id.mpy);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setFavTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setFavTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.FALSE);
            } else {
                ((TextView) findViewById(C0966R.C0970id.mpx)).setVisibility(0);
                View findViewById2 = findViewById(C0966R.C0970id.mpy);
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setFavTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setFavTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            Log.m105918d(C54492n.TAG, "");
        }
    }

    /* renamed from: I3 */
    public final void mo12644I3(boolean z) {
        boolean z2 = z;
        C32444a aVar = C32444a.f86121a;
        boolean z3 = true;
        if (C32444a.f86039B2.mo60266n().intValue() == 1 || !C85875k4.m106210y()) {
            z3 = false;
        }
        Log.m105924i(C54492n.TAG, "setLivePostBtnVisible is pad:" + z3 + ",visible:" + z2);
        if (!z2 || z3) {
            View view = this.f37426v;
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view3 = this.f37420p;
            if (view3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        View view5 = this.f37420p;
        if (view5 != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view7 = this.f37426v;
        if (view7 != null) {
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar5.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: O */
    public void mo12645O() {
        Log.m105924i(C54492n.TAG, "onAccountChanged");
        mo12657n3();
    }

    /* renamed from: Y0 */
    public void mo12646Y0() {
        C0317e.launchUI$default(this, (C66212f) null, (C53934p0) null, new C13155i(this, (C15601d<? super C13155i>) null), 3, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: te3.le1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: te3.le1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: te3.le1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: te3.le1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: te3.le1} */
    /* JADX WARNING: type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12647c3(android.view.View r18, android.view.View r19) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Class<pl1.s0> r1 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            java.lang.String r3 = "SimpleUIComponent"
            java.lang.String r4 = "账户审核中"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r4)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r5)
            java.lang.Object[] r7 = r3.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r9 = "canPostButRevingUi"
            java.lang.String r10 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r19
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r6.setVisibility(r3)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r8 = "canPostButRevingUi"
            java.lang.String r9 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r6)
            java.lang.Object[] r8 = r3.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r10 = "canPostButRevingUi"
            java.lang.String r11 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r18
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r6 = r18
            r6.setVisibility(r3)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r8 = "canPostButRevingUi"
            java.lang.String r9 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            r3 = 2131302683(0x7f09191b, float:1.822346E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r6 = 2131304532(0x7f092054, float:1.822721E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131304799(0x7f09215f, float:1.822775E38)
            android.view.View r7 = r0.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131309600(0x7f093420, float:1.8237488E38)
            android.view.View r8 = r0.findViewById(r8)
            r9 = 2131304518(0x7f092046, float:1.822718E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setVisibility(r4)
            r9 = 2131304516(0x7f092044, float:1.8227177E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setVisibility(r4)
            er1.w3 r4 = er1.C58784w3.f168295a
            r4.mo83961s()
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r9)
            java.lang.Object[] r10 = r4.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r12 = "canPostButRevingUi"
            java.lang.String r13 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r8
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r8.setVisibility(r4)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r11 = "canPostButRevingUi"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            rs1.c9$a r4 = new rs1.c9$a
            r4.<init>(r0)
            r8.setOnClickListener(r4)
            te3.ke1 r4 = r0.f37412e
            java.lang.String r8 = ""
            r9 = 0
            if (r4 == 0) goto L_0x016e
            java.util.LinkedList<te3.zg3> r4 = r4.f136709z
            if (r4 == 0) goto L_0x016e
            java.util.Iterator r4 = r4.iterator()
        L_0x0127:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0145
            java.lang.Object r10 = r4.next()
            r11 = r10
            te3.zg3 r11 = (te3.C52261zg3) r11
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r11.f145918e
            if (r11 == 0) goto L_0x013b
            java.lang.String r11 = r11.username
            goto L_0x013c
        L_0x013b:
            r11 = r9
        L_0x013c:
            java.lang.String r12 = r0.f37411d
            boolean r11 = gy3.C87412m.m108589b(r11, r12)
            if (r11 == 0) goto L_0x0127
            goto L_0x0146
        L_0x0145:
            r10 = r9
        L_0x0146:
            te3.zg3 r10 = (te3.C52261zg3) r10
            if (r10 == 0) goto L_0x016e
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r10.f145918e
            if (r4 == 0) goto L_0x0151
            java.lang.String r4 = r4.nickname
            goto L_0x0152
        L_0x0151:
            r4 = r9
        L_0x0152:
            if (r4 != 0) goto L_0x0155
            r4 = r8
        L_0x0155:
            int r11 = r4.length()
            if (r11 != 0) goto L_0x015d
            r11 = 1
            goto L_0x015e
        L_0x015d:
            r11 = 0
        L_0x015e:
            if (r11 == 0) goto L_0x016b
            te3.le1 r4 = r10.f145917d
            if (r4 == 0) goto L_0x0166
            java.lang.String r9 = r4.f137360h
        L_0x0166:
            if (r9 != 0) goto L_0x016a
            r4 = r8
            goto L_0x016b
        L_0x016a:
            r4 = r9
        L_0x016b:
            te3.le1 r9 = r10.f145917d
            goto L_0x016f
        L_0x016e:
            r4 = r8
        L_0x016f:
            bl3.r r10 = bl3.C39818r.f106831a
            bl3.r$a r10 = r10.mo62446e(r2)
            bl3.c r10 = r10.mo62447c(r1)
            pl1.s0 r10 = (pl1.C11990s0) r10
            k60.d r10 = r10.mo11872i2()
            pl1.f r11 = new pl1.f
            if (r9 == 0) goto L_0x0189
            java.lang.String r9 = r9.f137361i
            if (r9 != 0) goto L_0x0188
            goto L_0x0189
        L_0x0188:
            r8 = r9
        L_0x0189:
            up1.y r9 = up1.C27696y.ORIGIN_AVATAR_IMAGE
            r11.<init>(r8, r9)
            java.lang.String r8 = "finderAvatar"
            gy3.C87412m.m108593f(r3, r8)
            pl1.e0$a r8 = pl1.C11978e0.C11979a.AVATAR
            bl3.r r9 = bl3.C39818r.f106831a
            bl3.r$a r2 = r9.mo62446e(r2)
            bl3.c r1 = r2.mo62447c(r1)
            pl1.s0 r1 = (pl1.C11990s0) r1
            n60.f r1 = r1.mo11867O2(r8)
            r10.mo85957c(r11, r3, r1)
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            androidx.appcompat.app.AppCompatActivity r2 = r17.getActivity()
            android.text.SpannableString r1 = r1.mo107057T1(r2, r4)
            r6.setText(r1)
            android.text.TextPaint r1 = r6.getPaint()
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r1, r2)
            r7.setVisibility(r5)
            android.content.res.Resources r1 = r17.getResources()
            r2 = 2131829826(0x7f112442, float:1.9292632E38)
            java.lang.String r1 = r1.getString(r2)
            r7.setText(r1)
            r1 = 2131302589(0x7f0918bd, float:1.8223268E38)
            android.view.View r2 = r0.findViewById(r1)
            rs1.c9$b r3 = new rs1.c9$b
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            android.content.Intent r2 = r17.getIntent()
            java.lang.String r3 = "key_from_sns_post"
            boolean r2 = r2.getBooleanExtra(r3, r5)
            if (r2 == 0) goto L_0x0208
            te3.ke1 r2 = r0.f37412e
            if (r2 == 0) goto L_0x0208
            android.view.View r1 = r0.findViewById(r1)
            rs1.c9$c r2 = new rs1.c9$c
            r2.<init>(r0)
            r1.post(r2)
            android.content.Intent r1 = r17.getIntent()
            r1.removeExtra(r3)
        L_0x0208:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13146c9.mo12647c3(android.view.View, android.view.View):void");
    }

    /* renamed from: d3 */
    public final void mo12648d3() {
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            View findViewById = findViewById(C0966R.C0970id.e6v);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = findViewById(C0966R.C0970id.g3k);
            if (findViewById2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById3 = findViewById(C0966R.C0970id.fer);
            if (findViewById3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                C117292a.m165358d(findViewById3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById4 = findViewById(C0966R.C0970id.feq);
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(8);
            C117292a.m165358d(findViewById4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e3 */
    public final void mo12649e3() {
        Class cls = C58247e.class;
        if (!C11767a.f34453a.mo11659a("post")) {
            String str = C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond();
            int i = C60999e.f173723a.mo85970a((Long) null, 5) ? 9 : this.f37404I ? 4 : this.f37405J ? 15 : 3;
            C58408t0 t0Var = C58408t0.f167336a;
            t0Var.mo83261g(false, i);
            if (((C0145d1) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C0145d1.class)).mo136d3(new C13150d(this), new C13151e(this))) {
                t0Var.mo83263i(getContext(), 59);
                t0Var.mo83265k(str, (String) null);
                C77407n a = C0143d.f574a.mo134a(getActivity());
                a.f225771i = new C13152f(this);
                a.f225782p = new C13153g(this, i, str, str);
                a.f225761d = C13154h.f37441a;
                a.mo107573q();
                if (((C58247e) C86312j.m106911c(cls)).yf0().mo8429d()) {
                    ((C58247e) C86312j.m106911c(cls)).mo82983Vh(0);
                }
            }
        }
    }

    /* renamed from: f3 */
    public final String mo12650f3(C64586nn1 nn12) {
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        int i = c != null ? c.field_systemMsgCount : 0;
        JSONObject jSONObject = new JSONObject();
        int i2 = nn12 != null ? nn12.f184503e : 0 - i;
        if (i2 < 0) {
            i2 = 0;
        }
        jSONObject.put("personalCnt", i2);
        jSONObject.put("finderteamCnt", i);
        jSONObject.put("totalCnt", nn12 != null ? nn12.f184503e : 0);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "detail.toString()");
        return C112551y.m153814n(jSONObject2, ",", ";", false);
    }

    /* renamed from: g3 */
    public final C8761d3 mo12651g3() {
        return (C8761d3) ((C36570n) this.f37408M).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.apg;
    }

    /* renamed from: i3 */
    public final long mo12652i3() {
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77246R5("finder_wx_private_msg_entrance");
        if (R5 != null) {
            return (long) R5.f184503e;
        }
        return 0;
    }

    /* renamed from: i4 */
    public void mo3121i4(C50401mh0 mh02, int i, int i2) {
        C87412m.m108594g(mh02, "cmdItem");
        Log.m105924i(C54492n.TAG, "cmdId " + mh02.f138028d);
        int i3 = mh02.f138028d;
        if (i3 == 101 || i3 == 111) {
            mo12657n3();
        }
    }

    /* renamed from: j3 */
    public final void mo12653j3() {
        boolean u = C61926c.m72696u(f37395R, 1);
        boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
        C13887q1 q1Var = (C13887q1) C86312j.m106911c(C13887q1.class);
        C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
        boolean Zh0 = q1Var.Zh0(b != null ? b.field_liveSwitchFlag : 0);
        View findViewById = findViewById(C0966R.C0970id.fua);
        C58784w3 w3Var = C58784w3.f168295a;
        boolean z0 = w3Var.mo83983z0();
        int q = C58784w3.m68441q(w3Var, (String) null, 1, (Object) null);
        Log.m105924i(C54492n.TAG, "initLiveIncomeCell FinderLive.entrance,xLab enable live:" + C32444a.f86121a.mo58620a() + ", hasAccount:" + z0 + ", server flag:" + f37395R + ", server enable live:" + u + " rewardGainEnable:" + Zh0 + "， accountState:" + q);
        if (e || (z0 && (q == 3 || q == 6))) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initLiveRewardGainCell", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initLiveRewardGainCell", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initLiveRewardGainCell", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initLiveRewardGainCell", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new C13156j(this));
        C2479n0 n0Var = C2479n0.f12955a;
        C61926c.m72695t(C2479n0.f12948E, getActivity(), new C13157k(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x02d8  */
    /* renamed from: k3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12654k3() {
        /*
            r25 = this;
            r0 = r25
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r1 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            te3.ke1 r2 = r0.f37412e
            r3 = 0
            if (r2 == 0) goto L_0x0037
            java.util.LinkedList<te3.zg3> r2 = r2.f136709z
            if (r2 == 0) goto L_0x0037
            java.util.Iterator r2 = r2.iterator()
        L_0x0011:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x002f
            java.lang.Object r4 = r2.next()
            r5 = r4
            te3.zg3 r5 = (te3.C52261zg3) r5
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.f145918e
            if (r5 == 0) goto L_0x0025
            java.lang.String r5 = r5.username
            goto L_0x0026
        L_0x0025:
            r5 = r3
        L_0x0026:
            java.lang.String r6 = r0.f37411d
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 == 0) goto L_0x0011
            goto L_0x0030
        L_0x002f:
            r4 = r3
        L_0x0030:
            te3.zg3 r4 = (te3.C52261zg3) r4
            if (r4 == 0) goto L_0x0037
            int r2 = r4.f145924n
            goto L_0x0039
        L_0x0037:
            int r2 = f37395R
        L_0x0039:
            f37395R = r2
            r4 = 1
            boolean r2 = o40.C61926c.m72696u(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "FinderLive.entrance,xLab enable live:"
            r4.append(r5)
            gg1.a r5 = gg1.C32444a.f86121a
            boolean r6 = r5.mo58620a()
            r4.append(r6)
            java.lang.String r6 = ", server flag:"
            r4.append(r6)
            int r6 = f37395R
            r4.append(r6)
            java.lang.String r6 = ", server enable live:"
            r4.append(r6)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            er1.w3 r4 = er1.C58784w3.f168295a
            boolean r4 = r4.mo83910X0()
            r6 = 2131311127(0x7f093a17, float:1.8240586E38)
            r7 = 8
            r8 = 2131311107(0x7f093a03, float:1.8240545E38)
            r9 = 0
            if (r4 != 0) goto L_0x013d
            boolean r4 = r5.mo58620a()
            if (r4 != 0) goto L_0x013d
            if (r2 == 0) goto L_0x0089
            goto L_0x013d
        L_0x0089:
            android.view.View r1 = r0.findViewById(r8)
            java.lang.String r2 = "findViewById<View>(R.id.postBtn)"
            gy3.C87412m.m108593f(r1, r2)
            r0.f37415h = r1
            r1 = 2131304577(0x7f092081, float:1.82273E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "findViewById(com.tencent….id.finder_post_new_feed)"
            gy3.C87412m.m108593f(r1, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f37416i = r1
            r1 = 2131302698(0x7f09192a, float:1.822349E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "findViewById(com.tencent…nder_can_post_no_contact)"
            gy3.C87412m.m108593f(r1, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f37417j = r1
            android.view.View r1 = r0.findViewById(r8)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r2.mo10233c(r4)
            java.lang.Object[] r11 = r2.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r13 = "initPostBtn"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r1
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r2 = r2.mo10231a(r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r12 = "initPostBtn"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.view.View r1 = r0.findViewById(r6)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r4)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r20 = "initPostBtn"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r2 = r2.mo10231a(r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r19 = "initPostBtn"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0281
        L_0x013d:
            r2 = 2131311109(0x7f093a05, float:1.824055E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r4 = "findViewById<View>(com.t…ase.api.R.id.postBtn_new)"
            gy3.C87412m.m108593f(r2, r4)
            r0.f37415h = r2
            r2 = 2131304578(0x7f092082, float:1.8227303E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r4 = "findViewById(com.tencent…finder_post_new_feed_new)"
            gy3.C87412m.m108593f(r2, r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f37416i = r2
            r2 = 2131302699(0x7f09192b, float:1.8223491E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r4 = "findViewById(com.tencent…_can_post_no_contact_new)"
            gy3.C87412m.m108593f(r2, r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f37417j = r2
            r2 = 2131307386(0x7f092b7a, float:1.8232998E38)
            android.view.View r2 = r0.findViewById(r2)
            r0.f37420p = r2
            r2 = 2131307591(0x7f092c47, float:1.8233414E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f37421q = r2
            r2 = 2131304123(0x7f091ebb, float:1.822638E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f37422r = r2
            r2 = 2131302697(0x7f091929, float:1.8223487E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f37423s = r2
            r2 = 2131304574(0x7f09207e, float:1.8227294E38)
            android.view.View r2 = r0.findViewById(r2)
            r0.f37426v = r2
            android.view.View r2 = r0.findViewById(r8)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r4.mo10233c(r5)
            java.lang.Object[] r11 = r4.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r13 = "initPostBtn"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r2
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r4 = r4.mo10231a(r9)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r12 = "initPostBtn"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.view.View r2 = r0.findViewById(r6)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r4.mo10233c(r5)
            java.lang.Object[] r18 = r4.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r20 = "initPostBtn"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r4 = r4.mo10231a(r9)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r19 = "initPostBtn"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            boolean r2 = r0.f37403H
            if (r2 != 0) goto L_0x022c
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x022f
        L_0x022c:
            r2 = 1050253722(0x3e99999a, float:0.3)
        L_0x022f:
            android.widget.ImageView r4 = r0.f37421q
            if (r4 != 0) goto L_0x0234
            goto L_0x0237
        L_0x0234:
            r4.setAlpha(r2)
        L_0x0237:
            android.widget.TextView r4 = r0.f37422r
            if (r4 != 0) goto L_0x023c
            goto L_0x023f
        L_0x023c:
            r4.setAlpha(r2)
        L_0x023f:
            android.widget.TextView r4 = r0.f37423s
            if (r4 != 0) goto L_0x0244
            goto L_0x0247
        L_0x0244:
            r4.setAlpha(r2)
        L_0x0247:
            di3.d r2 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r2 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r2
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r2 = r2.Nt0()
            java.lang.String r4 = "FinderSelfLiveEntrance"
            te3.nn1 r2 = r2.mo77246R5(r4)
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r1 = r1.mo77227G5(r4)
            android.view.View r4 = r0.f37420p
            if (r4 == 0) goto L_0x0271
            rs1.c9$l r5 = new rs1.c9$l
            r5.<init>(r0, r1, r2)
            r4.setOnClickListener(r5)
        L_0x0271:
            com.tencent.mm.plugin.finder.extension.reddot.n0 r4 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12955a
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r4 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12976v
            androidx.appcompat.app.AppCompatActivity r5 = r25.getActivity()
            rs1.c9$m r6 = new rs1.c9$m
            r6.<init>(r0, r1, r2)
            o40.C61926c.m72695t(r4, r5, r6)
        L_0x0281:
            android.view.View r1 = r0.f37415h
            if (r1 == 0) goto L_0x02d8
            rs1.c9$n r2 = new rs1.c9$n
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            r1 = 2131312034(0x7f093da2, float:1.8242425E38)
            android.view.View r1 = r0.findViewById(r1)
            r0.f37424t = r1
            if (r1 != 0) goto L_0x0299
            goto L_0x02d7
        L_0x0299:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r3)
            java.lang.Object[] r11 = r2.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r13 = "initPostBtn"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r1
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r2 = r2.mo10231a(r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r12 = "initPostBtn"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x02d7:
            return
        L_0x02d8:
            java.lang.String r1 = "finderPosBtn"
            gy3.C87412m.m108603p(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13146c9.mo12654k3():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r1 != null) goto L_0x005e;
     */
    /* renamed from: l3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12655l3() {
        /*
            r25 = this;
            r0 = r25
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99465n4
            java.lang.Object r2 = r1.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r4 = 2
            r5 = 1
            if (r2 != r4) goto L_0x001a
            java.lang.String r1 = "https://channels.weixin.qq.com/mobile/creator_center.html"
            goto L_0x005e
        L_0x001a:
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r5) goto L_0x0029
            java.lang.String r1 = "https://channels.weixin.qq.com/mobile-support/pages/creator/center"
            goto L_0x005e
        L_0x0029:
            te3.ke1 r1 = r0.f37412e
            if (r1 == 0) goto L_0x005c
            java.util.LinkedList<te3.zg3> r1 = r1.f136709z
            if (r1 == 0) goto L_0x005c
            java.util.Iterator r1 = r1.iterator()
        L_0x0035:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0053
            java.lang.Object r2 = r1.next()
            r4 = r2
            te3.zg3 r4 = (te3.C52261zg3) r4
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f145918e
            if (r4 == 0) goto L_0x0049
            java.lang.String r4 = r4.username
            goto L_0x004a
        L_0x0049:
            r4 = 0
        L_0x004a:
            java.lang.String r6 = r0.f37411d
            boolean r4 = gy3.C87412m.m108589b(r4, r6)
            if (r4 == 0) goto L_0x0035
            goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            te3.zg3 r2 = (te3.C52261zg3) r2
            if (r2 == 0) goto L_0x005c
            java.lang.String r1 = r2.f145925o
            if (r1 != 0) goto L_0x005e
        L_0x005c:
            java.lang.String r1 = f37394Q
        L_0x005e:
            int r2 = r1.length()
            r4 = 0
            if (r2 <= 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r5 = 0
        L_0x0067:
            r2 = 8
            r6 = 2131304591(0x7f09208f, float:1.8227329E38)
            java.lang.String r7 = "finderPosterEntrance"
            if (r5 == 0) goto L_0x0115
            boolean r5 = r0.f37403H
            if (r5 != 0) goto L_0x0115
            f37394Q = r1
            android.view.View r5 = r0.findViewById(r6)
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r15.mo10233c(r8)
            java.lang.Object[] r9 = r15.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r11 = "initPosterEntrance"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r8 = r5
            r3 = r15
            r15 = r16
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r5.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r10 = "initPosterEntrance"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.view.View r3 = r0.f37418n
            if (r3 == 0) goto L_0x0110
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.mo10233c(r2)
            java.lang.Object[] r18 = r5.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r20 = "initPosterEntrance"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r3
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r2 = r5.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r19 = "initPosterEntrance"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            r25.mo12642F3()
            android.view.View r2 = r0.findViewById(r6)
            rs1.c9$o r3 = new rs1.c9$o
            r3.<init>(r0, r1)
            r2.setOnClickListener(r3)
            goto L_0x0127
        L_0x0110:
            gy3.C87412m.m108603p(r7)
            r1 = 0
            throw r1
        L_0x0115:
            boolean r1 = r0.f37406K
            android.view.View r3 = r0.f37418n
            if (r3 == 0) goto L_0x0128
            r3.setEnabled(r1)
            android.view.View r1 = r0.findViewById(r6)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1.setVisibility(r2)
        L_0x0127:
            return
        L_0x0128:
            gy3.C87412m.m108603p(r7)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13146c9.mo12655l3():void");
    }

    /* renamed from: m3 */
    public final void mo12656m3(View view, View view2) {
        TextView textView;
        TextView textView2;
        int i;
        int i2;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = FinderCommonFeatureService.class;
        Log.m105918d(C54492n.TAG, "账户正常");
        ((FinderCommonFeatureService) C86312j.m106911c(cls3)).Nt0().mo77239M5("TLCamera");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        Class<C58417y0> cls4 = C58417y0.class;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById = findViewById(C0966R.C0970id.d5k);
        View findViewById2 = findViewById(C0966R.C0970id.f358782h21);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.d79);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.e3u);
        TextView textView4 = (TextView) findViewById(C0966R.C0970id.e3j);
        TextView textView5 = (TextView) findViewById(C0966R.C0970id.izp);
        C58961d.C58963b bVar = C58961d.f168673a;
        String str = this.f37411d;
        C87412m.m108591d(str);
        C58969q b = bVar.mo84155b(str);
        ImageView imageView2 = (ImageView) findViewById(C0966R.C0970id.a0g);
        if (this.f37407L) {
            View findViewById3 = findViewById(C0966R.C0970id.jb7);
            C9556a aVar3 = new C9556a();
            textView = textView5;
            aVar3.mo10233c(0);
            View view4 = findViewById3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2 = textView4;
        } else {
            textView = textView5;
            View findViewById4 = findViewById(C0966R.C0970id.jb7);
            C9556a aVar4 = new C9556a();
            textView2 = textView4;
            aVar4.mo10233c(8);
            View view5 = findViewById4;
            C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (b != null) {
            C60979d<C100810g0> i25 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2();
            C62345f fVar = new C62345f(b.mo84172g0(), C27696y.ORIGIN_AVATAR_IMAGE);
            C87412m.m108593f(imageView, "finderAvatar");
            i25.mo85957c(fVar, imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            textView3.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getActivity(), b.mo84196w1()));
            C85875k4.m106189j0(textView3.getPaint(), 0.8f);
            C58784w3 w3Var = C58784w3.f168295a;
            C87412m.m108593f(imageView2, "authIcon");
            C58784w3.m68429F1(w3Var, imageView2, b.field_authInfo, 0, (C64284cg) null, 12, (Object) null);
            FinderAuthInfo finderAuthInfo = b.field_authInfo;
            int i3 = finderAuthInfo != null ? finderAuthInfo.authIconType : 0;
            C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
            int i4 = c != null ? c.mo75251m2().f132484A : 0;
            if (i4 > 0) {
                TextView textView6 = (TextView) findViewById(C0966R.C0970id.d_3);
                if (textView6 != null) {
                    textView6.setVisibility(0);
                    textView6.setText(getActivity().getResources().getString(C0966R.string.f360497d81, new Object[]{String.valueOf(i4)}));
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            } else {
                View findViewById5 = findViewById(C0966R.C0970id.d_3);
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                C117292a.m165358d(findViewById5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            textView3.post(new C13163q(this, textView3, imageView2));
            i2 = i3;
            i = i4;
        } else {
            i2 = 0;
            i = 0;
        }
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(0);
        int i5 = i2;
        TextView textView7 = textView;
        int i6 = i;
        TextView textView8 = textView2;
        TextView textView9 = textView3;
        View view6 = findViewById2;
        View view7 = findViewById;
        C117292a.m165358d(findViewById, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C9556a aVar7 = new C9556a();
        aVar7.mo10233c(0);
        View view8 = view6;
        C117292a.m165358d(view8, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (findViewById(C0966R.C0970id.e4e).getVisibility() == 0 || this.f37403H) {
            View view9 = this.f37418n;
            if (view9 != null) {
                C9556a aVar8 = new C9556a();
                aVar8.mo10233c(8);
                C117292a.m165358d(view9, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C87412m.m108603p("finderPosterEntrance");
                throw null;
            }
        } else {
            View view10 = this.f37418n;
            if (view10 != null) {
                C9556a aVar9 = new C9556a();
                aVar9.mo10233c(0);
                View view11 = view10;
                C117292a.m165358d(view11, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view12 = this.f37418n;
                if (view12 != null) {
                    ViewGroup viewGroup = (ViewGroup) view12;
                    AppCompatActivity activity = getActivity();
                    C87412m.m108594g(activity, "owner");
                    viewGroup.setOnClickListener(C7784b2.f26284d);
                    View findViewById6 = viewGroup.findViewById(C0966R.C0970id.bwc);
                    C9556a aVar10 = new C9556a();
                    aVar10.mo10233c(4);
                    View view13 = findViewById6;
                    C117292a.m165358d(view13, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/utils/FinderPosterCenterUtil", "initEntrance", "(Landroid/view/ViewGroup;Landroidx/lifecycle/LifecycleOwner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                    C117292a.m165359e(view13, "com/tencent/mm/plugin/finder/utils/FinderPosterCenterUtil", "initEntrance", "(Landroid/view/ViewGroup;Landroidx/lifecycle/LifecycleOwner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C61926c.m72695t(C2479n0.f12950G, activity, new C7789c2(findViewById6));
                } else {
                    C87412m.m108603p("finderPosterEntrance");
                    throw null;
                }
            } else {
                C87412m.m108603p("finderPosterEntrance");
                throw null;
            }
        }
        int[] a = C2483o0.C2484a.m2362a(C2483o0.f12984a, (String) null, 1, (Object) null);
        int i7 = a[0];
        int i8 = a[1];
        int i9 = a[2];
        Log.m105924i(C54492n.TAG, "redDot check likeCount :" + i7 + " commentCount " + i8 + " followCount " + i9 + ' ');
        C13166t tVar = new C13166t(this);
        view7.setTag(C0966R.C0970id.iwc, tVar);
        view7.setOnClickListener(tVar);
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls3)).Nt0().mo77227G5("AuthorProfileNotify");
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls3)).Nt0().mo77246R5("AuthorProfileNotify");
        int i15 = R5 != null ? R5.f184503e : 0;
        int i16 = R5 != null ? R5.f184502d : 0;
        String str2 = C54492n.TAG;
        C13167u uVar = r0;
        int i17 = i16;
        C64586nn1 nn12 = R5;
        int i18 = i9;
        int i19 = i8;
        C13167u uVar2 = new C13167u(i15, this, G5, R5, i9, i8, i7);
        view6.setTag(C0966R.C0970id.iwc, uVar);
        view6.setOnClickListener(uVar);
        if (i15 > 0) {
            textView7.setVisibility(8);
            textView8.setVisibility(0);
            textView8.setText(i15 > 999 ? "· · ·" : String.valueOf(i15));
            textView8.setBackgroundResource(C45081s1.m49933b(getContext(), i15));
            textView8.setTextSize(0, ((float) C76577a.m92155f(getActivity(), C0966R.dimen.ary)) * C76577a.m92161l(getActivity()));
            if (!this.f37413f) {
                this.f37413f = true;
                C37521f.f99374d.getClass();
                int i26 = C37521f.f99420i1.mo60266n().intValue() == 1 ? 0 : 2;
                if (i15 > 0) {
                    C7335d c2 = C86312j.m106911c(cls4);
                    C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
                    C58417y0 y0Var = (C58417y0) c2;
                    C13442s8 f = C13442s8.f38060Q0.mo12873f(getActivity());
                    C58417y0.Nx0(y0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, 1, 1, 5, i26, i15, (String) null, (String) null, 0, f != null ? f.mo12861q3() : null, 0, 0, 3520, (Object) null);
                }
                if (!(G5 == null || nn12 == null)) {
                    C58413v0 v0Var = C58413v0.f167346a;
                    C13442s8 f2 = C13442s8.f38060Q0.mo12873f(getActivity());
                    C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, G5, nn12, 1, f2 != null ? f2.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
                    C13598b0 b0Var2 = C13598b0.f38549a;
                }
            }
            view6.setTag(C0966R.C0970id.d55, Integer.valueOf(i15));
        } else if (i15 == 0 && i17 == 1) {
            textView8.setVisibility(8);
            textView7.setVisibility(0);
            view6.setTag(C0966R.C0970id.d55, 0);
        } else {
            textView8.setVisibility(8);
            textView7.setVisibility(8);
            view6.setTag(C0966R.C0970id.d55, 0);
        }
        C13169v vVar = new C13169v(this);
        View view14 = this.f37415h;
        if (view14 != null) {
            view14.setTag(C0966R.C0970id.iwc, vVar);
            View view15 = this.f37415h;
            if (view15 != null) {
                view15.setOnClickListener(vVar);
                View view16 = this.f37415h;
                if (view16 != null) {
                    C9556a aVar11 = new C9556a();
                    aVar11.mo10233c(0);
                    View view17 = view16;
                    C117292a.m165358d(view17, aVar11.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view16.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                    C117292a.m165359e(view17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    mo12644I3(true);
                    if (getIntent().getBooleanExtra("key_from_sns_post", false)) {
                        View view18 = this.f37415h;
                        if (view18 != null) {
                            view18.post(new C13164r(this));
                            getIntent().removeExtra("key_from_sns_post");
                        } else {
                            C87412m.m108603p("finderPosBtn");
                            throw null;
                        }
                    }
                    if (!this.f37430z) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("followCnt", i18);
                        jSONObject.put("commentCnt", i19);
                        jSONObject.put("likeCnt", i7);
                        jSONObject.put("totalCnt", i15);
                        C13598b0 b0Var3 = C13598b0.f38549a;
                        C7335d c3 = C86312j.m106911c(cls4);
                        C87412m.m108593f(c3, "getService(FinderReportLogic::class.java)");
                        C58417y0 y0Var2 = (C58417y0) c3;
                        AppCompatActivity activity2 = getActivity();
                        long j = this.f37429y;
                        boolean z = this.f37427w;
                        boolean z2 = i15 > 0;
                        String jSONObject2 = jSONObject.toString();
                        C87412m.m108593f(jSONObject2, "redDotCountDetail.toString()");
                        C58417y0.ey0(y0Var2, activity2, j, z, 1, 5, z2, (long) i15, C112551y.m153814n(jSONObject2, ",", ";", false), (String) null, 256, (Object) null);
                        this.f37430z = true;
                    }
                    Log.m105924i(str2, "show finder msg red, totalCount:" + i15);
                    String str3 = this.f37411d;
                    if (str3 != null) {
                        TextView textView10 = (TextView) findViewById(C0966R.C0970id.e75);
                        C0264h P2 = C66785b.f191882e.mo90663P2(str3);
                        if (P2 != null) {
                            if (P2.f818a == 1) {
                                LinearLayout linearLayout = (LinearLayout) view;
                                int childCount = linearLayout.getChildCount();
                                for (int i27 = 0; i27 < childCount; i27++) {
                                    View childAt = linearLayout.getChildAt(i27);
                                    if (childAt != null) {
                                        int id = childAt.getId();
                                        if (id == C0966R.C0970id.d5k) {
                                            C9556a aVar12 = new C9556a();
                                            aVar12.mo10233c(0);
                                            View view19 = childAt;
                                            C117292a.m165358d(view19, aVar12.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            childAt.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                                            C117292a.m165359e(view19, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        } else if (id == C0966R.C0970id.f358938i00) {
                                            C9556a aVar13 = new C9556a();
                                            aVar13.mo10233c(8);
                                            View view20 = childAt;
                                            C117292a.m165358d(view20, aVar13.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            childAt.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
                                            C117292a.m165359e(view20, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        } else {
                                            childAt.setOnClickListener(new C13165s(this));
                                        }
                                        C13598b0 b0Var4 = C13598b0.f38549a;
                                    }
                                }
                                textView10.setVisibility(0);
                                textView10.setText(getActivity().getString(C0966R.string.cxx));
                            } else {
                                LinearLayout linearLayout2 = (LinearLayout) view;
                                int childCount2 = linearLayout2.getChildCount();
                                for (int i28 = 0; i28 < childCount2; i28++) {
                                    View childAt2 = linearLayout2.getChildAt(i28);
                                    if (childAt2 != null) {
                                        Object tag = childAt2.getTag(C0966R.C0970id.iwc);
                                        View.OnClickListener onClickListener = tag instanceof View.OnClickListener ? (View.OnClickListener) tag : null;
                                        if (onClickListener != null) {
                                            childAt2.setOnClickListener(onClickListener);
                                            C13598b0 b0Var5 = C13598b0.f38549a;
                                        }
                                    }
                                }
                                textView10.setText("");
                                textView10.setVisibility(8);
                            }
                            C13598b0 b0Var6 = C13598b0.f38549a;
                        }
                    }
                    View findViewById7 = findViewById(C0966R.C0970id.d5k);
                    if (findViewById7 != null) {
                        findViewById7.setTag(C0966R.C0970id.d58, textView9.getText());
                        findViewById7.setTag(C0966R.C0970id.d3t, Integer.valueOf(i6));
                        findViewById7.setTag(C0966R.C0970id.d3i, Integer.valueOf(i5));
                        C13598b0 b0Var7 = C13598b0.f38549a;
                        return;
                    }
                    return;
                }
                C87412m.m108603p("finderPosBtn");
                throw null;
            }
            C87412m.m108603p("finderPosBtn");
            throw null;
        }
        C87412m.m108603p("finderPosBtn");
        throw null;
    }

    /* renamed from: n3 */
    public final void mo12657n3() {
        C66785b bVar;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        LinkedList<hk4> linkedList;
        LinkedList<hk4> linkedList2;
        C11978e0.C11979a aVar = C11978e0.C11979a.AVATAR;
        Class<C60200t1> cls = C60200t1.class;
        Class cls2 = C11990s0.class;
        C66785b bVar2 = C66785b.f191882e;
        this.f37411d = bVar2.mo90662O5();
        C54446b c = C66783a.C66784a.m78800c(bVar2, false, 1, (Object) null);
        this.f37403H = c != null ? c.mo75252n2() : false;
        Log.m105924i(C54492n.TAG, "myFinderUser " + this.f37411d);
        mo12654k3();
        mo12653j3();
        mo12655l3();
        C39818r rVar = C39818r.f106831a;
        ((C8783m1) rVar.mo62444c(getActivity()).mo62447c(C8783m1.class)).mo8759A();
        View findViewById = findViewById(C0966R.C0970id.eti);
        View findViewById2 = findViewById(C0966R.C0970id.hgd);
        C50119ke1 ke12 = this.f37412e;
        if (!((ke12 == null || (linkedList2 = ke12.f136686C) == null || !(linkedList2.isEmpty() ^ true)) ? false : true)) {
            bVar = bVar2;
            str3 = "";
            str4 = "key_from_sns_post";
            C58784w3 w3Var = C58784w3.f168295a;
            switch (C58784w3.m68441q(w3Var, (String) null, 1, (Object) null)) {
                case 1:
                    View view = findViewById2;
                    str = str4;
                    str2 = str3;
                    C87412m.m108593f(findViewById, "hasContactContainer");
                    C87412m.m108593f(view, "noContactContainer");
                    boolean Z0 = w3Var.mo83913Z0();
                    Log.m105918d(C54492n.TAG, "账户无发表权限,isForeign:" + Z0);
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "noPostQualityUI", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "noPostQualityUI", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view3 = findViewById;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "noPostQualityUI", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "noPostQualityUI", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (Z0) {
                        C37521f.f99374d.getClass();
                        if (C37521f.f99457m5.mo60266n().intValue() == 0) {
                            ((TextView) view).setText(getActivity().getString(C0966R.string.egp));
                            break;
                        }
                    }
                    break;
                case 2:
                    str = str4;
                    String str6 = str3;
                    C87412m.m108593f(findViewById, "hasContactContainer");
                    C87412m.m108593f(findViewById2, "noContactContainer");
                    boolean Z02 = w3Var.mo83913Z0();
                    Log.m105918d(C54492n.TAG, "有发表权限但未创建账号,isForign = " + Z02);
                    if (Z02) {
                        C37521f.f99374d.getClass();
                        if (C37521f.f99457m5.mo60266n().intValue() == 0) {
                            C9556a aVar4 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar4.mo10233c(0);
                            str2 = str6;
                            View view4 = findViewById2;
                            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            C9556a aVar5 = new C9556a();
                            aVar5.mo10233c(8);
                            View view5 = findViewById2;
                            View view6 = findViewById;
                            C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            ((TextView) view5).setText(getActivity().getString(C0966R.string.egp));
                            break;
                        }
                    }
                    View view7 = findViewById2;
                    str2 = str6;
                    C9556a aVar6 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar6.mo10233c(8);
                    View view8 = view7;
                    C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar7 = new C9556a();
                    aVar7.mo10233c(0);
                    View view9 = findViewById;
                    C117292a.m165358d(view9, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    w3Var.mo83961s();
                    View findViewById3 = findViewById(C0966R.C0970id.f358782h21);
                    C9556a aVar8 = new C9556a();
                    aVar8.mo10233c(8);
                    View view10 = findViewById3;
                    C117292a.m165358d(view10, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById4 = findViewById(C0966R.C0970id.d5k);
                    C9556a aVar9 = new C9556a();
                    aVar9.mo10233c(8);
                    View view11 = findViewById4;
                    C117292a.m165358d(view11, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                    C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById5 = findViewById(C0966R.C0970id.jb7);
                    C9556a aVar10 = new C9556a();
                    aVar10.mo10233c(8);
                    View view12 = findViewById5;
                    C117292a.m165358d(view12, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                    C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view13 = this.f37418n;
                    if (view13 != null) {
                        C9556a aVar11 = new C9556a();
                        aVar11.mo10233c(8);
                        View view14 = view13;
                        C117292a.m165358d(view14, aVar11.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view13.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                        C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View findViewById6 = findViewById(C0966R.C0970id.e4e);
                        C9556a aVar12 = new C9556a();
                        aVar12.mo10233c(8);
                        View view15 = findViewById6;
                        C117292a.m165358d(view15, aVar12.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById6.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                        C117292a.m165359e(view15, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        boolean booleanExtra = getIntent().getBooleanExtra(str, false);
                        View view16 = this.f37415h;
                        if (view16 != null) {
                            view16.setOnClickListener(new C13523w8(this, booleanExtra));
                            if (booleanExtra && this.f37412e != null) {
                                View view17 = this.f37415h;
                                if (view17 != null) {
                                    view17.post(new C13533x8(this));
                                    getIntent().removeExtra(str);
                                } else {
                                    C87412m.m108603p("finderPosBtn");
                                    throw null;
                                }
                            }
                            C61926c.m72695t(C2479n0.f12958d, getActivity(), new C13552y8(this));
                            mo12644I3(true);
                            C61926c.m72695t(C2479n0.f12978x, getActivity(), new C13127b9(this));
                            break;
                        } else {
                            C87412m.m108603p("finderPosBtn");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("finderPosterEntrance");
                        throw null;
                    }
                case 3:
                case 6:
                    str = str4;
                    C87412m.m108593f(findViewById, "hasContactContainer");
                    C87412m.m108593f(findViewById2, "noContactContainer");
                    mo12656m3(findViewById, findViewById2);
                    str2 = str3;
                    z = true;
                    break;
                case 4:
                    C87412m.m108593f(findViewById, "hasContactContainer");
                    C87412m.m108593f(findViewById2, "noContactContainer");
                    Log.m105918d(C54492n.TAG, "账户封禁");
                    C9556a aVar13 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar13.mo10233c(8);
                    View view18 = findViewById2;
                    C117292a.m165358d(view18, aVar13.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
                    C117292a.m165359e(view18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar14 = new C9556a();
                    aVar14.mo10233c(0);
                    View view19 = findViewById;
                    C117292a.m165358d(view19, aVar14.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
                    C117292a.m165359e(view19, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById7 = findViewById(C0966R.C0970id.f358782h21);
                    C9556a aVar15 = new C9556a();
                    aVar15.mo10233c(8);
                    View view20 = findViewById7;
                    C117292a.m165358d(view20, aVar15.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById7.setVisibility(((Integer) aVar15.mo10231a(0)).intValue());
                    C117292a.m165359e(view20, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view21 = this.f37418n;
                    if (view21 != null) {
                        C9556a aVar16 = new C9556a();
                        aVar16.mo10233c(8);
                        View view22 = view21;
                        C117292a.m165358d(view22, aVar16.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view21.setVisibility(((Integer) aVar16.mo10231a(0)).intValue());
                        C117292a.m165359e(view22, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View findViewById8 = findViewById(C0966R.C0970id.e4e);
                        C9556a aVar17 = new C9556a();
                        aVar17.mo10233c(8);
                        View view23 = findViewById8;
                        C117292a.m165358d(view23, aVar17.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById8.setVisibility(((Integer) aVar17.mo10231a(0)).intValue());
                        C117292a.m165359e(view23, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view24 = this.f37415h;
                        if (view24 != null) {
                            C9556a aVar18 = new C9556a();
                            aVar18.mo10233c(8);
                            View view25 = view24;
                            C117292a.m165358d(view25, aVar18.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view24.setVisibility(((Integer) aVar18.mo10231a(0)).intValue());
                            C117292a.m165359e(view25, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            mo12644I3(false);
                            C60979d<C100810g0> i2 = ((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11872i2();
                            String str7 = str3;
                            C62345f fVar = new C62345f(str7, (C27696y) null, 2, (C8480h) null);
                            View findViewById9 = findViewById(C0966R.C0970id.d79);
                            C87412m.m108593f(findViewById9, "findViewById<ImageView>(R.id.finder_avatar_iv)");
                            i2.mo85957c(fVar, (ImageView) findViewById9, ((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11867O2(aVar));
                            ((TextView) findViewById(C0966R.C0970id.e3u)).setText(getResources().getString(C0966R.string.cxr));
                            findViewById(C0966R.C0970id.d5k).setOnClickListener(new C13478u8(this));
                            str = str4;
                            if (getIntent().getBooleanExtra(str, false)) {
                                findViewById(C0966R.C0970id.d5k).post(new C13489v8(this));
                                getIntent().removeExtra(str);
                            }
                            View findViewById10 = findViewById(C0966R.C0970id.jb7);
                            C9556a aVar19 = new C9556a();
                            aVar19.mo10233c(8);
                            C117292a.m165358d(findViewById10, aVar19.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById10.setVisibility(((Integer) aVar19.mo10231a(0)).intValue());
                            C117292a.m165359e(findViewById10, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            str2 = str7;
                            break;
                        } else {
                            C87412m.m108603p("finderPosBtn");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("finderPosterEntrance");
                        throw null;
                    }
                case 5:
                    C87412m.m108593f(findViewById, "hasContactContainer");
                    C87412m.m108593f(findViewById2, "noContactContainer");
                    mo12647c3(findViewById, findViewById2);
                    break;
                default:
                    str = str4;
                    str2 = str3;
                    Log.m105918d(C54492n.TAG, "not one of six state");
                    break;
            }
        } else {
            C87412m.m108593f(findViewById, "hasContactContainer");
            C87412m.m108593f(findViewById2, "noContactContainer");
            Log.m105918d(C54492n.TAG, "账号需开启完整功能");
            C9556a aVar20 = new C9556a();
            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
            aVar20.mo10233c(8);
            bVar = bVar2;
            C117292a.m165358d(findViewById2, aVar20.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar20.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar21 = new C9556a();
            aVar21.mo10233c(0);
            C117292a.m165358d(findViewById, aVar21.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar21.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.d79);
            TextView textView = (TextView) findViewById(C0966R.C0970id.e3u);
            TextView textView2 = (TextView) findViewById(C0966R.C0970id.e75);
            View findViewById11 = findViewById(C0966R.C0970id.f358782h21);
            C9556a aVar22 = new C9556a();
            aVar22.mo10233c(8);
            str4 = "key_from_sns_post";
            C117292a.m165358d(findViewById11, aVar22.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById11.setVisibility(((Integer) aVar22.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById11, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view26 = this.f37415h;
            if (view26 != null) {
                C9556a aVar23 = new C9556a();
                aVar23.mo10233c(8);
                View view27 = view26;
                C117292a.m165358d(view27, aVar23.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view26.setVisibility(((Integer) aVar23.mo10231a(0)).intValue());
                C117292a.m165359e(view27, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo12644I3(false);
                View view28 = this.f37418n;
                if (view28 != null) {
                    C9556a aVar24 = new C9556a();
                    aVar24.mo10233c(8);
                    str3 = "";
                    C117292a.m165358d(view28, aVar24.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view28.setVisibility(((Integer) aVar24.mo10231a(0)).intValue());
                    C117292a.m165359e(view28, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById12 = findViewById(C0966R.C0970id.e4e);
                    C9556a aVar25 = new C9556a();
                    aVar25.mo10233c(8);
                    C117292a.m165358d(findViewById12, aVar25.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById12.setVisibility(((Integer) aVar25.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById12, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById13 = findViewById(C0966R.C0970id.jb7);
                    C9556a aVar26 = new C9556a();
                    aVar26.mo10233c(8);
                    C117292a.m165358d(findViewById13, aVar26.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById13.setVisibility(((Integer) aVar26.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById13, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById14 = findViewById(C0966R.C0970id.n7k);
                    C9556a aVar27 = new C9556a();
                    aVar27.mo10233c(8);
                    C117292a.m165358d(findViewById14, aVar27.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById14.setVisibility(((Integer) aVar27.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById14, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById15 = findViewById(C0966R.C0970id.f358938i00);
                    C9556a aVar28 = new C9556a();
                    aVar28.mo10233c(8);
                    C117292a.m165358d(findViewById15, aVar28.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById15.setVisibility(((Integer) aVar28.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById15, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById16 = findViewById(C0966R.C0970id.fua);
                    C9556a aVar29 = new C9556a();
                    aVar29.mo10233c(8);
                    C117292a.m165358d(findViewById16, aVar29.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById16.setVisibility(((Integer) aVar29.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById16, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C58784w3.f168295a.mo83961s();
                    C50119ke1 ke13 = this.f37412e;
                    hk4 hk4 = (ke13 == null || (linkedList = ke13.f136686C) == null) ? null : (hk4) C110818d0.m150916N(linkedList);
                    C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11872i2();
                    if (hk4 == null || (str5 = hk4.f134709e) == null) {
                        str5 = str3;
                    }
                    C62345f fVar2 = new C62345f(str5, C27696y.ORIGIN_AVATAR_IMAGE);
                    C87412m.m108593f(imageView, "finderAvatar");
                    i25.mo85957c(fVar2, imageView, ((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11867O2(aVar));
                    textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getActivity(), hk4 != null ? hk4.f134708d : null));
                    C85875k4.m106189j0(textView.getPaint(), 0.8f);
                    textView2.setVisibility(0);
                    textView2.setText(getResources().getString(C0966R.string.n36));
                    int i = hk4 != null ? hk4.f134710f : 0;
                    if (i > 0) {
                        TextView textView3 = (TextView) findViewById(C0966R.C0970id.d_3);
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                            textView3.setText(getActivity().getResources().getString(C0966R.string.f360497d81, new Object[]{String.valueOf(i)}));
                        }
                    } else {
                        View findViewById17 = findViewById(C0966R.C0970id.d_3);
                        C9556a aVar30 = new C9556a();
                        aVar30.mo10233c(8);
                        View view29 = findViewById17;
                        C117292a.m165358d(view29, aVar30.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById17.setVisibility(((Integer) aVar30.mo10231a(0)).intValue());
                        C117292a.m165359e(view29, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View findViewById18 = findViewById(C0966R.C0970id.d5k);
                    findViewById18.setOnClickListener(new C13479u9(hk4, this));
                    C7446m0.m7572b(C7446m0.f25635a, findViewById18, "open_complete_function", 0, 0, (Map) null, 28, (Object) null);
                } else {
                    C87412m.m108603p("finderPosterEntrance");
                    throw null;
                }
            } else {
                C87412m.m108603p("finderPosBtn");
                throw null;
            }
        }
        str = str4;
        str2 = str3;
        z = false;
        C50119ke1 ke14 = this.f37412e;
        if (ke14 != null) {
            View findViewById19 = findViewById(C0966R.C0970id.fep);
            View findViewById20 = findViewById(C0966R.C0970id.fen);
            if (ke14.f136697n > 0) {
                TextView textView4 = (TextView) findViewById(C0966R.C0970id.fns);
                if (textView4 != null) {
                    textView4.setText(C7878t0.m8035d((long) ke14.f136697n));
                    textView4.setVisibility(0);
                }
            } else {
                ((TextView) findViewById(C0966R.C0970id.fns)).setVisibility(8);
            }
            if (ke14.f136698o > 0) {
                TextView textView5 = (TextView) findViewById(C0966R.C0970id.cv5);
                if (textView5 != null) {
                    textView5.setText(C7878t0.m8035d((long) ke14.f136698o));
                    textView5.setVisibility(0);
                }
                mo12643G3(true);
            } else {
                ((TextView) findViewById(C0966R.C0970id.cv5)).setVisibility(8);
                mo12643G3(false);
            }
            if (ke14.f136701r > 0) {
                ((TextView) findViewById(C0966R.C0970id.dxw)).setText(String.valueOf(ke14.f136701r));
                View findViewById21 = findViewById(C0966R.C0970id.feq);
                C9556a aVar31 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar31.mo10233c(0);
                C117292a.m165358d(findViewById21, aVar31.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById21.setVisibility(((Integer) aVar31.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById21, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                ((TextView) findViewById(C0966R.C0970id.dxw)).setText(str2);
                View findViewById22 = findViewById(C0966R.C0970id.feq);
                C9556a aVar32 = new C9556a();
                ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                aVar32.mo10233c(8);
                C117292a.m165358d(findViewById22, aVar32.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById22.setVisibility(((Integer) aVar32.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById22, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            Log.m105924i(C54492n.TAG, "likeCount = " + ke14.f136697n + ",favCount = " + ke14.f136698o + "，purchased_total_count=" + ke14.f136701r);
            findViewById19.setTag(C0966R.C0970id.f358033d40, Integer.valueOf(ke14.f136697n));
            findViewById20.setTag(C0966R.C0970id.d5g, Integer.valueOf(ke14.f136698o));
        }
        TextView textView6 = this.f37416i;
        if (textView6 != null) {
            C85875k4.m106189j0(textView6.getPaint(), 0.8f);
            TextView textView7 = this.f37422r;
            C85875k4.m106189j0(textView7 != null ? textView7.getPaint() : null, 0.8f);
            View findViewById23 = findViewById(C0966R.C0970id.e6v);
            C9556a aVar33 = new C9556a();
            ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
            aVar33.mo10233c(0);
            C117292a.m165358d(findViewById23, aVar33.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById23.setVisibility(((Integer) aVar33.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById23, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (getIntent().getBooleanExtra(str, false)) {
                View view30 = this.f37415h;
                if (view30 != null) {
                    view30.post(new C13171x(view30));
                    getIntent().removeExtra(str);
                } else {
                    C87412m.m108603p("finderPosBtn");
                    throw null;
                }
            }
            Log.m105924i(C54492n.TAG, "[checkAutoShowPost] autoShow" + this.f37409N);
            int q = C58784w3.m68441q(C58784w3.f168295a, (String) null, 1, (Object) null);
            if (!this.f37409N || !(q == 3 || q == 6)) {
                Log.m105924i(C54492n.TAG, "[checkAutoShowPost] not autoShow");
            } else {
                mo12649e3();
                Log.m105924i(C54492n.TAG, "[checkAutoShowPost] has autoShow post bottom sheet ,set false");
                this.f37409N = false;
            }
            C58969q b = C58961d.f168673a.mo84155b(bVar.mo90662O5());
            C64284cg b2 = b != null ? C58960c.m68830b(b, true) : null;
            View findViewById24 = findViewById(C0966R.C0970id.f357518aa0);
            if (findViewById24 != null) {
                int i3 = (b2 == null || !z) ? 8 : 0;
                C9556a aVar34 = new C9556a();
                aVar34.mo10233c(Integer.valueOf(i3));
                View view31 = findViewById24;
                C117292a.m165358d(view31, aVar34.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById24.setVisibility(((Integer) aVar34.mo10231a(0)).intValue());
                C117292a.m165359e(view31, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C23564m.m28138h(findViewById24, new C13172y(this));
                findViewById24.setOnClickListener(new C13173z(this, b2));
            }
            mo12648d3();
            return;
        }
        C87412m.m108603p("finderPostNewFeed");
        throw null;
    }

    /* renamed from: o3 */
    public final void mo12658o3() {
        Class cls = FinderCommonFeatureService.class;
        Class cls2 = C58417y0.class;
        C7335d c = C86312j.m106911c(cls2);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0.ey0((C58417y0) c, getActivity(), this.f37429y, this.f37427w, 1, 1, false, 0, (String) null, (String) null, FileUtils.S_IRWXU, (Object) null);
        C7335d c2 = C86312j.m106911c(cls2);
        C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
        C58417y0.ey0((C58417y0) c2, getActivity(), this.f37429y, this.f37427w, 1, 10, false, 0, (String) null, (String) null, FileUtils.S_IRWXU, (Object) null);
        C7335d c3 = C86312j.m106911c(cls2);
        C87412m.m108593f(c3, "getService(FinderReportLogic::class.java)");
        C58417y0 y0Var = (C58417y0) c3;
        AppCompatActivity activity = getActivity();
        long j = this.f37429y;
        boolean z = this.f37427w;
        C50119ke1 ke12 = this.f37412e;
        C58417y0.ey0(y0Var, activity, j, z, 1, 2, false, ke12 != null ? (long) ke12.f136697n : 0, (String) null, (String) null, 384, (Object) null);
        C7335d c4 = C86312j.m106911c(cls2);
        C87412m.m108593f(c4, "getService(FinderReportLogic::class.java)");
        C58417y0 y0Var2 = (C58417y0) c4;
        AppCompatActivity activity2 = getActivity();
        long j2 = this.f37429y;
        boolean z2 = this.f37427w;
        C50119ke1 ke13 = this.f37412e;
        C58417y0.ey0(y0Var2, activity2, j2, z2, 1, 3, false, ke13 != null ? (long) ke13.f136698o : 0, (String) null, (String) null, 384, (Object) null);
        C7335d c5 = C86312j.m106911c(cls2);
        C87412m.m108593f(c5, "getService(FinderReportLogic::class.java)");
        C58417y0.ey0((C58417y0) c5, getActivity(), this.f37429y, this.f37427w, 1, 4, false, 0, (String) null, (String) null, FileUtils.S_IRWXU, (Object) null);
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("finder_private_msg_entrance");
        View view = null;
        C64586nn1 o2 = G5 != null ? G5.mo77308o2("finder_private_msg_entrance") : null;
        ((C58417y0) C86312j.m106911c(cls2)).dy0(getActivity(), this.f37429y, this.f37427w, 1, 6, o2 != null, (long) (o2 != null ? o2.f184503e : 0), mo12650f3(o2), C66785b.f191882e.mo90662O5());
        long i3 = mo12652i3();
        C7335d c6 = C86312j.m106911c(cls2);
        C87412m.m108593f(c6, "getService(FinderReportLogic::class.java)");
        C58417y0.ey0((C58417y0) c6, getActivity(), this.f37429y, this.f37427w, 1, 7, i3 > 0, i3, (String) null, (String) null, 384, (Object) null);
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("CreatorCenter");
        C7335d c7 = C86312j.m106911c(cls2);
        C87412m.m108593f(c7, "getService(FinderReportLogic::class.java)");
        C58417y0.ey0((C58417y0) c7, getActivity(), this.f37429y, this.f37427w, 1, 8, R5 != null, 0, (String) null, (String) null, FileUtils.S_IRWXU, (Object) null);
        View findViewById = findViewById(C0966R.C0970id.fua);
        if (findViewById.getVisibility() == 0) {
            view = findViewById;
        }
        if (view != null) {
            C7335d c8 = C86312j.m106911c(cls2);
            C87412m.m108593f(c8, "getService(FinderReportLogic::class.java)");
            C58417y0.ey0((C58417y0) c8, getActivity(), this.f37429y, false, 1, 9, false, 0, (String) null, (String) null, 384, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0034 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            r4 = 0
            if (r5 == 0) goto L_0x000a
            java.lang.String r0 = "INNER_ITEM_COUNT"
            int r5 = r5.getIntExtra(r0, r4)
            goto L_0x000b
        L_0x000a:
            r5 = 0
        L_0x000b:
            r0 = 1
            if (r3 == r0) goto L_0x0025
            r1 = 2
            if (r3 == r1) goto L_0x001a
            r5 = 31121(0x7991, float:4.361E-41)
            if (r3 == r5) goto L_0x0017
        L_0x0015:
            r3 = 1
            goto L_0x0032
        L_0x0017:
            r3 = 1
            r4 = 1
            goto L_0x0032
        L_0x001a:
            te3.ke1 r3 = r2.f37412e
            if (r3 == 0) goto L_0x0023
            int r3 = r3.f136697n
            if (r3 != r5) goto L_0x0023
            goto L_0x0015
        L_0x0023:
            r3 = 0
            goto L_0x0032
        L_0x0025:
            te3.ke1 r3 = r2.f37412e
            if (r3 == 0) goto L_0x002f
            int r3 = r3.f136698o
            if (r3 != r5) goto L_0x002f
            r3 = 1
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            r0 = r3
            goto L_0x0015
        L_0x0032:
            if (r0 == 0) goto L_0x0038
            if (r3 == 0) goto L_0x0038
            if (r4 == 0) goto L_0x0061
        L_0x0038:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "ifFavCountEquals = "
            r5.append(r1)
            r5.append(r0)
            java.lang.String r0 = ",ifLikeCountEquals = "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = ", isAccComplete="
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            java.lang.String r4 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r2.mo12646Y0()
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13146c9.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v46, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v47, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v48, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v48, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX WARNING: type inference failed for: r13v6, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r9v15, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r13v8, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r13v22 */
    /* JADX WARNING: type inference failed for: r9v26 */
    /* JADX WARNING: type inference failed for: r13v26 */
    /* JADX WARNING: type inference failed for: r13v44 */
    /* JADX WARNING: type inference failed for: r9v47 */
    /* JADX WARNING: type inference failed for: r13v45 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r39) {
        /*
            r38 = this;
            r0 = r38
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r1 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            super.onCreate(r39)
            ht1.d3 r2 = r38.mo12651g3()
            r3 = 2
            r2.mo9586V2(r3)
            android.content.Intent r2 = r38.getIntent()
            java.lang.String r4 = "RED_DOT_EXIST_ON_ENTER"
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            boolean r2 = r2.getBooleanExtra(r4, r5)
            r0.f37427w = r2
            long r7 = java.lang.System.currentTimeMillis()
            r0.f37429y = r7
            di3.d r2 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r2 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r2
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r2 = r2.Nt0()
            java.lang.String r4 = "TLPersonalCenter"
            r2.mo77239M5(r4)
            android.content.Intent r2 = r38.getIntent()
            java.lang.String r4 = "key_need_done_post_action"
            boolean r2 = r2.getBooleanExtra(r4, r5)
            r0.f37428x = r2
            java.lang.Class<pl1.s0> r2 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
            r7 = 2131304590(0x7f09208e, float:1.8227327E38)
            android.view.View r7 = r0.findViewById(r7)
            java.lang.String r8 = "findViewById<View>(com.t…d.finder_poster_entrance)"
            gy3.C87412m.m108593f(r7, r8)
            r0.f37418n = r7
            r7 = 2131302601(0x7f0918c9, float:1.8223293E38)
            android.view.View r7 = r0.findViewById(r7)
            r0.f37425u = r7
            r7 = 2131306857(0x7f092969, float:1.8231925E38)
            android.view.View r8 = r0.findViewById(r7)
            if (r8 == 0) goto L_0x006d
            rs1.j9 r9 = new rs1.j9
            r9.<init>(r0)
            r8.setOnClickListener(r9)
        L_0x006d:
            r9 = 2131306858(0x7f09296a, float:1.8231927E38)
            android.view.View r15 = r0.findViewById(r9)
            if (r15 != 0) goto L_0x0078
            r7 = r15
            goto L_0x00bf
        L_0x0078:
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r14.mo10233c(r6)
            java.lang.Object[] r11 = r14.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r13 = "initView"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r10 = r15
            r9 = r14
            r14 = r16
            r7 = r15
            r15 = r17
            r16 = r18
            r17 = r19
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r9 = r9.mo10231a(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r7.setVisibility(r9)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r12 = "initView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r10 = r7
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x00bf:
            if (r7 == 0) goto L_0x00c9
            rs1.k9 r9 = new rs1.k9
            r9.<init>(r0)
            r7.setOnClickListener(r9)
        L_0x00c9:
            r9 = 2131306856(0x7f092968, float:1.8231923E38)
            android.view.View r15 = r0.findViewById(r9)
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r14.mo10233c(r6)
            java.lang.Object[] r11 = r14.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r13 = "initView"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r10 = r15
            r9 = r14
            r14 = r16
            r3 = r15
            r15 = r17
            r16 = r18
            r17 = r19
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r9 = r9.mo10231a(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r3.setVisibility(r9)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r12 = "initView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r10 = r3
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            rs1.l9 r9 = new rs1.l9
            r9.<init>(r0)
            r3.setOnClickListener(r9)
            boolean r3 = r0.f37407L
            r10 = 2131306862(0x7f09296e, float:1.8231935E38)
            if (r3 == 0) goto L_0x018d
            java.lang.Class<ht1.v4> r3 = ht1.C8808v4.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ht1.v4 r3 = (ht1.C8808v4) r3
            boolean r3 = r3.mo9635e()
            if (r3 != 0) goto L_0x018d
            android.view.View r3 = r0.findViewById(r10)
            if (r3 != 0) goto L_0x013b
            goto L_0x017e
        L_0x013b:
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r6)
            java.lang.Object[] r12 = r15.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r14 = "initView"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r11 = r3
            r9 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r9 = r9.mo10231a(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r3.setVisibility(r9)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r13 = "initView"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x017e:
            android.view.View r3 = r0.findViewById(r10)
            if (r3 == 0) goto L_0x01d4
            rs1.m9 r9 = new rs1.m9
            r9.<init>(r0)
            r3.setOnClickListener(r9)
            goto L_0x01d4
        L_0x018d:
            android.view.View r3 = r0.findViewById(r10)
            if (r3 != 0) goto L_0x0194
            goto L_0x01d4
        L_0x0194:
            k20.a r9 = new k20.a
            r9.<init>()
            r10 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r9.mo10233c(r11)
            java.lang.Object[] r11 = r9.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r13 = "initView"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r3
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r9 = r9.mo10231a(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r3.setVisibility(r9)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r12 = "initView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x01d4:
            r3 = 2131308041(0x7f092e09, float:1.8234326E38)
            android.view.View r3 = r0.findViewById(r3)
            java.lang.String r9 = "findViewById(R.id.loading_progress_bar)"
            gy3.C87412m.m108593f(r3, r9)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            r0.f37414g = r3
            r3 = 2131317286(0x7f095226, float:1.8253077E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r9 = 2131317283(0x7f095223, float:1.8253071E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131317284(0x7f095224, float:1.8253073E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r11 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12953J
            android.app.Activity r12 = r38.getContext()
            java.lang.String r13 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r12, r13)
            com.tencent.mm.ui.MMActivity r12 = (com.tencent.p014mm.p136ui.MMActivity) r12
            rs1.t9 r13 = new rs1.t9
            r13.<init>(r3, r9, r10, r0)
            o40.C61926c.m72695t(r11, r12, r13)
            r3 = 2131306865(0x7f092971, float:1.8231941E38)
            android.view.View r3 = r0.findViewById(r3)
            rs1.n9 r9 = new rs1.n9
            r9.<init>(r0)
            r3.setOnClickListener(r9)
            android.content.res.Resources r3 = r38.getResources()
            r9 = 2131165337(0x7f070099, float:1.7944888E38)
            float r3 = r3.getDimension(r9)
            int r3 = (int) r3
            er1.w3 r15 = er1.C58784w3.f168295a
            r14 = 1
            r13 = 0
            r10 = 2
            java.lang.Integer r10 = er1.C58784w3.m68436c0(r15, r14, r5, r10, r13)
            if (r10 == 0) goto L_0x0241
            int r10 = r10.intValue()
            r16 = r10
            goto L_0x0247
        L_0x0241:
            r10 = 2131755983(0x7f1003cf, float:1.914286E38)
            r16 = 2131755983(0x7f1003cf, float:1.914286E38)
        L_0x0247:
            r10 = 2131302962(0x7f091a32, float:1.8224025E38)
            android.view.View r10 = r0.findViewById(r10)
            r12 = r10
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 != 0) goto L_0x0258
            r21 = r13
            r18 = r15
            goto L_0x0289
        L_0x0258:
            android.app.Activity r11 = r38.getContext()
            android.app.Activity r10 = r38.getContext()
            r13 = 2131829273(0x7f112219, float:1.929151E38)
            java.lang.String r13 = r10.getString(r13)
            java.lang.String r10 = "context.getString(\n     …der_my_inactive_feed_new)"
            gy3.C87412m.m108593f(r13, r10)
            r18 = 35
            r19 = 2131101252(0x7f060644, float:1.7814908E38)
            r10 = r15
            r5 = r12
            r12 = r13
            r21 = 0
            r13 = r18
            r14 = r16
            r18 = r15
            r15 = r19
            r16 = r3
            r17 = r3
            java.lang.CharSequence r3 = r10.mo83957q1(r11, r12, r13, r14, r15, r16, r17)
            r5.setText(r3)
        L_0x0289:
            r3 = 2131302796(0x7f09198c, float:1.8223688E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            wp1.j r5 = wp1.C15587j.f42215a
            java.lang.String r10 = "FinderObjectDynamicImageKey_FinderFavOffIcon"
            te3.cf1 r5 = r5.mo14349a(r10)
            if (r5 == 0) goto L_0x02a0
            java.lang.String r5 = r5.f131694e
            if (r5 != 0) goto L_0x02a2
        L_0x02a0:
            java.lang.String r5 = ""
        L_0x02a2:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r10 == 0) goto L_0x02e2
            android.app.Activity r2 = r38.getContext()
            android.content.res.Resources r2 = r2.getResources()
            float r2 = r2.getDimension(r9)
            int r2 = (int) r2
            if (r3 != 0) goto L_0x02b8
            goto L_0x031a
        L_0x02b8:
            android.app.Activity r11 = r38.getContext()
            android.app.Activity r4 = r38.getContext()
            r5 = 2131826522(0x7f11175a, float:1.928593E38)
            java.lang.String r12 = r4.getString(r5)
            java.lang.String r4 = "context.getString(com.te…ring.finder_fav_feed_new)"
            gy3.C87412m.m108593f(r12, r4)
            r13 = 35
            r14 = 2131756454(0x7f1005a6, float:1.9143816E38)
            r15 = 2131101252(0x7f060644, float:1.7814908E38)
            r10 = r18
            r16 = r2
            r17 = r2
            java.lang.CharSequence r2 = r10.mo83957q1(r11, r12, r13, r14, r15, r16, r17)
            r3.setText(r2)
            goto L_0x031a
        L_0x02e2:
            bl3.r r9 = bl3.C39818r.f106831a
            bl3.r$a r10 = r9.mo62446e(r4)
            bl3.c r10 = r10.mo62447c(r2)
            pl1.s0 r10 = (pl1.C11990s0) r10
            k60.d r10 = r10.mo11871f2()
            pl1.n0 r11 = new pl1.n0
            up1.y r12 = up1.C27696y.RAW_IMAGE
            r11.<init>(r5, r12)
            pl1.e0$a r5 = pl1.C11978e0.C11979a.FAV_ICON
            bl3.r$a r4 = r9.mo62446e(r4)
            bl3.c r2 = r4.mo62447c(r2)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r5)
            l60.b r2 = r10.mo85956b(r11, r2)
            rs1.p9 r4 = new rs1.p9
            r4.<init>(r0, r3)
            r2.getClass()
            r2.f291320d = r4
            r2.mo85953c()
        L_0x031a:
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r2 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12952I
            androidx.appcompat.app.AppCompatActivity r3 = r38.getActivity()
            rs1.q9 r4 = new rs1.q9
            r4.<init>(r0)
            o40.C61926c.m72695t(r2, r3, r4)
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r2 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12970p
            androidx.appcompat.app.AppCompatActivity r3 = r38.getActivity()
            rs1.r9 r4 = new rs1.r9
            r4.<init>(r0)
            o40.C61926c.m72695t(r2, r3, r4)
            di3.d r2 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r2 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r2
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r2 = r2.Nt0()
            com.tencent.mm.plugin.finder.extension.reddot.j r2 = r2.f158526c
            zc1.b r3 = zc1.C66785b.f191882e
            java.lang.String r3 = r3.mo90662O5()
            r2.getClass()
            java.lang.String r4 = "finderUsername"
            gy3.C87412m.m108594g(r3, r4)
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r2.f12931c
            com.tencent.mm.plugin.finder.extension.reddot.f r5 = new com.tencent.mm.plugin.finder.extension.reddot.f
            r5.<init>(r3, r2)
            r4.post(r5)
            boolean r2 = r0.f37407L
            r3 = 2131313164(0x7f09420c, float:1.8244717E38)
            if (r2 == 0) goto L_0x03d1
            rs1.s9 r2 = new rs1.s9
            r2.<init>(r0)
            android.view.View r4 = r0.findViewById(r3)
            if (r4 == 0) goto L_0x0375
            r4.setOnClickListener(r2)
            r5 = 2131312632(0x7f093ff8, float:1.8243638E38)
            r4.setTag(r5, r2)
        L_0x0375:
            android.view.View r2 = r0.findViewById(r3)
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r6)
            java.lang.Object[] r10 = r3.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r12 = "initView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r2
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r11 = "initView"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r2 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12973s
            androidx.appcompat.app.AppCompatActivity r3 = r38.getActivity()
            rs1.e9 r4 = new rs1.e9
            r4.<init>(r0)
            o40.C61926c.m72695t(r2, r3, r4)
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r2 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12974t
            androidx.appcompat.app.AppCompatActivity r3 = r38.getActivity()
            rs1.f9 r4 = new rs1.f9
            r4.<init>(r0)
            o40.C61926c.m72695t(r2, r3, r4)
            goto L_0x0416
        L_0x03d1:
            android.view.View r2 = r0.findViewById(r3)
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r5)
            java.lang.Object[] r10 = r3.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r12 = "initView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r2
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r11 = "initView"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0416:
            r2 = 2131306860(0x7f09296c, float:1.823193E38)
            android.view.View r2 = r0.findViewById(r2)
            rs1.g9 r3 = new rs1.g9
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            r2 = 2131306859(0x7f09296b, float:1.8231929E38)
            android.view.View r3 = r0.findViewById(r2)
            rs1.h9 r4 = new rs1.h9
            r4.<init>(r0)
            r3.setOnClickListener(r4)
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r3 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12977w
            androidx.appcompat.app.AppCompatActivity r4 = r38.getActivity()
            rs1.i9 r5 = new rs1.i9
            r5.<init>(r0)
            o40.C61926c.m72695t(r3, r4, r5)
            r38.mo12655l3()
            r38.mo12654k3()
            r38.mo12653j3()
            r38.mo12648d3()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            boolean r4 = r3 instanceof android.widget.RelativeLayout.LayoutParams
            if (r4 == 0) goto L_0x045a
            r13 = r3
            android.widget.RelativeLayout$LayoutParams r13 = (android.widget.RelativeLayout.LayoutParams) r13
            goto L_0x045c
        L_0x045a:
            r13 = r21
        L_0x045c:
            r3 = 10
            r4 = 2131304499(0x7f092033, float:1.8227142E38)
            r5 = 3
            if (r13 == 0) goto L_0x046b
            r13.addRule(r5, r4)
            r13.removeRule(r3)
            goto L_0x046d
        L_0x046b:
            r13 = r21
        L_0x046d:
            android.view.ViewGroup$LayoutParams r9 = r7.getLayoutParams()
            boolean r10 = r9 instanceof android.widget.RelativeLayout.LayoutParams
            if (r10 == 0) goto L_0x0478
            android.widget.RelativeLayout$LayoutParams r9 = (android.widget.RelativeLayout.LayoutParams) r9
            goto L_0x047a
        L_0x0478:
            r9 = r21
        L_0x047a:
            if (r9 == 0) goto L_0x0483
            r9.removeRule(r5)
            r9.addRule(r3)
            goto L_0x0485
        L_0x0483:
            r9 = r21
        L_0x0485:
            r8.setLayoutParams(r13)
            r7.setLayoutParams(r9)
            android.view.View r2 = r0.findViewById(r2)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            boolean r7 = r3 instanceof android.widget.RelativeLayout.LayoutParams
            if (r7 == 0) goto L_0x049b
            r13 = r3
            android.widget.RelativeLayout$LayoutParams r13 = (android.widget.RelativeLayout.LayoutParams) r13
            goto L_0x049d
        L_0x049b:
            r13 = r21
        L_0x049d:
            if (r13 == 0) goto L_0x04a6
            r3 = 2131306857(0x7f092969, float:1.8231925E38)
            r13.addRule(r5, r3)
            goto L_0x04a8
        L_0x04a6:
            r13 = r21
        L_0x04a8:
            r2.setLayoutParams(r13)
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99504r6
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x04c1
            r7 = 1
            goto L_0x0638
        L_0x04c1:
            r3 = 2131304501(0x7f092035, float:1.8227146E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_MIX_CELL_TIPS_SHOWN_BOOLEAN
            r8 = 0
            boolean r5 = r5.mo119686g(r7, r8)
            if (r5 != 0) goto L_0x0550
            android.app.Activity r5 = r38.getContext()
            r7 = 2131829173(0x7f1121b5, float:1.9291308E38)
            java.lang.String r12 = r5.getString(r7)
            java.lang.String r5 = "context.getString(R.stri…inder_mix_cell_tips_text)"
            gy3.C87412m.m108593f(r12, r5)
            r5 = r18
            r7 = 1
            java.lang.Integer r8 = r5.mo83917b0(r7, r7)
            if (r8 == 0) goto L_0x04fa
            int r8 = r8.intValue()
            r14 = r8
            goto L_0x0500
        L_0x04fa:
            r8 = 2131755982(0x7f1003ce, float:1.9142859E38)
            r14 = 2131755982(0x7f1003ce, float:1.9142859E38)
        L_0x0500:
            r8 = 2131756455(0x7f1005a7, float:1.9143818E38)
            android.app.Activity r9 = r38.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r9 = r9.getDimensionPixelSize(r10)
            r18 = 2131755980(0x7f1003cc, float:1.9142855E38)
            android.app.Activity r11 = r38.getContext()
            r13 = 37
            r19 = 2131099804(0x7f06009c, float:1.7811972E38)
            r15 = 2131099804(0x7f06009c, float:1.7811972E38)
            r10 = r5
            r16 = r9
            r17 = r9
            java.lang.CharSequence r12 = r10.mo83957q1(r11, r12, r13, r14, r15, r16, r17)
            android.app.Activity r11 = r38.getContext()
            r13 = 35
            r20 = 2131099804(0x7f06009c, float:1.7811972E38)
            r14 = r8
            r15 = r19
            java.lang.CharSequence r12 = r10.mo83957q1(r11, r12, r13, r14, r15, r16, r17)
            android.app.Activity r11 = r38.getContext()
            r13 = 64
            r14 = r18
            r15 = r20
            java.lang.CharSequence r5 = r10.mo83957q1(r11, r12, r13, r14, r15, r16, r17)
            r3.setText(r5)
            r5 = 0
            r3.setVisibility(r5)
            goto L_0x0556
        L_0x0550:
            r5 = 8
            r7 = 1
            r3.setVisibility(r5)
        L_0x0556:
            android.view.View r4 = r0.findViewById(r4)
            if (r4 == 0) goto L_0x0564
            rs1.d9 r5 = new rs1.d9
            r5.<init>(r3, r0)
            r4.setOnClickListener(r5)
        L_0x0564:
            if (r4 != 0) goto L_0x0567
            goto L_0x05a2
        L_0x0567:
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r6)
            java.lang.Object[] r9 = r3.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r11 = "initMixCellView"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r4
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r10 = "initMixCellView"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x05a2:
            r3 = 2131306858(0x7f09296a, float:1.8231927E38)
            android.view.View r3 = r0.findViewById(r3)
            if (r3 != 0) goto L_0x05ac
            goto L_0x05ed
        L_0x05ac:
            k20.a r4 = new k20.a
            r4.<init>()
            r5 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r6)
            java.lang.Object[] r9 = r4.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r11 = "initMixCellView"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r3
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r10 = "initMixCellView"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x05ed:
            r3 = 2131306856(0x7f092968, float:1.8231923E38)
            android.view.View r3 = r0.findViewById(r3)
            if (r3 != 0) goto L_0x05f7
            goto L_0x0638
        L_0x05f7:
            k20.a r4 = new k20.a
            r4.<init>()
            r5 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r5)
            java.lang.Object[] r9 = r4.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r11 = "initMixCellView"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r3
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC"
            java.lang.String r10 = "initMixCellView"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x0638:
            di3.d r3 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r3 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r3
            gf1.i r3 = r3.f157802n
            r4 = 101(0x65, float:1.42E-43)
            r3.mo84535d(r4, r0)
            di3.d r3 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r3 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r3
            gf1.i r3 = r3.f157802n
            r4 = 111(0x6f, float:1.56E-43)
            r3.mo84535d(r4, r0)
            di3.d r3 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r3 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r3
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r3 = r3.Nt0()
            java.lang.String r4 = "TLCamera"
            te3.nn1 r11 = r3.mo77246R5(r4)
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r10 = r1.mo77227G5(r4)
            er1.j4 r1 = er1.C58739j4.f168176a
            if (r11 == 0) goto L_0x06ee
            if (r10 == 0) goto L_0x06ee
            r2.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99420i1
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r7) goto L_0x068a
            r27 = 0
            goto L_0x068c
        L_0x068a:
            r27 = 1
        L_0x068c:
            java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            r22 = r1
            dp1.y0 r22 = (dp1.C58417y0) r22
            r24 = 2
            r25 = 1
            r26 = 1
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            androidx.appcompat.app.AppCompatActivity r2 = r38.getActivity()
            rs1.s8 r2 = r1.mo12873f(r2)
            if (r2 == 0) goto L_0x06bc
            te3.hj1 r13 = r2.mo12861q3()
            r33 = r13
            goto L_0x06be
        L_0x06bc:
            r33 = r21
        L_0x06be:
            r34 = 0
            r35 = 0
            r36 = 3520(0xdc0, float:4.933E-42)
            r37 = 0
            java.lang.String r23 = "4"
            dp1.C58417y0.Nx0(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36, r37)
            dp1.v0 r8 = dp1.C58413v0.f167346a
            r12 = 1
            androidx.appcompat.app.AppCompatActivity r2 = r38.getActivity()
            rs1.s8 r1 = r1.mo12873f(r2)
            if (r1 == 0) goto L_0x06dd
            te3.hj1 r13 = r1.mo12861q3()
            goto L_0x06df
        L_0x06dd:
            r13 = r21
        L_0x06df:
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 480(0x1e0, float:6.73E-43)
            r19 = 0
            java.lang.String r9 = "4"
            dp1.C58413v0.m67781i(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x06ee:
            android.content.Intent r1 = r38.getIntent()
            java.lang.String r2 = "key_from_sns_post"
            r3 = 0
            boolean r1 = r1.getBooleanExtra(r2, r3)
            r0.f37404I = r1
            android.content.Intent r1 = r38.getIntent()
            java.lang.String r2 = "key_from_search_post"
            boolean r1 = r1.getBooleanExtra(r2, r3)
            r0.f37405J = r1
            android.content.Intent r1 = r38.getIntent()
            java.lang.String r2 = "key_auto_show_post_bottom_sheet"
            boolean r1 = r1.getBooleanExtra(r2, r3)
            r0.f37409N = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "needDonePostAction = "
            r1.append(r2)
            boolean r2 = r0.f37428x
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            boolean r1 = r0.f37428x
            if (r1 == 0) goto L_0x0747
            r1 = 0
            r0.f37428x = r1
            android.view.View r1 = r0.f37415h
            if (r1 == 0) goto L_0x0741
            rs1.c9$w r2 = new rs1.c9$w
            r2.<init>(r0)
            r3 = 150(0x96, double:7.4E-322)
            r1.postDelayed(r2, r3)
            goto L_0x0747
        L_0x0741:
            java.lang.String r1 = "finderPosBtn"
            gy3.C87412m.m108603p(r1)
            throw r21
        L_0x0747:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13146c9.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        Class cls = FinderCommonFeatureService.class;
        super.onDestroy();
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).f157802n.mo84540i(101, this);
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).f157802n.mo84540i(111, this);
        int i = C2483o0.C2484a.m2362a(C2483o0.f12984a, (String) null, 1, (Object) null)[3];
        int i2 = 0;
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        if (c != null) {
            i2 = c.field_fansAddCount;
        }
        Log.m105924i(C54492n.TAG, "onDestroy : " + (i + i2));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_MIX_CELL_TIPS_SHOWN_BOOLEAN, Boolean.TRUE);
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().f158526c.mo2442b();
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().f158526c.mo2441a();
        ((C7135d) C86312j.m106911c(C7135d.class)).mo8304uS(String.valueOf(hashCode()));
    }

    public void onResume() {
        Class cls = FinderCommonFeatureService.class;
        Class cls2 = C8777j5.class;
        super.onResume();
        C59418i iVar = ((FinderCommonFeatureService) C86312j.m106911c(cls)).f157802n;
        C87412m.m108592e(iVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.extension.FinderSyncExtension");
        boolean z = true;
        iVar.mo84538g(110633, 1, (C49712hj1) null);
        C66785b bVar = C66785b.f191882e;
        String O5 = bVar.mo90662O5();
        this.f37411d = O5;
        if (this.f37412e != null) {
            mo12657n3();
            mo12658o3();
            mo12651g3().mo9584C0(this.f37412e);
        } else {
            if (Util.isNullOrNil(O5)) {
                ProgressBar progressBar = this.f37414g;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                } else {
                    C87412m.m108603p("progressBar");
                    throw null;
                }
            } else {
                mo12657n3();
            }
            mo12646Y0();
        }
        C2469j jVar = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().f158526c;
        String O52 = bVar.mo90662O5();
        jVar.getClass();
        C87412m.m108594g(O52, "finderUsername");
        int i = 4;
        jVar.f12931c.removeMessages(4);
        jVar.f12931c.obtainMessage(4, O52).sendToTarget();
        jVar.f12931c.removeMessages(6);
        jVar.f12931c.sendEmptyMessage(6);
        C58408t0 t0Var = C58408t0.f167336a;
        if (!this.f37404I) {
            i = 3;
        }
        t0Var.mo83261g(true, i);
        View view = this.f37420p;
        if (view == null || view.getVisibility() != 0) {
            z = false;
        }
        if (z && !((C8777j5) C86312j.m106911c(cls2)).getConfig().f151444Z) {
            C7335d c = C86312j.m106911c(cls2);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8600a((C8777j5) c, 1, "", (String) null, 4, (Object) null);
            C7335d c2 = C86312j.m106911c(cls2);
            C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8601b((C8777j5) c2, 1, mo12651g3().mo9589n1(), mo12651g3().mo9585G(), (Map) null, 8, (Object) null);
        }
        C2479n0.m2355c(C2479n0.f12955a, "CreateFinderEntrance", (String) null, 2, (Object) null);
        if (((C61381b) C86312j.m106911c(C61381b.class)).E80().enableRecordTemplate()) {
            ((C7135d) C86312j.m106911c(C7135d.class)).mo8303ds(String.valueOf(hashCode())).mo8307c(((C7136e) C86312j.m106911c(C7136e.class)).mo8305L9(), false);
        }
    }

    public void onStop() {
        super.onStop();
        this.f37430z = false;
        this.f37396A = "";
        this.f37397B = "";
        this.f37398C = "";
        this.f37399D = "";
        this.f37400E = "";
    }
}
