package com.tencent.p014mm.plugin.appbrand.widget;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.MMFalseProgressBar */
public class MMFalseProgressBar extends ProgressBar {

    /* renamed from: i */
    public static final /* synthetic */ int f49920i = 0;

    /* renamed from: d */
    public float f49921d;

    /* renamed from: e */
    public float f49922e;

    /* renamed from: f */
    public float f49923f;

    /* renamed from: g */
    public float f49924g;

    /* renamed from: h */
    public MMHandler f49925h;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.MMFalseProgressBar$a */
    public class C18064a extends MMHandler {
        public C18064a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1000:
                    MMFalseProgressBar mMFalseProgressBar = MMFalseProgressBar.this;
                    int i = MMFalseProgressBar.f49920i;
                    mMFalseProgressBar.setVisibility(0);
                    mMFalseProgressBar.setAlpha(1.0f);
                    return;
                case 1001:
                    MMFalseProgressBar mMFalseProgressBar2 = MMFalseProgressBar.this;
                    float f = mMFalseProgressBar2.f49921d;
                    if (f < 600.0f) {
                        mMFalseProgressBar2.f49921d = f + mMFalseProgressBar2.f49922e;
                    } else if (f >= 600.0f && f < 800.0f) {
                        mMFalseProgressBar2.f49921d = f + mMFalseProgressBar2.f49923f;
                    } else if (f >= 800.0f && f < 920.0f) {
                        mMFalseProgressBar2.f49921d = f + mMFalseProgressBar2.f49924g;
                    }
                    MMHandler mMHandler = mMFalseProgressBar2.f49925h;
                    if (mMHandler != null) {
                        if (mMFalseProgressBar2.f49921d < 920.0f) {
                            mMHandler.sendEmptyMessageDelayed(1001, 10);
                        } else {
                            mMHandler.removeMessages(1001);
                        }
                    }
                    mMFalseProgressBar2.setProgress((int) mMFalseProgressBar2.f49921d);
                    return;
                case 1002:
                    MMFalseProgressBar mMFalseProgressBar3 = MMFalseProgressBar.this;
                    int i2 = MMFalseProgressBar.f49920i;
                    mMFalseProgressBar3.getClass();
                    return;
                case 1003:
                    MMFalseProgressBar mMFalseProgressBar4 = MMFalseProgressBar.this;
                    mMFalseProgressBar4.f49921d = 0.0f;
                    mMFalseProgressBar4.postInvalidateDelayed(200);
                    mMFalseProgressBar4.setVisibility(8);
                    return;
                default:
                    return;
            }
        }
    }

    public MMFalseProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MMFalseProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49921d = 0.0f;
        this.f49925h = new C18064a(Looper.getMainLooper());
        setMax(1000);
        if (NetStatusUtil.isWifiOr4G(MMApplicationContext.getContext())) {
            this.f49922e = 4.0f;
            this.f49923f = 1.0f;
            this.f49924g = 0.3f;
            return;
        }
        this.f49922e = 2.0f;
        this.f49923f = 0.5f;
        this.f49924g = 0.15f;
    }
}
