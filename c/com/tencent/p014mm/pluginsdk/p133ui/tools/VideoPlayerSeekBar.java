package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.util.ArrayList;
import vd3.C102173o;
import xn2.C102693c;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar */
public class VideoPlayerSeekBar extends AdVideoPlayerLoadingBar implements C102173o {

    /* renamed from: D */
    public static final /* synthetic */ int f283819D = 0;

    /* renamed from: A */
    public int f283820A = -1;

    /* renamed from: B */
    public int f283821B = -1;

    /* renamed from: C */
    public int f283822C = -1;

    /* renamed from: y */
    public PInt f283823y = new PInt();

    /* renamed from: z */
    public boolean f283824z = false;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar$a */
    public class C96859a implements View.OnTouchListener {
        public C96859a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/VideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                Log.m105924i("MicroMsg.VideoPlayerSeekBar", "ontouch down");
                VideoPlayerSeekBar videoPlayerSeekBar = VideoPlayerSeekBar.this;
                int i = VideoPlayerSeekBar.f283819D;
                videoPlayerSeekBar.f273532s = false;
                videoPlayerSeekBar.f273533t = motionEvent.getX();
                C102693c cVar = VideoPlayerSeekBar.this.f273520d;
                if (cVar != null) {
                    cVar.onSeekPre();
                }
            } else if (motionEvent.getAction() == 2) {
                float x = motionEvent.getX();
                VideoPlayerSeekBar videoPlayerSeekBar2 = VideoPlayerSeekBar.this;
                int i2 = VideoPlayerSeekBar.f283819D;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) videoPlayerSeekBar2.f273524h.getLayoutParams();
                VideoPlayerSeekBar videoPlayerSeekBar3 = VideoPlayerSeekBar.this;
                int t = VideoPlayerSeekBar.m124417t(videoPlayerSeekBar3, layoutParams.leftMargin + ((int) (x - videoPlayerSeekBar3.f273533t)), videoPlayerSeekBar3.f283823y);
                layoutParams.leftMargin = t;
                VideoPlayerSeekBar.this.f273524h.setLayoutParams(layoutParams);
                VideoPlayerSeekBar videoPlayerSeekBar4 = VideoPlayerSeekBar.this;
                int i3 = videoPlayerSeekBar4.f283823y.value;
                if (videoPlayerSeekBar4.f273528o > 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) videoPlayerSeekBar4.f273522f.getLayoutParams();
                    layoutParams2.width = t;
                    VideoPlayerSeekBar.this.f273522f.setLayoutParams(layoutParams2);
                }
                VideoPlayerSeekBar.this.setPlayTimeText(i3);
                C102693c cVar2 = VideoPlayerSeekBar.this.f273520d;
                if (cVar2 != null) {
                    cVar2.mo4336c(i3);
                }
                VideoPlayerSeekBar.this.f273532s = true;
            } else {
                VideoPlayerSeekBar videoPlayerSeekBar5 = VideoPlayerSeekBar.this;
                int i4 = VideoPlayerSeekBar.f283819D;
                int i5 = videoPlayerSeekBar5.f273529p;
                if (videoPlayerSeekBar5.f273532s) {
                    i5 = videoPlayerSeekBar5.f283823y.value;
                    videoPlayerSeekBar5.f273529p = i5;
                }
                if (videoPlayerSeekBar5.f273520d != null) {
                    Log.m105924i("MicroMsg.VideoPlayerSeekBar", "current time : " + i5);
                    VideoPlayerSeekBar.this.f273520d.mo4335a(i5);
                }
                VideoPlayerSeekBar.this.f273532s = false;
            }
            C117292a.m165362h(true, this, "com/tencent/mm/pluginsdk/ui/tools/VideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    public VideoPlayerSeekBar(Context context) {
        super(context);
    }

    private int getBarPointPaddingLeft() {
        if (this.f283821B == -1) {
            this.f283821B = this.f273524h.getPaddingLeft();
        }
        return this.f283821B;
    }

    private int getBarPointPaddingRight() {
        if (this.f283822C == -1) {
            this.f283822C = this.f273524h.getPaddingRight();
        }
        return this.f283822C;
    }

    /* renamed from: t */
    public static int m124417t(VideoPlayerSeekBar videoPlayerSeekBar, int i, PInt pInt) {
        int barPointPaddingLeft = ((FrameLayout.LayoutParams) videoPlayerSeekBar.f273523g.getLayoutParams()).leftMargin - videoPlayerSeekBar.getBarPointPaddingLeft();
        int i2 = i - barPointPaddingLeft;
        double barLen = (((double) i2) * 1.0d) / ((double) videoPlayerSeekBar.getBarLen());
        int i3 = videoPlayerSeekBar.f273528o;
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

    /* renamed from: a */
    public void mo130492a(int i) {
        seek(i);
    }

    /* renamed from: c */
    public void mo130494c(boolean z) {
        setIsPlay(z);
    }

    public int getBarPointWidth() {
        if (this.f283820A == -1) {
            this.f283820A = this.f273524h.getWidth();
        }
        return this.f283820A;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cbn;
    }

    public ImageView getPlayBtn() {
        return this.f273525i;
    }

    public TextView getPlaytimeTv() {
        return this.f273526j;
    }

    /* renamed from: p */
    public void mo36657p() {
        View inflate = View.inflate(getContext(), getLayoutId(), this);
        this.f273521e = inflate;
        this.f273522f = (ImageView) inflate.findViewById(C0966R.C0970id.hxl);
        this.f273523g = (ImageView) this.f273521e.findViewById(C0966R.C0970id.hxk);
        this.f273524h = (ImageView) this.f273521e.findViewById(C0966R.C0970id.hxo);
        this.f273525i = (ImageView) this.f273521e.findViewById(C0966R.C0970id.hwy);
        this.f273526j = (TextView) this.f273521e.findViewById(C0966R.C0970id.f358927hx0);
        this.f273527n = (TextView) this.f273521e.findViewById(C0966R.C0970id.hx_);
        this.f273524h.setOnTouchListener(new C96859a());
    }

    /* renamed from: r */
    public void mo36658r() {
        int i;
        if (this.f273528o != 0 && !this.f273532s && this.f273524h != null && getBarLen() != 0) {
            setPlayTimeText(this.f273529p);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f273524h.getLayoutParams();
            int barLen = getBarLen();
            int i2 = this.f273529p;
            if (i2 <= 0) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f273523g.getLayoutParams();
                i = 0;
            } else {
                int i3 = this.f273528o;
                i = i2 >= i3 ? barLen - (((getBarPointWidth() - getBarPointPaddingLeft()) - getBarPointPaddingRight()) / 2) : (int) (((((double) i2) * 1.0d) / ((double) i3)) * ((double) barLen));
            }
            layoutParams.leftMargin = i;
            this.f273524h.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f273522f.getLayoutParams();
            layoutParams3.width = (int) (((((double) this.f273529p) * 1.0d) / ((double) this.f273528o)) * ((double) barLen));
            this.f273522f.setLayoutParams(layoutParams3);
            requestLayout();
        }
    }

    public void seek(int i) {
        Log.m105918d("MicroMsg.VideoPlayerSeekBar", "seek position : " + i);
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f273528o;
        if (i >= i2) {
            i = i2;
        }
        if (this.f273529p != i) {
            this.f273529p = i;
            mo36658r();
        }
    }

    public void setIsPlay(boolean z) {
        this.f283824z = z;
        super.setIsPlay(z);
    }

    public void setPlayBtnOnClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f273525i;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setPlayTimeText(int i) {
        TextView textView = this.f273526j;
        textView.setText(mo130086q(i / 60) + XVFSFile.PATH_SEPARATOR + mo130086q(i % 60));
    }

    public void setVideoTotalTime(int i) {
        this.f273528o = i;
        this.f273529p = 0;
        TextView textView = this.f273527n;
        textView.setText(mo130086q(this.f273528o / 60) + XVFSFile.PATH_SEPARATOR + mo130086q(this.f273528o % 60));
        mo36658r();
    }

    public VideoPlayerSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoPlayerSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
