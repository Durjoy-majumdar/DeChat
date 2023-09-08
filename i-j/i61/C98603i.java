package i61;

import android.net.Uri;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.autogen.events.EmojiConfigEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.EmojiResReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.emotion.SmileyInfo;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p207nl.C100134k;
import p207nl.C89008j;
import p441aq.C92054g;
import p523fp.C32147e;
import p585kl.C99149g;
import uc0.C111153e;
import uc0.C90638g;
import wh3.C38149x;
import z51.C39315g;
import zb0.C53767d;

/* renamed from: i61.i */
public class C98603i {

    /* renamed from: c */
    public static int f289099c;

    /* renamed from: d */
    public static int f289100d;

    /* renamed from: e */
    public static int f289101e;

    /* renamed from: f */
    public static int f289102f;

    /* renamed from: g */
    public static C98603i f289103g;

    /* renamed from: a */
    public final HashMap<C98604a, C99149g> f289104a = new HashMap<>();

    /* renamed from: b */
    public C90638g f289105b;

    /* renamed from: i61.i$a */
    public enum C98604a {
        EMOJI,
        PANEL,
        SUGGEST,
        EGG,
        SUGGEST_WORD,
        EMOJI_ANIM
    }

    /* renamed from: c */
    public static String m128192c() {
        return C89008j.f256613a.mo123383b();
    }

    /* renamed from: d */
    public static C98603i m128193d() {
        if (f289103g == null) {
            synchronized (C98603i.class) {
                f289103g = new C98603i();
            }
        }
        return f289103g;
    }

    /* renamed from: a */
    public final boolean mo138042a(String str, String str2) {
        if (str == null) {
            return false;
        }
        return C89008j.f256613a.mo123382a(str, str2);
    }

