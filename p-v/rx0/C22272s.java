package rx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.storage.C19623o0;
import gy3.C87412m;
import kg3.C76577a;
import s90.C77630j;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: rx0.s */
public final class C22272s implements C13591j {

    /* renamed from: a */
    public final MMActivity f63123a;

    /* renamed from: b */
    public final C19623o0 f63124b;

    /* renamed from: c */
    public final C77630j f63125c;

    /* renamed from: d */
    public final String f63126d = "PicFakeCover";

    /* renamed from: e */
    public final AppCompatActivity f63127e;

    /* renamed from: f */
    public final int f63128f;

    /* renamed from: g */
    public final int f63129g;

    /* renamed from: h */
    public View f63130h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.popmenu.PicFakeCover", mo125469f = "MultiTaskFakeCoverCreator.kt", mo125470l = {238}, mo125471m = "cook")
    /* renamed from: rx0.s$a */
    public static final class C22273a extends C66704d {

        /* renamed from: d */
        public Object f63131d;

        /* renamed from: e */
        public Object f63132e;

        /* renamed from: f */
        public /* synthetic */ Object f63133f;

        /* renamed from: g */
        public final /* synthetic */ C22272s f63134g;

        /* renamed from: h */
        public int f63135h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22273a(C22272s sVar, C15601d<? super C22273a> dVar) {
            super(dVar);
            this.f63134g = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f63133f = obj;
            this.f63135h |= Integer.MIN_VALUE;
            return this.f63134g.mo35425a(this);
        }
    }

    public C22272s(MMActivity mMActivity, C18508z2 z2Var, C19623o0 o0Var, C77630j jVar, int i) {
        C87412m.m108594g(mMActivity, "timelineUI");
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(o0Var, "bizTimelineInfo");
        C87412m.m108594g(jVar, "bizReaderItem");
        this.f63123a = mMActivity;
        this.f63124b = o0Var;
        this.f63125c = jVar;
        AppCompatActivity context = mMActivity.getContext();
        this.f63127e = context;
        this.f63128f = C76577a.m92151b(context, 163);
        this.f63129g = C76577a.m92151b(context, 217);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.crr, (ViewGroup) null, false);
        C87412m.m108593f(inflate, "from(mContext).inflate(R…e_cover_pic, null, false)");
        this.f63130h = inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo35425a(wx3.C15601d<? super android.graphics.Bitmap> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof rx0.C22272s.C22273a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            rx0.s$a r0 = (rx0.C22272s.C22273a) r0
            int r1 = r0.f63135h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f63135h = r1
            goto L_0x0018
        L_0x0013:
            rx0.s$a r0 = new rx0.s$a
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f63133f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f63135h
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r1 = r0.f63132e
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r0 = r0.f63131d
            rx0.s r0 = (rx0.C22272s) r0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00ba
        L_0x0030:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r11)
            android.view.View r11 = r10.f63130h
            r2 = 2131301975(0x7f091657, float:1.8222023E38)
            android.view.View r11 = r11.findViewById(r2)
            android.widget.TextView r11 = (android.widget.TextView) r11
            android.view.View r2 = r10.f63130h
            r4 = 2131301974(0x7f091656, float:1.8222021E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.view.View r4 = r10.f63130h
            r5 = 2131301976(0x7f091658, float:1.8222025E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 0
            rx0.C13591j.C13592a.m12902d(r10, r5, r11)
            java.lang.String r5 = r10.f63126d
            java.lang.String r6 = "handle header"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            java.lang.Class<d62.i> r5 = d62.C75339i.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            d62.i r5 = (d62.C75339i) r5
            com.tencent.mm.storage.o0 r6 = r10.f63124b
            java.lang.String r6 = r6.field_talker
            java.lang.String r5 = r5.getDisplayName(r6)
            java.lang.Class<ln.i> r6 = p196ln.C76708i.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ln.i r6 = (p196ln.C76708i) r6
            com.tencent.mm.storage.o0 r7 = r10.f63124b
            java.lang.String r7 = r7.field_talker
            android.graphics.Bitmap r6 = r6.N50(r7)
            if (r6 == 0) goto L_0x009a
            r7 = 0
            r8 = 1056964608(0x3f000000, float:0.5)
            int r9 = r6.getWidth()
            float r9 = (float) r9
            float r9 = r9 * r8
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r6, r7, r9)
            r2.setImageBitmap(r6)
        L_0x009a:
            r11.setText(r5)
            s90.j r11 = r10.f63125c
            java.lang.String r11 = r11.f226330i
            java.lang.String r2 = "bizReaderItem.cover"
            gy3.C87412m.m108593f(r11, r2)
            java.lang.String r2 = "coverIv"
            gy3.C87412m.m108593f(r4, r2)
            r0.f63131d = r10
            r0.f63132e = r4
            r0.f63135h = r3
            java.lang.Object r11 = rx0.C13591j.C13592a.m12900b(r10, r11, r4, r0)
            if (r11 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            r0 = r10
            r1 = r4
        L_0x00ba:
            java.lang.String r11 = r0.f63126d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "loadCover end, bizReaderItem.cover = "
            r2.append(r3)
            s90.j r3 = r0.f63125c
            java.lang.String r3 = r3.f226330i
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            android.view.View r11 = r0.f63130h
            int r2 = r0.f63128f
            int r3 = r0.f63129g
            rx0.C13591j.C13592a.m12899a(r0, r11, r2, r3)
            int r11 = r1.getWidth()
            double r2 = (double) r11
            r4 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            double r2 = r2 / r4
            int r11 = (int) r2
            java.lang.String r2 = r0.f63126d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "coverIvShouldHeight = "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            int r2 = r1.getLeft()
            int r3 = r1.getTop()
            int r4 = r1.getLeft()
            int r5 = r1.getWidth()
            int r4 = r4 + r5
            int r5 = r1.getTop()
            int r5 = r5 + r11
            r1.layout(r2, r3, r4, r5)
            java.lang.String r11 = r0.f63126d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "itemView.width = "
            r1.append(r2)
            android.view.View r2 = r0.f63130h
            int r2 = r2.getWidth()
            r1.append(r2)
            java.lang.String r2 = ", itemView.height = "
            r1.append(r2)
            android.view.View r2 = r0.f63130h
            int r2 = r2.getHeight()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            android.view.View r11 = r0.f63130h
            int r11 = r11.getWidth()
            android.view.View r1 = r0.f63130h
            int r1 = r1.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r11, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r11)
            android.view.View r2 = r0.f63130h
            r2.draw(r1)
            java.lang.String r1 = "bitmap"
            gy3.C87412m.m108593f(r11, r1)
            androidx.appcompat.app.AppCompatActivity r1 = r0.f63127e
            java.lang.String r2 = "mContext"
            gy3.C87412m.m108593f(r1, r2)
            android.graphics.Bitmap r11 = rx0.C13591j.C13592a.m12901c(r0, r11, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: rx0.C22272s.mo35425a(wx3.d):java.lang.Object");
    }
}
