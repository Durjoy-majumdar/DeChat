package m23;

import ai2.C92010c;
import ai2.C92011d;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import ci2.C28564a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l23.C109202j;
import lh2.C99417a;
import nj3.C76912y0;
import p914oj.C110052b;
import pe3.C89349b;
import qh2.C101198e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sp3.C110801c;
import sx3.C36907w;
import sx3.C64197v;
import te3.C64368fm;
import z04.C119027c;
import zt3.C119157j;

/* renamed from: m23.c */
public final class C109475c extends C99417a implements C109202j.C109205d, C109202j.C109204c {

    /* renamed from: A */
    public final C32229r<Integer, String, Integer, ArrayList<C64368fm>, C13598b0> f327682A;

    /* renamed from: f */
    public ViewGroup f327683f;

    /* renamed from: g */
    public final EditorPanelHolder f327684g;

    /* renamed from: h */
    public final EditorPanelHolder f327685h;

    /* renamed from: i */
    public final Context f327686i;

    /* renamed from: j */
    public final View f327687j = this.f327683f.findViewById(C0966R.C0970id.cbq);

    /* renamed from: n */
    public final ImageView f327688n;

    /* renamed from: o */
    public final ImageView f327689o;

    /* renamed from: p */
    public final C13601g f327690p;

    /* renamed from: q */
    public final C13601g f327691q;

    /* renamed from: r */
    public final List<HashMap<String, C61435b>> f327692r;

    /* renamed from: s */
    public final List<ArrayList<C28564a>> f327693s;

    /* renamed from: t */
    public final List<ArrayList<C64368fm>> f327694t;

    /* renamed from: u */
    public final List<HashSet<String>> f327695u;

    /* renamed from: v */
    public final List<C92010c> f327696v;

    /* renamed from: w */
    public boolean f327697w;

    /* renamed from: x */
    public final Object f327698x;

    /* renamed from: y */
    public int f327699y;

    /* renamed from: z */
    public int f327700z;

    /* renamed from: m23.c$a */
    public static final class C109476a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109475c f327701d;

