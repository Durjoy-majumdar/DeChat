package p993kc;

import android.view.View;
import android.widget.EditText;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32226l;
import gy3.C87412m;
import ll0.C88573d;
import rt0.C77568i;
import rx3.C13598b0;

/* renamed from: kc.a */
public final class C88134a implements C108995d {
    /* renamed from: a */
    public void mo122527a() {
        Log.m105924i("Luggage.DummyExtendKeyboard", "showKeyboard");
    }

    /* renamed from: b */
    public int mo122528b() {
        Log.m105924i("Luggage.DummyExtendKeyboard", "getToolbarHeight");
        return 0;
    }

    /* renamed from: c */
    public boolean mo122529c(EditText editText) {
        C87412m.m108594g(editText, MimeTypes.BASE_TYPE_TEXT);
        Log.m105924i("Luggage.DummyExtendKeyboard", "releaseEditText");
        return false;
    }

    /* renamed from: d */
    public void mo122530d(boolean z) {
        Log.m105924i("Luggage.DummyExtendKeyboard", "onKeyboardStateChanged");
    }

    /* renamed from: e */
    public void mo122531e(int i) {
        Log.m105924i("Luggage.DummyExtendKeyboard", "refreshHeight");
    }

    /* renamed from: f */
    public void mo122532f(EditText editText) {
        C87412m.m108594g(editText, MimeTypes.BASE_TYPE_TEXT);
        Log.m105924i("Luggage.DummyExtendKeyboard", "attachEditText");
    }

    /* renamed from: g */
    public void mo122533g(C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, "l");
        Log.m105924i("Luggage.DummyExtendKeyboard", "setOnDoneListener");
    }

    public View getView() {
        Log.m105924i("Luggage.DummyExtendKeyboard", "getView");
        return null;
    }

    /* renamed from: h */
    public void mo122535h(boolean z) {
        Log.m105924i("Luggage.DummyExtendKeyboard", "updateToolbar");
    }

    public void hideKeyboard() {
        Log.m105924i("Luggage.DummyExtendKeyboard", C88573d.NAME);
    }

    /* renamed from: i */
    public void mo122537i(C77568i iVar) {
        C87412m.m108594g(iVar, "params");
        Log.m105924i("Luggage.DummyExtendKeyboard", "updateParams");
    }

    /* renamed from: j */
    public void mo122538j(C84983t0.C84990i iVar) {
        C87412m.m108594g(iVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Log.m105924i("Luggage.DummyExtendKeyboard", "addOnHeightChangedListener");
    }

    /* renamed from: o */
    public void mo122539o(C84983t0.C84990i iVar) {
        Log.m105924i("Luggage.DummyExtendKeyboard", "removeOnHeightChangeListener");
    }

    /* renamed from: q */
    public boolean mo117827q() {
        Log.m105924i("Luggage.DummyExtendKeyboard", "isRealHeightSettled");
        return false;
    }

    public void setXMode(int i) {
        Log.m105924i("Luggage.DummyExtendKeyboard", "setXMode");
    }
}
