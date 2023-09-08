package com.tencent.p014mm.plugin.finder.feed.p052ui;

import a14.C53973z1;
import ak1.C54116w;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C112919c0;
import bl3.C0324s;
import bl3.C39818r;
import cj1.C54738b1;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.fragment.FinderLiveVisitorFragment;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d50.C58115i;
import di3.C86312j;
import dk1.C58312g;
import dp1.C58358d0;
import dp1.C58418z1;
import fj1.C45795b;
import gy3.C24560g0;
import gy3.C8479f0;
import gy3.C87412m;
import h81.C59774i;
import hl1.C59988k;
import ht1.C60172g4;
import ht1.C8813w4;
import ht1.C8815x4;
import j50.C60735a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C88989a;
import nj3.C88995f1;
import o31.C11345b;
import o31.C76986a;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONException;
import org.json.JSONObject;
import p172io.flutter.embedding.android.PatchedFlutterActivity;
import p185kq.C61130g;
import p225rc.C89916g;
import p225rc.g$$h;
import p50.C62197e;
import ph1.C11940k;
import ph1.C62293i;
import q31.C118148a;
import qj1.C12738xf;
import qj1.C62983sh;
import qt1.C12932c;
import r50.C63372j;
import rs1.C63563l6;
import rs1.C63654v2;
import rx3.C13604l;
import sx3.C110826x0;
import sx3.C36903g0;
import sx3.C90363p0;
import t91.C64208c;
import te3.C64347eq2;
import u24.C90599h;
import vo3.C90852c;
import wc1.C15085j;
import wc1.C15096l;
import zk1.C66879r0;
import zk1.C66880s0;

@C88995f1
@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorWithoutAffinityUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lrc/g$$h;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI */
public class FinderLiveVisitorWithoutAffinityUI extends MMFinderUI implements g$$h {

    /* renamed from: o */
    public final String f159019o = ("FinderLiveVisitorWithoutAffinityUI@" + hashCode());

    /* renamed from: p */
    public FinderLiveVisitorFragment f159020p;

    /* renamed from: q */
    public int f159021q = -1;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI$a */
    public static final class C55832a implements C118148a {

        /* renamed from: a */
        public static final C55832a f159022a = new C55832a();

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            C12738xf xfVar;
            FinderLiveService.f159376d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            boolean z = false;
            if (!(bVar == null || (xfVar = (C12738xf) bVar.getPlugin(C12738xf.class)) == null || xfVar.mo14483f0() != 0)) {
                z = true;
            }
            return z ? C90363p0.m113143b(new C13604l(PatchedFlutterActivity.EXTRA_PAGE_TYPE, 1)) : C36903g0.f97931d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI$b */
    public static final class C55833b implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C54738b1 f159023a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<String> f159024b;

        /* renamed from: c */
        public final /* synthetic */ FinderLiveVisitorWithoutAffinityUI f159025c;

