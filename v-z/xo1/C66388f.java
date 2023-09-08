package xo1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import bp1.C39828h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32226l;
import gh1.C8313a;
import gy3.C87412m;
import gy3.C87413o;
import j03.C60698b;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import p501dz.C58464f;
import qj1.C12322e5;
import rx3.C13598b0;
import zo1.C66939o0;

/* renamed from: xo1.f */
public final class C66388f extends C8313a {

    /* renamed from: j */
    public final String f191113j = "ReplayThumbController";

    /* renamed from: n */
    public View f191114n;

    /* renamed from: o */
    public ImageView f191115o;

    /* renamed from: p */
    public ViewGroup f191116p;

    /* renamed from: q */
    public TextView f191117q;

    /* renamed from: r */
    public TextureView f191118r;

    /* renamed from: s */
    public C60698b f191119s;

    /* renamed from: t */
    public boolean f191120t;

    /* renamed from: xo1.f$a */
    public static final class C66389a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66388f f191121d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66389a(C66388f fVar) {
            super(1);
            this.f191121d = fVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            C66388f fVar = this.f191121d;
            C60698b bVar = fVar.f191119s;
            if (bVar != null) {
                bVar.setDataSource(str);
                bVar.prepareAsync();
                bVar.setOnPreparedListener(new C66386d(fVar));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xo1.f$b */
    public static final class C66390b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C66388f f191122d;

        public C66390b(C66388f fVar) {
            this.f191122d = fVar;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C87412m.m108594g(seekBar, "seekBar");
            C66388f.m78295o3(this.f191122d, seekBar);
            C66388f fVar = this.f191122d;
            fVar.mo90488J3(C66388f.m78293m3(fVar, seekBar), C66388f.m78294n3(this.f191122d, seekBar));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C87412m.m108594g(seekBar, "seekBar");
            C66388f fVar = this.f191122d;
            float m3 = C66388f.m78293m3(fVar, seekBar);
            float n3 = C66388f.m78294n3(this.f191122d, seekBar);
            fVar.mo90487I3(false);
            fVar.mo90488J3(m3, n3);
            C66388f.m78295o3(this.f191122d, seekBar);
            C66388f fVar2 = this.f191122d;
            fVar2.mo90488J3(C66388f.m78293m3(fVar2, seekBar), C66388f.m78294n3(this.f191122d, seekBar));
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C87412m.m108594g(seekBar, "seekBar");
            ImageView imageView = this.f191122d.f191115o;
            if (imageView != null) {
                imageView.setImageDrawable((Drawable) null);
            }
            this.f191122d.mo90485F3();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66388f(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: m3 */
    public static final float m78293m3(C66388f fVar, SeekBar seekBar) {
        fVar.getClass();
        ViewGroup viewGroup = fVar.f191116p;
        C87412m.m108591d(viewGroup);
        return (((float) (C61926c.m72690o(seekBar)[0] + seekBar.getThumb().getBounds().left)) + (((float) seekBar.getThumb().getIntrinsicWidth()) / 2.0f)) - (((float) viewGroup.getMeasuredWidth()) / 2.0f);
    }

    /* renamed from: n3 */
    public static final float m78294n3(C66388f fVar, SeekBar seekBar) {
        fVar.getClass();
        int i = C61926c.m72690o(seekBar)[1];
        View view = fVar.f191114n;
        C87412m.m108591d(view);
        return ((float) (i - view.getMeasuredHeight())) - MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3749d0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: te3.or3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: te3.or3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: te3.or3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: te3.or3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: te3.tt3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: te3.or3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m78295o3(xo1.C66388f r21, android.widget.SeekBar r22) {
        /*
            r0 = r21
            java.lang.Class<bp1.h> r1 = bp1.C39828h.class
            java.lang.Class<bp1.d> r2 = bp1.C54519d.class
            androidx.lifecycle.i0 r2 = r0.business(r2)
            bp1.d r2 = (bp1.C54519d) r2
            int r2 = r2.mo75375i3()
            int r3 = r22.getProgress()
            float r3 = (float) r3
            int r4 = r22.getMax()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = iy3.C60641c.m70921b(r3)
            android.widget.TextView r3 = r0.f191117q
            r12 = 0
            if (r3 != 0) goto L_0x0028
            goto L_0x002b
        L_0x0028:
            r3.setVisibility(r12)
        L_0x002b:
            android.widget.TextView r3 = r0.f191117q
            if (r3 != 0) goto L_0x0030
            goto L_0x0056
        L_0x0030:
            r4 = 3600(0xe10, float:5.045E-42)
            if (r2 < r4) goto L_0x0044
            y50.n0$a r4 = y50.C15936n0.f42815a
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 24
            r11 = 0
            java.lang.String r6 = ":"
            r5 = r2
            java.lang.String r4 = y50.C15936n0.C15937a.m14866a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0053
        L_0x0044:
            y50.n0$a r4 = y50.C15936n0.f42815a
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 24
            r11 = 0
            java.lang.String r6 = ":"
            r5 = r2
            java.lang.String r4 = y50.C15936n0.C15937a.m14866a(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0053:
            r3.setText(r4)
        L_0x0056:
            boolean r3 = r0.f191120t
            r4 = 0
            if (r3 == 0) goto L_0x01b2
            j03.b r3 = r0.f191119s
            r5 = 4
            r6 = 1
            if (r3 == 0) goto L_0x0069
            int r3 = r3.getCurrentState()
            if (r3 != r5) goto L_0x0069
            r3 = 1
            goto L_0x006a
        L_0x0069:
            r3 = 0
        L_0x006a:
            if (r3 == 0) goto L_0x01b2
            j03.b r3 = r0.f191119s
            if (r3 == 0) goto L_0x0075
            long r7 = r3.getPlayerBufferedDurationMs()
            goto L_0x0077
        L_0x0075:
            r7 = 0
        L_0x0077:
            int r3 = r2 * 1000
            long r9 = (long) r3
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x01b2
            j03.b r7 = r0.f191119s
            if (r7 == 0) goto L_0x0278
            android.widget.ImageView r8 = r0.f191115o
            if (r8 != 0) goto L_0x0087
            goto L_0x008a
        L_0x0087:
            r8.setVisibility(r5)
        L_0x008a:
            android.view.TextureView r8 = r0.f191118r
            boolean r9 = r8 instanceof android.view.View
            if (r9 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r8 = r4
        L_0x0092:
            if (r8 != 0) goto L_0x0095
            goto L_0x00d7
        L_0x0095:
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r9.mo10233c(r10)
            java.lang.Object[] r14 = r9.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController"
            java.lang.String r16 = "updateThumbContent"
            java.lang.String r17 = "(Landroid/widget/SeekBar;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r8
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r9 = r9.mo10231a(r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r8.setVisibility(r9)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController"
            java.lang.String r15 = "updateThumbContent"
            java.lang.String r16 = "(Landroid/widget/SeekBar;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x00d7:
            r7.seekTo(r3)
            androidx.lifecycle.i0 r1 = r0.business(r1)
            bp1.h r1 = (bp1.C39828h) r1
            java.util.LinkedList<te3.tt3> r1 = r1.f106848h
            int r3 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r3)
        L_0x00ea:
            boolean r3 = r1.hasPrevious()
            if (r3 == 0) goto L_0x0101
            java.lang.Object r3 = r1.previous()
            r7 = r3
            te3.tt3 r7 = (te3.C51445tt3) r7
            int r7 = r7.f142406e
            if (r7 > r2) goto L_0x00fd
            r7 = 1
            goto L_0x00fe
        L_0x00fd:
            r7 = 0
        L_0x00fe:
            if (r7 == 0) goto L_0x00ea
            r4 = r3
        L_0x0101:
            te3.tt3 r4 = (te3.C51445tt3) r4
            if (r4 == 0) goto L_0x0111
            int r1 = r4.f142407f
            int r2 = r4.f142405d
            if (r1 <= r2) goto L_0x010d
            r1 = 1
            goto L_0x010e
        L_0x010d:
            r1 = 0
        L_0x010e:
            r0.mo90486G3(r1)
        L_0x0111:
            android.view.ViewGroup r1 = r0.f191116p
            if (r1 == 0) goto L_0x011d
            boolean r1 = r1.isShown()
            if (r1 != r6) goto L_0x011d
            r1 = 1
            goto L_0x011e
        L_0x011d:
            r1 = 0
        L_0x011e:
            if (r1 == 0) goto L_0x0278
            j03.b r1 = r0.f191119s
            if (r1 == 0) goto L_0x012b
            int r1 = r1.getCurrentState()
            if (r1 != r5) goto L_0x012b
            r12 = 1
        L_0x012b:
            if (r12 != 0) goto L_0x012f
            goto L_0x0278
        L_0x012f:
            android.view.ViewGroup r1 = r0.f191116p
            gy3.C87412m.m108591d(r1)
            int r1 = r1.getWidth()
            float r1 = (float) r1
            android.view.ViewGroup r2 = r0.f191116p
            gy3.C87412m.m108591d(r2)
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            j03.b r2 = r0.f191119s
            gy3.C87412m.m108591d(r2)
            int r2 = r2.getVideoWidth()
            float r2 = (float) r2
            j03.b r3 = r0.f191119s
            gy3.C87412m.m108591d(r3)
            int r3 = r3.getVideoHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0189
            android.view.TextureView r1 = r0.f191118r
            if (r1 != 0) goto L_0x0164
            goto L_0x017e
        L_0x0164:
            android.view.ViewGroup r4 = r0.f191116p
            gy3.C87412m.m108591d(r4)
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r2
            android.view.ViewGroup r2 = r0.f191116p
            gy3.C87412m.m108591d(r2)
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r4 = r4 / r2
            r1.setScaleX(r4)
        L_0x017e:
            android.view.TextureView r0 = r0.f191118r
            if (r0 != 0) goto L_0x0184
            goto L_0x0278
        L_0x0184:
            r0.setScaleY(r3)
            goto L_0x0278
        L_0x0189:
            android.view.TextureView r1 = r0.f191118r
            if (r1 != 0) goto L_0x018e
            goto L_0x0191
        L_0x018e:
            r1.setScaleX(r3)
        L_0x0191:
            android.view.TextureView r1 = r0.f191118r
            if (r1 != 0) goto L_0x0197
            goto L_0x0278
        L_0x0197:
            android.view.ViewGroup r3 = r0.f191116p
            gy3.C87412m.m108591d(r3)
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r2
            android.view.ViewGroup r0 = r0.f191116p
            gy3.C87412m.m108591d(r0)
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r3 = r3 / r0
            r1.setScaleY(r3)
            goto L_0x0278
        L_0x01b2:
            android.view.TextureView r3 = r0.f191118r
            r5 = 8
            if (r3 != 0) goto L_0x01b9
            goto L_0x01bc
        L_0x01b9:
            r3.setVisibility(r5)
        L_0x01bc:
            androidx.lifecycle.i0 r1 = r0.business(r1)
            bp1.h r1 = (bp1.C39828h) r1
            java.util.concurrent.CopyOnWriteArrayList<te3.or3> r3 = r1.f106847g
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01cb
            goto L_0x022f
        L_0x01cb:
            java.util.concurrent.CopyOnWriteArrayList<te3.or3> r3 = r1.f106847g
            java.lang.Object r3 = sx3.C110818d0.m150923U(r3)
            te3.or3 r3 = (te3.C50721or3) r3
            if (r3 == 0) goto L_0x01d8
            int r3 = r3.f139337d
            goto L_0x01d9
        L_0x01d8:
            r3 = 0
        L_0x01d9:
            if (r2 <= r3) goto L_0x01e4
            boolean r3 = r1.f106851n
            if (r3 == 0) goto L_0x01e4
            r1.mo62459c3(r4)
            r1.f106851n = r12
        L_0x01e4:
            r3 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.CopyOnWriteArrayList<te3.or3> r6 = r1.f106847g
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
            r8 = 0
        L_0x01ef:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x0210
            java.lang.Object r9 = r6.next()
            int r10 = r8 + 1
            if (r8 < 0) goto L_0x020c
            te3.or3 r9 = (te3.C50721or3) r9
            int r9 = r9.f139337d
            int r9 = r9 - r2
            int r9 = java.lang.Math.abs(r9)
            if (r9 >= r3) goto L_0x020a
            r7 = r8
            r3 = r9
        L_0x020a:
            r8 = r10
            goto L_0x01ef
        L_0x020c:
            sx3.C64197v.m75542k()
            throw r4
        L_0x0210:
            java.lang.String r2 = r1.f106846f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "load thumb index "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)
            java.util.concurrent.CopyOnWriteArrayList<te3.or3> r1 = r1.f106847g
            java.lang.Object r1 = r1.get(r7)
            r4 = r1
            te3.or3 r4 = (te3.C50721or3) r4
        L_0x022f:
            if (r4 != 0) goto L_0x0242
            android.widget.ImageView r1 = r0.f191115o
            if (r1 != 0) goto L_0x0236
            goto L_0x0239
        L_0x0236:
            r1.setVisibility(r5)
        L_0x0239:
            android.widget.TextView r0 = r0.f191117q
            if (r0 != 0) goto L_0x023e
            goto L_0x0278
        L_0x023e:
            r0.setVisibility(r5)
            goto L_0x0278
        L_0x0242:
            android.widget.ImageView r1 = r0.f191115o
            if (r1 != 0) goto L_0x0247
            goto L_0x024a
        L_0x0247:
            r1.setVisibility(r12)
        L_0x024a:
            bl3.r r1 = bl3.C39818r.f106831a
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            bl3.r$a r1 = r1.mo62446e(r2)
            java.lang.Class<pl1.s0> r2 = pl1.C11990s0.class
            bl3.c r1 = r1.mo62447c(r2)
            pl1.s0 r1 = (pl1.C11990s0) r1
            k60.d r1 = r1.mo11871f2()
            pl1.n0 r2 = new pl1.n0
            java.lang.String r3 = r4.f139338e
            up1.y r4 = up1.C27696y.THUMB_IMAGE
            r2.<init>(r3, r4)
            l60.b r1 = r1.mo85955a(r2)
            xo1.h r2 = new xo1.h
            r2.<init>(r0)
            r1.getClass()
            r1.f291320d = r2
            r1.mo85951a()
        L_0x0278:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xo1.C66388f.m78295o3(xo1.f, android.widget.SeekBar):void");
    }

    /* renamed from: F3 */
    public final void mo90485F3() {
        View view = this.f191114n;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "hideThumb", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "hideThumb", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C12322e5 e5Var = (C12322e5) mo9307d3(C12322e5.class);
        if (e5Var != null) {
            e5Var.mo10792g(0);
        }
    }

    /* renamed from: G3 */
    public final void mo90486G3(boolean z) {
        Context context = MMApplicationContext.getContext();
        ViewGroup viewGroup = this.f191116p;
        ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams != null) {
            if (z != (layoutParams.width > layoutParams.height)) {
                if (z) {
                    layoutParams.width = (int) context.getResources().getDimension(C0966R.dimen.f3721of);
                    layoutParams.height = (int) context.getResources().getDimension(C0966R.dimen.f3713c6);
                } else {
                    layoutParams.width = (int) context.getResources().getDimension(C0966R.dimen.f3713c6);
                    layoutParams.height = (int) context.getResources().getDimension(C0966R.dimen.f3721of);
                }
                ViewGroup viewGroup2 = this.f191116p;
                if (viewGroup2 != null) {
                    viewGroup2.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: I3 */
    public final void mo90487I3(boolean z) {
        this.f191120t = z;
        View view = this.f191114n;
        if (view != null) {
            view.measure(0, 0);
        }
        View view2 = this.f191114n;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "showThumb", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "showThumb", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C12322e5 e5Var = (C12322e5) mo9307d3(C12322e5.class);
        if (e5Var != null) {
            e5Var.mo10792g(8);
        }
    }

    /* renamed from: J3 */
    public final void mo90488J3(float f, float f2) {
        View view = this.f191114n;
        if (view != null) {
            view.setX(f);
        }
        View view2 = this.f191114n;
        if (view2 != null) {
            view2.setY(f2);
        }
    }

    public void onLiveActivate() {
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        this.f191119s = ((C58464f) C86312j.m106911c(C58464f.class)).mo82800a(context);
        ((C39828h) business(C39828h.class)).mo62459c3(new C66389a(this));
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        C60698b bVar = this.f191119s;
        if (bVar != null) {
            bVar.release();
        }
        this.f191119s = null;
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        super.onViewMount(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.o_c);
        C87412m.m108593f(viewGroup2, "rootView");
        viewGroup2.getVisibility();
        this.f191114n = viewGroup2.findViewById(C0966R.C0970id.kk9);
        this.f191115o = (ImageView) viewGroup2.findViewById(C0966R.C0970id.o_7);
        this.f191116p = (ViewGroup) viewGroup2.findViewById(C0966R.C0970id.f359374ob1);
        this.f191117q = (TextView) viewGroup2.findViewById(C0966R.C0970id.i86);
        TextureView textureView = (TextureView) viewGroup2.findViewById(C0966R.C0970id.f359375ob2);
        this.f191118r = textureView;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(new C66387e(this));
        }
        C66939o0 o0Var = (C66939o0) mo9307d3(C66939o0.class);
        if (o0Var != null) {
            C66390b bVar = new C66390b(this);
            FinderLiveReplaySeekbar finderLiveReplaySeekbar = o0Var.f192323r;
            finderLiveReplaySeekbar.getClass();
            ((ArrayList) finderLiveReplaySeekbar.f160810p).add(bVar);
        }
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
        View view = this.f191114n;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "onViewUnmount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "onViewUnmount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ImageView imageView = this.f191115o;
        if (imageView != null) {
            imageView.setImageBitmap((Bitmap) null);
        }
        this.f191114n = null;
        this.f191115o = null;
        this.f191116p = null;
        this.f191117q = null;
        this.f191120t = false;
        this.f191118r = null;
    }
}
