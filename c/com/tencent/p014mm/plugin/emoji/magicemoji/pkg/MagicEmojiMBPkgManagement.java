package com.tencent.p014mm.plugin.emoji.magicemoji.pkg;

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
import f42.C86757e;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h61.C87455a;
import h61.C87457c;
import h81.C32735h;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import js0.C88016e;
import js0.C9514m;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/magicemoji/pkg/MagicEmojiMBPkgManagement;", "Le42/l;", "", "instanceName", "<init>", "(Ljava/lang/String;)V", "plugin-magic-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.magicemoji.pkg.MagicEmojiMBPkgManagement */
public final class MagicEmojiMBPkgManagement extends C86433l {

    /* renamed from: b */
    public final C13601g f248145b = C36568h.m40985a(new C29859d(this));

    /* renamed from: c */
    public C86757e f248146c;

    /* renamed from: d */
    public final C87457c f248147d;

    /* renamed from: e */
    public final C13601g f248148e;

    /* renamed from: f */
    public final C13601g f248149f;

    /* renamed from: com.tencent.mm.plugin.emoji.magicemoji.pkg.MagicEmojiMBPkgManagement$a */
    public static final class C29857a extends C87413o implements C32224a<C81415h0> {

        /* renamed from: d */
        public final /* synthetic */ MagicEmojiMBPkgManagement f80906d;

        /* renamed from: e */
        public final /* synthetic */ String f80907e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29857a(MagicEmojiMBPkgManagement magicEmojiMBPkgManagement, String str) {
            super(0);
            this.f80906d = magicEmojiMBPkgManagement;
            this.f80907e = str;
        }

