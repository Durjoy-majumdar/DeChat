package com.tencent.p014mm.plugin.recordvideo.p095ui;

import ai2.C92021o;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import ei2.C58605a;
import ei2.C97652g;
import gy3.C87412m;
import kotlin.Metadata;
import p396x6.C23023u;
import te3.C101773e70;
import wh2.C102445a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/FakeVideoViewLayer;", "Landroid/widget/RelativeLayout;", "Lwh2/a;", "Lxh/h9;", "videoEditData", "Lrx3/b0;", "setFakeVideoInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer */
public final class FakeVideoViewLayer extends RelativeLayout implements C102445a {

    /* renamed from: u */
    public static final /* synthetic */ int f273026u = 0;

    /* renamed from: d */
    public final String f273027d = "MicroMsg.FakeVideoViewLayer";

    /* renamed from: e */
    public C101773e70 f273028e;

    /* renamed from: f */
    public C23023u f273029f;

    /* renamed from: g */
    public long f273030g;

    /* renamed from: h */
    public long f273031h;

    /* renamed from: i */
    public AudioCacheInfo f273032i;

    /* renamed from: j */
    public boolean f273033j;

    /* renamed from: n */
    public ImageView f273034n;

    /* renamed from: o */
    public C97652g f273035o;

    /* renamed from: p */
    public boolean f273036p;

    /* renamed from: q */
    public boolean f273037q;

    /* renamed from: r */
    public int f273038r;

    /* renamed from: s */
    public int f273039s;

    /* renamed from: t */
    public int f273040t;

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer$a */
    public static final class C94435a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FakeVideoViewLayer f273041d;

        /* renamed from: e */
        public final /* synthetic */ C97652g f273042e;

        public C94435a(FakeVideoViewLayer fakeVideoViewLayer, C97652g gVar) {
            this.f273041d = fakeVideoViewLayer;
            this.f273042e = gVar;
        }

