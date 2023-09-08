package com.tencent.p014mm.plugin.finder.live.view;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.content.Context;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.seekbar.BothSidesSeekBar;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f14.C58901s;
import fj1.C45795b;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110818d0;
import w50.C65933h;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002JKB'\b\u0007\u0012\u0006\u0010D\u001a\u00020C\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E\u0012\b\b\u0002\u0010G\u001a\u00020\u0012¢\u0006\u0004\bH\u0010IR(\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@BX\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R0\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R6\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020&\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010\u0018R6\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R6\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u0010 \u001a\u0004\b0\u0010\"\"\u0004\b1\u0010$R6\u00106\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u0010 \u001a\u0004\b4\u0010\"\"\u0004\b5\u0010$R6\u0010:\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u0010 \u001a\u0004\b8\u0010\"\"\u0004\b9\u0010$R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006L"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptMakeupView;", "Landroid/widget/RelativeLayout;", "Lw50/h$b;", "value", "e", "Lw50/h$b;", "setSelectedMakeup", "(Lw50/h$b;)V", "selectedMakeup", "", "f", "Ljava/util/List;", "getEffectItems", "()Ljava/util/List;", "setEffectItems", "(Ljava/util/List;)V", "effectItems", "Lkotlin/Function1;", "", "g", "Lfy3/l;", "getOnRequestMakeupSeekByKey", "()Lfy3/l;", "setOnRequestMakeupSeekByKey", "(Lfy3/l;)V", "onRequestMakeupSeekByKey", "h", "getOnRequestFilterSeekByKey", "setOnRequestFilterSeekByKey", "onRequestFilterSeekByKey", "Lkotlin/Function2;", "i", "Lfy3/p;", "getOnRequestDefaultSeekByKey", "()Lfy3/p;", "setOnRequestDefaultSeekByKey", "(Lfy3/p;)V", "onRequestDefaultSeekByKey", "Lrx3/b0;", "j", "getOnMakeupSuitChanged", "setOnMakeupSuitChanged", "onMakeupSuitChanged", "n", "getOnMakeupSeekChanging", "setOnMakeupSeekChanging", "onMakeupSeekChanging", "o", "getOnMakeupSeekDone", "setOnMakeupSeekDone", "onMakeupSeekDone", "p", "getOnFilterSeekChanging", "setOnFilterSeekChanging", "onFilterSeekChanging", "q", "getOnFilterSeekDone", "setOnFilterSeekDone", "onFilterSeekDone", "Lcom/tencent/mm/ui/widget/seekbar/BothSidesSeekBar;", "s", "Lcom/tencent/mm/ui/widget/seekbar/BothSidesSeekBar;", "getBar1", "()Lcom/tencent/mm/ui/widget/seekbar/BothSidesSeekBar;", "setBar1", "(Lcom/tencent/mm/ui/widget/seekbar/BothSidesSeekBar;)V", "bar1", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "c", "d", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView */
public final class FinderLiveCameraOptMakeupView extends RelativeLayout {

    /* renamed from: A */
    public C53973z1 f159669A;

    /* renamed from: B */
    public final Object f159670B;

    /* renamed from: C */
    public RecyclerView f159671C;

    /* renamed from: D */
    public final float f159672D;

    /* renamed from: E */
    public final int f159673E;

    /* renamed from: d */
    public final C56007c f159674d;

    /* renamed from: e */
    public C65933h.C65935b f159675e;

    /* renamed from: f */
    public List<C65933h.C65935b> f159676f;

    /* renamed from: g */
    public C32226l<? super C65933h.C65935b, Integer> f159677g;

    /* renamed from: h */
    public C32226l<? super C65933h.C65935b, Integer> f159678h;

    /* renamed from: i */
    public C32227p<? super Integer, ? super Integer, Integer> f159679i;

    /* renamed from: j */
    public C32226l<? super C65933h.C65935b, C13598b0> f159680j;

    /* renamed from: n */
    public C32227p<? super C65933h.C65935b, ? super Integer, C13598b0> f159681n;

    /* renamed from: o */
    public C32227p<? super C65933h.C65935b, ? super Integer, C13598b0> f159682o;

    /* renamed from: p */
    public C32227p<? super C65933h.C65935b, ? super Integer, C13598b0> f159683p;

    /* renamed from: q */
    public C32227p<? super C65933h.C65935b, ? super Integer, C13598b0> f159684q;

    /* renamed from: r */
    public LinearLayout f159685r;

    /* renamed from: s */
    public BothSidesSeekBar f159686s;

    /* renamed from: t */
    public TextView f159687t;

    /* renamed from: u */
    public ImageView f159688u;

    /* renamed from: v */
    public LinearLayout f159689v;

    /* renamed from: w */
    public BothSidesSeekBar f159690w;

    /* renamed from: x */
    public TextView f159691x;

    /* renamed from: y */
    public ImageView f159692y;

    /* renamed from: z */
    public C53973z1 f159693z;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView$a */
    public static final class C56005a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptMakeupView f159694d;

        /* renamed from: e */
        public final /* synthetic */ Context f159695e;

