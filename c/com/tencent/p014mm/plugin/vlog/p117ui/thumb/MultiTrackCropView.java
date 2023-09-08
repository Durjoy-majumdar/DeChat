package com.tencent.p014mm.plugin.vlog.p117ui.thumb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.coremedia.CMTimeRange;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;
import sp3.C110801c;
import sp3.C110807k;
import sx3.C36907w;
import sx3.C64197v;
import u23.C111113c;
import u23.C111124h;
import u23.C111127k;
import u23.C14107d;
import u23.C65004e;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001+B!\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)B\u001b\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b(\u0010*J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006,"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView;", "Landroid/widget/FrameLayout;", "", "", "enable", "Lrx3/b0;", "setEnableLengthEdit", "Lsp3/k;", "composition", "setTrack", "Lcom/tencent/mm/plugin/vlog/model/p0;", "", "timeMs", "setProgress", "Ljava/util/LinkedList;", "Lu23/k;", "D", "Ljava/util/LinkedList;", "getTrackList", "()Ljava/util/LinkedList;", "trackList", "Lcom/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$a;", "E", "Lcom/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$a;", "getCallback", "()Lcom/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$a;", "setCallback", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$a;)V", "callback", "getSourceDuration", "()J", "sourceDuration", "getCutDuration", "cutDuration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView */
public final class MultiTrackCropView extends FrameLayout implements C111847h {

    /* renamed from: A */
    public final C111127k f316882A;

    /* renamed from: B */
    public final C111127k f316883B;

    /* renamed from: C */
    public Runnable f316884C;

    /* renamed from: D */
    public final LinkedList<C111127k> f316885D;

    /* renamed from: E */
    public C106270a f316886E;

    /* renamed from: F */
    public final long f316887F;

    /* renamed from: G */
    public final Runnable f316888G;

    /* renamed from: d */
    public MultiTrackRecyclerView f316889d;

    /* renamed from: e */
    public LinearLayoutManager f316890e;

    /* renamed from: f */
    public C111113c f316891f;

    /* renamed from: g */
    public int f316892g;

    /* renamed from: h */
    public int f316893h;

    /* renamed from: i */
    public int f316894i;

    /* renamed from: j */
    public int f316895j;

    /* renamed from: n */
    public long f316896n;

    /* renamed from: o */
    public long f316897o;

    /* renamed from: p */
    public int f316898p;

    /* renamed from: q */
    public MotionEvent f316899q;

    /* renamed from: r */
    public boolean f316900r;

    /* renamed from: s */
    public boolean f316901s;

    /* renamed from: t */
    public long f316902t;

    /* renamed from: u */
    public boolean f316903u;

    /* renamed from: v */
    public boolean f316904v;

    /* renamed from: w */
    public boolean f316905w;

    /* renamed from: x */
    public final int f316906x;

    /* renamed from: y */
    public final int f316907y;

    /* renamed from: z */
    public final int f316908z;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView$a */
    public interface C106270a {
        /* renamed from: a */
        void mo152338a(int i, boolean z, long j, long j2);

        /* renamed from: b */
        void mo152339b(int i, boolean z, long j, long j2);

        /* renamed from: c */
        void mo152340c(int i, boolean z, long j, long j2);

        void pause();

        void seekTo(long j);
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView$b */
    public static final class C106271b extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ MultiTrackCropView f316909d;

