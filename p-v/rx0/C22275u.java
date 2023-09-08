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

/* renamed from: rx0.u */
public final class C22275u implements C13591j {

    /* renamed from: a */
    public final MMActivity f63144a;

    /* renamed from: b */
    public final C19623o0 f63145b;

    /* renamed from: c */
    public final C77630j f63146c;

    /* renamed from: d */
    public final String f63147d = "VideoFakeCover";

    /* renamed from: e */
    public final AppCompatActivity f63148e;

    /* renamed from: f */
    public final int f63149f;

    /* renamed from: g */
    public final int f63150g;

    /* renamed from: h */
    public View f63151h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.popmenu.VideoFakeCover", mo125469f = "MultiTaskFakeCoverCreator.kt", mo125470l = {284}, mo125471m = "cook")
    /* renamed from: rx0.u$a */
    public static final class C22276a extends C66704d {

        /* renamed from: d */
        public Object f63152d;

        /* renamed from: e */
        public Object f63153e;

        /* renamed from: f */
        public /* synthetic */ Object f63154f;

        /* renamed from: g */
        public final /* synthetic */ C22275u f63155g;

        /* renamed from: h */
        public int f63156h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22276a(C22275u uVar, C15601d<? super C22276a> dVar) {
            super(dVar);
            this.f63155g = uVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f63154f = obj;
            this.f63156h |= Integer.MIN_VALUE;
            return this.f63155g.mo35426a(this);
        }
    }

    public C22275u(MMActivity mMActivity, C18508z2 z2Var, C19623o0 o0Var, C77630j jVar, int i) {
        C87412m.m108594g(mMActivity, "timelineUI");
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(o0Var, "bizTimelineInfo");
        C87412m.m108594g(jVar, "bizReaderItem");
        this.f63144a = mMActivity;
        this.f63145b = o0Var;
        this.f63146c = jVar;
        AppCompatActivity context = mMActivity.getContext();
        this.f63148e = context;
        this.f63149f = C76577a.m92151b(context, 163);
        this.f63150g = C76577a.m92151b(context, 217);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cru, (ViewGroup) null, false);
        C87412m.m108593f(inflate, "from(mContext).inflate(R…cover_video, null, false)");
        this.f63151h = inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo35426a(wx3.C15601d<? super android.graphics.Bitmap> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof rx0.C22275u.C22276a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            rx0.u$a r0 = (rx0.C22275u.C22276a) r0
            int r1 = r0.f63156h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f63156h = r1
            goto L_0x0018
        L_0x0013:
            rx0.u$a r0 = new rx0.u$a
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f63154f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f63156h
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r1 = r0.f63153e
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r0 = r0.f63152d
            rx0.u r0 = (rx0.C22275u) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00b7
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r8)
            android.view.View r8 = r7.f63151h
            r2 = 2131301983(0x7f09165f, float:1.822204E38)
            android.view.View r8 = r8.findViewById(r2)
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.view.View r2 = r7.f63151h
            r4 = 2131301984(0x7f091660, float:1.8222041E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.view.View r4 = r7.f63151h
            r5 = 2131301985(0x7f091661, float:1.8222043E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            rx0.C13591j.C13592a.m12902d(r7, r4, r8)
            java.lang.String r5 = r7.f63147d
            java.lang.String r6 = "handle header"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            java.lang.Class<d62.i> r5 = d62.C75339i.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            d62.i r5 = (d62.C75339i) r5
            com.tencent.mm.storage.o0 r6 = r7.f63145b
            java.lang.String r6 = r6.field_talker
            java.lang.String r5 = r5.getDisplayName(r6)
            r8.setText(r5)
            s90.j r8 = r7.f63146c
            java.lang.String r8 = r8.f226325d
            r4.setText(r8)
            java.lang.String r8 = r7.f63147d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bizReaderItem.title = "
            r4.append(r5)
            s90.j r5 = r7.f63146c
            java.lang.String r5 = r5.f226325d
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            s90.j r8 = r7.f63146c
            java.lang.String r8 = r8.f226330i
            java.lang.String r4 = "bizReaderItem.cover"
            gy3.C87412m.m108593f(r8, r4)
            java.lang.String r4 = "coverIv"
            gy3.C87412m.m108593f(r2, r4)
            r0.f63152d = r7
            r0.f63153e = r2
            r0.f63156h = r3
            java.lang.Object r8 = rx0.C13591j.C13592a.m12900b(r7, r8, r2, r0)
            if (r8 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            r0 = r7
            r1 = r2
        L_0x00b7:
            android.view.View r8 = r0.f63151h
            int r2 = r0.f63149f
            int r3 = r0.f63150g
            rx0.C13591j.C13592a.m12899a(r0, r8, r2, r3)
            int r8 = r1.getWidth()
            double r2 = (double) r8
            r4 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            double r2 = r2 / r4
            int r8 = (int) r2
            java.lang.String r2 = r0.f63147d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "coverIvShouldHeight = "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            int r2 = r1.getLeft()
            int r3 = r1.getTop()
            int r4 = r1.getLeft()
            int r5 = r1.getWidth()
            int r4 = r4 + r5
            int r5 = r1.getTop()
            int r5 = r5 + r8
            r1.layout(r2, r3, r4, r5)
            java.lang.String r8 = r0.f63147d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "itemView.width = "
            r1.append(r2)
            android.view.View r2 = r0.f63151h
            int r2 = r2.getWidth()
            r1.append(r2)
            java.lang.String r2 = ", itemView.height = "
            r1.append(r2)
            android.view.View r2 = r0.f63151h
            int r2 = r2.getHeight()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            android.view.View r8 = r0.f63151h
            int r8 = r8.getWidth()
            android.view.View r1 = r0.f63151h
            int r1 = r1.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r8)
            android.view.View r2 = r0.f63151h
            r2.draw(r1)
            java.lang.String r1 = "bitmap"
            gy3.C87412m.m108593f(r8, r1)
            androidx.appcompat.app.AppCompatActivity r1 = r0.f63148e
            java.lang.String r2 = "mContext"
            gy3.C87412m.m108593f(r1, r2)
            android.graphics.Bitmap r8 = rx0.C13591j.C13592a.m12901c(r0, r8, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rx0.C22275u.mo35426a(wx3.d):java.lang.Object");
    }
}
