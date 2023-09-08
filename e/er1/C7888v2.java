package er1;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import ad0.C54012a;
import ad0.C54015d;
import ad0.C54016e;
import ad0.C54019i;
import ad0.C54020j;
import ad0.C54022l;
import ad0.C54023m;
import ak1.C0073g0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C57600p4;
import com.tencent.p014mm.storage.C57601q4;
import com.tencent.xweb.WCWebUpdater;
import d62.C7250m;
import d62.C97425j;
import df1.C7322a;
import di3.C7335d;
import di3.C86312j;
import dp1.C58380k1;
import dp1.C58417y0;
import dp1.C7433e1;
import dp1.C7450q;
import eb0.C31543z5;
import f14.C58901s;
import f40.C86709a0;
import fe1.C58960c;
import fe1.C58969q;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import hp1.C8703w0;
import ht1.C60151b;
import ht1.C60158d;
import ht1.C60166f;
import ht1.C60172g4;
import ht1.C60174h;
import ht1.C60175i;
import ht1.C8777j5;
import it1.C9247b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C46525m1;
import ke3.C88144b;
import kj2.C117407d;
import ls3.C61397g;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76879j;
import nj3.C76912y0;
import o40.C61926c;
import od3.C62001a;
import org.json.JSONObject;
import ot1.C11767a;
import p1081gi.C98121d;
import p166hy.C60228r0;
import p565ir.C60606n;
import p640ox.C77049b;
import p749xh.C66261f3;
import p773yy.C66708h;
import pe3.C89349b;
import qo3.C77407n;
import qy2.C63347a;
import qy2.C77459z;
import rs1.C13442s8;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64197v;
import te3.C48681a90;
import te3.C49712hj1;
import te3.C49720hl0;
import te3.C50124kf1;
import te3.C50297lq1;
import te3.C52192z0;
import te3.C64258bf0;
import te3.C64273c21;
import te3.C64284cg;
import te3.C64287ci1;
import te3.C64291co3;
import te3.C64311db1;
import te3.C64441i93;
import te3.C64450iq0;
import te3.C64581nk1;
import te3.C64609ok1;
import te3.C64623p81;
import te3.C64628pk1;
import te3.C64629pl1;
import te3.C64682rk1;
import te3.C64689rq2;
import te3.C64709se;
import te3.C64711sk1;
import te3.C64730tk1;
import te3.db4;
import te3.m74;
import up1.C37521f;
import uz2.C52686h1;
import uz2.C65488a0;
import wc3.C15133e0;
import wc3.C78536j0;
import wx3.C15601d;
import wx3.C66212f;
import yh3.C66649b;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;
import z04.C119027c;

/* renamed from: er1.v2 */
public interface C7888v2 {

    /* renamed from: a */
    public static final C7889a f26513a = C7889a.f26514a;

    /* renamed from: er1.v2$a */
    public static final class C7889a {

        /* renamed from: a */
        public static final /* synthetic */ C7889a f26514a = new C7889a();

        /* renamed from: b */
        public static final String f26515b = "Finder.FinderShareUtil";

        /* renamed from: c */
        public static int f26516c;

        /* renamed from: er1.v2$a$a */
        public static final class C7890a extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ boolean f26517d;

            /* renamed from: e */
            public final /* synthetic */ Context f26518e;

            /* renamed from: f */
            public final /* synthetic */ C77407n f26519f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7890a(boolean z, Context context, C77407n nVar) {
                super(1);
                this.f26517d = z;
                this.f26518e = context;
                this.f26519f = nVar;
            }

