package com.tencent.p014mm.plugin.finder.live.view;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import ak1.C0073g0;
import ak1.C54108o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b50.C54423i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.seekbar.BothSidesSeekBar;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import er1.C7919x;
import f14.C58901s;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import l31.C61212e;
import nj3.C76879j;
import o40.C61926c;
import ok1.C62042e;
import p849e3.C58521d;
import qj1.C62777fg;
import qj1.C62889n0;
import qo3.C47883u;
import qo3.C77426q;
import rx3.C13598b0;
import rx3.C13603j;
import sn0.C90259e;
import sx3.C110818d0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zp3.C23564m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0005\u0011\u001a\")HB'\b\u0007\u0012\u0006\u0010B\u001a\u00020A\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C\u0012\b\b\u0002\u0010E\u001a\u00020\u0002¢\u0006\u0004\bF\u0010GJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R0\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R6\u00104\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010-8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R6\u00108\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010-8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u0010/\u001a\u0004\b6\u00101\"\u0004\b7\u00103R*\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010\u001b\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR*\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001b\u001a\u0004\b>\u0010\u001d\"\u0004\b?\u0010\u001f¨\u0006I"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2;", "Landroid/widget/RelativeLayout;", "", "progress", "Lrx3/b0;", "setAndMoveSeekValueText", "setAndMoveDefaultValueIcon", "Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$k;", "value", "f", "Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$k;", "getSelectedEffect", "()Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$k;", "setSelectedEffect", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$k;)V", "selectedEffect", "", "g", "Ljava/util/List;", "getEffectItems", "()Ljava/util/List;", "setEffectItems", "(Ljava/util/List;)V", "effectItems", "Lkotlin/Function0;", "", "h", "Lfy3/a;", "getOnRequestCheckIsDefault", "()Lfy3/a;", "setOnRequestCheckIsDefault", "(Lfy3/a;)V", "onRequestCheckIsDefault", "Lkotlin/Function1;", "i", "Lfy3/l;", "getOnRequestSeekByKey", "()Lfy3/l;", "setOnRequestSeekByKey", "(Lfy3/l;)V", "onRequestSeekByKey", "j", "getOnRequestDefaultSeekByKey", "setOnRequestDefaultSeekByKey", "onRequestDefaultSeekByKey", "Lkotlin/Function2;", "n", "Lfy3/p;", "getOnSeekChanging", "()Lfy3/p;", "setOnSeekChanging", "(Lfy3/p;)V", "onSeekChanging", "o", "getOnSeekDone", "setOnSeekDone", "onSeekDone", "p", "getOnRequestReset", "setOnRequestReset", "onRequestReset", "q", "getOnBackClick", "setOnBackClick", "onBackClick", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "k", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 */
public final class FinderLiveCameraOptBeautyPowerfulDetailsViewV2 extends RelativeLayout {

    /* renamed from: A */
    public final ImageView f159587A;

    /* renamed from: B */
    public TextView f159588B;

    /* renamed from: C */
    public final Object f159589C;

    /* renamed from: D */
    public final int f159590D;

    /* renamed from: d */
    public final C55986g f159591d;

    /* renamed from: e */
    public Animator f159592e;

    /* renamed from: f */
    public C55990k f159593f;

    /* renamed from: g */
    public List<C55990k> f159594g;

    /* renamed from: h */
    public C32224a<Boolean> f159595h;

    /* renamed from: i */
    public C32226l<? super Integer, Integer> f159596i;

    /* renamed from: j */
    public C32226l<? super Integer, Integer> f159597j;

    /* renamed from: n */
    public C32227p<? super Integer, ? super Integer, C13598b0> f159598n;

    /* renamed from: o */
    public C32227p<? super Integer, ? super Integer, C13598b0> f159599o;

    /* renamed from: p */
    public C32224a<C13598b0> f159600p;

    /* renamed from: q */
    public C32224a<C13598b0> f159601q;

    /* renamed from: r */
    public View f159602r;

    /* renamed from: s */
    public View f159603s;

    /* renamed from: t */
    public View f159604t;

    /* renamed from: u */
    public BothSidesSeekBar f159605u;

    /* renamed from: v */
    public RecyclerView f159606v;

    /* renamed from: w */
    public C55987h f159607w;

    /* renamed from: x */
    public RecyclerView f159608x;

    /* renamed from: y */
    public final C58521d f159609y;

    /* renamed from: z */
    public C53973z1 f159610z;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$a */
    public static final class C55977a extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ LinearLayoutManager f159611d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2 f159612e;

