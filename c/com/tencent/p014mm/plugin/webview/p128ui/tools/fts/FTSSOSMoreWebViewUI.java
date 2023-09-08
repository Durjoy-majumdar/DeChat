package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.websearch.widget.SOSEditTextView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.vendor.MIUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import org.json.JSONArray;
import org.json.JSONObject;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSMoreWebViewUI */
public class FTSSOSMoreWebViewUI extends BaseSOSWebViewUI {

    /* renamed from: I3 */
    public int f119053I3;

    /* renamed from: J3 */
    public View f119054J3;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSMoreWebViewUI$a */
    public class C43949a implements View.OnTouchListener {
        public C43949a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            FTSSOSMoreWebViewUI.this.f118812u3.mo70335c();
            FTSSOSMoreWebViewUI.this.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSMoreWebViewUI$b */
    public class C43950b implements Runnable {
        public C43950b() {
        }

        public void run() {
            FTSSOSMoreWebViewUI.this.f118812u3.mo70355k();
            FTSSOSMoreWebViewUI.this.f118812u3.mo70361q();
        }
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
        super.mo3000D(z);
        if (!z) {
            View view = this.f118808q3;
            view.setPadding(this.f119053I3, 0, view.getPaddingRight(), 0);
            this.f118812u3.mo70338f();
        }
        this.f118812u3.mo70337e();
    }

    /* renamed from: ca */
    public String mo68435ca() {
        int i = this.f118882a3;
        int i2 = (i != 8 || !this.f118874S2) ? i != 1 ? i != 2 ? i != 8 ? i != 16 ? i != 64 ? i != 128 ? (i == 256 || i == 384) ? C0966R.string.f2s : i != 512 ? i != 1024 ? -1 : C0966R.string.f360826f33 : C0966R.string.f360825f32 : C0966R.string.f2t : C0966R.string.f7674nk : C0966R.string.f360827f34 : C0966R.string.f36 : C0966R.string.ih5 : C0966R.string.ih6 : C0966R.string.f37;
        int i3 = 0;
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(MMApplicationContext.getContext().getResources().getString(C0966R.string.a2p));
            int i4 = this.f118882a3;
            String str = "";
            try {
                Bundle bundle = new Bundle();
                bundle.putString("key", "educationTab");
                Bundle gv = this.f118511a1.mo68134gv(2, bundle);
                String string = gv.getString("result");
                String string2 = gv.getString("result_1");
                if (string2 != null) {
                    string = string2;
                }
                JSONArray optJSONArray = new JSONObject(string).optJSONArray("items");
                if (optJSONArray != null) {
                    while (true) {
                        if (i3 >= optJSONArray.length()) {
                            break;
                        }
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                        if (optJSONObject.optInt("businessType") == i4) {
                            str = optJSONObject.optString("hotword");
                            break;
                        }
                        i3++;
                    }
                }
            } catch (Exception unused) {
            }
            sb.append(str);
            return sb.toString();
        }
        return MMApplicationContext.getContext().getResources().getString(C0966R.string.ih4, new Object[]{MMApplicationContext.getContext().getResources().getString(i2)});
    }

    /* renamed from: d8 */
    public int mo63387d8() {
        return (!C11171e.m11046c(23) || MIUI.isMIUIV8()) ? getActionbarColor() : getResources().getColor(C0966R.color.al6);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c5d;
    }

    /* renamed from: la */
    public void mo68444la() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f119054J3 = findViewById(C0966R.C0970id.lmr);
        SOSEditTextView sOSEditTextView = this.f118812u3;
        sOSEditTextView.getEditText().setOnFocusChangeListener(sOSEditTextView.f122154G);
        this.f118812u3.mo70337e();
        this.f118812u3.mo70338f();
        this.f119053I3 = C76577a.m92151b(this, 48);
        if (this.f118880Y2 == 24) {
            View view = this.f119054J3;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        findViewById(C0966R.C0970id.iwc).setOnTouchListener(new C43949a());
        if (getIntent() != null && getIntent().getBooleanExtra("ftsneedkeyboard", false)) {
            getContentView().postDelayed(new C43950b(), 128);
        }
        mo68302p9(getResources().getColor(C0966R.color.al6), !C85875k4.m106211z());
        ImageButton clearBtn = this.f118812u3.getClearBtn();
        if (clearBtn != null) {
            clearBtn.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        }
    }

    /* renamed from: pa */
    public void mo68448pa() {
        super.mo68448pa();
        View view = this.f119054J3;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onWebViewPageLoaded", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onWebViewPageLoaded", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: y */
    public boolean mo3009y() {
        this.f118812u3.mo70337e();
        View view = this.f119054J3;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onSearchKeyDown", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onSearchKeyDown", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        super.mo3009y();
        return true;
    }
}