            public Object invoke(Object obj) {
                if (!((Boolean) obj).booleanValue() && this.f26517d) {
                    this.f26519f.mo107569n(C85868k2.m106137b(this.f26518e).inflate(C0966R.C0971layout.cvj, (ViewGroup) null), true);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: er1.v2$a$f */
        public static final class C7891f implements MMFragmentActivity$$f {

            /* renamed from: a */
            public final /* synthetic */ FinderItem f26520a;

            /* renamed from: b */
            public final /* synthetic */ C32226l<List<String>, C13598b0> f26521b;

            public C7891f(FinderItem finderItem, C32226l<? super List<String>, C13598b0> lVar) {
                this.f26520a = finderItem;
                this.f26521b = lVar;
            }

            public final void mmOnActivityResult(int i, int i2, Intent intent) {
                C0073g0 g0Var = C0073g0.LIVE_ANCHOR_ACTION_SHARE;
                Class cls = C8777j5.class;
                ArrayList<String> arrayList = new ArrayList<>();
                if (i2 == -1) {
                    ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
                    if (stringArrayListExtra == null) {
                        stringArrayListExtra = new ArrayList<>(0);
                    }
                    arrayList = stringArrayListExtra;
                    C7889a aVar = C7889a.f26514a;
                    aVar.getClass();
                    Log.m105924i(C7889a.f26515b, "share finderObject " + this.f26520a.getId() + " to " + arrayList);
                    aVar.mo9003E(arrayList);
                    if (!arrayList.isEmpty()) {
                        JSONObject jSONObject = new JSONObject();
                        Iterator<String> it = arrayList.iterator();
                        String str = "";
                        while (it.hasNext()) {
                            str = str + it.next() + ';';
                        }
                        if (C112551y.m153808h(str, ";", false, 2, (Object) null)) {
                            str = str.substring(0, str.length() - 1);
                            C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        jSONObject.put("type", "1");
                        jSONObject.put("username", str);
                        C7335d c = C86312j.m106911c(cls);
                        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
                        C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
                        C7889a.f26514a.mo9021u(this.f26520a);
                    }
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", "3");
                    C7335d c2 = C86312j.m106911c(cls);
                    C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
                    C8777j5.C8778a.m8605f((C8777j5) c2, g0Var, jSONObject2.toString(), (String) null, 4, (Object) null);
                }
                C32226l<List<String>, C13598b0> lVar = this.f26521b;
                if (lVar != null) {
                    lVar.invoke(arrayList);
                }
            }
        }

        /* renamed from: er1.v2$a$i */
        public static final class C7892i implements MMActivity.C6739d {

            /* renamed from: d */
            public final /* synthetic */ MMActivity f26522d;

            public C7892i(MMActivity mMActivity) {
                this.f26522d = mMActivity;
            }

            public void mmOnActivityResult(int i, int i2, Intent intent) {
                if (i2 == -1) {
                    MMActivity mMActivity = this.f26522d;
                    C76879j.m92726T(mMActivity, mMActivity.getString(C0966R.string.f360099a34));
                }
            }
        }

        /* renamed from: er1.v2$a$j */
        public static final class C7893j implements C76912y0.C61776j {

            /* renamed from: a */
            public static final C7893j f26523a = new C7893j();

            /* renamed from: a */
            public final void mo596a(View view) {
                TextView textView;
                if (view != null && (textView = (TextView) view.findViewById(C0966R.C0970id.kpy)) != null) {
                    textView.setTextSize(1, 14.0f);
                }
            }
        }

        /* renamed from: er1.v2$a$l */
        public static final class C7894l implements MMActivity.C6739d {

            /* renamed from: d */
            public final /* synthetic */ String f26524d;

            /* renamed from: e */
            public final /* synthetic */ int f26525e;

            /* renamed from: f */
            public final /* synthetic */ long f26526f;

            /* renamed from: g */
            public final /* synthetic */ C64258bf0 f26527g;

            /* renamed from: h */
            public final /* synthetic */ MMActivity f26528h;

            /* renamed from: i */
            public final /* synthetic */ int f26529i;

            public C7894l(String str, int i, long j, C64258bf0 bf02, MMActivity mMActivity, int i2) {
                this.f26524d = str;
                this.f26525e = i;
                this.f26526f = j;
                this.f26527g = bf02;
                this.f26528h = mMActivity;
                this.f26529i = i2;
            }

            public final void mmOnActivityResult(int i, int i2, Intent intent) {
                int i3 = i2;
                Intent intent2 = intent;
                Class cls = C58417y0.class;
                ArrayList<String> arrayList = new ArrayList<>();
                String str = null;
                if (i3 == -1) {
                    ArrayList<String> stringArrayListExtra = intent2 != null ? intent2.getStringArrayListExtra("SendMsgUsernames") : null;
                    if (stringArrayListExtra == null) {
                        stringArrayListExtra = new ArrayList<>(0);
                    }
                    arrayList = stringArrayListExtra;
                    C7889a aVar = C7889a.f26514a;
                    aVar.getClass();
                    String str2 = C7889a.f26515b;
                    Log.m105924i(str2, "share topic " + this.f26524d + " to " + arrayList);
                    aVar.mo9003E(arrayList);
                }
                if (this.f26525e == 7) {
                    C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                    boolean z = i3 == -1;
                    String listToString = Util.listToString(arrayList, ",");
                    C87412m.m108593f(listToString, "listToString(toUsers, \",\")");
                    long j = this.f26526f;
                    C64258bf0 bf02 = this.f26527g;
                    if (bf02 != null) {
                        str = bf02.f182280d;
                    }
                    y0Var.gy0(1, z, listToString, j, str, ((C13442s8) C39818r.f106831a.mo62444c(this.f26528h).mo75002a(C13442s8.class)).mo12861q3());
                    return;
                }
                C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
                boolean z2 = i3 == -1;
                String nullAsNil = Util.nullAsNil(this.f26524d);
                C87412m.m108593f(nullAsNil, "nullAsNil(topic)");
                int i4 = this.f26525e;
                long j2 = this.f26526f;
                String listToString2 = Util.listToString(arrayList, ",");
                C87412m.m108593f(listToString2, "listToString(toUsers, \",\")");
                y0Var2.my0(1, z2, nullAsNil, i4, j2, listToString2, this.f26529i);
            }
        }

        /* renamed from: er1.v2$a$m */
        public static final class C7895m implements MMActivity.C6739d {

            /* renamed from: d */
            public final /* synthetic */ MMActivity f26530d;

            /* renamed from: e */
            public final /* synthetic */ int f26531e;

            /* renamed from: f */
            public final /* synthetic */ long f26532f;

            /* renamed from: g */
            public final /* synthetic */ C64258bf0 f26533g;

            /* renamed from: h */
            public final /* synthetic */ String f26534h;

            /* renamed from: i */
            public final /* synthetic */ int f26535i;

            public C7895m(MMActivity mMActivity, int i, long j, C64258bf0 bf02, String str, int i2) {
                this.f26530d = mMActivity;
                this.f26531e = i;
                this.f26532f = j;
                this.f26533g = bf02;
                this.f26534h = str;
                this.f26535i = i2;
            }

            public void mmOnActivityResult(int i, int i2, Intent intent) {
                int i3 = i2;
                Class cls = C58417y0.class;
                if (i3 == -1) {
                    MMActivity mMActivity = this.f26530d;
                    C76879j.m92726T(mMActivity, mMActivity.getString(C0966R.string.f360099a34));
                }
                if (this.f26531e == 7) {
                    C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                    boolean z = i3 == -1;
                    long j = this.f26532f;
                    C64258bf0 bf02 = this.f26533g;
                    y0Var.gy0(2, z, "", j, bf02 != null ? bf02.f182280d : null, ((C13442s8) C39818r.f106831a.mo62444c(this.f26530d).mo75002a(C13442s8.class)).mo12861q3());
                    return;
                }
                C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
                boolean z2 = i3 == -1;
                String nullAsNil = Util.nullAsNil(this.f26534h);
                C87412m.m108593f(nullAsNil, "nullAsNil(topic)");
                y0Var2.my0(2, z2, nullAsNil, this.f26531e, this.f26532f, "", this.f26535i);
            }
        }

        /* renamed from: er1.v2$a$b */
        public static final class C7896b implements MMActivity.C6739d {

            /* renamed from: d */
            public final /* synthetic */ C60158d f26536d;

            /* renamed from: e */
            public final /* synthetic */ C49712hj1 f26537e;

            public C7896b(C60158d dVar, C49712hj1 hj12) {
                this.f26536d = dVar;
                this.f26537e = hj12;
            }

            public final void mmOnActivityResult(int i, int i2, Intent intent) {
                Class cls = C58417y0.class;
                if (i2 == -1) {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
                    if (stringArrayListExtra == null) {
                        stringArrayListExtra = new ArrayList<>(0);
                    }
                    String listToString = Util.listToString(stringArrayListExtra, ";");
                    long P = C61926c.m72671P(this.f26536d.f171700b.f184475d);
                    C87412m.m108593f(listToString, "users");
                    ((C58417y0) C86312j.m106911c(cls)).hy0(P, 3, 1, listToString, (long) stringArrayListExtra.size(), this.f26537e);
                    C7889a aVar = C7889a.f26514a;
                    aVar.getClass();
                    String str = C7889a.f26515b;
                    Log.m105924i(str, "[shareAlbumToChat] " + this.f26536d.f171700b.f184476e + " to " + stringArrayListExtra);
                    aVar.mo9003E(stringArrayListExtra);
                    return;
                }
                ((C58417y0) C86312j.m106911c(cls)).hy0(C61926c.m72671P(this.f26536d.f171700b.f184475d), 3, 2, "", 0, this.f26537e);
            }
        }

        /* renamed from: er1.v2$a$c */
        public static final class C7897c implements MMActivity.C6739d {

            /* renamed from: d */
            public final /* synthetic */ MMActivity f26538d;

            /* renamed from: e */
            public final /* synthetic */ C54012a f26539e;

            /* renamed from: f */
            public final /* synthetic */ C49712hj1 f26540f;

            public C7897c(MMActivity mMActivity, C54012a aVar, C49712hj1 hj12) {
                this.f26538d = mMActivity;
                this.f26539e = aVar;
                this.f26540f = hj12;
            }

            public final void mmOnActivityResult(int i, int i2, Intent intent) {
                Class cls = C58417y0.class;
                if (i2 == -1) {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
                    if (stringArrayListExtra == null) {
                        stringArrayListExtra = new ArrayList<>(0);
                    }
                    String listToString = Util.listToString(stringArrayListExtra, ";");
                    MMActivity mMActivity = this.f26538d;
                    C76879j.m92726T(mMActivity, mMActivity.getString(C0966R.string.f360099a34));
                    long P = C61926c.m72671P(((C54019i) this.f26539e).f151288a.f184475d);
                    C87412m.m108593f(listToString, "users");
                    ((C58417y0) C86312j.m106911c(cls)).hy0(P, 2, 1, listToString, (long) stringArrayListExtra.size(), this.f26540f);
                    C7889a.f26514a.getClass();
                    String str = C7889a.f26515b;
                    Log.m105924i(str, "[shareAlbumToSnsTimeLine] " + ((C54019i) this.f26539e).f151288a.f184476e + " to " + stringArrayListExtra);
                    return;
                }
                ((C58417y0) C86312j.m106911c(cls)).hy0(C61926c.m72671P(((C54019i) this.f26539e).f151288a.f184475d), 2, 2, "", 0, this.f26540f);
            }
        }

        /* renamed from: er1.v2$a$d */
        public static final class C7898d implements C76912y0.C61776j {

            /* renamed from: a */
            public static final C7898d f26541a = new C7898d();

            /* renamed from: a */
            public final void mo596a(View view) {
                TextView textView;
                if (view != null && (textView = (TextView) view.findViewById(C0966R.C0970id.kpy)) != null) {
                    textView.setTextSize(1, 14.0f);
                }
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.utils.FinderShareUtil$Companion$shareFeedToConversation$2", mo125469f = "FinderShareUtil.kt", mo125470l = {486}, mo125471m = "invokeSuspend")
        /* renamed from: er1.v2$a$e */
        public static final class C7899e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f26542d;

            /* renamed from: e */
            public final /* synthetic */ FinderItem f26543e;

            /* renamed from: f */
            public final /* synthetic */ C64682rk1 f26544f;

            /* renamed from: g */
            public final /* synthetic */ boolean f26545g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<C60166f, C13598b0> f26546h;

            /* renamed from: i */
            public final /* synthetic */ int f26547i;

            /* renamed from: j */
            public final /* synthetic */ AppCompatActivity f26548j;

            /* renamed from: n */
            public final /* synthetic */ C49712hj1 f26549n;

            /* renamed from: er1.v2$a$e$a */
            public static final class C7900a implements MMFragmentActivity$$f {

                /* renamed from: a */
                public final /* synthetic */ FinderItem f26550a;

                /* renamed from: b */
                public final /* synthetic */ AppCompatActivity f26551b;

                /* renamed from: c */
                public final /* synthetic */ C8478d0 f26552c;

                /* renamed from: d */
                public final /* synthetic */ C49712hj1 f26553d;

                public C7900a(FinderItem finderItem, AppCompatActivity appCompatActivity, C8478d0 d0Var, C49712hj1 hj12) {
                    this.f26550a = finderItem;
                    this.f26551b = appCompatActivity;
                    this.f26552c = d0Var;
                    this.f26553d = hj12;
                }

                public final void mmOnActivityResult(int i, int i2, Intent intent) {
                    int i3 = i2;
                    Intent intent2 = intent;
                    Class cls = C13442s8.class;
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (i3 == -1) {
                        ArrayList<String> stringArrayListExtra = intent2 != null ? intent2.getStringArrayListExtra("SendMsgUsernames") : null;
                        if (stringArrayListExtra == null) {
                            stringArrayListExtra = new ArrayList<>(0);
                        }
                        arrayList = stringArrayListExtra;
                        C7889a aVar = C7889a.f26514a;
                        aVar.getClass();
                        String str = C7889a.f26515b;
                        Log.m105924i(str, "share finderObject " + this.f26550a.getId() + " to " + arrayList);
                        if (!arrayList.isEmpty()) {
                            C39622i0 a = C39818r.f106831a.mo62444c(this.f26551b).mo75002a(cls);
                            C87412m.m108593f(a, "UICProvider.of(context).…rReporterUIC::class.java)");
                            C7322a b = C60172g4.C60173a.m70190b((C60172g4) a, 0, 1, (Object) null);
                            if (b != null) {
                                b.mo8766a(new C7322a.C7323a(1, this.f26550a.getId()));
                            }
                        }
                        aVar.mo9003E(arrayList);
                    } else {
                        C39622i0 a2 = C39818r.f106831a.mo62444c(this.f26551b).mo75002a(cls);
                        C87412m.m108593f(a2, "UICProvider.of(context).…rReporterUIC::class.java)");
                        C7322a b2 = C60172g4.C60173a.m70190b((C60172g4) a2, 0, 1, (Object) null);
                        if (b2 != null) {
                            b2.mo8766a(new C7322a.C7323a(3, this.f26550a.getId()));
                        }
                    }
                    long j = i3 == -1 ? 1 : 2;
                    C7335d c = C86312j.m106911c(C58417y0.class);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    long id = this.f26550a.getId();
                    int i4 = this.f26552c.f27483d;
                    String listToString = Util.listToString(arrayList, ";");
                    C87412m.m108593f(listToString, "listToString(toUsers, \";\")");
                    C58417y0.ky0((C58417y0) c, id, i4, j, listToString, this.f26553d, (long) arrayList.size(), (FinderItem) null, 64, (Object) null);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7899e(FinderItem finderItem, C64682rk1 rk12, boolean z, C32226l<? super C60166f, C13598b0> lVar, int i, AppCompatActivity appCompatActivity, C49712hj1 hj12, C15601d<? super C7899e> dVar) {
                super(2, dVar);
                this.f26543e = finderItem;
                this.f26544f = rk12;
                this.f26545g = z;
                this.f26546h = lVar;
                this.f26547i = i;
                this.f26548j = appCompatActivity;
                this.f26549n = hj12;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C7899e(this.f26543e, this.f26544f, this.f26545g, this.f26546h, this.f26547i, this.f26548j, this.f26549n, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C7899e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c2, code lost:
                if (r6 != 5) goto L_0x00ca;
             */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x00e0  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x0128  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r11.f26542d
                    java.lang.String r2 = ""
                    r3 = 1
                    if (r1 == 0) goto L_0x0017
                    if (r1 != r3) goto L_0x000f
                    kotlin.ResultKt.throwOnFailure(r12)
                    goto L_0x004e
                L_0x000f:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L_0x0017:
                    kotlin.ResultKt.throwOnFailure(r12)
                    com.tencent.mm.plugin.finder.storage.FinderItem r12 = r11.f26543e
                    boolean r12 = r12.isProductAttached()
                    if (r12 == 0) goto L_0x0055
                    java.lang.Class<ir.r> r12 = p565ir.C60613r.class
                    di3.d r12 = di3.C86312j.m106911c(r12)
                    r4 = r12
                    ir.r r4 = (p565ir.C60613r) r4
                    java.lang.String r5 = eb0.C75592q0.m90789s()
                    java.lang.String r12 = "getUsernameFromUserInfo()"
                    gy3.C87412m.m108593f(r5, r12)
                    r6 = 3
                    te3.rk1 r12 = r11.f26544f
                    java.lang.String r12 = r12.f185184e
                    if (r12 != 0) goto L_0x003d
                    r7 = r2
                    goto L_0x003e
                L_0x003d:
                    r7 = r12
                L_0x003e:
                    com.tencent.mm.plugin.finder.storage.FinderItem r12 = r11.f26543e
                    long r8 = r12.getId()
                    r11.f26542d = r3
                    r10 = r11
                    java.lang.Object r12 = r4.N10(r5, r6, r7, r8, r10)
                    if (r12 != r0) goto L_0x004e
                    return r0
                L_0x004e:
                    java.lang.String r12 = (java.lang.String) r12
                    te3.rk1 r0 = r11.f26544f
                    r0.f185182E = r12
                    goto L_0x0061
                L_0x0055:
                    er1.v2$a r12 = er1.C7888v2.C7889a.f26514a
                    r12.getClass()
                    java.lang.String r12 = er1.C7888v2.C7889a.f26515b
                    java.lang.String r0 = "feedObject.isProductAttached false"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
                L_0x0061:
                    er1.v2$a r12 = er1.C7888v2.C7889a.f26514a
                    te3.rk1 r0 = r11.f26544f
                    com.tencent.mm.message.l$b r0 = r12.mo9008f(r0)
                    boolean r1 = r11.f26545g
                    if (r1 == 0) goto L_0x007d
                    fy3.l<ht1.f, rx3.b0> r12 = r11.f26546h
                    if (r12 == 0) goto L_0x007a
                    java.lang.Class<ht1.f> r1 = ht1.C60166f.class
                    com.tencent.mm.message.g r0 = r0.mo93555w(r1)
                    r12.invoke(r0)
                L_0x007a:
                    rx3.b0 r12 = rx3.C13598b0.f38549a
                    return r12
                L_0x007d:
                    android.content.Intent r1 = new android.content.Intent
                    r1.<init>()
                    r4 = 18
                    java.lang.String r5 = "Retr_Msg_Type"
                    r1.putExtra(r5, r4)
                    java.lang.String r4 = "Multi_Retr"
                    r1.putExtra(r4, r3)
                    r4 = 0
                    java.lang.String r0 = com.tencent.p014mm.message.C68070l.C68072b.m80420s(r0, r4, r4)
                    java.lang.String r5 = "Retr_Msg_content"
                    r1.putExtra(r5, r0)
                    java.lang.String r0 = "Retr_go_to_chattingUI"
                    r5 = 0
                    r1.putExtra(r0, r5)
                    java.lang.String r0 = "Retr_show_success_tips"
                    r1.putExtra(r0, r3)
                    java.lang.String r0 = "Retr_NeedReport"
                    r1.putExtra(r0, r5)
                    java.lang.String r0 = "Retr_finder_in_stream"
                    r1.putExtra(r0, r3)
                    gy3.d0 r0 = new gy3.d0
                    r0.<init>()
                    int r6 = r11.f26547i
                    r0.f27483d = r6
                    r7 = 2
                    if (r6 == r3) goto L_0x00c8
                    r8 = 4
                    if (r6 == r7) goto L_0x00c5
                    r9 = 3
                    if (r6 == r9) goto L_0x00c8
                    if (r6 == r8) goto L_0x00c5
                    r9 = 5
                    if (r6 == r9) goto L_0x00c5
                    goto L_0x00ca
                L_0x00c5:
                    r0.f27483d = r8
                    goto L_0x00ca
                L_0x00c8:
                    r0.f27483d = r3
                L_0x00ca:
                    java.lang.Class<ox.b> r6 = p640ox.C77049b.class
                    di3.d r6 = di3.C86312j.m106911c(r6)
                    ox.b r6 = (p640ox.C77049b) r6
                    androidx.appcompat.app.AppCompatActivity r8 = r11.f26548j
                    r9 = 14
                    java.lang.Class<te3.co3> r10 = te3.C64291co3.class
                    pe3.a r6 = r6.mo72351Ok(r8, r9, r10)
                    te3.co3 r6 = (te3.C64291co3) r6
                    if (r6 == 0) goto L_0x0102
                    r6.f182544i = r3
                    r6.f182539d = r7
                    long r7 = android.os.SystemClock.elapsedRealtime()
                    long r9 = r6.f182550r
                    long r7 = r7 - r9
                    int r3 = (int) r7
                    r6.f182547o = r3
                    java.lang.String r3 = "0"
                    r6.f182545j = r3
                    r6.f182546n = r3
                    r6.f182549q = r2
                    r12.getClass()
                    int r2 = er1.C7888v2.C7889a.f26516c
                    r6.f182543h = r2
                    r12.getClass()
                    er1.C7888v2.C7889a.f26516c = r5
                L_0x0102:
                    od3.a r12 = od3.C62001a.f176265a
                    androidx.appcompat.app.AppCompatActivity r2 = r11.f26548j
                    r12.mo86878a(r2)
                    androidx.appcompat.app.AppCompatActivity r12 = r11.f26548j
                    java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity"
                    gy3.C87412m.m108592e(r12, r2)
                    com.tencent.mm.ui.MMFragmentActivity r12 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r12
                    r2 = 1001(0x3e9, float:1.403E-42)
                    er1.v2$a$e$a r3 = new er1.v2$a$e$a
                    com.tencent.mm.plugin.finder.storage.FinderItem r5 = r11.f26543e
                    androidx.appcompat.app.AppCompatActivity r6 = r11.f26548j
                    te3.hj1 r7 = r11.f26549n
                    r3.<init>(r5, r6, r0, r7)
                    java.lang.String r0 = ".ui.transmit.MsgRetransmitUI"
                    ke3.C88144b.m109804v(r12, r0, r1, r2, r3)
                    fy3.l<ht1.f, rx3.b0> r12 = r11.f26546h
                    if (r12 == 0) goto L_0x012b
                    r12.invoke(r4)
                L_0x012b:
                    rx3.b0 r12 = rx3.C13598b0.f38549a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: er1.C7888v2.C7889a.C7899e.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: er1.v2$a$g */
        public static final class C7901g implements MMFragmentActivity$$f {

            /* renamed from: a */
            public final /* synthetic */ Bundle f26554a;

            /* renamed from: b */
            public final /* synthetic */ AppCompatActivity f26555b;

            /* renamed from: c */
            public final /* synthetic */ BaseFinderFeed f26556c;

            public C7901g(Bundle bundle, AppCompatActivity appCompatActivity, BaseFinderFeed baseFinderFeed) {
                this.f26554a = bundle;
                this.f26555b = appCompatActivity;
                this.f26556c = baseFinderFeed;
            }

            public void mmOnActivityResult(int i, int i2, Intent intent) {
                C0073g0 g0Var = C0073g0.LIVE_ANCHOR_ACTION_SHARE;
                Class cls = C8777j5.class;
                Class cls2 = C13442s8.class;
                if (i2 == -1) {
                    Bundle bundle = this.f26554a;
                    if ((bundle != null ? bundle.getInt("FinderLiveShareExtraScene") : 0) == 1) {
                        AppCompatActivity appCompatActivity = this.f26555b;
                        C76879j.m92726T(appCompatActivity, appCompatActivity.getString(C0966R.string.a1u));
                    } else {
                        AppCompatActivity appCompatActivity2 = this.f26555b;
                        C76879j.m92726T(appCompatActivity2, appCompatActivity2.getString(C0966R.string.f360099a34));
                    }
                    C39622i0 a = C39818r.f106831a.mo62444c(this.f26555b).mo75002a(cls2);
                    C87412m.m108593f(a, "UICProvider.of(context).…rReporterUIC::class.java)");
                    C7322a b = C60172g4.C60173a.m70190b((C60172g4) a, 0, 1, (Object) null);
                    if (b != null) {
                        b.mo8766a(new C7322a.C7323a(2, this.f26556c.getItemId()));
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", "2");
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
                    C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
                    C7889a aVar = C7889a.f26514a;
                    BaseFinderFeed baseFinderFeed = this.f26556c;
                    aVar.getClass();
                    C87412m.m108594g(baseFinderFeed, "feed");
                    LinkedList linkedList = new LinkedList();
                    db4 db4 = new db4();
                    db4.f182676d = baseFinderFeed.mo3513o().getId();
                    db4.f182680h = baseFinderFeed.mo3513o().getObjectNonceId();
                    C64441i93 i932 = new C64441i93();
                    i932.f183667y = 1;
                    i932.f183656n = 1;
                    db4.f182679g = i932;
                    db4.f182684o = baseFinderFeed.mo3526z();
                    db4.f182681i = baseFinderFeed.mo3513o().getUserName();
                    db4.f182686q = 65;
                    C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
                    db4.f182695z = liveInfo != null ? liveInfo.f182392d : 0;
                    linkedList.add(db4);
                    C49712hj1 hj12 = new C49712hj1();
                    hj12.f134675i = 65;
                    new C46525m1(linkedList, hj12).mo9225i().mo123419C(new C7911w2(linkedList));
                    return;
                }
                C39622i0 a2 = C39818r.f106831a.mo62444c(this.f26555b).mo75002a(cls2);
                C87412m.m108593f(a2, "UICProvider.of(context).…rReporterUIC::class.java)");
                C7322a b2 = C60172g4.C60173a.m70190b((C60172g4) a2, 0, 1, (Object) null);
                if (b2 != null) {
                    b2.mo8766a(new C7322a.C7323a(4, this.f26556c.getItemId()));
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c2, g0Var, jSONObject2.toString(), (String) null, 4, (Object) null);
            }
        }

        /* renamed from: er1.v2$a$h */
        public static final class C7902h implements MMActivity.C6739d {

            /* renamed from: d */
            public final /* synthetic */ C60174h f26557d;

            public C7902h(C60174h hVar) {
                this.f26557d = hVar;
            }

            public final void mmOnActivityResult(int i, int i2, Intent intent) {
                new ArrayList();
                if (i2 == -1) {
                    ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
                    if (stringArrayListExtra == null) {
                        stringArrayListExtra = new ArrayList<>(0);
                    }
                    C7889a aVar = C7889a.f26514a;
                    aVar.getClass();
                    String str = C7889a.f26515b;
                    Log.m105924i(str, "share poi " + this.f26557d.f171711b + " to " + stringArrayListExtra);
                    aVar.mo9003E(stringArrayListExtra);
                }
            }
        }

        /* renamed from: er1.v2$a$k */
        public static final class C7903k implements C97425j.C58242a {

            /* renamed from: a */
            public final /* synthetic */ AppCompatActivity f26558a;

            /* renamed from: b */
            public final /* synthetic */ C8479f0<C9247b> f26559b;

            public C7903k(AppCompatActivity appCompatActivity, C8479f0<C9247b> f0Var) {
                this.f26558a = appCompatActivity;
                this.f26559b = f0Var;
            }

            /* renamed from: a */
            public final void mo9025a(int i, int i2, List<C48681a90> list) {
                C48681a90 a902;
                if (i == 0 && i2 == 0) {
                    boolean z = false;
                    if (!(list == null || (a902 = (C48681a90) C110818d0.m150916N(list)) == null || a902.f130376e != 0)) {
                        z = true;
                    }
                    if (!z) {
                        AppCompatActivity appCompatActivity = this.f26558a;
                        C76912y0.m92767f(appCompatActivity, appCompatActivity.getString(C0966R.string.n6x));
                    }
                } else {
                    AppCompatActivity appCompatActivity2 = this.f26558a;
                    C76912y0.m92767f(appCompatActivity2, appCompatActivity2.getString(C0966R.string.n6x));
                }
                ((C9247b) this.f26559b.f27484d).mo8913b();
            }
        }

        /* renamed from: B */
        public static /* synthetic */ void m8052B(C7889a aVar, MMActivity mMActivity, String str, int i, long j, String str2, String str3, C64311db1 db12, int i2, String str4, C64258bf0 bf02, int i3, Object obj) {
            aVar.mo9001A(mMActivity, str, i, j, str2, str3, db12, i2, str4, (i3 & 512) != 0 ? null : bf02);
        }

        /* renamed from: D */
        public static /* synthetic */ void m8053D(C7889a aVar, MMActivity mMActivity, String str, int i, long j, String str2, String str3, C64311db1 db12, int i2, String str4, C64258bf0 bf02, int i3, Object obj) {
            aVar.mo9002C(mMActivity, str, i, j, str2, str3, db12, i2, str4, (i3 & 512) != 0 ? null : bf02);
        }

        /* renamed from: a */
        public static final void m8054a(C7889a aVar, Context context, C64287ci1 ci12, C32226l lVar) {
            aVar.getClass();
            String str = f26515b;
            Log.m105924i(str, "continueShareProduct " + ci12.f182502n);
            C68070l.C68072b bVar = new C68070l.C68072b();
            C60175i iVar = new C60175i();
            iVar.f171712b = ci12;
            bVar.mo93545f(iVar);
            bVar.f195582i = 82;
            bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
            bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
            Intent intent = new Intent();
            intent.putExtra("Retr_Msg_Type", 30);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null));
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            if (context instanceof MMFragmentActivity) {
                C88144b.m109804v((MMFragmentActivity) context, ".ui.transmit.MsgRetransmitUI", intent, 1005, new C58778u2(ci12, lVar));
            } else {
                C88144b.m109801s(context, ".ui.transmit.MsgRetransmitUI", intent, (Bundle) null);
            }
        }

        /* renamed from: n */
        public static void m8055n(C7889a aVar, MMActivity mMActivity, C58969q qVar, Bundle bundle, int i, Object obj) {
            aVar.getClass();
            C87412m.m108594g(mMActivity, "context");
            C87412m.m108594g(qVar, "contact");
            C117407d.INSTANCE.idkeyStat(1278, 13, 1, false);
            if (!C11767a.f34453a.mo11659a(FirebaseAnalytics.C113378a.SHARE)) {
                if ((qVar.field_extFlag & 1048576) > 0) {
                    String str = f26515b;
                    Log.m105924i(str, "shareFinderContactToConversation: forbid share contact, nickname=" + qVar.getNickname());
                    return;
                }
                C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C58789x2(qVar, mMActivity, (C15601d<? super C58789x2>) null), 3, (Object) null);
            }
        }

        /* renamed from: t */
        public static /* synthetic */ void m8056t(C7889a aVar, AppCompatActivity appCompatActivity, FinderItem finderItem, Bundle bundle, int i, C32226l lVar, int i2, Object obj) {
            aVar.mo9020s(appCompatActivity, finderItem, (i2 & 4) != 0 ? null : bundle, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? null : lVar);
        }

        /* renamed from: w */
        public static /* synthetic */ void m8057w(C7889a aVar, AppCompatActivity appCompatActivity, BaseFinderFeed baseFinderFeed, Bundle bundle, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                bundle = null;
            }
            aVar.mo9022v(appCompatActivity, baseFinderFeed, bundle, (i3 & 8) != 0 ? 2 : i, (i3 & 16) != 0 ? 0 : i2);
        }

        /* renamed from: y */
        public static /* synthetic */ void m8058y(C7889a aVar, AppCompatActivity appCompatActivity, BaseFinderFeed baseFinderFeed, Bundle bundle, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                bundle = null;
            }
            if ((i2 & 8) != 0) {
                i = 2;
            }
            aVar.mo9023x(appCompatActivity, baseFinderFeed, bundle, i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: ht1.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: ht1.k} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: ht1.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: ht1.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: ht1.c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: A */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo9001A(com.tencent.p014mm.p136ui.MMActivity r16, java.lang.String r17, int r18, long r19, java.lang.String r21, java.lang.String r22, te3.C64311db1 r23, int r24, java.lang.String r25, te3.C64258bf0 r26) {
            /*
                r15 = this;
                r8 = r16
                r9 = r18
                java.lang.String r0 = "context"
                gy3.C87412m.m108594g(r8, r0)
                ot1.a r0 = ot1.C11767a.f34453a
                java.lang.String r1 = "share"
                boolean r0 = r0.mo11659a(r1)
                if (r0 == 0) goto L_0x0015
                return
            L_0x0015:
                com.tencent.mm.message.l$b r10 = new com.tencent.mm.message.l$b
                r10.<init>()
                r11 = 4
                r12 = 15
                r13 = 7
                if (r9 == r13) goto L_0x005b
                if (r9 == r12) goto L_0x003d
                ht1.k r14 = new ht1.k
                r14.<init>()
                er1.v2$a r0 = f26514a
                r7 = 0
                r1 = r17
                r2 = r18
                r3 = r21
                r4 = r22
                r5 = r23
                r6 = r25
                te3.tk1 r0 = r0.mo9011i(r1, r2, r3, r4, r5, r6, r7)
                r14.f171714b = r0
                goto L_0x0079
            L_0x003d:
                r10.f195479D2 = r11
                ht1.c r14 = new ht1.c
                r14.<init>()
                er1.v2$a r0 = f26514a
                r1 = r17
                r2 = r18
                r3 = r21
                r4 = r22
                r5 = r23
                r6 = r25
                r7 = r26
                te3.tk1 r0 = r0.mo9011i(r1, r2, r3, r4, r5, r6, r7)
                r14.f171699b = r0
                goto L_0x0079
            L_0x005b:
                r0 = 3
                r10.f195479D2 = r0
                ht1.c r14 = new ht1.c
                r14.<init>()
                er1.v2$a r0 = f26514a
                r1 = r17
                r2 = r18
                r3 = r21
                r4 = r22
                r5 = r23
                r6 = r25
                r7 = r26
                te3.tk1 r0 = r0.mo9011i(r1, r2, r3, r4, r5, r6, r7)
                r14.f171699b = r0
            L_0x0079:
                r10.mo93545f(r14)
                if (r9 == r11) goto L_0x0088
                if (r9 == r13) goto L_0x0085
                if (r9 == r12) goto L_0x0085
                r0 = 59
                goto L_0x008a
            L_0x0085:
                r0 = 75
                goto L_0x008a
            L_0x0088:
                r0 = 72
            L_0x008a:
                r10.f195582i = r0
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r1 = 2131832325(0x7f112e05, float:1.92977E38)
                java.lang.String r0 = r0.getString(r1)
                r10.f195570f = r0
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r1 = 2131832326(0x7f112e06, float:1.9297703E38)
                java.lang.String r0 = r0.getString(r1)
                r10.f195586j = r0
                android.content.Intent r14 = new android.content.Intent
                r14.<init>()
                if (r9 == r11) goto L_0x00ba
                if (r9 == r13) goto L_0x00b7
                if (r9 == r12) goto L_0x00b4
                r0 = 21
                goto L_0x00bc
            L_0x00b4:
                r0 = 32
                goto L_0x00bc
            L_0x00b7:
                r0 = 27
                goto L_0x00bc
            L_0x00ba:
                r0 = 25
            L_0x00bc:
                java.lang.String r1 = "Retr_Msg_Type"
                r14.putExtra(r1, r0)
                java.lang.String r0 = "Multi_Retr"
                r1 = 1
                r14.putExtra(r0, r1)
                r0 = 0
                java.lang.String r0 = com.tencent.p014mm.message.C68070l.C68072b.m80420s(r10, r0, r0)
                java.lang.String r2 = "Retr_Msg_content"
                r14.putExtra(r2, r0)
                r0 = 0
                java.lang.String r2 = "Retr_go_to_chattingUI"
                r14.putExtra(r2, r0)
                java.lang.String r0 = "Retr_show_success_tips"
                r14.putExtra(r0, r1)
                r10 = 1001(0x3e9, float:1.403E-42)
                er1.v2$a$l r11 = new er1.v2$a$l
                r0 = r11
                r1 = r17
                r2 = r18
                r3 = r19
                r5 = r26
                r6 = r16
                r7 = r24
                r0.<init>(r1, r2, r3, r5, r6, r7)
                java.lang.String r0 = ".ui.transmit.MsgRetransmitUI"
                ke3.C88144b.m109803u(r8, r0, r14, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: er1.C7888v2.C7889a.mo9001A(com.tencent.mm.ui.MMActivity, java.lang.String, int, long, java.lang.String, java.lang.String, te3.db1, int, java.lang.String, te3.bf0):void");
        }

        /* renamed from: C */
        public final void mo9002C(MMActivity mMActivity, String str, int i, long j, String str2, String str3, C64311db1 db12, int i2, String str4, C64258bf0 bf02) {
            C54016e eVar;
            MMActivity mMActivity2 = mMActivity;
            int i3 = i;
            Class cls = C60228r0.class;
            C87412m.m108594g(mMActivity, "context");
            if (!C11767a.f34453a.mo11659a(FirebaseAnalytics.C113378a.SHARE)) {
                String str5 = f26515b;
                Log.m105924i(str5, "share topic " + str + " to sns");
                Intent intent = new Intent();
                C64730tk1 i4 = mo9011i(str, i, str2, str3, db12, str4, bf02);
                if (i3 == 7) {
                    eVar = ((C60228r0) C86312j.m106911c(cls)).wm0();
                    eVar.mo74684a(i4);
                } else if (i3 != 15) {
                    eVar = ((C60228r0) C86312j.m106911c(cls)).mo84721Vc();
                    eVar.mo74684a(i4);
                } else {
                    eVar = ((C60228r0) C86312j.m106911c(cls)).g60();
                    eVar.mo74684a(i4);
                }
                if (i3 == 7) {
                    intent.putExtra("ksnsupload_finder_activity_xml", eVar.mo74685b());
                } else if (i3 != 15) {
                    intent.putExtra("ksnsupload_finder_topic_xml", eVar.mo74685b());
                } else {
                    intent.putExtra("ksnsupload_finder_music_topic_xml", eVar.mo74685b());
                }
                intent.putExtra("Ksnsupload_type", i3 != 4 ? i3 != 7 ? i3 != 15 ? 18 : 32 : 24 : 22);
                intent.putExtra("need_result", true);
                C88144b.m109803u(mMActivity, ".plugin.sns.ui.SnsUploadUI", intent, 1002, new C7895m(mMActivity, i, j, bf02, str, i2));
            }
        }

        /* renamed from: E */
        public final void mo9003E(ArrayList<String> arrayList) {
            C87412m.m108594g(arrayList, "userNames");
            C66649b P7 = ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7();
            P7.getClass();
            Log.m105924i("MicroMsg.RecentForwardInfoStorage", "updateForwardInfo :" + Integer.valueOf(arrayList.size()));
            boolean z = false;
            if (!arrayList.isEmpty()) {
                z = true;
            }
            if (z) {
                C57601q4 b = P7.mo90699b();
                LinkedList<C57600p4> linkedList = b.f164923d;
                C87412m.m108593f(linkedList, "list.info_list");
                ArrayList arrayList2 = new ArrayList();
                for (T next : linkedList) {
                    if (!arrayList.contains(((C57600p4) next).f164920d)) {
                        arrayList2.add(next);
                    }
                }
                b.f164923d = new LinkedList<>(arrayList2);
                P7.f191651a = b;
                LinkedList linkedList2 = new LinkedList();
                for (String str : arrayList) {
                    C57600p4 p4Var = new C57600p4();
                    p4Var.f164921e = C31543z5.m39453c();
                    p4Var.f164920d = str;
                    p4Var.f164922f = C66649b.f191649b.mo90705a(str);
                    linkedList2.add(p4Var);
                }
                P7.mo90700c(linkedList2);
            }
        }

        /* renamed from: b */
        public final void mo9004b(Context context, C15133e0 e0Var, BaseFinderFeed baseFinderFeed, C76874e0 e0Var2, C77407n nVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(e0Var, "quickMenuHelper");
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(e0Var2, "menu");
            C87412m.m108594g(nVar, "sheet");
            if (C58784w3.f168295a.mo83900S0(context)) {
                boolean z = baseFinderFeed.mo3513o().getFeedObject().showOriginal;
                e0Var.mo14095wW(context, e0Var2, nVar, z ? 5 : 1, new C7890a(z, context, nVar));
            } else {
                e0Var.el0(context, e0Var2, nVar);
            }
            f26516c = e0Var.getItemCount();
            ArrayList<C78536j0> Bv0 = e0Var.Bv0();
            if (!Bv0.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (C78536j0 j0Var : Bv0) {
                    sb.append(j0Var.f230019a + '|');
                }
                JSONObject jSONObject = C7433e1.f25624c;
                if (jSONObject != null) {
                    jSONObject.put("icon_recent_forward", sb.toString());
                }
            }
        }

        /* renamed from: c */
        public final C65488a0 mo9005c(FinderObject finderObject) {
            String str;
            C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
            C65488a0 a0Var = new C65488a0();
            a0Var.f188439d = WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY;
            FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
            if (!(finderObjectDesc == null || (str = finderObjectDesc.description) == null || finderObjectDesc == null)) {
                finderObjectDesc.description = C8703w0.f27927a.mo9553e(str);
            }
            byte[] byteArray = finderObject.toByteArray();
            a0Var.f188441f = Base64.encodeToString(byteArray, 0, byteArray.length, 0);
            C52686h1 h1Var = new C52686h1();
            h1Var.f147133d = finderObject.f164794id;
            h1Var.f147134e = finderObject.objectNonceId;
            byte[] byteArray2 = h1Var.toByteArray();
            a0Var.f188442g = Base64.encodeToString(byteArray2, 0, byteArray2.length, 2);
            return a0Var;
        }

        /* renamed from: d */
        public final C64581nk1 mo9006d(C64629pl1 pl12) {
            LinkedList<FinderMedia> linkedList;
            C87412m.m108594g(pl12, "card");
            LinkedList linkedList2 = new LinkedList();
            LinkedList linkedList3 = new LinkedList();
            LinkedList<FinderObject> linkedList4 = pl12.f184844h;
            C87412m.m108593f(linkedList4, "card.`object`");
            Iterator<T> it = linkedList4.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                FinderMedia finderMedia = null;
                int i3 = 4;
                if (it.hasNext()) {
                    T next = it.next();
                    int i4 = i2 + 1;
                    if (i2 >= 0) {
                        FinderObject finderObject = (FinderObject) next;
                        if (i2 < 4) {
                            FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
                            if (!(finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null)) {
                                finderMedia = linkedList.getFirst();
                            }
                            if (finderMedia != null) {
                                String str = finderMedia.thumbUrl;
                                if (str != null) {
                                    linkedList2.add(str);
                                }
                                String str2 = finderMedia.thumb_url_token;
                                if (str2 != null) {
                                    linkedList3.add(str2);
                                }
                            }
                        }
                        i2 = i4;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                } else {
                    String p = C61926c.m72691p(pl12.f184854u);
                    String str3 = pl12.f184841e;
                    String str4 = pl12.f184853t;
                    C89349b bVar = pl12.f184846j;
                    C64581nk1 nk12 = new C64581nk1();
                    nk12.f184475d = p;
                    nk12.f184476e = str3;
                    nk12.f184477f = str4;
                    int size = linkedList2.size();
                    if (4 > size) {
                        i3 = size;
                    }
                    for (Object next2 : linkedList2.subList(0, i3)) {
                        int i5 = i + 1;
                        if (i >= 0) {
                            nk12.f184478g.add((String) next2);
                            nk12.f184479h.add(linkedList3.get(i));
                            i = i5;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    nk12.f184480i = bVar;
                    return nk12;
                }
            }
        }

        /* renamed from: e */
        public final C64711sk1 mo9007e(m74 m74, String str, String str2, String str3, int i) {
            C87412m.m108594g(m74, FirebaseAnalytics.C113379b.LOCATION);
            C87412m.m108594g(str, "poiCategories");
            C64711sk1 sk12 = new C64711sk1();
            sk12.f185423e = String.valueOf(m74.f184219d);
            sk12.f185422d = String.valueOf(m74.f184220e);
            sk12.f185428j = m74.f184224i;
            sk12.f185425g = String.valueOf(m74.f184227o);
            sk12.f185427i = str2;
            sk12.f185426h = m74.f184223h;
            if (!Util.isNullOrNil(m74.f184222g)) {
                str3 = m74.f184222g;
            }
            sk12.f185424f = str3;
            StringBuilder sb = new StringBuilder();
            String d = C7878t0.m8035d((long) i);
            if (!Util.isNullOrNil(str)) {
                sb.append(str);
                if (i > 0) {
                    sb.append(APLogFileUtil.SEPARATOR_LOG);
                    sb.append(MMApplicationContext.getContext().getString(C0966R.string.ehi, new Object[]{d}));
                }
            } else if (i > 0) {
                sb.append(MMApplicationContext.getContext().getString(C0966R.string.ehi, new Object[]{d}));
            }
            sk12.f185429n = sb.toString();
            return sk12;
        }

        /* renamed from: f */
        public final C68070l.C68072b mo9008f(C64682rk1 rk12) {
            C87412m.m108594g(rk12, "finderShareObject");
            C68070l.C68072b bVar = new C68070l.C68072b();
            C60166f fVar = new C60166f();
            fVar.f171710b = rk12;
            bVar.mo93545f(fVar);
            bVar.f195582i = 51;
            bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
            bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
            return bVar;
        }

        /* renamed from: g */
        public final C77459z mo9009g(String str, String str2, long j, FinderObject finderObject) {
            C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mo9005c(finderObject));
            int i = C63347a.f179714a;
            C65488a0 a0Var = new C65488a0();
            a0Var.f188439d = "3";
            a0Var.f188441f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
            arrayList.add(a0Var);
            C77459z.C63350a aVar = new C77459z.C63350a();
            String str3 = finderObject.wx_status_icon_id;
            if (str3 == null || str3.length() == 0) {
                aVar.mo88254a("1024");
            } else {
                aVar.mo88254a(finderObject.wx_status_icon_id);
            }
            aVar.mo88259f(str);
            aVar.mo88257d(str2);
            aVar.mo88258e("finder@inner");
            aVar.mo88256c(C61926c.m72691p(j));
            aVar.mo88260g(finderObject.verify_info_buf);
            aVar.mo88257d("http://wxapp.tc.qq.com/258/20304/stodownload?m=9823aa7c1879309ff7588e09c22144dd&filekey=30340201010420301e020201020402534804109823aa7c1879309ff7588e09c22144dd020207b8040d00000004627466730000000131&hy=SH&storeid=32303231303331383139353930393030306236313937303030303030303037636638353130393030303030313032&bizid=1023");
            aVar.mo88255b(arrayList);
            C77459z zVar = aVar.f179715a;
            C87412m.m108593f(zVar, "Builder().apply {\n      …fo)\n            }.build()");
            return zVar;
        }

        /* renamed from: h */
        public final C64682rk1 mo9010h(FinderItem finderItem, boolean z) {
            String str;
            String str2;
            String str3;
            String str4;
            C13598b0 b0Var;
            FinderAuthInfo finderAuthInfo;
            String str5;
            String str6;
            String str7;
            C49720hl0 hl02;
            C49720hl0 hl03;
            String str8;
            FinderContact finderContact;
            FinderContact finderContact2;
            FinderContact finderContact3;
            boolean z2 = z;
            C87412m.m108594g(finderItem, "feedObject");
            C37521f.f99374d.getClass();
            int intValue = C37521f.f99297U0.mo60266n().intValue();
            String str9 = f26515b;
            Log.m105924i(str9, "getFinderShareObject " + intValue + ' ' + finderItem.getFeedObject().forward_style + ' ' + z2);
            boolean z3 = true;
            String str10 = "";
            if (!z2 ? (finderContact = finderItem.getFeedObject().contact) == null || (str = finderContact.nickname) == null : intValue == 1 ? (finderContact2 = finderItem.getFeedObject().contact) == null || (str = finderContact2.nickname) == null : intValue == 2 || C61926c.m72696u(finderItem.getFeedObject().forward_style, 1) || (finderContact3 = finderItem.getFeedObject().contact) == null || (str = finderContact3.nickname) == null) {
                str = str10;
            }
            FinderContact finderContact4 = finderItem.getFeedObject().contact;
            if (finderContact4 == null || (str2 = finderContact4.headUrl) == null) {
                str2 = str10;
            }
            C58784w3 w3Var = C58784w3.f168295a;
            if (w3Var.mo83891O0(finderItem.getFeedObject())) {
                C52192z0 j0 = w3Var.mo83940j0(finderItem.getFeedObject());
                String str11 = j0 != null ? j0.f145600d : null;
                if (str11 != null) {
                    str = str11;
                }
                C52192z0 j05 = w3Var.mo83940j0(finderItem.getFeedObject());
                String str12 = j05 != null ? j05.f145601e : null;
                if (str12 != null) {
                    str2 = str12;
                }
            }
            FinderContact finderContact5 = finderItem.getFeedObject().contact;
            C64284cg a = finderContact5 != null ? C58960c.m68829a(finderContact5, true) : null;
            C64682rk1 rk12 = new C64682rk1();
            rk12.f185183d = C61926c.m72691p(finderItem.getId());
            rk12.f185191o = finderItem.getObjectNonceId();
            rk12.f185188i = finderItem.getMediaType();
            rk12.f185186g = str2;
            if (a == null || (str3 = a.f182470f) == null) {
                str3 = str10;
            }
            rk12.f185199w = str3;
            rk12.f185185f = str;
            if (a == null || (str4 = a.f182469e) == null) {
                str4 = str10;
            }
            rk12.f185198v = str4;
            rk12.f185184e = finderItem.getUserName();
            rk12.f185187h = C8703w0.f27927a.mo9553e(finderItem.getDescription());
            if (a != null) {
                C64709se seVar = a.f182473i;
                rk12.f185201y = seVar != null ? seVar.f185417d : 0;
                if (seVar == null || (str8 = seVar.f185418e) == null) {
                    str8 = str10;
                }
                rk12.f185202z = str8;
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                rk12.f185201y = 0;
                rk12.f185202z = str10;
            }
            FinderContact finderContact6 = finderItem.getFeedObject().contact;
            if (finderContact6 == null || (finderAuthInfo = finderContact6.authInfo) == null) {
                finderAuthInfo = null;
            } else {
                rk12.f185196t = finderAuthInfo.authIconType;
                rk12.f185197u = finderAuthInfo.authIconUrl;
            }
            if (finderAuthInfo == null) {
                rk12.f185196t = 0;
                rk12.f185197u = str10;
            }
            rk12.f185189j = finderItem.getMediaList().size();
            LinkedList<C64628pk1> linkedList = rk12.f185190n;
            LinkedList<C64689rq2> mediaList = finderItem.getMediaList();
            ArrayList arrayList = new ArrayList(C36907w.m41090l(mediaList, 10));
            for (C64689rq2 rq22 : mediaList) {
                C64628pk1 pk12 = new C64628pk1();
                pk12.f184826d = rq22.f185268f;
                StringBuilder sb = new StringBuilder();
                sb.append(rq22.f185266d);
                String str13 = rq22.f185286y;
                if (str13 == null) {
                    str13 = str10;
                }
                sb.append(str13);
                pk12.f184827e = sb.toString();
                if (!Util.isNullOrNil(rq22.f185283w)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(rq22.f185283w);
                    String str14 = rq22.f185234A;
                    if (str14 == null) {
                        str14 = str10;
                    }
                    sb4.append(str14);
                    pk12.f184828f = sb4.toString();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(rq22.f185283w);
                    String str15 = rq22.f185234A;
                    if (str15 == null) {
                        str15 = str10;
                    }
                    sb5.append(str15);
                    pk12.f184834o = sb5.toString();
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(rq22.f185267e);
                    String str16 = rq22.f185288z;
                    if (str16 == null) {
                        str16 = str10;
                    }
                    sb6.append(str16);
                    pk12.f184828f = sb6.toString();
                }
                if (!Util.isNullOrNil(rq22.f185239F)) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(rq22.f185239F);
                    String str17 = rq22.f185240G;
                    if (str17 == null) {
                        str17 = str10;
                    }
                    sb7.append(str17);
                    pk12.f184832j = sb7.toString();
                }
                C64450iq0 iq02 = rq22.f185248P;
                if (iq02 != null) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append('[');
                    sb8.append(iq02.f183717d);
                    sb8.append(',');
                    sb8.append(iq02.f183718e);
                    sb8.append(',');
                    sb8.append(iq02.f183719f);
                    sb8.append(',');
                    sb8.append(iq02.f183720g);
                    sb8.append(']');
                    pk12.f184833n = sb8.toString();
                }
                pk12.f184829g = rq22.f185270h;
                pk12.f184830h = rq22.f185271i;
                pk12.f184831i = rq22.f185269g;
                arrayList.add(pk12);
            }
            linkedList.addAll(arrayList);
            rk12.f185192p = !finderItem.isPostFinish() ? finderItem.getLocalId() : 0;
            FinderContact finderContact7 = finderItem.getFeedObject().contact;
            if (finderContact7 == null || finderContact7.user_mode != 1) {
                z3 = false;
            }
            if (!z3 || a == null || (str5 = a.f182468d) == null) {
                str5 = str10;
            }
            rk12.f185195s = str5;
            if (a == null || (str6 = a.f182468d) == null) {
                str6 = str10;
            }
            rk12.f185200x = str6;
            C50124kf1 kf12 = finderItem.getFeedObject().object_extend;
            if (kf12 == null || (hl03 = kf12.f136752n) == null || (str7 = hl03.f134715d) == null) {
                str7 = str10;
            }
            rk12.f185180C = str7;
            C58784w3 w3Var2 = C58784w3.f168295a;
            FinderObject feedObject = finderItem.getFeedObject();
            w3Var2.getClass();
            C87412m.m108594g(feedObject, "feedObject");
            FinderJumpInfo h0 = w3Var2.mo83934h0(feedObject);
            if (h0 != null) {
                FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
                finderJumpInfo.jumpinfo_type = h0.jumpinfo_type;
                finderJumpInfo.business_type = h0.business_type;
                finderJumpInfo.ext_type = h0.ext_type;
                finderJumpInfo.mini_app_info = h0.mini_app_info;
                finderJumpInfo.html5_info = h0.html5_info;
                finderJumpInfo.native_info = h0.native_info;
                finderJumpInfo.schema_info = h0.schema_info;
                finderJumpInfo.lite_app_info = h0.lite_app_info;
                finderJumpInfo.style = h0.style;
                byte[] encode = Base64.encode(h0.toByteArray(), 2);
                C87412m.m108593f(encode, "encode(jumpInfo.toByteArray(), Base64.NO_WRAP)");
                str10 = new String(encode, C119027c.f356488a);
            }
            rk12.f185181D = str10;
            String str18 = f26515b;
            StringBuilder sb9 = new StringBuilder();
            sb9.append("finderForwardSource:");
            C50124kf1 kf13 = finderItem.getFeedObject().object_extend;
            sb9.append((kf13 == null || (hl02 = kf13.f136752n) == null) ? null : hl02.f134715d);
            Log.m105924i(str18, sb9.toString());
            return rk12;
        }

        /* renamed from: i */
        public final C64730tk1 mo9011i(String str, int i, String str2, String str3, C64311db1 db12, String str4, C64258bf0 bf02) {
            C64730tk1 tk12 = new C64730tk1();
            tk12.f185603d = Util.nullAsNil(str);
            tk12.f185604e = i;
            tk12.f185605f = Util.nullAsNil(str2);
            tk12.f185606g = Util.nullAsNil(str3);
            tk12.f185608i = Util.nullAsNil(str4);
            C64609ok1 ok12 = new C64609ok1();
            ok12.f184668d = db12 != null ? db12.f182666i : null;
            float f = 0.0f;
            ok12.f184669e = db12 != null ? db12.f182661d : 0.0f;
            if (db12 != null) {
                f = db12.f182662e;
            }
            ok12.f184670f = f;
            tk12.f185607h = ok12;
            if (bf02 != null) {
                tk12.f185609j = bf02;
            }
            return tk12;
        }

        /* renamed from: j */
        public final boolean mo9012j(C15133e0 e0Var, BaseFinderFeed baseFinderFeed, C76875f0 f0Var, C77407n nVar, Context context) {
            C87412m.m108594g(e0Var, "quickMenuHelper");
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(f0Var, "menu");
            C87412m.m108594g(nVar, "sheet");
            C87412m.m108594g(context, "context");
            return e0Var.m20(nVar, f0Var, (!baseFinderFeed.mo3513o().getFeedObject().showOriginal || !C58784w3.f168295a.mo83900S0(context)) ? 1 : 6);
        }

        /* renamed from: k */
        public final void mo9013k(MMActivity mMActivity, C60158d dVar, C49712hj1 hj12) {
            C87412m.m108594g(mMActivity, "context");
            C87412m.m108594g(dVar, "objectContent");
            if (!C11767a.f34453a.mo11659a(FirebaseAnalytics.C113378a.SHARE)) {
                C68070l.C68072b bVar = new C68070l.C68072b();
                bVar.mo93545f(dVar);
                bVar.f195582i = 73;
                bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
                bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
                Intent intent = new Intent();
                intent.putExtra("Retr_Msg_Type", 22);
                intent.putExtra("Multi_Retr", true);
                intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null));
                intent.putExtra("Retr_go_to_chattingUI", false);
                intent.putExtra("Retr_show_success_tips", true);
                C88144b.m109803u(mMActivity, ".ui.transmit.MsgRetransmitUI", intent, 1001, new C7896b(dVar, hj12));
            }
        }

        /* renamed from: l */
        public final void mo9014l(MMActivity mMActivity, C54012a aVar, C49712hj1 hj12) {
            C87412m.m108594g(mMActivity, "context");
            C87412m.m108594g(aVar, "snsShare");
            if (!C11767a.f34453a.mo11659a(FirebaseAnalytics.C113378a.SHARE)) {
                String str = f26515b;
                StringBuilder sb = new StringBuilder();
                sb.append("[shareAlbumToSnsTimeLine] share album to sns. ");
                C54019i iVar = (C54019i) aVar;
                sb.append(iVar.f151288a.f184476e);
                Log.m105924i(str, sb.toString());
                Intent intent = new Intent();
                intent.putExtra("ksnsupload_finder_album_xml", iVar.mo74685b());
                intent.putExtra("Ksnsupload_type", 20);
                intent.putExtra("need_result", true);
                C88144b.m109803u(mMActivity, ".plugin.sns.ui.SnsUploadUI", intent, 1002, new C7897c(mMActivity, aVar, hj12));
            }
        }

        /* renamed from: m */
        public final void mo9015m(AppCompatActivity appCompatActivity, FinderItem finderItem, Bundle bundle, int i, boolean z, C32226l<? super C60166f, C13598b0> lVar) {
            AppCompatActivity appCompatActivity2 = appCompatActivity;
            C32226l<? super C60166f, C13598b0> lVar2 = lVar;
            C58784w3 w3Var = C58784w3.f168295a;
            if (!w3Var.mo83927f(finderItem.getFeedObject())) {
                String string = appCompatActivity2.getString(C0966R.string.ej_);
                C87412m.m108593f(string, "context.getString(R.stri…finder_private_ban_share)");
                w3Var.mo83879J1(appCompatActivity2, string);
                if (lVar2 != null) {
                    lVar2.invoke(null);
                }
            }
            String str = f26515b;
            Log.m105924i(str, "shareToConversation, id:" + finderItem.getId() + ", pflag:" + finderItem.getFeedObject().permissionFlag);
            if (finderItem.getFeedObject().privateFlag == 1) {
                C76912y0.m92766e(appCompatActivity2, appCompatActivity2.getString(C0966R.string.ejf), C7898d.f26541a);
                if (lVar2 != null) {
                    lVar2.invoke(null);
                }
            }
            C117407d.INSTANCE.idkeyStat(1278, 11, 1, false);
            if (C11767a.f34453a.mo11659a(FirebaseAnalytics.C113378a.SHARE) && lVar2 != null) {
                lVar2.invoke(null);
            }
            C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(appCompatActivity2).mo75002a(C13442s8.class)).mo12861q3();
            C64682rk1 h = mo9010h(finderItem, false);
            C0001s1 s1Var = C0001s1.f0d;
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C7899e(finderItem, h, z, lVar, i, appCompatActivity, q3, (C15601d<? super C7899e>) null), 2, (Object) null);
        }

        /* renamed from: o */
        public final void mo9016o(AppCompatActivity appCompatActivity, FinderItem finderItem, Bundle bundle, int i, int i2, int i3, C32226l<? super List<String>, C13598b0> lVar) {
            C58784w3 w3Var = C58784w3.f168295a;
            int[] iArr = null;
            if (!w3Var.mo83927f(finderItem.getFeedObject())) {
                String string = appCompatActivity.getString(C0966R.string.ej_);
                C87412m.m108593f(string, "context.getString(R.stri…finder_private_ban_share)");
                w3Var.mo83879J1(appCompatActivity, string);
                if (lVar != null) {
                    lVar.invoke(null);
                    return;
                }
                return;
            }
            String str = f26515b;
            StringBuilder sb = new StringBuilder();
            sb.append("share live（msgType:");
            sb.append(i2);
            sb.append(",msgRetrType:");
            sb.append(i3);
            sb.append(65289);
            sb.append(finderItem.getId());
            sb.append(' ');
            FinderObject feedObject = finderItem.getFeedObject();
            sb.append(feedObject != null ? Integer.valueOf(feedObject.forward_style) : null);
            sb.append(" to conversation,liveId:");
            C64273c21 liveInfo = finderItem.getLiveInfo();
            sb.append(liveInfo != null ? Long.valueOf(liveInfo.f182392d) : null);
            sb.append(",desc:");
            sb.append(finderItem.getDescription());
            sb.append(",liveStatus ");
            C64273c21 liveInfo2 = finderItem.getLiveInfo();
            sb.append(liveInfo2 != null ? Integer.valueOf(liveInfo2.f182394f) : null);
            Log.m105924i(str, sb.toString());
            C68070l.C68072b bVar = new C68070l.C68072b();
            C60151b bVar2 = new C60151b();
            C64623p81 finderLive = finderItem.getFinderLive();
            C87412m.m108594g(finderLive, "<set-?>");
            bVar2.f171698b = finderLive;
            bVar.mo93545f(bVar2);
            bVar.f195582i = i2;
            bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
            bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
            Intent intent = new Intent();
            intent.putExtra("Retr_Msg_Type", i3);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null));
            int i4 = 0;
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", bundle != null ? bundle.getBoolean("Retr_show_success_tips", true) : true);
            intent.putExtra("Select_Conv_Type", bundle != null ? Integer.valueOf(bundle.getInt("Select_Conv_Type")) : null);
            if (bundle != null) {
                iArr = bundle.getIntArray("search_range");
            }
            intent.putExtra("search_range", iArr);
            intent.putExtra("Retr_finder_in_stream", true);
            C64291co3 co32 = (C64291co3) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(appCompatActivity, 14, C64291co3.class);
            if (co32 != null) {
                co32.f182544i = 8;
                co32.f182539d = 2;
                co32.f182547o = (int) (SystemClock.elapsedRealtime() - co32.f182550r);
                co32.f182545j = "0";
                co32.f182546n = "0";
                co32.f182549q = "";
                if (bundle != null) {
                    i4 = bundle.getInt("quick_share_item_count", 0);
                }
                co32.f182543h = i4;
            }
            C62001a.f176265a.mo86878a(appCompatActivity);
            C88144b.m109804v((MMFragmentActivity) appCompatActivity, ".ui.transmit.MsgRetransmitUI", intent, 1005, new C7891f(finderItem, lVar));
        }

