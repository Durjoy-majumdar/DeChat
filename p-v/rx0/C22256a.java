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

/* renamed from: rx0.a */
public final class C22256a implements C13591j {

    /* renamed from: a */
    public final MMActivity f63057a;

    /* renamed from: b */
    public final C18508z2 f63058b;

    /* renamed from: c */
    public final C19623o0 f63059c;

    /* renamed from: d */
    public final C77630j f63060d;

    /* renamed from: e */
    public final int f63061e;

    /* renamed from: f */
    public final String f63062f = "SmallArticleFakeCover";

    /* renamed from: g */
    public final AppCompatActivity f63063g;

    /* renamed from: h */
    public final int f63064h;

    /* renamed from: i */
    public final int f63065i;

    /* renamed from: j */
    public View f63066j;

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.popmenu.ArticleFakeCover", mo125469f = "MultiTaskFakeCoverCreator.kt", mo125470l = {188}, mo125471m = "cook")
    /* renamed from: rx0.a$a */
    public static final class C22257a extends C66704d {

        /* renamed from: d */
        public Object f63067d;

        /* renamed from: e */
        public Object f63068e;

        /* renamed from: f */
        public Object f63069f;

        /* renamed from: g */
        public int f63070g;

        /* renamed from: h */
        public /* synthetic */ Object f63071h;

        /* renamed from: i */
        public final /* synthetic */ C22256a f63072i;

        /* renamed from: j */
        public int f63073j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22257a(C22256a aVar, C15601d<? super C22257a> dVar) {
            super(dVar);
            this.f63072i = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f63071h = obj;
            this.f63073j |= Integer.MIN_VALUE;
            return this.f63072i.mo35419a(this);
        }
    }

