package com.tencent.p014mm.live.model;

import a11.C39479c;
import a60.C53979a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import c50.C54655b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.live.p016ui.LiveUIA;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import d50.C58114h;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import i60.C46169a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import k20.C9556a;
import lc3.C10485b;
import o40.C61926c;
import p50.C62197e;
import rx3.C13604l;
import s50.C36624a;
import te3.C49317ep2;
import te3.C50710oo2;
import te3.C64265bq2;

/* renamed from: com.tencent.mm.live.model.RoomLiveService */
public final class RoomLiveService {

    /* renamed from: A */
    public static boolean f157169A;

    /* renamed from: B */
    public static boolean f157170B;

    /* renamed from: C */
    public static int f157171C;

    /* renamed from: D */
    public static int f157172D;

    /* renamed from: E */
    public static int f157173E;

    /* renamed from: F */
    public static int f157174F = -1;

    /* renamed from: G */
    public static int f157175G;

    /* renamed from: H */
    public static int f157176H;

    /* renamed from: I */
    public static int f157177I;

    /* renamed from: J */
    public static int f157178J;

    /* renamed from: K */
    public static boolean f157179K;

    /* renamed from: L */
    public static int f157180L;

    /* renamed from: M */
    public static int f157181M;

    /* renamed from: N */
    public static int f157182N;

    /* renamed from: O */
    public static long f157183O;

    /* renamed from: P */
    public static boolean f157184P;

    /* renamed from: Q */
    public static C53979a f157185Q = new C53979a();

    /* renamed from: R */
    public static long f157186R;

    /* renamed from: S */
    public static Context f157187S;

    /* renamed from: T */
    public static boolean f157188T;

    /* renamed from: U */
    public static View.OnClickListener f157189U = C1271e.f10325d;

    /* renamed from: a */
    public static final RoomLiveService f157190a = new RoomLiveService();

    /* renamed from: b */
    public static C36624a f157191b;

    /* renamed from: c */
    public static String f157192c = "";

    /* renamed from: d */
    public static ArrayList<String> f157193d = new ArrayList<>();

    /* renamed from: e */
    public static HashMap<String, C13604l<ArrayList<String>, Integer>> f157194e = new HashMap<>();

    /* renamed from: f */
    public static ArrayList<C46169a> f157195f = new ArrayList<>();

    /* renamed from: g */
    public static byte[] f157196g;

    /* renamed from: h */
    public static C49317ep2 f157197h = new C49317ep2();

    /* renamed from: i */
    public static C64265bq2 f157198i;

    /* renamed from: j */
    public static String f157199j = "";

    /* renamed from: k */
    public static int f157200k;

    /* renamed from: l */
    public static C58114h f157201l;

    /* renamed from: m */
    public static long f157202m;

    /* renamed from: n */
    public static C50710oo2 f157203n = new C50710oo2();

    /* renamed from: o */
    public static boolean f157204o;

    /* renamed from: p */
    public static int f157205p = -1;

    /* renamed from: q */
    public static String f157206q = "";

    /* renamed from: r */
    public static String f157207r = "";

    /* renamed from: s */
    public static boolean f157208s;

    /* renamed from: t */
    public static C55213d f157209t = new C55213d(false, false, false, false, 15, (C8480h) null);

    /* renamed from: u */
    public static C1270b f157210u = new C1270b(false, (String) null, false, 7, (C8480h) null);

    /* renamed from: v */
    public static C55211a f157211v = new C55211a(false, false, false, false, 15, (C8480h) null);

    /* renamed from: w */
    public static C55212c f157212w = new C55212c((String) null, 0, 0, 0, 15, (C8480h) null);

    /* renamed from: x */
    public static boolean f157213x;

    /* renamed from: y */
    public static boolean f157214y;

    /* renamed from: z */
    public static boolean f157215z;

    /* renamed from: com.tencent.mm.live.model.RoomLiveService$b */
    public static final class C1270b {

        /* renamed from: a */
        public boolean f10322a;

