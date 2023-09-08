package hp1;

import android.content.Context;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C40475h;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58684b;
import h81.C59774i;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import org.json.JSONObject;
import pf1.C11920q;
import pf1.C62262d0;
import rs1.C13442s8;
import te3.C52271zj0;

/* renamed from: hp1.b0 */
public final class C8653b0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8657d0 f27809d;

    /* renamed from: e */
    public final /* synthetic */ C52271zj0 f27810e;

    public C8653b0(C8657d0 d0Var, C52271zj0 zj02) {
        this.f27809d = d0Var;
        this.f27810e = zj02;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C8657d0 d0Var = this.f27809d;
        C52271zj0 zj02 = this.f27810e;
        d0Var.getClass();
        if (zj02 != null) {
            FinderJumpInfo finderJumpInfo = zj02.f146020v;
            if (finderJumpInfo != null) {
                int i = finderJumpInfo.jumpinfo_type;
                if (i == 1) {
                    StringBuilder sb = new StringBuilder();
                    FinderContact finderContact = zj02.f146006e;
                    if (finderContact == null || (str2 = finderContact.username) == null) {
                        str2 = "";
                    }
                    sb.append(str2);
                    sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                    sb.append(Util.getUuidRandom());
                    String sb4 = sb.toString();
                    C11920q qVar = new C11920q(finderJumpInfo);
                    qVar.f34836j = sb4;
                    C62262d0.m73170n(C62262d0.f176978a, d0Var.f27814a, qVar, C40475h.CTRL_INDEX, false, (C60905o) null, 0.0f, 56, (Object) null);
                } else if (i == 2) {
                    C62262d0.f176978a.mo87320k(d0Var.f27814a, new C11920q(finderJumpInfo), (C60905o) null);
                }
            } else {
                finderJumpInfo = null;
            }
            if (finderJumpInfo == null) {
                StringBuilder sb5 = new StringBuilder();
                FinderContact finderContact2 = zj02.f146006e;
                if (finderContact2 == null || (str = finderContact2.username) == null) {
                    str = "";
                }
                sb5.append(str);
                sb5.append(XVFSFile.PATH_SEPARATOR_CHAR);
                sb5.append(Util.getUuidRandom());
                String sb6 = sb5.toString();
                C58684b bVar = (C58684b) C86312j.m106911c(C58684b.class);
                Context context = d0Var.f27814a;
                String str3 = zj02.f146014p;
                String str4 = str3 == null ? "" : str3;
                String str5 = zj02.f146015q;
                bVar.mo13270U5(context, str4, str5 == null ? "" : str5, C40475h.CTRL_INDEX, sb6);
                String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
                String str6 = ((C13442s8) C39818r.f106831a.mo62443b(d0Var.f27814a).mo75002a(C13442s8.class)).f38098n;
                String valueOf = String.valueOf(C31543z5.m39451a());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("TopicId", "");
                    jSONObject.put("TopicName", "");
                } catch (Throwable unused) {
                }
                Log.m105924i("Finder.HotSearchInfoDialog", "report21875 sessionId:" + Wb + " contextId:" + str6 + " commentScene:" + 59 + " action:" + 1 + " eid:" + "link_miniprogram" + " udf_kv:" + jSONObject);
                C115669n.INSTANCE.mo160131h(21875, Wb, str6, 59, 1, valueOf, "link_miniprogram", jSONObject.toString());
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
