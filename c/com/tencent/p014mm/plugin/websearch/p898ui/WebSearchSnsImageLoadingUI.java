package com.tencent.p014mm.plugin.websearch.p898ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsImageDownloadedEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import kv1.C99252h;
import o40.C61926c;
import p823sg.C90193h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk2.C101643c;
import sk2.C101645e;
import sk2.C101648g;
import te3.C101804kv2;
import te3.C48884bn2;
import te3.C64421he;
import te3.C64852yd;
import u73.C101987v0;
import u73.C22613h1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/websearch/ui/WebSearchSnsImageLoadingUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ui-websearch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI */
public final class WebSearchSnsImageLoadingUI extends MMActivity {

    /* renamed from: t */
    public static final /* synthetic */ int f282862t = 0;

    /* renamed from: d */
    public final String f282863d = "MicroMsg.WebSearch.WebSearchSnsImageLoadingUI";

    /* renamed from: e */
    public int f282864e;

    /* renamed from: f */
    public long f282865f;

    /* renamed from: g */
    public String f282866g = "";

    /* renamed from: h */
    public int f282867h;

    /* renamed from: i */
    public int f282868i;

    /* renamed from: j */
    public boolean f282869j = true;

    /* renamed from: n */
    public String f282870n = "";

    /* renamed from: o */
    public C101804kv2 f282871o;

    /* renamed from: p */
    public String f282872p = "";

    /* renamed from: q */
    public boolean f282873q;

    /* renamed from: r */
    public final C13601g f282874r = C36568h.m40985a(new C96616e(this));

    /* renamed from: s */
    public long f282875s;

    /* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$a */
    public static final class C72595a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ WebSearchSnsImageLoadingUI f211200d;

