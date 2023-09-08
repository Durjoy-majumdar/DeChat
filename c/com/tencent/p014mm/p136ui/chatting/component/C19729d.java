package com.tencent.p014mm.p136ui.chatting.component;

import android.os.Looper;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.autogen.mmdata.rpt.AppMsgWxaExposeClickStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C6807n4;
import com.tencent.p014mm.plugin.msgquote.model.MsgQuoteItem;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import g62.C75875l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kb0.C76528a;
import p206nj.C117627q;
import p270xi.C91212b;
import p740wo.C53193b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import z04.C112550d0;
import zj3.C66869c;

@C91212b(exportInterface = C66869c.class)
/* renamed from: com.tencent.mm.ui.chatting.component.d */
public final class C19729d extends C73412a implements C66869c, C75875l.C75877b {

    /* renamed from: e */
    public final String f56101e = ("MicroMsg.AppMsgWxaReportComponent#" + hashCode());

    /* renamed from: f */
    public final C13601g f56102f = C36568h.m40986b(C13602i.NONE, new C6777c(this));

    /* renamed from: g */
    public String f56103g = "";

    /* renamed from: h */
    public C19730a.C19738h f56104h;

    /* renamed from: i */
    public LongSparseArray<C19730a.C19741k> f56105i;

    /* renamed from: j */
    public SparseArray<C72963f4> f56106j;

    /* renamed from: n */
    public LongSparseArray<C19730a.C19735e> f56107n;

    /* renamed from: o */
    public LongSparseArray<C19730a.C19737g> f56108o;

    /* renamed from: p */
    public C19730a.C19739i f56109p;

    /* renamed from: q */
    public C19730a.C19739i f56110q;

    /* renamed from: com.tencent.mm.ui.chatting.component.d$c */
    public static final class C6777c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C19729d f24320d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6777c(C19729d dVar) {
            super(0);
            this.f24320d = dVar;
        }

