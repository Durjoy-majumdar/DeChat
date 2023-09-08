package de3;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import rj3.C13010a;
import wd3.C53155r0;

/* renamed from: de3.b0 */
public class C75359b0 extends ClickableSpan implements C13010a {
    private static final String TAG = "MicroMsg.PressableClickSpan";
    private byte _hellAccFlag_;
    private boolean isPressed = false;
    private C75354a mAdTagClickCallback;
    private int mAdTagClickScene;
    private int mBgColor;
    public C45336q mClickListener = null;
    private boolean mEnable = true;
    private C53155r0 mHrefInfo = null;
    private int mLinkColor;
    private String mSessionId;
    private WeakReference<View> mViewRef = null;
    private int position;
    private Object tag = null;
    private Context uiContext = null;

    public C75359b0() {
    }

    private void setColorConfig(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            setColorConfig(i);
        } else {
            setColor(i2, i3);
        }
    }

    public int getBgColor() {
        return this.mBgColor;
    }

    public C53155r0 getHrefInfo() {
        return this.mHrefInfo;
    }

    public boolean getPress() {
        return this.isPressed;
    }

    public Object getTag() {
        return this.tag;
    }

    public int getType() {
        C53155r0 r0Var = this.mHrefInfo;
        if (r0Var == null) {
            return Integer.MAX_VALUE;
        }
        return r0Var.f148313d;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C45336q qVar = this.mClickListener;
        if (!(qVar == null || this.mHrefInfo == null || !this.mEnable)) {
            Context context = this.uiContext;
            if (context == null) {
                context = view.getContext();
            }
            qVar.f122805b = context;
            this.mClickListener.mo23448a(view, this.mHrefInfo);
            this.mClickListener.f122805b = null;
        }
        C75354a aVar = this.mAdTagClickCallback;
        if (aVar != null) {
            aVar.mo105675a(this.position, this.mAdTagClickScene);
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void setAdTagClickCallback(C75354a aVar, int i) {
        this.mAdTagClickCallback = aVar;
        this.position = i;
    }

    public void setAdTagClickScene(int i) {
        this.mAdTagClickScene = i;
    }

    public void setColor(int i, int i2) {
        this.mLinkColor = i;
        this.mBgColor = i2;
    }

    public void setContext(Context context) {
        this.uiContext = context;
        C45336q qVar = this.mClickListener;
        if (qVar != null) {
            qVar.f122805b = context;
        }
    }

    public void setEnable(boolean z) {
        this.mEnable = z;
    }

    public void setIsPressed(boolean z) {
        this.isPressed = z;
    }

    public void setSessionId(String str) {
        this.mSessionId = str;
        C45336q qVar = this.mClickListener;
        if (qVar != null) {
            qVar.f122806c = str;
        }
    }

    public void setTag(Object obj) {
        this.tag = obj;
    }

    public void updateDrawState(TextPaint textPaint) {
        if (Log.getLogLevel() <= 1) {
            Log.m105919d(TAG, "updateDrawState, isPressed:%b", Boolean.valueOf(this.isPressed));
        }
        super.updateDrawState(textPaint);
        textPaint.setColor(this.mLinkColor);
        textPaint.setUnderlineText(false);
        textPaint.linkColor = this.mLinkColor;
        if (getPress()) {
            textPaint.bgColor = this.mBgColor;
        } else {
            textPaint.bgColor = 0;
        }
    }

    public void setColorConfig(int i) {
        Context context = MMApplicationContext.getContext();
        if (i == 1) {
            setColor(context.getResources().getColor(C0966R.color.f3233k6), context.getResources().getColor(C0966R.color.BW_0_Alpha_0_1));
        } else if (i == 2) {
            setColor(context.getResources().getColor(C0966R.color.f3154h3), context.getResources().getColor(C0966R.color.ad7));
        } else if (i == 3) {
            setColor(context.getResources().getColor(C0966R.color.adf), context.getResources().getColor(C0966R.color.ad7));
        } else if (i == 4) {
            setColor(context.getResources().getColor(C0966R.color.f3232k5), context.getResources().getColor(C0966R.color.BW_0_Alpha_0_1));
        } else if (i == 5) {
            setColor(context.getResources().getColor(C0966R.color.a_2), context.getResources().getColor(C0966R.color.ad7));
        }
    }

    public C75359b0(int i, C53155r0 r0Var) {
        int i2;
        int i3 = 0;
        if (r0Var != null) {
            i3 = r0Var.f148320k;
            i2 = r0Var.f148321l;
        } else {
            i2 = 0;
        }
        setColorConfig(i, i3, i2);
        this.mClickListener = new C45336q();
        this.mHrefInfo = r0Var;
    }

    public C75359b0(int i, int i2) {
        setColor(i, i2);
        this.mClickListener = new C45336q();
    }
}
