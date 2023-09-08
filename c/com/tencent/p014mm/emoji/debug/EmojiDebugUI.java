package com.tencent.p014mm.emoji.debug;

import a70.C112760b;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.C0132m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.SuggestEmoiconWordListStruct;
import com.tencent.p014mm.emoji.sync.C92668a;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.emoji.sync.C41060a;
import com.tencent.p014mm.plugin.emoji.sync.C41062e;
import com.tencent.p014mm.plugin.emoji.sync.C93123b;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.smiley.C96926b0;
import com.tencent.p014mm.smiley.C96931e;
import com.tencent.p014mm.smiley.C96945j0;
import com.tencent.p014mm.smiley.C96964q;
import com.tencent.p014mm.smiley.C96965r;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.storage.emotion.SmileyInfo;
import com.tencent.p014mm.storage.emotion.SmileyPanelConfigInfo;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import d61.C7239b;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import i61.C98602h;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76879j;
import o40.C61926c;
import p1048uk.C102051g;
import p1089xk.C102688b;
import p207nl.C100134k;
import p207nl.C89008j;
import p234sk.C101641i;
import p234sk.C63946g;
import p234sk.C77721d;
import p260wk.C102457e;
import p441aq.C92054g;
import p490dl.C31198d;
import p490dl.C97484a;
import p490dl.C97489o;
import p490dl.C97491p;
import p523fp.C32147e;
import p534gl.C32472e;
import p534gl.C32477j;
import p534gl.C32479l;
import p595ll.C46878j;
import p595ll.C61303b;
import p595ll.C99497i;
import p595ll.C99500l;
import p777zp.C112645b;
import p910lj.C76701a;
import q00.C12024e;
import q00.C62571i;
import qo3.C77426q;
import qo3.C89779i0;
import rh3.C101383g;
import rx3.C13598b0;
import sh3.C101624e;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C50572no3;
import te3.C52147yo3;
import th3.C101893b;
import u61.C101964h;
import uc0.C111153e;
import uc0.C90638g;
import v61.C37682c;
import wh3.C38133h;
import wh3.C38134i;
import z04.C119027c;
import z04.C66713a;
import z51.C39315g;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/emoji/debug/EmojiDebugUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI */
public final class EmojiDebugUI extends MMActivity {

    /* renamed from: g */
    public static boolean f266600g;

    /* renamed from: h */
    public static boolean f266601h;

    /* renamed from: i */
    public static boolean f266602i;

    /* renamed from: d */
    public final String f266603d = "MicroMsg.EmojiDebugUI";

    /* renamed from: e */
    public final LinkedList<C92628a> f266604e = new LinkedList<>();

    /* renamed from: f */
    public RecyclerView f266605f;

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$c0 */
    public static final class C1236c0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C1236c0 f10287d = new C1236c0();

        public C1236c0() {
            super(0);
        }

