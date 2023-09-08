package rx0;

import a14.C0000n0;
import com.tencent.p014mm.storage.C19623o0;
import fy3.C32227p;
import rx3.C13598b0;
import s90.C77630j;
import te3.C64459j13;
import te3.i25;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.popmenu.BizTimeLinePopMenuManager$doMpMultiTask$1", mo125469f = "BizTimeLinePopMenuManager.kt", mo125470l = {299}, mo125471m = "invokeSuspend")
/* renamed from: rx0.c */
public final class C22258c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f63074d;

    /* renamed from: e */
    public final /* synthetic */ C64459j13 f63075e;

    /* renamed from: f */
    public final /* synthetic */ C22260f f63076f;

    /* renamed from: g */
    public final /* synthetic */ C77630j f63077g;

    /* renamed from: h */
    public final /* synthetic */ C19623o0 f63078h;

    /* renamed from: i */
    public final /* synthetic */ int f63079i;

    /* renamed from: j */
    public final /* synthetic */ i25 f63080j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22258c(C64459j13 j132, C22260f fVar, C77630j jVar, C19623o0 o0Var, int i, i25 i25, C15601d<? super C22258c> dVar) {
        super(2, dVar);
        this.f63075e = j132;
        this.f63076f = fVar;
        this.f63077g = jVar;
        this.f63078h = o0Var;
        this.f63079i = i;
        this.f63080j = i25;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C22258c(this.f63075e, this.f63076f, this.f63077g, this.f63078h, this.f63079i, this.f63080j, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C22258c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0313 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f63074d
            r3 = 1
            if (r2 == 0) goto L_0x001b
            if (r2 != r3) goto L_0x0013
            kotlin.ResultKt.throwOnFailure(r23)
            r8 = r23
            r3 = r0
            goto L_0x0314
        L_0x0013:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x001b:
            kotlin.ResultKt.throwOnFailure(r23)
            te3.j13 r2 = r0.f63075e
            rx0.f r4 = r0.f63076f
            rx0.n r4 = r4.f63087f
            s90.j r5 = r0.f63077g
            int r6 = r5.f226333o
            com.tencent.mm.storage.o0 r7 = r0.f63078h
            r4.getClass()
            java.lang.String r8 = "bizTimelineInfo"
            gy3.C87412m.m108594g(r7, r8)
            java.lang.String r8 = "bizReaderItem"
            gy3.C87412m.m108594g(r5, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "createPageTitle, type = "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "BizTimeLineMultiTaskCoverCreator"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            rx0.n$a r8 = rx0.C22270n.f63119d
            androidx.appcompat.app.AppCompatActivity r4 = r4.f63122c
            java.lang.String r10 = "mContext"
            gy3.C87412m.m108593f(r4, r10)
            java.lang.String r7 = r7.field_talker
            java.lang.String r11 = "bizTimelineInfo.field_talker"
            gy3.C87412m.m108593f(r7, r11)
            java.lang.String r5 = r5.f226325d
            java.lang.String r11 = "bizReaderItem.title"
            gy3.C87412m.m108593f(r5, r11)
            java.lang.String r4 = r8.mo35424a(r4, r6, r7, r5)
            r2.f183752e = r4
            rx0.f r2 = r0.f63076f
            rx0.n r2 = r2.f63087f
            s90.j r15 = r0.f63077g
            int r4 = r15.f226333o
            com.tencent.mm.storage.o0 r14 = r0.f63078h
            int r5 = r0.f63079i
            r0.f63074d = r3
            r2.getClass()
            java.lang.Class<ln.i> r6 = p196ln.C76708i.class
            java.lang.Class<d62.i> r7 = d62.C75339i.class
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "createFakeCover, type = "
            r8.append(r11)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            if (r4 == 0) goto L_0x02f8
            r9 = 5
            if (r4 == r9) goto L_0x02de
            java.lang.String r13 = "bitmap"
            java.lang.String r12 = ", itemView.height = "
            java.lang.String r9 = "itemView.width = "
            java.lang.String r3 = "bizReaderItem.title = "
            java.lang.String r8 = "handle header"
            r17 = 1056964608(0x3f000000, float:0.5)
            r18 = r10
            r10 = 1092616192(0x41200000, float:10.0)
            r11 = 10
            if (r4 == r11) goto L_0x01cc
            r11 = 7
            if (r4 == r11) goto L_0x00d4
            r3 = 8
            if (r4 == r3) goto L_0x00b8
            r3 = r0
            r0 = r1
            r8 = 0
            goto L_0x0311
        L_0x00b8:
            rx0.s r3 = new rx0.s
            com.tencent.mm.ui.MMActivity r12 = r2.f63120a
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r13 = r2.f63121b
            r11 = r3
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.Object r2 = r3.mo35425a(r0)
            if (r2 != r1) goto L_0x00cf
            r3 = r0
            r0 = r1
            r8 = r2
            goto L_0x0311
        L_0x00cf:
            r8 = r2
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            goto L_0x01c8
        L_0x00d4:
            rx0.v r4 = new rx0.v
            com.tencent.mm.ui.MMActivity r11 = r2.f63120a
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r2 = r2.f63121b
            r16 = r11
            r11 = r4
            r20 = r12
            r12 = r16
            r21 = r13
            r13 = r2
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            android.view.View r2 = r4.f63164h
            r5 = 2131301987(0x7f091663, float:1.8222047E38)
            android.view.View r2 = r2.findViewById(r5)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.view.View r5 = r4.f63164h
            r11 = 2131301986(0x7f091662, float:1.8222045E38)
            android.view.View r5 = r5.findViewById(r11)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.view.View r11 = r4.f63164h
            r12 = 2131301989(0x7f091665, float:1.8222051E38)
            android.view.View r11 = r11.findViewById(r12)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 0
            rx0.C13591j.C13592a.m12902d(r4, r12, r2)
            r12 = 1
            r11.setTextSize(r12, r10)
            java.lang.String r10 = r4.f63160d
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
            di3.d r7 = di3.C86312j.m106911c(r7)
            d62.i r7 = (d62.C75339i) r7
            com.tencent.mm.storage.o0 r8 = r4.f63158b
            java.lang.String r8 = r8.field_talker
            java.lang.String r7 = r7.getDisplayName(r8)
            di3.d r6 = di3.C86312j.m106911c(r6)
            ln.i r6 = (p196ln.C76708i) r6
            com.tencent.mm.storage.o0 r8 = r4.f63158b
            java.lang.String r8 = r8.field_talker
            android.graphics.Bitmap r6 = r6.N50(r8)
            if (r6 == 0) goto L_0x0144
            int r8 = r6.getWidth()
            float r8 = (float) r8
            float r8 = r8 * r17
            r13 = 0
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r6, r13, r8)
            r5.setImageBitmap(r6)
        L_0x0144:
            r2.setText(r7)
            s90.j r2 = r4.f63159c
            java.lang.String r2 = r2.f226325d
            r11.setText(r2)
            java.lang.String r2 = r4.f63160d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            s90.j r3 = r4.f63159c
            java.lang.String r3 = r3.f226325d
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            fy0.i r2 = fy0.C8219i.f27144a
            r2.mo9271b(r11)
            android.view.View r2 = r4.f63164h
            int r3 = r4.f63162f
            int r5 = r4.f63163g
            rx0.C13591j.C13592a.m12899a(r4, r2, r3, r5)
            java.lang.String r2 = r4.f63160d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            android.view.View r5 = r4.f63164h
            int r5 = r5.getWidth()
            r3.append(r5)
            r12 = r20
            r3.append(r12)
            android.view.View r5 = r4.f63164h
            int r5 = r5.getHeight()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            android.view.View r2 = r4.f63164h
            int r2 = r2.getWidth()
            android.view.View r3 = r4.f63164h
            int r3 = r3.getHeight()
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r5)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            android.view.View r5 = r4.f63164h
            r5.draw(r3)
            r11 = r21
            gy3.C87412m.m108593f(r2, r11)
            androidx.appcompat.app.AppCompatActivity r3 = r4.f63161e
            r5 = r18
            gy3.C87412m.m108593f(r3, r5)
            android.graphics.Bitmap r8 = rx0.C13591j.C13592a.m12901c(r4, r2, r3)
        L_0x01c8:
            r3 = r0
            r0 = r1
            goto L_0x0311
        L_0x01cc:
            r11 = r13
            r4 = r18
            r13 = 0
            rx0.t r10 = new rx0.t
            com.tencent.mm.ui.MMActivity r13 = r2.f63120a
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r2 = r2.f63121b
            r0 = r11
            r11 = r10
            r19 = r1
            r1 = r12
            r12 = r13
            r20 = r4
            r4 = 0
            r13 = r2
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            android.view.View r2 = r10.f63143h
            r5 = 2131301981(0x7f09165d, float:1.8222035E38)
            android.view.View r2 = r2.findViewById(r5)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.view.View r5 = r10.f63143h
            r11 = 2131301980(0x7f09165c, float:1.8222033E38)
            android.view.View r5 = r5.findViewById(r11)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.view.View r11 = r10.f63143h
            r12 = 2131301982(0x7f09165e, float:1.8222037E38)
            android.view.View r11 = r11.findViewById(r12)
            com.tencent.mm.ui.widget.MMNeat7extView r11 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r11
            r12 = 0
            rx0.C13591j.C13592a.m12902d(r10, r12, r2)
            r12 = 1092616192(0x41200000, float:10.0)
            r13 = 1
            r11.mo154994l(r13, r12)
            java.lang.String r12 = r10.f63139d
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)
            di3.d r7 = di3.C86312j.m106911c(r7)
            d62.i r7 = (d62.C75339i) r7
            com.tencent.mm.storage.o0 r8 = r10.f63137b
            java.lang.String r8 = r8.field_talker
            java.lang.String r7 = r7.getDisplayName(r8)
            di3.d r6 = di3.C86312j.m106911c(r6)
            ln.i r6 = (p196ln.C76708i) r6
            com.tencent.mm.storage.o0 r8 = r10.f63137b
            java.lang.String r8 = r8.field_talker
            android.graphics.Bitmap r6 = r6.N50(r8)
            if (r6 == 0) goto L_0x0241
            int r8 = r6.getWidth()
            float r8 = (float) r8
            float r8 = r8 * r17
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r6, r4, r8)
            r5.setImageBitmap(r4)
        L_0x0241:
            r2.setText(r7)
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            androidx.appcompat.app.AppCompatActivity r4 = r10.f63140e
            s90.j r5 = r10.f63138c
            java.lang.String r5 = r5.f226325d
            float r6 = r11.getTextSize()
            int r6 = (int) r6
            android.text.SpannableString r2 = r2.mo107081qu(r4, r5, r6)
            r11.mo104279b(r2)
            java.lang.String r2 = r10.f63139d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            s90.j r3 = r10.f63138c
            java.lang.String r3 = r3.f226325d
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            androidx.appcompat.app.AppCompatActivity r2 = r10.f63140e
            r3 = 5
            int r2 = kg3.C76577a.m92151b(r2, r3)
            r11.setSpacingAdd(r2)
            android.view.View r2 = r10.f63143h
            int r3 = r10.f63141f
            int r4 = r10.f63142g
            rx0.C13591j.C13592a.m12899a(r10, r2, r3, r4)
            java.lang.String r2 = r10.f63139d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            android.view.View r4 = r10.f63143h
            int r4 = r4.getWidth()
            r3.append(r4)
            r3.append(r1)
            android.view.View r1 = r10.f63143h
            int r1 = r1.getHeight()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            android.view.View r1 = r10.f63143h
            int r1 = r1.getWidth()
            android.view.View r2 = r10.f63143h
            int r2 = r2.getHeight()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            android.view.View r3 = r10.f63143h
            r3.draw(r2)
            gy3.C87412m.m108593f(r1, r0)
            androidx.appcompat.app.AppCompatActivity r0 = r10.f63140e
            r2 = r20
            gy3.C87412m.m108593f(r0, r2)
            android.graphics.Bitmap r8 = rx0.C13591j.C13592a.m12901c(r10, r1, r0)
            r0 = r19
            r3 = r22
            goto L_0x0311
        L_0x02de:
            r0 = r1
            rx0.u r1 = new rx0.u
            com.tencent.mm.ui.MMActivity r12 = r2.f63120a
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r13 = r2.f63121b
            r11 = r1
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            r3 = r22
            java.lang.Object r1 = r1.mo35426a(r3)
            if (r1 != r0) goto L_0x02f4
            goto L_0x030c
        L_0x02f4:
            r8 = r1
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            goto L_0x0311
        L_0x02f8:
            r3 = r0
            r0 = r1
            rx0.a r1 = new rx0.a
            com.tencent.mm.ui.MMActivity r12 = r2.f63120a
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r13 = r2.f63121b
            r11 = r1
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.Object r1 = r1.mo35419a(r3)
            if (r1 != r0) goto L_0x030e
        L_0x030c:
            r8 = r1
            goto L_0x0311
        L_0x030e:
            r8 = r1
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
        L_0x0311:
            if (r8 != r0) goto L_0x0314
            return r0
        L_0x0314:
            r13 = r8
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            te3.i25 r0 = r3.f63080j
            byte[] r14 = r0.toByteArray()
            s90.j r0 = r3.f63077g
            java.lang.String r0 = r0.f226326e
            java.lang.String r1 = "bizReaderItem.url"
            gy3.C87412m.m108593f(r0, r1)
            java.nio.charset.Charset r1 = z04.C119027c.f356488a
            byte[] r0 = r0.getBytes(r1)
            java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.tencent.mm.storage.o0 r2 = r3.f63078h
            long r4 = r2.field_msgId
            r1.append(r4)
            r2 = 95
            r1.append(r2)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            rx0.f r0 = r3.f63076f
            java.lang.String r0 = r0.f63084c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "addTaskInfoByBitmap, id = "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.Class<com.tencent.mm.plugin.multitask.j> r0 = com.tencent.p014mm.plugin.multitask.C105918j.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r9 = r0
            com.tencent.mm.plugin.multitask.j r9 = (com.tencent.p014mm.plugin.multitask.C105918j) r9
            r11 = 2
            te3.j13 r12 = r3.f63075e
            r15 = 0
            r9.mo151023l0(r10, r11, r12, r13, r14, r15)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rx0.C22258c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
