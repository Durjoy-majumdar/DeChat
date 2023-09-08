package ii0;

import android.util.SparseIntArray;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import hi0.C32917b;
import hi0.C32918h;
import hi0.C32919i;
import hi0.C32920k;
import hi0.C32922o;
import hi0.C87491a;
import hi0.C87492c;
import hi0.C87495f;
import hi0.C87496g;
import hi0.C87497j;
import hi0.C87498l;
import hi0.C87499m;
import hi0.C87501n;
import kk0.C88191m;
import yl0.C91493k;

/* renamed from: ii0.a */
public enum C87732a {
    INSTANCE;
    

    /* renamed from: e */
    public static final C87737e f254023e = null;

    /* renamed from: f */
    public static final C87737e f254024f = null;

    /* renamed from: g */
    public static final C87737e f254025g = null;

    /* renamed from: h */
    public static final C87737e f254026h = null;

    /* renamed from: ii0.a$a */
    public class C87733a extends C87737e<Class<? extends C87491a>> {
        public C87733a() {
            mo122147b(C87495f.class, 20);
            mo122147b(C87492c.class, 40);
            mo122147b(C87497j.class, 80);
            mo122147b(C87498l.class, 100);
            mo122147b(C32920k.class, 120);
            mo122147b(C32922o.class, 150);
            mo122147b(C32917b.class, 160);
            mo122147b(C87499m.class, 171);
            mo122147b(C32918h.class, WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD);
            mo122147b(C32919i.class, 195);
            mo122147b(C87501n.class, 205);
            mo122147b(C87496g.class, 211);
        }
    }

    /* renamed from: ii0.a$b */
    public class C87734b extends C87737e<Class<? extends C87491a>> {
        public C87734b() {
            mo122147b(C87495f.class, 21);
            mo122147b(C87492c.class, 41);
            mo122147b(C87497j.class, 81);
            mo122147b(C87498l.class, 101);
            mo122147b(C32920k.class, 121);
            mo122147b(C32922o.class, 151);
            mo122147b(C32917b.class, 161);
            mo122147b(C87499m.class, 172);
            mo122147b(C32918h.class, WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_SUCCESS);
            mo122147b(C32919i.class, 196);
            mo122147b(C87501n.class, 206);
            mo122147b(C87496g.class, 212);
        }
    }

    /* renamed from: ii0.a$c */
    public class C87735c extends C87737e<Class<? extends C87491a>> {
        public C87735c() {
            mo122147b(C87495f.class, 22);
            mo122147b(C87492c.class, 42);
            mo122147b(C87497j.class, 82);
            mo122147b(C87498l.class, 102);
            mo122147b(C32920k.class, 122);
            mo122147b(C32922o.class, 152);
            mo122147b(C32917b.class, 162);
            mo122147b(C87499m.class, C88191m.CTRL_INDEX);
            mo122147b(C32918h.class, WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_FAILED);
            mo122147b(C32919i.class, WXWebReporter.WXWEB_IDKEY_LOCAL_TO_OVERSEA);
            mo122147b(C87501n.class, 207);
            mo122147b(C87496g.class, 213);
        }
    }

    /* renamed from: ii0.a$d */
    public class C87736d extends C87737e<Class<? extends C87491a>> {
        public C87736d() {
            mo122147b(C87495f.class, 23);
            mo122147b(C87492c.class, 43);
            mo122147b(C87497j.class, 83);
            mo122147b(C87498l.class, 103);
            mo122147b(C32920k.class, 123);
            mo122147b(C32922o.class, 153);
            mo122147b(C32917b.class, 163);
            mo122147b(C87499m.class, WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE);
            mo122147b(C32918h.class, WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED);
            mo122147b(C32919i.class, 198);
            mo122147b(C87501n.class, 208);
            mo122147b(C87496g.class, JsApiCheckIsSupportFaceDetect.CTRL_INDEX);
        }
    }

    /* renamed from: ii0.a$e */
    public static class C87737e<_Key> extends SparseIntArray {
        /* renamed from: a */
        public int mo122146a(_Key _key, int i) {
            return _key == null ? i : super.get(_key.hashCode(), i);
        }

        /* renamed from: b */
        public void mo122147b(_Key _key, int i) {
            if (_key != null) {
                super.put(_key.hashCode(), i);
            }
        }
    }

    /* access modifiers changed from: public */
    static {
        f254023e = new C87733a();
        f254024f = new C87734b();
        f254025g = new C87735c();
        f254026h = new C87736d();
    }

    /* renamed from: a */
    public void mo122144a(int i, int i2) {
        mo122145b((long) i, (long) i2);
    }

    /* renamed from: b */
    public void mo122145b(long j, long j2) {
        if (j2 < 0) {
            Log.m105921e("MicroMsg.AppBrand.PredownloadReporter", "idkeyStat with invalid ID(%d), key (%d)", Long.valueOf(j), Long.valueOf(j2));
            return;
        }
        if (j > 0) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175912v(j, j2);
            nVar.mo160131h(15272, Long.valueOf(j), Long.valueOf(j2));
        }
        if (843 != j) {
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.mo175912v(843, j2);
            nVar2.mo160131h(15272, Integer.valueOf(C91493k.CTRL_INDEX), Long.valueOf(j2));
        }
    }
}
