package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.video.LocalVideoCropInfoParcelable;
import com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er1.C58741j5;
import er1.C58784w3;
import fy3.C32224a;
import gr1.C59664m2;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import me3.C109612c;
import me3.C109623f;
import p1093bh.C104101k;
import p248ug.C111164r0;
import p248ug.C111167t;
import p520fi.C107547d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sp3.C36777d;
import sx3.C110823p;
import sx3.C77813z;
import te3.C48889bp1;
import te3.C64477jr2;
import te3.C64494kj0;
import te3.C64689rq2;
import te3.C64775vi0;
import te3.C64803wi0;
import te3.zr4;
import up1.C37521f;
import vo3.C90852c;
import z20.C112573c;
import z20.C112579f;
import zp3.C112661i0;
import zp3.C66957j0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSelectCoverUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/ui/tools/t0;", "<init>", "()V", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI */
public final class FinderSelectCoverUI extends MMFinderUI implements C7020t0 {

    /* renamed from: x0 */
    public static int f161087x0;

    /* renamed from: A */
    public SeekBar f161088A;

    /* renamed from: B */
    public C59664m2 f161089B;

    /* renamed from: C */
    public View f161090C;

    /* renamed from: D */
    public final LinkedList<C64689rq2> f161091D = new LinkedList<>();

    /* renamed from: E */
    public C36777d f161092E;

    /* renamed from: F */
    public Canvas f161093F;

    /* renamed from: G */
    public Bitmap f161094G;

    /* renamed from: H */
    public Paint f161095H;

    /* renamed from: I */
    public boolean f161096I;

    /* renamed from: J */
    public int f161097J;

    /* renamed from: K */
    public final C64494kj0 f161098K = new C64494kj0();

    /* renamed from: L */
    public final C64803wi0 f161099L = new C64803wi0();

    /* renamed from: M */
    public boolean f161100M = true;

    /* renamed from: N */
    public final C13601g f161101N = C36568h.m40985a(C56359h.f161133d);

    /* renamed from: P */
    public final C13601g f161102P = C36568h.m40985a(new C56361j(this));

    /* renamed from: Q */
    public final C13601g f161103Q = C36568h.m40985a(new C56360i(this));

    /* renamed from: R */
    public C111164r0 f161104R;

    /* renamed from: S */
    public FrameLayout f161105S;

    /* renamed from: T */
    public C112661i0 f161106T;

    /* renamed from: U */
    public KeyboardHeightProvider f161107U;

    /* renamed from: V */
    public int f161108V;

    /* renamed from: W */
    public final C13601g f161109W = C36568h.m40985a(new C56353b(this));

    /* renamed from: X */
    public final C13601g f161110X = C36568h.m40985a(new C56352a(this));

    /* renamed from: Y */
    public boolean f161111Y;

    /* renamed from: Z */
    public boolean f161112Z = true;

    /* renamed from: o */
    public View f161113o;

    /* renamed from: p */
    public CropLayout f161114p;

    /* renamed from: p0 */
    public boolean f161115p0 = true;

    /* renamed from: q */
    public ImageView f161116q;

    /* renamed from: r */
    public View f161117r;

    /* renamed from: s */
    public TextView f161118s;

    /* renamed from: t */
    public WeImageView f161119t;

    /* renamed from: u */
    public View f161120u;

    /* renamed from: v */
    public View f161121v;

    /* renamed from: w */
    public View f161122w;

    /* renamed from: x */
    public View f161123x;

    /* renamed from: y */
    public View f161124y;

    /* renamed from: z */
    public View f161125z;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI$a */
    public static final class C56352a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectCoverUI f161126d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56352a(FinderSelectCoverUI finderSelectCoverUI) {
            super(0);
            this.f161126d = finderSelectCoverUI;
        }

