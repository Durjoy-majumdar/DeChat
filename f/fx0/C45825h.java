package fx0;

import android.content.Context;
import android.util.Base64;
import android.webkit.ValueCallback;
import com.tencent.p014mm.autogen.events.BizTimeLineTopBarVideoChannelEntryChangedEvent;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.BizTLRecCardJsEngine;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import fy0.C20739g;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import jw0.C9533e;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import org.xwalk.core.XWalkEnvironment;
import p564iq.C87790d;
import pe3.C47465a;
import q73.C89547f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49148di;
import te3.C50214l42;
import te3.C50352m42;
import te3.cr4;
import te3.gr4;

/* renamed from: fx0.h */
public final class C45825h {

    /* renamed from: a */
    public static final C45825h f123727a = new C45825h();

    /* renamed from: b */
    public static String f123728b = "";

    /* renamed from: c */
    public static Boolean f123729c;

    /* renamed from: d */
    public static gr4 f123730d;

    /* renamed from: e */
    public static final C13601g f123731e = C36568h.m40985a(C32206c.f85608d);

    /* renamed from: f */
    public static final C13601g f123732f = C36568h.m40985a(C32205b.f85607d);

    /* renamed from: g */
    public static final C13601g f123733g = C36568h.m40985a(C32207d.f85609d);

    /* renamed from: fx0.h$b */
    public static final class C32205b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C32205b f85607d = new C32205b();

