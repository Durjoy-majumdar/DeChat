package com.tencent.p014mm.plugin.emoji.magicemoji.pkg;

import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.emoji.magicemoji.bean.WxaPkgRecordForME;
import com.tencent.p014mm.plugin.magicbrush.C30172a0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import com.tencent.p014mm.plugin.magicbrush.api.WxaMagicPkgInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e42.C86433l;
import e42.C86434m;
import e42.C86436p;
import e42.C86437q;
import f42.C86757e;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h61.C87455a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import js0.C88016e;
import js0.C9514m;
import kotlin.Metadata;
import kr0.C33983a1;
import kr0.C33987b1;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64186f0;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/magicemoji/pkg/MagicEmojiMBPkgManagementCocos;", "Le42/l;", "", "instanceName", "<init>", "(Ljava/lang/String;)V", "plugin-magic-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.magicemoji.pkg.MagicEmojiMBPkgManagementCocos */
public final class MagicEmojiMBPkgManagementCocos extends C86433l {

    /* renamed from: b */
    public final boolean f248152b = C87455a.f253429e;

    /* renamed from: c */
    public final C13601g f248153c = C36568h.m40985a(C85165a.f248158d);

    /* renamed from: d */
    public C86757e f248154d;

    /* renamed from: e */
    public final C13601g f248155e = C36568h.m40985a(C29861c.f80912d);

    /* renamed from: f */
    public final C13601g f248156f = C36568h.m40985a(new C29862d(this));

    /* renamed from: g */
    public final C13601g f248157g;

    /* renamed from: com.tencent.mm.plugin.emoji.magicemoji.pkg.MagicEmojiMBPkgManagementCocos$b */
    public static final class C29860b extends C87413o implements C32224a<C81415h0> {

        /* renamed from: d */
        public final /* synthetic */ MagicEmojiMBPkgManagementCocos f80910d;

        /* renamed from: e */
        public final /* synthetic */ String f80911e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29860b(MagicEmojiMBPkgManagementCocos magicEmojiMBPkgManagementCocos, String str) {
            super(0);
            this.f80910d = magicEmojiMBPkgManagementCocos;
            this.f80911e = str;
        }

