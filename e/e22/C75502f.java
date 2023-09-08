package e22;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.plugin.label.p067ui.ContactEditLabel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: e22.f */
public final class C75502f implements TextWatcher {

    /* renamed from: d */
    public MTimerHandler f221873d;

    /* renamed from: e22.f$a */
    public static final class C75503a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ ContactEditLabel f221874d;

        public C75503a(ContactEditLabel contactEditLabel) {
            this.f221874d = contactEditLabel;
        }

        public boolean onTimerExpired() {
            EditText editText = this.f221874d.f198450D;
            if (editText != null) {
                String obj = editText.getText().toString();
                ContactEditLabel.C69040a aVar = this.f221874d.f198447A;
                if (aVar != null) {
                    C87412m.m108594g(obj, SearchIntents.EXTRA_QUERY);
                    if (!C112551y.m153809i(aVar.f198475q, obj, true)) {
                        aVar.f198475q = obj;
                    }
                    aVar.mo7853r();
                    String str = aVar.f198477s.f198452d;
                    Log.m105924i(str, "query " + obj);
                    return false;
                }
                C87412m.m108603p("adapter");
                throw null;
            }
            C87412m.m108603p("searchET");
            throw null;
        }
    }

    public C75502f(ContactEditLabel contactEditLabel) {
        this.f221873d = new MTimerHandler(new C75503a(contactEditLabel), false);
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f221873d.stopTimer();
        this.f221873d.startTimer(500);
    }
}