        /* renamed from: b */
        public String f10323b;

        /* renamed from: c */
        public boolean f10324c;

        public C1270b() {
            this(false, (String) null, false, 7, (C8480h) null);
        }

        public C1270b(boolean z, String str, boolean z2, int i, C8480h hVar) {
            z = (i & 1) != 0 ? false : z;
            str = (i & 2) != 0 ? "" : str;
            z2 = (i & 4) != 0 ? true : z2;
            C87412m.m108594g(str, "verifyUrl");
            this.f10322a = z;
            this.f10323b = str;
            this.f10324c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1270b)) {
                return false;
            }
            C1270b bVar = (C1270b) obj;
            return this.f10322a == bVar.f10322a && C87412m.m108589b(this.f10323b, bVar.f10323b) && this.f10324c == bVar.f10324c;
        }

        public int hashCode() {
            boolean z = this.f10322a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode = (((z ? 1 : 0) * true) + this.f10323b.hashCode()) * 31;
            boolean z3 = this.f10324c;
            if (!z3) {
                z2 = z3;
            }
            return hashCode + (z2 ? 1 : 0);
        }

        public String toString() {
            return "LiveFaceVerifyInfo(needFaceVerify=" + this.f10322a + ", verifyUrl=" + this.f10323b + ", isFromAnchor=" + this.f10324c + ')';
        }
    }

    /* renamed from: com.tencent.mm.live.model.RoomLiveService$e */
    public static final class C1271e implements View.OnClickListener {

        /* renamed from: d */
        public static final C1271e f10325d = new C1271e();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/model/RoomLiveService$miniWindowClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(MMApplicationContext.getContext(), LiveUIA.class);
            intent.putExtra("route_to_maximize", true);
            intent.addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/live/model/RoomLiveService$miniWindowClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/live/model/RoomLiveService$miniWindowClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/live/model/RoomLiveService$miniWindowClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.live.model.RoomLiveService$a */
    public static final class C55211a {

        /* renamed from: a */
        public boolean f157216a;

        /* renamed from: b */
        public boolean f157217b;

        /* renamed from: c */
        public boolean f157218c;

        /* renamed from: d */
        public boolean f157219d;

        public C55211a() {
            this(false, false, false, false, 15, (C8480h) null);
        }

        public C55211a(boolean z, boolean z2, boolean z3, boolean z4, int i, C8480h hVar) {
            z = (i & 1) != 0 ? true : z;
            z2 = (i & 2) != 0 ? true : z2;
            z3 = (i & 4) != 0 ? true : z3;
            z4 = (i & 8) != 0 ? true : z4;
            this.f157216a = z;
            this.f157217b = z2;
            this.f157218c = z3;
            this.f157219d = z4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C55211a)) {
                return false;
            }
            C55211a aVar = (C55211a) obj;
            return this.f157216a == aVar.f157216a && this.f157217b == aVar.f157217b && this.f157218c == aVar.f157218c && this.f157219d == aVar.f157219d;
        }

        public int hashCode() {
            boolean z = this.f157216a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f157217b;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f157218c;
            if (z4) {
                z4 = true;
            }
            int i3 = (i2 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f157219d;
            if (!z5) {
                z2 = z5;
            }
            return i3 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "LiveDynamicConfig(enableLandscape=" + this.f157216a + ", enableCheckPhoneNum=" + this.f157217b + ", enableVisitorPolicyPage=" + this.f157218c + ", enableVerifyPage=" + this.f157219d + ')';
        }
    }

    /* renamed from: com.tencent.mm.live.model.RoomLiveService$c */
    public static final class C55212c {

        /* renamed from: a */
        public String f157220a;

        /* renamed from: b */
        public int f157221b;

        /* renamed from: c */
        public int f157222c;

        /* renamed from: d */
        public int f157223d;

        public C55212c() {
            this((String) null, 0, 0, 0, 15, (C8480h) null);
        }

        public C55212c(String str, int i, int i2, int i3, int i4, C8480h hVar) {
            str = (i4 & 1) != 0 ? "" : str;
            i = (i4 & 2) != 0 ? 0 : i;
            i2 = (i4 & 4) != 0 ? 0 : i2;
            i3 = (i4 & 8) != 0 ? 0 : i3;
            C87412m.m108594g(str, "userId");
            this.f157220a = str;
            this.f157221b = i;
            this.f157222c = i2;
            this.f157223d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C55212c)) {
                return false;
            }
            C55212c cVar = (C55212c) obj;
            return C87412m.m108589b(this.f157220a, cVar.f157220a) && this.f157221b == cVar.f157221b && this.f157222c == cVar.f157222c && this.f157223d == cVar.f157223d;
        }

        public int hashCode() {
            return (((((this.f157220a.hashCode() * 31) + this.f157221b) * 31) + this.f157222c) * 31) + this.f157223d;
        }

        public String toString() {
            return "LiveSmallWindowInfo(userId=" + this.f157220a + ", streamType=" + this.f157221b + ", width=" + this.f157222c + ", height=" + this.f157223d + ')';
        }
    }

    /* renamed from: com.tencent.mm.live.model.RoomLiveService$d */
    public static final class C55213d {

        /* renamed from: a */
        public boolean f157224a;

        /* renamed from: b */
        public boolean f157225b;

        /* renamed from: c */
        public boolean f157226c;

        /* renamed from: d */
        public boolean f157227d;

        public C55213d() {
            this(false, false, false, false, 15, (C8480h) null);
        }

        public C55213d(boolean z, boolean z2, boolean z3, boolean z4, int i, C8480h hVar) {
            z = (i & 1) != 0 ? false : z;
            z2 = (i & 2) != 0 ? false : z2;
            z3 = (i & 4) != 0 ? false : z3;
            z4 = (i & 8) != 0 ? false : z4;
            this.f157224a = z;
            this.f157225b = z2;
            this.f157226c = z3;
            this.f157227d = z4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C55213d)) {
                return false;
            }
            C55213d dVar = (C55213d) obj;
            return this.f157224a == dVar.f157224a && this.f157225b == dVar.f157225b && this.f157226c == dVar.f157226c && this.f157227d == dVar.f157227d;
        }

        public int hashCode() {
            boolean z = this.f157224a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f157225b;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f157226c;
            if (z4) {
                z4 = true;
            }
            int i3 = (i2 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f157227d;
            if (!z5) {
                z2 = z5;
            }
            return i3 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "LiveStatus(liveFinished=" + this.f157224a + ", liveStarted=" + this.f157225b + ", liveHasError=" + this.f157226c + ", liveJumpToOtherUI=" + this.f157227d + ')';
        }
    }

    static {
        C36624a aVar = new C36624a((HashMap) null, 1, (C8480h) null);
        aVar.f97362a.put(0, 60);
        aVar.f97362a.put(1, -1);
        aVar.f97362a.put(4, -1);
        aVar.f97362a.put(2, -1);
        aVar.f97362a.put(5, -1);
        aVar.f97362a.put(3, -1);
        f157191b = aVar;
        RoomLiveService$mCheckDeviceLsn$1 roomLiveService$mCheckDeviceLsn$1 = new RoomLiveService$mCheckDeviceLsn$1(C40008f.f107254d);
        roomLiveService$mCheckDeviceLsn$1.alive();
    }

    /* renamed from: a */
    public final String mo76443a(String str) {
        String str2;
        Class cls = C75339i.class;
        if (str == null) {
            return "";
        }
        String Si = ((C75339i) C86312j.m106911c(cls)).mo62515Si(str);
        if (Util.isNullOrNil(Si)) {
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(f157192c);
            if (Lo == null) {
                str2 = ((C75339i) C86312j.m106911c(cls)).getDisplayName(str);
            } else {
                Si = Lo.mo69789q2(str);
                if (Util.isNullOrNil(Si)) {
                    str2 = ((C75339i) C86312j.m106911c(cls)).getDisplayName(str);
                }
            }
            C87412m.m108593f(str2, "{\n            var result…         result\n        }");
            return str2;
        }
        str2 = Si;
        C87412m.m108593f(str2, "{\n            var result…         result\n        }");
        return str2;
    }

    /* renamed from: b */
    public final void mo76444b() {
        Context context = f157187S;
        if (context != null && (context instanceof Activity)) {
            if (f157188T) {
                if (C54655b.f153178f1 == null) {
                    C54655b.f153178f1 = new C54655b();
                }
                C54655b bVar = C54655b.f153178f1;
                C87412m.m108591d(bVar);
                bVar.mo75580f0();
            } else {
                if (C62197e.f176819i1 == null) {
                    C62197e.f176819i1 = new C62197e();
                }
                C62197e eVar = C62197e.f176819i1;
                C87412m.m108591d(eVar);
                eVar.mo75580f0();
            }
            ((Activity) context).finishAndRemoveTask();
        }
    }

    /* renamed from: c */
    public final String mo76445c() {
        int i = f157197h.f133057n;
        if (i <= 0) {
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.g7w);
            C87412m.m108593f(string, "{\n            MMApplicat…ike_count_zero)\n        }");
            return string;
        } else if (i < 10000) {
            return String.valueOf(i);
        } else {
            if (i % 10000 >= 1000) {
                String string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.g7u);
                C87412m.m108593f(string2, "getContext().resources.g…g.live_like_count_format)");
                String format = String.format(string2, Arrays.copyOf(new Object[]{Float.valueOf(((float) f157197h.f133057n) / 10000.0f)}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                return format;
            }
            String string3 = MMApplicationContext.getContext().getResources().getString(C0966R.string.g7v);
            C87412m.m108593f(string3, "getContext().resources.g…ve_like_count_int_format)");
            String format2 = String.format(string3, Arrays.copyOf(new Object[]{Integer.valueOf(f157197h.f133057n / 10000)}, 1));
            C87412m.m108593f(format2, "format(format, *args)");
            return format2;
        }
    }

    /* renamed from: d */
    public final void mo76446d() {
        f157209t.f157226c = true;
    }

    /* renamed from: e */
    public final void mo76447e() {
        Log.printInfoStack("MicroMsg.LiveDataManager", "resetData", new Object[0]);
        f157202m = 0;
        f157192c = "";
        f157193d.clear();
        f157194e.clear();
        f157196g = null;
        f157197h = new C49317ep2();
        f157198i = null;
        C53979a aVar = f157185Q;
        aVar.f151226a = null;
        aVar.f151227b = null;
        aVar.f151228c = null;
        aVar.f151229d = null;
        aVar.f151230e = null;
        aVar.f151231f = null;
        aVar.f151232g = null;
        aVar.f151234i = null;
        aVar.f151233h.clear();
        aVar.f151235j = "";
        f157195f.clear();
        f157199j = "";
        f157200k = 0;
        f157201l = null;
        f157203n = new C50710oo2();
        f157204o = false;
        f157205p = -1;
        f157206q = "";
        f157207r = "";
        f157211v = new C55211a(false, false, false, false, 15, (C8480h) null);
        f157212w = new C55212c((String) null, 0, 0, 0, 15, (C8480h) null);
        f157208s = false;
        f157209t = new C55213d(false, false, false, false, 15, (C8480h) null);
        f157210u = new C1270b(false, (String) null, false, 7, (C8480h) null);
        f157187S = null;
        f157188T = false;
    }

    /* renamed from: f */
    public final void mo76448f(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        f157188T = z;
        f157187S = context;
        int i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("MMLiveConfigBitSet"), 0);
        f157211v.f157216a = !C61926c.m72696u(i, 1);
        f157211v.f157217b = !C61926c.m72696u(i, 2);
        f157211v.f157218c = !C61926c.m72696u(i, 4);
        f157211v.f157219d = !C61926c.m72696u(i, 8);
    }
}
