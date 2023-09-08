package rx0;

import a14.C0000n0;
import a14.C53921m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C75054z4;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gc0.C20828a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import ic0.C21070h;
import jc0.C21210b;
import kotlin.Result;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: rx0.j */
public interface C13591j {

    /* renamed from: rx0.j$a */
    public static final class C13592a {

        @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.popmenu.IFakeCover$DefaultImpls$loadCover$$inlined$suspendCoroutineWithTimeout$1", mo125469f = "MultiTaskFakeCoverCreator.kt", mo125470l = {39}, mo125471m = "invokeSuspend")
        /* renamed from: rx0.j$a$a */
        public static final class C13593a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f38536d;

            /* renamed from: e */
            public int f38537e;

            /* renamed from: f */
            public final /* synthetic */ C8479f0 f38538f;

            /* renamed from: g */
            public final /* synthetic */ String f38539g;

            /* renamed from: h */
            public final /* synthetic */ ImageView f38540h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13593a(C8479f0 f0Var, C15601d dVar, String str, ImageView imageView) {
                super(2, dVar);
                this.f38538f = f0Var;
                this.f38539g = str;
                this.f38540h = imageView;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C13593a(this.f38538f, dVar, this.f38539g, this.f38540h);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C13593a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(T t) {
                C8479f0 f0Var;
                T t2 = C15911a.COROUTINE_SUSPENDED;
                int i = this.f38537e;
                if (i == 0) {
                    ResultKt.throwOnFailure(t);
                    C8479f0 f0Var2 = this.f38538f;
                    this.f38536d = f0Var2;
                    this.f38537e = 1;
                    C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                    mVar.mo74609p();
                    Log.m105924i("BizTimeLineMultiTaskCoverCreator", "loadCover, coverUrl = " + this.f38539g);
                    C20937c.C20939b bVar = new C20937c.C20939b();
                    bVar.f59361q = C0966R.C0969drawable.f4586h2;
                    C20828a.m22825b().mo32520i(this.f38539g, this.f38540h, bVar.mo32666a(), new C13594c(this.f38539g, mVar));
                    T o = mVar.mo74608o();
                    if (o == t2) {
                        return t2;
                    }
                    f0Var = f0Var2;
                    t = o;
                } else if (i == 1) {
                    f0Var = (C8479f0) this.f38536d;
                    ResultKt.throwOnFailure(t);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f0Var.f27484d = t;
                return C13598b0.f38549a;
            }
        }

        /* renamed from: rx0.j$a$c */
        public static final class C13594c implements C21070h {

            /* renamed from: a */
            public final /* synthetic */ String f38541a;

            /* renamed from: b */
            public final /* synthetic */ C15601d<Bitmap> f38542b;

            /* renamed from: rx0.j$a$c$a */
            public static final class C13595a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ String f38543d;

                /* renamed from: e */
                public final /* synthetic */ C15601d<Bitmap> f38544e;

                /* renamed from: f */
                public final /* synthetic */ C21210b f38545f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C13595a(String str, C15601d<? super Bitmap> dVar, C21210b bVar) {
                    super(0);
                    this.f38543d = str;
                    this.f38544e = dVar;
                    this.f38545f = bVar;
                }

                public Object invoke() {
                    Log.m105924i("BizTimeLineMultiTaskCoverCreator", "onImageLoadFinish, coverUrl = " + this.f38543d);
                    C15601d<Bitmap> dVar = this.f38544e;
                    C21210b bVar = this.f38545f;
                    dVar.resumeWith(Result.m168114constructorimpl(bVar != null ? bVar.f59988d : null));
                    return C13598b0.f38549a;
                }
            }

            public C13594c(String str, C15601d<? super Bitmap> dVar) {
                this.f38541a = str;
                this.f38542b = dVar;
            }

            /* renamed from: a */
            public void mo6676a(String str, View view) {
            }

            /* renamed from: b */
            public void mo6677b(String str, View view, C21210b bVar) {
                C61926c.m72668M(new C13595a(this.f38541a, this.f38542b, bVar));
            }

            /* renamed from: c */
            public Bitmap mo6678c(String str, View view, C21210b bVar) {
                return null;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.popmenu.IFakeCover$DefaultImpls", mo125469f = "MultiTaskFakeCoverCreator.kt", mo125470l = {401}, mo125471m = "loadCover")
        /* renamed from: rx0.j$a$b */
        public static final class C13596b extends C66704d {

            /* renamed from: d */
            public Object f38546d;

            /* renamed from: e */
            public /* synthetic */ Object f38547e;

            /* renamed from: f */
            public int f38548f;

            public C13596b(C15601d<? super C13596b> dVar) {
                super(dVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.f38547e = obj;
                this.f38548f |= Integer.MIN_VALUE;
                return C13592a.m12900b((C13591j) null, (String) null, (ImageView) null, this);
            }
        }

        /* renamed from: a */
        public static View m12899a(C13591j jVar, View view, int i, int i2) {
            C87412m.m108594g(view, "v");
            view.layout(0, 0, i, i2);
            view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Log.m105924i("BizTimeLineMultiTaskCoverCreator", "layoutView, v.measuredWidth = " + view.getMeasuredWidth() + ", v.measuredWidth = " + view.getMeasuredHeight());
            return view;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.Object m12900b(rx0.C13591j r6, java.lang.String r7, android.widget.ImageView r8, wx3.C15601d<? super android.graphics.Bitmap> r9) {
            /*
                boolean r6 = r9 instanceof rx0.C13591j.C13592a.C13596b
                if (r6 == 0) goto L_0x0013
                r6 = r9
                rx0.j$a$b r6 = (rx0.C13591j.C13592a.C13596b) r6
                int r0 = r6.f38548f
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L_0x0013
                int r0 = r0 - r1
                r6.f38548f = r0
                goto L_0x0018
            L_0x0013:
                rx0.j$a$b r6 = new rx0.j$a$b
                r6.<init>(r9)
            L_0x0018:
                java.lang.Object r9 = r6.f38547e
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r6.f38548f
                r2 = 1
                if (r1 == 0) goto L_0x0033
                if (r1 != r2) goto L_0x002b
                java.lang.Object r6 = r6.f38546d
                gy3.f0 r6 = (gy3.C8479f0) r6
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x004f
            L_0x002b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0033:
                kotlin.ResultKt.throwOnFailure(r9)
                r3 = 1000(0x3e8, double:4.94E-321)
                gy3.f0 r9 = new gy3.f0
                r9.<init>()
                rx0.j$a$a r1 = new rx0.j$a$a
                r5 = 0
                r1.<init>(r9, r5, r7, r8)
                r6.f38546d = r9
                r6.f38548f = r2
                java.lang.Object r6 = a14.C53860b3.m60375c(r3, r1, r6)
                if (r6 != r0) goto L_0x004e
                return r0
            L_0x004e:
                r6 = r9
            L_0x004f:
                T r6 = r6.f27484d
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: rx0.C13591j.C13592a.m12900b(rx0.j, java.lang.String, android.widget.ImageView, wx3.d):java.lang.Object");
        }

        /* renamed from: c */
        public static Bitmap m12901c(C13591j jVar, Bitmap bitmap, Context context) {
            C87412m.m108594g(bitmap, "fgBitmap");
            C87412m.m108594g(context, "mContext");
            Point a = C75054z4.m90003a(context);
            int width = (int) (((float) bitmap.getWidth()) * (((float) (a.y - (C75044y4.m89994f(context) / 2))) / ((float) a.x)));
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), width, Bitmap.Config.ARGB_8888);
            Log.m105924i("BizTimeLineMultiTaskCoverCreator", "overlay, fgBitmap.width = " + bitmap.getWidth() + ", bgHeight = " + width);
            createBitmap.eraseColor(context.getResources().getColor(C0966R.color.f2929c));
            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), createBitmap.getConfig());
            Canvas canvas = new Canvas(createBitmap2);
            canvas.drawBitmap(createBitmap, new Matrix(), (Paint) null);
            Matrix matrix = new Matrix();
            matrix.setTranslate(0.0f, (float) (((double) (createBitmap.getHeight() - bitmap.getHeight())) / 2.0d));
            canvas.drawBitmap(bitmap, matrix, (Paint) null);
            C87412m.m108593f(createBitmap2, "bmOverlay");
            return createBitmap2;
        }

        /* renamed from: d */
        public static void m12902d(C13591j jVar, TextView textView, TextView textView2) {
            if (textView != null) {
                textView.setTextSize(1, 10.0f);
            }
            if (textView2 != null) {
                textView2.setTextSize(1, 7.0f);
            }
        }
    }
}
