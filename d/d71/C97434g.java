package d71;

import ai2.C92015i;
import al3.C0086a;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import b71.C92190b;
import bi2.C92262a;
import c71.C92360a;
import c71.C92366f;
import c71.C92367g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.p014mm.plugin.emojicapture.p841ui.EmojiCaptureUI;
import com.tencent.p014mm.plugin.emojicapture.p841ui.EmojiVideoPlayTextureView;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.EditorItemContainer;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.EmojiEditorItemView;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.TextEditorItemView;
import com.tencent.p014mm.plugin.emojicapture.proxy.CgiEmojiTextSpamProxy;
import com.tencent.p014mm.plugin.emojicapture.proxy.EmojiCaptureProxy;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import h71.C98317b;
import h71.C98318c;
import java.util.ArrayList;
import java.util.List;
import nj3.C76912y0;
import o40.C61926c;
import p911ml.C76777a;
import p911ml.C76778b;
import p911ml.C76781c;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C89779i0;
import rh3.C101383g;
import rx3.C13598b0;
import y61.C102813c;
import y61.C102814d;
import z51.C39315g;
import zc3.C103010b;

/* renamed from: d71.g */
public final class C97434g implements C102813c {

    /* renamed from: a */
    public Context f285988a;

    /* renamed from: b */
    public C102814d f285989b;

    /* renamed from: c */
    public EmojiCaptureUI.C93283a f285990c;

    /* renamed from: d */
    public final String f285991d;

    /* renamed from: e */
    public final EmojiCaptureReporter f285992e;

    /* renamed from: f */
    public String f285993f;

    /* renamed from: g */
    public int f285994g;

    /* renamed from: h */
    public boolean f285995h;

    /* renamed from: i */
    public boolean f285996i;

    /* renamed from: j */
    public boolean f285997j;

    /* renamed from: k */
    public boolean f285998k;

    /* renamed from: l */
    public final C96905d f285999l;

    /* renamed from: m */
    public final CgiEmojiTextSpamProxy f286000m;

    /* renamed from: n */
    public C92190b f286001n = new C92190b();

    /* renamed from: o */
    public C92366f f286002o;

    /* renamed from: p */
    public final C97437c f286003p = new C97437c(this);

    /* renamed from: q */
    public final Runnable f286004q = new C97435a(this);

    /* renamed from: d71.g$a */
    public static final class C97435a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C97434g f286005d;

        public C97435a(C97434g gVar) {
            this.f286005d = gVar;
        }

