package com.tencent.p014mm.autogen.events;

import b63.C0248u;
import b63.C67187h;
import com.tencent.p014mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C117747y;

/* renamed from: com.tencent.mm.autogen.events.WalletGetUserInfoEvent */
public final class WalletGetUserInfoEvent extends IEvent {

    /* renamed from: d */
    public C67824a f194038d = new C67824a();

    /* renamed from: e */
    public C67825b f194039e = new C67825b();

    /* renamed from: com.tencent.mm.autogen.events.WalletGetUserInfoEvent$a */
    public static final class C67824a {

        /* renamed from: a */
        public int f194040a;

        /* renamed from: b */
        public boolean f194041b;

        /* renamed from: c */
        public boolean f194042c = false;

        /* renamed from: d */
        public int f194043d = 0;
    }

    /* renamed from: com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b */
    public static final class C67825b {

        /* renamed from: A */
        public ECardInfo f194044A;

        /* renamed from: B */
        public boolean f194045B = false;

        /* renamed from: C */
        public int f194046C;

        /* renamed from: D */
        public int f194047D;

        /* renamed from: E */
        public boolean f194048E;

        /* renamed from: F */
        public String f194049F;

        /* renamed from: G */
        public C67187h f194050G;

        /* renamed from: H */
        public boolean f194051H;

        /* renamed from: I */
        public C117747y f194052I;

        /* renamed from: J */
        public ArrayList<C0248u> f194053J;

        /* renamed from: K */
        public String f194054K;

        /* renamed from: a */
        public Runnable f194055a;

        /* renamed from: b */
        public boolean f194056b;

        /* renamed from: c */
        public boolean f194057c;

        /* renamed from: d */
        public boolean f194058d;

        /* renamed from: e */
        public boolean f194059e;

        /* renamed from: f */
        public String f194060f;

        /* renamed from: g */
        public String f194061g;

        /* renamed from: h */
        public int f194062h = 0;

        /* renamed from: i */
        public String f194063i;

        /* renamed from: j */
        public boolean f194064j;

        /* renamed from: k */
        public boolean f194065k;

        /* renamed from: l */
        public String f194066l;

        /* renamed from: m */
        public String f194067m;

        /* renamed from: n */
        public String f194068n;

        /* renamed from: o */
        public String f194069o;

        /* renamed from: p */
        public String f194070p;

        /* renamed from: q */
        public int f194071q;

        /* renamed from: r */
        public String f194072r;

        /* renamed from: s */
        public int f194073s;

        /* renamed from: t */
        public String f194074t;

        /* renamed from: u */
        public String f194075u;

        /* renamed from: v */
        public String f194076v;

        /* renamed from: w */
        public String f194077w;

        /* renamed from: x */
        public String f194078x;

        /* renamed from: y */
        public String f194079y;

        /* renamed from: z */
        public LinkedList<String> f194080z;
    }

    public WalletGetUserInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletGetUserInfoEvent)) {
            return false;
        }
        WalletGetUserInfoEvent walletGetUserInfoEvent = (WalletGetUserInfoEvent) iEvent;
        C67824a aVar = walletGetUserInfoEvent.f194038d;
        if (!C46238a.m51546a(Integer.valueOf(this.f194038d.f194040a), Integer.valueOf(aVar.f194040a)) || !C46238a.m51546a(Boolean.valueOf(this.f194038d.f194041b), Boolean.valueOf(aVar.f194041b)) || !C46238a.m51546a(Boolean.valueOf(this.f194038d.f194042c), Boolean.valueOf(aVar.f194042c)) || !C46238a.m51546a(Integer.valueOf(this.f194038d.f194043d), Integer.valueOf(aVar.f194043d))) {
            return false;
        }
        C67825b bVar = walletGetUserInfoEvent.f194039e;
        return C46238a.m51546a(this.f194039e.f194055a, bVar.f194055a) && C46238a.m51546a(Boolean.valueOf(this.f194039e.f194056b), Boolean.valueOf(bVar.f194056b)) && C46238a.m51546a(Boolean.valueOf(this.f194039e.f194057c), Boolean.valueOf(bVar.f194057c)) && C46238a.m51546a(Boolean.valueOf(this.f194039e.f194058d), Boolean.valueOf(bVar.f194058d)) && C46238a.m51546a(Boolean.valueOf(this.f194039e.f194059e), Boolean.valueOf(bVar.f194059e)) && C46238a.m51546a(this.f194039e.f194060f, bVar.f194060f) && C46238a.m51546a(this.f194039e.f194061g, bVar.f194061g) && C46238a.m51546a(Integer.valueOf(this.f194039e.f194062h), Integer.valueOf(bVar.f194062h)) && C46238a.m51546a(this.f194039e.f194063i, bVar.f194063i) && C46238a.m51546a(Boolean.valueOf(this.f194039e.f194064j), Boolean.valueOf(bVar.f194064j)) && C46238a.m51546a(Boolean.valueOf(this.f194039e.f194065k), Boolean.valueOf(bVar.f194065k)) && C46238a.m51546a(this.f194039e.f194066l, bVar.f194066l) && C46238a.m51546a(this.f194039e.f194067m, bVar.f194067m) && C46238a.m51546a(this.f194039e.f194068n, bVar.f194068n) && C46238a.m51546a(this.f194039e.f194069o, bVar.f194069o) && C46238a.m51546a(this.f194039e.f194070p, bVar.f194070p) && C46238a.m51546a(Integer.valueOf(this.f194039e.f194071q), Integer.valueOf(bVar.f194071q)) && C46238a.m51546a(this.f194039e.f194072r, bVar.f194072r) && C46238a.m51546a(Integer.valueOf(this.f194039e.f194073s), Integer.valueOf(bVar.f194073s)) && C46238a.m51546a(this.f194039e.f194074t, bVar.f194074t) && C46238a.m51546a(this.f194039e.f194075u, bVar.f194075u) && C46238a.m51546a(this.f194039e.f194076v, bVar.f194076v) && C46238a.m51546a(this.f194039e.f194077w, bVar.f194077w) && C46238a.m51546a(this.f194039e.f194078x, bVar.f194078x) && C46238a.m51546a(this.f194039e.f194079y, bVar.f194079y) && C46238a.m51546a(this.f194039e.f194080z, bVar.f194080z) && C46238a.m51546a(this.f194039e.f194044A, bVar.f194044A) && C46238a.m51546a(Boolean.valueOf(this.f194039e.f194045B), Boolean.valueOf(bVar.f194045B)) && C46238a.m51546a(Integer.valueOf(this.f194039e.f194046C), Integer.valueOf(bVar.f194046C)) && C46238a.m51546a(Integer.valueOf(this.f194039e.f194047D), Integer.valueOf(bVar.f194047D)) && C46238a.m51546a(Boolean.valueOf(this.f194039e.f194048E), Boolean.valueOf(bVar.f194048E)) && C46238a.m51546a(this.f194039e.f194049F, bVar.f194049F) && C46238a.m51546a(this.f194039e.f194050G, bVar.f194050G) && C46238a.m51546a(Boolean.valueOf(this.f194039e.f194051H), Boolean.valueOf(bVar.f194051H)) && C46238a.m51546a(this.f194039e.f194052I, bVar.f194052I) && C46238a.m51546a(this.f194039e.f194053J, bVar.f194053J) && C46238a.m51546a(this.f194039e.f194054K, bVar.f194054K);
    }
}
