package sk3;

import android.graphics.Bitmap;
import android.text.SpannableString;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C97625j3;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import kg3.C76577a;
import kv1.C99254i;
import nj3.C11184p0;
import nk3.C61801g;
import nk3.C61802h;
import nk3.C61805j;
import nk3.C61806k;
import ok3.C62070e;
import ok3.C62073h;
import p158gt.C98201k;
import p243tn.C14050a;
import p248ug.C102027b;
import p763ym.C79138l;
import qo3.C77407n;
import rk3.C63462a;
import wd3.C22898h;
import wd3.C22908r;

/* renamed from: sk3.g0 */
public final class C77723g0 extends C63994l0 implements C61806k, C61805j {

    /* renamed from: r */
    public C61802h f226531r;

    /* renamed from: sk3.g0$a */
    public static final class C63980a implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ C77723g0 f181386d;

        /* renamed from: e */
        public final /* synthetic */ View f181387e;

        public C63980a(C77723g0 g0Var, View view) {
            this.f181386d = g0Var;
            this.f181387e = view;
        }

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            this.f181386d.getClass();
            contextMenu.add(0, 0, 0, this.f181387e.getContext().getString(C0966R.string.i4e));
            contextMenu.add(0, this.f181386d.f181416e, 0, this.f181387e.getContext().getString(C0966R.string.b7o));
            contextMenu.add(0, this.f181386d.f181417f, 0, this.f181387e.getContext().getString(C0966R.string.n3j));
            contextMenu.add(0, this.f181386d.f181418g, 0, this.f181387e.getContext().getString(C0966R.string.b_1));
        }
    }

    /* renamed from: sk3.g0$b */
    public static final class C63981b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C62070e f181388d;

        /* renamed from: e */
        public final /* synthetic */ C77723g0 f181389e;

        public C63981b(C62070e eVar, C77723g0 g0Var) {
            this.f181388d = eVar;
            this.f181389e = g0Var;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f181388d.f176459d);
            C77723g0 g0Var = this.f181389e;
            g0Var.mo88759g3(menuItem.getItemId(), b002, g0Var.f181423o);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77723g0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:89:0x039d, code lost:
        if (r4 != false) goto L_0x03cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x056c  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x080d  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0811  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0818  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x081b  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0824  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0827  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0836  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0897  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x089c  */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86728M0(android.view.View r29, int r30, ok3.C62070e r31) {
        /*
            r28 = this;
            r1 = r28
            r0 = r31
            java.lang.Class<ym.l> r2 = p763ym.C79138l.class
            java.lang.Class<ym.p> r3 = p763ym.C79139p.class
            java.lang.String r4 = "v"
            r5 = r29
            gy3.C87412m.m108594g(r5, r4)
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r0, r4)
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r30)
            r8 = 0
            r6[r8] = r7
            java.lang.String r7 = "MicroMsg. FTSMultiItemUrlUIC"
            java.lang.String r9 = "[onItemClick] position:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r6)
            r28.mo88760i3()
            r6 = r0
            ok3.h r6 = (ok3.C62073h) r6
            int r0 = r0.f176457b
            r10 = 5
            r11 = 0
            java.lang.String r12 = ".ui.tools.WebViewUI"
            java.lang.String r13 = "webview"
            java.lang.String r14 = ""
            java.lang.String r15 = "geta8key_username"
            java.lang.String r9 = "rawUrl"
            if (r0 == r10) goto L_0x06d6
            r5 = 7
            r10 = 2
            if (r0 == r5) goto L_0x02c0
            r2 = 15
            r3 = 23
            java.lang.String r5 = "emoji"
            if (r0 == r2) goto L_0x0230
            r2 = 51
            if (r0 == r2) goto L_0x018b
            r2 = 97
            java.lang.String r10 = "topic id is zero."
            if (r0 == r2) goto L_0x00f9
            r2 = 26
            if (r0 == r2) goto L_0x00f9
            r2 = 27
            if (r0 == r2) goto L_0x006b
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r8] = r0
            java.lang.String r0 = "[onItemClick] type:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r2)
            goto L_0x02bd
        L_0x006b:
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            long r2 = r6.f176459d
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r0 = r0.b00(r2)
            java.lang.String r2 = r0.getContent()
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r11)
            int r3 = r2.f195511M1
            java.lang.String r6 = r2.f195514N1
            java.lang.String r8 = r2.f195517O1
            java.lang.String r12 = r2.f195520P1
            java.lang.String r13 = r2.f195523Q1
            int r11 = r2.f195526R1
            if (r3 == 0) goto L_0x00f4
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r10 = r1.f181423o
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85820U5(r10)
            r17 = r14
            int r14 = r0.mo108769t2()
            if (r14 != r4) goto L_0x00a9
            java.lang.String r0 = eb0.C75592q0.m90789s()
            goto L_0x00c2
        L_0x00a9:
            if (r10 == 0) goto L_0x00b4
            java.lang.String r4 = r0.getContent()
            java.lang.String r14 = eb0.C75604z3.m90847s(r4)
            goto L_0x00b6
        L_0x00b4:
            r14 = r17
        L_0x00b6:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r4 == 0) goto L_0x00c1
            java.lang.String r0 = r0.mo108768t()
            goto L_0x00c2
        L_0x00c1:
            r0 = r14
        L_0x00c2:
            r7.putExtra(r15, r0)
            java.lang.String r0 = r2.f195642x
            r7.putExtra(r9, r0)
            java.lang.String r0 = "set_id"
            r7.putExtra(r0, r3)
            java.lang.String r0 = "set_title"
            r7.putExtra(r0, r6)
            java.lang.String r0 = "set_iconURL"
            r7.putExtra(r0, r12)
            java.lang.String r0 = "set_desc"
            r7.putExtra(r0, r8)
            java.lang.String r0 = "headurl"
            r7.putExtra(r0, r13)
            java.lang.String r0 = "pageType"
            r7.putExtra(r0, r11)
            androidx.appcompat.app.AppCompatActivity r0 = r28.getActivity()
            java.lang.String r2 = ".ui.v2.EmojiStoreV2SingleProductUI"
            r3 = 0
            ke3.C88144b.m109791i(r0, r5, r2, r7, r3)
            goto L_0x02bd
        L_0x00f4:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            goto L_0x02bd
        L_0x00f9:
            r17 = r14
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            long r11 = r6.f176459d
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r0 = r0.b00(r11)
            java.lang.String r2 = r0.getContent()
            r6 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r6)
            int r6 = r2.f195511M1
            java.lang.String r8 = r2.f195514N1
            java.lang.String r11 = r2.f195517O1
            java.lang.String r12 = r2.f195520P1
            java.lang.String r13 = r2.f195523Q1
            if (r6 == 0) goto L_0x0186
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r10 = r1.f181423o
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85820U5(r10)
            int r14 = r0.mo108769t2()
            if (r14 != r4) goto L_0x0136
            java.lang.String r0 = eb0.C75592q0.m90789s()
            goto L_0x014f
        L_0x0136:
            if (r10 == 0) goto L_0x0141
            java.lang.String r4 = r0.getContent()
            java.lang.String r14 = eb0.C75604z3.m90847s(r4)
            goto L_0x0143
        L_0x0141:
            r14 = r17
        L_0x0143:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r4 == 0) goto L_0x014e
            java.lang.String r0 = r0.mo108768t()
            goto L_0x014f
        L_0x014e:
            r0 = r14
        L_0x014f:
            r7.putExtra(r15, r0)
            java.lang.String r0 = r2.f195642x
            r7.putExtra(r9, r0)
            java.lang.String r0 = "topic_id"
            r7.putExtra(r0, r6)
            java.lang.String r0 = "topic_name"
            r7.putExtra(r0, r8)
            java.lang.String r0 = "topic_desc"
            r7.putExtra(r0, r11)
            java.lang.String r0 = "topic_icon_url"
            r7.putExtra(r0, r12)
            java.lang.String r0 = "topic_ad_url"
            r7.putExtra(r0, r13)
            java.lang.String r0 = "extra_scence"
            r7.putExtra(r0, r3)
            androidx.appcompat.app.AppCompatActivity r0 = r28.getActivity()
            java.lang.String r2 = ".ui.EmojiStoreTopicUI"
            r3 = 0
            ke3.C88144b.m109791i(r0, r5, r2, r7, r3)
            goto L_0x02bd
        L_0x0186:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            goto L_0x02bd
        L_0x018b:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionChannels
            androidx.appcompat.app.AppCompatActivity r2 = r28.getActivity()
            boolean r0 = r0.checkAvailable(r2)
            if (r0 != 0) goto L_0x0198
            return
        L_0x0198:
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            eb0.c r2 = eb0.C97625j3.m125812b()
            g62.l r2 = r2.mo105911z()
            long r5 = r6.f176459d
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r2 = r2.b00(r5)
            java.lang.String r3 = r2.getContent()
            r5 = 0
            com.tencent.mm.message.l$b r3 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r3, r5)
            java.lang.Class<ht1.f> r5 = ht1.C60166f.class
            com.tencent.mm.message.g r3 = r3.mo93555w(r5)
            ht1.f r3 = (ht1.C60166f) r3
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r6 = r2.mo108768t()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r6)
            java.lang.String r7 = "report_scene"
            if (r6 == 0) goto L_0x01d0
            r5.putExtra(r7, r10)
            goto L_0x01d3
        L_0x01d0:
            r5.putExtra(r7, r4)
        L_0x01d3:
            java.lang.String r2 = r2.mo108768t()
            java.lang.String r6 = "from_user"
            r5.putExtra(r6, r2)
            te3.rk1 r2 = r3.f171710b
            java.lang.String r2 = r2.f185183d
            if (r2 == 0) goto L_0x01f7
            int r6 = r2.length()
            if (r6 != 0) goto L_0x01e9
            goto L_0x01ea
        L_0x01e9:
            r4 = 0
        L_0x01ea:
            if (r4 == 0) goto L_0x01ed
            goto L_0x01f7
        L_0x01ed:
            java.math.BigInteger r4 = new java.math.BigInteger
            r4.<init>(r2)
            long r6 = r4.longValue()
            goto L_0x01f9
        L_0x01f7:
            r6 = 0
        L_0x01f9:
            java.lang.String r2 = "feed_object_id"
            r5.putExtra(r2, r6)
            te3.rk1 r2 = r3.f171710b
            java.lang.String r2 = r2.f185191o
            java.lang.String r4 = "feed_object_nonceId"
            r5.putExtra(r4, r2)
            java.lang.String r2 = "business_type"
            r5.putExtra(r2, r8)
            te3.rk1 r2 = r3.f171710b
            java.lang.String r2 = r2.f185184e
            java.lang.String r3 = "finder_user_name"
            r5.putExtra(r3, r2)
            di3.d r2 = di3.C86312j.m106911c(r0)
            ht1.t1 r2 = (ht1.C60200t1) r2
            r3 = 25
            r11 = 6
            r2.mo76842e7(r11, r10, r3, r5)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            androidx.appcompat.app.AppCompatActivity r2 = r28.getActivity()
            r0.mo76864nr(r2, r5)
            goto L_0x02bd
        L_0x0230:
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            long r10 = r6.f176459d
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r0 = r0.b00(r10)
            java.lang.String r0 = r0.getContent()
            r2 = 0
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r2)
            java.lang.String r2 = r0.f195583i0
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0265
            java.lang.Class<z51.g> r2 = z51.C39315g.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            z51.g r2 = (z51.C39315g) r2
            zc3.a r2 = r2.mo58035cm()
            java.lang.String r6 = r0.f195586j
            i61.h r2 = (i61.C98602h) r2
            java.lang.String r2 = r2.mo138003J(r6)
        L_0x0265:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0285
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = eb0.C75592q0.m90789s()
            r2.putExtra(r15, r3)
            java.lang.String r0 = r0.f195586j
            r2.putExtra(r9, r0)
            androidx.appcompat.app.AppCompatActivity r0 = r28.getActivity()
            r3 = 0
            ke3.C88144b.m109791i(r0, r13, r12, r2, r3)
            goto L_0x02bd
        L_0x0285:
            java.lang.String r0 = "start emoji detail from brandcontact"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r6 = "extra_id"
            r0.putExtra(r6, r2)
            r6 = 123(0x7b, float:1.72E-43)
            java.lang.String r7 = "preceding_scence"
            r0.putExtra(r7, r6)
            java.lang.String r6 = "download_entrance_scene"
            r0.putExtra(r6, r3)
            androidx.appcompat.app.AppCompatActivity r3 = r28.getActivity()
            java.lang.String r6 = ".ui.EmojiStoreDetailUI"
            r7 = 0
            ke3.C88144b.m109791i(r3, r5, r6, r0, r7)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 10993(0x2af1, float:1.5404E-41)
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6[r8] = r5
            r6[r4] = r2
            r0.mo160131h(r3, r6)
        L_0x02bd:
            r6 = r1
            goto L_0x08f7
        L_0x02c0:
            r17 = r14
            r11 = 6
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            long r5 = r6.f176459d
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r5 = r0.b00(r5)
            java.lang.String r0 = r5.getContent()
            r6 = 0
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r6)
            di3.d r6 = di3.C86312j.m106911c(r2)
            ym.l r6 = (p763ym.C79138l) r6
            java.lang.String r10 = r0.f195562d
            com.tencent.mm.pluginsdk.model.app.j r6 = r6.mo73990GW(r10, r8)
            if (r6 == 0) goto L_0x06d2
            java.lang.String r10 = r1.f181423o
            boolean r14 = com.tencent.p014mm.storage.C72996z1.m85820U5(r10)
            if (r14 == 0) goto L_0x02ff
            java.lang.String r10 = r5.getContent()
            java.lang.String r10 = eb0.C75604z3.m90847s(r10)
            java.lang.String r14 = "getGroupChatMsgTalker(msg.content)"
            gy3.C87412m.m108593f(r10, r14)
        L_0x02ff:
            long r14 = r5.mo108774y2()
            androidx.appcompat.app.AppCompatActivity r11 = r28.getActivity()
            java.lang.String r8 = r6.field_packageName
            boolean r8 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85020f(r11, r8)
            if (r8 == 0) goto L_0x0312
            r18 = 3
            goto L_0x0314
        L_0x0312:
            r18 = 6
        L_0x0314:
            int r8 = r0.f195582i
            r11 = 2
            if (r8 != r11) goto L_0x031d
            r18 = 4
            r8 = 4
            goto L_0x0324
        L_0x031d:
            r11 = 5
            if (r8 != r11) goto L_0x0322
            r8 = 1
            goto L_0x0324
        L_0x0322:
            r8 = r18
        L_0x0324:
            com.tencent.mm.autogen.events.ReportMsgClickEvent r11 = new com.tencent.mm.autogen.events.ReportMsgClickEvent
            r11.<init>()
            com.tencent.mm.autogen.events.ReportMsgClickEvent$a r4 = r11.f193900d
            r31 = r12
            androidx.appcompat.app.AppCompatActivity r12 = r28.getActivity()
            r4.f193901a = r12
            com.tencent.mm.autogen.events.ReportMsgClickEvent$a r4 = r11.f193900d
            r12 = 1
            r4.f193907g = r12
            java.lang.String r12 = r0.f195562d
            r4.f193902b = r12
            java.lang.String r12 = r6.field_packageName
            r4.f193903c = r12
            int r12 = r0.f195582i
            r4.f193905e = r12
            r4.f193904d = r10
            r4.f193908h = r8
            java.lang.String r8 = r0.f195536V
            r4.f193906f = r8
            r4.f193909i = r14
            r8 = r17
            r4.f193910j = r8
            java.lang.String r10 = r1.f181423o
            r4.f193911k = r10
            r11.publish()
            sw1.m r21 = sw1.C48477m.C13789a.m13091a()
            di3.d r4 = di3.C86312j.m106911c(r2)
            ym.l r4 = (p763ym.C79138l) r4
            androidx.appcompat.app.AppCompatActivity r10 = r28.getActivity()
            boolean r4 = r4.mo74016tz(r10, r6)
            if (r4 != 0) goto L_0x03cd
            if (r21 == 0) goto L_0x03cd
            java.lang.String r4 = r6.f149247P
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x03a0
            java.lang.Class<gw.f> r4 = p159gw.C45962f.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            gw.f r4 = (p159gw.C45962f) r4
            androidx.appcompat.app.AppCompatActivity r10 = r28.getActivity()
            java.lang.String r11 = r6.f149247P
            boolean r4 = r4.Qt0(r10, r11)
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r10 = r6.f149247P
            r12 = 0
            r11[r12] = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)
            r12 = 1
            r11[r12] = r10
            java.lang.String r10 = "oversea game info and gpdownload url is not empty, jump to google play directy:[%s], jump result: [%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r11)
            if (r4 == 0) goto L_0x03a1
            goto L_0x03cb
        L_0x03a0:
            r12 = 1
        L_0x03a1:
            com.tencent.mm.autogen.events.GameCenterOperationEvent r4 = new com.tencent.mm.autogen.events.GameCenterOperationEvent
            r4.<init>()
            com.tencent.mm.autogen.events.GameCenterOperationEvent$a r10 = r4.f107543d
            r11 = 2
            r10.f107544a = r11
            r10.f107549f = r12
            java.lang.String r11 = r6.field_appId
            r10.f107546c = r11
            androidx.appcompat.app.AppCompatActivity r11 = r28.getActivity()
            r10.f107545b = r11
            r4.publish()
            androidx.appcompat.app.AppCompatActivity r22 = r28.getActivity()
            java.lang.String r4 = r6.field_appId
            r24 = 1
            r26 = 1
            r23 = r4
            r25 = r26
            r21.dn0(r22, r23, r24, r25, r26)
        L_0x03cb:
            r4 = 1
            goto L_0x03ce
        L_0x03cd:
            r4 = 0
        L_0x03ce:
            if (r4 == 0) goto L_0x03d2
            goto L_0x06d2
        L_0x03d2:
            java.lang.String r0 = r0.f195606o
            if (r0 == 0) goto L_0x0446
            int r0 = r0.length()
            if (r0 != 0) goto L_0x03de
            r0 = 1
            goto L_0x03df
        L_0x03de:
            r0 = 0
        L_0x03df:
            if (r0 == 0) goto L_0x03e2
            goto L_0x0446
        L_0x03e2:
            boolean r0 = r28.mo88757e3()
            if (r0 != 0) goto L_0x03f2
            androidx.appcompat.app.AppCompatActivity r0 = r28.getActivity()
            r2 = 0
            nj3.C76912y0.m92771j(r0, r2)
            goto L_0x06d2
        L_0x03f2:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            androidx.appcompat.app.AppCompatActivity r2 = r28.getActivity()
            java.lang.String r3 = "com.tencent.mm.ui.chatting.AppAttachDownloadUI"
            r0.setClassName(r2, r3)
            long r2 = r5.getMsgId()
            java.lang.String r4 = "app_msg_id"
            r0.putExtra(r4, r2)
            androidx.appcompat.app.AppCompatActivity r2 = r28.getActivity()
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r0)
            java.lang.Object[] r6 = r3.mo10232b()
            java.lang.String r7 = "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiItemUrlUIC"
            java.lang.String r8 = "enterAppDataProfile"
            java.lang.String r9 = "(Lcom/tencent/mm/ui/chatting/search/multi/bean/FTSMultiUrlResultItem;)V"
            java.lang.String r10 = "Undefined"
            java.lang.String r11 = "startActivity"
            java.lang.String r12 = "(Landroid/content/Intent;)V"
            r5 = r2
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            r4 = 0
            java.lang.Object r0 = r3.mo10231a(r4)
            android.content.Intent r0 = (android.content.Intent) r0
            r2.startActivity(r0)
            java.lang.String r6 = "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiItemUrlUIC"
            java.lang.String r7 = "enterAppDataProfile"
            java.lang.String r8 = "(Lcom/tencent/mm/ui/chatting/search/multi/bean/FTSMultiUrlResultItem;)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x06d2
        L_0x0446:
            java.lang.String r0 = r5.getContent()
            int r4 = r5.mo108769t2()
            if (r4 != 0) goto L_0x0464
            int r4 = r5.mo108769t2()
            java.lang.String r6 = r1.f181423o
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r6)
            if (r6 == 0) goto L_0x0464
            if (r0 == 0) goto L_0x0464
            if (r4 != 0) goto L_0x0464
            java.lang.String r0 = eb0.C75604z3.m90849u(r0)
        L_0x0464:
            r4 = 0
            com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r4)
            di3.d r0 = di3.C86312j.m106911c(r2)
            ym.l r0 = (p763ym.C79138l) r0
            java.lang.String r4 = r6.f195562d
            com.tencent.mm.pluginsdk.model.app.j r4 = r0.getAppInfo(r4)
            if (r4 == 0) goto L_0x06ae
            androidx.appcompat.app.AppCompatActivity r0 = r28.getActivity()
            java.lang.String r10 = r4.field_packageName
            boolean r0 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85020f(r0, r10)
            if (r0 == 0) goto L_0x06ae
            int r0 = r4.field_status
            r9 = 3
            if (r0 != r9) goto L_0x04a0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "requestAppShow fail, app is in blacklist, packageName = "
            r0.append(r2)
            java.lang.String r2 = r4.field_packageName
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            goto L_0x06d2
        L_0x04a0:
            di3.d r0 = di3.C86312j.m106911c(r3)
            ym.p r0 = (p763ym.C79139p) r0
            androidx.appcompat.app.AppCompatActivity r3 = r28.getActivity()
            boolean r0 = r0.mo108864OB(r3, r4)
            if (r0 != 0) goto L_0x04e7
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r5 = r4.field_appName
            r6 = 0
            r0[r6] = r5
            java.lang.String r5 = "The app %s signature is incorrect."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r5, r0)
            androidx.appcompat.app.AppCompatActivity r0 = r28.getActivity()
            androidx.appcompat.app.AppCompatActivity r5 = r28.getActivity()
            r7 = 2131830801(0x7f112811, float:1.929461E38)
            java.lang.Object[] r8 = new java.lang.Object[r3]
            di3.d r2 = di3.C86312j.m106911c(r2)
            ym.l r2 = (p763ym.C79138l) r2
            androidx.appcompat.app.AppCompatActivity r9 = r28.getActivity()
            java.lang.String r2 = r2.mo74011hv(r9, r4)
            r8[r6] = r2
            java.lang.String r2 = r5.getString(r7, r8)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r3)
            r0.show()
            goto L_0x06d2
        L_0x04e7:
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            java.lang.String r3 = "forName(charsetName)"
            java.lang.String r9 = "utf-8"
            java.lang.String r0 = r5.mo108768t()
            java.lang.String r10 = "msg.talker"
            gy3.C87412m.m108593f(r0, r10)
            java.lang.String r10 = "@qqim"
            r11 = 2
            r12 = 0
            r13 = 0
            boolean r0 = z04.C112551y.m153808h(r0, r10, r13, r11, r12)
            if (r0 == 0) goto L_0x062c
            java.lang.String r0 = r4.field_packageName
            java.lang.String r10 = "com.tencent.mobileqq"
            boolean r0 = gy3.C87412m.m108589b(r0, r10)
            if (r0 != 0) goto L_0x050f
            goto L_0x062c
        L_0x050f:
            java.lang.String r0 = "jacks open QQ"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r0)
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.MAIN"
            r11.<init>(r0, r12)
            java.lang.String r12 = "android.intent.category.LAUNCHER"
            r11.addCategory(r12)
            r13 = 268435456(0x10000000, float:2.5243549E-29)
            r11.addFlags(r13)
            androidx.appcompat.app.AppCompatActivity r13 = r28.getActivity()
            android.content.pm.PackageManager r13 = r13.getPackageManager()
            r14 = 0
            android.content.pm.PackageInfo r15 = r13.getPackageInfo(r10, r14)     // Catch:{ Exception -> 0x0560 }
            java.lang.String r14 = "pm.getPackageInfo(packageName, 0)"
            gy3.C87412m.m108593f(r15, r14)     // Catch:{ Exception -> 0x0560 }
            android.content.Intent r14 = new android.content.Intent     // Catch:{ Exception -> 0x0560 }
            r1 = 0
            r14.<init>(r0, r1)     // Catch:{ Exception -> 0x0560 }
            r14.addCategory(r12)     // Catch:{ Exception -> 0x0560 }
            java.lang.String r0 = r15.packageName     // Catch:{ Exception -> 0x0560 }
            r14.setPackage(r0)     // Catch:{ Exception -> 0x0560 }
            r1 = 0
            java.util.List r0 = r13.queryIntentActivities(r14, r1)     // Catch:{ Exception -> 0x0560 }
            java.lang.String r1 = "pm.queryIntentActivities(resolveIntent, 0)"
            gy3.C87412m.m108593f(r0, r1)     // Catch:{ Exception -> 0x0560 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0560 }
            java.lang.Object r0 = r0.next()     // Catch:{ Exception -> 0x0560 }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ Exception -> 0x0560 }
            if (r0 == 0) goto L_0x0567
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ Exception -> 0x0560 }
            java.lang.String r0 = r0.name     // Catch:{ Exception -> 0x0560 }
            goto L_0x0568
        L_0x0560:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r12 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r8, r12)
        L_0x0567:
            r0 = 0
        L_0x0568:
            if (r0 != 0) goto L_0x056c
            goto L_0x062a
        L_0x056c:
            r11.setClassName(r10, r0)
            java.lang.String r0 = "platformId"
            java.lang.String r1 = "wechat"
            r11.putExtra(r0, r1)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 9
            r10 = 0
            java.lang.Object r0 = r0.mo119684e(r1, r10)
            if (r0 == 0) goto L_0x0593
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0593
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x0594
        L_0x0593:
            r0 = 0
        L_0x0594:
            if (r0 == 0) goto L_0x05ea
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            r1.<init>()     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            r1.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r9)     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            gy3.C87412m.m108593f(r1, r3)     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            byte[] r0 = r0.getBytes(r1)     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            java.lang.String r1 = "asdfghjkl;'"
            java.nio.charset.Charset r9 = java.nio.charset.Charset.forName(r9)     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            gy3.C87412m.m108593f(r9, r3)     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            byte[] r1 = r1.getBytes(r9)     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            gy3.C87412m.m108593f(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            int r2 = r1.length     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            r3 = 0
            r9 = 0
        L_0x05c6:
            if (r3 >= r2) goto L_0x05dc
            byte r10 = r1[r3]     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            int r12 = r0.length     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            if (r9 < r12) goto L_0x05ce
            goto L_0x05dc
        L_0x05ce:
            int r12 = r9 + 1
            int r13 = r12 + 1
            byte r12 = r0[r12]     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            r10 = r10 ^ r12
            byte r10 = (byte) r10     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            r0[r9] = r10     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            int r3 = r3 + 1
            r9 = r13
            goto L_0x05c6
        L_0x05dc:
            java.lang.String r1 = "tencent_gif"
            r11.putExtra(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x05e3 }
            goto L_0x05ea
        L_0x05e3:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r8, r2)
        L_0x05ea:
            androidx.appcompat.app.AppCompatActivity r0 = r28.getActivity()     // Catch:{ Exception -> 0x0629 }
            k20.a r1 = new k20.a     // Catch:{ Exception -> 0x0629 }
            r1.<init>()     // Catch:{ Exception -> 0x0629 }
            r1.mo10233c(r11)     // Catch:{ Exception -> 0x0629 }
            java.lang.Object[] r21 = r1.mo10232b()     // Catch:{ Exception -> 0x0629 }
            java.lang.String r22 = "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiItemUrlUIC"
            java.lang.String r23 = "dealOpenQQ"
            java.lang.String r24 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/pluginsdk/model/app/AppInfo;)Z"
            java.lang.String r25 = "Undefined"
            java.lang.String r26 = "startActivity"
            java.lang.String r27 = "(Landroid/content/Intent;)V"
            r20 = r0
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x0629 }
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)     // Catch:{ Exception -> 0x0629 }
            android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ Exception -> 0x0629 }
            r0.startActivity(r1)     // Catch:{ Exception -> 0x0629 }
            java.lang.String r21 = "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiItemUrlUIC"
            java.lang.String r22 = "dealOpenQQ"
            java.lang.String r23 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/pluginsdk/model/app/AppInfo;)Z"
            java.lang.String r24 = "Undefined"
            java.lang.String r25 = "startActivity"
            java.lang.String r26 = "(Landroid/content/Intent;)V"
            r20 = r0
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0629 }
            goto L_0x062a
        L_0x0629:
        L_0x062a:
            r0 = 1
            goto L_0x062d
        L_0x062c:
            r0 = 0
        L_0x062d:
            if (r0 == 0) goto L_0x0631
            goto L_0x06d2
        L_0x0631:
            com.tencent.mm.opensdk.modelmsg.WXAppExtendObject r0 = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject
            r0.<init>()
            java.lang.String r1 = r6.f195614q
            r0.extInfo = r1
            java.lang.String r1 = r6.f195606o
            if (r1 == 0) goto L_0x065d
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0647
            r18 = 1
            goto L_0x0649
        L_0x0647:
            r18 = 0
        L_0x0649:
            if (r18 == 0) goto L_0x065d
            com.tencent.mm.pluginsdk.model.app.e r1 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            java.lang.String r2 = r6.f195606o
            com.tencent.mm.pluginsdk.model.app.d r1 = r1.mo100154qq(r2)
            if (r1 == 0) goto L_0x065a
            java.lang.String r11 = r1.field_fileFullPath
            goto L_0x065b
        L_0x065a:
            r11 = 0
        L_0x065b:
            r0.filePath = r11
        L_0x065d:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r14 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r14.<init>()
            r1 = 638064131(0x26081603, float:4.721431E-16)
            r14.sdkVer = r1
            r14.mediaObject = r0
            java.lang.String r0 = r6.f195570f
            r14.title = r0
            java.lang.String r0 = r6.f195574g
            r14.description = r0
            java.lang.String r0 = r6.f195539W
            r14.messageAction = r0
            java.lang.String r0 = r6.f195542X
            r14.messageExt = r0
            java.lang.Class<gt.k> r0 = p158gt.C98201k.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            java.lang.String r1 = r5.mo108765s2()
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r0 = r0.mo127161CZ(r1)
            r1 = -1
            r2 = 0
            byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r0, r2, r1)
            r14.thumbData = r0
            com.tencent.mm.ui.chatting.d5 r12 = new com.tencent.mm.ui.chatting.d5
            androidx.appcompat.app.AppCompatActivity r0 = r28.getActivity()
            r12.<init>(r0)
            java.lang.String r13 = r4.field_packageName
            java.lang.String r15 = r4.field_appId
            java.lang.String r0 = r4.field_openId
            r17 = 0
            r16 = r0
            r12.mo102719b(r13, r14, r15, r16, r17)
            goto L_0x06d2
        L_0x06ae:
            di3.d r0 = di3.C86312j.m106911c(r3)
            ym.p r0 = (p763ym.C79139p) r0
            androidx.appcompat.app.AppCompatActivity r1 = r28.getActivity()
            java.lang.String r2 = r6.f195562d
            java.lang.String r3 = "message"
            java.lang.String r0 = r0.I90(r1, r2, r3)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.putExtra(r9, r0)
            androidx.appcompat.app.AppCompatActivity r0 = r28.getActivity()
            r10 = r31
            r4 = 0
            ke3.C88144b.m109791i(r0, r13, r10, r1, r4)
        L_0x06d2:
            r6 = r28
            goto L_0x08f7
        L_0x06d6:
            r4 = r11
            r10 = r12
            r8 = r14
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            long r11 = r6.f176459d
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r1 = r0.b00(r11)
            java.lang.String r0 = r1.getContent()
            com.tencent.mm.message.l$b r11 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r4)
            boolean r0 = r6.f176483m
            if (r0 == 0) goto L_0x0730
            r0 = 10000(0x2710, float:1.4013E-41)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "biz_video_scene"
            r12 = 1
            r4.putInt(r6, r12)
            java.lang.String r6 = com.tencent.p014mm.p136ui.C74928u.C74929b.f220309a
            r4.putInt(r6, r0)
            java.lang.String r0 = "geta8key_scene"
            r4.putInt(r0, r12)
            r6 = r28
            java.lang.String r0 = r6.f181423o
            r4.putString(r15, r0)
            android.content.Context r0 = r29.getContext()
            java.lang.String r5 = "v.context"
            gy3.C87412m.m108593f(r0, r5)
            long r21 = r1.getMsgId()
            long r23 = r1.mo108774y2()
            r25 = 0
            r20 = r0
            r26 = r4
            cy0.C75308c.m90328a(r20, r21, r23, r25, r26)
            r0 = 1
            goto L_0x0733
        L_0x0730:
            r6 = r28
            r0 = 0
        L_0x0733:
            if (r0 == 0) goto L_0x0737
            goto L_0x08f7
        L_0x0737:
            java.lang.String r0 = r11.f195586j
            if (r0 == 0) goto L_0x08f7
            boolean r0 = gy3.C87412m.m108589b(r0, r8)
            if (r0 != 0) goto L_0x08f7
            di3.d r0 = di3.C86312j.m106911c(r3)
            ym.p r0 = (p763ym.C79139p) r0
            java.lang.String r3 = r11.f195586j
            java.lang.String r4 = r6.f181423o
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85820U5(r4)
            if (r4 == 0) goto L_0x0754
            java.lang.String r4 = "groupmessage"
            goto L_0x0756
        L_0x0754:
            java.lang.String r4 = "singlemessage"
        L_0x0756:
            java.lang.String r3 = r0.mo108862K3(r3, r4)
            java.lang.String r4 = r11.f195586j
            androidx.appcompat.app.AppCompatActivity r0 = r28.getActivity()
            java.lang.String r5 = r11.f195562d
            if (r5 == 0) goto L_0x076d
            int r12 = r5.length()
            if (r12 != 0) goto L_0x076b
            goto L_0x076d
        L_0x076b:
            r12 = 0
            goto L_0x076e
        L_0x076d:
            r12 = 1
        L_0x076e:
            if (r12 == 0) goto L_0x0771
            goto L_0x0780
        L_0x0771:
            di3.d r2 = di3.C86312j.m106911c(r2)
            ym.l r2 = (p763ym.C79138l) r2
            com.tencent.mm.pluginsdk.model.app.j r2 = r2.getAppInfo(r5)
            if (r2 == 0) goto L_0x0780
            java.lang.String r2 = r2.field_packageName
            goto L_0x0781
        L_0x0780:
            r2 = 0
        L_0x0781:
            if (r2 != 0) goto L_0x0784
            goto L_0x0797
        L_0x0784:
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0790 }
            r5 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r5)     // Catch:{ NameNotFoundException -> 0x078e }
            goto L_0x0798
        L_0x078e:
            r0 = move-exception
            goto L_0x0792
        L_0x0790:
            r0 = move-exception
            r5 = 0
        L_0x0792:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r8, r2)
        L_0x0797:
            r0 = 0
        L_0x0798:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r2.putExtra(r9, r3)
            java.lang.String r3 = r11.f195570f
            java.lang.String r5 = "webpageTitle"
            r2.putExtra(r5, r3)
            java.lang.String r3 = r11.f195562d
            if (r3 == 0) goto L_0x07dc
            java.lang.String r7 = "wx751a1acca5688ba3"
            boolean r3 = gy3.C87412m.m108589b(r7, r3)
            if (r3 != 0) goto L_0x07cb
            java.lang.String r3 = r11.f195562d
            java.lang.String r7 = "wxfbc915ff7c30e335"
            boolean r3 = gy3.C87412m.m108589b(r7, r3)
            if (r3 != 0) goto L_0x07cb
            java.lang.String r3 = r11.f195562d
            java.lang.String r7 = "wx482a4001c37e2b74"
            boolean r3 = gy3.C87412m.m108589b(r7, r3)
            if (r3 == 0) goto L_0x07dc
        L_0x07cb:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r7 = r11.f195562d
            java.lang.String r9 = "jsapi_args_appid"
            r3.putString(r9, r7)
            java.lang.String r7 = "jsapiargs"
            r2.putExtra(r7, r3)
        L_0x07dc:
            java.util.Map<java.lang.String, java.lang.String> r3 = r11.f195558c
            if (r3 == 0) goto L_0x0805
            java.lang.String r7 = ".msg.appmsg.mmreadershare.itemshowtype"
            java.lang.Object r3 = r3.get(r7)
            java.lang.String r3 = (java.lang.String) r3
            r7 = -1
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r7)
            r7 = 16
            if (r3 != r7) goto L_0x0805
            java.lang.String r3 = "immersiveVideoStyle"
            r7 = 1
            r2.putExtra(r3, r7)
            java.lang.String r3 = "immersivePageBgIsDark"
            r2.putExtra(r3, r7)
            r3 = 17170444(0x106000c, float:2.4611947E-38)
            java.lang.String r7 = "webview_bg_color_rsID"
            r2.putExtra(r7, r3)
        L_0x0805:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            java.lang.String r7 = "shortUrl"
            if (r3 != 0) goto L_0x0811
            r2.putExtra(r7, r4)
            goto L_0x0816
        L_0x0811:
            java.lang.String r3 = r11.f195586j
            r2.putExtra(r7, r3)
        L_0x0816:
            if (r0 == 0) goto L_0x081b
            java.lang.String r3 = r0.versionName
            goto L_0x081c
        L_0x081b:
            r3 = 0
        L_0x081c:
            java.lang.String r4 = "version_name"
            r2.putExtra(r4, r3)
            if (r0 == 0) goto L_0x0827
            int r12 = r0.versionCode
            goto L_0x0828
        L_0x0827:
            r12 = 0
        L_0x0828:
            java.lang.String r0 = "version_code"
            r2.putExtra(r0, r12)
            java.lang.String r0 = r11.f195634v
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0846
            java.lang.String r0 = r11.f195634v
            java.lang.String r3 = "srcUsername"
            r2.putExtra(r3, r0)
            java.lang.String r0 = r11.f195638w
            java.lang.String r3 = "srcDisplayname"
            r2.putExtra(r3, r0)
        L_0x0846:
            long r3 = r1.getMsgId()
            java.lang.String r0 = "msg_id"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "key_enable_teen_mode_check"
            r3 = 1
            r2.putExtra(r0, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "msg_"
            r0.append(r3)
            r17 = r8
            long r7 = r1.mo108774y2()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "KPublisherId"
            r2.putExtra(r4, r0)
            java.lang.String r0 = r11.f195562d
            java.lang.String r4 = "KAppId"
            r2.putExtra(r4, r0)
            java.lang.String r0 = r11.f195570f
            r2.putExtra(r5, r0)
            java.lang.String r0 = r11.f195646y
            java.lang.String r4 = "thumbUrl"
            r2.putExtra(r4, r0)
            java.lang.String r0 = r6.f181423o
            r2.putExtra(r15, r0)
            java.lang.String r0 = r6.f181423o
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            int r4 = r1.mo108769t2()
            r5 = 1
            if (r4 != r5) goto L_0x089c
            java.lang.String r0 = eb0.C75592q0.m90789s()
            goto L_0x08b5
        L_0x089c:
            if (r0 == 0) goto L_0x08a7
            java.lang.String r0 = r1.getContent()
            java.lang.String r14 = eb0.C75604z3.m90847s(r0)
            goto L_0x08a9
        L_0x08a7:
            r14 = r17
        L_0x08a9:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r0 == 0) goto L_0x08b4
            java.lang.String r0 = r1.mo108768t()
            goto L_0x08b5
        L_0x08b4:
            r0 = r14
        L_0x08b5:
            java.lang.String r4 = "pre_username"
            r2.putExtra(r4, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            long r7 = r1.mo108774y2()
            r4.append(r7)
            java.lang.String r1 = r4.toString()
            java.lang.String r3 = "prePublishId"
            r2.putExtra(r3, r1)
            java.lang.String r1 = "preUsername"
            r2.putExtra(r1, r0)
            java.lang.String r1 = r6.f181423o
            java.lang.String r3 = "preChatName"
            r2.putExtra(r3, r1)
            java.lang.String r1 = r6.f181423o
            int r0 = eb0.C45629t0.m50815b(r0, r1)
            java.lang.String r1 = "preChatTYPE"
            r2.putExtra(r1, r0)
            java.lang.String r0 = "preMsgIndex"
            r1 = 0
            r2.putExtra(r0, r1)
            androidx.appcompat.app.AppCompatActivity r0 = r28.getActivity()
            r1 = 0
            ke3.C88144b.m109791i(r0, r13, r10, r2, r1)
        L_0x08f7:
            rk3.a r14 = rk3.C63462a.f180011a
            r15 = 3
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            rk3.C63462a.m74799d(r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sk3.C77723g0.mo86728M0(android.view.View, int, ok3.e):void");
    }

    /* renamed from: R1 */
    public void mo86729R1(View view, int i, C62070e eVar) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(eVar, "item");
        Log.m105925i("MicroMsg. FTSMultiItemUrlUIC", "[onItemLongClick] position:%s", Integer.valueOf(i));
        C45082x0 x0Var = new C45082x0(view.getContext());
        C63462a.f180011a.mo88328b(14);
        x0Var.mo70436b(view, new C63980a(this, view), new C63981b(eVar, this), (C77407n.C47880p) null);
    }

    /* renamed from: V0 */
    public void mo86730V0(C61801g gVar, int i, int i2) {
        C87412m.m108594g(gVar, "holder");
        C62073h hVar = (C62073h) getItem(i);
        int i3 = 0;
        if (Util.isNullOrNil(hVar.f176481k) || !Util.isNullOrNil(hVar.f176480j)) {
            ((C64027v0) gVar).f181538G.setVisibility(8);
        } else {
            C64027v0 v0Var = (C64027v0) gVar;
            v0Var.f181538G.setVisibility(0);
            v0Var.f181538G.setText(Util.nullAs(hVar.f176481k, ""));
        }
        C64027v0 v0Var2 = (C64027v0) gVar;
        v0Var2.f181539H.setText(Util.nullAs(hVar.f176480j, ""));
        TextView textView = v0Var2.f181539H;
        C61802h hVar2 = this.f226531r;
        gVar.mo86724y(textView, hVar2 != null ? hVar2.f175729g : null);
        Bitmap jo = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127188jo(hVar.f176482l, C76577a.m92156g(getActivity()), false);
        if (jo == null || jo.isRecycled()) {
            Bitmap ub = ((C79138l) C86312j.m106911c(C79138l.class)).mo74018ub(hVar.f176479i, 1, C76577a.m92156g(getActivity()));
            boolean z = hVar.f176483m;
            String a = C102027b.m134386a(hVar.f176482l, 4, z);
            Log.m105927v("MicroMsg. FTSMultiItemUrlUIC", "fillDetail coverUrl: %s, isBizNativeVideo: %b", a, Boolean.valueOf(z));
            if (ub == null || ub.isRecycled()) {
                if (z) {
                    i3 = 4;
                }
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59359o = C0966R.color.f3237k_;
                bVar.f59347c = true;
                bVar.f59350f = C14050a.m13405b(a);
                int b = C76577a.m92151b(MMApplicationContext.getContext(), 50);
                int b2 = C76577a.m92151b(MMApplicationContext.getContext(), 50);
                bVar.f59354j = b;
                bVar.f59355k = b2;
                bVar.f59369y = new C22908r(i3);
                bVar.f59370z = new C22898h(i3);
                bVar.f59345a = true;
                C20828a.m22825b().mo32519h(a, v0Var2.f181537F, bVar.mo32666a());
                return;
            }
            v0Var2.f181537F.setImageBitmap(ub);
            return;
        }
        v0Var2.f181537F.setImageBitmap(jo);
    }

    /* renamed from: c3 */
    public SpannableString mo88749c3() {
        String str = ((C64004q0) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C64004q0.class)).f181449f;
        Log.m105924i("MicroMsg. FTSMultiItemUrlUIC", "getEmptyResultString >> " + str);
        return C99254i.m129316m(getString(C0966R.string.mhl), getString(C0966R.string.mhm), str);
    }

    /* renamed from: d3 */
    public C61802h mo88750d3() {
        if (this.f226531r == null) {
            this.f226531r = new C61802h(getActivity(), this, this);
        }
        C61802h hVar = this.f226531r;
        C87412m.m108591d(hVar);
        return hVar;
    }

    public int getCount() {
        return this.f181421j.size();
    }

    public C62070e getItem(int i) {
        C62070e eVar = this.f181421j.get(i);
        C87412m.m108593f(eVar, "normalDataList[position]");
        return eVar;
    }

    /* renamed from: j3 */
    public boolean mo107868j3(int i) {
        return i == 5 || i == 7 || i == 27 || i == 26 || i == 97 || i == 15 || i == 4 || i == 68;
    }

    /* renamed from: o */
    public RecyclerView.C16631z mo86733o(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cvv, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context).inf…list_item, parent, false)");
        return new C64027v0(inflate);
    }
}
