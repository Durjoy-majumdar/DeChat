package p656py;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.surface.magiclivecard.p950mb.C85486a;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import i70.C87667c;
import k70.C88119c;
import nx2.C89096b;
import o40.C61926c;
import ox2.C89299a;
import ox2.C89302b;
import p671qy.C63343g;
import p671qy.C63344h;
import px2.C89442a;
import zt3.C119157j;

@C86522b
/* renamed from: py.f */
public final class C89444f extends C86301e implements C63344h, C63343g {
    /* renamed from: Eu */
    public void mo88242Eu(String str) {
        C87412m.m108594g(str, "id");
        C89096b bVar = C89096b.f256754a;
        C85486a aVar = C89096b.f256755b;
        if (aVar != null) {
            aVar.mo122097y0(str);
        }
    }

    /* renamed from: Ji */
    public void mo88243Ji(C63344h.C63346b bVar) {
        if (!C89096b.f256754a.mo123437c()) {
            Log.m105920e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "setFinderLiveCallback not open!");
            return;
        }
        C85486a aVar = C89096b.f256755b;
        if (aVar != null) {
            aVar.f249134u = bVar;
        }
    }

    /* renamed from: Pc */
    public void mo88244Pc(C63344h.C63346b bVar) {
        if (!C89096b.f256754a.mo123437c()) {
            Log.m105920e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "setFinderLiveCallback not open!");
            return;
        }
        C85486a aVar = C89096b.f256755b;
        if (aVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("setFinderLiveCallback callback:");
            sb.append(bVar);
            sb.append(" hashCode:");
            C63344h.C63346b bVar2 = aVar.f249133t;
            int i = 0;
            sb.append(bVar2 != null ? bVar2.hashCode() : 0);
            sb.append(" callback hashcode:");
            if (bVar != null) {
                i = bVar.hashCode();
            }
            sb.append(i);
            Log.m105918d("MicroMsg.SurfaceApp.MagicLiveCardService", sb.toString());
            aVar.f249133t = bVar;
        }
    }

    /* renamed from: QC */
    public String mo88245QC() {
        C40427l0 l0Var;
        C89096b bVar = C89096b.f256754a;
        C85486a aVar = C89096b.f256755b;
        if (aVar == null || (l0Var = aVar.mo118858C0().mo123643f()) == null) {
            l0Var = null;
        }
        C89299a aVar2 = new C89299a();
        String c = l0Var != null ? C88119c.f254874a.mo122516c(l0Var) : C88119c.f254874a.mo122516c(aVar2.mo123643f());
        ((C119157j) C119157j.f356862d).mo183878i(new C89302b(aVar2), 3000);
        Log.m105924i("MicroMsg.MagicLiveCardOuterService", "getFinderLiveGameAppVersion version:" + c);
        return c;
    }

    public String Xv0() {
        return "portrait_game_outfits_data_available";
    }

    public void destroy() {
        C89096b.f256754a.mo123436b();
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountReleased(context);
        C89096b.f256754a.mo123436b();
    }

    public void oo0(String str) {
        C87412m.m108594g(str, "frameSetName");
        C89442a.f257487a.mo123763b(str);
    }

    public C87667c<?, ?>.a qf0(Object obj, Context context, C63344h.C63345a aVar) {
        C87412m.m108594g(obj, "target");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "extData");
        C89096b bVar = C89096b.f256754a;
        String str = "?finderUsername=" + aVar.f179711a + "&objectId=" + C61926c.m72691p(aVar.f179712b);
        if (aVar.f179713c.length() > 0) {
            str = str + "&uxinfo=" + aVar.f179713c;
        }
        String str2 = str;
        C85486a aVar2 = C89096b.f256755b;
        if (aVar2 != null) {
            return aVar2.mo122091i0(obj, context, "wxe208ce76dfa39515", "frames", str2);
        }
        return null;
    }

    /* renamed from: t */
    public void mo88248t() {
        C89096b.f256754a.mo123435a(2000);
    }

    /* renamed from: xp */
    public String mo88249xp() {
        return "wxe208ce76dfa39515";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* renamed from: zf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo88250zf(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "appId"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "MicroMsg.MagicLiveCardOuterService"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "register appId:"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            nx2.b r0 = nx2.C89096b.f256754a
            monitor-enter(r0)
            boolean r1 = r0.mo123437c()     // Catch:{ all -> 0x009f }
            if (r1 != 0) goto L_0x002f
            java.lang.String r6 = "MicroMsg.SurfaceApp.MagicLiveCardMgr"
            java.lang.String r1 = "register not open!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)     // Catch:{ all -> 0x009f }
            monitor-exit(r0)
            goto L_0x009e
        L_0x002f:
            com.tencent.mm.sdk.platformtools.MMHandler r1 = nx2.C89096b.f256756c     // Catch:{ all -> 0x009f }
            fy3.a<rx3.b0> r2 = nx2.C89096b.f256758e     // Catch:{ all -> 0x009f }
            nx2.b$c r3 = new nx2.b$c     // Catch:{ all -> 0x009f }
            r3.<init>(r2)     // Catch:{ all -> 0x009f }
            r1.removeCallbacks(r3)     // Catch:{ all -> 0x009f }
            com.tencent.mm.plugin.surface.magiclivecard.mb.a r1 = nx2.C89096b.f256755b     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x004f
            java.lang.String r6 = "MicroMsg.SurfaceApp.MagicLiveCardMgr"
            java.lang.String r1 = "has registered"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)     // Catch:{ all -> 0x009f }
            com.tencent.mm.plugin.surface.magiclivecard.mb.a r6 = nx2.C89096b.f256755b     // Catch:{ all -> 0x009f }
            if (r6 == 0) goto L_0x004d
            r6.mo118859D0()     // Catch:{ all -> 0x009f }
        L_0x004d:
            monitor-exit(r0)
            goto L_0x009e
        L_0x004f:
            com.tencent.mm.plugin.surface.magiclivecard.mb.a r1 = new com.tencent.mm.plugin.surface.magiclivecard.mb.a     // Catch:{ all -> 0x009f }
            r1.<init>()     // Catch:{ all -> 0x009f }
            r1.mo118863q0()     // Catch:{ all -> 0x009f }
            nx2.d r2 = new nx2.d     // Catch:{ all -> 0x009f }
            r2.<init>()     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r3.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r4 = "register AppId:"
            r3.append(r4)     // Catch:{ all -> 0x009f }
            r3.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x009f }
            java.lang.String r4 = "MicroMsg.SurfaceApp.MagicLiveCardService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)     // Catch:{ all -> 0x009f }
            r1.f249135v = r2     // Catch:{ all -> 0x009f }
            r1.mo118859D0()     // Catch:{ all -> 0x009f }
            nx2.C89096b.f256755b = r1     // Catch:{ all -> 0x009f }
            dx2.g r1 = dx2.C7533g.f25793a     // Catch:{ all -> 0x009f }
            java.lang.String r2 = ""
            r1.mo8658a(r2)     // Catch:{ all -> 0x009f }
            dx2.d r1 = dx2.C31343d.f83890a     // Catch:{ all -> 0x009f }
            r1.mo58076a(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = "MicroMsg.SurfaceApp.MagicLiveCardMgr"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r2.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r3 = "register AppId:"
            r2.append(r3)     // Catch:{ all -> 0x009f }
            r2.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x009f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)     // Catch:{ all -> 0x009f }
            monitor-exit(r0)
        L_0x009e:
            return
        L_0x009f:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p656py.C89444f.mo88250zf(java.lang.String):void");
    }
}
