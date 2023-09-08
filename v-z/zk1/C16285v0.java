package zk1;

import androidx.fragment.app.Fragment;
import cj1.C54738b1;
import com.tencent.p014mm.autogen.events.FinderLiveSquareStatusEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import ps3.C12005b;
import rx3.C13598b0;
import up1.C37521f;

/* renamed from: zk1.v0 */
public final class C16285v0 extends UIComponent {

    /* renamed from: j */
    public static long f43578j;

    /* renamed from: n */
    public static boolean f43579n;

    /* renamed from: o */
    public static boolean f43580o;

    /* renamed from: d */
    public C54738b1 f43581d;

    /* renamed from: e */
    public int f43582e = -1;

    /* renamed from: f */
    public boolean f43583f;

    /* renamed from: g */
    public boolean f43584g;

    /* renamed from: h */
    public int f43585h;

    /* renamed from: i */
    public final Runnable f43586i = new C16287b(this);

    /* renamed from: zk1.v0$a */
    public static final class C16286a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C16285v0 f43587d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16286a(C16285v0 v0Var) {
            super(0);
            this.f43587d = v0Var;
        }

        public Object invoke() {
            C16285v0 v0Var = this.f43587d;
            C37521f.f99374d.getClass();
            Integer n = C37521f.f99144C6.mo60266n();
            if (!(n.intValue() != 0)) {
                n = null;
            }
            Integer num = n;
            v0Var.f43585h = num != null ? num.intValue() : this.f43587d.f43585h;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zk1.v0$b */
    public static final class C16287b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C16285v0 f43588d;

        public C16287b(C16285v0 v0Var) {
            this.f43588d = v0Var;
        }

        public final void run() {
            Log.m105924i("FinderLiveWatchCountDownUIC", "notify nearby requestRefresh : " + C16285v0.f43578j);
            if (C16285v0.f43578j != 0) {
                ((C12005b) C86312j.m106911c(C12005b.class)).K60(C16285v0.f43578j, this.f43588d.f43583f);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16285v0(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        if ((gy3.C87412m.m108589b("temp_2", ((p185kq.C61130g) di3.C86312j.m106911c(r0)).mo33244gK()) || gy3.C87412m.m108589b("temp_30", ((p185kq.C61130g) di3.C86312j.m106911c(r0)).mo33244gK())) != false) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.Class<kq.g> r0 = p185kq.C61130g.class
            super.onCreate(r9)
            di3.d r9 = di3.C86312j.m106911c(r0)
            kq.g r9 = (p185kq.C61130g) r9
            java.lang.String r9 = r9.mo33244gK()
            java.lang.String r1 = "temp_18"
            boolean r9 = gy3.C87412m.m108589b(r1, r9)
            r1 = 1
            r2 = 0
            if (r9 != 0) goto L_0x004d
            boolean r9 = f43579n
            if (r9 == 0) goto L_0x004b
            di3.d r9 = di3.C86312j.m106911c(r0)
            kq.g r9 = (p185kq.C61130g) r9
            java.lang.String r9 = r9.mo33244gK()
            java.lang.String r3 = "temp_2"
            boolean r9 = gy3.C87412m.m108589b(r3, r9)
            if (r9 != 0) goto L_0x0047
            di3.d r9 = di3.C86312j.m106911c(r0)
            kq.g r9 = (p185kq.C61130g) r9
            java.lang.String r9 = r9.mo33244gK()
            java.lang.String r3 = "temp_30"
            boolean r9 = gy3.C87412m.m108589b(r3, r9)
            if (r9 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r9 = 0
            goto L_0x0048
        L_0x0047:
            r9 = 1
        L_0x0048:
            if (r9 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r9 = 0
            goto L_0x004e
        L_0x004d:
            r9 = 1
        L_0x004e:
            r8.f43583f = r9
            cj1.b1$a r9 = cj1.C54738b1.f153409B
            android.content.Intent r3 = r8.getIntent()
            cj1.b1 r9 = r9.mo560b(r3)
            r8.f43581d = r9
            if (r9 == 0) goto L_0x0082
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r9.f153429r
            r4 = 0
            if (r3 == 0) goto L_0x0067
            long r6 = r3.f164794id
            goto L_0x0068
        L_0x0067:
            r6 = r4
        L_0x0068:
            f43578j = r6
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0082
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r3 = r9.f153423l
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0082
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r9 = r9.f153423l
            java.lang.Object r9 = r9.get(r2)
            com.tencent.mm.live.api.LiveConfig r9 = (com.tencent.p014mm.live.api.LiveConfig) r9
            long r3 = r9.f157075s
            f43578j = r3
        L_0x0082:
            boolean r9 = r8.f43583f
            if (r9 != 0) goto L_0x0097
            cj1.b1 r9 = r8.f43581d
            if (r9 == 0) goto L_0x0091
            te3.eq2 r9 = r9.f153411A
            if (r9 == 0) goto L_0x0091
            boolean r9 = r9.f183024o
            goto L_0x0093
        L_0x0091:
            boolean r9 = f43580o
        L_0x0093:
            if (r9 == 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r1 = 0
        L_0x0097:
            r8.f43584g = r1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "onCreate isFromRed: "
            r9.append(r1)
            boolean r1 = r8.f43583f
            r9.append(r1)
            java.lang.String r1 = " lastFromRed: "
            r9.append(r1)
            boolean r1 = f43579n
            r9.append(r1)
            java.lang.String r1 = " , scene = "
            r9.append(r1)
            di3.d r0 = di3.C86312j.m106911c(r0)
            kq.g r0 = (p185kq.C61130g) r0
            java.lang.String r0 = r0.mo33244gK()
            r9.append(r0)
            java.lang.String r0 = " isEnableRecom: "
            r9.append(r0)
            boolean r0 = r8.f43584g
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "FinderLiveWatchCountDownUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            boolean r9 = r8.f43583f
            f43579n = r9
            boolean r9 = r8.f43584g
            f43580o = r9
            ok1.e r9 = ok1.C62042e.f176370a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = r9.mo87106p0()
            java.lang.String r1 = "finder_live_watch_count_down_refresh_interval"
            int r9 = r9.getInt(r1, r2)
            r8.f43585h = r9
            hm1.a r9 = hm1.C32946a.f89535a
            zk1.v0$a r1 = new zk1.v0$a
            r1.<init>(r8)
            r9.mo58884a(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "onCreate objectId = "
            r9.append(r1)
            long r1 = f43578j
            r9.append(r1)
            java.lang.String r1 = " refreshInterval = "
            r9.append(r1)
            int r1 = r8.f43585h
            r9.append(r1)
            java.lang.String r1 = " isFromRed: "
            r9.append(r1)
            boolean r1 = r8.f43583f
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            int r9 = r8.f43585h
            if (r9 == 0) goto L_0x0133
            boolean r0 = r8.f43584g
            if (r0 == 0) goto L_0x0133
            long r0 = (long) r9
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.Runnable r9 = r8.f43586i
            o40.C61926c.m72667L(r0, r9)
        L_0x0133:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zk1.C16285v0.onCreate(android.os.Bundle):void");
    }

    public void onPreDestroyed() {
        super.onPreDestroyed();
        C61926c.m72698w(this.f43586i);
        if (this.f43584g) {
            ((C12005b) C86312j.m106911c(C12005b.class)).mo11146w0();
        }
        if (this.f43583f) {
            FinderLiveSquareStatusEvent finderLiveSquareStatusEvent = new FinderLiveSquareStatusEvent();
            finderLiveSquareStatusEvent.f9220d.f9221a = 1;
            finderLiveSquareStatusEvent.publish();
        }
        Log.m105924i("FinderLiveWatchCountDownUIC", "onDestroy isEnableRecom: " + this.f43584g + " isFromRed: 4isFromRed");
    }
}