        public Object invoke() {
            FinderSelectCoverUI finderSelectCoverUI = this.f161126d;
            int i = FinderSelectCoverUI.f161087x0;
            return Integer.valueOf((finderSelectCoverUI.mo79104T7() * 4) / 3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI$b */
    public static final class C56353b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectCoverUI f161127d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56353b(FinderSelectCoverUI finderSelectCoverUI) {
            super(0);
            this.f161127d = finderSelectCoverUI;
        }

        public Object invoke() {
            FinderSelectCoverUI finderSelectCoverUI = this.f161127d;
            int i = FinderSelectCoverUI.f161087x0;
            return Integer.valueOf(finderSelectCoverUI.mo79100G6().x - this.f161127d.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3705bx));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI$c */
    public static final class C56354c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectCoverUI f161128d;

        public C56354c(FinderSelectCoverUI finderSelectCoverUI) {
            this.f161128d = finderSelectCoverUI;
        }

        public final void onClick(View view) {
            LinkedList linkedList;
            C109623f presenter;
            C107547d dVar;
            C109623f presenter2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = this.f161128d.f161090C;
            if (view2 != null) {
                if (view2.isEnabled()) {
                    FinderSelectCoverUI finderSelectCoverUI = this.f161128d;
                    C59664m2 m2Var = finderSelectCoverUI.f161089B;
                    if (m2Var != null) {
                        Bitmap bitmap = m2Var.getBitmap();
                        if (bitmap == null) {
                            finderSelectCoverUI.finish();
                        } else {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            C13604l<Integer, Integer> V7 = finderSelectCoverUI.mo79106V7(((float) height) / ((float) width));
                            int intValue = ((Number) V7.f38555d).intValue();
                            int intValue2 = ((Number) V7.f38556e).intValue();
                            CropLayout cropLayout = finderSelectCoverUI.f161114p;
                            if (cropLayout != null) {
                                float f = cropLayout.getContentViewScale()[0];
                                CropLayout cropLayout2 = finderSelectCoverUI.f161114p;
                                if (cropLayout2 != null) {
                                    float f2 = (float) intValue;
                                    float f3 = f2 / f;
                                    float f4 = (float) intValue2;
                                    float f5 = f4 / cropLayout2.getContentViewScale()[1];
                                    Rect U7 = finderSelectCoverUI.mo79105U7(bitmap);
                                    Rect rect = U7;
                                    finderSelectCoverUI.mo79112b8(width, height, f3, f5, U7, 1 == finderSelectCoverUI.f161097J);
                                    int i = C37521f.f99374d.mo61161O().f267179t;
                                    int i2 = (int) ((f4 / f2) * ((float) i));
                                    C59664m2 m2Var2 = finderSelectCoverUI.f161089B;
                                    if (m2Var2 != null) {
                                        long currentPositionMs = m2Var2.getCurrentPositionMs();
                                        Log.m105924i("Finder.FinderSelectCoverUI", "save cover, size: " + i + ", " + i2 + " currentPosMs:" + currentPositionMs);
                                        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(createBitmap);
                                        canvas.drawBitmap(bitmap, new Rect(rect.left, rect.top, rect.right, rect.bottom), new Rect(0, 0, i, i2), (Paint) null);
                                        C112661i0 i0Var = finderSelectCoverUI.f161106T;
                                        C104101k kVar = (i0Var == null || (presenter2 = i0Var.getPresenter()) == null) ? null : (C104101k) ((C109612c) presenter2).mo160818b(C111167t.TEXT);
                                        if (kVar == null || (dVar = (C107547d) kVar.mo145692c()) == null) {
                                            linkedList = null;
                                        } else {
                                            LinkedList linkedList2 = new LinkedList();
                                            Iterator<C112573c> it = dVar.f321774d.iterator();
                                            while (it.hasNext()) {
                                                C112573c next = it.next();
                                                if (next instanceof C112579f) {
                                                    linkedList2.add((C112579f) next);
                                                }
                                            }
                                            linkedList = linkedList2;
                                        }
                                        if (linkedList == null || linkedList.isEmpty()) {
                                            C87412m.m108593f(createBitmap, "bitmap");
                                            finderSelectCoverUI.mo79102R7(bitmap, createBitmap, i, i2, currentPositionMs, (C64803wi0) null);
                                        } else {
                                            Log.m105925i("Finder.FinderSelectCoverUI", "gen title size %d", Integer.valueOf(linkedList.size()));
                                            C112661i0 i0Var2 = finderSelectCoverUI.f161106T;
                                            if (!(i0Var2 == null || (presenter = i0Var2.getPresenter()) == null)) {
                                                ((C109612c) presenter).mo160833q(i, i2);
                                            }
                                            finderSelectCoverUI.f161099L.f186121d = new LinkedList<>();
                                            finderSelectCoverUI.f161099L.f186122e = new LinkedList<>();
                                            for (Iterator it4 = linkedList.iterator(); it4.hasNext(); it4 = it4) {
                                                C112579f fVar = (C112579f) it4.next();
                                                finderSelectCoverUI.f161099L.f186121d.add(fVar.f337106C.toString());
                                                C64775vi0 vi02 = new C64775vi0();
                                                if (kVar == null || kVar.f307886c.width() == 0 || kVar.f307886c.height() == 0) {
                                                    vi02.f185902d = 0.5f;
                                                    vi02.f185903e = 0.5f;
                                                } else {
                                                    vi02.f185902d = fVar.f337069i.x / ((float) kVar.f307886c.width());
                                                    vi02.f185903e = fVar.f337069i.y / ((float) kVar.f307886c.height());
                                                }
                                                vi02.f185904f = fVar.f337104A ? 3 : fVar.f337111z != 0 ? 2 : 1;
                                                vi02.f185905g = String.format("#%06X", new Object[]{Integer.valueOf(fVar.f337110y & 16777215)});
                                                vi02.f185906h = String.format("#%06X", new Object[]{Integer.valueOf(fVar.f337111z & 16777215)});
                                                vi02.f185907i = fVar.f337071n;
                                                vi02.f185908j = fVar.f337070j;
                                                vi02.f185909n = fVar.f337106C.toString();
                                                finderSelectCoverUI.f161099L.f186122e.add(vi02);
                                            }
                                            C77813z.m93909o(linkedList, C56418r2.f161281d);
                                            Iterator it5 = linkedList.iterator();
                                            while (it5.hasNext()) {
                                                finderSelectCoverUI.f161099L.f186121d.add(((C112579f) it5.next()).f337106C.toString());
                                            }
                                            C111164r0 r0Var = finderSelectCoverUI.f161104R;
                                            if (r0Var != null) {
                                                C56447z2 z2Var = r7;
                                                C56447z2 z2Var2 = new C56447z2(finderSelectCoverUI, bitmap, createBitmap, i, i2, currentPositionMs, canvas);
                                                r0Var.mo162898g(z2Var);
                                            }
                                        }
                                    } else {
                                        C87412m.m108603p("seeker");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("cropLayout");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("cropLayout");
                                throw null;
                            }
                        }
                    } else {
                        C87412m.m108603p("seeker");
                        throw null;
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("selectBtn");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI$d */
    public static final class C56355d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectCoverUI f161129d;

        public C56355d(FinderSelectCoverUI finderSelectCoverUI) {
            this.f161129d = finderSelectCoverUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f161129d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI$e */
    public static final class C56356e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectCoverUI f161130d;

        public C56356e(FinderSelectCoverUI finderSelectCoverUI) {
            this.f161130d = finderSelectCoverUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f161130d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI$f */
    public static final class C56357f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectCoverUI f161131d;

        public C56357f(FinderSelectCoverUI finderSelectCoverUI) {
            this.f161131d = finderSelectCoverUI;
        }

        public final void run() {
            KeyboardHeightProvider keyboardHeightProvider = this.f161131d.f161107U;
            if (keyboardHeightProvider != null) {
                keyboardHeightProvider.mo104021d();
            } else {
                C87412m.m108603p("keyboardHeightProvider");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI$g */
    public static final class C56358g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectCoverUI f161132d;

        public C56358g(FinderSelectCoverUI finderSelectCoverUI) {
            this.f161132d = finderSelectCoverUI;
        }

        public final void run() {
            KeyboardHeightProvider keyboardHeightProvider = this.f161132d.f161107U;
            if (keyboardHeightProvider != null) {
                keyboardHeightProvider.mo104022e();
            } else {
                C87412m.m108603p("keyboardHeightProvider");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI$h */
    public static final class C56359h extends C87413o implements C32224a<Point> {

        /* renamed from: d */
        public static final C56359h f161133d = new C56359h();

        public C56359h() {
            super(0);
        }

        public Object invoke() {
            return C75044y4.m89990b(MMApplicationContext.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI$i */
    public static final class C56360i extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectCoverUI f161134d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56360i(FinderSelectCoverUI finderSelectCoverUI) {
            super(0);
            this.f161134d = finderSelectCoverUI;
        }

        public Object invoke() {
            return Float.valueOf(this.f161134d.getContext().getResources().getDimension(C0966R.dimen.f3761db));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI$j */
    public static final class C56361j extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectCoverUI f161135d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56361j(FinderSelectCoverUI finderSelectCoverUI) {
            super(0);
            this.f161135d = finderSelectCoverUI;
        }

        public Object invoke() {
            return Float.valueOf(this.f161135d.getContext().getResources().getDimension(C0966R.dimen.f3753d4));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI$k */
    public static final class C56362k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectCoverUI f161136d;

        public C56362k(FinderSelectCoverUI finderSelectCoverUI) {
            this.f161136d = finderSelectCoverUI;
        }

        public final void run() {
            View view = this.f161136d.f161113o;
            if (view != null) {
                int measuredHeight = (view.getMeasuredHeight() - this.f161136d.mo79103S7()) / 2;
                View view2 = this.f161136d.f161123x;
                if (view2 != null) {
                    view2.getLayoutParams().height = measuredHeight;
                    View view3 = this.f161136d.f161124y;
                    if (view3 != null) {
                        view3.getLayoutParams().height = measuredHeight;
                        View view4 = this.f161136d.f161113o;
                        if (view4 != null) {
                            view4.requestLayout();
                        } else {
                            C87412m.m108603p("contentLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("cropBottomView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("cropTopView");
                    throw null;
                }
            } else {
                C87412m.m108603p("contentLayout");
                throw null;
            }
        }
    }

    /* renamed from: N7 */
    public static final void m64621N7(FinderSelectCoverUI finderSelectCoverUI, float f, int i) {
        boolean z = 1 == i;
        C59664m2 m2Var = finderSelectCoverUI.f161089B;
        if (m2Var != null) {
            Bitmap bitmap = m2Var.getBitmap();
            if (bitmap != null) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                C13604l<Integer, Integer> V7 = finderSelectCoverUI.mo79106V7(((float) height) / ((float) width));
                int intValue = ((Number) V7.f38555d).intValue();
                int intValue2 = ((Number) V7.f38556e).intValue();
                CropLayout cropLayout = finderSelectCoverUI.f161114p;
                if (cropLayout != null) {
                    float f2 = cropLayout.getContentViewScale()[0];
                    CropLayout cropLayout2 = finderSelectCoverUI.f161114p;
                    if (cropLayout2 != null) {
                        finderSelectCoverUI.mo79112b8(width, height, ((float) intValue) / f2, ((float) intValue2) / cropLayout2.getContentViewScale()[1], finderSelectCoverUI.mo79105U7(bitmap), z);
                    } else {
                        C87412m.m108603p("cropLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("cropLayout");
                    throw null;
                }
            }
            finderSelectCoverUI.mo79111a8(f, i);
            CropLayout cropLayout3 = finderSelectCoverUI.f161114p;
            if (cropLayout3 != null) {
                cropLayout3.post(new C56407o2(finderSelectCoverUI));
            } else {
                C87412m.m108603p("cropLayout");
                throw null;
            }
        } else {
            C87412m.m108603p("seeker");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        r1 = r0.f183836j;
     */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m64622O7(com.tencent.p014mm.plugin.finder.p056ui.FinderSelectCoverUI r14, te3.C64689rq2 r15, android.graphics.Bitmap r16) {
        /*
            r7 = r14
            r0 = r15
            r8 = r16
            android.graphics.Canvas r1 = r7.f161093F
            java.lang.String r9 = "thumbPaint"
            r10 = 2
            r11 = 0
            if (r1 != 0) goto L_0x006e
            float r1 = r14.mo79108X7()
            int r1 = (int) r1
            float r2 = r14.mo79107W7()
            int r2 = (int) r2
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)
            java.lang.String r2 = "createBitmap(seekerThumb… Bitmap.Config.ARGB_8888)"
            gy3.C87412m.m108593f(r1, r2)
            r7.f161094G = r1
            android.graphics.Canvas r1 = new android.graphics.Canvas
            android.graphics.Bitmap r2 = r7.f161094G
            if (r2 == 0) goto L_0x0067
            r1.<init>(r2)
            r7.f161093F = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 1
            r1.<init>(r2)
            r7.f161095H = r1
            androidx.appcompat.app.AppCompatActivity r2 = r14.getContext()
            r3 = 2131099756(0x7f06006c, float:1.7811874E38)
            int r2 = p385u2.C111105a.m151500b(r2, r3)
            r1.setColor(r2)
            android.graphics.Paint r1 = r7.f161095H
            if (r1 == 0) goto L_0x0063
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            android.graphics.Paint r1 = r7.f161095H
            if (r1 == 0) goto L_0x005f
            androidx.appcompat.app.AppCompatActivity r2 = r14.getContext()
            int r2 = kg3.C76577a.m92151b(r2, r10)
            float r2 = (float) r2
            r1.setStrokeWidth(r2)
            goto L_0x006e
        L_0x005f:
            gy3.C87412m.m108603p(r9)
            throw r11
        L_0x0063:
            gy3.C87412m.m108603p(r9)
            throw r11
        L_0x0067:
            java.lang.String r0 = "thumbBitmap"
            gy3.C87412m.m108603p(r0)
            throw r11
        L_0x006e:
            android.graphics.Canvas r12 = r7.f161093F
            if (r12 == 0) goto L_0x0120
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.CLEAR
            r13 = 0
            r12.drawColor(r13, r1)
            boolean r1 = r0.f185280t
            if (r1 == 0) goto L_0x00cd
            boolean r1 = r7.f161096I
            if (r1 != 0) goto L_0x00cd
            te3.jr2 r0 = r0.f185281u
            if (r0 == 0) goto L_0x008b
            te3.zr4 r1 = r0.f183836j
            if (r1 == 0) goto L_0x008b
            int r1 = r1.f186847d
            goto L_0x008c
        L_0x008b:
            r1 = 0
        L_0x008c:
            if (r0 == 0) goto L_0x0095
            te3.zr4 r2 = r0.f183836j
            if (r2 == 0) goto L_0x0095
            int r2 = r2.f186850g
            goto L_0x0096
        L_0x0095:
            r2 = 0
        L_0x0096:
            if (r0 == 0) goto L_0x009f
            te3.zr4 r3 = r0.f183836j
            if (r3 == 0) goto L_0x009f
            int r3 = r3.f186849f
            goto L_0x00a0
        L_0x009f:
            r3 = 0
        L_0x00a0:
            if (r0 == 0) goto L_0x00aa
            te3.zr4 r0 = r0.f183836j
            if (r0 == 0) goto L_0x00aa
            int r0 = r0.f186848e
            r4 = r0
            goto L_0x00ab
        L_0x00aa:
            r4 = 0
        L_0x00ab:
            float r0 = r14.mo79108X7()
            int r5 = (int) r0
            float r0 = r14.mo79107W7()
            int r6 = (int) r0
            r0 = r14
            android.graphics.Rect r0 = r0.mo79101Q7(r1, r2, r3, r4, r5, r6)
            android.graphics.Rect r1 = new android.graphics.Rect
            float r2 = r14.mo79108X7()
            int r2 = (int) r2
            float r3 = r14.mo79107W7()
            int r3 = (int) r3
            r1.<init>(r13, r13, r2, r3)
            r12.drawBitmap(r8, r0, r1, r11)
            goto L_0x00f8
        L_0x00cd:
            r1 = 0
            r2 = 0
            int r3 = r16.getWidth()
            int r4 = r16.getHeight()
            float r0 = r14.mo79108X7()
            int r5 = (int) r0
            float r0 = r14.mo79107W7()
            int r6 = (int) r0
            r0 = r14
            android.graphics.Rect r0 = r0.mo79101Q7(r1, r2, r3, r4, r5, r6)
            android.graphics.Rect r1 = new android.graphics.Rect
            float r2 = r14.mo79108X7()
            int r2 = (int) r2
            float r3 = r14.mo79107W7()
            int r3 = (int) r3
            r1.<init>(r13, r13, r2, r3)
            r12.drawBitmap(r8, r0, r1, r11)
        L_0x00f8:
            androidx.appcompat.app.AppCompatActivity r0 = r14.getContext()
            int r0 = kg3.C76577a.m92151b(r0, r10)
            float r0 = (float) r0
            android.graphics.RectF r1 = new android.graphics.RectF
            int r2 = r12.getWidth()
            float r2 = (float) r2
            int r3 = r12.getHeight()
            float r3 = (float) r3
            r4 = 0
            r1.<init>(r4, r4, r2, r3)
            float r2 = (float) r10
            float r2 = r2 * r0
            android.graphics.Paint r0 = r7.f161095H
            if (r0 == 0) goto L_0x011c
            r12.drawRoundRect(r1, r2, r2, r0)
            goto L_0x0120
        L_0x011c:
            gy3.C87412m.m108603p(r9)
            throw r11
        L_0x0120:
            android.graphics.Point r0 = r14.mo79100G6()
            int r0 = r0.x
            androidx.appcompat.app.AppCompatActivity r1 = r14.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165284(0x7f070064, float:1.794478E38)
            int r1 = r1.getDimensionPixelSize(r2)
            int r0 = r0 - r1
            int r1 = r0 * 4
            int r1 = r1 / 3
            pl1.s r2 = pl1.C11989s.f34981a
            android.graphics.Bitmap r0 = r2.mo11860a(r8, r0, r1)
            com.tencent.mm.plugin.finder.ui.a3 r1 = new com.tencent.mm.plugin.finder.ui.a3
            r1.<init>(r14, r0)
            r14.runOnUiThread(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderSelectCoverUI.m64622O7(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI, te3.rq2, android.graphics.Bitmap):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (r3 == false) goto L_0x007c;
     */
    /* renamed from: P7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m64623P7(com.tencent.p014mm.plugin.finder.p056ui.FinderSelectCoverUI r10, android.graphics.Bitmap r11) {
        /*
            boolean r0 = r10.f161100M
            if (r0 == 0) goto L_0x0092
            te3.kj0 r0 = r10.f161098K
            float r1 = r0.f183946f
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0018
            float r0 = r0.f183947g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            if (r0 == 0) goto L_0x0092
            com.tencent.mm.ui.widget.cropview.CropLayout r0 = r10.f161114p
            java.lang.String r1 = "cropLayout"
            r5 = 0
            if (r0 == 0) goto L_0x008e
            float[] r0 = r0.getContentViewScale()
            r0 = r0[r4]
            com.tencent.mm.ui.widget.cropview.CropLayout r6 = r10.f161114p
            if (r6 == 0) goto L_0x008a
            float[] r6 = r6.getContentViewScale()
            r6 = r6[r3]
            int r7 = r11.getWidth()
            float r7 = (float) r7
            float r7 = r7 * r0
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 * r6
            int r0 = r10.mo79104T7()
            int r6 = r10.mo79103S7()
            float r0 = (float) r0
            r8 = 2
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x0059
            te3.kj0 r9 = r10.f161098K
            float r9 = r9.f183945e
            float r9 = r9 * r7
            float r7 = r7 - r0
            float r0 = (float) r8
            float r7 = r7 / r0
            float r9 = r9 - r7
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            float r0 = (float) r6
            int r6 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x006a
            te3.kj0 r6 = r10.f161098K
            float r6 = r6.f183944d
            float r6 = r6 * r11
            float r11 = r11 - r0
            float r0 = (float) r8
            float r11 = r11 / r0
            float r6 = r6 - r11
            goto L_0x006b
        L_0x006a:
            r6 = 0
        L_0x006b:
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x0071
            r11 = 1
            goto L_0x0072
        L_0x0071:
            r11 = 0
        L_0x0072:
            if (r11 == 0) goto L_0x007c
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r3 = 0
        L_0x007a:
            if (r3 != 0) goto L_0x0083
        L_0x007c:
            com.tencent.mm.ui.widget.cropview.CropLayout r11 = r10.f161114p
            if (r11 == 0) goto L_0x0086
            r11.mo154441I(r9, r6)
        L_0x0083:
            r10.f161100M = r4
            goto L_0x0092
        L_0x0086:
            gy3.C87412m.m108603p(r1)
            throw r5
        L_0x008a:
            gy3.C87412m.m108603p(r1)
            throw r5
        L_0x008e:
            gy3.C87412m.m108603p(r1)
            throw r5
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderSelectCoverUI.m64623P7(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI, android.graphics.Bitmap):void");
    }

    /* renamed from: G6 */
    public final Point mo79100G6() {
        return (Point) ((C36570n) this.f161101N).getValue();
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 74;
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        C112661i0 i0Var = this.f161106T;
        if (i0Var != null) {
            i0Var.f319943t.postDelayed(new C66957j0(i0Var, i), 160);
        }
    }

    /* renamed from: Q7 */
    public final Rect mo79101Q7(int i, int i2, int i3, int i4, int i5, int i6) {
        float f;
        float f2;
        int abs = Math.abs(i3 - i);
        int abs2 = Math.abs(i4 - i2);
        float f3 = 0.0f;
        if (abs * i6 > i5 * abs2) {
            f = ((float) i6) / ((float) abs2);
            f3 = ((((float) abs) * f) - ((float) i5)) * 0.5f;
            f2 = 0.0f;
        } else {
            float f4 = ((float) i5) / ((float) abs);
            f2 = ((((float) abs2) * f4) - ((float) i6)) * 0.5f;
            f = f4;
        }
        int i7 = (int) (f3 / f);
        int i8 = (int) (f2 / f);
        if (i7 < 0) {
            i7 = 0;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        return new Rect(i + i7, i2 + i8, i3 - i7, i4 - i8);
    }

    /* renamed from: R7 */
    public final void mo79102R7(Bitmap bitmap, Bitmap bitmap2, int i, int i2, long j, C64803wi0 wi02) {
        int i3;
        StringBuilder sb = new StringBuilder();
        C58741j5 j5Var = C58741j5.f168184a;
        String str = C58741j5.f168196m;
        sb.append(str);
        sb.append("cover_full");
        sb.append(System.currentTimeMillis());
        String sb4 = sb.toString();
        C37521f fVar = C37521f.f99374d;
        boolean saveBitmapToImage = BitmapUtil.saveBitmapToImage(bitmap, fVar.mo61152F(), Bitmap.CompressFormat.JPEG, sb4, false);
        String str2 = str + "cover_" + System.currentTimeMillis();
        boolean saveBitmapToImage2 = BitmapUtil.saveBitmapToImage(bitmap2, fVar.mo61152F(), Bitmap.CompressFormat.JPEG, str2, false);
        if (fVar.mo61155I()) {
            fVar.getClass();
            i3 = AdaptiveAdjustBitrate.m119559e(C37521f.f99419i, 0, i, i2, ((float) fVar.mo61152F()) / 100.0f);
        } else {
            i3 = 0;
        }
        Intent intent = new Intent();
        if (saveBitmapToImage) {
            intent.putExtra("RESULT_COVER_FULL_PATH", sb4);
        }
        if (saveBitmapToImage2) {
            intent.putExtra("RESULT_COVER_PATH", str2);
            intent.putExtra("RESULT_COVER_QUALITY", i3);
            intent.putExtra("RESULT_COVER_TIME_MS", j);
            intent.putExtra("RESULT_COVER_CROP_MODEL", this.f161098K.toByteArray());
            intent.putExtra("RESULT_COVER_WORD_INFO_WRAP", wi02 != null ? wi02.toByteArray() : null);
            if (this.f161096I) {
                C64689rq2 first = this.f161091D.getFirst();
                C64477jr2 jr22 = new C64477jr2();
                C64477jr2 jr23 = first.f185281u;
                if (jr23 != null) {
                    CropLayout cropLayout = this.f161114p;
                    if (cropLayout != null) {
                        float f = cropLayout.getContentViewScale()[0];
                        CropLayout cropLayout2 = this.f161114p;
                        if (cropLayout2 != null) {
                            float f2 = -cropLayout2.getContentViewTrans()[1];
                            zr4 zr4 = new zr4();
                            zr4 zr42 = jr23.f183836j;
                            C87412m.m108591d(zr42);
                            zr4.f186847d = zr42.f186847d;
                            zr4 zr43 = jr23.f183836j;
                            C87412m.m108591d(zr43);
                            zr4.f186849f = zr43.f186849f;
                            zr4 zr44 = jr23.f183836j;
                            C87412m.m108591d(zr44);
                            int i4 = zr44.f186848e;
                            zr4 zr45 = jr23.f183836j;
                            C87412m.m108591d(zr45);
                            float f3 = f2 / f;
                            zr4.f186848e = (int) (((float) (i4 - zr45.f186850g)) + f3);
                            zr4.f186850g = (int) f3;
                            jr22.f183836j = zr4;
                            C64477jr2 jr24 = first.f185281u;
                            C87412m.m108591d(jr24);
                            zr4 zr46 = jr24.f183830d;
                            zr4 zr47 = new zr4();
                            C87412m.m108591d(zr46);
                            zr47.f186847d = zr46.f186847d;
                            int i5 = (int) f2;
                            zr47.f186850g = i5;
                            zr47.f186848e = i5 + Math.abs(zr46.f186850g - zr46.f186848e);
                            zr47.f186849f = zr46.f186849f;
                            jr22.f183830d = zr47;
                            CropLayout cropLayout3 = this.f161114p;
                            if (cropLayout3 != null) {
                                Matrix matrix = new Matrix(cropLayout3.getMainMatrix());
                                matrix.postTranslate(0.0f, 0.0f);
                                float[] fArr = new float[9];
                                matrix.getValues(fArr);
                                C48889bp1 bp12 = new C48889bp1();
                                bp12.f131245d.addAll(C110823p.m150998X(fArr));
                                jr22.f183831e = bp12;
                                LocalVideoCropInfoParcelable localVideoCropInfoParcelable = new LocalVideoCropInfoParcelable();
                                localVideoCropInfoParcelable.f161940d = jr22;
                                C13598b0 b0Var = C13598b0.f38549a;
                                intent.putExtra("RESULT_CROP_INFO", localVideoCropInfoParcelable);
                            } else {
                                C87412m.m108603p("cropLayout");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("cropLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("cropLayout");
                        throw null;
                    }
                }
            }
        }
        intent.putExtra("RESULT_COVER_STYLE", this.f161097J);
        setResult(0, intent);
        finish();
    }

    /* renamed from: S7 */
    public final int mo79103S7() {
        return ((Number) ((C36570n) this.f161110X).getValue()).intValue();
    }

    /* renamed from: T7 */
    public final int mo79104T7() {
        return ((Number) ((C36570n) this.f161109W).getValue()).intValue();
    }

    /* renamed from: U7 */
    public final Rect mo79105U7(Bitmap bitmap) {
        int width;
        int width2 = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = (float) height;
        float f2 = (float) width2;
        float f3 = f / f2;
        C13604l<Integer, Integer> V7 = mo79106V7(f3);
        int intValue = ((Number) V7.f38555d).intValue();
        int intValue2 = ((Number) V7.f38556e).intValue();
        CropLayout cropLayout = this.f161114p;
        if (cropLayout != null) {
            float f4 = cropLayout.getContentViewScale()[0];
            CropLayout cropLayout2 = this.f161114p;
            if (cropLayout2 != null) {
                float f5 = cropLayout2.getContentViewScale()[1];
                float f6 = ((float) intValue) / f4;
                float f7 = ((float) intValue2) / f5;
                CropLayout cropLayout3 = this.f161114p;
                if (cropLayout3 != null) {
                    float f8 = (-cropLayout3.getContentViewTrans()[0]) / f4;
                    CropLayout cropLayout4 = this.f161114p;
                    if (cropLayout4 != null) {
                        float f9 = (-cropLayout4.getContentViewTrans()[1]) / f5;
                        int i = height;
                        float f15 = (float) 2;
                        int i2 = width2;
                        RectF rectF = new RectF((f2 - f6) / f15, (f - f7) / f15, (f2 + f6) / f15, (f + f7) / f15);
                        if (f3 <= 1.0f) {
                            width = (mo79100G6().x - intValue) / 2;
                        } else {
                            if (f3 < 1.3333334f) {
                                CropLayout cropLayout5 = this.f161114p;
                                if (cropLayout5 != null) {
                                    width = (cropLayout5.getWidth() - intValue) / 2;
                                } else {
                                    C87412m.m108603p("cropLayout");
                                    throw null;
                                }
                            }
                            float f16 = f8 - rectF.left;
                            Rect rect = new Rect((int) (rectF.left + f16), (int) (rectF.top + f9), (int) (rectF.right + f16), (int) (rectF.bottom + f9));
                            Log.m105924i("Finder.FinderSelectCoverUI", "scaleX:" + f4 + " scaleY:" + f5 + " translateX:" + f8 + " translateY:" + f9 + " mappedWidth:" + f6 + " mappedHeight:" + f7 + " originWidth:" + i2 + " originHeight:" + i);
                            return rect;
                        }
                        f8 += ((float) width) / f4;
                        float f162 = f8 - rectF.left;
                        Rect rect2 = new Rect((int) (rectF.left + f162), (int) (rectF.top + f9), (int) (rectF.right + f162), (int) (rectF.bottom + f9));
                        Log.m105924i("Finder.FinderSelectCoverUI", "scaleX:" + f4 + " scaleY:" + f5 + " translateX:" + f8 + " translateY:" + f9 + " mappedWidth:" + f6 + " mappedHeight:" + f7 + " originWidth:" + i2 + " originHeight:" + i);
                        return rect2;
                    }
                    C87412m.m108603p("cropLayout");
                    throw null;
                }
                C87412m.m108603p("cropLayout");
                throw null;
            }
            C87412m.m108603p("cropLayout");
            throw null;
        }
        C87412m.m108603p("cropLayout");
        throw null;
    }

    /* renamed from: V7 */
    public final C13604l<Integer, Integer> mo79106V7(float f) {
        int i;
        int i2;
        int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i3 == 0) {
            i = mo79103S7();
            i2 = mo79103S7();
        } else if (i3 >= 0) {
            i = mo79104T7();
            i2 = mo79103S7();
        } else if (this.f161097J == 2) {
            i = mo79104T7();
            i2 = mo79104T7();
        } else {
            i = mo79103S7();
            i2 = mo79103S7();
        }
        return new C13604l<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: W7 */
    public final float mo79107W7() {
        return ((Number) ((C36570n) this.f161103Q).getValue()).floatValue();
    }

    /* renamed from: X7 */
    public final float mo79108X7() {
        return ((Number) ((C36570n) this.f161102P).getValue()).floatValue();
    }

    /* renamed from: Y7 */
    public final void mo79109Y7(int i, Rect rect, Stack<C112573c> stack) {
        if (stack != null) {
            Iterator<C112573c> it = stack.iterator();
            C87412m.m108593f(it, "stack.iterator()");
            while (it.hasNext()) {
                C112573c next = it.next();
                next.f337069i.y -= (float) i;
                Rect rect2 = new Rect();
                next.mo164316j(rect2);
                int i2 = rect2.top;
                int i3 = rect2.bottom;
                float f = (float) i2;
                if (f < 0.0f) {
                    next.f337069i.y -= f;
                } else if (i3 > rect.height()) {
                    next.f337069i.y -= ((float) i3) - ((float) rect.height());
                }
                next.mo164319m(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0 = (r0 = r0.f332923a).f332928e;
     */
    /* renamed from: Z7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79110Z7() {
        /*
            r5 = this;
            ug.r0 r0 = r5.f161104R
            r1 = 0
            if (r0 == 0) goto L_0x0010
            ug.r0$a r0 = r0.f332923a
            if (r0 == 0) goto L_0x0010
            android.graphics.Rect r0 = r0.f332928e
            if (r0 == 0) goto L_0x0010
            int r0 = r0.top
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            f161087x0 = r0
            zp3.i0 r0 = r5.f161106T
            if (r0 == 0) goto L_0x0022
            cq3.a r0 = r0.getBaseBoardView()
            cq3.g r0 = (cq3.C106961g) r0
            if (r0 == 0) goto L_0x0022
            r0.mo157350h()
        L_0x0022:
            zp3.i0 r0 = r5.f161106T
            r2 = 0
            if (r0 == 0) goto L_0x0038
            me3.f r0 = r0.getPresenter()
            if (r0 == 0) goto L_0x0038
            ug.t r3 = p248ug.C111167t.TEXT
            me3.c r0 = (me3.C109612c) r0
            bh.b r0 = r0.mo160818b(r3)
            bh.k r0 = (p1093bh.C104101k) r0
            goto L_0x0039
        L_0x0038:
            r0 = r2
        L_0x0039:
            if (r0 != 0) goto L_0x003c
            return
        L_0x003c:
            fi.g r3 = r0.mo145692c()
            fi.d r3 = (p520fi.C107547d) r3
            if (r3 == 0) goto L_0x004e
            r4 = 1
            int r3 = r3.mo157975D1(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x004f
        L_0x004e:
            r3 = r2
        L_0x004f:
            fi.g r4 = r0.mo145692c()
            fi.d r4 = (p520fi.C107547d) r4
            if (r4 == 0) goto L_0x005f
            int r2 = r4.mo157975D1(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x005f:
            r0.mo145712w()
            zp3.i0 r0 = r5.f161106T
            if (r0 == 0) goto L_0x0070
            me3.f r0 = r0.getPresenter()
            if (r0 == 0) goto L_0x0070
            me3.c r0 = (me3.C109612c) r0
            r0.f328175r = r1
        L_0x0070:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "save alive "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " last "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderSelectCoverUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderSelectCoverUI.mo79110Z7():void");
    }

    /* renamed from: a8 */
    public final void mo79111a8(float f, int i) {
        int i2;
        int i3 = i;
        int T7 = mo79104T7();
        int S7 = mo79103S7();
        View view = this.f161113o;
        if (view != null) {
            if (view.getMeasuredHeight() == 0) {
                View view2 = this.f161113o;
                if (view2 != null) {
                    view2.post(new C56362k(this));
                } else {
                    C87412m.m108603p("contentLayout");
                    throw null;
                }
            }
            View view3 = this.f161125z;
            if (view3 != null) {
                view3.getLayoutParams().height = mo79103S7();
                CropLayout cropLayout = this.f161114p;
                if (cropLayout != null) {
                    cropLayout.getVisibilityRect().setEmpty();
                    boolean z = true;
                    int i4 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                    if (i4 <= 0) {
                        C58784w3 w3Var = C58784w3.f168295a;
                        int i5 = mo79100G6().x;
                        int i6 = (int) (((float) mo79100G6().x) * f);
                        w3Var.getClass();
                        float f2 = (float) i5;
                        float f3 = (((float) i6) * 1.0f) / f2;
                        C13604l lVar = f3 > 1.3333334f ? new C13604l(Integer.valueOf(i5), Integer.valueOf((int) (f2 * 1.3333334f))) : f3 < 1.0f ? new C13604l(Integer.valueOf(i5), Integer.valueOf(i5)) : new C13604l(Integer.valueOf(i5), Integer.valueOf(i6));
                        int intValue = (((Number) lVar.f38556e).intValue() * T7) / ((Number) lVar.f38555d).intValue();
                        if (intValue < S7) {
                            if (i3 == 1) {
                                ImageView imageView = this.f161116q;
                                if (imageView != null) {
                                    imageView.setVisibility(8);
                                    TextView textView = this.f161118s;
                                    if (textView != null) {
                                        textView.setText(getContext().getResources().getString(C0966R.string.f360484mv3));
                                        WeImageView weImageView = this.f161119t;
                                        if (weImageView != null) {
                                            weImageView.setImageResource(C0966R.raw.finder_icons_filled_min_window);
                                            int i7 = (mo79100G6().x - S7) / 2;
                                            Rect rect = new Rect(i7, 0, i7 >= 0 ? S7 - i7 : S7 + i7, S7);
                                            CropLayout cropLayout2 = this.f161114p;
                                            if (cropLayout2 != null) {
                                                cropLayout2.getVisibilityRect().set(rect);
                                            } else {
                                                C87412m.m108603p("cropLayout");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("cropWayIv");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("cropWayTv");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("cropBlurView");
                                    throw null;
                                }
                            } else if (i3 == 2) {
                                ImageView imageView2 = this.f161116q;
                                if (imageView2 != null) {
                                    imageView2.setVisibility(0);
                                    TextView textView2 = this.f161118s;
                                    if (textView2 != null) {
                                        textView2.setText(getContext().getResources().getString(C0966R.string.mv4));
                                        WeImageView weImageView2 = this.f161119t;
                                        if (weImageView2 != null) {
                                            weImageView2.setImageResource(C0966R.raw.finder_icons_filled_max_window);
                                            int i8 = (mo79100G6().x - T7) / 2;
                                            Rect rect2 = new Rect(i8, 0, T7 + i8, intValue);
                                            CropLayout cropLayout3 = this.f161114p;
                                            if (cropLayout3 != null) {
                                                cropLayout3.getVisibilityRect().set(rect2);
                                                S7 = intValue;
                                            } else {
                                                C87412m.m108603p("cropLayout");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("cropWayIv");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("cropWayTv");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("cropBlurView");
                                    throw null;
                                }
                            }
                            View view4 = this.f161117r;
                            if (view4 != null) {
                                if (i4 != 0) {
                                    z = false;
                                }
                                if (z) {
                                    CropLayout cropLayout4 = this.f161114p;
                                    if (cropLayout4 != null) {
                                        cropLayout4.setEnableTouch(false);
                                        i2 = 8;
                                    } else {
                                        C87412m.m108603p("cropLayout");
                                        throw null;
                                    }
                                } else {
                                    i2 = 0;
                                }
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(Integer.valueOf(i2));
                                View view5 = view4;
                                C117292a.m165358d(view5, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "updateCropLayout", "(FI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "updateCropLayout", "(FI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                this.f161097J = i3;
                            } else {
                                C87412m.m108603p("cropWayLayout");
                                throw null;
                            }
                        }
                    } else {
                        if (f >= 1.3333334f) {
                            CropLayout cropLayout5 = this.f161114p;
                            if (cropLayout5 != null) {
                                cropLayout5.getLayoutParams().width = T7;
                                S7 = (int) (((float) T7) * f);
                                int S72 = (S7 - mo79103S7()) / 2;
                                Rect rect3 = new Rect(0, S72, T7, mo79103S7() + S72);
                                CropLayout cropLayout6 = this.f161114p;
                                if (cropLayout6 != null) {
                                    cropLayout6.getVisibilityRect().set(rect3);
                                } else {
                                    C87412m.m108603p("cropLayout");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("cropLayout");
                                throw null;
                            }
                        } else {
                            int i9 = (int) (((float) S7) / f);
                            CropLayout cropLayout7 = this.f161114p;
                            if (cropLayout7 != null) {
                                ViewGroup.LayoutParams layoutParams = cropLayout7.getLayoutParams();
                                if (i9 > mo79100G6().x) {
                                    i9 = mo79100G6().x;
                                }
                                layoutParams.width = i9;
                                CropLayout cropLayout8 = this.f161114p;
                                if (cropLayout8 != null) {
                                    int i15 = (cropLayout8.getLayoutParams().width - T7) / 2;
                                    Rect rect4 = new Rect(i15, 0, T7 + i15, S7);
                                    CropLayout cropLayout9 = this.f161114p;
                                    if (cropLayout9 != null) {
                                        cropLayout9.getVisibilityRect().set(rect4);
                                    } else {
                                        C87412m.m108603p("cropLayout");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("cropLayout");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("cropLayout");
                                throw null;
                            }
                        }
                        this.f161097J = 1;
                        View view6 = this.f161117r;
                        if (view6 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(8);
                            View view7 = view6;
                            C117292a.m165358d(view7, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "updateCropLayout", "(FI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view6.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "updateCropLayout", "(FI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            C87412m.m108603p("cropWayLayout");
                            throw null;
                        }
                    }
                    CropLayout cropLayout10 = this.f161114p;
                    if (cropLayout10 != null) {
                        cropLayout10.getLayoutParams().height = S7;
                        View view8 = this.f161113o;
                        if (view8 != null) {
                            view8.requestLayout();
                            StringBuilder sb = new StringBuilder();
                            sb.append("[updateCropLayout] cropLayoutLp.width=");
                            CropLayout cropLayout11 = this.f161114p;
                            if (cropLayout11 != null) {
                                sb.append(cropLayout11.getWidth());
                                sb.append(" cropLayoutLp.height=");
                                CropLayout cropLayout12 = this.f161114p;
                                if (cropLayout12 != null) {
                                    sb.append(cropLayout12.getHeight());
                                    Log.m105924i("Finder.FinderSelectCoverUI", sb.toString());
                                    return;
                                }
                                C87412m.m108603p("cropLayout");
                                throw null;
                            }
                            C87412m.m108603p("cropLayout");
                            throw null;
                        }
                        C87412m.m108603p("contentLayout");
                        throw null;
                    }
                    C87412m.m108603p("cropLayout");
                    throw null;
                }
                C87412m.m108603p("cropLayout");
                throw null;
            }
            C87412m.m108603p("centerHoleView");
            throw null;
        }
        C87412m.m108603p("contentLayout");
        throw null;
    }

    /* renamed from: b8 */
    public final void mo79112b8(int i, int i2, float f, float f2, Rect rect, boolean z) {
        float f3 = (float) i;
        if (f3 <= f || i <= 0) {
            float f4 = (float) i2;
            if (f4 > f2 && i2 > 0) {
                C64494kj0 kj02 = this.f161098K;
                kj02.f183944d = ((float) rect.top) / f4;
                kj02.f183947g = f2 / f4;
                return;
            }
            return;
        }
        float f5 = (float) rect.left;
        int T7 = mo79104T7();
        int S7 = mo79103S7();
        float f6 = (float) i2;
        float f7 = ((float) S7) / f6;
        if (z && f6 / f3 <= 1.0f) {
            f5 += (((float) (S7 - T7)) / f7) / ((float) 2);
        }
        C64494kj0 kj03 = this.f161098K;
        kj03.f183945e = f5 / f3;
        kj03.f183946f = f / f3;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ap7;
    }

    public void initView() {
        super.initView();
        View findViewById = findViewById(C0966R.C0970id.nl6);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_content_top_layout)");
        this.f161113o = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.d85);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_crop_layout)");
        this.f161114p = (CropLayout) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.nl_);
        C87412m.m108593f(findViewById3, "findViewById(R.id.finder_crop_blur_view)");
        this.f161116q = (ImageView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.nle);
        C87412m.m108593f(findViewById4, "findViewById(R.id.finder_crop_way_layout)");
        this.f161117r = findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.nlf);
        C87412m.m108593f(findViewById5, "findViewById(R.id.finder_crop_way_text)");
        this.f161118s = (TextView) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.nld);
        C87412m.m108593f(findViewById6, "findViewById(R.id.finder_crop_way_icon)");
        this.f161119t = (WeImageView) findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.nlc);
        C87412m.m108593f(findViewById7, "findViewById(R.id.finder_crop_top_cover)");
        this.f161123x = findViewById7;
        View findViewById8 = findViewById(C0966R.C0970id.nla);
        C87412m.m108593f(findViewById8, "findViewById(R.id.finder_crop_bottom_cover)");
        this.f161124y = findViewById8;
        View findViewById9 = findViewById(C0966R.C0970id.nn4);
        C87412m.m108593f(findViewById9, "findViewById(R.id.finder…elect_center_hole_layout)");
        this.f161125z = findViewById9;
        View findViewById10 = findViewById(C0966R.C0970id.j9x);
        C87412m.m108593f(findViewById10, "findViewById(R.id.select_cover_seekbar)");
        this.f161088A = (SeekBar) findViewById10;
        View findViewById11 = findViewById(C0966R.C0970id.j9w);
        C87412m.m108593f(findViewById11, "findViewById(R.id.select_cover_ok)");
        this.f161090C = findViewById11;
        findViewById11.setEnabled(false);
        View view = this.f161090C;
        if (view != null) {
            view.setOnClickListener(new C56354c(this));
            findViewById(C0966R.C0970id.j9u).setOnClickListener(new C56355d(this));
            View findViewById12 = findViewById(C0966R.C0970id.nl8);
            C87412m.m108593f(findViewById12, "findViewById(R.id.finder_crop_add_title_layout)");
            this.f161121v = findViewById12;
            View findViewById13 = findViewById(C0966R.C0970id.j9v);
            C87412m.m108593f(findViewById13, "findViewById(R.id.select_cover_footer)");
            this.f161122w = findViewById13;
            View findViewById14 = findViewById(C0966R.C0970id.nlb);
            C87412m.m108593f(findViewById14, "findViewById(R.id.finder_crop_operation_layout)");
            this.f161120u = findViewById14;
            return;
        }
        C87412m.m108603p("selectBtn");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0607  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r26) {
        /*
            r25 = this;
            r9 = r25
            r0 = 2131886733(0x7f12028d, float:1.9408053E38)
            r9.setTheme(r0)
            r10 = 1
            r9.requestWindowFeature(r10)
            super.onCreate(r26)
            android.view.Window r0 = r25.getWindow()
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setStatusBarColor(r1)
            r9.updataStatusBarIcon(r10)
            com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI$e r0 = new com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI$e
            r0.<init>(r9)
            r9.setBackBtn(r0)
            te3.pq2 r0 = new te3.pq2
            r0.<init>()
            android.content.Intent r1 = r25.getIntent()
            java.lang.String r2 = "media_list_"
            byte[] r1 = r1.getByteArrayExtra(r2)
            r11 = 0
            if (r1 != 0) goto L_0x0036
            goto L_0x0047
        L_0x0036:
            r0.parseFrom(r1)     // Catch:{ Exception -> 0x003a }
            goto L_0x0048
        L_0x003a:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r1
            java.lang.String r1 = "safeParser"
            java.lang.String r2 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r2, r0)
        L_0x0047:
            r0 = 0
        L_0x0048:
            if (r0 != 0) goto L_0x004f
            te3.pq2 r0 = new te3.pq2
            r0.<init>()
        L_0x004f:
            java.util.LinkedList<te3.rq2> r1 = r9.f161091D
            java.util.LinkedList<te3.rq2> r0 = r0.f184875d
            r1.addAll(r0)
            android.content.Intent r0 = r25.getIntent()
            java.lang.String r1 = "cover_style"
            r13 = 2
            int r0 = r0.getIntExtra(r1, r13)
            r9.f161097J = r0
            if (r0 != 0) goto L_0x0067
            r9.f161097J = r13
        L_0x0067:
            android.content.Intent r0 = r25.getIntent()
            java.lang.String r1 = "cover_crop_model"
            byte[] r0 = r0.getByteArrayExtra(r1)
            if (r0 == 0) goto L_0x0078
            te3.kj0 r1 = r9.f161098K
            r1.parseFrom(r0)
        L_0x0078:
            android.content.Intent r0 = r25.getIntent()
            java.lang.String r1 = "cover_word_info_WRAP"
            byte[] r0 = r0.getByteArrayExtra(r1)
            if (r0 == 0) goto L_0x0089
            te3.wi0 r1 = r9.f161099L
            r1.parseFrom(r0)
        L_0x0089:
            android.content.Intent r0 = r25.getIntent()
            java.lang.String r1 = "isLongVideoPost"
            boolean r0 = r0.getBooleanExtra(r1, r11)
            r9.f161096I = r0
            r25.initView()
            java.util.LinkedList<te3.rq2> r0 = r9.f161091D
            java.lang.Object r0 = r0.getFirst()
            te3.rq2 r0 = (te3.C64689rq2) r0
            java.lang.String r1 = "media"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.Class<tz.f> r1 = p707tz.C65000f.class
            int r2 = r0.f185269g
            long r2 = (long) r2
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            er1.w3 r4 = er1.C58784w3.f168295a
            boolean r4 = r4.mo83894P0(r0)
            java.lang.String r5 = " media.height="
            java.lang.String r6 = " media.width="
            java.lang.String r7 = " videoHeight="
            java.lang.String r8 = "Finder.FinderSelectCoverUI"
            r14 = 3
            if (r4 == 0) goto L_0x0163
            java.lang.String r4 = r0.f185266d
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 == 0) goto L_0x0120
            gr1.u0 r4 = new gr1.u0
            r4.<init>(r9, r0)
            r9.f161089B = r4
            di3.d r4 = di3.C86312j.m106911c(r1)
            tz.f r4 = (p707tz.C65000f) r4
            java.lang.String r15 = r0.f185266d
            com.tencent.mm.plugin.sight.base.a r4 = r4.mo89183Yp(r15)
            if (r4 == 0) goto L_0x00e0
            int r2 = r4.f273443a
            long r2 = (long) r2
            goto L_0x00e5
        L_0x00e0:
            java.lang.String r4 = "initView: mediaInfo null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r4)
        L_0x00e5:
            di3.d r1 = di3.C86312j.m106911c(r1)
            tz.f r1 = (p707tz.C65000f) r1
            java.lang.String r4 = r0.f185266d
            com.tencent.mm.plugin.sight.base.a r1 = r1.tg0(r4)
            int r4 = r1.f273445c
            int r1 = r1.f273446d
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r12 = "1 videoWidth="
            r15.append(r12)
            r15.append(r4)
            r15.append(r7)
            r15.append(r1)
            r15.append(r6)
            float r6 = r0.f185270h
            r15.append(r6)
            r15.append(r5)
            float r5 = r0.f185271i
            r15.append(r5)
            java.lang.String r5 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            goto L_0x0157
        L_0x0120:
            gr1.w0 r1 = new gr1.w0
            r1.<init>(r9, r0)
            r9.f161089B = r1
            float r1 = r0.f185270h
            int r4 = (int) r1
            float r1 = r0.f185271i
            int r1 = (int) r1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "2 videoWidth="
            r12.append(r15)
            r12.append(r4)
            r12.append(r7)
            r12.append(r1)
            r12.append(r6)
            float r6 = r0.f185270h
            r12.append(r6)
            r12.append(r5)
            float r5 = r0.f185271i
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
        L_0x0157:
            float r5 = r25.mo79108X7()
            int r5 = (int) r5
            float r6 = r25.mo79107W7()
            int r6 = (int) r6
            goto L_0x0307
        L_0x0163:
            te3.zy r4 = r0.f185235B
            if (r4 == 0) goto L_0x02e3
            te3.az r2 = r4.f186904i
            te3.n93 r3 = r2.f297894A
            if (r3 != 0) goto L_0x025c
            te3.ep3 r1 = r2.f297899g
            te3.iq0 r2 = r0.f185248P
            if (r2 == 0) goto L_0x01be
            float r3 = r2.f183719f
            float r12 = r2.f183717d
            float r3 = r3 - r12
            float r3 = java.lang.Math.abs(r3)
            r12 = 0
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x01be
            float r3 = r2.f183718e
            float r15 = r2.f183720g
            float r3 = r3 - r15
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x01be
            java.util.LinkedList<java.lang.Integer> r3 = r1.f183015d
            float r12 = r2.f183717d
            int r12 = (int) r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r3.set(r11, r12)
            java.util.LinkedList<java.lang.Integer> r3 = r1.f183015d
            float r12 = r2.f183718e
            int r12 = (int) r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r3.set(r10, r12)
            java.util.LinkedList<java.lang.Integer> r3 = r1.f183015d
            float r12 = r2.f183719f
            int r12 = (int) r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r3.set(r13, r12)
            java.util.LinkedList<java.lang.Integer> r3 = r1.f183015d
            float r2 = r2.f183720g
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.set(r14, r2)
        L_0x01be:
            android.graphics.Rect r2 = new android.graphics.Rect
            java.util.LinkedList<java.lang.Integer> r3 = r1.f183015d
            java.lang.Object r3 = r3.get(r11)
            java.lang.String r12 = "originRect.values[0]"
            gy3.C87412m.m108593f(r3, r12)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.util.LinkedList<java.lang.Integer> r12 = r1.f183015d
            java.lang.Object r12 = r12.get(r10)
            java.lang.String r15 = "originRect.values[1]"
            gy3.C87412m.m108593f(r12, r15)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            java.util.LinkedList<java.lang.Integer> r15 = r1.f183015d
            java.lang.Object r15 = r15.get(r13)
            java.lang.String r13 = "originRect.values[2]"
            gy3.C87412m.m108593f(r15, r13)
            java.lang.Number r15 = (java.lang.Number) r15
            int r13 = r15.intValue()
            java.util.LinkedList<java.lang.Integer> r1 = r1.f183015d
            java.lang.Object r1 = r1.get(r14)
            java.lang.String r15 = "originRect.values[3]"
            gy3.C87412m.m108593f(r1, r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2.<init>(r3, r12, r13, r1)
            long r12 = r4.f186901f
            long r14 = r4.f186900e
            long r12 = r12 - r14
            te3.az r1 = r4.f186904i
            if (r1 == 0) goto L_0x0213
            int r1 = r1.f297901i
            goto L_0x0214
        L_0x0213:
            r1 = 0
        L_0x0214:
            int r3 = r2.height()
            int r3 = r3 * r1
            int r4 = r2.width()
            int r3 = r3 / r4
            float r4 = r0.f185270h
            int r14 = r2.height()
            float r14 = (float) r14
            float r4 = r4 * r14
            int r2 = r2.width()
            float r2 = (float) r2
            float r4 = r4 / r2
            r0.f185271i = r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "3 videoWidth="
            r2.append(r4)
            r2.append(r1)
            r2.append(r7)
            r2.append(r3)
            r2.append(r6)
            float r4 = r0.f185270h
            r2.append(r4)
            r2.append(r5)
            float r4 = r0.f185271i
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            goto L_0x02db
        L_0x025c:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            di3.d r1 = di3.C86312j.m106911c(r1)
            tz.f r1 = (p707tz.C65000f) r1
            te3.az r3 = r4.f186904i
            te3.n93 r3 = r3.f297894A
            te3.ep3 r3 = r3.f184446d
            r1.mo89209x8(r3, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "originRect: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            long r12 = r4.f186901f
            long r14 = r4.f186900e
            long r12 = r12 - r14
            te3.az r1 = r4.f186904i
            if (r1 == 0) goto L_0x0294
            te3.n93 r1 = r1.f297894A
            if (r1 == 0) goto L_0x0294
            int r1 = r1.f184447e
            goto L_0x0295
        L_0x0294:
            r1 = 0
        L_0x0295:
            int r3 = r2.height()
            int r3 = r3 * r1
            int r4 = r2.width()
            int r3 = r3 / r4
            float r4 = r0.f185270h
            int r14 = r2.height()
            float r14 = (float) r14
            float r4 = r4 * r14
            int r2 = r2.width()
            float r2 = (float) r2
            float r4 = r4 / r2
            r0.f185271i = r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "4 videoWidth="
            r2.append(r4)
            r2.append(r1)
            r2.append(r7)
            r2.append(r3)
            r2.append(r6)
            float r4 = r0.f185270h
            r2.append(r4)
            r2.append(r5)
            float r4 = r0.f185271i
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
        L_0x02db:
            r4 = r3
            r2 = r12
            r24 = r4
            r4 = r1
            r1 = r24
            goto L_0x02e5
        L_0x02e3:
            r1 = 0
            r4 = 0
        L_0x02e5:
            gr1.c r5 = new gr1.c
            r5.<init>(r9, r0)
            r9.f161089B = r5
            float r5 = r25.mo79108X7()
            float r6 = (float) r4
            float r5 = r5 / r6
            float r7 = r25.mo79107W7()
            float r12 = (float) r1
            float r7 = r7 / r12
            float r5 = java.lang.Math.max(r5, r7)
            float r6 = r6 * r5
            int r6 = (int) r6
            float r12 = r12 * r5
            int r5 = (int) r12
            r24 = r6
            r6 = r5
            r5 = r24
        L_0x0307:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "videoThumbWidth="
            r7.append(r12)
            r7.append(r5)
            java.lang.String r12 = " videoThumbHeight="
            r7.append(r12)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            long r12 = r2.longValue()
            int r2 = r3.intValue()
            int r1 = r1.intValue()
            int r4 = r4.intValue()
            int r5 = r5.intValue()
            float r3 = (float) r1
            float r6 = (float) r2
            float r3 = r3 / r6
            r6 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0357
            r6 = 1
            goto L_0x0358
        L_0x0357:
            r6 = 0
        L_0x0358:
            if (r6 == 0) goto L_0x035c
            r9.f161097J = r10
        L_0x035c:
            android.view.View r6 = r9.f161117r
            if (r6 == 0) goto L_0x0607
            com.tencent.mm.plugin.finder.ui.u2 r7 = new com.tencent.mm.plugin.finder.ui.u2
            r7.<init>(r9, r3)
            r6.setOnClickListener(r7)
            android.view.View r6 = r9.f161121v
            java.lang.String r14 = "addTitleLayout"
            if (r6 == 0) goto L_0x0600
            com.tencent.mm.plugin.finder.ui.v2 r7 = new com.tencent.mm.plugin.finder.ui.v2
            r7.<init>(r9)
            r6.setOnClickListener(r7)
            com.tencent.mm.ui.widget.cropview.CropLayout r6 = r9.f161114p
            java.lang.String r15 = "cropLayout"
            if (r6 == 0) goto L_0x05fb
            r6.mo154437C()
            com.tencent.mm.ui.widget.cropview.CropLayout r6 = r9.f161114p
            if (r6 == 0) goto L_0x05f6
            r6.setEnableTouch(r10)
            com.tencent.mm.ui.widget.cropview.CropLayout r6 = r9.f161114p
            if (r6 == 0) goto L_0x05f1
            r6.setEnableScale(r11)
            com.tencent.mm.ui.widget.cropview.CropLayout r6 = r9.f161114p
            if (r6 == 0) goto L_0x05ec
            r6.setEnableOverScroll(r11)
            int r6 = r9.f161097J
            r9.mo79111a8(r3, r6)
            com.tencent.mm.ui.widget.cropview.CropLayout$e r21 = com.tencent.p014mm.p136ui.widget.cropview.CropLayout.C97279e.CENTER_CROP
            te3.jr2 r3 = r0.f185281u
            if (r3 == 0) goto L_0x03a2
            te3.bp1 r6 = r3.f183831e
            goto L_0x03a3
        L_0x03a2:
            r6 = 0
        L_0x03a3:
            java.lang.String r23 = "seeker"
            if (r6 == 0) goto L_0x03f3
            if (r3 == 0) goto L_0x03ac
            te3.bp1 r3 = r3.f183831e
            goto L_0x03ad
        L_0x03ac:
            r3 = 0
        L_0x03ad:
            if (r3 == 0) goto L_0x040f
            java.util.LinkedList<java.lang.Float> r6 = r3.f131245d
            int r6 = r6.size()
            r7 = 9
            if (r6 != r7) goto L_0x040f
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            java.util.LinkedList<java.lang.Float> r3 = r3.f131245d
            java.lang.String r7 = "it.value"
            gy3.C87412m.m108593f(r3, r7)
            float[] r3 = sx3.C110818d0.m150950v0(r3)
            r6.setValues(r3)
            com.tencent.mm.ui.widget.cropview.CropLayout r3 = r9.f161114p
            if (r3 == 0) goto L_0x03ee
            gr1.m2 r6 = r9.f161089B
            if (r6 == 0) goto L_0x03e9
            android.view.View r17 = r6.getView()
            android.graphics.Matrix r20 = new android.graphics.Matrix
            r20.<init>()
            com.tencent.mm.plugin.finder.ui.b3 r22 = com.tencent.p014mm.plugin.finder.p056ui.C3774b3.f17247d
            r16 = r3
            r18 = r2
            r19 = r1
            r16.mo154438D(r17, r18, r19, r20, r21, r22)
            goto L_0x040f
        L_0x03e9:
            gy3.C87412m.m108603p(r23)
            r1 = 0
            throw r1
        L_0x03ee:
            r1 = 0
            gy3.C87412m.m108603p(r15)
            throw r1
        L_0x03f3:
            com.tencent.mm.ui.widget.cropview.CropLayout r3 = r9.f161114p
            if (r3 == 0) goto L_0x05e7
            gr1.m2 r6 = r9.f161089B
            if (r6 == 0) goto L_0x05e2
            android.view.View r17 = r6.getView()
            android.graphics.Matrix r20 = new android.graphics.Matrix
            r20.<init>()
            com.tencent.mm.plugin.finder.ui.c3 r22 = com.tencent.p014mm.plugin.finder.p056ui.C3778c3.f17251d
            r16 = r3
            r18 = r2
            r19 = r1
            r16.mo154438D(r17, r18, r19, r20, r21, r22)
        L_0x040f:
            android.widget.SeekBar r1 = r9.f161088A
            java.lang.String r2 = "seekBar"
            if (r1 == 0) goto L_0x05dd
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r12)
            int r3 = r3 * 10
            r1.setMax(r3)
            android.widget.SeekBar r1 = r9.f161088A
            if (r1 == 0) goto L_0x05d8
            r8 = 4
            r1.setVisibility(r8)
            android.widget.SeekBar r1 = r9.f161088A
            if (r1 == 0) goto L_0x05d3
            r1.setEnabled(r11)
            android.graphics.Point r1 = r25.mo79100G6()
            int r1 = r1.x
            androidx.appcompat.app.AppCompatActivity r2 = r25.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131165346(0x7f0700a2, float:1.7944907E38)
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
            int r1 = r1 - r2
            double r2 = (double) r1
            float r6 = r25.mo79108X7()
            double r6 = (double) r6
            double r2 = r2 / r6
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r3 = 2
            if (r2 >= r3) goto L_0x0454
            r2 = 2
        L_0x0454:
            int r3 = r2 + -1
            long r6 = (long) r3
            long r6 = r12 / r6
            my3.j r2 = my3.C61595o.m72301i(r11, r2)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            sx3.l0 r2 = r2.iterator()
        L_0x0466:
            r8 = r2
            my3.i r8 = (my3.C34690i) r8
            boolean r8 = r8.f93287f
            if (r8 == 0) goto L_0x047e
            int r8 = r2.mo59695a()
            long r10 = (long) r8
            long r10 = r10 * r6
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r3.add(r8)
            r10 = 1
            r11 = 0
            goto L_0x0466
        L_0x047e:
            float r2 = r25.mo79107W7()
            int r2 = (int) r2
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r1, r2, r6)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r8)
            zt3.t r10 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.finder.ui.q2 r11 = new com.tencent.mm.plugin.finder.ui.q2
            r1 = r11
            r2 = r25
            r6 = r3
            r3 = r0
            r19 = r14
            r14 = 4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            zt3.j r10 = (zt3.C119157j) r10
            r10.mo183884o(r11)
            android.content.Intent r1 = r25.getIntent()
            r2 = 0
            java.lang.String r4 = "cover_time_ms"
            long r3 = r1.getLongExtra(r4, r2)
            gr1.m2 r8 = r9.f161089B
            if (r8 == 0) goto L_0x05ce
            com.tencent.mm.plugin.finder.ui.f3 r10 = new com.tencent.mm.plugin.finder.ui.f3
            r1 = r10
            r2 = r25
            r5 = r12
            r7 = r0
            r1.<init>(r2, r3, r5, r7)
            com.tencent.mm.plugin.finder.ui.g3 r1 = new com.tencent.mm.plugin.finder.ui.g3
            r1.<init>(r9)
            com.tencent.mm.plugin.finder.ui.i3 r2 = new com.tencent.mm.plugin.finder.ui.i3
            r2.<init>(r0, r9)
            r8.mo84652a(r10, r1, r2)
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r12 = r12 / r0
            int r0 = (int) r12
            r9.f161108V = r0
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            l31.e r1 = (l31.C61212e) r1
            android.view.View r2 = r9.f161121v
            if (r2 == 0) goto L_0x05c9
            java.lang.String r3 = "cover_add_title_button"
            r1.o30(r2, r3)
            di3.d r1 = di3.C86312j.m106911c(r0)
            l31.e r1 = (l31.C61212e) r1
            android.view.View r2 = r9.f161121v
            if (r2 == 0) goto L_0x05c4
            r3 = 40
            r4 = 25496(0x6398, float:3.5728E-41)
            r1.mo86175pO(r2, r3, r4)
            di3.d r1 = di3.C86312j.m106911c(r0)
            l31.e r1 = (l31.C61212e) r1
            android.view.View r2 = r9.f161121v
            if (r2 == 0) goto L_0x05bf
            rx3.l[] r3 = new rx3.C13604l[r14]
            rs1.s8$a r4 = rs1.C13442s8.f38060Q0
            androidx.appcompat.app.AppCompatActivity r5 = r25.getContext()
            java.lang.String r6 = "context"
            gy3.C87412m.m108593f(r5, r6)
            rs1.s8 r5 = r4.mo12873f(r5)
            if (r5 == 0) goto L_0x0512
            java.lang.String r5 = r5.f38099o
            goto L_0x0513
        L_0x0512:
            r5 = 0
        L_0x0513:
            rx3.l r7 = new rx3.l
            java.lang.String r8 = "behaviour_session_id"
            r7.<init>(r8, r5)
            r5 = 0
            r3[r5] = r7
            androidx.appcompat.app.AppCompatActivity r5 = r25.getContext()
            gy3.C87412m.m108593f(r5, r6)
            rs1.s8 r5 = r4.mo12873f(r5)
            if (r5 == 0) goto L_0x052d
            java.lang.String r5 = r5.f38098n
            goto L_0x052e
        L_0x052d:
            r5 = 0
        L_0x052e:
            rx3.l r7 = new rx3.l
            java.lang.String r8 = "finder_context_id"
            r7.<init>(r8, r5)
            r5 = 1
            r3[r5] = r7
            androidx.appcompat.app.AppCompatActivity r5 = r25.getContext()
            gy3.C87412m.m108593f(r5, r6)
            rs1.s8 r5 = r4.mo12873f(r5)
            if (r5 == 0) goto L_0x0548
            java.lang.String r5 = r5.f38100p
            goto L_0x0549
        L_0x0548:
            r5 = 0
        L_0x0549:
            rx3.l r7 = new rx3.l
            java.lang.String r8 = "finder_tab_context_id"
            r7.<init>(r8, r5)
            r5 = 2
            r3[r5] = r7
            androidx.appcompat.app.AppCompatActivity r5 = r25.getContext()
            gy3.C87412m.m108593f(r5, r6)
            rs1.s8 r4 = r4.mo12873f(r5)
            if (r4 == 0) goto L_0x0567
            int r4 = r4.f38096i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0568
        L_0x0567:
            r4 = 0
        L_0x0568:
            rx3.l r5 = new rx3.l
            java.lang.String r6 = "comment_scene"
            r5.<init>(r6, r4)
            r4 = 3
            r3[r4] = r5
            java.util.Map r3 = sx3.C90364q0.m113147f(r3)
            r1.mo86149PM(r2, r3)
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            android.view.View r1 = r9.f161121v
            if (r1 == 0) goto L_0x05ba
            com.tencent.mm.plugin.finder.ui.t2 r2 = new com.tencent.mm.plugin.finder.ui.t2
            r2.<init>(r9)
            r0.E60(r1, r2)
            r0 = 2131313084(0x7f0941bc, float:1.8244555E38)
            android.view.View r0 = r9.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.select_cover_edit_content)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r9.f161105S = r0
            com.tencent.mm.ui.widget.cropview.CropLayout r0 = r9.f161114p
            if (r0 == 0) goto L_0x05b5
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            com.tencent.mm.plugin.finder.ui.s2 r1 = new com.tencent.mm.plugin.finder.ui.s2
            r1.<init>(r9)
            r0.addOnGlobalLayoutListener(r1)
            com.tencent.mm.ui.tools.KeyboardHeightProvider r0 = new com.tencent.mm.ui.tools.KeyboardHeightProvider
            r0.<init>(r9)
            r9.f161107U = r0
            r0.f220015b = r9
            return
        L_0x05b5:
            gy3.C87412m.m108603p(r15)
            r1 = 0
            throw r1
        L_0x05ba:
            r1 = 0
            gy3.C87412m.m108603p(r19)
            throw r1
        L_0x05bf:
            r1 = 0
            gy3.C87412m.m108603p(r19)
            throw r1
        L_0x05c4:
            r1 = 0
            gy3.C87412m.m108603p(r19)
            throw r1
        L_0x05c9:
            r1 = 0
            gy3.C87412m.m108603p(r19)
            throw r1
        L_0x05ce:
            r1 = 0
            gy3.C87412m.m108603p(r23)
            throw r1
        L_0x05d3:
            r1 = 0
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x05d8:
            r1 = 0
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x05dd:
            r1 = 0
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x05e2:
            r1 = 0
            gy3.C87412m.m108603p(r23)
            throw r1
        L_0x05e7:
            r1 = 0
            gy3.C87412m.m108603p(r15)
            throw r1
        L_0x05ec:
            r1 = 0
            gy3.C87412m.m108603p(r15)
            throw r1
        L_0x05f1:
            r1 = 0
            gy3.C87412m.m108603p(r15)
            throw r1
        L_0x05f6:
            r1 = 0
            gy3.C87412m.m108603p(r15)
            throw r1
        L_0x05fb:
            r1 = 0
            gy3.C87412m.m108603p(r15)
            throw r1
        L_0x0600:
            r19 = r14
            r1 = 0
            gy3.C87412m.m108603p(r19)
            throw r1
        L_0x0607:
            r1 = 0
            java.lang.String r0 = "cropWayLayout"
            gy3.C87412m.m108603p(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderSelectCoverUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C59664m2 m2Var = this.f161089B;
        if (m2Var != null) {
            m2Var.destroy();
            C36777d dVar = this.f161092E;
            if (dVar != null) {
                dVar.destroy();
            }
            mo79110Z7();
            return;
        }
        C87412m.m108603p("seeker");
        throw null;
    }

    public void onPause() {
        super.onPause();
        View view = this.f161121v;
        if (view != null) {
            view.post(new C56357f(this));
        } else {
            C87412m.m108603p("addTitleLayout");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        View view = this.f161121v;
        if (view != null) {
            view.post(new C56358g(this));
        } else {
            C87412m.m108603p("addTitleLayout");
            throw null;
        }
    }
}
