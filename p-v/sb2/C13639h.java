package sb2;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import nj3.C11184p0;
import org.json.JSONArray;
import org.json.JSONObject;
import p910lj.C76701a;

/* renamed from: sb2.h */
public final class C13639h implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f38641d;

    /* renamed from: e */
    public final /* synthetic */ C13642k f38642e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f38643f;

    /* renamed from: g */
    public final /* synthetic */ JSONArray f38644g;

    /* renamed from: h */
    public final /* synthetic */ JSONArray f38645h;

    /* renamed from: i */
    public final /* synthetic */ JSONObject f38646i;

    public C13639h(JSONObject jSONObject, C13642k kVar, JSONObject jSONObject2, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject3) {
        this.f38641d = jSONObject;
        this.f38642e = kVar;
        this.f38643f = jSONObject2;
        this.f38644g = jSONArray;
        this.f38645h = jSONArray2;
        this.f38646i = jSONObject3;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        switch (menuItem.getItemId()) {
            case 1101:
                ClipboardHelper.setText(this.f38641d.toString());
                C76701a.makeText((Context) this.f38642e.getActivity(), (int) C0966R.string.f7938wv, 0).show();
                return;
            case 1102:
                ClipboardHelper.setText(this.f38643f.toString());
                C76701a.makeText((Context) this.f38642e.getActivity(), (int) C0966R.string.f7938wv, 0).show();
                return;
            case 1103:
                ClipboardHelper.setText(this.f38644g.toString());
                C76701a.makeText((Context) this.f38642e.getActivity(), (int) C0966R.string.f7938wv, 0).show();
                return;
            case 1104:
                ClipboardHelper.setText(this.f38645h.toString());
                C76701a.makeText((Context) this.f38642e.getActivity(), (int) C0966R.string.f7938wv, 0).show();
                return;
            case 1105:
                ClipboardHelper.setText(this.f38646i.toString());
                C76701a.makeText((Context) this.f38642e.getActivity(), (int) C0966R.string.f7938wv, 0).show();
                return;
            default:
                return;
        }
    }
}