        public C72595a(WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI) {
            this.f211200d = webSearchSnsImageLoadingUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f211200d.finish();
            WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI = this.f211200d;
            webSearchSnsImageLoadingUI.mo134709H7(11, "", webSearchSnsImageLoadingUI.f282866g, 0, System.currentTimeMillis());
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$b */
    public static final class C72596b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WebSearchSnsImageLoadingUI f211201d;

        public C72596b(WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI) {
            this.f211201d = webSearchSnsImageLoadingUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/websearch/ui/WebSearchSnsImageLoadingUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((MMAnimateView) this.f211201d.findViewById(C0966R.C0970id.g3d)).setVisibility(0);
            ((TextView) this.f211201d.findViewById(C0966R.C0970id.g3r)).setVisibility(0);
            ((TextView) this.f211201d.findViewById(C0966R.C0970id.f357940cl1)).setVisibility(8);
            ((Button) this.f211201d.findViewById(C0966R.C0970id.cks)).setVisibility(8);
            WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI = this.f211201d;
            webSearchSnsImageLoadingUI.mo134710I7(webSearchSnsImageLoadingUI.f282872p);
            C117292a.m165361g(this, "com/tencent/mm/plugin/websearch/ui/WebSearchSnsImageLoadingUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$c */
    public static final class C72597c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WebSearchSnsImageLoadingUI f211202d;

        public C72597c(WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI) {
            this.f211202d = webSearchSnsImageLoadingUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/websearch/ui/WebSearchSnsImageLoadingUI$onError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f211202d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/websearch/ui/WebSearchSnsImageLoadingUI$onError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$d */
    public static final class C96615d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WebSearchSnsImageLoadingUI f282876d;

        /* renamed from: e */
        public final /* synthetic */ int f282877e;

        /* renamed from: f */
        public final /* synthetic */ String f282878f;

        /* renamed from: g */
        public final /* synthetic */ String f282879g;

        /* renamed from: h */
        public final /* synthetic */ int f282880h;

        /* renamed from: i */
        public final /* synthetic */ long f282881i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96615d(WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI, int i, String str, String str2, int i2, long j) {
            super(0);
            this.f282876d = webSearchSnsImageLoadingUI;
            this.f282877e = i;
            this.f282878f = str;
            this.f282879g = str2;
            this.f282880h = i2;
            this.f282881i = j;
        }

        public Object invoke() {
            int intExtra = this.f282876d.getIntent().getIntExtra("key_source", 0);
            ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new ChatImageWebSearchActionStruct();
            chatImageWebSearchActionStruct.mo126609u(this.f282876d.f282870n);
            chatImageWebSearchActionStruct.f265370f = intExtra;
            chatImageWebSearchActionStruct.f265369e = this.f282877e;
            switch (intExtra) {
                case 11:
                case 12:
                case 13:
                case 14:
                    chatImageWebSearchActionStruct.f265371g = 83;
                    break;
                case 15:
                case 16:
                    chatImageWebSearchActionStruct.f265371g = this.f282876d.f282867h;
                    break;
                case 17:
                    chatImageWebSearchActionStruct.f265371g = this.f282876d.f282867h;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                    chatImageWebSearchActionStruct.f265371g = 100;
                    break;
                default:
                    chatImageWebSearchActionStruct.f265371g = 81;
                    break;
            }
            chatImageWebSearchActionStruct.mo126608t("");
            chatImageWebSearchActionStruct.mo126607s("");
            chatImageWebSearchActionStruct.mo126611w(this.f282878f);
            chatImageWebSearchActionStruct.mo126610v(C90193h.m112876d(this.f282879g));
            chatImageWebSearchActionStruct.f265378n = this.f282880h;
            chatImageWebSearchActionStruct.f265377m = this.f282881i;
            chatImageWebSearchActionStruct.mo86054n();
            C22613h1.m26490p(chatImageWebSearchActionStruct);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$e */
    public static final class C96616e extends C87413o implements C32224a<WebSearchSnsImageLoadingUI$snsImageDownloadListener$2$1> {

        /* renamed from: d */
        public final /* synthetic */ WebSearchSnsImageLoadingUI f282882d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96616e(WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI) {
            super(0);
            this.f282882d = webSearchSnsImageLoadingUI;
        }

        public Object invoke() {
            return new WebSearchSnsImageLoadingUI$snsImageDownloadListener$2$1(this.f282882d, C40008f.f107254d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$f */
    public static final class C96617f implements C101648g {

        /* renamed from: a */
        public final /* synthetic */ WebSearchSnsImageLoadingUI f282883a;

        /* renamed from: b */
        public final /* synthetic */ String f282884b;

        /* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$f$a */
        public static final class C96618a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ WebSearchSnsImageLoadingUI f282885d;

            public C96618a(WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI) {
                this.f282885d = webSearchSnsImageLoadingUI;
            }

            public final void run() {
                this.f282885d.finish();
            }
        }

        /* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$f$b */
        public static final class C96619b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ WebSearchSnsImageLoadingUI f282886d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C96619b(WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI) {
                super(0);
                this.f282886d = webSearchSnsImageLoadingUI;
            }

            public Object invoke() {
                ((MMAnimateView) this.f282886d.findViewById(C0966R.C0970id.g3d)).setVisibility(8);
                ((TextView) this.f282886d.findViewById(C0966R.C0970id.g3r)).setVisibility(8);
                ((TextView) this.f282886d.findViewById(C0966R.C0970id.f357940cl1)).setVisibility(0);
                ((TextView) this.f282886d.findViewById(C0966R.C0970id.cks)).setVisibility(0);
                return C13598b0.f38549a;
            }
        }

        public C96617f(WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI, String str) {
            this.f282883a = webSearchSnsImageLoadingUI;
            this.f282884b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0081, code lost:
            r14 = r5.f282868i;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo33401c(long r17, sk2.C101647f r19) {
            /*
                r16 = this;
                r0 = r16
                r1 = r19
                java.lang.String r2 = "utf8"
                java.lang.Class<u73.p> r3 = u73.C101982p.class
                java.lang.String r4 = "result"
                gy3.C87412m.m108594g(r1, r4)
                com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI r4 = r0.f282883a
                java.lang.String r4 = r4.f282863d
                r5 = 7
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = r1.f297554h
                r7 = 0
                r5[r7] = r6
                java.lang.String r6 = r1.f297553g
                r8 = 1
                r5[r8] = r6
                r6 = 2
                boolean r9 = r1.f297549c
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
                r5[r6] = r9
                java.lang.Long r6 = java.lang.Long.valueOf(r17)
                r9 = 3
                r5[r9] = r6
                r6 = 4
                com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI r10 = r0.f282883a
                boolean r10 = r10.f282873q
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                r5[r6] = r10
                r6 = 5
                com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI r10 = r0.f282883a
                int r10 = r10.f282867h
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r5[r6] = r10
                r6 = 6
                com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI r10 = r0.f282883a
                boolean r10 = r10.f282869j
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                r5[r6] = r10
                java.lang.String r6 = "uploadImageForSearch callback %s filePath:%s isSuccess:%b, session: %s, mBackPressCancel: %s, mScene: %s, useCdnOpt: %s."
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
                com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI r4 = r0.f282883a
                boolean r5 = r4.f282873q
                if (r5 == 0) goto L_0x005e
                return
            L_0x005e:
                r5 = 0
                r4.f282875s = r5
                boolean r5 = r1.f297549c
                if (r5 == 0) goto L_0x0177
                u73.p0 r4 = new u73.p0
                r4.<init>()
                com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI r5 = r0.f282883a
                r4.f39544a = r5
                java.lang.String r6 = r5.f282866g
                r4.f39548e = r6
                int r6 = r5.f282867h
                r10 = 16
                r11 = 100
                r12 = 15
                r13 = 83
                if (r6 != r13) goto L_0x0081
                if (r6 == r11) goto L_0x0088
            L_0x0081:
                int r14 = r5.f282868i
                if (r14 == r12) goto L_0x008a
                if (r14 != r10) goto L_0x0088
                goto L_0x008a
            L_0x0088:
                r14 = 0
                goto L_0x008b
            L_0x008a:
                r14 = 1
            L_0x008b:
                r4.f39559p = r14
                int r5 = r5.f282868i
                r14 = 17
                if (r5 != r14) goto L_0x0095
                r4.f39559p = r8
            L_0x0095:
                r15 = 12
                if (r5 == r15) goto L_0x00cc
                r15 = 11
                if (r5 == r15) goto L_0x00cc
                r15 = 13
                if (r5 == r15) goto L_0x00cc
                r15 = 14
                if (r5 != r15) goto L_0x00a6
                goto L_0x00cc
            L_0x00a6:
                r13 = 18
                if (r5 == r13) goto L_0x00c9
                r13 = 19
                if (r5 == r13) goto L_0x00c9
                r13 = 20
                if (r5 == r13) goto L_0x00c9
                r13 = 21
                if (r5 != r13) goto L_0x00b7
                goto L_0x00c9
            L_0x00b7:
                if (r5 == r12) goto L_0x00c6
                if (r5 != r10) goto L_0x00bc
                goto L_0x00c6
            L_0x00bc:
                if (r5 != r14) goto L_0x00c1
                r4.f39545b = r6
                goto L_0x00ce
            L_0x00c1:
                r5 = 81
                r4.f39545b = r5
                goto L_0x00ce
            L_0x00c6:
                r4.f39545b = r6
                goto L_0x00ce
            L_0x00c9:
                r4.f39545b = r11
                goto L_0x00ce
            L_0x00cc:
                r4.f39545b = r13
            L_0x00ce:
                r4.f39549f = r8
                int r5 = r1.f297555i
                if (r5 != r9) goto L_0x00e3
                java.lang.String r2 = r1.f297556j
                r4.f39547d = r2
                di3.d r2 = di3.C86312j.m106911c(r3)
                u73.p r2 = (u73.C101982p) r2
                r2.mo6877X6(r4)
                goto L_0x0163
            L_0x00e3:
                java.util.Map<java.lang.String, java.lang.String> r5 = r4.f39550g
                java.lang.String r6 = "params.extParams"
                gy3.C87412m.m108593f(r5, r6)
                java.util.HashMap r5 = (java.util.HashMap) r5
                java.lang.String r9 = "chatSearch"
                java.lang.String r10 = "2"
                r5.put(r9, r10)
                java.util.Map<java.lang.String, java.lang.String> r5 = r4.f39550g     // Catch:{ Exception -> 0x0107 }
                gy3.C87412m.m108593f(r5, r6)     // Catch:{ Exception -> 0x0107 }
                java.lang.String r9 = "reqKey"
                java.lang.String r10 = r1.f297554h     // Catch:{ Exception -> 0x0107 }
                java.lang.String r10 = p206nj.C117627q.m165909b(r10, r2)     // Catch:{ Exception -> 0x0107 }
                java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ Exception -> 0x0107 }
                r5.put(r9, r10)     // Catch:{ Exception -> 0x0107 }
            L_0x0107:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r9 = "weixin://fts/image?path="
                r5.append(r9)
                java.lang.String r9 = r1.f297553g
                java.lang.String r9 = com.tencent.p014mm.vfs.C86013q1.m106448i(r9, r7)
                r5.append(r9)
                java.lang.String r5 = r5.toString()
                java.util.Map<java.lang.String, java.lang.String> r9 = r4.f39550g     // Catch:{ Exception -> 0x012f }
                gy3.C87412m.m108593f(r9, r6)     // Catch:{ Exception -> 0x012f }
                java.lang.String r6 = "cacheImageSrc"
                java.lang.String r2 = p206nj.C117627q.m165909b(r5, r2)     // Catch:{ Exception -> 0x012f }
                java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ Exception -> 0x012f }
                r9.put(r6, r2)     // Catch:{ Exception -> 0x012f }
            L_0x012f:
                r4.f39551h = r8
                r4.f39552i = r7
                r4.f39560q = r8
                com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI r2 = r0.f282883a
                r5 = 2131101833(0x7f060889, float:1.7816087E38)
                int r2 = kg3.C76577a.m92153d(r2, r5)
                r4.f39554k = r2
                r4.f39555l = r8
                di3.d r2 = di3.C86312j.m106911c(r3)
                u73.p r2 = (u73.C101982p) r2
                r2.mo6877X6(r4)
                com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI r8 = r0.f282883a
                r9 = 8
                java.lang.String r10 = r1.f297553g
                java.lang.String r2 = "result.imagePath"
                gy3.C87412m.m108593f(r10, r2)
                com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI r2 = r0.f282883a
                java.lang.String r11 = r2.f282866g
                r12 = 0
                long r13 = java.lang.System.currentTimeMillis()
                r8.mo134709H7(r9, r10, r11, r12, r13)
            L_0x0163:
                zt3.t r2 = zt3.C119157j.f356862d
                com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$f$a r3 = new com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$f$a
                com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI r4 = r0.f282883a
                r3.<init>(r4)
                r4 = 500(0x1f4, double:2.47E-321)
                zt3.j r2 = (zt3.C119157j) r2
                r2.getClass()
                r2.mo183892w(r3, r4, r7)
                goto L_0x017f
            L_0x0177:
                com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$f$b r2 = new com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$f$b
                r2.<init>(r4)
                o40.C61926c.m72668M(r2)
            L_0x017f:
                com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI r5 = r0.f282883a
                r6 = 5
                java.lang.String r7 = r0.f282884b
                java.lang.String r8 = r5.f282866g
                int r9 = r1.f297551e
                long r10 = java.lang.System.currentTimeMillis()
                r5.mo134709H7(r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.websearch.p898ui.WebSearchSnsImageLoadingUI.C96617f.mo33401c(long, sk2.f):void");
        }
    }

    /* renamed from: H7 */
    public final void mo134709H7(int i, String str, String str2, int i2, long j) {
        C61926c.m72656A((String) null, new C96615d(this, i, str2, str, i2, j));
    }

    /* renamed from: I7 */
    public final void mo134710I7(String str) {
        C87412m.m108594g(str, "imagePath");
        C101645e eVar = new C101645e();
        eVar.f297536e = this.f282864e;
        eVar.f297535d = str;
        eVar.f297537f = 4;
        C64421he heVar = new C64421he();
        eVar.f297538g = heVar;
        heVar.f183478d = C43471q.m46977a(0);
        eVar.f297542k = this.f282869j;
        C48884bn2 g = C101987v0.m134273g();
        if (g != null) {
            C64852yd ydVar = new C64852yd();
            eVar.f297539h = ydVar;
            ydVar.f186491e = g.f131219d;
            ydVar.f186490d = g.f131220e;
            ydVar.f186492f = (float) g.f131221f;
            eVar.f297532a = this.f282865f;
        }
        C101804kv2 kv22 = this.f282871o;
        if (kv22 != null) {
            try {
                eVar.f297545n.putByteArray("key_sns_media_data", kv22.toByteArray());
            } catch (Exception e) {
                Log.printErrStackTrace(this.f282863d, e, "alvinluo startImageSearch mediaObj toByteArray exception", new Object[0]);
            }
        }
        mo134709H7(2, str, this.f282866g, 0, System.currentTimeMillis());
        long tf = ((C101643c) C86312j.m106911c(C101643c.class)).mo140879tf(eVar, new C96617f(this, str));
        this.f282875s = tf;
        if (tf != 0) {
            mo134709H7(4, str, this.f282866g, 0, System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    public final void mo134711a() {
        ((MMAnimateView) findViewById(C0966R.C0970id.g3d)).setVisibility(8);
        ((TextView) findViewById(C0966R.C0970id.g3r)).setVisibility(8);
        ((TextView) findViewById(C0966R.C0970id.f357940cl1)).setVisibility(8);
        ((Button) findViewById(C0966R.C0970id.cks)).setVisibility(8);
        ((TextView) findViewById(C0966R.C0970id.cn4)).setVisibility(0);
        ((Button) findViewById(C0966R.C0970id.f357950cn3)).setVisibility(0);
        ((Button) findViewById(C0966R.C0970id.f357950cn3)).setOnClickListener(new C72597c(this));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.chq;
    }

    public void onBackPressed() {
        super.onBackPressed();
        mo134709H7(11, "", this.f282866g, 0, System.currentTimeMillis());
        Log.m105919d(this.f282863d, "onBackPressed = %s", Boolean.valueOf(this.f282873q));
        this.f282873q = true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f282865f = getIntent().getLongExtra("key_session_id", 0);
        String stringExtra = getIntent().getStringExtra("key_sns_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f282870n = stringExtra;
        getIntent().getStringExtra("key_sns_username");
        String stringExtra2 = getIntent().getStringExtra("key_sns_image_path");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f282872p = stringExtra2;
        this.f282864e = getIntent().getIntExtra("key_scan_goods_request_type", 0);
        this.f282867h = getIntent().getIntExtra("key_scene", 0);
        String c = C99252h.m129298c(this.f282865f);
        C87412m.m108593f(c, "getUnsignedLong(mSessionId)");
        this.f282866g = c;
        this.f282868i = getIntent().getIntExtra("key_source", 0);
        this.f282869j = getIntent().getBooleanExtra("key_upload_image_use_cdn_opt", true);
        int i = this.f282867h;
        if (i == 0) {
            i = 83;
        }
        this.f282867h = i;
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_sns_media");
        if (byteArrayExtra != null) {
            C101804kv2 kv22 = new C101804kv2();
            try {
                kv22.parseFrom(byteArrayExtra);
            } catch (Exception unused) {
            }
            this.f282871o = kv22;
        }
        setBackBtn(new C72595a(this), C0966R.raw.actionbar_icon_dark_back);
        setMMTitle("");
        if (!C86709a0.m107522a()) {
            Log.m105920e(this.f282863d, "startImageSearch account not ready");
            mo134711a();
        } else if (C86013q1.m106450k(this.f282872p)) {
            showLoading();
            mo134710I7(this.f282872p);
            ((Button) findViewById(C0966R.C0970id.cks)).setOnClickListener(new C72596b(this));
        } else {
            C101804kv2 kv23 = this.f282871o;
            if (kv23 != null) {
                ((WebSearchSnsImageLoadingUI$snsImageDownloadListener$2$1) ((C36570n) this.f282874r).getValue()).alive();
                showLoading();
                SnsImageDownloadedEvent snsImageDownloadedEvent = new SnsImageDownloadedEvent();
                SnsImageDownloadedEvent.C1139a aVar = snsImageDownloadedEvent.f9515d;
                aVar.f9517b = kv23;
                aVar.f9518c = kv23.f298689d;
                aVar.f9516a = 4;
                snsImageDownloadedEvent.publish();
                return;
            }
            mo134711a();
        }
    }

    public void onDestroy() {
        ((WebSearchSnsImageLoadingUI$snsImageDownloadListener$2$1) ((C36570n) this.f282874r).getValue()).dead();
        if (this.f282875s != 0) {
            ((C101643c) C86312j.m106911c(C101643c.class)).mo140880x0(this.f282875s);
        }
        super.onDestroy();
    }

    public final void showLoading() {
        if (C85875k4.m106211z()) {
            ((MMAnimateView) findViewById(C0966R.C0970id.g3d)).setImageResource(C0966R.raw.websearch_dark_loading);
        } else {
            ((MMAnimateView) findViewById(C0966R.C0970id.g3d)).setImageResource(C0966R.raw.websearch_light_loading);
        }
    }
}
