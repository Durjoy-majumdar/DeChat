package cj1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import ak1.C0074h0;
import ak1.C54067f0;
import ak1.C54090i0;
import ak1.C54116w;
import al1.C0079b;
import al1.C0080f;
import al1.C54129i;
import al1.C54130j;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C39622i0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bl3.C39818r;
import c30.C104289g;
import cl1.C0656e1;
import cl1.C0657g1;
import cl1.C0690t1;
import cl1.C0702z0;
import cl1.C39975j;
import cl1.C54946b0;
import cl1.C54963d0;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedLiveLifeEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice;
import com.tencent.p014mm.plugin.finder.service.C3603n1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.StringKtKt;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.xweb.file.XVFSFile;
import d14.C58052j1;
import d50.C58107a;
import d50.C58113g;
import d50.C58115i;
import d50.C7170j;
import di3.C7335d;
import di3.C86312j;
import dj1.C45343b;
import dj1.C45346d;
import dj1.C45349d1;
import dj1.C45352e0;
import dj1.C45356f;
import dj1.C45358f1;
import dj1.C45360g;
import dj1.C45364h;
import dj1.C45367i1;
import dj1.C45369j0;
import dj1.C45375m0;
import dj1.C45377n;
import dj1.C45381p0;
import dj1.C45383q0;
import dj1.C45384r;
import dj1.C45386r0;
import dj1.C45389s0;
import dj1.C45391t;
import dj1.C45393v;
import dj1.C45395w;
import dj1.C45397x;
import dj1.C45401y;
import dj1.C58280i;
import dj1.C58283l0;
import dj1.C58284o;
import dj1.C58291w0;
import dj1.C7339i0;
import eb0.C31543z5;
import eb0.C75592q0;
import eg1.C58598w;
import er1.C45684k;
import er1.C45685m;
import er1.C58728f5;
import er1.C58730g5;
import er1.C58739j4;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import fy3.C32229r;
import fy3.C32230s;
import fy3.C32232u;
import gg1.C32444a;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import h81.C59774i;
import hp3.C87581a;
import ht1.C60172g4;
import ht1.C60200t1;
import ht1.C8794p5;
import j20.C117292a;
import j50.C60735a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import je1.C46505a1;
import je1.C46523h2;
import jp3.C9487b;
import k20.C60958c;
import k20.C9556a;
import k50.C60971a;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.ResultKt;
import ls3.C61398h;
import m00.C10700d;
import m53.C10754b;
import m53.C10756c;
import m53.C10757d;
import m53.C10760f;
import m53.C10761g;
import m53.C10762h;
import mp3.C88819d;
import nj3.C76879j;
import nj3.C76912y0;
import np1.C61866i0;
import nr3.C89059e;
import o40.C61926c;
import o40.C61937h;
import ob0.C89132b;
import ok1.C62042e;
import org.json.JSONException;
import p140cw.C7138g;
import p165hr.C60106t;
import p204mr.C61568m;
import p565ir.C60606n;
import p682rz.C36594q;
import pe3.C47465a;
import pe3.C89349b;
import q40.C12040d;
import q40.C89456b;
import qg1.C47824c0;
import qg1.C47826f;
import qg1.C47828h;
import qg1.C47830m;
import qg1.C47836x;
import qj1.C12360e8;
import qj1.C12666si;
import rl1.C13022d0;
import rs1.C63654v2;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import s43.C13624e;
import sf0.C48374j0;
import sk1.C63965x;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C48742ao0;
import te3.C48898bs0;
import te3.C49098d51;
import te3.C49106d71;
import te3.C49291ej0;
import te3.C49329et0;
import te3.C49366f21;
import te3.C49585go0;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C49769hy0;
import te3.C49773hz0;
import te3.C49842ig0;
import te3.C49882ip2;
import te3.C49914iy0;
import te3.C49919iz0;
import te3.C50041jv0;
import te3.C50131kh1;
import te3.C50262lh0;
import te3.C50280ll1;
import te3.C50401mh0;
import te3.C50415mk1;
import te3.C50427mo0;
import te3.C50429mo2;
import te3.C50493n41;
import te3.C50542nh0;
import te3.C50872pt0;
import te3.C50912q41;
import te3.C51010qt0;
import te3.C51020qw0;
import te3.C51032qz0;
import te3.C51203s61;
import te3.C51295st0;
import te3.C51316sz0;
import te3.C51354t71;
import te3.C51727vr0;
import te3.C51763w01;
import te3.C51778w31;
import te3.C51790w61;
import te3.C51868wr1;
import te3.C51887ww2;
import te3.C51934x71;
import te3.C52005xq0;
import te3.C52013xs0;
import te3.C52047y01;
import te3.C52151yp2;
import te3.C52153yq0;
import te3.C52162ys0;
import te3.C52316zw0;
import te3.C64243at0;
import te3.C64254b81;
import te3.C64265bq2;
import te3.C64273c21;
import te3.C64293cq2;
import te3.C64323dq2;
import te3.C64373fs0;
import te3.C64375ft0;
import te3.C64412h61;
import te3.C64414h71;
import te3.C64434i11;
import te3.C64617p00;
import te3.C64640px0;
import te3.C64707sc1;
import te3.C64733to;
import te3.C64756up2;
import te3.C64840xw0;
import te3.C64848y91;
import te3.C64890zp2;
import te3.b65;
import tf0.C13883o1;
import tf0.C64916p1;
import vo1.C65808n0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;
import zc1.C66785b;
import zk1.C66880s0;
import zt3.C119157j;

/* renamed from: cj1.t */
public final class C54820t implements C54795n5 {

    /* renamed from: f */
    public static final C54821b f153690f = new C54821b((C8480h) null);

    /* renamed from: a */
    public final WeakReference<Context> f153691a;

    /* renamed from: b */
    public final C45795b f153692b;

    /* renamed from: c */
    public final C49712hj1 f153693c;

    /* renamed from: d */
    public final String f153694d = "Finder.FinderLiveAssistant";

    /* renamed from: e */
    public ArrayList<C13604l<View, Integer>> f153695e = new ArrayList<>();

    /* renamed from: cj1.t$a0 */
    public static final class C0597a0 implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f1410d;

        /* renamed from: e */
        public final /* synthetic */ int f1411e;

        /* renamed from: f */
        public final /* synthetic */ C54820t f1412f;

        /* renamed from: g */
        public final /* synthetic */ Context f1413g;

