package sb2;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import nj3.C11184p0;
import org.json.JSONArray;
import org.json.JSONObject;
import p606mm.C47080g;
import p910lj.C76701a;
import z04.C119027c;

/* renamed from: sb2.i */
public final class C13641i implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C13642k f38648d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f38649e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f38650f;

    /* renamed from: g */
    public final /* synthetic */ JSONArray f38651g;

    /* renamed from: h */
    public final /* synthetic */ JSONArray f38652h;

    /* renamed from: i */
    public final /* synthetic */ JSONObject f38653i;

    public C13641i(C13642k kVar, JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject3) {
        this.f38648d = kVar;
        this.f38649e = jSONObject;
        this.f38650f = jSONObject2;
        this.f38651g = jSONArray;
        this.f38652h = jSONArray2;
        this.f38653i = jSONObject3;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C47080g.class;
        int itemId = menuItem.getItemId();
        if (itemId == 1201) {
            C86013q1.m106445f(C86709a0.m107535s().f251806d + "music/cover/");
            this.f38648d.getActivity().finish();
            C76701a.makeText((Context) this.f38648d.getActivity(), (int) C0966R.string.f7932wm, 0).show();
        } else if (itemId == 1202) {
            String str = "music_mv_info_" + C72715f.m85111d("yyyy-MM-dd_HH_mm_ss", System.currentTimeMillis() / ((long) 1000)) + ".json";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("songInfoText", this.f38649e);
                jSONObject.put("mvHeadInfoText", this.f38650f);
                jSONObject.put("mvTrackInfoText", this.f38651g);
                jSONObject.put("mvRefObjInfoText", this.f38652h);
                jSONObject.put("cgiInfo", this.f38653i);
            } finally {
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "saveObj.toString()");
                byte[] bytes = jSONObject2.getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                ((C47080g) C86312j.m106911c(cls)).Kt0(str, bytes, true);
            }
        }
    }
}
