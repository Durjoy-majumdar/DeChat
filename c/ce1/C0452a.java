package ce1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dp1.C58414w0;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.Iterator;
import md1.C10779c;
import o40.C61926c;
import od1.C11392a;
import org.json.JSONObject;
import rd1.C12974b;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C51270sn1;
import zc1.C66785b;

/* renamed from: ce1.a */
public class C0452a extends C11392a<C51270sn1> {

    /* renamed from: A */
    public String f1080A = "";

    /* renamed from: B */
    public long f1081B = C31543z5.m39453c();

    /* renamed from: C */
    public String f1082C = (C66785b.f191882e.mo90662O5() + '-' + this.f1081B);

    /* renamed from: D */
    public String f1083D = "";

    /* renamed from: E */
    public String f1084E = "";

    /* renamed from: F */
    public JSONObject f1085F = new JSONObject();

    /* renamed from: G */
    public C49712hj1 f1086G;

    /* renamed from: H */
    public int f1087H = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0452a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r1 = (r1 = r1.f141633w).f146006e;
     */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo492g3(pe3.C47465a r1) {
        /*
            r0 = this;
            te3.sn1 r1 = (te3.C51270sn1) r1
            super.mo492g3(r1)
            if (r1 == 0) goto L_0x0012
            te3.zj0 r1 = r1.f141633w
            if (r1 == 0) goto L_0x0012
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.f146006e
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = r1.username
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            if (r1 != 0) goto L_0x0017
            java.lang.String r1 = ""
        L_0x0017:
            r0.f1080A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ce1.C0452a.mo492g3(pe3.a):void");
    }

    /* renamed from: l3 */
    public C10779c mo310l3() {
        return new C12974b((C51270sn1) this.f33564d, getActivity());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f141633w;
     */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo311m3() {
        /*
            r1 = this;
            T r0 = r1.f33564d
            te3.sn1 r0 = (te3.C51270sn1) r0
            if (r0 == 0) goto L_0x000d
            te3.zj0 r0 = r0.f141633w
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.f146007f
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = ""
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ce1.C0452a.mo311m3():java.lang.String");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("start_time", -1);
        String stringExtra = getIntent().getStringExtra("vst_id");
        if (longExtra > 0) {
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                this.f1081B = longExtra;
                this.f1082C = stringExtra;
            }
        }
    }

    public void onStop() {
        super.onStop();
        C39818r rVar = C39818r.f106831a;
        this.f1086G = ((C13442s8) rVar.mo62443b(getContext()).mo75002a(C13442s8.class)).mo12861q3();
        this.f1084E = C61926c.m72691p(getIntent().getLongExtra("key_feed_report_id", -1));
        String stringExtra = getIntent().getStringExtra("key_activity_profile_src_type");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        this.f1083D = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("key_extra_report_info");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        int intExtra = getIntent().getIntExtra("key_enter_scene", 0);
        if (C87412m.m108589b(this.f1083D, "1")) {
            this.f1085F.put("src_type", this.f1083D).put("vst_id", this.f1082C).put("src_ext_info", new JSONObject().put("feedid", this.f1084E));
        } else if (C87412m.m108589b(this.f1083D, "2")) {
            this.f1085F.put("src_type", this.f1083D).put("vst_id", this.f1082C).put("src_ext_info", new JSONObject().put("finderusername", this.f1080A));
        } else {
            this.f1085F.put("src_type", this.f1083D).put("vst_id", this.f1082C);
        }
        if (intExtra == 15) {
            this.f1085F = new JSONObject(str);
        }
        JSONObject jSONObject = ((C0465g) rVar.mo62444c(getActivity()).mo75002a(C0465g.class)).f1131V;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            C87412m.m108593f(keys, "it.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                this.f1085F.put(next, jSONObject.opt(next));
            }
        }
        int i = this.f1087H;
        if (i != -1) {
            this.f1085F.put("activity_entry_type", i);
        }
        C58414w0 w0Var = C58414w0.f167348a;
        w0Var.mo83274a(getContext(), this.f1085F, true, 0, this.f1081B, this.f1086G);
        this.f1085F = new JSONObject();
        if (C87412m.m108589b(this.f1083D, "1")) {
            this.f1085F.put("src_type", this.f1083D).put("vst_id", this.f1082C).put("src_ext_info", new JSONObject().put("feedid", this.f1084E));
        } else if (C87412m.m108589b(this.f1083D, "2")) {
            this.f1085F.put("src_type", this.f1083D).put("vst_id", this.f1082C).put("src_ext_info", new JSONObject().put("finderusername", this.f1080A));
        } else {
            this.f1085F.put("src_type", this.f1083D).put("vst_id", this.f1082C);
        }
        if (intExtra == 15) {
            this.f1085F = new JSONObject(str);
        }
        int i2 = this.f1087H;
        if (i2 != -1) {
            this.f1085F.put("activity_entry_type", i2);
        }
        C58414w0 w0Var2 = w0Var;
        w0Var2.mo83274a(getContext(), this.f1085F, false, C31543z5.m39453c() - this.f1081B, -1, this.f1086G);
    }
}
