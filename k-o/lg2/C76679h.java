package lg2;

import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recharge.p093ui.form.InstantAutoCompleteTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kg2.C76574a;

/* renamed from: lg2.h */
public class C76679h implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ InstantAutoCompleteTextView f224367d;

    /* renamed from: e */
    public final /* synthetic */ C76681j f224368e;

    public C76679h(C76681j jVar, InstantAutoCompleteTextView instantAutoCompleteTextView) {
        this.f224368e = jVar;
        this.f224367d = instantAutoCompleteTextView;
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            this.f224367d.setHintTextColor(view.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
            C76681j jVar = this.f224368e;
            C76574a aVar = jVar.f224371b;
            if (aVar != null && aVar.f224106d == 2 && !jVar.f224374e) {
                Log.m105918d("MicroMsg.CommonHintViewConfig", "clear input");
                EditText editText = this.f224368e.f224372c.f203635f;
                if (editText != null) {
                    editText.setText("");
                }
                this.f224368e.f224371b = null;
            } else if (jVar.f224374e) {
                jVar.f224374e = false;
            }
            if (Util.isNullOrNil(this.f224367d.getText().toString())) {
                this.f224367d.showDropDown();
            }
        }
    }
}
