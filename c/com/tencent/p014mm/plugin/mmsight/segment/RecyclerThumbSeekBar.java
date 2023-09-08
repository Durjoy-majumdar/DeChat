package com.tencent.p014mm.plugin.mmsight.segment;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.memory.C92716o;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.modelvideoh265toh264.C92862f;
import com.tencent.p014mm.plugin.mmsight.segment.C105477c;
import com.tencent.p014mm.plugin.mmsight.segment.SliderSeekBar;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar */
public class RecyclerThumbSeekBar extends RelativeLayout {

    /* renamed from: w */
    public static final /* synthetic */ int f313582w = 0;

    /* renamed from: d */
    public String f313583d;

    /* renamed from: e */
    public int f313584e;

    /* renamed from: f */
    public int f313585f = -1;

    /* renamed from: g */
    public int f313586g;

    /* renamed from: h */
    public int f313587h;

    /* renamed from: i */
    public C105475a f313588i;

    /* renamed from: j */
    public C105476b f313589j;

    /* renamed from: n */
    public RecyclerView f313590n;

    /* renamed from: o */
    public C105465g f313591o;

    /* renamed from: p */
    public SliderSeekBar f313592p;

    /* renamed from: q */
    public int f313593q;

    /* renamed from: r */
    public VideoTransPara f313594r;

    /* renamed from: s */
    public C105477c.C105478a f313595s = new C105477c.C105478a(4, new C105459a());

    /* renamed from: t */
    public Runnable f313596t = new C105460b();

    /* renamed from: u */
    public RecyclerView.C0130p f313597u = new C105462c();

    /* renamed from: v */
    public SliderSeekBar.C105469b f313598v = new C105463d();

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar$e */
    public class C94199e implements Runnable {

        /* renamed from: d */
        public Bitmap f272128d;

        /* renamed from: e */
        public ImageView f272129e;

        /* renamed from: f */
        public C105464f f272130f;

        public C94199e(RecyclerThumbSeekBar recyclerThumbSeekBar, Bitmap bitmap, ImageView imageView, C105464f fVar) {
            this.f272128d = bitmap;
            this.f272129e = imageView;
            this.f272130f = fVar;
        }