        public C55833b(C54738b1 b1Var, C8479f0<String> f0Var, FinderLiveVisitorWithoutAffinityUI finderLiveVisitorWithoutAffinityUI) {
            this.f159023a = b1Var;
            this.f159024b = f0Var;
            this.f159025c = finderLiveVisitorWithoutAffinityUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x004b A[Catch:{ Exception -> 0x022f }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3 A[Catch:{ Exception -> 0x022f }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00b6 A[Catch:{ Exception -> 0x022f }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00d0 A[Catch:{ Exception -> 0x022f }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e4 A[Catch:{ Exception -> 0x022f }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0105 A[Catch:{ Exception -> 0x022f }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0128 A[Catch:{ Exception -> 0x022f }] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x014d A[Catch:{ Exception -> 0x022f }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x018a A[Catch:{ Exception -> 0x022f }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x018c A[Catch:{ Exception -> 0x022f }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x019c A[Catch:{ Exception -> 0x022f }] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Map<java.lang.String, java.lang.Object> mo37b(java.lang.String r14) {
            /*
                r13 = this;
                java.lang.Class<cl1.u> r0 = cl1.C55001u.class
                java.lang.Class<kq.g> r1 = p185kq.C61130g.class
                java.lang.Class<kq.h> r2 = p185kq.C10383h.class
                java.lang.Class<ak1.w> r3 = ak1.C54116w.class
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>()
                java.lang.String r5 = "live_id"
                di3.d r6 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x022f }
                kq.h r6 = (p185kq.C10383h) r6     // Catch:{ Exception -> 0x022f }
                cj1.b1 r7 = r13.f159023a     // Catch:{ Exception -> 0x022f }
                r8 = 0
                r9 = 0
                if (r7 == 0) goto L_0x0037
                int r11 = r7.f153420i     // Catch:{ Exception -> 0x022f }
                java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r7 = r7.f153423l     // Catch:{ Exception -> 0x022f }
                java.lang.Object r7 = sx3.C110818d0.m150917O(r7, r11)     // Catch:{ Exception -> 0x022f }
                com.tencent.mm.live.api.LiveConfig r7 = (com.tencent.p014mm.live.api.LiveConfig) r7     // Catch:{ Exception -> 0x022f }
                if (r7 == 0) goto L_0x002f
                long r11 = r7.f157064e     // Catch:{ Exception -> 0x022f }
                java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x022f }
                goto L_0x0030
            L_0x002f:
                r7 = r8
            L_0x0030:
                if (r7 == 0) goto L_0x0037
                long r11 = r7.longValue()     // Catch:{ Exception -> 0x022f }
                goto L_0x0038
            L_0x0037:
                r11 = r9
            L_0x0038:
                java.lang.String r6 = r6.mo10700XQ(r11)     // Catch:{ Exception -> 0x022f }
                r4.put(r5, r6)     // Catch:{ Exception -> 0x022f }
                java.lang.String r5 = "feed_id"
                di3.d r6 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x022f }
                kq.h r6 = (p185kq.C10383h) r6     // Catch:{ Exception -> 0x022f }
                cj1.b1 r7 = r13.f159023a     // Catch:{ Exception -> 0x022f }
                if (r7 == 0) goto L_0x0066
                int r11 = r7.f153420i     // Catch:{ Exception -> 0x022f }
                java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r7 = r7.f153423l     // Catch:{ Exception -> 0x022f }
                java.lang.Object r7 = sx3.C110818d0.m150917O(r7, r11)     // Catch:{ Exception -> 0x022f }
                com.tencent.mm.live.api.LiveConfig r7 = (com.tencent.p014mm.live.api.LiveConfig) r7     // Catch:{ Exception -> 0x022f }
                if (r7 == 0) goto L_0x005e
                long r11 = r7.f157075s     // Catch:{ Exception -> 0x022f }
                java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x022f }
                goto L_0x005f
            L_0x005e:
                r7 = r8
            L_0x005f:
                if (r7 == 0) goto L_0x0066
                long r11 = r7.longValue()     // Catch:{ Exception -> 0x022f }
                goto L_0x0067
            L_0x0066:
                r11 = r9
            L_0x0067:
                java.lang.String r6 = r6.mo10700XQ(r11)     // Catch:{ Exception -> 0x022f }
                r4.put(r5, r6)     // Catch:{ Exception -> 0x022f }
                java.lang.String r5 = "finder_username"
                cj1.b1 r6 = r13.f159023a     // Catch:{ Exception -> 0x022f }
                if (r6 == 0) goto L_0x0084
                java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r7 = r6.f153423l     // Catch:{ Exception -> 0x022f }
                if (r7 == 0) goto L_0x0084
                int r6 = r6.f153420i     // Catch:{ Exception -> 0x022f }
                java.lang.Object r6 = sx3.C110818d0.m150917O(r7, r6)     // Catch:{ Exception -> 0x022f }
                com.tencent.mm.live.api.LiveConfig r6 = (com.tencent.p014mm.live.api.LiveConfig) r6     // Catch:{ Exception -> 0x022f }
                if (r6 == 0) goto L_0x0084
                java.lang.String r8 = r6.f157069j     // Catch:{ Exception -> 0x022f }
            L_0x0084:
                r4.put(r5, r8)     // Catch:{ Exception -> 0x022f }
                java.lang.String r5 = "finder_context_id"
                di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x022f }
                kq.h r2 = (p185kq.C10383h) r2     // Catch:{ Exception -> 0x022f }
                java.lang.String r2 = r2.mo10696E()     // Catch:{ Exception -> 0x022f }
                java.lang.String r6 = ""
                if (r2 != 0) goto L_0x0098
                r2 = r6
            L_0x0098:
                r4.put(r5, r2)     // Catch:{ Exception -> 0x022f }
                java.lang.String r2 = "enter_session_id"
                di3.d r5 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x022f }
                ak1.w r5 = (ak1.C54116w) r5     // Catch:{ Exception -> 0x022f }
                fj1.b$a r7 = fj1.C45795b.f123697j     // Catch:{ Exception -> 0x022f }
                fj1.b r7 = fj1.C45795b.f123698n     // Catch:{ Exception -> 0x022f }
                if (r7 == 0) goto L_0x00b6
                androidx.lifecycle.i0 r7 = r7.mo71262a(r0)     // Catch:{ Exception -> 0x022f }
                cl1.u r7 = (cl1.C55001u) r7     // Catch:{ Exception -> 0x022f }
                te3.c21 r7 = r7.f154420q     // Catch:{ Exception -> 0x022f }
                if (r7 == 0) goto L_0x00b6
                long r7 = r7.f182392d     // Catch:{ Exception -> 0x022f }
                goto L_0x00b7
            L_0x00b6:
                r7 = r9
            L_0x00b7:
                long r7 = r5.yx0(r7)     // Catch:{ Exception -> 0x022f }
                java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x022f }
                r4.put(r2, r5)     // Catch:{ Exception -> 0x022f }
                java.lang.String r2 = "comment_scene"
                di3.d r5 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x022f }
                kq.g r5 = (p185kq.C61130g) r5     // Catch:{ Exception -> 0x022f }
                java.lang.String r5 = r5.mo33244gK()     // Catch:{ Exception -> 0x022f }
                if (r5 != 0) goto L_0x00d1
                r5 = r6
            L_0x00d1:
                r4.put(r2, r5)     // Catch:{ Exception -> 0x022f }
                java.lang.String r2 = "behaviour_session_id"
                java.lang.Class<h81.i> r5 = h81.C59774i.class
                di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ Exception -> 0x022f }
                h81.i r5 = (h81.C59774i) r5     // Catch:{ Exception -> 0x022f }
                java.lang.String r5 = r5.mo84751Wb()     // Catch:{ Exception -> 0x022f }
                if (r5 != 0) goto L_0x00e5
                r5 = r6
            L_0x00e5:
                r4.put(r2, r5)     // Catch:{ Exception -> 0x022f }
                java.lang.String r2 = "session_buffer"
                di3.d r5 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x022f }
                ak1.w r5 = (ak1.C54116w) r5     // Catch:{ Exception -> 0x022f }
                di3.d r7 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x022f }
                ak1.w r7 = (ak1.C54116w) r7     // Catch:{ Exception -> 0x022f }
                long r7 = r7.f151943h     // Catch:{ Exception -> 0x022f }
                di3.d r11 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x022f }
                kq.g r11 = (p185kq.C61130g) r11     // Catch:{ Exception -> 0x022f }
                java.lang.String r11 = r11.mo33244gK()     // Catch:{ Exception -> 0x022f }
                if (r11 != 0) goto L_0x0106
                r11 = r6
            L_0x0106:
                java.lang.String r5 = r5.zx0(r7, r11)     // Catch:{ Exception -> 0x022f }
                r4.put(r2, r5)     // Catch:{ Exception -> 0x022f }
                java.lang.String r2 = "live_enter_icon_type"
                java.lang.Class<ak1.o> r5 = ak1.C54108o.class
                di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ Exception -> 0x022f }
                ak1.o r5 = (ak1.C54108o) r5     // Catch:{ Exception -> 0x022f }
                r5.getClass()     // Catch:{ Exception -> 0x022f }
                ak1.f0 r5 = ak1.C54108o.f151869h     // Catch:{ Exception -> 0x022f }
                di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x022f }
                kq.g r1 = (p185kq.C61130g) r1     // Catch:{ Exception -> 0x022f }
                java.lang.String r1 = r1.mo33244gK()     // Catch:{ Exception -> 0x022f }
                if (r1 != 0) goto L_0x0129
                r1 = r6
            L_0x0129:
                di3.d r7 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x022f }
                ak1.w r7 = (ak1.C54116w) r7     // Catch:{ Exception -> 0x022f }
                int r7 = r7.f151947j     // Catch:{ Exception -> 0x022f }
                long r7 = (long) r7     // Catch:{ Exception -> 0x022f }
                long r7 = r5.mo74755e(r1, r7)     // Catch:{ Exception -> 0x022f }
                int r1 = (int) r7     // Catch:{ Exception -> 0x022f }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x022f }
                r4.put(r2, r1)     // Catch:{ Exception -> 0x022f }
                java.lang.String r1 = "live_scenenote_appid"
                gy3.f0<java.lang.String> r2 = r13.f159024b     // Catch:{ Exception -> 0x022f }
                T r2 = r2.f27484d     // Catch:{ Exception -> 0x022f }
                r4.put(r1, r2)     // Catch:{ Exception -> 0x022f }
                java.lang.String r1 = "live_request_id"
                fj1.b r2 = fj1.C45795b.f123698n     // Catch:{ Exception -> 0x022f }
                if (r2 == 0) goto L_0x015b
                java.lang.Class<cl1.o> r5 = cl1.C54991o.class
                androidx.lifecycle.i0 r2 = r2.mo71262a(r5)     // Catch:{ Exception -> 0x022f }
                cl1.o r2 = (cl1.C54991o) r2     // Catch:{ Exception -> 0x022f }
                java.lang.String r2 = r2.f154318g2     // Catch:{ Exception -> 0x022f }
                if (r2 != 0) goto L_0x015a
                goto L_0x015b
            L_0x015a:
                r6 = r2
            L_0x015b:
                r4.put(r1, r6)     // Catch:{ Exception -> 0x022f }
                java.lang.String r1 = "live_chnl_extra"
                di3.d r2 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x022f }
                ak1.w r2 = (ak1.C54116w) r2     // Catch:{ Exception -> 0x022f }
                java.lang.String r2 = r2.f151907K     // Catch:{ Exception -> 0x022f }
                r4.put(r1, r2)     // Catch:{ Exception -> 0x022f }
                java.lang.String r1 = "live_switch_extra"
                java.lang.Class<ir.n> r2 = p565ir.C60606n.class
                di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x022f }
                ir.n r2 = (p565ir.C60606n) r2     // Catch:{ Exception -> 0x022f }
                java.lang.String r2 = r2.tx0()     // Catch:{ Exception -> 0x022f }
                r4.put(r1, r2)     // Catch:{ Exception -> 0x022f }
                java.lang.String r1 = "live_cur_screen_type"
                di3.d r2 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x022f }
                ak1.w r2 = (ak1.C54116w) r2     // Catch:{ Exception -> 0x022f }
                boolean r2 = r2.f151912Q     // Catch:{ Exception -> 0x022f }
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L_0x018c
                r2 = 2
                goto L_0x018d
            L_0x018c:
                r2 = 1
            L_0x018d:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x022f }
                r4.put(r1, r2)     // Catch:{ Exception -> 0x022f }
                java.lang.String r1 = "page_out"
                boolean r14 = u24.C90599h.m113509b(r14, r1)     // Catch:{ Exception -> 0x022f }
                if (r14 == 0) goto L_0x024c
                r14 = 5
                rx3.l[] r14 = new rx3.C13604l[r14]     // Catch:{ Exception -> 0x022f }
                java.lang.String r1 = "live_start_time"
                fj1.b r2 = fj1.C45795b.f123698n     // Catch:{ Exception -> 0x022f }
                r7 = 0
                if (r2 == 0) goto L_0x01b3
                androidx.lifecycle.i0 r0 = r2.mo71262a(r0)     // Catch:{ Exception -> 0x022f }
                cl1.u r0 = (cl1.C55001u) r0     // Catch:{ Exception -> 0x022f }
                te3.c21 r0 = r0.f154420q     // Catch:{ Exception -> 0x022f }
                if (r0 == 0) goto L_0x01b3
                int r0 = r0.f182396h     // Catch:{ Exception -> 0x022f }
                goto L_0x01b4
            L_0x01b3:
                r0 = 0
            L_0x01b4:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x022f }
                rx3.l r2 = new rx3.l     // Catch:{ Exception -> 0x022f }
                r2.<init>(r1, r0)     // Catch:{ Exception -> 0x022f }
                r14[r7] = r2     // Catch:{ Exception -> 0x022f }
                java.lang.String r0 = "live_exit_type"
                di3.d r1 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x022f }
                ak1.w r1 = (ak1.C54116w) r1     // Catch:{ Exception -> 0x022f }
                int r1 = r1.f151949o     // Catch:{ Exception -> 0x022f }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x022f }
                rx3.l r2 = new rx3.l     // Catch:{ Exception -> 0x022f }
                r2.<init>(r0, r1)     // Catch:{ Exception -> 0x022f }
                r14[r6] = r2     // Catch:{ Exception -> 0x022f }
                java.lang.String r0 = "live_watch_duration"
                di3.d r1 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x022f }
                ak1.w r1 = (ak1.C54116w) r1     // Catch:{ Exception -> 0x022f }
                long r1 = r1.f151950p     // Catch:{ Exception -> 0x022f }
                int r6 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                if (r6 <= 0) goto L_0x01f0
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x022f }
                di3.d r6 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x022f }
                ak1.w r6 = (ak1.C54116w) r6     // Catch:{ Exception -> 0x022f }
                long r6 = r6.f151950p     // Catch:{ Exception -> 0x022f }
                long r9 = r1 - r6
            L_0x01f0:
                java.lang.Long r1 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x022f }
                rx3.l r2 = new rx3.l     // Catch:{ Exception -> 0x022f }
                r2.<init>(r0, r1)     // Catch:{ Exception -> 0x022f }
                r14[r5] = r2     // Catch:{ Exception -> 0x022f }
                r0 = 3
                java.lang.String r1 = "float_live_watch_duration"
                di3.d r2 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x022f }
                ak1.w r2 = (ak1.C54116w) r2     // Catch:{ Exception -> 0x022f }
                long r5 = r2.f151911P     // Catch:{ Exception -> 0x022f }
                java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x022f }
                rx3.l r5 = new rx3.l     // Catch:{ Exception -> 0x022f }
                r5.<init>(r1, r2)     // Catch:{ Exception -> 0x022f }
                r14[r0] = r5     // Catch:{ Exception -> 0x022f }
                r0 = 4
                java.lang.String r1 = "full_live_watch_duration"
                di3.d r2 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x022f }
                ak1.w r2 = (ak1.C54116w) r2     // Catch:{ Exception -> 0x022f }
                long r2 = r2.f151910N     // Catch:{ Exception -> 0x022f }
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x022f }
                rx3.l r3 = new rx3.l     // Catch:{ Exception -> 0x022f }
                r3.<init>(r1, r2)     // Catch:{ Exception -> 0x022f }
                r14[r0] = r3     // Catch:{ Exception -> 0x022f }
                java.util.Map r14 = sx3.C90364q0.m113147f(r14)     // Catch:{ Exception -> 0x022f }
                r4.putAll(r14)     // Catch:{ Exception -> 0x022f }
                goto L_0x024c
            L_0x022f:
                r14 = move-exception
                java.lang.String r14 = r14.getMessage()
                com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI r0 = r13.f159025c
                java.lang.String r0 = r0.f159019o
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "[onCreate] bind page params throw Exception : "
                r1.append(r2)
                r1.append(r14)
                java.lang.String r14 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r14)
            L_0x024c:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWithoutAffinityUI.C55833b.mo37b(java.lang.String):java.util.Map");
        }
    }

    /* renamed from: N7 */
    public final void mo77435N7() {
        FinderLiveVisitorFragment finderLiveVisitorFragment = new FinderLiveVisitorFragment();
        this.f159020p = finderLiveVisitorFragment;
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        C87412m.m108593f(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.mo165200l(C0966R.C0970id.eek, finderLiveVisitorFragment);
        beginTransaction.mo165164f();
    }

    /* renamed from: O7 */
    public final boolean mo77436O7() {
        return getIntent().getBooleanExtra("LAUNCH_WITH_ANIM", false);
    }

    public boolean convertActivityFromTranslucent() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r3 = (fh1.C59062p2) r3.controller(fh1.C59062p2.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b5, code lost:
        if (r0.f160020o == false) goto L_0x01b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c3 A[SYNTHETIC, Splitter:B:75:0x01c3] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finish() {
        /*
            r11 = this;
            com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment r0 = r11.f159020p
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0066
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r0 = r3.mo62445d(r0)
            java.lang.Class<zk1.o0> r3 = zk1.C66878o0.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r3)
            zk1.o0 r0 = (zk1.C66878o0) r0
            r0.getClass()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r3.getClass()
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
            r4 = 0
            if (r3 == 0) goto L_0x002e
            java.lang.Class<fh1.p2> r5 = fh1.C59062p2.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r3 = r3.controller(r5)
            fh1.p2 r3 = (fh1.C59062p2) r3
            if (r3 == 0) goto L_0x002e
            cj1.n4 r3 = r3.f168993z
            goto L_0x002f
        L_0x002e:
            r3 = r4
        L_0x002f:
            if (r3 == 0) goto L_0x003b
            te3.wp2 r3 = r3.f1381a
            if (r3 == 0) goto L_0x003b
            boolean r3 = r3.f186152d
            if (r3 != 0) goto L_0x003b
            r3 = 1
            goto L_0x003c
        L_0x003b:
            r3 = 0
        L_0x003c:
            r3 = r3 ^ r1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "finishSquareEvent isDisableScrollSquare :"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " isFromOverScroll: "
            r5.append(r3)
            boolean r3 = r0.f192126h
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "FinderLiveScrollSquareUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            boolean r3 = r0.f192126h
            if (r3 != 0) goto L_0x0066
            r5 = 2
            r0.mo90871d3(r5, r4)
        L_0x0066:
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r0 = r0.mo62444c(r11)
            java.lang.Class<com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC> r3 = com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r3)
            com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC r0 = (com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC) r0
            boolean r3 = r11.isSwiping()
            java.lang.String r4 = r0.f160012d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "checkIsNeedInterceptExit isForceFinish: "
            r5.append(r6)
            boolean r6 = r0.f160013e
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            boolean r4 = r0.f160013e
            if (r4 == 0) goto L_0x0096
            goto L_0x01df
        L_0x0096:
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            ph1.i r5 = ph1.C62293i.f177081a
            long r6 = r0.f160018j
            ph1.m r6 = r5.mo87360e(r6)
            if (r6 == 0) goto L_0x00c7
            boolean r7 = r6.mo84320e()
            java.lang.String r8 = r0.f160012d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "isNeedIntercept hasDetach : "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            boolean r7 = r6.mo84320e()
            if (r7 != 0) goto L_0x00c7
            r6.mo84322g()
            goto L_0x01c0
        L_0x00c7:
            boolean r6 = r0.f160022q
            if (r6 == 0) goto L_0x01b9
            if (r3 == 0) goto L_0x00cf
            goto L_0x01b9
        L_0x00cf:
            boolean r3 = r0.f160024s
            if (r3 == 0) goto L_0x00dc
            java.lang.String r3 = r0.f160012d
            java.lang.String r4 = "checkLiveScrollSquareFinish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            goto L_0x01b7
        L_0x00dc:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r6 = r3.mo77630e(r4)
            cl1.o r6 = (cl1.C54991o) r6
            if (r6 == 0) goto L_0x00eb
            boolean r6 = r6.mo75997d4()
            goto L_0x00ec
        L_0x00eb:
            r6 = 1
        L_0x00ec:
            androidx.lifecycle.i0 r7 = r3.mo77630e(r4)
            cl1.o r7 = (cl1.C54991o) r7
            if (r7 == 0) goto L_0x00f7
            int r7 = r7.f154291a1
            goto L_0x00f8
        L_0x00f7:
            r7 = 0
        L_0x00f8:
            r8 = 524288(0x80000, float:7.34684E-40)
            boolean r7 = o40.C61926c.m72696u(r7, r8)
            androidx.lifecycle.i0 r3 = r3.mo77630e(r4)
            cl1.o r3 = (cl1.C54991o) r3
            if (r3 == 0) goto L_0x010b
            boolean r3 = r3.mo76007j4()
            goto L_0x010c
        L_0x010b:
            r3 = 0
        L_0x010c:
            androidx.appcompat.app.AppCompatActivity r4 = r0.getActivity()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.orientation
            r8 = 2
            if (r4 != r8) goto L_0x011f
            r4 = 1
            goto L_0x0120
        L_0x011f:
            r4 = 0
        L_0x0120:
            java.lang.String r8 = r0.f160012d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "isNeedInterceptdestory isForceFinish = "
            r9.append(r10)
            boolean r10 = r0.f160013e
            r9.append(r10)
            java.lang.String r10 = " isLiveFinish: "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r10 = " isVoiceFinish: "
            r9.append(r10)
            boolean r10 = r0.f160015g
            r9.append(r10)
            java.lang.String r10 = " isVrLive: "
            r9.append(r10)
            r9.append(r3)
            java.lang.String r10 = " isLandscape: "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r10 = " isEventIntercept: "
            r9.append(r10)
            boolean r10 = r0.f160020o
            r9.append(r10)
            java.lang.String r10 = " isPause: "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            up1.f r8 = up1.C37521f.f99374d
            r8.getClass()
            pe1.c<java.lang.Integer> r8 = up1.C37521f.f99135B6
            java.lang.Object r8 = r8.mo60266n()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r1) goto L_0x01a0
            pe1.c<java.lang.Integer> r8 = up1.C37521f.f99578z6
            java.lang.Object r8 = r8.mo60266n()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r1) goto L_0x019b
            boolean r8 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r8 != 0) goto L_0x019b
            boolean r8 = com.tencent.p014mm.p136ui.C85875k4.m106167X()
            if (r8 != 0) goto L_0x019b
            r8 = 1
            goto L_0x019c
        L_0x019b:
            r8 = 0
        L_0x019c:
            if (r8 == 0) goto L_0x01a0
            r8 = 1
            goto L_0x01a1
        L_0x01a0:
            r8 = 0
        L_0x01a1:
            if (r8 == 0) goto L_0x01c0
            boolean r8 = r0.f160013e
            if (r8 != 0) goto L_0x01c0
            if (r6 != 0) goto L_0x01c0
            if (r7 != 0) goto L_0x01c0
            boolean r6 = r0.f160015g
            if (r6 != 0) goto L_0x01c0
            if (r3 != 0) goto L_0x01c0
            if (r4 != 0) goto L_0x01c0
            boolean r3 = r0.f160020o
            if (r3 != 0) goto L_0x01c0
        L_0x01b7:
            r3 = 1
            goto L_0x01c1
        L_0x01b9:
            java.lang.String r3 = r0.f160012d
            java.lang.String r4 = "isNeedIntercept isUserClose = false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
        L_0x01c0:
            r3 = 0
        L_0x01c1:
            if (r3 == 0) goto L_0x01da
            r0.mo78202e3()     // Catch:{ all -> 0x01c7 }
            goto L_0x01e0
        L_0x01c7:
            r3 = move-exception
            java.lang.String r4 = r0.f160012d
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r3
            java.lang.String r2 = "startExitAnimate exception"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r5)
            java.lang.String r2 = "exception"
            r0.mo78201d3(r2)
            goto L_0x01e0
        L_0x01da:
            long r0 = r0.f160018j
            r5.mo87359d(r0)
        L_0x01df:
            r1 = 0
        L_0x01e0:
            if (r1 == 0) goto L_0x01e3
            return
        L_0x01e3:
            com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment r0 = r11.f159020p
            if (r0 == 0) goto L_0x0201
            java.util.HashSet<com.tencent.mm.ui.component.UIComponent> r0 = r0.f165434e
            java.util.Iterator r0 = r0.iterator()
        L_0x01ed:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0201
            java.lang.Object r1 = r0.next()
            com.tencent.mm.ui.component.UIComponent r1 = (com.tencent.p014mm.p136ui.component.UIComponent) r1
            android.content.Intent r2 = r11.getIntent()
            r1.onBeforeFinish(r2)
            goto L_0x01ed
        L_0x0201:
            super.finish()
            boolean r0 = r11.mo77436O7()
            if (r0 == 0) goto L_0x020e
            r0 = 2130771984(0x7f010010, float:1.7147074E38)
            goto L_0x0211
        L_0x020e:
            r0 = 2130772172(0x7f0100cc, float:1.7147455E38)
        L_0x0211:
            r1 = 2130771992(0x7f010018, float:1.714709E38)
            r11.overridePendingTransition(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWithoutAffinityUI.finish():void");
    }

    public int getForceOrientation() {
        FinderLiveService.f159376d.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        boolean z = true;
        if (bVar == null || !((C54991o) bVar.mo71262a(C54991o.class)).f154375v1) {
            z = false;
        }
        return z ? this.f159021q : super.getForceOrientation();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.akp;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C0324s.m265a(C24560g0.m30725a(C8815x4.class)), C0324s.m265a(C24560g0.m30725a(C8813w4.class)), C15085j.class, FinderLiveExitAnimateOpUIC.class, C15096l.class, C58312g.class, C66880s0.class, C63654v2.class, C66879r0.class, C63563l6.class);
    }

    public void initActivityCloseAnimation() {
        if (!mo77436O7()) {
            super.initActivityCloseAnimation();
        }
    }

    public void onBusinessPermissionDenied(String str) {
    }

    public void onBusinessPermissionGranted(String str) {
        C58115i iVar;
        C56032b bVar;
        C62983sh shVar;
        C58115i iVar2;
        C58115i.C58116a aVar = C58115i.C58116a.NO_LINK_MIC;
        boolean z = false;
        if (C87412m.m108589b(str, "camera")) {
            FinderLiveService.f159376d.getClass();
            C60735a aVar2 = FinderLiveService.f159378f;
            if (!(aVar2 == null || (iVar2 = aVar2.f172989A) == null)) {
                if (!(iVar2.f166256c == aVar)) {
                    z = true;
                }
            }
            if (z && (bVar = FinderLiveService.f159379g) != null && (shVar = (C62983sh) bVar.getPlugin(C62983sh.class)) != null) {
                shVar.mo87922c1();
            }
        } else if (C87412m.m108589b(str, "microphone")) {
            FinderLiveService.f159376d.getClass();
            C60735a aVar3 = FinderLiveService.f159378f;
            if (!(aVar3 == null || (iVar = aVar3.f172989A) == null)) {
                if (!(iVar.f166256c == aVar)) {
                    z = true;
                }
            }
            if (z) {
                C62197e eVar = aVar3 instanceof C62197e ? (C62197e) aVar3 : null;
                if (eVar != null) {
                    eVar.mo85699r0(true);
                }
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        Intent intent;
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        AppCompatActivity context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        boolean z = false;
        if (!(context == null || (intent = context.getIntent()) == null)) {
            z = intent.getBooleanExtra("KEY_PARAMS_FROM_SPLIT_SCREEN", false);
        }
        String str = this.f159019o;
        Log.m105924i(str, "[onConfigurationChanged] isFromSplitScreen:" + z + ", lastOrientation：" + this.f159021q + ",newConfig.orientation:" + configuration.orientation + " originResource: " + getResources().getConfiguration() + " hashCode: " + getResources().getConfiguration().hashCode());
        if (z) {
            Log.m105924i(this.f159019o, "isFromSplitScreen, donothing");
            return;
        }
        int i = this.f159021q;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.f159021q = i2;
            getIntent().putExtra("KEY_PARAMS_RESET_LIVE", true);
            FinderLiveVisitorFragment finderLiveVisitorFragment = this.f159020p;
            if (finderLiveVisitorFragment != null) {
                C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
                C87412m.m108593f(beginTransaction, "supportFragmentManager.beginTransaction()");
                beginTransaction.mo165169k(finderLiveVisitorFragment);
                beginTransaction.mo165164f();
            }
            mo77435N7();
            getResources().getConfiguration().orientation = configuration.orientation;
            ((C54116w) C86312j.m106911c(C54116w.class)).Ay0(true, configuration.orientation);
        }
        LocaleUtil.initLanguage(MMApplicationContext.getContext());
    }

    public void onCreate(Bundle bundle) {
        JSONObject jSONObject;
        Window window;
        View decorView;
        Class cls = C54116w.class;
        Class cls2 = C60172g4.class;
        Class cls3 = C61212e.class;
        this.f161157i = true;
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(cls3)).E60(this, C55832a.f159022a);
        C12932c cVar = C11940k.f34875a;
        C11940k.f34875a.mo12482c("onCreate before");
        String stringExtra = getIntent().getStringExtra("key_context_id");
        String stringExtra2 = getIntent().getStringExtra("key_click_tab_context_id");
        String stringExtra3 = getIntent().getStringExtra("key_click_sub_tab_context_id");
        String stringExtra4 = getIntent().getStringExtra("key_chnl_extra");
        long longExtra = getIntent().getLongExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID", 0);
        int intExtra = getIntent().getIntExtra("KEY_FINDER_FROM_FEED_TYPE", 0);
        Long valueOf = Long.valueOf(longExtra);
        if (!(valueOf.longValue() != 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            if (!(!(stringExtra4 == null || stringExtra4.length() == 0))) {
                stringExtra4 = null;
            }
            JSONObject jSONObject2 = stringExtra4 != null ? new JSONObject(stringExtra4) : new JSONObject("{}");
            jSONObject2.put("from_feed_id", C61926c.m72691p(longValue));
            stringExtra4 = jSONObject2.toString();
        }
        Integer valueOf2 = Integer.valueOf(intExtra);
        if (!(valueOf2.intValue() != 0)) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            int intValue = valueOf2.intValue();
            if (!(!(stringExtra4 == null || stringExtra4.length() == 0))) {
                stringExtra4 = null;
            }
            JSONObject jSONObject3 = stringExtra4 != null ? new JSONObject(stringExtra4) : new JSONObject("{}");
            jSONObject3.put("head_enter_type", String.valueOf(intValue));
            stringExtra4 = jSONObject3.toString();
        }
        T gK = ((C61130g) C86312j.m106911c(C61130g.class)).mo33244gK();
        T t = "";
        if (gK == null) {
            gK = t;
        }
        if (TextUtils.isEmpty(stringExtra4)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(stringExtra4);
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
        }
        JSONObject jSONObject4 = TextUtils.isEmpty(jSONObject.optString("enter_immerse_type")) ? jSONObject : null;
        if (jSONObject4 != null) {
            jSONObject4.put("enter_immerse_type", gK);
        }
        T stringExtra5 = getIntent().getStringExtra("KEY_ENTER_LIVE_PARAM_APP_PUSH_TASK_ID");
        if (stringExtra5 == null) {
            stringExtra5 = t;
        }
        if (!Util.isNullOrNil((String) stringExtra5)) {
            JSONObject jSONObject5 = TextUtils.isEmpty(jSONObject.optString("taskid")) ? jSONObject : null;
            if (jSONObject5 != null) {
                jSONObject5.put("taskid", stringExtra5);
            }
        }
        JSONObject jSONObject6 = TextUtils.isEmpty(jSONObject.optString("slide_sessionid")) ? jSONObject : null;
        if (jSONObject6 != null) {
            jSONObject6.put("slide_sessionid", System.currentTimeMillis());
        }
        C54738b1 b = C54738b1.f153409B.mo560b(getIntent());
        if (b != null) {
            JSONObject jSONObject7 = TextUtils.isEmpty(jSONObject.optString("is_pk_enter")) ? jSONObject : null;
            if (jSONObject7 != null) {
                C64347eq2 eq22 = b.f153411A;
                String str = eq22 != null ? eq22.f183025p : null;
                jSONObject7.put("is_pk_enter", !(str == null || str.length() == 0) ? "1" : "0");
            }
        }
        String str2 = this.f159019o;
        Log.m105924i(str2, "appendChnlExta currentScene: " + gK + " data: " + jSONObject);
        String jSONObject8 = jSONObject.toString();
        if (!TextUtils.isEmpty(stringExtra)) {
            ((C60172g4) C39818r.f106831a.mo62444c(this).mo62447c(cls2)).mo12862r3(stringExtra);
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            ((C60172g4) C39818r.f106831a.mo62444c(this).mo62447c(cls2)).mo12863s3(stringExtra2);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            ((C60172g4) C39818r.f106831a.mo62444c(this).mo62447c(cls2)).mo12836B3(stringExtra3);
        }
        if (!TextUtils.isEmpty(jSONObject8)) {
            ((C60172g4) C39818r.f106831a.mo62444c(this).mo62447c(cls2)).mo12865u3(jSONObject8);
        }
        getIntent().putExtra("KEY_PARAMS_RESET_LIVE", false);
        mo77435N7();
        C12932c cVar2 = C11940k.f34875a;
        C11940k.f34875a.mo12482c("onCreate after");
        if (!(mo77436O7() || (window = getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            decorView.setBackgroundColor(-16777216);
        }
        Log.m105924i(this.f159019o, "[onCreate]");
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = t;
        try {
            if (!C90599h.m113511d(((C54116w) C86312j.m106911c(cls)).f151927X0)) {
                t = new JSONObject(((C54116w) C86312j.m106911c(cls)).f151927X0).getString("appid");
                C87412m.m108593f(t, "JSONObject(\n            …     ).getString(\"appid\")");
            }
            f0Var.f27484d = t;
        } catch (Exception unused2) {
        }
        ((C61212e) C86312j.m106911c(cls3)).mo86178qr(this, C11345b.FinderLiveVisitorWithoutAffinityUI);
        ((C61212e) C86312j.m106911c(cls3)).mo86179qs(this, C76986a.FinderLive).y50(this, PatchedFlutterActivity.EXTRA_PAGE_TYPE, 0);
        ((C61212e) C86312j.m106911c(cls3)).E60(this, new C55833b(C54738b1.f153409B.mo560b(getIntent()), f0Var, this));
        ((C61212e) C86312j.m106911c(cls3)).mo86148No(this, 40, 25388);
        ((C61212e) C86312j.m106911c(cls3)).mo86148No(this, 12, 25561);
        if (mo77436O7()) {
            long longExtra2 = getIntent().getLongExtra("CURRENT_FEED_ID", 0);
            C62293i iVar = C62293i.f177081a;
            StringBuilder sb = new StringBuilder();
            sb.append("stopEnterLiveCountDown feedId: ");
            sb.append(longExtra2);
            sb.append(" coundownJob : ");
            C53973z1 z1Var = C62293i.f177082b.get(Long.valueOf(longExtra2));
            sb.append(z1Var != null ? Boolean.valueOf(z1Var.mo74466a()) : null);
            Log.m105924i("FinderFluentSwitchManager", sb.toString());
            C53973z1 z1Var2 = C62293i.f177082b.get(Long.valueOf(longExtra2));
            if (z1Var2 != null) {
                C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        if (!mo77436O7()) {
            return;
        }
        if (C85875k4.m106211z()) {
            setTheme(C0966R.style.f8621p2);
        } else {
            setTheme(C0966R.style.f8621p2);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C63372j.f179760a.mo88279b();
        C62042e.f176370a.mo87064a2(true, false);
        C58358d0.f167118d = null;
        C58358d0.f167116b = 0;
        C58358d0.f167117c = 0;
        C58358d0.f167119e = false;
        C58358d0.f167121g = true;
        Log.m105924i(this.f159019o, "[onDestroy]");
        C89916g.m112447b(this);
    }

    public void onPause() {
        super.onPause();
        Log.m105924i(this.f159019o, "[onPause]");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr.length == 0) {
            Log.m105925i(this.f159019o, "onRequestPermissionsResult grantResults length 0. requestCode=%d", Integer.valueOf(i));
        } else {
            C89916g.m112446a(this).mo124234h(i, strArr, iArr);
        }
    }

    public void onResume() {
        Class cls = C61212e.class;
        super.onResume();
        Log.m105924i(this.f159019o, "[onResume]");
        C12932c cVar = C11940k.f34875a;
        C11940k.f34875a.mo12482c("onResume after");
        C58418z1.C58419a aVar = C58418z1.f167360a;
        if ((aVar != null && aVar.f167362b == 0) && aVar != null) {
            aVar.f167362b = System.currentTimeMillis();
        }
        ((C61212e) C86312j.m106911c(cls)).y50(this, "special_enter_source", Integer.valueOf(((C59774i) C86312j.m106911c(C59774i.class)).mo84748Ps()));
        C64208c.C64209a aVar2 = C64208c.f181951a;
        if (C64208c.f181948O) {
            ((C61212e) C86312j.m106911c(cls)).mo86153W7("finder_live_to_full_window_event", this, C59988k.f171146g2.mo84902a(), 25561);
            C64208c.f181948O = false;
        }
    }

    public void onStart() {
        super.onStart();
        Log.m105924i(this.f159019o, "[onStart]");
    }

    public void onStop() {
        super.onStop();
        Log.m105924i(this.f159019o, "[onStop]");
    }

    public void onSwipeBack() {
        super.onSwipeBack();
    }
}
