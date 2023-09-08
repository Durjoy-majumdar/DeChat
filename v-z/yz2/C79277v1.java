package yz2;

import android.graphics.Bitmap;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: yz2.v1 */
public final class C79277v1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextStatusEditHalfScreenActivity f232725d;

    /* renamed from: e */
    public final /* synthetic */ String f232726e;

    public C79277v1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity, String str) {
        this.f232725d = textStatusEditHalfScreenActivity;
        this.f232726e = str;
    }

    public final void run() {
        TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f232725d;
        Bitmap bitmap = TextStatusEditHalfScreenActivity.f207059m2;
        boolean z = false;
        textStatusEditHalfScreenActivity.mo98580n8(false);
        this.f232725d.showVKB();
        this.f232725d.mo98563V7().requestFocus();
        TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity2 = this.f232725d;
        ImageView imageView = textStatusEditHalfScreenActivity2.f207142i;
        if (imageView != null) {
            String str = this.f232726e;
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                textStatusEditHalfScreenActivity2.mo98558Q7().f147238g.f147088e = str;
                textStatusEditHalfScreenActivity2.mo98539B8(imageView);
            } else {
                Log.m105928w("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "handleAppBrandEmojiPanelDataCallBack:  iconId.isNullOrEmpty() ");
            }
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, ((float) imageView.getWidth()) * 0.5f, ((float) imageView.getHeight()) * 0.5f);
            scaleAnimation.setInterpolator(new AccelerateInterpolator());
            scaleAnimation.setDuration(300);
            imageView.startAnimation(scaleAnimation);
        }
        this.f232725d.mo98563V7().requestFocus();
    }
}
