package com.tencent.p014mm.plugin.facedetect.views;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.facedetect.views.FaceNumberItemView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.facedetect.views.FaceNumberView */
public class FaceNumberView extends LinearLayout {

    /* renamed from: d */
    public String f197983d;

    /* renamed from: e */
    public int f197984e;

    /* renamed from: f */
    public ViewGroup f197985f;

    /* renamed from: g */
    public FaceNumberItemView[] f197986g;

    /* renamed from: h */
    public int f197987h;

    /* renamed from: i */
    public Animation f197988i;

    public FaceNumberView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: a */
    public void mo94777a(String str) {
        this.f197983d = str;
        int i = 0;
        if (str != null) {
            this.f197984e = str.length();
        } else {
            this.f197984e = 0;
        }
        FaceNumberItemView[] faceNumberItemViewArr = this.f197986g;
        if (faceNumberItemViewArr != null && faceNumberItemViewArr.length > 0) {
            if (!Util.isNullOrNil(this.f197983d)) {
                while (i < this.f197986g.length) {
                    String str2 = "";
                    if (this.f197984e > i) {
                        str2 = this.f197983d.charAt(i) + str2;
                        if (this.f197984e == i + 1) {
                            FaceNumberItemView faceNumberItemView = this.f197986g[i];
                            faceNumberItemView.f197975d.stopped();
                            MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new FaceNumberItemView.C29921b(faceNumberItemView.f197981j), true);
                            faceNumberItemView.f197975d = mTimerHandler;
                            mTimerHandler.startTimer(0, 29);
                        } else {
                            this.f197986g[i].f197975d.stopped();
                            FaceNumberItemView faceNumberItemView2 = this.f197986g[i];
                            faceNumberItemView2.f197980i = 30;
                            faceNumberItemView2.invalidate();
                        }
                    }
                    mo94778b(this.f197986g[i], str2);
                    i++;
                }
                return;
            }
            while (true) {
                FaceNumberItemView[] faceNumberItemViewArr2 = this.f197986g;
                if (i < faceNumberItemViewArr2.length) {
                    mo94778b(faceNumberItemViewArr2[i], "point");
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo94778b(FaceNumberItemView faceNumberItemView, String str) {
        if (faceNumberItemView != null) {
            if (str.equals("0")) {
                faceNumberItemView.setImageResource(C0966R.C0969drawable.c0_);
            } else if (str.equals("1")) {
                faceNumberItemView.setImageResource(C0966R.C0969drawable.c0a);
            } else if (str.equals("2")) {
                faceNumberItemView.setImageResource(C0966R.C0969drawable.c0b);
            } else if (str.equals("3")) {
                faceNumberItemView.setImageResource(C0966R.C0969drawable.c0c);
            } else if (str.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL)) {
                faceNumberItemView.setImageResource(C0966R.C0969drawable.c0d);
            } else if (str.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY)) {
                faceNumberItemView.setImageResource(C0966R.C0969drawable.c0e);
            } else if (str.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN)) {
                faceNumberItemView.setImageResource(C0966R.C0969drawable.c0f);
            } else if (str.equals("7")) {
                faceNumberItemView.setImageResource(C0966R.C0969drawable.c0g);
            } else if (str.equals("8")) {
                faceNumberItemView.setImageResource(C0966R.C0969drawable.c0h);
            } else if (str.equals("9")) {
                faceNumberItemView.setImageResource(C0966R.C0969drawable.c0i);
            } else {
                faceNumberItemView.setImageResource(C0966R.C0969drawable.c0j);
            }
        }
    }

    public void setNumberLengthAndInflate(int i) {
        int i2;
        int i3;
        if (i > 12) {
            Log.m105921e("MicroMsg.Facing.MMPwdInputView", "hy: number length exceed max length: %d", Integer.valueOf(i));
        } else if (i <= 0) {
            Log.m105921e("MicroMsg.Facing.MMPwdInputView", "hy: number length exceed min length: %d", Integer.valueOf(i));
        } else if (i == this.f197987h) {
            Log.m105924i("MicroMsg.Facing.MMPwdInputView", "hy: already correct length. quit");
            mo94777a((String) null);
        } else {
            this.f197985f.removeAllViews();
            this.f197987h = i;
            this.f197986g = new FaceNumberItemView[i];
            for (int i4 = 0; i4 < i; i4++) {
                FaceNumberItemView faceNumberItemView = (FaceNumberItemView) View.inflate(getContext(), C0966R.C0971layout.a5w, (ViewGroup) null);
                faceNumberItemView.setImageResource(C0966R.C0969drawable.c0j);
                if (i4 == 0) {
                    i2 = 3;
                    i3 = (getResources().getDimensionPixelSize(C0966R.dimen.a5h) + C76577a.m92151b(getContext(), 48)) / 2;
                } else if (i4 == i - 1) {
                    i2 = 5;
                    i3 = (getResources().getDimensionPixelSize(C0966R.dimen.a5h) + C76577a.m92151b(getContext(), 48)) / 2;
                } else {
                    i2 = 17;
                    i3 = getResources().getDimensionPixelSize(C0966R.dimen.a5h);
                }
                faceNumberItemView.setGravity(i2);
                this.f197986g[i4] = faceNumberItemView;
                this.f197985f.addView(faceNumberItemView, new ViewGroup.LayoutParams(i3, getResources().getDimensionPixelSize(C0966R.dimen.a5f)));
            }
        }
    }

    public FaceNumberView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f197983d = null;
        this.f197986g = null;
        this.f197987h = 0;
        ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), C0966R.C0971layout.a5v, (ViewGroup) null);
        this.f197985f = viewGroup;
        addView(viewGroup);
        this.f197988i = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2456di);
    }
}
