package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;

/* renamed from: com.tencent.mm.ui.base.MMFalseProgressBar */
public class MMFalseProgressBar extends ProgressBar {

    /* renamed from: o */
    public static final /* synthetic */ int f55810o = 0;

    /* renamed from: d */
    public boolean f55811d;

    /* renamed from: e */
    public float f55812e;

    /* renamed from: f */
    public float f55813f;

    /* renamed from: g */
    public float f55814g;

    /* renamed from: h */
    public float f55815h;

    /* renamed from: i */
    public float f55816i;

    /* renamed from: j */
    public boolean f55817j;

    /* renamed from: n */
    public MMHandler f55818n;

    /* renamed from: com.tencent.mm.ui.base.MMFalseProgressBar$a */
    public class C19679a extends MMHandler {
        public C19679a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Float f;
            switch (message.what) {
                case 1000:
                    MMFalseProgressBar mMFalseProgressBar = MMFalseProgressBar.this;
                    int i = MMFalseProgressBar.f55810o;
                    mMFalseProgressBar.setVisibility(0);
                    mMFalseProgressBar.setAlpha(1.0f);
                    return;
                case 1001:
                    MMFalseProgressBar mMFalseProgressBar2 = MMFalseProgressBar.this;
                    float f2 = mMFalseProgressBar2.f55812e;
                    if (f2 < 600.0f) {
                        mMFalseProgressBar2.f55812e = f2 + mMFalseProgressBar2.f55813f;
                    } else if (f2 >= 600.0f && f2 < 800.0f) {
                        mMFalseProgressBar2.f55812e = f2 + mMFalseProgressBar2.f55814g;
                    } else if (f2 >= 800.0f && f2 < 920.0f) {
                        mMFalseProgressBar2.f55812e = f2 + mMFalseProgressBar2.f55815h;
                    }
                    MMHandler mMHandler = mMFalseProgressBar2.f55818n;
                    if (mMHandler != null) {
                        if (mMFalseProgressBar2.f55812e < 920.0f) {
                            mMHandler.sendEmptyMessageDelayed(1001, 10);
                        } else {
                            mMHandler.removeMessages(1001);
                        }
                    }
                    mMFalseProgressBar2.setProgress((int) mMFalseProgressBar2.f55812e);
                    return;
                case 1002:
                    MMFalseProgressBar mMFalseProgressBar3 = MMFalseProgressBar.this;
                    if (mMFalseProgressBar3.f55811d) {
                        float f3 = mMFalseProgressBar3.f55812e;
                        float f4 = 950.0f;
                        if (f3 < 950.0f) {
                            float f5 = f3 + mMFalseProgressBar3.f55816i;
                            mMFalseProgressBar3.f55812e = f5;
                            if (f5 <= 950.0f) {
                                f4 = f5;
                            }
                            mMFalseProgressBar3.f55812e = f4;
                            f = Float.valueOf(1.0f);
                        } else {
                            float f6 = f3 + 1.0f;
                            mMFalseProgressBar3.f55812e = f6;
                            f = Float.valueOf(((1000.0f - f6) * 0.01f) + 0.3f);
                        }
                        MMHandler mMHandler2 = mMFalseProgressBar3.f55818n;
                        if (mMHandler2 != null) {
                            if (mMFalseProgressBar3.f55812e < 1000.0f) {
                                mMHandler2.sendEmptyMessageDelayed(1002, 10);
                            } else {
                                mMFalseProgressBar3.f55812e = 1000.0f;
                                mMHandler2.removeMessages(1002);
                                mMFalseProgressBar3.f55818n.sendEmptyMessageDelayed(1003, 10);
                            }
                        }
                        mMFalseProgressBar3.setAlpha(f.floatValue());
                        mMFalseProgressBar3.setProgress((int) mMFalseProgressBar3.f55812e);
                        return;
                    }
                    return;
                case 1003:
                    MMFalseProgressBar mMFalseProgressBar4 = MMFalseProgressBar.this;
                    mMFalseProgressBar4.f55812e = 0.0f;
                    mMFalseProgressBar4.f55811d = false;
                    mMFalseProgressBar4.postInvalidateDelayed(200);
                    mMFalseProgressBar4.setVisibility(8);
                    return;
                default:
                    return;
            }
        }
    }

    public MMFalseProgressBar(Context context) {
        this(context, (AttributeSet) null);
        mo25982b();
    }

    /* renamed from: a */
    public void mo25981a() {
        Log.m105918d("MicroMsg.MMFalseProgressBar", "[cpan] finish");
        MMHandler mMHandler = this.f55818n;
        if (mMHandler != null) {
            mMHandler.sendEmptyMessage(1002);
        }
    }

    /* renamed from: b */
    public final void mo25982b() {
        if (NetStatusUtil.isWifiOr4G(MMApplicationContext.getContext())) {
            this.f55813f = 4.0f;
            this.f55814g = 1.0f;
            this.f55815h = 0.3f;
            this.f55816i = 50.0f;
            return;
        }
        this.f55813f = 2.0f;
        this.f55814g = 0.5f;
        this.f55815h = 0.15f;
        this.f55816i = 50.0f;
    }

    /* renamed from: c */
    public void mo25983c() {
        Log.m105918d("MicroMsg.MMFalseProgressBar", "[cpan] start");
        if (this.f55817j && !this.f55811d) {
            this.f55811d = true;
            mo25982b();
            MMHandler mMHandler = this.f55818n;
            if (mMHandler != null) {
                mMHandler.sendEmptyMessage(1000);
                this.f55818n.sendEmptyMessage(1001);
            }
        }
    }

    public MMFalseProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MMFalseProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55811d = false;
        this.f55812e = 0.0f;
        this.f55817j = true;
        this.f55818n = new C19679a(Looper.getMainLooper());
        setMax(1000);
        mo25982b();
    }
}