        public C56005a(FinderLiveCameraOptMakeupView finderLiveCameraOptMakeupView, Context context) {
            this.f159694d = finderLiveCameraOptMakeupView;
            this.f159695e = context;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int i2 = i;
            int b = FinderLiveCameraOptMakeupView.m63968b(this.f159694d, i2, false, seekBar != null ? seekBar.getMax() : 0);
            FinderLiveCameraOptMakeupView finderLiveCameraOptMakeupView = this.f159694d;
            C65933h.C65935b bVar = finderLiveCameraOptMakeupView.f159675e;
            if (bVar != null) {
                C32227p<C65933h.C65935b, Integer, C13598b0> onMakeupSeekChanging = finderLiveCameraOptMakeupView.getOnMakeupSeekChanging();
                View view = null;
                if (onMakeupSeekChanging != null) {
                    if (!z) {
                        onMakeupSeekChanging = null;
                    }
                    if (onMakeupSeekChanging != null) {
                        onMakeupSeekChanging.invoke(bVar, Integer.valueOf(b));
                    }
                }
                boolean d = finderLiveCameraOptMakeupView.mo77865d(bVar, Integer.valueOf(b));
                boolean c = finderLiveCameraOptMakeupView.mo77864c(bVar, (Integer) null);
                if (d) {
                    Object obj = finderLiveCameraOptMakeupView.f159670B;
                    if (obj instanceof Vibrator) {
                        ((Vibrator) obj).vibrate(10);
                    }
                }
                if (c) {
                    Integer valueOf = Integer.valueOf(finderLiveCameraOptMakeupView.getEffectItems().indexOf(bVar));
                    if (!(valueOf.intValue() != -1)) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        RecyclerView recyclerView = finderLiveCameraOptMakeupView.f159671C;
                        if (recyclerView != null) {
                            RecyclerView.C16631z I0 = recyclerView.mo17023I0(intValue);
                            if (I0 != null) {
                                C56008d dVar = I0 instanceof C56008d ? (C56008d) I0 : null;
                                if (dVar != null) {
                                    view = dVar.f159701C;
                                }
                                if (view != null) {
                                    int i3 = !d ? 0 : 8;
                                    C9556a aVar = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar.mo10233c(Integer.valueOf(i3));
                                    View view2 = view;
                                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptMakeupView$2", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptMakeupView$2", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                            }
                        } else {
                            C87412m.m108603p("rv");
                            throw null;
                        }
                    }
                }
            }
            FinderLiveCameraOptMakeupView finderLiveCameraOptMakeupView2 = this.f159694d;
            BothSidesSeekBar bar1 = finderLiveCameraOptMakeupView2.getBar1();
            bar1.post(new C56058f0(bar1, this.f159694d.f159687t, i2, finderLiveCameraOptMakeupView2));
        }