        public C55977a(LinearLayoutManager linearLayoutManager, FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2) {
            this.f159611d = linearLayoutManager;
            this.f159612e = finderLiveCameraOptBeautyPowerfulDetailsViewV2;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            if (i == 0 || i == 1) {
                C54423i iVar = this.f159612e.getEffectItems().get(this.f159611d.mo16957C()).f159641d;
                C55987h hVar = this.f159612e.f159607w;
                if (iVar != hVar.f159627d) {
                    C87412m.m108594g(iVar, "type");
                    hVar.f159627d = iVar;
                    hVar.notifyDataSetChanged();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$b */
    public static final class C55978b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2 f159613d;

        public C55978b(FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2) {
            this.f159613d = finderLiveCameraOptBeautyPowerfulDetailsViewV2;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            RecyclerView.C16631z I0;
            int i2 = i;
            FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2 = this.f159613d;
            C55990k selectedEffect = finderLiveCameraOptBeautyPowerfulDetailsViewV2.getSelectedEffect();
            int h = finderLiveCameraOptBeautyPowerfulDetailsViewV2.mo77810h(i2, selectedEffect != null ? selectedEffect.f159640c : false, seekBar != null ? seekBar.getMax() : 0);
            C55990k selectedEffect2 = this.f159613d.getSelectedEffect();
            if (selectedEffect2 != null) {
                FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV22 = this.f159613d;
                C32227p<Integer, Integer, C13598b0> onSeekChanging = finderLiveCameraOptBeautyPowerfulDetailsViewV22.getOnSeekChanging();
                View view = null;
                if (onSeekChanging != null) {
                    if (!z) {
                        onSeekChanging = null;
                    }
                    if (onSeekChanging != null) {
                        onSeekChanging.invoke(Integer.valueOf(selectedEffect2.f159638a), Integer.valueOf(h));
                    }
                }
                boolean e = finderLiveCameraOptBeautyPowerfulDetailsViewV22.mo77798e(selectedEffect2, Integer.valueOf(h));
                if (e) {
                    Object obj = finderLiveCameraOptBeautyPowerfulDetailsViewV22.f159589C;
                    if (obj instanceof Vibrator) {
                        ((Vibrator) obj).vibrate(10);
                    }
                }
                Integer valueOf = Integer.valueOf(finderLiveCameraOptBeautyPowerfulDetailsViewV22.getEffectItems().indexOf(selectedEffect2));
                if (!(valueOf.intValue() != -1)) {
                    valueOf = null;
                }
                if (!(valueOf == null || (I0 = finderLiveCameraOptBeautyPowerfulDetailsViewV22.f159608x.mo17023I0(valueOf.intValue())) == null)) {
                    C55989j jVar = I0 instanceof C55989j ? (C55989j) I0 : null;
                    if (jVar != null) {
                        view = jVar.f159636D;
                    }
                    if (view != null) {
                        int i3 = !e ? 0 : 8;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(i3));
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$3", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$3", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            this.f159613d.setAndMoveSeekValueText(i2);
            if (!z) {
                this.f159613d.mo77800g();
            }
        }

        /* JADX WARNING: type inference failed for: r9v19, types: [android.view.ViewGroup$LayoutParams] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onStartTrackingTouch(android.widget.SeekBar r9) {
            /*
                r8 = this;
                java.lang.String r9 = "Finder.FinderLiveCameraOptBeautyPowerfulDetailsView"
                java.lang.String r0 = "#onStartTrackingTouch"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r9 = r8.f159613d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r9.f159605u
                android.content.Context r9 = r9.getContext()
                r1 = 12
                int r9 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r9, r1)
                r0.mo154682a(r9)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r9 = r8.f159613d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r9 = r9.f159605u
                r9.invalidate()
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r9 = r8.f159613d
                a14.z1 r9 = r9.f159610z
                r0 = 1
                r2 = 0
                if (r9 == 0) goto L_0x002a
                a14.C53973z1.C53974a.m60623a(r9, r2, r0, r2)
            L_0x002a:
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r9 = r8.f159613d
                android.widget.TextView r9 = r9.f159588B
                r3 = 0
                r9.setVisibility(r3)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r9 = r8.f159613d
                android.widget.TextView r9 = r9.f159588B
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                boolean r4 = r9 instanceof android.widget.RelativeLayout.LayoutParams
                if (r4 == 0) goto L_0x0041
                android.widget.RelativeLayout$LayoutParams r9 = (android.widget.RelativeLayout.LayoutParams) r9
                goto L_0x0042
            L_0x0041:
                r9 = r2
            L_0x0042:
                if (r9 == 0) goto L_0x0054
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r4 = r8.f159613d
                int r5 = r9.leftMargin
                int r6 = r9.topMargin
                int r7 = r9.rightMargin
                r9.setMargins(r5, r6, r7, r3)
                android.widget.TextView r3 = r4.f159588B
                r3.setLayoutParams(r9)
            L_0x0054:
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r9 = r8.f159613d
                android.widget.TextView r9 = r9.f159588B
                r3 = 1101004800(0x41a00000, float:20.0)
                r9.setTextSize(r0, r3)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r9 = r8.f159613d
                android.widget.ImageView r9 = r9.f159587A
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                boolean r0 = r9 instanceof android.widget.RelativeLayout.LayoutParams
                if (r0 == 0) goto L_0x006c
                r2 = r9
                android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            L_0x006c:
                if (r2 == 0) goto L_0x007f
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r9 = r8.f159613d
                android.content.Context r0 = r9.getContext()
                int r0 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r0, r1)
                r2.width = r0
                android.widget.ImageView r9 = r9.f159587A
                r9.setLayoutParams(r2)
            L_0x007f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55978b.onStartTrackingTouch(android.widget.SeekBar):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: boolean} */
        /* JADX WARNING: type inference failed for: r8v15, types: [android.view.ViewGroup$LayoutParams] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onStopTrackingTouch(android.widget.SeekBar r8) {
            /*
                r7 = this;
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r8 = r7.f159613d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r8.f159605u
                android.content.Context r8 = r8.getContext()
                r1 = 4
                int r8 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r8, r1)
                r0.mo154682a(r8)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r8 = r7.f159613d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r8 = r8.f159605u
                r8.invalidate()
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r8 = r7.f159613d
                android.widget.TextView r8 = r8.f159588B
                android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
                boolean r0 = r8 instanceof android.widget.RelativeLayout.LayoutParams
                r1 = 0
                if (r0 == 0) goto L_0x0027
                android.widget.RelativeLayout$LayoutParams r8 = (android.widget.RelativeLayout.LayoutParams) r8
                goto L_0x0028
            L_0x0027:
                r8 = r1
            L_0x0028:
                if (r8 == 0) goto L_0x0045
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r0 = r7.f159613d
                int r2 = r8.leftMargin
                int r3 = r8.topMargin
                int r4 = r8.rightMargin
                android.content.Context r5 = r0.getContext()
                r6 = 20
                int r5 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r5, r6)
                int r5 = -r5
                r8.setMargins(r2, r3, r4, r5)
                android.widget.TextView r0 = r0.f159588B
                r0.setLayoutParams(r8)
            L_0x0045:
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r8 = r7.f159613d
                android.widget.TextView r8 = r8.f159588B
                r0 = 1
                r2 = 1097859072(0x41700000, float:15.0)
                r8.setTextSize(r0, r2)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r8 = r7.f159613d
                r8.mo77799f()
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r8 = r7.f159613d
                android.widget.ImageView r8 = r8.f159587A
                android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
                boolean r0 = r8 instanceof android.widget.RelativeLayout.LayoutParams
                if (r0 == 0) goto L_0x0063
                r1 = r8
                android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            L_0x0063:
                if (r1 == 0) goto L_0x0078
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r8 = r7.f159613d
                android.content.Context r0 = r8.getContext()
                r2 = 8
                int r0 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r0, r2)
                r1.width = r0
                android.widget.ImageView r8 = r8.f159587A
                r8.setLayoutParams(r1)
            L_0x0078:
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r8 = r7.f159613d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r8.f159605u
                r1 = 0
                if (r0 == 0) goto L_0x0093
                int r2 = r0.getProgress()
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$k r3 = r8.getSelectedEffect()
                if (r3 == 0) goto L_0x008b
                boolean r1 = r3.f159640c
            L_0x008b:
                int r0 = r0.getMax()
                int r1 = r8.mo77810h(r2, r1, r0)
            L_0x0093:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "#onStopTrackingTouch progress="
                r8.append(r0)
                r8.append(r1)
                java.lang.String r8 = r8.toString()
                java.lang.String r0 = "Finder.FinderLiveCameraOptBeautyPowerfulDetailsView"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r8 = r7.f159613d
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$k r8 = r8.getSelectedEffect()
                if (r8 == 0) goto L_0x00c6
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r0 = r7.f159613d
                fy3.p r0 = r0.getOnSeekDone()
                if (r0 == 0) goto L_0x00c6
                int r8 = r8.f159638a
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.invoke(r8, r1)
            L_0x00c6:
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r8 = r7.f159613d
                r8.mo77800g()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55978b.onStopTrackingTouch(android.widget.SeekBar):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$c */
    public static final class C55979c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2 f159614d;

        /* renamed from: e */
        public final /* synthetic */ Context f159615e;

        /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$c$a */
        public static final class C55980a implements C47883u {

            /* renamed from: a */
            public static final C55980a f159616a = new C55980a();

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$c$b */
        public static final class C55981b implements C47883u {

            /* renamed from: a */
            public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2 f159617a;

            /* renamed from: b */
            public final /* synthetic */ Context f159618b;

            public C55981b(FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2, Context context) {
                this.f159617a = finderLiveCameraOptBeautyPowerfulDetailsViewV2;
                this.f159618b = context;
            }

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
                C32224a<C13598b0> onRequestReset = this.f159617a.getOnRequestReset();
                if (onRequestReset != null) {
                    onRequestReset.invoke();
                }
                Context context = this.f159618b;
                C76879j.m92727U(context, context.getString(C0966R.string.dvs), 0);
            }
        }

        public C55979c(FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2, Context context) {
            this.f159614d = finderLiveCameraOptBeautyPowerfulDetailsViewV2;
            this.f159615e = context;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<Boolean> onRequestCheckIsDefault = this.f159614d.getOnRequestCheckIsDefault();
            boolean z = false;
            if (onRequestCheckIsDefault != null && onRequestCheckIsDefault.invoke().booleanValue()) {
                z = true;
            }
            if (z) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C77426q qVar = new C77426q(this.f159615e);
            qVar.mo107598j(this.f159615e.getString(C0966R.string.dvp));
            qVar.mo107602n(this.f159615e.getString(C0966R.string.dvt));
            qVar.mo107595g(this.f159615e.getString(C0966R.string.f360624n20));
            qVar.mo107591c(C55980a.f159616a, new C55981b(this.f159614d, this.f159615e));
            qVar.mo107604p(true);
            qVar.mo107603o();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$d */
    public static final class C55982d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2 f159619d;

        public C55982d(FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2) {
            this.f159619d = finderLiveCameraOptBeautyPowerfulDetailsViewV2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> onBackClick = this.f159619d.getOnBackClick();
            if (onBackClick != null) {
                onBackClick.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$e */
    public static final class C55983e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2 f159620d;

        /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$e$a */
        public static final class C55984a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2 f159621d;

            public C55984a(FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2) {
                this.f159621d = finderLiveCameraOptBeautyPowerfulDetailsViewV2;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x001b, code lost:
                r0 = r0.f44854d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r4 = this;
                    com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r0 = r4.f159621d
                    java.util.List r0 = r0.getEffectItems()
                    com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r1 = r4.f159621d
                    com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$k r1 = r1.getSelectedEffect()
                    int r0 = sx3.C110818d0.m150918P(r0, r1)
                    com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r1 = r4.f159621d
                    androidx.recyclerview.widget.RecyclerView r1 = r1.f159608x
                    androidx.recyclerview.widget.RecyclerView$z r0 = r1.mo17023I0(r0)
                    r1 = 0
                    if (r0 == 0) goto L_0x0026
                    android.view.View r0 = r0.f44854d
                    if (r0 == 0) goto L_0x0026
                    int[] r0 = o40.C61926c.m72690o(r0)
                    r0 = r0[r1]
                    goto L_0x0027
                L_0x0026:
                    r0 = 0
                L_0x0027:
                    com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r2 = r4.f159621d
                    androidx.recyclerview.widget.RecyclerView r3 = r2.f159608x
                    int r2 = r2.f159590D
                    int r0 = r0 - r2
                    r3.smoothScrollBy(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55983e.C55984a.run():void");
            }
        }

        public C55983e(FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2) {
            this.f159620d = finderLiveCameraOptBeautyPowerfulDetailsViewV2;
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$6", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$6", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$6", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$6", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C87412m.m108594g(motionEvent, "e1");
            C87412m.m108594g(motionEvent2, "e2");
            float x = motionEvent.getX() - motionEvent2.getX();
            float x2 = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(f) > 0.0f) {
                int P = C110818d0.m150918P(this.f159620d.getEffectItems(), this.f159620d.getSelectedEffect());
                boolean z = true;
                if (x > 50.0f) {
                    if (P < this.f159620d.getEffectItems().size() - 1) {
                        FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2 = this.f159620d;
                        finderLiveCameraOptBeautyPowerfulDetailsViewV2.setSelectedEffect(finderLiveCameraOptBeautyPowerfulDetailsViewV2.getEffectItems().get(P + 1));
                    }
                } else if (x2 <= 50.0f) {
                    z = false;
                } else if (P > 0) {
                    FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV22 = this.f159620d;
                    finderLiveCameraOptBeautyPowerfulDetailsViewV22.setSelectedEffect(finderLiveCameraOptBeautyPowerfulDetailsViewV22.getEffectItems().get(P - 1));
                }
                if (z) {
                    FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV23 = this.f159620d;
                    finderLiveCameraOptBeautyPowerfulDetailsViewV23.f159608x.postDelayed(new C55984a(finderLiveCameraOptBeautyPowerfulDetailsViewV23), 100);
                }
            }
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$6", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$6", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            C62777fg fgVar;
            C62889n0 n0Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$6", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            C87412m.m108594g(motionEvent, "e");
            if (motionEvent.getY() < ((float) C61926c.m72690o(this.f159620d.f159605u)[1])) {
                this.f159620d.mo77797d(true);
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.BEAUTY, "", (String) null, 4, (Object) null);
                FinderLiveService finderLiveService = FinderLiveService.f159376d;
                finderLiveService.getClass();
                C56032b bVar = FinderLiveService.f159379g;
                if (!(bVar == null || (n0Var = (C62889n0) bVar.getPlugin(C62889n0.class)) == null)) {
                    n0Var.mo87829e1(true);
                }
                finderLiveService.getClass();
                C56032b bVar2 = FinderLiveService.f159379g;
                if (!(bVar2 == null || (fgVar = (C62777fg) bVar2.getPlugin(C62777fg.class)) == null)) {
                    fgVar.mo87779b1(true);
                }
            }
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$6", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$f */
    public static final class C55985f implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2 f159622d;

        public C55985f(FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2) {
            this.f159622d = finderLiveCameraOptBeautyPowerfulDetailsViewV2;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            this.f159622d.f159609y.mo83434a(motionEvent);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$g */
    public final class C55986g extends RecyclerView.C16613e<C55989j> {

        /* renamed from: d */
        public final int f159623d = C74942w4.m89784a(MMApplicationContext.getContext(), 32);

        /* renamed from: e */
        public final int f159624e = C74942w4.m89784a(MMApplicationContext.getContext(), 12);

        /* renamed from: f */
        public final int f159625f = C74942w4.m89784a(MMApplicationContext.getContext(), 16);

        public C55986g() {
        }

        public int getItemCount() {
            return FinderLiveCameraOptBeautyPowerfulDetailsViewV2.this.getEffectItems().size();
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0109  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x010c  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x011d  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x012c  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0130  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0153  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x019c  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x019e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r21, int r22) {
            /*
                r20 = this;
                r0 = r20
                r1 = r22
                r2 = r21
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$j r2 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55989j) r2
                java.lang.String r3 = "holder"
                gy3.C87412m.m108594g(r2, r3)
                if (r1 < 0) goto L_0x01e9
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r3 = com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.this
                java.util.List r3 = r3.getEffectItems()
                int r3 = r3.size()
                if (r1 < r3) goto L_0x001d
                goto L_0x01e9
            L_0x001d:
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r3 = com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.this
                java.util.List r3 = r3.getEffectItems()
                java.lang.Object r3 = r3.get(r1)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$k r3 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k) r3
                java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
                int r5 = r4.intValue()
                r6 = 1
                r7 = 0
                if (r5 <= 0) goto L_0x0037
                r5 = 1
                goto L_0x0038
            L_0x0037:
                r5 = 0
            L_0x0038:
                r8 = 0
                if (r5 == 0) goto L_0x003c
                goto L_0x003d
            L_0x003c:
                r4 = r8
            L_0x003d:
                if (r4 == 0) goto L_0x0051
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r5 = com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.this
                int r4 = r4.intValue()
                java.util.List r5 = r5.getEffectItems()
                int r4 = r4 - r6
                java.lang.Object r4 = r5.get(r4)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$k r4 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k) r4
                goto L_0x0052
            L_0x0051:
                r4 = r8
            L_0x0052:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r9 = com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.this
                int r10 = r5.intValue()
                java.util.List r9 = r9.getEffectItems()
                int r9 = r9.size()
                int r9 = r9 - r6
                if (r10 >= r9) goto L_0x0069
                r9 = 1
                goto L_0x006a
            L_0x0069:
                r9 = 0
            L_0x006a:
                if (r9 == 0) goto L_0x006d
                goto L_0x006e
            L_0x006d:
                r5 = r8
            L_0x006e:
                if (r5 == 0) goto L_0x0082
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r9 = com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.this
                int r5 = r5.intValue()
                java.util.List r9 = r9.getEffectItems()
                int r5 = r5 + r6
                java.lang.Object r5 = r9.get(r5)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$k r5 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k) r5
                goto L_0x0083
            L_0x0082:
                r5 = r8
            L_0x0083:
                if (r1 != 0) goto L_0x0088
                int r4 = r0.f159623d
                goto L_0x0094
            L_0x0088:
                if (r4 == 0) goto L_0x008d
                b50.i r4 = r4.f159641d
                goto L_0x008e
            L_0x008d:
                r4 = r8
            L_0x008e:
                b50.i r9 = r3.f159641d
                if (r4 != r9) goto L_0x0096
                int r4 = r0.f159624e
            L_0x0094:
                r9 = 0
                goto L_0x0099
            L_0x0096:
                int r4 = r0.f159625f
                r9 = 1
            L_0x0099:
                if (r5 == 0) goto L_0x009e
                b50.i r5 = r5.f159641d
                goto L_0x009f
            L_0x009e:
                r5 = r8
            L_0x009f:
                b50.i r10 = r3.f159641d
                if (r5 != r10) goto L_0x00a6
                int r5 = r0.f159624e
                goto L_0x00a8
            L_0x00a6:
                int r5 = r0.f159625f
            L_0x00a8:
                android.view.View r15 = r2.f159635C
                r18 = 8
                if (r9 == 0) goto L_0x00b0
                r9 = 0
                goto L_0x00b2
            L_0x00b0:
                r9 = 8
            L_0x00b2:
                k20.a r14 = new k20.a
                r14.<init>()
                java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r14.mo10233c(r9)
                java.lang.Object[] r11 = r14.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyAdapter"
                java.lang.String r13 = "onBindViewHolder"
                java.lang.String r9 = "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$CameraOptBeautyViewHolder;I)V"
                java.lang.String r16 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r19 = "(I)V"
                r10 = r15
                r6 = r14
                r14 = r9
                r9 = r15
                r15 = r16
                r16 = r17
                r17 = r19
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r6 = r6.mo10231a(r7)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r9.setVisibility(r6)
                java.lang.String r11 = "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyAdapter"
                java.lang.String r12 = "onBindViewHolder"
                java.lang.String r13 = "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$CameraOptBeautyViewHolder;I)V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r10 = r9
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                android.view.View r6 = r2.f159634B
                android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
                boolean r9 = r6 instanceof android.widget.RelativeLayout.LayoutParams
                if (r9 == 0) goto L_0x0109
                android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
                goto L_0x010a
            L_0x0109:
                r6 = r8
            L_0x010a:
                if (r6 == 0) goto L_0x010f
                r6.setMargins(r4, r7, r5, r7)
            L_0x010f:
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r4 = com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.this
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$k r4 = r4.getSelectedEffect()
                if (r4 == 0) goto L_0x011f
                int r4 = r4.f159638a
                int r5 = r3.f159638a
                if (r4 != r5) goto L_0x011f
                r6 = 1
                goto L_0x0120
            L_0x011f:
                r6 = 0
            L_0x0120:
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r4 = com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.this
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                if (r6 == 0) goto L_0x0130
                r5 = 2131099707(0x7f06003b, float:1.7811775E38)
                goto L_0x0133
            L_0x0130:
                r5 = 2131099702(0x7f060036, float:1.7811765E38)
            L_0x0133:
                int r4 = r4.getColor(r5)
                android.widget.TextView r5 = r2.f159637z
                java.lang.String r9 = r3.f159639b
                r5.setText(r9)
                android.widget.TextView r5 = r2.f159637z
                r5.setActivated(r6)
                android.widget.TextView r5 = r2.f159637z
                r5.setTextColor(r4)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r5 = com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.this
                boolean r3 = r5.mo77798e(r3, r8)
                android.view.View r5 = r2.f159636D
                if (r3 == 0) goto L_0x0153
                goto L_0x0155
            L_0x0153:
                r18 = 0
            L_0x0155:
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r18)
                r3.mo10233c(r8)
                java.lang.Object[] r9 = r3.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyAdapter"
                java.lang.String r11 = "onBindViewHolder"
                java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$CameraOptBeautyViewHolder;I)V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r5
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r3 = r3.mo10231a(r7)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r5.setVisibility(r3)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyAdapter"
                java.lang.String r10 = "onBindViewHolder"
                java.lang.String r11 = "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$CameraOptBeautyViewHolder;I)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                android.view.View r3 = r2.f159636D
                r3.setBackgroundColor(r4)
                android.view.View r3 = r2.f159633A
                if (r6 == 0) goto L_0x019e
                r4 = 0
                goto L_0x019f
            L_0x019e:
                r4 = 4
            L_0x019f:
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5.mo10233c(r4)
                java.lang.Object[] r9 = r5.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyAdapter"
                java.lang.String r11 = "onBindViewHolder"
                java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$CameraOptBeautyViewHolder;I)V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r3
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r4 = r5.mo10231a(r7)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyAdapter"
                java.lang.String r10 = "onBindViewHolder"
                java.lang.String r11 = "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$CameraOptBeautyViewHolder;I)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                android.view.View r2 = r2.f44854d
                com.tencent.mm.plugin.finder.live.view.z r3 = new com.tencent.mm.plugin.finder.live.view.z
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2 r4 = com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.this
                r3.<init>(r4, r1)
                r2.setOnClickListener(r3)
            L_0x01e9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55986g.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.af9, (ViewGroup) null);
            C87412m.m108593f(inflate, "inflate(\n               …   null\n                )");
            return new C55989j(inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$h */
    public final class C55987h extends RecyclerView.C16613e<C55988i> {

        /* renamed from: d */
        public C54423i f159627d = C54423i.SKIN_BEAUTY;

        /* renamed from: e */
        public final C54423i[] f159628e = C54423i.values();

        public C55987h() {
        }

        public int getItemCount() {
            return this.f159628e.length;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            String str;
            int i2;
            C55988i iVar = (C55988i) zVar;
            C87412m.m108594g(iVar, "holder");
            C54423i iVar2 = this.f159628e[i];
            int ordinal = iVar2.ordinal();
            boolean z = true;
            if (ordinal == 0) {
                i2 = C0966R.string.n1q;
                str = "live_beauty_skin";
            } else if (ordinal == 1) {
                i2 = C0966R.string.n1o;
                str = "live_beauty_face";
            } else if (ordinal == 2) {
                i2 = C0966R.string.n1p;
                str = "live_beauty_facial";
            } else {
                throw new C13603j();
            }
            ((C61212e) C86312j.m106911c(C61212e.class)).o30(iVar.f159632z, str);
            C23564m.m28138h(iVar.f159632z, new C3201a0());
            iVar.f159630A.setText(iVar.f44854d.getContext().getString(i2));
            if (iVar2 != this.f159627d) {
                z = false;
            }
            C7919x.m8091a(iVar.f159630A);
            iVar.f159630A.setTextColor(z ? iVar.f44854d.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8) : iVar.f44854d.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
            View view = iVar.f159631B;
            int i3 = z ? 0 : 4;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i3));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyTypeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyTypeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyTypeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2$BeautyTypeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            iVar.f44854d.setTag(iVar2);
            iVar.f44854d.setOnClickListener(new C56054b0(iVar, this, FinderLiveCameraOptBeautyPowerfulDetailsViewV2.this));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.f359712d42, (ViewGroup) null);
            C87412m.m108593f(inflate, "inflate(\n               …   null\n                )");
            return new C55988i(inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$i */
    public static final class C55988i extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f159630A;

        /* renamed from: B */
        public final View f159631B;

        /* renamed from: z */
        public final View f159632z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55988i(View view) {
            super(view);
            C87412m.m108594g(view, "mItemView");
            this.f159632z = view;
            View findViewById = view.findViewById(C0966R.C0970id.ntw);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…ive_beauty_item_name_txt)");
            this.f159630A = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.ntx);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…eauty_item_selected_line)");
            this.f159631B = findViewById2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$j */
    public static final class C55989j extends RecyclerView.C16631z {

        /* renamed from: A */
        public final View f159633A;

        /* renamed from: B */
        public final View f159634B;

        /* renamed from: C */
        public final View f159635C;

        /* renamed from: D */
        public final View f159636D;

        /* renamed from: z */
        public final TextView f159637z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55989j(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.dh4);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…ra_opt_beauty_item_title)");
            this.f159637z = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.nu5);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…_beauty_item_select_mark)");
            this.f159633A = findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.f358116nu3);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.…beauty_item_content_root)");
            this.f159634B = findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.nu4);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.…era_opt_beauty_item_line)");
            this.f159635C = findViewById4;
            View findViewById5 = view.findViewById(C0966R.C0970id.f358115nu2);
            C87412m.m108593f(findViewById5, "itemView.findViewById(R.…_beauty_item_changed_tag)");
            this.f159636D = findViewById5;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$k */
    public static final class C55990k {

        /* renamed from: a */
        public final int f159638a;

        /* renamed from: b */
        public final String f159639b;

        /* renamed from: c */
        public final boolean f159640c;

        /* renamed from: d */
        public final C54423i f159641d;

        public C55990k(int i, String str, boolean z, C54423i iVar) {
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(iVar, "type");
            this.f159638a = i;
            this.f159639b = str;
            this.f159640c = z;
            this.f159641d = iVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C55990k)) {
                return false;
            }
            C55990k kVar = (C55990k) obj;
            return this.f159638a == kVar.f159638a && C87412m.m108589b(this.f159639b, kVar.f159639b) && this.f159640c == kVar.f159640c && this.f159641d == kVar.f159641d;
        }

        public int hashCode() {
            int hashCode = ((this.f159638a * 31) + this.f159639b.hashCode()) * 31;
            boolean z = this.f159640c;
            if (z) {
                z = true;
            }
            return ((hashCode + (z ? 1 : 0)) * 31) + this.f159641d.hashCode();
        }

        public String toString() {
            return "EffectInfo(beautyId=" + this.f159638a + ", title=" + this.f159639b + ", isBothSides=" + this.f159640c + ", type=" + this.f159641d + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$l */
    public static final class C55991l implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2 f159642d;

        /* renamed from: e */
        public final /* synthetic */ boolean f159643e;

        public C55991l(FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2, boolean z) {
            this.f159642d = finderLiveCameraOptBeautyPowerfulDetailsViewV2;
            this.f159643e = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2 = this.f159642d;
            boolean z = this.f159643e;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            FinderLiveCameraOptBeautyPowerfulDetailsViewV2.m63954a(finderLiveCameraOptBeautyPowerfulDetailsViewV2, z, ((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$m */
    public static final class C55992m extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ float f159644d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2 f159645e;

        /* renamed from: f */
        public final /* synthetic */ boolean f159646f;

        /* renamed from: g */
        public final /* synthetic */ float f159647g;

        public C55992m(float f, FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2, boolean z, float f2) {
            this.f159644d = f;
            this.f159645e = finderLiveCameraOptBeautyPowerfulDetailsViewV2;
            this.f159646f = z;
            this.f159647g = f2;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FinderLiveCameraOptBeautyPowerfulDetailsViewV2.m63954a(this.f159645e, this.f159646f, this.f159647g);
            this.f159645e.setVisibility(this.f159646f ? 8 : 0);
            FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2 = this.f159645e;
            finderLiveCameraOptBeautyPowerfulDetailsViewV2.getClass();
            Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#reload");
            finderLiveCameraOptBeautyPowerfulDetailsViewV2.setSelectedEffect(finderLiveCameraOptBeautyPowerfulDetailsViewV2.f159593f);
            finderLiveCameraOptBeautyPowerfulDetailsViewV2.mo77800g();
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            FinderLiveCameraOptBeautyPowerfulDetailsViewV2.m63954a(this.f159645e, this.f159646f, this.f159644d);
            this.f159645e.setVisibility(0);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$launchDismissValueJob$1", mo125469f = "FinderLiveCameraOptBeautyPowerfulDetailsViewV2.kt", mo125470l = {382}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2$n */
    public static final class C55993n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f159648d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsViewV2 f159649e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55993n(FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2, C15601d<? super C55993n> dVar) {
            super(2, dVar);
            this.f159649e = finderLiveCameraOptBeautyPowerfulDetailsViewV2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C55993n(this.f159649e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C55993n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f159648d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f159648d = 1;
                if (C53965x0.m60607b(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f159649e.f159588B.setVisibility(4);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveCameraOptBeautyPowerfulDetailsViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public static final void m63954a(FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2, boolean z, float f) {
        finderLiveCameraOptBeautyPowerfulDetailsViewV2.setTranslationX((((float) 1) - f) * ((float) finderLiveCameraOptBeautyPowerfulDetailsViewV2.getMeasuredWidth()));
        finderLiveCameraOptBeautyPowerfulDetailsViewV2.setAlpha(z ? Math.max(1.0f, f * ((float) 10)) : Math.min(1.0f, f * ((float) 10)));
        finderLiveCameraOptBeautyPowerfulDetailsViewV2.setAndMoveSeekValueText(finderLiveCameraOptBeautyPowerfulDetailsViewV2.f159605u.getProgress());
    }

    private final void setAndMoveDefaultValueIcon(int i) {
        int width = this.f159605u.getWidth() - this.f159587A.getWidth();
        float max = ((((float) i) / ((float) this.f159605u.getMax())) * ((float) ((this.f159605u.getMeasuredWidth() - this.f159605u.getPaddingStart()) - this.f159605u.getPaddingEnd()))) + ((float) this.f159605u.getThumbOffset());
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#setAndMoveDefaultValueIcon progress:" + i + " translationX:" + max);
        ImageView imageView = this.f159587A;
        float f = (float) width;
        if (max > f) {
            max = f;
        }
        imageView.setTranslationX(max);
    }

    /* access modifiers changed from: private */
    public final void setAndMoveSeekValueText(int i) {
        String str;
        C55990k kVar = this.f159593f;
        int h = mo77810h(i, kVar != null ? kVar.f159640c : false, this.f159605u.getMax());
        TextView textView = this.f159588B;
        if (h > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('+');
            sb.append(h);
            str = sb.toString();
        } else {
            str = String.valueOf(h);
        }
        textView.setText(str);
        int width = this.f159605u.getWidth() - this.f159588B.getWidth();
        float f = (float) 2;
        float max = ((((float) i) / ((float) this.f159605u.getMax())) * ((float) ((this.f159605u.getMeasuredWidth() - this.f159605u.getPaddingStart()) - this.f159605u.getPaddingEnd()))) - (Math.abs(((float) this.f159605u.getThumb().getIntrinsicWidth()) - ((float) this.f159588B.getWidth())) / f);
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#setAndMoveSeekValueText progress:" + i + " translationX:" + max);
        TextView textView2 = this.f159588B;
        float f2 = (float) width;
        if (max > f2) {
            max = f2;
        }
        float intrinsicWidth = (((float) this.f159605u.getThumb().getIntrinsicWidth()) - ((float) this.f159588B.getWidth())) / f;
        if (max < intrinsicWidth) {
            max = intrinsicWidth;
        }
        textView2.setTranslationX(max);
    }

    /* renamed from: c */
    public final void mo77796c(boolean z) {
        float f = 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        if (z) {
            f = 0.0f;
        }
        Animator animator = this.f159592e;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f});
        ofFloat.addUpdateListener(new C55991l(this, z));
        ofFloat.addListener(new C55992m(f2, this, z, f));
        ofFloat.setDuration(360);
        ofFloat.start();
        this.f159592e = ofFloat;
    }

    /* renamed from: d */
    public final void mo77797d(boolean z) {
        C53973z1 z1Var = this.f159610z;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#hideSelf isAnimator=" + z);
        Animator animator = this.f159592e;
        boolean z2 = false;
        if (animator != null && animator.isRunning()) {
            z2 = true;
        }
        if (z2) {
            Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#hideSelf visibilityAnimator isRunning");
        } else if (!z) {
            setAlpha(0.0f);
            setVisibility(8);
        } else {
            mo77796c(true);
        }
    }

    /* renamed from: e */
    public final boolean mo77798e(C55990k kVar, Integer num) {
        if (num == null) {
            C32226l<? super Integer, Integer> lVar = this.f159596i;
            num = lVar != null ? lVar.invoke(Integer.valueOf(kVar.f159638a)) : null;
        }
        C32226l<? super Integer, Integer> lVar2 = this.f159597j;
        return num != null && (lVar2 != null ? lVar2.invoke(Integer.valueOf(kVar.f159638a)).intValue() : -1) == num.intValue();
    }

    /* renamed from: f */
    public final void mo77799f() {
        C55908a aVar;
        FinderLiveService.f159376d.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        C53973z1 z1Var = null;
        if (!(bVar == null || (aVar = bVar.f123702i) == null)) {
            C53896h0 h0Var = C53872d1.f151117a;
            z1Var = C53895h.m60466d(aVar, C58901s.f168555a, (C53934p0) null, new C55993n(this, (C15601d<? super C55993n>) null), 2, (Object) null);
        }
        this.f159610z = z1Var;
    }

    /* renamed from: g */
    public final void mo77800g() {
        View view = this.f159604t;
        C32224a<Boolean> aVar = this.f159595h;
        boolean z = true;
        if (aVar == null || !aVar.invoke().booleanValue()) {
            z = false;
        }
        float f = z ? 0.3f : 1.0f;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(Float.valueOf(f));
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2", "reloadResetTextLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsViewV2", "reloadResetTextLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final List<C55990k> getEffectItems() {
        return this.f159594g;
    }

    public final C32224a<C13598b0> getOnBackClick() {
        return this.f159601q;
    }

    public final C32224a<Boolean> getOnRequestCheckIsDefault() {
        return this.f159595h;
    }

    public final C32226l<Integer, Integer> getOnRequestDefaultSeekByKey() {
        return this.f159597j;
    }

    public final C32224a<C13598b0> getOnRequestReset() {
        return this.f159600p;
    }

    public final C32226l<Integer, Integer> getOnRequestSeekByKey() {
        return this.f159596i;
    }

    public final C32227p<Integer, Integer, C13598b0> getOnSeekChanging() {
        return this.f159598n;
    }

    public final C32227p<Integer, Integer, C13598b0> getOnSeekDone() {
        return this.f159599o;
    }

    public final C55990k getSelectedEffect() {
        return this.f159593f;
    }

    /* renamed from: h */
    public final int mo77810h(int i, boolean z, int i2) {
        Number number;
        float f = (float) i2;
        float f2 = f / 2.0f;
        if (z) {
            float f3 = (float) i;
            number = f3 < f2 ? Float.valueOf(((f3 / f2) * 100.0f) - 100.0f) : f3 > f2 ? Float.valueOf(((f3 - f2) / f2) * 100.0f) : 0;
        } else {
            number = Float.valueOf((((float) i) / f) * 100.0f);
        }
        return number.intValue();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C53973z1 z1Var = this.f159610z;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }

    public final void setEffectItems(List<C55990k> list) {
        C87412m.m108594g(list, "value");
        ((ArrayList) this.f159594g).clear();
        ((ArrayList) this.f159594g).addAll(list);
        setSelectedEffect((C55990k) C110818d0.m150916N(this.f159594g));
        this.f159591d.notifyDataSetChanged();
    }

    public final void setOnBackClick(C32224a<C13598b0> aVar) {
        this.f159601q = aVar;
    }

    public final void setOnRequestCheckIsDefault(C32224a<Boolean> aVar) {
        this.f159595h = aVar;
    }

    public final void setOnRequestDefaultSeekByKey(C32226l<? super Integer, Integer> lVar) {
        this.f159597j = lVar;
    }

    public final void setOnRequestReset(C32224a<C13598b0> aVar) {
        this.f159600p = aVar;
    }

    public final void setOnRequestSeekByKey(C32226l<? super Integer, Integer> lVar) {
        this.f159596i = lVar;
    }

    public final void setOnSeekChanging(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        this.f159598n = pVar;
    }

    public final void setOnSeekDone(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        this.f159599o = pVar;
    }

    public final void setSelectedEffect(C55990k kVar) {
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#selectedEffect set " + kVar);
        this.f159593f = kVar;
        this.f159591d.notifyDataSetChanged();
        this.f159588B.setVisibility(0);
        C53973z1 z1Var = this.f159610z;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        mo77799f();
        C55990k kVar2 = this.f159593f;
        if (kVar2 != null) {
            C32226l<? super Integer, Integer> lVar = this.f159596i;
            if (lVar != null) {
                int intValue = lVar.invoke(Integer.valueOf(kVar2.f159638a)).intValue();
                Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#selectedEffect set onRequestSeekByKey " + intValue);
                this.f159605u.setBothSidesMode(kVar2.f159640c);
                BothSidesSeekBar bothSidesSeekBar = this.f159605u;
                boolean z = kVar2.f159640c;
                float max = (float) bothSidesSeekBar.getMax();
                float f = max / 2.0f;
                if (z) {
                    float f2 = f / 100.0f;
                    if (intValue != 0) {
                        f += ((float) intValue) * f2;
                    }
                } else {
                    f = (max / 100.0f) * ((float) intValue);
                }
                bothSidesSeekBar.setProgress((int) f);
                setAndMoveSeekValueText(this.f159605u.getProgress());
            }
            C32226l<? super Integer, Integer> lVar2 = this.f159597j;
            if (lVar2 != null) {
                int intValue2 = lVar2.invoke(Integer.valueOf(kVar2.f159638a)).intValue();
                Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#selectedEffect set onRequestDefaultSeekByKey " + intValue2);
                boolean z2 = kVar2.f159640c;
                float max2 = (float) this.f159605u.getMax();
                float f3 = max2 / 2.0f;
                if (z2) {
                    float f4 = f3 / 100.0f;
                    if (intValue2 != 0) {
                        f3 += ((float) intValue2) * f4;
                    }
                } else {
                    f3 = (max2 / 100.0f) * ((float) intValue2);
                }
                setAndMoveDefaultValueIcon((int) f3);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveCameraOptBeautyPowerfulDetailsViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C55986g gVar = new C55986g();
        this.f159591d = gVar;
        this.f159594g = new ArrayList();
        View inflate = View.inflate(context, C0966R.C0971layout.af_, this);
        C87412m.m108593f(inflate, "inflate(context, R.layou…el_details_view_v2, this)");
        this.f159602r = inflate;
        this.f159587A = (ImageView) findViewById(C0966R.C0970id.f358106dg1);
        this.f159589C = context.getSystemService("vibrator");
        this.f159590D = (C76577a.m92145A(context) / 2) - C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3745cw);
        mo77797d(false);
        View findViewById = findViewById(C0966R.C0970id.f358107dg2);
        C87412m.m108593f(findViewById, "findViewById<TextView>(\n…s_seek_value_tv\n        )");
        this.f159588B = (TextView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.nty);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_live_beauty_tab_rv)");
        this.f159606v = (RecyclerView) findViewById2;
        this.f159607w = new C55987h();
        RecyclerView recyclerView = this.f159606v;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f159602r.getContext(), 0, false));
        recyclerView.setAdapter(this.f159607w);
        View findViewById3 = findViewById(C0966R.C0970id.dfy);
        C87412m.m108593f(findViewById3, "findViewById(R.id.finder…etails_reset_text_layout)");
        this.f159604t = findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.f358105dg0);
        C87412m.m108593f(findViewById4, "findViewById(\n          …etails_seek_bar\n        )");
        this.f159605u = (BothSidesSeekBar) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.dfz);
        C87412m.m108593f(findViewById5, "findViewById<RecyclerVie…owerful_panel_details_rv)");
        RecyclerView recyclerView2 = (RecyclerView) findViewById5;
        this.f159608x = recyclerView2;
        recyclerView2.setAdapter(gVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        recyclerView2.setLayoutManager(linearLayoutManager);
        recyclerView2.mo17043c(new C55977a(linearLayoutManager, this));
        this.f159605u.setOnSeekBarChangeListener(new C55978b(this));
        View findViewById6 = findViewById(C0966R.C0970id.dfy);
        C87412m.m108593f(findViewById6, "findViewById(R.id.finder…etails_reset_text_layout)");
        this.f159603s = findViewById6;
        C62042e eVar = C62042e.f176370a;
        C62042e.m72803Q1(eVar, findViewById6, 0, 0, 6, (Object) null);
        this.f159603s.setOnClickListener(new C55979c(this, context));
        View findViewById7 = findViewById(C0966R.C0970id.dfw);
        findViewById7.setOnClickListener(new C55982d(this));
        C62042e.m72803Q1(eVar, findViewById7, 0, 0, 6, (Object) null);
        this.f159609y = new C58521d(context, new C55983e(this));
        this.f159602r.setLongClickable(true);
        this.f159602r.setOnTouchListener(new C55985f(this));
    }
}