        public void run() {
            ImageView imageView;
            Bitmap bitmap = this.f272128d;
            if (bitmap == null || bitmap.isRecycled()) {
                boolean z = true;
                Object[] objArr = new Object[1];
                if (this.f272128d != null) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                Log.m105925i("RecyclerThumbSeekBar", "bitmap is null %b in DrawBitmapOnViewTask", objArr);
                return;
            }
            C105464f fVar = this.f272130f;
            if (fVar == null || fVar.f313606f || (imageView = this.f272129e) == null) {
                Log.m105924i("RecyclerThumbSeekBar", "bitmap in DrawBitmapOnViewTask");
                return;
            }
            imageView.setTag((Object) null);
            ObjectAnimator.ofInt(imageView, "imageAlpha", new int[]{50, 255}).setDuration(200).start();
            imageView.setImageBitmap(this.f272128d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar$a */
    public class C105459a implements Callable<C105477c> {
        public C105459a() {
        }

        public Object call() {
            if (Util.isNullOrNil(RecyclerThumbSeekBar.this.f313583d) || !C86013q1.m106450k(RecyclerThumbSeekBar.this.f313583d)) {
                throw new IllegalArgumentException("create thumb fetcher error, file not exist");
            }
            boolean h = C92862f.m117175h(RecyclerThumbSeekBar.this.f313583d);
            Log.m105925i("RecyclerThumbSeekBar", "get thumb fetcher, ish265: %s", Boolean.valueOf(h));
            C105477c cVar = null;
            if (!h) {
                C94554a c = C94555d.m119567c(RecyclerThumbSeekBar.this.f313583d, true);
                boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_use_ffmpeg_frame_retriever, false);
                if (c != null && c.f273445c < 2000 && c.f273446d < 2000 && wf) {
                    cVar = new FFmpegSightJNIThumbFetcher();
                }
            }
            if (cVar == null) {
                cVar = new C105481e();
            }
            RecyclerThumbSeekBar recyclerThumbSeekBar = RecyclerThumbSeekBar.this;
            cVar.init(recyclerThumbSeekBar.f313583d, recyclerThumbSeekBar.f313584e, recyclerThumbSeekBar.f313587h, recyclerThumbSeekBar.f313586g);
            return cVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar$b */
    public class C105460b implements Runnable {

        /* renamed from: com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar$b$a */
        public class C105461a implements Runnable {
            public C105461a() {
            }

            public void run() {
                boolean z;
                try {
                    C105477c a = RecyclerThumbSeekBar.this.f313595s.mo150274a();
                    RecyclerThumbSeekBar.this.f313585f = a.getDurationMs();
                    RecyclerThumbSeekBar.this.f313595s.mo150276c(a);
                    z = true;
                } catch (Exception e) {
                    Log.printErrStackTrace("RecyclerThumbSeekBar", e, "Try to init fetcher error : %s", e.getMessage());
                    z = false;
                }
                if (!z) {
                    RecyclerThumbSeekBar recyclerThumbSeekBar = RecyclerThumbSeekBar.this;
                    int i = RecyclerThumbSeekBar.f313582w;
                    recyclerThumbSeekBar.getClass();
                    MMHandlerThread.postToMainThread(new C105483g(recyclerThumbSeekBar));
                    return;
                }
                RecyclerThumbSeekBar recyclerThumbSeekBar2 = RecyclerThumbSeekBar.this;
                int i2 = recyclerThumbSeekBar2.f313585f;
                if (i2 >= 10000) {
                    recyclerThumbSeekBar2.f313584e = (recyclerThumbSeekBar2.f313594r.f267170h * 1000) / 10;
                } else if (i2 > 0) {
                    recyclerThumbSeekBar2.f313584e = i2 / 10;
                } else {
                    Log.m105921e("RecyclerThumbSeekBar", "RecyclerThumbSeekBar duration invalid %d", Integer.valueOf(i2));
                    RecyclerThumbSeekBar recyclerThumbSeekBar3 = RecyclerThumbSeekBar.this;
                    recyclerThumbSeekBar3.getClass();
                    MMHandlerThread.postToMainThread(new C105483g(recyclerThumbSeekBar3));
                    return;
                }
                Log.m105919d("RecyclerThumbSeekBar", "duration %d interval %d", Integer.valueOf(i2), Integer.valueOf(RecyclerThumbSeekBar.this.f313584e));
                RecyclerThumbSeekBar recyclerThumbSeekBar4 = RecyclerThumbSeekBar.this;
                recyclerThumbSeekBar4.getClass();
                MMHandlerThread.postToMainThread(new C105482f(recyclerThumbSeekBar4));
            }
        }

        public C105460b() {
        }

        public void run() {
            Log.m105924i("RecyclerThumbSeekBar", "exec initAsyncTask");
            if (RecyclerThumbSeekBar.this.getHeight() == 0 || RecyclerThumbSeekBar.this.getWidth() == 0) {
                RecyclerThumbSeekBar recyclerThumbSeekBar = RecyclerThumbSeekBar.this;
                recyclerThumbSeekBar.post(recyclerThumbSeekBar.f313596t);
                return;
            }
            RecyclerThumbSeekBar recyclerThumbSeekBar2 = RecyclerThumbSeekBar.this;
            recyclerThumbSeekBar2.f313586g = recyclerThumbSeekBar2.getHeight();
            RecyclerThumbSeekBar recyclerThumbSeekBar3 = RecyclerThumbSeekBar.this;
            recyclerThumbSeekBar3.f313587h = (recyclerThumbSeekBar3.getWidth() - (RecyclerThumbSeekBar.this.f313593q * 2)) / 12;
            ThreadPool.post(new C105461a(), "check duration of ");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar$c */
    public class C105462c extends RecyclerView.C0130p {
        public C105462c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0024, code lost:
            r8 = r7.f313602d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r8, int r9) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBar$5"
                java.lang.String r2 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
                java.lang.String r3 = "onScrollStateChanged"
                java.lang.String r4 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                if (r9 != 0) goto L_0x0037
                com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar r8 = com.tencent.p014mm.plugin.mmsight.segment.RecyclerThumbSeekBar.this
                com.tencent.mm.plugin.mmsight.segment.b r9 = r8.f313589j
                if (r9 == 0) goto L_0x0037
                float r8 = r8.mo150234c()
                com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar r0 = com.tencent.p014mm.plugin.mmsight.segment.RecyclerThumbSeekBar.this
                float r0 = r0.mo150233b()
                r9.mo139251q(r8, r0)
            L_0x0037:
                java.lang.String r8 = "com/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBar$5"
                java.lang.String r9 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
                java.lang.String r0 = "onScrollStateChanged"
                java.lang.String r1 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
                j20.C117292a.m165361g(r7, r8, r9, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmsight.segment.RecyclerThumbSeekBar.C105462c.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBar$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBar$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar$d */
    public class C105463d implements SliderSeekBar.C105469b {
        public C105463d() {
        }

        /* renamed from: a */
        public void mo150247a(boolean z) {
            RecyclerThumbSeekBar recyclerThumbSeekBar = RecyclerThumbSeekBar.this;
            C105476b bVar = recyclerThumbSeekBar.f313589j;
            if (bVar != null && recyclerThumbSeekBar.f313591o != null) {
                bVar.mo139248l(z, recyclerThumbSeekBar.mo150234c(), RecyclerThumbSeekBar.this.mo150233b());
            }
        }

        /* renamed from: b */
        public void mo150248b(boolean z) {
            RecyclerThumbSeekBar recyclerThumbSeekBar = RecyclerThumbSeekBar.this;
            C105476b bVar = recyclerThumbSeekBar.f313589j;
            if (bVar != null && recyclerThumbSeekBar.f313591o != null) {
                bVar.mo139249m(z, recyclerThumbSeekBar.mo150234c(), RecyclerThumbSeekBar.this.mo150233b());
            }
        }

        /* renamed from: c */
        public void mo150249c(boolean z) {
            RecyclerThumbSeekBar recyclerThumbSeekBar = RecyclerThumbSeekBar.this;
            C105476b bVar = recyclerThumbSeekBar.f313589j;
            if (!(bVar == null || recyclerThumbSeekBar.f313591o == null)) {
                bVar.mo139245g(z, recyclerThumbSeekBar.mo150234c(), RecyclerThumbSeekBar.this.mo150233b());
            }
            if (z) {
                RecyclerThumbSeekBar recyclerThumbSeekBar2 = RecyclerThumbSeekBar.this;
                recyclerThumbSeekBar2.f313591o.mo150251F4(true, recyclerThumbSeekBar2.f313592p.getLeftSliderBound());
                return;
            }
            RecyclerThumbSeekBar recyclerThumbSeekBar3 = RecyclerThumbSeekBar.this;
            recyclerThumbSeekBar3.f313591o.mo150251F4(false, recyclerThumbSeekBar3.f313592p.getWidth() - RecyclerThumbSeekBar.this.f313592p.getRightSliderBound());
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar$f */
    public class C105464f implements Runnable {

        /* renamed from: d */
        public int f313604d;

        /* renamed from: e */
        public WeakReference<ImageView> f313605e;

        /* renamed from: f */
        public boolean f313606f = false;

        /* renamed from: g */
        public MMHandler f313607g;

        /* renamed from: h */
        public Bitmap f313608h;

        public C105464f(int i, ImageView imageView, Bitmap bitmap, MMHandler mMHandler) {
            this.f313604d = i;
            this.f313605e = new WeakReference<>(imageView);
            this.f313607g = mMHandler;
            this.f313608h = bitmap;
        }

        public void run() {
            if (this.f313606f) {
                C92716o.f266827d.mo126928m(this.f313608h);
            } else if (this.f313605e.get() == null) {
                C92716o.f266827d.mo126928m(this.f313608h);
            } else {
                try {
                    C105477c a = RecyclerThumbSeekBar.this.f313595s.mo150274a();
                    if (this.f313608h == null) {
                        this.f313608h = C92716o.f266827d.mo126927l(new C92716o.C92718b(a.getScaledWidth(), a.getScaledHeight()));
                    }
                    a.reuseBitmap(this.f313608h);
                    if (!this.f313606f) {
                        this.f313608h = a.getFrameAtTime((long) this.f313604d);
                    }
                    RecyclerThumbSeekBar.this.f313595s.mo150276c(a);
                    if (this.f313608h == null || this.f313606f || this.f313605e.get() == null) {
                        C92716o.f266827d.mo126928m(this.f313608h);
                    } else {
                        this.f313607g.post(new C94199e(RecyclerThumbSeekBar.this, this.f313608h, this.f313605e.get(), this));
                    }
                } catch (Exception e) {
                    Log.m105920e("RecyclerThumbSeekBar", "get bitmap error " + e.getMessage());
                    C92716o.f266827d.mo126928m(this.f313608h);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar$g */
    public class C105465g extends RecyclerView.C16613e<C105467i> {

        /* renamed from: d */
        public C105466h f313610d;

        /* renamed from: e */
        public int f313611e;

        /* renamed from: f */
        public int f313612f;

        /* renamed from: g */
        public View f313613g;

        /* renamed from: h */
        public View f313614h;

        public C105465g(C105459a aVar) {
            this.f313610d = new C105466h();
            int i = RecyclerThumbSeekBar.this.f313593q;
            this.f313611e = i;
            this.f313612f = i;
        }

        /* renamed from: F4 */
        public void mo150251F4(boolean z, int i) {
            if (z) {
                View view = this.f313613g;
                if (view != null) {
                    view.setMinimumWidth(i);
                }
                if (((LinearLayoutManager) RecyclerThumbSeekBar.this.f313590n.getLayoutManager()).mo16957C() == 0) {
                    RecyclerThumbSeekBar.this.f313590n.scrollBy(i - this.f313611e, 0);
                }
                this.f313611e = i;
                return;
            }
            this.f313612f = i;
            View view2 = this.f313614h;
            if (view2 != null) {
                view2.setMinimumWidth(i);
            }
        }

        public int getItemCount() {
            RecyclerThumbSeekBar recyclerThumbSeekBar = RecyclerThumbSeekBar.this;
            int i = recyclerThumbSeekBar.f313585f;
            if (i <= 0) {
                return 0;
            }
            return Math.max(0, (int) Math.floor((double) (((float) i) / ((float) recyclerThumbSeekBar.f313584e)))) + 2;
        }

        public int getItemViewType(int i) {
            if (i == 0) {
                return 1;
            }
            return i == getItemCount() - 1 ? 2 : 0;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C105467i iVar = (C105467i) zVar;
            if (getItemViewType(i) == 1 || getItemViewType(i) == 2) {
                if (i == 0) {
                    iVar.f44854d.setMinimumWidth(this.f313611e);
                } else {
                    iVar.f44854d.setMinimumWidth(this.f313612f);
                }
                iVar.f44854d.setBackgroundColor(0);
                iVar.f44854d.setMinimumHeight(RecyclerThumbSeekBar.this.f313586g);
                return;
            }
            C105466h hVar = this.f313610d;
            if (hVar != null) {
                int i2 = i * RecyclerThumbSeekBar.this.f313584e;
                ImageView imageView = iVar.f313621z;
                if (imageView != null && i2 >= 0) {
                    int i3 = RecyclerThumbSeekBar.this.f313585f;
                    int i4 = i2 > i3 ? i3 : i2;
                    Log.m105924i("RecyclerThumbSeekBar", "loadImageAsync() called with: time = [" + i4 + "], view = [" + imageView + "]");
                    Object tag = imageView.getTag();
                    C105464f fVar = (tag == null || !(tag instanceof C105464f)) ? null : (C105464f) tag;
                    if (fVar == null || fVar.f313604d != i4) {
                        if (fVar != null) {
                            fVar.f313606f = true;
                        }
                        Bitmap bitmap = (imageView.getDrawable() == null || !(imageView.getDrawable() instanceof BitmapDrawable)) ? null : ((BitmapDrawable) imageView.getDrawable()).getBitmap();
                        imageView.setImageBitmap((Bitmap) null);
                        C105464f fVar2 = new C105464f(i4, imageView, bitmap, hVar.f313616a);
                        imageView.setTag(fVar2);
                        int i5 = hVar.f313619d;
                        int i6 = i5 % hVar.f313617b;
                        hVar.f313619d = i5 + 1;
                        if (hVar.f313618c[i6] != null) {
                            new MMHandler(hVar.f313618c[i6].getSerial()).post(fVar2);
                            return;
                        }
                        return;
                    }
                    Log.m105925i("RecyclerThumbSeekBar", "SimpleImageLoader.loadImageAsync time equals %d return directly", Integer.valueOf(i4));
                    return;
                }
                return;
            }
            Log.m105920e("RecyclerThumbSeekBar", "onBindViewHolder ImageLoader invoked after released.");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1 || i == 2) {
                View view = new View(RecyclerThumbSeekBar.this.getContext());
                if (i == 1) {
                    this.f313613g = view;
                } else {
                    this.f313614h = view;
                }
                return new C105467i(RecyclerThumbSeekBar.this, view, 1);
            }
            ImageView imageView = new ImageView(RecyclerThumbSeekBar.this.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setMinimumWidth(RecyclerThumbSeekBar.this.f313587h);
            imageView.setMinimumHeight(RecyclerThumbSeekBar.this.f313586g);
            LinearLayout linearLayout = new LinearLayout(RecyclerThumbSeekBar.this.getContext());
            RecyclerThumbSeekBar recyclerThumbSeekBar = RecyclerThumbSeekBar.this;
            linearLayout.addView(imageView, recyclerThumbSeekBar.f313587h, recyclerThumbSeekBar.f313586g);
            return new C105467i(RecyclerThumbSeekBar.this, linearLayout, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar$h */
    public class C105466h {

        /* renamed from: a */
        public MMHandler f313616a = new MMHandler();

        /* renamed from: b */
        public int f313617b = 4;

        /* renamed from: c */
        public MMHandler[] f313618c = new MMHandler[4];

        /* renamed from: d */
        public int f313619d = 0;

        public C105466h() {
            new LinkedBlockingDeque();
            int i = 0;
            while (true) {
                MMHandler[] mMHandlerArr = this.f313618c;
                if (i < mMHandlerArr.length) {
                    mMHandlerArr[i] = new MMHandler("RecyclerThumbSeekBar_SimpleImageLoader_" + i);
                    i++;
                } else {
                    this.f313619d = 0;
                    return;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar$i */
    public class C105467i extends RecyclerView.C16631z {

        /* renamed from: z */
        public ImageView f313621z;

        public C105467i(RecyclerThumbSeekBar recyclerThumbSeekBar, View view, int i) {
            super(view);
            if (i == 0) {
                this.f313621z = (ImageView) ((LinearLayout) view).getChildAt(0);
            }
        }
    }

    public RecyclerThumbSeekBar(Context context) {
        super(context);
        mo150236e();
    }

    /* renamed from: a */
    public static int m141629a(RecyclerThumbSeekBar recyclerThumbSeekBar, int i) {
        C105465g gVar = recyclerThumbSeekBar.f313591o;
        if (gVar == null) {
            throw new IllegalStateException("recyclerAdapter is null");
        } else if (recyclerThumbSeekBar.f313585f > 0) {
            gVar.getItemCount();
            return (int) (Math.min(Math.max(0.0f, ((float) i) / ((float) recyclerThumbSeekBar.f313585f)), 1.0f) * ((float) recyclerThumbSeekBar.f313587h) * ((float) (recyclerThumbSeekBar.f313591o.getItemCount() - 2)));
        } else {
            throw new IllegalStateException("durationMs <= 0");
        }
    }

    private void setViewWidth(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public float mo150233b() {
        SliderSeekBar sliderSeekBar = this.f313592p;
        if (sliderSeekBar == null) {
            return 0.0f;
        }
        float d = mo150235d(sliderSeekBar.getRightSliderBound(), true);
        Log.m105919d("RecyclerThumbSeekBar", "computeEndPercent x : [%d] ret[%f] seekLoopEndTime[%d]", Integer.valueOf(this.f313592p.getRightSliderBound()), Float.valueOf(d), Integer.valueOf(Math.round(((float) this.f313585f) * d)));
        return d;
    }

    /* renamed from: c */
    public float mo150234c() {
        SliderSeekBar sliderSeekBar = this.f313592p;
        if (sliderSeekBar == null) {
            return 0.0f;
        }
        float d = mo150235d(sliderSeekBar.getLeftSliderBound(), false);
        Log.m105919d("RecyclerThumbSeekBar", "computeStartPercent x : [%d] ret[%f] seekLoopStartTime[%d] durationMs[%d]", Integer.valueOf(this.f313592p.getLeftSliderBound()), Float.valueOf(d), Integer.valueOf(Math.round(((float) this.f313585f) * d)), Integer.valueOf(this.f313585f));
        return d;
    }

    /* renamed from: d */
    public final float mo150235d(int i, boolean z) {
        RecyclerView recyclerView;
        if (this.f313591o == null || (recyclerView = this.f313590n) == null) {
            return 0.0f;
        }
        View D0 = recyclerView.mo17019D0((float) i, 0.0f);
        if (D0 == null) {
            Log.m105929w("RecyclerThumbSeekBar", "getPositionInTotalRange x[%d] isEnd[%b], view is null.", Integer.valueOf(i), Boolean.valueOf(z));
            return 0.0f;
        }
        int N0 = this.f313590n.mo17029N0(D0);
        int itemCount = this.f313591o.getItemCount();
        if (N0 <= 1) {
            return 0.0f;
        }
        if (N0 >= itemCount - 1) {
            return 1.0f;
        }
        return (((float) (N0 - 1)) + (((float) (i - D0.getLeft())) / ((float) D0.getWidth()))) / ((float) (itemCount - 2));
    }

    /* renamed from: e */
    public final void mo150236e() {
        this.f313590n = new RecyclerView(getContext(), (AttributeSet) null);
        this.f313590n.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f313590n.setHasFixedSize(true);
        C76577a.m92157h(getContext(), C0966R.dimen.as5);
        this.f313593q = C76577a.m92157h(getContext(), C0966R.dimen.as4);
        addView(this.f313590n, new RelativeLayout.LayoutParams(-1, -1));
        this.f313592p = new SliderSeekBar(getContext(), (AttributeSet) null);
        addView(this.f313592p, new RelativeLayout.LayoutParams(-1, -1));
        this.f313592p.setOnSliderTouchListener(this.f313598v);
        this.f313590n.mo17043c(this.f313597u);
    }

    /* renamed from: f */
    public void mo150237f(String str) {
        Log.m105925i("RecyclerThumbSeekBar", "initAsync %s", str);
        if (Util.isNullOrNil(str) || !C86013q1.m106450k(str)) {
            MMHandlerThread.postToMainThread(new C105483g(this));
            return;
        }
        this.f313583d = str;
        post(this.f313596t);
    }

    /* renamed from: g */
    public void mo150238g() {
        C105466h hVar;
        this.f313585f = -1;
        this.f313583d = null;
        C105477c.C105478a aVar = this.f313595s;
        if (aVar != null) {
            aVar.mo150275b();
        }
        C105465g gVar = this.f313591o;
        if (!(gVar == null || (hVar = gVar.f313610d) == null)) {
            MMHandler[] mMHandlerArr = hVar.f313618c;
            if (mMHandlerArr != null && mMHandlerArr.length != 0) {
                int i = 0;
                while (true) {
                    MMHandler[] mMHandlerArr2 = hVar.f313618c;
                    if (i >= mMHandlerArr2.length) {
                        break;
                    }
                    MMHandler mMHandler = mMHandlerArr2[i];
                    if (mMHandler != null) {
                        mMHandler.getSerial().f328238b.mo182313f();
                        hVar.f313618c[i] = null;
                    }
                    i++;
                }
            }
            this.f313591o.f313610d = null;
            this.f313591o = null;
        }
        SliderSeekBar sliderSeekBar = this.f313592p;
        if (sliderSeekBar != null) {
            sliderSeekBar.mo150253d();
        }
    }

    public int getDurationMs() {
        return this.f313585f;
    }

    public void setCurrentCursorPosition(float f) {
        SliderSeekBar sliderSeekBar = this.f313592p;
        C105465g gVar = this.f313591o;
        float f2 = 0.0f;
        if (!(gVar == null || this.f313590n == null)) {
            float itemCount = ((float) (gVar.getItemCount() - 2)) * f;
            int floor = (int) Math.floor((double) itemCount);
            float f3 = itemCount - ((float) floor);
            RecyclerView.C16631z I0 = this.f313590n.mo17023I0(floor + 1);
            if (I0 != null) {
                View view = I0.f44854d;
                f2 = (((float) view.getLeft()) + (((float) view.getWidth()) * f3)) / ((float) getWidth());
            }
        }
        sliderSeekBar.setCursorPos(f2);
    }

    public void setOnPreparedListener(C105475a aVar) {
        this.f313588i = aVar;
    }

    public void setThumbBarSeekListener(C105476b bVar) {
        this.f313589j = bVar;
    }

    public void setVideoTransPara(VideoTransPara videoTransPara) {
        this.f313594r = videoTransPara;
        if (videoTransPara.f267170h <= videoTransPara.f267171i) {
            this.f313592p.f313629f = true;
        }
    }

    public RecyclerThumbSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo150236e();
    }

    public RecyclerThumbSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo150236e();
    }
}