        /* JADX WARNING: type inference failed for: r7v20, types: [android.view.ViewGroup$LayoutParams] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onStartTrackingTouch(android.widget.SeekBar r7) {
            /*
                r6 = this;
                java.lang.String r7 = "Finder.FinderLiveCameraOptMakeupView"
                java.lang.String r0 = "#onStartTrackingTouch"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159694d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r7 = r7.getBar1()
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r6.f159694d
                android.content.Context r0 = r0.getContext()
                r1 = 12
                int r0 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r0, r1)
                r7.mo154682a(r0)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159694d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r7 = r7.getBar1()
                android.content.Context r0 = r6.f159695e
                r2 = 2131232515(0x7f080703, float:1.8081141E38)
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
                r7.setThumb(r0)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159694d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r7 = r7.getBar1()
                r7.invalidate()
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159694d
                android.widget.TextView r7 = r7.f159687t
                android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                boolean r0 = r7 instanceof android.widget.RelativeLayout.LayoutParams
                r2 = 0
                if (r0 == 0) goto L_0x0047
                android.widget.RelativeLayout$LayoutParams r7 = (android.widget.RelativeLayout.LayoutParams) r7
                goto L_0x0048
            L_0x0047:
                r7 = r2
            L_0x0048:
                r0 = 0
                if (r7 == 0) goto L_0x005f
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r3 = r6.f159694d
                android.content.Context r4 = r3.getContext()
                r5 = 16
                int r4 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r4, r5)
                r7.setMargins(r0, r0, r0, r4)
                android.widget.TextView r3 = r3.f159687t
                r3.setLayoutParams(r7)
            L_0x005f:
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159694d
                android.widget.TextView r7 = r7.f159687t
                r3 = 1101004800(0x41a00000, float:20.0)
                r4 = 1
                r7.setTextSize(r4, r3)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159694d
                android.widget.TextView r7 = r7.f159687t
                r7.setVisibility(r0)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159694d
                a14.z1 r7 = r7.f159693z
                if (r7 == 0) goto L_0x0079
                a14.C53973z1.C53974a.m60623a(r7, r2, r4, r2)
            L_0x0079:
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159694d
                android.widget.ImageView r7 = r7.f159688u
                android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                boolean r0 = r7 instanceof android.widget.RelativeLayout.LayoutParams
                if (r0 == 0) goto L_0x0088
                r2 = r7
                android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            L_0x0088:
                if (r2 == 0) goto L_0x009b
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159694d
                android.content.Context r0 = r7.getContext()
                int r0 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r0, r1)
                r2.width = r0
                android.widget.ImageView r7 = r7.f159688u
                r7.setLayoutParams(r2)
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView.C56005a.onStartTrackingTouch(android.widget.SeekBar):void");
        }

        /* JADX WARNING: type inference failed for: r0v15, types: [android.view.ViewGroup$LayoutParams] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onStopTrackingTouch(android.widget.SeekBar r6) {
            /*
                r5 = this;
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159694d
                android.widget.TextView r0 = r0.f159687t
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                boolean r1 = r0 instanceof android.widget.RelativeLayout.LayoutParams
                r2 = 0
                if (r1 == 0) goto L_0x0010
                android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
                goto L_0x0011
            L_0x0010:
                r0 = r2
            L_0x0011:
                r1 = 0
                if (r0 == 0) goto L_0x001e
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r3 = r5.f159694d
                r0.setMargins(r1, r1, r1, r1)
                android.widget.TextView r3 = r3.f159687t
                r3.setLayoutParams(r0)
            L_0x001e:
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159694d
                android.widget.TextView r0 = r0.f159687t
                r3 = 1
                r4 = 1097859072(0x41700000, float:15.0)
                r0.setTextSize(r3, r4)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159694d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r0.getBar1()
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r3 = r5.f159694d
                android.content.Context r3 = r3.getContext()
                r4 = 4
                int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r4)
                r0.mo154682a(r3)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159694d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r0.getBar1()
                android.content.Context r3 = r5.f159695e
                r4 = 2131232514(0x7f080702, float:1.808114E38)
                android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
                r0.setThumb(r3)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159694d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r0.getBar1()
                r0.invalidate()
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159694d
                r0.mo77866e()
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159694d
                android.widget.ImageView r0 = r0.f159688u
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                boolean r3 = r0 instanceof android.widget.RelativeLayout.LayoutParams
                if (r3 == 0) goto L_0x006b
                r2 = r0
                android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            L_0x006b:
                if (r2 == 0) goto L_0x0080
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159694d
                android.content.Context r3 = r0.getContext()
                r4 = 8
                int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r4)
                r2.width = r3
                android.widget.ImageView r0 = r0.f159688u
                r0.setLayoutParams(r2)
            L_0x0080:
                if (r6 == 0) goto L_0x0090
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159694d
                int r2 = r6.getProgress()
                int r6 = r6.getMax()
                int r1 = com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView.m63968b(r0, r2, r1, r6)
            L_0x0090:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "#onStopTrackingTouch progress="
                r6.append(r0)
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "Finder.FinderLiveCameraOptMakeupView"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r6 = r5.f159694d
                w50.h$b r0 = r6.f159675e
                if (r0 == 0) goto L_0x00b9
                fy3.p r6 = r6.getOnMakeupSeekDone()
                if (r6 == 0) goto L_0x00b9
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r6.invoke(r0, r1)
            L_0x00b9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView.C56005a.onStopTrackingTouch(android.widget.SeekBar):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView$b */
    public static final class C56006b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptMakeupView f159696d;

        /* renamed from: e */
        public final /* synthetic */ Context f159697e;

        public C56006b(FinderLiveCameraOptMakeupView finderLiveCameraOptMakeupView, Context context) {
            this.f159696d = finderLiveCameraOptMakeupView;
            this.f159697e = context;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int i2 = i;
            int b = FinderLiveCameraOptMakeupView.m63968b(this.f159696d, i2, false, seekBar != null ? seekBar.getMax() : 0);
            FinderLiveCameraOptMakeupView finderLiveCameraOptMakeupView = this.f159696d;
            C65933h.C65935b bVar = finderLiveCameraOptMakeupView.f159675e;
            if (bVar != null) {
                C32227p<C65933h.C65935b, Integer, C13598b0> onFilterSeekChanging = finderLiveCameraOptMakeupView.getOnFilterSeekChanging();
                View view = null;
                if (onFilterSeekChanging != null) {
                    if (!z) {
                        onFilterSeekChanging = null;
                    }
                    if (onFilterSeekChanging != null) {
                        onFilterSeekChanging.invoke(bVar, Integer.valueOf(b));
                    }
                }
                boolean c = finderLiveCameraOptMakeupView.mo77864c(bVar, Integer.valueOf(b));
                boolean d = finderLiveCameraOptMakeupView.mo77865d(bVar, (Integer) null);
                if (c) {
                    Object obj = finderLiveCameraOptMakeupView.f159670B;
                    if (obj instanceof Vibrator) {
                        ((Vibrator) obj).vibrate(10);
                    }
                }
                if (d) {
                    Integer valueOf = Integer.valueOf(finderLiveCameraOptMakeupView.getEffectItems().indexOf(bVar));
                    if (!(valueOf.intValue() != -1)) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        RecyclerView recyclerView = finderLiveCameraOptMakeupView.f159671C;
                        if (recyclerView != null) {
                            RecyclerView.C16631z I0 = recyclerView.mo17023I0(intValue);
                            if (I0 != null) {
                                C56008d dVar = I0 instanceof C56008d ? (C56008d) I0 : null;
                                if (dVar != null) {
                                    view = dVar.f159701C;
                                }
                                if (view != null) {
                                    int i3 = !c ? 0 : 8;
                                    C9556a aVar = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar.mo10233c(Integer.valueOf(i3));
                                    View view2 = view;
                                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptMakeupView$3", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptMakeupView$3", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                            }
                        } else {
                            C87412m.m108603p("rv");
                            throw null;
                        }
                    }
                }
            }
            FinderLiveCameraOptMakeupView finderLiveCameraOptMakeupView2 = this.f159696d;
            BothSidesSeekBar bothSidesSeekBar = finderLiveCameraOptMakeupView2.f159690w;
            bothSidesSeekBar.post(new C56058f0(bothSidesSeekBar, finderLiveCameraOptMakeupView2.f159691x, i2, finderLiveCameraOptMakeupView2));
        }