        public Object invoke() {
            boolean z = BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger();
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            if (hVar != null) {
                z = hVar.mo58784wf(C32735h.C32737c.clicfg_android_enable_app_msg_wxa_expose_period_stat, z);
            }
            Boolean valueOf = Boolean.valueOf(z);
            C19729d dVar = this.f24320d;
            boolean booleanValue = valueOf.booleanValue();
            String str = dVar.f56101e;
            Log.m105924i(str, "isExposePeriodStatEnabled: " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.d$a */
    public static final class C19730a {

        /* renamed from: com.tencent.mm.ui.chatting.component.d$a$a */
        public static final class C19731a {

            /* renamed from: a */
            public final C72963f4 f56111a;

            /* renamed from: b */
            public final C19733c f56112b;

            /* renamed from: c */
            public final C72963f4 f56113c;

            /* renamed from: d */
            public C19734d f56114d;

            public C19731a(C72963f4 f4Var, C19733c cVar, C72963f4 f4Var2, C19734d dVar, int i, C8480h hVar) {
                dVar = (i & 8) != 0 ? null : dVar;
                C87412m.m108594g(f4Var, "msgInfo");
                C87412m.m108594g(cVar, "wxaType");
                C87412m.m108594g(f4Var2, "wxaMsgInfo");
                this.f56111a = f4Var;
                this.f56112b = cVar;
                this.f56113c = f4Var2;
                this.f56114d = dVar;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.d$a$b */
        public static final class C19732b {

            /* renamed from: a */
            public final long f56115a;

            /* renamed from: b */
            public final long f56116b;

            /* renamed from: c */
            public final int f56117c;

            /* renamed from: d */
            public final String f56118d;

            /* renamed from: e */
            public final String f56119e;

            /* renamed from: f */
            public final String f56120f;

            /* renamed from: g */
            public final String f56121g;

            /* renamed from: h */
            public final int f56122h;

            /* renamed from: i */
            public long f56123i;

            /* renamed from: j */
            public long f56124j = -1;

            /* renamed from: k */
            public boolean f56125k;

            /* renamed from: l */
            public boolean f56126l;

            /* renamed from: m */
            public boolean f56127m;

            /* renamed from: n */
            public boolean f56128n;

            /* renamed from: o */
            public boolean f56129o;

            public C19732b(long j, long j2, int i, String str, String str2, String str3, String str4, int i2) {
                C87412m.m108594g(str, "wxaMsgSenderUsername");
                C87412m.m108594g(str2, "appId");
                C87412m.m108594g(str3, "username");
                C87412m.m108594g(str4, "enterPath");
                this.f56115a = j;
                this.f56116b = j2;
                this.f56117c = i;
                this.f56118d = str;
                this.f56119e = str2;
                this.f56120f = str3;
                this.f56121g = str4;
                this.f56122h = i2;
            }

            /* renamed from: a */
            public final long mo26200a() {
                if (0 < this.f56124j) {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f56123i += currentTimeMillis - this.f56124j;
                    this.f56124j = currentTimeMillis;
                }
                return this.f56123i;
            }

            /* renamed from: b */
            public final void mo26201b(Long l) {
                Log.m105924i("MicroMsg.AppMsgWxaReportComponent", "markEndExpose, msgId: " + this.f56115a);
                if (!this.f56127m) {
                    if (0 < this.f56124j) {
                        this.f56123i += (l != null ? l.longValue() : System.currentTimeMillis()) - this.f56124j;
                        this.f56124j = -1;
                        return;
                    }
                }
                Log.m105924i("MicroMsg.AppMsgWxaReportComponent", "markEndExpose, already revoked or has not exposed");
            }

            /* renamed from: c */
            public final void mo26202c(Long l) {
                Log.m105924i("MicroMsg.AppMsgWxaReportComponent", "markStartExpose, msgId: " + this.f56115a);
                if (!this.f56127m) {
                    if (!(0 < this.f56124j)) {
                        this.f56124j = l != null ? l.longValue() : System.currentTimeMillis();
                        return;
                    }
                }
                Log.m105924i("MicroMsg.AppMsgWxaReportComponent", "markStartExpose, already revoked or exposed");
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C19732b)) {
                    return false;
                }
                C19732b bVar = (C19732b) obj;
                return this.f56115a == bVar.f56115a && this.f56116b == bVar.f56116b && this.f56117c == bVar.f56117c && C87412m.m108589b(this.f56118d, bVar.f56118d) && C87412m.m108589b(this.f56119e, bVar.f56119e) && C87412m.m108589b(this.f56120f, bVar.f56120f) && C87412m.m108589b(this.f56121g, bVar.f56121g) && this.f56122h == bVar.f56122h;
            }

            public int hashCode() {
                long j = this.f56115a;
                long j2 = this.f56116b;
                return (((((((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f56117c) * 31) + this.f56118d.hashCode()) * 31) + this.f56119e.hashCode()) * 31) + this.f56120f.hashCode()) * 31) + this.f56121g.hashCode()) * 31) + this.f56122h;
            }

            public String toString() {
                return "AppMsgWxaStatInfo(msgId=" + this.f56115a + ", wxaMsgId=" + this.f56116b + ", wxaMsgType=" + this.f56117c + ", wxaMsgSenderUsername='" + this.f56118d + "', appId='" + this.f56119e + "', username='" + this.f56120f + "', enterPath='" + this.f56121g + "', scene=" + this.f56122h + ", exposeTimePeriod=" + mo26200a() + ')';
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.d$a$c */
        public enum C19733c {
            Update(1007, 1008),
            Dynamic(1007, 1008),
            Finder(1208, 1208),
            OpenSdk(1036, 1036),
            WithShareTicket(1044, 1044),
            Normal(1007, 1008),
            Profile(1000, 1000);
            

            /* renamed from: d */
            public final int f56138d;

            /* renamed from: e */
            public final int f56139e;

            /* access modifiers changed from: public */
            C19733c(int i, int i2) {
                this.f56138d = i;
                this.f56139e = i2;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.d$a$d */
        public static final class C19734d implements View.OnAttachStateChangeListener {

            /* renamed from: d */
            public final C19741k f56140d;

            /* renamed from: e */
            public final String f56141e;

            public C19734d(C19741k kVar) {
                C87412m.m108594g(kVar, "statefulStatInfo");
                this.f56140d = kVar;
                this.f56141e = "AppMsgWxaViewAttachStateChangeListener#" + kVar.f56157a.f56115a;
            }

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                this.f56140d.f56157a.mo26201b((Long) null);
            }

            public String toString() {
                return this.f56141e;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.d$a$e */
        public static final class C19735e {

            /* renamed from: a */
            public final C68070l.C68072b f56142a;

            public C19735e(C68070l.C68072b bVar) {
                this.f56142a = bVar;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.d$a$f */
        public static final class C19736f {

            /* renamed from: a */
            public final C72963f4 f56143a;

            public C19736f(C72963f4 f4Var) {
                this.f56143a = f4Var;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.d$a$g */
        public static final class C19737g {

            /* renamed from: a */
            public final C19731a f56144a;

            public C19737g(C19731a aVar) {
                this.f56144a = aVar;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.d$a$h */
        public static final class C19738h {

            /* renamed from: a */
            public final String f56145a;

            /* renamed from: b */
            public final String f56146b;

            /* renamed from: c */
            public final int f56147c;

            /* renamed from: d */
            public final int f56148d;

            /* renamed from: e */
            public final long f56149e = System.currentTimeMillis();

            /* renamed from: f */
            public long f56150f = -1;

            public C19738h(String str, String str2, int i, int i2) {
                C87412m.m108594g(str, "sessionId");
                C87412m.m108594g(str2, "chatName");
                this.f56145a = str;
                this.f56146b = str2;
                this.f56147c = i;
                this.f56148d = i2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C19738h)) {
                    return false;
                }
                C19738h hVar = (C19738h) obj;
                return C87412m.m108589b(this.f56145a, hVar.f56145a) && C87412m.m108589b(this.f56146b, hVar.f56146b) && this.f56147c == hVar.f56147c && this.f56148d == hVar.f56148d;
            }

            public int hashCode() {
                return (((((this.f56145a.hashCode() * 31) + this.f56146b.hashCode()) * 31) + this.f56147c) * 31) + this.f56148d;
            }

            public String toString() {
                return "ChattingStatInfo(sessionId='" + this.f56145a + "', chatName='" + this.f56146b + "', chatType=" + this.f56147c + ", chatRoomUserCountOnEnter=" + this.f56148d + ", enterTime=" + this.f56149e + ", exitTime=" + this.f56150f + ')';
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.d$a$i */
        public static final class C19739i {

            /* renamed from: a */
            public long[] f56151a;

            /* renamed from: b */
            public int f56152b;

            public C19739i(int i) {
                this.f56151a = new long[i];
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(hashCode());
                sb.append('#');
                long[] copyOf = Arrays.copyOf(this.f56151a, this.f56152b);
                C87412m.m108593f(copyOf, "copyOf(this, newSize)");
                String arrays = Arrays.toString(copyOf);
                C87412m.m108593f(arrays, "toString(this)");
                sb.append(arrays);
                return sb.toString();
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.d$a$j */
        public static abstract class C19740j {

            /* renamed from: a */
            public final int f56153a;

            /* renamed from: b */
            public final String f56154b;

            /* renamed from: c */
            public C19736f f56155c;

            /* renamed from: d */
            public C19735e f56156d;

            public C19740j(int i, String str) {
                C87412m.m108594g(str, "talker");
                this.f56153a = i;
                this.f56154b = str;
            }

            /* renamed from: a */
            public abstract C68070l.C68072b mo26213a();

            /* renamed from: b */
            public final C72963f4 mo26214b() {
                C19736f fVar = this.f56155c;
                if (fVar != null) {
                    return fVar.f56143a;
                }
                C72963f4 c = mo26215c();
                this.f56155c = new C19736f(c);
                return c;
            }

            /* renamed from: c */
            public abstract C72963f4 mo26215c();
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.d$a$k */
        public static final class C19741k {

            /* renamed from: a */
            public final C19732b f56157a;

            /* renamed from: b */
            public boolean f56158b;

            public C19741k(C19732b bVar) {
                C87412m.m108594g(bVar, "statInfo");
                this.f56157a = bVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C19741k) && C87412m.m108589b(this.f56157a, ((C19741k) obj).f56157a);
            }

            public int hashCode() {
                return this.f56157a.hashCode();
            }

            public String toString() {
                return "StatefulAppMsgWxaStatInfo(statInfo=" + this.f56157a + ')';
            }
        }

        public C19730a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.d$b */
    public static final class C19742b {

        /* renamed from: a */
        public final String f56159a;

        /* renamed from: b */
        public final String f56160b;

        public C19742b(String str, String str2) {
            this.f56159a = str;
            this.f56160b = str2;
        }
    }

    static {
        new C19730a((C8480h) null);
    }

    /* renamed from: b */
    public static final void m21409b(C67391b bVar, C72963f4 f4Var, boolean z) {
        Class cls = C66869c.class;
        if (bVar != null && f4Var != null) {
            if (z) {
                C66869c cVar = (C66869c) bVar.f193278b.mo102812a(cls);
                if (cVar != null) {
                    cVar.mo26195d0(f4Var);
                    return;
                }
                return;
            }
            C66869c cVar2 = (C66869c) bVar.f193278b.mo102812a(cls);
            if (cVar2 != null) {
                cVar2.mo26192a(f4Var);
            }
        }
    }

    /* renamed from: g6 */
    public static final void m21410g6(C67391b bVar, View view, C72963f4 f4Var) {
        if (bVar != null && view != null && f4Var != null) {
            C66869c cVar = (C66869c) bVar.f193278b.mo102812a(C66869c.class);
            if (cVar != null) {
                cVar.mo26187U2(bVar, view, f4Var);
            }
        }
    }

    /* renamed from: h6 */
    public static final void m21411h6(C67391b bVar, View view, C72963f4 f4Var) {
        if (bVar != null && view != null && f4Var != null) {
            C66869c cVar = (C66869c) bVar.f193278b.mo102812a(C66869c.class);
            if (cVar != null) {
                cVar.mo26188V0(bVar, view, f4Var);
            }
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        LongSparseArray<C19730a.C19741k> longSparseArray = this.f56105i;
        if (longSparseArray != null) {
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                longSparseArray.keyAt(i);
                C19730a.C19732b bVar = longSparseArray.valueAt(i).f56157a;
                bVar.getClass();
                Log.m105924i("MicroMsg.AppMsgWxaReportComponent", "markForeground, msgId: " + bVar.f56115a);
                if (bVar.f56127m) {
                    Log.m105924i("MicroMsg.AppMsgWxaReportComponent", "markForeground, already revoked");
                } else if (bVar.f56125k) {
                    bVar.f56125k = false;
                    bVar.mo26202c((Long) null);
                }
            }
        }
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        LongSparseArray<C19730a.C19741k> longSparseArray = this.f56105i;
        if (longSparseArray != null) {
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                longSparseArray.keyAt(i);
                C19730a.C19732b bVar = longSparseArray.valueAt(i).f56157a;
                bVar.getClass();
                Log.m105924i("MicroMsg.AppMsgWxaReportComponent", "markBackground, msgId: " + bVar.f56115a);
                if (bVar.f56127m) {
                    Log.m105924i("MicroMsg.AppMsgWxaReportComponent", "markBackground, already revoked");
                } else {
                    if (0 < bVar.f56124j) {
                        bVar.mo26201b((Long) null);
                        bVar.f56125k = true;
                    }
                }
            }
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        C75700k0 k0Var;
        C75875l LE;
        if (!(!mo26191Z5() || (k0Var = (C75700k0) C86709a0.m107533q(C75700k0.class)) == null || (LE = k0Var.mo96095LE()) == null)) {
            ((C72972g4) LE).mo101137qq(this, Looper.getMainLooper());
        }
        String str = this.f56103g;
        C67391b bVar = this.f215752d;
        String str2 = null;
        String r = bVar != null ? bVar.mo91577r() : null;
        String str3 = "";
        if (r == null) {
            r = str3;
        }
        String str4 = this.f56101e;
        Log.m105924i(str4, "cleanStatInfoOnEnter, theLastTalker: " + str + ", theTalker: " + r);
        if (!C87412m.m108589b(str, r)) {
            LongSparseArray<C19730a.C19741k> longSparseArray = this.f56105i;
            if (longSparseArray != null) {
                longSparseArray.clear();
            }
            this.f56105i = null;
            SparseArray<C72963f4> sparseArray = this.f56106j;
            if (sparseArray != null) {
                sparseArray.clear();
            }
            this.f56106j = null;
            LongSparseArray<C19730a.C19735e> longSparseArray2 = this.f56107n;
            if (longSparseArray2 != null) {
                longSparseArray2.clear();
            }
            this.f56107n = null;
            LongSparseArray<C19730a.C19737g> longSparseArray3 = this.f56108o;
            if (longSparseArray3 != null) {
                longSparseArray3.clear();
            }
            this.f56108o = null;
        } else {
            LongSparseArray<C19730a.C19741k> longSparseArray4 = this.f56105i;
            if (longSparseArray4 != null) {
                int size = longSparseArray4.size();
                for (int i = 0; i < size; i++) {
                    longSparseArray4.keyAt(i);
                    longSparseArray4.valueAt(i).f56158b = false;
                }
            }
        }
        C67391b bVar2 = this.f215752d;
        String str5 = bVar2 != null ? bVar2.f193291o : null;
        if (str5 == null) {
            str5 = str3;
        }
        if (bVar2 != null) {
            str2 = bVar2.mo91577r();
        }
        if (str2 != null) {
            str3 = str2;
        }
        int a = C76528a.m92004a(str3);
        this.f56104h = C72996z1.m85820U5(str3) ? new C19730a.C19738h(str5, str3, a, ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(str3)) : new C19730a.C19738h(str5, str3, a, -1);
    }

    /* renamed from: U2 */
    public void mo26187U2(C67391b bVar, View view, C72963f4 f4Var) {
        C87412m.m108594g(bVar, "chattingContext");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(f4Var, "msg");
        String str = this.f56101e;
        Log.m105924i(str, "onAppMsgWxaViewClick, msgInfo: " + mo26197e6(f4Var));
        LongSparseArray<C19730a.C19741k> longSparseArray = this.f56105i;
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
            this.f56105i = longSparseArray;
        }
        C19730a.C19741k kVar = longSparseArray.get(f4Var.mo108774y2());
        if (kVar == null) {
            Log.m105924i(this.f56101e, "onAppMsgWxaViewClick, appMsgWxaStatInfo is null");
            return;
        }
        boolean z = kVar.f56158b;
        kVar.f56158b = true;
        if (!z) {
            String str2 = this.f56101e;
            Log.m105924i(str2, "doClickReport, msgId: " + kVar.f56157a.f56116b);
            C19730a.C19738h hVar = this.f56104h;
            if (hVar != null) {
                if (!(hVar.f56146b.length() == 0)) {
                    C19730a.C19732b bVar2 = kVar.f56157a;
                    AppMsgWxaExposeClickStruct appMsgWxaExposeClickStruct = new AppMsgWxaExposeClickStruct();
                    appMsgWxaExposeClickStruct.f48165d = 1;
                    appMsgWxaExposeClickStruct.f48166e = hVar.f56147c;
                    appMsgWxaExposeClickStruct.f48167f = appMsgWxaExposeClickStruct.mo86045b("ChatName", mo26198f6(hVar.f56146b), true);
                    appMsgWxaExposeClickStruct.f48168g = hVar.f56148d;
                    appMsgWxaExposeClickStruct.f48169h = appMsgWxaExposeClickStruct.mo86045b("SessionId", mo26198f6(hVar.f56145a), true);
                    appMsgWxaExposeClickStruct.f48170i = bVar2.f56115a;
                    appMsgWxaExposeClickStruct.f48171j = bVar2.f56116b;
                    appMsgWxaExposeClickStruct.f48172k = bVar2.f56117c;
                    appMsgWxaExposeClickStruct.f48173l = appMsgWxaExposeClickStruct.mo86045b("SenderUsername", mo26198f6(bVar2.f56118d), true);
                    appMsgWxaExposeClickStruct.f48174m = appMsgWxaExposeClickStruct.mo86045b("AppId", mo26198f6(bVar2.f56119e), true);
                    appMsgWxaExposeClickStruct.f48175n = appMsgWxaExposeClickStruct.mo86045b("Username", mo26198f6(bVar2.f56120f), true);
                    appMsgWxaExposeClickStruct.f48176o = appMsgWxaExposeClickStruct.mo86045b("EnterPath", mo26198f6(bVar2.f56121g), true);
                    appMsgWxaExposeClickStruct.f48177p = bVar2.f56122h;
                    appMsgWxaExposeClickStruct.f48178q = bVar2.mo26200a();
                    appMsgWxaExposeClickStruct.f48179r = bVar2.f56128n ? 1 : 0;
                    appMsgWxaExposeClickStruct.f48164F0 = bVar2.f56129o ? 1 : 0;
                    appMsgWxaExposeClickStruct.mo86054n();
                    return;
                }
            }
            Log.m105924i(this.f56101e, "doClickReport, filter invalid statInfo");
        }
    }

    /* renamed from: V0 */
    public void mo26188V0(C67391b bVar, View view, C72963f4 f4Var) {
        C19730a.C19741k Y5;
        C13598b0 b0Var;
        C19730a.C19732b bVar2;
        C19730a.C19741k Y52;
        C19730a.C19732b bVar3;
        C87412m.m108594g(bVar, "chattingContext");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(f4Var, "msg");
        if (!(view instanceof C6807n4)) {
            Log.m105928w(this.f56101e, "maybeAppMsgWxaViewExpose, view: " + view + ", why?");
            return;
        }
        boolean z = true;
        if (!mo26191Z5()) {
            C19730a.C19731a c6 = mo26194c6(f4Var);
            if (c6 != null && (Y52 = mo26190Y5(c6)) != null && (bVar3 = Y52.f56157a) != null) {
                Log.m105924i("MicroMsg.AppMsgWxaReportComponent", "markExpose, msgId: " + bVar3.f56115a);
                bVar3.f56126l = true;
                C13598b0 b0Var2 = C13598b0.f38549a;
                return;
            }
            return;
        }
        C6807n4 n4Var = (C6807n4) view;
        SparseArray<C72963f4> sparseArray = this.f56106j;
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            this.f56106j = sparseArray;
        }
        C72963f4 f4Var2 = sparseArray.get(n4Var.hashCode());
        if (f4Var2 == null || f4Var.mo108774y2() != f4Var2.mo108774y2()) {
            z = false;
        }
        if (z) {
            Log.m105924i(this.f56101e, "maybeAppMsgWxaViewExpose, msg is the same as originMsg, why?");
            return;
        }
        if (f4Var2 != null) {
            LongSparseArray<C19730a.C19741k> longSparseArray = this.f56105i;
            if (longSparseArray == null) {
                longSparseArray = new LongSparseArray<>();
                this.f56105i = longSparseArray;
            }
            C19730a.C19741k kVar = longSparseArray.get(f4Var2.mo108774y2());
            if (kVar == null || (bVar2 = kVar.f56157a) == null) {
                b0Var = null;
            } else {
                bVar2.mo26201b((Long) null);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105928w(this.f56101e, "maybeAppMsgWxaViewExpose, originMsg is not AppMsgWxa, originMsg: " + mo26197e6(f4Var2) + ", why?");
            }
            C19730a.C19731a c64 = mo26194c6(f4Var2);
            if (c64 != null) {
                C19730a.C19734d dVar = c64.f56114d;
                if (dVar != null) {
                    view.removeOnAttachStateChangeListener(dVar);
                }
                c64.f56114d = null;
            }
        }
        C19730a.C19731a c65 = mo26194c6(f4Var);
        if (c65 != null && (Y5 = mo26190Y5(c65)) != null) {
            SparseArray<C72963f4> sparseArray2 = this.f56106j;
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray<>();
                this.f56106j = sparseArray2;
            }
            sparseArray2.put(n4Var.hashCode(), f4Var);
            C19730a.C19734d dVar2 = new C19730a.C19734d(Y5);
            c65.f56114d = dVar2;
            view.addOnAttachStateChangeListener(dVar2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0152  */
    /* renamed from: W5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26189W5(android.view.View r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r18.mo26191Z5()
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            if (r1 > 0) goto L_0x000e
            return
        L_0x000e:
            android.util.LongSparseArray<com.tencent.mm.ui.chatting.component.d$a$k> r2 = r0.f56105i
            if (r2 != 0) goto L_0x0013
            return
        L_0x0013:
            ck3.b r3 = r0.f215752d
            if (r3 != 0) goto L_0x001f
            java.lang.String r1 = r0.f56101e
            java.lang.String r2 = "onScroll, chattingContext is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
            return
        L_0x001f:
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r4 = r3.f193286j
            boolean r5 = r4 instanceof com.tencent.p014mm.p136ui.chatting.ChattingUIFragment
            if (r5 == 0) goto L_0x0028
            com.tencent.mm.ui.chatting.ChattingUIFragment r4 = (com.tencent.p014mm.p136ui.chatting.ChattingUIFragment) r4
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            if (r4 == 0) goto L_0x002e
            zj3.l r4 = r4.f215303u
            goto L_0x002f
        L_0x002e:
            r4 = 0
        L_0x002f:
            if (r4 != 0) goto L_0x0039
            java.lang.String r1 = r0.f56101e
            java.lang.String r2 = "onScroll, chattingDataAdapter is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
            return
        L_0x0039:
            com.tencent.mm.ui.chatting.component.d$a$i r5 = r0.f56110q
            r7 = 0
            r8 = 0
        L_0x003d:
            r9 = 1
            if (r8 >= r1) goto L_0x00f4
            int r10 = r20 + -1
            int r10 = r10 + r8
            if (r10 >= 0) goto L_0x0047
            goto L_0x00f0
        L_0x0047:
            com.tencent.mm.storage.f4 r10 = r4.getItem(r10)
            if (r10 == 0) goto L_0x00f0
            long r10 = r10.mo108774y2()
            int r12 = r2.indexOfKey(r10)
            if (r12 < 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r9 = 0
        L_0x0059:
            if (r9 != 0) goto L_0x005d
            goto L_0x00f0
        L_0x005d:
            if (r8 == 0) goto L_0x0063
            int r9 = r1 + -1
            if (r9 != r8) goto L_0x00cb
        L_0x0063:
            com.tencent.mm.ui.chatting.v3 r9 = r3.f193287k
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r9 = (com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment) r9
            com.tencent.mm.pluginsdk.ui.tools.n0 r9 = r9.mo102031Z()
            android.view.View r9 = r9.getChildAt(r8)
            if (r9 != 0) goto L_0x007a
            java.lang.String r9 = r0.f56101e
            java.lang.String r10 = "onScroll, msgView is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r10)
            goto L_0x00f0
        L_0x007a:
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            r9.getLocalVisibleRect(r14)
            android.graphics.Rect r15 = new android.graphics.Rect
            int r6 = r9.getWidth()
            int r9 = r9.getHeight()
            r15.<init>(r7, r7, r6, r9)
            boolean r6 = r15.isEmpty()
            r9 = 1120403456(0x42c80000, float:100.0)
            if (r6 == 0) goto L_0x009d
            r13 = 1120403456(0x42c80000, float:100.0)
            goto L_0x00bf
        L_0x009d:
            boolean r6 = r14.isEmpty()
            if (r6 == 0) goto L_0x00a4
            goto L_0x00bf
        L_0x00a4:
            int r6 = r14.width()
            float r6 = (float) r6
            float r6 = r6 * r9
            int r9 = r14.height()
            float r9 = (float) r9
            float r6 = r6 * r9
            int r9 = r15.width()
            int r13 = r15.height()
            int r9 = r9 * r13
            float r9 = (float) r9
            float r13 = r6 / r9
        L_0x00bf:
            int r6 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x00cb
            java.lang.String r6 = r0.f56101e
            java.lang.String r9 = "onScroll, fix expose"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            goto L_0x00f0
        L_0x00cb:
            if (r5 != 0) goto L_0x00d2
            com.tencent.mm.ui.chatting.component.d$a$i r5 = new com.tencent.mm.ui.chatting.component.d$a$i
            r5.<init>(r1)
        L_0x00d2:
            long[] r6 = r5.f56151a
            int r9 = r6.length
            int r12 = r5.f56152b
            if (r12 < r9) goto L_0x00e6
            int r9 = r9 * 2
            long[] r6 = java.util.Arrays.copyOf(r6, r9)
            java.lang.String r9 = "copyOf(this, newSize)"
            gy3.C87412m.m108593f(r6, r9)
            r5.f56151a = r6
        L_0x00e6:
            long[] r6 = r5.f56151a
            int r9 = r5.f56152b
            int r12 = r9 + 1
            r5.f56152b = r12
            r6[r9] = r10
        L_0x00f0:
            int r8 = r8 + 1
            goto L_0x003d
        L_0x00f4:
            com.tencent.mm.ui.chatting.component.d$a$i r1 = r0.f56109p
            r0.f56109p = r5
            if (r5 == 0) goto L_0x0106
            int r3 = r5.f56152b
            if (r3 > 0) goto L_0x0100
            r3 = 1
            goto L_0x0101
        L_0x0100:
            r3 = 0
        L_0x0101:
            if (r3 == 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r3 = 0
            goto L_0x0107
        L_0x0106:
            r3 = 1
        L_0x0107:
            r3 = r3 ^ r9
            if (r1 == 0) goto L_0x0116
            int r4 = r1.f56152b
            if (r4 > 0) goto L_0x0110
            r4 = 1
            goto L_0x0111
        L_0x0110:
            r4 = 0
        L_0x0111:
            if (r4 == 0) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            r4 = 0
            goto L_0x0117
        L_0x0116:
            r4 = 1
        L_0x0117:
            r4 = r4 ^ r9
            if (r3 != 0) goto L_0x0126
            if (r4 != 0) goto L_0x0126
            if (r1 == 0) goto L_0x0122
            r1.f56152b = r7
            r6 = r1
            goto L_0x0123
        L_0x0122:
            r6 = 0
        L_0x0123:
            r0.f56110q = r6
            return
        L_0x0126:
            long r10 = java.lang.System.currentTimeMillis()
            if (r4 == 0) goto L_0x016d
            gy3.C87412m.m108591d(r1)
            int r4 = r1.f56152b
            r6 = 0
        L_0x0132:
            if (r6 >= r4) goto L_0x016d
            long[] r8 = r1.f56151a
            r12 = r8[r6]
            if (r5 == 0) goto L_0x0154
            int r8 = r5.f56152b
            if (r8 > 0) goto L_0x0140
        L_0x013e:
            r8 = 0
            goto L_0x0150
        L_0x0140:
            r14 = 0
        L_0x0141:
            if (r14 >= r8) goto L_0x013e
            long[] r15 = r5.f56151a
            r16 = r15[r14]
            int r15 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r15 != 0) goto L_0x014d
            r8 = 1
            goto L_0x0150
        L_0x014d:
            int r14 = r14 + 1
            goto L_0x0141
        L_0x0150:
            if (r9 != r8) goto L_0x0154
            r8 = 1
            goto L_0x0155
        L_0x0154:
            r8 = 0
        L_0x0155:
            if (r8 != 0) goto L_0x016a
            java.lang.Object r8 = r2.get(r12)
            com.tencent.mm.ui.chatting.component.d$a$k r8 = (com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19741k) r8
            if (r8 == 0) goto L_0x016a
            com.tencent.mm.ui.chatting.component.d$a$b r8 = r8.f56157a
            if (r8 == 0) goto L_0x016a
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            r8.mo26201b(r12)
        L_0x016a:
            int r6 = r6 + 1
            goto L_0x0132
        L_0x016d:
            if (r3 == 0) goto L_0x01b0
            gy3.C87412m.m108591d(r5)
            int r3 = r5.f56152b
            r4 = 0
        L_0x0175:
            if (r4 >= r3) goto L_0x01b0
            long[] r6 = r5.f56151a
            r12 = r6[r4]
            if (r1 == 0) goto L_0x0197
            int r6 = r1.f56152b
            if (r6 > 0) goto L_0x0183
        L_0x0181:
            r6 = 0
            goto L_0x0193
        L_0x0183:
            r8 = 0
        L_0x0184:
            if (r8 >= r6) goto L_0x0181
            long[] r14 = r1.f56151a
            r15 = r14[r8]
            int r14 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x0190
            r6 = 1
            goto L_0x0193
        L_0x0190:
            int r8 = r8 + 1
            goto L_0x0184
        L_0x0193:
            if (r9 != r6) goto L_0x0197
            r6 = 1
            goto L_0x0198
        L_0x0197:
            r6 = 0
        L_0x0198:
            if (r6 != 0) goto L_0x01ad
            java.lang.Object r6 = r2.get(r12)
            com.tencent.mm.ui.chatting.component.d$a$k r6 = (com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19741k) r6
            if (r6 == 0) goto L_0x01ad
            com.tencent.mm.ui.chatting.component.d$a$b r6 = r6.f56157a
            if (r6 == 0) goto L_0x01ad
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r6.mo26202c(r8)
        L_0x01ad:
            int r4 = r4 + 1
            goto L_0x0175
        L_0x01b0:
            if (r1 == 0) goto L_0x01b6
            r1.f56152b = r7
            r6 = r1
            goto L_0x01b7
        L_0x01b6:
            r6 = 0
        L_0x01b7:
            r0.f56110q = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C19729d.mo26189W5(android.view.View, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.tencent.mm.ui.chatting.component.d$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.tencent.mm.ui.chatting.component.d$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.tencent.mm.ui.chatting.component.d$a$k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.tencent.mm.ui.chatting.component.d$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.tencent.mm.ui.chatting.component.d$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: com.tencent.mm.ui.chatting.component.d$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.tencent.mm.ui.chatting.component.d$b} */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.Object, com.tencent.mm.ui.chatting.component.d$a$k] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        if (r6 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        if (r6 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0108  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19741k mo26190Y5(com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19731a r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.tencent.mm.storage.f4 r2 = r1.f56111a
            android.util.LongSparseArray<com.tencent.mm.ui.chatting.component.d$a$k> r3 = r0.f56105i
            if (r3 != 0) goto L_0x0011
            android.util.LongSparseArray r3 = new android.util.LongSparseArray
            r3.<init>()
            r0.f56105i = r3
        L_0x0011:
            long r4 = r2.mo108774y2()
            java.lang.Object r2 = r3.get(r4)
            com.tencent.mm.ui.chatting.component.d$a$k r2 = (com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19741k) r2
            if (r2 != 0) goto L_0x011a
            ck3.b r2 = r0.f215752d
            r3 = 0
            if (r2 != 0) goto L_0x002a
            java.lang.String r1 = r0.f56101e
            java.lang.String r2 = "buildStatefulAppMsgWxaStatInfo, chattingContext is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
            goto L_0x0039
        L_0x002a:
            com.tencent.mm.storage.f4 r4 = r1.f56113c
            com.tencent.mm.message.l$b r4 = r0.mo26193b6(r4)
            if (r4 != 0) goto L_0x003c
            java.lang.String r1 = r0.f56101e
            java.lang.String r2 = "buildStatefulAppMsgWxaStatInfo, appMsgContent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
        L_0x0039:
            r2 = r3
            goto L_0x011a
        L_0x003c:
            com.tencent.mm.ui.chatting.component.d$a$c r5 = com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19733c.Finder
            com.tencent.mm.ui.chatting.component.d$a$c r6 = r1.f56112b
            if (r5 == r6) goto L_0x0043
            goto L_0x0076
        L_0x0043:
            java.lang.Class<ht1.i> r5 = ht1.C60175i.class
            com.tencent.mm.message.g r5 = r4.mo93555w(r5)
            ht1.i r5 = (ht1.C60175i) r5
            if (r5 == 0) goto L_0x0050
            te3.ci1 r5 = r5.f171712b
            goto L_0x0051
        L_0x0050:
            r5 = r3
        L_0x0051:
            if (r5 == 0) goto L_0x005d
            com.tencent.mm.ui.chatting.component.d$b r3 = new com.tencent.mm.ui.chatting.component.d$b
            java.lang.String r6 = r5.f182500i
            java.lang.String r5 = r5.f182501j
            r3.<init>(r6, r5)
            goto L_0x0076
        L_0x005d:
            java.lang.Class<ht1.g> r5 = ht1.C46106g.class
            com.tencent.mm.message.g r5 = r4.mo93555w(r5)
            ht1.g r5 = (ht1.C46106g) r5
            if (r5 == 0) goto L_0x006a
            te3.gg1 r5 = r5.f124277b
            goto L_0x006b
        L_0x006a:
            r5 = r3
        L_0x006b:
            if (r5 == 0) goto L_0x0076
            com.tencent.mm.ui.chatting.component.d$b r3 = new com.tencent.mm.ui.chatting.component.d$b
            java.lang.String r6 = r5.f134037j
            java.lang.String r5 = r5.f134038n
            r3.<init>(r6, r5)
        L_0x0076:
            com.tencent.mm.storage.f4 r5 = r1.f56111a
            long r7 = r5.mo108774y2()
            com.tencent.mm.storage.f4 r5 = r1.f56113c
            long r9 = r5.mo108774y2()
            com.tencent.mm.ui.chatting.component.d$a$c r5 = r1.f56112b
            int r5 = r5.ordinal()
            r6 = 2
            r11 = 1
            if (r5 == 0) goto L_0x0099
            if (r5 == r11) goto L_0x0099
            if (r5 == r6) goto L_0x0097
            r6 = 6
            if (r5 == r6) goto L_0x0095
            r5 = 1
            goto L_0x009a
        L_0x0095:
            r5 = 4
            goto L_0x009a
        L_0x0097:
            r5 = 3
            goto L_0x009a
        L_0x0099:
            r5 = 2
        L_0x009a:
            com.tencent.mm.storage.f4 r6 = r1.f56113c
            int r12 = r6.mo108769t2()
            java.lang.String r13 = ""
            if (r11 != r12) goto L_0x00ab
            java.lang.String r6 = r2.mo91573n()
            if (r6 != 0) goto L_0x00c6
            goto L_0x00bb
        L_0x00ab:
            boolean r11 = r2.mo91583x()
            if (r11 == 0) goto L_0x00bd
            java.lang.String r6 = r6.getContent()
            java.lang.String r6 = eb0.C75604z3.m90847s(r6)
            if (r6 != 0) goto L_0x00c6
        L_0x00bb:
            r12 = r13
            goto L_0x00c7
        L_0x00bd:
            java.lang.String r6 = r2.mo91577r()
            java.lang.String r11 = "chattingContext.talkerUserName"
            gy3.C87412m.m108593f(r6, r11)
        L_0x00c6:
            r12 = r6
        L_0x00c7:
            if (r3 == 0) goto L_0x00cd
            java.lang.String r6 = r3.f56159a
            if (r6 != 0) goto L_0x00cf
        L_0x00cd:
            java.lang.String r6 = r4.f195577g2
        L_0x00cf:
            if (r6 != 0) goto L_0x00d3
            r14 = r13
            goto L_0x00d4
        L_0x00d3:
            r14 = r6
        L_0x00d4:
            java.lang.String r6 = r4.f195573f2
            if (r6 != 0) goto L_0x00da
            r15 = r13
            goto L_0x00db
        L_0x00da:
            r15 = r6
        L_0x00db:
            if (r3 == 0) goto L_0x00e1
            java.lang.String r3 = r3.f56160b
            if (r3 != 0) goto L_0x00e3
        L_0x00e1:
            java.lang.String r3 = r4.f195569e2
        L_0x00e3:
            if (r3 != 0) goto L_0x00e6
            r3 = r13
        L_0x00e6:
            com.tencent.mm.ui.chatting.component.d$a$c r4 = r1.f56112b
            boolean r2 = r2.mo91583x()
            if (r2 == 0) goto L_0x00f1
            int r2 = r4.f56139e
            goto L_0x00f3
        L_0x00f1:
            int r2 = r4.f56138d
        L_0x00f3:
            r16 = r2
            com.tencent.mm.ui.chatting.component.d$a$b r2 = new com.tencent.mm.ui.chatting.component.d$a$b
            r6 = r2
            r11 = r5
            r13 = r14
            r14 = r15
            r15 = r3
            r6.<init>(r7, r9, r11, r12, r13, r14, r15, r16)
            com.tencent.mm.ui.chatting.component.d$a$k r3 = new com.tencent.mm.ui.chatting.component.d$a$k
            r3.<init>(r2)
            android.util.LongSparseArray<com.tencent.mm.ui.chatting.component.d$a$k> r2 = r0.f56105i
            if (r2 != 0) goto L_0x010f
            android.util.LongSparseArray r2 = new android.util.LongSparseArray
            r2.<init>()
            r0.f56105i = r2
        L_0x010f:
            com.tencent.mm.storage.f4 r1 = r1.f56111a
            long r4 = r1.mo108774y2()
            r2.put(r4, r3)
            goto L_0x0039
        L_0x011a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C19729d.mo26190Y5(com.tencent.mm.ui.chatting.component.d$a$a):com.tencent.mm.ui.chatting.component.d$a$k");
    }

    /* renamed from: Z5 */
    public final boolean mo26191Z5() {
        return ((Boolean) this.f56102f.getValue()).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = mo26190Y5(r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26192a(com.tencent.p014mm.storage.C72963f4 r2) {
        /*
            r1 = this;
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r2, r0)
            com.tencent.mm.ui.chatting.component.d$a$a r2 = r1.mo26194c6(r2)
            if (r2 == 0) goto L_0x0014
            com.tencent.mm.ui.chatting.component.d$a$k r2 = r1.mo26190Y5(r2)
            if (r2 == 0) goto L_0x0014
            com.tencent.mm.ui.chatting.component.d$a$b r2 = r2.f56157a
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            if (r2 != 0) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            r0 = 1
            r2.f56129o = r0
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C19729d.mo26192a(com.tencent.mm.storage.f4):void");
    }

    /* renamed from: b6 */
    public final C68070l.C68072b mo26193b6(C72963f4 f4Var) {
        LongSparseArray<C19730a.C19735e> longSparseArray = this.f56107n;
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
            this.f56107n = longSparseArray;
        }
        long y2 = f4Var.mo108774y2();
        C19730a.C19735e eVar = longSparseArray.get(y2);
        if (eVar == null) {
            String content = f4Var.getContent();
            eVar = new C19730a.C19735e(content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null);
            longSparseArray.put(y2, eVar);
        }
        return eVar.f56142a;
    }

    /* renamed from: c6 */
    public final C19730a.C19731a mo26194c6(C72963f4 f4Var) {
        MsgQuoteItem msgQuoteItem;
        C19730a.C19731a aVar = null;
        if (f4Var == null) {
            return null;
        }
        LongSparseArray<C19730a.C19737g> longSparseArray = this.f56108o;
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
            this.f56108o = longSparseArray;
        }
        long y2 = f4Var.mo108774y2();
        C19730a.C19737g gVar = longSparseArray.get(y2);
        if (gVar == null) {
            int type = f4Var.getType();
            String t = f4Var.mo108768t();
            if (t == null) {
                t = "";
            }
            C19730a.C19731a d6 = mo26196d6(new C19744f(f4Var, this, type, t), f4Var);
            if (d6 == null) {
                if (822083633 != f4Var.getType()) {
                    msgQuoteItem = null;
                } else {
                    C68070l.C68072b b6 = mo26193b6(f4Var);
                    msgQuoteItem = b6 != null ? b6.f195641w2 : null;
                }
                if (msgQuoteItem != null) {
                    int i = msgQuoteItem.f201543d;
                    String str = msgQuoteItem.f201546g;
                    aVar = mo26196d6(new C19745g(this, f4Var, msgQuoteItem, i, str == null ? "" : str), f4Var);
                }
            } else {
                aVar = d6;
            }
            gVar = new C19730a.C19737g(aVar);
            longSparseArray.put(y2, gVar);
        }
        return gVar.f56144a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = mo26190Y5(r2);
     */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26195d0(com.tencent.p014mm.storage.C72963f4 r2) {
        /*
            r1 = this;
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r2, r0)
            com.tencent.mm.ui.chatting.component.d$a$a r2 = r1.mo26194c6(r2)
            if (r2 == 0) goto L_0x0014
            com.tencent.mm.ui.chatting.component.d$a$k r2 = r1.mo26190Y5(r2)
            if (r2 == 0) goto L_0x0014
            com.tencent.mm.ui.chatting.component.d$a$b r2 = r2.f56157a
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            if (r2 != 0) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            r0 = 1
            r2.f56128n = r0
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C19729d.mo26195d0(com.tencent.mm.storage.f4):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ea, code lost:
        if ((r2 == null || r2.length() == 0) != false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0102, code lost:
        if (r5 != false) goto L_0x0153;
     */
    /* renamed from: d6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19731a mo26196d6(com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19740j r11, com.tencent.p014mm.storage.C72963f4 r12) {
        /*
            r10 = this;
            com.tencent.mm.ui.chatting.component.d$a$c r2 = com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19733c.Finder
            com.tencent.mm.storage.f4 r6 = r11.mo26214b()
            r0 = 0
            if (r6 != 0) goto L_0x0011
            java.lang.String r11 = r10.f56101e
            java.lang.String r12 = "parseHelpfulInfo, wxaMsgInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r12)
            return r0
        L_0x0011:
            r1 = 587202609(0x23000031, float:6.9389344E-18)
            int r3 = r11.f56153a
            if (r1 != r3) goto L_0x0026
            com.tencent.mm.ui.chatting.component.d$a$a r11 = new com.tencent.mm.ui.chatting.component.d$a$a
            com.tencent.mm.ui.chatting.component.d$a$c r5 = com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19733c.Update
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r11
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        L_0x0026:
            r1 = 553648177(0x21000031, float:4.336834E-19)
            if (r1 != r3) goto L_0x0039
            com.tencent.mm.ui.chatting.component.d$a$a r11 = new com.tencent.mm.ui.chatting.component.d$a$a
            com.tencent.mm.ui.chatting.component.d$a$c r5 = com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19733c.Dynamic
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r11
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        L_0x0039:
            r1 = 974127153(0x3a100031, float:5.4931926E-4)
            if (r1 != r3) goto L_0x004c
            com.tencent.mm.ui.chatting.component.d$a$a r11 = new com.tencent.mm.ui.chatting.component.d$a$a
            r4 = 0
            r5 = 8
            r7 = 0
            r0 = r11
            r1 = r12
            r3 = r6
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
        L_0x004c:
            r1 = 977272881(0x3a400031, float:7.324247E-4)
            if (r1 != r3) goto L_0x005f
            com.tencent.mm.ui.chatting.component.d$a$a r11 = new com.tencent.mm.ui.chatting.component.d$a$a
            r4 = 0
            r5 = 8
            r7 = 0
            r0 = r11
            r1 = r12
            r3 = r6
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
        L_0x005f:
            r1 = 976224305(0x3a300031, float:6.713896E-4)
            if (r1 != r3) goto L_0x0072
            com.tencent.mm.ui.chatting.component.d$a$a r11 = new com.tencent.mm.ui.chatting.component.d$a$a
            r4 = 0
            r5 = 8
            r7 = 0
            r0 = r11
            r1 = r12
            r3 = r6
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
        L_0x0072:
            r1 = 49
            if (r1 != r3) goto L_0x0186
            com.tencent.mm.ui.chatting.component.d$a$e r1 = r11.f56156d
            if (r1 == 0) goto L_0x007d
            com.tencent.mm.message.l$b r1 = r1.f56142a
            goto L_0x0089
        L_0x007d:
            com.tencent.mm.ui.chatting.component.d$a$e r1 = new com.tencent.mm.ui.chatting.component.d$a$e
            com.tencent.mm.message.l$b r2 = r11.mo26213a()
            r1.<init>(r2)
            r11.f56156d = r1
            r1 = r2
        L_0x0089:
            if (r1 != 0) goto L_0x0093
            java.lang.String r11 = r10.f56101e
            java.lang.String r12 = "parseHelpfulInfo, appMsgContent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r12)
            return r0
        L_0x0093:
            int r2 = r1.f195582i
            r3 = 36
            if (r3 != r2) goto L_0x00b9
            java.lang.String r1 = r11.f56154b
            boolean r1 = eb0.C45628s0.m50738C(r1)
            if (r1 != 0) goto L_0x00b8
            com.tencent.mm.storage.f4 r11 = r11.mo26214b()
            boolean r11 = rb0.C47987l.m53344l2(r11)
            if (r11 != 0) goto L_0x00b8
            com.tencent.mm.ui.chatting.component.d$a$a r0 = new com.tencent.mm.ui.chatting.component.d$a$a
            com.tencent.mm.ui.chatting.component.d$a$c r5 = com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19733c.OpenSdk
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r0
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x00b8:
            return r0
        L_0x00b9:
            r3 = 33
            r4 = 44
            if (r3 == r2) goto L_0x00c1
            if (r4 != r2) goto L_0x0186
        L_0x00c1:
            r3 = 1
            r5 = 0
            if (r4 != r2) goto L_0x00ed
            boolean r2 = r1.mo93554q(r5)
            if (r2 == 0) goto L_0x00ec
            ck3.b r2 = r10.f215752d
            if (r2 == 0) goto L_0x00d6
            android.app.Activity r2 = r2.mo91565f()
            if (r2 == 0) goto L_0x00d6
            goto L_0x00da
        L_0x00d6:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
        L_0x00da:
            java.lang.String r2 = r1.mo93549l(r2, r5)
            if (r2 == 0) goto L_0x00e9
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            r2 = 0
            goto L_0x00ea
        L_0x00e9:
            r2 = 1
        L_0x00ea:
            if (r2 == 0) goto L_0x00ed
        L_0x00ec:
            return r0
        L_0x00ed:
            int r2 = r1.f195581h2
            if (r2 == 0) goto L_0x0153
            r4 = 2
            if (r4 == r2) goto L_0x0153
            r4 = 3
            if (r4 != r2) goto L_0x0105
            java.lang.String r1 = r1.f195593k2
            if (r1 == 0) goto L_0x0101
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0102
        L_0x0101:
            r5 = 1
        L_0x0102:
            if (r5 == 0) goto L_0x0105
            goto L_0x0153
        L_0x0105:
            if (r3 != r2) goto L_0x013b
            ck3.b r1 = r10.f215752d
            if (r1 == 0) goto L_0x010e
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r1.f193286j
            goto L_0x010f
        L_0x010e:
            r1 = r0
        L_0x010f:
            boolean r1 = r1 instanceof com.tencent.p014mm.p136ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI
            if (r1 != 0) goto L_0x013a
            com.tencent.mm.storage.f4 r1 = r11.mo26214b()
            boolean r1 = rb0.C47987l.m53344l2(r1)
            if (r1 != 0) goto L_0x013a
            java.lang.String r1 = r11.f56154b
            boolean r1 = eb0.C45628s0.m50738C(r1)
            if (r1 != 0) goto L_0x013a
            java.lang.String r11 = r11.f56154b
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85846q5(r11)
            if (r11 != 0) goto L_0x013a
            com.tencent.mm.ui.chatting.component.d$a$a r0 = new com.tencent.mm.ui.chatting.component.d$a$a
            com.tencent.mm.ui.chatting.component.d$a$c r5 = com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19733c.Profile
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r0
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x013a:
            return r0
        L_0x013b:
            if (r4 != r2) goto L_0x0186
            java.lang.String r11 = r11.f56154b
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85846q5(r11)
            if (r11 != 0) goto L_0x0152
            com.tencent.mm.ui.chatting.component.d$a$a r0 = new com.tencent.mm.ui.chatting.component.d$a$a
            com.tencent.mm.ui.chatting.component.d$a$c r5 = com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19733c.WithShareTicket
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r0
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x0152:
            return r0
        L_0x0153:
            ck3.b r1 = r10.f215752d
            if (r1 == 0) goto L_0x015a
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r1.f193286j
            goto L_0x015b
        L_0x015a:
            r1 = r0
        L_0x015b:
            boolean r1 = r1 instanceof com.tencent.p014mm.p136ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI
            if (r1 != 0) goto L_0x0186
            com.tencent.mm.storage.f4 r1 = r11.mo26214b()
            boolean r1 = rb0.C47987l.m53344l2(r1)
            if (r1 != 0) goto L_0x0186
            java.lang.String r1 = r11.f56154b
            boolean r1 = eb0.C45628s0.m50738C(r1)
            if (r1 != 0) goto L_0x0186
            java.lang.String r11 = r11.f56154b
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85846q5(r11)
            if (r11 != 0) goto L_0x0186
            com.tencent.mm.ui.chatting.component.d$a$a r0 = new com.tencent.mm.ui.chatting.component.d$a$a
            com.tencent.mm.ui.chatting.component.d$a$c r5 = com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19733c.Normal
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r0
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x0186:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C19729d.mo26196d6(com.tencent.mm.ui.chatting.component.d$a$j, com.tencent.mm.storage.f4):com.tencent.mm.ui.chatting.component.d$a$a");
    }

    /* renamed from: e6 */
    public final String mo26197e6(C72963f4 f4Var) {
        return "MsgInfo(msgId = " + f4Var.getMsgId() + ", msgType = " + f4Var.getType() + ", msgSvrId = " + f4Var.mo108774y2() + ')';
    }

    /* renamed from: f6 */
    public final String mo26198f6(String str) {
        if (str.length() > 1024) {
            str = str.substring(0, 1024);
            C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (!C112550d0.m153801u(str, ",", false)) {
            return str;
        }
        String b = C117627q.m165909b(str, "UTF-8");
        return b == null ? "" : b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: n2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26199n2() {
        /*
            r10 = this;
            com.tencent.mm.ui.chatting.component.d$a$h r0 = r10.f56104h
            if (r0 == 0) goto L_0x0011
            java.lang.String r1 = "MicroMsg.AppMsgWxaReportComponent"
            java.lang.String r2 = "markExitChatting"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            long r1 = java.lang.System.currentTimeMillis()
            r0.f56150f = r1
        L_0x0011:
            java.lang.String r0 = r10.f56101e
            java.lang.String r1 = "doExposeReport"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.ui.chatting.component.d$a$h r0 = r10.f56104h
            android.util.LongSparseArray<com.tencent.mm.ui.chatting.component.d$a$k> r1 = r10.f56105i
            r2 = 0
            if (r1 == 0) goto L_0x0026
            com.tencent.mm.ui.chatting.component.e r3 = com.tencent.p014mm.p136ui.chatting.component.C19743e.f56161d
            android.util.LongSparseArray r1 = o40.C61926c.m72687l(r1, r3)
            goto L_0x0027
        L_0x0026:
            r1 = r2
        L_0x0027:
            r3 = 0
            if (r0 == 0) goto L_0x00e2
            if (r1 == 0) goto L_0x00e2
            java.lang.String r4 = r0.f56146b
            int r4 = r4.length()
            r5 = 1
            if (r4 != 0) goto L_0x0037
            r4 = 1
            goto L_0x0038
        L_0x0037:
            r4 = 0
        L_0x0038:
            if (r4 != 0) goto L_0x00e2
            java.util.regex.Pattern r4 = o40.C61926c.f176038a
            int r4 = r1.size()
            if (r4 != 0) goto L_0x0044
            r4 = 1
            goto L_0x0045
        L_0x0044:
            r4 = 0
        L_0x0045:
            if (r4 == 0) goto L_0x0049
            goto L_0x00e2
        L_0x0049:
            com.tencent.mm.autogen.mmdata.rpt.AppMsgWxaExposeClickStruct r4 = new com.tencent.mm.autogen.mmdata.rpt.AppMsgWxaExposeClickStruct
            r4.<init>()
            r4.f48165d = r3
            int r6 = r0.f56147c
            r4.f48166e = r6
            java.lang.String r6 = r0.f56146b
            java.lang.String r6 = r10.mo26198f6(r6)
            java.lang.String r7 = "ChatName"
            java.lang.String r6 = r4.mo86045b(r7, r6, r5)
            r4.f48167f = r6
            int r6 = r0.f56148d
            r4.f48168g = r6
            java.lang.String r0 = r0.f56145a
            java.lang.String r0 = r10.mo26198f6(r0)
            java.lang.String r6 = "SessionId"
            java.lang.String r0 = r4.mo86045b(r6, r0, r5)
            r4.f48169h = r0
            int r0 = r1.size()
            r6 = 0
        L_0x0079:
            if (r6 >= r0) goto L_0x00e9
            r1.keyAt(r6)
            java.lang.Object r7 = r1.valueAt(r6)
            com.tencent.mm.ui.chatting.component.d$a$k r7 = (com.tencent.p014mm.p136ui.chatting.component.C19729d.C19730a.C19741k) r7
            com.tencent.mm.ui.chatting.component.d$a$b r7 = r7.f56157a
            long r8 = r7.f56115a
            r4.f48170i = r8
            long r8 = r7.f56116b
            r4.f48171j = r8
            int r8 = r7.f56117c
            r4.f48172k = r8
            java.lang.String r8 = r7.f56118d
            java.lang.String r8 = r10.mo26198f6(r8)
            java.lang.String r9 = "SenderUsername"
            java.lang.String r8 = r4.mo86045b(r9, r8, r5)
            r4.f48173l = r8
            java.lang.String r8 = r7.f56119e
            java.lang.String r8 = r10.mo26198f6(r8)
            java.lang.String r9 = "AppId"
            java.lang.String r8 = r4.mo86045b(r9, r8, r5)
            r4.f48174m = r8
            java.lang.String r8 = r7.f56120f
            java.lang.String r8 = r10.mo26198f6(r8)
            java.lang.String r9 = "Username"
            java.lang.String r8 = r4.mo86045b(r9, r8, r5)
            r4.f48175n = r8
            java.lang.String r8 = r7.f56121g
            java.lang.String r8 = r10.mo26198f6(r8)
            java.lang.String r9 = "EnterPath"
            java.lang.String r8 = r4.mo86045b(r9, r8, r5)
            r4.f48176o = r8
            int r8 = r7.f56122h
            r4.f48177p = r8
            long r8 = r7.mo26200a()
            r4.f48178q = r8
            boolean r8 = r7.f56128n
            r4.f48179r = r8
            boolean r7 = r7.f56129o
            r4.f48164F0 = r7
            r4.mo86054n()
            int r6 = r6 + 1
            goto L_0x0079
        L_0x00e2:
            java.lang.String r0 = r10.f56101e
            java.lang.String r1 = "doExposeReport, filter invalid statInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x00e9:
            java.lang.String r0 = r10.f56101e
            java.lang.String r1 = "cleanStatInfoOnExit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r10.f56104h = r2
            com.tencent.mm.ui.chatting.component.d$a$i r0 = r10.f56109p
            if (r0 == 0) goto L_0x00f8
            r0.f56152b = r3
        L_0x00f8:
            r10.f56109p = r2
            com.tencent.mm.ui.chatting.component.d$a$i r0 = r10.f56110q
            if (r0 == 0) goto L_0x0100
            r0.f56152b = r3
        L_0x0100:
            r10.f56110q = r2
            ck3.b r0 = r10.f215752d
            if (r0 == 0) goto L_0x010a
            java.lang.String r2 = r0.mo91577r()
        L_0x010a:
            if (r2 != 0) goto L_0x010e
            java.lang.String r2 = ""
        L_0x010e:
            r10.f56103g = r2
            boolean r0 = r10.mo26191Z5()
            if (r0 == 0) goto L_0x012b
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            if (r0 == 0) goto L_0x012b
            g62.l r0 = r0.mo96095LE()
            if (r0 == 0) goto L_0x012b
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.sy0(r10)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C19729d.mo26199n2():void");
    }

    /* renamed from: w5 */
    public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
        LongSparseArray<C19730a.C19741k> longSparseArray;
        C19730a.C19732b bVar;
        if (mo26191Z5() && eVar != null && C87412m.m108589b("update", eVar.f123845b) && (longSparseArray = this.f56105i) != null) {
            ArrayList<C72963f4> arrayList = eVar.f123846c;
            C87412m.m108593f(arrayList, "notifyInfo.msgList");
            ArrayList<C72963f4> arrayList2 = new ArrayList<>();
            Iterator<T> it = arrayList.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (4 != (((C72963f4) next).f230723F & 4)) {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            for (C72963f4 y2 : arrayList2) {
                C19730a.C19741k kVar = longSparseArray.get(y2.mo108774y2());
                if (!(kVar == null || (bVar = kVar.f56157a) == null)) {
                    Log.m105924i("MicroMsg.AppMsgWxaReportComponent", "markRevoked, msgId: " + bVar.f56115a);
                    if (bVar.f56127m) {
                        Log.m105924i("MicroMsg.AppMsgWxaReportComponent", "markRevoked, already revoked");
                    } else {
                        bVar.mo26201b((Long) null);
                        bVar.f56127m = true;
                    }
                }
            }
        }
    }
}
