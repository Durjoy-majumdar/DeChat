package zk1;

import androidx.appcompat.app.AppCompatActivity;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import o40.C61926c;
import org.json.JSONObject;
import pe3.C89349b;
import te3.C49842ig0;
import te3.C51822we1;
import te3.C51986xk2;
import te3.C52025xv;
import te3.C64414h71;
import te3.C64811wq0;
import z04.C112551y;
import z04.C119027c;

/* renamed from: zk1.s0 */
public final class C66880s0 extends UIComponent {

    /* renamed from: d */
    public final String f192134d = ("FinderLiveVisitorReportUIC@" + hashCode() + '}');

    /* renamed from: e */
    public int f192135e;

    /* renamed from: f */
    public int f192136f;

    /* renamed from: g */
    public C52025xv f192137g;

    /* renamed from: h */
    public C89349b f192138h;

    /* renamed from: i */
    public String f192139i = "";

    /* renamed from: j */
    public String f192140j = "";

    /* renamed from: n */
    public boolean f192141n;

    /* renamed from: o */
    public int f192142o = -1;

    /* renamed from: p */
    public int f192143p = -1;

    /* renamed from: q */
    public String f192144q = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66880s0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final String mo90875c3(String str) {
        if (str == null) {
            return "";
        }
        boolean z = true;
        if (!(this.f192144q.length() > 0)) {
            return str;
        }
        try {
            if (str.length() != 0) {
                z = false;
            }
            JSONObject jSONObject = z ? new JSONObject() : new JSONObject(C112551y.m153814n(str, ";", ",", false));
            jSONObject.put("session_type", this.f192142o);
            jSONObject.put("share_username", this.f192144q);
            jSONObject.put("is_enterprise", this.f192143p);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "json.toString()");
            return C112551y.m153814n(jSONObject2, ",", ";", false);
        } catch (Exception e) {
            String str2 = this.f192134d;
            Log.m105924i(str2, "append ChatFields err: " + e.getMessage());
            return str;
        }
    }

    /* renamed from: d3 */
    public final void mo90876d3(C64811wq0 wq02) {
        C89349b bVar;
        String str;
        C87412m.m108594g(wq02, "request");
        FinderLiveService.f159376d.getClass();
        C45795b bVar2 = FinderLiveService.f159348A;
        if (bVar2 == null || (str = ((C54991o) bVar2.mo71262a(C54991o.class)).f154357q3) == null) {
            bVar = this.f192138h;
        } else {
            byte[] bytes = str.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            bVar = new C89349b(bytes, 0, bytes.length);
        }
        wq02.f186162B = bVar;
        String str2 = this.f192134d;
        Log.m105924i(str2, "[fillJoinLiveReq], request.ux_info = " + wq02.f186162B);
        wq02.f186164D = this.f192140j;
        this.f192140j = "";
    }

    /* renamed from: e3 */
    public final void mo90877e3(long j, C49842ig0 ig02) {
        LinkedList<C51822we1> linkedList;
        if (!(this.f192139i == null || ig02 == null || (linkedList = ig02.f135319n) == null)) {
            C51822we1 we12 = new C51822we1();
            we12.f143984d = j;
            we12.f143985e = this.f192139i;
            String str = this.f192134d;
            Log.m105924i(str, "fillObjectBaseInfoOnce id:" + C61926c.m72691p(we12.f143984d) + ", jumperSessionBuffer:" + we12.f143985e);
            linkedList.add(we12);
        }
        this.f192139i = null;
    }

    /* renamed from: f3 */
    public final void mo90878f3(C64414h71 h712) {
        C87412m.m108594g(h712, "baseInfo");
        h712.f183435r = this.f192135e;
        if (h712.f183442y == null) {
            h712.f183442y = new C51986xk2();
        }
        C51986xk2 xk22 = h712.f183442y;
        if (xk22 != null) {
            xk22.f144719d = this.f192136f;
        }
        C52025xv xvVar = this.f192137g;
        if (xvVar != null) {
            h712.f183440w = xvVar;
        }
        String str = this.f192134d;
        StringBuilder sb = new StringBuilder();
        sb.append("fillReportBaseInfo noticeType:");
        sb.append(this.f192135e);
        sb.append(", notificationMsgType:");
        sb.append(this.f192136f);
        sb.append(", chnlExtraInfo:");
        C52025xv xvVar2 = this.f192137g;
        sb.append(C61926c.m72691p(xvVar2 != null ? xvVar2.f144988d : 0));
        sb.append(", ");
        C52025xv xvVar3 = this.f192137g;
        sb.append(xvVar3 != null ? Integer.valueOf(xvVar3.f144989e) : null);
        Log.m105924i(str, sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r7 = ((cl1.C55001u) r7.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            fj1.b$a r7 = fj1.C45795b.f123697j
            fj1.b r7 = fj1.C45795b.f123698n
            r0 = 0
            if (r7 == 0) goto L_0x001a
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            androidx.lifecycle.i0 r7 = r7.mo71262a(r2)
            cl1.u r7 = (cl1.C55001u) r7
            te3.c21 r7 = r7.f154420q
            if (r7 == 0) goto L_0x001a
            long r2 = r7.f182392d
            goto L_0x001b
        L_0x001a:
            r2 = r0
        L_0x001b:
            cj1.b1$a r7 = cj1.C54738b1.f153409B
            android.content.Intent r4 = r6.getIntent()
            cj1.b1 r7 = r7.mo560b(r4)
            r4 = 0
            if (r7 != 0) goto L_0x0039
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0039
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r7.getClass()
            al1.i r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r7 == 0) goto L_0x0038
            cj1.b1 r7 = r7.f151991f
            goto L_0x0039
        L_0x0038:
            r7 = r4
        L_0x0039:
            r0 = 0
            if (r7 == 0) goto L_0x0043
            te3.eq2 r1 = r7.f153411A
            if (r1 == 0) goto L_0x0043
            int r1 = r1.f183016d
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            r6.f192135e = r1
            if (r7 == 0) goto L_0x004f
            te3.eq2 r1 = r7.f153411A
            if (r1 == 0) goto L_0x004f
            int r1 = r1.f183028s
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            r6.f192136f = r1
            if (r7 == 0) goto L_0x005b
            te3.eq2 r1 = r7.f153411A
            if (r1 == 0) goto L_0x005b
            te3.xv r1 = r1.f183029t
            goto L_0x005c
        L_0x005b:
            r1 = r4
        L_0x005c:
            r6.f192137g = r1
            if (r7 == 0) goto L_0x0067
            te3.eq2 r1 = r7.f153411A
            if (r1 == 0) goto L_0x0067
            pe3.b r1 = r1.f183017e
            goto L_0x0068
        L_0x0067:
            r1 = r4
        L_0x0068:
            r6.f192138h = r1
            if (r7 == 0) goto L_0x0073
            te3.eq2 r1 = r7.f153411A
            if (r1 == 0) goto L_0x0073
            java.lang.String r1 = r1.f183018f
            goto L_0x0074
        L_0x0073:
            r1 = r4
        L_0x0074:
            r6.f192139i = r1
            if (r7 == 0) goto L_0x007b
            te3.eq2 r1 = r7.f153411A
            goto L_0x007c
        L_0x007b:
            r1 = r4
        L_0x007c:
            if (r1 != 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r1.f183018f = r4
        L_0x0081:
            if (r7 == 0) goto L_0x008a
            te3.eq2 r1 = r7.f153411A
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = r1.f183019g
            goto L_0x008b
        L_0x008a:
            r1 = r4
        L_0x008b:
            r6.f192140j = r1
            if (r7 == 0) goto L_0x0092
            te3.eq2 r1 = r7.f153411A
            goto L_0x0093
        L_0x0092:
            r1 = r4
        L_0x0093:
            if (r1 != 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r1.f183019g = r4
        L_0x0098:
            r1 = -1
            if (r7 == 0) goto L_0x00a2
            te3.eq2 r2 = r7.f153411A
            if (r2 == 0) goto L_0x00a2
            int r2 = r2.f183020h
            goto L_0x00a3
        L_0x00a2:
            r2 = -1
        L_0x00a3:
            r6.f192142o = r2
            if (r7 == 0) goto L_0x00ad
            te3.eq2 r2 = r7.f153411A
            if (r2 == 0) goto L_0x00ad
            int r1 = r2.f183022j
        L_0x00ad:
            r6.f192143p = r1
            if (r7 == 0) goto L_0x00b7
            te3.eq2 r1 = r7.f153411A
            if (r1 == 0) goto L_0x00b7
            java.lang.String r4 = r1.f183021i
        L_0x00b7:
            if (r4 != 0) goto L_0x00bb
            java.lang.String r4 = ""
        L_0x00bb:
            r6.f192144q = r4
            if (r7 == 0) goto L_0x00c5
            te3.eq2 r7 = r7.f153411A
            if (r7 == 0) goto L_0x00c5
            boolean r0 = r7.f183023n
        L_0x00c5:
            r6.f192141n = r0
            if (r0 == 0) goto L_0x00e8
            java.lang.Class<kq.g> r7 = p185kq.C61130g.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            kq.g r7 = (p185kq.C61130g) r7
            java.lang.String r0 = "194"
            r7.mo33246ry(r0)
            java.lang.Class<ak1.o> r7 = ak1.C54108o.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ak1.o r7 = (ak1.C54108o) r7
            r7.getClass()
            ak1.f0 r7 = ak1.C54108o.f151869h
            r7.getClass()
            r7.f151445a = r0
        L_0x00e8:
            java.lang.String r7 = r6.f192134d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onCreate noticeType:"
            r0.append(r1)
            int r1 = r6.f192135e
            r0.append(r1)
            java.lang.String r1 = ", notificationMsgType:"
            r0.append(r1)
            int r1 = r6.f192136f
            r0.append(r1)
            java.lang.String r1 = ", snsUxInfo:"
            r0.append(r1)
            pe3.b r1 = r6.f192138h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zk1.C66880s0.onCreate(android.os.Bundle):void");
    }
}