        public Object invoke() {
            Class cls = C30172a0.class;
            if (this.f80910d.f248152b) {
                return ((C30172a0) C86312j.m106911c(cls)).mo57189Eo(this.f80911e, (String) ((C36570n) this.f80910d.f248156f).getValue(), (C81415h0) null);
            }
            C86757e eVar = this.f80910d.f248154d;
            C87412m.m108591d(eVar);
            return ((C30172a0) C86312j.m106911c(cls)).mo57193fo(eVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.magicemoji.pkg.MagicEmojiMBPkgManagementCocos$c */
    public static final class C29861c extends C87413o implements C32224a<WxaMagicPkgInfo> {

        /* renamed from: d */
        public static final C29861c f80912d = new C29861c();

        public C29861c() {
            super(0);
        }

        public Object invoke() {
            return ((C30211n0) C86312j.m106911c(C30211n0.class)).zs0("magicemojicocos");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.magicemoji.pkg.MagicEmojiMBPkgManagementCocos$d */
    public static final class C29862d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ MagicEmojiMBPkgManagementCocos f80913d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29862d(MagicEmojiMBPkgManagementCocos magicEmojiMBPkgManagementCocos) {
            super(0);
            this.f80913d = magicEmojiMBPkgManagementCocos;
        }

        public Object invoke() {
            Log.m105924i("MagicEmojiMBPkgManagementCocos", "init pkg management with pkgInfo " + ((WxaMagicPkgInfo) ((C36570n) this.f80913d.f248155e).getValue()));
            WxaMagicPkgInfo wxaMagicPkgInfo = (WxaMagicPkgInfo) ((C36570n) this.f80913d.f248155e).getValue();
            if (wxaMagicPkgInfo != null) {
                return wxaMagicPkgInfo.f81573p;
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.magicemoji.pkg.MagicEmojiMBPkgManagementCocos$a */
    public static final class C85165a extends C87413o implements C32224a<C87455a.C87456a> {

        /* renamed from: d */
        public static final C85165a f248158d = new C85165a();

        public C85165a() {
            super(0);
        }

        public Object invoke() {
            return C87455a.f253428d;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicEmojiMBPkgManagementCocos(String str) {
        super(str);
        C87412m.m108594g(str, "instanceName");
        this.f248157g = C36568h.m40985a(new C29860b(this, str));
    }

    /* renamed from: a */
    public C81415h0 mo109577a() {
        return (C81415h0) ((C36570n) this.f248157g).getValue();
    }

    /* renamed from: b */
    public String mo109578b() {
        String str;
        C86757e eVar = this.f248154d;
        if (eVar != null && (str = eVar.f251842d) != null) {
            return str;
        }
        WxaMagicPkgInfo wxaMagicPkgInfo = (WxaMagicPkgInfo) ((C36570n) this.f248155e).getValue();
        String str2 = wxaMagicPkgInfo != null ? wxaMagicPkgInfo.f81566f : null;
        return str2 == null ? "" : str2;
    }

    /* renamed from: c */
    public String mo109579c() {
        String str;
        C86757e eVar = this.f248154d;
        if (eVar != null && (str = eVar.f251839a) != null) {
            return str;
        }
        WxaMagicPkgInfo wxaMagicPkgInfo = (WxaMagicPkgInfo) ((C36570n) this.f248155e).getValue();
        String str2 = wxaMagicPkgInfo != null ? wxaMagicPkgInfo.f81564d : null;
        return str2 == null ? "magicemojicocos" : str2;
    }

    /* renamed from: d */
    public void mo109580d(C32226l<? super List<? extends C86434m>, C13598b0> lVar) {
        WxaPkgRecordForME wxaPkgRecordForME;
        String str;
        C87412m.m108594g(lVar, "cb");
        Log.m105924i("MagicEmojiMBPkgManagementCocos", "provideMainScripts");
        if (this.f248152b) {
            String str2 = (String) ((C36570n) this.f248156f).getValue();
            if (str2 != null) {
                String e = C88016e.m109548e("magic_emoji/magic_emoji_common_lib.js");
                C87412m.m108593f(e, "basicLib");
                lVar.invoke(C64197v.m75537f(new C86436p(e), new C86437q(str2, "/game.js")));
                return;
            }
            lVar.invoke(C64186f0.f181907d);
            return;
        }
        C87412m.m108591d(mo118195f());
        Class cls = C33987b1.class;
        C29315z2 Yh = ((C33987b1) C86312j.m106911c(cls)).mo59392Yh(mo118195f().f253431a, mo118195f().f253433c, 0);
        if (Yh != null) {
            String str3 = Yh.field_appId;
            C87412m.m108593f(str3, "record.field_appId");
            String str4 = Yh.field_pkgPath;
            C87412m.m108593f(str4, "record.field_pkgPath");
            int i = Yh.field_version;
            String str5 = Yh.field_versionMd5;
            C87412m.m108593f(str5, "record.field_versionMd5");
            wxaPkgRecordForME = new WxaPkgRecordForME(str3, str4, i, str5);
        } else {
            wxaPkgRecordForME = null;
        }
        ((C33983a1) C86312j.m106911c(C33983a1.class)).mo56532sv(mo118195f().f253432b, mo118195f().f253431a, 999);
        String str6 = mo118195f().f253431a;
        C87412m.m108591d(wxaPkgRecordForME);
        ((C33987b1) C86312j.m106911c(cls)).mo59394hF(str6, wxaPkgRecordForME.f248143f);
        this.f248154d = new C86757e(wxaPkgRecordForME.f248141d, wxaPkgRecordForME.f248142e, wxaPkgRecordForME.f248143f, wxaPkgRecordForME.f248144g);
        String e2 = C88016e.m109548e("magic_emoji/magic_emoji_common_lib.js");
        C81415h0 h0Var = (C81415h0) ((C36570n) this.f248157g).getValue();
        if (h0Var == null) {
            Log.m105920e("MagicEmojiUtils", "[MagicEmoji]: can not read without fs");
        } else {
            C9514m mVar = new C9514m();
            C81410b0 readFile = h0Var.readFile("/game.js", mVar);
            C87412m.m108593f(readFile, "fs.readFile(path, pBB)");
            if (readFile != C81410b0.OK) {
                Log.m105920e("MagicEmojiUtils", "[MagicEmoji]: no file found");
            } else {
                byte[] a = C88016e.m109544a((ByteBuffer) mVar.f29691a);
                C87412m.m108593f(a, "arrayOfByteBuffer(pBB.value)");
                Charset charset = StandardCharsets.UTF_8;
                C87412m.m108593f(charset, "UTF_8");
                str = new String(a, charset);
                C87412m.m108593f(e2, "lib");
                lVar.invoke(C64197v.m75537f(new C86436p(e2), new C86436p(str)));
            }
        }
        str = "";
        C87412m.m108593f(e2, "lib");
        lVar.invoke(C64197v.m75537f(new C86436p(e2), new C86436p(str)));
    }

    /* renamed from: f */
    public final C87455a.C87456a mo118195f() {
        return (C87455a.C87456a) ((C36570n) this.f248153c).getValue();
    }
}
