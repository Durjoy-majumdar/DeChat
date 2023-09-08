package oh1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import android.content.Context;
import cj1.C54804r0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di0.C86295k;
import di0.C86299o;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C87412m;
import kotlin.ResultKt;
import o40.C61926c;
import org.json.JSONObject;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C50533nf0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.flashsale.FlashSaleUtilKt$openFlashSaleConfigApp$1$1", mo125469f = "FlashSaleUtil.kt", mo125470l = {92}, mo125471m = "invokeSuspend")
/* renamed from: oh1.h */
public final class C62015h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f176288d;

    /* renamed from: e */
    public final /* synthetic */ C62660c f176289e;

    /* renamed from: f */
    public final /* synthetic */ C50533nf0 f176290f;

    /* renamed from: g */
    public final /* synthetic */ String f176291g;

    /* renamed from: h */
    public final /* synthetic */ String f176292h;

    /* renamed from: oh1.h$a */
    public static final class C11422a implements C86295k {

        /* renamed from: d */
        public final /* synthetic */ String f33601d;

        /* renamed from: e */
        public final /* synthetic */ String f33602e;

        /* renamed from: f */
        public final /* synthetic */ C62660c f33603f;

        /* renamed from: g */
        public final /* synthetic */ String f33604g;

        public C11422a(String str, String str2, C62660c cVar, String str3) {
            this.f33601d = str;
            this.f33602e = str2;
            this.f33603f = cVar;
            this.f33604g = str3;
        }

        /* renamed from: a */
        public final String mo3693a() {
            Class cls = C55001u.class;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("identityID", this.f33601d);
            jSONObject.put("targetName", this.f33602e);
            jSONObject.put("finderUsername", ((C54991o) this.f33603f.mo87696x0(C54991o.class)).f154345o);
            jSONObject.put("liveID", C61926c.m72691p(((C55001u) this.f33603f.mo87696x0(cls)).f154420q.f182392d));
            jSONObject.put("objectID", C61926c.m72691p(((C55001u) this.f33603f.mo87696x0(cls)).f154416j));
            String str = this.f33604g;
            if (str != null) {
                jSONObject.put("productImageBase64", str);
            }
            return jSONObject.toString();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.flashsale.FlashSaleUtilKt$openFlashSaleConfigApp$1$1$productImg$1", mo125469f = "FlashSaleUtil.kt", mo125470l = {93}, mo125471m = "invokeSuspend")
    /* renamed from: oh1.h$b */
    public static final class C62016b extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

        /* renamed from: d */
        public int f176293d;

        /* renamed from: e */
        public final /* synthetic */ boolean f176294e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62016b(boolean z, C15601d<? super C62016b> dVar) {
            super(2, dVar);
            this.f176294e = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C62016b(this.f176294e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62016b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x010b A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.String r0 = "encodeToString(data, android.util.Base64.DEFAULT)"
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r12.f176293d
                r3 = 1
                if (r2 == 0) goto L_0x0018
                if (r2 != r3) goto L_0x0010
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x010c
            L_0x0010:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0018:
                kotlin.ResultKt.throwOnFailure(r13)
                r13 = 524288(0x80000, float:7.34684E-40)
                boolean r2 = r12.f176294e
                r12.f176293d = r3
                java.lang.String r3 = "FinderLiveScreenShotOperations"
                wx3.h r4 = new wx3.h
                wx3.d r5 = xx3.C66447b.m78392b(r12)
                r4.<init>(r5)
                r5 = 0
                if (r2 == 0) goto L_0x004e
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r2.getClass()
                com.tencent.mm.plugin.finder.live.view.b r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
                if (r2 == 0) goto L_0x006e
                java.lang.Class<qj1.w3> r6 = qj1.C63081w3.class
                qj1.c r2 = r2.getPlugin(r6)
                qj1.w3 r2 = (qj1.C63081w3) r2
                if (r2 == 0) goto L_0x006e
                android.widget.ImageView r2 = r2.f179015r
                android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapFromView(r2)
                java.lang.String r6 = "getBitmapFromView(audioModePreview)"
                gy3.C87412m.m108593f(r2, r6)
                goto L_0x006f
            L_0x004e:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r2.getClass()
                com.tencent.mm.plugin.finder.live.view.b r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
                if (r2 == 0) goto L_0x006e
                java.lang.Class<qj1.i3> r6 = qj1.C62815i3.class
                qj1.c r2 = r2.getPlugin(r6)
                qj1.i3 r2 = (qj1.C62815i3) r2
                if (r2 == 0) goto L_0x006e
                com.tencent.mm.live.core.view.LivePreviewView r2 = r2.f178293r
                android.view.TextureView r2 = r2.getCameraView()
                if (r2 == 0) goto L_0x006e
                android.graphics.Bitmap r2 = r2.getBitmap()
                goto L_0x006f
            L_0x006e:
                r2 = r5
            L_0x006f:
                if (r2 == 0) goto L_0x00fe
                r6 = 0
                java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00ee }
                r7.<init>()     // Catch:{ Exception -> 0x00ee }
                r8 = 100
                r7.reset()     // Catch:{ Exception -> 0x00ee }
                android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x00ee }
                r2.compress(r9, r8, r7)     // Catch:{ Exception -> 0x00ee }
                byte[] r9 = r7.toByteArray()     // Catch:{ Exception -> 0x00ee }
                java.lang.String r9 = android.util.Base64.encodeToString(r9, r6)     // Catch:{ Exception -> 0x00ee }
                gy3.C87412m.m108593f(r9, r0)     // Catch:{ Exception -> 0x00ee }
            L_0x008c:
                java.lang.String r10 = "this as java.lang.String).getBytes(charset)"
                if (r8 <= 0) goto L_0x00b3
                java.nio.charset.Charset r11 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x00ee }
                byte[] r11 = r9.getBytes(r11)     // Catch:{ Exception -> 0x00ee }
                gy3.C87412m.m108593f(r11, r10)     // Catch:{ Exception -> 0x00ee }
                int r11 = r11.length     // Catch:{ Exception -> 0x00ee }
                if (r11 <= r13) goto L_0x00b3
                int r8 = r8 / 2
                r7.reset()     // Catch:{ Exception -> 0x00ee }
                android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x00ee }
                r2.compress(r9, r8, r7)     // Catch:{ Exception -> 0x00ee }
                byte[] r9 = r7.toByteArray()     // Catch:{ Exception -> 0x00ee }
                java.lang.String r9 = android.util.Base64.encodeToString(r9, r6)     // Catch:{ Exception -> 0x00ee }
                gy3.C87412m.m108593f(r9, r0)     // Catch:{ Exception -> 0x00ee }
                goto L_0x008c
            L_0x00b3:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ee }
                r0.<init>()     // Catch:{ Exception -> 0x00ee }
                java.lang.String r2 = "max Size = "
                r0.append(r2)     // Catch:{ Exception -> 0x00ee }
                r0.append(r13)     // Catch:{ Exception -> 0x00ee }
                java.lang.String r13 = ", compressed with quality "
                r0.append(r13)     // Catch:{ Exception -> 0x00ee }
                r0.append(r8)     // Catch:{ Exception -> 0x00ee }
                java.lang.String r13 = ", compressed size = "
                r0.append(r13)     // Catch:{ Exception -> 0x00ee }
                java.nio.charset.Charset r13 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x00ee }
                byte[] r13 = r9.getBytes(r13)     // Catch:{ Exception -> 0x00ee }
                gy3.C87412m.m108593f(r13, r10)     // Catch:{ Exception -> 0x00ee }
                int r13 = r13.length     // Catch:{ Exception -> 0x00ee }
                r0.append(r13)     // Catch:{ Exception -> 0x00ee }
                r13 = 32
                r0.append(r13)     // Catch:{ Exception -> 0x00ee }
                java.lang.String r13 = r0.toString()     // Catch:{ Exception -> 0x00ee }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)     // Catch:{ Exception -> 0x00ee }
                java.lang.Object r13 = kotlin.Result.m168114constructorimpl(r9)     // Catch:{ Exception -> 0x00ee }
                r4.resumeWith(r13)     // Catch:{ Exception -> 0x00ee }
                goto L_0x0105
            L_0x00ee:
                r13 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r6]
                java.lang.String r2 = "get frame failed"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r13, r2, r0)
                java.lang.Object r13 = kotlin.Result.m168114constructorimpl(r5)
                r4.resumeWith(r13)
                goto L_0x0105
            L_0x00fe:
                java.lang.Object r13 = kotlin.Result.m168114constructorimpl(r5)
                r4.resumeWith(r13)
            L_0x0105:
                java.lang.Object r13 = r4.mo90314b()
                if (r13 != r1) goto L_0x010c
                return r1
            L_0x010c:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: oh1.C62015h.C62016b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62015h(C62660c cVar, C50533nf0 nf02, String str, String str2, C15601d<? super C62015h> dVar) {
        super(2, dVar);
        this.f176289e = cVar;
        this.f176290f = nf02;
        this.f176291g = str;
        this.f176292h = str2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C62015h(this.f176289e, this.f176290f, this.f176291g, this.f176292h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C62015h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f176288d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            boolean G3 = ((C54991o) this.f176289e.mo87696x0(C54991o.class)).mo75960G3();
            C53896h0 h0Var = C53872d1.f151119c;
            C62016b bVar = new C62016b(G3, (C15601d<? super C62016b>) null);
            this.f176288d = 1;
            obj = C53895h.m60469g(h0Var, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) obj;
        C86299o oVar = new C86299o();
        C50533nf0 nf02 = this.f176290f;
        String str2 = this.f176291g;
        String str3 = this.f176292h;
        C62660c cVar = this.f176289e;
        String str4 = nf02.f138579d;
        String str5 = nf02.f138580e;
        oVar.f250930b = str4;
        oVar.f250934f = str5;
        oVar.f250939k = 1205;
        HalfScreenConfig.C55452b bVar2 = new HalfScreenConfig.C55452b();
        float f = (float) C75044y4.m89990b(MMApplicationContext.getContext()).y;
        if (MMApplicationContext.getResources().getConfiguration().orientation == 2) {
            f = (float) C75044y4.m89990b(MMApplicationContext.getContext()).x;
        }
        bVar2.f157990b = ((int) ((((float) C32444a.f86121a.mo58621b()) / 100.0f) * f)) + ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3745cw));
        bVar2.f157994f = HalfScreenConfig.C55451a.POPUP;
        bVar2.f158002n = false;
        bVar2.f157999k = HalfScreenConfig.C55453c.HIDE;
        oVar.f250912A = bVar2.mo76967a();
        oVar.f250937i = new C11422a(str2, str3, cVar, str);
        C54804r0 r0Var = C54804r0.f153631a;
        Context context = this.f176289e.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        r0Var.mo75767i(context, this.f176289e.mo87684A0(), oVar, this.f176289e.mo14482F0());
        return C13598b0.f38549a;
    }
}
