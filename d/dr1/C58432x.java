package dr1;

import a14.C53934p0;
import bl3.C0317e;
import com.tencent.p014mm.plugin.finder.view.FinderJumperView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58780v1;
import kq1.C61135d;
import kq1.C61136e;
import org.json.JSONException;
import org.json.JSONObject;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: dr1.x */
public final class C58432x extends C58780v1.C58781a {

    /* renamed from: b */
    public final /* synthetic */ C58426v f167400b;

    public C58432x(C58426v vVar) {
        this.f167400b = vVar;
    }

    /* renamed from: c */
    public void mo83375c(String str) {
        C58426v vVar = this.f167400b;
        vVar.getClass();
        if (!(str == null || str.length() == 0)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                vVar.f167386c = jSONObject.optString("id");
                String optString = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                vVar.f167387d = optString;
                FinderJumperView finderJumperView = vVar.f167385b;
                if (optString == null) {
                    optString = "";
                }
                finderJumperView.mo4600c(optString, true);
            } catch (JSONException e) {
                Log.m105920e("FinderPostMusicWidget", String.valueOf(e.getMessage()));
            }
        }
    }

    /* renamed from: d */
    public boolean mo83376d(long j, int i) {
        C58426v vVar = this.f167400b;
        String str = ((C61136e) ((C36570n) vVar.f167390g).getValue()).f174047d;
        if (str != null) {
            if (str.length() > 0) {
                C58780v1.f168288a.mo83841c(vVar.f167389f, j, i, str);
                return false;
            }
        }
        C61136e eVar = (C61136e) ((C36570n) vVar.f167390g).getValue();
        C58431w wVar = new C58431w(vVar, j, i);
        eVar.getClass();
        eVar.f174050g = wVar;
        C0317e.launch$default(eVar, (C66212f) null, (C53934p0) null, new C61135d(eVar, (C15601d<? super C61135d>) null), 3, (Object) null);
        return true;
    }
}