        public Object invoke() {
            ((C12024e) C86312j.m106911c(C12024e.class)).Nq0();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$d1 */
    public static final class C1237d1 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C1237d1 f10288d = new C1237d1();

        public C1237d1() {
            super(0);
        }

        public Object invoke() {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_STORE_IP_INTRO_SHOWN_BOOLEAN, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$g0 */
    public static final class C1238g0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiProcessMMKV f10289d;

        /* renamed from: e */
        public final /* synthetic */ EmojiDebugUI f10290e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1238g0(MultiProcessMMKV multiProcessMMKV, EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f10289d = multiProcessMMKV;
            this.f10290e = emojiDebugUI;
        }

        public Object invoke() {
            RecyclerView.C16613e adapter;
            MultiProcessMMKV multiProcessMMKV = this.f10289d;
            multiProcessMMKV.putBoolean("multi_thread", !multiProcessMMKV.getBoolean("multi_thread", false));
            RecyclerView recyclerView = this.f10290e.f266605f;
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                adapter.notifyDataSetChanged();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$h0 */
    public static final class C1239h0 extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C1239h0 f10291d = new C1239h0();

        public C1239h0() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return "enable";
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$i0 */
    public static final class C1240i0 extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ MultiProcessMMKV f10292d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1240i0(MultiProcessMMKV multiProcessMMKV) {
            super(0);
            this.f10292d = multiProcessMMKV;
        }

        public Object invoke() {
            return String.valueOf(this.f10292d.getBoolean("effect", true));
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$j0 */
    public static final class C1241j0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiProcessMMKV f10293d;

        /* renamed from: e */
        public final /* synthetic */ EmojiDebugUI f10294e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1241j0(MultiProcessMMKV multiProcessMMKV, EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f10293d = multiProcessMMKV;
            this.f10294e = emojiDebugUI;
        }

        public Object invoke() {
            RecyclerView.C16613e adapter;
            MultiProcessMMKV multiProcessMMKV = this.f10293d;
            multiProcessMMKV.putBoolean("effect", true ^ multiProcessMMKV.getBoolean("effect", true));
            RecyclerView recyclerView = this.f10294e.f266605f;
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                adapter.notifyDataSetChanged();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$k */
    public static final class C1242k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f10295d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1242k(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f10295d = emojiDebugUI;
        }

        public Object invoke() {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", "https://game.weixin.qq.com/cgi-bin/h5/static/act_dnfm/index.html?noticeid=90248502&wechat_pkgid=act_dnfm_index&actid=138433&nav_color=F2D8AB&darkmode_nav_color=F2D8AB&hide_share_option=1#wechat_redirect");
            intent.putExtra("from_shortcut", true);
            intent.putExtra("disable_minimize", true);
            intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2333y);
            intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
            C88144b.m109795m(this.f10295d, "webview", ".ui.tools.WebViewUI", intent, 1001);
            this.f10295d.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$m0 */
    public static final class C1243m0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C1243m0 f10296d = new C1243m0();

        public C1243m0() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$n0 */
    public static final class C1244n0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f10297d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1244n0(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f10297d = emojiDebugUI;
        }

        public Object invoke() {
            String Qr0 = ((C62571i) C86312j.m106911c(C62571i.class)).Qr0();
            C77426q qVar = new C77426q(this.f10297d);
            qVar.mo107595g(Qr0);
            qVar.mo107589a(true);
            qVar.mo107603o();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$r */
    public static final class C1245r implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f10298d;

        public C1245r(EmojiDebugUI emojiDebugUI) {
            this.f10298d = emojiDebugUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f10298d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$u0 */
    public static final class C1246u0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C1246u0 f10299d = new C1246u0();

        public C1246u0() {
            super(0);
        }

        public Object invoke() {
            MultiProcessMMKV.getMMKV("maas_permission_checker").clearAll();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$v0 */
    public static final class C1247v0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f10300d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1247v0(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f10300d = emojiDebugUI;
        }

        public Object invoke() {
            String zd02 = ((C7239b) C86312j.m106911c(C7239b.class)).zd0();
            C77426q qVar = new C77426q(this.f10300d);
            qVar.mo107595g(zd02);
            qVar.mo107589a(true);
            qVar.mo107603o();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$w0 */
    public static final class C1248w0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C1248w0 f10301d = new C1248w0();

        public C1248w0() {
            super(0);
        }

        public Object invoke() {
            ((C7239b) C86312j.m106911c(C7239b.class)).nn0(false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$x0 */
    public static final class C1249x0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C1249x0 f10302d = new C1249x0();

        public C1249x0() {
            super(0);
        }

        public Object invoke() {
            ((C7239b) C86312j.m106911c(C7239b.class)).nn0(true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$y0 */
    public static final class C1250y0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f10303d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1250y0(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f10303d = emojiDebugUI;
        }

        public Object invoke() {
            String fm02 = ((C12024e) C86312j.m106911c(C12024e.class)).fm0();
            C77426q qVar = new C77426q(this.f10303d);
            qVar.mo107595g(fm02);
            qVar.mo107589a(true);
            qVar.mo107603o();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$z0 */
    public static final class C1251z0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C1251z0 f10304d = new C1251z0();

        public C1251z0() {
            super(0);
        }

        public Object invoke() {
            ((C12024e) C86312j.m106911c(C12024e.class)).mo11884GR();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$a1 */
    public static final class C28907a1 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f79327d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28907a1(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f79327d = emojiDebugUI;
        }

        public Object invoke() {
            String obj = ClipboardHelper.getText().toString();
            EmojiInfo emojiInfo = new EmojiInfo();
            emojiInfo.field_md5 = obj;
            C30790w2.m39221h().mo57717d().mo142040Ow(emojiInfo);
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138008O(this.f79327d, emojiInfo, 0, "");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$o0 */
    public static final class C28908o0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C28908o0 f79328d = new C28908o0();

        public C28908o0() {
            super(0);
        }

        public Object invoke() {
            new C99497i().mo138910a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$p0 */
    public static final class C28909p0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f79329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28909p0(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f79329d = emojiDebugUI;
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("version: " + C32477j.f86288c + 10);
            sb.append("type: " + C32477j.f86287b + 10);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("size: ");
            LinkedList<String> linkedList = C32477j.f86289d;
            synchronized (linkedList) {
            }
            sb4.append(linkedList.size());
            sb4.append(10);
            sb.append(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("updateTime: ");
            C97491p pVar = C97491p.f286143a;
            int i = 0;
            pVar.mo136773a(false);
            sb5.append(Util.formatUnixTime((long) pVar.mo136774c().getInt("word_list_update_time", 0)));
            sb5.append(10);
            sb.append(sb5.toString());
            synchronized (linkedList) {
            }
            sb.append(C110818d0.m150921S(linkedList, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
            C77426q qVar = new C77426q(this.f79329d);
            qVar.mo107595g(sb.toString());
            qVar.mo107589a(true);
            qVar.mo107603o();
            Cursor rawQuery = C30790w2.m39221h().f82785q.f100776d.rawQuery("select * from EmojiSuggestCacheInfo", (String[]) null, 2);
            if (rawQuery != null) {
                int i2 = 0;
                while (rawQuery.moveToNext()) {
                    C32472e eVar = new C32472e();
                    eVar.convertFrom(rawQuery);
                    C52147yo3 yo32 = new C52147yo3();
                    byte[] bArr = eVar.field_content;
                    if (bArr != null) {
                        try {
                            yo32.parseFrom(bArr);
                        } catch (Exception e) {
                            Log.printDebugStack("safeParser", "", e);
                        }
                    }
                    String str = C38134i.f100775g;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("dump: ");
                    sb6.append(i2);
                    sb6.append(": ");
                    sb6.append(eVar.field_desc);
                    sb6.append(", ");
                    sb6.append(eVar.field_updateTime);
                    sb6.append("; ");
                    LinkedList<C50572no3> linkedList2 = yo32.f145438d;
                    C87412m.m108593f(linkedList2, "rsp.Emoji");
                    sb6.append(C110818d0.m150921S(linkedList2, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C38133h.f100773d, 31, (Object) null));
                    Log.m105924i(str, sb6.toString());
                    i2++;
                }
                rawQuery.close();
                i = i2;
            }
            String str2 = C38134i.f100775g;
            Log.m105924i(str2, "dump done: count " + i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$q0 */
    public static final class C28910q0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C28910q0 f79330d = new C28910q0();

        public C28910q0() {
            super(0);
        }

        public Object invoke() {
            C38134i iVar = C30790w2.m39221h().f82785q;
            iVar.f100777e.clear();
            iVar.f100776d.delete("EmojiSuggestCacheInfo", (String) null, (String[]) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$r0 */
    public static final class C28911r0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C28911r0 f79331d = new C28911r0();

        public C28911r0() {
            super(0);
        }

        public Object invoke() {
            SuggestEmoiconWordListStruct suggestEmoiconWordListStruct = new SuggestEmoiconWordListStruct();
            suggestEmoiconWordListStruct.f79184d = Util.nowMilliSecond();
            new C31198d().mo9225i().mo123420E(new C32479l(suggestEmoiconWordListStruct));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$s */
    public static final class C28912s extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f79332d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28912s(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f79332d = emojiDebugUI;
        }

        public Object invoke() {
            C37682c.m41478a(this.f79332d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$s0 */
    public static final class C28913s0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f79333d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28913s0(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f79333d = emojiDebugUI;
        }

        public Object invoke() {
            Class cls = C32735h.class;
            StringBuilder sb = new StringBuilder();
            boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_emoji_suggest_remote_enable, false);
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_emoji_suggest_remote_request_interval, 24);
            int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_emoji_suggest_remote_prefetch, 0);
            int Qe3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_emoji_suggest_personal_words_interval, 0);
            sb.append("remote: " + wf + " \n");
            sb.append("remote interval: " + Qe + " \n");
            sb.append("remote preload type: " + Qe2 + " \n");
            sb.append("word update interval: " + Qe3 + " \n");
            boolean wf4 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_emoji_suggest_remote_shuffle, false);
            int Qe4 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_emoji_suggest_remote_shuffle_size, 20);
            sb.append("remote shuffle: " + wf4 + ", size:" + Qe4 + " \n");
            int Qe5 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_emoji_suggest_show_delay, 250);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("show delay: ");
            sb4.append(Qe5);
            sb4.append(" \n");
            sb.append(sb4.toString());
            C77426q qVar = new C77426q(this.f79333d);
            qVar.mo107595g(sb.toString());
            qVar.mo107589a(true);
            qVar.mo107603o();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$d0 */
    public static final class C68034d0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f195263d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68034d0(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f195263d = emojiDebugUI;
        }

        public Object invoke() {
            String str = C96965r.f284069f;
            String str2 = C96965r.f284069f + "_temp";
            C86013q1.m106437S(str2, C86013q1.m106433O(str, 0, 2097152));
            C86013q1.m106442c(str2, str);
            Log.m105924i(this.f195263d.f266603d, "make new emoji not entire finish");
            C76701a.makeText((Context) this.f195263d, (CharSequence) "done", 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$n */
    public static final class C68035n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f195264d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68035n(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f195264d = emojiDebugUI;
        }

        public Object invoke() {
            ArrayList arrayList = new ArrayList();
            Cursor all = C30790w2.m39221h().mo57717d().getAll();
            if (all != null) {
                while (all.moveToNext()) {
                    EmojiInfo emojiInfo = new EmojiInfo();
                    emojiInfo.convertFrom(all);
                    arrayList.add(emojiInfo);
                }
                all.close();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (C101964h.m134231m((EmojiInfo) next)) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (true) {
                    boolean z = true;
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next2 = it4.next();
                    EmojiInfo emojiInfo2 = (EmojiInfo) next2;
                    if (C101964h.m134231m(emojiInfo2) || C101964h.m134227i(emojiInfo2)) {
                        z = false;
                    }
                    if (z) {
                        arrayList3.add(next2);
                    }
                }
                String str = this.f195264d.f266603d;
                Log.m105924i(str, "add emoji, " + arrayList.size());
                String str2 = this.f195264d.f266603d;
                StringBuilder sb = new StringBuilder();
                sb.append("add emoji, custom ");
                ArrayList arrayList4 = new ArrayList();
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    Object next3 = it5.next();
                    int i = ((EmojiInfo) next3).field_catalog;
                    IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
                    if (i == 81) {
                        arrayList4.add(next3);
                    }
                }
                sb.append(arrayList4.size());
                sb.append(' ');
                Log.m105924i(str2, sb.toString());
                String str3 = this.f195264d.f266603d;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("add emoji, non store custom ");
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    Object next4 = it6.next();
                    EmojiInfo emojiInfo3 = (EmojiInfo) next4;
                    if (!C101964h.m134231m(emojiInfo3) && !C101964h.m134227i(emojiInfo3)) {
                        arrayList5.add(next4);
                    }
                }
                sb4.append(arrayList5.size());
                Log.m105924i(str3, sb4.toString());
                ArrayList arrayList6 = new ArrayList();
                Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    Object next5 = it7.next();
                    EmojiInfo emojiInfo4 = (EmojiInfo) next5;
                    if (!C101964h.m134231m(emojiInfo4) && !C101964h.m134227i(emojiInfo4) && (Util.isNullOrNil(emojiInfo4.field_cdnUrl) ^ true)) {
                        arrayList6.add(next5);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it8 = arrayList6.iterator();
                while (it8.hasNext()) {
                    arrayList7.add(((EmojiInfo) it8.next()).getMd5());
                }
                Collections.shuffle(arrayList7);
                EmojiDebugUI emojiDebugUI = this.f195264d;
                emojiDebugUI.getClass();
                C8477a0 a0Var = new C8477a0();
                C61926c.m72657B("EmojiDebugUI_addEmoji", true, new C77721d(arrayList7, emojiDebugUI, new C8477a0(), a0Var, new Object(), new C8478d0(), C89779i0.m112248e(emojiDebugUI, emojiDebugUI.getString(C0966R.string.c_x), true, 0, new C63946g(a0Var))));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$q */
    public static final class C68036q extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f195265d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68036q(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f195265d = emojiDebugUI;
        }

        public Object invoke() {
            new C61303b(0, 2, C64197v.m75537f("9bd1281af3a31710a45b84d736363691", "08f223fa83f1ca34e143d1e580252c7c")).mo9225i().mo123420E(new C68037d(this.f195265d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$e1 */
    public static final class C80841e1 extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C80841e1 f237631d = new C80841e1();

        public C80841e1() {
            super(0);
        }

        public Object invoke() {
            return String.valueOf(EmojiDebugUI.f266602i);
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$h */
    public static final class C80842h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C80842h f237632d = new C80842h();

        public C80842h() {
            super(0);
        }

        public Object invoke() {
            C90638g b = C100134k.m130828b(new C86009m1("/sdcard/temp/egg.xml"));
            if (b != null) {
                C90638g E = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137997E();
                E.f260402e = b.f260402e;
                E.f260401d.clear();
                Iterator<C111153e> it = b.f260401d.iterator();
                while (it.hasNext()) {
                    C111153e next = it.next();
                    if (next.f332884n <= 11) {
                        E.f260401d.add(next);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$i */
    public static final class C80843i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f237633d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80843i(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f237633d = emojiDebugUI;
        }

        public Object invoke() {
            C90638g E = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137997E();
            if (E == null) {
                C76701a.makeText((Context) this.f237633d, (CharSequence) "eggList null!", 0).show();
            } else {
                int sC = ((C32147e) C86312j.m106911c(C32147e.class)).mo58514sC(37, 5);
                StringBuilder sb = new StringBuilder();
                sb.append("version: " + E.f260402e + " -- " + sC + 10);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("list:\n ");
                LinkedList<C111153e> linkedList = E.f260401d;
                C87412m.m108593f(linkedList, "eggList.eggList");
                sb4.append(C110818d0.m150921S(linkedList, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C80846c.f237636d, 30, (Object) null));
                sb.append(sb4.toString());
                C77426q qVar = new C77426q(this.f237633d);
                qVar.mo107595g(sb.toString());
                qVar.mo107589a(true);
                qVar.mo107603o();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$m */
    public static final class C80844m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f237634d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80844m(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f237634d = emojiDebugUI;
        }

        public Object invoke() {
            new C99500l(1, (String) null).mo138911a();
            C76701a.makeText((Context) this.f237634d, (CharSequence) "done", 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$t */
    public static final class C80845t extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f237635d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80845t(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f237635d = emojiDebugUI;
        }

        public Object invoke() {
            String str = C101624e.f297487d + "preview/";
            if (C86013q1.m106450k(str)) {
                StringBuilder sb = new StringBuilder();
                File externalCacheDir = this.f237635d.getExternalCacheDir();
                sb.append(externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null);
                sb.append("/preview.zip");
                String sb4 = sb.toString();
                C86013q1.m106439U(str, sb4);
                C76701a.makeText((Context) this.f237635d, (CharSequence) sb4, 1).show();
                ClipboardHelper.setText(sb4);
            } else {
                C76701a.makeText((Context) this.f237635d, (CharSequence) "no file", 1).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$a */
    public abstract class C92628a {
        public C92628a(EmojiDebugUI emojiDebugUI) {
        }

        /* renamed from: a */
        public abstract void mo126663a();

        /* renamed from: b */
        public float mo126664b() {
            return 0.0f;
        }

        /* renamed from: c */
        public abstract String mo126665c();

        /* renamed from: d */
        public abstract String mo126666d();
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$a0 */
    public static final class C92629a0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f266606d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92629a0(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f266606d = emojiDebugUI;
        }

        public Object invoke() {
            EmojiDebugUI.m116699H7(this.f266606d, "/sdcard/temp/emojiRes/wxam_emoji_basic/", "/sdcard/temp/emojiRes/newFileWxam_Basic_20210804", 0, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$b */
    public final class C92630b extends C92628a {

        /* renamed from: a */
        public final String f266607a;

        /* renamed from: b */
        public C32224a<String> f266608b;

        /* renamed from: c */
        public C32224a<C13598b0> f266609c;

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f266610d;

        /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$b$a */
        public static final class C92631a extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public final /* synthetic */ String f266611d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C92631a(String str) {
                super(0);
                this.f266611d = str;
            }

            public Object invoke() {
                return this.f266611d;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92630b(EmojiDebugUI emojiDebugUI, String str, C32224a<String> aVar, C32224a<C13598b0> aVar2) {
            super(emojiDebugUI);
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(aVar, "valueGetter");
            this.f266610d = emojiDebugUI;
            this.f266607a = str;
            this.f266608b = aVar;
            this.f266609c = aVar2;
        }

        /* renamed from: a */
        public void mo126663a() {
            RecyclerView.C16613e adapter;
            C32224a<C13598b0> aVar = this.f266609c;
            if (aVar != null) {
                aVar.invoke();
            }
            RecyclerView recyclerView = this.f266610d.f266605f;
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
        }

        /* renamed from: c */
        public String mo126665c() {
            return this.f266607a;
        }

        /* renamed from: d */
        public String mo126666d() {
            return this.f266608b.invoke();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C92630b(EmojiDebugUI emojiDebugUI, String str, String str2, C32224a<C13598b0> aVar) {
            this(emojiDebugUI, str, (C32224a<String>) new C92631a(str2), aVar);
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(str2, "value");
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$b0 */
    public static final class C92632b0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f266612d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92632b0(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f266612d = emojiDebugUI;
        }

        public Object invoke() {
            EmojiDebugUI.m116699H7(this.f266612d, "/sdcard/temp/emojiRes/png_emoji/", "/sdcard/temp/emojiRes/newFilePng", 0, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$b1 */
    public static final class C92633b1 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C92633b1 f266613d = new C92633b1();

        public C92633b1() {
            super(0);
        }

        public Object invoke() {
            C46878j.f126071a.mo72084a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$c */
    public final class C92634c<T> extends C92628a {

        /* renamed from: a */
        public final String f266614a;

        /* renamed from: b */
        public final C72994y1.C72995a f266615b;

        /* renamed from: c */
        public final List<String> f266616c;

        /* renamed from: d */
        public final List<T> f266617d;

        /* renamed from: e */
        public final /* synthetic */ EmojiDebugUI f266618e;

        /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$c$a */
        public static final class C92635a implements C76879j.C76888o {

            /* renamed from: a */
            public final /* synthetic */ EmojiDebugUI f266619a;

            /* renamed from: b */
            public final /* synthetic */ C92634c<T> f266620b;

            public C92635a(EmojiDebugUI emojiDebugUI, C92634c<T> cVar) {
                this.f266619a = emojiDebugUI;
                this.f266620b = cVar;
            }

            /* renamed from: a */
            public final void mo5759a(int i, int i2) {
                RecyclerView.C16613e adapter;
                EmojiDebugUI emojiDebugUI = this.f266619a;
                C92634c<T> cVar = this.f266620b;
                C72994y1.C72995a aVar = cVar.f266615b;
                T t = cVar.f266617d.get(i2);
                boolean z = EmojiDebugUI.f266600g;
                emojiDebugUI.getClass();
                C86709a0.m107535s().mo121142i().mo119677K(aVar, t);
                RecyclerView recyclerView = this.f266619a.f266605f;
                if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92634c(EmojiDebugUI emojiDebugUI, String str, C72994y1.C72995a aVar, List<String> list, List<? extends T> list2) {
            super(emojiDebugUI);
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(aVar, "configKey");
            C87412m.m108594g(list, "contentArray");
            C87412m.m108594g(list2, "valueArray");
            this.f266618e = emojiDebugUI;
            this.f266614a = str;
            this.f266615b = aVar;
            this.f266616c = list;
            this.f266617d = list2;
        }

        /* renamed from: a */
        public void mo126663a() {
            LinkedList linkedList = new LinkedList();
            int size = this.f266616c.size();
            for (int i = 0; i < size; i++) {
                linkedList.add(Integer.valueOf(i));
            }
            EmojiDebugUI emojiDebugUI = this.f266618e;
            List<String> list = this.f266616c;
            C76879j.m92732c(emojiDebugUI, "", list, C110818d0.m150953y0(C64197v.m75535d(list)), "", new C92635a(this.f266618e, this));
        }

        /* renamed from: c */
        public String mo126665c() {
            return this.f266614a;
        }

        /* renamed from: d */
        public String mo126666d() {
            List<T> list = this.f266617d;
            EmojiDebugUI emojiDebugUI = this.f266618e;
            C72994y1.C72995a aVar = this.f266615b;
            T t = list.get(0);
            boolean z = EmojiDebugUI.f266600g;
            emojiDebugUI.getClass();
            int indexOf = list.indexOf(C86709a0.m107535s().mo121142i().mo119685f(aVar, t));
            return (indexOf < 0 || indexOf >= this.f266616c.size()) ? this.f266616c.get(0) : this.f266616c.get(indexOf);
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$c1 */
    public static final class C92636c1 extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C92636c1 f266621d = new C92636c1();

        public C92636c1() {
            super(0);
        }

        public Object invoke() {
            return String.valueOf(C97491p.f286143a.mo136775d());
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$d */
    public final class C92637d extends RecyclerView.C16613e<C92638e> {
        public C92637d() {
        }

        public int getItemCount() {
            return EmojiDebugUI.this.f266604e.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C92638e eVar = (C92638e) zVar;
            C87412m.m108594g(eVar, "holder");
            float b = EmojiDebugUI.this.f266604e.get(i).mo126664b();
            eVar.f266623z.setText(EmojiDebugUI.this.f266604e.get(i).mo126665c() + ": " + EmojiDebugUI.this.f266604e.get(i).mo126666d());
            eVar.f266623z.setBackgroundResource(C0966R.C0969drawable.am7);
            if (b > 0.0f) {
                eVar.f266623z.setTextSize(b);
            } else {
                eVar.f266623z.setTextSize(2, 18.0f);
            }
            eVar.f266623z.setOnClickListener(new C92656a(EmojiDebugUI.this, i));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup.getContext(), (AttributeSet) null);
            appCompatTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, C76577a.m92151b(viewGroup.getContext(), 48)));
            appCompatTextView.setTextColor(-16777216);
            appCompatTextView.setGravity(17);
            appCompatTextView.setTextSize(2, 18.0f);
            return new C92638e(EmojiDebugUI.this, appCompatTextView);
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$e */
    public final class C92638e extends RecyclerView.C16631z {

        /* renamed from: z */
        public final TextView f266623z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92638e(EmojiDebugUI emojiDebugUI, TextView textView) {
            super(textView);
            C87412m.m108594g(textView, "itemView");
            this.f266623z = textView;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$e0 */
    public static final class C92639e0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f266624d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92639e0(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f266624d = emojiDebugUI;
        }

        public Object invoke() {
            C97484a.f286123a.mo136755a("/sdcard/temp/emojiRes/emoji-anim.xml", C102051g.f300538e);
            String str = this.f266624d.f266603d;
            Log.m105924i(str, "parse anim: " + C102051g.f300538e.f300528c.size());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$f */
    public final class C92640f extends C92628a {

        /* renamed from: a */
        public final C32224a<String> f266625a;

        /* renamed from: b */
        public final C32224a<String> f266626b;

        /* renamed from: c */
        public final C32224a<C13598b0> f266627c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92640f(EmojiDebugUI emojiDebugUI, C32224a<String> aVar, C32224a<String> aVar2, C32224a<C13598b0> aVar3) {
            super(emojiDebugUI);
            C87412m.m108594g(aVar, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(aVar2, "value");
            this.f266625a = aVar;
            this.f266626b = aVar2;
            this.f266627c = aVar3;
        }

        /* renamed from: a */
        public void mo126663a() {
            C32224a<C13598b0> aVar = this.f266627c;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        /* renamed from: c */
        public String mo126665c() {
            return this.f266625a.invoke();
        }

        /* renamed from: d */
        public String mo126666d() {
            return this.f266626b.invoke();
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$f0 */
    public static final class C92641f0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f266628d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92641f0(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f266628d = emojiDebugUI;
        }

        public Object invoke() {
            ArrayList arrayList;
            C96926b0 b = C96926b0.m124490b();
            synchronized (b.f283937d) {
                arrayList = new ArrayList(b.f283937d);
            }
            EmojiDebugUI emojiDebugUI = this.f266628d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                SmileyPanelConfigInfo smileyPanelConfigInfo = (SmileyPanelConfigInfo) it.next();
                if (C96945j0.f283998s == null) {
                    synchronized (C96945j0.class) {
                        if (C96945j0.f283998s == null) {
                            Context context = MMApplicationContext.getContext();
                            C87412m.m108593f(context, "getContext()");
                            C96945j0.f283998s = new C96945j0(context, (C8480h) null);
                            if (MMApplicationContext.isMainProcess()) {
                                Log.m105924i("MicroMsg.QQSmileyManager", "checkNewEmoji");
                            }
                        }
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                }
                C96945j0 j0Var = C96945j0.f283998s;
                C87412m.m108591d(j0Var);
                String str = smileyPanelConfigInfo.field_key;
                C87412m.m108593f(str, "it.field_key");
                SmileyInfo g = j0Var.mo135535g(str);
                String c = C96931e.m124499a().mo135523c(smileyPanelConfigInfo.field_key);
                if (g == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("\\\\u");
                    int i = smileyPanelConfigInfo.field_key.codePoints().toArray()[0];
                    C66713a.m78712a(16);
                    String num = Integer.toString(i, 16);
                    C87412m.m108593f(num, "toString(this, checkRadix(radix))");
                    sb.append(num);
                    String sb4 = sb.toString();
                    String str2 = smileyPanelConfigInfo.field_key;
                    C87412m.m108593f(str2, "it.field_key");
                    Charset charset = C119027c.f356488a;
                    byte[] bytes = str2.getBytes(charset);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    byte[] encode = Base64.encode(bytes, 0);
                    C87412m.m108593f(encode, "encode(it.field_key.toByteArray(), Base64.DEFAULT)");
                    new String(encode, charset);
                    String str3 = emojiDebugUI.f266603d;
                    Log.m105924i(str3, "smiley key : " + smileyPanelConfigInfo.field_key + ", " + sb4 + ", " + c);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$g */
    public final class C92642g extends C92628a {

        /* renamed from: a */
        public final String f266629a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92642g(EmojiDebugUI emojiDebugUI, String str) {
            super(emojiDebugUI);
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            this.f266629a = str;
        }

        /* renamed from: a */
        public void mo126663a() {
        }

        /* renamed from: b */
        public float mo126664b() {
            return 30.0f;
        }

        /* renamed from: c */
        public String mo126665c() {
            return this.f266629a;
        }

        /* renamed from: d */
        public String mo126666d() {
            return "";
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$j */
    public static final class C92643j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f266630d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92643j(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f266630d = emojiDebugUI;
        }

        public Object invoke() {
            C97484a.f286123a.mo136755a("/sdcard/temp/emoji-anim.xml", C102051g.f300538e);
            String str = this.f266630d.f266603d;
            Log.m105924i(str, "anim version " + C102051g.f300538e.f300527b);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$k0 */
    public static final class C92644k0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f266631d;

        /* renamed from: e */
        public final /* synthetic */ int f266632e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92644k0(EmojiDebugUI emojiDebugUI, int i) {
            super(0);
            this.f266631d = emojiDebugUI;
            this.f266632e = i;
        }

        public Object invoke() {
            EmojiDebugUI.f266600g = !EmojiDebugUI.f266600g;
            RecyclerView recyclerView = this.f266631d.f266605f;
            RecyclerView.C16613e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.emoji.debug.EmojiDebugUI.DebugAdapter");
            ((C92637d) adapter).notifyItemChanged(this.f266632e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$l */
    public static final class C92645l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C92645l f266633d = new C92645l();

        public C92645l() {
            super(0);
        }

        public Object invoke() {
            ((C112645b) C86312j.m106911c(C112645b.class)).pw0("https://game.weixin.qq.com/cgi-bin/h5/static/act_dnfm/index.html?noticeid=90248502&wechat_pkgid=act_dnfm_index&actid=138433&nav_color=F2D8AB&darkmode_nav_color=F2D8AB&hide_share_option=1#wechat_redirect");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$l0 */
    public static final class C92646l0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f266634d;

        /* renamed from: e */
        public final /* synthetic */ int f266635e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92646l0(EmojiDebugUI emojiDebugUI, int i) {
            super(0);
            this.f266634d = emojiDebugUI;
            this.f266635e = i;
        }

        public Object invoke() {
            EmojiDebugUI.f266601h = !EmojiDebugUI.f266601h;
            RecyclerView recyclerView = this.f266634d.f266605f;
            RecyclerView.C16613e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.emoji.debug.EmojiDebugUI.DebugAdapter");
            ((C92637d) adapter).notifyItemChanged(this.f266635e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$o */
    public static final class C92647o extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f266636d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92647o(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f266636d = emojiDebugUI;
        }

        public Object invoke() {
            C86013q1.m106445f(C89008j.f256613a.mo123385d());
            C86013q1.m106445f(C112760b.m154225d() + "emoji/cover/");
            C102688b.f303300a.getClass();
            C102688b.f303301b.clear();
            for (EmojiInfo emojiInfo : C97489o.m125592g().mo136760a()) {
                if (!C101964h.m134228j(emojiInfo)) {
                    emojiInfo.field_state = 4;
                    C30790w2.m39221h().mo57717d().X90(emojiInfo);
                }
            }
            ArrayList<EmojiGroupInfo> d = C97489o.m125592g().mo136763d();
            C87412m.m108593f(d, "getInstance().emojiGroupInfoList");
            for (EmojiGroupInfo emojiGroupInfo : d) {
                emojiGroupInfo.field_sync = 1;
                C30790w2.m39221h().mo57715b().update(emojiGroupInfo, new String[0]);
            }
            C97489o.m125592g().mo136769k(true);
            C92668a.C92674f fVar = C92668a.f266699q;
            fVar.mo126718b(false).mo126702d(true);
            fVar.mo126717a(false).mo126702d(true);
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).getClass();
            C93123b<C41062e> wx02 = ((C92054g) C86312j.m106911c(C92054g.class)).wx0();
            ((C119157j) C119157j.f356862d).mo183875f(new C41060a(wx02));
            C76701a.makeText((Context) this.f266636d, (CharSequence) "done", 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$p */
    public static final class C92648p extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f266637d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92648p(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f266637d = emojiDebugUI;
        }

        public Object invoke() {
            C101964h.m134223e();
            C76701a.makeText((Context) this.f266637d, (CharSequence) "done", 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$t0 */
    public static final class C92649t0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f266638d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92649t0(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f266638d = emojiDebugUI;
        }

        public Object invoke() {
            EmojiDebugUI.f266602i = !EmojiDebugUI.f266602i;
            RecyclerView recyclerView = this.f266638d.f266605f;
            RecyclerView.C16613e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.emoji.debug.EmojiDebugUI.DebugAdapter");
            ((C92637d) adapter).notifyDataSetChanged();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$u */
    public static final class C92650u extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C92650u f266639d = new C92650u();

        public C92650u() {
            super(0);
        }

        public Object invoke() {
            C86013q1.m106445f(C101624e.f297485b);
            C101893b bVar = C101893b.f300042a;
            C101893b.f300047f.f138692d.clear();
            bVar.mo141390b();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$v */
    public static final class C92651v extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f266640d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92651v(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f266640d = emojiDebugUI;
        }

        public Object invoke() {
            String str = C101624e.f297487d + "preview/";
            C86013q1.m106445f(str);
            C86013q1.m106461v(str);
            C86013q1.m106436R("/sdcard/temp/sticker/output.zip", str);
            C101383g gVar = new C101383g();
            C87412m.m108594g(str, "<set-?>");
            gVar.f296978c = str;
            gVar.f296976a = "preview";
            gVar.mo140866c(str);
            C101383g gVar2 = new C101383g();
            gVar2.f296978c = str;
            gVar2.mo140865b(str);
            Log.m105924i(this.f266640d.f266603d, "pack: " + gVar.f296986k.size() + ", " + gVar2.f296986k.size());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$w */
    public static final class C92652w extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C92652w f266641d = new C92652w();

        public C92652w() {
            super(0);
        }

        public Object invoke() {
            return String.valueOf(C102457e.f301715d);
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$x */
    public static final class C92653x extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C92653x f266642d = new C92653x();

        public C92653x() {
            super(0);
        }

        public Object invoke() {
            C102457e.f301715d = !C102457e.f301715d;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$y */
    public static final class C92654y extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f266643d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92654y(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f266643d = emojiDebugUI;
        }

        public Object invoke() {
            C96931e.m124499a().getClass();
            boolean z = C96965r.f284067d;
            C96965r rVar = C96965r.C44649c.f121057a;
            C96964q qVar = rVar.f284071a;
            C96931e.m124499a().getClass();
            C96965r.C96968b bVar = rVar.f284072b;
            int i = bVar != null ? bVar.f284078d : 0;
            String str = this.f266643d.f266603d;
            Log.m105924i(str, "emojiRes: item size " + qVar.f284064d.size() + ", headerOffset = " + i);
            C61926c.m72656A((String) null, new C92657f(qVar, this.f266643d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.debug.EmojiDebugUI$z */
    public static final class C92655z extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDebugUI f266644d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92655z(EmojiDebugUI emojiDebugUI) {
            super(0);
            this.f266644d = emojiDebugUI;
        }

        public Object invoke() {
            EmojiDebugUI.m116699H7(this.f266644d, "/sdcard/temp/emojiRes/wxam_emoji/", "/sdcard/temp/emojiRes/newFileAppendWxamAll_20210804", 0, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: H7 */
    public static void m116699H7(EmojiDebugUI emojiDebugUI, String str, String str2, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = -1;
        }
        emojiDebugUI.getClass();
        C87412m.m108594g(str, "srcResDirPath");
        C87412m.m108594g(str2, "saveFilePath");
        C61926c.m72656A((String) null, new C101641i(str2, str, j, emojiDebugUI));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a1k;
    }

    public void onCreate(Bundle bundle) {
        RecyclerView.C16613e adapter;
        super.onCreate(bundle);
        if (!WeChatEnvironment.hasDebugger() && !BuildInfo.IS_FLAVOR_RED && !BuildInfo.IS_FLAVOR_PURPLE && !BuildInfo.DEBUG) {
            finish();
        }
        setBackBtn(new C1245r(this));
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.cf8);
        this.f266605f = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
        RecyclerView recyclerView2 = this.f266605f;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(new C92637d());
        }
        RecyclerView recyclerView3 = this.f266605f;
        if (recyclerView3 != null) {
            recyclerView3.mo17085h0(new C0132m(this, 1));
        }
        RecyclerView recyclerView4 = this.f266605f;
        if (!(recyclerView4 == null || (adapter = recyclerView4.getAdapter()) == null)) {
            adapter.notifyDataSetChanged();
        }
        this.f266604e.add(new C92642g(this, "WeVision"));
        this.f266604e.add(new C92630b(this, "load model", "", (C32224a<C13598b0>) C1236c0.f10287d));
        this.f266604e.add(new C92630b(this, "model info", "", (C32224a<C13598b0>) new C1244n0(this)));
        this.f266604e.add(new C92630b(this, "config info", "", (C32224a<C13598b0>) new C1250y0(this)));
        this.f266604e.add(new C92630b(this, "reset run score", "", (C32224a<C13598b0>) C1251z0.f10304d));
        this.f266604e.add(new C92642g(this, ""));
        this.f266604e.add(new C92630b(this, "custom from clipboard", "", (C32224a<C13598b0>) new C28907a1(this)));
        this.f266604e.add(new C92630b(this, "update group", "", (C32224a<C13598b0>) C92633b1.f266613d));
        this.f266604e.add(new C92630b(this, "Reset IP Intro", (C32224a<String>) C92636c1.f266621d, (C32224a<C13598b0>) C1237d1.f10288d));
        this.f266604e.add(new C92642g(this, ""));
        this.f266604e.add(new C92630b(this, "Test parse egg", "", (C32224a<C13598b0>) C80842h.f237632d));
        this.f266604e.add(new C92630b(this, "list egg", "", (C32224a<C13598b0>) new C80843i(this)));
        this.f266604e.add(new C92630b(this, "test parse anim", "", (C32224a<C13598b0>) new C92643j(this)));
        this.f266604e.add(new C92630b(this, "测试打开网页", "", (C32224a<C13598b0>) new C1242k(this)));
        this.f266604e.add(new C92630b(this, "测试预加载", "", (C32224a<C13598b0>) C92645l.f266633d));
        this.f266604e.add(new C92630b(this, "Test Sync Emoji", "", (C32224a<C13598b0>) new C80844m(this)));
        this.f266604e.add(new C92630b(this, "Test Add Emoji", "", (C32224a<C13598b0>) new C68035n(this)));
        this.f266604e.add(new C92630b(this, "Test Clear Emoji", "", (C32224a<C13598b0>) new C92647o(this)));
        this.f266604e.add(new C92630b(this, "game in", "", (C32224a<C13598b0>) new C92648p(this)));
        this.f266604e.add(new C92630b(this, "game out", "", (C32224a<C13598b0>) new C68036q(this)));
        this.f266604e.add(new C92642g(this, ""));
        this.f266604e.add(new C92630b(this, "Start Sticker Preview", "", (C32224a<C13598b0>) new C28912s(this)));
        this.f266604e.add(new C92630b(this, "copy preview", "", (C32224a<C13598b0>) new C80845t(this)));
        this.f266604e.add(new C92630b(this, "Clean Sticker Cache", "", (C32224a<C13598b0>) C92650u.f266639d));
        this.f266604e.add(new C92630b(this, "test parse", "", (C32224a<C13598b0>) new C92651v(this)));
        this.f266604e.add(new C92630b(this, "Mock Download Fail", (C32224a<String>) C92652w.f266641d, (C32224a<C13598b0>) C92653x.f266642d));
        this.f266604e.add(new C92642g(this, "Emoji Res"));
        this.f266604e.add(new C92630b(this, "dump new system emoji", "", (C32224a<C13598b0>) new C92654y(this)));
        this.f266604e.add(new C92630b(this, "make new emoji", "", (C32224a<C13598b0>) new C92655z(this)));
        this.f266604e.add(new C92630b(this, "make new basic emoji", "", (C32224a<C13598b0>) new C92629a0(this)));
        this.f266604e.add(new C92630b(this, "make new emoji by png", "", (C32224a<C13598b0>) new C92632b0(this)));
        this.f266604e.add(new C92630b(this, "make new emoji not entire", "", (C32224a<C13598b0>) new C68034d0(this)));
        this.f266604e.add(new C92630b(this, "parse anim emoji", "", (C32224a<C13598b0>) new C92639e0(this)));
        this.f266604e.add(new C92630b(this, "get smiley", "", (C32224a<C13598b0>) new C92641f0(this)));
        this.f266604e.add(new C92634c(this, "Sticker Panel Switch", C72994y1.C72995a.USERINFO_EMOJI_STICKER_ENABLE_INT, C64197v.m75537f("use remote config", "enable", "disable"), C64197v.m75537f(0, 1, 2)));
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("xlab_effect_config");
        this.f266604e.add(new C92630b(this, "Toggle multi thread", String.valueOf(mmkv.getBoolean("multi_thread", false)), (C32224a<C13598b0>) new C1238g0(mmkv, this)));
        this.f266604e.add(new C92640f(this, C1239h0.f10291d, new C1240i0(mmkv), new C1241j0(mmkv, this)));
        this.f266604e.add(new C92634c(this, "Use CDN?", C72994y1.C72995a.USERINFO_EMOJI_UPLOAD_CDN_INT, C64197v.m75537f("remote config", "yes", "no"), C64197v.m75537f(0, 1, 2)));
        int size = this.f266604e.size();
        C92630b bVar = new C92630b(this, "Egg Spring: Stop CGI?", "" + f266600g, (C32224a<C13598b0>) null);
        bVar.f266609c = new C92644k0(this, size);
        this.f266604e.add(bVar);
        int size2 = this.f266604e.size();
        C92630b bVar2 = new C92630b(this, "Egg Spring: Stop CDN?", "" + f266601h, (C32224a<C13598b0>) null);
        bVar2.f266609c = new C92646l0(this, size2);
        this.f266604e.add(bVar2);
        this.f266604e.add(new C92630b(this, "Egg res Info", "", (C32224a<C13598b0>) C1243m0.f10296d));
        this.f266604e.add(new C92642g(this, ""));
        this.f266604e.add(new C92630b(this, "GetDesigner", "", (C32224a<C13598b0>) C28908o0.f79328d));
        this.f266604e.add(new C92642g(this, "Emoji Suggest"));
        this.f266604e.add(new C92630b(this, "Show Words", "", (C32224a<C13598b0>) new C28909p0(this)));
        this.f266604e.add(new C92630b(this, "Clear Cache", "", (C32224a<C13598b0>) C28910q0.f79330d));
        this.f266604e.add(new C92630b(this, "Update Word List", "", (C32224a<C13598b0>) C28911r0.f79331d));
        this.f266604e.add(new C92630b(this, "Emoji Suggest config", "", (C32224a<C13598b0>) new C28913s0(this)));
        C92630b bVar3 = new C92630b(this, "Show meaning: ", (C32224a<String>) C80841e1.f237631d, (C32224a<C13598b0>) null);
        this.f266604e.size();
        bVar3.f266609c = new C92649t0(this);
        this.f266604e.add(bVar3);
        this.f266604e.add(new C92630b(this, "清除秒剪权限请求缓存", "", (C32224a<C13598b0>) C1246u0.f10299d));
        this.f266604e.add(new C92630b(this, "查看当前魔法表情信息", "", (C32224a<C13598b0>) new C1247v0(this)));
        this.f266604e.add(new C92630b(this, "下载最新魔法表情 (Unity)", "", (C32224a<C13598b0>) C1248w0.f10301d));
        this.f266604e.add(new C92630b(this, "下载最新魔法表情 (Cocos)", "", (C32224a<C13598b0>) C1249x0.f10302d));
    }
}
