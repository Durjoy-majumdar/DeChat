package p22;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85924r4;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84956g1;
import com.tencent.p014mm.plugin.lite.keyboard.LiteAppNumberKeyboardView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.WeakHashMap;
import kg3.C76577a;
import p849e3.C107168a0;
import p849e3.C107207u;
import pt0.C110246a;

/* renamed from: p22.k */
public final class C110125k extends LinearLayout implements C84956g1 {

    /* renamed from: i */
    public static final /* synthetic */ int f329468i = 0;

    /* renamed from: d */
    public View f329469d;

    /* renamed from: e */
    public boolean f329470e = false;

    /* renamed from: f */
    public C110126a f329471f;

    /* renamed from: g */
    public LiteAppNumberKeyboardView f329472g;

    /* renamed from: h */
    public EditText f329473h;

    /* renamed from: p22.k$a */
    public interface C110126a {
        void onDone();
    }

    public C110125k(Context context) {
        super(context);
        Log.m105918d("MicroMsg.LiteAppNumberKeyboardPanel", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        super.setId(C0966R.C0970id.f5933so);
        setOrientation(1);
        setBackgroundColor(-1);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, C76577a.m92151b(getContext(), 30));
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6508gq, (ViewGroup) null);
        this.f329469d = inflate;
        inflate.setOnClickListener(new C110124j(this));
        addView(this.f329469d, layoutParams);
        Activity activity = (Activity) getContext();
        WindowInsets b = C85924r4.m106237b(activity);
        int c = (Build.VERSION.SDK_INT < 30 || b == null) ? C75044y4.m89991c(activity) : b.getInsets(WindowInsets.Type.navigationBars()).bottom;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C76577a.m92151b(getContext(), 240));
        layoutParams2.setMargins(0, 0, 0, c);
        LiteAppNumberKeyboardView liteAppNumberKeyboardView = new LiteAppNumberKeyboardView(getContext());
        this.f329472g = liteAppNumberKeyboardView;
        addView(liteAppNumberKeyboardView, layoutParams2);
    }

    public EditText getAttachedEditText() {
        return this.f329473h;
    }

    public int getMinimumHeight() {
        return 0;
    }

    public int getPanelHeight() {
        return C76577a.m92151b(getContext(), 270);
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

    public void setForceLight(boolean z) {
        if (z && C85875k4.m106211z()) {
            this.f329469d.setBackgroundResource(C0966R.color.BW_BG_100);
            this.f329469d.findViewById(C0966R.C0970id.c7p).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
            this.f329469d.findViewById(C0966R.C0970id.ao4).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
            this.f329472g.mo148877a();
        }
    }

    public void setId(int i) {
    }

    public <_Input extends EditText & C110246a> void setInputEditText(_Input _input) {
        this.f329473h = _input;
        LiteAppNumberKeyboardView liteAppNumberKeyboardView = this.f329472g;
        C110246a aVar = (C110246a) _input;
        if (aVar == null) {
            liteAppNumberKeyboardView.f313499z = null;
            return;
        }
        liteAppNumberKeyboardView.getClass();
        liteAppNumberKeyboardView.f313499z = aVar.mo148821i();
    }

    public <_InputEventReceiver extends C110246a> void setInputEventReceiver(_InputEventReceiver _inputeventreceiver) {
        LiteAppNumberKeyboardView liteAppNumberKeyboardView = this.f329472g;
        if (_inputeventreceiver == null) {
            liteAppNumberKeyboardView.f313499z = null;
            return;
        }
        liteAppNumberKeyboardView.getClass();
        liteAppNumberKeyboardView.f313499z = _inputeventreceiver.mo148821i();
    }

    public void setOnDoneListener(C110126a aVar) {
        this.f329471f = aVar;
    }

    public void setVisibility(int i) {
        C110126a aVar;
        if (getVisibility() != i || (getVisibility() != 0 && getVisibility() != 8)) {
            if (i != 0) {
                super.setVisibility(8);
                if (!this.f329470e && (aVar = this.f329471f) != null) {
                    this.f329470e = true;
                    aVar.onDone();
                    this.f329470e = false;
                    return;
                }
                return;
            }
            super.setVisibility(i);
        }
    }

    public void setXMode(int i) {
        this.f329472g.setXMode(i);
    }
}