        public Object invoke() {
            Class cls = C30172a0.class;
            if (this.f80906d.mo118194g()) {
                String str = this.f80907e;
                WxaMagicPkgInfo f = this.f80906d.mo118193f();
                C87412m.m108591d(f);
                return ((C30172a0) C86312j.m106911c(cls)).mo57189Eo(str, f.f81573p, (C81415h0) null);
            }
            C86757e eVar = this.f80906d.f248146c;
            C87412m.m108591d(eVar);
            return ((C30172a0) C86312j.m106911c(cls)).mo57193fo(eVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.magicemoji.pkg.MagicEmojiMBPkgManagement$b */
    public static final class C29858b extends C87413o implements C32224a<WxaMagicPkgInfo> {

        /* renamed from: d */
        public static final C29858b f80908d = new C29858b();

        public C29858b() {
            super(0);
        }

        public Object invoke() {
            return ((C30211n0) C86312j.m106911c(C30211n0.class)).zs0("magicemo");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.magicemoji.pkg.MagicEmojiMBPkgManagement$d */
    public static final class C29859d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ MagicEmojiMBPkgManagement f80909d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29859d(MagicEmojiMBPkgManagement magicEmojiMBPkgManagement) {
            super(0);
            this.f80909d = magicEmojiMBPkgManagement;
        }

        public Object invoke() {
            boolean z = false;
            if (!(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_magic_emoji_use_boots, 0) == 0 || this.f80909d.mo118193f() == null)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.magicemoji.pkg.MagicEmojiMBPkgManagement$c */
    public static final class C85164c extends C87413o implements C32226l<WxaPkgRecordForME, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MagicEmojiMBPkgManagement f248150d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<List<? extends C86434m>, C13598b0> f248151e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85164c(MagicEmojiMBPkgManagement magicEmojiMBPkgManagement, C32226l<? super List<? extends C86434m>, C13598b0> lVar) {
            super(1);
            this.f248150d = magicEmojiMBPkgManagement;
            this.f248151e = lVar;
        }

        public Object invoke(Object obj) {
            String str;
            WxaPkgRecordForME wxaPkgRecordForME = (WxaPkgRecordForME) obj;
            C87412m.m108594g(wxaPkgRecordForME, "record");
            MagicEmojiMBPkgManagement magicEmojiMBPkgManagement = this.f248150d;
            if (magicEmojiMBPkgManagement.f248146c == null) {
                magicEmojiMBPkgManagement.f248146c = new C86757e(wxaPkgRecordForME.f248141d, wxaPkgRecordForME.f248142e, wxaPkgRecordForME.f248143f, wxaPkgRecordForME.f248144g);
                String e = C88016e.m109548e("magic_emoji/magic_emoji_common_lib.js");
                C81415h0 h0Var = (C81415h0) ((C36570n) this.f248150d.f248149f).getValue();
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
                        C32226l<List<? extends C86434m>, C13598b0> lVar = this.f248151e;
                        C87412m.m108593f(e, "lib");
                        lVar.invoke(C64197v.m75537f(new C86436p(e), new C86436p(str)));
                    }
                }
                str = "";
                C32226l<List<? extends C86434m>, C13598b0> lVar2 = this.f248151e;
                C87412m.m108593f(e, "lib");
                lVar2.invoke(C64197v.m75537f(new C86436p(e), new C86436p(str)));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicEmojiMBPkgManagement(String str) {
        super(str);
        C87412m.m108594g(str, "instanceName");
        C87455a.C87456a aVar = C87455a.f253425a;
        C87412m.m108593f(aVar, "CURRENT_USING_APPID_BUNDLE_UNITY");
        this.f248147d = new C87457c(aVar);
        this.f248148e = C36568h.m40985a(C29858b.f80908d);
        this.f248149f = C36568h.m40985a(new C29857a(this, str));
    }

    /* renamed from: a */
    public C81415h0 mo109577a() {
        return (C81415h0) ((C36570n) this.f248149f).getValue();
    }

    /* renamed from: b */
    public String mo109578b() {
        String str;
        C86757e eVar = this.f248146c;
        if (eVar != null && (str = eVar.f251842d) != null) {
            return str;
        }
        WxaMagicPkgInfo f = mo118193f();
        C87412m.m108591d(f);
        String str2 = f.f81566f;
        C87412m.m108593f(str2, "pkgInfo!!.md5");
        return str2;
    }

    /* renamed from: c */
    public String mo109579c() {
        String str;
        C86757e eVar = this.f248146c;
        if (eVar != null && (str = eVar.f251839a) != null) {
            return str;
        }
        WxaMagicPkgInfo f = mo118193f();
        C87412m.m108591d(f);
        String str2 = f.f81564d;
        C87412m.m108593f(str2, "pkgInfo!!.pkgId");
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ea, code lost:
        if (r1 != false) goto L_0x00f0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo109580d(fy3.C32226l<? super java.util.List<? extends e42.C86434m>, rx3.C13598b0> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "cb"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[MEP] provide magicemo path with boots? "
            r0.append(r1)
            boolean r1 = r10.mo118194g()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MagicEmojiMBPkgManagement"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            boolean r0 = r10.mo118194g()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = "magic_emoji/magic_emoji_common_lib.js"
            java.lang.String r0 = js0.C88016e.m109548e(r0)
            r3 = 2
            e42.m[] r3 = new e42.C86434m[r3]
            e42.p r4 = new e42.p
            java.lang.String r5 = "basicLib"
            gy3.C87412m.m108593f(r0, r5)
            r4.<init>(r0)
            r3[r1] = r4
            e42.q r0 = new e42.q
            com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r1 = r10.mo118193f()
            gy3.C87412m.m108591d(r1)
            java.lang.String r1 = r1.f81573p
            java.lang.String r4 = "pkgInfo!!.wxapath"
            gy3.C87412m.m108593f(r1, r4)
            java.lang.String r4 = "/game.js"
            r0.<init>(r1, r4)
            r3[r2] = r0
            java.util.List r0 = sx3.C64197v.m75537f(r3)
            r11.invoke(r0)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1947(0x79b, double:9.62E-321)
            r4 = 2
            r6 = 1
            r1.mo175913w(r2, r4, r6)
            goto L_0x00fb
        L_0x0068:
            h61.c r0 = r10.f248147d
            com.tencent.mm.plugin.emoji.magicemoji.pkg.MagicEmojiMBPkgManagement$c r3 = new com.tencent.mm.plugin.emoji.magicemoji.pkg.MagicEmojiMBPkgManagement$c
            r3.<init>(r10, r11)
            r0.getClass()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r4 = "stevecai: findRecord duplicate: "
            r11.append(r4)
            fy3.l<? super com.tencent.mm.plugin.emoji.magicemoji.bean.WxaPkgRecordForME, rx3.b0> r4 = r0.f253437d
            if (r4 == 0) goto L_0x0083
            r4 = 1
            goto L_0x0084
        L_0x0083:
            r4 = 0
        L_0x0084:
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            java.lang.String r4 = "MicroMsg.MagicEmojiRecordMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            fy3.l<? super com.tencent.mm.plugin.emoji.magicemoji.bean.WxaPkgRecordForME, rx3.b0> r11 = r0.f253437d
            if (r11 == 0) goto L_0x0095
            goto L_0x00f0
        L_0x0095:
            r0.f253437d = r3
            com.tencent.mm.plugin.emoji.magicemoji.bean.WxaPkgRecordForME r11 = r0.mo121913d()
            if (r11 != 0) goto L_0x00a8
            r0.mo121916g()
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            int r0 = h61.C87455a.f253430f
            r11.mo175911u(r0, r2)
            goto L_0x00f0
        L_0x00a8:
            java.lang.Class<kr0.b1> r3 = kr0.C33987b1.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            kr0.b1 r3 = (kr0.C33987b1) r3
            h61.a$a r4 = r0.f253434a
            java.lang.String r4 = r4.f253431a
            int r3 = r3.mo59390Da(r4)
            int r4 = r11.f248143f
            if (r3 <= r4) goto L_0x00be
            r3 = 1
            goto L_0x00bf
        L_0x00be:
            r3 = 0
        L_0x00bf:
            rx3.g r4 = r0.f253438e
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x00ed
            if (r3 == 0) goto L_0x00ed
            r0.mo121916g()
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_magic_emoji_pkg_download_android
            int r3 = r3.mo58779Qe(r4, r2)
            boolean r4 = h61.C87455a.f253427c
            if (r4 == 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            if (r3 != r2) goto L_0x00ea
        L_0x00e9:
            r1 = 1
        L_0x00ea:
            if (r1 == 0) goto L_0x00ed
            goto L_0x00f0
        L_0x00ed:
            r0.mo121915f(r11, r2)
        L_0x00f0:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 1947(0x79b, double:9.62E-321)
            r6 = 1
            r8 = 1
            r3.mo175913w(r4, r6, r8)
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.magicemoji.pkg.MagicEmojiMBPkgManagement.mo109580d(fy3.l):void");
    }

    /* renamed from: f */
    public final WxaMagicPkgInfo mo118193f() {
        return (WxaMagicPkgInfo) this.f248148e.getValue();
    }

    /* renamed from: g */
    public final boolean mo118194g() {
        return ((Boolean) ((C36570n) this.f248145b).getValue()).booleanValue();
    }

    public void release() {
        if (mo118194g()) {
            ((C30172a0) C86312j.m106911c(C30172a0.class)).mo57194rr(this.f251229a);
        }
    }
}
