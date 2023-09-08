package ve1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C55034v;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderExtClinkExposeStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import com.tencent.p014mm.plugin.finder.p056ui.FinderMsgFeedDetailUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedDetailUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C107029o;
import de3.C75355a0;
import df1.C7322a;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import er1.C58684b;
import er1.C58784w3;
import er1.C7832m3;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60172g4;
import ht1.C8808v4;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60896i;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kd1.C9584f;
import ke3.C88144b;
import kg3.C76577a;
import mf1.C10786a1;
import mf1.C10846o0;
import mf1.C10871u0;
import o40.C61926c;
import p629ny.C76979h;
import pf1.C11929x;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49277ef1;
import te3.C49712hj1;
import te3.C50687oi1;
import te3.C64284cg;
import te3.C64311db1;
import te3.C64472jk0;
import ur1.C65468g;
import wp1.C15585f;
import zc1.C66785b;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: ve1.x */
public class C14680x extends C60896i<C55034v> {

    /* renamed from: e */
    public final FinderCommentDrawerPresenter f40601e;

    /* renamed from: f */
    public final boolean f40602f;

    /* renamed from: g */
    public long f40603g;

    /* renamed from: ve1.x$a */
    public static final class C14681a implements View.OnLongClickListener {

        /* renamed from: d */
        public static final C14681a f40604d = new C14681a();

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: ve1.x$b */
    public static final class C14682b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C49277ef1 f40605d;

        /* renamed from: e */
        public final /* synthetic */ C55034v f40606e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f40607f;

        public C14682b(C49277ef1 ef12, C55034v vVar, C60905o oVar) {
            this.f40605d = ef12;
            this.f40606e = vVar;
            this.f40607f = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshActivity$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("key_activity_id", this.f40605d.f132898d);
            intent.putExtra("key_activity_name", this.f40605d.f132899e);
            intent.putExtra("key_nick_name", this.f40605d.f132900f);
            intent.putExtra("key_feed_ref_id", this.f40606e.f154508w.getFeedObject().f164794id);
            Log.m105924i("Finder.FeedCommentHeaderConvert", "eventTopicId :" + this.f40605d.f132898d + " eventName:" + this.f40605d.f132899e + " refId: " + this.f40606e.f154508w.getFeedObject().f164794id);
            intent.putExtra("key_feed_report_id", this.f40606e.f154508w.getFeedObject().f164794id);
            intent.putExtra("key_activity_profile_src_type", "1");
            intent.putExtra("key_entrance_type", 7);
            C9584f.f29822a.mo10262a(intent, C31543z5.m39453c(), 2);
            C7335d c = C86312j.m106911c(C58684b.class);
            C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
            Context context = this.f40607f.f173499A;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((C58684b) c).vx0((MMActivity) context, intent, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshActivity$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.x$c */
    public static final class C14683c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f40608d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f40609e;

        /* renamed from: f */
        public final /* synthetic */ TextView f40610f;

        /* renamed from: g */
        public final /* synthetic */ String f40611g;

        public C14683c(View view, C60905o oVar, TextView textView, String str) {
            this.f40608d = view;
            this.f40609e = oVar;
            this.f40610f = textView;
            this.f40611g = str;
        }

        public final void run() {
            int width = this.f40608d.getWidth();
            if (width > 0) {
                int b = C76577a.m92151b(this.f40609e.f173499A, 20);
                if (((float) b) + this.f40610f.getPaint().measureText(this.f40611g) > ((float) width)) {
                    TextView textView = this.f40610f;
                    textView.setText(TextUtils.ellipsize(this.f40611g, textView.getPaint(), (float) (width - b), TextUtils.TruncateAt.END));
                }
            }
        }
    }

    /* renamed from: ve1.x$d */
    public static final class C14684d extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C14680x f40612a;

        /* renamed from: b */
        public final /* synthetic */ C49712hj1 f40613b;

        /* renamed from: c */
        public final /* synthetic */ C55034v f40614c;

        public C14684d(C14680x xVar, C49712hj1 hj12, C55034v vVar) {
            this.f40612a = xVar;
            this.f40613b = hj12;
            this.f40614c = vVar;
        }

        /* renamed from: a */
        public long mo52a(View view) {
            C87412m.m108594g(view, "view");
            return this.f40614c.f154508w.field_id;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (z) {
                C14680x.m14017j(this.f40612a, this.f40613b, this.f40614c.f154508w, 1);
            }
        }
    }

    /* renamed from: ve1.x$e */
    public static final class C14685e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14680x f40615d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f40616e;

        /* renamed from: f */
        public final /* synthetic */ C55034v f40617f;

        /* renamed from: g */
        public final /* synthetic */ String f40618g;

        /* renamed from: h */
        public final /* synthetic */ C49712hj1 f40619h;

        public C14685e(C14680x xVar, C60905o oVar, C55034v vVar, String str, C49712hj1 hj12) {
            this.f40615d = xVar;
            this.f40616e = oVar;
            this.f40617f = vVar;
            this.f40618g = str;
            this.f40619h = hj12;
        }