        public final void run() {
            FakeVideoViewLayer fakeVideoViewLayer = this.f273041d;
            C97652g gVar = this.f273042e;
            int i = FakeVideoViewLayer.f273026u;
            fakeVideoViewLayer.mo129894e(gVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FakeVideoViewLayer(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.graphics.Matrix} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: ei2.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: ei2.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: ei2.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: ei2.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129890a(boolean r23) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = r1.f273027d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "LogStory: playFakeLayer "
            r2.append(r3)
            te3.e70 r3 = r1.f273028e
            r4 = 0
            if (r3 == 0) goto L_0x001a
            long r5 = r3.f298174w
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            goto L_0x001b
        L_0x001a:
            r3 = r4
        L_0x001b:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            x6.u r0 = r1.f273029f
            if (r0 == 0) goto L_0x002c
            r0.stop()
        L_0x002c:
            x6.u r0 = r1.f273029f
            if (r0 == 0) goto L_0x0033
            r0.release()
        L_0x0033:
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r0 = r1.f273032i
            r2 = 2
            r3 = 0
            r5 = 1
            if (r0 == 0) goto L_0x00b5
            if (r23 != 0) goto L_0x00b5
            c8.m r0 = new c8.m
            r0.<init>(r4, r4)
            b8.a$a r6 = new b8.a$a
            r6.<init>(r0)
            b8.c r0 = new b8.c
            r0.<init>(r6)
            android.content.Context r6 = r22.getContext()
            android.content.Context r7 = r22.getContext()
            r8 = 2131821604(0x7f110424, float:1.9275956E38)
            java.lang.String r7 = r7.getString(r8)
            java.lang.String r6 = p333e8.C20551y.m22319i(r6, r7)
            android.content.Context r7 = r22.getContext()
            x6.d r8 = new x6.d
            r8.<init>(r7)
            x6.c r7 = new x6.c
            r7.<init>()
            x6.u r9 = new x6.u
            r9.<init>(r8, r0, r7)
            r1.f273029f = r9
            jh2.m$a r0 = jh2.C60863m.f173403b     // Catch:{ Exception -> 0x00ab }
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r7 = r1.f273032i     // Catch:{ Exception -> 0x00ab }
            gy3.C87412m.m108591d(r7)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r8 = "userAgent"
            gy3.C87412m.m108593f(r6, r8)     // Catch:{ Exception -> 0x00ab }
            p7.o r10 = r0.mo85773a(r7, r6)     // Catch:{ Exception -> 0x00ab }
            p7.h r0 = new p7.h     // Catch:{ Exception -> 0x00ab }
            long r11 = r1.f273030g     // Catch:{ Exception -> 0x00ab }
            long r6 = r1.f273031h     // Catch:{ Exception -> 0x00ab }
            r8 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r8     // Catch:{ Exception -> 0x00ab }
            long r13 = r6 * r8
            r9 = r0
            r9.<init>(r10, r11, r13)     // Catch:{ Exception -> 0x00ab }
            x6.u r6 = r1.f273029f     // Catch:{ Exception -> 0x00ab }
            if (r6 != 0) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            r6.mo36262a(r5)     // Catch:{ Exception -> 0x00ab }
        L_0x009b:
            x6.u r6 = r1.f273029f     // Catch:{ Exception -> 0x00ab }
            if (r6 == 0) goto L_0x00a2
            r6.mo36325j(r0)     // Catch:{ Exception -> 0x00ab }
        L_0x00a2:
            x6.u r0 = r1.f273029f     // Catch:{ Exception -> 0x00ab }
            if (r0 != 0) goto L_0x00a7
            goto L_0x00b5
        L_0x00a7:
            r0.mo36329n(r2)     // Catch:{ Exception -> 0x00ab }
            goto L_0x00b5
        L_0x00ab:
            r0 = move-exception
            java.lang.String r6 = r1.f273027d
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r8 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r8, r7)
        L_0x00b5:
            int r0 = r22.getChildCount()
            r6 = 0
        L_0x00ba:
            if (r6 >= r0) goto L_0x00d8
            android.view.View r7 = r1.getChildAt(r6)
            boolean r8 = r7 instanceof com.tencent.p014mm.plugin.gif.MMAnimateView
            if (r8 == 0) goto L_0x00ca
            com.tencent.mm.plugin.gif.MMAnimateView r7 = (com.tencent.p014mm.plugin.gif.MMAnimateView) r7
            r7.resume()
            goto L_0x00d5
        L_0x00ca:
            boolean r8 = r7 instanceof ai2.C92021o
            if (r8 == 0) goto L_0x00d5
            ai2.o r7 = (ai2.C92021o) r7
            r7.f263480Q = r5
            r7.invalidate()
        L_0x00d5:
            int r6 = r6 + 1
            goto L_0x00ba
        L_0x00d8:
            boolean r0 = r1.f273037q
            if (r0 == 0) goto L_0x02ae
            te3.e70 r0 = r1.f273028e
            if (r0 == 0) goto L_0x02ae
            ei2.g r6 = r1.f273035o
            if (r6 == 0) goto L_0x00e7
            r6.mo136911d()
        L_0x00e7:
            android.widget.ImageView r6 = r1.f273034n
            if (r6 == 0) goto L_0x00ee
            r6.setImageBitmap(r4)
        L_0x00ee:
            zg2.m r6 = zg2.C103020m.f303985a
            android.content.Context r7 = r22.getContext()
            java.lang.String r8 = "context"
            gy3.C87412m.m108593f(r7, r8)
            int r13 = r1.f273038r
            int r14 = r1.f273039s
            int r8 = r1.f273040t
            java.lang.String r9 = "MicroMsg.mix_background.VideoEditStorageUtil"
            java.lang.String r10 = "reshow the fake story as frame retriever"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.LinkedList<te3.ea> r10 = r0.f298173v
            java.lang.String r11 = "storyEditorProtoData.baseItemData"
            gy3.C87412m.m108593f(r10, r11)
            java.util.Iterator r10 = r10.iterator()
        L_0x0118:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x020e
            java.lang.Object r11 = r10.next()
            te3.ea r11 = (te3.C64339ea) r11
            int r15 = r11.f182947d
            java.lang.String r3 = "fake story reshow the text editor item"
            if (r15 != r5) goto L_0x014f
            ai2.s r15 = new ai2.s
            r15.<init>(r11)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            java.lang.CharSequence r3 = r15.f263526g
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r3 = r3 ^ r5
            if (r3 != 0) goto L_0x013d
            r3 = r4
            goto L_0x0149
        L_0x013d:
            ai2.t r3 = new ai2.t
            r3.<init>(r7)
            r3.mo126004k(r15)
            bi2.a r3 = ai2.C92015i.C92016a.m115609a(r3, r4, r5, r4)
        L_0x0149:
            if (r3 == 0) goto L_0x0175
            r12.add(r3)
            goto L_0x0175
        L_0x014f:
            if (r15 != r2) goto L_0x0177
            ai2.f r3 = new ai2.f
            r3.<init>(r11)
            java.lang.String r11 = "fake story reshow the emoji editor item"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r11)
            ai2.g r11 = new ai2.g
            r11.<init>(r7)
            r11.f263455y = r5
            android.graphics.Matrix r15 = r3.f263447h
            r11.setViewMatrix(r15)
            com.tencent.mm.api.IEmojiInfo r3 = r3.f263446g
            r11.setEmojiInfo(r3)
            bi2.a r3 = ai2.C92015i.C92016a.m115609a(r11, r4, r5, r4)
            if (r3 == 0) goto L_0x0175
            r12.add(r3)
        L_0x0175:
            r3 = 0
            goto L_0x0118
        L_0x0177:
            r2 = 3
            java.lang.String r4 = "fake story reshow the position editor item"
            if (r15 != r2) goto L_0x019a
            ai2.m r2 = new ai2.m
            r2.<init>(r11)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            ai2.r r3 = new ai2.r
            r3.<init>(r7)
            r3.mo125997g(r2)
            r2 = 0
            bi2.a r3 = ai2.C92015i.C92016a.m115609a(r3, r2, r5, r2)
            if (r3 == 0) goto L_0x0196
            r12.add(r3)
        L_0x0196:
            r23 = r6
            r3 = 0
            goto L_0x0206
        L_0x019a:
            r2 = 4
            if (r15 != r2) goto L_0x01ce
            ai2.s r2 = new ai2.s
            r2.<init>(r11)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            java.lang.CharSequence r3 = r2.f263526g
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r3 = r3 ^ r5
            if (r3 != 0) goto L_0x01b0
            r2 = 0
            goto L_0x01c8
        L_0x01b0:
            ai2.u r3 = new ai2.u
            r3.<init>(r7)
            r3.setText(r2)
            android.graphics.Matrix r2 = r2.f263407f
            r3.setViewMatrix(r2)
            ai2.d r2 = ai2.C92011d.TIP
            r3.setSourceDataType(r2)
            r2 = 0
            bi2.a r3 = ai2.C92015i.C92016a.m115609a(r3, r2, r5, r2)
            r2 = r3
        L_0x01c8:
            if (r2 == 0) goto L_0x0196
            r12.add(r2)
            goto L_0x0196
        L_0x01ce:
            r2 = 5
            if (r15 != r2) goto L_0x0196
            long r2 = r0.f298160f
            r23 = r6
            long r5 = r0.f298159e
            long r2 = r2 - r5
            ai2.n r5 = new ai2.n
            r5.<init>(r11)
            r5.mo125920i(r2)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            ai2.o r2 = new ai2.o
            r2.<init>(r7)
            r2.f263481R = r5
            android.graphics.Matrix r3 = r5.f263407f
            r2.setViewMatrix(r3)
            java.util.ArrayList<te3.cs2> r3 = r5.f263463g
            r2.mo125958p(r3)
            r2.mo125922c()
            ai2.d r3 = ai2.C92011d.LYRICS
            r2.f263473I = r3
            r3 = 0
            r4 = 1
            bi2.a r2 = ai2.C92015i.C92016a.m115609a(r2, r3, r4, r3)
            if (r2 == 0) goto L_0x0206
            r12.add(r2)
        L_0x0206:
            r6 = r23
            r4 = r3
            r2 = 2
            r3 = 0
            r5 = 1
            goto L_0x0118
        L_0x020e:
            r3 = r4
            r23 = r6
            int r2 = r12.size()
            if (r2 != 0) goto L_0x0219
            goto L_0x02a0
        L_0x0219:
            if (r14 == 0) goto L_0x0284
            if (r13 != 0) goto L_0x021e
            goto L_0x0284
        L_0x021e:
            hi2.o r2 = hi2.C98464o.f288797a
            java.lang.String r3 = r0.f298158d
            java.lang.String r4 = "storyEditorProtoData.videoPath"
            gy3.C87412m.m108593f(r3, r4)
            hi2.o$a r2 = r2.mo137832a(r3)
            boolean r3 = r0.f298176y
            if (r3 != 0) goto L_0x0261
            if (r2 == 0) goto L_0x0238
            boolean r3 = r2.f288804g
            if (r3 != 0) goto L_0x0238
            r3 = 1
            goto L_0x0239
        L_0x0238:
            r3 = 0
        L_0x0239:
            if (r3 == 0) goto L_0x0261
            ei2.d r3 = new ei2.d
            r4 = r23
            float[] r10 = r4.mo142738f(r0)
            float[] r11 = r4.mo142739g(r0)
            int r15 = r2.f288798a
            int r0 = r2.f288799b
            r18 = 0
            r19 = 0
            r20 = 768(0x300, float:1.076E-42)
            r21 = 0
            r9 = r3
            r16 = r0
            r17 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            ei2.g r4 = new ei2.g
            r4.<init>(r3)
            goto L_0x02a1
        L_0x0261:
            r4 = r23
            ei2.d r2 = new ei2.d
            float[] r10 = r4.mo142738f(r0)
            float[] r11 = r4.mo142739g(r0)
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 768(0x300, float:1.076E-42)
            r21 = 0
            r9 = r2
            r17 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            ei2.g r4 = new ei2.g
            r4.<init>(r2)
            goto L_0x02a1
        L_0x0284:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "error width "
            r0.append(r2)
            r0.append(r13)
            java.lang.String r2 = " height "
            r0.append(r2)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
        L_0x02a0:
            r4 = r3
        L_0x02a1:
            r1.f273035o = r4
            if (r4 == 0) goto L_0x02ae
            r4.mo136912e()
            r2 = 1
            r1.f273036p = r2
            r1.mo129894e(r4)
        L_0x02ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.p095ui.FakeVideoViewLayer.mo129890a(boolean):void");
    }

    /* renamed from: b */
    public void mo129891b() {
        String str = this.f273027d;
        StringBuilder sb = new StringBuilder();
        sb.append("LogStory: stopFakeLayer ");
        C101773e70 e702 = this.f273028e;
        sb.append(e702 != null ? Long.valueOf(e702.f298174w) : null);
        Log.m105924i(str, sb.toString());
        C23023u uVar = this.f273029f;
        if (uVar != null) {
            uVar.stop();
        }
        C23023u uVar2 = this.f273029f;
        if (uVar2 != null) {
            uVar2.release();
        }
        this.f273029f = null;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof MMAnimateView) {
                ((MMAnimateView) childAt).mo129237x();
            } else if (childAt instanceof C92021o) {
                ((C92021o) childAt).f263480Q = false;
            }
        }
        this.f273036p = false;
        ImageView imageView = this.f273034n;
        if (imageView != null) {
            imageView.setImageBitmap((Bitmap) null);
        }
        ImageView imageView2 = this.f273034n;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        C97652g gVar = this.f273035o;
        if (gVar != null) {
            gVar.mo136911d();
        }
        this.f273035o = null;
    }

    /* renamed from: c */
    public void mo129892c() {
        String str = this.f273027d;
        StringBuilder sb = new StringBuilder();
        sb.append("LogStory: pauseFakeLayer ");
        C101773e70 e702 = this.f273028e;
        sb.append(e702 != null ? Long.valueOf(e702.f298174w) : null);
        Log.m105924i(str, sb.toString());
        C23023u uVar = this.f273029f;
        if (uVar != null) {
            uVar.mo36262a(false);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof MMAnimateView) {
                ((MMAnimateView) childAt).pause();
            } else if (childAt instanceof C92021o) {
                ((C92021o) childAt).f263480Q = false;
            }
        }
        this.f273036p = false;
        ImageView imageView = this.f273034n;
        if (imageView != null) {
            imageView.setImageBitmap((Bitmap) null);
        }
        ImageView imageView2 = this.f273034n;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        C97652g gVar = this.f273035o;
        if (gVar != null) {
            gVar.mo136911d();
        }
        this.f273035o = null;
    }

    /* renamed from: d */
    public boolean mo129893d() {
        return this.f273033j;
    }

    /* renamed from: e */
    public final void mo129894e(C97652g gVar) {
        if (!this.f273036p) {
            Log.m105924i(this.f273027d, "requestLoopFakeFrame stop");
        } else if (!C87412m.m108589b(gVar, this.f273035o)) {
            Log.m105924i(this.f273027d, "requestLoopFakeFrame frameRetriever not match");
        } else {
            C101773e70 e702 = this.f273028e;
            boolean z = true;
            if ((e702 != null && e702.f298176y) || !this.f273037q) {
                Log.m105924i(this.f273027d, "requestLoopFakeFrame local capture video or not useFakeImage");
                return;
            }
            C58605a a = gVar.mo126334a();
            ImageView imageView = this.f273034n;
            Long l = null;
            if (imageView != null) {
                imageView.setImageBitmap(a != null ? a.f167792a : null);
            }
            ImageView imageView2 = this.f273034n;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            if (a != null) {
                Long valueOf = Long.valueOf(a.f167793b);
                long longValue = valueOf.longValue();
                if (!(1 <= longValue && longValue < 1001) || !this.f273036p || !C87412m.m108589b(gVar, this.f273035o)) {
                    z = false;
                }
                if (z) {
                    l = valueOf;
                }
                if (l != null) {
                    long longValue2 = l.longValue();
                    ImageView imageView3 = this.f273034n;
                    if (imageView3 != null) {
                        imageView3.postDelayed(new C94435a(this, gVar), longValue2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
        r10 = hi2.C98464o.f288797a.mo137832a((r10 = r10.f298158d));
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFakeVideoInfo(p749xh.C102652h9 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "videoEditData"
            gy3.C87412m.m108594g(r10, r0)
            te3.e70 r0 = new te3.e70
            r0.<init>()
            byte[] r1 = r10.field_baseItemData
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0014
        L_0x0012:
            r0 = r2
            goto L_0x0026
        L_0x0014:
            r0.parseFrom(r1)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0026
        L_0x0018:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r0
            java.lang.String r0 = "safeParser"
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r5, r1)
            goto L_0x0012
        L_0x0026:
            if (r0 != 0) goto L_0x0029
            return
        L_0x0029:
            int r1 = r10.field_targetWidth
            r9.f273038r = r1
            int r1 = r10.field_targetHeight
            r9.f273039s = r1
            int r10 = r10.field_videoRotate
            r9.f273040t = r10
            java.lang.String r10 = r9.f273027d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "LogStory: setFakeVideoInfo "
            r1.append(r5)
            long r5 = r0.f298174w
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r9.f273028e = r0
            android.widget.ImageView r10 = r9.f273034n
            if (r10 != 0) goto L_0x0081
            android.widget.ImageView r10 = new android.widget.ImageView
            android.content.Context r1 = r9.getContext()
            r10.<init>(r1)
            int r1 = r9.f273040t
            r5 = 90
            if (r1 == r5) goto L_0x0066
            r5 = 270(0x10e, float:3.78E-43)
            if (r1 != r5) goto L_0x006e
        L_0x0066:
            int r1 = r9.f273039s
            int r5 = r9.f273038r
            r9.f273039s = r5
            r9.f273038r = r1
        L_0x006e:
            int r1 = r9.f273038r
            int r5 = r9.f273039s
            if (r1 <= r5) goto L_0x007a
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r10.setScaleType(r1)
            goto L_0x007f
        L_0x007a:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r10.setScaleType(r1)
        L_0x007f:
            r9.f273034n = r10
        L_0x0081:
            r9.removeAllViews()
            te3.e70 r10 = r9.f273028e
            if (r10 == 0) goto L_0x0097
            java.lang.String r10 = r10.f298158d
            if (r10 == 0) goto L_0x0097
            hi2.o r1 = hi2.C98464o.f288797a
            hi2.o$a r10 = r1.mo137832a(r10)
            if (r10 == 0) goto L_0x0097
            boolean r10 = r10.f288804g
            goto L_0x0098
        L_0x0097:
            r10 = 0
        L_0x0098:
            boolean r1 = r0.f298176y
            if (r1 != 0) goto L_0x00a0
            if (r10 != 0) goto L_0x00a0
            r1 = 1
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            r9.f273037q = r1
            java.lang.String r1 = r9.f273027d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "useFakeImage:"
            r5.append(r6)
            boolean r6 = r9.f273037q
            r5.append(r6)
            java.lang.String r6 = ", isCaptureVideo:"
            r5.append(r6)
            boolean r6 = r0.f298176y
            r5.append(r6)
            java.lang.String r6 = ", matchScreenRatio:"
            r5.append(r6)
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
            boolean r10 = r9.f273037q
            r1 = 2
            if (r10 == 0) goto L_0x00e9
            android.widget.ImageView r10 = r9.f273034n
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            r6 = -1
            r5.<init>(r6, r6)
            r9.addView(r10, r5)
            android.widget.ImageView r10 = r9.f273034n
            if (r10 != 0) goto L_0x00e4
            goto L_0x015a
        L_0x00e4:
            r10.setVisibility(r4)
            goto L_0x015a
        L_0x00e9:
            zg2.m r10 = zg2.C103020m.f303985a
            android.content.Context r10 = r9.getContext()
            java.lang.String r5 = "context"
            gy3.C87412m.m108593f(r10, r5)
            java.lang.String r5 = "MicroMsg.mix_background.VideoEditStorageUtil"
            java.lang.String r6 = "reshow the fake story which has editor item"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            java.util.LinkedList<te3.ea> r5 = r0.f298173v
            java.lang.String r6 = "storyEditorProtoData.baseItemData"
            gy3.C87412m.m108593f(r5, r6)
            java.util.Iterator r5 = r5.iterator()
        L_0x0108:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0150
            java.lang.Object r6 = r5.next()
            te3.ea r6 = (te3.C64339ea) r6
            int r7 = r6.f182947d
            if (r7 != r3) goto L_0x0121
            zg2.h r7 = new zg2.h
            r7.<init>(r10, r9, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r7)
            goto L_0x0108
        L_0x0121:
            if (r7 != r1) goto L_0x012c
            zg2.i r7 = new zg2.i
            r7.<init>(r10, r9, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r7)
            goto L_0x0108
        L_0x012c:
            r8 = 3
            if (r7 != r8) goto L_0x0138
            zg2.j r7 = new zg2.j
            r7.<init>(r10, r9, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r7)
            goto L_0x0108
        L_0x0138:
            r8 = 4
            if (r7 != r8) goto L_0x0144
            zg2.k r7 = new zg2.k
            r7.<init>(r10, r9, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r7)
            goto L_0x0108
        L_0x0144:
            r8 = 5
            if (r7 != r8) goto L_0x0108
            zg2.l r7 = new zg2.l
            r7.<init>(r0, r6, r10, r9)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r7)
            goto L_0x0108
        L_0x0150:
            android.widget.ImageView r10 = r9.f273034n
            if (r10 != 0) goto L_0x0155
            goto L_0x015a
        L_0x0155:
            r5 = 8
            r10.setVisibility(r5)
        L_0x015a:
            java.lang.String r10 = r0.f298164j
            if (r10 == 0) goto L_0x0176
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r10 = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo
            r10.<init>()
            int r2 = r0.f298165n
            r10.f163813e = r2
            boolean r2 = r0.f298167p
            r10.f163818j = r2
            java.lang.String r2 = r0.f298164j
            r10.f163817i = r2
            java.lang.String r2 = r0.f298166o
            r10.f163814f = r2
            r9.f273032i = r10
            goto L_0x0178
        L_0x0176:
            r9.f273032i = r2
        L_0x0178:
            int r10 = r0.f298162h
            if (r10 == 0) goto L_0x0180
            if (r10 != r1) goto L_0x017f
            goto L_0x0180
        L_0x017f:
            r3 = 0
        L_0x0180:
            r9.f273033j = r3
            long r1 = r0.f298159e
            r9.f273030g = r1
            long r0 = r0.f298160f
            r9.f273031h = r0
            r9.f273036p = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.p095ui.FakeVideoViewLayer.setFakeVideoInfo(xh.h9):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FakeVideoViewLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }
}