        /* renamed from: p */
        public final void mo9017p(AppCompatActivity appCompatActivity, BaseFinderFeed baseFinderFeed, Bundle bundle, int i, int i2) {
            C58784w3 w3Var = C58784w3.f168295a;
            if (!w3Var.mo83936i(baseFinderFeed.mo3513o().getFeedObject())) {
                String string = appCompatActivity.getString(C0966R.string.ej_);
                C87412m.m108593f(string, "context.getString(R.stri…finder_private_ban_share)");
                w3Var.mo83879J1(appCompatActivity, string);
                return;
            }
            String str = f26515b;
            StringBuilder sb = new StringBuilder();
            sb.append("share finderObject snsType:");
            sb.append(i2);
            sb.append(", ");
            sb.append(baseFinderFeed.mo3513o().getId());
            sb.append(' ');
            FinderObject feedObject = baseFinderFeed.mo3513o().getFeedObject();
            Integer num = null;
            sb.append(feedObject != null ? Integer.valueOf(feedObject.forward_style) : null);
            sb.append(" to sns,liveId:");
            C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
            sb.append(liveInfo != null ? Long.valueOf(liveInfo.f182392d) : null);
            sb.append(",desc:");
            sb.append(baseFinderFeed.mo3513o().getDescription());
            sb.append(",liveStatus:");
            C64273c21 liveInfo2 = baseFinderFeed.mo3513o().getLiveInfo();
            if (liveInfo2 != null) {
                num = Integer.valueOf(liveInfo2.f182394f);
            }
            sb.append(num);
            Log.m105924i(str, sb.toString());
            Intent intent = new Intent();
            C54020j jVar = (C54020j) ((C60228r0) C86312j.m106911c(C60228r0.class)).mo84722Yd();
            jVar.mo74689f(baseFinderFeed.mo3513o().getFinderLive());
            intent.putExtra("ksnsupload_finder_live_xml", jVar.mo74685b());
            intent.putExtra("Ksnsupload_type", i2);
            intent.putExtra("need_result", true);
            if ((bundle != null ? bundle.getInt("FinderLiveShareExtraScene") : 0) == 1) {
                intent.putExtra("KSnsPostManu", true);
                intent.putExtra("KTouchCameraTime", Util.nowSecond());
                intent.putExtra("sns_comment_type", 1);
                intent.putExtra("Ksnsupload_type", 0);
                intent.putExtra("is_rabbit2023", true);
                intent.putExtra("is_from_rabbit2023_live", true);
            }
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            C88144b.m109804v((MMFragmentActivity) appCompatActivity, ".plugin.sns.ui.SnsUploadUI", intent, 1006, new C7901g(bundle, appCompatActivity, baseFinderFeed));
        }