        public final void run() {
            this.f286005d.f285990c.mo127992g();
            C76912y0.makeText(this.f286005d.f285988a, (int) C0966R.string.c68, 0).show();
            this.f286005d.mo136705k();
        }
    }

    /* renamed from: d71.g$b */
    public static final class C97436b implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C97434g f286006d;

        public C97436b(C97434g gVar) {
            this.f286006d = gVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f286006d.mo136703i();
        }
    }

    /* renamed from: d71.g$c */
    public static final class C97437c implements C76777a {

        /* renamed from: a */
        public final /* synthetic */ C97434g f286007a;

        /* renamed from: d71.g$c$a */
        public static final class C97438a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C97434g f286008d;

            /* renamed from: e */
            public final /* synthetic */ boolean f286009e;

            /* renamed from: f */
            public final /* synthetic */ String f286010f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C97438a(C97434g gVar, boolean z, String str) {
                super(0);
                this.f286008d = gVar;
                this.f286009e = z;
                this.f286010f = str;
            }

            public Object invoke() {
                MMHandlerThread.removeRunnable(this.f286008d.f286004q);
                this.f286008d.f285990c.mo127992g();
                if (this.f286009e) {
                    this.f286008d.f285990c.mo127989d(true, this.f286010f);
                } else {
                    C76912y0.makeText(this.f286008d.f285988a, (int) C0966R.string.c68, 0).show();
                    this.f286008d.mo136705k();
                }
                return C13598b0.f38549a;
            }
        }

        public C97437c(C97434g gVar) {
            this.f286007a = gVar;
        }

        /* renamed from: a */
        public void mo95657a(long j, boolean z, String str) {
            C61926c.m72668M(new C97438a(this.f286007a, z, str));
        }
    }

    /* renamed from: d71.g$d */
    public static final class C97439d extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f286011d;

        /* renamed from: e */
        public final /* synthetic */ C97434g f286012e;

        /* renamed from: f */
        public final /* synthetic */ String f286013f;

        /* renamed from: g */
        public final /* synthetic */ int f286014g;

        /* renamed from: h */
        public final /* synthetic */ boolean f286015h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97439d(C89779i0 i0Var, C97434g gVar, String str, int i, boolean z) {
            super(1);
            this.f286011d = i0Var;
            this.f286012e = gVar;
            this.f286013f = str;
            this.f286014g = i;
            this.f286015h = z;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.f286011d.dismiss();
            if (booleanValue) {
                C76912y0.makeText(this.f286012e.f285988a, (int) C0966R.string.c_t, 0).show();
            } else {
                C97434g.m125460g(this.f286012e, this.f286013f, this.f286014g, this.f286015h);
            }
            return C13598b0.f38549a;
        }
    }

    public C97434g(Context context, C102814d dVar, EmojiCaptureUI.C93283a aVar, String str, EmojiCaptureReporter emojiCaptureReporter) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(dVar, "view");
        C87412m.m108594g(aVar, "uiNavigation");
        C87412m.m108594g(emojiCaptureReporter, "reporter");
        this.f285988a = context;
        this.f285989b = dVar;
        this.f285990c = aVar;
        this.f285991d = str;
        this.f285992e = emojiCaptureReporter;
        C96905d dVar2 = new C96905d(context);
        this.f285999l = dVar2;
        this.f286000m = new CgiEmojiTextSpamProxy(dVar2);
    }

    /* renamed from: g */
    public static final void m125460g(C97434g gVar, String str, int i, boolean z) {
        gVar.getClass();
        C8479f0 f0Var = new C8479f0();
        T textItem = gVar.f285989b.getItemContainer().getTextItem();
        f0Var.f27484d = textItem;
        if (textItem == null) {
            EditorItemContainer itemContainer = gVar.f285989b.getItemContainer();
            T textEditorItemView = new TextEditorItemView(itemContainer.getContext(), (AttributeSet) null);
            itemContainer.f269359g.addView(textEditorItemView, new RelativeLayout.LayoutParams(-1, -1));
            textEditorItemView.mo137605b(itemContainer.getValidRect(), itemContainer.getContext().getResources().getDimension(C0966R.dimen.a3c));
            itemContainer.f269360h.mo94749a(itemContainer.getValidRect(), itemContainer.getContext().getResources().getDimension(C0966R.dimen.a3c));
            f0Var.f27484d = textEditorItemView;
            textEditorItemView.setOnClickListener(new C97444l(gVar, f0Var));
        }
        ((TextEditorItemView) f0Var.f27484d).mo149559f(str, i, z);
        gVar.f285989b.getItemContainer().setEditing((C98318c) f0Var.f27484d);
    }

    /* renamed from: a */
    public boolean mo136696a() {
        Log.m105924i("MicroMsg.EditorPresenter", "onBack: " + this.f285989b.mo128104q() + ' ' + this.f285989b.mo128094c() + ' ' + this.f285989b.mo128098f());
        if (!this.f285989b.mo128104q()) {
            return false;
        }
        if (this.f285989b.mo128094c()) {
            this.f285989b.mo128097e(false, (CharSequence) null, 0);
            return true;
        } else if (this.f285989b.mo128098f()) {
            this.f285989b.mo128093b(false);
            return true;
        } else {
            this.f285998k = false;
            this.f285997j = false;
            this.f285993f = null;
            this.f285995h = false;
            this.f285996i = false;
            EmojiVideoPlayTextureView videoPlayView = this.f285989b.getVideoPlayView();
            C86013q1.m106447h(videoPlayView != null ? videoPlayView.getVideoPath() : null);
            this.f285989b.reset();
            EditorItemContainer itemContainer = this.f285989b.getItemContainer();
            itemContainer.mo128121b();
            itemContainer.f269359g.removeAllViews();
            this.f286002o = null;
            mo136706l(true);
            this.f285990c.mo127986a();
            EmojiCaptureReporter emojiCaptureReporter = this.f285992e;
            EmojiCaptureReporter.m117776b(9, emojiCaptureReporter.f269128d, 0, 0, 0, 0, 0, 0, 0, emojiCaptureReporter.f269127G);
            return true;
        }
    }

    /* renamed from: b */
    public void mo136697b(String str, int i, boolean z) {
        Log.m105924i("MicroMsg.EditorPresenter", "updateText " + str);
        Context context = this.f285988a;
        C97439d dVar = new C97439d(C89779i0.m112248e(context, context.getString(C0966R.string.gas), true, 0, (DialogInterface.OnCancelListener) null), this, str, i, z);
        if (Util.isNullOrNil(str)) {
            dVar.invoke(Boolean.FALSE);
        } else {
            this.f286000m.cgiEmojiTextSpam(str, new C31096f(dVar));
        }
    }

    /* renamed from: c */
    public void mo136698c(IEmojiInfo iEmojiInfo, Matrix matrix) {
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        if (!(iEmojiInfo instanceof EmojiInfo)) {
            return;
        }
        if (this.f285989b.getItemContainer().getAllEmojiMd5().size() >= 8) {
            C76912y0.makeText(this.f285988a, (int) C0966R.string.c4p, 0).show();
            return;
        }
        EmojiEditorItemView emojiEditorItemView = new EmojiEditorItemView(this.f285988a);
        emojiEditorItemView.setEmojiInfo(iEmojiInfo);
        emojiEditorItemView.resume();
        EditorItemContainer itemContainer = this.f285989b.getItemContainer();
        itemContainer.getClass();
        itemContainer.mo128122c(new C98317b(itemContainer, emojiEditorItemView, matrix));
    }

    /* renamed from: d */
    public void mo136699d() {
        Class cls = C39315g.class;
        if (!Util.isNullOrNil(this.f285991d)) {
            C103010b provider = ((C39315g) C86312j.m106911c(cls)).getProvider();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EMOJI_CAPTURE_IMITATE_SAVED_BOOLEAN;
            if (!((Boolean) provider.mo138032q(aVar, Boolean.FALSE)).booleanValue()) {
                Context context = this.f285988a;
                C77389a aVar2 = new C77389a();
                aVar2.f225660q = C0086a.m38a(context).getString(C0966R.string.bzk);
                aVar2.f225663t = C0086a.m38a(context).getString(C0966R.string.bzj);
                aVar2.f225623F = new C97436b(this);
                C77398g gVar = new C77398g(context, C0966R.style.a66);
                gVar.mo107525e(aVar2);
                gVar.show();
                ((C39315g) C86312j.m106911c(cls)).getProvider().mo138034s(aVar, Boolean.TRUE);
                return;
            }
        }
        mo136703i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050 A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo136700e() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "removeBg "
            r0.append(r1)
            boolean r1 = r3.f285998k
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.EditorPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            b71.b r0 = r3.f286001n
            boolean r0 = r0.f263867g
            r1 = 0
            if (r0 != 0) goto L_0x0021
            return r1
        L_0x0021:
            y61.d r0 = r3.f285989b
            com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView r0 = r0.getVideoPlayView()
            r2 = 1
            if (r0 == 0) goto L_0x0038
            s62.l r0 = r0.f269192o
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.mo162310e()
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 != r2) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x0050
            boolean r0 = r3.f285998k
            r0 = r0 ^ r2
            r3.f285998k = r0
            y61.d r0 = r3.f285989b
            com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView r0 = r0.getVideoPlayView()
            if (r0 == 0) goto L_0x004d
            boolean r1 = r3.f285998k
            r0.setRemoveBackground(r1)
        L_0x004d:
            boolean r0 = r3.f285998k
            return r0
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d71.C97434g.mo136700e():boolean");
    }

    /* renamed from: f */
    public boolean mo136701f() {
        Log.m105924i("MicroMsg.EditorPresenter", "speedUp " + this.f285997j);
        EmojiVideoPlayTextureView videoPlayView = this.f285989b.getVideoPlayView();
        if (C87412m.m108588a(videoPlayView != null ? Float.valueOf(videoPlayView.getPlayRate()) : null, 1.0f)) {
            EmojiVideoPlayTextureView videoPlayView2 = this.f285989b.getVideoPlayView();
            if (videoPlayView2 != null) {
                videoPlayView2.setPlayRate(2.0f);
            }
            this.f285997j = true;
            return true;
        }
        EmojiVideoPlayTextureView videoPlayView3 = this.f285989b.getVideoPlayView();
        if (videoPlayView3 != null) {
            videoPlayView3.setPlayRate(1.0f);
        }
        this.f285997j = false;
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cb A[SYNTHETIC, Splitter:B:29:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e8 A[SYNTHETIC, Splitter:B:34:0x00e8] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014c A[SYNTHETIC, Splitter:B:51:0x014c] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0169 A[SYNTHETIC, Splitter:B:56:0x0169] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.storage.emotion.EmojiInfo mo136702h(java.lang.String r10, int r11, java.util.ArrayList<java.lang.String> r12) {
        /*
            r9 = this;
            b71.b r0 = r9.f286001n
            java.lang.String r0 = r0.f263864d
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106456q(r0)
            com.tencent.mm.storage.emotion.EmojiInfo r2 = new com.tencent.mm.storage.emotion.EmojiInfo
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            nl.j r4 = p207nl.C89008j.f256613a
            java.lang.String r4 = r4.mo123385d()
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r4 != 0) goto L_0x002b
            com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r3)
        L_0x002b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "create loading EmojiInfo. md5: "
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = " outputPath: "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "MicroMsg.EditorPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r2.field_md5 = r1
            java.lang.String r0 = "capture"
            r2.field_groupId = r0
            r0 = 65
            r2.field_catalog = r0
            r2.field_attachedText = r10
            r10 = 320(0x140, float:4.48E-43)
            r2.field_width = r10
            r2.field_height = r10
            r10 = 1
            r2.field_captureStatus = r10
            java.lang.String r0 = "setAttachedEmojiMD5 bos close failure, msg: "
            java.lang.String r1 = "setAttachedEmojiMD5 oos close failure, msg: "
            java.lang.String r3 = "MicroMsg.emoji.EmojiInfo"
            r4 = 0
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00ad, all -> 0x00a9 }
            r5.<init>()     // Catch:{ Exception -> 0x00ad, all -> 0x00a9 }
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r6.writeObject(r12)     // Catch:{ Exception -> 0x00a1 }
            byte[] r12 = r5.toByteArray()     // Catch:{ Exception -> 0x00a1 }
            r2.field_attachedEmojiMD5 = r12     // Catch:{ Exception -> 0x00a1 }
            r6.close()     // Catch:{ Exception -> 0x007e }
            goto L_0x0095
        L_0x007e:
            r12 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            java.lang.String r12 = r12.getMessage()
            r6.append(r12)
            java.lang.String r12 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r12)
        L_0x0095:
            r5.close()     // Catch:{ Exception -> 0x009a }
            goto L_0x0103
        L_0x009a:
            r12 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00f2
        L_0x00a1:
            r12 = move-exception
            goto L_0x00b0
        L_0x00a3:
            r10 = move-exception
            goto L_0x014a
        L_0x00a6:
            r12 = move-exception
            r6 = r4
            goto L_0x00b0
        L_0x00a9:
            r10 = move-exception
            r5 = r4
            goto L_0x014a
        L_0x00ad:
            r12 = move-exception
            r5 = r4
            r6 = r5
        L_0x00b0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0148 }
            r7.<init>()     // Catch:{ all -> 0x0148 }
            java.lang.String r8 = "setAttachedEmojiMD5 failure, msg: "
            r7.append(r8)     // Catch:{ all -> 0x0148 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0148 }
            r7.append(r12)     // Catch:{ all -> 0x0148 }
            java.lang.String r12 = r7.toString()     // Catch:{ all -> 0x0148 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r12)     // Catch:{ all -> 0x0148 }
            if (r6 == 0) goto L_0x00e6
            r6.close()     // Catch:{ Exception -> 0x00cf }
            goto L_0x00e6
        L_0x00cf:
            r12 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            java.lang.String r12 = r12.getMessage()
            r6.append(r12)
            java.lang.String r12 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r12)
        L_0x00e6:
            if (r5 == 0) goto L_0x0103
            r5.close()     // Catch:{ Exception -> 0x00ec }
            goto L_0x0103
        L_0x00ec:
            r12 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x00f2:
            r1.append(r0)
            java.lang.String r12 = r12.getMessage()
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r12)
        L_0x0103:
            java.lang.String r12 = r9.f285991d
            r2.field_imitateMd5 = r12
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter r12 = r9.f285992e
            long r0 = r12.f269128d
            r2.field_captureEnterTime = r0
            b71.b r12 = r9.f286001n
            rh3.g r12 = r12.f263865e
            if (r12 == 0) goto L_0x0115
            java.lang.String r4 = r12.f296976a
        L_0x0115:
            r2.field_lensId = r4
            if (r11 != 0) goto L_0x011c
            java.lang.String r10 = ""
            goto L_0x0138
        L_0x011c:
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r0 = 0
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12[r0] = r11
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r12, r10)
            java.lang.String r11 = "%06X"
            java.lang.String r10 = java.lang.String.format(r11, r10)
            java.lang.String r11 = "format(format, *args)"
            gy3.C87412m.m108593f(r10, r11)
        L_0x0138:
            r2.field_attachTextColor = r10
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter r10 = r9.f285992e
            int r10 = r10.f269127G
            r2.field_captureScene = r10
            com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureProxy r10 = com.tencent.p014mm.plugin.emojicapture.proxy.EmojiCaptureProxy.f269149i
            r10.createEmojiInfo(r2)
            return r2
        L_0x0148:
            r10 = move-exception
            r4 = r6
        L_0x014a:
            if (r4 == 0) goto L_0x0167
            r4.close()     // Catch:{ Exception -> 0x0150 }
            goto L_0x0167
        L_0x0150:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r1)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r11)
        L_0x0167:
            if (r5 == 0) goto L_0x0184
            r5.close()     // Catch:{ Exception -> 0x016d }
            goto L_0x0184
        L_0x016d:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r11)
        L_0x0184:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d71.C97434g.mo136702h(java.lang.String, int, java.util.ArrayList):com.tencent.mm.storage.emotion.EmojiInfo");
    }

    /* renamed from: i */
    public final void mo136703i() {
        int i;
        int i2;
        int i3;
        StringBuilder sb = new StringBuilder();
        sb.append("start mix ");
        EmojiVideoPlayTextureView videoPlayView = this.f285989b.getVideoPlayView();
        sb.append(videoPlayView != null ? videoPlayView.getVideoPath() : null);
        Log.m105924i("MicroMsg.EditorPresenter", sb.toString());
        C92360a aVar = new C92360a(this.f285989b.getItemContainer().getValidRect());
        List<C98318c> allItemViews = this.f285989b.getItemContainer().getAllItemViews();
        ArrayList<String> allEmojiMd5 = this.f285989b.getItemContainer().getAllEmojiMd5();
        TextEditorItemView textItem = this.f285989b.getItemContainer().getTextItem();
        int textColor = textItem != null ? textItem.getTextColor() : 0;
        String attachedText = this.f285989b.getItemContainer().getAttachedText();
        for (C98318c a : allItemViews) {
            C92262a a2 = C92015i.C92016a.m115609a(a, (Matrix) null, 1, (Object) null);
            if (a2 != null) {
                ((ArrayList) aVar.f264292c).add(a2);
            }
        }
        if (this.f286002o == null) {
            this.f285992e.f269138q = this.f285989b.getItemContainer().getAttachedText();
            EmojiCaptureReporter emojiCaptureReporter = this.f285992e;
            emojiCaptureReporter.f269139r = textColor;
            emojiCaptureReporter.f269140s = this.f285998k;
            emojiCaptureReporter.f269141t = this.f285997j;
            emojiCaptureReporter.f269142u = allEmojiMd5.size();
            EmojiCaptureReporter emojiCaptureReporter2 = this.f285992e;
            long currentTimeMillis = System.currentTimeMillis();
            EmojiCaptureReporter emojiCaptureReporter3 = this.f285992e;
            int i4 = textColor;
            emojiCaptureReporter2.f269137p = currentTimeMillis - emojiCaptureReporter3.f269128d;
            C101383g gVar = this.f286001n.f263865e;
            emojiCaptureReporter3.f269121A = gVar != null ? gVar.f296976a : null;
            if (!Util.isNullOrNil(emojiCaptureReporter3.f269138q)) {
                emojiCaptureReporter3.f269138q = emojiCaptureReporter3.f269138q.replace(",", " ");
            }
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[20];
            objArr[0] = Long.valueOf(emojiCaptureReporter3.f269128d);
            objArr[1] = Long.valueOf(emojiCaptureReporter3.f269137p);
            objArr[2] = Long.valueOf(emojiCaptureReporter3.f269135n);
            objArr[3] = Long.valueOf(emojiCaptureReporter3.f269136o);
            objArr[4] = 0;
            objArr[5] = 0;
            objArr[6] = emojiCaptureReporter3.f269138q;
            objArr[7] = Integer.toHexString(emojiCaptureReporter3.f269139r & 16777215);
            objArr[8] = Integer.valueOf(emojiCaptureReporter3.f269140s ? 1 : 0);
            objArr[9] = Integer.valueOf(emojiCaptureReporter3.f269141t ? 1 : 0);
            objArr[10] = Integer.valueOf(emojiCaptureReporter3.f269142u);
            objArr[11] = Integer.valueOf(emojiCaptureReporter3.f269143v ? 1 : 0);
            objArr[12] = Integer.valueOf(emojiCaptureReporter3.f269144w);
            objArr[13] = emojiCaptureReporter3.f269145x;
            objArr[14] = "";
            objArr[15] = "";
            objArr[16] = Integer.valueOf(emojiCaptureReporter3.f269146y ? 2 : 1);
            objArr[17] = emojiCaptureReporter3.f269147z;
            objArr[18] = emojiCaptureReporter3.f269121A;
            objArr[19] = emojiCaptureReporter3.f269124D;
            nVar.mo160131h(15989, objArr);
            EmojiInfo h = mo136702h(attachedText, i4, allEmojiMd5);
            C92367g gVar2 = C92367g.f264320a;
            C92190b bVar = this.f286001n;
            int i5 = bVar.f263861a;
            long j = h.field_captureEnterTime;
            String str = bVar.f263863c;
            EmojiVideoPlayTextureView videoPlayView2 = this.f285989b.getVideoPlayView();
            i2 = 4;
            i = 5;
            this.f286002o = gVar2.mo126338a(i5, j, str, aVar, videoPlayView2 != null ? (int) videoPlayView2.getPlayRate() : 1, this.f285998k, this.f286001n.f263865e, h);
            i3 = 3;
        } else {
            i3 = 3;
            i2 = 4;
            i = 5;
            EmojiCaptureProxy.f269149i.deleteEmojiInfoByEnterTime(this.f285992e.f269128d);
            EmojiInfo h2 = mo136702h(attachedText, textColor, allEmojiMd5);
            C92367g gVar3 = C92367g.f264320a;
            C92190b bVar2 = this.f286001n;
            int i6 = bVar2.f263861a;
            long j2 = h2.field_captureEnterTime;
            String str2 = bVar2.f263863c;
            EmojiVideoPlayTextureView videoPlayView3 = this.f285989b.getVideoPlayView();
            this.f286002o = gVar3.mo126338a(i6, j2, str2, aVar, videoPlayView3 != null ? (int) videoPlayView3.getPlayRate() : 1, this.f285998k, this.f286001n.f263865e, h2);
        }
        mo136704j();
        int i7 = this.f286001n.f263861a;
        if (i7 == i3 || i7 == i2 || i7 == i) {
            MMHandlerThread.removeRunnable(this.f286004q);
            MMHandlerThread.postToMainThreadDelayed(this.f286004q, 60000);
            EmojiCaptureUI.C93283a aVar2 = this.f285990c;
            Context context = this.f285988a;
            String string = context.getString(C0966R.string.c69);
            C87412m.m108593f(string, "context.getString(R.string.emoji_generating)");
            aVar2.mo127991f(context, string, false, 0, (DialogInterface.OnCancelListener) null);
            C76778b bVar3 = C76778b.f224582a;
            long j3 = this.f286001n.f263862b;
            C97437c cVar = this.f286003p;
            C87412m.m108594g(cVar, "callback");
            C61926c.m72668M(new C76781c(j3, cVar));
            return;
        }
        EmojiCaptureUI.C93283a.C93284a.m117801a(this.f285990c, true, (String) null, 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r0 != null ? r0.mo162310e() : false) == true) goto L_0x0020;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo136704j() {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.EditorPresenter"
            java.lang.String r1 = "pause"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            y61.d r0 = r4.f285989b
            com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView r0 = r0.getVideoPlayView()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001f
            s62.l r0 = r0.f269192o
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.mo162310e()
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 != r2) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            if (r2 == 0) goto L_0x0047
            y61.d r0 = r4.f285989b
            com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView r0 = r0.getVideoPlayView()
            if (r0 == 0) goto L_0x0047
            s62.l r2 = r0.f269192o
            if (r2 == 0) goto L_0x0045
            boolean r2 = r2.mo162310e()
            if (r2 == 0) goto L_0x0045
            s62.l r2 = r0.f269192o
            if (r2 == 0) goto L_0x003b
            r2.mo162311f()
        L_0x003b:
            e71.a r2 = r0.f269190j
            e71.e r3 = new e71.e
            r3.<init>(r0)
            r2.mo157713b(r3)
        L_0x0045:
            r0.f269200w = r1
        L_0x0047:
            y61.d r0 = r4.f285989b
            com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer r0 = r0.getItemContainer()
            r0.mo128121b()
            r4.mo136706l(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d71.C97434g.mo136704j():void");
    }

    /* renamed from: k */
    public void mo136705k() {
        Log.m105924i("MicroMsg.EditorPresenter", "resume");
        EmojiVideoPlayTextureView videoPlayView = this.f285989b.getVideoPlayView();
        if (videoPlayView != null) {
            videoPlayView.start();
        }
        EditorItemContainer itemContainer = this.f285989b.getItemContainer();
        int childCount = itemContainer.f269359g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = itemContainer.f269359g.getChildAt(i);
            if (childAt instanceof C98318c) {
                ((C98318c) childAt).resume();
            }
        }
        mo136706l(true);
    }

    /* renamed from: l */
    public final void mo136706l(boolean z) {
        Log.m105924i("MicroMsg.EditorPresenter", "toggleTouch: " + z);
        Context context = this.f285988a;
        if (context instanceof Activity) {
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            if (z) {
                activity.getWindow().clearFlags(16);
            } else {
                activity.getWindow().addFlags(16);
            }
        }
    }
}