        /* JADX WARNING: type inference failed for: r7v20, types: [android.view.ViewGroup$LayoutParams] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onStartTrackingTouch(android.widget.SeekBar r7) {
            /*
                r6 = this;
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159696d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r7.f159690w
                android.content.Context r7 = r7.getContext()
                r1 = 12
                int r7 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r7, r1)
                r0.mo154682a(r7)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159696d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r7 = r7.f159690w
                android.content.Context r0 = r6.f159697e
                r2 = 2131232515(0x7f080703, float:1.8081141E38)
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
                r7.setThumb(r0)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159696d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r7 = r7.f159690w
                r7.invalidate()
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159696d
                android.widget.TextView r7 = r7.f159691x
                android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                boolean r0 = r7 instanceof android.widget.RelativeLayout.LayoutParams
                r2 = 0
                if (r0 == 0) goto L_0x0038
                android.widget.RelativeLayout$LayoutParams r7 = (android.widget.RelativeLayout.LayoutParams) r7
                goto L_0x0039
            L_0x0038:
                r7 = r2
            L_0x0039:
                r0 = 0
                if (r7 == 0) goto L_0x0050
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r3 = r6.f159696d
                android.content.Context r4 = r3.getContext()
                r5 = 8
                int r4 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r4, r5)
                r7.setMargins(r0, r0, r0, r4)
                android.widget.TextView r3 = r3.f159691x
                r3.setLayoutParams(r7)
            L_0x0050:
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159696d
                android.widget.TextView r7 = r7.f159691x
                r3 = 1101004800(0x41a00000, float:20.0)
                r4 = 1
                r7.setTextSize(r4, r3)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159696d
                android.widget.TextView r7 = r7.f159691x
                r7.setVisibility(r0)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159696d
                a14.z1 r7 = r7.f159669A
                if (r7 == 0) goto L_0x006a
                a14.C53973z1.C53974a.m60623a(r7, r2, r4, r2)
            L_0x006a:
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159696d
                android.widget.ImageView r7 = r7.f159692y
                android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                boolean r0 = r7 instanceof android.widget.RelativeLayout.LayoutParams
                if (r0 == 0) goto L_0x0079
                r2 = r7
                android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            L_0x0079:
                if (r2 == 0) goto L_0x008c
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r7 = r6.f159696d
                android.content.Context r0 = r7.getContext()
                int r0 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r0, r1)
                r2.width = r0
                android.widget.ImageView r7 = r7.f159692y
                r7.setLayoutParams(r2)
            L_0x008c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView.C56006b.onStartTrackingTouch(android.widget.SeekBar):void");
        }

        /* JADX WARNING: type inference failed for: r0v16, types: [android.view.ViewGroup$LayoutParams] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onStopTrackingTouch(android.widget.SeekBar r6) {
            /*
                r5 = this;
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159696d
                android.widget.TextView r0 = r0.f159691x
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                boolean r1 = r0 instanceof android.widget.RelativeLayout.LayoutParams
                r2 = 0
                if (r1 == 0) goto L_0x0010
                android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
                goto L_0x0011
            L_0x0010:
                r0 = r2
            L_0x0011:
                r1 = 0
                if (r0 == 0) goto L_0x001e
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r3 = r5.f159696d
                r0.setMargins(r1, r1, r1, r1)
                android.widget.TextView r3 = r3.f159691x
                r3.setLayoutParams(r0)
            L_0x001e:
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159696d
                android.widget.TextView r0 = r0.f159691x
                r3 = 1
                r4 = 1097859072(0x41700000, float:15.0)
                r0.setTextSize(r3, r4)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159696d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r3 = r0.f159690w
                android.content.Context r0 = r0.getContext()
                r4 = 4
                int r0 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r0, r4)
                r3.mo154682a(r0)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159696d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r0.f159690w
                android.content.Context r3 = r5.f159697e
                r4 = 2131232514(0x7f080702, float:1.808114E38)
                android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
                r0.setThumb(r3)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159696d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r0.f159690w
                r0.invalidate()
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159696d
                r0.mo77867f()
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159696d
                android.widget.ImageView r0 = r0.f159692y
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                boolean r3 = r0 instanceof android.widget.RelativeLayout.LayoutParams
                if (r3 == 0) goto L_0x0063
                r2 = r0
                android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            L_0x0063:
                if (r2 == 0) goto L_0x0078
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159696d
                android.content.Context r3 = r0.getContext()
                r4 = 8
                int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r4)
                r2.width = r3
                android.widget.ImageView r0 = r0.f159692y
                r0.setLayoutParams(r2)
            L_0x0078:
                if (r6 == 0) goto L_0x0088
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r0 = r5.f159696d
                int r2 = r6.getProgress()
                int r6 = r6.getMax()
                int r1 = com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView.m63968b(r0, r2, r1, r6)
            L_0x0088:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "#onStopTrackingTouch progress="
                r6.append(r0)
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "Finder.FinderLiveCameraOptMakeupView"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView r6 = r5.f159696d
                w50.h$b r0 = r6.f159675e
                if (r0 == 0) goto L_0x00b1
                fy3.p r6 = r6.getOnFilterSeekDone()
                if (r6 == 0) goto L_0x00b1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r6.invoke(r0, r1)
            L_0x00b1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView.C56006b.onStopTrackingTouch(android.widget.SeekBar):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView$c */
    public final class C56007c extends RecyclerView.C16613e<C56008d> {
        public C56007c() {
            C76577a.m92151b(MMApplicationContext.getContext(), 4);
        }