        /* renamed from: q */
        public final void mo9018q(MMActivity mMActivity, m74 m74, String str, String str2, String str3, int i) {
            C87412m.m108594g(mMActivity, "context");
            C87412m.m108594g(m74, FirebaseAnalytics.C113379b.LOCATION);
            C87412m.m108594g(str, "poiCategories");
            if (!C11767a.f34453a.mo11659a(FirebaseAnalytics.C113378a.SHARE)) {
                C68070l.C68072b bVar = new C68070l.C68072b();
                C60174h hVar = new C60174h();
                hVar.f171711b = f26514a.mo9007e(m74, str, str2, str3, i);
                bVar.mo93545f(hVar);
                bVar.f195582i = 75;
                bVar.f195479D2 = 2;
                bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
                bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
                Intent intent = new Intent();
                intent.putExtra("Retr_Msg_Type", 28);
                intent.putExtra("Multi_Retr", true);
                intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null));
                intent.putExtra("Retr_go_to_chattingUI", false);
                intent.putExtra("Retr_show_success_tips", true);
                C88144b.m109803u(mMActivity, ".ui.transmit.MsgRetransmitUI", intent, 1001, new C7902h(hVar));
            }
        }

        /* renamed from: r */
        public final void mo9019r(MMActivity mMActivity, m74 m74, String str, String str2, String str3, int i) {
            C87412m.m108594g(mMActivity, "context");
            C87412m.m108594g(m74, FirebaseAnalytics.C113379b.LOCATION);
            C87412m.m108594g(str, "poiCategories");
            if (!C11767a.f34453a.mo11659a(FirebaseAnalytics.C113378a.SHARE)) {
                Intent intent = new Intent();
                C54015d K20 = ((C60228r0) C86312j.m106911c(C60228r0.class)).K20();
                ((C54023m) K20).f151292a = f26514a.mo9007e(m74, str, str2, str3, i);
                intent.putExtra("ksnsupload_finder_poi_xml", ((C54023m) K20).mo74685b());
                intent.putExtra("Ksnsupload_type", 29);
                intent.putExtra("need_result", true);
                C88144b.m109803u(mMActivity, ".plugin.sns.ui.SnsUploadUI", intent, 1002, new C7892i(mMActivity));
            }
        }

        /* renamed from: s */
        public final void mo9020s(AppCompatActivity appCompatActivity, FinderItem finderItem, Bundle bundle, int i, C32226l<? super List<String>, C13598b0> lVar) {
            C87412m.m108594g(appCompatActivity, "context");
            C87412m.m108594g(finderItem, "feedObject");
            if (finderItem.getMediaType() != 9) {
                mo9015m(appCompatActivity, finderItem, bundle, i, false, (C32226l<? super C60166f, C13598b0>) null);
            } else if (((C60606n) C86312j.m106911c(C60606n.class)).mo85008I1(finderItem.getLiveInfo()) || ((C61397g) C86312j.m106911c(C61397g.class)).Da0(finderItem.getLiveInfo())) {
                mo9016o(appCompatActivity, finderItem, bundle, i, 88, 31, lVar);
            } else {
                mo9016o(appCompatActivity, finderItem, bundle, i, 63, 23, lVar);
            }
        }

        /* renamed from: u */
        public final void mo9021u(FinderItem finderItem) {
            String str;
            C87412m.m108594g(finderItem, "feedObject");
            LinkedList linkedList = new LinkedList();
            db4 db4 = new db4();
            db4.f182676d = finderItem.getId();
            db4.f182680h = finderItem.getObjectNonceId();
            C64441i93 i932 = new C64441i93();
            i932.f183653h = 1;
            i932.f183656n = 1;
            db4.f182679g = i932;
            FinderObject feedObject = finderItem.getFeedObject();
            if (feedObject == null || (str = feedObject.sessionBuffer) == null) {
                str = "";
            }
            db4.f182684o = str;
            db4.f182681i = finderItem.getUserName();
            db4.f182686q = 65;
            C64273c21 liveInfo = finderItem.getLiveInfo();
            db4.f182695z = liveInfo != null ? liveInfo.f182392d : 0;
            linkedList.add(db4);
            C49712hj1 hj12 = new C49712hj1();
            hj12.f134675i = 65;
            new C46525m1(linkedList, hj12).mo9225i().mo123419C(new C7911w2(linkedList));
        }

        /* renamed from: v */
        public final void mo9022v(AppCompatActivity appCompatActivity, BaseFinderFeed baseFinderFeed, Bundle bundle, int i, int i2) {
            AppCompatActivity appCompatActivity2 = appCompatActivity;
            BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
            int i3 = i;
            C87412m.m108594g(appCompatActivity, "context");
            C87412m.m108594g(baseFinderFeed, "feed");
            if (baseFinderFeed.mo3513o().getMediaType() != 9) {
                MMFragmentActivity mMFragmentActivity = (MMFragmentActivity) appCompatActivity2;
                C58784w3 w3Var = C58784w3.f168295a;
                if (!w3Var.mo83936i(baseFinderFeed.mo3513o().getFeedObject())) {
                    String string = mMFragmentActivity.getString(C0966R.string.ej_);
                    C87412m.m108593f(string, "context.getString(R.stri…finder_private_ban_share)");
                    w3Var.mo83879J1(mMFragmentActivity, string);
                } else if (baseFinderFeed.mo3513o().isPrivate()) {
                    C76912y0.m92766e(mMFragmentActivity, mMFragmentActivity.getString(C0966R.string.ejf), C58703c3.f168043a);
                } else {
                    C117407d.INSTANCE.idkeyStat(1278, 12, 1, false);
                    if (!C11767a.f34453a.mo11659a(FirebaseAnalytics.C113378a.SHARE)) {
                        String str = f26515b;
                        StringBuilder sb = new StringBuilder();
                        sb.append("share finderObject ");
                        sb.append(baseFinderFeed.mo3513o().getId());
                        sb.append(' ');
                        FinderObject feedObject = baseFinderFeed.mo3513o().getFeedObject();
                        sb.append(feedObject != null ? Integer.valueOf(feedObject.forward_style) : null);
                        sb.append(" to sns, pflag:");
                        sb.append(baseFinderFeed.mo3513o().getFeedObject().permissionFlag);
                        Log.m105924i(str, sb.toString());
                        C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(mMFragmentActivity).mo75002a(C13442s8.class)).mo12861q3();
                        Intent intent = new Intent();
                        C54022l lVar = (C54022l) ((C60228r0) C86312j.m106911c(C60228r0.class)).mo84725mE();
                        lVar.f151291a = mo9010h(baseFinderFeed.mo3513o(), true);
                        intent.putExtra("ksnsupload_finder_object_xml", lVar.mo74685b());
                        intent.putExtra("Ksnsupload_type", 17);
                        intent.putExtra("need_result", true);
                        intent.putExtra("finder_post_from_sns_type", i2);
                        if (i3 == 5) {
                            intent.putExtra("finder_feed_id", baseFinderFeed.mo3513o().getId());
                            intent.putExtra("ksnsupload_finder_need_report", true);
                            q3.f134670d = C58380k1.f167277b;
                        }
                        intent.putExtra("sns_upload_is_show_dialog", true);
                        C88144b.m109804v(mMFragmentActivity, ".plugin.sns.ui.SnsUploadUI", intent, 1002, new C7791d3(mMFragmentActivity, baseFinderFeed, i3, q3));
                        return;
                    }
                }
            } else if (((C60606n) C86312j.m106911c(C60606n.class)).mo85008I1(baseFinderFeed.mo3513o().getLiveInfo()) || ((C61397g) C86312j.m106911c(C61397g.class)).Da0(baseFinderFeed.mo3513o().getLiveInfo())) {
                mo9017p(appCompatActivity, baseFinderFeed, bundle, i, 30);
            } else {
                mo9017p(appCompatActivity, baseFinderFeed, bundle, i, 21);
            }
        }

        /* renamed from: x */
        public final void mo9023x(AppCompatActivity appCompatActivity, BaseFinderFeed baseFinderFeed, Bundle bundle, int i) {
            String str;
            String str2;
            String str3;
            Class cls = C66708h.class;
            C87412m.m108594g(appCompatActivity, "context");
            C87412m.m108594g(baseFinderFeed, "feed");
            String str4 = null;
            if (baseFinderFeed.mo3513o().getMediaType() == 9) {
                C58784w3 w3Var = C58784w3.f168295a;
                if (!w3Var.mo83927f(baseFinderFeed.mo3513o().getFeedObject()) || !w3Var.mo83936i(baseFinderFeed.mo3513o().getFeedObject())) {
                    String string = appCompatActivity.getString(C0966R.string.ej_);
                    C87412m.m108593f(string, "context.getString(R.stri…finder_private_ban_share)");
                    w3Var.mo83879J1(appCompatActivity, string);
                } else {
                    String str5 = f26515b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("share finderObject ");
                    sb.append(baseFinderFeed.mo3513o().getId());
                    sb.append(' ');
                    FinderObject feedObject = baseFinderFeed.mo3513o().getFeedObject();
                    sb.append(feedObject != null ? Integer.valueOf(feedObject.forward_style) : null);
                    sb.append(" to status,liveId:");
                    C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
                    sb.append(liveInfo != null ? Long.valueOf(liveInfo.f182392d) : null);
                    sb.append(",desc:");
                    sb.append(baseFinderFeed.mo3513o().getDescription());
                    sb.append(",liveStatus:");
                    C64273c21 liveInfo2 = baseFinderFeed.mo3513o().getLiveInfo();
                    sb.append(liveInfo2 != null ? Integer.valueOf(liveInfo2.f182394f) : null);
                    Log.m105924i(str5, sb.toString());
                    C54020j jVar = (C54020j) ((C60228r0) C86312j.m106911c(C60228r0.class)).mo84722Yd();
                    jVar.mo74689f(baseFinderFeed.mo3513o().getFinderLive());
                    if (bundle != null) {
                        str4 = bundle.getString("FINDER_LIVE_SHARE_KEY_STATUS_VERIFY");
                    }
                    ArrayList arrayList = new ArrayList();
                    C65488a0 a0Var = new C65488a0();
                    a0Var.f188439d = "2";
                    a0Var.f188441f = jVar.mo74685b();
                    arrayList.add(a0Var);
                    C77459z.C63350a aVar = new C77459z.C63350a();
                    String str6 = baseFinderFeed.mo3513o().getFeedObject().wx_status_icon_id;
                    if (str6 == null || str6.length() == 0) {
                        aVar.mo88254a("1020");
                    } else {
                        aVar.mo88254a(baseFinderFeed.mo3513o().getFeedObject().wx_status_icon_id);
                    }
                    aVar.mo88259f(appCompatActivity.getResources().getString(C0966R.string.dma, new Object[]{jVar.mo74686c().f184781g}));
                    aVar.mo88258e("live_player@inner");
                    String str7 = jVar.mo74686c().f184778d;
                    if (str7 == null) {
                        str7 = "";
                    }
                    aVar.mo88256c(str7);
                    aVar.mo88260g(str4);
                    aVar.mo88255b(arrayList);
                    ((C66708h) C86312j.m106911c(cls)).mo90743iL(appCompatActivity, 1008, aVar.f179715a);
                }
            } else {
                C58784w3 w3Var2 = C58784w3.f168295a;
                if (!w3Var2.mo83927f(baseFinderFeed.mo3513o().getFeedObject()) || !w3Var2.mo83936i(baseFinderFeed.mo3513o().getFeedObject())) {
                    String string2 = appCompatActivity.getString(C0966R.string.ej_);
                    C87412m.m108593f(string2, "context.getString(R.stri…finder_private_ban_share)");
                    w3Var2.mo83879J1(appCompatActivity, string2);
                } else {
                    String str8 = f26515b;
                    Log.m105924i(str8, "[shareFeedToStatusInternal] feedid=" + C61926c.m72691p(baseFinderFeed.getItemId()) + " desc=" + baseFinderFeed.mo3513o().getDescription());
                    FinderContact finderContact = baseFinderFeed.mo3513o().getFeedObject().contact;
                    C64284cg a = finderContact != null ? C58960c.m68829a(finderContact, true) : null;
                    if (a == null || (str = a.f182469e) == null) {
                        str = baseFinderFeed.mo3513o().getNickName();
                    }
                    String str9 = str;
                    if (a == null || (str3 = a.f182470f) == null) {
                        C58969q l = baseFinderFeed.mo3507l();
                        if (l != null) {
                            str4 = l.getAvatarUrl();
                        }
                        str2 = str4;
                    } else {
                        str2 = str3;
                    }
                    ((C66708h) C86312j.m106911c(cls)).L20(appCompatActivity, mo9009g(str9, str2, baseFinderFeed.getItemId(), baseFinderFeed.mo3513o().getFeedObject()));
                }
            }
            C13442s8 f = C13442s8.f38060Q0.mo12873f(appCompatActivity);
            if (f != null) {
                C7450q.f25643a.mo8594b(f.mo12861q3(), baseFinderFeed, 46);
            }
        }

        /* renamed from: z */
        public final void mo9024z(AppCompatActivity appCompatActivity, FinderItem finderItem) {
            C68070l.C68072b bVar;
            C87412m.m108594g(appCompatActivity, "context");
            C87412m.m108594g(finderItem, "feedObject");
            String str = f26515b;
            Log.m105924i(str, "shareToWeWork, mediaType " + finderItem.getMediaType());
            C58784w3 w3Var = C58784w3.f168295a;
            if (!w3Var.mo83927f(finderItem.getFeedObject())) {
                String string = appCompatActivity.getString(C0966R.string.ej_);
                C87412m.m108593f(string, "context.getString(R.stri…finder_private_ban_share)");
                w3Var.mo83879J1(appCompatActivity, string);
                return;
            }
            if (finderItem.getMediaType() == 9) {
                bVar = new C68070l.C68072b();
                C60151b bVar2 = new C60151b();
                C64623p81 finderLive = finderItem.getFinderLive();
                C87412m.m108594g(finderLive, "<set-?>");
                bVar2.f171698b = finderLive;
                bVar.mo93545f(bVar2);
                bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
                bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
                bVar.f195582i = 63;
                if (((C60606n) C86312j.m106911c(C60606n.class)).mo85008I1(finderItem.getLiveInfo()) || ((C61397g) C86312j.m106911c(C61397g.class)).Da0(finderItem.getLiveInfo())) {
                    bVar.f195582i = 88;
                }
            } else {
                bVar = mo9008f(mo9010h(finderItem, false));
            }
            Log.m105924i(str, "shareToWeWork, id:" + finderItem.getId() + ", pflag:" + finderItem.getFeedObject().permissionFlag);
            if (finderItem.getFeedObject().privateFlag == 1) {
                C76912y0.m92766e(appCompatActivity, appCompatActivity.getString(C0966R.string.ejf), C7893j.f26523a);
            } else if (!C11767a.f34453a.mo11659a(FirebaseAnalytics.C113378a.SHARE)) {
                C8479f0 f0Var = new C8479f0();
                f0Var.f27484d = C9247b.C9248a.m8889a(C9247b.f28989d, appCompatActivity, appCompatActivity.getString(C0966R.string.a4d), 0, (DialogInterface.OnCancelListener) null, 12, (Object) null);
                C50297lq1 lq12 = new C50297lq1();
                StringBuilder sb = new StringBuilder();
                sb.append(C86709a0.m107523b().mo121110g());
                sb.append('_');
                sb.append(finderItem.getId());
                sb.append('_');
                sb.append(C31543z5.m39453c());
                lq12.f137584d = sb.toString();
                lq12.f137585e = 49;
                String s = C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
                C87412m.m108593f(s, "makeLocalContent(appMsg, null, null)");
                byte[] bytes = s.getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                lq12.f137586f = new C89349b(bytes, 0, bytes.length);
                ((C9247b) f0Var.f27484d).begin();
                C7250m.m7431a().wi0(appCompatActivity, C26236u.m33719b(lq12), new C7903k(appCompatActivity, f0Var));
            }
        }
    }
}