        public C109476a(C109475c cVar) {
            this.f327701d = cVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorCaptionPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C109475c cVar = this.f327701d;
            cVar.f327699y++;
            boolean z = false;
            if (!cVar.f327697w) {
                cVar.f327697w = true;
                cVar.mo160711C(0);
                this.f327701d.mo160713E(0);
                C109475c.m148693x(this.f327701d, 0);
            } else {
                if (!(cVar.f327684g.f315616h != null)) {
                    if (cVar.mo160710B().f32155F != null) {
                        z = true;
                    }
                    if (!z) {
                        cVar.mo160710B().setVideoPauseListener(new C109480d(cVar));
                        cVar.mo160710B().setVideoSeekListener(new C109481e(cVar));
                        cVar.mo160710B().setStartTransListener(new C109482f(cVar));
                        cVar.mo160710B().setClearTransListener(new C109483g(cVar));
                        cVar.mo160710B().setDismissListener(new C109484h(cVar));
                        cVar.mo160710B().setItemClickListener(new C109485i(cVar));
                    }
                    EditorPanelHolder.m142603c(cVar.f327684g, cVar.mo160710B(), (ViewGroup.LayoutParams) null, 2, (Object) null);
                    cVar.f327684g.setOnVisibleChangeCallback(new C109489m(cVar));
                }
                this.f327701d.f327684g.setShow(true);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorCaptionPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: m23.c$b */
    public static final class C109477b extends C87413o implements C32229r<Integer, String, Integer, ArrayList<C64368fm>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109475c f327702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109477b(C109475c cVar) {
            super(4);
            this.f327702d = cVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj).intValue();
            String str = (String) obj2;
            int intValue2 = ((Number) obj3).intValue();
            ArrayList arrayList = (ArrayList) obj4;
            C87412m.m108594g(str, "key");
            C109475c cVar = this.f327702d;
            synchronized (cVar.f327698x) {
                StringBuilder sb = new StringBuilder();
                sb.append("callback key:");
                sb.append(str);
                sb.append(" ret:");
                sb.append(intValue2);
                sb.append(" size:");
                sb.append(arrayList != null ? Integer.valueOf(arrayList.size()) : null);
                Log.m105924i("MicroMsg.EditorCaptionPlugin", sb.toString());
                if (intValue2 != 0) {
                    cVar.f327695u.get(intValue).add(str);
                    if (cVar.f327695u.get(intValue).size() >= cVar.f327692r.get(intValue).size()) {
                        int i = intValue2 == -2 ? C0966R.string.kbl : C0966R.string.kbi;
                        Context context = cVar.f327686i;
                        C76912y0.makeText(context, (CharSequence) C76577a.m92166q(context, i), 0).show();
                        cVar.mo160710B().mo10965i(intValue, C76577a.m92166q(cVar.f327686i, C0966R.string.k_f));
                        cVar.f327697w = true;
                    }
                }
                cVar.mo160711C(intValue);
                cVar.mo160713E(intValue);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: m23.c$c */
    public static final class C109478c extends C87413o implements C32224a<C109490n> {

        /* renamed from: d */
        public final /* synthetic */ C109475c f327703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109478c(C109475c cVar) {
            super(0);
            this.f327703d = cVar;
        }

        public Object invoke() {
            Context context = this.f327703d.f327686i;
            C87412m.m108593f(context, "context");
            return new C109490n(context);
        }
    }

    /* renamed from: m23.c$d */
    public static final class C109479d extends C87413o implements C32224a<C10718o> {

        /* renamed from: d */
        public final /* synthetic */ C109475c f327704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109479d(C109475c cVar) {
            super(0);
            this.f327704d = cVar;
        }

        public Object invoke() {
            Context context = this.f327704d.f327686i;
            C87412m.m108593f(context, "context");
            return new C10718o(context);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109475c(ViewGroup viewGroup, EditorPanelHolder editorPanelHolder, EditorPanelHolder editorPanelHolder2, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(editorPanelHolder, "previewHolder");
        C87412m.m108594g(editorPanelHolder2, "editHolder");
        C87412m.m108594g(eVar, "status");
        this.f327683f = viewGroup;
        this.f327684g = editorPanelHolder;
        this.f327685h = editorPanelHolder2;
        Context context = viewGroup.getContext();
        this.f327686i = context;
        ImageView imageView = (ImageView) this.f327683f.findViewById(C0966R.C0970id.cbp);
        this.f327688n = imageView;
        ImageView imageView2 = (ImageView) this.f327683f.findViewById(C0966R.C0970id.cbr);
        this.f327689o = imageView2;
        this.f327690p = C36568h.m40985a(new C109479d(this));
        this.f327691q = C36568h.m40985a(new C109478c(this));
        this.f327692r = C64197v.m75537f(new HashMap(), new HashMap());
        this.f327693s = C64197v.m75537f(new ArrayList(), new ArrayList());
        this.f327694t = C64197v.m75537f(new ArrayList(), new ArrayList());
        this.f327695u = C64197v.m75537f(new HashSet(), new HashSet());
        this.f327696v = C64197v.m75537f(new C92010c(C92011d.CAPTION), new C92010c(C92011d.RECORD_CAPTION));
        this.f327698x = new Object();
        this.f327682A = new C109477b(this);
        this.f327683f.setVisibility(0);
        imageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_caption, -1));
        imageView2.setImageDrawable(context.getResources().getDrawable(C0966R.raw.popvideo_post_selected_origin));
        imageView.setOnClickListener(new C109476a(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0253  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m148693x(m23.C109475c r17, int r18) {
        /*
            r1 = r17
            r2 = r18
            r17.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "voiceTranslate type:"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "MicroMsg.EditorCaptionPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            android.widget.ImageView r0 = r1.f327689o
            r3 = 0
            r0.setVisibility(r3)
            m23.o r0 = r17.mo160710B()
            r0.mo10968l(r2)
            java.util.List<java.util.HashMap<java.lang.String, m23.b>> r0 = r1.f327692r
            java.lang.Object r0 = r0.get(r2)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x003b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0267
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.getValue()
            r6 = r0
            m23.b r6 = (m23.C61435b) r6
            fy3.r<java.lang.Integer, java.lang.String, java.lang.Integer, java.util.ArrayList<te3.fm>, rx3.b0> r7 = r1.f327682A
            r6.getClass()
            java.lang.String r0 = "filePath"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "callback"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r8 = 91
            r0.append(r8)
            int r9 = r6.hashCode()
            r0.append(r9)
            java.lang.String r9 = "]prepare translate file:"
            r0.append(r9)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = "MicroMsg.EditCaptionDataManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            boolean r0 = r6.f174686o
            r11 = 1
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = r6.f174683i
            boolean r0 = gy3.C87412m.m108589b(r5, r0)
            if (r0 == 0) goto L_0x00b3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            java.util.ArrayList<te3.fm> r8 = r6.f174681g
            if (r8 == 0) goto L_0x00a2
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r11 = 0
        L_0x00a2:
            if (r11 == 0) goto L_0x00a6
            r10 = -2
            goto L_0x00a7
        L_0x00a6:
            r10 = 0
        L_0x00a7:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.util.ArrayList<te3.fm> r6 = r6.f174681g
            m23.c$b r7 = (m23.C109475c.C109477b) r7
            r7.mo162I(r0, r5, r8, r6)
            goto L_0x003b
        L_0x00b3:
            r6.f174686o = r3
            r6.f174687p = r11
            r6.f174678d = r7
            r6.f174683i = r5
            oj.b r0 = r6.f174680f     // Catch:{ Exception -> 0x022a }
            if (r0 != 0) goto L_0x0223
            oj.b r0 = new oj.b     // Catch:{ Exception -> 0x022a }
            r0.<init>()     // Catch:{ Exception -> 0x022a }
            r6.f174680f = r0     // Catch:{ Exception -> 0x022a }
            r0.mo161392k(r5)     // Catch:{ Exception -> 0x022a }
            oj.b r0 = r6.f174680f     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x00d2
            int r0 = r0.mo161385d()     // Catch:{ Exception -> 0x022a }
            goto L_0x00d3
        L_0x00d2:
            r0 = 0
        L_0x00d3:
            r13 = 0
        L_0x00d4:
            if (r13 >= r0) goto L_0x011e
            oj.b r14 = r6.f174680f     // Catch:{ Exception -> 0x022a }
            if (r14 == 0) goto L_0x00df
            android.media.MediaFormat r14 = r14.mo161386e(r13)     // Catch:{ Exception -> 0x022a }
            goto L_0x00e0
        L_0x00df:
            r14 = 0
        L_0x00e0:
            if (r14 == 0) goto L_0x00e9
            java.lang.String r15 = "mime"
            java.lang.String r15 = r14.getString(r15)     // Catch:{ Exception -> 0x022a }
            goto L_0x00ea
        L_0x00e9:
            r15 = 0
        L_0x00ea:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022a }
            r10.<init>()     // Catch:{ Exception -> 0x022a }
            java.lang.String r12 = "track mime:"
            r10.append(r12)     // Catch:{ Exception -> 0x022a }
            r10.append(r15)     // Catch:{ Exception -> 0x022a }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x022a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)     // Catch:{ Exception -> 0x022a }
            boolean r10 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x022a }
            if (r10 != 0) goto L_0x011b
            if (r15 == 0) goto L_0x0110
            java.lang.String r10 = "audio/"
            boolean r10 = z04.C112551y.m153819s(r15, r10, r3)     // Catch:{ Exception -> 0x022a }
            if (r10 != r11) goto L_0x0110
            r10 = 1
            goto L_0x0111
        L_0x0110:
            r10 = 0
        L_0x0111:
            if (r10 == 0) goto L_0x011b
            oj.b r0 = r6.f174680f     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x011f
            r0.mo161390i(r13)     // Catch:{ Exception -> 0x022a }
            goto L_0x011f
        L_0x011b:
            int r13 = r13 + 1
            goto L_0x00d4
        L_0x011e:
            r14 = 0
        L_0x011f:
            if (r14 != 0) goto L_0x014c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022a }
            r0.<init>()     // Catch:{ Exception -> 0x022a }
            r0.append(r8)     // Catch:{ Exception -> 0x022a }
            int r8 = r6.hashCode()     // Catch:{ Exception -> 0x022a }
            r0.append(r8)     // Catch:{ Exception -> 0x022a }
            java.lang.String r8 = "no audio track]"
            r0.append(r8)     // Catch:{ Exception -> 0x022a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x022a }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)     // Catch:{ Exception -> 0x022a }
            oj.b r0 = r6.f174680f     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x0143
            r0.mo161388g()     // Catch:{ Exception -> 0x022a }
        L_0x0143:
            r8 = 0
            r6.f174680f = r8     // Catch:{ Exception -> 0x022a }
            r0 = -2
            r6.f174688q = r0     // Catch:{ Exception -> 0x022a }
            r10 = -2
            goto L_0x023f
        L_0x014c:
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r0 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a     // Catch:{ Exception -> 0x022a }
            rw.m$a r0 = r0.mo129930b(r5)     // Catch:{ Exception -> 0x022a }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022a }
            r10.<init>()     // Catch:{ Exception -> 0x022a }
            java.lang.String r11 = "audio format:"
            r10.append(r11)     // Catch:{ Exception -> 0x022a }
            r10.append(r14)     // Catch:{ Exception -> 0x022a }
            java.lang.String r11 = ", videoInfo:"
            r10.append(r11)     // Catch:{ Exception -> 0x022a }
            r10.append(r0)     // Catch:{ Exception -> 0x022a }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x022a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)     // Catch:{ Exception -> 0x022a }
            java.lang.String r10 = "durationUs"
            if (r0 == 0) goto L_0x0175
            long r11 = r0.f180528d     // Catch:{ Exception -> 0x022a }
            goto L_0x0177
        L_0x0175:
            r11 = 0
        L_0x0177:
            r15 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r15
            boolean r13 = r14.containsKey(r10)     // Catch:{ Exception -> 0x022a }
            if (r13 == 0) goto L_0x0185
            long r11 = r14.getLong(r10)     // Catch:{ Exception -> 0x022a }
        L_0x0185:
            java.lang.String r10 = "bitrate"
            if (r0 == 0) goto L_0x018c
            int r0 = r0.f180532h     // Catch:{ Exception -> 0x022a }
            goto L_0x018f
        L_0x018c:
            r0 = 128000(0x1f400, float:1.79366E-40)
        L_0x018f:
            int r0 = com.tencent.p014mm.plugin.vlog.model.C96535e0.m123847a(r14, r10, r0)     // Catch:{ Exception -> 0x022a }
            java.lang.String r10 = "profile"
            int r13 = r6.f174689r     // Catch:{ Exception -> 0x022a }
            int r10 = com.tencent.p014mm.plugin.vlog.model.C96535e0.m123847a(r14, r10, r13)     // Catch:{ Exception -> 0x022a }
            r6.f174689r = r10     // Catch:{ Exception -> 0x022a }
            java.lang.String r10 = "sample-rate"
            int r13 = r6.f174690s     // Catch:{ Exception -> 0x022a }
            int r10 = com.tencent.p014mm.plugin.vlog.model.C96535e0.m123847a(r14, r10, r13)     // Catch:{ Exception -> 0x022a }
            r6.f174690s = r10     // Catch:{ Exception -> 0x022a }
            java.lang.String r10 = "channel-count"
            int r13 = r6.f174691t     // Catch:{ Exception -> 0x022a }
            int r10 = com.tencent.p014mm.plugin.vlog.model.C96535e0.m123847a(r14, r10, r13)     // Catch:{ Exception -> 0x022a }
            r6.f174691t = r10     // Catch:{ Exception -> 0x022a }
            float r10 = (float) r0     // Catch:{ Exception -> 0x022a }
            float r13 = (float) r11     // Catch:{ Exception -> 0x022a }
            r14 = 1148846080(0x447a0000, float:1000.0)
            float r13 = r13 / r14
            r14 = 1000(0x3e8, float:1.401E-42)
            float r14 = (float) r14     // Catch:{ Exception -> 0x022a }
            float r14 = r13 / r14
            float r10 = r10 * r14
            r14 = 8
            float r14 = (float) r14     // Catch:{ Exception -> 0x022a }
            float r10 = r10 / r14
            r14 = 2
            float r14 = (float) r14     // Catch:{ Exception -> 0x022a }
            float r10 = r10 * r14
            r14 = 7
            float r14 = (float) r14     // Catch:{ Exception -> 0x022a }
            r15 = 20
            float r15 = (float) r15     // Catch:{ Exception -> 0x022a }
            float r13 = r13 / r15
            float r14 = r14 * r13
            float r13 = r10 + r14
            int r13 = (int) r13     // Catch:{ Exception -> 0x022a }
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.allocateDirect(r13)     // Catch:{ Exception -> 0x022a }
            r6.f174682h = r13     // Catch:{ Exception -> 0x022a }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022a }
            r13.<init>()     // Catch:{ Exception -> 0x022a }
            r13.append(r8)     // Catch:{ Exception -> 0x022a }
            int r8 = r6.hashCode()     // Catch:{ Exception -> 0x022a }
            r13.append(r8)     // Catch:{ Exception -> 0x022a }
            java.lang.String r8 = "]allocate buffer size:"
            r13.append(r8)     // Catch:{ Exception -> 0x022a }
            java.nio.ByteBuffer r8 = r6.f174682h     // Catch:{ Exception -> 0x022a }
            if (r8 == 0) goto L_0x01f7
            int r8 = r8.capacity()     // Catch:{ Exception -> 0x022a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x022a }
            goto L_0x01f8
        L_0x01f7:
            r8 = 0
        L_0x01f8:
            r13.append(r8)     // Catch:{ Exception -> 0x022a }
            java.lang.String r8 = ", voiceSize:"
            r13.append(r8)     // Catch:{ Exception -> 0x022a }
            r13.append(r10)     // Catch:{ Exception -> 0x022a }
            java.lang.String r8 = ", adtsSize:"
            r13.append(r8)     // Catch:{ Exception -> 0x022a }
            r13.append(r14)     // Catch:{ Exception -> 0x022a }
            java.lang.String r8 = ", duration:"
            r13.append(r8)     // Catch:{ Exception -> 0x022a }
            r13.append(r11)     // Catch:{ Exception -> 0x022a }
            java.lang.String r8 = ", bitrate:"
            r13.append(r8)     // Catch:{ Exception -> 0x022a }
            r13.append(r0)     // Catch:{ Exception -> 0x022a }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x022a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ Exception -> 0x022a }
            goto L_0x0228
        L_0x0223:
            java.lang.String r0 = "already create extractor success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ Exception -> 0x022a }
        L_0x0228:
            r10 = 0
            goto L_0x023f
        L_0x022a:
            r0 = move-exception
            oj.b r8 = r6.f174680f
            if (r8 == 0) goto L_0x0232
            r8.mo161388g()
        L_0x0232:
            r8 = 0
            r6.f174680f = r8
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r10 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r10, r8)
            r10 = -3
            r6.f174688q = r10
        L_0x023f:
            if (r10 == 0) goto L_0x0253
            r6.f174687p = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            m23.c$b r7 = (m23.C109475c.C109477b) r7
            r8 = 0
            r7.mo162I(r0, r5, r6, r8)
            goto L_0x003b
        L_0x0253:
            r8 = 0
            r6.f174688q = r10
            a14.s1 r9 = a14.C0001s1.f0d
            a14.h0 r10 = a14.C53872d1.f151119c
            r11 = 0
            m23.a r12 = new m23.a
            r12.<init>(r6, r2, r8)
            r13 = 2
            r14 = 0
            a14.C53895h.m60466d(r9, r10, r11, r12, r13, r14)
            goto L_0x003b
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m23.C109475c.m148693x(m23.c, int):void");
    }

    /* renamed from: A */
    public final C109490n mo160709A() {
        return (C109490n) ((C36570n) this.f327691q).getValue();
    }

    /* renamed from: B */
    public final C10718o mo160710B() {
        return (C10718o) ((C36570n) this.f327690p).getValue();
    }

    /* renamed from: C */
    public final ArrayList<C64368fm> mo160711C(int i) {
        this.f327694t.get(i).clear();
        long j = 0;
        for (C28564a aVar : this.f327693s.get(i)) {
            C61435b bVar = (C61435b) this.f327692r.get(i).get(aVar.f78424a);
            if (bVar != null) {
                if (bVar.f174681g.size() != 0) {
                    Log.m105924i("MicroMsg.EditorCaptionPlugin", "set translate caption. path:" + aVar.f78424a);
                    for (C64368fm fmVar : bVar.f174681g) {
                        if (fmVar.f183150f >= aVar.f78425b && fmVar.f183149e <= aVar.f78426c) {
                            C64368fm fmVar2 = new C64368fm();
                            fmVar2.f183152h = fmVar.f183152h;
                            fmVar2.f183148d = fmVar.f183148d;
                            long j2 = fmVar.f183149e;
                            long j3 = aVar.f78425b;
                            float f = aVar.f78427d;
                            fmVar2.f183149e = ((long) ((int) (((float) (j2 - j3)) / f))) + j;
                            fmVar2.f183150f = ((long) ((int) (((float) (fmVar.f183150f - j3)) / f))) + j;
                            this.f327694t.get(i).add(fmVar2);
                        }
                    }
                } else if (bVar.f174688q == 0 && bVar.f174687p) {
                    Log.m105924i("MicroMsg.EditorCaptionPlugin", "set default caption. path:" + aVar.f78424a);
                    C64368fm fmVar3 = new C64368fm();
                    fmVar3.f183152h = -1;
                    String q = C76577a.m92166q(this.f327686i, C0966R.string.k_g);
                    C87412m.m108593f(q, "getString(context, com.t…tring.video_caption_hint)");
                    byte[] bytes = q.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    fmVar3.f183148d = new C89349b(bytes, 0, bytes.length);
                    float f2 = aVar.f78427d;
                    fmVar3.f183149e = ((long) ((int) (((float) aVar.f78425b) / f2))) + j;
                    fmVar3.f183150f = ((long) ((int) (((float) aVar.f78426c) / f2))) + j;
                    fmVar3.f183151g = true;
                    this.f327694t.get(i).add(fmVar3);
                }
            }
            j += (long) ((int) (((float) (aVar.f78426c - aVar.f78425b)) / aVar.f78427d));
        }
        Log.m105924i("MicroMsg.EditorCaptionPlugin", "type:" + i + ", scriptTransResult size:" + this.f327694t.get(i).size());
        return this.f327694t.get(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b A[LOOP:1: B:13:0x005d->B:25:0x008b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0128 A[LOOP:4: B:57:0x0122->B:59:0x0128, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0094 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x008f A[EDGE_INSN: B:88:0x008f->B:26:0x008f ?: BREAK  , SYNTHETIC] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo160712D() {
        /*
            r18 = this;
            r0 = r18
            java.util.List<ai2.c> r1 = r0.f327696v
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            ai2.c r1 = (ai2.C92010c) r1
            java.lang.String r1 = r1.f263435j
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = com.tencent.p014mm.plugin.vlog.model.C96551o.m123872b(r1)
            goto L_0x0016
        L_0x0014:
            java.lang.String r1 = ""
        L_0x0016:
            r3 = 0
            java.util.List<java.util.ArrayList<ci2.a>> r5 = r0.f327693s
            java.lang.Object r5 = r5.get(r2)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0029:
            boolean r7 = r5.hasNext()
            r8 = 1
            if (r7 == 0) goto L_0x0097
            java.lang.Object r7 = r5.next()
            r9 = r7
            ci2.a r9 = (ci2.C28564a) r9
            long r10 = r9.f78426c
            long r12 = r9.f78425b
            long r10 = r10 - r12
            float r10 = (float) r10
            float r11 = r9.f78427d
            float r10 = r10 / r11
            int r10 = (int) r10
            long r10 = (long) r10
            long r10 = r10 + r3
            java.util.List<ai2.c> r12 = r0.f327696v
            java.lang.Object r12 = r12.get(r2)
            ai2.c r12 = (ai2.C92010c) r12
            java.util.ArrayList<te3.fm> r12 = r12.f263432g
            boolean r13 = r12 instanceof java.util.Collection
            if (r13 == 0) goto L_0x0059
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L_0x0059
        L_0x0057:
            r8 = 0
            goto L_0x008f
        L_0x0059:
            java.util.Iterator r12 = r12.iterator()
        L_0x005d:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0057
            java.lang.Object r13 = r12.next()
            te3.fm r13 = (te3.C64368fm) r13
            boolean r14 = r13.f183151g
            if (r14 != 0) goto L_0x0085
            long r14 = r13.f183149e
            r16 = r3
            long r2 = r9.f78425b
            long r2 = r2 + r16
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0087
            long r2 = r13.f183150f
            long r13 = r9.f78426c
            long r13 = r13 + r16
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 > 0) goto L_0x0087
            r2 = 1
            goto L_0x0088
        L_0x0085:
            r16 = r3
        L_0x0087:
            r2 = 0
        L_0x0088:
            if (r2 == 0) goto L_0x008b
            goto L_0x008f
        L_0x008b:
            r3 = r16
            r2 = 0
            goto L_0x005d
        L_0x008f:
            if (r8 == 0) goto L_0x0094
            r6.add(r7)
        L_0x0094:
            r3 = r10
            r2 = 0
            goto L_0x0029
        L_0x0097:
            int r2 = r6.size()
            java.util.List<ai2.c> r3 = r0.f327696v
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            ai2.c r3 = (ai2.C92010c) r3
            java.util.ArrayList<te3.fm> r3 = r3.f263432g
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00af:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00d0
            java.lang.Object r5 = r3.next()
            r6 = r5
            te3.fm r6 = (te3.C64368fm) r6
            boolean r7 = r6.f183151g
            if (r7 != 0) goto L_0x00c9
            pe3.b r6 = r6.f183148d
            byte[] r6 = r6.f257327a
            int r6 = r6.length
            if (r6 <= 0) goto L_0x00c9
            r6 = 1
            goto L_0x00ca
        L_0x00c9:
            r6 = 0
        L_0x00ca:
            if (r6 == 0) goto L_0x00af
            r4.add(r5)
            goto L_0x00af
        L_0x00d0:
            int r3 = r4.size()
            java.util.List<ai2.c> r4 = r0.f327696v
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            ai2.c r4 = (ai2.C92010c) r4
            java.util.ArrayList<te3.fm> r4 = r4.f263432g
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L_0x00eb
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x00eb
        L_0x00e9:
            r4 = 0
            goto L_0x010c
        L_0x00eb:
            java.util.Iterator r4 = r4.iterator()
        L_0x00ef:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00e9
            java.lang.Object r5 = r4.next()
            te3.fm r5 = (te3.C64368fm) r5
            boolean r6 = r5.f183151g
            if (r6 != 0) goto L_0x0108
            pe3.b r5 = r5.f183148d
            byte[] r5 = r5.f257327a
            int r5 = r5.length
            if (r5 != 0) goto L_0x0108
            r5 = 1
            goto L_0x0109
        L_0x0108:
            r5 = 0
        L_0x0109:
            if (r5 == 0) goto L_0x00ef
            r4 = 1
        L_0x010c:
            java.util.List<java.util.HashMap<java.lang.String, m23.b>> r5 = r0.f327692r
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            java.util.Map r5 = (java.util.Map) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0122:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x013a
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getValue()
            m23.b r7 = (m23.C61435b) r7
            java.util.ArrayList<te3.fm> r7 = r7.f174681g
            sx3.C64175a0.m75508p(r6, r7)
            goto L_0x0122
        L_0x013a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0143:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0196
            java.lang.Object r7 = r6.next()
            r9 = r7
            te3.fm r9 = (te3.C64368fm) r9
            java.util.List<ai2.c> r10 = r0.f327696v
            r11 = 0
            java.lang.Object r10 = r10.get(r11)
            ai2.c r10 = (ai2.C92010c) r10
            java.util.ArrayList<te3.fm> r10 = r10.f263432g
            java.util.Iterator r10 = r10.iterator()
        L_0x015f:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x017a
            java.lang.Object r11 = r10.next()
            r12 = r11
            te3.fm r12 = (te3.C64368fm) r12
            long r12 = r12.f183152h
            long r14 = r9.f183152h
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x0176
            r12 = 1
            goto L_0x0177
        L_0x0176:
            r12 = 0
        L_0x0177:
            if (r12 == 0) goto L_0x015f
            goto L_0x017b
        L_0x017a:
            r11 = 0
        L_0x017b:
            te3.fm r11 = (te3.C64368fm) r11
            if (r11 == 0) goto L_0x018f
            boolean r10 = r9.f183151g
            if (r10 != 0) goto L_0x018f
            pe3.b r9 = r9.f183148d
            pe3.b r10 = r11.f183148d
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            if (r9 != 0) goto L_0x018f
            r9 = 1
            goto L_0x0190
        L_0x018f:
            r9 = 0
        L_0x0190:
            if (r9 == 0) goto L_0x0143
            r5.add(r7)
            goto L_0x0143
        L_0x0196:
            int r5 = r5.size()
            r6 = 7
            rx3.l[] r6 = new rx3.C13604l[r6]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            rx3.l r7 = new rx3.l
            java.lang.String r9 = "useCaptionTrackCount"
            r7.<init>(r9, r2)
            r2 = 0
            r6[r2] = r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            rx3.l r3 = new rx3.l
            java.lang.String r7 = "captionCount"
            r3.<init>(r7, r2)
            r6[r8] = r3
            r2 = 2
            rx3.l r3 = new rx3.l
            java.lang.String r7 = "captionFont"
            r3.<init>(r7, r1)
            r6[r2] = r3
            r1 = 3
            int r2 = r0.f327699y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            rx3.l r3 = new rx3.l
            java.lang.String r7 = "captionIconClickCount"
            r3.<init>(r7, r2)
            r6[r1] = r3
            r1 = 4
            int r2 = r0.f327700z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            rx3.l r3 = new rx3.l
            java.lang.String r7 = "captionEditClickCount"
            r3.<init>(r7, r2)
            r6[r1] = r3
            r1 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            rx3.l r3 = new rx3.l
            java.lang.String r5 = "captionModifiedCount"
            r3.<init>(r5, r2)
            r6[r1] = r3
            r1 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            rx3.l r3 = new rx3.l
            java.lang.String r4 = "hasDeleteCaption"
            r3.<init>(r4, r2)
            r6[r1] = r3
            java.util.Map r1 = sx3.C90364q0.m113147f(r6)
            c30.g r2 = new c30.g
            r2.<init>((java.util.Map) r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "JSONObject(info).toString()"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r2 = ","
            java.lang.String r3 = ";"
            r4 = 0
            java.lang.String r1 = z04.C112551y.m153814n(r1, r2, r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m23.C109475c.mo160712D():java.lang.String");
    }

    /* renamed from: E */
    public final void mo160713E(int i) {
        boolean z;
        Object obj;
        boolean z2;
        ArrayList arrayList = new ArrayList(this.f327696v.get(i).f263432g);
        Iterable iterable = this.f327694t.get(i);
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(iterable, 10));
        Iterator it = iterable.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            C64368fm fmVar = (C64368fm) it.next();
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it4.next();
                if (((C64368fm) obj).f183152h == fmVar.f183152h) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            C64368fm fmVar2 = (C64368fm) obj;
            if (fmVar2 != null) {
                fmVar.f183148d = fmVar2.f183148d;
            }
            arrayList2.add(fmVar);
        }
        for (C64368fm fmVar3 : this.f327694t.get(i)) {
            if (!fmVar3.f183151g) {
                C10718o B = mo160710B();
                B.getClass();
                B.f32150A.get(i).f32193f.clear();
                C64368fm fmVar4 = new C64368fm();
                fmVar4.f183149e = -2;
                fmVar4.f183150f = -1;
                B.f32150A.get(i).f32193f.add(fmVar4);
                B.f32150A.get(i).f32193f.add(fmVar4);
                B.f32150A.get(i).f32193f.addAll(arrayList2);
                C64368fm fmVar5 = new C64368fm();
                fmVar5.f183149e = 2147483645;
                fmVar5.f183150f = 2147483646;
                B.f32150A.get(i).f32193f.add(fmVar5);
                B.f32150A.get(i).f32193f.add(fmVar5);
                mo160710B().f32150A.get(i).notifyDataSetChanged();
                z = true;
            }
        }
        this.f327696v.get(i).f263432g.clear();
        this.f327696v.get(i).f263432g.addAll(arrayList2);
        if (this.f327689o.getVisibility() == 0) {
            if (z) {
                mo160710B().mo10967k(i);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("PARAM_1_INT", i);
            bundle.putByteArray("PARAM_1_BYTEARRAY", this.f327696v.get(i).toProtoBuf().toByteArray());
            this.f291492d.mo14585p(C101198e.C101199b.EDIT_ADD_CAPTION, bundle);
        }
    }

    /* renamed from: F */
    public final void mo160714F(byte[] bArr) {
        T t;
        boolean z;
        C87412m.m108594g(bArr, "transResult");
        try {
            C64368fm fmVar = new C64368fm();
            try {
                fmVar.parseFrom(bArr);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
                fmVar = null;
            }
            if (fmVar != null) {
                int i = 0;
                for (T next : this.f327696v) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        Iterator<T> it = ((C92010c) next).f263432g.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            if (((C64368fm) t).f183152h == fmVar.f183152h) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        C64368fm fmVar2 = (C64368fm) t;
                        if (fmVar2 != null) {
                            mo160715G(i, fmVar2);
                        }
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
        } catch (IOException e2) {
            Log.printErrStackTrace("MicroMsg.EditorCaptionPlugin", e2, "", new Object[0]);
        }
    }

    /* renamed from: G */
    public final void mo160715G(int i, C64368fm fmVar) {
        int i2 = i;
        C64368fm fmVar2 = fmVar;
        mo160709A().f327715d = i2;
        C109490n A = mo160709A();
        A.getClass();
        C87412m.m108594g(fmVar2, "transResult");
        boolean z = false;
        A.f327722n = 0;
        long j = fmVar2.f183149e;
        Iterator<C64368fm> it = A.f327717f.f327727e.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            C64368fm next = it.next();
            int i4 = i3 + 1;
            if (i3 >= 0) {
                if (next.f183149e == j) {
                    A.f327721j = i3;
                }
                i3 = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        int i5 = A.f327721j;
        Log.m105924i("MicroMsg.EditorEditCaptionView", "scrollToTimeMs " + fmVar2.f183149e + ' ' + A.f327721j);
        RecyclerView.LayoutManager layoutManager = A.f327716e.getLayoutManager();
        if (layoutManager != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i5));
            RecyclerView.LayoutManager layoutManager2 = layoutManager;
            C117292a.m165358d(layoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView", "selectCaption", "(Lcom/tencent/mm/protocal/protobuf/CCTransResult;)V", "Undefined", "scrollToPosition", "(I)V");
            layoutManager.scrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(layoutManager2, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView", "selectCaption", "(Lcom/tencent/mm/protocal/protobuf/CCTransResult;)V", "Undefined", "scrollToPosition", "(I)V");
        }
        ((C119157j) C119157j.f356862d).mo183869C(A.f327723o, 0);
        mo160709A().f327717f.f327727e.clear();
        C109490n A2 = mo160709A();
        List list = this.f327694t.get(i2);
        A2.getClass();
        C87412m.m108594g(list, "items");
        A2.f327717f.f327727e.addAll(list);
        mo160709A().f327717f.notifyDataSetChanged();
        mo160709A().f327718g.mo104022e();
        EditorPanelHolder editorPanelHolder = this.f327685h;
        if (!(editorPanelHolder.f315616h != null)) {
            editorPanelHolder.setCoverByKeyboard(true);
            if (mo160709A().f327719h != null) {
                z = true;
            }
            if (!z) {
                mo160709A().setCancelClickListener(new C109486j(this));
                mo160709A().setSureClickListener(new C109487k(this));
            }
            EditorPanelHolder.m142603c(this.f327685h, mo160709A(), (ViewGroup.LayoutParams) null, 2, (Object) null);
            this.f327685h.setOnVisibleChangeCallback(new C109488l(this));
        }
        this.f327685h.setShow(true);
    }

    /* renamed from: H */
    public final void mo160716H(byte[] bArr, int i, int i2, String str) {
        T t;
        boolean z;
        byte[] bArr2 = bArr;
        C87412m.m108594g(bArr2, "transResult");
        try {
            C64368fm fmVar = new C64368fm();
            try {
                fmVar.parseFrom(bArr2);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
                fmVar = null;
            }
            if (fmVar != null) {
                int i3 = 0;
                for (T next : this.f327696v) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        C92010c cVar = (C92010c) next;
                        Iterator<T> it = cVar.f263432g.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            if (((C64368fm) t).f183152h == fmVar.f183152h) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        C64368fm fmVar2 = (C64368fm) t;
                        if (fmVar2 != null) {
                            mo160710B().mo10969m(i3, fmVar);
                            cVar.f263433h = i;
                            cVar.f263434i = i2;
                            cVar.f263435j = str;
                            fmVar2.f183148d = fmVar.f183148d;
                            Bundle bundle = new Bundle();
                            bundle.putInt("PARAM_1_INT", i3);
                            bundle.putByteArray("PARAM_1_BYTEARRAY", cVar.toProtoBuf().toByteArray());
                            this.f291492d.mo14585p(C101198e.C101199b.EDIT_ADD_CAPTION, bundle);
                        } else {
                            int i5 = i;
                            int i6 = i2;
                            String str2 = str;
                        }
                        i3 = i4;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
        } catch (IOException e2) {
            Log.printErrStackTrace("MicroMsg.EditorCaptionPlugin", e2, "", new Object[0]);
        }
    }

    /* renamed from: c */
    public void mo138712c(long j) {
        if (this.f327697w) {
            mo160710B().mo10966j(0, j);
            mo160710B().mo10966j(1, j);
        }
    }

    /* renamed from: d */
    public void mo138713d(C109202j.C99301e eVar) {
    }

    public void onFinish() {
    }

    public void release() {
        mo160709A().f327718g.f220015b = null;
        for (HashMap entrySet : this.f327692r) {
            for (Map.Entry value : entrySet.entrySet()) {
                C61435b bVar = (C61435b) value.getValue();
                bVar.getClass();
                C86709a0.m107529k().f251779b.mo123470p(3835, bVar);
                try {
                    bVar.f174692u = true;
                    C110052b bVar2 = bVar.f174680f;
                    if (bVar2 != null) {
                        bVar2.mo161388g();
                    }
                    bVar.f174680f = null;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.EditCaptionDataManager", e, "", new Object[0]);
                }
            }
        }
    }

    public void reset() {
        this.f327699y = 0;
        this.f327700z = 0;
        this.f327689o.setVisibility(4);
        this.f327697w = false;
        for (C92010c cVar : this.f327696v) {
            cVar.f263432g.clear();
        }
        for (HashMap clear : this.f327692r) {
            clear.clear();
        }
    }

    /* renamed from: s */
    public void mo159389s(C96552p0 p0Var, long j, boolean z) {
        this.f327693s.get(0).clear();
        if (p0Var != null) {
            for (C106205q0 q0Var : p0Var.mo134618o()) {
                String str = q0Var.f316490a;
                C110801c cVar = q0Var.f316501l;
                C28564a aVar = new C28564a(str, cVar.f331466d, cVar.f331467e, cVar.f331468f);
                this.f327693s.get(0).add(aVar);
                Log.m105924i("MicroMsg.EditorCaptionPlugin", "update script:" + aVar);
            }
        }
        if (this.f327697w) {
            mo160711C(0);
            mo160713E(0);
        }
    }

    public void setVisibility(int i) {
        View view = this.f327687j;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorCaptionPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorCaptionPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        ArrayList parcelableArrayList;
        C87412m.m108594g(recordConfigProvider, "configProvider");
        Bundle bundle = recordConfigProvider.f272912M;
        if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("media_list")) != null) {
            int i = 0;
            for (Object next : parcelableArrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    GalleryItem$MediaItem galleryItem$MediaItem = (GalleryItem$MediaItem) next;
                    if (galleryItem$MediaItem.getType() == 2) {
                        String str = galleryItem$MediaItem.f162747d;
                        C87412m.m108593f(str, "item.mOriginalPath");
                        mo160717y(str);
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* renamed from: y */
    public final void mo160717y(String str) {
        C87412m.m108594g(str, "path");
        if (!C86013q1.m106450k(str)) {
            Log.m105920e("MicroMsg.EditorCaptionPlugin", "file not exist " + str);
        } else if (this.f327692r.get(0).get(str) == null) {
            this.f327692r.get(0).put(str, new C61435b());
        }
    }

    /* renamed from: z */
    public final void mo160718z(int i) {
        C10718o B = mo160710B();
        int i2 = C10718o.f32149J;
        B.mo10965i(i, (String) null);
        this.f327689o.setVisibility(4);
    }
}
