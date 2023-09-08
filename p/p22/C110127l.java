package p22;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85924r4;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84956g1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84963i1;
import com.tencent.p014mm.plugin.lite.keyboard.LiteAppPayKeyboardView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.WeakHashMap;
import kg3.C76577a;
import p849e3.C107168a0;
import p849e3.C107207u;
import pt0.C110246a;

/* renamed from: p22.l */
public final class C110127l extends LinearLayout implements C84956g1 {

    /* renamed from: g */
    public static final /* synthetic */ int f329474g = 0;

    /* renamed from: d */
    public boolean f329475d = false;

    /* renamed from: e */
    public C110128a f329476e;

    /* renamed from: f */
    public LiteAppPayKeyboardView f329477f;

    /* renamed from: p22.l$a */
    public interface C110128a {
        void onDone();
    }

    public C110127l(Context context) {
        super(context);
        Log.m105918d("MicroMsg.LiteAppPayKeyboardPanel", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        super.setId(C0966R.C0970id.o97);
        setOrientation(1);
        setBackgroundColor(-1);
        Activity activity = (Activity) getContext();
        WindowInsets b = C85924r4.m106237b(activity);
        int c = (Build.VERSION.SDK_INT < 30 || b == null) ? C75044y4.m89991c(activity) : b.getInsets(WindowInsets.Type.navigationBars()).bottom;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C76577a.m92151b(getContext(), 240));
        layoutParams.setMargins(0, 0, 0, c - 20);
        LiteAppPayKeyboardView liteAppPayKeyboardView = new LiteAppPayKeyboardView(getContext());
        this.f329477f = liteAppPayKeyboardView;
        addView(liteAppPayKeyboardView, layoutParams);
        this.f329477f.setActionText(activity.getString(C0966R.string.nbq));
    }

    public int getMinimumHeight() {
        return 0;
    }

    public int getPanelHeight() {
        return C76577a.m92151b(getContext(), 240);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllViews();
    }

    /* renamed from: q */
    public boolean mo117827q() {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        return C107207u.C107211e.m145208c(this);
    }

    public void setConfirmBgColor(int i) {
        this.f329477f.setConfirmBgColor(i);
    }

    public void setConfirmColor(int i) {
        this.f329477f.setConfirmColor(i);
    }

    public void setConfirmText(String str) {
        this.f329477f.setActionText(str);
    }

    public void setForceLight(boolean z) {
        this.f329477f.setForceLight(z);
    }

    public void setId(int i) {
    }

    public <_InputEventReceiver extends C110246a> void setInputEventReceiver(_InputEventReceiver _inputeventreceiver) {
        LiteAppPayKeyboardView liteAppPayKeyboardView = this.f329477f;
        liteAppPayKeyboardView.getClass();
        if (_inputeventreceiver != null) {
            if (_inputeventreceiver instanceof View) {
                View view = (View) _inputeventreceiver;
                C84963i1 a = C84963i1.C84964a.m104748a(view.getContext());
                if (a != null) {
                    a.hideVKB();
                }
                view.requestFocus();
            }
            liteAppPayKeyboardView.f313518x = _inputeventreceiver.mo148821i();
        }
    }

    public void setOnDoneListener(C110128a aVar) {
        this.f329476e = aVar;
    }

    public void setVisibility(int i) {
        C110128a aVar;
        if (getVisibility() != i || (getVisibility() != 0 && getVisibility() != 8)) {
            if (i != 0) {
                super.setVisibility(8);
                if (!this.f329475d && (aVar = this.f329476e) != null) {
                    this.f329475d = true;
                    aVar.onDone();
                    this.f329475d = false;
                    return;
                }
                return;
            }
            super.setVisibility(i);
        }
    }
}