        public final void onClick(View view) {
            C7322a b;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshLink$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C14680x xVar = this.f40615d;
            C60905o oVar = this.f40616e;
            FinderItem finderItem = this.f40617f.f154508w;
            String str = this.f40618g;
            xVar.getClass();
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13442s8 f = aVar.mo12873f(context);
            int i = f != null ? f.f38096i : 0;
            Intent intent = new Intent();
            String a = C7832m3.f26372a.mo8935a(str, 156, i + 10000, (int) (System.currentTimeMillis() / ((long) 1000)));
            Log.m105924i("Finder.FeedCommentHeaderConvert", "click linkLayout, url:" + str + ", urlWithReportParams:" + a);
            intent.putExtra("rawUrl", a);
            C88144b.m109791i(oVar.f173499A, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            Context context2 = oVar.f173499A;
            C87412m.m108593f(context2, "holder.context");
            C13442s8 f2 = aVar.mo12873f(context2);
            if (!(f2 == null || (b = C60172g4.C60173a.m70190b(f2, 0, 1, (Object) null)) == null)) {
                b.mo8766a(new C7322a.C7323a(19, finderItem.getId()));
            }
            C14680x.m14017j(this.f40615d, this.f40619h, this.f40617f.f154508w, 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshLink$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.x$f */
    public static final class C14686f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f40620d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f40621e;

        /* renamed from: f */
        public final /* synthetic */ TextView f40622f;

        /* renamed from: g */
        public final /* synthetic */ String f40623g;

        public C14686f(View view, C60905o oVar, TextView textView, String str) {
            this.f40620d = view;
            this.f40621e = oVar;
            this.f40622f = textView;
            this.f40623g = str;
        }

        public final void run() {
            int width = this.f40620d.getWidth();
            if (width > 0) {
                int b = C76577a.m92151b(this.f40621e.f173499A, 20);
                if (((float) b) + this.f40622f.getPaint().measureText(this.f40623g) > ((float) width)) {
                    TextView textView = this.f40622f;
                    textView.setText(TextUtils.ellipsize(this.f40623g, textView.getPaint(), (float) (width - b), TextUtils.TruncateAt.END));
                }
            }
        }
    }

    /* renamed from: ve1.x$g */
    public static final class C14687g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14680x f40624d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f40625e;

        /* renamed from: f */
        public final /* synthetic */ C55034v f40626f;

        /* renamed from: g */
        public final /* synthetic */ String f40627g;

        public C14687g(C14680x xVar, C60905o oVar, C55034v vVar, String str) {
            this.f40624d = xVar;
            this.f40625e = oVar;
            this.f40626f = vVar;
            this.f40627g = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x014f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r36) {
            /*
                r35 = this;
                r6 = r35
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r36
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPoi$1$4"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r35
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                ve1.x r0 = r6.f40624d
                jq3.o r1 = r6.f40625e
                cm1.v r2 = r6.f40626f
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f154508w
                java.lang.String r3 = r6.f40627g
                r0.getClass()
                java.lang.Class<dp1.y0> r0 = dp1.C58417y0.class
                java.lang.Class<er1.b> r4 = er1.C58684b.class
                up1.f r5 = up1.C37521f.f99374d
                r5.getClass()
                pe1.c<java.lang.Boolean> r7 = up1.C37521f.f99557x4
                java.lang.Object r7 = r7.mo60266n()
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                java.lang.String r12 = ""
                java.lang.String r13 = "KEY_TAB_TYPE"
                java.lang.String r14 = "holder.context"
                if (r7 == 0) goto L_0x0188
                android.content.Intent r5 = new android.content.Intent
                r5.<init>()
                te3.m74 r7 = new te3.m74
                r7.<init>()
                te3.db1 r15 = r2.getLocation()
                float r15 = r15.f182662e
                r7.f184220e = r15
                te3.db1 r15 = r2.getLocation()
                float r15 = r15.f182661d
                r7.f184219d = r15
                te3.db1 r15 = r2.getLocation()
                java.lang.String r15 = r15.f182666i
                r7.f184224i = r15
                te3.db1 r15 = r2.getLocation()
                int r15 = r15.f182667j
                r7.f184225j = r15
                te3.db1 r15 = r2.getLocation()
                java.lang.String r15 = r15.f182663f
                r7.f184221f = r15
                te3.db1 r15 = r2.getLocation()
                java.lang.String r15 = r15.f182670p
                r7.f184234v = r15
                te3.db1 r15 = r2.getLocation()
                java.lang.String r15 = r15.f182665h
                r7.f184223h = r15
                te3.db1 r15 = r2.getLocation()
                java.lang.String r15 = r15.f182664g
                r7.f184222g = r15
                byte[] r15 = r7.toByteArray()
                java.lang.String r8 = "key_location"
                r5.putExtra(r8, r15)
                ht1.w3$a r8 = ht1.C98522w3.C8810a.FINDER_POI_FROM_TYPE_FINDER
                java.lang.String r15 = "key_from_type"
                r5.putExtra(r15, r8)
                rs1.s8$a r8 = rs1.C13442s8.f38060Q0
                android.content.Context r15 = r1.f173499A
                gy3.C87412m.m108593f(r15, r14)
                rs1.s8 r15 = r8.mo12873f(r15)
                if (r15 == 0) goto L_0x00bf
                int r9 = r15.f38096i
                java.lang.String r11 = "key_from_scene"
                r5.putExtra(r11, r9)
                java.lang.String r9 = r15.f38098n
                java.lang.String r11 = "key_context_id"
                r5.putExtra(r11, r9)
            L_0x00bf:
                com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Class<ht1.w3> r11 = ht1.C98522w3.class
                di3.d r11 = di3.C86312j.m106911c(r11)
                ht1.w3 r11 = (ht1.C98522w3) r11
                long r10 = r11.mo3991CD()
                r22 = r12
                r23 = r13
                r12 = 5
                r9.mo175912v(r10, r12)
                tf3.q r9 = new tf3.q
                r9.<init>()
                oa1.d r10 = oa1.C117731d.m166007c()
                int r10 = r10.mo182440a(r9)
                r11 = 1
                if (r10 == r11) goto L_0x00f1
                bp3.p r10 = bp3.C79758p.f233760a
                int r9 = r10.mo109883f(r9)
                if (r9 != r11) goto L_0x00ef
                goto L_0x00f1
            L_0x00ef:
                r9 = 0
                goto L_0x00f2
            L_0x00f1:
                r9 = 1
            L_0x00f2:
                if (r9 == 0) goto L_0x0136
                java.lang.String r9 = r7.f184224i
                if (r9 == 0) goto L_0x0103
                java.lang.String r10 = "foursquare_"
                r12 = 0
                boolean r9 = z04.C112551y.m153819s(r9, r10, r12)
                if (r9 != r11) goto L_0x0103
                r9 = 1
                goto L_0x0104
            L_0x0103:
                r9 = 0
            L_0x0104:
                if (r9 != 0) goto L_0x0136
                pe1.c<java.lang.Integer> r9 = up1.C37521f.f99576z4
                java.lang.Object r9 = r9.mo60266n()
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                if (r9 != 0) goto L_0x0115
                goto L_0x0136
            L_0x0115:
                di3.d r4 = di3.C86312j.m106911c(r4)
                java.lang.String r9 = "getService(ActivityRouter::class.java)"
                gy3.C87412m.m108593f(r4, r9)
                r15 = r4
                tf0.o1 r15 = (tf0.C13883o1) r15
                android.content.Context r4 = r1.f173499A
                gy3.C87412m.m108593f(r4, r14)
                r19 = 0
                r20 = 8
                r21 = 0
                r16 = r4
                r17 = r5
                r18 = r7
                tf0.C13883o1.C13884a.m13253e(r15, r16, r17, r18, r19, r20, r21)
                goto L_0x0144
            L_0x0136:
                di3.d r4 = di3.C86312j.m106911c(r4)
                er1.b r4 = (er1.C58684b) r4
                android.content.Context r7 = r1.f173499A
                gy3.C87412m.m108593f(r7, r14)
                r4.I00(r7, r5)
            L_0x0144:
                android.content.Context r1 = r1.f173499A
                gy3.C87412m.m108593f(r1, r14)
                rs1.s8 r1 = r8.mo12873f(r1)
                if (r1 == 0) goto L_0x0275
                di3.d r0 = di3.C86312j.m106911c(r0)
                r7 = r0
                dp1.y0 r7 = (dp1.C58417y0) r7
                long r8 = r2.getId()
                if (r3 != 0) goto L_0x015f
                r10 = r22
                goto L_0x0160
            L_0x015f:
                r10 = r3
            L_0x0160:
                r11 = 2
                r12 = 0
                int r14 = r1.f38096i
                r7.Ax0(r8, r10, r11, r12, r14)
                int r0 = r1.f38091d
                r7 = r23
                r5.putExtra(r7, r0)
                r0 = 0
                r3 = 1
                r4 = 0
                df1.a r0 = ht1.C60172g4.C60173a.m70190b(r1, r4, r3, r0)
                if (r0 == 0) goto L_0x0275
                long r1 = r2.getId()
                df1.a$a r3 = new df1.a$a
                r4 = 14
                r3.<init>(r4, r1)
                r0.mo8766a(r3)
                goto L_0x0275
            L_0x0188:
                r22 = r12
                r7 = r13
                boolean r8 = r5.mo61158L()
                if (r8 == 0) goto L_0x0265
                boolean r5 = r5.mo61157K()
                if (r5 == 0) goto L_0x0265
                er1.w3 r5 = er1.C58784w3.f168295a
                java.lang.String r8 = r2.getUserName()
                boolean r5 = r5.mo83899R0(r8)
                if (r5 != 0) goto L_0x01a4
                goto L_0x01c5
            L_0x01a4:
                boolean r5 = r2.isPostFinish()
                if (r5 == 0) goto L_0x01ab
                goto L_0x01c5
            L_0x01ab:
                boolean r5 = r2.isPostFailed()
                if (r5 == 0) goto L_0x01b2
                goto L_0x01c3
            L_0x01b2:
                boolean r5 = r2.isPostFinish()
                if (r5 != 0) goto L_0x01c5
                te3.tq2 r5 = r2.getPostInfo()
                int r5 = r5.f185649h
                r8 = 100
                if (r5 < r8) goto L_0x01c3
                goto L_0x01c5
            L_0x01c3:
                r5 = 0
                goto L_0x01c6
            L_0x01c5:
                r5 = 1
            L_0x01c6:
                if (r5 == 0) goto L_0x025d
                android.content.Intent r5 = new android.content.Intent
                r5.<init>()
                r8 = 2
                java.lang.String r9 = "key_topic_type"
                r5.putExtra(r9, r8)
                long r8 = r2.getId()
                java.lang.String r10 = "key_ref_object_id"
                r5.putExtra(r10, r8)
                java.lang.String r8 = "key_topic_title"
                r5.putExtra(r8, r3)
                te3.db1 r8 = r2.getLocation()
                byte[] r8 = r8.toByteArray()
                java.lang.String r9 = "key_topic_poi_location"
                r5.putExtra(r9, r8)
                rs1.s8$a r8 = rs1.C13442s8.f38060Q0
                android.content.Context r9 = r1.f173499A
                gy3.C87412m.m108593f(r9, r14)
                r26 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 252(0xfc, float:3.53E-43)
                r34 = 0
                r23 = r8
                r24 = r9
                r25 = r5
                rs1.C13442s8.C13443a.m12791e(r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34)
                di3.d r4 = di3.C86312j.m106911c(r4)
                er1.b r4 = (er1.C58684b) r4
                android.content.Context r9 = r1.f173499A
                gy3.C87412m.m108593f(r9, r14)
                r4.F50(r9, r5)
                android.content.Context r1 = r1.f173499A
                gy3.C87412m.m108593f(r1, r14)
                rs1.s8 r1 = r8.mo12873f(r1)
                if (r1 == 0) goto L_0x0275
                di3.d r0 = di3.C86312j.m106911c(r0)
                r8 = r0
                dp1.y0 r8 = (dp1.C58417y0) r8
                long r9 = r2.getId()
                if (r3 != 0) goto L_0x0237
                r11 = r22
                goto L_0x0238
            L_0x0237:
                r11 = r3
            L_0x0238:
                r12 = 2
                r13 = 0
                int r15 = r1.f38096i
                r8.Ax0(r9, r11, r12, r13, r15)
                int r0 = r1.f38091d
                r5.putExtra(r7, r0)
                r0 = 0
                r3 = 1
                r4 = 0
                df1.a r0 = ht1.C60172g4.C60173a.m70190b(r1, r4, r3, r0)
                if (r0 == 0) goto L_0x0275
                long r1 = r2.getId()
                df1.a$a r3 = new df1.a$a
                r4 = 14
                r3.<init>(r4, r1)
                r0.mo8766a(r3)
                goto L_0x0275
            L_0x025d:
                java.lang.String r0 = "Finder.FeedCommentHeaderConvert"
                java.lang.String r1 = "click poi but isPostOk false"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                goto L_0x0275
            L_0x0265:
                er1.w3 r0 = er1.C58784w3.f168295a
                android.content.Context r1 = r1.f173499A
                gy3.C87412m.m108593f(r1, r14)
                te3.db1 r2 = r2.getLocation()
                r3 = 5
                r4 = 1
                r0.mo83920c1(r1, r2, r4, r3)
            L_0x0275:
                java.lang.String r0 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPoi$1$4"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ve1.C14680x.C14687g.onClick(android.view.View):void");
        }
    }

    public C14680x(FinderCommentDrawerPresenter finderCommentDrawerPresenter, boolean z) {
        C87412m.m108594g(finderCommentDrawerPresenter, "presenter");
        this.f40601e = finderCommentDrawerPresenter;
        this.f40602f = z;
    }

    /* renamed from: j */
    public static final void m14017j(C14680x xVar, C49712hj1 hj12, FinderItem finderItem, long j) {
        String str;
        String str2;
        String str3;
        xVar.getClass();
        if (C31543z5.m39453c() - xVar.f40603g > 500) {
            xVar.f40603g = C31543z5.m39453c();
            FinderExtClinkExposeStruct finderExtClinkExposeStruct = new FinderExtClinkExposeStruct();
            finderExtClinkExposeStruct.f9796d = finderExtClinkExposeStruct.mo86045b("Feedid", C61926c.m72691p(finderItem.getId()), true);
            String str4 = "";
            if (hj12 == null || (str = hj12.f134670d) == null) {
                str = str4;
            }
            finderExtClinkExposeStruct.f9797e = finderExtClinkExposeStruct.mo86045b("SessionId", str, true);
            if (hj12 == null || (str2 = hj12.f134671e) == null) {
                str2 = str4;
            }
            finderExtClinkExposeStruct.f9798f = finderExtClinkExposeStruct.mo86045b("Contextid", str2, true);
            String str5 = finderItem.getExtReading().f183802d;
            if (str5 == null) {
                str5 = str4;
            }
            finderExtClinkExposeStruct.f9799g = finderExtClinkExposeStruct.mo86045b("Url", str5, true);
            finderExtClinkExposeStruct.f9800h = 1;
            finderExtClinkExposeStruct.f9801i = j;
            if (!(hj12 == null || (str3 = hj12.f134672f) == null)) {
                str4 = str3;
            }
            finderExtClinkExposeStruct.f9803k = finderExtClinkExposeStruct.mo86045b("clicktabcontextid", str4, true);
            finderExtClinkExposeStruct.f9804l = hj12 != null ? (long) hj12.f134675i : 0;
            finderExtClinkExposeStruct.f9805m = finderExtClinkExposeStruct.mo86045b("sessionBuffer", ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(finderItem.getId(), hj12 != null ? hj12.f134675i : 0), true);
            finderExtClinkExposeStruct.mo86054n();
        }
    }

    /* renamed from: a */
    public View mo13760a(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C65468g gVar = this.f40601e.f158622n;
        if (gVar != null) {
            return gVar.f188406n;
        }
        return null;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6236a;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        FinderCollapsibleTextView finderCollapsibleTextView = (FinderCollapsibleTextView) oVar.mo85812D(C0966R.C0970id.ki5);
        finderCollapsibleTextView.getContentTextView().setOnTouchListener(new C107029o(finderCollapsibleTextView.getContentTextView(), new C75355a0(oVar.f173499A)));
        finderCollapsibleTextView.getContentTextView().setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
        finderCollapsibleTextView.setLimitLine(this.f40601e.f158607J ? Integer.MAX_VALUE : 10);
        if (this.f40601e.f158607J) {
            finderCollapsibleTextView.getContentTextView().setSpacingAdd((int) oVar.f173499A.getResources().getDimension(C0966R.dimen.auz));
        }
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        C39818r rVar = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        C10786a1 a1Var = (C10786a1) rVar.mo62443b(context).mo75002a(C10786a1.class);
        a1Var.getClass();
        a1Var.mo11057G3(oVar);
    }

    /* renamed from: k */
    public final void mo13866k(Context context, FinderItem finderItem, boolean z) {
        C13598b0 b0Var;
        boolean z2;
        C64284cg bizInfo;
        String str;
        Context context2 = context;
        Class cls = C58417y0.class;
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0.Iy0((C58417y0) c, context, true, false, 1, z, 4, (Object) null);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(context2);
        int i = f != null ? f.f38096i : 0;
        if (i == 1 || i == 8 || i == 120) {
            Log.m105924i("Finder.FeedCommentHeaderConvert", "checkJumpProfile: hit SOURCE_PROFILE_TIMELINE, avatar can't click.");
            ((Activity) context2).finish();
            return;
        }
        FinderItem finderItem2 = (finderItem.getFeedObject().func_flag & 1) > 0 ? finderItem : null;
        if (finderItem2 == null || (bizInfo = finderItem2.getBizInfo()) == null) {
            z2 = true;
            b0Var = null;
        } else {
            String str2 = bizInfo.f182468d;
            if (str2 == null) {
                str2 = "";
            }
            Intent intent = new Intent();
            Intent intent2 = intent;
            C13442s8.C13443a.m12791e(aVar, context, intent, finderItem.getId(), (String) null, 0, 1, false, 0, 192, (Object) null);
            intent2.putExtra("Contact_User", str2);
            intent2.putExtra("Contact_Scene", JsApiCheckIsSupportFaceDetect.CTRL_INDEX);
            intent2.putExtra("biz_profile_enter_from_finder", true);
            intent2.putExtra("force_get_contact", true);
            intent2.putExtra("key_use_new_contact_profile", true);
            intent2.putExtra("finder_feed_id", finderItem.getId());
            String str3 = finderItem.getFeedObject().sessionBuffer;
            if (str3 == null || str3.length() == 0) {
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                long id = finderItem.getId();
                context2 = context;
                z2 = true;
                C13442s8 f2 = aVar.mo12873f(context2);
                str = y0Var.mo83281Cu(id, f2 != null ? f2.f38096i : 0);
            } else {
                context2 = context;
                z2 = true;
                str = finderItem.getFeedObject().sessionBuffer;
            }
            intent2.putExtra("Contact_Scene_Note", str);
            intent2.putExtra("biz_profile_tab_type", z2 ? 1 : 0);
            C88144b.m109791i(context2, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Intent intent3 = new Intent();
            intent3.putExtra("finder_username", finderItem.getUserName());
            intent3.putExtra("finder_read_feed_id", finderItem.getId());
            if (!(context2 instanceof FinderShareFeedRelUI) && !(context2 instanceof FinderShareFeedDetailUI) && !(context2 instanceof FinderMsgFeedDetailUI)) {
                intent3.putExtra("KEY_FROM_TIMELINE", z2);
            }
            C13442s8.C13443a.m12791e(aVar, context, intent3, finderItem.getId(), (String) null, 0, 1, false, 0, 192, (Object) null);
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context2, intent3);
        }
    }

    /* renamed from: l */
    public SpannableString mo2481l(C55034v vVar) {
        C87412m.m108594g(vVar, "item");
        return vVar.f154508w.createDescriptionFullSpan2();
    }

    /* renamed from: m */
    public final boolean mo13867m() {
        if (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            C50687oi1 oi12 = C66785b.f191882e.mo90673n0().mo62397b().f140461E;
            return oi12 != null && oi12.f139196d == 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0136, code lost:
        if (r13 == null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013f, code lost:
        if (r13 == null) goto L_0x0141;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x05bd  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x05c0  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x05d0  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x05db  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x05f0  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x05fb  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x066a  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x066f  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r26, cm1.C55034v r27, int r28, int r29, boolean r30, java.util.List<java.lang.Object> r31) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r2, r4)
            android.view.View r4 = r1.f44854d
            r5 = 2131310273(0x7f0936c1, float:1.8238853E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 1
            r6 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10 = 2
            if (r4 != 0) goto L_0x002e
            goto L_0x0100
        L_0x002e:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r2.f154508w
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.getFeedObject()
            int r11 = r11.func_flag
            r11 = r11 & r5
            if (r11 <= 0) goto L_0x004c
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r2.f154508w
            te3.cg r11 = r11.getBizInfo()
            if (r11 == 0) goto L_0x0045
            java.lang.String r11 = r11.f182469e
            if (r11 != 0) goto L_0x0052
        L_0x0045:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r2.f154508w
            java.lang.String r11 = r11.getNickName()
            goto L_0x0052
        L_0x004c:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r2.f154508w
            java.lang.String r11 = r11.getNickName()
        L_0x0052:
            java.lang.String r12 = "if (item.feed.feedObject…       item.feed.nickName"
            gy3.C87412m.m108593f(r11, r12)
            ve1.i r12 = ve1.C65604i.f188772a
            java.lang.Class<ny.h> r13 = p629ny.C76979h.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            ny.h r13 = (p629ny.C76979h) r13
            android.content.Context r14 = r1.f173499A
            android.text.SpannableString r11 = r13.mo107057T1(r14, r11)
            java.lang.String r13 = "getService(ISpannableSer…holder.context, nickname)"
            gy3.C87412m.m108593f(r11, r13)
            r12.mo89687m(r4, r11)
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r2.f154508w
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r11.contact
            if (r11 == 0) goto L_0x00f8
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r2.f154508w
            com.tencent.mm.protocal.protobuf.FinderObject r12 = r12.getFeedObject()
            int r12 = r12.func_flag
            r12 = r12 & r5
            r13 = 2131297406(0x7f09047e, float:1.8212756E38)
            if (r12 <= 0) goto L_0x00c8
            android.view.View r11 = r1.mo85812D(r13)
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            r12.mo10233c(r7)
            java.lang.Object[] r15 = r12.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert"
            java.lang.String r17 = "refreshNickName"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r11
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r12 = r12.mo10231a(r8)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.setVisibility(r12)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert"
            java.lang.String r16 = "refreshNickName"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x00f8
        L_0x00c8:
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r12 = r11.authInfo
            if (r12 == 0) goto L_0x00cf
            int r12 = r12.authIconType
            goto L_0x00d0
        L_0x00cf:
            r12 = 0
        L_0x00d0:
            er1.w3 r14 = er1.C58784w3.f168295a
            android.view.View r15 = r1.mo85812D(r13)
            java.lang.String r6 = "holder.getView<ImageView>(R.id.auth_icon)"
            gy3.C87412m.m108593f(r15, r6)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r6 = r11.authInfo
            r17 = 0
            r18 = 0
            r19 = 12
            r20 = 0
            r16 = r6
            er1.C58784w3.m68429F1(r14, r15, r16, r17, r18, r19, r20)
            if (r12 == r5) goto L_0x00f5
            if (r12 == r10) goto L_0x00f1
            goto L_0x00f8
        L_0x00f1:
            r1.mo85817I(r13, r8)
            goto L_0x00f8
        L_0x00f5:
            r1.mo85817I(r13, r8)
        L_0x00f8:
            ve1.e0 r6 = new ve1.e0
            r6.<init>(r1, r2, r0)
            r4.setOnClickListener(r6)
        L_0x0100:
            java.lang.Class<pl1.s0> r4 = pl1.C11990s0.class
            r6 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r6 = r1.mo85812D(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            java.lang.String r11 = ""
            r12 = 0
            if (r6 != 0) goto L_0x0111
            goto L_0x017a
        L_0x0111:
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r2.f154508w
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.getFeedObject()
            int r13 = r13.func_flag
            r13 = r13 & r5
            if (r13 <= 0) goto L_0x0139
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r2.f154508w
            te3.cg r13 = r13.getBizInfo()
            if (r13 == 0) goto L_0x0128
            java.lang.String r13 = r13.f182470f
            if (r13 != 0) goto L_0x0142
        L_0x0128:
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r2.f154508w
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r13 = r13.contact
            if (r13 == 0) goto L_0x0135
            java.lang.String r13 = r13.headUrl
            goto L_0x0136
        L_0x0135:
            r13 = r12
        L_0x0136:
            if (r13 != 0) goto L_0x0142
            goto L_0x0141
        L_0x0139:
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r2.f154508w
            java.lang.String r13 = r13.getAvatarUrl()
            if (r13 != 0) goto L_0x0142
        L_0x0141:
            r13 = r11
        L_0x0142:
            bl3.r r14 = bl3.C39818r.f106831a
            bl3.r$a r15 = r14.mo62446e(r3)
            bl3.c r15 = r15.mo62447c(r4)
            pl1.s0 r15 = (pl1.C11990s0) r15
            k60.d r15 = r15.mo11872i2()
            pl1.f r5 = new pl1.f
            r5.<init>(r13, r12, r10, r12)
            pl1.e0$a r10 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r13 = r14.mo62446e(r3)
            bl3.c r4 = r13.mo62447c(r4)
            pl1.s0 r4 = (pl1.C11990s0) r4
            n60.f r4 = r4.mo11867O2(r10)
            r15.mo85957c(r5, r6, r4)
            ve1.z r4 = new ve1.z
            r4.<init>(r1, r2, r0)
            r6.setOnClickListener(r4)
            ve1.a0 r4 = new ve1.a0
            r4.<init>(r1, r2)
            zp3.C23564m.m28138h(r6, r4)
        L_0x017a:
            r4 = 2131315111(0x7f0949a7, float:1.8248666E38)
            android.view.View r4 = r1.mo85812D(r4)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r4 = (com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView) r4
            r5 = 2131312496(0x7f093f70, float:1.8243362E38)
            android.view.View r15 = r1.mo85812D(r5)
            android.text.SpannableString r5 = new android.text.SpannableString
            android.text.SpannableString r6 = r0.mo2481l(r2)
            r5.<init>(r6)
            if (r4 != 0) goto L_0x0196
            goto L_0x01a8
        L_0x0196:
            int r6 = r5.length()
            if (r6 != 0) goto L_0x019e
            r6 = 1
            goto L_0x019f
        L_0x019e:
            r6 = 0
        L_0x019f:
            if (r6 == 0) goto L_0x01a4
            r6 = 8
            goto L_0x01a5
        L_0x01a4:
            r6 = 0
        L_0x01a5:
            r4.setVisibility(r6)
        L_0x01a8:
            boolean r6 = r2.f154509x
            r4.setCollapse(r6)
            boolean r6 = r25.mo13867m()
            r10 = 2131100738(0x7f060442, float:1.7813866E38)
            if (r6 != 0) goto L_0x01c8
            boolean r6 = r0.f40602f
            if (r6 == 0) goto L_0x01bb
            goto L_0x01c8
        L_0x01bb:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r10)
            goto L_0x01d7
        L_0x01c8:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r13 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r6 = r6.getColor(r13)
        L_0x01d7:
            boolean r13 = r25.mo13867m()
            if (r13 != 0) goto L_0x01f2
            boolean r13 = r0.f40602f
            if (r13 == 0) goto L_0x01e2
            goto L_0x01f2
        L_0x01e2:
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131101017(0x7f060559, float:1.7814432E38)
            int r13 = r13.getColor(r14)
            goto L_0x0201
        L_0x01f2:
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r13 = r13.getColor(r14)
        L_0x0201:
            int r14 = r5.length()
            java.lang.Class<de3.b0> r12 = de3.C75359b0.class
            java.lang.Object[] r12 = r5.getSpans(r8, r14, r12)
            de3.b0[] r12 = (de3.C75359b0[]) r12
            if (r12 == 0) goto L_0x023a
            int r14 = r12.length
        L_0x0210:
            if (r8 >= r14) goto L_0x023a
            r10 = r12[r8]
            r10.setColor(r6, r13)
            boolean r16 = r25.mo13867m()
            r18 = r6
            r17 = 1
            r6 = r16 ^ 1
            r10.setEnable(r6)
            boolean r6 = r10 instanceof com.tencent.p014mm.plugin.finder.view.C4059g5
            if (r6 == 0) goto L_0x0232
            com.tencent.mm.plugin.finder.view.g5 r10 = (com.tencent.p014mm.plugin.finder.view.C4059g5) r10
            boolean r6 = r25.mo13867m()
            r6 = r6 ^ 1
            r10.f18183h = r6
        L_0x0232:
            int r8 = r8 + 1
            r6 = r18
            r10 = 2131100738(0x7f060442, float:1.7813866E38)
            goto L_0x0210
        L_0x023a:
            r16 = 0
            r17 = 4
            r18 = 0
            r13 = r4
            r14 = r5
            com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView.m19531a(r13, r14, r15, r16, r17, r18)
            android.content.Context r6 = r1.f173499A
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131100738(0x7f060442, float:1.7813866E38)
            int r6 = r6.getColor(r8)
            r4.setExpandTextColor(r6)
            ve1.b0 r6 = new ve1.b0
            r6.<init>(r2, r1, r0)
            r4.setOnCollapse(r6)
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x0265
            r6 = 1
            goto L_0x0266
        L_0x0265:
            r6 = 0
        L_0x0266:
            if (r6 == 0) goto L_0x0274
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r2.f154508w
            long r12 = r6.field_id
            yp1.a r6 = new yp1.a
            r6.<init>(r5, r4, r12)
            zp3.C23564m.m28138h(r4, r6)
        L_0x0274:
            r25.mo2483o(r26, r27)
            r25.mo2485r(r26, r27)
            r25.mo2484q(r26, r27)
            android.view.View r4 = r1.f44854d
            r5 = 2131300374(0x7f091016, float:1.8218776E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.f154508w
            int r5 = r5.getCreateTime()
            if (r5 <= 0) goto L_0x02a9
            r5 = 0
            r4.setVisibility(r5)
            android.content.Context r5 = r1.f173499A
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r2.f154508w
            int r6 = r6.getCreateTime()
            long r12 = (long) r6
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r14
            java.lang.String r5 = er1.C7878t0.m8037f(r5, r12)
            r4.setText(r5)
            goto L_0x02ae
        L_0x02a9:
            r5 = 8
            r4.setVisibility(r5)
        L_0x02ae:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r2.f154508w
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            if (r4 == 0) goto L_0x02c0
            te3.uq0 r4 = r4.ip_region_info
            if (r4 == 0) goto L_0x02c0
            java.lang.String r4 = r4.f143030d
            if (r4 != 0) goto L_0x02bf
            goto L_0x02c0
        L_0x02bf:
            r11 = r4
        L_0x02c0:
            r4 = 2131306567(0x7f092847, float:1.8231337E38)
            android.view.View r4 = r1.mo85812D(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            up1.f r5 = up1.C37521f.f99374d
            r5.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99181G7
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r6 = 1
            if (r5 != r6) goto L_0x02f1
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r5 != 0) goto L_0x02f1
            if (r4 != 0) goto L_0x02e6
            goto L_0x02ea
        L_0x02e6:
            r5 = 0
            r4.setVisibility(r5)
        L_0x02ea:
            if (r4 != 0) goto L_0x02ed
            goto L_0x02f3
        L_0x02ed:
            r4.setText(r11)
            goto L_0x02f3
        L_0x02f1:
            if (r4 != 0) goto L_0x02f6
        L_0x02f3:
            r5 = 8
            goto L_0x02fb
        L_0x02f6:
            r5 = 8
            r4.setVisibility(r5)
        L_0x02fb:
            java.lang.Class<ht1.v4> r4 = ht1.C8808v4.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ht1.v4 r4 = (ht1.C8808v4) r4
            boolean r4 = r4.mo9635e()
            r6 = 2131302724(0x7f091944, float:1.8223542E38)
            r8 = 2131302715(0x7f09193b, float:1.8223524E38)
            if (r4 == 0) goto L_0x0393
            android.view.View r4 = r1.mo85812D(r8)
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r8.mo10233c(r7)
            java.lang.Object[] r11 = r8.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert"
            java.lang.String r13 = "refreshCloseCommentTips"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r4
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            r10 = 0
            java.lang.Object r8 = r8.mo10231a(r10)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.setVisibility(r8)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert"
            java.lang.String r12 = "refreshCloseCommentTips"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r10 = r4
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.view.View r4 = r1.mo85812D(r6)
            k20.a r6 = new k20.a
            r6.<init>()
            r6.mo10233c(r9)
            java.lang.Object[] r18 = r6.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert"
            java.lang.String r20 = "refreshCloseCommentTips"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r4
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r8 = 0
            java.lang.Object r6 = r6.mo10231a(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setVisibility(r6)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert"
            java.lang.String r19 = "refreshCloseCommentTips"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0434
        L_0x0393:
            er1.w3 r4 = er1.C58784w3.f168295a
            boolean r10 = r4.mo83889N0()
            android.view.View r8 = r1.mo85812D(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x03f3
            android.content.Context r11 = r1.f173499A
            java.lang.String r12 = "holder.context"
            gy3.C87412m.m108593f(r11, r12)
            boolean r4 = r4.mo83900S0(r11)
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r2.f154508w
            boolean r11 = r11.isCommentClose()
            if (r11 != 0) goto L_0x03bc
            if (r4 == 0) goto L_0x03b9
            if (r10 != 0) goto L_0x03b9
            goto L_0x03bc
        L_0x03b9:
            r11 = 8
            goto L_0x03bd
        L_0x03bc:
            r11 = 0
        L_0x03bd:
            r8.setVisibility(r11)
            r11 = 2131826317(0x7f11168d, float:1.9285515E38)
            if (r10 != 0) goto L_0x03e4
            if (r4 == 0) goto L_0x03d7
            android.content.Context r4 = r8.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r10 = 2131826316(0x7f11168c, float:1.9285513E38)
            java.lang.String r4 = r4.getString(r10)
            goto L_0x03f0
        L_0x03d7:
            android.content.Context r4 = r8.getContext()
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getString(r11)
            goto L_0x03f0
        L_0x03e4:
            android.content.Context r4 = r8.getContext()
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getString(r11)
        L_0x03f0:
            r8.setText(r4)
        L_0x03f3:
            android.view.View r4 = r1.mo85812D(r6)
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r6.mo10233c(r7)
            java.lang.Object[] r11 = r6.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert"
            java.lang.String r13 = "refreshCloseCommentTips"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r4
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            r8 = 0
            java.lang.Object r6 = r6.mo10231a(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setVisibility(r6)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert"
            java.lang.String r12 = "refreshCloseCommentTips"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x0434:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r2.f154508w
            r6 = 0
            r0.mo13868p(r1, r4, r6)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r4 = r0.f40601e
            boolean r4 = r4.f158607J
            if (r4 != 0) goto L_0x044a
            android.view.View r4 = r1.f44854d
            ve1.c0 r6 = new ve1.c0
            r6.<init>(r0, r1)
            r4.post(r6)
        L_0x044a:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r2.f154508w
            long r10 = r4.field_id
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            int r4 = r4.adFlag
            bl3.r r6 = bl3.C39818r.f106831a
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r8 = r0.f40601e
            android.content.Context r8 = r8.f158615d
            bl3.r$a r8 = r6.mo62443b(r8)
            java.lang.Class<rs1.s8> r12 = rs1.C13442s8.class
            androidx.lifecycle.i0 r8 = r8.mo75002a(r12)
            rs1.s8 r8 = (rs1.C13442s8) r8
            int r8 = r8.f38096i
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r12 = r0.f40601e
            android.content.Context r12 = r12.f158615d
            java.lang.String r13 = "context"
            gy3.C87412m.m108594g(r12, r13)
            r13 = 0
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x04ed
            if (r4 == 0) goto L_0x04ed
            if (r8 != 0) goto L_0x047d
            goto L_0x04ed
        L_0x047d:
            bl3.r$a r3 = r6.mo62446e(r3)
            java.lang.Class<pf1.n> r4 = pf1.C62273n.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            pf1.n r3 = (pf1.C62273n) r3
            boolean r4 = r12 instanceof androidx.lifecycle.C0125s
            if (r4 == 0) goto L_0x048f
            androidx.lifecycle.s r12 = (androidx.lifecycle.C0125s) r12
        L_0x048f:
            androidx.lifecycle.z r3 = r3.mo87341g3(r10, r8)
            java.lang.Object r3 = r3.getValue()
            java.util.Set r3 = (java.util.Set) r3
            if (r3 == 0) goto L_0x04ed
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x04a4:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x04c3
            java.lang.Object r6 = r3.next()
            r8 = r6
            pf1.l r8 = (pf1.C11911l) r8
            int r8 = r8.f34805c
            r10 = 6
            if (r8 == r10) goto L_0x04bc
            r10 = 7
            if (r8 != r10) goto L_0x04ba
            goto L_0x04bc
        L_0x04ba:
            r8 = 0
            goto L_0x04bd
        L_0x04bc:
            r8 = 1
        L_0x04bd:
            if (r8 == 0) goto L_0x04a4
            r4.add(r6)
            goto L_0x04a4
        L_0x04c3:
            java.util.Iterator r3 = r4.iterator()
        L_0x04c7:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04ed
            java.lang.Object r4 = r3.next()
            pf1.l r4 = (pf1.C11911l) r4
            java.util.List<com.tencent.mm.protocal.protobuf.FinderJumpInfo> r4 = r4.f34806d
            java.util.Iterator r4 = r4.iterator()
        L_0x04d9:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x04c7
            java.lang.Object r6 = r4.next()
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r6 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r6
            int r8 = r6.business_type
            r10 = 21
            if (r8 != r10) goto L_0x04d9
            r12 = r6
            goto L_0x04ee
        L_0x04ed:
            r12 = 0
        L_0x04ee:
            vd1.b r3 = vd1.C65584b.f188718a
            rx3.l r3 = r3.mo89659b(r12)
            er1.w3 r4 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r6 = r0.f40601e
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo77342u()
            java.lang.String r6 = r6.getUserName()
            boolean r4 = r4.mo83899R0(r6)
            A r3 = r3.f38555d
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r6 = 1
            if (r3 != r6) goto L_0x0513
            if (r4 == 0) goto L_0x0513
            r3 = 1
            goto L_0x0514
        L_0x0513:
            r3 = 0
        L_0x0514:
            r4 = 2131309513(0x7f0933c9, float:1.8237312E38)
            if (r3 == 0) goto L_0x0565
            android.view.View r3 = r1.mo85812D(r4)
            if (r3 == 0) goto L_0x05a9
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r4.mo10233c(r9)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert"
            java.lang.String r16 = "refreshMoreView"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r3
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            r6 = 0
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert"
            java.lang.String r15 = "refreshMoreView"
            java.lang.String r16 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            ve1.d0 r4 = new ve1.d0
            r4.<init>(r0, r1, r2, r12)
            r3.setOnClickListener(r4)
            goto L_0x05a9
        L_0x0565:
            android.view.View r3 = r1.mo85812D(r4)
            if (r3 != 0) goto L_0x056c
            goto L_0x05a9
        L_0x056c:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r4.mo10233c(r7)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert"
            java.lang.String r16 = "refreshMoreView"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r3
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            r6 = 0
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert"
            java.lang.String r15 = "refreshMoreView"
            java.lang.String r16 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x05a9:
            android.view.View r3 = r1.f44854d
            ve1.x$a r4 = ve1.C14680x.C14681a.f40604d
            r3.setOnLongClickListener(r4)
            r3 = 2131300000(0x7f090ea0, float:1.8218017E38)
            android.view.View r3 = r1.mo85812D(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            boolean r4 = r2.f154510y
            if (r4 == 0) goto L_0x05c0
            r4 = 17
            goto L_0x05c2
        L_0x05c0:
            r4 = 48
        L_0x05c2:
            r3.setGravity(r4)
            int r4 = r3.getPaddingLeft()
            boolean r6 = r2.f154510y
            r7 = 2131165324(0x7f07008c, float:1.7944862E38)
            if (r6 == 0) goto L_0x05db
            android.content.Context r6 = r1.f173499A
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getDimensionPixelOffset(r7)
            goto L_0x05e8
        L_0x05db:
            android.content.Context r6 = r1.f173499A
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131165307(0x7f07007b, float:1.7944827E38)
            int r6 = r6.getDimensionPixelOffset(r8)
        L_0x05e8:
            int r8 = r3.getPaddingRight()
            boolean r9 = r2.f154510y
            if (r9 == 0) goto L_0x05fb
            android.content.Context r9 = r1.f173499A
            android.content.res.Resources r9 = r9.getResources()
            int r7 = r9.getDimensionPixelOffset(r7)
            goto L_0x0608
        L_0x05fb:
            android.content.Context r7 = r1.f173499A
            android.content.res.Resources r7 = r7.getResources()
            r9 = 2131165337(0x7f070099, float:1.7944888E38)
            int r7 = r7.getDimensionPixelOffset(r9)
        L_0x0608:
            r3.setPadding(r4, r6, r8, r7)
            r3 = 2131302865(0x7f0919d1, float:1.8223828E38)
            android.view.View r3 = r1.mo85812D(r3)
            if (r3 != 0) goto L_0x0615
            goto L_0x065e
        L_0x0615:
            boolean r4 = r2.f154510y
            if (r4 == 0) goto L_0x061c
            r6 = 8
            goto L_0x061d
        L_0x061c:
            r6 = 0
        L_0x061d:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4.mo10233c(r5)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert"
            java.lang.String r9 = "onBindViewHolder"
            java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;IIZLjava/util/List;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r3
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert"
            java.lang.String r8 = "onBindViewHolder"
            java.lang.String r9 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;IIZLjava/util/List;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
        L_0x065e:
            vp1.e r3 = vp1.C65834e.f189316a
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r2.f154508w
            long r4 = r4.field_id
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo89871e(r4)
            if (r3 == 0) goto L_0x066f
            int r2 = r3.getCommentCount()
            goto L_0x0675
        L_0x066f:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f154508w
            int r2 = r2.getCommentCount()
        L_0x0675:
            r3 = 2131315561(0x7f094b69, float:1.8249579E38)
            android.view.View r3 = r1.mo85812D(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x069d
            android.content.Context r1 = r1.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131826815(0x7f11187f, float:1.9286525E38)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r5[r6] = r2
            java.lang.String r1 = r1.getString(r4, r5)
            r3.setText(r1)
            er1.C7919x.m8091a(r3)
        L_0x069d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14680x.mo44e(jq3.o, cm1.v, int, int, boolean, java.util.List):void");
    }

    /* renamed from: o */
    public void mo2483o(C60905o oVar, C55034v vVar) {
        C60905o oVar2 = oVar;
        C55034v vVar2 = vVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(vVar2, "item");
        FinderObjectDesc finderObjectDesc = vVar2.f154508w.getFeedObject().objectDesc;
        C49277ef1 ef12 = finderObjectDesc != null ? finderObjectDesc.event : null;
        if (ef12 == null) {
            View D = oVar2.mo85812D(C0966R.C0970id.f5487gh);
            if (D != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (Util.isNullOrNil(ef12.f132899e)) {
            View D2 = oVar2.mo85812D(C0966R.C0970id.f5487gh);
            if (D2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view = D2;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View D3 = oVar2.mo85812D(C0966R.C0970id.f5487gh);
            if (D3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view2 = D3;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D4 = oVar2.mo85812D(C0966R.C0970id.f5487gh);
            if (D4 != null) {
                if (!vVar2.f154508w.isPostFinish() || mo13867m()) {
                    D4.setOnClickListener((View.OnClickListener) null);
                } else {
                    D4.setOnClickListener(new C14682b(ef12, vVar2, oVar2));
                }
            }
            WeImageView weImageView = (WeImageView) oVar2.mo85812D(C0966R.C0970id.f5486gg);
            if (weImageView != null) {
                weImageView.setIconColor(mo13867m() ? MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_1) : MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2960ag));
            }
            TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.f5529hi);
            if (textView != null) {
                StringBuilder sb = new StringBuilder();
                C7832m3 m3Var = C7832m3.f26372a;
                Context context = textView.getContext();
                C87412m.m108593f(context, "it.context");
                sb.append(m3Var.mo8939g(ef12, context));
                sb.append(ef12.f132899e);
                String sb4 = sb.toString();
                int color = mo13867m() ? MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_1) : MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3459zq);
                textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), sb4));
                textView.setTextColor(color);
            }
        }
    }

    /* renamed from: p */
    public final void mo13868p(C60905o oVar, FinderItem finderItem, boolean z) {
        C39818r rVar = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        C39622i0 a = rVar.mo62443b(context).mo75002a(C10786a1.class);
        C87412m.m108593f(a, "UICProvider.of(holder.co…eedJumperUIC::class.java)");
        C10786a1 a1Var = (C10786a1) a;
        if (C10846o0.m10834o3(a1Var, C15585f.f42211a.mo14348k(finderItem), oVar, FFmpegMetadataRetriever.METADATA_KEY_COMMENT, z, (C11929x) null, 16, (Object) null) == 0) {
            ViewGroup viewGroup = (ViewGroup) oVar.mo85812D(C0966R.C0970id.n8e);
            if (viewGroup != null) {
                viewGroup.setPadding(0, 0, 0, 0);
            }
            View D = oVar.mo85812D(C0966R.C0970id.n7y);
            if (D != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = D;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshFeedJumper", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshFeedJumper", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        a1Var.mo11061f3(oVar, new C10871u0(oVar, a1Var));
    }

    /* renamed from: q */
    public void mo2484q(C60905o oVar, C55034v vVar) {
        C60905o oVar2 = oVar;
        C55034v vVar2 = vVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(vVar2, "item");
        View D = oVar2.mo85812D(C0966R.C0970id.fow);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = D;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshLink", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshLink", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C64472jk0 extReading = vVar2.f154508w.getExtReading();
        if (!Util.isNullOrNil(extReading.f183802d) && !Util.isNullOrNil(extReading.f183803e)) {
            String str = extReading.f183802d;
            String str2 = extReading.f183803e;
            TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.fox);
            oVar2.mo85815G(C0966R.C0970id.fox, str2);
            Log.m105924i("Finder.FeedCommentHeaderConvert", "link " + str + ", title " + extReading.f183803e);
            D.post(new C14683c(D, oVar2, textView, str2));
            WeImageView weImageView = (WeImageView) oVar2.mo85812D(C0966R.C0970id.fov);
            int i = extReading.f183805g;
            if (i == 0) {
                weImageView.setImageResource(C0966R.raw.icons_filled_link);
                weImageView.setIconColor(oVar2.f173499A.getResources().getColor(C0966R.color.f2939n));
            } else if (i == 1) {
                weImageView.setImageResource(C0966R.raw.icons_filled_finder_red_envelope);
                weImageView.setIconColor(oVar2.f173499A.getResources().getColor(C0966R.color.ams));
            }
            C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
            Context context = oVar2.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13442s8 f = aVar2.mo12873f(context);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            C23564m.m28138h(D, new C14684d(this, q3, vVar2));
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view2 = D;
            C49712hj1 hj12 = q3;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshLink", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshLink", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (weImageView != null && mo13867m()) {
                weImageView.setIconColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_1));
            }
            if (textView != null && mo13867m()) {
                textView.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_1));
            }
            if (!mo13867m()) {
                textView.setOnClickListener(new C14685e(this, oVar, vVar, str, hj12));
            }
        }
    }

    /* renamed from: r */
    public void mo2485r(C60905o oVar, C55034v vVar) {
        C60905o oVar2 = oVar;
        C55034v vVar2 = vVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(vVar2, "item");
        C64311db1 location = vVar2.f154508w.getLocation();
        View D = oVar2.mo85812D(C0966R.C0970id.hzg);
        WeImageView weImageView = (WeImageView) oVar2.mo85812D(C0966R.C0970id.hyf);
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.hyn);
        String l0 = C58784w3.f168295a.mo83946l0(location.f182663f, location.f182664g);
        if (Util.isNullOrNil(l0)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = D;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshPoi", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshPoi", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            textView.setText(l0);
            textView.post(new C14686f(D, oVar2, textView, l0));
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(D, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshPoi", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert", "refreshPoi", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (weImageView != null && mo13867m()) {
                weImageView.setIconColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_1));
            }
            if (mo13867m()) {
                textView.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_1));
            }
            if (!mo13867m()) {
                textView.setOnClickListener(new C14687g(this, oVar2, vVar2, l0));
                return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14680x(FinderCommentDrawerPresenter finderCommentDrawerPresenter, boolean z, int i, C8480h hVar) {
        this(finderCommentDrawerPresenter, (i & 2) != 0 ? false : z);
    }
}
