package gf2;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import ef2.C45652b;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C89779i0;
import te3.C51814wc2;

/* renamed from: gf2.a */
public class C45908a implements C11385n {

    /* renamed from: d */
    public C45652b f123881d;

    /* renamed from: e */
    public C89779i0 f123882e;

    /* renamed from: f */
    public MTimerHandler f123883f = new MTimerHandler(new C45909a(), false);

    /* renamed from: g */
    public Activity f123884g;

    /* renamed from: gf2.a$a */
    public class C45909a implements MTimerHandler.CallBack {

        /* renamed from: gf2.a$a$a */
        public class C45910a implements DialogInterface.OnCancelListener {
            public C45910a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123458d(C45908a.this.f123881d);
                C45908a.this.f123882e = null;
            }
        }

        public C45909a() {
        }

        public boolean onTimerExpired() {
            if (C45908a.this.f123884g.isFinishing()) {
                return false;
            }
            C45908a aVar = C45908a.this;
            Activity activity = aVar.f123884g;
            aVar.f123882e = C76879j.m92723Q(activity, activity.getString(C0966R.string.a3h), C45908a.this.f123884g.getString(C0966R.string.a4d), false, true, new C45910a());
            return false;
        }
    }

    public C45908a(Activity activity) {
        this.f123884g = activity;
    }

    /* renamed from: a */
    public void mo71332a(String str, String str2) {
        if (str == null) {
            Log.m105920e("MicroMsg.ViewTWeibo", "null weibo id");
            return;
        }
        C97625j3.m125815e().mo123455a(205, this);
        this.f123881d = new C45652b(Util.nullAsNil(str).replace("http://t.qq.com/", "").trim(), str2);
        C97625j3.m125815e().mo123460f(this.f123881d);
        this.f123883f.startTimer(3000);
    }

    /* renamed from: b */
    public final void mo71333b(String str) {
        this.f123883f.stopTimer();
        C89779i0 i0Var = this.f123882e;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f123884g.getString(C0966R.string.bt9));
        intent.putExtra(V2TXJSAdapterConstants.PUSHER_KEY_ZOOM, true);
        intent.putExtra("vertical_scroll", false);
        C88144b.m109791i(this.f123884g, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C97625j3.m125815e().mo123470p(205, this);
        C45652b bVar = (C45652b) yVar;
        if (i == 0 && i2 == 0) {
            mo71333b(((C51814wc2) bVar.f123447e.f127056b.f127083a).f143962d);
            return;
        }
        if (i != 4) {
            Log.m105920e("MicroMsg.ViewTWeibo", "view weibo failed: " + i + ", " + i2);
        }
        mo71333b("http://t.qq.com/" + bVar.f123448f);
    }
}