        public C32205b() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C45825h.f123727a.mo71291b().decodeInt("BizTimeLineChannelCanvasOpen", -1));
        }
    }

    /* renamed from: fx0.h$c */
    public static final class C32206c extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C32206c f85608d = new C32206c();

        public C32206c() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("brandService");
        }
    }

    /* renamed from: fx0.h$d */
    public static final class C32207d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C32207d f85609d = new C32207d();

        public C32207d() {
            super(0);
        }

        public Object invoke() {
            if (!((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND)) {
                return Boolean.FALSE;
            }
            C45825h hVar = C45825h.f123727a;
            C13601g gVar = C45825h.f123732f;
            if (((Number) ((C36570n) gVar).getValue()).intValue() != -1) {
                return (((Number) ((C36570n) gVar).getValue()).intValue() != 1 || C45825h.m51115f() == null) ? Boolean.FALSE : Boolean.TRUE;
            }
            gr4 f = C45825h.m51115f();
            StringBuilder sb = new StringBuilder();
            sb.append("showCanvas ");
            sb.append(f != null ? Integer.valueOf(f.f134235y) : null);
            Log.m105924i("MicroMsg.BizVideoChannelStrategy", sb.toString());
            return (f == null || f.f134235y != 1) ? Boolean.FALSE : Boolean.TRUE;
        }
    }

    /* renamed from: fx0.h$a */
    public static final class C45826a implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C45696d.C45697b f123734d;

        public C45826a(C45696d.C45697b bVar) {
            this.f123734d = bVar;
        }

        /* renamed from: a */
        public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            Log.m105925i("MicroMsg.BizVideoChannelStrategy", "alvinluo getNotifyAndChannelFeeds callback errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                C47465a aVar = cVar.f127056b.f127083a;
                if (aVar != null) {
                    C45696d.C45697b bVar = this.f123734d;
                    String str2 = ((C50352m42) aVar).f137832e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Log.m105919d("MicroMsg.BizVideoChannelStrategy", "alvinuo getNotifyAndChannelFeeds channelFeeds: %s", str2);
                    ((C45696d) C86709a0.m107533q(C45696d.class)).mo70979WX(str2);
                    if (bVar != null) {
                        bVar.onSuccess(str2);
                    }
                }
            } else {
                C45696d.C45697b bVar2 = this.f123734d;
                if (bVar2 != null) {
                    bVar2.mo63219a(i, i2, str);
                }
            }
            return 0;
        }
    }

    /* renamed from: f */
    public static final gr4 m51115f() {
        C47465a aVar;
        byte[] decodeBytes;
        if (f123730d == null) {
            MultiProcessMMKV b = f123727a.mo71291b();
            C87412m.m108593f(b, "mmkv");
            if (b.containsKey("biz_video_channel_top_bar_info") && (decodeBytes = b.decodeBytes("biz_video_channel_top_bar_info")) != null) {
                if (!(decodeBytes.length == 0)) {
                    try {
                        gr4 newInstance = gr4.class.newInstance();
                        newInstance.parseFrom(decodeBytes);
                        aVar = newInstance;
                    } catch (Exception e) {
                        Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e, "decode ProtoBuffer", new Object[0]);
                    }
                    f123730d = (gr4) aVar;
                }
            }
            aVar = null;
            f123730d = (gr4) aVar;
        }
        return f123730d;
    }

    /* renamed from: h */
    public static final boolean m51116h() {
        if (C9533e.f29718f) {
            return false;
        }
        Boolean bool = f123729c;
        C87412m.m108591d(bool);
        return bool.booleanValue();
    }

    /* renamed from: k */
    public static final void m51117k(C49148di diVar) {
        boolean z;
        C49148di diVar2 = diVar;
        C87412m.m108594g(diVar2, "resp");
        C45825h hVar = f123727a;
        int i = hVar.mo71291b().getInt("top_bar_video_channel_switch_option", 0);
        cr4 cr4 = diVar2.f132338h;
        if (cr4 != null) {
            hVar.mo71291b().encode("biz_video_channel_show_default_icon", 0);
            StringBuilder sb = new StringBuilder();
            sb.append("alvinluo onUpdateBizVideoChannelStrategy localSwitchOption: %d, switch_option: %d, appId: %s, title: %s, logo: %s, version: %d, funcVersion: %d, default_logo_url: ");
            gr4 gr4 = cr4.f131923e;
            byte[] bArr = null;
            sb.append(gr4 != null ? gr4.f134222i : null);
            sb.append(", control_bits: ");
            gr4 gr42 = cr4.f131923e;
            sb.append(gr42 != null ? Integer.valueOf(gr42.f134228r) : null);
            sb.append(", display_type=");
            gr4 gr43 = cr4.f131923e;
            sb.append(gr43 != null ? Integer.valueOf(gr43.f134235y) : null);
            sb.append(" showSmallIcon=");
            gr4 gr44 = cr4.f131923e;
            sb.append(gr44 != null ? Integer.valueOf(gr44.f134233w) : null);
            sb.append(" smallIconUrl=");
            gr4 gr45 = cr4.f131923e;
            sb.append(gr45 != null ? gr45.f134234x : null);
            String sb4 = sb.toString();
            Object[] objArr = new Object[7];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(cr4.f131922d);
            gr4 gr46 = cr4.f131923e;
            objArr[2] = gr46 != null ? gr46.f134218e : null;
            objArr[3] = gr46 != null ? gr46.f134217d : null;
            objArr[4] = gr46 != null ? gr46.f134220g : null;
            objArr[5] = gr46 != null ? Integer.valueOf(gr46.f134219f) : null;
            gr4 gr47 = cr4.f131923e;
            objArr[6] = gr47 != null ? Integer.valueOf(gr47.f134221h) : null;
            Log.m105925i("MicroMsg.BizVideoChannelStrategy", sb4, objArr);
            hVar.mo71291b().putInt("top_bar_video_channel_switch_option", cr4.f131922d);
            int i2 = cr4.f131922d;
            if (i2 == 2) {
                z = !C20739g.m22694f(cr4.f131923e, m51115f());
                gr4 gr48 = cr4.f131923e;
                f123730d = gr48;
                try {
                    MultiProcessMMKV b = hVar.mo71291b();
                    if (gr48 != null) {
                        bArr = gr48.toByteArray();
                    }
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    b.encode("biz_video_channel_top_bar_info", bArr);
                } catch (Exception unused) {
                }
                if (z && hVar.mo71294e()) {
                    BizTLRecCardJsEngine a = BizTLRecCardJsEngine.f247961Y.mo118094a();
                    String d = hVar.mo71293d();
                    synchronized (a) {
                        Log.m105924i(a.f257695B, "update #__biz_video_channel_canvas_id__");
                        if (!a.f257697D.containsKey("__biz_video_channel_canvas_id__")) {
                            Context context = MMApplicationContext.getContext();
                            C87412m.m108593f(context, "getContext()");
                            a.mo123863O1("vc", "__biz_video_channel_canvas_id__", d, context);
                        } else {
                            C89547f.m111944P1(a, "update", "__biz_video_channel_canvas_id__", (ValueCallback) null, 4, (Object) null);
                        }
                    }
                }
            } else {
                if (i2 == 0 || i2 == 1) {
                    hVar.mo71291b().encode("biz_video_channel_top_bar_info", new byte[0]);
                    f123730d = null;
                } else if (i2 == 3) {
                    try {
                        hVar.mo71291b().encode("biz_video_channel_top_bar_info", new byte[0]);
                        f123730d = null;
                    } catch (Exception unused2) {
                    }
                }
                z = false;
            }
            Boolean bool = f123729c;
            Boolean valueOf = Boolean.valueOf(cr4.f131922d == 2);
            f123729c = valueOf;
            Log.m105925i("MicroMsg.BizVideoChannelStrategy", "alvinluo onUpdateBizVideoChannelStrategy oldEntry: %b, new: %b, isTopBarInfoChanged: %b", bool, valueOf, Boolean.valueOf(z));
            if (!C87412m.m108589b(bool, f123729c) || z) {
                int i3 = cr4.f131922d;
                gr4 gr49 = f123730d;
                Log.m105924i("MicroMsg.BizVideoChannelStrategy", "alvinluo onTopBarVideoChannelEntryChanged");
                BizTimeLineTopBarVideoChannelEntryChangedEvent bizTimeLineTopBarVideoChannelEntryChangedEvent = new BizTimeLineTopBarVideoChannelEntryChangedEvent();
                BizTimeLineTopBarVideoChannelEntryChangedEvent.C40044a aVar = bizTimeLineTopBarVideoChannelEntryChangedEvent.f107385d;
                aVar.f107386a = i3;
                if (gr49 != null) {
                    aVar.f107387b = gr49;
                }
                bizTimeLineTopBarVideoChannelEntryChangedEvent.publish();
            }
        }
    }

    /* renamed from: a */
    public final String mo71290a(boolean z) {
        if (Util.isNullOrNil(f123728b) || z) {
            gr4 f = m51115f();
            if (f == null) {
                return "";
            }
            String nullAsNil = Util.nullAsNil(mo71295g() ? f.f134222i : f.f134220g);
            C87412m.m108593f(nullAsNil, "nullAsNil(if (isShowDefa…else topBarInfo.logo_url)");
            f123728b = nullAsNil;
        }
        return f123728b;
    }

    /* renamed from: b */
    public final MultiProcessMMKV mo71291b() {
        return (MultiProcessMMKV) ((C36570n) f123731e).getValue();
    }

    /* renamed from: c */
    public final void mo71292c(C45696d.C45697b bVar) {
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new C50214l42();
        bVar2.f127067b = new C50352m42();
        bVar2.f127068c = "/cgi-bin/mmbiz-bin/videochannel/getnotifyandchannelfeeds";
        bVar2.f127069d = 1814;
        C89144l0.m111429e(bVar2.mo72403a(), new C45826a(bVar), false);
    }

    /* renamed from: d */
    public final String mo71293d() {
        gr4 f = m51115f();
        if (f == null) {
            Log.m105928w("MicroMsg.BizVideoChannelStrategy", "getProtoData topBarInfo is null");
            return "";
        }
        byte[] encode = Base64.encode(f.toByteArray(), 2);
        C87412m.m108593f(encode, "encode(topBarInfo.toByteArray(), Base64.NO_WRAP)");
        Charset charset = StandardCharsets.UTF_8;
        C87412m.m108593f(charset, "UTF_8");
        return new String(encode, charset);
    }

    /* renamed from: e */
    public final boolean mo71294e() {
        return ((Boolean) ((C36570n) f123733g).getValue()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo71295g() {
        gr4 f = m51115f();
        return f != null && !Util.isNullOrNil(f.f134222i) && mo71291b().decodeInt("biz_video_channel_show_default_icon", 0) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (mo71291b().decodeInt("biz_video_channel_show_default_icon", -1) == -1) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if ((r1.f134228r & 4) != 0) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        if ((r1.f134228r & 8) != 0) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71296i(int r15, java.lang.String r16, java.lang.String r17) {
        /*
            r14 = this;
            r0 = r15
            te3.gr4 r1 = m51115f()
            r2 = 8
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x000e
        L_0x000c:
            r1 = 0
            goto L_0x0042
        L_0x000e:
            if (r0 != r3) goto L_0x0017
            int r6 = r1.f134228r
            r6 = r6 & r3
            if (r6 == 0) goto L_0x0017
        L_0x0015:
            r1 = 1
            goto L_0x0042
        L_0x0017:
            if (r0 != r5) goto L_0x0030
            int r1 = r1.f134228r
            r6 = r1 & 1
            if (r6 == 0) goto L_0x0020
            goto L_0x0015
        L_0x0020:
            if (r1 != 0) goto L_0x000c
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r14.mo71291b()
            r6 = -1
            java.lang.String r7 = "biz_video_channel_show_default_icon"
            int r1 = r1.decodeInt(r7, r6)
            if (r1 != r6) goto L_0x000c
            goto L_0x0015
        L_0x0030:
            r6 = 3
            r7 = 4
            if (r0 != r6) goto L_0x003a
            int r6 = r1.f134228r
            r6 = r6 & r7
            if (r6 == 0) goto L_0x003a
            goto L_0x0015
        L_0x003a:
            if (r0 != r7) goto L_0x000c
            int r1 = r1.f134228r
            r1 = r1 & r2
            if (r1 == 0) goto L_0x000c
            goto L_0x0015
        L_0x0042:
            if (r1 != 0) goto L_0x0045
            return
        L_0x0045:
            r6 = 1800000(0x1b7740, double:8.89318E-318)
            r8 = 0
            if (r0 == r5) goto L_0x0063
            if (r0 == r3) goto L_0x0063
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r14.mo71291b()
            java.lang.String r3 = "biz_video_channel_strategy_tl_fetch_last_time"
            long r10 = r1.getLong(r3, r8)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r14.mo71291b()
            java.lang.String r3 = "biz_video_channel_strategy_tl_fetch_interval"
            long r6 = r1.getLong(r3, r6)
            goto L_0x007e
        L_0x0063:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r14.mo71291b()
            java.lang.String r3 = "biz_video_channel_strategy_fetch_last_time"
            long r10 = r1.getLong(r3, r8)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r14.mo71291b()
            java.lang.String r3 = "biz_video_channel_strategy_fetch_interval"
            long r6 = r1.getLong(r3, r6)
            r12 = 300000(0x493e0, double:1.482197E-318)
            long r6 = java.lang.Math.max(r6, r12)
        L_0x007e:
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r10
            long r10 = java.lang.Math.abs(r12)
            java.lang.String r1 = "MicroMsg.BizVideoChannelStrategy"
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0093
            java.lang.String r0 = "fetchBizStrategy delta < interval, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        L_0x0093:
            ob0.c$b r3 = new ob0.c$b
            r3.<init>()
            te3.ci r6 = new te3.ci
            r6.<init>()
            r3.f127066a = r6
            te3.di r6 = new te3.di
            r6.<init>()
            r3.f127067b = r6
            java.lang.String r6 = "/cgi-bin/mmbiz-bin/timeline/bizstrategy"
            r3.f127068c = r6
            r6 = 1806(0x70e, float:2.531E-42)
            r3.f127069d = r6
            ob0.c r3 = r3.mo72403a()
            ob0.c$c r6 = r3.f127055a
            pe3.a r6 = r6.f127080a
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizStrategyReq"
            gy3.C87412m.m108592e(r6, r7)
            te3.ci r6 = (te3.C49004ci) r6
            r6.f131731d = r2
            te3.dr4 r2 = new te3.dr4
            r2.<init>()
            te3.hr4 r7 = new te3.hr4
            r7.<init>()
            r2.f132515d = r7
            te3.gr4 r12 = m51115f()
            if (r12 == 0) goto L_0x00d4
            java.lang.String r12 = r12.f134223j
            goto L_0x00d5
        L_0x00d4:
            r12 = 0
        L_0x00d5:
            r7.f134833d = r12
            te3.hr4 r7 = r2.f132515d
            r12 = r16
            r7.f134834e = r12
            r12 = r17
            r7.f134835f = r12
            r7.f134836g = r0
            r6.f131732e = r2
            r2 = r14
            r14.mo71297j(r8)
            fx0.g r7 = new fx0.g
            r7.<init>(r15, r6)
            ob0.C89144l0.m111429e(r3, r7, r4)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r0[r4] = r3
            java.lang.String r3 = "preloadChannelStrategy %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fx0.C45825h.mo71296i(int, java.lang.String, java.lang.String):void");
    }

    /* renamed from: j */
    public final void mo71297j(long j) {
        C115669n.INSTANCE.mo175913w(1416, j, 1);
    }
}
