package com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar */
public class VideoPlayerSeekBar extends AdVideoPlayerLoadingBar implements C17978c.C17980b {

    /* renamed from: A */
    public int f49642A = -1;

    /* renamed from: B */
    public int f49643B = -1;

    /* renamed from: y */
    public PInt f49644y = new PInt();

    /* renamed from: z */
    public int f49645z = -1;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar$a */
    public class C17996a implements View.OnTouchListener {
        public C17996a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/video/progressbar/VideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                Log.m105924i("MicroMsg.Video.VideoPlayerSeekBar", "ontouch down");
                VideoPlayerSeekBar videoPlayerSeekBar = VideoPlayerSeekBar.this;
                videoPlayerSeekBar.f49605s = false;
                videoPlayerSeekBar.f49606t = motionEvent.getX();
                C17978c.C17982d dVar = VideoPlayerSeekBar.this.f49593d;
                if (dVar != null) {
                    dVar.onSeekPre();
                }
            } else if (motionEvent.getAction() == 2) {
                float x = motionEvent.getX();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) VideoPlayerSeekBar.this.f49597h.getLayoutParams();
                VideoPlayerSeekBar videoPlayerSeekBar2 = VideoPlayerSeekBar.this;
                int g = VideoPlayerSeekBar.m18515g(videoPlayerSeekBar2, layoutParams.leftMargin + ((int) (x - videoPlayerSeekBar2.f49606t)), videoPlayerSeekBar2.f49644y);
                layoutParams.leftMargin = g;
                VideoPlayerSeekBar.this.f49597h.setLayoutParams(layoutParams);
                VideoPlayerSeekBar videoPlayerSeekBar3 = VideoPlayerSeekBar.this;
                int i = videoPlayerSeekBar3.f49644y.value;
                if (videoPlayerSeekBar3.f49601o > 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) videoPlayerSeekBar3.f49595f.getLayoutParams();
                    layoutParams2.width = g;
                    VideoPlayerSeekBar.this.f49595f.setLayoutParams(layoutParams2);
                }
                TextView textView = VideoPlayerSeekBar.this.f49599j;
                textView.setText(VideoPlayerSeekBar.this.mo22383d(i / 60) + XVFSFile.PATH_SEPARATOR + VideoPlayerSeekBar.this.mo22383d(i % 60));
                VideoPlayerSeekBar.this.f49605s = true;
            } else {
                VideoPlayerSeekBar videoPlayerSeekBar4 = VideoPlayerSeekBar.this;
                int i2 = videoPlayerSeekBar4.f49602p;
                if (videoPlayerSeekBar4.f49605s) {
                    i2 = videoPlayerSeekBar4.f49644y.value;
                    videoPlayerSeekBar4.f49602p = i2;
                }
                if (videoPlayerSeekBar4.f49593d != null) {
                    Log.m105924i("MicroMsg.Video.VideoPlayerSeekBar", "current time : " + i2);
                    VideoPlayerSeekBar.this.f49593d.mo22286a(i2);
                }
                VideoPlayerSeekBar.this.f49605s = false;
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/jsapi/video/progressbar/VideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    public VideoPlayerSeekBar(Context context) {
        super(context);
    }

    /* renamed from: g */
    public static int m18515g(VideoPlayerSeekBar videoPlayerSeekBar, int i, PInt pInt) {
        int barPointPaddingLeft = ((FrameLayout.LayoutParams) videoPlayerSeekBar.f49596g.getLayoutParams()).leftMargin - videoPlayerSeekBar.getBarPointPaddingLeft();
        int i2 = i - barPointPaddingLeft;
        double barLen = (((double) i2) * 1.0d) / ((double) videoPlayerSeekBar.getBarLen());
        int i3 = videoPlayerSeekBar.f49601o;
        int i4 = (int) (barLen * ((double) i3));
        pInt.value = i4;
        if (i4 <= 0) {
            pInt.value = 0;
            if (i2 > barPointPaddingLeft) {
                barPointPaddingLeft = i2;
            }
            return barPointPaddingLeft;
        } else if (i4 < i3) {
            return i2;
        } else {
            pInt.value = i3;
            return videoPlayerSeekBar.getBarLen() - (((videoPlayerSeekBar.getBarPointWidth() - videoPlayerSeekBar.getBarPointPaddingLeft()) - videoPlayerSeekBar.getBarPointPaddingRight()) / 2);
        }
    }

    private int getBarPointPaddingLeft() {
        if (this.f49642A == -1) {
            this.f49642A = this.f49597h.getPaddingLeft();
        }
        return this.f49642A;
    }

    private int getBarPointPaddingRight() {
        if (this.f49643B == -1) {
            this.f49643B = this.f49597h.getPaddingRight();
        }
        return this.f49643B;
    }

    /* renamed from: a */
    public void mo22372a(int i) {
        seek(i);
    }

    /* renamed from: b */
    public void mo22382b() {
        View inflate = View.inflate(getContext(), getLayoutId(), this);
        this.f49594e = inflate;
        this.f49595f = (ImageView) inflate.findViewById(C0966R.C0970id.hxl);
        this.f49596g = (ImageView) this.f49594e.findViewById(C0966R.C0970id.hxk);
        this.f49597h = (ImageView) this.f49594e.findViewById(C0966R.C0970id.hxo);
        this.f49598i = (ImageView) this.f49594e.findViewById(C0966R.C0970id.hwy);
        this.f49599j = (TextView) this.f49594e.findViewById(C0966R.C0970id.f358927hx0);
        this.f49600n = (TextView) this.f49594e.findViewById(C0966R.C0970id.hx_);
        this.f49597h.setOnTouchListener(new C17996a());
    }

    /* renamed from: c */
    public void mo22373c(boolean z) {
        setIsPlay(z);
    }

    /* renamed from: e */
    public void mo22384e() {
        if (this.f49601o != 0 && !this.f49605s && this.f49597h != null && getBarLen() != 0) {
            TextView textView = this.f49599j;
            textView.setText(mo22383d(this.f49602p / 60) + XVFSFile.PATH_SEPARATOR + mo22383d(this.f49602p % 60));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f49597h.getLayoutParams();
            int barLen = getBarLen();
            layoutParams.leftMargin = mo22409h(this.f49602p, barLen);
            this.f49597h.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f49595f.getLayoutParams();
            layoutParams2.width = (int) (((((double) this.f49602p) * 1.0d) / ((double) this.f49601o)) * ((double) barLen));
            this.f49595f.setLayoutParams(layoutParams2);
            requestLayout();
        }
    }

    public int getBarPointWidth() {
        if (this.f49645z == -1) {
            this.f49645z = this.f49597h.getWidth();
        }
        return this.f49645z;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6488g7;
    }

    public ImageView getPlayBtn() {
        return this.f49598i;
    }

    public TextView getPlaytimeTv() {
        return this.f49599j;
    }

    /* renamed from: h */
    public int mo22409h(int i, int i2) {
        if (i <= 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f49596g.getLayoutParams();
            return 0;
        }
        int i3 = this.f49601o;
        return i >= i3 ? i2 - (((getBarPointWidth() - getBarPointPaddingLeft()) - getBarPointPaddingRight()) / 2) : (int) (((((double) i) * 1.0d) / ((double) i3)) * ((double) i2));
    }

    public void seek(int i) {
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f49601o;
        if (i >= i2) {
            i = i2;
        }
        if (this.f49602p != i) {
            this.f49602p = i;
            mo22384e();
        }
    }

    public void setIsPlay(boolean z) {
        super.setIsPlay(z);
    }

    public void setPlayBtnOnClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f49598i;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setVideoTotalTime(int i) {
        this.f49601o = i;
        this.f49602p = 0;
        TextView textView = this.f49600n;
        textView.setText(mo22383d(this.f49601o / 60) + XVFSFile.PATH_SEPARATOR + mo22383d(this.f49601o % 60));
        mo22384e();
    }

    public VideoPlayerSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoPlayerSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
