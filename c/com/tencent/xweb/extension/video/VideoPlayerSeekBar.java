package com.tencent.xweb.extension.video;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.xweb.C106947R;
import j20.C117292a;
import java.util.ArrayList;

public class VideoPlayerSeekBar {
    /* access modifiers changed from: private */
    public final ImageView mBackBar;
    private final ImageView mBarPoint;
    /* access modifiers changed from: private */
    public float mDownX;
    /* access modifiers changed from: private */
    public final ImageView mFrontBar;
    /* access modifiers changed from: private */
    public boolean mIsMoving;
    /* access modifiers changed from: private */
    public float mLastMoveProgress;
    private final ImageView mMiddleBar;
    private float mProgress;
    /* access modifiers changed from: private */
    public IVideoPlaySeekCallback mVideoPlayerSeekCallback;

    public interface IVideoPlaySeekCallback {
        void onProgressChanged(float f, boolean z);

        void onSeekPre();
    }

    public VideoPlayerSeekBar(View view) {
        this.mFrontBar = (ImageView) view.findViewById(C106947R.C20125id.hxl);
        this.mMiddleBar = (ImageView) view.findViewById(C106947R.C20125id.hxm);
        this.mBackBar = (ImageView) view.findViewById(C106947R.C20125id.hxk);
        ImageView imageView = (ImageView) view.findViewById(C106947R.C20125id.hxo);
        this.mBarPoint = imageView;
        imageView.setOnTouchListener(new View.OnTouchListener() {
            private byte _hellAccFlag_;

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/extension/video/VideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                if (motionEvent.getAction() == 0) {
                    boolean unused = VideoPlayerSeekBar.this.mIsMoving = false;
                    float unused2 = VideoPlayerSeekBar.this.mDownX = motionEvent.getX();
                    if (VideoPlayerSeekBar.this.mVideoPlayerSeekCallback != null) {
                        VideoPlayerSeekBar.this.mVideoPlayerSeekCallback.onSeekPre();
                    }
                } else if (motionEvent.getAction() == 2) {
                    float width = ((float) VideoPlayerSeekBar.this.mFrontBar.getWidth()) + (motionEvent.getX() - VideoPlayerSeekBar.this.mDownX);
                    if (width < 0.0f) {
                        width = 0.0f;
                    } else if (width > ((float) VideoPlayerSeekBar.this.mBackBar.getWidth())) {
                        width = (float) VideoPlayerSeekBar.this.mBackBar.getWidth();
                    }
                    VideoPlayerSeekBar videoPlayerSeekBar = VideoPlayerSeekBar.this;
                    float unused3 = videoPlayerSeekBar.mLastMoveProgress = (width * 100.0f) / ((float) videoPlayerSeekBar.mBackBar.getWidth());
                    VideoPlayerSeekBar videoPlayerSeekBar2 = VideoPlayerSeekBar.this;
                    videoPlayerSeekBar2.setProgress(videoPlayerSeekBar2.mLastMoveProgress, true);
                    if (VideoPlayerSeekBar.this.mVideoPlayerSeekCallback != null) {
                        VideoPlayerSeekBar.this.mVideoPlayerSeekCallback.onSeekPre();
                    }
                    boolean unused4 = VideoPlayerSeekBar.this.mIsMoving = true;
                } else {
                    if (VideoPlayerSeekBar.this.mIsMoving && VideoPlayerSeekBar.this.mVideoPlayerSeekCallback != null) {
                        VideoPlayerSeekBar.this.mVideoPlayerSeekCallback.onProgressChanged(VideoPlayerSeekBar.this.mLastMoveProgress, true);
                    }
                    boolean unused5 = VideoPlayerSeekBar.this.mIsMoving = false;
                }
                C117292a.m165362h(true, this, "com/tencent/xweb/extension/video/VideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        });
    }

    public float getProgress() {
        return this.mProgress;
    }

    public int progressToEdge(float f) {
        int width = this.mBackBar.getWidth();
        if (f <= 0.0f) {
            return 0;
        }
        return f >= 100.0f ? width - (((this.mBarPoint.getWidth() - this.mBarPoint.getPaddingLeft()) - this.mBarPoint.getPaddingRight()) / 2) : (int) ((f / 100.0f) * ((float) (width - (((this.mBarPoint.getWidth() - this.mBarPoint.getPaddingLeft()) - this.mBarPoint.getPaddingRight()) / 2))));
    }

    public void setProgress(float f, boolean z) {
        if ((!this.mIsMoving || z) && this.mBarPoint != null && this.mBackBar.getWidth() != 0) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 100.0f) {
                f = 100.0f;
            }
            this.mProgress = f;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mFrontBar.getLayoutParams();
            layoutParams.width = (int) ((f / 100.0f) * ((float) this.mBackBar.getWidth()));
            this.mFrontBar.setLayoutParams(layoutParams);
            this.mFrontBar.requestLayout();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mBarPoint.getLayoutParams();
            layoutParams2.leftMargin = progressToEdge(f);
            this.mBarPoint.setLayoutParams(layoutParams2);
            this.mBarPoint.requestLayout();
        }
    }

    public void setVideoPlayerSeekCallback(IVideoPlaySeekCallback iVideoPlaySeekCallback) {
        this.mVideoPlayerSeekCallback = iVideoPlaySeekCallback;
    }

    public void updateCacheProgress(double d, double[] dArr) {
        double d2 = 0.0d;
        for (int i = 0; i < dArr.length; i += 2) {
            int i2 = i + 1;
            if (dArr.length > i2) {
                float f = this.mProgress;
                if ((dArr[i] / d) * 100.0d <= ((double) f)) {
                    double d3 = dArr[i2];
                    if ((d3 / d) * 100.0d > ((double) f)) {
                        d2 = (d3 / d) * 100.0d;
                    }
                }
            }
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mMiddleBar.getLayoutParams();
        layoutParams.width = (int) ((d2 / 100.0d) * ((double) this.mBackBar.getWidth()));
        this.mMiddleBar.setLayoutParams(layoutParams);
        this.mMiddleBar.requestLayout();
    }
}