        public int getItemCount() {
            return FinderLiveCameraOptMakeupView.this.getEffectItems().size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2 = i;
            C56008d dVar = (C56008d) zVar;
            C87412m.m108594g(dVar, "holder");
            if (i2 >= 0 && i2 < FinderLiveCameraOptMakeupView.this.getEffectItems().size()) {
                int i3 = 32;
                int a = C74942w4.m89784a(dVar.f159704z.getContext(), i2 == 0 ? 32 : 24);
                Context context = dVar.f159704z.getContext();
                boolean z = true;
                if (i2 != FinderLiveCameraOptMakeupView.this.getEffectItems().size() - 1) {
                    i3 = 0;
                }
                int a2 = C74942w4.m89784a(context, i3);
                ViewGroup.LayoutParams layoutParams = dVar.f159702D.getLayoutParams();
                RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.setMargins(a, 0, a2, 0);
                }
                C65933h.C65935b bVar = FinderLiveCameraOptMakeupView.this.getEffectItems().get(i2);
                dVar.f159699A.setText(bVar.f189557b);
                dVar.f159700B.setBackground(FinderLiveCameraOptMakeupView.this.getContext().getResources().getDrawable(bVar.f189558c));
                FinderLiveCameraOptMakeupView finderLiveCameraOptMakeupView = FinderLiveCameraOptMakeupView.this;
                C65933h.C65935b bVar2 = finderLiveCameraOptMakeupView.f159675e;
                boolean z2 = bVar2 != null && bVar2.f189556a == bVar.f189556a;
                int color = finderLiveCameraOptMakeupView.getContext().getResources().getColor(z2 ? C0966R.color.BW_100_Alpha_0_9 : C0966R.color.BW_100_Alpha_0_6);
                dVar.f159699A.setTextColor(color);
                dVar.f159701C.setBackgroundColor(color);
                if (!FinderLiveCameraOptMakeupView.this.mo77865d(bVar, (Integer) null) || !FinderLiveCameraOptMakeupView.this.mo77864c(bVar, (Integer) null)) {
                    z = false;
                }
                View view = dVar.f159701C;
                int i4 = z ? 8 : 0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i4));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptMakeupView$MakeupAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptMakeupView$MakeupViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptMakeupView$MakeupAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptMakeupView$MakeupViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = dVar.f159703E;
                int i5 = z2 ? 0 : 4;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(Integer.valueOf(i5));
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptMakeupView$MakeupAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptMakeupView$MakeupViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptMakeupView$MakeupAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptMakeupView$MakeupViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                dVar.f44854d.setOnClickListener(new C56056c0(FinderLiveCameraOptMakeupView.this, i2));
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.cmh, (ViewGroup) null);
            C87412m.m108593f(inflate, "inflate(\n               …   null\n                )");
            return new C56008d(inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView$d */
    public static final class C56008d extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f159699A;

        /* renamed from: B */
        public final View f159700B;

        /* renamed from: C */
        public final View f159701C;

        /* renamed from: D */
        public final View f159702D;

        /* renamed from: E */
        public final View f159703E;

        /* renamed from: z */
        public final View f159704z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56008d(View view) {
            super(view);
            C87412m.m108594g(view, "mItemView");
            this.f159704z = view;
            View findViewById = view.findViewById(C0966R.C0970id.m08);
            C87412m.m108593f(findViewById, "mItemView.findViewById(R…ra_opt_makeup_item_title)");
            this.f159699A = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.nua);
            C87412m.m108593f(findViewById2, "mItemView.findViewById(R…_opt_makeup_item_root_bg)");
            this.f159700B = findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.nu9);
            C87412m.m108593f(findViewById3, "mItemView.findViewById(R…_makeup_item_changed_tag)");
            this.f159701C = findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.nu_);
            C87412m.m108593f(findViewById4, "mItemView.findViewById(R…era_opt_makeup_item_root)");
            this.f159702D = findViewById4;
            View findViewById5 = view.findViewById(C0966R.C0970id.m07);
            C87412m.m108593f(findViewById5, "mItemView.findViewById(R…_makeup_item_select_mark)");
            this.f159703E = findViewById5;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView$launchDismissValueJob1$1", mo125469f = "FinderLiveCameraOptMakeupView.kt", mo125470l = {566}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView$e */
    public static final class C56009e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f159705d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveCameraOptMakeupView f159706e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56009e(FinderLiveCameraOptMakeupView finderLiveCameraOptMakeupView, C15601d<? super C56009e> dVar) {
            super(2, dVar);
            this.f159706e = finderLiveCameraOptMakeupView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C56009e(this.f159706e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C56009e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f159705d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f159705d = 1;
                if (C53965x0.m60607b(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f159706e.f159687t.setVisibility(4);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView$launchDismissValueJob2$1", mo125469f = "FinderLiveCameraOptMakeupView.kt", mo125470l = {574}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView$f */
    public static final class C56010f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f159707d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveCameraOptMakeupView f159708e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56010f(FinderLiveCameraOptMakeupView finderLiveCameraOptMakeupView, C15601d<? super C56010f> dVar) {
            super(2, dVar);
            this.f159708e = finderLiveCameraOptMakeupView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C56010f(this.f159708e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C56010f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f159707d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f159707d = 1;
                if (C53965x0.m60607b(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f159708e.f159691x.setVisibility(4);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveCameraOptMakeupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: b */
    public static final int m63968b(FinderLiveCameraOptMakeupView finderLiveCameraOptMakeupView, int i, boolean z, int i2) {
        Number number;
        finderLiveCameraOptMakeupView.getClass();
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

    /* access modifiers changed from: private */
    public final void setSelectedMakeup(C65933h.C65935b bVar) {
        Log.m105924i("Finder.FinderLiveCameraOptMakeupView", "#selectedMakeup set " + bVar);
        this.f159675e = bVar;
        this.f159674d.notifyDataSetChanged();
        mo77879h();
        this.f159687t.setVisibility(0);
        mo77866e();
        this.f159691x.setVisibility(0);
        mo77867f();
        C65933h.C65935b bVar2 = this.f159675e;
        if (bVar2 != null) {
            C32226l<? super C65933h.C65935b, Integer> lVar = this.f159677g;
            if (lVar != null) {
                int intValue = lVar.invoke(bVar2).intValue();
                Log.m105924i("Finder.FinderLiveCameraOptMakeupView", "#selectedEffect set onRequestSeekByKey " + intValue);
                BothSidesSeekBar bothSidesSeekBar = this.f159686s;
                bothSidesSeekBar.setProgress(mo77882k(intValue, false, bothSidesSeekBar.getMax()));
                int progress = bothSidesSeekBar.getProgress();
                BothSidesSeekBar bothSidesSeekBar2 = this.f159686s;
                bothSidesSeekBar2.post(new C56058f0(bothSidesSeekBar2, this.f159687t, progress, this));
            }
            C32226l<? super C65933h.C65935b, Integer> lVar2 = this.f159678h;
            if (lVar2 != null) {
                int intValue2 = lVar2.invoke(bVar2).intValue();
                Log.m105924i("Finder.FinderLiveCameraOptMakeupView", "#selectedEffect set onRequestSeekByKey " + intValue2);
                BothSidesSeekBar bothSidesSeekBar3 = this.f159690w;
                bothSidesSeekBar3.setProgress(mo77882k(intValue2, false, bothSidesSeekBar3.getMax()));
                int progress2 = bothSidesSeekBar3.getProgress();
                BothSidesSeekBar bothSidesSeekBar4 = this.f159690w;
                bothSidesSeekBar4.post(new C56058f0(bothSidesSeekBar4, this.f159691x, progress2, this));
            }
            C32227p<? super Integer, ? super Integer, Integer> pVar = this.f159679i;
            if (pVar != null) {
                int intValue3 = pVar.invoke(Integer.valueOf(bVar2.f189556a), 1).intValue();
                post(new C3212e0(this.f159686s, this.f159688u, mo77882k(intValue3, false, this.f159686s.getMax())));
                post(new C3212e0(this.f159690w, this.f159692y, mo77882k(intValue3, false, this.f159690w.getMax())));
            }
            C32227p<? super Integer, ? super Integer, Integer> pVar2 = this.f159679i;
            if (pVar2 != null) {
                post(new C3212e0(this.f159690w, this.f159692y, mo77882k(pVar2.invoke(Integer.valueOf(bVar2.f189556a), 2).intValue(), false, this.f159690w.getMax())));
            }
            if (bVar2.f189556a == 0) {
                this.f159685r.setVisibility(4);
                this.f159689v.setVisibility(4);
                return;
            }
            this.f159685r.setVisibility(0);
            this.f159689v.setVisibility(0);
        }
    }

    /* renamed from: c */
    public final boolean mo77864c(C65933h.C65935b bVar, Integer num) {
        Integer num2 = null;
        if (num == null) {
            C32226l<? super C65933h.C65935b, Integer> lVar = this.f159678h;
            num = lVar != null ? lVar.invoke(bVar) : null;
        }
        C32227p<? super Integer, ? super Integer, Integer> pVar = this.f159679i;
        if (pVar != null) {
            num2 = pVar.invoke(Integer.valueOf(bVar.f189556a), 2);
        }
        return C87412m.m108589b(num2, num);
    }

    /* renamed from: d */
    public final boolean mo77865d(C65933h.C65935b bVar, Integer num) {
        Integer num2 = null;
        if (num == null) {
            C32226l<? super C65933h.C65935b, Integer> lVar = this.f159677g;
            num = lVar != null ? lVar.invoke(bVar) : null;
        }
        C32227p<? super Integer, ? super Integer, Integer> pVar = this.f159679i;
        if (pVar != null) {
            num2 = pVar.invoke(Integer.valueOf(bVar.f189556a), 1);
        }
        return C87412m.m108589b(num2, num);
    }

    /* renamed from: e */
    public final void mo77866e() {
        C55908a aVar;
        FinderLiveService.f159376d.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        C53973z1 z1Var = null;
        if (!(bVar == null || (aVar = bVar.f123702i) == null)) {
            C53896h0 h0Var = C53872d1.f151117a;
            z1Var = C53895h.m60466d(aVar, C58901s.f168555a, (C53934p0) null, new C56009e(this, (C15601d<? super C56009e>) null), 2, (Object) null);
        }
        this.f159693z = z1Var;
    }

    /* renamed from: f */
    public final void mo77867f() {
        C55908a aVar;
        FinderLiveService.f159376d.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        C53973z1 z1Var = null;
        if (!(bVar == null || (aVar = bVar.f123702i) == null)) {
            C53896h0 h0Var = C53872d1.f151117a;
            z1Var = C53895h.m60466d(aVar, C58901s.f168555a, (C53934p0) null, new C56010f(this, (C15601d<? super C56010f>) null), 2, (Object) null);
        }
        this.f159669A = z1Var;
    }

    /* renamed from: g */
    public final void mo77868g() {
        Log.m105924i("Finder.FinderLiveCameraOptMakeupView", "#reload");
        setSelectedMakeup(this.f159675e);
    }

    public final BothSidesSeekBar getBar1() {
        return this.f159686s;
    }

    public final List<C65933h.C65935b> getEffectItems() {
        return this.f159676f;
    }

    public final C32227p<C65933h.C65935b, Integer, C13598b0> getOnFilterSeekChanging() {
        return this.f159683p;
    }

    public final C32227p<C65933h.C65935b, Integer, C13598b0> getOnFilterSeekDone() {
        return this.f159684q;
    }

    public final C32227p<C65933h.C65935b, Integer, C13598b0> getOnMakeupSeekChanging() {
        return this.f159681n;
    }

    public final C32227p<C65933h.C65935b, Integer, C13598b0> getOnMakeupSeekDone() {
        return this.f159682o;
    }

    public final C32226l<C65933h.C65935b, C13598b0> getOnMakeupSuitChanged() {
        return this.f159680j;
    }

    public final C32227p<Integer, Integer, Integer> getOnRequestDefaultSeekByKey() {
        return this.f159679i;
    }

    public final C32226l<C65933h.C65935b, Integer> getOnRequestFilterSeekByKey() {
        return this.f159678h;
    }

    public final C32226l<C65933h.C65935b, Integer> getOnRequestMakeupSeekByKey() {
        return this.f159677g;
    }

    /* renamed from: h */
    public final void mo77879h() {
        C53973z1 z1Var = this.f159693z;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C53973z1 z1Var2 = this.f159669A;
        if (z1Var2 != null) {
            C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: i */
    public final void mo77880i() {
        C32226l<? super C65933h.C65935b, C13598b0> lVar;
        int P = C110818d0.m150918P(this.f159676f, this.f159675e);
        if (P > 0) {
            setSelectedMakeup((C65933h.C65935b) ((ArrayList) this.f159676f).get(P - 1));
        }
        C65933h.C65935b bVar = this.f159675e;
        if (bVar != null && (lVar = this.f159680j) != null) {
            lVar.invoke(bVar);
        }
    }

    /* renamed from: j */
    public final void mo77881j() {
        C32226l<? super C65933h.C65935b, C13598b0> lVar;
        int P = C110818d0.m150918P(this.f159676f, this.f159675e);
        if (P < ((ArrayList) this.f159676f).size() - 1) {
            setSelectedMakeup((C65933h.C65935b) ((ArrayList) this.f159676f).get(P + 1));
        }
        C65933h.C65935b bVar = this.f159675e;
        if (bVar != null && (lVar = this.f159680j) != null) {
            lVar.invoke(bVar);
        }
    }

    /* renamed from: k */
    public final int mo77882k(int i, boolean z, int i2) {
        float f = (float) i2;
        float f2 = f / 2.0f;
        if (z) {
            float f3 = f2 / 100.0f;
            if (i != 0) {
                f2 += ((float) i) * f3;
            }
        } else {
            f2 = (f / 100.0f) * ((float) i);
        }
        return (int) f2;
    }

    /* renamed from: l */
    public final void mo77883l(C65933h.C65935b bVar) {
        C87412m.m108594g(bVar, "m");
        Log.m105924i("Finder.FinderLiveCameraOptMakeupView", "#updateMakeup m=" + bVar);
        setSelectedMakeup(bVar);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo77879h();
    }

    public final void setBar1(BothSidesSeekBar bothSidesSeekBar) {
        C87412m.m108594g(bothSidesSeekBar, "<set-?>");
        this.f159686s = bothSidesSeekBar;
    }

    public final void setEffectItems(List<C65933h.C65935b> list) {
        C87412m.m108594g(list, "value");
        ((ArrayList) this.f159676f).clear();
        ((ArrayList) this.f159676f).addAll(list);
        if (this.f159675e == null) {
            setSelectedMakeup((C65933h.C65935b) C110818d0.m150916N(this.f159676f));
        }
        this.f159674d.notifyDataSetChanged();
    }

    public final void setOnFilterSeekChanging(C32227p<? super C65933h.C65935b, ? super Integer, C13598b0> pVar) {
        this.f159683p = pVar;
    }

    public final void setOnFilterSeekDone(C32227p<? super C65933h.C65935b, ? super Integer, C13598b0> pVar) {
        this.f159684q = pVar;
    }

    public final void setOnMakeupSeekChanging(C32227p<? super C65933h.C65935b, ? super Integer, C13598b0> pVar) {
        this.f159681n = pVar;
    }

    public final void setOnMakeupSeekDone(C32227p<? super C65933h.C65935b, ? super Integer, C13598b0> pVar) {
        this.f159682o = pVar;
    }

    public final void setOnMakeupSuitChanged(C32226l<? super C65933h.C65935b, C13598b0> lVar) {
        this.f159680j = lVar;
    }

    public final void setOnRequestDefaultSeekByKey(C32227p<? super Integer, ? super Integer, Integer> pVar) {
        this.f159679i = pVar;
    }

    public final void setOnRequestFilterSeekByKey(C32226l<? super C65933h.C65935b, Integer> lVar) {
        this.f159678h = lVar;
    }

    public final void setOnRequestMakeupSeekByKey(C32226l<? super C65933h.C65935b, Integer> lVar) {
        this.f159677g = lVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveCameraOptMakeupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C56007c cVar = new C56007c();
        this.f159674d = cVar;
        this.f159676f = new ArrayList();
        this.f159670B = context.getSystemService("vibrator");
        this.f159672D = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3766df);
        this.f159673E = (C76577a.m92145A(context) / 2) - C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3745cw);
        View.inflate(context, C0966R.C0971layout.cna, this);
        View findViewById = findViewById(C0966R.C0970id.dfz);
        C87412m.m108593f(findViewById, "findViewById<RecyclerVie…owerful_panel_details_rv)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f159671C = recyclerView;
        recyclerView.setAdapter(cVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        View findViewById2 = findViewById(C0966R.C0970id.miw);
        C87412m.m108593f(findViewById2, "findViewById(R.id.progress_layout_1)");
        this.f159685r = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.m0o);
        C87412m.m108593f(findViewById3, "findViewById(R.id.finder…panel_details_seek_bar_1)");
        this.f159686s = (BothSidesSeekBar) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.m0q);
        C87412m.m108593f(findViewById4, "findViewById(R.id.finder…_details_seek_value_tv_1)");
        this.f159687t = (TextView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.m0m);
        C87412m.m108593f(findViewById5, "findViewById(R.id.finder…l_details_default_icon_1)");
        this.f159688u = (ImageView) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.mix);
        C87412m.m108593f(findViewById6, "findViewById(R.id.progress_layout_2)");
        this.f159689v = (LinearLayout) findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.m0p);
        C87412m.m108593f(findViewById7, "findViewById(R.id.finder…panel_details_seek_bar_2)");
        this.f159690w = (BothSidesSeekBar) findViewById7;
        View findViewById8 = findViewById(C0966R.C0970id.m0r);
        C87412m.m108593f(findViewById8, "findViewById(R.id.finder…_details_seek_value_tv_2)");
        this.f159691x = (TextView) findViewById8;
        View findViewById9 = findViewById(C0966R.C0970id.m0n);
        C87412m.m108593f(findViewById9, "findViewById(R.id.finder…l_details_default_icon_2)");
        this.f159692y = (ImageView) findViewById9;
        this.f159686s.setOnSeekBarChangeListener(new C56005a(this, context));
        this.f159690w.setOnSeekBarChangeListener(new C56006b(this, context));
    }
}
