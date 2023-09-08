package fy1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.FavUrlTask;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5984s1;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import gc1.C87177b;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53099d;
import te3.C50187kw2;

/* renamed from: fy1.j */
public class C45858j extends C45845a {

    /* renamed from: b */
    public C75018a.C75024d f123802b = new C45860b(this);

    /* renamed from: fy1.j$a */
    public class C45859a extends C53099d {
        public C45859a(C45858j jVar) {
        }

        /* renamed from: a */
        public JSONObject mo14701a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "favorite");
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        /* renamed from: b */
        public String mo14702b() {
            return "menu:share:appmessage";
        }
    }

    /* renamed from: fy1.j$b */
    public class C45860b implements C75018a.C75024d {
        public C45860b(C45858j jVar) {
        }

        /* renamed from: a */
        public void mo7429a() {
            FavUrlTask favUrlTask = new FavUrlTask();
            favUrlTask.f283014f = 2;
            favUrlTask.mo114395c();
        }
    }

    public C45858j(int i) {
        super(i);
    }

    /* renamed from: b */
    public void mo71307b(Context context, C43658n nVar, C50187kw2 kw22) {
        Bundle bundle = new Bundle();
        bundle.putLong("msg_id", nVar.f148261n.getLong("msg_id", Long.MIN_VALUE));
        bundle.putString("sns_local_id", nVar.f148261n.getString("sns_local_id"));
        bundle.putInt("news_svr_id", nVar.f148261n.getInt("news_svr_id", 0));
        bundle.putString("news_svr_tweetid", nVar.f148261n.getString("news_svr_tweetid"));
        bundle.putInt("message_index", nVar.f148261n.getInt("message_index", 0));
        String v = nVar.mo67943v();
        String t = nVar.mo67941t();
        bundle.putString("rawUrl", t);
        if (!Util.isNullOrNil(t) && t.endsWith("#rd")) {
            String substring = t.substring(0, t.length() - 3);
            if (!Util.isNullOrNil(v) && !v.startsWith(substring)) {
                bundle.putString("rawUrl", v);
                bundle.putLong("msg_id", Long.MIN_VALUE);
            }
        } else if (!Util.isNullOrNil(v) && !v.startsWith(t)) {
            bundle.putString("rawUrl", v);
            bundle.putLong("msg_id", Long.MIN_VALUE);
            bundle.putString("sns_local_id", "");
        }
        bundle.putString("preChatName", nVar.f148261n.getString("preChatName"));
        bundle.putInt("preMsgIndex", nVar.f148261n.getInt("preMsgIndex", 0));
        bundle.putString("prePublishId", nVar.f148261n.getString("prePublishId"));
        bundle.putString("preUsername", nVar.f148261n.getString("preUsername"));
        FavUrlTask favUrlTask = new FavUrlTask();
        favUrlTask.f283014f = 1;
        favUrlTask.f283015g = bundle;
        favUrlTask.mo114396f();
        if (favUrlTask.f283016h) {
            C5984s1.f22236f = 1;
            nVar.f148259i.mo73815b(new C45859a(this));
            return;
        }
        ((C87177b) C86312j.m106911c(C87177b.class)).mo121615I2(favUrlTask.f283018j, 35, (Activity) context, this.f123802b);
    }
}