    public C22256a(MMActivity mMActivity, C18508z2 z2Var, C19623o0 o0Var, C77630j jVar, int i) {
        C87412m.m108594g(mMActivity, "timelineUI");
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(o0Var, "bizTimelineInfo");
        C87412m.m108594g(jVar, "bizReaderItem");
        this.f63057a = mMActivity;
        this.f63058b = z2Var;
        this.f63059c = o0Var;
        this.f63060d = jVar;
        this.f63061e = i;
        AppCompatActivity context = mMActivity.getContext();
        this.f63063g = context;
        this.f63064h = C76577a.m92151b(context, 163);
        this.f63065i = C76577a.m92151b(context, 217);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.crp, (ViewGroup) null, false);
        C87412m.m108593f(inflate, "from(mContext).inflate(R…ver_article, null, false)");
        this.f63066j = inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo35419a(wx3.C15601d<? super android.graphics.Bitmap> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof rx0.C22256a.C22257a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            rx0.a$a r0 = (rx0.C22256a.C22257a) r0
            int r1 = r0.f63073j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f63073j = r1
            goto L_0x0018
        L_0x0013:
            rx0.a$a r0 = new rx0.a$a
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f63071h
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f63073j
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            int r1 = r0.f63070g
            java.lang.Object r2 = r0.f63069f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.f63068e
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.Object r0 = r0.f63067d
            rx0.a r0 = (rx0.C22256a) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0126
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r8)
            android.view.View r8 = r7.f63066j
            r2 = 2131301972(0x7f091654, float:1.8222017E38)
            android.view.View r8 = r8.findViewById(r2)
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.view.View r2 = r7.f63066j
            r4 = 2131301971(0x7f091653, float:1.8222015E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.view.View r4 = r7.f63066j
            r5 = 2131301973(0x7f091655, float:1.822202E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            rx0.C13591j.C13592a.m12902d(r7, r8, r2)
            java.lang.String r5 = r7.f63062f
            java.lang.String r6 = "handle header"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            java.lang.Class<d62.i> r5 = d62.C75339i.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            d62.i r5 = (d62.C75339i) r5
            com.tencent.mm.storage.o0 r6 = r7.f63059c
            java.lang.String r6 = r6.field_talker
            java.lang.String r5 = r5.getDisplayName(r6)
            s90.j r6 = r7.f63060d
            java.lang.String r6 = r6.f226325d
            r8.setText(r6)
            r2.setText(r5)
            java.lang.String r8 = r7.f63062f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "bizReaderItem.title = "
            r2.append(r5)
            s90.j r5 = r7.f63060d
            java.lang.String r5 = r5.f226325d
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            java.lang.Class<gw0.b> r8 = gw0.C76073b.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            gw0.b r8 = (gw0.C76073b) r8
            com.tencent.mm.storage.o0 r2 = r7.f63059c
            long r5 = r2.field_msgId
            java.lang.String r2 = r2.field_content
            s90.f r8 = r8.mo94597JZ(r5, r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.message.BizMMReader"
            gy3.C87412m.m108592e(r8, r2)
            s90.i r8 = (s90.C77629i) r8
            java.util.LinkedList<s90.j> r8 = r8.f226295i
            if (r8 == 0) goto L_0x00c2
            int r8 = r8.size()
            goto L_0x00c3
        L_0x00c2:
            r8 = 1
        L_0x00c3:
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r2 = r7.f63058b
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.j r2 = r2.f51445p
            com.tencent.mm.storage.o0 r5 = r7.f63059c
            s90.j r6 = r7.f63060d
            r2.getClass()
            r2 = 0
            if (r5 == 0) goto L_0x00d9
            if (r6 != 0) goto L_0x00d4
            goto L_0x00d9
        L_0x00d4:
            boolean r8 = fy0.C20734b.m22688a(r5, r6, r8)
            goto L_0x00da
        L_0x00d9:
            r8 = 0
        L_0x00da:
            if (r8 == 0) goto L_0x00e1
            int r8 = r7.f63061e
            if (r8 != 0) goto L_0x00e1
            r2 = 1
        L_0x00e1:
            s90.j r8 = r7.f63060d
            if (r2 == 0) goto L_0x00e8
            java.lang.String r8 = r8.f226330i
            goto L_0x00ea
        L_0x00e8:
            java.lang.String r8 = r8.f226312D
        L_0x00ea:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r5 == 0) goto L_0x0107
            java.lang.String r8 = r7.f63062f
            java.lang.String r0 = "error!!,  coverUrl is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            int r8 = r7.f63064h
            int r0 = r7.f63065i
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8, r0, r1)
            java.lang.String r0 = "createBitmap(fakeCoverWi… Bitmap.Config.ARGB_8888)"
            gy3.C87412m.m108593f(r8, r0)
            return r8
        L_0x0107:
            java.lang.String r5 = "coverUrl"
            gy3.C87412m.m108593f(r8, r5)
            java.lang.String r5 = "coverIv"
            gy3.C87412m.m108593f(r4, r5)
            r0.f63067d = r7
            r0.f63068e = r4
            r0.f63069f = r8
            r0.f63070g = r2
            r0.f63073j = r3
            java.lang.Object r0 = rx0.C13591j.C13592a.m12900b(r7, r8, r4, r0)
            if (r0 != r1) goto L_0x0122
            return r1
        L_0x0122:
            r0 = r7
            r1 = r2
            r3 = r4
            r2 = r8
        L_0x0126:
            java.lang.String r8 = r0.f63062f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "loadCover end, coverUrl = "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            android.view.View r8 = r0.f63066j
            int r2 = r0.f63064h
            int r4 = r0.f63065i
            rx0.C13591j.C13592a.m12899a(r0, r8, r2, r4)
            int r8 = r3.getWidth()
            if (r1 == 0) goto L_0x0153
            double r1 = (double) r8
            r4 = 4612474148362177741(0x4002cccccccccccd, double:2.35)
            double r1 = r1 / r4
            int r8 = (int) r1
        L_0x0153:
            java.lang.String r1 = r0.f63062f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "coverIvShouldHeight = "
            r2.append(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            int r1 = r3.getLeft()
            int r2 = r3.getTop()
            int r4 = r3.getLeft()
            int r5 = r3.getWidth()
            int r4 = r4 + r5
            int r5 = r3.getTop()
            int r5 = r5 + r8
            r3.layout(r1, r2, r4, r5)
            java.lang.String r8 = r0.f63062f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "itemView.width = "
            r1.append(r2)
            android.view.View r2 = r0.f63066j
            int r2 = r2.getWidth()
            r1.append(r2)
            java.lang.String r2 = ", itemView.height = "
            r1.append(r2)
            android.view.View r2 = r0.f63066j
            int r2 = r2.getHeight()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            android.view.View r8 = r0.f63066j
            int r8 = r8.getWidth()
            android.view.View r1 = r0.f63066j
            int r1 = r1.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r8)
            android.view.View r2 = r0.f63066j
            r2.draw(r1)
            java.lang.String r1 = "bitmap"
            gy3.C87412m.m108593f(r8, r1)
            androidx.appcompat.app.AppCompatActivity r1 = r0.f63063g
            java.lang.String r2 = "mContext"
            gy3.C87412m.m108593f(r1, r2)
            android.graphics.Bitmap r8 = rx0.C13591j.C13592a.m12901c(r0, r8, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rx0.C22256a.mo35419a(wx3.d):java.lang.Object");
    }
}