    /* renamed from: b */
    public final int mo138043b(C98604a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EMOJI_NEW_EMOJI_INT, 0)).intValue();
            f289099c = intValue;
            return intValue;
        } else if (ordinal == 1) {
            int intValue2 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EMOJI_NEW_PANEL_INT, 0)).intValue();
            f289100d = intValue2;
            return intValue2;
        } else if (ordinal == 2) {
            int intValue3 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EMOJI_NEW_SUGGEST_INT, 0)).intValue();
            f289101e = intValue3;
            return intValue3;
        } else if (ordinal == 3) {
            return C53767d.f150915a;
        } else {
            if (ordinal != 4) {
                return -1;
            }
            int intValue4 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EMOJI_EGG_INT, 0)).intValue();
            f289102f = intValue4;
            return intValue4;
        }
    }

    /* renamed from: e */
    public final C99149g mo138044e(C98604a aVar) {
        C99149g gVar = this.f289104a.get(aVar);
        if (gVar == null) {
            gVar = new C99149g();
            this.f289104a.put(aVar, gVar);
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            gVar.f290706a.f265437i = 1;
        } else if (ordinal == 1) {
            gVar.f290706a.f265437i = 2;
        } else if (ordinal == 2) {
            gVar.f290706a.f265437i = 3;
        } else if (ordinal == 4) {
            gVar.f290706a.f265437i = 5;
        } else if (ordinal == 5) {
            gVar.f290706a.f265437i = 6;
        } else if (ordinal == 6) {
            gVar.f290706a.f265437i = 7;
        }
        return gVar;
    }

    /* renamed from: f */
    public final boolean mo138045f(C86009m1 m1Var) {
        Uri.Builder builder;
        try {
            C90638g b = C100134k.m130828b(m1Var);
            if (b == null) {
                Log.m105920e("MicroMsg.emoji.EmojiResUpdateMgr", "parserEmojiEggConfig: error null");
                return false;
            }
            Log.m105925i("MicroMsg.emoji.EmojiResUpdateMgr", "parserEmojiEggConfig: %s", Integer.valueOf(b.f260401d.size()));
            C90638g gVar = new C90638g();
            this.f289105b = gVar;
            gVar.f260402e = b.f260402e;
            Iterator<C111153e> it = b.f260401d.iterator();
            while (it.hasNext()) {
                C111153e next = it.next();
                int i = next.f332884n;
                if (i <= 11) {
                    this.f289105b.f260401d.add(next);
                } else {
                    Log.m105925i("MicroMsg.emoji.EmojiResUpdateMgr", "getEggList: unsupport version %s", Integer.valueOf(i));
                }
            }
            String str = m128192c() + "/" + "egg";
            Uri n = str == null ? null : C116299g2.m163858n(str);
            if (n == null) {
                builder = new Uri.Builder().path("config.conf");
            } else {
                builder = n.buildUpon();
                builder.appendPath("config.conf");
            }
            Uri build = builder.build();
            String path = build.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!build.getPath().equals(k)) {
                    build = builder.path(k).build();
                }
            }
            f289102f = C100134k.m130830d(C116299g2.m163865u(build));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_EGG_INT, Integer.valueOf(f289102f));
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.emoji.EmojiResUpdateMgr", e, "", new Object[0]);
            return false;
        }
    }

    /* renamed from: g */
    public void mo138046g(CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent, boolean z) {
        Uri.Builder builder;
        C38149x xVar;
        Uri.Builder builder2;
        C98604a aVar = C98604a.EMOJI;
        int b = mo138043b(aVar);
        C99149g e = mo138044e(aVar);
        boolean a = mo138042a(checkResUpdateCacheFileEvent.f78743d.f78746c, "temp");
        String str = m128192c() + "/" + "temp";
        Uri uri = null;
        Uri n = str == null ? null : C116299g2.m163858n(str);
        if (n == null) {
            builder = new Uri.Builder().path("config.conf");
        } else {
            builder = n.buildUpon();
            builder.appendPath("config.conf");
        }
        Uri build = builder.build();
        String path = build.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!build.getPath().equals(k)) {
                build = builder.path(k).build();
            }
        }
        int d = C100134k.m130830d(C116299g2.m163865u(build));
        EmojiResReportStruct emojiResReportStruct = e.f290706a;
        emojiResReportStruct.f265435g = b;
        emojiResReportStruct.f265436h = d;
        e.mo138519b(a);
        EmojiResReportStruct emojiResReportStruct2 = e.f290706a;
        emojiResReportStruct2.f265434f = 0;
        emojiResReportStruct2.mo86054n();
        if (a) {
            C86013q1.m106445f(m128192c() + "/" + "newemoji");
            C86013q1.m106462w(m128192c() + "/" + "temp", m128192c() + "/" + "newemoji");
            C86009m1 m1Var = new C86009m1(new C86009m1(m128192c(), "newemoji"), "newemoji-config.xml");
            if (m1Var.mo119967g()) {
                ArrayList<SmileyInfo> c = C100134k.m130829c(m1Var);
                C99149g e2 = mo138044e(aVar);
                e2.mo138518a(!c.isEmpty());
                e2.f290706a.f265434f = c.size();
                e2.f290706a.mo86054n();
                if (!c.isEmpty()) {
                    ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).getClass();
                    ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
                    C30790w2 h = C30790w2.m39221h();
                    synchronized (h.f82769a) {
                        xVar = h.f82780l;
                    }
                    if (xVar.mo61549jo(c)) {
                        EmojiConfigEvent emojiConfigEvent = new EmojiConfigEvent();
                        emojiConfigEvent.f264694d.f264695a = 1;
                        emojiConfigEvent.publish();
                        String str2 = m128192c() + "/" + "newemoji";
                        if (str2 != null) {
                            uri = C116299g2.m163858n(str2);
                        }
                        if (uri == null) {
                            builder2 = new Uri.Builder().path("config.conf");
                        } else {
                            builder2 = uri.buildUpon();
                            builder2.appendPath("config.conf");
                        }
                        Uri build2 = builder2.build();
                        String path2 = build2.getPath();
                        if (path2 != null) {
                            String k2 = C116299g2.m163855k(path2, false, false);
                            if (!build2.getPath().equals(k2)) {
                                build2 = builder2.path(k2).build();
                            }
                        }
                        f289099c = C100134k.m130830d(C116299g2.m163865u(build2));
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_NEW_EMOJI_INT, Integer.valueOf(f289099c));
                    }
                }
                CheckResUpdateCacheFileEvent.C28720a aVar2 = checkResUpdateCacheFileEvent.f78743d;
                ((C32147e) C86312j.m106911c(C32147e.class)).Y40(aVar2.f78744a, aVar2.f78745b, aVar2.f78747d);
                return;
            }
            Log.m105924i("MicroMsg.emoji.EmojiResUpdateMgr", "updateEmoji config don't exist.");
            return;
        }
        Log.m105924i("MicroMsg.emoji.EmojiResUpdateMgr", "updateEmoji unzip file failed.");
    }
}