        public C106271b(MultiTrackCropView multiTrackCropView) {
            this.f316909d = multiTrackCropView;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$onFinishInflate$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            Log.m105924i("MicroMsg.MultiTrackCropView", "onScrollStateChanged: " + i);
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f316909d.f316904v) {
                Log.m105924i("MicroMsg.MultiTrackCropView", "onScrollStateChanged: SCROLL_STATE_IDLE");
                MultiTrackCropView multiTrackCropView = this.f316909d;
                multiTrackCropView.f316904v = false;
                multiTrackCropView.f316903u = true;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$onFinishInflate$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$onFinishInflate$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.f316909d.f316898p += i;
            Log.m105918d("MicroMsg.MultiTrackCropView", "onScrolled, scrolled:" + this.f316909d.f316898p + ", dx:" + i);
            MultiTrackCropView multiTrackCropView = this.f316909d;
            if (!multiTrackCropView.f316903u && !multiTrackCropView.f316900r && !multiTrackCropView.f316905w) {
                long j = multiTrackCropView.f316897o;
                long j2 = multiTrackCropView.f316896n;
                long j3 = (((j - j2) * ((long) (multiTrackCropView.f316898p - multiTrackCropView.f316895j))) / ((long) multiTrackCropView.f316894i)) + j2;
                Log.m105918d("MicroMsg.MultiTrackCropView", "onScrolled, seekTo:" + j3);
                C106270a callback = this.f316909d.getCallback();
                if (callback != null) {
                    callback.seekTo(j3);
                }
            }
            MultiTrackCropView multiTrackCropView2 = this.f316909d;
            if (!multiTrackCropView2.f316905w) {
                MultiTrackCropView.m143007a(multiTrackCropView2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$onFinishInflate$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView$c */
    public static final class C106272c extends RecyclerView.C0131u {
        /* renamed from: e */
        public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
            C87412m.m108594g(recyclerView, "rv");
            C87412m.m108594g(motionEvent, "e");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView$d */
    public static final class C106273d implements C111113c.C111118d {

        /* renamed from: a */
        public final /* synthetic */ MultiTrackCropView f316910a;

        public C106273d(MultiTrackCropView multiTrackCropView) {
            this.f316910a = multiTrackCropView;
        }

        /* renamed from: a */
        public void mo152343a(int i, int i2, boolean z) {
            MultiTrackCropView multiTrackCropView = this.f316910a;
            multiTrackCropView.f316905w = false;
            multiTrackCropView.mo152327c(false);
            MultiTrackCropView.m143007a(this.f316910a);
            MultiTrackCropView multiTrackCropView2 = this.f316910a;
            multiTrackCropView2.f316900r = true;
            MultiTrackRecyclerView multiTrackRecyclerView = multiTrackCropView2.f316889d;
            if (multiTrackRecyclerView != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                MultiTrackRecyclerView multiTrackRecyclerView2 = this.f316910a.f316889d;
                if (multiTrackRecyclerView2 != null) {
                    multiTrackRecyclerView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(multiTrackRecyclerView2.getHeight(), 1073741824));
                    MultiTrackRecyclerView multiTrackRecyclerView3 = this.f316910a.f316889d;
                    if (multiTrackRecyclerView3 == null) {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    } else if (multiTrackRecyclerView3 != null) {
                        int width = multiTrackRecyclerView3.getWidth();
                        MultiTrackRecyclerView multiTrackRecyclerView4 = this.f316910a.f316889d;
                        if (multiTrackRecyclerView4 != null) {
                            multiTrackRecyclerView3.layout(0, 0, width, multiTrackRecyclerView4.getHeight());
                            StringBuilder sb = new StringBuilder();
                            sb.append("onTapUp, position:");
                            int i3 = i - 1;
                            sb.append(i3);
                            sb.append(", left:");
                            sb.append(z);
                            sb.append(", startTimeMs:");
                            sb.append(this.f316910a.getTrackList().get(i).f187124d);
                            sb.append(", endTimeMs:");
                            sb.append(this.f316910a.getTrackList().get(i).f187125e);
                            Log.m105918d("MicroMsg.MultiTrackCropView", sb.toString());
                            C106270a callback = this.f316910a.getCallback();
                            if (callback != null) {
                                callback.mo152340c(i3, z, this.f316910a.getTrackList().get(i).f187124d, this.f316910a.getTrackList().get(i).f187125e);
                            }
                            MultiTrackCropView multiTrackCropView3 = this.f316910a;
                            multiTrackCropView3.removeCallbacks(multiTrackCropView3.f316888G);
                            return;
                        }
                        C87412m.m108603p("recyclerView");
                        throw null;
                    } else {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }

        /* renamed from: b */
        public void mo152344b(int i, int i2, boolean z, float f) {
            boolean z2;
            int i3 = i;
            boolean z3 = z;
            C111127k kVar = this.f316910a.getTrackList().get(i3);
            C87412m.m108593f(kVar, "trackList[position]");
            C111127k kVar2 = kVar;
            if (z3) {
                Log.m105918d("MicroMsg.MultiTrackCropView", "onMove, left:" + z3 + ", seekTo:" + (kVar2.f187130j + ((long) (((float) kVar2.f187124d) / kVar2.f332732n.f316501l.f331468f))));
                C106270a callback = this.f316910a.getCallback();
                if (callback != null) {
                    callback.seekTo(kVar2.f187130j + ((long) (((float) kVar2.f187124d) / kVar2.f332732n.f316501l.f331468f)));
                }
                MultiTrackRecyclerView multiTrackRecyclerView = this.f316910a.f316889d;
                if (multiTrackRecyclerView != null) {
                    multiTrackRecyclerView.scrollBy(-i2, 0);
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                Log.m105918d("MicroMsg.MultiTrackCropView", "onMove, left:" + z3 + ", seekTo:" + (kVar2.f187130j + ((long) (((float) (kVar2.f187125e - kVar2.f187124d)) / kVar2.f332732n.f316501l.f331468f))));
                C106270a callback2 = this.f316910a.getCallback();
                if (callback2 != null) {
                    callback2.seekTo(kVar2.f187130j + ((long) (((float) (kVar2.f187125e - kVar2.f187124d)) / kVar2.f332732n.f316501l.f331468f)));
                }
            }
            C106270a callback3 = this.f316910a.getCallback();
            if (callback3 != null) {
                callback3.mo152339b(i3 - 1, z, this.f316910a.getTrackList().get(i3).f187124d, this.f316910a.getTrackList().get(i3).f187125e);
            }
            MultiTrackCropView multiTrackCropView = this.f316910a;
            boolean z4 = true;
            if (f > ((float) (multiTrackCropView.f316906x - multiTrackCropView.f316907y))) {
                MultiTrackRecyclerView multiTrackRecyclerView2 = multiTrackCropView.f316889d;
                if (multiTrackRecyclerView2 != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    MultiTrackRecyclerView multiTrackRecyclerView3 = this.f316910a.f316889d;
                    if (multiTrackRecyclerView3 != null) {
                        multiTrackRecyclerView2.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(multiTrackRecyclerView3.getHeight(), 1073741824));
                        MultiTrackRecyclerView multiTrackRecyclerView4 = this.f316910a.f316889d;
                        if (multiTrackRecyclerView4 == null) {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        } else if (multiTrackRecyclerView4 != null) {
                            int width = multiTrackRecyclerView4.getWidth();
                            MultiTrackRecyclerView multiTrackRecyclerView5 = this.f316910a.f316889d;
                            if (multiTrackRecyclerView5 != null) {
                                multiTrackRecyclerView4.layout(0, 0, width, multiTrackRecyclerView5.getHeight());
                                MultiTrackCropView multiTrackCropView2 = this.f316910a;
                                MultiTrackRecyclerView multiTrackRecyclerView6 = multiTrackCropView2.f316889d;
                                if (multiTrackRecyclerView6 != null) {
                                    multiTrackRecyclerView6.scrollBy((int) (f - ((float) (multiTrackCropView2.f316906x - multiTrackCropView2.f316907y))), 0);
                                    z2 = true;
                                } else {
                                    C87412m.m108603p("recyclerView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("recyclerView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                z2 = false;
            }
            MultiTrackCropView multiTrackCropView3 = this.f316910a;
            if (f < ((float) (multiTrackCropView3.f316908z + multiTrackCropView3.f316907y))) {
                MultiTrackRecyclerView multiTrackRecyclerView7 = multiTrackCropView3.f316889d;
                if (multiTrackRecyclerView7 != null) {
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    MultiTrackRecyclerView multiTrackRecyclerView8 = this.f316910a.f316889d;
                    if (multiTrackRecyclerView8 != null) {
                        multiTrackRecyclerView7.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(multiTrackRecyclerView8.getHeight(), 1073741824));
                        MultiTrackRecyclerView multiTrackRecyclerView9 = this.f316910a.f316889d;
                        if (multiTrackRecyclerView9 == null) {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        } else if (multiTrackRecyclerView9 != null) {
                            int width2 = multiTrackRecyclerView9.getWidth();
                            MultiTrackRecyclerView multiTrackRecyclerView10 = this.f316910a.f316889d;
                            if (multiTrackRecyclerView10 != null) {
                                multiTrackRecyclerView9.layout(0, 0, width2, multiTrackRecyclerView10.getHeight());
                                MultiTrackCropView multiTrackCropView4 = this.f316910a;
                                MultiTrackRecyclerView multiTrackRecyclerView11 = multiTrackCropView4.f316889d;
                                if (multiTrackRecyclerView11 != null) {
                                    multiTrackRecyclerView11.scrollBy((int) ((f - ((float) multiTrackCropView4.f316908z)) - ((float) multiTrackCropView4.f316907y)), 0);
                                } else {
                                    C87412m.m108603p("recyclerView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("recyclerView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                z4 = z2;
            }
            if (z4) {
                MultiTrackCropView multiTrackCropView5 = this.f316910a;
                multiTrackCropView5.removeCallbacks(multiTrackCropView5.f316888G);
                MultiTrackCropView multiTrackCropView6 = this.f316910a;
                multiTrackCropView6.postDelayed(multiTrackCropView6.f316888G, multiTrackCropView6.f316887F);
            }
        }

        /* renamed from: c */
        public void mo152345c(int i, int i2, boolean z) {
            MultiTrackCropView multiTrackCropView = this.f316910a;
            multiTrackCropView.f316905w = true;
            MultiTrackRecyclerView multiTrackRecyclerView = multiTrackCropView.f316889d;
            if (multiTrackRecyclerView != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                MultiTrackRecyclerView multiTrackRecyclerView2 = this.f316910a.f316889d;
                if (multiTrackRecyclerView2 != null) {
                    multiTrackRecyclerView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(multiTrackRecyclerView2.getHeight(), 1073741824));
                    MultiTrackRecyclerView multiTrackRecyclerView3 = this.f316910a.f316889d;
                    if (multiTrackRecyclerView3 == null) {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    } else if (multiTrackRecyclerView3 != null) {
                        int width = multiTrackRecyclerView3.getWidth();
                        MultiTrackRecyclerView multiTrackRecyclerView4 = this.f316910a.f316889d;
                        if (multiTrackRecyclerView4 != null) {
                            multiTrackRecyclerView3.layout(0, 0, width, multiTrackRecyclerView4.getHeight());
                            if (z) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("onTapDown, position:");
                                int i3 = i - 1;
                                sb.append(i3);
                                sb.append(", left:");
                                sb.append(z);
                                sb.append(", startTimeMs:0, endTimeMs:");
                                sb.append(this.f316910a.getTrackList().get(i).f187125e);
                                Log.m105918d("MicroMsg.MultiTrackCropView", sb.toString());
                                C106270a callback = this.f316910a.getCallback();
                                if (callback != null) {
                                    callback.mo152338a(i3, z, 0, this.f316910a.getTrackList().get(i).f187125e);
                                    return;
                                }
                                return;
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("onTapDown, position:");
                            int i4 = i - 1;
                            sb4.append(i4);
                            sb4.append(", left:");
                            sb4.append(z);
                            sb4.append(", startTimeMs:");
                            sb4.append(this.f316910a.getTrackList().get(i).f187124d);
                            sb4.append(", endTimeMs:");
                            sb4.append(this.f316910a.getTrackList().get(i).mo88221d());
                            Log.m105918d("MicroMsg.MultiTrackCropView", sb4.toString());
                            C106270a callback2 = this.f316910a.getCallback();
                            if (callback2 != null) {
                                callback2.mo152338a(i4, z, this.f316910a.getTrackList().get(i).f187124d, this.f316910a.getTrackList().get(i).mo88221d());
                                return;
                            }
                            return;
                        }
                        C87412m.m108603p("recyclerView");
                        throw null;
                    } else {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView$e */
    public static final class C106274e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MultiTrackCropView f316911d;

        public C106274e(MultiTrackCropView multiTrackCropView) {
            this.f316911d = multiTrackCropView;
        }

        public final void run() {
            Log.m105918d("MicroMsg.MultiTrackCropView", "replayLastMoveEvent, lastMoveEvent:" + this.f316911d.f316899q);
            MultiTrackCropView multiTrackCropView = this.f316911d;
            multiTrackCropView.dispatchTouchEvent(multiTrackCropView.f316899q);
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView$f */
    public static final class C106275f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f316912d;

        /* renamed from: e */
        public final /* synthetic */ MultiTrackCropView f316913e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106275f(long j, MultiTrackCropView multiTrackCropView) {
            super(0);
            this.f316912d = j;
            this.f316913e = multiTrackCropView;
        }

        public Object invoke() {
            Log.m105918d("MicroMsg.MultiTrackCropView", "setProgress: " + this.f316912d);
            MultiTrackCropView multiTrackCropView = this.f316913e;
            if (multiTrackCropView.f316901s) {
                long j = this.f316912d;
                if (j != 0) {
                    long j2 = multiTrackCropView.f316902t;
                    long j3 = (long) 100;
                    if (j < j2 - j3 || j > j2 + j3) {
                        Log.m105918d("MicroMsg.MultiTrackCropView", "waitForProgress, waitProgress:" + this.f316913e.f316902t + ", timeMs:" + this.f316912d + ", fail");
                        return C13598b0.f38549a;
                    }
                }
                Log.m105918d("MicroMsg.MultiTrackCropView", "waitForProgress, waitProgress:" + this.f316913e.f316902t + ", timeMs:" + this.f316912d + ", pass");
                this.f316913e.f316901s = false;
            }
            MultiTrackCropView multiTrackCropView2 = this.f316913e;
            if (multiTrackCropView2.f316903u && !multiTrackCropView2.f316900r) {
                long j4 = this.f316912d;
                long j5 = multiTrackCropView2.f316896n;
                if (j4 == j5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("setProgress, timeMs == playStart == ");
                    sb.append(this.f316913e.f316896n);
                    sb.append(", scrolled:");
                    sb.append(this.f316913e.f316898p);
                    sb.append(", scrollBy");
                    MultiTrackCropView multiTrackCropView3 = this.f316913e;
                    sb.append((-multiTrackCropView3.f316898p) + multiTrackCropView3.f316895j);
                    Log.m105918d("MicroMsg.MultiTrackCropView", sb.toString());
                    MultiTrackCropView multiTrackCropView4 = this.f316913e;
                    MultiTrackRecyclerView multiTrackRecyclerView = multiTrackCropView4.f316889d;
                    if (multiTrackRecyclerView != null) {
                        multiTrackRecyclerView.scrollBy((-multiTrackCropView4.f316898p) + multiTrackCropView4.f316895j, 0);
                    } else {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                } else {
                    int i = multiTrackCropView2.f316895j + ((int) ((((float) ((j4 - j5) * ((long) multiTrackCropView2.f316894i))) * 1.0f) / ((float) (multiTrackCropView2.f316897o - j5))));
                    MultiTrackRecyclerView multiTrackRecyclerView2 = multiTrackCropView2.f316889d;
                    if (multiTrackRecyclerView2 != null) {
                        multiTrackRecyclerView2.mo17122s1(i - multiTrackCropView2.f316898p, 0, (Interpolator) null);
                    } else {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView$g */
    public static final class C106276g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MultiTrackCropView f316914d;

        /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView$g$a */
        public static final class C106277a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MultiTrackCropView f316915d;

            public C106277a(MultiTrackCropView multiTrackCropView) {
                this.f316915d = multiTrackCropView;
            }

            public final void run() {
                MultiTrackCropView multiTrackCropView = this.f316915d;
                MultiTrackRecyclerView multiTrackRecyclerView = multiTrackCropView.f316889d;
                if (multiTrackRecyclerView != null) {
                    multiTrackRecyclerView.scrollBy(multiTrackCropView.f316895j, 0);
                    this.f316915d.f316900r = false;
                    return;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }

        public C106276g(MultiTrackCropView multiTrackCropView) {
            this.f316914d = multiTrackCropView;
        }

        public final void run() {
            MultiTrackRecyclerView multiTrackRecyclerView = this.f316914d.f316889d;
            if (multiTrackRecyclerView == null) {
                C87412m.m108603p("recyclerView");
                throw null;
            } else if (multiTrackRecyclerView.getWidth() <= 0) {
                MultiTrackCropView multiTrackCropView = this.f316914d;
                MultiTrackRecyclerView multiTrackRecyclerView2 = multiTrackCropView.f316889d;
                if (multiTrackRecyclerView2 != null) {
                    multiTrackRecyclerView2.post(multiTrackCropView.f316884C);
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                this.f316914d.mo152327c(true);
                MultiTrackCropView multiTrackCropView2 = this.f316914d;
                multiTrackCropView2.f316895j = multiTrackCropView2.f316906x / 2;
                Log.m105918d("MicroMsg.MultiTrackCropView", "baseScrollOffset: " + this.f316914d.f316895j);
                MultiTrackCropView multiTrackCropView3 = this.f316914d;
                C111127k kVar = multiTrackCropView3.f316882A;
                kVar.f187129i = -2;
                MultiTrackRecyclerView multiTrackRecyclerView3 = multiTrackCropView3.f316889d;
                if (multiTrackRecyclerView3 != null) {
                    kVar.f187123c = multiTrackRecyclerView3.getWidth();
                    MultiTrackCropView multiTrackCropView4 = this.f316914d;
                    C111127k kVar2 = multiTrackCropView4.f316883B;
                    kVar2.f187129i = -3;
                    MultiTrackRecyclerView multiTrackRecyclerView4 = multiTrackCropView4.f316889d;
                    if (multiTrackRecyclerView4 != null) {
                        kVar2.f187123c = multiTrackRecyclerView4.getWidth();
                        this.f316914d.getTrackList().add(0, this.f316914d.f316882A);
                        this.f316914d.getTrackList().add(this.f316914d.f316883B);
                        this.f316914d.f316891f.mo162852F4(-1);
                        MultiTrackCropView multiTrackCropView5 = this.f316914d;
                        MultiTrackRecyclerView multiTrackRecyclerView5 = multiTrackCropView5.f316889d;
                        if (multiTrackRecyclerView5 != null) {
                            multiTrackRecyclerView5.f207428y1 = -1;
                            multiTrackCropView5.f316891f.mo162853G4(multiTrackCropView5.getTrackList());
                            this.f316914d.f316891f.notifyDataSetChanged();
                            MultiTrackCropView multiTrackCropView6 = this.f316914d;
                            MultiTrackRecyclerView multiTrackRecyclerView6 = multiTrackCropView6.f316889d;
                            if (multiTrackRecyclerView6 != null) {
                                multiTrackRecyclerView6.post(new C106277a(multiTrackCropView6));
                            } else {
                                C87412m.m108603p("recyclerView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView$h */
    public static final class C106278h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MultiTrackCropView f316916d;

        /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView$h$a */
        public static final class C106279a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MultiTrackCropView f316917d;

            public C106279a(MultiTrackCropView multiTrackCropView) {
                this.f316917d = multiTrackCropView;
            }

            public final void run() {
                MultiTrackCropView multiTrackCropView = this.f316917d;
                MultiTrackRecyclerView multiTrackRecyclerView = multiTrackCropView.f316889d;
                if (multiTrackRecyclerView != null) {
                    multiTrackRecyclerView.scrollBy(multiTrackCropView.f316895j, 0);
                    this.f316917d.f316900r = false;
                    return;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }

        public C106278h(MultiTrackCropView multiTrackCropView) {
            this.f316916d = multiTrackCropView;
        }

        public final void run() {
            MultiTrackRecyclerView multiTrackRecyclerView = this.f316916d.f316889d;
            if (multiTrackRecyclerView == null) {
                C87412m.m108603p("recyclerView");
                throw null;
            } else if (multiTrackRecyclerView.getWidth() <= 0) {
                MultiTrackCropView multiTrackCropView = this.f316916d;
                MultiTrackRecyclerView multiTrackRecyclerView2 = multiTrackCropView.f316889d;
                if (multiTrackRecyclerView2 != null) {
                    multiTrackRecyclerView2.post(multiTrackCropView.f316884C);
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                this.f316916d.mo152327c(true);
                MultiTrackCropView multiTrackCropView2 = this.f316916d;
                multiTrackCropView2.f316895j = multiTrackCropView2.f316906x / 2;
                Log.m105918d("MicroMsg.MultiTrackCropView", "baseScrollOffset: " + this.f316916d.f316895j);
                MultiTrackCropView multiTrackCropView3 = this.f316916d;
                C111127k kVar = multiTrackCropView3.f316882A;
                kVar.f187129i = -2;
                MultiTrackRecyclerView multiTrackRecyclerView3 = multiTrackCropView3.f316889d;
                if (multiTrackRecyclerView3 != null) {
                    kVar.f187123c = multiTrackRecyclerView3.getWidth();
                    MultiTrackCropView multiTrackCropView4 = this.f316916d;
                    C111127k kVar2 = multiTrackCropView4.f316883B;
                    kVar2.f187129i = -3;
                    MultiTrackRecyclerView multiTrackRecyclerView4 = multiTrackCropView4.f316889d;
                    if (multiTrackRecyclerView4 != null) {
                        kVar2.f187123c = multiTrackRecyclerView4.getWidth();
                        this.f316916d.getTrackList().add(0, this.f316916d.f316882A);
                        this.f316916d.getTrackList().add(this.f316916d.f316883B);
                        this.f316916d.f316891f.mo162852F4(-1);
                        MultiTrackCropView multiTrackCropView5 = this.f316916d;
                        MultiTrackRecyclerView multiTrackRecyclerView5 = multiTrackCropView5.f316889d;
                        if (multiTrackRecyclerView5 != null) {
                            multiTrackRecyclerView5.f207428y1 = -1;
                            multiTrackCropView5.f316891f.mo162853G4(multiTrackCropView5.getTrackList());
                            this.f316916d.f316891f.notifyDataSetChanged();
                            MultiTrackCropView multiTrackCropView6 = this.f316916d;
                            MultiTrackRecyclerView multiTrackRecyclerView6 = multiTrackCropView6.f316889d;
                            if (multiTrackRecyclerView6 != null) {
                                multiTrackRecyclerView6.post(new C106279a(multiTrackCropView6));
                            } else {
                                C87412m.m108603p("recyclerView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTrackCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f316891f = new C111113c();
        this.f316892g = 112;
        this.f316893h = 63;
        this.f316894i = 1;
        this.f316903u = true;
        this.f316906x = C76577a.m92145A(context);
        this.f316907y = C76577a.m92151b(context, 40);
        this.f316908z = C76577a.m92151b(context, 64);
        C111127k.C111128a aVar = C111127k.f332730o;
        this.f316882A = aVar.mo162866a(0);
        this.f316883B = aVar.mo162866a(0);
        this.f316885D = new LinkedList<>();
        this.f316887F = 16;
        this.f316888G = new C106274e(this);
    }

    /* renamed from: a */
    public static final void m143007a(MultiTrackCropView multiTrackCropView) {
        int i = multiTrackCropView.f316895j;
        int i2 = 0;
        for (T next : multiTrackCropView.f316885D) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C111127k kVar = (C111127k) next;
                if (i2 == 0 || i2 == C64197v.m75536e(multiTrackCropView.f316885D) || multiTrackCropView.f316898p >= (i = i + kVar.f187131k)) {
                    i2 = i3;
                } else {
                    multiTrackCropView.post(new C111124h(multiTrackCropView, i2, kVar));
                    return;
                }
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* renamed from: b */
    public final void mo152326b(C96552p0 p0Var, long j) {
        if (this.f316900r) {
            this.f316900r = false;
            Log.m105918d("MicroMsg.MultiTrackCropView", "onUpdateComposition, seekTo: " + j);
            this.f316901s = true;
            this.f316902t = j;
            this.f316903u = true;
            int i = this.f316895j;
            long j2 = this.f316896n;
            int i2 = i + ((int) ((((float) ((j - j2) * ((long) this.f316894i))) * 1.0f) / ((float) (this.f316897o - j2))));
            MultiTrackRecyclerView multiTrackRecyclerView = this.f316889d;
            if (multiTrackRecyclerView != null) {
                multiTrackRecyclerView.mo17122s1(i2 - this.f316898p, 0, (Interpolator) null);
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }
    }

    /* renamed from: c */
    public final void mo152327c(boolean z) {
        MultiTrackRecyclerView multiTrackRecyclerView = this.f316889d;
        if (multiTrackRecyclerView != null) {
            int height = multiTrackRecyclerView.getHeight();
            MultiTrackRecyclerView multiTrackRecyclerView2 = this.f316889d;
            if (multiTrackRecyclerView2 != null) {
                int paddingTop = height - multiTrackRecyclerView2.getPaddingTop();
                MultiTrackRecyclerView multiTrackRecyclerView3 = this.f316889d;
                if (multiTrackRecyclerView3 != null) {
                    float paddingBottom = (((float) (paddingTop - multiTrackRecyclerView3.getPaddingBottom())) * 1.0f) / ((float) this.f316892g);
                    this.f316894i = 0;
                    Iterator<T> it = this.f316885D.iterator();
                    long j = 0;
                    while (it.hasNext()) {
                        C111127k kVar = (C111127k) it.next();
                        if (z) {
                            kVar.f187126f = (((float) kVar.mo88221d()) / kVar.f332732n.f316501l.f331468f) / ((float) 1000);
                            float f = kVar.f187126f;
                            long d = (long) (((float) kVar.mo88221d()) / f);
                            int ceil = (int) Math.ceil((double) f);
                            kVar.f187127g.clear();
                            int i = 0;
                            while (i < ceil) {
                                C65004e eVar = new C65004e();
                                Iterator<T> it4 = it;
                                long j2 = (long) 500;
                                long c = C60641c.m70922c((double) ((((float) ((((long) i) * d) + (d / ((long) 2)))) * 1.0f) / ((float) 500))) * j2;
                                eVar.f187134a = c;
                                if (c >= kVar.mo88221d()) {
                                    eVar.f187134a = ((kVar.mo88221d() - 1) / j2) * j2;
                                }
                                kVar.f187127g.add(eVar);
                                i++;
                                it = it4;
                            }
                        }
                        kVar.f187130j = j;
                        int d2 = (int) ((((kVar.f187126f * ((float) kVar.f187121a)) * paddingBottom) * ((float) (kVar.f187125e - kVar.f187124d))) / ((float) kVar.mo88221d()));
                        kVar.f187131k = d2;
                        this.f316894i += d2;
                        j += (long) (((float) (kVar.f187125e - kVar.f187124d)) / kVar.f332732n.f316501l.f331468f);
                        Log.m105918d("MicroMsg.MultiTrackCropView", "build thumbInfo index:" + kVar.f187129i + ", frameCount:" + kVar.f187126f + ", frameDuration:" + (kVar.f187125e - kVar.f187124d) + ", frameWidth:" + kVar.f187131k);
                        it = it;
                    }
                    this.f316896n = 0;
                    this.f316897o = j;
                    return;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("dispatchTouchEvent, action:");
        sb.append(motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null);
        sb.append(", rawX:");
        sb.append(motionEvent != null ? Float.valueOf(motionEvent.getRawX()) : null);
        sb.append(", rawY:");
        sb.append(motionEvent != null ? Float.valueOf(motionEvent.getRawY()) : null);
        Log.m105918d("MicroMsg.MultiTrackCropView", sb.toString());
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            Log.m105918d("MicroMsg.MultiTrackCropView", "RecyclerView onInterceptTouchEvent:ACTION_DOWN, set enableAutoScroll:false");
            this.f316904v = false;
            this.f316903u = false;
            C106270a aVar = this.f316886E;
            if (aVar != null) {
                aVar.pause();
            }
            MultiTrackRecyclerView multiTrackRecyclerView = this.f316889d;
            if (multiTrackRecyclerView != null) {
                multiTrackRecyclerView.mo17155w1();
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        } else {
            if ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 1)) {
                MultiTrackRecyclerView multiTrackRecyclerView2 = this.f316889d;
                if (multiTrackRecyclerView2 == null) {
                    C87412m.m108603p("recyclerView");
                    throw null;
                } else if (multiTrackRecyclerView2.getScrollState() == 0) {
                    Log.m105918d("MicroMsg.MultiTrackCropView", "RecyclerView onInterceptTouchEvent:ACTION_UP, SCROLL_STATE_IDLE, set playWaitIdle:false, enableAutoScroll:true");
                    this.f316904v = false;
                    this.f316903u = true;
                } else {
                    Log.m105918d("MicroMsg.MultiTrackCropView", "RecyclerView onInterceptTouchEvent:ACTION_UP, set playWaitIdle:true");
                    this.f316904v = true;
                }
            } else if (valueOf != null && valueOf.intValue() == 2) {
                this.f316899q = MotionEvent.obtain(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final C106270a getCallback() {
        return this.f316886E;
    }

    public final long getCutDuration() {
        long j = 0;
        for (C111127k kVar : this.f316885D) {
            j += kVar.f187125e - kVar.f187124d;
        }
        return j;
    }

    public final long getSourceDuration() {
        long j = 0;
        for (C111127k d : this.f316885D) {
            j += d.mo88221d();
        }
        return j;
    }

    public final LinkedList<C111127k> getTrackList() {
        return this.f316885D;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C0966R.C0970id.kt8);
        C87412m.m108593f(findViewById, "findViewById(R.id.track_crop_thumb_recycler)");
        this.f316889d = (MultiTrackRecyclerView) findViewById;
        MultiTrackCropView$onFinishInflate$1 multiTrackCropView$onFinishInflate$1 = new MultiTrackCropView$onFinishInflate$1(this, getContext());
        this.f316890e = multiTrackCropView$onFinishInflate$1;
        MultiTrackRecyclerView multiTrackRecyclerView = this.f316889d;
        if (multiTrackRecyclerView != null) {
            multiTrackRecyclerView.setLayoutManager(multiTrackCropView$onFinishInflate$1);
            MultiTrackRecyclerView multiTrackRecyclerView2 = this.f316889d;
            if (multiTrackRecyclerView2 != null) {
                multiTrackRecyclerView2.setAdapter(this.f316891f);
                MultiTrackRecyclerView multiTrackRecyclerView3 = this.f316889d;
                if (multiTrackRecyclerView3 != null) {
                    multiTrackRecyclerView3.setItemAnimator((RecyclerView.C16616j) null);
                    MultiTrackRecyclerView multiTrackRecyclerView4 = this.f316889d;
                    if (multiTrackRecyclerView4 != null) {
                        multiTrackRecyclerView4.mo17085h0(new C14107d());
                        MultiTrackRecyclerView multiTrackRecyclerView5 = this.f316889d;
                        if (multiTrackRecyclerView5 != null) {
                            multiTrackRecyclerView5.mo17043c(new C106271b(this));
                            MultiTrackRecyclerView multiTrackRecyclerView6 = this.f316889d;
                            if (multiTrackRecyclerView6 != null) {
                                multiTrackRecyclerView6.mo17092j0(new C106272c());
                                this.f316891f.f332703g = new C106273d(this);
                                return;
                            }
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    public final void setCallback(C106270a aVar) {
        this.f316886E = aVar;
    }

    public final void setEnableLengthEdit(boolean z) {
    }

    public final void setProgress(long j) {
        C61926c.m72668M(new C106275f(j, this));
    }

    public final void setTrack(C110807k kVar) {
        C87412m.m108594g(kVar, "composition");
        this.f316885D.clear();
        kVar.mo162389l();
        CMTimeRange j = kVar.mo162387j();
        long j2 = (long) 1000;
        this.f316896n = j.getStartUs() / j2;
        this.f316897o = j.getEndUs() / j2;
        LinkedList<C111127k> linkedList = this.f316885D;
        ArrayList<C110801c> arrayList = kVar.f331511l;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator<C110801c> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C110801c next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                C111127k kVar2 = new C111127k(next, false, false);
                kVar2.f187129i = i;
                kVar2.f187122b = this.f316892g;
                kVar2.f187121a = this.f316893h;
                arrayList2.add(kVar2);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        linkedList.addAll(arrayList2);
        this.f316900r = true;
        LinearLayoutManager linearLayoutManager = this.f316890e;
        if (linearLayoutManager != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            aVar.mo10233c(0);
            LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
            C117292a.m165358d(linearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView", "setTrack", "(Lcom/tencent/mm/videocomposition/VideoComposition;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView", "setTrack", "(Lcom/tencent/mm/videocomposition/VideoComposition;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            this.f316898p = 0;
            C106276g gVar = new C106276g(this);
            this.f316884C = gVar;
            gVar.run();
            return;
        }
        C87412m.m108603p("layoutManager");
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MultiTrackCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public final void setTrack(C96552p0 p0Var) {
        C87412m.m108594g(p0Var, "composition");
        this.f316885D.clear();
        p0Var.mo134616m();
        CMTimeRange k = p0Var.mo134614k();
        long j = (long) 1000;
        this.f316896n = k.getStartUs() / j;
        this.f316897o = k.getEndUs() / j;
        LinkedList<C111127k> linkedList = this.f316885D;
        List<C106205q0> o = p0Var.mo134618o();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(o, 10));
        Iterator it = ((ArrayList) o).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                C111127k kVar = new C111127k((C106205q0) next);
                kVar.f187129i = i;
                kVar.f187122b = this.f316892g;
                kVar.f187121a = this.f316893h;
                arrayList.add(kVar);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        linkedList.addAll(arrayList);
        this.f316900r = true;
        LinearLayoutManager linearLayoutManager = this.f316890e;
        if (linearLayoutManager != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            aVar.mo10233c(0);
            LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
            C117292a.m165358d(linearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView", "setTrack", "(Lcom/tencent/mm/plugin/vlog/model/VLogComposition;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView", "setTrack", "(Lcom/tencent/mm/plugin/vlog/model/VLogComposition;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            this.f316898p = 0;
            C106278h hVar = new C106278h(this);
            this.f316884C = hVar;
            hVar.run();
            return;
        }
        C87412m.m108603p("layoutManager");
        throw null;
    }
}
