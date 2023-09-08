package e22;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74804o4;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.sdk.platformtools.Util;
import e22.C75516l0;
import gy3.C87412m;
import p910lj.C76701a;

/* renamed from: e22.m0 */
public final class C75521m0 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ C75516l0 f221901d;

    /* renamed from: e */
    public final /* synthetic */ C75516l0.C75517a f221902e;

    public C75521m0(C75516l0 l0Var, C75516l0.C75517a aVar) {
        this.f221901d = l0Var;
        this.f221902e = aVar;
    }

    public void afterTextChanged(Editable editable) {
        int c;
        String str = null;
        int i = 8;
        if (editable != null) {
            String obj = editable.toString();
            ImageView imageView = this.f221902e.f221895b;
            if (imageView != null) {
                if (!Util.isNullOrNil(obj)) {
                    i = 0;
                }
                imageView.setVisibility(i);
                this.f221902e.mo105836a().removeTextChangedListener(this);
                if (!Util.isNullOrNil(obj)) {
                    int f = C45078p0.m49927f(obj);
                    C45078p0.m49925d(this.f221901d.f221890D, obj);
                    int i2 = this.f221901d.f221890D;
                    if (f > i2 && (c = C45078p0.m49924c(i2, obj)) > 0 && c < this.f221901d.f221890D && c < obj.length()) {
                        String substring = obj.substring(0, c + 1);
                        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        this.f221902e.mo105836a().setText(substring);
                        this.f221902e.mo105836a().setSelection(this.f221902e.mo105836a().getText().length());
                        C74804o4.f219938a.mo103976a();
                        Context context = this.f221902e.mo105836a().getContext();
                        Context context2 = this.f221902e.mo105836a().getContext();
                        if (context2 != null) {
                            str = context2.getString(C0966R.string.g2p, new Object[]{Integer.valueOf(this.f221901d.f221890D / 2)});
                        }
                        C76701a.makeText(context, (CharSequence) str, 0).show();
                    }
                }
                C75516l0 l0Var = this.f221901d;
                int i3 = C75516l0.f221887H;
                l0Var.getClass();
                this.f221902e.mo105836a().addTextChangedListener(this);
                this.f221902e.mo105836a().setSelection(this.f221902e.mo105836a().getText().length());
                return;
            }
            C87412m.m108603p("mDeleteBtn");
            throw null;
        }
        ImageView imageView2 = this.f221902e.f221895b;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        } else {
            C87412m.m108603p("mDeleteBtn");
            throw null;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C75516l0.C75520c cVar = this.f221901d.f221892F;
        if (cVar != null) {
            cVar.mo95165a(String.valueOf(charSequence));
        } else {
            C87412m.m108603p("textListener");
            throw null;
        }
    }
}
