package ma2;

import al3.C0086a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import bp3.C104160f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C86493v0;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import ke3.C88144b;
import p749xh.C102658n6;
import p763ym.C79138l;
import qc0.C101093a;
import qc0.C101106m;
import qo3.C77389a;
import qo3.C77398g;
import ra2.C101365a;
import sl0.C90223g;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import za2.C102984b;
import za2.C102987e;

/* renamed from: ma2.l0 */
public class C99812l0 {

    /* renamed from: a */
    public static final /* synthetic */ int f292500a = 0;

    /* renamed from: ma2.l0$a */
    public class C99813a implements MMActivity.C6739d {
        public void mmOnActivityResult(int i, int i2, Intent intent) {
        }
    }

    static {
        new HashMap();
        new HashMap();
    }

    /* renamed from: a */
    public static void m130296a(C101106m mVar, Activity activity) {
        C115669n.INSTANCE.kvStat(10910, "3");
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        C101834rc0 rc02 = new C101834rc0();
        rd02.mo141275k(C75592q0.m90789s());
        rd02.mo141279o(C75592q0.m90789s());
        rd02.mo141277m(5);
        rd02.mo141273f(Util.nowMilliSecond());
        if (((C79138l) C86312j.m106911c(C79138l.class)).mo73994Lc(m130299d(mVar))) {
            rd02.mo141272d(m130299d(mVar));
        }
        rc02.mo141240O(mVar.f295966n);
        rc02.mo141241P(mVar.f295967o);
        rc02.mo141242Q(mVar.f295968p);
        C101365a jo = C99814o0.wx0().mo140855jo(C102984b.m136164a(mVar));
        if (!Util.isNullOrNil(jo.field_songHAlbumUrl)) {
            rc02.mo141267w(jo.field_songHAlbumUrl);
        } else {
            rc02.mo141267w(jo.field_songAlbumUrl);
        }
        rc02.mo141231E(true);
        String f = m130301f(mVar);
        if (C86013q1.m106450k(f)) {
            rc02.f299286W = f;
        } else {
            rc02.mo141232F(true);
        }
        rc02.mo141246U(mVar.f295962g);
        rc02.mo141265u(mVar.f295963h);
        rc02.mo141260p(7);
        rc02.mo141235I(mVar.f295976x);
        rc02.mo141236J(mVar.f295969q);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264679d = mVar.f295962g;
        aVar.f264680e = mVar.f295963h;
        aVar.f264676a = kd02;
        aVar.f264678c = 7;
        kd02.mo141219q(rd02);
        kd02.f298618f.add(rc02);
        DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
        aVar2.f264684i = activity;
        aVar2.f264688m = 3;
        doFavoriteEvent.publish();
    }