        public C0597a0(int i, int i2, C54820t tVar, Context context) {
            this.f1410d = i;
            this.f1411e = i2;
            this.f1412f = tVar;
            this.f1413g = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            String str = "qqmusic://qq.com/media/playSonglist?p=%7b%22song%22%3a%5b%7b%22type%22%3a%220%22%2c%22songid%22%3a%22" + this.f1410d + "%22%2c%22songmid%22%3a%22" + this.f1411e + "%22%7d%5d%2c%22action%22%3a%22play%22%7d&source=https%3a%2f%2fi.y.qq.com%2fv8%2fplaysong.html%3fADTAG%3dhz_nb_wxzhibo1";
            Uri parse = Uri.parse(str);
            if (parse == null) {
                Log.m105929w(this.f1412f.f153694d, "goQQMusic parse qq music action url fail, url %s", str);
            }
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.addFlags(268435456);
            Context context = this.f1413g;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant$goQQMusic$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant$goQQMusic$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            Log.m105925i(this.f1412f.f153694d, "goQQMusic qqMusicActionUrl: %s", str);
            ((C54116w) C86312j.m106911c(C54116w.class)).By0(3);
        }
    }

    /* renamed from: cj1.t$b0 */
    public static final class C0598b0 implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C54820t f1414d;

        public C0598b0(C54820t tVar) {
            this.f1414d = tVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            Log.m105924i(this.f1414d.f153694d, "goQQMusic cancel");
        }
    }

    /* renamed from: cj1.t$c0 */
    public static final class C0599c0 implements C10762h<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C54820t f1415a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f1416b;

        /* renamed from: c */
        public final /* synthetic */ C32227p<Integer, Integer, C13598b0> f1417c;

        public C0599c0(C54820t tVar, C32226l<? super Boolean, C13598b0> lVar, C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
            this.f1415a = tVar;
            this.f1416b = lVar;
            this.f1417c = pVar;
        }

        /* renamed from: a */
        public void mo605a(int i, int i2, String str) {
            Log.m105924i(this.f1415a.f153694d, "[WeCoin] initEngine onFailed");
            C32227p<Integer, Integer, C13598b0> pVar = this.f1417c;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
            }
        }

        public void onSuccess(Object obj) {
            Boolean bool = (Boolean) obj;
            Log.m105924i(this.f1415a.f153694d, "[WeCoin] initEngine onSuccess");
            C32226l<Boolean, C13598b0> lVar = this.f1416b;
            if (lVar != null) {
                lVar.invoke(bool);
            }
        }
    }

    /* renamed from: cj1.t$e */
    public static final class C0600e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54820t f1418d;

        /* renamed from: e */
        public final /* synthetic */ View f1419e;

        /* renamed from: f */
        public final /* synthetic */ int f1420f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0600e(C54820t tVar, View view, int i) {
            super(0);
            this.f1418d = tVar;
            this.f1419e = view;
            this.f1420f = i;
        }

        public Object invoke() {
            this.f1418d.f153695e.add(new C13604l(this.f1419e, Integer.valueOf(this.f1420f)));
            String str = this.f1418d.f153694d;
            Log.m105924i(str, "cache view:" + this.f1419e.getClass().getSimpleName() + " visibility:" + this.f1420f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$h0 */
    public static final class C0601h0 extends C87413o implements C32227p<Boolean, C51203s61, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54820t f1421d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<Boolean, C51203s61, C13598b0> f1422e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0601h0(C54820t tVar, C32227p<? super Boolean, ? super C51203s61, C13598b0> pVar) {
            super(2);
            this.f1421d = tVar;
            this.f1422e = pVar;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C51203s61 s612 = (C51203s61) obj2;
            if (booleanValue) {
                C76912y0.m92768g(this.f1421d.mo75781q0(), C76577a.m92166q(this.f1421d.mo75781q0(), C0966R.string.e7m));
            }
            C32227p<Boolean, C51203s61, C13598b0> pVar = this.f1422e;
            if (pVar != null) {
                pVar.invoke(Boolean.valueOf(booleanValue), s612);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$i0 */
    public static final class C0602i0 implements C46505a1.C46506a {

        /* renamed from: a */
        public final /* synthetic */ MMActivity f1423a;

        /* renamed from: b */
        public final /* synthetic */ C32227p<Boolean, C51203s61, C13598b0> f1424b;

        /* renamed from: c */
        public final /* synthetic */ boolean f1425c;

        /* renamed from: cj1.t$i0$a */
        public static final class C0603a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ MMActivity f1426d;

            /* renamed from: e */
            public final /* synthetic */ int f1427e;

            /* renamed from: f */
            public final /* synthetic */ int f1428f;

            /* renamed from: g */
            public final /* synthetic */ C32227p<Boolean, C51203s61, C13598b0> f1429g;

            /* renamed from: h */
            public final /* synthetic */ C51203s61 f1430h;

            /* renamed from: i */
            public final /* synthetic */ boolean f1431i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0603a(MMActivity mMActivity, int i, int i2, C32227p<? super Boolean, ? super C51203s61, C13598b0> pVar, C51203s61 s612, boolean z) {
                super(0);
                this.f1426d = mMActivity;
                this.f1427e = i;
                this.f1428f = i2;
                this.f1429g = pVar;
                this.f1430h = s612;
                this.f1431i = z;
            }

            /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x0055  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r6 = this;
                    ok1.e r0 = ok1.C62042e.f176370a
                    com.tencent.mm.ui.MMActivity r1 = r6.f1426d
                    r2 = 0
                    r0.mo87047U1(r1, r2)
                    int r0 = r6.f1427e
                    if (r0 != 0) goto L_0x001c
                    int r0 = r6.f1428f
                    if (r0 != 0) goto L_0x001c
                    fy3.p<java.lang.Boolean, te3.s61, rx3.b0> r0 = r6.f1429g
                    if (r0 == 0) goto L_0x007f
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    te3.s61 r2 = r6.f1430h
                    r0.invoke(r1, r2)
                    goto L_0x007f
                L_0x001c:
                    boolean r0 = r6.f1431i
                    if (r0 == 0) goto L_0x0074
                    te3.s61 r0 = r6.f1430h
                    te3.ja r0 = r0.getBaseResponse()
                    r1 = 1
                    if (r0 == 0) goto L_0x003e
                    te3.rv3 r0 = r0.f135956e
                    if (r0 == 0) goto L_0x003e
                    java.lang.String r0 = r0.f141175d
                    if (r0 == 0) goto L_0x003e
                    int r0 = r0.length()
                    if (r0 <= 0) goto L_0x0039
                    r0 = 1
                    goto L_0x003a
                L_0x0039:
                    r0 = 0
                L_0x003a:
                    if (r0 != r1) goto L_0x003e
                    r0 = 1
                    goto L_0x003f
                L_0x003e:
                    r0 = 0
                L_0x003f:
                    if (r0 == 0) goto L_0x0055
                    com.tencent.mm.ui.MMActivity r0 = r6.f1426d
                    te3.s61 r1 = r6.f1430h
                    te3.ja r1 = r1.getBaseResponse()
                    te3.rv3 r1 = r1.f135956e
                    if (r1 == 0) goto L_0x0050
                    java.lang.String r1 = r1.f141175d
                    goto L_0x0051
                L_0x0050:
                    r1 = 0
                L_0x0051:
                    nj3.C76912y0.m92767f(r0, r1)
                    goto L_0x0074
                L_0x0055:
                    com.tencent.mm.ui.MMActivity r0 = r6.f1426d
                    r3 = 2131828797(0x7f11203d, float:1.9290545E38)
                    r4 = 2
                    java.lang.Object[] r4 = new java.lang.Object[r4]
                    int r5 = r6.f1427e
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    r4[r2] = r5
                    int r2 = r6.f1428f
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r4[r1] = r2
                    java.lang.String r1 = r0.getString(r3, r4)
                    nj3.C76912y0.m92767f(r0, r1)
                L_0x0074:
                    fy3.p<java.lang.Boolean, te3.s61, rx3.b0> r0 = r6.f1429g
                    if (r0 == 0) goto L_0x007f
                    java.lang.Boolean r1 = java.lang.Boolean.FALSE
                    te3.s61 r2 = r6.f1430h
                    r0.invoke(r1, r2)
                L_0x007f:
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: cj1.C54820t.C0602i0.C0603a.invoke():java.lang.Object");
            }
        }

        public C0602i0(MMActivity mMActivity, C32227p<? super Boolean, ? super C51203s61, C13598b0> pVar, boolean z) {
            this.f1423a = mMActivity;
            this.f1424b = pVar;
            this.f1425c = z;
        }

        /* renamed from: a */
        public void mo607a(int i, int i2, String str, C51203s61 s612) {
            C87412m.m108594g(s612, "resp");
            C61926c.m72668M(new C0603a(this.f1423a, i, i2, this.f1424b, s612, this.f1425c));
        }
    }

    /* renamed from: cj1.t$j */
    public static final class C0604j implements C47828h.C47829a {

        /* renamed from: a */
        public final /* synthetic */ C54820t f1432a;

        /* renamed from: b */
        public final /* synthetic */ String f1433b;

        /* renamed from: c */
        public final /* synthetic */ int f1434c;

        /* renamed from: d */
        public final /* synthetic */ C32227p<Boolean, Boolean, C13598b0> f1435d;

        public C0604j(C54820t tVar, String str, int i, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar) {
            this.f1432a = tVar;
            this.f1433b = str;
            this.f1434c = i;
            this.f1435d = pVar;
        }

        /* renamed from: a */
        public void mo608a(boolean z) {
            Class cls = C54991o.class;
            String str = this.f1432a.f153694d;
            Log.m105924i(str, "doDisableComment success, enable:" + z + " username:" + this.f1433b);
            int i = this.f1434c;
            if (i == 2) {
                ((C54991o) this.f1432a.mo75777m0(cls)).f154262U0.put(this.f1433b, Boolean.valueOf(!z));
            } else if (i == 3) {
                ((C54991o) this.f1432a.mo75777m0(cls)).f154267V0.put(this.f1433b, Boolean.valueOf(!z));
            }
            C32227p<Boolean, Boolean, C13598b0> pVar = this.f1435d;
            if (pVar != null) {
                pVar.invoke(Boolean.TRUE, Boolean.valueOf(z));
            }
        }

        /* renamed from: b */
        public void mo609b(int i, int i2, String str, boolean z) {
            String str2 = this.f1432a.f153694d;
            Log.m105924i(str2, "doDisableComment fail, enable:" + z + " username:" + this.f1433b + " errType:" + i + " errCode:" + i2);
            C32227p<Boolean, Boolean, C13598b0> pVar = this.f1435d;
            if (pVar != null) {
                pVar.invoke(Boolean.FALSE, Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: cj1.t$j0 */
    public static final class C0605j0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54820t f1436d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0605j0(C54820t tVar) {
            super(0);
            this.f1436d = tVar;
        }

        public Object invoke() {
            C54820t tVar = this.f1436d;
            Iterator<C13604l<View, Integer>> it = tVar.f153695e.iterator();
            while (it.hasNext()) {
                C13604l next = it.next();
                View view = (View) next.f38555d;
                int intValue = ((Number) next.f38556e).intValue();
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(intValue));
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant$resumeViewVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant$resumeViewVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                String str = tVar.f153694d;
                Log.m105924i(str, "resume view:" + view.getClass().getSimpleName() + " visibility:" + intValue);
            }
            this.f1436d.f153695e.clear();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$k0 */
    public static final class C0606k0<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C54820t f1437a;

        /* renamed from: b */
        public final /* synthetic */ Context f1438b;

        /* renamed from: c */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f1439c;

        /* renamed from: d */
        public final /* synthetic */ String f1440d;

        public C0606k0(C54820t tVar, Context context, C32226l<? super Boolean, C13598b0> lVar, String str) {
            this.f1437a = tVar;
            this.f1438b = context;
            this.f1439c = lVar;
            this.f1440d = str;
        }

        public Object call(Object obj) {
            String str;
            T t;
            C49765hx0 hx02;
            String g;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                List<C0581o5> list = ((C0702z0) this.f1437a.mo75777m0(C0702z0.class)).f1672f;
                C87412m.m108593f(list, "business(LiveMsgSlice::class.java).msgList");
                String str2 = this.f1440d;
                Iterator<T> it = list.iterator();
                while (true) {
                    str = null;
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C87412m.m108589b(((C0581o5) t).mo571e(), str2)) {
                        break;
                    }
                }
                C0581o5 o5Var = (C0581o5) t;
                if (o5Var == null || (g = o5Var.mo573g()) == null) {
                    ArrayList<C49765hx0> arrayList = ((C0656e1) this.f1437a.mo75777m0(C0656e1.class)).f1549f;
                    String str3 = this.f1440d;
                    Iterator<C49765hx0> it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            hx02 = null;
                            break;
                        }
                        hx02 = it4.next();
                        FinderContact finderContact = hx02.f134919d;
                        if (C87412m.m108589b(finderContact != null ? finderContact.username : null, str3)) {
                            break;
                        }
                    }
                    C49765hx0 hx03 = hx02;
                    if (hx03 != null) {
                        str = hx03.f134925j;
                    }
                } else {
                    str = g;
                }
                C54843w3.f153747a.mo75786a(this.f1437a.f153692b, 2, str);
                Context context = this.f1438b;
                C76912y0.m92768g(context, context.getResources().getString(C0966R.string.mgf));
                this.f1439c.invoke(Boolean.FALSE);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$l */
    public static final class C0607l<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C54820t f1441a;

        /* renamed from: b */
        public final /* synthetic */ String f1442b;

        /* renamed from: c */
        public final /* synthetic */ C32227p<Boolean, C49765hx0, C13598b0> f1443c;

        public C0607l(C54820t tVar, String str, C32227p<? super Boolean, ? super C49765hx0, C13598b0> pVar) {
            this.f1441a = tVar;
            this.f1442b = str;
            this.f1443c = pVar;
        }

        public Object call(Object obj) {
            ConcurrentHashMap<String, Boolean> concurrentHashMap;
            C49765hx0 hx02;
            ConcurrentHashMap<String, Boolean> concurrentHashMap2;
            C49765hx0 hx03;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Class cls = C54991o.class;
            int i = 0;
            boolean z = cVar.f256793a == 0 && cVar.f256794b == 0;
            String str = this.f1441a.f153694d;
            Log.m105924i(str, "doGetFinderLiveContact success:" + z + " username:" + this.f1442b);
            if (z) {
                C45795b bVar = this.f1441a.f153692b;
                if (!(bVar == null || (concurrentHashMap2 = ((C54991o) bVar.mo71262a(cls)).f154262U0) == null)) {
                    String str2 = this.f1442b;
                    C51032qz0 qz02 = (C51032qz0) cVar.f256796d;
                    concurrentHashMap2.put(str2, Boolean.valueOf(C61926c.m72696u((qz02 == null || (hx03 = qz02.f140620d) == null) ? 0 : hx03.f134921f, 1)));
                }
                C45795b bVar2 = this.f1441a.f153692b;
                if (!(bVar2 == null || (concurrentHashMap = ((C54991o) bVar2.mo71262a(cls)).f154267V0) == null)) {
                    String str3 = this.f1442b;
                    C51032qz0 qz03 = (C51032qz0) cVar.f256796d;
                    if (!(qz03 == null || (hx02 = qz03.f140620d) == null)) {
                        i = hx02.f134921f;
                    }
                    concurrentHashMap.put(str3, Boolean.valueOf(C61926c.m72696u(i, 2)));
                }
            }
            C32227p<Boolean, C49765hx0, C13598b0> pVar = this.f1443c;
            C49765hx0 hx04 = null;
            if (pVar == null) {
                return null;
            }
            Boolean valueOf = Boolean.valueOf(z);
            C51032qz0 qz04 = (C51032qz0) cVar.f256796d;
            if (qz04 != null) {
                hx04 = qz04.f140620d;
            }
            pVar.invoke(valueOf, hx04);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$l0 */
    public static final class C0608l0<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C54820t f1444a;

        /* renamed from: b */
        public final /* synthetic */ Context f1445b;

        /* renamed from: c */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f1446c;

        /* renamed from: d */
        public final /* synthetic */ String f1447d;

        public C0608l0(C54820t tVar, Context context, C32226l<? super Boolean, C13598b0> lVar, String str) {
            this.f1444a = tVar;
            this.f1445b = context;
            this.f1446c = lVar;
            this.f1447d = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v5 */
        /* JADX WARNING: type inference failed for: r2v6 */
        /* JADX WARNING: type inference failed for: r2v7 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r8) {
            /*
                r7 = this;
                ob0.b$c r8 = (ob0.C89132b.C89134c) r8
                int r0 = r8.f256793a
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x009f
                int r0 = r8.f256794b
                if (r0 != 0) goto L_0x009f
                cj1.t r8 = r7.f1444a
                java.lang.Class<cl1.z0> r0 = cl1.C0702z0.class
                androidx.lifecycle.i0 r8 = r8.mo75777m0(r0)
                cl1.z0 r8 = (cl1.C0702z0) r8
                java.util.List<cj1.o5> r8 = r8.f1672f
                java.lang.String r0 = "business(LiveMsgSlice::class.java).msgList"
                gy3.C87412m.m108593f(r8, r0)
                java.lang.String r0 = r7.f1447d
                java.util.Iterator r8 = r8.iterator()
            L_0x0023:
                boolean r3 = r8.hasNext()
                if (r3 == 0) goto L_0x003b
                java.lang.Object r3 = r8.next()
                r4 = r3
                cj1.o5 r4 = (cj1.C0581o5) r4
                java.lang.String r4 = r4.mo571e()
                boolean r4 = gy3.C87412m.m108589b(r4, r0)
                if (r4 == 0) goto L_0x0023
                goto L_0x003c
            L_0x003b:
                r3 = r2
            L_0x003c:
                cj1.o5 r3 = (cj1.C0581o5) r3
                if (r3 == 0) goto L_0x0049
                java.lang.String r8 = r3.mo573g()
                if (r8 != 0) goto L_0x0047
                goto L_0x0049
            L_0x0047:
                r2 = r8
                goto L_0x007e
            L_0x0049:
                cj1.t r8 = r7.f1444a
                java.lang.Class<cl1.e1> r0 = cl1.C0656e1.class
                androidx.lifecycle.i0 r8 = r8.mo75777m0(r0)
                cl1.e1 r8 = (cl1.C0656e1) r8
                java.util.ArrayList<te3.hx0> r8 = r8.f1549f
                java.lang.String r0 = r7.f1447d
                java.util.Iterator r8 = r8.iterator()
            L_0x005b:
                boolean r3 = r8.hasNext()
                if (r3 == 0) goto L_0x0077
                java.lang.Object r3 = r8.next()
                r4 = r3
                te3.hx0 r4 = (te3.C49765hx0) r4
                com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f134919d
                if (r4 == 0) goto L_0x006f
                java.lang.String r4 = r4.username
                goto L_0x0070
            L_0x006f:
                r4 = r2
            L_0x0070:
                boolean r4 = gy3.C87412m.m108589b(r4, r0)
                if (r4 == 0) goto L_0x005b
                goto L_0x0078
            L_0x0077:
                r3 = r2
            L_0x0078:
                te3.hx0 r3 = (te3.C49765hx0) r3
                if (r3 == 0) goto L_0x007e
                java.lang.String r2 = r3.f134925j
            L_0x007e:
                cj1.w3 r8 = cj1.C54843w3.f153747a
                cj1.t r0 = r7.f1444a
                fj1.b r0 = r0.f153692b
                r8.mo75786a(r0, r1, r2)
                android.content.Context r8 = r7.f1445b
                android.content.res.Resources r0 = r8.getResources()
                r1 = 2131828681(0x7f111fc9, float:1.929031E38)
                java.lang.String r0 = r0.getString(r1)
                nj3.C76912y0.m92768g(r8, r0)
                fy3.l<java.lang.Boolean, rx3.b0> r8 = r7.f1446c
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r8.invoke(r0)
                goto L_0x00d7
            L_0x009f:
                int r0 = r8.f256794b
                r3 = -200197(0xfffffffffffcf1fb, float:NaN)
                if (r0 != r3) goto L_0x00d7
                android.content.Context r0 = r7.f1445b
                android.content.res.Resources r3 = r0.getResources()
                r4 = 2131828682(0x7f111fca, float:1.9290312E38)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r5 = 0
                te3.cs0 r6 = new te3.cs0
                r6.<init>()
                T r8 = r8.f256796d
                te3.h41 r8 = (te3.C49656h41) r8
                pe3.b r8 = r8.f134439d
                if (r8 == 0) goto L_0x00c3
                byte[] r2 = r8.mo123703f()
            L_0x00c3:
                r6.parseFrom(r2)
                rx3.b0 r8 = rx3.C13598b0.f38549a
                int r8 = r6.f131927d
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r1[r5] = r8
                java.lang.String r8 = r3.getString(r4, r1)
                nj3.C76912y0.m92767f(r0, r8)
            L_0x00d7:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: cj1.C54820t.C0608l0.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: cj1.t$m */
    public static final class C0609m<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C54820t f1448a;

        /* renamed from: b */
        public final /* synthetic */ C32227p<Boolean, Integer, C13598b0> f1449b;

        public C0609m(C54820t tVar, C32227p<? super Boolean, ? super Integer, C13598b0> pVar) {
            this.f1448a = tVar;
            this.f1449b = pVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            String str = this.f1448a.f153694d;
            Log.m105924i(str, "doGetGiftList errType:" + i + ", errCode:" + i2);
            if (i == 0 && i2 == 0) {
                FinderLiveService finderLiveService = FinderLiveService.f159376d;
                C89349b bVar = ((C50427mo0) cVar.f256796d).f138126e;
                finderLiveService.getClass();
                FinderLiveService.f159353F = bVar;
                T t = cVar.f256796d;
                FinderLiveService.f159354G = ((C50427mo0) t).f138127f;
                FinderLiveService.f159355H = ((C50427mo0) t).f138128g;
                if (C62042e.f176370a.mo87027N0()) {
                    C49769hy0 hy02 = new C49769hy0();
                    hy02.f134954d = C46523h2.f125330a.mo71859a(11250);
                    hy02.f134955e = C66785b.f191882e.mo90662O5();
                    C89059e<C89132b.C89134c<C49914iy0>> i3 = hy02.mo73340b().mo9225i();
                    i3.mo123420E(new C0625v(this.f1449b, i2, this.f1448a));
                    C54820t tVar = this.f1448a;
                    if (tVar.mo75781q0() == null || !(tVar.mo75781q0() instanceof MMActivity)) {
                        return i3;
                    }
                    Context q0 = tVar.mo75781q0();
                    C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    i3.mo11397F((MMActivity) q0);
                    return i3;
                }
                C32227p<Boolean, Integer, C13598b0> pVar = this.f1449b;
                if (pVar == null) {
                    return null;
                }
                pVar.invoke(Boolean.TRUE, Integer.valueOf(i2));
                return C13598b0.f38549a;
            }
            C32227p<Boolean, Integer, C13598b0> pVar2 = this.f1449b;
            if (pVar2 == null) {
                return null;
            }
            pVar2.invoke(Boolean.FALSE, Integer.valueOf(i2));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$n */
    public static final class C0610n<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32229r<Integer, Integer, String, C49585go0, C13598b0> f1450a;

        /* renamed from: b */
        public final /* synthetic */ C54820t f1451b;

        public C0610n(C32229r<? super Integer, ? super Integer, ? super String, ? super C49585go0, C13598b0> rVar, C54820t tVar) {
            this.f1450a = rVar;
            this.f1451b = tVar;
        }

        public Object call(Object obj) {
            C49585go0 go02;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Class cls = C0656e1.class;
            Class cls2 = C54991o.class;
            if (cVar.f256793a == 0 && cVar.f256794b == 0 && (go02 = (C49585go0) cVar.f256796d) != null) {
                C54820t tVar = this.f1451b;
                C0656e1 e1Var = (C0656e1) tVar.mo75777m0(cls);
                e1Var.f1549f.clear();
                e1Var.f1549f.addAll(go02.f134155d);
                e1Var.f1551h.clear();
                e1Var.f1551h.addAll(go02.f134157f);
                e1Var.f1552i = go02.f134159h;
                e1Var.f1550g = go02.f134161j;
                String str = go02.f134167s;
                if (str == null) {
                    str = "";
                }
                e1Var.f1553j = str;
                ((C55001u) tVar.mo75777m0(C55001u.class)).f154420q.f182393e = go02.f134159h;
                ((C54991o) tVar.mo75777m0(cls2)).f154192D2 = go02.f134163o;
                ((C54991o) tVar.mo75777m0(cls2)).f154196E2 = go02.f134164p;
                ((C54991o) tVar.mo75777m0(cls2)).f154353p3.clear();
                ((C54991o) tVar.mo75777m0(cls2)).f154353p3.addAll(go02.f134165q);
                if (!C62042e.f176370a.mo87027N0()) {
                    C0656e1 e1Var2 = (C0656e1) tVar.mo75777m0(cls);
                    StringBuilder sb = new StringBuilder();
                    sb.append("online member enableComment:");
                    C49765hx0 hx02 = ((C0656e1) e1Var2.business(cls)).f1550g;
                    sb.append(hx02 != null ? Integer.valueOf(hx02.f134920e) : null);
                    Log.m105924i("MMFinder.LiveOnlineMemberSlice", sb.toString());
                    C49765hx0 hx03 = ((C0656e1) e1Var2.business(cls)).f1550g;
                    if (hx03 != null) {
                        int i = hx03.f134920e;
                        if (i == 1) {
                            ((C54991o) e1Var2.business(cls2)).f154366t = true;
                        } else if (i == 0) {
                            ((C54991o) e1Var2.business(cls2)).f154366t = false;
                        }
                    }
                }
            }
            C32229r<Integer, Integer, String, C49585go0, C13598b0> rVar = this.f1450a;
            if (rVar == null) {
                return null;
            }
            rVar.mo162I(Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), cVar.f256795c, cVar.f256796d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$n0 */
    public static final class C0611n0<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C54820t f1452a;

        /* renamed from: b */
        public final /* synthetic */ C32227p<Boolean, String, C13598b0> f1453b;

        public C0611n0(C54820t tVar, C32227p<? super Boolean, ? super String, C13598b0> pVar) {
            this.f1452a = tVar;
            this.f1453b = pVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            String str = this.f1452a.f153694d;
            Log.m105924i(str, "errType:" + cVar.f256793a + " errCode:" + cVar.f256794b);
            C32227p<Boolean, String, C13598b0> pVar = this.f1453b;
            if (pVar == null) {
                return null;
            }
            pVar.invoke(Boolean.valueOf(cVar.f256794b == 0), cVar.f256795c);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$o */
    public static final class C0612o extends C87413o implements C32229r<Integer, Integer, String, C50131kh1, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WeakReference<C32229r<Integer, Integer, String, C50131kh1, C13598b0>> f1454d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0612o(WeakReference<C32229r<Integer, Integer, String, C50131kh1, C13598b0>> weakReference) {
            super(4);
            this.f1454d = weakReference;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            C32229r rVar;
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            String str = (String) obj3;
            C50131kh1 kh12 = (C50131kh1) obj4;
            C87412m.m108594g(kh12, "resp");
            WeakReference<C32229r<Integer, Integer, String, C50131kh1, C13598b0>> weakReference = this.f1454d;
            if (!(weakReference == null || (rVar = weakReference.get()) == null)) {
                rVar.mo162I(Integer.valueOf(intValue), Integer.valueOf(intValue2), str, kh12);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$o0 */
    public static final class C0613o0 implements C10762h<Void> {

        /* renamed from: a */
        public final /* synthetic */ C54820t f1455a;

        /* renamed from: b */
        public final /* synthetic */ FragmentActivity f1456b;

        /* renamed from: c */
        public final /* synthetic */ C32224a<C13598b0> f1457c;

        public C0613o0(C54820t tVar, FragmentActivity fragmentActivity, C32224a<C13598b0> aVar) {
            this.f1455a = tVar;
            this.f1456b = fragmentActivity;
            this.f1457c = aVar;
        }

        /* renamed from: a */
        public void mo605a(int i, int i2, String str) {
        }

        public void onSuccess(Object obj) {
            Void voidR = (Void) obj;
            C54820t tVar = this.f1455a;
            FragmentActivity fragmentActivity = this.f1456b;
            tVar.getClass();
            C87412m.m108594g(fragmentActivity, "context");
            C10754b Ed0 = ((C10756c) C86709a0.m107533q(C10756c.class)).Ed0(fragmentActivity, true);
            if (Ed0 != null) {
                Ed0.mo10988a(new C0578o0(this.f1457c));
            } else {
                this.f1457c.invoke();
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveAssistant$doLikeLive$$inlined$fail$default$1", mo125469f = "FinderLiveAssistant.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: cj1.t$q */
    public static final class C0614q extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f1458d;

        /* renamed from: e */
        public final /* synthetic */ C54820t f1459e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0614q(C0287e eVar, C15601d dVar, C54820t tVar) {
            super(2, dVar);
            this.f1458d = eVar;
            this.f1459e = tVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0614q(this.f1458d, dVar, this.f1459e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0614q) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C0280a aVar = (C0280a) ((C0281b) this.f1458d).f843b;
            C12040d dVar = aVar.f841a;
            Integer num = null;
            Integer num2 = dVar != null ? new Integer(dVar.f35057e) : null;
            C12040d dVar2 = aVar.f841a;
            if (dVar2 != null) {
                num = new Integer(dVar2.f35058f);
            }
            String str = this.f1459e.f153694d;
            Log.m105924i(str, "onSceneEnd errType:" + num2 + " errCode:" + num);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveAssistant$doLikeLive$$inlined$success$default$1", mo125469f = "FinderLiveAssistant.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: cj1.t$r */
    public static final class C0615r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f1460d;

        /* renamed from: e */
        public final /* synthetic */ C54820t f1461e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0 f1462f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0615r(C0287e eVar, C15601d dVar, C54820t tVar, C8479f0 f0Var) {
            super(2, dVar);
            this.f1460d = eVar;
            this.f1461e = tVar;
            this.f1462f = f0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0615r(this.f1460d, dVar, this.f1461e, this.f1462f);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0615r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0055, code lost:
            r2 = r2.f509d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.ResultKt.throwOnFailure(r12)
                bi1.e r12 = r11.f1460d
                bi1.f r12 = (bi1.C0288f) r12
                T r12 = r12.f855b
                te3.pr0 r12 = (te3.C50863pr0) r12
                int r0 = r12.f139909d
                r1 = 1
                boolean r0 = o40.C61926c.m72696u(r0, r1)
                if (r0 == 0) goto L_0x00a3
                cj1.t r0 = r11.f1461e
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131827772(0x7f111c3c, float:1.9288466E38)
                java.lang.String r1 = r1.getString(r2)
                java.lang.String r2 = "getContext().resources.g…er_live_lottery_attended)"
                gy3.C87412m.m108593f(r1, r2)
                r2 = 2131756283(0x7f1004fb, float:1.914347E38)
                r0.getClass()
                cj1.m0 r3 = new cj1.m0
                r3.<init>(r0, r1, r2)
                o40.C61926c.m72668M(r3)
                cj1.t r0 = r11.f1461e
                java.lang.String r0 = r0.f153694d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "doLikeLive attended lottery success,lotteryId:"
                r1.append(r2)
                cj1.t r2 = r11.f1461e
                java.lang.Class<rl1.d0> r3 = rl1.C13022d0.class
                androidx.lifecycle.i0 r2 = r2.mo75777m0(r3)
                rl1.d0 r2 = (rl1.C13022d0) r2
                al1.q r2 = r2.f37098n
                r3 = 0
                if (r2 == 0) goto L_0x005c
                te3.z21 r2 = r2.f509d
                if (r2 == 0) goto L_0x005c
                java.lang.String r2 = r2.f145640d
                goto L_0x005d
            L_0x005c:
                r2 = r3
            L_0x005d:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                ok1.e r0 = ok1.C62042e.f176370a
                boolean r0 = r0.mo87027N0()
                if (r0 != 0) goto L_0x00a3
                java.lang.Class<ak1.w> r0 = ak1.C54116w.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                java.lang.String r1 = "getService(HellLiveVisitorReoprter::class.java)"
                gy3.C87412m.m108593f(r0, r1)
                r4 = r0
                ak1.w r4 = (ak1.C54116w) r4
                ak1.f0$v0 r5 = ak1.C54067f0.C0071v0.POPUP_TOAST_JOINED
                r7 = 0
                r8 = 0
                r9 = 12
                r10 = 0
                java.lang.String r6 = ""
                ak1.C54116w.my0(r4, r5, r6, r7, r8, r9, r10)
                cj1.t r0 = r11.f1461e
                r0.getClass()
                java.lang.Class<l31.e> r0 = l31.C61212e.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                l31.e r0 = (l31.C61212e) r0
                hl1.k$a r1 = hl1.C59988k.f171146g2
                java.util.Map r1 = r1.mo84902a()
                r2 = 25561(0x63d9, float:3.5819E-41)
                java.lang.String r4 = "finder_live_popup_joined_toast"
                r0.mo86153W7(r4, r3, r1, r2)
            L_0x00a3:
                int r0 = r12.f139909d
                r1 = 4
                boolean r0 = o40.C61926c.m72696u(r0, r1)
                if (r0 == 0) goto L_0x00c7
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131828193(0x7f111de1, float:1.928932E38)
                java.lang.String r1 = r1.getString(r2)
                r2 = 0
                android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)
                r0.show()
            L_0x00c7:
                gy3.f0 r0 = r11.f1462f
                r0.f27484d = r12
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: cj1.C54820t.C0615r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: cj1.t$v */
    public static final class C0616v<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C7339i0.C7340a f1463a;

        /* renamed from: b */
        public final /* synthetic */ C54820t f1464b;

        public C0616v(C7339i0.C7340a aVar, C54820t tVar) {
            this.f1463a = aVar;
            this.f1464b = tVar;
        }

        public Object call(Object obj) {
            C61926c.m72668M(new C0527d0((C89132b.C89134c) obj, this.f1463a, this.f1464b));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$x */
    public static final class C0617x<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32227p<Boolean, C52047y01, C13598b0> f1465a;

        public C0617x(C32227p<? super Boolean, ? super C52047y01, C13598b0> pVar) {
            this.f1465a = pVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C32227p<Boolean, C52047y01, C13598b0> pVar = this.f1465a;
                if (pVar == null) {
                    return null;
                }
                pVar.invoke(Boolean.TRUE, cVar.f256796d);
                return C13598b0.f38549a;
            }
            C32227p<Boolean, C52047y01, C13598b0> pVar2 = this.f1465a;
            if (pVar2 == null) {
                return null;
            }
            pVar2.invoke(Boolean.FALSE, null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$z */
    public static final class C0618z<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C54820t f1466a;

        /* renamed from: b */
        public final /* synthetic */ C32227p<Long, Long, C13598b0> f1467b;

        /* renamed from: c */
        public final /* synthetic */ long f1468c;

        public C0618z(C54820t tVar, C32227p<? super Long, ? super Long, C13598b0> pVar, long j) {
            this.f1466a = tVar;
            this.f1467b = pVar;
            this.f1468c = j;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Class cls = C0657g1.class;
            if (cVar.f256793a == 0 && cVar.f256794b == 0 && cVar.f256796d != null) {
                ((C0657g1) this.f1466a.mo75777m0(cls)).f1555g = (float) ((C49919iz0) cVar.f256796d).f135767e;
                C49919iz0 iz02 = (C49919iz0) cVar.f256796d;
                C0080f fVar = new C0080f(iz02.f135766d, iz02.f135767e, iz02.f135768f);
                C54820t tVar = this.f1466a;
                String str = tVar.f153694d;
                Log.m105924i(str, "[WeCoin] getWeCoinBalance rsp success data = " + fVar + " curConsumeBalanceCNY: " + ((C0657g1) tVar.mo75777m0(cls)).f1555g);
                ((C0657g1) this.f1466a.mo75777m0(cls)).f1557i = fVar;
                C32227p<Long, Long, C13598b0> pVar = this.f1467b;
                if (pVar == null) {
                    return null;
                }
                pVar.invoke(Long.valueOf(((C49919iz0) cVar.f256796d).f135766d), Long.valueOf(this.f1468c));
                return C13598b0.f38549a;
            }
            String str2 = this.f1466a.f153694d;
            Log.m105924i(str2, "[WeCoin] getWeCoinBalance rsp error, errType: " + cVar.f256793a + " errCode: " + cVar.f256794b);
            C32227p<Long, Long, C13598b0> pVar2 = this.f1467b;
            if (pVar2 == null) {
                return null;
            }
            pVar2.invoke(-1L, Long.valueOf(this.f1468c));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$a */
    public static final class C39956a {

        /* renamed from: a */
        public final boolean f107104a;

        /* renamed from: b */
        public final int f107105b;

        /* renamed from: c */
        public final int f107106c;

        /* renamed from: d */
        public final String f107107d;

        /* renamed from: e */
        public final C0079b f107108e;

        public C39956a(boolean z, int i, int i2, String str, C0079b bVar) {
            C87412m.m108594g(str, "errMsg");
            this.f107104a = z;
            this.f107105b = i;
            this.f107106c = i2;
            this.f107107d = str;
            this.f107108e = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39956a)) {
                return false;
            }
            C39956a aVar = (C39956a) obj;
            return this.f107104a == aVar.f107104a && this.f107105b == aVar.f107105b && this.f107106c == aVar.f107106c && C87412m.m108589b(this.f107107d, aVar.f107107d) && C87412m.m108589b(this.f107108e, aVar.f107108e);
        }

        public int hashCode() {
            boolean z = this.f107104a;
            if (z) {
                z = true;
            }
            int hashCode = (((((((z ? 1 : 0) * true) + this.f107105b) * 31) + this.f107106c) * 31) + this.f107107d.hashCode()) * 31;
            C0079b bVar = this.f107108e;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "CloseLiveResult(success=" + this.f107104a + ", errCode=" + this.f107105b + ", errType=" + this.f107106c + ", errMsg=" + this.f107107d + ", anchorFinishInfo=" + this.f107108e + ')';
        }
    }

    /* renamed from: cj1.t$c */
    public static final class C39957c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C45384r.C45385a f107109a;

        public C39957c(C45384r.C45385a aVar) {
            this.f107109a = aVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C45384r.C45385a aVar = this.f107109a;
            if (aVar == null) {
                return null;
            }
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            String str = cVar.f256795c;
            T t = cVar.f256796d;
            C87412m.m108593f(t, "it.resp");
            aVar.mo70898a(i, i2, str, (C51727vr0) t);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$d */
    public static final class C39958d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C45391t.C45392a f107110a;

        public C39958d(C45391t.C45392a aVar) {
            this.f107110a = aVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C45391t.C45392a aVar = this.f107110a;
            if (aVar == null) {
                return null;
            }
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            String str = cVar.f256795c;
            T t = cVar.f256796d;
            C87412m.m108593f(t, "it.resp");
            aVar.mo70899a(i, i2, str, (C50041jv0) t);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$e0 */
    public static final class C39959e0 implements C45386r0.C45387a {

        /* renamed from: a */
        public final /* synthetic */ C32228q<Boolean, String, C50912q41, C13598b0> f107111a;

        /* renamed from: b */
        public final /* synthetic */ C50401mh0 f107112b;

        /* renamed from: c */
        public final /* synthetic */ C54820t f107113c;

        /* renamed from: cj1.t$e0$a */
        public static final class C39960a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f107114d;

            /* renamed from: e */
            public final /* synthetic */ int f107115e;

            /* renamed from: f */
            public final /* synthetic */ C32228q<Boolean, String, C50912q41, C13598b0> f107116f;

            /* renamed from: g */
            public final /* synthetic */ C50912q41 f107117g;

            /* renamed from: h */
            public final /* synthetic */ String f107118h;

            /* renamed from: i */
            public final /* synthetic */ C50401mh0 f107119i;

            /* renamed from: j */
            public final /* synthetic */ C54820t f107120j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C39960a(int i, int i2, C32228q<? super Boolean, ? super String, ? super C50912q41, C13598b0> qVar, C50912q41 q412, String str, C50401mh0 mh02, C54820t tVar) {
                super(0);
                this.f107114d = i;
                this.f107115e = i2;
                this.f107116f = qVar;
                this.f107117g = q412;
                this.f107118h = str;
                this.f107119i = mh02;
                this.f107120j = tVar;
            }

            public Object invoke() {
                String str = "";
                if (this.f107114d == 0 && this.f107115e == 0) {
                    C32228q<Boolean, String, C50912q41, C13598b0> qVar = this.f107116f;
                    if (qVar != null) {
                        qVar.invoke(Boolean.TRUE, str, this.f107117g);
                    }
                } else {
                    C32228q<Boolean, String, C50912q41, C13598b0> qVar2 = this.f107116f;
                    if (qVar2 != null) {
                        Boolean bool = Boolean.FALSE;
                        String str2 = this.f107118h;
                        if (str2 != null) {
                            str = str2;
                        }
                        qVar2.invoke(bool, str, this.f107117g);
                    }
                }
                if (this.f107119i.f138028d == 106) {
                    C50493n41 n412 = new C50493n41();
                    C50401mh0 mh02 = this.f107119i;
                    C54820t tVar = this.f107120j;
                    C89349b bVar = mh02.f138029e;
                    n412.parseFrom(bVar != null ? bVar.mo123703f() : null);
                    ((C65808n0) tVar.mo75777m0(C65808n0.class)).f189260h.remove(Long.valueOf(n412.f138404d));
                }
                return C13598b0.f38549a;
            }
        }

        public C39959e0(C32228q<? super Boolean, ? super String, ? super C50912q41, C13598b0> qVar, C50401mh0 mh02, C54820t tVar) {
            this.f107111a = qVar;
            this.f107112b = mh02;
            this.f107113c = tVar;
        }

        /* renamed from: a */
        public void mo62568a(int i, int i2, String str, C50912q41 q412) {
            C87412m.m108594g(q412, "resp");
            C61926c.m72668M(new C39960a(i, i2, this.f107111a, q412, str, this.f107112b, this.f107113c));
        }
    }

    /* renamed from: cj1.t$f */
    public static final class C39961f<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C45401y.C45402a f107121a;

        public C39961f(C45401y.C45402a aVar) {
            this.f107121a = aVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C45401y.C45402a aVar = this.f107121a;
            if (aVar == null) {
                return null;
            }
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            String str = cVar.f256795c;
            T t = cVar.f256796d;
            C87412m.m108593f(t, "it.resp");
            aVar.mo70903a(i, i2, str, (C52316zw0) t);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$g */
    public static final class C39962g implements C45356f.C45357a {

        /* renamed from: a */
        public final /* synthetic */ C54820t f107122a;

        /* renamed from: b */
        public final /* synthetic */ C32230s<Boolean, Integer, Integer, String, C50262lh0, C13598b0> f107123b;

        public C39962g(C54820t tVar, C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C50262lh0, C13598b0> sVar) {
            this.f107122a = tVar;
            this.f107123b = sVar;
        }

        /* renamed from: a */
        public void mo62569a(int i, int i2, String str, C50262lh0 lh02) {
            C87412m.m108594g(lh02, "resp");
            if (i == 0 && i2 == 0) {
                C32230s<Boolean, Integer, Integer, String, C50262lh0, C13598b0> sVar = this.f107123b;
                if (sVar != null) {
                    sVar.mo237D(Boolean.TRUE, Integer.valueOf(i2), Integer.valueOf(i), str == null ? "" : str, lh02);
                    return;
                }
                return;
            }
            Log.m105924i(this.f107122a.f153694d, "close live room failed");
            C32230s<Boolean, Integer, Integer, String, C50262lh0, C13598b0> sVar2 = this.f107123b;
            if (sVar2 != null) {
                sVar2.mo237D(Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i), str == null ? "" : str, lh02);
            }
        }
    }

    /* renamed from: cj1.t$k */
    public static final class C39963k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C0000n0 f107124d;

        /* renamed from: e */
        public final /* synthetic */ boolean f107125e;

        /* renamed from: f */
        public final /* synthetic */ C54820t f107126f;

        /* renamed from: g */
        public final /* synthetic */ C32230s<Boolean, Integer, Integer, String, C0079b, C13598b0> f107127g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveAssistant$doFinishLive$1$1", mo125469f = "FinderLiveAssistant.kt", mo125470l = {614, 615, 625}, mo125471m = "invokeSuspend")
        /* renamed from: cj1.t$k$a */
        public static final class C39964a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f107128d;

            /* renamed from: e */
            public int f107129e;

            /* renamed from: f */
            public /* synthetic */ Object f107130f;

            /* renamed from: g */
            public final /* synthetic */ boolean f107131g;

            /* renamed from: h */
            public final /* synthetic */ C54820t f107132h;

            /* renamed from: i */
            public final /* synthetic */ C32230s<Boolean, Integer, Integer, String, C0079b, C13598b0> f107133i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C39964a(boolean z, C54820t tVar, C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C0079b, C13598b0> sVar, C15601d<? super C39964a> dVar) {
                super(2, dVar);
                this.f107131g = z;
                this.f107132h = tVar;
                this.f107133i = sVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C39964a aVar = new C39964a(this.f107131g, this.f107132h, this.f107133i, dVar);
                aVar.f107130f = obj;
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C39964a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:21:0x00f8  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    r18 = this;
                    r0 = r18
                    xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r2 = r0.f107129e
                    r3 = 8
                    r4 = 3
                    r5 = 2
                    r6 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r6) goto L_0x0031
                    if (r2 == r5) goto L_0x0022
                    if (r2 != r4) goto L_0x001a
                    kotlin.ResultKt.throwOnFailure(r19)
                    r2 = r19
                    goto L_0x0121
                L_0x001a:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0022:
                    java.lang.Object r1 = r0.f107128d
                    cj1.t$a r1 = (cj1.C54820t.C39956a) r1
                    java.lang.Object r2 = r0.f107130f
                    a14.n0 r2 = (a14.C0000n0) r2
                    kotlin.ResultKt.throwOnFailure(r19)
                    r3 = r19
                    goto L_0x00f0
                L_0x0031:
                    java.lang.Object r2 = r0.f107130f
                    a14.n0 r2 = (a14.C0000n0) r2
                    kotlin.ResultKt.throwOnFailure(r19)
                    r4 = r19
                    goto L_0x00de
                L_0x003c:
                    kotlin.ResultKt.throwOnFailure(r19)
                    java.lang.Object r2 = r0.f107130f
                    a14.n0 r2 = (a14.C0000n0) r2
                    boolean r7 = r0.f107131g
                    if (r7 == 0) goto L_0x0116
                    cj1.t r4 = r0.f107132h
                    r0.f107130f = r2
                    r0.f107129e = r6
                    r4.getClass()
                    a14.m r7 = new a14.m
                    wx3.d r8 = xx3.C66447b.m78392b(r18)
                    r7.<init>(r8, r6)
                    r7.mo74609p()
                    cj1.k0 r6 = new cj1.k0
                    r6.<init>(r4, r7)
                    java.lang.Class<cl1.u> r8 = cl1.C55001u.class
                    java.lang.String r9 = r4.f153694d
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    java.lang.String r11 = "doManualCloseLive liveId:"
                    r10.append(r11)
                    androidx.lifecycle.i0 r11 = r4.mo75777m0(r8)
                    cl1.u r11 = (cl1.C55001u) r11
                    te3.c21 r11 = r11.f154420q
                    long r11 = r11.f182392d
                    r10.append(r11)
                    java.lang.String r11 = " objectId:"
                    r10.append(r11)
                    androidx.lifecycle.i0 r11 = r4.mo75777m0(r8)
                    cl1.u r11 = (cl1.C55001u) r11
                    long r11 = r11.f154416j
                    r10.append(r11)
                    java.lang.String r11 = " nonceId:"
                    r10.append(r11)
                    androidx.lifecycle.i0 r11 = r4.mo75777m0(r8)
                    cl1.u r11 = (cl1.C55001u) r11
                    java.lang.String r11 = r11.f154423t
                    r10.append(r11)
                    java.lang.String r10 = r10.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
                    dj1.e1 r9 = new dj1.e1
                    androidx.lifecycle.i0 r10 = r4.mo75777m0(r8)
                    cl1.u r10 = (cl1.C55001u) r10
                    te3.c21 r10 = r10.f154420q
                    long r12 = r10.f182392d
                    androidx.lifecycle.i0 r10 = r4.mo75777m0(r8)
                    cl1.u r10 = (cl1.C55001u) r10
                    long r14 = r10.f154416j
                    androidx.lifecycle.i0 r8 = r4.mo75777m0(r8)
                    cl1.u r8 = (cl1.C55001u) r8
                    java.lang.String r8 = r8.f154423t
                    cj1.z r10 = new cj1.z
                    r10.<init>(r4, r6)
                    r11 = r9
                    r16 = r8
                    r17 = r10
                    r11.<init>(r12, r14, r16, r17)
                    r9.mo9225i()
                    com.tencent.mm.autogen.events.FeedLiveLifeEvent r4 = new com.tencent.mm.autogen.events.FeedLiveLifeEvent
                    r4.<init>()
                    r4.publish()
                    java.lang.Object r4 = r7.mo74608o()
                    if (r4 != r1) goto L_0x00de
                    return r1
                L_0x00de:
                    cj1.t$a r4 = (cj1.C54820t.C39956a) r4
                    cj1.t r6 = r0.f107132h
                    r0.f107130f = r2
                    r0.f107128d = r4
                    r0.f107129e = r5
                    java.lang.Object r3 = cj1.C54820t.m61747l0(r6, r3, r0)
                    if (r3 != r1) goto L_0x00ef
                    return r1
                L_0x00ef:
                    r1 = r4
                L_0x00f0:
                    cj1.t$a r3 = (cj1.C54820t.C39956a) r3
                    boolean r2 = a14.C53930o0.m60560g(r2)
                    if (r2 == 0) goto L_0x012d
                    boolean r2 = r1.f107104a
                    if (r2 == 0) goto L_0x010b
                    boolean r2 = r3.f107104a
                    if (r2 == 0) goto L_0x010b
                    fy3.s<java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, al1.b, rx3.b0> r1 = r0.f107133i
                    cj1.u r2 = new cj1.u
                    r2.<init>(r1, r3)
                    o40.C61926c.m72668M(r2)
                    goto L_0x012d
                L_0x010b:
                    fy3.s<java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, al1.b, rx3.b0> r2 = r0.f107133i
                    cj1.u r3 = new cj1.u
                    r3.<init>(r2, r1)
                    o40.C61926c.m72668M(r3)
                    goto L_0x012d
                L_0x0116:
                    cj1.t r2 = r0.f107132h
                    r0.f107129e = r4
                    java.lang.Object r2 = cj1.C54820t.m61747l0(r2, r3, r0)
                    if (r2 != r1) goto L_0x0121
                    return r1
                L_0x0121:
                    cj1.t$a r2 = (cj1.C54820t.C39956a) r2
                    fy3.s<java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, al1.b, rx3.b0> r1 = r0.f107133i
                    cj1.u r3 = new cj1.u
                    r3.<init>(r1, r2)
                    o40.C61926c.m72668M(r3)
                L_0x012d:
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: cj1.C54820t.C39963k.C39964a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C39963k(C0000n0 n0Var, boolean z, C54820t tVar, C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C0079b, C13598b0> sVar) {
            this.f107124d = n0Var;
            this.f107125e = z;
            this.f107126f = tVar;
            this.f107127g = sVar;
        }

        public final void run() {
            C53895h.m60466d(this.f107124d, (C66212f) null, C53934p0.UNDISPATCHED, new C39964a(this.f107125e, this.f107126f, this.f107127g, (C15601d<? super C39964a>) null), 1, (Object) null);
        }
    }

    /* renamed from: cj1.t$m0 */
    public static final class C39965m0 implements C47826f.C47827a {

        /* renamed from: a */
        public final /* synthetic */ C47826f.C47827a f107134a;

        /* renamed from: b */
        public final /* synthetic */ Context f107135b;

        public C39965m0(C47826f.C47827a aVar, Context context) {
            this.f107134a = aVar;
            this.f107135b = context;
        }

        /* renamed from: a */
        public void mo9151a(int i, long j, C50415mk1 mk12) {
        }

        /* renamed from: b */
        public void mo9152b(int i, int i2, String str, int i3, C50415mk1 mk12) {
        }

        /* renamed from: c */
        public void mo9153c(int i, long j) {
            C47826f.C47827a aVar = this.f107134a;
            if (aVar != null) {
                aVar.mo9153c(i, j);
            }
        }

        /* renamed from: d */
        public void mo9154d(int i, int i2, String str, int i3) {
            if (i2 == -200139) {
                Context context = this.f107135b;
                C76879j.m92711E(context, context.getString(C0966R.string.db6), "", this.f107135b.getString(C0966R.string.f8028zq), false, (DialogInterface.OnClickListener) null);
            } else {
                Context context2 = this.f107135b;
                C76912y0.m92767f(context2, context2.getString(C0966R.string.do4));
            }
            C47826f.C47827a aVar = this.f107134a;
            if (aVar != null) {
                aVar.mo9154d(i, i2, str, i3);
            }
        }
    }

    /* renamed from: cj1.t$w */
    public static final class C39966w<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C45369j0.C45370a f107136a;

        public C39966w(C45369j0.C45370a aVar) {
            this.f107136a = aVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C45369j0.C45370a aVar = this.f107136a;
            if (aVar == null) {
                return null;
            }
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            String str = cVar.f256795c;
            T t = cVar.f256796d;
            C87412m.m108593f(t, "it.resp");
            aVar.mo70891a(i, i2, str, (C51763w01) t);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$b */
    public static final class C54821b {
        public C54821b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C64293cq2 mo75784a(String str, C64265bq2 bq22, C64273c21 c212, TRTCCloudDef.TRTCParams tRTCParams, C58113g gVar, int i, C45795b bVar) {
            C64293cq2 cq22;
            boolean z;
            String str2 = str;
            C64265bq2 bq23 = bq22;
            C64273c21 c213 = c212;
            TRTCCloudDef.TRTCParams tRTCParams2 = tRTCParams;
            C58113g gVar2 = gVar;
            int i2 = i;
            C45795b bVar2 = bVar;
            C87412m.m108594g(str2, "name");
            C87412m.m108594g(bq23, "liveSdkInfo");
            C87412m.m108594g(c213, "liveInfo");
            C87412m.m108594g(tRTCParams2, "trtcParams");
            C87412m.m108594g(gVar2, "liveRoomInfo");
            C87412m.m108594g(bVar2, "liveData");
            tRTCParams2.roomId = bq23.f182314f;
            tRTCParams2.sdkAppId = bq23.f182312d;
            tRTCParams2.privateMapKey = C48374j0.m53713b(bq23.f182317i);
            tRTCParams2.userId = bq23.f182313e;
            tRTCParams2.userSig = C48374j0.m53713b(bq23.f182316h);
            tRTCParams2.role = (i2 == 1 || i2 != 2) ? 20 : 21;
            gVar2.f166231a = str2;
            gVar2.f166232b = c213.f182392d;
            HashMap<Integer, C7170j> hashMap = gVar2.f166241k;
            String str3 = bq23.f182323r;
            C87412m.m108593f(str3, "liveSdkInfo.live_cdn_url");
            hashMap.put(0, new C7170j(str3, 0, ""));
            gVar2.f166234d = bq23.f182319n;
            C47465a parseFrom = new C64293cq2().parseFrom(bq23.f182318j.f257327a);
            C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LiveSdkParams");
            C64293cq2 cq23 = (C64293cq2) parseFrom;
            C62042e eVar = C62042e.f176370a;
            if (eVar.mo87073d1(bVar2) || eVar.mo87035Q0(bVar2)) {
                C64254b81 b812 = c213.f182401p;
                gVar2.f166233c = b812 != null ? b812.f182228d : 0;
            } else {
                gVar2.f166233c = cq23.f182556f.f186808f;
            }
            int intValue = C32444a.f86182p0.mo60266n().intValue();
            if (!((!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_PURPLE && !BuildInfo.IS_FLAVOR_RED && !CrashReportFactory.hasDebuger()) || intValue == -1 || i2 == 1)) {
                gVar2.f166233c = intValue;
            }
            C64890zp2 zp22 = cq23.f182556f;
            gVar2.f166235e = zp22.f186810h;
            gVar2.f166236f = zp22.f186811i;
            gVar2.f166243m = zp22.f186822v;
            Class cls = C32735h.class;
            C64323dq2 dq22 = cq23.f182554d;
            C52151yp2 yp22 = cq23.f182555e;
            if (dq22 != null) {
                boolean z2 = (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_hevc_enc_enable_switch, 0) == 1) && dq22.f182815r > 0;
                C58739j4.f168176a.getClass();
                boolean booleanValue = ((Boolean) ((C36570n) C58739j4.f168179d).getValue()).booleanValue();
                boolean z3 = z2 && booleanValue;
                boolean z4 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_force_hevc_mixing, 0) == 1;
                Log.m105924i(StringKtKt.TAG, "processLiveSdkParams enableHEVCEncFromSvr:" + z2 + ", sdkenable:" + dq22.f182815r + ", enableHEVCEncFromLocal:" + booleanValue + ", isHEVCEncEnable:" + z3 + ", isForceHEVCMixing:" + z4);
                C60971a aVar = C60971a.C60973b.f173670a;
                aVar.mo85947d().f174724t = z3;
                aVar.mo85947d().f174725u = z4;
                if (dq22.f182804d > 0) {
                    aVar.mo85947d().f174711d = dq22.f182804d;
                }
                if (dq22.f182806f > 0) {
                    aVar.mo85947d().f174712e = dq22.f182806f;
                }
                if (dq22.f182807g > 0) {
                    aVar.mo85947d().f174713f = dq22.f182807g;
                }
                if (dq22.f182814q > 0) {
                    aVar.mo85947d().f174714g = dq22.f182814q;
                }
                if (dq22.f182816s > 0) {
                    aVar.mo85947d().f174715h = dq22.f182816s;
                }
                if (dq22.f182817t > 0) {
                    aVar.mo85947d().f174716i = dq22.f182817t;
                }
                if (dq22.f182818u > 0) {
                    aVar.mo85947d().f174717j = dq22.f182818u;
                }
                if (dq22.f182819v > 0) {
                    aVar.mo85947d().f174718n = dq22.f182819v;
                }
                if (dq22.f182809i > 0) {
                    aVar.mo85947d().f174720p = dq22.f182809i;
                }
                int i3 = dq22.f182810j;
                if (i3 >= 0 && i3 < 2) {
                    aVar.mo85947d().f174719o = dq22.f182810j;
                }
            }
            if (yp22 != null) {
                if (yp22.f145455d > 0) {
                    C60971a.C60973b.f173670a.mo85944a().f174703f = yp22.f145455d;
                }
                Log.m105924i(StringKtKt.TAG, "processLiveSdkParams audioQuality:" + yp22.f145455d);
            }
            if (zp22 != null) {
                Log.m105924i(StringKtKt.TAG, "userDefineRecordId:" + zp22.f186806d + ',' + zp22.f186807e);
                String str4 = zp22.f186807e;
                String str5 = zp22.f186806d;
                int i4 = zp22.f186817q;
                String str6 = zp22.f186796Q;
                boolean UY = ((C36594q) C86312j.m106911c(C36594q.class)).mo60733UY(5);
                C54766h4 h4Var = C54766h4.f153491a;
                if (C54766h4.f153494d == null) {
                    C54766h4.f153494d = new C64412h61();
                }
                C64412h61 h612 = C54766h4.f153494d;
                if (h612 != null) {
                    h612.f183407d = 1;
                }
                if (UY) {
                    C54766h4.f153495e = 1;
                }
                if (!UY) {
                    i4 = zp22.f186818r;
                    z = true;
                } else {
                    z = false;
                }
                gVar2.f166240j = ((C60106t) C86312j.m106911c(C60106t.class)).Cx0().mo58845Lo(gVar2.f166232b);
                gVar2.f166239i = zp22.f186818r;
                if (i4 < 100) {
                    gVar2.f166237g = C58107a.MMLiveStreamSwitchMode_Fixed;
                    gVar2.f166238h = i4;
                } else if (i4 == 101) {
                    gVar2.f166237g = C58107a.MMLiveStreamSwitchMode_Auto;
                } else if (i4 == 102) {
                    gVar2.f166237g = C58107a.MMLiveStreamSwitchMode_ML;
                }
                LinkedList<C64733to> linkedList = zp22.f186812j;
                if (!(linkedList == null || linkedList.isEmpty())) {
                    LinkedList<C64733to> linkedList2 = zp22.f186812j;
                    C87412m.m108593f(linkedList2, "channelParams.cdn_trans_info");
                    Iterator<T> it = linkedList2.iterator();
                    while (it.hasNext()) {
                        C64733to toVar = (C64733to) it.next();
                        HashMap<Integer, C7170j> hashMap2 = gVar2.f166241k;
                        Integer valueOf = Integer.valueOf(toVar.f185623f);
                        Iterator<T> it4 = it;
                        String str7 = toVar.f185622e;
                        C87412m.m108593f(str7, "it.url");
                        hashMap2.put(valueOf, new C7170j(str7, toVar.f185627j, toVar.f185628n));
                        it = it4;
                        cq23 = cq23;
                    }
                    cq22 = cq23;
                    if (z) {
                        C7170j d = gVar2.mo82871d(i4);
                        String str8 = d != null ? d.f25144c : null;
                        if ((str8 == null || str8.length() == 0) && C32444a.f86074K1.mo60266n().intValue() == 0) {
                            int i5 = zp22.f186817q;
                            C7170j jVar = gVar2.f166241k.get(Integer.valueOf(i4));
                            C7170j jVar2 = gVar2.f166241k.get(Integer.valueOf(i5));
                            if (!(jVar == null || jVar2 == null)) {
                                Log.m105924i("LiveRoomInfo", "before exchangeCdnUrl:" + gVar2.f166241k);
                                int i6 = jVar.f25143b;
                                String str9 = jVar.f25144c;
                                jVar.f25143b = jVar2.f25143b;
                                jVar.f25144c = jVar2.f25144c;
                                jVar2.f25143b = i6;
                                jVar2.f25144c = str9;
                                Log.m105924i("LiveRoomInfo", "after exchangeCdnUrl:" + gVar2.f166241k);
                            }
                        }
                    }
                } else {
                    cq22 = cq23;
                }
                if (!Util.isNullOrNil(str4) || !Util.isNullOrNil(str5) || !Util.isNullOrNil(str6)) {
                    C104289g gVar3 = new C104289g();
                    if (!Util.isNullOrNil(str4)) {
                        gVar3.put("userdefine_streamid_main", str4);
                    }
                    if (!Util.isNullOrNil(str5)) {
                        gVar3.put("userdefine_record_id", str5);
                    }
                    if (!Util.isNullOrNil(str6)) {
                        gVar3.put("userdefine_push_args", str6);
                    }
                    C104289g gVar4 = new C104289g();
                    gVar4.put("Str_uc_params", gVar3);
                    tRTCParams2.businessInfo = gVar4.toString();
                }
                gVar2.f166244n = zp22;
                Log.m105924i(StringKtKt.TAG, "processLiveSdkParams cdnQualitySvrcfg" + gVar2.f166238h + " cdnSwitchMode:" + gVar2.f166237g + " cdn_quality_h265backcfg:" + gVar2.f166239i);
            } else {
                cq22 = cq23;
            }
            Log.m105924i(StringKtKt.TAG, "processLiveCgiSDKResponse trtcParams.roomId" + tRTCParams2.roomId + " trtcParams.userId:" + tRTCParams2.userId + " debugAudienceMode:" + intValue + " liveRoomInfo:" + gVar2);
            return cq22;
        }
    }

    /* renamed from: cj1.t$d0 */
    public static final class C54822d0 implements C45375m0.C45376a {

        /* renamed from: a */
        public final /* synthetic */ C32230s<Boolean, Integer, Integer, String, C49366f21, C13598b0> f153696a;

        /* renamed from: cj1.t$d0$a */
        public static final class C54823a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f153697d;

            /* renamed from: e */
            public final /* synthetic */ int f153698e;

            /* renamed from: f */
            public final /* synthetic */ C32230s<Boolean, Integer, Integer, String, C49366f21, C13598b0> f153699f;

            /* renamed from: g */
            public final /* synthetic */ String f153700g;

            /* renamed from: h */
            public final /* synthetic */ C49366f21 f153701h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C54823a(int i, int i2, C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C49366f21, C13598b0> sVar, String str, C49366f21 f212) {
                super(0);
                this.f153697d = i;
                this.f153698e = i2;
                this.f153699f = sVar;
                this.f153700g = str;
                this.f153701h = f212;
            }

            public Object invoke() {
                int i = this.f153697d;
                if (i == 0 && this.f153698e == 0) {
                    C32230s<Boolean, Integer, Integer, String, C49366f21, C13598b0> sVar = this.f153699f;
                    if (sVar != null) {
                        sVar.mo237D(Boolean.TRUE, Integer.valueOf(i), Integer.valueOf(this.f153698e), this.f153700g, this.f153701h);
                    }
                } else {
                    C32230s<Boolean, Integer, Integer, String, C49366f21, C13598b0> sVar2 = this.f153699f;
                    if (sVar2 != null) {
                        sVar2.mo237D(Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(this.f153698e), this.f153700g, null);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C54822d0(C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C49366f21, C13598b0> sVar) {
            this.f153696a = sVar;
        }

        /* renamed from: a */
        public void mo70892a(int i, int i2, String str, C49366f21 f212) {
            C87412m.m108594g(f212, "resp");
            C61926c.m72668M(new C54823a(i, i2, this.f153696a, str, f212));
        }
    }

    /* renamed from: cj1.t$f0 */
    public static final class C54824f0 implements C8794p5<C64707sc1> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<C64707sc1, C50542nh0, C13598b0> f153702d;

        public C54824f0(C32227p<? super C64707sc1, ? super C50542nh0, C13598b0> pVar) {
            this.f153702d = pVar;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C64707sc1 sc12 = (C64707sc1) obj;
            C87412m.m108594g(sc12, "req");
            C87412m.m108594g(nh02, "ret");
            C32227p<C64707sc1, C50542nh0, C13598b0> pVar = this.f153702d;
            if (pVar != null) {
                pVar.invoke(sc12, nh02);
            }
        }
    }

    /* renamed from: cj1.t$g0 */
    public static final class C54825g0 implements C8794p5<C64707sc1> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<C64707sc1, C50542nh0, C13598b0> f153703d;

        public C54825g0(C32227p<? super C64707sc1, ? super C50542nh0, C13598b0> pVar) {
            this.f153703d = pVar;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C64707sc1 sc12 = (C64707sc1) obj;
            C87412m.m108594g(sc12, "req");
            C87412m.m108594g(nh02, "ret");
            C32227p<C64707sc1, C50542nh0, C13598b0> pVar = this.f153703d;
            if (pVar != null) {
                pVar.invoke(sc12, nh02);
            }
        }
    }

    /* renamed from: cj1.t$h */
    public static final class C54826h implements C61398h.C61400b {
        /* renamed from: a */
        public void mo75426a(int i, int i2, String str, C48742ao0 ao02, int i3, String str2) {
            C87412m.m108594g(ao02, "resp");
        }
    }

    /* renamed from: cj1.t$i */
    public static final class C54827i implements C58280i.C58281a {

        /* renamed from: a */
        public final /* synthetic */ C54820t f153704a;

        /* renamed from: b */
        public final /* synthetic */ C32232u<Boolean, Boolean, String, Integer, Integer, String, C49291ej0, C13598b0> f153705b;

        public C54827i(C54820t tVar, C32232u<? super Boolean, ? super Boolean, ? super String, ? super Integer, ? super Integer, ? super String, ? super C49291ej0, C13598b0> uVar) {
            this.f153704a = tVar;
            this.f153705b = uVar;
        }

        /* renamed from: a */
        public void mo75785a(int i, int i2, String str, C49291ej0 ej02) {
            int i3 = i2;
            C49291ej0 ej03 = ej02;
            C87412m.m108594g(ej03, "resp");
            if (i == 0 && i3 == 0) {
                C54820t tVar = this.f153704a;
                tVar.getClass();
                Class cls = C55001u.class;
                FinderObject finderObject = ej03.f132950d;
                String str2 = null;
                C64273c21 c212 = finderObject != null ? finderObject.liveInfo : null;
                C55001u uVar = (C55001u) tVar.mo75777m0(cls);
                if (c212 == null) {
                    c212 = new C64273c21();
                }
                uVar.mo76042m3(c212);
                ((C54991o) tVar.mo75777m0(C54991o.class)).mo76026x4(ej03.f132950d);
                C55001u uVar2 = (C55001u) tVar.mo75777m0(cls);
                FinderObject finderObject2 = ej03.f132950d;
                uVar2.f154416j = finderObject2 != null ? finderObject2.f164794id : 0;
                C55001u uVar3 = (C55001u) tVar.mo75777m0(cls);
                FinderObject finderObject3 = ej03.f132950d;
                if (finderObject3 != null) {
                    str2 = finderObject3.objectNonceId;
                }
                if (str2 == null) {
                    str2 = "";
                }
                uVar3.f154423t = str2;
                C32232u<Boolean, Boolean, String, Integer, Integer, String, C49291ej0, C13598b0> uVar4 = this.f153705b;
                if (uVar4 != null) {
                    uVar4.invoke(Boolean.TRUE, Boolean.FALSE, "", Integer.valueOf(i), Integer.valueOf(i2), str == null ? "" : str, ej02);
                    return;
                }
                return;
            }
            Log.m105924i(this.f153704a.f153694d, "launch live room failed");
            if (i3 == -200008) {
                C32232u<Boolean, Boolean, String, Integer, Integer, String, C49291ej0, C13598b0> uVar5 = this.f153705b;
                if (uVar5 != null) {
                    Boolean bool = Boolean.FALSE;
                    Boolean bool2 = Boolean.TRUE;
                    String str3 = ej03.f132951e;
                    uVar5.invoke(bool, bool2, str3 == null ? "" : str3, Integer.valueOf(i), Integer.valueOf(i2), str == null ? "" : str, ej02);
                }
            } else {
                C32232u<Boolean, Boolean, String, Integer, Integer, String, C49291ej0, C13598b0> uVar6 = this.f153705b;
                if (uVar6 != null) {
                    Boolean bool3 = Boolean.FALSE;
                    uVar6.invoke(bool3, bool3, "", Integer.valueOf(i), Integer.valueOf(i2), str == null ? "" : str, ej02);
                }
            }
            C58728f5.m68215a(C58728f5.f168144a, "createLive", i2, i, str == null ? "" : str, this.f153704a.f153692b, (String) null, 32, (Object) null);
        }
    }

    /* renamed from: cj1.t$p */
    public static final class C54828p extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54820t f153706d;

        /* renamed from: e */
        public final /* synthetic */ long f153707e;

        /* renamed from: f */
        public final /* synthetic */ Context f153708f;

        /* renamed from: g */
        public final /* synthetic */ int f153709g;

        /* renamed from: h */
        public final /* synthetic */ C32232u<Boolean, Integer, Integer, String, C58113g, TRTCCloudDef.TRTCParams, C52005xq0, C13598b0> f153710h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54828p(C54820t tVar, long j, Context context, int i, C32232u<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C58113g, ? super TRTCCloudDef.TRTCParams, ? super C52005xq0, C13598b0> uVar) {
            super(0);
            this.f153706d = tVar;
            this.f153707e = j;
            this.f153708f = context;
            this.f153709g = i;
            this.f153710h = uVar;
        }

        public Object invoke() {
            String str;
            C54738b1 b1Var;
            String str2;
            C60735a aVar;
            Intent intent;
            String stringExtra;
            C63654v2 v2Var;
            Class<C66880s0> cls = C66880s0.class;
            Class cls2 = C54991o.class;
            Class cls3 = C55001u.class;
            C54820t tVar = this.f153706d;
            C64414h71 e0 = tVar.mo75732e0(((C55001u) tVar.mo75777m0(cls3)).f154420q.f182392d);
            int i = C58598w.f167764h;
            long j = this.f153707e;
            Long l = C58598w.f167768l;
            if (l != null && l.longValue() == 0) {
                C58598w.f167768l = Long.valueOf(j);
                Log.m105924i("FinderLiveDataLoader", "setLiveReportObj " + C61926c.m72691p(j) + ", refObjectId:" + C61926c.m72691p(e0.f183433p));
                C58598w.f167767k = e0;
            }
            C62042e.f176370a.getClass();
            try {
                str = new C104289g(C112551y.m153816p(((C54116w) C86312j.m106911c(C54116w.class)).f151907K, ";", ",", false, 4, (Object) null)).optString("sessionBuffer");
                Log.m105924i("FinderLiveUtil", "getFieldInChnlExtra " + "sessionBuffer" + ": " + str);
            } catch (JSONException e) {
                Log.printErrStackTrace("FinderLiveUtil", e, "getFieldInChnlExtra", new Object[0]);
                str = null;
            }
            if (str == null) {
                str = "";
            }
            e0.f183436s = str;
            Context context = this.f153708f;
            if (!(context == null || (v2Var = (C63654v2) C39818r.f106831a.mo62443b(context).mo62449e(C63654v2.class)) == null)) {
                v2Var.f180454d = e0;
            }
            Context context2 = this.f153708f;
            Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
            String str3 = (activity == null || (intent = activity.getIntent()) == null || (stringExtra = intent.getStringExtra("key_enter_live_param_source_web_url")) == null) ? "" : stringExtra;
            long j2 = ((C55001u) this.f153706d.mo75777m0(cls3)).f154420q.f182392d;
            byte[] bArr = ((C55001u) this.f153706d.mo75777m0(cls3)).f154417n;
            String O5 = C66785b.f191882e.mo90662O5();
            long j3 = ((C55001u) this.f153706d.mo75777m0(cls3)).f154416j;
            int i2 = this.f153709g;
            String str4 = ((C55001u) this.f153706d.mo75777m0(cls3)).f154423t;
            String str5 = ((C55001u) this.f153706d.mo75777m0(cls3)).f154424u;
            String str6 = "";
            String str7 = ((C54991o) this.f153706d.mo75777m0(cls2)).f154204G2;
            String str8 = str4;
            int i3 = ((C54991o) this.f153706d.mo75777m0(cls2)).f154208H2;
            C54820t tVar2 = this.f153706d;
            Class<C66880s0> cls4 = cls;
            C49712hj1 hj12 = tVar2.f153693c;
            C52153yq0 yq02 = ((C54991o) tVar2.mo75777m0(cls2)).f154344n3;
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            String str9 = str5;
            String str10 = (finderLiveService == null || (aVar = FinderLiveService.f159378f) == null) ? null : aVar.f173005Q0;
            finderLiveService.getClass();
            C54129i iVar = FinderLiveService.f159398z;
            C58284o oVar = new C58284o(j2, bArr, O5, j3, i2, str8, str9, str7, i3, hj12, 0, yq02, str10, (iVar == null || (b1Var = iVar.f151991f) == null || (str2 = b1Var.f153437z) == null) ? str6 : str2, 0, ((C55001u) this.f153706d.mo75777m0(cls3)).f154426w, e0, ((C55001u) this.f153706d.mo75777m0(cls3)).f154414h, 0, str3, (C89349b) null, 1328128, (C8480h) null);
            Context context3 = this.f153708f;
            C54820t tVar3 = this.f153706d;
            if (context3 != null) {
                C39818r rVar = C39818r.f106831a;
                Class<C66880s0> cls5 = cls4;
                ((C66880s0) rVar.mo62443b(context3).mo75002a(cls5)).mo90876d3(oVar.f166895v);
                ((C66880s0) rVar.mo62443b(context3).mo75002a(cls5)).mo90877e3(((C55001u) tVar3.mo75777m0(cls3)).f154414h, oVar.f166895v.f186166d);
            }
            C89059e i4 = oVar.mo9225i();
            i4.mo123420E(new C0637y(this.f153706d, this.f153707e, this.f153710h, this.f153709g));
            C54820t tVar4 = this.f153706d;
            if (tVar4.mo75781q0() != null && (tVar4.mo75781q0() instanceof MMActivity) && !((C54946b0) tVar4.mo75777m0(C54946b0.class)).f153983g) {
                Context q0 = tVar4.mo75781q0();
                C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                i4.mo11397F((MMActivity) q0);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveAssistant", mo125469f = "FinderLiveAssistant.kt", mo125470l = {781, 2688, 2695}, mo125471m = "doLikeLive")
    /* renamed from: cj1.t$s */
    public static final class C54829s extends C66704d {

        /* renamed from: d */
        public Object f153711d;

        /* renamed from: e */
        public Object f153712e;

        /* renamed from: f */
        public Object f153713f;

        /* renamed from: g */
        public /* synthetic */ Object f153714g;

        /* renamed from: h */
        public final /* synthetic */ C54820t f153715h;

        /* renamed from: i */
        public int f153716i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54829s(C54820t tVar, C15601d<? super C54829s> dVar) {
            super(dVar);
            this.f153715h = tVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f153714g = obj;
            this.f153716i |= Integer.MIN_VALUE;
            return this.f153715h.mo75730d0(0, 0, this);
        }
    }

    /* renamed from: cj1.t$t */
    public static final class C54830t<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C54820t f153717a;

        /* renamed from: b */
        public final /* synthetic */ int f153718b;

        /* renamed from: c */
        public final /* synthetic */ C12360e8.C12371d f153719c;

        /* renamed from: d */
        public final /* synthetic */ C58291w0 f153720d;

        /* renamed from: e */
        public final /* synthetic */ String f153721e;

        /* renamed from: f */
        public final /* synthetic */ WeakReference<Context> f153722f;

        /* renamed from: g */
        public final /* synthetic */ String f153723g;

        /* renamed from: h */
        public final /* synthetic */ int f153724h;

        /* renamed from: i */
        public final /* synthetic */ String f153725i;

        public C54830t(C54820t tVar, int i, C12360e8.C12371d dVar, C58291w0 w0Var, String str, WeakReference<Context> weakReference, String str2, int i2, String str3) {
            this.f153717a = tVar;
            this.f153718b = i;
            this.f153719c = dVar;
            this.f153720d = w0Var;
            this.f153721e = str;
            this.f153722f = weakReference;
            this.f153723g = str2;
            this.f153724h = i2;
            this.f153725i = str3;
        }

        public Object call(Object obj) {
            String str;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            String str2 = cVar.f256795c;
            C51354t71 t712 = (C51354t71) cVar.f256796d;
            String str3 = this.f153717a.f153694d;
            StringBuilder sb = new StringBuilder();
            sb.append("doPostGift errType:");
            sb.append(i);
            sb.append(", errCode:");
            sb.append(i2);
            sb.append(", errMsg:");
            sb.append(str2);
            sb.append(", bill_no:");
            byte[] bArr = null;
            sb.append(t712 != null ? t712.f142015d : null);
            Log.m105924i(str3, sb.toString());
            C58730g5.f168158a.mo83650d(this.f153718b);
            if (i2 == 0 || i2 == -200042) {
                Context context = this.f153722f.get();
                if (context != null) {
                    C54820t tVar = this.f153717a;
                    String str4 = this.f153721e;
                    C89349b bVar = t712.f142016e;
                    if (bVar != null) {
                        bArr = bVar.mo123703f();
                    }
                    C54732a0 a0Var = new C54732a0(this.f153717a, this.f153719c, this.f153723g, this.f153724h, this.f153725i, this.f153720d);
                    C54737b0 b0Var = new C54737b0(this.f153717a, this.f153719c, this.f153723g, this.f153724h, this.f153725i, this.f153720d);
                    C54742c0 c0Var = new C54742c0(this.f153717a, this.f153719c, this.f153723g, this.f153724h, this.f153725i, this.f153720d);
                    String str5 = tVar.f153694d;
                    Log.m105924i(str5, "[WeCoin] sessionID:" + str4 + " consumeGift:" + bArr);
                    C13624e eVar = new C13624e(1, (FragmentActivity) context, a0Var, b0Var, c0Var);
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    eVar.f38603g = bArr;
                    ((C10756c) C86709a0.m107533q(C10756c.class)).mo10992Gy(eVar);
                }
            } else {
                C12360e8.C12371d dVar = this.f153719c;
                if (dVar != null) {
                    str = str2;
                    C12360e8.C12371d.C12372a.m11940a(dVar, false, i2, C12360e8.C12371d.C12373b.NETWORK, (String) null, (Long) null, 0, (String) null, str2, this.f153720d, 16, (Object) null);
                } else {
                    str = str2;
                }
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(22129, 1, this.f153721e, "", 1, 3, Integer.valueOf(i2), str);
                nVar.mo175912v(C58730g5.f168165h, 80);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.t$u */
    public static final class C54831u implements C45352e0.C45353a {

        /* renamed from: a */
        public final /* synthetic */ C54820t f153726a;

        /* renamed from: b */
        public final /* synthetic */ C32227p<Boolean, C51316sz0, C13598b0> f153727b;

        /* renamed from: cj1.t$u$a */
        public static final class C54832a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f153728d;

            /* renamed from: e */
            public final /* synthetic */ int f153729e;

            /* renamed from: f */
            public final /* synthetic */ C54820t f153730f;

            /* renamed from: g */
            public final /* synthetic */ C32227p<Boolean, C51316sz0, C13598b0> f153731g;

            /* renamed from: h */
            public final /* synthetic */ C51316sz0 f153732h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C54832a(int i, int i2, C54820t tVar, C32227p<? super Boolean, ? super C51316sz0, C13598b0> pVar, C51316sz0 sz02) {
                super(0);
                this.f153728d = i;
                this.f153729e = i2;
                this.f153730f = tVar;
                this.f153731g = pVar;
                this.f153732h = sz02;
            }

            public Object invoke() {
                if (this.f153728d == 0 && this.f153729e == 0) {
                    C39622i0 a = this.f153730f.f153692b.mo71262a(C54979h1.class);
                    C51316sz0 sz02 = this.f153732h;
                    C54979h1 h1Var = (C54979h1) a;
                    h1Var.f154110B = sz02.f141844f > 0;
                    h1Var.f154111C = sz02.f141843e;
                    C32227p<Boolean, C51316sz0, C13598b0> pVar = this.f153731g;
                    if (pVar != null) {
                        pVar.invoke(Boolean.TRUE, sz02);
                    }
                } else {
                    C32227p<Boolean, C51316sz0, C13598b0> pVar2 = this.f153731g;
                    if (pVar2 != null) {
                        pVar2.invoke(Boolean.FALSE, null);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C54831u(C54820t tVar, C32227p<? super Boolean, ? super C51316sz0, C13598b0> pVar) {
            this.f153726a = tVar;
            this.f153727b = pVar;
        }

        /* renamed from: a */
        public void mo70888a(int i, int i2, String str, C51316sz0 sz02) {
            C87412m.m108594g(sz02, "resp");
            C61926c.m72668M(new C54832a(i, i2, this.f153726a, this.f153727b, sz02));
        }
    }

    /* renamed from: cj1.t$y */
    public static final class C54833y<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f153733a;

        /* renamed from: b */
        public final /* synthetic */ String f153734b;

        /* renamed from: c */
        public final /* synthetic */ C54820t f153735c;

        public C54833y(C32226l<? super Boolean, C13598b0> lVar, String str, C54820t tVar) {
            this.f153733a = lVar;
            this.f153734b = str;
            this.f153735c = tVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C61866i0 i0Var = C61866i0.f175909a;
                String str = this.f153734b;
                C45795b bVar = this.f153735c.f153692b;
                T t = cVar.f256796d;
                C87412m.m108593f(t, "it.resp");
                if (i0Var.mo86800l(str, bVar, (C64434i11) t)) {
                    C32226l<Boolean, C13598b0> lVar = this.f153733a;
                    if (lVar == null) {
                        return null;
                    }
                    lVar.invoke(Boolean.TRUE);
                    return C13598b0.f38549a;
                }
                C32226l<Boolean, C13598b0> lVar2 = this.f153733a;
                if (lVar2 == null) {
                    return null;
                }
                lVar2.invoke(Boolean.FALSE);
                return C13598b0.f38549a;
            }
            C32226l<Boolean, C13598b0> lVar3 = this.f153733a;
            if (lVar3 == null) {
                return null;
            }
            lVar3.invoke(Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    public C54820t(WeakReference<Context> weakReference, C45795b bVar, C49712hj1 hj12) {
        C87412m.m108594g(bVar, "buContext");
        this.f153691a = weakReference;
        this.f153692b = bVar;
        this.f153693c = hj12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0072, code lost:
        if ((r3 instanceof cm1.C0740i2) != false) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x071e  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0725  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0798  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x07a2  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0834  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x084b  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x088d  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0890  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x099c  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x09a1  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x09cf  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x09d2  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0a05  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0a8a  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m61746k0(cj1.C54820t r51, te3.C52005xq0 r52, int r53, fy3.C32232u r54) {
        /*
            r0 = r51
            r9 = r52
            java.lang.Class<cl1.v1> r1 = cl1.C55004v1.class
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_VISITOR_ASSISTANT_INT_SYNC
            java.lang.Class<cl1.x> r3 = cl1.C0696x.class
            java.lang.Class<rl1.d0> r4 = rl1.C13022d0.class
            java.lang.Class<cl1.o1> r5 = cl1.C54994o1.class
            java.lang.Class<cl1.h1> r10 = cl1.C54979h1.class
            java.lang.Class<cl1.u> r11 = cl1.C55001u.class
            java.lang.Class<cl1.o> r12 = cl1.C54991o.class
            androidx.lifecycle.i0 r6 = r0.mo75777m0(r4)
            rl1.d0 r6 = (rl1.C13022d0) r6
            rl1.f0 r7 = new rl1.f0
            r7.<init>(r6)
            o40.C61926c.m72668M(r7)
            cj1.s r6 = cj1.C0590s.f1400a
            fj1.b r7 = r0.f153692b
            java.util.LinkedList<te3.z91> r8 = r9.f144859o
            r13 = 1
            r6.mo602a(r7, r8, r13)
            androidx.lifecycle.i0 r6 = r0.mo75777m0(r3)
            cl1.x r6 = (cl1.C0696x) r6
            te3.ly0 r7 = r9.f144819Q
            r6.mo659c3(r7)
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r3)
            cl1.x r3 = (cl1.C0696x) r3
            boolean r6 = r9.f144821R
            r3.mo660d3(r6)
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            te3.up2 r6 = r9.f144861p0
            r3.f154230N = r6
            te3.bq2 r3 = r9.f144844e
            java.lang.String r14 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            r8 = 0
            if (r3 == 0) goto L_0x08e2
            androidx.lifecycle.i0 r6 = r0.mo75777m0(r11)
            cl1.u r6 = (cl1.C55001u) r6
            te3.c21 r7 = r9.f144846f
            pe3.b r15 = r9.f144842d
            r6.mo76039j3(r3, r7, r15)
            te3.x51 r3 = r9.f144827U
            if (r3 == 0) goto L_0x0075
            byte[] r3 = r3.toByteArray()
            if (r3 == 0) goto L_0x0075
            ok1.e r6 = ok1.C62042e.f176370a
            sk1.k r3 = r6.mo87130y1(r3)
            boolean r6 = r3 instanceof cm1.C0740i2
            if (r6 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r3 = 0
        L_0x0076:
            java.lang.String r6 = r0.f153694d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r15 = "recive promote msg: "
            r7.append(r15)
            if (r3 == 0) goto L_0x0089
            org.json.JSONObject r15 = o40.C61937h.m72709h(r3)
            goto L_0x008b
        L_0x0089:
            java.lang.String r15 = "new_promote_info = null"
        L_0x008b:
            r7.append(r15)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            r6 = r53
            if (r6 == r13) goto L_0x00a8
            boolean r7 = r3 instanceof sk1.C13696v
            if (r7 == 0) goto L_0x00a8
            r7 = r3
            sk1.v r7 = (sk1.C13696v) r7
            boolean r7 = r7.f38759F
            if (r7 != r13) goto L_0x00a5
            goto L_0x00a8
        L_0x00a5:
            r24 = r14
            goto L_0x00cc
        L_0x00a8:
            te3.c21 r7 = r9.f144846f
            r24 = r14
            if (r7 == 0) goto L_0x00b1
            long r13 = r7.f182367M
            goto L_0x00b3
        L_0x00b1:
            r13 = 0
        L_0x00b3:
            int r7 = (int) r13
            r13 = 16
            boolean r7 = o40.C61926c.m72696u(r7, r13)
            androidx.lifecycle.i0 r13 = r0.mo75777m0(r10)
            cl1.h1 r13 = (cl1.C54979h1) r13
            r13.mo75935F3(r7)
            androidx.lifecycle.i0 r7 = r0.mo75777m0(r10)
            cl1.h1 r7 = (cl1.C54979h1) r7
            r7.mo75948o3(r3)
        L_0x00cc:
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            te3.ia1 r7 = r9.f144850h
            if (r7 == 0) goto L_0x00dd
            int r7 = r7.f135187d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00de
        L_0x00dd:
            r7 = 0
        L_0x00de:
            java.lang.String r13 = r3.f154311f
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "join live enableComment:"
            r14.append(r15)
            r14.append(r7)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)
            if (r7 == 0) goto L_0x010b
            r7.intValue()
            int r13 = r7.intValue()
            r14 = 1
            if (r13 != r14) goto L_0x0103
            r3.f154366t = r14
            goto L_0x010b
        L_0x0103:
            int r7 = r7.intValue()
            if (r7 != 0) goto L_0x010b
            r3.f154366t = r8
        L_0x010b:
            fj1.b r3 = r0.f153692b
            androidx.lifecycle.i0 r3 = r3.mo71262a(r12)
            cl1.o r3 = (cl1.C54991o) r3
            java.util.ArrayList<java.lang.String> r3 = r3.f154394z2
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L_0x017d
            dj1.p0$a r7 = dj1.C45381p0.f122894u
            te3.mh0 r22 = r7.mo70895a(r3)
            dj1.p0 r3 = new dj1.p0
            fj1.b r7 = r0.f153692b
            androidx.lifecycle.i0 r7 = r7.mo71262a(r11)
            cl1.u r7 = (cl1.C55001u) r7
            te3.c21 r7 = r7.f154420q
            long r13 = r7.f182392d
            fj1.b r7 = r0.f153692b
            androidx.lifecycle.i0 r7 = r7.mo71262a(r11)
            cl1.u r7 = (cl1.C55001u) r7
            long r8 = r7.f154416j
            r21 = 1
            r16 = r3
            r17 = r13
            r19 = r8
            r16.<init>(r17, r19, r21, r22)
            nr3.e r3 = r3.mo9225i()
            cj1.e0 r7 = new cj1.e0
            r7.<init>(r0)
            r3.mo123420E(r7)
            android.content.Context r7 = r51.mo75781q0()
            if (r7 == 0) goto L_0x016d
            android.content.Context r7 = r51.mo75781q0()
            boolean r7 = r7 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r7 == 0) goto L_0x016d
            android.content.Context r7 = r51.mo75781q0()
            r9 = r24
            gy3.C87412m.m108592e(r7, r9)
            com.tencent.mm.ui.MMActivity r7 = (com.tencent.p014mm.p136ui.MMActivity) r7
            r3.mo11397F(r7)
            goto L_0x016f
        L_0x016d:
            r9 = r24
        L_0x016f:
            fj1.b r3 = r0.f153692b
            androidx.lifecycle.i0 r3 = r3.mo71262a(r12)
            cl1.o r3 = (cl1.C54991o) r3
            java.util.ArrayList<java.lang.String> r3 = r3.f154394z2
            r3.clear()
            goto L_0x017f
        L_0x017d:
            r9 = r24
        L_0x017f:
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            r13 = r52
            java.lang.String r7 = r13.f144823S
            java.lang.String r8 = ""
            if (r7 != 0) goto L_0x018e
            r7 = r8
        L_0x018e:
            r3.mo75980Q4(r7)
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            te3.zq0 r7 = r13.f144858n
            r3.f154328j = r7
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            androidx.lifecycle.i0 r7 = r0.mo75777m0(r11)
            cl1.u r7 = (cl1.C55001u) r7
            te3.c21 r7 = r7.f154420q
            int r7 = r7.f182403q
            r3.f154242Q0 = r7
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            te3.db1 r7 = r13.f144866u
            r3.f154368t2 = r7
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r3.getClass()
            boolean r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159356I
            if (r3 == 0) goto L_0x01df
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            androidx.lifecycle.i0 r7 = r0.mo75777m0(r12)
            cl1.o r7 = (cl1.C54991o) r7
            long r6 = r7.f154276X
            androidx.lifecycle.i0 r14 = r0.mo75777m0(r11)
            cl1.u r14 = (cl1.C55001u) r14
            te3.c21 r14 = r14.f154420q
            long r14 = r14.f182414z
            int r17 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r17 >= 0) goto L_0x01dd
            r6 = r14
        L_0x01dd:
            r3.f154276X = r6
        L_0x01df:
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            te3.uy0 r6 = r13.f144805B
            r3.f154363s1 = r6
            if (r6 == 0) goto L_0x01ee
            int r6 = r6.f143181e
            goto L_0x01ef
        L_0x01ee:
            r6 = 0
        L_0x01ef:
            r3.f154371u1 = r6
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            te3.is1 r6 = r13.f144816M
            r3.f154231N1 = r6
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r6 = r13.f144811H
            r3.f154199F1 = r6
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            long r6 = r13.f144815L
            int r7 = (int) r6
            r6 = 1
            boolean r7 = o40.C61926c.m72696u(r7, r6)
            r7 = r7 ^ r6
            r3.f154227M1 = r7
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            te3.vy0 r6 = r13.f144834X0
            r3.f154294a4 = r6
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            te3.dt1 r6 = r13.f144835Y
            r3.f154298b4 = r6
            te3.uv0 r3 = r13.f144837Z
            if (r3 == 0) goto L_0x025d
            fj1.b r6 = r0.f153692b
            java.lang.String r7 = "buContext"
            gy3.C87412m.m108594g(r6, r7)
            androidx.lifecycle.i0 r6 = r6.mo71262a(r12)
            cl1.o r6 = (cl1.C54991o) r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "processAudienceEventInfo "
            r6.append(r7)
            java.lang.String r7 = "joinLive"
            r6.append(r7)
            java.lang.String r7 = ", token:"
            r6.append(r7)
            java.lang.String r3 = r3.f143154d
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r6 = "Finder.OlympicsLiveRoomUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
        L_0x025d:
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            boolean r6 = r13.f144825T
            r3.f154190D = r6
            te3.v71 r3 = r13.f144822R0
            if (r3 == 0) goto L_0x0273
            int r3 = r3.f143374d
            r6 = 10
            if (r3 != r6) goto L_0x0273
            r3 = 1
            goto L_0x0274
        L_0x0273:
            r3 = 0
        L_0x0274:
            androidx.lifecycle.i0 r6 = r0.mo75777m0(r12)
            cl1.o r6 = (cl1.C54991o) r6
            d14.u0<java.lang.Boolean> r6 = r6.f154194E
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            d14.j1 r6 = (d14.C58052j1) r6
            r6.setValue(r3)
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r6 = r13.f144847f1
            r3.f154206H = r6
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r6 = r13.f144824S0
            r3.f154374v = r6
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            int r6 = r13.f144829V
            r7 = 8192(0x2000, float:1.14794E-41)
            boolean r6 = o40.C61926c.m72696u(r6, r7)
            r3.f154268V1 = r6
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            r6 = 1
            r3.f154273W1 = r6
            te3.c21 r3 = r13.f144846f
            if (r3 == 0) goto L_0x02ba
            long r6 = r3.f182367M
            int r3 = (int) r6
            goto L_0x02bb
        L_0x02ba:
            r3 = 0
        L_0x02bb:
            r6 = 32768(0x8000, float:4.5918E-41)
            boolean r3 = o40.C61926c.m72696u(r3, r6)
            androidx.lifecycle.i0 r6 = r0.mo75777m0(r5)
            cl1.o1 r6 = (cl1.C54994o1) r6
            androidx.lifecycle.z<java.lang.Boolean> r6 = r6.f154402i
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6.postValue(r3)
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r5)
            cl1.o1 r3 = (cl1.C54994o1) r3
            te3.u94 r6 = r13.f144872y0
            if (r6 == 0) goto L_0x02de
            boolean r6 = r6.f142689e
            goto L_0x02df
        L_0x02de:
            r6 = 0
        L_0x02df:
            r3.f154403j = r6
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_ACCOUNT_LIVE_HAS_SING_SONG_ABILITY_SETTING_BOOLEAN_SYNC
            te3.u94 r7 = r13.f144872y0
            if (r7 == 0) goto L_0x02f2
            boolean r7 = r7.f142690f
            goto L_0x02f3
        L_0x02f2:
            r7 = 0
        L_0x02f3:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r3.mo119677K(r6, r7)
            te3.c21 r3 = r13.f144846f
            if (r3 == 0) goto L_0x0302
            long r6 = r3.f182367M
            int r3 = (int) r6
            goto L_0x0303
        L_0x0302:
            r3 = 0
        L_0x0303:
            r6 = 262144(0x40000, float:3.67342E-40)
            boolean r3 = o40.C61926c.m72696u(r3, r6)
            r6 = 1
            r3 = r3 ^ r6
            java.lang.String r6 = r0.f153694d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r14 = "[processJoinLiveResponse] canGetRetentionList = "
            r7.append(r14)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            androidx.lifecycle.i0 r6 = r0.mo75777m0(r10)
            cl1.h1 r6 = (cl1.C54979h1) r6
            if (r3 != 0) goto L_0x0330
            p40.a<cm1.i2> r7 = r6.f154141p
            java.util.List<E> r7 = r7.f127225a
            r7.clear()
        L_0x0330:
            r6.f154142q = r3
            te3.c21 r3 = r13.f144846f
            if (r3 == 0) goto L_0x033a
            long r6 = r3.f182367M
            int r3 = (int) r6
            goto L_0x033b
        L_0x033a:
            r3 = 0
        L_0x033b:
            r6 = 524288(0x80000, float:7.34684E-40)
            boolean r3 = o40.C61926c.m72696u(r3, r6)
            r6 = 1
            r3 = r3 ^ r6
            java.lang.String r6 = r0.f153694d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r14 = "[processJoinLiveResponse] canGetProductList = "
            r7.append(r14)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            androidx.lifecycle.i0 r6 = r0.mo75777m0(r10)
            cl1.h1 r6 = (cl1.C54979h1) r6
            r6.f154143r = r3
            boolean r3 = r13.f144825T
            r6 = 2
            if (r3 == 0) goto L_0x0427
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            r7 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            r3.mo119677K(r2, r14)
            android.content.Context r2 = r51.mo75781q0()
            if (r2 == 0) goto L_0x0392
            r3 = 2131826162(0x7f1115f2, float:1.92852E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "getString(R.string.finder_assistant_join)"
            gy3.C87412m.m108593f(r2, r3)
            cj1.n0 r3 = new cj1.n0
            r3.<init>(r0, r2)
            o40.C61926c.m72668M(r3)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0392:
            int r2 = r13.f144829V
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            boolean r7 = o40.C61926c.m72696u(r2, r6)
            r3.f154243Q1 = r7
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            r7 = 256(0x100, float:3.59E-43)
            boolean r7 = o40.C61926c.m72696u(r2, r7)
            r3.f154392z = r7
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r10)
            cl1.h1 r3 = (cl1.C54979h1) r3
            int r7 = r13.f144806C
            r15 = 1
            if (r7 == r15) goto L_0x03bb
            r7 = 1
            goto L_0x03bc
        L_0x03bb:
            r7 = 0
        L_0x03bc:
            r3.mo75943j3(r7)
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r4)
            rl1.d0 r3 = (rl1.C13022d0) r3
            androidx.lifecycle.z<java.lang.Boolean> r3 = r3.f37101q
            long r6 = r13.f144833X
            int r7 = (int) r6
            boolean r6 = o40.C61926c.m72696u(r7, r15)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r3.postValue(r6)
            java.lang.String r3 = r0.f153694d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "joinLive, set isAssistant 1, switchFlag:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = ", enableGiftSwitch:"
            r6.append(r2)
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r12)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.f154243Q1
            r6.append(r2)
            java.lang.String r2 = ", liveRoomLikeSwitch:"
            r6.append(r2)
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r12)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.f154392z
            r6.append(r2)
            java.lang.String r2 = ", bindShop:"
            r6.append(r2)
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r10)
            cl1.h1 r2 = (cl1.C54979h1) r2
            boolean r2 = r2.f154134f
            r6.append(r2)
            java.lang.String r2 = ",anchor_live_ext_flag:"
            r6.append(r2)
            r7 = r5
            long r4 = r13.f144833X
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            goto L_0x043f
        L_0x0427:
            r7 = r5
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.mo119677K(r2, r5)
            java.lang.String r2 = r0.f153694d
            java.lang.String r3 = "joinLive, set isAssistant, 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
        L_0x043f:
            android.content.Context r2 = r51.mo75781q0()
            if (r2 == 0) goto L_0x0469
            boolean r3 = r2 instanceof androidx.appcompat.app.AppCompatActivity
            if (r3 == 0) goto L_0x0467
            bl3.r r3 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
            bl3.r$a r2 = r3.mo62444c(r2)
            java.lang.Class<ht1.g4> r3 = ht1.C60172g4.class
            bl3.c r2 = r2.mo62447c(r3)
            ht1.g4 r2 = (ht1.C60172g4) r2
            boolean r3 = r13.f144825T
            if (r3 == 0) goto L_0x0460
            java.lang.String r3 = "1"
            goto L_0x0462
        L_0x0460:
            java.lang.String r3 = "0"
        L_0x0462:
            java.lang.String r4 = "moderators_type"
            r2.mo12837C3(r4, r3)
        L_0x0467:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0469:
            java.lang.String r2 = r0.f153694d
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = r13.f144811H
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = "joinlive resp ecSource:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            java.lang.Class<cl1.a1> r2 = cl1.C54943a1.class
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r2)
            cl1.a1 r2 = (cl1.C54943a1) r2
            cj1.g0 r3 = new cj1.g0
            r3.<init>(r0)
            r2.f153976g = r3
            te3.u94 r2 = r13.f144872y0
            if (r2 == 0) goto L_0x04d2
            boolean r3 = r2.f142689e
            if (r3 == 0) goto L_0x04ad
            java.lang.String r3 = r2.f142688d
            if (r3 == 0) goto L_0x049c
            int r3 = r3.length()
            if (r3 != 0) goto L_0x049a
            goto L_0x049c
        L_0x049a:
            r3 = 0
            goto L_0x049d
        L_0x049c:
            r3 = 1
        L_0x049d:
            if (r3 != 0) goto L_0x04ad
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r7)
            cl1.o1 r3 = (cl1.C54994o1) r3
            androidx.lifecycle.z<java.lang.String> r3 = r3.f154400g
            java.lang.String r4 = r2.f142688d
            r3.postValue(r4)
            goto L_0x04b8
        L_0x04ad:
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r7)
            cl1.o1 r3 = (cl1.C54994o1) r3
            androidx.lifecycle.z<java.lang.String> r3 = r3.f154400g
            r3.postValue(r8)
        L_0x04b8:
            java.lang.String r3 = r0.f153694d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "from joinlive SingingSongName: "
            r4.append(r5)
            java.lang.String r2 = r2.f142688d
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x04d2:
            java.util.LinkedList<java.lang.Integer> r2 = r13.f144818P
            if (r2 == 0) goto L_0x04e7
            cj1.z3 r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159383n
            r3.getClass()
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r3.f153758g
            cj1.a4 r5 = new cj1.a4
            r5.<init>(r2, r3)
            r4.post(r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x04e7:
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r12)
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.f154371u1
            r3 = 1
            if (r2 == r3) goto L_0x04ff
            if (r2 == 0) goto L_0x04ff
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r12)
            cl1.o r2 = (cl1.C54991o) r2
            fj1.b r3 = r0.f153692b
            r2.mo75994c3(r3)
        L_0x04ff:
            int r2 = r13.f144870x0
            r3 = 4096(0x1000, float:5.74E-42)
            boolean r2 = o40.C61926c.m72696u(r2, r3)
            if (r2 == 0) goto L_0x0571
            java.lang.String r2 = "Finder.FinderLiveVisitorGameTeamWidget"
            java.lang.String r3 = "extflag canShowEntrance"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            qg1.n r2 = new qg1.n
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r11)
            cl1.u r3 = (cl1.C55001u) r3
            long r3 = r3.f154416j
            androidx.lifecycle.i0 r5 = r0.mo75777m0(r11)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            long r5 = r5.f182392d
            androidx.lifecycle.i0 r7 = r0.mo75777m0(r11)
            cl1.u r7 = (cl1.C55001u) r7
            byte[] r7 = r7.f154417n
            pe3.b r30 = pe3.C89349b.m111674a(r7)
            androidx.lifecycle.i0 r7 = r0.mo75777m0(r11)
            cl1.u r7 = (cl1.C55001u) r7
            java.lang.String r7 = r7.f154423t
            r32 = 0
            r33 = 16
            r34 = 0
            r25 = r2
            r26 = r3
            r28 = r5
            r31 = r7
            r25.<init>(r26, r28, r30, r31, r32, r33, r34)
            nr3.e r2 = r2.mo9225i()
            cj1.h0 r3 = new cj1.h0
            r3.<init>(r0, r13)
            r2.mo123420E(r3)
            android.content.Context r3 = r51.mo75781q0()
            if (r3 == 0) goto L_0x056f
            android.content.Context r3 = r51.mo75781q0()
            boolean r3 = r3 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r3 == 0) goto L_0x056f
            android.content.Context r3 = r51.mo75781q0()
            gy3.C87412m.m108592e(r3, r9)
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            r2.mo11397F(r3)
        L_0x056f:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0571:
            java.lang.String r2 = r0.f153694d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "gameteam joinlive liveData.business(LiveCommonSlice::class.java).gameInfo:"
            r3.append(r4)
            androidx.lifecycle.i0 r4 = r0.mo75777m0(r12)
            cl1.o r4 = (cl1.C54991o) r4
            te3.uy0 r4 = r4.f154363s1
            if (r4 != 0) goto L_0x0588
            r4 = r8
        L_0x0588:
            org.json.JSONObject r4 = o40.C61937h.m72709h(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            te3.ty0 r2 = r13.f144810G
            if (r2 == 0) goto L_0x05bd
            java.lang.String r2 = r0.f153694d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "live_game_data:"
            r3.append(r4)
            te3.ty0 r4 = r13.f144810G
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r12)
            cl1.o r2 = (cl1.C54991o) r2
            te3.ty0 r3 = r13.f144810G
            r2.f154179A1 = r3
            goto L_0x05c4
        L_0x05bd:
            java.lang.String r2 = r0.f153694d
            java.lang.String r3 = "live_game_data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
        L_0x05c4:
            com.tencent.trtc.TRTCCloudDef$TRTCParams r7 = new com.tencent.trtc.TRTCCloudDef$TRTCParams
            r7.<init>()
            fe1.d$b r2 = fe1.C58961d.f168673a
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.f154345o
            fe1.q r2 = r2.mo84155b(r3)
            if (r2 == 0) goto L_0x05e0
            java.lang.String r2 = r2.getNickname()
            r17 = r2
            goto L_0x05e2
        L_0x05e0:
            r17 = r8
        L_0x05e2:
            d50.g r6 = new d50.g
            r25 = r6
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r11)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r2 = r2.f182392d
            r27 = r2
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r49 = 131068(0x1fffc, float:1.83665E-40)
            r50 = 0
            r26 = r17
            r25.<init>(r26, r27, r29, r30, r31, r33, r35, r36, r37, r38, r39, r40, r42, r43, r44, r45, r47, r49, r50)
            cj1.t$b r16 = f153690f
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r11)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r11)
            cl1.u r3 = (cl1.C55001u) r3
            te3.bq2 r3 = r3.f154419p
            fj1.b r4 = r0.f153692b
            r18 = r3
            r19 = r2
            r20 = r7
            r21 = r6
            r22 = r53
            r23 = r4
            te3.cq2 r2 = r16.mo75784a(r17, r18, r19, r20, r21, r22, r23)
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r1)
            cl1.v1 r3 = (cl1.C55004v1) r3
            java.util.LinkedList<te3.aq2> r4 = r2.f182557g
            java.lang.String r5 = "liveSdkParam.channel_params_desc"
            gy3.C87412m.m108593f(r4, r5)
            r3.f154438i = r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0651:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0678
            java.lang.Object r5 = r4.next()
            te3.aq2 r5 = (te3.C64239aq2) r5
            te3.zp2 r5 = r5.f182131d
            te3.zp2 r8 = r2.f182556f
            int r14 = r8.f186798S
            r3.f154444r = r14
            r5.f186798S = r14
            java.lang.String r14 = r8.f186799T
            r5.f186799T = r14
            java.lang.String r14 = r8.f186799T
            r3.f154445s = r14
            java.lang.String r14 = r8.f186800U
            r5.f186800U = r14
            java.lang.String r5 = r8.f186800U
            r3.f154446t = r5
            goto L_0x0651
        L_0x0678:
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r1)
            cl1.v1 r1 = (cl1.C55004v1) r1
            r1.mo76047d3(r6)
            te3.zp2 r1 = r2.f182556f
            if (r1 == 0) goto L_0x0701
            pe1.c<java.lang.Integer> r3 = gg1.C32444a.f86081M1
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r15 = 1
            if (r3 != r15) goto L_0x0696
            r3 = 1
            goto L_0x0697
        L_0x0696:
            r3 = 0
        L_0x0697:
            if (r3 == 0) goto L_0x06af
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r11)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            int r3 = r3.f182384X
            if (r3 != r15) goto L_0x06af
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            r4 = 0
            r3.f154332k1 = r4
            goto L_0x06b9
        L_0x06af:
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            int r4 = r1.f186819s
            r3.f154332k1 = r4
        L_0x06b9:
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            te3.zp2 r4 = r2.f182556f
            int r4 = r4.f186820t
            r15 = 1
            if (r4 != r15) goto L_0x06c8
            r4 = 1
            goto L_0x06c9
        L_0x06c8:
            r4 = 0
        L_0x06c9:
            r3.f154296b2 = r4
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            te3.zp2 r4 = r2.f182556f
            int r5 = r4.f186821u
            if (r5 != r15) goto L_0x06d9
            r5 = 1
            goto L_0x06da
        L_0x06d9:
            r5 = 0
        L_0x06da:
            r3.f154300c2 = r5
            int r3 = r4.f186797R
            r4 = 2
            if (r4 > r3) goto L_0x06e7
            r5 = 51
            if (r3 >= r5) goto L_0x06e7
            r3 = 1
            goto L_0x06e8
        L_0x06e7:
            r3 = 0
        L_0x06e8:
            if (r3 == 0) goto L_0x06f7
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            te3.zp2 r2 = r2.f182556f
            int r2 = r2.f186797R
            r3.f154304d2 = r2
            goto L_0x0701
        L_0x06f7:
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r12)
            cl1.o r2 = (cl1.C54991o) r2
            r3 = 2
            r2.f154304d2 = r3
            goto L_0x0702
        L_0x0701:
            r3 = 2
        L_0x0702:
            java.lang.Class<cl1.p1> r2 = cl1.C0678p1.class
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r2)
            cl1.p1 r2 = (cl1.C0678p1) r2
            int r4 = r6.f166243m
            boolean r3 = o40.C61926c.m72696u(r4, r3)
            r2.f1596f = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "processLiveSdkParams support_screen_rotate:"
            r2.append(r3)
            if (r1 == 0) goto L_0x0725
            int r1 = r1.f186819s
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0726
        L_0x0725:
            r1 = 0
        L_0x0726:
            r2.append(r1)
            java.lang.String r1 = ",qosReport:"
            r2.append(r1)
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r12)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.f154296b2
            r2.append(r1)
            java.lang.String r1 = ", qosControl:"
            r2.append(r1)
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r12)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.f154300c2
            r2.append(r1)
            java.lang.String r1 = ", seiMode:"
            r2.append(r1)
            int r1 = r6.f166243m
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MicroMsg.StringKt"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            int r1 = r13.f144870x0
            r0.mo75782r0(r1)
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r12)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.Class<cl1.g1> r1 = cl1.C0657g1.class
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r1)
            cl1.g1 r1 = (cl1.C0657g1) r1
            te3.r71 r2 = r13.f144832W0
            r1.f1556h = r2
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r12)
            cl1.o r1 = (cl1.C54991o) r1
            r2 = 1
            r1.mo76028z4(r2)
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r11)
            cl1.u r1 = (cl1.C55001u) r1
            te3.bq2 r1 = r1.f154419p
            long r1 = r1.f182321p
            r3 = 60
            long r1 = r1 - r3
            r3 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r3
            long r1 = r1 * r3
            r3 = 60000(0xea60, double:2.9644E-319)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0799
            r1 = r3
        L_0x0799:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r3.mo77645s(r1)
            te3.c21 r1 = r13.f144846f
            if (r1 == 0) goto L_0x07ed
            int r2 = r1.f182405s
            r3 = 5
            if (r2 != r3) goto L_0x07b8
            java.lang.String r2 = r0.f153694d
            java.lang.String r4 = "processJoinLiveResponse: externalPost = true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r12)
            cl1.o r2 = (cl1.C54991o) r2
            r4 = 1
            r2.f154301c3 = r4
            goto L_0x07c9
        L_0x07b8:
            r4 = 1
            java.lang.String r2 = r0.f153694d
            java.lang.String r5 = "processJoinLiveResponse: externalPost = false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r12)
            cl1.o r2 = (cl1.C54991o) r2
            r5 = 0
            r2.f154301c3 = r5
        L_0x07c9:
            int r2 = r1.f182405s
            if (r2 != r4) goto L_0x07da
            java.lang.String r2 = r0.f153694d
            java.lang.String r4 = "processJoinLiveResponse: isShowGameWelfareTask = true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r12)
            cl1.o r2 = (cl1.C54991o) r2
        L_0x07da:
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r12)
            cl1.o r2 = (cl1.C54991o) r2
            int r1 = r1.f182405s
            if (r1 == r3) goto L_0x07ea
            r3 = 1
            if (r1 != r3) goto L_0x07e8
            goto L_0x07ea
        L_0x07e8:
            r1 = 0
            goto L_0x07eb
        L_0x07ea:
            r1 = 1
        L_0x07eb:
            r2.f154305d3 = r1
        L_0x07ed:
            int r1 = r13.f144829V
            java.lang.String r2 = r0.f153694d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "switchFlag from joinLive = "
            r3.append(r4)
            r3.append(r1)
            r4 = 125(0x7d, float:1.75E-43)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r12)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.f154305d3
            if (r2 == 0) goto L_0x0832
            ok1.e r2 = ok1.C62042e.f176370a
            fj1.b r3 = r0.f153692b
            boolean r2 = r2.mo87032P0(r3)
            if (r2 == 0) goto L_0x0832
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r12)
            cl1.o r2 = (cl1.C54991o) r2
            long r3 = (long) r1
            r2.mo75983S4(r3)
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r12)
            cl1.o r1 = (cl1.C54991o) r1
            r1.mo75976O4(r3)
        L_0x0832:
            if (r54 == 0) goto L_0x084b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r8 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.String r5 = ""
            r1 = r54
            r14 = r7
            r15 = 0
            r8 = r52
            r1.invoke(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x084d
        L_0x084b:
            r14 = r7
            r15 = 0
        L_0x084d:
            java.lang.String r1 = r0.f153694d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "processJoinLiveResponse live_id:"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r11)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r3 = r3.f182392d
            r2.append(r3)
            java.lang.String r3 = ",appId:"
            r2.append(r3)
            int r3 = r14.sdkAppId
            r2.append(r3)
            java.lang.String r3 = ",roomId:"
            r2.append(r3)
            int r3 = r14.roomId
            r2.append(r3)
            java.lang.String r3 = ",userId:"
            r2.append(r3)
            java.lang.String r3 = r14.userId
            r2.append(r3)
            java.lang.String r3 = ", micUser:$"
            r2.append(r3)
            te3.m31 r3 = r13.f144848g
            if (r3 == 0) goto L_0x0890
            java.util.LinkedList<te3.l31> r3 = r3.f137806j
            goto L_0x0891
        L_0x0890:
            r3 = 0
        L_0x0891:
            r2.append(r3)
            java.lang.String r3 = ",heat1:"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r11)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r3 = r3.f182407u
            r2.append(r3)
            java.lang.String r3 = ",heat2:"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r11)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r3 = r3.f182377T0
            r2.append(r3)
            java.lang.String r3 = ",like:"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r11)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r3 = r3.f182414z
            r2.append(r3)
            java.lang.String r3 = ", enableBgm:"
            r2.append(r3)
            ok1.e r3 = ok1.C62042e.f176370a
            fj1.b r4 = r0.f153692b
            boolean r3 = r3.mo86991B(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x08e5
        L_0x08e2:
            r13 = r9
            r9 = r14
            r15 = 0
        L_0x08e5:
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r12)
            cl1.o r1 = (cl1.C54991o) r1
            te3.hx0 r2 = r13.f144854j
            if (r2 == 0) goto L_0x08f2
            java.util.LinkedList<te3.aw0> r2 = r2.f134930r
            goto L_0x08f3
        L_0x08f2:
            r2 = 0
        L_0x08f3:
            r1.mo76018p4(r2)
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r12)
            cl1.o r1 = (cl1.C54991o) r1
            int r2 = r13.f144863r
            r1.f154324i = r2
            java.lang.Class<cl1.t1> r1 = cl1.C0690t1.class
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r1)
            cl1.t1 r1 = (cl1.C0690t1) r1
            int r2 = r13.f144863r
            r3 = 1
            boolean r2 = o40.C61926c.m72696u(r2, r3)
            r1.mo655i3(r2)
            ok1.e r16 = ok1.C62042e.f176370a
            boolean r1 = r16.mo87027N0()
            if (r1 != 0) goto L_0x0ac4
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r12)
            cl1.o r1 = (cl1.C54991o) r1
            java.util.LinkedList<te3.fs0> r2 = r13.f144860p
            java.lang.String r4 = "this"
            gy3.C87412m.m108593f(r2, r4)
            zc1.b r4 = zc1.C66785b.f191882e
            r5 = 0
            bd1.b r4 = zc1.C66783a.C66784a.m78800c(r4, r15, r3, r5)
            if (r4 == 0) goto L_0x095a
            java.util.Iterator r6 = r2.iterator()
        L_0x0935:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x094d
            java.lang.Object r7 = r6.next()
            r8 = r7
            te3.fs0 r8 = (te3.C64373fs0) r8
            int r8 = r8.f183215f
            r11 = 3
            if (r8 != r11) goto L_0x0949
            r8 = 1
            goto L_0x094a
        L_0x0949:
            r8 = 0
        L_0x094a:
            if (r8 == 0) goto L_0x0935
            goto L_0x094e
        L_0x094d:
            r7 = r5
        L_0x094e:
            te3.fs0 r7 = (te3.C64373fs0) r7
            if (r7 == 0) goto L_0x095a
            java.lang.String r6 = r4.field_nickname
            r7.f183213d = r6
            java.lang.String r4 = r4.field_avatarUrl
            r7.f183214e = r4
        L_0x095a:
            r1.f154339m2 = r2
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r12)
            cl1.o r1 = (cl1.C54991o) r1
            int r2 = r13.f144862q
            r1.f154336l2 = r2
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r12)
            cl1.o r1 = (cl1.C54991o) r1
            long r6 = r13.f144864s
            r1.f154343n2 = r6
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r12)
            cl1.o r1 = (cl1.C54991o) r1
            te3.i31 r2 = r13.f144839a1
            if (r2 == 0) goto L_0x097d
            java.lang.String r2 = r2.f135074d
            goto L_0x097e
        L_0x097d:
            r2 = r5
        L_0x097e:
            r1.f154347o2 = r2
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r12)
            cl1.o r1 = (cl1.C54991o) r1
            te3.i31 r2 = r13.f144839a1
            if (r2 == 0) goto L_0x0999
            boolean r4 = r2.f135076f
            if (r4 == 0) goto L_0x098f
            goto L_0x0990
        L_0x098f:
            r2 = r5
        L_0x0990:
            if (r2 == 0) goto L_0x0999
            int r2 = r2.f135075e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x099a
        L_0x0999:
            r2 = r5
        L_0x099a:
            if (r2 == 0) goto L_0x09a1
            int r8 = r2.intValue()
            goto L_0x09a2
        L_0x09a1:
            r8 = 0
        L_0x09a2:
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_VISITOR_HARDCODE_ROLE_INT_SYNC
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r4.mo119677K(r6, r7)
            r1.f154352p2 = r2
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r12)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r2 = r13.f144841c1
            r1.f154356q2 = r2
            java.lang.String r1 = r0.f153694d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[processVisitorRoleResponse] preferred_show_nickname:"
            r2.append(r4)
            te3.i31 r4 = r13.f144839a1
            if (r4 == 0) goto L_0x09d2
            java.lang.String r4 = r4.f135074d
            goto L_0x09d3
        L_0x09d2:
            r4 = r5
        L_0x09d3:
            r2.append(r4)
            java.lang.String r4 = ", replace_role_type:"
            r2.append(r4)
            androidx.lifecycle.i0 r4 = r0.mo75777m0(r12)
            cl1.o r4 = (cl1.C54991o) r4
            java.lang.Integer r4 = r4.f154352p2
            r2.append(r4)
            java.lang.String r4 = ", is_force_use_server_nickname:"
            r2.append(r4)
            boolean r4 = r13.f144841c1
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r12)
            cl1.o r1 = (cl1.C54991o) r1
            java.util.LinkedList<te3.fs0> r1 = r1.f154339m2
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0a8a
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r12)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r2 = r1.f154311f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "updateVisitorRoleInfo,before udpate:"
            r4.append(r6)
            te3.fs0 r6 = r1.mo75986U3()
            org.json.JSONObject r6 = o40.C61937h.m72709h(r6)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            java.util.LinkedList<te3.fs0> r2 = r1.f154339m2
            java.util.Iterator r2 = r2.iterator()
        L_0x0a30:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0a4c
            java.lang.Object r4 = r2.next()
            r6 = r4
            te3.fs0 r6 = (te3.C64373fs0) r6
            int r6 = r6.f183215f
            int r7 = r1.mo76014n3()
            if (r6 != r7) goto L_0x0a47
            r8 = 1
            goto L_0x0a48
        L_0x0a47:
            r8 = 0
        L_0x0a48:
            if (r8 == 0) goto L_0x0a30
            r15 = r4
            goto L_0x0a4d
        L_0x0a4c:
            r15 = r5
        L_0x0a4d:
            te3.fs0 r15 = (te3.C64373fs0) r15
            if (r15 == 0) goto L_0x0a53
            r1.f154333k2 = r15
        L_0x0a53:
            java.lang.String r2 = r1.f154311f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "updateVisitorRoleInfo,after udpate:"
            r3.append(r4)
            te3.fs0 r1 = r1.mo75986U3()
            org.json.JSONObject r1 = o40.C61937h.m72709h(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            ok1.e r1 = ok1.C62042e.f176370a
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r12)
            cl1.o r2 = (cl1.C54991o) r2
            java.util.LinkedList<te3.fs0> r2 = r2.f154339m2
            int r3 = r13.f144862q
            androidx.lifecycle.i0 r4 = r0.mo75777m0(r12)
            cl1.o r4 = (cl1.C54991o) r4
            long r4 = r4.f154343n2
            r1.mo87019K1(r2, r3, r4)
            goto L_0x0ac4
        L_0x0a8a:
            java.lang.String r1 = r0.f153694d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "processVisitorRoleResponse "
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r12)
            cl1.o r3 = (cl1.C54991o) r3
            java.util.LinkedList<te3.fs0> r3 = r3.f154339m2
            androidx.lifecycle.i0 r4 = r0.mo75777m0(r12)
            cl1.o r4 = (cl1.C54991o) r4
            int r19 = r4.mo76014n3()
            androidx.lifecycle.i0 r4 = r0.mo75777m0(r12)
            cl1.o r4 = (cl1.C54991o) r4
            long r4 = r4.f154343n2
            java.lang.String r17 = "joinLive"
            r18 = r3
            r20 = r4
            java.lang.String r3 = r16.mo87004F1(r17, r18, r19, r20)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
        L_0x0ac4:
            java.lang.String r1 = r0.f153694d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "joinLive tracBuff = "
            r2.append(r3)
            java.lang.String r3 = r13.f144840b1
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            fj1.b r1 = r0.f153692b
            androidx.lifecycle.i0 r1 = r1.mo71262a(r12)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r2 = r13.f144840b1
            r1.f154241Q = r2
            ok1.e r1 = ok1.C62042e.f176370a
            fj1.b r2 = r0.f153692b
            boolean r2 = r1.mo86991B(r2)
            if (r2 == 0) goto L_0x0b0c
            android.content.Context r2 = r51.mo75781q0()
            boolean r2 = r2 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r2 == 0) goto L_0x0b0c
            android.content.Context r2 = r51.mo75781q0()
            gy3.C87412m.m108592e(r2, r9)
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
            fj1.b r3 = r0.f153692b
            te3.zv0 r4 = r13.f144804A
            cj1.i0 r5 = cj1.C54772i0.f153519d
            r1.mo86996C1(r2, r3, r4, r5)
        L_0x0b0c:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            com.tencent.mm.plugin.finder.live.view.b r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r1 == 0) goto L_0x0b24
            java.lang.Class<qj1.l0> r2 = qj1.C12490l0.class
            qj1.c r1 = r1.getPlugin(r2)
            qj1.l0 r1 = (qj1.C12490l0) r1
            if (r1 == 0) goto L_0x0b24
            r1.mo12142b1()
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0b24:
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r10)
            cl1.h1 r1 = (cl1.C54979h1) r1
            te3.q51 r2 = r13.f144849g1
            r1.f154133Z = r2
            androidx.lifecycle.i0 r0 = r0.mo75777m0(r12)
            cl1.o r0 = (cl1.C54991o) r0
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r13.f144856k1
            r0.f154261U = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54820t.m61746k0(cj1.t, te3.xq0, int, fy3.u):void");
    }

    /* renamed from: l0 */
    public static final Object m61747l0(C54820t tVar, int i, C15601d dVar) {
        tVar.getClass();
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        C7335d c = C86312j.m106911c(C60606n.class);
        C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
        C60606n.C60607a.m70857a((C60606n) c, ((C55001u) tVar.mo75777m0(C55001u.class)).f154420q.f182392d, true, (C9487b) null, new C39954j0(tVar, hVar), i, (String) null, (C50429mo2) null, 100, (Object) null);
        return hVar.mo90314b();
    }

    /* renamed from: A */
    public void mo75697A(Activity activity, C51790w61 w612, ResultReceiver resultReceiver, C32226l<? super Integer, C13598b0> lVar) {
        C0074h0 h0Var = C0074h0.UNKNOWN;
        C54090i0 i0Var = C54090i0.ONLY_WX_IDENTIFY_INTERRUPT_NOTIFY;
        Class cls = C55001u.class;
        Class cls2 = C54116w.class;
        Class cls3 = C54991o.class;
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(w612, "luckyMoneySendInfo");
        String str = this.f153694d;
        Log.m105924i(str, "goReceiveLuckyMoney visitorRole:" + ((C54991o) mo75777m0(cls3)).mo75986U3().f183215f);
        Bundle bundle = new Bundle();
        int i = 1;
        if (((C54991o) mo75777m0(cls3)).mo75986U3().f183215f == 3 && !C62042e.f176370a.mo87027N0()) {
            if (lVar != null) {
                lVar.invoke(1);
            }
            C7335d c = C86312j.m106911c(cls2);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C61568m.C61569a.m72264b((C61568m) c, i0Var, h0Var, true, 0, 8, (Object) null);
        } else if (((C54991o) mo75777m0(cls3)).mo75986U3().f183215f != 2 || C62042e.f176370a.mo87027N0()) {
            String str2 = null;
            String string = (((C54991o) mo75777m0(cls3)).mo75986U3().f183215f == 1 || C62042e.f176370a.mo87027N0()) ? null : activity.getResources().getString(C0966R.string.e0i);
            String Ts0 = ((C59774i) C86312j.m106911c(C59774i.class)).Ts0();
            if (Ts0 == null) {
                Ts0 = "";
            }
            C68070l.C68072b u = C68070l.C68072b.m80422u(w612.f143883i, (String) null);
            if (!Util.isNullOrNil(w612.f143882h)) {
                i = 2;
            }
            bundle.putInt("key_live_anchor_type", i);
            bundle.putString("key_live_error_msg", string);
            bundle.putString("key_live_id", C61926c.m72691p(((C55001u) mo75777m0(cls)).f154420q.f182392d));
            bundle.putString("key_live_attach", ((C54991o) mo75777m0(cls3)).f154376v2.f514b);
            bundle.putInt("key_from", 3);
            bundle.putString("key_session_id", Ts0);
            bundle.putString("key_username", ((C54991o) mo75777m0(cls3)).f154345o);
            if (resultReceiver == null) {
                resultReceiver = new ResultReceiver(MMHandler.createFreeHandler(Looper.getMainLooper()));
            }
            bundle.putParcelable("key_open_result_receiver", resultReceiver);
            C55001u uVar = (C55001u) FinderLiveService.f159376d.mo77630e(cls);
            if (uVar != null) {
                str2 = uVar.f154424u;
            }
            bundle.putString("key_live_session_buff", str2);
            bundle.putLong("key_live_start_time", ((C54116w) C86312j.m106911c(cls2)).f151935d);
            bundle.putString("key_live_feed_id", C61926c.m72691p(((C55001u) mo75777m0(cls)).f154416j));
            bundle.putLong("key_live_enter_session_id", ((C54116w) C86312j.m106911c(cls2)).f151950p);
            C54116w wVar = (C54116w) C86312j.m106911c(cls2);
            wVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long j = wVar.f151935d;
            bundle.putLong("key_live_now_live_time", currentTimeMillis > j ? currentTimeMillis - j : 0);
            ((C10700d) C86312j.m106911c(C10700d.class)).mo10952A0(activity, bundle, u);
            String str3 = this.f153694d;
            Log.m105924i(str3, "goReceiveLuckyMoney liveId:" + ((C55001u) mo75777m0(cls)).f154420q.f182392d + ", clientBuff:" + ((C54991o) mo75777m0(cls3)).f154376v2.f514b + ", sessionId:" + Ts0 + ", anchorUsername:" + ((C54991o) mo75777m0(cls3)).f154345o + ", appMsgContent:" + u);
            if (lVar != null) {
                lVar.invoke(0);
            }
        } else {
            if (lVar != null) {
                lVar.invoke(2);
            }
            C7335d c2 = C86312j.m106911c(cls2);
            C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
            C61568m.C61569a.m72264b((C61568m) c2, i0Var, h0Var, true, 0, 8, (Object) null);
        }
    }

    /* renamed from: B */
    public void mo75698B(Context context, long j, String str, Long l, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "username");
        ((C54991o) mo75777m0(C54991o.class)).f154350p0 = false;
        ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76727xV(context, j, str, l, i);
    }

    /* renamed from: C */
    public C10757d mo75699C(FragmentActivity fragmentActivity, int i, C32224a<C13598b0> aVar) {
        C87412m.m108594g(fragmentActivity, "context");
        C87412m.m108594g(aVar, "callback");
        String Ts0 = ((C59774i) C86312j.m106911c(C59774i.class)).Ts0();
        if (Ts0 == null) {
            Ts0 = "";
        }
        String str = this.f153694d;
        Log.m105924i(str, "showRechargeFoodsDialog sessionId:" + Ts0);
        C10761g gVar = new C10761g();
        gVar.f32222a = i;
        gVar.f32224c = Ts0;
        gVar.f32225d = new C0613o0(this, fragmentActivity, aVar);
        gVar.f32228g = C10760f.COMMON_CHARGE;
        return ((C10756c) C86709a0.m107533q(C10756c.class)).q10(fragmentActivity, gVar);
    }

    /* renamed from: D */
    public void mo75700D(int i, C49765hx0 hx02, String str, String str2, C45360g.C45361a aVar) {
        String str3;
        Class cls = C54963d0.class;
        Class cls2 = C55001u.class;
        boolean N0 = C62042e.f176370a.mo87027N0();
        String str4 = this.f153694d;
        StringBuilder sb = new StringBuilder();
        sb.append("closeLinkMic isAnchor:");
        sb.append(N0);
        sb.append(", linkMicState:");
        sb.append(((C54963d0) mo75777m0(cls)).f154078u);
        sb.append(", liveId:");
        sb.append(((C55001u) mo75777m0(cls2)).f154420q.f182392d);
        sb.append(", objectId:");
        sb.append(((C55001u) mo75777m0(cls2)).f154416j);
        sb.append(", nonceId:");
        sb.append(((C55001u) mo75777m0(cls2)).f154423t);
        sb.append(", scene:");
        sb.append(i);
        sb.append(", userId:");
        C54130j jVar = ((C54963d0) mo75777m0(cls)).f154073p;
        sb.append(jVar != null ? jVar.f151997a : null);
        sb.append(", selfSdkId:");
        sb.append(((C54991o) mo75777m0(C54991o.class)).mo76015n4());
        sb.append(", sessionId:");
        C54130j jVar2 = ((C54963d0) mo75777m0(cls)).f154073p;
        String str5 = "";
        if (jVar2 == null || (str3 = jVar2.f152002f) == null) {
            str3 = str5;
        }
        sb.append(str3);
        sb.append(", applySessionId:");
        sb.append(((C54963d0) mo75777m0(cls)).f154070j);
        Log.m105924i(str4, sb.toString());
        long j = ((C55001u) mo75777m0(cls2)).f154420q.f182392d;
        long j2 = ((C55001u) mo75777m0(cls2)).f154416j;
        String str6 = ((C55001u) mo75777m0(cls2)).f154423t;
        byte[] bArr = ((C55001u) mo75777m0(cls2)).f154417n;
        String str7 = str == null ? str5 : str;
        if (str2 != null) {
            str5 = str2;
        }
        C52013xs0 xs02 = new C52013xs0();
        xs02.f144909n = str5;
        C51010qt0 qt02 = new C51010qt0();
        qt02.f140535d = str7;
        xs02.f144906h = C89349b.m111674a(qt02.toByteArray());
        xs02.f144903e = 20005;
        xs02.f144904f = C58739j4.f168176a.mo83718n();
        new C45360g(j, j2, str6, bArr, i, xs02, aVar).mo9225i();
    }

    /* renamed from: E */
    public void mo75701E(String str, long j, C45377n.C45378a aVar) {
        C87412m.m108594g(aVar, "callback");
        C89059e i = new C45377n(str, j, aVar).mo9225i();
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i.mo11397F((MMActivity) q0);
        }
    }

    /* renamed from: F */
    public void mo75702F(long j, long j2, String str, byte[] bArr, int i, LinkedList<String> linkedList, C45393v.C45394a aVar) {
        LinkedList<String> linkedList2 = linkedList;
        C87412m.m108594g(linkedList2, "usernameList");
        String str2 = this.f153694d;
        StringBuilder sb = new StringBuilder();
        sb.append("batchGetMicContact liveId:");
        long j3 = j;
        sb.append(j);
        sb.append(", objectId:");
        sb.append(j2);
        sb.append(", nonceId:");
        sb.append(str);
        sb.append(", scene:");
        int i2 = i;
        sb.append(i2);
        Log.m105924i(str2, sb.toString());
        C89059e i3 = new C45393v(j, j2, str, bArr, i2, linkedList2, aVar).mo9225i();
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i3.mo11397F((MMActivity) q0);
        }
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010d  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo75703G(android.content.Intent r10) {
        /*
            r9 = this;
            java.lang.Class<cl1.o> r10 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r9.mo75777m0(r10)
            cl1.o r0 = (cl1.C54991o) r0
            te3.fs0 r0 = r0.mo75986U3()
            int r0 = r0.f183215f
            androidx.lifecycle.i0 r1 = r9.mo75777m0(r10)
            cl1.o r1 = (cl1.C54991o) r1
            r1.mo75989X3()
            androidx.lifecycle.i0 r1 = r9.mo75777m0(r10)
            cl1.o r1 = (cl1.C54991o) r1
            te3.fs0 r1 = r1.mo75986U3()
            int r1 = r1.f183215f
            java.lang.String r2 = r9.f153694d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkVisitorRoleType oriVisitorRoleType:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ",newVisitorRoleType:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x004a
            r0 = 4
            if (r1 == r0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            if (r0 != 0) goto L_0x0115
            androidx.lifecycle.i0 r1 = r9.mo75777m0(r10)
            cl1.o r1 = (cl1.C54991o) r1
            te3.uy0 r4 = r1.f154363s1
            te3.is1 r5 = r1.f154231N1
            r6 = 0
            if (r4 == 0) goto L_0x00a6
            if (r5 == 0) goto L_0x00a6
            nk1.o r7 = nk1.C61791o.f175673a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = r1.f154311f
            r8.append(r1)
            java.lang.String r1 = "_getlast"
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            r7.mo86721c(r5, r1)
            java.lang.String r1 = r4.f143182f
            if (r1 == 0) goto L_0x0081
            int r4 = r1.length()
            if (r4 != 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r4 = 0
            goto L_0x0082
        L_0x0081:
            r4 = 1
        L_0x0082:
            if (r4 != 0) goto L_0x00a6
            java.util.LinkedList<te3.hs1> r4 = r5.f135633d
            if (r4 == 0) goto L_0x00a6
            java.util.Iterator r4 = r4.iterator()
        L_0x008c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00a2
            java.lang.Object r5 = r4.next()
            r7 = r5
            te3.hs1 r7 = (te3.C49747hs1) r7
            java.lang.String r7 = r7.f134839d
            boolean r7 = gy3.C87412m.m108589b(r7, r1)
            if (r7 == 0) goto L_0x008c
            goto L_0x00a3
        L_0x00a2:
            r5 = r6
        L_0x00a3:
            te3.hs1 r5 = (te3.C49747hs1) r5
            goto L_0x00a7
        L_0x00a6:
            r5 = r6
        L_0x00a7:
            if (r5 == 0) goto L_0x010a
            androidx.lifecycle.i0 r10 = r9.mo75777m0(r10)
            cl1.o r10 = (cl1.C54991o) r10
            te3.hs1 r10 = r10.mo75958F3()
            if (r10 == 0) goto L_0x00bd
            int r1 = r5.f134841f
            int r4 = r10.f134841f
            if (r1 == r4) goto L_0x00bd
            r1 = 1
            goto L_0x00be
        L_0x00bd:
            r1 = 0
        L_0x00be:
            java.lang.String r4 = r9.f153694d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "check should update by gameRankSwitch, "
            r7.append(r8)
            if (r10 == 0) goto L_0x00ce
            r8 = 1
            goto L_0x00cf
        L_0x00ce:
            r8 = 0
        L_0x00cf:
            r7.append(r8)
            java.lang.String r8 = ", last:"
            r7.append(r8)
            int r8 = r5.f134841f
            r7.append(r8)
            java.lang.String r8 = ", cur:"
            r7.append(r8)
            if (r10 == 0) goto L_0x00ea
            int r8 = r10.f134841f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x00eb
        L_0x00ea:
            r8 = r6
        L_0x00eb:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            if (r10 == 0) goto L_0x00fd
            int r10 = r10.f134841f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
        L_0x00fd:
            if (r1 == 0) goto L_0x0107
            if (r6 == 0) goto L_0x0107
            int r10 = r6.intValue()
            r5.f134841f = r10
        L_0x0107:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            goto L_0x010b
        L_0x010a:
            r1 = 0
        L_0x010b:
            if (r6 != 0) goto L_0x0116
            java.lang.String r10 = r9.f153694d
            java.lang.String r4 = "lastGameRankSwitchInfo null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            goto L_0x0116
        L_0x0115:
            r1 = 0
        L_0x0116:
            if (r0 != 0) goto L_0x011d
            if (r1 == 0) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            r2 = 0
            goto L_0x013b
        L_0x011d:
            com.tencent.mm.autogen.events.FeedUpdateEvent r10 = new com.tencent.mm.autogen.events.FeedUpdateEvent
            r10.<init>()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r10.f9173d
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r9.mo75777m0(r1)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            long r3 = r1.f182392d
            r0.f9174a = r3
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r10.f9173d
            r1 = 14
            r0.f9175b = r1
            r10.publish()
        L_0x013b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54820t.mo75703G(android.content.Intent):boolean");
    }

    /* renamed from: H */
    public void mo75704H(String str, boolean z, Context context, C32226l<? super Boolean, C13598b0> lVar) {
        String str2 = str;
        Context context2 = context;
        C32226l<? super Boolean, C13598b0> lVar2 = lVar;
        Class cls = C55001u.class;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(lVar2, "callback");
        if (z) {
            String O5 = C66785b.f191882e.mo90662O5();
            long j = ((C55001u) mo75777m0(cls)).f154416j;
            long j2 = ((C55001u) mo75777m0(cls)).f154420q.f182392d;
            C49106d71 d712 = new C49106d71();
            LinkedList<C51934x71> linkedList = d712.f132161d;
            C51934x71 x712 = new C51934x71();
            x712.f144501d = str2;
            x712.f144502e = 2;
            linkedList.add(x712);
            C13598b0 b0Var = C13598b0.f38549a;
            C89059e i = new C45383q0(O5, j, j2, 2, (C48898bs0) null, d712, 16, (C8480h) null).mo9225i();
            i.mo123420E(new C0606k0(this, context2, lVar2, str2));
            if (context2 instanceof MMActivity) {
                i.mo11397F((MMActivity) context2);
                return;
            }
            return;
        }
        String O52 = C66785b.f191882e.mo90662O5();
        long j3 = ((C55001u) mo75777m0(cls)).f154416j;
        long j4 = ((C55001u) mo75777m0(cls)).f154420q.f182392d;
        C48898bs0 bs02 = new C48898bs0();
        LinkedList<C51934x71> linkedList2 = bs02.f131283d;
        C51934x71 x713 = new C51934x71();
        x713.f144501d = str2;
        x713.f144502e = 2;
        linkedList2.add(x713);
        C13598b0 b0Var2 = C13598b0.f38549a;
        C89059e i2 = new C45383q0(O52, j3, j4, 1, bs02, (C49106d71) null, 32, (C8480h) null).mo9225i();
        i2.mo123420E(new C0608l0(this, context2, lVar2, str2));
        if (context2 instanceof MMActivity) {
            i2.mo11397F((C9487b) context2);
        }
    }

    /* renamed from: I */
    public void mo75705I(Bundle bundle, Object obj, String str) {
        C87412m.m108594g(str, "keyUsername");
        Bundle bundle2 = obj instanceof Bundle ? (Bundle) obj : null;
        if (bundle2 != null) {
            String string = bundle2.getString(str);
            if (!(string == null || string.length() == 0)) {
                C54804r0.f153631a.mo75765g(mo75781q0(), this.f153692b, false, string, this.f153693c);
                return;
            }
            String str2 = this.f153694d;
            Log.m105924i(str2, "onPostGoToVisitorProfileResult finderUsername:" + string);
        }
    }

    /* renamed from: J */
    public void mo75706J(long j, long j2, int i, int i2, C47826f.C47827a aVar) {
        int i3 = i;
        Class cls = LiveAnchorSlice.class;
        Class cls2 = C54963d0.class;
        String str = this.f153694d;
        Log.m105924i(str, "setAnchorStatus liveId:" + j + " objectId:" + j2 + " flag:" + i3 + " micSetting[" + ((C54963d0) mo75777m0(cls2)).f154048B.f144323d + XVFSFile.PATH_SEPARATOR_CHAR + ((C54963d0) mo75777m0(cls2)).f154048B.f144324e + ']');
        C51887ww2 ww22 = new C51887ww2();
        ww22.f144323d = ((C54963d0) mo75777m0(cls2)).f154048B.f144323d;
        C50280ll1 ll12 = new C50280ll1();
        ll12.f137501e = String.valueOf(((LiveAnchorSlice) mo75777m0(cls)).f160033i);
        ll12.f137502f = ((LiveAnchorSlice) mo75777m0(cls)).f160032h;
        int o0 = mo75779o0(i3);
        String O5 = C66785b.f191882e.mo90662O5();
        C54991o oVar = (C54991o) mo75777m0(C54991o.class);
        C51868wr1 wr12 = new C51868wr1();
        wr12.f144237d = oVar.f154371u1;
        wr12.f144238e = oVar.mo75967K3();
        new C47826f(j, j2, o0, O5, i2, ww22, wr12, ((C13022d0) mo75777m0(C13022d0.class)).f37103s, 0, aVar, ll12, 256, (C8480h) null).mo9225i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x007e, code lost:
        r7 = (r7 = r7.objectDesc).liveDesc;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo75707K(long r18, long r20, java.lang.String r22, byte[] r23, int r24, te3.C49765hx0 r25, java.lang.String r26, int r27, pe3.C89349b r28, dj1.C45350e.C45351a r29) {
        /*
            r17 = this;
            r0 = r17
            r1 = r25
            r2 = r26
            r3 = r27
            java.lang.String r4 = r0.f153694d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "applyLinkMicPk liveId:"
            r5.append(r6)
            r8 = r18
            r5.append(r8)
            java.lang.String r6 = ", objectId:"
            r5.append(r6)
            r10 = r20
            r5.append(r10)
            java.lang.String r6 = ", nonceId:"
            r5.append(r6)
            r6 = r22
            r5.append(r6)
            java.lang.String r7 = ", scene:"
            r5.append(r7)
            r14 = r24
            r5.append(r14)
            java.lang.String r7 = ", sdkUserId:"
            r5.append(r7)
            r5.append(r2)
            java.lang.String r7 = ", sdkLiveId:"
            r5.append(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            dj1.e r4 = new dj1.e
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            te3.xs0 r15 = new te3.xs0
            r15.<init>()
            r15.f144902d = r1
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            if (r1 != 0) goto L_0x0065
            te3.hx0 r1 = new te3.hx0
            r1.<init>()
        L_0x0065:
            r7.add(r1)
            r15.f144908j = r7
            te3.ht0 r1 = new te3.ht0
            r1.<init>()
            androidx.lifecycle.i0 r7 = r0.mo75777m0(r5)
            cl1.o r7 = (cl1.C54991o) r7
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.f154341n
            r12 = 0
            if (r7 == 0) goto L_0x0085
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = r7.objectDesc
            if (r7 == 0) goto L_0x0085
            te3.px0 r7 = r7.liveDesc
            if (r7 == 0) goto L_0x0085
            java.lang.String r7 = r7.f184911d
            goto L_0x0086
        L_0x0085:
            r7 = r12
        L_0x0086:
            if (r7 == 0) goto L_0x0091
            int r13 = r7.length()
            if (r13 != 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r13 = 0
            goto L_0x0092
        L_0x0091:
            r13 = 1
        L_0x0092:
            if (r13 == 0) goto L_0x00b4
            androidx.lifecycle.i0 r7 = r0.mo75777m0(r5)
            cl1.o r7 = (cl1.C54991o) r7
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.f154341n
            if (r7 == 0) goto L_0x00b2
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = r7.objectDesc
            if (r7 == 0) goto L_0x00b2
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r7 = r7.media
            if (r7 == 0) goto L_0x00b2
            java.lang.Object r7 = sx3.C110818d0.m150916N(r7)
            com.tencent.mm.protocal.protobuf.FinderMedia r7 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r7
            if (r7 == 0) goto L_0x00b2
            java.lang.String r7 = r7.url
            if (r7 != 0) goto L_0x00b4
        L_0x00b2:
            java.lang.String r7 = ""
        L_0x00b4:
            r1.f183551d = r7
            r1.f183554g = r2
            r1.f183555h = r3
            r2 = r28
            r1.f183553f = r2
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r5)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.mo75991Z3()
            if (r2 == 0) goto L_0x00d4
            androidx.lifecycle.i0 r2 = r0.mo75777m0(r5)
            cl1.o r2 = (cl1.C54991o) r2
            te3.up2 r12 = r2.mo75973N3()
        L_0x00d4:
            r1.f183552e = r12
            byte[] r1 = r1.toByteArray()
            pe3.b r1 = pe3.C89349b.m111674a(r1)
            r15.f144906h = r1
            r1 = 20015(0x4e2f, float:2.8047E-41)
            r15.f144903e = r1
            er1.j4 r1 = er1.C58739j4.f168176a
            java.lang.String r1 = r1.mo83718n()
            r15.f144904f = r1
            r7 = r4
            r8 = r18
            r10 = r20
            r12 = r22
            r13 = r23
            r14 = r24
            r16 = r29
            r7.<init>(r8, r10, r12, r13, r14, r15, r16)
            nr3.e r1 = r4.mo9225i()
            android.content.Context r2 = r17.mo75781q0()
            if (r2 == 0) goto L_0x011c
            android.content.Context r2 = r17.mo75781q0()
            boolean r2 = r2 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r2 == 0) goto L_0x011c
            android.content.Context r2 = r17.mo75781q0()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r2, r3)
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
            r1.mo11397F(r2)
        L_0x011c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54820t.mo75707K(long, long, java.lang.String, byte[], int, te3.hx0, java.lang.String, int, pe3.b, dj1.e$a):void");
    }

    /* renamed from: L */
    public void mo75708L(C45397x.C45398a aVar) {
        C49842ig0 a = C46523h2.f125330a.mo71859a(6845);
        String O5 = C66785b.f191882e.mo90662O5();
        C54991o oVar = (C54991o) mo75777m0(C54991o.class);
        new C45397x(a, O5, (byte[]) null, ((C55001u) mo75777m0(C55001u.class)).f154417n, aVar).mo9225i();
    }

    /* renamed from: M */
    public void mo75709M(byte[] bArr, long j, long j2, String str, String str2, int i, C47836x.C47837a aVar) {
        String str3 = str;
        String str4 = str2;
        C87412m.m108594g(str3, "objectNonceId");
        C87412m.m108594g(str4, "finderUserName");
        String str5 = this.f153694d;
        StringBuilder sb = new StringBuilder();
        sb.append("randomLinkMic: liveId:");
        sb.append(j);
        sb.append(", objectId:");
        long j3 = j2;
        sb.append(j3);
        sb.append(", objectNonceId:");
        sb.append(str3);
        sb.append(", finderUserName:");
        sb.append(str4);
        sb.append(", opCode:");
        int i2 = i;
        sb.append(i2);
        Log.m105924i(str5, sb.toString());
        C89059e i3 = new C47836x(bArr, j, j3, str3, str4, i2, aVar).mo9225i();
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i3.mo11397F((MMActivity) q0);
        }
    }

    /* renamed from: N */
    public void mo75710N(String str) {
        C7335d c = C86312j.m106911c(C60200t1.class);
        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
        C60200t1.C60201a.m70363a((C60200t1) c, str == null ? "" : str, 0, (C89349b) null, 0, (C49712hj1) null, 0, 0, true, (Integer) null, (Long) null, 872, (Object) null);
    }

    /* renamed from: O */
    public void mo75711O(String str, C89349b bVar, C7339i0.C7340a aVar) {
        String str2;
        int i;
        Class cls = C55001u.class;
        C87412m.m108594g(str, "lotteryId");
        if (C62042e.f176370a.mo87027N0()) {
            str2 = C66785b.f191882e.mo90662O5();
            i = 1;
        } else {
            str2 = "";
            i = 2;
        }
        C64273c21 c212 = ((C55001u) mo75777m0(cls)).f154420q;
        if (c212 != null) {
            C89059e i2 = new C7339i0(i, str2, c212.f182392d, ((C55001u) mo75777m0(cls)).f154416j, ((C55001u) mo75777m0(cls)).f154417n, ((C55001u) mo75777m0(cls)).f154423t, str, bVar, (C7339i0.C7340a) null).mo9225i();
            if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
                Context q0 = mo75781q0();
                C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                i2.mo11397F((MMActivity) q0);
            }
            i2.mo123420E(new C0616v(aVar, this));
        }
    }

    /* renamed from: P */
    public void mo75712P() {
        C61926c.m72668M(new C0605j0(this));
    }

    /* renamed from: Q */
    public void mo75713Q(Activity activity, boolean z) {
        Class cls = C54991o.class;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C13883o1 o1Var = (C13883o1) C86312j.m106911c(C13883o1.class);
        Intent intent = new Intent();
        LinkedList<C64373fs0> linkedList = ((C54991o) mo75777m0(cls)).f154339m2;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C64373fs0 byteArray : linkedList) {
            arrayList.add(byteArray.toByteArray());
        }
        intent.putExtra("KEY_VISITOR_ROLE_LIST", arrayList);
        intent.putExtra("KEY_VISITOR_ROLE", ((C54991o) mo75777m0(cls)).mo76014n3());
        intent.putExtra("KEY_MODIFY_TIME", ((C54991o) mo75777m0(cls)).f154343n2);
        intent.putExtra("KEY_SOURCE", 1);
        C13598b0 b0Var = C13598b0.f38549a;
        o1Var.mo13294xt(activity, intent, 1009, z);
    }

    /* renamed from: R */
    public void mo75714R(Context context, Intent intent, Integer num) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        ((C54991o) mo75777m0(C54991o.class)).f154350p0 = false;
        if (num != null) {
            C88144b.m109795m(context, "webview", ".ui.tools.WebViewUI", intent, num.intValue());
        } else {
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: S */
    public void mo75715S(Context context, C32226l<? super Boolean, C13598b0> lVar, C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        C87412m.m108594g(context, "context");
        Log.m105924i(this.f153694d, "[WeCoin] initEngine");
        ((C10756c) C86709a0.m107533q(C10756c.class)).mo10994Sk(context, new C0599c0(this, lVar, pVar));
    }

    /* renamed from: T */
    public void mo75716T(View view, int i) {
        C87412m.m108594g(view, "view");
        C61926c.m72668M(new C0600e(this, view, i));
    }

    /* renamed from: U */
    public void mo75717U(Activity activity) {
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        C87412m.m108594g(activity, "context");
        Intent intent = new Intent();
        String Ts0 = ((C59774i) C86312j.m106911c(C59774i.class)).Ts0();
        if (Ts0 == null) {
            Ts0 = "";
        }
        intent.putExtra("key_live_anchor_type", Util.isEqual(((C55001u) mo75777m0(cls)).f154419p.f182319n, ((C54991o) mo75777m0(cls2)).mo76015n4()) ? 1 : 2);
        intent.putExtra("key_live_id", C61926c.m72691p(((C55001u) mo75777m0(cls)).f154420q.f182392d));
        intent.putExtra("key_live_attach", ((C54991o) mo75777m0(cls2)).f154376v2.f514b);
        intent.putExtra("key_from", 3);
        intent.putExtra("key_session_id", Ts0);
        String str = (String) C110818d0.m150916N(((C54991o) mo75777m0(cls2)).f154376v2.f513a);
        if (str != null) {
            intent.putExtra("key_finder_live_username", str);
        }
        C88144b.m109791i(activity, "luckymoney", ".ui.LuckyMoneyPrepareUI", intent, (Bundle) null);
        String str2 = this.f153694d;
        Log.m105924i(str2, "goPrepareLuckyMoney liveId:" + ((C55001u) mo75777m0(cls)).f154420q.f182392d + ", luckyMoneyData:" + ((C54991o) mo75777m0(cls2)).f154376v2 + ", sessionId:" + Ts0);
    }

    /* renamed from: V */
    public long mo75718V() {
        C0080f fVar = ((C0657g1) mo75777m0(C0657g1.class)).f1557i;
        String str = this.f153694d;
        StringBuilder sb = new StringBuilder();
        sb.append("[WeCoin] getWeCoinBalanceFromCache, balance = ");
        sb.append(fVar != null ? Long.valueOf(fVar.f503a) : null);
        Log.m105924i(str, sb.toString());
        if (fVar != null) {
            return fVar.f503a;
        }
        return 0;
    }

    /* renamed from: W */
    public void mo75719W(Context context, long j, long j2, C51868wr1 wr12, C47826f.C47827a aVar) {
        Context context2 = context;
        C51868wr1 wr13 = wr12;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(wr13, "gameTeamSetting");
        String str = this.f153694d;
        Log.m105924i(str, "setGameTeamMode liveId:" + j + " objectId:" + j2 + " gameTeamMode:" + wr13);
        int o0 = mo75779o0(((C54991o) mo75777m0(C54991o.class)).f154354q);
        String O5 = C66785b.f191882e.mo90662O5();
        int i = C47826f.f128391x;
        C39965m0 m0Var = r2;
        C39965m0 m0Var2 = new C39965m0(aVar, context2);
        C47826f fVar = r2;
        C47826f fVar2 = new C47826f(j, j2, o0, O5, 0, (C51887ww2) null, wr12, (C49882ip2) null, 0, m0Var, (C50280ll1) null, 1200, (C8480h) null);
        fVar.mo85582k(context2, context.getResources().getString(C0966R.string.ett), 500);
        C89059e i2 = fVar.mo9225i();
        if (context2 instanceof MMActivity) {
            i2.mo11397F((C9487b) context2);
        }
    }

    /* renamed from: X */
    public void mo75720X(C32232u<? super Boolean, ? super Boolean, ? super String, ? super Integer, ? super Integer, ? super String, ? super C49291ej0, C13598b0> uVar) {
        b65 b65;
        Class cls = C0690t1.class;
        Class cls2 = C54991o.class;
        LinkedList linkedList = new LinkedList();
        if (C61926c.m72696u(((C0690t1) mo75777m0(cls)).f1629i, 1)) {
            linkedList.addAll(C62042e.f176370a.mo87059Z(((C0690t1) mo75777m0(cls)).f1628h));
        }
        LinkedList linkedList2 = new LinkedList();
        if (C61926c.m72696u(((C0690t1) mo75777m0(cls)).f1629i, 2)) {
            linkedList2.addAll(((C0690t1) mo75777m0(cls)).f1631n);
        }
        LinkedList linkedList3 = new LinkedList();
        if (C61926c.m72696u(((C0690t1) mo75777m0(cls)).f1629i, 4)) {
            linkedList3.addAll(((C0690t1) mo75777m0(cls)).f1632o);
        }
        String str = ((C54991o) mo75777m0(cls2)).f154301c3 ? ((C54991o) mo75777m0(cls2)).f154309e3 : "";
        int i = ((C54991o) mo75777m0(cls2)).f154277X0 ? 5 : ((C54991o) mo75777m0(cls2)).f154319g3;
        if (((C54991o) mo75777m0(cls2)).f154301c3) {
            b65 = new b65();
            b65.f182225d = ((C54991o) mo75777m0(cls2)).f154314f3;
            b65.f182226e = ((C54991o) mo75777m0(cls2)).f154323h3;
            b65.f182227f = ((C54991o) mo75777m0(cls2)).f154327i3;
        } else {
            b65 = null;
        }
        int i2 = (!((C54991o) this.f153692b.mo71262a(cls2)).f154305d3 || !((C0690t1) this.f153692b.mo71262a(cls)).mo653f3()) ? ((C0690t1) this.f153692b.mo71262a(cls)).f1629i : 0;
        C51020qw0 qw02 = (!((C54991o) this.f153692b.mo71262a(cls2)).f154305d3 || !((C0690t1) this.f153692b.mo71262a(cls)).mo653f3()) ? ((C0690t1) this.f153692b.mo71262a(cls)).f1634q : null;
        boolean z = ((C54991o) this.f153692b.mo71262a(cls2)).f154209H3;
        byte[] bArr = (byte[]) ((C13604l) ((C58052j1) ((C54991o) this.f153692b.mo71262a(cls2)).f154213I3).getValue()).f38556e;
        String str2 = ((C54991o) this.f153692b.mo71262a(cls2)).f154225L3;
        String str3 = this.f153694d;
        StringBuilder sb = new StringBuilder();
        sb.append("fromChatRoomId:");
        sb.append(str2);
        sb.append(", visibilityRoomList:");
        StringBuilder sb4 = sb;
        boolean z2 = z;
        int i3 = i2;
        sb4.append(C110818d0.m150921S(linkedList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        Log.m105924i(str3, sb4.toString());
        String str4 = str2;
        int i4 = ((str4 == null || str4.length() == 0) || !linkedList2.contains(str4)) ? 0 : 1;
        String str5 = this.f153694d;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("doCreateLive: luckyMoneyChatRoom:");
        sb5.append(((C54991o) mo75777m0(cls2)).f154376v2.f513a);
        sb5.append(", visibilityMode:");
        int i5 = i3;
        sb5.append(i5);
        sb5.append(", visibilityList:");
        sb5.append(linkedList);
        sb5.append(", visibilityRoomList:");
        sb5.append(linkedList2);
        sb5.append(", externalPost:");
        sb5.append(((C54991o) mo75777m0(cls2)).f154301c3);
        sb5.append(", appid:");
        sb5.append(str);
        sb5.append(", gameVersionType:");
        sb5.append(b65 != null ? Integer.valueOf(b65.f182225d) : null);
        sb5.append(", scene:");
        sb5.append(i);
        sb5.append(", acknowledgeSpamMsg:");
        boolean z3 = z2;
        sb5.append(z3);
        Log.m105924i(str5, sb5.toString());
        String O5 = C66785b.f191882e.mo90662O5();
        FinderObjectDesc finderObjectDesc = ((C55001u) mo75777m0(C55001u.class)).f154422s;
        C64848y91 y912 = ((C54991o) mo75777m0(cls2)).f154326i2;
        int i6 = ((C0690t1) mo75777m0(cls)).f1630j;
        LinkedList<String> linkedList4 = ((C54991o) mo75777m0(cls2)).f154376v2.f513a;
        C49098d51 d512 = ((C54991o) mo75777m0(cls2)).f154340m3;
        String str6 = d512 != null ? d512.f132122h : null;
        C49712hj1 hj12 = this.f153693c;
        C64756up2 N3 = ((C54991o) mo75777m0(cls2)).mo75973N3();
        C54827i iVar = r2;
        C54827i iVar2 = new C54827i(this, uVar);
        new C58280i(O5, finderObjectDesc, (C89349b) null, y912, i5, i6, linkedList, linkedList2, linkedList3, linkedList4, str6, str, i, b65, qw02, z3, bArr, i4, hj12, N3, iVar, 4, (C8480h) null).mo9225i();
    }

    /* renamed from: Y */
    public void mo75721Y(MMActivity mMActivity, C63965x xVar, C32227p<? super Boolean, ? super C51203s61, C13598b0> pVar) {
        String str;
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(xVar, "product");
        LinkedList linkedList = new LinkedList();
        LinkedList<C64617p00> linkedList2 = xVar.f181346s.f183195z;
        if (linkedList2 != null) {
            for (T t : C110818d0.m150912J(linkedList2)) {
                if (t.f184725f > 0 && (str = t.f184724e) != null) {
                    linkedList.add(str);
                }
            }
        }
        if (linkedList.isEmpty()) {
            Log.m105924i(this.f153694d, "empty stockIds");
            if (pVar != null) {
                pVar.invoke(Boolean.TRUE, null);
                return;
            }
            return;
        }
        mo75757y(mMActivity, linkedList, false, new C0601h0(this, pVar));
    }

    /* renamed from: Z */
    public Object mo75722Z(C64756up2 up22, C15601d<? super C51778w31> dVar) {
        Class cls = C55001u.class;
        String str = this.f153694d;
        Log.m105924i(str, "[setAudioBg] liveRoomImg = " + C61937h.m72709h(up22));
        long j = ((C55001u) mo75777m0(cls)).f154420q.f182392d;
        long j2 = ((C55001u) mo75777m0(cls)).f154416j;
        C45381p0.C45382a aVar = C45381p0.f122894u;
        C50401mh0 mh02 = new C50401mh0();
        mh02.f138028d = 7;
        mh02.f138029e = C89349b.m111674a(up22.toByteArray());
        return C89456b.m111831a(new C45381p0(j, j2, 1, mh02), 0, (C88819d) null, dVar, 3, (Object) null);
    }

    /* renamed from: a */
    public void mo75723a(long j, long j2, String str, byte[] bArr, int i, C49765hx0 hx02, String str2, int i2, String str3, C89349b bVar, C45343b.C45344a aVar) {
        String str4;
        FinderObject finderObject;
        FinderObjectDesc finderObjectDesc;
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        FinderObjectDesc finderObjectDesc2;
        C64640px0 px02;
        C49765hx0 hx03 = hx02;
        String str5 = str2;
        int i3 = i2;
        String str6 = str3;
        String str7 = this.f153694d;
        Log.m105924i(str7, "acceptLinkMicPk liveId:" + j + ", objectId:" + j2 + ", nonceId:" + str + ", scene:" + i + ", sdkUserId:" + str5 + ", sdkLiveId:" + i3 + ", sessionId:" + str6);
        Class cls = C54991o.class;
        C52013xs0 xs02 = new C52013xs0();
        xs02.f144902d = hx03;
        LinkedList<C49765hx0> linkedList2 = new LinkedList<>();
        linkedList2.add(hx03 == null ? new C49765hx0() : hx03);
        xs02.f144908j = linkedList2;
        xs02.f144909n = str6;
        C64243at0 at02 = new C64243at0();
        FinderObject finderObject2 = ((C54991o) mo75777m0(cls)).f154341n;
        C64756up2 up22 = null;
        String str8 = (finderObject2 == null || (finderObjectDesc2 = finderObject2.objectDesc) == null || (px02 = finderObjectDesc2.liveDesc) == null) ? null : px02.f184911d;
        if ((str8 == null || str8.length() == 0) && ((finderObject = ((C54991o) mo75777m0(cls)).f154341n) == null || (finderObjectDesc = finderObject.objectDesc) == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null || (str8 = finderMedia.url) == null)) {
            str8 = "";
        }
        at02.f182148g = str8;
        if (hx03 == null || (str4 = hx03.f134927o) == null) {
            str4 = "";
        }
        at02.f182147f = str4;
        at02.f182145d = str5;
        at02.f182146e = i3;
        at02.f182149h = bVar;
        at02.f182150i = hx03 != null ? hx03.f134935w : null;
        at02.f182151j = ((C54991o) mo75777m0(cls)).mo75973N3();
        if (hx03 != null) {
            up22 = hx03.f134935w;
        }
        at02.f182150i = up22;
        xs02.f144906h = C89349b.m111674a(at02.toByteArray());
        xs02.f144903e = 20016;
        xs02.f144904f = C58739j4.f168176a.mo83718n();
        C89059e i4 = new C45343b(j, j2, str, bArr, i, xs02, aVar).mo9225i();
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i4.mo11397F((MMActivity) q0);
        }
    }

    /* renamed from: a0 */
    public void mo75724a0(long j, long j2, int i, long j3, int i2, C47826f.C47827a aVar) {
        int i3 = i;
        Class cls = C54963d0.class;
        String str = this.f153694d;
        Log.m105924i(str, "setAnchorStatus opFlag:" + C61926c.m72691p(j3) + ", liveId:" + j + " objectId:" + j2 + " flag:" + i3 + " micSetting[" + ((C54963d0) mo75777m0(cls)).f154048B.f144323d + XVFSFile.PATH_SEPARATOR_CHAR + ((C54963d0) mo75777m0(cls)).f154048B.f144324e + ']');
        new C47826f(j, j2, mo75779o0(i3), C66785b.f191882e.mo90662O5(), i2, (C51887ww2) null, (C51868wr1) null, (C49882ip2) null, j3, aVar, (C50280ll1) null, 1248, (C8480h) null).mo9225i();
    }

    /* renamed from: b */
    public void mo75725b(String str, boolean z, int i, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar) {
        Class cls = C55001u.class;
        if (str != null) {
            C89059e i2 = new C47828h(((C55001u) mo75777m0(cls)).f154420q.f182392d, ((C55001u) mo75777m0(cls)).f154416j, str, i, z, new C0604j(this, str, i, pVar)).mo9225i();
            if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
                Context q0 = mo75781q0();
                C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                i2.mo11397F((MMActivity) q0);
            }
        }
    }

    /* renamed from: b0 */
    public void mo75726b0(MMActivity mMActivity, C32227p<? super Boolean, ? super C51316sz0, C13598b0> pVar) {
        Class cls = C55001u.class;
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        new C45352e0(((C55001u) mo75777m0(cls)).f154420q.f182392d, ((C55001u) mo75777m0(cls)).f154416j, ((C54991o) mo75777m0(C54991o.class)).f154345o, ((C54979h1) mo75777m0(C54979h1.class)).f154111C, new C54831u(this, pVar)).mo9225i().mo11397F(mMActivity);
    }

    /* renamed from: c */
    public void mo75727c(int i, int i2, C45389s0.C45390a aVar) {
        C58115i iVar;
        Class cls = C55001u.class;
        C89059e i3 = new C45389s0(((C55001u) mo75777m0(cls)).f154420q.f182392d, C66785b.f191882e.mo90662O5(), ((C55001u) mo75777m0(cls)).f154416j, 0, i, i2, aVar).mo9225i();
        boolean z = true;
        if (i2 != 1 && mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            FinderLiveService.f159376d.getClass();
            C60735a aVar2 = FinderLiveService.f159378f;
            if (aVar2 == null || (iVar = aVar2.f172989A) == null || iVar.mo82881c()) {
                z = false;
            }
            if (z) {
                Context q0 = mo75781q0();
                C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                i3.mo11397F((MMActivity) q0);
            }
        }
    }

    /* renamed from: c0 */
    public void mo75728c0(long j, long j2, long j3, String str, C47826f.C47827a aVar) {
        long j4 = j3;
        String str2 = str;
        Class cls = C54963d0.class;
        String str3 = this.f153694d;
        Log.m105924i(str3, "setMicSetting liveId:" + j + " focusMicUserId: " + str2 + " objectId:" + j2 + " micSettingFlag:" + j4 + " BUPROVIDER.get(LiveLinkMicSlice::class.java).micSetting[" + ((C54963d0) mo75777m0(cls)).f154048B.f144323d + XVFSFile.PATH_SEPARATOR_CHAR + ((C54963d0) mo75777m0(cls)).f154048B.f144324e + ']');
        C51887ww2 ww22 = new C51887ww2();
        ww22.f144323d = j4;
        ww22.f144325f = str2 == null ? "" : str2;
        int o0 = mo75779o0(((C54991o) mo75777m0(C54991o.class)).f154354q);
        String O5 = C66785b.f191882e.mo90662O5();
        int i = C47826f.f128391x;
        C89059e i2 = new C47826f(j, j2, o0, O5, 0, ww22, (C51868wr1) null, (C49882ip2) null, 0, aVar, (C50280ll1) null, 1232, (C8480h) null).mo9225i();
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i2.mo11397F((MMActivity) q0);
        }
    }

    /* renamed from: d */
    public void mo75729d(long j, C32227p<? super Long, ? super Long, C13598b0> pVar) {
        String str = this.f153694d;
        Log.m105924i(str, "[WeCoin] getWeCoinBalance: requestId:" + j);
        C89059e<C89132b.C89134c<C49919iz0>> i = new C49773hz0().mo73341b().mo9225i();
        i.mo123420E(new C0618z(this, pVar, j));
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i.mo11397F((MMActivity) q0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo75730d0(int r21, int r22, wx3.C15601d<? super te3.C50863pr0> r23) {
        /*
            r20 = this;
            r0 = r20
            r6 = r21
            r1 = r23
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            boolean r3 = r1 instanceof cj1.C54820t.C54829s
            if (r3 == 0) goto L_0x001b
            r3 = r1
            cj1.t$s r3 = (cj1.C54820t.C54829s) r3
            int r4 = r3.f153716i
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r4 & r5
            if (r7 == 0) goto L_0x001b
            int r4 = r4 - r5
            r3.f153716i = r4
            goto L_0x0020
        L_0x001b:
            cj1.t$s r3 = new cj1.t$s
            r3.<init>(r0, r1)
        L_0x0020:
            r14 = r3
            java.lang.Object r1 = r14.f153714g
            xx3.a r15 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r14.f153716i
            r13 = 3
            r12 = 2
            r11 = 1
            r10 = 0
            if (r3 == 0) goto L_0x006b
            if (r3 == r11) goto L_0x005b
            if (r3 == r12) goto L_0x0048
            if (r3 != r13) goto L_0x0040
            java.lang.Object r2 = r14.f153712e
            bi1.e r2 = (bi1.C0287e) r2
            java.lang.Object r2 = r14.f153711d
            gy3.f0 r2 = (gy3.C8479f0) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0158
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0048:
            java.lang.Object r2 = r14.f153713f
            bi1.e r2 = (bi1.C0287e) r2
            java.lang.Object r3 = r14.f153712e
            gy3.f0 r3 = (gy3.C8479f0) r3
            java.lang.Object r4 = r14.f153711d
            cj1.t r4 = (cj1.C54820t) r4
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r2
            r2 = r15
            goto L_0x0135
        L_0x005b:
            java.lang.Object r2 = r14.f153712e
            gy3.f0 r2 = (gy3.C8479f0) r2
            java.lang.Object r3 = r14.f153711d
            cj1.t r3 = (cj1.C54820t) r3
            kotlin.ResultKt.throwOnFailure(r1)
            r4 = r3
            r3 = r2
            r2 = r15
            goto L_0x0111
        L_0x006b:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.String r1 = r0.f153694d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[likeInfo] doLikeLive:"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            if (r6 > 0) goto L_0x0087
            return r10
        L_0x0087:
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r1)
            cl1.o r1 = (cl1.C54991o) r1
            long r3 = r1.f154276X
            long r7 = (long) r6
            long r3 = r3 + r7
            r1.f154276X = r3
            te3.hj1 r9 = r20.mo75780p0()
            gy3.f0 r7 = new gy3.f0
            r7.<init>()
            dj1.p r8 = new dj1.p
            je1.h2 r1 = je1.C46523h2.f125330a
            r3 = 564(0x234, float:7.9E-43)
            te3.ig0 r3 = r1.mo71860b(r3, r9)
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r2)
            cl1.u r1 = (cl1.C55001u) r1
            byte[] r4 = r1.f154417n
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r2)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            long r10 = r1.f182392d
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r2)
            cl1.u r1 = (cl1.C55001u) r1
            long r12 = r1.f154416j
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r2)
            cl1.u r1 = (cl1.C55001u) r1
            java.lang.String r5 = r1.f154423t
            zc1.b r1 = zc1.C66785b.f191882e
            java.lang.String r16 = r1.mo90662O5()
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r2)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            long r1 = r1.f182392d
            te3.h71 r17 = r0.mo75732e0(r1)
            r1 = r8
            r2 = r3
            r3 = r4
            r18 = r5
            r4 = r10
            r6 = r21
            r11 = r7
            r10 = r8
            r7 = r12
            r12 = r9
            r9 = r22
            r13 = r10
            r23 = r15
            r15 = 0
            r10 = r18
            r15 = r11
            r11 = r16
            r19 = r13
            r13 = r17
            r1.<init>(r2, r3, r4, r6, r7, r9, r10, r11, r12, r13)
            r14.f153711d = r0
            r14.f153712e = r15
            r1 = 1
            r14.f153716i = r1
            r2 = r19
            r3 = 0
            java.lang.Object r1 = bi1.C0283d.m245c(r2, r3, r14, r1, r3)
            r2 = r23
            if (r1 != r2) goto L_0x010f
            return r2
        L_0x010f:
            r4 = r0
            r3 = r15
        L_0x0111:
            bi1.e r1 = (bi1.C0287e) r1
            boolean r5 = r1 instanceof bi1.C0288f
            if (r5 == 0) goto L_0x0135
            wx3.f r5 = r1.f854a
            if (r5 != 0) goto L_0x011f
            wx3.f r5 = r14.getContext()
        L_0x011f:
            cj1.t$r r6 = new cj1.t$r
            r7 = 0
            r6.<init>(r1, r7, r4, r3)
            r14.f153711d = r4
            r14.f153712e = r3
            r14.f153713f = r1
            r7 = 2
            r14.f153716i = r7
            java.lang.Object r5 = a14.C53895h.m60469g(r5, r6, r14)
            if (r5 != r2) goto L_0x0135
            return r2
        L_0x0135:
            boolean r5 = r1 instanceof bi1.C0281b
            if (r5 == 0) goto L_0x0159
            wx3.f r5 = r1.f854a
            if (r5 != 0) goto L_0x0141
            wx3.f r5 = r14.getContext()
        L_0x0141:
            cj1.t$q r6 = new cj1.t$q
            r7 = 0
            r6.<init>(r1, r7, r4)
            r14.f153711d = r3
            r14.f153712e = r1
            r14.f153713f = r7
            r1 = 3
            r14.f153716i = r1
            java.lang.Object r1 = a14.C53895h.m60469g(r5, r6, r14)
            if (r1 != r2) goto L_0x0157
            return r2
        L_0x0157:
            r2 = r3
        L_0x0158:
            r3 = r2
        L_0x0159:
            T r1 = r3.f27484d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54820t.mo75730d0(int, int, wx3.d):java.lang.Object");
    }

    /* renamed from: e */
    public void mo75731e(long j, long j2, String str, byte[] bArr, int i, C49765hx0 hx02, int i2, int i3, C45346d.C45347a aVar) {
        C49765hx0 hx03 = hx02;
        int i4 = i2;
        String str2 = this.f153694d;
        Log.m105924i(str2, "applyLinkMic liveId:" + j + ", objectId:" + j2 + ", nonceId:" + str + ", scene:" + i + ", micType:" + i4);
        C52013xs0 xs02 = new C52013xs0();
        xs02.f144902d = hx03;
        LinkedList<C49765hx0> linkedList = new LinkedList<>();
        if (hx03 == null) {
            hx03 = new C49765hx0();
        }
        linkedList.add(hx03);
        xs02.f144908j = linkedList;
        C64375ft0 ft02 = new C64375ft0();
        ft02.f183223d = i4;
        ft02.f183224e = i3;
        xs02.f144906h = C89349b.m111674a(ft02.toByteArray());
        xs02.f144903e = 20003;
        xs02.f144904f = C58739j4.f168176a.mo83718n();
        C89059e i5 = new C45346d(j, j2, str, bArr, i, xs02, aVar).mo9225i();
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i5.mo11397F((MMActivity) q0);
        }
    }

    /* renamed from: e0 */
    public C64414h71 mo75732e0(long j) {
        return C62042e.f176370a.mo87008H(mo75781q0(), j, this.f153694d);
    }

    /* renamed from: f */
    public void mo75733f(String str, int i, C89349b bVar, C32227p<? super Boolean, ? super C49765hx0, C13598b0> pVar) {
        Class cls = C55001u.class;
        if (str != null) {
            C89059e i2 = new C47830m(((C55001u) mo75777m0(cls)).f154420q.f182392d, ((C55001u) mo75777m0(cls)).f154416j, str, i, bVar, (C47830m.C47831a) null).mo9225i();
            if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
                Context q0 = mo75781q0();
                C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                i2.mo11397F((MMActivity) q0);
            }
            i2.mo123420E(new C0607l(this, str, pVar));
        }
    }

    /* renamed from: f0 */
    public void mo75734f0(Context context, long j, int i, C32232u<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C58113g, ? super TRTCCloudDef.TRTCParams, ? super C52005xq0, C13598b0> uVar) {
        long c = C31543z5.m39453c();
        ((C54116w) C86312j.m106911c(C54116w.class)).f151952q.put(Long.valueOf(j), Long.valueOf(c));
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "LiveKeyReport1# putEnterSessionId liveId:" + C61926c.m72691p(j) + ", enterSessionId:" + c);
        C61926c.m72661F(this.f153694d, new C54828p(this, j, context, i, uVar));
    }

    /* renamed from: g */
    public void mo75735g(long j, byte[] bArr, String str, long j2, int i, LinkedList<Integer> linkedList, C45395w.C45396a aVar) {
        LinkedList<Integer> linkedList2 = linkedList;
        C87412m.m108594g(linkedList2, "songIdList");
        C45395w.C45396a aVar2 = aVar;
        C87412m.m108594g(aVar2, "callback");
        C89059e i2 = new C45395w(j, bArr, str, j2, i, linkedList2, aVar2).mo9225i();
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i2.mo11397F((MMActivity) q0);
        }
    }

    /* renamed from: g0 */
    public void mo75736g0(long j, long j2, String str, byte[] bArr, int i, C49765hx0 hx02, String str2, C45401y.C45402a aVar) {
        C49765hx0 hx03 = hx02;
        String str3 = str2;
        String str4 = this.f153694d;
        Log.m105924i(str4, "closeBattle liveId:" + j + " objectId:" + j2 + " objectNonceId:" + str + " micId:" + str3);
        C52013xs0 xs02 = new C52013xs0();
        xs02.f144909n = str3;
        xs02.f144902d = hx03;
        LinkedList<C49765hx0> linkedList = new LinkedList<>();
        if (hx03 == null) {
            hx03 = new C49765hx0();
        }
        linkedList.add(hx03);
        xs02.f144908j = linkedList;
        C50872pt0 pt02 = new C50872pt0();
        pt02.f139948d = pt02.f139948d;
        xs02.f144906h = C89349b.m111674a(pt02.toByteArray());
        xs02.f144903e = 20028;
        xs02.f144904f = C58739j4.f168176a.mo83718n();
        C89059e i2 = new C45401y(j, j2, str, bArr, i, xs02).mo9225i();
        i2.mo123420E(new C39961f(aVar));
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i2.mo11397F((MMActivity) q0);
        }
    }

    /* renamed from: h */
    public void mo75737h(MMActivity mMActivity, long j, long j2, String str, C50401mh0 mh02, C32228q<? super Boolean, ? super String, ? super C50912q41, C13598b0> qVar) {
        MMActivity mMActivity2 = mMActivity;
        C50401mh0 mh03 = mh02;
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        String str2 = str;
        C87412m.m108594g(str2, "audienceUsername");
        C87412m.m108594g(mh03, "finderCmdItem");
        new C45386r0(j, j2, str2, mh03, new C39959e0(qVar, mh03, this)).mo9225i().mo11397F(mMActivity);
    }

    /* renamed from: h0 */
    public void mo75738h0(Context context, int i) {
        C87412m.m108594g(context, "context");
        ((C7138g) C86312j.m106911c(C7138g.class)).mo8324nq(context instanceof Activity ? (Activity) context : null, i, 1, 30, 1, false, new Intent());
    }

    /* renamed from: i */
    public void mo75739i(MMActivity mMActivity, long j, C32227p<? super Boolean, ? super C52047y01, C13598b0> pVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C89059e i = new C45367i1(j).mo9225i();
        i.mo123420E(new C0617x(pVar));
        i.mo11397F(mMActivity);
    }

    /* renamed from: i0 */
    public void mo75740i0(int i, String str, String str2, int i2, C49765hx0 hx02, C45364h.C45365a aVar) {
        String str3 = str;
        String str4 = str2;
        int i3 = i2;
        C49765hx0 hx03 = hx02;
        Class cls = C55001u.class;
        String str5 = this.f153694d;
        Log.m105924i(str5, "closeLinkMicPk liveId:" + ((C55001u) mo75777m0(cls)).f154420q.f182392d + ", objectId:" + ((C55001u) mo75777m0(cls)).f154416j + ", nonceId:" + ((C55001u) mo75777m0(cls)).f154423t + ", scene:" + i + ", closeScene:" + i3 + ", sdkUserId:" + str3 + ", sessionId:" + str4);
        long j = ((C55001u) mo75777m0(cls)).f154420q.f182392d;
        long j2 = ((C55001u) mo75777m0(cls)).f154416j;
        String str6 = ((C55001u) mo75777m0(cls)).f154423t;
        byte[] bArr = ((C55001u) mo75777m0(cls)).f154417n;
        C52013xs0 xs02 = new C52013xs0();
        xs02.f144902d = hx03;
        LinkedList<C49765hx0> linkedList = new LinkedList<>();
        if (hx03 == null) {
            hx03 = new C49765hx0();
        }
        linkedList.add(hx03);
        xs02.f144908j = linkedList;
        xs02.f144909n = str4;
        C51295st0 st02 = new C51295st0();
        st02.f141736d = str3;
        st02.f141737e = i3;
        xs02.f144906h = C89349b.m111674a(st02.toByteArray());
        xs02.f144903e = 20017;
        xs02.f144904f = C58739j4.f168176a.mo83718n();
        C89059e i4 = new C45364h(j, j2, str6, bArr, i, xs02, aVar).mo9225i();
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i4.mo11397F((MMActivity) q0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r7 = r0.f134919d;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo75741j(long r19, long r21, java.lang.String r23, byte[] r24, int r25, te3.C49765hx0 r26, int r27, java.lang.String r28, java.lang.String r29, int r30, dj1.C45341a.C45342a r31) {
        /*
            r18 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r18
            java.lang.String r5 = r4.f153694d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "acceptAudienceLinkMic nickName: "
            r6.append(r7)
            if (r0 == 0) goto L_0x001f
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r0.f134919d
            if (r7 == 0) goto L_0x001f
            java.lang.String r7 = r7.nickname
            goto L_0x0020
        L_0x001f:
            r7 = 0
        L_0x0020:
            r6.append(r7)
            java.lang.String r7 = " liveId:"
            r6.append(r7)
            r9 = r19
            r6.append(r9)
            java.lang.String r7 = ", objectId:"
            r6.append(r7)
            r11 = r21
            r6.append(r11)
            java.lang.String r7 = ", nonceId:"
            r6.append(r7)
            r7 = r23
            r6.append(r7)
            java.lang.String r8 = ", scene:"
            r6.append(r8)
            r15 = r25
            r6.append(r15)
            java.lang.String r8 = ", micType:"
            r6.append(r8)
            r6.append(r1)
            java.lang.String r8 = ", userId:"
            r6.append(r8)
            r6.append(r2)
            java.lang.String r8 = ", sessionId:"
            r6.append(r8)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            dj1.a r5 = new dj1.a
            te3.xs0 r6 = new te3.xs0
            r6.<init>()
            r6.f144909n = r3
            r6.f144902d = r0
            te3.zs0 r0 = new te3.zs0
            r0.<init>()
            r0.f186852e = r1
            r0.f186851d = r2
            r1 = r30
            r0.f186853f = r1
            byte[] r0 = r0.toByteArray()
            pe3.b r0 = pe3.C89349b.m111674a(r0)
            r6.f144906h = r0
            r0 = 20004(0x4e24, float:2.8032E-41)
            r6.f144903e = r0
            er1.j4 r0 = er1.C58739j4.f168176a
            java.lang.String r0 = r0.mo83718n()
            r6.f144904f = r0
            r8 = r5
            r9 = r19
            r11 = r21
            r13 = r23
            r14 = r24
            r15 = r25
            r16 = r6
            r17 = r31
            r8.<init>(r9, r11, r13, r14, r15, r16, r17)
            nr3.e r0 = r5.mo9225i()
            android.content.Context r1 = r18.mo75781q0()
            if (r1 == 0) goto L_0x00ca
            android.content.Context r1 = r18.mo75781q0()
            boolean r1 = r1 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r1 == 0) goto L_0x00ca
            android.content.Context r1 = r18.mo75781q0()
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r1, r2)
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
            r0.mo11397F(r1)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54820t.mo75741j(long, long, java.lang.String, byte[], int, te3.hx0, int, java.lang.String, java.lang.String, int, dj1.a$a):void");
    }

    /* renamed from: j0 */
    public void mo75742j0(String str, C32227p<? super C64707sc1, ? super C50542nh0, C13598b0> pVar) {
        Class cls = C3603n1.class;
        Class cls2 = C54991o.class;
        String str2 = this.f153694d;
        Log.m105924i(str2, "putInBlackList username:" + str);
        if (str == null) {
            return;
        }
        if (((C54991o) mo75777m0(cls2)).f154190D) {
            ((C3603n1) C86312j.m106911c(cls)).mo3967BI(((C54991o) mo75777m0(cls2)).f154345o, str, true, new C54824f0(pVar));
        } else {
            ((C3603n1) C86312j.m106911c(cls)).mo3972yZ(str, true, new C54825g0(pVar));
        }
    }

    /* renamed from: k */
    public void mo75743k(long j, long j2, String str, byte[] bArr, int i, List<String> list, C45369j0.C45370a aVar) {
        C87412m.m108594g(str, "nonceId");
        List<String> list2 = list;
        C87412m.m108594g(list2, "sendIdList");
        C89059e i2 = new C45369j0(j, j2, str, bArr, i, list2).mo9225i();
        i2.mo123420E(new C39966w(aVar));
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i2.mo11397F((MMActivity) q0);
        }
    }

    /* renamed from: l */
    public void mo75744l(long j, long j2, String str, byte[] bArr, int i, C49765hx0 hx02, String str2, C45384r.C45385a aVar) {
        C49765hx0 hx03 = hx02;
        String str3 = str2;
        String str4 = this.f153694d;
        Log.m105924i(str4, "acceptBattle liveId:" + j + " objectId:" + j2 + " objectNonceId:" + str + " battleId:" + str3);
        C52013xs0 xs02 = new C52013xs0();
        xs02.f144909n = str3;
        xs02.f144902d = hx03;
        LinkedList<C49765hx0> linkedList = new LinkedList<>();
        if (hx03 == null) {
            hx03 = new C49765hx0();
        }
        linkedList.add(hx03);
        xs02.f144908j = linkedList;
        xs02.f144906h = C89349b.m111674a(new C52162ys0().toByteArray());
        xs02.f144903e = 20027;
        xs02.f144904f = C58739j4.f168176a.mo83718n();
        C89059e i2 = new C45384r(j, j2, str, bArr, i, xs02).mo9225i();
        i2.mo123420E(new C39957c(aVar));
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i2.mo11397F((MMActivity) q0);
        }
    }

    /* renamed from: m */
    public void mo75745m(C32229r<? super Integer, ? super Integer, ? super String, ? super C50131kh1, C13598b0> rVar) {
        WeakReference weakReference = rVar != null ? new WeakReference(rVar) : null;
        C49712hj1 p0 = mo75780p0();
        C47824c0.C47825a aVar = C47824c0.f128387v;
        C52013xs0 xs02 = new C52013xs0();
        xs02.f144903e = 20006;
        xs02.f144904f = C75592q0.m90789s() + System.currentTimeMillis();
        C89059e i = new C47824c0(xs02, this.f153692b, p0, new C0612o(weakReference)).mo9225i();
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i.mo11397F((MMActivity) q0);
        }
    }

    /* renamed from: m0 */
    public <T extends C39622i0> T mo75777m0(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        return this.f153692b.mo71262a(cls);
    }

    /* renamed from: n */
    public void mo75746n(MMActivity mMActivity, long j, long j2, String str, byte[] bArr, String str2, int i, String str3, C32226l<? super Boolean, C13598b0> lVar) {
        MMActivity mMActivity2 = mMActivity;
        C87412m.m108594g(mMActivity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, "anchorUsername");
        C89059e i2 = new C58283l0(j, j2, str, bArr, C62042e.f176370a.mo87027N0() ? !((C54979h1) mo75777m0(C54979h1.class)).f154135g ? 2 : 1 : 0, C66785b.f191882e.mo90662O5(), ((C54991o) mo75777m0(C54991o.class)).f154318g2, str2, (C89349b) null, i, ((C60172g4) C39818r.f106831a.mo62444c(mMActivity2).mo62447c(C60172g4.class)).mo12861q3(), str3, 256, (C8480h) null).mo9225i();
        i2.mo123420E(new C54833y(lVar, str2, this));
        i2.mo11397F(mMActivity2);
    }

    /* renamed from: n0 */
    public void mo75778n0() {
        String str;
        String str2;
        Class cls = C54116w.class;
        Class cls2 = C55001u.class;
        String str3 = this.f153694d;
        Log.m105924i(str3, "doCloseVisitorLive liveId:" + ((C55001u) mo75777m0(cls2)).f154420q.f182392d + " objectId:" + ((C55001u) mo75777m0(cls2)).f154416j + " nonceId:" + ((C55001u) mo75777m0(cls2)).f154423t);
        C49712hj1 p0 = mo75780p0();
        int i = ((C54116w) C86312j.m106911c(cls)).f151932a1.f151635d;
        if (i == 0) {
            i = 4;
            Log.m105924i(this.f153694d, "doCloseVisitorLive offlineType default slide");
        }
        String str4 = this.f153694d;
        Log.m105924i(str4, "doCloseVisitorLive offlineType " + i);
        C7335d c = C86312j.m106911c(C61398h.class);
        C87412m.m108593f(c, "getService(ILiveCgiFactoryService::class.java)");
        C61398h hVar = (C61398h) c;
        C49842ig0 b = C46523h2.f125330a.mo71860b(3976, p0);
        String O5 = C66785b.f191882e.mo90662O5();
        byte[] bArr = ((C55001u) mo75777m0(cls2)).f154417n;
        long j = ((C55001u) mo75777m0(cls2)).f154420q.f182392d;
        long j2 = ((C55001u) mo75777m0(cls2)).f154416j;
        String str5 = ((C55001u) mo75777m0(cls2)).f154423t;
        int i2 = ((C54991o) mo75777m0(C54991o.class)).mo75986U3().f183215f;
        String str6 = ((C55001u) mo75777m0(cls2)).f154426w;
        C54826h hVar2 = new C54826h();
        if (FinderLiveService.f159376d != null) {
            str = str6;
            C60735a aVar = FinderLiveService.f159378f;
            if (aVar != null) {
                str2 = aVar.f173005Q0;
                String str7 = str;
                int i3 = i;
                C61398h.C61399a.m72075a(hVar, b, O5, bArr, j, j2, str5, 0, true, i3, (C64840xw0) null, i2, p0, str7, hVar2, str2, ((C39975j) mo75777m0(C39975j.class)).f107170j.getValue(), mo75732e0(((C55001u) mo75777m0(cls2)).f154420q.f182392d), false, 131584, (Object) null).mo9225i();
                ((C54116w) C86312j.m106911c(cls)).Gy0(C54067f0.C54079q0.Unknown);
            }
        } else {
            str = str6;
        }
        str2 = null;
        String str72 = str;
        int i35 = i;
        C61398h.C61399a.m72075a(hVar, b, O5, bArr, j, j2, str5, 0, true, i35, (C64840xw0) null, i2, p0, str72, hVar2, str2, ((C39975j) mo75777m0(C39975j.class)).f107170j.getValue(), mo75732e0(((C55001u) mo75777m0(cls2)).f154420q.f182392d), false, 131584, (Object) null).mo9225i();
        ((C54116w) C86312j.m106911c(cls)).Gy0(C54067f0.C54079q0.Unknown);
    }

    /* renamed from: o */
    public void mo75747o(Context context, int i, int i2) {
        C87412m.m108594g(context, "context");
        boolean b = C45685m.f123489a.mo71187b(context, "com.tencent.qqmusic", "CBD27CD7C861227D013A25B2D10F0799");
        String str = this.f153694d;
        Log.m105924i(str, "goQQMusic isInstalled:" + b + " songId:" + i + " songmid:" + i2);
        if (b) {
            Context context2 = context;
            C76879j.m92707A(context2, context.getResources().getString(C0966R.string.enj, new Object[]{context.getResources().getString(C0966R.string.ele)}), "", context.getResources().getString(C0966R.string.a18), context.getResources().getString(C0966R.string.f7926wf), new C0597a0(i, i2, this, context), new C0598b0(this));
            return;
        }
        Log.m105924i(this.f153694d, "goQQMusic download");
        Intent intent = new Intent();
        intent.putExtra("rawUrl", "https://y.qq.com/m/download.html");
        intent.putExtra("showShare", false);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: o0 */
    public final int mo75779o0(int i) {
        C62042e eVar = C62042e.f176370a;
        int i2 = eVar.mo87073d1(this.f153692b) ? i & -65 : i;
        String str = this.f153694d;
        Log.m105924i(str, "filterAnchorStatusFlag ori:" + i + " result:" + i2 + ' ' + eVar.mo87073d1(this.f153692b));
        return i2;
    }

    /* renamed from: p */
    public void mo75748p(int i, C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C50262lh0, C13598b0> sVar) {
        Class cls = C55001u.class;
        long j = ((C55001u) mo75777m0(cls)).f154420q.f182392d;
        long j2 = ((C55001u) mo75777m0(cls)).f154416j;
        String str = this.f153694d;
        Log.m105924i(str, "doCloseLive liveId:" + j + " objectId:" + j2 + " nonceId:" + ((C55001u) mo75777m0(cls)).f154423t);
        if (j == 0 || j2 == 0) {
            Log.m105924i(this.f153694d, "doCloseLive return by invalid params");
            return;
        }
        new C45356f(j, C66785b.f191882e.mo90662O5(), j2, ((C55001u) mo75777m0(cls)).f154423t, i, new C39962g(this, sVar)).mo9225i();
        new FeedLiveLifeEvent().publish();
    }

    /* renamed from: p0 */
    public final C49712hj1 mo75780p0() {
        C49712hj1 hj12 = new C49712hj1();
        Context q0 = mo75781q0();
        return q0 != null ? ((C60172g4) C39818r.f106831a.mo62443b(q0).mo62447c(C60172g4.class)).mo12861q3() : hj12;
    }

    /* renamed from: q */
    public void mo75749q(String str, C32227p<? super Boolean, ? super String, C13598b0> pVar) {
        Class cls = C55001u.class;
        C87412m.m108594g(str, "topic");
        new C45381p0(((C55001u) mo75777m0(cls)).f154420q.f182392d, ((C55001u) mo75777m0(cls)).f154416j, 1, C45381p0.f122894u.mo70897c(str)).mo9225i().mo123420E(new C0611n0(this, pVar));
    }

    /* renamed from: q0 */
    public final Context mo75781q0() {
        WeakReference<Context> weakReference = this.f153691a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: r */
    public void mo75750r(Context context, long j, long j2, String str, int i, int i2, String str2, String str3, int i3, C89349b bVar, List<C12666si.C12667a> list, String str4, String str5, C12360e8.C12371d dVar) {
        Context context2 = context;
        Class cls = C55001u.class;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str3, "sendGiftTargetUserName");
        C87412m.m108594g(list, "randomGiftInfo");
        WeakReference weakReference = new WeakReference(context2);
        if (((C54991o) mo75777m0(C54991o.class)).mo75963I3() || i3 != 0) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(1581, 70);
            String O5 = C66785b.f191882e.mo90662O5();
            String n = C58739j4.f168176a.mo83718n();
            nVar.mo160131h(22129, 1, n, "", 1, 1, 0, "");
            C49712hj1 q3 = ((C60172g4) C39818r.f106831a.mo62443b(context2).mo62447c(C60172g4.class)).mo12861q3();
            C58291w0 w0Var = new C58291w0(((C55001u) mo75777m0(cls)).f154420q.f182392d, ((C55001u) mo75777m0(cls)).f154416j, str, i, O5, i2, n, str2, str3, q3, ((C55001u) mo75777m0(cls)).f154424u, i3, bVar, ((C55001u) mo75777m0(cls)).f154417n, list, str4, str5, (C58291w0.C58292a) null);
            C89059e i4 = w0Var.mo9225i();
            if (context2 instanceof MMActivity) {
                i4.mo11397F((C9487b) context2);
            }
            i4.mo123420E(new C54830t(this, i2, dVar, w0Var, n, weakReference, str, i, str2));
        }
    }

    /* renamed from: r0 */
    public final void mo75782r0(int i) {
        Class cls = C54991o.class;
        C45684k.f123488a.mo71185f("joinlive", i, this.f153692b);
        ((C54991o) this.f153692b.mo71262a(cls)).mo76005i3("joinlive", i);
        ((C54991o) this.f153692b.mo71262a(cls)).mo76000f3("joinlive", i);
        ((C54991o) this.f153692b.mo71262a(cls)).mo76002g3("joinlive", i);
        ((C54991o) mo75777m0(cls)).f154388y0 = i;
        ((C13022d0) mo75777m0(C13022d0.class)).mo12536K3();
    }

    /* renamed from: s */
    public void mo75751s(C0000n0 n0Var, boolean z, C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C0079b, C13598b0> sVar) {
        C87412m.m108594g(n0Var, "scope");
        String str = this.f153694d;
        Log.m105924i(str, "doFinishLive manualFinish:" + z);
        ((C119157j) C119157j.f356862d).mo183876g(new C39963k(n0Var, z, this, sVar), "doFinishLive");
    }

    /* renamed from: s0 */
    public void mo75783s0(long j, long j2, C49882ip2 ip22, C47826f.C47827a aVar) {
        C49882ip2 ip23 = ip22;
        C87412m.m108594g(ip23, "lotterySetting");
        String str = this.f153694d;
        Log.m105924i(str, "setMicSetting liveId:" + j + " objectId:" + j2 + " lotterySetting:" + ip23.f135571d + ", " + ip23.f135572e);
        int o0 = mo75779o0(((C54991o) mo75777m0(C54991o.class)).f154354q);
        String O5 = C66785b.f191882e.mo90662O5();
        int i = C47826f.f128391x;
        C89059e i2 = new C47826f(j, j2, o0, O5, 0, (C51887ww2) null, (C51868wr1) null, ip22, 0, aVar, (C50280ll1) null, 1136, (C8480h) null).mo9225i();
        Context q0 = mo75781q0();
        if (q0 != null && (q0 instanceof MMActivity)) {
            i2.mo11397F((C9487b) q0);
        }
    }

    /* renamed from: t */
    public void mo75752t(Context context, int i) {
        C87412m.m108594g(context, "context");
        Intent intent = new Intent();
        intent.putExtra("key_media_type", 2);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
        C88144b.m109802t(context, "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", intent, i);
    }

    /* renamed from: u */
    public void mo75753u(MMActivity mMActivity, String str, int i, C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C49366f21, C13598b0> sVar) {
        Class cls = C55001u.class;
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, "stockId");
        new C45375m0(((C55001u) mo75777m0(cls)).f154420q.f182392d, ((C55001u) mo75777m0(cls)).f154416j, ((C54991o) mo75777m0(C54991o.class)).f154345o, str, i, new C54822d0(sVar)).mo9225i().mo11397F(mMActivity);
    }

    /* renamed from: v */
    public void mo75754v(long j, long j2, String str, byte[] bArr, int i, C49765hx0 hx02, String str2, C45391t.C45392a aVar) {
        C49765hx0 hx03 = hx02;
        String str3 = str2;
        String str4 = this.f153694d;
        Log.m105924i(str4, "applyBattle liveId:" + j + " objectId:" + j2 + " objectNonceId:" + str + " micId:" + str3);
        C52013xs0 xs02 = new C52013xs0();
        xs02.f144902d = hx03;
        LinkedList<C49765hx0> linkedList = new LinkedList<>();
        if (hx03 == null) {
            hx03 = new C49765hx0();
        }
        linkedList.add(hx03);
        xs02.f144908j = linkedList;
        C49329et0 et02 = new C49329et0();
        et02.f133109d = str3;
        xs02.f144906h = C89349b.m111674a(et02.toByteArray());
        xs02.f144903e = 20026;
        xs02.f144904f = C58739j4.f168176a.mo83718n();
        C89059e i2 = new C45391t(j, j2, str, bArr, i, xs02).mo9225i();
        i2.mo123420E(new C39958d(aVar));
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i2.mo11397F((MMActivity) q0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if ((r5 != null && r5.f137707e) != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r4.mo87067b1(r0.f153692b) != false) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e5  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo75755w(long r20, long r22, java.lang.String r24, int r25, fy3.C32227p<? super java.lang.Boolean, ? super java.lang.Integer, rx3.C13598b0> r26) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            java.lang.Class<cl1.x> r2 = cl1.C0696x.class
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r4 = r0.mo75777m0(r1)
            cl1.o r4 = (cl1.C54991o) r4
            boolean r4 = r4.f154243Q1
            if (r4 != 0) goto L_0x0022
            ok1.e r4 = ok1.C62042e.f176370a
            boolean r5 = r4.mo87027N0()
            if (r5 == 0) goto L_0x00b8
            fj1.b r5 = r0.f153692b
            boolean r4 = r4.mo87067b1(r5)
            if (r4 == 0) goto L_0x00b8
        L_0x0022:
            ok1.e r4 = ok1.C62042e.f176370a
            boolean r5 = r4.mo87027N0()
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L_0x0055
            androidx.lifecycle.i0 r5 = r0.mo75777m0(r2)
            cl1.x r5 = (cl1.C0696x) r5
            te3.ly0 r5 = r5.f1644g
            if (r5 == 0) goto L_0x003c
            boolean r5 = r5.f137710h
            if (r5 != r7) goto L_0x003c
            r5 = 1
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            if (r5 == 0) goto L_0x0053
            androidx.lifecycle.i0 r5 = r0.mo75777m0(r2)
            cl1.x r5 = (cl1.C0696x) r5
            te3.ly0 r5 = r5.f1644g
            if (r5 == 0) goto L_0x004f
            boolean r5 = r5.f137707e
            if (r5 != r7) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            if (r5 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r15 = 0
            goto L_0x0056
        L_0x0055:
            r15 = 1
        L_0x0056:
            dj1.l r5 = new dj1.l
            androidx.lifecycle.i0 r6 = r0.mo75777m0(r3)
            cl1.u r6 = (cl1.C55001u) r6
            te3.c21 r6 = r6.f154420q
            long r9 = r6.f182392d
            androidx.lifecycle.i0 r6 = r0.mo75777m0(r3)
            cl1.u r6 = (cl1.C55001u) r6
            long r11 = r6.f154416j
            androidx.lifecycle.i0 r6 = r0.mo75777m0(r3)
            cl1.u r6 = (cl1.C55001u) r6
            java.lang.String r13 = r6.f154423t
            zc1.b r6 = zc1.C66785b.f191882e
            java.lang.String r14 = r6.mo90662O5()
            androidx.lifecycle.i0 r3 = r0.mo75777m0(r3)
            cl1.u r3 = (cl1.C55001u) r3
            byte[] r3 = r3.f154417n
            fj1.b r6 = r0.f153692b
            int r17 = r4.mo87031P(r6)
            r8 = r5
            r16 = r3
            r18 = r25
            r8.<init>(r9, r11, r13, r14, r15, r16, r17, r18)
            nr3.e r3 = r5.mo9225i()
            cj1.t$m r4 = new cj1.t$m
            r5 = r26
            r4.<init>(r0, r5)
            r3.mo123420E(r4)
            android.content.Context r4 = r19.mo75781q0()
            if (r4 == 0) goto L_0x00b8
            android.content.Context r4 = r19.mo75781q0()
            boolean r4 = r4 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r4 == 0) goto L_0x00b8
            android.content.Context r4 = r19.mo75781q0()
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r4, r5)
            com.tencent.mm.ui.MMActivity r4 = (com.tencent.p014mm.p136ui.MMActivity) r4
            r3.mo11397F(r4)
        L_0x00b8:
            java.lang.String r3 = r0.f153694d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "doGetGiftList liveData.business(LiveCommonSlice::class.java).enableGiftSwitch:"
            r4.append(r5)
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r1)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.f154243Q1
            r4.append(r1)
            java.lang.String r1 = ",haveFansClub:"
            r4.append(r1)
            androidx.lifecycle.i0 r1 = r0.mo75777m0(r2)
            cl1.x r1 = (cl1.C0696x) r1
            te3.ly0 r1 = r1.f1644g
            if (r1 == 0) goto L_0x00e5
            boolean r1 = r1.f137707e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x00e6
        L_0x00e5:
            r1 = 0
        L_0x00e6:
            r4.append(r1)
            java.lang.String r1 = ",FinderUtil.isTest():"
            r4.append(r1)
            er1.j4 r1 = er1.C58739j4.f168176a
            boolean r1 = r1.mo83692U()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54820t.mo75755w(long, long, java.lang.String, int, fy3.p):void");
    }

    /* renamed from: x */
    public void mo75756x(int i, C32229r<? super Integer, ? super Integer, ? super String, ? super C49585go0, C13598b0> rVar) {
        Class cls = C55001u.class;
        C89059e i2 = new C45358f1(C46523h2.f125330a.mo71859a(3603), ((C55001u) mo75777m0(cls)).f154420q.f182392d, C66785b.f191882e.mo90662O5(), ((C55001u) mo75777m0(cls)).f154416j, 2, (C45358f1.C45359a) null).mo9225i();
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i2.mo11397F((MMActivity) q0);
        }
        i2.mo123420E(new C0610n(rVar, this));
    }

    /* renamed from: y */
    public void mo75757y(MMActivity mMActivity, LinkedList<String> linkedList, boolean z, C32227p<? super Boolean, ? super C51203s61, C13598b0> pVar) {
        MMActivity mMActivity2 = mMActivity;
        Class cls = C55001u.class;
        C87412m.m108594g(mMActivity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(linkedList, "stockIds");
        C66785b bVar = C66785b.f191882e;
        boolean z2 = bVar.mo90673n0().f131584h == 3;
        C62042e.f176370a.mo87047U1(mMActivity2, true);
        new C46505a1(((C55001u) mo75777m0(cls)).f154420q.f182392d, ((C55001u) mo75777m0(cls)).f154416j, ((C54991o) mo75777m0(C54991o.class)).f154345o, z2 ? bVar.mo90662O5() : null, C89349b.m111674a(((C55001u) mo75777m0(cls)).f154417n), linkedList, new C0602i0(mMActivity2, pVar, z), "").mo9225i().mo11397F(mMActivity2);
    }

    /* renamed from: z */
    public void mo75758z(long j, long j2, String str, byte[] bArr, String str2) {
        C89059e i = new C45349d1(j, j2, str, bArr, str2).mo9225i();
        if (mo75781q0() != null && (mo75781q0() instanceof MMActivity)) {
            Context q0 = mo75781q0();
            C87412m.m108592e(q0, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i.mo11397F((MMActivity) q0);
        }
    }
}
