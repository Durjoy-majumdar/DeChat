package com.tencent.p014mm.p136ui.chatting.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ChattingUIExitBeginEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82088k;
import com.tencent.p014mm.plugin.patmsg.p086ui.AvatarPatTipImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.DoNotCheckLeakForActivities;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import yd2.C79069b;

/* renamed from: com.tencent.mm.ui.chatting.view.ChattingAvatarImageView */
public class ChattingAvatarImageView extends AvatarPatTipImageView {

    /* renamed from: o */
    public static final /* synthetic */ int f216797o = 0;

    /* renamed from: j */
    public IListener<ChattingUIExitBeginEvent> f216798j;

    /* renamed from: n */
    public Runnable f216799n;

    /* renamed from: com.tencent.mm.ui.chatting.view.ChattingAvatarImageView$a */
    public class C73876a implements Runnable {

        /* renamed from: com.tencent.mm.ui.chatting.view.ChattingAvatarImageView$a$a */
        public class C73877a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int[] f216802d;

            public C73877a(int[] iArr) {
                this.f216802d = iArr;
            }

            public void run() {
                int[] iArr = new int[2];
                ChattingAvatarImageView chattingAvatarImageView = ChattingAvatarImageView.this;
                int i = ChattingAvatarImageView.f216797o;
                View contentView = chattingAvatarImageView.f202258i.getContentView();
                contentView.getLocationOnScreen(iArr);
                View findViewById = contentView.findViewById(C0966R.C0970id.kmr);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
                layoutParams.leftMargin = ((this.f216802d[0] + (ChattingAvatarImageView.this.getWidth() / 2)) - iArr[0]) - (findViewById.getWidth() / 2);
                findViewById.setLayoutParams(layoutParams);
            }
        }

        public C73876a() {
        }

        public void run() {
            int[] iArr = new int[2];
            ChattingAvatarImageView.this.getLocationOnScreen(iArr);
            int dimensionPixelSize = MMApplicationContext.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = dimensionPixelSize;
            layoutParams.leftMargin = dimensionPixelSize;
            layoutParams.bottomMargin = -MMApplicationContext.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv);
            ChattingAvatarImageView chattingAvatarImageView = ChattingAvatarImageView.this;
            int i = ChattingAvatarImageView.f216797o;
            chattingAvatarImageView.f202258i.mo96448a(chattingAvatarImageView, 0, 1, layoutParams);
            ChattingAvatarImageView.this.post(new C73877a(iArr));
        }
    }

    public ChattingAvatarImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public float getTipTextSize() {
        try {
            return ((TextView) this.f202258i.getContentView().findViewById(C0966R.C0970id.hrj)).getTextSize();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ChattingAvatarImageView", th, "getTipTextSize err", new Object[0]);
            return 0.0f;
        }
    }

    /* renamed from: o */
    public void mo96445o(CharSequence charSequence) {
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f216799n);
        this.f216798j.dead();
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        IListener<ChattingUIExitBeginEvent> iListener = this.f216798j;
        if (iListener == null) {
            return;
        }
        if (i == 8) {
            iListener.dead();
        } else if (i == 0) {
            iListener.alive();
        }
    }

    public ChattingAvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f216798j = new IListener<ChattingUIExitBeginEvent>(C40008f.f107254d) {
            {
                this.__eventId = -801725607;
            }

            @DoNotCheckLeakForActivities
            public boolean callback(IEvent iEvent) {
                ChattingUIExitBeginEvent chattingUIExitBeginEvent = (ChattingUIExitBeginEvent) iEvent;
                ChattingAvatarImageView chattingAvatarImageView = ChattingAvatarImageView.this;
                int i = ChattingAvatarImageView.f216797o;
                chattingAvatarImageView.f202258i.dismiss();
                ((C79069b) ChattingAvatarImageView.this.f202257h).mo109012a();
                C79069b bVar = (C79069b) ChattingAvatarImageView.this.f202257h;
                bVar.getClass();
                Log.m105918d("MicroMsg.PatHandler", "onDetachPatTipView");
                bVar.f232199e.removeMessages(C82088k.CTRL_INDEX);
                ChattingAvatarImageView.this.f216798j.dead();
                return false;
            }
        };
        this.f216799n = new C73876a();
    }
}