    /* renamed from: b */
    public static boolean m130297b(C101106m mVar, Activity activity) {
        String str;
        C101106m mVar2 = mVar;
        Activity activity2 = activity;
        C115669n.INSTANCE.kvStat(10910, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        if (mVar2 == null) {
            return false;
        }
        String str2 = mVar2.f295968p;
        String f = C102987e.m136178f(str2);
        String g = C102987e.m136179g(str2);
        if (TextUtils.isEmpty(g) && TextUtils.isEmpty(f)) {
            Log.m105921e("MicroMsg.Music.MusicUtil", "wtf, get qq music data fail, url %s", str2);
            str = "qqmusic://qq.com/ui/pageVisibility";
        } else if (!TextUtils.isEmpty(g)) {
            Log.m105925i("MicroMsg.Music.MusicUtil", "get qq music songmid %s", g);
            str = "qqmusic://qq.com/media/playSonglist?p=%7B%22song%22%3A%5B%7B%22songmid%22%3A%22" + g + "%22%7D%5D%7D";
        } else if (TextUtils.isEmpty(f)) {
            str = "qqmusic://qq.com/media/playSonglist?p=%7B%22song%22%3A%5B%7B%22songid%22%3A%22" + f + "%22%7D%5D%7D";
        } else {
            str = "";
        }
        Log.m105925i("MicroMsg.Music.MusicUtil", "qqMusicActionUrl:%s", str);
        Uri parse = Uri.parse(str);
        if (parse == null) {
            Log.m105929w("MicroMsg.Music.MusicUtil", "parse qq music action url fail, url %s", str);
            return false;
        }
        C101093a.m132490l();
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.addFlags(268435456);
        if (Util.isIntentAvailable(activity2, intent, false)) {
            try {
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/music/model/MusicUtil", "doOpenInQQMusic", "(Lcom/tencent/mm/modelmusic/MusicWrapper;Landroid/app/Activity;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/plugin/music/model/MusicUtil", "doOpenInQQMusic", "(Lcom/tencent/mm/modelmusic/MusicWrapper;Landroid/app/Activity;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            } catch (Exception unused) {
                Intent intent2 = new Intent();
                intent2.putExtra("rawUrl", str2);
                C88144b.m109791i(activity2, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                return false;
            }
        } else {
            Intent intent3 = new Intent();
            intent3.putExtra("rawUrl", str2);
            C88144b.m109791i(activity2, "webview", ".ui.tools.WebViewUI", intent3, (Bundle) null);
            return false;
        }
    }

    /* renamed from: c */
    public static void m130298c(C101106m mVar, Activity activity) {
        Bitmap bitmap;
        WXMusicObject wXMusicObject = new WXMusicObject();
        wXMusicObject.musicUrl = mVar.f295968p;
        wXMusicObject.musicDataUrl = mVar.f295966n;
        String str = mVar.f295967o;
        wXMusicObject.musicLowBandUrl = str;
        wXMusicObject.musicLowBandDataUrl = str;
        wXMusicObject.songAlbumUrl = mVar.f295976x;
        wXMusicObject.songLyric = mVar.f295969q;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXMusicObject;
        wXMediaMessage.title = mVar.f295962g;
        wXMediaMessage.description = mVar.f295963h;
        String f = m130301f(mVar);
        if (f == null || !C86013q1.m106450k(f)) {
            bitmap = null;
        } else {
            int dimension = (int) activity.getResources().getDimension(C0966R.dimen.f3919iy);
            bitmap = BitmapUtil.getBitmapNative(f, dimension, dimension);
        }
        boolean z = true;
        if (bitmap != null) {
            wXMediaMessage.thumbData = Util.bmpToByteArray(bitmap, true);
        } else {
            wXMediaMessage.thumbData = Util.bmpToByteArray(BitmapUtil.getBitmapNative((int) C0966R.C0969drawable.bzf), true);
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.message = wXMediaMessage;
        req.toBundle(bundle);
        intent.putExtra("Ksnsupload_timeline", bundle);
        intent.putExtra("Ksnsupload_musicid", mVar.f295960e);
        String d = m130299d(mVar);
        if (((C79138l) C86312j.m106911c(C79138l.class)).mo73994Lc(d)) {
            intent.putExtra("Ksnsupload_appid", d);
        }
        intent.putExtra("Ksnsupload_appname", m130300e(mVar));
        String a = C86493v0.m107223a("music_player");
        C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", "music_player");
        intent.putExtra("reportSessionId", a);
        intent.putExtra("ksnsis_music", true);
        if (C87412m.m108589b("wx5aa333606550dfd5", d)) {
            intent.putExtra("Ksnsupload_type", 25);
        } else {
            if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_new_music_type_flag, C104160f.RepairerConfig_Mv_CardDownLevel_Int, 0) != 1) {
                z = false;
            }
            if (z) {
                intent.putExtra("Ksnsupload_type", 26);
            } else {
                intent.putExtra("Ksnsupload_type", 2);
            }
        }
        C88144b.m109803u((MMActivity) activity, ".plugin.sns.ui.SnsUploadUI", intent, 1001, new C99813a());
    }

    /* renamed from: d */
    public static String m130299d(C101106m mVar) {
        String str = mVar.f295972t;
        if (!Util.isNullOrNil(str)) {
            return str;
        }
        int i = mVar.f295959d;
        return i != 4 ? i != 5 ? str : "wx482a4001c37e2b74" : "wx485a97c844086dc9";
    }

    /* renamed from: e */
    public static String m130300e(C101106m mVar) {
        int i = mVar.f295959d;
        if (!(i == 0 || i == 1)) {
            if (i == 4) {
                return MMApplicationContext.getContext().getString(C0966R.string.j4u);
            }
            if (i == 5) {
                return MMApplicationContext.getContext().getString(C0966R.string.ida);
            }
            if (i != 8) {
                return MMApplicationContext.getContext().getString(C0966R.string.bxp);
            }
        }
        return MMApplicationContext.getContext().getString(C0966R.string.jfa);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r7 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r7 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r7 == null) goto L_0x006d;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m130301f(qc0.C101106m r7) {
        /*
            ra2.b r0 = ma2.C99814o0.wx0()
            java.lang.String r1 = za2.C102984b.m136164a(r7)
            ra2.a r0 = r0.mo140855jo(r1)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0011
            return r1
        L_0x0011:
            java.lang.String r2 = r0.field_musicId
            r3 = 1
            java.lang.String r2 = za2.C102984b.m136169f(r2, r3)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            r5 = 0
            if (r4 != 0) goto L_0x00b1
            int r4 = r7.f295959d
            if (r4 == 0) goto L_0x009d
            r6 = 4
            if (r4 == r6) goto L_0x006f
            r0 = 5
            if (r4 == r0) goto L_0x0067
            r0 = 6
            if (r4 == r0) goto L_0x0062
            r0 = 7
            if (r4 == r0) goto L_0x005d
            r0 = 10
            if (r4 == r0) goto L_0x005d
            r0 = 11
            if (r4 == r0) goto L_0x005d
            jr2.n r0 = jr2.C99019x.m128971c()
            if (r0 == 0) goto L_0x00b1
            te3.kv2 r0 = new te3.kv2
            r0.<init>()
            java.lang.String r1 = r7.f295975w
            r0.f298689d = r1
            java.lang.String r1 = r7.f295965j
            r0.f298694i = r1
            int r7 = r7.f295973u
            r0.f298695j = r7
            r0.f298692g = r1
            java.lang.Class<hy.s0> r7 = p166hy.C8830s0.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            hy.s0 r7 = (p166hy.C8830s0) r7
            java.lang.String r2 = r7.mo9670xF(r0)
            goto L_0x00b1
        L_0x005d:
            java.lang.String r7 = r7.f295970r
            if (r7 != 0) goto L_0x006c
            goto L_0x006d
        L_0x0062:
            java.lang.String r7 = r7.f295970r
            if (r7 != 0) goto L_0x006c
            goto L_0x006d
        L_0x0067:
            java.lang.String r7 = r7.f295970r
            if (r7 != 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r1 = r7
        L_0x006d:
            r2 = r1
            goto L_0x00b1
        L_0x006f:
            com.tencent.mm.autogen.events.MusicActionEvent r1 = new com.tencent.mm.autogen.events.MusicActionEvent
            r1.<init>()
            com.tencent.mm.autogen.events.MusicActionEvent$a r2 = r1.f264920d
            r4 = 12
            r2.f264922a = r4
            java.lang.String r4 = r7.f295965j
            r2.f264928g = r4
            r1.publish()
            com.tencent.mm.autogen.events.MusicActionEvent$b r1 = r1.f264921e
            java.lang.String r1 = r1.f264934e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x008f
            java.lang.String r7 = r7.f295970r
            r2 = r7
            goto L_0x0090
        L_0x008f:
            r2 = r1
        L_0x0090:
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r7 != 0) goto L_0x00b1
            java.lang.String r7 = r0.field_musicId
            java.lang.String r2 = za2.C102984b.m136169f(r7, r5)
            goto L_0x00b1
        L_0x009d:
            java.lang.Class<gt.k> r0 = p158gt.C98201k.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            java.lang.String r7 = r7.f295970r
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r2 = r0.v10(r7, r3)
        L_0x00b1:
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r5] = r2
            java.lang.String r0 = "MicroMsg.Music.MusicUtil"
            java.lang.String r1 = "real album path = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ma2.C99812l0.m130301f(qc0.m):java.lang.String");
    }

    /* renamed from: g */
    public static void m130302g(String str, String str2, int i) {
        Log.m105925i("MicroMsg.Music.MusicUtil", "gotoAppbrand(), appId:%s, appUserName:%s, pkgType:%d", str, str2, Integer.valueOf(i));
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
        aVar.f9533h = str;
        aVar.f9534i = -1;
        aVar.f9528c = i;
        aVar.f9526a = str2;
        aVar.f9529d = C90223g.CTRL_INDEX;
        if (i == 1) {
            aVar.f9538m = true;
        }
        startAppBrandUIFromOuterEvent.publish();
    }

    /* renamed from: h */
    public static boolean m130303h(C102658n6 n6Var) {
        Log.m105919d("MicroMsg.Music.MusicUtil", "music urls: %s,  %s,  %s", n6Var.field_songWapLinkUrl, n6Var.field_songWebUrl, n6Var.field_songWifiUrl);
        return !Util.isNullOrNil(n6Var.field_songWapLinkUrl) || !Util.isNullOrNil(n6Var.field_songWebUrl) || !Util.isNullOrNil(n6Var.field_songWifiUrl);
    }

    /* renamed from: i */
    public static C77398g m130304i(Context context, int i) {
        C77389a aVar = new C77389a();
        aVar.f225644a = C0086a.m38a(context).getString(C0966R.string.a3h);
        aVar.f225660q = C0086a.m38a(context).getString(i);
        aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.lkg);
        aVar.f225620C = null;
        aVar.f225668y = true;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        return gVar;
    }
}
