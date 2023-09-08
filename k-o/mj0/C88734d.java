package mj0;

import com.tencent.magicbrush.MBRuntime;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo;
import kr0.C88267e;
import org.json.JSONObject;
import p284zb.C91635f;
import p284zb.C91640i;

/* renamed from: mj0.d */
public class C88734d extends C88267e {
    public C88734d() {
        super((Class<? extends C91640i<? extends C91635f>>) C88732a.class);
    }

    /* renamed from: R0 */
    public MBRuntime mo123174R0() {
        C91640i<? extends C91635f> iVar = this.f262593H;
        if (iVar instanceof C88732a) {
            return ((C88732a) iVar).mo120910U();
        }
        return null;
    }

    /* renamed from: W */
    public void mo114331W(JSONObject jSONObject) {
        super.mo114331W(jSONObject);
        C91640i<? extends C91635f> iVar = this.f262593H;
        if (iVar instanceof C88732a) {
            WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = ((C88732a) iVar).f256108E;
            mo114881c0(jSONObject, "isSnapshoting", Boolean.FALSE);
            if (wxaPkgV8SnapshotInfo != null) {
                mo114881c0(jSONObject, "snapshotMetaInfo", wxaPkgV8SnapshotInfo.f247277p);
            }
        }
    }
}
